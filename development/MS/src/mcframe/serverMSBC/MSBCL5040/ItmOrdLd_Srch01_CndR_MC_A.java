package mcframe.serverMSBC.MSBCL5040;

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
 * ブロック"ItmOrdLd_Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmOrdLd_Srch01_CndR_MC_A extends MCConstRow {

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
	public static final MCMeta period_typ_META = createCommonMeta($period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta ld_sub_calc_typ_META = createCommonMeta($ld_sub_calc_typ, mcframe.commonMS.meta.MS_META.LD_SUB_CALC_TYP);

	protected static final ConstMetaList<ItmOrdLd_Srch01_CndR> constMetas = new ConstMetaList<ItmOrdLd_Srch01_CndR>(
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
	protected ItmOrdLd_Srch01_CndR_MC_A(ConstMetaList<? extends ItmOrdLd_Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_CndR clone() {
		return (ItmOrdLd_Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_CndR createInstance() {
		return (ItmOrdLd_Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_CndR getValues(String... names) {
		return (ItmOrdLd_Srch01_CndR) super.getValues(names);
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
	 * Period type 期間区分.<p>
	 *
	 */
	public String period_typ() {
		return getConstString(offset + 10, $period_typ);
	}

	/**
	 * Period type 期間区分.<p>
	 *
	 */
	public void period_typ(String value) {
		setConstString(offset + 10, $period_typ, value);
	}


	/**
	 * Load breakdown calculation type 負荷内訳計算区分.<p>
	 *
	 */
	public String ld_sub_calc_typ() {
		return getConstString(offset + 11, $ld_sub_calc_typ);
	}

	/**
	 * Load breakdown calculation type 負荷内訳計算区分.<p>
	 *
	 */
	public void ld_sub_calc_typ(String value) {
		setConstString(offset + 11, $ld_sub_calc_typ, value);
	}


	public String getString(String name) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
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
		super.setBooleanNE(name, value);
	}



}

