package mcframe.serverMSBD.MSBDL5090;

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
 * ブロック"PoSchd_Upd03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoSchd_Upd03_DtlR_MC_A extends MCConstRow {

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
	public static final String $po_schd = "po_schd";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";

	public static final String $po_schd_no = $po_schd + ".po_schd_no";
	public static final String $po_schd_src_typ = $po_schd + ".po_schd_src_typ";
	public static final String $po_schd_src_no = $po_schd + ".po_schd_src_no";
	public static final String $io_schd_pr_no = $po_schd + ".io_schd_pr_no";
	public static final String $trd_cd = $po_schd + ".trd_cd";
	public static final String $trd_ptn_typ = $po_schd + ".trd_ptn_typ";
	public static final String $itm_cd = $po_schd + ".itm_cd";
	public static final String $itm_sub1 = $po_schd + ".itm_sub1";
	public static final String $itm_sub2 = $po_schd + ".itm_sub2";
	public static final String $itm_sub3 = $po_schd + ".itm_sub3";
	public static final String $itm_nm = $po_schd + ".itm_nm";
	public static final String $iv_itm_nm = $po_schd + ".iv_itm_nm";
	public static final String $ver_no = $po_schd + ".ver_no";
	public static final String $sppl_itm_cd = $po_schd + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $po_schd + ".sppl_itm_nm";
	public static final String $sundry_itm_flg = $po_schd + ".sundry_itm_flg";
	public static final String $sno1 = $po_schd + ".sno1";
	public static final String $sno2 = $po_schd + ".sno2";
	public static final String $sno3 = $po_schd + ".sno3";
	public static final String $sno4 = $po_schd + ".sno4";
	public static final String $purc_rsn_cd = $po_schd + ".purc_rsn_cd";
	public static final String $in_to_loc_cd = $po_schd + ".in_to_loc_cd";
	public static final String $str_ln_cd = $po_schd + ".str_ln_cd";
	public static final String $dlv_cd = $po_schd + ".dlv_cd";
	public static final String $dlv_sundry_flg = $po_schd + ".dlv_sundry_flg";
	public static final String $dlv_nm = $po_schd + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $po_schd + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $po_schd + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $po_schd + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $po_schd + ".dlv_addr1";
	public static final String $dlv_addr2 = $po_schd + ".dlv_addr2";
	public static final String $dlv_addr3 = $po_schd + ".dlv_addr3";
	public static final String $dlv_addr4 = $po_schd + ".dlv_addr4";
	public static final String $dlv_tel = $po_schd + ".dlv_tel";
	public static final String $dlv_fax = $po_schd + ".dlv_fax";
	public static final String $tdlv_cd = $po_schd + ".tdlv_cd";
	public static final String $tdlv_sundry_flg = $po_schd + ".tdlv_sundry_flg";
	public static final String $tdlv_nm = $po_schd + ".tdlv_nm";
	public static final String $tdlv_zip_cd = $po_schd + ".tdlv_zip_cd";
	public static final String $tdlv_cntct_dpt = $po_schd + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $po_schd + ".tdlv_cntct_psn";
	public static final String $tdlv_addr1 = $po_schd + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $po_schd + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $po_schd + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $po_schd + ".tdlv_addr4";
	public static final String $tdlv_tel = $po_schd + ".tdlv_tel";
	public static final String $tdlv_fax = $po_schd + ".tdlv_fax";
	public static final String $reg_dt = $po_schd + ".reg_dt";
	public static final String $rqst_wg_cd = $po_schd + ".rqst_wg_cd";
	public static final String $purc_usr_cd = $po_schd + ".purc_usr_cd";
	public static final String $purc_dpt_cd = $po_schd + ".purc_dpt_cd";
	public static final String $wg_cd = $po_schd + ".wg_cd";
	public static final String $sppl_cd = $po_schd + ".sppl_cd";
	public static final String $maker_cd = $po_schd + ".maker_cd";
	public static final String $outsrc_flg = $po_schd + ".outsrc_flg";
	public static final String $outsrc_itm_ord_crt_flg = $po_schd + ".outsrc_itm_ord_crt_flg";
	public static final String $outsrc_itm_ord_no = $po_schd + ".outsrc_itm_ord_no";
	public static final String $pln_itm_ord_no = $po_schd + ".pln_itm_ord_no";
	public static final String $mfg_loc_cd = $po_schd + ".mfg_loc_cd";
	public static final String $bom_ptn = $po_schd + ".bom_ptn";
	public static final String $trd_unit_qty = $po_schd + ".trd_unit_qty";
	public static final String $trd_unit_cd = $po_schd + ".trd_unit_cd";
	public static final String $base_unit_qty = $po_schd + ".base_unit_qty";
	public static final String $base_unit_cd = $po_schd + ".base_unit_cd";
	public static final String $purc_upri_req_typ = $po_schd + ".purc_upri_req_typ";
	public static final String $trd_cur_cd = $po_schd + ".trd_cur_cd";
	public static final String $tax_cd = $po_schd + ".tax_cd";
	public static final String $xrate_inpt_flg = $po_schd + ".xrate_inpt_flg";
	public static final String $xrate = $po_schd + ".xrate";
	public static final String $ptax_xrate = $po_schd + ".ptax_xrate";
	public static final String $ptax_xrate_inpt_flg = $po_schd + ".ptax_xrate_inpt_flg";
	public static final String $upri_not_tgt_flg = $po_schd + ".upri_not_tgt_flg";
	public static final String $interim_flg = $po_schd + ".interim_flg";
	public static final String $trd_cur_upri = $po_schd + ".trd_cur_upri";
	public static final String $trd_cur_proc_upri = $po_schd + ".trd_cur_proc_upri";
	public static final String $trd_cur_onr_prov_upri = $po_schd + ".trd_cur_onr_prov_upri";
	public static final String $trd_cur_amt = $po_schd + ".trd_cur_amt";
	public static final String $trd_cur_proc_amt = $po_schd + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_amt = $po_schd + ".trd_cur_onr_prov_amt";
	public static final String $trd_cur_tax_amt = $po_schd + ".trd_cur_tax_amt";
	public static final String $po_schd_dt = $po_schd + ".po_schd_dt";
	public static final String $rqst_dlv_rqst_tm = $po_schd + ".rqst_dlv_rqst_tm";
	public static final String $dlv_rqst_tm = $po_schd + ".dlv_rqst_tm";
	public static final String $rqst_avl_rqst_dt = $po_schd + ".rqst_avl_rqst_dt";
	public static final String $purc_schd_dt = $po_schd + ".purc_schd_dt";
	public static final String $purc_lt = $po_schd + ".purc_lt";
	public static final String $drct_dlv_typ = $po_schd + ".drct_dlv_typ";
	public static final String $po_schd_chg_typ = $po_schd + ".po_schd_chg_typ";
	public static final String $rqst_upd_stop_flg = $po_schd + ".rqst_upd_stop_flg";
	public static final String $rqst_crrct_flg = $po_schd + ".rqst_crrct_flg";
	public static final String $split_src_schd_no = $po_schd + ".split_src_schd_no";
	public static final String $bd_itm_cd = $po_schd + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $po_schd + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $po_schd + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $po_schd + ".bd_itm_sub3";
	public static final String $bd_sno1 = $po_schd + ".bd_sno1";
	public static final String $bd_sno2 = $po_schd + ".bd_sno2";
	public static final String $bd_sno3 = $po_schd + ".bd_sno3";
	public static final String $bd_sno4 = $po_schd + ".bd_sno4";
	public static final String $bd_lot_no = $po_schd + ".bd_lot_no";
	public static final String $bd_sublot_no = $po_schd + ".bd_sublot_no";
	public static final String $bd_loc_cd = $po_schd + ".bd_loc_cd";
	public static final String $bd_dpt_cd = $po_schd + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $po_schd + ".bd_wg_cd";
	public static final String $bd_ctg_cd = $po_schd + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $po_schd + ".bd_oper_cd";
	public static final String $bd_slo_no = $po_schd + ".bd_slo_no";
	public static final String $bd_iv_no = $po_schd + ".bd_iv_no";
	public static final String $bd_po_no = $po_schd + ".bd_po_no";
	public static final String $bd_bp_cd = $po_schd + ".bd_bp_cd";
	public static final String $org_flg = $po_schd + ".org_flg";
	public static final String $can_flg = $po_schd + ".can_flg";
	public static final String $abort_flg = $po_schd + ".abort_flg";
	public static final String $add_flg = $po_schd + ".add_flg";
	public static final String $base_unit_po_qty = $po_schd + ".base_unit_po_qty";
	public static final String $po_flg = $po_schd + ".po_flg";
	public static final String $intr_rmrks = $po_schd + ".intr_rmrks";
	public static final String $trd_d_rmrks = $po_schd + ".trd_d_rmrks";
	public static final String $po_cnt_rmrks = $po_schd + ".po_cnt_rmrks";
	public static final String $slo_no = $po_schd + ".slo_no";
	public static final String $slo_d_no = $po_schd + ".slo_d_no";
	public static final String $po_no = $po_schd + ".po_no";
	public static final String $po_d_no = $po_schd + ".po_d_no";
	public static final String $sub_char1 = $po_schd + ".sub_char1";
	public static final String $sub_char2 = $po_schd + ".sub_char2";
	public static final String $sub_char3 = $po_schd + ".sub_char3";
	public static final String $rqst_fr_dpt_cd = $po_schd + ".rqst_fr_dpt_cd";
	public static final String $rqst_fr_usr_cd = $po_schd + ".rqst_fr_usr_cd";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta po_schd_META = createInnerRowMeta($po_schd, mcframe.serverMS.dbc.MST_PO_SCHD_R.class);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PoSchd_Upd03_DtlR> constMetas = new ConstMetaList<PoSchd_Upd03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			po_schd_META,
			inc_tax_flg_META
		},
		new String[][]{
			{
				"po_schd_no",
				"po_schd_src_typ",
				"po_schd_src_no",
				"io_schd_pr_no",
				"trd_cd",
				"trd_ptn_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"ver_no",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"sundry_itm_flg",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"purc_rsn_cd",
				"in_to_loc_cd",
				"str_ln_cd",
				"dlv_cd",
				"dlv_sundry_flg",
				"dlv_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"tdlv_cd",
				"tdlv_sundry_flg",
				"tdlv_nm",
				"tdlv_zip_cd",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"reg_dt",
				"rqst_wg_cd",
				"purc_usr_cd",
				"purc_dpt_cd",
				"wg_cd",
				"sppl_cd",
				"maker_cd",
				"outsrc_flg",
				"outsrc_itm_ord_crt_flg",
				"outsrc_itm_ord_no",
				"pln_itm_ord_no",
				"mfg_loc_cd",
				"bom_ptn",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"purc_upri_req_typ",
				"trd_cur_cd",
				"tax_cd",
				"xrate_inpt_flg",
				"xrate",
				"ptax_xrate",
				"ptax_xrate_inpt_flg",
				"upri_not_tgt_flg",
				"interim_flg",
				"trd_cur_upri",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"trd_cur_amt",
				"trd_cur_proc_amt",
				"trd_cur_onr_prov_amt",
				"trd_cur_tax_amt",
				"po_schd_dt",
				"rqst_dlv_rqst_tm",
				"dlv_rqst_tm",
				"rqst_avl_rqst_dt",
				"purc_schd_dt",
				"purc_lt",
				"drct_dlv_typ",
				"po_schd_chg_typ",
				"rqst_upd_stop_flg",
				"rqst_crrct_flg",
				"split_src_schd_no",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_loc_cd",
				"bd_dpt_cd",
				"bd_wg_cd",
				"bd_ctg_cd",
				"bd_oper_cd",
				"bd_slo_no",
				"bd_iv_no",
				"bd_po_no",
				"bd_bp_cd",
				"org_flg",
				"can_flg",
				"abort_flg",
				"add_flg",
				"base_unit_po_qty",
				"po_flg",
				"intr_rmrks",
				"trd_d_rmrks",
				"po_cnt_rmrks",
				"slo_no",
				"slo_d_no",
				"po_no",
				"po_d_no",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"rqst_fr_dpt_cd",
				"rqst_fr_usr_cd"
			},
			{
				$po_schd_no,
				$po_schd_src_typ,
				$po_schd_src_no,
				$io_schd_pr_no,
				$trd_cd,
				$trd_ptn_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$ver_no,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$sundry_itm_flg,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$purc_rsn_cd,
				$in_to_loc_cd,
				$str_ln_cd,
				$dlv_cd,
				$dlv_sundry_flg,
				$dlv_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$tdlv_cd,
				$tdlv_sundry_flg,
				$tdlv_nm,
				$tdlv_zip_cd,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$reg_dt,
				$rqst_wg_cd,
				$purc_usr_cd,
				$purc_dpt_cd,
				$wg_cd,
				$sppl_cd,
				$maker_cd,
				$outsrc_flg,
				$outsrc_itm_ord_crt_flg,
				$outsrc_itm_ord_no,
				$pln_itm_ord_no,
				$mfg_loc_cd,
				$bom_ptn,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$purc_upri_req_typ,
				$trd_cur_cd,
				$tax_cd,
				$xrate_inpt_flg,
				$xrate,
				$ptax_xrate,
				$ptax_xrate_inpt_flg,
				$upri_not_tgt_flg,
				$interim_flg,
				$trd_cur_upri,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$trd_cur_amt,
				$trd_cur_proc_amt,
				$trd_cur_onr_prov_amt,
				$trd_cur_tax_amt,
				$po_schd_dt,
				$rqst_dlv_rqst_tm,
				$dlv_rqst_tm,
				$rqst_avl_rqst_dt,
				$purc_schd_dt,
				$purc_lt,
				$drct_dlv_typ,
				$po_schd_chg_typ,
				$rqst_upd_stop_flg,
				$rqst_crrct_flg,
				$split_src_schd_no,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_loc_cd,
				$bd_dpt_cd,
				$bd_wg_cd,
				$bd_ctg_cd,
				$bd_oper_cd,
				$bd_slo_no,
				$bd_iv_no,
				$bd_po_no,
				$bd_bp_cd,
				$org_flg,
				$can_flg,
				$abort_flg,
				$add_flg,
				$base_unit_po_qty,
				$po_flg,
				$intr_rmrks,
				$trd_d_rmrks,
				$po_cnt_rmrks,
				$slo_no,
				$slo_d_no,
				$po_no,
				$po_d_no,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$rqst_fr_dpt_cd,
				$rqst_fr_usr_cd
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
	protected PoSchd_Upd03_DtlR_MC_A(ConstMetaList<? extends PoSchd_Upd03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd03_DtlR clone() {
		return (PoSchd_Upd03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd03_DtlR createInstance() {
		return (PoSchd_Upd03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoSchd_Upd03_DtlR getValues(String... names) {
		return (PoSchd_Upd03_DtlR) super.getValues(names);
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


	public mcframe.serverMS.dbc.MST_PO_SCHD_R po_schd(){
		return (mcframe.serverMS.dbc.MST_PO_SCHD_R) getConstInnerRow(offset + 2, $po_schd);
	}
	
	public void po_schd(mcframe.serverMS.dbc.MST_PO_SCHD_R row){
		setConstInnerRow(offset + 2, $po_schd, row);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 3, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 3, $inc_tax_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
	public void setBoolean(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($po_schd.equalsIgnoreCase(name)) {
			return po_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($po_schd.equalsIgnoreCase(name)) {
			po_schd(
				((MCContainerMeta) po_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return po_schd().po_schd_no();
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		po_schd().po_schd_no(value);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return po_schd().po_schd_src_typ();
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		po_schd().po_schd_src_typ(value);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return po_schd().po_schd_src_no();
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		po_schd().po_schd_src_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return po_schd().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		po_schd().io_schd_pr_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return po_schd().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		po_schd().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return po_schd().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		po_schd().trd_ptn_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return po_schd().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		po_schd().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return po_schd().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		po_schd().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return po_schd().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		po_schd().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return po_schd().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		po_schd().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return po_schd().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		po_schd().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return po_schd().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		po_schd().iv_itm_nm(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return po_schd().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		po_schd().ver_no(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return po_schd().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		po_schd().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return po_schd().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		po_schd().sppl_itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return po_schd().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		po_schd().sundry_itm_flg(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return po_schd().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		po_schd().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return po_schd().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		po_schd().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return po_schd().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		po_schd().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return po_schd().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		po_schd().sno4(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return po_schd().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		po_schd().purc_rsn_cd(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return po_schd().in_to_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		po_schd().in_to_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return po_schd().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		po_schd().str_ln_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return po_schd().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		po_schd().dlv_cd(value);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return po_schd().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		po_schd().dlv_sundry_flg(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return po_schd().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		po_schd().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return po_schd().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		po_schd().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return po_schd().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		po_schd().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return po_schd().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		po_schd().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return po_schd().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		po_schd().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return po_schd().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		po_schd().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return po_schd().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		po_schd().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return po_schd().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		po_schd().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return po_schd().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		po_schd().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return po_schd().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		po_schd().dlv_fax(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return po_schd().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		po_schd().tdlv_cd(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return po_schd().tdlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		po_schd().tdlv_sundry_flg(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return po_schd().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		po_schd().tdlv_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return po_schd().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		po_schd().tdlv_zip_cd(value);
	}

	/**
	 * Delivery destination dept. 配送先担当部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return po_schd().tdlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 配送先担当部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		po_schd().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return po_schd().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		po_schd().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return po_schd().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		po_schd().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return po_schd().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		po_schd().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return po_schd().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		po_schd().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return po_schd().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		po_schd().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return po_schd().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		po_schd().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return po_schd().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		po_schd().tdlv_fax(value);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate reg_dt() {
		return po_schd().reg_dt();
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		po_schd().reg_dt(value);
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return po_schd().rqst_wg_cd();
	}

	/**
	 * Requesting WG cd. 依頼元ＷＧ ＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		po_schd().rqst_wg_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return po_schd().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		po_schd().purc_usr_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return po_schd().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		po_schd().purc_dpt_cd(value);
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return po_schd().wg_cd();
	}

	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		po_schd().wg_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return po_schd().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		po_schd().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return po_schd().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		po_schd().maker_cd(value);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return po_schd().outsrc_flg();
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		po_schd().outsrc_flg(value);
	}

	/**
	 * Create subcontracting item order 外注品目オーダ作成.<p>
	 *
	 */
	public boolean outsrc_itm_ord_crt_flg() {
		return po_schd().outsrc_itm_ord_crt_flg();
	}

	/**
	 * Create subcontracting item order 外注品目オーダ作成.<p>
	 *
	 */
	public void outsrc_itm_ord_crt_flg(boolean value) {
		po_schd().outsrc_itm_ord_crt_flg(value);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return po_schd().outsrc_itm_ord_no();
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		po_schd().outsrc_itm_ord_no(value);
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public String pln_itm_ord_no() {
		return po_schd().pln_itm_ord_no();
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public void pln_itm_ord_no(String value) {
		po_schd().pln_itm_ord_no(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return po_schd().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		po_schd().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return po_schd().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		po_schd().bom_ptn(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return po_schd().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		po_schd().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return po_schd().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		po_schd().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return po_schd().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		po_schd().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return po_schd().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		po_schd().base_unit_cd(value);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return po_schd().purc_upri_req_typ();
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		po_schd().purc_upri_req_typ(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return po_schd().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		po_schd().trd_cur_cd(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return po_schd().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		po_schd().tax_cd(value);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return po_schd().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		po_schd().xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return po_schd().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		po_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		po_schd().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return po_schd().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		po_schd().ptax_xrate(value);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return po_schd().ptax_xrate_inpt_flg();
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		po_schd().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return po_schd().upri_not_tgt_flg();
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		po_schd().upri_not_tgt_flg(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return po_schd().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		po_schd().interim_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return po_schd().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		po_schd().trd_cur_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return po_schd().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		po_schd().trd_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return po_schd().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		po_schd().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return po_schd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		po_schd().trd_cur_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return po_schd().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		po_schd().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return po_schd().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		po_schd().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return po_schd().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		po_schd().trd_cur_tax_amt(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return po_schd().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		po_schd().po_schd_dt(value);
	}

	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return po_schd().rqst_dlv_rqst_tm();
	}

	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		po_schd().rqst_dlv_rqst_tm(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return po_schd().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		po_schd().dlv_rqst_tm(value);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return po_schd().rqst_avl_rqst_dt();
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		po_schd().rqst_avl_rqst_dt(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return po_schd().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		po_schd().purc_schd_dt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return po_schd().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		po_schd().purc_lt(value);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return po_schd().drct_dlv_typ();
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		po_schd().drct_dlv_typ(value);
	}

	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public String po_schd_chg_typ() {
		return po_schd().po_schd_chg_typ();
	}

	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public void po_schd_chg_typ(String value) {
		po_schd().po_schd_chg_typ(value);
	}

	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public boolean rqst_upd_stop_flg() {
		return po_schd().rqst_upd_stop_flg();
	}

	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public void rqst_upd_stop_flg(boolean value) {
		po_schd().rqst_upd_stop_flg(value);
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public boolean rqst_crrct_flg() {
		return po_schd().rqst_crrct_flg();
	}

	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public void rqst_crrct_flg(boolean value) {
		po_schd().rqst_crrct_flg(value);
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public String split_src_schd_no() {
		return po_schd().split_src_schd_no();
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public void split_src_schd_no(String value) {
		po_schd().split_src_schd_no(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return po_schd().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		po_schd().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return po_schd().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		po_schd().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return po_schd().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		po_schd().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return po_schd().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		po_schd().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return po_schd().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		po_schd().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return po_schd().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		po_schd().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return po_schd().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		po_schd().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return po_schd().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		po_schd().bd_sno4(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return po_schd().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		po_schd().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return po_schd().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		po_schd().bd_sublot_no(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return po_schd().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		po_schd().bd_loc_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return po_schd().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		po_schd().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return po_schd().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ＷＧ ＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		po_schd().bd_wg_cd(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return po_schd().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		po_schd().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return po_schd().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		po_schd().bd_oper_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return po_schd().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		po_schd().bd_slo_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return po_schd().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		po_schd().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return po_schd().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		po_schd().bd_po_no(value);
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public String bd_bp_cd() {
		return po_schd().bd_bp_cd();
	}

	/**
	 * Charged BP cd. 負担取引先ＣＤ.<p>
	 *
	 */
	public void bd_bp_cd(String value) {
		po_schd().bd_bp_cd(value);
	}

	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public boolean org_flg() {
		return po_schd().org_flg();
	}

	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public void org_flg(boolean value) {
		po_schd().org_flg(value);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return po_schd().can_flg();
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		po_schd().can_flg(value);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return po_schd().abort_flg();
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		po_schd().abort_flg(value);
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public boolean add_flg() {
		return po_schd().add_flg();
	}

	/**
	 * Add 追加.<p>
	 *
	 */
	public void add_flg(boolean value) {
		po_schd().add_flg(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public MCNumber base_unit_po_qty() {
		return po_schd().base_unit_po_qty();
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(MCNumber value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(int value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(long value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(float value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * Base unit PO qty. 基準単位発注数量.<p>
	 *
	 */
	public void base_unit_po_qty(double value) {
		po_schd().base_unit_po_qty(value);
	}

	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public boolean po_flg() {
		return po_schd().po_flg();
	}

	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public void po_flg(boolean value) {
		po_schd().po_flg(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return po_schd().intr_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		po_schd().intr_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return po_schd().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		po_schd().trd_d_rmrks(value);
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public String po_cnt_rmrks() {
		return po_schd().po_cnt_rmrks();
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public void po_cnt_rmrks(String value) {
		po_schd().po_cnt_rmrks(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return po_schd().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		po_schd().slo_no(value);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return po_schd().slo_d_no();
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		po_schd().slo_d_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return po_schd().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		po_schd().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return po_schd().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		po_schd().po_d_no(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return po_schd().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		po_schd().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return po_schd().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		po_schd().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return po_schd().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		po_schd().sub_char3(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return po_schd().rqst_fr_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		po_schd().rqst_fr_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return po_schd().rqst_fr_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		po_schd().rqst_fr_usr_cd(value);
	}

}

