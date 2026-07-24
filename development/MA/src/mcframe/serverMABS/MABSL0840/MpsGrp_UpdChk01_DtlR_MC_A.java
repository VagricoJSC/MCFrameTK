package mcframe.serverMABS.MABSL0840;

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
 * ブロック"MpsGrp_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MpsGrp_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_MPS_GRP_R {




	protected static final ConstMetaList<MpsGrp_UpdChk01_DtlR> constMetas = new ConstMetaList<MpsGrp_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_MPS_GRP_R.constMetas,
		new MCMeta[]{
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$mps_grp_cd, "E"},	// mps_grp_cd
				{$mps_grp_nm, "E"},	// mps_grp_nm
				{$rqmt_mons, "E"},	// rqmt_mons
				{$prcd_mons, "E"},	// prcd_mons
				{$date_div_mons, "E"},	// date_div_mons
				{$week_div_mons, "E"},	// week_div_mons
				{$period_div_mons, "E"},	// period_div_mons
				{$date_div_typ, "E"},	// date_div_typ
				{$mon01_prod_qty, "E"},	// mon01_prod_qty
				{$mon02_prod_qty, "E"},	// mon02_prod_qty
				{$mon03_prod_qty, "E"},	// mon03_prod_qty
				{$mon04_prod_qty, "E"},	// mon04_prod_qty
				{$mon05_prod_qty, "E"},	// mon05_prod_qty
				{$mon06_prod_qty, "E"},	// mon06_prod_qty
				{$mon07_prod_qty, "E"},	// mon07_prod_qty
				{$mon08_prod_qty, "E"},	// mon08_prod_qty
				{$mon09_prod_qty, "E"},	// mon09_prod_qty
				{$mon10_prod_qty, "E"},	// mon10_prod_qty
				{$mon11_prod_qty, "E"},	// mon11_prod_qty
				{$mon12_prod_qty, "E"}	// mon12_prod_qty
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$date_div_typ, "MAC_DATE_DIV_TYP"}	// date_div_typ
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
	protected MpsGrp_UpdChk01_DtlR_MC_A(ConstMetaList<? extends MpsGrp_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MpsGrp_UpdChk01_DtlR clone() {
		return (MpsGrp_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MpsGrp_UpdChk01_DtlR createInstance() {
		return (MpsGrp_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MpsGrp_UpdChk01_DtlR getValues(String... names) {
		return (MpsGrp_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

