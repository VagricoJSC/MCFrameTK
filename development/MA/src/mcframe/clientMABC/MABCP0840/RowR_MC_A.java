package mcframe.clientMABC.MABCP0840;

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
 * ブロック"Row"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RowR_MC_A extends MCConstRow {

	/**
	 * Heading 見出し.<p>
	 *
	 */
	public static final String $attach_info_rmrks = "attach_info_rmrks";
	/**
	 * Path パス.<p>
	 *
	 */
	public static final String $attach_info_path = "attach_info_path";
	/**
	 * File ファイル.<p>
	 *
	 */
	public static final String $file = "file";
	public static final String $attach_info_bin = "attach_info_bin";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $attach_info_bin_nm = "attach_info_bin_nm";


	public static final MCMeta attach_info_rmrks_META = createCommonMeta($attach_info_rmrks, mcframe.commonMA.meta.MA_META.ATTACH_INFO_RMRKS);
	public static final MCMeta attach_info_path_META = createCommonMeta($attach_info_path, mcframe.commonMA.meta.MA_META.ATTACH_INFO_PATH);
	public static final MCMeta file_META = createCommonMeta($file, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta attach_info_bin_META = createCommonMeta($attach_info_bin, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta attach_info_bin_nm_META = createCommonMeta($attach_info_bin_nm, mcframe.commonMA.meta.MA_META.ATTACH_INFO_BIN_NM);

	protected static final ConstMetaList<RowR> constMetas = new ConstMetaList<RowR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			attach_info_rmrks_META,
			attach_info_path_META,
			file_META,
			attach_info_bin_META,
			attach_info_bin_nm_META
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
	protected RowR_MC_A(ConstMetaList<? extends RowR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR clone() {
		return (RowR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR createInstance() {
		return (RowR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR getValues(String... names) {
		return (RowR) super.getValues(names);
	}



	/**
	 * Heading 見出し.<p>
	 *
	 */
	public String attach_info_rmrks() {
		return getConstString(offset + 0, $attach_info_rmrks);
	}

	/**
	 * Heading 見出し.<p>
	 *
	 */
	public void attach_info_rmrks(String value) {
		setConstString(offset + 0, $attach_info_rmrks, value);
	}


	/**
	 * Path パス.<p>
	 *
	 */
	public String attach_info_path() {
		return getConstString(offset + 1, $attach_info_path);
	}

	/**
	 * Path パス.<p>
	 *
	 */
	public void attach_info_path(String value) {
		setConstString(offset + 1, $attach_info_path, value);
	}


	/**
	 * File ファイル.<p>
	 *
	 */
	public String file() {
		return getConstString(offset + 2, $file);
	}

	/**
	 * File ファイル.<p>
	 *
	 */
	public void file(String value) {
		setConstString(offset + 2, $file, value);
	}


	public MCBinary attach_info_bin() {
		return getConstBinary(offset + 3, $attach_info_bin);
	}

	public void attach_info_bin(MCBinary value) {
		setConstBinary(offset + 3, $attach_info_bin, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String attach_info_bin_nm() {
		return getConstString(offset + 4, $attach_info_bin_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void attach_info_bin_nm(String value) {
		setConstString(offset + 4, $attach_info_bin_nm, value);
	}


	public String getString(String name) {
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			return attach_info_rmrks();
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			return attach_info_path();
		}
		if ($file.equalsIgnoreCase(name)) {
			return file();
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			return attach_info_bin_nm();
		}
		return super.getString(name);
	}
	public MCBinary getBinary(String name) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			return attach_info_bin();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			return attach_info_rmrks();
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			return attach_info_path();
		}
		if ($file.equalsIgnoreCase(name)) {
			return file();
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			return attach_info_bin_nm();
		}
		return super.getStringNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			return attach_info_bin();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			attach_info_rmrks(value);
			return;
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			attach_info_path(value);
			return;
		}
		if ($file.equalsIgnoreCase(name)) {
			file(value);
			return;
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			attach_info_bin_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			attach_info_bin(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($attach_info_rmrks.equalsIgnoreCase(name)) {
			attach_info_rmrks(value);
			return;
		}
		if ($attach_info_path.equalsIgnoreCase(name)) {
			attach_info_path(value);
			return;
		}
		if ($file.equalsIgnoreCase(name)) {
			file(value);
			return;
		}
		if ($attach_info_bin_nm.equalsIgnoreCase(name)) {
			attach_info_bin_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($attach_info_bin.equalsIgnoreCase(name)) {
			attach_info_bin(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

