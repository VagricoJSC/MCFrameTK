package mcframe.clientMAUC.MAUCP0020;

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
 * ブロック"SysParm"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SysParmR_MC_A extends MCConstRow {

	/**
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public static final String $parm_key = "parm_key";
	/**
	 * Parameter value パラメータ値.<p>
	 *
	 */
	public static final String $parm_val = "parm_val";


	public static final MCMeta parm_key_META = createCommonMeta($parm_key, mcframe.commonMA.meta.MA_META.PARM_KEY);
	public static final MCMeta parm_val_META = createCommonMeta($parm_val, mcframe.commonMA.meta.MA_META.PARM_VAL);

	protected static final ConstMetaList<SysParmR> constMetas = new ConstMetaList<SysParmR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			parm_key_META,
			parm_val_META
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
	protected SysParmR_MC_A(ConstMetaList<? extends SysParmR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SysParmR clone() {
		return (SysParmR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SysParmR createInstance() {
		return (SysParmR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SysParmR getValues(String... names) {
		return (SysParmR) super.getValues(names);
	}



	/**
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public String parm_key() {
		return getConstString(offset + 0, $parm_key);
	}

	/**
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public void parm_key(String value) {
		setConstString(offset + 0, $parm_key, value);
	}


	/**
	 * Parameter value パラメータ値.<p>
	 *
	 */
	public String parm_val() {
		return getConstString(offset + 1, $parm_val);
	}

	/**
	 * Parameter value パラメータ値.<p>
	 *
	 */
	public void parm_val(String value) {
		setConstString(offset + 1, $parm_val, value);
	}


	public String getString(String name) {
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			return parm_val();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			return parm_val();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			parm_val(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			parm_val(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

