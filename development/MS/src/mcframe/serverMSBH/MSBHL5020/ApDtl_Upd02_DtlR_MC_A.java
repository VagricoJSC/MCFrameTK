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
 * ブロック"ApDtl_Upd02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ApDtl_Upd02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $crryovr_src_ap_d_no = "crryovr_src_ap_d_no";
	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public static final String $pay_mtd_typ = "pay_mtd_typ";
	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public static final String $co_bsppl_cl_day = "co_bsppl_cl_day";
	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public static final String $co_bsppl_cl_dt = "co_bsppl_cl_dt";
	/**
	 * Scheduled payee dept. cd. after carry-over 繰越後支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public static final String $co_bsppl_dpt_cd = "co_bsppl_dpt_cd";
	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public static final String $pay_amt = "pay_amt";
	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public static final String $pay_tax_amt = "pay_tax_amt";
	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public static final String $pay_wtax_amt = "pay_wtax_amt";
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public static final String $pay_chk_mng_no = "pay_chk_mng_no";
	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public static final String $pay_base_cur_amt = "pay_base_cur_amt";
	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public static final String $pay_base_cur_tax_amt = "pay_base_cur_tax_amt";
	/**
	 * Payment amount AP details No. 支払分買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $pay_ap_d_no = "pay_ap_d_no";
	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public static final String $pay_proc_amt = "pay_proc_amt";
	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public static final String $pay_onr_prov_amt = "pay_onr_prov_amt";
	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public static final String $pay_base_cur_proc_amt = "pay_base_cur_proc_amt";
	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public static final String $pay_base_cur_onr_prov_amt = "pay_base_cur_onr_prov_amt";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta crryovr_src_ap_d_no_META = createCommonMeta($crryovr_src_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta co_bsppl_cl_day_META = createCommonMeta($co_bsppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta co_bsppl_cl_dt_META = createCommonMeta($co_bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta co_bsppl_dpt_cd_META = createCommonMeta($co_bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_amt_META = createCommonMeta($pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_tax_amt_META = createCommonMeta($pay_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_wtax_amt_META = createCommonMeta($pay_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_chk_mng_no_META = createCommonMeta($pay_chk_mng_no, mcframe.commonMA.meta.MA_META.PAY_CHK_MNG_NO);
	public static final MCMeta pay_base_cur_amt_META = createCommonMeta($pay_base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_base_cur_tax_amt_META = createCommonMeta($pay_base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_ap_d_no_META = createCommonMeta($pay_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_proc_amt_META = createCommonMeta($pay_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_onr_prov_amt_META = createCommonMeta($pay_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_base_cur_proc_amt_META = createCommonMeta($pay_base_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_base_cur_onr_prov_amt_META = createCommonMeta($pay_base_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<ApDtl_Upd02_DtlR> constMetas = new ConstMetaList<ApDtl_Upd02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			crryovr_src_ap_d_no_META,
			pay_mtd_typ_META,
			pay_crryovr_times_META,
			co_bsppl_cl_day_META,
			co_bsppl_cl_dt_META,
			co_bsppl_dpt_cd_META,
			pay_amt_META,
			pay_tax_amt_META,
			pay_wtax_amt_META,
			pay_chk_no_META,
			pay_chk_mng_no_META,
			pay_base_cur_amt_META,
			pay_base_cur_tax_amt_META,
			pay_ap_d_no_META,
			pay_proc_amt_META,
			pay_onr_prov_amt_META,
			pay_base_cur_proc_amt_META,
			pay_base_cur_onr_prov_amt_META
		},
		new String[][]{
			{
			},
			{
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
	protected ApDtl_Upd02_DtlR_MC_A(ConstMetaList<? extends ApDtl_Upd02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApDtl_Upd02_DtlR clone() {
		return (ApDtl_Upd02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApDtl_Upd02_DtlR createInstance() {
		return (ApDtl_Upd02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApDtl_Upd02_DtlR getValues(String... names) {
		return (ApDtl_Upd02_DtlR) super.getValues(names);
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
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public String crryovr_src_ap_d_no() {
		return getConstString(offset + 1, $crryovr_src_ap_d_no);
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public void crryovr_src_ap_d_no(String value) {
		setConstString(offset + 1, $crryovr_src_ap_d_no, value);
	}


	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 2, $pay_mtd_typ);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 2, $pay_mtd_typ, value);
	}


	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 3, $pay_crryovr_times);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 3, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 3, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 3, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 3, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 3, $pay_crryovr_times, value);
	}


	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public MCNumber co_bsppl_cl_day() {
		return getConstNumber(offset + 4, $co_bsppl_cl_day);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(MCNumber value) {
		setConstNumber(offset + 4, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(int value) {
		setConstNumber(offset + 4, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(long value) {
		setConstNumber(offset + 4, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(float value) {
		setConstNumber(offset + 4, $co_bsppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_bsppl_cl_day(double value) {
		setConstNumber(offset + 4, $co_bsppl_cl_day, value);
	}


	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public MCDate co_bsppl_cl_dt() {
		return getConstDate(offset + 5, $co_bsppl_cl_dt);
	}

	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public void co_bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 5, $co_bsppl_cl_dt, value);
	}


	/**
	 * Scheduled payee dept. cd. after carry-over 繰越後支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public String co_bsppl_dpt_cd() {
		return getConstString(offset + 6, $co_bsppl_dpt_cd);
	}

	/**
	 * Scheduled payee dept. cd. after carry-over 繰越後支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public void co_bsppl_dpt_cd(String value) {
		setConstString(offset + 6, $co_bsppl_dpt_cd, value);
	}


	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return getConstNumber(offset + 7, $pay_amt);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		setConstNumber(offset + 7, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(int value) {
		setConstNumber(offset + 7, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(long value) {
		setConstNumber(offset + 7, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(float value) {
		setConstNumber(offset + 7, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(double value) {
		setConstNumber(offset + 7, $pay_amt, value);
	}


	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public MCNumber pay_tax_amt() {
		return getConstNumber(offset + 8, $pay_tax_amt);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(MCNumber value) {
		setConstNumber(offset + 8, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(int value) {
		setConstNumber(offset + 8, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(long value) {
		setConstNumber(offset + 8, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(float value) {
		setConstNumber(offset + 8, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(double value) {
		setConstNumber(offset + 8, $pay_tax_amt, value);
	}


	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public MCNumber pay_wtax_amt() {
		return getConstNumber(offset + 9, $pay_wtax_amt);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(MCNumber value) {
		setConstNumber(offset + 9, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(int value) {
		setConstNumber(offset + 9, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(long value) {
		setConstNumber(offset + 9, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(float value) {
		setConstNumber(offset + 9, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(double value) {
		setConstNumber(offset + 9, $pay_wtax_amt, value);
	}


	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 10, $pay_chk_no);
	}

	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 10, $pay_chk_no, value);
	}


	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public String pay_chk_mng_no() {
		return getConstString(offset + 11, $pay_chk_mng_no);
	}

	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public void pay_chk_mng_no(String value) {
		setConstString(offset + 11, $pay_chk_mng_no, value);
	}


	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public MCNumber pay_base_cur_amt() {
		return getConstNumber(offset + 12, $pay_base_cur_amt);
	}

	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public void pay_base_cur_amt(MCNumber value) {
		setConstNumber(offset + 12, $pay_base_cur_amt, value);
	}

	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public void pay_base_cur_amt(int value) {
		setConstNumber(offset + 12, $pay_base_cur_amt, value);
	}

	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public void pay_base_cur_amt(long value) {
		setConstNumber(offset + 12, $pay_base_cur_amt, value);
	}

	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public void pay_base_cur_amt(float value) {
		setConstNumber(offset + 12, $pay_base_cur_amt, value);
	}

	/**
	 * Current payment amount (Base currency) 今回支払基準通貨金額.<p>
	 *
	 */
	public void pay_base_cur_amt(double value) {
		setConstNumber(offset + 12, $pay_base_cur_amt, value);
	}


	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public MCNumber pay_base_cur_tax_amt() {
		return getConstNumber(offset + 13, $pay_base_cur_tax_amt);
	}

	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public void pay_base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 13, $pay_base_cur_tax_amt, value);
	}

	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public void pay_base_cur_tax_amt(int value) {
		setConstNumber(offset + 13, $pay_base_cur_tax_amt, value);
	}

	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public void pay_base_cur_tax_amt(long value) {
		setConstNumber(offset + 13, $pay_base_cur_tax_amt, value);
	}

	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public void pay_base_cur_tax_amt(float value) {
		setConstNumber(offset + 13, $pay_base_cur_tax_amt, value);
	}

	/**
	 * Current payment tax amount (Base currency) 今回支払基準通貨税額.<p>
	 *
	 */
	public void pay_base_cur_tax_amt(double value) {
		setConstNumber(offset + 13, $pay_base_cur_tax_amt, value);
	}


	/**
	 * Payment amount AP details No. 支払分買掛明細ＮＯ.<p>
	 *
	 */
	public String pay_ap_d_no() {
		return getConstString(offset + 14, $pay_ap_d_no);
	}

	/**
	 * Payment amount AP details No. 支払分買掛明細ＮＯ.<p>
	 *
	 */
	public void pay_ap_d_no(String value) {
		setConstString(offset + 14, $pay_ap_d_no, value);
	}


	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public MCNumber pay_proc_amt() {
		return getConstNumber(offset + 15, $pay_proc_amt);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(MCNumber value) {
		setConstNumber(offset + 15, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(int value) {
		setConstNumber(offset + 15, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(long value) {
		setConstNumber(offset + 15, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(float value) {
		setConstNumber(offset + 15, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(double value) {
		setConstNumber(offset + 15, $pay_proc_amt, value);
	}


	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public MCNumber pay_onr_prov_amt() {
		return getConstNumber(offset + 16, $pay_onr_prov_amt);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 16, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(int value) {
		setConstNumber(offset + 16, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(long value) {
		setConstNumber(offset + 16, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(float value) {
		setConstNumber(offset + 16, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(double value) {
		setConstNumber(offset + 16, $pay_onr_prov_amt, value);
	}


	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public MCNumber pay_base_cur_proc_amt() {
		return getConstNumber(offset + 17, $pay_base_cur_proc_amt);
	}

	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public void pay_base_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 17, $pay_base_cur_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public void pay_base_cur_proc_amt(int value) {
		setConstNumber(offset + 17, $pay_base_cur_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public void pay_base_cur_proc_amt(long value) {
		setConstNumber(offset + 17, $pay_base_cur_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public void pay_base_cur_proc_amt(float value) {
		setConstNumber(offset + 17, $pay_base_cur_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount (Base currency) 今回支払基準通貨加工金額.<p>
	 *
	 */
	public void pay_base_cur_proc_amt(double value) {
		setConstNumber(offset + 17, $pay_base_cur_proc_amt, value);
	}


	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber pay_base_cur_onr_prov_amt() {
		return getConstNumber(offset + 18, $pay_base_cur_onr_prov_amt);
	}

	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public void pay_base_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 18, $pay_base_cur_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public void pay_base_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 18, $pay_base_cur_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public void pay_base_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 18, $pay_base_cur_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public void pay_base_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 18, $pay_base_cur_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount (Base currency) 今回支払基準通貨有償支給金額.<p>
	 *
	 */
	public void pay_base_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 18, $pay_base_cur_onr_prov_amt, value);
	}


	public String getString(String name) {
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			return crryovr_src_ap_d_no();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($co_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return co_bsppl_dpt_cd();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			return pay_ap_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			return co_bsppl_cl_day();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			return pay_tax_amt();
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			return pay_wtax_amt();
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_amt();
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_tax_amt();
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			return pay_proc_amt();
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			return pay_onr_prov_amt();
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_proc_amt();
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_onr_prov_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return co_bsppl_cl_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			return crryovr_src_ap_d_no();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($co_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return co_bsppl_dpt_cd();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			return pay_chk_mng_no();
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			return pay_ap_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			return co_bsppl_cl_day();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			return pay_tax_amt();
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			return pay_wtax_amt();
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_amt();
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_tax_amt();
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			return pay_proc_amt();
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			return pay_onr_prov_amt();
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_proc_amt();
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return pay_base_cur_onr_prov_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return co_bsppl_cl_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			crryovr_src_ap_d_no(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($co_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			co_bsppl_dpt_cd(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			pay_ap_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			co_bsppl_cl_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($crryovr_src_ap_d_no.equalsIgnoreCase(name)) {
			crryovr_src_ap_d_no(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($co_bsppl_dpt_cd.equalsIgnoreCase(name)) {
			co_bsppl_dpt_cd(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($pay_chk_mng_no.equalsIgnoreCase(name)) {
			pay_chk_mng_no(value);
			return;
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			pay_ap_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_bsppl_cl_day.equalsIgnoreCase(name)) {
			co_bsppl_cl_day(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($pay_tax_amt.equalsIgnoreCase(name)) {
			pay_tax_amt(value);
			return;
		}
		if ($pay_wtax_amt.equalsIgnoreCase(name)) {
			pay_wtax_amt(value);
			return;
		}
		if ($pay_base_cur_amt.equalsIgnoreCase(name)) {
			pay_base_cur_amt(value);
			return;
		}
		if ($pay_base_cur_tax_amt.equalsIgnoreCase(name)) {
			pay_base_cur_tax_amt(value);
			return;
		}
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($pay_base_cur_proc_amt.equalsIgnoreCase(name)) {
			pay_base_cur_proc_amt(value);
			return;
		}
		if ($pay_base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_base_cur_onr_prov_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($co_bsppl_cl_dt.equalsIgnoreCase(name)) {
			co_bsppl_cl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

