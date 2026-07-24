package mcframe.serverMSBH.MSBHL5130;

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
 * ブロック"ApSwBal_Prnt01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ApSwBal_Prnt01_CndR_MC_A extends MCConstRow {

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
	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public static final String $reprnt_flg = "reprnt_flg";


	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta pay_act_seq_META = createCommonMeta($pay_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta reprnt_flg_META = createCommonMeta($reprnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ApSwBal_Prnt01_CndR> constMetas = new ConstMetaList<ApSwBal_Prnt01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pay_act_no_META,
			pay_act_seq_META,
			reprnt_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected ApSwBal_Prnt01_CndR_MC_A(ConstMetaList<? extends ApSwBal_Prnt01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSwBal_Prnt01_CndR clone() {
		return (ApSwBal_Prnt01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSwBal_Prnt01_CndR createInstance() {
		return (ApSwBal_Prnt01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSwBal_Prnt01_CndR getValues(String... names) {
		return (ApSwBal_Prnt01_CndR) super.getValues(names);
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


	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public boolean reprnt_flg() {
		return getConstBoolean(offset + 2, $reprnt_flg);
	}

	/**
	 * Reissue 再発行.<p>
	 *
	 */
	public void reprnt_flg(boolean value) {
		setConstBoolean(offset + 2, $reprnt_flg, value);
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
	public boolean getBoolean(String name) {
		if ($reprnt_flg.equalsIgnoreCase(name)) {
			return reprnt_flg();
		}
		return super.getBoolean(name);
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
	public boolean getBooleanNE(String name) {
		if ($reprnt_flg.equalsIgnoreCase(name)) {
			return reprnt_flg();
		}
		return super.getBooleanNE(name);
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
	public void setBoolean(String name, boolean value) {
		if ($reprnt_flg.equalsIgnoreCase(name)) {
			reprnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($reprnt_flg.equalsIgnoreCase(name)) {
			reprnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

