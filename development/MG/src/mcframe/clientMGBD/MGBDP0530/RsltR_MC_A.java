package mcframe.clientMGBD.MGBDP0530;

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
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public static final String $cost_std_qty = "cost_std_qty";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public static final String $par_itm_typ_nm = "par_itm_typ_nm";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public static final String $par_itm_typ_d_nm = "par_itm_typ_d_nm";
	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_jnl_cd = "par_itm_jnl_cd";
	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public static final String $par_itm_jnl_nm = "par_itm_jnl_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	public static final String $chd_itm_p = "chd_itm_p";
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public static final String $chd_itm_typ_nm = "chd_itm_typ_nm";
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_cd = "chd_itm_typ_d_cd";
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_nm = "chd_itm_typ_d_nm";
	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_jnl_cd = "chd_itm_jnl_cd";
	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public static final String $chd_itm_jnl_nm = "chd_itm_jnl_nm";
	public static final String $par_rqmt_qty_p = "par_rqmt_qty_p";
	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public static final String $par_base_unit_cd = "par_base_unit_cd";
	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public static final String $par_base_unit_nm = "par_base_unit_nm";
	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	public static final String $chd_rqmt_qty_p = "chd_rqmt_qty_p";
	public static final String $chd_base_qty_p = "chd_base_qty_p";
	public static final String $fxd_chd_rqmt_qty_p = "fxd_chd_rqmt_qty_p";
	public static final String $chd_min_qty_p = "chd_min_qty_p";
	public static final String $chd_batch_qty_p = "chd_batch_qty_p";
	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public static final String $chd_base_unit_cd = "chd_base_unit_cd";
	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public static final String $chd_base_unit_nm = "chd_base_unit_nm";
	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public static final String $expns_nm = "expns_nm";
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
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $par_rqmt_qty = $par_rqmt_qty_p + ".qty";
	public static final String $chd_rqmt_qty = $chd_rqmt_qty_p + ".qty";
	public static final String $chd_base_qty = $chd_base_qty_p + ".qty";
	public static final String $fxd_chd_rqmt_qty = $fxd_chd_rqmt_qty_p + ".qty";
	public static final String $chd_min_qty = $chd_min_qty_p + ".qty";
	public static final String $chd_batch_qty = $chd_batch_qty_p + ".qty";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP5160.TermR.class);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cost_std_qty_META = createCommonMeta($cost_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_jnl_cd_META = createCommonMeta($par_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta par_itm_jnl_nm_META = createCommonMeta($par_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta chd_itm_jnl_cd_META = createCommonMeta($chd_itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta chd_itm_jnl_nm_META = createCommonMeta($chd_itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta par_rqmt_qty_p_META = createInnerRowMeta($par_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta par_base_unit_cd_META = createCommonMeta($par_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_base_unit_nm_META = createCommonMeta($par_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta chd_rqmt_qty_p_META = createInnerRowMeta($chd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_base_qty_p_META = createInnerRowMeta($chd_base_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta fxd_chd_rqmt_qty_p_META = createInnerRowMeta($fxd_chd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_min_qty_p_META = createInnerRowMeta($chd_min_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_batch_qty_p_META = createInnerRowMeta($chd_batch_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta chd_base_unit_cd_META = createCommonMeta($chd_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta chd_base_unit_nm_META = createCommonMeta($chd_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_nm_META = createCommonMeta($expns_nm, mcframe.commonMA.meta.MA_META.EXPNS_NM);
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
			par_itm_p_META,
			cost_std_qty_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
			par_itm_jnl_cd_META,
			par_itm_jnl_nm_META,
			bom_ptn_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			chd_itm_p_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			chd_itm_jnl_cd_META,
			chd_itm_jnl_nm_META,
			par_rqmt_qty_p_META,
			par_base_unit_cd_META,
			par_base_unit_nm_META,
			par_dec_place_META,
			chd_rqmt_qty_p_META,
			chd_base_qty_p_META,
			fxd_chd_rqmt_qty_p_META,
			chd_min_qty_p_META,
			chd_batch_qty_p_META,
			chd_base_unit_cd_META,
			chd_base_unit_nm_META,
			chd_dec_place_META,
			alt_grp_cd_META,
			alt_itm_ratio_META,
			expns_cd_META,
			expns_nm_META,
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
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"par_rqmt_qty",
				"chd_rqmt_qty",
				"chd_base_qty",
				"fxd_chd_rqmt_qty",
				"chd_min_qty",
				"chd_batch_qty",
				"rtn_sts_typ"
			},
			{
				$term,
				$term_nm,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$par_rqmt_qty,
				$chd_rqmt_qty,
				$chd_base_qty,
				$fxd_chd_rqmt_qty,
				$chd_min_qty,
				$chd_batch_qty,
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
			$par_itm_p + ".itm_cd",	// par_itm_p.itm_cd
			$par_itm_p + ".itm_sub1",	// par_itm_p.itm_sub1
			$par_itm_p + ".itm_sub2",	// par_itm_p.itm_sub2
			$par_itm_p + ".itm_sub3",	// par_itm_p.itm_sub3
			$bom_ptn,	// bom_ptn
			$oper_cd,	// oper_cd
			$oper_seq,	// oper_seq
			$chd_itm_p + ".itm_cd",	// chd_itm_p.itm_cd
			$chd_itm_p + ".itm_sub1",	// chd_itm_p.itm_sub1
			$chd_itm_p + ".itm_sub2",	// chd_itm_p.itm_sub2
			$chd_itm_p + ".itm_sub3",	// chd_itm_p.itm_sub3
			$alt_grp_cd,	// alt_grp_cd
			$expns_cd	// expns_cd
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
				{$par_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;unit_cd;unit_nm;dec_place;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;cost_std_qty"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;unit_cd;unit_nm;dec_place;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;cost_std_qty"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_nm;itm_sub3;unit_cd;unit_nm;dec_place;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;cost_std_qty"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_nm;unit_cd;unit_nm;dec_place;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;cost_std_qty"},	// par_itm_p.itm_sub3
				{$par_itm_jnl_cd, "itm_jnl_nm"},	// par_itm_jnl_cd
				{$chd_itm_p + ".itm_cd", "dec_place;unit_cd;unit_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;itm_nm;itm_sub1;itm_sub2;itm_sub3"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "dec_place;unit_cd;unit_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;itm_nm;itm_sub2;itm_sub3"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "dec_place;unit_cd;unit_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;itm_nm;itm_sub3"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "dec_place;unit_cd;unit_nm;itm_typ;itm_typ_nm;itm_typ_d_cd;itm_typ_d_nm;itm_jnl_cd;itm_nm"},	// chd_itm_p.itm_sub3
				{$chd_itm_jnl_cd, "itm_jnl_nm"}	// chd_itm_jnl_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$par_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1;true;true"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;par_itm_cd;true;true"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;par_itm_cd;par_itm_sub1;true;true"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;par_itm_cd;par_itm_sub1;par_itm_sub2;true;true"},	// par_itm_p.itm_sub3
				{$chd_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true;true"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;chd_itm_cd;true;true"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;chd_itm_cd;chd_itm_sub1;true;true"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;chd_itm_cd;chd_itm_sub1;chd_itm_sub2;true;true"},	// chd_itm_p.itm_sub3
				{$expns_cd, "MAC_EXPNS_TYP.PROD"}	// expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$par_itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// par_itm_p.itm_sub3
				{$chd_itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// chd_itm_p.itm_cd
				{$chd_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// chd_itm_p.itm_sub1
				{$chd_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// chd_itm_p.itm_sub2
				{$chd_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// chd_itm_p.itm_sub3
				{$expns_cd, "expns_typ"}	// expns_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 6, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 6, $par_itm_p, row);
	}


	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public MCNumber cost_std_qty() {
		return getConstNumber(offset + 7, $cost_std_qty);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(MCNumber value) {
		setConstNumber(offset + 7, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(int value) {
		setConstNumber(offset + 7, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(long value) {
		setConstNumber(offset + 7, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(float value) {
		setConstNumber(offset + 7, $cost_std_qty, value);
	}

	/**
	 * Cost base qty. 原価基準数.<p>
	 *
	 */
	public void cost_std_qty(double value) {
		setConstNumber(offset + 7, $cost_std_qty, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 8, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 8, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 9, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 9, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 10, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 10, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 11, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 11, $par_itm_typ_d_nm, value);
	}


	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public String par_itm_jnl_cd() {
		return getConstString(offset + 12, $par_itm_jnl_cd);
	}

	/**
	 * Parent item journal cd. 親品目仕訳ＣＤ.<p>
	 *
	 */
	public void par_itm_jnl_cd(String value) {
		setConstString(offset + 12, $par_itm_jnl_cd, value);
	}


	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public String par_itm_jnl_nm() {
		return getConstString(offset + 13, $par_itm_jnl_nm);
	}

	/**
	 * Parent item journal name 親品目仕訳名.<p>
	 *
	 */
	public void par_itm_jnl_nm(String value) {
		setConstString(offset + 13, $par_itm_jnl_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 14, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 14, $bom_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 15, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 15, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 16, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 16, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 17, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 18, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 18, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 18, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 18, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 18, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 18, $disp_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 19, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 19, $chd_itm_p, row);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 20, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 20, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 21, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 21, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 22, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 22, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 23, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 23, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public String chd_itm_jnl_cd() {
		return getConstString(offset + 24, $chd_itm_jnl_cd);
	}

	/**
	 * Child item journal cd. 子品目仕訳ＣＤ.<p>
	 *
	 */
	public void chd_itm_jnl_cd(String value) {
		setConstString(offset + 24, $chd_itm_jnl_cd, value);
	}


	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public String chd_itm_jnl_nm() {
		return getConstString(offset + 25, $chd_itm_jnl_nm);
	}

	/**
	 * Child item journal name 子品目仕訳名.<p>
	 *
	 */
	public void chd_itm_jnl_nm(String value) {
		setConstString(offset + 25, $chd_itm_jnl_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR par_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $par_rqmt_qty_p);
	}
	
	public void par_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $par_rqmt_qty_p, row);
	}


	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public String par_base_unit_cd() {
		return getConstString(offset + 27, $par_base_unit_cd);
	}

	/**
	 * Parent item base unit cd. 親品目基準単位ＣＤ.<p>
	 *
	 */
	public void par_base_unit_cd(String value) {
		setConstString(offset + 27, $par_base_unit_cd, value);
	}


	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public String par_base_unit_nm() {
		return getConstString(offset + 28, $par_base_unit_nm);
	}

	/**
	 * Parent item base unit name 親品目基準単位名.<p>
	 *
	 */
	public void par_base_unit_nm(String value) {
		setConstString(offset + 28, $par_base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 29, $par_dec_place);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 29, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 29, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 29, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 29, $par_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $chd_rqmt_qty_p);
	}
	
	public void chd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $chd_rqmt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_base_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $chd_base_qty_p);
	}
	
	public void chd_base_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $chd_base_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR fxd_chd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $fxd_chd_rqmt_qty_p);
	}
	
	public void fxd_chd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $fxd_chd_rqmt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_min_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $chd_min_qty_p);
	}
	
	public void chd_min_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $chd_min_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR chd_batch_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $chd_batch_qty_p);
	}
	
	public void chd_batch_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $chd_batch_qty_p, row);
	}


	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public String chd_base_unit_cd() {
		return getConstString(offset + 35, $chd_base_unit_cd);
	}

	/**
	 * Child item base unit cd. 子品目基準単位ＣＤ.<p>
	 *
	 */
	public void chd_base_unit_cd(String value) {
		setConstString(offset + 35, $chd_base_unit_cd, value);
	}


	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public String chd_base_unit_nm() {
		return getConstString(offset + 36, $chd_base_unit_nm);
	}

	/**
	 * Child item base unit name 子品目基準単位名.<p>
	 *
	 */
	public void chd_base_unit_nm(String value) {
		setConstString(offset + 36, $chd_base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 37, $chd_dec_place);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 37, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 37, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 37, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 37, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 37, $chd_dec_place, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 38, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 38, $alt_grp_cd, value);
	}


	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 39, $alt_itm_ratio);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 39, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 39, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 39, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 39, $alt_itm_ratio, value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 39, $alt_itm_ratio, value);
	}


	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 40, $expns_cd);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 40, $expns_cd, value);
	}


	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public String expns_nm() {
		return getConstString(offset + 41, $expns_nm);
	}

	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public void expns_nm(String value) {
		setConstString(offset + 41, $expns_nm, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 42, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 42, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 43, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 43, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 44, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 44, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 45, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 45, $sub_char3, value);
	}


	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public boolean non_calc_flg() {
		return getConstBoolean(offset + 46, $non_calc_flg);
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public void non_calc_flg(boolean value) {
		setConstBoolean(offset + 46, $non_calc_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 47, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 47, $rts_msg_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 48, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 48, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 49, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 49, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 51, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 51, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 52, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 56, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 56, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 57, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 58, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 58, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 59, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 59, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 59, $upd_cntr, value);
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			return par_itm_jnl_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			return chd_itm_jnl_cd();
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			return chd_itm_jnl_nm();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
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
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			return par_itm_jnl_cd();
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			return par_itm_jnl_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			return chd_itm_jnl_cd();
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			return chd_itm_jnl_nm();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			return chd_base_unit_cd();
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			return chd_base_unit_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			return expns_nm();
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
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			return cost_std_qty();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			par_itm_jnl_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			chd_itm_jnl_cd(value);
			return;
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			chd_itm_jnl_nm(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
			return;
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			chd_base_unit_cd(value);
			return;
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			chd_base_unit_nm(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
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
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
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
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_jnl_cd.equalsIgnoreCase(name)) {
			par_itm_jnl_cd(value);
			return;
		}
		if ($par_itm_jnl_nm.equalsIgnoreCase(name)) {
			par_itm_jnl_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($chd_itm_jnl_cd.equalsIgnoreCase(name)) {
			chd_itm_jnl_cd(value);
			return;
		}
		if ($chd_itm_jnl_nm.equalsIgnoreCase(name)) {
			chd_itm_jnl_nm(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
			return;
		}
		if ($chd_base_unit_cd.equalsIgnoreCase(name)) {
			chd_base_unit_cd(value);
			return;
		}
		if ($chd_base_unit_nm.equalsIgnoreCase(name)) {
			chd_base_unit_nm(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_nm.equalsIgnoreCase(name)) {
			expns_nm(value);
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
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cost_std_qty.equalsIgnoreCase(name)) {
			cost_std_qty(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
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
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($par_rqmt_qty_p.equalsIgnoreCase(name)) {
			return par_rqmt_qty_p();
		}
		if ($chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return chd_rqmt_qty_p();
		}
		if ($chd_base_qty_p.equalsIgnoreCase(name)) {
			return chd_base_qty_p();
		}
		if ($fxd_chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty_p();
		}
		if ($chd_min_qty_p.equalsIgnoreCase(name)) {
			return chd_min_qty_p();
		}
		if ($chd_batch_qty_p.equalsIgnoreCase(name)) {
			return chd_batch_qty_p();
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
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($par_rqmt_qty_p.equalsIgnoreCase(name)) {
			par_rqmt_qty_p(
				((MCContainerMeta) par_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			chd_rqmt_qty_p(
				((MCContainerMeta) chd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_base_qty_p.equalsIgnoreCase(name)) {
			chd_base_qty_p(
				((MCContainerMeta) chd_base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($fxd_chd_rqmt_qty_p.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty_p(
				((MCContainerMeta) fxd_chd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_min_qty_p.equalsIgnoreCase(name)) {
			chd_min_qty_p(
				((MCContainerMeta) chd_min_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($chd_batch_qty_p.equalsIgnoreCase(name)) {
			chd_batch_qty_p(
				((MCContainerMeta) chd_batch_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public MCNumber par_rqmt_qty() {
		return par_rqmt_qty_p().qty();
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(MCNumber value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(int value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(long value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(float value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Parent required qty. 親必要数量.<p>
	 *
	 */
	public void par_rqmt_qty(double value) {
		par_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return chd_rqmt_qty_p().qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public MCNumber chd_base_qty() {
		return chd_base_qty_p().qty();
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(MCNumber value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(int value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(long value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(float value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child base qty. 子基準数量.<p>
	 *
	 */
	public void chd_base_qty(double value) {
		chd_base_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return fxd_chd_rqmt_qty_p().qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		fxd_chd_rqmt_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public MCNumber chd_min_qty() {
		return chd_min_qty_p().qty();
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(MCNumber value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(int value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(long value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(float value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(double value) {
		chd_min_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public MCNumber chd_batch_qty() {
		return chd_batch_qty_p().qty();
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(MCNumber value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(int value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(long value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(float value) {
		chd_batch_qty_p().qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(double value) {
		chd_batch_qty_p().qty(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

