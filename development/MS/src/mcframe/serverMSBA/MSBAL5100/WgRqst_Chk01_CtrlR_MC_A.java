package mcframe.serverMSBA.MSBAL5100;

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
 * ブロック"WgRqst_Chk01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class WgRqst_Chk01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public static final String $start_peg_no = "start_peg_no";


	public static final MCMeta start_peg_no_META = createCommonMeta($start_peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<WgRqst_Chk01_CtrlR> constMetas = new ConstMetaList<WgRqst_Chk01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			start_peg_no_META
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
	protected WgRqst_Chk01_CtrlR_MC_A(ConstMetaList<? extends WgRqst_Chk01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_CtrlR clone() {
		return (WgRqst_Chk01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_CtrlR createInstance() {
		return (WgRqst_Chk01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public WgRqst_Chk01_CtrlR getValues(String... names) {
		return (WgRqst_Chk01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public MCNumber start_peg_no() {
		return getConstNumber(offset + 0, $start_peg_no);
	}

	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public void start_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $start_peg_no, value);
	}

	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public void start_peg_no(int value) {
		setConstNumber(offset + 0, $start_peg_no, value);
	}

	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public void start_peg_no(long value) {
		setConstNumber(offset + 0, $start_peg_no, value);
	}

	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public void start_peg_no(float value) {
		setConstNumber(offset + 0, $start_peg_no, value);
	}

	/**
	 * Initial pegging No. 初期紐付け番号.<p>
	 *
	 */
	public void start_peg_no(double value) {
		setConstNumber(offset + 0, $start_peg_no, value);
	}


	public MCNumber getNumber(String name) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			return start_peg_no();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			return start_peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($start_peg_no.equalsIgnoreCase(name)) {
			start_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

