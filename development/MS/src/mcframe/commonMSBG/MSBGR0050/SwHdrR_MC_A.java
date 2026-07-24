package mcframe.commonMSBG.MSBGR0050;

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
 * ブロック"SwHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SwHdrR_MC_A extends MCConstRow {

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
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd_to = "bcst_cd_to";
	/**
	 *  請求先名.<p>
	 *
	 */
	public static final String $bcst_nm_to = "bcst_nm_to";
	/**
	 *  請求先別名１.<p>
	 *
	 */
	public static final String $bcst_alt_nm1_to = "bcst_alt_nm1_to";
	/**
	 *  請求先別名２.<p>
	 *
	 */
	public static final String $bcst_alt_nm2_to = "bcst_alt_nm2_to";
	/**
	 *  請求先別名３.<p>
	 *
	 */
	public static final String $bcst_alt_nm3_to = "bcst_alt_nm3_to";
	/**
	 *  請求先別名４.<p>
	 *
	 */
	public static final String $bcst_alt_nm4_to = "bcst_alt_nm4_to";
	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd_to = "acst_cd_to";
	/**
	 *  売掛先名.<p>
	 *
	 */
	public static final String $acst_nm_to = "acst_nm_to";
	/**
	 *  売掛先別名１.<p>
	 *
	 */
	public static final String $acst_alt_nm1_to = "acst_alt_nm1_to";
	/**
	 *  売掛先別名２.<p>
	 *
	 */
	public static final String $acst_alt_nm2_to = "acst_alt_nm2_to";
	/**
	 *  売掛先別名３.<p>
	 *
	 */
	public static final String $acst_alt_nm3_to = "acst_alt_nm3_to";
	/**
	 *  売掛先別名４.<p>
	 *
	 */
	public static final String $acst_alt_nm4_to = "acst_alt_nm4_to";
	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd_to = "bill_dpt_cd_to";
	/**
	 *  請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm_to = "bill_dpt_nm_to";
	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd_to = "ar_dpt_cd_to";
	/**
	 *  債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm_to = "ar_dpt_nm_to";
	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no_to = "wrk_no_to";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm_to = "wrk_nm_to";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public static final String $s_trd_cur_amt = "s_trd_cur_amt";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd_fr = "bcst_cd_fr";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $bcst_nm_fr = "bcst_nm_fr";
	/**
	 *  取引先別名１.<p>
	 *
	 */
	public static final String $bcst_alt_nm1_fr = "bcst_alt_nm1_fr";
	/**
	 *  取引先別名２.<p>
	 *
	 */
	public static final String $bcst_alt_nm2_fr = "bcst_alt_nm2_fr";
	/**
	 *  取引先別名３.<p>
	 *
	 */
	public static final String $bcst_alt_nm3_fr = "bcst_alt_nm3_fr";
	/**
	 *  取引先別名４.<p>
	 *
	 */
	public static final String $bcst_alt_nm4_fr = "bcst_alt_nm4_fr";
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
	public static final MCMeta bcst_cd_to_META = createCommonMeta($bcst_cd_to, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_to_META = createCommonMeta($bcst_nm_to, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_alt_nm1_to_META = createCommonMeta($bcst_alt_nm1_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bcst_alt_nm2_to_META = createCommonMeta($bcst_alt_nm2_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bcst_alt_nm3_to_META = createCommonMeta($bcst_alt_nm3_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bcst_alt_nm4_to_META = createCommonMeta($bcst_alt_nm4_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta acst_cd_to_META = createCommonMeta($acst_cd_to, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_to_META = createCommonMeta($acst_nm_to, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta acst_alt_nm1_to_META = createCommonMeta($acst_alt_nm1_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta acst_alt_nm2_to_META = createCommonMeta($acst_alt_nm2_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta acst_alt_nm3_to_META = createCommonMeta($acst_alt_nm3_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta acst_alt_nm4_to_META = createCommonMeta($acst_alt_nm4_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bill_dpt_cd_to_META = createCommonMeta($bill_dpt_cd_to, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_to_META = createCommonMeta($bill_dpt_nm_to, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ar_dpt_cd_to_META = createCommonMeta($ar_dpt_cd_to, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_to_META = createCommonMeta($ar_dpt_nm_to, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wrk_no_to_META = createCommonMeta($wrk_no_to, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_to_META = createCommonMeta($wrk_nm_to, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_trd_cur_amt_META = createStringMeta($s_trd_cur_amt);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta bcst_cd_fr_META = createCommonMeta($bcst_cd_fr, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_fr_META = createCommonMeta($bcst_nm_fr, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_alt_nm1_fr_META = createCommonMeta($bcst_alt_nm1_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bcst_alt_nm2_fr_META = createCommonMeta($bcst_alt_nm2_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bcst_alt_nm3_fr_META = createCommonMeta($bcst_alt_nm3_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bcst_alt_nm4_fr_META = createCommonMeta($bcst_alt_nm4_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta report_title_META = createCommonMeta($report_title, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_SUB_CHAR3);

	protected static final ConstMetaList<SwHdrR> constMetas = new ConstMetaList<SwHdrR>(
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
			bcst_cd_to_META,
			bcst_nm_to_META,
			bcst_alt_nm1_to_META,
			bcst_alt_nm2_to_META,
			bcst_alt_nm3_to_META,
			bcst_alt_nm4_to_META,
			acst_cd_to_META,
			acst_nm_to_META,
			acst_alt_nm1_to_META,
			acst_alt_nm2_to_META,
			acst_alt_nm3_to_META,
			acst_alt_nm4_to_META,
			bill_dpt_cd_to_META,
			bill_dpt_nm_to_META,
			ar_dpt_cd_to_META,
			ar_dpt_nm_to_META,
			wrk_no_to_META,
			wrk_nm_to_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_META,
			s_trd_cur_amt_META,
			trd_rmrks_META,
			bcst_cd_fr_META,
			bcst_nm_fr_META,
			bcst_alt_nm1_fr_META,
			bcst_alt_nm2_fr_META,
			bcst_alt_nm3_fr_META,
			bcst_alt_nm4_fr_META,
			trd_cd_META,
			report_title_META,
			prnt_tm_META,
			ac_dt_META,
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
	protected SwHdrR_MC_A(ConstMetaList<? extends SwHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwHdrR clone() {
		return (SwHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwHdrR createInstance() {
		return (SwHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwHdrR getValues(String... names) {
		return (SwHdrR) super.getValues(names);
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
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd_to() {
		return getConstString(offset + 10, $bcst_cd_to);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd_to(String value) {
		setConstString(offset + 10, $bcst_cd_to, value);
	}


	/**
	 *  請求先名.<p>
	 *
	 */
	public String bcst_nm_to() {
		return getConstString(offset + 11, $bcst_nm_to);
	}

	/**
	 *  請求先名.<p>
	 *
	 */
	public void bcst_nm_to(String value) {
		setConstString(offset + 11, $bcst_nm_to, value);
	}


	/**
	 *  請求先別名１.<p>
	 *
	 */
	public String bcst_alt_nm1_to() {
		return getConstString(offset + 12, $bcst_alt_nm1_to);
	}

	/**
	 *  請求先別名１.<p>
	 *
	 */
	public void bcst_alt_nm1_to(String value) {
		setConstString(offset + 12, $bcst_alt_nm1_to, value);
	}


	/**
	 *  請求先別名２.<p>
	 *
	 */
	public String bcst_alt_nm2_to() {
		return getConstString(offset + 13, $bcst_alt_nm2_to);
	}

	/**
	 *  請求先別名２.<p>
	 *
	 */
	public void bcst_alt_nm2_to(String value) {
		setConstString(offset + 13, $bcst_alt_nm2_to, value);
	}


	/**
	 *  請求先別名３.<p>
	 *
	 */
	public String bcst_alt_nm3_to() {
		return getConstString(offset + 14, $bcst_alt_nm3_to);
	}

	/**
	 *  請求先別名３.<p>
	 *
	 */
	public void bcst_alt_nm3_to(String value) {
		setConstString(offset + 14, $bcst_alt_nm3_to, value);
	}


	/**
	 *  請求先別名４.<p>
	 *
	 */
	public String bcst_alt_nm4_to() {
		return getConstString(offset + 15, $bcst_alt_nm4_to);
	}

	/**
	 *  請求先別名４.<p>
	 *
	 */
	public void bcst_alt_nm4_to(String value) {
		setConstString(offset + 15, $bcst_alt_nm4_to, value);
	}


	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd_to() {
		return getConstString(offset + 16, $acst_cd_to);
	}

	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd_to(String value) {
		setConstString(offset + 16, $acst_cd_to, value);
	}


	/**
	 *  売掛先名.<p>
	 *
	 */
	public String acst_nm_to() {
		return getConstString(offset + 17, $acst_nm_to);
	}

	/**
	 *  売掛先名.<p>
	 *
	 */
	public void acst_nm_to(String value) {
		setConstString(offset + 17, $acst_nm_to, value);
	}


	/**
	 *  売掛先別名１.<p>
	 *
	 */
	public String acst_alt_nm1_to() {
		return getConstString(offset + 18, $acst_alt_nm1_to);
	}

	/**
	 *  売掛先別名１.<p>
	 *
	 */
	public void acst_alt_nm1_to(String value) {
		setConstString(offset + 18, $acst_alt_nm1_to, value);
	}


	/**
	 *  売掛先別名２.<p>
	 *
	 */
	public String acst_alt_nm2_to() {
		return getConstString(offset + 19, $acst_alt_nm2_to);
	}

	/**
	 *  売掛先別名２.<p>
	 *
	 */
	public void acst_alt_nm2_to(String value) {
		setConstString(offset + 19, $acst_alt_nm2_to, value);
	}


	/**
	 *  売掛先別名３.<p>
	 *
	 */
	public String acst_alt_nm3_to() {
		return getConstString(offset + 20, $acst_alt_nm3_to);
	}

	/**
	 *  売掛先別名３.<p>
	 *
	 */
	public void acst_alt_nm3_to(String value) {
		setConstString(offset + 20, $acst_alt_nm3_to, value);
	}


	/**
	 *  売掛先別名４.<p>
	 *
	 */
	public String acst_alt_nm4_to() {
		return getConstString(offset + 21, $acst_alt_nm4_to);
	}

	/**
	 *  売掛先別名４.<p>
	 *
	 */
	public void acst_alt_nm4_to(String value) {
		setConstString(offset + 21, $acst_alt_nm4_to, value);
	}


	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd_to() {
		return getConstString(offset + 22, $bill_dpt_cd_to);
	}

	/**
	 *  請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd_to(String value) {
		setConstString(offset + 22, $bill_dpt_cd_to, value);
	}


	/**
	 *  請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm_to() {
		return getConstString(offset + 23, $bill_dpt_nm_to);
	}

	/**
	 *  請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm_to(String value) {
		setConstString(offset + 23, $bill_dpt_nm_to, value);
	}


	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd_to() {
		return getConstString(offset + 24, $ar_dpt_cd_to);
	}

	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd_to(String value) {
		setConstString(offset + 24, $ar_dpt_cd_to, value);
	}


	/**
	 *  債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm_to() {
		return getConstString(offset + 25, $ar_dpt_nm_to);
	}

	/**
	 *  債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm_to(String value) {
		setConstString(offset + 25, $ar_dpt_nm_to, value);
	}


	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public String wrk_no_to() {
		return getConstString(offset + 26, $wrk_no_to);
	}

	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public void wrk_no_to(String value) {
		setConstString(offset + 26, $wrk_no_to, value);
	}


	/**
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm_to() {
		return getConstString(offset + 27, $wrk_nm_to);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm_to(String value) {
		setConstString(offset + 27, $wrk_nm_to, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 28, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 28, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 29, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 29, $trd_cur_nm, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 30, $trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 30, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 30, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 30, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 30, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 30, $trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public String s_trd_cur_amt() {
		return getConstString(offset + 31, $s_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public void s_trd_cur_amt(String value) {
		setConstString(offset + 31, $s_trd_cur_amt, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 32, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 32, $trd_rmrks, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd_fr() {
		return getConstString(offset + 33, $bcst_cd_fr);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd_fr(String value) {
		setConstString(offset + 33, $bcst_cd_fr, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String bcst_nm_fr() {
		return getConstString(offset + 34, $bcst_nm_fr);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void bcst_nm_fr(String value) {
		setConstString(offset + 34, $bcst_nm_fr, value);
	}


	/**
	 *  取引先別名１.<p>
	 *
	 */
	public String bcst_alt_nm1_fr() {
		return getConstString(offset + 35, $bcst_alt_nm1_fr);
	}

	/**
	 *  取引先別名１.<p>
	 *
	 */
	public void bcst_alt_nm1_fr(String value) {
		setConstString(offset + 35, $bcst_alt_nm1_fr, value);
	}


	/**
	 *  取引先別名２.<p>
	 *
	 */
	public String bcst_alt_nm2_fr() {
		return getConstString(offset + 36, $bcst_alt_nm2_fr);
	}

	/**
	 *  取引先別名２.<p>
	 *
	 */
	public void bcst_alt_nm2_fr(String value) {
		setConstString(offset + 36, $bcst_alt_nm2_fr, value);
	}


	/**
	 *  取引先別名３.<p>
	 *
	 */
	public String bcst_alt_nm3_fr() {
		return getConstString(offset + 37, $bcst_alt_nm3_fr);
	}

	/**
	 *  取引先別名３.<p>
	 *
	 */
	public void bcst_alt_nm3_fr(String value) {
		setConstString(offset + 37, $bcst_alt_nm3_fr, value);
	}


	/**
	 *  取引先別名４.<p>
	 *
	 */
	public String bcst_alt_nm4_fr() {
		return getConstString(offset + 38, $bcst_alt_nm4_fr);
	}

	/**
	 *  取引先別名４.<p>
	 *
	 */
	public void bcst_alt_nm4_fr(String value) {
		setConstString(offset + 38, $bcst_alt_nm4_fr, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 39, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 39, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String report_title() {
		return getConstString(offset + 40, $report_title);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void report_title(String value) {
		setConstString(offset + 40, $report_title, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 41, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 41, $prnt_tm, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 42, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 42, $ac_dt, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 43, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 43, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 44, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 44, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 45, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 45, $sub_char3, value);
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
		if ($bcst_cd_to.equalsIgnoreCase(name)) {
			return bcst_cd_to();
		}
		if ($bcst_nm_to.equalsIgnoreCase(name)) {
			return bcst_nm_to();
		}
		if ($bcst_alt_nm1_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm1_to();
		}
		if ($bcst_alt_nm2_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm2_to();
		}
		if ($bcst_alt_nm3_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm3_to();
		}
		if ($bcst_alt_nm4_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm4_to();
		}
		if ($acst_cd_to.equalsIgnoreCase(name)) {
			return acst_cd_to();
		}
		if ($acst_nm_to.equalsIgnoreCase(name)) {
			return acst_nm_to();
		}
		if ($acst_alt_nm1_to.equalsIgnoreCase(name)) {
			return acst_alt_nm1_to();
		}
		if ($acst_alt_nm2_to.equalsIgnoreCase(name)) {
			return acst_alt_nm2_to();
		}
		if ($acst_alt_nm3_to.equalsIgnoreCase(name)) {
			return acst_alt_nm3_to();
		}
		if ($acst_alt_nm4_to.equalsIgnoreCase(name)) {
			return acst_alt_nm4_to();
		}
		if ($bill_dpt_cd_to.equalsIgnoreCase(name)) {
			return bill_dpt_cd_to();
		}
		if ($bill_dpt_nm_to.equalsIgnoreCase(name)) {
			return bill_dpt_nm_to();
		}
		if ($ar_dpt_cd_to.equalsIgnoreCase(name)) {
			return ar_dpt_cd_to();
		}
		if ($ar_dpt_nm_to.equalsIgnoreCase(name)) {
			return ar_dpt_nm_to();
		}
		if ($wrk_no_to.equalsIgnoreCase(name)) {
			return wrk_no_to();
		}
		if ($wrk_nm_to.equalsIgnoreCase(name)) {
			return wrk_nm_to();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_amt();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($bcst_cd_fr.equalsIgnoreCase(name)) {
			return bcst_cd_fr();
		}
		if ($bcst_nm_fr.equalsIgnoreCase(name)) {
			return bcst_nm_fr();
		}
		if ($bcst_alt_nm1_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm1_fr();
		}
		if ($bcst_alt_nm2_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm2_fr();
		}
		if ($bcst_alt_nm3_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm3_fr();
		}
		if ($bcst_alt_nm4_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm4_fr();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
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
		if ($bcst_cd_to.equalsIgnoreCase(name)) {
			return bcst_cd_to();
		}
		if ($bcst_nm_to.equalsIgnoreCase(name)) {
			return bcst_nm_to();
		}
		if ($bcst_alt_nm1_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm1_to();
		}
		if ($bcst_alt_nm2_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm2_to();
		}
		if ($bcst_alt_nm3_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm3_to();
		}
		if ($bcst_alt_nm4_to.equalsIgnoreCase(name)) {
			return bcst_alt_nm4_to();
		}
		if ($acst_cd_to.equalsIgnoreCase(name)) {
			return acst_cd_to();
		}
		if ($acst_nm_to.equalsIgnoreCase(name)) {
			return acst_nm_to();
		}
		if ($acst_alt_nm1_to.equalsIgnoreCase(name)) {
			return acst_alt_nm1_to();
		}
		if ($acst_alt_nm2_to.equalsIgnoreCase(name)) {
			return acst_alt_nm2_to();
		}
		if ($acst_alt_nm3_to.equalsIgnoreCase(name)) {
			return acst_alt_nm3_to();
		}
		if ($acst_alt_nm4_to.equalsIgnoreCase(name)) {
			return acst_alt_nm4_to();
		}
		if ($bill_dpt_cd_to.equalsIgnoreCase(name)) {
			return bill_dpt_cd_to();
		}
		if ($bill_dpt_nm_to.equalsIgnoreCase(name)) {
			return bill_dpt_nm_to();
		}
		if ($ar_dpt_cd_to.equalsIgnoreCase(name)) {
			return ar_dpt_cd_to();
		}
		if ($ar_dpt_nm_to.equalsIgnoreCase(name)) {
			return ar_dpt_nm_to();
		}
		if ($wrk_no_to.equalsIgnoreCase(name)) {
			return wrk_no_to();
		}
		if ($wrk_nm_to.equalsIgnoreCase(name)) {
			return wrk_nm_to();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_trd_cur_amt();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($bcst_cd_fr.equalsIgnoreCase(name)) {
			return bcst_cd_fr();
		}
		if ($bcst_nm_fr.equalsIgnoreCase(name)) {
			return bcst_nm_fr();
		}
		if ($bcst_alt_nm1_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm1_fr();
		}
		if ($bcst_alt_nm2_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm2_fr();
		}
		if ($bcst_alt_nm3_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm3_fr();
		}
		if ($bcst_alt_nm4_fr.equalsIgnoreCase(name)) {
			return bcst_alt_nm4_fr();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
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
		if ($bcst_cd_to.equalsIgnoreCase(name)) {
			bcst_cd_to(value);
			return;
		}
		if ($bcst_nm_to.equalsIgnoreCase(name)) {
			bcst_nm_to(value);
			return;
		}
		if ($bcst_alt_nm1_to.equalsIgnoreCase(name)) {
			bcst_alt_nm1_to(value);
			return;
		}
		if ($bcst_alt_nm2_to.equalsIgnoreCase(name)) {
			bcst_alt_nm2_to(value);
			return;
		}
		if ($bcst_alt_nm3_to.equalsIgnoreCase(name)) {
			bcst_alt_nm3_to(value);
			return;
		}
		if ($bcst_alt_nm4_to.equalsIgnoreCase(name)) {
			bcst_alt_nm4_to(value);
			return;
		}
		if ($acst_cd_to.equalsIgnoreCase(name)) {
			acst_cd_to(value);
			return;
		}
		if ($acst_nm_to.equalsIgnoreCase(name)) {
			acst_nm_to(value);
			return;
		}
		if ($acst_alt_nm1_to.equalsIgnoreCase(name)) {
			acst_alt_nm1_to(value);
			return;
		}
		if ($acst_alt_nm2_to.equalsIgnoreCase(name)) {
			acst_alt_nm2_to(value);
			return;
		}
		if ($acst_alt_nm3_to.equalsIgnoreCase(name)) {
			acst_alt_nm3_to(value);
			return;
		}
		if ($acst_alt_nm4_to.equalsIgnoreCase(name)) {
			acst_alt_nm4_to(value);
			return;
		}
		if ($bill_dpt_cd_to.equalsIgnoreCase(name)) {
			bill_dpt_cd_to(value);
			return;
		}
		if ($bill_dpt_nm_to.equalsIgnoreCase(name)) {
			bill_dpt_nm_to(value);
			return;
		}
		if ($ar_dpt_cd_to.equalsIgnoreCase(name)) {
			ar_dpt_cd_to(value);
			return;
		}
		if ($ar_dpt_nm_to.equalsIgnoreCase(name)) {
			ar_dpt_nm_to(value);
			return;
		}
		if ($wrk_no_to.equalsIgnoreCase(name)) {
			wrk_no_to(value);
			return;
		}
		if ($wrk_nm_to.equalsIgnoreCase(name)) {
			wrk_nm_to(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			s_trd_cur_amt(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($bcst_cd_fr.equalsIgnoreCase(name)) {
			bcst_cd_fr(value);
			return;
		}
		if ($bcst_nm_fr.equalsIgnoreCase(name)) {
			bcst_nm_fr(value);
			return;
		}
		if ($bcst_alt_nm1_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm1_fr(value);
			return;
		}
		if ($bcst_alt_nm2_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm2_fr(value);
			return;
		}
		if ($bcst_alt_nm3_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm3_fr(value);
			return;
		}
		if ($bcst_alt_nm4_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm4_fr(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($bcst_cd_to.equalsIgnoreCase(name)) {
			bcst_cd_to(value);
			return;
		}
		if ($bcst_nm_to.equalsIgnoreCase(name)) {
			bcst_nm_to(value);
			return;
		}
		if ($bcst_alt_nm1_to.equalsIgnoreCase(name)) {
			bcst_alt_nm1_to(value);
			return;
		}
		if ($bcst_alt_nm2_to.equalsIgnoreCase(name)) {
			bcst_alt_nm2_to(value);
			return;
		}
		if ($bcst_alt_nm3_to.equalsIgnoreCase(name)) {
			bcst_alt_nm3_to(value);
			return;
		}
		if ($bcst_alt_nm4_to.equalsIgnoreCase(name)) {
			bcst_alt_nm4_to(value);
			return;
		}
		if ($acst_cd_to.equalsIgnoreCase(name)) {
			acst_cd_to(value);
			return;
		}
		if ($acst_nm_to.equalsIgnoreCase(name)) {
			acst_nm_to(value);
			return;
		}
		if ($acst_alt_nm1_to.equalsIgnoreCase(name)) {
			acst_alt_nm1_to(value);
			return;
		}
		if ($acst_alt_nm2_to.equalsIgnoreCase(name)) {
			acst_alt_nm2_to(value);
			return;
		}
		if ($acst_alt_nm3_to.equalsIgnoreCase(name)) {
			acst_alt_nm3_to(value);
			return;
		}
		if ($acst_alt_nm4_to.equalsIgnoreCase(name)) {
			acst_alt_nm4_to(value);
			return;
		}
		if ($bill_dpt_cd_to.equalsIgnoreCase(name)) {
			bill_dpt_cd_to(value);
			return;
		}
		if ($bill_dpt_nm_to.equalsIgnoreCase(name)) {
			bill_dpt_nm_to(value);
			return;
		}
		if ($ar_dpt_cd_to.equalsIgnoreCase(name)) {
			ar_dpt_cd_to(value);
			return;
		}
		if ($ar_dpt_nm_to.equalsIgnoreCase(name)) {
			ar_dpt_nm_to(value);
			return;
		}
		if ($wrk_no_to.equalsIgnoreCase(name)) {
			wrk_no_to(value);
			return;
		}
		if ($wrk_nm_to.equalsIgnoreCase(name)) {
			wrk_nm_to(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($s_trd_cur_amt.equalsIgnoreCase(name)) {
			s_trd_cur_amt(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($bcst_cd_fr.equalsIgnoreCase(name)) {
			bcst_cd_fr(value);
			return;
		}
		if ($bcst_nm_fr.equalsIgnoreCase(name)) {
			bcst_nm_fr(value);
			return;
		}
		if ($bcst_alt_nm1_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm1_fr(value);
			return;
		}
		if ($bcst_alt_nm2_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm2_fr(value);
			return;
		}
		if ($bcst_alt_nm3_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm3_fr(value);
			return;
		}
		if ($bcst_alt_nm4_fr.equalsIgnoreCase(name)) {
			bcst_alt_nm4_fr(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
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

