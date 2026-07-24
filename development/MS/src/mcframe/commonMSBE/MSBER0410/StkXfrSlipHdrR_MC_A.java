package mcframe.commonMSBE.MSBER0410;

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
 * ブロック"StkXfrSlipHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StkXfrSlipHdrR_MC_A extends MCConstRow {

	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  帳票タイトル名.<p>
	 *
	 */
	public static final String $formtitle = "formtitle";
	/**
	 *  取引.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  取引ＣＤ(データ).<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引パタン区分(データ).<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 *  伝票状況名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 *  伝票状況区分(データ).<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 *  在庫振替実績ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_act_no = "dlv_slip_act_no";
	/**
	 *  計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 *  場所.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 *  場所ＣＤ(データ).<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 *  部門(データ).<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 *  担当者(データ).<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
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


	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta formtitle_META = createStringMeta($formtitle);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_act_no_META = createCommonMeta($dlv_slip_act_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_ACT_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_SUB_CHAR3);

	protected static final ConstMetaList<StkXfrSlipHdrR> constMetas = new ConstMetaList<StkXfrSlipHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_tm_META,
			formtitle_META,
			trd_nm_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slip_sts_typ_nm_META,
			slip_sts_typ_META,
			dlv_slip_no_META,
			dlv_slip_rev_META,
			dlv_slip_act_no_META,
			ac_dt_META,
			loc_nm_META,
			loc_cd_META,
			dpt_nm_META,
			dpt_cd_META,
			usr_nm_META,
			usr_cd_META,
			trd_rmrks_META,
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
	protected StkXfrSlipHdrR_MC_A(ConstMetaList<? extends StkXfrSlipHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkXfrSlipHdrR clone() {
		return (StkXfrSlipHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkXfrSlipHdrR createInstance() {
		return (StkXfrSlipHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkXfrSlipHdrR getValues(String... names) {
		return (StkXfrSlipHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 0, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 0, $prnt_tm, value);
	}


	/**
	 *  帳票タイトル名.<p>
	 *
	 */
	public String formtitle() {
		return getConstString(offset + 1, $formtitle);
	}

	/**
	 *  帳票タイトル名.<p>
	 *
	 */
	public void formtitle(String value) {
		setConstString(offset + 1, $formtitle, value);
	}


	/**
	 *  取引.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 2, $trd_nm);
	}

	/**
	 *  取引.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 2, $trd_nm, value);
	}


	/**
	 *  取引ＣＤ(データ).<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 *  取引ＣＤ(データ).<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}


	/**
	 *  取引パタン区分(データ).<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 4, $trd_ptn_typ);
	}

	/**
	 *  取引パタン区分(データ).<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 4, $trd_ptn_typ, value);
	}


	/**
	 *  伝票状況名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 5, $slip_sts_typ_nm);
	}

	/**
	 *  伝票状況名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 5, $slip_sts_typ_nm, value);
	}


	/**
	 *  伝票状況区分(データ).<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 6, $slip_sts_typ);
	}

	/**
	 *  伝票状況区分(データ).<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 6, $slip_sts_typ, value);
	}


	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 7, $dlv_slip_no);
	}

	/**
	 *  納品書Ｎｏ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 7, $dlv_slip_no, value);
	}


	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 8, $dlv_slip_rev);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}

	/**
	 *  納品書リビジョン.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 8, $dlv_slip_rev, value);
	}


	/**
	 *  在庫振替実績ＮＯ.<p>
	 *
	 */
	public String dlv_slip_act_no() {
		return getConstString(offset + 9, $dlv_slip_act_no);
	}

	/**
	 *  在庫振替実績ＮＯ.<p>
	 *
	 */
	public void dlv_slip_act_no(String value) {
		setConstString(offset + 9, $dlv_slip_act_no, value);
	}


	/**
	 *  計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 10, $ac_dt);
	}

	/**
	 *  計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 10, $ac_dt, value);
	}


	/**
	 *  場所.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 11, $loc_nm);
	}

	/**
	 *  場所.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 11, $loc_nm, value);
	}


	/**
	 *  場所ＣＤ(データ).<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 12, $loc_cd);
	}

	/**
	 *  場所ＣＤ(データ).<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 12, $loc_cd, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 13, $dpt_nm);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 13, $dpt_nm, value);
	}


	/**
	 *  部門(データ).<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 14, $dpt_cd);
	}

	/**
	 *  部門(データ).<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 14, $dpt_cd, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 15, $usr_nm);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 15, $usr_nm, value);
	}


	/**
	 *  担当者(データ).<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 16, $usr_cd);
	}

	/**
	 *  担当者(データ).<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 16, $usr_cd, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 17, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 17, $trd_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 18, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 18, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 19, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 19, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 20, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 20, $sub_char3, value);
	}


	public String getString(String name) {
		if ($formtitle.equalsIgnoreCase(name)) {
			return formtitle();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($formtitle.equalsIgnoreCase(name)) {
			return formtitle();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($formtitle.equalsIgnoreCase(name)) {
			formtitle(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		if ($formtitle.equalsIgnoreCase(name)) {
			formtitle(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
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

