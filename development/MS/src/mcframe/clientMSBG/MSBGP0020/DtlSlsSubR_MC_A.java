package mcframe.clientMSBG.MSBGP0020;

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
 * ブロック"DtlSlsSub"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlSlsSubR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public static final String $bill_prnt_tgt_flg = "bill_prnt_tgt_flg";
	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public static final String $bill_mtd_typ = "bill_mtd_typ";
	/**
	 * Billing system type name 請求方式区分名.<p>
	 *
	 */
	public static final String $bill_mtd_typ_nm = "bill_mtd_typ_nm";
	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public static final String $prt_amt = "prt_amt";
	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public static final String $prt_tax_amt = "prt_tax_amt";
	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public static final String $prt_inc_tax_amt = "prt_inc_tax_amt";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public static final String $inc_tax_amt = "inc_tax_amt";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public static final String $schd_bill_dt = "schd_bill_dt";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $row_num = "row_num";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_prnt_tgt_flg_META = createCommonMeta($bill_prnt_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_mtd_typ_META = createCommonMeta($bill_mtd_typ, mcframe.commonMS.meta.MS_META.BILL_MTD_TYP);
	public static final MCMeta bill_mtd_typ_nm_META = createCommonMeta($bill_mtd_typ_nm, mcframe.commonMS.meta.MS_META.BILL_MTD_TYP_NM);
	public static final MCMeta prt_amt_META = createCommonMeta($prt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prt_tax_amt_META = createCommonMeta($prt_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prt_inc_tax_amt_META = createCommonMeta($prt_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_tax_amt_META = createCommonMeta($inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta schd_bill_dt_META = createCommonMeta($schd_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta row_num_META = createCommonMeta($row_num, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<DtlSlsSubR> constMetas = new ConstMetaList<DtlSlsSubR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			bill_prnt_tgt_flg_META,
			bill_mtd_typ_META,
			bill_mtd_typ_nm_META,
			prt_amt_META,
			prt_tax_amt_META,
			prt_inc_tax_amt_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			inc_tax_amt_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			schd_bill_dt_META,
			bill_d_no_META,
			row_num_META
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
	protected DtlSlsSubR_MC_A(ConstMetaList<? extends DtlSlsSubR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSlsSubR clone() {
		return (DtlSlsSubR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSlsSubR createInstance() {
		return (DtlSlsSubR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSlsSubR getValues(String... names) {
		return (DtlSlsSubR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public boolean bill_prnt_tgt_flg() {
		return getConstBoolean(offset + 1, $bill_prnt_tgt_flg);
	}

	/**
	 * Invoice output 請求書出力.<p>
	 *
	 */
	public void bill_prnt_tgt_flg(boolean value) {
		setConstBoolean(offset + 1, $bill_prnt_tgt_flg, value);
	}


	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public String bill_mtd_typ() {
		return getConstString(offset + 2, $bill_mtd_typ);
	}

	/**
	 * Billing method type 請求方式区分.<p>
	 *
	 */
	public void bill_mtd_typ(String value) {
		setConstString(offset + 2, $bill_mtd_typ, value);
	}


	/**
	 * Billing system type name 請求方式区分名.<p>
	 *
	 */
	public String bill_mtd_typ_nm() {
		return getConstString(offset + 3, $bill_mtd_typ_nm);
	}

	/**
	 * Billing system type name 請求方式区分名.<p>
	 *
	 */
	public void bill_mtd_typ_nm(String value) {
		setConstString(offset + 3, $bill_mtd_typ_nm, value);
	}


	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public MCNumber prt_amt() {
		return getConstNumber(offset + 4, $prt_amt);
	}

	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public void prt_amt(MCNumber value) {
		setConstNumber(offset + 4, $prt_amt, value);
	}

	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public void prt_amt(int value) {
		setConstNumber(offset + 4, $prt_amt, value);
	}

	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public void prt_amt(long value) {
		setConstNumber(offset + 4, $prt_amt, value);
	}

	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public void prt_amt(float value) {
		setConstNumber(offset + 4, $prt_amt, value);
	}

	/**
	 * Partial billing amount 一部請求金額.<p>
	 *
	 */
	public void prt_amt(double value) {
		setConstNumber(offset + 4, $prt_amt, value);
	}


	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public MCNumber prt_tax_amt() {
		return getConstNumber(offset + 5, $prt_tax_amt);
	}

	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public void prt_tax_amt(MCNumber value) {
		setConstNumber(offset + 5, $prt_tax_amt, value);
	}

	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public void prt_tax_amt(int value) {
		setConstNumber(offset + 5, $prt_tax_amt, value);
	}

	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public void prt_tax_amt(long value) {
		setConstNumber(offset + 5, $prt_tax_amt, value);
	}

	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public void prt_tax_amt(float value) {
		setConstNumber(offset + 5, $prt_tax_amt, value);
	}

	/**
	 * Partial billing tax amount 一部請求税額.<p>
	 *
	 */
	public void prt_tax_amt(double value) {
		setConstNumber(offset + 5, $prt_tax_amt, value);
	}


	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public MCNumber prt_inc_tax_amt() {
		return getConstNumber(offset + 6, $prt_inc_tax_amt);
	}

	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public void prt_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 6, $prt_inc_tax_amt, value);
	}

	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public void prt_inc_tax_amt(int value) {
		setConstNumber(offset + 6, $prt_inc_tax_amt, value);
	}

	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public void prt_inc_tax_amt(long value) {
		setConstNumber(offset + 6, $prt_inc_tax_amt, value);
	}

	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public void prt_inc_tax_amt(float value) {
		setConstNumber(offset + 6, $prt_inc_tax_amt, value);
	}

	/**
	 * Tax included partial billing amount 一部請求税込金額.<p>
	 *
	 */
	public void prt_inc_tax_amt(double value) {
		setConstNumber(offset + 6, $prt_inc_tax_amt, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 7, $trd_cur_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 7, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 7, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 7, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 7, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 7, $trd_cur_amt, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 8, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 8, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 8, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 8, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 8, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 8, $trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber inc_tax_amt() {
		return getConstNumber(offset + 9, $inc_tax_amt);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 9, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(int value) {
		setConstNumber(offset + 9, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(long value) {
		setConstNumber(offset + 9, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(float value) {
		setConstNumber(offset + 9, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(double value) {
		setConstNumber(offset + 9, $inc_tax_amt, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 10, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 10, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 11, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 11, $trd_ptn_typ, value);
	}


	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public MCDate schd_bill_dt() {
		return getConstDate(offset + 12, $schd_bill_dt);
	}

	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public void schd_bill_dt(MCDate value) {
		setConstDate(offset + 12, $schd_bill_dt, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 13, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 13, $bill_d_no, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber row_num() {
		return getConstNumber(offset + 14, $row_num);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(MCNumber value) {
		setConstNumber(offset + 14, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(int value) {
		setConstNumber(offset + 14, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(long value) {
		setConstNumber(offset + 14, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(float value) {
		setConstNumber(offset + 14, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(double value) {
		setConstNumber(offset + 14, $row_num, value);
	}


	public String getString(String name) {
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		if ($bill_mtd_typ_nm.equalsIgnoreCase(name)) {
			return bill_mtd_typ_nm();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			return prt_amt();
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			return prt_tax_amt();
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			return prt_inc_tax_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			return inc_tax_amt();
		}
		if ($row_num.equalsIgnoreCase(name)) {
			return row_num();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			return schd_bill_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			return bill_prnt_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		if ($bill_mtd_typ_nm.equalsIgnoreCase(name)) {
			return bill_mtd_typ_nm();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			return prt_amt();
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			return prt_tax_amt();
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			return prt_inc_tax_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			return inc_tax_amt();
		}
		if ($row_num.equalsIgnoreCase(name)) {
			return row_num();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			return schd_bill_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			return bill_prnt_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
			return;
		}
		if ($bill_mtd_typ_nm.equalsIgnoreCase(name)) {
			bill_mtd_typ_nm(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			schd_bill_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			bill_prnt_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
			return;
		}
		if ($bill_mtd_typ_nm.equalsIgnoreCase(name)) {
			bill_mtd_typ_nm(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prt_amt.equalsIgnoreCase(name)) {
			prt_amt(value);
			return;
		}
		if ($prt_tax_amt.equalsIgnoreCase(name)) {
			prt_tax_amt(value);
			return;
		}
		if ($prt_inc_tax_amt.equalsIgnoreCase(name)) {
			prt_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			schd_bill_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			bill_prnt_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

