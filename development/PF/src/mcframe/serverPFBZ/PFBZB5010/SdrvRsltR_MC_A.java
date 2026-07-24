package mcframe.serverPFBZ.PFBZB5010;

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
 * ブロック"SdrvRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SdrvRsltR_MC_A extends MCConstRow {

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public static final String $total_cnt = "total_cnt";
	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public static final String $error_cnt = "error_cnt";


	public static final MCMeta total_cnt_META = createCommonMeta($total_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta error_cnt_META = createCommonMeta($error_cnt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<SdrvRsltR> constMetas = new ConstMetaList<SdrvRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			total_cnt_META,
			error_cnt_META
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
	protected SdrvRsltR_MC_A(ConstMetaList<? extends SdrvRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SdrvRsltR clone() {
		return (SdrvRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SdrvRsltR createInstance() {
		return (SdrvRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SdrvRsltR getValues(String... names) {
		return (SdrvRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public MCNumber total_cnt() {
		return getConstNumber(offset + 0, $total_cnt);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(MCNumber value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(int value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(long value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(float value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}

	/**
	 * Total number of processes 全処理件数.<p>
	 *
	 */
	public void total_cnt(double value) {
		setConstNumber(offset + 0, $total_cnt, value);
	}


	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public MCNumber error_cnt() {
		return getConstNumber(offset + 1, $error_cnt);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(MCNumber value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(int value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(long value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(float value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}

	/**
	 * Error count エラー件数.<p>
	 *
	 */
	public void error_cnt(double value) {
		setConstNumber(offset + 1, $error_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			return total_cnt();
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			return error_cnt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			return total_cnt();
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			return error_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		if ($error_cnt.equalsIgnoreCase(name)) {
			error_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

