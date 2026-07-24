package mcframe.clientMABS.MABSP1130;

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

	/**
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	public static final String $dt = "dt";
	public static final String $itm = "itm";
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";

	public static final String $st_dt_fr = $dt + ".st_dt_fr";
	public static final String $st_dt_to = $dt + ".st_dt_to";
	public static final String $end_dt_fr = $dt + ".end_dt_fr";
	public static final String $end_dt_to = $dt + ".end_dt_to";
	public static final String $itm_cd = $itm + ".itm_cd";
	public static final String $itm_sub1 = $itm + ".itm_sub1";
	public static final String $itm_sub2 = $itm + ".itm_sub2";
	public static final String $itm_sub3 = $itm + ".itm_sub3";
	public static final String $itm_nm = $itm + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta dt_META = createInnerRowMeta($dt, mcframe.clientMAUB.MAUBP0020.StEndDtR.class);
	public static final MCMeta itm_META = createInnerRowMeta($itm, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			dt_META,
			itm_META,
			off_del_flg_META,
			on_del_flg_META
		},
		new String[][]{
			{
				"st_dt_fr",
				"st_dt_to",
				"end_dt_fr",
				"end_dt_to",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$st_dt_fr,
				$st_dt_to,
				$end_dt_fr,
				$end_dt_to,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
				{$itm + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm.itm_cd
				{$itm + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm.itm_sub1
				{$itm + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm.itm_sub2
				{$itm + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"}	// itm.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm + ".itm_cd", "itm_is_srch_typ"},	// itm.itm_cd
				{$itm + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm.itm_sub1
				{$itm + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm.itm_sub2
				{$itm + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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



	/**
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0020.StEndDtR dt(){
		return (mcframe.clientMAUB.MAUBP0020.StEndDtR) getConstInnerRow(offset + 1, $dt);
	}
	
	public void dt(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		setConstInnerRow(offset + 1, $dt, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 2, $itm);
	}
	
	public void itm(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 2, $itm, row);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 3, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 3, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 4, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 4, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		if ($itm.equalsIgnoreCase(name)) {
			return itm();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(
				((MCContainerMeta) dt_META).castInnerRow(mcframe.clientMAUB.MAUBP0020.StEndDtR.class, value)
			);
			return;
		}
		if ($itm.equalsIgnoreCase(name)) {
			itm(
				((MCContainerMeta) itm_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate st_dt_fr() {
		return dt().st_dt_fr();
	}

	public void st_dt_fr(MCDate value) {
		dt().st_dt_fr(value);
	}

	public MCDate st_dt_to() {
		return dt().st_dt_to();
	}

	public void st_dt_to(MCDate value) {
		dt().st_dt_to(value);
	}

	public MCDate end_dt_fr() {
		return dt().end_dt_fr();
	}

	public void end_dt_fr(MCDate value) {
		dt().end_dt_fr(value);
	}

	public MCDate end_dt_to() {
		return dt().end_dt_to();
	}

	public void end_dt_to(MCDate value) {
		dt().end_dt_to(value);
	}

	public String itm_cd() {
		return itm().itm_cd();
	}

	public void itm_cd(String value) {
		itm().itm_cd(value);
	}

	public String itm_sub1() {
		return itm().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm().itm_sub3(value);
	}

	public String itm_nm() {
		return itm().itm_nm();
	}

	public void itm_nm(String value) {
		itm().itm_nm(value);
	}

}

