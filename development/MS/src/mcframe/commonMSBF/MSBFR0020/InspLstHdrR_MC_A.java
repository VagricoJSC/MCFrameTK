package mcframe.commonMSBF.MSBFR0020;

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
 * ブロック"InspLstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspLstHdrR_MC_A extends MCConstRow {

	/**
	 *  検査指図リストＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $insp_lst_no_lbl = "insp_lst_no_lbl";
	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public static final String $insp_lst_no_hdr = "insp_lst_no_hdr";
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
	 *  検査ＮＯ(ラベル).<p>
	 *
	 */
	public static final String $insp_no_lbl = "insp_no_lbl";
	/**
	 *  検査種類（ラベル).<p>
	 *
	 */
	public static final String $insp_typ_nm_lbl = "insp_typ_nm_lbl";
	/**
	 *  検査パタン名（ラベル）.<p>
	 *
	 */
	public static final String $insp_ptn_nm_lbl = "insp_ptn_nm_lbl";
	/**
	 *  検査方法(ラベル).<p>
	 *
	 */
	public static final String $insp_mtd_typ_nm_lbl = "insp_mtd_typ_nm_lbl";
	/**
	 *  承認状況(ラベル).<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm_lbl = "insp_aprv_sts_typ_nm_lbl";


	public static final MCMeta insp_lst_no_lbl_META = createStringMeta($insp_lst_no_lbl);
	public static final MCMeta insp_lst_no_hdr_META = createCommonMeta($insp_lst_no_hdr, mcframe.commonMA.meta.MA_META.INSP_LST_NO);
	public static final MCMeta form_name_META = createStringMeta($form_name);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_no_lbl_META = createStringMeta($insp_no_lbl);
	public static final MCMeta insp_typ_nm_lbl_META = createStringMeta($insp_typ_nm_lbl);
	public static final MCMeta insp_ptn_nm_lbl_META = createStringMeta($insp_ptn_nm_lbl);
	public static final MCMeta insp_mtd_typ_nm_lbl_META = createStringMeta($insp_mtd_typ_nm_lbl);
	public static final MCMeta insp_aprv_sts_typ_nm_lbl_META = createStringMeta($insp_aprv_sts_typ_nm_lbl);

	protected static final ConstMetaList<InspLstHdrR> constMetas = new ConstMetaList<InspLstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_lst_no_lbl_META,
			insp_lst_no_hdr_META,
			form_name_META,
			prnt_tm_META,
			insp_no_lbl_META,
			insp_typ_nm_lbl_META,
			insp_ptn_nm_lbl_META,
			insp_mtd_typ_nm_lbl_META,
			insp_aprv_sts_typ_nm_lbl_META
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
	protected InspLstHdrR_MC_A(ConstMetaList<? extends InspLstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspLstHdrR clone() {
		return (InspLstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspLstHdrR createInstance() {
		return (InspLstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspLstHdrR getValues(String... names) {
		return (InspLstHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  検査指図リストＮＯ（ラベル）.<p>
	 *
	 */
	public String insp_lst_no_lbl() {
		return getConstString(offset + 0, $insp_lst_no_lbl);
	}

	/**
	 *  検査指図リストＮＯ（ラベル）.<p>
	 *
	 */
	public void insp_lst_no_lbl(String value) {
		setConstString(offset + 0, $insp_lst_no_lbl, value);
	}


	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public String insp_lst_no_hdr() {
		return getConstString(offset + 1, $insp_lst_no_hdr);
	}

	/**
	 *  検査指図リストＮＯ.<p>
	 *
	 */
	public void insp_lst_no_hdr(String value) {
		setConstString(offset + 1, $insp_lst_no_hdr, value);
	}


	/**
	 *  帳票名.<p>
	 *
	 */
	public String form_name() {
		return getConstString(offset + 2, $form_name);
	}

	/**
	 *  帳票名.<p>
	 *
	 */
	public void form_name(String value) {
		setConstString(offset + 2, $form_name, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 3, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 3, $prnt_tm, value);
	}


	/**
	 *  検査ＮＯ(ラベル).<p>
	 *
	 */
	public String insp_no_lbl() {
		return getConstString(offset + 4, $insp_no_lbl);
	}

	/**
	 *  検査ＮＯ(ラベル).<p>
	 *
	 */
	public void insp_no_lbl(String value) {
		setConstString(offset + 4, $insp_no_lbl, value);
	}


	/**
	 *  検査種類（ラベル).<p>
	 *
	 */
	public String insp_typ_nm_lbl() {
		return getConstString(offset + 5, $insp_typ_nm_lbl);
	}

	/**
	 *  検査種類（ラベル).<p>
	 *
	 */
	public void insp_typ_nm_lbl(String value) {
		setConstString(offset + 5, $insp_typ_nm_lbl, value);
	}


	/**
	 *  検査パタン名（ラベル）.<p>
	 *
	 */
	public String insp_ptn_nm_lbl() {
		return getConstString(offset + 6, $insp_ptn_nm_lbl);
	}

	/**
	 *  検査パタン名（ラベル）.<p>
	 *
	 */
	public void insp_ptn_nm_lbl(String value) {
		setConstString(offset + 6, $insp_ptn_nm_lbl, value);
	}


	/**
	 *  検査方法(ラベル).<p>
	 *
	 */
	public String insp_mtd_typ_nm_lbl() {
		return getConstString(offset + 7, $insp_mtd_typ_nm_lbl);
	}

	/**
	 *  検査方法(ラベル).<p>
	 *
	 */
	public void insp_mtd_typ_nm_lbl(String value) {
		setConstString(offset + 7, $insp_mtd_typ_nm_lbl, value);
	}


	/**
	 *  承認状況(ラベル).<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm_lbl() {
		return getConstString(offset + 8, $insp_aprv_sts_typ_nm_lbl);
	}

	/**
	 *  承認状況(ラベル).<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm_lbl(String value) {
		setConstString(offset + 8, $insp_aprv_sts_typ_nm_lbl, value);
	}


	public String getString(String name) {
		if ($insp_lst_no_lbl.equalsIgnoreCase(name)) {
			return insp_lst_no_lbl();
		}
		if ($insp_lst_no_hdr.equalsIgnoreCase(name)) {
			return insp_lst_no_hdr();
		}
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			return insp_no_lbl();
		}
		if ($insp_typ_nm_lbl.equalsIgnoreCase(name)) {
			return insp_typ_nm_lbl();
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			return insp_ptn_nm_lbl();
		}
		if ($insp_mtd_typ_nm_lbl.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm_lbl();
		}
		if ($insp_aprv_sts_typ_nm_lbl.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm_lbl();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($insp_lst_no_lbl.equalsIgnoreCase(name)) {
			return insp_lst_no_lbl();
		}
		if ($insp_lst_no_hdr.equalsIgnoreCase(name)) {
			return insp_lst_no_hdr();
		}
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			return insp_no_lbl();
		}
		if ($insp_typ_nm_lbl.equalsIgnoreCase(name)) {
			return insp_typ_nm_lbl();
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			return insp_ptn_nm_lbl();
		}
		if ($insp_mtd_typ_nm_lbl.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm_lbl();
		}
		if ($insp_aprv_sts_typ_nm_lbl.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm_lbl();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_lst_no_lbl.equalsIgnoreCase(name)) {
			insp_lst_no_lbl(value);
			return;
		}
		if ($insp_lst_no_hdr.equalsIgnoreCase(name)) {
			insp_lst_no_hdr(value);
			return;
		}
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			insp_no_lbl(value);
			return;
		}
		if ($insp_typ_nm_lbl.equalsIgnoreCase(name)) {
			insp_typ_nm_lbl(value);
			return;
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			insp_ptn_nm_lbl(value);
			return;
		}
		if ($insp_mtd_typ_nm_lbl.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm_lbl(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm_lbl.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm_lbl(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_lst_no_lbl.equalsIgnoreCase(name)) {
			insp_lst_no_lbl(value);
			return;
		}
		if ($insp_lst_no_hdr.equalsIgnoreCase(name)) {
			insp_lst_no_hdr(value);
			return;
		}
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($insp_no_lbl.equalsIgnoreCase(name)) {
			insp_no_lbl(value);
			return;
		}
		if ($insp_typ_nm_lbl.equalsIgnoreCase(name)) {
			insp_typ_nm_lbl(value);
			return;
		}
		if ($insp_ptn_nm_lbl.equalsIgnoreCase(name)) {
			insp_ptn_nm_lbl(value);
			return;
		}
		if ($insp_mtd_typ_nm_lbl.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm_lbl(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm_lbl.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm_lbl(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

