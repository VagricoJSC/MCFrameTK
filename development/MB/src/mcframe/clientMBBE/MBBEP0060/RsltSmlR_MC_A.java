package mcframe.clientMBBE.MBBEP0060;

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
 * ブロック"RsltSml"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltSmlR_MC_A extends MCConstRow {

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public static final String $all_cnt = "all_cnt";
	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public static final String $exec_time = "exec_time";


	public static final MCMeta all_cnt_META = createCommonMeta($all_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta exec_time_META = createCommonMeta($exec_time, mcframe.commonMA.meta.MA_META.EXEC_TIME);

	protected static final ConstMetaList<RsltSmlR> constMetas = new ConstMetaList<RsltSmlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			all_cnt_META,
			exec_time_META
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
	protected RsltSmlR_MC_A(ConstMetaList<? extends RsltSmlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSmlR clone() {
		return (RsltSmlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSmlR createInstance() {
		return (RsltSmlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltSmlR getValues(String... names) {
		return (RsltSmlR) super.getValues(names);
	}



	/**
	 * Total number 全件数.<p>
	 *
	 */
	public MCNumber all_cnt() {
		return getConstNumber(offset + 0, $all_cnt);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(MCNumber value) {
		setConstNumber(offset + 0, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(int value) {
		setConstNumber(offset + 0, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(long value) {
		setConstNumber(offset + 0, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(float value) {
		setConstNumber(offset + 0, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(double value) {
		setConstNumber(offset + 0, $all_cnt, value);
	}


	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public MCNumber exec_time() {
		return getConstNumber(offset + 1, $exec_time);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(MCNumber value) {
		setConstNumber(offset + 1, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(int value) {
		setConstNumber(offset + 1, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(long value) {
		setConstNumber(offset + 1, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(float value) {
		setConstNumber(offset + 1, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(double value) {
		setConstNumber(offset + 1, $exec_time, value);
	}


	public MCNumber getNumber(String name) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			return all_cnt();
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			return exec_time();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			return all_cnt();
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			return exec_time();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

