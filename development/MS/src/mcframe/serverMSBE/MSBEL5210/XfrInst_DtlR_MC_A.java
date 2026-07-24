package mcframe.serverMSBE.MSBEL5210;

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
 * ブロック"XfrInst_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrInst_DtlR_MC_A extends MCConstRow {

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
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $xid = "xid";
	public static final String $xas = "xas";
	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public static final String $cont_qty = "cont_qty";
	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public static final String $inst_rem_abort_flg = "inst_rem_abort_flg";
	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public static final String $inst_bndl_src_flg = "inst_bndl_src_flg";
	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public static final String $inst_bndl_peg_no = "inst_bndl_peg_no";
	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public static final String $inst_bndl_to_peg_no = "inst_bndl_to_peg_no";
	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $xfr_alloc_sts_no = "xfr_alloc_sts_no";
	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $old_xfr_alloc_sts_no = "old_xfr_alloc_sts_no";
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

	public static final String $xfr_inst_d_no = $xid + ".xfr_inst_d_no";
	public static final String $xfr_inst_no = $xid + ".xfr_inst_no";
	public static final String $itm_cd = $xid + ".itm_cd";
	public static final String $itm_sub1 = $xid + ".itm_sub1";
	public static final String $itm_sub2 = $xid + ".itm_sub2";
	public static final String $itm_sub3 = $xid + ".itm_sub3";
	public static final String $base_dlv_slip_no = $xid + ".base_dlv_slip_no";
	public static final String $base_prov_act_no = $xid + ".base_prov_act_no";
	public static final String $base_ac_dt = $xid + ".base_ac_dt";
	public static final String $pr_sts_typ = $xas + ".pr_sts_typ";
	public static final String $gi_loc_cd = $xas + ".gi_loc_cd";
	public static final String $gi_str_ln_cd = $xas + ".gi_str_ln_cd";
	public static final String $gi_stk_arrv_bp_cd = $xas + ".gi_stk_arrv_bp_cd";
	public static final String $gr_str_ln_cd = $xas + ".gr_str_ln_cd";
	public static final String $lot_no = $xas + ".lot_no";
	public static final String $sublot_no = $xas + ".sublot_no";
	public static final String $sno1 = $xas + ".sno1";
	public static final String $sno2 = $xas + ".sno2";
	public static final String $sno3 = $xas + ".sno3";
	public static final String $sno4 = $xas + ".sno4";
	public static final String $ver_no = $xas + ".ver_no";
	public static final String $gd_cd = $xas + ".gd_cd";
	public static final String $quality_typ = $xas + ".quality_typ";
	public static final String $stk_id_typ = $xas + ".stk_id_typ";
	public static final String $stk_bp_cd = $xas + ".stk_bp_cd";
	public static final String $trd_unit_cd = $xas + ".trd_unit_cd";
	public static final String $trd_unit_qty = $xas + ".trd_unit_qty";
	public static final String $base_unit_cd = $xas + ".base_unit_cd";
	public static final String $base_unit_qty = $xas + ".base_unit_qty";
	public static final String $rsn_cd = $xas + ".rsn_cd";
	public static final String $bd_dpt_cd = $xas + ".bd_dpt_cd";
	public static final String $abort_flg = $xas + ".abort_flg";
	public static final String $not_lot_mix_flg = $xas + ".not_lot_mix_flg";
	public static final String $not_sublot_mix_flg = $xas + ".not_sublot_mix_flg";
	public static final String $vld_dt_fr = $xas + ".vld_dt_fr";
	public static final String $vld_dt_to = $xas + ".vld_dt_to";
	public static final String $io_schd_pr_no = $xas + ".io_schd_pr_no";
	public static final String $sub_char1 = $xas + ".sub_char1";
	public static final String $sub_char2 = $xas + ".sub_char2";
	public static final String $sub_char3 = $xas + ".sub_char3";
	public static final String $sno1_null_flg = $xas + ".sno1_null_flg";
	public static final String $sno2_null_flg = $xas + ".sno2_null_flg";
	public static final String $sno3_null_flg = $xas + ".sno3_null_flg";
	public static final String $sno4_null_flg = $xas + ".sno4_null_flg";
	public static final String $alloc_sno1 = $xas + ".alloc_sno1";
	public static final String $alloc_sno2 = $xas + ".alloc_sno2";
	public static final String $alloc_sno3 = $xas + ".alloc_sno3";
	public static final String $alloc_sno4 = $xas + ".alloc_sno4";
	public static final String $alloc_flg = $xas + ".alloc_flg";
	public static final String $ship_inst_typ = $xas + ".ship_inst_typ";
	public static final String $inst_bndl_flg = $xas + ".inst_bndl_flg";
	public static final String $dlv_slip_no = $xas + ".dlv_slip_no";
	public static final String $dlv_slip_seq = $xas + ".dlv_slip_seq";
	public static final String $dlv_slip_d_no = $xas + ".dlv_slip_d_no";
	public static final String $disp_seq = $xas + ".disp_seq";
	public static final String $xfr_schd_no = $xas + ".xfr_schd_no";
	public static final String $prov_typ = $xas + ".prov_typ";
	public static final String $prov_basis_typ = $xas + ".prov_basis_typ";
	public static final String $ret_prov_typ = $xas + ".ret_prov_typ";
	public static final String $ret_prov_basis_typ = $xas + ".ret_prov_basis_typ";
	public static final String $trd_d_rmrks = $xas + ".trd_d_rmrks";
	public static final String $inst_d_rmrks = $xas + ".inst_d_rmrks";
	public static final String $intr_d_rmrks = $xas + ".intr_d_rmrks";
	public static final String $wms_flg = $xas + ".wms_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta xid_META = createInnerRowMeta($xid, mcframe.serverMS.dbc.MST_XFR_INST_D_R.class);
	public static final MCMeta xas_META = createInnerRowMeta($xas, mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R.class);
	public static final MCMeta cont_qty_META = createCommonMeta($cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta inst_rem_abort_flg_META = createCommonMeta($inst_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_src_flg_META = createCommonMeta($inst_bndl_src_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_peg_no_META = createCommonMeta($inst_bndl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inst_bndl_to_peg_no_META = createCommonMeta($inst_bndl_to_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta xfr_alloc_sts_no_META = createCommonMeta($xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta old_xfr_alloc_sts_no_META = createCommonMeta($old_xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta ret_prov_schd_no_META = createCommonMeta($ret_prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);

	protected static final ConstMetaList<XfrInst_DtlR> constMetas = new ConstMetaList<XfrInst_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			data_crud_typ_META,
			xid_META,
			xas_META,
			cont_qty_META,
			inst_rem_abort_flg_META,
			inst_bndl_src_flg_META,
			inst_bndl_peg_no_META,
			inst_bndl_to_peg_no_META,
			xfr_alloc_sts_no_META,
			old_xfr_alloc_sts_no_META,
			prov_schd_no_META,
			ret_prov_schd_no_META
		},
		new String[][]{
			{
				"xfr_inst_d_no",
				"xfr_inst_no",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"base_dlv_slip_no",
				"base_prov_act_no",
				"base_ac_dt",
				"pr_sts_typ",
				"gi_loc_cd",
				"gi_str_ln_cd",
				"gi_stk_arrv_bp_cd",
				"gr_str_ln_cd",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"ver_no",
				"gd_cd",
				"quality_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty",
				"rsn_cd",
				"bd_dpt_cd",
				"abort_flg",
				"not_lot_mix_flg",
				"not_sublot_mix_flg",
				"vld_dt_fr",
				"vld_dt_to",
				"io_schd_pr_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sno1_null_flg",
				"sno2_null_flg",
				"sno3_null_flg",
				"sno4_null_flg",
				"alloc_sno1",
				"alloc_sno2",
				"alloc_sno3",
				"alloc_sno4",
				"alloc_flg",
				"ship_inst_typ",
				"inst_bndl_flg",
				"dlv_slip_no",
				"dlv_slip_seq",
				"dlv_slip_d_no",
				"disp_seq",
				"xfr_schd_no",
				"prov_typ",
				"prov_basis_typ",
				"ret_prov_typ",
				"ret_prov_basis_typ",
				"trd_d_rmrks",
				"inst_d_rmrks",
				"intr_d_rmrks",
				"wms_flg"
			},
			{
				$xfr_inst_d_no,
				$xfr_inst_no,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$base_dlv_slip_no,
				$base_prov_act_no,
				$base_ac_dt,
				$pr_sts_typ,
				$gi_loc_cd,
				$gi_str_ln_cd,
				$gi_stk_arrv_bp_cd,
				$gr_str_ln_cd,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$ver_no,
				$gd_cd,
				$quality_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty,
				$rsn_cd,
				$bd_dpt_cd,
				$abort_flg,
				$not_lot_mix_flg,
				$not_sublot_mix_flg,
				$vld_dt_fr,
				$vld_dt_to,
				$io_schd_pr_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sno1_null_flg,
				$sno2_null_flg,
				$sno3_null_flg,
				$sno4_null_flg,
				$alloc_sno1,
				$alloc_sno2,
				$alloc_sno3,
				$alloc_sno4,
				$alloc_flg,
				$ship_inst_typ,
				$inst_bndl_flg,
				$dlv_slip_no,
				$dlv_slip_seq,
				$dlv_slip_d_no,
				$disp_seq,
				$xfr_schd_no,
				$prov_typ,
				$prov_basis_typ,
				$ret_prov_typ,
				$ret_prov_basis_typ,
				$trd_d_rmrks,
				$inst_d_rmrks,
				$intr_d_rmrks,
				$wms_flg
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
	protected XfrInst_DtlR_MC_A(ConstMetaList<? extends XfrInst_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_DtlR clone() {
		return (XfrInst_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_DtlR createInstance() {
		return (XfrInst_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInst_DtlR getValues(String... names) {
		return (XfrInst_DtlR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_XFR_INST_D_R xid(){
		return (mcframe.serverMS.dbc.MST_XFR_INST_D_R) getConstInnerRow(offset + 3, $xid);
	}
	
	public void xid(mcframe.serverMS.dbc.MST_XFR_INST_D_R row){
		setConstInnerRow(offset + 3, $xid, row);
	}


	public mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R xas(){
		return (mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R) getConstInnerRow(offset + 4, $xas);
	}
	
	public void xas(mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R row){
		setConstInnerRow(offset + 4, $xas, row);
	}


	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return getConstNumber(offset + 5, $cont_qty);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		setConstNumber(offset + 5, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		setConstNumber(offset + 5, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		setConstNumber(offset + 5, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		setConstNumber(offset + 5, $cont_qty, value);
	}

	/**
	 * Input active ingredient 投入有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		setConstNumber(offset + 5, $cont_qty, value);
	}


	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public boolean inst_rem_abort_flg() {
		return getConstBoolean(offset + 6, $inst_rem_abort_flg);
	}

	/**
	 * Cancel remaining order qty. flg. 指図残数打切ＦＬＧ.<p>
	 *
	 */
	public void inst_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 6, $inst_rem_abort_flg, value);
	}


	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public boolean inst_bndl_src_flg() {
		return getConstBoolean(offset + 7, $inst_bndl_src_flg);
	}

	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public void inst_bndl_src_flg(boolean value) {
		setConstBoolean(offset + 7, $inst_bndl_src_flg, value);
	}


	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inst_bndl_peg_no() {
		return getConstNumber(offset + 8, $inst_bndl_peg_no);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(MCNumber value) {
		setConstNumber(offset + 8, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(int value) {
		setConstNumber(offset + 8, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(long value) {
		setConstNumber(offset + 8, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(float value) {
		setConstNumber(offset + 8, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(double value) {
		setConstNumber(offset + 8, $inst_bndl_peg_no, value);
	}


	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inst_bndl_to_peg_no() {
		return getConstNumber(offset + 9, $inst_bndl_to_peg_no);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(MCNumber value) {
		setConstNumber(offset + 9, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(int value) {
		setConstNumber(offset + 9, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(long value) {
		setConstNumber(offset + 9, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(float value) {
		setConstNumber(offset + 9, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(double value) {
		setConstNumber(offset + 9, $inst_bndl_to_peg_no, value);
	}


	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return getConstString(offset + 10, $xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		setConstString(offset + 10, $xfr_alloc_sts_no, value);
	}


	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public String old_xfr_alloc_sts_no() {
		return getConstString(offset + 11, $old_xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public void old_xfr_alloc_sts_no(String value) {
		setConstString(offset + 11, $old_xfr_alloc_sts_no, value);
	}


	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 12, $prov_schd_no);
	}

	/**
	 * Supply schedule No. 支給予定ＮＯ.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 12, $prov_schd_no, value);
	}


	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return getConstString(offset + 13, $ret_prov_schd_no);
	}

	/**
	 * Supply schedule No. (Return) 支給予定ＮＯ（返品）.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		setConstString(offset + 13, $ret_prov_schd_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_peg_no();
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_to_peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			return inst_rem_abort_flg();
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			return inst_bndl_src_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			return cont_qty();
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_peg_no();
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_to_peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			return inst_rem_abort_flg();
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			return inst_bndl_src_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			inst_rem_abort_flg(value);
			return;
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			inst_bndl_src_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
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
		if ($cont_qty.equalsIgnoreCase(name)) {
			cont_qty(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inst_rem_abort_flg.equalsIgnoreCase(name)) {
			inst_rem_abort_flg(value);
			return;
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			inst_bndl_src_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($xid.equalsIgnoreCase(name)) {
			return xid();
		}
		if ($xas.equalsIgnoreCase(name)) {
			return xas();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($xid.equalsIgnoreCase(name)) {
			xid(
				((MCContainerMeta) xid_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_INST_D_R.class, value)
			);
			return;
		}
		if ($xas.equalsIgnoreCase(name)) {
			xas(
				((MCContainerMeta) xas_META).castInnerRow(mcframe.serverMS.dbc.MST_XFR_ALLOC_STS_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return xid().xfr_inst_d_no();
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		xid().xfr_inst_d_no(value);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return xid().xfr_inst_no();
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		xid().xfr_inst_no(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return xid().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		xid().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return xid().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		xid().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return xid().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		xid().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return xid().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		xid().itm_sub3(value);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return xid().base_dlv_slip_no();
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		xid().base_dlv_slip_no(value);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return xid().base_prov_act_no();
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		xid().base_prov_act_no(value);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return xid().base_ac_dt();
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		xid().base_ac_dt(value);
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return xas().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		xas().abort_flg(value);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return xas().not_lot_mix_flg();
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		xas().not_lot_mix_flg(value);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return xas().not_sublot_mix_flg();
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
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
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return xas().sno1_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		xas().sno1_null_flg(value);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return xas().sno2_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		xas().sno2_null_flg(value);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return xas().sno3_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		xas().sno3_null_flg(value);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return xas().sno4_null_flg();
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
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
	 * Location allocation 場所引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return xas().alloc_flg();
	}

	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		xas().alloc_flg(value);
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
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return xas().inst_bndl_flg();
	}

	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		xas().inst_bndl_flg(value);
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
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return xas().dlv_slip_seq();
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		xas().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		xas().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		xas().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		xas().dlv_slip_seq(value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		xas().dlv_slip_seq(value);
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

}

