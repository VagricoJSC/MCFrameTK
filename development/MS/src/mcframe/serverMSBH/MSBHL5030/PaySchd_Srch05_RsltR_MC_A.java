package mcframe.serverMSBH.MSBHL5030;

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
 * ブロック"PaySchd_Srch05_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_Srch05_RsltR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	public static final String $ap_d = "ap_d";
	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_ap_d_no = "ref_ap_d_no";
	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public static final String $amt_disp_pm = "amt_disp_pm";
	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public static final String $sw_src_rcv_bill_no = "sw_src_rcv_bill_no";

	public static final String $ap_d_no = $ap_d + ".ap_d_no";
	public static final String $po_no = $ap_d + ".po_no";
	public static final String $po_d_no = $ap_d + ".po_d_no";
	public static final String $purc_act_d_no = $ap_d + ".purc_act_d_no";
	public static final String $purc_act_d_seq = $ap_d + ".purc_act_d_seq";
	public static final String $purc_act_no = $ap_d + ".purc_act_no";
	public static final String $purc_act_seq = $ap_d + ".purc_act_seq";
	public static final String $purc_act_rev = $ap_d + ".purc_act_rev";
	public static final String $bp_dlv_slip_no = $ap_d + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $ap_d + ".bp_dlv_slip_d_no";
	public static final String $rcpt_iv_no = $ap_d + ".rcpt_iv_no";
	public static final String $rcpt_iv_mng_no = $ap_d + ".rcpt_iv_mng_no";
	public static final String $ap_typ = $ap_d + ".ap_typ";
	public static final String $trd_cd = $ap_d + ".trd_cd";
	public static final String $trd_ptn_typ = $ap_d + ".trd_ptn_typ";
	public static final String $slip_sts_typ = $ap_d + ".slip_sts_typ";
	public static final String $sppl_cd = $ap_d + ".sppl_cd";
	public static final String $asppl_cd = $ap_d + ".asppl_cd";
	public static final String $bsppl_cd = $ap_d + ".bsppl_cd";
	public static final String $bsppl_dpt_cd = $ap_d + ".bsppl_dpt_cd";
	public static final String $ap_dpt_cd = $ap_d + ".ap_dpt_cd";
	public static final String $wrk_no = $ap_d + ".wrk_no";
	public static final String $sno1 = $ap_d + ".sno1";
	public static final String $sno2 = $ap_d + ".sno2";
	public static final String $sno3 = $ap_d + ".sno3";
	public static final String $sno4 = $ap_d + ".sno4";
	public static final String $act_dt = $ap_d + ".act_dt";
	public static final String $ac_dt = $ap_d + ".ac_dt";
	public static final String $bsppl_cl_dt = $ap_d + ".bsppl_cl_dt";
	public static final String $bsppl_cl_day = $ap_d + ".bsppl_cl_day";
	public static final String $pay_crryovr_times = $ap_d + ".pay_crryovr_times";
	public static final String $pay_basis_dt = $ap_d + ".pay_basis_dt";
	public static final String $pay_schd_dt = $ap_d + ".pay_schd_dt";
	public static final String $itm_cd = $ap_d + ".itm_cd";
	public static final String $itm_sub1 = $ap_d + ".itm_sub1";
	public static final String $itm_sub2 = $ap_d + ".itm_sub2";
	public static final String $itm_sub3 = $ap_d + ".itm_sub3";
	public static final String $itm_nm = $ap_d + ".itm_nm";
	public static final String $sundry_itm_flg = $ap_d + ".sundry_itm_flg";
	public static final String $sppl_itm_cd = $ap_d + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $ap_d + ".sppl_itm_nm";
	public static final String $trd_unit_cd = $ap_d + ".trd_unit_cd";
	public static final String $trd_unit_qty = $ap_d + ".trd_unit_qty";
	public static final String $base_unit_cd = $ap_d + ".base_unit_cd";
	public static final String $base_unit_qty = $ap_d + ".base_unit_qty";
	public static final String $tax_cd = $ap_d + ".tax_cd";
	public static final String $interim_flg = $ap_d + ".interim_flg";
	public static final String $xrate = $ap_d + ".xrate";
	public static final String $trd_cur_cd = $ap_d + ".trd_cur_cd";
	public static final String $trd_cur_upri = $ap_d + ".trd_cur_upri";
	public static final String $trd_cur_amt = $ap_d + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $ap_d + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $ap_d + ".trd_cur_dscnt_amt";
	public static final String $base_cur_upri = $ap_d + ".base_cur_upri";
	public static final String $base_cur_amt = $ap_d + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $ap_d + ".base_cur_tax_amt";
	public static final String $base_cur_dscnt_amt = $ap_d + ".base_cur_dscnt_amt";
	public static final String $wtax_rate = $ap_d + ".wtax_rate";
	public static final String $wtax_amt = $ap_d + ".wtax_amt";
	public static final String $pay_mtd_typ = $ap_d + ".pay_mtd_typ";
	public static final String $org_ap_d_no = $ap_d + ".org_ap_d_no";
	public static final String $crryovr_ap_d_no = $ap_d + ".crryovr_ap_d_no";
	public static final String $crryovr_src_ap_d_no = $ap_d + ".crryovr_src_ap_d_no";
	public static final String $sw_src_pay_schd_no = $ap_d + ".sw_src_pay_schd_no";
	public static final String $pay_schd_d_print_rmrks = $ap_d + ".pay_schd_d_print_rmrks";
	public static final String $pay_ntc_d_print_rmrks = $ap_d + ".pay_ntc_d_print_rmrks";
	public static final String $intr_rmrks = $ap_d + ".intr_rmrks";
	public static final String $pay_chk_no = $ap_d + ".pay_chk_no";
	public static final String $pay_chk_mng_no = $ap_d + ".pay_chk_mng_no";
	public static final String $crryovr_flg = $ap_d + ".crryovr_flg";
	public static final String $valid_flg = $ap_d + ".valid_flg";
	public static final String $sub_char1 = $ap_d + ".sub_char1";
	public static final String $sub_char2 = $ap_d + ".sub_char2";
	public static final String $sub_char3 = $ap_d + ".sub_char3";
	public static final String $trd_cur_proc_upri = $ap_d + ".trd_cur_proc_upri";
	public static final String $trd_cur_proc_amt = $ap_d + ".trd_cur_proc_amt";
	public static final String $trd_cur_onr_prov_upri = $ap_d + ".trd_cur_onr_prov_upri";
	public static final String $trd_cur_onr_prov_amt = $ap_d + ".trd_cur_onr_prov_amt";
	public static final String $base_cur_proc_upri = $ap_d + ".base_cur_proc_upri";
	public static final String $base_cur_proc_amt = $ap_d + ".base_cur_proc_amt";
	public static final String $base_cur_onr_prov_upri = $ap_d + ".base_cur_onr_prov_upri";
	public static final String $base_cur_onr_prov_amt = $ap_d + ".base_cur_onr_prov_amt";
	public static final String $repurc_obli_flg = $ap_d + ".repurc_obli_flg";
	public static final String $outsrc_flg = $ap_d + ".outsrc_flg";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ap_d_META = createInnerRowMeta($ap_d, mcframe.serverMS.dbc.MST_AP_D_R.class);
	public static final MCMeta ref_ap_d_no_META = createCommonMeta($ref_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta amt_disp_pm_META = createCommonMeta($amt_disp_pm, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sw_src_rcv_bill_no_META = createCommonMeta($sw_src_rcv_bill_no, mcframe.commonMA.meta.MA_META.RCV_BILL_NO);

	protected static final ConstMetaList<PaySchd_Srch05_RsltR> constMetas = new ConstMetaList<PaySchd_Srch05_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			ap_d_META,
			ref_ap_d_no_META,
			amt_disp_pm_META,
			sw_src_rcv_bill_no_META
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
				"wrk_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"act_dt",
				"ac_dt",
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
				"sundry_itm_flg",
				"sppl_itm_cd",
				"sppl_itm_nm",
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
				"org_ap_d_no",
				"crryovr_ap_d_no",
				"crryovr_src_ap_d_no",
				"sw_src_pay_schd_no",
				"pay_schd_d_print_rmrks",
				"pay_ntc_d_print_rmrks",
				"intr_rmrks",
				"pay_chk_no",
				"pay_chk_mng_no",
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
				$wrk_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$act_dt,
				$ac_dt,
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
				$sundry_itm_flg,
				$sppl_itm_cd,
				$sppl_itm_nm,
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
				$org_ap_d_no,
				$crryovr_ap_d_no,
				$crryovr_src_ap_d_no,
				$sw_src_pay_schd_no,
				$pay_schd_d_print_rmrks,
				$pay_ntc_d_print_rmrks,
				$intr_rmrks,
				$pay_chk_no,
				$pay_chk_mng_no,
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

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected PaySchd_Srch05_RsltR_MC_A(ConstMetaList<? extends PaySchd_Srch05_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch05_RsltR clone() {
		return (PaySchd_Srch05_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch05_RsltR createInstance() {
		return (PaySchd_Srch05_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch05_RsltR getValues(String... names) {
		return (PaySchd_Srch05_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_AP_D_R ap_d(){
		return (mcframe.serverMS.dbc.MST_AP_D_R) getConstInnerRow(offset + 2, $ap_d);
	}
	
	public void ap_d(mcframe.serverMS.dbc.MST_AP_D_R row){
		setConstInnerRow(offset + 2, $ap_d, row);
	}


	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public String ref_ap_d_no() {
		return getConstString(offset + 3, $ref_ap_d_no);
	}

	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public void ref_ap_d_no(String value) {
		setConstString(offset + 3, $ref_ap_d_no, value);
	}


	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public MCNumber amt_disp_pm() {
		return getConstNumber(offset + 4, $amt_disp_pm);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(MCNumber value) {
		setConstNumber(offset + 4, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(int value) {
		setConstNumber(offset + 4, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(long value) {
		setConstNumber(offset + 4, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(float value) {
		setConstNumber(offset + 4, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(double value) {
		setConstNumber(offset + 4, $amt_disp_pm, value);
	}


	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public String sw_src_rcv_bill_no() {
		return getConstString(offset + 5, $sw_src_rcv_bill_no);
	}

	/**
	 * Transfer source counterpart invoice No. 振替元相手先請求書ＮＯ.<p>
	 *
	 */
	public void sw_src_rcv_bill_no(String value) {
		setConstString(offset + 5, $sw_src_rcv_bill_no, value);
	}


	public String getString(String name) {
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			return ref_ap_d_no();
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			return sw_src_rcv_bill_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			return amt_disp_pm();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			return ref_ap_d_no();
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			return sw_src_rcv_bill_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			return amt_disp_pm();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			ref_ap_d_no(value);
			return;
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			sw_src_rcv_bill_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			ref_ap_d_no(value);
			return;
		}
		if ($sw_src_rcv_bill_no.equalsIgnoreCase(name)) {
			sw_src_rcv_bill_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ap_d.equalsIgnoreCase(name)) {
			return ap_d();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ap_d.equalsIgnoreCase(name)) {
			ap_d(
				((MCContainerMeta) ap_d_META).castInnerRow(mcframe.serverMS.dbc.MST_AP_D_R.class, value)
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
		return ap_d().ap_d_no();
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		ap_d().ap_d_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return ap_d().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		ap_d().po_no(value);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return ap_d().po_d_no();
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		ap_d().po_d_no(value);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return ap_d().purc_act_d_no();
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		ap_d().purc_act_d_no(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return ap_d().purc_act_d_seq();
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		ap_d().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		ap_d().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		ap_d().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		ap_d().purc_act_d_seq(value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		ap_d().purc_act_d_seq(value);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return ap_d().purc_act_no();
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		ap_d().purc_act_no(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return ap_d().purc_act_seq();
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		ap_d().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		ap_d().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		ap_d().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		ap_d().purc_act_seq(value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		ap_d().purc_act_seq(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return ap_d().purc_act_rev();
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		ap_d().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		ap_d().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		ap_d().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		ap_d().purc_act_rev(value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		ap_d().purc_act_rev(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return ap_d().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		ap_d().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return ap_d().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		ap_d().bp_dlv_slip_d_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return ap_d().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		ap_d().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return ap_d().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		ap_d().rcpt_iv_mng_no(value);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return ap_d().ap_typ();
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		ap_d().ap_typ(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return ap_d().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		ap_d().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return ap_d().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		ap_d().trd_ptn_typ(value);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return ap_d().slip_sts_typ();
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		ap_d().slip_sts_typ(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return ap_d().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		ap_d().sppl_cd(value);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return ap_d().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		ap_d().asppl_cd(value);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return ap_d().bsppl_cd();
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		ap_d().bsppl_cd(value);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return ap_d().bsppl_dpt_cd();
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		ap_d().bsppl_dpt_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return ap_d().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		ap_d().ap_dpt_cd(value);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return ap_d().wrk_no();
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		ap_d().wrk_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ap_d().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ap_d().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ap_d().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ap_d().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ap_d().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ap_d().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ap_d().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ap_d().sno4(value);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return ap_d().act_dt();
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		ap_d().act_dt(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ap_d().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ap_d().ac_dt(value);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return ap_d().bsppl_cl_dt();
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		ap_d().bsppl_cl_dt(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public MCNumber bsppl_cl_day() {
		return ap_d().bsppl_cl_day();
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(MCNumber value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(int value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(long value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(float value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Scheduled payee closing date 支払予定管理先締日.<p>
	 *
	 */
	public void bsppl_cl_day(double value) {
		ap_d().bsppl_cl_day(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return ap_d().pay_crryovr_times();
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		ap_d().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		ap_d().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		ap_d().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		ap_d().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		ap_d().pay_crryovr_times(value);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return ap_d().pay_basis_dt();
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		ap_d().pay_basis_dt(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return ap_d().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		ap_d().pay_schd_dt(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ap_d().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ap_d().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ap_d().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ap_d().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ap_d().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ap_d().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ap_d().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ap_d().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return ap_d().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		ap_d().itm_nm(value);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return ap_d().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		ap_d().sundry_itm_flg(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return ap_d().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		ap_d().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return ap_d().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		ap_d().sppl_itm_nm(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return ap_d().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		ap_d().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return ap_d().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		ap_d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		ap_d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		ap_d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		ap_d().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		ap_d().trd_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return ap_d().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		ap_d().base_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return ap_d().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		ap_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		ap_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		ap_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		ap_d().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		ap_d().base_unit_qty(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return ap_d().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		ap_d().tax_cd(value);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return ap_d().interim_flg();
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		ap_d().interim_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return ap_d().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		ap_d().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		ap_d().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		ap_d().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		ap_d().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		ap_d().xrate(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return ap_d().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		ap_d().trd_cur_cd(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return ap_d().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		ap_d().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		ap_d().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		ap_d().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		ap_d().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		ap_d().trd_cur_upri(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return ap_d().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		ap_d().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return ap_d().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		ap_d().trd_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return ap_d().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		ap_d().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		ap_d().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		ap_d().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		ap_d().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		ap_d().trd_cur_dscnt_amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return ap_d().base_cur_upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		ap_d().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		ap_d().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		ap_d().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		ap_d().base_cur_upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		ap_d().base_cur_upri(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return ap_d().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		ap_d().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		ap_d().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		ap_d().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		ap_d().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		ap_d().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return ap_d().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		ap_d().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		ap_d().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		ap_d().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		ap_d().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		ap_d().base_cur_tax_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return ap_d().base_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		ap_d().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		ap_d().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		ap_d().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		ap_d().base_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		ap_d().base_cur_dscnt_amt(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return ap_d().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		ap_d().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		ap_d().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		ap_d().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		ap_d().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		ap_d().wtax_rate(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return ap_d().wtax_amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		ap_d().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		ap_d().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		ap_d().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		ap_d().wtax_amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		ap_d().wtax_amt(value);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return ap_d().pay_mtd_typ();
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		ap_d().pay_mtd_typ(value);
	}

	/**
	 * Original AP details No. 元買掛明細ＮＯ.<p>
	 *
	 */
	public String org_ap_d_no() {
		return ap_d().org_ap_d_no();
	}

	/**
	 * Original AP details No. 元買掛明細ＮＯ.<p>
	 *
	 */
	public void org_ap_d_no(String value) {
		ap_d().org_ap_d_no(value);
	}

	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_ap_d_no() {
		return ap_d().crryovr_ap_d_no();
	}

	/**
	 * Carry-over destination AP details No. 繰越先買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_ap_d_no(String value) {
		ap_d().crryovr_ap_d_no(value);
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_src_ap_d_no() {
		return ap_d().crryovr_src_ap_d_no();
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_src_ap_d_no(String value) {
		ap_d().crryovr_src_ap_d_no(value);
	}

	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public String sw_src_pay_schd_no() {
		return ap_d().sw_src_pay_schd_no();
	}

	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public void sw_src_pay_schd_no(String value) {
		ap_d().sw_src_pay_schd_no(value);
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public String pay_schd_d_print_rmrks() {
		return ap_d().pay_schd_d_print_rmrks();
	}

	/**
	 * Payment schedule details remarks 支払予定明細備考.<p>
	 *
	 */
	public void pay_schd_d_print_rmrks(String value) {
		ap_d().pay_schd_d_print_rmrks(value);
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public String pay_ntc_d_print_rmrks() {
		return ap_d().pay_ntc_d_print_rmrks();
	}

	/**
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public void pay_ntc_d_print_rmrks(String value) {
		ap_d().pay_ntc_d_print_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return ap_d().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		ap_d().intr_rmrks(value);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return ap_d().pay_chk_no();
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		ap_d().pay_chk_no(value);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return ap_d().pay_chk_mng_no();
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		ap_d().pay_chk_mng_no(value);
	}

	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public boolean crryovr_flg() {
		return ap_d().crryovr_flg();
	}

	/**
	 * Carry-over 繰越分.<p>
	 *
	 */
	public void crryovr_flg(boolean value) {
		ap_d().crryovr_flg(value);
	}

	/**
	 * Valid 有効.<p>
	 *
	 */
	public boolean valid_flg() {
		return ap_d().valid_flg();
	}

	/**
	 * Valid 有効.<p>
	 *
	 */
	public void valid_flg(boolean value) {
		ap_d().valid_flg(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return ap_d().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		ap_d().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return ap_d().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		ap_d().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return ap_d().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		ap_d().sub_char3(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return ap_d().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		ap_d().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		ap_d().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		ap_d().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		ap_d().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		ap_d().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return ap_d().trd_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		ap_d().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		ap_d().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		ap_d().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		ap_d().trd_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		ap_d().trd_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return ap_d().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		ap_d().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		ap_d().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		ap_d().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		ap_d().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		ap_d().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return ap_d().trd_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		ap_d().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		ap_d().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		ap_d().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		ap_d().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		ap_d().trd_cur_onr_prov_amt(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return ap_d().base_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		ap_d().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		ap_d().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		ap_d().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		ap_d().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		ap_d().base_cur_proc_upri(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return ap_d().base_cur_proc_amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		ap_d().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		ap_d().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		ap_d().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		ap_d().base_cur_proc_amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		ap_d().base_cur_proc_amt(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return ap_d().base_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		ap_d().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		ap_d().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		ap_d().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		ap_d().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		ap_d().base_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return ap_d().base_cur_onr_prov_amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		ap_d().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		ap_d().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		ap_d().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		ap_d().base_cur_onr_prov_amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		ap_d().base_cur_onr_prov_amt(value);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return ap_d().repurc_obli_flg();
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		ap_d().repurc_obli_flg(value);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return ap_d().outsrc_flg();
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		ap_d().outsrc_flg(value);
	}

}

