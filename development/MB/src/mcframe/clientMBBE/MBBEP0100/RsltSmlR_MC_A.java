package mcframe.clientMBBE.MBBEP0100;

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
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public static final String $exec_time = "exec_time";


	public static final MCMeta exec_time_META = createCommonMeta($exec_time, mcframe.commonMA.meta.MA_META.EXEC_TIME);

	protected static final ConstMetaList<RsltSmlR> constMetas = new ConstMetaList<RsltSmlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public MCNumber exec_time() {
		return getConstNumber(offset + 0, $exec_time);
	}

	/**
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public void exec_time(MCNumber value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public void exec_time(int value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public void exec_time(long value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public void exec_time(float value) {
		setConstNumber(offset + 0, $exec_time, value);
	}

	/**
	 * Search run time (Second) 検索実行時間(秒).<p>
	 *
	 */
	public void exec_time(double value) {
		setConstNumber(offset + 0, $exec_time, value);
	}


	public MCNumber getNumber(String name) {
		if ($exec_time.equalsIgnoreCase(name)) {
			return exec_time();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($exec_time.equalsIgnoreCase(name)) {
			return exec_time();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($exec_time.equalsIgnoreCase(name)) {
			exec_time(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

