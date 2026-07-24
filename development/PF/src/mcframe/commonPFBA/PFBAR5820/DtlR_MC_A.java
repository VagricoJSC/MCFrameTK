package mcframe.commonPFBA.PFBAR5820;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  連番.<p>
	 *
	 */
	public static final String $seq = "seq";
	/**
	 *  会社ＣＤ.<p>
	 *
	 * BUKRS
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  仕訳タイプ.<p>
	 *
	 * BLART
	 */
	public static final String $ac_doc_typ = "ac_doc_typ";
	/**
	 *  仕訳日付.<p>
	 *
	 * BLDAT
	 */
	public static final String $doc_dt = "doc_dt";
	/**
	 *  転記日付.<p>
	 *
	 * BUDAT
	 */
	public static final String $posting_dt = "posting_dt";
	/**
	 *  会計期間.<p>
	 *
	 * MONAT
	 */
	public static final String $fiscal_period = "fiscal_period";
	/**
	 *  伝票ヘッダテキスト.<p>
	 *
	 * BKTXT
	 */
	public static final String $doc_header_text = "doc_header_text";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 * WAERS
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  元帳グループ.<p>
	 *
	 * LDGRP
	 */
	public static final String $ledger_group = "ledger_group";
	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public static final String $xrate = "xrate";
	/**
	 *  外貨換算日付.<p>
	 *
	 * WWERT
	 */
	public static final String $xrate_dt = "xrate_dt";
	/**
	 *  参照伝票番号.<p>
	 *
	 * XBLNR
	 */
	public static final String $doc_ref_id = "doc_ref_id";
	/**
	 *  パートナ事業領域.<p>
	 *
	 * PARGB_HDR
	 */
	public static final String $partner_bussinnss_area = "partner_bussinnss_area";
	/**
	 *  税充足日付.<p>
	 *
	 * FULFILLDATE
	 */
	public static final String $tax_fulfillment_dt = "tax_fulfillment_dt";
	/**
	 *  税額自動計算.<p>
	 *
	 * XMWST
	 */
	public static final String $tax_auto_calc = "tax_auto_calc";
	/**
	 *  明細会社ＣＤ.<p>
	 *
	 * TO_BUKRS
	 */
	public static final String $dtl_co_cd = "dtl_co_cd";
	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 * HKONT
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 *  明細テキスト.<p>
	 *
	 * SGTXT
	 */
	public static final String $doc_itm_text = "doc_itm_text";
	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public static final String $debtor_amt = "debtor_amt";
	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public static final String $creditor_amt = "creditor_amt";
	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public static final String $local_cur2_amt = "local_cur2_amt";
	/**
	 *  税ＣＤ.<p>
	 *
	 * MWSKZ
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 *  税管轄.<p>
	 *
	 * TXJCD
	 */
	public static final String $tax_jurisdiction = "tax_jurisdiction";
	/**
	 *  原価センタ.<p>
	 *
	 * KOSTL
	 */
	public static final String $cost_center = "cost_center";
	/**
	 *  利益センタ.<p>
	 *
	 * PRCTR
	 */
	public static final String $profit_center = "profit_center";
	/**
	 *  指図番号.<p>
	 *
	 * AUFNR
	 */
	public static final String $order_id = "order_id";
	/**
	 *  ＷＢＳ要素.<p>
	 *
	 * PS_POSID
	 */
	public static final String $wbs_element = "wbs_element";
	/**
	 *  起算日.<p>
	 *
	 * VALUT
	 */
	public static final String $cur_translation_dt = "cur_translation_dt";
	/**
	 *  銀行ＣＤ.<p>
	 *
	 * HBKID
	 */
	public static final String $bank_cd = "bank_cd";
	/**
	 *  口座ＣＤ.<p>
	 *
	 * HKTID
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	/**
	 *  ソートキー.<p>
	 *
	 * ZUONR
	 */
	public static final String $assignment_reference = "assignment_reference";
	/**
	 *  取引パートナ.<p>
	 *
	 * VBUND
	 */
	public static final String $trading_partner = "trading_partner";
	/**
	 *  セグメント.<p>
	 *
	 * SEGMENT
	 */
	public static final String $segment = "segment";
	/**
	 *  得意先ＣＤ.<p>
	 *
	 * PROF_KNDNR
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 *  品目ＣＤ.<p>
	 *
	 * PROF_ARTNR
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  請求先ＣＤ.<p>
	 *
	 * PROF_KUNRE
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public static final String $tax_base_trd_cur_amt = "tax_base_trd_cur_amt";
	/**
	 *  品目分類ＣＤ.<p>
	 *
	 * PROF_MATKL
	 */
	public static final String $itm_grp_cd = "itm_grp_cd";


	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.SEQ);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ac_doc_typ_META = createCommonMeta($ac_doc_typ, mcframe.commonMA.meta.MA_META.AC_DOC_TYP);
	public static final MCMeta doc_dt_META = createCommonMeta($doc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta posting_dt_META = createCommonMeta($posting_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fiscal_period_META = createCommonMeta($fiscal_period, mcframe.commonMA.meta.MA_META.FISCAL_PERIOD);
	public static final MCMeta doc_header_text_META = createCommonMeta($doc_header_text, mcframe.commonMA.meta.MA_META.DOC_HEADER_TEXT);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ledger_group_META = createCommonMeta($ledger_group, mcframe.commonMA.meta.MA_META.LEDGER_GROUP);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_dt_META = createCommonMeta($xrate_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta doc_ref_id_META = createCommonMeta($doc_ref_id, mcframe.commonMA.meta.MA_META.DOC_REF_ID);
	public static final MCMeta partner_bussinnss_area_META = createCommonMeta($partner_bussinnss_area, mcframe.commonMA.meta.MA_META.PARTNER_BUSINESS_AREA);
	public static final MCMeta tax_fulfillment_dt_META = createCommonMeta($tax_fulfillment_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta tax_auto_calc_META = createCommonMeta($tax_auto_calc, mcframe.commonMA.meta.MA_META.TAX_AUTO_CALC);
	public static final MCMeta dtl_co_cd_META = createCommonMeta($dtl_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta doc_itm_text_META = createCommonMeta($doc_itm_text, mcframe.commonMA.meta.MA_META.DOC_ITM_TEXT);
	public static final MCMeta debtor_amt_META = createCommonMeta($debtor_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta creditor_amt_META = createCommonMeta($creditor_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta local_cur2_amt_META = createCommonMeta($local_cur2_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_jurisdiction_META = createCommonMeta($tax_jurisdiction, mcframe.commonMA.meta.MA_META.TAX_JURISDICTION);
	public static final MCMeta cost_center_META = createCommonMeta($cost_center, mcframe.commonMA.meta.MA_META.COST_CENTER);
	public static final MCMeta profit_center_META = createCommonMeta($profit_center, mcframe.commonMA.meta.MA_META.PROFIT_CENTER);
	public static final MCMeta order_id_META = createCommonMeta($order_id, mcframe.commonMA.meta.MA_META.ORDER_ID);
	public static final MCMeta wbs_element_META = createCommonMeta($wbs_element, mcframe.commonMA.meta.MA_META.WBS_ELEMENT);
	public static final MCMeta cur_translation_dt_META = createCommonMeta($cur_translation_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta assignment_reference_META = createCommonMeta($assignment_reference, mcframe.commonMA.meta.MA_META.ASSIGNMENT_REFERENCE);
	public static final MCMeta trading_partner_META = createCommonMeta($trading_partner, mcframe.commonMA.meta.MA_META.TRADING_PARTNER);
	public static final MCMeta segment_META = createCommonMeta($segment, mcframe.commonMA.meta.MA_META.SEGMENT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tax_base_trd_cur_amt_META = createCommonMeta($tax_base_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			seq_META,
			co_cd_META,
			ac_doc_typ_META,
			doc_dt_META,
			posting_dt_META,
			fiscal_period_META,
			doc_header_text_META,
			trd_cur_cd_META,
			ledger_group_META,
			xrate_META,
			xrate_dt_META,
			doc_ref_id_META,
			partner_bussinnss_area_META,
			tax_fulfillment_dt_META,
			tax_auto_calc_META,
			dtl_co_cd_META,
			ac_cd_META,
			doc_itm_text_META,
			debtor_amt_META,
			creditor_amt_META,
			base_cur_amt_META,
			local_cur2_amt_META,
			tax_cd_META,
			tax_jurisdiction_META,
			cost_center_META,
			profit_center_META,
			order_id_META,
			wbs_element_META,
			cur_translation_dt_META,
			bank_cd_META,
			bank_ac_cd_META,
			assignment_reference_META,
			trading_partner_META,
			segment_META,
			cst_cd_META,
			itm_cd_META,
			bcst_cd_META,
			tax_base_trd_cur_amt_META,
			itm_grp_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  連番.<p>
	 *
	 */
	public String seq() {
		return getConstString(offset + 0, $seq);
	}

	/**
	 *  連番.<p>
	 *
	 */
	public void seq(String value) {
		setConstString(offset + 0, $seq, value);
	}


	/**
	 *  会社ＣＤ.<p>
	 *
	 * BUKRS
	 */
	public String co_cd() {
		return getConstString(offset + 1, $co_cd);
	}

	/**
	 *  会社ＣＤ.<p>
	 *
	 * BUKRS
	 */
	public void co_cd(String value) {
		setConstString(offset + 1, $co_cd, value);
	}


	/**
	 *  仕訳タイプ.<p>
	 *
	 * BLART
	 */
	public String ac_doc_typ() {
		return getConstString(offset + 2, $ac_doc_typ);
	}

	/**
	 *  仕訳タイプ.<p>
	 *
	 * BLART
	 */
	public void ac_doc_typ(String value) {
		setConstString(offset + 2, $ac_doc_typ, value);
	}


	/**
	 *  仕訳日付.<p>
	 *
	 * BLDAT
	 */
	public MCDate doc_dt() {
		return getConstDate(offset + 3, $doc_dt);
	}

	/**
	 *  仕訳日付.<p>
	 *
	 * BLDAT
	 */
	public void doc_dt(MCDate value) {
		setConstDate(offset + 3, $doc_dt, value);
	}


	/**
	 *  転記日付.<p>
	 *
	 * BUDAT
	 */
	public MCDate posting_dt() {
		return getConstDate(offset + 4, $posting_dt);
	}

	/**
	 *  転記日付.<p>
	 *
	 * BUDAT
	 */
	public void posting_dt(MCDate value) {
		setConstDate(offset + 4, $posting_dt, value);
	}


	/**
	 *  会計期間.<p>
	 *
	 * MONAT
	 */
	public String fiscal_period() {
		return getConstString(offset + 5, $fiscal_period);
	}

	/**
	 *  会計期間.<p>
	 *
	 * MONAT
	 */
	public void fiscal_period(String value) {
		setConstString(offset + 5, $fiscal_period, value);
	}


	/**
	 *  伝票ヘッダテキスト.<p>
	 *
	 * BKTXT
	 */
	public String doc_header_text() {
		return getConstString(offset + 6, $doc_header_text);
	}

	/**
	 *  伝票ヘッダテキスト.<p>
	 *
	 * BKTXT
	 */
	public void doc_header_text(String value) {
		setConstString(offset + 6, $doc_header_text, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 * WAERS
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 7, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 * WAERS
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 7, $trd_cur_cd, value);
	}


	/**
	 *  元帳グループ.<p>
	 *
	 * LDGRP
	 */
	public String ledger_group() {
		return getConstString(offset + 8, $ledger_group);
	}

	/**
	 *  元帳グループ.<p>
	 *
	 * LDGRP
	 */
	public void ledger_group(String value) {
		setConstString(offset + 8, $ledger_group, value);
	}


	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 9, $xrate);
	}

	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 9, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public void xrate(int value) {
		setConstNumber(offset + 9, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public void xrate(long value) {
		setConstNumber(offset + 9, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public void xrate(float value) {
		setConstNumber(offset + 9, $xrate, value);
	}

	/**
	 *  為替レート.<p>
	 *
	 * KURSF_EXT
	 */
	public void xrate(double value) {
		setConstNumber(offset + 9, $xrate, value);
	}


	/**
	 *  外貨換算日付.<p>
	 *
	 * WWERT
	 */
	public MCDate xrate_dt() {
		return getConstDate(offset + 10, $xrate_dt);
	}

	/**
	 *  外貨換算日付.<p>
	 *
	 * WWERT
	 */
	public void xrate_dt(MCDate value) {
		setConstDate(offset + 10, $xrate_dt, value);
	}


	/**
	 *  参照伝票番号.<p>
	 *
	 * XBLNR
	 */
	public String doc_ref_id() {
		return getConstString(offset + 11, $doc_ref_id);
	}

	/**
	 *  参照伝票番号.<p>
	 *
	 * XBLNR
	 */
	public void doc_ref_id(String value) {
		setConstString(offset + 11, $doc_ref_id, value);
	}


	/**
	 *  パートナ事業領域.<p>
	 *
	 * PARGB_HDR
	 */
	public String partner_bussinnss_area() {
		return getConstString(offset + 12, $partner_bussinnss_area);
	}

	/**
	 *  パートナ事業領域.<p>
	 *
	 * PARGB_HDR
	 */
	public void partner_bussinnss_area(String value) {
		setConstString(offset + 12, $partner_bussinnss_area, value);
	}


	/**
	 *  税充足日付.<p>
	 *
	 * FULFILLDATE
	 */
	public MCDate tax_fulfillment_dt() {
		return getConstDate(offset + 13, $tax_fulfillment_dt);
	}

	/**
	 *  税充足日付.<p>
	 *
	 * FULFILLDATE
	 */
	public void tax_fulfillment_dt(MCDate value) {
		setConstDate(offset + 13, $tax_fulfillment_dt, value);
	}


	/**
	 *  税額自動計算.<p>
	 *
	 * XMWST
	 */
	public String tax_auto_calc() {
		return getConstString(offset + 14, $tax_auto_calc);
	}

	/**
	 *  税額自動計算.<p>
	 *
	 * XMWST
	 */
	public void tax_auto_calc(String value) {
		setConstString(offset + 14, $tax_auto_calc, value);
	}


	/**
	 *  明細会社ＣＤ.<p>
	 *
	 * TO_BUKRS
	 */
	public String dtl_co_cd() {
		return getConstString(offset + 15, $dtl_co_cd);
	}

	/**
	 *  明細会社ＣＤ.<p>
	 *
	 * TO_BUKRS
	 */
	public void dtl_co_cd(String value) {
		setConstString(offset + 15, $dtl_co_cd, value);
	}


	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 * HKONT
	 */
	public String ac_cd() {
		return getConstString(offset + 16, $ac_cd);
	}

	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 * HKONT
	 */
	public void ac_cd(String value) {
		setConstString(offset + 16, $ac_cd, value);
	}


	/**
	 *  明細テキスト.<p>
	 *
	 * SGTXT
	 */
	public String doc_itm_text() {
		return getConstString(offset + 17, $doc_itm_text);
	}

	/**
	 *  明細テキスト.<p>
	 *
	 * SGTXT
	 */
	public void doc_itm_text(String value) {
		setConstString(offset + 17, $doc_itm_text, value);
	}


	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public MCNumber debtor_amt() {
		return getConstNumber(offset + 18, $debtor_amt);
	}

	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public void debtor_amt(MCNumber value) {
		setConstNumber(offset + 18, $debtor_amt, value);
	}

	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public void debtor_amt(int value) {
		setConstNumber(offset + 18, $debtor_amt, value);
	}

	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public void debtor_amt(long value) {
		setConstNumber(offset + 18, $debtor_amt, value);
	}

	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public void debtor_amt(float value) {
		setConstNumber(offset + 18, $debtor_amt, value);
	}

	/**
	 *  借方金額.<p>
	 *
	 * WRSOL
	 */
	public void debtor_amt(double value) {
		setConstNumber(offset + 18, $debtor_amt, value);
	}


	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public MCNumber creditor_amt() {
		return getConstNumber(offset + 19, $creditor_amt);
	}

	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public void creditor_amt(MCNumber value) {
		setConstNumber(offset + 19, $creditor_amt, value);
	}

	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public void creditor_amt(int value) {
		setConstNumber(offset + 19, $creditor_amt, value);
	}

	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public void creditor_amt(long value) {
		setConstNumber(offset + 19, $creditor_amt, value);
	}

	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public void creditor_amt(float value) {
		setConstNumber(offset + 19, $creditor_amt, value);
	}

	/**
	 *  貸方金額.<p>
	 *
	 * WRHAB
	 */
	public void creditor_amt(double value) {
		setConstNumber(offset + 19, $creditor_amt, value);
	}


	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 20, $base_cur_amt);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}

	/**
	 *  基準通貨金額.<p>
	 *
	 * DMBTR
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 20, $base_cur_amt, value);
	}


	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public MCNumber local_cur2_amt() {
		return getConstNumber(offset + 21, $local_cur2_amt);
	}

	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public void local_cur2_amt(MCNumber value) {
		setConstNumber(offset + 21, $local_cur2_amt, value);
	}

	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public void local_cur2_amt(int value) {
		setConstNumber(offset + 21, $local_cur2_amt, value);
	}

	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public void local_cur2_amt(long value) {
		setConstNumber(offset + 21, $local_cur2_amt, value);
	}

	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public void local_cur2_amt(float value) {
		setConstNumber(offset + 21, $local_cur2_amt, value);
	}

	/**
	 *  第二国内通貨金額.<p>
	 *
	 * DMBE2
	 */
	public void local_cur2_amt(double value) {
		setConstNumber(offset + 21, $local_cur2_amt, value);
	}


	/**
	 *  税ＣＤ.<p>
	 *
	 * MWSKZ
	 */
	public String tax_cd() {
		return getConstString(offset + 22, $tax_cd);
	}

	/**
	 *  税ＣＤ.<p>
	 *
	 * MWSKZ
	 */
	public void tax_cd(String value) {
		setConstString(offset + 22, $tax_cd, value);
	}


	/**
	 *  税管轄.<p>
	 *
	 * TXJCD
	 */
	public String tax_jurisdiction() {
		return getConstString(offset + 23, $tax_jurisdiction);
	}

	/**
	 *  税管轄.<p>
	 *
	 * TXJCD
	 */
	public void tax_jurisdiction(String value) {
		setConstString(offset + 23, $tax_jurisdiction, value);
	}


	/**
	 *  原価センタ.<p>
	 *
	 * KOSTL
	 */
	public String cost_center() {
		return getConstString(offset + 24, $cost_center);
	}

	/**
	 *  原価センタ.<p>
	 *
	 * KOSTL
	 */
	public void cost_center(String value) {
		setConstString(offset + 24, $cost_center, value);
	}


	/**
	 *  利益センタ.<p>
	 *
	 * PRCTR
	 */
	public String profit_center() {
		return getConstString(offset + 25, $profit_center);
	}

	/**
	 *  利益センタ.<p>
	 *
	 * PRCTR
	 */
	public void profit_center(String value) {
		setConstString(offset + 25, $profit_center, value);
	}


	/**
	 *  指図番号.<p>
	 *
	 * AUFNR
	 */
	public String order_id() {
		return getConstString(offset + 26, $order_id);
	}

	/**
	 *  指図番号.<p>
	 *
	 * AUFNR
	 */
	public void order_id(String value) {
		setConstString(offset + 26, $order_id, value);
	}


	/**
	 *  ＷＢＳ要素.<p>
	 *
	 * PS_POSID
	 */
	public String wbs_element() {
		return getConstString(offset + 27, $wbs_element);
	}

	/**
	 *  ＷＢＳ要素.<p>
	 *
	 * PS_POSID
	 */
	public void wbs_element(String value) {
		setConstString(offset + 27, $wbs_element, value);
	}


	/**
	 *  起算日.<p>
	 *
	 * VALUT
	 */
	public MCDate cur_translation_dt() {
		return getConstDate(offset + 28, $cur_translation_dt);
	}

	/**
	 *  起算日.<p>
	 *
	 * VALUT
	 */
	public void cur_translation_dt(MCDate value) {
		setConstDate(offset + 28, $cur_translation_dt, value);
	}


	/**
	 *  銀行ＣＤ.<p>
	 *
	 * HBKID
	 */
	public String bank_cd() {
		return getConstString(offset + 29, $bank_cd);
	}

	/**
	 *  銀行ＣＤ.<p>
	 *
	 * HBKID
	 */
	public void bank_cd(String value) {
		setConstString(offset + 29, $bank_cd, value);
	}


	/**
	 *  口座ＣＤ.<p>
	 *
	 * HKTID
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 30, $bank_ac_cd);
	}

	/**
	 *  口座ＣＤ.<p>
	 *
	 * HKTID
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 30, $bank_ac_cd, value);
	}


	/**
	 *  ソートキー.<p>
	 *
	 * ZUONR
	 */
	public String assignment_reference() {
		return getConstString(offset + 31, $assignment_reference);
	}

	/**
	 *  ソートキー.<p>
	 *
	 * ZUONR
	 */
	public void assignment_reference(String value) {
		setConstString(offset + 31, $assignment_reference, value);
	}


	/**
	 *  取引パートナ.<p>
	 *
	 * VBUND
	 */
	public String trading_partner() {
		return getConstString(offset + 32, $trading_partner);
	}

	/**
	 *  取引パートナ.<p>
	 *
	 * VBUND
	 */
	public void trading_partner(String value) {
		setConstString(offset + 32, $trading_partner, value);
	}


	/**
	 *  セグメント.<p>
	 *
	 * SEGMENT
	 */
	public String segment() {
		return getConstString(offset + 33, $segment);
	}

	/**
	 *  セグメント.<p>
	 *
	 * SEGMENT
	 */
	public void segment(String value) {
		setConstString(offset + 33, $segment, value);
	}


	/**
	 *  得意先ＣＤ.<p>
	 *
	 * PROF_KNDNR
	 */
	public String cst_cd() {
		return getConstString(offset + 34, $cst_cd);
	}

	/**
	 *  得意先ＣＤ.<p>
	 *
	 * PROF_KNDNR
	 */
	public void cst_cd(String value) {
		setConstString(offset + 34, $cst_cd, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 * PROF_ARTNR
	 */
	public String itm_cd() {
		return getConstString(offset + 35, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 * PROF_ARTNR
	 */
	public void itm_cd(String value) {
		setConstString(offset + 35, $itm_cd, value);
	}


	/**
	 *  請求先ＣＤ.<p>
	 *
	 * PROF_KUNRE
	 */
	public String bcst_cd() {
		return getConstString(offset + 36, $bcst_cd);
	}

	/**
	 *  請求先ＣＤ.<p>
	 *
	 * PROF_KUNRE
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 36, $bcst_cd, value);
	}


	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public MCNumber tax_base_trd_cur_amt() {
		return getConstNumber(offset + 37, $tax_base_trd_cur_amt);
	}

	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public void tax_base_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 37, $tax_base_trd_cur_amt, value);
	}

	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public void tax_base_trd_cur_amt(int value) {
		setConstNumber(offset + 37, $tax_base_trd_cur_amt, value);
	}

	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public void tax_base_trd_cur_amt(long value) {
		setConstNumber(offset + 37, $tax_base_trd_cur_amt, value);
	}

	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public void tax_base_trd_cur_amt(float value) {
		setConstNumber(offset + 37, $tax_base_trd_cur_amt, value);
	}

	/**
	 *  課税基準額.<p>
	 *
	 * FWBAS
	 */
	public void tax_base_trd_cur_amt(double value) {
		setConstNumber(offset + 37, $tax_base_trd_cur_amt, value);
	}


	/**
	 *  品目分類ＣＤ.<p>
	 *
	 * PROF_MATKL
	 */
	public String itm_grp_cd() {
		return getConstString(offset + 38, $itm_grp_cd);
	}

	/**
	 *  品目分類ＣＤ.<p>
	 *
	 * PROF_MATKL
	 */
	public void itm_grp_cd(String value) {
		setConstString(offset + 38, $itm_grp_cd, value);
	}


	public String getString(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($ac_doc_typ.equalsIgnoreCase(name)) {
			return ac_doc_typ();
		}
		if ($fiscal_period.equalsIgnoreCase(name)) {
			return fiscal_period();
		}
		if ($doc_header_text.equalsIgnoreCase(name)) {
			return doc_header_text();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ledger_group.equalsIgnoreCase(name)) {
			return ledger_group();
		}
		if ($doc_ref_id.equalsIgnoreCase(name)) {
			return doc_ref_id();
		}
		if ($partner_bussinnss_area.equalsIgnoreCase(name)) {
			return partner_bussinnss_area();
		}
		if ($tax_auto_calc.equalsIgnoreCase(name)) {
			return tax_auto_calc();
		}
		if ($dtl_co_cd.equalsIgnoreCase(name)) {
			return dtl_co_cd();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($doc_itm_text.equalsIgnoreCase(name)) {
			return doc_itm_text();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_jurisdiction.equalsIgnoreCase(name)) {
			return tax_jurisdiction();
		}
		if ($cost_center.equalsIgnoreCase(name)) {
			return cost_center();
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			return profit_center();
		}
		if ($order_id.equalsIgnoreCase(name)) {
			return order_id();
		}
		if ($wbs_element.equalsIgnoreCase(name)) {
			return wbs_element();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($assignment_reference.equalsIgnoreCase(name)) {
			return assignment_reference();
		}
		if ($trading_partner.equalsIgnoreCase(name)) {
			return trading_partner();
		}
		if ($segment.equalsIgnoreCase(name)) {
			return segment();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			return debtor_amt();
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			return creditor_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			return local_cur2_amt();
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			return tax_base_trd_cur_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($doc_dt.equalsIgnoreCase(name)) {
			return doc_dt();
		}
		if ($posting_dt.equalsIgnoreCase(name)) {
			return posting_dt();
		}
		if ($xrate_dt.equalsIgnoreCase(name)) {
			return xrate_dt();
		}
		if ($tax_fulfillment_dt.equalsIgnoreCase(name)) {
			return tax_fulfillment_dt();
		}
		if ($cur_translation_dt.equalsIgnoreCase(name)) {
			return cur_translation_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($ac_doc_typ.equalsIgnoreCase(name)) {
			return ac_doc_typ();
		}
		if ($fiscal_period.equalsIgnoreCase(name)) {
			return fiscal_period();
		}
		if ($doc_header_text.equalsIgnoreCase(name)) {
			return doc_header_text();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ledger_group.equalsIgnoreCase(name)) {
			return ledger_group();
		}
		if ($doc_ref_id.equalsIgnoreCase(name)) {
			return doc_ref_id();
		}
		if ($partner_bussinnss_area.equalsIgnoreCase(name)) {
			return partner_bussinnss_area();
		}
		if ($tax_auto_calc.equalsIgnoreCase(name)) {
			return tax_auto_calc();
		}
		if ($dtl_co_cd.equalsIgnoreCase(name)) {
			return dtl_co_cd();
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($doc_itm_text.equalsIgnoreCase(name)) {
			return doc_itm_text();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_jurisdiction.equalsIgnoreCase(name)) {
			return tax_jurisdiction();
		}
		if ($cost_center.equalsIgnoreCase(name)) {
			return cost_center();
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			return profit_center();
		}
		if ($order_id.equalsIgnoreCase(name)) {
			return order_id();
		}
		if ($wbs_element.equalsIgnoreCase(name)) {
			return wbs_element();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($assignment_reference.equalsIgnoreCase(name)) {
			return assignment_reference();
		}
		if ($trading_partner.equalsIgnoreCase(name)) {
			return trading_partner();
		}
		if ($segment.equalsIgnoreCase(name)) {
			return segment();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			return debtor_amt();
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			return creditor_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			return local_cur2_amt();
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			return tax_base_trd_cur_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($doc_dt.equalsIgnoreCase(name)) {
			return doc_dt();
		}
		if ($posting_dt.equalsIgnoreCase(name)) {
			return posting_dt();
		}
		if ($xrate_dt.equalsIgnoreCase(name)) {
			return xrate_dt();
		}
		if ($tax_fulfillment_dt.equalsIgnoreCase(name)) {
			return tax_fulfillment_dt();
		}
		if ($cur_translation_dt.equalsIgnoreCase(name)) {
			return cur_translation_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($ac_doc_typ.equalsIgnoreCase(name)) {
			ac_doc_typ(value);
			return;
		}
		if ($fiscal_period.equalsIgnoreCase(name)) {
			fiscal_period(value);
			return;
		}
		if ($doc_header_text.equalsIgnoreCase(name)) {
			doc_header_text(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ledger_group.equalsIgnoreCase(name)) {
			ledger_group(value);
			return;
		}
		if ($doc_ref_id.equalsIgnoreCase(name)) {
			doc_ref_id(value);
			return;
		}
		if ($partner_bussinnss_area.equalsIgnoreCase(name)) {
			partner_bussinnss_area(value);
			return;
		}
		if ($tax_auto_calc.equalsIgnoreCase(name)) {
			tax_auto_calc(value);
			return;
		}
		if ($dtl_co_cd.equalsIgnoreCase(name)) {
			dtl_co_cd(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($doc_itm_text.equalsIgnoreCase(name)) {
			doc_itm_text(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_jurisdiction.equalsIgnoreCase(name)) {
			tax_jurisdiction(value);
			return;
		}
		if ($cost_center.equalsIgnoreCase(name)) {
			cost_center(value);
			return;
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			profit_center(value);
			return;
		}
		if ($order_id.equalsIgnoreCase(name)) {
			order_id(value);
			return;
		}
		if ($wbs_element.equalsIgnoreCase(name)) {
			wbs_element(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($assignment_reference.equalsIgnoreCase(name)) {
			assignment_reference(value);
			return;
		}
		if ($trading_partner.equalsIgnoreCase(name)) {
			trading_partner(value);
			return;
		}
		if ($segment.equalsIgnoreCase(name)) {
			segment(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($doc_dt.equalsIgnoreCase(name)) {
			doc_dt(value);
			return;
		}
		if ($posting_dt.equalsIgnoreCase(name)) {
			posting_dt(value);
			return;
		}
		if ($xrate_dt.equalsIgnoreCase(name)) {
			xrate_dt(value);
			return;
		}
		if ($tax_fulfillment_dt.equalsIgnoreCase(name)) {
			tax_fulfillment_dt(value);
			return;
		}
		if ($cur_translation_dt.equalsIgnoreCase(name)) {
			cur_translation_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($ac_doc_typ.equalsIgnoreCase(name)) {
			ac_doc_typ(value);
			return;
		}
		if ($fiscal_period.equalsIgnoreCase(name)) {
			fiscal_period(value);
			return;
		}
		if ($doc_header_text.equalsIgnoreCase(name)) {
			doc_header_text(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ledger_group.equalsIgnoreCase(name)) {
			ledger_group(value);
			return;
		}
		if ($doc_ref_id.equalsIgnoreCase(name)) {
			doc_ref_id(value);
			return;
		}
		if ($partner_bussinnss_area.equalsIgnoreCase(name)) {
			partner_bussinnss_area(value);
			return;
		}
		if ($tax_auto_calc.equalsIgnoreCase(name)) {
			tax_auto_calc(value);
			return;
		}
		if ($dtl_co_cd.equalsIgnoreCase(name)) {
			dtl_co_cd(value);
			return;
		}
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($doc_itm_text.equalsIgnoreCase(name)) {
			doc_itm_text(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_jurisdiction.equalsIgnoreCase(name)) {
			tax_jurisdiction(value);
			return;
		}
		if ($cost_center.equalsIgnoreCase(name)) {
			cost_center(value);
			return;
		}
		if ($profit_center.equalsIgnoreCase(name)) {
			profit_center(value);
			return;
		}
		if ($order_id.equalsIgnoreCase(name)) {
			order_id(value);
			return;
		}
		if ($wbs_element.equalsIgnoreCase(name)) {
			wbs_element(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($assignment_reference.equalsIgnoreCase(name)) {
			assignment_reference(value);
			return;
		}
		if ($trading_partner.equalsIgnoreCase(name)) {
			trading_partner(value);
			return;
		}
		if ($segment.equalsIgnoreCase(name)) {
			segment(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($debtor_amt.equalsIgnoreCase(name)) {
			debtor_amt(value);
			return;
		}
		if ($creditor_amt.equalsIgnoreCase(name)) {
			creditor_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($local_cur2_amt.equalsIgnoreCase(name)) {
			local_cur2_amt(value);
			return;
		}
		if ($tax_base_trd_cur_amt.equalsIgnoreCase(name)) {
			tax_base_trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($doc_dt.equalsIgnoreCase(name)) {
			doc_dt(value);
			return;
		}
		if ($posting_dt.equalsIgnoreCase(name)) {
			posting_dt(value);
			return;
		}
		if ($xrate_dt.equalsIgnoreCase(name)) {
			xrate_dt(value);
			return;
		}
		if ($tax_fulfillment_dt.equalsIgnoreCase(name)) {
			tax_fulfillment_dt(value);
			return;
		}
		if ($cur_translation_dt.equalsIgnoreCase(name)) {
			cur_translation_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

