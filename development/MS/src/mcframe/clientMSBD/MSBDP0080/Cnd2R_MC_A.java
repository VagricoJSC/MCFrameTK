package mcframe.clientMSBD.MSBDP0080;

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
 * ブロック"Cnd2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Cnd2R_MC_A extends MCConstRow {

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";


	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);

	protected static final ConstMetaList<Cnd2R> constMetas = new ConstMetaList<Cnd2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_schd_no_META
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
	protected Cnd2R_MC_A(ConstMetaList<? extends Cnd2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R clone() {
		return (Cnd2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R createInstance() {
		return (Cnd2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Cnd2R getValues(String... names) {
		return (Cnd2R) super.getValues(names);
	}



	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 0, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 0, $po_schd_no, value);
	}


	public String getString(String name) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

