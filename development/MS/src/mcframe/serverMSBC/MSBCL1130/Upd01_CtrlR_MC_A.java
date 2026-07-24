package mcframe.serverMSBC.MSBCL1130;

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
 * ブロック"Upd01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public static final String $oper_unit_flg = "oper_unit_flg";
	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public static final String $act_immed_prnt_flg = "act_immed_prnt_flg";
	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public static final String $not_bkf_upd_flg = "not_bkf_upd_flg";
	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public static final String $not_wk_cost_upd_calc_flg = "not_wk_cost_upd_calc_flg";


	public static final MCMeta oper_unit_flg_META = createCommonMeta($oper_unit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_immed_prnt_flg_META = createCommonMeta($act_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_bkf_upd_flg_META = createCommonMeta($not_bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_wk_cost_upd_calc_flg_META = createCommonMeta($not_wk_cost_upd_calc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Upd01_CtrlR> constMetas = new ConstMetaList<Upd01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_unit_flg_META,
			act_immed_prnt_flg_META,
			not_bkf_upd_flg_META,
			not_wk_cost_upd_calc_flg_META
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
	protected Upd01_CtrlR_MC_A(ConstMetaList<? extends Upd01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR clone() {
		return (Upd01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR createInstance() {
		return (Upd01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_CtrlR getValues(String... names) {
		return (Upd01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public boolean oper_unit_flg() {
		return getConstBoolean(offset + 0, $oper_unit_flg);
	}

	/**
	 * Operation unit result 工程単位実績.<p>
	 *
	 */
	public void oper_unit_flg(boolean value) {
		setConstBoolean(offset + 0, $oper_unit_flg, value);
	}


	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public boolean act_immed_prnt_flg() {
		return getConstBoolean(offset + 1, $act_immed_prnt_flg);
	}

	/**
	 * Record sheet immediate issue 記録書即時発行.<p>
	 *
	 */
	public void act_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 1, $act_immed_prnt_flg, value);
	}


	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public boolean not_bkf_upd_flg() {
		return getConstBoolean(offset + 2, $not_bkf_upd_flg);
	}

	/**
	 * Not update BF ＢＦ更新しない.<p>
	 *
	 */
	public void not_bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 2, $not_bkf_upd_flg, value);
	}


	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public boolean not_wk_cost_upd_calc_flg() {
		return getConstBoolean(offset + 3, $not_wk_cost_upd_calc_flg);
	}

	/**
	 * Do not auto-calculate man-hour 自動工数計算しない.<p>
	 *
	 */
	public void not_wk_cost_upd_calc_flg(boolean value) {
		setConstBoolean(offset + 3, $not_wk_cost_upd_calc_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			return act_immed_prnt_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return not_wk_cost_upd_calc_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			return oper_unit_flg();
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			return act_immed_prnt_flg();
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			return not_bkf_upd_flg();
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			return not_wk_cost_upd_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			act_immed_prnt_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			not_wk_cost_upd_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($oper_unit_flg.equalsIgnoreCase(name)) {
			oper_unit_flg(value);
			return;
		}
		if ($act_immed_prnt_flg.equalsIgnoreCase(name)) {
			act_immed_prnt_flg(value);
			return;
		}
		if ($not_bkf_upd_flg.equalsIgnoreCase(name)) {
			not_bkf_upd_flg(value);
			return;
		}
		if ($not_wk_cost_upd_calc_flg.equalsIgnoreCase(name)) {
			not_wk_cost_upd_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

