package mcframe.serverMSBG.MSBGL0200;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public static final String $amt1 = "amt1";
	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public static final String $amt2 = "amt2";
	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public static final String $appl_amt = "appl_amt";
	/**
	 * Entry payment received No. 登録入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";


	public static final MCMeta amt1_META = createCommonMeta($amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt2_META = createCommonMeta($amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			amt1_META,
			amt2_META,
			appl_amt_META,
			rcv_no_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public MCNumber amt1() {
		return getConstNumber(offset + 0, $amt1);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(MCNumber value) {
		setConstNumber(offset + 0, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(int value) {
		setConstNumber(offset + 0, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(long value) {
		setConstNumber(offset + 0, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(float value) {
		setConstNumber(offset + 0, $amt1, value);
	}

	/**
	 * Amount 1 金額１.<p>
	 *
	 */
	public void amt1(double value) {
		setConstNumber(offset + 0, $amt1, value);
	}


	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public MCNumber amt2() {
		return getConstNumber(offset + 1, $amt2);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(MCNumber value) {
		setConstNumber(offset + 1, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(int value) {
		setConstNumber(offset + 1, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(long value) {
		setConstNumber(offset + 1, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(float value) {
		setConstNumber(offset + 1, $amt2, value);
	}

	/**
	 * Amount 2 金額２.<p>
	 *
	 */
	public void amt2(double value) {
		setConstNumber(offset + 1, $amt2, value);
	}


	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 2, $appl_amt);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 2, $appl_amt, value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 2, $appl_amt, value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 2, $appl_amt, value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 2, $appl_amt, value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 2, $appl_amt, value);
	}


	/**
	 * Entry payment received No. 登録入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 3, $rcv_no);
	}

	/**
	 * Entry payment received No. 登録入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 3, $rcv_no, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 4, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 4, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 5, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 5, $rcv_act_d_seq, value);
	}


	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt1.equalsIgnoreCase(name)) {
			return amt1();
		}
		if ($amt2.equalsIgnoreCase(name)) {
			return amt2();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt1.equalsIgnoreCase(name)) {
			amt1(value);
			return;
		}
		if ($amt2.equalsIgnoreCase(name)) {
			amt2(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

