package mcframe.serverMGBF.MGBFL0410;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_MstrSml"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_MstrSmlR_MC_A extends MCConstRow {

	/**
	 * Column cd. 項目ＣＤ.<p>
	 *
	 */
	public static final String $sml_col_cd = "sml_col_cd";
	/**
	 * Column name 項目名.<p>
	 *
	 */
	public static final String $tgt_col_cd = "tgt_col_cd";
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";


	public static final MCMeta sml_col_cd_META = createCommonMeta($sml_col_cd, mcframe.commonMA.meta.MA_META.COL_CD);
	public static final MCMeta tgt_col_cd_META = createCommonMeta($tgt_col_cd, mcframe.commonMA.meta.MA_META.COL_CD);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_MstrSmlR> constMetas = new ConstMetaList<Srch01_MstrSmlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sml_col_cd_META,
			tgt_col_cd_META,
			minus_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_MstrSmlR_MC_A(ConstMetaList<? extends Srch01_MstrSmlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MstrSmlR clone() {
		return (Srch01_MstrSmlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MstrSmlR createInstance() {
		return (Srch01_MstrSmlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MstrSmlR getValues(String... names) {
		return (Srch01_MstrSmlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Column cd. 項目ＣＤ.<p>
	 *
	 */
	public String sml_col_cd() {
		return getConstString(offset + 0, $sml_col_cd);
	}

	/**
	 * Column cd. 項目ＣＤ.<p>
	 *
	 */
	public void sml_col_cd(String value) {
		setConstString(offset + 0, $sml_col_cd, value);
	}


	/**
	 * Column name 項目名.<p>
	 *
	 */
	public String tgt_col_cd() {
		return getConstString(offset + 1, $tgt_col_cd);
	}

	/**
	 * Column name 項目名.<p>
	 *
	 */
	public void tgt_col_cd(String value) {
		setConstString(offset + 1, $tgt_col_cd, value);
	}


	/**
	 * Minus マイナス.<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 2, $minus_flg);
	}

	/**
	 * Minus マイナス.<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 2, $minus_flg, value);
	}


	public String getString(String name) {
		if ($sml_col_cd.equalsIgnoreCase(name)) {
			return sml_col_cd();
		}
		if ($tgt_col_cd.equalsIgnoreCase(name)) {
			return tgt_col_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sml_col_cd.equalsIgnoreCase(name)) {
			return sml_col_cd();
		}
		if ($tgt_col_cd.equalsIgnoreCase(name)) {
			return tgt_col_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sml_col_cd.equalsIgnoreCase(name)) {
			sml_col_cd(value);
			return;
		}
		if ($tgt_col_cd.equalsIgnoreCase(name)) {
			tgt_col_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sml_col_cd.equalsIgnoreCase(name)) {
			sml_col_cd(value);
			return;
		}
		if ($tgt_col_cd.equalsIgnoreCase(name)) {
			tgt_col_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

