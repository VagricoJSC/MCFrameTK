package mcframe.clientMSBE.MSBEP0500;

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
 * ブロック"Btn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BtnR_MC_A extends MCConstRow {

	/**
	 * Copy inventory qty. 在庫数量コピー.<p>
	 *
	 */
	public static final String $stk_qty_copy_flg = "stk_qty_copy_flg";
	/**
	 * Allocatable qty. copy 引当可能数量コピー.<p>
	 *
	 */
	public static final String $alloc_qty_copy_flg = "alloc_qty_copy_flg";


	public static final MCMeta stk_qty_copy_flg_META = createCommonMeta($stk_qty_copy_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_qty_copy_flg_META = createCommonMeta($alloc_qty_copy_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BtnR> constMetas = new ConstMetaList<BtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			stk_qty_copy_flg_META,
			alloc_qty_copy_flg_META
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
	protected BtnR_MC_A(ConstMetaList<? extends BtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR clone() {
		return (BtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR createInstance() {
		return (BtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BtnR getValues(String... names) {
		return (BtnR) super.getValues(names);
	}



	/**
	 * Copy inventory qty. 在庫数量コピー.<p>
	 *
	 */
	public boolean stk_qty_copy_flg() {
		return getConstBoolean(offset + 0, $stk_qty_copy_flg);
	}

	/**
	 * Copy inventory qty. 在庫数量コピー.<p>
	 *
	 */
	public void stk_qty_copy_flg(boolean value) {
		setConstBoolean(offset + 0, $stk_qty_copy_flg, value);
	}


	/**
	 * Allocatable qty. copy 引当可能数量コピー.<p>
	 *
	 */
	public boolean alloc_qty_copy_flg() {
		return getConstBoolean(offset + 1, $alloc_qty_copy_flg);
	}

	/**
	 * Allocatable qty. copy 引当可能数量コピー.<p>
	 *
	 */
	public void alloc_qty_copy_flg(boolean value) {
		setConstBoolean(offset + 1, $alloc_qty_copy_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($stk_qty_copy_flg.equalsIgnoreCase(name)) {
			return stk_qty_copy_flg();
		}
		if ($alloc_qty_copy_flg.equalsIgnoreCase(name)) {
			return alloc_qty_copy_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($stk_qty_copy_flg.equalsIgnoreCase(name)) {
			return stk_qty_copy_flg();
		}
		if ($alloc_qty_copy_flg.equalsIgnoreCase(name)) {
			return alloc_qty_copy_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($stk_qty_copy_flg.equalsIgnoreCase(name)) {
			stk_qty_copy_flg(value);
			return;
		}
		if ($alloc_qty_copy_flg.equalsIgnoreCase(name)) {
			alloc_qty_copy_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($stk_qty_copy_flg.equalsIgnoreCase(name)) {
			stk_qty_copy_flg(value);
			return;
		}
		if ($alloc_qty_copy_flg.equalsIgnoreCase(name)) {
			alloc_qty_copy_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

