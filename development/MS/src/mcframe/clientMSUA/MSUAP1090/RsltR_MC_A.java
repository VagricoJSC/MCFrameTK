package mcframe.clientMSUA.MSUAP1090;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public static final String $set_grp_nm = "set_grp_nm";
	public static final String $set_itm_p = "set_itm_p";
	/**
	 * Assortment shipment 出荷品揃.<p>
	 *
	 */
	public static final String $ship_assort_flg = "ship_assort_flg";
	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public static final String $set_itm_unit_cd = "set_itm_unit_cd";
	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public static final String $set_itm_unit_nm = "set_itm_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $qty_p = "qty_p";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";

	public static final String $set_itm_cd = $set_itm_p + ".itm_cd";
	public static final String $set_itm_sub1 = $set_itm_p + ".itm_sub1";
	public static final String $set_itm_sub2 = $set_itm_p + ".itm_sub2";
	public static final String $set_itm_sub3 = $set_itm_p + ".itm_sub3";
	public static final String $set_itm_nm = $set_itm_p + ".itm_nm";
	public static final String $qty = $qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta set_grp_nm_META = createCommonMeta($set_grp_nm, mcframe.commonMA.meta.MA_META.SET_GRP_NM);
	public static final MCMeta set_itm_p_META = createInnerRowMeta($set_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ship_assort_flg_META = createCommonMeta($ship_assort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_unit_cd_META = createCommonMeta($set_itm_unit_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta set_itm_unit_nm_META = createCommonMeta($set_itm_unit_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			set_grp_cd_META,
			set_grp_nm_META,
			set_itm_p_META,
			ship_assort_flg_META,
			set_itm_unit_cd_META,
			set_itm_unit_nm_META,
			dec_place_META,
			qty_p_META,
			st_dt_META,
			end_dt_META
		},
		new String[][]{
			{
				"set_itm_cd",
				"set_itm_sub1",
				"set_itm_sub2",
				"set_itm_sub3",
				"set_itm_nm",
				"qty"
			},
			{
				$set_itm_cd,
				$set_itm_sub1,
				$set_itm_sub2,
				$set_itm_sub3,
				$set_itm_nm,
				$qty
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 1, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 1, $set_grp_cd, value);
	}


	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public String set_grp_nm() {
		return getConstString(offset + 2, $set_grp_nm);
	}

	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public void set_grp_nm(String value) {
		setConstString(offset + 2, $set_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR set_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $set_itm_p);
	}
	
	public void set_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $set_itm_p, row);
	}


	/**
	 * Assortment shipment 出荷品揃.<p>
	 *
	 */
	public boolean ship_assort_flg() {
		return getConstBoolean(offset + 4, $ship_assort_flg);
	}

	/**
	 * Assortment shipment 出荷品揃.<p>
	 *
	 */
	public void ship_assort_flg(boolean value) {
		setConstBoolean(offset + 4, $ship_assort_flg, value);
	}


	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public String set_itm_unit_cd() {
		return getConstString(offset + 5, $set_itm_unit_cd);
	}

	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public void set_itm_unit_cd(String value) {
		setConstString(offset + 5, $set_itm_unit_cd, value);
	}


	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public String set_itm_unit_nm() {
		return getConstString(offset + 6, $set_itm_unit_nm);
	}

	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public void set_itm_unit_nm(String value) {
		setConstString(offset + 6, $set_itm_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 7, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 7, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 8, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 8, $qty_p, row);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 9, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 9, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 10, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 10, $end_dt, value);
	}


	public String getString(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			return set_itm_unit_cd();
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			return set_itm_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ship_assort_flg.equalsIgnoreCase(name)) {
			return ship_assort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			return set_itm_unit_cd();
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			return set_itm_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ship_assort_flg.equalsIgnoreCase(name)) {
			return ship_assort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			set_itm_unit_cd(value);
			return;
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			set_itm_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ship_assort_flg.equalsIgnoreCase(name)) {
			ship_assort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			set_itm_unit_cd(value);
			return;
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			set_itm_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ship_assort_flg.equalsIgnoreCase(name)) {
			ship_assort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($set_itm_p.equalsIgnoreCase(name)) {
			return set_itm_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($set_itm_p.equalsIgnoreCase(name)) {
			set_itm_p(
				((MCContainerMeta) set_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String set_itm_cd() {
		return set_itm_p().itm_cd();
	}

	public void set_itm_cd(String value) {
		set_itm_p().itm_cd(value);
	}

	public String set_itm_sub1() {
		return set_itm_p().itm_sub1();
	}

	public void set_itm_sub1(String value) {
		set_itm_p().itm_sub1(value);
	}

	public String set_itm_sub2() {
		return set_itm_p().itm_sub2();
	}

	public void set_itm_sub2(String value) {
		set_itm_p().itm_sub2(value);
	}

	public String set_itm_sub3() {
		return set_itm_p().itm_sub3();
	}

	public void set_itm_sub3(String value) {
		set_itm_p().itm_sub3(value);
	}

	public String set_itm_nm() {
		return set_itm_p().itm_nm();
	}

	public void set_itm_nm(String value) {
		set_itm_p().itm_nm(value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public MCNumber qty() {
		return qty_p().qty();
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		qty_p().qty(value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void qty(int value) {
		qty_p().qty(value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void qty(long value) {
		qty_p().qty(value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void qty(float value) {
		qty_p().qty(value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void qty(double value) {
		qty_p().qty(value);
	}

}

