package mcframe.clientMSBC.MSBCP1100;

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
	 * Set start date to today 着手日に本日を設定.<p>
	 *
	 */
	public static final String $set_st_act_dt = "set_st_act_dt";
	/**
	 * Set end date to today 終了日に本日を設定.<p>
	 *
	 */
	public static final String $set_end_act_dt = "set_end_act_dt";
	/**
	 * Display selected operation only 選択工程のみ表示.<p>
	 *
	 */
	public static final String $disp_select_oper_only = "disp_select_oper_only";


	public static final MCMeta set_st_act_dt_META = createCommonMeta($set_st_act_dt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_end_act_dt_META = createCommonMeta($set_end_act_dt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_select_oper_only_META = createCommonMeta($disp_select_oper_only, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OperBtnR> constMetas = new ConstMetaList<OperBtnR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			set_st_act_dt_META,
			set_end_act_dt_META,
			disp_select_oper_only_META
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
	 * Set start date to today 着手日に本日を設定.<p>
	 *
	 */
	public boolean set_st_act_dt() {
		return getConstBoolean(offset + 0, $set_st_act_dt);
	}

	/**
	 * Set start date to today 着手日に本日を設定.<p>
	 *
	 */
	public void set_st_act_dt(boolean value) {
		setConstBoolean(offset + 0, $set_st_act_dt, value);
	}


	/**
	 * Set end date to today 終了日に本日を設定.<p>
	 *
	 */
	public boolean set_end_act_dt() {
		return getConstBoolean(offset + 1, $set_end_act_dt);
	}

	/**
	 * Set end date to today 終了日に本日を設定.<p>
	 *
	 */
	public void set_end_act_dt(boolean value) {
		setConstBoolean(offset + 1, $set_end_act_dt, value);
	}


	/**
	 * Display selected operation only 選択工程のみ表示.<p>
	 *
	 */
	public boolean disp_select_oper_only() {
		return getConstBoolean(offset + 2, $disp_select_oper_only);
	}

	/**
	 * Display selected operation only 選択工程のみ表示.<p>
	 *
	 */
	public void disp_select_oper_only(boolean value) {
		setConstBoolean(offset + 2, $disp_select_oper_only, value);
	}


	public boolean getBoolean(String name) {
		if ($set_st_act_dt.equalsIgnoreCase(name)) {
			return set_st_act_dt();
		}
		if ($set_end_act_dt.equalsIgnoreCase(name)) {
			return set_end_act_dt();
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			return disp_select_oper_only();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($set_st_act_dt.equalsIgnoreCase(name)) {
			return set_st_act_dt();
		}
		if ($set_end_act_dt.equalsIgnoreCase(name)) {
			return set_end_act_dt();
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			return disp_select_oper_only();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($set_st_act_dt.equalsIgnoreCase(name)) {
			set_st_act_dt(value);
			return;
		}
		if ($set_end_act_dt.equalsIgnoreCase(name)) {
			set_end_act_dt(value);
			return;
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			disp_select_oper_only(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($set_st_act_dt.equalsIgnoreCase(name)) {
			set_st_act_dt(value);
			return;
		}
		if ($set_end_act_dt.equalsIgnoreCase(name)) {
			set_end_act_dt(value);
			return;
		}
		if ($disp_select_oper_only.equalsIgnoreCase(name)) {
			disp_select_oper_only(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

