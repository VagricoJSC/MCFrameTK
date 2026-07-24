package mcframe.clientMABS.MABSP1120;

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
import mcframe.clientMABS.MABSP1120.MABSP_SlsItmReg_MC.MA_MABSL1120_Srch01Caller;
import mcframe.clientMABS.MABSP1120.MABSP_SlsItmReg_MC.MA_MABSL1120_Upd01Caller;

/**
 * 画面"MABSP_SlsItmReg"パネルクラスです。<p>
 *
 * 販売品関連の検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_SlsItmReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP1120";

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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCCheckBox Hdr_sundry_itm_flg = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_dec_place = null;
	/**
	 * Sales 販売.<p>
	 *
	 */
	public MCLabel Hdr_sls_lbl = null;
	/**
	 * Sales 販売.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_flg = null;
	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_input_flg = null;
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
	public MCLabel Wrk1SetDtHdr_st_ym_Label = null;
	/**
	 * Application start month 適用開始年月.<p>
	 *
	 */
	public MCDateField Wrk1SetDtHdr_st_ym = null;
	public MCLabel Wrk1SetDtHdr_end_ym_Label = null;
	/**
	 * Application end month 適用終了年月.<p>
	 *
	 */
	public MCDateField Wrk1SetDtHdr_end_ym = null;
	/**
	 * Applied month update 適用年月反映.<p>
	 *
	 */
	public MCButton Wrk1SetDtHdr_set_dt = null;
	// [Wrk1Dtl]ブロック関連のField定義
	public MCPanel Wrk1DtlPanel = null;
	public MCScrollPane Wrk1DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1120.Wrk1DtlR> Wrk1DtlTable = null;
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
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_spln_itm_cd = null;
	/**
	 * Plan item name 計画品目名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_spln_itm_nm = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_dpt_nm = null;
	/**
	 * Application start month 適用開始年月.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_st_ym_disp = null;
	/**
	 * Application end month 適用終了年月.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_end_ym_disp = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk1Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_st_ym_key;// [Wrk1Dtl]の[dt_p.st_dt_key]を[columnWrk1Dtl_st_ym_key]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_st_ym;// [Wrk1Dtl]の[dt_p.st_dt]を[columnWrk1Dtl_st_ym]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_end_ym;// [Wrk1Dtl]の[dt_p.end_dt]を[columnWrk1Dtl_end_ym]としてエイリアス定義。
	/**
	 * Calculation ratio 計算比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_calc_rate = null;
	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_calc_seq = null;
	/**
	 * Unit price unit cd. 単価単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upri_unit_cd = null;
	/**
	 * Unit price unit name 単価単位名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upri_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_qty_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_lot_qty;// [Wrk1Dtl]の[qty_p.qty]を[columnWrk1Dtl_lot_qty]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMABS.MABSP1120.Wrk2DtlR> Wrk2DtlTable = null;
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
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_to_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_to_lg_grp_nm = null;
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_itm_ship_grp_cd = null;
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sls_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sls_dpt_nm = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ship_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk2Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_st_dt_key;// [Wrk2Dtl]の[dt_p.st_dt_key]を[columnWrk2Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_st_dt;// [Wrk2Dtl]の[dt_p.st_dt]を[columnWrk2Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_end_dt;// [Wrk2Dtl]の[dt_p.end_dt]を[columnWrk2Dtl_end_dt]としてエイリアス定義。
	/**
	 * Demand split ratio 需要分割比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_dmnd_div_ratio = null;
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
	// [Wrk3SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk3SetDtHdrPanel = null;
	// [Wrk3SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk3SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk3SetDtHdr_st_dt = null;
	public MCLabel Wrk3SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk3SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk3SetDtHdr_set_dt = null;
	// [Wrk3Dtl]ブロック関連のField定義
	public MCPanel Wrk3DtlPanel = null;
	public MCScrollPane Wrk3DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1120.Wrk3DtlR> Wrk3DtlTable = null;
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_bp_nm = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_sppl_flg = null;
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_cst_flg = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk3Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_st_dt_key;// [Wrk3Dtl]の[dt_p.st_dt_key]を[columnWrk3Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_st_dt;// [Wrk3Dtl]の[dt_p.st_dt]を[columnWrk3Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_end_dt;// [Wrk3Dtl]の[dt_p.end_dt]を[columnWrk3Dtl_end_dt]としてエイリアス定義。
	/**
	 * BP item cd. 取引先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_bp_itm_cd = null;
	/**
	 * BP item name 取引先品名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_bp_itm_nm = null;
	/**
	 * Default デフォルト.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_def_flg = null;
	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pf_grp_cd = null;
	/**
	 * Purchase forecast group name 購買内示グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pf_grp_nm = null;
	/**
	 * Purchase forecast firm 購買内示確定.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pf_fix_flg = null;
	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_purc_commit_flg = null;
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
	public MCTable2<mcframe.clientMABS.MABSP1120.Wrk4DtlR> Wrk4DtlTable = null;
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
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_nm = null;
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_str_ln_tgt_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_wg_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_loc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk4Dtl_str_ln_p_PPanel;
	public MCColumnConfig columnWrk4Dtl_str_ln_cd;// [Wrk4Dtl]の[str_ln_p.str_ln_cd]を[columnWrk4Dtl_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_str_ln_nm;// [Wrk4Dtl]の[str_ln_p.str_ln_nm]を[columnWrk4Dtl_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_str_ln_cd_none_flg;// [Wrk4Dtl]の[str_ln_p.str_ln_cd_none_flg]を[columnWrk4Dtl_str_ln_cd_none_flg]としてエイリアス定義。
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	
	/** [MA_MABSL1120_Srch01]のCallerの作成 */
	protected MABSP_SlsItmReg_MC.MA_MABSL1120_Srch01Caller createMA_MABSL1120_Srch01() {
		MABSP_SlsItmReg_MC.MA_MABSL1120_Srch01Caller<MABSP_SlsItmReg, MA_MABSL1120_Srch01Bridge>
		caller = ((MABSP_SlsItmReg_MC)this).new MA_MABSL1120_Srch01Caller<MABSP_SlsItmReg, MA_MABSL1120_Srch01Bridge>(
					(MABSP_SlsItmReg)this, new MA_MABSL1120_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL1120_Srch01]の呼び出し */
	protected void callMA_MABSL1120_Srch01() {
		MCCaller caller = createMA_MABSL1120_Srch01();
		caller.exec();
	}
	/** [MA_MABSL1120_Upd01]のCallerの作成 */
	protected MABSP_SlsItmReg_MC.MA_MABSL1120_Upd01Caller createMA_MABSL1120_Upd01() {
		MABSP_SlsItmReg_MC.MA_MABSL1120_Upd01Caller<MABSP_SlsItmReg, MA_MABSL1120_Upd01Bridge>
		caller = ((MABSP_SlsItmReg_MC)this).new MA_MABSL1120_Upd01Caller<MABSP_SlsItmReg, MA_MABSL1120_Upd01Bridge>(
					(MABSP_SlsItmReg)this, new MA_MABSL1120_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL1120_Upd01]の呼び出し */
	protected void callMA_MABSL1120_Upd01() {
		MCCaller caller = createMA_MABSL1120_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1120.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1120.HdrR aHdrR;
	/** [HdrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1120.HdrR> aHdrAllL;
	/** [Wrk1SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR aWrk1SetDtHdrR;
	/** [Wrk1Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR> aWrk1DtlL;
	/** [Wrk2SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR aWrk2SetDtHdrR;
	/** [Wrk2Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR> aWrk2DtlL;
	/** [Wrk3SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR aWrk3SetDtHdrR;
	/** [Wrk3Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR> aWrk3DtlL;
	/** [Wrk4Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR> aWrk4DtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP1120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1120.CndR createCndR() {
		return mcframe.clientMABS.MABSP1120.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABS.MABSP1120.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP1120.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP1120.HdrR createHdrR() {
		return mcframe.clientMABS.MABSP1120.HdrR.create();
	}

	/**
	 * コピーによってaHdrAllLを設定します。
	 *
	 * aHdrAllLのインスタンスは変更されません。
	 *
	 * @param dataset HdrAllL
	 */
	public void setHdrAllL(MCList<mcframe.clientMABS.MABSP1120.HdrR> aList) {
		if (getHdrAllL() != aList) {
			getHdrAllL().setAll(aList);
		}
	}

	/**
	 * [HdrAll]ブロックのコンテナaHdrAllLを返します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.HdrR> getHdrAllL() {
		return aHdrAllL;
	}

	/**
	 * aHdrAllRを作成します。
	 *
	 * @return HdrAllR
	 */
	public mcframe.clientMABS.MABSP1120.HdrR createHdrAllR() {
		return mcframe.clientMABS.MABSP1120.HdrR.create();
	}

	/**
	 * aHdrAllLを作成します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.HdrR> createHdrAllL() {
		return MCList.create(mcframe.clientMABS.MABSP1120.HdrR.class);
	}

	/**
	 * 項目コピーによってaWrk1SetDtHdrRを設定します。
	 *
	 * aWrk1SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk1SetDtHdrR
	 */
	public void setWrk1SetDtHdrR(mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk1SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk1SetDtHdr]ブロックのコンテナaWrk1SetDtHdrRを返します。
	 *
	 * @return Wrk1SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR getWrk1SetDtHdrR() {
		return aWrk1SetDtHdrR;
	}

	/**
	 * aWrk1SetDtHdrRを作成します。
	 *
	 * @return Wrk1SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR createWrk1SetDtHdrR() {
		return mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk1DtlLを設定します。
	 *
	 * aWrk1DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk1DtlL
	 */
	public void setWrk1DtlL(MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR> aList) {
		if (getWrk1DtlL() != aList) {
			getWrk1DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk1Dtl]ブロックのコンテナaWrk1DtlLを返します。
	 *
	 * @return Wrk1DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR> getWrk1DtlL() {
		return aWrk1DtlL;
	}

	/**
	 * aWrk1DtlRを作成します。
	 *
	 * @return Wrk1DtlR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk1DtlR createWrk1DtlR() {
		return mcframe.clientMABS.MABSP1120.Wrk1DtlR.create();
	}

	/**
	 * aWrk1DtlLを作成します。
	 *
	 * @return Wrk1DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR> createWrk1DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.class);
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
	public void setWrk2SetDtHdrR(mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk2SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk2SetDtHdr]ブロックのコンテナaWrk2SetDtHdrRを返します。
	 *
	 * @return Wrk2SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR getWrk2SetDtHdrR() {
		return aWrk2SetDtHdrR;
	}

	/**
	 * aWrk2SetDtHdrRを作成します。
	 *
	 * @return Wrk2SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR createWrk2SetDtHdrR() {
		return mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk2DtlLを設定します。
	 *
	 * aWrk2DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk2DtlL
	 */
	public void setWrk2DtlL(MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR> aList) {
		if (getWrk2DtlL() != aList) {
			getWrk2DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk2Dtl]ブロックのコンテナaWrk2DtlLを返します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR> getWrk2DtlL() {
		return aWrk2DtlL;
	}

	/**
	 * aWrk2DtlRを作成します。
	 *
	 * @return Wrk2DtlR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk2DtlR createWrk2DtlR() {
		return mcframe.clientMABS.MABSP1120.Wrk2DtlR.create();
	}

	/**
	 * aWrk2DtlLを作成します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR> createWrk2DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1120.Wrk2DtlR.class);
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
	 * 項目コピーによってaWrk3SetDtHdrRを設定します。
	 *
	 * aWrk3SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk3SetDtHdrR
	 */
	public void setWrk3SetDtHdrR(mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk3SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk3SetDtHdr]ブロックのコンテナaWrk3SetDtHdrRを返します。
	 *
	 * @return Wrk3SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR getWrk3SetDtHdrR() {
		return aWrk3SetDtHdrR;
	}

	/**
	 * aWrk3SetDtHdrRを作成します。
	 *
	 * @return Wrk3SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR createWrk3SetDtHdrR() {
		return mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk3DtlLを設定します。
	 *
	 * aWrk3DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk3DtlL
	 */
	public void setWrk3DtlL(MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR> aList) {
		if (getWrk3DtlL() != aList) {
			getWrk3DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk3Dtl]ブロックのコンテナaWrk3DtlLを返します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR> getWrk3DtlL() {
		return aWrk3DtlL;
	}

	/**
	 * aWrk3DtlRを作成します。
	 *
	 * @return Wrk3DtlR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk3DtlR createWrk3DtlR() {
		return mcframe.clientMABS.MABSP1120.Wrk3DtlR.create();
	}

	/**
	 * aWrk3DtlLを作成します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR> createWrk3DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1120.Wrk3DtlR.class);
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
	public void setWrk4DtlL(MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR> aList) {
		if (getWrk4DtlL() != aList) {
			getWrk4DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk4Dtl]ブロックのコンテナaWrk4DtlLを返します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR> getWrk4DtlL() {
		return aWrk4DtlL;
	}

	/**
	 * aWrk4DtlRを作成します。
	 *
	 * @return Wrk4DtlR
	 */
	public mcframe.clientMABS.MABSP1120.Wrk4DtlR createWrk4DtlR() {
		return mcframe.clientMABS.MABSP1120.Wrk4DtlR.create();
	}

	/**
	 * aWrk4DtlLを作成します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR> createWrk4DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1120.Wrk4DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getWrk3SetDtHdrR())) ret.add(getWrk3SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk3DtlL())) ret.add(getWrk3DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk4DtlL())) ret.add(getWrk4DtlL());
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
		if(aCnt == getWrk3SetDtHdrR()) return "Wrk3SetDtHdr";
		if(aCnt == getWrk3DtlL()) return "Wrk3Dtl";
		if(aCnt == getWrk4DtlL()) return "Wrk4Dtl";
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
		if(bId.equals("Wrk3SetDtHdr")) return getWrk3SetDtHdrR();
		if(bId.equals("Wrk3Dtl")) return getWrk3DtlL();
		if(bId.equals("Wrk4Dtl")) return getWrk4DtlL();
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
		ret.add(Wrk3SetDtHdrPanel);
		ret.add(Wrk3DtlPanel);
		ret.add(Wrk3DtlBtnPanel);
		ret.add(Wrk4Panel);
		ret.add(Wrk4DtlPanel);
		ret.add(Wrk4DtlBtnPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_SlsItmReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aHdrAllL = createHdrAllL();
		aWrk1SetDtHdrR = createWrk1SetDtHdrR();
		aWrk1DtlL = createWrk1DtlL();
		aWrk2SetDtHdrR = createWrk2SetDtHdrR();
		aWrk2DtlL = createWrk2DtlL();
		aWrk3SetDtHdrR = createWrk3SetDtHdrR();
		aWrk3DtlL = createWrk3DtlL();
		aWrk4DtlL = createWrk4DtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_SlsItmReg_MC_A(String name) {
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
		aWrk3SetDtHdrR = createWrk3SetDtHdrR();
		aWrk3DtlL = createWrk3DtlL();
		createWrk3DtlTable();
		Wrk3DtlTable.setRowName(name);
		aWrk4DtlL = createWrk4DtlL();
		createWrk4DtlTable();
		Wrk4DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_SlsItmReg_MC.jbCreateScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateTop((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateFold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateCnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateCtrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateTbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateDtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateWrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbCreateBtn((MABSP_SlsItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_SlsItmReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_SlsItmReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_SlsItmReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_SlsItmReg p) {
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
	protected static void jbCreateCtrl(MABSP_SlsItmReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABSP_SlsItmReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABSP_SlsItmReg p) {
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
	protected static void jbCreateDtlTab(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk1SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1SetDtHdr(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk1Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Dtl(MABSP_SlsItmReg p) {
		p.Wrk1Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.$itm_p);
		p.Wrk1Dtl_itm_p_PPanel.setName("Wrk1Dtl.itm_p");
		p.columnWrk1Dtl_itm_cd = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk1Dtl_itm_cd.addAliasName("Wrk1Dtl.itm_cd", p);
		p.columnWrk1Dtl_itm_sub1 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk1Dtl_itm_sub1.addAliasName("Wrk1Dtl.itm_sub1", p);
		p.columnWrk1Dtl_itm_sub2 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk1Dtl_itm_sub2.addAliasName("Wrk1Dtl.itm_sub2", p);
		p.columnWrk1Dtl_itm_sub3 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk1Dtl_itm_sub3.addAliasName("Wrk1Dtl.itm_sub3", p);
		p.Wrk1Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.$dt_p);
		p.Wrk1Dtl_dt_p_PPanel.setName("Wrk1Dtl.dt_p");
		p.columnWrk1Dtl_st_ym_key = p.Wrk1Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk1Dtl_st_ym_key.addAliasName("Wrk1Dtl.st_ym_key", p);
		p.columnWrk1Dtl_st_ym = p.Wrk1Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk1Dtl_st_ym.addAliasName("Wrk1Dtl.st_ym", p);
		p.columnWrk1Dtl_end_ym = p.Wrk1Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk1Dtl_end_ym.addAliasName("Wrk1Dtl.end_ym", p);
		p.Wrk1Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.$qty_p);
		p.Wrk1Dtl_qty_p_PPanel.setName("Wrk1Dtl.qty_p");
		p.columnWrk1Dtl_lot_qty = p.Wrk1Dtl_qty_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_lot_qty.addAliasName("Wrk1Dtl.lot_qty", p);
	}

	/**
	 * [Wrk1DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1DtlBtn(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2SetDtHdr(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk2Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2Dtl(MABSP_SlsItmReg p) {
		p.Wrk2Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1120.Wrk2DtlR.$itm_p);
		p.Wrk2Dtl_itm_p_PPanel.setName("Wrk2Dtl.itm_p");
		p.columnWrk2Dtl_itm_cd = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk2Dtl_itm_cd.addAliasName("Wrk2Dtl.itm_cd", p);
		p.columnWrk2Dtl_itm_sub1 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk2Dtl_itm_sub1.addAliasName("Wrk2Dtl.itm_sub1", p);
		p.columnWrk2Dtl_itm_sub2 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk2Dtl_itm_sub2.addAliasName("Wrk2Dtl.itm_sub2", p);
		p.columnWrk2Dtl_itm_sub3 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk2Dtl_itm_sub3.addAliasName("Wrk2Dtl.itm_sub3", p);
		p.Wrk2Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1120.Wrk2DtlR.$dt_p);
		p.Wrk2Dtl_dt_p_PPanel.setName("Wrk2Dtl.dt_p");
		p.columnWrk2Dtl_st_dt_key = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk2Dtl_st_dt_key.addAliasName("Wrk2Dtl.st_dt_key", p);
		p.columnWrk2Dtl_st_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk2Dtl_st_dt.addAliasName("Wrk2Dtl.st_dt", p);
		p.columnWrk2Dtl_end_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk2Dtl_end_dt.addAliasName("Wrk2Dtl.end_dt", p);
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2DtlBtn(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk3SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3SetDtHdr(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk3Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Dtl(MABSP_SlsItmReg p) {
		p.Wrk3Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1120.Wrk3DtlR.$itm_p);
		p.Wrk3Dtl_itm_p_PPanel.setName("Wrk3Dtl.itm_p");
		p.columnWrk3Dtl_itm_cd = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk3Dtl_itm_cd.addAliasName("Wrk3Dtl.itm_cd", p);
		p.columnWrk3Dtl_itm_sub1 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk3Dtl_itm_sub1.addAliasName("Wrk3Dtl.itm_sub1", p);
		p.columnWrk3Dtl_itm_sub2 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk3Dtl_itm_sub2.addAliasName("Wrk3Dtl.itm_sub2", p);
		p.columnWrk3Dtl_itm_sub3 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk3Dtl_itm_sub3.addAliasName("Wrk3Dtl.itm_sub3", p);
		p.Wrk3Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1120.Wrk3DtlR.$dt_p);
		p.Wrk3Dtl_dt_p_PPanel.setName("Wrk3Dtl.dt_p");
		p.columnWrk3Dtl_st_dt_key = p.Wrk3Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk3Dtl_st_dt_key.addAliasName("Wrk3Dtl.st_dt_key", p);
		p.columnWrk3Dtl_st_dt = p.Wrk3Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk3Dtl_st_dt.addAliasName("Wrk3Dtl.st_dt", p);
		p.columnWrk3Dtl_end_dt = p.Wrk3Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk3Dtl_end_dt.addAliasName("Wrk3Dtl.end_dt", p);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3DtlBtn(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4(MABSP_SlsItmReg p) {
	}

	/**
	 * [Wrk4Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4Dtl(MABSP_SlsItmReg p) {
		p.Wrk4Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1120.Wrk4DtlR.$itm_p);
		p.Wrk4Dtl_itm_p_PPanel.setName("Wrk4Dtl.itm_p");
		p.columnWrk4Dtl_itm_cd = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk4Dtl_itm_cd.addAliasName("Wrk4Dtl.itm_cd", p);
		p.columnWrk4Dtl_itm_sub1 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk4Dtl_itm_sub1.addAliasName("Wrk4Dtl.itm_sub1", p);
		p.columnWrk4Dtl_itm_sub2 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk4Dtl_itm_sub2.addAliasName("Wrk4Dtl.itm_sub2", p);
		p.columnWrk4Dtl_itm_sub3 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk4Dtl_itm_sub3.addAliasName("Wrk4Dtl.itm_sub3", p);
		p.Wrk4Dtl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP1120.Wrk4DtlR.$str_ln_p);
		p.Wrk4Dtl_str_ln_p_PPanel.setName("Wrk4Dtl.str_ln_p");
		p.columnWrk4Dtl_str_ln_cd = p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk4Dtl_str_ln_cd.addAliasName("Wrk4Dtl.str_ln_cd", p);
		p.columnWrk4Dtl_str_ln_nm = p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk4Dtl_str_ln_nm.addAliasName("Wrk4Dtl.str_ln_nm", p);
		p.columnWrk4Dtl_str_ln_cd_none_flg = p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk4Dtl_str_ln_cd_none_flg.addAliasName("Wrk4Dtl.str_ln_cd_none_flg", p);
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4DtlBtn(MABSP_SlsItmReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_SlsItmReg p) {
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

	
	/** [Wrk1Dtl_spln_itm_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_spln_itm_cd_p = null;

	/**
	 * [Wrk1Dtl_spln_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_spln_itm_cd_ListPutter() {
		if (Wrk1Dtl_spln_itm_cd_p == null) {
			Wrk1Dtl_spln_itm_cd_p = createWrk1Dtl_spln_itm_cd_ListPutter(columnWrk1Dtl_spln_itm_cd, "spln_itm_cd", "spln_itm_nm");

		}
		return Wrk1Dtl_spln_itm_cd_p;
	}
	
	
	/** [Wrk1Dtl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_dpt_cd_p = null;

	/**
	 * [Wrk1Dtl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_dpt_cd_ListPutter() {
		if (Wrk1Dtl_dpt_cd_p == null) {
			Wrk1Dtl_dpt_cd_p = createWrk1Dtl_dpt_cd_ListPutter(columnWrk1Dtl_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Wrk1Dtl_dpt_cd_p;
	}
	
	
	/** [Wrk1Dtl_upri_unit_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_upri_unit_cd_p = null;

	/**
	 * [Wrk1Dtl_upri_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_upri_unit_cd_ListPutter() {
		if (Wrk1Dtl_upri_unit_cd_p == null) {
			Wrk1Dtl_upri_unit_cd_p = createWrk1Dtl_upri_unit_cd_ListPutter(columnWrk1Dtl_upri_unit_cd, "upri_unit_cd", "upri_unit_nm","dec_place");

		}
		return Wrk1Dtl_upri_unit_cd_p;
	}
	
	
	/** [Wrk2Dtl_to_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_to_lg_grp_cd_p = null;

	/**
	 * [Wrk2Dtl_to_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_to_lg_grp_cd_ListPutter() {
		if (Wrk2Dtl_to_lg_grp_cd_p == null) {
			Wrk2Dtl_to_lg_grp_cd_p = createWrk2Dtl_to_lg_grp_cd_ListPutter(columnWrk2Dtl_to_lg_grp_cd, "to_lg_grp_cd", "to_lg_grp_nm");

		}
		return Wrk2Dtl_to_lg_grp_cd_p;
	}
	
	
	/** [Wrk2Dtl_itm_ship_grp_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_itm_ship_grp_cd_p = null;

	/**
	 * [Wrk2Dtl_itm_ship_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_itm_ship_grp_cd_ListPutter() {
		if (Wrk2Dtl_itm_ship_grp_cd_p == null) {
			Wrk2Dtl_itm_ship_grp_cd_p = createWrk2Dtl_itm_ship_grp_cd_ListPutter(columnWrk2Dtl_itm_ship_grp_cd, "itm_ship_grp_cd");

		}
		return Wrk2Dtl_itm_ship_grp_cd_p;
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
	
	
	/** [Wrk2Dtl_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_sls_dpt_cd_p = null;

	/**
	 * [Wrk2Dtl_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_sls_dpt_cd_ListPutter() {
		if (Wrk2Dtl_sls_dpt_cd_p == null) {
			Wrk2Dtl_sls_dpt_cd_p = createWrk2Dtl_sls_dpt_cd_ListPutter(columnWrk2Dtl_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Wrk2Dtl_sls_dpt_cd_p;
	}
	
	
	/** [Wrk2Dtl_ship_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_ship_loc_cd_p = null;

	/**
	 * [Wrk2Dtl_ship_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_ship_loc_cd_ListPutter() {
		if (Wrk2Dtl_ship_loc_cd_p == null) {
			Wrk2Dtl_ship_loc_cd_p = createWrk2Dtl_ship_loc_cd_ListPutter(columnWrk2Dtl_ship_loc_cd, "ship_loc_cd", "ship_loc_nm");

		}
		return Wrk2Dtl_ship_loc_cd_p;
	}
	
	
	/** [Wrk3Dtl_bp_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_bp_cd_p = null;

	/**
	 * [Wrk3Dtl_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_bp_cd_ListPutter() {
		if (Wrk3Dtl_bp_cd_p == null) {
			Wrk3Dtl_bp_cd_p = createWrk3Dtl_bp_cd_ListPutter(columnWrk3Dtl_bp_cd, "bp_cd", "bp_nm","sppl_flg","cst_flg");

		}
		return Wrk3Dtl_bp_cd_p;
	}
	
	
	/** [Wrk3Dtl_pf_grp_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_pf_grp_cd_p = null;

	/**
	 * [Wrk3Dtl_pf_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_pf_grp_cd_ListPutter() {
		if (Wrk3Dtl_pf_grp_cd_p == null) {
			Wrk3Dtl_pf_grp_cd_p = createWrk3Dtl_pf_grp_cd_ListPutter(columnWrk3Dtl_pf_grp_cd, "pf_grp_cd", "pf_grp_nm");

		}
		return Wrk3Dtl_pf_grp_cd_p;
	}
	
	
	/** [Wrk4Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_loc_cd_p = null;

	/**
	 * [Wrk4Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_loc_cd_ListPutter() {
		if (Wrk4Dtl_loc_cd_p == null) {
			Wrk4Dtl_loc_cd_p = createWrk4Dtl_loc_cd_ListPutter(columnWrk4Dtl_loc_cd, "loc_cd", "loc_nm","wg_cd","wg_nm","loc_grp_cd","loc_grp_nm","str_ln_tgt_flg");

		}
		return Wrk4Dtl_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_SlsItmReg create(){
		MABSP_SlsItmReg p = new MABSP_SlsItmReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_SlsItmReg create(String name){
		MABSP_SlsItmReg p = new MABSP_SlsItmReg(name);
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
		MABSP_SlsItmReg_MC.jbfInitScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitTop((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitFold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitCnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitCtrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitTbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitDtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitWrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbfInitBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitTop((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitFold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitCnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitCtrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitTbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitDtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitWrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.jbInitBtn((MABSP_SlsItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_SlsItmReg p) {
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
	protected static void jbfInitCtrl(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABSP_SlsItmReg p) {
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
		p.Hdr_sundry_itm_flg = p.beansFactory.createCheckBox("Hdr.sundry_itm_flg");
		p.Hdr_dec_place = p.beansFactory.createNumberField("Hdr.dec_place");
		p.Hdr_sls_lbl = p.beansFactory.createLabel("Hdr.sls_lbl");
		p.Hdr_sls_flg = p.beansFactory.createCheckBox("Hdr.sls_flg");
		p.Hdr_sls_input_flg = p.beansFactory.createCheckBox("Hdr.sls_input_flg");
		p.Hdr_upd = p.beansFactory.createButton("Hdr.upd", "upd");
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
		p.Hdr_check = p.beansFactory.createCheckBox("Hdr.check");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk1Panel = p.beansFactory.createPanel("Wrk1");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1SetDtHdr(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk1SetDtHdrPanel = p.beansFactory.createPanel("Wrk1SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk1SetDtHdr_st_ym_Label = p.beansFactory.createLabel("Wrk1SetDtHdr.st_ym_Label");
		p.Wrk1SetDtHdr_st_ym = p.beansFactory.createDateField("Wrk1SetDtHdr.st_ym");
		p.Wrk1SetDtHdr_st_ym.setLabel(p.Wrk1SetDtHdr_st_ym_Label);
		p.Wrk1SetDtHdr_end_ym_Label = p.beansFactory.createLabel("Wrk1SetDtHdr.end_ym_Label");
		p.Wrk1SetDtHdr_end_ym = p.beansFactory.createDateField("Wrk1SetDtHdr.end_ym");
		p.Wrk1SetDtHdr_end_ym.setLabel(p.Wrk1SetDtHdr_end_ym_Label);
		p.Wrk1SetDtHdr_set_dt = p.beansFactory.createButton("Wrk1SetDtHdr.set_dt");
	}

	/**
	 * [Wrk1Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Dtl(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk1DtlPanel = p.beansFactory.createPanel("Wrk1Dtl");
		p.Wrk1DtlScrollPane = p.beansFactory.createScrollPane("Wrk1Dtl.scroll");
		p.createWrk1DtlTable();
		// ブロックの項目の初期化
		p.columnWrk1Dtl_check = p.beansFactory.createTableColumn("Wrk1Dtl.check", MCColumnType.CHECK);
		p.columnWrk1Dtl_del_flg = p.beansFactory.createTableColumn("Wrk1Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_spln_itm_cd = p.beansFactory.createTableColumn("Wrk1Dtl.spln_itm_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_spln_itm_nm = p.beansFactory.createTableColumn("Wrk1Dtl.spln_itm_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_dpt_cd = p.beansFactory.createTableColumn("Wrk1Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_dpt_nm = p.beansFactory.createTableColumn("Wrk1Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_st_ym_disp = p.beansFactory.createTableColumn("Wrk1Dtl.st_ym_disp", MCColumnType.DATE);
		p.columnWrk1Dtl_end_ym_disp = p.beansFactory.createTableColumn("Wrk1Dtl.end_ym_disp", MCColumnType.DATE);
		p.columnWrk1Dtl_calc_rate = p.beansFactory.createTableColumn("Wrk1Dtl.calc_rate", MCColumnType.NUMBER);
		p.columnWrk1Dtl_calc_seq = p.beansFactory.createTableColumn("Wrk1Dtl.calc_seq", MCColumnType.NUMBER);
		p.columnWrk1Dtl_upri_unit_cd = p.beansFactory.createTableColumn("Wrk1Dtl.upri_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_upri_unit_nm = p.beansFactory.createTableColumn("Wrk1Dtl.upri_unit_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_dec_place = p.beansFactory.createTableColumn("Wrk1Dtl.dec_place", MCColumnType.NUMBER);
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
	protected static void jbfInitWrk1DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void jbfInitWrk2(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk2Panel = p.beansFactory.createPanel("Wrk2");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2SetDtHdr(MABSP_SlsItmReg p) {
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
	protected static void jbfInitWrk2Dtl(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel = p.beansFactory.createPanel("Wrk2Dtl");
		p.Wrk2DtlScrollPane = p.beansFactory.createScrollPane("Wrk2Dtl.scroll");
		p.createWrk2DtlTable();
		// ブロックの項目の初期化
		p.columnWrk2Dtl_check = p.beansFactory.createTableColumn("Wrk2Dtl.check", MCColumnType.CHECK);
		p.columnWrk2Dtl_del_flg = p.beansFactory.createTableColumn("Wrk2Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_to_lg_grp_cd = p.beansFactory.createTableColumn("Wrk2Dtl.to_lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_to_lg_grp_nm = p.beansFactory.createTableColumn("Wrk2Dtl.to_lg_grp_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_itm_ship_grp_cd = p.beansFactory.createTableColumn("Wrk2Dtl.itm_ship_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk2Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk2Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_sls_dpt_cd = p.beansFactory.createTableColumn("Wrk2Dtl.sls_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_sls_dpt_nm = p.beansFactory.createTableColumn("Wrk2Dtl.sls_dpt_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_ship_loc_cd = p.beansFactory.createTableColumn("Wrk2Dtl.ship_loc_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_ship_loc_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ship_loc_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_dmnd_div_ratio = p.beansFactory.createTableColumn("Wrk2Dtl.dmnd_div_ratio", MCColumnType.NUMBER);
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
	protected static void jbfInitWrk2DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void jbfInitWrk3(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel = p.beansFactory.createPanel("Wrk3");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3SetDtHdr(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk3SetDtHdrPanel = p.beansFactory.createPanel("Wrk3SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk3SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk3SetDtHdr.st_dt_Label");
		p.Wrk3SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk3SetDtHdr.st_dt");
		p.Wrk3SetDtHdr_st_dt.setLabel(p.Wrk3SetDtHdr_st_dt_Label);
		p.Wrk3SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk3SetDtHdr.end_dt_Label");
		p.Wrk3SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk3SetDtHdr.end_dt");
		p.Wrk3SetDtHdr_end_dt.setLabel(p.Wrk3SetDtHdr_end_dt_Label);
		p.Wrk3SetDtHdr_set_dt = p.beansFactory.createButton("Wrk3SetDtHdr.set_dt");
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Dtl(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel = p.beansFactory.createPanel("Wrk3Dtl");
		p.Wrk3DtlScrollPane = p.beansFactory.createScrollPane("Wrk3Dtl.scroll");
		p.createWrk3DtlTable();
		// ブロックの項目の初期化
		p.columnWrk3Dtl_check = p.beansFactory.createTableColumn("Wrk3Dtl.check", MCColumnType.CHECK);
		p.columnWrk3Dtl_del_flg = p.beansFactory.createTableColumn("Wrk3Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_bp_cd = p.beansFactory.createTableColumn("Wrk3Dtl.bp_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_bp_nm = p.beansFactory.createTableColumn("Wrk3Dtl.bp_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_sppl_flg = p.beansFactory.createTableColumn("Wrk3Dtl.sppl_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_cst_flg = p.beansFactory.createTableColumn("Wrk3Dtl.cst_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_bp_itm_cd = p.beansFactory.createTableColumn("Wrk3Dtl.bp_itm_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_bp_itm_nm = p.beansFactory.createTableColumn("Wrk3Dtl.bp_itm_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_def_flg = p.beansFactory.createTableColumn("Wrk3Dtl.def_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_pf_grp_cd = p.beansFactory.createTableColumn("Wrk3Dtl.pf_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_pf_grp_nm = p.beansFactory.createTableColumn("Wrk3Dtl.pf_grp_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_pf_fix_flg = p.beansFactory.createTableColumn("Wrk3Dtl.pf_fix_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_purc_commit_flg = p.beansFactory.createTableColumn("Wrk3Dtl.purc_commit_flg", MCColumnType.CHECK);
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
	protected static void jbfInitWrk3DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void jbfInitWrk4(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk4Panel = p.beansFactory.createPanel("Wrk4");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4Dtl(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel = p.beansFactory.createPanel("Wrk4Dtl");
		p.Wrk4DtlScrollPane = p.beansFactory.createScrollPane("Wrk4Dtl.scroll");
		p.createWrk4DtlTable();
		// ブロックの項目の初期化
		p.columnWrk4Dtl_check = p.beansFactory.createTableColumn("Wrk4Dtl.check", MCColumnType.CHECK);
		p.columnWrk4Dtl_del_flg = p.beansFactory.createTableColumn("Wrk4Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk4Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk4Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk4Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk4Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk4Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk4Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk4Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_grp_cd = p.beansFactory.createTableColumn("Wrk4Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_loc_grp_nm = p.beansFactory.createTableColumn("Wrk4Dtl.loc_grp_nm", MCColumnType.TEXT);
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
	protected static void jbfInitWrk4DtlBtn(MABSP_SlsItmReg p) {
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_SlsItmReg p) {
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
	protected static void jbInitTop(MABSP_SlsItmReg p) {
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
	protected static void jbInitFold(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_SlsItmReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP1120.CndR.ope_META);
		p.CndPanel.add(p.Cnd_dt_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_itm_PPanel);
		p.CndPanel.add(p.Cnd_itm_PPanel);
		p.Cnd_itm_PPanel.setNextBeans(p.Cnd_off_del_flg);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1120.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1120.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_SlsItmReg p) {
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
	protected static void jbInitTbl(MABSP_SlsItmReg p) {
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
	protected static void jbInitHdr(MABSP_SlsItmReg p) {
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
		p.Hdr_unit_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.unit_cd_META);
		p.HdrPanel.add(p.Hdr_unit_nm);
		p.Hdr_unit_nm.setNextBeans(p.Hdr_stk_mng_typ);
		p.Hdr_unit_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.unit_nm_META);
		p.HdrPanel.add(p.Hdr_stk_mng_typ_Label);
		p.HdrPanel.add(p.Hdr_stk_mng_typ);
		p.Hdr_stk_mng_typ.setNextBeans(p.Hdr_stk_mng_typ_nm);
		p.Hdr_stk_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.stk_mng_typ_META);
		p.HdrPanel.add(p.Hdr_stk_mng_typ_nm);
		p.Hdr_stk_mng_typ_nm.setNextBeans(p.Hdr_asset_mng_typ);
		p.Hdr_stk_mng_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.stk_mng_typ_nm_META);
		p.HdrPanel.add(p.Hdr_asset_mng_typ_Label);
		p.HdrPanel.add(p.Hdr_asset_mng_typ);
		p.Hdr_asset_mng_typ.setNextBeans(p.Hdr_asset_mng_typ_nm);
		p.Hdr_asset_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.asset_mng_typ_META);
		p.HdrPanel.add(p.Hdr_asset_mng_typ_nm);
		p.Hdr_asset_mng_typ_nm.setNextBeans(p.Hdr_sundry_itm_flg);
		p.Hdr_asset_mng_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.asset_mng_typ_nm_META);
		p.HdrPanel.add(p.Hdr_sundry_itm_flg);
		p.Hdr_sundry_itm_flg.setNextBeans(p.Hdr_dec_place);
		p.Hdr_sundry_itm_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.sundry_itm_flg_META);
		p.HdrPanel.add(p.Hdr_dec_place);
		p.Hdr_dec_place.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_dec_place.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.dec_place_META);
		p.BtnPanel.add(p.Hdr_sls_lbl);
		p.BtnPanel.add(p.Hdr_sls_flg);
		p.BtnPanel.setLastBeans(p.Hdr_sls_flg);
		p.Hdr_sls_flg.setNextBeans(p.Hdr_sls_input_flg);
		p.Hdr_sls_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.sls_flg_META);
		p.BtnPanel.add(p.Hdr_sls_input_flg);
		p.Hdr_sls_input_flg.setNextBeans(p.Hdr_upd);
		p.Hdr_sls_input_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.sls_input_flg_META);
		p.Hdr_upd.setIcon("REGISTER");
		p.Hdr_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Hdr_upd);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setNextBeans(p.Hdr_check);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.upd_cntr_META);
		p.HdrPanel.add(p.Hdr_check);
		p.Hdr_check.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1120.HdrR.check_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABSP_SlsItmReg p) {
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
		p.Wrk3Panel.setNextBeans(p.Wrk4Panel);
		p.DtlTabTab.add(p.Wrk4Panel, "DtlTab.tab4");
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk1SetDtHdr(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk1SetDtHdrPanel.setValueCheck(false);
		p.Wrk1SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_st_ym_Label);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_st_ym);
		p.Wrk1SetDtHdrPanel.setLastBeans(p.Wrk1SetDtHdr_st_ym);
		p.Wrk1SetDtHdr_st_ym.setNextBeans(p.Wrk1SetDtHdr_end_ym);
		p.Wrk1SetDtHdr_st_ym.setRow(p.getWrk1SetDtHdrR(), mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR.st_ym_META);
		p.Wrk1SetDtHdr_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_end_ym_Label);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_end_ym);
		p.Wrk1SetDtHdr_end_ym.setNextBeans(p.Wrk1SetDtHdr_set_dt);
		p.Wrk1SetDtHdr_end_ym.setRow(p.getWrk1SetDtHdrR(), mcframe.clientMABS.MABSP1120.Wrk1SetDtHdrR.end_ym_META);
		p.Wrk1SetDtHdr_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Wrk1SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_set_dt);
	}

	/**
	 * [Wrk1Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Dtl(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk1DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk2(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk2SetDtHdr(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk2SetDtHdrPanel.setValueCheck(false);
		p.Wrk2SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_st_dt_Label);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_st_dt);
		p.Wrk2SetDtHdrPanel.setLastBeans(p.Wrk2SetDtHdr_st_dt);
		p.Wrk2SetDtHdr_st_dt.setNextBeans(p.Wrk2SetDtHdr_end_dt);
		p.Wrk2SetDtHdr_st_dt.setRow(p.getWrk2SetDtHdrR(), mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR.st_dt_META);
		p.Wrk2SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_end_dt_Label);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_end_dt);
		p.Wrk2SetDtHdr_end_dt.setNextBeans(p.Wrk2SetDtHdr_set_dt);
		p.Wrk2SetDtHdr_end_dt.setRow(p.getWrk2SetDtHdrR(), mcframe.clientMABS.MABSP1120.Wrk2SetDtHdrR.end_dt_META);
		p.Wrk2SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk2SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_set_dt);
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2Dtl(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk2DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk3(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel.setNextBeans(p.Wrk4Panel);
		p.Wrk3Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk3Panel.add(p.Wrk3SetDtHdrPanel, null);
		p.Wrk3Panel.setLastBeans(p.Wrk3SetDtHdrPanel);
		p.Wrk3SetDtHdrPanel.setNextBeans(p.Wrk3DtlPanel);
		p.Wrk3Panel.add(p.Wrk3DtlPanel, null);
		p.Wrk3DtlPanel.setNextBeans(p.Wrk3DtlBtnPanel);
		p.Wrk3Panel.add(p.Wrk3DtlBtnPanel, null);
	}

	/**
	 * [Wrk3SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3SetDtHdr(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.Wrk3SetDtHdrPanel.setValueCheck(false);
		p.Wrk3SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk3SetDtHdrPanel.add(p.Wrk3SetDtHdr_st_dt_Label);
		p.Wrk3SetDtHdrPanel.add(p.Wrk3SetDtHdr_st_dt);
		p.Wrk3SetDtHdrPanel.setLastBeans(p.Wrk3SetDtHdr_st_dt);
		p.Wrk3SetDtHdr_st_dt.setNextBeans(p.Wrk3SetDtHdr_end_dt);
		p.Wrk3SetDtHdr_st_dt.setRow(p.getWrk3SetDtHdrR(), mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR.st_dt_META);
		p.Wrk3SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk3SetDtHdrPanel.add(p.Wrk3SetDtHdr_end_dt_Label);
		p.Wrk3SetDtHdrPanel.add(p.Wrk3SetDtHdr_end_dt);
		p.Wrk3SetDtHdr_end_dt.setNextBeans(p.Wrk3SetDtHdr_set_dt);
		p.Wrk3SetDtHdr_end_dt.setRow(p.getWrk3SetDtHdrR(), mcframe.clientMABS.MABSP1120.Wrk3SetDtHdrR.end_dt_META);
		p.Wrk3SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk3SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk3SetDtHdrPanel.add(p.Wrk3SetDtHdr_set_dt);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Dtl(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk3DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk4(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
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
	protected static void jbInitWrk4Dtl(MABSP_SlsItmReg p) {
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
	protected static void jbInitWrk4DtlBtn(MABSP_SlsItmReg p) {
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
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABSP_SlsItmReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
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
		MABSP_SlsItmReg_MC.mcInitScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitTop((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitFold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitCnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitCtrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitTbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitDtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitWrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.mcInitBtn((MABSP_SlsItmReg)this);

		// [SRCH]ステータスのモードの設定
		MABSP_SlsItmReg_MC.statusInitSRCH_ScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Top((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Fold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Cnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Ctrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Tbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Hdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_HdrAll((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_DtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Wrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitSRCH_Btn((MABSP_SlsItmReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_SlsItmReg_MC.statusInitUPD_ScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Top((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Fold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Cnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Ctrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Tbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Hdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_HdrAll((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_DtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Wrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitUPD_Btn((MABSP_SlsItmReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_SlsItmReg_MC.statusInitFIX_ScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Top((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Fold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Cnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Ctrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Tbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Hdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_HdrAll((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_DtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Wrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitFIX_Btn((MABSP_SlsItmReg)this);

		// [REF]ステータスのモードの設定
		MABSP_SlsItmReg_MC.statusInitREF_ScreenOpe((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Top((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Fold((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Cnd((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Ctrl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Tbl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Hdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_HdrAll((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_DtlTab((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk1((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk1SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk1DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk2((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk2SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk2DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk3((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk3SetDtHdr((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk3DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk4((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk4Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Wrk4DtlBtn((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.statusInitREF_Btn((MABSP_SlsItmReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_SlsItmReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_SlsItmReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABSP_SlsItmReg p) {
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
		p.Hdr_sundry_itm_flg.addAllListener(p);
		p.Hdr_dec_place.setListListener(p);
		p.Hdr_dec_place.addAllListener(p);
		p.Hdr_sls_flg.addAllListener(p);
		p.Hdr_sls_input_flg.addAllListener(p);
		p.Hdr_upd.addAllListener(p);
		p.Hdr_upd.setAPMethodName("doHdr_upd");
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
		p.Hdr_check.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABSP_SlsItmReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Wrk1SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1SetDtHdr(MABSP_SlsItmReg p) {
		p.Wrk1SetDtHdr_st_ym.setListListener(p);
		p.Wrk1SetDtHdr_st_ym.addAllListener(p);
		p.Wrk1SetDtHdr_end_ym.setListListener(p);
		p.Wrk1SetDtHdr_end_ym.addAllListener(p);
		p.Wrk1SetDtHdr_set_dt.addAllListener(p);
		p.Wrk1SetDtHdr_set_dt.setAPMethodName("doWrk1SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk1Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Dtl(MABSP_SlsItmReg p) {
		p.Wrk1DtlTable.addAllListener(p);
		p.columnWrk1Dtl_check.addAllListener(p);
		p.columnWrk1Dtl_del_flg.addAllListener(p);
		p.columnWrk1Dtl_spln_itm_cd.addAllListener(p);
		p.columnWrk1Dtl_spln_itm_cd.setListListener(p);
		p.columnWrk1Dtl_spln_itm_nm.addAllListener(p);
		p.columnWrk1Dtl_spln_itm_nm.setListListener(p);
		p.columnWrk1Dtl_dpt_cd.addAllListener(p);
		p.columnWrk1Dtl_dpt_cd.setListListener(p);
		p.columnWrk1Dtl_dpt_nm.addAllListener(p);
		p.columnWrk1Dtl_dpt_nm.setListListener(p);
		p.columnWrk1Dtl_st_ym_disp.addAllListener(p);
		p.columnWrk1Dtl_st_ym_disp.setListListener(p);
		p.columnWrk1Dtl_end_ym_disp.addAllListener(p);
		p.columnWrk1Dtl_end_ym_disp.setListListener(p);
		p.columnWrk1Dtl_calc_rate.addAllListener(p);
		p.columnWrk1Dtl_calc_rate.setListListener(p);
		p.columnWrk1Dtl_calc_seq.addAllListener(p);
		p.columnWrk1Dtl_calc_seq.setListListener(p);
		p.columnWrk1Dtl_upri_unit_cd.addAllListener(p);
		p.columnWrk1Dtl_upri_unit_cd.setListListener(p);
		p.columnWrk1Dtl_upri_unit_nm.addAllListener(p);
		p.columnWrk1Dtl_upri_unit_nm.setListListener(p);
		p.columnWrk1Dtl_dec_place.addAllListener(p);
		p.columnWrk1Dtl_dec_place.setListListener(p);
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
	protected static void mcInitWrk1DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void mcInitWrk2(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Wrk2SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2SetDtHdr(MABSP_SlsItmReg p) {
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
	protected static void mcInitWrk2Dtl(MABSP_SlsItmReg p) {
		p.Wrk2DtlTable.addAllListener(p);
		p.columnWrk2Dtl_check.addAllListener(p);
		p.columnWrk2Dtl_del_flg.addAllListener(p);
		p.columnWrk2Dtl_to_lg_grp_cd.addAllListener(p);
		p.columnWrk2Dtl_to_lg_grp_cd.setListListener(p);
		p.columnWrk2Dtl_to_lg_grp_nm.addAllListener(p);
		p.columnWrk2Dtl_to_lg_grp_nm.setListListener(p);
		p.columnWrk2Dtl_itm_ship_grp_cd.addAllListener(p);
		p.columnWrk2Dtl_itm_ship_grp_cd.setListListener(p);
		p.columnWrk2Dtl_wg_cd.addAllListener(p);
		p.columnWrk2Dtl_wg_cd.setListListener(p);
		p.columnWrk2Dtl_wg_nm.addAllListener(p);
		p.columnWrk2Dtl_wg_nm.setListListener(p);
		p.columnWrk2Dtl_sls_dpt_cd.addAllListener(p);
		p.columnWrk2Dtl_sls_dpt_cd.setListListener(p);
		p.columnWrk2Dtl_sls_dpt_nm.addAllListener(p);
		p.columnWrk2Dtl_sls_dpt_nm.setListListener(p);
		p.columnWrk2Dtl_ship_loc_cd.addAllListener(p);
		p.columnWrk2Dtl_ship_loc_cd.setListListener(p);
		p.columnWrk2Dtl_ship_loc_nm.addAllListener(p);
		p.columnWrk2Dtl_ship_loc_nm.setListListener(p);
		p.columnWrk2Dtl_dmnd_div_ratio.addAllListener(p);
		p.columnWrk2Dtl_dmnd_div_ratio.setListListener(p);
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
	protected static void mcInitWrk2DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void mcInitWrk3(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Wrk3SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3SetDtHdr(MABSP_SlsItmReg p) {
		p.Wrk3SetDtHdr_st_dt.setListListener(p);
		p.Wrk3SetDtHdr_st_dt.addAllListener(p);
		p.Wrk3SetDtHdr_end_dt.setListListener(p);
		p.Wrk3SetDtHdr_end_dt.addAllListener(p);
		p.Wrk3SetDtHdr_set_dt.addAllListener(p);
		p.Wrk3SetDtHdr_set_dt.setAPMethodName("doWrk3SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk3Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Dtl(MABSP_SlsItmReg p) {
		p.Wrk3DtlTable.addAllListener(p);
		p.columnWrk3Dtl_check.addAllListener(p);
		p.columnWrk3Dtl_del_flg.addAllListener(p);
		p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk3Dtl_bp_cd.addAllListener(p);
		p.columnWrk3Dtl_bp_cd.setListListener(p);
		p.columnWrk3Dtl_bp_nm.addAllListener(p);
		p.columnWrk3Dtl_bp_nm.setListListener(p);
		p.columnWrk3Dtl_sppl_flg.addAllListener(p);
		p.columnWrk3Dtl_cst_flg.addAllListener(p);
		p.columnWrk3Dtl_bp_itm_cd.addAllListener(p);
		p.columnWrk3Dtl_bp_itm_cd.setListListener(p);
		p.columnWrk3Dtl_bp_itm_nm.addAllListener(p);
		p.columnWrk3Dtl_bp_itm_nm.setListListener(p);
		p.columnWrk3Dtl_def_flg.addAllListener(p);
		p.columnWrk3Dtl_pf_grp_cd.addAllListener(p);
		p.columnWrk3Dtl_pf_grp_cd.setListListener(p);
		p.columnWrk3Dtl_pf_grp_nm.addAllListener(p);
		p.columnWrk3Dtl_pf_grp_nm.setListListener(p);
		p.columnWrk3Dtl_pf_fix_flg.addAllListener(p);
		p.columnWrk3Dtl_purc_commit_flg.addAllListener(p);
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
	protected static void mcInitWrk3DtlBtn(MABSP_SlsItmReg p) {
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
	protected static void mcInitWrk4(MABSP_SlsItmReg p) {
	}

	/**
	 *  [Wrk4Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4Dtl(MABSP_SlsItmReg p) {
		p.Wrk4DtlTable.addAllListener(p);
		p.columnWrk4Dtl_check.addAllListener(p);
		p.columnWrk4Dtl_del_flg.addAllListener(p);
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk4Dtl_loc_cd.addAllListener(p);
		p.columnWrk4Dtl_loc_cd.setListListener(p);
		p.columnWrk4Dtl_loc_nm.addAllListener(p);
		p.columnWrk4Dtl_loc_nm.setListListener(p);
		p.columnWrk4Dtl_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk4Dtl_wg_cd.addAllListener(p);
		p.columnWrk4Dtl_wg_cd.setListListener(p);
		p.columnWrk4Dtl_wg_nm.addAllListener(p);
		p.columnWrk4Dtl_wg_nm.setListListener(p);
		p.columnWrk4Dtl_loc_grp_cd.addAllListener(p);
		p.columnWrk4Dtl_loc_grp_cd.setListListener(p);
		p.columnWrk4Dtl_loc_grp_nm.addAllListener(p);
		p.columnWrk4Dtl_loc_grp_nm.setListListener(p);
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
	protected static void mcInitWrk4DtlBtn(MABSP_SlsItmReg p) {
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABSP_SlsItmReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_SlsItmReg p){
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
	protected static void statusInitSRCH_Ctrl(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABSP_SlsItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_lbl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_input_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrAll(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk1SetDtHdr_st_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_end_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Dtl(MABSP_SlsItmReg p){
		p.columnWrk1Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_spln_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_spln_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_st_ym_disp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_end_ym_disp.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.INVISIBLE);
		p.columnWrk1Dtl_calc_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_calc_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upri_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upri_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk1Dtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
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
	protected static void statusInitSRCH_Wrk1DtlBtn(MABSP_SlsItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2Dtl(MABSP_SlsItmReg p){
		p.columnWrk2Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_to_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_to_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_ship_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_dmnd_div_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Wrk2DtlBtn(MABSP_SlsItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk3SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk3SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Dtl(MABSP_SlsItmReg p){
		p.columnWrk3Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cst_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk3Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk3Dtl_bp_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bp_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_def_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_purc_commit_flg.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Wrk3DtlBtn(MABSP_SlsItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4(MABSP_SlsItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4Dtl(MABSP_SlsItmReg p){
		p.columnWrk4Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH_Wrk4DtlBtn(MABSP_SlsItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_SlsItmReg p){
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
	protected static void statusInitUPD_Ctrl(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABSP_SlsItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sls_lbl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrAll(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk1SetDtHdr_st_ym.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1SetDtHdr_end_ym.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1Dtl(MABSP_SlsItmReg p){
		p.columnWrk1Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_spln_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_spln_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_st_ym_disp.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_end_ym_disp.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.INVISIBLE);
		p.columnWrk1Dtl_calc_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_calc_seq.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_upri_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_upri_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk1Dtl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
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
	protected static void statusInitUPD_Wrk1DtlBtn(MABSP_SlsItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2Dtl(MABSP_SlsItmReg p){
		p.columnWrk2Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_to_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_to_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_ship_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_ship_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk2Dtl_dmnd_div_ratio.putMode(p, UPD, MCMode.REQUIRED);
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
	protected static void statusInitUPD_Wrk2DtlBtn(MABSP_SlsItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk3SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk3SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3Dtl(MABSP_SlsItmReg p){
		p.columnWrk3Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk3Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk3Dtl_bp_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_bp_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_def_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_pf_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pf_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_purc_commit_flg.putMode(p, UPD, MCMode.REQUIRED);
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
	protected static void statusInitUPD_Wrk3DtlBtn(MABSP_SlsItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4(MABSP_SlsItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4Dtl(MABSP_SlsItmReg p){
		p.columnWrk4Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_Wrk4DtlBtn(MABSP_SlsItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_SlsItmReg p){
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
	protected static void statusInitFIX_Ctrl(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABSP_SlsItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sundry_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_sls_lbl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sls_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Hdr_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HdrAll(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlTab(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk1SetDtHdr_st_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_end_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1Dtl(MABSP_SlsItmReg p){
		p.columnWrk1Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_spln_itm_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_spln_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_st_ym_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_end_ym_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.INVISIBLE);
		p.columnWrk1Dtl_calc_rate.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_calc_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upri_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upri_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk1Dtl_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
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
	protected static void statusInitFIX_Wrk1DtlBtn(MABSP_SlsItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2Dtl(MABSP_SlsItmReg p){
		p.columnWrk2Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_to_lg_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_to_lg_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_ship_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_dmnd_div_ratio.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_Wrk2DtlBtn(MABSP_SlsItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk3SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk3SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3Dtl(MABSP_SlsItmReg p){
		p.columnWrk3Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sppl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cst_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk3Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk3Dtl_bp_itm_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bp_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_def_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_fix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_purc_commit_flg.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_Wrk3DtlBtn(MABSP_SlsItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4(MABSP_SlsItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4Dtl(MABSP_SlsItmReg p){
		p.columnWrk4Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_str_ln_tgt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX, MCMode.INVISIBLE);
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
	protected static void statusInitFIX_Wrk4DtlBtn(MABSP_SlsItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_SlsItmReg p){
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
	protected static void statusInitREF_Ctrl(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABSP_SlsItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sls_lbl.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, REF, MCMode.DISABLE);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrAll(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk1SetDtHdr_st_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_end_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Dtl(MABSP_SlsItmReg p){
		p.columnWrk1Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_spln_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_spln_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_st_ym_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_end_ym_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.INVISIBLE);
		p.columnWrk1Dtl_calc_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_calc_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upri_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upri_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk1Dtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
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
	protected static void statusInitREF_Wrk1DtlBtn(MABSP_SlsItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2Dtl(MABSP_SlsItmReg p){
		p.columnWrk2Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_to_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_to_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_itm_ship_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ship_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_dmnd_div_ratio.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Wrk2DtlBtn(MABSP_SlsItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk3SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3SetDtHdr(MABSP_SlsItmReg p){
		p.Wrk3SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Dtl(MABSP_SlsItmReg p){
		p.columnWrk3Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk3Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk3Dtl_bp_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bp_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_def_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pf_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_purc_commit_flg.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Wrk3DtlBtn(MABSP_SlsItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4(MABSP_SlsItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4Dtl(MABSP_SlsItmReg p){
		p.columnWrk4Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk4Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Wrk4DtlBtn(MABSP_SlsItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_SlsItmReg p){

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
		MABSP_SlsItmReg_MC.setTableConfigWrk1Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.setTableConfigWrk2Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.setTableConfigWrk3Dtl((MABSP_SlsItmReg)this);
		MABSP_SlsItmReg_MC.setTableConfigWrk4Dtl((MABSP_SlsItmReg)this);
	}

	/**
	 * [Wrk1Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk1Dtl(MABSP_SlsItmReg p) {
		p.columnWrk1Dtl_check.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.check_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_check);
		p.columnWrk1Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.del_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_flg);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk1Dtl_spln_itm_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.spln_itm_cd_META);
		p.columnWrk1Dtl_spln_itm_cd.setListType(MCListType.STRICT);
		p.columnWrk1Dtl_spln_itm_cd.addLinkBeans(p.columnWrk1Dtl_spln_itm_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_spln_itm_cd);
		p.columnWrk1Dtl_spln_itm_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.spln_itm_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_spln_itm_nm);
		p.columnWrk1Dtl_dpt_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.dpt_cd_META);
		p.columnWrk1Dtl_dpt_cd.addLinkBeans(p.columnWrk1Dtl_dpt_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_dpt_cd);
		p.columnWrk1Dtl_dpt_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.dpt_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_dpt_nm);
		p.columnWrk1Dtl_st_ym_disp.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.st_ym_disp_META);
		p.columnWrk1Dtl_st_ym_disp.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_st_ym_disp);
		p.columnWrk1Dtl_end_ym_disp.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.end_ym_disp_META);
		p.columnWrk1Dtl_end_ym_disp.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_end_ym_disp);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_dt_p_PPanel.DtTable);
		p.columnWrk1Dtl_calc_rate.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.calc_rate_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_calc_rate);
		p.columnWrk1Dtl_calc_seq.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.calc_seq_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_calc_seq);
		p.columnWrk1Dtl_upri_unit_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upri_unit_cd_META);
		p.columnWrk1Dtl_upri_unit_cd.addLinkBeans(p.columnWrk1Dtl_upri_unit_nm,p.columnWrk1Dtl_dec_place);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upri_unit_cd);
		p.columnWrk1Dtl_upri_unit_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upri_unit_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upri_unit_nm);
		p.columnWrk1Dtl_dec_place.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.dec_place_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_dec_place);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_qty_p_PPanel.QtyTable);
		p.columnWrk1Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.memo1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo1);
		p.columnWrk1Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.memo2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo2);
		p.columnWrk1Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.memo3_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo3);
		p.columnWrk1Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.ins_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_usr_id);
		p.columnWrk1Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.ins_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_usr_nm);
		p.columnWrk1Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.ins_ts_META);
		p.columnWrk1Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_ts);
		p.columnWrk1Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.ins_func_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_func_id);
		p.columnWrk1Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.ins_func_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_func_nm);
		p.columnWrk1Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_cntr_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_cntr);
		p.columnWrk1Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_usr_id);
		p.columnWrk1Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_usr_nm);
		p.columnWrk1Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_ts_META);
		p.columnWrk1Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_ts);
		p.columnWrk1Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_func_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_func_id);
		p.columnWrk1Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_func_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_func_nm);
		p.columnWrk1Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.upd_srv_req_no_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_srv_req_no);
		p.columnWrk1Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.del_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_usr_id);
		p.columnWrk1Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.del_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_usr_nm);
		p.columnWrk1Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk1DtlR.del_ts_META);
		p.columnWrk1Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk1DtlTable.setUnscrollColumn(p.columnWrk1Dtl_del_flg);
	}

	/**
	 * [Wrk2Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk2Dtl(MABSP_SlsItmReg p) {
		p.columnWrk2Dtl_check.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.check_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_check);
		p.columnWrk2Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.del_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_flg);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk2Dtl_to_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.to_lg_grp_cd_META);
		p.columnWrk2Dtl_to_lg_grp_cd.addLinkBeans(p.columnWrk2Dtl_to_lg_grp_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_to_lg_grp_cd);
		p.columnWrk2Dtl_to_lg_grp_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.to_lg_grp_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_to_lg_grp_nm);
		p.columnWrk2Dtl_itm_ship_grp_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.itm_ship_grp_cd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_itm_ship_grp_cd);
		p.columnWrk2Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.wg_cd_META);
		p.columnWrk2Dtl_wg_cd.addLinkBeans(p.columnWrk2Dtl_wg_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wg_cd);
		p.columnWrk2Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.wg_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wg_nm);
		p.columnWrk2Dtl_sls_dpt_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.sls_dpt_cd_META);
		p.columnWrk2Dtl_sls_dpt_cd.addLinkBeans(p.columnWrk2Dtl_sls_dpt_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sls_dpt_cd);
		p.columnWrk2Dtl_sls_dpt_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.sls_dpt_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sls_dpt_nm);
		p.columnWrk2Dtl_ship_loc_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ship_loc_cd_META);
		p.columnWrk2Dtl_ship_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk2Dtl_ship_loc_cd.addLinkBeans(p.columnWrk2Dtl_ship_loc_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ship_loc_cd);
		p.columnWrk2Dtl_ship_loc_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ship_loc_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ship_loc_nm);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_dt_p_PPanel.DtTable);
		p.columnWrk2Dtl_dmnd_div_ratio.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.dmnd_div_ratio_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_dmnd_div_ratio);
		p.columnWrk2Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.memo1_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo1);
		p.columnWrk2Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.memo2_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo2);
		p.columnWrk2Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.memo3_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo3);
		p.columnWrk2Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ins_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_id);
		p.columnWrk2Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ins_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_nm);
		p.columnWrk2Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ins_ts_META);
		p.columnWrk2Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_ts);
		p.columnWrk2Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ins_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_id);
		p.columnWrk2Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.ins_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_nm);
		p.columnWrk2Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_cntr_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_cntr);
		p.columnWrk2Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_id);
		p.columnWrk2Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_nm);
		p.columnWrk2Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_ts_META);
		p.columnWrk2Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_ts);
		p.columnWrk2Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_id);
		p.columnWrk2Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_nm);
		p.columnWrk2Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.upd_srv_req_no_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_srv_req_no);
		p.columnWrk2Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.del_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_id);
		p.columnWrk2Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.del_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_nm);
		p.columnWrk2Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk2DtlR.del_ts_META);
		p.columnWrk2Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk2DtlTable.setUnscrollColumn(p.columnWrk2Dtl_del_flg);
	}

	/**
	 * [Wrk3Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk3Dtl(MABSP_SlsItmReg p) {
		p.columnWrk3Dtl_check.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.check_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_check);
		p.columnWrk3Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.del_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_flg);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk3Dtl_bp_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.bp_cd_META);
		p.columnWrk3Dtl_bp_cd.setListType(MCListType.STRICT);
		p.columnWrk3Dtl_bp_cd.addLinkBeans(p.columnWrk3Dtl_bp_nm,p.columnWrk3Dtl_sppl_flg,p.columnWrk3Dtl_cst_flg);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_bp_cd);
		p.columnWrk3Dtl_bp_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.bp_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_bp_nm);
		p.columnWrk3Dtl_sppl_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.sppl_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_sppl_flg);
		p.columnWrk3Dtl_cst_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.cst_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_cst_flg);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_dt_p_PPanel.DtTable);
		p.columnWrk3Dtl_bp_itm_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.bp_itm_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_bp_itm_cd);
		p.columnWrk3Dtl_bp_itm_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.bp_itm_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_bp_itm_nm);
		p.columnWrk3Dtl_def_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.def_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_def_flg);
		p.columnWrk3Dtl_pf_grp_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.pf_grp_cd_META);
		p.columnWrk3Dtl_pf_grp_cd.addLinkBeans(p.columnWrk3Dtl_pf_grp_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pf_grp_cd);
		p.columnWrk3Dtl_pf_grp_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.pf_grp_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pf_grp_nm);
		p.columnWrk3Dtl_pf_fix_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.pf_fix_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pf_fix_flg);
		p.columnWrk3Dtl_purc_commit_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.purc_commit_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_purc_commit_flg);
		p.columnWrk3Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.memo1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo1);
		p.columnWrk3Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.memo2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo2);
		p.columnWrk3Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.memo3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo3);
		p.columnWrk3Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.ins_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_id);
		p.columnWrk3Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.ins_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_nm);
		p.columnWrk3Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.ins_ts_META);
		p.columnWrk3Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_ts);
		p.columnWrk3Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.ins_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_id);
		p.columnWrk3Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.ins_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_nm);
		p.columnWrk3Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_cntr_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_cntr);
		p.columnWrk3Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_id);
		p.columnWrk3Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_nm);
		p.columnWrk3Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_ts_META);
		p.columnWrk3Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_ts);
		p.columnWrk3Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_id);
		p.columnWrk3Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_nm);
		p.columnWrk3Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.upd_srv_req_no_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_srv_req_no);
		p.columnWrk3Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.del_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_id);
		p.columnWrk3Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.del_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_nm);
		p.columnWrk3Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk3DtlR.del_ts_META);
		p.columnWrk3Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk3DtlTable.setUnscrollColumn(p.columnWrk3Dtl_del_flg);
	}

	/**
	 * [Wrk4Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk4Dtl(MABSP_SlsItmReg p) {
		p.columnWrk4Dtl_check.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.check_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_check);
		p.columnWrk4Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.del_flg_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_flg);
		p.Wrk4DtlTable.addTable(p.Wrk4Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk4Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.loc_cd_META);
		p.columnWrk4Dtl_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk4Dtl_loc_cd.addLinkBeans(p.columnWrk4Dtl_loc_nm,p.columnWrk4Dtl_wg_cd,p.columnWrk4Dtl_wg_nm,p.columnWrk4Dtl_loc_grp_cd,p.columnWrk4Dtl_loc_grp_nm,p.columnWrk4Dtl_str_ln_tgt_flg);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_cd);
		p.columnWrk4Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.loc_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_nm);
		p.columnWrk4Dtl_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.str_ln_tgt_flg_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_str_ln_tgt_flg);
		p.columnWrk4Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.wg_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_wg_cd);
		p.columnWrk4Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.wg_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_wg_nm);
		p.columnWrk4Dtl_loc_grp_cd.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.loc_grp_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_grp_cd);
		p.columnWrk4Dtl_loc_grp_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.loc_grp_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_loc_grp_nm);
		p.Wrk4DtlTable.addTable(p.Wrk4Dtl_str_ln_p_PPanel.StrLnTable);
		p.columnWrk4Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.memo1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo1);
		p.columnWrk4Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.memo2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo2);
		p.columnWrk4Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.memo3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo3);
		p.columnWrk4Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.ins_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_id);
		p.columnWrk4Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.ins_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_nm);
		p.columnWrk4Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.ins_ts_META);
		p.columnWrk4Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_ts);
		p.columnWrk4Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.ins_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_id);
		p.columnWrk4Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.ins_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_nm);
		p.columnWrk4Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_cntr_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_cntr);
		p.columnWrk4Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_id);
		p.columnWrk4Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_nm);
		p.columnWrk4Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_ts_META);
		p.columnWrk4Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_ts);
		p.columnWrk4Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_id);
		p.columnWrk4Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_nm);
		p.columnWrk4Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.upd_srv_req_no_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_srv_req_no);
		p.columnWrk4Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.del_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_id);
		p.columnWrk4Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.del_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_nm);
		p.columnWrk4Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1120.Wrk4DtlR.del_ts_META);
		p.columnWrk4Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk4DtlTable.setUnscrollColumn(p.columnWrk4Dtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnWrk1Dtl_spln_itm_cd.getListConfig().setPutter(getWrk1Dtl_spln_itm_cd_ListPutter());
		columnWrk1Dtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_dpt_cd.getListConfig().setPutter(getWrk1Dtl_dpt_cd_ListPutter());
		columnWrk1Dtl_upri_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_upri_unit_cd.getListConfig().setPutter(getWrk1Dtl_upri_unit_cd_ListPutter());
		columnWrk2Dtl_to_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_to_lg_grp_cd.getListConfig().setPutter(getWrk2Dtl_to_lg_grp_cd_ListPutter());
		columnWrk2Dtl_itm_ship_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_itm_ship_grp_cd.getListConfig().setPutter(getWrk2Dtl_itm_ship_grp_cd_ListPutter());
		columnWrk2Dtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_wg_cd.getListConfig().setPutter(getWrk2Dtl_wg_cd_ListPutter());
		columnWrk2Dtl_sls_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_sls_dpt_cd.getListConfig().setPutter(getWrk2Dtl_sls_dpt_cd_ListPutter());
		columnWrk2Dtl_ship_loc_cd.getListConfig().setPutter(getWrk2Dtl_ship_loc_cd_ListPutter());
		columnWrk3Dtl_bp_cd.getListConfig().setPutter(getWrk3Dtl_bp_cd_ListPutter());
		columnWrk3Dtl_pf_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_pf_grp_cd.getListConfig().setPutter(getWrk3Dtl_pf_grp_cd_ListPutter());
		columnWrk4Dtl_loc_cd.getListConfig().setPutter(getWrk4Dtl_loc_cd_ListPutter());
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
	 * [Wrk1Dtl_spln_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_spln_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SplnItm");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptBase");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_upri_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_upri_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_to_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_to_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpNotForLoc");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_itm_ship_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_itm_ship_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptBase");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_ship_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_ship_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_pf_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_pf_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PfGrp");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == columnWrk1Dtl_spln_itm_cd) return getWrk1Dtl_spln_itm_cd(row, info);
		if(combo == columnWrk1Dtl_dpt_cd) return getWrk1Dtl_dpt_cd(row, info);
		if(combo == columnWrk1Dtl_upri_unit_cd) return getWrk1Dtl_upri_unit_cd(row, info);
		if(combo == columnWrk2Dtl_to_lg_grp_cd) return getWrk2Dtl_to_lg_grp_cd(row, info);
		if(combo == columnWrk2Dtl_itm_ship_grp_cd) return getWrk2Dtl_itm_ship_grp_cd(row, info);
		if(combo == columnWrk2Dtl_wg_cd) return getWrk2Dtl_wg_cd(row, info);
		if(combo == columnWrk2Dtl_sls_dpt_cd) return getWrk2Dtl_sls_dpt_cd(row, info);
		if(combo == columnWrk2Dtl_ship_loc_cd) return getWrk2Dtl_ship_loc_cd(row, info);
		if(combo == Wrk3Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk3Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk3Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk3Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk3Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk3Dtl_bp_cd) return getWrk3Dtl_bp_cd(row, info);
		if(combo == columnWrk3Dtl_pf_grp_cd) return getWrk3Dtl_pf_grp_cd(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk4Dtl_loc_cd) return getWrk4Dtl_loc_cd(row, info);
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
		else if (ap == Wrk3SetDtHdr_set_dt) doWrk3SetDtHdr_set_dt(info);
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
	 * [Wrk3SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3SetDtHdr_set_dt(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_unit_cd) return doHdr_unit_cd_VC(info);
		if (vc == Hdr_unit_nm) return doHdr_unit_nm_VC(info);
		if (vc == Hdr_stk_mng_typ) return doHdr_stk_mng_typ_VC(info);
		if (vc == Hdr_stk_mng_typ_nm) return doHdr_stk_mng_typ_nm_VC(info);
		if (vc == Hdr_asset_mng_typ) return doHdr_asset_mng_typ_VC(info);
		if (vc == Hdr_asset_mng_typ_nm) return doHdr_asset_mng_typ_nm_VC(info);
		if (vc == Hdr_sundry_itm_flg) return doHdr_sundry_itm_flg_VC(info);
		if (vc == Hdr_dec_place) return doHdr_dec_place_VC(info);
		if (vc == Hdr_sls_flg) return doHdr_sls_flg_VC(info);
		if (vc == Hdr_sls_input_flg) return doHdr_sls_input_flg_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == Hdr_check) return doHdr_check_VC(info);
		if (vc == Wrk1SetDtHdr_st_ym) return doWrk1SetDtHdr_st_ym_VC(info);
		if (vc == Wrk1SetDtHdr_end_ym) return doWrk1SetDtHdr_end_ym_VC(info);
		if (vc == columnWrk1Dtl_check) return doWrk1Dtl_check_VC(info);
		if (vc == columnWrk1Dtl_del_flg) return doWrk1Dtl_del_flg_VC(info);
		if (vc == columnWrk1Dtl_spln_itm_cd) return doWrk1Dtl_spln_itm_cd_VC(info);
		if (vc == columnWrk1Dtl_spln_itm_nm) return doWrk1Dtl_spln_itm_nm_VC(info);
		if (vc == columnWrk1Dtl_dpt_cd) return doWrk1Dtl_dpt_cd_VC(info);
		if (vc == columnWrk1Dtl_dpt_nm) return doWrk1Dtl_dpt_nm_VC(info);
		if (vc == columnWrk1Dtl_st_ym_disp) return doWrk1Dtl_st_ym_disp_VC(info);
		if (vc == columnWrk1Dtl_end_ym_disp) return doWrk1Dtl_end_ym_disp_VC(info);
		if (vc == columnWrk1Dtl_calc_rate) return doWrk1Dtl_calc_rate_VC(info);
		if (vc == columnWrk1Dtl_calc_seq) return doWrk1Dtl_calc_seq_VC(info);
		if (vc == columnWrk1Dtl_upri_unit_cd) return doWrk1Dtl_upri_unit_cd_VC(info);
		if (vc == columnWrk1Dtl_upri_unit_nm) return doWrk1Dtl_upri_unit_nm_VC(info);
		if (vc == columnWrk1Dtl_dec_place) return doWrk1Dtl_dec_place_VC(info);
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
		if (vc == columnWrk2Dtl_to_lg_grp_cd) return doWrk2Dtl_to_lg_grp_cd_VC(info);
		if (vc == columnWrk2Dtl_to_lg_grp_nm) return doWrk2Dtl_to_lg_grp_nm_VC(info);
		if (vc == columnWrk2Dtl_itm_ship_grp_cd) return doWrk2Dtl_itm_ship_grp_cd_VC(info);
		if (vc == columnWrk2Dtl_wg_cd) return doWrk2Dtl_wg_cd_VC(info);
		if (vc == columnWrk2Dtl_wg_nm) return doWrk2Dtl_wg_nm_VC(info);
		if (vc == columnWrk2Dtl_sls_dpt_cd) return doWrk2Dtl_sls_dpt_cd_VC(info);
		if (vc == columnWrk2Dtl_sls_dpt_nm) return doWrk2Dtl_sls_dpt_nm_VC(info);
		if (vc == columnWrk2Dtl_ship_loc_cd) return doWrk2Dtl_ship_loc_cd_VC(info);
		if (vc == columnWrk2Dtl_ship_loc_nm) return doWrk2Dtl_ship_loc_nm_VC(info);
		if (vc == columnWrk2Dtl_dmnd_div_ratio) return doWrk2Dtl_dmnd_div_ratio_VC(info);
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
		if (vc == Wrk3SetDtHdr_st_dt) return doWrk3SetDtHdr_st_dt_VC(info);
		if (vc == Wrk3SetDtHdr_end_dt) return doWrk3SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk3Dtl_check) return doWrk3Dtl_check_VC(info);
		if (vc == columnWrk3Dtl_del_flg) return doWrk3Dtl_del_flg_VC(info);
		if (vc == columnWrk3Dtl_bp_cd) return doWrk3Dtl_bp_cd_VC(info);
		if (vc == columnWrk3Dtl_bp_nm) return doWrk3Dtl_bp_nm_VC(info);
		if (vc == columnWrk3Dtl_sppl_flg) return doWrk3Dtl_sppl_flg_VC(info);
		if (vc == columnWrk3Dtl_cst_flg) return doWrk3Dtl_cst_flg_VC(info);
		if (vc == columnWrk3Dtl_bp_itm_cd) return doWrk3Dtl_bp_itm_cd_VC(info);
		if (vc == columnWrk3Dtl_bp_itm_nm) return doWrk3Dtl_bp_itm_nm_VC(info);
		if (vc == columnWrk3Dtl_def_flg) return doWrk3Dtl_def_flg_VC(info);
		if (vc == columnWrk3Dtl_pf_grp_cd) return doWrk3Dtl_pf_grp_cd_VC(info);
		if (vc == columnWrk3Dtl_pf_grp_nm) return doWrk3Dtl_pf_grp_nm_VC(info);
		if (vc == columnWrk3Dtl_pf_fix_flg) return doWrk3Dtl_pf_fix_flg_VC(info);
		if (vc == columnWrk3Dtl_purc_commit_flg) return doWrk3Dtl_purc_commit_flg_VC(info);
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
		if (vc == columnWrk4Dtl_loc_cd) return doWrk4Dtl_loc_cd_VC(info);
		if (vc == columnWrk4Dtl_loc_nm) return doWrk4Dtl_loc_nm_VC(info);
		if (vc == columnWrk4Dtl_str_ln_tgt_flg) return doWrk4Dtl_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk4Dtl_wg_cd) return doWrk4Dtl_wg_cd_VC(info);
		if (vc == columnWrk4Dtl_wg_nm) return doWrk4Dtl_wg_nm_VC(info);
		if (vc == columnWrk4Dtl_loc_grp_cd) return doWrk4Dtl_loc_grp_cd_VC(info);
		if (vc == columnWrk4Dtl_loc_grp_nm) return doWrk4Dtl_loc_grp_nm_VC(info);
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
	 * [Hdr]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sundry_itm_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_input_flg_VC(MCEventInfo info){
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
	 * [Wrk1SetDtHdr]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1SetDtHdr_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1SetDtHdr_end_ym_VC(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[spln_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_spln_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[spln_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_spln_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[st_ym_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_st_ym_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[end_ym_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_end_ym_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_calc_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_calc_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upri_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upri_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_dec_place_VC(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[to_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_to_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_ship_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_itm_ship_grp_cd_VC(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ship_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[dmnd_div_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_dmnd_div_ratio_VC(MCEventInfo info){
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
	 * [Wrk3SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3SetDtHdr_end_dt_VC(MCEventInfo info){
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
	 * [Wrk3Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_bp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_bp_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[def_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_def_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pf_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pf_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pf_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[purc_commit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_purc_commit_flg_VC(MCEventInfo info){
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
	 * [Wrk4Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_loc_grp_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_unit_cd) doHdr_unit_cd_NC(info);
		else if (nc == Hdr_unit_nm) doHdr_unit_nm_NC(info);
		else if (nc == Hdr_stk_mng_typ) doHdr_stk_mng_typ_NC(info);
		else if (nc == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_NC(info);
		else if (nc == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NC(info);
		else if (nc == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NC(info);
		else if (nc == Hdr_sundry_itm_flg) doHdr_sundry_itm_flg_NC(info);
		else if (nc == Hdr_dec_place) doHdr_dec_place_NC(info);
		else if (nc == Hdr_sls_flg) doHdr_sls_flg_NC(info);
		else if (nc == Hdr_sls_input_flg) doHdr_sls_input_flg_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == Hdr_check) doHdr_check_NC(info);
		else if (nc == Wrk1SetDtHdr_st_ym) doWrk1SetDtHdr_st_ym_NC(info);
		else if (nc == Wrk1SetDtHdr_end_ym) doWrk1SetDtHdr_end_ym_NC(info);
		else if (nc == columnWrk1Dtl_check) doWrk1Dtl_check_NC(info);
		else if (nc == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NC(info);
		else if (nc == columnWrk1Dtl_spln_itm_cd) doWrk1Dtl_spln_itm_cd_NC(info);
		else if (nc == columnWrk1Dtl_spln_itm_nm) doWrk1Dtl_spln_itm_nm_NC(info);
		else if (nc == columnWrk1Dtl_dpt_cd) doWrk1Dtl_dpt_cd_NC(info);
		else if (nc == columnWrk1Dtl_dpt_nm) doWrk1Dtl_dpt_nm_NC(info);
		else if (nc == columnWrk1Dtl_st_ym_disp) doWrk1Dtl_st_ym_disp_NC(info);
		else if (nc == columnWrk1Dtl_end_ym_disp) doWrk1Dtl_end_ym_disp_NC(info);
		else if (nc == columnWrk1Dtl_calc_rate) doWrk1Dtl_calc_rate_NC(info);
		else if (nc == columnWrk1Dtl_calc_seq) doWrk1Dtl_calc_seq_NC(info);
		else if (nc == columnWrk1Dtl_upri_unit_cd) doWrk1Dtl_upri_unit_cd_NC(info);
		else if (nc == columnWrk1Dtl_upri_unit_nm) doWrk1Dtl_upri_unit_nm_NC(info);
		else if (nc == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_NC(info);
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
		else if (nc == columnWrk2Dtl_to_lg_grp_cd) doWrk2Dtl_to_lg_grp_cd_NC(info);
		else if (nc == columnWrk2Dtl_to_lg_grp_nm) doWrk2Dtl_to_lg_grp_nm_NC(info);
		else if (nc == columnWrk2Dtl_itm_ship_grp_cd) doWrk2Dtl_itm_ship_grp_cd_NC(info);
		else if (nc == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NC(info);
		else if (nc == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NC(info);
		else if (nc == columnWrk2Dtl_sls_dpt_cd) doWrk2Dtl_sls_dpt_cd_NC(info);
		else if (nc == columnWrk2Dtl_sls_dpt_nm) doWrk2Dtl_sls_dpt_nm_NC(info);
		else if (nc == columnWrk2Dtl_ship_loc_cd) doWrk2Dtl_ship_loc_cd_NC(info);
		else if (nc == columnWrk2Dtl_ship_loc_nm) doWrk2Dtl_ship_loc_nm_NC(info);
		else if (nc == columnWrk2Dtl_dmnd_div_ratio) doWrk2Dtl_dmnd_div_ratio_NC(info);
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
		else if (nc == Wrk3SetDtHdr_st_dt) doWrk3SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk3SetDtHdr_end_dt) doWrk3SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk3Dtl_check) doWrk3Dtl_check_NC(info);
		else if (nc == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NC(info);
		else if (nc == columnWrk3Dtl_bp_cd) doWrk3Dtl_bp_cd_NC(info);
		else if (nc == columnWrk3Dtl_bp_nm) doWrk3Dtl_bp_nm_NC(info);
		else if (nc == columnWrk3Dtl_sppl_flg) doWrk3Dtl_sppl_flg_NC(info);
		else if (nc == columnWrk3Dtl_cst_flg) doWrk3Dtl_cst_flg_NC(info);
		else if (nc == columnWrk3Dtl_bp_itm_cd) doWrk3Dtl_bp_itm_cd_NC(info);
		else if (nc == columnWrk3Dtl_bp_itm_nm) doWrk3Dtl_bp_itm_nm_NC(info);
		else if (nc == columnWrk3Dtl_def_flg) doWrk3Dtl_def_flg_NC(info);
		else if (nc == columnWrk3Dtl_pf_grp_cd) doWrk3Dtl_pf_grp_cd_NC(info);
		else if (nc == columnWrk3Dtl_pf_grp_nm) doWrk3Dtl_pf_grp_nm_NC(info);
		else if (nc == columnWrk3Dtl_pf_fix_flg) doWrk3Dtl_pf_fix_flg_NC(info);
		else if (nc == columnWrk3Dtl_purc_commit_flg) doWrk3Dtl_purc_commit_flg_NC(info);
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
		else if (nc == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_NC(info);
		else if (nc == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_NC(info);
		else if (nc == columnWrk4Dtl_str_ln_tgt_flg) doWrk4Dtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NC(info);
		else if (nc == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NC(info);
		else if (nc == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_NC(info);
		else if (nc == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_NC(info);
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
	 * [Hdr]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_input_flg_NC(MCEventInfo info){
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
	 * [Wrk1SetDtHdr]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_ym_NC(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[spln_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[spln_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[st_ym_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_st_ym_disp_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[end_ym_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_end_ym_disp_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_rate_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_seq_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_NC(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_ship_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_ship_grp_cd_NC(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dmnd_div_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dmnd_div_ratio_NC(MCEventInfo info){
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
	 * [Wrk3SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_end_dt_NC(MCEventInfo info){
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
	 * [Wrk3Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[def_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_def_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[purc_commit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_purc_commit_flg_NC(MCEventInfo info){
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
	 * [Wrk4Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_unit_cd) doHdr_unit_cd_NE(info);
		else if (ne == Hdr_unit_nm) doHdr_unit_nm_NE(info);
		else if (ne == Hdr_stk_mng_typ) doHdr_stk_mng_typ_NE(info);
		else if (ne == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_NE(info);
		else if (ne == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NE(info);
		else if (ne == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NE(info);
		else if (ne == Hdr_sundry_itm_flg) doHdr_sundry_itm_flg_NE(info);
		else if (ne == Hdr_dec_place) doHdr_dec_place_NE(info);
		else if (ne == Hdr_sls_flg) doHdr_sls_flg_NE(info);
		else if (ne == Hdr_sls_input_flg) doHdr_sls_input_flg_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == Hdr_check) doHdr_check_NE(info);
		else if (ne == Wrk1SetDtHdr_st_ym) doWrk1SetDtHdr_st_ym_NE(info);
		else if (ne == Wrk1SetDtHdr_end_ym) doWrk1SetDtHdr_end_ym_NE(info);
		else if (ne == columnWrk1Dtl_check) doWrk1Dtl_check_NE(info);
		else if (ne == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NE(info);
		else if (ne == columnWrk1Dtl_spln_itm_cd) doWrk1Dtl_spln_itm_cd_NE(info);
		else if (ne == columnWrk1Dtl_spln_itm_nm) doWrk1Dtl_spln_itm_nm_NE(info);
		else if (ne == columnWrk1Dtl_dpt_cd) doWrk1Dtl_dpt_cd_NE(info);
		else if (ne == columnWrk1Dtl_dpt_nm) doWrk1Dtl_dpt_nm_NE(info);
		else if (ne == columnWrk1Dtl_st_ym_disp) doWrk1Dtl_st_ym_disp_NE(info);
		else if (ne == columnWrk1Dtl_end_ym_disp) doWrk1Dtl_end_ym_disp_NE(info);
		else if (ne == columnWrk1Dtl_calc_rate) doWrk1Dtl_calc_rate_NE(info);
		else if (ne == columnWrk1Dtl_calc_seq) doWrk1Dtl_calc_seq_NE(info);
		else if (ne == columnWrk1Dtl_upri_unit_cd) doWrk1Dtl_upri_unit_cd_NE(info);
		else if (ne == columnWrk1Dtl_upri_unit_nm) doWrk1Dtl_upri_unit_nm_NE(info);
		else if (ne == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_NE(info);
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
		else if (ne == columnWrk2Dtl_to_lg_grp_cd) doWrk2Dtl_to_lg_grp_cd_NE(info);
		else if (ne == columnWrk2Dtl_to_lg_grp_nm) doWrk2Dtl_to_lg_grp_nm_NE(info);
		else if (ne == columnWrk2Dtl_itm_ship_grp_cd) doWrk2Dtl_itm_ship_grp_cd_NE(info);
		else if (ne == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NE(info);
		else if (ne == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NE(info);
		else if (ne == columnWrk2Dtl_sls_dpt_cd) doWrk2Dtl_sls_dpt_cd_NE(info);
		else if (ne == columnWrk2Dtl_sls_dpt_nm) doWrk2Dtl_sls_dpt_nm_NE(info);
		else if (ne == columnWrk2Dtl_ship_loc_cd) doWrk2Dtl_ship_loc_cd_NE(info);
		else if (ne == columnWrk2Dtl_ship_loc_nm) doWrk2Dtl_ship_loc_nm_NE(info);
		else if (ne == columnWrk2Dtl_dmnd_div_ratio) doWrk2Dtl_dmnd_div_ratio_NE(info);
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
		else if (ne == Wrk3SetDtHdr_st_dt) doWrk3SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk3SetDtHdr_end_dt) doWrk3SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk3Dtl_check) doWrk3Dtl_check_NE(info);
		else if (ne == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NE(info);
		else if (ne == columnWrk3Dtl_bp_cd) doWrk3Dtl_bp_cd_NE(info);
		else if (ne == columnWrk3Dtl_bp_nm) doWrk3Dtl_bp_nm_NE(info);
		else if (ne == columnWrk3Dtl_sppl_flg) doWrk3Dtl_sppl_flg_NE(info);
		else if (ne == columnWrk3Dtl_cst_flg) doWrk3Dtl_cst_flg_NE(info);
		else if (ne == columnWrk3Dtl_bp_itm_cd) doWrk3Dtl_bp_itm_cd_NE(info);
		else if (ne == columnWrk3Dtl_bp_itm_nm) doWrk3Dtl_bp_itm_nm_NE(info);
		else if (ne == columnWrk3Dtl_def_flg) doWrk3Dtl_def_flg_NE(info);
		else if (ne == columnWrk3Dtl_pf_grp_cd) doWrk3Dtl_pf_grp_cd_NE(info);
		else if (ne == columnWrk3Dtl_pf_grp_nm) doWrk3Dtl_pf_grp_nm_NE(info);
		else if (ne == columnWrk3Dtl_pf_fix_flg) doWrk3Dtl_pf_fix_flg_NE(info);
		else if (ne == columnWrk3Dtl_purc_commit_flg) doWrk3Dtl_purc_commit_flg_NE(info);
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
		else if (ne == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_NE(info);
		else if (ne == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_NE(info);
		else if (ne == columnWrk4Dtl_str_ln_tgt_flg) doWrk4Dtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NE(info);
		else if (ne == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NE(info);
		else if (ne == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_NE(info);
		else if (ne == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_NE(info);
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
	 * [Hdr]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_input_flg_NE(MCEventInfo info){
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
	 * [Wrk1SetDtHdr]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_ym_NE(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[spln_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[spln_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[st_ym_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_st_ym_disp_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[end_ym_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_end_ym_disp_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_rate_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_seq_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_NE(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_ship_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_ship_grp_cd_NE(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dmnd_div_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dmnd_div_ratio_NE(MCEventInfo info){
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
	 * [Wrk3SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_end_dt_NE(MCEventInfo info){
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
	 * [Wrk3Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[def_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_def_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[purc_commit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_purc_commit_flg_NE(MCEventInfo info){
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
	 * [Wrk4Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_unit_cd) doHdr_unit_cd_NX(info);
		else if (nx == Hdr_unit_nm) doHdr_unit_nm_NX(info);
		else if (nx == Hdr_stk_mng_typ) doHdr_stk_mng_typ_NX(info);
		else if (nx == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_NX(info);
		else if (nx == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NX(info);
		else if (nx == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NX(info);
		else if (nx == Hdr_sundry_itm_flg) doHdr_sundry_itm_flg_NX(info);
		else if (nx == Hdr_dec_place) doHdr_dec_place_NX(info);
		else if (nx == Hdr_sls_flg) doHdr_sls_flg_NX(info);
		else if (nx == Hdr_sls_input_flg) doHdr_sls_input_flg_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == Hdr_check) doHdr_check_NX(info);
		else if (nx == Wrk1SetDtHdr_st_ym) doWrk1SetDtHdr_st_ym_NX(info);
		else if (nx == Wrk1SetDtHdr_end_ym) doWrk1SetDtHdr_end_ym_NX(info);
		else if (nx == columnWrk1Dtl_check) doWrk1Dtl_check_NX(info);
		else if (nx == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NX(info);
		else if (nx == columnWrk1Dtl_spln_itm_cd) doWrk1Dtl_spln_itm_cd_NX(info);
		else if (nx == columnWrk1Dtl_spln_itm_nm) doWrk1Dtl_spln_itm_nm_NX(info);
		else if (nx == columnWrk1Dtl_dpt_cd) doWrk1Dtl_dpt_cd_NX(info);
		else if (nx == columnWrk1Dtl_dpt_nm) doWrk1Dtl_dpt_nm_NX(info);
		else if (nx == columnWrk1Dtl_st_ym_disp) doWrk1Dtl_st_ym_disp_NX(info);
		else if (nx == columnWrk1Dtl_end_ym_disp) doWrk1Dtl_end_ym_disp_NX(info);
		else if (nx == columnWrk1Dtl_calc_rate) doWrk1Dtl_calc_rate_NX(info);
		else if (nx == columnWrk1Dtl_calc_seq) doWrk1Dtl_calc_seq_NX(info);
		else if (nx == columnWrk1Dtl_upri_unit_cd) doWrk1Dtl_upri_unit_cd_NX(info);
		else if (nx == columnWrk1Dtl_upri_unit_nm) doWrk1Dtl_upri_unit_nm_NX(info);
		else if (nx == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_NX(info);
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
		else if (nx == columnWrk2Dtl_to_lg_grp_cd) doWrk2Dtl_to_lg_grp_cd_NX(info);
		else if (nx == columnWrk2Dtl_to_lg_grp_nm) doWrk2Dtl_to_lg_grp_nm_NX(info);
		else if (nx == columnWrk2Dtl_itm_ship_grp_cd) doWrk2Dtl_itm_ship_grp_cd_NX(info);
		else if (nx == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NX(info);
		else if (nx == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NX(info);
		else if (nx == columnWrk2Dtl_sls_dpt_cd) doWrk2Dtl_sls_dpt_cd_NX(info);
		else if (nx == columnWrk2Dtl_sls_dpt_nm) doWrk2Dtl_sls_dpt_nm_NX(info);
		else if (nx == columnWrk2Dtl_ship_loc_cd) doWrk2Dtl_ship_loc_cd_NX(info);
		else if (nx == columnWrk2Dtl_ship_loc_nm) doWrk2Dtl_ship_loc_nm_NX(info);
		else if (nx == columnWrk2Dtl_dmnd_div_ratio) doWrk2Dtl_dmnd_div_ratio_NX(info);
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
		else if (nx == Wrk3SetDtHdr_st_dt) doWrk3SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk3SetDtHdr_end_dt) doWrk3SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk3Dtl_check) doWrk3Dtl_check_NX(info);
		else if (nx == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NX(info);
		else if (nx == columnWrk3Dtl_bp_cd) doWrk3Dtl_bp_cd_NX(info);
		else if (nx == columnWrk3Dtl_bp_nm) doWrk3Dtl_bp_nm_NX(info);
		else if (nx == columnWrk3Dtl_sppl_flg) doWrk3Dtl_sppl_flg_NX(info);
		else if (nx == columnWrk3Dtl_cst_flg) doWrk3Dtl_cst_flg_NX(info);
		else if (nx == columnWrk3Dtl_bp_itm_cd) doWrk3Dtl_bp_itm_cd_NX(info);
		else if (nx == columnWrk3Dtl_bp_itm_nm) doWrk3Dtl_bp_itm_nm_NX(info);
		else if (nx == columnWrk3Dtl_def_flg) doWrk3Dtl_def_flg_NX(info);
		else if (nx == columnWrk3Dtl_pf_grp_cd) doWrk3Dtl_pf_grp_cd_NX(info);
		else if (nx == columnWrk3Dtl_pf_grp_nm) doWrk3Dtl_pf_grp_nm_NX(info);
		else if (nx == columnWrk3Dtl_pf_fix_flg) doWrk3Dtl_pf_fix_flg_NX(info);
		else if (nx == columnWrk3Dtl_purc_commit_flg) doWrk3Dtl_purc_commit_flg_NX(info);
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
		else if (nx == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_NX(info);
		else if (nx == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_NX(info);
		else if (nx == columnWrk4Dtl_str_ln_tgt_flg) doWrk4Dtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NX(info);
		else if (nx == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NX(info);
		else if (nx == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_NX(info);
		else if (nx == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_NX(info);
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
	 * [Hdr]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_input_flg_NX(MCEventInfo info){
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
	 * [Wrk1SetDtHdr]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_ym_NX(MCEventInfo info){
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
	 * [Wrk1Dtl]パネルの[spln_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[spln_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[st_ym_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_st_ym_disp_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[end_ym_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_end_ym_disp_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_rate_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_seq_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_NX(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_ship_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_ship_grp_cd_NX(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dmnd_div_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dmnd_div_ratio_NX(MCEventInfo info){
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
	 * [Wrk3SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_end_dt_NX(MCEventInfo info){
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
	 * [Wrk3Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[def_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_def_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[purc_commit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_purc_commit_flg_NX(MCEventInfo info){
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
	 * [Wrk4Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_NX(MCEventInfo info){
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
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == Wrk1SetDtHdr_st_ym) doWrk1SetDtHdr_st_ym_LC(info);
		else if (lc == Wrk1SetDtHdr_end_ym) doWrk1SetDtHdr_end_ym_LC(info);
		else if (lc == columnWrk1Dtl_spln_itm_cd) doWrk1Dtl_spln_itm_cd_LC(info);
		else if (lc == columnWrk1Dtl_spln_itm_nm) doWrk1Dtl_spln_itm_nm_LC(info);
		else if (lc == columnWrk1Dtl_dpt_cd) doWrk1Dtl_dpt_cd_LC(info);
		else if (lc == columnWrk1Dtl_dpt_nm) doWrk1Dtl_dpt_nm_LC(info);
		else if (lc == columnWrk1Dtl_st_ym_disp) doWrk1Dtl_st_ym_disp_LC(info);
		else if (lc == columnWrk1Dtl_end_ym_disp) doWrk1Dtl_end_ym_disp_LC(info);
		else if (lc == columnWrk1Dtl_calc_rate) doWrk1Dtl_calc_rate_LC(info);
		else if (lc == columnWrk1Dtl_calc_seq) doWrk1Dtl_calc_seq_LC(info);
		else if (lc == columnWrk1Dtl_upri_unit_cd) doWrk1Dtl_upri_unit_cd_LC(info);
		else if (lc == columnWrk1Dtl_upri_unit_nm) doWrk1Dtl_upri_unit_nm_LC(info);
		else if (lc == columnWrk1Dtl_dec_place) doWrk1Dtl_dec_place_LC(info);
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
		else if (lc == columnWrk2Dtl_to_lg_grp_cd) doWrk2Dtl_to_lg_grp_cd_LC(info);
		else if (lc == columnWrk2Dtl_to_lg_grp_nm) doWrk2Dtl_to_lg_grp_nm_LC(info);
		else if (lc == columnWrk2Dtl_itm_ship_grp_cd) doWrk2Dtl_itm_ship_grp_cd_LC(info);
		else if (lc == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_LC(info);
		else if (lc == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_LC(info);
		else if (lc == columnWrk2Dtl_sls_dpt_cd) doWrk2Dtl_sls_dpt_cd_LC(info);
		else if (lc == columnWrk2Dtl_sls_dpt_nm) doWrk2Dtl_sls_dpt_nm_LC(info);
		else if (lc == columnWrk2Dtl_ship_loc_cd) doWrk2Dtl_ship_loc_cd_LC(info);
		else if (lc == columnWrk2Dtl_ship_loc_nm) doWrk2Dtl_ship_loc_nm_LC(info);
		else if (lc == columnWrk2Dtl_dmnd_div_ratio) doWrk2Dtl_dmnd_div_ratio_LC(info);
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
		else if (lc == Wrk3SetDtHdr_st_dt) doWrk3SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk3SetDtHdr_end_dt) doWrk3SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk3Dtl_bp_cd) doWrk3Dtl_bp_cd_LC(info);
		else if (lc == columnWrk3Dtl_bp_nm) doWrk3Dtl_bp_nm_LC(info);
		else if (lc == columnWrk3Dtl_bp_itm_cd) doWrk3Dtl_bp_itm_cd_LC(info);
		else if (lc == columnWrk3Dtl_bp_itm_nm) doWrk3Dtl_bp_itm_nm_LC(info);
		else if (lc == columnWrk3Dtl_pf_grp_cd) doWrk3Dtl_pf_grp_cd_LC(info);
		else if (lc == columnWrk3Dtl_pf_grp_nm) doWrk3Dtl_pf_grp_nm_LC(info);
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
		else if (lc == columnWrk4Dtl_loc_cd) doWrk4Dtl_loc_cd_LC(info);
		else if (lc == columnWrk4Dtl_loc_nm) doWrk4Dtl_loc_nm_LC(info);
		else if (lc == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_LC(info);
		else if (lc == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_LC(info);
		else if (lc == columnWrk4Dtl_loc_grp_cd) doWrk4Dtl_loc_grp_cd_LC(info);
		else if (lc == columnWrk4Dtl_loc_grp_nm) doWrk4Dtl_loc_grp_nm_LC(info);
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
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[spln_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[spln_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_spln_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[st_ym_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_st_ym_disp_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[end_ym_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_end_ym_disp_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_rate_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[calc_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_calc_seq_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upri_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upri_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_dec_place_LC(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[itm_ship_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_itm_ship_grp_cd_LC(MCEventInfo info){
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
	 * [Wrk2Dtl]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ship_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[dmnd_div_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_dmnd_div_ratio_LC(MCEventInfo info){
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
	 * [Wrk3SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bp_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bp_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pf_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pf_grp_nm_LC(MCEventInfo info){
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
	 * [Wrk4Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_loc_grp_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[columnWrk1Dtl_spln_itm_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_spln_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSplnItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_dpt_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_upri_unit_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_upri_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_to_lg_grp_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_to_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpNotForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_itm_ship_grp_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_itm_ship_grp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_wg_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_sls_dpt_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_ship_loc_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_ship_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk3Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk3Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk3Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk3Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk3Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk3Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk3Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_bp_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_pf_grp_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_pf_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPfGrp(row, info);
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
	 * コンボ／リストのリスト[columnWrk4Dtl_loc_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL1120.Srch01")) {
			return new MA_MABSL1120_Srch01Bridge();
		}
		if (id.equals("MA.MABSL1120.Upd01")) {
			return new MA_MABSL1120_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL1120_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1120_Srch01;

		/** コンストラクタ */
		protected MA_MABSL1120_Srch01Bridge() {
			p_MA_MABSL1120_Srch01 = new MCParam(PDef.MA_MABSL1120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP1120.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.HdrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk2DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk3DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk4DtlR.class));

			p_MA_MABSL1120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP1120.CndR up0() {
			return (mcframe.clientMABS.MABSP1120.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP1120.HdrR> down0() {
			return (MCList<mcframe.clientMABS.MABSP1120.HdrR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR> down2() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR>)down(2);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR> down3() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR>)down(3);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR> down4() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR>)down(4);
		}

		protected void setupDownParam() {
			p_MA_MABSL1120_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.HdrR.class));
			p_MA_MABSL1120_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.class));
			p_MA_MABSL1120_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk2DtlR.class));
			p_MA_MABSL1120_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk3DtlR.class));
			p_MA_MABSL1120_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk4DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL1120_Srch01;
		}

		protected void show() {
			setHdrAllL((MCList<mcframe.clientMABS.MABSP1120.HdrR>)p_MA_MABSL1120_Srch01.getContainerParam().getDownBlock(0));
			setWrk1DtlL((MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR>)p_MA_MABSL1120_Srch01.getContainerParam().getDownBlock(1));
			setWrk2DtlL((MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR>)p_MA_MABSL1120_Srch01.getContainerParam().getDownBlock(2));
			setWrk3DtlL((MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR>)p_MA_MABSL1120_Srch01.getContainerParam().getDownBlock(3));
			setWrk4DtlL((MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR>)p_MA_MABSL1120_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrAllL().clear();
			getWrk1DtlL().clear();
			getWrk2DtlL().clear();
			getWrk3DtlL().clear();
			getWrk4DtlL().clear();
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
			return result;
		}
	}
	/**
	 * [MA_MABSL1120_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1120_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1120_Upd01;

		/** コンストラクタ */
		protected MA_MABSL1120_Upd01Bridge() {
			p_MA_MABSL1120_Upd01 = new MCParam(PDef.MA_MABSL1120_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1120_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1120.HdrR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk1DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk2DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk3DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1120.Wrk4DtlR.class));
			// Down

			p_MA_MABSL1120_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1120_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1120_Upd01.addUpBlock(getHdrAllL().shallowClone());
			p_MA_MABSL1120_Upd01.addUpBlock(getWrk1DtlL().shallowClone());
			p_MA_MABSL1120_Upd01.addUpBlock(getWrk2DtlL().shallowClone());
			p_MA_MABSL1120_Upd01.addUpBlock(getWrk3DtlL().shallowClone());
			p_MA_MABSL1120_Upd01.addUpBlock(getWrk4DtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1120_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1120_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1120.HdrR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1120.HdrR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR> up1() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk1DtlR>)up(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR> up2() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk2DtlR>)up(2);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR> up3() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk3DtlR>)up(3);
		}
		protected MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR> up4() {
			return (MCList<mcframe.clientMABS.MABSP1120.Wrk4DtlR>)up(4);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1120_Upd01;
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
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}