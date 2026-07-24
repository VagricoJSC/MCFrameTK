package mcframe.clientMGBF.MGBFP0400;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public static final String $max_mons = "max_mons";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public static final String $rpt_ptn_cd = "rpt_ptn_cd";
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public static final String $rpt_ptn_nm = "rpt_ptn_nm";
	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public static final String $rpt_key_cd = "rpt_key_cd";
	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public static final String $rpt_key_nm = "rpt_key_nm";
	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public static final String $rpt_key_typ = "rpt_key_typ";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public static final String $itm_grp_cd = "itm_grp_cd";
	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public static final String $itm_grp_nm = "itm_grp_nm";
	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public static final String $itm_grp_typ = "itm_grp_typ";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta max_mons_META = createCommonMeta($max_mons, mcframe.commonMA.meta.MA_META.MAX_MONS);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rpt_ptn_cd_META = createCommonMeta($rpt_ptn_cd, mcframe.commonMA.meta.MA_META.RPT_PTN_CD);
	public static final MCMeta rpt_ptn_nm_META = createCommonMeta($rpt_ptn_nm, mcframe.commonMA.meta.MA_META.RPT_PTN_NM);
	public static final MCMeta rpt_key_cd_META = createCommonMeta($rpt_key_cd, mcframe.commonMA.meta.MA_META.RPT_KEY_CD);
	public static final MCMeta rpt_key_nm_META = createCommonMeta($rpt_key_nm, mcframe.commonMA.meta.MA_META.RPT_KEY_NM);
	public static final MCMeta rpt_key_typ_META = createCommonMeta($rpt_key_typ, mcframe.commonMA.meta.MA_META.RPT_KEY_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm_META = createCommonMeta($itm_grp_nm, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_typ_META = createCommonMeta($itm_grp_typ, mcframe.commonMA.meta.MA_META.ITM_GRP_TYP);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			max_mons_META,
			ym_fr_META,
			ym_to_META,
			rpt_ptn_cd_META,
			rpt_ptn_nm_META,
			rpt_key_cd_META,
			rpt_key_nm_META,
			rpt_key_typ_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			itm_grp_cd_META,
			itm_grp_nm_META,
			itm_grp_typ_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$mng_dpt_cd, "dpt_nm"}	// mng_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$rpt_ptn_cd, "calc_grp_cd"},	// rpt_ptn_cd
				{$rpt_key_cd, "calc_grp_cd;rpt_ptn_cd"},	// rpt_key_cd
				{$wg_cd, "true"},	// wg_cd
				{$mng_dpt_cd, "ym_fr;rpt_key_cd"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.RPT_KEY;rpt_key_cd;rpt_key_nm"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.RPT_KEY;itm_cd;rpt_key_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.RPT_KEY;itm_cd;itm_sub1;rpt_key_cd"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.RPT_KEY;itm_cd;itm_sub1;itm_sub2;rpt_key_cd"},	// itm_p.itm_sub3
				{$itm_jnl_cd, "rpt_key_cd"},	// itm_jnl_cd
				{$itm_grp_cd, "rpt_key_cd"}	// itm_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$rpt_ptn_cd, "calc_grp_cd"},	// rpt_ptn_cd
				{$rpt_key_cd, "calc_grp_cd;rpt_ptn_cd"},	// rpt_key_cd
				{$wg_cd, "rd_flg"},	// wg_cd
				{$mng_dpt_cd, "ym;rpt_key_cd"},	// mng_dpt_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;rpt_key_cd;rpt_key_nm"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;rpt_key_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;rpt_key_cd"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;rpt_key_cd"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}


	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public MCNumber max_mons() {
		return getConstNumber(offset + 2, $max_mons);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(MCNumber value) {
		setConstNumber(offset + 2, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(int value) {
		setConstNumber(offset + 2, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(long value) {
		setConstNumber(offset + 2, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(float value) {
		setConstNumber(offset + 2, $max_mons, value);
	}

	/**
	 * Max. calculation months 最大計算月数.<p>
	 *
	 */
	public void max_mons(double value) {
		setConstNumber(offset + 2, $max_mons, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 3, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 3, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 4, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 4, $ym_to, value);
	}


	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public String rpt_ptn_cd() {
		return getConstString(offset + 5, $rpt_ptn_cd);
	}

	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public void rpt_ptn_cd(String value) {
		setConstString(offset + 5, $rpt_ptn_cd, value);
	}


	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public String rpt_ptn_nm() {
		return getConstString(offset + 6, $rpt_ptn_nm);
	}

	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public void rpt_ptn_nm(String value) {
		setConstString(offset + 6, $rpt_ptn_nm, value);
	}


	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public String rpt_key_cd() {
		return getConstString(offset + 7, $rpt_key_cd);
	}

	/**
	 * Report key cd. レポートキーＣＤ.<p>
	 *
	 */
	public void rpt_key_cd(String value) {
		setConstString(offset + 7, $rpt_key_cd, value);
	}


	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public String rpt_key_nm() {
		return getConstString(offset + 8, $rpt_key_nm);
	}

	/**
	 * Report key name レポートキー名.<p>
	 *
	 */
	public void rpt_key_nm(String value) {
		setConstString(offset + 8, $rpt_key_nm, value);
	}


	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public String rpt_key_typ() {
		return getConstString(offset + 9, $rpt_key_typ);
	}

	/**
	 * Report key type レポートキー区分.<p>
	 *
	 */
	public void rpt_key_typ(String value) {
		setConstString(offset + 9, $rpt_key_typ, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 11, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 11, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 12, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 12, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 13, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 13, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 14, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 14, $itm_p, row);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 15, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 15, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 16, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 16, $itm_jnl_nm, value);
	}


	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public String itm_grp_cd() {
		return getConstString(offset + 17, $itm_grp_cd);
	}

	/**
	 * Item classification cd. 品目分類ＣＤ.<p>
	 *
	 */
	public void itm_grp_cd(String value) {
		setConstString(offset + 17, $itm_grp_cd, value);
	}


	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public String itm_grp_nm() {
		return getConstString(offset + 18, $itm_grp_nm);
	}

	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public void itm_grp_nm(String value) {
		setConstString(offset + 18, $itm_grp_nm, value);
	}


	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public String itm_grp_typ() {
		return getConstString(offset + 19, $itm_grp_typ);
	}

	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public void itm_grp_typ(String value) {
		setConstString(offset + 19, $itm_grp_typ, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			return rpt_key_cd();
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			return rpt_key_nm();
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			return rpt_key_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			return rpt_ptn_cd();
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			return rpt_ptn_nm();
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			return rpt_key_cd();
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			return rpt_key_nm();
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			return rpt_key_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			rpt_key_cd(value);
			return;
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			rpt_key_nm(value);
			return;
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			rpt_key_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($rpt_ptn_cd.equalsIgnoreCase(name)) {
			rpt_ptn_cd(value);
			return;
		}
		if ($rpt_ptn_nm.equalsIgnoreCase(name)) {
			rpt_ptn_nm(value);
			return;
		}
		if ($rpt_key_cd.equalsIgnoreCase(name)) {
			rpt_key_cd(value);
			return;
		}
		if ($rpt_key_nm.equalsIgnoreCase(name)) {
			rpt_key_nm(value);
			return;
		}
		if ($rpt_key_typ.equalsIgnoreCase(name)) {
			rpt_key_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

