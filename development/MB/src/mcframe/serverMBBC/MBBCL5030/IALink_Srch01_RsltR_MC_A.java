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
 * ブロック"IALink_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class IALink_Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public static final String $id = "id";
	/**
	 * Name 名称.<p>
	 *
	 */
	public static final String $name = "name";
	/**
	 * Type 種類.<p>
	 *
	 */
	public static final String $type = "type";
	/**
	 * Archive date and time アーカイブ日時.<p>
	 *
	 */
	public static final String $updatedate = "updatedate";
	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public static final String $filesize = "filesize";


	public static final MCMeta id_META = createStringMeta($id);
	public static final MCMeta name_META = createCommonMeta($name, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta type_META = createStringMeta($type);
	public static final MCMeta updatedate_META = createCommonMeta($updatedate, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta filesize_META = createCommonMeta($filesize, mcframe.commonMA.meta.MA_META.FILE_SIZE);

	protected static final ConstMetaList<IALink_Srch01_RsltR> constMetas = new ConstMetaList<IALink_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			id_META,
			name_META,
			type_META,
			updatedate_META,
			filesize_META
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
	protected IALink_Srch01_RsltR_MC_A(ConstMetaList<? extends IALink_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Srch01_RsltR clone() {
		return (IALink_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Srch01_RsltR createInstance() {
		return (IALink_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public IALink_Srch01_RsltR getValues(String... names) {
		return (IALink_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public String id() {
		return getConstString(offset + 0, $id);
	}

	/**
	 * ID ＩＤ.<p>
	 *
	 */
	public void id(String value) {
		setConstString(offset + 0, $id, value);
	}


	/**
	 * Name 名称.<p>
	 *
	 */
	public String name() {
		return getConstString(offset + 1, $name);
	}

	/**
	 * Name 名称.<p>
	 *
	 */
	public void name(String value) {
		setConstString(offset + 1, $name, value);
	}


	/**
	 * Type 種類.<p>
	 *
	 */
	public String type() {
		return getConstString(offset + 2, $type);
	}

	/**
	 * Type 種類.<p>
	 *
	 */
	public void type(String value) {
		setConstString(offset + 2, $type, value);
	}


	/**
	 * Archive date and time アーカイブ日時.<p>
	 *
	 */
	public MCDate updatedate() {
		return getConstDate(offset + 3, $updatedate);
	}

	/**
	 * Archive date and time アーカイブ日時.<p>
	 *
	 */
	public void updatedate(MCDate value) {
		setConstDate(offset + 3, $updatedate, value);
	}


	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public MCNumber filesize() {
		return getConstNumber(offset + 4, $filesize);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void filesize(MCNumber value) {
		setConstNumber(offset + 4, $filesize, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void filesize(int value) {
		setConstNumber(offset + 4, $filesize, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void filesize(long value) {
		setConstNumber(offset + 4, $filesize, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void filesize(float value) {
		setConstNumber(offset + 4, $filesize, value);
	}

	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public void filesize(double value) {
		setConstNumber(offset + 4, $filesize, value);
	}


	public String getString(String name) {
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($type.equalsIgnoreCase(name)) {
			return type();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($filesize.equalsIgnoreCase(name)) {
			return filesize();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($updatedate.equalsIgnoreCase(name)) {
			return updatedate();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($id.equalsIgnoreCase(name)) {
			return id();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($type.equalsIgnoreCase(name)) {
			return type();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($filesize.equalsIgnoreCase(name)) {
			return filesize();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($updatedate.equalsIgnoreCase(name)) {
			return updatedate();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($updatedate.equalsIgnoreCase(name)) {
			updatedate(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($id.equalsIgnoreCase(name)) {
			id(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($filesize.equalsIgnoreCase(name)) {
			filesize(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($updatedate.equalsIgnoreCase(name)) {
			updatedate(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

