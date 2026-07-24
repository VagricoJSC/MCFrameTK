package mcframe.commonPFBB.PFBBR5200;

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
	 * 科目名称
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
	 * 拡張ﾌﾗｸﾞ
	 */
	public static final String $extension = "extension";
	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public static final String $searchcharacter = "searchcharacter";
	/**
	 *  .<p>
	 *
	 * 科目区分
	 */
	public static final String $accounttype = "accounttype";
	/**
	 *  .<p>
	 *
	 * 特別科目区分
	 */
	public static final String $sp_accounttype = "sp_accounttype";
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
	 * 補助科目あり
	 */
	public static final String $subincludeflag = "subincludeflag";
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
	 * 内税/外税区分
	 */
	public static final String $taxtype = "taxtype";
	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public static final String $taxabletype = "taxabletype";
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
	 * 科目属性-取引先-入力制御設定
	 */
	public static final String $correspondentset = "correspondentset";
	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public static final String $descriptcontrol = "descriptcontrol";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public static final String $usermaster1control = "usermaster1control";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public static final String $usermaster2control = "usermaster2control";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public static final String $usermaster3control = "usermaster3control";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public static final String $usermaster4control = "usermaster4control";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public static final String $usermaster5control = "usermaster5control";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public static final String $usercodecontrol = "usercodecontrol";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public static final String $usertextcontrol = "usertextcontrol";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public static final String $userdatecontrol = "userdatecontrol";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public static final String $userqtycontrol = "userqtycontrol";
	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public static final String $correspondentsummary = "correspondentsummary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public static final String $usermaster1summary = "usermaster1summary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public static final String $usermaster2summary = "usermaster2summary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public static final String $usermaster3summary = "usermaster3summary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public static final String $usermaster4summary = "usermaster4summary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public static final String $usermaster5summary = "usermaster5summary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public static final String $userdatesummary = "userdatesummary";
	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public static final String $userqtysummary = "userqtysummary";
	/**
	 *  .<p>
	 *
	 * 表示通貨1ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $pc_ratetype1 = "pc_ratetype1";
	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public static final String $pc_exchangetype1 = "pc_exchangetype1";
	/**
	 *  .<p>
	 *
	 * 表示通貨2ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $pc_ratetype2 = "pc_ratetype2";
	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public static final String $pc_exchangetype2 = "pc_exchangetype2";
	/**
	 *  .<p>
	 *
	 * 表示通貨3ﾚｰﾄﾀｲﾌﾟ
	 */
	public static final String $pc_ratetype3 = "pc_ratetype3";
	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public static final String $pc_exchangetype3 = "pc_exchangetype3";
	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public static final String $safetybalancefc = "safetybalancefc";
	/**
	 *  .<p>
	 *
	 * 財務諸表項目
	 */
	public static final String $fstype = "fstype";
	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public static final String $beginend = "beginend";


	public static final MCMeta rectype_META = createNumberMeta($rectype, 1, 0, false);
	public static final MCMeta precode_META = createStringMeta($precode, 20);
	public static final MCMeta name_META = createStringMeta($name, 100);
	public static final MCMeta activeflag_META = createNumberMeta($activeflag, 1, 0, false);
	public static final MCMeta extension_META = createStringMeta($extension, 2);
	public static final MCMeta searchcharacter_META = createStringMeta($searchcharacter, 1);
	public static final MCMeta accounttype_META = createStringMeta($accounttype, 4);
	public static final MCMeta sp_accounttype_META = createStringMeta($sp_accounttype, 3);
	public static final MCMeta currencycode_META = createStringMeta($currencycode, 20);
	public static final MCMeta ratetypecode_META = createStringMeta($ratetypecode, 20);
	public static final MCMeta reval_ratetypecode_META = createStringMeta($reval_ratetypecode, 20);
	public static final MCMeta cnsr_ratetype1_META = createStringMeta($cnsr_ratetype1, 2);
	public static final MCMeta cnsr_ratetype2_META = createStringMeta($cnsr_ratetype2, 2);
	public static final MCMeta subincludeflag_META = createNumberMeta($subincludeflag, 1, 0, false);
	public static final MCMeta appraisalconvflag_META = createNumberMeta($appraisalconvflag, 1, 0, false);
	public static final MCMeta vat_flag_META = createNumberMeta($vat_flag, 1, 0, false);
	public static final MCMeta reversingflag_META = createNumberMeta($reversingflag, 1, 0, false);
	public static final MCMeta aparappraisalflag_META = createNumberMeta($aparappraisalflag, 1, 0, false);
	public static final MCMeta aparreversingflag_META = createNumberMeta($aparreversingflag, 1, 0, false);
	public static final MCMeta tax_ac_flag_META = createNumberMeta($tax_ac_flag, 1, 0, false);
	public static final MCMeta taxablecode_META = createStringMeta($taxablecode, 20);
	public static final MCMeta taxtype_META = createNumberMeta($taxtype, 1, 0, false);
	public static final MCMeta taxabletype_META = createNumberMeta($taxabletype, 2, 0, false);
	public static final MCMeta openup_ar_META = createNumberMeta($openup_ar, 1, 0, false);
	public static final MCMeta openup_ap_META = createNumberMeta($openup_ap, 1, 0, false);
	public static final MCMeta openup_acc_META = createNumberMeta($openup_acc, 1, 0, false);
	public static final MCMeta correspondentset_META = createNumberMeta($correspondentset, 1, 0, false);
	public static final MCMeta descriptcontrol_META = createNumberMeta($descriptcontrol, 1, 0, false);
	public static final MCMeta usermaster1control_META = createNumberMeta($usermaster1control, 1, 0, false);
	public static final MCMeta usermaster2control_META = createNumberMeta($usermaster2control, 1, 0, false);
	public static final MCMeta usermaster3control_META = createNumberMeta($usermaster3control, 1, 0, false);
	public static final MCMeta usermaster4control_META = createNumberMeta($usermaster4control, 1, 0, false);
	public static final MCMeta usermaster5control_META = createNumberMeta($usermaster5control, 1, 0, false);
	public static final MCMeta usercodecontrol_META = createNumberMeta($usercodecontrol, 1, 0, false);
	public static final MCMeta usertextcontrol_META = createNumberMeta($usertextcontrol, 1, 0, false);
	public static final MCMeta userdatecontrol_META = createNumberMeta($userdatecontrol, 1, 0, false);
	public static final MCMeta userqtycontrol_META = createNumberMeta($userqtycontrol, 1, 0, false);
	public static final MCMeta correspondentsummary_META = createNumberMeta($correspondentsummary, 1, 0, false);
	public static final MCMeta usermaster1summary_META = createNumberMeta($usermaster1summary, 1, 0, false);
	public static final MCMeta usermaster2summary_META = createNumberMeta($usermaster2summary, 1, 0, false);
	public static final MCMeta usermaster3summary_META = createNumberMeta($usermaster3summary, 1, 0, false);
	public static final MCMeta usermaster4summary_META = createNumberMeta($usermaster4summary, 1, 0, false);
	public static final MCMeta usermaster5summary_META = createNumberMeta($usermaster5summary, 1, 0, false);
	public static final MCMeta userdatesummary_META = createNumberMeta($userdatesummary, 1, 0, false);
	public static final MCMeta userqtysummary_META = createNumberMeta($userqtysummary, 1, 0, false);
	public static final MCMeta pc_ratetype1_META = createStringMeta($pc_ratetype1, 20);
	public static final MCMeta pc_exchangetype1_META = createNumberMeta($pc_exchangetype1, 1, 0, false);
	public static final MCMeta pc_ratetype2_META = createStringMeta($pc_ratetype2, 20);
	public static final MCMeta pc_exchangetype2_META = createNumberMeta($pc_exchangetype2, 1, 0, false);
	public static final MCMeta pc_ratetype3_META = createStringMeta($pc_ratetype3, 20);
	public static final MCMeta pc_exchangetype3_META = createNumberMeta($pc_exchangetype3, 1, 0, false);
	public static final MCMeta safetybalancefc_META = createNumberMeta($safetybalancefc, 17, 0, false);
	public static final MCMeta fstype_META = createStringMeta($fstype, 20);
	public static final MCMeta beginend_META = createNumberMeta($beginend, 1, 0, false);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rectype_META,
			precode_META,
			name_META,
			activeflag_META,
			extension_META,
			searchcharacter_META,
			accounttype_META,
			sp_accounttype_META,
			currencycode_META,
			ratetypecode_META,
			reval_ratetypecode_META,
			cnsr_ratetype1_META,
			cnsr_ratetype2_META,
			subincludeflag_META,
			appraisalconvflag_META,
			vat_flag_META,
			reversingflag_META,
			aparappraisalflag_META,
			aparreversingflag_META,
			tax_ac_flag_META,
			taxablecode_META,
			taxtype_META,
			taxabletype_META,
			openup_ar_META,
			openup_ap_META,
			openup_acc_META,
			correspondentset_META,
			descriptcontrol_META,
			usermaster1control_META,
			usermaster2control_META,
			usermaster3control_META,
			usermaster4control_META,
			usermaster5control_META,
			usercodecontrol_META,
			usertextcontrol_META,
			userdatecontrol_META,
			userqtycontrol_META,
			correspondentsummary_META,
			usermaster1summary_META,
			usermaster2summary_META,
			usermaster3summary_META,
			usermaster4summary_META,
			usermaster5summary_META,
			userdatesummary_META,
			userqtysummary_META,
			pc_ratetype1_META,
			pc_exchangetype1_META,
			pc_ratetype2_META,
			pc_exchangetype2_META,
			pc_ratetype3_META,
			pc_exchangetype3_META,
			safetybalancefc_META,
			fstype_META,
			beginend_META
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
	 * 科目名称
	 */
	public String name() {
		return getConstString(offset + 2, $name);
	}

	/**
	 *  .<p>
	 *
	 * 科目名称
	 */
	public void name(String value) {
		setConstString(offset + 2, $name, value);
	}


	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public MCNumber activeflag() {
		return getConstNumber(offset + 3, $activeflag);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(MCNumber value) {
		setConstNumber(offset + 3, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(int value) {
		setConstNumber(offset + 3, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(long value) {
		setConstNumber(offset + 3, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(float value) {
		setConstNumber(offset + 3, $activeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 活動
	 */
	public void activeflag(double value) {
		setConstNumber(offset + 3, $activeflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public String extension() {
		return getConstString(offset + 4, $extension);
	}

	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public void extension(String value) {
		setConstString(offset + 4, $extension, value);
	}


	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public String searchcharacter() {
		return getConstString(offset + 5, $searchcharacter);
	}

	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public void searchcharacter(String value) {
		setConstString(offset + 5, $searchcharacter, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目区分
	 */
	public String accounttype() {
		return getConstString(offset + 6, $accounttype);
	}

	/**
	 *  .<p>
	 *
	 * 科目区分
	 */
	public void accounttype(String value) {
		setConstString(offset + 6, $accounttype, value);
	}


	/**
	 *  .<p>
	 *
	 * 特別科目区分
	 */
	public String sp_accounttype() {
		return getConstString(offset + 7, $sp_accounttype);
	}

	/**
	 *  .<p>
	 *
	 * 特別科目区分
	 */
	public void sp_accounttype(String value) {
		setConstString(offset + 7, $sp_accounttype, value);
	}


	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public String currencycode() {
		return getConstString(offset + 8, $currencycode);
	}

	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public void currencycode(String value) {
		setConstString(offset + 8, $currencycode, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾚｰﾄﾀｲﾌﾟ
	 */
	public String ratetypecode() {
		return getConstString(offset + 9, $ratetypecode);
	}

	/**
	 *  .<p>
	 *
	 * ﾚｰﾄﾀｲﾌﾟ
	 */
	public void ratetypecode(String value) {
		setConstString(offset + 9, $ratetypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 外貨評価換算ﾚｰﾄﾀｲﾌﾟ
	 */
	public String reval_ratetypecode() {
		return getConstString(offset + 10, $reval_ratetypecode);
	}

	/**
	 *  .<p>
	 *
	 * 外貨評価換算ﾚｰﾄﾀｲﾌﾟ
	 */
	public void reval_ratetypecode(String value) {
		setConstString(offset + 10, $reval_ratetypecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ1
	 */
	public String cnsr_ratetype1() {
		return getConstString(offset + 11, $cnsr_ratetype1);
	}

	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ1
	 */
	public void cnsr_ratetype1(String value) {
		setConstString(offset + 11, $cnsr_ratetype1, value);
	}


	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ2
	 */
	public String cnsr_ratetype2() {
		return getConstString(offset + 12, $cnsr_ratetype2);
	}

	/**
	 *  .<p>
	 *
	 * 連結ﾚｰﾄﾀｲﾌﾟ2
	 */
	public void cnsr_ratetype2(String value) {
		setConstString(offset + 12, $cnsr_ratetype2, value);
	}


	/**
	 *  .<p>
	 *
	 * 補助科目あり
	 */
	public MCNumber subincludeflag() {
		return getConstNumber(offset + 13, $subincludeflag);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目あり
	 */
	public void subincludeflag(MCNumber value) {
		setConstNumber(offset + 13, $subincludeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目あり
	 */
	public void subincludeflag(int value) {
		setConstNumber(offset + 13, $subincludeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目あり
	 */
	public void subincludeflag(long value) {
		setConstNumber(offset + 13, $subincludeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目あり
	 */
	public void subincludeflag(float value) {
		setConstNumber(offset + 13, $subincludeflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目あり
	 */
	public void subincludeflag(double value) {
		setConstNumber(offset + 13, $subincludeflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public MCNumber appraisalconvflag() {
		return getConstNumber(offset + 14, $appraisalconvflag);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(MCNumber value) {
		setConstNumber(offset + 14, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(int value) {
		setConstNumber(offset + 14, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(long value) {
		setConstNumber(offset + 14, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(float value) {
		setConstNumber(offset + 14, $appraisalconvflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 評価換算対象
	 */
	public void appraisalconvflag(double value) {
		setConstNumber(offset + 14, $appraisalconvflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public MCNumber vat_flag() {
		return getConstNumber(offset + 15, $vat_flag);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(MCNumber value) {
		setConstNumber(offset + 15, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(int value) {
		setConstNumber(offset + 15, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(long value) {
		setConstNumber(offset + 15, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(float value) {
		setConstNumber(offset + 15, $vat_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 付加価値税対象
	 */
	public void vat_flag(double value) {
		setConstNumber(offset + 15, $vat_flag, value);
	}


	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public MCNumber reversingflag() {
		return getConstNumber(offset + 16, $reversingflag);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(MCNumber value) {
		setConstNumber(offset + 16, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(int value) {
		setConstNumber(offset + 16, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(long value) {
		setConstNumber(offset + 16, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(float value) {
		setConstNumber(offset + 16, $reversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 洗替対象
	 */
	public void reversingflag(double value) {
		setConstNumber(offset + 16, $reversingflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public MCNumber aparappraisalflag() {
		return getConstNumber(offset + 17, $aparappraisalflag);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(MCNumber value) {
		setConstNumber(offset + 17, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(int value) {
		setConstNumber(offset + 17, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(long value) {
		setConstNumber(offset + 17, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(float value) {
		setConstNumber(offset + 17, $aparappraisalflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務外貨評価換算対象
	 */
	public void aparappraisalflag(double value) {
		setConstNumber(offset + 17, $aparappraisalflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public MCNumber aparreversingflag() {
		return getConstNumber(offset + 18, $aparreversingflag);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(MCNumber value) {
		setConstNumber(offset + 18, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(int value) {
		setConstNumber(offset + 18, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(long value) {
		setConstNumber(offset + 18, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(float value) {
		setConstNumber(offset + 18, $aparreversingflag, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務洗替対象
	 */
	public void aparreversingflag(double value) {
		setConstNumber(offset + 18, $aparreversingflag, value);
	}


	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public MCNumber tax_ac_flag() {
		return getConstNumber(offset + 19, $tax_ac_flag);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(MCNumber value) {
		setConstNumber(offset + 19, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(int value) {
		setConstNumber(offset + 19, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(long value) {
		setConstNumber(offset + 19, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(float value) {
		setConstNumber(offset + 19, $tax_ac_flag, value);
	}

	/**
	 *  .<p>
	 *
	 * 税科目
	 */
	public void tax_ac_flag(double value) {
		setConstNumber(offset + 19, $tax_ac_flag, value);
	}


	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public String taxablecode() {
		return getConstString(offset + 20, $taxablecode);
	}

	/**
	 *  .<p>
	 *
	 * 課税区分
	 */
	public void taxablecode(String value) {
		setConstString(offset + 20, $taxablecode, value);
	}


	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public MCNumber taxtype() {
		return getConstNumber(offset + 21, $taxtype);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(MCNumber value) {
		setConstNumber(offset + 21, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(int value) {
		setConstNumber(offset + 21, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(long value) {
		setConstNumber(offset + 21, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(float value) {
		setConstNumber(offset + 21, $taxtype, value);
	}

	/**
	 *  .<p>
	 *
	 * 内税/外税区分
	 */
	public void taxtype(double value) {
		setConstNumber(offset + 21, $taxtype, value);
	}


	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public MCNumber taxabletype() {
		return getConstNumber(offset + 22, $taxabletype);
	}

	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public void taxabletype(MCNumber value) {
		setConstNumber(offset + 22, $taxabletype, value);
	}

	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public void taxabletype(int value) {
		setConstNumber(offset + 22, $taxabletype, value);
	}

	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public void taxabletype(long value) {
		setConstNumber(offset + 22, $taxabletype, value);
	}

	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public void taxabletype(float value) {
		setConstNumber(offset + 22, $taxabletype, value);
	}

	/**
	 *  .<p>
	 *
	 * 課税分類
	 */
	public void taxabletype(double value) {
		setConstNumber(offset + 22, $taxabletype, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public MCNumber openup_ar() {
		return getConstNumber(offset + 23, $openup_ar);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(MCNumber value) {
		setConstNumber(offset + 23, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(int value) {
		setConstNumber(offset + 23, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(long value) {
		setConstNumber(offset + 23, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(float value) {
		setConstNumber(offset + 23, $openup_ar, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権科目
	 */
	public void openup_ar(double value) {
		setConstNumber(offset + 23, $openup_ar, value);
	}


	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public MCNumber openup_ap() {
		return getConstNumber(offset + 24, $openup_ap);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(MCNumber value) {
		setConstNumber(offset + 24, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(int value) {
		setConstNumber(offset + 24, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(long value) {
		setConstNumber(offset + 24, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(float value) {
		setConstNumber(offset + 24, $openup_ap, value);
	}

	/**
	 *  .<p>
	 *
	 * 債務科目
	 */
	public void openup_ap(double value) {
		setConstNumber(offset + 24, $openup_ap, value);
	}


	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public MCNumber openup_acc() {
		return getConstNumber(offset + 25, $openup_acc);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(MCNumber value) {
		setConstNumber(offset + 25, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(int value) {
		setConstNumber(offset + 25, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(long value) {
		setConstNumber(offset + 25, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(float value) {
		setConstNumber(offset + 25, $openup_acc, value);
	}

	/**
	 *  .<p>
	 *
	 * 債権債務科目に限定
	 */
	public void openup_acc(double value) {
		setConstNumber(offset + 25, $openup_acc, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-入力制御設定
	 */
	public MCNumber correspondentset() {
		return getConstNumber(offset + 26, $correspondentset);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-入力制御設定
	 */
	public void correspondentset(MCNumber value) {
		setConstNumber(offset + 26, $correspondentset, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-入力制御設定
	 */
	public void correspondentset(int value) {
		setConstNumber(offset + 26, $correspondentset, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-入力制御設定
	 */
	public void correspondentset(long value) {
		setConstNumber(offset + 26, $correspondentset, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-入力制御設定
	 */
	public void correspondentset(float value) {
		setConstNumber(offset + 26, $correspondentset, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-入力制御設定
	 */
	public void correspondentset(double value) {
		setConstNumber(offset + 26, $correspondentset, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public MCNumber descriptcontrol() {
		return getConstNumber(offset + 27, $descriptcontrol);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public void descriptcontrol(MCNumber value) {
		setConstNumber(offset + 27, $descriptcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public void descriptcontrol(int value) {
		setConstNumber(offset + 27, $descriptcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public void descriptcontrol(long value) {
		setConstNumber(offset + 27, $descriptcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public void descriptcontrol(float value) {
		setConstNumber(offset + 27, $descriptcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-明細摘要-入力制御設定
	 */
	public void descriptcontrol(double value) {
		setConstNumber(offset + 27, $descriptcontrol, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public MCNumber usermaster1control() {
		return getConstNumber(offset + 28, $usermaster1control);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public void usermaster1control(MCNumber value) {
		setConstNumber(offset + 28, $usermaster1control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public void usermaster1control(int value) {
		setConstNumber(offset + 28, $usermaster1control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public void usermaster1control(long value) {
		setConstNumber(offset + 28, $usermaster1control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public void usermaster1control(float value) {
		setConstNumber(offset + 28, $usermaster1control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-入力制御設定
	 */
	public void usermaster1control(double value) {
		setConstNumber(offset + 28, $usermaster1control, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public MCNumber usermaster2control() {
		return getConstNumber(offset + 29, $usermaster2control);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public void usermaster2control(MCNumber value) {
		setConstNumber(offset + 29, $usermaster2control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public void usermaster2control(int value) {
		setConstNumber(offset + 29, $usermaster2control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public void usermaster2control(long value) {
		setConstNumber(offset + 29, $usermaster2control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public void usermaster2control(float value) {
		setConstNumber(offset + 29, $usermaster2control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-入力制御設定
	 */
	public void usermaster2control(double value) {
		setConstNumber(offset + 29, $usermaster2control, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public MCNumber usermaster3control() {
		return getConstNumber(offset + 30, $usermaster3control);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public void usermaster3control(MCNumber value) {
		setConstNumber(offset + 30, $usermaster3control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public void usermaster3control(int value) {
		setConstNumber(offset + 30, $usermaster3control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public void usermaster3control(long value) {
		setConstNumber(offset + 30, $usermaster3control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public void usermaster3control(float value) {
		setConstNumber(offset + 30, $usermaster3control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-入力制御設定
	 */
	public void usermaster3control(double value) {
		setConstNumber(offset + 30, $usermaster3control, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public MCNumber usermaster4control() {
		return getConstNumber(offset + 31, $usermaster4control);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public void usermaster4control(MCNumber value) {
		setConstNumber(offset + 31, $usermaster4control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public void usermaster4control(int value) {
		setConstNumber(offset + 31, $usermaster4control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public void usermaster4control(long value) {
		setConstNumber(offset + 31, $usermaster4control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public void usermaster4control(float value) {
		setConstNumber(offset + 31, $usermaster4control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-入力制御設定
	 */
	public void usermaster4control(double value) {
		setConstNumber(offset + 31, $usermaster4control, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public MCNumber usermaster5control() {
		return getConstNumber(offset + 32, $usermaster5control);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public void usermaster5control(MCNumber value) {
		setConstNumber(offset + 32, $usermaster5control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public void usermaster5control(int value) {
		setConstNumber(offset + 32, $usermaster5control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public void usermaster5control(long value) {
		setConstNumber(offset + 32, $usermaster5control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public void usermaster5control(float value) {
		setConstNumber(offset + 32, $usermaster5control, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-入力制御設定
	 */
	public void usermaster5control(double value) {
		setConstNumber(offset + 32, $usermaster5control, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public MCNumber usercodecontrol() {
		return getConstNumber(offset + 33, $usercodecontrol);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public void usercodecontrol(MCNumber value) {
		setConstNumber(offset + 33, $usercodecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public void usercodecontrol(int value) {
		setConstNumber(offset + 33, $usercodecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public void usercodecontrol(long value) {
		setConstNumber(offset + 33, $usercodecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public void usercodecontrol(float value) {
		setConstNumber(offset + 33, $usercodecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞｺｰﾄﾞ-入力制御設定
	 */
	public void usercodecontrol(double value) {
		setConstNumber(offset + 33, $usercodecontrol, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public MCNumber usertextcontrol() {
		return getConstNumber(offset + 34, $usertextcontrol);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public void usertextcontrol(MCNumber value) {
		setConstNumber(offset + 34, $usertextcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public void usertextcontrol(int value) {
		setConstNumber(offset + 34, $usertextcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public void usertextcontrol(long value) {
		setConstNumber(offset + 34, $usertextcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public void usertextcontrol(float value) {
		setConstNumber(offset + 34, $usertextcontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾃｷｽﾄ-入力制御設定
	 */
	public void usertextcontrol(double value) {
		setConstNumber(offset + 34, $usertextcontrol, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public MCNumber userdatecontrol() {
		return getConstNumber(offset + 35, $userdatecontrol);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public void userdatecontrol(MCNumber value) {
		setConstNumber(offset + 35, $userdatecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public void userdatecontrol(int value) {
		setConstNumber(offset + 35, $userdatecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public void userdatecontrol(long value) {
		setConstNumber(offset + 35, $userdatecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public void userdatecontrol(float value) {
		setConstNumber(offset + 35, $userdatecontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-入力制御設定
	 */
	public void userdatecontrol(double value) {
		setConstNumber(offset + 35, $userdatecontrol, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public MCNumber userqtycontrol() {
		return getConstNumber(offset + 36, $userqtycontrol);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public void userqtycontrol(MCNumber value) {
		setConstNumber(offset + 36, $userqtycontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public void userqtycontrol(int value) {
		setConstNumber(offset + 36, $userqtycontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public void userqtycontrol(long value) {
		setConstNumber(offset + 36, $userqtycontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public void userqtycontrol(float value) {
		setConstNumber(offset + 36, $userqtycontrol, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-入力制御設定
	 */
	public void userqtycontrol(double value) {
		setConstNumber(offset + 36, $userqtycontrol, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public MCNumber correspondentsummary() {
		return getConstNumber(offset + 37, $correspondentsummary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public void correspondentsummary(MCNumber value) {
		setConstNumber(offset + 37, $correspondentsummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public void correspondentsummary(int value) {
		setConstNumber(offset + 37, $correspondentsummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public void correspondentsummary(long value) {
		setConstNumber(offset + 37, $correspondentsummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public void correspondentsummary(float value) {
		setConstNumber(offset + 37, $correspondentsummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-取引先-年次/月次集計設定
	 */
	public void correspondentsummary(double value) {
		setConstNumber(offset + 37, $correspondentsummary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public MCNumber usermaster1summary() {
		return getConstNumber(offset + 38, $usermaster1summary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public void usermaster1summary(MCNumber value) {
		setConstNumber(offset + 38, $usermaster1summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public void usermaster1summary(int value) {
		setConstNumber(offset + 38, $usermaster1summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public void usermaster1summary(long value) {
		setConstNumber(offset + 38, $usermaster1summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public void usermaster1summary(float value) {
		setConstNumber(offset + 38, $usermaster1summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ1-年次/月次集計設定
	 */
	public void usermaster1summary(double value) {
		setConstNumber(offset + 38, $usermaster1summary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public MCNumber usermaster2summary() {
		return getConstNumber(offset + 39, $usermaster2summary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public void usermaster2summary(MCNumber value) {
		setConstNumber(offset + 39, $usermaster2summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public void usermaster2summary(int value) {
		setConstNumber(offset + 39, $usermaster2summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public void usermaster2summary(long value) {
		setConstNumber(offset + 39, $usermaster2summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public void usermaster2summary(float value) {
		setConstNumber(offset + 39, $usermaster2summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ2-年次/月次集計設定
	 */
	public void usermaster2summary(double value) {
		setConstNumber(offset + 39, $usermaster2summary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public MCNumber usermaster3summary() {
		return getConstNumber(offset + 40, $usermaster3summary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public void usermaster3summary(MCNumber value) {
		setConstNumber(offset + 40, $usermaster3summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public void usermaster3summary(int value) {
		setConstNumber(offset + 40, $usermaster3summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public void usermaster3summary(long value) {
		setConstNumber(offset + 40, $usermaster3summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public void usermaster3summary(float value) {
		setConstNumber(offset + 40, $usermaster3summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ3-年次/月次集計設定
	 */
	public void usermaster3summary(double value) {
		setConstNumber(offset + 40, $usermaster3summary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public MCNumber usermaster4summary() {
		return getConstNumber(offset + 41, $usermaster4summary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public void usermaster4summary(MCNumber value) {
		setConstNumber(offset + 41, $usermaster4summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public void usermaster4summary(int value) {
		setConstNumber(offset + 41, $usermaster4summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public void usermaster4summary(long value) {
		setConstNumber(offset + 41, $usermaster4summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public void usermaster4summary(float value) {
		setConstNumber(offset + 41, $usermaster4summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ4-年次/月次集計設定
	 */
	public void usermaster4summary(double value) {
		setConstNumber(offset + 41, $usermaster4summary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public MCNumber usermaster5summary() {
		return getConstNumber(offset + 42, $usermaster5summary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public void usermaster5summary(MCNumber value) {
		setConstNumber(offset + 42, $usermaster5summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public void usermaster5summary(int value) {
		setConstNumber(offset + 42, $usermaster5summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public void usermaster5summary(long value) {
		setConstNumber(offset + 42, $usermaster5summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public void usermaster5summary(float value) {
		setConstNumber(offset + 42, $usermaster5summary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞﾏｽﾀ5-年次/月次集計設定
	 */
	public void usermaster5summary(double value) {
		setConstNumber(offset + 42, $usermaster5summary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public MCNumber userdatesummary() {
		return getConstNumber(offset + 43, $userdatesummary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public void userdatesummary(MCNumber value) {
		setConstNumber(offset + 43, $userdatesummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public void userdatesummary(int value) {
		setConstNumber(offset + 43, $userdatesummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public void userdatesummary(long value) {
		setConstNumber(offset + 43, $userdatesummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public void userdatesummary(float value) {
		setConstNumber(offset + 43, $userdatesummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ日付-年次/月次集計設定
	 */
	public void userdatesummary(double value) {
		setConstNumber(offset + 43, $userdatesummary, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public MCNumber userqtysummary() {
		return getConstNumber(offset + 44, $userqtysummary);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public void userqtysummary(MCNumber value) {
		setConstNumber(offset + 44, $userqtysummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public void userqtysummary(int value) {
		setConstNumber(offset + 44, $userqtysummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public void userqtysummary(long value) {
		setConstNumber(offset + 44, $userqtysummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public void userqtysummary(float value) {
		setConstNumber(offset + 44, $userqtysummary, value);
	}

	/**
	 *  .<p>
	 *
	 * 科目属性-ﾕｰｻﾞ数量-年次/月次集計設定
	 */
	public void userqtysummary(double value) {
		setConstNumber(offset + 44, $userqtysummary, value);
	}


	/**
	 *  .<p>
	 *
	 * 表示通貨1ﾚｰﾄﾀｲﾌﾟ
	 */
	public String pc_ratetype1() {
		return getConstString(offset + 45, $pc_ratetype1);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨1ﾚｰﾄﾀｲﾌﾟ
	 */
	public void pc_ratetype1(String value) {
		setConstString(offset + 45, $pc_ratetype1, value);
	}


	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public MCNumber pc_exchangetype1() {
		return getConstNumber(offset + 46, $pc_exchangetype1);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public void pc_exchangetype1(MCNumber value) {
		setConstNumber(offset + 46, $pc_exchangetype1, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public void pc_exchangetype1(int value) {
		setConstNumber(offset + 46, $pc_exchangetype1, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public void pc_exchangetype1(long value) {
		setConstNumber(offset + 46, $pc_exchangetype1, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public void pc_exchangetype1(float value) {
		setConstNumber(offset + 46, $pc_exchangetype1, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨1換算基準
	 */
	public void pc_exchangetype1(double value) {
		setConstNumber(offset + 46, $pc_exchangetype1, value);
	}


	/**
	 *  .<p>
	 *
	 * 表示通貨2ﾚｰﾄﾀｲﾌﾟ
	 */
	public String pc_ratetype2() {
		return getConstString(offset + 47, $pc_ratetype2);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨2ﾚｰﾄﾀｲﾌﾟ
	 */
	public void pc_ratetype2(String value) {
		setConstString(offset + 47, $pc_ratetype2, value);
	}


	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public MCNumber pc_exchangetype2() {
		return getConstNumber(offset + 48, $pc_exchangetype2);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public void pc_exchangetype2(MCNumber value) {
		setConstNumber(offset + 48, $pc_exchangetype2, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public void pc_exchangetype2(int value) {
		setConstNumber(offset + 48, $pc_exchangetype2, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public void pc_exchangetype2(long value) {
		setConstNumber(offset + 48, $pc_exchangetype2, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public void pc_exchangetype2(float value) {
		setConstNumber(offset + 48, $pc_exchangetype2, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨2換算基準
	 */
	public void pc_exchangetype2(double value) {
		setConstNumber(offset + 48, $pc_exchangetype2, value);
	}


	/**
	 *  .<p>
	 *
	 * 表示通貨3ﾚｰﾄﾀｲﾌﾟ
	 */
	public String pc_ratetype3() {
		return getConstString(offset + 49, $pc_ratetype3);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨3ﾚｰﾄﾀｲﾌﾟ
	 */
	public void pc_ratetype3(String value) {
		setConstString(offset + 49, $pc_ratetype3, value);
	}


	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public MCNumber pc_exchangetype3() {
		return getConstNumber(offset + 50, $pc_exchangetype3);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public void pc_exchangetype3(MCNumber value) {
		setConstNumber(offset + 50, $pc_exchangetype3, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public void pc_exchangetype3(int value) {
		setConstNumber(offset + 50, $pc_exchangetype3, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public void pc_exchangetype3(long value) {
		setConstNumber(offset + 50, $pc_exchangetype3, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public void pc_exchangetype3(float value) {
		setConstNumber(offset + 50, $pc_exchangetype3, value);
	}

	/**
	 *  .<p>
	 *
	 * 表示通貨3換算基準
	 */
	public void pc_exchangetype3(double value) {
		setConstNumber(offset + 50, $pc_exchangetype3, value);
	}


	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public MCNumber safetybalancefc() {
		return getConstNumber(offset + 51, $safetybalancefc);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(MCNumber value) {
		setConstNumber(offset + 51, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(int value) {
		setConstNumber(offset + 51, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(long value) {
		setConstNumber(offset + 51, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(float value) {
		setConstNumber(offset + 51, $safetybalancefc, value);
	}

	/**
	 *  .<p>
	 *
	 * 安全残高
	 */
	public void safetybalancefc(double value) {
		setConstNumber(offset + 51, $safetybalancefc, value);
	}


	/**
	 *  .<p>
	 *
	 * 財務諸表項目
	 */
	public String fstype() {
		return getConstString(offset + 52, $fstype);
	}

	/**
	 *  .<p>
	 *
	 * 財務諸表項目
	 */
	public void fstype(String value) {
		setConstString(offset + 52, $fstype, value);
	}


	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public MCNumber beginend() {
		return getConstNumber(offset + 53, $beginend);
	}

	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public void beginend(MCNumber value) {
		setConstNumber(offset + 53, $beginend, value);
	}

	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public void beginend(int value) {
		setConstNumber(offset + 53, $beginend, value);
	}

	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public void beginend(long value) {
		setConstNumber(offset + 53, $beginend, value);
	}

	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public void beginend(float value) {
		setConstNumber(offset + 53, $beginend, value);
	}

	/**
	 *  .<p>
	 *
	 * 期首期末識別
	 */
	public void beginend(double value) {
		setConstNumber(offset + 53, $beginend, value);
	}


	public String getString(String name) {
		if ($precode.equalsIgnoreCase(name)) {
			return precode();
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
		if ($accounttype.equalsIgnoreCase(name)) {
			return accounttype();
		}
		if ($sp_accounttype.equalsIgnoreCase(name)) {
			return sp_accounttype();
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
		if ($pc_ratetype1.equalsIgnoreCase(name)) {
			return pc_ratetype1();
		}
		if ($pc_ratetype2.equalsIgnoreCase(name)) {
			return pc_ratetype2();
		}
		if ($pc_ratetype3.equalsIgnoreCase(name)) {
			return pc_ratetype3();
		}
		if ($fstype.equalsIgnoreCase(name)) {
			return fstype();
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			return subincludeflag();
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
		if ($taxtype.equalsIgnoreCase(name)) {
			return taxtype();
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			return taxabletype();
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			return correspondentset();
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			return descriptcontrol();
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			return usermaster1control();
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			return usermaster2control();
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			return usermaster3control();
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			return usermaster4control();
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			return usermaster5control();
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			return usercodecontrol();
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			return usertextcontrol();
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			return userdatecontrol();
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			return userqtycontrol();
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			return correspondentsummary();
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			return usermaster1summary();
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			return usermaster2summary();
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			return usermaster3summary();
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			return usermaster4summary();
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			return usermaster5summary();
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			return userdatesummary();
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			return userqtysummary();
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			return pc_exchangetype1();
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			return pc_exchangetype2();
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			return pc_exchangetype3();
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			return safetybalancefc();
		}
		if ($beginend.equalsIgnoreCase(name)) {
			return beginend();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($precode.equalsIgnoreCase(name)) {
			return precode();
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
		if ($accounttype.equalsIgnoreCase(name)) {
			return accounttype();
		}
		if ($sp_accounttype.equalsIgnoreCase(name)) {
			return sp_accounttype();
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
		if ($pc_ratetype1.equalsIgnoreCase(name)) {
			return pc_ratetype1();
		}
		if ($pc_ratetype2.equalsIgnoreCase(name)) {
			return pc_ratetype2();
		}
		if ($pc_ratetype3.equalsIgnoreCase(name)) {
			return pc_ratetype3();
		}
		if ($fstype.equalsIgnoreCase(name)) {
			return fstype();
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			return subincludeflag();
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
		if ($taxtype.equalsIgnoreCase(name)) {
			return taxtype();
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			return taxabletype();
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			return correspondentset();
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			return descriptcontrol();
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			return usermaster1control();
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			return usermaster2control();
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			return usermaster3control();
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			return usermaster4control();
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			return usermaster5control();
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			return usercodecontrol();
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			return usertextcontrol();
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			return userdatecontrol();
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			return userqtycontrol();
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			return correspondentsummary();
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			return usermaster1summary();
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			return usermaster2summary();
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			return usermaster3summary();
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			return usermaster4summary();
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			return usermaster5summary();
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			return userdatesummary();
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			return userqtysummary();
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			return pc_exchangetype1();
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			return pc_exchangetype2();
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			return pc_exchangetype3();
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			return safetybalancefc();
		}
		if ($beginend.equalsIgnoreCase(name)) {
			return beginend();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($precode.equalsIgnoreCase(name)) {
			precode(value);
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
		if ($accounttype.equalsIgnoreCase(name)) {
			accounttype(value);
			return;
		}
		if ($sp_accounttype.equalsIgnoreCase(name)) {
			sp_accounttype(value);
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
		if ($pc_ratetype1.equalsIgnoreCase(name)) {
			pc_ratetype1(value);
			return;
		}
		if ($pc_ratetype2.equalsIgnoreCase(name)) {
			pc_ratetype2(value);
			return;
		}
		if ($pc_ratetype3.equalsIgnoreCase(name)) {
			pc_ratetype3(value);
			return;
		}
		if ($fstype.equalsIgnoreCase(name)) {
			fstype(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($precode.equalsIgnoreCase(name)) {
			precode(value);
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
		if ($accounttype.equalsIgnoreCase(name)) {
			accounttype(value);
			return;
		}
		if ($sp_accounttype.equalsIgnoreCase(name)) {
			sp_accounttype(value);
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
		if ($pc_ratetype1.equalsIgnoreCase(name)) {
			pc_ratetype1(value);
			return;
		}
		if ($pc_ratetype2.equalsIgnoreCase(name)) {
			pc_ratetype2(value);
			return;
		}
		if ($pc_ratetype3.equalsIgnoreCase(name)) {
			pc_ratetype3(value);
			return;
		}
		if ($fstype.equalsIgnoreCase(name)) {
			fstype(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
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
		if ($subincludeflag.equalsIgnoreCase(name)) {
			subincludeflag(value);
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
		if ($taxtype.equalsIgnoreCase(name)) {
			taxtype(value);
			return;
		}
		if ($taxabletype.equalsIgnoreCase(name)) {
			taxabletype(value);
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
		if ($correspondentset.equalsIgnoreCase(name)) {
			correspondentset(value);
			return;
		}
		if ($descriptcontrol.equalsIgnoreCase(name)) {
			descriptcontrol(value);
			return;
		}
		if ($usermaster1control.equalsIgnoreCase(name)) {
			usermaster1control(value);
			return;
		}
		if ($usermaster2control.equalsIgnoreCase(name)) {
			usermaster2control(value);
			return;
		}
		if ($usermaster3control.equalsIgnoreCase(name)) {
			usermaster3control(value);
			return;
		}
		if ($usermaster4control.equalsIgnoreCase(name)) {
			usermaster4control(value);
			return;
		}
		if ($usermaster5control.equalsIgnoreCase(name)) {
			usermaster5control(value);
			return;
		}
		if ($usercodecontrol.equalsIgnoreCase(name)) {
			usercodecontrol(value);
			return;
		}
		if ($usertextcontrol.equalsIgnoreCase(name)) {
			usertextcontrol(value);
			return;
		}
		if ($userdatecontrol.equalsIgnoreCase(name)) {
			userdatecontrol(value);
			return;
		}
		if ($userqtycontrol.equalsIgnoreCase(name)) {
			userqtycontrol(value);
			return;
		}
		if ($correspondentsummary.equalsIgnoreCase(name)) {
			correspondentsummary(value);
			return;
		}
		if ($usermaster1summary.equalsIgnoreCase(name)) {
			usermaster1summary(value);
			return;
		}
		if ($usermaster2summary.equalsIgnoreCase(name)) {
			usermaster2summary(value);
			return;
		}
		if ($usermaster3summary.equalsIgnoreCase(name)) {
			usermaster3summary(value);
			return;
		}
		if ($usermaster4summary.equalsIgnoreCase(name)) {
			usermaster4summary(value);
			return;
		}
		if ($usermaster5summary.equalsIgnoreCase(name)) {
			usermaster5summary(value);
			return;
		}
		if ($userdatesummary.equalsIgnoreCase(name)) {
			userdatesummary(value);
			return;
		}
		if ($userqtysummary.equalsIgnoreCase(name)) {
			userqtysummary(value);
			return;
		}
		if ($pc_exchangetype1.equalsIgnoreCase(name)) {
			pc_exchangetype1(value);
			return;
		}
		if ($pc_exchangetype2.equalsIgnoreCase(name)) {
			pc_exchangetype2(value);
			return;
		}
		if ($pc_exchangetype3.equalsIgnoreCase(name)) {
			pc_exchangetype3(value);
			return;
		}
		if ($safetybalancefc.equalsIgnoreCase(name)) {
			safetybalancefc(value);
			return;
		}
		if ($beginend.equalsIgnoreCase(name)) {
			beginend(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

