package mcframe.clientMSBC.MSBCP1010;

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
 * ブロック"OperBtn"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OperBtnR_MC_A extends MCConstRow {

	/**
	 * Re-explode input schedule 投入予定を再展開.<p>
	 *
	 */
	public static final String $inpt_re_ext_flg = "inpt_re_ext_flg";
	/**
	 * Re-explode man-hour schedule 工数予定を再展開.<p>
	 *
	 */
	public static final String $wk_re_ext_flg = "wk_re_ext_flg";
	/**
	 * Re-explode by-product schedule 副産品予定を再展開.<p>
	 *
	 */
	public static final String $byprod_re_ext_flg = "byprod_re_ext_flg";


	public static final MCMeta inpt_re_ext_flg_META = createCommonMeta($inpt_re_ext_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_re_ext_flg_META = createCommonMeta($wk_re_ext_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta byprod_re_ext_flg_META = createCommonMeta($byprod_re_ext_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OperBtnR> constMetas = new ConstMetaList<OperBtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_re_ext_flg_META,
			wk_re_ext_flg_META,
			byprod_re_ext_flg_META
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
	protected OperBtnR_MC_A(ConstMetaList<? extends OperBtnR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBtnR clone() {
		return (OperBtnR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBtnR createInstance() {
		return (OperBtnR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBtnR getValues(String... names) {
		return (OperBtnR) super.getValues(names);
	}



	/**
	 * Re-explode input schedule 投入予定を再展開.<p>
	 *
	 */
	public boolean inpt_re_ext_flg() {
		return getConstBoolean(offset + 0, $inpt_re_ext_flg);
	}

	/**
	 * Re-explode input schedule 投入予定を再展開.<p>
	 *
	 */
	public void inpt_re_ext_flg(boolean value) {
		setConstBoolean(offset + 0, $inpt_re_ext_flg, value);
	}


	/**
	 * Re-explode man-hour schedule 工数予定を再展開.<p>
	 *
	 */
	public boolean wk_re_ext_flg() {
		return getConstBoolean(offset + 1, $wk_re_ext_flg);
	}

	/**
	 * Re-explode man-hour schedule 工数予定を再展開.<p>
	 *
	 */
	public void wk_re_ext_flg(boolean value) {
		setConstBoolean(offset + 1, $wk_re_ext_flg, value);
	}


	/**
	 * Re-explode by-product schedule 副産品予定を再展開.<p>
	 *
	 */
	public boolean byprod_re_ext_flg() {
		return getConstBoolean(offset + 2, $byprod_re_ext_flg);
	}

	/**
	 * Re-explode by-product schedule 副産品予定を再展開.<p>
	 *
	 */
	public void byprod_re_ext_flg(boolean value) {
		setConstBoolean(offset + 2, $byprod_re_ext_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($inpt_re_ext_flg.equalsIgnoreCase(name)) {
			return inpt_re_ext_flg();
		}
		if ($wk_re_ext_flg.equalsIgnoreCase(name)) {
			return wk_re_ext_flg();
		}
		if ($byprod_re_ext_flg.equalsIgnoreCase(name)) {
			return byprod_re_ext_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($inpt_re_ext_flg.equalsIgnoreCase(name)) {
			return inpt_re_ext_flg();
		}
		if ($wk_re_ext_flg.equalsIgnoreCase(name)) {
			return wk_re_ext_flg();
		}
		if ($byprod_re_ext_flg.equalsIgnoreCase(name)) {
			return byprod_re_ext_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($inpt_re_ext_flg.equalsIgnoreCase(name)) {
			inpt_re_ext_flg(value);
			return;
		}
		if ($wk_re_ext_flg.equalsIgnoreCase(name)) {
			wk_re_ext_flg(value);
			return;
		}
		if ($byprod_re_ext_flg.equalsIgnoreCase(name)) {
			byprod_re_ext_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($inpt_re_ext_flg.equalsIgnoreCase(name)) {
			inpt_re_ext_flg(value);
			return;
		}
		if ($wk_re_ext_flg.equalsIgnoreCase(name)) {
			wk_re_ext_flg(value);
			return;
		}
		if ($byprod_re_ext_flg.equalsIgnoreCase(name)) {
			byprod_re_ext_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

