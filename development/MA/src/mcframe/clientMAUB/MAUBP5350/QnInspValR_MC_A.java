package mcframe.clientMAUB.MAUBP5350;

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
 * ブロック"QnInspVal"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class QnInspValR_MC_A extends MCConstRow {

	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public static final String $qn_insp_val = "qn_insp_val";


	public static final MCMeta qn_insp_val_META = createCommonMeta($qn_insp_val, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);

	protected static final ConstMetaList<QnInspValR> constMetas = new ConstMetaList<QnInspValR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			qn_insp_val_META
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
	protected QnInspValR_MC_A(ConstMetaList<? extends QnInspValR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QnInspValR clone() {
		return (QnInspValR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QnInspValR createInstance() {
		return (QnInspValR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QnInspValR getValues(String... names) {
		return (QnInspValR) super.getValues(names);
	}



	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public MCNumber qn_insp_val() {
		return getConstNumber(offset + 0, $qn_insp_val);
	}

	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public void qn_insp_val(MCNumber value) {
		setConstNumber(offset + 0, $qn_insp_val, value);
	}

	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public void qn_insp_val(int value) {
		setConstNumber(offset + 0, $qn_insp_val, value);
	}

	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public void qn_insp_val(long value) {
		setConstNumber(offset + 0, $qn_insp_val, value);
	}

	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public void qn_insp_val(float value) {
		setConstNumber(offset + 0, $qn_insp_val, value);
	}

	/**
	 * Specific value 規格値.<p>
	 *
	 */
	public void qn_insp_val(double value) {
		setConstNumber(offset + 0, $qn_insp_val, value);
	}


	public MCNumber getNumber(String name) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

