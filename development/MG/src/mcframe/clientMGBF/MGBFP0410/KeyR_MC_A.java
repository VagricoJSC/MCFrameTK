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
 * ブロック"Key"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class KeyR_MC_A extends MCConstRow {

	/**
	 * CD ＣＤ.<p>
	 *
	 */
	public static final String $cd = "cd";
	/**
	 * Name 名称.<p>
	 *
	 */
	public static final String $nm = "nm";


	public static final MCMeta cd_META = createStringMeta($cd);
	public static final MCMeta nm_META = createStringMeta($nm);

	protected static final ConstMetaList<KeyR> constMetas = new ConstMetaList<KeyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cd_META,
			nm_META
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
	protected KeyR_MC_A(ConstMetaList<? extends KeyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public KeyR clone() {
		return (KeyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public KeyR createInstance() {
		return (KeyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public KeyR getValues(String... names) {
		return (KeyR) super.getValues(names);
	}



	/**
	 * CD ＣＤ.<p>
	 *
	 */
	public String cd() {
		return getConstString(offset + 0, $cd);
	}

	/**
	 * CD ＣＤ.<p>
	 *
	 */
	public void cd(String value) {
		setConstString(offset + 0, $cd, value);
	}


	/**
	 * Name 名称.<p>
	 *
	 */
	public String nm() {
		return getConstString(offset + 1, $nm);
	}

	/**
	 * Name 名称.<p>
	 *
	 */
	public void nm(String value) {
		setConstString(offset + 1, $nm, value);
	}


	public String getString(String name) {
		if ($cd.equalsIgnoreCase(name)) {
			return cd();
		}
		if ($nm.equalsIgnoreCase(name)) {
			return nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($cd.equalsIgnoreCase(name)) {
			return cd();
		}
		if ($nm.equalsIgnoreCase(name)) {
			return nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($cd.equalsIgnoreCase(name)) {
			cd(value);
			return;
		}
		if ($nm.equalsIgnoreCase(name)) {
			nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cd.equalsIgnoreCase(name)) {
			cd(value);
			return;
		}
		if ($nm.equalsIgnoreCase(name)) {
			nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

