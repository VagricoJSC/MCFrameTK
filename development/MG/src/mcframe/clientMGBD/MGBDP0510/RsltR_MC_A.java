package mcframe.clientMGBD.MGBDP0510;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	public static final String $term_p = "term_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
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
	 * Supplier cd. (Location) 発注先ＣＤ（場所）.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
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
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public static final String $cost_ratio = "cost_ratio";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $min_lot_qty_p = "min_lot_qty_p";
	public static final String $batch_lot_qty_p = "batch_lot_qty_p";
	public static final String $fxd_lot_qty_p = "fxd_lot_qty_p";
	public static final String $fxd_yield_qty_p = "fxd_yield_qty_p";
	public static final String $nmr_qty_p = "nmr_qty_p";
	public static final String $dnm_qty_p = "dnm_qty_p";
	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public static final String $alc_dpt_nm = "alc_dpt_nm";
	/**
	 * Exploded dept. cd. 展開部門ＣＤ.<p>
	 *
	 */
	public static final String $exp_dpt_cd = "exp_dpt_cd";
	/**
	 * Exploded dept. name 展開部門名.<p>
	 *
	 */
	public static final String $exp_dpt_nm = "exp_dpt_nm";
	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public static final String $exp_prio = "exp_prio";
	public static final String $max_qty_p = "max_qty_p";
	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public static final String $alc_val1 = "alc_val1";
	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public static final String $alc_val2 = "alc_val2";
	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public static final String $alc_val3 = "alc_val3";
	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public static final String $alc_val4 = "alc_val4";
	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public static final String $alc_val5 = "alc_val5";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
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
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public static final String $non_calc_flg = "non_calc_flg";
	public static final String $rts_msg_p = "rts_msg_p";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";

	public static final String $term = $term_p + ".term";
	public static final String $term_nm = $term_p + ".term_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $min_lot_qty = $min_lot_qty_p + ".qty";
	public static final String $batch_lot_qty = $batch_lot_qty_p + ".qty";
	public static final String $fxd_lot_qty = $fxd_lot_qty_p + ".qty";
	public static final String $fxd_yield_qty = $fxd_yield_qty_p + ".qty";
	public static final String $nmr_qty = $nmr_qty_p + ".qty";
	public static final String $dnm_qty = $dnm_qty_p + ".qty";
	public static final String $max_qty = $max_qty_p + ".qty";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP5160.TermR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta cost_ratio_META = createCommonMeta($cost_ratio, mcframe.commonMA.meta.MA_META.COST_RATIO);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta min_lot_qty_p_META = createInnerRowMeta($min_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta batch_lot_qty_p_META = createInnerRowMeta($batch_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta fxd_lot_qty_p_META = createInnerRowMeta($fxd_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta fxd_yield_qty_p_META = createInnerRowMeta($fxd_yield_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta nmr_qty_p_META = createInnerRowMeta($nmr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dnm_qty_p_META = createInnerRowMeta($dnm_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta alc_dpt_nm_META = createCommonMeta($alc_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta exp_dpt_cd_META = createCommonMeta($exp_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta exp_dpt_nm_META = createCommonMeta($exp_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta exp_prio_META = createCommonMeta($exp_prio, mcframe.commonMG.meta.MG_META.EXP_PRIO);
	public static final MCMeta max_qty_p_META = createInnerRowMeta($max_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta alc_val1_META = createCommonMeta($alc_val1, mcframe.commonMA.meta.MA_META.ALC_VAL1);
	public static final MCMeta alc_val2_META = createCommonMeta($alc_val2, mcframe.commonMA.meta.MA_META.ALC_VAL2);
	public static final MCMeta alc_val3_META = createCommonMeta($alc_val3, mcframe.commonMA.meta.MA_META.ALC_VAL3);
	public static final MCMeta alc_val4_META = createCommonMeta($alc_val4, mcframe.commonMA.meta.MA_META.ALC_VAL4);
	public static final MCMeta alc_val5_META = createCommonMeta($alc_val5, mcframe.commonMA.meta.MA_META.ALC_VAL5);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.ITM_DTL_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.ITM_DTL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.ITM_DTL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.ITM_DTL_SUB_CHAR3);
	public static final MCMeta non_calc_flg_META = createCommonMeta($non_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			term_p_META,
			itm_p_META,
			asset_mng_typ_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			loc_sppl_cd_META,
			sppl_cd_META,
			sppl_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			cost_ratio_META,
			bom_ptn_META,
			oper_ptn_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			min_lot_qty_p_META,
			batch_lot_qty_p_META,
			fxd_lot_qty_p_META,
			fxd_yield_qty_p_META,
			nmr_qty_p_META,
			dnm_qty_p_META,
			alc_dpt_cd_META,
			alc_dpt_nm_META,
			exp_dpt_cd_META,
			exp_dpt_nm_META,
			exp_prio_META,
			max_qty_p_META,
			alc_val1_META,
			alc_val2_META,
			alc_val3_META,
			alc_val4_META,
			alc_val5_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			non_calc_flg_META,
			rts_msg_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META
		},
		new String[][]{
			{
				"term",
				"term_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"min_lot_qty",
				"batch_lot_qty",
				"fxd_lot_qty",
				"fxd_yield_qty",
				"nmr_qty",
				"dnm_qty",
				"max_qty",
				"rtn_sts_typ"
			},
			{
				$term,
				$term_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$min_lot_qty,
				$batch_lot_qty,
				$fxd_lot_qty,
				$fxd_yield_qty,
				$nmr_qty,
				$dnm_qty,
				$max_qty,
				$rtn_sts_typ
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$calc_ctg_cd,	// calc_ctg_cd
			$wg_cd,	// wg_cd
			$term_p + ".term",	// term_p.term
			$itm_p + ".itm_cd",	// itm_p.itm_cd
			$itm_p + ".itm_sub1",	// itm_p.itm_sub1
			$itm_p + ".itm_sub2",	// itm_p.itm_sub2
			$itm_p + ".itm_sub3",	// itm_p.itm_sub3
			$loc_cd,	// loc_cd
			$sppl_cd,	// sppl_cd
			$rqst_wg_cd	// rqst_wg_cd
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
				{$loc_cd, "loc_nm;site_cd;site_nm;sppl_cd"},	// loc_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$rqst_wg_cd, "wg_nm"},	// rqst_wg_cd
				{$alc_dpt_cd, "dpt_nm"},	// alc_dpt_cd
				{$exp_dpt_cd, "dpt_nm"}	// exp_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_p.itm_sub3
				{$loc_cd, "wg_cd"},	// loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$rqst_wg_cd, "true"},	// rqst_wg_cd
				{$bom_ptn, "true;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;term"},	// bom_ptn
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;term"},	// oper_ptn
				{$alc_dpt_cd, "term"},	// alc_dpt_cd
				{$exp_dpt_cd, "term"}	// exp_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// itm_p.itm_sub3
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$rqst_wg_cd, "rd_flg"},	// rqst_wg_cd
				{$bom_ptn, "par_itm_flg;itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;term"},	// bom_ptn
				{$oper_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;term"},	// oper_ptn
				{$alc_dpt_cd, "ym"},	// alc_dpt_cd
				{$exp_dpt_cd, "ym"}	// exp_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"}	// rqst_wg_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 1, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 1, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 2, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 2, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5160.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP5160.TermR) getConstInnerRow(offset + 5, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP5160.TermR row){
		setConstInnerRow(offset + 5, $term_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 7, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 7, $asset_mng_typ, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 8, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 8, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 9, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 9, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 10, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 10, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 11, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 11, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 12, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 12, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 13, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 13, $itm_jnl_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 14, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 14, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 15, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 15, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 16, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 16, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 17, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 17, $site_nm, value);
	}


	/**
	 * Supplier cd. (Location) 発注先ＣＤ（場所）.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 18, $loc_sppl_cd);
	}

	/**
	 * Supplier cd. (Location) 発注先ＣＤ（場所）.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 18, $loc_sppl_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 19, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 19, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 20, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 20, $sppl_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 21, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 21, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 22, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 22, $rqst_wg_nm, value);
	}


	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCNumber cost_ratio() {
		return getConstNumber(offset + 23, $cost_ratio);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(MCNumber value) {
		setConstNumber(offset + 23, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(int value) {
		setConstNumber(offset + 23, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(long value) {
		setConstNumber(offset + 23, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(float value) {
		setConstNumber(offset + 23, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(double value) {
		setConstNumber(offset + 23, $cost_ratio, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 24, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 24, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 25, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 25, $oper_ptn, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 26, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 26, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 27, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 27, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 28, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 28, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR min_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $min_lot_qty_p);
	}
	
	public void min_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $min_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR batch_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $batch_lot_qty_p);
	}
	
	public void batch_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $batch_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR fxd_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $fxd_lot_qty_p);
	}
	
	public void fxd_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $fxd_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR fxd_yield_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $fxd_yield_qty_p);
	}
	
	public void fxd_yield_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $fxd_yield_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR nmr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $nmr_qty_p);
	}
	
	public void nmr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $nmr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR dnm_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $dnm_qty_p);
	}
	
	public void dnm_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $dnm_qty_p, row);
	}


	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 35, $alc_dpt_cd);
	}

	/**
	 * Allocation dept. cd. 配賦部門ＣＤ.<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 35, $alc_dpt_cd, value);
	}


	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public String alc_dpt_nm() {
		return getConstString(offset + 36, $alc_dpt_nm);
	}

	/**
	 * Allocation dept. name 配賦部門名.<p>
	 *
	 */
	public void alc_dpt_nm(String value) {
		setConstString(offset + 36, $alc_dpt_nm, value);
	}


	/**
	 * Exploded dept. cd. 展開部門ＣＤ.<p>
	 *
	 */
	public String exp_dpt_cd() {
		return getConstString(offset + 37, $exp_dpt_cd);
	}

	/**
	 * Exploded dept. cd. 展開部門ＣＤ.<p>
	 *
	 */
	public void exp_dpt_cd(String value) {
		setConstString(offset + 37, $exp_dpt_cd, value);
	}


	/**
	 * Exploded dept. name 展開部門名.<p>
	 *
	 */
	public String exp_dpt_nm() {
		return getConstString(offset + 38, $exp_dpt_nm);
	}

	/**
	 * Exploded dept. name 展開部門名.<p>
	 *
	 */
	public void exp_dpt_nm(String value) {
		setConstString(offset + 38, $exp_dpt_nm, value);
	}


	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public MCNumber exp_prio() {
		return getConstNumber(offset + 39, $exp_prio);
	}

	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public void exp_prio(MCNumber value) {
		setConstNumber(offset + 39, $exp_prio, value);
	}

	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public void exp_prio(int value) {
		setConstNumber(offset + 39, $exp_prio, value);
	}

	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public void exp_prio(long value) {
		setConstNumber(offset + 39, $exp_prio, value);
	}

	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public void exp_prio(float value) {
		setConstNumber(offset + 39, $exp_prio, value);
	}

	/**
	 * Explosion priority 展開優先順位.<p>
	 *
	 */
	public void exp_prio(double value) {
		setConstNumber(offset + 39, $exp_prio, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR max_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $max_qty_p);
	}
	
	public void max_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $max_qty_p, row);
	}


	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public MCNumber alc_val1() {
		return getConstNumber(offset + 41, $alc_val1);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(MCNumber value) {
		setConstNumber(offset + 41, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(int value) {
		setConstNumber(offset + 41, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(long value) {
		setConstNumber(offset + 41, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(float value) {
		setConstNumber(offset + 41, $alc_val1, value);
	}

	/**
	 * Allocation value 1 配賦基準値１.<p>
	 *
	 */
	public void alc_val1(double value) {
		setConstNumber(offset + 41, $alc_val1, value);
	}


	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public MCNumber alc_val2() {
		return getConstNumber(offset + 42, $alc_val2);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(MCNumber value) {
		setConstNumber(offset + 42, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(int value) {
		setConstNumber(offset + 42, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(long value) {
		setConstNumber(offset + 42, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(float value) {
		setConstNumber(offset + 42, $alc_val2, value);
	}

	/**
	 * Allocation value 2 配賦基準値２.<p>
	 *
	 */
	public void alc_val2(double value) {
		setConstNumber(offset + 42, $alc_val2, value);
	}


	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public MCNumber alc_val3() {
		return getConstNumber(offset + 43, $alc_val3);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(MCNumber value) {
		setConstNumber(offset + 43, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(int value) {
		setConstNumber(offset + 43, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(long value) {
		setConstNumber(offset + 43, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(float value) {
		setConstNumber(offset + 43, $alc_val3, value);
	}

	/**
	 * Allocation value 3 配賦基準値３.<p>
	 *
	 */
	public void alc_val3(double value) {
		setConstNumber(offset + 43, $alc_val3, value);
	}


	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public MCNumber alc_val4() {
		return getConstNumber(offset + 44, $alc_val4);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(MCNumber value) {
		setConstNumber(offset + 44, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(int value) {
		setConstNumber(offset + 44, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(long value) {
		setConstNumber(offset + 44, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(float value) {
		setConstNumber(offset + 44, $alc_val4, value);
	}

	/**
	 * Allocation value 4 配賦基準値４.<p>
	 *
	 */
	public void alc_val4(double value) {
		setConstNumber(offset + 44, $alc_val4, value);
	}


	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public MCNumber alc_val5() {
		return getConstNumber(offset + 45, $alc_val5);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(MCNumber value) {
		setConstNumber(offset + 45, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(int value) {
		setConstNumber(offset + 45, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(long value) {
		setConstNumber(offset + 45, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(float value) {
		setConstNumber(offset + 45, $alc_val5, value);
	}

	/**
	 * Allocation value 5 配賦基準値５.<p>
	 *
	 */
	public void alc_val5(double value) {
		setConstNumber(offset + 45, $alc_val5, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 46, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 46, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 47, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 47, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 48, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 48, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 49, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 49, $sub_char3, value);
	}


	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public boolean non_calc_flg() {
		return getConstBoolean(offset + 50, $non_calc_flg);
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public void non_calc_flg(boolean value) {
		setConstBoolean(offset + 50, $non_calc_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 51, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 51, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 52, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 52, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 53, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 53, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 54, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 54, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 55, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 55, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 56, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 56, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 57, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 57, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 58, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 58, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 59, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 59, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 60, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 60, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 61, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 61, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 62, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 62, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 63, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 63, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($exp_dpt_cd.equalsIgnoreCase(name)) {
			return exp_dpt_cd();
		}
		if ($exp_dpt_nm.equalsIgnoreCase(name)) {
			return exp_dpt_nm();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			return exp_prio();
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			return alc_val1();
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			return alc_val2();
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			return alc_val3();
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			return alc_val4();
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			return alc_val5();
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
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			return non_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			return alc_dpt_nm();
		}
		if ($exp_dpt_cd.equalsIgnoreCase(name)) {
			return exp_dpt_cd();
		}
		if ($exp_dpt_nm.equalsIgnoreCase(name)) {
			return exp_dpt_nm();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			return exp_prio();
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			return alc_val1();
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			return alc_val2();
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			return alc_val3();
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			return alc_val4();
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			return alc_val5();
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
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			return non_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($exp_dpt_cd.equalsIgnoreCase(name)) {
			exp_dpt_cd(value);
			return;
		}
		if ($exp_dpt_nm.equalsIgnoreCase(name)) {
			exp_dpt_nm(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
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
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			non_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($alc_dpt_nm.equalsIgnoreCase(name)) {
			alc_dpt_nm(value);
			return;
		}
		if ($exp_dpt_cd.equalsIgnoreCase(name)) {
			exp_dpt_cd(value);
			return;
		}
		if ($exp_dpt_nm.equalsIgnoreCase(name)) {
			exp_dpt_nm(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($exp_prio.equalsIgnoreCase(name)) {
			exp_prio(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
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
		if ($non_calc_flg.equalsIgnoreCase(name)) {
			non_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($min_lot_qty_p.equalsIgnoreCase(name)) {
			return min_lot_qty_p();
		}
		if ($batch_lot_qty_p.equalsIgnoreCase(name)) {
			return batch_lot_qty_p();
		}
		if ($fxd_lot_qty_p.equalsIgnoreCase(name)) {
			return fxd_lot_qty_p();
		}
		if ($fxd_yield_qty_p.equalsIgnoreCase(name)) {
			return fxd_yield_qty_p();
		}
		if ($nmr_qty_p.equalsIgnoreCase(name)) {
			return nmr_qty_p();
		}
		if ($dnm_qty_p.equalsIgnoreCase(name)) {
			return dnm_qty_p();
		}
		if ($max_qty_p.equalsIgnoreCase(name)) {
			return max_qty_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5160.TermR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($min_lot_qty_p.equalsIgnoreCase(name)) {
			min_lot_qty_p(
				((MCContainerMeta) min_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($batch_lot_qty_p.equalsIgnoreCase(name)) {
			batch_lot_qty_p(
				((MCContainerMeta) batch_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($fxd_lot_qty_p.equalsIgnoreCase(name)) {
			fxd_lot_qty_p(
				((MCContainerMeta) fxd_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($fxd_yield_qty_p.equalsIgnoreCase(name)) {
			fxd_yield_qty_p(
				((MCContainerMeta) fxd_yield_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($nmr_qty_p.equalsIgnoreCase(name)) {
			nmr_qty_p(
				((MCContainerMeta) nmr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dnm_qty_p.equalsIgnoreCase(name)) {
			dnm_qty_p(
				((MCContainerMeta) dnm_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($max_qty_p.equalsIgnoreCase(name)) {
			max_qty_p(
				((MCContainerMeta) max_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
	}

	public String term_nm() {
		return term_p().term_nm();
	}

	public void term_nm(String value) {
		term_p().term_nm(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return min_lot_qty_p().qty();
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return batch_lot_qty_p().qty();
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Constant reference lot qty. 固定基準ロット数量.<p>
	 *
	 */
	public MCNumber fxd_lot_qty() {
		return fxd_lot_qty_p().qty();
	}

	/**
	 * Constant reference lot qty. 固定基準ロット数量.<p>
	 *
	 */
	public void fxd_lot_qty(MCNumber value) {
		fxd_lot_qty_p().qty(value);
	}

	/**
	 * Constant reference lot qty. 固定基準ロット数量.<p>
	 *
	 */
	public void fxd_lot_qty(int value) {
		fxd_lot_qty_p().qty(value);
	}

	/**
	 * Constant reference lot qty. 固定基準ロット数量.<p>
	 *
	 */
	public void fxd_lot_qty(long value) {
		fxd_lot_qty_p().qty(value);
	}

	/**
	 * Constant reference lot qty. 固定基準ロット数量.<p>
	 *
	 */
	public void fxd_lot_qty(float value) {
		fxd_lot_qty_p().qty(value);
	}

	/**
	 * Constant reference lot qty. 固定基準ロット数量.<p>
	 *
	 */
	public void fxd_lot_qty(double value) {
		fxd_lot_qty_p().qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return fxd_yield_qty_p().qty();
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		fxd_yield_qty_p().qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		fxd_yield_qty_p().qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		fxd_yield_qty_p().qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		fxd_yield_qty_p().qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		fxd_yield_qty_p().qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return nmr_qty_p().qty();
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		nmr_qty_p().qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(int value) {
		nmr_qty_p().qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(long value) {
		nmr_qty_p().qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(float value) {
		nmr_qty_p().qty(value);
	}

	/**
	 * Yield mfg. qty. 歩留製造数量.<p>
	 *
	 */
	public void nmr_qty(double value) {
		nmr_qty_p().qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return dnm_qty_p().qty();
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		dnm_qty_p().qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(int value) {
		dnm_qty_p().qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(long value) {
		dnm_qty_p().qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(float value) {
		dnm_qty_p().qty(value);
	}

	/**
	 * Ideal mfg. qty. 理論製造数量.<p>
	 *
	 */
	public void dnm_qty(double value) {
		dnm_qty_p().qty(value);
	}

	/**
	 * Monthly max. qty. 月次最大数量.<p>
	 *
	 */
	public MCNumber max_qty() {
		return max_qty_p().qty();
	}

	/**
	 * Monthly max. qty. 月次最大数量.<p>
	 *
	 */
	public void max_qty(MCNumber value) {
		max_qty_p().qty(value);
	}

	/**
	 * Monthly max. qty. 月次最大数量.<p>
	 *
	 */
	public void max_qty(int value) {
		max_qty_p().qty(value);
	}

	/**
	 * Monthly max. qty. 月次最大数量.<p>
	 *
	 */
	public void max_qty(long value) {
		max_qty_p().qty(value);
	}

	/**
	 * Monthly max. qty. 月次最大数量.<p>
	 *
	 */
	public void max_qty(float value) {
		max_qty_p().qty(value);
	}

	/**
	 * Monthly max. qty. 月次最大数量.<p>
	 *
	 */
	public void max_qty(double value) {
		max_qty_p().qty(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

