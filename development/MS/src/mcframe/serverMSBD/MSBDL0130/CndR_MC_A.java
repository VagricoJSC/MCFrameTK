package mcframe.serverMSBD.MSBDL0130;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public static final String $mode = "mode";
	/**
	 * Does not include unplanned 計画外含まない.<p>
	 *
	 */
	public static final String $expt_unplan_flg = "expt_unplan_flg";
	/**
	 * Receipt normal management 入荷通常管理.<p>
	 *
	 */
	public static final String $arr_flg = "arr_flg";
	/**
	 * Receipt non-arrival management 入荷未着管理.<p>
	 *
	 */
	public static final String $not_yet_arr_flg = "not_yet_arr_flg";
	/**
	 * Receipt not completed 入荷未完了.<p>
	 *
	 */
	public static final String $arr_not_cmpl_flg = "arr_not_cmpl_flg";
	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public static final String $arr_cmpl_flg = "arr_cmpl_flg";
	/**
	 * Purchase uncompleted 仕入未完了.<p>
	 *
	 */
	public static final String $purc_not_cmpl_flg = "purc_not_cmpl_flg";
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public static final String $purc_cmpl_flg = "purc_cmpl_flg";
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public static final String $cont_abort_flg = "cont_abort_flg";
	/**
	 * For I/V Ｉ／Ｖ対象.<p>
	 *
	 */
	public static final String $iv_flg = "iv_flg";
	/**
	 * Not for I/V Ｉ／Ｖ対象外.<p>
	 *
	 */
	public static final String $not_iv_flg = "not_iv_flg";
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public static final String $not_edi_flg = "not_edi_flg";
	/**
	 * Include unapproved PO 発注未承認含む.<p>
	 *
	 */
	public static final String $incl_not_aprv_flg = "incl_not_aprv_flg";
	/**
	 * Scheduled purchase date FROM 仕入予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $purc_schd_dt_fr = "purc_schd_dt_fr";
	/**
	 * Scheduled purchase date TO 仕入予定日ＴＯ.<p>
	 *
	 */
	public static final String $purc_schd_dt_to = "purc_schd_dt_to";
	/**
	 * Purchase date FROM 仕入日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $purc_dt_fr = "purc_dt_fr";
	/**
	 * Purchase date TO 仕入日ＴＯ.<p>
	 *
	 */
	public static final String $purc_dt_to = "purc_dt_to";
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ac_dt_fr = "ac_dt_fr";
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public static final String $ac_dt_to = "ac_dt_to";
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
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_src_no = "po_schd_src_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
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
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public static final String $in_to_loc_wg_nm = "in_to_loc_wg_nm";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
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
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public static final String $purc_prgrs_fr = "purc_prgrs_fr";
	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public static final String $purc_prgrs_to = "purc_prgrs_to";
	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public static final String $s_sub_char1 = "s_sub_char1";
	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public static final String $s_sub_char2 = "s_sub_char2";
	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public static final String $s_sub_char3 = "s_sub_char3";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Result internal details remarks 実績内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Result details spare 1 実績明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Result details spare 2 実績明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Result details spare 3 実績細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public static final String $sppl_grp_flg1 = "sppl_grp_flg1";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public static final String $sppl_grp_flg2 = "sppl_grp_flg2";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public static final String $sppl_grp_flg3 = "sppl_grp_flg3";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public static final String $sppl_grp_flg4 = "sppl_grp_flg4";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public static final String $sppl_grp_flg5 = "sppl_grp_flg5";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public static final String $sppl_grp_flg6 = "sppl_grp_flg6";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public static final String $sppl_grp_flg7 = "sppl_grp_flg7";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public static final String $sppl_grp_flg8 = "sppl_grp_flg8";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public static final String $sppl_grp_flg9 = "sppl_grp_flg9";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public static final String $sppl_grp_flg10 = "sppl_grp_flg10";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
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
	 * Exclude received and uninspected item 入荷済かつ未検査の品目除く.<p>
	 *
	 */
	public static final String $arr_done_not_insp_fin_flg = "arr_done_not_insp_fin_flg";
	/**
	 * Inspection defective item only 検査不良品のみ.<p>
	 *
	 */
	public static final String $dfct_insp_flg = "dfct_insp_flg";
	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public static final String $incl_temp_ap_flg = "incl_temp_ap_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta mode_META = createStringMeta($mode);
	public static final MCMeta expt_unplan_flg_META = createCommonMeta($expt_unplan_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_flg_META = createCommonMeta($arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_yet_arr_flg_META = createCommonMeta($not_yet_arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_not_cmpl_flg_META = createCommonMeta($arr_not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_not_cmpl_flg_META = createCommonMeta($purc_not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_abort_flg_META = createCommonMeta($cont_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_flg_META = createCommonMeta($iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_iv_flg_META = createCommonMeta($not_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_edi_flg_META = createCommonMeta($not_edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta incl_not_aprv_flg_META = createCommonMeta($incl_not_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_schd_dt_fr_META = createCommonMeta($purc_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_schd_dt_to_META = createCommonMeta($purc_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_dt_fr_META = createCommonMeta($purc_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_dt_to_META = createCommonMeta($purc_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_fr_META = createCommonMeta($ac_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_to_META = createCommonMeta($ac_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta in_to_loc_wg_nm_META = createCommonMeta($in_to_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta purc_prgrs_fr_META = createCommonMeta($purc_prgrs_fr, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta purc_prgrs_to_META = createCommonMeta($purc_prgrs_to, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta s_sub_char1_META = createCommonMeta($s_sub_char1, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR1);
	public static final MCMeta s_sub_char2_META = createCommonMeta($s_sub_char2, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR2);
	public static final MCMeta s_sub_char3_META = createCommonMeta($s_sub_char3, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR3);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR3);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_ACT_D_INTR_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR3);
	public static final MCMeta sppl_grp_flg1_META = createCommonMeta($sppl_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg2_META = createCommonMeta($sppl_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg3_META = createCommonMeta($sppl_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg4_META = createCommonMeta($sppl_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg5_META = createCommonMeta($sppl_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg6_META = createCommonMeta($sppl_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg7_META = createCommonMeta($sppl_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg8_META = createCommonMeta($sppl_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg9_META = createCommonMeta($sppl_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_flg10_META = createCommonMeta($sppl_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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
	public static final MCMeta arr_done_not_insp_fin_flg_META = createCommonMeta($arr_done_not_insp_fin_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dfct_insp_flg_META = createCommonMeta($dfct_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta incl_temp_ap_flg_META = createCommonMeta($incl_temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			mode_META,
			expt_unplan_flg_META,
			arr_flg_META,
			not_yet_arr_flg_META,
			arr_not_cmpl_flg_META,
			arr_cmpl_flg_META,
			purc_not_cmpl_flg_META,
			purc_cmpl_flg_META,
			cont_abort_flg_META,
			iv_flg_META,
			not_iv_flg_META,
			edi_flg_META,
			not_edi_flg_META,
			incl_not_aprv_flg_META,
			purc_schd_dt_fr_META,
			purc_schd_dt_to_META,
			purc_dt_fr_META,
			purc_dt_to_META,
			ac_dt_fr_META,
			ac_dt_to_META,
			sppl_cd_META,
			sppl_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			bp_lot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			maker_cd_META,
			maker_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			po_schd_no_META,
			po_no_META,
			po_d_no_META,
			po_schd_src_typ_META,
			po_schd_src_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_d_no_META,
			purc_schd_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			mfg_inst_no_META,
			trd_cd_META,
			trd_nm_META,
			purc_id_typ_META,
			drct_dlv_typ_META,
			site_cd_META,
			site_nm_META,
			in_to_loc_wg_cd_META,
			in_to_loc_wg_nm_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			purc_prgrs_fr_META,
			purc_prgrs_to_META,
			s_sub_char1_META,
			s_sub_char2_META,
			s_sub_char3_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			sppl_grp_flg1_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_flg2_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_flg3_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_flg4_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_flg5_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_flg6_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_flg7_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_flg8_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_flg9_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_flg10_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
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
			arr_done_not_insp_fin_flg_META,
			dfct_insp_flg_META,
			incl_temp_ap_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public String mode() {
		return getConstString(offset + 1, $mode);
	}

	/**
	 * Search mode 検索モード.<p>
	 *
	 */
	public void mode(String value) {
		setConstString(offset + 1, $mode, value);
	}


	/**
	 * Does not include unplanned 計画外含まない.<p>
	 *
	 */
	public boolean expt_unplan_flg() {
		return getConstBoolean(offset + 2, $expt_unplan_flg);
	}

	/**
	 * Does not include unplanned 計画外含まない.<p>
	 *
	 */
	public void expt_unplan_flg(boolean value) {
		setConstBoolean(offset + 2, $expt_unplan_flg, value);
	}


	/**
	 * Receipt normal management 入荷通常管理.<p>
	 *
	 */
	public boolean arr_flg() {
		return getConstBoolean(offset + 3, $arr_flg);
	}

	/**
	 * Receipt normal management 入荷通常管理.<p>
	 *
	 */
	public void arr_flg(boolean value) {
		setConstBoolean(offset + 3, $arr_flg, value);
	}


	/**
	 * Receipt non-arrival management 入荷未着管理.<p>
	 *
	 */
	public boolean not_yet_arr_flg() {
		return getConstBoolean(offset + 4, $not_yet_arr_flg);
	}

	/**
	 * Receipt non-arrival management 入荷未着管理.<p>
	 *
	 */
	public void not_yet_arr_flg(boolean value) {
		setConstBoolean(offset + 4, $not_yet_arr_flg, value);
	}


	/**
	 * Receipt not completed 入荷未完了.<p>
	 *
	 */
	public boolean arr_not_cmpl_flg() {
		return getConstBoolean(offset + 5, $arr_not_cmpl_flg);
	}

	/**
	 * Receipt not completed 入荷未完了.<p>
	 *
	 */
	public void arr_not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 5, $arr_not_cmpl_flg, value);
	}


	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return getConstBoolean(offset + 6, $arr_cmpl_flg);
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		setConstBoolean(offset + 6, $arr_cmpl_flg, value);
	}


	/**
	 * Purchase uncompleted 仕入未完了.<p>
	 *
	 */
	public boolean purc_not_cmpl_flg() {
		return getConstBoolean(offset + 7, $purc_not_cmpl_flg);
	}

	/**
	 * Purchase uncompleted 仕入未完了.<p>
	 *
	 */
	public void purc_not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 7, $purc_not_cmpl_flg, value);
	}


	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 8, $purc_cmpl_flg);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 8, $purc_cmpl_flg, value);
	}


	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public boolean cont_abort_flg() {
		return getConstBoolean(offset + 9, $cont_abort_flg);
	}

	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public void cont_abort_flg(boolean value) {
		setConstBoolean(offset + 9, $cont_abort_flg, value);
	}


	/**
	 * For I/V Ｉ／Ｖ対象.<p>
	 *
	 */
	public boolean iv_flg() {
		return getConstBoolean(offset + 10, $iv_flg);
	}

	/**
	 * For I/V Ｉ／Ｖ対象.<p>
	 *
	 */
	public void iv_flg(boolean value) {
		setConstBoolean(offset + 10, $iv_flg, value);
	}


	/**
	 * Not for I/V Ｉ／Ｖ対象外.<p>
	 *
	 */
	public boolean not_iv_flg() {
		return getConstBoolean(offset + 11, $not_iv_flg);
	}

	/**
	 * Not for I/V Ｉ／Ｖ対象外.<p>
	 *
	 */
	public void not_iv_flg(boolean value) {
		setConstBoolean(offset + 11, $not_iv_flg, value);
	}


	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 12, $edi_flg);
	}

	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 12, $edi_flg, value);
	}


	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public boolean not_edi_flg() {
		return getConstBoolean(offset + 13, $not_edi_flg);
	}

	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public void not_edi_flg(boolean value) {
		setConstBoolean(offset + 13, $not_edi_flg, value);
	}


	/**
	 * Include unapproved PO 発注未承認含む.<p>
	 *
	 */
	public boolean incl_not_aprv_flg() {
		return getConstBoolean(offset + 14, $incl_not_aprv_flg);
	}

	/**
	 * Include unapproved PO 発注未承認含む.<p>
	 *
	 */
	public void incl_not_aprv_flg(boolean value) {
		setConstBoolean(offset + 14, $incl_not_aprv_flg, value);
	}


	/**
	 * Scheduled purchase date FROM 仕入予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_schd_dt_fr() {
		return getConstDate(offset + 15, $purc_schd_dt_fr);
	}

	/**
	 * Scheduled purchase date FROM 仕入予定日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_schd_dt_fr(MCDate value) {
		setConstDate(offset + 15, $purc_schd_dt_fr, value);
	}


	/**
	 * Scheduled purchase date TO 仕入予定日ＴＯ.<p>
	 *
	 */
	public MCDate purc_schd_dt_to() {
		return getConstDate(offset + 16, $purc_schd_dt_to);
	}

	/**
	 * Scheduled purchase date TO 仕入予定日ＴＯ.<p>
	 *
	 */
	public void purc_schd_dt_to(MCDate value) {
		setConstDate(offset + 16, $purc_schd_dt_to, value);
	}


	/**
	 * Purchase date FROM 仕入日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate purc_dt_fr() {
		return getConstDate(offset + 17, $purc_dt_fr);
	}

	/**
	 * Purchase date FROM 仕入日ＦＲＯＭ.<p>
	 *
	 */
	public void purc_dt_fr(MCDate value) {
		setConstDate(offset + 17, $purc_dt_fr, value);
	}


	/**
	 * Purchase date TO 仕入日ＴＯ.<p>
	 *
	 */
	public MCDate purc_dt_to() {
		return getConstDate(offset + 18, $purc_dt_to);
	}

	/**
	 * Purchase date TO 仕入日ＴＯ.<p>
	 *
	 */
	public void purc_dt_to(MCDate value) {
		setConstDate(offset + 18, $purc_dt_to, value);
	}


	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ac_dt_fr() {
		return getConstDate(offset + 19, $ac_dt_fr);
	}

	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public void ac_dt_fr(MCDate value) {
		setConstDate(offset + 19, $ac_dt_fr, value);
	}


	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDate ac_dt_to() {
		return getConstDate(offset + 20, $ac_dt_to);
	}

	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public void ac_dt_to(MCDate value) {
		setConstDate(offset + 20, $ac_dt_to, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 21, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 21, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 22, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 22, $sppl_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 23, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 23, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 24, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 24, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 25, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 25, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 26, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 26, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 27, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 27, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 28, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 28, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 29, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 29, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 30, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 30, $itm_nm, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 31, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 31, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 32, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 32, $sppl_itm_nm, value);
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 36, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 36, $bp_lot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 37, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 37, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 38, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 38, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 39, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 39, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 40, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 40, $sno4, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 41, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 41, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 42, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 42, $maker_nm, value);
	}


	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 43, $purc_usr_cd);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 43, $purc_usr_cd, value);
	}


	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 44, $purc_usr_nm);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 44, $purc_usr_nm, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 45, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 45, $purc_dpt_cd, value);
	}


	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 46, $purc_dpt_nm);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 46, $purc_dpt_nm, value);
	}


	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 47, $purc_dpt_wg_cd);
	}

	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 47, $purc_dpt_wg_cd, value);
	}


	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 48, $purc_dpt_wg_nm);
	}

	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 48, $purc_dpt_wg_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 49, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 49, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 50, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 50, $ap_dpt_nm, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 51, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 51, $po_schd_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 52, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 52, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 53, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 53, $po_d_no, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 54, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 54, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 55, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 55, $po_schd_src_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 56, $rcpt_iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 56, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 57, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 57, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 58, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 58, $rcpt_iv_d_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 59, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 59, $purc_schd_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 60, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 60, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 61, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 61, $purc_act_d_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 62, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 62, $mfg_inst_no, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 63, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 63, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 64, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 64, $trd_nm, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 65, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 65, $purc_id_typ, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 66, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 66, $drct_dlv_typ, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 67, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 67, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 68, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 68, $site_nm, value);
	}


	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 69, $in_to_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 69, $in_to_loc_wg_cd, value);
	}


	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public String in_to_loc_wg_nm() {
		return getConstString(offset + 70, $in_to_loc_wg_nm);
	}

	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public void in_to_loc_wg_nm(String value) {
		setConstString(offset + 70, $in_to_loc_wg_nm, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 71, $in_to_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 71, $in_to_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 72, $in_to_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 72, $in_to_loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 73, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 73, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 74, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 74, $str_ln_nm, value);
	}


	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public MCNumber purc_prgrs_fr() {
		return getConstNumber(offset + 75, $purc_prgrs_fr);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void purc_prgrs_fr(MCNumber value) {
		setConstNumber(offset + 75, $purc_prgrs_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void purc_prgrs_fr(int value) {
		setConstNumber(offset + 75, $purc_prgrs_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void purc_prgrs_fr(long value) {
		setConstNumber(offset + 75, $purc_prgrs_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void purc_prgrs_fr(float value) {
		setConstNumber(offset + 75, $purc_prgrs_fr, value);
	}

	/**
	 * Purchase progress rate (Equal or more) 仕入進捗率（以上）.<p>
	 *
	 */
	public void purc_prgrs_fr(double value) {
		setConstNumber(offset + 75, $purc_prgrs_fr, value);
	}


	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public MCNumber purc_prgrs_to() {
		return getConstNumber(offset + 76, $purc_prgrs_to);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void purc_prgrs_to(MCNumber value) {
		setConstNumber(offset + 76, $purc_prgrs_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void purc_prgrs_to(int value) {
		setConstNumber(offset + 76, $purc_prgrs_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void purc_prgrs_to(long value) {
		setConstNumber(offset + 76, $purc_prgrs_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void purc_prgrs_to(float value) {
		setConstNumber(offset + 76, $purc_prgrs_to, value);
	}

	/**
	 * Purchase progress rate (Equal or less) 仕入進捗率（以下）.<p>
	 *
	 */
	public void purc_prgrs_to(double value) {
		setConstNumber(offset + 76, $purc_prgrs_to, value);
	}


	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public String s_sub_char1() {
		return getConstString(offset + 77, $s_sub_char1);
	}

	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public void s_sub_char1(String value) {
		setConstString(offset + 77, $s_sub_char1, value);
	}


	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public String s_sub_char2() {
		return getConstString(offset + 78, $s_sub_char2);
	}

	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public void s_sub_char2(String value) {
		setConstString(offset + 78, $s_sub_char2, value);
	}


	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public String s_sub_char3() {
		return getConstString(offset + 79, $s_sub_char3);
	}

	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public void s_sub_char3(String value) {
		setConstString(offset + 79, $s_sub_char3, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 80, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 80, $trd_rmrks, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 81, $intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 81, $intr_rmrks, value);
	}


	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 82, $sub_char1);
	}

	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 82, $sub_char1, value);
	}


	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 83, $sub_char2);
	}

	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 83, $sub_char2, value);
	}


	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 84, $sub_char3);
	}

	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 84, $sub_char3, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 85, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 85, $trd_d_rmrks, value);
	}


	/**
	 * Result internal details remarks 実績内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 86, $intr_d_rmrks);
	}

	/**
	 * Result internal details remarks 実績内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 86, $intr_d_rmrks, value);
	}


	/**
	 * Result details spare 1 実績明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 87, $dtl_sub_char1);
	}

	/**
	 * Result details spare 1 実績明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 87, $dtl_sub_char1, value);
	}


	/**
	 * Result details spare 2 実績明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 88, $dtl_sub_char2);
	}

	/**
	 * Result details spare 2 実績明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 88, $dtl_sub_char2, value);
	}


	/**
	 * Result details spare 3 実績細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 89, $dtl_sub_char3);
	}

	/**
	 * Result details spare 3 実績細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 89, $dtl_sub_char3, value);
	}


	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public boolean sppl_grp_flg1() {
		return getConstBoolean(offset + 90, $sppl_grp_flg1);
	}

	/**
	 * Supplier classification 1 発注先分類１.<p>
	 *
	 */
	public void sppl_grp_flg1(boolean value) {
		setConstBoolean(offset + 90, $sppl_grp_flg1, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 91, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 91, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 92, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 92, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public boolean sppl_grp_flg2() {
		return getConstBoolean(offset + 93, $sppl_grp_flg2);
	}

	/**
	 * Supplier classification 2 発注先分類２.<p>
	 *
	 */
	public void sppl_grp_flg2(boolean value) {
		setConstBoolean(offset + 93, $sppl_grp_flg2, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 94, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 94, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 95, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 95, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public boolean sppl_grp_flg3() {
		return getConstBoolean(offset + 96, $sppl_grp_flg3);
	}

	/**
	 * Supplier classification 3 発注先分類３.<p>
	 *
	 */
	public void sppl_grp_flg3(boolean value) {
		setConstBoolean(offset + 96, $sppl_grp_flg3, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 97, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 97, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 98, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 98, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public boolean sppl_grp_flg4() {
		return getConstBoolean(offset + 99, $sppl_grp_flg4);
	}

	/**
	 * Supplier classification 4 発注先分類４.<p>
	 *
	 */
	public void sppl_grp_flg4(boolean value) {
		setConstBoolean(offset + 99, $sppl_grp_flg4, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 100, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 100, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 101, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 101, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public boolean sppl_grp_flg5() {
		return getConstBoolean(offset + 102, $sppl_grp_flg5);
	}

	/**
	 * Supplier classification 5 発注先分類５.<p>
	 *
	 */
	public void sppl_grp_flg5(boolean value) {
		setConstBoolean(offset + 102, $sppl_grp_flg5, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 103, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 103, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 104, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 104, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public boolean sppl_grp_flg6() {
		return getConstBoolean(offset + 105, $sppl_grp_flg6);
	}

	/**
	 * Supplier classification 6 発注先分類６.<p>
	 *
	 */
	public void sppl_grp_flg6(boolean value) {
		setConstBoolean(offset + 105, $sppl_grp_flg6, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 106, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 106, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 107, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 107, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public boolean sppl_grp_flg7() {
		return getConstBoolean(offset + 108, $sppl_grp_flg7);
	}

	/**
	 * Supplier classification 7 発注先分類７.<p>
	 *
	 */
	public void sppl_grp_flg7(boolean value) {
		setConstBoolean(offset + 108, $sppl_grp_flg7, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 109, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 109, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 110, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 110, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public boolean sppl_grp_flg8() {
		return getConstBoolean(offset + 111, $sppl_grp_flg8);
	}

	/**
	 * Supplier classification 8 発注先分類８.<p>
	 *
	 */
	public void sppl_grp_flg8(boolean value) {
		setConstBoolean(offset + 111, $sppl_grp_flg8, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 112, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 112, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 113, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 113, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public boolean sppl_grp_flg9() {
		return getConstBoolean(offset + 114, $sppl_grp_flg9);
	}

	/**
	 * Supplier classification 9 発注先分類９.<p>
	 *
	 */
	public void sppl_grp_flg9(boolean value) {
		setConstBoolean(offset + 114, $sppl_grp_flg9, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 115, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 115, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 116, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 116, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public boolean sppl_grp_flg10() {
		return getConstBoolean(offset + 117, $sppl_grp_flg10);
	}

	/**
	 * Supplier classification 10 発注先分類１０.<p>
	 *
	 */
	public void sppl_grp_flg10(boolean value) {
		setConstBoolean(offset + 117, $sppl_grp_flg10, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 118, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 118, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 119, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 119, $sppl_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 120, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 120, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 121, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 121, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 122, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 122, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 123, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 123, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 124, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 124, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 125, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 125, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 126, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 126, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 127, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 127, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 128, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 128, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 129, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 129, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 130, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 130, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 131, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 131, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 132, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 132, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 133, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 133, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 134, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 134, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 135, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 135, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 136, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 136, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 137, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 137, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 138, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 138, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 139, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 139, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 140, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 140, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 141, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 141, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 142, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 142, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 143, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 143, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 144, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 144, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 145, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 145, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 146, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 146, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 147, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 147, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 148, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 148, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 149, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 149, $itm_grp_nm10, value);
	}


	/**
	 * Exclude received and uninspected item 入荷済かつ未検査の品目除く.<p>
	 *
	 */
	public boolean arr_done_not_insp_fin_flg() {
		return getConstBoolean(offset + 150, $arr_done_not_insp_fin_flg);
	}

	/**
	 * Exclude received and uninspected item 入荷済かつ未検査の品目除く.<p>
	 *
	 */
	public void arr_done_not_insp_fin_flg(boolean value) {
		setConstBoolean(offset + 150, $arr_done_not_insp_fin_flg, value);
	}


	/**
	 * Inspection defective item only 検査不良品のみ.<p>
	 *
	 */
	public boolean dfct_insp_flg() {
		return getConstBoolean(offset + 151, $dfct_insp_flg);
	}

	/**
	 * Inspection defective item only 検査不良品のみ.<p>
	 *
	 */
	public void dfct_insp_flg(boolean value) {
		setConstBoolean(offset + 151, $dfct_insp_flg, value);
	}


	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public boolean incl_temp_ap_flg() {
		return getConstBoolean(offset + 152, $incl_temp_ap_flg);
	}

	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public void incl_temp_ap_flg(boolean value) {
		setConstBoolean(offset + 152, $incl_temp_ap_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			return s_sub_char1();
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			return s_sub_char2();
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			return s_sub_char3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
	public MCNumber getNumber(String name) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			return purc_prgrs_fr();
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			return purc_prgrs_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt_fr.equalsIgnoreCase(name)) {
			return purc_schd_dt_fr();
		}
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			return purc_schd_dt_to();
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			return purc_dt_fr();
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			return purc_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($expt_unplan_flg.equalsIgnoreCase(name)) {
			return expt_unplan_flg();
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			return arr_flg();
		}
		if ($not_yet_arr_flg.equalsIgnoreCase(name)) {
			return not_yet_arr_flg();
		}
		if ($arr_not_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_not_cmpl_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_not_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_not_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($cont_abort_flg.equalsIgnoreCase(name)) {
			return cont_abort_flg();
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			return not_iv_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($incl_not_aprv_flg.equalsIgnoreCase(name)) {
			return incl_not_aprv_flg();
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
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
		if ($arr_done_not_insp_fin_flg.equalsIgnoreCase(name)) {
			return arr_done_not_insp_fin_flg();
		}
		if ($dfct_insp_flg.equalsIgnoreCase(name)) {
			return dfct_insp_flg();
		}
		if ($incl_temp_ap_flg.equalsIgnoreCase(name)) {
			return incl_temp_ap_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($mode.equalsIgnoreCase(name)) {
			return mode();
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			return s_sub_char1();
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			return s_sub_char2();
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			return s_sub_char3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
	public MCNumber getNumberNE(String name) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			return purc_prgrs_fr();
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			return purc_prgrs_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt_fr.equalsIgnoreCase(name)) {
			return purc_schd_dt_fr();
		}
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			return purc_schd_dt_to();
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			return purc_dt_fr();
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			return purc_dt_to();
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			return ac_dt_fr();
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			return ac_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($expt_unplan_flg.equalsIgnoreCase(name)) {
			return expt_unplan_flg();
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			return arr_flg();
		}
		if ($not_yet_arr_flg.equalsIgnoreCase(name)) {
			return not_yet_arr_flg();
		}
		if ($arr_not_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_not_cmpl_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_not_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_not_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($cont_abort_flg.equalsIgnoreCase(name)) {
			return cont_abort_flg();
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			return not_iv_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			return not_edi_flg();
		}
		if ($incl_not_aprv_flg.equalsIgnoreCase(name)) {
			return incl_not_aprv_flg();
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			return sppl_grp_flg1();
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			return sppl_grp_flg2();
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			return sppl_grp_flg3();
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			return sppl_grp_flg4();
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			return sppl_grp_flg5();
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			return sppl_grp_flg6();
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			return sppl_grp_flg7();
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			return sppl_grp_flg8();
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			return sppl_grp_flg9();
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			return sppl_grp_flg10();
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
		if ($arr_done_not_insp_fin_flg.equalsIgnoreCase(name)) {
			return arr_done_not_insp_fin_flg();
		}
		if ($dfct_insp_flg.equalsIgnoreCase(name)) {
			return dfct_insp_flg();
		}
		if ($incl_temp_ap_flg.equalsIgnoreCase(name)) {
			return incl_temp_ap_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($mode.equalsIgnoreCase(name)) {
			mode(value);
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
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
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
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
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			s_sub_char1(value);
			return;
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			s_sub_char2(value);
			return;
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			s_sub_char3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
	public void setNumber(String name, MCNumber value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt_fr.equalsIgnoreCase(name)) {
			purc_schd_dt_fr(value);
			return;
		}
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			purc_schd_dt_to(value);
			return;
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			purc_dt_fr(value);
			return;
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			purc_dt_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($expt_unplan_flg.equalsIgnoreCase(name)) {
			expt_unplan_flg(value);
			return;
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			arr_flg(value);
			return;
		}
		if ($not_yet_arr_flg.equalsIgnoreCase(name)) {
			not_yet_arr_flg(value);
			return;
		}
		if ($arr_not_cmpl_flg.equalsIgnoreCase(name)) {
			arr_not_cmpl_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_not_cmpl_flg.equalsIgnoreCase(name)) {
			purc_not_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($cont_abort_flg.equalsIgnoreCase(name)) {
			cont_abort_flg(value);
			return;
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			not_iv_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($incl_not_aprv_flg.equalsIgnoreCase(name)) {
			incl_not_aprv_flg(value);
			return;
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
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
		if ($arr_done_not_insp_fin_flg.equalsIgnoreCase(name)) {
			arr_done_not_insp_fin_flg(value);
			return;
		}
		if ($dfct_insp_flg.equalsIgnoreCase(name)) {
			dfct_insp_flg(value);
			return;
		}
		if ($incl_temp_ap_flg.equalsIgnoreCase(name)) {
			incl_temp_ap_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($mode.equalsIgnoreCase(name)) {
			mode(value);
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
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
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
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
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
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			s_sub_char1(value);
			return;
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			s_sub_char2(value);
			return;
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			s_sub_char3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_prgrs_fr.equalsIgnoreCase(name)) {
			purc_prgrs_fr(value);
			return;
		}
		if ($purc_prgrs_to.equalsIgnoreCase(name)) {
			purc_prgrs_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt_fr.equalsIgnoreCase(name)) {
			purc_schd_dt_fr(value);
			return;
		}
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			purc_schd_dt_to(value);
			return;
		}
		if ($purc_dt_fr.equalsIgnoreCase(name)) {
			purc_dt_fr(value);
			return;
		}
		if ($purc_dt_to.equalsIgnoreCase(name)) {
			purc_dt_to(value);
			return;
		}
		if ($ac_dt_fr.equalsIgnoreCase(name)) {
			ac_dt_fr(value);
			return;
		}
		if ($ac_dt_to.equalsIgnoreCase(name)) {
			ac_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($expt_unplan_flg.equalsIgnoreCase(name)) {
			expt_unplan_flg(value);
			return;
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			arr_flg(value);
			return;
		}
		if ($not_yet_arr_flg.equalsIgnoreCase(name)) {
			not_yet_arr_flg(value);
			return;
		}
		if ($arr_not_cmpl_flg.equalsIgnoreCase(name)) {
			arr_not_cmpl_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_not_cmpl_flg.equalsIgnoreCase(name)) {
			purc_not_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
			return;
		}
		if ($cont_abort_flg.equalsIgnoreCase(name)) {
			cont_abort_flg(value);
			return;
		}
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($not_iv_flg.equalsIgnoreCase(name)) {
			not_iv_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($not_edi_flg.equalsIgnoreCase(name)) {
			not_edi_flg(value);
			return;
		}
		if ($incl_not_aprv_flg.equalsIgnoreCase(name)) {
			incl_not_aprv_flg(value);
			return;
		}
		if ($sppl_grp_flg1.equalsIgnoreCase(name)) {
			sppl_grp_flg1(value);
			return;
		}
		if ($sppl_grp_flg2.equalsIgnoreCase(name)) {
			sppl_grp_flg2(value);
			return;
		}
		if ($sppl_grp_flg3.equalsIgnoreCase(name)) {
			sppl_grp_flg3(value);
			return;
		}
		if ($sppl_grp_flg4.equalsIgnoreCase(name)) {
			sppl_grp_flg4(value);
			return;
		}
		if ($sppl_grp_flg5.equalsIgnoreCase(name)) {
			sppl_grp_flg5(value);
			return;
		}
		if ($sppl_grp_flg6.equalsIgnoreCase(name)) {
			sppl_grp_flg6(value);
			return;
		}
		if ($sppl_grp_flg7.equalsIgnoreCase(name)) {
			sppl_grp_flg7(value);
			return;
		}
		if ($sppl_grp_flg8.equalsIgnoreCase(name)) {
			sppl_grp_flg8(value);
			return;
		}
		if ($sppl_grp_flg9.equalsIgnoreCase(name)) {
			sppl_grp_flg9(value);
			return;
		}
		if ($sppl_grp_flg10.equalsIgnoreCase(name)) {
			sppl_grp_flg10(value);
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
		if ($arr_done_not_insp_fin_flg.equalsIgnoreCase(name)) {
			arr_done_not_insp_fin_flg(value);
			return;
		}
		if ($dfct_insp_flg.equalsIgnoreCase(name)) {
			dfct_insp_flg(value);
			return;
		}
		if ($incl_temp_ap_flg.equalsIgnoreCase(name)) {
			incl_temp_ap_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

