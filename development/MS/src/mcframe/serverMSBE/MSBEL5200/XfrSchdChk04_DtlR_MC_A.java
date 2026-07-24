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
 * ブロック"XfrSchdChk04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrSchdChk04_DtlR_MC_A extends MCConstRow {

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
	public static final String $xs = "xs";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_cd = "ship_wk_cd";
	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_def_loc_cd = "gi_def_loc_cd";
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
	 * Receiving point distribution group cd. 送付先物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_to_lg_grp_cd = "ship_to_lg_grp_cd";
	/**
	 * Location allocation flg. 場所引当ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Shipping ordered 出荷指図済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Shipping resulted 出荷実績済.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $xfr_schd_no = $xs + ".xfr_schd_no";
	public static final String $xfr_src_typ = $xs + ".xfr_src_typ";
	public static final String $xfr_src_no = $xs + ".xfr_src_no";
	public static final String $trd_cd = $xs + ".trd_cd";
	public static final String $trd_ptn_typ = $xs + ".trd_ptn_typ";
	public static final String $gi_lg_grp_cd = $xs + ".gi_lg_grp_cd";
	public static final String $gi_loc_cd = $xs + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $xs + ".gi_str_ln_cd";
	public static final String $gi_stk_arrv_bp_cd = $xs + ".gi_stk_arrv_bp_cd";
	public static final String $gr_lg_grp_cd = $xs + ".gr_lg_grp_cd";
	public static final String $gr_loc_cd = $xs + ".gr_loc_cd";
	public static final String $gr_str_ln_cd = $xs + ".gr_str_ln_cd";
	public static final String $itm_cd = $xs + ".itm_cd";
	public static final String $itm_sub1 = $xs + ".itm_sub1";
	public static final String $itm_sub2 = $xs + ".itm_sub2";
	public static final String $itm_sub3 = $xs + ".itm_sub3";
	public static final String $lot_no = $xs + ".lot_no";
	public static final String $sublot_no = $xs + ".sublot_no";
	public static final String $ver_no = $xs + ".ver_no";
	public static final String $sno1 = $xs + ".sno1";
	public static final String $sno1_null_flg = $xs + ".sno1_null_flg";
	public static final String $sno2 = $xs + ".sno2";
	public static final String $sno2_null_flg = $xs + ".sno2_null_flg";
	public static final String $sno3 = $xs + ".sno3";
	public static final String $sno3_null_flg = $xs + ".sno3_null_flg";
	public static final String $sno4 = $xs + ".sno4";
	public static final String $sno4_null_flg = $xs + ".sno4_null_flg";
	public static final String $gd_cd = $xs + ".gd_cd";
	public static final String $quality_typ = $xs + ".quality_typ";
	public static final String $stk_id_typ = $xs + ".stk_id_typ";
	public static final String $stk_bp_cd = $xs + ".stk_bp_cd";
	public static final String $trd_unit_cd = $xs + ".trd_unit_cd";
	public static final String $trd_unit_qty = $xs + ".trd_unit_qty";
	public static final String $base_unit_cd = $xs + ".base_unit_cd";
	public static final String $base_unit_qty = $xs + ".base_unit_qty";
	public static final String $gi_rqst_tm = $xs + ".gi_rqst_tm";
	public static final String $gr_rqst_tm = $xs + ".gr_rqst_tm";
	public static final String $rcpt_dt = $xs + ".rcpt_dt";
	public static final String $ship_term_cd = $xs + ".ship_term_cd";
	public static final String $ship_inst_typ = $xs + ".ship_inst_typ";
	public static final String $ship_to_id_typ = $xs + ".ship_to_id_typ";
	public static final String $ship_to_id_cd = $xs + ".ship_to_id_cd";
	public static final String $ship_to_id_nm = $xs + ".ship_to_id_nm";
	public static final String $ship_to_zip_cd = $xs + ".ship_to_zip_cd";
	public static final String $ship_to_addr1 = $xs + ".ship_to_addr1";
	public static final String $ship_to_addr2 = $xs + ".ship_to_addr2";
	public static final String $ship_to_addr3 = $xs + ".ship_to_addr3";
	public static final String $ship_to_addr4 = $xs + ".ship_to_addr4";
	public static final String $ship_to_cntct_dpt = $xs + ".ship_to_cntct_dpt";
	public static final String $ship_to_cntct_psn = $xs + ".ship_to_cntct_psn";
	public static final String $ship_to_tel = $xs + ".ship_to_tel";
	public static final String $ship_to_fax = $xs + ".ship_to_fax";
	public static final String $ship_to_sundry_flg = $xs + ".ship_to_sundry_flg";
	public static final String $via_dlv_typ = $xs + ".via_dlv_typ";
	public static final String $slo_d_no = $xs + ".slo_d_no";
	public static final String $not_lot_mix_flg = $xs + ".not_lot_mix_flg";
	public static final String $not_sublot_mix_flg = $xs + ".not_sublot_mix_flg";
	public static final String $vld_dt_fr = $xs + ".vld_dt_fr";
	public static final String $vld_dt_to = $xs + ".vld_dt_to";
	public static final String $prov_typ = $xs + ".prov_typ";
	public static final String $prov_basis_typ = $xs + ".prov_basis_typ";
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
	public static final String $ret_prov_typ = $xs + ".ret_prov_typ";
	public static final String $ret_prov_basis_typ = $xs + ".ret_prov_basis_typ";
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
	public static final String $base_ac_dt = $xs + ".base_ac_dt";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta xs_META = createInnerRowMeta($xs, mcframe.serverMS.dbc.MST_XFR_SCHD_R.class);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_wk_cd_META = createCommonMeta($ship_wk_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_CD);
	public static final MCMeta gi_def_loc_cd_META = createCommonMeta($gi_def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wk_peg_no_META = createCommonMeta($wk_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wk_ret_peg_no_META = createCommonMeta($wk_ret_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_to_lg_grp_cd_META = createCommonMeta($ship_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrSchdChk04_DtlR> constMetas = new ConstMetaList<XfrSchdChk04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			xs_META,
			ship_schd_tm_META,
			dlv_schd_tm_META,
			ship_wk_cd_META,
			gi_def_loc_cd_META,
			wk_peg_no_META,
			wk_ret_peg_no_META,
			ship_to_lg_grp_cd_META,
			alloc_flg_META,
			inst_flg_META,
			act_flg_META,
			err_flg_META
		},
		new String[][]{
			{
				"xfr_schd_no",
				"xfr_src_typ",
				"xfr_src_no",
				"trd_cd",
				"trd_ptn_typ",
				"gi_lg_grp_cd",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_stk_arrv_bp_cd",
				"gr_lg_grp_cd",
				"gr_loc_cd",
				"gr_str_ln_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"ver_no",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"gd_cd",
				"quality_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"gi_rqst_tm",
				"gr_rqst_tm",
				"rcpt_dt",
				"ship_term_cd",
				"ship_inst_typ",
				"ship_to_id_typ",
				"ship_to_id_cd",
				"ship_to_id_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"ship_to_sundry_flg",
				"via_dlv_typ",
				"slo_d_no",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_to",
				"prov_typ",
				"prov_basis_typ",
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
				"ret_prov_typ",
				"ret_prov_basis_typ",
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
				"ret_wtax_amt",
				"base_ac_dt"
			},
			{
				$xfr_schd_no,
				$xfr_src_typ,
				$xfr_src_no,
				$trd_cd,
				$trd_ptn_typ,
				$gi_lg_grp_cd,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_stk_arrv_bp_cd,
				$gr_lg_grp_cd,
				$gr_loc_cd,
				$gr_str_ln_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$ver_no,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$gd_cd,
				$quality_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$gi_rqst_tm,
				$gr_rqst_tm,
				$rcpt_dt,
				$ship_term_cd,
				$ship_inst_typ,
				$ship_to_id_typ,
				$ship_to_id_cd,
				$ship_to_id_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$ship_to_sundry_flg,
				$via_dlv_typ,
				$slo_d_no,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_to,
				$prov_typ,
				$prov_basis_typ,
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
				$ret_prov_typ,
				$ret_prov_basis_typ,
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
				$ret_wtax_amt,
				$base_ac_dt
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
	protected XfrSchdChk04_DtlR_MC_A(ConstMetaList<? extends XfrSchdChk04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk04_DtlR clone() {
		return (XfrSchdChk04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk04_DtlR createInstance() {
		return (XfrSchdChk04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk04_DtlR getValues(String... names) {
		return (XfrSchdChk04_DtlR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_XFR_SCHD_R xs(){
		return (mcframe.serverMS.dbc.MST_XFR_SCHD_R) getConstInnerRow(offset + 2, $xs);
	}
	
	public void xs(mcframe.serverMS.dbc.MST_XFR_SCHD_R row){
		setConstInnerRow(offset + 2, $xs, row);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 3, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 3, $ship_schd_tm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 4, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 4, $dlv_schd_tm, value);
	}


	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public String ship_wk_cd() {
		return getConstString(offset + 5, $ship_wk_cd);
	}

	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public void ship_wk_cd(String value) {
		setConstString(offset + 5, $ship_wk_cd, value);
	}


	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public String gi_def_loc_cd() {
		return getConstString(offset + 6, $gi_def_loc_cd);
	}

	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public void gi_def_loc_cd(String value) {
		setConstString(offset + 6, $gi_def_loc_cd, value);
	}


	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber wk_peg_no() {
		return getConstNumber(offset + 7, $wk_peg_no);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(MCNumber value) {
		setConstNumber(offset + 7, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(int value) {
		setConstNumber(offset + 7, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(long value) {
		setConstNumber(offset + 7, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(float value) {
		setConstNumber(offset + 7, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(double value) {
		setConstNumber(offset + 7, $wk_peg_no, value);
	}


	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public MCNumber wk_ret_peg_no() {
		return getConstNumber(offset + 8, $wk_ret_peg_no);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(MCNumber value) {
		setConstNumber(offset + 8, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(int value) {
		setConstNumber(offset + 8, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(long value) {
		setConstNumber(offset + 8, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(float value) {
		setConstNumber(offset + 8, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(double value) {
		setConstNumber(offset + 8, $wk_ret_peg_no, value);
	}


	/**
	 * Receiving point distribution group cd. 送付先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return getConstString(offset + 9, $ship_to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 送付先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		setConstString(offset + 9, $ship_to_lg_grp_cd, value);
	}


	/**
	 * Location allocation flg. 場所引当ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 10, $alloc_flg);
	}

	/**
	 * Location allocation flg. 場所引当ＦＬＧ.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 10, $alloc_flg, value);
	}


	/**
	 * Shipping ordered 出荷指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 11, $inst_flg);
	}

	/**
	 * Shipping ordered 出荷指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 11, $inst_flg, value);
	}


	/**
	 * Shipping resulted 出荷実績済.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 12, $act_flg);
	}

	/**
	 * Shipping resulted 出荷実績済.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 12, $act_flg, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 13, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 13, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			return gi_def_loc_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			return wk_peg_no();
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			return wk_ret_peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
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
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			return ship_wk_cd();
		}
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			return gi_def_loc_cd();
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_to_lg_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($wk_peg_no.equalsIgnoreCase(name)) {
			return wk_peg_no();
		}
		if ($wk_ret_peg_no.equalsIgnoreCase(name)) {
			return wk_ret_peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
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
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			gi_def_loc_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
	public void setDate(String name, MCDate value) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
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
		if ($ship_wk_cd.equalsIgnoreCase(name)) {
			ship_wk_cd(value);
			return;
		}
		if ($gi_def_loc_cd.equalsIgnoreCase(name)) {
			gi_def_loc_cd(value);
			return;
		}
		if ($ship_to_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_to_lg_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xs.equalsIgnoreCase(name)) {
			return xs();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xs.equalsIgnoreCase(name)) {
			xs(
				((MCContainerMeta) xs_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return xs().xfr_schd_no();
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		xs().xfr_schd_no(value);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return xs().xfr_src_typ();
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		xs().xfr_src_typ(value);
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return xs().xfr_src_no();
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		xs().xfr_src_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return xs().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		xs().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return xs().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		xs().trd_ptn_typ(value);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return xs().gi_lg_grp_cd();
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		xs().gi_lg_grp_cd(value);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return xs().gi_loc_cd();
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		xs().gi_loc_cd(value);
	}

	/**
	 * GI rack/line cd. 出庫棚ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return xs().gi_str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		xs().gi_str_ln_cd(value);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return xs().gi_stk_arrv_bp_cd();
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		xs().gi_stk_arrv_bp_cd(value);
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public String gr_lg_grp_cd() {
		return xs().gr_lg_grp_cd();
	}

	/**
	 * GR distribution group cd. 入庫物流グループＣＤ.<p>
	 *
	 */
	public void gr_lg_grp_cd(String value) {
		xs().gr_lg_grp_cd(value);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return xs().gr_loc_cd();
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		xs().gr_loc_cd(value);
	}

	/**
	 * GR rack/line cd. 入庫棚ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return xs().gr_str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		xs().gr_str_ln_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return xs().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		xs().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return xs().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		xs().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return xs().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		xs().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return xs().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		xs().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return xs().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		xs().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return xs().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		xs().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return xs().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		xs().ver_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return xs().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		xs().sno1(value);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return xs().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		xs().sno1_null_flg(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return xs().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		xs().sno2(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return xs().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		xs().sno2_null_flg(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return xs().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		xs().sno3(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return xs().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		xs().sno3_null_flg(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return xs().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		xs().sno4(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return xs().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		xs().sno4_null_flg(value);
	}

	/**
	 * Grading cd. 格付けＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return xs().gd_cd();
	}

	/**
	 * Grading cd. 格付けＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		xs().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return xs().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		xs().quality_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return xs().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		xs().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return xs().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		xs().stk_bp_cd(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return xs().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		xs().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return xs().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		xs().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		xs().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		xs().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		xs().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		xs().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return xs().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		xs().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return xs().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		xs().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		xs().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		xs().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		xs().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		xs().base_unit_qty(value);
	}

	/**
	 * Desired GI date and time 出庫希望日時.<p>
	 *
	 */
	public MCDate gi_rqst_tm() {
		return xs().gi_rqst_tm();
	}

	/**
	 * Desired GI date and time 出庫希望日時.<p>
	 *
	 */
	public void gi_rqst_tm(MCDate value) {
		xs().gi_rqst_tm(value);
	}

	/**
	 * Desired GR date and time 入庫希望日時.<p>
	 *
	 */
	public MCDate gr_rqst_tm() {
		return xs().gr_rqst_tm();
	}

	/**
	 * Desired GR date and time 入庫希望日時.<p>
	 *
	 */
	public void gr_rqst_tm(MCDate value) {
		xs().gr_rqst_tm(value);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return xs().rcpt_dt();
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		xs().rcpt_dt(value);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return xs().ship_term_cd();
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		xs().ship_term_cd(value);
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return xs().ship_inst_typ();
	}

	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		xs().ship_inst_typ(value);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return xs().ship_to_id_typ();
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		xs().ship_to_id_typ(value);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return xs().ship_to_id_cd();
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		xs().ship_to_id_cd(value);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return xs().ship_to_id_nm();
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		xs().ship_to_id_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return xs().ship_to_zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		xs().ship_to_zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return xs().ship_to_addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		xs().ship_to_addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return xs().ship_to_addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		xs().ship_to_addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return xs().ship_to_addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		xs().ship_to_addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return xs().ship_to_addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		xs().ship_to_addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return xs().ship_to_cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		xs().ship_to_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return xs().ship_to_cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		xs().ship_to_cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return xs().ship_to_tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		xs().ship_to_tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return xs().ship_to_fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		xs().ship_to_fax(value);
	}

	/**
	 * Miscellaneous receiving point flg. 送付先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return xs().ship_to_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point flg. 送付先諸口ＦＬＧ.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		xs().ship_to_sundry_flg(value);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return xs().via_dlv_typ();
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		xs().via_dlv_typ(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return xs().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		xs().slo_d_no(value);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return xs().not_lot_mix_flg();
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		xs().not_lot_mix_flg(value);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return xs().not_sublot_mix_flg();
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		xs().not_sublot_mix_flg(value);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return xs().vld_dt_fr();
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		xs().vld_dt_fr(value);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate vld_dt_to() {
		return xs().vld_dt_to();
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void vld_dt_to(MCDate value) {
		xs().vld_dt_to(value);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return xs().prov_typ();
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		xs().prov_typ(value);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return xs().prov_basis_typ();
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		xs().prov_basis_typ(value);
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
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return xs().ret_prov_typ();
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		xs().ret_prov_typ(value);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return xs().ret_prov_basis_typ();
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		xs().ret_prov_basis_typ(value);
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

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return xs().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		xs().base_ac_dt(value);
	}

}

