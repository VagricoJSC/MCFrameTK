package mcframe.serverMSBG.MSBGL0280;

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
 * ブロック"Srch01_DtlRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlRsltR_MC_A extends MCConstRow {

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public static final String $xfr_amt = "xfr_amt";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public static final String $not_appl_note = "not_appl_note";
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public static final String $backord_amt = "backord_amt";
	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public static final String $cred_amt = "cred_amt";
	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public static final String $qtn_amt = "qtn_amt";


	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_amt_META = createCommonMeta($xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_note_META = createCommonMeta($not_appl_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta backord_amt_META = createCommonMeta($backord_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_amt_META = createCommonMeta($cred_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qtn_amt_META = createCommonMeta($qtn_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_DtlRsltR> constMetas = new ConstMetaList<Srch01_DtlRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			acst_cd_META,
			acst_nm_META,
			init_bal_META,
			sls_amt_META,
			cash_amt_META,
			note_amt_META,
			xfr_amt_META,
			setoff_amt_META,
			sw_amt_META,
			end_bal_META,
			not_appl_note_META,
			backord_amt_META,
			cred_amt_META,
			qtn_amt_META
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
	protected Srch01_DtlRsltR_MC_A(ConstMetaList<? extends Srch01_DtlRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlRsltR clone() {
		return (Srch01_DtlRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlRsltR createInstance() {
		return (Srch01_DtlRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlRsltR getValues(String... names) {
		return (Srch01_DtlRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 0, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 0, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 1, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 1, $ar_dpt_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 2, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 2, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 3, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 3, $acst_nm, value);
	}


	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 4, $init_bal);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 4, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 4, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 4, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 4, $init_bal, value);
	}

	/**
	 * Balance of previous month 前月残高.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 4, $init_bal, value);
	}


	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 5, $sls_amt);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 5, $sls_amt, value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 5, $sls_amt, value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 5, $sls_amt, value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 5, $sls_amt, value);
	}

	/**
	 * Tax included sales amount 税込売上額.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 5, $sls_amt, value);
	}


	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 6, $cash_amt);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 6, $cash_amt, value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 6, $cash_amt, value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 6, $cash_amt, value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 6, $cash_amt, value);
	}

	/**
	 * Cash payment received amount 現金入金額.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 6, $cash_amt, value);
	}


	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 7, $note_amt);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 7, $note_amt, value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 7, $note_amt, value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 7, $note_amt, value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 7, $note_amt, value);
	}

	/**
	 * Note payment received amount 手形入金額.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 7, $note_amt, value);
	}


	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return getConstNumber(offset + 8, $xfr_amt);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		setConstNumber(offset + 8, $xfr_amt, value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(int value) {
		setConstNumber(offset + 8, $xfr_amt, value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(long value) {
		setConstNumber(offset + 8, $xfr_amt, value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(float value) {
		setConstNumber(offset + 8, $xfr_amt, value);
	}

	/**
	 * Payment received amount 振込入金額.<p>
	 *
	 */
	public void xfr_amt(double value) {
		setConstNumber(offset + 8, $xfr_amt, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 9, $setoff_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 9, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 9, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 9, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 9, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 9, $setoff_amt, value);
	}


	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 10, $sw_amt);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 10, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 10, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 10, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 10, $sw_amt, value);
	}

	/**
	 * Transfer amount 振替額.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 10, $sw_amt, value);
	}


	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 11, $end_bal);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 11, $end_bal, value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 11, $end_bal, value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 11, $end_bal, value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 11, $end_bal, value);
	}

	/**
	 * AR amount 売掛金.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 11, $end_bal, value);
	}


	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public MCNumber not_appl_note() {
		return getConstNumber(offset + 12, $not_appl_note);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(MCNumber value) {
		setConstNumber(offset + 12, $not_appl_note, value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(int value) {
		setConstNumber(offset + 12, $not_appl_note, value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(long value) {
		setConstNumber(offset + 12, $not_appl_note, value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(float value) {
		setConstNumber(offset + 12, $not_appl_note, value);
	}

	/**
	 * Outstanding notes 未決済手形.<p>
	 *
	 */
	public void not_appl_note(double value) {
		setConstNumber(offset + 12, $not_appl_note, value);
	}


	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCNumber backord_amt() {
		return getConstNumber(offset + 13, $backord_amt);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(MCNumber value) {
		setConstNumber(offset + 13, $backord_amt, value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(int value) {
		setConstNumber(offset + 13, $backord_amt, value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(long value) {
		setConstNumber(offset + 13, $backord_amt, value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(float value) {
		setConstNumber(offset + 13, $backord_amt, value);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void backord_amt(double value) {
		setConstNumber(offset + 13, $backord_amt, value);
	}


	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public MCNumber cred_amt() {
		return getConstNumber(offset + 14, $cred_amt);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(MCNumber value) {
		setConstNumber(offset + 14, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(int value) {
		setConstNumber(offset + 14, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(long value) {
		setConstNumber(offset + 14, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(float value) {
		setConstNumber(offset + 14, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(double value) {
		setConstNumber(offset + 14, $cred_amt, value);
	}


	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public MCNumber qtn_amt() {
		return getConstNumber(offset + 15, $qtn_amt);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(MCNumber value) {
		setConstNumber(offset + 15, $qtn_amt, value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(int value) {
		setConstNumber(offset + 15, $qtn_amt, value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(long value) {
		setConstNumber(offset + 15, $qtn_amt, value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(float value) {
		setConstNumber(offset + 15, $qtn_amt, value);
	}

	/**
	 * Remaining quotation 見積残.<p>
	 *
	 */
	public void qtn_amt(double value) {
		setConstNumber(offset + 15, $qtn_amt, value);
	}


	public String getString(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			return not_appl_note();
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			return backord_amt();
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			return cred_amt();
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			return qtn_amt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			return not_appl_note();
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			return backord_amt();
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			return cred_amt();
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			return qtn_amt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($backord_amt.equalsIgnoreCase(name)) {
			backord_amt(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($qtn_amt.equalsIgnoreCase(name)) {
			qtn_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

