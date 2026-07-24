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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	public static final String $main_itm_p = "main_itm_p";
	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_unit_cd = "main_itm_unit_cd";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $main_itm_qty_p = "main_itm_qty_p";
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
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";

	public static final String $main_itm_cd = $main_itm_p + ".itm_cd";
	public static final String $main_itm_sub1 = $main_itm_p + ".itm_sub1";
	public static final String $main_itm_sub2 = $main_itm_p + ".itm_sub2";
	public static final String $main_itm_sub3 = $main_itm_p + ".itm_sub3";
	public static final String $main_itm_nm = $main_itm_p + ".itm_nm";
	public static final String $main_itm_qty = $main_itm_qty_p + ".qty";

	public static final MCMeta main_itm_p_META = createInnerRowMeta($main_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta main_itm_unit_cd_META = createCommonMeta($main_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta main_itm_qty_p_META = createInnerRowMeta($main_itm_qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta set_grp_nm_META = createCommonMeta($set_grp_nm, mcframe.commonMA.meta.MA_META.SET_GRP_NM);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			main_itm_p_META,
			main_itm_unit_cd_META,
			dec_place_META,
			main_itm_qty_p_META,
			set_grp_cd_META,
			set_grp_nm_META,
			set_itm_grp_no_META,
			base_dt_META
		},
		new String[][]{
			{
				"main_itm_cd",
				"main_itm_sub1",
				"main_itm_sub2",
				"main_itm_sub3",
				"main_itm_nm",
				"main_itm_qty"
			},
			{
				$main_itm_cd,
				$main_itm_sub1,
				$main_itm_sub2,
				$main_itm_sub3,
				$main_itm_nm,
				$main_itm_qty
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
				{$set_grp_cd, "main_itm_cd;main_itm_sub1;main_itm_sub2;main_itm_sub3"}	// set_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$set_grp_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// set_grp_cd
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0030.ItmR main_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 0, $main_itm_p);
	}
	
	public void main_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 0, $main_itm_p, row);
	}


	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public String main_itm_unit_cd() {
		return getConstString(offset + 1, $main_itm_unit_cd);
	}

	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public void main_itm_unit_cd(String value) {
		setConstString(offset + 1, $main_itm_unit_cd, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 2, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 2, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 2, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP0050.QtyR main_itm_qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 3, $main_itm_qty_p);
	}
	
	public void main_itm_qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 3, $main_itm_qty_p, row);
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 4, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 4, $set_grp_cd, value);
	}


	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public String set_grp_nm() {
		return getConstString(offset + 5, $set_grp_nm);
	}

	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public void set_grp_nm(String value) {
		setConstString(offset + 5, $set_grp_nm, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 6, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 6, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 6, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 6, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 6, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 6, $set_itm_grp_no, value);
	}


	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 7, $base_dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 7, $base_dt, value);
	}


	public String getString(String name) {
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($main_itm_p.equalsIgnoreCase(name)) {
			return main_itm_p();
		}
		if ($main_itm_qty_p.equalsIgnoreCase(name)) {
			return main_itm_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($main_itm_p.equalsIgnoreCase(name)) {
			main_itm_p(
				((MCContainerMeta) main_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($main_itm_qty_p.equalsIgnoreCase(name)) {
			main_itm_qty_p(
				((MCContainerMeta) main_itm_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String main_itm_cd() {
		return main_itm_p().itm_cd();
	}

	public void main_itm_cd(String value) {
		main_itm_p().itm_cd(value);
	}

	public String main_itm_sub1() {
		return main_itm_p().itm_sub1();
	}

	public void main_itm_sub1(String value) {
		main_itm_p().itm_sub1(value);
	}

	public String main_itm_sub2() {
		return main_itm_p().itm_sub2();
	}

	public void main_itm_sub2(String value) {
		main_itm_p().itm_sub2(value);
	}

	public String main_itm_sub3() {
		return main_itm_p().itm_sub3();
	}

	public void main_itm_sub3(String value) {
		main_itm_p().itm_sub3(value);
	}

	public String main_itm_nm() {
		return main_itm_p().itm_nm();
	}

	public void main_itm_nm(String value) {
		main_itm_p().itm_nm(value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public MCNumber main_itm_qty() {
		return main_itm_qty_p().qty();
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(MCNumber value) {
		main_itm_qty_p().qty(value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(int value) {
		main_itm_qty_p().qty(value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(long value) {
		main_itm_qty_p().qty(value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(float value) {
		main_itm_qty_p().qty(value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(double value) {
		main_itm_qty_p().qty(value);
	}

}

