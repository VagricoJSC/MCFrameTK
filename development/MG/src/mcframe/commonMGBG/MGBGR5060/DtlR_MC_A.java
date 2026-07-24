package mcframe.commonMGBG.MGBGR5060;

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
	 *  会社コード.<p>
	 *
	 */
	public static final String $kai_code = "kai_code";
	/**
	 *  会計期.<p>
	 *
	 */
	public static final String $fy = "fy";
	/**
	 *  会計月度.<p>
	 *
	 */
	public static final String $gtd = "gtd";
	/**
	 *  決算区分.<p>
	 *
	 */
	public static final String $ksn_kbn = "ksn_kbn";
	/**
	 *  科目コード.<p>
	 *
	 */
	public static final String $kmk_code = "kmk_code";
	/**
	 *  補助科目コード.<p>
	 *
	 */
	public static final String $hkm_code = "hkm_code";
	/**
	 *  部門コード.<p>
	 *
	 */
	public static final String $bmn_code = "bmn_code";
	/**
	 *  機能コード１.<p>
	 *
	 */
	public static final String $fc1 = "fc1";
	/**
	 *  機能コード２.<p>
	 *
	 */
	public static final String $fc2 = "fc2";
	/**
	 *  機能コード３.<p>
	 *
	 */
	public static final String $fc3 = "fc3";
	/**
	 *  機能コード４.<p>
	 *
	 */
	public static final String $fc4 = "fc4";
	/**
	 *  プロジェクトコード.<p>
	 *
	 */
	public static final String $prj_code = "prj_code";
	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public static final String $dr_zan = "dr_zan";
	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public static final String $cr_zan = "cr_zan";
	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public static final String $dr_zan_hif = "dr_zan_hif";
	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public static final String $cr_zan_hif = "cr_zan_hif";
	/**
	 *  取引通貨コード.<p>
	 *
	 */
	public static final String $tor_cur_code = "tor_cur_code";
	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public static final String $dr_tor_cur_zan = "dr_tor_cur_zan";
	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public static final String $cr_tor_cur_zan = "cr_tor_cur_zan";
	/**
	 *  発生会計期.<p>
	 *
	 */
	public static final String $accrual_fy = "accrual_fy";
	/**
	 *  制度遡及区分.<p>
	 *
	 */
	public static final String $seido_sokyu_kbn = "seido_sokyu_kbn";


	public static final MCMeta kai_code_META = createStringMeta($kai_code);
	public static final MCMeta fy_META = createNumberMeta($fy);
	public static final MCMeta gtd_META = createNumberMeta($gtd);
	public static final MCMeta ksn_kbn_META = createStringMeta($ksn_kbn);
	public static final MCMeta kmk_code_META = createStringMeta($kmk_code, 10);
	public static final MCMeta hkm_code_META = createStringMeta($hkm_code, 10);
	public static final MCMeta bmn_code_META = createStringMeta($bmn_code, 20);
	public static final MCMeta fc1_META = createStringMeta($fc1, 50);
	public static final MCMeta fc2_META = createStringMeta($fc2, 50);
	public static final MCMeta fc3_META = createStringMeta($fc3, 50);
	public static final MCMeta fc4_META = createStringMeta($fc4, 50);
	public static final MCMeta prj_code_META = createStringMeta($prj_code, 50);
	public static final MCMeta dr_zan_META = createNumberMeta($dr_zan, 21, 8, false);
	public static final MCMeta cr_zan_META = createNumberMeta($cr_zan, 21, 8, false);
	public static final MCMeta dr_zan_hif_META = createNumberMeta($dr_zan_hif, 21, 8, false);
	public static final MCMeta cr_zan_hif_META = createNumberMeta($cr_zan_hif, 21, 8, false);
	public static final MCMeta tor_cur_code_META = createStringMeta($tor_cur_code);
	public static final MCMeta dr_tor_cur_zan_META = createNumberMeta($dr_tor_cur_zan);
	public static final MCMeta cr_tor_cur_zan_META = createNumberMeta($cr_tor_cur_zan);
	public static final MCMeta accrual_fy_META = createStringMeta($accrual_fy);
	public static final MCMeta seido_sokyu_kbn_META = createStringMeta($seido_sokyu_kbn);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			kai_code_META,
			fy_META,
			gtd_META,
			ksn_kbn_META,
			kmk_code_META,
			hkm_code_META,
			bmn_code_META,
			fc1_META,
			fc2_META,
			fc3_META,
			fc4_META,
			prj_code_META,
			dr_zan_META,
			cr_zan_META,
			dr_zan_hif_META,
			cr_zan_hif_META,
			tor_cur_code_META,
			dr_tor_cur_zan_META,
			cr_tor_cur_zan_META,
			accrual_fy_META,
			seido_sokyu_kbn_META
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
	 *  会社コード.<p>
	 *
	 */
	public String kai_code() {
		return getConstString(offset + 0, $kai_code);
	}

	/**
	 *  会社コード.<p>
	 *
	 */
	public void kai_code(String value) {
		setConstString(offset + 0, $kai_code, value);
	}


	/**
	 *  会計期.<p>
	 *
	 */
	public MCNumber fy() {
		return getConstNumber(offset + 1, $fy);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(MCNumber value) {
		setConstNumber(offset + 1, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(int value) {
		setConstNumber(offset + 1, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(long value) {
		setConstNumber(offset + 1, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(float value) {
		setConstNumber(offset + 1, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(double value) {
		setConstNumber(offset + 1, $fy, value);
	}


	/**
	 *  会計月度.<p>
	 *
	 */
	public MCNumber gtd() {
		return getConstNumber(offset + 2, $gtd);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(MCNumber value) {
		setConstNumber(offset + 2, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(int value) {
		setConstNumber(offset + 2, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(long value) {
		setConstNumber(offset + 2, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(float value) {
		setConstNumber(offset + 2, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(double value) {
		setConstNumber(offset + 2, $gtd, value);
	}


	/**
	 *  決算区分.<p>
	 *
	 */
	public String ksn_kbn() {
		return getConstString(offset + 3, $ksn_kbn);
	}

	/**
	 *  決算区分.<p>
	 *
	 */
	public void ksn_kbn(String value) {
		setConstString(offset + 3, $ksn_kbn, value);
	}


	/**
	 *  科目コード.<p>
	 *
	 */
	public String kmk_code() {
		return getConstString(offset + 4, $kmk_code);
	}

	/**
	 *  科目コード.<p>
	 *
	 */
	public void kmk_code(String value) {
		setConstString(offset + 4, $kmk_code, value);
	}


	/**
	 *  補助科目コード.<p>
	 *
	 */
	public String hkm_code() {
		return getConstString(offset + 5, $hkm_code);
	}

	/**
	 *  補助科目コード.<p>
	 *
	 */
	public void hkm_code(String value) {
		setConstString(offset + 5, $hkm_code, value);
	}


	/**
	 *  部門コード.<p>
	 *
	 */
	public String bmn_code() {
		return getConstString(offset + 6, $bmn_code);
	}

	/**
	 *  部門コード.<p>
	 *
	 */
	public void bmn_code(String value) {
		setConstString(offset + 6, $bmn_code, value);
	}


	/**
	 *  機能コード１.<p>
	 *
	 */
	public String fc1() {
		return getConstString(offset + 7, $fc1);
	}

	/**
	 *  機能コード１.<p>
	 *
	 */
	public void fc1(String value) {
		setConstString(offset + 7, $fc1, value);
	}


	/**
	 *  機能コード２.<p>
	 *
	 */
	public String fc2() {
		return getConstString(offset + 8, $fc2);
	}

	/**
	 *  機能コード２.<p>
	 *
	 */
	public void fc2(String value) {
		setConstString(offset + 8, $fc2, value);
	}


	/**
	 *  機能コード３.<p>
	 *
	 */
	public String fc3() {
		return getConstString(offset + 9, $fc3);
	}

	/**
	 *  機能コード３.<p>
	 *
	 */
	public void fc3(String value) {
		setConstString(offset + 9, $fc3, value);
	}


	/**
	 *  機能コード４.<p>
	 *
	 */
	public String fc4() {
		return getConstString(offset + 10, $fc4);
	}

	/**
	 *  機能コード４.<p>
	 *
	 */
	public void fc4(String value) {
		setConstString(offset + 10, $fc4, value);
	}


	/**
	 *  プロジェクトコード.<p>
	 *
	 */
	public String prj_code() {
		return getConstString(offset + 11, $prj_code);
	}

	/**
	 *  プロジェクトコード.<p>
	 *
	 */
	public void prj_code(String value) {
		setConstString(offset + 11, $prj_code, value);
	}


	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public MCNumber dr_zan() {
		return getConstNumber(offset + 12, $dr_zan);
	}

	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public void dr_zan(MCNumber value) {
		setConstNumber(offset + 12, $dr_zan, value);
	}

	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public void dr_zan(int value) {
		setConstNumber(offset + 12, $dr_zan, value);
	}

	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public void dr_zan(long value) {
		setConstNumber(offset + 12, $dr_zan, value);
	}

	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public void dr_zan(float value) {
		setConstNumber(offset + 12, $dr_zan, value);
	}

	/**
	 *  借方残高（発生用）.<p>
	 *
	 */
	public void dr_zan(double value) {
		setConstNumber(offset + 12, $dr_zan, value);
	}


	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public MCNumber cr_zan() {
		return getConstNumber(offset + 13, $cr_zan);
	}

	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public void cr_zan(MCNumber value) {
		setConstNumber(offset + 13, $cr_zan, value);
	}

	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public void cr_zan(int value) {
		setConstNumber(offset + 13, $cr_zan, value);
	}

	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public void cr_zan(long value) {
		setConstNumber(offset + 13, $cr_zan, value);
	}

	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public void cr_zan(float value) {
		setConstNumber(offset + 13, $cr_zan, value);
	}

	/**
	 *  貸方残高（発生用）.<p>
	 *
	 */
	public void cr_zan(double value) {
		setConstNumber(offset + 13, $cr_zan, value);
	}


	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public MCNumber dr_zan_hif() {
		return getConstNumber(offset + 14, $dr_zan_hif);
	}

	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public void dr_zan_hif(MCNumber value) {
		setConstNumber(offset + 14, $dr_zan_hif, value);
	}

	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public void dr_zan_hif(int value) {
		setConstNumber(offset + 14, $dr_zan_hif, value);
	}

	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public void dr_zan_hif(long value) {
		setConstNumber(offset + 14, $dr_zan_hif, value);
	}

	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public void dr_zan_hif(float value) {
		setConstNumber(offset + 14, $dr_zan_hif, value);
	}

	/**
	 *  借方残高（配賦用）.<p>
	 *
	 */
	public void dr_zan_hif(double value) {
		setConstNumber(offset + 14, $dr_zan_hif, value);
	}


	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public MCNumber cr_zan_hif() {
		return getConstNumber(offset + 15, $cr_zan_hif);
	}

	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public void cr_zan_hif(MCNumber value) {
		setConstNumber(offset + 15, $cr_zan_hif, value);
	}

	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public void cr_zan_hif(int value) {
		setConstNumber(offset + 15, $cr_zan_hif, value);
	}

	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public void cr_zan_hif(long value) {
		setConstNumber(offset + 15, $cr_zan_hif, value);
	}

	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public void cr_zan_hif(float value) {
		setConstNumber(offset + 15, $cr_zan_hif, value);
	}

	/**
	 *  貸方残高（配賦用）.<p>
	 *
	 */
	public void cr_zan_hif(double value) {
		setConstNumber(offset + 15, $cr_zan_hif, value);
	}


	/**
	 *  取引通貨コード.<p>
	 *
	 */
	public String tor_cur_code() {
		return getConstString(offset + 16, $tor_cur_code);
	}

	/**
	 *  取引通貨コード.<p>
	 *
	 */
	public void tor_cur_code(String value) {
		setConstString(offset + 16, $tor_cur_code, value);
	}


	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public MCNumber dr_tor_cur_zan() {
		return getConstNumber(offset + 17, $dr_tor_cur_zan);
	}

	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public void dr_tor_cur_zan(MCNumber value) {
		setConstNumber(offset + 17, $dr_tor_cur_zan, value);
	}

	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public void dr_tor_cur_zan(int value) {
		setConstNumber(offset + 17, $dr_tor_cur_zan, value);
	}

	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public void dr_tor_cur_zan(long value) {
		setConstNumber(offset + 17, $dr_tor_cur_zan, value);
	}

	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public void dr_tor_cur_zan(float value) {
		setConstNumber(offset + 17, $dr_tor_cur_zan, value);
	}

	/**
	 *  借方取引通貨残高（発生用）.<p>
	 *
	 */
	public void dr_tor_cur_zan(double value) {
		setConstNumber(offset + 17, $dr_tor_cur_zan, value);
	}


	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public MCNumber cr_tor_cur_zan() {
		return getConstNumber(offset + 18, $cr_tor_cur_zan);
	}

	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public void cr_tor_cur_zan(MCNumber value) {
		setConstNumber(offset + 18, $cr_tor_cur_zan, value);
	}

	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public void cr_tor_cur_zan(int value) {
		setConstNumber(offset + 18, $cr_tor_cur_zan, value);
	}

	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public void cr_tor_cur_zan(long value) {
		setConstNumber(offset + 18, $cr_tor_cur_zan, value);
	}

	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public void cr_tor_cur_zan(float value) {
		setConstNumber(offset + 18, $cr_tor_cur_zan, value);
	}

	/**
	 *  貸方取引通貨残高（発生用）.<p>
	 *
	 */
	public void cr_tor_cur_zan(double value) {
		setConstNumber(offset + 18, $cr_tor_cur_zan, value);
	}


	/**
	 *  発生会計期.<p>
	 *
	 */
	public String accrual_fy() {
		return getConstString(offset + 19, $accrual_fy);
	}

	/**
	 *  発生会計期.<p>
	 *
	 */
	public void accrual_fy(String value) {
		setConstString(offset + 19, $accrual_fy, value);
	}


	/**
	 *  制度遡及区分.<p>
	 *
	 */
	public String seido_sokyu_kbn() {
		return getConstString(offset + 20, $seido_sokyu_kbn);
	}

	/**
	 *  制度遡及区分.<p>
	 *
	 */
	public void seido_sokyu_kbn(String value) {
		setConstString(offset + 20, $seido_sokyu_kbn, value);
	}


	public String getString(String name) {
		if ($kai_code.equalsIgnoreCase(name)) {
			return kai_code();
		}
		if ($ksn_kbn.equalsIgnoreCase(name)) {
			return ksn_kbn();
		}
		if ($kmk_code.equalsIgnoreCase(name)) {
			return kmk_code();
		}
		if ($hkm_code.equalsIgnoreCase(name)) {
			return hkm_code();
		}
		if ($bmn_code.equalsIgnoreCase(name)) {
			return bmn_code();
		}
		if ($fc1.equalsIgnoreCase(name)) {
			return fc1();
		}
		if ($fc2.equalsIgnoreCase(name)) {
			return fc2();
		}
		if ($fc3.equalsIgnoreCase(name)) {
			return fc3();
		}
		if ($fc4.equalsIgnoreCase(name)) {
			return fc4();
		}
		if ($prj_code.equalsIgnoreCase(name)) {
			return prj_code();
		}
		if ($tor_cur_code.equalsIgnoreCase(name)) {
			return tor_cur_code();
		}
		if ($accrual_fy.equalsIgnoreCase(name)) {
			return accrual_fy();
		}
		if ($seido_sokyu_kbn.equalsIgnoreCase(name)) {
			return seido_sokyu_kbn();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($fy.equalsIgnoreCase(name)) {
			return fy();
		}
		if ($gtd.equalsIgnoreCase(name)) {
			return gtd();
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			return dr_zan();
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			return cr_zan();
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			return dr_zan_hif();
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			return cr_zan_hif();
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			return dr_tor_cur_zan();
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			return cr_tor_cur_zan();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($kai_code.equalsIgnoreCase(name)) {
			return kai_code();
		}
		if ($ksn_kbn.equalsIgnoreCase(name)) {
			return ksn_kbn();
		}
		if ($kmk_code.equalsIgnoreCase(name)) {
			return kmk_code();
		}
		if ($hkm_code.equalsIgnoreCase(name)) {
			return hkm_code();
		}
		if ($bmn_code.equalsIgnoreCase(name)) {
			return bmn_code();
		}
		if ($fc1.equalsIgnoreCase(name)) {
			return fc1();
		}
		if ($fc2.equalsIgnoreCase(name)) {
			return fc2();
		}
		if ($fc3.equalsIgnoreCase(name)) {
			return fc3();
		}
		if ($fc4.equalsIgnoreCase(name)) {
			return fc4();
		}
		if ($prj_code.equalsIgnoreCase(name)) {
			return prj_code();
		}
		if ($tor_cur_code.equalsIgnoreCase(name)) {
			return tor_cur_code();
		}
		if ($accrual_fy.equalsIgnoreCase(name)) {
			return accrual_fy();
		}
		if ($seido_sokyu_kbn.equalsIgnoreCase(name)) {
			return seido_sokyu_kbn();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($fy.equalsIgnoreCase(name)) {
			return fy();
		}
		if ($gtd.equalsIgnoreCase(name)) {
			return gtd();
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			return dr_zan();
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			return cr_zan();
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			return dr_zan_hif();
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			return cr_zan_hif();
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			return dr_tor_cur_zan();
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			return cr_tor_cur_zan();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($kai_code.equalsIgnoreCase(name)) {
			kai_code(value);
			return;
		}
		if ($ksn_kbn.equalsIgnoreCase(name)) {
			ksn_kbn(value);
			return;
		}
		if ($kmk_code.equalsIgnoreCase(name)) {
			kmk_code(value);
			return;
		}
		if ($hkm_code.equalsIgnoreCase(name)) {
			hkm_code(value);
			return;
		}
		if ($bmn_code.equalsIgnoreCase(name)) {
			bmn_code(value);
			return;
		}
		if ($fc1.equalsIgnoreCase(name)) {
			fc1(value);
			return;
		}
		if ($fc2.equalsIgnoreCase(name)) {
			fc2(value);
			return;
		}
		if ($fc3.equalsIgnoreCase(name)) {
			fc3(value);
			return;
		}
		if ($fc4.equalsIgnoreCase(name)) {
			fc4(value);
			return;
		}
		if ($prj_code.equalsIgnoreCase(name)) {
			prj_code(value);
			return;
		}
		if ($tor_cur_code.equalsIgnoreCase(name)) {
			tor_cur_code(value);
			return;
		}
		if ($accrual_fy.equalsIgnoreCase(name)) {
			accrual_fy(value);
			return;
		}
		if ($seido_sokyu_kbn.equalsIgnoreCase(name)) {
			seido_sokyu_kbn(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($kai_code.equalsIgnoreCase(name)) {
			kai_code(value);
			return;
		}
		if ($ksn_kbn.equalsIgnoreCase(name)) {
			ksn_kbn(value);
			return;
		}
		if ($kmk_code.equalsIgnoreCase(name)) {
			kmk_code(value);
			return;
		}
		if ($hkm_code.equalsIgnoreCase(name)) {
			hkm_code(value);
			return;
		}
		if ($bmn_code.equalsIgnoreCase(name)) {
			bmn_code(value);
			return;
		}
		if ($fc1.equalsIgnoreCase(name)) {
			fc1(value);
			return;
		}
		if ($fc2.equalsIgnoreCase(name)) {
			fc2(value);
			return;
		}
		if ($fc3.equalsIgnoreCase(name)) {
			fc3(value);
			return;
		}
		if ($fc4.equalsIgnoreCase(name)) {
			fc4(value);
			return;
		}
		if ($prj_code.equalsIgnoreCase(name)) {
			prj_code(value);
			return;
		}
		if ($tor_cur_code.equalsIgnoreCase(name)) {
			tor_cur_code(value);
			return;
		}
		if ($accrual_fy.equalsIgnoreCase(name)) {
			accrual_fy(value);
			return;
		}
		if ($seido_sokyu_kbn.equalsIgnoreCase(name)) {
			seido_sokyu_kbn(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($fy.equalsIgnoreCase(name)) {
			fy(value);
			return;
		}
		if ($gtd.equalsIgnoreCase(name)) {
			gtd(value);
			return;
		}
		if ($dr_zan.equalsIgnoreCase(name)) {
			dr_zan(value);
			return;
		}
		if ($cr_zan.equalsIgnoreCase(name)) {
			cr_zan(value);
			return;
		}
		if ($dr_zan_hif.equalsIgnoreCase(name)) {
			dr_zan_hif(value);
			return;
		}
		if ($cr_zan_hif.equalsIgnoreCase(name)) {
			cr_zan_hif(value);
			return;
		}
		if ($dr_tor_cur_zan.equalsIgnoreCase(name)) {
			dr_tor_cur_zan(value);
			return;
		}
		if ($cr_tor_cur_zan.equalsIgnoreCase(name)) {
			cr_tor_cur_zan(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

