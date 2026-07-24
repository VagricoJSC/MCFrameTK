package mcframe.serverMSBG.MSBGL0040;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public static final String $act_no = "act_no";
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public static final String $act_seq = "act_seq";
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public static final String $act_d_seq = "act_d_seq";
	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public static final String $bill_d_typ = "bill_d_typ";
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $row_num = "row_num";
	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public static final String $appl_amt = "appl_amt";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_seq_META = createCommonMeta($act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta act_d_seq_META = createCommonMeta($act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta bill_d_typ_META = createCommonMeta($bill_d_typ, mcframe.commonMS.meta.MS_META.BILL_D_TYP);
	public static final MCMeta row_num_META = createCommonMeta($row_num, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			bill_mng_no_META,
			bill_d_no_META,
			bill_crryovr_times_META,
			upd_cntr_META,
			act_no_META,
			act_seq_META,
			act_rev_META,
			act_d_no_META,
			act_d_seq_META,
			bill_d_typ_META,
			row_num_META,
			appl_amt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$bill_mng_no, "-"},	// bill_mng_no
				{$bill_d_no, "U"},	// bill_d_no
				{$bill_crryovr_times, "-"},	// bill_crryovr_times
				{$upd_cntr, "-"},	// upd_cntr
				{$act_no, "-"},	// act_no
				{$act_seq, "-"},	// act_seq
				{$act_rev, "-"},	// act_rev
				{$act_d_no, "-"},	// act_d_no
				{$act_d_seq, "-"}	// act_d_seq
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bill_mng_no, "-"},	// bill_mng_no
				{$bill_d_no, "-"},	// bill_d_no
				{$bill_crryovr_times, "U"},	// bill_crryovr_times
				{$upd_cntr, "-"},	// upd_cntr
				{$act_no, "-"},	// act_no
				{$act_seq, "-"},	// act_seq
				{$act_rev, "-"},	// act_rev
				{$act_d_no, "-"},	// act_d_no
				{$act_d_seq, "-"}	// act_d_seq
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 2, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 2, $bill_mng_no, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 3, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 3, $bill_d_no, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 4, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 4, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 4, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 4, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 4, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 4, $bill_crryovr_times, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 5, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}


	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 6, $act_no);
	}

	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 6, $act_no, value);
	}


	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCNumber act_seq() {
		return getConstNumber(offset + 7, $act_seq);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(MCNumber value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(int value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(long value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(float value) {
		setConstNumber(offset + 7, $act_seq, value);
	}

	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public void act_seq(double value) {
		setConstNumber(offset + 7, $act_seq, value);
	}


	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 8, $act_rev);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 8, $act_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 8, $act_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 8, $act_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 8, $act_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 8, $act_rev, value);
	}


	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 9, $act_d_no);
	}

	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 9, $act_d_no, value);
	}


	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCNumber act_d_seq() {
		return getConstNumber(offset + 10, $act_d_seq);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(MCNumber value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(int value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(long value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(float value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}

	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public void act_d_seq(double value) {
		setConstNumber(offset + 10, $act_d_seq, value);
	}


	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public String bill_d_typ() {
		return getConstString(offset + 11, $bill_d_typ);
	}

	/**
	 * Billing details type 請求明細区分.<p>
	 *
	 */
	public void bill_d_typ(String value) {
		setConstString(offset + 11, $bill_d_typ, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber row_num() {
		return getConstNumber(offset + 12, $row_num);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(MCNumber value) {
		setConstNumber(offset + 12, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(int value) {
		setConstNumber(offset + 12, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(long value) {
		setConstNumber(offset + 12, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(float value) {
		setConstNumber(offset + 12, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(double value) {
		setConstNumber(offset + 12, $row_num, value);
	}


	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 13, $appl_amt);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 13, $appl_amt, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 13, $appl_amt, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 13, $appl_amt, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 13, $appl_amt, value);
	}

	/**
	 * Reconciled balance 消込残高.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 13, $appl_amt, value);
	}


	public String getString(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($row_num.equalsIgnoreCase(name)) {
			return row_num();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			return bill_d_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			return act_seq();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			return act_d_seq();
		}
		if ($row_num.equalsIgnoreCase(name)) {
			return row_num();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($bill_d_typ.equalsIgnoreCase(name)) {
			bill_d_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($act_seq.equalsIgnoreCase(name)) {
			act_seq(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($act_d_seq.equalsIgnoreCase(name)) {
			act_d_seq(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

