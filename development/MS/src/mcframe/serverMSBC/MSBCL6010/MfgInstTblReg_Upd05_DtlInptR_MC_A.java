package mcframe.serverMSBC.MSBCL6010;

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
 * ブロック"MfgInstTblReg_Upd05_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstTblReg_Upd05_DtlInptR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public static final String $hdr_mfg_sts_typ = "hdr_mfg_sts_typ";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Without lot ロット指定無し.<p>
	 *
	 */
	public static final String $no_lot_fix_flg = "no_lot_fix_flg";
	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public static final String $disp_seq_upd_flg = "disp_seq_upd_flg";
	/**
	 * Error for ordered movement/transport 移動・移送指図済エラー.<p>
	 *
	 */
	public static final String $xfr_inst_err_flg = "xfr_inst_err_flg";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public static final String $old_inst_abort_flg = "old_inst_abort_flg";
	/**
	 * Caller subcontractor mfg. order service 呼出元外注製造指図サービス.<p>
	 *
	 */
	public static final String $is_src_outsrc_srv_flg = "is_src_outsrc_srv_flg";
	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public static final String $lst_reg_flg = "lst_reg_flg";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";
	public static final String $not_header_inst_abort_flg = "not_header_inst_abort_flg";
	/**
	 * Spare 1 (Remaining input result) 予備１（投入実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char1 = "rem_sub_char1";
	/**
	 * Spare 2 (Remaining input result) 予備２（投入実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char2 = "rem_sub_char2";
	/**
	 * Spare 3 (Remaining input result) 予備３（投入実績残）.<p>
	 *
	 */
	public static final String $rem_sub_char3 = "rem_sub_char3";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public static final String $diff_inpt_qty = "diff_inpt_qty";
	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public static final String $diff_fxd_qty = "diff_fxd_qty";
	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public static final String $cont_diff_inpt_qty = "cont_diff_inpt_qty";
	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public static final String $cont_diff_fxd_qty = "cont_diff_fxd_qty";
	/**
	 * Allocation service execution row 引当サービス実行行.<p>
	 *
	 */
	public static final String $call_alloc_srv_flg = "call_alloc_srv_flg";
	/**
	 * Allocation service additional row 引当サービス追加行.<p>
	 *
	 */
	public static final String $alloc_srv_add_flg = "alloc_srv_add_flg";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public static final String $tmp_peg_no = "tmp_peg_no";
	/**
	 * Inventory rack/line setting flg. 在庫棚・ライン設定ＦＬＧ.<p>
	 *
	 */
	public static final String $set_stk_str_ln_flg = "set_stk_str_ln_flg";
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	public static final String $inpt_schd = "inpt_schd";

	public static final String $inpt_schd_no = $inpt_schd + ".inpt_schd_no";
	public static final String $mfg_inst_no = $inpt_schd + ".mfg_inst_no";
	public static final String $itm_mfg_inst_no = $inpt_schd + ".itm_mfg_inst_no";
	public static final String $oper_inst_no = $inpt_schd + ".oper_inst_no";
	public static final String $schd_tm = $inpt_schd + ".schd_tm";
	public static final String $alt_grp_cd = $inpt_schd + ".alt_grp_cd";
	public static final String $alt_grp_seq = $inpt_schd + ".alt_grp_seq";
	public static final String $itm_cd = $inpt_schd + ".itm_cd";
	public static final String $itm_sub1 = $inpt_schd + ".itm_sub1";
	public static final String $itm_sub2 = $inpt_schd + ".itm_sub2";
	public static final String $itm_sub3 = $inpt_schd + ".itm_sub3";
	public static final String $ver_no = $inpt_schd + ".ver_no";
	public static final String $base_unit_inpt_qty = $inpt_schd + ".base_unit_inpt_qty";
	public static final String $base_unit_rqmt_qty = $inpt_schd + ".base_unit_rqmt_qty";
	public static final String $base_unit_fxd_rqmt_qty = $inpt_schd + ".base_unit_fxd_rqmt_qty";
	public static final String $base_unit_cd = $inpt_schd + ".base_unit_cd";
	public static final String $inpt_loc_cd = $inpt_schd + ".inpt_loc_cd";
	public static final String $inpt_str_ln_cd = $inpt_schd + ".inpt_str_ln_cd";
	public static final String $gd_cd = $inpt_schd + ".gd_cd";
	public static final String $inpt_rsn_cd = $inpt_schd + ".inpt_rsn_cd";
	public static final String $lot_no = $inpt_schd + ".lot_no";
	public static final String $sublot_no = $inpt_schd + ".sublot_no";
	public static final String $sno1 = $inpt_schd + ".sno1";
	public static final String $sno1_null_flg = $inpt_schd + ".sno1_null_flg";
	public static final String $sno2 = $inpt_schd + ".sno2";
	public static final String $sno2_null_flg = $inpt_schd + ".sno2_null_flg";
	public static final String $sno3 = $inpt_schd + ".sno3";
	public static final String $sno3_null_flg = $inpt_schd + ".sno3_null_flg";
	public static final String $sno4 = $inpt_schd + ".sno4";
	public static final String $sno4_null_flg = $inpt_schd + ".sno4_null_flg";
	public static final String $alloc_sno1 = $inpt_schd + ".alloc_sno1";
	public static final String $alloc_sno2 = $inpt_schd + ".alloc_sno2";
	public static final String $alloc_sno3 = $inpt_schd + ".alloc_sno3";
	public static final String $alloc_sno4 = $inpt_schd + ".alloc_sno4";
	public static final String $bkf_typ = $inpt_schd + ".bkf_typ";
	public static final String $cont_inpt_qty = $inpt_schd + ".cont_inpt_qty";
	public static final String $cont_rqmt_qty = $inpt_schd + ".cont_rqmt_qty";
	public static final String $cont_fxd_rqmt_qty = $inpt_schd + ".cont_fxd_rqmt_qty";
	public static final String $cont_fctr_unit_cd = $inpt_schd + ".cont_fctr_unit_cd";
	public static final String $std_cont_fctr = $inpt_schd + ".std_cont_fctr";
	public static final String $act_cont_fctr = $inpt_schd + ".act_cont_fctr";
	public static final String $prov_typ = $inpt_schd + ".prov_typ";
	public static final String $par_inst_qty = $inpt_schd + ".par_inst_qty";
	public static final String $chd_inpt_qty = $inpt_schd + ".chd_inpt_qty";
	public static final String $chd_rqmt_qty = $inpt_schd + ".chd_rqmt_qty";
	public static final String $fxd_chd_rqmt_qty = $inpt_schd + ".fxd_chd_rqmt_qty";
	public static final String $main_itm_flg = $inpt_schd + ".main_itm_flg";
	public static final String $inst_lot_fix_flg = $inpt_schd + ".inst_lot_fix_flg";
	public static final String $disp_seq = $inpt_schd + ".disp_seq";
	public static final String $lot_mix_flg = $inpt_schd + ".lot_mix_flg";
	public static final String $sublot_mix_flg = $inpt_schd + ".sublot_mix_flg";
	public static final String $bom_memo1 = $inpt_schd + ".bom_memo1";
	public static final String $bom_memo2 = $inpt_schd + ".bom_memo2";
	public static final String $bom_memo3 = $inpt_schd + ".bom_memo3";
	public static final String $yield_calc_flg = $inpt_schd + ".yield_calc_flg";
	public static final String $alloc_flg = $inpt_schd + ".alloc_flg";
	public static final String $base_unit_alt_qty = $inpt_schd + ".base_unit_alt_qty";
	public static final String $alt_itm_fix_flg = $inpt_schd + ".alt_itm_fix_flg";
	public static final String $alt_itm_typ = $inpt_schd + ".alt_itm_typ";
	public static final String $alt_alloc_prio = $inpt_schd + ".alt_alloc_prio";
	public static final String $alt_itm_ratio = $inpt_schd + ".alt_itm_ratio";
	public static final String $alloc_ctl_typ = $inpt_schd + ".alloc_ctl_typ";
	public static final String $inpt_ctl_typ = $inpt_schd + ".inpt_ctl_typ";
	public static final String $in_offst_typ = $inpt_schd + ".in_offst_typ";
	public static final String $in_offst = $inpt_schd + ".in_offst";
	public static final String $bom_id_no = $inpt_schd + ".bom_id_no";
	public static final String $chd_itm_seq = $inpt_schd + ".chd_itm_seq";
	public static final String $recalc_grp = $inpt_schd + ".recalc_grp";
	public static final String $recalc_grp_seq = $inpt_schd + ".recalc_grp_seq";
	public static final String $can_flg = $inpt_schd + ".can_flg";
	public static final String $intr_rmrks = $inpt_schd + ".intr_rmrks";
	public static final String $inst_rpt_rmrks = $inpt_schd + ".inst_rpt_rmrks";
	public static final String $sub_char1 = $inpt_schd + ".sub_char1";
	public static final String $sub_char2 = $inpt_schd + ".sub_char2";
	public static final String $sub_char3 = $inpt_schd + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta hdr_mfg_sts_typ_META = createCommonMeta($hdr_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_lot_fix_flg_META = createCommonMeta($no_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_upd_flg_META = createCommonMeta($disp_seq_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_inst_err_flg_META = createCommonMeta($xfr_inst_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_outsrc_srv_flg_META = createCommonMeta($is_src_outsrc_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_header_inst_abort_flg_META = createCommonMeta($not_header_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rem_sub_char1_META = createCommonMeta($rem_sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_REM_SUB_CHAR1);
	public static final MCMeta rem_sub_char2_META = createCommonMeta($rem_sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_REM_SUB_CHAR2);
	public static final MCMeta rem_sub_char3_META = createCommonMeta($rem_sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_REM_SUB_CHAR3);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta diff_inpt_qty_META = createCommonMeta($diff_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta diff_fxd_qty_META = createCommonMeta($diff_fxd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_diff_inpt_qty_META = createCommonMeta($cont_diff_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_diff_fxd_qty_META = createCommonMeta($cont_diff_fxd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta call_alloc_srv_flg_META = createCommonMeta($call_alloc_srv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_srv_add_flg_META = createCommonMeta($alloc_srv_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta tmp_peg_no_META = createCommonMeta($tmp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta set_stk_str_ln_flg_META = createCommonMeta($set_stk_str_ln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_schd_META = createInnerRowMeta($inpt_schd, mcframe.serverMS.dbc.MST_INPT_SCHD_R.class);

	protected static final ConstMetaList<MfgInstTblReg_Upd05_DtlInptR> constMetas = new ConstMetaList<MfgInstTblReg_Upd05_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			data_crud_typ_META,
			mfg_mtd_typ_META,
			hdr_mfg_sts_typ_META,
			mfg_sts_typ_META,
			old_mfg_sts_typ_META,
			mfg_inst_unit_typ_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			vld_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			cont_fctr_flg_META,
			no_lot_fix_flg_META,
			disp_seq_upd_flg_META,
			xfr_inst_err_flg_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			is_src_outsrc_srv_flg_META,
			lst_reg_flg_META,
			not_frst_inst_can_flg_META,
			not_header_inst_abort_flg_META,
			rem_sub_char1_META,
			rem_sub_char2_META,
			rem_sub_char3_META,
			itm_ord_no_META,
			inst_dt_META,
			inst_usr_cd_META,
			inst_dpt_cd_META,
			diff_inpt_qty_META,
			diff_fxd_qty_META,
			cont_diff_inpt_qty_META,
			cont_diff_fxd_qty_META,
			call_alloc_srv_flg_META,
			alloc_srv_add_flg_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			tmp_peg_no_META,
			set_stk_str_ln_flg_META,
			is_src_batch_flg_META,
			inpt_schd_META
		},
		new String[][]{
			{
				"inpt_schd_no",
				"mfg_inst_no",
				"itm_mfg_inst_no",
				"oper_inst_no",
				"schd_tm",
				"alt_grp_cd",
				"alt_grp_seq",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"base_unit_inpt_qty",
				"base_unit_rqmt_qty",
				"base_unit_fxd_rqmt_qty",
				"base_unit_cd",
				"inpt_loc_cd",
				"inpt_str_ln_cd",
				"gd_cd",
				"inpt_rsn_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"alloc_sno1",
				"alloc_sno2",
				"alloc_sno3",
				"alloc_sno4",
				"bkf_typ",
				"cont_inpt_qty",
				"cont_rqmt_qty",
				"cont_fxd_rqmt_qty",
				"cont_fctr_unit_cd",
				"std_cont_fctr",
				"act_cont_fctr",
				"prov_typ",
				"par_inst_qty",
				"chd_inpt_qty",
				"chd_rqmt_qty",
				"fxd_chd_rqmt_qty",
				"main_itm_flg",
				"inst_lot_fix_flg",
				"disp_seq",
				"lot_mix_flg",
				"sublot_mix_flg",
				"bom_memo1",
				"bom_memo2",
				"bom_memo3",
				"yield_calc_flg",
				"alloc_flg",
				"base_unit_alt_qty",
				"alt_itm_fix_flg",
				"alt_itm_typ",
				"alt_alloc_prio",
				"alt_itm_ratio",
				"alloc_ctl_typ",
				"inpt_ctl_typ",
				"in_offst_typ",
				"in_offst",
				"bom_id_no",
				"chd_itm_seq",
				"recalc_grp",
				"recalc_grp_seq",
				"can_flg",
				"intr_rmrks",
				"inst_rpt_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$inpt_schd_no,
				$mfg_inst_no,
				$itm_mfg_inst_no,
				$oper_inst_no,
				$schd_tm,
				$alt_grp_cd,
				$alt_grp_seq,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$base_unit_inpt_qty,
				$base_unit_rqmt_qty,
				$base_unit_fxd_rqmt_qty,
				$base_unit_cd,
				$inpt_loc_cd,
				$inpt_str_ln_cd,
				$gd_cd,
				$inpt_rsn_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$alloc_sno1,
				$alloc_sno2,
				$alloc_sno3,
				$alloc_sno4,
				$bkf_typ,
				$cont_inpt_qty,
				$cont_rqmt_qty,
				$cont_fxd_rqmt_qty,
				$cont_fctr_unit_cd,
				$std_cont_fctr,
				$act_cont_fctr,
				$prov_typ,
				$par_inst_qty,
				$chd_inpt_qty,
				$chd_rqmt_qty,
				$fxd_chd_rqmt_qty,
				$main_itm_flg,
				$inst_lot_fix_flg,
				$disp_seq,
				$lot_mix_flg,
				$sublot_mix_flg,
				$bom_memo1,
				$bom_memo2,
				$bom_memo3,
				$yield_calc_flg,
				$alloc_flg,
				$base_unit_alt_qty,
				$alt_itm_fix_flg,
				$alt_itm_typ,
				$alt_alloc_prio,
				$alt_itm_ratio,
				$alloc_ctl_typ,
				$inpt_ctl_typ,
				$in_offst_typ,
				$in_offst,
				$bom_id_no,
				$chd_itm_seq,
				$recalc_grp,
				$recalc_grp_seq,
				$can_flg,
				$intr_rmrks,
				$inst_rpt_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected MfgInstTblReg_Upd05_DtlInptR_MC_A(ConstMetaList<? extends MfgInstTblReg_Upd05_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_DtlInptR clone() {
		return (MfgInstTblReg_Upd05_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_DtlInptR createInstance() {
		return (MfgInstTblReg_Upd05_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstTblReg_Upd05_DtlInptR getValues(String... names) {
		return (MfgInstTblReg_Upd05_DtlInptR) super.getValues(names);
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 2, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 3, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 3, $data_crud_typ, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 4, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 4, $mfg_mtd_typ, value);
	}


	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public String hdr_mfg_sts_typ() {
		return getConstString(offset + 5, $hdr_mfg_sts_typ);
	}

	/**
	 * Header mfg. status type ヘッダ製造状況区分.<p>
	 *
	 */
	public void hdr_mfg_sts_typ(String value) {
		setConstString(offset + 5, $hdr_mfg_sts_typ, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 6, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 6, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 7, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 7, $old_mfg_sts_typ, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 8, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 8, $mfg_inst_unit_typ, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 9, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 9, $lot_mng_typ, value);
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
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 11, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 11, $vld_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 12, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 12, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 13, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 13, $lot_seq, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 14, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 14, $cont_fctr_flg, value);
	}


	/**
	 * Without lot ロット指定無し.<p>
	 *
	 */
	public boolean no_lot_fix_flg() {
		return getConstBoolean(offset + 15, $no_lot_fix_flg);
	}

	/**
	 * Without lot ロット指定無し.<p>
	 *
	 */
	public void no_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 15, $no_lot_fix_flg, value);
	}


	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public boolean disp_seq_upd_flg() {
		return getConstBoolean(offset + 16, $disp_seq_upd_flg);
	}

	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public void disp_seq_upd_flg(boolean value) {
		setConstBoolean(offset + 16, $disp_seq_upd_flg, value);
	}


	/**
	 * Error for ordered movement/transport 移動・移送指図済エラー.<p>
	 *
	 */
	public boolean xfr_inst_err_flg() {
		return getConstBoolean(offset + 17, $xfr_inst_err_flg);
	}

	/**
	 * Error for ordered movement/transport 移動・移送指図済エラー.<p>
	 *
	 */
	public void xfr_inst_err_flg(boolean value) {
		setConstBoolean(offset + 17, $xfr_inst_err_flg, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 18, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 18, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 19, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 19, $old_inst_abort_flg, value);
	}


	/**
	 * Caller subcontractor mfg. order service 呼出元外注製造指図サービス.<p>
	 *
	 */
	public boolean is_src_outsrc_srv_flg() {
		return getConstBoolean(offset + 20, $is_src_outsrc_srv_flg);
	}

	/**
	 * Caller subcontractor mfg. order service 呼出元外注製造指図サービス.<p>
	 *
	 */
	public void is_src_outsrc_srv_flg(boolean value) {
		setConstBoolean(offset + 20, $is_src_outsrc_srv_flg, value);
	}


	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 21, $lst_reg_flg);
	}

	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 21, $lst_reg_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 22, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 22, $not_frst_inst_can_flg, value);
	}


	public boolean not_header_inst_abort_flg() {
		return getConstBoolean(offset + 23, $not_header_inst_abort_flg);
	}

	public void not_header_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 23, $not_header_inst_abort_flg, value);
	}


	/**
	 * Spare 1 (Remaining input result) 予備１（投入実績残）.<p>
	 *
	 */
	public String rem_sub_char1() {
		return getConstString(offset + 24, $rem_sub_char1);
	}

	/**
	 * Spare 1 (Remaining input result) 予備１（投入実績残）.<p>
	 *
	 */
	public void rem_sub_char1(String value) {
		setConstString(offset + 24, $rem_sub_char1, value);
	}


	/**
	 * Spare 2 (Remaining input result) 予備２（投入実績残）.<p>
	 *
	 */
	public String rem_sub_char2() {
		return getConstString(offset + 25, $rem_sub_char2);
	}

	/**
	 * Spare 2 (Remaining input result) 予備２（投入実績残）.<p>
	 *
	 */
	public void rem_sub_char2(String value) {
		setConstString(offset + 25, $rem_sub_char2, value);
	}


	/**
	 * Spare 3 (Remaining input result) 予備３（投入実績残）.<p>
	 *
	 */
	public String rem_sub_char3() {
		return getConstString(offset + 26, $rem_sub_char3);
	}

	/**
	 * Spare 3 (Remaining input result) 予備３（投入実績残）.<p>
	 *
	 */
	public void rem_sub_char3(String value) {
		setConstString(offset + 26, $rem_sub_char3, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 27, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 27, $itm_ord_no, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 28, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 28, $inst_dt, value);
	}


	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 29, $inst_usr_cd);
	}

	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 29, $inst_usr_cd, value);
	}


	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 30, $inst_dpt_cd);
	}

	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 30, $inst_dpt_cd, value);
	}


	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public MCNumber diff_inpt_qty() {
		return getConstNumber(offset + 31, $diff_inpt_qty);
	}

	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public void diff_inpt_qty(MCNumber value) {
		setConstNumber(offset + 31, $diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public void diff_inpt_qty(int value) {
		setConstNumber(offset + 31, $diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public void diff_inpt_qty(long value) {
		setConstNumber(offset + 31, $diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public void diff_inpt_qty(float value) {
		setConstNumber(offset + 31, $diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. 必要数量と投入数量の差分.<p>
	 *
	 */
	public void diff_inpt_qty(double value) {
		setConstNumber(offset + 31, $diff_inpt_qty, value);
	}


	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public MCNumber diff_fxd_qty() {
		return getConstNumber(offset + 32, $diff_fxd_qty);
	}

	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public void diff_fxd_qty(MCNumber value) {
		setConstNumber(offset + 32, $diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public void diff_fxd_qty(int value) {
		setConstNumber(offset + 32, $diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public void diff_fxd_qty(long value) {
		setConstNumber(offset + 32, $diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public void diff_fxd_qty(float value) {
		setConstNumber(offset + 32, $diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. 必要数量と固定必要数量の差分.<p>
	 *
	 */
	public void diff_fxd_qty(double value) {
		setConstNumber(offset + 32, $diff_fxd_qty, value);
	}


	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public MCNumber cont_diff_inpt_qty() {
		return getConstNumber(offset + 33, $cont_diff_inpt_qty);
	}

	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_inpt_qty(MCNumber value) {
		setConstNumber(offset + 33, $cont_diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_inpt_qty(int value) {
		setConstNumber(offset + 33, $cont_diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_inpt_qty(long value) {
		setConstNumber(offset + 33, $cont_diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_inpt_qty(float value) {
		setConstNumber(offset + 33, $cont_diff_inpt_qty, value);
	}

	/**
	 * Difference between required qty. and input qty. (active ingredient) 必要数量と投入数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_inpt_qty(double value) {
		setConstNumber(offset + 33, $cont_diff_inpt_qty, value);
	}


	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public MCNumber cont_diff_fxd_qty() {
		return getConstNumber(offset + 34, $cont_diff_fxd_qty);
	}

	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_fxd_qty(MCNumber value) {
		setConstNumber(offset + 34, $cont_diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_fxd_qty(int value) {
		setConstNumber(offset + 34, $cont_diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_fxd_qty(long value) {
		setConstNumber(offset + 34, $cont_diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_fxd_qty(float value) {
		setConstNumber(offset + 34, $cont_diff_fxd_qty, value);
	}

	/**
	 * Difference between required qty. and fixed required qty. (Active ingredient) 必要数量と固定必要数量の差分（有効成分）.<p>
	 *
	 */
	public void cont_diff_fxd_qty(double value) {
		setConstNumber(offset + 34, $cont_diff_fxd_qty, value);
	}


	/**
	 * Allocation service execution row 引当サービス実行行.<p>
	 *
	 */
	public boolean call_alloc_srv_flg() {
		return getConstBoolean(offset + 35, $call_alloc_srv_flg);
	}

	/**
	 * Allocation service execution row 引当サービス実行行.<p>
	 *
	 */
	public void call_alloc_srv_flg(boolean value) {
		setConstBoolean(offset + 35, $call_alloc_srv_flg, value);
	}


	/**
	 * Allocation service additional row 引当サービス追加行.<p>
	 *
	 */
	public boolean alloc_srv_add_flg() {
		return getConstBoolean(offset + 36, $alloc_srv_add_flg);
	}

	/**
	 * Allocation service additional row 引当サービス追加行.<p>
	 *
	 */
	public void alloc_srv_add_flg(boolean value) {
		setConstBoolean(offset + 36, $alloc_srv_add_flg, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 37, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 37, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 38, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 38, $base_unit_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 39, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 39, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 40, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 40, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber tmp_peg_no() {
		return getConstNumber(offset + 41, $tmp_peg_no);
	}

	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public void tmp_peg_no(MCNumber value) {
		setConstNumber(offset + 41, $tmp_peg_no, value);
	}

	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public void tmp_peg_no(int value) {
		setConstNumber(offset + 41, $tmp_peg_no, value);
	}

	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public void tmp_peg_no(long value) {
		setConstNumber(offset + 41, $tmp_peg_no, value);
	}

	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public void tmp_peg_no(float value) {
		setConstNumber(offset + 41, $tmp_peg_no, value);
	}

	/**
	 * Pegging No. for temporary use 一時使用紐付けＮＯ.<p>
	 *
	 */
	public void tmp_peg_no(double value) {
		setConstNumber(offset + 41, $tmp_peg_no, value);
	}


	/**
	 * Inventory rack/line setting flg. 在庫棚・ライン設定ＦＬＧ.<p>
	 *
	 */
	public boolean set_stk_str_ln_flg() {
		return getConstBoolean(offset + 42, $set_stk_str_ln_flg);
	}

	/**
	 * Inventory rack/line setting flg. 在庫棚・ライン設定ＦＬＧ.<p>
	 *
	 */
	public void set_stk_str_ln_flg(boolean value) {
		setConstBoolean(offset + 42, $set_stk_str_ln_flg, value);
	}


	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 43, $is_src_batch_flg);
	}

	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 43, $is_src_batch_flg, value);
	}


	public mcframe.serverMS.dbc.MST_INPT_SCHD_R inpt_schd(){
		return (mcframe.serverMS.dbc.MST_INPT_SCHD_R) getConstInnerRow(offset + 44, $inpt_schd);
	}
	
	public void inpt_schd(mcframe.serverMS.dbc.MST_INPT_SCHD_R row){
		setConstInnerRow(offset + 44, $inpt_schd, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return hdr_mfg_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			return rem_sub_char1();
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			return rem_sub_char2();
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			return rem_sub_char3();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			return diff_inpt_qty();
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			return diff_fxd_qty();
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			return cont_diff_inpt_qty();
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			return cont_diff_fxd_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			return tmp_peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			return no_lot_fix_flg();
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			return xfr_inst_err_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			return is_src_outsrc_srv_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			return not_header_inst_abort_flg();
		}
		if ($call_alloc_srv_flg.equalsIgnoreCase(name)) {
			return call_alloc_srv_flg();
		}
		if ($alloc_srv_add_flg.equalsIgnoreCase(name)) {
			return alloc_srv_add_flg();
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			return set_stk_str_ln_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			return hdr_mfg_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			return rem_sub_char1();
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			return rem_sub_char2();
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			return rem_sub_char3();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			return diff_inpt_qty();
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			return diff_fxd_qty();
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			return cont_diff_inpt_qty();
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			return cont_diff_fxd_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			return tmp_peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			return no_lot_fix_flg();
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			return xfr_inst_err_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			return is_src_outsrc_srv_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			return not_header_inst_abort_flg();
		}
		if ($call_alloc_srv_flg.equalsIgnoreCase(name)) {
			return call_alloc_srv_flg();
		}
		if ($alloc_srv_add_flg.equalsIgnoreCase(name)) {
			return alloc_srv_add_flg();
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			return set_stk_str_ln_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			hdr_mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			rem_sub_char1(value);
			return;
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			rem_sub_char2(value);
			return;
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			rem_sub_char3(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			no_lot_fix_flg(value);
			return;
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			xfr_inst_err_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			is_src_outsrc_srv_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			not_header_inst_abort_flg(value);
			return;
		}
		if ($call_alloc_srv_flg.equalsIgnoreCase(name)) {
			call_alloc_srv_flg(value);
			return;
		}
		if ($alloc_srv_add_flg.equalsIgnoreCase(name)) {
			alloc_srv_add_flg(value);
			return;
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			set_stk_str_ln_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($hdr_mfg_sts_typ.equalsIgnoreCase(name)) {
			hdr_mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($rem_sub_char1.equalsIgnoreCase(name)) {
			rem_sub_char1(value);
			return;
		}
		if ($rem_sub_char2.equalsIgnoreCase(name)) {
			rem_sub_char2(value);
			return;
		}
		if ($rem_sub_char3.equalsIgnoreCase(name)) {
			rem_sub_char3(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($diff_inpt_qty.equalsIgnoreCase(name)) {
			diff_inpt_qty(value);
			return;
		}
		if ($diff_fxd_qty.equalsIgnoreCase(name)) {
			diff_fxd_qty(value);
			return;
		}
		if ($cont_diff_inpt_qty.equalsIgnoreCase(name)) {
			cont_diff_inpt_qty(value);
			return;
		}
		if ($cont_diff_fxd_qty.equalsIgnoreCase(name)) {
			cont_diff_fxd_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($tmp_peg_no.equalsIgnoreCase(name)) {
			tmp_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($no_lot_fix_flg.equalsIgnoreCase(name)) {
			no_lot_fix_flg(value);
			return;
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($xfr_inst_err_flg.equalsIgnoreCase(name)) {
			xfr_inst_err_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($is_src_outsrc_srv_flg.equalsIgnoreCase(name)) {
			is_src_outsrc_srv_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		if ($not_header_inst_abort_flg.equalsIgnoreCase(name)) {
			not_header_inst_abort_flg(value);
			return;
		}
		if ($call_alloc_srv_flg.equalsIgnoreCase(name)) {
			call_alloc_srv_flg(value);
			return;
		}
		if ($alloc_srv_add_flg.equalsIgnoreCase(name)) {
			alloc_srv_add_flg(value);
			return;
		}
		if ($set_stk_str_ln_flg.equalsIgnoreCase(name)) {
			set_stk_str_ln_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($inpt_schd.equalsIgnoreCase(name)) {
			return inpt_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($inpt_schd.equalsIgnoreCase(name)) {
			inpt_schd(
				((MCContainerMeta) inpt_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_INPT_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return inpt_schd().inpt_schd_no();
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		inpt_schd().inpt_schd_no(value);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return inpt_schd().mfg_inst_no();
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		inpt_schd().mfg_inst_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return inpt_schd().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		inpt_schd().itm_mfg_inst_no(value);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return inpt_schd().oper_inst_no();
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		inpt_schd().oper_inst_no(value);
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public MCDate schd_tm() {
		return inpt_schd().schd_tm();
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		inpt_schd().schd_tm(value);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return inpt_schd().alt_grp_cd();
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		inpt_schd().alt_grp_cd(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return inpt_schd().alt_grp_seq();
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		inpt_schd().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		inpt_schd().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		inpt_schd().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		inpt_schd().alt_grp_seq(value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		inpt_schd().alt_grp_seq(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return inpt_schd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		inpt_schd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return inpt_schd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		inpt_schd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return inpt_schd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		inpt_schd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return inpt_schd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		inpt_schd().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return inpt_schd().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		inpt_schd().ver_no(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return inpt_schd().base_unit_inpt_qty();
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		inpt_schd().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		inpt_schd().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		inpt_schd().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		inpt_schd().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		inpt_schd().base_unit_inpt_qty(value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return inpt_schd().base_unit_rqmt_qty();
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		inpt_schd().base_unit_rqmt_qty(value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		inpt_schd().base_unit_rqmt_qty(value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		inpt_schd().base_unit_rqmt_qty(value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		inpt_schd().base_unit_rqmt_qty(value);
	}

	/**
	 * Base unit required qty. 基準単位必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		inpt_schd().base_unit_rqmt_qty(value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return inpt_schd().base_unit_fxd_rqmt_qty();
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		inpt_schd().base_unit_fxd_rqmt_qty(value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		inpt_schd().base_unit_fxd_rqmt_qty(value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		inpt_schd().base_unit_fxd_rqmt_qty(value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		inpt_schd().base_unit_fxd_rqmt_qty(value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		inpt_schd().base_unit_fxd_rqmt_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return inpt_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		inpt_schd().base_unit_cd(value);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return inpt_schd().inpt_loc_cd();
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		inpt_schd().inpt_loc_cd(value);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return inpt_schd().inpt_str_ln_cd();
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		inpt_schd().inpt_str_ln_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return inpt_schd().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		inpt_schd().gd_cd(value);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return inpt_schd().inpt_rsn_cd();
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		inpt_schd().inpt_rsn_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return inpt_schd().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		inpt_schd().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return inpt_schd().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		inpt_schd().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return inpt_schd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		inpt_schd().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return inpt_schd().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		inpt_schd().sno1_null_flg(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return inpt_schd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		inpt_schd().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return inpt_schd().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		inpt_schd().sno2_null_flg(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return inpt_schd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		inpt_schd().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return inpt_schd().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		inpt_schd().sno3_null_flg(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return inpt_schd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		inpt_schd().sno4(value);
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return inpt_schd().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		inpt_schd().sno4_null_flg(value);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return inpt_schd().alloc_sno1();
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		inpt_schd().alloc_sno1(value);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return inpt_schd().alloc_sno2();
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		inpt_schd().alloc_sno2(value);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return inpt_schd().alloc_sno3();
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		inpt_schd().alloc_sno3(value);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return inpt_schd().alloc_sno4();
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		inpt_schd().alloc_sno4(value);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return inpt_schd().bkf_typ();
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		inpt_schd().bkf_typ(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return inpt_schd().cont_inpt_qty();
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		inpt_schd().cont_inpt_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		inpt_schd().cont_inpt_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		inpt_schd().cont_inpt_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		inpt_schd().cont_inpt_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		inpt_schd().cont_inpt_qty(value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return inpt_schd().cont_rqmt_qty();
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		inpt_schd().cont_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		inpt_schd().cont_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		inpt_schd().cont_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		inpt_schd().cont_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Required qty.) 有効成分（必要数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		inpt_schd().cont_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return inpt_schd().cont_fxd_rqmt_qty();
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		inpt_schd().cont_fxd_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		inpt_schd().cont_fxd_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		inpt_schd().cont_fxd_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		inpt_schd().cont_fxd_rqmt_qty(value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		inpt_schd().cont_fxd_rqmt_qty(value);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return inpt_schd().cont_fctr_unit_cd();
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		inpt_schd().cont_fctr_unit_cd(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return inpt_schd().std_cont_fctr();
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		inpt_schd().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		inpt_schd().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		inpt_schd().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		inpt_schd().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		inpt_schd().std_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return inpt_schd().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		inpt_schd().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		inpt_schd().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		inpt_schd().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		inpt_schd().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		inpt_schd().act_cont_fctr(value);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return inpt_schd().prov_typ();
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		inpt_schd().prov_typ(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCNumber par_inst_qty() {
		return inpt_schd().par_inst_qty();
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(MCNumber value) {
		inpt_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(int value) {
		inpt_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(long value) {
		inpt_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(float value) {
		inpt_schd().par_inst_qty(value);
	}

	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public void par_inst_qty(double value) {
		inpt_schd().par_inst_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public MCNumber chd_inpt_qty() {
		return inpt_schd().chd_inpt_qty();
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(MCNumber value) {
		inpt_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(int value) {
		inpt_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(long value) {
		inpt_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(float value) {
		inpt_schd().chd_inpt_qty(value);
	}

	/**
	 * Child input qty. 子投入数量.<p>
	 *
	 */
	public void chd_inpt_qty(double value) {
		inpt_schd().chd_inpt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return inpt_schd().chd_rqmt_qty();
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		inpt_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		inpt_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		inpt_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		inpt_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		inpt_schd().chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return inpt_schd().fxd_chd_rqmt_qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		inpt_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		inpt_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		inpt_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		inpt_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		inpt_schd().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Main raw material flg. 主原料ＦＬＧ.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return inpt_schd().main_itm_flg();
	}

	/**
	 * Main raw material flg. 主原料ＦＬＧ.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		inpt_schd().main_itm_flg(value);
	}

	/**
	 * Lot specification at order flg. 指図時ロット指定ＦＬＧ.<p>
	 *
	 */
	public boolean inst_lot_fix_flg() {
		return inpt_schd().inst_lot_fix_flg();
	}

	/**
	 * Lot specification at order flg. 指図時ロット指定ＦＬＧ.<p>
	 *
	 */
	public void inst_lot_fix_flg(boolean value) {
		inpt_schd().inst_lot_fix_flg(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return inpt_schd().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		inpt_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		inpt_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		inpt_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		inpt_schd().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		inpt_schd().disp_seq(value);
	}

	/**
	 * Lot mixed flg. ロット混在ＦＬＧ.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return inpt_schd().lot_mix_flg();
	}

	/**
	 * Lot mixed flg. ロット混在ＦＬＧ.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		inpt_schd().lot_mix_flg(value);
	}

	/**
	 * Sublot mixed flg. サブロット混在ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return inpt_schd().sublot_mix_flg();
	}

	/**
	 * Sublot mixed flg. サブロット混在ＦＬＧ.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		inpt_schd().sublot_mix_flg(value);
	}

	/**
	 * BOM memo 1 ＢＯＭメモ１.<p>
	 *
	 */
	public String bom_memo1() {
		return inpt_schd().bom_memo1();
	}

	/**
	 * BOM memo 1 ＢＯＭメモ１.<p>
	 *
	 */
	public void bom_memo1(String value) {
		inpt_schd().bom_memo1(value);
	}

	/**
	 * BOM memo 2 ＢＯＭメモ２.<p>
	 *
	 */
	public String bom_memo2() {
		return inpt_schd().bom_memo2();
	}

	/**
	 * BOM memo 2 ＢＯＭメモ２.<p>
	 *
	 */
	public void bom_memo2(String value) {
		inpt_schd().bom_memo2(value);
	}

	/**
	 * BOM memo 3 ＢＯＭメモ３.<p>
	 *
	 */
	public String bom_memo3() {
		return inpt_schd().bom_memo3();
	}

	/**
	 * BOM memo 3 ＢＯＭメモ３.<p>
	 *
	 */
	public void bom_memo3(String value) {
		inpt_schd().bom_memo3(value);
	}

	/**
	 * Yield calculation flg. 収率計算用ＦＬＧ.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return inpt_schd().yield_calc_flg();
	}

	/**
	 * Yield calculation flg. 収率計算用ＦＬＧ.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		inpt_schd().yield_calc_flg(value);
	}

	/**
	 * Allocation flg. 引当ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_flg() {
		return inpt_schd().alloc_flg();
	}

	/**
	 * Allocation flg. 引当ＦＬＧ.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		inpt_schd().alloc_flg(value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public MCNumber base_unit_alt_qty() {
		return inpt_schd().base_unit_alt_qty();
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(MCNumber value) {
		inpt_schd().base_unit_alt_qty(value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(int value) {
		inpt_schd().base_unit_alt_qty(value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(long value) {
		inpt_schd().base_unit_alt_qty(value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(float value) {
		inpt_schd().base_unit_alt_qty(value);
	}

	/**
	 * Base unit alternative sources qty. 基準単位代替元数量.<p>
	 *
	 */
	public void base_unit_alt_qty(double value) {
		inpt_schd().base_unit_alt_qty(value);
	}

	/**
	 * Alternative item specification flg. 代替品目指定ＦＬＧ.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return inpt_schd().alt_itm_fix_flg();
	}

	/**
	 * Alternative item specification flg. 代替品目指定ＦＬＧ.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		inpt_schd().alt_itm_fix_flg(value);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return inpt_schd().alt_itm_typ();
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		inpt_schd().alt_itm_typ(value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return inpt_schd().alt_alloc_prio();
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		inpt_schd().alt_alloc_prio(value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		inpt_schd().alt_alloc_prio(value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		inpt_schd().alt_alloc_prio(value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		inpt_schd().alt_alloc_prio(value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		inpt_schd().alt_alloc_prio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return inpt_schd().alt_itm_ratio();
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		inpt_schd().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		inpt_schd().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		inpt_schd().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		inpt_schd().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		inpt_schd().alt_itm_ratio(value);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return inpt_schd().alloc_ctl_typ();
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		inpt_schd().alloc_ctl_typ(value);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return inpt_schd().inpt_ctl_typ();
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		inpt_schd().inpt_ctl_typ(value);
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public String in_offst_typ() {
		return inpt_schd().in_offst_typ();
	}

	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public void in_offst_typ(String value) {
		inpt_schd().in_offst_typ(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCNumber in_offst() {
		return inpt_schd().in_offst();
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(MCNumber value) {
		inpt_schd().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(int value) {
		inpt_schd().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(long value) {
		inpt_schd().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(float value) {
		inpt_schd().in_offst(value);
	}

	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public void in_offst(double value) {
		inpt_schd().in_offst(value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public MCNumber bom_id_no() {
		return inpt_schd().bom_id_no();
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(MCNumber value) {
		inpt_schd().bom_id_no(value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(int value) {
		inpt_schd().bom_id_no(value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(long value) {
		inpt_schd().bom_id_no(value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(float value) {
		inpt_schd().bom_id_no(value);
	}

	/**
	 * In-operation BOM identification number 工程内ＢＯＭ識別番号.<p>
	 *
	 */
	public void bom_id_no(double value) {
		inpt_schd().bom_id_no(value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public MCNumber chd_itm_seq() {
		return inpt_schd().chd_itm_seq();
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(MCNumber value) {
		inpt_schd().chd_itm_seq(value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(int value) {
		inpt_schd().chd_itm_seq(value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(long value) {
		inpt_schd().chd_itm_seq(value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(float value) {
		inpt_schd().chd_itm_seq(value);
	}

	/**
	 * Allow same child item sequence number 同一子品目連番.<p>
	 *
	 */
	public void chd_itm_seq(double value) {
		inpt_schd().chd_itm_seq(value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return inpt_schd().recalc_grp();
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		inpt_schd().recalc_grp(value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(int value) {
		inpt_schd().recalc_grp(value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(long value) {
		inpt_schd().recalc_grp(value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(float value) {
		inpt_schd().recalc_grp(value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(double value) {
		inpt_schd().recalc_grp(value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return inpt_schd().recalc_grp_seq();
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		inpt_schd().recalc_grp_seq(value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		inpt_schd().recalc_grp_seq(value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		inpt_schd().recalc_grp_seq(value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		inpt_schd().recalc_grp_seq(value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		inpt_schd().recalc_grp_seq(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return inpt_schd().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		inpt_schd().can_flg(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return inpt_schd().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		inpt_schd().intr_rmrks(value);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return inpt_schd().inst_rpt_rmrks();
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		inpt_schd().inst_rpt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return inpt_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		inpt_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return inpt_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		inpt_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return inpt_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		inpt_schd().sub_char3(value);
	}

}

