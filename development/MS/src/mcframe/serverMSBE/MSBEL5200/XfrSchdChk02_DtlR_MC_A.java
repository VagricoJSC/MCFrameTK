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
 * ブロック"XfrSchdChk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrSchdChk02_DtlR_MC_A extends MCConstRow {

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
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public static final String $ret_xrate = "ret_xrate";
	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public static final String $ret_ptax_xrate = "ret_ptax_xrate";
	/**
	 * Transaction currency cd. (Return) 取引通貨ＣＤ（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_cd = "ret_trd_cur_cd";
	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public static final String $ret_tax_cd = "ret_tax_cd";
	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public static final String $ret_trd_cur_upri = "ret_trd_cur_upri";
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
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public static final String $inst_rem_abort_flg = "inst_rem_abort_flg";
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
	 * Correct cancel remaining only 打切のみ訂正.<p>
	 *
	 */
	public static final String $abort_only_flg = "abort_only_flg";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

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
	public static final String $xfr_schd_dt = $xas + ".xfr_schd_dt";
	public static final String $alloc_flg = $xas + ".alloc_flg";
	public static final String $abort_flg = $xas + ".abort_flg";
	public static final String $not_lot_mix_flg = $xas + ".not_lot_mix_flg";
	public static final String $not_sublot_mix_flg = $xas + ".not_sublot_mix_flg";
	public static final String $vld_dt_fr = $xas + ".vld_dt_fr";
	public static final String $vld_dt_to = $xas + ".vld_dt_to";
	public static final String $prov_typ = $xas + ".prov_typ";
	public static final String $prov_basis_typ = $xas + ".prov_basis_typ";
	public static final String $ret_prov_typ = $xas + ".ret_prov_typ";
	public static final String $ret_prov_basis_typ = $xas + ".ret_prov_basis_typ";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta xas_META = createInnerRowMeta($xas, mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R.class);
	public static final MCMeta old_xfr_alloc_sts_no_META = createCommonMeta($old_xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_xrate_META = createCommonMeta($ret_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_ptax_xrate_META = createCommonMeta($ret_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_trd_cur_cd_META = createCommonMeta($ret_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ret_tax_cd_META = createCommonMeta($ret_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ret_trd_cur_upri_META = createCommonMeta($ret_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta inst_rem_abort_flg_META = createCommonMeta($inst_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_def_loc_cd_META = createCommonMeta($gi_def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta wk_peg_no_META = createCommonMeta($wk_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wk_ret_peg_no_META = createCommonMeta($wk_ret_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta abort_only_flg_META = createCommonMeta($abort_only_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrSchdChk02_DtlR> constMetas = new ConstMetaList<XfrSchdChk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			xas_META,
			old_xfr_alloc_sts_no_META,
			xrate_META,
			ptax_xrate_META,
			trd_cur_cd_META,
			tax_cd_META,
			trd_cur_upri_META,
			ret_xrate_META,
			ret_ptax_xrate_META,
			ret_trd_cur_cd_META,
			ret_tax_cd_META,
			ret_trd_cur_upri_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			inst_rem_abort_flg_META,
			gi_def_loc_cd_META,
			wk_peg_no_META,
			wk_ret_peg_no_META,
			abort_only_flg_META,
			err_flg_META
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
				"xfr_schd_dt",
				"alloc_flg",
				"abort_flg",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_to",
				"prov_typ",
				"prov_basis_typ",
				"ret_prov_typ",
				"ret_prov_basis_typ"
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
				$xfr_schd_dt,
				$alloc_flg,
				$abort_flg,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_to,
				$prov_typ,
				$prov_basis_typ,
				$ret_prov_typ,
				$ret_prov_basis_typ
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
	protected XfrSchdChk02_DtlR_MC_A(ConstMetaList<? extends XfrSchdChk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk02_DtlR clone() {
		return (XfrSchdChk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk02_DtlR createInstance() {
		return (XfrSchdChk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdChk02_DtlR getValues(String... names) {
		return (XfrSchdChk02_DtlR) super.getValues(names);
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
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 4, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 4, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 4, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 4, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 4, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 4, $xrate, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 5, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 5, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 5, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 5, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 5, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 5, $ptax_xrate, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 6, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 6, $trd_cur_cd, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 7, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 7, $tax_cd, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 8, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 8, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 8, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 8, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 8, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 8, $trd_cur_upri, value);
	}


	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public MCNumber ret_xrate() {
		return getConstNumber(offset + 9, $ret_xrate);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(MCNumber value) {
		setConstNumber(offset + 9, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(int value) {
		setConstNumber(offset + 9, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(long value) {
		setConstNumber(offset + 9, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(float value) {
		setConstNumber(offset + 9, $ret_xrate, value);
	}

	/**
	 * Exchange rate (Return) 為替レート（返品）.<p>
	 *
	 */
	public void ret_xrate(double value) {
		setConstNumber(offset + 9, $ret_xrate, value);
	}


	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public MCNumber ret_ptax_xrate() {
		return getConstNumber(offset + 10, $ret_ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 10, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(int value) {
		setConstNumber(offset + 10, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(long value) {
		setConstNumber(offset + 10, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(float value) {
		setConstNumber(offset + 10, $ret_ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate (Return) 納税為替レート（返品）.<p>
	 *
	 */
	public void ret_ptax_xrate(double value) {
		setConstNumber(offset + 10, $ret_ptax_xrate, value);
	}


	/**
	 * Transaction currency cd. (Return) 取引通貨ＣＤ（返品）.<p>
	 *
	 */
	public String ret_trd_cur_cd() {
		return getConstString(offset + 11, $ret_trd_cur_cd);
	}

	/**
	 * Transaction currency cd. (Return) 取引通貨ＣＤ（返品）.<p>
	 *
	 */
	public void ret_trd_cur_cd(String value) {
		setConstString(offset + 11, $ret_trd_cur_cd, value);
	}


	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public String ret_tax_cd() {
		return getConstString(offset + 12, $ret_tax_cd);
	}

	/**
	 * Tax cd. (Return) 税ＣＤ（返品）.<p>
	 *
	 */
	public void ret_tax_cd(String value) {
		setConstString(offset + 12, $ret_tax_cd, value);
	}


	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public MCNumber ret_trd_cur_upri() {
		return getConstNumber(offset + 13, $ret_trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 13, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(int value) {
		setConstNumber(offset + 13, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(long value) {
		setConstNumber(offset + 13, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(float value) {
		setConstNumber(offset + 13, $ret_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) (Return) 取引通貨単価（返品）.<p>
	 *
	 */
	public void ret_trd_cur_upri(double value) {
		setConstNumber(offset + 13, $ret_trd_cur_upri, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 14, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 14, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 15, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 15, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 16, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 16, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 17, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 17, $itm_sub3, value);
	}


	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public boolean inst_rem_abort_flg() {
		return getConstBoolean(offset + 18, $inst_rem_abort_flg);
	}

	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public void inst_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 18, $inst_rem_abort_flg, value);
	}


	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public String gi_def_loc_cd() {
		return getConstString(offset + 19, $gi_def_loc_cd);
	}

	/**
	 * GI default location cd. 出庫デフォルト場所ＣＤ.<p>
	 *
	 */
	public void gi_def_loc_cd(String value) {
		setConstString(offset + 19, $gi_def_loc_cd, value);
	}


	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public MCNumber wk_peg_no() {
		return getConstNumber(offset + 20, $wk_peg_no);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(MCNumber value) {
		setConstNumber(offset + 20, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(int value) {
		setConstNumber(offset + 20, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(long value) {
		setConstNumber(offset + 20, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(float value) {
		setConstNumber(offset + 20, $wk_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work 一時作業用紐付けＮＯ.<p>
	 *
	 */
	public void wk_peg_no(double value) {
		setConstNumber(offset + 20, $wk_peg_no, value);
	}


	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public MCNumber wk_ret_peg_no() {
		return getConstNumber(offset + 21, $wk_ret_peg_no);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(MCNumber value) {
		setConstNumber(offset + 21, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(int value) {
		setConstNumber(offset + 21, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(long value) {
		setConstNumber(offset + 21, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(float value) {
		setConstNumber(offset + 21, $wk_ret_peg_no, value);
	}

	/**
	 * Pegging No. for temporary work (Returns) 一時作業用紐付けＮＯ（返品）.<p>
	 *
	 */
	public void wk_ret_peg_no(double value) {
		setConstNumber(offset + 21, $wk_ret_peg_no, value);
	}


	/**
	 * Correct cancel remaining only 打切のみ訂正.<p>
	 *
	 */
	public boolean abort_only_flg() {
		return getConstBoolean(offset + 22, $abort_only_flg);
	}

	/**
	 * Correct cancel remaining only 打切のみ訂正.<p>
	 *
	 */
	public void abort_only_flg(boolean value) {
		setConstBoolean(offset + 22, $abort_only_flg, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 23, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 23, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			return ret_trd_cur_cd();
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			return ret_tax_cd();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			return ret_xrate();
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			return ret_ptax_xrate();
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			return ret_trd_cur_cd();
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			return ret_tax_cd();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			return ret_xrate();
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			return ret_ptax_xrate();
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			return ret_trd_cur_upri();
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
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			ret_trd_cur_cd(value);
			return;
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			ret_tax_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($ret_trd_cur_cd.equalsIgnoreCase(name)) {
			ret_trd_cur_cd(value);
			return;
		}
		if ($ret_tax_cd.equalsIgnoreCase(name)) {
			ret_tax_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($ret_xrate.equalsIgnoreCase(name)) {
			ret_xrate(value);
			return;
		}
		if ($ret_ptax_xrate.equalsIgnoreCase(name)) {
			ret_ptax_xrate(value);
			return;
		}
		if ($ret_trd_cur_upri.equalsIgnoreCase(name)) {
			ret_trd_cur_upri(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xas.equalsIgnoreCase(name)) {
			return xas();
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

}

