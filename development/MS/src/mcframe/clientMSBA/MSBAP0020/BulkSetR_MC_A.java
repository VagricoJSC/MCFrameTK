package mcframe.clientMSBA.MSBAP0020;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Notification 通知.<p>
	 *
	 */
	public static final String $prms_ntc_flg = "prms_ntc_flg";
	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public static final String $re_prms_ntc_flg = "re_prms_ntc_flg";


	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			fix_flg_META,
			prms_ntc_flg_META,
			re_prms_ntc_flg_META
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 0, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 0, $fix_flg, value);
	}


	/**
	 * Notification 通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 1, $prms_ntc_flg);
	}

	/**
	 * Notification 通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 1, $prms_ntc_flg, value);
	}


	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 2, $re_prms_ntc_flg);
	}

	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 2, $re_prms_ntc_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

