package mcframe.commonMSBF.MSBFR0030;

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
 * ブロック"InspRsltHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspRsltHdrR_MC_A extends MCConstRow {

	/**
	 *  検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 *  検査ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $insp_no_lbl = "insp_no_lbl";
	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 *  帳票名.<p>
	 *
	 */
	public static final String $form_name = "form_name";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	/**
	 *  検査パタン名(ラベル）.<p>
	 *
	 */
	public static final String $insp_ptn_nm_lbl = "insp_ptn_nm_lbl";
	/**
	 *  検査パタン.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 *  検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 *  期限管理種別.<p>
	 *
	 */
	public static final String $lmt_ctl_categ_nm = "lmt_ctl_categ_nm";
	/**
	 *  有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 *  使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 *  判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 *  判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 *  判定結果.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ_nm = "insp_judg_rslt_typ_nm";
	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 *  判定者名.<p>
	 *
	 */
	public static final String $judg_usr_nm = "judg_usr_nm";
	/**
	 *  判定者部門ＣＤ.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 *  判定者部門.<p>
	 *
	 */
	public static final String $judg_dpt_nm = "judg_dpt_nm";
	/**
	 *  理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 *  検査項目名(ラベル）.<p>
	 *
	 */
	public static final String $insp_point_nm_lbl = "insp_point_nm_lbl";
	/**
	 *  定性検査値(ラベル）.<p>
	 *
	 */
	public static final String $ql_insp_val_lbl = "ql_insp_val_lbl";
	/**
	 *  定量検査値(ラベル）.<p>
	 *
	 */
	public static final String $qn_insp_val_lbl = "qn_insp_val_lbl";
	/**
	 *  検査終了日時(ラベル）.<p>
	 *
	 */
	public static final String $insp_end_tm_lbl = "insp_end_tm_lbl";
	/**
	 *  検査者名(ラベル）.<p>
	 *
	 */
	public static final String $insp_usr_nm_lbl = "insp_usr_nm_lbl";
	/**
	 *  出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 *  出荷元工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";


	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_no_lbl_META = createStringMeta($insp_no_lbl);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta form_name_META = createStringMeta($form_name);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta insp_ptn_nm_lbl_META = createStringMeta($insp_ptn_nm_lbl);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta lmt_ctl_categ_nm_META = createStringMeta($lmt_ctl_categ_nm);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta insp_judg_rslt_typ_nm_META = createStringMeta($insp_judg_rslt_typ_nm);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_usr_nm_META = createCommonMeta($judg_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_dpt_nm_META = createCommonMeta($judg_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSN);
	public static final MCMeta insp_point_nm_lbl_META = createStringMeta($insp_point_nm_lbl);
	public static final MCMeta ql_insp_val_lbl_META = createStringMeta($ql_insp_val_lbl);
	public static final MCMeta qn_insp_val_lbl_META = createStringMeta($qn_insp_val_lbl);
	public static final MCMeta insp_end_tm_lbl_META = createStringMeta($insp_end_tm_lbl);
	public static final MCMeta insp_usr_nm_lbl_META = createStringMeta($insp_usr_nm_lbl);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);

	protected static final ConstMetaList<InspRsltHdrR> constMetas = new ConstMetaList<InspRsltHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_typ_META,
			insp_no_lbl_META,
			insp_no_META,
			form_name_META,
			prnt_tm_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			ntfy_nm_META,
			lot_no_view_META,
			sublot_no_view_META,
			lot_no_data_META,
			sublot_no_data_META,
			ver_no_lbl_META,
			ver_no_META,
			insp_std_no_META,
			insp_ptn_nm_lbl_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			lmt_ctl_categ_nm_META,
			vld_dt_META,
			lmt_dt_META,
			judg_dt_META,
			insp_judg_rslt_typ_META,
			insp_judg_rslt_typ_nm_META,
			judg_usr_cd_META,
			judg_usr_nm_META,
			judg_dpt_cd_META,
			judg_dpt_nm_META,
			judg_rsn_META,
			insp_point_nm_lbl_META,
			ql_insp_val_lbl_META,
			qn_insp_val_lbl_META,
			insp_end_tm_lbl_META,
			insp_usr_nm_lbl_META,
			site_cd_META,
			site_nm_META
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
	protected InspRsltHdrR_MC_A(ConstMetaList<? extends InspRsltHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRsltHdrR clone() {
		return (InspRsltHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRsltHdrR createInstance() {
		return (InspRsltHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspRsltHdrR getValues(String... names) {
		return (InspRsltHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 0, $insp_typ);
	}

	/**
	 *  検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 0, $insp_typ, value);
	}


	/**
	 *  検査ＮＯ（ラベル）.<p>
	 *
	 */
	public String insp_no_lbl() {
		return getConstString(offset + 1, $insp_no_lbl);
	}

	/**
	 *  検査ＮＯ（ラベル）.<p>
	 *
	 */
	public void insp_no_lbl(String value) {
		setConstString(offset + 1, $insp_no_lbl, value);
	}


	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 2, $insp_no);
	}

	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 2, $insp_no, value);
	}


	/**
	 *  帳票名.<p>
	 *
	 */
	public String form_name() {
		return getConstString(offset + 3, $form_name);
	}

	/**
	 *  帳票名.<p>
	 *
	 */
	public void form_name(String value) {
		setConstString(offset + 3, $form_name, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 4, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 4, $prnt_tm, value);
	}


	/**
	 *  品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 *  品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 6, $itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 6, $itm_sub1_view, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 7, $itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 7, $itm_sub2_view, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 8, $itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 8, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 9, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ用）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 9, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 10, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ用）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 10, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 11, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ用）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 11, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 12, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 12, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 13, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 13, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 14, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 14, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 15, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 15, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 16, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 16, $itm_alt_nm4, value);
	}


	/**
	 *  届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 17, $ntfy_nm);
	}

	/**
	 *  届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 17, $ntfy_nm, value);
	}


	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 18, $lot_no_view);
	}

	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 18, $lot_no_view, value);
	}


	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 19, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 19, $sublot_no_view, value);
	}


	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 20, $lot_no_data);
	}

	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 20, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 21, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ(データ用).<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 21, $sublot_no_data, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 22, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 22, $ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 23, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 23, $ver_no, value);
	}


	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 24, $insp_std_no);
	}

	/**
	 *  規格書ＮＯ.<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 24, $insp_std_no, value);
	}


	/**
	 *  検査パタン名(ラベル）.<p>
	 *
	 */
	public String insp_ptn_nm_lbl() {
		return getConstString(offset + 25, $insp_ptn_nm_lbl);
	}

	/**
	 *  検査パタン名(ラベル）.<p>
	 *
	 */
	public void insp_ptn_nm_lbl(String value) {
		setConstString(offset + 25, $insp_ptn_nm_lbl, value);
	}


	/**
	 *  検査パタン.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 26, $insp_ptn_cd);
	}

	/**
	 *  検査パタン.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 26, $insp_ptn_cd, value);
	}


	/**
	 *  検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 27, $insp_ptn_nm);
	}

	/**
	 *  検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 27, $insp_ptn_nm, value);
	}


	/**
	 *  期限管理種別.<p>
	 *
	 */
	public String lmt_ctl_categ_nm() {
		return getConstString(offset + 28, $lmt_ctl_categ_nm);
	}

	/**
	 *  期限管理種別.<p>
	 *
	 */
	public void lmt_ctl_categ_nm(String value) {
		setConstString(offset + 28, $lmt_ctl_categ_nm, value);
	}


	/**
	 *  有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 29, $vld_dt);
	}

	/**
	 *  有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 29, $vld_dt, value);
	}


	/**
	 *  使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 30, $lmt_dt);
	}

	/**
	 *  使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 30, $lmt_dt, value);
	}


	/**
	 *  判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 31, $judg_dt);
	}

	/**
	 *  判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 31, $judg_dt, value);
	}


	/**
	 *  判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 32, $insp_judg_rslt_typ);
	}

	/**
	 *  判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 32, $insp_judg_rslt_typ, value);
	}


	/**
	 *  判定結果.<p>
	 *
	 */
	public String insp_judg_rslt_typ_nm() {
		return getConstString(offset + 33, $insp_judg_rslt_typ_nm);
	}

	/**
	 *  判定結果.<p>
	 *
	 */
	public void insp_judg_rslt_typ_nm(String value) {
		setConstString(offset + 33, $insp_judg_rslt_typ_nm, value);
	}


	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 34, $judg_usr_cd);
	}

	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 34, $judg_usr_cd, value);
	}


	/**
	 *  判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return getConstString(offset + 35, $judg_usr_nm);
	}

	/**
	 *  判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		setConstString(offset + 35, $judg_usr_nm, value);
	}


	/**
	 *  判定者部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 36, $judg_dpt_cd);
	}

	/**
	 *  判定者部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 36, $judg_dpt_cd, value);
	}


	/**
	 *  判定者部門.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return getConstString(offset + 37, $judg_dpt_nm);
	}

	/**
	 *  判定者部門.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		setConstString(offset + 37, $judg_dpt_nm, value);
	}


	/**
	 *  理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 38, $judg_rsn);
	}

	/**
	 *  理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 38, $judg_rsn, value);
	}


	/**
	 *  検査項目名(ラベル）.<p>
	 *
	 */
	public String insp_point_nm_lbl() {
		return getConstString(offset + 39, $insp_point_nm_lbl);
	}

	/**
	 *  検査項目名(ラベル）.<p>
	 *
	 */
	public void insp_point_nm_lbl(String value) {
		setConstString(offset + 39, $insp_point_nm_lbl, value);
	}


	/**
	 *  定性検査値(ラベル）.<p>
	 *
	 */
	public String ql_insp_val_lbl() {
		return getConstString(offset + 40, $ql_insp_val_lbl);
	}

	/**
	 *  定性検査値(ラベル）.<p>
	 *
	 */
	public void ql_insp_val_lbl(String value) {
		setConstString(offset + 40, $ql_insp_val_lbl, value);
	}


	/**
	 *  定量検査値(ラベル）.<p>
	 *
	 */
	public String qn_insp_val_lbl() {
		return getConstString(offset + 41, $qn_insp_val_lbl);
	}

	/**
	 *  定量検査値(ラベル）.<p>
	 *
	 */
	public void qn_insp_val_lbl(String value) {
		setConstString(offset + 41, $qn_insp_val_lbl, value);
	}


	/**
	 *  検査終了日時(ラベル）.<p>
	 *
	 */
	public String insp_end_tm_lbl() {
		return getConstString(offset + 42, $insp_end_tm_lbl);
	}

	/**
	 *  検査終了日時(ラベル）.<p>
	 *
	 */
	public void insp_end_tm_lbl(String value) {
		setConstString(offset + 42, $insp_end_tm_lbl, value);
	}


	/**
	 *  検査者名(ラベル）.<p>
	 *
	 */
	public String insp_usr_nm_lbl() {
		return getConstString(offset + 43, $insp_usr_nm_lbl);
	}

	/**
	 *  検査者名(ラベル）.<p>
	 *
	 */
	public void insp_usr_nm_lbl(String value) {
		setConstString(offset + 43, $insp_usr_nm_lbl, value);
	}


	/**
	 *  出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 44, $site_cd);
	}

	/**
	 *  出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 44, $site_cd, value);
	}


	/**
	 *  出荷元工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 45, $site_nm);
	}

	/**
	 *  出荷元工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 45, $site_nm, value);
	}


	public String getString(String name) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			return insp_no_lbl();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			return insp_ptn_nm_lbl();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($lmt_ctl_categ_nm.equalsIgnoreCase(name)) {
			return lmt_ctl_categ_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($insp_point_nm_lbl.equalsIgnoreCase(name)) {
			return insp_point_nm_lbl();
		}
		if ($ql_insp_val_lbl.equalsIgnoreCase(name)) {
			return ql_insp_val_lbl();
		}
		if ($qn_insp_val_lbl.equalsIgnoreCase(name)) {
			return qn_insp_val_lbl();
		}
		if ($insp_end_tm_lbl.equalsIgnoreCase(name)) {
			return insp_end_tm_lbl();
		}
		if ($insp_usr_nm_lbl.equalsIgnoreCase(name)) {
			return insp_usr_nm_lbl();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			return insp_no_lbl();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			return insp_ptn_nm_lbl();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($lmt_ctl_categ_nm.equalsIgnoreCase(name)) {
			return lmt_ctl_categ_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($insp_point_nm_lbl.equalsIgnoreCase(name)) {
			return insp_point_nm_lbl();
		}
		if ($ql_insp_val_lbl.equalsIgnoreCase(name)) {
			return ql_insp_val_lbl();
		}
		if ($qn_insp_val_lbl.equalsIgnoreCase(name)) {
			return qn_insp_val_lbl();
		}
		if ($insp_end_tm_lbl.equalsIgnoreCase(name)) {
			return insp_end_tm_lbl();
		}
		if ($insp_usr_nm_lbl.equalsIgnoreCase(name)) {
			return insp_usr_nm_lbl();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			insp_no_lbl(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			insp_ptn_nm_lbl(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($lmt_ctl_categ_nm.equalsIgnoreCase(name)) {
			lmt_ctl_categ_nm(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($insp_point_nm_lbl.equalsIgnoreCase(name)) {
			insp_point_nm_lbl(value);
			return;
		}
		if ($ql_insp_val_lbl.equalsIgnoreCase(name)) {
			ql_insp_val_lbl(value);
			return;
		}
		if ($qn_insp_val_lbl.equalsIgnoreCase(name)) {
			qn_insp_val_lbl(value);
			return;
		}
		if ($insp_end_tm_lbl.equalsIgnoreCase(name)) {
			insp_end_tm_lbl(value);
			return;
		}
		if ($insp_usr_nm_lbl.equalsIgnoreCase(name)) {
			insp_usr_nm_lbl(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			insp_no_lbl(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			insp_ptn_nm_lbl(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($lmt_ctl_categ_nm.equalsIgnoreCase(name)) {
			lmt_ctl_categ_nm(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($insp_point_nm_lbl.equalsIgnoreCase(name)) {
			insp_point_nm_lbl(value);
			return;
		}
		if ($ql_insp_val_lbl.equalsIgnoreCase(name)) {
			ql_insp_val_lbl(value);
			return;
		}
		if ($qn_insp_val_lbl.equalsIgnoreCase(name)) {
			qn_insp_val_lbl(value);
			return;
		}
		if ($insp_end_tm_lbl.equalsIgnoreCase(name)) {
			insp_end_tm_lbl(value);
			return;
		}
		if ($insp_usr_nm_lbl.equalsIgnoreCase(name)) {
			insp_usr_nm_lbl(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

