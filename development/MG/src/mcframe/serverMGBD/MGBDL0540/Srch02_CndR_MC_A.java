package mcframe.serverMGBD.MGBDL0540;

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
 * ブロック"Srch02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_CndR_MC_A extends MCConstRow {

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $itm_calc_ctg_cd = "itm_calc_ctg_cd";
	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $dtl_calc_ctg_cd = "dtl_calc_ctg_cd";
	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $purc_calc_ctg_cd = "purc_calc_ctg_cd";
	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $proc_calc_ctg_cd = "proc_calc_ctg_cd";
	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $prov_calc_ctg_cd = "prov_calc_ctg_cd";
	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $sls_calc_ctg_cd = "sls_calc_ctg_cd";
	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
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

	protected static final ConstMetaList<Srch02_CndR> constMetas = new ConstMetaList<Srch02_CndR>(
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

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch02_CndR_MC_A(ConstMetaList<? extends Srch02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR clone() {
		return (Srch02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR createInstance() {
		return (Srch02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR getValues(String... names) {
		return (Srch02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 2, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 2, $term, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public String itm_calc_ctg_cd() {
		return getConstString(offset + 7, $itm_calc_ctg_cd);
	}

	/**
	 * Item calculation category cd. 品目計算カテゴリＣＤ.<p>
	 *
	 */
	public void itm_calc_ctg_cd(String value) {
		setConstString(offset + 7, $itm_calc_ctg_cd, value);
	}


	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public String dtl_calc_ctg_cd() {
		return getConstString(offset + 8, $dtl_calc_ctg_cd);
	}

	/**
	 * Details calculation category cd. 詳細計算カテゴリＣＤ.<p>
	 *
	 */
	public void dtl_calc_ctg_cd(String value) {
		setConstString(offset + 8, $dtl_calc_ctg_cd, value);
	}


	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public String purc_calc_ctg_cd() {
		return getConstString(offset + 9, $purc_calc_ctg_cd);
	}

	/**
	 * Purchase calculation category cd. 購買計算カテゴリＣＤ.<p>
	 *
	 */
	public void purc_calc_ctg_cd(String value) {
		setConstString(offset + 9, $purc_calc_ctg_cd, value);
	}


	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public String proc_calc_ctg_cd() {
		return getConstString(offset + 10, $proc_calc_ctg_cd);
	}

	/**
	 * Subcontracting calculation category cd. 加工計算カテゴリＣＤ.<p>
	 *
	 */
	public void proc_calc_ctg_cd(String value) {
		setConstString(offset + 10, $proc_calc_ctg_cd, value);
	}


	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public String prov_calc_ctg_cd() {
		return getConstString(offset + 11, $prov_calc_ctg_cd);
	}

	/**
	 * Supply calculation category cd. 支給計算カテゴリＣＤ.<p>
	 *
	 */
	public void prov_calc_ctg_cd(String value) {
		setConstString(offset + 11, $prov_calc_ctg_cd, value);
	}


	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public String sls_calc_ctg_cd() {
		return getConstString(offset + 12, $sls_calc_ctg_cd);
	}

	/**
	 * Sales calculation category cd. 販売計算カテゴリＣＤ.<p>
	 *
	 */
	public void sls_calc_ctg_cd(String value) {
		setConstString(offset + 12, $sls_calc_ctg_cd, value);
	}


	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
	public String fix_calc_ctg_cd() {
		return getConstString(offset + 13, $fix_calc_ctg_cd);
	}

	/**
	 * Limit unit price calculation category cd. 指値計算カテゴリＣＤ.<p>
	 *
	 */
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

