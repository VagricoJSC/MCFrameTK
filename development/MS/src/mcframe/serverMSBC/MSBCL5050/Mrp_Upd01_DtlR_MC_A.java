package mcframe.serverMSBC.MSBCL5050;

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
 * ブロック"Mrp_Upd01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Mrp_Upd01_DtlR_MC_A extends MCConstRow {

	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public static final String $mrp_typ = "mrp_typ";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * GI schedule FROM 出庫予定ＦＲＯＭ.<p>
	 *
	 */
	public static final String $gi_schd_fr = "gi_schd_fr";
	/**
	 * Independent requirement FROM 独立所要ＦＲＯＭ.<p>
	 *
	 */
	public static final String $irqmt_fr = "irqmt_fr";
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public static final String $sim_mrp_typ = "sim_mrp_typ";
	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public static final String $mrp_proc_dt = "mrp_proc_dt";
	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public static final String $sch_flg = "sch_flg";
	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public static final String $mrp_calc_no = "mrp_calc_no";
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public static final String $tree_lvl = "tree_lvl";


	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_typ_META = createCommonMeta($mrp_typ, mcframe.commonMS.meta.MS_META.MRP_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_schd_fr_META = createCommonMeta($gi_schd_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta irqmt_fr_META = createCommonMeta($irqmt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta sim_mrp_typ_META = createCommonMeta($sim_mrp_typ, mcframe.commonMS.meta.MS_META.SIM_MRP_TYP);
	public static final MCMeta mrp_proc_dt_META = createCommonMeta($mrp_proc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sch_flg_META = createCommonMeta($sch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrp_calc_no_META = createCommonMeta($mrp_calc_no, mcframe.commonMA.meta.MA_META.MRP_CALC_NO);
	public static final MCMeta tree_lvl_META = createCommonMeta($tree_lvl, mcframe.commonMA.meta.MA_META.TREE_LVL);

	protected static final ConstMetaList<Mrp_Upd01_DtlR> constMetas = new ConstMetaList<Mrp_Upd01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			mrp_typ_META,
			wg_cd_META,
			gi_schd_fr_META,
			irqmt_fr_META,
			sim_mrp_no_META,
			sim_mrp_typ_META,
			mrp_proc_dt_META,
			sch_flg_META,
			mrp_calc_no_META,
			tree_lvl_META
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
	protected Mrp_Upd01_DtlR_MC_A(ConstMetaList<? extends Mrp_Upd01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Mrp_Upd01_DtlR clone() {
		return (Mrp_Upd01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Mrp_Upd01_DtlR createInstance() {
		return (Mrp_Upd01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Mrp_Upd01_DtlR getValues(String... names) {
		return (Mrp_Upd01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 0, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 0, $err_flg, value);
	}


	/**
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public String mrp_typ() {
		return getConstString(offset + 1, $mrp_typ);
	}

	/**
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public void mrp_typ(String value) {
		setConstString(offset + 1, $mrp_typ, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * GI schedule FROM 出庫予定ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_schd_fr() {
		return getConstDate(offset + 3, $gi_schd_fr);
	}

	/**
	 * GI schedule FROM 出庫予定ＦＲＯＭ.<p>
	 *
	 */
	public void gi_schd_fr(MCDate value) {
		setConstDate(offset + 3, $gi_schd_fr, value);
	}


	/**
	 * Independent requirement FROM 独立所要ＦＲＯＭ.<p>
	 *
	 */
	public MCDate irqmt_fr() {
		return getConstDate(offset + 4, $irqmt_fr);
	}

	/**
	 * Independent requirement FROM 独立所要ＦＲＯＭ.<p>
	 *
	 */
	public void irqmt_fr(MCDate value) {
		setConstDate(offset + 4, $irqmt_fr, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 5, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 5, $sim_mrp_no, value);
	}


	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public String sim_mrp_typ() {
		return getConstString(offset + 6, $sim_mrp_typ);
	}

	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public void sim_mrp_typ(String value) {
		setConstString(offset + 6, $sim_mrp_typ, value);
	}


	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public MCDate mrp_proc_dt() {
		return getConstDate(offset + 7, $mrp_proc_dt);
	}

	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public void mrp_proc_dt(MCDate value) {
		setConstDate(offset + 7, $mrp_proc_dt, value);
	}


	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public boolean sch_flg() {
		return getConstBoolean(offset + 8, $sch_flg);
	}

	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public void sch_flg(boolean value) {
		setConstBoolean(offset + 8, $sch_flg, value);
	}


	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public String mrp_calc_no() {
		return getConstString(offset + 9, $mrp_calc_no);
	}

	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public void mrp_calc_no(String value) {
		setConstString(offset + 9, $mrp_calc_no, value);
	}


	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCNumber tree_lvl() {
		return getConstNumber(offset + 10, $tree_lvl);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(MCNumber value) {
		setConstNumber(offset + 10, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(int value) {
		setConstNumber(offset + 10, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(long value) {
		setConstNumber(offset + 10, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(float value) {
		setConstNumber(offset + 10, $tree_lvl, value);
	}

	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public void tree_lvl(double value) {
		setConstNumber(offset + 10, $tree_lvl, value);
	}


	public String getString(String name) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			return tree_lvl();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			return gi_schd_fr();
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			return irqmt_fr();
		}
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			return mrp_proc_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			return sim_mrp_typ();
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			return tree_lvl();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			return gi_schd_fr();
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			return irqmt_fr();
		}
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			return mrp_proc_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			gi_schd_fr(value);
			return;
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			irqmt_fr(value);
			return;
		}
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			mrp_proc_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($sim_mrp_typ.equalsIgnoreCase(name)) {
			sim_mrp_typ(value);
			return;
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($tree_lvl.equalsIgnoreCase(name)) {
			tree_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			gi_schd_fr(value);
			return;
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			irqmt_fr(value);
			return;
		}
		if ($mrp_proc_dt.equalsIgnoreCase(name)) {
			mrp_proc_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

