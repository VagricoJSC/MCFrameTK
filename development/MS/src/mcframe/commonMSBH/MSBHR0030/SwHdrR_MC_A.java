package mcframe.commonMSBH.MSBHR0030;

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
	 *  支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 *  支払実績連番.<p>
	 *
	 */
	public static final String $pay_act_seq = "pay_act_seq";
	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public static final String $pay_act_rev = "pay_act_rev";
	/**
	 *  支払部門ＣＤ.<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	/**
	 *  支払部門名.<p>
	 *
	 */
	public static final String $pay_dpt_nm = "pay_dpt_nm";
	/**
	 *  支払担当者ＣＤ.<p>
	 *
	 */
	public static final String $pay_usr_cd = "pay_usr_cd";
	/**
	 *  支払担当者名.<p>
	 *
	 */
	public static final String $pay_usr_nm = "pay_usr_nm";
	/**
	 *  支払実績日.<p>
	 *
	 */
	public static final String $pay_act_dt = "pay_act_dt";
	/**
	 *  支払予定管理先ＣＤ（振替先）.<p>
	 *
	 */
	public static final String $bsppl_cd_to = "bsppl_cd_to";
	/**
	 *  支払予定管理先名（振替先）.<p>
	 *
	 */
	public static final String $bsppl_nm_to = "bsppl_nm_to";
	/**
	 *  支払予定管理先別名１（振替先）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm1_to = "bsppl_alt_nm1_to";
	/**
	 *  支払予定管理先別名２（振替先）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm2_to = "bsppl_alt_nm2_to";
	/**
	 *  支払予定管理先別名３（振替先）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm3_to = "bsppl_alt_nm3_to";
	/**
	 *  支払予定管理先別名４（振替先）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm4_to = "bsppl_alt_nm4_to";
	/**
	 *  買掛先ＣＤ（振替先）.<p>
	 *
	 */
	public static final String $asppl_cd_to = "asppl_cd_to";
	/**
	 *  買掛先名（振替先）.<p>
	 *
	 */
	public static final String $asppl_nm_to = "asppl_nm_to";
	/**
	 *  買掛先別名１（振替先）.<p>
	 *
	 */
	public static final String $asppl_alt_nm1_to = "asppl_alt_nm1_to";
	/**
	 *  買掛先別名２（振替先）.<p>
	 *
	 */
	public static final String $asppl_alt_nm2_to = "asppl_alt_nm2_to";
	/**
	 *  買掛先別名３（振替先）.<p>
	 *
	 */
	public static final String $asppl_alt_nm3_to = "asppl_alt_nm3_to";
	/**
	 *  買掛先別名４（振替先）.<p>
	 *
	 */
	public static final String $asppl_alt_nm4_to = "asppl_alt_nm4_to";
	/**
	 *  支払予定管理先担当部門ＣＤ（振替先）.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd_to = "bsppl_dpt_cd_to";
	/**
	 *  支払予定管理先担当部門名（振替先）.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm_to = "bsppl_dpt_nm_to";
	/**
	 *  債務部門ＣＤ（振替先）.<p>
	 *
	 */
	public static final String $ap_dpt_cd_to = "ap_dpt_cd_to";
	/**
	 *  債務部門名（振替先）.<p>
	 *
	 */
	public static final String $ap_dpt_nm_to = "ap_dpt_nm_to";
	/**
	 *  案件ＮＯ（振替先・表示用）.<p>
	 *
	 */
	public static final String $wrk_no_to_view = "wrk_no_to_view";
	/**
	 *  案件ＮＯ（振替先・データ）.<p>
	 *
	 */
	public static final String $wrk_no_to_data = "wrk_no_to_data";
	/**
	 *  案件名（振替先）.<p>
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
	public static final String $ttl_trd_cur_amt = "ttl_trd_cur_amt";
	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_amt = "s_ttl_trd_cur_amt";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 *  支払予定管理先ＣＤ（振替元）.<p>
	 *
	 */
	public static final String $bsppl_cd_fr = "bsppl_cd_fr";
	/**
	 *  支払予定管理先名（振替元）.<p>
	 *
	 */
	public static final String $bsppl_nm_fr = "bsppl_nm_fr";
	/**
	 *  支払予定管理先別名１（振替元）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm1_fr = "bsppl_alt_nm1_fr";
	/**
	 *  支払予定管理先別名２（振替元）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm2_fr = "bsppl_alt_nm2_fr";
	/**
	 *  支払予定管理先別名３（振替元）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm3_fr = "bsppl_alt_nm3_fr";
	/**
	 *  支払予定管理先別名４（振替元）.<p>
	 *
	 */
	public static final String $bsppl_alt_nm4_fr = "bsppl_alt_nm4_fr";
	/**
	 *  為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public static final String $s_xrate = "s_xrate";
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
	 *  債務決済方法ＣＤ.<p>
	 *
	 */
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	/**
	 *  債務決済方法名.<p>
	 *
	 */
	public static final String $report_title = "report_title";
	/**
	 *  債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	/**
	 *  債務決済区分名.<p>
	 *
	 */
	public static final String $ap_sttl_typ_nm = "ap_sttl_typ_nm";
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


	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_act_rev_META = createCommonMeta($pay_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_usr_cd_META = createCommonMeta($pay_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_usr_nm_META = createCommonMeta($pay_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pay_act_dt_META = createCommonMeta($pay_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bsppl_cd_to_META = createCommonMeta($bsppl_cd_to, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_to_META = createCommonMeta($bsppl_nm_to, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_alt_nm1_to_META = createCommonMeta($bsppl_alt_nm1_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bsppl_alt_nm2_to_META = createCommonMeta($bsppl_alt_nm2_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bsppl_alt_nm3_to_META = createCommonMeta($bsppl_alt_nm3_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bsppl_alt_nm4_to_META = createCommonMeta($bsppl_alt_nm4_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta asppl_cd_to_META = createCommonMeta($asppl_cd_to, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_to_META = createCommonMeta($asppl_nm_to, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asppl_alt_nm1_to_META = createCommonMeta($asppl_alt_nm1_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta asppl_alt_nm2_to_META = createCommonMeta($asppl_alt_nm2_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta asppl_alt_nm3_to_META = createCommonMeta($asppl_alt_nm3_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta asppl_alt_nm4_to_META = createCommonMeta($asppl_alt_nm4_to, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bsppl_dpt_cd_to_META = createCommonMeta($bsppl_dpt_cd_to, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_to_META = createCommonMeta($bsppl_dpt_nm_to, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_dpt_cd_to_META = createCommonMeta($ap_dpt_cd_to, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_to_META = createCommonMeta($ap_dpt_nm_to, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wrk_no_to_view_META = createCommonMeta($wrk_no_to_view, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_no_to_data_META = createCommonMeta($wrk_no_to_data, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_to_META = createCommonMeta($wrk_nm_to, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ttl_trd_cur_amt_META = createCommonMeta($ttl_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_amt_META = createStringMeta($s_ttl_trd_cur_amt);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta bsppl_cd_fr_META = createCommonMeta($bsppl_cd_fr, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_nm_fr_META = createCommonMeta($bsppl_nm_fr, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bsppl_alt_nm1_fr_META = createCommonMeta($bsppl_alt_nm1_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bsppl_alt_nm2_fr_META = createCommonMeta($bsppl_alt_nm2_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bsppl_alt_nm3_fr_META = createCommonMeta($bsppl_alt_nm3_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bsppl_alt_nm4_fr_META = createCommonMeta($bsppl_alt_nm4_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_xrate_META = createStringMeta($s_xrate);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta report_title_META = createCommonMeta($report_title, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_SUB_CHAR3);

	protected static final ConstMetaList<SwHdrR> constMetas = new ConstMetaList<SwHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_act_no_META,
			pay_act_seq_META,
			pay_act_rev_META,
			pay_dpt_cd_META,
			pay_dpt_nm_META,
			pay_usr_cd_META,
			pay_usr_nm_META,
			pay_act_dt_META,
			bsppl_cd_to_META,
			bsppl_nm_to_META,
			bsppl_alt_nm1_to_META,
			bsppl_alt_nm2_to_META,
			bsppl_alt_nm3_to_META,
			bsppl_alt_nm4_to_META,
			asppl_cd_to_META,
			asppl_nm_to_META,
			asppl_alt_nm1_to_META,
			asppl_alt_nm2_to_META,
			asppl_alt_nm3_to_META,
			asppl_alt_nm4_to_META,
			bsppl_dpt_cd_to_META,
			bsppl_dpt_nm_to_META,
			ap_dpt_cd_to_META,
			ap_dpt_nm_to_META,
			wrk_no_to_view_META,
			wrk_no_to_data_META,
			wrk_nm_to_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			ttl_trd_cur_amt_META,
			s_ttl_trd_cur_amt_META,
			trd_rmrks_META,
			bsppl_cd_fr_META,
			bsppl_nm_fr_META,
			bsppl_alt_nm1_fr_META,
			bsppl_alt_nm2_fr_META,
			bsppl_alt_nm3_fr_META,
			bsppl_alt_nm4_fr_META,
			xrate_META,
			s_xrate_META,
			prnt_tm_META,
			ac_dt_META,
			ap_sttl_cd_META,
			report_title_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
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
	 *  支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 0, $pay_act_no);
	}

	/**
	 *  支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 0, $pay_act_no, value);
	}


	/**
	 *  支払実績連番.<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return getConstNumber(offset + 1, $pay_act_seq);
	}

	/**
	 *  支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 *  支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(int value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 *  支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(long value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 *  支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(float value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 *  支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(double value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}


	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public MCNumber pay_act_rev() {
		return getConstNumber(offset + 2, $pay_act_rev);
	}

	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $pay_act_rev, value);
	}

	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(int value) {
		setConstNumber(offset + 2, $pay_act_rev, value);
	}

	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(long value) {
		setConstNumber(offset + 2, $pay_act_rev, value);
	}

	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(float value) {
		setConstNumber(offset + 2, $pay_act_rev, value);
	}

	/**
	 *  支払実績改訂番号.<p>
	 *
	 */
	public void pay_act_rev(double value) {
		setConstNumber(offset + 2, $pay_act_rev, value);
	}


	/**
	 *  支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 3, $pay_dpt_cd);
	}

	/**
	 *  支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 3, $pay_dpt_cd, value);
	}


	/**
	 *  支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 4, $pay_dpt_nm);
	}

	/**
	 *  支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 4, $pay_dpt_nm, value);
	}


	/**
	 *  支払担当者ＣＤ.<p>
	 *
	 */
	public String pay_usr_cd() {
		return getConstString(offset + 5, $pay_usr_cd);
	}

	/**
	 *  支払担当者ＣＤ.<p>
	 *
	 */
	public void pay_usr_cd(String value) {
		setConstString(offset + 5, $pay_usr_cd, value);
	}


	/**
	 *  支払担当者名.<p>
	 *
	 */
	public String pay_usr_nm() {
		return getConstString(offset + 6, $pay_usr_nm);
	}

	/**
	 *  支払担当者名.<p>
	 *
	 */
	public void pay_usr_nm(String value) {
		setConstString(offset + 6, $pay_usr_nm, value);
	}


	/**
	 *  支払実績日.<p>
	 *
	 */
	public MCDate pay_act_dt() {
		return getConstDate(offset + 7, $pay_act_dt);
	}

	/**
	 *  支払実績日.<p>
	 *
	 */
	public void pay_act_dt(MCDate value) {
		setConstDate(offset + 7, $pay_act_dt, value);
	}


	/**
	 *  支払予定管理先ＣＤ（振替先）.<p>
	 *
	 */
	public String bsppl_cd_to() {
		return getConstString(offset + 8, $bsppl_cd_to);
	}

	/**
	 *  支払予定管理先ＣＤ（振替先）.<p>
	 *
	 */
	public void bsppl_cd_to(String value) {
		setConstString(offset + 8, $bsppl_cd_to, value);
	}


	/**
	 *  支払予定管理先名（振替先）.<p>
	 *
	 */
	public String bsppl_nm_to() {
		return getConstString(offset + 9, $bsppl_nm_to);
	}

	/**
	 *  支払予定管理先名（振替先）.<p>
	 *
	 */
	public void bsppl_nm_to(String value) {
		setConstString(offset + 9, $bsppl_nm_to, value);
	}


	/**
	 *  支払予定管理先別名１（振替先）.<p>
	 *
	 */
	public String bsppl_alt_nm1_to() {
		return getConstString(offset + 10, $bsppl_alt_nm1_to);
	}

	/**
	 *  支払予定管理先別名１（振替先）.<p>
	 *
	 */
	public void bsppl_alt_nm1_to(String value) {
		setConstString(offset + 10, $bsppl_alt_nm1_to, value);
	}


	/**
	 *  支払予定管理先別名２（振替先）.<p>
	 *
	 */
	public String bsppl_alt_nm2_to() {
		return getConstString(offset + 11, $bsppl_alt_nm2_to);
	}

	/**
	 *  支払予定管理先別名２（振替先）.<p>
	 *
	 */
	public void bsppl_alt_nm2_to(String value) {
		setConstString(offset + 11, $bsppl_alt_nm2_to, value);
	}


	/**
	 *  支払予定管理先別名３（振替先）.<p>
	 *
	 */
	public String bsppl_alt_nm3_to() {
		return getConstString(offset + 12, $bsppl_alt_nm3_to);
	}

	/**
	 *  支払予定管理先別名３（振替先）.<p>
	 *
	 */
	public void bsppl_alt_nm3_to(String value) {
		setConstString(offset + 12, $bsppl_alt_nm3_to, value);
	}


	/**
	 *  支払予定管理先別名４（振替先）.<p>
	 *
	 */
	public String bsppl_alt_nm4_to() {
		return getConstString(offset + 13, $bsppl_alt_nm4_to);
	}

	/**
	 *  支払予定管理先別名４（振替先）.<p>
	 *
	 */
	public void bsppl_alt_nm4_to(String value) {
		setConstString(offset + 13, $bsppl_alt_nm4_to, value);
	}


	/**
	 *  買掛先ＣＤ（振替先）.<p>
	 *
	 */
	public String asppl_cd_to() {
		return getConstString(offset + 14, $asppl_cd_to);
	}

	/**
	 *  買掛先ＣＤ（振替先）.<p>
	 *
	 */
	public void asppl_cd_to(String value) {
		setConstString(offset + 14, $asppl_cd_to, value);
	}


	/**
	 *  買掛先名（振替先）.<p>
	 *
	 */
	public String asppl_nm_to() {
		return getConstString(offset + 15, $asppl_nm_to);
	}

	/**
	 *  買掛先名（振替先）.<p>
	 *
	 */
	public void asppl_nm_to(String value) {
		setConstString(offset + 15, $asppl_nm_to, value);
	}


	/**
	 *  買掛先別名１（振替先）.<p>
	 *
	 */
	public String asppl_alt_nm1_to() {
		return getConstString(offset + 16, $asppl_alt_nm1_to);
	}

	/**
	 *  買掛先別名１（振替先）.<p>
	 *
	 */
	public void asppl_alt_nm1_to(String value) {
		setConstString(offset + 16, $asppl_alt_nm1_to, value);
	}


	/**
	 *  買掛先別名２（振替先）.<p>
	 *
	 */
	public String asppl_alt_nm2_to() {
		return getConstString(offset + 17, $asppl_alt_nm2_to);
	}

	/**
	 *  買掛先別名２（振替先）.<p>
	 *
	 */
	public void asppl_alt_nm2_to(String value) {
		setConstString(offset + 17, $asppl_alt_nm2_to, value);
	}


	/**
	 *  買掛先別名３（振替先）.<p>
	 *
	 */
	public String asppl_alt_nm3_to() {
		return getConstString(offset + 18, $asppl_alt_nm3_to);
	}

	/**
	 *  買掛先別名３（振替先）.<p>
	 *
	 */
	public void asppl_alt_nm3_to(String value) {
		setConstString(offset + 18, $asppl_alt_nm3_to, value);
	}


	/**
	 *  買掛先別名４（振替先）.<p>
	 *
	 */
	public String asppl_alt_nm4_to() {
		return getConstString(offset + 19, $asppl_alt_nm4_to);
	}

	/**
	 *  買掛先別名４（振替先）.<p>
	 *
	 */
	public void asppl_alt_nm4_to(String value) {
		setConstString(offset + 19, $asppl_alt_nm4_to, value);
	}


	/**
	 *  支払予定管理先担当部門ＣＤ（振替先）.<p>
	 *
	 */
	public String bsppl_dpt_cd_to() {
		return getConstString(offset + 20, $bsppl_dpt_cd_to);
	}

	/**
	 *  支払予定管理先担当部門ＣＤ（振替先）.<p>
	 *
	 */
	public void bsppl_dpt_cd_to(String value) {
		setConstString(offset + 20, $bsppl_dpt_cd_to, value);
	}


	/**
	 *  支払予定管理先担当部門名（振替先）.<p>
	 *
	 */
	public String bsppl_dpt_nm_to() {
		return getConstString(offset + 21, $bsppl_dpt_nm_to);
	}

	/**
	 *  支払予定管理先担当部門名（振替先）.<p>
	 *
	 */
	public void bsppl_dpt_nm_to(String value) {
		setConstString(offset + 21, $bsppl_dpt_nm_to, value);
	}


	/**
	 *  債務部門ＣＤ（振替先）.<p>
	 *
	 */
	public String ap_dpt_cd_to() {
		return getConstString(offset + 22, $ap_dpt_cd_to);
	}

	/**
	 *  債務部門ＣＤ（振替先）.<p>
	 *
	 */
	public void ap_dpt_cd_to(String value) {
		setConstString(offset + 22, $ap_dpt_cd_to, value);
	}


	/**
	 *  債務部門名（振替先）.<p>
	 *
	 */
	public String ap_dpt_nm_to() {
		return getConstString(offset + 23, $ap_dpt_nm_to);
	}

	/**
	 *  債務部門名（振替先）.<p>
	 *
	 */
	public void ap_dpt_nm_to(String value) {
		setConstString(offset + 23, $ap_dpt_nm_to, value);
	}


	/**
	 *  案件ＮＯ（振替先・表示用）.<p>
	 *
	 */
	public String wrk_no_to_view() {
		return getConstString(offset + 24, $wrk_no_to_view);
	}

	/**
	 *  案件ＮＯ（振替先・表示用）.<p>
	 *
	 */
	public void wrk_no_to_view(String value) {
		setConstString(offset + 24, $wrk_no_to_view, value);
	}


	/**
	 *  案件ＮＯ（振替先・データ）.<p>
	 *
	 */
	public String wrk_no_to_data() {
		return getConstString(offset + 25, $wrk_no_to_data);
	}

	/**
	 *  案件ＮＯ（振替先・データ）.<p>
	 *
	 */
	public void wrk_no_to_data(String value) {
		setConstString(offset + 25, $wrk_no_to_data, value);
	}


	/**
	 *  案件名（振替先）.<p>
	 *
	 */
	public String wrk_nm_to() {
		return getConstString(offset + 26, $wrk_nm_to);
	}

	/**
	 *  案件名（振替先）.<p>
	 *
	 */
	public void wrk_nm_to(String value) {
		setConstString(offset + 26, $wrk_nm_to, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 27, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 27, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 28, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 28, $trd_cur_nm, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_amt() {
		return getConstNumber(offset + 29, $ttl_trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 29, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(int value) {
		setConstNumber(offset + 29, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(long value) {
		setConstNumber(offset + 29, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(float value) {
		setConstNumber(offset + 29, $ttl_trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void ttl_trd_cur_amt(double value) {
		setConstNumber(offset + 29, $ttl_trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_amt() {
		return getConstString(offset + 30, $s_ttl_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_amt(String value) {
		setConstString(offset + 30, $s_ttl_trd_cur_amt, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 31, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 31, $trd_rmrks, value);
	}


	/**
	 *  支払予定管理先ＣＤ（振替元）.<p>
	 *
	 */
	public String bsppl_cd_fr() {
		return getConstString(offset + 32, $bsppl_cd_fr);
	}

	/**
	 *  支払予定管理先ＣＤ（振替元）.<p>
	 *
	 */
	public void bsppl_cd_fr(String value) {
		setConstString(offset + 32, $bsppl_cd_fr, value);
	}


	/**
	 *  支払予定管理先名（振替元）.<p>
	 *
	 */
	public String bsppl_nm_fr() {
		return getConstString(offset + 33, $bsppl_nm_fr);
	}

	/**
	 *  支払予定管理先名（振替元）.<p>
	 *
	 */
	public void bsppl_nm_fr(String value) {
		setConstString(offset + 33, $bsppl_nm_fr, value);
	}


	/**
	 *  支払予定管理先別名１（振替元）.<p>
	 *
	 */
	public String bsppl_alt_nm1_fr() {
		return getConstString(offset + 34, $bsppl_alt_nm1_fr);
	}

	/**
	 *  支払予定管理先別名１（振替元）.<p>
	 *
	 */
	public void bsppl_alt_nm1_fr(String value) {
		setConstString(offset + 34, $bsppl_alt_nm1_fr, value);
	}


	/**
	 *  支払予定管理先別名２（振替元）.<p>
	 *
	 */
	public String bsppl_alt_nm2_fr() {
		return getConstString(offset + 35, $bsppl_alt_nm2_fr);
	}

	/**
	 *  支払予定管理先別名２（振替元）.<p>
	 *
	 */
	public void bsppl_alt_nm2_fr(String value) {
		setConstString(offset + 35, $bsppl_alt_nm2_fr, value);
	}


	/**
	 *  支払予定管理先別名３（振替元）.<p>
	 *
	 */
	public String bsppl_alt_nm3_fr() {
		return getConstString(offset + 36, $bsppl_alt_nm3_fr);
	}

	/**
	 *  支払予定管理先別名３（振替元）.<p>
	 *
	 */
	public void bsppl_alt_nm3_fr(String value) {
		setConstString(offset + 36, $bsppl_alt_nm3_fr, value);
	}


	/**
	 *  支払予定管理先別名４（振替元）.<p>
	 *
	 */
	public String bsppl_alt_nm4_fr() {
		return getConstString(offset + 37, $bsppl_alt_nm4_fr);
	}

	/**
	 *  支払予定管理先別名４（振替元）.<p>
	 *
	 */
	public void bsppl_alt_nm4_fr(String value) {
		setConstString(offset + 37, $bsppl_alt_nm4_fr, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 38, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 38, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 38, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 38, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 38, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 38, $xrate, value);
	}


	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public String s_xrate() {
		return getConstString(offset + 39, $s_xrate);
	}

	/**
	 *  為替レート文字列.<p>
	 *
	 */
	public void s_xrate(String value) {
		setConstString(offset + 39, $s_xrate, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 40, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 40, $prnt_tm, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 41, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 41, $ac_dt, value);
	}


	/**
	 *  債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return getConstString(offset + 42, $ap_sttl_cd);
	}

	/**
	 *  債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		setConstString(offset + 42, $ap_sttl_cd, value);
	}


	/**
	 *  債務決済方法名.<p>
	 *
	 */
	public String report_title() {
		return getConstString(offset + 43, $report_title);
	}

	/**
	 *  債務決済方法名.<p>
	 *
	 */
	public void report_title(String value) {
		setConstString(offset + 43, $report_title, value);
	}


	/**
	 *  債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 44, $ap_sttl_typ);
	}

	/**
	 *  債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 44, $ap_sttl_typ, value);
	}


	/**
	 *  債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 45, $ap_sttl_typ_nm);
	}

	/**
	 *  債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 45, $ap_sttl_typ_nm, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 46, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 46, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 47, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 47, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 48, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 48, $sub_char3, value);
	}


	public String getString(String name) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			return pay_usr_nm();
		}
		if ($bsppl_cd_to.equalsIgnoreCase(name)) {
			return bsppl_cd_to();
		}
		if ($bsppl_nm_to.equalsIgnoreCase(name)) {
			return bsppl_nm_to();
		}
		if ($bsppl_alt_nm1_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1_to();
		}
		if ($bsppl_alt_nm2_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2_to();
		}
		if ($bsppl_alt_nm3_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3_to();
		}
		if ($bsppl_alt_nm4_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4_to();
		}
		if ($asppl_cd_to.equalsIgnoreCase(name)) {
			return asppl_cd_to();
		}
		if ($asppl_nm_to.equalsIgnoreCase(name)) {
			return asppl_nm_to();
		}
		if ($asppl_alt_nm1_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm1_to();
		}
		if ($asppl_alt_nm2_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm2_to();
		}
		if ($asppl_alt_nm3_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm3_to();
		}
		if ($asppl_alt_nm4_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm4_to();
		}
		if ($bsppl_dpt_cd_to.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd_to();
		}
		if ($bsppl_dpt_nm_to.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm_to();
		}
		if ($ap_dpt_cd_to.equalsIgnoreCase(name)) {
			return ap_dpt_cd_to();
		}
		if ($ap_dpt_nm_to.equalsIgnoreCase(name)) {
			return ap_dpt_nm_to();
		}
		if ($wrk_no_to_view.equalsIgnoreCase(name)) {
			return wrk_no_to_view();
		}
		if ($wrk_no_to_data.equalsIgnoreCase(name)) {
			return wrk_no_to_data();
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
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($bsppl_cd_fr.equalsIgnoreCase(name)) {
			return bsppl_cd_fr();
		}
		if ($bsppl_nm_fr.equalsIgnoreCase(name)) {
			return bsppl_nm_fr();
		}
		if ($bsppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1_fr();
		}
		if ($bsppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2_fr();
		}
		if ($bsppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3_fr();
		}
		if ($bsppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4_fr();
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			return s_xrate();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			return pay_act_rev();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
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
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			return pay_usr_cd();
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			return pay_usr_nm();
		}
		if ($bsppl_cd_to.equalsIgnoreCase(name)) {
			return bsppl_cd_to();
		}
		if ($bsppl_nm_to.equalsIgnoreCase(name)) {
			return bsppl_nm_to();
		}
		if ($bsppl_alt_nm1_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1_to();
		}
		if ($bsppl_alt_nm2_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2_to();
		}
		if ($bsppl_alt_nm3_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3_to();
		}
		if ($bsppl_alt_nm4_to.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4_to();
		}
		if ($asppl_cd_to.equalsIgnoreCase(name)) {
			return asppl_cd_to();
		}
		if ($asppl_nm_to.equalsIgnoreCase(name)) {
			return asppl_nm_to();
		}
		if ($asppl_alt_nm1_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm1_to();
		}
		if ($asppl_alt_nm2_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm2_to();
		}
		if ($asppl_alt_nm3_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm3_to();
		}
		if ($asppl_alt_nm4_to.equalsIgnoreCase(name)) {
			return asppl_alt_nm4_to();
		}
		if ($bsppl_dpt_cd_to.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd_to();
		}
		if ($bsppl_dpt_nm_to.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm_to();
		}
		if ($ap_dpt_cd_to.equalsIgnoreCase(name)) {
			return ap_dpt_cd_to();
		}
		if ($ap_dpt_nm_to.equalsIgnoreCase(name)) {
			return ap_dpt_nm_to();
		}
		if ($wrk_no_to_view.equalsIgnoreCase(name)) {
			return wrk_no_to_view();
		}
		if ($wrk_no_to_data.equalsIgnoreCase(name)) {
			return wrk_no_to_data();
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
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($bsppl_cd_fr.equalsIgnoreCase(name)) {
			return bsppl_cd_fr();
		}
		if ($bsppl_nm_fr.equalsIgnoreCase(name)) {
			return bsppl_nm_fr();
		}
		if ($bsppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm1_fr();
		}
		if ($bsppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm2_fr();
		}
		if ($bsppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm3_fr();
		}
		if ($bsppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			return bsppl_alt_nm4_fr();
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			return s_xrate();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($report_title.equalsIgnoreCase(name)) {
			return report_title();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			return pay_act_rev();
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			return pay_act_dt();
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
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
			return;
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			pay_usr_nm(value);
			return;
		}
		if ($bsppl_cd_to.equalsIgnoreCase(name)) {
			bsppl_cd_to(value);
			return;
		}
		if ($bsppl_nm_to.equalsIgnoreCase(name)) {
			bsppl_nm_to(value);
			return;
		}
		if ($bsppl_alt_nm1_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm1_to(value);
			return;
		}
		if ($bsppl_alt_nm2_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm2_to(value);
			return;
		}
		if ($bsppl_alt_nm3_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm3_to(value);
			return;
		}
		if ($bsppl_alt_nm4_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm4_to(value);
			return;
		}
		if ($asppl_cd_to.equalsIgnoreCase(name)) {
			asppl_cd_to(value);
			return;
		}
		if ($asppl_nm_to.equalsIgnoreCase(name)) {
			asppl_nm_to(value);
			return;
		}
		if ($asppl_alt_nm1_to.equalsIgnoreCase(name)) {
			asppl_alt_nm1_to(value);
			return;
		}
		if ($asppl_alt_nm2_to.equalsIgnoreCase(name)) {
			asppl_alt_nm2_to(value);
			return;
		}
		if ($asppl_alt_nm3_to.equalsIgnoreCase(name)) {
			asppl_alt_nm3_to(value);
			return;
		}
		if ($asppl_alt_nm4_to.equalsIgnoreCase(name)) {
			asppl_alt_nm4_to(value);
			return;
		}
		if ($bsppl_dpt_cd_to.equalsIgnoreCase(name)) {
			bsppl_dpt_cd_to(value);
			return;
		}
		if ($bsppl_dpt_nm_to.equalsIgnoreCase(name)) {
			bsppl_dpt_nm_to(value);
			return;
		}
		if ($ap_dpt_cd_to.equalsIgnoreCase(name)) {
			ap_dpt_cd_to(value);
			return;
		}
		if ($ap_dpt_nm_to.equalsIgnoreCase(name)) {
			ap_dpt_nm_to(value);
			return;
		}
		if ($wrk_no_to_view.equalsIgnoreCase(name)) {
			wrk_no_to_view(value);
			return;
		}
		if ($wrk_no_to_data.equalsIgnoreCase(name)) {
			wrk_no_to_data(value);
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
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($bsppl_cd_fr.equalsIgnoreCase(name)) {
			bsppl_cd_fr(value);
			return;
		}
		if ($bsppl_nm_fr.equalsIgnoreCase(name)) {
			bsppl_nm_fr(value);
			return;
		}
		if ($bsppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm1_fr(value);
			return;
		}
		if ($bsppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm2_fr(value);
			return;
		}
		if ($bsppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm3_fr(value);
			return;
		}
		if ($bsppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm4_fr(value);
			return;
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			s_xrate(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
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
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($pay_usr_cd.equalsIgnoreCase(name)) {
			pay_usr_cd(value);
			return;
		}
		if ($pay_usr_nm.equalsIgnoreCase(name)) {
			pay_usr_nm(value);
			return;
		}
		if ($bsppl_cd_to.equalsIgnoreCase(name)) {
			bsppl_cd_to(value);
			return;
		}
		if ($bsppl_nm_to.equalsIgnoreCase(name)) {
			bsppl_nm_to(value);
			return;
		}
		if ($bsppl_alt_nm1_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm1_to(value);
			return;
		}
		if ($bsppl_alt_nm2_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm2_to(value);
			return;
		}
		if ($bsppl_alt_nm3_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm3_to(value);
			return;
		}
		if ($bsppl_alt_nm4_to.equalsIgnoreCase(name)) {
			bsppl_alt_nm4_to(value);
			return;
		}
		if ($asppl_cd_to.equalsIgnoreCase(name)) {
			asppl_cd_to(value);
			return;
		}
		if ($asppl_nm_to.equalsIgnoreCase(name)) {
			asppl_nm_to(value);
			return;
		}
		if ($asppl_alt_nm1_to.equalsIgnoreCase(name)) {
			asppl_alt_nm1_to(value);
			return;
		}
		if ($asppl_alt_nm2_to.equalsIgnoreCase(name)) {
			asppl_alt_nm2_to(value);
			return;
		}
		if ($asppl_alt_nm3_to.equalsIgnoreCase(name)) {
			asppl_alt_nm3_to(value);
			return;
		}
		if ($asppl_alt_nm4_to.equalsIgnoreCase(name)) {
			asppl_alt_nm4_to(value);
			return;
		}
		if ($bsppl_dpt_cd_to.equalsIgnoreCase(name)) {
			bsppl_dpt_cd_to(value);
			return;
		}
		if ($bsppl_dpt_nm_to.equalsIgnoreCase(name)) {
			bsppl_dpt_nm_to(value);
			return;
		}
		if ($ap_dpt_cd_to.equalsIgnoreCase(name)) {
			ap_dpt_cd_to(value);
			return;
		}
		if ($ap_dpt_nm_to.equalsIgnoreCase(name)) {
			ap_dpt_nm_to(value);
			return;
		}
		if ($wrk_no_to_view.equalsIgnoreCase(name)) {
			wrk_no_to_view(value);
			return;
		}
		if ($wrk_no_to_data.equalsIgnoreCase(name)) {
			wrk_no_to_data(value);
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
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($bsppl_cd_fr.equalsIgnoreCase(name)) {
			bsppl_cd_fr(value);
			return;
		}
		if ($bsppl_nm_fr.equalsIgnoreCase(name)) {
			bsppl_nm_fr(value);
			return;
		}
		if ($bsppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm1_fr(value);
			return;
		}
		if ($bsppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm2_fr(value);
			return;
		}
		if ($bsppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm3_fr(value);
			return;
		}
		if ($bsppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			bsppl_alt_nm4_fr(value);
			return;
		}
		if ($s_xrate.equalsIgnoreCase(name)) {
			s_xrate(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($report_title.equalsIgnoreCase(name)) {
			report_title(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
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
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		if ($pay_act_rev.equalsIgnoreCase(name)) {
			pay_act_rev(value);
			return;
		}
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_act_dt.equalsIgnoreCase(name)) {
			pay_act_dt(value);
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

