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
 * ブロック"Srch01_HdrRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_HdrRsltR_MC_A extends MCConstRow {

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public static final String $cred_nm = "cred_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public static final String $cred_limit = "cred_limit";
	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public static final String $ttl_cred_amt = "ttl_cred_amt";
	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public static final String $cred_bal = "cred_bal";
	/**
	 * Current month 当月.<p>
	 *
	 */
	public static final String $ttl_ym = "ttl_ym";
	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public static final String $ttl_ym_ap = "ttl_ym_ap";
	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public static final String $ttl_end_bal = "ttl_end_bal";
	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public static final String $ttl_init_bal = "ttl_init_bal";
	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public static final String $ttl_sls = "ttl_sls";
	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public static final String $ttl_rcv = "ttl_rcv";
	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public static final String $ttl_adv = "ttl_adv";
	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public static final String $ttl_init_bal_ap = "ttl_init_bal_ap";
	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public static final String $ttl_purc = "ttl_purc";
	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public static final String $ttl_pay = "ttl_pay";
	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public static final String $ttl_adv_pay = "ttl_adv_pay";
	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public static final String $not_appl_note = "not_appl_note";
	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public static final String $not_appl_adv_note = "not_appl_adv_note";
	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public static final String $ttl_backord = "ttl_backord";
	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public static final String $ttl_qtn = "ttl_qtn";
	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public static final String $ttl_po_backord = "ttl_po_backord";


	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_nm_META = createCommonMeta($cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_limit_META = createCommonMeta($cred_limit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_cred_amt_META = createCommonMeta($ttl_cred_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_bal_META = createCommonMeta($cred_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_ym_META = createCommonMeta($ttl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ttl_ym_ap_META = createCommonMeta($ttl_ym_ap, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ttl_end_bal_META = createCommonMeta($ttl_end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_init_bal_META = createCommonMeta($ttl_init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_sls_META = createCommonMeta($ttl_sls, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_rcv_META = createCommonMeta($ttl_rcv, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_adv_META = createCommonMeta($ttl_adv, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_init_bal_ap_META = createCommonMeta($ttl_init_bal_ap, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_purc_META = createCommonMeta($ttl_purc, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_pay_META = createCommonMeta($ttl_pay, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_adv_pay_META = createCommonMeta($ttl_adv_pay, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_note_META = createCommonMeta($not_appl_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_adv_note_META = createCommonMeta($not_appl_adv_note, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_backord_META = createCommonMeta($ttl_backord, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_qtn_META = createCommonMeta($ttl_qtn, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_po_backord_META = createCommonMeta($ttl_po_backord, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_HdrRsltR> constMetas = new ConstMetaList<Srch01_HdrRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cred_cd_META,
			cred_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			cred_limit_META,
			ttl_cred_amt_META,
			cred_bal_META,
			ttl_ym_META,
			ttl_ym_ap_META,
			ttl_end_bal_META,
			ttl_init_bal_META,
			ttl_sls_META,
			ttl_rcv_META,
			ttl_adv_META,
			ttl_init_bal_ap_META,
			ttl_purc_META,
			ttl_pay_META,
			ttl_adv_pay_META,
			not_appl_note_META,
			not_appl_adv_note_META,
			ttl_backord_META,
			ttl_qtn_META,
			ttl_po_backord_META
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
	protected Srch01_HdrRsltR_MC_A(ConstMetaList<? extends Srch01_HdrRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrRsltR clone() {
		return (Srch01_HdrRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrRsltR createInstance() {
		return (Srch01_HdrRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_HdrRsltR getValues(String... names) {
		return (Srch01_HdrRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 0, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 0, $cred_cd, value);
	}


	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public String cred_nm() {
		return getConstString(offset + 1, $cred_nm);
	}

	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public void cred_nm(String value) {
		setConstString(offset + 1, $cred_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 2, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 2, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 3, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 3, $cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 4, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}


	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public MCNumber cred_limit() {
		return getConstNumber(offset + 5, $cred_limit);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(MCNumber value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(int value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(long value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(float value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(double value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}


	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public MCNumber ttl_cred_amt() {
		return getConstNumber(offset + 6, $ttl_cred_amt);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(MCNumber value) {
		setConstNumber(offset + 6, $ttl_cred_amt, value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(int value) {
		setConstNumber(offset + 6, $ttl_cred_amt, value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(long value) {
		setConstNumber(offset + 6, $ttl_cred_amt, value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(float value) {
		setConstNumber(offset + 6, $ttl_cred_amt, value);
	}

	/**
	 * Total credit target amount breakdown 与信対象額合計.<p>
	 *
	 */
	public void ttl_cred_amt(double value) {
		setConstNumber(offset + 6, $ttl_cred_amt, value);
	}


	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public MCNumber cred_bal() {
		return getConstNumber(offset + 7, $cred_bal);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(MCNumber value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(int value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(long value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(float value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(double value) {
		setConstNumber(offset + 7, $cred_bal, value);
	}


	/**
	 * Current month 当月.<p>
	 *
	 */
	public MCDate ttl_ym() {
		return getConstDate(offset + 8, $ttl_ym);
	}

	/**
	 * Current month 当月.<p>
	 *
	 */
	public void ttl_ym(MCDate value) {
		setConstDate(offset + 8, $ttl_ym, value);
	}


	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public MCDate ttl_ym_ap() {
		return getConstDate(offset + 9, $ttl_ym_ap);
	}

	/**
	 * Current month (AP) 当月（買掛）.<p>
	 *
	 */
	public void ttl_ym_ap(MCDate value) {
		setConstDate(offset + 9, $ttl_ym_ap, value);
	}


	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public MCNumber ttl_end_bal() {
		return getConstNumber(offset + 10, $ttl_end_bal);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(MCNumber value) {
		setConstNumber(offset + 10, $ttl_end_bal, value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(int value) {
		setConstNumber(offset + 10, $ttl_end_bal, value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(long value) {
		setConstNumber(offset + 10, $ttl_end_bal, value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(float value) {
		setConstNumber(offset + 10, $ttl_end_bal, value);
	}

	/**
	 * Total balance of current month 当月残高合計.<p>
	 *
	 */
	public void ttl_end_bal(double value) {
		setConstNumber(offset + 10, $ttl_end_bal, value);
	}


	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public MCNumber ttl_init_bal() {
		return getConstNumber(offset + 11, $ttl_init_bal);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(MCNumber value) {
		setConstNumber(offset + 11, $ttl_init_bal, value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(int value) {
		setConstNumber(offset + 11, $ttl_init_bal, value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(long value) {
		setConstNumber(offset + 11, $ttl_init_bal, value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(float value) {
		setConstNumber(offset + 11, $ttl_init_bal, value);
	}

	/**
	 * Total AR balance of previous month 前月売掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal(double value) {
		setConstNumber(offset + 11, $ttl_init_bal, value);
	}


	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public MCNumber ttl_sls() {
		return getConstNumber(offset + 12, $ttl_sls);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(MCNumber value) {
		setConstNumber(offset + 12, $ttl_sls, value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(int value) {
		setConstNumber(offset + 12, $ttl_sls, value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(long value) {
		setConstNumber(offset + 12, $ttl_sls, value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(float value) {
		setConstNumber(offset + 12, $ttl_sls, value);
	}

	/**
	 * Total tax included sales amount of current month 当月税込売上額合計.<p>
	 *
	 */
	public void ttl_sls(double value) {
		setConstNumber(offset + 12, $ttl_sls, value);
	}


	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public MCNumber ttl_rcv() {
		return getConstNumber(offset + 13, $ttl_rcv);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(MCNumber value) {
		setConstNumber(offset + 13, $ttl_rcv, value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(int value) {
		setConstNumber(offset + 13, $ttl_rcv, value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(long value) {
		setConstNumber(offset + 13, $ttl_rcv, value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(float value) {
		setConstNumber(offset + 13, $ttl_rcv, value);
	}

	/**
	 * Total payment received amount of the month 当月入金額合計.<p>
	 *
	 */
	public void ttl_rcv(double value) {
		setConstNumber(offset + 13, $ttl_rcv, value);
	}


	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public MCNumber ttl_adv() {
		return getConstNumber(offset + 14, $ttl_adv);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(MCNumber value) {
		setConstNumber(offset + 14, $ttl_adv, value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(int value) {
		setConstNumber(offset + 14, $ttl_adv, value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(long value) {
		setConstNumber(offset + 14, $ttl_adv, value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(float value) {
		setConstNumber(offset + 14, $ttl_adv, value);
	}

	/**
	 * Total advance received balance 前受金額残高合計.<p>
	 *
	 */
	public void ttl_adv(double value) {
		setConstNumber(offset + 14, $ttl_adv, value);
	}


	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public MCNumber ttl_init_bal_ap() {
		return getConstNumber(offset + 15, $ttl_init_bal_ap);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(MCNumber value) {
		setConstNumber(offset + 15, $ttl_init_bal_ap, value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(int value) {
		setConstNumber(offset + 15, $ttl_init_bal_ap, value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(long value) {
		setConstNumber(offset + 15, $ttl_init_bal_ap, value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(float value) {
		setConstNumber(offset + 15, $ttl_init_bal_ap, value);
	}

	/**
	 * Total AP balance of previous month 前月買掛金残高合計.<p>
	 *
	 */
	public void ttl_init_bal_ap(double value) {
		setConstNumber(offset + 15, $ttl_init_bal_ap, value);
	}


	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public MCNumber ttl_purc() {
		return getConstNumber(offset + 16, $ttl_purc);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(MCNumber value) {
		setConstNumber(offset + 16, $ttl_purc, value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(int value) {
		setConstNumber(offset + 16, $ttl_purc, value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(long value) {
		setConstNumber(offset + 16, $ttl_purc, value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(float value) {
		setConstNumber(offset + 16, $ttl_purc, value);
	}

	/**
	 * Total tax included purchase amount of current month 当月税込仕入額合計.<p>
	 *
	 */
	public void ttl_purc(double value) {
		setConstNumber(offset + 16, $ttl_purc, value);
	}


	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public MCNumber ttl_pay() {
		return getConstNumber(offset + 17, $ttl_pay);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(MCNumber value) {
		setConstNumber(offset + 17, $ttl_pay, value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(int value) {
		setConstNumber(offset + 17, $ttl_pay, value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(long value) {
		setConstNumber(offset + 17, $ttl_pay, value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(float value) {
		setConstNumber(offset + 17, $ttl_pay, value);
	}

	/**
	 * Total payment amount (Current month) 当月支払額合計.<p>
	 *
	 */
	public void ttl_pay(double value) {
		setConstNumber(offset + 17, $ttl_pay, value);
	}


	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public MCNumber ttl_adv_pay() {
		return getConstNumber(offset + 18, $ttl_adv_pay);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(MCNumber value) {
		setConstNumber(offset + 18, $ttl_adv_pay, value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(int value) {
		setConstNumber(offset + 18, $ttl_adv_pay, value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(long value) {
		setConstNumber(offset + 18, $ttl_adv_pay, value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(float value) {
		setConstNumber(offset + 18, $ttl_adv_pay, value);
	}

	/**
	 * Total advance payment balance 前渡金額残高合計.<p>
	 *
	 */
	public void ttl_adv_pay(double value) {
		setConstNumber(offset + 18, $ttl_adv_pay, value);
	}


	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public MCNumber not_appl_note() {
		return getConstNumber(offset + 19, $not_appl_note);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(MCNumber value) {
		setConstNumber(offset + 19, $not_appl_note, value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(int value) {
		setConstNumber(offset + 19, $not_appl_note, value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(long value) {
		setConstNumber(offset + 19, $not_appl_note, value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(float value) {
		setConstNumber(offset + 19, $not_appl_note, value);
	}

	/**
	 * Total outstanding notes 未決済手形合計.<p>
	 *
	 */
	public void not_appl_note(double value) {
		setConstNumber(offset + 19, $not_appl_note, value);
	}


	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public MCNumber not_appl_adv_note() {
		return getConstNumber(offset + 20, $not_appl_adv_note);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(MCNumber value) {
		setConstNumber(offset + 20, $not_appl_adv_note, value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(int value) {
		setConstNumber(offset + 20, $not_appl_adv_note, value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(long value) {
		setConstNumber(offset + 20, $not_appl_adv_note, value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(float value) {
		setConstNumber(offset + 20, $not_appl_adv_note, value);
	}

	/**
	 * Total advance received outstanding notes 前受未決済手形合計.<p>
	 *
	 */
	public void not_appl_adv_note(double value) {
		setConstNumber(offset + 20, $not_appl_adv_note, value);
	}


	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public MCNumber ttl_backord() {
		return getConstNumber(offset + 21, $ttl_backord);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(MCNumber value) {
		setConstNumber(offset + 21, $ttl_backord, value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(int value) {
		setConstNumber(offset + 21, $ttl_backord, value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(long value) {
		setConstNumber(offset + 21, $ttl_backord, value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(float value) {
		setConstNumber(offset + 21, $ttl_backord, value);
	}

	/**
	 * Total order backlog amount 受注残額合計.<p>
	 *
	 */
	public void ttl_backord(double value) {
		setConstNumber(offset + 21, $ttl_backord, value);
	}


	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public MCNumber ttl_qtn() {
		return getConstNumber(offset + 22, $ttl_qtn);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(MCNumber value) {
		setConstNumber(offset + 22, $ttl_qtn, value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(int value) {
		setConstNumber(offset + 22, $ttl_qtn, value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(long value) {
		setConstNumber(offset + 22, $ttl_qtn, value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(float value) {
		setConstNumber(offset + 22, $ttl_qtn, value);
	}

	/**
	 * Total remaining quotation amount 見積残額合計.<p>
	 *
	 */
	public void ttl_qtn(double value) {
		setConstNumber(offset + 22, $ttl_qtn, value);
	}


	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public MCNumber ttl_po_backord() {
		return getConstNumber(offset + 23, $ttl_po_backord);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(MCNumber value) {
		setConstNumber(offset + 23, $ttl_po_backord, value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(int value) {
		setConstNumber(offset + 23, $ttl_po_backord, value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(long value) {
		setConstNumber(offset + 23, $ttl_po_backord, value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(float value) {
		setConstNumber(offset + 23, $ttl_po_backord, value);
	}

	/**
	 * Total remaining PO amount 発注残額合計.<p>
	 *
	 */
	public void ttl_po_backord(double value) {
		setConstNumber(offset + 23, $ttl_po_backord, value);
	}


	public String getString(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			return cred_limit();
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			return ttl_cred_amt();
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			return cred_bal();
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			return ttl_end_bal();
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			return ttl_init_bal();
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			return ttl_sls();
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			return ttl_rcv();
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			return ttl_adv();
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			return ttl_init_bal_ap();
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			return ttl_purc();
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			return ttl_pay();
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			return ttl_adv_pay();
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			return not_appl_note();
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			return not_appl_adv_note();
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			return ttl_backord();
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			return ttl_qtn();
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			return ttl_po_backord();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			return ttl_ym();
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			return ttl_ym_ap();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			return cred_limit();
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			return ttl_cred_amt();
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			return cred_bal();
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			return ttl_end_bal();
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			return ttl_init_bal();
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			return ttl_sls();
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			return ttl_rcv();
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			return ttl_adv();
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			return ttl_init_bal_ap();
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			return ttl_purc();
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			return ttl_pay();
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			return ttl_adv_pay();
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			return not_appl_note();
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			return not_appl_adv_note();
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			return ttl_backord();
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			return ttl_qtn();
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			return ttl_po_backord();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			return ttl_ym();
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			return ttl_ym_ap();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			ttl_ym(value);
			return;
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			ttl_ym_ap(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($ttl_cred_amt.equalsIgnoreCase(name)) {
			ttl_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($ttl_end_bal.equalsIgnoreCase(name)) {
			ttl_end_bal(value);
			return;
		}
		if ($ttl_init_bal.equalsIgnoreCase(name)) {
			ttl_init_bal(value);
			return;
		}
		if ($ttl_sls.equalsIgnoreCase(name)) {
			ttl_sls(value);
			return;
		}
		if ($ttl_rcv.equalsIgnoreCase(name)) {
			ttl_rcv(value);
			return;
		}
		if ($ttl_adv.equalsIgnoreCase(name)) {
			ttl_adv(value);
			return;
		}
		if ($ttl_init_bal_ap.equalsIgnoreCase(name)) {
			ttl_init_bal_ap(value);
			return;
		}
		if ($ttl_purc.equalsIgnoreCase(name)) {
			ttl_purc(value);
			return;
		}
		if ($ttl_pay.equalsIgnoreCase(name)) {
			ttl_pay(value);
			return;
		}
		if ($ttl_adv_pay.equalsIgnoreCase(name)) {
			ttl_adv_pay(value);
			return;
		}
		if ($not_appl_note.equalsIgnoreCase(name)) {
			not_appl_note(value);
			return;
		}
		if ($not_appl_adv_note.equalsIgnoreCase(name)) {
			not_appl_adv_note(value);
			return;
		}
		if ($ttl_backord.equalsIgnoreCase(name)) {
			ttl_backord(value);
			return;
		}
		if ($ttl_qtn.equalsIgnoreCase(name)) {
			ttl_qtn(value);
			return;
		}
		if ($ttl_po_backord.equalsIgnoreCase(name)) {
			ttl_po_backord(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ttl_ym.equalsIgnoreCase(name)) {
			ttl_ym(value);
			return;
		}
		if ($ttl_ym_ap.equalsIgnoreCase(name)) {
			ttl_ym_ap(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

