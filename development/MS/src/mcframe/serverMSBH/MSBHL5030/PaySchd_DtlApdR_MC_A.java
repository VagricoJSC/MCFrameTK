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
 * ブロック"PaySchd_DtlApd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_DtlApdR_MC_A extends MCConstRow {

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
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
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
	public static final String $co_psppl_cl_day = "co_psppl_cl_day";
	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public static final String $co_psppl_cl_dt = "co_psppl_cl_dt";
	public static final String $ap_d = "ap_d";
	/**
	 * Carry-over AP details No. 繰越買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $co_ap_d_no = "co_ap_d_no";
	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $co_src_ap_d_no = "co_src_ap_d_no";
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
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_ap_d_no = "ref_ap_d_no";
	/**
	 * For carry-over 繰越対象.<p>
	 *
	 */
	public static final String $co_tgt_flg = "co_tgt_flg";
	/**
	 * For carry-over deletion 繰越削除対象.<p>
	 *
	 */
	public static final String $co_del_tgt_flg = "co_del_tgt_flg";
	/**
	 * Payment amount AP details No. 支払分買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $pay_ap_d_no = "pay_ap_d_no";
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public static final String $hdr_bsppl_cl_dt = "hdr_bsppl_cl_dt";
	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public static final String $amt_disp_pm = "amt_disp_pm";

	public static final String $ap_d_no = $ap_d + ".ap_d_no";
	public static final String $pay_chk_no = $ap_d + ".pay_chk_no";
	public static final String $pay_chk_mng_no = $ap_d + ".pay_chk_mng_no";
	public static final String $trd_ptn_typ = $ap_d + ".trd_ptn_typ";
	public static final String $slip_sts_typ = $ap_d + ".slip_sts_typ";
	public static final String $asppl_cd = $ap_d + ".asppl_cd";
	public static final String $ap_dpt_cd = $ap_d + ".ap_dpt_cd";
	public static final String $ap_typ = $ap_d + ".ap_typ";
	public static final String $interim_flg = $ap_d + ".interim_flg";
	public static final String $pay_schd_d_print_rmrks = $ap_d + ".pay_schd_d_print_rmrks";
	public static final String $pay_ntc_d_print_rmrks = $ap_d + ".pay_ntc_d_print_rmrks";
	public static final String $intr_rmrks = $ap_d + ".intr_rmrks";
	public static final String $sub_char1 = $ap_d + ".sub_char1";
	public static final String $sub_char2 = $ap_d + ".sub_char2";
	public static final String $sub_char3 = $ap_d + ".sub_char3";
	public static final String $repurc_obli_flg = $ap_d + ".repurc_obli_flg";
	public static final String $base_purc_ac_dt = $ap_d + ".base_purc_ac_dt";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_mtd_typ_META = createCommonMeta($pay_mtd_typ, mcframe.commonMS.meta.MS_META.PAY_MTD_TYP);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta co_psppl_cl_day_META = createCommonMeta($co_psppl_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta co_psppl_cl_dt_META = createCommonMeta($co_psppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_d_META = createInnerRowMeta($ap_d, mcframe.serverMS.dbc.MST_AP_D_R.class);
	public static final MCMeta co_ap_d_no_META = createCommonMeta($co_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta co_src_ap_d_no_META = createCommonMeta($co_src_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_amt_META = createCommonMeta($pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_tax_amt_META = createCommonMeta($pay_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_wtax_amt_META = createCommonMeta($pay_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_proc_amt_META = createCommonMeta($pay_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_onr_prov_amt_META = createCommonMeta($pay_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ref_ap_d_no_META = createCommonMeta($ref_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta co_tgt_flg_META = createCommonMeta($co_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta co_del_tgt_flg_META = createCommonMeta($co_del_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_ap_d_no_META = createCommonMeta($pay_ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta hdr_bsppl_cl_dt_META = createCommonMeta($hdr_bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta amt_disp_pm_META = createCommonMeta($amt_disp_pm, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<PaySchd_DtlApdR> constMetas = new ConstMetaList<PaySchd_DtlApdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			pay_mtd_typ_META,
			pay_crryovr_times_META,
			co_psppl_cl_day_META,
			co_psppl_cl_dt_META,
			ap_d_META,
			co_ap_d_no_META,
			co_src_ap_d_no_META,
			pay_amt_META,
			pay_tax_amt_META,
			pay_wtax_amt_META,
			pay_proc_amt_META,
			pay_onr_prov_amt_META,
			ref_ap_d_no_META,
			co_tgt_flg_META,
			co_del_tgt_flg_META,
			pay_ap_d_no_META,
			hdr_bsppl_cl_dt_META,
			amt_disp_pm_META
		},
		new String[][]{
			{
				"ap_d_no",
				"pay_chk_no",
				"pay_chk_mng_no",
				"trd_ptn_typ",
				"slip_sts_typ",
				"asppl_cd",
				"ap_dpt_cd",
				"ap_typ",
				"interim_flg",
				"pay_schd_d_print_rmrks",
				"pay_ntc_d_print_rmrks",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"repurc_obli_flg",
				"base_purc_ac_dt"
			},
			{
				$ap_d_no,
				$pay_chk_no,
				$pay_chk_mng_no,
				$trd_ptn_typ,
				$slip_sts_typ,
				$asppl_cd,
				$ap_dpt_cd,
				$ap_typ,
				$interim_flg,
				$pay_schd_d_print_rmrks,
				$pay_ntc_d_print_rmrks,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$repurc_obli_flg,
				$base_purc_ac_dt
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
				{$pay_mtd_typ, "MSC_PAY_MTD_TYP"}	// pay_mtd_typ
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
	protected PaySchd_DtlApdR_MC_A(ConstMetaList<? extends PaySchd_DtlApdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_DtlApdR clone() {
		return (PaySchd_DtlApdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_DtlApdR createInstance() {
		return (PaySchd_DtlApdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_DtlApdR getValues(String... names) {
		return (PaySchd_DtlApdR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 3, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 3, $err_flg, value);
	}


	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public String pay_mtd_typ() {
		return getConstString(offset + 4, $pay_mtd_typ);
	}

	/**
	 * Payment method type 支払方式区分.<p>
	 *
	 */
	public void pay_mtd_typ(String value) {
		setConstString(offset + 4, $pay_mtd_typ, value);
	}


	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 5, $pay_crryovr_times);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 5, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 5, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 5, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 5, $pay_crryovr_times, value);
	}

	/**
	 * Current carry-over count 今回繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 5, $pay_crryovr_times, value);
	}


	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public MCNumber co_psppl_cl_day() {
		return getConstNumber(offset + 6, $co_psppl_cl_day);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_psppl_cl_day(MCNumber value) {
		setConstNumber(offset + 6, $co_psppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_psppl_cl_day(int value) {
		setConstNumber(offset + 6, $co_psppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_psppl_cl_day(long value) {
		setConstNumber(offset + 6, $co_psppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_psppl_cl_day(float value) {
		setConstNumber(offset + 6, $co_psppl_cl_day, value);
	}

	/**
	 * Closing day after carry-over 繰越後締日.<p>
	 *
	 */
	public void co_psppl_cl_day(double value) {
		setConstNumber(offset + 6, $co_psppl_cl_day, value);
	}


	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public MCDate co_psppl_cl_dt() {
		return getConstDate(offset + 7, $co_psppl_cl_dt);
	}

	/**
	 * Closing year, month and date after carry-over 繰越後締年月日.<p>
	 *
	 */
	public void co_psppl_cl_dt(MCDate value) {
		setConstDate(offset + 7, $co_psppl_cl_dt, value);
	}


	public mcframe.serverMS.dbc.MST_AP_D_R ap_d(){
		return (mcframe.serverMS.dbc.MST_AP_D_R) getConstInnerRow(offset + 8, $ap_d);
	}
	
	public void ap_d(mcframe.serverMS.dbc.MST_AP_D_R row){
		setConstInnerRow(offset + 8, $ap_d, row);
	}


	/**
	 * Carry-over AP details No. 繰越買掛明細ＮＯ.<p>
	 *
	 */
	public String co_ap_d_no() {
		return getConstString(offset + 9, $co_ap_d_no);
	}

	/**
	 * Carry-over AP details No. 繰越買掛明細ＮＯ.<p>
	 *
	 */
	public void co_ap_d_no(String value) {
		setConstString(offset + 9, $co_ap_d_no, value);
	}


	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public String co_src_ap_d_no() {
		return getConstString(offset + 10, $co_src_ap_d_no);
	}

	/**
	 * Carry-over source AP details No. 繰越元買掛明細ＮＯ.<p>
	 *
	 */
	public void co_src_ap_d_no(String value) {
		setConstString(offset + 10, $co_src_ap_d_no, value);
	}


	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return getConstNumber(offset + 11, $pay_amt);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		setConstNumber(offset + 11, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(int value) {
		setConstNumber(offset + 11, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(long value) {
		setConstNumber(offset + 11, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(float value) {
		setConstNumber(offset + 11, $pay_amt, value);
	}

	/**
	 * Current payment amount 今回支払金額.<p>
	 *
	 */
	public void pay_amt(double value) {
		setConstNumber(offset + 11, $pay_amt, value);
	}


	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public MCNumber pay_tax_amt() {
		return getConstNumber(offset + 12, $pay_tax_amt);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(MCNumber value) {
		setConstNumber(offset + 12, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(int value) {
		setConstNumber(offset + 12, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(long value) {
		setConstNumber(offset + 12, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(float value) {
		setConstNumber(offset + 12, $pay_tax_amt, value);
	}

	/**
	 * Current payment tax amount 今回支払税額.<p>
	 *
	 */
	public void pay_tax_amt(double value) {
		setConstNumber(offset + 12, $pay_tax_amt, value);
	}


	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public MCNumber pay_wtax_amt() {
		return getConstNumber(offset + 13, $pay_wtax_amt);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(MCNumber value) {
		setConstNumber(offset + 13, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(int value) {
		setConstNumber(offset + 13, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(long value) {
		setConstNumber(offset + 13, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(float value) {
		setConstNumber(offset + 13, $pay_wtax_amt, value);
	}

	/**
	 * Current payment withholding tax amount 今回支払源泉税額.<p>
	 *
	 */
	public void pay_wtax_amt(double value) {
		setConstNumber(offset + 13, $pay_wtax_amt, value);
	}


	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public MCNumber pay_proc_amt() {
		return getConstNumber(offset + 14, $pay_proc_amt);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(MCNumber value) {
		setConstNumber(offset + 14, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(int value) {
		setConstNumber(offset + 14, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(long value) {
		setConstNumber(offset + 14, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(float value) {
		setConstNumber(offset + 14, $pay_proc_amt, value);
	}

	/**
	 * Current payment subcontracting amount 今回支払加工金額.<p>
	 *
	 */
	public void pay_proc_amt(double value) {
		setConstNumber(offset + 14, $pay_proc_amt, value);
	}


	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public MCNumber pay_onr_prov_amt() {
		return getConstNumber(offset + 15, $pay_onr_prov_amt);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 15, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(int value) {
		setConstNumber(offset + 15, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(long value) {
		setConstNumber(offset + 15, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(float value) {
		setConstNumber(offset + 15, $pay_onr_prov_amt, value);
	}

	/**
	 * Current payment chargeable supply amount 今回支払有償支給金額.<p>
	 *
	 */
	public void pay_onr_prov_amt(double value) {
		setConstNumber(offset + 15, $pay_onr_prov_amt, value);
	}


	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public String ref_ap_d_no() {
		return getConstString(offset + 16, $ref_ap_d_no);
	}

	/**
	 * Reference AP details No. 参照買掛明細ＮＯ.<p>
	 *
	 */
	public void ref_ap_d_no(String value) {
		setConstString(offset + 16, $ref_ap_d_no, value);
	}


	/**
	 * For carry-over 繰越対象.<p>
	 *
	 */
	public boolean co_tgt_flg() {
		return getConstBoolean(offset + 17, $co_tgt_flg);
	}

	/**
	 * For carry-over 繰越対象.<p>
	 *
	 */
	public void co_tgt_flg(boolean value) {
		setConstBoolean(offset + 17, $co_tgt_flg, value);
	}


	/**
	 * For carry-over deletion 繰越削除対象.<p>
	 *
	 */
	public boolean co_del_tgt_flg() {
		return getConstBoolean(offset + 18, $co_del_tgt_flg);
	}

	/**
	 * For carry-over deletion 繰越削除対象.<p>
	 *
	 */
	public void co_del_tgt_flg(boolean value) {
		setConstBoolean(offset + 18, $co_del_tgt_flg, value);
	}


	/**
	 * Payment amount AP details No. 支払分買掛明細ＮＯ.<p>
	 *
	 */
	public String pay_ap_d_no() {
		return getConstString(offset + 19, $pay_ap_d_no);
	}

	/**
	 * Payment amount AP details No. 支払分買掛明細ＮＯ.<p>
	 *
	 */
	public void pay_ap_d_no(String value) {
		setConstString(offset + 19, $pay_ap_d_no, value);
	}


	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCDate hdr_bsppl_cl_dt() {
		return getConstDate(offset + 20, $hdr_bsppl_cl_dt);
	}

	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public void hdr_bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 20, $hdr_bsppl_cl_dt, value);
	}


	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public MCNumber amt_disp_pm() {
		return getConstNumber(offset + 21, $amt_disp_pm);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(MCNumber value) {
		setConstNumber(offset + 21, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(int value) {
		setConstNumber(offset + 21, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(long value) {
		setConstNumber(offset + 21, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(float value) {
		setConstNumber(offset + 21, $amt_disp_pm, value);
	}

	/**
	 * Amount sign 金額符号.<p>
	 *
	 */
	public void amt_disp_pm(double value) {
		setConstNumber(offset + 21, $amt_disp_pm, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($co_ap_d_no.equalsIgnoreCase(name)) {
			return co_ap_d_no();
		}
		if ($co_src_ap_d_no.equalsIgnoreCase(name)) {
			return co_src_ap_d_no();
		}
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			return ref_ap_d_no();
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			return pay_ap_d_no();
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			return co_psppl_cl_day();
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			return pay_proc_amt();
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			return pay_onr_prov_amt();
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			return amt_disp_pm();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($co_psppl_cl_dt.equalsIgnoreCase(name)) {
			return co_psppl_cl_dt();
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return hdr_bsppl_cl_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($co_tgt_flg.equalsIgnoreCase(name)) {
			return co_tgt_flg();
		}
		if ($co_del_tgt_flg.equalsIgnoreCase(name)) {
			return co_del_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			return pay_mtd_typ();
		}
		if ($co_ap_d_no.equalsIgnoreCase(name)) {
			return co_ap_d_no();
		}
		if ($co_src_ap_d_no.equalsIgnoreCase(name)) {
			return co_src_ap_d_no();
		}
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			return ref_ap_d_no();
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			return pay_ap_d_no();
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			return co_psppl_cl_day();
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			return pay_proc_amt();
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			return pay_onr_prov_amt();
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			return amt_disp_pm();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($co_psppl_cl_dt.equalsIgnoreCase(name)) {
			return co_psppl_cl_dt();
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			return hdr_bsppl_cl_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($co_tgt_flg.equalsIgnoreCase(name)) {
			return co_tgt_flg();
		}
		if ($co_del_tgt_flg.equalsIgnoreCase(name)) {
			return co_del_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($co_ap_d_no.equalsIgnoreCase(name)) {
			co_ap_d_no(value);
			return;
		}
		if ($co_src_ap_d_no.equalsIgnoreCase(name)) {
			co_src_ap_d_no(value);
			return;
		}
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			ref_ap_d_no(value);
			return;
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			pay_ap_d_no(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($co_psppl_cl_dt.equalsIgnoreCase(name)) {
			co_psppl_cl_dt(value);
			return;
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			hdr_bsppl_cl_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($co_tgt_flg.equalsIgnoreCase(name)) {
			co_tgt_flg(value);
			return;
		}
		if ($co_del_tgt_flg.equalsIgnoreCase(name)) {
			co_del_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($pay_mtd_typ.equalsIgnoreCase(name)) {
			pay_mtd_typ(value);
			return;
		}
		if ($co_ap_d_no.equalsIgnoreCase(name)) {
			co_ap_d_no(value);
			return;
		}
		if ($co_src_ap_d_no.equalsIgnoreCase(name)) {
			co_src_ap_d_no(value);
			return;
		}
		if ($ref_ap_d_no.equalsIgnoreCase(name)) {
			ref_ap_d_no(value);
			return;
		}
		if ($pay_ap_d_no.equalsIgnoreCase(name)) {
			pay_ap_d_no(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
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
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($co_psppl_cl_day.equalsIgnoreCase(name)) {
			co_psppl_cl_day(value);
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
		if ($pay_proc_amt.equalsIgnoreCase(name)) {
			pay_proc_amt(value);
			return;
		}
		if ($pay_onr_prov_amt.equalsIgnoreCase(name)) {
			pay_onr_prov_amt(value);
			return;
		}
		if ($amt_disp_pm.equalsIgnoreCase(name)) {
			amt_disp_pm(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($co_psppl_cl_dt.equalsIgnoreCase(name)) {
			co_psppl_cl_dt(value);
			return;
		}
		if ($hdr_bsppl_cl_dt.equalsIgnoreCase(name)) {
			hdr_bsppl_cl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($co_tgt_flg.equalsIgnoreCase(name)) {
			co_tgt_flg(value);
			return;
		}
		if ($co_del_tgt_flg.equalsIgnoreCase(name)) {
			co_del_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
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
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return ap_d().base_purc_ac_dt();
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		ap_d().base_purc_ac_dt(value);
	}

}

