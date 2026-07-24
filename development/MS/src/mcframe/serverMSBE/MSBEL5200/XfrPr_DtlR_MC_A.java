package mcframe.serverMSBE.MSBEL5200;

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
 * ブロック"XfrPr_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrPr_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $xas = "xas";
	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $old_xfr_alloc_sts_no = "old_xfr_alloc_sts_no";
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
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_def_loc_cd = "gi_def_loc_cd";
	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public static final String $inst_rem_abort_flg = "inst_rem_abort_flg";
	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public static final String $ret_prov_schd_no = "ret_prov_schd_no";
	public static final String $xs = "xs";
	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public static final String $wk_peg_no = "wk_peg_no";
	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public static final String $wk_ret_peg_no = "wk_ret_peg_no";
	/**
	 * Transaction Pattern (Before update) 取引パタン（更新前）.<p>
	 *
	 */
	public static final String $old_trd_ptn_typ = "old_trd_ptn_typ";
	/**
	 * Progress status (Before update) 進捗状況（更新前）.<p>
	 *
	 */
	public static final String $old_pr_sts_typ = "old_pr_sts_typ";
	/**
	 * Correct cancel remaining only 打切のみ訂正.<p>
	 *
	 */
	public static final String $abort_only_flg = "abort_only_flg";

	public static final String $xfr_alloc_sts_no = $xas + ".xfr_alloc_sts_no";
	public static final String $pr_sts_typ = $xas + ".pr_sts_typ";
	public static final String $xfr_schd_no = $xas + ".xfr_schd_no";
	public static final String $xfr_inst_d_no = $xas + ".xfr_inst_d_no";
	public static final String $trd_cd = $xas + ".trd_cd";
	public static final String $trd_ptn_typ = $xas + ".trd_ptn_typ";
	public static final String $wg_cd = $xas + ".wg_cd";
	public static final String $lg_grp_cd = $xas + ".lg_grp_cd";
	public static final String $gi_loc_cd = $xas + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $xas + ".gi_str_ln_cd";
	public static final String $gi_stk_arrv_bp_cd = $xas + ".gi_stk_arrv_bp_cd";
	public static final String $gr_loc_cd = $xas + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $xas + ".gr_str_ln_cd";
	public static final String $gr_stk_arrv_bp_cd = $xas + ".gr_stk_arrv_bp_cd";
	public static final String $lot_no = $xas + ".lot_no";
	public static final String $sublot_no = $xas + ".sublot_no";
	public static final String $sno1 = $xas + ".sno1";
	public static final String $sno1_null_flg = $xas + ".sno1_null_flg";
	public static final String $sno2 = $xas + ".sno2";
	public static final String $sno2_null_flg = $xas + ".sno2_null_flg";
	public static final String $sno3 = $xas + ".sno3";
	public static final String $sno3_null_flg = $xas + ".sno3_null_flg";
	public static final String $sno4 = $xas + ".sno4";
	public static final String $sno4_null_flg = $xas + ".sno4_null_flg";
	public static final String $alloc_sno1 = $xas + ".alloc_sno1";
	public static final String $alloc_sno2 = $xas + ".alloc_sno2";
	public static final String $alloc_sno3 = $xas + ".alloc_sno3";
	public static final String $alloc_sno4 = $xas + ".alloc_sno4";
	public static final String $ver_no = $xas + ".ver_no";
	public static final String $gd_cd = $xas + ".gd_cd";
	public static final String $quality_typ = $xas + ".quality_typ";
	public static final String $stk_insp_typ = $xas + ".stk_insp_typ";
	public static final String $stk_id_typ = $xas + ".stk_id_typ";
	public static final String $stk_bp_cd = $xas + ".stk_bp_cd";
	public static final String $trd_unit_cd = $xas + ".trd_unit_cd";
	public static final String $trd_unit_qty = $xas + ".trd_unit_qty";
	public static final String $base_unit_cd = $xas + ".base_unit_cd";
	public static final String $base_unit_qty = $xas + ".base_unit_qty";
	public static final String $act_qty = $xas + ".act_qty";
	public static final String $xfr_schd_dt = $xas + ".xfr_schd_dt";
	public static final String $ship_inst_typ = $xas + ".ship_inst_typ";
	public static final String $rsn_cd = $xas + ".rsn_cd";
	public static final String $bd_dpt_cd = $xas + ".bd_dpt_cd";
	public static final String $inst_bndl_flg = $xas + ".inst_bndl_flg";
	public static final String $fix_flg = $xas + ".fix_flg";
	public static final String $abort_flg = $xas + ".abort_flg";
	public static final String $cmpl_flg = $xas + ".cmpl_flg";
	public static final String $alloc_flg = $xas + ".alloc_flg";
	public static final String $not_lot_mix_flg = $xas + ".not_lot_mix_flg";
	public static final String $not_sublot_mix_flg = $xas + ".not_sublot_mix_flg";
	public static final String $vld_dt_fr = $xas + ".vld_dt_fr";
	public static final String $vld_dt_to = $xas + ".vld_dt_to";
	public static final String $prov_typ = $xas + ".prov_typ";
	public static final String $prov_basis_typ = $xas + ".prov_basis_typ";
	public static final String $ret_prov_typ = $xas + ".ret_prov_typ";
	public static final String $ret_prov_basis_typ = $xas + ".ret_prov_basis_typ";
	public static final String $io_schd_pr_no = $xas + ".io_schd_pr_no";
	public static final String $sub_char1 = $xas + ".sub_char1";
	public static final String $sub_char2 = $xas + ".sub_char2";
	public static final String $sub_char3 = $xas + ".sub_char3";
	public static final String $disp_seq = $xas + ".disp_seq";
	public static final String $dlv_slip_no = $xas + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $xas + ".dlv_slip_d_no";
	public static final String $trd_d_rmrks = $xas + ".trd_d_rmrks";
	public static final String $inst_d_rmrks = $xas + ".inst_d_rmrks";
	public static final String $intr_d_rmrks = $xas + ".intr_d_rmrks";
	public static final String $wms_flg = $xas + ".wms_flg";
	public static final String $xrate_inpt_flg = $xs + ".xrate_inpt_flg";
	public static final String $xrate = $xs + ".xrate";
	public static final String $ptax_xrate_inpt_flg = $xs + ".ptax_xrate_inpt_flg";
	public static final String $ptax_xrate = $xs + ".ptax_xrate";
	public static final String $trd_cur_cd = $xs + ".trd_cur_cd";
	public static final String $tax_fix_flg = $xs + ".tax_fix_flg";
	public static final String $tax_cd = $xs + ".tax_cd";
	public static final String $trd_cur_upri = $xs + ".trd_cur_upri";
	public static final String $trd_cur_amt = $xs + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $xs + ".trd_cur_tax_amt";
	public static final String $wtax_rate = $xs + ".wtax_rate";
	public static final String $wtax_amt = $xs + ".wtax_amt";
	public static final String $ret_xrate_inpt_flg = $xs + ".ret_xrate_inpt_flg";
	public static final String $ret_xrate = $xs + ".ret_xrate";
	public static final String $ret_ptax_xrate_inpt_flg = $xs + ".ret_ptax_xrate_inpt_flg";
	public static final String $ret_ptax_xrate = $xs + ".ret_ptax_xrate";
	public static final String $ret_trd_cur_cd = $xs + ".ret_trd_cur_cd";
	public static final String $ret_tax_fix_flg = $xs + ".ret_tax_fix_flg";
	public static final String $ret_tax_cd = $xs + ".ret_tax_cd";
	public static final String $ret_trd_cur_upri = $xs + ".ret_trd_cur_upri";
	public static final String $ret_trd_cur_amt = $xs + ".ret_trd_cur_amt";
	public static final String $ret_trd_cur_tax_amt = $xs + ".ret_trd_cur_tax_amt";
	public static final String $ret_wtax_rate = $xs + ".ret_wtax_rate";
	public static final String $ret_wtax_amt = $xs + ".ret_wtax_amt";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta xas_META = createInnerRowMeta($xas, mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R.class);
	public static final MCMeta old_xfr_alloc_sts_no_META = createCommonMeta($old_xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta gi_def_loc_cd_META = createCommonMeta($gi_def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inst_rem_abort_flg_META = createCommonMeta($inst_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta ret_prov_schd_no_META = createCommonMeta($ret_prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta xs_META = createInnerRowMeta($xs, mcframe.serverMS.dbc.MST_XFR_SCHD_R.class);
	public static final MCMeta wk_peg_no_META = createCommonMeta($wk_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wk_ret_peg_no_META = createCommonMeta($wk_ret_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta old_trd_ptn_typ_META = createCommonMeta($old_trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta old_pr_sts_typ_META = createCommonMeta($old_pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta abort_only_flg_META = createCommonMeta($abort_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrPr_DtlR> constMetas = new ConstMetaList<XfrPr_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			xas_META,
			old_xfr_alloc_sts_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			cont_qty_META,
			gi_def_loc_cd_META,
			inst_rem_abort_flg_META,
			prov_schd_no_META,
			ret_prov_schd_no_META,
			xs_META,
			wk_peg_no_META,
			wk_ret_peg_no_META,
			old_trd_ptn_typ_META,
			old_pr_sts_typ_META,
			abort_only_flg_META
		},
		new String[][]{
			{
				"xfr_alloc_sts_no",
				"pr_sts_typ",
				"xfr_schd_no",
				"xfr_inst_d_no",
				"trd_cd",
				"trd_ptn_typ",
				"wg_cd",
				"lg_grp_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_stk_arrv_bp_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"gr_stk_arrv_bp_cd",
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
				"ver_no",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"act_qty",
				"xfr_schd_dt",
				"ship_inst_typ",
				"rsn_cd",
				"bd_dpt_cd",
				"inst_bndl_flg",
				"fix_flg",
				"abort_flg",
				"cmpl_flg",
				"alloc_flg",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_to",
				"prov_typ",
				"prov_basis_typ",
				"ret_prov_typ",
				"ret_prov_basis_typ",
				"io_schd_pr_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"disp_seq",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"trd_d_rmrks",
				"inst_d_rmrks",
				"intr_d_rmrks",
				"wms_flg",
				"xrate_inpt_flg",
				"xrate",
				"ptax_xrate_inpt_flg",
				"ptax_xrate",
				"trd_cur_cd",
				"tax_fix_flg",
				"tax_cd",
				"trd_cur_upri",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"wtax_rate",
				"wtax_amt",
				"ret_xrate_inpt_flg",
				"ret_xrate",
				"ret_ptax_xrate_inpt_flg",
				"ret_ptax_xrate",
				"ret_trd_cur_cd",
				"ret_tax_fix_flg",
				"ret_tax_cd",
				"ret_trd_cur_upri",
				"ret_trd_cur_amt",
				"ret_trd_cur_tax_amt",
				"ret_wtax_rate",
				"ret_wtax_amt"
			},
			{
				$xfr_alloc_sts_no,
				$pr_sts_typ,
				$xfr_schd_no,
				$xfr_inst_d_no,
				$trd_cd,
				$trd_ptn_typ,
				$wg_cd,
				$lg_grp_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_stk_arrv_bp_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$gr_stk_arrv_bp_cd,
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
				$ver_no,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$act_qty,
				$xfr_schd_dt,
				$ship_inst_typ,
				$rsn_cd,
				$bd_dpt_cd,
				$inst_bndl_flg,
				$fix_flg,
				$abort_flg,
				$cmpl_flg,
				$alloc_flg,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_to,
				$prov_typ,
				$prov_basis_typ,
				$ret_prov_typ,
				$ret_prov_basis_typ,
				$io_schd_pr_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$disp_seq,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$trd_d_rmrks,
				$inst_d_rmrks,
				$intr_d_rmrks,
				$wms_flg,
				$xrate_inpt_flg,
				$xrate,
				$ptax_xrate_inpt_flg,
				$ptax_xrate,
				$trd_cur_cd,
				$tax_fix_flg,
				$tax_cd,
				$trd_cur_upri,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$wtax_rate,
				$wtax_amt,
				$ret_xrate_inpt_flg,
				$ret_xrate,
				$ret_ptax_xrate_inpt_flg,
				$ret_ptax_xrate,
				$ret_trd_cur_cd,
				$ret_tax_fix_flg,
				$ret_tax_cd,
				$ret_trd_cur_upri,
				$ret_trd_cur_amt,
				$ret_trd_cur_tax_amt,
				$ret_wtax_rate,
				$ret_wtax_amt
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
	protected XfrPr_DtlR_MC_A(ConstMetaList<? extends XfrPr_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrPr_DtlR clone() {
		return (XfrPr_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrPr_DtlR createInstance() {
		return (XfrPr_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrPr_DtlR getValues(String... names) {
		return (XfrPr_DtlR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R xas(){
		return (mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R) getConstInnerRow(offset + 2, $xas);
	}
	
	public void xas(mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R row){
		setConstInnerRow(offset + 2, $xas, row);
	}


	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public String old_xfr_alloc_sts_no() {
		return getConstString(offset + 3, $old_xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public void old_xfr_alloc_sts_no(String value) {
		setConstString(offset + 3, $old_xfr_alloc_sts_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 8, $cont_qty);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 8, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 8, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 8, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 8, $cont_qty, value);
	}

	/**
	 * Active ingredient 有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 8, $cont_qty, value);
	}


	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public String gi_def_loc_cd() {
		return getConstString(offset + 9, $gi_def_loc_cd);
	}

	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public void gi_def_loc_cd(String value) {
		setConstString(offset + 9, $gi_def_loc_cd, value);
	}


	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public boolean inst_rem_abort_flg() {
		return getConstBoolean(offset + 10, $inst_rem_abort_flg);
	}

	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public void inst_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 10, $inst_rem_abort_flg, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 11, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 11, $prov_schd_no, value);
	}


	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return getConstString(offset + 12, $ret_prov_schd_no);
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		setConstString(offset + 12, $ret_prov_schd_no, value);
	}


	public mcframe.serverMS.dbc.MST_XFR_SCHD_R xs(){
		return (mcframe.serverMS.dbc.MST_XFR_SCHD_R) getConstInnerRow(offset + 13, $xs);
	}
	
	public void xs(mcframe.serverMS.dbc.MST_XFR_SCHD_R row){
		setConstInnerRow(offset + 13, $xs, row);
	}


	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber wk_peg_no() {
		return getConstNumber(offset + 14, $wk_peg_no);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(MCNumber value) {
		setConstNumber(offset + 14, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(int value) {
		setConstNumber(offset + 14, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(long value) {
		setConstNumber(offset + 14, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(float value) {
		setConstNumber(offset + 14, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(double value) {
		setConstNumber(offset + 14, $wk_peg_no, value);
	}


	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public MCNumber wk_ret_peg_no() {
		return getConstNumber(offset + 15, $wk_ret_peg_no);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(MCNumber value) {
		setConstNumber(offset + 15, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(int value) {
		setConstNumber(offset + 15, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(long value) {
		setConstNumber(offset + 15, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(float value) {
		setConstNumber(offset + 15, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(double value) {
		setConstNumber(offset + 15, $wk_ret_peg_no, value);
	}


	/**
	 * Transaction Pattern (Before update) 取引パタン（更新前）.<p>
	 *
	 */
	public String old_trd_ptn_typ() {
		return getConstString(offset + 16, $old_trd_ptn_typ);
	}

	/**
	 * Transaction Pattern (Before update) 取引パタン（更新前）.<p>
	 *
	 */
	public void old_trd_ptn_typ(String value) {
		setConstString(offset + 16, $old_trd_ptn_typ, value);
	}


	/**
	 * Progress status (Before update) 進捗状況（更新前）.<p>
	 *
	 */
	public String old_pr_sts_typ() {
		return getConstString(offset + 17, $old_pr_sts_typ);
	}

	/**
	 * Progress status (Before update) 進捗状況（更新前）.<p>
	 *
	 */
	public void old_pr_sts_typ(String value) {
		setConstString(offset + 17, $old_pr_sts_typ, value);
	}


	/**
	 * Correct cancel remaining only 打切のみ訂正.<p>
	 *
	 */
	public boolean abort_only_flg() {
		return getConstBoolean(offset + 18, $abort_only_flg);
	}

	/**
	 * Correct cancel remaining only 打切のみ訂正.<p>
	 *
	 */
	public void abort_only_flg(boolean value) {
		setConstBoolean(offset + 18, $abort_only_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
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
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			return gi_def_loc_cd();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($old_trd_ptn_typ.equalsIgnoreCase(name)) {
			return old_trd_ptn_typ();
		}
		if ($old_pr_sts_typ.equalsIgnoreCase(name)) {
			return old_pr_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			return wk_peg_no();
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			return wk_ret_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			return inst_rem_abort_flg();
		}
		if ($abort_only_flg.equalsIgnoreCase(name)) {
			return abort_only_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
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
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			return gi_def_loc_cd();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($old_trd_ptn_typ.equalsIgnoreCase(name)) {
			return old_trd_ptn_typ();
		}
		if ($old_pr_sts_typ.equalsIgnoreCase(name)) {
			return old_pr_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			return wk_peg_no();
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			return wk_ret_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			return inst_rem_abort_flg();
		}
		if ($abort_only_flg.equalsIgnoreCase(name)) {
			return abort_only_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
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
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			gi_def_loc_cd(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			ret_prov_schd_no(value);
			return;
		}
		if ($old_trd_ptn_typ.equalsIgnoreCase(name)) {
			old_trd_ptn_typ(value);
			return;
		}
		if ($old_pr_sts_typ.equalsIgnoreCase(name)) {
			old_pr_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			inst_rem_abort_flg(value);
			return;
		}
		if ($abort_only_flg.equalsIgnoreCase(name)) {
			abort_only_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
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
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			gi_def_loc_cd(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			ret_prov_schd_no(value);
			return;
		}
		if ($old_trd_ptn_typ.equalsIgnoreCase(name)) {
			old_trd_ptn_typ(value);
			return;
		}
		if ($old_pr_sts_typ.equalsIgnoreCase(name)) {
			old_pr_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			wk_peg_no(value);
			return;
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			wk_ret_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			inst_rem_abort_flg(value);
			return;
		}
		if ($abort_only_flg.equalsIgnoreCase(name)) {
			abort_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xas.equalsIgnoreCase(name)) {
			return xas();
		}
		if ($xs.equalsIgnoreCase(name)) {
			return xs();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xas.equalsIgnoreCase(name)) {
			xas(
				((MCContainerMeta) xas_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R.class, value)
			);
			return;
		}
		if ($xs.equalsIgnoreCase(name)) {
			xs(
				((MCContainerMeta) xs_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return xas().xfr_alloc_sts_no();
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		xas().xfr_alloc_sts_no(value);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return xas().pr_sts_typ();
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		xas().pr_sts_typ(value);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return xas().xfr_schd_no();
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		xas().xfr_schd_no(value);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return xas().xfr_inst_d_no();
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		xas().xfr_inst_d_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xas().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xas().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return xas().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		xas().trd_ptn_typ(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return xas().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		xas().wg_cd(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return xas().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		xas().lg_grp_cd(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return xas().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		xas().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return xas().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		xas().gi_str_ln_cd(value);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return xas().gi_stk_arrv_bp_cd();
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		xas().gi_stk_arrv_bp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xas().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xas().gr_loc_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return xas().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		xas().gr_str_ln_cd(value);
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gr_stk_arrv_bp_cd() {
		return xas().gr_stk_arrv_bp_cd();
	}

	/**
	 * GR inventory arriving point cd. 入庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gr_stk_arrv_bp_cd(String value) {
		xas().gr_stk_arrv_bp_cd(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return xas().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		xas().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return xas().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		xas().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return xas().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		xas().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return xas().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		xas().sno1_null_flg(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return xas().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		xas().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return xas().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		xas().sno2_null_flg(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return xas().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		xas().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return xas().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		xas().sno3_null_flg(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return xas().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		xas().sno4(value);
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return xas().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		xas().sno4_null_flg(value);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return xas().alloc_sno1();
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		xas().alloc_sno1(value);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return xas().alloc_sno2();
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		xas().alloc_sno2(value);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return xas().alloc_sno3();
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		xas().alloc_sno3(value);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return xas().alloc_sno4();
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		xas().alloc_sno4(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return xas().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		xas().ver_no(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return xas().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		xas().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return xas().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		xas().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return xas().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		xas().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return xas().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		xas().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return xas().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		xas().stk_bp_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return xas().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		xas().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return xas().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		xas().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		xas().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		xas().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		xas().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		xas().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return xas().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		xas().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return xas().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		xas().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		xas().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		xas().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		xas().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		xas().base_unit_qty(value);
	}

	/**
	 * Movement result qty. 移動実績数量.<p>
	 *
	 */
	public MCNumber act_qty() {
		return xas().act_qty();
	}

	/**
	 * Movement result qty. 移動実績数量.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		xas().act_qty(value);
	}

	/**
	 * Movement result qty. 移動実績数量.<p>
	 *
	 */
	public void act_qty(int value) {
		xas().act_qty(value);
	}

	/**
	 * Movement result qty. 移動実績数量.<p>
	 *
	 */
	public void act_qty(long value) {
		xas().act_qty(value);
	}

	/**
	 * Movement result qty. 移動実績数量.<p>
	 *
	 */
	public void act_qty(float value) {
		xas().act_qty(value);
	}

	/**
	 * Movement result qty. 移動実績数量.<p>
	 *
	 */
	public void act_qty(double value) {
		xas().act_qty(value);
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return xas().xfr_schd_dt();
	}

	/**
	 * Scheduled movement date 移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		xas().xfr_schd_dt(value);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return xas().ship_inst_typ();
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		xas().ship_inst_typ(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return xas().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		xas().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return xas().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		xas().bd_dpt_cd(value);
	}

	/**
	 * Order aggregation flg. 指図まとめＦＬＧ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return xas().inst_bndl_flg();
	}

	/**
	 * Order aggregation flg. 指図まとめＦＬＧ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		xas().inst_bndl_flg(value);
	}

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public boolean fix_flg() {
		return xas().fix_flg();
	}

	/**
	 * Firm flg. 確定ＦＬＧ.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		xas().fix_flg(value);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return xas().abort_flg();
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		xas().abort_flg(value);
	}

	/**
	 * Completed flg. 完了ＦＬＧ.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return xas().cmpl_flg();
	}

	/**
	 * Completed flg. 完了ＦＬＧ.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		xas().cmpl_flg(value);
	}

	/**
	 * Location allocation flg. 場所引当ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_flg() {
		return xas().alloc_flg();
	}

	/**
	 * Location allocation flg. 場所引当ＦＬＧ.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		xas().alloc_flg(value);
	}

	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return xas().not_lot_mix_flg();
	}

	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		xas().not_lot_mix_flg(value);
	}

	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return xas().not_sublot_mix_flg();
	}

	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		xas().not_sublot_mix_flg(value);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return xas().vld_dt_fr();
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		xas().vld_dt_fr(value);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return xas().vld_dt_to();
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		xas().vld_dt_to(value);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return xas().prov_typ();
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		xas().prov_typ(value);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return xas().prov_basis_typ();
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		xas().prov_basis_typ(value);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return xas().ret_prov_typ();
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		xas().ret_prov_typ(value);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return xas().ret_prov_basis_typ();
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		xas().ret_prov_basis_typ(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return xas().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		xas().io_schd_pr_no(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return xas().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		xas().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return xas().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		xas().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return xas().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		xas().sub_char3(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return xas().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		xas().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		xas().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		xas().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		xas().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		xas().disp_seq(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return xas().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		xas().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return xas().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		xas().dlv_slip_d_no(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return xas().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		xas().trd_d_rmrks(value);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return xas().inst_d_rmrks();
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		xas().inst_d_rmrks(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return xas().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		xas().intr_d_rmrks(value);
	}

	/**
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public boolean wms_flg() {
		return xas().wms_flg();
	}

	/**
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		xas().wms_flg(value);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return xs().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		xs().xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return xs().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		xs().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		xs().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		xs().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		xs().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		xs().xrate(value);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return xs().ptax_xrate_inpt_flg();
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		xs().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return xs().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		xs().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		xs().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		xs().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		xs().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		xs().ptax_xrate(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return xs().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		xs().trd_cur_cd(value);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return xs().tax_fix_flg();
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		xs().tax_fix_flg(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return xs().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		xs().tax_cd(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return xs().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		xs().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		xs().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		xs().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		xs().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		xs().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return xs().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		xs().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		xs().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		xs().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		xs().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		xs().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return xs().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		xs().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		xs().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		xs().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		xs().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		xs().trd_cur_tax_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return xs().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		xs().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		xs().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		xs().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		xs().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		xs().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return xs().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		xs().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		xs().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		xs().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		xs().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		xs().wtax_amt(value);
	}

	/**
	 * Set exchange rate (Return) 為替レート指定（返品）.<p>
	 *
	 */
	public boolean ret_xrate_inpt_flg() {
		return xs().ret_xrate_inpt_flg();
	}

	/**
	 * Set exchange rate (Return) 為替レート指定（返品）.<p>
	 *
	 */
	public void ret_xrate_inpt_flg(boolean value) {
		xs().ret_xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public MCNumber ret_xrate() {
		return xs().ret_xrate();
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(MCNumber value) {
		xs().ret_xrate(value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(int value) {
		xs().ret_xrate(value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(long value) {
		xs().ret_xrate(value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(float value) {
		xs().ret_xrate(value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(double value) {
		xs().ret_xrate(value);
	}

	/**
	 * Set tax exchange rate (Return) 納税為替レート指定（返品）.<p>
	 *
	 */
	public boolean ret_ptax_xrate_inpt_flg() {
		return xs().ret_ptax_xrate_inpt_flg();
	}

	/**
	 * Set tax exchange rate (Return) 納税為替レート指定（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate_inpt_flg(boolean value) {
		xs().ret_ptax_xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public MCNumber ret_ptax_xrate() {
		return xs().ret_ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(MCNumber value) {
		xs().ret_ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(int value) {
		xs().ret_ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(long value) {
		xs().ret_ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(float value) {
		xs().ret_ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(double value) {
		xs().ret_ptax_xrate(value);
	}

	/**
	 * Transaction currency cd. (Return) 取引通貨ＣＤ（返品）.<p>
	 *
	 */
	public String ret_trd_cur_cd() {
		return xs().ret_trd_cur_cd();
	}

	/**
	 * Transaction currency cd. (Return) 取引通貨ＣＤ（返品）.<p>
	 *
	 */
	public void ret_trd_cur_cd(String value) {
		xs().ret_trd_cur_cd(value);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean ret_tax_fix_flg() {
		return xs().ret_tax_fix_flg();
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void ret_tax_fix_flg(boolean value) {
		xs().ret_tax_fix_flg(value);
	}

	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public String ret_tax_cd() {
		return xs().ret_tax_cd();
	}

	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public void ret_tax_cd(String value) {
		xs().ret_tax_cd(value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_upri() {
		return xs().ret_trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(MCNumber value) {
		xs().ret_trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(int value) {
		xs().ret_trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(long value) {
		xs().ret_trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(float value) {
		xs().ret_trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(double value) {
		xs().ret_trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) (Return) 取引通貨金額（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_amt() {
		return xs().ret_trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) (Return) 取引通貨金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(MCNumber value) {
		xs().ret_trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) (Return) 取引通貨金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(int value) {
		xs().ret_trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) (Return) 取引通貨金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(long value) {
		xs().ret_trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) (Return) 取引通貨金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(float value) {
		xs().ret_trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) (Return) 取引通貨金額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_amt(double value) {
		xs().ret_trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) (Return) 取引通貨税額（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_tax_amt() {
		return xs().ret_trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) (Return) 取引通貨税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(MCNumber value) {
		xs().ret_trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) (Return) 取引通貨税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(int value) {
		xs().ret_trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) (Return) 取引通貨税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(long value) {
		xs().ret_trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) (Return) 取引通貨税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(float value) {
		xs().ret_trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) (Return) 取引通貨税額（返品）.<p>
	 *
	 */
	public void ret_trd_cur_tax_amt(double value) {
		xs().ret_trd_cur_tax_amt(value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public MCNumber ret_wtax_rate() {
		return xs().ret_wtax_rate();
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(MCNumber value) {
		xs().ret_wtax_rate(value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(int value) {
		xs().ret_wtax_rate(value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(long value) {
		xs().ret_wtax_rate(value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(float value) {
		xs().ret_wtax_rate(value);
	}

	/**
	 * Withholding tax rate (Return) 源泉税率（返品）.<p>
	 *
	 */
	public void ret_wtax_rate(double value) {
		xs().ret_wtax_rate(value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public MCNumber ret_wtax_amt() {
		return xs().ret_wtax_amt();
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(MCNumber value) {
		xs().ret_wtax_amt(value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(int value) {
		xs().ret_wtax_amt(value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(long value) {
		xs().ret_wtax_amt(value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(float value) {
		xs().ret_wtax_amt(value);
	}

	/**
	 * Withholding tax (Return) 源泉税額（返品）.<p>
	 *
	 */
	public void ret_wtax_amt(double value) {
		xs().ret_wtax_amt(value);
	}

}

