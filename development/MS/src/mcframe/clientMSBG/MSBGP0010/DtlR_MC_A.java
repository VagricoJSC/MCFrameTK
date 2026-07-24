package mcframe.clientMSBG.MSBGP0010;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public static final String $bill_mtd_typ = "bill_mtd_typ";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public static final String $bill_prnt_tgt_flg = "bill_prnt_tgt_flg";
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public static final String $rec_id = "rec_id";
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
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public static final String $rcv_act_upd_cntr = "rcv_act_upd_cntr";


	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_mtd_typ_META = createCommonMeta($bill_mtd_typ, mcframe.commonMS.meta.MS_META.BILL_MTD_TYP);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_prnt_tgt_flg_META = createCommonMeta($bill_prnt_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rec_id_META = createCommonMeta($rec_id, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_upd_cntr_META = createCommonMeta($rcv_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_d_no_META,
			bill_mtd_typ_META,
			amt_META,
			tax_amt_META,
			bill_prnt_tgt_flg_META,
			rec_id_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			rcv_act_upd_cntr_META
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 0, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 0, $bill_d_no, value);
	}


	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public String bill_mtd_typ() {
		return getConstString(offset + 1, $bill_mtd_typ);
	}

	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public void bill_mtd_typ(String value) {
		setConstString(offset + 1, $bill_mtd_typ, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 2, $amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 2, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 2, $amt, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 3, $tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 3, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 3, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 3, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 3, $tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 3, $tax_amt, value);
	}


	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public boolean bill_prnt_tgt_flg() {
		return getConstBoolean(offset + 4, $bill_prnt_tgt_flg);
	}

	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public void bill_prnt_tgt_flg(boolean value) {
		setConstBoolean(offset + 4, $bill_prnt_tgt_flg, value);
	}


	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCNumber rec_id() {
		return getConstNumber(offset + 5, $rec_id);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void rec_id(MCNumber value) {
		setConstNumber(offset + 5, $rec_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void rec_id(int value) {
		setConstNumber(offset + 5, $rec_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void rec_id(long value) {
		setConstNumber(offset + 5, $rec_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void rec_id(float value) {
		setConstNumber(offset + 5, $rec_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void rec_id(double value) {
		setConstNumber(offset + 5, $rec_id, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 6, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 6, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 7, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 7, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 7, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 7, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 7, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 7, $rcv_act_d_seq, value);
	}


	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_act_upd_cntr() {
		return getConstNumber(offset + 8, $rcv_act_upd_cntr);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 8, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(int value) {
		setConstNumber(offset + 8, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(long value) {
		setConstNumber(offset + 8, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(float value) {
		setConstNumber(offset + 8, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(double value) {
		setConstNumber(offset + 8, $rcv_act_upd_cntr, value);
	}


	public String getString(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			return rec_id();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			return bill_prnt_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			return rec_id();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			return bill_prnt_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			bill_prnt_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($rec_id.equalsIgnoreCase(name)) {
			rec_id(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			bill_prnt_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

