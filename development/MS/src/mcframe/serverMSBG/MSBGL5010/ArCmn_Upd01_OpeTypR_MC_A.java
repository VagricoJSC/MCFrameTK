package mcframe.serverMSBG.MSBGL5010;

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
 * ブロック"ArCmn_Upd01_OpeTyp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArCmn_Upd01_OpeTypR_MC_A extends MCConstRow {

	/**
	 * AR update processing type 債権更新処理区分.<p>
	 *
	 */
	public static final String $ar_ope_typ = "ar_ope_typ";


	public static final MCMeta ar_ope_typ_META = createCommonMeta($ar_ope_typ, mcframe.commonMS.meta.MS_META.AR_OPE_TYP);

	protected static final ConstMetaList<ArCmn_Upd01_OpeTypR> constMetas = new ConstMetaList<ArCmn_Upd01_OpeTypR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_ope_typ_META
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
	protected ArCmn_Upd01_OpeTypR_MC_A(ConstMetaList<? extends ArCmn_Upd01_OpeTypR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_OpeTypR clone() {
		return (ArCmn_Upd01_OpeTypR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_OpeTypR createInstance() {
		return (ArCmn_Upd01_OpeTypR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArCmn_Upd01_OpeTypR getValues(String... names) {
		return (ArCmn_Upd01_OpeTypR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * AR update processing type 債権更新処理区分.<p>
	 *
	 */
	public String ar_ope_typ() {
		return getConstString(offset + 0, $ar_ope_typ);
	}

	/**
	 * AR update processing type 債権更新処理区分.<p>
	 *
	 */
	public void ar_ope_typ(String value) {
		setConstString(offset + 0, $ar_ope_typ, value);
	}


	public String getString(String name) {
		if ($ar_ope_typ.equalsIgnoreCase(name)) {
			return ar_ope_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ar_ope_typ.equalsIgnoreCase(name)) {
			return ar_ope_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_ope_typ.equalsIgnoreCase(name)) {
			ar_ope_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_ope_typ.equalsIgnoreCase(name)) {
			ar_ope_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

