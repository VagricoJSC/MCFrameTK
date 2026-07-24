package mcframe.clientMSBE.MSBEP2210;

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
 * ブロック"Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl2R_MC_A extends mcframe.clientMSBD.MSBDP0140.Dtl2R {


	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";


	protected static final ConstMetaList<Dtl2R> constMetas = new ConstMetaList<Dtl2R>(
		mcframe.clientMSBD.MSBDP0140.Dtl2R.constMetas,
		new MCMeta[]{
		},
		new String[][]{
			{
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"trd_unit_qty",
				"base_unit_qty",
				"purc_cont_qty",
				"purc_cont_fctr",
				"std_cont_qty",
				"std_cont_fctr",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm"
			},
			{
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$trd_unit_qty,
				$base_unit_qty,
				$purc_cont_qty,
				$purc_cont_fctr,
				$std_cont_qty,
				$std_cont_fctr,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		mcframe.clientMSBD.MSBDP0140.Dtl2R.KEYS,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[PURC_ONLY_ITEM]のキー定数 */
	public static final String $$PURC_ONLY_ITEM = "PURC_ONLY_ITEM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		mcframe.clientMSBD.MSBDP0140.Dtl2R.EXTMAP,
		new MCExtMap.Entry($$PURC_ONLY_ITEM, new MCExtList(
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
	protected Dtl2R_MC_A(ConstMetaList<? extends Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R clone() {
		return (Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R createInstance() {
		return (Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R getValues(String... names) {
		return (Dtl2R) super.getValues(names);
	}



	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
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
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
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
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
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
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		super.setInnerRow(name, value);
	}


}

