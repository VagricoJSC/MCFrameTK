package mcframe.clientMABC.MABCP0510;

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

	public static final String $bp_mst_set_typ = "bp_mst_set_typ";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_mst_set_typ_nm = "bp_mst_set_typ_nm";
	/**
	 * BP auxiliary 取引先補助.<p>
	 *
	 */
	public static final String $sub_mst_set_typ_nm = "sub_mst_set_typ_nm";


	public static final MCMeta bp_mst_set_typ_META = createCommonMeta($bp_mst_set_typ, mcframe.commonMA.meta.MA_META.MST_SET_TYP);
	public static final MCMeta bp_mst_set_typ_nm_META = createCommonMeta($bp_mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);
	public static final MCMeta sub_mst_set_typ_nm_META = createCommonMeta($sub_mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);

	protected static final ConstMetaList<MstR> constMetas = new ConstMetaList<MstR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_mst_set_typ_META,
			bp_mst_set_typ_nm_META,
			sub_mst_set_typ_nm_META
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



	public String bp_mst_set_typ() {
		return getConstString(offset + 0, $bp_mst_set_typ);
	}

	public void bp_mst_set_typ(String value) {
		setConstString(offset + 0, $bp_mst_set_typ, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public String bp_mst_set_typ_nm() {
		return getConstString(offset + 1, $bp_mst_set_typ_nm);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_mst_set_typ_nm(String value) {
		setConstString(offset + 1, $bp_mst_set_typ_nm, value);
	}


	/**
	 * BP auxiliary 取引先補助.<p>
	 *
	 */
	public String sub_mst_set_typ_nm() {
		return getConstString(offset + 2, $sub_mst_set_typ_nm);
	}

	/**
	 * BP auxiliary 取引先補助.<p>
	 *
	 */
	public void sub_mst_set_typ_nm(String value) {
		setConstString(offset + 2, $sub_mst_set_typ_nm, value);
	}


	public String getString(String name) {
		if ($bp_mst_set_typ.equalsIgnoreCase(name)) {
			return bp_mst_set_typ();
		}
		if ($bp_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return bp_mst_set_typ_nm();
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return sub_mst_set_typ_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($bp_mst_set_typ.equalsIgnoreCase(name)) {
			return bp_mst_set_typ();
		}
		if ($bp_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return bp_mst_set_typ_nm();
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			return sub_mst_set_typ_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_mst_set_typ.equalsIgnoreCase(name)) {
			bp_mst_set_typ(value);
			return;
		}
		if ($bp_mst_set_typ_nm.equalsIgnoreCase(name)) {
			bp_mst_set_typ_nm(value);
			return;
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			sub_mst_set_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_mst_set_typ.equalsIgnoreCase(name)) {
			bp_mst_set_typ(value);
			return;
		}
		if ($bp_mst_set_typ_nm.equalsIgnoreCase(name)) {
			bp_mst_set_typ_nm(value);
			return;
		}
		if ($sub_mst_set_typ_nm.equalsIgnoreCase(name)) {
			sub_mst_set_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

