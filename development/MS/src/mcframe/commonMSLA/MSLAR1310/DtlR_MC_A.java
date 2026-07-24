package mcframe.commonMSLA.MSLAR1310;

import mcframe.commonCore.container.MCConstRow;
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
	 *  データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 *  データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public static final String $trd_typ_cd = "trd_typ_cd";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 *  検査回数.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	/**
	 *  検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 *  検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 *  検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 *  検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	/**
	 *  予定まとめＦＬＧ.<p>
	 *
	 */
	public static final String $col_schd_flg = "col_schd_flg";
	/**
	 *  検査指図リスト発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_lst_prnt_flg = "insp_lst_prnt_flg";
	/**
	 *  検査指図リスト発行日.<p>
	 *
	 */
	public static final String $insp_lst_prnt_dt = "insp_lst_prnt_dt";
	/**
	 *  検査指図リスト発行時刻.<p>
	 *
	 */
	public static final String $insp_lst_prnt_hm = "insp_lst_prnt_hm";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 *  入荷日.<p>
	 *
	 */
	public static final String $arr_dt = "arr_dt";
	/**
	 *  入荷時刻.<p>
	 *
	 */
	public static final String $arr_hm = "arr_hm";
	/**
	 *  最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 *  有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 *  使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 *  起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 *  発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 *  発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 *  メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 *  メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 *  製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 *  製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public static final String $to_site_nm = "to_site_nm";
	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 *  荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 *  荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 *  基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public static final String $insp_lst_no = "insp_lst_no";
	/**
	 *  指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 *  指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 *  作成元部門ＣＤ.<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	/**
	 *  作成元部門名.<p>
	 *
	 */
	public static final String $src_dpt_nm = "src_dpt_nm";
	/**
	 *  作成元担当者ＣＤ.<p>
	 *
	 */
	public static final String $src_usr_cd = "src_usr_cd";
	/**
	 *  作成元担当者名.<p>
	 *
	 */
	public static final String $src_usr_nm = "src_usr_nm";
	/**
	 *  マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	/**
	 *  製造着手予定日.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	/**
	 *  製造着手予定時刻.<p>
	 *
	 */
	public static final String $mfg_st_schd_hm = "mfg_st_schd_hm";
	/**
	 *  製造終了予定日.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt = "mfg_end_schd_dt";
	/**
	 *  製造終了予定時刻.<p>
	 *
	 */
	public static final String $mfg_end_schd_hm = "mfg_end_schd_hm";
	/**
	 *  検査開始予定日.<p>
	 *
	 */
	public static final String $insp_st_dt = "insp_st_dt";
	/**
	 *  検査開始予定時刻.<p>
	 *
	 */
	public static final String $insp_st_hm = "insp_st_hm";
	/**
	 *  検査終了予定日.<p>
	 *
	 */
	public static final String $insp_end_dt = "insp_end_dt";
	/**
	 *  検査終了予定時刻.<p>
	 *
	 */
	public static final String $insp_end_hm = "insp_end_hm";
	/**
	 *  検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 *  検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 *  規格検査必須ＦＬＧ.<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	/**
	 *  規格実績確認必須ＦＬＧ.<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	/**
	 *  工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	/**
	 *  検査成績書発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	/**
	 *  検査成績書発行日.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_dt = "insp_rslt_prnt_dt";
	/**
	 *  検査成績書発行時刻.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_hm = "insp_rslt_prnt_hm";
	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public static final String $seq = "seq";
	/**
	 *  期限再検査ＦＬＧ.<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
	/**
	 *  検査承認対象ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	/**
	 *  検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 *  承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 *  検査承認役割ＣＤ.<p>
	 *
	 */
	public static final String $insp_aprv_role_cd = "insp_aprv_role_cd";
	/**
	 *  検査承認役割名.<p>
	 *
	 */
	public static final String $insp_aprv_role_nm = "insp_aprv_role_nm";
	/**
	 *  承認部門ＣＤ.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 *  承認部門名.<p>
	 *
	 */
	public static final String $aprv_dpt_nm = "aprv_dpt_nm";
	/**
	 *  承認者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 *  承認者名.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	/**
	 *  承認理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 *  内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 *  検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 *  作成元ＮＯ１.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	/**
	 *  作成元ＮＯ２.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	/**
	 *  作成元ＮＯ３.<p>
	 *
	 */
	public static final String $src_no3 = "src_no3";
	/**
	 *  作成元ＮＯ４.<p>
	 *
	 */
	public static final String $src_no4 = "src_no4";
	/**
	 *  場所ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_loc_cd = "schd_loc_cd";
	/**
	 *  場所名（予定）.<p>
	 *
	 */
	public static final String $schd_loc_nm = "schd_loc_nm";
	/**
	 *  棚・ラインＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_str_ln_cd = "schd_str_ln_cd";
	/**
	 *  棚・ライン名（予定）.<p>
	 *
	 */
	public static final String $schd_str_ln_nm = "schd_str_ln_nm";
	/**
	 *  在庫着荷先ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_stk_arrv_bp_cd = "schd_stk_arrv_bp_cd";
	/**
	 *  在庫着荷先名（予定）.<p>
	 *
	 */
	public static final String $schd_stk_arrv_bp_nm = "schd_stk_arrv_bp_nm";
	/**
	 *  手配ＮＯ１（予定）.<p>
	 *
	 */
	public static final String $schd_sno1 = "schd_sno1";
	/**
	 *  手配ＮＯ２（予定）.<p>
	 *
	 */
	public static final String $schd_sno2 = "schd_sno2";
	/**
	 *  手配ＮＯ３（予定）.<p>
	 *
	 */
	public static final String $schd_sno3 = "schd_sno3";
	/**
	 *  手配ＮＯ４（予定）.<p>
	 *
	 */
	public static final String $schd_sno4 = "schd_sno4";
	/**
	 *  格付ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_gd_cd = "schd_gd_cd";
	/**
	 *  格付名（予定）.<p>
	 *
	 */
	public static final String $schd_gd_nm = "schd_gd_nm";
	/**
	 *  良品区分（予定）.<p>
	 *
	 */
	public static final String $schd_quality_typ = "schd_quality_typ";
	/**
	 *  在庫検査区分（予定）.<p>
	 *
	 */
	public static final String $schd_stk_insp_typ = "schd_stk_insp_typ";
	/**
	 *  在庫識別区分（予定）.<p>
	 *
	 */
	public static final String $schd_stk_id_typ = "schd_stk_id_typ";
	/**
	 *  在庫取引先ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_stk_bp_cd = "schd_stk_bp_cd";
	/**
	 *  在庫取引先名（予定）.<p>
	 *
	 */
	public static final String $schd_stk_bp_nm = "schd_stk_bp_nm";
	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public static final String $schd_pack_unit_qty = "schd_pack_unit_qty";
	/**
	 *  荷姿単位ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_pack_unit_cd = "schd_pack_unit_cd";
	/**
	 *  荷姿単位名（予定）.<p>
	 *
	 */
	public static final String $schd_pack_unit_nm = "schd_pack_unit_nm";
	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public static final String $schd_base_unit_qty = "schd_base_unit_qty";
	/**
	 *  基準単位ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_base_unit_cd = "schd_base_unit_cd";
	/**
	 *  基準単位名（予定）.<p>
	 *
	 */
	public static final String $schd_base_unit_nm = "schd_base_unit_nm";
	/**
	 *  場所ＣＤ（在庫）.<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	/**
	 *  場所名（在庫）.<p>
	 *
	 */
	public static final String $stk_loc_nm = "stk_loc_nm";
	/**
	 *  棚・ラインＣＤ（在庫）.<p>
	 *
	 */
	public static final String $stk_str_ln_cd = "stk_str_ln_cd";
	/**
	 *  棚・ライン名（在庫）.<p>
	 *
	 */
	public static final String $stk_str_ln_nm = "stk_str_ln_nm";
	/**
	 *  在庫着荷先ＣＤ（在庫）.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 *  在庫着荷先名（在庫）.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 *  手配ＮＯ１（在庫）.<p>
	 *
	 */
	public static final String $stk_sno1 = "stk_sno1";
	/**
	 *  手配ＮＯ２（在庫）.<p>
	 *
	 */
	public static final String $stk_sno2 = "stk_sno2";
	/**
	 *  手配ＮＯ３（在庫）.<p>
	 *
	 */
	public static final String $stk_sno3 = "stk_sno3";
	/**
	 *  手配ＮＯ４（在庫）.<p>
	 *
	 */
	public static final String $stk_sno4 = "stk_sno4";
	/**
	 *  確定ＮＯ区分（在庫）.<p>
	 *
	 */
	public static final String $stk_fix_no_typ = "stk_fix_no_typ";
	/**
	 *  確定ＮＯ（在庫）.<p>
	 *
	 */
	public static final String $stk_fix_no = "stk_fix_no";
	/**
	 *  荷姿単位ＣＤ（在庫）.<p>
	 *
	 */
	public static final String $stk_pack_unit_cd = "stk_pack_unit_cd";
	/**
	 *  荷姿単位名（在庫）.<p>
	 *
	 */
	public static final String $stk_pack_unit_nm = "stk_pack_unit_nm";
	/**
	 *  格付ＣＤ（在庫）.<p>
	 *
	 */
	public static final String $stk_gd_cd = "stk_gd_cd";
	/**
	 *  格付名（在庫）.<p>
	 *
	 */
	public static final String $stk_gd_nm = "stk_gd_nm";
	/**
	 *  良品区分（在庫）.<p>
	 *
	 */
	public static final String $stk_quality_typ = "stk_quality_typ";
	/**
	 *  在庫検査区分（在庫）.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 *  在庫識別区分（在庫）.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 *  在庫取引先ＣＤ（在庫）.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 *  在庫取引先名（在庫）.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public static final String $stk_pack_unit_qty = "stk_pack_unit_qty";
	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public static final String $stk_base_unit_qty = "stk_base_unit_qty";
	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public static final String $smpl_schd_qty = "smpl_schd_qty";
	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public static final String $smpl_inst_qty = "smpl_inst_qty";
	/**
	 *  参照検査ＮＯ.<p>
	 *
	 */
	public static final String $own_insp_no = "own_insp_no";
	/**
	 *  参照検査予定ＮＯ.<p>
	 *
	 */
	public static final String $own_insp_schd_no = "own_insp_schd_no";
	/**
	 *  初回検査予定ＮＯ.<p>
	 *
	 */
	public static final String $org_insp_schd_no = "org_insp_schd_no";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 *  検査中使用許可ＦＬＧ.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	/**
	 *  検査オフセット.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	/**
	 *  検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";


	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta trd_typ_cd_META = createCommonMeta($trd_typ_cd, mcframe.commonMA.meta.MA_META.IF_TRD_TYP_CD);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta col_schd_flg_META = createCommonMeta($col_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_lst_prnt_flg_META = createCommonMeta($insp_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_lst_prnt_dt_META = createCommonMeta($insp_lst_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_lst_prnt_hm_META = createCommonMeta($insp_lst_prnt_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta arr_dt_META = createCommonMeta($arr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_hm_META = createCommonMeta($arr_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta to_site_nm_META = createCommonMeta($to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta insp_lst_no_META = createCommonMeta($insp_lst_no, mcframe.commonMA.meta.MA_META.INSP_LST_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta src_dpt_nm_META = createCommonMeta($src_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta src_usr_cd_META = createCommonMeta($src_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta src_usr_nm_META = createCommonMeta($src_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_hm_META = createCommonMeta($mfg_st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_hm_META = createCommonMeta($mfg_end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta insp_st_dt_META = createCommonMeta($insp_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_hm_META = createCommonMeta($insp_st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta insp_end_dt_META = createCommonMeta($insp_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_hm_META = createCommonMeta($insp_end_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_dt_META = createCommonMeta($insp_rslt_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_rslt_prnt_hm_META = createCommonMeta($insp_rslt_prnt_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_aprv_role_cd_META = createCommonMeta($insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta insp_aprv_role_nm_META = createCommonMeta($insp_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.INSP_INST_APRV_RSN);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no3_META = createCommonMeta($src_no3, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no4_META = createCommonMeta($src_no4, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta schd_loc_cd_META = createCommonMeta($schd_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_loc_nm_META = createCommonMeta($schd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta schd_str_ln_cd_META = createCommonMeta($schd_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_str_ln_nm_META = createCommonMeta($schd_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta schd_stk_arrv_bp_cd_META = createCommonMeta($schd_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_stk_arrv_bp_nm_META = createCommonMeta($schd_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta schd_sno1_META = createCommonMeta($schd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta schd_sno2_META = createCommonMeta($schd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta schd_sno3_META = createCommonMeta($schd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta schd_sno4_META = createCommonMeta($schd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta schd_gd_cd_META = createCommonMeta($schd_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_gd_nm_META = createCommonMeta($schd_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta schd_quality_typ_META = createCommonMeta($schd_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta schd_stk_insp_typ_META = createCommonMeta($schd_stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta schd_stk_id_typ_META = createCommonMeta($schd_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta schd_stk_bp_cd_META = createCommonMeta($schd_stk_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_stk_bp_nm_META = createCommonMeta($schd_stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta schd_pack_unit_qty_META = createCommonMeta($schd_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_pack_unit_cd_META = createCommonMeta($schd_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_pack_unit_nm_META = createCommonMeta($schd_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_base_unit_qty_META = createCommonMeta($schd_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_base_unit_cd_META = createCommonMeta($schd_base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta schd_base_unit_nm_META = createCommonMeta($schd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_loc_nm_META = createCommonMeta($stk_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta stk_str_ln_cd_META = createCommonMeta($stk_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_str_ln_nm_META = createCommonMeta($stk_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_sno1_META = createCommonMeta($stk_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta stk_sno2_META = createCommonMeta($stk_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta stk_sno3_META = createCommonMeta($stk_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta stk_sno4_META = createCommonMeta($stk_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta stk_fix_no_typ_META = createCommonMeta($stk_fix_no_typ, mcframe.commonMS.meta.MS_META.FIX_NO_TYP);
	public static final MCMeta stk_fix_no_META = createCommonMeta($stk_fix_no, mcframe.commonMA.meta.MA_META.FIX_NO);
	public static final MCMeta stk_pack_unit_cd_META = createCommonMeta($stk_pack_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_pack_unit_nm_META = createCommonMeta($stk_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta stk_gd_cd_META = createCommonMeta($stk_gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_gd_nm_META = createCommonMeta($stk_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_quality_typ_META = createCommonMeta($stk_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_pack_unit_qty_META = createCommonMeta($stk_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_base_unit_qty_META = createCommonMeta($stk_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_schd_qty_META = createCommonMeta($smpl_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_inst_qty_META = createCommonMeta($smpl_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta own_insp_no_META = createCommonMeta($own_insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta own_insp_schd_no_META = createCommonMeta($own_insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta org_insp_schd_no_META = createCommonMeta($org_insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			trd_typ_cd_META,
			data_make_dt_META,
			data_crud_typ_META,
			insp_no_META,
			insp_freq_META,
			insp_typ_META,
			insp_mtd_typ_META,
			insp_sts_typ_META,
			insp_bind_typ_META,
			col_schd_flg_META,
			insp_lst_prnt_flg_META,
			insp_lst_prnt_dt_META,
			insp_lst_prnt_hm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_no_META,
			sublot_no_META,
			arr_dt_META,
			arr_hm_META,
			first_gr_dt_META,
			vld_dt_META,
			lmt_dt_META,
			lmt_dt_frm_META,
			po_no_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			to_site_cd_META,
			to_site_nm_META,
			bp_lot_no_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			insp_lst_no_META,
			inst_dt_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			src_dpt_cd_META,
			src_dpt_nm_META,
			src_usr_cd_META,
			src_usr_nm_META,
			master_dt_META,
			mfg_st_schd_dt_META,
			mfg_st_schd_hm_META,
			mfg_end_schd_dt_META,
			mfg_end_schd_hm_META,
			insp_st_dt_META,
			insp_st_hm_META,
			insp_end_dt_META,
			insp_end_hm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			insp_std_no_META,
			plnt_aprv_flg_META,
			insp_rslt_prnt_flg_META,
			insp_rslt_prnt_dt_META,
			insp_rslt_prnt_hm_META,
			seq_META,
			lmt_up_flg_META,
			insp_aprv_flg_META,
			insp_aprv_sts_typ_META,
			aprv_dt_META,
			insp_aprv_role_cd_META,
			insp_aprv_role_nm_META,
			aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_rsn_META,
			act_cont_fctr_META,
			intr_rmrks_META,
			insp_schd_no_META,
			src_no1_META,
			src_no2_META,
			src_no3_META,
			src_no4_META,
			schd_loc_cd_META,
			schd_loc_nm_META,
			schd_str_ln_cd_META,
			schd_str_ln_nm_META,
			schd_stk_arrv_bp_cd_META,
			schd_stk_arrv_bp_nm_META,
			schd_sno1_META,
			schd_sno2_META,
			schd_sno3_META,
			schd_sno4_META,
			schd_gd_cd_META,
			schd_gd_nm_META,
			schd_quality_typ_META,
			schd_stk_insp_typ_META,
			schd_stk_id_typ_META,
			schd_stk_bp_cd_META,
			schd_stk_bp_nm_META,
			schd_pack_unit_qty_META,
			schd_pack_unit_cd_META,
			schd_pack_unit_nm_META,
			schd_base_unit_qty_META,
			schd_base_unit_cd_META,
			schd_base_unit_nm_META,
			stk_loc_cd_META,
			stk_loc_nm_META,
			stk_str_ln_cd_META,
			stk_str_ln_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			stk_sno1_META,
			stk_sno2_META,
			stk_sno3_META,
			stk_sno4_META,
			stk_fix_no_typ_META,
			stk_fix_no_META,
			stk_pack_unit_cd_META,
			stk_pack_unit_nm_META,
			stk_gd_cd_META,
			stk_gd_nm_META,
			stk_quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_pack_unit_qty_META,
			stk_base_unit_qty_META,
			smpl_schd_qty_META,
			smpl_inst_qty_META,
			own_insp_no_META,
			own_insp_schd_no_META,
			org_insp_schd_no_META,
			ac_dt_META,
			itm_ord_no_META,
			in_prmt_insp_flg_META,
			trd_cd_META,
			trd_nm_META,
			insp_lt_META,
			insp_offst_META,
			insp_cnt_rmrks_META,
			co_cd_META,
			co_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	/**
	 *  データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}


	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public String trd_typ_cd() {
		return getConstString(offset + 2, $trd_typ_cd);
	}

	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public void trd_typ_cd(String value) {
		setConstString(offset + 2, $trd_typ_cd, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 3, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 3, $data_make_dt, value);
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 5, $insp_no);
	}

	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 5, $insp_no, value);
	}


	/**
	 *  検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 6, $insp_freq);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}

	/**
	 *  検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 6, $insp_freq, value);
	}


	/**
	 *  検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 7, $insp_typ);
	}

	/**
	 *  検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 7, $insp_typ, value);
	}


	/**
	 *  検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 8, $insp_mtd_typ);
	}

	/**
	 *  検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 8, $insp_mtd_typ, value);
	}


	/**
	 *  検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 9, $insp_sts_typ);
	}

	/**
	 *  検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 9, $insp_sts_typ, value);
	}


	/**
	 *  検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 10, $insp_bind_typ);
	}

	/**
	 *  検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 10, $insp_bind_typ, value);
	}


	/**
	 *  予定まとめＦＬＧ.<p>
	 *
	 */
	public boolean col_schd_flg() {
		return getConstBoolean(offset + 11, $col_schd_flg);
	}

	/**
	 *  予定まとめＦＬＧ.<p>
	 *
	 */
	public void col_schd_flg(boolean value) {
		setConstBoolean(offset + 11, $col_schd_flg, value);
	}


	/**
	 *  検査指図リスト発行済ＦＬＧ.<p>
	 *
	 */
	public boolean insp_lst_prnt_flg() {
		return getConstBoolean(offset + 12, $insp_lst_prnt_flg);
	}

	/**
	 *  検査指図リスト発行済ＦＬＧ.<p>
	 *
	 */
	public void insp_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $insp_lst_prnt_flg, value);
	}


	/**
	 *  検査指図リスト発行日.<p>
	 *
	 */
	public MCDate insp_lst_prnt_dt() {
		return getConstDate(offset + 13, $insp_lst_prnt_dt);
	}

	/**
	 *  検査指図リスト発行日.<p>
	 *
	 */
	public void insp_lst_prnt_dt(MCDate value) {
		setConstDate(offset + 13, $insp_lst_prnt_dt, value);
	}


	/**
	 *  検査指図リスト発行時刻.<p>
	 *
	 */
	public MCDate insp_lst_prnt_hm() {
		return getConstDate(offset + 14, $insp_lst_prnt_hm);
	}

	/**
	 *  検査指図リスト発行時刻.<p>
	 *
	 */
	public void insp_lst_prnt_hm(MCDate value) {
		setConstDate(offset + 14, $insp_lst_prnt_hm, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 15, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 15, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 16, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 16, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 17, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 17, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 18, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 18, $itm_sub3, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 19, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 19, $itm_nm, value);
	}


	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 20, $lot_no);
	}

	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 20, $lot_no, value);
	}


	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 21, $sublot_no);
	}

	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 21, $sublot_no, value);
	}


	/**
	 *  入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return getConstDate(offset + 22, $arr_dt);
	}

	/**
	 *  入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		setConstDate(offset + 22, $arr_dt, value);
	}


	/**
	 *  入荷時刻.<p>
	 *
	 */
	public MCDate arr_hm() {
		return getConstDate(offset + 23, $arr_hm);
	}

	/**
	 *  入荷時刻.<p>
	 *
	 */
	public void arr_hm(MCDate value) {
		setConstDate(offset + 23, $arr_hm, value);
	}


	/**
	 *  最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 24, $first_gr_dt);
	}

	/**
	 *  最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 24, $first_gr_dt, value);
	}


	/**
	 *  有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 25, $vld_dt);
	}

	/**
	 *  有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 25, $vld_dt, value);
	}


	/**
	 *  使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 26, $lmt_dt);
	}

	/**
	 *  使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 26, $lmt_dt, value);
	}


	/**
	 *  起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 27, $lmt_dt_frm);
	}

	/**
	 *  起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 27, $lmt_dt_frm, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 28, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 28, $po_no, value);
	}


	/**
	 *  発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 29, $sppl_cd);
	}

	/**
	 *  発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 29, $sppl_cd, value);
	}


	/**
	 *  発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 30, $sppl_nm);
	}

	/**
	 *  発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 30, $sppl_nm, value);
	}


	/**
	 *  メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 31, $maker_cd);
	}

	/**
	 *  メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 31, $maker_cd, value);
	}


	/**
	 *  メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 32, $maker_nm);
	}

	/**
	 *  メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 32, $maker_nm, value);
	}


	/**
	 *  製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 33, $mfg_loc_cd);
	}

	/**
	 *  製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 33, $mfg_loc_cd, value);
	}


	/**
	 *  製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 34, $mfg_loc_nm);
	}

	/**
	 *  製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 34, $mfg_loc_nm, value);
	}


	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 35, $to_site_cd);
	}

	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 35, $to_site_cd, value);
	}


	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public String to_site_nm() {
		return getConstString(offset + 36, $to_site_nm);
	}

	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public void to_site_nm(String value) {
		setConstString(offset + 36, $to_site_nm, value);
	}


	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 37, $bp_lot_no);
	}

	/**
	 *  業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 37, $bp_lot_no, value);
	}


	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 38, $pack_unit_qty);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}


	/**
	 *  荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 39, $pack_unit_cd);
	}

	/**
	 *  荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 39, $pack_unit_cd, value);
	}


	/**
	 *  荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 40, $pack_unit_nm);
	}

	/**
	 *  荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 40, $pack_unit_nm, value);
	}


	/**
	 *  基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 41, $base_unit_qty);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 41, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 41, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 41, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 41, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 41, $base_unit_qty, value);
	}


	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 42, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 42, $base_unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 43, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 43, $base_unit_nm, value);
	}


	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public String insp_lst_no() {
		return getConstString(offset + 44, $insp_lst_no);
	}

	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public void insp_lst_no(String value) {
		setConstString(offset + 44, $insp_lst_no, value);
	}


	/**
	 *  指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 45, $inst_dt);
	}

	/**
	 *  指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 45, $inst_dt, value);
	}


	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 46, $inst_dpt_cd);
	}

	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 46, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 47, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 47, $inst_dpt_nm, value);
	}


	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 48, $inst_usr_cd);
	}

	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 48, $inst_usr_cd, value);
	}


	/**
	 *  指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 49, $inst_usr_nm);
	}

	/**
	 *  指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 49, $inst_usr_nm, value);
	}


	/**
	 *  作成元部門ＣＤ.<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 50, $src_dpt_cd);
	}

	/**
	 *  作成元部門ＣＤ.<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 50, $src_dpt_cd, value);
	}


	/**
	 *  作成元部門名.<p>
	 *
	 */
	public String src_dpt_nm() {
		return getConstString(offset + 51, $src_dpt_nm);
	}

	/**
	 *  作成元部門名.<p>
	 *
	 */
	public void src_dpt_nm(String value) {
		setConstString(offset + 51, $src_dpt_nm, value);
	}


	/**
	 *  作成元担当者ＣＤ.<p>
	 *
	 */
	public String src_usr_cd() {
		return getConstString(offset + 52, $src_usr_cd);
	}

	/**
	 *  作成元担当者ＣＤ.<p>
	 *
	 */
	public void src_usr_cd(String value) {
		setConstString(offset + 52, $src_usr_cd, value);
	}


	/**
	 *  作成元担当者名.<p>
	 *
	 */
	public String src_usr_nm() {
		return getConstString(offset + 53, $src_usr_nm);
	}

	/**
	 *  作成元担当者名.<p>
	 *
	 */
	public void src_usr_nm(String value) {
		setConstString(offset + 53, $src_usr_nm, value);
	}


	/**
	 *  マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 54, $master_dt);
	}

	/**
	 *  マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 54, $master_dt, value);
	}


	/**
	 *  製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 55, $mfg_st_schd_dt);
	}

	/**
	 *  製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 55, $mfg_st_schd_dt, value);
	}


	/**
	 *  製造着手予定時刻.<p>
	 *
	 */
	public MCDate mfg_st_schd_hm() {
		return getConstDate(offset + 56, $mfg_st_schd_hm);
	}

	/**
	 *  製造着手予定時刻.<p>
	 *
	 */
	public void mfg_st_schd_hm(MCDate value) {
		setConstDate(offset + 56, $mfg_st_schd_hm, value);
	}


	/**
	 *  製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 57, $mfg_end_schd_dt);
	}

	/**
	 *  製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 57, $mfg_end_schd_dt, value);
	}


	/**
	 *  製造終了予定時刻.<p>
	 *
	 */
	public MCDate mfg_end_schd_hm() {
		return getConstDate(offset + 58, $mfg_end_schd_hm);
	}

	/**
	 *  製造終了予定時刻.<p>
	 *
	 */
	public void mfg_end_schd_hm(MCDate value) {
		setConstDate(offset + 58, $mfg_end_schd_hm, value);
	}


	/**
	 *  検査開始予定日.<p>
	 *
	 */
	public MCDate insp_st_dt() {
		return getConstDate(offset + 59, $insp_st_dt);
	}

	/**
	 *  検査開始予定日.<p>
	 *
	 */
	public void insp_st_dt(MCDate value) {
		setConstDate(offset + 59, $insp_st_dt, value);
	}


	/**
	 *  検査開始予定時刻.<p>
	 *
	 */
	public MCDate insp_st_hm() {
		return getConstDate(offset + 60, $insp_st_hm);
	}

	/**
	 *  検査開始予定時刻.<p>
	 *
	 */
	public void insp_st_hm(MCDate value) {
		setConstDate(offset + 60, $insp_st_hm, value);
	}


	/**
	 *  検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_dt() {
		return getConstDate(offset + 61, $insp_end_dt);
	}

	/**
	 *  検査終了予定日.<p>
	 *
	 */
	public void insp_end_dt(MCDate value) {
		setConstDate(offset + 61, $insp_end_dt, value);
	}


	/**
	 *  検査終了予定時刻.<p>
	 *
	 */
	public MCDate insp_end_hm() {
		return getConstDate(offset + 62, $insp_end_hm);
	}

	/**
	 *  検査終了予定時刻.<p>
	 *
	 */
	public void insp_end_hm(MCDate value) {
		setConstDate(offset + 62, $insp_end_hm, value);
	}


	/**
	 *  検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 63, $insp_ptn_cd);
	}

	/**
	 *  検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 63, $insp_ptn_cd, value);
	}


	/**
	 *  検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 64, $insp_ptn_nm);
	}

	/**
	 *  検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 64, $insp_ptn_nm, value);
	}


	/**
	 *  規格検査必須ＦＬＧ.<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 65, $std_req_flg);
	}

	/**
	 *  規格検査必須ＦＬＧ.<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 65, $std_req_flg, value);
	}


	/**
	 *  規格実績確認必須ＦＬＧ.<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 66, $std_cnf_req_flg);
	}

	/**
	 *  規格実績確認必須ＦＬＧ.<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 66, $std_cnf_req_flg, value);
	}


	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 67, $insp_std_no);
	}

	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 67, $insp_std_no, value);
	}


	/**
	 *  工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 68, $plnt_aprv_flg);
	}

	/**
	 *  工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 68, $plnt_aprv_flg, value);
	}


	/**
	 *  検査成績書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 69, $insp_rslt_prnt_flg);
	}

	/**
	 *  検査成績書発行済ＦＬＧ.<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 69, $insp_rslt_prnt_flg, value);
	}


	/**
	 *  検査成績書発行日.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_dt() {
		return getConstDate(offset + 70, $insp_rslt_prnt_dt);
	}

	/**
	 *  検査成績書発行日.<p>
	 *
	 */
	public void insp_rslt_prnt_dt(MCDate value) {
		setConstDate(offset + 70, $insp_rslt_prnt_dt, value);
	}


	/**
	 *  検査成績書発行時刻.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_hm() {
		return getConstDate(offset + 71, $insp_rslt_prnt_hm);
	}

	/**
	 *  検査成績書発行時刻.<p>
	 *
	 */
	public void insp_rslt_prnt_hm(MCDate value) {
		setConstDate(offset + 71, $insp_rslt_prnt_hm, value);
	}


	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 72, $seq);
	}

	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 72, $seq, value);
	}

	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 72, $seq, value);
	}

	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 72, $seq, value);
	}

	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 72, $seq, value);
	}

	/**
	 *  検査成績書連番.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 72, $seq, value);
	}


	/**
	 *  期限再検査ＦＬＧ.<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 73, $lmt_up_flg);
	}

	/**
	 *  期限再検査ＦＬＧ.<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 73, $lmt_up_flg, value);
	}


	/**
	 *  検査承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 74, $insp_aprv_flg);
	}

	/**
	 *  検査承認対象ＦＬＧ.<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 74, $insp_aprv_flg, value);
	}


	/**
	 *  検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 75, $insp_aprv_sts_typ);
	}

	/**
	 *  検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 75, $insp_aprv_sts_typ, value);
	}


	/**
	 *  承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 76, $aprv_dt);
	}

	/**
	 *  承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 76, $aprv_dt, value);
	}


	/**
	 *  検査承認役割ＣＤ.<p>
	 *
	 */
	public String insp_aprv_role_cd() {
		return getConstString(offset + 77, $insp_aprv_role_cd);
	}

	/**
	 *  検査承認役割ＣＤ.<p>
	 *
	 */
	public void insp_aprv_role_cd(String value) {
		setConstString(offset + 77, $insp_aprv_role_cd, value);
	}


	/**
	 *  検査承認役割名.<p>
	 *
	 */
	public String insp_aprv_role_nm() {
		return getConstString(offset + 78, $insp_aprv_role_nm);
	}

	/**
	 *  検査承認役割名.<p>
	 *
	 */
	public void insp_aprv_role_nm(String value) {
		setConstString(offset + 78, $insp_aprv_role_nm, value);
	}


	/**
	 *  承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 79, $aprv_dpt_cd);
	}

	/**
	 *  承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 79, $aprv_dpt_cd, value);
	}


	/**
	 *  承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 80, $aprv_dpt_nm);
	}

	/**
	 *  承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 80, $aprv_dpt_nm, value);
	}


	/**
	 *  承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 81, $aprv_usr_cd);
	}

	/**
	 *  承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 81, $aprv_usr_cd, value);
	}


	/**
	 *  承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 82, $aprv_usr_nm);
	}

	/**
	 *  承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 82, $aprv_usr_nm, value);
	}


	/**
	 *  承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 83, $aprv_rsn);
	}

	/**
	 *  承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 83, $aprv_rsn, value);
	}


	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 84, $act_cont_fctr);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 84, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 84, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 84, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 84, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 84, $act_cont_fctr, value);
	}


	/**
	 *  内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 85, $intr_rmrks);
	}

	/**
	 *  内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 85, $intr_rmrks, value);
	}


	/**
	 *  検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 86, $insp_schd_no);
	}

	/**
	 *  検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 86, $insp_schd_no, value);
	}


	/**
	 *  作成元ＮＯ１.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 87, $src_no1);
	}

	/**
	 *  作成元ＮＯ１.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 87, $src_no1, value);
	}


	/**
	 *  作成元ＮＯ２.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 88, $src_no2);
	}

	/**
	 *  作成元ＮＯ２.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 88, $src_no2, value);
	}


	/**
	 *  作成元ＮＯ３.<p>
	 *
	 */
	public String src_no3() {
		return getConstString(offset + 89, $src_no3);
	}

	/**
	 *  作成元ＮＯ３.<p>
	 *
	 */
	public void src_no3(String value) {
		setConstString(offset + 89, $src_no3, value);
	}


	/**
	 *  作成元ＮＯ４.<p>
	 *
	 */
	public String src_no4() {
		return getConstString(offset + 90, $src_no4);
	}

	/**
	 *  作成元ＮＯ４.<p>
	 *
	 */
	public void src_no4(String value) {
		setConstString(offset + 90, $src_no4, value);
	}


	/**
	 *  場所ＣＤ（予定）.<p>
	 *
	 */
	public String schd_loc_cd() {
		return getConstString(offset + 91, $schd_loc_cd);
	}

	/**
	 *  場所ＣＤ（予定）.<p>
	 *
	 */
	public void schd_loc_cd(String value) {
		setConstString(offset + 91, $schd_loc_cd, value);
	}


	/**
	 *  場所名（予定）.<p>
	 *
	 */
	public String schd_loc_nm() {
		return getConstString(offset + 92, $schd_loc_nm);
	}

	/**
	 *  場所名（予定）.<p>
	 *
	 */
	public void schd_loc_nm(String value) {
		setConstString(offset + 92, $schd_loc_nm, value);
	}


	/**
	 *  棚・ラインＣＤ（予定）.<p>
	 *
	 */
	public String schd_str_ln_cd() {
		return getConstString(offset + 93, $schd_str_ln_cd);
	}

	/**
	 *  棚・ラインＣＤ（予定）.<p>
	 *
	 */
	public void schd_str_ln_cd(String value) {
		setConstString(offset + 93, $schd_str_ln_cd, value);
	}


	/**
	 *  棚・ライン名（予定）.<p>
	 *
	 */
	public String schd_str_ln_nm() {
		return getConstString(offset + 94, $schd_str_ln_nm);
	}

	/**
	 *  棚・ライン名（予定）.<p>
	 *
	 */
	public void schd_str_ln_nm(String value) {
		setConstString(offset + 94, $schd_str_ln_nm, value);
	}


	/**
	 *  在庫着荷先ＣＤ（予定）.<p>
	 *
	 */
	public String schd_stk_arrv_bp_cd() {
		return getConstString(offset + 95, $schd_stk_arrv_bp_cd);
	}

	/**
	 *  在庫着荷先ＣＤ（予定）.<p>
	 *
	 */
	public void schd_stk_arrv_bp_cd(String value) {
		setConstString(offset + 95, $schd_stk_arrv_bp_cd, value);
	}


	/**
	 *  在庫着荷先名（予定）.<p>
	 *
	 */
	public String schd_stk_arrv_bp_nm() {
		return getConstString(offset + 96, $schd_stk_arrv_bp_nm);
	}

	/**
	 *  在庫着荷先名（予定）.<p>
	 *
	 */
	public void schd_stk_arrv_bp_nm(String value) {
		setConstString(offset + 96, $schd_stk_arrv_bp_nm, value);
	}


	/**
	 *  手配ＮＯ１（予定）.<p>
	 *
	 */
	public String schd_sno1() {
		return getConstString(offset + 97, $schd_sno1);
	}

	/**
	 *  手配ＮＯ１（予定）.<p>
	 *
	 */
	public void schd_sno1(String value) {
		setConstString(offset + 97, $schd_sno1, value);
	}


	/**
	 *  手配ＮＯ２（予定）.<p>
	 *
	 */
	public String schd_sno2() {
		return getConstString(offset + 98, $schd_sno2);
	}

	/**
	 *  手配ＮＯ２（予定）.<p>
	 *
	 */
	public void schd_sno2(String value) {
		setConstString(offset + 98, $schd_sno2, value);
	}


	/**
	 *  手配ＮＯ３（予定）.<p>
	 *
	 */
	public String schd_sno3() {
		return getConstString(offset + 99, $schd_sno3);
	}

	/**
	 *  手配ＮＯ３（予定）.<p>
	 *
	 */
	public void schd_sno3(String value) {
		setConstString(offset + 99, $schd_sno3, value);
	}


	/**
	 *  手配ＮＯ４（予定）.<p>
	 *
	 */
	public String schd_sno4() {
		return getConstString(offset + 100, $schd_sno4);
	}

	/**
	 *  手配ＮＯ４（予定）.<p>
	 *
	 */
	public void schd_sno4(String value) {
		setConstString(offset + 100, $schd_sno4, value);
	}


	/**
	 *  格付ＣＤ（予定）.<p>
	 *
	 */
	public String schd_gd_cd() {
		return getConstString(offset + 101, $schd_gd_cd);
	}

	/**
	 *  格付ＣＤ（予定）.<p>
	 *
	 */
	public void schd_gd_cd(String value) {
		setConstString(offset + 101, $schd_gd_cd, value);
	}


	/**
	 *  格付名（予定）.<p>
	 *
	 */
	public String schd_gd_nm() {
		return getConstString(offset + 102, $schd_gd_nm);
	}

	/**
	 *  格付名（予定）.<p>
	 *
	 */
	public void schd_gd_nm(String value) {
		setConstString(offset + 102, $schd_gd_nm, value);
	}


	/**
	 *  良品区分（予定）.<p>
	 *
	 */
	public String schd_quality_typ() {
		return getConstString(offset + 103, $schd_quality_typ);
	}

	/**
	 *  良品区分（予定）.<p>
	 *
	 */
	public void schd_quality_typ(String value) {
		setConstString(offset + 103, $schd_quality_typ, value);
	}


	/**
	 *  在庫検査区分（予定）.<p>
	 *
	 */
	public String schd_stk_insp_typ() {
		return getConstString(offset + 104, $schd_stk_insp_typ);
	}

	/**
	 *  在庫検査区分（予定）.<p>
	 *
	 */
	public void schd_stk_insp_typ(String value) {
		setConstString(offset + 104, $schd_stk_insp_typ, value);
	}


	/**
	 *  在庫識別区分（予定）.<p>
	 *
	 */
	public String schd_stk_id_typ() {
		return getConstString(offset + 105, $schd_stk_id_typ);
	}

	/**
	 *  在庫識別区分（予定）.<p>
	 *
	 */
	public void schd_stk_id_typ(String value) {
		setConstString(offset + 105, $schd_stk_id_typ, value);
	}


	/**
	 *  在庫取引先ＣＤ（予定）.<p>
	 *
	 */
	public String schd_stk_bp_cd() {
		return getConstString(offset + 106, $schd_stk_bp_cd);
	}

	/**
	 *  在庫取引先ＣＤ（予定）.<p>
	 *
	 */
	public void schd_stk_bp_cd(String value) {
		setConstString(offset + 106, $schd_stk_bp_cd, value);
	}


	/**
	 *  在庫取引先名（予定）.<p>
	 *
	 */
	public String schd_stk_bp_nm() {
		return getConstString(offset + 107, $schd_stk_bp_nm);
	}

	/**
	 *  在庫取引先名（予定）.<p>
	 *
	 */
	public void schd_stk_bp_nm(String value) {
		setConstString(offset + 107, $schd_stk_bp_nm, value);
	}


	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public MCNumber schd_pack_unit_qty() {
		return getConstNumber(offset + 108, $schd_pack_unit_qty);
	}

	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public void schd_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 108, $schd_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public void schd_pack_unit_qty(int value) {
		setConstNumber(offset + 108, $schd_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public void schd_pack_unit_qty(long value) {
		setConstNumber(offset + 108, $schd_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public void schd_pack_unit_qty(float value) {
		setConstNumber(offset + 108, $schd_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（予定）.<p>
	 *
	 */
	public void schd_pack_unit_qty(double value) {
		setConstNumber(offset + 108, $schd_pack_unit_qty, value);
	}


	/**
	 *  荷姿単位ＣＤ（予定）.<p>
	 *
	 */
	public String schd_pack_unit_cd() {
		return getConstString(offset + 109, $schd_pack_unit_cd);
	}

	/**
	 *  荷姿単位ＣＤ（予定）.<p>
	 *
	 */
	public void schd_pack_unit_cd(String value) {
		setConstString(offset + 109, $schd_pack_unit_cd, value);
	}


	/**
	 *  荷姿単位名（予定）.<p>
	 *
	 */
	public String schd_pack_unit_nm() {
		return getConstString(offset + 110, $schd_pack_unit_nm);
	}

	/**
	 *  荷姿単位名（予定）.<p>
	 *
	 */
	public void schd_pack_unit_nm(String value) {
		setConstString(offset + 110, $schd_pack_unit_nm, value);
	}


	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public MCNumber schd_base_unit_qty() {
		return getConstNumber(offset + 111, $schd_base_unit_qty);
	}

	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public void schd_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 111, $schd_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public void schd_base_unit_qty(int value) {
		setConstNumber(offset + 111, $schd_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public void schd_base_unit_qty(long value) {
		setConstNumber(offset + 111, $schd_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public void schd_base_unit_qty(float value) {
		setConstNumber(offset + 111, $schd_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（予定）.<p>
	 *
	 */
	public void schd_base_unit_qty(double value) {
		setConstNumber(offset + 111, $schd_base_unit_qty, value);
	}


	/**
	 *  基準単位ＣＤ（予定）.<p>
	 *
	 */
	public String schd_base_unit_cd() {
		return getConstString(offset + 112, $schd_base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ（予定）.<p>
	 *
	 */
	public void schd_base_unit_cd(String value) {
		setConstString(offset + 112, $schd_base_unit_cd, value);
	}


	/**
	 *  基準単位名（予定）.<p>
	 *
	 */
	public String schd_base_unit_nm() {
		return getConstString(offset + 113, $schd_base_unit_nm);
	}

	/**
	 *  基準単位名（予定）.<p>
	 *
	 */
	public void schd_base_unit_nm(String value) {
		setConstString(offset + 113, $schd_base_unit_nm, value);
	}


	/**
	 *  場所ＣＤ（在庫）.<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 114, $stk_loc_cd);
	}

	/**
	 *  場所ＣＤ（在庫）.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 114, $stk_loc_cd, value);
	}


	/**
	 *  場所名（在庫）.<p>
	 *
	 */
	public String stk_loc_nm() {
		return getConstString(offset + 115, $stk_loc_nm);
	}

	/**
	 *  場所名（在庫）.<p>
	 *
	 */
	public void stk_loc_nm(String value) {
		setConstString(offset + 115, $stk_loc_nm, value);
	}


	/**
	 *  棚・ラインＣＤ（在庫）.<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return getConstString(offset + 116, $stk_str_ln_cd);
	}

	/**
	 *  棚・ラインＣＤ（在庫）.<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		setConstString(offset + 116, $stk_str_ln_cd, value);
	}


	/**
	 *  棚・ライン名（在庫）.<p>
	 *
	 */
	public String stk_str_ln_nm() {
		return getConstString(offset + 117, $stk_str_ln_nm);
	}

	/**
	 *  棚・ライン名（在庫）.<p>
	 *
	 */
	public void stk_str_ln_nm(String value) {
		setConstString(offset + 117, $stk_str_ln_nm, value);
	}


	/**
	 *  在庫着荷先ＣＤ（在庫）.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 118, $stk_arrv_bp_cd);
	}

	/**
	 *  在庫着荷先ＣＤ（在庫）.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 118, $stk_arrv_bp_cd, value);
	}


	/**
	 *  在庫着荷先名（在庫）.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 119, $stk_arrv_bp_nm);
	}

	/**
	 *  在庫着荷先名（在庫）.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 119, $stk_arrv_bp_nm, value);
	}


	/**
	 *  手配ＮＯ１（在庫）.<p>
	 *
	 */
	public String stk_sno1() {
		return getConstString(offset + 120, $stk_sno1);
	}

	/**
	 *  手配ＮＯ１（在庫）.<p>
	 *
	 */
	public void stk_sno1(String value) {
		setConstString(offset + 120, $stk_sno1, value);
	}


	/**
	 *  手配ＮＯ２（在庫）.<p>
	 *
	 */
	public String stk_sno2() {
		return getConstString(offset + 121, $stk_sno2);
	}

	/**
	 *  手配ＮＯ２（在庫）.<p>
	 *
	 */
	public void stk_sno2(String value) {
		setConstString(offset + 121, $stk_sno2, value);
	}


	/**
	 *  手配ＮＯ３（在庫）.<p>
	 *
	 */
	public String stk_sno3() {
		return getConstString(offset + 122, $stk_sno3);
	}

	/**
	 *  手配ＮＯ３（在庫）.<p>
	 *
	 */
	public void stk_sno3(String value) {
		setConstString(offset + 122, $stk_sno3, value);
	}


	/**
	 *  手配ＮＯ４（在庫）.<p>
	 *
	 */
	public String stk_sno4() {
		return getConstString(offset + 123, $stk_sno4);
	}

	/**
	 *  手配ＮＯ４（在庫）.<p>
	 *
	 */
	public void stk_sno4(String value) {
		setConstString(offset + 123, $stk_sno4, value);
	}


	/**
	 *  確定ＮＯ区分（在庫）.<p>
	 *
	 */
	public String stk_fix_no_typ() {
		return getConstString(offset + 124, $stk_fix_no_typ);
	}

	/**
	 *  確定ＮＯ区分（在庫）.<p>
	 *
	 */
	public void stk_fix_no_typ(String value) {
		setConstString(offset + 124, $stk_fix_no_typ, value);
	}


	/**
	 *  確定ＮＯ（在庫）.<p>
	 *
	 */
	public String stk_fix_no() {
		return getConstString(offset + 125, $stk_fix_no);
	}

	/**
	 *  確定ＮＯ（在庫）.<p>
	 *
	 */
	public void stk_fix_no(String value) {
		setConstString(offset + 125, $stk_fix_no, value);
	}


	/**
	 *  荷姿単位ＣＤ（在庫）.<p>
	 *
	 */
	public String stk_pack_unit_cd() {
		return getConstString(offset + 126, $stk_pack_unit_cd);
	}

	/**
	 *  荷姿単位ＣＤ（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_cd(String value) {
		setConstString(offset + 126, $stk_pack_unit_cd, value);
	}


	/**
	 *  荷姿単位名（在庫）.<p>
	 *
	 */
	public String stk_pack_unit_nm() {
		return getConstString(offset + 127, $stk_pack_unit_nm);
	}

	/**
	 *  荷姿単位名（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_nm(String value) {
		setConstString(offset + 127, $stk_pack_unit_nm, value);
	}


	/**
	 *  格付ＣＤ（在庫）.<p>
	 *
	 */
	public String stk_gd_cd() {
		return getConstString(offset + 128, $stk_gd_cd);
	}

	/**
	 *  格付ＣＤ（在庫）.<p>
	 *
	 */
	public void stk_gd_cd(String value) {
		setConstString(offset + 128, $stk_gd_cd, value);
	}


	/**
	 *  格付名（在庫）.<p>
	 *
	 */
	public String stk_gd_nm() {
		return getConstString(offset + 129, $stk_gd_nm);
	}

	/**
	 *  格付名（在庫）.<p>
	 *
	 */
	public void stk_gd_nm(String value) {
		setConstString(offset + 129, $stk_gd_nm, value);
	}


	/**
	 *  良品区分（在庫）.<p>
	 *
	 */
	public String stk_quality_typ() {
		return getConstString(offset + 130, $stk_quality_typ);
	}

	/**
	 *  良品区分（在庫）.<p>
	 *
	 */
	public void stk_quality_typ(String value) {
		setConstString(offset + 130, $stk_quality_typ, value);
	}


	/**
	 *  在庫検査区分（在庫）.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 131, $stk_insp_typ);
	}

	/**
	 *  在庫検査区分（在庫）.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 131, $stk_insp_typ, value);
	}


	/**
	 *  在庫識別区分（在庫）.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 132, $stk_id_typ);
	}

	/**
	 *  在庫識別区分（在庫）.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 132, $stk_id_typ, value);
	}


	/**
	 *  在庫取引先ＣＤ（在庫）.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 133, $stk_bp_cd);
	}

	/**
	 *  在庫取引先ＣＤ（在庫）.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 133, $stk_bp_cd, value);
	}


	/**
	 *  在庫取引先名（在庫）.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 134, $stk_bp_nm);
	}

	/**
	 *  在庫取引先名（在庫）.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 134, $stk_bp_nm, value);
	}


	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public MCNumber stk_pack_unit_qty() {
		return getConstNumber(offset + 135, $stk_pack_unit_qty);
	}

	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 135, $stk_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_qty(int value) {
		setConstNumber(offset + 135, $stk_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_qty(long value) {
		setConstNumber(offset + 135, $stk_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_qty(float value) {
		setConstNumber(offset + 135, $stk_pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量（在庫）.<p>
	 *
	 */
	public void stk_pack_unit_qty(double value) {
		setConstNumber(offset + 135, $stk_pack_unit_qty, value);
	}


	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public MCNumber stk_base_unit_qty() {
		return getConstNumber(offset + 136, $stk_base_unit_qty);
	}

	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public void stk_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 136, $stk_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public void stk_base_unit_qty(int value) {
		setConstNumber(offset + 136, $stk_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public void stk_base_unit_qty(long value) {
		setConstNumber(offset + 136, $stk_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public void stk_base_unit_qty(float value) {
		setConstNumber(offset + 136, $stk_base_unit_qty, value);
	}

	/**
	 *  基準単位数量（在庫）.<p>
	 *
	 */
	public void stk_base_unit_qty(double value) {
		setConstNumber(offset + 136, $stk_base_unit_qty, value);
	}


	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public MCNumber smpl_schd_qty() {
		return getConstNumber(offset + 137, $smpl_schd_qty);
	}

	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public void smpl_schd_qty(MCNumber value) {
		setConstNumber(offset + 137, $smpl_schd_qty, value);
	}

	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public void smpl_schd_qty(int value) {
		setConstNumber(offset + 137, $smpl_schd_qty, value);
	}

	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public void smpl_schd_qty(long value) {
		setConstNumber(offset + 137, $smpl_schd_qty, value);
	}

	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public void smpl_schd_qty(float value) {
		setConstNumber(offset + 137, $smpl_schd_qty, value);
	}

	/**
	 *  抜取予定数量.<p>
	 *
	 */
	public void smpl_schd_qty(double value) {
		setConstNumber(offset + 137, $smpl_schd_qty, value);
	}


	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return getConstNumber(offset + 138, $smpl_inst_qty);
	}

	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		setConstNumber(offset + 138, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		setConstNumber(offset + 138, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		setConstNumber(offset + 138, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		setConstNumber(offset + 138, $smpl_inst_qty, value);
	}

	/**
	 *  抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		setConstNumber(offset + 138, $smpl_inst_qty, value);
	}


	/**
	 *  参照検査ＮＯ.<p>
	 *
	 */
	public String own_insp_no() {
		return getConstString(offset + 139, $own_insp_no);
	}

	/**
	 *  参照検査ＮＯ.<p>
	 *
	 */
	public void own_insp_no(String value) {
		setConstString(offset + 139, $own_insp_no, value);
	}


	/**
	 *  参照検査予定ＮＯ.<p>
	 *
	 */
	public String own_insp_schd_no() {
		return getConstString(offset + 140, $own_insp_schd_no);
	}

	/**
	 *  参照検査予定ＮＯ.<p>
	 *
	 */
	public void own_insp_schd_no(String value) {
		setConstString(offset + 140, $own_insp_schd_no, value);
	}


	/**
	 *  初回検査予定ＮＯ.<p>
	 *
	 */
	public String org_insp_schd_no() {
		return getConstString(offset + 141, $org_insp_schd_no);
	}

	/**
	 *  初回検査予定ＮＯ.<p>
	 *
	 */
	public void org_insp_schd_no(String value) {
		setConstString(offset + 141, $org_insp_schd_no, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 142, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 142, $ac_dt, value);
	}


	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 143, $itm_ord_no);
	}

	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 143, $itm_ord_no, value);
	}


	/**
	 *  検査中使用許可ＦＬＧ.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 144, $in_prmt_insp_flg);
	}

	/**
	 *  検査中使用許可ＦＬＧ.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 144, $in_prmt_insp_flg, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 145, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 145, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 146, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 146, $trd_nm, value);
	}


	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 147, $insp_lt);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 147, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 147, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 147, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 147, $insp_lt, value);
	}

	/**
	 *  検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 147, $insp_lt, value);
	}


	/**
	 *  検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 148, $insp_offst);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 148, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 148, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 148, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 148, $insp_offst, value);
	}

	/**
	 *  検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 148, $insp_offst, value);
	}


	/**
	 *  検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 149, $insp_cnt_rmrks);
	}

	/**
	 *  検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 149, $insp_cnt_rmrks, value);
	}


	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 150, $co_cd);
	}

	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 150, $co_cd, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 151, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 151, $co_nm, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 152, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 152, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 153, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 153, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 154, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 154, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 155, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 155, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 156, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 156, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 157, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 157, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 158, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 158, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 159, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 159, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 160, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 160, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 161, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 161, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 162, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 162, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 163, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 163, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 164, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 164, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 165, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 165, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 166, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 166, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 167, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 167, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 168, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 168, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 169, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 169, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 170, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 170, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 171, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 171, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 172, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 172, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 173, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 173, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 174, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 174, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 175, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 175, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 176, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 176, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 177, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 177, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 178, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 178, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 179, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 179, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 180, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 180, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 181, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 181, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 182, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 182, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 182, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 182, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 182, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 182, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 183, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 183, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 183, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 183, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 183, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 183, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 184, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 184, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 184, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 184, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 184, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 184, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 185, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 185, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 185, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 185, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 185, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 185, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 186, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 186, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 186, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 186, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 186, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 186, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 187, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 187, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 188, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 188, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 189, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 189, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 190, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 190, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 191, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 191, $sub_dt5, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			return src_usr_cd();
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			return src_usr_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			return src_no3();
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			return src_no4();
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			return schd_loc_cd();
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			return schd_loc_nm();
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			return schd_str_ln_cd();
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			return schd_str_ln_nm();
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_cd();
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_nm();
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			return schd_sno1();
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			return schd_sno2();
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			return schd_sno3();
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			return schd_sno4();
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			return schd_gd_cd();
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			return schd_gd_nm();
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			return schd_quality_typ();
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			return schd_stk_insp_typ();
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			return schd_stk_id_typ();
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_bp_cd();
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_bp_nm();
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			return schd_pack_unit_cd();
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			return schd_pack_unit_nm();
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			return schd_base_unit_cd();
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			return schd_base_unit_nm();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			return stk_sno1();
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			return stk_sno2();
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			return stk_sno3();
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			return stk_sno4();
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			return stk_fix_no_typ();
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			return stk_fix_no();
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			return stk_gd_cd();
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			return stk_gd_nm();
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			return stk_quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			return own_insp_no();
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			return own_insp_schd_no();
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			return org_insp_schd_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			return schd_pack_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty();
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			return stk_base_unit_qty();
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			return smpl_schd_qty();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($insp_lst_prnt_dt.equalsIgnoreCase(name)) {
			return insp_lst_prnt_dt();
		}
		if ($insp_lst_prnt_hm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_hm();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			return arr_hm();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_st_schd_hm.equalsIgnoreCase(name)) {
			return mfg_st_schd_hm();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($mfg_end_schd_hm.equalsIgnoreCase(name)) {
			return mfg_end_schd_hm();
		}
		if ($insp_st_dt.equalsIgnoreCase(name)) {
			return insp_st_dt();
		}
		if ($insp_st_hm.equalsIgnoreCase(name)) {
			return insp_st_hm();
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			return insp_end_dt();
		}
		if ($insp_end_hm.equalsIgnoreCase(name)) {
			return insp_end_hm();
		}
		if ($insp_rslt_prnt_dt.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_dt();
		}
		if ($insp_rslt_prnt_hm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_hm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			return insp_lst_no();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			return src_usr_cd();
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			return src_usr_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			return src_no3();
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			return src_no4();
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			return schd_loc_cd();
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			return schd_loc_nm();
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			return schd_str_ln_cd();
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			return schd_str_ln_nm();
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_cd();
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_arrv_bp_nm();
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			return schd_sno1();
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			return schd_sno2();
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			return schd_sno3();
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			return schd_sno4();
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			return schd_gd_cd();
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			return schd_gd_nm();
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			return schd_quality_typ();
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			return schd_stk_insp_typ();
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			return schd_stk_id_typ();
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			return schd_stk_bp_cd();
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			return schd_stk_bp_nm();
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			return schd_pack_unit_cd();
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			return schd_pack_unit_nm();
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			return schd_base_unit_cd();
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			return schd_base_unit_nm();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			return stk_sno1();
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			return stk_sno2();
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			return stk_sno3();
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			return stk_sno4();
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			return stk_fix_no_typ();
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			return stk_fix_no();
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			return stk_pack_unit_cd();
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			return stk_pack_unit_nm();
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			return stk_gd_cd();
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			return stk_gd_nm();
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			return stk_quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			return own_insp_no();
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			return own_insp_schd_no();
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			return org_insp_schd_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			return schd_pack_unit_qty();
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			return schd_base_unit_qty();
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			return stk_pack_unit_qty();
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			return stk_base_unit_qty();
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			return smpl_schd_qty();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($insp_lst_prnt_dt.equalsIgnoreCase(name)) {
			return insp_lst_prnt_dt();
		}
		if ($insp_lst_prnt_hm.equalsIgnoreCase(name)) {
			return insp_lst_prnt_hm();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			return arr_hm();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_st_schd_hm.equalsIgnoreCase(name)) {
			return mfg_st_schd_hm();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($mfg_end_schd_hm.equalsIgnoreCase(name)) {
			return mfg_end_schd_hm();
		}
		if ($insp_st_dt.equalsIgnoreCase(name)) {
			return insp_st_dt();
		}
		if ($insp_st_hm.equalsIgnoreCase(name)) {
			return insp_st_hm();
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			return insp_end_dt();
		}
		if ($insp_end_hm.equalsIgnoreCase(name)) {
			return insp_end_hm();
		}
		if ($insp_rslt_prnt_dt.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_dt();
		}
		if ($insp_rslt_prnt_hm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_hm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			return col_schd_flg();
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			return insp_lst_prnt_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			src_usr_cd(value);
			return;
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			src_usr_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			src_no3(value);
			return;
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			src_no4(value);
			return;
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			schd_loc_cd(value);
			return;
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			schd_loc_nm(value);
			return;
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			schd_str_ln_cd(value);
			return;
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			schd_str_ln_nm(value);
			return;
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_cd(value);
			return;
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_nm(value);
			return;
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			schd_sno1(value);
			return;
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			schd_sno2(value);
			return;
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			schd_sno3(value);
			return;
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			schd_sno4(value);
			return;
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			schd_gd_cd(value);
			return;
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			schd_gd_nm(value);
			return;
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			schd_quality_typ(value);
			return;
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			schd_stk_insp_typ(value);
			return;
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			schd_stk_id_typ(value);
			return;
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_bp_cd(value);
			return;
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_bp_nm(value);
			return;
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			schd_pack_unit_cd(value);
			return;
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			schd_pack_unit_nm(value);
			return;
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			schd_base_unit_cd(value);
			return;
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			schd_base_unit_nm(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			stk_sno1(value);
			return;
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			stk_sno2(value);
			return;
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			stk_sno3(value);
			return;
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			stk_sno4(value);
			return;
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			stk_fix_no_typ(value);
			return;
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			stk_fix_no(value);
			return;
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
			return;
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			stk_gd_cd(value);
			return;
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			stk_gd_nm(value);
			return;
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			stk_quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			own_insp_no(value);
			return;
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			own_insp_schd_no(value);
			return;
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			org_insp_schd_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($insp_lst_prnt_dt.equalsIgnoreCase(name)) {
			insp_lst_prnt_dt(value);
			return;
		}
		if ($insp_lst_prnt_hm.equalsIgnoreCase(name)) {
			insp_lst_prnt_hm(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			arr_hm(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_hm.equalsIgnoreCase(name)) {
			mfg_st_schd_hm(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_hm.equalsIgnoreCase(name)) {
			mfg_end_schd_hm(value);
			return;
		}
		if ($insp_st_dt.equalsIgnoreCase(name)) {
			insp_st_dt(value);
			return;
		}
		if ($insp_st_hm.equalsIgnoreCase(name)) {
			insp_st_hm(value);
			return;
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			insp_end_dt(value);
			return;
		}
		if ($insp_end_hm.equalsIgnoreCase(name)) {
			insp_end_hm(value);
			return;
		}
		if ($insp_rslt_prnt_dt.equalsIgnoreCase(name)) {
			insp_rslt_prnt_dt(value);
			return;
		}
		if ($insp_rslt_prnt_hm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_hm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($insp_lst_no.equalsIgnoreCase(name)) {
			insp_lst_no(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($src_usr_cd.equalsIgnoreCase(name)) {
			src_usr_cd(value);
			return;
		}
		if ($src_usr_nm.equalsIgnoreCase(name)) {
			src_usr_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
			return;
		}
		if ($src_no3.equalsIgnoreCase(name)) {
			src_no3(value);
			return;
		}
		if ($src_no4.equalsIgnoreCase(name)) {
			src_no4(value);
			return;
		}
		if ($schd_loc_cd.equalsIgnoreCase(name)) {
			schd_loc_cd(value);
			return;
		}
		if ($schd_loc_nm.equalsIgnoreCase(name)) {
			schd_loc_nm(value);
			return;
		}
		if ($schd_str_ln_cd.equalsIgnoreCase(name)) {
			schd_str_ln_cd(value);
			return;
		}
		if ($schd_str_ln_nm.equalsIgnoreCase(name)) {
			schd_str_ln_nm(value);
			return;
		}
		if ($schd_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_cd(value);
			return;
		}
		if ($schd_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_arrv_bp_nm(value);
			return;
		}
		if ($schd_sno1.equalsIgnoreCase(name)) {
			schd_sno1(value);
			return;
		}
		if ($schd_sno2.equalsIgnoreCase(name)) {
			schd_sno2(value);
			return;
		}
		if ($schd_sno3.equalsIgnoreCase(name)) {
			schd_sno3(value);
			return;
		}
		if ($schd_sno4.equalsIgnoreCase(name)) {
			schd_sno4(value);
			return;
		}
		if ($schd_gd_cd.equalsIgnoreCase(name)) {
			schd_gd_cd(value);
			return;
		}
		if ($schd_gd_nm.equalsIgnoreCase(name)) {
			schd_gd_nm(value);
			return;
		}
		if ($schd_quality_typ.equalsIgnoreCase(name)) {
			schd_quality_typ(value);
			return;
		}
		if ($schd_stk_insp_typ.equalsIgnoreCase(name)) {
			schd_stk_insp_typ(value);
			return;
		}
		if ($schd_stk_id_typ.equalsIgnoreCase(name)) {
			schd_stk_id_typ(value);
			return;
		}
		if ($schd_stk_bp_cd.equalsIgnoreCase(name)) {
			schd_stk_bp_cd(value);
			return;
		}
		if ($schd_stk_bp_nm.equalsIgnoreCase(name)) {
			schd_stk_bp_nm(value);
			return;
		}
		if ($schd_pack_unit_cd.equalsIgnoreCase(name)) {
			schd_pack_unit_cd(value);
			return;
		}
		if ($schd_pack_unit_nm.equalsIgnoreCase(name)) {
			schd_pack_unit_nm(value);
			return;
		}
		if ($schd_base_unit_cd.equalsIgnoreCase(name)) {
			schd_base_unit_cd(value);
			return;
		}
		if ($schd_base_unit_nm.equalsIgnoreCase(name)) {
			schd_base_unit_nm(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($stk_sno1.equalsIgnoreCase(name)) {
			stk_sno1(value);
			return;
		}
		if ($stk_sno2.equalsIgnoreCase(name)) {
			stk_sno2(value);
			return;
		}
		if ($stk_sno3.equalsIgnoreCase(name)) {
			stk_sno3(value);
			return;
		}
		if ($stk_sno4.equalsIgnoreCase(name)) {
			stk_sno4(value);
			return;
		}
		if ($stk_fix_no_typ.equalsIgnoreCase(name)) {
			stk_fix_no_typ(value);
			return;
		}
		if ($stk_fix_no.equalsIgnoreCase(name)) {
			stk_fix_no(value);
			return;
		}
		if ($stk_pack_unit_cd.equalsIgnoreCase(name)) {
			stk_pack_unit_cd(value);
			return;
		}
		if ($stk_pack_unit_nm.equalsIgnoreCase(name)) {
			stk_pack_unit_nm(value);
			return;
		}
		if ($stk_gd_cd.equalsIgnoreCase(name)) {
			stk_gd_cd(value);
			return;
		}
		if ($stk_gd_nm.equalsIgnoreCase(name)) {
			stk_gd_nm(value);
			return;
		}
		if ($stk_quality_typ.equalsIgnoreCase(name)) {
			stk_quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($own_insp_no.equalsIgnoreCase(name)) {
			own_insp_no(value);
			return;
		}
		if ($own_insp_schd_no.equalsIgnoreCase(name)) {
			own_insp_schd_no(value);
			return;
		}
		if ($org_insp_schd_no.equalsIgnoreCase(name)) {
			org_insp_schd_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($schd_pack_unit_qty.equalsIgnoreCase(name)) {
			schd_pack_unit_qty(value);
			return;
		}
		if ($schd_base_unit_qty.equalsIgnoreCase(name)) {
			schd_base_unit_qty(value);
			return;
		}
		if ($stk_pack_unit_qty.equalsIgnoreCase(name)) {
			stk_pack_unit_qty(value);
			return;
		}
		if ($stk_base_unit_qty.equalsIgnoreCase(name)) {
			stk_base_unit_qty(value);
			return;
		}
		if ($smpl_schd_qty.equalsIgnoreCase(name)) {
			smpl_schd_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($insp_lst_prnt_dt.equalsIgnoreCase(name)) {
			insp_lst_prnt_dt(value);
			return;
		}
		if ($insp_lst_prnt_hm.equalsIgnoreCase(name)) {
			insp_lst_prnt_hm(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		if ($arr_hm.equalsIgnoreCase(name)) {
			arr_hm(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_hm.equalsIgnoreCase(name)) {
			mfg_st_schd_hm(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_hm.equalsIgnoreCase(name)) {
			mfg_end_schd_hm(value);
			return;
		}
		if ($insp_st_dt.equalsIgnoreCase(name)) {
			insp_st_dt(value);
			return;
		}
		if ($insp_st_hm.equalsIgnoreCase(name)) {
			insp_st_hm(value);
			return;
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			insp_end_dt(value);
			return;
		}
		if ($insp_end_hm.equalsIgnoreCase(name)) {
			insp_end_hm(value);
			return;
		}
		if ($insp_rslt_prnt_dt.equalsIgnoreCase(name)) {
			insp_rslt_prnt_dt(value);
			return;
		}
		if ($insp_rslt_prnt_hm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_hm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($col_schd_flg.equalsIgnoreCase(name)) {
			col_schd_flg(value);
			return;
		}
		if ($insp_lst_prnt_flg.equalsIgnoreCase(name)) {
			insp_lst_prnt_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

