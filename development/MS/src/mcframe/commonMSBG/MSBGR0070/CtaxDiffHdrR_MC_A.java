package mcframe.commonMSBG.MSBGR0070;

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
 * ブロック"CtaxDiffHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CtaxDiffHdrR_MC_A extends MCConstRow {

	/**
	 *  入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 *  入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 *  入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 *  入金先別名１.<p>
	 *
	 */
	public static final String $rcst_alt_nm1 = "rcst_alt_nm1";
	/**
	 *  入金先別名２.<p>
	 *
	 */
	public static final String $rcst_alt_nm2 = "rcst_alt_nm2";
	/**
	 *  入金先別名３.<p>
	 *
	 */
	public static final String $rcst_alt_nm3 = "rcst_alt_nm3";
	/**
	 *  入金先別名４.<p>
	 *
	 */
	public static final String $rcst_alt_nm4 = "rcst_alt_nm4";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 *  請求先別名１.<p>
	 *
	 */
	public static final String $bcst_alt_nm1 = "bcst_alt_nm1";
	/**
	 *  請求先別名２.<p>
	 *
	 */
	public static final String $bcst_alt_nm2 = "bcst_alt_nm2";
	/**
	 *  請求先別名３.<p>
	 *
	 */
	public static final String $bcst_alt_nm3 = "bcst_alt_nm3";
	/**
	 *  請求先別名４.<p>
	 *
	 */
	public static final String $bcst_alt_nm4 = "bcst_alt_nm4";
	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $report_title = "report_title";
	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 *  通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 *  基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 *  税ＣＤ１.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  税名１.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  内税小計１.<p>
	 *
	 */
	public static final String $tax_subttl1 = "tax_subttl1";
	/**
	 *  内税小計１文字列.<p>
	 *
	 */
	public static final String $s_tax_subttl1 = "s_tax_subttl1";
	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public static final String $base_cur_tax_subttl1 = "base_cur_tax_subttl1";
	/**
	 *  基準通貨内税小計１文字列.<p>
	 *
	 */
	public static final String $s_base_cur_tax_subttl1 = "s_base_cur_tax_subttl1";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcst_alt_nm1_META = createCommonMeta($rcst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta rcst_alt_nm2_META = createCommonMeta($rcst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta rcst_alt_nm3_META = createCommonMeta($rcst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta rcst_alt_nm4_META = createCommonMeta($rcst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_alt_nm1_META = createCommonMeta($bcst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bcst_alt_nm2_META = createCommonMeta($bcst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bcst_alt_nm3_META = createCommonMeta($bcst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bcst_alt_nm4_META = createCommonMeta($bcst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta report_title_META = createCommonMeta($report_title, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tax_subttl1_META = createCommonMeta($tax_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_tax_subttl1_META = createStringMeta($s_tax_subttl1);
	public static final MCMeta base_cur_tax_subttl1_META = createCommonMeta($base_cur_tax_subttl1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_base_cur_tax_subttl1_META = createStringMeta($s_base_cur_tax_subttl1);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);

	protected static final ConstMetaList<CtaxDiffHdrR> constMetas = new ConstMetaList<CtaxDiffHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			usr_cd_META,
			usr_nm_META,
			rcv_dt_META,
			rcst_cd_META,
			rcst_nm_META,
			rcst_alt_nm1_META,
			rcst_alt_nm2_META,
			rcst_alt_nm3_META,
			rcst_alt_nm4_META,
			bcst_cd_META,
			bcst_nm_META,
			bcst_alt_nm1_META,
			bcst_alt_nm2_META,
			bcst_alt_nm3_META,
			bcst_alt_nm4_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			trd_cd_META,
			report_title_META,
			wrk_no_META,
			wrk_nm_META,
			cur_cd_META,
			cur_nm_META,
			base_cur_cd_META,
			base_cur_nm_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			prnt_tm_META,
			ac_dt_META,
			tax_subttl1_META,
			s_tax_subttl1_META,
			base_cur_tax_subttl1_META,
			s_base_cur_tax_subttl1_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected CtaxDiffHdrR_MC_A(ConstMetaList<? extends CtaxDiffHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CtaxDiffHdrR clone() {
		return (CtaxDiffHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CtaxDiffHdrR createInstance() {
		return (CtaxDiffHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CtaxDiffHdrR getValues(String... names) {
		return (CtaxDiffHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 0, $rcv_act_no);
	}

	/**
	 *  入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 0, $rcv_act_no, value);
	}


	/**
	 *  入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 1, $rcv_act_seq);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 *  入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}


	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 2, $rcv_act_rev);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}

	/**
	 *  入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 2, $rcv_act_rev, value);
	}


	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 3, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 3, $slip_sts_typ, value);
	}


	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 4, $slip_sts_typ_nm);
	}

	/**
	 *  伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 4, $slip_sts_typ_nm, value);
	}


	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 5, $dpt_cd);
	}

	/**
	 *  部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 5, $dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 6, $dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 6, $dpt_nm, value);
	}


	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 7, $usr_cd);
	}

	/**
	 *  担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 7, $usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 8, $usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 8, $usr_nm, value);
	}


	/**
	 *  入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 9, $rcv_dt);
	}

	/**
	 *  入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 9, $rcv_dt, value);
	}


	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 10, $rcst_cd);
	}

	/**
	 *  入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 10, $rcst_cd, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 11, $rcst_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 11, $rcst_nm, value);
	}


	/**
	 *  入金先別名１.<p>
	 *
	 */
	public String rcst_alt_nm1() {
		return getConstString(offset + 12, $rcst_alt_nm1);
	}

	/**
	 *  入金先別名１.<p>
	 *
	 */
	public void rcst_alt_nm1(String value) {
		setConstString(offset + 12, $rcst_alt_nm1, value);
	}


	/**
	 *  入金先別名２.<p>
	 *
	 */
	public String rcst_alt_nm2() {
		return getConstString(offset + 13, $rcst_alt_nm2);
	}

	/**
	 *  入金先別名２.<p>
	 *
	 */
	public void rcst_alt_nm2(String value) {
		setConstString(offset + 13, $rcst_alt_nm2, value);
	}


	/**
	 *  入金先別名３.<p>
	 *
	 */
	public String rcst_alt_nm3() {
		return getConstString(offset + 14, $rcst_alt_nm3);
	}

	/**
	 *  入金先別名３.<p>
	 *
	 */
	public void rcst_alt_nm3(String value) {
		setConstString(offset + 14, $rcst_alt_nm3, value);
	}


	/**
	 *  入金先別名４.<p>
	 *
	 */
	public String rcst_alt_nm4() {
		return getConstString(offset + 15, $rcst_alt_nm4);
	}

	/**
	 *  入金先別名４.<p>
	 *
	 */
	public void rcst_alt_nm4(String value) {
		setConstString(offset + 15, $rcst_alt_nm4, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 16, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 16, $bcst_cd, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 17, $bcst_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 17, $bcst_nm, value);
	}


	/**
	 *  請求先別名１.<p>
	 *
	 */
	public String bcst_alt_nm1() {
		return getConstString(offset + 18, $bcst_alt_nm1);
	}

	/**
	 *  請求先別名１.<p>
	 *
	 */
	public void bcst_alt_nm1(String value) {
		setConstString(offset + 18, $bcst_alt_nm1, value);
	}


	/**
	 *  請求先別名２.<p>
	 *
	 */
	public String bcst_alt_nm2() {
		return getConstString(offset + 19, $bcst_alt_nm2);
	}

	/**
	 *  請求先別名２.<p>
	 *
	 */
	public void bcst_alt_nm2(String value) {
		setConstString(offset + 19, $bcst_alt_nm2, value);
	}


	/**
	 *  請求先別名３.<p>
	 *
	 */
	public String bcst_alt_nm3() {
		return getConstString(offset + 20, $bcst_alt_nm3);
	}

	/**
	 *  請求先別名３.<p>
	 *
	 */
	public void bcst_alt_nm3(String value) {
		setConstString(offset + 20, $bcst_alt_nm3, value);
	}


	/**
	 *  請求先別名４.<p>
	 *
	 */
	public String bcst_alt_nm4() {
		return getConstString(offset + 21, $bcst_alt_nm4);
	}

	/**
	 *  請求先別名４.<p>
	 *
	 */
	public void bcst_alt_nm4(String value) {
		setConstString(offset + 21, $bcst_alt_nm4, value);
	}


	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 22, $bill_dpt_cd);
	}

	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 22, $bill_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 23, $bill_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 23, $bill_dpt_nm, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 24, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 24, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String report_title() {
		return getConstString(offset + 25, $report_title);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void report_title(String value) {
		setConstString(offset + 25, $report_title, value);
	}


	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 26, $wrk_no);
	}

	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 26, $wrk_no, value);
	}


	/**
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 27, $wrk_nm);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 27, $wrk_nm, value);
	}


	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 28, $cur_cd);
	}

	/**
	 *  通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 28, $cur_cd, value);
	}


	/**
	 *  通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 29, $cur_nm);
	}

	/**
	 *  通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 29, $cur_nm, value);
	}


	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 30, $base_cur_cd);
	}

	/**
	 *  基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 30, $base_cur_cd, value);
	}


	/**
	 *  基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 31, $base_cur_nm);
	}

	/**
	 *  基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 31, $base_cur_nm, value);
	}


	/**
	 *  税ＣＤ１.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 32, $tax_cd);
	}

	/**
	 *  税ＣＤ１.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 32, $tax_cd, value);
	}


	/**
	 *  税名１.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 33, $tax_nm);
	}

	/**
	 *  税名１.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 33, $tax_nm, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 34, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 34, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 34, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 34, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 34, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 34, $tax_rate, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 35, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 35, $prnt_tm, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 36, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 36, $ac_dt, value);
	}


	/**
	 *  内税小計１.<p>
	 *
	 */
	public MCNumber tax_subttl1() {
		return getConstNumber(offset + 37, $tax_subttl1);
	}

	/**
	 *  内税小計１.<p>
	 *
	 */
	public void tax_subttl1(MCNumber value) {
		setConstNumber(offset + 37, $tax_subttl1, value);
	}

	/**
	 *  内税小計１.<p>
	 *
	 */
	public void tax_subttl1(int value) {
		setConstNumber(offset + 37, $tax_subttl1, value);
	}

	/**
	 *  内税小計１.<p>
	 *
	 */
	public void tax_subttl1(long value) {
		setConstNumber(offset + 37, $tax_subttl1, value);
	}

	/**
	 *  内税小計１.<p>
	 *
	 */
	public void tax_subttl1(float value) {
		setConstNumber(offset + 37, $tax_subttl1, value);
	}

	/**
	 *  内税小計１.<p>
	 *
	 */
	public void tax_subttl1(double value) {
		setConstNumber(offset + 37, $tax_subttl1, value);
	}


	/**
	 *  内税小計１文字列.<p>
	 *
	 */
	public String s_tax_subttl1() {
		return getConstString(offset + 38, $s_tax_subttl1);
	}

	/**
	 *  内税小計１文字列.<p>
	 *
	 */
	public void s_tax_subttl1(String value) {
		setConstString(offset + 38, $s_tax_subttl1, value);
	}


	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public MCNumber base_cur_tax_subttl1() {
		return getConstNumber(offset + 39, $base_cur_tax_subttl1);
	}

	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(MCNumber value) {
		setConstNumber(offset + 39, $base_cur_tax_subttl1, value);
	}

	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(int value) {
		setConstNumber(offset + 39, $base_cur_tax_subttl1, value);
	}

	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(long value) {
		setConstNumber(offset + 39, $base_cur_tax_subttl1, value);
	}

	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(float value) {
		setConstNumber(offset + 39, $base_cur_tax_subttl1, value);
	}

	/**
	 *  基準通貨内税小計１.<p>
	 *
	 */
	public void base_cur_tax_subttl1(double value) {
		setConstNumber(offset + 39, $base_cur_tax_subttl1, value);
	}


	/**
	 *  基準通貨内税小計１文字列.<p>
	 *
	 */
	public String s_base_cur_tax_subttl1() {
		return getConstString(offset + 40, $s_base_cur_tax_subttl1);
	}

	/**
	 *  基準通貨内税小計１文字列.<p>
	 *
	 */
	public void s_base_cur_tax_subttl1(String value) {
		setConstString(offset + 40, $s_base_cur_tax_subttl1, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 41, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 41, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 42, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 42, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 43, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 43, $sub_char3, value);
	}


	public String getString(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			return rcst_alt_nm1();
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			return rcst_alt_nm2();
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			return rcst_alt_nm3();
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			return rcst_alt_nm4();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			return bcst_alt_nm1();
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			return bcst_alt_nm2();
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			return bcst_alt_nm3();
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			return bcst_alt_nm4();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($s_tax_subttl1.equalsIgnoreCase(name)) {
			return s_tax_subttl1();
		}
		if ($s_base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return s_base_cur_tax_subttl1();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			return tax_subttl1();
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl1();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			return rcst_alt_nm1();
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			return rcst_alt_nm2();
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			return rcst_alt_nm3();
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			return rcst_alt_nm4();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			return bcst_alt_nm1();
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			return bcst_alt_nm2();
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			return bcst_alt_nm3();
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			return bcst_alt_nm4();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($s_tax_subttl1.equalsIgnoreCase(name)) {
			return s_tax_subttl1();
		}
		if ($s_base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return s_base_cur_tax_subttl1();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			return tax_subttl1();
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			return base_cur_tax_subttl1();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			rcst_alt_nm1(value);
			return;
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			rcst_alt_nm2(value);
			return;
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			rcst_alt_nm3(value);
			return;
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			rcst_alt_nm4(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			bcst_alt_nm1(value);
			return;
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			bcst_alt_nm2(value);
			return;
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			bcst_alt_nm3(value);
			return;
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			bcst_alt_nm4(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($s_tax_subttl1.equalsIgnoreCase(name)) {
			s_tax_subttl1(value);
			return;
		}
		if ($s_base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			s_base_cur_tax_subttl1(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($rcst_alt_nm1.equalsIgnoreCase(name)) {
			rcst_alt_nm1(value);
			return;
		}
		if ($rcst_alt_nm2.equalsIgnoreCase(name)) {
			rcst_alt_nm2(value);
			return;
		}
		if ($rcst_alt_nm3.equalsIgnoreCase(name)) {
			rcst_alt_nm3(value);
			return;
		}
		if ($rcst_alt_nm4.equalsIgnoreCase(name)) {
			rcst_alt_nm4(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bcst_alt_nm1.equalsIgnoreCase(name)) {
			bcst_alt_nm1(value);
			return;
		}
		if ($bcst_alt_nm2.equalsIgnoreCase(name)) {
			bcst_alt_nm2(value);
			return;
		}
		if ($bcst_alt_nm3.equalsIgnoreCase(name)) {
			bcst_alt_nm3(value);
			return;
		}
		if ($bcst_alt_nm4.equalsIgnoreCase(name)) {
			bcst_alt_nm4(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($s_tax_subttl1.equalsIgnoreCase(name)) {
			s_tax_subttl1(value);
			return;
		}
		if ($s_base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			s_base_cur_tax_subttl1(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($tax_subttl1.equalsIgnoreCase(name)) {
			tax_subttl1(value);
			return;
		}
		if ($base_cur_tax_subttl1.equalsIgnoreCase(name)) {
			base_cur_tax_subttl1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

