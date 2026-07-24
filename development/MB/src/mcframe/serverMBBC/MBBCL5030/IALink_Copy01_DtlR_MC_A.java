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
 * ブロック"IALink_Copy01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IALink_Copy01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public static final String $src_file = "src_file";
	/**
	 * Storing folder 保存フォルダ.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	/**
	 * Storing file name 保存ファイル名.<p>
	 *
	 */
	public static final String $file_name = "file_name";
	/**
	 * Overwrite 上書き.<p>
	 *
	 */
	public static final String $overwrite_flg = "overwrite_flg";
	/**
	 * Doc. ID 文書ID.<p>
	 *
	 */
	public static final String $id = "id";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta src_file_META = createCommonMeta($src_file, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta file_path_META = createCommonMeta($file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta file_name_META = createCommonMeta($file_name, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta overwrite_flg_META = createCommonMeta($overwrite_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta id_META = createStringMeta($id);

	protected static final ConstMetaList<IALink_Copy01_DtlR> constMetas = new ConstMetaList<IALink_Copy01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			ext_sys_cd_META,
			src_file_META,
			file_path_META,
			file_name_META,
			overwrite_flg_META,
			id_META
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
	protected IALink_Copy01_DtlR_MC_A(ConstMetaList<? extends IALink_Copy01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Copy01_DtlR clone() {
		return (IALink_Copy01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Copy01_DtlR createInstance() {
		return (IALink_Copy01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Copy01_DtlR getValues(String... names) {
		return (IALink_Copy01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 1, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 1, $ext_sys_cd, value);
	}


	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String src_file() {
		return getConstString(offset + 2, $src_file);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void src_file(String value) {
		setConstString(offset + 2, $src_file, value);
	}


	/**
	 * Storing folder 保存フォルダ.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 3, $file_path);
	}

	/**
	 * Storing folder 保存フォルダ.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 3, $file_path, value);
	}


	/**
	 * Storing file name 保存ファイル名.<p>
	 *
	 */
	public String file_name() {
		return getConstString(offset + 4, $file_name);
	}

	/**
	 * Storing file name 保存ファイル名.<p>
	 *
	 */
	public void file_name(String value) {
		setConstString(offset + 4, $file_name, value);
	}


	/**
	 * Overwrite 上書き.<p>
	 *
	 */
	public boolean overwrite_flg() {
		return getConstBoolean(offset + 5, $overwrite_flg);
	}

	/**
	 * Overwrite 上書き.<p>
	 *
	 */
	public void overwrite_flg(boolean value) {
		setConstBoolean(offset + 5, $overwrite_flg, value);
	}


	/**
	 * Doc. ID 文書ID.<p>
	 *
	 */
	public String id() {
		return getConstString(offset + 6, $id);
	}

	/**
	 * Doc. ID 文書ID.<p>
	 *
	 */
	public void id(String value) {
		setConstString(offset + 6, $id, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($src_file.equalsIgnoreCase(name)) {
			return src_file();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_name.equalsIgnoreCase(name)) {
			return file_name();
		}
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($overwrite_flg.equalsIgnoreCase(name)) {
			return overwrite_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($src_file.equalsIgnoreCase(name)) {
			return src_file();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_name.equalsIgnoreCase(name)) {
			return file_name();
		}
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($overwrite_flg.equalsIgnoreCase(name)) {
			return overwrite_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($src_file.equalsIgnoreCase(name)) {
			src_file(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_name.equalsIgnoreCase(name)) {
			file_name(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($overwrite_flg.equalsIgnoreCase(name)) {
			overwrite_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($src_file.equalsIgnoreCase(name)) {
			src_file(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_name.equalsIgnoreCase(name)) {
			file_name(value);
			return;
		}
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($overwrite_flg.equalsIgnoreCase(name)) {
			overwrite_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

