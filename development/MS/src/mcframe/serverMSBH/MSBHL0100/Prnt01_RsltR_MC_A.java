package mcframe.serverMSBH.MSBHL0100;

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
 * ブロック"Prnt01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt01_RsltR_MC_A extends MCConstRow {

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public static final String $pay_act_seq = "pay_act_seq";


	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);

	protected static final ConstMetaList<Prnt01_RsltR> constMetas = new ConstMetaList<Prnt01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_act_no_META,
			pay_act_seq_META
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
	protected Prnt01_RsltR_MC_A(ConstMetaList<? extends Prnt01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltR clone() {
		return (Prnt01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltR createInstance() {
		return (Prnt01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_RsltR getValues(String... names) {
		return (Prnt01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 0, $pay_act_no);
	}

	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 0, $pay_act_no, value);
	}


	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCNumber pay_act_seq() {
		return getConstNumber(offset + 1, $pay_act_seq);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(int value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(long value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(float value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}

	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public void pay_act_seq(double value) {
		setConstNumber(offset + 1, $pay_act_seq, value);
	}


	public String getString(String name) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			return pay_act_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pay_act_seq.equalsIgnoreCase(name)) {
			pay_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

