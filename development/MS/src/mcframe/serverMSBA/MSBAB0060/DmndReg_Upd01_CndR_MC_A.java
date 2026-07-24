package mcframe.serverMSBA.MSBAB0060;

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
 * ブロック"DmndReg_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DmndReg_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * Create daily demand 日次需要作成.<p>
	 *
	 */
	public static final String $dly_dmnd_reg_flg = "dly_dmnd_reg_flg";
	/**
	 * Demand creation start date 需要作成開始日.<p>
	 *
	 */
	public static final String $reg_st_dt = "reg_st_dt";
	/**
	 * Demand creation end date 需要作成終了日.<p>
	 *
	 */
	public static final String $reg_end_dt = "reg_end_dt";
	/**
	 * Disaggregation by day 日ばらし.<p>
	 *
	 */
	public static final String $date_div_flg = "date_div_flg";


	public static final MCMeta dly_dmnd_reg_flg_META = createCommonMeta($dly_dmnd_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta reg_st_dt_META = createCommonMeta($reg_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta reg_end_dt_META = createCommonMeta($reg_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta date_div_flg_META = createCommonMeta($date_div_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DmndReg_Upd01_CndR> constMetas = new ConstMetaList<DmndReg_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dly_dmnd_reg_flg_META,
			reg_st_dt_META,
			reg_end_dt_META,
			date_div_flg_META
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
	protected DmndReg_Upd01_CndR_MC_A(ConstMetaList<? extends DmndReg_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DmndReg_Upd01_CndR clone() {
		return (DmndReg_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DmndReg_Upd01_CndR createInstance() {
		return (DmndReg_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DmndReg_Upd01_CndR getValues(String... names) {
		return (DmndReg_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Create daily demand 日次需要作成.<p>
	 *
	 */
	public boolean dly_dmnd_reg_flg() {
		return getConstBoolean(offset + 0, $dly_dmnd_reg_flg);
	}

	/**
	 * Create daily demand 日次需要作成.<p>
	 *
	 */
	public void dly_dmnd_reg_flg(boolean value) {
		setConstBoolean(offset + 0, $dly_dmnd_reg_flg, value);
	}


	/**
	 * Demand creation start date 需要作成開始日.<p>
	 *
	 */
	public MCDate reg_st_dt() {
		return getConstDate(offset + 1, $reg_st_dt);
	}

	/**
	 * Demand creation start date 需要作成開始日.<p>
	 *
	 */
	public void reg_st_dt(MCDate value) {
		setConstDate(offset + 1, $reg_st_dt, value);
	}


	/**
	 * Demand creation end date 需要作成終了日.<p>
	 *
	 */
	public MCDate reg_end_dt() {
		return getConstDate(offset + 2, $reg_end_dt);
	}

	/**
	 * Demand creation end date 需要作成終了日.<p>
	 *
	 */
	public void reg_end_dt(MCDate value) {
		setConstDate(offset + 2, $reg_end_dt, value);
	}


	/**
	 * Disaggregation by day 日ばらし.<p>
	 *
	 */
	public boolean date_div_flg() {
		return getConstBoolean(offset + 3, $date_div_flg);
	}

	/**
	 * Disaggregation by day 日ばらし.<p>
	 *
	 */
	public void date_div_flg(boolean value) {
		setConstBoolean(offset + 3, $date_div_flg, value);
	}


	public MCDate getDate(String name) {
		if ($reg_st_dt.equalsIgnoreCase(name)) {
			return reg_st_dt();
		}
		if ($reg_end_dt.equalsIgnoreCase(name)) {
			return reg_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dly_dmnd_reg_flg.equalsIgnoreCase(name)) {
			return dly_dmnd_reg_flg();
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			return date_div_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($reg_st_dt.equalsIgnoreCase(name)) {
			return reg_st_dt();
		}
		if ($reg_end_dt.equalsIgnoreCase(name)) {
			return reg_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dly_dmnd_reg_flg.equalsIgnoreCase(name)) {
			return dly_dmnd_reg_flg();
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			return date_div_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($reg_st_dt.equalsIgnoreCase(name)) {
			reg_st_dt(value);
			return;
		}
		if ($reg_end_dt.equalsIgnoreCase(name)) {
			reg_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dly_dmnd_reg_flg.equalsIgnoreCase(name)) {
			dly_dmnd_reg_flg(value);
			return;
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			date_div_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($reg_st_dt.equalsIgnoreCase(name)) {
			reg_st_dt(value);
			return;
		}
		if ($reg_end_dt.equalsIgnoreCase(name)) {
			reg_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dly_dmnd_reg_flg.equalsIgnoreCase(name)) {
			dly_dmnd_reg_flg(value);
			return;
		}
		if ($date_div_flg.equalsIgnoreCase(name)) {
			date_div_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

