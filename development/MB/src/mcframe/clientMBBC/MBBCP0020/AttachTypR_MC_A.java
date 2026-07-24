package mcframe.clientMBBC.MBBCP0020;

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
 * ブロック"AttachTyp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AttachTypR_MC_A extends MCConstRow {

	/**
	 * Attached 添付済.<p>
	 *
	 */
	public static final String $attach_flg = "attach_flg";
	/**
	 * Unattached 未添付.<p>
	 *
	 */
	public static final String $no_attach_flg = "no_attach_flg";


	public static final MCMeta attach_flg_META = createCommonMeta($attach_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_attach_flg_META = createCommonMeta($no_attach_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AttachTypR> constMetas = new ConstMetaList<AttachTypR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			attach_flg_META,
			no_attach_flg_META
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
	protected AttachTypR_MC_A(ConstMetaList<? extends AttachTypR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AttachTypR clone() {
		return (AttachTypR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AttachTypR createInstance() {
		return (AttachTypR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AttachTypR getValues(String... names) {
		return (AttachTypR) super.getValues(names);
	}



	/**
	 * Attached 添付済.<p>
	 *
	 */
	public boolean attach_flg() {
		return getConstBoolean(offset + 0, $attach_flg);
	}

	/**
	 * Attached 添付済.<p>
	 *
	 */
	public void attach_flg(boolean value) {
		setConstBoolean(offset + 0, $attach_flg, value);
	}


	/**
	 * Unattached 未添付.<p>
	 *
	 */
	public boolean no_attach_flg() {
		return getConstBoolean(offset + 1, $no_attach_flg);
	}

	/**
	 * Unattached 未添付.<p>
	 *
	 */
	public void no_attach_flg(boolean value) {
		setConstBoolean(offset + 1, $no_attach_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($attach_flg.equalsIgnoreCase(name)) {
			return attach_flg();
		}
		if ($no_attach_flg.equalsIgnoreCase(name)) {
			return no_attach_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($attach_flg.equalsIgnoreCase(name)) {
			return attach_flg();
		}
		if ($no_attach_flg.equalsIgnoreCase(name)) {
			return no_attach_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($attach_flg.equalsIgnoreCase(name)) {
			attach_flg(value);
			return;
		}
		if ($no_attach_flg.equalsIgnoreCase(name)) {
			no_attach_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($attach_flg.equalsIgnoreCase(name)) {
			attach_flg(value);
			return;
		}
		if ($no_attach_flg.equalsIgnoreCase(name)) {
			no_attach_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

