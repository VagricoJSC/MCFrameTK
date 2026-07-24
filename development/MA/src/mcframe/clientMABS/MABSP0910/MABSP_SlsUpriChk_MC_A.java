package mcframe.clientMABS.MABSP0910;

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
import mcframe.clientMABS.MABSP0910.MABSP_SlsUpriChk_MC.MA_MABSL0910_Sprt01Caller;

/**
 * 画面"MABSP_SlsUpriChk"パネルクラスです。<p>
 *
 * 入力した情報に対する単価を確認する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_SlsUpriChk_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0910";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCTitledBorder DtlTitledBorder = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0910.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_peg_no = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_grp_cd = null;
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_grp_nm = null;
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
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty_p_PPanel;
	public MCColumnConfig columnDtl_qty;// [Dtl]の[qty_p.qty]を[columnDtl_qty]としてエイリアス定義。
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_interim_flg = null;
	/**
	 * Error エラー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_err_flg = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
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
	/**
	 * Acquire unit price 単価取得.<p>
	 *
	 */
	public MCButton DtlBtn_get_upri = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Wrk1]ブロック関連のField定義
	public MCPanel Wrk1Panel = null;
	// [Wrk1]ブロックの項目のField定義
	// [CstDtl]ブロック関連のField定義
	public MCPanel CstDtlPanel = null;
	public MCScrollPane CstDtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0910.CstDtlR> CstDtlTable = null;
	// [CstDtl]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_peg_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_wg_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dlv_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_dest_nm3 = null;
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_sls_upri_grp_cd = null;
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_sls_upri_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D CstDtl_itm_p_PPanel;
	public MCColumnConfig columnCstDtl_itm_cd;// [CstDtl]の[itm_p.itm_cd]を[columnCstDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnCstDtl_itm_sub1;// [CstDtl]の[itm_p.itm_sub1]を[columnCstDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnCstDtl_itm_sub2;// [CstDtl]の[itm_p.itm_sub2]を[columnCstDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnCstDtl_itm_sub3;// [CstDtl]の[itm_p.itm_sub3]を[columnCstDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnCstDtl_itm_nm;// [CstDtl]の[itm_p.itm_nm]を[columnCstDtl_itm_nm]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_unit_nm = null;
	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_lot_qty = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_cur_nm = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_end_dt = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upri = null;
	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upri_bf = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_interim_flg = null;
	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upri_rate = null;
	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upri_rate_bf = null;
	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_sub_upri1 = null;
	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_sub_upri2 = null;
	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_sub_upri3 = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_not_cost_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnCstDtl_upd_srv_req_no = null;
	// [Wrk2]ブロック関連のField定義
	public MCPanel Wrk2Panel = null;
	// [Wrk2]ブロックの項目のField定義
	// [ItmDtl]ブロック関連のField定義
	public MCPanel ItmDtlPanel = null;
	public MCScrollPane ItmDtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0910.ItmDtlR> ItmDtlTable = null;
	// [ItmDtl]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_peg_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_wg_nm = null;
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sls_upri_grp_cd = null;
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sls_upri_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmDtl_itm_p_PPanel;
	public MCColumnConfig columnItmDtl_itm_cd;// [ItmDtl]の[itm_p.itm_cd]を[columnItmDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_sub1;// [ItmDtl]の[itm_p.itm_sub1]を[columnItmDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_sub2;// [ItmDtl]の[itm_p.itm_sub2]を[columnItmDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_sub3;// [ItmDtl]の[itm_p.itm_sub3]を[columnItmDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmDtl_itm_nm;// [ItmDtl]の[itm_p.itm_nm]を[columnItmDtl_itm_nm]としてエイリアス定義。
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sls_upri_rank_cd = null;
	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sls_upri_rank_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_unit_nm = null;
	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_lot_qty = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_cur_nm = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_end_dt = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upri = null;
	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upri_bf = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_interim_flg = null;
	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upri_rate = null;
	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upri_rate_bf = null;
	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sub_upri1 = null;
	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sub_upri2 = null;
	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_sub_upri3 = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_not_cost_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnItmDtl_upd_srv_req_no = null;
	// [Wrk3]ブロック関連のField定義
	public MCPanel Wrk3Panel = null;
	// [Wrk3]ブロックの項目のField定義
	// [StdDtl]ブロック関連のField定義
	public MCPanel StdDtlPanel = null;
	public MCScrollPane StdDtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0910.StdDtlR> StdDtlTable = null;
	// [StdDtl]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_peg_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D StdDtl_itm_p_PPanel;
	public MCColumnConfig columnStdDtl_itm_cd;// [StdDtl]の[itm_p.itm_cd]を[columnStdDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnStdDtl_itm_sub1;// [StdDtl]の[itm_p.itm_sub1]を[columnStdDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnStdDtl_itm_sub2;// [StdDtl]の[itm_p.itm_sub2]を[columnStdDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnStdDtl_itm_sub3;// [StdDtl]の[itm_p.itm_sub3]を[columnStdDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnStdDtl_itm_nm;// [StdDtl]の[itm_p.itm_nm]を[columnStdDtl_itm_nm]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_unit_nm = null;
	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_lot_qty = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_cur_nm = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_end_dt = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upri = null;
	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upri_bf = null;
	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_sub_upri1 = null;
	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_sub_upri2 = null;
	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_sub_upri3 = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_not_cost_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnStdDtl_upd_srv_req_no = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0910_Sprt01]のCallerの作成 */
	protected MABSP_SlsUpriChk_MC.MA_MABSL0910_Sprt01Caller createMA_MABSL0910_Sprt01() {
		MABSP_SlsUpriChk_MC.MA_MABSL0910_Sprt01Caller<MABSP_SlsUpriChk, MA_MABSL0910_Sprt01Bridge>
		caller = ((MABSP_SlsUpriChk_MC)this).new MA_MABSL0910_Sprt01Caller<MABSP_SlsUpriChk, MA_MABSL0910_Sprt01Bridge>(
					(MABSP_SlsUpriChk)this, new MA_MABSL0910_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL0910_Sprt01]の呼び出し */
	protected void callMA_MABSL0910_Sprt01() {
		MCCaller caller = createMA_MABSL0910_Sprt01();
		caller.exec();
	}
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.DtlR> aDtlL;
	/** [CstDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.CstDtlR> aCstDtlL;
	/** [ItmDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> aItmDtlL;
	/** [StdDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.StdDtlR> aStdDtlL;
	/** [CstDtlAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.CstDtlR> aCstDtlAllL;
	/** [ItmDtlAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> aItmDtlAllL;
	/** [StdDtlAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0910.StdDtlR> aStdDtlAllL;

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0910.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0910.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0910.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.DtlR.class);
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
	 * コピーによってaCstDtlLを設定します。
	 *
	 * aCstDtlLのインスタンスは変更されません。
	 *
	 * @param dataset CstDtlL
	 */
	public void setCstDtlL(MCList<mcframe.clientMABS.MABSP0910.CstDtlR> aList) {
		if (getCstDtlL() != aList) {
			getCstDtlL().setAll(aList);
		}
	}

	/**
	 * [CstDtl]ブロックのコンテナaCstDtlLを返します。
	 *
	 * @return CstDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.CstDtlR> getCstDtlL() {
		return aCstDtlL;
	}

	/**
	 * aCstDtlRを作成します。
	 *
	 * @return CstDtlR
	 */
	public mcframe.clientMABS.MABSP0910.CstDtlR createCstDtlR() {
		return mcframe.clientMABS.MABSP0910.CstDtlR.create();
	}

	/**
	 * aCstDtlLを作成します。
	 *
	 * @return CstDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.CstDtlR> createCstDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.CstDtlR.class);
	}

	/**
	 * CstDtlTableを初期化します。
	 */
	protected void createCstDtlTable(){
		if(CstDtlTable == null){
			CstDtlTable = beansFactory.createTable2("CstDtl.table");
		}
	}

	/**
	 * コピーによってaItmDtlLを設定します。
	 *
	 * aItmDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ItmDtlL
	 */
	public void setItmDtlL(MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> aList) {
		if (getItmDtlL() != aList) {
			getItmDtlL().setAll(aList);
		}
	}

	/**
	 * [ItmDtl]ブロックのコンテナaItmDtlLを返します。
	 *
	 * @return ItmDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> getItmDtlL() {
		return aItmDtlL;
	}

	/**
	 * aItmDtlRを作成します。
	 *
	 * @return ItmDtlR
	 */
	public mcframe.clientMABS.MABSP0910.ItmDtlR createItmDtlR() {
		return mcframe.clientMABS.MABSP0910.ItmDtlR.create();
	}

	/**
	 * aItmDtlLを作成します。
	 *
	 * @return ItmDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> createItmDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.ItmDtlR.class);
	}

	/**
	 * ItmDtlTableを初期化します。
	 */
	protected void createItmDtlTable(){
		if(ItmDtlTable == null){
			ItmDtlTable = beansFactory.createTable2("ItmDtl.table");
		}
	}

	/**
	 * コピーによってaStdDtlLを設定します。
	 *
	 * aStdDtlLのインスタンスは変更されません。
	 *
	 * @param dataset StdDtlL
	 */
	public void setStdDtlL(MCList<mcframe.clientMABS.MABSP0910.StdDtlR> aList) {
		if (getStdDtlL() != aList) {
			getStdDtlL().setAll(aList);
		}
	}

	/**
	 * [StdDtl]ブロックのコンテナaStdDtlLを返します。
	 *
	 * @return StdDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.StdDtlR> getStdDtlL() {
		return aStdDtlL;
	}

	/**
	 * aStdDtlRを作成します。
	 *
	 * @return StdDtlR
	 */
	public mcframe.clientMABS.MABSP0910.StdDtlR createStdDtlR() {
		return mcframe.clientMABS.MABSP0910.StdDtlR.create();
	}

	/**
	 * aStdDtlLを作成します。
	 *
	 * @return StdDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.StdDtlR> createStdDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.StdDtlR.class);
	}

	/**
	 * StdDtlTableを初期化します。
	 */
	protected void createStdDtlTable(){
		if(StdDtlTable == null){
			StdDtlTable = beansFactory.createTable2("StdDtl.table");
		}
	}

	/**
	 * コピーによってaCstDtlAllLを設定します。
	 *
	 * aCstDtlAllLのインスタンスは変更されません。
	 *
	 * @param dataset CstDtlAllL
	 */
	public void setCstDtlAllL(MCList<mcframe.clientMABS.MABSP0910.CstDtlR> aList) {
		if (getCstDtlAllL() != aList) {
			getCstDtlAllL().setAll(aList);
		}
	}

	/**
	 * [CstDtlAll]ブロックのコンテナaCstDtlAllLを返します。
	 *
	 * @return CstDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.CstDtlR> getCstDtlAllL() {
		return aCstDtlAllL;
	}

	/**
	 * aCstDtlAllRを作成します。
	 *
	 * @return CstDtlAllR
	 */
	public mcframe.clientMABS.MABSP0910.CstDtlR createCstDtlAllR() {
		return mcframe.clientMABS.MABSP0910.CstDtlR.create();
	}

	/**
	 * aCstDtlAllLを作成します。
	 *
	 * @return CstDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.CstDtlR> createCstDtlAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.CstDtlR.class);
	}

	/**
	 * コピーによってaItmDtlAllLを設定します。
	 *
	 * aItmDtlAllLのインスタンスは変更されません。
	 *
	 * @param dataset ItmDtlAllL
	 */
	public void setItmDtlAllL(MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> aList) {
		if (getItmDtlAllL() != aList) {
			getItmDtlAllL().setAll(aList);
		}
	}

	/**
	 * [ItmDtlAll]ブロックのコンテナaItmDtlAllLを返します。
	 *
	 * @return ItmDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> getItmDtlAllL() {
		return aItmDtlAllL;
	}

	/**
	 * aItmDtlAllRを作成します。
	 *
	 * @return ItmDtlAllR
	 */
	public mcframe.clientMABS.MABSP0910.ItmDtlR createItmDtlAllR() {
		return mcframe.clientMABS.MABSP0910.ItmDtlR.create();
	}

	/**
	 * aItmDtlAllLを作成します。
	 *
	 * @return ItmDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> createItmDtlAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.ItmDtlR.class);
	}

	/**
	 * コピーによってaStdDtlAllLを設定します。
	 *
	 * aStdDtlAllLのインスタンスは変更されません。
	 *
	 * @param dataset StdDtlAllL
	 */
	public void setStdDtlAllL(MCList<mcframe.clientMABS.MABSP0910.StdDtlR> aList) {
		if (getStdDtlAllL() != aList) {
			getStdDtlAllL().setAll(aList);
		}
	}

	/**
	 * [StdDtlAll]ブロックのコンテナaStdDtlAllLを返します。
	 *
	 * @return StdDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.StdDtlR> getStdDtlAllL() {
		return aStdDtlAllL;
	}

	/**
	 * aStdDtlAllRを作成します。
	 *
	 * @return StdDtlAllR
	 */
	public mcframe.clientMABS.MABSP0910.StdDtlR createStdDtlAllR() {
		return mcframe.clientMABS.MABSP0910.StdDtlR.create();
	}

	/**
	 * aStdDtlAllLを作成します。
	 *
	 * @return StdDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0910.StdDtlR> createStdDtlAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0910.StdDtlR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getCstDtlL())) ret.add(getCstDtlL());
		if(!MCCollectionUtil.contains(ret, getItmDtlL())) ret.add(getItmDtlL());
		if(!MCCollectionUtil.contains(ret, getStdDtlL())) ret.add(getStdDtlL());
		if(!MCCollectionUtil.contains(ret, getCstDtlAllL())) ret.add(getCstDtlAllL());
		if(!MCCollectionUtil.contains(ret, getItmDtlAllL())) ret.add(getItmDtlAllL());
		if(!MCCollectionUtil.contains(ret, getStdDtlAllL())) ret.add(getStdDtlAllL());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getCstDtlL()) return "CstDtl";
		if(aCnt == getItmDtlL()) return "ItmDtl";
		if(aCnt == getStdDtlL()) return "StdDtl";
		if(aCnt == getCstDtlAllL()) return "CstDtlAll";
		if(aCnt == getItmDtlAllL()) return "ItmDtlAll";
		if(aCnt == getStdDtlAllL()) return "StdDtlAll";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("CstDtl")) return getCstDtlL();
		if(bId.equals("ItmDtl")) return getItmDtlL();
		if(bId.equals("StdDtl")) return getStdDtlL();
		if(bId.equals("CstDtlAll")) return getCstDtlAllL();
		if(bId.equals("ItmDtlAll")) return getItmDtlAllL();
		if(bId.equals("StdDtlAll")) return getStdDtlAllL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(DtlTabPanel);
		ret.add(Wrk1Panel);
		ret.add(CstDtlPanel);
		ret.add(Wrk2Panel);
		ret.add(ItmDtlPanel);
		ret.add(Wrk3Panel);
		ret.add(StdDtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_SlsUpriChk_MC_A() {
		aDtlL = createDtlL();
		aCstDtlL = createCstDtlL();
		aItmDtlL = createItmDtlL();
		aStdDtlL = createStdDtlL();
		aCstDtlAllL = createCstDtlAllL();
		aItmDtlAllL = createItmDtlAllL();
		aStdDtlAllL = createStdDtlAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_SlsUpriChk_MC_A(String name) {
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aCstDtlL = createCstDtlL();
		createCstDtlTable();
		CstDtlTable.setRowName(name);
		aItmDtlL = createItmDtlL();
		createItmDtlTable();
		ItmDtlTable.setRowName(name);
		aStdDtlL = createStdDtlL();
		createStdDtlTable();
		StdDtlTable.setRowName(name);
		aCstDtlAllL = createCstDtlAllL();
		aItmDtlAllL = createItmDtlAllL();
		aStdDtlAllL = createStdDtlAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_SlsUpriChk_MC.jbCreateWrk((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateDtlBtn((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateDtlTab((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateWrk1((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateCstDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateWrk2((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateItmDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateWrk3((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbCreateStdDtl((MABSP_SlsUpriChk)this);
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABSP_SlsUpriChk p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_SlsUpriChk p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0910.DtlR.$itm_p);
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
		p.Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0910.DtlR.$qty_p);
		p.Dtl_qty_p_PPanel.setName("Dtl.qty_p");
		p.columnDtl_qty = p.Dtl_qty_p_PPanel.columnQty_qty;
		p.columnDtl_qty.addAliasName("Dtl.qty", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_SlsUpriChk p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABSP_SlsUpriChk p) {
	}

	/**
	 * [Wrk1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1(MABSP_SlsUpriChk p) {
	}

	/**
	 * [CstDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstDtl(MABSP_SlsUpriChk p) {
		p.CstDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0910.CstDtlR.$itm_p);
		p.CstDtl_itm_p_PPanel.setName("CstDtl.itm_p");
		p.columnCstDtl_itm_cd = p.CstDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnCstDtl_itm_cd.addAliasName("CstDtl.itm_cd", p);
		p.columnCstDtl_itm_sub1 = p.CstDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnCstDtl_itm_sub1.addAliasName("CstDtl.itm_sub1", p);
		p.columnCstDtl_itm_sub2 = p.CstDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnCstDtl_itm_sub2.addAliasName("CstDtl.itm_sub2", p);
		p.columnCstDtl_itm_sub3 = p.CstDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnCstDtl_itm_sub3.addAliasName("CstDtl.itm_sub3", p);
		p.columnCstDtl_itm_nm = p.CstDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnCstDtl_itm_nm.addAliasName("CstDtl.itm_nm", p);
	}

	/**
	 * [Wrk2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2(MABSP_SlsUpriChk p) {
	}

	/**
	 * [ItmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmDtl(MABSP_SlsUpriChk p) {
		p.ItmDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0910.ItmDtlR.$itm_p);
		p.ItmDtl_itm_p_PPanel.setName("ItmDtl.itm_p");
		p.columnItmDtl_itm_cd = p.ItmDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmDtl_itm_cd.addAliasName("ItmDtl.itm_cd", p);
		p.columnItmDtl_itm_sub1 = p.ItmDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmDtl_itm_sub1.addAliasName("ItmDtl.itm_sub1", p);
		p.columnItmDtl_itm_sub2 = p.ItmDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmDtl_itm_sub2.addAliasName("ItmDtl.itm_sub2", p);
		p.columnItmDtl_itm_sub3 = p.ItmDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmDtl_itm_sub3.addAliasName("ItmDtl.itm_sub3", p);
		p.columnItmDtl_itm_nm = p.ItmDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmDtl_itm_nm.addAliasName("ItmDtl.itm_nm", p);
	}

	/**
	 * [Wrk3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3(MABSP_SlsUpriChk p) {
	}

	/**
	 * [StdDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateStdDtl(MABSP_SlsUpriChk p) {
		p.StdDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0910.StdDtlR.$itm_p);
		p.StdDtl_itm_p_PPanel.setName("StdDtl.itm_p");
		p.columnStdDtl_itm_cd = p.StdDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnStdDtl_itm_cd.addAliasName("StdDtl.itm_cd", p);
		p.columnStdDtl_itm_sub1 = p.StdDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnStdDtl_itm_sub1.addAliasName("StdDtl.itm_sub1", p);
		p.columnStdDtl_itm_sub2 = p.StdDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnStdDtl_itm_sub2.addAliasName("StdDtl.itm_sub2", p);
		p.columnStdDtl_itm_sub3 = p.StdDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnStdDtl_itm_sub3.addAliasName("StdDtl.itm_sub3", p);
		p.columnStdDtl_itm_nm = p.StdDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnStdDtl_itm_nm.addAliasName("StdDtl.itm_nm", p);
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

	
	/** [Dtl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_cd_p = null;

	/**
	 * [Dtl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_cd_ListPutter() {
		if (Dtl_dpt_cd_p == null) {
			Dtl_dpt_cd_p = createDtl_dpt_cd_ListPutter(columnDtl_dpt_cd, "dpt_cd", "dpt_nm","wg_cd","wg_nm");

		}
		return Dtl_dpt_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","sls_upri_grp_cd","unit_cd");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","sls_upri_grp_cd","unit_cd");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","sls_upri_grp_cd","unit_cd");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sls_upri_grp_cd","unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_sls_upri_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_upri_grp_cd_p = null;

	/**
	 * [Dtl_sls_upri_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_upri_grp_cd_ListPutter() {
		if (Dtl_sls_upri_grp_cd_p == null) {
			Dtl_sls_upri_grp_cd_p = createDtl_sls_upri_grp_cd_ListPutter(columnDtl_sls_upri_grp_cd, "sls_upri_grp_cd", "sls_upri_grp_nm");

		}
		return Dtl_sls_upri_grp_cd_p;
	}
	
	
	/** [Dtl_cst_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_cd_p = null;

	/**
	 * [Dtl_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_cd_ListPutter() {
		if (Dtl_cst_cd_p == null) {
			Dtl_cst_cd_p = createDtl_cst_cd_ListPutter(columnDtl_cst_cd, "cst_cd", "cst_nm","cur_cd","cur_nm");

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
	
	
	/** [Dtl_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cur_cd_p = null;

	/**
	 * [Dtl_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cur_cd_ListPutter() {
		if (Dtl_cur_cd_p == null) {
			Dtl_cur_cd_p = createDtl_cur_cd_ListPutter(columnDtl_cur_cd, "cur_cd", "cur_nm");

		}
		return Dtl_cur_cd_p;
	}
	
	
	/** [Dtl_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_unit_cd_p = null;

	/**
	 * [Dtl_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_unit_cd_ListPutter() {
		if (Dtl_unit_cd_p == null) {
			Dtl_unit_cd_p = createDtl_unit_cd_ListPutter(columnDtl_unit_cd, "unit_cd", "unit_nm","dec_place");

		}
		return Dtl_unit_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_SlsUpriChk create(){
		MABSP_SlsUpriChk p = new MABSP_SlsUpriChk();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_SlsUpriChk create(String name){
		MABSP_SlsUpriChk p = new MABSP_SlsUpriChk(name);
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
		MABSP_SlsUpriChk_MC.jbfInitWrk((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitDtlBtn((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitDtlTab((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitWrk1((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitCstDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitWrk2((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitItmDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitWrk3((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbfInitStdDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitWrk((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitDtlBtn((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitDtlTab((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitWrk1((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitCstDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitWrk2((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitItmDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitWrk3((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.jbInitStdDtl((MABSP_SlsUpriChk)this);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_peg_no = p.beansFactory.createTableColumn("Dtl.peg_no", MCColumnType.NUMBER);
		p.columnDtl_dt = p.beansFactory.createTableColumn("Dtl.dt", MCColumnType.DATE);
		p.columnDtl_dpt_cd = p.beansFactory.createTableColumn("Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_nm = p.beansFactory.createTableColumn("Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_sls_upri_grp_cd = p.beansFactory.createTableColumn("Dtl.sls_upri_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_upri_grp_nm = p.beansFactory.createTableColumn("Dtl.sls_upri_grp_nm", MCColumnType.TEXT);
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
		p.columnDtl_cur_cd = p.beansFactory.createTableColumn("Dtl.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cur_nm = p.beansFactory.createTableColumn("Dtl.cur_nm", MCColumnType.TEXT);
		p.columnDtl_unit_cd = p.beansFactory.createTableColumn("Dtl.unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_unit_nm = p.beansFactory.createTableColumn("Dtl.unit_nm", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_sls_upri = p.beansFactory.createTableColumn("Dtl.sls_upri", MCColumnType.NUMBER);
		p.columnDtl_interim_flg = p.beansFactory.createTableColumn("Dtl.interim_flg", MCColumnType.CHECK);
		p.columnDtl_err_flg = p.beansFactory.createTableColumn("Dtl.err_flg", MCColumnType.CHECK);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_get_upri = p.beansFactory.createButton("DtlBtn.get_upri");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.Wrk1Panel = p.beansFactory.createPanel("Wrk1");
		// ブロックの項目の初期化
	}

	/**
	 * [CstDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.CstDtlPanel = p.beansFactory.createPanel("CstDtl");
		p.CstDtlScrollPane = p.beansFactory.createScrollPane("CstDtl.scroll");
		p.createCstDtlTable();
		// ブロックの項目の初期化
		p.columnCstDtl_peg_no = p.beansFactory.createTableColumn("CstDtl.peg_no", MCColumnType.NUMBER);
		p.columnCstDtl_wg_cd = p.beansFactory.createTableColumn("CstDtl.wg_cd", MCColumnType.TEXT);
		p.columnCstDtl_wg_nm = p.beansFactory.createTableColumn("CstDtl.wg_nm", MCColumnType.TEXT);
		p.columnCstDtl_cst_cd = p.beansFactory.createTableColumn("CstDtl.cst_cd", MCColumnType.TEXT);
		p.columnCstDtl_cst_nm = p.beansFactory.createTableColumn("CstDtl.cst_nm", MCColumnType.TEXT);
		p.columnCstDtl_dlv_cd = p.beansFactory.createTableColumn("CstDtl.dlv_cd", MCColumnType.TEXT);
		p.columnCstDtl_dlv_nm = p.beansFactory.createTableColumn("CstDtl.dlv_nm", MCColumnType.TEXT);
		p.columnCstDtl_dest_cd1 = p.beansFactory.createTableColumn("CstDtl.dest_cd1", MCColumnType.TEXT);
		p.columnCstDtl_dest_nm1 = p.beansFactory.createTableColumn("CstDtl.dest_nm1", MCColumnType.TEXT);
		p.columnCstDtl_dest_cd2 = p.beansFactory.createTableColumn("CstDtl.dest_cd2", MCColumnType.TEXT);
		p.columnCstDtl_dest_nm2 = p.beansFactory.createTableColumn("CstDtl.dest_nm2", MCColumnType.TEXT);
		p.columnCstDtl_dest_cd3 = p.beansFactory.createTableColumn("CstDtl.dest_cd3", MCColumnType.TEXT);
		p.columnCstDtl_dest_nm3 = p.beansFactory.createTableColumn("CstDtl.dest_nm3", MCColumnType.TEXT);
		p.columnCstDtl_sls_upri_grp_cd = p.beansFactory.createTableColumn("CstDtl.sls_upri_grp_cd", MCColumnType.TEXT);
		p.columnCstDtl_sls_upri_grp_nm = p.beansFactory.createTableColumn("CstDtl.sls_upri_grp_nm", MCColumnType.TEXT);
		p.columnCstDtl_unit_cd = p.beansFactory.createTableColumn("CstDtl.unit_cd", MCColumnType.TEXT);
		p.columnCstDtl_unit_nm = p.beansFactory.createTableColumn("CstDtl.unit_nm", MCColumnType.TEXT);
		p.columnCstDtl_lot_qty = p.beansFactory.createTableColumn("CstDtl.lot_qty", MCColumnType.NUMBER);
		p.columnCstDtl_cur_cd = p.beansFactory.createTableColumn("CstDtl.cur_cd", MCColumnType.TEXT);
		p.columnCstDtl_cur_nm = p.beansFactory.createTableColumn("CstDtl.cur_nm", MCColumnType.TEXT);
		p.columnCstDtl_st_dt = p.beansFactory.createTableColumn("CstDtl.st_dt", MCColumnType.DATE);
		p.columnCstDtl_end_dt = p.beansFactory.createTableColumn("CstDtl.end_dt", MCColumnType.DATE);
		p.columnCstDtl_upri = p.beansFactory.createTableColumn("CstDtl.upri", MCColumnType.NUMBER);
		p.columnCstDtl_upri_bf = p.beansFactory.createTableColumn("CstDtl.upri_bf", MCColumnType.NUMBER);
		p.columnCstDtl_interim_flg = p.beansFactory.createTableColumn("CstDtl.interim_flg", MCColumnType.CHECK);
		p.columnCstDtl_upri_rate = p.beansFactory.createTableColumn("CstDtl.upri_rate", MCColumnType.NUMBER);
		p.columnCstDtl_upri_rate_bf = p.beansFactory.createTableColumn("CstDtl.upri_rate_bf", MCColumnType.NUMBER);
		p.columnCstDtl_sub_upri1 = p.beansFactory.createTableColumn("CstDtl.sub_upri1", MCColumnType.NUMBER);
		p.columnCstDtl_sub_upri2 = p.beansFactory.createTableColumn("CstDtl.sub_upri2", MCColumnType.NUMBER);
		p.columnCstDtl_sub_upri3 = p.beansFactory.createTableColumn("CstDtl.sub_upri3", MCColumnType.NUMBER);
		p.columnCstDtl_not_cost_flg = p.beansFactory.createTableColumn("CstDtl.not_cost_flg", MCColumnType.CHECK);
		p.columnCstDtl_memo1 = p.beansFactory.createTableColumn("CstDtl.memo1", MCColumnType.TEXT);
		p.columnCstDtl_memo2 = p.beansFactory.createTableColumn("CstDtl.memo2", MCColumnType.TEXT);
		p.columnCstDtl_memo3 = p.beansFactory.createTableColumn("CstDtl.memo3", MCColumnType.TEXT);
		p.columnCstDtl_ins_usr_id = p.beansFactory.createTableColumn("CstDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnCstDtl_ins_usr_nm = p.beansFactory.createTableColumn("CstDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnCstDtl_ins_ts = p.beansFactory.createTableColumn("CstDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnCstDtl_ins_func_id = p.beansFactory.createTableColumn("CstDtl.ins_func_id", MCColumnType.TEXT);
		p.columnCstDtl_ins_func_nm = p.beansFactory.createTableColumn("CstDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnCstDtl_upd_usr_id = p.beansFactory.createTableColumn("CstDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnCstDtl_upd_usr_nm = p.beansFactory.createTableColumn("CstDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnCstDtl_upd_ts = p.beansFactory.createTableColumn("CstDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnCstDtl_upd_func_id = p.beansFactory.createTableColumn("CstDtl.upd_func_id", MCColumnType.TEXT);
		p.columnCstDtl_upd_func_nm = p.beansFactory.createTableColumn("CstDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnCstDtl_upd_srv_req_no = p.beansFactory.createTableColumn("CstDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.Wrk2Panel = p.beansFactory.createPanel("Wrk2");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.ItmDtlPanel = p.beansFactory.createPanel("ItmDtl");
		p.ItmDtlScrollPane = p.beansFactory.createScrollPane("ItmDtl.scroll");
		p.createItmDtlTable();
		// ブロックの項目の初期化
		p.columnItmDtl_peg_no = p.beansFactory.createTableColumn("ItmDtl.peg_no", MCColumnType.NUMBER);
		p.columnItmDtl_wg_cd = p.beansFactory.createTableColumn("ItmDtl.wg_cd", MCColumnType.TEXT);
		p.columnItmDtl_wg_nm = p.beansFactory.createTableColumn("ItmDtl.wg_nm", MCColumnType.TEXT);
		p.columnItmDtl_sls_upri_grp_cd = p.beansFactory.createTableColumn("ItmDtl.sls_upri_grp_cd", MCColumnType.TEXT);
		p.columnItmDtl_sls_upri_grp_nm = p.beansFactory.createTableColumn("ItmDtl.sls_upri_grp_nm", MCColumnType.TEXT);
		p.columnItmDtl_sls_upri_rank_cd = p.beansFactory.createTableColumn("ItmDtl.sls_upri_rank_cd", MCColumnType.TEXT);
		p.columnItmDtl_sls_upri_rank_nm = p.beansFactory.createTableColumn("ItmDtl.sls_upri_rank_nm", MCColumnType.TEXT);
		p.columnItmDtl_unit_cd = p.beansFactory.createTableColumn("ItmDtl.unit_cd", MCColumnType.TEXT);
		p.columnItmDtl_unit_nm = p.beansFactory.createTableColumn("ItmDtl.unit_nm", MCColumnType.TEXT);
		p.columnItmDtl_lot_qty = p.beansFactory.createTableColumn("ItmDtl.lot_qty", MCColumnType.NUMBER);
		p.columnItmDtl_cur_cd = p.beansFactory.createTableColumn("ItmDtl.cur_cd", MCColumnType.TEXT);
		p.columnItmDtl_cur_nm = p.beansFactory.createTableColumn("ItmDtl.cur_nm", MCColumnType.TEXT);
		p.columnItmDtl_st_dt = p.beansFactory.createTableColumn("ItmDtl.st_dt", MCColumnType.DATE);
		p.columnItmDtl_end_dt = p.beansFactory.createTableColumn("ItmDtl.end_dt", MCColumnType.DATE);
		p.columnItmDtl_upri = p.beansFactory.createTableColumn("ItmDtl.upri", MCColumnType.NUMBER);
		p.columnItmDtl_upri_bf = p.beansFactory.createTableColumn("ItmDtl.upri_bf", MCColumnType.NUMBER);
		p.columnItmDtl_interim_flg = p.beansFactory.createTableColumn("ItmDtl.interim_flg", MCColumnType.CHECK);
		p.columnItmDtl_upri_rate = p.beansFactory.createTableColumn("ItmDtl.upri_rate", MCColumnType.NUMBER);
		p.columnItmDtl_upri_rate_bf = p.beansFactory.createTableColumn("ItmDtl.upri_rate_bf", MCColumnType.NUMBER);
		p.columnItmDtl_sub_upri1 = p.beansFactory.createTableColumn("ItmDtl.sub_upri1", MCColumnType.NUMBER);
		p.columnItmDtl_sub_upri2 = p.beansFactory.createTableColumn("ItmDtl.sub_upri2", MCColumnType.NUMBER);
		p.columnItmDtl_sub_upri3 = p.beansFactory.createTableColumn("ItmDtl.sub_upri3", MCColumnType.NUMBER);
		p.columnItmDtl_not_cost_flg = p.beansFactory.createTableColumn("ItmDtl.not_cost_flg", MCColumnType.CHECK);
		p.columnItmDtl_memo1 = p.beansFactory.createTableColumn("ItmDtl.memo1", MCColumnType.TEXT);
		p.columnItmDtl_memo2 = p.beansFactory.createTableColumn("ItmDtl.memo2", MCColumnType.TEXT);
		p.columnItmDtl_memo3 = p.beansFactory.createTableColumn("ItmDtl.memo3", MCColumnType.TEXT);
		p.columnItmDtl_ins_usr_id = p.beansFactory.createTableColumn("ItmDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnItmDtl_ins_usr_nm = p.beansFactory.createTableColumn("ItmDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnItmDtl_ins_ts = p.beansFactory.createTableColumn("ItmDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnItmDtl_ins_func_id = p.beansFactory.createTableColumn("ItmDtl.ins_func_id", MCColumnType.TEXT);
		p.columnItmDtl_ins_func_nm = p.beansFactory.createTableColumn("ItmDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnItmDtl_upd_usr_id = p.beansFactory.createTableColumn("ItmDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnItmDtl_upd_usr_nm = p.beansFactory.createTableColumn("ItmDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnItmDtl_upd_ts = p.beansFactory.createTableColumn("ItmDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnItmDtl_upd_func_id = p.beansFactory.createTableColumn("ItmDtl.upd_func_id", MCColumnType.TEXT);
		p.columnItmDtl_upd_func_nm = p.beansFactory.createTableColumn("ItmDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnItmDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ItmDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.Wrk3Panel = p.beansFactory.createPanel("Wrk3");
		// ブロックの項目の初期化
	}

	/**
	 * [StdDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitStdDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.StdDtlPanel = p.beansFactory.createPanel("StdDtl");
		p.StdDtlScrollPane = p.beansFactory.createScrollPane("StdDtl.scroll");
		p.createStdDtlTable();
		// ブロックの項目の初期化
		p.columnStdDtl_peg_no = p.beansFactory.createTableColumn("StdDtl.peg_no", MCColumnType.NUMBER);
		p.columnStdDtl_wg_cd = p.beansFactory.createTableColumn("StdDtl.wg_cd", MCColumnType.TEXT);
		p.columnStdDtl_wg_nm = p.beansFactory.createTableColumn("StdDtl.wg_nm", MCColumnType.TEXT);
		p.columnStdDtl_unit_cd = p.beansFactory.createTableColumn("StdDtl.unit_cd", MCColumnType.TEXT);
		p.columnStdDtl_unit_nm = p.beansFactory.createTableColumn("StdDtl.unit_nm", MCColumnType.TEXT);
		p.columnStdDtl_lot_qty = p.beansFactory.createTableColumn("StdDtl.lot_qty", MCColumnType.NUMBER);
		p.columnStdDtl_cur_cd = p.beansFactory.createTableColumn("StdDtl.cur_cd", MCColumnType.TEXT);
		p.columnStdDtl_cur_nm = p.beansFactory.createTableColumn("StdDtl.cur_nm", MCColumnType.TEXT);
		p.columnStdDtl_st_dt = p.beansFactory.createTableColumn("StdDtl.st_dt", MCColumnType.DATE);
		p.columnStdDtl_end_dt = p.beansFactory.createTableColumn("StdDtl.end_dt", MCColumnType.DATE);
		p.columnStdDtl_upri = p.beansFactory.createTableColumn("StdDtl.upri", MCColumnType.NUMBER);
		p.columnStdDtl_upri_bf = p.beansFactory.createTableColumn("StdDtl.upri_bf", MCColumnType.NUMBER);
		p.columnStdDtl_sub_upri1 = p.beansFactory.createTableColumn("StdDtl.sub_upri1", MCColumnType.NUMBER);
		p.columnStdDtl_sub_upri2 = p.beansFactory.createTableColumn("StdDtl.sub_upri2", MCColumnType.NUMBER);
		p.columnStdDtl_sub_upri3 = p.beansFactory.createTableColumn("StdDtl.sub_upri3", MCColumnType.NUMBER);
		p.columnStdDtl_not_cost_flg = p.beansFactory.createTableColumn("StdDtl.not_cost_flg", MCColumnType.CHECK);
		p.columnStdDtl_memo1 = p.beansFactory.createTableColumn("StdDtl.memo1", MCColumnType.TEXT);
		p.columnStdDtl_memo2 = p.beansFactory.createTableColumn("StdDtl.memo2", MCColumnType.TEXT);
		p.columnStdDtl_memo3 = p.beansFactory.createTableColumn("StdDtl.memo3", MCColumnType.TEXT);
		p.columnStdDtl_ins_usr_id = p.beansFactory.createTableColumn("StdDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnStdDtl_ins_usr_nm = p.beansFactory.createTableColumn("StdDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnStdDtl_ins_ts = p.beansFactory.createTableColumn("StdDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnStdDtl_ins_func_id = p.beansFactory.createTableColumn("StdDtl.ins_func_id", MCColumnType.TEXT);
		p.columnStdDtl_ins_func_nm = p.beansFactory.createTableColumn("StdDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnStdDtl_upd_usr_id = p.beansFactory.createTableColumn("StdDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnStdDtl_upd_usr_nm = p.beansFactory.createTableColumn("StdDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnStdDtl_upd_ts = p.beansFactory.createTableColumn("StdDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnStdDtl_upd_func_id = p.beansFactory.createTableColumn("StdDtl.upd_func_id", MCColumnType.TEXT);
		p.columnStdDtl_upd_func_nm = p.beansFactory.createTableColumn("StdDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnStdDtl_upd_srv_req_no = p.beansFactory.createTableColumn("StdDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.setLastBeans(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.DtlTabPanel);
		p.WrkPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.DtlPanel.setBorder(p.DtlTitledBorder);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setValueCheck(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_get_upri);
		p.DtlBtn_get_upri.setFunctionKey(MCFunctionKey.F7);
		p.DtlBtnPanel.add(p.DtlBtn_get_upri);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.add(p.DtlTabPanel);
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Wrk1Panel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Wrk1Panel);
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.DtlTabTab.add(p.Wrk2Panel, "DtlTab.tab2");
		p.Wrk2Panel.setNextBeans(p.Wrk3Panel);
		p.DtlTabTab.add(p.Wrk3Panel, "DtlTab.tab3");
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.Wrk1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Wrk1Panel.add(p.CstDtlPanel, null);
		p.Wrk1Panel.setLastBeans(p.CstDtlPanel);
	}

	/**
	 * [CstDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.CstDtlPanel.add(p.CstDtlScrollPane);
		p.CstDtlPanel.setLastBeans(p.CstDtlTable);
		p.CstDtlScrollPane.setViewportView(p.CstDtlTable);
		p.CstDtlTable.setList(p.getCstDtlL());
		p.CstDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.Wrk2Panel.setNextBeans(p.Wrk3Panel);
		p.Wrk2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Wrk2Panel.add(p.ItmDtlPanel, null);
		p.Wrk2Panel.setLastBeans(p.ItmDtlPanel);
	}

	/**
	 * [ItmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.ItmDtlPanel.add(p.ItmDtlScrollPane);
		p.ItmDtlPanel.setLastBeans(p.ItmDtlTable);
		p.ItmDtlScrollPane.setViewportView(p.ItmDtlTable);
		p.ItmDtlTable.setList(p.getItmDtlL());
		p.ItmDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.Wrk3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Wrk3Panel.add(p.StdDtlPanel, null);
		p.Wrk3Panel.setLastBeans(p.StdDtlPanel);
	}

	/**
	 * [StdDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitStdDtl(MABSP_SlsUpriChk p) {
		// ブロック関連の初期化
		p.StdDtlPanel.add(p.StdDtlScrollPane);
		p.StdDtlPanel.setLastBeans(p.StdDtlTable);
		p.StdDtlScrollPane.setViewportView(p.StdDtlTable);
		p.StdDtlTable.setList(p.getStdDtlL());
		p.StdDtlPanel.setLayoutPosition("C");
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
		MABSP_SlsUpriChk_MC.mcInitWrk((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitDtlBtn((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitDtlTab((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitWrk1((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitCstDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitWrk2((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitItmDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitWrk3((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.mcInitStdDtl((MABSP_SlsUpriChk)this);

		// [SRCH]ステータスのモードの設定
		MABSP_SlsUpriChk_MC.statusInitSRCH_Wrk((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_Dtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_DtlBtn((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_DtlTab((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_Wrk1((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_CstDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_Wrk2((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_ItmDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_Wrk3((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_StdDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_CstDtlAll((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_ItmDtlAll((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.statusInitSRCH_StdDtlAll((MABSP_SlsUpriChk)this);

	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABSP_SlsUpriChk p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_SlsUpriChk p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_peg_no.addAllListener(p);
		p.columnDtl_peg_no.setListListener(p);
		p.columnDtl_dt.addAllListener(p);
		p.columnDtl_dt.setListListener(p);
		p.columnDtl_dpt_cd.addAllListener(p);
		p.columnDtl_dpt_cd.setListListener(p);
		p.columnDtl_dpt_nm.addAllListener(p);
		p.columnDtl_dpt_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_sls_upri_grp_cd.addAllListener(p);
		p.columnDtl_sls_upri_grp_cd.setListListener(p);
		p.columnDtl_sls_upri_grp_nm.addAllListener(p);
		p.columnDtl_sls_upri_grp_nm.setListListener(p);
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
		p.columnDtl_cur_cd.addAllListener(p);
		p.columnDtl_cur_cd.setListListener(p);
		p.columnDtl_cur_nm.addAllListener(p);
		p.columnDtl_cur_nm.setListListener(p);
		p.columnDtl_unit_cd.addAllListener(p);
		p.columnDtl_unit_cd.setListListener(p);
		p.columnDtl_unit_nm.addAllListener(p);
		p.columnDtl_unit_nm.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_sls_upri.addAllListener(p);
		p.columnDtl_sls_upri.setListListener(p);
		p.columnDtl_interim_flg.addAllListener(p);
		p.columnDtl_err_flg.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABSP_SlsUpriChk p) {
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
		p.DtlBtn_get_upri.addAllListener(p);
		p.DtlBtn_get_upri.setAPMethodName("doDtlBtn_get_upri");
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABSP_SlsUpriChk p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1(MABSP_SlsUpriChk p) {
	}

	/**
	 *  [CstDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstDtl(MABSP_SlsUpriChk p) {
		p.CstDtlTable.addAllListener(p);
		p.columnCstDtl_peg_no.addAllListener(p);
		p.columnCstDtl_peg_no.setListListener(p);
		p.columnCstDtl_wg_cd.addAllListener(p);
		p.columnCstDtl_wg_cd.setListListener(p);
		p.columnCstDtl_wg_nm.addAllListener(p);
		p.columnCstDtl_wg_nm.setListListener(p);
		p.columnCstDtl_cst_cd.addAllListener(p);
		p.columnCstDtl_cst_cd.setListListener(p);
		p.columnCstDtl_cst_nm.addAllListener(p);
		p.columnCstDtl_cst_nm.setListListener(p);
		p.columnCstDtl_dlv_cd.addAllListener(p);
		p.columnCstDtl_dlv_cd.setListListener(p);
		p.columnCstDtl_dlv_nm.addAllListener(p);
		p.columnCstDtl_dlv_nm.setListListener(p);
		p.columnCstDtl_dest_cd1.addAllListener(p);
		p.columnCstDtl_dest_cd1.setListListener(p);
		p.columnCstDtl_dest_nm1.addAllListener(p);
		p.columnCstDtl_dest_nm1.setListListener(p);
		p.columnCstDtl_dest_cd2.addAllListener(p);
		p.columnCstDtl_dest_cd2.setListListener(p);
		p.columnCstDtl_dest_nm2.addAllListener(p);
		p.columnCstDtl_dest_nm2.setListListener(p);
		p.columnCstDtl_dest_cd3.addAllListener(p);
		p.columnCstDtl_dest_cd3.setListListener(p);
		p.columnCstDtl_dest_nm3.addAllListener(p);
		p.columnCstDtl_dest_nm3.setListListener(p);
		p.columnCstDtl_sls_upri_grp_cd.addAllListener(p);
		p.columnCstDtl_sls_upri_grp_cd.setListListener(p);
		p.columnCstDtl_sls_upri_grp_nm.addAllListener(p);
		p.columnCstDtl_sls_upri_grp_nm.setListListener(p);
		p.columnCstDtl_unit_cd.addAllListener(p);
		p.columnCstDtl_unit_cd.setListListener(p);
		p.columnCstDtl_unit_nm.addAllListener(p);
		p.columnCstDtl_unit_nm.setListListener(p);
		p.columnCstDtl_lot_qty.addAllListener(p);
		p.columnCstDtl_lot_qty.setListListener(p);
		p.columnCstDtl_cur_cd.addAllListener(p);
		p.columnCstDtl_cur_cd.setListListener(p);
		p.columnCstDtl_cur_nm.addAllListener(p);
		p.columnCstDtl_cur_nm.setListListener(p);
		p.columnCstDtl_st_dt.addAllListener(p);
		p.columnCstDtl_st_dt.setListListener(p);
		p.columnCstDtl_end_dt.addAllListener(p);
		p.columnCstDtl_end_dt.setListListener(p);
		p.columnCstDtl_upri.addAllListener(p);
		p.columnCstDtl_upri.setListListener(p);
		p.columnCstDtl_upri_bf.addAllListener(p);
		p.columnCstDtl_upri_bf.setListListener(p);
		p.columnCstDtl_interim_flg.addAllListener(p);
		p.columnCstDtl_upri_rate.addAllListener(p);
		p.columnCstDtl_upri_rate.setListListener(p);
		p.columnCstDtl_upri_rate_bf.addAllListener(p);
		p.columnCstDtl_upri_rate_bf.setListListener(p);
		p.columnCstDtl_sub_upri1.addAllListener(p);
		p.columnCstDtl_sub_upri1.setListListener(p);
		p.columnCstDtl_sub_upri2.addAllListener(p);
		p.columnCstDtl_sub_upri2.setListListener(p);
		p.columnCstDtl_sub_upri3.addAllListener(p);
		p.columnCstDtl_sub_upri3.setListListener(p);
		p.columnCstDtl_not_cost_flg.addAllListener(p);
		p.columnCstDtl_memo1.addAllListener(p);
		p.columnCstDtl_memo1.setListListener(p);
		p.columnCstDtl_memo2.addAllListener(p);
		p.columnCstDtl_memo2.setListListener(p);
		p.columnCstDtl_memo3.addAllListener(p);
		p.columnCstDtl_memo3.setListListener(p);
		p.columnCstDtl_ins_usr_id.addAllListener(p);
		p.columnCstDtl_ins_usr_id.setListListener(p);
		p.columnCstDtl_ins_usr_nm.addAllListener(p);
		p.columnCstDtl_ins_usr_nm.setListListener(p);
		p.columnCstDtl_ins_ts.addAllListener(p);
		p.columnCstDtl_ins_ts.setListListener(p);
		p.columnCstDtl_ins_func_id.addAllListener(p);
		p.columnCstDtl_ins_func_id.setListListener(p);
		p.columnCstDtl_ins_func_nm.addAllListener(p);
		p.columnCstDtl_ins_func_nm.setListListener(p);
		p.columnCstDtl_upd_usr_id.addAllListener(p);
		p.columnCstDtl_upd_usr_id.setListListener(p);
		p.columnCstDtl_upd_usr_nm.addAllListener(p);
		p.columnCstDtl_upd_usr_nm.setListListener(p);
		p.columnCstDtl_upd_ts.addAllListener(p);
		p.columnCstDtl_upd_ts.setListListener(p);
		p.columnCstDtl_upd_func_id.addAllListener(p);
		p.columnCstDtl_upd_func_id.setListListener(p);
		p.columnCstDtl_upd_func_nm.addAllListener(p);
		p.columnCstDtl_upd_func_nm.setListListener(p);
		p.columnCstDtl_upd_srv_req_no.addAllListener(p);
		p.columnCstDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Wrk2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2(MABSP_SlsUpriChk p) {
	}

	/**
	 *  [ItmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmDtl(MABSP_SlsUpriChk p) {
		p.ItmDtlTable.addAllListener(p);
		p.columnItmDtl_peg_no.addAllListener(p);
		p.columnItmDtl_peg_no.setListListener(p);
		p.columnItmDtl_wg_cd.addAllListener(p);
		p.columnItmDtl_wg_cd.setListListener(p);
		p.columnItmDtl_wg_nm.addAllListener(p);
		p.columnItmDtl_wg_nm.setListListener(p);
		p.columnItmDtl_sls_upri_grp_cd.addAllListener(p);
		p.columnItmDtl_sls_upri_grp_cd.setListListener(p);
		p.columnItmDtl_sls_upri_grp_nm.addAllListener(p);
		p.columnItmDtl_sls_upri_grp_nm.setListListener(p);
		p.columnItmDtl_sls_upri_rank_cd.addAllListener(p);
		p.columnItmDtl_sls_upri_rank_cd.setListListener(p);
		p.columnItmDtl_sls_upri_rank_nm.addAllListener(p);
		p.columnItmDtl_sls_upri_rank_nm.setListListener(p);
		p.columnItmDtl_unit_cd.addAllListener(p);
		p.columnItmDtl_unit_cd.setListListener(p);
		p.columnItmDtl_unit_nm.addAllListener(p);
		p.columnItmDtl_unit_nm.setListListener(p);
		p.columnItmDtl_lot_qty.addAllListener(p);
		p.columnItmDtl_lot_qty.setListListener(p);
		p.columnItmDtl_cur_cd.addAllListener(p);
		p.columnItmDtl_cur_cd.setListListener(p);
		p.columnItmDtl_cur_nm.addAllListener(p);
		p.columnItmDtl_cur_nm.setListListener(p);
		p.columnItmDtl_st_dt.addAllListener(p);
		p.columnItmDtl_st_dt.setListListener(p);
		p.columnItmDtl_end_dt.addAllListener(p);
		p.columnItmDtl_end_dt.setListListener(p);
		p.columnItmDtl_upri.addAllListener(p);
		p.columnItmDtl_upri.setListListener(p);
		p.columnItmDtl_upri_bf.addAllListener(p);
		p.columnItmDtl_upri_bf.setListListener(p);
		p.columnItmDtl_interim_flg.addAllListener(p);
		p.columnItmDtl_upri_rate.addAllListener(p);
		p.columnItmDtl_upri_rate.setListListener(p);
		p.columnItmDtl_upri_rate_bf.addAllListener(p);
		p.columnItmDtl_upri_rate_bf.setListListener(p);
		p.columnItmDtl_sub_upri1.addAllListener(p);
		p.columnItmDtl_sub_upri1.setListListener(p);
		p.columnItmDtl_sub_upri2.addAllListener(p);
		p.columnItmDtl_sub_upri2.setListListener(p);
		p.columnItmDtl_sub_upri3.addAllListener(p);
		p.columnItmDtl_sub_upri3.setListListener(p);
		p.columnItmDtl_not_cost_flg.addAllListener(p);
		p.columnItmDtl_memo1.addAllListener(p);
		p.columnItmDtl_memo1.setListListener(p);
		p.columnItmDtl_memo2.addAllListener(p);
		p.columnItmDtl_memo2.setListListener(p);
		p.columnItmDtl_memo3.addAllListener(p);
		p.columnItmDtl_memo3.setListListener(p);
		p.columnItmDtl_ins_usr_id.addAllListener(p);
		p.columnItmDtl_ins_usr_id.setListListener(p);
		p.columnItmDtl_ins_usr_nm.addAllListener(p);
		p.columnItmDtl_ins_usr_nm.setListListener(p);
		p.columnItmDtl_ins_ts.addAllListener(p);
		p.columnItmDtl_ins_ts.setListListener(p);
		p.columnItmDtl_ins_func_id.addAllListener(p);
		p.columnItmDtl_ins_func_id.setListListener(p);
		p.columnItmDtl_ins_func_nm.addAllListener(p);
		p.columnItmDtl_ins_func_nm.setListListener(p);
		p.columnItmDtl_upd_usr_id.addAllListener(p);
		p.columnItmDtl_upd_usr_id.setListListener(p);
		p.columnItmDtl_upd_usr_nm.addAllListener(p);
		p.columnItmDtl_upd_usr_nm.setListListener(p);
		p.columnItmDtl_upd_ts.addAllListener(p);
		p.columnItmDtl_upd_ts.setListListener(p);
		p.columnItmDtl_upd_func_id.addAllListener(p);
		p.columnItmDtl_upd_func_id.setListListener(p);
		p.columnItmDtl_upd_func_nm.addAllListener(p);
		p.columnItmDtl_upd_func_nm.setListListener(p);
		p.columnItmDtl_upd_srv_req_no.addAllListener(p);
		p.columnItmDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Wrk3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3(MABSP_SlsUpriChk p) {
	}

	/**
	 *  [StdDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitStdDtl(MABSP_SlsUpriChk p) {
		p.StdDtlTable.addAllListener(p);
		p.columnStdDtl_peg_no.addAllListener(p);
		p.columnStdDtl_peg_no.setListListener(p);
		p.columnStdDtl_wg_cd.addAllListener(p);
		p.columnStdDtl_wg_cd.setListListener(p);
		p.columnStdDtl_wg_nm.addAllListener(p);
		p.columnStdDtl_wg_nm.setListListener(p);
		p.columnStdDtl_unit_cd.addAllListener(p);
		p.columnStdDtl_unit_cd.setListListener(p);
		p.columnStdDtl_unit_nm.addAllListener(p);
		p.columnStdDtl_unit_nm.setListListener(p);
		p.columnStdDtl_lot_qty.addAllListener(p);
		p.columnStdDtl_lot_qty.setListListener(p);
		p.columnStdDtl_cur_cd.addAllListener(p);
		p.columnStdDtl_cur_cd.setListListener(p);
		p.columnStdDtl_cur_nm.addAllListener(p);
		p.columnStdDtl_cur_nm.setListListener(p);
		p.columnStdDtl_st_dt.addAllListener(p);
		p.columnStdDtl_st_dt.setListListener(p);
		p.columnStdDtl_end_dt.addAllListener(p);
		p.columnStdDtl_end_dt.setListListener(p);
		p.columnStdDtl_upri.addAllListener(p);
		p.columnStdDtl_upri.setListListener(p);
		p.columnStdDtl_upri_bf.addAllListener(p);
		p.columnStdDtl_upri_bf.setListListener(p);
		p.columnStdDtl_sub_upri1.addAllListener(p);
		p.columnStdDtl_sub_upri1.setListListener(p);
		p.columnStdDtl_sub_upri2.addAllListener(p);
		p.columnStdDtl_sub_upri2.setListListener(p);
		p.columnStdDtl_sub_upri3.addAllListener(p);
		p.columnStdDtl_sub_upri3.setListListener(p);
		p.columnStdDtl_not_cost_flg.addAllListener(p);
		p.columnStdDtl_memo1.addAllListener(p);
		p.columnStdDtl_memo1.setListListener(p);
		p.columnStdDtl_memo2.addAllListener(p);
		p.columnStdDtl_memo2.setListListener(p);
		p.columnStdDtl_memo3.addAllListener(p);
		p.columnStdDtl_memo3.setListListener(p);
		p.columnStdDtl_ins_usr_id.addAllListener(p);
		p.columnStdDtl_ins_usr_id.setListListener(p);
		p.columnStdDtl_ins_usr_nm.addAllListener(p);
		p.columnStdDtl_ins_usr_nm.setListListener(p);
		p.columnStdDtl_ins_ts.addAllListener(p);
		p.columnStdDtl_ins_ts.setListListener(p);
		p.columnStdDtl_ins_func_id.addAllListener(p);
		p.columnStdDtl_ins_func_id.setListListener(p);
		p.columnStdDtl_ins_func_nm.addAllListener(p);
		p.columnStdDtl_ins_func_nm.setListListener(p);
		p.columnStdDtl_upd_usr_id.addAllListener(p);
		p.columnStdDtl_upd_usr_id.setListListener(p);
		p.columnStdDtl_upd_usr_nm.addAllListener(p);
		p.columnStdDtl_upd_usr_nm.setListListener(p);
		p.columnStdDtl_upd_ts.addAllListener(p);
		p.columnStdDtl_upd_ts.setListListener(p);
		p.columnStdDtl_upd_func_id.addAllListener(p);
		p.columnStdDtl_upd_func_id.setListListener(p);
		p.columnStdDtl_upd_func_nm.addAllListener(p);
		p.columnStdDtl_upd_func_nm.setListListener(p);
		p.columnStdDtl_upd_srv_req_no.addAllListener(p);
		p.columnStdDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABSP_SlsUpriChk p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dt.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_dpt_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.putMode(p, SRCH, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.putMode(p, SRCH, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.putMode(p, SRCH, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.columnItm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.columnDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.columnDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.columnDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty_p_PPanel.columnQty_qty.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_sls_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MABSP_SlsUpriChk p){
		p.DtlBtn_radd.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_get_upri.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[CstDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CstDtl(MABSP_SlsUpriChk p){
		p.columnCstDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnCstDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_sls_upri_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_sls_upri_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CstDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnCstDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upri_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upri_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upri_rate_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_sub_upri1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_sub_upri2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_sub_upri3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnCstDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[ItmDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmDtl(MABSP_SlsUpriChk p){
		p.columnItmDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnItmDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sls_upri_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sls_upri_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ItmDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmDtl_sls_upri_rank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sls_upri_rank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upri_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upri_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upri_rate_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sub_upri1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sub_upri2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_sub_upri3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnItmDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[StdDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_StdDtl(MABSP_SlsUpriChk p){
		p.columnStdDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnStdDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.StdDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnStdDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upri_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_sub_upri1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_sub_upri2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_sub_upri3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnStdDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[CstDtlAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CstDtlAll(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[ItmDtlAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmDtlAll(MABSP_SlsUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[StdDtlAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_StdDtlAll(MABSP_SlsUpriChk p){

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
		MABSP_SlsUpriChk_MC.setTableConfigDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.setTableConfigCstDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.setTableConfigItmDtl((MABSP_SlsUpriChk)this);
		MABSP_SlsUpriChk_MC.setTableConfigStdDtl((MABSP_SlsUpriChk)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_SlsUpriChk p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0910.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0910.DtlR.peg_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_peg_no);
		p.columnDtl_dt.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dt_META);
		p.columnDtl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dt);
		p.columnDtl_dpt_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dpt_cd_META);
		p.columnDtl_dpt_cd.addLinkBeans(p.columnDtl_dpt_nm,p.columnDtl_wg_cd,p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_cd);
		p.columnDtl_dpt_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sls_upri_grp_cd, p.columnDtl_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sls_upri_grp_cd, p.columnDtl_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sls_upri_grp_cd, p.columnDtl_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_sls_upri_grp_cd, p.columnDtl_unit_cd);
		p.columnDtl_sls_upri_grp_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.sls_upri_grp_cd_META);
		p.columnDtl_sls_upri_grp_cd.addLinkBeans(p.columnDtl_sls_upri_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_grp_cd);
		p.columnDtl_sls_upri_grp_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.sls_upri_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_grp_nm);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.cst_cd_META);
		p.columnDtl_cst_cd.setListType(MCListType.STRICT);
		p.columnDtl_cst_cd.addLinkBeans(p.columnDtl_cst_nm,p.columnDtl_cur_cd,p.columnDtl_cur_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dlv_cd_META);
		p.columnDtl_dlv_cd.setListType(MCListType.STRICT);
		p.columnDtl_dlv_cd.addLinkBeans(p.columnDtl_dlv_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dest_cd1_META);
		p.columnDtl_dest_cd1.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd1.addLinkBeans(p.columnDtl_dest_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_nm1.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dest_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dest_cd2_META);
		p.columnDtl_dest_cd2.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd2.addLinkBeans(p.columnDtl_dest_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_nm2.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dest_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dest_cd3_META);
		p.columnDtl_dest_cd3.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd3.addLinkBeans(p.columnDtl_dest_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_dest_nm3.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dest_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm3);
		p.columnDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.cur_cd_META);
		p.columnDtl_cur_cd.addLinkBeans(p.columnDtl_cur_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_cd);
		p.columnDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_nm);
		p.columnDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0910.DtlR.unit_cd_META);
		p.columnDtl_unit_cd.addLinkBeans(p.columnDtl_unit_nm,p.columnDtl_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd);
		p.columnDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0910.DtlR.unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_nm);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABS.MABSP0910.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.DtlTable.addTable(p.Dtl_qty_p_PPanel.QtyTable);
		p.columnDtl_sls_upri.setMeta(mcframe.clientMABS.MABSP0910.DtlR.sls_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri);
		p.columnDtl_interim_flg.setMeta(mcframe.clientMABS.MABSP0910.DtlR.interim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_interim_flg);
		p.columnDtl_err_flg.setMeta(mcframe.clientMABS.MABSP0910.DtlR.err_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_err_flg);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_peg_no);
	}

	/**
	 * [CstDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigCstDtl(MABSP_SlsUpriChk p) {
		p.columnCstDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.peg_no_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_peg_no);
		p.columnCstDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.wg_cd_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_wg_cd);
		p.columnCstDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.wg_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_wg_nm);
		p.columnCstDtl_cst_cd.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.cst_cd_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_cst_cd);
		p.columnCstDtl_cst_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.cst_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_cst_nm);
		p.columnCstDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dlv_cd_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dlv_cd);
		p.columnCstDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dlv_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dlv_nm);
		p.columnCstDtl_dest_cd1.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dest_cd1_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dest_cd1);
		p.columnCstDtl_dest_nm1.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dest_nm1_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dest_nm1);
		p.columnCstDtl_dest_cd2.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dest_cd2_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dest_cd2);
		p.columnCstDtl_dest_nm2.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dest_nm2_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dest_nm2);
		p.columnCstDtl_dest_cd3.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dest_cd3_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dest_cd3);
		p.columnCstDtl_dest_nm3.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.dest_nm3_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_dest_nm3);
		p.columnCstDtl_sls_upri_grp_cd.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.sls_upri_grp_cd_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_sls_upri_grp_cd);
		p.columnCstDtl_sls_upri_grp_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.sls_upri_grp_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_sls_upri_grp_nm);
		p.CstDtlTable.addTable(p.CstDtl_itm_p_PPanel.ItmTable);
		p.columnCstDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.unit_cd_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_unit_cd);
		p.columnCstDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.unit_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_unit_nm);
		p.columnCstDtl_lot_qty.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.lot_qty_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_lot_qty);
		p.columnCstDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.cur_cd_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_cur_cd);
		p.columnCstDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.cur_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_cur_nm);
		p.columnCstDtl_st_dt.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.st_dt_META);
		p.columnCstDtl_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_st_dt);
		p.columnCstDtl_end_dt.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.end_dt_META);
		p.columnCstDtl_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_end_dt);
		p.columnCstDtl_upri.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upri_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upri);
		p.columnCstDtl_upri_bf.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upri_bf_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upri_bf);
		p.columnCstDtl_interim_flg.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.interim_flg_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_interim_flg);
		p.columnCstDtl_upri_rate.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upri_rate_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upri_rate);
		p.columnCstDtl_upri_rate_bf.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upri_rate_bf_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upri_rate_bf);
		p.columnCstDtl_sub_upri1.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.sub_upri1_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_sub_upri1);
		p.columnCstDtl_sub_upri2.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.sub_upri2_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_sub_upri2);
		p.columnCstDtl_sub_upri3.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.sub_upri3_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_sub_upri3);
		p.columnCstDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.not_cost_flg_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_not_cost_flg);
		p.columnCstDtl_memo1.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.memo1_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_memo1);
		p.columnCstDtl_memo2.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.memo2_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_memo2);
		p.columnCstDtl_memo3.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.memo3_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_memo3);
		p.columnCstDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.ins_usr_id_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_ins_usr_id);
		p.columnCstDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.ins_usr_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_ins_usr_nm);
		p.columnCstDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.ins_ts_META);
		p.columnCstDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_ins_ts);
		p.columnCstDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.ins_func_id_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_ins_func_id);
		p.columnCstDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.ins_func_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_ins_func_nm);
		p.columnCstDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upd_usr_id_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upd_usr_id);
		p.columnCstDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upd_usr_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upd_usr_nm);
		p.columnCstDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upd_ts_META);
		p.columnCstDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upd_ts);
		p.columnCstDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upd_func_id_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upd_func_id);
		p.columnCstDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upd_func_nm_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upd_func_nm);
		p.columnCstDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0910.CstDtlR.upd_srv_req_no_META);
		p.CstDtlTable.addColumnConfig(p.columnCstDtl_upd_srv_req_no);
	}

	/**
	 * [ItmDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigItmDtl(MABSP_SlsUpriChk p) {
		p.columnItmDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.peg_no_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_peg_no);
		p.columnItmDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.wg_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_wg_cd);
		p.columnItmDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.wg_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_wg_nm);
		p.columnItmDtl_sls_upri_grp_cd.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sls_upri_grp_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sls_upri_grp_cd);
		p.columnItmDtl_sls_upri_grp_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sls_upri_grp_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sls_upri_grp_nm);
		p.ItmDtlTable.addTable(p.ItmDtl_itm_p_PPanel.ItmTable);
		p.columnItmDtl_sls_upri_rank_cd.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sls_upri_rank_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sls_upri_rank_cd);
		p.columnItmDtl_sls_upri_rank_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sls_upri_rank_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sls_upri_rank_nm);
		p.columnItmDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.unit_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_unit_cd);
		p.columnItmDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.unit_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_unit_nm);
		p.columnItmDtl_lot_qty.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.lot_qty_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_lot_qty);
		p.columnItmDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.cur_cd_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_cur_cd);
		p.columnItmDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.cur_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_cur_nm);
		p.columnItmDtl_st_dt.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.st_dt_META);
		p.columnItmDtl_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_st_dt);
		p.columnItmDtl_end_dt.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.end_dt_META);
		p.columnItmDtl_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_end_dt);
		p.columnItmDtl_upri.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upri_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upri);
		p.columnItmDtl_upri_bf.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upri_bf_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upri_bf);
		p.columnItmDtl_interim_flg.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.interim_flg_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_interim_flg);
		p.columnItmDtl_upri_rate.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upri_rate_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upri_rate);
		p.columnItmDtl_upri_rate_bf.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upri_rate_bf_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upri_rate_bf);
		p.columnItmDtl_sub_upri1.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sub_upri1_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sub_upri1);
		p.columnItmDtl_sub_upri2.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sub_upri2_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sub_upri2);
		p.columnItmDtl_sub_upri3.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.sub_upri3_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_sub_upri3);
		p.columnItmDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.not_cost_flg_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_not_cost_flg);
		p.columnItmDtl_memo1.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.memo1_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_memo1);
		p.columnItmDtl_memo2.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.memo2_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_memo2);
		p.columnItmDtl_memo3.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.memo3_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_memo3);
		p.columnItmDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.ins_usr_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_usr_id);
		p.columnItmDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.ins_usr_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_usr_nm);
		p.columnItmDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.ins_ts_META);
		p.columnItmDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_ts);
		p.columnItmDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.ins_func_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_func_id);
		p.columnItmDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.ins_func_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_ins_func_nm);
		p.columnItmDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upd_usr_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_usr_id);
		p.columnItmDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upd_usr_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_usr_nm);
		p.columnItmDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upd_ts_META);
		p.columnItmDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_ts);
		p.columnItmDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upd_func_id_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_func_id);
		p.columnItmDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upd_func_nm_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_func_nm);
		p.columnItmDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0910.ItmDtlR.upd_srv_req_no_META);
		p.ItmDtlTable.addColumnConfig(p.columnItmDtl_upd_srv_req_no);
	}

	/**
	 * [StdDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigStdDtl(MABSP_SlsUpriChk p) {
		p.columnStdDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.peg_no_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_peg_no);
		p.columnStdDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.wg_cd_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_wg_cd);
		p.columnStdDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.wg_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_wg_nm);
		p.StdDtlTable.addTable(p.StdDtl_itm_p_PPanel.ItmTable);
		p.columnStdDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.unit_cd_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_unit_cd);
		p.columnStdDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.unit_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_unit_nm);
		p.columnStdDtl_lot_qty.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.lot_qty_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_lot_qty);
		p.columnStdDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.cur_cd_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_cur_cd);
		p.columnStdDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.cur_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_cur_nm);
		p.columnStdDtl_st_dt.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.st_dt_META);
		p.columnStdDtl_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_st_dt);
		p.columnStdDtl_end_dt.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.end_dt_META);
		p.columnStdDtl_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_end_dt);
		p.columnStdDtl_upri.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upri_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upri);
		p.columnStdDtl_upri_bf.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upri_bf_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upri_bf);
		p.columnStdDtl_sub_upri1.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.sub_upri1_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_sub_upri1);
		p.columnStdDtl_sub_upri2.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.sub_upri2_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_sub_upri2);
		p.columnStdDtl_sub_upri3.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.sub_upri3_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_sub_upri3);
		p.columnStdDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.not_cost_flg_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_not_cost_flg);
		p.columnStdDtl_memo1.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.memo1_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_memo1);
		p.columnStdDtl_memo2.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.memo2_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_memo2);
		p.columnStdDtl_memo3.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.memo3_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_memo3);
		p.columnStdDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.ins_usr_id_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_ins_usr_id);
		p.columnStdDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.ins_usr_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_ins_usr_nm);
		p.columnStdDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.ins_ts_META);
		p.columnStdDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_ins_ts);
		p.columnStdDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.ins_func_id_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_ins_func_id);
		p.columnStdDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.ins_func_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_ins_func_nm);
		p.columnStdDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upd_usr_id_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upd_usr_id);
		p.columnStdDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upd_usr_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upd_usr_nm);
		p.columnStdDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upd_ts_META);
		p.columnStdDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upd_ts);
		p.columnStdDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upd_func_id_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upd_func_id);
		p.columnStdDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upd_func_nm_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upd_func_nm);
		p.columnStdDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0910.StdDtlR.upd_srv_req_no_META);
		p.StdDtlTable.addColumnConfig(p.columnStdDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnDtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_cd.getListConfig().setPutter(getDtl_dpt_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_sls_upri_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_upri_grp_cd.getListConfig().setPutter(getDtl_sls_upri_grp_cd_ListPutter());
		columnDtl_cst_cd.getListConfig().setPutter(getDtl_cst_cd_ListPutter());
		columnDtl_dlv_cd.getListConfig().setPutter(getDtl_dlv_cd_ListPutter());
		columnDtl_dest_cd1.getListConfig().setPutter(getDtl_dest_cd1_ListPutter());
		columnDtl_dest_cd2.getListConfig().setPutter(getDtl_dest_cd2_ListPutter());
		columnDtl_dest_cd3.getListConfig().setPutter(getDtl_dest_cd3_ListPutter());
		columnDtl_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cur_cd.getListConfig().setPutter(getDtl_cur_cd_ListPutter());
		columnDtl_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_unit_cd.getListConfig().setPutter(getDtl_unit_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
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
	 * [Dtl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Dtl_sls_upri_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_upri_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriGrp");
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
	 * [Dtl_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnDtl_dpt_cd) return getDtl_dpt_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_sls_upri_grp_cd) return getDtl_sls_upri_grp_cd(row, info);
		if(combo == columnDtl_cst_cd) return getDtl_cst_cd(row, info);
		if(combo == columnDtl_dlv_cd) return getDtl_dlv_cd(row, info);
		if(combo == columnDtl_dest_cd1) return getDtl_dest_cd1(row, info);
		if(combo == columnDtl_dest_cd2) return getDtl_dest_cd2(row, info);
		if(combo == columnDtl_dest_cd3) return getDtl_dest_cd3(row, info);
		if(combo == columnDtl_cur_cd) return getDtl_cur_cd(row, info);
		if(combo == columnDtl_unit_cd) return getDtl_unit_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtn_get_upri) doDtlBtn_get_upri(info);
	}

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
	 * [DtlBtn]パネルの[get_upri]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_get_upri(MCEventInfo info);

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
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == CstDtlTable) return doCstDtl_VC(info);
		if (vc == ItmDtlTable) return doItmDtl_VC(info);
		if (vc == StdDtlTable) return doStdDtl_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_peg_no) return doDtl_peg_no_VC(info);
		if (vc == columnDtl_dt) return doDtl_dt_VC(info);
		if (vc == columnDtl_dpt_cd) return doDtl_dpt_cd_VC(info);
		if (vc == columnDtl_dpt_nm) return doDtl_dpt_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_sls_upri_grp_cd) return doDtl_sls_upri_grp_cd_VC(info);
		if (vc == columnDtl_sls_upri_grp_nm) return doDtl_sls_upri_grp_nm_VC(info);
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
		if (vc == columnDtl_cur_cd) return doDtl_cur_cd_VC(info);
		if (vc == columnDtl_cur_nm) return doDtl_cur_nm_VC(info);
		if (vc == columnDtl_unit_cd) return doDtl_unit_cd_VC(info);
		if (vc == columnDtl_unit_nm) return doDtl_unit_nm_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_sls_upri) return doDtl_sls_upri_VC(info);
		if (vc == columnDtl_interim_flg) return doDtl_interim_flg_VC(info);
		if (vc == columnDtl_err_flg) return doDtl_err_flg_VC(info);
		if (vc == columnCstDtl_peg_no) return doCstDtl_peg_no_VC(info);
		if (vc == columnCstDtl_wg_cd) return doCstDtl_wg_cd_VC(info);
		if (vc == columnCstDtl_wg_nm) return doCstDtl_wg_nm_VC(info);
		if (vc == columnCstDtl_cst_cd) return doCstDtl_cst_cd_VC(info);
		if (vc == columnCstDtl_cst_nm) return doCstDtl_cst_nm_VC(info);
		if (vc == columnCstDtl_dlv_cd) return doCstDtl_dlv_cd_VC(info);
		if (vc == columnCstDtl_dlv_nm) return doCstDtl_dlv_nm_VC(info);
		if (vc == columnCstDtl_dest_cd1) return doCstDtl_dest_cd1_VC(info);
		if (vc == columnCstDtl_dest_nm1) return doCstDtl_dest_nm1_VC(info);
		if (vc == columnCstDtl_dest_cd2) return doCstDtl_dest_cd2_VC(info);
		if (vc == columnCstDtl_dest_nm2) return doCstDtl_dest_nm2_VC(info);
		if (vc == columnCstDtl_dest_cd3) return doCstDtl_dest_cd3_VC(info);
		if (vc == columnCstDtl_dest_nm3) return doCstDtl_dest_nm3_VC(info);
		if (vc == columnCstDtl_sls_upri_grp_cd) return doCstDtl_sls_upri_grp_cd_VC(info);
		if (vc == columnCstDtl_sls_upri_grp_nm) return doCstDtl_sls_upri_grp_nm_VC(info);
		if (vc == columnCstDtl_unit_cd) return doCstDtl_unit_cd_VC(info);
		if (vc == columnCstDtl_unit_nm) return doCstDtl_unit_nm_VC(info);
		if (vc == columnCstDtl_lot_qty) return doCstDtl_lot_qty_VC(info);
		if (vc == columnCstDtl_cur_cd) return doCstDtl_cur_cd_VC(info);
		if (vc == columnCstDtl_cur_nm) return doCstDtl_cur_nm_VC(info);
		if (vc == columnCstDtl_st_dt) return doCstDtl_st_dt_VC(info);
		if (vc == columnCstDtl_end_dt) return doCstDtl_end_dt_VC(info);
		if (vc == columnCstDtl_upri) return doCstDtl_upri_VC(info);
		if (vc == columnCstDtl_upri_bf) return doCstDtl_upri_bf_VC(info);
		if (vc == columnCstDtl_interim_flg) return doCstDtl_interim_flg_VC(info);
		if (vc == columnCstDtl_upri_rate) return doCstDtl_upri_rate_VC(info);
		if (vc == columnCstDtl_upri_rate_bf) return doCstDtl_upri_rate_bf_VC(info);
		if (vc == columnCstDtl_sub_upri1) return doCstDtl_sub_upri1_VC(info);
		if (vc == columnCstDtl_sub_upri2) return doCstDtl_sub_upri2_VC(info);
		if (vc == columnCstDtl_sub_upri3) return doCstDtl_sub_upri3_VC(info);
		if (vc == columnCstDtl_not_cost_flg) return doCstDtl_not_cost_flg_VC(info);
		if (vc == columnCstDtl_memo1) return doCstDtl_memo1_VC(info);
		if (vc == columnCstDtl_memo2) return doCstDtl_memo2_VC(info);
		if (vc == columnCstDtl_memo3) return doCstDtl_memo3_VC(info);
		if (vc == columnCstDtl_ins_usr_id) return doCstDtl_ins_usr_id_VC(info);
		if (vc == columnCstDtl_ins_usr_nm) return doCstDtl_ins_usr_nm_VC(info);
		if (vc == columnCstDtl_ins_ts) return doCstDtl_ins_ts_VC(info);
		if (vc == columnCstDtl_ins_func_id) return doCstDtl_ins_func_id_VC(info);
		if (vc == columnCstDtl_ins_func_nm) return doCstDtl_ins_func_nm_VC(info);
		if (vc == columnCstDtl_upd_usr_id) return doCstDtl_upd_usr_id_VC(info);
		if (vc == columnCstDtl_upd_usr_nm) return doCstDtl_upd_usr_nm_VC(info);
		if (vc == columnCstDtl_upd_ts) return doCstDtl_upd_ts_VC(info);
		if (vc == columnCstDtl_upd_func_id) return doCstDtl_upd_func_id_VC(info);
		if (vc == columnCstDtl_upd_func_nm) return doCstDtl_upd_func_nm_VC(info);
		if (vc == columnCstDtl_upd_srv_req_no) return doCstDtl_upd_srv_req_no_VC(info);
		if (vc == columnItmDtl_peg_no) return doItmDtl_peg_no_VC(info);
		if (vc == columnItmDtl_wg_cd) return doItmDtl_wg_cd_VC(info);
		if (vc == columnItmDtl_wg_nm) return doItmDtl_wg_nm_VC(info);
		if (vc == columnItmDtl_sls_upri_grp_cd) return doItmDtl_sls_upri_grp_cd_VC(info);
		if (vc == columnItmDtl_sls_upri_grp_nm) return doItmDtl_sls_upri_grp_nm_VC(info);
		if (vc == columnItmDtl_sls_upri_rank_cd) return doItmDtl_sls_upri_rank_cd_VC(info);
		if (vc == columnItmDtl_sls_upri_rank_nm) return doItmDtl_sls_upri_rank_nm_VC(info);
		if (vc == columnItmDtl_unit_cd) return doItmDtl_unit_cd_VC(info);
		if (vc == columnItmDtl_unit_nm) return doItmDtl_unit_nm_VC(info);
		if (vc == columnItmDtl_lot_qty) return doItmDtl_lot_qty_VC(info);
		if (vc == columnItmDtl_cur_cd) return doItmDtl_cur_cd_VC(info);
		if (vc == columnItmDtl_cur_nm) return doItmDtl_cur_nm_VC(info);
		if (vc == columnItmDtl_st_dt) return doItmDtl_st_dt_VC(info);
		if (vc == columnItmDtl_end_dt) return doItmDtl_end_dt_VC(info);
		if (vc == columnItmDtl_upri) return doItmDtl_upri_VC(info);
		if (vc == columnItmDtl_upri_bf) return doItmDtl_upri_bf_VC(info);
		if (vc == columnItmDtl_interim_flg) return doItmDtl_interim_flg_VC(info);
		if (vc == columnItmDtl_upri_rate) return doItmDtl_upri_rate_VC(info);
		if (vc == columnItmDtl_upri_rate_bf) return doItmDtl_upri_rate_bf_VC(info);
		if (vc == columnItmDtl_sub_upri1) return doItmDtl_sub_upri1_VC(info);
		if (vc == columnItmDtl_sub_upri2) return doItmDtl_sub_upri2_VC(info);
		if (vc == columnItmDtl_sub_upri3) return doItmDtl_sub_upri3_VC(info);
		if (vc == columnItmDtl_not_cost_flg) return doItmDtl_not_cost_flg_VC(info);
		if (vc == columnItmDtl_memo1) return doItmDtl_memo1_VC(info);
		if (vc == columnItmDtl_memo2) return doItmDtl_memo2_VC(info);
		if (vc == columnItmDtl_memo3) return doItmDtl_memo3_VC(info);
		if (vc == columnItmDtl_ins_usr_id) return doItmDtl_ins_usr_id_VC(info);
		if (vc == columnItmDtl_ins_usr_nm) return doItmDtl_ins_usr_nm_VC(info);
		if (vc == columnItmDtl_ins_ts) return doItmDtl_ins_ts_VC(info);
		if (vc == columnItmDtl_ins_func_id) return doItmDtl_ins_func_id_VC(info);
		if (vc == columnItmDtl_ins_func_nm) return doItmDtl_ins_func_nm_VC(info);
		if (vc == columnItmDtl_upd_usr_id) return doItmDtl_upd_usr_id_VC(info);
		if (vc == columnItmDtl_upd_usr_nm) return doItmDtl_upd_usr_nm_VC(info);
		if (vc == columnItmDtl_upd_ts) return doItmDtl_upd_ts_VC(info);
		if (vc == columnItmDtl_upd_func_id) return doItmDtl_upd_func_id_VC(info);
		if (vc == columnItmDtl_upd_func_nm) return doItmDtl_upd_func_nm_VC(info);
		if (vc == columnItmDtl_upd_srv_req_no) return doItmDtl_upd_srv_req_no_VC(info);
		if (vc == columnStdDtl_peg_no) return doStdDtl_peg_no_VC(info);
		if (vc == columnStdDtl_wg_cd) return doStdDtl_wg_cd_VC(info);
		if (vc == columnStdDtl_wg_nm) return doStdDtl_wg_nm_VC(info);
		if (vc == columnStdDtl_unit_cd) return doStdDtl_unit_cd_VC(info);
		if (vc == columnStdDtl_unit_nm) return doStdDtl_unit_nm_VC(info);
		if (vc == columnStdDtl_lot_qty) return doStdDtl_lot_qty_VC(info);
		if (vc == columnStdDtl_cur_cd) return doStdDtl_cur_cd_VC(info);
		if (vc == columnStdDtl_cur_nm) return doStdDtl_cur_nm_VC(info);
		if (vc == columnStdDtl_st_dt) return doStdDtl_st_dt_VC(info);
		if (vc == columnStdDtl_end_dt) return doStdDtl_end_dt_VC(info);
		if (vc == columnStdDtl_upri) return doStdDtl_upri_VC(info);
		if (vc == columnStdDtl_upri_bf) return doStdDtl_upri_bf_VC(info);
		if (vc == columnStdDtl_sub_upri1) return doStdDtl_sub_upri1_VC(info);
		if (vc == columnStdDtl_sub_upri2) return doStdDtl_sub_upri2_VC(info);
		if (vc == columnStdDtl_sub_upri3) return doStdDtl_sub_upri3_VC(info);
		if (vc == columnStdDtl_not_cost_flg) return doStdDtl_not_cost_flg_VC(info);
		if (vc == columnStdDtl_memo1) return doStdDtl_memo1_VC(info);
		if (vc == columnStdDtl_memo2) return doStdDtl_memo2_VC(info);
		if (vc == columnStdDtl_memo3) return doStdDtl_memo3_VC(info);
		if (vc == columnStdDtl_ins_usr_id) return doStdDtl_ins_usr_id_VC(info);
		if (vc == columnStdDtl_ins_usr_nm) return doStdDtl_ins_usr_nm_VC(info);
		if (vc == columnStdDtl_ins_ts) return doStdDtl_ins_ts_VC(info);
		if (vc == columnStdDtl_ins_func_id) return doStdDtl_ins_func_id_VC(info);
		if (vc == columnStdDtl_ins_func_nm) return doStdDtl_ins_func_nm_VC(info);
		if (vc == columnStdDtl_upd_usr_id) return doStdDtl_upd_usr_id_VC(info);
		if (vc == columnStdDtl_upd_usr_nm) return doStdDtl_upd_usr_nm_VC(info);
		if (vc == columnStdDtl_upd_ts) return doStdDtl_upd_ts_VC(info);
		if (vc == columnStdDtl_upd_func_id) return doStdDtl_upd_func_id_VC(info);
		if (vc == columnStdDtl_upd_func_nm) return doStdDtl_upd_func_nm_VC(info);
		if (vc == columnStdDtl_upd_srv_req_no) return doStdDtl_upd_srv_req_no_VC(info);
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
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_grp_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_sls_upri_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_sls_upri_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upri_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upri_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upri_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upri_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upri_rate_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upri_rate_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[sub_upri1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_sub_upri1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[sub_upri2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_sub_upri2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[sub_upri3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_sub_upri3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_not_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CstDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCstDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sls_upri_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sls_upri_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sls_upri_rank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sls_upri_rank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upri_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upri_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upri_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upri_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upri_rate_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upri_rate_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sub_upri1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sub_upri1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sub_upri2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sub_upri2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[sub_upri3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_sub_upri3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_not_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upri_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upri_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[sub_upri1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_sub_upri1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[sub_upri2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_sub_upri2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[sub_upri3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_sub_upri3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_not_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [StdDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doStdDtl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == CstDtlTable) doCstDtl_NC(info);
		else if (nc == ItmDtlTable) doItmDtl_NC(info);
		else if (nc == StdDtlTable) doStdDtl_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_peg_no) doDtl_peg_no_NC(info);
		else if (nc == columnDtl_dt) doDtl_dt_NC(info);
		else if (nc == columnDtl_dpt_cd) doDtl_dpt_cd_NC(info);
		else if (nc == columnDtl_dpt_nm) doDtl_dpt_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_NC(info);
		else if (nc == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_NC(info);
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
		else if (nc == columnDtl_cur_cd) doDtl_cur_cd_NC(info);
		else if (nc == columnDtl_cur_nm) doDtl_cur_nm_NC(info);
		else if (nc == columnDtl_unit_cd) doDtl_unit_cd_NC(info);
		else if (nc == columnDtl_unit_nm) doDtl_unit_nm_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_sls_upri) doDtl_sls_upri_NC(info);
		else if (nc == columnDtl_interim_flg) doDtl_interim_flg_NC(info);
		else if (nc == columnDtl_err_flg) doDtl_err_flg_NC(info);
		else if (nc == columnCstDtl_peg_no) doCstDtl_peg_no_NC(info);
		else if (nc == columnCstDtl_wg_cd) doCstDtl_wg_cd_NC(info);
		else if (nc == columnCstDtl_wg_nm) doCstDtl_wg_nm_NC(info);
		else if (nc == columnCstDtl_cst_cd) doCstDtl_cst_cd_NC(info);
		else if (nc == columnCstDtl_cst_nm) doCstDtl_cst_nm_NC(info);
		else if (nc == columnCstDtl_dlv_cd) doCstDtl_dlv_cd_NC(info);
		else if (nc == columnCstDtl_dlv_nm) doCstDtl_dlv_nm_NC(info);
		else if (nc == columnCstDtl_dest_cd1) doCstDtl_dest_cd1_NC(info);
		else if (nc == columnCstDtl_dest_nm1) doCstDtl_dest_nm1_NC(info);
		else if (nc == columnCstDtl_dest_cd2) doCstDtl_dest_cd2_NC(info);
		else if (nc == columnCstDtl_dest_nm2) doCstDtl_dest_nm2_NC(info);
		else if (nc == columnCstDtl_dest_cd3) doCstDtl_dest_cd3_NC(info);
		else if (nc == columnCstDtl_dest_nm3) doCstDtl_dest_nm3_NC(info);
		else if (nc == columnCstDtl_sls_upri_grp_cd) doCstDtl_sls_upri_grp_cd_NC(info);
		else if (nc == columnCstDtl_sls_upri_grp_nm) doCstDtl_sls_upri_grp_nm_NC(info);
		else if (nc == columnCstDtl_unit_cd) doCstDtl_unit_cd_NC(info);
		else if (nc == columnCstDtl_unit_nm) doCstDtl_unit_nm_NC(info);
		else if (nc == columnCstDtl_lot_qty) doCstDtl_lot_qty_NC(info);
		else if (nc == columnCstDtl_cur_cd) doCstDtl_cur_cd_NC(info);
		else if (nc == columnCstDtl_cur_nm) doCstDtl_cur_nm_NC(info);
		else if (nc == columnCstDtl_st_dt) doCstDtl_st_dt_NC(info);
		else if (nc == columnCstDtl_end_dt) doCstDtl_end_dt_NC(info);
		else if (nc == columnCstDtl_upri) doCstDtl_upri_NC(info);
		else if (nc == columnCstDtl_upri_bf) doCstDtl_upri_bf_NC(info);
		else if (nc == columnCstDtl_interim_flg) doCstDtl_interim_flg_NC(info);
		else if (nc == columnCstDtl_upri_rate) doCstDtl_upri_rate_NC(info);
		else if (nc == columnCstDtl_upri_rate_bf) doCstDtl_upri_rate_bf_NC(info);
		else if (nc == columnCstDtl_sub_upri1) doCstDtl_sub_upri1_NC(info);
		else if (nc == columnCstDtl_sub_upri2) doCstDtl_sub_upri2_NC(info);
		else if (nc == columnCstDtl_sub_upri3) doCstDtl_sub_upri3_NC(info);
		else if (nc == columnCstDtl_not_cost_flg) doCstDtl_not_cost_flg_NC(info);
		else if (nc == columnCstDtl_memo1) doCstDtl_memo1_NC(info);
		else if (nc == columnCstDtl_memo2) doCstDtl_memo2_NC(info);
		else if (nc == columnCstDtl_memo3) doCstDtl_memo3_NC(info);
		else if (nc == columnCstDtl_ins_usr_id) doCstDtl_ins_usr_id_NC(info);
		else if (nc == columnCstDtl_ins_usr_nm) doCstDtl_ins_usr_nm_NC(info);
		else if (nc == columnCstDtl_ins_ts) doCstDtl_ins_ts_NC(info);
		else if (nc == columnCstDtl_ins_func_id) doCstDtl_ins_func_id_NC(info);
		else if (nc == columnCstDtl_ins_func_nm) doCstDtl_ins_func_nm_NC(info);
		else if (nc == columnCstDtl_upd_usr_id) doCstDtl_upd_usr_id_NC(info);
		else if (nc == columnCstDtl_upd_usr_nm) doCstDtl_upd_usr_nm_NC(info);
		else if (nc == columnCstDtl_upd_ts) doCstDtl_upd_ts_NC(info);
		else if (nc == columnCstDtl_upd_func_id) doCstDtl_upd_func_id_NC(info);
		else if (nc == columnCstDtl_upd_func_nm) doCstDtl_upd_func_nm_NC(info);
		else if (nc == columnCstDtl_upd_srv_req_no) doCstDtl_upd_srv_req_no_NC(info);
		else if (nc == columnItmDtl_peg_no) doItmDtl_peg_no_NC(info);
		else if (nc == columnItmDtl_wg_cd) doItmDtl_wg_cd_NC(info);
		else if (nc == columnItmDtl_wg_nm) doItmDtl_wg_nm_NC(info);
		else if (nc == columnItmDtl_sls_upri_grp_cd) doItmDtl_sls_upri_grp_cd_NC(info);
		else if (nc == columnItmDtl_sls_upri_grp_nm) doItmDtl_sls_upri_grp_nm_NC(info);
		else if (nc == columnItmDtl_sls_upri_rank_cd) doItmDtl_sls_upri_rank_cd_NC(info);
		else if (nc == columnItmDtl_sls_upri_rank_nm) doItmDtl_sls_upri_rank_nm_NC(info);
		else if (nc == columnItmDtl_unit_cd) doItmDtl_unit_cd_NC(info);
		else if (nc == columnItmDtl_unit_nm) doItmDtl_unit_nm_NC(info);
		else if (nc == columnItmDtl_lot_qty) doItmDtl_lot_qty_NC(info);
		else if (nc == columnItmDtl_cur_cd) doItmDtl_cur_cd_NC(info);
		else if (nc == columnItmDtl_cur_nm) doItmDtl_cur_nm_NC(info);
		else if (nc == columnItmDtl_st_dt) doItmDtl_st_dt_NC(info);
		else if (nc == columnItmDtl_end_dt) doItmDtl_end_dt_NC(info);
		else if (nc == columnItmDtl_upri) doItmDtl_upri_NC(info);
		else if (nc == columnItmDtl_upri_bf) doItmDtl_upri_bf_NC(info);
		else if (nc == columnItmDtl_interim_flg) doItmDtl_interim_flg_NC(info);
		else if (nc == columnItmDtl_upri_rate) doItmDtl_upri_rate_NC(info);
		else if (nc == columnItmDtl_upri_rate_bf) doItmDtl_upri_rate_bf_NC(info);
		else if (nc == columnItmDtl_sub_upri1) doItmDtl_sub_upri1_NC(info);
		else if (nc == columnItmDtl_sub_upri2) doItmDtl_sub_upri2_NC(info);
		else if (nc == columnItmDtl_sub_upri3) doItmDtl_sub_upri3_NC(info);
		else if (nc == columnItmDtl_not_cost_flg) doItmDtl_not_cost_flg_NC(info);
		else if (nc == columnItmDtl_memo1) doItmDtl_memo1_NC(info);
		else if (nc == columnItmDtl_memo2) doItmDtl_memo2_NC(info);
		else if (nc == columnItmDtl_memo3) doItmDtl_memo3_NC(info);
		else if (nc == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_NC(info);
		else if (nc == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_NC(info);
		else if (nc == columnItmDtl_ins_ts) doItmDtl_ins_ts_NC(info);
		else if (nc == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_NC(info);
		else if (nc == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_NC(info);
		else if (nc == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_NC(info);
		else if (nc == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_NC(info);
		else if (nc == columnItmDtl_upd_ts) doItmDtl_upd_ts_NC(info);
		else if (nc == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_NC(info);
		else if (nc == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_NC(info);
		else if (nc == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_NC(info);
		else if (nc == columnStdDtl_peg_no) doStdDtl_peg_no_NC(info);
		else if (nc == columnStdDtl_wg_cd) doStdDtl_wg_cd_NC(info);
		else if (nc == columnStdDtl_wg_nm) doStdDtl_wg_nm_NC(info);
		else if (nc == columnStdDtl_unit_cd) doStdDtl_unit_cd_NC(info);
		else if (nc == columnStdDtl_unit_nm) doStdDtl_unit_nm_NC(info);
		else if (nc == columnStdDtl_lot_qty) doStdDtl_lot_qty_NC(info);
		else if (nc == columnStdDtl_cur_cd) doStdDtl_cur_cd_NC(info);
		else if (nc == columnStdDtl_cur_nm) doStdDtl_cur_nm_NC(info);
		else if (nc == columnStdDtl_st_dt) doStdDtl_st_dt_NC(info);
		else if (nc == columnStdDtl_end_dt) doStdDtl_end_dt_NC(info);
		else if (nc == columnStdDtl_upri) doStdDtl_upri_NC(info);
		else if (nc == columnStdDtl_upri_bf) doStdDtl_upri_bf_NC(info);
		else if (nc == columnStdDtl_sub_upri1) doStdDtl_sub_upri1_NC(info);
		else if (nc == columnStdDtl_sub_upri2) doStdDtl_sub_upri2_NC(info);
		else if (nc == columnStdDtl_sub_upri3) doStdDtl_sub_upri3_NC(info);
		else if (nc == columnStdDtl_not_cost_flg) doStdDtl_not_cost_flg_NC(info);
		else if (nc == columnStdDtl_memo1) doStdDtl_memo1_NC(info);
		else if (nc == columnStdDtl_memo2) doStdDtl_memo2_NC(info);
		else if (nc == columnStdDtl_memo3) doStdDtl_memo3_NC(info);
		else if (nc == columnStdDtl_ins_usr_id) doStdDtl_ins_usr_id_NC(info);
		else if (nc == columnStdDtl_ins_usr_nm) doStdDtl_ins_usr_nm_NC(info);
		else if (nc == columnStdDtl_ins_ts) doStdDtl_ins_ts_NC(info);
		else if (nc == columnStdDtl_ins_func_id) doStdDtl_ins_func_id_NC(info);
		else if (nc == columnStdDtl_ins_func_nm) doStdDtl_ins_func_nm_NC(info);
		else if (nc == columnStdDtl_upd_usr_id) doStdDtl_upd_usr_id_NC(info);
		else if (nc == columnStdDtl_upd_usr_nm) doStdDtl_upd_usr_nm_NC(info);
		else if (nc == columnStdDtl_upd_ts) doStdDtl_upd_ts_NC(info);
		else if (nc == columnStdDtl_upd_func_id) doStdDtl_upd_func_id_NC(info);
		else if (nc == columnStdDtl_upd_func_nm) doStdDtl_upd_func_nm_NC(info);
		else if (nc == columnStdDtl_upd_srv_req_no) doStdDtl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_bf_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_bf_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri1_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri2_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri3_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_not_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_bf_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_bf_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri1_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri2_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri3_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_not_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_bf_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri1_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri2_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri3_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_not_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == CstDtlTable) doCstDtl_NE(info);
		else if (ne == ItmDtlTable) doItmDtl_NE(info);
		else if (ne == StdDtlTable) doStdDtl_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_peg_no) doDtl_peg_no_NE(info);
		else if (ne == columnDtl_dt) doDtl_dt_NE(info);
		else if (ne == columnDtl_dpt_cd) doDtl_dpt_cd_NE(info);
		else if (ne == columnDtl_dpt_nm) doDtl_dpt_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_NE(info);
		else if (ne == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_NE(info);
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
		else if (ne == columnDtl_cur_cd) doDtl_cur_cd_NE(info);
		else if (ne == columnDtl_cur_nm) doDtl_cur_nm_NE(info);
		else if (ne == columnDtl_unit_cd) doDtl_unit_cd_NE(info);
		else if (ne == columnDtl_unit_nm) doDtl_unit_nm_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_sls_upri) doDtl_sls_upri_NE(info);
		else if (ne == columnDtl_interim_flg) doDtl_interim_flg_NE(info);
		else if (ne == columnDtl_err_flg) doDtl_err_flg_NE(info);
		else if (ne == columnCstDtl_peg_no) doCstDtl_peg_no_NE(info);
		else if (ne == columnCstDtl_wg_cd) doCstDtl_wg_cd_NE(info);
		else if (ne == columnCstDtl_wg_nm) doCstDtl_wg_nm_NE(info);
		else if (ne == columnCstDtl_cst_cd) doCstDtl_cst_cd_NE(info);
		else if (ne == columnCstDtl_cst_nm) doCstDtl_cst_nm_NE(info);
		else if (ne == columnCstDtl_dlv_cd) doCstDtl_dlv_cd_NE(info);
		else if (ne == columnCstDtl_dlv_nm) doCstDtl_dlv_nm_NE(info);
		else if (ne == columnCstDtl_dest_cd1) doCstDtl_dest_cd1_NE(info);
		else if (ne == columnCstDtl_dest_nm1) doCstDtl_dest_nm1_NE(info);
		else if (ne == columnCstDtl_dest_cd2) doCstDtl_dest_cd2_NE(info);
		else if (ne == columnCstDtl_dest_nm2) doCstDtl_dest_nm2_NE(info);
		else if (ne == columnCstDtl_dest_cd3) doCstDtl_dest_cd3_NE(info);
		else if (ne == columnCstDtl_dest_nm3) doCstDtl_dest_nm3_NE(info);
		else if (ne == columnCstDtl_sls_upri_grp_cd) doCstDtl_sls_upri_grp_cd_NE(info);
		else if (ne == columnCstDtl_sls_upri_grp_nm) doCstDtl_sls_upri_grp_nm_NE(info);
		else if (ne == columnCstDtl_unit_cd) doCstDtl_unit_cd_NE(info);
		else if (ne == columnCstDtl_unit_nm) doCstDtl_unit_nm_NE(info);
		else if (ne == columnCstDtl_lot_qty) doCstDtl_lot_qty_NE(info);
		else if (ne == columnCstDtl_cur_cd) doCstDtl_cur_cd_NE(info);
		else if (ne == columnCstDtl_cur_nm) doCstDtl_cur_nm_NE(info);
		else if (ne == columnCstDtl_st_dt) doCstDtl_st_dt_NE(info);
		else if (ne == columnCstDtl_end_dt) doCstDtl_end_dt_NE(info);
		else if (ne == columnCstDtl_upri) doCstDtl_upri_NE(info);
		else if (ne == columnCstDtl_upri_bf) doCstDtl_upri_bf_NE(info);
		else if (ne == columnCstDtl_interim_flg) doCstDtl_interim_flg_NE(info);
		else if (ne == columnCstDtl_upri_rate) doCstDtl_upri_rate_NE(info);
		else if (ne == columnCstDtl_upri_rate_bf) doCstDtl_upri_rate_bf_NE(info);
		else if (ne == columnCstDtl_sub_upri1) doCstDtl_sub_upri1_NE(info);
		else if (ne == columnCstDtl_sub_upri2) doCstDtl_sub_upri2_NE(info);
		else if (ne == columnCstDtl_sub_upri3) doCstDtl_sub_upri3_NE(info);
		else if (ne == columnCstDtl_not_cost_flg) doCstDtl_not_cost_flg_NE(info);
		else if (ne == columnCstDtl_memo1) doCstDtl_memo1_NE(info);
		else if (ne == columnCstDtl_memo2) doCstDtl_memo2_NE(info);
		else if (ne == columnCstDtl_memo3) doCstDtl_memo3_NE(info);
		else if (ne == columnCstDtl_ins_usr_id) doCstDtl_ins_usr_id_NE(info);
		else if (ne == columnCstDtl_ins_usr_nm) doCstDtl_ins_usr_nm_NE(info);
		else if (ne == columnCstDtl_ins_ts) doCstDtl_ins_ts_NE(info);
		else if (ne == columnCstDtl_ins_func_id) doCstDtl_ins_func_id_NE(info);
		else if (ne == columnCstDtl_ins_func_nm) doCstDtl_ins_func_nm_NE(info);
		else if (ne == columnCstDtl_upd_usr_id) doCstDtl_upd_usr_id_NE(info);
		else if (ne == columnCstDtl_upd_usr_nm) doCstDtl_upd_usr_nm_NE(info);
		else if (ne == columnCstDtl_upd_ts) doCstDtl_upd_ts_NE(info);
		else if (ne == columnCstDtl_upd_func_id) doCstDtl_upd_func_id_NE(info);
		else if (ne == columnCstDtl_upd_func_nm) doCstDtl_upd_func_nm_NE(info);
		else if (ne == columnCstDtl_upd_srv_req_no) doCstDtl_upd_srv_req_no_NE(info);
		else if (ne == columnItmDtl_peg_no) doItmDtl_peg_no_NE(info);
		else if (ne == columnItmDtl_wg_cd) doItmDtl_wg_cd_NE(info);
		else if (ne == columnItmDtl_wg_nm) doItmDtl_wg_nm_NE(info);
		else if (ne == columnItmDtl_sls_upri_grp_cd) doItmDtl_sls_upri_grp_cd_NE(info);
		else if (ne == columnItmDtl_sls_upri_grp_nm) doItmDtl_sls_upri_grp_nm_NE(info);
		else if (ne == columnItmDtl_sls_upri_rank_cd) doItmDtl_sls_upri_rank_cd_NE(info);
		else if (ne == columnItmDtl_sls_upri_rank_nm) doItmDtl_sls_upri_rank_nm_NE(info);
		else if (ne == columnItmDtl_unit_cd) doItmDtl_unit_cd_NE(info);
		else if (ne == columnItmDtl_unit_nm) doItmDtl_unit_nm_NE(info);
		else if (ne == columnItmDtl_lot_qty) doItmDtl_lot_qty_NE(info);
		else if (ne == columnItmDtl_cur_cd) doItmDtl_cur_cd_NE(info);
		else if (ne == columnItmDtl_cur_nm) doItmDtl_cur_nm_NE(info);
		else if (ne == columnItmDtl_st_dt) doItmDtl_st_dt_NE(info);
		else if (ne == columnItmDtl_end_dt) doItmDtl_end_dt_NE(info);
		else if (ne == columnItmDtl_upri) doItmDtl_upri_NE(info);
		else if (ne == columnItmDtl_upri_bf) doItmDtl_upri_bf_NE(info);
		else if (ne == columnItmDtl_interim_flg) doItmDtl_interim_flg_NE(info);
		else if (ne == columnItmDtl_upri_rate) doItmDtl_upri_rate_NE(info);
		else if (ne == columnItmDtl_upri_rate_bf) doItmDtl_upri_rate_bf_NE(info);
		else if (ne == columnItmDtl_sub_upri1) doItmDtl_sub_upri1_NE(info);
		else if (ne == columnItmDtl_sub_upri2) doItmDtl_sub_upri2_NE(info);
		else if (ne == columnItmDtl_sub_upri3) doItmDtl_sub_upri3_NE(info);
		else if (ne == columnItmDtl_not_cost_flg) doItmDtl_not_cost_flg_NE(info);
		else if (ne == columnItmDtl_memo1) doItmDtl_memo1_NE(info);
		else if (ne == columnItmDtl_memo2) doItmDtl_memo2_NE(info);
		else if (ne == columnItmDtl_memo3) doItmDtl_memo3_NE(info);
		else if (ne == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_NE(info);
		else if (ne == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_NE(info);
		else if (ne == columnItmDtl_ins_ts) doItmDtl_ins_ts_NE(info);
		else if (ne == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_NE(info);
		else if (ne == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_NE(info);
		else if (ne == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_NE(info);
		else if (ne == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_NE(info);
		else if (ne == columnItmDtl_upd_ts) doItmDtl_upd_ts_NE(info);
		else if (ne == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_NE(info);
		else if (ne == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_NE(info);
		else if (ne == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_NE(info);
		else if (ne == columnStdDtl_peg_no) doStdDtl_peg_no_NE(info);
		else if (ne == columnStdDtl_wg_cd) doStdDtl_wg_cd_NE(info);
		else if (ne == columnStdDtl_wg_nm) doStdDtl_wg_nm_NE(info);
		else if (ne == columnStdDtl_unit_cd) doStdDtl_unit_cd_NE(info);
		else if (ne == columnStdDtl_unit_nm) doStdDtl_unit_nm_NE(info);
		else if (ne == columnStdDtl_lot_qty) doStdDtl_lot_qty_NE(info);
		else if (ne == columnStdDtl_cur_cd) doStdDtl_cur_cd_NE(info);
		else if (ne == columnStdDtl_cur_nm) doStdDtl_cur_nm_NE(info);
		else if (ne == columnStdDtl_st_dt) doStdDtl_st_dt_NE(info);
		else if (ne == columnStdDtl_end_dt) doStdDtl_end_dt_NE(info);
		else if (ne == columnStdDtl_upri) doStdDtl_upri_NE(info);
		else if (ne == columnStdDtl_upri_bf) doStdDtl_upri_bf_NE(info);
		else if (ne == columnStdDtl_sub_upri1) doStdDtl_sub_upri1_NE(info);
		else if (ne == columnStdDtl_sub_upri2) doStdDtl_sub_upri2_NE(info);
		else if (ne == columnStdDtl_sub_upri3) doStdDtl_sub_upri3_NE(info);
		else if (ne == columnStdDtl_not_cost_flg) doStdDtl_not_cost_flg_NE(info);
		else if (ne == columnStdDtl_memo1) doStdDtl_memo1_NE(info);
		else if (ne == columnStdDtl_memo2) doStdDtl_memo2_NE(info);
		else if (ne == columnStdDtl_memo3) doStdDtl_memo3_NE(info);
		else if (ne == columnStdDtl_ins_usr_id) doStdDtl_ins_usr_id_NE(info);
		else if (ne == columnStdDtl_ins_usr_nm) doStdDtl_ins_usr_nm_NE(info);
		else if (ne == columnStdDtl_ins_ts) doStdDtl_ins_ts_NE(info);
		else if (ne == columnStdDtl_ins_func_id) doStdDtl_ins_func_id_NE(info);
		else if (ne == columnStdDtl_ins_func_nm) doStdDtl_ins_func_nm_NE(info);
		else if (ne == columnStdDtl_upd_usr_id) doStdDtl_upd_usr_id_NE(info);
		else if (ne == columnStdDtl_upd_usr_nm) doStdDtl_upd_usr_nm_NE(info);
		else if (ne == columnStdDtl_upd_ts) doStdDtl_upd_ts_NE(info);
		else if (ne == columnStdDtl_upd_func_id) doStdDtl_upd_func_id_NE(info);
		else if (ne == columnStdDtl_upd_func_nm) doStdDtl_upd_func_nm_NE(info);
		else if (ne == columnStdDtl_upd_srv_req_no) doStdDtl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_bf_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_bf_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri1_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri2_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri3_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_not_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_bf_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_bf_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri1_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri2_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri3_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_not_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_bf_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri1_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri2_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri3_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_not_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == CstDtlTable) doCstDtl_NX(info);
		else if (nx == ItmDtlTable) doItmDtl_NX(info);
		else if (nx == StdDtlTable) doStdDtl_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_peg_no) doDtl_peg_no_NX(info);
		else if (nx == columnDtl_dt) doDtl_dt_NX(info);
		else if (nx == columnDtl_dpt_cd) doDtl_dpt_cd_NX(info);
		else if (nx == columnDtl_dpt_nm) doDtl_dpt_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_NX(info);
		else if (nx == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_NX(info);
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
		else if (nx == columnDtl_cur_cd) doDtl_cur_cd_NX(info);
		else if (nx == columnDtl_cur_nm) doDtl_cur_nm_NX(info);
		else if (nx == columnDtl_unit_cd) doDtl_unit_cd_NX(info);
		else if (nx == columnDtl_unit_nm) doDtl_unit_nm_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_sls_upri) doDtl_sls_upri_NX(info);
		else if (nx == columnDtl_interim_flg) doDtl_interim_flg_NX(info);
		else if (nx == columnDtl_err_flg) doDtl_err_flg_NX(info);
		else if (nx == columnCstDtl_peg_no) doCstDtl_peg_no_NX(info);
		else if (nx == columnCstDtl_wg_cd) doCstDtl_wg_cd_NX(info);
		else if (nx == columnCstDtl_wg_nm) doCstDtl_wg_nm_NX(info);
		else if (nx == columnCstDtl_cst_cd) doCstDtl_cst_cd_NX(info);
		else if (nx == columnCstDtl_cst_nm) doCstDtl_cst_nm_NX(info);
		else if (nx == columnCstDtl_dlv_cd) doCstDtl_dlv_cd_NX(info);
		else if (nx == columnCstDtl_dlv_nm) doCstDtl_dlv_nm_NX(info);
		else if (nx == columnCstDtl_dest_cd1) doCstDtl_dest_cd1_NX(info);
		else if (nx == columnCstDtl_dest_nm1) doCstDtl_dest_nm1_NX(info);
		else if (nx == columnCstDtl_dest_cd2) doCstDtl_dest_cd2_NX(info);
		else if (nx == columnCstDtl_dest_nm2) doCstDtl_dest_nm2_NX(info);
		else if (nx == columnCstDtl_dest_cd3) doCstDtl_dest_cd3_NX(info);
		else if (nx == columnCstDtl_dest_nm3) doCstDtl_dest_nm3_NX(info);
		else if (nx == columnCstDtl_sls_upri_grp_cd) doCstDtl_sls_upri_grp_cd_NX(info);
		else if (nx == columnCstDtl_sls_upri_grp_nm) doCstDtl_sls_upri_grp_nm_NX(info);
		else if (nx == columnCstDtl_unit_cd) doCstDtl_unit_cd_NX(info);
		else if (nx == columnCstDtl_unit_nm) doCstDtl_unit_nm_NX(info);
		else if (nx == columnCstDtl_lot_qty) doCstDtl_lot_qty_NX(info);
		else if (nx == columnCstDtl_cur_cd) doCstDtl_cur_cd_NX(info);
		else if (nx == columnCstDtl_cur_nm) doCstDtl_cur_nm_NX(info);
		else if (nx == columnCstDtl_st_dt) doCstDtl_st_dt_NX(info);
		else if (nx == columnCstDtl_end_dt) doCstDtl_end_dt_NX(info);
		else if (nx == columnCstDtl_upri) doCstDtl_upri_NX(info);
		else if (nx == columnCstDtl_upri_bf) doCstDtl_upri_bf_NX(info);
		else if (nx == columnCstDtl_interim_flg) doCstDtl_interim_flg_NX(info);
		else if (nx == columnCstDtl_upri_rate) doCstDtl_upri_rate_NX(info);
		else if (nx == columnCstDtl_upri_rate_bf) doCstDtl_upri_rate_bf_NX(info);
		else if (nx == columnCstDtl_sub_upri1) doCstDtl_sub_upri1_NX(info);
		else if (nx == columnCstDtl_sub_upri2) doCstDtl_sub_upri2_NX(info);
		else if (nx == columnCstDtl_sub_upri3) doCstDtl_sub_upri3_NX(info);
		else if (nx == columnCstDtl_not_cost_flg) doCstDtl_not_cost_flg_NX(info);
		else if (nx == columnCstDtl_memo1) doCstDtl_memo1_NX(info);
		else if (nx == columnCstDtl_memo2) doCstDtl_memo2_NX(info);
		else if (nx == columnCstDtl_memo3) doCstDtl_memo3_NX(info);
		else if (nx == columnCstDtl_ins_usr_id) doCstDtl_ins_usr_id_NX(info);
		else if (nx == columnCstDtl_ins_usr_nm) doCstDtl_ins_usr_nm_NX(info);
		else if (nx == columnCstDtl_ins_ts) doCstDtl_ins_ts_NX(info);
		else if (nx == columnCstDtl_ins_func_id) doCstDtl_ins_func_id_NX(info);
		else if (nx == columnCstDtl_ins_func_nm) doCstDtl_ins_func_nm_NX(info);
		else if (nx == columnCstDtl_upd_usr_id) doCstDtl_upd_usr_id_NX(info);
		else if (nx == columnCstDtl_upd_usr_nm) doCstDtl_upd_usr_nm_NX(info);
		else if (nx == columnCstDtl_upd_ts) doCstDtl_upd_ts_NX(info);
		else if (nx == columnCstDtl_upd_func_id) doCstDtl_upd_func_id_NX(info);
		else if (nx == columnCstDtl_upd_func_nm) doCstDtl_upd_func_nm_NX(info);
		else if (nx == columnCstDtl_upd_srv_req_no) doCstDtl_upd_srv_req_no_NX(info);
		else if (nx == columnItmDtl_peg_no) doItmDtl_peg_no_NX(info);
		else if (nx == columnItmDtl_wg_cd) doItmDtl_wg_cd_NX(info);
		else if (nx == columnItmDtl_wg_nm) doItmDtl_wg_nm_NX(info);
		else if (nx == columnItmDtl_sls_upri_grp_cd) doItmDtl_sls_upri_grp_cd_NX(info);
		else if (nx == columnItmDtl_sls_upri_grp_nm) doItmDtl_sls_upri_grp_nm_NX(info);
		else if (nx == columnItmDtl_sls_upri_rank_cd) doItmDtl_sls_upri_rank_cd_NX(info);
		else if (nx == columnItmDtl_sls_upri_rank_nm) doItmDtl_sls_upri_rank_nm_NX(info);
		else if (nx == columnItmDtl_unit_cd) doItmDtl_unit_cd_NX(info);
		else if (nx == columnItmDtl_unit_nm) doItmDtl_unit_nm_NX(info);
		else if (nx == columnItmDtl_lot_qty) doItmDtl_lot_qty_NX(info);
		else if (nx == columnItmDtl_cur_cd) doItmDtl_cur_cd_NX(info);
		else if (nx == columnItmDtl_cur_nm) doItmDtl_cur_nm_NX(info);
		else if (nx == columnItmDtl_st_dt) doItmDtl_st_dt_NX(info);
		else if (nx == columnItmDtl_end_dt) doItmDtl_end_dt_NX(info);
		else if (nx == columnItmDtl_upri) doItmDtl_upri_NX(info);
		else if (nx == columnItmDtl_upri_bf) doItmDtl_upri_bf_NX(info);
		else if (nx == columnItmDtl_interim_flg) doItmDtl_interim_flg_NX(info);
		else if (nx == columnItmDtl_upri_rate) doItmDtl_upri_rate_NX(info);
		else if (nx == columnItmDtl_upri_rate_bf) doItmDtl_upri_rate_bf_NX(info);
		else if (nx == columnItmDtl_sub_upri1) doItmDtl_sub_upri1_NX(info);
		else if (nx == columnItmDtl_sub_upri2) doItmDtl_sub_upri2_NX(info);
		else if (nx == columnItmDtl_sub_upri3) doItmDtl_sub_upri3_NX(info);
		else if (nx == columnItmDtl_not_cost_flg) doItmDtl_not_cost_flg_NX(info);
		else if (nx == columnItmDtl_memo1) doItmDtl_memo1_NX(info);
		else if (nx == columnItmDtl_memo2) doItmDtl_memo2_NX(info);
		else if (nx == columnItmDtl_memo3) doItmDtl_memo3_NX(info);
		else if (nx == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_NX(info);
		else if (nx == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_NX(info);
		else if (nx == columnItmDtl_ins_ts) doItmDtl_ins_ts_NX(info);
		else if (nx == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_NX(info);
		else if (nx == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_NX(info);
		else if (nx == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_NX(info);
		else if (nx == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_NX(info);
		else if (nx == columnItmDtl_upd_ts) doItmDtl_upd_ts_NX(info);
		else if (nx == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_NX(info);
		else if (nx == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_NX(info);
		else if (nx == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_NX(info);
		else if (nx == columnStdDtl_peg_no) doStdDtl_peg_no_NX(info);
		else if (nx == columnStdDtl_wg_cd) doStdDtl_wg_cd_NX(info);
		else if (nx == columnStdDtl_wg_nm) doStdDtl_wg_nm_NX(info);
		else if (nx == columnStdDtl_unit_cd) doStdDtl_unit_cd_NX(info);
		else if (nx == columnStdDtl_unit_nm) doStdDtl_unit_nm_NX(info);
		else if (nx == columnStdDtl_lot_qty) doStdDtl_lot_qty_NX(info);
		else if (nx == columnStdDtl_cur_cd) doStdDtl_cur_cd_NX(info);
		else if (nx == columnStdDtl_cur_nm) doStdDtl_cur_nm_NX(info);
		else if (nx == columnStdDtl_st_dt) doStdDtl_st_dt_NX(info);
		else if (nx == columnStdDtl_end_dt) doStdDtl_end_dt_NX(info);
		else if (nx == columnStdDtl_upri) doStdDtl_upri_NX(info);
		else if (nx == columnStdDtl_upri_bf) doStdDtl_upri_bf_NX(info);
		else if (nx == columnStdDtl_sub_upri1) doStdDtl_sub_upri1_NX(info);
		else if (nx == columnStdDtl_sub_upri2) doStdDtl_sub_upri2_NX(info);
		else if (nx == columnStdDtl_sub_upri3) doStdDtl_sub_upri3_NX(info);
		else if (nx == columnStdDtl_not_cost_flg) doStdDtl_not_cost_flg_NX(info);
		else if (nx == columnStdDtl_memo1) doStdDtl_memo1_NX(info);
		else if (nx == columnStdDtl_memo2) doStdDtl_memo2_NX(info);
		else if (nx == columnStdDtl_memo3) doStdDtl_memo3_NX(info);
		else if (nx == columnStdDtl_ins_usr_id) doStdDtl_ins_usr_id_NX(info);
		else if (nx == columnStdDtl_ins_usr_nm) doStdDtl_ins_usr_nm_NX(info);
		else if (nx == columnStdDtl_ins_ts) doStdDtl_ins_ts_NX(info);
		else if (nx == columnStdDtl_ins_func_id) doStdDtl_ins_func_id_NX(info);
		else if (nx == columnStdDtl_ins_func_nm) doStdDtl_ins_func_nm_NX(info);
		else if (nx == columnStdDtl_upd_usr_id) doStdDtl_upd_usr_id_NX(info);
		else if (nx == columnStdDtl_upd_usr_nm) doStdDtl_upd_usr_nm_NX(info);
		else if (nx == columnStdDtl_upd_ts) doStdDtl_upd_ts_NX(info);
		else if (nx == columnStdDtl_upd_func_id) doStdDtl_upd_func_id_NX(info);
		else if (nx == columnStdDtl_upd_func_nm) doStdDtl_upd_func_nm_NX(info);
		else if (nx == columnStdDtl_upd_srv_req_no) doStdDtl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_bf_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_bf_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri1_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri2_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri3_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_not_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_bf_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_bf_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri1_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri2_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri3_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_not_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_bf_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri1_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri2_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri3_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_not_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnDtl_peg_no) doDtl_peg_no_LC(info);
		else if (lc == columnDtl_dt) doDtl_dt_LC(info);
		else if (lc == columnDtl_dpt_cd) doDtl_dpt_cd_LC(info);
		else if (lc == columnDtl_dpt_nm) doDtl_dpt_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_LC(info);
		else if (lc == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_LC(info);
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
		else if (lc == columnDtl_cur_cd) doDtl_cur_cd_LC(info);
		else if (lc == columnDtl_cur_nm) doDtl_cur_nm_LC(info);
		else if (lc == columnDtl_unit_cd) doDtl_unit_cd_LC(info);
		else if (lc == columnDtl_unit_nm) doDtl_unit_nm_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_sls_upri) doDtl_sls_upri_LC(info);
		else if (lc == columnCstDtl_peg_no) doCstDtl_peg_no_LC(info);
		else if (lc == columnCstDtl_wg_cd) doCstDtl_wg_cd_LC(info);
		else if (lc == columnCstDtl_wg_nm) doCstDtl_wg_nm_LC(info);
		else if (lc == columnCstDtl_cst_cd) doCstDtl_cst_cd_LC(info);
		else if (lc == columnCstDtl_cst_nm) doCstDtl_cst_nm_LC(info);
		else if (lc == columnCstDtl_dlv_cd) doCstDtl_dlv_cd_LC(info);
		else if (lc == columnCstDtl_dlv_nm) doCstDtl_dlv_nm_LC(info);
		else if (lc == columnCstDtl_dest_cd1) doCstDtl_dest_cd1_LC(info);
		else if (lc == columnCstDtl_dest_nm1) doCstDtl_dest_nm1_LC(info);
		else if (lc == columnCstDtl_dest_cd2) doCstDtl_dest_cd2_LC(info);
		else if (lc == columnCstDtl_dest_nm2) doCstDtl_dest_nm2_LC(info);
		else if (lc == columnCstDtl_dest_cd3) doCstDtl_dest_cd3_LC(info);
		else if (lc == columnCstDtl_dest_nm3) doCstDtl_dest_nm3_LC(info);
		else if (lc == columnCstDtl_sls_upri_grp_cd) doCstDtl_sls_upri_grp_cd_LC(info);
		else if (lc == columnCstDtl_sls_upri_grp_nm) doCstDtl_sls_upri_grp_nm_LC(info);
		else if (lc == columnCstDtl_unit_cd) doCstDtl_unit_cd_LC(info);
		else if (lc == columnCstDtl_unit_nm) doCstDtl_unit_nm_LC(info);
		else if (lc == columnCstDtl_lot_qty) doCstDtl_lot_qty_LC(info);
		else if (lc == columnCstDtl_cur_cd) doCstDtl_cur_cd_LC(info);
		else if (lc == columnCstDtl_cur_nm) doCstDtl_cur_nm_LC(info);
		else if (lc == columnCstDtl_st_dt) doCstDtl_st_dt_LC(info);
		else if (lc == columnCstDtl_end_dt) doCstDtl_end_dt_LC(info);
		else if (lc == columnCstDtl_upri) doCstDtl_upri_LC(info);
		else if (lc == columnCstDtl_upri_bf) doCstDtl_upri_bf_LC(info);
		else if (lc == columnCstDtl_upri_rate) doCstDtl_upri_rate_LC(info);
		else if (lc == columnCstDtl_upri_rate_bf) doCstDtl_upri_rate_bf_LC(info);
		else if (lc == columnCstDtl_sub_upri1) doCstDtl_sub_upri1_LC(info);
		else if (lc == columnCstDtl_sub_upri2) doCstDtl_sub_upri2_LC(info);
		else if (lc == columnCstDtl_sub_upri3) doCstDtl_sub_upri3_LC(info);
		else if (lc == columnCstDtl_memo1) doCstDtl_memo1_LC(info);
		else if (lc == columnCstDtl_memo2) doCstDtl_memo2_LC(info);
		else if (lc == columnCstDtl_memo3) doCstDtl_memo3_LC(info);
		else if (lc == columnCstDtl_ins_usr_id) doCstDtl_ins_usr_id_LC(info);
		else if (lc == columnCstDtl_ins_usr_nm) doCstDtl_ins_usr_nm_LC(info);
		else if (lc == columnCstDtl_ins_ts) doCstDtl_ins_ts_LC(info);
		else if (lc == columnCstDtl_ins_func_id) doCstDtl_ins_func_id_LC(info);
		else if (lc == columnCstDtl_ins_func_nm) doCstDtl_ins_func_nm_LC(info);
		else if (lc == columnCstDtl_upd_usr_id) doCstDtl_upd_usr_id_LC(info);
		else if (lc == columnCstDtl_upd_usr_nm) doCstDtl_upd_usr_nm_LC(info);
		else if (lc == columnCstDtl_upd_ts) doCstDtl_upd_ts_LC(info);
		else if (lc == columnCstDtl_upd_func_id) doCstDtl_upd_func_id_LC(info);
		else if (lc == columnCstDtl_upd_func_nm) doCstDtl_upd_func_nm_LC(info);
		else if (lc == columnCstDtl_upd_srv_req_no) doCstDtl_upd_srv_req_no_LC(info);
		else if (lc == columnItmDtl_peg_no) doItmDtl_peg_no_LC(info);
		else if (lc == columnItmDtl_wg_cd) doItmDtl_wg_cd_LC(info);
		else if (lc == columnItmDtl_wg_nm) doItmDtl_wg_nm_LC(info);
		else if (lc == columnItmDtl_sls_upri_grp_cd) doItmDtl_sls_upri_grp_cd_LC(info);
		else if (lc == columnItmDtl_sls_upri_grp_nm) doItmDtl_sls_upri_grp_nm_LC(info);
		else if (lc == columnItmDtl_sls_upri_rank_cd) doItmDtl_sls_upri_rank_cd_LC(info);
		else if (lc == columnItmDtl_sls_upri_rank_nm) doItmDtl_sls_upri_rank_nm_LC(info);
		else if (lc == columnItmDtl_unit_cd) doItmDtl_unit_cd_LC(info);
		else if (lc == columnItmDtl_unit_nm) doItmDtl_unit_nm_LC(info);
		else if (lc == columnItmDtl_lot_qty) doItmDtl_lot_qty_LC(info);
		else if (lc == columnItmDtl_cur_cd) doItmDtl_cur_cd_LC(info);
		else if (lc == columnItmDtl_cur_nm) doItmDtl_cur_nm_LC(info);
		else if (lc == columnItmDtl_st_dt) doItmDtl_st_dt_LC(info);
		else if (lc == columnItmDtl_end_dt) doItmDtl_end_dt_LC(info);
		else if (lc == columnItmDtl_upri) doItmDtl_upri_LC(info);
		else if (lc == columnItmDtl_upri_bf) doItmDtl_upri_bf_LC(info);
		else if (lc == columnItmDtl_upri_rate) doItmDtl_upri_rate_LC(info);
		else if (lc == columnItmDtl_upri_rate_bf) doItmDtl_upri_rate_bf_LC(info);
		else if (lc == columnItmDtl_sub_upri1) doItmDtl_sub_upri1_LC(info);
		else if (lc == columnItmDtl_sub_upri2) doItmDtl_sub_upri2_LC(info);
		else if (lc == columnItmDtl_sub_upri3) doItmDtl_sub_upri3_LC(info);
		else if (lc == columnItmDtl_memo1) doItmDtl_memo1_LC(info);
		else if (lc == columnItmDtl_memo2) doItmDtl_memo2_LC(info);
		else if (lc == columnItmDtl_memo3) doItmDtl_memo3_LC(info);
		else if (lc == columnItmDtl_ins_usr_id) doItmDtl_ins_usr_id_LC(info);
		else if (lc == columnItmDtl_ins_usr_nm) doItmDtl_ins_usr_nm_LC(info);
		else if (lc == columnItmDtl_ins_ts) doItmDtl_ins_ts_LC(info);
		else if (lc == columnItmDtl_ins_func_id) doItmDtl_ins_func_id_LC(info);
		else if (lc == columnItmDtl_ins_func_nm) doItmDtl_ins_func_nm_LC(info);
		else if (lc == columnItmDtl_upd_usr_id) doItmDtl_upd_usr_id_LC(info);
		else if (lc == columnItmDtl_upd_usr_nm) doItmDtl_upd_usr_nm_LC(info);
		else if (lc == columnItmDtl_upd_ts) doItmDtl_upd_ts_LC(info);
		else if (lc == columnItmDtl_upd_func_id) doItmDtl_upd_func_id_LC(info);
		else if (lc == columnItmDtl_upd_func_nm) doItmDtl_upd_func_nm_LC(info);
		else if (lc == columnItmDtl_upd_srv_req_no) doItmDtl_upd_srv_req_no_LC(info);
		else if (lc == columnStdDtl_peg_no) doStdDtl_peg_no_LC(info);
		else if (lc == columnStdDtl_wg_cd) doStdDtl_wg_cd_LC(info);
		else if (lc == columnStdDtl_wg_nm) doStdDtl_wg_nm_LC(info);
		else if (lc == columnStdDtl_unit_cd) doStdDtl_unit_cd_LC(info);
		else if (lc == columnStdDtl_unit_nm) doStdDtl_unit_nm_LC(info);
		else if (lc == columnStdDtl_lot_qty) doStdDtl_lot_qty_LC(info);
		else if (lc == columnStdDtl_cur_cd) doStdDtl_cur_cd_LC(info);
		else if (lc == columnStdDtl_cur_nm) doStdDtl_cur_nm_LC(info);
		else if (lc == columnStdDtl_st_dt) doStdDtl_st_dt_LC(info);
		else if (lc == columnStdDtl_end_dt) doStdDtl_end_dt_LC(info);
		else if (lc == columnStdDtl_upri) doStdDtl_upri_LC(info);
		else if (lc == columnStdDtl_upri_bf) doStdDtl_upri_bf_LC(info);
		else if (lc == columnStdDtl_sub_upri1) doStdDtl_sub_upri1_LC(info);
		else if (lc == columnStdDtl_sub_upri2) doStdDtl_sub_upri2_LC(info);
		else if (lc == columnStdDtl_sub_upri3) doStdDtl_sub_upri3_LC(info);
		else if (lc == columnStdDtl_memo1) doStdDtl_memo1_LC(info);
		else if (lc == columnStdDtl_memo2) doStdDtl_memo2_LC(info);
		else if (lc == columnStdDtl_memo3) doStdDtl_memo3_LC(info);
		else if (lc == columnStdDtl_ins_usr_id) doStdDtl_ins_usr_id_LC(info);
		else if (lc == columnStdDtl_ins_usr_nm) doStdDtl_ins_usr_nm_LC(info);
		else if (lc == columnStdDtl_ins_ts) doStdDtl_ins_ts_LC(info);
		else if (lc == columnStdDtl_ins_func_id) doStdDtl_ins_func_id_LC(info);
		else if (lc == columnStdDtl_ins_func_nm) doStdDtl_ins_func_nm_LC(info);
		else if (lc == columnStdDtl_upd_usr_id) doStdDtl_upd_usr_id_LC(info);
		else if (lc == columnStdDtl_upd_usr_nm) doStdDtl_upd_usr_nm_LC(info);
		else if (lc == columnStdDtl_upd_ts) doStdDtl_upd_ts_LC(info);
		else if (lc == columnStdDtl_upd_func_id) doStdDtl_upd_func_id_LC(info);
		else if (lc == columnStdDtl_upd_func_nm) doStdDtl_upd_func_nm_LC(info);
		else if (lc == columnStdDtl_upd_srv_req_no) doStdDtl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Dtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dt_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sls_upri_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sls_upri_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_bf_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upri_rate_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upri_rate_bf_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri1_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri2_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[sub_upri3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_sub_upri3_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [CstDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCstDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sls_upri_rank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sls_upri_rank_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_bf_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upri_rate_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upri_rate_bf_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri1_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri2_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[sub_upri3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_sub_upri3_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upri_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upri_bf_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri1_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri2_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[sub_upri3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_sub_upri3_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [StdDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doStdDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
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
	 * コンボ／リストのリスト[columnDtl_sls_upri_grp_cd]の作成メソッド
	 */
	public MCList getDtl_sls_upri_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriGrp(row, info);
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
	 * コンボ／リストのリスト[columnDtl_cur_cd]の作成メソッド
	 */
	public MCList getDtl_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_unit_cd]の作成メソッド
	 */
	public MCList getDtl_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0910.Sprt01")) {
			return new MA_MABSL0910_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0910_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0910_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0910_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL0910_Sprt01Bridge() {
			p_MA_MABSL0910_Sprt01 = new MCParam(PDef.MA_MABSL0910_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0910_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0910.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.CstDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.ItmDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.StdDtlR.class));

			p_MA_MABSL0910_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0910_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0910_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0910_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0910_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0910.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0910.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0910.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0910.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0910.CstDtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP0910.CstDtlR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP0910.ItmDtlR> down2() {
			return (MCList<mcframe.clientMABS.MABSP0910.ItmDtlR>)down(2);
		}
		protected MCList<mcframe.clientMABS.MABSP0910.StdDtlR> down3() {
			return (MCList<mcframe.clientMABS.MABSP0910.StdDtlR>)down(3);
		}

		protected void setupDownParam() {
			p_MA_MABSL0910_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.DtlR.class));
			p_MA_MABSL0910_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.CstDtlR.class));
			p_MA_MABSL0910_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.ItmDtlR.class));
			p_MA_MABSL0910_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0910.StdDtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0910_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0910.DtlR>)p_MA_MABSL0910_Sprt01.getContainerParam().getDownBlock(0));
			setCstDtlAllL((MCList<mcframe.clientMABS.MABSP0910.CstDtlR>)p_MA_MABSL0910_Sprt01.getContainerParam().getDownBlock(1));
			setItmDtlAllL((MCList<mcframe.clientMABS.MABSP0910.ItmDtlR>)p_MA_MABSL0910_Sprt01.getContainerParam().getDownBlock(2));
			setStdDtlAllL((MCList<mcframe.clientMABS.MABSP0910.StdDtlR>)p_MA_MABSL0910_Sprt01.getContainerParam().getDownBlock(3));
		}

		protected void clear() {
			getDtlL().clear();
			getCstDtlAllL().clear();
			getItmDtlAllL().clear();
			getStdDtlAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCstDtlAllL());
			result.add(getItmDtlAllL());
			result.add(getStdDtlAllL());
			return result;
		}
	}
}