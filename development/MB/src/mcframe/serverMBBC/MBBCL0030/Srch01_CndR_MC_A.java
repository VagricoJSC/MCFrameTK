package mcframe.serverMBBC.MBBCL0030;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	/**
	 * Folder selection mode フォルダ選択モード.<p>
	 *
	 */
	public static final String $folder_select_mode_flg = "folder_select_mode_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";


	public static final MCMeta file_path_META = createCommonMeta($file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta folder_select_mode_flg_META = createCommonMeta($folder_select_mode_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			file_path_META,
			folder_select_mode_flg_META,
			ext_sys_cd_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 0, $file_path);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 0, $file_path, value);
	}


	/**
	 * Folder selection mode フォルダ選択モード.<p>
	 *
	 */
	public boolean folder_select_mode_flg() {
		return getConstBoolean(offset + 1, $folder_select_mode_flg);
	}

	/**
	 * Folder selection mode フォルダ選択モード.<p>
	 *
	 */
	public void folder_select_mode_flg(boolean value) {
		setConstBoolean(offset + 1, $folder_select_mode_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 2, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 2, $ext_sys_cd, value);
	}


	public String getString(String name) {
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($folder_select_mode_flg.equalsIgnoreCase(name)) {
			return folder_select_mode_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($folder_select_mode_flg.equalsIgnoreCase(name)) {
			return folder_select_mode_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($folder_select_mode_flg.equalsIgnoreCase(name)) {
			folder_select_mode_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($folder_select_mode_flg.equalsIgnoreCase(name)) {
			folder_select_mode_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

