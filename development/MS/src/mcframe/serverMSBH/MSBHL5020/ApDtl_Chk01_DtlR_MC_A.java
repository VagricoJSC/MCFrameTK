package mcframe.serverMSBH.MSBHL5020;

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
 * ブロック"ApDtl_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ApDtl_Chk01_DtlR_MC_A extends MCConstRow {

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
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public static final String $can_purc_act_d_seq = "can_purc_act_d_seq";
	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public static final String $can_purc_act_seq = "can_purc_act_seq";
	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public static final String $old_purc_act_d_seq = "old_purc_act_d_seq";
	/**
	 * AP cancellation dept. cd. 取消債務部門ＣＤ.<p>
	 *
	 */
	public static final String $can_ap_dpt_cd = "can_ap_dpt_cd";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Cancellation recording month 取消計上年月.<p>
	 *
	 */
	public static final String $can_ac_ym = "can_ac_ym";
	/**
	 * Payment cancellation start date 取消支払起算日.<p>
	 *
	 */
	public static final String $can_pay_basis_dt = "can_pay_basis_dt";
	/**
	 * Free of charge 無償.<p>
	 *
	 */
	public static final String $ncv_flg = "ncv_flg";
	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public static final String $accpt_dfct_flg = "accpt_dfct_flg";
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public static final String $ap_appl_schd_no = "ap_appl_schd_no";
	/**
	 * Transfer destination AP details No. 振替先買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $to_ap_d_no = "to_ap_d_no";
	public static final String $apd = "apd";

	public static final String $ap_d_no = $apd + ".ap_d_no";
	public static final String $po_no = $apd + ".po_no";
	public static final String $po_d_no = $apd + ".po_d_no";
	public static final String $purc_act_d_no = $apd + ".purc_act_d_no";
	public static final String $purc_act_d_seq = $apd + ".purc_act_d_seq";
	public static final String $purc_act_no = $apd + ".purc_act_no";
	public static final String $purc_act_seq = $apd + ".purc_act_seq";
	public static final String $purc_act_rev = $apd + ".purc_act_rev";
	public static final String $bp_dlv_slip_no = $apd + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $apd + ".bp_dlv_slip_d_no";
	public static final String $rcpt_iv_no = $apd + ".rcpt_iv_no";
	public static final String $rcpt_iv_mng_no = $apd + ".rcpt_iv_mng_no";
	public static final String $ap_typ = $apd + ".ap_typ";
	public static final String $trd_cd = $apd + ".trd_cd";
	public static final String $trd_ptn_typ = $apd + ".trd_ptn_typ";
	public static final String $slip_sts_typ = $apd + ".slip_sts_typ";
	public static final String $sppl_cd = $apd + ".sppl_cd";
	public static final String $asppl_cd = $apd + ".asppl_cd";
	public static final String $bsppl_cd = $apd + ".bsppl_cd";
	public static final String $bsppl_dpt_cd = $apd + ".bsppl_dpt_cd";
	public static final String $ap_dpt_cd = $apd + ".ap_dpt_cd";
	public static final String $purc_dpt_cd = $apd + ".purc_dpt_cd";
	public static final String $purc_usr_cd = $apd + ".purc_usr_cd";
	public static final String $wrk_no = $apd + ".wrk_no";
	public static final String $sno1 = $apd + ".sno1";
	public static final String $sno2 = $apd + ".sno2";
	public static final String $sno3 = $apd + ".sno3";
	public static final String $sno4 = $apd + ".sno4";
	public static final String $act_dt = $apd + ".act_dt";
	public static final String $ac_dt = $apd + ".ac_dt";
	public static final String $ac_ym = $apd + ".ac_ym";
	public static final String $bsppl_cl_dt = $apd + ".bsppl_cl_dt";
	public static final String $bsppl_cl_day = $apd + ".bsppl_cl_day";
	public static final String $pay_crryovr_times = $apd + ".pay_crryovr_times";
	public static final String $pay_basis_dt = $apd + ".pay_basis_dt";
	public static final String $pay_schd_dt = $apd + ".pay_schd_dt";
	public static final String $itm_cd = $apd + ".itm_cd";
	public static final String $itm_sub1 = $apd + ".itm_sub1";
	public static final String $itm_sub2 = $apd + ".itm_sub2";
	public static final String $itm_sub3 = $apd + ".itm_sub3";
	public static final String $itm_nm = $apd + ".itm_nm";
	public static final String $sppl_itm_cd = $apd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $apd + ".sppl_itm_nm";
	public static final String $sundry_itm_flg = $apd + ".sundry_itm_flg";
	public static final String $trd_unit_cd = $apd + ".trd_unit_cd";
	public static final String $trd_unit_qty = $apd + ".trd_unit_qty";
	public static final String $base_unit_cd = $apd + ".base_unit_cd";
	public static final String $base_unit_qty = $apd + ".base_unit_qty";
	public static final String $tax_cd = $apd + ".tax_cd";
	public static final String $interim_flg = $apd + ".interim_flg";
	public static final String $xrate = $apd + ".xrate";
	public static final String $trd_cur_cd = $apd + ".trd_cur_cd";
	public static final String $trd_cur_upri = $apd + ".trd_cur_upri";
	public static final String $trd_cur_amt = $apd + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $apd + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $apd + ".trd_cur_dscnt_amt";
	public static final String $base_cur_upri = $apd + ".base_cur_upri";
	public static final String $base_cur_amt = $apd + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $apd + ".base_cur_tax_amt";
	public static final String $base_cur_dscnt_amt = $apd + ".base_cur_dscnt_amt";
	public static final String $wtax_rate = $apd + ".wtax_rate";
	public static final String $wtax_amt = $apd + ".wtax_amt";
	public static final String $pay_mtd_typ = $apd + ".pay_mtd_typ";
	public static final String $crryovr_ap_d_no = $apd + ".crryovr_ap_d_no";
	public static final String $crryovr_src_ap_d_no = $apd + ".crryovr_src_ap_d_no";
	public static final String $base_purc_ac_dt = $apd + ".base_purc_ac_dt";
	public static final String $intr_rmrks = $apd + ".intr_rmrks";
	public static final String $pay_chk_no = $apd + ".pay_chk_no";
	public static final String $pay_chk_mng_no = $apd + ".pay_chk_mng_no";
	public static final String $chk_flg = $apd + ".chk_flg";
	public static final String $crryovr_flg = $apd + ".crryovr_flg";
	public static final String $valid_flg = $apd + ".valid_flg";
	public static final String $sub_char1 = $apd + ".sub_char1";
	public static final String $sub_char2 = $apd + ".sub_char2";
	public static final String $sub_char3 = $apd + ".sub_char3";
	public static final String $trd_cur_proc_upri = $apd + ".trd_cur_proc_upri";
	public static final String $trd_cur_proc_amt = $apd + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_upri = $apd + ".trd_cur_onr_prov_upri";
	public static final String $trd_cur_onr_prov_amt = $apd + ".trd_cur_onr_prov_amt";
	public static final String $base_cur_proc_upri = $apd + ".base_cur_proc_upri";
	public static final String $base_cur_proc_amt = $apd + ".base_cur_proc_amt";
	public static final String $base_cur_onr_prov_upri = $apd + ".base_cur_onr_prov_upri";
	public static final String $base_cur_onr_prov_amt = $apd + ".base_cur_onr_prov_amt";
	public static final String $repurc_obli_flg = $apd + ".repurc_obli_flg";
	public static final String $outsrc_flg = $apd + ".outsrc_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta can_purc_act_d_seq_META = createCommonMeta($can_purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta can_purc_act_seq_META = createCommonMeta($can_purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta old_purc_act_d_seq_META = createCommonMeta($old_purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta can_ap_dpt_cd_META = createCommonMeta($can_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_ym_META = createCommonMeta($can_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta can_pay_basis_dt_META = createCommonMeta($can_pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ncv_flg_META = createCommonMeta($ncv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta accpt_dfct_flg_META = createCommonMeta($accpt_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_appl_schd_no_META = createCommonMeta($ap_appl_schd_no, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta to_ap_d_no_META = createCommonMeta($to_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta apd_META = createInnerRowMeta($apd, mcframe.serverMS.dbc.MST_AP_D_R.class);

	protected static final ConstMetaList<ApDtl_Chk01_DtlR> constMetas = new ConstMetaList<ApDtl_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			can_purc_act_d_seq_META,
			can_purc_act_seq_META,
			old_purc_act_d_seq_META,
			can_ap_dpt_cd_META,
			can_ac_dt_META,
			can_ac_ym_META,
			can_pay_basis_dt_META,
			ncv_flg_META,
			accpt_dfct_flg_META,
			base_dt_META,
			ap_appl_schd_no_META,
			to_ap_d_no_META,
			apd_META
		},
		new String[][]{
			{
				"ap_d_no",
				"po_no",
				"po_d_no",
				"purc_act_d_no",
				"purc_act_d_seq",
				"purc_act_no",
				"purc_act_seq",
				"purc_act_rev",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"rcpt_iv_no",
				"rcpt_iv_mng_no",
				"ap_typ",
				"trd_cd",
				"trd_ptn_typ",
				"slip_sts_typ",
				"sppl_cd",
				"asppl_cd",
				"bsppl_cd",
				"bsppl_dpt_cd",
				"ap_dpt_cd",
				"purc_dpt_cd",
				"purc_usr_cd",
				"wrk_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"act_dt",
				"ac_dt",
				"ac_ym",
				"bsppl_cl_dt",
				"bsppl_cl_day",
				"pay_crryovr_times",
				"pay_basis_dt",
				"pay_schd_dt",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"sundry_itm_flg",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"tax_cd",
				"interim_flg",
				"xrate",
				"trd_cur_cd",
				"trd_cur_upri",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_dscnt_amt",
				"wtax_rate",
				"wtax_amt",
				"pay_mtd_typ",
				"crryovr_ap_d_no",
				"crryovr_src_ap_d_no",
				"base_purc_ac_dt",
				"intr_rmrks",
				"pay_chk_no",
				"pay_chk_mng_no",
				"chk_flg",
				"crryovr_flg",
				"valid_flg",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"trd_cur_proc_upri",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_upri",
				"trd_cur_onr_prov_amt",
				"base_cur_proc_upri",
				"base_cur_proc_amt",
				"base_cur_onr_prov_upri",
				"base_cur_onr_prov_amt",
				"repurc_obli_flg",
				"outsrc_flg"
			},
			{
				$ap_d_no,
				$po_no,
				$po_d_no,
				$purc_act_d_no,
				$purc_act_d_seq,
				$purc_act_no,
				$purc_act_seq,
				$purc_act_rev,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$rcpt_iv_no,
				$rcpt_iv_mng_no,
				$ap_typ,
				$trd_cd,
				$trd_ptn_typ,
				$slip_sts_typ,
				$sppl_cd,
				$asppl_cd,
				$bsppl_cd,
				$bsppl_dpt_cd,
				$ap_dpt_cd,
				$purc_dpt_cd,
				$purc_usr_cd,
				$wrk_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$act_dt,
				$ac_dt,
				$ac_ym,
				$bsppl_cl_dt,
				$bsppl_cl_day,
				$pay_crryovr_times,
				$pay_basis_dt,
				$pay_schd_dt,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$sundry_itm_flg,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$tax_cd,
				$interim_flg,
				$xrate,
				$trd_cur_cd,
				$trd_cur_upri,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_dscnt_amt,
				$wtax_rate,
				$wtax_amt,
				$pay_mtd_typ,
				$crryovr_ap_d_no,
				$crryovr_src_ap_d_no,
				$base_purc_ac_dt,
				$intr_rmrks,
				$pay_chk_no,
				$pay_chk_mng_no,
				$chk_flg,
				$crryovr_flg,
				$valid_flg,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$trd_cur_proc_upri,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_upri,
				$trd_cur_onr_prov_amt,
				$base_cur_proc_upri,
				$base_cur_proc_amt,
				$base_cur_onr_prov_upri,
				$base_cur_onr_prov_amt,
				$repurc_obli_flg,
				$outsrc_flg
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
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
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
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected ApDtl_Chk01_DtlR_MC_A(ConstMetaList<? extends ApDtl_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApDtl_Chk01_DtlR clone() {
		return (ApDtl_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApDtl_Chk01_DtlR createInstance() {
		return (ApDtl_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApDtl_Chk01_DtlR getValues(String... names) {
		return (ApDtl_Chk01_DtlR) super.getValues(names);
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
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public MCNumber can_purc_act_d_seq() {
		return getConstNumber(offset + 3, $can_purc_act_d_seq);
	}

	/**
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public void can_purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 3, $can_purc_act_d_seq, value);
	}

	/**
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public void can_purc_act_d_seq(int value) {
		setConstNumber(offset + 3, $can_purc_act_d_seq, value);
	}

	/**
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public void can_purc_act_d_seq(long value) {
		setConstNumber(offset + 3, $can_purc_act_d_seq, value);
	}

	/**
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public void can_purc_act_d_seq(float value) {
		setConstNumber(offset + 3, $can_purc_act_d_seq, value);
	}

	/**
	 * Purchase cancellation result details sequence number 取消仕入実績明細連番.<p>
	 *
	 */
	public void can_purc_act_d_seq(double value) {
		setConstNumber(offset + 3, $can_purc_act_d_seq, value);
	}


	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public MCNumber can_purc_act_seq() {
		return getConstNumber(offset + 4, $can_purc_act_seq);
	}

	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public void can_purc_act_seq(MCNumber value) {
		setConstNumber(offset + 4, $can_purc_act_seq, value);
	}

	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public void can_purc_act_seq(int value) {
		setConstNumber(offset + 4, $can_purc_act_seq, value);
	}

	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public void can_purc_act_seq(long value) {
		setConstNumber(offset + 4, $can_purc_act_seq, value);
	}

	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public void can_purc_act_seq(float value) {
		setConstNumber(offset + 4, $can_purc_act_seq, value);
	}

	/**
	 * Purchase cancellation result sequence number 取消仕入実績連番.<p>
	 *
	 */
	public void can_purc_act_seq(double value) {
		setConstNumber(offset + 4, $can_purc_act_seq, value);
	}


	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public MCNumber old_purc_act_d_seq() {
		return getConstNumber(offset + 5, $old_purc_act_d_seq);
	}

	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public void old_purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 5, $old_purc_act_d_seq, value);
	}

	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public void old_purc_act_d_seq(int value) {
		setConstNumber(offset + 5, $old_purc_act_d_seq, value);
	}

	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public void old_purc_act_d_seq(long value) {
		setConstNumber(offset + 5, $old_purc_act_d_seq, value);
	}

	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public void old_purc_act_d_seq(float value) {
		setConstNumber(offset + 5, $old_purc_act_d_seq, value);
	}

	/**
	 * Original slip purchase result details sequence number 元伝仕入実績明細連番.<p>
	 *
	 */
	public void old_purc_act_d_seq(double value) {
		setConstNumber(offset + 5, $old_purc_act_d_seq, value);
	}


	/**
	 * AP cancellation dept. cd. 取消債務部門ＣＤ.<p>
	 *
	 */
	public String can_ap_dpt_cd() {
		return getConstString(offset + 6, $can_ap_dpt_cd);
	}

	/**
	 * AP cancellation dept. cd. 取消債務部門ＣＤ.<p>
	 *
	 */
	public void can_ap_dpt_cd(String value) {
		setConstString(offset + 6, $can_ap_dpt_cd, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 7, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 7, $can_ac_dt, value);
	}


	/**
	 * Cancellation recording month 取消計上年月.<p>
	 *
	 */
	public MCDate can_ac_ym() {
		return getConstDate(offset + 8, $can_ac_ym);
	}

	/**
	 * Cancellation recording month 取消計上年月.<p>
	 *
	 */
	public void can_ac_ym(MCDate value) {
		setConstDate(offset + 8, $can_ac_ym, value);
	}


	/**
	 * Payment cancellation start date 取消支払起算日.<p>
	 *
	 */
	public MCDate can_pay_basis_dt() {
		return getConstDate(offset + 9, $can_pay_basis_dt);
	}

	/**
	 * Payment cancellation start date 取消支払起算日.<p>
	 *
	 */
	public void can_pay_basis_dt(MCDate value) {
		setConstDate(offset + 9, $can_pay_basis_dt, value);
	}


	/**
	 * Free of charge 無償.<p>
	 *
	 */
	public boolean ncv_flg() {
		return getConstBoolean(offset + 10, $ncv_flg);
	}

	/**
	 * Free of charge 無償.<p>
	 *
	 */
	public void ncv_flg(boolean value) {
		setConstBoolean(offset + 10, $ncv_flg, value);
	}


	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return getConstBoolean(offset + 11, $accpt_dfct_flg);
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 11, $accpt_dfct_flg, value);
	}


	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 12, $base_dt);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 12, $base_dt, value);
	}


	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public String ap_appl_schd_no() {
		return getConstString(offset + 13, $ap_appl_schd_no);
	}

	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public void ap_appl_schd_no(String value) {
		setConstString(offset + 13, $ap_appl_schd_no, value);
	}


	/**
	 * Transfer destination AP details No. 振替先買掛明細ＮＯ.<p>
	 *
	 */
	public String to_ap_d_no() {
		return getConstString(offset + 14, $to_ap_d_no);
	}

	/**
	 * Transfer destination AP details No. 振替先買掛明細ＮＯ.<p>
	 *
	 */
	public void to_ap_d_no(String value) {
		setConstString(offset + 14, $to_ap_d_no, value);
	}


	public mcframe.serverMS.dbc.MST_AP_D_R apd(){
		return (mcframe.serverMS.dbc.MST_AP_D_R) getConstInnerRow(offset + 15, $apd);
	}
	
	public void apd(mcframe.serverMS.dbc.MST_AP_D_R row){
		setConstInnerRow(offset + 15, $apd, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($can_ap_dpt_cd.equalsIgnoreCase(name)) {
			return can_ap_dpt_cd();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
		}
		if ($to_ap_d_no.equalsIgnoreCase(name)) {
			return to_ap_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			return can_purc_act_d_seq();
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			return can_purc_act_seq();
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			return old_purc_act_d_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			return can_ac_ym();
		}
		if ($can_pay_basis_dt.equalsIgnoreCase(name)) {
			return can_pay_basis_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			return ncv_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($can_ap_dpt_cd.equalsIgnoreCase(name)) {
			return can_ap_dpt_cd();
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			return ap_appl_schd_no();
		}
		if ($to_ap_d_no.equalsIgnoreCase(name)) {
			return to_ap_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			return can_purc_act_d_seq();
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			return can_purc_act_seq();
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			return old_purc_act_d_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			return can_ac_ym();
		}
		if ($can_pay_basis_dt.equalsIgnoreCase(name)) {
			return can_pay_basis_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			return ncv_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($can_ap_dpt_cd.equalsIgnoreCase(name)) {
			can_ap_dpt_cd(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
			return;
		}
		if ($to_ap_d_no.equalsIgnoreCase(name)) {
			to_ap_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			can_ac_ym(value);
			return;
		}
		if ($can_pay_basis_dt.equalsIgnoreCase(name)) {
			can_pay_basis_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			ncv_flg(value);
			return;
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($can_ap_dpt_cd.equalsIgnoreCase(name)) {
			can_ap_dpt_cd(value);
			return;
		}
		if ($ap_appl_schd_no.equalsIgnoreCase(name)) {
			ap_appl_schd_no(value);
			return;
		}
		if ($to_ap_d_no.equalsIgnoreCase(name)) {
			to_ap_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($can_purc_act_d_seq.equalsIgnoreCase(name)) {
			can_purc_act_d_seq(value);
			return;
		}
		if ($can_purc_act_seq.equalsIgnoreCase(name)) {
			can_purc_act_seq(value);
			return;
		}
		if ($old_purc_act_d_seq.equalsIgnoreCase(name)) {
			old_purc_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($can_ac_ym.equalsIgnoreCase(name)) {
			can_ac_ym(value);
			return;
		}
		if ($can_pay_basis_dt.equalsIgnoreCase(name)) {
			can_pay_basis_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			ncv_flg(value);
			return;
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($apd.equalsIgnoreCase(name)) {
			return apd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($apd.equalsIgnoreCase(name)) {
			apd(
				((MCContainerMeta) apd_META).castInnerRow(mcframe.serverMS.dbc.MST_AP_D_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return apd().ap_d_no();
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		apd().ap_d_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return apd().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		apd().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return apd().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		apd().po_d_no(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return apd().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		apd().purc_act_d_no(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return apd().purc_act_d_seq();
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		apd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		apd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		apd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		apd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		apd().purc_act_d_seq(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return apd().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		apd().purc_act_no(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return apd().purc_act_seq();
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		apd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		apd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		apd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		apd().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		apd().purc_act_seq(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return apd().purc_act_rev();
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		apd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		apd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		apd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		apd().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		apd().purc_act_rev(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return apd().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		apd().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return apd().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		apd().bp_dlv_slip_d_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return apd().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		apd().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return apd().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		apd().rcpt_iv_mng_no(value);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return apd().ap_typ();
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		apd().ap_typ(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return apd().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		apd().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return apd().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		apd().trd_ptn_typ(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return apd().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		apd().slip_sts_typ(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return apd().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		apd().sppl_cd(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return apd().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		apd().asppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return apd().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		apd().bsppl_cd(value);
	}

	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return apd().bsppl_dpt_cd();
	}

	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		apd().bsppl_dpt_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return apd().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		apd().ap_dpt_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return apd().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		apd().purc_dpt_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return apd().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		apd().purc_usr_cd(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return apd().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		apd().wrk_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return apd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		apd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return apd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		apd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return apd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		apd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return apd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		apd().sno4(value);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return apd().act_dt();
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		apd().act_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return apd().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		apd().ac_dt(value);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return apd().ac_ym();
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		apd().ac_ym(value);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return apd().bsppl_cl_dt();
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		apd().bsppl_cl_dt(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return apd().bsppl_cl_day();
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		apd().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		apd().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		apd().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		apd().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		apd().bsppl_cl_day(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return apd().pay_crryovr_times();
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		apd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		apd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		apd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		apd().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		apd().pay_crryovr_times(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return apd().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		apd().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return apd().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		apd().pay_schd_dt(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return apd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		apd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return apd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		apd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return apd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		apd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return apd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		apd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return apd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		apd().itm_nm(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return apd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		apd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return apd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		apd().sppl_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return apd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		apd().sundry_itm_flg(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return apd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		apd().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return apd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		apd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		apd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		apd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		apd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		apd().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return apd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		apd().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return apd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		apd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		apd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		apd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		apd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		apd().base_unit_qty(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return apd().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		apd().tax_cd(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return apd().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		apd().interim_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return apd().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		apd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		apd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		apd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		apd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		apd().xrate(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return apd().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		apd().trd_cur_cd(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return apd().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		apd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		apd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		apd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		apd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		apd().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return apd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		apd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		apd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		apd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		apd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		apd().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return apd().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		apd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		apd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		apd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		apd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		apd().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return apd().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		apd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		apd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		apd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		apd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		apd().trd_cur_dscnt_amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return apd().base_cur_upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		apd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		apd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		apd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		apd().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		apd().base_cur_upri(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return apd().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		apd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		apd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		apd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		apd().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		apd().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return apd().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		apd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		apd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		apd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		apd().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		apd().base_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return apd().base_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		apd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		apd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		apd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		apd().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		apd().base_cur_dscnt_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return apd().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		apd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		apd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		apd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		apd().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		apd().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return apd().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		apd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		apd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		apd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		apd().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		apd().wtax_amt(value);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return apd().pay_mtd_typ();
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		apd().pay_mtd_typ(value);
	}

	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_ap_d_no() {
		return apd().crryovr_ap_d_no();
	}

	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_ap_d_no(String value) {
		apd().crryovr_ap_d_no(value);
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_src_ap_d_no() {
		return apd().crryovr_src_ap_d_no();
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_src_ap_d_no(String value) {
		apd().crryovr_src_ap_d_no(value);
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return apd().base_purc_ac_dt();
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		apd().base_purc_ac_dt(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return apd().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		apd().intr_rmrks(value);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return apd().pay_chk_no();
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		apd().pay_chk_no(value);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return apd().pay_chk_mng_no();
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		apd().pay_chk_mng_no(value);
	}

	/**
	 * Collated 照合済.<p>
	 *
	 */
	public boolean chk_flg() {
		return apd().chk_flg();
	}

	/**
	 * Collated 照合済.<p>
	 *
	 */
	public void chk_flg(boolean value) {
		apd().chk_flg(value);
	}

	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public boolean crryovr_flg() {
		return apd().crryovr_flg();
	}

	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public void crryovr_flg(boolean value) {
		apd().crryovr_flg(value);
	}

	/**
	 * Valid 有効.<p>
	 *
	 */
	public boolean valid_flg() {
		return apd().valid_flg();
	}

	/**
	 * Valid 有効.<p>
	 *
	 */
	public void valid_flg(boolean value) {
		apd().valid_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return apd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		apd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return apd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		apd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return apd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		apd().sub_char3(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return apd().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		apd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		apd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		apd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		apd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		apd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return apd().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		apd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		apd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		apd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		apd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		apd().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return apd().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		apd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		apd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		apd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		apd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		apd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return apd().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		apd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		apd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		apd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		apd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		apd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return apd().base_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		apd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		apd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		apd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		apd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		apd().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return apd().base_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		apd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		apd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		apd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		apd().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		apd().base_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return apd().base_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		apd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		apd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		apd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		apd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		apd().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return apd().base_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		apd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		apd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		apd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		apd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		apd().base_cur_onr_prov_amt(value);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return apd().repurc_obli_flg();
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		apd().repurc_obli_flg(value);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return apd().outsrc_flg();
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		apd().outsrc_flg(value);
	}

}

