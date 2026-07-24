package mcframe.commonPFBB.PFBBR5010;

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
	 *  .<p>
	 *
	 * 計上日
	 */
	public static final String $inpdate = "inpdate";
	/**
	 *  .<p>
	 *
	 * 付箋紙ｺｰﾄﾞ
	 */
	public static final String $postpadcolor = "postpadcolor";
	/**
	 *  .<p>
	 *
	 * 付箋紙内容
	 */
	public static final String $postpadtext = "postpadtext";
	/**
	 *  .<p>
	 *
	 * 伝票Ｎｏ
	 */
	public static final String $voucherno = "voucherno";
	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public static final String $datalevel = "datalevel";
	/**
	 *  .<p>
	 *
	 * 伝票摘要ｺｰﾄﾞ
	 */
	public static final String $header_descriptcode = "header_descriptcode";
	/**
	 *  .<p>
	 *
	 * 伝票摘要内容
	 */
	public static final String $header_descriptname = "header_descriptname";
	/**
	 *  .<p>
	 *
	 * データ名
	 */
	public static final String $filename = "filename";
	/**
	 *  .<p>
	 *
	 * 担当者
	 */
	public static final String $inchargecode = "inchargecode";
	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾏｽﾀ
	 */
	public static final String $header_usermaster = "header_usermaster";
	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾃｷｽﾄ
	 */
	public static final String $header_usertext = "header_usertext";
	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public static final String $drcrtype = "drcrtype";
	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public static final String $accode = "accode";
	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public static final String $subcode = "subcode";
	/**
	 *  .<p>
	 *
	 * 相手科目
	 */
	public static final String $otheraccode = "otheraccode";
	/**
	 *  .<p>
	 *
	 * 相手補助科目
	 */
	public static final String $othersubaccode = "othersubaccode";
	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public static final String $taxablecode = "taxablecode";
	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public static final String $taxtype = "taxtype";
	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public static final String $deptcode = "deptcode";
	/**
	 *  .<p>
	 *
	 * 取引先
	 */
	public static final String $correspcode = "correspcode";
	/**
	 *  .<p>
	 *
	 * 通貨
	 */
	public static final String $currencycode = "currencycode";
	/**
	 *  .<p>
	 *
	 * レートタイプ
	 */
	public static final String $ratetype = "ratetype";
	/**
	 *  .<p>
	 *
	 * レート
	 */
	public static final String $rate = "rate";
	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public static final String $inpamount_fc = "inpamount_fc";
	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public static final String $taxamount_fc = "taxamount_fc";
	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public static final String $taxableamount_fc = "taxableamount_fc";
	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public static final String $inpamount_sc = "inpamount_sc";
	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public static final String $taxamount_sc = "taxamount_sc";
	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public static final String $taxableamount_sc = "taxableamount_sc";
	/**
	 *  .<p>
	 *
	 * 明細摘要ｺｰﾄﾞ
	 */
	public static final String $detail_descriptcode = "detail_descriptcode";
	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public static final String $detail_descriptname = "detail_descriptname";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ1
	 */
	public static final String $detail_usermaster1 = "detail_usermaster1";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ2
	 */
	public static final String $detail_usermaster2 = "detail_usermaster2";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ3
	 */
	public static final String $detail_usermaster3 = "detail_usermaster3";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ4
	 */
	public static final String $detail_usermaster4 = "detail_usermaster4";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ5
	 */
	public static final String $detail_usermaster5 = "detail_usermaster5";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞｺｰﾄﾞ
	 */
	public static final String $detail_usercode = "detail_usercode";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾃｷｽﾄ
	 */
	public static final String $detail_usertext = "detail_usertext";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ日付
	 */
	public static final String $detail_userdate = "detail_userdate";
	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public static final String $detail_userqty = "detail_userqty";
	/**
	 *  .<p>
	 *
	 * 引継元Ｎｏ
	 */
	public static final String $succeedvoucherno = "succeedvoucherno";


	public static final MCMeta inpdate_META = createStringMeta($inpdate, 10);
	public static final MCMeta postpadcolor_META = createStringMeta($postpadcolor, 8);
	public static final MCMeta postpadtext_META = createStringMeta($postpadtext, 100);
	public static final MCMeta voucherno_META = createStringMeta($voucherno, 20);
	public static final MCMeta datalevel_META = createNumberMeta($datalevel, 1, 0, false);
	public static final MCMeta header_descriptcode_META = createStringMeta($header_descriptcode, 20);
	public static final MCMeta header_descriptname_META = createStringMeta($header_descriptname, 100);
	public static final MCMeta filename_META = createStringMeta($filename, 100);
	public static final MCMeta inchargecode_META = createStringMeta($inchargecode, 20);
	public static final MCMeta header_usermaster_META = createStringMeta($header_usermaster, 20);
	public static final MCMeta header_usertext_META = createStringMeta($header_usertext, 100);
	public static final MCMeta drcrtype_META = createNumberMeta($drcrtype, 1, 0, false);
	public static final MCMeta accode_META = createStringMeta($accode, 20);
	public static final MCMeta subcode_META = createStringMeta($subcode, 20);
	public static final MCMeta otheraccode_META = createStringMeta($otheraccode, 20);
	public static final MCMeta othersubaccode_META = createStringMeta($othersubaccode, 20);
	public static final MCMeta taxablecode_META = createStringMeta($taxablecode, 20);
	public static final MCMeta taxtype_META = createNumberMeta($taxtype, 1, 0, false);
	public static final MCMeta deptcode_META = createStringMeta($deptcode, 20);
	public static final MCMeta correspcode_META = createStringMeta($correspcode, 20);
	public static final MCMeta currencycode_META = createStringMeta($currencycode, 20);
	public static final MCMeta ratetype_META = createStringMeta($ratetype, 20);
	public static final MCMeta rate_META = createNumberMeta($rate, 14, 9, false);
	public static final MCMeta inpamount_fc_META = createNumberMeta($inpamount_fc, 16, 2, false);
	public static final MCMeta taxamount_fc_META = createNumberMeta($taxamount_fc, 16, 2, false);
	public static final MCMeta taxableamount_fc_META = createNumberMeta($taxableamount_fc, 16, 2, false);
	public static final MCMeta inpamount_sc_META = createNumberMeta($inpamount_sc, 16, 2, false);
	public static final MCMeta taxamount_sc_META = createNumberMeta($taxamount_sc, 16, 2, false);
	public static final MCMeta taxableamount_sc_META = createNumberMeta($taxableamount_sc, 16, 2, false);
	public static final MCMeta detail_descriptcode_META = createStringMeta($detail_descriptcode, 20);
	public static final MCMeta detail_descriptname_META = createStringMeta($detail_descriptname, 100);
	public static final MCMeta detail_usermaster1_META = createStringMeta($detail_usermaster1, 20);
	public static final MCMeta detail_usermaster2_META = createStringMeta($detail_usermaster2, 20);
	public static final MCMeta detail_usermaster3_META = createStringMeta($detail_usermaster3, 20);
	public static final MCMeta detail_usermaster4_META = createStringMeta($detail_usermaster4, 20);
	public static final MCMeta detail_usermaster5_META = createStringMeta($detail_usermaster5, 20);
	public static final MCMeta detail_usercode_META = createStringMeta($detail_usercode, 20);
	public static final MCMeta detail_usertext_META = createStringMeta($detail_usertext, 100);
	public static final MCMeta detail_userdate_META = createStringMeta($detail_userdate, 10);
	public static final MCMeta detail_userqty_META = createNumberMeta($detail_userqty, 14, 4, false);
	public static final MCMeta succeedvoucherno_META = createStringMeta($succeedvoucherno, 20);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpdate_META,
			postpadcolor_META,
			postpadtext_META,
			voucherno_META,
			datalevel_META,
			header_descriptcode_META,
			header_descriptname_META,
			filename_META,
			inchargecode_META,
			header_usermaster_META,
			header_usertext_META,
			drcrtype_META,
			accode_META,
			subcode_META,
			otheraccode_META,
			othersubaccode_META,
			taxablecode_META,
			taxtype_META,
			deptcode_META,
			correspcode_META,
			currencycode_META,
			ratetype_META,
			rate_META,
			inpamount_fc_META,
			taxamount_fc_META,
			taxableamount_fc_META,
			inpamount_sc_META,
			taxamount_sc_META,
			taxableamount_sc_META,
			detail_descriptcode_META,
			detail_descriptname_META,
			detail_usermaster1_META,
			detail_usermaster2_META,
			detail_usermaster3_META,
			detail_usermaster4_META,
			detail_usermaster5_META,
			detail_usercode_META,
			detail_usertext_META,
			detail_userdate_META,
			detail_userqty_META,
			succeedvoucherno_META
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
	 *  .<p>
	 *
	 * 計上日
	 */
	public String inpdate() {
		return getConstString(offset + 0, $inpdate);
	}

	/**
	 *  .<p>
	 *
	 * 計上日
	 */
	public void inpdate(String value) {
		setConstString(offset + 0, $inpdate, value);
	}


	/**
	 *  .<p>
	 *
	 * 付箋紙ｺｰﾄﾞ
	 */
	public String postpadcolor() {
		return getConstString(offset + 1, $postpadcolor);
	}

	/**
	 *  .<p>
	 *
	 * 付箋紙ｺｰﾄﾞ
	 */
	public void postpadcolor(String value) {
		setConstString(offset + 1, $postpadcolor, value);
	}


	/**
	 *  .<p>
	 *
	 * 付箋紙内容
	 */
	public String postpadtext() {
		return getConstString(offset + 2, $postpadtext);
	}

	/**
	 *  .<p>
	 *
	 * 付箋紙内容
	 */
	public void postpadtext(String value) {
		setConstString(offset + 2, $postpadtext, value);
	}


	/**
	 *  .<p>
	 *
	 * 伝票Ｎｏ
	 */
	public String voucherno() {
		return getConstString(offset + 3, $voucherno);
	}

	/**
	 *  .<p>
	 *
	 * 伝票Ｎｏ
	 */
	public void voucherno(String value) {
		setConstString(offset + 3, $voucherno, value);
	}


	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public MCNumber datalevel() {
		return getConstNumber(offset + 4, $datalevel);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(MCNumber value) {
		setConstNumber(offset + 4, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(int value) {
		setConstNumber(offset + 4, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(long value) {
		setConstNumber(offset + 4, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(float value) {
		setConstNumber(offset + 4, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(double value) {
		setConstNumber(offset + 4, $datalevel, value);
	}


	/**
	 *  .<p>
	 *
	 * 伝票摘要ｺｰﾄﾞ
	 */
	public String header_descriptcode() {
		return getConstString(offset + 5, $header_descriptcode);
	}

	/**
	 *  .<p>
	 *
	 * 伝票摘要ｺｰﾄﾞ
	 */
	public void header_descriptcode(String value) {
		setConstString(offset + 5, $header_descriptcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 伝票摘要内容
	 */
	public String header_descriptname() {
		return getConstString(offset + 6, $header_descriptname);
	}

	/**
	 *  .<p>
	 *
	 * 伝票摘要内容
	 */
	public void header_descriptname(String value) {
		setConstString(offset + 6, $header_descriptname, value);
	}


	/**
	 *  .<p>
	 *
	 * データ名
	 */
	public String filename() {
		return getConstString(offset + 7, $filename);
	}

	/**
	 *  .<p>
	 *
	 * データ名
	 */
	public void filename(String value) {
		setConstString(offset + 7, $filename, value);
	}


	/**
	 *  .<p>
	 *
	 * 担当者
	 */
	public String inchargecode() {
		return getConstString(offset + 8, $inchargecode);
	}

	/**
	 *  .<p>
	 *
	 * 担当者
	 */
	public void inchargecode(String value) {
		setConstString(offset + 8, $inchargecode, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾏｽﾀ
	 */
	public String header_usermaster() {
		return getConstString(offset + 9, $header_usermaster);
	}

	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾏｽﾀ
	 */
	public void header_usermaster(String value) {
		setConstString(offset + 9, $header_usermaster, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾃｷｽﾄ
	 */
	public String header_usertext() {
		return getConstString(offset + 10, $header_usertext);
	}

	/**
	 *  .<p>
	 *
	 * ﾍｯﾀﾞﾕｰｻﾞﾃｷｽﾄ
	 */
	public void header_usertext(String value) {
		setConstString(offset + 10, $header_usertext, value);
	}


	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public MCNumber drcrtype() {
		return getConstNumber(offset + 11, $drcrtype);
	}

	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public void drcrtype(MCNumber value) {
		setConstNumber(offset + 11, $drcrtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public void drcrtype(int value) {
		setConstNumber(offset + 11, $drcrtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public void drcrtype(long value) {
		setConstNumber(offset + 11, $drcrtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public void drcrtype(float value) {
		setConstNumber(offset + 11, $drcrtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸借区分
	 */
	public void drcrtype(double value) {
		setConstNumber(offset + 11, $drcrtype, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public String accode() {
		return getConstString(offset + 12, $accode);
	}

	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public void accode(String value) {
		setConstString(offset + 12, $accode, value);
	}


	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public String subcode() {
		return getConstString(offset + 13, $subcode);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public void subcode(String value) {
		setConstString(offset + 13, $subcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 相手科目
	 */
	public String otheraccode() {
		return getConstString(offset + 14, $otheraccode);
	}

	/**
	 *  .<p>
	 *
	 * 相手科目
	 */
	public void otheraccode(String value) {
		setConstString(offset + 14, $otheraccode, value);
	}


	/**
	 *  .<p>
	 *
	 * 相手補助科目
	 */
	public String othersubaccode() {
		return getConstString(offset + 15, $othersubaccode);
	}

	/**
	 *  .<p>
	 *
	 * 相手補助科目
	 */
	public void othersubaccode(String value) {
		setConstString(offset + 15, $othersubaccode, value);
	}


	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public String taxablecode() {
		return getConstString(offset + 16, $taxablecode);
	}

	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public void taxablecode(String value) {
		setConstString(offset + 16, $taxablecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public MCNumber taxtype() {
		return getConstNumber(offset + 17, $taxtype);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(MCNumber value) {
		setConstNumber(offset + 17, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(int value) {
		setConstNumber(offset + 17, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(long value) {
		setConstNumber(offset + 17, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(float value) {
		setConstNumber(offset + 17, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(double value) {
		setConstNumber(offset + 17, $taxtype, value);
	}


	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public String deptcode() {
		return getConstString(offset + 18, $deptcode);
	}

	/**
	 *  .<p>
	 *
	 * 部門
	 */
	public void deptcode(String value) {
		setConstString(offset + 18, $deptcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 取引先
	 */
	public String correspcode() {
		return getConstString(offset + 19, $correspcode);
	}

	/**
	 *  .<p>
	 *
	 * 取引先
	 */
	public void correspcode(String value) {
		setConstString(offset + 19, $correspcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 通貨
	 */
	public String currencycode() {
		return getConstString(offset + 20, $currencycode);
	}

	/**
	 *  .<p>
	 *
	 * 通貨
	 */
	public void currencycode(String value) {
		setConstString(offset + 20, $currencycode, value);
	}


	/**
	 *  .<p>
	 *
	 * レートタイプ
	 */
	public String ratetype() {
		return getConstString(offset + 21, $ratetype);
	}

	/**
	 *  .<p>
	 *
	 * レートタイプ
	 */
	public void ratetype(String value) {
		setConstString(offset + 21, $ratetype, value);
	}


	/**
	 *  .<p>
	 *
	 * レート
	 */
	public MCNumber rate() {
		return getConstNumber(offset + 22, $rate);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(MCNumber value) {
		setConstNumber(offset + 22, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(int value) {
		setConstNumber(offset + 22, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(long value) {
		setConstNumber(offset + 22, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(float value) {
		setConstNumber(offset + 22, $rate, value);
	}

	/**
	 *  .<p>
	 *
	 * レート
	 */
	public void rate(double value) {
		setConstNumber(offset + 22, $rate, value);
	}


	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public MCNumber inpamount_fc() {
		return getConstNumber(offset + 23, $inpamount_fc);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpamount_fc(MCNumber value) {
		setConstNumber(offset + 23, $inpamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpamount_fc(int value) {
		setConstNumber(offset + 23, $inpamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpamount_fc(long value) {
		setConstNumber(offset + 23, $inpamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpamount_fc(float value) {
		setConstNumber(offset + 23, $inpamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力金額
	 */
	public void inpamount_fc(double value) {
		setConstNumber(offset + 23, $inpamount_fc, value);
	}


	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public MCNumber taxamount_fc() {
		return getConstNumber(offset + 24, $taxamount_fc);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxamount_fc(MCNumber value) {
		setConstNumber(offset + 24, $taxamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxamount_fc(int value) {
		setConstNumber(offset + 24, $taxamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxamount_fc(long value) {
		setConstNumber(offset + 24, $taxamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxamount_fc(float value) {
		setConstNumber(offset + 24, $taxamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税額
	 */
	public void taxamount_fc(double value) {
		setConstNumber(offset + 24, $taxamount_fc, value);
	}


	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public MCNumber taxableamount_fc() {
		return getConstNumber(offset + 25, $taxableamount_fc);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableamount_fc(MCNumber value) {
		setConstNumber(offset + 25, $taxableamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableamount_fc(int value) {
		setConstNumber(offset + 25, $taxableamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableamount_fc(long value) {
		setConstNumber(offset + 25, $taxableamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableamount_fc(float value) {
		setConstNumber(offset + 25, $taxableamount_fc, value);
	}

	/**
	 *  .<p>
	 *
	 * 入力税対象金額
	 */
	public void taxableamount_fc(double value) {
		setConstNumber(offset + 25, $taxableamount_fc, value);
	}


	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public MCNumber inpamount_sc() {
		return getConstNumber(offset + 26, $inpamount_sc);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpamount_sc(MCNumber value) {
		setConstNumber(offset + 26, $inpamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpamount_sc(int value) {
		setConstNumber(offset + 26, $inpamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpamount_sc(long value) {
		setConstNumber(offset + 26, $inpamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpamount_sc(float value) {
		setConstNumber(offset + 26, $inpamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準金額
	 */
	public void inpamount_sc(double value) {
		setConstNumber(offset + 26, $inpamount_sc, value);
	}


	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public MCNumber taxamount_sc() {
		return getConstNumber(offset + 27, $taxamount_sc);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxamount_sc(MCNumber value) {
		setConstNumber(offset + 27, $taxamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxamount_sc(int value) {
		setConstNumber(offset + 27, $taxamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxamount_sc(long value) {
		setConstNumber(offset + 27, $taxamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxamount_sc(float value) {
		setConstNumber(offset + 27, $taxamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税額
	 */
	public void taxamount_sc(double value) {
		setConstNumber(offset + 27, $taxamount_sc, value);
	}


	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public MCNumber taxableamount_sc() {
		return getConstNumber(offset + 28, $taxableamount_sc);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableamount_sc(MCNumber value) {
		setConstNumber(offset + 28, $taxableamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableamount_sc(int value) {
		setConstNumber(offset + 28, $taxableamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableamount_sc(long value) {
		setConstNumber(offset + 28, $taxableamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableamount_sc(float value) {
		setConstNumber(offset + 28, $taxableamount_sc, value);
	}

	/**
	 *  .<p>
	 *
	 * 基準税対象金額
	 */
	public void taxableamount_sc(double value) {
		setConstNumber(offset + 28, $taxableamount_sc, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細摘要ｺｰﾄﾞ
	 */
	public String detail_descriptcode() {
		return getConstString(offset + 29, $detail_descriptcode);
	}

	/**
	 *  .<p>
	 *
	 * 明細摘要ｺｰﾄﾞ
	 */
	public void detail_descriptcode(String value) {
		setConstString(offset + 29, $detail_descriptcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public String detail_descriptname() {
		return getConstString(offset + 30, $detail_descriptname);
	}

	/**
	 *  .<p>
	 *
	 * 明細摘要内容
	 */
	public void detail_descriptname(String value) {
		setConstString(offset + 30, $detail_descriptname, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ1
	 */
	public String detail_usermaster1() {
		return getConstString(offset + 31, $detail_usermaster1);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ1
	 */
	public void detail_usermaster1(String value) {
		setConstString(offset + 31, $detail_usermaster1, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ2
	 */
	public String detail_usermaster2() {
		return getConstString(offset + 32, $detail_usermaster2);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ2
	 */
	public void detail_usermaster2(String value) {
		setConstString(offset + 32, $detail_usermaster2, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ3
	 */
	public String detail_usermaster3() {
		return getConstString(offset + 33, $detail_usermaster3);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ3
	 */
	public void detail_usermaster3(String value) {
		setConstString(offset + 33, $detail_usermaster3, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ4
	 */
	public String detail_usermaster4() {
		return getConstString(offset + 34, $detail_usermaster4);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ4
	 */
	public void detail_usermaster4(String value) {
		setConstString(offset + 34, $detail_usermaster4, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ5
	 */
	public String detail_usermaster5() {
		return getConstString(offset + 35, $detail_usermaster5);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾏｽﾀ5
	 */
	public void detail_usermaster5(String value) {
		setConstString(offset + 35, $detail_usermaster5, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞｺｰﾄﾞ
	 */
	public String detail_usercode() {
		return getConstString(offset + 36, $detail_usercode);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞｺｰﾄﾞ
	 */
	public void detail_usercode(String value) {
		setConstString(offset + 36, $detail_usercode, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾃｷｽﾄ
	 */
	public String detail_usertext() {
		return getConstString(offset + 37, $detail_usertext);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞﾃｷｽﾄ
	 */
	public void detail_usertext(String value) {
		setConstString(offset + 37, $detail_usertext, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ日付
	 */
	public String detail_userdate() {
		return getConstString(offset + 38, $detail_userdate);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ日付
	 */
	public void detail_userdate(String value) {
		setConstString(offset + 38, $detail_userdate, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public MCNumber detail_userqty() {
		return getConstNumber(offset + 39, $detail_userqty);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public void detail_userqty(MCNumber value) {
		setConstNumber(offset + 39, $detail_userqty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public void detail_userqty(int value) {
		setConstNumber(offset + 39, $detail_userqty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public void detail_userqty(long value) {
		setConstNumber(offset + 39, $detail_userqty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public void detail_userqty(float value) {
		setConstNumber(offset + 39, $detail_userqty, value);
	}

	/**
	 *  .<p>
	 *
	 * 明細ﾕｰｻﾞ数量
	 */
	public void detail_userqty(double value) {
		setConstNumber(offset + 39, $detail_userqty, value);
	}


	/**
	 *  .<p>
	 *
	 * 引継元Ｎｏ
	 */
	public String succeedvoucherno() {
		return getConstString(offset + 40, $succeedvoucherno);
	}

	/**
	 *  .<p>
	 *
	 * 引継元Ｎｏ
	 */
	public void succeedvoucherno(String value) {
		setConstString(offset + 40, $succeedvoucherno, value);
	}


	public String getString(String name) {
		if ($inpdate.equalsIgnoreCase(name)) {
			return inpdate();
		}
		if ($postpadcolor.equalsIgnoreCase(name)) {
			return postpadcolor();
		}
		if ($postpadtext.equalsIgnoreCase(name)) {
			return postpadtext();
		}
		if ($voucherno.equalsIgnoreCase(name)) {
			return voucherno();
		}
		if ($header_descriptcode.equalsIgnoreCase(name)) {
			return header_descriptcode();
		}
		if ($header_descriptname.equalsIgnoreCase(name)) {
			return header_descriptname();
		}
		if ($filename.equalsIgnoreCase(name)) {
			return filename();
		}
		if ($inchargecode.equalsIgnoreCase(name)) {
			return inchargecode();
		}
		if ($header_usermaster.equalsIgnoreCase(name)) {
			return header_usermaster();
		}
		if ($header_usertext.equalsIgnoreCase(name)) {
			return header_usertext();
		}
		if ($accode.equalsIgnoreCase(name)) {
			return accode();
		}
		if ($subcode.equalsIgnoreCase(name)) {
			return subcode();
		}
		if ($otheraccode.equalsIgnoreCase(name)) {
			return otheraccode();
		}
		if ($othersubaccode.equalsIgnoreCase(name)) {
			return othersubaccode();
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			return taxablecode();
		}
		if ($deptcode.equalsIgnoreCase(name)) {
			return deptcode();
		}
		if ($correspcode.equalsIgnoreCase(name)) {
			return correspcode();
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			return currencycode();
		}
		if ($ratetype.equalsIgnoreCase(name)) {
			return ratetype();
		}
		if ($detail_descriptcode.equalsIgnoreCase(name)) {
			return detail_descriptcode();
		}
		if ($detail_descriptname.equalsIgnoreCase(name)) {
			return detail_descriptname();
		}
		if ($detail_usermaster1.equalsIgnoreCase(name)) {
			return detail_usermaster1();
		}
		if ($detail_usermaster2.equalsIgnoreCase(name)) {
			return detail_usermaster2();
		}
		if ($detail_usermaster3.equalsIgnoreCase(name)) {
			return detail_usermaster3();
		}
		if ($detail_usermaster4.equalsIgnoreCase(name)) {
			return detail_usermaster4();
		}
		if ($detail_usermaster5.equalsIgnoreCase(name)) {
			return detail_usermaster5();
		}
		if ($detail_usercode.equalsIgnoreCase(name)) {
			return detail_usercode();
		}
		if ($detail_usertext.equalsIgnoreCase(name)) {
			return detail_usertext();
		}
		if ($detail_userdate.equalsIgnoreCase(name)) {
			return detail_userdate();
		}
		if ($succeedvoucherno.equalsIgnoreCase(name)) {
			return succeedvoucherno();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($datalevel.equalsIgnoreCase(name)) {
			return datalevel();
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			return drcrtype();
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			return taxtype();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			return inpamount_fc();
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			return taxamount_fc();
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			return taxableamount_fc();
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			return inpamount_sc();
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			return taxamount_sc();
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			return taxableamount_sc();
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			return detail_userqty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($inpdate.equalsIgnoreCase(name)) {
			return inpdate();
		}
		if ($postpadcolor.equalsIgnoreCase(name)) {
			return postpadcolor();
		}
		if ($postpadtext.equalsIgnoreCase(name)) {
			return postpadtext();
		}
		if ($voucherno.equalsIgnoreCase(name)) {
			return voucherno();
		}
		if ($header_descriptcode.equalsIgnoreCase(name)) {
			return header_descriptcode();
		}
		if ($header_descriptname.equalsIgnoreCase(name)) {
			return header_descriptname();
		}
		if ($filename.equalsIgnoreCase(name)) {
			return filename();
		}
		if ($inchargecode.equalsIgnoreCase(name)) {
			return inchargecode();
		}
		if ($header_usermaster.equalsIgnoreCase(name)) {
			return header_usermaster();
		}
		if ($header_usertext.equalsIgnoreCase(name)) {
			return header_usertext();
		}
		if ($accode.equalsIgnoreCase(name)) {
			return accode();
		}
		if ($subcode.equalsIgnoreCase(name)) {
			return subcode();
		}
		if ($otheraccode.equalsIgnoreCase(name)) {
			return otheraccode();
		}
		if ($othersubaccode.equalsIgnoreCase(name)) {
			return othersubaccode();
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			return taxablecode();
		}
		if ($deptcode.equalsIgnoreCase(name)) {
			return deptcode();
		}
		if ($correspcode.equalsIgnoreCase(name)) {
			return correspcode();
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			return currencycode();
		}
		if ($ratetype.equalsIgnoreCase(name)) {
			return ratetype();
		}
		if ($detail_descriptcode.equalsIgnoreCase(name)) {
			return detail_descriptcode();
		}
		if ($detail_descriptname.equalsIgnoreCase(name)) {
			return detail_descriptname();
		}
		if ($detail_usermaster1.equalsIgnoreCase(name)) {
			return detail_usermaster1();
		}
		if ($detail_usermaster2.equalsIgnoreCase(name)) {
			return detail_usermaster2();
		}
		if ($detail_usermaster3.equalsIgnoreCase(name)) {
			return detail_usermaster3();
		}
		if ($detail_usermaster4.equalsIgnoreCase(name)) {
			return detail_usermaster4();
		}
		if ($detail_usermaster5.equalsIgnoreCase(name)) {
			return detail_usermaster5();
		}
		if ($detail_usercode.equalsIgnoreCase(name)) {
			return detail_usercode();
		}
		if ($detail_usertext.equalsIgnoreCase(name)) {
			return detail_usertext();
		}
		if ($detail_userdate.equalsIgnoreCase(name)) {
			return detail_userdate();
		}
		if ($succeedvoucherno.equalsIgnoreCase(name)) {
			return succeedvoucherno();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($datalevel.equalsIgnoreCase(name)) {
			return datalevel();
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			return drcrtype();
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			return taxtype();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			return inpamount_fc();
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			return taxamount_fc();
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			return taxableamount_fc();
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			return inpamount_sc();
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			return taxamount_sc();
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			return taxableamount_sc();
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			return detail_userqty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($inpdate.equalsIgnoreCase(name)) {
			inpdate(value);
			return;
		}
		if ($postpadcolor.equalsIgnoreCase(name)) {
			postpadcolor(value);
			return;
		}
		if ($postpadtext.equalsIgnoreCase(name)) {
			postpadtext(value);
			return;
		}
		if ($voucherno.equalsIgnoreCase(name)) {
			voucherno(value);
			return;
		}
		if ($header_descriptcode.equalsIgnoreCase(name)) {
			header_descriptcode(value);
			return;
		}
		if ($header_descriptname.equalsIgnoreCase(name)) {
			header_descriptname(value);
			return;
		}
		if ($filename.equalsIgnoreCase(name)) {
			filename(value);
			return;
		}
		if ($inchargecode.equalsIgnoreCase(name)) {
			inchargecode(value);
			return;
		}
		if ($header_usermaster.equalsIgnoreCase(name)) {
			header_usermaster(value);
			return;
		}
		if ($header_usertext.equalsIgnoreCase(name)) {
			header_usertext(value);
			return;
		}
		if ($accode.equalsIgnoreCase(name)) {
			accode(value);
			return;
		}
		if ($subcode.equalsIgnoreCase(name)) {
			subcode(value);
			return;
		}
		if ($otheraccode.equalsIgnoreCase(name)) {
			otheraccode(value);
			return;
		}
		if ($othersubaccode.equalsIgnoreCase(name)) {
			othersubaccode(value);
			return;
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			taxablecode(value);
			return;
		}
		if ($deptcode.equalsIgnoreCase(name)) {
			deptcode(value);
			return;
		}
		if ($correspcode.equalsIgnoreCase(name)) {
			correspcode(value);
			return;
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			currencycode(value);
			return;
		}
		if ($ratetype.equalsIgnoreCase(name)) {
			ratetype(value);
			return;
		}
		if ($detail_descriptcode.equalsIgnoreCase(name)) {
			detail_descriptcode(value);
			return;
		}
		if ($detail_descriptname.equalsIgnoreCase(name)) {
			detail_descriptname(value);
			return;
		}
		if ($detail_usermaster1.equalsIgnoreCase(name)) {
			detail_usermaster1(value);
			return;
		}
		if ($detail_usermaster2.equalsIgnoreCase(name)) {
			detail_usermaster2(value);
			return;
		}
		if ($detail_usermaster3.equalsIgnoreCase(name)) {
			detail_usermaster3(value);
			return;
		}
		if ($detail_usermaster4.equalsIgnoreCase(name)) {
			detail_usermaster4(value);
			return;
		}
		if ($detail_usermaster5.equalsIgnoreCase(name)) {
			detail_usermaster5(value);
			return;
		}
		if ($detail_usercode.equalsIgnoreCase(name)) {
			detail_usercode(value);
			return;
		}
		if ($detail_usertext.equalsIgnoreCase(name)) {
			detail_usertext(value);
			return;
		}
		if ($detail_userdate.equalsIgnoreCase(name)) {
			detail_userdate(value);
			return;
		}
		if ($succeedvoucherno.equalsIgnoreCase(name)) {
			succeedvoucherno(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpdate.equalsIgnoreCase(name)) {
			inpdate(value);
			return;
		}
		if ($postpadcolor.equalsIgnoreCase(name)) {
			postpadcolor(value);
			return;
		}
		if ($postpadtext.equalsIgnoreCase(name)) {
			postpadtext(value);
			return;
		}
		if ($voucherno.equalsIgnoreCase(name)) {
			voucherno(value);
			return;
		}
		if ($header_descriptcode.equalsIgnoreCase(name)) {
			header_descriptcode(value);
			return;
		}
		if ($header_descriptname.equalsIgnoreCase(name)) {
			header_descriptname(value);
			return;
		}
		if ($filename.equalsIgnoreCase(name)) {
			filename(value);
			return;
		}
		if ($inchargecode.equalsIgnoreCase(name)) {
			inchargecode(value);
			return;
		}
		if ($header_usermaster.equalsIgnoreCase(name)) {
			header_usermaster(value);
			return;
		}
		if ($header_usertext.equalsIgnoreCase(name)) {
			header_usertext(value);
			return;
		}
		if ($accode.equalsIgnoreCase(name)) {
			accode(value);
			return;
		}
		if ($subcode.equalsIgnoreCase(name)) {
			subcode(value);
			return;
		}
		if ($otheraccode.equalsIgnoreCase(name)) {
			otheraccode(value);
			return;
		}
		if ($othersubaccode.equalsIgnoreCase(name)) {
			othersubaccode(value);
			return;
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			taxablecode(value);
			return;
		}
		if ($deptcode.equalsIgnoreCase(name)) {
			deptcode(value);
			return;
		}
		if ($correspcode.equalsIgnoreCase(name)) {
			correspcode(value);
			return;
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			currencycode(value);
			return;
		}
		if ($ratetype.equalsIgnoreCase(name)) {
			ratetype(value);
			return;
		}
		if ($detail_descriptcode.equalsIgnoreCase(name)) {
			detail_descriptcode(value);
			return;
		}
		if ($detail_descriptname.equalsIgnoreCase(name)) {
			detail_descriptname(value);
			return;
		}
		if ($detail_usermaster1.equalsIgnoreCase(name)) {
			detail_usermaster1(value);
			return;
		}
		if ($detail_usermaster2.equalsIgnoreCase(name)) {
			detail_usermaster2(value);
			return;
		}
		if ($detail_usermaster3.equalsIgnoreCase(name)) {
			detail_usermaster3(value);
			return;
		}
		if ($detail_usermaster4.equalsIgnoreCase(name)) {
			detail_usermaster4(value);
			return;
		}
		if ($detail_usermaster5.equalsIgnoreCase(name)) {
			detail_usermaster5(value);
			return;
		}
		if ($detail_usercode.equalsIgnoreCase(name)) {
			detail_usercode(value);
			return;
		}
		if ($detail_usertext.equalsIgnoreCase(name)) {
			detail_usertext(value);
			return;
		}
		if ($detail_userdate.equalsIgnoreCase(name)) {
			detail_userdate(value);
			return;
		}
		if ($succeedvoucherno.equalsIgnoreCase(name)) {
			succeedvoucherno(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($drcrtype.equalsIgnoreCase(name)) {
			drcrtype(value);
			return;
		}
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($inpamount_fc.equalsIgnoreCase(name)) {
			inpamount_fc(value);
			return;
		}
		if ($taxamount_fc.equalsIgnoreCase(name)) {
			taxamount_fc(value);
			return;
		}
		if ($taxableamount_fc.equalsIgnoreCase(name)) {
			taxableamount_fc(value);
			return;
		}
		if ($inpamount_sc.equalsIgnoreCase(name)) {
			inpamount_sc(value);
			return;
		}
		if ($taxamount_sc.equalsIgnoreCase(name)) {
			taxamount_sc(value);
			return;
		}
		if ($taxableamount_sc.equalsIgnoreCase(name)) {
			taxableamount_sc(value);
			return;
		}
		if ($detail_userqty.equalsIgnoreCase(name)) {
			detail_userqty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

