package mcframe.serverMSBC.MSBCL0320;

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
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $opn_flg = "opn_flg";
	/**
	 * Save 保存.<p>
	 *
	 */
	public static final String $sav_flg = "sav_flg";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $inst_flg = "inst_flg";
	/**
	 * Completed 完了.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public static final String $prcd_flg = "prcd_flg";
	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public static final String $sim_flg = "sim_flg";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
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
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Only base value exceeded 基準値超過のみ.<p>
	 *
	 */
	public static final String $base_qty_over_flg = "base_qty_over_flg";
	/**
	 * Alert threshold exceeded only アラート閾値超過のみ.<p>
	 *
	 */
	public static final String $alert_qty_over_flg = "alert_qty_over_flg";
	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public static final String $period_typ_view = "period_typ_view";
	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public static final String $period_typ = "period_typ";
	/**
	 * Load breakdown calculation type 負荷内訳計算区分.<p>
	 *
	 */
	public static final String $ld_sub_calc_typ = "ld_sub_calc_typ";


	public static final MCMeta opn_flg_META = createCommonMeta($opn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sav_flg_META = createCommonMeta($sav_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_flg_META = createCommonMeta($inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prcd_flg_META = createCommonMeta($prcd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_flg_META = createCommonMeta($sim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta base_qty_over_flg_META = createCommonMeta($base_qty_over_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alert_qty_over_flg_META = createCommonMeta($alert_qty_over_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta period_typ_view_META = createStringMeta($period_typ_view);
	public static final MCMeta period_typ_META = createCommonMeta($period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta ld_sub_calc_typ_META = createCommonMeta($ld_sub_calc_typ, mcframe.commonMS.meta.MS_META.LD_SUB_CALC_TYP);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			opn_flg_META,
			sav_flg_META,
			fix_flg_META,
			inst_flg_META,
			cmpl_flg_META,
			prcd_flg_META,
			sim_flg_META,
			sim_mrp_no_META,
			dt_fr_META,
			dt_to_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			base_qty_over_flg_META,
			alert_qty_over_flg_META,
			period_typ_view_META,
			period_typ_META,
			ld_sub_calc_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean opn_flg() {
		return getConstBoolean(offset + 0, $opn_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void opn_flg(boolean value) {
		setConstBoolean(offset + 0, $opn_flg, value);
	}


	/**
	 * Save 保存.<p>
	 *
	 */
	public boolean sav_flg() {
		return getConstBoolean(offset + 1, $sav_flg);
	}

	/**
	 * Save 保存.<p>
	 *
	 */
	public void sav_flg(boolean value) {
		setConstBoolean(offset + 1, $sav_flg, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 2, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_flg, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean inst_flg() {
		return getConstBoolean(offset + 3, $inst_flg);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void inst_flg(boolean value) {
		setConstBoolean(offset + 3, $inst_flg, value);
	}


	/**
	 * Completed 完了.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 4, $cmpl_flg);
	}

	/**
	 * Completed 完了.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 4, $cmpl_flg, value);
	}


	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public boolean prcd_flg() {
		return getConstBoolean(offset + 5, $prcd_flg);
	}

	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public void prcd_flg(boolean value) {
		setConstBoolean(offset + 5, $prcd_flg, value);
	}


	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public boolean sim_flg() {
		return getConstBoolean(offset + 6, $sim_flg);
	}

	/**
	 * Simulation シミュレーション.<p>
	 *
	 */
	public void sim_flg(boolean value) {
		setConstBoolean(offset + 6, $sim_flg, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 7, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 7, $sim_mrp_no, value);
	}


	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 8, $dt_fr);
	}

	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 8, $dt_fr, value);
	}


	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 9, $dt_to);
	}

	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 9, $dt_to, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 10, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 10, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 11, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 11, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 12, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 12, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 13, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 13, $wg_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 14, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 14, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 15, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 15, $loc_grp_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 16, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 16, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 17, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 17, $mfg_loc_nm, value);
	}


	/**
	 * Only base value exceeded 基準値超過のみ.<p>
	 *
	 */
	public boolean base_qty_over_flg() {
		return getConstBoolean(offset + 18, $base_qty_over_flg);
	}

	/**
	 * Only base value exceeded 基準値超過のみ.<p>
	 *
	 */
	public void base_qty_over_flg(boolean value) {
		setConstBoolean(offset + 18, $base_qty_over_flg, value);
	}


	/**
	 * Alert threshold exceeded only アラート閾値超過のみ.<p>
	 *
	 */
	public boolean alert_qty_over_flg() {
		return getConstBoolean(offset + 19, $alert_qty_over_flg);
	}

	/**
	 * Alert threshold exceeded only アラート閾値超過のみ.<p>
	 *
	 */
	public void alert_qty_over_flg(boolean value) {
		setConstBoolean(offset + 19, $alert_qty_over_flg, value);
	}


	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public String period_typ_view() {
		return getConstString(offset + 20, $period_typ_view);
	}

	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public void period_typ_view(String value) {
		setConstString(offset + 20, $period_typ_view, value);
	}


	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public String period_typ() {
		return getConstString(offset + 21, $period_typ);
	}

	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public void period_typ(String value) {
		setConstString(offset + 21, $period_typ, value);
	}


	/**
	 * Load breakdown calculation type 負荷内訳計算区分.<p>
	 *
	 */
	public String ld_sub_calc_typ() {
		return getConstString(offset + 22, $ld_sub_calc_typ);
	}

	/**
	 * Load breakdown calculation type 負荷内訳計算区分.<p>
	 *
	 */
	public void ld_sub_calc_typ(String value) {
		setConstString(offset + 22, $ld_sub_calc_typ, value);
	}


	public String getString(String name) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($period_typ_view.equalsIgnoreCase(name)) {
			return period_typ_view();
		}
		if ($period_typ.equalsIgnoreCase(name)) {
			return period_typ();
		}
		if ($ld_sub_calc_typ.equalsIgnoreCase(name)) {
			return ld_sub_calc_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			return sav_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			return prcd_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		if ($base_qty_over_flg.equalsIgnoreCase(name)) {
			return base_qty_over_flg();
		}
		if ($alert_qty_over_flg.equalsIgnoreCase(name)) {
			return alert_qty_over_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($period_typ_view.equalsIgnoreCase(name)) {
			return period_typ_view();
		}
		if ($period_typ.equalsIgnoreCase(name)) {
			return period_typ();
		}
		if ($ld_sub_calc_typ.equalsIgnoreCase(name)) {
			return ld_sub_calc_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			return opn_flg();
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			return sav_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			return inst_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			return prcd_flg();
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			return sim_flg();
		}
		if ($base_qty_over_flg.equalsIgnoreCase(name)) {
			return base_qty_over_flg();
		}
		if ($alert_qty_over_flg.equalsIgnoreCase(name)) {
			return alert_qty_over_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($period_typ_view.equalsIgnoreCase(name)) {
			period_typ_view(value);
			return;
		}
		if ($period_typ.equalsIgnoreCase(name)) {
			period_typ(value);
			return;
		}
		if ($ld_sub_calc_typ.equalsIgnoreCase(name)) {
			ld_sub_calc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			sav_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			prcd_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		if ($base_qty_over_flg.equalsIgnoreCase(name)) {
			base_qty_over_flg(value);
			return;
		}
		if ($alert_qty_over_flg.equalsIgnoreCase(name)) {
			alert_qty_over_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($period_typ_view.equalsIgnoreCase(name)) {
			period_typ_view(value);
			return;
		}
		if ($period_typ.equalsIgnoreCase(name)) {
			period_typ(value);
			return;
		}
		if ($ld_sub_calc_typ.equalsIgnoreCase(name)) {
			ld_sub_calc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($opn_flg.equalsIgnoreCase(name)) {
			opn_flg(value);
			return;
		}
		if ($sav_flg.equalsIgnoreCase(name)) {
			sav_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($inst_flg.equalsIgnoreCase(name)) {
			inst_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($prcd_flg.equalsIgnoreCase(name)) {
			prcd_flg(value);
			return;
		}
		if ($sim_flg.equalsIgnoreCase(name)) {
			sim_flg(value);
			return;
		}
		if ($base_qty_over_flg.equalsIgnoreCase(name)) {
			base_qty_over_flg(value);
			return;
		}
		if ($alert_qty_over_flg.equalsIgnoreCase(name)) {
			alert_qty_over_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

