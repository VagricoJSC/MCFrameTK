package mcframe.serverMSBE.MSBEL0090;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Scheduled date FROM 予定日付ＦＲＯＭ.<p>
	 *
	 */
	public static final String $schd_dt_fr = "schd_dt_fr";
	/**
	 * Scheduled date TO 予定日付ＴＯ.<p>
	 *
	 */
	public static final String $schd_dt_to = "schd_dt_to";
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_fr = "accpt_schd_dt_fr";
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public static final String $accpt_schd_dt_to = "accpt_schd_dt_to";
	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $avl_schd_dt_fr = "avl_schd_dt_fr";
	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public static final String $avl_schd_dt_to = "avl_schd_dt_to";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Without SEIBAN No. 1 not allowed 手配ＮＯ１無し不可.<p>
	 *
	 */
	public static final String $sno1_null_ng_flg = "sno1_null_ng_flg";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_ok_flg = "sno1_null_ok_flg";
	/**
	 * Without SEIBAN No. 2 not allowed 手配ＮＯ２無し不可.<p>
	 *
	 */
	public static final String $sno2_null_ng_flg = "sno2_null_ng_flg";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_ok_flg = "sno2_null_ok_flg";
	/**
	 * Without SEIBAN No. 3 not allowed 手配ＮＯ３無し不可.<p>
	 *
	 */
	public static final String $sno3_null_ng_flg = "sno3_null_ng_flg";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_ok_flg = "sno3_null_ok_flg";
	/**
	 * Without SEIBAN No. 4 not allowed 手配ＮＯ４無し不可.<p>
	 *
	 */
	public static final String $sno4_null_ng_flg = "sno4_null_ng_flg";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_ok_flg = "sno4_null_ok_flg";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public static final String $alt_itm_typ_nm = "alt_itm_typ_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $inpt_ctl_typ_nm = "inpt_ctl_typ_nm";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public static final String $io_schd_typ_nm = "io_schd_typ_nm";
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public static final String $io_typ = "io_typ";
	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public static final String $io_typ_nm = "io_typ_nm";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public static final String $io_schd_sts_typ_nm = "io_schd_sts_typ_nm";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public static final String $alloc_scope_typ_nm = "alloc_scope_typ_nm";
	/**
	 * Not to allocate 引当対象外.<p>
	 *
	 */
	public static final String $non_alloc_tgt_flg = "non_alloc_tgt_flg";
	/**
	 * To allocate 引当対象.<p>
	 *
	 */
	public static final String $is_alloc_tgt_flg = "is_alloc_tgt_flg";
	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public static final String $yet_allocate_flg = "yet_allocate_flg";
	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public static final String $allocated_flg = "allocated_flg";
	/**
	 * Other than allocation pending 引当保留以外.<p>
	 *
	 */
	public static final String $non_alloc_wait_flg = "non_alloc_wait_flg";
	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public static final String $is_alloc_wait_flg = "is_alloc_wait_flg";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Expiration start date FROM 有効期限開始日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr_fr = "vld_dt_fr_fr";
	/**
	 * Expiration start date TO 有効期限開始日ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_fr_to = "vld_dt_fr_to";
	/**
	 * Expiration end date FROM 有効期限終了日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_to_fr = "vld_dt_to_fr";
	/**
	 * Expiration end date TO 有効期限終了日ＴＯ.<p>
	 *
	 */
	public static final String $vld_dt_to_to = "vld_dt_to_to";
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	/**
	 * GR/GI schedule spare type 1 受払予定予備区分１.<p>
	 *
	 */
	public static final String $io_schd_sub_typ1 = "io_schd_sub_typ1";
	/**
	 * GR/GI schedule spare type name 1 受払予定予備区分名１.<p>
	 *
	 */
	public static final String $io_schd_sub_typ_nm1 = "io_schd_sub_typ_nm1";
	/**
	 * GR/GI schedule spare No. 1 受払予定予備ＮＯ１.<p>
	 *
	 */
	public static final String $io_schd_sub_no1 = "io_schd_sub_no1";
	/**
	 * GR/GI schedule spare type 2 受払予定予備区分２.<p>
	 *
	 */
	public static final String $io_schd_sub_typ2 = "io_schd_sub_typ2";
	/**
	 * GR/GI schedule spare type name 2 受払予定予備区分名２.<p>
	 *
	 */
	public static final String $io_schd_sub_typ_nm2 = "io_schd_sub_typ_nm2";
	/**
	 * GR/GI schedule spare No. 2 受払予定予備ＮＯ２.<p>
	 *
	 */
	public static final String $io_schd_sub_no2 = "io_schd_sub_no2";
	/**
	 * GR/GI schedule spare type 3 受払予定予備区分３.<p>
	 *
	 */
	public static final String $io_schd_sub_typ3 = "io_schd_sub_typ3";
	/**
	 * GR/GI schedule spare type name 3 受払予定予備区分名３.<p>
	 *
	 */
	public static final String $io_schd_sub_typ_nm3 = "io_schd_sub_typ_nm3";
	/**
	 * GR/GI schedule spare No. 3 受払予定予備ＮＯ３.<p>
	 *
	 */
	public static final String $io_schd_sub_no3 = "io_schd_sub_no3";
	/**
	 * GR/GI schedule spare type 4 受払予定予備区分４.<p>
	 *
	 */
	public static final String $io_schd_sub_typ4 = "io_schd_sub_typ4";
	/**
	 * GR/GI schedule spare type name 4 受払予定予備区分名４.<p>
	 *
	 */
	public static final String $io_schd_sub_typ_nm4 = "io_schd_sub_typ_nm4";
	/**
	 * GR/GI schedule spare No. 4 受払予定予備ＮＯ４.<p>
	 *
	 */
	public static final String $io_schd_sub_no4 = "io_schd_sub_no4";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_schd_no = "slip_schd_no";
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_schd_no_flg = "slip_schd_no_flg";
	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public static final String $schd_dt_flg = "schd_dt_flg";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt_flg = "accpt_schd_dt_flg";
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt_flg = "avl_schd_dt_flg";
	/**
	 * Location 場所.<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public static final String $str_ln_flg = "str_ln_flg";
	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public static final String $stk_arrv_flg = "stk_arrv_flg";
	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public static final String $site_flg = "site_flg";
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
	/**
	 * Distribution G 物流Ｇ.<p>
	 *
	 */
	public static final String $lg_grp_flg = "lg_grp_flg";
	/**
	 * Gross allocation location G 総量引当場所Ｇ.<p>
	 *
	 */
	public static final String $alloc_grp_flg = "alloc_grp_flg";
	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public static final String $loc_grp_flg = "loc_grp_flg";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $sppl_flg = "sppl_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no_flg = "lot_no_flg";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no_flg = "sublot_no_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_flg = "sno1_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_flg = "sno2_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_flg = "sno3_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_flg = "sno4_flg";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Alternative 代替.<p>
	 *
	 */
	public static final String $alt_grp_flg = "alt_grp_flg";
	/**
	 * Grading 格付.<p>
	 *
	 */
	public static final String $gd_flg = "gd_flg";


	public static final MCMeta schd_dt_fr_META = createCommonMeta($schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_dt_to_META = createCommonMeta($schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_fr_META = createCommonMeta($accpt_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_to_META = createCommonMeta($accpt_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_fr_META = createCommonMeta($avl_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_to_META = createCommonMeta($avl_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta sno1_null_ng_flg_META = createCommonMeta($sno1_null_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_null_ok_flg_META = createCommonMeta($sno1_null_ok_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_null_ng_flg_META = createCommonMeta($sno2_null_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_null_ok_flg_META = createCommonMeta($sno2_null_ok_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_null_ng_flg_META = createCommonMeta($sno3_null_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_null_ok_flg_META = createCommonMeta($sno3_null_ok_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_null_ng_flg_META = createCommonMeta($sno4_null_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_null_ok_flg_META = createCommonMeta($sno4_null_ok_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_typ_nm_META = createCommonMeta($alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_nm_META = createCommonMeta($inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_typ_nm_META = createCommonMeta($io_schd_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP_NM);
	public static final MCMeta io_typ_META = createCommonMeta($io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta io_typ_nm_META = createCommonMeta($io_typ_nm, mcframe.commonMS.meta.MS_META.IO_TYP_NM);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_sts_typ_nm_META = createCommonMeta($io_schd_sts_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP_NM);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_scope_typ_nm_META = createCommonMeta($alloc_scope_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP_NM);
	public static final MCMeta non_alloc_tgt_flg_META = createCommonMeta($non_alloc_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_alloc_tgt_flg_META = createCommonMeta($is_alloc_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yet_allocate_flg_META = createCommonMeta($yet_allocate_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta allocated_flg_META = createCommonMeta($allocated_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_alloc_wait_flg_META = createCommonMeta($non_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_alloc_wait_flg_META = createCommonMeta($is_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_fr_fr_META = createCommonMeta($vld_dt_fr_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_fr_to_META = createCommonMeta($vld_dt_fr_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_fr_META = createCommonMeta($vld_dt_to_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_to_to_META = createCommonMeta($vld_dt_to_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_sub_typ1_META = createCommonMeta($io_schd_sub_typ1, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_typ_nm1_META = createCommonMeta($io_schd_sub_typ_nm1, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP_NM);
	public static final MCMeta io_schd_sub_no1_META = createCommonMeta($io_schd_sub_no1, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_typ2_META = createCommonMeta($io_schd_sub_typ2, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_typ_nm2_META = createCommonMeta($io_schd_sub_typ_nm2, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP_NM);
	public static final MCMeta io_schd_sub_no2_META = createCommonMeta($io_schd_sub_no2, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_typ3_META = createCommonMeta($io_schd_sub_typ3, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_typ_nm3_META = createCommonMeta($io_schd_sub_typ_nm3, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP_NM);
	public static final MCMeta io_schd_sub_no3_META = createCommonMeta($io_schd_sub_no3, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_sub_typ4_META = createCommonMeta($io_schd_sub_typ4, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP);
	public static final MCMeta io_schd_sub_typ_nm4_META = createCommonMeta($io_schd_sub_typ_nm4, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_TYP_NM);
	public static final MCMeta io_schd_sub_no4_META = createCommonMeta($io_schd_sub_no4, mcframe.commonMA.meta.MA_META.IO_SCHD_SUB_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta slip_schd_no_META = createCommonMeta($slip_schd_no, mcframe.commonMA.meta.MA_META.SLIP_SCHD_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMS.meta.MS_META.IO_SCHD_SUB_CHAR5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta slip_schd_no_flg_META = createCommonMeta($slip_schd_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_dt_flg_META = createCommonMeta($schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta accpt_schd_dt_flg_META = createCommonMeta($accpt_schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta avl_schd_dt_flg_META = createCommonMeta($avl_schd_dt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_flg_META = createCommonMeta($str_ln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_arrv_flg_META = createCommonMeta($stk_arrv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_flg_META = createCommonMeta($site_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_flg_META = createCommonMeta($lg_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_grp_flg_META = createCommonMeta($alloc_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_grp_flg_META = createCommonMeta($loc_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_flg_META = createCommonMeta($sppl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_flg_META = createCommonMeta($lot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_flg_META = createCommonMeta($sublot_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_flg_META = createCommonMeta($sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_flg_META = createCommonMeta($sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_flg_META = createCommonMeta($sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_flg_META = createCommonMeta($sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_grp_flg_META = createCommonMeta($alt_grp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_flg_META = createCommonMeta($gd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			schd_dt_fr_META,
			schd_dt_to_META,
			accpt_schd_dt_fr_META,
			accpt_schd_dt_to_META,
			avl_schd_dt_fr_META,
			avl_schd_dt_to_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			sno1_null_ng_flg_META,
			sno1_null_ok_flg_META,
			sno2_null_ng_flg_META,
			sno2_null_ok_flg_META,
			sno3_null_ng_flg_META,
			sno3_null_ok_flg_META,
			sno4_null_ng_flg_META,
			sno4_null_ok_flg_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			oper_inst_no_META,
			oper_ord_no_META,
			alt_itm_typ_META,
			alt_itm_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			inpt_ctl_typ_META,
			inpt_ctl_typ_nm_META,
			io_schd_typ_META,
			io_schd_typ_nm_META,
			io_typ_META,
			io_typ_nm_META,
			io_schd_sts_typ_META,
			io_schd_sts_typ_nm_META,
			alloc_scope_typ_META,
			alloc_scope_typ_nm_META,
			non_alloc_tgt_flg_META,
			is_alloc_tgt_flg_META,
			yet_allocate_flg_META,
			allocated_flg_META,
			non_alloc_wait_flg_META,
			is_alloc_wait_flg_META,
			vld_dt_META,
			vld_dt_fr_fr_META,
			vld_dt_fr_to_META,
			vld_dt_to_fr_META,
			vld_dt_to_to_META,
			io_schd_no_META,
			io_schd_sub_typ1_META,
			io_schd_sub_typ_nm1_META,
			io_schd_sub_no1_META,
			io_schd_sub_typ2_META,
			io_schd_sub_typ_nm2_META,
			io_schd_sub_no2_META,
			io_schd_sub_typ3_META,
			io_schd_sub_typ_nm3_META,
			io_schd_sub_no3_META,
			io_schd_sub_typ4_META,
			io_schd_sub_typ_nm4_META,
			io_schd_sub_no4_META,
			io_schd_pr_no_META,
			slip_schd_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			slip_schd_no_flg_META,
			schd_dt_flg_META,
			accpt_schd_dt_flg_META,
			avl_schd_dt_flg_META,
			loc_flg_META,
			str_ln_flg_META,
			stk_arrv_flg_META,
			site_flg_META,
			wg_flg_META,
			lg_grp_flg_META,
			alloc_grp_flg_META,
			loc_grp_flg_META,
			sppl_flg_META,
			lot_no_flg_META,
			sublot_no_flg_META,
			sno1_flg_META,
			sno2_flg_META,
			sno3_flg_META,
			sno4_flg_META,
			pack_flg_META,
			alt_grp_flg_META,
			gd_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Scheduled date FROM 予定日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDate schd_dt_fr() {
		return getConstDate(offset + 0, $schd_dt_fr);
	}

	/**
	 * Scheduled date FROM 予定日付ＦＲＯＭ.<p>
	 *
	 */
	public void schd_dt_fr(MCDate value) {
		setConstDate(offset + 0, $schd_dt_fr, value);
	}


	/**
	 * Scheduled date TO 予定日付ＴＯ.<p>
	 *
	 */
	public MCDate schd_dt_to() {
		return getConstDate(offset + 1, $schd_dt_to);
	}

	/**
	 * Scheduled date TO 予定日付ＴＯ.<p>
	 *
	 */
	public void schd_dt_to(MCDate value) {
		setConstDate(offset + 1, $schd_dt_to, value);
	}


	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_fr() {
		return getConstDate(offset + 2, $accpt_schd_dt_fr);
	}

	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public void accpt_schd_dt_fr(MCDate value) {
		setConstDate(offset + 2, $accpt_schd_dt_fr, value);
	}


	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDate accpt_schd_dt_to() {
		return getConstDate(offset + 3, $accpt_schd_dt_to);
	}

	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public void accpt_schd_dt_to(MCDate value) {
		setConstDate(offset + 3, $accpt_schd_dt_to, value);
	}


	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate avl_schd_dt_fr() {
		return getConstDate(offset + 4, $avl_schd_dt_fr);
	}

	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public void avl_schd_dt_fr(MCDate value) {
		setConstDate(offset + 4, $avl_schd_dt_fr, value);
	}


	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public MCDate avl_schd_dt_to() {
		return getConstDate(offset + 5, $avl_schd_dt_to);
	}

	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public void avl_schd_dt_to(MCDate value) {
		setConstDate(offset + 5, $avl_schd_dt_to, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 6, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 6, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 7, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 7, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 8, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 8, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 9, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 9, $str_ln_nm, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 10, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 10, $stk_arrv_bp_cd, value);
	}


	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 11, $stk_arrv_bp_nm);
	}

	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 11, $stk_arrv_bp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 12, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 12, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 13, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 13, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 14, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 14, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 15, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 15, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 16, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 16, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 17, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 17, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 18, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 18, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 19, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 19, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 20, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 20, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 21, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 21, $loc_grp_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 22, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 22, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 23, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 23, $sppl_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 24, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 24, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 25, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 25, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 26, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 26, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 27, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 27, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 28, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 28, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 29, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 29, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 30, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 30, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 31, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 31, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 32, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 32, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 33, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 33, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 34, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 34, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 35, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 35, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 36, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 36, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 37, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 37, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 38, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 38, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 39, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 39, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 40, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 40, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 41, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 41, $wrk_nm, value);
	}


	/**
	 * Without SEIBAN No. 1 not allowed 手配ＮＯ１無し不可.<p>
	 *
	 */
	public boolean sno1_null_ng_flg() {
		return getConstBoolean(offset + 42, $sno1_null_ng_flg);
	}

	/**
	 * Without SEIBAN No. 1 not allowed 手配ＮＯ１無し不可.<p>
	 *
	 */
	public void sno1_null_ng_flg(boolean value) {
		setConstBoolean(offset + 42, $sno1_null_ng_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_ok_flg() {
		return getConstBoolean(offset + 43, $sno1_null_ok_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_ok_flg(boolean value) {
		setConstBoolean(offset + 43, $sno1_null_ok_flg, value);
	}


	/**
	 * Without SEIBAN No. 2 not allowed 手配ＮＯ２無し不可.<p>
	 *
	 */
	public boolean sno2_null_ng_flg() {
		return getConstBoolean(offset + 44, $sno2_null_ng_flg);
	}

	/**
	 * Without SEIBAN No. 2 not allowed 手配ＮＯ２無し不可.<p>
	 *
	 */
	public void sno2_null_ng_flg(boolean value) {
		setConstBoolean(offset + 44, $sno2_null_ng_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_ok_flg() {
		return getConstBoolean(offset + 45, $sno2_null_ok_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_ok_flg(boolean value) {
		setConstBoolean(offset + 45, $sno2_null_ok_flg, value);
	}


	/**
	 * Without SEIBAN No. 3 not allowed 手配ＮＯ３無し不可.<p>
	 *
	 */
	public boolean sno3_null_ng_flg() {
		return getConstBoolean(offset + 46, $sno3_null_ng_flg);
	}

	/**
	 * Without SEIBAN No. 3 not allowed 手配ＮＯ３無し不可.<p>
	 *
	 */
	public void sno3_null_ng_flg(boolean value) {
		setConstBoolean(offset + 46, $sno3_null_ng_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_ok_flg() {
		return getConstBoolean(offset + 47, $sno3_null_ok_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_ok_flg(boolean value) {
		setConstBoolean(offset + 47, $sno3_null_ok_flg, value);
	}


	/**
	 * Without SEIBAN No. 4 not allowed 手配ＮＯ４無し不可.<p>
	 *
	 */
	public boolean sno4_null_ng_flg() {
		return getConstBoolean(offset + 48, $sno4_null_ng_flg);
	}

	/**
	 * Without SEIBAN No. 4 not allowed 手配ＮＯ４無し不可.<p>
	 *
	 */
	public void sno4_null_ng_flg(boolean value) {
		setConstBoolean(offset + 48, $sno4_null_ng_flg, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_ok_flg() {
		return getConstBoolean(offset + 49, $sno4_null_ok_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_ok_flg(boolean value) {
		setConstBoolean(offset + 49, $sno4_null_ok_flg, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 50, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 50, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 51, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 51, $pack_unit_nm, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 52, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 52, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 53, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 53, $alt_grp_nm, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 54, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 54, $oper_inst_no, value);
	}


	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 55, $oper_ord_no);
	}

	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 55, $oper_ord_no, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 56, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 56, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 57, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 57, $alt_itm_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 58, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 58, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 59, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 59, $gd_nm, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 60, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 60, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 61, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 61, $in_xfr_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 62, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 62, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 63, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 63, $quality_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 64, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 64, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 65, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 65, $asst_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 66, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 66, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 67, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 67, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 68, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 68, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 69, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 69, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 70, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 70, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 71, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 71, $stk_bp_nm, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 72, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 72, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 73, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 73, $inpt_ctl_typ_nm, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 74, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 74, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public String io_schd_typ_nm() {
		return getConstString(offset + 75, $io_schd_typ_nm);
	}

	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public void io_schd_typ_nm(String value) {
		setConstString(offset + 75, $io_schd_typ_nm, value);
	}


	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public String io_typ() {
		return getConstString(offset + 76, $io_typ);
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public void io_typ(String value) {
		setConstString(offset + 76, $io_typ, value);
	}


	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public String io_typ_nm() {
		return getConstString(offset + 77, $io_typ_nm);
	}

	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public void io_typ_nm(String value) {
		setConstString(offset + 77, $io_typ_nm, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 78, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 78, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public String io_schd_sts_typ_nm() {
		return getConstString(offset + 79, $io_schd_sts_typ_nm);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public void io_schd_sts_typ_nm(String value) {
		setConstString(offset + 79, $io_schd_sts_typ_nm, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 80, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 80, $alloc_scope_typ, value);
	}


	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public String alloc_scope_typ_nm() {
		return getConstString(offset + 81, $alloc_scope_typ_nm);
	}

	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public void alloc_scope_typ_nm(String value) {
		setConstString(offset + 81, $alloc_scope_typ_nm, value);
	}


	/**
	 * Not to allocate 引当対象外.<p>
	 *
	 */
	public boolean non_alloc_tgt_flg() {
		return getConstBoolean(offset + 82, $non_alloc_tgt_flg);
	}

	/**
	 * Not to allocate 引当対象外.<p>
	 *
	 */
	public void non_alloc_tgt_flg(boolean value) {
		setConstBoolean(offset + 82, $non_alloc_tgt_flg, value);
	}


	/**
	 * To allocate 引当対象.<p>
	 *
	 */
	public boolean is_alloc_tgt_flg() {
		return getConstBoolean(offset + 83, $is_alloc_tgt_flg);
	}

	/**
	 * To allocate 引当対象.<p>
	 *
	 */
	public void is_alloc_tgt_flg(boolean value) {
		setConstBoolean(offset + 83, $is_alloc_tgt_flg, value);
	}


	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public boolean yet_allocate_flg() {
		return getConstBoolean(offset + 84, $yet_allocate_flg);
	}

	/**
	 * Unallocated 未引当.<p>
	 *
	 */
	public void yet_allocate_flg(boolean value) {
		setConstBoolean(offset + 84, $yet_allocate_flg, value);
	}


	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public boolean allocated_flg() {
		return getConstBoolean(offset + 85, $allocated_flg);
	}

	/**
	 * Allocated 引当済.<p>
	 *
	 */
	public void allocated_flg(boolean value) {
		setConstBoolean(offset + 85, $allocated_flg, value);
	}


	/**
	 * Other than allocation pending 引当保留以外.<p>
	 *
	 */
	public boolean non_alloc_wait_flg() {
		return getConstBoolean(offset + 86, $non_alloc_wait_flg);
	}

	/**
	 * Other than allocation pending 引当保留以外.<p>
	 *
	 */
	public void non_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 86, $non_alloc_wait_flg, value);
	}


	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public boolean is_alloc_wait_flg() {
		return getConstBoolean(offset + 87, $is_alloc_wait_flg);
	}

	/**
	 * Allocation pending 引当保留.<p>
	 *
	 */
	public void is_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 87, $is_alloc_wait_flg, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 88, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 88, $vld_dt, value);
	}


	/**
	 * Expiration start date FROM 有効期限開始日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr_fr() {
		return getConstDate(offset + 89, $vld_dt_fr_fr);
	}

	/**
	 * Expiration start date FROM 有効期限開始日ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr_fr(MCDate value) {
		setConstDate(offset + 89, $vld_dt_fr_fr, value);
	}


	/**
	 * Expiration start date TO 有効期限開始日ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_fr_to() {
		return getConstDate(offset + 90, $vld_dt_fr_to);
	}

	/**
	 * Expiration start date TO 有効期限開始日ＴＯ.<p>
	 *
	 */
	public void vld_dt_fr_to(MCDate value) {
		setConstDate(offset + 90, $vld_dt_fr_to, value);
	}


	/**
	 * Expiration end date FROM 有効期限終了日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_to_fr() {
		return getConstDate(offset + 91, $vld_dt_to_fr);
	}

	/**
	 * Expiration end date FROM 有効期限終了日ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_to_fr(MCDate value) {
		setConstDate(offset + 91, $vld_dt_to_fr, value);
	}


	/**
	 * Expiration end date TO 有効期限終了日ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to_to() {
		return getConstDate(offset + 92, $vld_dt_to_to);
	}

	/**
	 * Expiration end date TO 有効期限終了日ＴＯ.<p>
	 *
	 */
	public void vld_dt_to_to(MCDate value) {
		setConstDate(offset + 92, $vld_dt_to_to, value);
	}


	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 93, $io_schd_no);
	}

	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 93, $io_schd_no, value);
	}


	/**
	 * GR/GI schedule spare type 1 受払予定予備区分１.<p>
	 *
	 */
	public String io_schd_sub_typ1() {
		return getConstString(offset + 94, $io_schd_sub_typ1);
	}

	/**
	 * GR/GI schedule spare type 1 受払予定予備区分１.<p>
	 *
	 */
	public void io_schd_sub_typ1(String value) {
		setConstString(offset + 94, $io_schd_sub_typ1, value);
	}


	/**
	 * GR/GI schedule spare type name 1 受払予定予備区分名１.<p>
	 *
	 */
	public String io_schd_sub_typ_nm1() {
		return getConstString(offset + 95, $io_schd_sub_typ_nm1);
	}

	/**
	 * GR/GI schedule spare type name 1 受払予定予備区分名１.<p>
	 *
	 */
	public void io_schd_sub_typ_nm1(String value) {
		setConstString(offset + 95, $io_schd_sub_typ_nm1, value);
	}


	/**
	 * GR/GI schedule spare No. 1 受払予定予備ＮＯ１.<p>
	 *
	 */
	public String io_schd_sub_no1() {
		return getConstString(offset + 96, $io_schd_sub_no1);
	}

	/**
	 * GR/GI schedule spare No. 1 受払予定予備ＮＯ１.<p>
	 *
	 */
	public void io_schd_sub_no1(String value) {
		setConstString(offset + 96, $io_schd_sub_no1, value);
	}


	/**
	 * GR/GI schedule spare type 2 受払予定予備区分２.<p>
	 *
	 */
	public String io_schd_sub_typ2() {
		return getConstString(offset + 97, $io_schd_sub_typ2);
	}

	/**
	 * GR/GI schedule spare type 2 受払予定予備区分２.<p>
	 *
	 */
	public void io_schd_sub_typ2(String value) {
		setConstString(offset + 97, $io_schd_sub_typ2, value);
	}


	/**
	 * GR/GI schedule spare type name 2 受払予定予備区分名２.<p>
	 *
	 */
	public String io_schd_sub_typ_nm2() {
		return getConstString(offset + 98, $io_schd_sub_typ_nm2);
	}

	/**
	 * GR/GI schedule spare type name 2 受払予定予備区分名２.<p>
	 *
	 */
	public void io_schd_sub_typ_nm2(String value) {
		setConstString(offset + 98, $io_schd_sub_typ_nm2, value);
	}


	/**
	 * GR/GI schedule spare No. 2 受払予定予備ＮＯ２.<p>
	 *
	 */
	public String io_schd_sub_no2() {
		return getConstString(offset + 99, $io_schd_sub_no2);
	}

	/**
	 * GR/GI schedule spare No. 2 受払予定予備ＮＯ２.<p>
	 *
	 */
	public void io_schd_sub_no2(String value) {
		setConstString(offset + 99, $io_schd_sub_no2, value);
	}


	/**
	 * GR/GI schedule spare type 3 受払予定予備区分３.<p>
	 *
	 */
	public String io_schd_sub_typ3() {
		return getConstString(offset + 100, $io_schd_sub_typ3);
	}

	/**
	 * GR/GI schedule spare type 3 受払予定予備区分３.<p>
	 *
	 */
	public void io_schd_sub_typ3(String value) {
		setConstString(offset + 100, $io_schd_sub_typ3, value);
	}


	/**
	 * GR/GI schedule spare type name 3 受払予定予備区分名３.<p>
	 *
	 */
	public String io_schd_sub_typ_nm3() {
		return getConstString(offset + 101, $io_schd_sub_typ_nm3);
	}

	/**
	 * GR/GI schedule spare type name 3 受払予定予備区分名３.<p>
	 *
	 */
	public void io_schd_sub_typ_nm3(String value) {
		setConstString(offset + 101, $io_schd_sub_typ_nm3, value);
	}


	/**
	 * GR/GI schedule spare No. 3 受払予定予備ＮＯ３.<p>
	 *
	 */
	public String io_schd_sub_no3() {
		return getConstString(offset + 102, $io_schd_sub_no3);
	}

	/**
	 * GR/GI schedule spare No. 3 受払予定予備ＮＯ３.<p>
	 *
	 */
	public void io_schd_sub_no3(String value) {
		setConstString(offset + 102, $io_schd_sub_no3, value);
	}


	/**
	 * GR/GI schedule spare type 4 受払予定予備区分４.<p>
	 *
	 */
	public String io_schd_sub_typ4() {
		return getConstString(offset + 103, $io_schd_sub_typ4);
	}

	/**
	 * GR/GI schedule spare type 4 受払予定予備区分４.<p>
	 *
	 */
	public void io_schd_sub_typ4(String value) {
		setConstString(offset + 103, $io_schd_sub_typ4, value);
	}


	/**
	 * GR/GI schedule spare type name 4 受払予定予備区分名４.<p>
	 *
	 */
	public String io_schd_sub_typ_nm4() {
		return getConstString(offset + 104, $io_schd_sub_typ_nm4);
	}

	/**
	 * GR/GI schedule spare type name 4 受払予定予備区分名４.<p>
	 *
	 */
	public void io_schd_sub_typ_nm4(String value) {
		setConstString(offset + 104, $io_schd_sub_typ_nm4, value);
	}


	/**
	 * GR/GI schedule spare No. 4 受払予定予備ＮＯ４.<p>
	 *
	 */
	public String io_schd_sub_no4() {
		return getConstString(offset + 105, $io_schd_sub_no4);
	}

	/**
	 * GR/GI schedule spare No. 4 受払予定予備ＮＯ４.<p>
	 *
	 */
	public void io_schd_sub_no4(String value) {
		setConstString(offset + 105, $io_schd_sub_no4, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 106, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 106, $io_schd_pr_no, value);
	}


	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public String slip_schd_no() {
		return getConstString(offset + 107, $slip_schd_no);
	}

	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public void slip_schd_no(String value) {
		setConstString(offset + 107, $slip_schd_no, value);
	}


	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 108, $sub_char1);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 108, $sub_char1, value);
	}


	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 109, $sub_char2);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 109, $sub_char2, value);
	}


	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 110, $sub_char3);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 110, $sub_char3, value);
	}


	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 111, $sub_char4);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 111, $sub_char4, value);
	}


	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 112, $sub_char5);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 112, $sub_char5, value);
	}


	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 113, $sub_dt1);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 113, $sub_dt1, value);
	}


	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 114, $sub_dt2);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 114, $sub_dt2, value);
	}


	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 115, $sub_dt3);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 115, $sub_dt3, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 116, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 116, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 117, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 117, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 118, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 118, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 119, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 119, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 120, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 120, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 121, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 121, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 122, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 122, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 123, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 123, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 124, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 124, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 125, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 125, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 126, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 126, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 127, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 127, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 128, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 128, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 129, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 129, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 130, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 130, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 131, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 131, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 132, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 132, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 133, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 133, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 134, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 134, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 135, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 135, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 136, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 136, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 137, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 137, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 138, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 138, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 139, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 139, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 140, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 140, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 141, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 141, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 142, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 142, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 143, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 143, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 144, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 144, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 145, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 145, $itm_grp_nm10, value);
	}


	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public boolean slip_schd_no_flg() {
		return getConstBoolean(offset + 146, $slip_schd_no_flg);
	}

	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public void slip_schd_no_flg(boolean value) {
		setConstBoolean(offset + 146, $slip_schd_no_flg, value);
	}


	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public boolean schd_dt_flg() {
		return getConstBoolean(offset + 147, $schd_dt_flg);
	}

	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public void schd_dt_flg(boolean value) {
		setConstBoolean(offset + 147, $schd_dt_flg, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public boolean accpt_schd_dt_flg() {
		return getConstBoolean(offset + 148, $accpt_schd_dt_flg);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt_flg(boolean value) {
		setConstBoolean(offset + 148, $accpt_schd_dt_flg, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public boolean avl_schd_dt_flg() {
		return getConstBoolean(offset + 149, $avl_schd_dt_flg);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt_flg(boolean value) {
		setConstBoolean(offset + 149, $avl_schd_dt_flg, value);
	}


	/**
	 * Location 場所.<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 150, $loc_flg);
	}

	/**
	 * Location 場所.<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 150, $loc_flg, value);
	}


	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public boolean str_ln_flg() {
		return getConstBoolean(offset + 151, $str_ln_flg);
	}

	/**
	 * Rack/Line 棚・ライン.<p>
	 *
	 */
	public void str_ln_flg(boolean value) {
		setConstBoolean(offset + 151, $str_ln_flg, value);
	}


	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public boolean stk_arrv_flg() {
		return getConstBoolean(offset + 152, $stk_arrv_flg);
	}

	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public void stk_arrv_flg(boolean value) {
		setConstBoolean(offset + 152, $stk_arrv_flg, value);
	}


	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public boolean site_flg() {
		return getConstBoolean(offset + 153, $site_flg);
	}

	/**
	 * Factory/Distribution warehouse 工場・物流倉庫.<p>
	 *
	 */
	public void site_flg(boolean value) {
		setConstBoolean(offset + 153, $site_flg, value);
	}


	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 154, $wg_flg);
	}

	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 154, $wg_flg, value);
	}


	/**
	 * Distribution G 物流Ｇ.<p>
	 *
	 */
	public boolean lg_grp_flg() {
		return getConstBoolean(offset + 155, $lg_grp_flg);
	}

	/**
	 * Distribution G 物流Ｇ.<p>
	 *
	 */
	public void lg_grp_flg(boolean value) {
		setConstBoolean(offset + 155, $lg_grp_flg, value);
	}


	/**
	 * Gross allocation location G 総量引当場所Ｇ.<p>
	 *
	 */
	public boolean alloc_grp_flg() {
		return getConstBoolean(offset + 156, $alloc_grp_flg);
	}

	/**
	 * Gross allocation location G 総量引当場所Ｇ.<p>
	 *
	 */
	public void alloc_grp_flg(boolean value) {
		setConstBoolean(offset + 156, $alloc_grp_flg, value);
	}


	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public boolean loc_grp_flg() {
		return getConstBoolean(offset + 157, $loc_grp_flg);
	}

	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public void loc_grp_flg(boolean value) {
		setConstBoolean(offset + 157, $loc_grp_flg, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public boolean sppl_flg() {
		return getConstBoolean(offset + 158, $sppl_flg);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_flg(boolean value) {
		setConstBoolean(offset + 158, $sppl_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public boolean lot_no_flg() {
		return getConstBoolean(offset + 159, $lot_no_flg);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no_flg(boolean value) {
		setConstBoolean(offset + 159, $lot_no_flg, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public boolean sublot_no_flg() {
		return getConstBoolean(offset + 160, $sublot_no_flg);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no_flg(boolean value) {
		setConstBoolean(offset + 160, $sublot_no_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public boolean sno1_flg() {
		return getConstBoolean(offset + 161, $sno1_flg);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1_flg(boolean value) {
		setConstBoolean(offset + 161, $sno1_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public boolean sno2_flg() {
		return getConstBoolean(offset + 162, $sno2_flg);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2_flg(boolean value) {
		setConstBoolean(offset + 162, $sno2_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public boolean sno3_flg() {
		return getConstBoolean(offset + 163, $sno3_flg);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3_flg(boolean value) {
		setConstBoolean(offset + 163, $sno3_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public boolean sno4_flg() {
		return getConstBoolean(offset + 164, $sno4_flg);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4_flg(boolean value) {
		setConstBoolean(offset + 164, $sno4_flg, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 165, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 165, $pack_flg, value);
	}


	/**
	 * Alternative 代替.<p>
	 *
	 */
	public boolean alt_grp_flg() {
		return getConstBoolean(offset + 166, $alt_grp_flg);
	}

	/**
	 * Alternative 代替.<p>
	 *
	 */
	public void alt_grp_flg(boolean value) {
		setConstBoolean(offset + 166, $alt_grp_flg, value);
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public boolean gd_flg() {
		return getConstBoolean(offset + 167, $gd_flg);
	}

	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd_flg(boolean value) {
		setConstBoolean(offset + 167, $gd_flg, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			return io_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			return alloc_scope_typ_nm();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ1();
		}
		if ($io_schd_sub_typ_nm1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm1();
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			return io_schd_sub_no1();
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ2();
		}
		if ($io_schd_sub_typ_nm2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm2();
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			return io_schd_sub_no2();
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ3();
		}
		if ($io_schd_sub_typ_nm3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm3();
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			return io_schd_sub_no3();
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ4();
		}
		if ($io_schd_sub_typ_nm4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm4();
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			return io_schd_sub_no4();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			return slip_schd_no();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			return schd_dt_fr();
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			return schd_dt_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			return avl_schd_dt_fr();
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			return avl_schd_dt_to();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($vld_dt_fr_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr_fr();
		}
		if ($vld_dt_fr_to.equalsIgnoreCase(name)) {
			return vld_dt_fr_to();
		}
		if ($vld_dt_to_fr.equalsIgnoreCase(name)) {
			return vld_dt_to_fr();
		}
		if ($vld_dt_to_to.equalsIgnoreCase(name)) {
			return vld_dt_to_to();
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sno1_null_ng_flg.equalsIgnoreCase(name)) {
			return sno1_null_ng_flg();
		}
		if ($sno1_null_ok_flg.equalsIgnoreCase(name)) {
			return sno1_null_ok_flg();
		}
		if ($sno2_null_ng_flg.equalsIgnoreCase(name)) {
			return sno2_null_ng_flg();
		}
		if ($sno2_null_ok_flg.equalsIgnoreCase(name)) {
			return sno2_null_ok_flg();
		}
		if ($sno3_null_ng_flg.equalsIgnoreCase(name)) {
			return sno3_null_ng_flg();
		}
		if ($sno3_null_ok_flg.equalsIgnoreCase(name)) {
			return sno3_null_ok_flg();
		}
		if ($sno4_null_ng_flg.equalsIgnoreCase(name)) {
			return sno4_null_ng_flg();
		}
		if ($sno4_null_ok_flg.equalsIgnoreCase(name)) {
			return sno4_null_ok_flg();
		}
		if ($non_alloc_tgt_flg.equalsIgnoreCase(name)) {
			return non_alloc_tgt_flg();
		}
		if ($is_alloc_tgt_flg.equalsIgnoreCase(name)) {
			return is_alloc_tgt_flg();
		}
		if ($yet_allocate_flg.equalsIgnoreCase(name)) {
			return yet_allocate_flg();
		}
		if ($allocated_flg.equalsIgnoreCase(name)) {
			return allocated_flg();
		}
		if ($non_alloc_wait_flg.equalsIgnoreCase(name)) {
			return non_alloc_wait_flg();
		}
		if ($is_alloc_wait_flg.equalsIgnoreCase(name)) {
			return is_alloc_wait_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($slip_schd_no_flg.equalsIgnoreCase(name)) {
			return slip_schd_no_flg();
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			return schd_dt_flg();
		}
		if ($accpt_schd_dt_flg.equalsIgnoreCase(name)) {
			return accpt_schd_dt_flg();
		}
		if ($avl_schd_dt_flg.equalsIgnoreCase(name)) {
			return avl_schd_dt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			return str_ln_flg();
		}
		if ($stk_arrv_flg.equalsIgnoreCase(name)) {
			return stk_arrv_flg();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			return lg_grp_flg();
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			return alloc_grp_flg();
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			return loc_grp_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($alt_grp_flg.equalsIgnoreCase(name)) {
			return alt_grp_flg();
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			return gd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			return io_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			return alloc_scope_typ_nm();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ1();
		}
		if ($io_schd_sub_typ_nm1.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm1();
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			return io_schd_sub_no1();
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ2();
		}
		if ($io_schd_sub_typ_nm2.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm2();
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			return io_schd_sub_no2();
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ3();
		}
		if ($io_schd_sub_typ_nm3.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm3();
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			return io_schd_sub_no3();
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ4();
		}
		if ($io_schd_sub_typ_nm4.equalsIgnoreCase(name)) {
			return io_schd_sub_typ_nm4();
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			return io_schd_sub_no4();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			return slip_schd_no();
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			return schd_dt_fr();
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			return schd_dt_to();
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			return accpt_schd_dt_fr();
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			return accpt_schd_dt_to();
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			return avl_schd_dt_fr();
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			return avl_schd_dt_to();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($vld_dt_fr_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr_fr();
		}
		if ($vld_dt_fr_to.equalsIgnoreCase(name)) {
			return vld_dt_fr_to();
		}
		if ($vld_dt_to_fr.equalsIgnoreCase(name)) {
			return vld_dt_to_fr();
		}
		if ($vld_dt_to_to.equalsIgnoreCase(name)) {
			return vld_dt_to_to();
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sno1_null_ng_flg.equalsIgnoreCase(name)) {
			return sno1_null_ng_flg();
		}
		if ($sno1_null_ok_flg.equalsIgnoreCase(name)) {
			return sno1_null_ok_flg();
		}
		if ($sno2_null_ng_flg.equalsIgnoreCase(name)) {
			return sno2_null_ng_flg();
		}
		if ($sno2_null_ok_flg.equalsIgnoreCase(name)) {
			return sno2_null_ok_flg();
		}
		if ($sno3_null_ng_flg.equalsIgnoreCase(name)) {
			return sno3_null_ng_flg();
		}
		if ($sno3_null_ok_flg.equalsIgnoreCase(name)) {
			return sno3_null_ok_flg();
		}
		if ($sno4_null_ng_flg.equalsIgnoreCase(name)) {
			return sno4_null_ng_flg();
		}
		if ($sno4_null_ok_flg.equalsIgnoreCase(name)) {
			return sno4_null_ok_flg();
		}
		if ($non_alloc_tgt_flg.equalsIgnoreCase(name)) {
			return non_alloc_tgt_flg();
		}
		if ($is_alloc_tgt_flg.equalsIgnoreCase(name)) {
			return is_alloc_tgt_flg();
		}
		if ($yet_allocate_flg.equalsIgnoreCase(name)) {
			return yet_allocate_flg();
		}
		if ($allocated_flg.equalsIgnoreCase(name)) {
			return allocated_flg();
		}
		if ($non_alloc_wait_flg.equalsIgnoreCase(name)) {
			return non_alloc_wait_flg();
		}
		if ($is_alloc_wait_flg.equalsIgnoreCase(name)) {
			return is_alloc_wait_flg();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
		}
		if ($slip_schd_no_flg.equalsIgnoreCase(name)) {
			return slip_schd_no_flg();
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			return schd_dt_flg();
		}
		if ($accpt_schd_dt_flg.equalsIgnoreCase(name)) {
			return accpt_schd_dt_flg();
		}
		if ($avl_schd_dt_flg.equalsIgnoreCase(name)) {
			return avl_schd_dt_flg();
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			return str_ln_flg();
		}
		if ($stk_arrv_flg.equalsIgnoreCase(name)) {
			return stk_arrv_flg();
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			return site_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			return lg_grp_flg();
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			return alloc_grp_flg();
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			return loc_grp_flg();
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			return sppl_flg();
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			return lot_no_flg();
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			return sublot_no_flg();
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			return sno1_flg();
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			return sno2_flg();
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			return sno3_flg();
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			return sno4_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($alt_grp_flg.equalsIgnoreCase(name)) {
			return alt_grp_flg();
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			return gd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
			return;
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			io_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			alloc_scope_typ_nm(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			io_schd_sub_typ1(value);
			return;
		}
		if ($io_schd_sub_typ_nm1.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm1(value);
			return;
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			io_schd_sub_no1(value);
			return;
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			io_schd_sub_typ2(value);
			return;
		}
		if ($io_schd_sub_typ_nm2.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm2(value);
			return;
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			io_schd_sub_no2(value);
			return;
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			io_schd_sub_typ3(value);
			return;
		}
		if ($io_schd_sub_typ_nm3.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm3(value);
			return;
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			io_schd_sub_no3(value);
			return;
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			io_schd_sub_typ4(value);
			return;
		}
		if ($io_schd_sub_typ_nm4.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm4(value);
			return;
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			io_schd_sub_no4(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			slip_schd_no(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			schd_dt_fr(value);
			return;
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			schd_dt_to(value);
			return;
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			avl_schd_dt_fr(value);
			return;
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			avl_schd_dt_to(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($vld_dt_fr_fr.equalsIgnoreCase(name)) {
			vld_dt_fr_fr(value);
			return;
		}
		if ($vld_dt_fr_to.equalsIgnoreCase(name)) {
			vld_dt_fr_to(value);
			return;
		}
		if ($vld_dt_to_fr.equalsIgnoreCase(name)) {
			vld_dt_to_fr(value);
			return;
		}
		if ($vld_dt_to_to.equalsIgnoreCase(name)) {
			vld_dt_to_to(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sno1_null_ng_flg.equalsIgnoreCase(name)) {
			sno1_null_ng_flg(value);
			return;
		}
		if ($sno1_null_ok_flg.equalsIgnoreCase(name)) {
			sno1_null_ok_flg(value);
			return;
		}
		if ($sno2_null_ng_flg.equalsIgnoreCase(name)) {
			sno2_null_ng_flg(value);
			return;
		}
		if ($sno2_null_ok_flg.equalsIgnoreCase(name)) {
			sno2_null_ok_flg(value);
			return;
		}
		if ($sno3_null_ng_flg.equalsIgnoreCase(name)) {
			sno3_null_ng_flg(value);
			return;
		}
		if ($sno3_null_ok_flg.equalsIgnoreCase(name)) {
			sno3_null_ok_flg(value);
			return;
		}
		if ($sno4_null_ng_flg.equalsIgnoreCase(name)) {
			sno4_null_ng_flg(value);
			return;
		}
		if ($sno4_null_ok_flg.equalsIgnoreCase(name)) {
			sno4_null_ok_flg(value);
			return;
		}
		if ($non_alloc_tgt_flg.equalsIgnoreCase(name)) {
			non_alloc_tgt_flg(value);
			return;
		}
		if ($is_alloc_tgt_flg.equalsIgnoreCase(name)) {
			is_alloc_tgt_flg(value);
			return;
		}
		if ($yet_allocate_flg.equalsIgnoreCase(name)) {
			yet_allocate_flg(value);
			return;
		}
		if ($allocated_flg.equalsIgnoreCase(name)) {
			allocated_flg(value);
			return;
		}
		if ($non_alloc_wait_flg.equalsIgnoreCase(name)) {
			non_alloc_wait_flg(value);
			return;
		}
		if ($is_alloc_wait_flg.equalsIgnoreCase(name)) {
			is_alloc_wait_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($slip_schd_no_flg.equalsIgnoreCase(name)) {
			slip_schd_no_flg(value);
			return;
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			schd_dt_flg(value);
			return;
		}
		if ($accpt_schd_dt_flg.equalsIgnoreCase(name)) {
			accpt_schd_dt_flg(value);
			return;
		}
		if ($avl_schd_dt_flg.equalsIgnoreCase(name)) {
			avl_schd_dt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			str_ln_flg(value);
			return;
		}
		if ($stk_arrv_flg.equalsIgnoreCase(name)) {
			stk_arrv_flg(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			lg_grp_flg(value);
			return;
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			alloc_grp_flg(value);
			return;
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			loc_grp_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($alt_grp_flg.equalsIgnoreCase(name)) {
			alt_grp_flg(value);
			return;
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			gd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			io_typ(value);
			return;
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			io_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			alloc_scope_typ_nm(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_sub_typ1.equalsIgnoreCase(name)) {
			io_schd_sub_typ1(value);
			return;
		}
		if ($io_schd_sub_typ_nm1.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm1(value);
			return;
		}
		if ($io_schd_sub_no1.equalsIgnoreCase(name)) {
			io_schd_sub_no1(value);
			return;
		}
		if ($io_schd_sub_typ2.equalsIgnoreCase(name)) {
			io_schd_sub_typ2(value);
			return;
		}
		if ($io_schd_sub_typ_nm2.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm2(value);
			return;
		}
		if ($io_schd_sub_no2.equalsIgnoreCase(name)) {
			io_schd_sub_no2(value);
			return;
		}
		if ($io_schd_sub_typ3.equalsIgnoreCase(name)) {
			io_schd_sub_typ3(value);
			return;
		}
		if ($io_schd_sub_typ_nm3.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm3(value);
			return;
		}
		if ($io_schd_sub_no3.equalsIgnoreCase(name)) {
			io_schd_sub_no3(value);
			return;
		}
		if ($io_schd_sub_typ4.equalsIgnoreCase(name)) {
			io_schd_sub_typ4(value);
			return;
		}
		if ($io_schd_sub_typ_nm4.equalsIgnoreCase(name)) {
			io_schd_sub_typ_nm4(value);
			return;
		}
		if ($io_schd_sub_no4.equalsIgnoreCase(name)) {
			io_schd_sub_no4(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			slip_schd_no(value);
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
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_dt_fr.equalsIgnoreCase(name)) {
			schd_dt_fr(value);
			return;
		}
		if ($schd_dt_to.equalsIgnoreCase(name)) {
			schd_dt_to(value);
			return;
		}
		if ($accpt_schd_dt_fr.equalsIgnoreCase(name)) {
			accpt_schd_dt_fr(value);
			return;
		}
		if ($accpt_schd_dt_to.equalsIgnoreCase(name)) {
			accpt_schd_dt_to(value);
			return;
		}
		if ($avl_schd_dt_fr.equalsIgnoreCase(name)) {
			avl_schd_dt_fr(value);
			return;
		}
		if ($avl_schd_dt_to.equalsIgnoreCase(name)) {
			avl_schd_dt_to(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($vld_dt_fr_fr.equalsIgnoreCase(name)) {
			vld_dt_fr_fr(value);
			return;
		}
		if ($vld_dt_fr_to.equalsIgnoreCase(name)) {
			vld_dt_fr_to(value);
			return;
		}
		if ($vld_dt_to_fr.equalsIgnoreCase(name)) {
			vld_dt_to_fr(value);
			return;
		}
		if ($vld_dt_to_to.equalsIgnoreCase(name)) {
			vld_dt_to_to(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sno1_null_ng_flg.equalsIgnoreCase(name)) {
			sno1_null_ng_flg(value);
			return;
		}
		if ($sno1_null_ok_flg.equalsIgnoreCase(name)) {
			sno1_null_ok_flg(value);
			return;
		}
		if ($sno2_null_ng_flg.equalsIgnoreCase(name)) {
			sno2_null_ng_flg(value);
			return;
		}
		if ($sno2_null_ok_flg.equalsIgnoreCase(name)) {
			sno2_null_ok_flg(value);
			return;
		}
		if ($sno3_null_ng_flg.equalsIgnoreCase(name)) {
			sno3_null_ng_flg(value);
			return;
		}
		if ($sno3_null_ok_flg.equalsIgnoreCase(name)) {
			sno3_null_ok_flg(value);
			return;
		}
		if ($sno4_null_ng_flg.equalsIgnoreCase(name)) {
			sno4_null_ng_flg(value);
			return;
		}
		if ($sno4_null_ok_flg.equalsIgnoreCase(name)) {
			sno4_null_ok_flg(value);
			return;
		}
		if ($non_alloc_tgt_flg.equalsIgnoreCase(name)) {
			non_alloc_tgt_flg(value);
			return;
		}
		if ($is_alloc_tgt_flg.equalsIgnoreCase(name)) {
			is_alloc_tgt_flg(value);
			return;
		}
		if ($yet_allocate_flg.equalsIgnoreCase(name)) {
			yet_allocate_flg(value);
			return;
		}
		if ($allocated_flg.equalsIgnoreCase(name)) {
			allocated_flg(value);
			return;
		}
		if ($non_alloc_wait_flg.equalsIgnoreCase(name)) {
			non_alloc_wait_flg(value);
			return;
		}
		if ($is_alloc_wait_flg.equalsIgnoreCase(name)) {
			is_alloc_wait_flg(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		if ($slip_schd_no_flg.equalsIgnoreCase(name)) {
			slip_schd_no_flg(value);
			return;
		}
		if ($schd_dt_flg.equalsIgnoreCase(name)) {
			schd_dt_flg(value);
			return;
		}
		if ($accpt_schd_dt_flg.equalsIgnoreCase(name)) {
			accpt_schd_dt_flg(value);
			return;
		}
		if ($avl_schd_dt_flg.equalsIgnoreCase(name)) {
			avl_schd_dt_flg(value);
			return;
		}
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($str_ln_flg.equalsIgnoreCase(name)) {
			str_ln_flg(value);
			return;
		}
		if ($stk_arrv_flg.equalsIgnoreCase(name)) {
			stk_arrv_flg(value);
			return;
		}
		if ($site_flg.equalsIgnoreCase(name)) {
			site_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
			return;
		}
		if ($lg_grp_flg.equalsIgnoreCase(name)) {
			lg_grp_flg(value);
			return;
		}
		if ($alloc_grp_flg.equalsIgnoreCase(name)) {
			alloc_grp_flg(value);
			return;
		}
		if ($loc_grp_flg.equalsIgnoreCase(name)) {
			loc_grp_flg(value);
			return;
		}
		if ($sppl_flg.equalsIgnoreCase(name)) {
			sppl_flg(value);
			return;
		}
		if ($lot_no_flg.equalsIgnoreCase(name)) {
			lot_no_flg(value);
			return;
		}
		if ($sublot_no_flg.equalsIgnoreCase(name)) {
			sublot_no_flg(value);
			return;
		}
		if ($sno1_flg.equalsIgnoreCase(name)) {
			sno1_flg(value);
			return;
		}
		if ($sno2_flg.equalsIgnoreCase(name)) {
			sno2_flg(value);
			return;
		}
		if ($sno3_flg.equalsIgnoreCase(name)) {
			sno3_flg(value);
			return;
		}
		if ($sno4_flg.equalsIgnoreCase(name)) {
			sno4_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($alt_grp_flg.equalsIgnoreCase(name)) {
			alt_grp_flg(value);
			return;
		}
		if ($gd_flg.equalsIgnoreCase(name)) {
			gd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

