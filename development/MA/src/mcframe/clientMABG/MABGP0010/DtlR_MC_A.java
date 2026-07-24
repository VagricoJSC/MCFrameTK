package mcframe.clientMABG.MABGP0010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public static final String $std_rnd_typ_nm = "std_rnd_typ_nm";
	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public static final String $std_dec_place = "std_dec_place";
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	/**
	 * Rounding type name (Amount) 金額端数処理区分名.<p>
	 *
	 */
	public static final String $amt_rnd_typ_nm = "amt_rnd_typ_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public static final String $ave_rnd_typ_nm = "ave_rnd_typ_nm";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public static final String $adj_typ = "adj_typ";
	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public static final String $adj_typ_nm = "adj_typ_nm";
	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public static final String $mrgn_expns_cd = "mrgn_expns_cd";
	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public static final String $mrgn_expns_nm = "mrgn_expns_nm";
	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public static final String $purc_expns_cd = "purc_expns_cd";
	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public static final String $purc_expns_nm = "purc_expns_nm";
	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public static final String $out_expns_cd = "out_expns_cd";
	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public static final String $out_expns_nm = "out_expns_nm";
	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public static final String $inpt_expns_cd = "inpt_expns_cd";
	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public static final String $inpt_expns_nm = "inpt_expns_nm";
	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public static final String $ss_expns_cd = "ss_expns_cd";
	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public static final String $ss_expns_nm = "ss_expns_nm";
	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public static final String $prov_expns_cd = "prov_expns_cd";
	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public static final String $prov_expns_nm = "prov_expns_nm";
	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public static final String $pre_alc_max_lvl = "pre_alc_max_lvl";
	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public static final String $pre_alc_max_rec = "pre_alc_max_rec";
	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public static final String $diff_use_typ = "diff_use_typ";
	/**
	 * Variance use type name 差異使用区分名.<p>
	 *
	 */
	public static final String $diff_use_typ_nm = "diff_use_typ_nm";
	/**
	 * Lot No. use type for production/sales ロットＮＯ生販使用区分.<p>
	 *
	 */
	public static final String $lot_use_typ = "lot_use_typ";
	/**
	 * Lot No. production/sales use type name ロットＮＯ生販使用区分名.<p>
	 *
	 */
	public static final String $lot_use_typ_nm = "lot_use_typ_nm";
	/**
	 * Sublot No. use type for production/sales サブロットＮＯ生販使用区分.<p>
	 *
	 */
	public static final String $sublot_use_typ = "sublot_use_typ";
	/**
	 * Sublot No. production/sales use type name サブロットＮＯ生販使用区分名.<p>
	 *
	 */
	public static final String $sublot_use_typ_nm = "sublot_use_typ_nm";
	/**
	 * SEIBAN No. 1 production/sales use type 手配ＮＯ１生販使用区分.<p>
	 *
	 */
	public static final String $sno1_use_typ = "sno1_use_typ";
	/**
	 * SEIBAN No. 1 production/sales type name 手配ＮＯ１生販使用区分名.<p>
	 *
	 */
	public static final String $sno1_use_typ_nm = "sno1_use_typ_nm";
	/**
	 * SEIBAN No. 2 production/sales use type 手配ＮＯ２生販使用区分.<p>
	 *
	 */
	public static final String $sno2_use_typ = "sno2_use_typ";
	/**
	 * SEIBAN No. 2 production/sales use type name 手配ＮＯ２生販使用区分名.<p>
	 *
	 */
	public static final String $sno2_use_typ_nm = "sno2_use_typ_nm";
	/**
	 * SEIBAN No. 3 production/sales use type 手配ＮＯ３生販使用区分.<p>
	 *
	 */
	public static final String $sno3_use_typ = "sno3_use_typ";
	/**
	 * SEIBAN No. 3 production/sales use type name 手配ＮＯ３生販使用区分名.<p>
	 *
	 */
	public static final String $sno3_use_typ_nm = "sno3_use_typ_nm";
	/**
	 * SEIBAN No. 4 production/sales use type 手配ＮＯ４生販使用区分.<p>
	 *
	 */
	public static final String $sno4_use_typ = "sno4_use_typ";
	/**
	 * SEIBAN No. 4 production/sales use type name 手配ＮＯ４生販使用区分名.<p>
	 *
	 */
	public static final String $sno4_use_typ_nm = "sno4_use_typ_nm";
	/**
	 * Default calculation category デフォルト計算カテゴリ.<p>
	 *
	 */
	public static final String $def_calc_ctg_cd = "def_calc_ctg_cd";
	/**
	 * Default calculation category name デフォルト計算カテゴリ名.<p>
	 *
	 */
	public static final String $def_calc_ctg_nm = "def_calc_ctg_nm";
	/**
	 * Constant management dept. cd. 固定管理部門ＣＤ.<p>
	 *
	 */
	public static final String $fix_dpt_cd = "fix_dpt_cd";
	/**
	 * Constant management dept. name 固定管理部門名.<p>
	 *
	 */
	public static final String $fix_dpt_nm = "fix_dpt_nm";
	/**
	 * Use standard unit cost at transfer ratio setting 振替比率設定時に標準単価を使用する.<p>
	 *
	 */
	public static final String $trd_ratio_flg = "trd_ratio_flg";
	/**
	 * Take in canceled slip 取り消した伝票を取り込む.<p>
	 *
	 */
	public static final String $stop_slip_flg = "stop_slip_flg";
	/**
	 * Do not import production data 生産データを取り込まない.<p>
	 *
	 */
	public static final String $non_prod_flg = "non_prod_flg";
	/**
	 * Import operation cd. as operation result No. 工程ＣＤを工程実績ＮＯとして取り込む.<p>
	 *
	 */
	public static final String $oper_sum_flg = "oper_sum_flg";
	/**
	 * Do not import sales data 販売データを取り込まない.<p>
	 *
	 */
	public static final String $non_sls_flg = "non_sls_flg";
	/**
	 * Import sales asset as production asset 販売資産を生産資産として取り込む.<p>
	 *
	 */
	public static final String $asst_flg = "asst_flg";
	/**
	 * Include receiving point inventory 出荷先の在庫を考慮する.<p>
	 *
	 */
	public static final String $stk_bp_flg = "stk_bp_flg";
	/**
	 * Do not import purchase data of items in transit 未着品仕入データを取り込まない.<p>
	 *
	 */
	public static final String $non_transit_flg = "non_transit_flg";
	/**
	 * WG with non-moving ワーキンググループ滞留使用.<p>
	 *
	 */
	public static final String $wg_non_mov_flg = "wg_non_mov_flg";
	/**
	 * Lot No.?with non-moving ロットＮＯ滞留使用.<p>
	 *
	 */
	public static final String $lot_non_mov_flg = "lot_non_mov_flg";
	/**
	 * Sublot No.?with non-moving サブロットＮＯ滞留使用.<p>
	 *
	 */
	public static final String $sublot_non_mov_flg = "sublot_non_mov_flg";
	/**
	 * SEIBAN No. 1 with non-moving 手配ＮＯ１滞留使用.<p>
	 *
	 */
	public static final String $sno1_non_mov_flg = "sno1_non_mov_flg";
	/**
	 * SEIBAN No. 2 with non-moving 手配ＮＯ２滞留使用.<p>
	 *
	 */
	public static final String $sno2_non_mov_flg = "sno2_non_mov_flg";
	/**
	 * SEIBAN No. 3 with non-moving 手配ＮＯ３滞留使用.<p>
	 *
	 */
	public static final String $sno3_non_mov_flg = "sno3_non_mov_flg";
	/**
	 * SEIBAN No. 4 with non-moving 手配ＮＯ４滞留使用.<p>
	 *
	 */
	public static final String $sno4_non_mov_flg = "sno4_non_mov_flg";
	/**
	 * Transfer dept. cd. 振替用部門ＣＤ.<p>
	 *
	 */
	public static final String $tmp_dpt_cd = "tmp_dpt_cd";
	/**
	 * Transfer dept. name 振替用部門名.<p>
	 *
	 */
	public static final String $tmp_dpt_nm = "tmp_dpt_nm";
	/**
	 * Result transfer calculation category cd. 実績振替計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $act_trd_calc_ctg_cd = "act_trd_calc_ctg_cd";
	/**
	 * Result transfer calculation category name 実績振替計算カテゴリ名.<p>
	 *
	 */
	public static final String $act_trd_calc_ctg_nm = "act_trd_calc_ctg_nm";
	/**
	 * Check existence of master マスタの存在チェックを行う.<p>
	 *
	 */
	public static final String $chk_mst_flg = "chk_mst_flg";
	/**
	 * Do not consolidate the inventory count 棚卸を集約しない.<p>
	 *
	 */
	public static final String $stktk_sum_flg = "stktk_sum_flg";
	/**
	 * Do not consolidate other accounting data 他勘定を集約しない.<p>
	 *
	 */
	public static final String $oth_ccn_sum_flg = "oth_ccn_sum_flg";
	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public static final String $amt_disp_digit = "amt_disp_digit";
	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public static final String $unit_disp_digit = "unit_disp_digit";
	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public static final String $std_disp_digit = "std_disp_digit";
	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public static final String $rate_disp_digit = "rate_disp_digit";
	/**
	 * Input/output planning data in Excel 計画データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public static final String $excel_pln_flg = "excel_pln_flg";
	/**
	 * Input/output result data in Excel 実績データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public static final String $excel_act_flg = "excel_act_flg";
	/**
	 * Input/output allocation data in Excel 配賦データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public static final String $excel_alc_flg = "excel_alc_flg";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_rnd_typ_nm_META = createCommonMeta($std_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta std_dec_place_META = createCommonMeta($std_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_rnd_typ_nm_META = createCommonMeta($amt_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_rnd_typ_nm_META = createCommonMeta($ave_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adj_typ_META = createCommonMeta($adj_typ, mcframe.commonMA.meta.MA_META.ADJ_TYP);
	public static final MCMeta adj_typ_nm_META = createCommonMeta($adj_typ_nm, mcframe.commonMA.meta.MA_META.ADJ_TYP_NM);
	public static final MCMeta mrgn_expns_cd_META = createCommonMeta($mrgn_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta mrgn_expns_nm_META = createCommonMeta($mrgn_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta purc_expns_cd_META = createCommonMeta($purc_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta purc_expns_nm_META = createCommonMeta($purc_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta out_expns_cd_META = createCommonMeta($out_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta out_expns_nm_META = createCommonMeta($out_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta inpt_expns_cd_META = createCommonMeta($inpt_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta inpt_expns_nm_META = createCommonMeta($inpt_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta ss_expns_cd_META = createCommonMeta($ss_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta ss_expns_nm_META = createCommonMeta($ss_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta prov_expns_cd_META = createCommonMeta($prov_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta prov_expns_nm_META = createCommonMeta($prov_expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
	public static final MCMeta pre_alc_max_lvl_META = createCommonMeta($pre_alc_max_lvl, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_LVL);
	public static final MCMeta pre_alc_max_rec_META = createCommonMeta($pre_alc_max_rec, mcframe.commonMA.meta.MA_META.PRE_ALC_MAX_REC);
	public static final MCMeta diff_use_typ_META = createCommonMeta($diff_use_typ, mcframe.commonMA.meta.MA_META.DIFF_USE_TYP);
	public static final MCMeta diff_use_typ_nm_META = createCommonMeta($diff_use_typ_nm, mcframe.commonMA.meta.MA_META.DIFF_USE_TYP_NM);
	public static final MCMeta lot_use_typ_META = createCommonMeta($lot_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta lot_use_typ_nm_META = createCommonMeta($lot_use_typ_nm, mcframe.commonMA.meta.MA_META.PS_USE_TYP_NM);
	public static final MCMeta sublot_use_typ_META = createCommonMeta($sublot_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sublot_use_typ_nm_META = createCommonMeta($sublot_use_typ_nm, mcframe.commonMA.meta.MA_META.PS_USE_TYP_NM);
	public static final MCMeta sno1_use_typ_META = createCommonMeta($sno1_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno1_use_typ_nm_META = createCommonMeta($sno1_use_typ_nm, mcframe.commonMA.meta.MA_META.PS_USE_TYP_NM);
	public static final MCMeta sno2_use_typ_META = createCommonMeta($sno2_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno2_use_typ_nm_META = createCommonMeta($sno2_use_typ_nm, mcframe.commonMA.meta.MA_META.PS_USE_TYP_NM);
	public static final MCMeta sno3_use_typ_META = createCommonMeta($sno3_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno3_use_typ_nm_META = createCommonMeta($sno3_use_typ_nm, mcframe.commonMA.meta.MA_META.PS_USE_TYP_NM);
	public static final MCMeta sno4_use_typ_META = createCommonMeta($sno4_use_typ, mcframe.commonMA.meta.MA_META.PS_USE_TYP);
	public static final MCMeta sno4_use_typ_nm_META = createCommonMeta($sno4_use_typ_nm, mcframe.commonMA.meta.MA_META.PS_USE_TYP_NM);
	public static final MCMeta def_calc_ctg_cd_META = createCommonMeta($def_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta def_calc_ctg_nm_META = createCommonMeta($def_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta fix_dpt_cd_META = createCommonMeta($fix_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta fix_dpt_nm_META = createCommonMeta($fix_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta trd_ratio_flg_META = createCommonMeta($trd_ratio_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stop_slip_flg_META = createCommonMeta($stop_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_prod_flg_META = createCommonMeta($non_prod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_sum_flg_META = createCommonMeta($oper_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_sls_flg_META = createCommonMeta($non_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_flg_META = createCommonMeta($asst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_bp_flg_META = createCommonMeta($stk_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_transit_flg_META = createCommonMeta($non_transit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_non_mov_flg_META = createCommonMeta($wg_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_non_mov_flg_META = createCommonMeta($lot_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_non_mov_flg_META = createCommonMeta($sublot_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_non_mov_flg_META = createCommonMeta($sno1_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_non_mov_flg_META = createCommonMeta($sno2_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_non_mov_flg_META = createCommonMeta($sno3_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_non_mov_flg_META = createCommonMeta($sno4_non_mov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tmp_dpt_cd_META = createCommonMeta($tmp_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta tmp_dpt_nm_META = createCommonMeta($tmp_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta act_trd_calc_ctg_cd_META = createCommonMeta($act_trd_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta act_trd_calc_ctg_nm_META = createCommonMeta($act_trd_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta chk_mst_flg_META = createCommonMeta($chk_mst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_sum_flg_META = createCommonMeta($stktk_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oth_ccn_sum_flg_META = createCommonMeta($oth_ccn_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_disp_digit_META = createCommonMeta($amt_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta unit_disp_digit_META = createCommonMeta($unit_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta std_disp_digit_META = createCommonMeta($std_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta rate_disp_digit_META = createCommonMeta($rate_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta excel_pln_flg_META = createCommonMeta($excel_pln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_act_flg_META = createCommonMeta($excel_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_alc_flg_META = createCommonMeta($excel_alc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			co_cd_META,
			std_rnd_typ_META,
			std_rnd_typ_nm_META,
			std_dec_place_META,
			amt_rnd_typ_META,
			amt_rnd_typ_nm_META,
			amt_dec_place_META,
			ave_rnd_typ_META,
			ave_rnd_typ_nm_META,
			ave_dec_place_META,
			adj_typ_META,
			adj_typ_nm_META,
			mrgn_expns_cd_META,
			mrgn_expns_nm_META,
			purc_expns_cd_META,
			purc_expns_nm_META,
			out_expns_cd_META,
			out_expns_nm_META,
			inpt_expns_cd_META,
			inpt_expns_nm_META,
			ss_expns_cd_META,
			ss_expns_nm_META,
			prov_expns_cd_META,
			prov_expns_nm_META,
			pre_alc_max_lvl_META,
			pre_alc_max_rec_META,
			diff_use_typ_META,
			diff_use_typ_nm_META,
			lot_use_typ_META,
			lot_use_typ_nm_META,
			sublot_use_typ_META,
			sublot_use_typ_nm_META,
			sno1_use_typ_META,
			sno1_use_typ_nm_META,
			sno2_use_typ_META,
			sno2_use_typ_nm_META,
			sno3_use_typ_META,
			sno3_use_typ_nm_META,
			sno4_use_typ_META,
			sno4_use_typ_nm_META,
			def_calc_ctg_cd_META,
			def_calc_ctg_nm_META,
			fix_dpt_cd_META,
			fix_dpt_nm_META,
			trd_ratio_flg_META,
			stop_slip_flg_META,
			non_prod_flg_META,
			oper_sum_flg_META,
			non_sls_flg_META,
			asst_flg_META,
			stk_bp_flg_META,
			non_transit_flg_META,
			wg_non_mov_flg_META,
			lot_non_mov_flg_META,
			sublot_non_mov_flg_META,
			sno1_non_mov_flg_META,
			sno2_non_mov_flg_META,
			sno3_non_mov_flg_META,
			sno4_non_mov_flg_META,
			tmp_dpt_cd_META,
			tmp_dpt_nm_META,
			act_trd_calc_ctg_cd_META,
			act_trd_calc_ctg_nm_META,
			chk_mst_flg_META,
			stktk_sum_flg_META,
			oth_ccn_sum_flg_META,
			amt_disp_digit_META,
			unit_disp_digit_META,
			std_disp_digit_META,
			rate_disp_digit_META,
			excel_pln_flg_META,
			excel_act_flg_META,
			excel_alc_flg_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$co_cd	// co_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_non_mov_flg, "WG"}	// wg_non_mov_flg
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 1, $co_cd);
	}

	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 1, $co_cd, value);
	}


	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 2, $std_rnd_typ);
	}

	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 2, $std_rnd_typ, value);
	}


	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public String std_rnd_typ_nm() {
		return getConstString(offset + 3, $std_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public void std_rnd_typ_nm(String value) {
		setConstString(offset + 3, $std_rnd_typ_nm, value);
	}


	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return getConstNumber(offset + 4, $std_dec_place);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(int value) {
		setConstNumber(offset + 4, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(long value) {
		setConstNumber(offset + 4, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(float value) {
		setConstNumber(offset + 4, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(double value) {
		setConstNumber(offset + 4, $std_dec_place, value);
	}


	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 5, $amt_rnd_typ);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 5, $amt_rnd_typ, value);
	}


	/**
	 * Rounding type name (Amount) 金額端数処理区分名.<p>
	 *
	 */
	public String amt_rnd_typ_nm() {
		return getConstString(offset + 6, $amt_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Amount) 金額端数処理区分名.<p>
	 *
	 */
	public void amt_rnd_typ_nm(String value) {
		setConstString(offset + 6, $amt_rnd_typ_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 7, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 7, $amt_dec_place, value);
	}


	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 8, $ave_rnd_typ);
	}

	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 8, $ave_rnd_typ, value);
	}


	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public String ave_rnd_typ_nm() {
		return getConstString(offset + 9, $ave_rnd_typ_nm);
	}

	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public void ave_rnd_typ_nm(String value) {
		setConstString(offset + 9, $ave_rnd_typ_nm, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 10, $ave_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 10, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 10, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 10, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 10, $ave_dec_place, value);
	}


	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public String adj_typ() {
		return getConstString(offset + 11, $adj_typ);
	}

	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public void adj_typ(String value) {
		setConstString(offset + 11, $adj_typ, value);
	}


	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public String adj_typ_nm() {
		return getConstString(offset + 12, $adj_typ_nm);
	}

	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public void adj_typ_nm(String value) {
		setConstString(offset + 12, $adj_typ_nm, value);
	}


	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return getConstString(offset + 13, $mrgn_expns_cd);
	}

	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		setConstString(offset + 13, $mrgn_expns_cd, value);
	}


	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public String mrgn_expns_nm() {
		return getConstString(offset + 14, $mrgn_expns_nm);
	}

	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public void mrgn_expns_nm(String value) {
		setConstString(offset + 14, $mrgn_expns_nm, value);
	}


	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public String purc_expns_cd() {
		return getConstString(offset + 15, $purc_expns_cd);
	}

	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		setConstString(offset + 15, $purc_expns_cd, value);
	}


	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public String purc_expns_nm() {
		return getConstString(offset + 16, $purc_expns_nm);
	}

	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public void purc_expns_nm(String value) {
		setConstString(offset + 16, $purc_expns_nm, value);
	}


	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public String out_expns_cd() {
		return getConstString(offset + 17, $out_expns_cd);
	}

	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public void out_expns_cd(String value) {
		setConstString(offset + 17, $out_expns_cd, value);
	}


	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public String out_expns_nm() {
		return getConstString(offset + 18, $out_expns_nm);
	}

	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public void out_expns_nm(String value) {
		setConstString(offset + 18, $out_expns_nm, value);
	}


	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public String inpt_expns_cd() {
		return getConstString(offset + 19, $inpt_expns_cd);
	}

	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		setConstString(offset + 19, $inpt_expns_cd, value);
	}


	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public String inpt_expns_nm() {
		return getConstString(offset + 20, $inpt_expns_nm);
	}

	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public void inpt_expns_nm(String value) {
		setConstString(offset + 20, $inpt_expns_nm, value);
	}


	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public String ss_expns_cd() {
		return getConstString(offset + 21, $ss_expns_cd);
	}

	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		setConstString(offset + 21, $ss_expns_cd, value);
	}


	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public String ss_expns_nm() {
		return getConstString(offset + 22, $ss_expns_nm);
	}

	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public void ss_expns_nm(String value) {
		setConstString(offset + 22, $ss_expns_nm, value);
	}


	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public String prov_expns_cd() {
		return getConstString(offset + 23, $prov_expns_cd);
	}

	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		setConstString(offset + 23, $prov_expns_cd, value);
	}


	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public String prov_expns_nm() {
		return getConstString(offset + 24, $prov_expns_nm);
	}

	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public void prov_expns_nm(String value) {
		setConstString(offset + 24, $prov_expns_nm, value);
	}


	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public MCNumber pre_alc_max_lvl() {
		return getConstNumber(offset + 25, $pre_alc_max_lvl);
	}

	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public void pre_alc_max_lvl(MCNumber value) {
		setConstNumber(offset + 25, $pre_alc_max_lvl, value);
	}

	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public void pre_alc_max_lvl(int value) {
		setConstNumber(offset + 25, $pre_alc_max_lvl, value);
	}

	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public void pre_alc_max_lvl(long value) {
		setConstNumber(offset + 25, $pre_alc_max_lvl, value);
	}

	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public void pre_alc_max_lvl(float value) {
		setConstNumber(offset + 25, $pre_alc_max_lvl, value);
	}

	/**
	 * Departmental alloc. max. hierarchy 一次配賦最大階層.<p>
	 *
	 */
	public void pre_alc_max_lvl(double value) {
		setConstNumber(offset + 25, $pre_alc_max_lvl, value);
	}


	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public MCNumber pre_alc_max_rec() {
		return getConstNumber(offset + 26, $pre_alc_max_rec);
	}

	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public void pre_alc_max_rec(MCNumber value) {
		setConstNumber(offset + 26, $pre_alc_max_rec, value);
	}

	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public void pre_alc_max_rec(int value) {
		setConstNumber(offset + 26, $pre_alc_max_rec, value);
	}

	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public void pre_alc_max_rec(long value) {
		setConstNumber(offset + 26, $pre_alc_max_rec, value);
	}

	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public void pre_alc_max_rec(float value) {
		setConstNumber(offset + 26, $pre_alc_max_rec, value);
	}

	/**
	 * Departmental alloc. max. number of records 一次配賦最大レコード数.<p>
	 *
	 */
	public void pre_alc_max_rec(double value) {
		setConstNumber(offset + 26, $pre_alc_max_rec, value);
	}


	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public String diff_use_typ() {
		return getConstString(offset + 27, $diff_use_typ);
	}

	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public void diff_use_typ(String value) {
		setConstString(offset + 27, $diff_use_typ, value);
	}


	/**
	 * Variance use type name 差異使用区分名.<p>
	 *
	 */
	public String diff_use_typ_nm() {
		return getConstString(offset + 28, $diff_use_typ_nm);
	}

	/**
	 * Variance use type name 差異使用区分名.<p>
	 *
	 */
	public void diff_use_typ_nm(String value) {
		setConstString(offset + 28, $diff_use_typ_nm, value);
	}


	/**
	 * Lot No. use type for production/sales ロットＮＯ生販使用区分.<p>
	 *
	 */
	public String lot_use_typ() {
		return getConstString(offset + 29, $lot_use_typ);
	}

	/**
	 * Lot No. use type for production/sales ロットＮＯ生販使用区分.<p>
	 *
	 */
	public void lot_use_typ(String value) {
		setConstString(offset + 29, $lot_use_typ, value);
	}


	/**
	 * Lot No. production/sales use type name ロットＮＯ生販使用区分名.<p>
	 *
	 */
	public String lot_use_typ_nm() {
		return getConstString(offset + 30, $lot_use_typ_nm);
	}

	/**
	 * Lot No. production/sales use type name ロットＮＯ生販使用区分名.<p>
	 *
	 */
	public void lot_use_typ_nm(String value) {
		setConstString(offset + 30, $lot_use_typ_nm, value);
	}


	/**
	 * Sublot No. use type for production/sales サブロットＮＯ生販使用区分.<p>
	 *
	 */
	public String sublot_use_typ() {
		return getConstString(offset + 31, $sublot_use_typ);
	}

	/**
	 * Sublot No. use type for production/sales サブロットＮＯ生販使用区分.<p>
	 *
	 */
	public void sublot_use_typ(String value) {
		setConstString(offset + 31, $sublot_use_typ, value);
	}


	/**
	 * Sublot No. production/sales use type name サブロットＮＯ生販使用区分名.<p>
	 *
	 */
	public String sublot_use_typ_nm() {
		return getConstString(offset + 32, $sublot_use_typ_nm);
	}

	/**
	 * Sublot No. production/sales use type name サブロットＮＯ生販使用区分名.<p>
	 *
	 */
	public void sublot_use_typ_nm(String value) {
		setConstString(offset + 32, $sublot_use_typ_nm, value);
	}


	/**
	 * SEIBAN No. 1 production/sales use type 手配ＮＯ１生販使用区分.<p>
	 *
	 */
	public String sno1_use_typ() {
		return getConstString(offset + 33, $sno1_use_typ);
	}

	/**
	 * SEIBAN No. 1 production/sales use type 手配ＮＯ１生販使用区分.<p>
	 *
	 */
	public void sno1_use_typ(String value) {
		setConstString(offset + 33, $sno1_use_typ, value);
	}


	/**
	 * SEIBAN No. 1 production/sales type name 手配ＮＯ１生販使用区分名.<p>
	 *
	 */
	public String sno1_use_typ_nm() {
		return getConstString(offset + 34, $sno1_use_typ_nm);
	}

	/**
	 * SEIBAN No. 1 production/sales type name 手配ＮＯ１生販使用区分名.<p>
	 *
	 */
	public void sno1_use_typ_nm(String value) {
		setConstString(offset + 34, $sno1_use_typ_nm, value);
	}


	/**
	 * SEIBAN No. 2 production/sales use type 手配ＮＯ２生販使用区分.<p>
	 *
	 */
	public String sno2_use_typ() {
		return getConstString(offset + 35, $sno2_use_typ);
	}

	/**
	 * SEIBAN No. 2 production/sales use type 手配ＮＯ２生販使用区分.<p>
	 *
	 */
	public void sno2_use_typ(String value) {
		setConstString(offset + 35, $sno2_use_typ, value);
	}


	/**
	 * SEIBAN No. 2 production/sales use type name 手配ＮＯ２生販使用区分名.<p>
	 *
	 */
	public String sno2_use_typ_nm() {
		return getConstString(offset + 36, $sno2_use_typ_nm);
	}

	/**
	 * SEIBAN No. 2 production/sales use type name 手配ＮＯ２生販使用区分名.<p>
	 *
	 */
	public void sno2_use_typ_nm(String value) {
		setConstString(offset + 36, $sno2_use_typ_nm, value);
	}


	/**
	 * SEIBAN No. 3 production/sales use type 手配ＮＯ３生販使用区分.<p>
	 *
	 */
	public String sno3_use_typ() {
		return getConstString(offset + 37, $sno3_use_typ);
	}

	/**
	 * SEIBAN No. 3 production/sales use type 手配ＮＯ３生販使用区分.<p>
	 *
	 */
	public void sno3_use_typ(String value) {
		setConstString(offset + 37, $sno3_use_typ, value);
	}


	/**
	 * SEIBAN No. 3 production/sales use type name 手配ＮＯ３生販使用区分名.<p>
	 *
	 */
	public String sno3_use_typ_nm() {
		return getConstString(offset + 38, $sno3_use_typ_nm);
	}

	/**
	 * SEIBAN No. 3 production/sales use type name 手配ＮＯ３生販使用区分名.<p>
	 *
	 */
	public void sno3_use_typ_nm(String value) {
		setConstString(offset + 38, $sno3_use_typ_nm, value);
	}


	/**
	 * SEIBAN No. 4 production/sales use type 手配ＮＯ４生販使用区分.<p>
	 *
	 */
	public String sno4_use_typ() {
		return getConstString(offset + 39, $sno4_use_typ);
	}

	/**
	 * SEIBAN No. 4 production/sales use type 手配ＮＯ４生販使用区分.<p>
	 *
	 */
	public void sno4_use_typ(String value) {
		setConstString(offset + 39, $sno4_use_typ, value);
	}


	/**
	 * SEIBAN No. 4 production/sales use type name 手配ＮＯ４生販使用区分名.<p>
	 *
	 */
	public String sno4_use_typ_nm() {
		return getConstString(offset + 40, $sno4_use_typ_nm);
	}

	/**
	 * SEIBAN No. 4 production/sales use type name 手配ＮＯ４生販使用区分名.<p>
	 *
	 */
	public void sno4_use_typ_nm(String value) {
		setConstString(offset + 40, $sno4_use_typ_nm, value);
	}


	/**
	 * Default calculation category デフォルト計算カテゴリ.<p>
	 *
	 */
	public String def_calc_ctg_cd() {
		return getConstString(offset + 41, $def_calc_ctg_cd);
	}

	/**
	 * Default calculation category デフォルト計算カテゴリ.<p>
	 *
	 */
	public void def_calc_ctg_cd(String value) {
		setConstString(offset + 41, $def_calc_ctg_cd, value);
	}


	/**
	 * Default calculation category name デフォルト計算カテゴリ名.<p>
	 *
	 */
	public String def_calc_ctg_nm() {
		return getConstString(offset + 42, $def_calc_ctg_nm);
	}

	/**
	 * Default calculation category name デフォルト計算カテゴリ名.<p>
	 *
	 */
	public void def_calc_ctg_nm(String value) {
		setConstString(offset + 42, $def_calc_ctg_nm, value);
	}


	/**
	 * Constant management dept. cd. 固定管理部門ＣＤ.<p>
	 *
	 */
	public String fix_dpt_cd() {
		return getConstString(offset + 43, $fix_dpt_cd);
	}

	/**
	 * Constant management dept. cd. 固定管理部門ＣＤ.<p>
	 *
	 */
	public void fix_dpt_cd(String value) {
		setConstString(offset + 43, $fix_dpt_cd, value);
	}


	/**
	 * Constant management dept. name 固定管理部門名.<p>
	 *
	 */
	public String fix_dpt_nm() {
		return getConstString(offset + 44, $fix_dpt_nm);
	}

	/**
	 * Constant management dept. name 固定管理部門名.<p>
	 *
	 */
	public void fix_dpt_nm(String value) {
		setConstString(offset + 44, $fix_dpt_nm, value);
	}


	/**
	 * Use standard unit cost at transfer ratio setting 振替比率設定時に標準単価を使用する.<p>
	 *
	 */
	public boolean trd_ratio_flg() {
		return getConstBoolean(offset + 45, $trd_ratio_flg);
	}

	/**
	 * Use standard unit cost at transfer ratio setting 振替比率設定時に標準単価を使用する.<p>
	 *
	 */
	public void trd_ratio_flg(boolean value) {
		setConstBoolean(offset + 45, $trd_ratio_flg, value);
	}


	/**
	 * Take in canceled slip 取り消した伝票を取り込む.<p>
	 *
	 */
	public boolean stop_slip_flg() {
		return getConstBoolean(offset + 46, $stop_slip_flg);
	}

	/**
	 * Take in canceled slip 取り消した伝票を取り込む.<p>
	 *
	 */
	public void stop_slip_flg(boolean value) {
		setConstBoolean(offset + 46, $stop_slip_flg, value);
	}


	/**
	 * Do not import production data 生産データを取り込まない.<p>
	 *
	 */
	public boolean non_prod_flg() {
		return getConstBoolean(offset + 47, $non_prod_flg);
	}

	/**
	 * Do not import production data 生産データを取り込まない.<p>
	 *
	 */
	public void non_prod_flg(boolean value) {
		setConstBoolean(offset + 47, $non_prod_flg, value);
	}


	/**
	 * Import operation cd. as operation result No. 工程ＣＤを工程実績ＮＯとして取り込む.<p>
	 *
	 */
	public boolean oper_sum_flg() {
		return getConstBoolean(offset + 48, $oper_sum_flg);
	}

	/**
	 * Import operation cd. as operation result No. 工程ＣＤを工程実績ＮＯとして取り込む.<p>
	 *
	 */
	public void oper_sum_flg(boolean value) {
		setConstBoolean(offset + 48, $oper_sum_flg, value);
	}


	/**
	 * Do not import sales data 販売データを取り込まない.<p>
	 *
	 */
	public boolean non_sls_flg() {
		return getConstBoolean(offset + 49, $non_sls_flg);
	}

	/**
	 * Do not import sales data 販売データを取り込まない.<p>
	 *
	 */
	public void non_sls_flg(boolean value) {
		setConstBoolean(offset + 49, $non_sls_flg, value);
	}


	/**
	 * Import sales asset as production asset 販売資産を生産資産として取り込む.<p>
	 *
	 */
	public boolean asst_flg() {
		return getConstBoolean(offset + 50, $asst_flg);
	}

	/**
	 * Import sales asset as production asset 販売資産を生産資産として取り込む.<p>
	 *
	 */
	public void asst_flg(boolean value) {
		setConstBoolean(offset + 50, $asst_flg, value);
	}


	/**
	 * Include receiving point inventory 出荷先の在庫を考慮する.<p>
	 *
	 */
	public boolean stk_bp_flg() {
		return getConstBoolean(offset + 51, $stk_bp_flg);
	}

	/**
	 * Include receiving point inventory 出荷先の在庫を考慮する.<p>
	 *
	 */
	public void stk_bp_flg(boolean value) {
		setConstBoolean(offset + 51, $stk_bp_flg, value);
	}


	/**
	 * Do not import purchase data of items in transit 未着品仕入データを取り込まない.<p>
	 *
	 */
	public boolean non_transit_flg() {
		return getConstBoolean(offset + 52, $non_transit_flg);
	}

	/**
	 * Do not import purchase data of items in transit 未着品仕入データを取り込まない.<p>
	 *
	 */
	public void non_transit_flg(boolean value) {
		setConstBoolean(offset + 52, $non_transit_flg, value);
	}


	/**
	 * WG with non-moving ワーキンググループ滞留使用.<p>
	 *
	 */
	public boolean wg_non_mov_flg() {
		return getConstBoolean(offset + 53, $wg_non_mov_flg);
	}

	/**
	 * WG with non-moving ワーキンググループ滞留使用.<p>
	 *
	 */
	public void wg_non_mov_flg(boolean value) {
		setConstBoolean(offset + 53, $wg_non_mov_flg, value);
	}


	/**
	 * Lot No.?with non-moving ロットＮＯ滞留使用.<p>
	 *
	 */
	public boolean lot_non_mov_flg() {
		return getConstBoolean(offset + 54, $lot_non_mov_flg);
	}

	/**
	 * Lot No.?with non-moving ロットＮＯ滞留使用.<p>
	 *
	 */
	public void lot_non_mov_flg(boolean value) {
		setConstBoolean(offset + 54, $lot_non_mov_flg, value);
	}


	/**
	 * Sublot No.?with non-moving サブロットＮＯ滞留使用.<p>
	 *
	 */
	public boolean sublot_non_mov_flg() {
		return getConstBoolean(offset + 55, $sublot_non_mov_flg);
	}

	/**
	 * Sublot No.?with non-moving サブロットＮＯ滞留使用.<p>
	 *
	 */
	public void sublot_non_mov_flg(boolean value) {
		setConstBoolean(offset + 55, $sublot_non_mov_flg, value);
	}


	/**
	 * SEIBAN No. 1 with non-moving 手配ＮＯ１滞留使用.<p>
	 *
	 */
	public boolean sno1_non_mov_flg() {
		return getConstBoolean(offset + 56, $sno1_non_mov_flg);
	}

	/**
	 * SEIBAN No. 1 with non-moving 手配ＮＯ１滞留使用.<p>
	 *
	 */
	public void sno1_non_mov_flg(boolean value) {
		setConstBoolean(offset + 56, $sno1_non_mov_flg, value);
	}


	/**
	 * SEIBAN No. 2 with non-moving 手配ＮＯ２滞留使用.<p>
	 *
	 */
	public boolean sno2_non_mov_flg() {
		return getConstBoolean(offset + 57, $sno2_non_mov_flg);
	}

	/**
	 * SEIBAN No. 2 with non-moving 手配ＮＯ２滞留使用.<p>
	 *
	 */
	public void sno2_non_mov_flg(boolean value) {
		setConstBoolean(offset + 57, $sno2_non_mov_flg, value);
	}


	/**
	 * SEIBAN No. 3 with non-moving 手配ＮＯ３滞留使用.<p>
	 *
	 */
	public boolean sno3_non_mov_flg() {
		return getConstBoolean(offset + 58, $sno3_non_mov_flg);
	}

	/**
	 * SEIBAN No. 3 with non-moving 手配ＮＯ３滞留使用.<p>
	 *
	 */
	public void sno3_non_mov_flg(boolean value) {
		setConstBoolean(offset + 58, $sno3_non_mov_flg, value);
	}


	/**
	 * SEIBAN No. 4 with non-moving 手配ＮＯ４滞留使用.<p>
	 *
	 */
	public boolean sno4_non_mov_flg() {
		return getConstBoolean(offset + 59, $sno4_non_mov_flg);
	}

	/**
	 * SEIBAN No. 4 with non-moving 手配ＮＯ４滞留使用.<p>
	 *
	 */
	public void sno4_non_mov_flg(boolean value) {
		setConstBoolean(offset + 59, $sno4_non_mov_flg, value);
	}


	/**
	 * Transfer dept. cd. 振替用部門ＣＤ.<p>
	 *
	 */
	public String tmp_dpt_cd() {
		return getConstString(offset + 60, $tmp_dpt_cd);
	}

	/**
	 * Transfer dept. cd. 振替用部門ＣＤ.<p>
	 *
	 */
	public void tmp_dpt_cd(String value) {
		setConstString(offset + 60, $tmp_dpt_cd, value);
	}


	/**
	 * Transfer dept. name 振替用部門名.<p>
	 *
	 */
	public String tmp_dpt_nm() {
		return getConstString(offset + 61, $tmp_dpt_nm);
	}

	/**
	 * Transfer dept. name 振替用部門名.<p>
	 *
	 */
	public void tmp_dpt_nm(String value) {
		setConstString(offset + 61, $tmp_dpt_nm, value);
	}


	/**
	 * Result transfer calculation category cd. 実績振替計算カテゴリＣＤ.<p>
	 *
	 */
	public String act_trd_calc_ctg_cd() {
		return getConstString(offset + 62, $act_trd_calc_ctg_cd);
	}

	/**
	 * Result transfer calculation category cd. 実績振替計算カテゴリＣＤ.<p>
	 *
	 */
	public void act_trd_calc_ctg_cd(String value) {
		setConstString(offset + 62, $act_trd_calc_ctg_cd, value);
	}


	/**
	 * Result transfer calculation category name 実績振替計算カテゴリ名.<p>
	 *
	 */
	public String act_trd_calc_ctg_nm() {
		return getConstString(offset + 63, $act_trd_calc_ctg_nm);
	}

	/**
	 * Result transfer calculation category name 実績振替計算カテゴリ名.<p>
	 *
	 */
	public void act_trd_calc_ctg_nm(String value) {
		setConstString(offset + 63, $act_trd_calc_ctg_nm, value);
	}


	/**
	 * Check existence of master マスタの存在チェックを行う.<p>
	 *
	 */
	public boolean chk_mst_flg() {
		return getConstBoolean(offset + 64, $chk_mst_flg);
	}

	/**
	 * Check existence of master マスタの存在チェックを行う.<p>
	 *
	 */
	public void chk_mst_flg(boolean value) {
		setConstBoolean(offset + 64, $chk_mst_flg, value);
	}


	/**
	 * Do not consolidate the inventory count 棚卸を集約しない.<p>
	 *
	 */
	public boolean stktk_sum_flg() {
		return getConstBoolean(offset + 65, $stktk_sum_flg);
	}

	/**
	 * Do not consolidate the inventory count 棚卸を集約しない.<p>
	 *
	 */
	public void stktk_sum_flg(boolean value) {
		setConstBoolean(offset + 65, $stktk_sum_flg, value);
	}


	/**
	 * Do not consolidate other accounting data 他勘定を集約しない.<p>
	 *
	 */
	public boolean oth_ccn_sum_flg() {
		return getConstBoolean(offset + 66, $oth_ccn_sum_flg);
	}

	/**
	 * Do not consolidate other accounting data 他勘定を集約しない.<p>
	 *
	 */
	public void oth_ccn_sum_flg(boolean value) {
		setConstBoolean(offset + 66, $oth_ccn_sum_flg, value);
	}


	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCNumber amt_disp_digit() {
		return getConstNumber(offset + 67, $amt_disp_digit);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(MCNumber value) {
		setConstNumber(offset + 67, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(int value) {
		setConstNumber(offset + 67, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(long value) {
		setConstNumber(offset + 67, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(float value) {
		setConstNumber(offset + 67, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(double value) {
		setConstNumber(offset + 67, $amt_disp_digit, value);
	}


	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCNumber unit_disp_digit() {
		return getConstNumber(offset + 68, $unit_disp_digit);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(MCNumber value) {
		setConstNumber(offset + 68, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(int value) {
		setConstNumber(offset + 68, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(long value) {
		setConstNumber(offset + 68, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(float value) {
		setConstNumber(offset + 68, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(double value) {
		setConstNumber(offset + 68, $unit_disp_digit, value);
	}


	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCNumber std_disp_digit() {
		return getConstNumber(offset + 69, $std_disp_digit);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(MCNumber value) {
		setConstNumber(offset + 69, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(int value) {
		setConstNumber(offset + 69, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(long value) {
		setConstNumber(offset + 69, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(float value) {
		setConstNumber(offset + 69, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(double value) {
		setConstNumber(offset + 69, $std_disp_digit, value);
	}


	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCNumber rate_disp_digit() {
		return getConstNumber(offset + 70, $rate_disp_digit);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(MCNumber value) {
		setConstNumber(offset + 70, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(int value) {
		setConstNumber(offset + 70, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(long value) {
		setConstNumber(offset + 70, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(float value) {
		setConstNumber(offset + 70, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(double value) {
		setConstNumber(offset + 70, $rate_disp_digit, value);
	}


	/**
	 * Input/output planning data in Excel 計画データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public boolean excel_pln_flg() {
		return getConstBoolean(offset + 71, $excel_pln_flg);
	}

	/**
	 * Input/output planning data in Excel 計画データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public void excel_pln_flg(boolean value) {
		setConstBoolean(offset + 71, $excel_pln_flg, value);
	}


	/**
	 * Input/output result data in Excel 実績データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public boolean excel_act_flg() {
		return getConstBoolean(offset + 72, $excel_act_flg);
	}

	/**
	 * Input/output result data in Excel 実績データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public void excel_act_flg(boolean value) {
		setConstBoolean(offset + 72, $excel_act_flg, value);
	}


	/**
	 * Input/output allocation data in Excel 配賦データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public boolean excel_alc_flg() {
		return getConstBoolean(offset + 73, $excel_alc_flg);
	}

	/**
	 * Input/output allocation data in Excel 配賦データをＥＸＣＥＬで入出力する.<p>
	 *
	 */
	public void excel_alc_flg(boolean value) {
		setConstBoolean(offset + 73, $excel_alc_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 74, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 74, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 75, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 75, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 76, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 77, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 77, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 78, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 78, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 79, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 80, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 80, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 81, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 81, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 82, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 82, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 83, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 83, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 84, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 84, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 85, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 85, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			return std_rnd_typ_nm();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return amt_rnd_typ_nm();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			return ave_rnd_typ_nm();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			return adj_typ_nm();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			return diff_use_typ();
		}
		if ($diff_use_typ_nm.equalsIgnoreCase(name)) {
			return diff_use_typ_nm();
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			return lot_use_typ();
		}
		if ($lot_use_typ_nm.equalsIgnoreCase(name)) {
			return lot_use_typ_nm();
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			return sublot_use_typ();
		}
		if ($sublot_use_typ_nm.equalsIgnoreCase(name)) {
			return sublot_use_typ_nm();
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			return sno1_use_typ();
		}
		if ($sno1_use_typ_nm.equalsIgnoreCase(name)) {
			return sno1_use_typ_nm();
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			return sno2_use_typ();
		}
		if ($sno2_use_typ_nm.equalsIgnoreCase(name)) {
			return sno2_use_typ_nm();
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			return sno3_use_typ();
		}
		if ($sno3_use_typ_nm.equalsIgnoreCase(name)) {
			return sno3_use_typ_nm();
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			return sno4_use_typ();
		}
		if ($sno4_use_typ_nm.equalsIgnoreCase(name)) {
			return sno4_use_typ_nm();
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			return def_calc_ctg_cd();
		}
		if ($def_calc_ctg_nm.equalsIgnoreCase(name)) {
			return def_calc_ctg_nm();
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			return fix_dpt_cd();
		}
		if ($fix_dpt_nm.equalsIgnoreCase(name)) {
			return fix_dpt_nm();
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			return tmp_dpt_cd();
		}
		if ($tmp_dpt_nm.equalsIgnoreCase(name)) {
			return tmp_dpt_nm();
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_trd_calc_ctg_cd();
		}
		if ($act_trd_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_trd_calc_ctg_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			return pre_alc_max_lvl();
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			return pre_alc_max_rec();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			return trd_ratio_flg();
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			return stop_slip_flg();
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			return non_prod_flg();
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			return oper_sum_flg();
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			return non_sls_flg();
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			return asst_flg();
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			return stk_bp_flg();
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			return non_transit_flg();
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			return wg_non_mov_flg();
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			return lot_non_mov_flg();
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			return sublot_non_mov_flg();
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			return sno1_non_mov_flg();
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			return sno2_non_mov_flg();
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			return sno3_non_mov_flg();
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			return sno4_non_mov_flg();
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			return chk_mst_flg();
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			return stktk_sum_flg();
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			return oth_ccn_sum_flg();
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			return std_rnd_typ_nm();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			return amt_rnd_typ_nm();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			return ave_rnd_typ_nm();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			return adj_typ_nm();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			return mrgn_expns_nm();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			return purc_expns_nm();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			return out_expns_nm();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			return inpt_expns_nm();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			return ss_expns_nm();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			return prov_expns_nm();
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			return diff_use_typ();
		}
		if ($diff_use_typ_nm.equalsIgnoreCase(name)) {
			return diff_use_typ_nm();
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			return lot_use_typ();
		}
		if ($lot_use_typ_nm.equalsIgnoreCase(name)) {
			return lot_use_typ_nm();
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			return sublot_use_typ();
		}
		if ($sublot_use_typ_nm.equalsIgnoreCase(name)) {
			return sublot_use_typ_nm();
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			return sno1_use_typ();
		}
		if ($sno1_use_typ_nm.equalsIgnoreCase(name)) {
			return sno1_use_typ_nm();
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			return sno2_use_typ();
		}
		if ($sno2_use_typ_nm.equalsIgnoreCase(name)) {
			return sno2_use_typ_nm();
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			return sno3_use_typ();
		}
		if ($sno3_use_typ_nm.equalsIgnoreCase(name)) {
			return sno3_use_typ_nm();
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			return sno4_use_typ();
		}
		if ($sno4_use_typ_nm.equalsIgnoreCase(name)) {
			return sno4_use_typ_nm();
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			return def_calc_ctg_cd();
		}
		if ($def_calc_ctg_nm.equalsIgnoreCase(name)) {
			return def_calc_ctg_nm();
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			return fix_dpt_cd();
		}
		if ($fix_dpt_nm.equalsIgnoreCase(name)) {
			return fix_dpt_nm();
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			return tmp_dpt_cd();
		}
		if ($tmp_dpt_nm.equalsIgnoreCase(name)) {
			return tmp_dpt_nm();
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_trd_calc_ctg_cd();
		}
		if ($act_trd_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_trd_calc_ctg_nm();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			return pre_alc_max_lvl();
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			return pre_alc_max_rec();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			return trd_ratio_flg();
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			return stop_slip_flg();
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			return non_prod_flg();
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			return oper_sum_flg();
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			return non_sls_flg();
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			return asst_flg();
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			return stk_bp_flg();
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			return non_transit_flg();
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			return wg_non_mov_flg();
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			return lot_non_mov_flg();
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			return sublot_non_mov_flg();
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			return sno1_non_mov_flg();
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			return sno2_non_mov_flg();
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			return sno3_non_mov_flg();
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			return sno4_non_mov_flg();
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			return chk_mst_flg();
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			return stktk_sum_flg();
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			return oth_ccn_sum_flg();
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			std_rnd_typ_nm(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			amt_rnd_typ_nm(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			ave_rnd_typ_nm(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			adj_typ_nm(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			diff_use_typ(value);
			return;
		}
		if ($diff_use_typ_nm.equalsIgnoreCase(name)) {
			diff_use_typ_nm(value);
			return;
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			lot_use_typ(value);
			return;
		}
		if ($lot_use_typ_nm.equalsIgnoreCase(name)) {
			lot_use_typ_nm(value);
			return;
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			sublot_use_typ(value);
			return;
		}
		if ($sublot_use_typ_nm.equalsIgnoreCase(name)) {
			sublot_use_typ_nm(value);
			return;
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			sno1_use_typ(value);
			return;
		}
		if ($sno1_use_typ_nm.equalsIgnoreCase(name)) {
			sno1_use_typ_nm(value);
			return;
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			sno2_use_typ(value);
			return;
		}
		if ($sno2_use_typ_nm.equalsIgnoreCase(name)) {
			sno2_use_typ_nm(value);
			return;
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			sno3_use_typ(value);
			return;
		}
		if ($sno3_use_typ_nm.equalsIgnoreCase(name)) {
			sno3_use_typ_nm(value);
			return;
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			sno4_use_typ(value);
			return;
		}
		if ($sno4_use_typ_nm.equalsIgnoreCase(name)) {
			sno4_use_typ_nm(value);
			return;
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			def_calc_ctg_cd(value);
			return;
		}
		if ($def_calc_ctg_nm.equalsIgnoreCase(name)) {
			def_calc_ctg_nm(value);
			return;
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			fix_dpt_cd(value);
			return;
		}
		if ($fix_dpt_nm.equalsIgnoreCase(name)) {
			fix_dpt_nm(value);
			return;
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			tmp_dpt_cd(value);
			return;
		}
		if ($tmp_dpt_nm.equalsIgnoreCase(name)) {
			tmp_dpt_nm(value);
			return;
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_trd_calc_ctg_cd(value);
			return;
		}
		if ($act_trd_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_trd_calc_ctg_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			trd_ratio_flg(value);
			return;
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			stop_slip_flg(value);
			return;
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			non_prod_flg(value);
			return;
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			oper_sum_flg(value);
			return;
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			non_sls_flg(value);
			return;
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			asst_flg(value);
			return;
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			stk_bp_flg(value);
			return;
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			non_transit_flg(value);
			return;
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			wg_non_mov_flg(value);
			return;
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			lot_non_mov_flg(value);
			return;
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			sublot_non_mov_flg(value);
			return;
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			sno1_non_mov_flg(value);
			return;
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			sno2_non_mov_flg(value);
			return;
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			sno3_non_mov_flg(value);
			return;
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			sno4_non_mov_flg(value);
			return;
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			chk_mst_flg(value);
			return;
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			stktk_sum_flg(value);
			return;
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			oth_ccn_sum_flg(value);
			return;
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			std_rnd_typ_nm(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ_nm.equalsIgnoreCase(name)) {
			amt_rnd_typ_nm(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ_nm.equalsIgnoreCase(name)) {
			ave_rnd_typ_nm(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($adj_typ_nm.equalsIgnoreCase(name)) {
			adj_typ_nm(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($mrgn_expns_nm.equalsIgnoreCase(name)) {
			mrgn_expns_nm(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($purc_expns_nm.equalsIgnoreCase(name)) {
			purc_expns_nm(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($out_expns_nm.equalsIgnoreCase(name)) {
			out_expns_nm(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($inpt_expns_nm.equalsIgnoreCase(name)) {
			inpt_expns_nm(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($ss_expns_nm.equalsIgnoreCase(name)) {
			ss_expns_nm(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($prov_expns_nm.equalsIgnoreCase(name)) {
			prov_expns_nm(value);
			return;
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			diff_use_typ(value);
			return;
		}
		if ($diff_use_typ_nm.equalsIgnoreCase(name)) {
			diff_use_typ_nm(value);
			return;
		}
		if ($lot_use_typ.equalsIgnoreCase(name)) {
			lot_use_typ(value);
			return;
		}
		if ($lot_use_typ_nm.equalsIgnoreCase(name)) {
			lot_use_typ_nm(value);
			return;
		}
		if ($sublot_use_typ.equalsIgnoreCase(name)) {
			sublot_use_typ(value);
			return;
		}
		if ($sublot_use_typ_nm.equalsIgnoreCase(name)) {
			sublot_use_typ_nm(value);
			return;
		}
		if ($sno1_use_typ.equalsIgnoreCase(name)) {
			sno1_use_typ(value);
			return;
		}
		if ($sno1_use_typ_nm.equalsIgnoreCase(name)) {
			sno1_use_typ_nm(value);
			return;
		}
		if ($sno2_use_typ.equalsIgnoreCase(name)) {
			sno2_use_typ(value);
			return;
		}
		if ($sno2_use_typ_nm.equalsIgnoreCase(name)) {
			sno2_use_typ_nm(value);
			return;
		}
		if ($sno3_use_typ.equalsIgnoreCase(name)) {
			sno3_use_typ(value);
			return;
		}
		if ($sno3_use_typ_nm.equalsIgnoreCase(name)) {
			sno3_use_typ_nm(value);
			return;
		}
		if ($sno4_use_typ.equalsIgnoreCase(name)) {
			sno4_use_typ(value);
			return;
		}
		if ($sno4_use_typ_nm.equalsIgnoreCase(name)) {
			sno4_use_typ_nm(value);
			return;
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			def_calc_ctg_cd(value);
			return;
		}
		if ($def_calc_ctg_nm.equalsIgnoreCase(name)) {
			def_calc_ctg_nm(value);
			return;
		}
		if ($fix_dpt_cd.equalsIgnoreCase(name)) {
			fix_dpt_cd(value);
			return;
		}
		if ($fix_dpt_nm.equalsIgnoreCase(name)) {
			fix_dpt_nm(value);
			return;
		}
		if ($tmp_dpt_cd.equalsIgnoreCase(name)) {
			tmp_dpt_cd(value);
			return;
		}
		if ($tmp_dpt_nm.equalsIgnoreCase(name)) {
			tmp_dpt_nm(value);
			return;
		}
		if ($act_trd_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_trd_calc_ctg_cd(value);
			return;
		}
		if ($act_trd_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_trd_calc_ctg_nm(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($pre_alc_max_lvl.equalsIgnoreCase(name)) {
			pre_alc_max_lvl(value);
			return;
		}
		if ($pre_alc_max_rec.equalsIgnoreCase(name)) {
			pre_alc_max_rec(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($trd_ratio_flg.equalsIgnoreCase(name)) {
			trd_ratio_flg(value);
			return;
		}
		if ($stop_slip_flg.equalsIgnoreCase(name)) {
			stop_slip_flg(value);
			return;
		}
		if ($non_prod_flg.equalsIgnoreCase(name)) {
			non_prod_flg(value);
			return;
		}
		if ($oper_sum_flg.equalsIgnoreCase(name)) {
			oper_sum_flg(value);
			return;
		}
		if ($non_sls_flg.equalsIgnoreCase(name)) {
			non_sls_flg(value);
			return;
		}
		if ($asst_flg.equalsIgnoreCase(name)) {
			asst_flg(value);
			return;
		}
		if ($stk_bp_flg.equalsIgnoreCase(name)) {
			stk_bp_flg(value);
			return;
		}
		if ($non_transit_flg.equalsIgnoreCase(name)) {
			non_transit_flg(value);
			return;
		}
		if ($wg_non_mov_flg.equalsIgnoreCase(name)) {
			wg_non_mov_flg(value);
			return;
		}
		if ($lot_non_mov_flg.equalsIgnoreCase(name)) {
			lot_non_mov_flg(value);
			return;
		}
		if ($sublot_non_mov_flg.equalsIgnoreCase(name)) {
			sublot_non_mov_flg(value);
			return;
		}
		if ($sno1_non_mov_flg.equalsIgnoreCase(name)) {
			sno1_non_mov_flg(value);
			return;
		}
		if ($sno2_non_mov_flg.equalsIgnoreCase(name)) {
			sno2_non_mov_flg(value);
			return;
		}
		if ($sno3_non_mov_flg.equalsIgnoreCase(name)) {
			sno3_non_mov_flg(value);
			return;
		}
		if ($sno4_non_mov_flg.equalsIgnoreCase(name)) {
			sno4_non_mov_flg(value);
			return;
		}
		if ($chk_mst_flg.equalsIgnoreCase(name)) {
			chk_mst_flg(value);
			return;
		}
		if ($stktk_sum_flg.equalsIgnoreCase(name)) {
			stktk_sum_flg(value);
			return;
		}
		if ($oth_ccn_sum_flg.equalsIgnoreCase(name)) {
			oth_ccn_sum_flg(value);
			return;
		}
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

