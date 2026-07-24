package mcframe.commonPFBB.PFBBR5210;

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
	 * レコード区分
	 */
	public static final String $rectype = "rectype";
	/**
	 *  .<p>
	 *
	 * 科目コード
	 */
	public static final String $precode = "precode";
	/**
	 *  .<p>
	 *
	 * 補助科目ｺｰﾄﾞ
	 */
	public static final String $code = "code";
	/**
	 *  .<p>
	 *
	 * 補助科目名称
	 */
	public static final String $name = "name";
	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public static final String $activeflag = "activeflag";
	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public static final String $extension = "extension";
	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public static final String $searchcharacter = "searchcharacter";
	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public static final String $currencycode = "currencycode";
	/**
	 *  .<p>
	 *
	 * ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $ratetypecode = "ratetypecode";
	/**
	 *  .<p>
	 *
	 * 外貨評価換算ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $reval_ratetypecode = "reval_ratetypecode";
	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ1
	 */
	public static final String $cnsr_ratetype1 = "cnsr_ratetype1";
	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ2
	 */
	public static final String $cnsr_ratetype2 = "cnsr_ratetype2";
	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public static final String $appraisalconvflag = "appraisalconvflag";
	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public static final String $vat_flag = "vat_flag";
	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public static final String $reversingflag = "reversingflag";
	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public static final String $aparappraisalflag = "aparappraisalflag";
	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public static final String $aparreversingflag = "aparreversingflag";
	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public static final String $tax_ac_flag = "tax_ac_flag";
	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public static final String $taxablecode = "taxablecode";
	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public static final String $openup_ar = "openup_ar";
	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public static final String $openup_ap = "openup_ap";
	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public static final String $openup_acc = "openup_acc";
	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public static final String $safetybalancefc = "safetybalancefc";


	public static final MCMeta rectype_META = createNumberMeta($rectype, 1, 0, false);
	public static final MCMeta precode_META = createStringMeta($precode, 20);
	public static final MCMeta code_META = createStringMeta($code, 20);
	public static final MCMeta name_META = createStringMeta($name, 100);
	public static final MCMeta activeflag_META = createNumberMeta($activeflag, 1, 0, false);
	public static final MCMeta extension_META = createStringMeta($extension, 2);
	public static final MCMeta searchcharacter_META = createStringMeta($searchcharacter, 1);
	public static final MCMeta currencycode_META = createStringMeta($currencycode, 20);
	public static final MCMeta ratetypecode_META = createStringMeta($ratetypecode, 20);
	public static final MCMeta reval_ratetypecode_META = createStringMeta($reval_ratetypecode, 20);
	public static final MCMeta cnsr_ratetype1_META = createStringMeta($cnsr_ratetype1, 2);
	public static final MCMeta cnsr_ratetype2_META = createStringMeta($cnsr_ratetype2, 2);
	public static final MCMeta appraisalconvflag_META = createNumberMeta($appraisalconvflag, 1, 0, false);
	public static final MCMeta vat_flag_META = createNumberMeta($vat_flag, 1, 0, false);
	public static final MCMeta reversingflag_META = createNumberMeta($reversingflag, 1, 0, false);
	public static final MCMeta aparappraisalflag_META = createNumberMeta($aparappraisalflag, 1, 0, false);
	public static final MCMeta aparreversingflag_META = createNumberMeta($aparreversingflag, 1, 0, false);
	public static final MCMeta tax_ac_flag_META = createNumberMeta($tax_ac_flag, 1, 0, false);
	public static final MCMeta taxablecode_META = createStringMeta($taxablecode, 20);
	public static final MCMeta openup_ar_META = createNumberMeta($openup_ar, 1, 0, false);
	public static final MCMeta openup_ap_META = createNumberMeta($openup_ap, 1, 0, false);
	public static final MCMeta openup_acc_META = createNumberMeta($openup_acc, 1, 0, false);
	public static final MCMeta safetybalancefc_META = createNumberMeta($safetybalancefc, 17, 2, false);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rectype_META,
			precode_META,
			code_META,
			name_META,
			activeflag_META,
			extension_META,
			searchcharacter_META,
			currencycode_META,
			ratetypecode_META,
			reval_ratetypecode_META,
			cnsr_ratetype1_META,
			cnsr_ratetype2_META,
			appraisalconvflag_META,
			vat_flag_META,
			reversingflag_META,
			aparappraisalflag_META,
			aparreversingflag_META,
			tax_ac_flag_META,
			taxablecode_META,
			openup_ar_META,
			openup_ap_META,
			openup_acc_META,
			safetybalancefc_META
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
	 * レコード区分
	 */
	public MCNumber rectype() {
		return getConstNumber(offset + 0, $rectype);
	}

	/**
	 *  .<p>
	 *
	 * レコード区分
	 */
	public void rectype(MCNumber value) {
		setConstNumber(offset + 0, $rectype, value);
	}

	/**
	 *  .<p>
	 *
	 * レコード区分
	 */
	public void rectype(int value) {
		setConstNumber(offset + 0, $rectype, value);
	}

	/**
	 *  .<p>
	 *
	 * レコード区分
	 */
	public void rectype(long value) {
		setConstNumber(offset + 0, $rectype, value);
	}

	/**
	 *  .<p>
	 *
	 * レコード区分
	 */
	public void rectype(float value) {
		setConstNumber(offset + 0, $rectype, value);
	}

	/**
	 *  .<p>
	 *
	 * レコード区分
	 */
	public void rectype(double value) {
		setConstNumber(offset + 0, $rectype, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目コード
	 */
	public String precode() {
		return getConstString(offset + 1, $precode);
	}

	/**
	 *  .<p>
	 *
	 * 科目コード
	 */
	public void precode(String value) {
		setConstString(offset + 1, $precode, value);
	}


	/**
	 *  .<p>
	 *
	 * 補助科目ｺｰﾄﾞ
	 */
	public String code() {
		return getConstString(offset + 2, $code);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目ｺｰﾄﾞ
	 */
	public void code(String value) {
		setConstString(offset + 2, $code, value);
	}


	/**
	 *  .<p>
	 *
	 * 補助科目名称
	 */
	public String name() {
		return getConstString(offset + 3, $name);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目名称
	 */
	public void name(String value) {
		setConstString(offset + 3, $name, value);
	}


	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public MCNumber activeflag() {
		return getConstNumber(offset + 4, $activeflag);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(MCNumber value) {
		setConstNumber(offset + 4, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(int value) {
		setConstNumber(offset + 4, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(long value) {
		setConstNumber(offset + 4, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(float value) {
		setConstNumber(offset + 4, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(double value) {
		setConstNumber(offset + 4, $activeflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public String extension() {
		return getConstString(offset + 5, $extension);
	}

	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public void extension(String value) {
		setConstString(offset + 5, $extension, value);
	}


	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public String searchcharacter() {
		return getConstString(offset + 6, $searchcharacter);
	}

	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public void searchcharacter(String value) {
		setConstString(offset + 6, $searchcharacter, value);
	}


	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public String currencycode() {
		return getConstString(offset + 7, $currencycode);
	}

	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public void currencycode(String value) {
		setConstString(offset + 7, $currencycode, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾚｰﾄﾀｲﾌﾟ
	 */
	public String ratetypecode() {
		return getConstString(offset + 8, $ratetypecode);
	}

	/**
	 *  .<p>
	 *
	 * ﾚｰﾄﾀｲﾌﾟ
	 */
	public void ratetypecode(String value) {
		setConstString(offset + 8, $ratetypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 外貨評価換算ﾚｰﾄﾀｲﾌﾟ
	 */
	public String reval_ratetypecode() {
		return getConstString(offset + 9, $reval_ratetypecode);
	}

	/**
	 *  .<p>
	 *
	 * 外貨評価換算ﾚｰﾄﾀｲﾌﾟ
	 */
	public void reval_ratetypecode(String value) {
		setConstString(offset + 9, $reval_ratetypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ1
	 */
	public String cnsr_ratetype1() {
		return getConstString(offset + 10, $cnsr_ratetype1);
	}

	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ1
	 */
	public void cnsr_ratetype1(String value) {
		setConstString(offset + 10, $cnsr_ratetype1, value);
	}


	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ2
	 */
	public String cnsr_ratetype2() {
		return getConstString(offset + 11, $cnsr_ratetype2);
	}

	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ2
	 */
	public void cnsr_ratetype2(String value) {
		setConstString(offset + 11, $cnsr_ratetype2, value);
	}


	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public MCNumber appraisalconvflag() {
		return getConstNumber(offset + 12, $appraisalconvflag);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(MCNumber value) {
		setConstNumber(offset + 12, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(int value) {
		setConstNumber(offset + 12, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(long value) {
		setConstNumber(offset + 12, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(float value) {
		setConstNumber(offset + 12, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(double value) {
		setConstNumber(offset + 12, $appraisalconvflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public MCNumber vat_flag() {
		return getConstNumber(offset + 13, $vat_flag);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(MCNumber value) {
		setConstNumber(offset + 13, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(int value) {
		setConstNumber(offset + 13, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(long value) {
		setConstNumber(offset + 13, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(float value) {
		setConstNumber(offset + 13, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(double value) {
		setConstNumber(offset + 13, $vat_flag, value);
	}


	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public MCNumber reversingflag() {
		return getConstNumber(offset + 14, $reversingflag);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(MCNumber value) {
		setConstNumber(offset + 14, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(int value) {
		setConstNumber(offset + 14, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(long value) {
		setConstNumber(offset + 14, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(float value) {
		setConstNumber(offset + 14, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(double value) {
		setConstNumber(offset + 14, $reversingflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public MCNumber aparappraisalflag() {
		return getConstNumber(offset + 15, $aparappraisalflag);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(MCNumber value) {
		setConstNumber(offset + 15, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(int value) {
		setConstNumber(offset + 15, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(long value) {
		setConstNumber(offset + 15, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(float value) {
		setConstNumber(offset + 15, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(double value) {
		setConstNumber(offset + 15, $aparappraisalflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public MCNumber aparreversingflag() {
		return getConstNumber(offset + 16, $aparreversingflag);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(MCNumber value) {
		setConstNumber(offset + 16, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(int value) {
		setConstNumber(offset + 16, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(long value) {
		setConstNumber(offset + 16, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(float value) {
		setConstNumber(offset + 16, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(double value) {
		setConstNumber(offset + 16, $aparreversingflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public MCNumber tax_ac_flag() {
		return getConstNumber(offset + 17, $tax_ac_flag);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(MCNumber value) {
		setConstNumber(offset + 17, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(int value) {
		setConstNumber(offset + 17, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(long value) {
		setConstNumber(offset + 17, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(float value) {
		setConstNumber(offset + 17, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(double value) {
		setConstNumber(offset + 17, $tax_ac_flag, value);
	}


	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public String taxablecode() {
		return getConstString(offset + 18, $taxablecode);
	}

	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public void taxablecode(String value) {
		setConstString(offset + 18, $taxablecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public MCNumber openup_ar() {
		return getConstNumber(offset + 19, $openup_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(MCNumber value) {
		setConstNumber(offset + 19, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(int value) {
		setConstNumber(offset + 19, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(long value) {
		setConstNumber(offset + 19, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(float value) {
		setConstNumber(offset + 19, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(double value) {
		setConstNumber(offset + 19, $openup_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public MCNumber openup_ap() {
		return getConstNumber(offset + 20, $openup_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(MCNumber value) {
		setConstNumber(offset + 20, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(int value) {
		setConstNumber(offset + 20, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(long value) {
		setConstNumber(offset + 20, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(float value) {
		setConstNumber(offset + 20, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(double value) {
		setConstNumber(offset + 20, $openup_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public MCNumber openup_acc() {
		return getConstNumber(offset + 21, $openup_acc);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(MCNumber value) {
		setConstNumber(offset + 21, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(int value) {
		setConstNumber(offset + 21, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(long value) {
		setConstNumber(offset + 21, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(float value) {
		setConstNumber(offset + 21, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(double value) {
		setConstNumber(offset + 21, $openup_acc, value);
	}


	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public MCNumber safetybalancefc() {
		return getConstNumber(offset + 22, $safetybalancefc);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(MCNumber value) {
		setConstNumber(offset + 22, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(int value) {
		setConstNumber(offset + 22, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(long value) {
		setConstNumber(offset + 22, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(float value) {
		setConstNumber(offset + 22, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(double value) {
		setConstNumber(offset + 22, $safetybalancefc, value);
	}


	public String getString(String name) {
		if ($precode.equalsIgnoreCase(name)) {
			return precode();
		}
		if ($code.equalsIgnoreCase(name)) {
			return code();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($extension.equalsIgnoreCase(name)) {
			return extension();
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			return searchcharacter();
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			return currencycode();
		}
		if ($ratetypecode.equalsIgnoreCase(name)) {
			return ratetypecode();
		}
		if ($reval_ratetypecode.equalsIgnoreCase(name)) {
			return reval_ratetypecode();
		}
		if ($cnsr_ratetype1.equalsIgnoreCase(name)) {
			return cnsr_ratetype1();
		}
		if ($cnsr_ratetype2.equalsIgnoreCase(name)) {
			return cnsr_ratetype2();
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			return taxablecode();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rectype.equalsIgnoreCase(name)) {
			return rectype();
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			return activeflag();
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			return appraisalconvflag();
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			return vat_flag();
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			return reversingflag();
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			return aparappraisalflag();
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			return aparreversingflag();
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			return tax_ac_flag();
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			return openup_ar();
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			return openup_ap();
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			return openup_acc();
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			return safetybalancefc();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($precode.equalsIgnoreCase(name)) {
			return precode();
		}
		if ($code.equalsIgnoreCase(name)) {
			return code();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($extension.equalsIgnoreCase(name)) {
			return extension();
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			return searchcharacter();
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			return currencycode();
		}
		if ($ratetypecode.equalsIgnoreCase(name)) {
			return ratetypecode();
		}
		if ($reval_ratetypecode.equalsIgnoreCase(name)) {
			return reval_ratetypecode();
		}
		if ($cnsr_ratetype1.equalsIgnoreCase(name)) {
			return cnsr_ratetype1();
		}
		if ($cnsr_ratetype2.equalsIgnoreCase(name)) {
			return cnsr_ratetype2();
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			return taxablecode();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rectype.equalsIgnoreCase(name)) {
			return rectype();
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			return activeflag();
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			return appraisalconvflag();
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			return vat_flag();
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			return reversingflag();
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			return aparappraisalflag();
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			return aparreversingflag();
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			return tax_ac_flag();
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			return openup_ar();
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			return openup_ap();
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			return openup_acc();
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			return safetybalancefc();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($precode.equalsIgnoreCase(name)) {
			precode(value);
			return;
		}
		if ($code.equalsIgnoreCase(name)) {
			code(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($extension.equalsIgnoreCase(name)) {
			extension(value);
			return;
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			searchcharacter(value);
			return;
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			currencycode(value);
			return;
		}
		if ($ratetypecode.equalsIgnoreCase(name)) {
			ratetypecode(value);
			return;
		}
		if ($reval_ratetypecode.equalsIgnoreCase(name)) {
			reval_ratetypecode(value);
			return;
		}
		if ($cnsr_ratetype1.equalsIgnoreCase(name)) {
			cnsr_ratetype1(value);
			return;
		}
		if ($cnsr_ratetype2.equalsIgnoreCase(name)) {
			cnsr_ratetype2(value);
			return;
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			taxablecode(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($precode.equalsIgnoreCase(name)) {
			precode(value);
			return;
		}
		if ($code.equalsIgnoreCase(name)) {
			code(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($extension.equalsIgnoreCase(name)) {
			extension(value);
			return;
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			searchcharacter(value);
			return;
		}
		if ($currencycode.equalsIgnoreCase(name)) {
			currencycode(value);
			return;
		}
		if ($ratetypecode.equalsIgnoreCase(name)) {
			ratetypecode(value);
			return;
		}
		if ($reval_ratetypecode.equalsIgnoreCase(name)) {
			reval_ratetypecode(value);
			return;
		}
		if ($cnsr_ratetype1.equalsIgnoreCase(name)) {
			cnsr_ratetype1(value);
			return;
		}
		if ($cnsr_ratetype2.equalsIgnoreCase(name)) {
			cnsr_ratetype2(value);
			return;
		}
		if ($taxablecode.equalsIgnoreCase(name)) {
			taxablecode(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rectype.equalsIgnoreCase(name)) {
			rectype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($appraisalconvflag.equalsIgnoreCase(name)) {
			appraisalconvflag(value);
			return;
		}
		if ($vat_flag.equalsIgnoreCase(name)) {
			vat_flag(value);
			return;
		}
		if ($reversingflag.equalsIgnoreCase(name)) {
			reversingflag(value);
			return;
		}
		if ($aparappraisalflag.equalsIgnoreCase(name)) {
			aparappraisalflag(value);
			return;
		}
		if ($aparreversingflag.equalsIgnoreCase(name)) {
			aparreversingflag(value);
			return;
		}
		if ($tax_ac_flag.equalsIgnoreCase(name)) {
			tax_ac_flag(value);
			return;
		}
		if ($openup_ar.equalsIgnoreCase(name)) {
			openup_ar(value);
			return;
		}
		if ($openup_ap.equalsIgnoreCase(name)) {
			openup_ap(value);
			return;
		}
		if ($openup_acc.equalsIgnoreCase(name)) {
			openup_acc(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

