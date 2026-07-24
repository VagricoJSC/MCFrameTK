package mcframe.clientMABC.MABCP0850;

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public static final String $sls_itm_grp_nm = "sls_itm_grp_nm";
	/**
	 * Including logical delete 論理削除を含む.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public static final String $sls_itm_grp_lvl = "sls_itm_grp_lvl";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta sls_itm_grp_nm_META = createCommonMeta($sls_itm_grp_nm, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_itm_grp_lvl_META = createCommonMeta($sls_itm_grp_lvl, mcframe.commonMA.meta.MA_META.INT4);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			sls_itm_grp_cd_META,
			sls_itm_grp_nm_META,
			del_flg_META,
			sls_itm_grp_lvl_META
		},
		new String[][]{
			{
			},
			{
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
				{$sls_itm_grp_cd, "sls_itm_grp_lvl"}	// sls_itm_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sls_itm_grp_cd, "sls_itm_grp_lvl"}	// sls_itm_grp_cd
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 1, $sls_itm_grp_cd);
	}

	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 1, $sls_itm_grp_cd, value);
	}


	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public String sls_itm_grp_nm() {
		return getConstString(offset + 2, $sls_itm_grp_nm);
	}

	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public void sls_itm_grp_nm(String value) {
		setConstString(offset + 2, $sls_itm_grp_nm, value);
	}


	/**
	 * Including logical delete 論理削除を含む.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 3, $del_flg);
	}

	/**
	 * Including logical delete 論理削除を含む.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 3, $del_flg, value);
	}


	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public MCNumber sls_itm_grp_lvl() {
		return getConstNumber(offset + 4, $sls_itm_grp_lvl);
	}

	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(MCNumber value) {
		setConstNumber(offset + 4, $sls_itm_grp_lvl, value);
	}

	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(int value) {
		setConstNumber(offset + 4, $sls_itm_grp_lvl, value);
	}

	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(long value) {
		setConstNumber(offset + 4, $sls_itm_grp_lvl, value);
	}

	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(float value) {
		setConstNumber(offset + 4, $sls_itm_grp_lvl, value);
	}

	/**
	 * Sales item system hierarchy 販売品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(double value) {
		setConstNumber(offset + 4, $sls_itm_grp_lvl, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			return sls_itm_grp_lvl();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			return sls_itm_grp_lvl();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($sls_itm_grp_nm.equalsIgnoreCase(name)) {
			sls_itm_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

