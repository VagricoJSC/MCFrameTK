package mcframe.serverMSBF.MSBFL5010;

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
 * ブロック"InspSchd_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspSchd_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Result flg. 実績ＦＬＧ.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Inspection order not available status flg. 検査指図不可状況ＦＬＧ.<p>
	 *
	 */
	public static final String $sts_schd_flg = "sts_schd_flg";
	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public static final String $src_no3 = "src_no3";
	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public static final String $src_no4 = "src_no4";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
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
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
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
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public static final String $gr_tm = "gr_tm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $to_loc_cd = "to_loc_cd";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * MRO supply item 非在庫品.<p>
	 *
	 */
	public static final String $not_stk_flg = "not_stk_flg";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Scheduled start date and time 開始予定日時.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	/**
	 * Location cd. before update 更新前場所ＣＤ.<p>
	 *
	 */
	public static final String $pre_loc_cd = "pre_loc_cd";
	/**
	 * Rack/Line cd. before update 更新前棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $pre_str_ln_cd = "pre_str_ln_cd";
	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public static final String $diff_pack_unit_qty = "diff_pack_unit_qty";
	/**
	 * With inspection order flg. 検査指図ありＦＬＧ.<p>
	 *
	 */
	public static final String $exists_insp_inst_flg = "exists_insp_inst_flg";
	/**
	 * Item inspection master exists flg. 品目品管マスタありＦＬＧ.<p>
	 *
	 */
	public static final String $exists_itm_insp_flg = "exists_itm_insp_flg";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public static final String $insp_inst_issue_typ = "insp_inst_issue_typ";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * For factory release approval flg. 工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	/**
	 * Not for factory release approval flg. 工場出荷承認対象外ＦＬＧ.<p>
	 *
	 */
	public static final String $no_plnt_aprv_flg = "no_plnt_aprv_flg";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public static final String $spl_qty = "spl_qty";
	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public static final String $pack_unit_dmn_qty = "pack_unit_dmn_qty";
	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public static final String $pack_unit_conv_qty = "pack_unit_conv_qty";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Inspection schedule addition flg. 検査予定追加ＦＬＧ.<p>
	 *
	 */
	public static final String $ins_insp_schd_flg = "ins_insp_schd_flg";
	/**
	 * Inspection schedule update flg. 検査予定更新ＦＬＧ.<p>
	 *
	 */
	public static final String $upd_insp_schd_flg = "upd_insp_schd_flg";
	/**
	 * Inspection schedule status type 検査予定状況区分.<p>
	 *
	 */
	public static final String $insp_schd_sts_typ = "insp_schd_sts_typ";
	/**
	 * Latest inspection schedule No. 最新検査予定ＮＯ.<p>
	 *
	 */
	public static final String $latest_insp_schd_no = "latest_insp_schd_no";
	/**
	 * Latest reference inspection schedule No. 最新参照検査予定ＮＯ.<p>
	 *
	 */
	public static final String $latest_own_insp_schd_no = "latest_own_insp_schd_no";
	/**
	 * Latest inspection No. 最新検査ＮＯ.<p>
	 *
	 */
	public static final String $latest_insp_no = "latest_insp_no";
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sts_schd_flg_META = createCommonMeta($sts_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no3_META = createCommonMeta($src_no3, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no4_META = createCommonMeta($src_no4, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta gr_tm_META = createCommonMeta($gr_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta to_loc_cd_META = createCommonMeta($to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta not_stk_flg_META = createCommonMeta($not_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pre_loc_cd_META = createCommonMeta($pre_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta pre_str_ln_cd_META = createCommonMeta($pre_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta diff_pack_unit_qty_META = createCommonMeta($diff_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta exists_insp_inst_flg_META = createCommonMeta($exists_insp_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exists_itm_insp_flg_META = createCommonMeta($exists_itm_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_inst_issue_typ_META = createCommonMeta($insp_inst_issue_typ, mcframe.commonMA.meta.MA_META.INSP_INST_ISSUE_TYP);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_plnt_aprv_flg_META = createCommonMeta($no_plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta spl_qty_META = createCommonMeta($spl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_dmn_qty_META = createCommonMeta($pack_unit_dmn_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_conv_qty_META = createCommonMeta($pack_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ins_insp_schd_flg_META = createCommonMeta($ins_insp_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_insp_schd_flg_META = createCommonMeta($upd_insp_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_schd_sts_typ_META = createCommonMeta($insp_schd_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta latest_insp_schd_no_META = createCommonMeta($latest_insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta latest_own_insp_schd_no_META = createCommonMeta($latest_own_insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta latest_insp_no_META = createCommonMeta($latest_insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);

	protected static final ConstMetaList<InspSchd_Upd01_CndR> constMetas = new ConstMetaList<InspSchd_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			act_flg_META,
			sts_schd_flg_META,
			src_no1_META,
			src_no2_META,
			src_no3_META,
			src_no4_META,
			insp_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			str_ln_cd_META,
			stk_arrv_bp_cd_META,
			quality_typ_META,
			stk_insp_typ_META,
			asst_typ_META,
			stk_id_typ_META,
			bp_cd_META,
			gd_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno1_mng_typ_META,
			sno2_META,
			sno2_mng_typ_META,
			sno3_META,
			sno3_mng_typ_META,
			sno4_META,
			sno4_mng_typ_META,
			sppl_cd_META,
			maker_cd_META,
			mfg_loc_cd_META,
			bp_lot_no_META,
			gr_tm_META,
			ac_dt_META,
			can_ac_dt_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			abort_flg_META,
			itm_ord_no_META,
			to_loc_cd_META,
			ver_no_META,
			insp_cnt_rmrks_META,
			not_stk_flg_META,
			dlv_cd_META,
			insp_schd_no_META,
			peg_no_META,
			to_site_cd_META,
			st_schd_tm_META,
			end_schd_tm_META,
			pre_loc_cd_META,
			pre_str_ln_cd_META,
			diff_pack_unit_qty_META,
			exists_insp_inst_flg_META,
			exists_itm_insp_flg_META,
			insp_mtd_typ_META,
			insp_inst_issue_typ_META,
			insp_ptn_cd_META,
			plnt_aprv_flg_META,
			no_plnt_aprv_flg_META,
			insp_bind_typ_META,
			spl_qty_META,
			pack_unit_dmn_qty_META,
			pack_unit_conv_qty_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			ins_insp_schd_flg_META,
			upd_insp_schd_flg_META,
			insp_schd_sts_typ_META,
			latest_insp_schd_no_META,
			latest_own_insp_schd_no_META,
			latest_insp_no_META,
			insp_lt_META,
			insp_offst_META
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
	protected InspSchd_Upd01_CndR_MC_A(ConstMetaList<? extends InspSchd_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Upd01_CndR clone() {
		return (InspSchd_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Upd01_CndR createInstance() {
		return (InspSchd_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Upd01_CndR getValues(String... names) {
		return (InspSchd_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Result flg. 実績ＦＬＧ.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 1, $act_flg);
	}

	/**
	 * Result flg. 実績ＦＬＧ.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 1, $act_flg, value);
	}


	/**
	 * Inspection order not available status flg. 検査指図不可状況ＦＬＧ.<p>
	 *
	 */
	public boolean sts_schd_flg() {
		return getConstBoolean(offset + 2, $sts_schd_flg);
	}

	/**
	 * Inspection order not available status flg. 検査指図不可状況ＦＬＧ.<p>
	 *
	 */
	public void sts_schd_flg(boolean value) {
		setConstBoolean(offset + 2, $sts_schd_flg, value);
	}


	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 3, $src_no1);
	}

	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 3, $src_no1, value);
	}


	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 4, $src_no2);
	}

	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 4, $src_no2, value);
	}


	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public String src_no3() {
		return getConstString(offset + 5, $src_no3);
	}

	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public void src_no3(String value) {
		setConstString(offset + 5, $src_no3, value);
	}


	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public String src_no4() {
		return getConstString(offset + 6, $src_no4);
	}

	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public void src_no4(String value) {
		setConstString(offset + 6, $src_no4, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 7, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 7, $insp_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 12, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 12, $loc_cd, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 13, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 13, $str_ln_cd, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 14, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 14, $stk_arrv_bp_cd, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 15, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 15, $quality_typ, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 16, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 16, $stk_insp_typ, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 17, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 17, $asst_typ, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 18, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 18, $stk_id_typ, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 19, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 19, $bp_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 20, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 20, $gd_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 21, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 21, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 22, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 22, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 23, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 23, $sno1, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 24, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 24, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 25, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 25, $sno2, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 26, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 26, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 27, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 27, $sno3, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 28, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 28, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 29, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 29, $sno4, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 30, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 30, $sno4_mng_typ, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 31, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 31, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 32, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 32, $maker_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 33, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 33, $mfg_loc_cd, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 34, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 34, $bp_lot_no, value);
	}


	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCDate gr_tm() {
		return getConstDate(offset + 35, $gr_tm);
	}

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public void gr_tm(MCDate value) {
		setConstDate(offset + 35, $gr_tm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 36, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 36, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 37, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 37, $can_ac_dt, value);
	}


	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 38, $pack_unit_qty);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 38, $pack_unit_qty, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 39, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 39, $pack_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 40, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 40, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 41, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 41, $base_unit_cd, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 42, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 42, $abort_flg, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 43, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 43, $itm_ord_no, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String to_loc_cd() {
		return getConstString(offset + 44, $to_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void to_loc_cd(String value) {
		setConstString(offset + 44, $to_loc_cd, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 45, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 45, $ver_no, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 46, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 46, $insp_cnt_rmrks, value);
	}


	/**
	 * MRO supply item 非在庫品.<p>
	 *
	 */
	public boolean not_stk_flg() {
		return getConstBoolean(offset + 47, $not_stk_flg);
	}

	/**
	 * MRO supply item 非在庫品.<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		setConstBoolean(offset + 47, $not_stk_flg, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 48, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 48, $dlv_cd, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 49, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 49, $insp_schd_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 50, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 50, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 50, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 50, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 50, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 50, $peg_no, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 51, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 51, $to_site_cd, value);
	}


	/**
	 * Scheduled start date and time 開始予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 52, $st_schd_tm);
	}

	/**
	 * Scheduled start date and time 開始予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 52, $st_schd_tm, value);
	}


	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 53, $end_schd_tm);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 53, $end_schd_tm, value);
	}


	/**
	 * Location cd. before update 更新前場所ＣＤ.<p>
	 *
	 */
	public String pre_loc_cd() {
		return getConstString(offset + 54, $pre_loc_cd);
	}

	/**
	 * Location cd. before update 更新前場所ＣＤ.<p>
	 *
	 */
	public void pre_loc_cd(String value) {
		setConstString(offset + 54, $pre_loc_cd, value);
	}


	/**
	 * Rack/Line cd. before update 更新前棚・ラインＣＤ.<p>
	 *
	 */
	public String pre_str_ln_cd() {
		return getConstString(offset + 55, $pre_str_ln_cd);
	}

	/**
	 * Rack/Line cd. before update 更新前棚・ラインＣＤ.<p>
	 *
	 */
	public void pre_str_ln_cd(String value) {
		setConstString(offset + 55, $pre_str_ln_cd, value);
	}


	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public MCNumber diff_pack_unit_qty() {
		return getConstNumber(offset + 56, $diff_pack_unit_qty);
	}

	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public void diff_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 56, $diff_pack_unit_qty, value);
	}

	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public void diff_pack_unit_qty(int value) {
		setConstNumber(offset + 56, $diff_pack_unit_qty, value);
	}

	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public void diff_pack_unit_qty(long value) {
		setConstNumber(offset + 56, $diff_pack_unit_qty, value);
	}

	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public void diff_pack_unit_qty(float value) {
		setConstNumber(offset + 56, $diff_pack_unit_qty, value);
	}

	/**
	 * Variance SKU qty. 差分荷姿単位数量.<p>
	 *
	 */
	public void diff_pack_unit_qty(double value) {
		setConstNumber(offset + 56, $diff_pack_unit_qty, value);
	}


	/**
	 * With inspection order flg. 検査指図ありＦＬＧ.<p>
	 *
	 */
	public boolean exists_insp_inst_flg() {
		return getConstBoolean(offset + 57, $exists_insp_inst_flg);
	}

	/**
	 * With inspection order flg. 検査指図ありＦＬＧ.<p>
	 *
	 */
	public void exists_insp_inst_flg(boolean value) {
		setConstBoolean(offset + 57, $exists_insp_inst_flg, value);
	}


	/**
	 * Item inspection master exists flg. 品目品管マスタありＦＬＧ.<p>
	 *
	 */
	public boolean exists_itm_insp_flg() {
		return getConstBoolean(offset + 58, $exists_itm_insp_flg);
	}

	/**
	 * Item inspection master exists flg. 品目品管マスタありＦＬＧ.<p>
	 *
	 */
	public void exists_itm_insp_flg(boolean value) {
		setConstBoolean(offset + 58, $exists_itm_insp_flg, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 59, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 59, $insp_mtd_typ, value);
	}


	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public String insp_inst_issue_typ() {
		return getConstString(offset + 60, $insp_inst_issue_typ);
	}

	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public void insp_inst_issue_typ(String value) {
		setConstString(offset + 60, $insp_inst_issue_typ, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 61, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 61, $insp_ptn_cd, value);
	}


	/**
	 * For factory release approval flg. 工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 62, $plnt_aprv_flg);
	}

	/**
	 * For factory release approval flg. 工場出荷承認対象ＦＬＧ.<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 62, $plnt_aprv_flg, value);
	}


	/**
	 * Not for factory release approval flg. 工場出荷承認対象外ＦＬＧ.<p>
	 *
	 */
	public boolean no_plnt_aprv_flg() {
		return getConstBoolean(offset + 63, $no_plnt_aprv_flg);
	}

	/**
	 * Not for factory release approval flg. 工場出荷承認対象外ＦＬＧ.<p>
	 *
	 */
	public void no_plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 63, $no_plnt_aprv_flg, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 64, $insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 64, $insp_bind_typ, value);
	}


	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public MCNumber spl_qty() {
		return getConstNumber(offset + 65, $spl_qty);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(MCNumber value) {
		setConstNumber(offset + 65, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(int value) {
		setConstNumber(offset + 65, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(long value) {
		setConstNumber(offset + 65, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(float value) {
		setConstNumber(offset + 65, $spl_qty, value);
	}

	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public void spl_qty(double value) {
		setConstNumber(offset + 65, $spl_qty, value);
	}


	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public MCNumber pack_unit_dmn_qty() {
		return getConstNumber(offset + 66, $pack_unit_dmn_qty);
	}

	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(MCNumber value) {
		setConstNumber(offset + 66, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(int value) {
		setConstNumber(offset + 66, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(long value) {
		setConstNumber(offset + 66, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(float value) {
		setConstNumber(offset + 66, $pack_unit_dmn_qty, value);
	}

	/**
	 * SKU base qty. 荷姿単位基準数量.<p>
	 *
	 */
	public void pack_unit_dmn_qty(double value) {
		setConstNumber(offset + 66, $pack_unit_dmn_qty, value);
	}


	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public MCNumber pack_unit_conv_qty() {
		return getConstNumber(offset + 67, $pack_unit_conv_qty);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 67, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(int value) {
		setConstNumber(offset + 67, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(long value) {
		setConstNumber(offset + 67, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(float value) {
		setConstNumber(offset + 67, $pack_unit_conv_qty, value);
	}

	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public void pack_unit_conv_qty(double value) {
		setConstNumber(offset + 67, $pack_unit_conv_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 68, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 68, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 68, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 68, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 68, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 68, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 69, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 69, $base_unit_rnd_typ, value);
	}


	/**
	 * Inspection schedule addition flg. 検査予定追加ＦＬＧ.<p>
	 *
	 */
	public boolean ins_insp_schd_flg() {
		return getConstBoolean(offset + 70, $ins_insp_schd_flg);
	}

	/**
	 * Inspection schedule addition flg. 検査予定追加ＦＬＧ.<p>
	 *
	 */
	public void ins_insp_schd_flg(boolean value) {
		setConstBoolean(offset + 70, $ins_insp_schd_flg, value);
	}


	/**
	 * Inspection schedule update flg. 検査予定更新ＦＬＧ.<p>
	 *
	 */
	public boolean upd_insp_schd_flg() {
		return getConstBoolean(offset + 71, $upd_insp_schd_flg);
	}

	/**
	 * Inspection schedule update flg. 検査予定更新ＦＬＧ.<p>
	 *
	 */
	public void upd_insp_schd_flg(boolean value) {
		setConstBoolean(offset + 71, $upd_insp_schd_flg, value);
	}


	/**
	 * Inspection schedule status type 検査予定状況区分.<p>
	 *
	 */
	public String insp_schd_sts_typ() {
		return getConstString(offset + 72, $insp_schd_sts_typ);
	}

	/**
	 * Inspection schedule status type 検査予定状況区分.<p>
	 *
	 */
	public void insp_schd_sts_typ(String value) {
		setConstString(offset + 72, $insp_schd_sts_typ, value);
	}


	/**
	 * Latest inspection schedule No. 最新検査予定ＮＯ.<p>
	 *
	 */
	public String latest_insp_schd_no() {
		return getConstString(offset + 73, $latest_insp_schd_no);
	}

	/**
	 * Latest inspection schedule No. 最新検査予定ＮＯ.<p>
	 *
	 */
	public void latest_insp_schd_no(String value) {
		setConstString(offset + 73, $latest_insp_schd_no, value);
	}


	/**
	 * Latest reference inspection schedule No. 最新参照検査予定ＮＯ.<p>
	 *
	 */
	public String latest_own_insp_schd_no() {
		return getConstString(offset + 74, $latest_own_insp_schd_no);
	}

	/**
	 * Latest reference inspection schedule No. 最新参照検査予定ＮＯ.<p>
	 *
	 */
	public void latest_own_insp_schd_no(String value) {
		setConstString(offset + 74, $latest_own_insp_schd_no, value);
	}


	/**
	 * Latest inspection No. 最新検査ＮＯ.<p>
	 *
	 */
	public String latest_insp_no() {
		return getConstString(offset + 75, $latest_insp_no);
	}

	/**
	 * Latest inspection No. 最新検査ＮＯ.<p>
	 *
	 */
	public void latest_insp_no(String value) {
		setConstString(offset + 75, $latest_insp_no, value);
	}


	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 76, $insp_lt);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 76, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 76, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 76, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 76, $insp_lt, value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 76, $insp_lt, value);
	}


	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 77, $insp_offst);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 77, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 77, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 77, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 77, $insp_offst, value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 77, $insp_offst, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			return to_loc_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($pre_loc_cd.equalsIgnoreCase(name)) {
			return pre_loc_cd();
		}
		if ($pre_str_ln_cd.equalsIgnoreCase(name)) {
			return pre_str_ln_cd();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($insp_schd_sts_typ.equalsIgnoreCase(name)) {
			return insp_schd_sts_typ();
		}
		if ($latest_insp_schd_no.equalsIgnoreCase(name)) {
			return latest_insp_schd_no();
		}
		if ($latest_own_insp_schd_no.equalsIgnoreCase(name)) {
			return latest_own_insp_schd_no();
		}
		if ($latest_insp_no.equalsIgnoreCase(name)) {
			return latest_insp_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			return diff_pack_unit_qty();
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			return spl_qty();
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_unit_dmn_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($gr_tm.equalsIgnoreCase(name)) {
			return gr_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($sts_schd_flg.equalsIgnoreCase(name)) {
			return sts_schd_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($exists_insp_inst_flg.equalsIgnoreCase(name)) {
			return exists_insp_inst_flg();
		}
		if ($exists_itm_insp_flg.equalsIgnoreCase(name)) {
			return exists_itm_insp_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return no_plnt_aprv_flg();
		}
		if ($ins_insp_schd_flg.equalsIgnoreCase(name)) {
			return ins_insp_schd_flg();
		}
		if ($upd_insp_schd_flg.equalsIgnoreCase(name)) {
			return upd_insp_schd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			return to_loc_cd();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($pre_loc_cd.equalsIgnoreCase(name)) {
			return pre_loc_cd();
		}
		if ($pre_str_ln_cd.equalsIgnoreCase(name)) {
			return pre_str_ln_cd();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			return insp_inst_issue_typ();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($insp_schd_sts_typ.equalsIgnoreCase(name)) {
			return insp_schd_sts_typ();
		}
		if ($latest_insp_schd_no.equalsIgnoreCase(name)) {
			return latest_insp_schd_no();
		}
		if ($latest_own_insp_schd_no.equalsIgnoreCase(name)) {
			return latest_own_insp_schd_no();
		}
		if ($latest_insp_no.equalsIgnoreCase(name)) {
			return latest_insp_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			return diff_pack_unit_qty();
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			return spl_qty();
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			return pack_unit_dmn_qty();
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			return pack_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($gr_tm.equalsIgnoreCase(name)) {
			return gr_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		if ($sts_schd_flg.equalsIgnoreCase(name)) {
			return sts_schd_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		if ($exists_insp_inst_flg.equalsIgnoreCase(name)) {
			return exists_insp_inst_flg();
		}
		if ($exists_itm_insp_flg.equalsIgnoreCase(name)) {
			return exists_itm_insp_flg();
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			return no_plnt_aprv_flg();
		}
		if ($ins_insp_schd_flg.equalsIgnoreCase(name)) {
			return ins_insp_schd_flg();
		}
		if ($upd_insp_schd_flg.equalsIgnoreCase(name)) {
			return upd_insp_schd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			to_loc_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($pre_loc_cd.equalsIgnoreCase(name)) {
			pre_loc_cd(value);
			return;
		}
		if ($pre_str_ln_cd.equalsIgnoreCase(name)) {
			pre_str_ln_cd(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($insp_schd_sts_typ.equalsIgnoreCase(name)) {
			insp_schd_sts_typ(value);
			return;
		}
		if ($latest_insp_schd_no.equalsIgnoreCase(name)) {
			latest_insp_schd_no(value);
			return;
		}
		if ($latest_own_insp_schd_no.equalsIgnoreCase(name)) {
			latest_own_insp_schd_no(value);
			return;
		}
		if ($latest_insp_no.equalsIgnoreCase(name)) {
			latest_insp_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($gr_tm.equalsIgnoreCase(name)) {
			gr_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($sts_schd_flg.equalsIgnoreCase(name)) {
			sts_schd_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($exists_insp_inst_flg.equalsIgnoreCase(name)) {
			exists_insp_inst_flg(value);
			return;
		}
		if ($exists_itm_insp_flg.equalsIgnoreCase(name)) {
			exists_itm_insp_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			no_plnt_aprv_flg(value);
			return;
		}
		if ($ins_insp_schd_flg.equalsIgnoreCase(name)) {
			ins_insp_schd_flg(value);
			return;
		}
		if ($upd_insp_schd_flg.equalsIgnoreCase(name)) {
			upd_insp_schd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
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
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			to_loc_cd(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($pre_loc_cd.equalsIgnoreCase(name)) {
			pre_loc_cd(value);
			return;
		}
		if ($pre_str_ln_cd.equalsIgnoreCase(name)) {
			pre_str_ln_cd(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_inst_issue_typ.equalsIgnoreCase(name)) {
			insp_inst_issue_typ(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($insp_schd_sts_typ.equalsIgnoreCase(name)) {
			insp_schd_sts_typ(value);
			return;
		}
		if ($latest_insp_schd_no.equalsIgnoreCase(name)) {
			latest_insp_schd_no(value);
			return;
		}
		if ($latest_own_insp_schd_no.equalsIgnoreCase(name)) {
			latest_own_insp_schd_no(value);
			return;
		}
		if ($latest_insp_no.equalsIgnoreCase(name)) {
			latest_insp_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($diff_pack_unit_qty.equalsIgnoreCase(name)) {
			diff_pack_unit_qty(value);
			return;
		}
		if ($spl_qty.equalsIgnoreCase(name)) {
			spl_qty(value);
			return;
		}
		if ($pack_unit_dmn_qty.equalsIgnoreCase(name)) {
			pack_unit_dmn_qty(value);
			return;
		}
		if ($pack_unit_conv_qty.equalsIgnoreCase(name)) {
			pack_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
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
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($gr_tm.equalsIgnoreCase(name)) {
			gr_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($sts_schd_flg.equalsIgnoreCase(name)) {
			sts_schd_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		if ($exists_insp_inst_flg.equalsIgnoreCase(name)) {
			exists_insp_inst_flg(value);
			return;
		}
		if ($exists_itm_insp_flg.equalsIgnoreCase(name)) {
			exists_itm_insp_flg(value);
			return;
		}
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($no_plnt_aprv_flg.equalsIgnoreCase(name)) {
			no_plnt_aprv_flg(value);
			return;
		}
		if ($ins_insp_schd_flg.equalsIgnoreCase(name)) {
			ins_insp_schd_flg(value);
			return;
		}
		if ($upd_insp_schd_flg.equalsIgnoreCase(name)) {
			upd_insp_schd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

