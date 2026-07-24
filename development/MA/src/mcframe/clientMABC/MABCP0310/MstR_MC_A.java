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
 * ブロック"Mst"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MstR_MC_A extends MCConstRow {

	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $itm_mst_set_typ_nm = "itm_mst_set_typ_nm";
	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public static final String $sub_mst_set_typ_nm = "sub_mst_set_typ_nm";
	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public static final String $unit_mst_set_typ_nm = "unit_mst_set_typ_nm";


	public static final MCMeta itm_mst_set_typ_nm_META = createCommonMeta($itm_mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);
	public static final MCMeta sub_mst_set_typ_nm_META = createCommonMeta($sub_mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);
	public static final MCMeta unit_mst_set_typ_nm_META = createCommonMeta($unit_mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);

	protected static final ConstMetaList<MstR> constMetas = new ConstMetaList<MstR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_mst_set_typ_nm_META,
			sub_mst_set_typ_nm_META,
			unit_mst_set_typ_nm_META
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
	protected MstR_MC_A(ConstMetaList<? extends MstR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstR clone() {
		return (MstR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstR createInstance() {
		return (MstR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstR getValues(String... names) {
		return (MstR) super.getValues(names);
	}



	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_mst_set_typ_nm() {
		return getConstString(offset + 0, $itm_mst_set_typ_nm);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_mst_set_typ_nm(String value) {
		setConstString(offset + 0, $itm_mst_set_typ_nm, value);
	}


	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public String sub_mst_set_typ_nm() {
		return getConstString(offset + 1, $sub_mst_set_typ_nm);
	}

	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public void sub_mst_set_typ_nm(String value) {
		setConstString(offset + 1, $sub_mst_set_typ_nm, value);
	}


	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public String unit_mst_set_typ_nm() {
		return getConstString(offset + 2, $unit_mst_set_typ_nm);
	}

	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public void unit_mst_set_typ_nm(String value) {
		setConstString(offset + 2, $unit_mst_set_typ_nm, value);
	}


	public String getString(String name) {
		if ($itm_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return itm_mst_set_typ_nm();
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return sub_mst_set_typ_nm();
		}
		if ($unit_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return unit_mst_set_typ_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($itm_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return itm_mst_set_typ_nm();
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return sub_mst_set_typ_nm();
		}
		if ($unit_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return unit_mst_set_typ_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_mst_set_typ_nm.equalsIgnoreCase(name)) {
			itm_mst_set_typ_nm(value);
			return;
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			sub_mst_set_typ_nm(value);
			return;
		}
		if ($unit_mst_set_typ_nm.equalsIgnoreCase(name)) {
			unit_mst_set_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_mst_set_typ_nm.equalsIgnoreCase(name)) {
			itm_mst_set_typ_nm(value);
			return;
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			sub_mst_set_typ_nm(value);
			return;
		}
		if ($unit_mst_set_typ_nm.equalsIgnoreCase(name)) {
			unit_mst_set_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

