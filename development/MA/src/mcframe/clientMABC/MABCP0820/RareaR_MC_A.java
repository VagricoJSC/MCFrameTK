package mcframe.clientMABC.MABCP0820;

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
 * ブロック"Rarea"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RareaR_MC_A extends MCConstRow {

	/**
	 * Parameter overview パラメータ概要.<p>
	 *
	 */
	public static final String $parm_remark = "parm_remark";


	public static final MCMeta parm_remark_META = createCommonMeta($parm_remark, mcframe.commonMA.meta.MA_META.PARM_REMARK);

	protected static final ConstMetaList<RareaR> constMetas = new ConstMetaList<RareaR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			parm_remark_META
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
	protected RareaR_MC_A(ConstMetaList<? extends RareaR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RareaR clone() {
		return (RareaR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RareaR createInstance() {
		return (RareaR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RareaR getValues(String... names) {
		return (RareaR) super.getValues(names);
	}



	/**
	 * Parameter overview パラメータ概要.<p>
	 *
	 */
	public String parm_remark() {
		return getConstString(offset + 0, $parm_remark);
	}

	/**
	 * Parameter overview パラメータ概要.<p>
	 *
	 */
	public void parm_remark(String value) {
		setConstString(offset + 0, $parm_remark, value);
	}


	public String getString(String name) {
		if ($parm_remark.equalsIgnoreCase(name)) {
			return parm_remark();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($parm_remark.equalsIgnoreCase(name)) {
			return parm_remark();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($parm_remark.equalsIgnoreCase(name)) {
			parm_remark(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($parm_remark.equalsIgnoreCase(name)) {
			parm_remark(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

