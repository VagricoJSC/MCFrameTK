package mcframe.clientMABS.MABSP0930;

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
import mcframe.clientMABS.MABSP0930.MABSP_OutsrcUpriChk_MC.MA_MABSL0930_Sprt01Caller;

/**
 * 画面"MABSP_OutsrcUpriChk"パネルクラスです。<p>
 *
 * 入力した情報に対する単価を確認する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_OutsrcUpriChk_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0930";

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
	public MCTable2<mcframe.clientMABS.MABSP0930.DtlR> DtlTable = null;
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
	 * Direct delivery sales 仕入直送売上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ddlv_sls_flg = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dt = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm = null;
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
	 * Delivery/relay location cd. 納入／中継場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Delivery/relay location name 納入／中継場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_nm = null;
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4 = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ = null;
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ_nm = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upri = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_interim_flg = null;
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_upri = null;
	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_onr_prov_upri = null;
	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slf_supprt_upri = null;
	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt = null;
	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_amt = null;
	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_onr_prov_amt = null;
	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slf_supprt_amt = null;
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
	// [ProcDtl]ブロック関連のField定義
	public MCPanel ProcDtlPanel = null;
	public MCScrollPane ProcDtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0930.ProcDtlR> ProcDtlTable = null;
	// [ProcDtl]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_peg_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ProcDtl_itm_p_PPanel;
	public MCColumnConfig columnProcDtl_itm_cd;// [ProcDtl]の[itm_p.itm_cd]を[columnProcDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnProcDtl_itm_sub1;// [ProcDtl]の[itm_p.itm_sub1]を[columnProcDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnProcDtl_itm_sub2;// [ProcDtl]の[itm_p.itm_sub2]を[columnProcDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnProcDtl_itm_sub3;// [ProcDtl]の[itm_p.itm_sub3]を[columnProcDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnProcDtl_itm_nm;// [ProcDtl]の[itm_p.itm_nm]を[columnProcDtl_itm_nm]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_maker_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_unit_nm = null;
	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_lot_qty = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_cur_nm = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_loc_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_dlv_nm = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_end_dt = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upri = null;
	/**
	 * Unit price before revision 改訂前単価.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upri_bf = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_interim_flg = null;
	/**
	 * Standard man-hour 標準工数.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_std_wk_cost = null;
	/**
	 * Standard man-hour unit price 標準工数単価.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_std_wk_cost_upri = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_not_cost_flg = null;
	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_sub_upri1 = null;
	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_sub_upri2 = null;
	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_sub_upri3 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnProcDtl_upd_srv_req_no = null;
	// [Wrk2]ブロック関連のField定義
	public MCPanel Wrk2Panel = null;
	// [Wrk2]ブロックの項目のField定義
	// [ChdItmDtl]ブロック関連のField定義
	public MCPanel ChdItmDtlPanel = null;
	public MCScrollPane ChdItmDtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0930.ChdItmDtlR> ChdItmDtlTable = null;
	// [ChdItmDtl]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_peg_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ChdItmDtl_itm_p_PPanel;
	public MCColumnConfig columnChdItmDtl_itm_cd;// [ChdItmDtl]の[itm_p.itm_cd]を[columnChdItmDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnChdItmDtl_itm_sub1;// [ChdItmDtl]の[itm_p.itm_sub1]を[columnChdItmDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnChdItmDtl_itm_sub2;// [ChdItmDtl]の[itm_p.itm_sub2]を[columnChdItmDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnChdItmDtl_itm_sub3;// [ChdItmDtl]の[itm_p.itm_sub3]を[columnChdItmDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnChdItmDtl_itm_nm;// [ChdItmDtl]の[itm_p.itm_nm]を[columnChdItmDtl_itm_nm]としてエイリアス定義。
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_prsppl_cd = null;
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_prsppl_nm = null;
	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_onr_prsppl_flg = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_cur_nm = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_end_dt = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_prov_typ_nm = null;
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upri = null;
	/**
	 * Conversion input qty. 換算投入数量.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_conv_inpt_qty = null;
	/**
	 * Conversion unit price 換算単価.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_conv_upri = null;
	/**
	 * Unit price before revision 改訂前単価.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upri_bf = null;
	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_sub_upri1 = null;
	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_sub_upri2 = null;
	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_sub_upri3 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_ins_func_nm = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnChdItmDtl_upd_srv_req_no = null;
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
	
	/** [MA_MABSL0930_Sprt01]のCallerの作成 */
	protected MABSP_OutsrcUpriChk_MC.MA_MABSL0930_Sprt01Caller createMA_MABSL0930_Sprt01() {
		MABSP_OutsrcUpriChk_MC.MA_MABSL0930_Sprt01Caller<MABSP_OutsrcUpriChk, MA_MABSL0930_Sprt01Bridge>
		caller = ((MABSP_OutsrcUpriChk_MC)this).new MA_MABSL0930_Sprt01Caller<MABSP_OutsrcUpriChk, MA_MABSL0930_Sprt01Bridge>(
					(MABSP_OutsrcUpriChk)this, new MA_MABSL0930_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL0930_Sprt01]の呼び出し */
	protected void callMA_MABSL0930_Sprt01() {
		MCCaller caller = createMA_MABSL0930_Sprt01();
		caller.exec();
	}
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0930.DtlR> aDtlL;
	/** [ProcDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> aProcDtlL;
	/** [ChdItmDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> aChdItmDtlL;
	/** [ProcDtlAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> aProcDtlAllL;
	/** [ChdItmDtlAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> aChdItmDtlAllL;

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0930.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0930.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0930.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0930.DtlR.class);
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
	 * コピーによってaProcDtlLを設定します。
	 *
	 * aProcDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ProcDtlL
	 */
	public void setProcDtlL(MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> aList) {
		if (getProcDtlL() != aList) {
			getProcDtlL().setAll(aList);
		}
	}

	/**
	 * [ProcDtl]ブロックのコンテナaProcDtlLを返します。
	 *
	 * @return ProcDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> getProcDtlL() {
		return aProcDtlL;
	}

	/**
	 * aProcDtlRを作成します。
	 *
	 * @return ProcDtlR
	 */
	public mcframe.clientMABS.MABSP0930.ProcDtlR createProcDtlR() {
		return mcframe.clientMABS.MABSP0930.ProcDtlR.create();
	}

	/**
	 * aProcDtlLを作成します。
	 *
	 * @return ProcDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> createProcDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0930.ProcDtlR.class);
	}

	/**
	 * ProcDtlTableを初期化します。
	 */
	protected void createProcDtlTable(){
		if(ProcDtlTable == null){
			ProcDtlTable = beansFactory.createTable2("ProcDtl.table");
		}
	}

	/**
	 * コピーによってaChdItmDtlLを設定します。
	 *
	 * aChdItmDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ChdItmDtlL
	 */
	public void setChdItmDtlL(MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> aList) {
		if (getChdItmDtlL() != aList) {
			getChdItmDtlL().setAll(aList);
		}
	}

	/**
	 * [ChdItmDtl]ブロックのコンテナaChdItmDtlLを返します。
	 *
	 * @return ChdItmDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> getChdItmDtlL() {
		return aChdItmDtlL;
	}

	/**
	 * aChdItmDtlRを作成します。
	 *
	 * @return ChdItmDtlR
	 */
	public mcframe.clientMABS.MABSP0930.ChdItmDtlR createChdItmDtlR() {
		return mcframe.clientMABS.MABSP0930.ChdItmDtlR.create();
	}

	/**
	 * aChdItmDtlLを作成します。
	 *
	 * @return ChdItmDtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> createChdItmDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0930.ChdItmDtlR.class);
	}

	/**
	 * ChdItmDtlTableを初期化します。
	 */
	protected void createChdItmDtlTable(){
		if(ChdItmDtlTable == null){
			ChdItmDtlTable = beansFactory.createTable2("ChdItmDtl.table");
		}
	}

	/**
	 * コピーによってaProcDtlAllLを設定します。
	 *
	 * aProcDtlAllLのインスタンスは変更されません。
	 *
	 * @param dataset ProcDtlAllL
	 */
	public void setProcDtlAllL(MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> aList) {
		if (getProcDtlAllL() != aList) {
			getProcDtlAllL().setAll(aList);
		}
	}

	/**
	 * [ProcDtlAll]ブロックのコンテナaProcDtlAllLを返します。
	 *
	 * @return ProcDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> getProcDtlAllL() {
		return aProcDtlAllL;
	}

	/**
	 * aProcDtlAllRを作成します。
	 *
	 * @return ProcDtlAllR
	 */
	public mcframe.clientMABS.MABSP0930.ProcDtlR createProcDtlAllR() {
		return mcframe.clientMABS.MABSP0930.ProcDtlR.create();
	}

	/**
	 * aProcDtlAllLを作成します。
	 *
	 * @return ProcDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> createProcDtlAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0930.ProcDtlR.class);
	}

	/**
	 * コピーによってaChdItmDtlAllLを設定します。
	 *
	 * aChdItmDtlAllLのインスタンスは変更されません。
	 *
	 * @param dataset ChdItmDtlAllL
	 */
	public void setChdItmDtlAllL(MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> aList) {
		if (getChdItmDtlAllL() != aList) {
			getChdItmDtlAllL().setAll(aList);
		}
	}

	/**
	 * [ChdItmDtlAll]ブロックのコンテナaChdItmDtlAllLを返します。
	 *
	 * @return ChdItmDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> getChdItmDtlAllL() {
		return aChdItmDtlAllL;
	}

	/**
	 * aChdItmDtlAllRを作成します。
	 *
	 * @return ChdItmDtlAllR
	 */
	public mcframe.clientMABS.MABSP0930.ChdItmDtlR createChdItmDtlAllR() {
		return mcframe.clientMABS.MABSP0930.ChdItmDtlR.create();
	}

	/**
	 * aChdItmDtlAllLを作成します。
	 *
	 * @return ChdItmDtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> createChdItmDtlAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0930.ChdItmDtlR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getProcDtlL())) ret.add(getProcDtlL());
		if(!MCCollectionUtil.contains(ret, getChdItmDtlL())) ret.add(getChdItmDtlL());
		if(!MCCollectionUtil.contains(ret, getProcDtlAllL())) ret.add(getProcDtlAllL());
		if(!MCCollectionUtil.contains(ret, getChdItmDtlAllL())) ret.add(getChdItmDtlAllL());
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
		if(aCnt == getProcDtlL()) return "ProcDtl";
		if(aCnt == getChdItmDtlL()) return "ChdItmDtl";
		if(aCnt == getProcDtlAllL()) return "ProcDtlAll";
		if(aCnt == getChdItmDtlAllL()) return "ChdItmDtlAll";
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
		if(bId.equals("ProcDtl")) return getProcDtlL();
		if(bId.equals("ChdItmDtl")) return getChdItmDtlL();
		if(bId.equals("ProcDtlAll")) return getProcDtlAllL();
		if(bId.equals("ChdItmDtlAll")) return getChdItmDtlAllL();
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
		ret.add(ProcDtlPanel);
		ret.add(Wrk2Panel);
		ret.add(ChdItmDtlPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_OutsrcUpriChk_MC_A() {
		aDtlL = createDtlL();
		aProcDtlL = createProcDtlL();
		aChdItmDtlL = createChdItmDtlL();
		aProcDtlAllL = createProcDtlAllL();
		aChdItmDtlAllL = createChdItmDtlAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_OutsrcUpriChk_MC_A(String name) {
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aProcDtlL = createProcDtlL();
		createProcDtlTable();
		ProcDtlTable.setRowName(name);
		aChdItmDtlL = createChdItmDtlL();
		createChdItmDtlTable();
		ChdItmDtlTable.setRowName(name);
		aProcDtlAllL = createProcDtlAllL();
		aChdItmDtlAllL = createChdItmDtlAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_OutsrcUpriChk_MC.jbCreateWrk((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateDtlBtn((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateDtlTab((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateWrk1((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateProcDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateWrk2((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbCreateChdItmDtl((MABSP_OutsrcUpriChk)this);
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABSP_OutsrcUpriChk p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_OutsrcUpriChk p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0930.DtlR.$itm_p);
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
		p.Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0930.DtlR.$qty_p);
		p.Dtl_qty_p_PPanel.setName("Dtl.qty_p");
		p.columnDtl_qty = p.Dtl_qty_p_PPanel.columnQty_qty;
		p.columnDtl_qty.addAliasName("Dtl.qty", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_OutsrcUpriChk p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABSP_OutsrcUpriChk p) {
	}

	/**
	 * [Wrk1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1(MABSP_OutsrcUpriChk p) {
	}

	/**
	 * [ProcDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProcDtl(MABSP_OutsrcUpriChk p) {
		p.ProcDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0930.ProcDtlR.$itm_p);
		p.ProcDtl_itm_p_PPanel.setName("ProcDtl.itm_p");
		p.columnProcDtl_itm_cd = p.ProcDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnProcDtl_itm_cd.addAliasName("ProcDtl.itm_cd", p);
		p.columnProcDtl_itm_sub1 = p.ProcDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnProcDtl_itm_sub1.addAliasName("ProcDtl.itm_sub1", p);
		p.columnProcDtl_itm_sub2 = p.ProcDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnProcDtl_itm_sub2.addAliasName("ProcDtl.itm_sub2", p);
		p.columnProcDtl_itm_sub3 = p.ProcDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnProcDtl_itm_sub3.addAliasName("ProcDtl.itm_sub3", p);
		p.columnProcDtl_itm_nm = p.ProcDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnProcDtl_itm_nm.addAliasName("ProcDtl.itm_nm", p);
	}

	/**
	 * [Wrk2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2(MABSP_OutsrcUpriChk p) {
	}

	/**
	 * [ChdItmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateChdItmDtl(MABSP_OutsrcUpriChk p) {
		p.ChdItmDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0930.ChdItmDtlR.$itm_p);
		p.ChdItmDtl_itm_p_PPanel.setName("ChdItmDtl.itm_p");
		p.columnChdItmDtl_itm_cd = p.ChdItmDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnChdItmDtl_itm_cd.addAliasName("ChdItmDtl.itm_cd", p);
		p.columnChdItmDtl_itm_sub1 = p.ChdItmDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnChdItmDtl_itm_sub1.addAliasName("ChdItmDtl.itm_sub1", p);
		p.columnChdItmDtl_itm_sub2 = p.ChdItmDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnChdItmDtl_itm_sub2.addAliasName("ChdItmDtl.itm_sub2", p);
		p.columnChdItmDtl_itm_sub3 = p.ChdItmDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnChdItmDtl_itm_sub3.addAliasName("ChdItmDtl.itm_sub3", p);
		p.columnChdItmDtl_itm_nm = p.ChdItmDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnChdItmDtl_itm_nm.addAliasName("ChdItmDtl.itm_nm", p);
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
			Dtl_dpt_cd_p = createDtl_dpt_cd_ListPutter(columnDtl_dpt_cd, "dpt_cd", "dpt_nm","loc_cd");

		}
		return Dtl_dpt_cd_p;
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
	
	
	/** [Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_loc_cd_p = null;

	/**
	 * [Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_cd_ListPutter() {
		if (Dtl_loc_cd_p == null) {
			Dtl_loc_cd_p = createDtl_loc_cd_ListPutter(columnDtl_loc_cd, "loc_cd", "loc_nm","wg_cd","wg_nm");

		}
		return Dtl_loc_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","unit_cd","sppl_cd","sppl_nm","maker_cd","maker_nm","cur_cd","cur_nm","mfg_loc_cd","mfg_loc_nm","bom_ptn");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","unit_cd","sppl_cd","sppl_nm","maker_cd","maker_nm","cur_cd","cur_nm","mfg_loc_cd","mfg_loc_nm","bom_ptn");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","unit_cd","sppl_cd","sppl_nm","maker_cd","maker_nm","cur_cd","cur_nm","mfg_loc_cd","mfg_loc_nm","bom_ptn");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","unit_cd","sppl_cd","sppl_nm","maker_cd","maker_nm","cur_cd","cur_nm","mfg_loc_cd","mfg_loc_nm","bom_ptn");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sppl_cd_p = null;

	/**
	 * [Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sppl_cd_ListPutter() {
		if (Dtl_sppl_cd_p == null) {
			Dtl_sppl_cd_p = createDtl_sppl_cd_ListPutter(columnDtl_sppl_cd, "sppl_cd", "sppl_nm","cur_cd");

		}
		return Dtl_sppl_cd_p;
	}
	
	
	/** [Dtl_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_loc_cd_p = null;

	/**
	 * [Dtl_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_loc_cd_ListPutter() {
		if (Dtl_mfg_loc_cd_p == null) {
			Dtl_mfg_loc_cd_p = createDtl_mfg_loc_cd_ListPutter(columnDtl_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","maker_cd");

		}
		return Dtl_mfg_loc_cd_p;
	}
	
	
	/** [Dtl_bom_ptn_ListPutter]の定義 */
	private MCListPutter Dtl_bom_ptn_p = null;

	/**
	 * [Dtl_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bom_ptn_ListPutter() {
		if (Dtl_bom_ptn_p == null) {
			Dtl_bom_ptn_p = createDtl_bom_ptn_ListPutter(columnDtl_bom_ptn, "bom_ptn");

		}
		return Dtl_bom_ptn_p;
	}
	
	
	/** [Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl_maker_cd_p = null;

	/**
	 * [Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_maker_cd_ListPutter() {
		if (Dtl_maker_cd_p == null) {
			Dtl_maker_cd_p = createDtl_maker_cd_ListPutter(columnDtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl_maker_cd_p;
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
	
	
	/** [Dtl_outsrc_upri_typ_ListPutter]の定義 */
	private MCListPutter Dtl_outsrc_upri_typ_p = null;

	/**
	 * [Dtl_outsrc_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_outsrc_upri_typ_ListPutter() {
		if (Dtl_outsrc_upri_typ_p == null) {
			Dtl_outsrc_upri_typ_p = createDtl_outsrc_upri_typ_ListPutter(columnDtl_outsrc_upri_typ, "outsrc_upri_typ", "outsrc_upri_typ_nm");

		}
		return Dtl_outsrc_upri_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_OutsrcUpriChk create(){
		MABSP_OutsrcUpriChk p = new MABSP_OutsrcUpriChk();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_OutsrcUpriChk create(String name){
		MABSP_OutsrcUpriChk p = new MABSP_OutsrcUpriChk(name);
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
		MABSP_OutsrcUpriChk_MC.jbfInitWrk((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitDtlBtn((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitDtlTab((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitWrk1((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitProcDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitWrk2((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbfInitChdItmDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitWrk((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitDtlBtn((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitDtlTab((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitWrk1((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitProcDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitWrk2((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.jbInitChdItmDtl((MABSP_OutsrcUpriChk)this);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_peg_no = p.beansFactory.createTableColumn("Dtl.peg_no", MCColumnType.NUMBER);
		p.columnDtl_ddlv_sls_flg = p.beansFactory.createTableColumn("Dtl.ddlv_sls_flg", MCColumnType.CHECK);
		p.columnDtl_dt = p.beansFactory.createTableColumn("Dtl.dt", MCColumnType.DATE);
		p.columnDtl_dpt_cd = p.beansFactory.createTableColumn("Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_nm = p.beansFactory.createTableColumn("Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_cur_cd = p.beansFactory.createTableColumn("Dtl.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cur_nm = p.beansFactory.createTableColumn("Dtl.cur_nm", MCColumnType.TEXT);
		p.columnDtl_unit_cd = p.beansFactory.createTableColumn("Dtl.unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_unit_nm = p.beansFactory.createTableColumn("Dtl.unit_nm", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_sno1 = p.beansFactory.createTableColumn("Dtl.sno1", MCColumnType.TEXT);
		p.columnDtl_sno2 = p.beansFactory.createTableColumn("Dtl.sno2", MCColumnType.TEXT);
		p.columnDtl_sno3 = p.beansFactory.createTableColumn("Dtl.sno3", MCColumnType.TEXT);
		p.columnDtl_sno4 = p.beansFactory.createTableColumn("Dtl.sno4", MCColumnType.TEXT);
		p.columnDtl_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_outsrc_upri_typ_nm = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ_nm", MCColumnType.TEXT);
		p.columnDtl_upri = p.beansFactory.createTableColumn("Dtl.upri", MCColumnType.NUMBER);
		p.columnDtl_interim_flg = p.beansFactory.createTableColumn("Dtl.interim_flg", MCColumnType.CHECK);
		p.columnDtl_proc_upri = p.beansFactory.createTableColumn("Dtl.proc_upri", MCColumnType.NUMBER);
		p.columnDtl_onr_prov_upri = p.beansFactory.createTableColumn("Dtl.onr_prov_upri", MCColumnType.NUMBER);
		p.columnDtl_slf_supprt_upri = p.beansFactory.createTableColumn("Dtl.slf_supprt_upri", MCColumnType.NUMBER);
		p.columnDtl_amt = p.beansFactory.createTableColumn("Dtl.amt", MCColumnType.NUMBER);
		p.columnDtl_proc_amt = p.beansFactory.createTableColumn("Dtl.proc_amt", MCColumnType.NUMBER);
		p.columnDtl_onr_prov_amt = p.beansFactory.createTableColumn("Dtl.onr_prov_amt", MCColumnType.NUMBER);
		p.columnDtl_slf_supprt_amt = p.beansFactory.createTableColumn("Dtl.slf_supprt_amt", MCColumnType.NUMBER);
		p.columnDtl_err_flg = p.beansFactory.createTableColumn("Dtl.err_flg", MCColumnType.CHECK);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABSP_OutsrcUpriChk p) {
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
	protected static void jbfInitDtlTab(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.Wrk1Panel = p.beansFactory.createPanel("Wrk1");
		// ブロックの項目の初期化
	}

	/**
	 * [ProcDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProcDtl(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.ProcDtlPanel = p.beansFactory.createPanel("ProcDtl");
		p.ProcDtlScrollPane = p.beansFactory.createScrollPane("ProcDtl.scroll");
		p.createProcDtlTable();
		// ブロックの項目の初期化
		p.columnProcDtl_peg_no = p.beansFactory.createTableColumn("ProcDtl.peg_no", MCColumnType.NUMBER);
		p.columnProcDtl_wg_cd = p.beansFactory.createTableColumn("ProcDtl.wg_cd", MCColumnType.TEXT);
		p.columnProcDtl_wg_nm = p.beansFactory.createTableColumn("ProcDtl.wg_nm", MCColumnType.TEXT);
		p.columnProcDtl_sppl_cd = p.beansFactory.createTableColumn("ProcDtl.sppl_cd", MCColumnType.TEXT);
		p.columnProcDtl_sppl_nm = p.beansFactory.createTableColumn("ProcDtl.sppl_nm", MCColumnType.TEXT);
		p.columnProcDtl_maker_cd = p.beansFactory.createTableColumn("ProcDtl.maker_cd", MCColumnType.TEXT);
		p.columnProcDtl_maker_nm = p.beansFactory.createTableColumn("ProcDtl.maker_nm", MCColumnType.TEXT);
		p.columnProcDtl_unit_cd = p.beansFactory.createTableColumn("ProcDtl.unit_cd", MCColumnType.TEXT);
		p.columnProcDtl_unit_nm = p.beansFactory.createTableColumn("ProcDtl.unit_nm", MCColumnType.TEXT);
		p.columnProcDtl_lot_qty = p.beansFactory.createTableColumn("ProcDtl.lot_qty", MCColumnType.NUMBER);
		p.columnProcDtl_cur_cd = p.beansFactory.createTableColumn("ProcDtl.cur_cd", MCColumnType.TEXT);
		p.columnProcDtl_cur_nm = p.beansFactory.createTableColumn("ProcDtl.cur_nm", MCColumnType.TEXT);
		p.columnProcDtl_loc_cd = p.beansFactory.createTableColumn("ProcDtl.loc_cd", MCColumnType.TEXT);
		p.columnProcDtl_loc_nm = p.beansFactory.createTableColumn("ProcDtl.loc_nm", MCColumnType.TEXT);
		p.columnProcDtl_dlv_cd = p.beansFactory.createTableColumn("ProcDtl.dlv_cd", MCColumnType.TEXT);
		p.columnProcDtl_dlv_nm = p.beansFactory.createTableColumn("ProcDtl.dlv_nm", MCColumnType.TEXT);
		p.columnProcDtl_st_dt = p.beansFactory.createTableColumn("ProcDtl.st_dt", MCColumnType.DATE);
		p.columnProcDtl_end_dt = p.beansFactory.createTableColumn("ProcDtl.end_dt", MCColumnType.DATE);
		p.columnProcDtl_upri = p.beansFactory.createTableColumn("ProcDtl.upri", MCColumnType.NUMBER);
		p.columnProcDtl_upri_bf = p.beansFactory.createTableColumn("ProcDtl.upri_bf", MCColumnType.NUMBER);
		p.columnProcDtl_interim_flg = p.beansFactory.createTableColumn("ProcDtl.interim_flg", MCColumnType.CHECK);
		p.columnProcDtl_std_wk_cost = p.beansFactory.createTableColumn("ProcDtl.std_wk_cost", MCColumnType.NUMBER);
		p.columnProcDtl_std_wk_cost_upri = p.beansFactory.createTableColumn("ProcDtl.std_wk_cost_upri", MCColumnType.NUMBER);
		p.columnProcDtl_not_cost_flg = p.beansFactory.createTableColumn("ProcDtl.not_cost_flg", MCColumnType.CHECK);
		p.columnProcDtl_sub_upri1 = p.beansFactory.createTableColumn("ProcDtl.sub_upri1", MCColumnType.NUMBER);
		p.columnProcDtl_sub_upri2 = p.beansFactory.createTableColumn("ProcDtl.sub_upri2", MCColumnType.NUMBER);
		p.columnProcDtl_sub_upri3 = p.beansFactory.createTableColumn("ProcDtl.sub_upri3", MCColumnType.NUMBER);
		p.columnProcDtl_memo1 = p.beansFactory.createTableColumn("ProcDtl.memo1", MCColumnType.TEXT);
		p.columnProcDtl_memo2 = p.beansFactory.createTableColumn("ProcDtl.memo2", MCColumnType.TEXT);
		p.columnProcDtl_memo3 = p.beansFactory.createTableColumn("ProcDtl.memo3", MCColumnType.TEXT);
		p.columnProcDtl_ins_usr_id = p.beansFactory.createTableColumn("ProcDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnProcDtl_ins_usr_nm = p.beansFactory.createTableColumn("ProcDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnProcDtl_ins_ts = p.beansFactory.createTableColumn("ProcDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnProcDtl_ins_func_id = p.beansFactory.createTableColumn("ProcDtl.ins_func_id", MCColumnType.TEXT);
		p.columnProcDtl_ins_func_nm = p.beansFactory.createTableColumn("ProcDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnProcDtl_upd_usr_id = p.beansFactory.createTableColumn("ProcDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnProcDtl_upd_usr_nm = p.beansFactory.createTableColumn("ProcDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnProcDtl_upd_ts = p.beansFactory.createTableColumn("ProcDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnProcDtl_upd_func_id = p.beansFactory.createTableColumn("ProcDtl.upd_func_id", MCColumnType.TEXT);
		p.columnProcDtl_upd_func_nm = p.beansFactory.createTableColumn("ProcDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnProcDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ProcDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.Wrk2Panel = p.beansFactory.createPanel("Wrk2");
		// ブロックの項目の初期化
	}

	/**
	 * [ChdItmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitChdItmDtl(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.ChdItmDtlPanel = p.beansFactory.createPanel("ChdItmDtl");
		p.ChdItmDtlScrollPane = p.beansFactory.createScrollPane("ChdItmDtl.scroll");
		p.createChdItmDtlTable();
		// ブロックの項目の初期化
		p.columnChdItmDtl_peg_no = p.beansFactory.createTableColumn("ChdItmDtl.peg_no", MCColumnType.NUMBER);
		p.columnChdItmDtl_wg_cd = p.beansFactory.createTableColumn("ChdItmDtl.wg_cd", MCColumnType.TEXT);
		p.columnChdItmDtl_wg_nm = p.beansFactory.createTableColumn("ChdItmDtl.wg_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_prsppl_cd = p.beansFactory.createTableColumn("ChdItmDtl.prsppl_cd", MCColumnType.TEXT);
		p.columnChdItmDtl_prsppl_nm = p.beansFactory.createTableColumn("ChdItmDtl.prsppl_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_onr_prsppl_flg = p.beansFactory.createTableColumn("ChdItmDtl.onr_prsppl_flg", MCColumnType.CHECK);
		p.columnChdItmDtl_cur_cd = p.beansFactory.createTableColumn("ChdItmDtl.cur_cd", MCColumnType.TEXT);
		p.columnChdItmDtl_cur_nm = p.beansFactory.createTableColumn("ChdItmDtl.cur_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_st_dt = p.beansFactory.createTableColumn("ChdItmDtl.st_dt", MCColumnType.DATE);
		p.columnChdItmDtl_end_dt = p.beansFactory.createTableColumn("ChdItmDtl.end_dt", MCColumnType.DATE);
		p.columnChdItmDtl_prov_typ = p.beansFactory.createTableColumn("ChdItmDtl.prov_typ", MCColumnType.TEXT);
		p.columnChdItmDtl_prov_typ_nm = p.beansFactory.createTableColumn("ChdItmDtl.prov_typ_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_upri = p.beansFactory.createTableColumn("ChdItmDtl.upri", MCColumnType.NUMBER);
		p.columnChdItmDtl_conv_inpt_qty = p.beansFactory.createTableColumn("ChdItmDtl.conv_inpt_qty", MCColumnType.NUMBER);
		p.columnChdItmDtl_conv_upri = p.beansFactory.createTableColumn("ChdItmDtl.conv_upri", MCColumnType.NUMBER);
		p.columnChdItmDtl_upri_bf = p.beansFactory.createTableColumn("ChdItmDtl.upri_bf", MCColumnType.NUMBER);
		p.columnChdItmDtl_sub_upri1 = p.beansFactory.createTableColumn("ChdItmDtl.sub_upri1", MCColumnType.NUMBER);
		p.columnChdItmDtl_sub_upri2 = p.beansFactory.createTableColumn("ChdItmDtl.sub_upri2", MCColumnType.NUMBER);
		p.columnChdItmDtl_sub_upri3 = p.beansFactory.createTableColumn("ChdItmDtl.sub_upri3", MCColumnType.NUMBER);
		p.columnChdItmDtl_memo1 = p.beansFactory.createTableColumn("ChdItmDtl.memo1", MCColumnType.TEXT);
		p.columnChdItmDtl_memo2 = p.beansFactory.createTableColumn("ChdItmDtl.memo2", MCColumnType.TEXT);
		p.columnChdItmDtl_memo3 = p.beansFactory.createTableColumn("ChdItmDtl.memo3", MCColumnType.TEXT);
		p.columnChdItmDtl_ins_usr_id = p.beansFactory.createTableColumn("ChdItmDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnChdItmDtl_ins_usr_nm = p.beansFactory.createTableColumn("ChdItmDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_ins_ts = p.beansFactory.createTableColumn("ChdItmDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnChdItmDtl_ins_func_id = p.beansFactory.createTableColumn("ChdItmDtl.ins_func_id", MCColumnType.TEXT);
		p.columnChdItmDtl_ins_func_nm = p.beansFactory.createTableColumn("ChdItmDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_upd_usr_id = p.beansFactory.createTableColumn("ChdItmDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnChdItmDtl_upd_usr_nm = p.beansFactory.createTableColumn("ChdItmDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_upd_ts = p.beansFactory.createTableColumn("ChdItmDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnChdItmDtl_upd_func_id = p.beansFactory.createTableColumn("ChdItmDtl.upd_func_id", MCColumnType.TEXT);
		p.columnChdItmDtl_upd_func_nm = p.beansFactory.createTableColumn("ChdItmDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnChdItmDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ChdItmDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABSP_OutsrcUpriChk p) {
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
	protected static void jbInitDtl(MABSP_OutsrcUpriChk p) {
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
	protected static void jbInitDtlBtn(MABSP_OutsrcUpriChk p) {
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
	protected static void jbInitDtlTab(MABSP_OutsrcUpriChk p) {
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
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.Wrk1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Wrk1Panel.add(p.ProcDtlPanel, null);
		p.Wrk1Panel.setLastBeans(p.ProcDtlPanel);
	}

	/**
	 * [ProcDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProcDtl(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.ProcDtlPanel.add(p.ProcDtlScrollPane);
		p.ProcDtlPanel.setLastBeans(p.ProcDtlTable);
		p.ProcDtlScrollPane.setViewportView(p.ProcDtlTable);
		p.ProcDtlTable.setList(p.getProcDtlL());
		p.ProcDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.Wrk2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Wrk2Panel.add(p.ChdItmDtlPanel, null);
		p.Wrk2Panel.setLastBeans(p.ChdItmDtlPanel);
	}

	/**
	 * [ChdItmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitChdItmDtl(MABSP_OutsrcUpriChk p) {
		// ブロック関連の初期化
		p.ChdItmDtlPanel.add(p.ChdItmDtlScrollPane);
		p.ChdItmDtlPanel.setLastBeans(p.ChdItmDtlTable);
		p.ChdItmDtlScrollPane.setViewportView(p.ChdItmDtlTable);
		p.ChdItmDtlTable.setList(p.getChdItmDtlL());
		p.ChdItmDtlPanel.setLayoutPosition("C");
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
		MABSP_OutsrcUpriChk_MC.mcInitWrk((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitDtlBtn((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitDtlTab((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitWrk1((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitProcDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitWrk2((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.mcInitChdItmDtl((MABSP_OutsrcUpriChk)this);

		// [SRCH]ステータスのモードの設定
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_Wrk((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_Dtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_DtlBtn((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_DtlTab((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_Wrk1((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_ProcDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_Wrk2((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_ChdItmDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_ProcDtlAll((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.statusInitSRCH_ChdItmDtlAll((MABSP_OutsrcUpriChk)this);

	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABSP_OutsrcUpriChk p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_OutsrcUpriChk p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_peg_no.addAllListener(p);
		p.columnDtl_peg_no.setListListener(p);
		p.columnDtl_ddlv_sls_flg.addAllListener(p);
		p.columnDtl_dt.addAllListener(p);
		p.columnDtl_dt.setListListener(p);
		p.columnDtl_dpt_cd.addAllListener(p);
		p.columnDtl_dpt_cd.setListListener(p);
		p.columnDtl_dpt_nm.addAllListener(p);
		p.columnDtl_dpt_nm.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_mfg_loc_cd.addAllListener(p);
		p.columnDtl_mfg_loc_cd.setListListener(p);
		p.columnDtl_mfg_loc_nm.addAllListener(p);
		p.columnDtl_mfg_loc_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
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
		p.columnDtl_sno1.addAllListener(p);
		p.columnDtl_sno1.setListListener(p);
		p.columnDtl_sno2.addAllListener(p);
		p.columnDtl_sno2.setListListener(p);
		p.columnDtl_sno3.addAllListener(p);
		p.columnDtl_sno3.setListListener(p);
		p.columnDtl_sno4.addAllListener(p);
		p.columnDtl_sno4.setListListener(p);
		p.columnDtl_outsrc_upri_typ.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.setListListener(p);
		p.columnDtl_outsrc_upri_typ_nm.addAllListener(p);
		p.columnDtl_outsrc_upri_typ_nm.setListListener(p);
		p.columnDtl_upri.addAllListener(p);
		p.columnDtl_upri.setListListener(p);
		p.columnDtl_interim_flg.addAllListener(p);
		p.columnDtl_proc_upri.addAllListener(p);
		p.columnDtl_proc_upri.setListListener(p);
		p.columnDtl_onr_prov_upri.addAllListener(p);
		p.columnDtl_onr_prov_upri.setListListener(p);
		p.columnDtl_slf_supprt_upri.addAllListener(p);
		p.columnDtl_slf_supprt_upri.setListListener(p);
		p.columnDtl_amt.addAllListener(p);
		p.columnDtl_amt.setListListener(p);
		p.columnDtl_proc_amt.addAllListener(p);
		p.columnDtl_proc_amt.setListListener(p);
		p.columnDtl_onr_prov_amt.addAllListener(p);
		p.columnDtl_onr_prov_amt.setListListener(p);
		p.columnDtl_slf_supprt_amt.addAllListener(p);
		p.columnDtl_slf_supprt_amt.setListListener(p);
		p.columnDtl_err_flg.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABSP_OutsrcUpriChk p) {
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
	protected static void mcInitDtlTab(MABSP_OutsrcUpriChk p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1(MABSP_OutsrcUpriChk p) {
	}

	/**
	 *  [ProcDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProcDtl(MABSP_OutsrcUpriChk p) {
		p.ProcDtlTable.addAllListener(p);
		p.columnProcDtl_peg_no.addAllListener(p);
		p.columnProcDtl_peg_no.setListListener(p);
		p.columnProcDtl_wg_cd.addAllListener(p);
		p.columnProcDtl_wg_cd.setListListener(p);
		p.columnProcDtl_wg_nm.addAllListener(p);
		p.columnProcDtl_wg_nm.setListListener(p);
		p.columnProcDtl_sppl_cd.addAllListener(p);
		p.columnProcDtl_sppl_cd.setListListener(p);
		p.columnProcDtl_sppl_nm.addAllListener(p);
		p.columnProcDtl_sppl_nm.setListListener(p);
		p.columnProcDtl_maker_cd.addAllListener(p);
		p.columnProcDtl_maker_cd.setListListener(p);
		p.columnProcDtl_maker_nm.addAllListener(p);
		p.columnProcDtl_maker_nm.setListListener(p);
		p.columnProcDtl_unit_cd.addAllListener(p);
		p.columnProcDtl_unit_cd.setListListener(p);
		p.columnProcDtl_unit_nm.addAllListener(p);
		p.columnProcDtl_unit_nm.setListListener(p);
		p.columnProcDtl_lot_qty.addAllListener(p);
		p.columnProcDtl_lot_qty.setListListener(p);
		p.columnProcDtl_cur_cd.addAllListener(p);
		p.columnProcDtl_cur_cd.setListListener(p);
		p.columnProcDtl_cur_nm.addAllListener(p);
		p.columnProcDtl_cur_nm.setListListener(p);
		p.columnProcDtl_loc_cd.addAllListener(p);
		p.columnProcDtl_loc_cd.setListListener(p);
		p.columnProcDtl_loc_nm.addAllListener(p);
		p.columnProcDtl_loc_nm.setListListener(p);
		p.columnProcDtl_dlv_cd.addAllListener(p);
		p.columnProcDtl_dlv_cd.setListListener(p);
		p.columnProcDtl_dlv_nm.addAllListener(p);
		p.columnProcDtl_dlv_nm.setListListener(p);
		p.columnProcDtl_st_dt.addAllListener(p);
		p.columnProcDtl_st_dt.setListListener(p);
		p.columnProcDtl_end_dt.addAllListener(p);
		p.columnProcDtl_end_dt.setListListener(p);
		p.columnProcDtl_upri.addAllListener(p);
		p.columnProcDtl_upri.setListListener(p);
		p.columnProcDtl_upri_bf.addAllListener(p);
		p.columnProcDtl_upri_bf.setListListener(p);
		p.columnProcDtl_interim_flg.addAllListener(p);
		p.columnProcDtl_std_wk_cost.addAllListener(p);
		p.columnProcDtl_std_wk_cost.setListListener(p);
		p.columnProcDtl_std_wk_cost_upri.addAllListener(p);
		p.columnProcDtl_std_wk_cost_upri.setListListener(p);
		p.columnProcDtl_not_cost_flg.addAllListener(p);
		p.columnProcDtl_sub_upri1.addAllListener(p);
		p.columnProcDtl_sub_upri1.setListListener(p);
		p.columnProcDtl_sub_upri2.addAllListener(p);
		p.columnProcDtl_sub_upri2.setListListener(p);
		p.columnProcDtl_sub_upri3.addAllListener(p);
		p.columnProcDtl_sub_upri3.setListListener(p);
		p.columnProcDtl_memo1.addAllListener(p);
		p.columnProcDtl_memo1.setListListener(p);
		p.columnProcDtl_memo2.addAllListener(p);
		p.columnProcDtl_memo2.setListListener(p);
		p.columnProcDtl_memo3.addAllListener(p);
		p.columnProcDtl_memo3.setListListener(p);
		p.columnProcDtl_ins_usr_id.addAllListener(p);
		p.columnProcDtl_ins_usr_id.setListListener(p);
		p.columnProcDtl_ins_usr_nm.addAllListener(p);
		p.columnProcDtl_ins_usr_nm.setListListener(p);
		p.columnProcDtl_ins_ts.addAllListener(p);
		p.columnProcDtl_ins_ts.setListListener(p);
		p.columnProcDtl_ins_func_id.addAllListener(p);
		p.columnProcDtl_ins_func_id.setListListener(p);
		p.columnProcDtl_ins_func_nm.addAllListener(p);
		p.columnProcDtl_ins_func_nm.setListListener(p);
		p.columnProcDtl_upd_usr_id.addAllListener(p);
		p.columnProcDtl_upd_usr_id.setListListener(p);
		p.columnProcDtl_upd_usr_nm.addAllListener(p);
		p.columnProcDtl_upd_usr_nm.setListListener(p);
		p.columnProcDtl_upd_ts.addAllListener(p);
		p.columnProcDtl_upd_ts.setListListener(p);
		p.columnProcDtl_upd_func_id.addAllListener(p);
		p.columnProcDtl_upd_func_id.setListListener(p);
		p.columnProcDtl_upd_func_nm.addAllListener(p);
		p.columnProcDtl_upd_func_nm.setListListener(p);
		p.columnProcDtl_upd_srv_req_no.addAllListener(p);
		p.columnProcDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Wrk2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2(MABSP_OutsrcUpriChk p) {
	}

	/**
	 *  [ChdItmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitChdItmDtl(MABSP_OutsrcUpriChk p) {
		p.ChdItmDtlTable.addAllListener(p);
		p.columnChdItmDtl_peg_no.addAllListener(p);
		p.columnChdItmDtl_peg_no.setListListener(p);
		p.columnChdItmDtl_wg_cd.addAllListener(p);
		p.columnChdItmDtl_wg_cd.setListListener(p);
		p.columnChdItmDtl_wg_nm.addAllListener(p);
		p.columnChdItmDtl_wg_nm.setListListener(p);
		p.columnChdItmDtl_prsppl_cd.addAllListener(p);
		p.columnChdItmDtl_prsppl_cd.setListListener(p);
		p.columnChdItmDtl_prsppl_nm.addAllListener(p);
		p.columnChdItmDtl_prsppl_nm.setListListener(p);
		p.columnChdItmDtl_onr_prsppl_flg.addAllListener(p);
		p.columnChdItmDtl_cur_cd.addAllListener(p);
		p.columnChdItmDtl_cur_cd.setListListener(p);
		p.columnChdItmDtl_cur_nm.addAllListener(p);
		p.columnChdItmDtl_cur_nm.setListListener(p);
		p.columnChdItmDtl_st_dt.addAllListener(p);
		p.columnChdItmDtl_st_dt.setListListener(p);
		p.columnChdItmDtl_end_dt.addAllListener(p);
		p.columnChdItmDtl_end_dt.setListListener(p);
		p.columnChdItmDtl_prov_typ.addAllListener(p);
		p.columnChdItmDtl_prov_typ.setListListener(p);
		p.columnChdItmDtl_prov_typ_nm.addAllListener(p);
		p.columnChdItmDtl_prov_typ_nm.setListListener(p);
		p.columnChdItmDtl_upri.addAllListener(p);
		p.columnChdItmDtl_upri.setListListener(p);
		p.columnChdItmDtl_conv_inpt_qty.addAllListener(p);
		p.columnChdItmDtl_conv_inpt_qty.setListListener(p);
		p.columnChdItmDtl_conv_upri.addAllListener(p);
		p.columnChdItmDtl_conv_upri.setListListener(p);
		p.columnChdItmDtl_upri_bf.addAllListener(p);
		p.columnChdItmDtl_upri_bf.setListListener(p);
		p.columnChdItmDtl_sub_upri1.addAllListener(p);
		p.columnChdItmDtl_sub_upri1.setListListener(p);
		p.columnChdItmDtl_sub_upri2.addAllListener(p);
		p.columnChdItmDtl_sub_upri2.setListListener(p);
		p.columnChdItmDtl_sub_upri3.addAllListener(p);
		p.columnChdItmDtl_sub_upri3.setListListener(p);
		p.columnChdItmDtl_memo1.addAllListener(p);
		p.columnChdItmDtl_memo1.setListListener(p);
		p.columnChdItmDtl_memo2.addAllListener(p);
		p.columnChdItmDtl_memo2.setListListener(p);
		p.columnChdItmDtl_memo3.addAllListener(p);
		p.columnChdItmDtl_memo3.setListListener(p);
		p.columnChdItmDtl_ins_usr_id.addAllListener(p);
		p.columnChdItmDtl_ins_usr_id.setListListener(p);
		p.columnChdItmDtl_ins_usr_nm.addAllListener(p);
		p.columnChdItmDtl_ins_usr_nm.setListListener(p);
		p.columnChdItmDtl_ins_ts.addAllListener(p);
		p.columnChdItmDtl_ins_ts.setListListener(p);
		p.columnChdItmDtl_ins_func_id.addAllListener(p);
		p.columnChdItmDtl_ins_func_id.setListListener(p);
		p.columnChdItmDtl_ins_func_nm.addAllListener(p);
		p.columnChdItmDtl_ins_func_nm.setListListener(p);
		p.columnChdItmDtl_upd_usr_id.addAllListener(p);
		p.columnChdItmDtl_upd_usr_id.setListListener(p);
		p.columnChdItmDtl_upd_usr_nm.addAllListener(p);
		p.columnChdItmDtl_upd_usr_nm.setListListener(p);
		p.columnChdItmDtl_upd_ts.addAllListener(p);
		p.columnChdItmDtl_upd_ts.setListListener(p);
		p.columnChdItmDtl_upd_func_id.addAllListener(p);
		p.columnChdItmDtl_upd_func_id.setListListener(p);
		p.columnChdItmDtl_upd_func_nm.addAllListener(p);
		p.columnChdItmDtl_upd_func_nm.setListListener(p);
		p.columnChdItmDtl_upd_srv_req_no.addAllListener(p);
		p.columnChdItmDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk(MABSP_OutsrcUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABSP_OutsrcUpriChk p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ddlv_sls_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_dt.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_dpt_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.putMode(p, SRCH, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.putMode(p, SRCH, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.putMode(p, SRCH, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.columnItm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty_p_PPanel.columnQty_qty.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_proc_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_onr_prov_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slf_supprt_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_proc_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_onr_prov_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slf_supprt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MABSP_OutsrcUpriChk p){
		p.DtlBtn_radd.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, SRCH, MCMode.ENABLE);
		p.DtlBtn_get_upri.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABSP_OutsrcUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1(MABSP_OutsrcUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[ProcDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ProcDtl(MABSP_OutsrcUpriChk p){
		p.columnProcDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnProcDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ProcDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnProcDtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_lot_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upri_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_std_wk_cost.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_std_wk_cost_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_not_cost_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_sub_upri1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_sub_upri2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_sub_upri3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnProcDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2(MABSP_OutsrcUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[ChdItmDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ChdItmDtl(MABSP_OutsrcUpriChk p){
		p.columnChdItmDtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnChdItmDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ChdItmDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnChdItmDtl_prsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_prsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_onr_prsppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_conv_inpt_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_conv_upri.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upri_bf.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_sub_upri1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_sub_upri2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_sub_upri3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnChdItmDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ProcDtlAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ProcDtlAll(MABSP_OutsrcUpriChk p){

	}

	/**
	 * [SRCH]ステータスの[ChdItmDtlAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ChdItmDtlAll(MABSP_OutsrcUpriChk p){

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
		MABSP_OutsrcUpriChk_MC.setTableConfigDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.setTableConfigProcDtl((MABSP_OutsrcUpriChk)this);
		MABSP_OutsrcUpriChk_MC.setTableConfigChdItmDtl((MABSP_OutsrcUpriChk)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_OutsrcUpriChk p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0930.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0930.DtlR.peg_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_peg_no);
		p.columnDtl_ddlv_sls_flg.setMeta(mcframe.clientMABS.MABSP0930.DtlR.ddlv_sls_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ddlv_sls_flg);
		p.columnDtl_dt.setMeta(mcframe.clientMABS.MABSP0930.DtlR.dt_META);
		p.columnDtl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dt);
		p.columnDtl_dpt_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.dpt_cd_META);
		p.columnDtl_dpt_cd.addLinkBeans(p.columnDtl_dpt_nm,p.columnDtl_loc_cd);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_cd);
		p.columnDtl_dpt_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.dlv_cd_META);
		p.columnDtl_dlv_cd.setListType(MCListType.STRICT);
		p.columnDtl_dlv_cd.addLinkBeans(p.columnDtl_dlv_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.loc_cd_META);
		p.columnDtl_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_loc_cd.addLinkBeans(p.columnDtl_loc_nm,p.columnDtl_wg_cd,p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_unit_cd, p.columnDtl_sppl_cd, p.columnDtl_sppl_nm, p.columnDtl_maker_cd, p.columnDtl_maker_nm, p.columnDtl_cur_cd, p.columnDtl_cur_nm, p.columnDtl_mfg_loc_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_unit_cd, p.columnDtl_sppl_cd, p.columnDtl_sppl_nm, p.columnDtl_maker_cd, p.columnDtl_maker_nm, p.columnDtl_cur_cd, p.columnDtl_cur_nm, p.columnDtl_mfg_loc_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_unit_cd, p.columnDtl_sppl_cd, p.columnDtl_sppl_nm, p.columnDtl_maker_cd, p.columnDtl_maker_nm, p.columnDtl_cur_cd, p.columnDtl_cur_nm, p.columnDtl_mfg_loc_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_unit_cd, p.columnDtl_sppl_cd, p.columnDtl_sppl_nm, p.columnDtl_maker_cd, p.columnDtl_maker_nm, p.columnDtl_cur_cd, p.columnDtl_cur_nm, p.columnDtl_mfg_loc_cd, p.columnDtl_mfg_loc_nm, p.columnDtl_bom_ptn);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.sppl_cd_META);
		p.columnDtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnDtl_sppl_cd.addLinkBeans(p.columnDtl_sppl_nm,p.columnDtl_cur_cd);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_mfg_loc_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.mfg_loc_cd_META);
		p.columnDtl_mfg_loc_cd.addLinkBeans(p.columnDtl_mfg_loc_nm,p.columnDtl_maker_cd);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_cd);
		p.columnDtl_mfg_loc_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.mfg_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0930.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.setListType(MCListType.STRICT);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.cur_cd_META);
		p.columnDtl_cur_cd.addLinkBeans(p.columnDtl_cur_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_cd);
		p.columnDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_nm);
		p.columnDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0930.DtlR.unit_cd_META);
		p.columnDtl_unit_cd.addLinkBeans(p.columnDtl_unit_nm,p.columnDtl_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd);
		p.columnDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_nm);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABS.MABSP0930.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.DtlTable.addTable(p.Dtl_qty_p_PPanel.QtyTable);
		p.columnDtl_sno1.setMeta(mcframe.clientMABS.MABSP0930.DtlR.sno1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1);
		p.columnDtl_sno2.setMeta(mcframe.clientMABS.MABSP0930.DtlR.sno2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2);
		p.columnDtl_sno3.setMeta(mcframe.clientMABS.MABSP0930.DtlR.sno3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3);
		p.columnDtl_sno4.setMeta(mcframe.clientMABS.MABSP0930.DtlR.sno4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4);
		p.columnDtl_outsrc_upri_typ.setMeta(mcframe.clientMABS.MABSP0930.DtlR.outsrc_upri_typ_META);
		p.columnDtl_outsrc_upri_typ.addLinkBeans(p.columnDtl_outsrc_upri_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ);
		p.columnDtl_outsrc_upri_typ_nm.setMeta(mcframe.clientMABS.MABSP0930.DtlR.outsrc_upri_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ_nm);
		p.columnDtl_upri.setMeta(mcframe.clientMABS.MABSP0930.DtlR.upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upri);
		p.columnDtl_interim_flg.setMeta(mcframe.clientMABS.MABSP0930.DtlR.interim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_interim_flg);
		p.columnDtl_proc_upri.setMeta(mcframe.clientMABS.MABSP0930.DtlR.proc_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_upri);
		p.columnDtl_onr_prov_upri.setMeta(mcframe.clientMABS.MABSP0930.DtlR.onr_prov_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_onr_prov_upri);
		p.columnDtl_slf_supprt_upri.setMeta(mcframe.clientMABS.MABSP0930.DtlR.slf_supprt_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slf_supprt_upri);
		p.columnDtl_amt.setMeta(mcframe.clientMABS.MABSP0930.DtlR.amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt);
		p.columnDtl_proc_amt.setMeta(mcframe.clientMABS.MABSP0930.DtlR.proc_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_amt);
		p.columnDtl_onr_prov_amt.setMeta(mcframe.clientMABS.MABSP0930.DtlR.onr_prov_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_onr_prov_amt);
		p.columnDtl_slf_supprt_amt.setMeta(mcframe.clientMABS.MABSP0930.DtlR.slf_supprt_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slf_supprt_amt);
		p.columnDtl_err_flg.setMeta(mcframe.clientMABS.MABSP0930.DtlR.err_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_err_flg);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_peg_no);
	}

	/**
	 * [ProcDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigProcDtl(MABSP_OutsrcUpriChk p) {
		p.columnProcDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.peg_no_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_peg_no);
		p.columnProcDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.wg_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_wg_cd);
		p.columnProcDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.wg_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_wg_nm);
		p.ProcDtlTable.addTable(p.ProcDtl_itm_p_PPanel.ItmTable);
		p.columnProcDtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.sppl_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_sppl_cd);
		p.columnProcDtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.sppl_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_sppl_nm);
		p.columnProcDtl_maker_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.maker_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_maker_cd);
		p.columnProcDtl_maker_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.maker_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_maker_nm);
		p.columnProcDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.unit_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_unit_cd);
		p.columnProcDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.unit_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_unit_nm);
		p.columnProcDtl_lot_qty.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.lot_qty_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_lot_qty);
		p.columnProcDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.cur_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_cur_cd);
		p.columnProcDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.cur_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_cur_nm);
		p.columnProcDtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.loc_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_loc_cd);
		p.columnProcDtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.loc_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_loc_nm);
		p.columnProcDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.dlv_cd_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_dlv_cd);
		p.columnProcDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.dlv_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_dlv_nm);
		p.columnProcDtl_st_dt.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.st_dt_META);
		p.columnProcDtl_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_st_dt);
		p.columnProcDtl_end_dt.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.end_dt_META);
		p.columnProcDtl_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_end_dt);
		p.columnProcDtl_upri.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upri_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upri);
		p.columnProcDtl_upri_bf.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upri_bf_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upri_bf);
		p.columnProcDtl_interim_flg.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.interim_flg_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_interim_flg);
		p.columnProcDtl_std_wk_cost.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.std_wk_cost_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_std_wk_cost);
		p.columnProcDtl_std_wk_cost_upri.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.std_wk_cost_upri_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_std_wk_cost_upri);
		p.columnProcDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.not_cost_flg_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_not_cost_flg);
		p.columnProcDtl_sub_upri1.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.sub_upri1_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_sub_upri1);
		p.columnProcDtl_sub_upri2.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.sub_upri2_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_sub_upri2);
		p.columnProcDtl_sub_upri3.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.sub_upri3_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_sub_upri3);
		p.columnProcDtl_memo1.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.memo1_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_memo1);
		p.columnProcDtl_memo2.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.memo2_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_memo2);
		p.columnProcDtl_memo3.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.memo3_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_memo3);
		p.columnProcDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.ins_usr_id_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_ins_usr_id);
		p.columnProcDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.ins_usr_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_ins_usr_nm);
		p.columnProcDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.ins_ts_META);
		p.columnProcDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_ins_ts);
		p.columnProcDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.ins_func_id_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_ins_func_id);
		p.columnProcDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.ins_func_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_ins_func_nm);
		p.columnProcDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upd_usr_id_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upd_usr_id);
		p.columnProcDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upd_usr_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upd_usr_nm);
		p.columnProcDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upd_ts_META);
		p.columnProcDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upd_ts);
		p.columnProcDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upd_func_id_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upd_func_id);
		p.columnProcDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upd_func_nm_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upd_func_nm);
		p.columnProcDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0930.ProcDtlR.upd_srv_req_no_META);
		p.ProcDtlTable.addColumnConfig(p.columnProcDtl_upd_srv_req_no);
	}

	/**
	 * [ChdItmDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigChdItmDtl(MABSP_OutsrcUpriChk p) {
		p.columnChdItmDtl_peg_no.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.peg_no_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_peg_no);
		p.columnChdItmDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.wg_cd_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_wg_cd);
		p.columnChdItmDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.wg_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_wg_nm);
		p.ChdItmDtlTable.addTable(p.ChdItmDtl_itm_p_PPanel.ItmTable);
		p.columnChdItmDtl_prsppl_cd.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.prsppl_cd_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_prsppl_cd);
		p.columnChdItmDtl_prsppl_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.prsppl_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_prsppl_nm);
		p.columnChdItmDtl_onr_prsppl_flg.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.onr_prsppl_flg_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_onr_prsppl_flg);
		p.columnChdItmDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.cur_cd_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_cur_cd);
		p.columnChdItmDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.cur_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_cur_nm);
		p.columnChdItmDtl_st_dt.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.st_dt_META);
		p.columnChdItmDtl_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_st_dt);
		p.columnChdItmDtl_end_dt.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.end_dt_META);
		p.columnChdItmDtl_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_end_dt);
		p.columnChdItmDtl_prov_typ.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.prov_typ_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_prov_typ);
		p.columnChdItmDtl_prov_typ_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.prov_typ_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_prov_typ_nm);
		p.columnChdItmDtl_upri.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upri_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upri);
		p.columnChdItmDtl_conv_inpt_qty.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.conv_inpt_qty_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_conv_inpt_qty);
		p.columnChdItmDtl_conv_upri.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.conv_upri_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_conv_upri);
		p.columnChdItmDtl_upri_bf.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upri_bf_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upri_bf);
		p.columnChdItmDtl_sub_upri1.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.sub_upri1_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_sub_upri1);
		p.columnChdItmDtl_sub_upri2.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.sub_upri2_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_sub_upri2);
		p.columnChdItmDtl_sub_upri3.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.sub_upri3_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_sub_upri3);
		p.columnChdItmDtl_memo1.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.memo1_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_memo1);
		p.columnChdItmDtl_memo2.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.memo2_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_memo2);
		p.columnChdItmDtl_memo3.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.memo3_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_memo3);
		p.columnChdItmDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.ins_usr_id_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_ins_usr_id);
		p.columnChdItmDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.ins_usr_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_ins_usr_nm);
		p.columnChdItmDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.ins_ts_META);
		p.columnChdItmDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_ins_ts);
		p.columnChdItmDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.ins_func_id_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_ins_func_id);
		p.columnChdItmDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.ins_func_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_ins_func_nm);
		p.columnChdItmDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upd_usr_id_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upd_usr_id);
		p.columnChdItmDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upd_usr_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upd_usr_nm);
		p.columnChdItmDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upd_ts_META);
		p.columnChdItmDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upd_ts);
		p.columnChdItmDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upd_func_id_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upd_func_id);
		p.columnChdItmDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upd_func_nm_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upd_func_nm);
		p.columnChdItmDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0930.ChdItmDtlR.upd_srv_req_no_META);
		p.ChdItmDtlTable.addColumnConfig(p.columnChdItmDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnDtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_cd.getListConfig().setPutter(getDtl_dpt_cd_ListPutter());
		columnDtl_dlv_cd.getListConfig().setPutter(getDtl_dlv_cd_ListPutter());
		columnDtl_loc_cd.getListConfig().setPutter(getDtl_loc_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_sppl_cd.getListConfig().setPutter(getDtl_sppl_cd_ListPutter());
		columnDtl_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mfg_loc_cd.getListConfig().setPutter(getDtl_mfg_loc_cd_ListPutter());
		columnDtl_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bom_ptn.getListConfig().setPutter(getDtl_bom_ptn_ListPutter());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		columnDtl_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cur_cd.getListConfig().setPutter(getDtl_cur_cd_ListPutter());
		columnDtl_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_unit_cd.getListConfig().setPutter(getDtl_unit_cd_ListPutter());
		columnDtl_outsrc_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_outsrc_upri_typ.getListConfig().setPutter(getDtl_outsrc_upri_typ_ListPutter());
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
	 * [Dtl_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlProcUpri");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlProcUpriSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlProcUpriSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlProcUpriSub3");
		return lp;
	}

	/**
	 * [Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Dtl_outsrc_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_outsrc_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OutsrcUpriTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnDtl_dpt_cd) return getDtl_dpt_cd(row, info);
		if(combo == columnDtl_dlv_cd) return getDtl_dlv_cd(row, info);
		if(combo == columnDtl_loc_cd) return getDtl_loc_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_sppl_cd) return getDtl_sppl_cd(row, info);
		if(combo == columnDtl_mfg_loc_cd) return getDtl_mfg_loc_cd(row, info);
		if(combo == columnDtl_bom_ptn) return getDtl_bom_ptn(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == columnDtl_cur_cd) return getDtl_cur_cd(row, info);
		if(combo == columnDtl_unit_cd) return getDtl_unit_cd(row, info);
		if(combo == columnDtl_outsrc_upri_typ) return getDtl_outsrc_upri_typ(row, info);
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
		if (vc == ProcDtlTable) return doProcDtl_VC(info);
		if (vc == ChdItmDtlTable) return doChdItmDtl_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_peg_no) return doDtl_peg_no_VC(info);
		if (vc == columnDtl_ddlv_sls_flg) return doDtl_ddlv_sls_flg_VC(info);
		if (vc == columnDtl_dt) return doDtl_dt_VC(info);
		if (vc == columnDtl_dpt_cd) return doDtl_dpt_cd_VC(info);
		if (vc == columnDtl_dpt_nm) return doDtl_dpt_nm_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_mfg_loc_cd) return doDtl_mfg_loc_cd_VC(info);
		if (vc == columnDtl_mfg_loc_nm) return doDtl_mfg_loc_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_cur_cd) return doDtl_cur_cd_VC(info);
		if (vc == columnDtl_cur_nm) return doDtl_cur_nm_VC(info);
		if (vc == columnDtl_unit_cd) return doDtl_unit_cd_VC(info);
		if (vc == columnDtl_unit_nm) return doDtl_unit_nm_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_sno1) return doDtl_sno1_VC(info);
		if (vc == columnDtl_sno2) return doDtl_sno2_VC(info);
		if (vc == columnDtl_sno3) return doDtl_sno3_VC(info);
		if (vc == columnDtl_sno4) return doDtl_sno4_VC(info);
		if (vc == columnDtl_outsrc_upri_typ) return doDtl_outsrc_upri_typ_VC(info);
		if (vc == columnDtl_outsrc_upri_typ_nm) return doDtl_outsrc_upri_typ_nm_VC(info);
		if (vc == columnDtl_upri) return doDtl_upri_VC(info);
		if (vc == columnDtl_interim_flg) return doDtl_interim_flg_VC(info);
		if (vc == columnDtl_proc_upri) return doDtl_proc_upri_VC(info);
		if (vc == columnDtl_onr_prov_upri) return doDtl_onr_prov_upri_VC(info);
		if (vc == columnDtl_slf_supprt_upri) return doDtl_slf_supprt_upri_VC(info);
		if (vc == columnDtl_amt) return doDtl_amt_VC(info);
		if (vc == columnDtl_proc_amt) return doDtl_proc_amt_VC(info);
		if (vc == columnDtl_onr_prov_amt) return doDtl_onr_prov_amt_VC(info);
		if (vc == columnDtl_slf_supprt_amt) return doDtl_slf_supprt_amt_VC(info);
		if (vc == columnDtl_err_flg) return doDtl_err_flg_VC(info);
		if (vc == columnProcDtl_peg_no) return doProcDtl_peg_no_VC(info);
		if (vc == columnProcDtl_wg_cd) return doProcDtl_wg_cd_VC(info);
		if (vc == columnProcDtl_wg_nm) return doProcDtl_wg_nm_VC(info);
		if (vc == columnProcDtl_sppl_cd) return doProcDtl_sppl_cd_VC(info);
		if (vc == columnProcDtl_sppl_nm) return doProcDtl_sppl_nm_VC(info);
		if (vc == columnProcDtl_maker_cd) return doProcDtl_maker_cd_VC(info);
		if (vc == columnProcDtl_maker_nm) return doProcDtl_maker_nm_VC(info);
		if (vc == columnProcDtl_unit_cd) return doProcDtl_unit_cd_VC(info);
		if (vc == columnProcDtl_unit_nm) return doProcDtl_unit_nm_VC(info);
		if (vc == columnProcDtl_lot_qty) return doProcDtl_lot_qty_VC(info);
		if (vc == columnProcDtl_cur_cd) return doProcDtl_cur_cd_VC(info);
		if (vc == columnProcDtl_cur_nm) return doProcDtl_cur_nm_VC(info);
		if (vc == columnProcDtl_loc_cd) return doProcDtl_loc_cd_VC(info);
		if (vc == columnProcDtl_loc_nm) return doProcDtl_loc_nm_VC(info);
		if (vc == columnProcDtl_dlv_cd) return doProcDtl_dlv_cd_VC(info);
		if (vc == columnProcDtl_dlv_nm) return doProcDtl_dlv_nm_VC(info);
		if (vc == columnProcDtl_st_dt) return doProcDtl_st_dt_VC(info);
		if (vc == columnProcDtl_end_dt) return doProcDtl_end_dt_VC(info);
		if (vc == columnProcDtl_upri) return doProcDtl_upri_VC(info);
		if (vc == columnProcDtl_upri_bf) return doProcDtl_upri_bf_VC(info);
		if (vc == columnProcDtl_interim_flg) return doProcDtl_interim_flg_VC(info);
		if (vc == columnProcDtl_std_wk_cost) return doProcDtl_std_wk_cost_VC(info);
		if (vc == columnProcDtl_std_wk_cost_upri) return doProcDtl_std_wk_cost_upri_VC(info);
		if (vc == columnProcDtl_not_cost_flg) return doProcDtl_not_cost_flg_VC(info);
		if (vc == columnProcDtl_sub_upri1) return doProcDtl_sub_upri1_VC(info);
		if (vc == columnProcDtl_sub_upri2) return doProcDtl_sub_upri2_VC(info);
		if (vc == columnProcDtl_sub_upri3) return doProcDtl_sub_upri3_VC(info);
		if (vc == columnProcDtl_memo1) return doProcDtl_memo1_VC(info);
		if (vc == columnProcDtl_memo2) return doProcDtl_memo2_VC(info);
		if (vc == columnProcDtl_memo3) return doProcDtl_memo3_VC(info);
		if (vc == columnProcDtl_ins_usr_id) return doProcDtl_ins_usr_id_VC(info);
		if (vc == columnProcDtl_ins_usr_nm) return doProcDtl_ins_usr_nm_VC(info);
		if (vc == columnProcDtl_ins_ts) return doProcDtl_ins_ts_VC(info);
		if (vc == columnProcDtl_ins_func_id) return doProcDtl_ins_func_id_VC(info);
		if (vc == columnProcDtl_ins_func_nm) return doProcDtl_ins_func_nm_VC(info);
		if (vc == columnProcDtl_upd_usr_id) return doProcDtl_upd_usr_id_VC(info);
		if (vc == columnProcDtl_upd_usr_nm) return doProcDtl_upd_usr_nm_VC(info);
		if (vc == columnProcDtl_upd_ts) return doProcDtl_upd_ts_VC(info);
		if (vc == columnProcDtl_upd_func_id) return doProcDtl_upd_func_id_VC(info);
		if (vc == columnProcDtl_upd_func_nm) return doProcDtl_upd_func_nm_VC(info);
		if (vc == columnProcDtl_upd_srv_req_no) return doProcDtl_upd_srv_req_no_VC(info);
		if (vc == columnChdItmDtl_peg_no) return doChdItmDtl_peg_no_VC(info);
		if (vc == columnChdItmDtl_wg_cd) return doChdItmDtl_wg_cd_VC(info);
		if (vc == columnChdItmDtl_wg_nm) return doChdItmDtl_wg_nm_VC(info);
		if (vc == columnChdItmDtl_prsppl_cd) return doChdItmDtl_prsppl_cd_VC(info);
		if (vc == columnChdItmDtl_prsppl_nm) return doChdItmDtl_prsppl_nm_VC(info);
		if (vc == columnChdItmDtl_onr_prsppl_flg) return doChdItmDtl_onr_prsppl_flg_VC(info);
		if (vc == columnChdItmDtl_cur_cd) return doChdItmDtl_cur_cd_VC(info);
		if (vc == columnChdItmDtl_cur_nm) return doChdItmDtl_cur_nm_VC(info);
		if (vc == columnChdItmDtl_st_dt) return doChdItmDtl_st_dt_VC(info);
		if (vc == columnChdItmDtl_end_dt) return doChdItmDtl_end_dt_VC(info);
		if (vc == columnChdItmDtl_prov_typ) return doChdItmDtl_prov_typ_VC(info);
		if (vc == columnChdItmDtl_prov_typ_nm) return doChdItmDtl_prov_typ_nm_VC(info);
		if (vc == columnChdItmDtl_upri) return doChdItmDtl_upri_VC(info);
		if (vc == columnChdItmDtl_conv_inpt_qty) return doChdItmDtl_conv_inpt_qty_VC(info);
		if (vc == columnChdItmDtl_conv_upri) return doChdItmDtl_conv_upri_VC(info);
		if (vc == columnChdItmDtl_upri_bf) return doChdItmDtl_upri_bf_VC(info);
		if (vc == columnChdItmDtl_sub_upri1) return doChdItmDtl_sub_upri1_VC(info);
		if (vc == columnChdItmDtl_sub_upri2) return doChdItmDtl_sub_upri2_VC(info);
		if (vc == columnChdItmDtl_sub_upri3) return doChdItmDtl_sub_upri3_VC(info);
		if (vc == columnChdItmDtl_memo1) return doChdItmDtl_memo1_VC(info);
		if (vc == columnChdItmDtl_memo2) return doChdItmDtl_memo2_VC(info);
		if (vc == columnChdItmDtl_memo3) return doChdItmDtl_memo3_VC(info);
		if (vc == columnChdItmDtl_ins_usr_id) return doChdItmDtl_ins_usr_id_VC(info);
		if (vc == columnChdItmDtl_ins_usr_nm) return doChdItmDtl_ins_usr_nm_VC(info);
		if (vc == columnChdItmDtl_ins_ts) return doChdItmDtl_ins_ts_VC(info);
		if (vc == columnChdItmDtl_ins_func_id) return doChdItmDtl_ins_func_id_VC(info);
		if (vc == columnChdItmDtl_ins_func_nm) return doChdItmDtl_ins_func_nm_VC(info);
		if (vc == columnChdItmDtl_upd_usr_id) return doChdItmDtl_upd_usr_id_VC(info);
		if (vc == columnChdItmDtl_upd_usr_nm) return doChdItmDtl_upd_usr_nm_VC(info);
		if (vc == columnChdItmDtl_upd_ts) return doChdItmDtl_upd_ts_VC(info);
		if (vc == columnChdItmDtl_upd_func_id) return doChdItmDtl_upd_func_id_VC(info);
		if (vc == columnChdItmDtl_upd_func_nm) return doChdItmDtl_upd_func_nm_VC(info);
		if (vc == columnChdItmDtl_upd_srv_req_no) return doChdItmDtl_upd_srv_req_no_VC(info);
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
	 * [ProcDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ddlv_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ddlv_sls_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upri_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[proc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[onr_prov_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_onr_prov_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slf_supprt_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slf_supprt_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[onr_prov_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_onr_prov_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slf_supprt_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slf_supprt_amt_VC(MCEventInfo info){
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
	 * [ProcDtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[lot_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_lot_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upri_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upri_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_std_wk_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_std_wk_cost_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_not_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[sub_upri1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_sub_upri1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[sub_upri2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_sub_upri2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[sub_upri3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_sub_upri3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProcDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProcDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_prsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_prsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[onr_prsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_onr_prsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[conv_inpt_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_conv_inpt_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[conv_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_conv_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upri_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upri_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_sub_upri1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_sub_upri2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_sub_upri3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdItmDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdItmDtl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == ProcDtlTable) doProcDtl_NC(info);
		else if (nc == ChdItmDtlTable) doChdItmDtl_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_peg_no) doDtl_peg_no_NC(info);
		else if (nc == columnDtl_ddlv_sls_flg) doDtl_ddlv_sls_flg_NC(info);
		else if (nc == columnDtl_dt) doDtl_dt_NC(info);
		else if (nc == columnDtl_dpt_cd) doDtl_dpt_cd_NC(info);
		else if (nc == columnDtl_dpt_nm) doDtl_dpt_nm_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NC(info);
		else if (nc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_cur_cd) doDtl_cur_cd_NC(info);
		else if (nc == columnDtl_cur_nm) doDtl_cur_nm_NC(info);
		else if (nc == columnDtl_unit_cd) doDtl_unit_cd_NC(info);
		else if (nc == columnDtl_unit_nm) doDtl_unit_nm_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_sno1) doDtl_sno1_NC(info);
		else if (nc == columnDtl_sno2) doDtl_sno2_NC(info);
		else if (nc == columnDtl_sno3) doDtl_sno3_NC(info);
		else if (nc == columnDtl_sno4) doDtl_sno4_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NC(info);
		else if (nc == columnDtl_upri) doDtl_upri_NC(info);
		else if (nc == columnDtl_interim_flg) doDtl_interim_flg_NC(info);
		else if (nc == columnDtl_proc_upri) doDtl_proc_upri_NC(info);
		else if (nc == columnDtl_onr_prov_upri) doDtl_onr_prov_upri_NC(info);
		else if (nc == columnDtl_slf_supprt_upri) doDtl_slf_supprt_upri_NC(info);
		else if (nc == columnDtl_amt) doDtl_amt_NC(info);
		else if (nc == columnDtl_proc_amt) doDtl_proc_amt_NC(info);
		else if (nc == columnDtl_onr_prov_amt) doDtl_onr_prov_amt_NC(info);
		else if (nc == columnDtl_slf_supprt_amt) doDtl_slf_supprt_amt_NC(info);
		else if (nc == columnDtl_err_flg) doDtl_err_flg_NC(info);
		else if (nc == columnProcDtl_peg_no) doProcDtl_peg_no_NC(info);
		else if (nc == columnProcDtl_wg_cd) doProcDtl_wg_cd_NC(info);
		else if (nc == columnProcDtl_wg_nm) doProcDtl_wg_nm_NC(info);
		else if (nc == columnProcDtl_sppl_cd) doProcDtl_sppl_cd_NC(info);
		else if (nc == columnProcDtl_sppl_nm) doProcDtl_sppl_nm_NC(info);
		else if (nc == columnProcDtl_maker_cd) doProcDtl_maker_cd_NC(info);
		else if (nc == columnProcDtl_maker_nm) doProcDtl_maker_nm_NC(info);
		else if (nc == columnProcDtl_unit_cd) doProcDtl_unit_cd_NC(info);
		else if (nc == columnProcDtl_unit_nm) doProcDtl_unit_nm_NC(info);
		else if (nc == columnProcDtl_lot_qty) doProcDtl_lot_qty_NC(info);
		else if (nc == columnProcDtl_cur_cd) doProcDtl_cur_cd_NC(info);
		else if (nc == columnProcDtl_cur_nm) doProcDtl_cur_nm_NC(info);
		else if (nc == columnProcDtl_loc_cd) doProcDtl_loc_cd_NC(info);
		else if (nc == columnProcDtl_loc_nm) doProcDtl_loc_nm_NC(info);
		else if (nc == columnProcDtl_dlv_cd) doProcDtl_dlv_cd_NC(info);
		else if (nc == columnProcDtl_dlv_nm) doProcDtl_dlv_nm_NC(info);
		else if (nc == columnProcDtl_st_dt) doProcDtl_st_dt_NC(info);
		else if (nc == columnProcDtl_end_dt) doProcDtl_end_dt_NC(info);
		else if (nc == columnProcDtl_upri) doProcDtl_upri_NC(info);
		else if (nc == columnProcDtl_upri_bf) doProcDtl_upri_bf_NC(info);
		else if (nc == columnProcDtl_interim_flg) doProcDtl_interim_flg_NC(info);
		else if (nc == columnProcDtl_std_wk_cost) doProcDtl_std_wk_cost_NC(info);
		else if (nc == columnProcDtl_std_wk_cost_upri) doProcDtl_std_wk_cost_upri_NC(info);
		else if (nc == columnProcDtl_not_cost_flg) doProcDtl_not_cost_flg_NC(info);
		else if (nc == columnProcDtl_sub_upri1) doProcDtl_sub_upri1_NC(info);
		else if (nc == columnProcDtl_sub_upri2) doProcDtl_sub_upri2_NC(info);
		else if (nc == columnProcDtl_sub_upri3) doProcDtl_sub_upri3_NC(info);
		else if (nc == columnProcDtl_memo1) doProcDtl_memo1_NC(info);
		else if (nc == columnProcDtl_memo2) doProcDtl_memo2_NC(info);
		else if (nc == columnProcDtl_memo3) doProcDtl_memo3_NC(info);
		else if (nc == columnProcDtl_ins_usr_id) doProcDtl_ins_usr_id_NC(info);
		else if (nc == columnProcDtl_ins_usr_nm) doProcDtl_ins_usr_nm_NC(info);
		else if (nc == columnProcDtl_ins_ts) doProcDtl_ins_ts_NC(info);
		else if (nc == columnProcDtl_ins_func_id) doProcDtl_ins_func_id_NC(info);
		else if (nc == columnProcDtl_ins_func_nm) doProcDtl_ins_func_nm_NC(info);
		else if (nc == columnProcDtl_upd_usr_id) doProcDtl_upd_usr_id_NC(info);
		else if (nc == columnProcDtl_upd_usr_nm) doProcDtl_upd_usr_nm_NC(info);
		else if (nc == columnProcDtl_upd_ts) doProcDtl_upd_ts_NC(info);
		else if (nc == columnProcDtl_upd_func_id) doProcDtl_upd_func_id_NC(info);
		else if (nc == columnProcDtl_upd_func_nm) doProcDtl_upd_func_nm_NC(info);
		else if (nc == columnProcDtl_upd_srv_req_no) doProcDtl_upd_srv_req_no_NC(info);
		else if (nc == columnChdItmDtl_peg_no) doChdItmDtl_peg_no_NC(info);
		else if (nc == columnChdItmDtl_wg_cd) doChdItmDtl_wg_cd_NC(info);
		else if (nc == columnChdItmDtl_wg_nm) doChdItmDtl_wg_nm_NC(info);
		else if (nc == columnChdItmDtl_prsppl_cd) doChdItmDtl_prsppl_cd_NC(info);
		else if (nc == columnChdItmDtl_prsppl_nm) doChdItmDtl_prsppl_nm_NC(info);
		else if (nc == columnChdItmDtl_onr_prsppl_flg) doChdItmDtl_onr_prsppl_flg_NC(info);
		else if (nc == columnChdItmDtl_cur_cd) doChdItmDtl_cur_cd_NC(info);
		else if (nc == columnChdItmDtl_cur_nm) doChdItmDtl_cur_nm_NC(info);
		else if (nc == columnChdItmDtl_st_dt) doChdItmDtl_st_dt_NC(info);
		else if (nc == columnChdItmDtl_end_dt) doChdItmDtl_end_dt_NC(info);
		else if (nc == columnChdItmDtl_prov_typ) doChdItmDtl_prov_typ_NC(info);
		else if (nc == columnChdItmDtl_prov_typ_nm) doChdItmDtl_prov_typ_nm_NC(info);
		else if (nc == columnChdItmDtl_upri) doChdItmDtl_upri_NC(info);
		else if (nc == columnChdItmDtl_conv_inpt_qty) doChdItmDtl_conv_inpt_qty_NC(info);
		else if (nc == columnChdItmDtl_conv_upri) doChdItmDtl_conv_upri_NC(info);
		else if (nc == columnChdItmDtl_upri_bf) doChdItmDtl_upri_bf_NC(info);
		else if (nc == columnChdItmDtl_sub_upri1) doChdItmDtl_sub_upri1_NC(info);
		else if (nc == columnChdItmDtl_sub_upri2) doChdItmDtl_sub_upri2_NC(info);
		else if (nc == columnChdItmDtl_sub_upri3) doChdItmDtl_sub_upri3_NC(info);
		else if (nc == columnChdItmDtl_memo1) doChdItmDtl_memo1_NC(info);
		else if (nc == columnChdItmDtl_memo2) doChdItmDtl_memo2_NC(info);
		else if (nc == columnChdItmDtl_memo3) doChdItmDtl_memo3_NC(info);
		else if (nc == columnChdItmDtl_ins_usr_id) doChdItmDtl_ins_usr_id_NC(info);
		else if (nc == columnChdItmDtl_ins_usr_nm) doChdItmDtl_ins_usr_nm_NC(info);
		else if (nc == columnChdItmDtl_ins_ts) doChdItmDtl_ins_ts_NC(info);
		else if (nc == columnChdItmDtl_ins_func_id) doChdItmDtl_ins_func_id_NC(info);
		else if (nc == columnChdItmDtl_ins_func_nm) doChdItmDtl_ins_func_nm_NC(info);
		else if (nc == columnChdItmDtl_upd_usr_id) doChdItmDtl_upd_usr_id_NC(info);
		else if (nc == columnChdItmDtl_upd_usr_nm) doChdItmDtl_upd_usr_nm_NC(info);
		else if (nc == columnChdItmDtl_upd_ts) doChdItmDtl_upd_ts_NC(info);
		else if (nc == columnChdItmDtl_upd_func_id) doChdItmDtl_upd_func_id_NC(info);
		else if (nc == columnChdItmDtl_upd_func_nm) doChdItmDtl_upd_func_nm_NC(info);
		else if (nc == columnChdItmDtl_upd_srv_req_no) doChdItmDtl_upd_srv_req_no_NC(info);
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
	 * [ProcDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ddlv_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ddlv_sls_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[lot_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_lot_qty_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_bf_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_upri_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_not_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri1_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri2_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri3_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[onr_prsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_onr_prsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_inpt_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_inpt_qty_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_upri_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_bf_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri1_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri2_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri3_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == ProcDtlTable) doProcDtl_NE(info);
		else if (ne == ChdItmDtlTable) doChdItmDtl_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_peg_no) doDtl_peg_no_NE(info);
		else if (ne == columnDtl_ddlv_sls_flg) doDtl_ddlv_sls_flg_NE(info);
		else if (ne == columnDtl_dt) doDtl_dt_NE(info);
		else if (ne == columnDtl_dpt_cd) doDtl_dpt_cd_NE(info);
		else if (ne == columnDtl_dpt_nm) doDtl_dpt_nm_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NE(info);
		else if (ne == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_cur_cd) doDtl_cur_cd_NE(info);
		else if (ne == columnDtl_cur_nm) doDtl_cur_nm_NE(info);
		else if (ne == columnDtl_unit_cd) doDtl_unit_cd_NE(info);
		else if (ne == columnDtl_unit_nm) doDtl_unit_nm_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_sno1) doDtl_sno1_NE(info);
		else if (ne == columnDtl_sno2) doDtl_sno2_NE(info);
		else if (ne == columnDtl_sno3) doDtl_sno3_NE(info);
		else if (ne == columnDtl_sno4) doDtl_sno4_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NE(info);
		else if (ne == columnDtl_upri) doDtl_upri_NE(info);
		else if (ne == columnDtl_interim_flg) doDtl_interim_flg_NE(info);
		else if (ne == columnDtl_proc_upri) doDtl_proc_upri_NE(info);
		else if (ne == columnDtl_onr_prov_upri) doDtl_onr_prov_upri_NE(info);
		else if (ne == columnDtl_slf_supprt_upri) doDtl_slf_supprt_upri_NE(info);
		else if (ne == columnDtl_amt) doDtl_amt_NE(info);
		else if (ne == columnDtl_proc_amt) doDtl_proc_amt_NE(info);
		else if (ne == columnDtl_onr_prov_amt) doDtl_onr_prov_amt_NE(info);
		else if (ne == columnDtl_slf_supprt_amt) doDtl_slf_supprt_amt_NE(info);
		else if (ne == columnDtl_err_flg) doDtl_err_flg_NE(info);
		else if (ne == columnProcDtl_peg_no) doProcDtl_peg_no_NE(info);
		else if (ne == columnProcDtl_wg_cd) doProcDtl_wg_cd_NE(info);
		else if (ne == columnProcDtl_wg_nm) doProcDtl_wg_nm_NE(info);
		else if (ne == columnProcDtl_sppl_cd) doProcDtl_sppl_cd_NE(info);
		else if (ne == columnProcDtl_sppl_nm) doProcDtl_sppl_nm_NE(info);
		else if (ne == columnProcDtl_maker_cd) doProcDtl_maker_cd_NE(info);
		else if (ne == columnProcDtl_maker_nm) doProcDtl_maker_nm_NE(info);
		else if (ne == columnProcDtl_unit_cd) doProcDtl_unit_cd_NE(info);
		else if (ne == columnProcDtl_unit_nm) doProcDtl_unit_nm_NE(info);
		else if (ne == columnProcDtl_lot_qty) doProcDtl_lot_qty_NE(info);
		else if (ne == columnProcDtl_cur_cd) doProcDtl_cur_cd_NE(info);
		else if (ne == columnProcDtl_cur_nm) doProcDtl_cur_nm_NE(info);
		else if (ne == columnProcDtl_loc_cd) doProcDtl_loc_cd_NE(info);
		else if (ne == columnProcDtl_loc_nm) doProcDtl_loc_nm_NE(info);
		else if (ne == columnProcDtl_dlv_cd) doProcDtl_dlv_cd_NE(info);
		else if (ne == columnProcDtl_dlv_nm) doProcDtl_dlv_nm_NE(info);
		else if (ne == columnProcDtl_st_dt) doProcDtl_st_dt_NE(info);
		else if (ne == columnProcDtl_end_dt) doProcDtl_end_dt_NE(info);
		else if (ne == columnProcDtl_upri) doProcDtl_upri_NE(info);
		else if (ne == columnProcDtl_upri_bf) doProcDtl_upri_bf_NE(info);
		else if (ne == columnProcDtl_interim_flg) doProcDtl_interim_flg_NE(info);
		else if (ne == columnProcDtl_std_wk_cost) doProcDtl_std_wk_cost_NE(info);
		else if (ne == columnProcDtl_std_wk_cost_upri) doProcDtl_std_wk_cost_upri_NE(info);
		else if (ne == columnProcDtl_not_cost_flg) doProcDtl_not_cost_flg_NE(info);
		else if (ne == columnProcDtl_sub_upri1) doProcDtl_sub_upri1_NE(info);
		else if (ne == columnProcDtl_sub_upri2) doProcDtl_sub_upri2_NE(info);
		else if (ne == columnProcDtl_sub_upri3) doProcDtl_sub_upri3_NE(info);
		else if (ne == columnProcDtl_memo1) doProcDtl_memo1_NE(info);
		else if (ne == columnProcDtl_memo2) doProcDtl_memo2_NE(info);
		else if (ne == columnProcDtl_memo3) doProcDtl_memo3_NE(info);
		else if (ne == columnProcDtl_ins_usr_id) doProcDtl_ins_usr_id_NE(info);
		else if (ne == columnProcDtl_ins_usr_nm) doProcDtl_ins_usr_nm_NE(info);
		else if (ne == columnProcDtl_ins_ts) doProcDtl_ins_ts_NE(info);
		else if (ne == columnProcDtl_ins_func_id) doProcDtl_ins_func_id_NE(info);
		else if (ne == columnProcDtl_ins_func_nm) doProcDtl_ins_func_nm_NE(info);
		else if (ne == columnProcDtl_upd_usr_id) doProcDtl_upd_usr_id_NE(info);
		else if (ne == columnProcDtl_upd_usr_nm) doProcDtl_upd_usr_nm_NE(info);
		else if (ne == columnProcDtl_upd_ts) doProcDtl_upd_ts_NE(info);
		else if (ne == columnProcDtl_upd_func_id) doProcDtl_upd_func_id_NE(info);
		else if (ne == columnProcDtl_upd_func_nm) doProcDtl_upd_func_nm_NE(info);
		else if (ne == columnProcDtl_upd_srv_req_no) doProcDtl_upd_srv_req_no_NE(info);
		else if (ne == columnChdItmDtl_peg_no) doChdItmDtl_peg_no_NE(info);
		else if (ne == columnChdItmDtl_wg_cd) doChdItmDtl_wg_cd_NE(info);
		else if (ne == columnChdItmDtl_wg_nm) doChdItmDtl_wg_nm_NE(info);
		else if (ne == columnChdItmDtl_prsppl_cd) doChdItmDtl_prsppl_cd_NE(info);
		else if (ne == columnChdItmDtl_prsppl_nm) doChdItmDtl_prsppl_nm_NE(info);
		else if (ne == columnChdItmDtl_onr_prsppl_flg) doChdItmDtl_onr_prsppl_flg_NE(info);
		else if (ne == columnChdItmDtl_cur_cd) doChdItmDtl_cur_cd_NE(info);
		else if (ne == columnChdItmDtl_cur_nm) doChdItmDtl_cur_nm_NE(info);
		else if (ne == columnChdItmDtl_st_dt) doChdItmDtl_st_dt_NE(info);
		else if (ne == columnChdItmDtl_end_dt) doChdItmDtl_end_dt_NE(info);
		else if (ne == columnChdItmDtl_prov_typ) doChdItmDtl_prov_typ_NE(info);
		else if (ne == columnChdItmDtl_prov_typ_nm) doChdItmDtl_prov_typ_nm_NE(info);
		else if (ne == columnChdItmDtl_upri) doChdItmDtl_upri_NE(info);
		else if (ne == columnChdItmDtl_conv_inpt_qty) doChdItmDtl_conv_inpt_qty_NE(info);
		else if (ne == columnChdItmDtl_conv_upri) doChdItmDtl_conv_upri_NE(info);
		else if (ne == columnChdItmDtl_upri_bf) doChdItmDtl_upri_bf_NE(info);
		else if (ne == columnChdItmDtl_sub_upri1) doChdItmDtl_sub_upri1_NE(info);
		else if (ne == columnChdItmDtl_sub_upri2) doChdItmDtl_sub_upri2_NE(info);
		else if (ne == columnChdItmDtl_sub_upri3) doChdItmDtl_sub_upri3_NE(info);
		else if (ne == columnChdItmDtl_memo1) doChdItmDtl_memo1_NE(info);
		else if (ne == columnChdItmDtl_memo2) doChdItmDtl_memo2_NE(info);
		else if (ne == columnChdItmDtl_memo3) doChdItmDtl_memo3_NE(info);
		else if (ne == columnChdItmDtl_ins_usr_id) doChdItmDtl_ins_usr_id_NE(info);
		else if (ne == columnChdItmDtl_ins_usr_nm) doChdItmDtl_ins_usr_nm_NE(info);
		else if (ne == columnChdItmDtl_ins_ts) doChdItmDtl_ins_ts_NE(info);
		else if (ne == columnChdItmDtl_ins_func_id) doChdItmDtl_ins_func_id_NE(info);
		else if (ne == columnChdItmDtl_ins_func_nm) doChdItmDtl_ins_func_nm_NE(info);
		else if (ne == columnChdItmDtl_upd_usr_id) doChdItmDtl_upd_usr_id_NE(info);
		else if (ne == columnChdItmDtl_upd_usr_nm) doChdItmDtl_upd_usr_nm_NE(info);
		else if (ne == columnChdItmDtl_upd_ts) doChdItmDtl_upd_ts_NE(info);
		else if (ne == columnChdItmDtl_upd_func_id) doChdItmDtl_upd_func_id_NE(info);
		else if (ne == columnChdItmDtl_upd_func_nm) doChdItmDtl_upd_func_nm_NE(info);
		else if (ne == columnChdItmDtl_upd_srv_req_no) doChdItmDtl_upd_srv_req_no_NE(info);
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
	 * [ProcDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ddlv_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ddlv_sls_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[lot_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_lot_qty_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_bf_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_upri_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_not_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri1_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri2_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri3_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[onr_prsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_onr_prsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_inpt_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_inpt_qty_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_upri_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_bf_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri1_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri2_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri3_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == ProcDtlTable) doProcDtl_NX(info);
		else if (nx == ChdItmDtlTable) doChdItmDtl_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_peg_no) doDtl_peg_no_NX(info);
		else if (nx == columnDtl_ddlv_sls_flg) doDtl_ddlv_sls_flg_NX(info);
		else if (nx == columnDtl_dt) doDtl_dt_NX(info);
		else if (nx == columnDtl_dpt_cd) doDtl_dpt_cd_NX(info);
		else if (nx == columnDtl_dpt_nm) doDtl_dpt_nm_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NX(info);
		else if (nx == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_cur_cd) doDtl_cur_cd_NX(info);
		else if (nx == columnDtl_cur_nm) doDtl_cur_nm_NX(info);
		else if (nx == columnDtl_unit_cd) doDtl_unit_cd_NX(info);
		else if (nx == columnDtl_unit_nm) doDtl_unit_nm_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_sno1) doDtl_sno1_NX(info);
		else if (nx == columnDtl_sno2) doDtl_sno2_NX(info);
		else if (nx == columnDtl_sno3) doDtl_sno3_NX(info);
		else if (nx == columnDtl_sno4) doDtl_sno4_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NX(info);
		else if (nx == columnDtl_upri) doDtl_upri_NX(info);
		else if (nx == columnDtl_interim_flg) doDtl_interim_flg_NX(info);
		else if (nx == columnDtl_proc_upri) doDtl_proc_upri_NX(info);
		else if (nx == columnDtl_onr_prov_upri) doDtl_onr_prov_upri_NX(info);
		else if (nx == columnDtl_slf_supprt_upri) doDtl_slf_supprt_upri_NX(info);
		else if (nx == columnDtl_amt) doDtl_amt_NX(info);
		else if (nx == columnDtl_proc_amt) doDtl_proc_amt_NX(info);
		else if (nx == columnDtl_onr_prov_amt) doDtl_onr_prov_amt_NX(info);
		else if (nx == columnDtl_slf_supprt_amt) doDtl_slf_supprt_amt_NX(info);
		else if (nx == columnDtl_err_flg) doDtl_err_flg_NX(info);
		else if (nx == columnProcDtl_peg_no) doProcDtl_peg_no_NX(info);
		else if (nx == columnProcDtl_wg_cd) doProcDtl_wg_cd_NX(info);
		else if (nx == columnProcDtl_wg_nm) doProcDtl_wg_nm_NX(info);
		else if (nx == columnProcDtl_sppl_cd) doProcDtl_sppl_cd_NX(info);
		else if (nx == columnProcDtl_sppl_nm) doProcDtl_sppl_nm_NX(info);
		else if (nx == columnProcDtl_maker_cd) doProcDtl_maker_cd_NX(info);
		else if (nx == columnProcDtl_maker_nm) doProcDtl_maker_nm_NX(info);
		else if (nx == columnProcDtl_unit_cd) doProcDtl_unit_cd_NX(info);
		else if (nx == columnProcDtl_unit_nm) doProcDtl_unit_nm_NX(info);
		else if (nx == columnProcDtl_lot_qty) doProcDtl_lot_qty_NX(info);
		else if (nx == columnProcDtl_cur_cd) doProcDtl_cur_cd_NX(info);
		else if (nx == columnProcDtl_cur_nm) doProcDtl_cur_nm_NX(info);
		else if (nx == columnProcDtl_loc_cd) doProcDtl_loc_cd_NX(info);
		else if (nx == columnProcDtl_loc_nm) doProcDtl_loc_nm_NX(info);
		else if (nx == columnProcDtl_dlv_cd) doProcDtl_dlv_cd_NX(info);
		else if (nx == columnProcDtl_dlv_nm) doProcDtl_dlv_nm_NX(info);
		else if (nx == columnProcDtl_st_dt) doProcDtl_st_dt_NX(info);
		else if (nx == columnProcDtl_end_dt) doProcDtl_end_dt_NX(info);
		else if (nx == columnProcDtl_upri) doProcDtl_upri_NX(info);
		else if (nx == columnProcDtl_upri_bf) doProcDtl_upri_bf_NX(info);
		else if (nx == columnProcDtl_interim_flg) doProcDtl_interim_flg_NX(info);
		else if (nx == columnProcDtl_std_wk_cost) doProcDtl_std_wk_cost_NX(info);
		else if (nx == columnProcDtl_std_wk_cost_upri) doProcDtl_std_wk_cost_upri_NX(info);
		else if (nx == columnProcDtl_not_cost_flg) doProcDtl_not_cost_flg_NX(info);
		else if (nx == columnProcDtl_sub_upri1) doProcDtl_sub_upri1_NX(info);
		else if (nx == columnProcDtl_sub_upri2) doProcDtl_sub_upri2_NX(info);
		else if (nx == columnProcDtl_sub_upri3) doProcDtl_sub_upri3_NX(info);
		else if (nx == columnProcDtl_memo1) doProcDtl_memo1_NX(info);
		else if (nx == columnProcDtl_memo2) doProcDtl_memo2_NX(info);
		else if (nx == columnProcDtl_memo3) doProcDtl_memo3_NX(info);
		else if (nx == columnProcDtl_ins_usr_id) doProcDtl_ins_usr_id_NX(info);
		else if (nx == columnProcDtl_ins_usr_nm) doProcDtl_ins_usr_nm_NX(info);
		else if (nx == columnProcDtl_ins_ts) doProcDtl_ins_ts_NX(info);
		else if (nx == columnProcDtl_ins_func_id) doProcDtl_ins_func_id_NX(info);
		else if (nx == columnProcDtl_ins_func_nm) doProcDtl_ins_func_nm_NX(info);
		else if (nx == columnProcDtl_upd_usr_id) doProcDtl_upd_usr_id_NX(info);
		else if (nx == columnProcDtl_upd_usr_nm) doProcDtl_upd_usr_nm_NX(info);
		else if (nx == columnProcDtl_upd_ts) doProcDtl_upd_ts_NX(info);
		else if (nx == columnProcDtl_upd_func_id) doProcDtl_upd_func_id_NX(info);
		else if (nx == columnProcDtl_upd_func_nm) doProcDtl_upd_func_nm_NX(info);
		else if (nx == columnProcDtl_upd_srv_req_no) doProcDtl_upd_srv_req_no_NX(info);
		else if (nx == columnChdItmDtl_peg_no) doChdItmDtl_peg_no_NX(info);
		else if (nx == columnChdItmDtl_wg_cd) doChdItmDtl_wg_cd_NX(info);
		else if (nx == columnChdItmDtl_wg_nm) doChdItmDtl_wg_nm_NX(info);
		else if (nx == columnChdItmDtl_prsppl_cd) doChdItmDtl_prsppl_cd_NX(info);
		else if (nx == columnChdItmDtl_prsppl_nm) doChdItmDtl_prsppl_nm_NX(info);
		else if (nx == columnChdItmDtl_onr_prsppl_flg) doChdItmDtl_onr_prsppl_flg_NX(info);
		else if (nx == columnChdItmDtl_cur_cd) doChdItmDtl_cur_cd_NX(info);
		else if (nx == columnChdItmDtl_cur_nm) doChdItmDtl_cur_nm_NX(info);
		else if (nx == columnChdItmDtl_st_dt) doChdItmDtl_st_dt_NX(info);
		else if (nx == columnChdItmDtl_end_dt) doChdItmDtl_end_dt_NX(info);
		else if (nx == columnChdItmDtl_prov_typ) doChdItmDtl_prov_typ_NX(info);
		else if (nx == columnChdItmDtl_prov_typ_nm) doChdItmDtl_prov_typ_nm_NX(info);
		else if (nx == columnChdItmDtl_upri) doChdItmDtl_upri_NX(info);
		else if (nx == columnChdItmDtl_conv_inpt_qty) doChdItmDtl_conv_inpt_qty_NX(info);
		else if (nx == columnChdItmDtl_conv_upri) doChdItmDtl_conv_upri_NX(info);
		else if (nx == columnChdItmDtl_upri_bf) doChdItmDtl_upri_bf_NX(info);
		else if (nx == columnChdItmDtl_sub_upri1) doChdItmDtl_sub_upri1_NX(info);
		else if (nx == columnChdItmDtl_sub_upri2) doChdItmDtl_sub_upri2_NX(info);
		else if (nx == columnChdItmDtl_sub_upri3) doChdItmDtl_sub_upri3_NX(info);
		else if (nx == columnChdItmDtl_memo1) doChdItmDtl_memo1_NX(info);
		else if (nx == columnChdItmDtl_memo2) doChdItmDtl_memo2_NX(info);
		else if (nx == columnChdItmDtl_memo3) doChdItmDtl_memo3_NX(info);
		else if (nx == columnChdItmDtl_ins_usr_id) doChdItmDtl_ins_usr_id_NX(info);
		else if (nx == columnChdItmDtl_ins_usr_nm) doChdItmDtl_ins_usr_nm_NX(info);
		else if (nx == columnChdItmDtl_ins_ts) doChdItmDtl_ins_ts_NX(info);
		else if (nx == columnChdItmDtl_ins_func_id) doChdItmDtl_ins_func_id_NX(info);
		else if (nx == columnChdItmDtl_ins_func_nm) doChdItmDtl_ins_func_nm_NX(info);
		else if (nx == columnChdItmDtl_upd_usr_id) doChdItmDtl_upd_usr_id_NX(info);
		else if (nx == columnChdItmDtl_upd_usr_nm) doChdItmDtl_upd_usr_nm_NX(info);
		else if (nx == columnChdItmDtl_upd_ts) doChdItmDtl_upd_ts_NX(info);
		else if (nx == columnChdItmDtl_upd_func_id) doChdItmDtl_upd_func_id_NX(info);
		else if (nx == columnChdItmDtl_upd_func_nm) doChdItmDtl_upd_func_nm_NX(info);
		else if (nx == columnChdItmDtl_upd_srv_req_no) doChdItmDtl_upd_srv_req_no_NX(info);
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
	 * [ProcDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ddlv_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ddlv_sls_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[lot_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_lot_qty_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_bf_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_upri_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_not_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri1_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri2_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri3_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[onr_prsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_onr_prsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_inpt_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_inpt_qty_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_upri_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_bf_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri1_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri2_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri3_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_LC(info);
		else if (lc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_cur_cd) doDtl_cur_cd_LC(info);
		else if (lc == columnDtl_cur_nm) doDtl_cur_nm_LC(info);
		else if (lc == columnDtl_unit_cd) doDtl_unit_cd_LC(info);
		else if (lc == columnDtl_unit_nm) doDtl_unit_nm_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_sno1) doDtl_sno1_LC(info);
		else if (lc == columnDtl_sno2) doDtl_sno2_LC(info);
		else if (lc == columnDtl_sno3) doDtl_sno3_LC(info);
		else if (lc == columnDtl_sno4) doDtl_sno4_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_LC(info);
		else if (lc == columnDtl_upri) doDtl_upri_LC(info);
		else if (lc == columnDtl_proc_upri) doDtl_proc_upri_LC(info);
		else if (lc == columnDtl_onr_prov_upri) doDtl_onr_prov_upri_LC(info);
		else if (lc == columnDtl_slf_supprt_upri) doDtl_slf_supprt_upri_LC(info);
		else if (lc == columnDtl_amt) doDtl_amt_LC(info);
		else if (lc == columnDtl_proc_amt) doDtl_proc_amt_LC(info);
		else if (lc == columnDtl_onr_prov_amt) doDtl_onr_prov_amt_LC(info);
		else if (lc == columnDtl_slf_supprt_amt) doDtl_slf_supprt_amt_LC(info);
		else if (lc == columnProcDtl_peg_no) doProcDtl_peg_no_LC(info);
		else if (lc == columnProcDtl_wg_cd) doProcDtl_wg_cd_LC(info);
		else if (lc == columnProcDtl_wg_nm) doProcDtl_wg_nm_LC(info);
		else if (lc == columnProcDtl_sppl_cd) doProcDtl_sppl_cd_LC(info);
		else if (lc == columnProcDtl_sppl_nm) doProcDtl_sppl_nm_LC(info);
		else if (lc == columnProcDtl_maker_cd) doProcDtl_maker_cd_LC(info);
		else if (lc == columnProcDtl_maker_nm) doProcDtl_maker_nm_LC(info);
		else if (lc == columnProcDtl_unit_cd) doProcDtl_unit_cd_LC(info);
		else if (lc == columnProcDtl_unit_nm) doProcDtl_unit_nm_LC(info);
		else if (lc == columnProcDtl_lot_qty) doProcDtl_lot_qty_LC(info);
		else if (lc == columnProcDtl_cur_cd) doProcDtl_cur_cd_LC(info);
		else if (lc == columnProcDtl_cur_nm) doProcDtl_cur_nm_LC(info);
		else if (lc == columnProcDtl_loc_cd) doProcDtl_loc_cd_LC(info);
		else if (lc == columnProcDtl_loc_nm) doProcDtl_loc_nm_LC(info);
		else if (lc == columnProcDtl_dlv_cd) doProcDtl_dlv_cd_LC(info);
		else if (lc == columnProcDtl_dlv_nm) doProcDtl_dlv_nm_LC(info);
		else if (lc == columnProcDtl_st_dt) doProcDtl_st_dt_LC(info);
		else if (lc == columnProcDtl_end_dt) doProcDtl_end_dt_LC(info);
		else if (lc == columnProcDtl_upri) doProcDtl_upri_LC(info);
		else if (lc == columnProcDtl_upri_bf) doProcDtl_upri_bf_LC(info);
		else if (lc == columnProcDtl_std_wk_cost) doProcDtl_std_wk_cost_LC(info);
		else if (lc == columnProcDtl_std_wk_cost_upri) doProcDtl_std_wk_cost_upri_LC(info);
		else if (lc == columnProcDtl_sub_upri1) doProcDtl_sub_upri1_LC(info);
		else if (lc == columnProcDtl_sub_upri2) doProcDtl_sub_upri2_LC(info);
		else if (lc == columnProcDtl_sub_upri3) doProcDtl_sub_upri3_LC(info);
		else if (lc == columnProcDtl_memo1) doProcDtl_memo1_LC(info);
		else if (lc == columnProcDtl_memo2) doProcDtl_memo2_LC(info);
		else if (lc == columnProcDtl_memo3) doProcDtl_memo3_LC(info);
		else if (lc == columnProcDtl_ins_usr_id) doProcDtl_ins_usr_id_LC(info);
		else if (lc == columnProcDtl_ins_usr_nm) doProcDtl_ins_usr_nm_LC(info);
		else if (lc == columnProcDtl_ins_ts) doProcDtl_ins_ts_LC(info);
		else if (lc == columnProcDtl_ins_func_id) doProcDtl_ins_func_id_LC(info);
		else if (lc == columnProcDtl_ins_func_nm) doProcDtl_ins_func_nm_LC(info);
		else if (lc == columnProcDtl_upd_usr_id) doProcDtl_upd_usr_id_LC(info);
		else if (lc == columnProcDtl_upd_usr_nm) doProcDtl_upd_usr_nm_LC(info);
		else if (lc == columnProcDtl_upd_ts) doProcDtl_upd_ts_LC(info);
		else if (lc == columnProcDtl_upd_func_id) doProcDtl_upd_func_id_LC(info);
		else if (lc == columnProcDtl_upd_func_nm) doProcDtl_upd_func_nm_LC(info);
		else if (lc == columnProcDtl_upd_srv_req_no) doProcDtl_upd_srv_req_no_LC(info);
		else if (lc == columnChdItmDtl_peg_no) doChdItmDtl_peg_no_LC(info);
		else if (lc == columnChdItmDtl_wg_cd) doChdItmDtl_wg_cd_LC(info);
		else if (lc == columnChdItmDtl_wg_nm) doChdItmDtl_wg_nm_LC(info);
		else if (lc == columnChdItmDtl_prsppl_cd) doChdItmDtl_prsppl_cd_LC(info);
		else if (lc == columnChdItmDtl_prsppl_nm) doChdItmDtl_prsppl_nm_LC(info);
		else if (lc == columnChdItmDtl_cur_cd) doChdItmDtl_cur_cd_LC(info);
		else if (lc == columnChdItmDtl_cur_nm) doChdItmDtl_cur_nm_LC(info);
		else if (lc == columnChdItmDtl_st_dt) doChdItmDtl_st_dt_LC(info);
		else if (lc == columnChdItmDtl_end_dt) doChdItmDtl_end_dt_LC(info);
		else if (lc == columnChdItmDtl_prov_typ) doChdItmDtl_prov_typ_LC(info);
		else if (lc == columnChdItmDtl_prov_typ_nm) doChdItmDtl_prov_typ_nm_LC(info);
		else if (lc == columnChdItmDtl_upri) doChdItmDtl_upri_LC(info);
		else if (lc == columnChdItmDtl_conv_inpt_qty) doChdItmDtl_conv_inpt_qty_LC(info);
		else if (lc == columnChdItmDtl_conv_upri) doChdItmDtl_conv_upri_LC(info);
		else if (lc == columnChdItmDtl_upri_bf) doChdItmDtl_upri_bf_LC(info);
		else if (lc == columnChdItmDtl_sub_upri1) doChdItmDtl_sub_upri1_LC(info);
		else if (lc == columnChdItmDtl_sub_upri2) doChdItmDtl_sub_upri2_LC(info);
		else if (lc == columnChdItmDtl_sub_upri3) doChdItmDtl_sub_upri3_LC(info);
		else if (lc == columnChdItmDtl_memo1) doChdItmDtl_memo1_LC(info);
		else if (lc == columnChdItmDtl_memo2) doChdItmDtl_memo2_LC(info);
		else if (lc == columnChdItmDtl_memo3) doChdItmDtl_memo3_LC(info);
		else if (lc == columnChdItmDtl_ins_usr_id) doChdItmDtl_ins_usr_id_LC(info);
		else if (lc == columnChdItmDtl_ins_usr_nm) doChdItmDtl_ins_usr_nm_LC(info);
		else if (lc == columnChdItmDtl_ins_ts) doChdItmDtl_ins_ts_LC(info);
		else if (lc == columnChdItmDtl_ins_func_id) doChdItmDtl_ins_func_id_LC(info);
		else if (lc == columnChdItmDtl_ins_func_nm) doChdItmDtl_ins_func_nm_LC(info);
		else if (lc == columnChdItmDtl_upd_usr_id) doChdItmDtl_upd_usr_id_LC(info);
		else if (lc == columnChdItmDtl_upd_usr_nm) doChdItmDtl_upd_usr_nm_LC(info);
		else if (lc == columnChdItmDtl_upd_ts) doChdItmDtl_upd_ts_LC(info);
		else if (lc == columnChdItmDtl_upd_func_id) doChdItmDtl_upd_func_id_LC(info);
		else if (lc == columnChdItmDtl_upd_func_nm) doChdItmDtl_upd_func_nm_LC(info);
		else if (lc == columnChdItmDtl_upd_srv_req_no) doChdItmDtl_upd_srv_req_no_LC(info);
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
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prov_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prov_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slf_supprt_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slf_supprt_amt_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[lot_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_lot_qty_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upri_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upri_bf_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[std_wk_cost_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_std_wk_cost_upri_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri1_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri2_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[sub_upri3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_sub_upri3_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProcDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProcDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_inpt_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_inpt_qty_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[conv_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_conv_upri_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upri_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upri_bf_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri1_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri2_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[sub_upri3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_sub_upri3_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdItmDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdItmDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_cd]の作成メソッド
	 */
	public MCList getDtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlProcUpri(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlProcUpriSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlProcUpriSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlProcUpriSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sppl_cd]の作成メソッド
	 */
	public MCList getDtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mfg_loc_cd]の作成メソッド
	 */
	public MCList getDtl_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bom_ptn]の作成メソッド
	 */
	public MCList getDtl_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_maker_cd]の作成メソッド
	 */
	public MCList getDtl_maker_cd(MCRow row, MCEventInfo info){
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

	/**
	 * コンボ／リストのリスト[columnDtl_outsrc_upri_typ]の作成メソッド
	 */
	public MCList getDtl_outsrc_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOutsrcUpriTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0930.Sprt01")) {
			return new MA_MABSL0930_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0930_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0930_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0930_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL0930_Sprt01Bridge() {
			p_MA_MABSL0930_Sprt01 = new MCParam(PDef.MA_MABSL0930_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0930_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0930.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0930.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0930.ProcDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0930.ChdItmDtlR.class));

			p_MA_MABSL0930_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0930_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0930_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0930_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0930_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0930.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0930.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0930.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0930.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0930.ProcDtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP0930.ProcDtlR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR> down2() {
			return (MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MA_MABSL0930_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0930.DtlR.class));
			p_MA_MABSL0930_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0930.ProcDtlR.class));
			p_MA_MABSL0930_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0930.ChdItmDtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0930_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0930.DtlR>)p_MA_MABSL0930_Sprt01.getContainerParam().getDownBlock(0));
			setProcDtlAllL((MCList<mcframe.clientMABS.MABSP0930.ProcDtlR>)p_MA_MABSL0930_Sprt01.getContainerParam().getDownBlock(1));
			setChdItmDtlAllL((MCList<mcframe.clientMABS.MABSP0930.ChdItmDtlR>)p_MA_MABSL0930_Sprt01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getDtlL().clear();
			getProcDtlAllL().clear();
			getChdItmDtlAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getProcDtlAllL());
			result.add(getChdItmDtlAllL());
			return result;
		}
	}
}