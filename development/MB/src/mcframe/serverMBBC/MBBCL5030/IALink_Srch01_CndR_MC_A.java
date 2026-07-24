package mcframe.serverMBBC.MBBCL5030;

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
 * ブロック"IALink_Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IALink_Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public static final String $dir = "dir";
	/**
	 * Include file ファイル含む.<p>
	 *
	 */
	public static final String $inc_file_flg = "inc_file_flg";


	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta dir_META = createCommonMeta($dir, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta inc_file_flg_META = createCommonMeta($inc_file_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<IALink_Srch01_CndR> constMetas = new ConstMetaList<IALink_Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ext_sys_cd_META,
			dir_META,
			inc_file_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected IALink_Srch01_CndR_MC_A(ConstMetaList<? extends IALink_Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Srch01_CndR clone() {
		return (IALink_Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Srch01_CndR createInstance() {
		return (IALink_Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Srch01_CndR getValues(String... names) {
		return (IALink_Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 0, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 0, $ext_sys_cd, value);
	}


	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String dir() {
		return getConstString(offset + 1, $dir);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void dir(String value) {
		setConstString(offset + 1, $dir, value);
	}


	/**
	 * Include file ファイル含む.<p>
	 *
	 */
	public boolean inc_file_flg() {
		return getConstBoolean(offset + 2, $inc_file_flg);
	}

	/**
	 * Include file ファイル含む.<p>
	 *
	 */
	public void inc_file_flg(boolean value) {
		setConstBoolean(offset + 2, $inc_file_flg, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($dir.equalsIgnoreCase(name)) {
			return dir();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_file_flg.equalsIgnoreCase(name)) {
			return inc_file_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($dir.equalsIgnoreCase(name)) {
			return dir();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_file_flg.equalsIgnoreCase(name)) {
			return inc_file_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($dir.equalsIgnoreCase(name)) {
			dir(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_file_flg.equalsIgnoreCase(name)) {
			inc_file_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($dir.equalsIgnoreCase(name)) {
			dir(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_file_flg.equalsIgnoreCase(name)) {
			inc_file_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

