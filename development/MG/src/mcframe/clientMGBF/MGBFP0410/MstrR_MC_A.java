package mcframe.clientMGBF.MGBFP0410;

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
 * ブロック"Mstr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MstrR_MC_A extends MCConstRow {

	/**
	 * Column cd. 項目ＣＤ.<p>
	 *
	 */
	public static final String $col_cd = "col_cd";
	/**
	 * Column name 項目名.<p>
	 *
	 */
	public static final String $col_nm = "col_nm";
	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public static final String $sml_flg = "sml_flg";


	public static final MCMeta col_cd_META = createCommonMeta($col_cd, mcframe.commonMA.meta.MA_META.COL_CD);
	public static final MCMeta col_nm_META = createCommonMeta($col_nm, mcframe.commonMA.meta.MA_META.COL_NM);
	public static final MCMeta sml_flg_META = createCommonMeta($sml_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MstrR> constMetas = new ConstMetaList<MstrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			col_cd_META,
			col_nm_META,
			sml_flg_META
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected MstrR_MC_A(ConstMetaList<? extends MstrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstrR clone() {
		return (MstrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstrR createInstance() {
		return (MstrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MstrR getValues(String... names) {
		return (MstrR) super.getValues(names);
	}



	/**
	 * Column cd. 項目ＣＤ.<p>
	 *
	 */
	public String col_cd() {
		return getConstString(offset + 0, $col_cd);
	}

	/**
	 * Column cd. 項目ＣＤ.<p>
	 *
	 */
	public void col_cd(String value) {
		setConstString(offset + 0, $col_cd, value);
	}


	/**
	 * Column name 項目名.<p>
	 *
	 */
	public String col_nm() {
		return getConstString(offset + 1, $col_nm);
	}

	/**
	 * Column name 項目名.<p>
	 *
	 */
	public void col_nm(String value) {
		setConstString(offset + 1, $col_nm, value);
	}


	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public boolean sml_flg() {
		return getConstBoolean(offset + 2, $sml_flg);
	}

	/**
	 * Aggregation 集計.<p>
	 *
	 */
	public void sml_flg(boolean value) {
		setConstBoolean(offset + 2, $sml_flg, value);
	}


	public String getString(String name) {
		if ($col_cd.equalsIgnoreCase(name)) {
			return col_cd();
		}
		if ($col_nm.equalsIgnoreCase(name)) {
			return col_nm();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($sml_flg.equalsIgnoreCase(name)) {
			return sml_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($col_cd.equalsIgnoreCase(name)) {
			return col_cd();
		}
		if ($col_nm.equalsIgnoreCase(name)) {
			return col_nm();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sml_flg.equalsIgnoreCase(name)) {
			return sml_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($col_cd.equalsIgnoreCase(name)) {
			col_cd(value);
			return;
		}
		if ($col_nm.equalsIgnoreCase(name)) {
			col_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sml_flg.equalsIgnoreCase(name)) {
			sml_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($col_cd.equalsIgnoreCase(name)) {
			col_cd(value);
			return;
		}
		if ($col_nm.equalsIgnoreCase(name)) {
			col_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sml_flg.equalsIgnoreCase(name)) {
			sml_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

