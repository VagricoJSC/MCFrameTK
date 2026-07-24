package mcframe.serverMSBA.MSBAL0020;

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
 * ブロック"Chk01_Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_Rslt2R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public static final String $fix_dt = "fix_dt";
	/**
	 * Notification 通知.<p>
	 *
	 */
	public static final String $prms_ntc_flg = "prms_ntc_flg";
	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public static final String $re_prms_ntc_flg = "re_prms_ntc_flg";
	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public static final String $re_prms_dt = "re_prms_dt";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_prms_no = "wg_rqst_prms_no";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
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
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_trd_unit_cd = "prms_trd_unit_cd";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $prms_trd_unit_dec_place = "prms_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $prms_trd_unit_rnd_typ = "prms_trd_unit_rnd_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_conv_base_qty = "prms_trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_conv_qty = "prms_trd_unit_conv_qty";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_qty = "prms_trd_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_base_unit_cd = "prms_base_unit_cd";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $prms_base_unit_dec_place = "prms_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $prms_base_unit_rnd_typ = "prms_base_unit_rnd_typ";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $prms_base_unit_qty = "prms_base_unit_qty";
	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public static final String $gr_schd_tm = "gr_schd_tm";
	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public static final String $gi_schd_tm = "gi_schd_tm";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public static final String $last_fix_flg = "last_fix_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public static final String $wg_rqst_prms_upd_cntr = "wg_rqst_prms_upd_cntr";
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	public static final String $po_schd_dt = "po_schd_dt";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_dt_META = createCommonMeta($fix_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_dt_META = createCommonMeta($re_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_prms_no_META = createCommonMeta($wg_rqst_prms_no, mcframe.commonMA.meta.MA_META.WG_RQST_PRMS_NO);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta prms_trd_unit_cd_META = createCommonMeta($prms_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_trd_unit_dec_place_META = createCommonMeta($prms_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prms_trd_unit_rnd_typ_META = createCommonMeta($prms_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prms_trd_unit_conv_base_qty_META = createCommonMeta($prms_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_trd_unit_conv_qty_META = createCommonMeta($prms_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_trd_unit_qty_META = createCommonMeta($prms_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_base_unit_cd_META = createCommonMeta($prms_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_base_unit_dec_place_META = createCommonMeta($prms_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prms_base_unit_rnd_typ_META = createCommonMeta($prms_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prms_base_unit_qty_META = createCommonMeta($prms_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_schd_tm_META = createCommonMeta($gr_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gi_schd_tm_META = createCommonMeta($gi_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR3);
	public static final MCMeta last_fix_flg_META = createCommonMeta($last_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta wg_rqst_prms_upd_cntr_META = createCommonMeta($wg_rqst_prms_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Chk01_Rslt2R> constMetas = new ConstMetaList<Chk01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			fix_flg_META,
			fix_dt_META,
			prms_ntc_flg_META,
			prms_dt_META,
			re_prms_ntc_flg_META,
			re_prms_dt_META,
			can_flg_META,
			wg_rqst_prms_no_META,
			wg_rqst_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			dscnt_itm_flg_META,
			gr_wg_cd_META,
			wg_cd_META,
			prms_trd_unit_cd_META,
			prms_trd_unit_dec_place_META,
			prms_trd_unit_rnd_typ_META,
			prms_trd_unit_conv_base_qty_META,
			prms_trd_unit_conv_qty_META,
			prms_trd_unit_qty_META,
			prms_base_unit_cd_META,
			prms_base_unit_dec_place_META,
			prms_base_unit_rnd_typ_META,
			prms_base_unit_qty_META,
			gr_schd_tm_META,
			gi_schd_tm_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_wg_cd_META,
			gi_lg_grp_cd_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			sppl_cd_META,
			maker_cd_META,
			prms_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			last_fix_flg_META,
			rtn_sts_typ_META,
			wg_rqst_prms_upd_cntr_META,
			sppl_cal_cd_META,
			po_schd_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

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
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$wg_rqst_no, "E"},	// wg_rqst_no
				{$itm_cd, "E"},	// itm_cd
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$wg_cd, "E"},	// wg_cd
				{$prms_trd_unit_cd, "E"},	// prms_trd_unit_cd
				{$prms_trd_unit_qty, "E"},	// prms_trd_unit_qty
				{$gr_schd_tm, "E"}	// gr_schd_tm
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$prms_trd_unit_qty, "positive"}	// prms_trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$fix_dt, "bfToday"},	// fix_dt
				{$prms_dt, "bfToday"},	// prms_dt
				{$re_prms_dt, "bfToday"}	// re_prms_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$gr_schd_tm, "tm:AF"},	// gr_schd_tm
				{$gi_schd_tm, "tm:BF"}	// gi_schd_tm
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
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$gr_wg_cd, "MA.MAUAL0010.Wg"},	// gr_wg_cd
				{$wg_cd, "MA.MAUAL0010.Wg"},	// wg_cd
				{$prms_trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// prms_trd_unit_cd
				{$gi_loc_cd, "MA.MAUAL0010.Loc"},	// gi_loc_cd
				{$gi_str_ln_cd, "MA.MAUAL0010.StrLn"},	// gi_str_ln_cd
				{$mfg_loc_cd, "MA.MAUAL0010.Loc"},	// mfg_loc_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$itm_sub3, "prms_base_unit_cd;prms_base_unit_dec_place;prms_base_unit_rnd_typ;dscnt_itm_flg"},	// itm_sub3
				{$prms_trd_unit_cd, "prms_trd_unit_dec_place;prms_trd_unit_conv_base_qty;prms_trd_unit_conv_qty;prms_trd_unit_rnd_typ"},	// prms_trd_unit_cd
				{$gi_loc_cd, "gi_wg_cd;gi_lg_grp_cd"},	// gi_loc_cd
				{$sppl_cd, "sppl_nm;sppl_cal_cd"},	// sppl_cd
				{$maker_cd, "maker_nm"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "unit_cd;dec_place;rnd_typ;dscnt_itm_flg"},	// itm_sub3
				{$prms_trd_unit_cd, "dec_place;conv_base_qty;conv_qty;rnd_typ"},	// prms_trd_unit_cd
				{$gi_loc_cd, "wg_cd;lg_grp_cd"},	// gi_loc_cd
				{$sppl_cd, "bp_nm;sppl_cal_cd"},	// sppl_cd
				{$maker_cd, "bp_nm"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_sub3
				{$prms_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// prms_trd_unit_cd
				{$gi_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM;true"},	// gi_loc_cd
				{$gi_str_ln_cd, "gi_loc_cd;true"},	// gi_str_ln_cd
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.OUTSIDE_EQ_WG;gr_wg_cd;true"},	// mfg_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL;true"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"},	// itm_sub3
				{$prms_trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// prms_trd_unit_cd
				{$gi_loc_cd, "loc_is_srch_typ;mode_nullval_flg"},	// gi_loc_cd
				{$gi_str_ln_cd, "loc_cd;mode_nullval_flg"},	// gi_str_ln_cd
				{$mfg_loc_cd, "loc_is_srch_typ;wg_cd;mode_nullval_flg"},	// mfg_loc_cd
				{$sppl_cd, "bp_is_srch_typ;mode_nullval_flg"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"}	// maker_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$itm_sub1, "E"},	// itm_sub1
				{$itm_sub2, "E"},	// itm_sub2
				{$itm_sub3, "E"},	// itm_sub3
				{$gi_loc_cd, "E"},	// gi_loc_cd
				{$gi_str_ln_cd, "E"},	// gi_str_ln_cd
				{$mfg_loc_cd, "E"},	// mfg_loc_cd
				{$bom_ptn, "E"},	// bom_ptn
				{$sppl_cd, "E"},	// sppl_cd
				{$maker_cd, "E"}	// maker_cd
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
	protected Chk01_Rslt2R_MC_A(ConstMetaList<? extends Chk01_Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Rslt2R clone() {
		return (Chk01_Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Rslt2R createInstance() {
		return (Chk01_Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Rslt2R getValues(String... names) {
		return (Chk01_Rslt2R) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 3, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 3, $fix_flg, value);
	}


	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 4, $fix_dt);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 4, $fix_dt, value);
	}


	/**
	 * Notification 通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 5, $prms_ntc_flg);
	}

	/**
	 * Notification 通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 5, $prms_ntc_flg, value);
	}


	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 6, $prms_dt);
	}

	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 6, $prms_dt, value);
	}


	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 7, $re_prms_ntc_flg);
	}

	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 7, $re_prms_ntc_flg, value);
	}


	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public MCDate re_prms_dt() {
		return getConstDate(offset + 8, $re_prms_dt);
	}

	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public void re_prms_dt(MCDate value) {
		setConstDate(offset + 8, $re_prms_dt, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 9, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 9, $can_flg, value);
	}


	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public String wg_rqst_prms_no() {
		return getConstString(offset + 10, $wg_rqst_prms_no);
	}

	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public void wg_rqst_prms_no(String value) {
		setConstString(offset + 10, $wg_rqst_prms_no, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 11, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 11, $wg_rqst_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 12, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 12, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 13, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 13, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 14, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 14, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 15, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 15, $itm_sub3, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 16, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 16, $dscnt_itm_flg, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 17, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 17, $gr_wg_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 18, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 18, $wg_cd, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String prms_trd_unit_cd() {
		return getConstString(offset + 19, $prms_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void prms_trd_unit_cd(String value) {
		setConstString(offset + 19, $prms_trd_unit_cd, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber prms_trd_unit_dec_place() {
		return getConstNumber(offset + 20, $prms_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(int value) {
		setConstNumber(offset + 20, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(long value) {
		setConstNumber(offset + 20, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(float value) {
		setConstNumber(offset + 20, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(double value) {
		setConstNumber(offset + 20, $prms_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String prms_trd_unit_rnd_typ() {
		return getConstString(offset + 21, $prms_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void prms_trd_unit_rnd_typ(String value) {
		setConstString(offset + 21, $prms_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 22, $prms_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 22, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 22, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 22, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 22, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 22, $prms_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_conv_qty() {
		return getConstNumber(offset + 23, $prms_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 23, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 23, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 23, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 23, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 23, $prms_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_qty() {
		return getConstNumber(offset + 24, $prms_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 24, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(int value) {
		setConstNumber(offset + 24, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(long value) {
		setConstNumber(offset + 24, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(float value) {
		setConstNumber(offset + 24, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(double value) {
		setConstNumber(offset + 24, $prms_trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String prms_base_unit_cd() {
		return getConstString(offset + 25, $prms_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void prms_base_unit_cd(String value) {
		setConstString(offset + 25, $prms_base_unit_cd, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber prms_base_unit_dec_place() {
		return getConstNumber(offset + 26, $prms_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(int value) {
		setConstNumber(offset + 26, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(long value) {
		setConstNumber(offset + 26, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(float value) {
		setConstNumber(offset + 26, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(double value) {
		setConstNumber(offset + 26, $prms_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String prms_base_unit_rnd_typ() {
		return getConstString(offset + 27, $prms_base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void prms_base_unit_rnd_typ(String value) {
		setConstString(offset + 27, $prms_base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber prms_base_unit_qty() {
		return getConstNumber(offset + 28, $prms_base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 28, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(int value) {
		setConstNumber(offset + 28, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(long value) {
		setConstNumber(offset + 28, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(float value) {
		setConstNumber(offset + 28, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(double value) {
		setConstNumber(offset + 28, $prms_base_unit_qty, value);
	}


	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public MCDate gr_schd_tm() {
		return getConstDate(offset + 29, $gr_schd_tm);
	}

	/**
	 * Replied GR date and time 回答入庫日時.<p>
	 *
	 */
	public void gr_schd_tm(MCDate value) {
		setConstDate(offset + 29, $gr_schd_tm, value);
	}


	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public MCDate gi_schd_tm() {
		return getConstDate(offset + 30, $gi_schd_tm);
	}

	/**
	 * Replied GI date and time 回答出庫日時.<p>
	 *
	 */
	public void gi_schd_tm(MCDate value) {
		setConstDate(offset + 30, $gi_schd_tm, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 31, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 31, $gi_loc_cd, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 32, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 32, $gi_str_ln_cd, value);
	}


	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 33, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 33, $gi_wg_cd, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 34, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 34, $gi_lg_grp_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 35, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 35, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 36, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 36, $bom_ptn, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 37, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 37, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 38, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 38, $maker_cd, value);
	}


	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 39, $prms_rmrks);
	}

	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 39, $prms_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 40, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 40, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 41, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 41, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 42, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 42, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 43, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 43, $sub_char3, value);
	}


	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public boolean last_fix_flg() {
		return getConstBoolean(offset + 44, $last_fix_flg);
	}

	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public void last_fix_flg(boolean value) {
		setConstBoolean(offset + 44, $last_fix_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 45, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 45, $rtn_sts_typ, value);
	}


	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public MCNumber wg_rqst_prms_upd_cntr() {
		return getConstNumber(offset + 46, $wg_rqst_prms_upd_cntr);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(MCNumber value) {
		setConstNumber(offset + 46, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(int value) {
		setConstNumber(offset + 46, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(long value) {
		setConstNumber(offset + 46, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(float value) {
		setConstNumber(offset + 46, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(double value) {
		setConstNumber(offset + 46, $wg_rqst_prms_upd_cntr, value);
	}


	public String sppl_cal_cd() {
		return getConstString(offset + 47, $sppl_cal_cd);
	}

	public void sppl_cal_cd(String value) {
		setConstString(offset + 47, $sppl_cal_cd, value);
	}


	public MCDate po_schd_dt() {
		return getConstDate(offset + 48, $po_schd_dt);
	}

	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 48, $po_schd_dt, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_trd_unit_rnd_typ();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_base_unit_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_trd_unit_dec_place();
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_base_qty();
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_qty();
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty();
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_base_unit_dec_place();
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			return prms_base_unit_qty();
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_prms_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			return gr_schd_tm();
		}
		if ($gi_schd_tm.equalsIgnoreCase(name)) {
			return gi_schd_tm();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_trd_unit_rnd_typ();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_base_unit_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_trd_unit_dec_place();
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_base_qty();
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_qty();
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty();
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_base_unit_dec_place();
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			return prms_base_unit_qty();
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_prms_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			return gr_schd_tm();
		}
		if ($gi_schd_tm.equalsIgnoreCase(name)) {
			return gi_schd_tm();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_trd_unit_rnd_typ(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_base_unit_rnd_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			gr_schd_tm(value);
			return;
		}
		if ($gi_schd_tm.equalsIgnoreCase(name)) {
			gi_schd_tm(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
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
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_trd_unit_rnd_typ(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_base_unit_rnd_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($gr_schd_tm.equalsIgnoreCase(name)) {
			gr_schd_tm(value);
			return;
		}
		if ($gi_schd_tm.equalsIgnoreCase(name)) {
			gi_schd_tm(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

