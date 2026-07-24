package mcframe.clientMSBB.MSBBP1390;

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
 * ブロック"Cmmn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CmmnR_MC_A extends MCConstRow {

	/**
	 * Amount unit 金額単位.<p>
	 *
	 */
	public static final String $big_num_rnd_typ = "big_num_rnd_typ";
	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public static final String $big_num_rnd_typ_nm = "big_num_rnd_typ_nm";


	public static final MCMeta big_num_rnd_typ_META = createCommonMeta($big_num_rnd_typ, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP);
	public static final MCMeta big_num_rnd_typ_nm_META = createCommonMeta($big_num_rnd_typ_nm, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP_NM);

	protected static final ConstMetaList<CmmnR> constMetas = new ConstMetaList<CmmnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			big_num_rnd_typ_META,
			big_num_rnd_typ_nm_META
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
	protected CmmnR_MC_A(ConstMetaList<? extends CmmnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CmmnR clone() {
		return (CmmnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CmmnR createInstance() {
		return (CmmnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CmmnR getValues(String... names) {
		return (CmmnR) super.getValues(names);
	}



	/**
	 * Amount unit 金額単位.<p>
	 *
	 */
	public String big_num_rnd_typ() {
		return getConstString(offset + 0, $big_num_rnd_typ);
	}

	/**
	 * Amount unit 金額単位.<p>
	 *
	 */
	public void big_num_rnd_typ(String value) {
		setConstString(offset + 0, $big_num_rnd_typ, value);
	}


	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public String big_num_rnd_typ_nm() {
		return getConstString(offset + 1, $big_num_rnd_typ_nm);
	}

	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public void big_num_rnd_typ_nm(String value) {
		setConstString(offset + 1, $big_num_rnd_typ_nm, value);
	}


	public String getString(String name) {
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			return big_num_rnd_typ();
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			return big_num_rnd_typ_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			return big_num_rnd_typ();
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			return big_num_rnd_typ_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			big_num_rnd_typ(value);
			return;
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			big_num_rnd_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			big_num_rnd_typ(value);
			return;
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			big_num_rnd_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

