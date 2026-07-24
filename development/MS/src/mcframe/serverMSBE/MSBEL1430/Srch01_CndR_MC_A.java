package mcframe.serverMSBE.MSBEL1430;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Unallocated (Allocation status) 未引当（引当状況）.<p>
	 *
	 */
	public static final String $not_alloc_flg = "not_alloc_flg";
	/**
	 * Partial allocation (Allocation status) 一部引当（引当状況）.<p>
	 *
	 */
	public static final String $part_alloc_flg = "part_alloc_flg";
	/**
	 * 100% allocation (Allocation status) 全数引当（引当状況）.<p>
	 *
	 */
	public static final String $all_alloc_flg = "all_alloc_flg";
	/**
	 * Exclude (Allocation status) 対象外（引当状況）.<p>
	 *
	 */
	public static final String $alloc_invalid_flg = "alloc_invalid_flg";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public static final String $ship_wk_grp_cd = "ship_wk_grp_cd";
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public static final String $ship_wk_grp_nm = "ship_wk_grp_nm";
	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_schd_dt_fr = "ship_schd_dt_fr";
	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ship_schd_hm_fr = "ship_schd_hm_fr";
	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public static final String $ship_schd_dt_to = "ship_schd_dt_to";
	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public static final String $ship_schd_hm_to = "ship_schd_hm_to";
	/**
	 * Shipping available only 出荷可能のみ.<p>
	 *
	 */
	public static final String $ship_abl_only_flg = "ship_abl_only_flg";


	public static final MCMeta not_alloc_flg_META = createCommonMeta($not_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_alloc_flg_META = createCommonMeta($part_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_alloc_flg_META = createCommonMeta($all_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_invalid_flg_META = createCommonMeta($alloc_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_wk_grp_cd_META = createCommonMeta($ship_wk_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_CD);
	public static final MCMeta ship_wk_grp_nm_META = createCommonMeta($ship_wk_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_NM);
	public static final MCMeta ship_schd_dt_fr_META = createCommonMeta($ship_schd_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_fr_META = createCommonMeta($ship_schd_hm_fr, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_schd_dt_to_META = createCommonMeta($ship_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_to_META = createCommonMeta($ship_schd_hm_to, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta ship_abl_only_flg_META = createCommonMeta($ship_abl_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			not_alloc_flg_META,
			part_alloc_flg_META,
			all_alloc_flg_META,
			alloc_invalid_flg_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			ship_wk_grp_cd_META,
			ship_wk_grp_nm_META,
			ship_schd_dt_fr_META,
			ship_schd_hm_fr_META,
			ship_schd_dt_to_META,
			ship_schd_hm_to_META,
			ship_abl_only_flg_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Unallocated (Allocation status) 未引当（引当状況）.<p>
	 *
	 */
	public boolean not_alloc_flg() {
		return getConstBoolean(offset + 0, $not_alloc_flg);
	}

	/**
	 * Unallocated (Allocation status) 未引当（引当状況）.<p>
	 *
	 */
	public void not_alloc_flg(boolean value) {
		setConstBoolean(offset + 0, $not_alloc_flg, value);
	}


	/**
	 * Partial allocation (Allocation status) 一部引当（引当状況）.<p>
	 *
	 */
	public boolean part_alloc_flg() {
		return getConstBoolean(offset + 1, $part_alloc_flg);
	}

	/**
	 * Partial allocation (Allocation status) 一部引当（引当状況）.<p>
	 *
	 */
	public void part_alloc_flg(boolean value) {
		setConstBoolean(offset + 1, $part_alloc_flg, value);
	}


	/**
	 * 100% allocation (Allocation status) 全数引当（引当状況）.<p>
	 *
	 */
	public boolean all_alloc_flg() {
		return getConstBoolean(offset + 2, $all_alloc_flg);
	}

	/**
	 * 100% allocation (Allocation status) 全数引当（引当状況）.<p>
	 *
	 */
	public void all_alloc_flg(boolean value) {
		setConstBoolean(offset + 2, $all_alloc_flg, value);
	}


	/**
	 * Exclude (Allocation status) 対象外（引当状況）.<p>
	 *
	 */
	public boolean alloc_invalid_flg() {
		return getConstBoolean(offset + 3, $alloc_invalid_flg);
	}

	/**
	 * Exclude (Allocation status) 対象外（引当状況）.<p>
	 *
	 */
	public void alloc_invalid_flg(boolean value) {
		setConstBoolean(offset + 3, $alloc_invalid_flg, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 4, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 4, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 5, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 5, $lg_grp_nm, value);
	}


	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public String ship_wk_grp_cd() {
		return getConstString(offset + 6, $ship_wk_grp_cd);
	}

	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public void ship_wk_grp_cd(String value) {
		setConstString(offset + 6, $ship_wk_grp_cd, value);
	}


	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public String ship_wk_grp_nm() {
		return getConstString(offset + 7, $ship_wk_grp_nm);
	}

	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public void ship_wk_grp_nm(String value) {
		setConstString(offset + 7, $ship_wk_grp_nm, value);
	}


	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_dt_fr() {
		return getConstDate(offset + 8, $ship_schd_dt_fr);
	}

	/**
	 * Scheduled shipping date FROM 出荷予定日ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_dt_fr(MCDate value) {
		setConstDate(offset + 8, $ship_schd_dt_fr, value);
	}


	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ship_schd_hm_fr() {
		return getConstDate(offset + 9, $ship_schd_hm_fr);
	}

	/**
	 * Shipping schedule time FROM 出荷予定時刻ＦＲＯＭ.<p>
	 *
	 */
	public void ship_schd_hm_fr(MCDate value) {
		setConstDate(offset + 9, $ship_schd_hm_fr, value);
	}


	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_dt_to() {
		return getConstDate(offset + 10, $ship_schd_dt_to);
	}

	/**
	 * Scheduled shipping date TO 出荷予定日ＴＯ.<p>
	 *
	 */
	public void ship_schd_dt_to(MCDate value) {
		setConstDate(offset + 10, $ship_schd_dt_to, value);
	}


	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public MCDate ship_schd_hm_to() {
		return getConstDate(offset + 11, $ship_schd_hm_to);
	}

	/**
	 * Shipping schedule time TO 出荷予定時刻ＴＯ.<p>
	 *
	 */
	public void ship_schd_hm_to(MCDate value) {
		setConstDate(offset + 11, $ship_schd_hm_to, value);
	}


	/**
	 * Shipping available only 出荷可能のみ.<p>
	 *
	 */
	public boolean ship_abl_only_flg() {
		return getConstBoolean(offset + 12, $ship_abl_only_flg);
	}

	/**
	 * Shipping available only 出荷可能のみ.<p>
	 *
	 */
	public void ship_abl_only_flg(boolean value) {
		setConstBoolean(offset + 12, $ship_abl_only_flg, value);
	}


	public String getString(String name) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			return ship_schd_dt_fr();
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			return ship_schd_hm_fr();
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			return ship_schd_dt_to();
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			return ship_schd_hm_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			return part_alloc_flg();
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			return all_alloc_flg();
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			return alloc_invalid_flg();
		}
		if ($ship_abl_only_flg.equalsIgnoreCase(name)) {
			return ship_abl_only_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			return ship_schd_dt_fr();
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			return ship_schd_hm_fr();
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			return ship_schd_dt_to();
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			return ship_schd_hm_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			return not_alloc_flg();
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			return part_alloc_flg();
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			return all_alloc_flg();
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			return alloc_invalid_flg();
		}
		if ($ship_abl_only_flg.equalsIgnoreCase(name)) {
			return ship_abl_only_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			ship_schd_dt_fr(value);
			return;
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			ship_schd_hm_fr(value);
			return;
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			ship_schd_dt_to(value);
			return;
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			ship_schd_hm_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			part_alloc_flg(value);
			return;
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			all_alloc_flg(value);
			return;
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			alloc_invalid_flg(value);
			return;
		}
		if ($ship_abl_only_flg.equalsIgnoreCase(name)) {
			ship_abl_only_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ship_schd_dt_fr.equalsIgnoreCase(name)) {
			ship_schd_dt_fr(value);
			return;
		}
		if ($ship_schd_hm_fr.equalsIgnoreCase(name)) {
			ship_schd_hm_fr(value);
			return;
		}
		if ($ship_schd_dt_to.equalsIgnoreCase(name)) {
			ship_schd_dt_to(value);
			return;
		}
		if ($ship_schd_hm_to.equalsIgnoreCase(name)) {
			ship_schd_hm_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_alloc_flg.equalsIgnoreCase(name)) {
			not_alloc_flg(value);
			return;
		}
		if ($part_alloc_flg.equalsIgnoreCase(name)) {
			part_alloc_flg(value);
			return;
		}
		if ($all_alloc_flg.equalsIgnoreCase(name)) {
			all_alloc_flg(value);
			return;
		}
		if ($alloc_invalid_flg.equalsIgnoreCase(name)) {
			alloc_invalid_flg(value);
			return;
		}
		if ($ship_abl_only_flg.equalsIgnoreCase(name)) {
			ship_abl_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

