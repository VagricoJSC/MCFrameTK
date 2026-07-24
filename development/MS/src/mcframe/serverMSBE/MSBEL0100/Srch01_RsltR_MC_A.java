package mcframe.serverMSBE.MSBEL0100;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Sublot No.?(GR/GI result) サブロットＮＯ（受払実績）.<p>
	 *
	 */
	public static final String $act_tbl_sublot_no = "act_tbl_sublot_no";
	/**
	 * Sublot No. (Lot info.) サブロットＮＯ（ロット情報）.<p>
	 *
	 */
	public static final String $lot_tbl_sublot_no = "lot_tbl_sublot_no";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Start date 開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public static final String $st_hm = "st_hm";
	/**
	 * End date 終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public static final String $end_hm = "end_hm";
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
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ_nm = "insp_judg_rslt_typ_nm";
	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public static final String $insp_cnt = "insp_cnt";
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
	 * Location BP cd. 場所取引先ＣＤ.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
	/**
	 * Location BP name 場所取引先名.<p>
	 *
	 */
	public static final String $loc_sppl_nm = "loc_sppl_nm";
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
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Slip generation date 伝票実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public static final String $trd_ptn_typ_nm = "trd_ptn_typ_nm";
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public static final String $io_act_typ_nm = "io_act_typ_nm";
	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public static final String $base_unit_gr_qty = "base_unit_gr_qty";
	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public static final String $base_unit_gi_qty = "base_unit_gi_qty";
	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public static final String $pack_unit_gr_qty = "pack_unit_gr_qty";
	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public static final String $pack_unit_gi_qty = "pack_unit_gi_qty";
	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Movement/transport destination/source location 移動・移送先／元場所.<p>
	 *
	 */
	public static final String $xfr_loc_cd = "xfr_loc_cd";
	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public static final String $xfr_loc_nm = "xfr_loc_nm";
	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	/**
	 * Business reason 業務理由.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Slip recording date 伝票計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_no = "slip_no";
	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public static final String $slip_seq_no = "slip_seq_no";
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public static final String $trn_typ_nm = "trn_typ_nm";
	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $srt_no = "srt_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta act_tbl_sublot_no_META = createCommonMeta($act_tbl_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta lot_tbl_sublot_no_META = createCommonMeta($lot_tbl_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_hm_META = createCommonMeta($st_hm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_hm_META = createCommonMeta($end_hm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta insp_judg_rslt_typ_nm_META = createCommonMeta($insp_judg_rslt_typ_nm, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP_NM);
	public static final MCMeta insp_cnt_META = createCommonMeta($insp_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta loc_sppl_nm_META = createCommonMeta($loc_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ptn_typ_nm_META = createCommonMeta($trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta io_act_typ_nm_META = createCommonMeta($io_act_typ_nm, mcframe.commonMS.meta.MS_META.IO_ACT_TYP_NM);
	public static final MCMeta base_unit_gr_qty_META = createCommonMeta($base_unit_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_gi_qty_META = createCommonMeta($base_unit_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_gr_qty_META = createCommonMeta($pack_unit_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_gi_qty_META = createCommonMeta($pack_unit_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta xfr_loc_cd_META = createCommonMeta($xfr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta xfr_loc_nm_META = createCommonMeta($xfr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_typ_META = createCommonMeta($io_typ, mcframe.commonMS.meta.MS_META.IO_TYP);
	public static final MCMeta io_typ_nm_META = createCommonMeta($io_typ_nm, mcframe.commonMS.meta.MS_META.IO_TYP_NM);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slip_no_META = createCommonMeta($slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta slip_seq_no_META = createCommonMeta($slip_seq_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta trn_typ_nm_META = createCommonMeta($trn_typ_nm, mcframe.commonMS.meta.MS_META.TRN_TYP_NM);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta srt_no_META = createCommonMeta($srt_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			act_tbl_sublot_no_META,
			lot_tbl_sublot_no_META,
			sublot_mng_typ_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bp_lot_no_META,
			first_gr_dt_META,
			vld_dt_META,
			lmt_dt_META,
			insp_no_META,
			st_dt_META,
			st_hm_META,
			end_dt_META,
			end_hm_META,
			quality_typ_META,
			quality_typ_nm_META,
			judg_dt_META,
			insp_judg_rslt_typ_META,
			insp_judg_rslt_typ_nm_META,
			insp_cnt_META,
			site_cd_META,
			site_nm_META,
			loc_sppl_cd_META,
			loc_sppl_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			act_dt_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			trd_ptn_typ_nm_META,
			io_act_typ_META,
			io_act_typ_nm_META,
			base_unit_gr_qty_META,
			base_unit_gi_qty_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			pack_unit_gr_qty_META,
			pack_unit_gi_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			dlv_cd_META,
			dlv_nm_META,
			tdlv_cd_META,
			tdlv_nm_META,
			cst_cd_META,
			cst_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			xfr_loc_cd_META,
			xfr_loc_nm_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_itm_nm_META,
			par_lot_no_META,
			par_sublot_no_META,
			rsn_cd_META,
			rsn_nm_META,
			ac_dt_META,
			io_typ_META,
			io_typ_nm_META,
			mfg_inst_no_META,
			slo_no_META,
			po_no_META,
			slip_no_META,
			slip_seq_no_META,
			trn_typ_META,
			trn_typ_nm_META,
			act_no_META,
			act_d_no_META,
			srt_no_META
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
				{$sublot_mng_typ, "MAC_SUBLOT_MNG_TYP"},	// sublot_mng_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$insp_judg_rslt_typ, "MSC_INSP_JUDG_RSLT_TYP"},	// insp_judg_rslt_typ
				{$trd_ptn_typ, "MAC_TRD_PTN_TYP"},	// trd_ptn_typ
				{$io_act_typ, "MSC_IO_ACT_TYP"},	// io_act_typ
				{$io_typ, "MSC_IO_TYP"},	// io_typ
				{$trn_typ, "MSC_TRN_TYP"}	// trn_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 6, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 6, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 7, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 7, $lot_no, value);
	}


	/**
	 * Sublot No.?(GR/GI result) サブロットＮＯ（受払実績）.<p>
	 *
	 */
	public String act_tbl_sublot_no() {
		return getConstString(offset + 8, $act_tbl_sublot_no);
	}

	/**
	 * Sublot No.?(GR/GI result) サブロットＮＯ（受払実績）.<p>
	 *
	 */
	public void act_tbl_sublot_no(String value) {
		setConstString(offset + 8, $act_tbl_sublot_no, value);
	}


	/**
	 * Sublot No. (Lot info.) サブロットＮＯ（ロット情報）.<p>
	 *
	 */
	public String lot_tbl_sublot_no() {
		return getConstString(offset + 9, $lot_tbl_sublot_no);
	}

	/**
	 * Sublot No. (Lot info.) サブロットＮＯ（ロット情報）.<p>
	 *
	 */
	public void lot_tbl_sublot_no(String value) {
		setConstString(offset + 9, $lot_tbl_sublot_no, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 10, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 10, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 11, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 11, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 12, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 12, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 13, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 13, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 14, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 14, $sno4, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 15, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 15, $bp_lot_no, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 16, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 16, $first_gr_dt, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 17, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 17, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 18, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 18, $lmt_dt, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 19, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 19, $insp_no, value);
	}


	/**
	 * Start date 開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 20, $st_dt);
	}

	/**
	 * Start date 開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 20, $st_dt, value);
	}


	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return getConstDate(offset + 21, $st_hm);
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		setConstDate(offset + 21, $st_hm, value);
	}


	/**
	 * End date 終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 22, $end_dt);
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 22, $end_dt, value);
	}


	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return getConstDate(offset + 23, $end_hm);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		setConstDate(offset + 23, $end_hm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 24, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 24, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 25, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 25, $quality_typ_nm, value);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 26, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 26, $judg_dt, value);
	}


	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 27, $insp_judg_rslt_typ);
	}

	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 27, $insp_judg_rslt_typ, value);
	}


	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public String insp_judg_rslt_typ_nm() {
		return getConstString(offset + 28, $insp_judg_rslt_typ_nm);
	}

	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public void insp_judg_rslt_typ_nm(String value) {
		setConstString(offset + 28, $insp_judg_rslt_typ_nm, value);
	}


	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public MCNumber insp_cnt() {
		return getConstNumber(offset + 29, $insp_cnt);
	}

	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public void insp_cnt(MCNumber value) {
		setConstNumber(offset + 29, $insp_cnt, value);
	}

	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public void insp_cnt(int value) {
		setConstNumber(offset + 29, $insp_cnt, value);
	}

	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public void insp_cnt(long value) {
		setConstNumber(offset + 29, $insp_cnt, value);
	}

	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public void insp_cnt(float value) {
		setConstNumber(offset + 29, $insp_cnt, value);
	}

	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public void insp_cnt(double value) {
		setConstNumber(offset + 29, $insp_cnt, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 30, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 30, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 31, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 31, $site_nm, value);
	}


	/**
	 * Location BP cd. 場所取引先ＣＤ.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 32, $loc_sppl_cd);
	}

	/**
	 * Location BP cd. 場所取引先ＣＤ.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 32, $loc_sppl_cd, value);
	}


	/**
	 * Location BP name 場所取引先名.<p>
	 *
	 */
	public String loc_sppl_nm() {
		return getConstString(offset + 33, $loc_sppl_nm);
	}

	/**
	 * Location BP name 場所取引先名.<p>
	 *
	 */
	public void loc_sppl_nm(String value) {
		setConstString(offset + 33, $loc_sppl_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 34, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 34, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 35, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 35, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 36, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 36, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 37, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 37, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 38, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 38, $str_ln_cd_none_flg, value);
	}


	/**
	 * Slip generation date 伝票実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 39, $act_dt);
	}

	/**
	 * Slip generation date 伝票実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 39, $act_dt, value);
	}


	/**
	 * Transaction 取引.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 40, $trd_cd);
	}

	/**
	 * Transaction 取引.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 40, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 41, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 41, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 42, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 42, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 43, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 43, $trd_ptn_typ_nm, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 44, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 44, $io_act_typ, value);
	}


	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public String io_act_typ_nm() {
		return getConstString(offset + 45, $io_act_typ_nm);
	}

	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public void io_act_typ_nm(String value) {
		setConstString(offset + 45, $io_act_typ_nm, value);
	}


	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public MCNumber base_unit_gr_qty() {
		return getConstNumber(offset + 46, $base_unit_gr_qty);
	}

	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public void base_unit_gr_qty(MCNumber value) {
		setConstNumber(offset + 46, $base_unit_gr_qty, value);
	}

	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public void base_unit_gr_qty(int value) {
		setConstNumber(offset + 46, $base_unit_gr_qty, value);
	}

	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public void base_unit_gr_qty(long value) {
		setConstNumber(offset + 46, $base_unit_gr_qty, value);
	}

	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public void base_unit_gr_qty(float value) {
		setConstNumber(offset + 46, $base_unit_gr_qty, value);
	}

	/**
	 * GR qty. (Base) 入庫数（基）.<p>
	 *
	 */
	public void base_unit_gr_qty(double value) {
		setConstNumber(offset + 46, $base_unit_gr_qty, value);
	}


	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public MCNumber base_unit_gi_qty() {
		return getConstNumber(offset + 47, $base_unit_gi_qty);
	}

	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public void base_unit_gi_qty(MCNumber value) {
		setConstNumber(offset + 47, $base_unit_gi_qty, value);
	}

	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public void base_unit_gi_qty(int value) {
		setConstNumber(offset + 47, $base_unit_gi_qty, value);
	}

	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public void base_unit_gi_qty(long value) {
		setConstNumber(offset + 47, $base_unit_gi_qty, value);
	}

	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public void base_unit_gi_qty(float value) {
		setConstNumber(offset + 47, $base_unit_gi_qty, value);
	}

	/**
	 * GI qty. (Base) 出庫数（基）.<p>
	 *
	 */
	public void base_unit_gi_qty(double value) {
		setConstNumber(offset + 47, $base_unit_gi_qty, value);
	}


	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 48, $base_unit_qty);
	}

	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Inventory qty. (Base) 在庫数（基）.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 49, $base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 49, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 50, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 50, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 51, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 51, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 51, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 51, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 51, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 51, $base_unit_dec_place, value);
	}


	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public MCNumber pack_unit_gr_qty() {
		return getConstNumber(offset + 52, $pack_unit_gr_qty);
	}

	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gr_qty(MCNumber value) {
		setConstNumber(offset + 52, $pack_unit_gr_qty, value);
	}

	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gr_qty(int value) {
		setConstNumber(offset + 52, $pack_unit_gr_qty, value);
	}

	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gr_qty(long value) {
		setConstNumber(offset + 52, $pack_unit_gr_qty, value);
	}

	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gr_qty(float value) {
		setConstNumber(offset + 52, $pack_unit_gr_qty, value);
	}

	/**
	 * GR qty. (SKU) 入庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gr_qty(double value) {
		setConstNumber(offset + 52, $pack_unit_gr_qty, value);
	}


	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public MCNumber pack_unit_gi_qty() {
		return getConstNumber(offset + 53, $pack_unit_gi_qty);
	}

	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gi_qty(MCNumber value) {
		setConstNumber(offset + 53, $pack_unit_gi_qty, value);
	}

	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gi_qty(int value) {
		setConstNumber(offset + 53, $pack_unit_gi_qty, value);
	}

	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gi_qty(long value) {
		setConstNumber(offset + 53, $pack_unit_gi_qty, value);
	}

	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gi_qty(float value) {
		setConstNumber(offset + 53, $pack_unit_gi_qty, value);
	}

	/**
	 * GI qty. (SKU) 出庫数（荷姿）.<p>
	 *
	 */
	public void pack_unit_gi_qty(double value) {
		setConstNumber(offset + 53, $pack_unit_gi_qty, value);
	}


	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 54, $pack_unit_cd);
	}

	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 54, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 55, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 55, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 56, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 56, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 56, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 56, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 56, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 56, $pack_unit_dec_place, value);
	}


	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 57, $dlv_cd);
	}

	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 57, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 58, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 58, $dlv_nm, value);
	}


	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 59, $tdlv_cd);
	}

	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 59, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 60, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 60, $tdlv_nm, value);
	}


	/**
	 * Customer 得意先.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 61, $cst_cd);
	}

	/**
	 * Customer 得意先.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 61, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 62, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 62, $cst_nm, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 63, $sppl_cd);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 63, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 64, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 64, $sppl_nm, value);
	}


	/**
	 * Movement/transport destination/source location 移動・移送先／元場所.<p>
	 *
	 */
	public String xfr_loc_cd() {
		return getConstString(offset + 65, $xfr_loc_cd);
	}

	/**
	 * Movement/transport destination/source location 移動・移送先／元場所.<p>
	 *
	 */
	public void xfr_loc_cd(String value) {
		setConstString(offset + 65, $xfr_loc_cd, value);
	}


	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public String xfr_loc_nm() {
		return getConstString(offset + 66, $xfr_loc_nm);
	}

	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public void xfr_loc_nm(String value) {
		setConstString(offset + 66, $xfr_loc_nm, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 67, $par_itm_cd);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 67, $par_itm_cd, value);
	}


	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 68, $par_itm_sub1);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 68, $par_itm_sub1, value);
	}


	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 69, $par_itm_sub2);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 69, $par_itm_sub2, value);
	}


	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 70, $par_itm_sub3);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 70, $par_itm_sub3, value);
	}


	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 71, $par_itm_nm);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 71, $par_itm_nm, value);
	}


	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 72, $par_lot_no);
	}

	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 72, $par_lot_no, value);
	}


	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 73, $par_sublot_no);
	}

	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 73, $par_sublot_no, value);
	}


	/**
	 * Business reason 業務理由.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 74, $rsn_cd);
	}

	/**
	 * Business reason 業務理由.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 74, $rsn_cd, value);
	}


	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 75, $rsn_nm);
	}

	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 75, $rsn_nm, value);
	}


	/**
	 * Slip recording date 伝票計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 76, $ac_dt);
	}

	/**
	 * Slip recording date 伝票計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 76, $ac_dt, value);
	}


	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public String io_typ() {
		return getConstString(offset + 77, $io_typ);
	}

	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public void io_typ(String value) {
		setConstString(offset + 77, $io_typ, value);
	}


	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public String io_typ_nm() {
		return getConstString(offset + 78, $io_typ_nm);
	}

	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public void io_typ_nm(String value) {
		setConstString(offset + 78, $io_typ_nm, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 79, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 79, $mfg_inst_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 80, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 80, $slo_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 81, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 81, $po_no, value);
	}


	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return getConstString(offset + 82, $slip_no);
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		setConstString(offset + 82, $slip_no, value);
	}


	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCNumber slip_seq_no() {
		return getConstNumber(offset + 83, $slip_seq_no);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(MCNumber value) {
		setConstNumber(offset + 83, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(int value) {
		setConstNumber(offset + 83, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(long value) {
		setConstNumber(offset + 83, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(float value) {
		setConstNumber(offset + 83, $slip_seq_no, value);
	}

	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public void slip_seq_no(double value) {
		setConstNumber(offset + 83, $slip_seq_no, value);
	}


	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 84, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 84, $trn_typ, value);
	}


	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public String trn_typ_nm() {
		return getConstString(offset + 85, $trn_typ_nm);
	}

	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public void trn_typ_nm(String value) {
		setConstString(offset + 85, $trn_typ_nm, value);
	}


	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 86, $act_no);
	}

	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 86, $act_no, value);
	}


	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 87, $act_d_no);
	}

	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 87, $act_d_no, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber srt_no() {
		return getConstNumber(offset + 88, $srt_no);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(MCNumber value) {
		setConstNumber(offset + 88, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(int value) {
		setConstNumber(offset + 88, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(long value) {
		setConstNumber(offset + 88, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(float value) {
		setConstNumber(offset + 88, $srt_no, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void srt_no(double value) {
		setConstNumber(offset + 88, $srt_no, value);
	}


	public String getString(String name) {
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
		if ($act_tbl_sublot_no.equalsIgnoreCase(name)) {
			return act_tbl_sublot_no();
		}
		if ($lot_tbl_sublot_no.equalsIgnoreCase(name)) {
			return lot_tbl_sublot_no();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			return loc_sppl_nm();
		}
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			return xfr_loc_cd();
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			return xfr_loc_nm();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			return io_typ_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			return trn_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			return insp_cnt();
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			return base_unit_gr_qty();
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			return base_unit_gi_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			return pack_unit_gr_qty();
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			return pack_unit_gi_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			return srt_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($act_tbl_sublot_no.equalsIgnoreCase(name)) {
			return act_tbl_sublot_no();
		}
		if ($lot_tbl_sublot_no.equalsIgnoreCase(name)) {
			return lot_tbl_sublot_no();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			return loc_sppl_nm();
		}
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			return xfr_loc_cd();
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			return xfr_loc_nm();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($io_typ.equalsIgnoreCase(name)) {
			return io_typ();
		}
		if ($io_typ_nm.equalsIgnoreCase(name)) {
			return io_typ_nm();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			return trn_typ_nm();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			return insp_cnt();
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			return base_unit_gr_qty();
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			return base_unit_gi_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			return pack_unit_gr_qty();
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			return pack_unit_gi_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			return slip_seq_no();
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			return srt_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($act_tbl_sublot_no.equalsIgnoreCase(name)) {
			act_tbl_sublot_no(value);
			return;
		}
		if ($lot_tbl_sublot_no.equalsIgnoreCase(name)) {
			lot_tbl_sublot_no(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
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
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
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
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			loc_sppl_nm(value);
			return;
		}
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			xfr_loc_cd(value);
			return;
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			xfr_loc_nm(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			trn_typ_nm(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($act_tbl_sublot_no.equalsIgnoreCase(name)) {
			act_tbl_sublot_no(value);
			return;
		}
		if ($lot_tbl_sublot_no.equalsIgnoreCase(name)) {
			lot_tbl_sublot_no(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
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
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
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
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($loc_sppl_nm.equalsIgnoreCase(name)) {
			loc_sppl_nm(value);
			return;
		}
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($xfr_loc_cd.equalsIgnoreCase(name)) {
			xfr_loc_cd(value);
			return;
		}
		if ($xfr_loc_nm.equalsIgnoreCase(name)) {
			xfr_loc_nm(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($trn_typ_nm.equalsIgnoreCase(name)) {
			trn_typ_nm(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($insp_cnt.equalsIgnoreCase(name)) {
			insp_cnt(value);
			return;
		}
		if ($base_unit_gr_qty.equalsIgnoreCase(name)) {
			base_unit_gr_qty(value);
			return;
		}
		if ($base_unit_gi_qty.equalsIgnoreCase(name)) {
			base_unit_gi_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pack_unit_gr_qty.equalsIgnoreCase(name)) {
			pack_unit_gr_qty(value);
			return;
		}
		if ($pack_unit_gi_qty.equalsIgnoreCase(name)) {
			pack_unit_gi_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($slip_seq_no.equalsIgnoreCase(name)) {
			slip_seq_no(value);
			return;
		}
		if ($srt_no.equalsIgnoreCase(name)) {
			srt_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
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
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

