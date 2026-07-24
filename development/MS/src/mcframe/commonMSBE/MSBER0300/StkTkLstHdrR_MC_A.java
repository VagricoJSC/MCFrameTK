package mcframe.commonMSBE.MSBER0300;

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
 * ブロック"StkTkLstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StkTkLstHdrR_MC_A extends MCConstRow {

	/**
	 *  棚卸年月日.<p>
	 *
	 */
	public static final String $stktk_base_dt = "stktk_base_dt";
	/**
	 *  場所ＣＤ（データ）.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 *  場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 *  部門ＣＤ（データ）.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 *  棚卸備考.<p>
	 *
	 */
	public static final String $stktk_rpt_rmrks = "stktk_rpt_rmrks";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";


	public static final MCMeta stktk_base_dt_META = createCommonMeta($stktk_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta stktk_rpt_rmrks_META = createCommonMeta($stktk_rpt_rmrks, mcframe.commonMS.meta.MS_META.STKTK_RPT_RMRKS);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);

	protected static final ConstMetaList<StkTkLstHdrR> constMetas = new ConstMetaList<StkTkLstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			stktk_base_dt_META,
			loc_cd_META,
			loc_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			stktk_rpt_rmrks_META,
			prnt_tm_META
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
	protected StkTkLstHdrR_MC_A(ConstMetaList<? extends StkTkLstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkTkLstHdrR clone() {
		return (StkTkLstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkTkLstHdrR createInstance() {
		return (StkTkLstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkTkLstHdrR getValues(String... names) {
		return (StkTkLstHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  棚卸年月日.<p>
	 *
	 */
	public MCDate stktk_base_dt() {
		return getConstDate(offset + 0, $stktk_base_dt);
	}

	/**
	 *  棚卸年月日.<p>
	 *
	 */
	public void stktk_base_dt(MCDate value) {
		setConstDate(offset + 0, $stktk_base_dt, value);
	}


	/**
	 *  場所ＣＤ（データ）.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 *  場所ＣＤ（データ）.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 *  場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 2, $loc_nm);
	}

	/**
	 *  場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 2, $loc_nm, value);
	}


	/**
	 *  部門ＣＤ（データ）.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 3, $act_dpt_cd);
	}

	/**
	 *  部門ＣＤ（データ）.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 3, $act_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 4, $act_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 4, $act_dpt_nm, value);
	}


	/**
	 *  棚卸備考.<p>
	 *
	 */
	public String stktk_rpt_rmrks() {
		return getConstString(offset + 5, $stktk_rpt_rmrks);
	}

	/**
	 *  棚卸備考.<p>
	 *
	 */
	public void stktk_rpt_rmrks(String value) {
		setConstString(offset + 5, $stktk_rpt_rmrks, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 6, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 6, $prnt_tm, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			return stktk_base_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			return stktk_base_dt();
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			stktk_base_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($stktk_base_dt.equalsIgnoreCase(name)) {
			stktk_base_dt(value);
			return;
		}
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

