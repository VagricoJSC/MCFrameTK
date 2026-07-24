package mcframe.serverMSBH.MSBHL5030;

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
 * ブロック"PaySchd_Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchd_Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	public static final String $pay_schd = "pay_schd";
	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_rate = "trd_cur_com_paid_tax_rate";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public static final String $ap_sttl_nm = "ap_sttl_nm";
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public static final String $ap_sttl_typ_nm = "ap_sttl_typ_nm";
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_nm = "trd_cur_com_paid_tax_nm";
	/**
	 * Fee tax type 手数料税区分.<p>
	 *
	 */
	public static final String $trd_cur_com_paid_tax_typ = "trd_cur_com_paid_tax_typ";
	/**
	 * Offset destination type name 相殺先区分名.<p>
	 *
	 */
	public static final String $ap_setoff_typ_nm = "ap_setoff_typ_nm";
	/**
	 * Offset destination dept. name 相殺先部門名.<p>
	 *
	 */
	public static final String $so_dpt_nm = "so_dpt_nm";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public static final String $pay_dpt_nm = "pay_dpt_nm";
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ap_d_no = "ap_d_no";
	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public static final String $ap_setoff_act_flg = "ap_setoff_act_flg";

	public static final String $asppl_cd = $pay_schd + ".asppl_cd";
	public static final String $ap_dpt_cd = $pay_schd + ".ap_dpt_cd";
	public static final String $pay_dpt_cd = $pay_schd + ".pay_dpt_cd";
	public static final String $ap_typ = $pay_schd + ".ap_typ";
	public static final String $ap_sttl_cd = $pay_schd + ".ap_sttl_cd";
	public static final String $ap_sttl_typ = $pay_schd + ".ap_sttl_typ";
	public static final String $pay_schd_dt = $pay_schd + ".pay_schd_dt";
	public static final String $pay_bank_ac_cd = $pay_schd + ".pay_bank_ac_cd";
	public static final String $bank_ac_cd = $pay_schd + ".bank_ac_cd";
	public static final String $ap_setoff_typ = $pay_schd + ".ap_setoff_typ";
	public static final String $xrate = $pay_schd + ".xrate";
	public static final String $setoff_cd = $pay_schd + ".setoff_cd";
	public static final String $setoff_nm = $pay_schd + ".setoff_nm";
	public static final String $so_dpt_cd = $pay_schd + ".so_dpt_cd";
	public static final String $trd_cur_amt = $pay_schd + ".trd_cur_amt";
	public static final String $trd_cur_com_paid_tax_cd = $pay_schd + ".trd_cur_com_paid_tax_cd";

	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pay_schd_META = createInnerRowMeta($pay_schd, mcframe.serverMS.dbc.MST_PAY_SCHD_R.class);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_com_paid_tax_rate_META = createCommonMeta($trd_cur_com_paid_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ap_sttl_nm_META = createCommonMeta($ap_sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta trd_cur_com_paid_tax_nm_META = createCommonMeta($trd_cur_com_paid_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta trd_cur_com_paid_tax_typ_META = createCommonMeta($trd_cur_com_paid_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta ap_setoff_typ_nm_META = createCommonMeta($ap_setoff_typ_nm, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP_NM);
	public static final MCMeta so_dpt_nm_META = createCommonMeta($so_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_dpt_nm_META = createCommonMeta($pay_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta ap_setoff_act_flg_META = createCommonMeta($ap_setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<PaySchd_Srch01_RsltR> constMetas = new ConstMetaList<PaySchd_Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			pay_schd_META,
			pay_xrate_META,
			trd_cur_com_paid_tax_rate_META,
			base_cur_amt_META,
			ap_sttl_nm_META,
			ap_sttl_typ_nm_META,
			pay_bank_ac_nm_META,
			bank_ac_nm_META,
			trd_cur_com_paid_tax_nm_META,
			trd_cur_com_paid_tax_typ_META,
			ap_setoff_typ_nm_META,
			so_dpt_nm_META,
			asppl_nm_META,
			ap_dpt_nm_META,
			pay_dpt_nm_META,
			ap_typ_nm_META,
			ap_d_no_META,
			ap_setoff_act_flg_META
		},
		new String[][]{
			{
				"asppl_cd",
				"ap_dpt_cd",
				"pay_dpt_cd",
				"ap_typ",
				"ap_sttl_cd",
				"ap_sttl_typ",
				"pay_schd_dt",
				"pay_bank_ac_cd",
				"bank_ac_cd",
				"ap_setoff_typ",
				"xrate",
				"setoff_cd",
				"setoff_nm",
				"so_dpt_cd",
				"trd_cur_amt",
				"trd_cur_com_paid_tax_cd"
			},
			{
				$asppl_cd,
				$ap_dpt_cd,
				$pay_dpt_cd,
				$ap_typ,
				$ap_sttl_cd,
				$ap_sttl_typ,
				$pay_schd_dt,
				$pay_bank_ac_cd,
				$bank_ac_cd,
				$ap_setoff_typ,
				$xrate,
				$setoff_cd,
				$setoff_nm,
				$so_dpt_cd,
				$trd_cur_amt,
				$trd_cur_com_paid_tax_cd
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
				{$pay_schd + ".ap_typ", "MAC_AP_TYP"},	// pay_schd.ap_typ
				{$pay_schd + ".ap_sttl_typ", "MAC_AP_STTL_TYP"},	// pay_schd.ap_sttl_typ
				{$pay_schd + ".ap_setoff_typ", "MAC_AP_SETOFF_TYP"}	// pay_schd.ap_setoff_typ
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
	protected PaySchd_Srch01_RsltR_MC_A(ConstMetaList<? extends PaySchd_Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch01_RsltR clone() {
		return (PaySchd_Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch01_RsltR createInstance() {
		return (PaySchd_Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchd_Srch01_RsltR getValues(String... names) {
		return (PaySchd_Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_PAY_SCHD_R pay_schd(){
		return (mcframe.serverMS.dbc.MST_PAY_SCHD_R) getConstInnerRow(offset + 1, $pay_schd);
	}
	
	public void pay_schd(mcframe.serverMS.dbc.MST_PAY_SCHD_R row){
		setConstInnerRow(offset + 1, $pay_schd, row);
	}


	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 2, $pay_xrate);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 2, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 2, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 2, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 2, $pay_xrate, value);
	}

	/**
	 * Payment collation exchange rate 支払照合為替レート.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 2, $pay_xrate, value);
	}


	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public MCNumber trd_cur_com_paid_tax_rate() {
		return getConstNumber(offset + 3, $trd_cur_com_paid_tax_rate);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(MCNumber value) {
		setConstNumber(offset + 3, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(int value) {
		setConstNumber(offset + 3, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(long value) {
		setConstNumber(offset + 3, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(float value) {
		setConstNumber(offset + 3, $trd_cur_com_paid_tax_rate, value);
	}

	/**
	 * Fee tax rate 手数料税率.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_rate(double value) {
		setConstNumber(offset + 3, $trd_cur_com_paid_tax_rate, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 4, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 4, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 4, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 4, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 4, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 4, $base_cur_amt, value);
	}


	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public String ap_sttl_nm() {
		return getConstString(offset + 5, $ap_sttl_nm);
	}

	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public void ap_sttl_nm(String value) {
		setConstString(offset + 5, $ap_sttl_nm, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 6, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 6, $ap_sttl_typ_nm, value);
	}


	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 7, $pay_bank_ac_nm);
	}

	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 7, $pay_bank_ac_nm, value);
	}


	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 8, $bank_ac_nm);
	}

	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 8, $bank_ac_nm, value);
	}


	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_nm() {
		return getConstString(offset + 9, $trd_cur_com_paid_tax_nm);
	}

	/**
	 * Fee tax name 手数料税名.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_nm(String value) {
		setConstString(offset + 9, $trd_cur_com_paid_tax_nm, value);
	}


	/**
	 * Fee tax type 手数料税区分.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_typ() {
		return getConstString(offset + 10, $trd_cur_com_paid_tax_typ);
	}

	/**
	 * Fee tax type 手数料税区分.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_typ(String value) {
		setConstString(offset + 10, $trd_cur_com_paid_tax_typ, value);
	}


	/**
	 * Offset destination type name 相殺先区分名.<p>
	 *
	 */
	public String ap_setoff_typ_nm() {
		return getConstString(offset + 11, $ap_setoff_typ_nm);
	}

	/**
	 * Offset destination type name 相殺先区分名.<p>
	 *
	 */
	public void ap_setoff_typ_nm(String value) {
		setConstString(offset + 11, $ap_setoff_typ_nm, value);
	}


	/**
	 * Offset destination dept. name 相殺先部門名.<p>
	 *
	 */
	public String so_dpt_nm() {
		return getConstString(offset + 12, $so_dpt_nm);
	}

	/**
	 * Offset destination dept. name 相殺先部門名.<p>
	 *
	 */
	public void so_dpt_nm(String value) {
		setConstString(offset + 12, $so_dpt_nm, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 13, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 13, $asppl_nm, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 14, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 14, $ap_dpt_nm, value);
	}


	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public String pay_dpt_nm() {
		return getConstString(offset + 15, $pay_dpt_nm);
	}

	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public void pay_dpt_nm(String value) {
		setConstString(offset + 15, $pay_dpt_nm, value);
	}


	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 16, $ap_typ_nm);
	}

	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 16, $ap_typ_nm, value);
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 17, $ap_d_no);
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 17, $ap_d_no, value);
	}


	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public boolean ap_setoff_act_flg() {
		return getConstBoolean(offset + 18, $ap_setoff_act_flg);
	}

	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public void ap_setoff_act_flg(boolean value) {
		setConstBoolean(offset + 18, $ap_setoff_act_flg, value);
	}


	public String getString(String name) {
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($trd_cur_com_paid_tax_typ.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			return ap_sttl_nm();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_nm();
		}
		if ($trd_cur_com_paid_tax_typ.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			return so_dpt_nm();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			return pay_dpt_nm();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			return trd_cur_com_paid_tax_rate();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
			return;
		}
		if ($trd_cur_com_paid_tax_typ.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			so_dpt_nm(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_sttl_nm.equalsIgnoreCase(name)) {
			ap_sttl_nm(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($trd_cur_com_paid_tax_nm.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_nm(value);
			return;
		}
		if ($trd_cur_com_paid_tax_typ.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($so_dpt_nm.equalsIgnoreCase(name)) {
			so_dpt_nm(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($pay_dpt_nm.equalsIgnoreCase(name)) {
			pay_dpt_nm(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($trd_cur_com_paid_tax_rate.equalsIgnoreCase(name)) {
			trd_cur_com_paid_tax_rate(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pay_schd.equalsIgnoreCase(name)) {
			return pay_schd();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pay_schd.equalsIgnoreCase(name)) {
			pay_schd(
				((MCContainerMeta) pay_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_PAY_SCHD_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return pay_schd().asppl_cd();
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		pay_schd().asppl_cd(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return pay_schd().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		pay_schd().ap_dpt_cd(value);
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public String pay_dpt_cd() {
		return pay_schd().pay_dpt_cd();
	}

	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		pay_schd().pay_dpt_cd(value);
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return pay_schd().ap_typ();
	}

	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		pay_schd().ap_typ(value);
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public String ap_sttl_cd() {
		return pay_schd().ap_sttl_cd();
	}

	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public void ap_sttl_cd(String value) {
		pay_schd().ap_sttl_cd(value);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return pay_schd().ap_sttl_typ();
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		pay_schd().ap_sttl_typ(value);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return pay_schd().pay_schd_dt();
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		pay_schd().pay_schd_dt(value);
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return pay_schd().pay_bank_ac_cd();
	}

	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		pay_schd().pay_bank_ac_cd(value);
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public String bank_ac_cd() {
		return pay_schd().bank_ac_cd();
	}

	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		pay_schd().bank_ac_cd(value);
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return pay_schd().ap_setoff_typ();
	}

	/**
	 * Offset destination type 相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		pay_schd().ap_setoff_typ(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return pay_schd().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		pay_schd().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		pay_schd().xrate(value);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return pay_schd().setoff_cd();
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		pay_schd().setoff_cd(value);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_nm() {
		return pay_schd().setoff_nm();
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_nm(String value) {
		pay_schd().setoff_nm(value);
	}

	/**
	 * Offset destination dept. cd. 相殺先部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return pay_schd().so_dpt_cd();
	}

	/**
	 * Offset destination dept. cd. 相殺先部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		pay_schd().so_dpt_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return pay_schd().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		pay_schd().trd_cur_amt(value);
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public String trd_cur_com_paid_tax_cd() {
		return pay_schd().trd_cur_com_paid_tax_cd();
	}

	/**
	 * Fee tax cd. 手数料税ＣＤ.<p>
	 *
	 */
	public void trd_cur_com_paid_tax_cd(String value) {
		pay_schd().trd_cur_com_paid_tax_cd(value);
	}

}

