package mcframe.clientMSBC.MSBCP1100;

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
 * ブロック"DtlOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlOperR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	public static final String $st_act_tm_p = "st_act_tm_p";
	public static final String $end_act_tm_p = "end_act_tm_p";
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public static final String $not_cmpl_flg = "not_cmpl_flg";
	public static final String $oper_unit_act_qty_p = "oper_unit_act_qty_p";
	public static final String $oper_unit_schd_qty_p = "oper_unit_schd_qty_p";
	public static final String $oper_unit_rem_qty_p = "oper_unit_rem_qty_p";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * To recalculate 再計算対象.<p>
	 *
	 */
	public static final String $oper_re_calc_flg = "oper_re_calc_flg";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public static final String $oper_str_ln_tgt_flg = "oper_str_ln_tgt_flg";
	public static final String $oper_str_ln_p = "oper_str_ln_p";
	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public static final String $oper_yield = "oper_yield";
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $oper_act_intr_rmrks = "oper_act_intr_rmrks";
	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public static final String $oper_act_rpt_rmrks = "oper_act_rpt_rmrks";
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public static final String $oper_act_sub_char1 = "oper_act_sub_char1";
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public static final String $oper_act_sub_char2 = "oper_act_sub_char2";
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public static final String $oper_act_sub_char3 = "oper_act_sub_char3";
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public static final String $bkf_upd_flg = "bkf_upd_flg";
	/**
	 * Backflush not applied バックフラッシュ未反映.<p>
	 *
	 */
	public static final String $bkf_not_ref_flg = "bkf_not_ref_flg";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_upd_calc_flg = "wk_cost_upd_calc_flg";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public static final String $st_schd_hm = "st_schd_hm";
	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public static final String $end_schd_dt = "end_schd_dt";
	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public static final String $end_schd_hm = "end_schd_hm";
	public static final String $base_unit_act_qty_p = "base_unit_act_qty_p";
	public static final String $base_unit_schd_qty_p = "base_unit_schd_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
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
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public static final String $wip_rate = "wip_rate";
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_oper_act_no = "ext_oper_act_no";
	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public static final String $if_auto_reg_flg = "if_auto_reg_flg";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public static final String $mfg_sts_typ_nm = "mfg_sts_typ_nm";

	public static final String $st_act_dt = $st_act_tm_p + ".ymd";
	public static final String $st_act_hm = $st_act_tm_p + ".hm";
	public static final String $end_act_dt = $end_act_tm_p + ".ymd";
	public static final String $end_act_hm = $end_act_tm_p + ".hm";
	public static final String $oper_unit_act_qty = $oper_unit_act_qty_p + ".qty";
	public static final String $oper_unit_schd_qty = $oper_unit_schd_qty_p + ".qty";
	public static final String $oper_unit_rem_qty = $oper_unit_rem_qty_p + ".qty";
	public static final String $oper_str_ln_cd = $oper_str_ln_p + ".str_ln_cd";
	public static final String $oper_str_ln_nm = $oper_str_ln_p + ".str_ln_nm";
	public static final String $oper_str_ln_cd_none_flg = $oper_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $base_unit_act_qty = $base_unit_act_qty_p + ".qty";
	public static final String $base_unit_schd_qty = $base_unit_schd_qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta st_act_tm_p_META = createInnerRowMeta($st_act_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_act_tm_p_META = createInnerRowMeta($end_act_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta not_cmpl_flg_META = createCommonMeta($not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_unit_act_qty_p_META = createInnerRowMeta($oper_unit_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_schd_qty_p_META = createInnerRowMeta($oper_unit_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_rem_qty_p_META = createInnerRowMeta($oper_unit_rem_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_re_calc_flg_META = createCommonMeta($oper_re_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_tgt_flg_META = createCommonMeta($oper_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_str_ln_p_META = createInnerRowMeta($oper_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta oper_yield_META = createCommonMeta($oper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_act_intr_rmrks_META = createCommonMeta($oper_act_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_INTR_RMRKS);
	public static final MCMeta oper_act_rpt_rmrks_META = createCommonMeta($oper_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_RPT_RMRKS);
	public static final MCMeta oper_act_sub_char1_META = createCommonMeta($oper_act_sub_char1, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR1);
	public static final MCMeta oper_act_sub_char2_META = createCommonMeta($oper_act_sub_char2, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR2);
	public static final MCMeta oper_act_sub_char3_META = createCommonMeta($oper_act_sub_char3, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR3);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_upd_flg_META = createCommonMeta($bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_not_ref_flg_META = createCommonMeta($bkf_not_ref_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_upd_calc_flg_META = createCommonMeta($wk_cost_upd_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta inst_rpt_rmrks_META = createCommonMeta($inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_INST_INTR_RMRKS);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_META = createCommonMeta($st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_META = createCommonMeta($end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta base_unit_act_qty_p_META = createInnerRowMeta($base_unit_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_schd_qty_p_META = createInnerRowMeta($base_unit_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta wip_rate_META = createCommonMeta($wip_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_oper_act_no_META = createCommonMeta($ext_oper_act_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ACT_NO);
	public static final MCMeta if_auto_reg_flg_META = createCommonMeta($if_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_sts_typ_nm_META = createCommonMeta($mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);

	protected static final ConstMetaList<DtlOperR> constMetas = new ConstMetaList<DtlOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			peg_no_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			st_act_tm_p_META,
			end_act_tm_p_META,
			not_cmpl_flg_META,
			oper_unit_act_qty_p_META,
			oper_unit_schd_qty_p_META,
			oper_unit_rem_qty_p_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_conv_rnd_typ_META,
			oper_unit_dec_place_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_re_calc_flg_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_tgt_flg_META,
			oper_str_ln_p_META,
			oper_yield_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			disp_seq_META,
			oper_act_intr_rmrks_META,
			oper_act_rpt_rmrks_META,
			oper_act_sub_char1_META,
			oper_act_sub_char2_META,
			oper_act_sub_char3_META,
			bkf_flg_META,
			bkf_upd_flg_META,
			bkf_not_ref_flg_META,
			wk_cost_calc_flg_META,
			wk_cost_upd_calc_flg_META,
			usr_cd_META,
			usr_nm_META,
			inst_rpt_rmrks_META,
			st_schd_dt_META,
			st_schd_hm_META,
			end_schd_dt_META,
			end_schd_hm_META,
			base_unit_act_qty_p_META,
			base_unit_schd_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			oper_inst_no_META,
			oper_act_no_META,
			wip_rate_META,
			mes_id_META,
			data_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_oper_act_no_META,
			if_auto_reg_flg_META,
			mfg_sts_typ_META,
			mfg_sts_typ_nm_META
		},
		new String[][]{
			{
				"st_act_dt",
				"st_act_hm",
				"end_act_dt",
				"end_act_hm",
				"oper_unit_act_qty",
				"oper_unit_schd_qty",
				"oper_unit_rem_qty",
				"oper_str_ln_cd",
				"oper_str_ln_nm",
				"oper_str_ln_cd_none_flg",
				"base_unit_act_qty",
				"base_unit_schd_qty"
			},
			{
				$st_act_dt,
				$st_act_hm,
				$end_act_dt,
				$end_act_hm,
				$oper_unit_act_qty,
				$oper_unit_schd_qty,
				$oper_unit_rem_qty,
				$oper_str_ln_cd,
				$oper_str_ln_nm,
				$oper_str_ln_cd_none_flg,
				$base_unit_act_qty,
				$base_unit_schd_qty
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$oper_str_ln_tgt_flg, "STR_LN"},	// oper_str_ln_tgt_flg
				{$oper_yield, "YIELD"},	// oper_yield
				{$oper_lower_yield, "YIELD"},	// oper_lower_yield
				{$oper_std_yield, "YIELD"},	// oper_std_yield
				{$oper_upper_yield, "YIELD"},	// oper_upper_yield
				{$st_schd_hm, "TM"},	// st_schd_hm
				{$end_schd_hm, "TM"}	// end_schd_hm
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
	protected DtlOperR_MC_A(ConstMetaList<? extends DtlOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlOperR clone() {
		return (DtlOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlOperR createInstance() {
		return (DtlOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlOperR getValues(String... names) {
		return (DtlOperR) super.getValues(names);
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
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation row No. 工程行ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 2, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 2, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 3, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 3, $oper_nm, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 4, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 4, $oper_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_act_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 5, $st_act_tm_p);
	}
	
	public void st_act_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 5, $st_act_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_act_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 6, $end_act_tm_p);
	}
	
	public void end_act_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 6, $end_act_tm_p, row);
	}


	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public boolean not_cmpl_flg() {
		return getConstBoolean(offset + 7, $not_cmpl_flg);
	}

	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public void not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 7, $not_cmpl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 8, $oper_unit_act_qty_p);
	}
	
	public void oper_unit_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 8, $oper_unit_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 9, $oper_unit_schd_qty_p);
	}
	
	public void oper_unit_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 9, $oper_unit_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_rem_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $oper_unit_rem_qty_p);
	}
	
	public void oper_unit_rem_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $oper_unit_rem_qty_p, row);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 11, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 11, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 11, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 11, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 11, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 11, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 12, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 12, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 12, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 12, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 12, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 12, $oper_conv_qty, value);
	}


	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 13, $oper_unit_conv_rnd_typ);
	}

	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 13, $oper_unit_conv_rnd_typ, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 14, $oper_unit_dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 14, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 14, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 14, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 14, $oper_unit_dec_place, value);
	}


	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 15, $oper_unit_cd);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 15, $oper_unit_cd, value);
	}


	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 16, $oper_unit_nm);
	}

	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 16, $oper_unit_nm, value);
	}


	/**
	 * To recalculate 再計算対象.<p>
	 *
	 */
	public boolean oper_re_calc_flg() {
		return getConstBoolean(offset + 17, $oper_re_calc_flg);
	}

	/**
	 * To recalculate 再計算対象.<p>
	 *
	 */
	public void oper_re_calc_flg(boolean value) {
		setConstBoolean(offset + 17, $oper_re_calc_flg, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 18, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 18, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 19, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 19, $oper_loc_nm, value);
	}


	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public boolean oper_str_ln_tgt_flg() {
		return getConstBoolean(offset + 20, $oper_str_ln_tgt_flg);
	}

	/**
	 * For operation location rack/line 工程場所棚・ライン対象.<p>
	 *
	 */
	public void oper_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 20, $oper_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR oper_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 21, $oper_str_ln_p);
	}
	
	public void oper_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 21, $oper_str_ln_p, row);
	}


	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public MCNumber oper_yield() {
		return getConstNumber(offset + 22, $oper_yield);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(MCNumber value) {
		setConstNumber(offset + 22, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(int value) {
		setConstNumber(offset + 22, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(long value) {
		setConstNumber(offset + 22, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(float value) {
		setConstNumber(offset + 22, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(double value) {
		setConstNumber(offset + 22, $oper_yield, value);
	}


	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 23, $oper_lower_yield);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 23, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 23, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 23, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 23, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 23, $oper_lower_yield, value);
	}


	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 24, $oper_std_yield);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 24, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 24, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 24, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 24, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 24, $oper_std_yield, value);
	}


	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 25, $oper_upper_yield);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 25, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 25, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 25, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 25, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 25, $oper_upper_yield, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 26, $disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 26, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 26, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 26, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 26, $disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 26, $disp_seq, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String oper_act_intr_rmrks() {
		return getConstString(offset + 27, $oper_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void oper_act_intr_rmrks(String value) {
		setConstString(offset + 27, $oper_act_intr_rmrks, value);
	}


	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String oper_act_rpt_rmrks() {
		return getConstString(offset + 28, $oper_act_rpt_rmrks);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void oper_act_rpt_rmrks(String value) {
		setConstString(offset + 28, $oper_act_rpt_rmrks, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_act_sub_char1() {
		return getConstString(offset + 29, $oper_act_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_act_sub_char1(String value) {
		setConstString(offset + 29, $oper_act_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_act_sub_char2() {
		return getConstString(offset + 30, $oper_act_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_act_sub_char2(String value) {
		setConstString(offset + 30, $oper_act_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_act_sub_char3() {
		return getConstString(offset + 31, $oper_act_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_act_sub_char3(String value) {
		setConstString(offset + 31, $oper_act_sub_char3, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 32, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 32, $bkf_flg, value);
	}


	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_upd_flg() {
		return getConstBoolean(offset + 33, $bkf_upd_flg);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 33, $bkf_upd_flg, value);
	}


	/**
	 * Backflush not applied バックフラッシュ未反映.<p>
	 *
	 */
	public boolean bkf_not_ref_flg() {
		return getConstBoolean(offset + 34, $bkf_not_ref_flg);
	}

	/**
	 * Backflush not applied バックフラッシュ未反映.<p>
	 *
	 */
	public void bkf_not_ref_flg(boolean value) {
		setConstBoolean(offset + 34, $bkf_not_ref_flg, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 35, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 35, $wk_cost_calc_flg, value);
	}


	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_upd_calc_flg() {
		return getConstBoolean(offset + 36, $wk_cost_upd_calc_flg);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_upd_calc_flg(boolean value) {
		setConstBoolean(offset + 36, $wk_cost_upd_calc_flg, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 37, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 37, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 38, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 38, $usr_nm, value);
	}


	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 39, $inst_rpt_rmrks);
	}

	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 39, $inst_rpt_rmrks, value);
	}


	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 40, $st_schd_dt);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 40, $st_schd_dt, value);
	}


	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return getConstDate(offset + 41, $st_schd_hm);
	}

	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		setConstDate(offset + 41, $st_schd_hm, value);
	}


	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 42, $end_schd_dt);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 42, $end_schd_dt, value);
	}


	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return getConstDate(offset + 43, $end_schd_hm);
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		setConstDate(offset + 43, $end_schd_hm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $base_unit_act_qty_p);
	}
	
	public void base_unit_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $base_unit_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 45, $base_unit_schd_qty_p);
	}
	
	public void base_unit_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 45, $base_unit_schd_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 46, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 46, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 47, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 47, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 48, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 48, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 48, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 48, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 48, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 48, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 49, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 49, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 50, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 50, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 51, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 51, $oper_act_no, value);
	}


	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public MCNumber wip_rate() {
		return getConstNumber(offset + 52, $wip_rate);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(MCNumber value) {
		setConstNumber(offset + 52, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(int value) {
		setConstNumber(offset + 52, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(long value) {
		setConstNumber(offset + 52, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(float value) {
		setConstNumber(offset + 52, $wip_rate, value);
	}

	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public void wip_rate(double value) {
		setConstNumber(offset + 52, $wip_rate, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 53, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 53, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 54, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 54, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 54, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 54, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 54, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 54, $data_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 55, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 55, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 56, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 56, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 57, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 57, $ext_sys_nm, value);
	}


	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public String ext_oper_act_no() {
		return getConstString(offset + 58, $ext_oper_act_no);
	}

	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public void ext_oper_act_no(String value) {
		setConstString(offset + 58, $ext_oper_act_no, value);
	}


	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return getConstBoolean(offset + 59, $if_auto_reg_flg);
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 59, $if_auto_reg_flg, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 60, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 60, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public String mfg_sts_typ_nm() {
		return getConstString(offset + 61, $mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public void mfg_sts_typ_nm(String value) {
		setConstString(offset + 61, $mfg_sts_typ_nm, value);
	}


	public String getString(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		if ($oper_re_calc_flg.equalsIgnoreCase(name)) {
			return oper_re_calc_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
		}
		if ($bkf_not_ref_flg.equalsIgnoreCase(name)) {
			return bkf_not_ref_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_upd_calc_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			return ext_oper_act_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mfg_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			return wip_rate();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		if ($oper_re_calc_flg.equalsIgnoreCase(name)) {
			return oper_re_calc_flg();
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_tgt_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
		}
		if ($bkf_not_ref_flg.equalsIgnoreCase(name)) {
			return bkf_not_ref_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_upd_calc_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			return if_auto_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
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
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		if ($oper_re_calc_flg.equalsIgnoreCase(name)) {
			oper_re_calc_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
			return;
		}
		if ($bkf_not_ref_flg.equalsIgnoreCase(name)) {
			bkf_not_ref_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_upd_calc_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
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
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_oper_act_no.equalsIgnoreCase(name)) {
			ext_oper_act_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			mfg_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($wip_rate.equalsIgnoreCase(name)) {
			wip_rate(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		if ($oper_re_calc_flg.equalsIgnoreCase(name)) {
			oper_re_calc_flg(value);
			return;
		}
		if ($oper_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			oper_str_ln_tgt_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
			return;
		}
		if ($bkf_not_ref_flg.equalsIgnoreCase(name)) {
			bkf_not_ref_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_upd_calc_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		if ($if_auto_reg_flg.equalsIgnoreCase(name)) {
			if_auto_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($st_act_tm_p.equalsIgnoreCase(name)) {
			return st_act_tm_p();
		}
		if ($end_act_tm_p.equalsIgnoreCase(name)) {
			return end_act_tm_p();
		}
		if ($oper_unit_act_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_act_qty_p();
		}
		if ($oper_unit_schd_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_schd_qty_p();
		}
		if ($oper_unit_rem_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_rem_qty_p();
		}
		if ($oper_str_ln_p.equalsIgnoreCase(name)) {
			return oper_str_ln_p();
		}
		if ($base_unit_act_qty_p.equalsIgnoreCase(name)) {
			return base_unit_act_qty_p();
		}
		if ($base_unit_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_schd_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($st_act_tm_p.equalsIgnoreCase(name)) {
			st_act_tm_p(
				((MCContainerMeta) st_act_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_act_tm_p.equalsIgnoreCase(name)) {
			end_act_tm_p(
				((MCContainerMeta) end_act_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($oper_unit_act_qty_p.equalsIgnoreCase(name)) {
			oper_unit_act_qty_p(
				((MCContainerMeta) oper_unit_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_schd_qty_p.equalsIgnoreCase(name)) {
			oper_unit_schd_qty_p(
				((MCContainerMeta) oper_unit_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_rem_qty_p.equalsIgnoreCase(name)) {
			oper_unit_rem_qty_p(
				((MCContainerMeta) oper_unit_rem_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_str_ln_p.equalsIgnoreCase(name)) {
			oper_str_ln_p(
				((MCContainerMeta) oper_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($base_unit_act_qty_p.equalsIgnoreCase(name)) {
			base_unit_act_qty_p(
				((MCContainerMeta) base_unit_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_schd_qty_p(
				((MCContainerMeta) base_unit_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate st_act_dt() {
		return st_act_tm_p().ymd();
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void st_act_dt(MCDate value) {
		st_act_tm_p().ymd(value);
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public MCDate st_act_hm() {
		return st_act_tm_p().hm();
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public void st_act_hm(MCDate value) {
		st_act_tm_p().hm(value);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate end_act_dt() {
		return end_act_tm_p().ymd();
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void end_act_dt(MCDate value) {
		end_act_tm_p().ymd(value);
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public MCDate end_act_hm() {
		return end_act_tm_p().hm();
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public void end_act_hm(MCDate value) {
		end_act_tm_p().hm(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public MCNumber oper_unit_act_qty() {
		return oper_unit_act_qty_p().qty();
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(MCNumber value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(int value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(long value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(float value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(double value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public MCNumber oper_unit_schd_qty() {
		return oper_unit_schd_qty_p().qty();
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(MCNumber value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(int value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(long value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(float value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(double value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public MCNumber oper_unit_rem_qty() {
		return oper_unit_rem_qty_p().qty();
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(MCNumber value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(int value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(long value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(float value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation unit remaining qty. 工程単位残数量.<p>
	 *
	 */
	public void oper_unit_rem_qty(double value) {
		oper_unit_rem_qty_p().qty(value);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return oper_str_ln_p().str_ln_cd();
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		oper_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return oper_str_ln_p().str_ln_nm();
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		oper_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public boolean oper_str_ln_cd_none_flg() {
		return oper_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public void oper_str_ln_cd_none_flg(boolean value) {
		oper_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public MCNumber base_unit_act_qty() {
		return base_unit_act_qty_p().qty();
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(MCNumber value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(int value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(long value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(float value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(double value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return base_unit_schd_qty_p().qty();
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		base_unit_schd_qty_p().qty(value);
	}

}

