package mcframe.serverMSBC.MSBCL1130;

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
 * ブロック"Chk01_DtlYieldByProd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_DtlYieldByProdR_MC_A extends MCConstRow {

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $unschd_yield_typ = "unschd_yield_typ";
	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public static final String $unschd_yield_typ_nm = "unschd_yield_typ_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $unschd_itm_cd = "unschd_itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $unschd_itm_sub1 = "unschd_itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $unschd_itm_sub2 = "unschd_itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $unschd_itm_sub3 = "unschd_itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $unschd_itm_nm = "unschd_itm_nm";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $unschd_lot_no = "unschd_lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $unschd_sublot_no = "unschd_sublot_no";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $unschd_same_lot_flg = "unschd_same_lot_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $unschd_lot_mng_typ = "unschd_lot_mng_typ";
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_lot_no_typ = "unschd_lot_no_typ";
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_lot_no_ptn_cd = "unschd_lot_no_ptn_cd";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $unschd_sublot_mng_typ = "unschd_sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $unschd_sublot_no_typ = "unschd_sublot_no_typ";
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public static final String $unschd_sublot_no_ptn_cd = "unschd_sublot_no_ptn_cd";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_trd_unit_cd = "unschd_trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unschd_trd_unit_nm = "unschd_trd_unit_nm";
	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public static final String $unschd_trd_unit_yield_act_qty = "unschd_trd_unit_yield_act_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_trd_unit_dec_place = "unschd_trd_unit_dec_place";
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public static final String $unschd_trd_unit_conv_rnd_typ = "unschd_trd_unit_conv_rnd_typ";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unschd_base_unit_cd = "unschd_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unschd_base_unit_nm = "unschd_base_unit_nm";
	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public static final String $unschd_base_unit_yield_act_qty = "unschd_base_unit_yield_act_qty";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $unschd_base_unit_dec_place = "unschd_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $unschd_base_unit_conv_rnd_typ = "unschd_base_unit_conv_rnd_typ";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $unschd_conv_base_qty = "unschd_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public static final String $unschd_conv_qty = "unschd_conv_qty";
	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public static final String $unschd_act_tm = "unschd_act_tm";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $unschd_ac_dt = "unschd_ac_dt";
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public static final String $unschd_yield_rsn_cd = "unschd_yield_rsn_cd";
	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public static final String $unschd_yield_rsn_nm = "unschd_yield_rsn_nm";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $unschd_gd_cd = "unschd_gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $unschd_gd_nm = "unschd_gd_nm";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $unschd_strg_loc_cd = "unschd_strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $unschd_strg_loc_nm = "unschd_strg_loc_nm";
	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_tgt_flg = "unschd_strg_str_ln_tgt_flg";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_cd = "unschd_strg_str_ln_cd";
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_nm = "unschd_strg_str_ln_nm";
	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public static final String $unschd_strg_str_ln_cd_none_flg = "unschd_strg_str_ln_cd_none_flg";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public static final String $yield_rate = "yield_rate";
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks = "insp_cnt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $yield_act_intr_rmrks = "yield_act_intr_rmrks";
	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public static final String $yield_act_rpt_rmrks = "yield_act_rpt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char1 = "yield_act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char2 = "yield_act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $yield_act_sub_char3 = "yield_act_sub_char3";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public static final String $not_stk_flg = "not_stk_flg";
	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public static final String $st_ac_dt = "st_ac_dt";


	public static final MCMeta unschd_yield_typ_META = createCommonMeta($unschd_yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta unschd_yield_typ_nm_META = createCommonMeta($unschd_yield_typ_nm, mcframe.commonMA.meta.MA_META.YIELD_TYP_NM);
	public static final MCMeta unschd_itm_cd_META = createCommonMeta($unschd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta unschd_itm_sub1_META = createCommonMeta($unschd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta unschd_itm_sub2_META = createCommonMeta($unschd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta unschd_itm_sub3_META = createCommonMeta($unschd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta unschd_itm_nm_META = createCommonMeta($unschd_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unschd_lot_no_META = createCommonMeta($unschd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta unschd_sublot_no_META = createCommonMeta($unschd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta unschd_same_lot_flg_META = createCommonMeta($unschd_same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_lot_mng_typ_META = createCommonMeta($unschd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta unschd_lot_no_typ_META = createCommonMeta($unschd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_lot_no_ptn_cd_META = createCommonMeta($unschd_lot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_sublot_mng_typ_META = createCommonMeta($unschd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta unschd_sublot_no_typ_META = createCommonMeta($unschd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta unschd_sublot_no_ptn_cd_META = createCommonMeta($unschd_sublot_no_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta unschd_trd_unit_cd_META = createCommonMeta($unschd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_trd_unit_nm_META = createCommonMeta($unschd_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_trd_unit_yield_act_qty_META = createCommonMeta($unschd_trd_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_trd_unit_dec_place_META = createCommonMeta($unschd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_trd_unit_conv_rnd_typ_META = createCommonMeta($unschd_trd_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_base_unit_cd_META = createCommonMeta($unschd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unschd_base_unit_nm_META = createCommonMeta($unschd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unschd_base_unit_yield_act_qty_META = createCommonMeta($unschd_base_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_base_unit_dec_place_META = createCommonMeta($unschd_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta unschd_base_unit_conv_rnd_typ_META = createCommonMeta($unschd_base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta unschd_conv_base_qty_META = createCommonMeta($unschd_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_conv_qty_META = createCommonMeta($unschd_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unschd_act_tm_META = createCommonMeta($unschd_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta unschd_ac_dt_META = createCommonMeta($unschd_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta unschd_yield_rsn_cd_META = createCommonMeta($unschd_yield_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta unschd_yield_rsn_nm_META = createCommonMeta($unschd_yield_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta unschd_gd_cd_META = createCommonMeta($unschd_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta unschd_gd_nm_META = createCommonMeta($unschd_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta unschd_strg_loc_cd_META = createCommonMeta($unschd_strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta unschd_strg_loc_nm_META = createCommonMeta($unschd_strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta unschd_strg_str_ln_tgt_flg_META = createCommonMeta($unschd_strg_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unschd_strg_str_ln_cd_META = createCommonMeta($unschd_strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta unschd_strg_str_ln_nm_META = createCommonMeta($unschd_strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta unschd_strg_str_ln_cd_none_flg_META = createCommonMeta($unschd_strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta yield_rate_META = createCommonMeta($yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta insp_cnt_rmrks_META = createCommonMeta($insp_cnt_rmrks, mcframe.commonMS.meta.MS_META.INSP_CNT_RMRKS);
	public static final MCMeta yield_act_intr_rmrks_META = createCommonMeta($yield_act_intr_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_INTR_RMRKS);
	public static final MCMeta yield_act_rpt_rmrks_META = createCommonMeta($yield_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_RPT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta yield_act_sub_char1_META = createCommonMeta($yield_act_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR1);
	public static final MCMeta yield_act_sub_char2_META = createCommonMeta($yield_act_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR2);
	public static final MCMeta yield_act_sub_char3_META = createCommonMeta($yield_act_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR3);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_stk_flg_META = createCommonMeta($not_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_ac_dt_META = createCommonMeta($st_ac_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Chk01_DtlYieldByProdR> constMetas = new ConstMetaList<Chk01_DtlYieldByProdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			unschd_yield_typ_META,
			unschd_yield_typ_nm_META,
			unschd_itm_cd_META,
			unschd_itm_sub1_META,
			unschd_itm_sub2_META,
			unschd_itm_sub3_META,
			unschd_itm_nm_META,
			unschd_lot_no_META,
			unschd_sublot_no_META,
			unschd_same_lot_flg_META,
			unschd_lot_mng_typ_META,
			unschd_lot_no_typ_META,
			unschd_lot_no_ptn_cd_META,
			unschd_sublot_mng_typ_META,
			unschd_sublot_no_typ_META,
			unschd_sublot_no_ptn_cd_META,
			unschd_trd_unit_cd_META,
			unschd_trd_unit_nm_META,
			unschd_trd_unit_yield_act_qty_META,
			unschd_trd_unit_dec_place_META,
			unschd_trd_unit_conv_rnd_typ_META,
			unschd_base_unit_cd_META,
			unschd_base_unit_nm_META,
			unschd_base_unit_yield_act_qty_META,
			unschd_base_unit_dec_place_META,
			unschd_base_unit_conv_rnd_typ_META,
			unschd_conv_base_qty_META,
			unschd_conv_qty_META,
			unschd_act_tm_META,
			unschd_ac_dt_META,
			unschd_yield_rsn_cd_META,
			unschd_yield_rsn_nm_META,
			unschd_gd_cd_META,
			unschd_gd_nm_META,
			unschd_strg_loc_cd_META,
			unschd_strg_loc_nm_META,
			unschd_strg_str_ln_tgt_flg_META,
			unschd_strg_str_ln_cd_META,
			unschd_strg_str_ln_nm_META,
			unschd_strg_str_ln_cd_none_flg_META,
			disp_seq_META,
			hdr_peg_no_META,
			peg_no_META,
			yield_rate_META,
			insp_cnt_rmrks_META,
			yield_act_intr_rmrks_META,
			yield_act_rpt_rmrks_META,
			trd_rmrks_META,
			yield_act_sub_char1_META,
			yield_act_sub_char2_META,
			yield_act_sub_char3_META,
			yield_act_no_META,
			rtn_sts_typ_META,
			err_flg_META,
			pack_flg_META,
			not_stk_flg_META,
			st_ac_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[UPD_CNT_CHK]のキー定数 */
	public static final String $$UPD_CNT_CHK = "UPD_CNT_CHK";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$unschd_yield_typ, "E"},	// unschd_yield_typ
				{$unschd_trd_unit_cd, "E"},	// unschd_trd_unit_cd
				{$unschd_trd_unit_yield_act_qty, "E"},	// unschd_trd_unit_yield_act_qty
				{$unschd_act_tm, "E"},	// unschd_act_tm
				{$unschd_ac_dt, "E"},	// unschd_ac_dt
				{$unschd_gd_cd, "E"},	// unschd_gd_cd
				{$unschd_strg_loc_cd, "E"}	// unschd_strg_loc_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_yield_act_qty, "0:"}	// unschd_trd_unit_yield_act_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$unschd_act_tm, "tmBfToday"},	// unschd_act_tm
				{$unschd_ac_dt, "bfToday"}	// unschd_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$unschd_act_tm, "yield_st_group:BF"},	// unschd_act_tm
				{$unschd_ac_dt, "yield_st_group:AF"}	// unschd_ac_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "MA.MAUAL0010.YieldBizRsn"}	// unschd_yield_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_cd, "unschd_trd_unit_nm;unschd_trd_unit_dec_place;unschd_trd_unit_rnd_typ;unschd_conv_base_qty;unschd_conv_qty;pack_flg"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "not_stk_flg"}	// unschd_yield_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty;pack_flg"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "not_stk_flg"}	// unschd_yield_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_cd, "unschd_itm_cd;unschd_itm_sub1;unschd_itm_sub2;unschd_itm_sub3"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "unschd_yield_typ"}	// unschd_yield_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$unschd_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// unschd_trd_unit_cd
				{$unschd_yield_rsn_cd, "yield_typ"}	// unschd_yield_rsn_cd
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
	protected Chk01_DtlYieldByProdR_MC_A(ConstMetaList<? extends Chk01_DtlYieldByProdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlYieldByProdR clone() {
		return (Chk01_DtlYieldByProdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlYieldByProdR createInstance() {
		return (Chk01_DtlYieldByProdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_DtlYieldByProdR getValues(String... names) {
		return (Chk01_DtlYieldByProdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String unschd_yield_typ() {
		return getConstString(offset + 0, $unschd_yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void unschd_yield_typ(String value) {
		setConstString(offset + 0, $unschd_yield_typ, value);
	}


	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public String unschd_yield_typ_nm() {
		return getConstString(offset + 1, $unschd_yield_typ_nm);
	}

	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public void unschd_yield_typ_nm(String value) {
		setConstString(offset + 1, $unschd_yield_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String unschd_itm_cd() {
		return getConstString(offset + 2, $unschd_itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void unschd_itm_cd(String value) {
		setConstString(offset + 2, $unschd_itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String unschd_itm_sub1() {
		return getConstString(offset + 3, $unschd_itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void unschd_itm_sub1(String value) {
		setConstString(offset + 3, $unschd_itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String unschd_itm_sub2() {
		return getConstString(offset + 4, $unschd_itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void unschd_itm_sub2(String value) {
		setConstString(offset + 4, $unschd_itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String unschd_itm_sub3() {
		return getConstString(offset + 5, $unschd_itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void unschd_itm_sub3(String value) {
		setConstString(offset + 5, $unschd_itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String unschd_itm_nm() {
		return getConstString(offset + 6, $unschd_itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void unschd_itm_nm(String value) {
		setConstString(offset + 6, $unschd_itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String unschd_lot_no() {
		return getConstString(offset + 7, $unschd_lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void unschd_lot_no(String value) {
		setConstString(offset + 7, $unschd_lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String unschd_sublot_no() {
		return getConstString(offset + 8, $unschd_sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void unschd_sublot_no(String value) {
		setConstString(offset + 8, $unschd_sublot_no, value);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean unschd_same_lot_flg() {
		return getConstBoolean(offset + 9, $unschd_same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void unschd_same_lot_flg(boolean value) {
		setConstBoolean(offset + 9, $unschd_same_lot_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String unschd_lot_mng_typ() {
		return getConstString(offset + 10, $unschd_lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void unschd_lot_mng_typ(String value) {
		setConstString(offset + 10, $unschd_lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_lot_no_typ() {
		return getConstString(offset + 11, $unschd_lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_lot_no_typ(String value) {
		setConstString(offset + 11, $unschd_lot_no_typ, value);
	}


	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_lot_no_ptn_cd() {
		return getConstString(offset + 12, $unschd_lot_no_ptn_cd);
	}

	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_lot_no_ptn_cd(String value) {
		setConstString(offset + 12, $unschd_lot_no_ptn_cd, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String unschd_sublot_mng_typ() {
		return getConstString(offset + 13, $unschd_sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void unschd_sublot_mng_typ(String value) {
		setConstString(offset + 13, $unschd_sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String unschd_sublot_no_typ() {
		return getConstString(offset + 14, $unschd_sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void unschd_sublot_no_typ(String value) {
		setConstString(offset + 14, $unschd_sublot_no_typ, value);
	}


	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public String unschd_sublot_no_ptn_cd() {
		return getConstString(offset + 15, $unschd_sublot_no_ptn_cd);
	}

	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public void unschd_sublot_no_ptn_cd(String value) {
		setConstString(offset + 15, $unschd_sublot_no_ptn_cd, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unschd_trd_unit_cd() {
		return getConstString(offset + 16, $unschd_trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unschd_trd_unit_cd(String value) {
		setConstString(offset + 16, $unschd_trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unschd_trd_unit_nm() {
		return getConstString(offset + 17, $unschd_trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unschd_trd_unit_nm(String value) {
		setConstString(offset + 17, $unschd_trd_unit_nm, value);
	}


	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_yield_act_qty() {
		return getConstNumber(offset + 18, $unschd_trd_unit_yield_act_qty);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 18, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(int value) {
		setConstNumber(offset + 18, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(long value) {
		setConstNumber(offset + 18, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(float value) {
		setConstNumber(offset + 18, $unschd_trd_unit_yield_act_qty, value);
	}

	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public void unschd_trd_unit_yield_act_qty(double value) {
		setConstNumber(offset + 18, $unschd_trd_unit_yield_act_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_trd_unit_dec_place() {
		return getConstNumber(offset + 19, $unschd_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 19, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 19, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 19, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 19, $unschd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 19, $unschd_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public String unschd_trd_unit_conv_rnd_typ() {
		return getConstString(offset + 20, $unschd_trd_unit_conv_rnd_typ);
	}

	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public void unschd_trd_unit_conv_rnd_typ(String value) {
		setConstString(offset + 20, $unschd_trd_unit_conv_rnd_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unschd_base_unit_cd() {
		return getConstString(offset + 21, $unschd_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unschd_base_unit_cd(String value) {
		setConstString(offset + 21, $unschd_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unschd_base_unit_nm() {
		return getConstString(offset + 22, $unschd_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unschd_base_unit_nm(String value) {
		setConstString(offset + 22, $unschd_base_unit_nm, value);
	}


	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public MCNumber unschd_base_unit_yield_act_qty() {
		return getConstNumber(offset + 23, $unschd_base_unit_yield_act_qty);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 23, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(int value) {
		setConstNumber(offset + 23, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(long value) {
		setConstNumber(offset + 23, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(float value) {
		setConstNumber(offset + 23, $unschd_base_unit_yield_act_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void unschd_base_unit_yield_act_qty(double value) {
		setConstNumber(offset + 23, $unschd_base_unit_yield_act_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber unschd_base_unit_dec_place() {
		return getConstNumber(offset + 24, $unschd_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(int value) {
		setConstNumber(offset + 24, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(long value) {
		setConstNumber(offset + 24, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(float value) {
		setConstNumber(offset + 24, $unschd_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void unschd_base_unit_dec_place(double value) {
		setConstNumber(offset + 24, $unschd_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String unschd_base_unit_conv_rnd_typ() {
		return getConstString(offset + 25, $unschd_base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void unschd_base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 25, $unschd_base_unit_conv_rnd_typ, value);
	}


	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber unschd_conv_base_qty() {
		return getConstNumber(offset + 26, $unschd_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 26, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(int value) {
		setConstNumber(offset + 26, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(long value) {
		setConstNumber(offset + 26, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(float value) {
		setConstNumber(offset + 26, $unschd_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void unschd_conv_base_qty(double value) {
		setConstNumber(offset + 26, $unschd_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber unschd_conv_qty() {
		return getConstNumber(offset + 27, $unschd_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(MCNumber value) {
		setConstNumber(offset + 27, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(int value) {
		setConstNumber(offset + 27, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(long value) {
		setConstNumber(offset + 27, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(float value) {
		setConstNumber(offset + 27, $unschd_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void unschd_conv_qty(double value) {
		setConstNumber(offset + 27, $unschd_conv_qty, value);
	}


	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public MCDate unschd_act_tm() {
		return getConstDate(offset + 28, $unschd_act_tm);
	}

	/**
	 * Actual date and time 実績日時.<p>
	 *
	 */
	public void unschd_act_tm(MCDate value) {
		setConstDate(offset + 28, $unschd_act_tm, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate unschd_ac_dt() {
		return getConstDate(offset + 29, $unschd_ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void unschd_ac_dt(MCDate value) {
		setConstDate(offset + 29, $unschd_ac_dt, value);
	}


	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public String unschd_yield_rsn_cd() {
		return getConstString(offset + 30, $unschd_yield_rsn_cd);
	}

	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public void unschd_yield_rsn_cd(String value) {
		setConstString(offset + 30, $unschd_yield_rsn_cd, value);
	}


	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public String unschd_yield_rsn_nm() {
		return getConstString(offset + 31, $unschd_yield_rsn_nm);
	}

	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public void unschd_yield_rsn_nm(String value) {
		setConstString(offset + 31, $unschd_yield_rsn_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String unschd_gd_cd() {
		return getConstString(offset + 32, $unschd_gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void unschd_gd_cd(String value) {
		setConstString(offset + 32, $unschd_gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String unschd_gd_nm() {
		return getConstString(offset + 33, $unschd_gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void unschd_gd_nm(String value) {
		setConstString(offset + 33, $unschd_gd_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String unschd_strg_loc_cd() {
		return getConstString(offset + 34, $unschd_strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void unschd_strg_loc_cd(String value) {
		setConstString(offset + 34, $unschd_strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String unschd_strg_loc_nm() {
		return getConstString(offset + 35, $unschd_strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void unschd_strg_loc_nm(String value) {
		setConstString(offset + 35, $unschd_strg_loc_nm, value);
	}


	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_tgt_flg() {
		return getConstBoolean(offset + 36, $unschd_strg_str_ln_tgt_flg);
	}

	/**
	 * For storage location rack/line 格納場所棚・ライン対象.<p>
	 *
	 */
	public void unschd_strg_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 36, $unschd_strg_str_ln_tgt_flg, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String unschd_strg_str_ln_cd() {
		return getConstString(offset + 37, $unschd_strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd(String value) {
		setConstString(offset + 37, $unschd_strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String unschd_strg_str_ln_nm() {
		return getConstString(offset + 38, $unschd_strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void unschd_strg_str_ln_nm(String value) {
		setConstString(offset + 38, $unschd_strg_str_ln_nm, value);
	}


	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public boolean unschd_strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 39, $unschd_strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public void unschd_strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 39, $unschd_strg_str_ln_cd_none_flg, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 40, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 40, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 40, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 40, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 40, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 40, $disp_seq, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 41, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 41, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 41, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 41, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 41, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 41, $hdr_peg_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 42, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 42, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 42, $peg_no, value);
	}


	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCNumber yield_rate() {
		return getConstNumber(offset + 43, $yield_rate);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(MCNumber value) {
		setConstNumber(offset + 43, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(int value) {
		setConstNumber(offset + 43, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(long value) {
		setConstNumber(offset + 43, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(float value) {
		setConstNumber(offset + 43, $yield_rate, value);
	}

	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public void yield_rate(double value) {
		setConstNumber(offset + 43, $yield_rate, value);
	}


	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return getConstString(offset + 44, $insp_cnt_rmrks);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		setConstString(offset + 44, $insp_cnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String yield_act_intr_rmrks() {
		return getConstString(offset + 45, $yield_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void yield_act_intr_rmrks(String value) {
		setConstString(offset + 45, $yield_act_intr_rmrks, value);
	}


	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String yield_act_rpt_rmrks() {
		return getConstString(offset + 46, $yield_act_rpt_rmrks);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void yield_act_rpt_rmrks(String value) {
		setConstString(offset + 46, $yield_act_rpt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 47, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 47, $trd_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return getConstString(offset + 48, $yield_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		setConstString(offset + 48, $yield_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return getConstString(offset + 49, $yield_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		setConstString(offset + 49, $yield_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return getConstString(offset + 50, $yield_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		setConstString(offset + 50, $yield_act_sub_char3, value);
	}


	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 51, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 51, $yield_act_no, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 52, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 52, $rtn_sts_typ, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 53, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 53, $err_flg, value);
	}


	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 54, $pack_flg);
	}

	/**
	 * SKU 荷姿.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 54, $pack_flg, value);
	}


	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public boolean not_stk_flg() {
		return getConstBoolean(offset + 55, $not_stk_flg);
	}

	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public void not_stk_flg(boolean value) {
		setConstBoolean(offset + 55, $not_stk_flg, value);
	}


	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return getConstDate(offset + 56, $st_ac_dt);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		setConstDate(offset + 56, $st_ac_dt, value);
	}


	public String getString(String name) {
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			return unschd_yield_typ();
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			return unschd_yield_typ_nm();
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			return unschd_itm_cd();
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			return unschd_itm_sub1();
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			return unschd_itm_sub2();
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			return unschd_itm_sub3();
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			return unschd_itm_nm();
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			return unschd_lot_no();
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			return unschd_sublot_no();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_conv_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_cd();
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_nm();
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			return unschd_gd_cd();
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			return unschd_gd_nm();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd();
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_trd_unit_yield_act_qty();
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_base_unit_yield_act_qty();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($unschd_act_tm.equalsIgnoreCase(name)) {
			return unschd_act_tm();
		}
		if ($unschd_ac_dt.equalsIgnoreCase(name)) {
			return unschd_ac_dt();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			return unschd_same_lot_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd_none_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			return unschd_yield_typ();
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			return unschd_yield_typ_nm();
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			return unschd_itm_cd();
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			return unschd_itm_sub1();
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			return unschd_itm_sub2();
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			return unschd_itm_sub3();
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			return unschd_itm_nm();
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			return unschd_lot_no();
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			return unschd_sublot_no();
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_lot_mng_typ();
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			return unschd_lot_no_typ();
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_lot_no_ptn_cd();
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_mng_typ();
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			return unschd_sublot_no_typ();
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			return unschd_sublot_no_ptn_cd();
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			return unschd_trd_unit_cd();
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			return unschd_trd_unit_nm();
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_trd_unit_conv_rnd_typ();
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			return unschd_base_unit_cd();
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			return unschd_base_unit_nm();
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return unschd_base_unit_conv_rnd_typ();
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_cd();
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			return unschd_yield_rsn_nm();
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			return unschd_gd_cd();
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			return unschd_gd_nm();
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			return unschd_strg_loc_cd();
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			return unschd_strg_loc_nm();
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd();
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_nm();
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks();
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			return yield_act_intr_rmrks();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_trd_unit_yield_act_qty();
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_trd_unit_dec_place();
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return unschd_base_unit_yield_act_qty();
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			return unschd_base_unit_dec_place();
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			return unschd_conv_base_qty();
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			return unschd_conv_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			return yield_rate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($unschd_act_tm.equalsIgnoreCase(name)) {
			return unschd_act_tm();
		}
		if ($unschd_ac_dt.equalsIgnoreCase(name)) {
			return unschd_ac_dt();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			return unschd_same_lot_flg();
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_tgt_flg();
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return unschd_strg_str_ln_cd_none_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			return not_stk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			unschd_yield_typ(value);
			return;
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			unschd_yield_typ_nm(value);
			return;
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			unschd_itm_cd(value);
			return;
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			unschd_itm_sub1(value);
			return;
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			unschd_itm_sub2(value);
			return;
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			unschd_itm_sub3(value);
			return;
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			unschd_itm_nm(value);
			return;
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			unschd_lot_no(value);
			return;
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			unschd_sublot_no(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			unschd_yield_rsn_cd(value);
			return;
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			unschd_yield_rsn_nm(value);
			return;
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			unschd_gd_cd(value);
			return;
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			unschd_gd_nm(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd(value);
			return;
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($unschd_act_tm.equalsIgnoreCase(name)) {
			unschd_act_tm(value);
			return;
		}
		if ($unschd_ac_dt.equalsIgnoreCase(name)) {
			unschd_ac_dt(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			unschd_same_lot_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($unschd_yield_typ.equalsIgnoreCase(name)) {
			unschd_yield_typ(value);
			return;
		}
		if ($unschd_yield_typ_nm.equalsIgnoreCase(name)) {
			unschd_yield_typ_nm(value);
			return;
		}
		if ($unschd_itm_cd.equalsIgnoreCase(name)) {
			unschd_itm_cd(value);
			return;
		}
		if ($unschd_itm_sub1.equalsIgnoreCase(name)) {
			unschd_itm_sub1(value);
			return;
		}
		if ($unschd_itm_sub2.equalsIgnoreCase(name)) {
			unschd_itm_sub2(value);
			return;
		}
		if ($unschd_itm_sub3.equalsIgnoreCase(name)) {
			unschd_itm_sub3(value);
			return;
		}
		if ($unschd_itm_nm.equalsIgnoreCase(name)) {
			unschd_itm_nm(value);
			return;
		}
		if ($unschd_lot_no.equalsIgnoreCase(name)) {
			unschd_lot_no(value);
			return;
		}
		if ($unschd_sublot_no.equalsIgnoreCase(name)) {
			unschd_sublot_no(value);
			return;
		}
		if ($unschd_lot_mng_typ.equalsIgnoreCase(name)) {
			unschd_lot_mng_typ(value);
			return;
		}
		if ($unschd_lot_no_typ.equalsIgnoreCase(name)) {
			unschd_lot_no_typ(value);
			return;
		}
		if ($unschd_lot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_lot_no_ptn_cd(value);
			return;
		}
		if ($unschd_sublot_mng_typ.equalsIgnoreCase(name)) {
			unschd_sublot_mng_typ(value);
			return;
		}
		if ($unschd_sublot_no_typ.equalsIgnoreCase(name)) {
			unschd_sublot_no_typ(value);
			return;
		}
		if ($unschd_sublot_no_ptn_cd.equalsIgnoreCase(name)) {
			unschd_sublot_no_ptn_cd(value);
			return;
		}
		if ($unschd_trd_unit_cd.equalsIgnoreCase(name)) {
			unschd_trd_unit_cd(value);
			return;
		}
		if ($unschd_trd_unit_nm.equalsIgnoreCase(name)) {
			unschd_trd_unit_nm(value);
			return;
		}
		if ($unschd_trd_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_trd_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_base_unit_cd.equalsIgnoreCase(name)) {
			unschd_base_unit_cd(value);
			return;
		}
		if ($unschd_base_unit_nm.equalsIgnoreCase(name)) {
			unschd_base_unit_nm(value);
			return;
		}
		if ($unschd_base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			unschd_base_unit_conv_rnd_typ(value);
			return;
		}
		if ($unschd_yield_rsn_cd.equalsIgnoreCase(name)) {
			unschd_yield_rsn_cd(value);
			return;
		}
		if ($unschd_yield_rsn_nm.equalsIgnoreCase(name)) {
			unschd_yield_rsn_nm(value);
			return;
		}
		if ($unschd_gd_cd.equalsIgnoreCase(name)) {
			unschd_gd_cd(value);
			return;
		}
		if ($unschd_gd_nm.equalsIgnoreCase(name)) {
			unschd_gd_nm(value);
			return;
		}
		if ($unschd_strg_loc_cd.equalsIgnoreCase(name)) {
			unschd_strg_loc_cd(value);
			return;
		}
		if ($unschd_strg_loc_nm.equalsIgnoreCase(name)) {
			unschd_strg_loc_nm(value);
			return;
		}
		if ($unschd_strg_str_ln_cd.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd(value);
			return;
		}
		if ($unschd_strg_str_ln_nm.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_nm(value);
			return;
		}
		if ($insp_cnt_rmrks.equalsIgnoreCase(name)) {
			insp_cnt_rmrks(value);
			return;
		}
		if ($yield_act_intr_rmrks.equalsIgnoreCase(name)) {
			yield_act_intr_rmrks(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($unschd_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_trd_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_trd_unit_dec_place(value);
			return;
		}
		if ($unschd_base_unit_yield_act_qty.equalsIgnoreCase(name)) {
			unschd_base_unit_yield_act_qty(value);
			return;
		}
		if ($unschd_base_unit_dec_place.equalsIgnoreCase(name)) {
			unschd_base_unit_dec_place(value);
			return;
		}
		if ($unschd_conv_base_qty.equalsIgnoreCase(name)) {
			unschd_conv_base_qty(value);
			return;
		}
		if ($unschd_conv_qty.equalsIgnoreCase(name)) {
			unschd_conv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($yield_rate.equalsIgnoreCase(name)) {
			yield_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($unschd_act_tm.equalsIgnoreCase(name)) {
			unschd_act_tm(value);
			return;
		}
		if ($unschd_ac_dt.equalsIgnoreCase(name)) {
			unschd_ac_dt(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($unschd_same_lot_flg.equalsIgnoreCase(name)) {
			unschd_same_lot_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_tgt_flg(value);
			return;
		}
		if ($unschd_strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			unschd_strg_str_ln_cd_none_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($not_stk_flg.equalsIgnoreCase(name)) {
			not_stk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

