package mcframe.serverMSBE.MSBEL5930;

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
 * ブロック"ArrAct_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrAct_DtlR_MC_A extends MCConstRow {

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $arr_act = "arr_act";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public static final String $arr_dt = "arr_dt";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Temporary purchase invoice No. 仮受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $temp_rcpt_iv_no = "temp_rcpt_iv_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	/**
	 * Issue 発行.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Lot numbering row ロット発番行.<p>
	 *
	 */
	public static final String $lot_issue_row_flg = "lot_issue_row_flg";
	/**
	 * Execute purchase result check 仕入実績チェック実行.<p>
	 *
	 */
	public static final String $purc_act_chk_flg = "purc_act_chk_flg";
	/**
	 * Perform sales return check execution 売上返品チェック実行.<p>
	 *
	 */
	public static final String $sls_ret_chk_flg = "sls_ret_chk_flg";
	/**
	 * Execute subcontracting mfg. result check 外注製造実績チェック実行.<p>
	 *
	 */
	public static final String $outsrc_act_chk_flg = "outsrc_act_chk_flg";
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public static final String $temp_ap_flg = "temp_ap_flg";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $arr_act_no = $arr_act + ".arr_act_no";
	public static final String $arr_act_rev = $arr_act + ".arr_act_rev";
	public static final String $arr_schd_no = $arr_act + ".arr_schd_no";
	public static final String $trd_cd = $arr_act + ".trd_cd";
	public static final String $trd_ptn_typ = $arr_act + ".trd_ptn_typ";
	public static final String $purc_act_io_no = $arr_act + ".purc_act_io_no";
	public static final String $lg_grp_cd = $arr_act + ".lg_grp_cd";
	public static final String $wg_cd = $arr_act + ".wg_cd";
	public static final String $itm_cd = $arr_act + ".itm_cd";
	public static final String $itm_sub1 = $arr_act + ".itm_sub1";
	public static final String $itm_sub2 = $arr_act + ".itm_sub2";
	public static final String $itm_sub3 = $arr_act + ".itm_sub3";
	public static final String $itm_nm = $arr_act + ".itm_nm";
	public static final String $rcpt_iv_itm_nm = $arr_act + ".rcpt_iv_itm_nm";
	public static final String $sundry_itm_flg = $arr_act + ".sundry_itm_flg";
	public static final String $purc_id_typ = $arr_act + ".purc_id_typ";
	public static final String $stk_mng_typ = $arr_act + ".stk_mng_typ";
	public static final String $sno1 = $arr_act + ".sno1";
	public static final String $sno1_mng_typ = $arr_act + ".sno1_mng_typ";
	public static final String $sno2 = $arr_act + ".sno2";
	public static final String $sno2_mng_typ = $arr_act + ".sno2_mng_typ";
	public static final String $sno3 = $arr_act + ".sno3";
	public static final String $sno3_mng_typ = $arr_act + ".sno3_mng_typ";
	public static final String $sno4 = $arr_act + ".sno4";
	public static final String $sno4_mng_typ = $arr_act + ".sno4_mng_typ";
	public static final String $lot_no = $arr_act + ".lot_no";
	public static final String $sublot_no = $arr_act + ".sublot_no";
	public static final String $ver_no = $arr_act + ".ver_no";
	public static final String $stk_arrv_bp_cd = $arr_act + ".stk_arrv_bp_cd";
	public static final String $gd_cd = $arr_act + ".gd_cd";
	public static final String $quality_typ = $arr_act + ".quality_typ";
	public static final String $stk_insp_typ = $arr_act + ".stk_insp_typ";
	public static final String $stk_id_typ = $arr_act + ".stk_id_typ";
	public static final String $stk_bp_cd = $arr_act + ".stk_bp_cd";
	public static final String $sppl_itm_cd = $arr_act + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $arr_act + ".sppl_itm_nm";
	public static final String $rqst_dpt_cd = $arr_act + ".rqst_dpt_cd";
	public static final String $rqst_usr_cd = $arr_act + ".rqst_usr_cd";
	public static final String $arr_dpt_cd = $arr_act + ".arr_dpt_cd";
	public static final String $arr_usr_cd = $arr_act + ".arr_usr_cd";
	public static final String $cst_cd = $arr_act + ".cst_cd";
	public static final String $sret_fr_cd = $arr_act + ".sret_fr_cd";
	public static final String $sppl_cd = $arr_act + ".sppl_cd";
	public static final String $ret_loc_cd = $arr_act + ".ret_loc_cd";
	public static final String $ret_str_ln_cd = $arr_act + ".ret_str_ln_cd";
	public static final String $ret_gd_cd = $arr_act + ".ret_gd_cd";
	public static final String $maker_cd = $arr_act + ".maker_cd";
	public static final String $bp_lot_no = $arr_act + ".bp_lot_no";
	public static final String $bp_dlv_slip_no = $arr_act + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $arr_act + ".bp_dlv_slip_d_no";
	public static final String $ship_fr_valid_dt = $arr_act + ".ship_fr_valid_dt";
	public static final String $arr_loc_cd = $arr_act + ".arr_loc_cd";
	public static final String $str_ln_cd = $arr_act + ".str_ln_cd";
	public static final String $arr_tm = $arr_act + ".arr_tm";
	public static final String $ac_dt = $arr_act + ".ac_dt";
	public static final String $trd_unit_qty = $arr_act + ".trd_unit_qty";
	public static final String $trd_unit_cd = $arr_act + ".trd_unit_cd";
	public static final String $base_unit_qty = $arr_act + ".base_unit_qty";
	public static final String $base_unit_cd = $arr_act + ".base_unit_cd";
	public static final String $trd_cur_amt = $arr_act + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $arr_act + ".trd_cur_tax_amt";
	public static final String $base_cur_amt = $arr_act + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $arr_act + ".base_cur_tax_amt";
	public static final String $ptax_cur_amt = $arr_act + ".ptax_cur_amt";
	public static final String $ptax_cur_tax_amt = $arr_act + ".ptax_cur_tax_amt";
	public static final String $purc_cont_qty = $arr_act + ".purc_cont_qty";
	public static final String $rsn_cd = $arr_act + ".rsn_cd";
	public static final String $bd_dpt_cd = $arr_act + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $arr_act + ".bd_wg_cd";
	public static final String $sync_flg = $arr_act + ".sync_flg";
	public static final String $edi_flg = $arr_act + ".edi_flg";
	public static final String $edi_bp_dlv_slip_no = $arr_act + ".edi_bp_dlv_slip_no";
	public static final String $edi_bp_dlv_slip_d_no = $arr_act + ".edi_bp_dlv_slip_d_no";
	public static final String $dlv_slip_no = $arr_act + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $arr_act + ".dlv_slip_d_no";
	public static final String $insp_cnt_rmrks = $arr_act + ".insp_cnt_rmrks";
	public static final String $intr_rmrks = $arr_act + ".intr_rmrks";
	public static final String $trd_rmrks = $arr_act + ".trd_rmrks";
	public static final String $trd_d_rmrks = $arr_act + ".trd_d_rmrks";
	public static final String $sub_char1 = $arr_act + ".sub_char1";
	public static final String $sub_char2 = $arr_act + ".sub_char2";
	public static final String $sub_char3 = $arr_act + ".sub_char3";
	public static final String $pack_unit_qty = $arr_act + ".pack_unit_qty";
	public static final String $pack_unit_cd = $arr_act + ".pack_unit_cd";
	public static final String $can_flg = $arr_act + ".can_flg";
	public static final String $wms_flg = $arr_act + ".wms_flg";
	public static final String $ext_sys_cd = $arr_act + ".ext_sys_cd";
	public static final String $ext_arr_act_no = $arr_act + ".ext_arr_act_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta arr_act_META = createInnerRowMeta($arr_act, mcframe.serverMS.dbc.MST_ARR_ACT_R.class);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_dt_META = createCommonMeta($arr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta temp_rcpt_iv_no_META = createCommonMeta($temp_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_issue_row_flg_META = createCommonMeta($lot_issue_row_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_chk_flg_META = createCommonMeta($purc_act_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_ret_chk_flg_META = createCommonMeta($sls_ret_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_act_chk_flg_META = createCommonMeta($outsrc_act_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_flg_META = createCommonMeta($temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ArrAct_DtlR> constMetas = new ConstMetaList<ArrAct_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			arr_act_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			can_ac_dt_META,
			arr_dt_META,
			arr_pr_no_META,
			rcpt_iv_no_META,
			temp_rcpt_iv_no_META,
			iv_no_META,
			po_no_META,
			po_d_no_META,
			prov_act_no_META,
			arr_ptn_typ_META,
			abort_flg_META,
			crt_lot_flg_META,
			same_lot_flg_META,
			io_schd_pr_no_META,
			prov_typ_META,
			prov_basis_typ_META,
			mfg_inst_no_META,
			pre_outsrc_act_flg_META,
			prnt_flg_META,
			lot_issue_row_flg_META,
			purc_act_chk_flg_META,
			sls_ret_chk_flg_META,
			outsrc_act_chk_flg_META,
			temp_ap_flg_META,
			err_flg_META
		},
		new String[][]{
			{
				"arr_act_no",
				"arr_act_rev",
				"arr_schd_no",
				"trd_cd",
				"trd_ptn_typ",
				"purc_act_io_no",
				"lg_grp_cd",
				"wg_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"rcpt_iv_itm_nm",
				"sundry_itm_flg",
				"purc_id_typ",
				"stk_mng_typ",
				"sno1",
				"sno1_mng_typ",
				"sno2",
				"sno2_mng_typ",
				"sno3",
				"sno3_mng_typ",
				"sno4",
				"sno4_mng_typ",
				"lot_no",
				"sublot_no",
				"ver_no",
				"stk_arrv_bp_cd",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"rqst_dpt_cd",
				"rqst_usr_cd",
				"arr_dpt_cd",
				"arr_usr_cd",
				"cst_cd",
				"sret_fr_cd",
				"sppl_cd",
				"ret_loc_cd",
				"ret_str_ln_cd",
				"ret_gd_cd",
				"maker_cd",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"ship_fr_valid_dt",
				"arr_loc_cd",
				"str_ln_cd",
				"arr_tm",
				"ac_dt",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"purc_cont_qty",
				"rsn_cd",
				"bd_dpt_cd",
				"bd_wg_cd",
				"sync_flg",
				"edi_flg",
				"edi_bp_dlv_slip_no",
				"edi_bp_dlv_slip_d_no",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"insp_cnt_rmrks",
				"intr_rmrks",
				"trd_rmrks",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"pack_unit_qty",
				"pack_unit_cd",
				"can_flg",
				"wms_flg",
				"ext_sys_cd",
				"ext_arr_act_no"
			},
			{
				$arr_act_no,
				$arr_act_rev,
				$arr_schd_no,
				$trd_cd,
				$trd_ptn_typ,
				$purc_act_io_no,
				$lg_grp_cd,
				$wg_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$rcpt_iv_itm_nm,
				$sundry_itm_flg,
				$purc_id_typ,
				$stk_mng_typ,
				$sno1,
				$sno1_mng_typ,
				$sno2,
				$sno2_mng_typ,
				$sno3,
				$sno3_mng_typ,
				$sno4,
				$sno4_mng_typ,
				$lot_no,
				$sublot_no,
				$ver_no,
				$stk_arrv_bp_cd,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$rqst_dpt_cd,
				$rqst_usr_cd,
				$arr_dpt_cd,
				$arr_usr_cd,
				$cst_cd,
				$sret_fr_cd,
				$sppl_cd,
				$ret_loc_cd,
				$ret_str_ln_cd,
				$ret_gd_cd,
				$maker_cd,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$ship_fr_valid_dt,
				$arr_loc_cd,
				$str_ln_cd,
				$arr_tm,
				$ac_dt,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$purc_cont_qty,
				$rsn_cd,
				$bd_dpt_cd,
				$bd_wg_cd,
				$sync_flg,
				$edi_flg,
				$edi_bp_dlv_slip_no,
				$edi_bp_dlv_slip_d_no,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$insp_cnt_rmrks,
				$intr_rmrks,
				$trd_rmrks,
				$trd_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$pack_unit_qty,
				$pack_unit_cd,
				$can_flg,
				$wms_flg,
				$ext_sys_cd,
				$ext_arr_act_no
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
				{$pr_sts_typ, "MSC_PR_STS_TYP"}	// pr_sts_typ
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
	protected ArrAct_DtlR_MC_A(ConstMetaList<? extends ArrAct_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_DtlR clone() {
		return (ArrAct_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_DtlR createInstance() {
		return (ArrAct_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrAct_DtlR getValues(String... names) {
		return (ArrAct_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_ARR_ACT_R arr_act(){
		return (mcframe.serverMS.dbc.MST_ARR_ACT_R) getConstInnerRow(offset + 2, $arr_act);
	}
	
	public void arr_act(mcframe.serverMS.dbc.MST_ARR_ACT_R row){
		setConstInnerRow(offset + 2, $arr_act, row);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 3, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 3, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 4, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 4, $pr_sts_typ_nm, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 5, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 5, $can_ac_dt, value);
	}


	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return getConstDate(offset + 6, $arr_dt);
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		setConstDate(offset + 6, $arr_dt, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 7, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 7, $arr_pr_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 8, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 8, $rcpt_iv_no, value);
	}


	/**
	 * Temporary purchase invoice No. 仮受領インボイスＮＯ.<p>
	 *
	 */
	public String temp_rcpt_iv_no() {
		return getConstString(offset + 9, $temp_rcpt_iv_no);
	}

	/**
	 * Temporary purchase invoice No. 仮受領インボイスＮＯ.<p>
	 *
	 */
	public void temp_rcpt_iv_no(String value) {
		setConstString(offset + 9, $temp_rcpt_iv_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 10, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 10, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 11, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 11, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 12, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 12, $po_d_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 13, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 13, $prov_act_no, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 14, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 14, $arr_ptn_typ, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 15, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 15, $abort_flg, value);
	}


	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 16, $crt_lot_flg);
	}

	/**
	 * Create lot ロット作成.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 16, $crt_lot_flg, value);
	}


	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 17, $same_lot_flg);
	}

	/**
	 * Same lot 同一ロット.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 17, $same_lot_flg, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 18, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 18, $io_schd_pr_no, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 19, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 19, $prov_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 20, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 20, $prov_basis_typ, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 21, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 21, $mfg_inst_no, value);
	}


	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 22, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result leading 外注実績先行.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 22, $pre_outsrc_act_flg, value);
	}


	/**
	 * Issue 発行.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 23, $prnt_flg);
	}

	/**
	 * Issue 発行.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 23, $prnt_flg, value);
	}


	/**
	 * Lot numbering row ロット発番行.<p>
	 *
	 */
	public boolean lot_issue_row_flg() {
		return getConstBoolean(offset + 24, $lot_issue_row_flg);
	}

	/**
	 * Lot numbering row ロット発番行.<p>
	 *
	 */
	public void lot_issue_row_flg(boolean value) {
		setConstBoolean(offset + 24, $lot_issue_row_flg, value);
	}


	/**
	 * Execute purchase result check 仕入実績チェック実行.<p>
	 *
	 */
	public boolean purc_act_chk_flg() {
		return getConstBoolean(offset + 25, $purc_act_chk_flg);
	}

	/**
	 * Execute purchase result check 仕入実績チェック実行.<p>
	 *
	 */
	public void purc_act_chk_flg(boolean value) {
		setConstBoolean(offset + 25, $purc_act_chk_flg, value);
	}


	/**
	 * Perform sales return check execution 売上返品チェック実行.<p>
	 *
	 */
	public boolean sls_ret_chk_flg() {
		return getConstBoolean(offset + 26, $sls_ret_chk_flg);
	}

	/**
	 * Perform sales return check execution 売上返品チェック実行.<p>
	 *
	 */
	public void sls_ret_chk_flg(boolean value) {
		setConstBoolean(offset + 26, $sls_ret_chk_flg, value);
	}


	/**
	 * Execute subcontracting mfg. result check 外注製造実績チェック実行.<p>
	 *
	 */
	public boolean outsrc_act_chk_flg() {
		return getConstBoolean(offset + 27, $outsrc_act_chk_flg);
	}

	/**
	 * Execute subcontracting mfg. result check 外注製造実績チェック実行.<p>
	 *
	 */
	public void outsrc_act_chk_flg(boolean value) {
		setConstBoolean(offset + 27, $outsrc_act_chk_flg, value);
	}


	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return getConstBoolean(offset + 28, $temp_ap_flg);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		setConstBoolean(offset + 28, $temp_ap_flg, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 29, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 29, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			return temp_rcpt_iv_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($lot_issue_row_flg.equalsIgnoreCase(name)) {
			return lot_issue_row_flg();
		}
		if ($purc_act_chk_flg.equalsIgnoreCase(name)) {
			return purc_act_chk_flg();
		}
		if ($sls_ret_chk_flg.equalsIgnoreCase(name)) {
			return sls_ret_chk_flg();
		}
		if ($outsrc_act_chk_flg.equalsIgnoreCase(name)) {
			return outsrc_act_chk_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			return temp_rcpt_iv_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($lot_issue_row_flg.equalsIgnoreCase(name)) {
			return lot_issue_row_flg();
		}
		if ($purc_act_chk_flg.equalsIgnoreCase(name)) {
			return purc_act_chk_flg();
		}
		if ($sls_ret_chk_flg.equalsIgnoreCase(name)) {
			return sls_ret_chk_flg();
		}
		if ($outsrc_act_chk_flg.equalsIgnoreCase(name)) {
			return outsrc_act_chk_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			temp_rcpt_iv_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($lot_issue_row_flg.equalsIgnoreCase(name)) {
			lot_issue_row_flg(value);
			return;
		}
		if ($purc_act_chk_flg.equalsIgnoreCase(name)) {
			purc_act_chk_flg(value);
			return;
		}
		if ($sls_ret_chk_flg.equalsIgnoreCase(name)) {
			sls_ret_chk_flg(value);
			return;
		}
		if ($outsrc_act_chk_flg.equalsIgnoreCase(name)) {
			outsrc_act_chk_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($temp_rcpt_iv_no.equalsIgnoreCase(name)) {
			temp_rcpt_iv_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($lot_issue_row_flg.equalsIgnoreCase(name)) {
			lot_issue_row_flg(value);
			return;
		}
		if ($purc_act_chk_flg.equalsIgnoreCase(name)) {
			purc_act_chk_flg(value);
			return;
		}
		if ($sls_ret_chk_flg.equalsIgnoreCase(name)) {
			sls_ret_chk_flg(value);
			return;
		}
		if ($outsrc_act_chk_flg.equalsIgnoreCase(name)) {
			outsrc_act_chk_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arr_act.equalsIgnoreCase(name)) {
			return arr_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_act.equalsIgnoreCase(name)) {
			arr_act(
				((MCContainerMeta) arr_act_META).castInnerRow(mcframe.serverMS.dbc.MST_ARR_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return arr_act().arr_act_no();
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		arr_act().arr_act_no(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public MCNumber arr_act_rev() {
		return arr_act().arr_act_rev();
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(MCNumber value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(int value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(long value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(float value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(double value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return arr_act().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		arr_act().arr_schd_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return arr_act().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		arr_act().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return arr_act().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		arr_act().trd_ptn_typ(value);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return arr_act().purc_act_io_no();
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		arr_act().purc_act_io_no(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return arr_act().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		arr_act().lg_grp_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return arr_act().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		arr_act().wg_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return arr_act().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		arr_act().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return arr_act().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		arr_act().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return arr_act().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		arr_act().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return arr_act().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		arr_act().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return arr_act().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		arr_act().itm_nm(value);
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return arr_act().rcpt_iv_itm_nm();
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		arr_act().rcpt_iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return arr_act().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		arr_act().sundry_itm_flg(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return arr_act().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		arr_act().purc_id_typ(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return arr_act().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		arr_act().stk_mng_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return arr_act().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		arr_act().sno1(value);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return arr_act().sno1_mng_typ();
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		arr_act().sno1_mng_typ(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return arr_act().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		arr_act().sno2(value);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return arr_act().sno2_mng_typ();
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		arr_act().sno2_mng_typ(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return arr_act().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		arr_act().sno3(value);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return arr_act().sno3_mng_typ();
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		arr_act().sno3_mng_typ(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return arr_act().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		arr_act().sno4(value);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return arr_act().sno4_mng_typ();
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		arr_act().sno4_mng_typ(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return arr_act().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		arr_act().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return arr_act().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		arr_act().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return arr_act().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		arr_act().ver_no(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return arr_act().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		arr_act().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return arr_act().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		arr_act().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return arr_act().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		arr_act().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return arr_act().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		arr_act().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return arr_act().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		arr_act().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return arr_act().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		arr_act().stk_bp_cd(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return arr_act().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		arr_act().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return arr_act().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		arr_act().sppl_itm_nm(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return arr_act().rqst_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		arr_act().rqst_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return arr_act().rqst_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		arr_act().rqst_usr_cd(value);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return arr_act().arr_dpt_cd();
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		arr_act().arr_dpt_cd(value);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return arr_act().arr_usr_cd();
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		arr_act().arr_usr_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return arr_act().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		arr_act().cst_cd(value);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return arr_act().sret_fr_cd();
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		arr_act().sret_fr_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return arr_act().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		arr_act().sppl_cd(value);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String ret_loc_cd() {
		return arr_act().ret_loc_cd();
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void ret_loc_cd(String value) {
		arr_act().ret_loc_cd(value);
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public String ret_str_ln_cd() {
		return arr_act().ret_str_ln_cd();
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public void ret_str_ln_cd(String value) {
		arr_act().ret_str_ln_cd(value);
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public String ret_gd_cd() {
		return arr_act().ret_gd_cd();
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public void ret_gd_cd(String value) {
		arr_act().ret_gd_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return arr_act().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		arr_act().maker_cd(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return arr_act().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		arr_act().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return arr_act().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		arr_act().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return arr_act().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		arr_act().bp_dlv_slip_d_no(value);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return arr_act().ship_fr_valid_dt();
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		arr_act().ship_fr_valid_dt(value);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return arr_act().arr_loc_cd();
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		arr_act().arr_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return arr_act().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		arr_act().str_ln_cd(value);
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public MCDate arr_tm() {
		return arr_act().arr_tm();
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		arr_act().arr_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return arr_act().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		arr_act().ac_dt(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return arr_act().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return arr_act().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		arr_act().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return arr_act().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return arr_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		arr_act().base_unit_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return arr_act().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return arr_act().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return arr_act().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return arr_act().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return arr_act().ptax_cur_amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return arr_act().ptax_cur_tax_amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return arr_act().purc_cont_qty();
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return arr_act().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		arr_act().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return arr_act().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		arr_act().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return arr_act().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		arr_act().bd_wg_cd(value);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return arr_act().sync_flg();
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		arr_act().sync_flg(value);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return arr_act().edi_flg();
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		arr_act().edi_flg(value);
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_no() {
		return arr_act().edi_bp_dlv_slip_no();
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_no(String value) {
		arr_act().edi_bp_dlv_slip_no(value);
	}

	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_d_no() {
		return arr_act().edi_bp_dlv_slip_d_no();
	}

	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_d_no(String value) {
		arr_act().edi_bp_dlv_slip_d_no(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return arr_act().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		arr_act().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return arr_act().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		arr_act().dlv_slip_d_no(value);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return arr_act().insp_cnt_rmrks();
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		arr_act().insp_cnt_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return arr_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		arr_act().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return arr_act().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		arr_act().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return arr_act().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		arr_act().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return arr_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		arr_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return arr_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		arr_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return arr_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		arr_act().sub_char3(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return arr_act().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return arr_act().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		arr_act().pack_unit_cd(value);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return arr_act().can_flg();
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		arr_act().can_flg(value);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return arr_act().wms_flg();
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		arr_act().wms_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return arr_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		arr_act().ext_sys_cd(value);
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public String ext_arr_act_no() {
		return arr_act().ext_arr_act_no();
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public void ext_arr_act_no(String value) {
		arr_act().ext_arr_act_no(value);
	}

}

