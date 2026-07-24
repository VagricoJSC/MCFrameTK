package mcframe.serverMBBE.MBBEL0040;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Prnt01_RsltSml"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt01_RsltSmlR_MC_A extends MCConstRow {

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public static final String $exec_time = "exec_time";
	/**
	 * Total number 全件数.<p>
	 *
	 */
	public static final String $all_cnt = "all_cnt";


	public static final MCMeta exec_time_META = createCommonMeta($exec_time, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta all_cnt_META = createCommonMeta($all_cnt, mcframe.commonMA.meta.MA_META.EXEC_TIME);

	protected static final ConstMetaList<Prnt01_RsltSmlR> constMetas = new ConstMetaList<Prnt01_RsltSmlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			exec_time_META,
			all_cnt_META
		},
		new String[][]{
			{
			},
			{
			}
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Prnt01_RsltSmlR_MC_A(ConstMetaList<? extends Prnt01_RsltSmlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltSmlR clone() {
		return (Prnt01_RsltSmlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltSmlR createInstance() {
		return (Prnt01_RsltSmlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltSmlR getValues(String... names) {
		return (Prnt01_RsltSmlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public MCNumber exec_time() {
		return getConstNumber(offset + 0, $exec_time);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(MCNumber value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(int value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(long value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(float value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Run time 実行時間.<p>
	 *
	 */
	public void exec_time(double value) {
		setConstNumber(offset + 0, $exec_time, value);
	}


	/**
	 * Total number 全件数.<p>
	 *
	 */
	public MCNumber all_cnt() {
		return getConstNumber(offset + 1, $all_cnt);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(MCNumber value) {
		setConstNumber(offset + 1, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(int value) {
		setConstNumber(offset + 1, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(long value) {
		setConstNumber(offset + 1, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(float value) {
		setConstNumber(offset + 1, $all_cnt, value);
	}

	/**
	 * Total number 全件数.<p>
	 *
	 */
	public void all_cnt(double value) {
		setConstNumber(offset + 1, $all_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($exec_time.equalsIgnoreCase(name)) {
			return exec_time();
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			return all_cnt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($exec_time.equalsIgnoreCase(name)) {
			return exec_time();
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			return all_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		if ($all_cnt.equalsIgnoreCase(name)) {
			all_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

