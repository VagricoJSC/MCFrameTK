package mcframe.clientMSBG.MSBGP0200;

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
 * ブロック"AdvRcv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AdvRcvR_MC_A extends MCConstRow {

	public static final String $amt1_p = "amt1_p";
	public static final String $amt2_p = "amt2_p";
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	public static final String $appl_amt_p = "appl_amt_p";
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
	/**
	 * Split 分割.<p>
	 *
	 */
	public static final String $div_flg = "div_flg";

	public static final String $amt1 = $amt1_p + ".amt";
	public static final String $amt2 = $amt2_p + ".amt";
	public static final String $appl_amt = $appl_amt_p + ".amt";

	public static final MCMeta amt1_p_META = createInnerRowMeta($amt1_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta amt2_p_META = createInnerRowMeta($amt2_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta appl_amt_p_META = createInnerRowMeta($appl_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta div_flg_META = createCommonMeta($div_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<AdvRcvR> constMetas = new ConstMetaList<AdvRcvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			amt1_p_META,
			amt2_p_META,
			rcv_no_META,
			appl_amt_p_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			div_flg_META
		},
		new String[][]{
			{
				"amt1",
				"amt2",
				"appl_amt"
			},
			{
				$amt1,
				$amt2,
				$appl_amt
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected AdvRcvR_MC_A(ConstMetaList<? extends AdvRcvR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AdvRcvR clone() {
		return (AdvRcvR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AdvRcvR createInstance() {
		return (AdvRcvR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AdvRcvR getValues(String... names) {
		return (AdvRcvR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0060.AmtR amt1_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 0, $amt1_p);
	}
	
	public void amt1_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 0, $amt1_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR amt2_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 1, $amt2_p);
	}
	
	public void amt2_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 1, $amt2_p, row);
	}


	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 2, $rcv_no);
	}

	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 2, $rcv_no, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR appl_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 3, $appl_amt_p);
	}
	
	public void appl_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 3, $appl_amt_p, row);
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


	/**
	 * Split 分割.<p>
	 *
	 */
	public boolean div_flg() {
		return getConstBoolean(offset + 6, $div_flg);
	}

	/**
	 * Split 分割.<p>
	 *
	 */
	public void div_flg(boolean value) {
		setConstBoolean(offset + 6, $div_flg, value);
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		return super.getBoolean(name);
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		return super.getBooleanNE(name);
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($amt1_p.equalsIgnoreCase(name)) {
			return amt1_p();
		}
		if ($amt2_p.equalsIgnoreCase(name)) {
			return amt2_p();
		}
		if ($appl_amt_p.equalsIgnoreCase(name)) {
			return appl_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($amt1_p.equalsIgnoreCase(name)) {
			amt1_p(
				((MCContainerMeta) amt1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($amt2_p.equalsIgnoreCase(name)) {
			amt2_p(
				((MCContainerMeta) amt2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($appl_amt_p.equalsIgnoreCase(name)) {
			appl_amt_p(
				((MCContainerMeta) appl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber amt1() {
		return amt1_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(MCNumber value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(int value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(long value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(float value) {
		amt1_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void amt1(double value) {
		amt1_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber amt2() {
		return amt2_p().amt();
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(MCNumber value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(int value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(long value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(float value) {
		amt2_p().amt(value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void amt2(double value) {
		amt2_p().amt(value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return appl_amt_p().amt();
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		appl_amt_p().amt(value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(int value) {
		appl_amt_p().amt(value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(long value) {
		appl_amt_p().amt(value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(float value) {
		appl_amt_p().amt(value);
	}

	/**
	 * Processed amount 処理済額.<p>
	 *
	 */
	public void appl_amt(double value) {
		appl_amt_p().amt(value);
	}

}

