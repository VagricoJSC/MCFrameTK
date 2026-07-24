package mcframe.clientMABC.MABCP0310;

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
	 * UPD,Create,0;MOD,Create (Company)/Modify,4;UPD_ADMIN,Create (Company)/Modify (Administrator),2;REF,View,3 UPD,登録する,0;MOD,登録（会社）・訂正する,4;UPD_ADMIN,登録（会社）・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * COM,Company column only,0;CMN,Include common column,1 COM,会社項目のみ,0;CMN,共通項目含む,1.<p>
	 *
	 */
	public static final String $reg = "reg";
	public static final String $itm = "itm";
	/**
	 * Update company only 会社のみ更新.<p>
	 *
	 */
	public static final String $upd_only_com_flg = "upd_only_com_flg";

	public static final String $itm_cd = $itm + ".itm_cd";
	public static final String $itm_sub1 = $itm + ".itm_sub1";
	public static final String $itm_sub2 = $itm + ".itm_sub2";
	public static final String $itm_sub3 = $itm + ".itm_sub3";
	public static final String $itm_nm = $itm + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta reg_META = createStringMeta($reg);
	public static final MCMeta itm_META = createInnerRowMeta($itm, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta upd_only_com_flg_META = createCommonMeta($upd_only_com_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			reg_META,
			itm_META,
			upd_only_com_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
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
	/** 項目属性情報のグループ[INPT_CTL]のキー定数 */
	public static final String $$INPT_CTL = "INPT_CTL";

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
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$INPT_CTL, new MCExtList(
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
	 * UPD,Create,0;MOD,Create (Company)/Modify,4;UPD_ADMIN,Create (Company)/Modify (Administrator),2;REF,View,3 UPD,登録する,0;MOD,登録（会社）・訂正する,4;UPD_ADMIN,登録（会社）・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create,0;MOD,Create (Company)/Modify,4;UPD_ADMIN,Create (Company)/Modify (Administrator),2;REF,View,3 UPD,登録する,0;MOD,登録（会社）・訂正する,4;UPD_ADMIN,登録（会社）・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * COM,Company column only,0;CMN,Include common column,1 COM,会社項目のみ,0;CMN,共通項目含む,1.<p>
	 *
	 */
	public String reg() {
		return getConstString(offset + 1, $reg);
	}

	/**
	 * COM,Company column only,0;CMN,Include common column,1 COM,会社項目のみ,0;CMN,共通項目含む,1.<p>
	 *
	 */
	public void reg(String value) {
		setConstString(offset + 1, $reg, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 2, $itm);
	}
	
	public void itm(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 2, $itm, row);
	}


	/**
	 * Update company only 会社のみ更新.<p>
	 *
	 */
	public boolean upd_only_com_flg() {
		return getConstBoolean(offset + 3, $upd_only_com_flg);
	}

	/**
	 * Update company only 会社のみ更新.<p>
	 *
	 */
	public void upd_only_com_flg(boolean value) {
		setConstBoolean(offset + 3, $upd_only_com_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($reg.equalsIgnoreCase(name)) {
			return reg();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($upd_only_com_flg.equalsIgnoreCase(name)) {
			return upd_only_com_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($reg.equalsIgnoreCase(name)) {
			return reg();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($upd_only_com_flg.equalsIgnoreCase(name)) {
			return upd_only_com_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($reg.equalsIgnoreCase(name)) {
			reg(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($upd_only_com_flg.equalsIgnoreCase(name)) {
			upd_only_com_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($reg.equalsIgnoreCase(name)) {
			reg(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($upd_only_com_flg.equalsIgnoreCase(name)) {
			upd_only_com_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm.equalsIgnoreCase(name)) {
			return itm();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm.equalsIgnoreCase(name)) {
			itm(
				((MCContainerMeta) itm_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
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

