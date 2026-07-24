package mcframe.clientMGBD.MGBDP0540;

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
 * ブロック"Cnd2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Cnd2R_MC_A extends MCConstRow {

	public static final String $calc_grp_cd = "calc_grp_cd";
	public static final String $wg_cd = "wg_cd";
	public static final String $term = "term";
	public static final String $itm_cd = "itm_cd";
	public static final String $itm_sub1 = "itm_sub1";
	public static final String $itm_sub2 = "itm_sub2";
	public static final String $itm_sub3 = "itm_sub3";
	public static final String $itm_calc_ctg_cd = "itm_calc_ctg_cd";
	public static final String $dtl_calc_ctg_cd = "dtl_calc_ctg_cd";
	public static final String $purc_calc_ctg_cd = "purc_calc_ctg_cd";
	public static final String $proc_calc_ctg_cd = "proc_calc_ctg_cd";
	public static final String $prov_calc_ctg_cd = "prov_calc_ctg_cd";
	public static final String $sls_calc_ctg_cd = "sls_calc_ctg_cd";
	public static final String $fix_calc_ctg_cd = "fix_calc_ctg_cd";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_calc_ctg_cd_META = createCommonMeta($itm_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta dtl_calc_ctg_cd_META = createCommonMeta($dtl_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta purc_calc_ctg_cd_META = createCommonMeta($purc_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta proc_calc_ctg_cd_META = createCommonMeta($proc_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta prov_calc_ctg_cd_META = createCommonMeta($prov_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta sls_calc_ctg_cd_META = createCommonMeta($sls_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta fix_calc_ctg_cd_META = createCommonMeta($fix_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);

	protected static final ConstMetaList<Cnd2R> constMetas = new ConstMetaList<Cnd2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			wg_cd_META,
			term_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_calc_ctg_cd_META,
			dtl_calc_ctg_cd_META,
			purc_calc_ctg_cd_META,
			proc_calc_ctg_cd_META,
			prov_calc_ctg_cd_META,
			sls_calc_ctg_cd_META,
			fix_calc_ctg_cd_META
		},
		new String[][]{
			{
			},
			{
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
	protected Cnd2R_MC_A(ConstMetaList<? extends Cnd2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R clone() {
		return (Cnd2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R createInstance() {
		return (Cnd2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R getValues(String... names) {
		return (Cnd2R) super.getValues(names);
	}



	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	public MCDate term() {
		return getConstDate(offset + 2, $term);
	}

	public void term(MCDate value) {
		setConstDate(offset + 2, $term, value);
	}


	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	public String itm_calc_ctg_cd() {
		return getConstString(offset + 7, $itm_calc_ctg_cd);
	}

	public void itm_calc_ctg_cd(String value) {
		setConstString(offset + 7, $itm_calc_ctg_cd, value);
	}


	public String dtl_calc_ctg_cd() {
		return getConstString(offset + 8, $dtl_calc_ctg_cd);
	}

	public void dtl_calc_ctg_cd(String value) {
		setConstString(offset + 8, $dtl_calc_ctg_cd, value);
	}


	public String purc_calc_ctg_cd() {
		return getConstString(offset + 9, $purc_calc_ctg_cd);
	}

	public void purc_calc_ctg_cd(String value) {
		setConstString(offset + 9, $purc_calc_ctg_cd, value);
	}


	public String proc_calc_ctg_cd() {
		return getConstString(offset + 10, $proc_calc_ctg_cd);
	}

	public void proc_calc_ctg_cd(String value) {
		setConstString(offset + 10, $proc_calc_ctg_cd, value);
	}


	public String prov_calc_ctg_cd() {
		return getConstString(offset + 11, $prov_calc_ctg_cd);
	}

	public void prov_calc_ctg_cd(String value) {
		setConstString(offset + 11, $prov_calc_ctg_cd, value);
	}


	public String sls_calc_ctg_cd() {
		return getConstString(offset + 12, $sls_calc_ctg_cd);
	}

	public void sls_calc_ctg_cd(String value) {
		setConstString(offset + 12, $sls_calc_ctg_cd, value);
	}


	public String fix_calc_ctg_cd() {
		return getConstString(offset + 13, $fix_calc_ctg_cd);
	}

	public void fix_calc_ctg_cd(String value) {
		setConstString(offset + 13, $fix_calc_ctg_cd, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			return itm_calc_ctg_cd();
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_cd();
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return purc_calc_ctg_cd();
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return proc_calc_ctg_cd();
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			return prov_calc_ctg_cd();
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			return sls_calc_ctg_cd();
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			return fix_calc_ctg_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			return itm_calc_ctg_cd();
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_cd();
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return purc_calc_ctg_cd();
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return proc_calc_ctg_cd();
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			return prov_calc_ctg_cd();
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			return sls_calc_ctg_cd();
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			return fix_calc_ctg_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			itm_calc_ctg_cd(value);
			return;
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			dtl_calc_ctg_cd(value);
			return;
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			purc_calc_ctg_cd(value);
			return;
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			proc_calc_ctg_cd(value);
			return;
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			prov_calc_ctg_cd(value);
			return;
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			sls_calc_ctg_cd(value);
			return;
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			fix_calc_ctg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			itm_calc_ctg_cd(value);
			return;
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			dtl_calc_ctg_cd(value);
			return;
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			purc_calc_ctg_cd(value);
			return;
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			proc_calc_ctg_cd(value);
			return;
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			prov_calc_ctg_cd(value);
			return;
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			sls_calc_ctg_cd(value);
			return;
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			fix_calc_ctg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

