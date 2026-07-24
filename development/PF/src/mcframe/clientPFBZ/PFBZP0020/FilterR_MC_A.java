package mcframe.clientPFBZ.PFBZP0020;

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
 * ブロック"Filter"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class FilterR_MC_A extends MCConstRow {

	/**
	 * Warning 警告.<p>
	 *
	 */
	public static final String $disp_warn = "disp_warn";
	/**
	 * Exclude warning 警告以外.<p>
	 *
	 */
	public static final String $disp_not_warn = "disp_not_warn";
	/**
	 * Start log 開始ログ.<p>
	 *
	 */
	public static final String $disp_start_log = "disp_start_log";
	/**
	 * Data データ.<p>
	 *
	 */
	public static final String $disp_data_log = "disp_data_log";
	/**
	 * processing progress 処理経過.<p>
	 *
	 */
	public static final String $disp_proc_log = "disp_proc_log";
	/**
	 * End log 終了ログ.<p>
	 *
	 */
	public static final String $disp_end_log = "disp_end_log";


	public static final MCMeta disp_warn_META = createBooleanMeta($disp_warn);
	public static final MCMeta disp_not_warn_META = createBooleanMeta($disp_not_warn);
	public static final MCMeta disp_start_log_META = createBooleanMeta($disp_start_log);
	public static final MCMeta disp_data_log_META = createBooleanMeta($disp_data_log);
	public static final MCMeta disp_proc_log_META = createBooleanMeta($disp_proc_log);
	public static final MCMeta disp_end_log_META = createBooleanMeta($disp_end_log);

	protected static final ConstMetaList<FilterR> constMetas = new ConstMetaList<FilterR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_warn_META,
			disp_not_warn_META,
			disp_start_log_META,
			disp_data_log_META,
			disp_proc_log_META,
			disp_end_log_META
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
	protected FilterR_MC_A(ConstMetaList<? extends FilterR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public FilterR clone() {
		return (FilterR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public FilterR createInstance() {
		return (FilterR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public FilterR getValues(String... names) {
		return (FilterR) super.getValues(names);
	}



	/**
	 * Warning 警告.<p>
	 *
	 */
	public boolean disp_warn() {
		return getConstBoolean(offset + 0, $disp_warn);
	}

	/**
	 * Warning 警告.<p>
	 *
	 */
	public void disp_warn(boolean value) {
		setConstBoolean(offset + 0, $disp_warn, value);
	}


	/**
	 * Exclude warning 警告以外.<p>
	 *
	 */
	public boolean disp_not_warn() {
		return getConstBoolean(offset + 1, $disp_not_warn);
	}

	/**
	 * Exclude warning 警告以外.<p>
	 *
	 */
	public void disp_not_warn(boolean value) {
		setConstBoolean(offset + 1, $disp_not_warn, value);
	}


	/**
	 * Start log 開始ログ.<p>
	 *
	 */
	public boolean disp_start_log() {
		return getConstBoolean(offset + 2, $disp_start_log);
	}

	/**
	 * Start log 開始ログ.<p>
	 *
	 */
	public void disp_start_log(boolean value) {
		setConstBoolean(offset + 2, $disp_start_log, value);
	}


	/**
	 * Data データ.<p>
	 *
	 */
	public boolean disp_data_log() {
		return getConstBoolean(offset + 3, $disp_data_log);
	}

	/**
	 * Data データ.<p>
	 *
	 */
	public void disp_data_log(boolean value) {
		setConstBoolean(offset + 3, $disp_data_log, value);
	}


	/**
	 * processing progress 処理経過.<p>
	 *
	 */
	public boolean disp_proc_log() {
		return getConstBoolean(offset + 4, $disp_proc_log);
	}

	/**
	 * processing progress 処理経過.<p>
	 *
	 */
	public void disp_proc_log(boolean value) {
		setConstBoolean(offset + 4, $disp_proc_log, value);
	}


	/**
	 * End log 終了ログ.<p>
	 *
	 */
	public boolean disp_end_log() {
		return getConstBoolean(offset + 5, $disp_end_log);
	}

	/**
	 * End log 終了ログ.<p>
	 *
	 */
	public void disp_end_log(boolean value) {
		setConstBoolean(offset + 5, $disp_end_log, value);
	}


	public boolean getBoolean(String name) {
		if ($disp_warn.equalsIgnoreCase(name)) {
			return disp_warn();
		}
		if ($disp_not_warn.equalsIgnoreCase(name)) {
			return disp_not_warn();
		}
		if ($disp_start_log.equalsIgnoreCase(name)) {
			return disp_start_log();
		}
		if ($disp_data_log.equalsIgnoreCase(name)) {
			return disp_data_log();
		}
		if ($disp_proc_log.equalsIgnoreCase(name)) {
			return disp_proc_log();
		}
		if ($disp_end_log.equalsIgnoreCase(name)) {
			return disp_end_log();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($disp_warn.equalsIgnoreCase(name)) {
			return disp_warn();
		}
		if ($disp_not_warn.equalsIgnoreCase(name)) {
			return disp_not_warn();
		}
		if ($disp_start_log.equalsIgnoreCase(name)) {
			return disp_start_log();
		}
		if ($disp_data_log.equalsIgnoreCase(name)) {
			return disp_data_log();
		}
		if ($disp_proc_log.equalsIgnoreCase(name)) {
			return disp_proc_log();
		}
		if ($disp_end_log.equalsIgnoreCase(name)) {
			return disp_end_log();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($disp_warn.equalsIgnoreCase(name)) {
			disp_warn(value);
			return;
		}
		if ($disp_not_warn.equalsIgnoreCase(name)) {
			disp_not_warn(value);
			return;
		}
		if ($disp_start_log.equalsIgnoreCase(name)) {
			disp_start_log(value);
			return;
		}
		if ($disp_data_log.equalsIgnoreCase(name)) {
			disp_data_log(value);
			return;
		}
		if ($disp_proc_log.equalsIgnoreCase(name)) {
			disp_proc_log(value);
			return;
		}
		if ($disp_end_log.equalsIgnoreCase(name)) {
			disp_end_log(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($disp_warn.equalsIgnoreCase(name)) {
			disp_warn(value);
			return;
		}
		if ($disp_not_warn.equalsIgnoreCase(name)) {
			disp_not_warn(value);
			return;
		}
		if ($disp_start_log.equalsIgnoreCase(name)) {
			disp_start_log(value);
			return;
		}
		if ($disp_data_log.equalsIgnoreCase(name)) {
			disp_data_log(value);
			return;
		}
		if ($disp_proc_log.equalsIgnoreCase(name)) {
			disp_proc_log(value);
			return;
		}
		if ($disp_end_log.equalsIgnoreCase(name)) {
			disp_end_log(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

