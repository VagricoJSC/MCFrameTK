package mcframe.clientMABG.MABGP0010;

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
import mcframe.clientMABG.MABGP0010.MABGP_CoParmReg_MC.MA_MABGL0010_Srch01Caller;
import mcframe.clientMABG.MABGP0010.MABGP_CoParmReg_MC.MA_MABGL0010_Upd01Caller;
import mcframe.clientMABG.MABGP0010.MABGP_CoParmReg_MC.MA_MABGL0010_Del01Caller;

/**
 * 画面"MABGP_CoParmReg"パネルクラスです。<p>
 *
 * 原価会社パラメータマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_CoParmReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABGP0010";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_co_cd_Label = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_co_cd = null;
	/**
	 * Company name 会社名.<p>
	 *
	 */
	public MCTextField Cnd_co_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Tab]ブロック関連のField定義
	public MCPanel TabPanel = null;
	public MCTabbedPane TabTab = null;
	// [Tab]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Common]ブロック関連のField定義
	public MCPanel CommonPanel = null;
	public MCTitledBorder CommonTitledBorder = null;
	// [Common]ブロックの項目のField定義
	// [IfDataImp]ブロック関連のField定義
	public MCPanel IfDataImpPanel = null;
	public MCTitledBorder IfDataImpTitledBorder = null;
	// [IfDataImp]ブロックの項目のField定義
	// [ActDataMake]ブロック関連のField定義
	public MCPanel ActDataMakePanel = null;
	public MCTitledBorder ActDataMakeTitledBorder = null;
	// [ActDataMake]ブロックの項目のField定義
	// [Base]ブロック関連のField定義
	public MCPanel BasePanel = null;
	// [Base]ブロックの項目のField定義
	public MCLabel Base_std_rnd_typ_Label = null;
	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_std_rnd_typ = null;
	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_std_rnd_typ_nm = null;
	public MCLabel Base_std_dec_place_Label = null;
	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Base_std_dec_place = null;
	public MCLabel Base_amt_rnd_typ_Label = null;
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_amt_rnd_typ = null;
	/**
	 * Rounding type name (Amount) 金額端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_amt_rnd_typ_nm = null;
	public MCLabel Base_amt_dec_place_Label = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Base_amt_dec_place = null;
	public MCLabel Base_ave_rnd_typ_Label = null;
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Base_ave_rnd_typ = null;
	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public MCTextField Base_ave_rnd_typ_nm = null;
	public MCLabel Base_ave_dec_place_Label = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Base_ave_dec_place = null;
	public MCLabel Base_adj_typ_Label = null;
	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public MCTextComboBox Base_adj_typ = null;
	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public MCTextField Base_adj_typ_nm = null;
	public MCLabel Base_mrgn_expns_cd_Label = null;
	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_mrgn_expns_cd = null;
	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public MCTextField Base_mrgn_expns_nm = null;
	public MCLabel Base_purc_expns_cd_Label = null;
	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_purc_expns_cd = null;
	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public MCTextField Base_purc_expns_nm = null;
	public MCLabel Base_out_expns_cd_Label = null;
	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_out_expns_cd = null;
	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public MCTextField Base_out_expns_nm = null;
	public MCLabel Base_inpt_expns_cd_Label = null;
	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_inpt_expns_cd = null;
	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public MCTextField Base_inpt_expns_nm = null;
	public MCLabel Base_ss_expns_cd_Label = null;
	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_ss_expns_cd = null;
	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public MCTextField Base_ss_expns_nm = null;
	public MCLabel Base_prov_expns_cd_Label = null;
	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_prov_expns_cd = null;
	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public MCTextField Base_prov_expns_nm = null;
	public MCLabel Base_pre_alc_max_lvl_Label = null;
	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public MCNumberField Base_pre_alc_max_lvl = null;
	public MCLabel Base_pre_alc_max_rec_Label = null;
	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public MCNumberField Base_pre_alc_max_rec = null;
	public MCLabel Base_diff_use_typ_Label = null;
	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_diff_use_typ = null;
	/**
	 * Variance use type name 差異使用区分名.<p>
	 *
	 */
	public MCTextField Base_diff_use_typ_nm = null;
	public MCLabel Base_lot_use_typ_Label = null;
	/**
	 * Lot No. use type for production/sales ロットＮＯ生販使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_lot_use_typ = null;
	/**
	 * Lot No. production/sales use type name ロットＮＯ生販使用区分名.<p>
	 *
	 */
	public MCTextField Base_lot_use_typ_nm = null;
	public MCLabel Base_sublot_use_typ_Label = null;
	/**
	 * Sublot No. use type for production/sales サブロットＮＯ生販使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_sublot_use_typ = null;
	/**
	 * Sublot No. production/sales use type name サブロットＮＯ生販使用区分名.<p>
	 *
	 */
	public MCTextField Base_sublot_use_typ_nm = null;
	public MCLabel Base_sno1_use_typ_Label = null;
	/**
	 * SEIBAN No. 1 production/sales use type 手配ＮＯ１生販使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_sno1_use_typ = null;
	/**
	 * SEIBAN No. 1 production/sales type name 手配ＮＯ１生販使用区分名.<p>
	 *
	 */
	public MCTextField Base_sno1_use_typ_nm = null;
	public MCLabel Base_sno2_use_typ_Label = null;
	/**
	 * SEIBAN No. 2 production/sales use type 手配ＮＯ２生販使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_sno2_use_typ = null;
	/**
	 * SEIBAN No. 2 production/sales use type name 手配ＮＯ２生販使用区分名.<p>
	 *
	 */
	public MCTextField Base_sno2_use_typ_nm = null;
	public MCLabel Base_sno3_use_typ_Label = null;
	/**
	 * SEIBAN No. 3 production/sales use type 手配ＮＯ３生販使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_sno3_use_typ = null;
	/**
	 * SEIBAN No. 3 production/sales use type name 手配ＮＯ３生販使用区分名.<p>
	 *
	 */
	public MCTextField Base_sno3_use_typ_nm = null;
	public MCLabel Base_sno4_use_typ_Label = null;
	/**
	 * SEIBAN No. 4 production/sales use type 手配ＮＯ４生販使用区分.<p>
	 *
	 */
	public MCTextComboBox Base_sno4_use_typ = null;
	/**
	 * SEIBAN No. 4 production/sales use type name 手配ＮＯ４生販使用区分名.<p>
	 *
	 */
	public MCTextField Base_sno4_use_typ_nm = null;
	public MCLabel Base_def_calc_ctg_cd_Label = null;
	/**
	 * Default calculation category デフォルト計算カテゴリ.<p>
	 *
	 */
	public MCTextComboBox Base_def_calc_ctg_cd = null;
	/**
	 * Default calculation category name デフォルト計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Base_def_calc_ctg_nm = null;
	public MCLabel Base_fix_dpt_cd_Label = null;
	/**
	 * Constant management dept. cd. 固定管理部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_fix_dpt_cd = null;
	/**
	 * Constant management dept. name 固定管理部門名.<p>
	 *
	 */
	public MCTextField Base_fix_dpt_nm = null;
	/**
	 * Use standard unit cost at transfer ratio setting 振替比率設定時に標準単価を使用する.<p>
	 *
	 */
	public MCCheckBox Base_trd_ratio_flg = null;
	/**
	 * Take in canceled slip 取り消した伝票を取り込む.<p>
	 *
	 */
	public MCCheckBox Base_stop_slip_flg = null;
	/**
	 * Do not import production data 生産データを取り込まない.<p>
	 *
	 */
	public MCCheckBox Base_non_prod_flg = null;
	/**
	 * Import operation cd. as operation result No. 工程ＣＤを工程実績ＮＯとして取り込む.<p>
	 *
	 */
	public MCCheckBox Base_oper_sum_flg = null;
	/**
	 * Do not import sales data 販売データを取り込まない.<p>
	 *
	 */
	public MCCheckBox Base_non_sls_flg = null;
	/**
	 * Import sales asset as production asset 販売資産を生産資産として取り込む.<p>
	 *
	 */
	public MCCheckBox Base_asst_flg = null;
	/**
	 * Include receiving point inventory 出荷先の在庫を考慮する.<p>
	 *
	 */
	public MCCheckBox Base_stk_bp_flg = null;
	/**
	 * Do not import purchase data of items in transit 未着品仕入データを取り込まない.<p>
	 *
	 */
	public MCCheckBox Base_non_transit_flg = null;
	/**
	 * Non-moving management 滞留管理.<p>
	 *
	 */
	public MCLabel Base_non_mov_lab = null;
	/**
	 * WG with non-moving ワーキンググループ滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_wg_non_mov_flg = null;
	/**
	 * Lot No.?with non-moving ロットＮＯ滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_lot_non_mov_flg = null;
	/**
	 * Sublot No.?with non-moving サブロットＮＯ滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_sublot_non_mov_flg = null;
	/**
	 * SEIBAN No. 1 with non-moving 手配ＮＯ１滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_sno1_non_mov_flg = null;
	/**
	 * SEIBAN No. 2 with non-moving 手配ＮＯ２滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_sno2_non_mov_flg = null;
	/**
	 * SEIBAN No. 3 with non-moving 手配ＮＯ３滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_sno3_non_mov_flg = null;
	/**
	 * SEIBAN No. 4 with non-moving 手配ＮＯ４滞留使用.<p>
	 *
	 */
	public MCCheckBox Base_sno4_non_mov_flg = null;
	public MCLabel Base_tmp_dpt_cd_Label = null;
	/**
	 * Transfer dept. cd. 振替用部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_tmp_dpt_cd = null;
	/**
	 * Transfer dept. name 振替用部門名.<p>
	 *
	 */
	public MCTextField Base_tmp_dpt_nm = null;
	public MCLabel Base_act_trd_calc_ctg_cd_Label = null;
	/**
	 * Result transfer calculation category cd. 実績振替計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Base_act_trd_calc_ctg_cd = null;
	/**
	 * Result transfer calculation category name 実績振替計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Base_act_trd_calc_ctg_nm = null;
	/**
	 * Check existence of master マスタの存在チェックを行う.<p>
	 *
	 */
	public MCCheckBox Base_chk_mst_flg = null;
	/**
	 * Do not consolidate the inventory count 棚卸を集約しない.<p>
	 *
	 */
	public MCCheckBox Base_stktk_sum_flg = null;
	/**
	 * Do not consolidate other accounting data 他勘定を集約しない.<p>
	 *
	 */
	public MCCheckBox Base_oth_ccn_sum_flg = null;
	public MCLabel Base_std_disp_digit_Label = null;
	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCNumberField Base_std_disp_digit = null;
	public MCLabel Base_amt_disp_digit_Label = null;
	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCNumberField Base_amt_disp_digit = null;
	public MCLabel Base_unit_disp_digit_Label = null;
	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCNumberField Base_unit_disp_digit = null;
	public MCLabel Base_rate_disp_digit_Label = null;
	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCNumberField Base_rate_disp_digit = null;
	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public MCCheckBox Base_excel_pln_flg = null;
	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public MCCheckBox Base_excel_act_flg = null;
	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public MCCheckBox Base_excel_alc_flg = null;
	public MCLabel Base_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Base_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Base_ins_usr_nm = null;
	public MCLabel Base_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Base_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Base_ins_func_nm = null;
	public MCLabel Base_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Base_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Base_upd_usr_nm = null;
	public MCLabel Base_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Base_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Base_upd_func_nm = null;
	public MCLabel Base_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Base_ins_ts = null;
	public MCLabel Base_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Base_upd_ts = null;
	public MCLabel Base_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Base_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Base_upd_cntr = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCCheckBox Base_check = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0010.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_cd = null;
	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_rnd_typ = null;
	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_rnd_typ_nm = null;
	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_dec_place = null;
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_rnd_typ = null;
	/**
	 * Rounding type name (Amount) 金額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_rnd_typ_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_dec_place = null;
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ave_rnd_typ = null;
	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ave_rnd_typ_nm = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ave_dec_place = null;
	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_adj_typ = null;
	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_adj_typ_nm = null;
	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrgn_expns_cd = null;
	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrgn_expns_nm = null;
	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_expns_cd = null;
	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_expns_nm = null;
	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_out_expns_cd = null;
	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_out_expns_nm = null;
	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_expns_cd = null;
	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_expns_nm = null;
	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ss_expns_cd = null;
	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ss_expns_nm = null;
	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_expns_cd = null;
	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_expns_nm = null;
	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_max_lvl = null;
	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_max_rec = null;
	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_diff_use_typ = null;
	/**
	 * Variance use type name 差異使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_diff_use_typ_nm = null;
	/**
	 * Lot No. use type for production/sales ロットＮＯ生販使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_use_typ = null;
	/**
	 * Lot No. production/sales use type name ロットＮＯ生販使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_use_typ_nm = null;
	/**
	 * Sublot No. use type for production/sales サブロットＮＯ生販使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_use_typ = null;
	/**
	 * Sublot No. production/sales use type name サブロットＮＯ生販使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_use_typ_nm = null;
	/**
	 * SEIBAN No. 1 production/sales use type 手配ＮＯ１生販使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_use_typ = null;
	/**
	 * SEIBAN No. 1 production/sales type name 手配ＮＯ１生販使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_use_typ_nm = null;
	/**
	 * SEIBAN No. 2 production/sales use type 手配ＮＯ２生販使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_use_typ = null;
	/**
	 * SEIBAN No. 2 production/sales use type name 手配ＮＯ２生販使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_use_typ_nm = null;
	/**
	 * SEIBAN No. 3 production/sales use type 手配ＮＯ３生販使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_use_typ = null;
	/**
	 * SEIBAN No. 3 production/sales use type name 手配ＮＯ３生販使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_use_typ_nm = null;
	/**
	 * SEIBAN No. 4 production/sales use type 手配ＮＯ４生販使用区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_use_typ = null;
	/**
	 * SEIBAN No. 4 production/sales use type name 手配ＮＯ４生販使用区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_use_typ_nm = null;
	/**
	 * Default calculation category デフォルト計算カテゴリ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_calc_ctg_cd = null;
	/**
	 * Default calculation category name デフォルト計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_calc_ctg_nm = null;
	/**
	 * Constant management dept. cd. 固定管理部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_dpt_cd = null;
	/**
	 * Constant management dept. name 固定管理部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_dpt_nm = null;
	/**
	 * Use standard unit cost at transfer ratio setting 振替比率設定時に標準単価を使用する.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ratio_flg = null;
	/**
	 * Take in canceled slip 取り消した伝票を取り込む.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stop_slip_flg = null;
	/**
	 * Do not import production data 生産データを取り込まない.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_prod_flg = null;
	/**
	 * Import operation cd. as operation result No. 工程ＣＤを工程実績ＮＯとして取り込む.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_sum_flg = null;
	/**
	 * Do not import sales data 販売データを取り込まない.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_sls_flg = null;
	/**
	 * Import sales asset as production asset 販売資産を生産資産として取り込む.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_flg = null;
	/**
	 * Include receiving point inventory 出荷先の在庫を考慮する.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_bp_flg = null;
	/**
	 * Do not import purchase data of items in transit 未着品仕入データを取り込まない.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_transit_flg = null;
	/**
	 * WG with non-moving ワーキンググループ滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_non_mov_flg = null;
	/**
	 * Lot No.?with non-moving ロットＮＯ滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_non_mov_flg = null;
	/**
	 * Sublot No.?with non-moving サブロットＮＯ滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_non_mov_flg = null;
	/**
	 * SEIBAN No. 1 with non-moving 手配ＮＯ１滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_non_mov_flg = null;
	/**
	 * SEIBAN No. 2 with non-moving 手配ＮＯ２滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_non_mov_flg = null;
	/**
	 * SEIBAN No. 3 with non-moving 手配ＮＯ３滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_non_mov_flg = null;
	/**
	 * SEIBAN No. 4 with non-moving 手配ＮＯ４滞留使用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_non_mov_flg = null;
	/**
	 * Transfer dept. cd. 振替用部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tmp_dpt_cd = null;
	/**
	 * Transfer dept. name 振替用部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tmp_dpt_nm = null;
	/**
	 * Result transfer calculation category cd. 実績振替計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_trd_calc_ctg_cd = null;
	/**
	 * Result transfer calculation category name 実績振替計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_trd_calc_ctg_nm = null;
	/**
	 * Check existence of master マスタの存在チェックを行う.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chk_mst_flg = null;
	/**
	 * Do not consolidate the inventory count 棚卸を集約しない.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stktk_sum_flg = null;
	/**
	 * Do not consolidate other accounting data 他勘定を集約しない.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oth_ccn_sum_flg = null;
	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_disp_digit = null;
	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_disp_digit = null;
	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_disp_digit = null;
	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rate_disp_digit = null;
	/**
	 * Input/output planning data in Excel 計画データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public MCColumnConfig columnDtl_excel_pln_flg = null;
	/**
	 * Input/output result data in Excel 実績データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public MCColumnConfig columnDtl_excel_act_flg = null;
	/**
	 * Input/output allocation data in Excel 配賦データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public MCColumnConfig columnDtl_excel_alc_flg = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	
	/** [MA_MABGL0010_Srch01]のCallerの作成 */
	protected MABGP_CoParmReg_MC.MA_MABGL0010_Srch01Caller createMA_MABGL0010_Srch01() {
		MABGP_CoParmReg_MC.MA_MABGL0010_Srch01Caller<MABGP_CoParmReg, MA_MABGL0010_Srch01Bridge>
		caller = ((MABGP_CoParmReg_MC)this).new MA_MABGL0010_Srch01Caller<MABGP_CoParmReg, MA_MABGL0010_Srch01Bridge>(
					(MABGP_CoParmReg)this, new MA_MABGL0010_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0010_Srch01]の呼び出し */
	protected void callMA_MABGL0010_Srch01() {
		MCCaller caller = createMA_MABGL0010_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0010_Upd01]のCallerの作成 */
	protected MABGP_CoParmReg_MC.MA_MABGL0010_Upd01Caller createMA_MABGL0010_Upd01() {
		MABGP_CoParmReg_MC.MA_MABGL0010_Upd01Caller<MABGP_CoParmReg, MA_MABGL0010_Upd01Bridge>
		caller = ((MABGP_CoParmReg_MC)this).new MA_MABGL0010_Upd01Caller<MABGP_CoParmReg, MA_MABGL0010_Upd01Bridge>(
					(MABGP_CoParmReg)this, new MA_MABGL0010_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0010_Upd01]の呼び出し */
	protected void callMA_MABGL0010_Upd01() {
		MCCaller caller = createMA_MABGL0010_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0010_Del01]のCallerの作成 */
	protected MABGP_CoParmReg_MC.MA_MABGL0010_Del01Caller createMA_MABGL0010_Del01() {
		MABGP_CoParmReg_MC.MA_MABGL0010_Del01Caller<MABGP_CoParmReg, MA_MABGL0010_Del01Bridge>
		caller = ((MABGP_CoParmReg_MC)this).new MA_MABGL0010_Del01Caller<MABGP_CoParmReg, MA_MABGL0010_Del01Bridge>(
					(MABGP_CoParmReg)this, new MA_MABGL0010_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0010_Del01]の呼び出し */
	protected void callMA_MABGL0010_Del01() {
		MCCaller caller = createMA_MABGL0010_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0010.CndR aCndR;
	/** [Base]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0010.BaseR aBaseR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0010.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0010.CndR createCndR() {
		return mcframe.clientMABG.MABGP0010.CndR.create();
	}

	/**
	 * 項目コピーによってaBaseRを設定します。
	 *
	 * aBaseRのインスタンスは変更されません。
	 *
	 * @param row BaseR
	 */
	public void setBaseR(mcframe.clientMABG.MABGP0010.BaseR row) {
		if (row != null) {
			MCRow.copyall(getBaseR(), row);
		}
	}

	/**
	 * [Base]ブロックのコンテナaBaseRを返します。
	 *
	 * @return BaseR
	 */
	public mcframe.clientMABG.MABGP0010.BaseR getBaseR() {
		return aBaseR;
	}

	/**
	 * aBaseRを作成します。
	 *
	 * @return BaseR
	 */
	public mcframe.clientMABG.MABGP0010.BaseR createBaseR() {
		return mcframe.clientMABG.MABGP0010.BaseR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0010.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0010.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0010.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0010.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0010.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0010.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getBaseR())) ret.add(getBaseR());
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
		if(aCnt == getBaseR()) return "Base";
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
		if(bId.equals("Base")) return getBaseR();
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
		ret.add(CndPanel);
		ret.add(TabPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(CommonPanel);
		ret.add(IfDataImpPanel);
		ret.add(ActDataMakePanel);
		ret.add(BasePanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_CoParmReg_MC_A() {
		aCndR = createCndR();
		aBaseR = createBaseR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_CoParmReg_MC_A(String name) {
		aCndR = createCndR();
		aBaseR = createBaseR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_CoParmReg_MC.jbCreateScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateCnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateTab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateTab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateTab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateTab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateTab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateCommon((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateIfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateBase((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateDtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateBtn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbCreateEastBtn((MABGP_CoParmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_CoParmReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_CoParmReg p) {
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MABGP_CoParmReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABGP_CoParmReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABGP_CoParmReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MABGP_CoParmReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MABGP_CoParmReg p) {
	}

	/**
	 * [Common]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCommon(MABGP_CoParmReg p) {
	}

	/**
	 * [IfDataImp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIfDataImp(MABGP_CoParmReg p) {
	}

	/**
	 * [ActDataMake]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateActDataMake(MABGP_CoParmReg p) {
	}

	/**
	 * [Base]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase(MABGP_CoParmReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_CoParmReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_CoParmReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_CoParmReg p) {
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

	
	/** [Base_std_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_std_rnd_typ_p = null;

	/**
	 * [Base_std_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_std_rnd_typ_ListPutter() {
		if (Base_std_rnd_typ_p == null) {
			Base_std_rnd_typ_p = createBase_std_rnd_typ_ListPutter(Base_std_rnd_typ, "std_rnd_typ", "std_rnd_typ_nm");

		}
		return Base_std_rnd_typ_p;
	}
	
	
	/** [Base_amt_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_amt_rnd_typ_p = null;

	/**
	 * [Base_amt_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_amt_rnd_typ_ListPutter() {
		if (Base_amt_rnd_typ_p == null) {
			Base_amt_rnd_typ_p = createBase_amt_rnd_typ_ListPutter(Base_amt_rnd_typ, "amt_rnd_typ", "amt_rnd_typ_nm");

		}
		return Base_amt_rnd_typ_p;
	}
	
	
	/** [Base_ave_rnd_typ_ListPutter]の定義 */
	private MCListPutter Base_ave_rnd_typ_p = null;

	/**
	 * [Base_ave_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_ave_rnd_typ_ListPutter() {
		if (Base_ave_rnd_typ_p == null) {
			Base_ave_rnd_typ_p = createBase_ave_rnd_typ_ListPutter(Base_ave_rnd_typ, "ave_rnd_typ", "ave_rnd_typ_nm");

		}
		return Base_ave_rnd_typ_p;
	}
	
	
	/** [Base_adj_typ_ListPutter]の定義 */
	private MCListPutter Base_adj_typ_p = null;

	/**
	 * [Base_adj_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_adj_typ_ListPutter() {
		if (Base_adj_typ_p == null) {
			Base_adj_typ_p = createBase_adj_typ_ListPutter(Base_adj_typ, "adj_typ", "adj_typ_nm");

		}
		return Base_adj_typ_p;
	}
	
	
	/** [Base_mrgn_expns_cd_ListPutter]の定義 */
	private MCListPutter Base_mrgn_expns_cd_p = null;

	/**
	 * [Base_mrgn_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_mrgn_expns_cd_ListPutter() {
		if (Base_mrgn_expns_cd_p == null) {
			Base_mrgn_expns_cd_p = createBase_mrgn_expns_cd_ListPutter(Base_mrgn_expns_cd, "mrgn_expns_cd", "mrgn_expns_nm");

		}
		return Base_mrgn_expns_cd_p;
	}
	
	
	/** [Base_purc_expns_cd_ListPutter]の定義 */
	private MCListPutter Base_purc_expns_cd_p = null;

	/**
	 * [Base_purc_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_purc_expns_cd_ListPutter() {
		if (Base_purc_expns_cd_p == null) {
			Base_purc_expns_cd_p = createBase_purc_expns_cd_ListPutter(Base_purc_expns_cd, "purc_expns_cd", "purc_expns_nm");

		}
		return Base_purc_expns_cd_p;
	}
	
	
	/** [Base_out_expns_cd_ListPutter]の定義 */
	private MCListPutter Base_out_expns_cd_p = null;

	/**
	 * [Base_out_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_out_expns_cd_ListPutter() {
		if (Base_out_expns_cd_p == null) {
			Base_out_expns_cd_p = createBase_out_expns_cd_ListPutter(Base_out_expns_cd, "out_expns_cd", "out_expns_nm");

		}
		return Base_out_expns_cd_p;
	}
	
	
	/** [Base_inpt_expns_cd_ListPutter]の定義 */
	private MCListPutter Base_inpt_expns_cd_p = null;

	/**
	 * [Base_inpt_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_inpt_expns_cd_ListPutter() {
		if (Base_inpt_expns_cd_p == null) {
			Base_inpt_expns_cd_p = createBase_inpt_expns_cd_ListPutter(Base_inpt_expns_cd, "inpt_expns_cd", "inpt_expns_nm");

		}
		return Base_inpt_expns_cd_p;
	}
	
	
	/** [Base_ss_expns_cd_ListPutter]の定義 */
	private MCListPutter Base_ss_expns_cd_p = null;

	/**
	 * [Base_ss_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_ss_expns_cd_ListPutter() {
		if (Base_ss_expns_cd_p == null) {
			Base_ss_expns_cd_p = createBase_ss_expns_cd_ListPutter(Base_ss_expns_cd, "ss_expns_cd", "ss_expns_nm");

		}
		return Base_ss_expns_cd_p;
	}
	
	
	/** [Base_prov_expns_cd_ListPutter]の定義 */
	private MCListPutter Base_prov_expns_cd_p = null;

	/**
	 * [Base_prov_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_prov_expns_cd_ListPutter() {
		if (Base_prov_expns_cd_p == null) {
			Base_prov_expns_cd_p = createBase_prov_expns_cd_ListPutter(Base_prov_expns_cd, "prov_expns_cd", "prov_expns_nm");

		}
		return Base_prov_expns_cd_p;
	}
	
	
	/** [Base_diff_use_typ_ListPutter]の定義 */
	private MCListPutter Base_diff_use_typ_p = null;

	/**
	 * [Base_diff_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_diff_use_typ_ListPutter() {
		if (Base_diff_use_typ_p == null) {
			Base_diff_use_typ_p = createBase_diff_use_typ_ListPutter(Base_diff_use_typ, "diff_use_typ", "diff_use_typ_nm");

		}
		return Base_diff_use_typ_p;
	}
	
	
	/** [Base_lot_use_typ_ListPutter]の定義 */
	private MCListPutter Base_lot_use_typ_p = null;

	/**
	 * [Base_lot_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_lot_use_typ_ListPutter() {
		if (Base_lot_use_typ_p == null) {
			Base_lot_use_typ_p = createBase_lot_use_typ_ListPutter(Base_lot_use_typ, "lot_use_typ", "lot_use_typ_nm");

		}
		return Base_lot_use_typ_p;
	}
	
	
	/** [Base_sublot_use_typ_ListPutter]の定義 */
	private MCListPutter Base_sublot_use_typ_p = null;

	/**
	 * [Base_sublot_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sublot_use_typ_ListPutter() {
		if (Base_sublot_use_typ_p == null) {
			Base_sublot_use_typ_p = createBase_sublot_use_typ_ListPutter(Base_sublot_use_typ, "sublot_use_typ", "sublot_use_typ_nm");

		}
		return Base_sublot_use_typ_p;
	}
	
	
	/** [Base_sno1_use_typ_ListPutter]の定義 */
	private MCListPutter Base_sno1_use_typ_p = null;

	/**
	 * [Base_sno1_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sno1_use_typ_ListPutter() {
		if (Base_sno1_use_typ_p == null) {
			Base_sno1_use_typ_p = createBase_sno1_use_typ_ListPutter(Base_sno1_use_typ, "sno1_use_typ", "sno1_use_typ_nm");

		}
		return Base_sno1_use_typ_p;
	}
	
	
	/** [Base_sno2_use_typ_ListPutter]の定義 */
	private MCListPutter Base_sno2_use_typ_p = null;

	/**
	 * [Base_sno2_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sno2_use_typ_ListPutter() {
		if (Base_sno2_use_typ_p == null) {
			Base_sno2_use_typ_p = createBase_sno2_use_typ_ListPutter(Base_sno2_use_typ, "sno2_use_typ", "sno2_use_typ_nm");

		}
		return Base_sno2_use_typ_p;
	}
	
	
	/** [Base_sno3_use_typ_ListPutter]の定義 */
	private MCListPutter Base_sno3_use_typ_p = null;

	/**
	 * [Base_sno3_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sno3_use_typ_ListPutter() {
		if (Base_sno3_use_typ_p == null) {
			Base_sno3_use_typ_p = createBase_sno3_use_typ_ListPutter(Base_sno3_use_typ, "sno3_use_typ", "sno3_use_typ_nm");

		}
		return Base_sno3_use_typ_p;
	}
	
	
	/** [Base_sno4_use_typ_ListPutter]の定義 */
	private MCListPutter Base_sno4_use_typ_p = null;

	/**
	 * [Base_sno4_use_typ_ListPutter]の取得
	 */
	protected MCListPutter getBase_sno4_use_typ_ListPutter() {
		if (Base_sno4_use_typ_p == null) {
			Base_sno4_use_typ_p = createBase_sno4_use_typ_ListPutter(Base_sno4_use_typ, "sno4_use_typ", "sno4_use_typ_nm");

		}
		return Base_sno4_use_typ_p;
	}
	
	
	/** [Base_def_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Base_def_calc_ctg_cd_p = null;

	/**
	 * [Base_def_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_def_calc_ctg_cd_ListPutter() {
		if (Base_def_calc_ctg_cd_p == null) {
			Base_def_calc_ctg_cd_p = createBase_def_calc_ctg_cd_ListPutter(Base_def_calc_ctg_cd, "def_calc_ctg_cd", "def_calc_ctg_nm");

		}
		return Base_def_calc_ctg_cd_p;
	}
	
	
	/** [Base_fix_dpt_cd_ListPutter]の定義 */
	private MCListPutter Base_fix_dpt_cd_p = null;

	/**
	 * [Base_fix_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_fix_dpt_cd_ListPutter() {
		if (Base_fix_dpt_cd_p == null) {
			Base_fix_dpt_cd_p = createBase_fix_dpt_cd_ListPutter(Base_fix_dpt_cd, "fix_dpt_cd", "fix_dpt_nm");

		}
		return Base_fix_dpt_cd_p;
	}
	
	
	/** [Base_tmp_dpt_cd_ListPutter]の定義 */
	private MCListPutter Base_tmp_dpt_cd_p = null;

	/**
	 * [Base_tmp_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_tmp_dpt_cd_ListPutter() {
		if (Base_tmp_dpt_cd_p == null) {
			Base_tmp_dpt_cd_p = createBase_tmp_dpt_cd_ListPutter(Base_tmp_dpt_cd, "tmp_dpt_cd", "tmp_dpt_nm");

		}
		return Base_tmp_dpt_cd_p;
	}
	
	
	/** [Base_act_trd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Base_act_trd_calc_ctg_cd_p = null;

	/**
	 * [Base_act_trd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getBase_act_trd_calc_ctg_cd_ListPutter() {
		if (Base_act_trd_calc_ctg_cd_p == null) {
			Base_act_trd_calc_ctg_cd_p = createBase_act_trd_calc_ctg_cd_ListPutter(Base_act_trd_calc_ctg_cd, "act_trd_calc_ctg_cd", "act_trd_calc_ctg_nm");

		}
		return Base_act_trd_calc_ctg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_CoParmReg create(){
		MABGP_CoParmReg p = new MABGP_CoParmReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_CoParmReg create(String name){
		MABGP_CoParmReg p = new MABGP_CoParmReg(name);
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
		MABGP_CoParmReg_MC.jbfInitScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitCnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitTab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitTab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitTab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitTab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitTab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitCommon((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitIfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitBase((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitDtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitBtn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbfInitEastBtn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitCnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitTab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitTab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitTab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitTab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitTab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitCommon((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitIfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitBase((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitDtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitBtn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.jbInitEastBtn((MABGP_CoParmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_co_cd_Label = p.beansFactory.createLabel("Cnd.co_cd_Label");
		p.Cnd_co_cd = p.beansFactory.createTextField("Cnd.co_cd");
		p.Cnd_co_cd.setLabel(p.Cnd_co_cd_Label);
		p.Cnd_co_nm = p.beansFactory.createTextField("Cnd.co_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		p.TabTab = p.beansFactory.createTabbedPane("Tab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Common]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCommon(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.CommonPanel = p.beansFactory.createPanel("Common");
		p.CommonTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [IfDataImp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIfDataImp(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.IfDataImpPanel = p.beansFactory.createPanel("IfDataImp");
		p.IfDataImpTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ActDataMake]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitActDataMake(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.ActDataMakePanel = p.beansFactory.createPanel("ActDataMake");
		p.ActDataMakeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.BasePanel = p.beansFactory.createPanel("Base");
		// ブロックの項目の初期化
		p.Base_std_rnd_typ_Label = p.beansFactory.createLabel("Base.std_rnd_typ_Label");
		p.Base_std_rnd_typ = p.beansFactory.createTextComboBox("Base.std_rnd_typ");
		p.Base_std_rnd_typ.setLabel(p.Base_std_rnd_typ_Label);
		p.Base_std_rnd_typ_nm = p.beansFactory.createTextField("Base.std_rnd_typ_nm");
		p.Base_std_dec_place_Label = p.beansFactory.createLabel("Base.std_dec_place_Label");
		p.Base_std_dec_place = p.beansFactory.createNumberField("Base.std_dec_place");
		p.Base_std_dec_place.setLabel(p.Base_std_dec_place_Label);
		p.Base_amt_rnd_typ_Label = p.beansFactory.createLabel("Base.amt_rnd_typ_Label");
		p.Base_amt_rnd_typ = p.beansFactory.createTextComboBox("Base.amt_rnd_typ");
		p.Base_amt_rnd_typ.setLabel(p.Base_amt_rnd_typ_Label);
		p.Base_amt_rnd_typ_nm = p.beansFactory.createTextField("Base.amt_rnd_typ_nm");
		p.Base_amt_dec_place_Label = p.beansFactory.createLabel("Base.amt_dec_place_Label");
		p.Base_amt_dec_place = p.beansFactory.createNumberField("Base.amt_dec_place");
		p.Base_amt_dec_place.setLabel(p.Base_amt_dec_place_Label);
		p.Base_ave_rnd_typ_Label = p.beansFactory.createLabel("Base.ave_rnd_typ_Label");
		p.Base_ave_rnd_typ = p.beansFactory.createTextComboBox("Base.ave_rnd_typ");
		p.Base_ave_rnd_typ.setLabel(p.Base_ave_rnd_typ_Label);
		p.Base_ave_rnd_typ_nm = p.beansFactory.createTextField("Base.ave_rnd_typ_nm");
		p.Base_ave_dec_place_Label = p.beansFactory.createLabel("Base.ave_dec_place_Label");
		p.Base_ave_dec_place = p.beansFactory.createNumberField("Base.ave_dec_place");
		p.Base_ave_dec_place.setLabel(p.Base_ave_dec_place_Label);
		p.Base_adj_typ_Label = p.beansFactory.createLabel("Base.adj_typ_Label");
		p.Base_adj_typ = p.beansFactory.createTextComboBox("Base.adj_typ");
		p.Base_adj_typ.setLabel(p.Base_adj_typ_Label);
		p.Base_adj_typ_nm = p.beansFactory.createTextField("Base.adj_typ_nm");
		p.Base_mrgn_expns_cd_Label = p.beansFactory.createLabel("Base.mrgn_expns_cd_Label");
		p.Base_mrgn_expns_cd = p.beansFactory.createTextComboBox("Base.mrgn_expns_cd");
		p.Base_mrgn_expns_cd.setLabel(p.Base_mrgn_expns_cd_Label);
		p.Base_mrgn_expns_nm = p.beansFactory.createTextField("Base.mrgn_expns_nm");
		p.Base_purc_expns_cd_Label = p.beansFactory.createLabel("Base.purc_expns_cd_Label");
		p.Base_purc_expns_cd = p.beansFactory.createTextComboBox("Base.purc_expns_cd");
		p.Base_purc_expns_cd.setLabel(p.Base_purc_expns_cd_Label);
		p.Base_purc_expns_nm = p.beansFactory.createTextField("Base.purc_expns_nm");
		p.Base_out_expns_cd_Label = p.beansFactory.createLabel("Base.out_expns_cd_Label");
		p.Base_out_expns_cd = p.beansFactory.createTextComboBox("Base.out_expns_cd");
		p.Base_out_expns_cd.setLabel(p.Base_out_expns_cd_Label);
		p.Base_out_expns_nm = p.beansFactory.createTextField("Base.out_expns_nm");
		p.Base_inpt_expns_cd_Label = p.beansFactory.createLabel("Base.inpt_expns_cd_Label");
		p.Base_inpt_expns_cd = p.beansFactory.createTextComboBox("Base.inpt_expns_cd");
		p.Base_inpt_expns_cd.setLabel(p.Base_inpt_expns_cd_Label);
		p.Base_inpt_expns_nm = p.beansFactory.createTextField("Base.inpt_expns_nm");
		p.Base_ss_expns_cd_Label = p.beansFactory.createLabel("Base.ss_expns_cd_Label");
		p.Base_ss_expns_cd = p.beansFactory.createTextComboBox("Base.ss_expns_cd");
		p.Base_ss_expns_cd.setLabel(p.Base_ss_expns_cd_Label);
		p.Base_ss_expns_nm = p.beansFactory.createTextField("Base.ss_expns_nm");
		p.Base_prov_expns_cd_Label = p.beansFactory.createLabel("Base.prov_expns_cd_Label");
		p.Base_prov_expns_cd = p.beansFactory.createTextComboBox("Base.prov_expns_cd");
		p.Base_prov_expns_cd.setLabel(p.Base_prov_expns_cd_Label);
		p.Base_prov_expns_nm = p.beansFactory.createTextField("Base.prov_expns_nm");
		p.Base_pre_alc_max_lvl_Label = p.beansFactory.createLabel("Base.pre_alc_max_lvl_Label");
		p.Base_pre_alc_max_lvl = p.beansFactory.createNumberField("Base.pre_alc_max_lvl");
		p.Base_pre_alc_max_lvl.setLabel(p.Base_pre_alc_max_lvl_Label);
		p.Base_pre_alc_max_rec_Label = p.beansFactory.createLabel("Base.pre_alc_max_rec_Label");
		p.Base_pre_alc_max_rec = p.beansFactory.createNumberField("Base.pre_alc_max_rec");
		p.Base_pre_alc_max_rec.setLabel(p.Base_pre_alc_max_rec_Label);
		p.Base_diff_use_typ_Label = p.beansFactory.createLabel("Base.diff_use_typ_Label");
		p.Base_diff_use_typ = p.beansFactory.createTextComboBox("Base.diff_use_typ");
		p.Base_diff_use_typ.setLabel(p.Base_diff_use_typ_Label);
		p.Base_diff_use_typ_nm = p.beansFactory.createTextField("Base.diff_use_typ_nm");
		p.Base_lot_use_typ_Label = p.beansFactory.createLabel("Base.lot_use_typ_Label");
		p.Base_lot_use_typ = p.beansFactory.createTextComboBox("Base.lot_use_typ");
		p.Base_lot_use_typ.setLabel(p.Base_lot_use_typ_Label);
		p.Base_lot_use_typ_nm = p.beansFactory.createTextField("Base.lot_use_typ_nm");
		p.Base_sublot_use_typ_Label = p.beansFactory.createLabel("Base.sublot_use_typ_Label");
		p.Base_sublot_use_typ = p.beansFactory.createTextComboBox("Base.sublot_use_typ");
		p.Base_sublot_use_typ.setLabel(p.Base_sublot_use_typ_Label);
		p.Base_sublot_use_typ_nm = p.beansFactory.createTextField("Base.sublot_use_typ_nm");
		p.Base_sno1_use_typ_Label = p.beansFactory.createLabel("Base.sno1_use_typ_Label");
		p.Base_sno1_use_typ = p.beansFactory.createTextComboBox("Base.sno1_use_typ");
		p.Base_sno1_use_typ.setLabel(p.Base_sno1_use_typ_Label);
		p.Base_sno1_use_typ_nm = p.beansFactory.createTextField("Base.sno1_use_typ_nm");
		p.Base_sno2_use_typ_Label = p.beansFactory.createLabel("Base.sno2_use_typ_Label");
		p.Base_sno2_use_typ = p.beansFactory.createTextComboBox("Base.sno2_use_typ");
		p.Base_sno2_use_typ.setLabel(p.Base_sno2_use_typ_Label);
		p.Base_sno2_use_typ_nm = p.beansFactory.createTextField("Base.sno2_use_typ_nm");
		p.Base_sno3_use_typ_Label = p.beansFactory.createLabel("Base.sno3_use_typ_Label");
		p.Base_sno3_use_typ = p.beansFactory.createTextComboBox("Base.sno3_use_typ");
		p.Base_sno3_use_typ.setLabel(p.Base_sno3_use_typ_Label);
		p.Base_sno3_use_typ_nm = p.beansFactory.createTextField("Base.sno3_use_typ_nm");
		p.Base_sno4_use_typ_Label = p.beansFactory.createLabel("Base.sno4_use_typ_Label");
		p.Base_sno4_use_typ = p.beansFactory.createTextComboBox("Base.sno4_use_typ");
		p.Base_sno4_use_typ.setLabel(p.Base_sno4_use_typ_Label);
		p.Base_sno4_use_typ_nm = p.beansFactory.createTextField("Base.sno4_use_typ_nm");
		p.Base_def_calc_ctg_cd_Label = p.beansFactory.createLabel("Base.def_calc_ctg_cd_Label");
		p.Base_def_calc_ctg_cd = p.beansFactory.createTextComboBox("Base.def_calc_ctg_cd");
		p.Base_def_calc_ctg_cd.setLabel(p.Base_def_calc_ctg_cd_Label);
		p.Base_def_calc_ctg_nm = p.beansFactory.createTextField("Base.def_calc_ctg_nm");
		p.Base_fix_dpt_cd_Label = p.beansFactory.createLabel("Base.fix_dpt_cd_Label");
		p.Base_fix_dpt_cd = p.beansFactory.createTextComboBox("Base.fix_dpt_cd");
		p.Base_fix_dpt_cd.setLabel(p.Base_fix_dpt_cd_Label);
		p.Base_fix_dpt_nm = p.beansFactory.createTextField("Base.fix_dpt_nm");
		p.Base_trd_ratio_flg = p.beansFactory.createCheckBox("Base.trd_ratio_flg");
		p.Base_stop_slip_flg = p.beansFactory.createCheckBox("Base.stop_slip_flg");
		p.Base_non_prod_flg = p.beansFactory.createCheckBox("Base.non_prod_flg");
		p.Base_oper_sum_flg = p.beansFactory.createCheckBox("Base.oper_sum_flg");
		p.Base_non_sls_flg = p.beansFactory.createCheckBox("Base.non_sls_flg");
		p.Base_asst_flg = p.beansFactory.createCheckBox("Base.asst_flg");
		p.Base_stk_bp_flg = p.beansFactory.createCheckBox("Base.stk_bp_flg");
		p.Base_non_transit_flg = p.beansFactory.createCheckBox("Base.non_transit_flg");
		p.Base_non_mov_lab = p.beansFactory.createLabel("Base.non_mov_lab");
		p.Base_wg_non_mov_flg = p.beansFactory.createCheckBox("Base.wg_non_mov_flg");
		p.Base_lot_non_mov_flg = p.beansFactory.createCheckBox("Base.lot_non_mov_flg");
		p.Base_sublot_non_mov_flg = p.beansFactory.createCheckBox("Base.sublot_non_mov_flg");
		p.Base_sno1_non_mov_flg = p.beansFactory.createCheckBox("Base.sno1_non_mov_flg");
		p.Base_sno2_non_mov_flg = p.beansFactory.createCheckBox("Base.sno2_non_mov_flg");
		p.Base_sno3_non_mov_flg = p.beansFactory.createCheckBox("Base.sno3_non_mov_flg");
		p.Base_sno4_non_mov_flg = p.beansFactory.createCheckBox("Base.sno4_non_mov_flg");
		p.Base_tmp_dpt_cd_Label = p.beansFactory.createLabel("Base.tmp_dpt_cd_Label");
		p.Base_tmp_dpt_cd = p.beansFactory.createTextComboBox("Base.tmp_dpt_cd");
		p.Base_tmp_dpt_cd.setLabel(p.Base_tmp_dpt_cd_Label);
		p.Base_tmp_dpt_nm = p.beansFactory.createTextField("Base.tmp_dpt_nm");
		p.Base_act_trd_calc_ctg_cd_Label = p.beansFactory.createLabel("Base.act_trd_calc_ctg_cd_Label");
		p.Base_act_trd_calc_ctg_cd = p.beansFactory.createTextComboBox("Base.act_trd_calc_ctg_cd");
		p.Base_act_trd_calc_ctg_cd.setLabel(p.Base_act_trd_calc_ctg_cd_Label);
		p.Base_act_trd_calc_ctg_nm = p.beansFactory.createTextField("Base.act_trd_calc_ctg_nm");
		p.Base_chk_mst_flg = p.beansFactory.createCheckBox("Base.chk_mst_flg");
		p.Base_stktk_sum_flg = p.beansFactory.createCheckBox("Base.stktk_sum_flg");
		p.Base_oth_ccn_sum_flg = p.beansFactory.createCheckBox("Base.oth_ccn_sum_flg");
		p.Base_std_disp_digit_Label = p.beansFactory.createLabel("Base.std_disp_digit_Label");
		p.Base_std_disp_digit = p.beansFactory.createNumberField("Base.std_disp_digit");
		p.Base_std_disp_digit.setLabel(p.Base_std_disp_digit_Label);
		p.Base_amt_disp_digit_Label = p.beansFactory.createLabel("Base.amt_disp_digit_Label");
		p.Base_amt_disp_digit = p.beansFactory.createNumberField("Base.amt_disp_digit");
		p.Base_amt_disp_digit.setLabel(p.Base_amt_disp_digit_Label);
		p.Base_unit_disp_digit_Label = p.beansFactory.createLabel("Base.unit_disp_digit_Label");
		p.Base_unit_disp_digit = p.beansFactory.createNumberField("Base.unit_disp_digit");
		p.Base_unit_disp_digit.setLabel(p.Base_unit_disp_digit_Label);
		p.Base_rate_disp_digit_Label = p.beansFactory.createLabel("Base.rate_disp_digit_Label");
		p.Base_rate_disp_digit = p.beansFactory.createNumberField("Base.rate_disp_digit");
		p.Base_rate_disp_digit.setLabel(p.Base_rate_disp_digit_Label);
		p.Base_excel_pln_flg = p.beansFactory.createCheckBox("Base.excel_pln_flg");
		p.Base_excel_act_flg = p.beansFactory.createCheckBox("Base.excel_act_flg");
		p.Base_excel_alc_flg = p.beansFactory.createCheckBox("Base.excel_alc_flg");
		p.Base_ins_usr_id_Label = p.beansFactory.createLabel("Base.ins_usr_id_Label");
		p.Base_ins_usr_id = p.beansFactory.createTextField("Base.ins_usr_id");
		p.Base_ins_usr_id.setLabel(p.Base_ins_usr_id_Label);
		p.Base_ins_usr_nm = p.beansFactory.createTextField("Base.ins_usr_nm");
		p.Base_ins_func_id_Label = p.beansFactory.createLabel("Base.ins_func_id_Label");
		p.Base_ins_func_id = p.beansFactory.createTextField("Base.ins_func_id");
		p.Base_ins_func_id.setLabel(p.Base_ins_func_id_Label);
		p.Base_ins_func_nm = p.beansFactory.createTextField("Base.ins_func_nm");
		p.Base_upd_usr_id_Label = p.beansFactory.createLabel("Base.upd_usr_id_Label");
		p.Base_upd_usr_id = p.beansFactory.createTextField("Base.upd_usr_id");
		p.Base_upd_usr_id.setLabel(p.Base_upd_usr_id_Label);
		p.Base_upd_usr_nm = p.beansFactory.createTextField("Base.upd_usr_nm");
		p.Base_upd_func_id_Label = p.beansFactory.createLabel("Base.upd_func_id_Label");
		p.Base_upd_func_id = p.beansFactory.createTextField("Base.upd_func_id");
		p.Base_upd_func_id.setLabel(p.Base_upd_func_id_Label);
		p.Base_upd_func_nm = p.beansFactory.createTextField("Base.upd_func_nm");
		p.Base_ins_ts_Label = p.beansFactory.createLabel("Base.ins_ts_Label");
		p.Base_ins_ts = p.beansFactory.createTimestampField("Base.ins_ts");
		p.Base_ins_ts.setLabel(p.Base_ins_ts_Label);
		p.Base_upd_ts_Label = p.beansFactory.createLabel("Base.upd_ts_Label");
		p.Base_upd_ts = p.beansFactory.createTimestampField("Base.upd_ts");
		p.Base_upd_ts.setLabel(p.Base_upd_ts_Label);
		p.Base_upd_srv_req_no_Label = p.beansFactory.createLabel("Base.upd_srv_req_no_Label");
		p.Base_upd_srv_req_no = p.beansFactory.createTextField("Base.upd_srv_req_no");
		p.Base_upd_srv_req_no.setLabel(p.Base_upd_srv_req_no_Label);
		p.Base_upd_cntr = p.beansFactory.createNumberField("Base.upd_cntr");
		p.Base_check = p.beansFactory.createCheckBox("Base.check");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_co_cd = p.beansFactory.createTableColumn("Dtl.co_cd", MCColumnType.TEXT);
		p.columnDtl_std_rnd_typ = p.beansFactory.createTableColumn("Dtl.std_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_std_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.std_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_std_dec_place = p.beansFactory.createTableColumn("Dtl.std_dec_place", MCColumnType.NUMBER);
		p.columnDtl_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_amt_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.amt_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_amt_dec_place = p.beansFactory.createTableColumn("Dtl.amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ave_rnd_typ = p.beansFactory.createTableColumn("Dtl.ave_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_ave_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.ave_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ave_dec_place = p.beansFactory.createTableColumn("Dtl.ave_dec_place", MCColumnType.NUMBER);
		p.columnDtl_adj_typ = p.beansFactory.createTableColumn("Dtl.adj_typ", MCColumnType.TEXT);
		p.columnDtl_adj_typ_nm = p.beansFactory.createTableColumn("Dtl.adj_typ_nm", MCColumnType.TEXT);
		p.columnDtl_mrgn_expns_cd = p.beansFactory.createTableColumn("Dtl.mrgn_expns_cd", MCColumnType.TEXT);
		p.columnDtl_mrgn_expns_nm = p.beansFactory.createTableColumn("Dtl.mrgn_expns_nm", MCColumnType.TEXT);
		p.columnDtl_purc_expns_cd = p.beansFactory.createTableColumn("Dtl.purc_expns_cd", MCColumnType.TEXT);
		p.columnDtl_purc_expns_nm = p.beansFactory.createTableColumn("Dtl.purc_expns_nm", MCColumnType.TEXT);
		p.columnDtl_out_expns_cd = p.beansFactory.createTableColumn("Dtl.out_expns_cd", MCColumnType.TEXT);
		p.columnDtl_out_expns_nm = p.beansFactory.createTableColumn("Dtl.out_expns_nm", MCColumnType.TEXT);
		p.columnDtl_inpt_expns_cd = p.beansFactory.createTableColumn("Dtl.inpt_expns_cd", MCColumnType.TEXT);
		p.columnDtl_inpt_expns_nm = p.beansFactory.createTableColumn("Dtl.inpt_expns_nm", MCColumnType.TEXT);
		p.columnDtl_ss_expns_cd = p.beansFactory.createTableColumn("Dtl.ss_expns_cd", MCColumnType.TEXT);
		p.columnDtl_ss_expns_nm = p.beansFactory.createTableColumn("Dtl.ss_expns_nm", MCColumnType.TEXT);
		p.columnDtl_prov_expns_cd = p.beansFactory.createTableColumn("Dtl.prov_expns_cd", MCColumnType.TEXT);
		p.columnDtl_prov_expns_nm = p.beansFactory.createTableColumn("Dtl.prov_expns_nm", MCColumnType.TEXT);
		p.columnDtl_pre_alc_max_lvl = p.beansFactory.createTableColumn("Dtl.pre_alc_max_lvl", MCColumnType.NUMBER);
		p.columnDtl_pre_alc_max_rec = p.beansFactory.createTableColumn("Dtl.pre_alc_max_rec", MCColumnType.NUMBER);
		p.columnDtl_diff_use_typ = p.beansFactory.createTableColumn("Dtl.diff_use_typ", MCColumnType.TEXT);
		p.columnDtl_diff_use_typ_nm = p.beansFactory.createTableColumn("Dtl.diff_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_use_typ = p.beansFactory.createTableColumn("Dtl.lot_use_typ", MCColumnType.TEXT);
		p.columnDtl_lot_use_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_use_typ = p.beansFactory.createTableColumn("Dtl.sublot_use_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_use_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_use_typ = p.beansFactory.createTableColumn("Dtl.sno1_use_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_use_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_use_typ = p.beansFactory.createTableColumn("Dtl.sno2_use_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_use_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_use_typ = p.beansFactory.createTableColumn("Dtl.sno3_use_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_use_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_use_typ = p.beansFactory.createTableColumn("Dtl.sno4_use_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_use_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_use_typ_nm", MCColumnType.TEXT);
		p.columnDtl_def_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.def_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_def_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.def_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_fix_dpt_cd = p.beansFactory.createTableColumn("Dtl.fix_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_fix_dpt_nm = p.beansFactory.createTableColumn("Dtl.fix_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_trd_ratio_flg = p.beansFactory.createTableColumn("Dtl.trd_ratio_flg", MCColumnType.CHECK);
		p.columnDtl_stop_slip_flg = p.beansFactory.createTableColumn("Dtl.stop_slip_flg", MCColumnType.CHECK);
		p.columnDtl_non_prod_flg = p.beansFactory.createTableColumn("Dtl.non_prod_flg", MCColumnType.CHECK);
		p.columnDtl_oper_sum_flg = p.beansFactory.createTableColumn("Dtl.oper_sum_flg", MCColumnType.CHECK);
		p.columnDtl_non_sls_flg = p.beansFactory.createTableColumn("Dtl.non_sls_flg", MCColumnType.CHECK);
		p.columnDtl_asst_flg = p.beansFactory.createTableColumn("Dtl.asst_flg", MCColumnType.CHECK);
		p.columnDtl_stk_bp_flg = p.beansFactory.createTableColumn("Dtl.stk_bp_flg", MCColumnType.CHECK);
		p.columnDtl_non_transit_flg = p.beansFactory.createTableColumn("Dtl.non_transit_flg", MCColumnType.CHECK);
		p.columnDtl_wg_non_mov_flg = p.beansFactory.createTableColumn("Dtl.wg_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_lot_non_mov_flg = p.beansFactory.createTableColumn("Dtl.lot_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_sublot_non_mov_flg = p.beansFactory.createTableColumn("Dtl.sublot_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_sno1_non_mov_flg = p.beansFactory.createTableColumn("Dtl.sno1_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_sno2_non_mov_flg = p.beansFactory.createTableColumn("Dtl.sno2_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_sno3_non_mov_flg = p.beansFactory.createTableColumn("Dtl.sno3_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_sno4_non_mov_flg = p.beansFactory.createTableColumn("Dtl.sno4_non_mov_flg", MCColumnType.CHECK);
		p.columnDtl_tmp_dpt_cd = p.beansFactory.createTableColumn("Dtl.tmp_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_tmp_dpt_nm = p.beansFactory.createTableColumn("Dtl.tmp_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_act_trd_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.act_trd_calc_ctg_cd", MCColumnType.TEXT);
		p.columnDtl_act_trd_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.act_trd_calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_chk_mst_flg = p.beansFactory.createTableColumn("Dtl.chk_mst_flg", MCColumnType.CHECK);
		p.columnDtl_stktk_sum_flg = p.beansFactory.createTableColumn("Dtl.stktk_sum_flg", MCColumnType.CHECK);
		p.columnDtl_oth_ccn_sum_flg = p.beansFactory.createTableColumn("Dtl.oth_ccn_sum_flg", MCColumnType.CHECK);
		p.columnDtl_amt_disp_digit = p.beansFactory.createTableColumn("Dtl.amt_disp_digit", MCColumnType.NUMBER);
		p.columnDtl_unit_disp_digit = p.beansFactory.createTableColumn("Dtl.unit_disp_digit", MCColumnType.NUMBER);
		p.columnDtl_std_disp_digit = p.beansFactory.createTableColumn("Dtl.std_disp_digit", MCColumnType.NUMBER);
		p.columnDtl_rate_disp_digit = p.beansFactory.createTableColumn("Dtl.rate_disp_digit", MCColumnType.NUMBER);
		p.columnDtl_excel_pln_flg = p.beansFactory.createTableColumn("Dtl.excel_pln_flg", MCColumnType.CHECK);
		p.columnDtl_excel_act_flg = p.beansFactory.createTableColumn("Dtl.excel_act_flg", MCColumnType.CHECK);
		p.columnDtl_excel_alc_flg = p.beansFactory.createTableColumn("Dtl.excel_alc_flg", MCColumnType.CHECK);
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
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.TabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0010.CndR.ope_META);
		p.CndPanel.add(p.Cnd_co_cd_Label);
		p.CndPanel.add(p.Cnd_co_cd);
		p.CndPanel.setLastBeans(p.Cnd_co_cd);
		p.Cnd_co_cd.setNextBeans(p.Cnd_co_nm);
		p.Cnd_co_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0010.CndR.co_cd_META);
		p.CndPanel.add(p.Cnd_co_nm);
		p.Cnd_co_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_co_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0010.CndR.co_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.add(p.TabPanel);
		p.TabPanel.setNextBeans(p.BasePanel);
		p.TabPanel.add(p.TabTab);
		p.TabPanel.setLastBeans(p.TabTab);
		p.TabPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TabTab.add(p.Tab1Panel, "Tab.tab1");
		p.TabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.TabTab.add(p.Tab2Panel, "Tab.tab2");
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.TabTab.add(p.Tab3Panel, "Tab.tab3");
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.TabTab.add(p.Tab4Panel, "Tab.tab4");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.CommonPanel, null);
		p.Tab2Panel.setLastBeans(p.CommonPanel);
		p.CommonPanel.setNextBeans(p.IfDataImpPanel);
		p.Tab2Panel.add(p.IfDataImpPanel, null);
		p.IfDataImpPanel.setNextBeans(p.ActDataMakePanel);
		p.Tab2Panel.add(p.ActDataMakePanel, null);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Common]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCommon(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.CommonPanel.setBorder(p.CommonTitledBorder);
		p.CommonPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [IfDataImp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIfDataImp(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.IfDataImpPanel.setBorder(p.IfDataImpTitledBorder);
		p.IfDataImpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ActDataMake]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitActDataMake(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.ActDataMakePanel.setBorder(p.ActDataMakeTitledBorder);
		p.ActDataMakePanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.add(p.BasePanel);
		p.BasePanel.setNextBeans(p.DtlPanel);
		p.BasePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Base_std_rnd_typ.setListType(MCListType.STRICT);
		p.Base_std_rnd_typ.setLinkBeans(p.Base_std_rnd_typ_nm);
		p.Tab1Panel.add(p.Base_std_rnd_typ_Label);
		p.Tab1Panel.add(p.Base_std_rnd_typ);
		p.Tab1Panel.setLastBeans(p.Base_std_rnd_typ);
		p.Base_std_rnd_typ.setNextBeans(p.Base_std_rnd_typ_nm);
		p.Base_std_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.std_rnd_typ_META);
		p.Tab1Panel.add(p.Base_std_rnd_typ_nm);
		p.Base_std_rnd_typ_nm.setNextBeans(p.Base_std_dec_place);
		p.Base_std_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.std_rnd_typ_nm_META);
		p.Tab1Panel.add(p.Base_std_dec_place_Label);
		p.Tab1Panel.add(p.Base_std_dec_place);
		p.Base_std_dec_place.setNextBeans(p.Base_amt_rnd_typ);
		p.Base_std_dec_place.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.std_dec_place_META);
		p.Base_amt_rnd_typ.setListType(MCListType.STRICT);
		p.Base_amt_rnd_typ.setLinkBeans(p.Base_amt_rnd_typ_nm);
		p.Tab1Panel.add(p.Base_amt_rnd_typ_Label);
		p.Tab1Panel.add(p.Base_amt_rnd_typ);
		p.Base_amt_rnd_typ.setNextBeans(p.Base_amt_rnd_typ_nm);
		p.Base_amt_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.amt_rnd_typ_META);
		p.Tab1Panel.add(p.Base_amt_rnd_typ_nm);
		p.Base_amt_rnd_typ_nm.setNextBeans(p.Base_amt_dec_place);
		p.Base_amt_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.amt_rnd_typ_nm_META);
		p.Tab1Panel.add(p.Base_amt_dec_place_Label);
		p.Tab1Panel.add(p.Base_amt_dec_place);
		p.Base_amt_dec_place.setNextBeans(p.Base_ave_rnd_typ);
		p.Base_amt_dec_place.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.amt_dec_place_META);
		p.Base_ave_rnd_typ.setListType(MCListType.STRICT);
		p.Base_ave_rnd_typ.setLinkBeans(p.Base_ave_rnd_typ_nm);
		p.Tab1Panel.add(p.Base_ave_rnd_typ_Label);
		p.Tab1Panel.add(p.Base_ave_rnd_typ);
		p.Base_ave_rnd_typ.setNextBeans(p.Base_ave_rnd_typ_nm);
		p.Base_ave_rnd_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ave_rnd_typ_META);
		p.Tab1Panel.add(p.Base_ave_rnd_typ_nm);
		p.Base_ave_rnd_typ_nm.setNextBeans(p.Base_ave_dec_place);
		p.Base_ave_rnd_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ave_rnd_typ_nm_META);
		p.Tab1Panel.add(p.Base_ave_dec_place_Label);
		p.Tab1Panel.add(p.Base_ave_dec_place);
		p.Base_ave_dec_place.setNextBeans(p.Base_adj_typ);
		p.Base_ave_dec_place.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ave_dec_place_META);
		p.Base_adj_typ.setListType(MCListType.STRICT);
		p.Base_adj_typ.setLinkBeans(p.Base_adj_typ_nm);
		p.Tab1Panel.add(p.Base_adj_typ_Label);
		p.Tab1Panel.add(p.Base_adj_typ);
		p.Base_adj_typ.setNextBeans(p.Base_adj_typ_nm);
		p.Base_adj_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.adj_typ_META);
		p.Tab1Panel.add(p.Base_adj_typ_nm);
		p.Base_adj_typ_nm.setNextBeans(p.Base_mrgn_expns_cd);
		p.Base_adj_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.adj_typ_nm_META);
		p.Base_mrgn_expns_cd.setListType(MCListType.STRICT);
		p.Base_mrgn_expns_cd.setLinkBeans(p.Base_mrgn_expns_nm);
		p.Tab1Panel.add(p.Base_mrgn_expns_cd_Label);
		p.Tab1Panel.add(p.Base_mrgn_expns_cd);
		p.Base_mrgn_expns_cd.setNextBeans(p.Base_mrgn_expns_nm);
		p.Base_mrgn_expns_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.mrgn_expns_cd_META);
		p.Tab1Panel.add(p.Base_mrgn_expns_nm);
		p.Base_mrgn_expns_nm.setNextBeans(p.Base_purc_expns_cd);
		p.Base_mrgn_expns_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.mrgn_expns_nm_META);
		p.Base_purc_expns_cd.setListType(MCListType.STRICT);
		p.Base_purc_expns_cd.setLinkBeans(p.Base_purc_expns_nm);
		p.Tab1Panel.add(p.Base_purc_expns_cd_Label);
		p.Tab1Panel.add(p.Base_purc_expns_cd);
		p.Base_purc_expns_cd.setNextBeans(p.Base_purc_expns_nm);
		p.Base_purc_expns_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.purc_expns_cd_META);
		p.Tab1Panel.add(p.Base_purc_expns_nm);
		p.Base_purc_expns_nm.setNextBeans(p.Base_out_expns_cd);
		p.Base_purc_expns_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.purc_expns_nm_META);
		p.Base_out_expns_cd.setListType(MCListType.STRICT);
		p.Base_out_expns_cd.setLinkBeans(p.Base_out_expns_nm);
		p.Tab1Panel.add(p.Base_out_expns_cd_Label);
		p.Tab1Panel.add(p.Base_out_expns_cd);
		p.Base_out_expns_cd.setNextBeans(p.Base_out_expns_nm);
		p.Base_out_expns_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.out_expns_cd_META);
		p.Tab1Panel.add(p.Base_out_expns_nm);
		p.Base_out_expns_nm.setNextBeans(p.Base_inpt_expns_cd);
		p.Base_out_expns_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.out_expns_nm_META);
		p.Base_inpt_expns_cd.setListType(MCListType.STRICT);
		p.Base_inpt_expns_cd.setLinkBeans(p.Base_inpt_expns_nm);
		p.Tab1Panel.add(p.Base_inpt_expns_cd_Label);
		p.Tab1Panel.add(p.Base_inpt_expns_cd);
		p.Base_inpt_expns_cd.setNextBeans(p.Base_inpt_expns_nm);
		p.Base_inpt_expns_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.inpt_expns_cd_META);
		p.Tab1Panel.add(p.Base_inpt_expns_nm);
		p.Base_inpt_expns_nm.setNextBeans(p.Base_ss_expns_cd);
		p.Base_inpt_expns_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.inpt_expns_nm_META);
		p.Base_ss_expns_cd.setListType(MCListType.STRICT);
		p.Base_ss_expns_cd.setLinkBeans(p.Base_ss_expns_nm);
		p.Tab1Panel.add(p.Base_ss_expns_cd_Label);
		p.Tab1Panel.add(p.Base_ss_expns_cd);
		p.Base_ss_expns_cd.setNextBeans(p.Base_ss_expns_nm);
		p.Base_ss_expns_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ss_expns_cd_META);
		p.Tab1Panel.add(p.Base_ss_expns_nm);
		p.Base_ss_expns_nm.setNextBeans(p.Base_prov_expns_cd);
		p.Base_ss_expns_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ss_expns_nm_META);
		p.Base_prov_expns_cd.setListType(MCListType.STRICT);
		p.Base_prov_expns_cd.setLinkBeans(p.Base_prov_expns_nm);
		p.Tab1Panel.add(p.Base_prov_expns_cd_Label);
		p.Tab1Panel.add(p.Base_prov_expns_cd);
		p.Base_prov_expns_cd.setNextBeans(p.Base_prov_expns_nm);
		p.Base_prov_expns_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.prov_expns_cd_META);
		p.Tab1Panel.add(p.Base_prov_expns_nm);
		p.Base_prov_expns_nm.setNextBeans(p.Base_pre_alc_max_lvl);
		p.Base_prov_expns_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.prov_expns_nm_META);
		p.Tab1Panel.add(p.Base_pre_alc_max_lvl_Label);
		p.Tab1Panel.add(p.Base_pre_alc_max_lvl);
		p.Base_pre_alc_max_lvl.setNextBeans(p.Base_pre_alc_max_rec);
		p.Base_pre_alc_max_lvl.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.pre_alc_max_lvl_META);
		p.Tab1Panel.add(p.Base_pre_alc_max_rec_Label);
		p.Tab1Panel.add(p.Base_pre_alc_max_rec);
		p.Base_pre_alc_max_rec.setNextBeans(p.Base_diff_use_typ);
		p.Base_pre_alc_max_rec.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.pre_alc_max_rec_META);
		p.Base_diff_use_typ.setListType(MCListType.STRICT);
		p.Base_diff_use_typ.setLinkBeans(p.Base_diff_use_typ_nm);
		p.Tab1Panel.add(p.Base_diff_use_typ_Label);
		p.Tab1Panel.add(p.Base_diff_use_typ);
		p.Base_diff_use_typ.setNextBeans(p.Base_diff_use_typ_nm);
		p.Base_diff_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.diff_use_typ_META);
		p.Tab1Panel.add(p.Base_diff_use_typ_nm);
		p.Base_diff_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.diff_use_typ_nm_META);
		p.Base_lot_use_typ.setListType(MCListType.STRICT);
		p.Base_lot_use_typ.setLinkBeans(p.Base_lot_use_typ_nm);
		p.CommonPanel.add(p.Base_lot_use_typ_Label);
		p.CommonPanel.add(p.Base_lot_use_typ);
		p.CommonPanel.setLastBeans(p.Base_lot_use_typ);
		p.Base_lot_use_typ.setNextBeans(p.Base_lot_use_typ_nm);
		p.Base_lot_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.lot_use_typ_META);
		p.CommonPanel.add(p.Base_lot_use_typ_nm);
		p.Base_lot_use_typ_nm.setNextBeans(p.Base_sublot_use_typ);
		p.Base_lot_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.lot_use_typ_nm_META);
		p.Base_sublot_use_typ.setListType(MCListType.STRICT);
		p.Base_sublot_use_typ.setLinkBeans(p.Base_sublot_use_typ_nm);
		p.CommonPanel.add(p.Base_sublot_use_typ_Label);
		p.CommonPanel.add(p.Base_sublot_use_typ);
		p.Base_sublot_use_typ.setNextBeans(p.Base_sublot_use_typ_nm);
		p.Base_sublot_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sublot_use_typ_META);
		p.CommonPanel.add(p.Base_sublot_use_typ_nm);
		p.Base_sublot_use_typ_nm.setNextBeans(p.Base_sno1_use_typ);
		p.Base_sublot_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sublot_use_typ_nm_META);
		p.Base_sno1_use_typ.setListType(MCListType.STRICT);
		p.Base_sno1_use_typ.setLinkBeans(p.Base_sno1_use_typ_nm);
		p.CommonPanel.add(p.Base_sno1_use_typ_Label);
		p.CommonPanel.add(p.Base_sno1_use_typ);
		p.Base_sno1_use_typ.setNextBeans(p.Base_sno1_use_typ_nm);
		p.Base_sno1_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno1_use_typ_META);
		p.CommonPanel.add(p.Base_sno1_use_typ_nm);
		p.Base_sno1_use_typ_nm.setNextBeans(p.Base_sno2_use_typ);
		p.Base_sno1_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno1_use_typ_nm_META);
		p.Base_sno2_use_typ.setListType(MCListType.STRICT);
		p.Base_sno2_use_typ.setLinkBeans(p.Base_sno2_use_typ_nm);
		p.CommonPanel.add(p.Base_sno2_use_typ_Label);
		p.CommonPanel.add(p.Base_sno2_use_typ);
		p.Base_sno2_use_typ.setNextBeans(p.Base_sno2_use_typ_nm);
		p.Base_sno2_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno2_use_typ_META);
		p.CommonPanel.add(p.Base_sno2_use_typ_nm);
		p.Base_sno2_use_typ_nm.setNextBeans(p.Base_sno3_use_typ);
		p.Base_sno2_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno2_use_typ_nm_META);
		p.Base_sno3_use_typ.setListType(MCListType.STRICT);
		p.Base_sno3_use_typ.setLinkBeans(p.Base_sno3_use_typ_nm);
		p.CommonPanel.add(p.Base_sno3_use_typ_Label);
		p.CommonPanel.add(p.Base_sno3_use_typ);
		p.Base_sno3_use_typ.setNextBeans(p.Base_sno3_use_typ_nm);
		p.Base_sno3_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno3_use_typ_META);
		p.CommonPanel.add(p.Base_sno3_use_typ_nm);
		p.Base_sno3_use_typ_nm.setNextBeans(p.Base_sno4_use_typ);
		p.Base_sno3_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno3_use_typ_nm_META);
		p.Base_sno4_use_typ.setListType(MCListType.STRICT);
		p.Base_sno4_use_typ.setLinkBeans(p.Base_sno4_use_typ_nm);
		p.CommonPanel.add(p.Base_sno4_use_typ_Label);
		p.CommonPanel.add(p.Base_sno4_use_typ);
		p.Base_sno4_use_typ.setNextBeans(p.Base_sno4_use_typ_nm);
		p.Base_sno4_use_typ.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno4_use_typ_META);
		p.CommonPanel.add(p.Base_sno4_use_typ_nm);
		p.Base_sno4_use_typ_nm.setNextBeans(p.Base_def_calc_ctg_cd);
		p.Base_sno4_use_typ_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno4_use_typ_nm_META);
		p.Base_def_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Base_def_calc_ctg_cd.setLinkBeans(p.Base_def_calc_ctg_nm);
		p.CommonPanel.add(p.Base_def_calc_ctg_cd_Label);
		p.CommonPanel.add(p.Base_def_calc_ctg_cd);
		p.Base_def_calc_ctg_cd.setNextBeans(p.Base_def_calc_ctg_nm);
		p.Base_def_calc_ctg_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.def_calc_ctg_cd_META);
		p.CommonPanel.add(p.Base_def_calc_ctg_nm);
		p.Base_def_calc_ctg_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.def_calc_ctg_nm_META);
		p.Base_fix_dpt_cd.setListType(MCListType.STRICT);
		p.Base_fix_dpt_cd.setLinkBeans(p.Base_fix_dpt_nm);
		p.IfDataImpPanel.add(p.Base_fix_dpt_cd_Label);
		p.IfDataImpPanel.add(p.Base_fix_dpt_cd);
		p.IfDataImpPanel.setLastBeans(p.Base_fix_dpt_cd);
		p.Base_fix_dpt_cd.setNextBeans(p.Base_fix_dpt_nm);
		p.Base_fix_dpt_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.fix_dpt_cd_META);
		p.IfDataImpPanel.add(p.Base_fix_dpt_nm);
		p.Base_fix_dpt_nm.setNextBeans(p.Base_trd_ratio_flg);
		p.Base_fix_dpt_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.fix_dpt_nm_META);
		p.IfDataImpPanel.add(p.Base_trd_ratio_flg);
		p.Base_trd_ratio_flg.setNextBeans(p.Base_stop_slip_flg);
		p.Base_trd_ratio_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.trd_ratio_flg_META);
		p.IfDataImpPanel.add(p.Base_stop_slip_flg);
		p.Base_stop_slip_flg.setNextBeans(p.Base_non_prod_flg);
		p.Base_stop_slip_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.stop_slip_flg_META);
		p.IfDataImpPanel.add(p.Base_non_prod_flg);
		p.Base_non_prod_flg.setNextBeans(p.Base_oper_sum_flg);
		p.Base_non_prod_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.non_prod_flg_META);
		p.IfDataImpPanel.add(p.Base_oper_sum_flg);
		p.Base_oper_sum_flg.setNextBeans(p.Base_non_sls_flg);
		p.Base_oper_sum_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.oper_sum_flg_META);
		p.IfDataImpPanel.add(p.Base_non_sls_flg);
		p.Base_non_sls_flg.setNextBeans(p.Base_asst_flg);
		p.Base_non_sls_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.non_sls_flg_META);
		p.IfDataImpPanel.add(p.Base_asst_flg);
		p.Base_asst_flg.setNextBeans(p.Base_stk_bp_flg);
		p.Base_asst_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.asst_flg_META);
		p.IfDataImpPanel.add(p.Base_stk_bp_flg);
		p.Base_stk_bp_flg.setNextBeans(p.Base_non_transit_flg);
		p.Base_stk_bp_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.stk_bp_flg_META);
		p.IfDataImpPanel.add(p.Base_non_transit_flg);
		p.Base_non_transit_flg.setNextBeans(p.Base_wg_non_mov_flg);
		p.Base_non_transit_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.non_transit_flg_META);
		p.IfDataImpPanel.add(p.Base_non_mov_lab);
		p.IfDataImpPanel.add(p.Base_wg_non_mov_flg);
		p.Base_wg_non_mov_flg.setNextBeans(p.Base_lot_non_mov_flg);
		p.Base_wg_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.wg_non_mov_flg_META);
		p.IfDataImpPanel.add(p.Base_lot_non_mov_flg);
		p.Base_lot_non_mov_flg.setNextBeans(p.Base_sublot_non_mov_flg);
		p.Base_lot_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.lot_non_mov_flg_META);
		p.IfDataImpPanel.add(p.Base_sublot_non_mov_flg);
		p.Base_sublot_non_mov_flg.setNextBeans(p.Base_sno1_non_mov_flg);
		p.Base_sublot_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sublot_non_mov_flg_META);
		p.IfDataImpPanel.add(p.Base_sno1_non_mov_flg);
		p.Base_sno1_non_mov_flg.setNextBeans(p.Base_sno2_non_mov_flg);
		p.Base_sno1_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno1_non_mov_flg_META);
		p.IfDataImpPanel.add(p.Base_sno2_non_mov_flg);
		p.Base_sno2_non_mov_flg.setNextBeans(p.Base_sno3_non_mov_flg);
		p.Base_sno2_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno2_non_mov_flg_META);
		p.IfDataImpPanel.add(p.Base_sno3_non_mov_flg);
		p.Base_sno3_non_mov_flg.setNextBeans(p.Base_sno4_non_mov_flg);
		p.Base_sno3_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno3_non_mov_flg_META);
		p.IfDataImpPanel.add(p.Base_sno4_non_mov_flg);
		p.Base_sno4_non_mov_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.sno4_non_mov_flg_META);
		p.Base_tmp_dpt_cd.setListType(MCListType.STRICT);
		p.Base_tmp_dpt_cd.setLinkBeans(p.Base_tmp_dpt_nm);
		p.ActDataMakePanel.add(p.Base_tmp_dpt_cd_Label);
		p.ActDataMakePanel.add(p.Base_tmp_dpt_cd);
		p.ActDataMakePanel.setLastBeans(p.Base_tmp_dpt_cd);
		p.Base_tmp_dpt_cd.setNextBeans(p.Base_tmp_dpt_nm);
		p.Base_tmp_dpt_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.tmp_dpt_cd_META);
		p.ActDataMakePanel.add(p.Base_tmp_dpt_nm);
		p.Base_tmp_dpt_nm.setNextBeans(p.Base_act_trd_calc_ctg_cd);
		p.Base_tmp_dpt_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.tmp_dpt_nm_META);
		p.Base_act_trd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Base_act_trd_calc_ctg_cd.setLinkBeans(p.Base_act_trd_calc_ctg_nm);
		p.ActDataMakePanel.add(p.Base_act_trd_calc_ctg_cd_Label);
		p.ActDataMakePanel.add(p.Base_act_trd_calc_ctg_cd);
		p.Base_act_trd_calc_ctg_cd.setNextBeans(p.Base_act_trd_calc_ctg_nm);
		p.Base_act_trd_calc_ctg_cd.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.act_trd_calc_ctg_cd_META);
		p.ActDataMakePanel.add(p.Base_act_trd_calc_ctg_nm);
		p.Base_act_trd_calc_ctg_nm.setNextBeans(p.Base_chk_mst_flg);
		p.Base_act_trd_calc_ctg_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.act_trd_calc_ctg_nm_META);
		p.ActDataMakePanel.add(p.Base_chk_mst_flg);
		p.Base_chk_mst_flg.setNextBeans(p.Base_stktk_sum_flg);
		p.Base_chk_mst_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.chk_mst_flg_META);
		p.ActDataMakePanel.add(p.Base_stktk_sum_flg);
		p.Base_stktk_sum_flg.setNextBeans(p.Base_oth_ccn_sum_flg);
		p.Base_stktk_sum_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.stktk_sum_flg_META);
		p.ActDataMakePanel.add(p.Base_oth_ccn_sum_flg);
		p.Base_oth_ccn_sum_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.oth_ccn_sum_flg_META);
		p.Tab3Panel.add(p.Base_std_disp_digit_Label);
		p.Tab3Panel.add(p.Base_std_disp_digit);
		p.Tab3Panel.setLastBeans(p.Base_std_disp_digit);
		p.Base_std_disp_digit.setNextBeans(p.Base_amt_disp_digit);
		p.Base_std_disp_digit.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.std_disp_digit_META);
		p.Tab3Panel.add(p.Base_amt_disp_digit_Label);
		p.Tab3Panel.add(p.Base_amt_disp_digit);
		p.Base_amt_disp_digit.setNextBeans(p.Base_unit_disp_digit);
		p.Base_amt_disp_digit.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.amt_disp_digit_META);
		p.Tab3Panel.add(p.Base_unit_disp_digit_Label);
		p.Tab3Panel.add(p.Base_unit_disp_digit);
		p.Base_unit_disp_digit.setNextBeans(p.Base_rate_disp_digit);
		p.Base_unit_disp_digit.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.unit_disp_digit_META);
		p.Tab3Panel.add(p.Base_rate_disp_digit_Label);
		p.Tab3Panel.add(p.Base_rate_disp_digit);
		p.Base_rate_disp_digit.setNextBeans(p.Base_excel_pln_flg);
		p.Base_rate_disp_digit.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.rate_disp_digit_META);
		p.Tab3Panel.add(p.Base_excel_pln_flg);
		p.Base_excel_pln_flg.setNextBeans(p.Base_excel_act_flg);
		p.Base_excel_pln_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.excel_pln_flg_META);
		p.Tab3Panel.add(p.Base_excel_act_flg);
		p.Base_excel_act_flg.setNextBeans(p.Base_excel_alc_flg);
		p.Base_excel_act_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.excel_act_flg_META);
		p.Tab3Panel.add(p.Base_excel_alc_flg);
		p.Base_excel_alc_flg.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.excel_alc_flg_META);
		p.Tab4Panel.add(p.Base_ins_usr_id_Label);
		p.Tab4Panel.add(p.Base_ins_usr_id);
		p.Tab4Panel.setLastBeans(p.Base_ins_usr_id);
		p.Base_ins_usr_id.setNextBeans(p.Base_ins_usr_nm);
		p.Base_ins_usr_id.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ins_usr_id_META);
		p.Tab4Panel.add(p.Base_ins_usr_nm);
		p.Base_ins_usr_nm.setNextBeans(p.Base_ins_func_id);
		p.Base_ins_usr_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ins_usr_nm_META);
		p.Tab4Panel.add(p.Base_ins_func_id_Label);
		p.Tab4Panel.add(p.Base_ins_func_id);
		p.Base_ins_func_id.setNextBeans(p.Base_ins_func_nm);
		p.Base_ins_func_id.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ins_func_id_META);
		p.Tab4Panel.add(p.Base_ins_func_nm);
		p.Base_ins_func_nm.setNextBeans(p.Base_upd_usr_id);
		p.Base_ins_func_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ins_func_nm_META);
		p.Tab4Panel.add(p.Base_upd_usr_id_Label);
		p.Tab4Panel.add(p.Base_upd_usr_id);
		p.Base_upd_usr_id.setNextBeans(p.Base_upd_usr_nm);
		p.Base_upd_usr_id.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_usr_id_META);
		p.Tab4Panel.add(p.Base_upd_usr_nm);
		p.Base_upd_usr_nm.setNextBeans(p.Base_upd_func_id);
		p.Base_upd_usr_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_usr_nm_META);
		p.Tab4Panel.add(p.Base_upd_func_id_Label);
		p.Tab4Panel.add(p.Base_upd_func_id);
		p.Base_upd_func_id.setNextBeans(p.Base_upd_func_nm);
		p.Base_upd_func_id.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_func_id_META);
		p.Tab4Panel.add(p.Base_upd_func_nm);
		p.Base_upd_func_nm.setNextBeans(p.Base_ins_ts);
		p.Base_upd_func_nm.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_func_nm_META);
		p.Tab4Panel.add(p.Base_ins_ts_Label);
		p.Tab4Panel.add(p.Base_ins_ts);
		p.Base_ins_ts.setNextBeans(p.Base_upd_ts);
		p.Base_ins_ts.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.ins_ts_META);
		p.Base_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Tab4Panel.add(p.Base_upd_ts_Label);
		p.Tab4Panel.add(p.Base_upd_ts);
		p.Base_upd_ts.setNextBeans(p.Base_upd_srv_req_no);
		p.Base_upd_ts.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_ts_META);
		p.Base_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Tab4Panel.add(p.Base_upd_srv_req_no_Label);
		p.Tab4Panel.add(p.Base_upd_srv_req_no);
		p.Base_upd_srv_req_no.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_srv_req_no_META);
		p.BasePanel.add(p.Base_upd_cntr);
		p.BasePanel.setLastBeans(p.Base_upd_cntr);
		p.Base_upd_cntr.setNextBeans(p.Base_check);
		p.Base_upd_cntr.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.upd_cntr_META);
		p.BasePanel.add(p.Base_check);
		p.Base_check.setRow(p.getBaseR(), mcframe.clientMABG.MABGP0010.BaseR.check_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_CoParmReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABGP_CoParmReg p) {
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
		MABGP_CoParmReg_MC.mcInitScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitCnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitTab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitTab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitTab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitTab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitTab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitCommon((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitIfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitBase((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitDtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitBtn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.mcInitEastBtn((MABGP_CoParmReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_CoParmReg_MC.statusInitUPD_ScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Cnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Tab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Tab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Tab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Tab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Tab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Common((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_IfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_ActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Base((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Dtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_Btn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitUPD_EastBtn((MABGP_CoParmReg)this);

		// [FIX]ステータスのモードの設定
		MABGP_CoParmReg_MC.statusInitFIX_ScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Cnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Tab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Tab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Tab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Tab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Tab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Common((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_IfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_ActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Base((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Dtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_Btn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitFIX_EastBtn((MABGP_CoParmReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_CoParmReg_MC.statusInitDEL_ScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Cnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Tab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Tab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Tab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Tab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Tab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Common((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_IfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_ActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Base((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Dtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_Btn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitDEL_EastBtn((MABGP_CoParmReg)this);

		// [REF]ステータスのモードの設定
		MABGP_CoParmReg_MC.statusInitREF_ScreenOpe((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Cnd((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Tab((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Tab1((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Tab2((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Tab3((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Tab4((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Common((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_IfDataImp((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_ActDataMake((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Base((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Dtl((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_Btn((MABGP_CoParmReg)this);
		MABGP_CoParmReg_MC.statusInitREF_EastBtn((MABGP_CoParmReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_CoParmReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_CoParmReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_co_cd.setListListener(p);
		p.Cnd_co_cd.addAllListener(p);
		p.Cnd_co_nm.setListListener(p);
		p.Cnd_co_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MABGP_CoParmReg p) {
		p.TabTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABGP_CoParmReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABGP_CoParmReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MABGP_CoParmReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MABGP_CoParmReg p) {
	}

	/**
	 *  [Common]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCommon(MABGP_CoParmReg p) {
	}

	/**
	 *  [IfDataImp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIfDataImp(MABGP_CoParmReg p) {
	}

	/**
	 *  [ActDataMake]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitActDataMake(MABGP_CoParmReg p) {
	}

	/**
	 *  [Base]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase(MABGP_CoParmReg p) {
		p.Base_std_rnd_typ.setListListener(p);
		p.Base_std_rnd_typ.addAllListener(p);
		p.Base_std_rnd_typ_nm.setListListener(p);
		p.Base_std_rnd_typ_nm.addAllListener(p);
		p.Base_std_dec_place.setListListener(p);
		p.Base_std_dec_place.addAllListener(p);
		p.Base_amt_rnd_typ.setListListener(p);
		p.Base_amt_rnd_typ.addAllListener(p);
		p.Base_amt_rnd_typ_nm.setListListener(p);
		p.Base_amt_rnd_typ_nm.addAllListener(p);
		p.Base_amt_dec_place.setListListener(p);
		p.Base_amt_dec_place.addAllListener(p);
		p.Base_ave_rnd_typ.setListListener(p);
		p.Base_ave_rnd_typ.addAllListener(p);
		p.Base_ave_rnd_typ_nm.setListListener(p);
		p.Base_ave_rnd_typ_nm.addAllListener(p);
		p.Base_ave_dec_place.setListListener(p);
		p.Base_ave_dec_place.addAllListener(p);
		p.Base_adj_typ.setListListener(p);
		p.Base_adj_typ.addAllListener(p);
		p.Base_adj_typ_nm.setListListener(p);
		p.Base_adj_typ_nm.addAllListener(p);
		p.Base_mrgn_expns_cd.setListListener(p);
		p.Base_mrgn_expns_cd.addAllListener(p);
		p.Base_mrgn_expns_nm.setListListener(p);
		p.Base_mrgn_expns_nm.addAllListener(p);
		p.Base_purc_expns_cd.setListListener(p);
		p.Base_purc_expns_cd.addAllListener(p);
		p.Base_purc_expns_nm.setListListener(p);
		p.Base_purc_expns_nm.addAllListener(p);
		p.Base_out_expns_cd.setListListener(p);
		p.Base_out_expns_cd.addAllListener(p);
		p.Base_out_expns_nm.setListListener(p);
		p.Base_out_expns_nm.addAllListener(p);
		p.Base_inpt_expns_cd.setListListener(p);
		p.Base_inpt_expns_cd.addAllListener(p);
		p.Base_inpt_expns_nm.setListListener(p);
		p.Base_inpt_expns_nm.addAllListener(p);
		p.Base_ss_expns_cd.setListListener(p);
		p.Base_ss_expns_cd.addAllListener(p);
		p.Base_ss_expns_nm.setListListener(p);
		p.Base_ss_expns_nm.addAllListener(p);
		p.Base_prov_expns_cd.setListListener(p);
		p.Base_prov_expns_cd.addAllListener(p);
		p.Base_prov_expns_nm.setListListener(p);
		p.Base_prov_expns_nm.addAllListener(p);
		p.Base_pre_alc_max_lvl.setListListener(p);
		p.Base_pre_alc_max_lvl.addAllListener(p);
		p.Base_pre_alc_max_rec.setListListener(p);
		p.Base_pre_alc_max_rec.addAllListener(p);
		p.Base_diff_use_typ.setListListener(p);
		p.Base_diff_use_typ.addAllListener(p);
		p.Base_diff_use_typ_nm.setListListener(p);
		p.Base_diff_use_typ_nm.addAllListener(p);
		p.Base_lot_use_typ.setListListener(p);
		p.Base_lot_use_typ.addAllListener(p);
		p.Base_lot_use_typ_nm.setListListener(p);
		p.Base_lot_use_typ_nm.addAllListener(p);
		p.Base_sublot_use_typ.setListListener(p);
		p.Base_sublot_use_typ.addAllListener(p);
		p.Base_sublot_use_typ_nm.setListListener(p);
		p.Base_sublot_use_typ_nm.addAllListener(p);
		p.Base_sno1_use_typ.setListListener(p);
		p.Base_sno1_use_typ.addAllListener(p);
		p.Base_sno1_use_typ_nm.setListListener(p);
		p.Base_sno1_use_typ_nm.addAllListener(p);
		p.Base_sno2_use_typ.setListListener(p);
		p.Base_sno2_use_typ.addAllListener(p);
		p.Base_sno2_use_typ_nm.setListListener(p);
		p.Base_sno2_use_typ_nm.addAllListener(p);
		p.Base_sno3_use_typ.setListListener(p);
		p.Base_sno3_use_typ.addAllListener(p);
		p.Base_sno3_use_typ_nm.setListListener(p);
		p.Base_sno3_use_typ_nm.addAllListener(p);
		p.Base_sno4_use_typ.setListListener(p);
		p.Base_sno4_use_typ.addAllListener(p);
		p.Base_sno4_use_typ_nm.setListListener(p);
		p.Base_sno4_use_typ_nm.addAllListener(p);
		p.Base_def_calc_ctg_cd.setListListener(p);
		p.Base_def_calc_ctg_cd.addAllListener(p);
		p.Base_def_calc_ctg_nm.setListListener(p);
		p.Base_def_calc_ctg_nm.addAllListener(p);
		p.Base_fix_dpt_cd.setListListener(p);
		p.Base_fix_dpt_cd.addAllListener(p);
		p.Base_fix_dpt_nm.setListListener(p);
		p.Base_fix_dpt_nm.addAllListener(p);
		p.Base_trd_ratio_flg.addAllListener(p);
		p.Base_stop_slip_flg.addAllListener(p);
		p.Base_non_prod_flg.addAllListener(p);
		p.Base_oper_sum_flg.addAllListener(p);
		p.Base_non_sls_flg.addAllListener(p);
		p.Base_asst_flg.addAllListener(p);
		p.Base_stk_bp_flg.addAllListener(p);
		p.Base_non_transit_flg.addAllListener(p);
		p.Base_wg_non_mov_flg.addAllListener(p);
		p.Base_lot_non_mov_flg.addAllListener(p);
		p.Base_sublot_non_mov_flg.addAllListener(p);
		p.Base_sno1_non_mov_flg.addAllListener(p);
		p.Base_sno2_non_mov_flg.addAllListener(p);
		p.Base_sno3_non_mov_flg.addAllListener(p);
		p.Base_sno4_non_mov_flg.addAllListener(p);
		p.Base_tmp_dpt_cd.setListListener(p);
		p.Base_tmp_dpt_cd.addAllListener(p);
		p.Base_tmp_dpt_nm.setListListener(p);
		p.Base_tmp_dpt_nm.addAllListener(p);
		p.Base_act_trd_calc_ctg_cd.setListListener(p);
		p.Base_act_trd_calc_ctg_cd.addAllListener(p);
		p.Base_act_trd_calc_ctg_nm.setListListener(p);
		p.Base_act_trd_calc_ctg_nm.addAllListener(p);
		p.Base_chk_mst_flg.addAllListener(p);
		p.Base_stktk_sum_flg.addAllListener(p);
		p.Base_oth_ccn_sum_flg.addAllListener(p);
		p.Base_std_disp_digit.setListListener(p);
		p.Base_std_disp_digit.addAllListener(p);
		p.Base_amt_disp_digit.setListListener(p);
		p.Base_amt_disp_digit.addAllListener(p);
		p.Base_unit_disp_digit.setListListener(p);
		p.Base_unit_disp_digit.addAllListener(p);
		p.Base_rate_disp_digit.setListListener(p);
		p.Base_rate_disp_digit.addAllListener(p);
		p.Base_excel_pln_flg.addAllListener(p);
		p.Base_excel_act_flg.addAllListener(p);
		p.Base_excel_alc_flg.addAllListener(p);
		p.Base_ins_usr_id.setListListener(p);
		p.Base_ins_usr_id.addAllListener(p);
		p.Base_ins_usr_nm.setListListener(p);
		p.Base_ins_usr_nm.addAllListener(p);
		p.Base_ins_func_id.setListListener(p);
		p.Base_ins_func_id.addAllListener(p);
		p.Base_ins_func_nm.setListListener(p);
		p.Base_ins_func_nm.addAllListener(p);
		p.Base_upd_usr_id.setListListener(p);
		p.Base_upd_usr_id.addAllListener(p);
		p.Base_upd_usr_nm.setListListener(p);
		p.Base_upd_usr_nm.addAllListener(p);
		p.Base_upd_func_id.setListListener(p);
		p.Base_upd_func_id.addAllListener(p);
		p.Base_upd_func_nm.setListListener(p);
		p.Base_upd_func_nm.addAllListener(p);
		p.Base_ins_ts.setListListener(p);
		p.Base_ins_ts.addAllListener(p);
		p.Base_upd_ts.setListListener(p);
		p.Base_upd_ts.addAllListener(p);
		p.Base_upd_srv_req_no.setListListener(p);
		p.Base_upd_srv_req_no.addAllListener(p);
		p.Base_upd_cntr.setListListener(p);
		p.Base_upd_cntr.addAllListener(p);
		p.Base_check.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_CoParmReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_co_cd.addAllListener(p);
		p.columnDtl_co_cd.setListListener(p);
		p.columnDtl_std_rnd_typ.addAllListener(p);
		p.columnDtl_std_rnd_typ.setListListener(p);
		p.columnDtl_std_rnd_typ_nm.addAllListener(p);
		p.columnDtl_std_rnd_typ_nm.setListListener(p);
		p.columnDtl_std_dec_place.addAllListener(p);
		p.columnDtl_std_dec_place.setListListener(p);
		p.columnDtl_amt_rnd_typ.addAllListener(p);
		p.columnDtl_amt_rnd_typ.setListListener(p);
		p.columnDtl_amt_rnd_typ_nm.addAllListener(p);
		p.columnDtl_amt_rnd_typ_nm.setListListener(p);
		p.columnDtl_amt_dec_place.addAllListener(p);
		p.columnDtl_amt_dec_place.setListListener(p);
		p.columnDtl_ave_rnd_typ.addAllListener(p);
		p.columnDtl_ave_rnd_typ.setListListener(p);
		p.columnDtl_ave_rnd_typ_nm.addAllListener(p);
		p.columnDtl_ave_rnd_typ_nm.setListListener(p);
		p.columnDtl_ave_dec_place.addAllListener(p);
		p.columnDtl_ave_dec_place.setListListener(p);
		p.columnDtl_adj_typ.addAllListener(p);
		p.columnDtl_adj_typ.setListListener(p);
		p.columnDtl_adj_typ_nm.addAllListener(p);
		p.columnDtl_adj_typ_nm.setListListener(p);
		p.columnDtl_mrgn_expns_cd.addAllListener(p);
		p.columnDtl_mrgn_expns_cd.setListListener(p);
		p.columnDtl_mrgn_expns_nm.addAllListener(p);
		p.columnDtl_mrgn_expns_nm.setListListener(p);
		p.columnDtl_purc_expns_cd.addAllListener(p);
		p.columnDtl_purc_expns_cd.setListListener(p);
		p.columnDtl_purc_expns_nm.addAllListener(p);
		p.columnDtl_purc_expns_nm.setListListener(p);
		p.columnDtl_out_expns_cd.addAllListener(p);
		p.columnDtl_out_expns_cd.setListListener(p);
		p.columnDtl_out_expns_nm.addAllListener(p);
		p.columnDtl_out_expns_nm.setListListener(p);
		p.columnDtl_inpt_expns_cd.addAllListener(p);
		p.columnDtl_inpt_expns_cd.setListListener(p);
		p.columnDtl_inpt_expns_nm.addAllListener(p);
		p.columnDtl_inpt_expns_nm.setListListener(p);
		p.columnDtl_ss_expns_cd.addAllListener(p);
		p.columnDtl_ss_expns_cd.setListListener(p);
		p.columnDtl_ss_expns_nm.addAllListener(p);
		p.columnDtl_ss_expns_nm.setListListener(p);
		p.columnDtl_prov_expns_cd.addAllListener(p);
		p.columnDtl_prov_expns_cd.setListListener(p);
		p.columnDtl_prov_expns_nm.addAllListener(p);
		p.columnDtl_prov_expns_nm.setListListener(p);
		p.columnDtl_pre_alc_max_lvl.addAllListener(p);
		p.columnDtl_pre_alc_max_lvl.setListListener(p);
		p.columnDtl_pre_alc_max_rec.addAllListener(p);
		p.columnDtl_pre_alc_max_rec.setListListener(p);
		p.columnDtl_diff_use_typ.addAllListener(p);
		p.columnDtl_diff_use_typ.setListListener(p);
		p.columnDtl_diff_use_typ_nm.addAllListener(p);
		p.columnDtl_diff_use_typ_nm.setListListener(p);
		p.columnDtl_lot_use_typ.addAllListener(p);
		p.columnDtl_lot_use_typ.setListListener(p);
		p.columnDtl_lot_use_typ_nm.addAllListener(p);
		p.columnDtl_lot_use_typ_nm.setListListener(p);
		p.columnDtl_sublot_use_typ.addAllListener(p);
		p.columnDtl_sublot_use_typ.setListListener(p);
		p.columnDtl_sublot_use_typ_nm.addAllListener(p);
		p.columnDtl_sublot_use_typ_nm.setListListener(p);
		p.columnDtl_sno1_use_typ.addAllListener(p);
		p.columnDtl_sno1_use_typ.setListListener(p);
		p.columnDtl_sno1_use_typ_nm.addAllListener(p);
		p.columnDtl_sno1_use_typ_nm.setListListener(p);
		p.columnDtl_sno2_use_typ.addAllListener(p);
		p.columnDtl_sno2_use_typ.setListListener(p);
		p.columnDtl_sno2_use_typ_nm.addAllListener(p);
		p.columnDtl_sno2_use_typ_nm.setListListener(p);
		p.columnDtl_sno3_use_typ.addAllListener(p);
		p.columnDtl_sno3_use_typ.setListListener(p);
		p.columnDtl_sno3_use_typ_nm.addAllListener(p);
		p.columnDtl_sno3_use_typ_nm.setListListener(p);
		p.columnDtl_sno4_use_typ.addAllListener(p);
		p.columnDtl_sno4_use_typ.setListListener(p);
		p.columnDtl_sno4_use_typ_nm.addAllListener(p);
		p.columnDtl_sno4_use_typ_nm.setListListener(p);
		p.columnDtl_def_calc_ctg_cd.addAllListener(p);
		p.columnDtl_def_calc_ctg_cd.setListListener(p);
		p.columnDtl_def_calc_ctg_nm.addAllListener(p);
		p.columnDtl_def_calc_ctg_nm.setListListener(p);
		p.columnDtl_fix_dpt_cd.addAllListener(p);
		p.columnDtl_fix_dpt_cd.setListListener(p);
		p.columnDtl_fix_dpt_nm.addAllListener(p);
		p.columnDtl_fix_dpt_nm.setListListener(p);
		p.columnDtl_trd_ratio_flg.addAllListener(p);
		p.columnDtl_stop_slip_flg.addAllListener(p);
		p.columnDtl_non_prod_flg.addAllListener(p);
		p.columnDtl_oper_sum_flg.addAllListener(p);
		p.columnDtl_non_sls_flg.addAllListener(p);
		p.columnDtl_asst_flg.addAllListener(p);
		p.columnDtl_stk_bp_flg.addAllListener(p);
		p.columnDtl_non_transit_flg.addAllListener(p);
		p.columnDtl_wg_non_mov_flg.addAllListener(p);
		p.columnDtl_lot_non_mov_flg.addAllListener(p);
		p.columnDtl_sublot_non_mov_flg.addAllListener(p);
		p.columnDtl_sno1_non_mov_flg.addAllListener(p);
		p.columnDtl_sno2_non_mov_flg.addAllListener(p);
		p.columnDtl_sno3_non_mov_flg.addAllListener(p);
		p.columnDtl_sno4_non_mov_flg.addAllListener(p);
		p.columnDtl_tmp_dpt_cd.addAllListener(p);
		p.columnDtl_tmp_dpt_cd.setListListener(p);
		p.columnDtl_tmp_dpt_nm.addAllListener(p);
		p.columnDtl_tmp_dpt_nm.setListListener(p);
		p.columnDtl_act_trd_calc_ctg_cd.addAllListener(p);
		p.columnDtl_act_trd_calc_ctg_cd.setListListener(p);
		p.columnDtl_act_trd_calc_ctg_nm.addAllListener(p);
		p.columnDtl_act_trd_calc_ctg_nm.setListListener(p);
		p.columnDtl_chk_mst_flg.addAllListener(p);
		p.columnDtl_stktk_sum_flg.addAllListener(p);
		p.columnDtl_oth_ccn_sum_flg.addAllListener(p);
		p.columnDtl_amt_disp_digit.addAllListener(p);
		p.columnDtl_amt_disp_digit.setListListener(p);
		p.columnDtl_unit_disp_digit.addAllListener(p);
		p.columnDtl_unit_disp_digit.setListListener(p);
		p.columnDtl_std_disp_digit.addAllListener(p);
		p.columnDtl_std_disp_digit.setListListener(p);
		p.columnDtl_rate_disp_digit.addAllListener(p);
		p.columnDtl_rate_disp_digit.setListListener(p);
		p.columnDtl_excel_pln_flg.addAllListener(p);
		p.columnDtl_excel_act_flg.addAllListener(p);
		p.columnDtl_excel_alc_flg.addAllListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_CoParmReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_CoParmReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_CoParmReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_co_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Common]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Common(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[IfDataImp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_IfDataImp(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[ActDataMake]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ActDataMake(MABGP_CoParmReg p){

	}

	/**
	 * [UPD]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base(MABGP_CoParmReg p){
		p.Base_std_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_std_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_std_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_amt_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_amt_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_amt_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_ave_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_ave_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ave_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_adj_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_adj_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_mrgn_expns_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_mrgn_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_purc_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_purc_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_out_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_out_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_inpt_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_inpt_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ss_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_ss_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_prov_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_prov_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_pre_alc_max_lvl.putMode(p, UPD, MCMode.ENABLE);
		p.Base_pre_alc_max_rec.putMode(p, UPD, MCMode.ENABLE);
		p.Base_diff_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_diff_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_lot_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_lot_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sublot_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sublot_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sno1_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sno1_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sno2_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sno2_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sno3_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sno3_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_sno4_use_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Base_sno4_use_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_def_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_fix_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_fix_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_trd_ratio_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stop_slip_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_non_prod_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_oper_sum_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_non_sls_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_asst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stk_bp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_non_transit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_non_mov_lab.putMode(p, UPD, MCMode.ENABLE);
		p.Base_wg_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_lot_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sublot_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sno1_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sno2_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sno3_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_sno4_non_mov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_tmp_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_tmp_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Base_act_trd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_chk_mst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_stktk_sum_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_oth_ccn_sum_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_std_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_amt_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_unit_disp_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_rate_disp_digit.putMode(p, UPD, MCMode.ENABLE);
		p.Base_excel_pln_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_excel_act_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_excel_alc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Base_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Base_check.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_CoParmReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ave_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_adj_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_adj_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_out_expns_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_out_expns_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_lvl.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_rec.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_ratio_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stop_slip_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_non_prod_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_oper_sum_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_non_sls_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_non_transit_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_non_mov_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chk_mst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stktk_sum_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_oth_ccn_sum_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_amt_disp_digit.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_unit_disp_digit.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_disp_digit.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rate_disp_digit.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_excel_pln_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_excel_act_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_excel_alc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_CoParmReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABGP_CoParmReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_co_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab3(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab4(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Common]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Common(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[IfDataImp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_IfDataImp(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[ActDataMake]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ActDataMake(MABGP_CoParmReg p){

	}

	/**
	 * [FIX]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base(MABGP_CoParmReg p){
		p.Base_std_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_std_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_std_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_amt_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_amt_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_amt_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ave_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ave_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ave_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_adj_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_adj_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mrgn_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_mrgn_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_purc_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_out_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_out_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_inpt_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_inpt_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ss_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ss_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_prov_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_prov_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pre_alc_max_lvl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_pre_alc_max_rec.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_diff_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_diff_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_lot_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_lot_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sublot_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sublot_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno1_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno1_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno2_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno2_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno3_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno3_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno4_use_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno4_use_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_fix_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_fix_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_trd_ratio_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stop_slip_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_non_prod_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_oper_sum_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_non_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_asst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stk_bp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_non_transit_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_non_mov_lab.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_wg_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_lot_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sublot_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno1_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno2_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno3_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_sno4_non_mov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_tmp_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_tmp_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_chk_mst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_stktk_sum_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_oth_ccn_sum_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_std_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_amt_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_unit_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_rate_disp_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_excel_pln_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_excel_act_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_excel_alc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Base_check.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABGP_CoParmReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_amt_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ave_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_adj_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_adj_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_out_expns_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_out_expns_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_lvl.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_rec.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_trd_ratio_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stop_slip_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_non_prod_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_oper_sum_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_non_sls_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_asst_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_non_transit_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wg_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sublot_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno1_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno2_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno3_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno4_non_mov_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chk_mst_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_stktk_sum_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_oth_ccn_sum_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_amt_disp_digit.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_unit_disp_digit.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_std_disp_digit.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_rate_disp_digit.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_excel_pln_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_excel_act_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_excel_alc_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABGP_CoParmReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_CoParmReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_co_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Common]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Common(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[IfDataImp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_IfDataImp(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[ActDataMake]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ActDataMake(MABGP_CoParmReg p){

	}

	/**
	 * [DEL]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base(MABGP_CoParmReg p){
		p.Base_std_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_std_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_std_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_amt_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_amt_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_amt_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ave_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ave_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ave_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_adj_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_adj_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_mrgn_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_mrgn_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_purc_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_purc_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_out_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_out_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_inpt_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_inpt_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ss_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ss_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_prov_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_prov_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_pre_alc_max_lvl.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_pre_alc_max_rec.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_diff_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_diff_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_lot_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_lot_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sublot_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sublot_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno1_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno1_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno2_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno2_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno3_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno3_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno4_use_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno4_use_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_fix_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_fix_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_trd_ratio_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_stop_slip_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_non_prod_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_oper_sum_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_non_sls_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_asst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_stk_bp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_non_transit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_non_mov_lab.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_wg_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_lot_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sublot_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno1_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno2_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno3_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_sno4_non_mov_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_tmp_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_tmp_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_chk_mst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_stktk_sum_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_oth_ccn_sum_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_std_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_amt_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_unit_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_rate_disp_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_excel_pln_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_excel_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_excel_alc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Base_check.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_CoParmReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_std_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ave_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_adj_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_adj_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_out_expns_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_out_expns_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_lvl.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_rec.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_ratio_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stop_slip_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_non_prod_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_oper_sum_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_non_sls_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asst_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_non_transit_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_non_mov_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chk_mst_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stktk_sum_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_oth_ccn_sum_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_amt_disp_digit.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_unit_disp_digit.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_std_disp_digit.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rate_disp_digit.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_excel_pln_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_excel_act_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_excel_alc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_CoParmReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_CoParmReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_co_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_co_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Common]ブロックのモードの設定
	 */
	protected static void statusInitREF_Common(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[IfDataImp]ブロックのモードの設定
	 */
	protected static void statusInitREF_IfDataImp(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[ActDataMake]ブロックのモードの設定
	 */
	protected static void statusInitREF_ActDataMake(MABGP_CoParmReg p){

	}

	/**
	 * [REF]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base(MABGP_CoParmReg p){
		p.Base_std_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_std_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_std_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_amt_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_amt_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_amt_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ave_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ave_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ave_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_adj_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_adj_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mrgn_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_mrgn_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_purc_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_out_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_out_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_inpt_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_inpt_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ss_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ss_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_prov_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_prov_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pre_alc_max_lvl.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_pre_alc_max_rec.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_diff_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_diff_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_lot_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_lot_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sublot_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sublot_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno1_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno1_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno2_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno2_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno3_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno3_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno4_use_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno4_use_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_def_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_fix_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_fix_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_trd_ratio_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stop_slip_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_non_prod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_oper_sum_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_non_sls_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_asst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stk_bp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_non_transit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_non_mov_lab.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_wg_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_lot_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sublot_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno1_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno2_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno3_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_sno4_non_mov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_tmp_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_tmp_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_act_trd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_chk_mst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_stktk_sum_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_oth_ccn_sum_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_std_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_amt_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_unit_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_rate_disp_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_excel_pln_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_excel_act_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_excel_alc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Base_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Base_check.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_CoParmReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_amt_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ave_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_adj_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_adj_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mrgn_expns_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_expns_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_out_expns_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_out_expns_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_inpt_expns_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ss_expns_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prov_expns_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_lvl.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pre_alc_max_rec.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_diff_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_use_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_calc_ctg_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_fix_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_ratio_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stop_slip_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_non_prod_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_oper_sum_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_non_sls_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_bp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_non_transit_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_non_mov_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_tmp_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_act_trd_calc_ctg_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chk_mst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stktk_sum_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_oth_ccn_sum_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_amt_disp_digit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_disp_digit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_disp_digit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rate_disp_digit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_excel_pln_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_excel_act_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_excel_alc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_CoParmReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_CoParmReg p){

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
		MABGP_CoParmReg_MC.setTableConfigDtl((MABGP_CoParmReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_CoParmReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0010.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_co_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.co_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_cd);
		p.columnDtl_std_rnd_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.std_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_rnd_typ);
		p.columnDtl_std_rnd_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.std_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_rnd_typ_nm);
		p.columnDtl_std_dec_place.setMeta(mcframe.clientMABG.MABGP0010.DtlR.std_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_dec_place);
		p.columnDtl_amt_rnd_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_rnd_typ);
		p.columnDtl_amt_rnd_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.amt_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_rnd_typ_nm);
		p.columnDtl_amt_dec_place.setMeta(mcframe.clientMABG.MABGP0010.DtlR.amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_dec_place);
		p.columnDtl_ave_rnd_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ave_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ave_rnd_typ);
		p.columnDtl_ave_rnd_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ave_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ave_rnd_typ_nm);
		p.columnDtl_ave_dec_place.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ave_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ave_dec_place);
		p.columnDtl_adj_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.adj_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_adj_typ);
		p.columnDtl_adj_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.adj_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_adj_typ_nm);
		p.columnDtl_mrgn_expns_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.mrgn_expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrgn_expns_cd);
		p.columnDtl_mrgn_expns_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.mrgn_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrgn_expns_nm);
		p.columnDtl_purc_expns_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.purc_expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_expns_cd);
		p.columnDtl_purc_expns_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.purc_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_expns_nm);
		p.columnDtl_out_expns_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.out_expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_out_expns_cd);
		p.columnDtl_out_expns_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.out_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_out_expns_nm);
		p.columnDtl_inpt_expns_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.inpt_expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_expns_cd);
		p.columnDtl_inpt_expns_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.inpt_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_expns_nm);
		p.columnDtl_ss_expns_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ss_expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ss_expns_cd);
		p.columnDtl_ss_expns_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ss_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ss_expns_nm);
		p.columnDtl_prov_expns_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.prov_expns_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_expns_cd);
		p.columnDtl_prov_expns_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.prov_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_expns_nm);
		p.columnDtl_pre_alc_max_lvl.setMeta(mcframe.clientMABG.MABGP0010.DtlR.pre_alc_max_lvl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_max_lvl);
		p.columnDtl_pre_alc_max_rec.setMeta(mcframe.clientMABG.MABGP0010.DtlR.pre_alc_max_rec_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_max_rec);
		p.columnDtl_diff_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.diff_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_diff_use_typ);
		p.columnDtl_diff_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.diff_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_diff_use_typ_nm);
		p.columnDtl_lot_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.lot_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_use_typ);
		p.columnDtl_lot_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.lot_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_use_typ_nm);
		p.columnDtl_sublot_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sublot_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_use_typ);
		p.columnDtl_sublot_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sublot_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_use_typ_nm);
		p.columnDtl_sno1_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno1_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_use_typ);
		p.columnDtl_sno1_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno1_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_use_typ_nm);
		p.columnDtl_sno2_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno2_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_use_typ);
		p.columnDtl_sno2_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno2_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_use_typ_nm);
		p.columnDtl_sno3_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno3_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_use_typ);
		p.columnDtl_sno3_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno3_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_use_typ_nm);
		p.columnDtl_sno4_use_typ.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno4_use_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_use_typ);
		p.columnDtl_sno4_use_typ_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno4_use_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_use_typ_nm);
		p.columnDtl_def_calc_ctg_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.def_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_calc_ctg_cd);
		p.columnDtl_def_calc_ctg_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.def_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_calc_ctg_nm);
		p.columnDtl_fix_dpt_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.fix_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_dpt_cd);
		p.columnDtl_fix_dpt_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.fix_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_dpt_nm);
		p.columnDtl_trd_ratio_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.trd_ratio_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ratio_flg);
		p.columnDtl_stop_slip_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.stop_slip_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stop_slip_flg);
		p.columnDtl_non_prod_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.non_prod_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_prod_flg);
		p.columnDtl_oper_sum_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.oper_sum_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_sum_flg);
		p.columnDtl_non_sls_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.non_sls_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_sls_flg);
		p.columnDtl_asst_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.asst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_flg);
		p.columnDtl_stk_bp_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.stk_bp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_bp_flg);
		p.columnDtl_non_transit_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.non_transit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_transit_flg);
		p.columnDtl_wg_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.wg_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_non_mov_flg);
		p.columnDtl_lot_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.lot_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_non_mov_flg);
		p.columnDtl_sublot_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sublot_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_non_mov_flg);
		p.columnDtl_sno1_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno1_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_non_mov_flg);
		p.columnDtl_sno2_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno2_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_non_mov_flg);
		p.columnDtl_sno3_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno3_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_non_mov_flg);
		p.columnDtl_sno4_non_mov_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.sno4_non_mov_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_non_mov_flg);
		p.columnDtl_tmp_dpt_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.tmp_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tmp_dpt_cd);
		p.columnDtl_tmp_dpt_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.tmp_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tmp_dpt_nm);
		p.columnDtl_act_trd_calc_ctg_cd.setMeta(mcframe.clientMABG.MABGP0010.DtlR.act_trd_calc_ctg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_trd_calc_ctg_cd);
		p.columnDtl_act_trd_calc_ctg_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.act_trd_calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_trd_calc_ctg_nm);
		p.columnDtl_chk_mst_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.chk_mst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chk_mst_flg);
		p.columnDtl_stktk_sum_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.stktk_sum_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stktk_sum_flg);
		p.columnDtl_oth_ccn_sum_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.oth_ccn_sum_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oth_ccn_sum_flg);
		p.columnDtl_amt_disp_digit.setMeta(mcframe.clientMABG.MABGP0010.DtlR.amt_disp_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_disp_digit);
		p.columnDtl_unit_disp_digit.setMeta(mcframe.clientMABG.MABGP0010.DtlR.unit_disp_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_disp_digit);
		p.columnDtl_std_disp_digit.setMeta(mcframe.clientMABG.MABGP0010.DtlR.std_disp_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_disp_digit);
		p.columnDtl_rate_disp_digit.setMeta(mcframe.clientMABG.MABGP0010.DtlR.rate_disp_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rate_disp_digit);
		p.columnDtl_excel_pln_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.excel_pln_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_excel_pln_flg);
		p.columnDtl_excel_act_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.excel_act_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_excel_act_flg);
		p.columnDtl_excel_alc_flg.setMeta(mcframe.clientMABG.MABGP0010.DtlR.excel_alc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_excel_alc_flg);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0010.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Base_std_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_std_rnd_typ.getListConfig().setPutter(getBase_std_rnd_typ_ListPutter());
		Base_amt_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_amt_rnd_typ.getListConfig().setPutter(getBase_amt_rnd_typ_ListPutter());
		Base_ave_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_ave_rnd_typ.getListConfig().setPutter(getBase_ave_rnd_typ_ListPutter());
		Base_adj_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_adj_typ.getListConfig().setPutter(getBase_adj_typ_ListPutter());
		Base_mrgn_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_mrgn_expns_cd.getListConfig().setPutter(getBase_mrgn_expns_cd_ListPutter());
		Base_purc_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_purc_expns_cd.getListConfig().setPutter(getBase_purc_expns_cd_ListPutter());
		Base_out_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_out_expns_cd.getListConfig().setPutter(getBase_out_expns_cd_ListPutter());
		Base_inpt_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_inpt_expns_cd.getListConfig().setPutter(getBase_inpt_expns_cd_ListPutter());
		Base_ss_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_ss_expns_cd.getListConfig().setPutter(getBase_ss_expns_cd_ListPutter());
		Base_prov_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_prov_expns_cd.getListConfig().setPutter(getBase_prov_expns_cd_ListPutter());
		Base_diff_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_diff_use_typ.getListConfig().setPutter(getBase_diff_use_typ_ListPutter());
		Base_lot_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_lot_use_typ.getListConfig().setPutter(getBase_lot_use_typ_ListPutter());
		Base_sublot_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sublot_use_typ.getListConfig().setPutter(getBase_sublot_use_typ_ListPutter());
		Base_sno1_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sno1_use_typ.getListConfig().setPutter(getBase_sno1_use_typ_ListPutter());
		Base_sno2_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sno2_use_typ.getListConfig().setPutter(getBase_sno2_use_typ_ListPutter());
		Base_sno3_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sno3_use_typ.getListConfig().setPutter(getBase_sno3_use_typ_ListPutter());
		Base_sno4_use_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_sno4_use_typ.getListConfig().setPutter(getBase_sno4_use_typ_ListPutter());
		Base_def_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_def_calc_ctg_cd.getListConfig().setPutter(getBase_def_calc_ctg_cd_ListPutter());
		Base_fix_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_fix_dpt_cd.getListConfig().setPutter(getBase_fix_dpt_cd_ListPutter());
		Base_tmp_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_tmp_dpt_cd.getListConfig().setPutter(getBase_tmp_dpt_cd_ListPutter());
		Base_act_trd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Base_act_trd_calc_ctg_cd.getListConfig().setPutter(getBase_act_trd_calc_ctg_cd_ListPutter());
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
	 * [Base_std_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_std_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_amt_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_amt_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_ave_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_ave_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Base_adj_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_adj_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AdjTyp");
		return lp;
	}
	 
	/**
	 * [Base_mrgn_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_mrgn_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Base_purc_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_purc_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Base_out_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_out_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Base_inpt_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_inpt_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Base_ss_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_ss_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Base_prov_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_prov_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Base_diff_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_diff_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DiffUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_lot_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_lot_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PsUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_sublot_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sublot_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PsUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_sno1_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sno1_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PsUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_sno2_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sno2_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PsUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_sno3_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sno3_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PsUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_sno4_use_typ_ListPutter]の作成
	 */
	protected MCListPutter createBase_sno4_use_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PsUseTyp");
		return lp;
	}
	 
	/**
	 * [Base_def_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_def_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Base_fix_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_fix_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Base_tmp_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_tmp_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Base_act_trd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createBase_act_trd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Base_std_rnd_typ) return getBase_std_rnd_typ(row, info);
		if(combo == Base_amt_rnd_typ) return getBase_amt_rnd_typ(row, info);
		if(combo == Base_ave_rnd_typ) return getBase_ave_rnd_typ(row, info);
		if(combo == Base_adj_typ) return getBase_adj_typ(row, info);
		if(combo == Base_mrgn_expns_cd) return getBase_mrgn_expns_cd(row, info);
		if(combo == Base_purc_expns_cd) return getBase_purc_expns_cd(row, info);
		if(combo == Base_out_expns_cd) return getBase_out_expns_cd(row, info);
		if(combo == Base_inpt_expns_cd) return getBase_inpt_expns_cd(row, info);
		if(combo == Base_ss_expns_cd) return getBase_ss_expns_cd(row, info);
		if(combo == Base_prov_expns_cd) return getBase_prov_expns_cd(row, info);
		if(combo == Base_diff_use_typ) return getBase_diff_use_typ(row, info);
		if(combo == Base_lot_use_typ) return getBase_lot_use_typ(row, info);
		if(combo == Base_sublot_use_typ) return getBase_sublot_use_typ(row, info);
		if(combo == Base_sno1_use_typ) return getBase_sno1_use_typ(row, info);
		if(combo == Base_sno2_use_typ) return getBase_sno2_use_typ(row, info);
		if(combo == Base_sno3_use_typ) return getBase_sno3_use_typ(row, info);
		if(combo == Base_sno4_use_typ) return getBase_sno4_use_typ(row, info);
		if(combo == Base_def_calc_ctg_cd) return getBase_def_calc_ctg_cd(row, info);
		if(combo == Base_fix_dpt_cd) return getBase_fix_dpt_cd(row, info);
		if(combo == Base_tmp_dpt_cd) return getBase_tmp_dpt_cd(row, info);
		if(combo == Base_act_trd_calc_ctg_cd) return getBase_act_trd_calc_ctg_cd(row, info);
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
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
		if (vc == TabTab) return doTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_co_cd) return doCnd_co_cd_VC(info);
		if (vc == Cnd_co_nm) return doCnd_co_nm_VC(info);
		if (vc == Base_std_rnd_typ) return doBase_std_rnd_typ_VC(info);
		if (vc == Base_std_rnd_typ_nm) return doBase_std_rnd_typ_nm_VC(info);
		if (vc == Base_std_dec_place) return doBase_std_dec_place_VC(info);
		if (vc == Base_amt_rnd_typ) return doBase_amt_rnd_typ_VC(info);
		if (vc == Base_amt_rnd_typ_nm) return doBase_amt_rnd_typ_nm_VC(info);
		if (vc == Base_amt_dec_place) return doBase_amt_dec_place_VC(info);
		if (vc == Base_ave_rnd_typ) return doBase_ave_rnd_typ_VC(info);
		if (vc == Base_ave_rnd_typ_nm) return doBase_ave_rnd_typ_nm_VC(info);
		if (vc == Base_ave_dec_place) return doBase_ave_dec_place_VC(info);
		if (vc == Base_adj_typ) return doBase_adj_typ_VC(info);
		if (vc == Base_adj_typ_nm) return doBase_adj_typ_nm_VC(info);
		if (vc == Base_mrgn_expns_cd) return doBase_mrgn_expns_cd_VC(info);
		if (vc == Base_mrgn_expns_nm) return doBase_mrgn_expns_nm_VC(info);
		if (vc == Base_purc_expns_cd) return doBase_purc_expns_cd_VC(info);
		if (vc == Base_purc_expns_nm) return doBase_purc_expns_nm_VC(info);
		if (vc == Base_out_expns_cd) return doBase_out_expns_cd_VC(info);
		if (vc == Base_out_expns_nm) return doBase_out_expns_nm_VC(info);
		if (vc == Base_inpt_expns_cd) return doBase_inpt_expns_cd_VC(info);
		if (vc == Base_inpt_expns_nm) return doBase_inpt_expns_nm_VC(info);
		if (vc == Base_ss_expns_cd) return doBase_ss_expns_cd_VC(info);
		if (vc == Base_ss_expns_nm) return doBase_ss_expns_nm_VC(info);
		if (vc == Base_prov_expns_cd) return doBase_prov_expns_cd_VC(info);
		if (vc == Base_prov_expns_nm) return doBase_prov_expns_nm_VC(info);
		if (vc == Base_pre_alc_max_lvl) return doBase_pre_alc_max_lvl_VC(info);
		if (vc == Base_pre_alc_max_rec) return doBase_pre_alc_max_rec_VC(info);
		if (vc == Base_diff_use_typ) return doBase_diff_use_typ_VC(info);
		if (vc == Base_diff_use_typ_nm) return doBase_diff_use_typ_nm_VC(info);
		if (vc == Base_lot_use_typ) return doBase_lot_use_typ_VC(info);
		if (vc == Base_lot_use_typ_nm) return doBase_lot_use_typ_nm_VC(info);
		if (vc == Base_sublot_use_typ) return doBase_sublot_use_typ_VC(info);
		if (vc == Base_sublot_use_typ_nm) return doBase_sublot_use_typ_nm_VC(info);
		if (vc == Base_sno1_use_typ) return doBase_sno1_use_typ_VC(info);
		if (vc == Base_sno1_use_typ_nm) return doBase_sno1_use_typ_nm_VC(info);
		if (vc == Base_sno2_use_typ) return doBase_sno2_use_typ_VC(info);
		if (vc == Base_sno2_use_typ_nm) return doBase_sno2_use_typ_nm_VC(info);
		if (vc == Base_sno3_use_typ) return doBase_sno3_use_typ_VC(info);
		if (vc == Base_sno3_use_typ_nm) return doBase_sno3_use_typ_nm_VC(info);
		if (vc == Base_sno4_use_typ) return doBase_sno4_use_typ_VC(info);
		if (vc == Base_sno4_use_typ_nm) return doBase_sno4_use_typ_nm_VC(info);
		if (vc == Base_def_calc_ctg_cd) return doBase_def_calc_ctg_cd_VC(info);
		if (vc == Base_def_calc_ctg_nm) return doBase_def_calc_ctg_nm_VC(info);
		if (vc == Base_fix_dpt_cd) return doBase_fix_dpt_cd_VC(info);
		if (vc == Base_fix_dpt_nm) return doBase_fix_dpt_nm_VC(info);
		if (vc == Base_trd_ratio_flg) return doBase_trd_ratio_flg_VC(info);
		if (vc == Base_stop_slip_flg) return doBase_stop_slip_flg_VC(info);
		if (vc == Base_non_prod_flg) return doBase_non_prod_flg_VC(info);
		if (vc == Base_oper_sum_flg) return doBase_oper_sum_flg_VC(info);
		if (vc == Base_non_sls_flg) return doBase_non_sls_flg_VC(info);
		if (vc == Base_asst_flg) return doBase_asst_flg_VC(info);
		if (vc == Base_stk_bp_flg) return doBase_stk_bp_flg_VC(info);
		if (vc == Base_non_transit_flg) return doBase_non_transit_flg_VC(info);
		if (vc == Base_wg_non_mov_flg) return doBase_wg_non_mov_flg_VC(info);
		if (vc == Base_lot_non_mov_flg) return doBase_lot_non_mov_flg_VC(info);
		if (vc == Base_sublot_non_mov_flg) return doBase_sublot_non_mov_flg_VC(info);
		if (vc == Base_sno1_non_mov_flg) return doBase_sno1_non_mov_flg_VC(info);
		if (vc == Base_sno2_non_mov_flg) return doBase_sno2_non_mov_flg_VC(info);
		if (vc == Base_sno3_non_mov_flg) return doBase_sno3_non_mov_flg_VC(info);
		if (vc == Base_sno4_non_mov_flg) return doBase_sno4_non_mov_flg_VC(info);
		if (vc == Base_tmp_dpt_cd) return doBase_tmp_dpt_cd_VC(info);
		if (vc == Base_tmp_dpt_nm) return doBase_tmp_dpt_nm_VC(info);
		if (vc == Base_act_trd_calc_ctg_cd) return doBase_act_trd_calc_ctg_cd_VC(info);
		if (vc == Base_act_trd_calc_ctg_nm) return doBase_act_trd_calc_ctg_nm_VC(info);
		if (vc == Base_chk_mst_flg) return doBase_chk_mst_flg_VC(info);
		if (vc == Base_stktk_sum_flg) return doBase_stktk_sum_flg_VC(info);
		if (vc == Base_oth_ccn_sum_flg) return doBase_oth_ccn_sum_flg_VC(info);
		if (vc == Base_std_disp_digit) return doBase_std_disp_digit_VC(info);
		if (vc == Base_amt_disp_digit) return doBase_amt_disp_digit_VC(info);
		if (vc == Base_unit_disp_digit) return doBase_unit_disp_digit_VC(info);
		if (vc == Base_rate_disp_digit) return doBase_rate_disp_digit_VC(info);
		if (vc == Base_excel_pln_flg) return doBase_excel_pln_flg_VC(info);
		if (vc == Base_excel_act_flg) return doBase_excel_act_flg_VC(info);
		if (vc == Base_excel_alc_flg) return doBase_excel_alc_flg_VC(info);
		if (vc == Base_ins_usr_id) return doBase_ins_usr_id_VC(info);
		if (vc == Base_ins_usr_nm) return doBase_ins_usr_nm_VC(info);
		if (vc == Base_ins_func_id) return doBase_ins_func_id_VC(info);
		if (vc == Base_ins_func_nm) return doBase_ins_func_nm_VC(info);
		if (vc == Base_upd_usr_id) return doBase_upd_usr_id_VC(info);
		if (vc == Base_upd_usr_nm) return doBase_upd_usr_nm_VC(info);
		if (vc == Base_upd_func_id) return doBase_upd_func_id_VC(info);
		if (vc == Base_upd_func_nm) return doBase_upd_func_nm_VC(info);
		if (vc == Base_ins_ts) return doBase_ins_ts_VC(info);
		if (vc == Base_upd_ts) return doBase_upd_ts_VC(info);
		if (vc == Base_upd_srv_req_no) return doBase_upd_srv_req_no_VC(info);
		if (vc == Base_upd_cntr) return doBase_upd_cntr_VC(info);
		if (vc == Base_check) return doBase_check_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_co_cd) return doDtl_co_cd_VC(info);
		if (vc == columnDtl_std_rnd_typ) return doDtl_std_rnd_typ_VC(info);
		if (vc == columnDtl_std_rnd_typ_nm) return doDtl_std_rnd_typ_nm_VC(info);
		if (vc == columnDtl_std_dec_place) return doDtl_std_dec_place_VC(info);
		if (vc == columnDtl_amt_rnd_typ) return doDtl_amt_rnd_typ_VC(info);
		if (vc == columnDtl_amt_rnd_typ_nm) return doDtl_amt_rnd_typ_nm_VC(info);
		if (vc == columnDtl_amt_dec_place) return doDtl_amt_dec_place_VC(info);
		if (vc == columnDtl_ave_rnd_typ) return doDtl_ave_rnd_typ_VC(info);
		if (vc == columnDtl_ave_rnd_typ_nm) return doDtl_ave_rnd_typ_nm_VC(info);
		if (vc == columnDtl_ave_dec_place) return doDtl_ave_dec_place_VC(info);
		if (vc == columnDtl_adj_typ) return doDtl_adj_typ_VC(info);
		if (vc == columnDtl_adj_typ_nm) return doDtl_adj_typ_nm_VC(info);
		if (vc == columnDtl_mrgn_expns_cd) return doDtl_mrgn_expns_cd_VC(info);
		if (vc == columnDtl_mrgn_expns_nm) return doDtl_mrgn_expns_nm_VC(info);
		if (vc == columnDtl_purc_expns_cd) return doDtl_purc_expns_cd_VC(info);
		if (vc == columnDtl_purc_expns_nm) return doDtl_purc_expns_nm_VC(info);
		if (vc == columnDtl_out_expns_cd) return doDtl_out_expns_cd_VC(info);
		if (vc == columnDtl_out_expns_nm) return doDtl_out_expns_nm_VC(info);
		if (vc == columnDtl_inpt_expns_cd) return doDtl_inpt_expns_cd_VC(info);
		if (vc == columnDtl_inpt_expns_nm) return doDtl_inpt_expns_nm_VC(info);
		if (vc == columnDtl_ss_expns_cd) return doDtl_ss_expns_cd_VC(info);
		if (vc == columnDtl_ss_expns_nm) return doDtl_ss_expns_nm_VC(info);
		if (vc == columnDtl_prov_expns_cd) return doDtl_prov_expns_cd_VC(info);
		if (vc == columnDtl_prov_expns_nm) return doDtl_prov_expns_nm_VC(info);
		if (vc == columnDtl_pre_alc_max_lvl) return doDtl_pre_alc_max_lvl_VC(info);
		if (vc == columnDtl_pre_alc_max_rec) return doDtl_pre_alc_max_rec_VC(info);
		if (vc == columnDtl_diff_use_typ) return doDtl_diff_use_typ_VC(info);
		if (vc == columnDtl_diff_use_typ_nm) return doDtl_diff_use_typ_nm_VC(info);
		if (vc == columnDtl_lot_use_typ) return doDtl_lot_use_typ_VC(info);
		if (vc == columnDtl_lot_use_typ_nm) return doDtl_lot_use_typ_nm_VC(info);
		if (vc == columnDtl_sublot_use_typ) return doDtl_sublot_use_typ_VC(info);
		if (vc == columnDtl_sublot_use_typ_nm) return doDtl_sublot_use_typ_nm_VC(info);
		if (vc == columnDtl_sno1_use_typ) return doDtl_sno1_use_typ_VC(info);
		if (vc == columnDtl_sno1_use_typ_nm) return doDtl_sno1_use_typ_nm_VC(info);
		if (vc == columnDtl_sno2_use_typ) return doDtl_sno2_use_typ_VC(info);
		if (vc == columnDtl_sno2_use_typ_nm) return doDtl_sno2_use_typ_nm_VC(info);
		if (vc == columnDtl_sno3_use_typ) return doDtl_sno3_use_typ_VC(info);
		if (vc == columnDtl_sno3_use_typ_nm) return doDtl_sno3_use_typ_nm_VC(info);
		if (vc == columnDtl_sno4_use_typ) return doDtl_sno4_use_typ_VC(info);
		if (vc == columnDtl_sno4_use_typ_nm) return doDtl_sno4_use_typ_nm_VC(info);
		if (vc == columnDtl_def_calc_ctg_cd) return doDtl_def_calc_ctg_cd_VC(info);
		if (vc == columnDtl_def_calc_ctg_nm) return doDtl_def_calc_ctg_nm_VC(info);
		if (vc == columnDtl_fix_dpt_cd) return doDtl_fix_dpt_cd_VC(info);
		if (vc == columnDtl_fix_dpt_nm) return doDtl_fix_dpt_nm_VC(info);
		if (vc == columnDtl_trd_ratio_flg) return doDtl_trd_ratio_flg_VC(info);
		if (vc == columnDtl_stop_slip_flg) return doDtl_stop_slip_flg_VC(info);
		if (vc == columnDtl_non_prod_flg) return doDtl_non_prod_flg_VC(info);
		if (vc == columnDtl_oper_sum_flg) return doDtl_oper_sum_flg_VC(info);
		if (vc == columnDtl_non_sls_flg) return doDtl_non_sls_flg_VC(info);
		if (vc == columnDtl_asst_flg) return doDtl_asst_flg_VC(info);
		if (vc == columnDtl_stk_bp_flg) return doDtl_stk_bp_flg_VC(info);
		if (vc == columnDtl_non_transit_flg) return doDtl_non_transit_flg_VC(info);
		if (vc == columnDtl_wg_non_mov_flg) return doDtl_wg_non_mov_flg_VC(info);
		if (vc == columnDtl_lot_non_mov_flg) return doDtl_lot_non_mov_flg_VC(info);
		if (vc == columnDtl_sublot_non_mov_flg) return doDtl_sublot_non_mov_flg_VC(info);
		if (vc == columnDtl_sno1_non_mov_flg) return doDtl_sno1_non_mov_flg_VC(info);
		if (vc == columnDtl_sno2_non_mov_flg) return doDtl_sno2_non_mov_flg_VC(info);
		if (vc == columnDtl_sno3_non_mov_flg) return doDtl_sno3_non_mov_flg_VC(info);
		if (vc == columnDtl_sno4_non_mov_flg) return doDtl_sno4_non_mov_flg_VC(info);
		if (vc == columnDtl_tmp_dpt_cd) return doDtl_tmp_dpt_cd_VC(info);
		if (vc == columnDtl_tmp_dpt_nm) return doDtl_tmp_dpt_nm_VC(info);
		if (vc == columnDtl_act_trd_calc_ctg_cd) return doDtl_act_trd_calc_ctg_cd_VC(info);
		if (vc == columnDtl_act_trd_calc_ctg_nm) return doDtl_act_trd_calc_ctg_nm_VC(info);
		if (vc == columnDtl_chk_mst_flg) return doDtl_chk_mst_flg_VC(info);
		if (vc == columnDtl_stktk_sum_flg) return doDtl_stktk_sum_flg_VC(info);
		if (vc == columnDtl_oth_ccn_sum_flg) return doDtl_oth_ccn_sum_flg_VC(info);
		if (vc == columnDtl_amt_disp_digit) return doDtl_amt_disp_digit_VC(info);
		if (vc == columnDtl_unit_disp_digit) return doDtl_unit_disp_digit_VC(info);
		if (vc == columnDtl_std_disp_digit) return doDtl_std_disp_digit_VC(info);
		if (vc == columnDtl_rate_disp_digit) return doDtl_rate_disp_digit_VC(info);
		if (vc == columnDtl_excel_pln_flg) return doDtl_excel_pln_flg_VC(info);
		if (vc == columnDtl_excel_act_flg) return doDtl_excel_act_flg_VC(info);
		if (vc == columnDtl_excel_alc_flg) return doDtl_excel_alc_flg_VC(info);
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
		return true;
	}

	/**
	 * [Tab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[co_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_co_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[amt_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_amt_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ave_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ave_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ave_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ave_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ave_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ave_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[adj_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_adj_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[adj_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_adj_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mrgn_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mrgn_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[mrgn_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_mrgn_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[purc_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_purc_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[out_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_out_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[out_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_out_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[inpt_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_inpt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[inpt_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_inpt_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ss_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ss_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ss_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ss_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[prov_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_prov_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[prov_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_prov_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pre_alc_max_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pre_alc_max_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[pre_alc_max_rec]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_pre_alc_max_rec_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[diff_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_diff_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[diff_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_diff_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[lot_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_lot_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[lot_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_lot_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sublot_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sublot_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sublot_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sublot_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno1_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno1_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno1_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno1_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno2_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno2_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno2_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno2_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno3_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno3_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno3_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno3_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno4_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno4_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno4_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno4_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[def_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_def_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[def_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_def_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[fix_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_fix_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[fix_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_fix_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[trd_ratio_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_trd_ratio_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stop_slip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stop_slip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[non_prod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_non_prod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[oper_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_oper_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[non_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_non_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_asst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stk_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stk_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[non_transit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_non_transit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[wg_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_wg_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[lot_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_lot_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sublot_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sublot_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno1_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno1_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno2_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno2_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno3_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno3_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[sno4_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_sno4_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[tmp_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_tmp_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[tmp_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_tmp_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_act_trd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_act_trd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[chk_mst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_chk_mst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[stktk_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_stktk_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[oth_ccn_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_oth_ccn_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[std_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_std_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[amt_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_amt_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[unit_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_unit_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[rate_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_rate_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[excel_pln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_excel_pln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[excel_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_excel_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[excel_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_excel_alc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Base]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBase_check_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ave_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ave_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ave_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[adj_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_adj_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_adj_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrgn_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrgn_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_out_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_out_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ss_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ss_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_max_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_rec]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_max_rec_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[diff_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_diff_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[diff_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_diff_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_use_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_use_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ratio_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ratio_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stop_slip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stop_slip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_prod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_prod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_transit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_transit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_non_mov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_non_mov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tmp_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tmp_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_trd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_trd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chk_mst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chk_mst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stktk_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stktk_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oth_ccn_sum_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oth_ccn_sum_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rate_disp_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rate_disp_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[excel_pln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_excel_pln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[excel_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_excel_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[excel_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_excel_alc_flg_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == TabTab) doTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_co_cd) doCnd_co_cd_NC(info);
		else if (nc == Cnd_co_nm) doCnd_co_nm_NC(info);
		else if (nc == Base_std_rnd_typ) doBase_std_rnd_typ_NC(info);
		else if (nc == Base_std_rnd_typ_nm) doBase_std_rnd_typ_nm_NC(info);
		else if (nc == Base_std_dec_place) doBase_std_dec_place_NC(info);
		else if (nc == Base_amt_rnd_typ) doBase_amt_rnd_typ_NC(info);
		else if (nc == Base_amt_rnd_typ_nm) doBase_amt_rnd_typ_nm_NC(info);
		else if (nc == Base_amt_dec_place) doBase_amt_dec_place_NC(info);
		else if (nc == Base_ave_rnd_typ) doBase_ave_rnd_typ_NC(info);
		else if (nc == Base_ave_rnd_typ_nm) doBase_ave_rnd_typ_nm_NC(info);
		else if (nc == Base_ave_dec_place) doBase_ave_dec_place_NC(info);
		else if (nc == Base_adj_typ) doBase_adj_typ_NC(info);
		else if (nc == Base_adj_typ_nm) doBase_adj_typ_nm_NC(info);
		else if (nc == Base_mrgn_expns_cd) doBase_mrgn_expns_cd_NC(info);
		else if (nc == Base_mrgn_expns_nm) doBase_mrgn_expns_nm_NC(info);
		else if (nc == Base_purc_expns_cd) doBase_purc_expns_cd_NC(info);
		else if (nc == Base_purc_expns_nm) doBase_purc_expns_nm_NC(info);
		else if (nc == Base_out_expns_cd) doBase_out_expns_cd_NC(info);
		else if (nc == Base_out_expns_nm) doBase_out_expns_nm_NC(info);
		else if (nc == Base_inpt_expns_cd) doBase_inpt_expns_cd_NC(info);
		else if (nc == Base_inpt_expns_nm) doBase_inpt_expns_nm_NC(info);
		else if (nc == Base_ss_expns_cd) doBase_ss_expns_cd_NC(info);
		else if (nc == Base_ss_expns_nm) doBase_ss_expns_nm_NC(info);
		else if (nc == Base_prov_expns_cd) doBase_prov_expns_cd_NC(info);
		else if (nc == Base_prov_expns_nm) doBase_prov_expns_nm_NC(info);
		else if (nc == Base_pre_alc_max_lvl) doBase_pre_alc_max_lvl_NC(info);
		else if (nc == Base_pre_alc_max_rec) doBase_pre_alc_max_rec_NC(info);
		else if (nc == Base_diff_use_typ) doBase_diff_use_typ_NC(info);
		else if (nc == Base_diff_use_typ_nm) doBase_diff_use_typ_nm_NC(info);
		else if (nc == Base_lot_use_typ) doBase_lot_use_typ_NC(info);
		else if (nc == Base_lot_use_typ_nm) doBase_lot_use_typ_nm_NC(info);
		else if (nc == Base_sublot_use_typ) doBase_sublot_use_typ_NC(info);
		else if (nc == Base_sublot_use_typ_nm) doBase_sublot_use_typ_nm_NC(info);
		else if (nc == Base_sno1_use_typ) doBase_sno1_use_typ_NC(info);
		else if (nc == Base_sno1_use_typ_nm) doBase_sno1_use_typ_nm_NC(info);
		else if (nc == Base_sno2_use_typ) doBase_sno2_use_typ_NC(info);
		else if (nc == Base_sno2_use_typ_nm) doBase_sno2_use_typ_nm_NC(info);
		else if (nc == Base_sno3_use_typ) doBase_sno3_use_typ_NC(info);
		else if (nc == Base_sno3_use_typ_nm) doBase_sno3_use_typ_nm_NC(info);
		else if (nc == Base_sno4_use_typ) doBase_sno4_use_typ_NC(info);
		else if (nc == Base_sno4_use_typ_nm) doBase_sno4_use_typ_nm_NC(info);
		else if (nc == Base_def_calc_ctg_cd) doBase_def_calc_ctg_cd_NC(info);
		else if (nc == Base_def_calc_ctg_nm) doBase_def_calc_ctg_nm_NC(info);
		else if (nc == Base_fix_dpt_cd) doBase_fix_dpt_cd_NC(info);
		else if (nc == Base_fix_dpt_nm) doBase_fix_dpt_nm_NC(info);
		else if (nc == Base_trd_ratio_flg) doBase_trd_ratio_flg_NC(info);
		else if (nc == Base_stop_slip_flg) doBase_stop_slip_flg_NC(info);
		else if (nc == Base_non_prod_flg) doBase_non_prod_flg_NC(info);
		else if (nc == Base_oper_sum_flg) doBase_oper_sum_flg_NC(info);
		else if (nc == Base_non_sls_flg) doBase_non_sls_flg_NC(info);
		else if (nc == Base_asst_flg) doBase_asst_flg_NC(info);
		else if (nc == Base_stk_bp_flg) doBase_stk_bp_flg_NC(info);
		else if (nc == Base_non_transit_flg) doBase_non_transit_flg_NC(info);
		else if (nc == Base_wg_non_mov_flg) doBase_wg_non_mov_flg_NC(info);
		else if (nc == Base_lot_non_mov_flg) doBase_lot_non_mov_flg_NC(info);
		else if (nc == Base_sublot_non_mov_flg) doBase_sublot_non_mov_flg_NC(info);
		else if (nc == Base_sno1_non_mov_flg) doBase_sno1_non_mov_flg_NC(info);
		else if (nc == Base_sno2_non_mov_flg) doBase_sno2_non_mov_flg_NC(info);
		else if (nc == Base_sno3_non_mov_flg) doBase_sno3_non_mov_flg_NC(info);
		else if (nc == Base_sno4_non_mov_flg) doBase_sno4_non_mov_flg_NC(info);
		else if (nc == Base_tmp_dpt_cd) doBase_tmp_dpt_cd_NC(info);
		else if (nc == Base_tmp_dpt_nm) doBase_tmp_dpt_nm_NC(info);
		else if (nc == Base_act_trd_calc_ctg_cd) doBase_act_trd_calc_ctg_cd_NC(info);
		else if (nc == Base_act_trd_calc_ctg_nm) doBase_act_trd_calc_ctg_nm_NC(info);
		else if (nc == Base_chk_mst_flg) doBase_chk_mst_flg_NC(info);
		else if (nc == Base_stktk_sum_flg) doBase_stktk_sum_flg_NC(info);
		else if (nc == Base_oth_ccn_sum_flg) doBase_oth_ccn_sum_flg_NC(info);
		else if (nc == Base_std_disp_digit) doBase_std_disp_digit_NC(info);
		else if (nc == Base_amt_disp_digit) doBase_amt_disp_digit_NC(info);
		else if (nc == Base_unit_disp_digit) doBase_unit_disp_digit_NC(info);
		else if (nc == Base_rate_disp_digit) doBase_rate_disp_digit_NC(info);
		else if (nc == Base_excel_pln_flg) doBase_excel_pln_flg_NC(info);
		else if (nc == Base_excel_act_flg) doBase_excel_act_flg_NC(info);
		else if (nc == Base_excel_alc_flg) doBase_excel_alc_flg_NC(info);
		else if (nc == Base_ins_usr_id) doBase_ins_usr_id_NC(info);
		else if (nc == Base_ins_usr_nm) doBase_ins_usr_nm_NC(info);
		else if (nc == Base_ins_func_id) doBase_ins_func_id_NC(info);
		else if (nc == Base_ins_func_nm) doBase_ins_func_nm_NC(info);
		else if (nc == Base_upd_usr_id) doBase_upd_usr_id_NC(info);
		else if (nc == Base_upd_usr_nm) doBase_upd_usr_nm_NC(info);
		else if (nc == Base_upd_func_id) doBase_upd_func_id_NC(info);
		else if (nc == Base_upd_func_nm) doBase_upd_func_nm_NC(info);
		else if (nc == Base_ins_ts) doBase_ins_ts_NC(info);
		else if (nc == Base_upd_ts) doBase_upd_ts_NC(info);
		else if (nc == Base_upd_srv_req_no) doBase_upd_srv_req_no_NC(info);
		else if (nc == Base_upd_cntr) doBase_upd_cntr_NC(info);
		else if (nc == Base_check) doBase_check_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_co_cd) doDtl_co_cd_NC(info);
		else if (nc == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NC(info);
		else if (nc == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_std_dec_place) doDtl_std_dec_place_NC(info);
		else if (nc == columnDtl_amt_rnd_typ) doDtl_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_amt_rnd_typ_nm) doDtl_amt_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_amt_dec_place) doDtl_amt_dec_place_NC(info);
		else if (nc == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_NC(info);
		else if (nc == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_ave_dec_place) doDtl_ave_dec_place_NC(info);
		else if (nc == columnDtl_adj_typ) doDtl_adj_typ_NC(info);
		else if (nc == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_NC(info);
		else if (nc == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_NC(info);
		else if (nc == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_NC(info);
		else if (nc == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_NC(info);
		else if (nc == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_NC(info);
		else if (nc == columnDtl_out_expns_cd) doDtl_out_expns_cd_NC(info);
		else if (nc == columnDtl_out_expns_nm) doDtl_out_expns_nm_NC(info);
		else if (nc == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_NC(info);
		else if (nc == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_NC(info);
		else if (nc == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_NC(info);
		else if (nc == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_NC(info);
		else if (nc == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_NC(info);
		else if (nc == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_NC(info);
		else if (nc == columnDtl_pre_alc_max_lvl) doDtl_pre_alc_max_lvl_NC(info);
		else if (nc == columnDtl_pre_alc_max_rec) doDtl_pre_alc_max_rec_NC(info);
		else if (nc == columnDtl_diff_use_typ) doDtl_diff_use_typ_NC(info);
		else if (nc == columnDtl_diff_use_typ_nm) doDtl_diff_use_typ_nm_NC(info);
		else if (nc == columnDtl_lot_use_typ) doDtl_lot_use_typ_NC(info);
		else if (nc == columnDtl_lot_use_typ_nm) doDtl_lot_use_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_use_typ) doDtl_sublot_use_typ_NC(info);
		else if (nc == columnDtl_sublot_use_typ_nm) doDtl_sublot_use_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_use_typ) doDtl_sno1_use_typ_NC(info);
		else if (nc == columnDtl_sno1_use_typ_nm) doDtl_sno1_use_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_use_typ) doDtl_sno2_use_typ_NC(info);
		else if (nc == columnDtl_sno2_use_typ_nm) doDtl_sno2_use_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_use_typ) doDtl_sno3_use_typ_NC(info);
		else if (nc == columnDtl_sno3_use_typ_nm) doDtl_sno3_use_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_use_typ) doDtl_sno4_use_typ_NC(info);
		else if (nc == columnDtl_sno4_use_typ_nm) doDtl_sno4_use_typ_nm_NC(info);
		else if (nc == columnDtl_def_calc_ctg_cd) doDtl_def_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_def_calc_ctg_nm) doDtl_def_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_fix_dpt_cd) doDtl_fix_dpt_cd_NC(info);
		else if (nc == columnDtl_fix_dpt_nm) doDtl_fix_dpt_nm_NC(info);
		else if (nc == columnDtl_trd_ratio_flg) doDtl_trd_ratio_flg_NC(info);
		else if (nc == columnDtl_stop_slip_flg) doDtl_stop_slip_flg_NC(info);
		else if (nc == columnDtl_non_prod_flg) doDtl_non_prod_flg_NC(info);
		else if (nc == columnDtl_oper_sum_flg) doDtl_oper_sum_flg_NC(info);
		else if (nc == columnDtl_non_sls_flg) doDtl_non_sls_flg_NC(info);
		else if (nc == columnDtl_asst_flg) doDtl_asst_flg_NC(info);
		else if (nc == columnDtl_stk_bp_flg) doDtl_stk_bp_flg_NC(info);
		else if (nc == columnDtl_non_transit_flg) doDtl_non_transit_flg_NC(info);
		else if (nc == columnDtl_wg_non_mov_flg) doDtl_wg_non_mov_flg_NC(info);
		else if (nc == columnDtl_lot_non_mov_flg) doDtl_lot_non_mov_flg_NC(info);
		else if (nc == columnDtl_sublot_non_mov_flg) doDtl_sublot_non_mov_flg_NC(info);
		else if (nc == columnDtl_sno1_non_mov_flg) doDtl_sno1_non_mov_flg_NC(info);
		else if (nc == columnDtl_sno2_non_mov_flg) doDtl_sno2_non_mov_flg_NC(info);
		else if (nc == columnDtl_sno3_non_mov_flg) doDtl_sno3_non_mov_flg_NC(info);
		else if (nc == columnDtl_sno4_non_mov_flg) doDtl_sno4_non_mov_flg_NC(info);
		else if (nc == columnDtl_tmp_dpt_cd) doDtl_tmp_dpt_cd_NC(info);
		else if (nc == columnDtl_tmp_dpt_nm) doDtl_tmp_dpt_nm_NC(info);
		else if (nc == columnDtl_act_trd_calc_ctg_cd) doDtl_act_trd_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_act_trd_calc_ctg_nm) doDtl_act_trd_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_chk_mst_flg) doDtl_chk_mst_flg_NC(info);
		else if (nc == columnDtl_stktk_sum_flg) doDtl_stktk_sum_flg_NC(info);
		else if (nc == columnDtl_oth_ccn_sum_flg) doDtl_oth_ccn_sum_flg_NC(info);
		else if (nc == columnDtl_amt_disp_digit) doDtl_amt_disp_digit_NC(info);
		else if (nc == columnDtl_unit_disp_digit) doDtl_unit_disp_digit_NC(info);
		else if (nc == columnDtl_std_disp_digit) doDtl_std_disp_digit_NC(info);
		else if (nc == columnDtl_rate_disp_digit) doDtl_rate_disp_digit_NC(info);
		else if (nc == columnDtl_excel_pln_flg) doDtl_excel_pln_flg_NC(info);
		else if (nc == columnDtl_excel_act_flg) doDtl_excel_act_flg_NC(info);
		else if (nc == columnDtl_excel_alc_flg) doDtl_excel_alc_flg_NC(info);
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
	}

	/**
	 * [Tab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_lvl_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_rec]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_rec_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[trd_ratio_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_trd_ratio_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stop_slip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stop_slip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_prod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_prod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[oper_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_oper_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_transit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_transit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wg_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wg_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[chk_mst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_chk_mst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stktk_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stktk_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[oth_ccn_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_oth_ccn_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[unit_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_unit_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rate_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rate_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_pln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_pln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_alc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_lvl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_rec]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_rec_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ratio_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ratio_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stop_slip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stop_slip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_prod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_prod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_transit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_transit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_non_mov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_non_mov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chk_mst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chk_mst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oth_ccn_sum_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oth_ccn_sum_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_disp_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_disp_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_pln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_pln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_alc_flg_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == TabTab) doTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_co_cd) doCnd_co_cd_NE(info);
		else if (ne == Cnd_co_nm) doCnd_co_nm_NE(info);
		else if (ne == Base_std_rnd_typ) doBase_std_rnd_typ_NE(info);
		else if (ne == Base_std_rnd_typ_nm) doBase_std_rnd_typ_nm_NE(info);
		else if (ne == Base_std_dec_place) doBase_std_dec_place_NE(info);
		else if (ne == Base_amt_rnd_typ) doBase_amt_rnd_typ_NE(info);
		else if (ne == Base_amt_rnd_typ_nm) doBase_amt_rnd_typ_nm_NE(info);
		else if (ne == Base_amt_dec_place) doBase_amt_dec_place_NE(info);
		else if (ne == Base_ave_rnd_typ) doBase_ave_rnd_typ_NE(info);
		else if (ne == Base_ave_rnd_typ_nm) doBase_ave_rnd_typ_nm_NE(info);
		else if (ne == Base_ave_dec_place) doBase_ave_dec_place_NE(info);
		else if (ne == Base_adj_typ) doBase_adj_typ_NE(info);
		else if (ne == Base_adj_typ_nm) doBase_adj_typ_nm_NE(info);
		else if (ne == Base_mrgn_expns_cd) doBase_mrgn_expns_cd_NE(info);
		else if (ne == Base_mrgn_expns_nm) doBase_mrgn_expns_nm_NE(info);
		else if (ne == Base_purc_expns_cd) doBase_purc_expns_cd_NE(info);
		else if (ne == Base_purc_expns_nm) doBase_purc_expns_nm_NE(info);
		else if (ne == Base_out_expns_cd) doBase_out_expns_cd_NE(info);
		else if (ne == Base_out_expns_nm) doBase_out_expns_nm_NE(info);
		else if (ne == Base_inpt_expns_cd) doBase_inpt_expns_cd_NE(info);
		else if (ne == Base_inpt_expns_nm) doBase_inpt_expns_nm_NE(info);
		else if (ne == Base_ss_expns_cd) doBase_ss_expns_cd_NE(info);
		else if (ne == Base_ss_expns_nm) doBase_ss_expns_nm_NE(info);
		else if (ne == Base_prov_expns_cd) doBase_prov_expns_cd_NE(info);
		else if (ne == Base_prov_expns_nm) doBase_prov_expns_nm_NE(info);
		else if (ne == Base_pre_alc_max_lvl) doBase_pre_alc_max_lvl_NE(info);
		else if (ne == Base_pre_alc_max_rec) doBase_pre_alc_max_rec_NE(info);
		else if (ne == Base_diff_use_typ) doBase_diff_use_typ_NE(info);
		else if (ne == Base_diff_use_typ_nm) doBase_diff_use_typ_nm_NE(info);
		else if (ne == Base_lot_use_typ) doBase_lot_use_typ_NE(info);
		else if (ne == Base_lot_use_typ_nm) doBase_lot_use_typ_nm_NE(info);
		else if (ne == Base_sublot_use_typ) doBase_sublot_use_typ_NE(info);
		else if (ne == Base_sublot_use_typ_nm) doBase_sublot_use_typ_nm_NE(info);
		else if (ne == Base_sno1_use_typ) doBase_sno1_use_typ_NE(info);
		else if (ne == Base_sno1_use_typ_nm) doBase_sno1_use_typ_nm_NE(info);
		else if (ne == Base_sno2_use_typ) doBase_sno2_use_typ_NE(info);
		else if (ne == Base_sno2_use_typ_nm) doBase_sno2_use_typ_nm_NE(info);
		else if (ne == Base_sno3_use_typ) doBase_sno3_use_typ_NE(info);
		else if (ne == Base_sno3_use_typ_nm) doBase_sno3_use_typ_nm_NE(info);
		else if (ne == Base_sno4_use_typ) doBase_sno4_use_typ_NE(info);
		else if (ne == Base_sno4_use_typ_nm) doBase_sno4_use_typ_nm_NE(info);
		else if (ne == Base_def_calc_ctg_cd) doBase_def_calc_ctg_cd_NE(info);
		else if (ne == Base_def_calc_ctg_nm) doBase_def_calc_ctg_nm_NE(info);
		else if (ne == Base_fix_dpt_cd) doBase_fix_dpt_cd_NE(info);
		else if (ne == Base_fix_dpt_nm) doBase_fix_dpt_nm_NE(info);
		else if (ne == Base_trd_ratio_flg) doBase_trd_ratio_flg_NE(info);
		else if (ne == Base_stop_slip_flg) doBase_stop_slip_flg_NE(info);
		else if (ne == Base_non_prod_flg) doBase_non_prod_flg_NE(info);
		else if (ne == Base_oper_sum_flg) doBase_oper_sum_flg_NE(info);
		else if (ne == Base_non_sls_flg) doBase_non_sls_flg_NE(info);
		else if (ne == Base_asst_flg) doBase_asst_flg_NE(info);
		else if (ne == Base_stk_bp_flg) doBase_stk_bp_flg_NE(info);
		else if (ne == Base_non_transit_flg) doBase_non_transit_flg_NE(info);
		else if (ne == Base_wg_non_mov_flg) doBase_wg_non_mov_flg_NE(info);
		else if (ne == Base_lot_non_mov_flg) doBase_lot_non_mov_flg_NE(info);
		else if (ne == Base_sublot_non_mov_flg) doBase_sublot_non_mov_flg_NE(info);
		else if (ne == Base_sno1_non_mov_flg) doBase_sno1_non_mov_flg_NE(info);
		else if (ne == Base_sno2_non_mov_flg) doBase_sno2_non_mov_flg_NE(info);
		else if (ne == Base_sno3_non_mov_flg) doBase_sno3_non_mov_flg_NE(info);
		else if (ne == Base_sno4_non_mov_flg) doBase_sno4_non_mov_flg_NE(info);
		else if (ne == Base_tmp_dpt_cd) doBase_tmp_dpt_cd_NE(info);
		else if (ne == Base_tmp_dpt_nm) doBase_tmp_dpt_nm_NE(info);
		else if (ne == Base_act_trd_calc_ctg_cd) doBase_act_trd_calc_ctg_cd_NE(info);
		else if (ne == Base_act_trd_calc_ctg_nm) doBase_act_trd_calc_ctg_nm_NE(info);
		else if (ne == Base_chk_mst_flg) doBase_chk_mst_flg_NE(info);
		else if (ne == Base_stktk_sum_flg) doBase_stktk_sum_flg_NE(info);
		else if (ne == Base_oth_ccn_sum_flg) doBase_oth_ccn_sum_flg_NE(info);
		else if (ne == Base_std_disp_digit) doBase_std_disp_digit_NE(info);
		else if (ne == Base_amt_disp_digit) doBase_amt_disp_digit_NE(info);
		else if (ne == Base_unit_disp_digit) doBase_unit_disp_digit_NE(info);
		else if (ne == Base_rate_disp_digit) doBase_rate_disp_digit_NE(info);
		else if (ne == Base_excel_pln_flg) doBase_excel_pln_flg_NE(info);
		else if (ne == Base_excel_act_flg) doBase_excel_act_flg_NE(info);
		else if (ne == Base_excel_alc_flg) doBase_excel_alc_flg_NE(info);
		else if (ne == Base_ins_usr_id) doBase_ins_usr_id_NE(info);
		else if (ne == Base_ins_usr_nm) doBase_ins_usr_nm_NE(info);
		else if (ne == Base_ins_func_id) doBase_ins_func_id_NE(info);
		else if (ne == Base_ins_func_nm) doBase_ins_func_nm_NE(info);
		else if (ne == Base_upd_usr_id) doBase_upd_usr_id_NE(info);
		else if (ne == Base_upd_usr_nm) doBase_upd_usr_nm_NE(info);
		else if (ne == Base_upd_func_id) doBase_upd_func_id_NE(info);
		else if (ne == Base_upd_func_nm) doBase_upd_func_nm_NE(info);
		else if (ne == Base_ins_ts) doBase_ins_ts_NE(info);
		else if (ne == Base_upd_ts) doBase_upd_ts_NE(info);
		else if (ne == Base_upd_srv_req_no) doBase_upd_srv_req_no_NE(info);
		else if (ne == Base_upd_cntr) doBase_upd_cntr_NE(info);
		else if (ne == Base_check) doBase_check_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_co_cd) doDtl_co_cd_NE(info);
		else if (ne == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NE(info);
		else if (ne == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_std_dec_place) doDtl_std_dec_place_NE(info);
		else if (ne == columnDtl_amt_rnd_typ) doDtl_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_amt_rnd_typ_nm) doDtl_amt_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_amt_dec_place) doDtl_amt_dec_place_NE(info);
		else if (ne == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_NE(info);
		else if (ne == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_ave_dec_place) doDtl_ave_dec_place_NE(info);
		else if (ne == columnDtl_adj_typ) doDtl_adj_typ_NE(info);
		else if (ne == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_NE(info);
		else if (ne == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_NE(info);
		else if (ne == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_NE(info);
		else if (ne == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_NE(info);
		else if (ne == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_NE(info);
		else if (ne == columnDtl_out_expns_cd) doDtl_out_expns_cd_NE(info);
		else if (ne == columnDtl_out_expns_nm) doDtl_out_expns_nm_NE(info);
		else if (ne == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_NE(info);
		else if (ne == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_NE(info);
		else if (ne == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_NE(info);
		else if (ne == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_NE(info);
		else if (ne == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_NE(info);
		else if (ne == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_NE(info);
		else if (ne == columnDtl_pre_alc_max_lvl) doDtl_pre_alc_max_lvl_NE(info);
		else if (ne == columnDtl_pre_alc_max_rec) doDtl_pre_alc_max_rec_NE(info);
		else if (ne == columnDtl_diff_use_typ) doDtl_diff_use_typ_NE(info);
		else if (ne == columnDtl_diff_use_typ_nm) doDtl_diff_use_typ_nm_NE(info);
		else if (ne == columnDtl_lot_use_typ) doDtl_lot_use_typ_NE(info);
		else if (ne == columnDtl_lot_use_typ_nm) doDtl_lot_use_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_use_typ) doDtl_sublot_use_typ_NE(info);
		else if (ne == columnDtl_sublot_use_typ_nm) doDtl_sublot_use_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_use_typ) doDtl_sno1_use_typ_NE(info);
		else if (ne == columnDtl_sno1_use_typ_nm) doDtl_sno1_use_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_use_typ) doDtl_sno2_use_typ_NE(info);
		else if (ne == columnDtl_sno2_use_typ_nm) doDtl_sno2_use_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_use_typ) doDtl_sno3_use_typ_NE(info);
		else if (ne == columnDtl_sno3_use_typ_nm) doDtl_sno3_use_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_use_typ) doDtl_sno4_use_typ_NE(info);
		else if (ne == columnDtl_sno4_use_typ_nm) doDtl_sno4_use_typ_nm_NE(info);
		else if (ne == columnDtl_def_calc_ctg_cd) doDtl_def_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_def_calc_ctg_nm) doDtl_def_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_fix_dpt_cd) doDtl_fix_dpt_cd_NE(info);
		else if (ne == columnDtl_fix_dpt_nm) doDtl_fix_dpt_nm_NE(info);
		else if (ne == columnDtl_trd_ratio_flg) doDtl_trd_ratio_flg_NE(info);
		else if (ne == columnDtl_stop_slip_flg) doDtl_stop_slip_flg_NE(info);
		else if (ne == columnDtl_non_prod_flg) doDtl_non_prod_flg_NE(info);
		else if (ne == columnDtl_oper_sum_flg) doDtl_oper_sum_flg_NE(info);
		else if (ne == columnDtl_non_sls_flg) doDtl_non_sls_flg_NE(info);
		else if (ne == columnDtl_asst_flg) doDtl_asst_flg_NE(info);
		else if (ne == columnDtl_stk_bp_flg) doDtl_stk_bp_flg_NE(info);
		else if (ne == columnDtl_non_transit_flg) doDtl_non_transit_flg_NE(info);
		else if (ne == columnDtl_wg_non_mov_flg) doDtl_wg_non_mov_flg_NE(info);
		else if (ne == columnDtl_lot_non_mov_flg) doDtl_lot_non_mov_flg_NE(info);
		else if (ne == columnDtl_sublot_non_mov_flg) doDtl_sublot_non_mov_flg_NE(info);
		else if (ne == columnDtl_sno1_non_mov_flg) doDtl_sno1_non_mov_flg_NE(info);
		else if (ne == columnDtl_sno2_non_mov_flg) doDtl_sno2_non_mov_flg_NE(info);
		else if (ne == columnDtl_sno3_non_mov_flg) doDtl_sno3_non_mov_flg_NE(info);
		else if (ne == columnDtl_sno4_non_mov_flg) doDtl_sno4_non_mov_flg_NE(info);
		else if (ne == columnDtl_tmp_dpt_cd) doDtl_tmp_dpt_cd_NE(info);
		else if (ne == columnDtl_tmp_dpt_nm) doDtl_tmp_dpt_nm_NE(info);
		else if (ne == columnDtl_act_trd_calc_ctg_cd) doDtl_act_trd_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_act_trd_calc_ctg_nm) doDtl_act_trd_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_chk_mst_flg) doDtl_chk_mst_flg_NE(info);
		else if (ne == columnDtl_stktk_sum_flg) doDtl_stktk_sum_flg_NE(info);
		else if (ne == columnDtl_oth_ccn_sum_flg) doDtl_oth_ccn_sum_flg_NE(info);
		else if (ne == columnDtl_amt_disp_digit) doDtl_amt_disp_digit_NE(info);
		else if (ne == columnDtl_unit_disp_digit) doDtl_unit_disp_digit_NE(info);
		else if (ne == columnDtl_std_disp_digit) doDtl_std_disp_digit_NE(info);
		else if (ne == columnDtl_rate_disp_digit) doDtl_rate_disp_digit_NE(info);
		else if (ne == columnDtl_excel_pln_flg) doDtl_excel_pln_flg_NE(info);
		else if (ne == columnDtl_excel_act_flg) doDtl_excel_act_flg_NE(info);
		else if (ne == columnDtl_excel_alc_flg) doDtl_excel_alc_flg_NE(info);
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
	}

	/**
	 * [Tab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_lvl_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_rec]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_rec_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[trd_ratio_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_trd_ratio_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stop_slip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stop_slip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_prod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_prod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[oper_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_oper_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_transit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_transit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wg_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wg_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[chk_mst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_chk_mst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stktk_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stktk_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[oth_ccn_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_oth_ccn_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[unit_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_unit_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rate_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rate_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_pln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_pln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_alc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_lvl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_rec]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_rec_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ratio_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ratio_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stop_slip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stop_slip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_prod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_prod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_transit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_transit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_non_mov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_non_mov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chk_mst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chk_mst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oth_ccn_sum_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oth_ccn_sum_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_disp_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_disp_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_pln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_pln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_alc_flg_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == TabTab) doTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_co_cd) doCnd_co_cd_NX(info);
		else if (nx == Cnd_co_nm) doCnd_co_nm_NX(info);
		else if (nx == Base_std_rnd_typ) doBase_std_rnd_typ_NX(info);
		else if (nx == Base_std_rnd_typ_nm) doBase_std_rnd_typ_nm_NX(info);
		else if (nx == Base_std_dec_place) doBase_std_dec_place_NX(info);
		else if (nx == Base_amt_rnd_typ) doBase_amt_rnd_typ_NX(info);
		else if (nx == Base_amt_rnd_typ_nm) doBase_amt_rnd_typ_nm_NX(info);
		else if (nx == Base_amt_dec_place) doBase_amt_dec_place_NX(info);
		else if (nx == Base_ave_rnd_typ) doBase_ave_rnd_typ_NX(info);
		else if (nx == Base_ave_rnd_typ_nm) doBase_ave_rnd_typ_nm_NX(info);
		else if (nx == Base_ave_dec_place) doBase_ave_dec_place_NX(info);
		else if (nx == Base_adj_typ) doBase_adj_typ_NX(info);
		else if (nx == Base_adj_typ_nm) doBase_adj_typ_nm_NX(info);
		else if (nx == Base_mrgn_expns_cd) doBase_mrgn_expns_cd_NX(info);
		else if (nx == Base_mrgn_expns_nm) doBase_mrgn_expns_nm_NX(info);
		else if (nx == Base_purc_expns_cd) doBase_purc_expns_cd_NX(info);
		else if (nx == Base_purc_expns_nm) doBase_purc_expns_nm_NX(info);
		else if (nx == Base_out_expns_cd) doBase_out_expns_cd_NX(info);
		else if (nx == Base_out_expns_nm) doBase_out_expns_nm_NX(info);
		else if (nx == Base_inpt_expns_cd) doBase_inpt_expns_cd_NX(info);
		else if (nx == Base_inpt_expns_nm) doBase_inpt_expns_nm_NX(info);
		else if (nx == Base_ss_expns_cd) doBase_ss_expns_cd_NX(info);
		else if (nx == Base_ss_expns_nm) doBase_ss_expns_nm_NX(info);
		else if (nx == Base_prov_expns_cd) doBase_prov_expns_cd_NX(info);
		else if (nx == Base_prov_expns_nm) doBase_prov_expns_nm_NX(info);
		else if (nx == Base_pre_alc_max_lvl) doBase_pre_alc_max_lvl_NX(info);
		else if (nx == Base_pre_alc_max_rec) doBase_pre_alc_max_rec_NX(info);
		else if (nx == Base_diff_use_typ) doBase_diff_use_typ_NX(info);
		else if (nx == Base_diff_use_typ_nm) doBase_diff_use_typ_nm_NX(info);
		else if (nx == Base_lot_use_typ) doBase_lot_use_typ_NX(info);
		else if (nx == Base_lot_use_typ_nm) doBase_lot_use_typ_nm_NX(info);
		else if (nx == Base_sublot_use_typ) doBase_sublot_use_typ_NX(info);
		else if (nx == Base_sublot_use_typ_nm) doBase_sublot_use_typ_nm_NX(info);
		else if (nx == Base_sno1_use_typ) doBase_sno1_use_typ_NX(info);
		else if (nx == Base_sno1_use_typ_nm) doBase_sno1_use_typ_nm_NX(info);
		else if (nx == Base_sno2_use_typ) doBase_sno2_use_typ_NX(info);
		else if (nx == Base_sno2_use_typ_nm) doBase_sno2_use_typ_nm_NX(info);
		else if (nx == Base_sno3_use_typ) doBase_sno3_use_typ_NX(info);
		else if (nx == Base_sno3_use_typ_nm) doBase_sno3_use_typ_nm_NX(info);
		else if (nx == Base_sno4_use_typ) doBase_sno4_use_typ_NX(info);
		else if (nx == Base_sno4_use_typ_nm) doBase_sno4_use_typ_nm_NX(info);
		else if (nx == Base_def_calc_ctg_cd) doBase_def_calc_ctg_cd_NX(info);
		else if (nx == Base_def_calc_ctg_nm) doBase_def_calc_ctg_nm_NX(info);
		else if (nx == Base_fix_dpt_cd) doBase_fix_dpt_cd_NX(info);
		else if (nx == Base_fix_dpt_nm) doBase_fix_dpt_nm_NX(info);
		else if (nx == Base_trd_ratio_flg) doBase_trd_ratio_flg_NX(info);
		else if (nx == Base_stop_slip_flg) doBase_stop_slip_flg_NX(info);
		else if (nx == Base_non_prod_flg) doBase_non_prod_flg_NX(info);
		else if (nx == Base_oper_sum_flg) doBase_oper_sum_flg_NX(info);
		else if (nx == Base_non_sls_flg) doBase_non_sls_flg_NX(info);
		else if (nx == Base_asst_flg) doBase_asst_flg_NX(info);
		else if (nx == Base_stk_bp_flg) doBase_stk_bp_flg_NX(info);
		else if (nx == Base_non_transit_flg) doBase_non_transit_flg_NX(info);
		else if (nx == Base_wg_non_mov_flg) doBase_wg_non_mov_flg_NX(info);
		else if (nx == Base_lot_non_mov_flg) doBase_lot_non_mov_flg_NX(info);
		else if (nx == Base_sublot_non_mov_flg) doBase_sublot_non_mov_flg_NX(info);
		else if (nx == Base_sno1_non_mov_flg) doBase_sno1_non_mov_flg_NX(info);
		else if (nx == Base_sno2_non_mov_flg) doBase_sno2_non_mov_flg_NX(info);
		else if (nx == Base_sno3_non_mov_flg) doBase_sno3_non_mov_flg_NX(info);
		else if (nx == Base_sno4_non_mov_flg) doBase_sno4_non_mov_flg_NX(info);
		else if (nx == Base_tmp_dpt_cd) doBase_tmp_dpt_cd_NX(info);
		else if (nx == Base_tmp_dpt_nm) doBase_tmp_dpt_nm_NX(info);
		else if (nx == Base_act_trd_calc_ctg_cd) doBase_act_trd_calc_ctg_cd_NX(info);
		else if (nx == Base_act_trd_calc_ctg_nm) doBase_act_trd_calc_ctg_nm_NX(info);
		else if (nx == Base_chk_mst_flg) doBase_chk_mst_flg_NX(info);
		else if (nx == Base_stktk_sum_flg) doBase_stktk_sum_flg_NX(info);
		else if (nx == Base_oth_ccn_sum_flg) doBase_oth_ccn_sum_flg_NX(info);
		else if (nx == Base_std_disp_digit) doBase_std_disp_digit_NX(info);
		else if (nx == Base_amt_disp_digit) doBase_amt_disp_digit_NX(info);
		else if (nx == Base_unit_disp_digit) doBase_unit_disp_digit_NX(info);
		else if (nx == Base_rate_disp_digit) doBase_rate_disp_digit_NX(info);
		else if (nx == Base_excel_pln_flg) doBase_excel_pln_flg_NX(info);
		else if (nx == Base_excel_act_flg) doBase_excel_act_flg_NX(info);
		else if (nx == Base_excel_alc_flg) doBase_excel_alc_flg_NX(info);
		else if (nx == Base_ins_usr_id) doBase_ins_usr_id_NX(info);
		else if (nx == Base_ins_usr_nm) doBase_ins_usr_nm_NX(info);
		else if (nx == Base_ins_func_id) doBase_ins_func_id_NX(info);
		else if (nx == Base_ins_func_nm) doBase_ins_func_nm_NX(info);
		else if (nx == Base_upd_usr_id) doBase_upd_usr_id_NX(info);
		else if (nx == Base_upd_usr_nm) doBase_upd_usr_nm_NX(info);
		else if (nx == Base_upd_func_id) doBase_upd_func_id_NX(info);
		else if (nx == Base_upd_func_nm) doBase_upd_func_nm_NX(info);
		else if (nx == Base_ins_ts) doBase_ins_ts_NX(info);
		else if (nx == Base_upd_ts) doBase_upd_ts_NX(info);
		else if (nx == Base_upd_srv_req_no) doBase_upd_srv_req_no_NX(info);
		else if (nx == Base_upd_cntr) doBase_upd_cntr_NX(info);
		else if (nx == Base_check) doBase_check_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_co_cd) doDtl_co_cd_NX(info);
		else if (nx == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NX(info);
		else if (nx == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_std_dec_place) doDtl_std_dec_place_NX(info);
		else if (nx == columnDtl_amt_rnd_typ) doDtl_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_amt_rnd_typ_nm) doDtl_amt_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_amt_dec_place) doDtl_amt_dec_place_NX(info);
		else if (nx == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_NX(info);
		else if (nx == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_ave_dec_place) doDtl_ave_dec_place_NX(info);
		else if (nx == columnDtl_adj_typ) doDtl_adj_typ_NX(info);
		else if (nx == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_NX(info);
		else if (nx == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_NX(info);
		else if (nx == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_NX(info);
		else if (nx == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_NX(info);
		else if (nx == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_NX(info);
		else if (nx == columnDtl_out_expns_cd) doDtl_out_expns_cd_NX(info);
		else if (nx == columnDtl_out_expns_nm) doDtl_out_expns_nm_NX(info);
		else if (nx == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_NX(info);
		else if (nx == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_NX(info);
		else if (nx == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_NX(info);
		else if (nx == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_NX(info);
		else if (nx == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_NX(info);
		else if (nx == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_NX(info);
		else if (nx == columnDtl_pre_alc_max_lvl) doDtl_pre_alc_max_lvl_NX(info);
		else if (nx == columnDtl_pre_alc_max_rec) doDtl_pre_alc_max_rec_NX(info);
		else if (nx == columnDtl_diff_use_typ) doDtl_diff_use_typ_NX(info);
		else if (nx == columnDtl_diff_use_typ_nm) doDtl_diff_use_typ_nm_NX(info);
		else if (nx == columnDtl_lot_use_typ) doDtl_lot_use_typ_NX(info);
		else if (nx == columnDtl_lot_use_typ_nm) doDtl_lot_use_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_use_typ) doDtl_sublot_use_typ_NX(info);
		else if (nx == columnDtl_sublot_use_typ_nm) doDtl_sublot_use_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_use_typ) doDtl_sno1_use_typ_NX(info);
		else if (nx == columnDtl_sno1_use_typ_nm) doDtl_sno1_use_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_use_typ) doDtl_sno2_use_typ_NX(info);
		else if (nx == columnDtl_sno2_use_typ_nm) doDtl_sno2_use_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_use_typ) doDtl_sno3_use_typ_NX(info);
		else if (nx == columnDtl_sno3_use_typ_nm) doDtl_sno3_use_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_use_typ) doDtl_sno4_use_typ_NX(info);
		else if (nx == columnDtl_sno4_use_typ_nm) doDtl_sno4_use_typ_nm_NX(info);
		else if (nx == columnDtl_def_calc_ctg_cd) doDtl_def_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_def_calc_ctg_nm) doDtl_def_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_fix_dpt_cd) doDtl_fix_dpt_cd_NX(info);
		else if (nx == columnDtl_fix_dpt_nm) doDtl_fix_dpt_nm_NX(info);
		else if (nx == columnDtl_trd_ratio_flg) doDtl_trd_ratio_flg_NX(info);
		else if (nx == columnDtl_stop_slip_flg) doDtl_stop_slip_flg_NX(info);
		else if (nx == columnDtl_non_prod_flg) doDtl_non_prod_flg_NX(info);
		else if (nx == columnDtl_oper_sum_flg) doDtl_oper_sum_flg_NX(info);
		else if (nx == columnDtl_non_sls_flg) doDtl_non_sls_flg_NX(info);
		else if (nx == columnDtl_asst_flg) doDtl_asst_flg_NX(info);
		else if (nx == columnDtl_stk_bp_flg) doDtl_stk_bp_flg_NX(info);
		else if (nx == columnDtl_non_transit_flg) doDtl_non_transit_flg_NX(info);
		else if (nx == columnDtl_wg_non_mov_flg) doDtl_wg_non_mov_flg_NX(info);
		else if (nx == columnDtl_lot_non_mov_flg) doDtl_lot_non_mov_flg_NX(info);
		else if (nx == columnDtl_sublot_non_mov_flg) doDtl_sublot_non_mov_flg_NX(info);
		else if (nx == columnDtl_sno1_non_mov_flg) doDtl_sno1_non_mov_flg_NX(info);
		else if (nx == columnDtl_sno2_non_mov_flg) doDtl_sno2_non_mov_flg_NX(info);
		else if (nx == columnDtl_sno3_non_mov_flg) doDtl_sno3_non_mov_flg_NX(info);
		else if (nx == columnDtl_sno4_non_mov_flg) doDtl_sno4_non_mov_flg_NX(info);
		else if (nx == columnDtl_tmp_dpt_cd) doDtl_tmp_dpt_cd_NX(info);
		else if (nx == columnDtl_tmp_dpt_nm) doDtl_tmp_dpt_nm_NX(info);
		else if (nx == columnDtl_act_trd_calc_ctg_cd) doDtl_act_trd_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_act_trd_calc_ctg_nm) doDtl_act_trd_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_chk_mst_flg) doDtl_chk_mst_flg_NX(info);
		else if (nx == columnDtl_stktk_sum_flg) doDtl_stktk_sum_flg_NX(info);
		else if (nx == columnDtl_oth_ccn_sum_flg) doDtl_oth_ccn_sum_flg_NX(info);
		else if (nx == columnDtl_amt_disp_digit) doDtl_amt_disp_digit_NX(info);
		else if (nx == columnDtl_unit_disp_digit) doDtl_unit_disp_digit_NX(info);
		else if (nx == columnDtl_std_disp_digit) doDtl_std_disp_digit_NX(info);
		else if (nx == columnDtl_rate_disp_digit) doDtl_rate_disp_digit_NX(info);
		else if (nx == columnDtl_excel_pln_flg) doDtl_excel_pln_flg_NX(info);
		else if (nx == columnDtl_excel_act_flg) doDtl_excel_act_flg_NX(info);
		else if (nx == columnDtl_excel_alc_flg) doDtl_excel_alc_flg_NX(info);
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
	}

	/**
	 * [Tab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_lvl_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_rec]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_rec_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[trd_ratio_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_trd_ratio_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stop_slip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stop_slip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_prod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_prod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[oper_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_oper_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_asst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stk_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stk_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[non_transit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_non_transit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[wg_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_wg_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[chk_mst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_chk_mst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[stktk_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_stktk_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[oth_ccn_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_oth_ccn_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[unit_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_unit_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rate_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rate_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_pln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_pln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[excel_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_excel_alc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_lvl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_rec]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_rec_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ratio_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ratio_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stop_slip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stop_slip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_prod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_prod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_transit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_transit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_non_mov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_non_mov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chk_mst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chk_mst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stktk_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stktk_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oth_ccn_sum_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oth_ccn_sum_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_disp_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_disp_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_pln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_pln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[excel_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_excel_alc_flg_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_co_cd) doCnd_co_cd_LC(info);
		else if (lc == Cnd_co_nm) doCnd_co_nm_LC(info);
		else if (lc == Base_std_rnd_typ) doBase_std_rnd_typ_LC(info);
		else if (lc == Base_std_rnd_typ_nm) doBase_std_rnd_typ_nm_LC(info);
		else if (lc == Base_std_dec_place) doBase_std_dec_place_LC(info);
		else if (lc == Base_amt_rnd_typ) doBase_amt_rnd_typ_LC(info);
		else if (lc == Base_amt_rnd_typ_nm) doBase_amt_rnd_typ_nm_LC(info);
		else if (lc == Base_amt_dec_place) doBase_amt_dec_place_LC(info);
		else if (lc == Base_ave_rnd_typ) doBase_ave_rnd_typ_LC(info);
		else if (lc == Base_ave_rnd_typ_nm) doBase_ave_rnd_typ_nm_LC(info);
		else if (lc == Base_ave_dec_place) doBase_ave_dec_place_LC(info);
		else if (lc == Base_adj_typ) doBase_adj_typ_LC(info);
		else if (lc == Base_adj_typ_nm) doBase_adj_typ_nm_LC(info);
		else if (lc == Base_mrgn_expns_cd) doBase_mrgn_expns_cd_LC(info);
		else if (lc == Base_mrgn_expns_nm) doBase_mrgn_expns_nm_LC(info);
		else if (lc == Base_purc_expns_cd) doBase_purc_expns_cd_LC(info);
		else if (lc == Base_purc_expns_nm) doBase_purc_expns_nm_LC(info);
		else if (lc == Base_out_expns_cd) doBase_out_expns_cd_LC(info);
		else if (lc == Base_out_expns_nm) doBase_out_expns_nm_LC(info);
		else if (lc == Base_inpt_expns_cd) doBase_inpt_expns_cd_LC(info);
		else if (lc == Base_inpt_expns_nm) doBase_inpt_expns_nm_LC(info);
		else if (lc == Base_ss_expns_cd) doBase_ss_expns_cd_LC(info);
		else if (lc == Base_ss_expns_nm) doBase_ss_expns_nm_LC(info);
		else if (lc == Base_prov_expns_cd) doBase_prov_expns_cd_LC(info);
		else if (lc == Base_prov_expns_nm) doBase_prov_expns_nm_LC(info);
		else if (lc == Base_pre_alc_max_lvl) doBase_pre_alc_max_lvl_LC(info);
		else if (lc == Base_pre_alc_max_rec) doBase_pre_alc_max_rec_LC(info);
		else if (lc == Base_diff_use_typ) doBase_diff_use_typ_LC(info);
		else if (lc == Base_diff_use_typ_nm) doBase_diff_use_typ_nm_LC(info);
		else if (lc == Base_lot_use_typ) doBase_lot_use_typ_LC(info);
		else if (lc == Base_lot_use_typ_nm) doBase_lot_use_typ_nm_LC(info);
		else if (lc == Base_sublot_use_typ) doBase_sublot_use_typ_LC(info);
		else if (lc == Base_sublot_use_typ_nm) doBase_sublot_use_typ_nm_LC(info);
		else if (lc == Base_sno1_use_typ) doBase_sno1_use_typ_LC(info);
		else if (lc == Base_sno1_use_typ_nm) doBase_sno1_use_typ_nm_LC(info);
		else if (lc == Base_sno2_use_typ) doBase_sno2_use_typ_LC(info);
		else if (lc == Base_sno2_use_typ_nm) doBase_sno2_use_typ_nm_LC(info);
		else if (lc == Base_sno3_use_typ) doBase_sno3_use_typ_LC(info);
		else if (lc == Base_sno3_use_typ_nm) doBase_sno3_use_typ_nm_LC(info);
		else if (lc == Base_sno4_use_typ) doBase_sno4_use_typ_LC(info);
		else if (lc == Base_sno4_use_typ_nm) doBase_sno4_use_typ_nm_LC(info);
		else if (lc == Base_def_calc_ctg_cd) doBase_def_calc_ctg_cd_LC(info);
		else if (lc == Base_def_calc_ctg_nm) doBase_def_calc_ctg_nm_LC(info);
		else if (lc == Base_fix_dpt_cd) doBase_fix_dpt_cd_LC(info);
		else if (lc == Base_fix_dpt_nm) doBase_fix_dpt_nm_LC(info);
		else if (lc == Base_tmp_dpt_cd) doBase_tmp_dpt_cd_LC(info);
		else if (lc == Base_tmp_dpt_nm) doBase_tmp_dpt_nm_LC(info);
		else if (lc == Base_act_trd_calc_ctg_cd) doBase_act_trd_calc_ctg_cd_LC(info);
		else if (lc == Base_act_trd_calc_ctg_nm) doBase_act_trd_calc_ctg_nm_LC(info);
		else if (lc == Base_std_disp_digit) doBase_std_disp_digit_LC(info);
		else if (lc == Base_amt_disp_digit) doBase_amt_disp_digit_LC(info);
		else if (lc == Base_unit_disp_digit) doBase_unit_disp_digit_LC(info);
		else if (lc == Base_rate_disp_digit) doBase_rate_disp_digit_LC(info);
		else if (lc == Base_ins_usr_id) doBase_ins_usr_id_LC(info);
		else if (lc == Base_ins_usr_nm) doBase_ins_usr_nm_LC(info);
		else if (lc == Base_ins_func_id) doBase_ins_func_id_LC(info);
		else if (lc == Base_ins_func_nm) doBase_ins_func_nm_LC(info);
		else if (lc == Base_upd_usr_id) doBase_upd_usr_id_LC(info);
		else if (lc == Base_upd_usr_nm) doBase_upd_usr_nm_LC(info);
		else if (lc == Base_upd_func_id) doBase_upd_func_id_LC(info);
		else if (lc == Base_upd_func_nm) doBase_upd_func_nm_LC(info);
		else if (lc == Base_ins_ts) doBase_ins_ts_LC(info);
		else if (lc == Base_upd_ts) doBase_upd_ts_LC(info);
		else if (lc == Base_upd_srv_req_no) doBase_upd_srv_req_no_LC(info);
		else if (lc == Base_upd_cntr) doBase_upd_cntr_LC(info);
		else if (lc == columnDtl_co_cd) doDtl_co_cd_LC(info);
		else if (lc == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_LC(info);
		else if (lc == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_std_dec_place) doDtl_std_dec_place_LC(info);
		else if (lc == columnDtl_amt_rnd_typ) doDtl_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_amt_rnd_typ_nm) doDtl_amt_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_amt_dec_place) doDtl_amt_dec_place_LC(info);
		else if (lc == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_LC(info);
		else if (lc == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_ave_dec_place) doDtl_ave_dec_place_LC(info);
		else if (lc == columnDtl_adj_typ) doDtl_adj_typ_LC(info);
		else if (lc == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_LC(info);
		else if (lc == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_LC(info);
		else if (lc == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_LC(info);
		else if (lc == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_LC(info);
		else if (lc == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_LC(info);
		else if (lc == columnDtl_out_expns_cd) doDtl_out_expns_cd_LC(info);
		else if (lc == columnDtl_out_expns_nm) doDtl_out_expns_nm_LC(info);
		else if (lc == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_LC(info);
		else if (lc == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_LC(info);
		else if (lc == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_LC(info);
		else if (lc == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_LC(info);
		else if (lc == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_LC(info);
		else if (lc == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_LC(info);
		else if (lc == columnDtl_pre_alc_max_lvl) doDtl_pre_alc_max_lvl_LC(info);
		else if (lc == columnDtl_pre_alc_max_rec) doDtl_pre_alc_max_rec_LC(info);
		else if (lc == columnDtl_diff_use_typ) doDtl_diff_use_typ_LC(info);
		else if (lc == columnDtl_diff_use_typ_nm) doDtl_diff_use_typ_nm_LC(info);
		else if (lc == columnDtl_lot_use_typ) doDtl_lot_use_typ_LC(info);
		else if (lc == columnDtl_lot_use_typ_nm) doDtl_lot_use_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_use_typ) doDtl_sublot_use_typ_LC(info);
		else if (lc == columnDtl_sublot_use_typ_nm) doDtl_sublot_use_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_use_typ) doDtl_sno1_use_typ_LC(info);
		else if (lc == columnDtl_sno1_use_typ_nm) doDtl_sno1_use_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_use_typ) doDtl_sno2_use_typ_LC(info);
		else if (lc == columnDtl_sno2_use_typ_nm) doDtl_sno2_use_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_use_typ) doDtl_sno3_use_typ_LC(info);
		else if (lc == columnDtl_sno3_use_typ_nm) doDtl_sno3_use_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_use_typ) doDtl_sno4_use_typ_LC(info);
		else if (lc == columnDtl_sno4_use_typ_nm) doDtl_sno4_use_typ_nm_LC(info);
		else if (lc == columnDtl_def_calc_ctg_cd) doDtl_def_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_def_calc_ctg_nm) doDtl_def_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_fix_dpt_cd) doDtl_fix_dpt_cd_LC(info);
		else if (lc == columnDtl_fix_dpt_nm) doDtl_fix_dpt_nm_LC(info);
		else if (lc == columnDtl_tmp_dpt_cd) doDtl_tmp_dpt_cd_LC(info);
		else if (lc == columnDtl_tmp_dpt_nm) doDtl_tmp_dpt_nm_LC(info);
		else if (lc == columnDtl_act_trd_calc_ctg_cd) doDtl_act_trd_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_act_trd_calc_ctg_nm) doDtl_act_trd_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_amt_disp_digit) doDtl_amt_disp_digit_LC(info);
		else if (lc == columnDtl_unit_disp_digit) doDtl_unit_disp_digit_LC(info);
		else if (lc == columnDtl_std_disp_digit) doDtl_std_disp_digit_LC(info);
		else if (lc == columnDtl_rate_disp_digit) doDtl_rate_disp_digit_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[co_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_co_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ave_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ave_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[adj_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_adj_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[mrgn_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_mrgn_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[purc_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_purc_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[out_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_out_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[inpt_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_inpt_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ss_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ss_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[prov_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_prov_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_lvl_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[pre_alc_max_rec]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_pre_alc_max_rec_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[diff_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_diff_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[lot_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_lot_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sublot_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sublot_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno1_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno1_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno2_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno2_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno3_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno3_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[sno4_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_sno4_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[def_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_def_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[fix_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_fix_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[tmp_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_tmp_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[act_trd_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_act_trd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[std_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_std_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[amt_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_amt_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[unit_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_unit_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[rate_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_rate_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Base]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBase_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_lvl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_max_rec]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_max_rec_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[diff_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_diff_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_use_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_use_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_trd_calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_trd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_disp_digit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rate_disp_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rate_disp_digit_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Base_std_rnd_typ]の作成メソッド
	 */
	public MCList getBase_std_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_amt_rnd_typ]の作成メソッド
	 */
	public MCList getBase_amt_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_ave_rnd_typ]の作成メソッド
	 */
	public MCList getBase_ave_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_adj_typ]の作成メソッド
	 */
	public MCList getBase_adj_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAdjTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_mrgn_expns_cd]の作成メソッド
	 */
	public MCList getBase_mrgn_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_purc_expns_cd]の作成メソッド
	 */
	public MCList getBase_purc_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_out_expns_cd]の作成メソッド
	 */
	public MCList getBase_out_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_inpt_expns_cd]の作成メソッド
	 */
	public MCList getBase_inpt_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_ss_expns_cd]の作成メソッド
	 */
	public MCList getBase_ss_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_prov_expns_cd]の作成メソッド
	 */
	public MCList getBase_prov_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_diff_use_typ]の作成メソッド
	 */
	public MCList getBase_diff_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDiffUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_lot_use_typ]の作成メソッド
	 */
	public MCList getBase_lot_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPsUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sublot_use_typ]の作成メソッド
	 */
	public MCList getBase_sublot_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPsUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sno1_use_typ]の作成メソッド
	 */
	public MCList getBase_sno1_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPsUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sno2_use_typ]の作成メソッド
	 */
	public MCList getBase_sno2_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPsUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sno3_use_typ]の作成メソッド
	 */
	public MCList getBase_sno3_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPsUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_sno4_use_typ]の作成メソッド
	 */
	public MCList getBase_sno4_use_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPsUseTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_def_calc_ctg_cd]の作成メソッド
	 */
	public MCList getBase_def_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_fix_dpt_cd]の作成メソッド
	 */
	public MCList getBase_fix_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_tmp_dpt_cd]の作成メソッド
	 */
	public MCList getBase_tmp_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Base_act_trd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getBase_act_trd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0010.Srch01")) {
			return new MA_MABGL0010_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0010.Upd01")) {
			return new MA_MABGL0010_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0010.Del01")) {
			return new MA_MABGL0010_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0010_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0010_Srch01Bridge() {
			p_MA_MABGL0010_Srch01 = new MCParam(PDef.MA_MABGL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0010.DtlR.class));

			p_MA_MABGL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0010.CndR up0() {
			return (mcframe.clientMABG.MABGP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0010.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0010.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABGL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0010_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0010.DtlR>)p_MA_MABGL0010_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABGL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0010_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0010_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0010_Upd01Bridge() {
			p_MA_MABGL0010_Upd01 = new MCParam(PDef.MA_MABGL0010_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0010_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0010.DtlR.class));
			// Down

			p_MA_MABGL0010_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0010_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0010_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0010_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0010_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0010.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0010.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0010_Upd01;
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
	 * [MA_MABGL0010_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0010_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0010_Del01;

		/** コンストラクタ */
		protected MA_MABGL0010_Del01Bridge() {
			p_MA_MABGL0010_Del01 = new MCParam(PDef.MA_MABGL0010_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0010_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0010.DtlR.class));
			// Down

			p_MA_MABGL0010_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0010_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0010_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0010_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0010_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0010.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0010.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0010_Del01;
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