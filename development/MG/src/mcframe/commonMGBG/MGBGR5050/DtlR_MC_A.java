package mcframe.commonMGBG.MGBGR5050;

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
	 *  予算パターンコード.<p>
	 *
	 */
	public static final String $ysn_ptn_code = "ysn_ptn_code";
	/**
	 *  通貨コード.<p>
	 *
	 */
	public static final String $cur_code = "cur_code";
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
	 *  予算額.<p>
	 *
	 */
	public static final String $ysn_kin = "ysn_kin";
	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public static final String $ysn_kin_hif = "ysn_kin_hif";


	public static final MCMeta kai_code_META = createStringMeta($kai_code);
	public static final MCMeta ysn_ptn_code_META = createStringMeta($ysn_ptn_code, 10);
	public static final MCMeta cur_code_META = createStringMeta($cur_code);
	public static final MCMeta fy_META = createNumberMeta($fy);
	public static final MCMeta gtd_META = createNumberMeta($gtd);
	public static final MCMeta kmk_code_META = createStringMeta($kmk_code, 10);
	public static final MCMeta hkm_code_META = createStringMeta($hkm_code, 10);
	public static final MCMeta bmn_code_META = createStringMeta($bmn_code, 20);
	public static final MCMeta fc1_META = createStringMeta($fc1, 50);
	public static final MCMeta fc2_META = createStringMeta($fc2, 50);
	public static final MCMeta fc3_META = createStringMeta($fc3, 50);
	public static final MCMeta fc4_META = createStringMeta($fc4, 50);
	public static final MCMeta prj_code_META = createStringMeta($prj_code, 50);
	public static final MCMeta ysn_kin_META = createNumberMeta($ysn_kin, 21, 8, false);
	public static final MCMeta ysn_kin_hif_META = createNumberMeta($ysn_kin_hif, 21, 8, false);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			kai_code_META,
			ysn_ptn_code_META,
			cur_code_META,
			fy_META,
			gtd_META,
			kmk_code_META,
			hkm_code_META,
			bmn_code_META,
			fc1_META,
			fc2_META,
			fc3_META,
			fc4_META,
			prj_code_META,
			ysn_kin_META,
			ysn_kin_hif_META
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
	 *  予算パターンコード.<p>
	 *
	 */
	public String ysn_ptn_code() {
		return getConstString(offset + 1, $ysn_ptn_code);
	}

	/**
	 *  予算パターンコード.<p>
	 *
	 */
	public void ysn_ptn_code(String value) {
		setConstString(offset + 1, $ysn_ptn_code, value);
	}


	/**
	 *  通貨コード.<p>
	 *
	 */
	public String cur_code() {
		return getConstString(offset + 2, $cur_code);
	}

	/**
	 *  通貨コード.<p>
	 *
	 */
	public void cur_code(String value) {
		setConstString(offset + 2, $cur_code, value);
	}


	/**
	 *  会計期.<p>
	 *
	 */
	public MCNumber fy() {
		return getConstNumber(offset + 3, $fy);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(MCNumber value) {
		setConstNumber(offset + 3, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(int value) {
		setConstNumber(offset + 3, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(long value) {
		setConstNumber(offset + 3, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(float value) {
		setConstNumber(offset + 3, $fy, value);
	}

	/**
	 *  会計期.<p>
	 *
	 */
	public void fy(double value) {
		setConstNumber(offset + 3, $fy, value);
	}


	/**
	 *  会計月度.<p>
	 *
	 */
	public MCNumber gtd() {
		return getConstNumber(offset + 4, $gtd);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(MCNumber value) {
		setConstNumber(offset + 4, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(int value) {
		setConstNumber(offset + 4, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(long value) {
		setConstNumber(offset + 4, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(float value) {
		setConstNumber(offset + 4, $gtd, value);
	}

	/**
	 *  会計月度.<p>
	 *
	 */
	public void gtd(double value) {
		setConstNumber(offset + 4, $gtd, value);
	}


	/**
	 *  科目コード.<p>
	 *
	 */
	public String kmk_code() {
		return getConstString(offset + 5, $kmk_code);
	}

	/**
	 *  科目コード.<p>
	 *
	 */
	public void kmk_code(String value) {
		setConstString(offset + 5, $kmk_code, value);
	}


	/**
	 *  補助科目コード.<p>
	 *
	 */
	public String hkm_code() {
		return getConstString(offset + 6, $hkm_code);
	}

	/**
	 *  補助科目コード.<p>
	 *
	 */
	public void hkm_code(String value) {
		setConstString(offset + 6, $hkm_code, value);
	}


	/**
	 *  部門コード.<p>
	 *
	 */
	public String bmn_code() {
		return getConstString(offset + 7, $bmn_code);
	}

	/**
	 *  部門コード.<p>
	 *
	 */
	public void bmn_code(String value) {
		setConstString(offset + 7, $bmn_code, value);
	}


	/**
	 *  機能コード１.<p>
	 *
	 */
	public String fc1() {
		return getConstString(offset + 8, $fc1);
	}

	/**
	 *  機能コード１.<p>
	 *
	 */
	public void fc1(String value) {
		setConstString(offset + 8, $fc1, value);
	}


	/**
	 *  機能コード２.<p>
	 *
	 */
	public String fc2() {
		return getConstString(offset + 9, $fc2);
	}

	/**
	 *  機能コード２.<p>
	 *
	 */
	public void fc2(String value) {
		setConstString(offset + 9, $fc2, value);
	}


	/**
	 *  機能コード３.<p>
	 *
	 */
	public String fc3() {
		return getConstString(offset + 10, $fc3);
	}

	/**
	 *  機能コード３.<p>
	 *
	 */
	public void fc3(String value) {
		setConstString(offset + 10, $fc3, value);
	}


	/**
	 *  機能コード４.<p>
	 *
	 */
	public String fc4() {
		return getConstString(offset + 11, $fc4);
	}

	/**
	 *  機能コード４.<p>
	 *
	 */
	public void fc4(String value) {
		setConstString(offset + 11, $fc4, value);
	}


	/**
	 *  プロジェクトコード.<p>
	 *
	 */
	public String prj_code() {
		return getConstString(offset + 12, $prj_code);
	}

	/**
	 *  プロジェクトコード.<p>
	 *
	 */
	public void prj_code(String value) {
		setConstString(offset + 12, $prj_code, value);
	}


	/**
	 *  予算額.<p>
	 *
	 */
	public MCNumber ysn_kin() {
		return getConstNumber(offset + 13, $ysn_kin);
	}

	/**
	 *  予算額.<p>
	 *
	 */
	public void ysn_kin(MCNumber value) {
		setConstNumber(offset + 13, $ysn_kin, value);
	}

	/**
	 *  予算額.<p>
	 *
	 */
	public void ysn_kin(int value) {
		setConstNumber(offset + 13, $ysn_kin, value);
	}

	/**
	 *  予算額.<p>
	 *
	 */
	public void ysn_kin(long value) {
		setConstNumber(offset + 13, $ysn_kin, value);
	}

	/**
	 *  予算額.<p>
	 *
	 */
	public void ysn_kin(float value) {
		setConstNumber(offset + 13, $ysn_kin, value);
	}

	/**
	 *  予算額.<p>
	 *
	 */
	public void ysn_kin(double value) {
		setConstNumber(offset + 13, $ysn_kin, value);
	}


	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public MCNumber ysn_kin_hif() {
		return getConstNumber(offset + 14, $ysn_kin_hif);
	}

	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public void ysn_kin_hif(MCNumber value) {
		setConstNumber(offset + 14, $ysn_kin_hif, value);
	}

	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public void ysn_kin_hif(int value) {
		setConstNumber(offset + 14, $ysn_kin_hif, value);
	}

	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public void ysn_kin_hif(long value) {
		setConstNumber(offset + 14, $ysn_kin_hif, value);
	}

	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public void ysn_kin_hif(float value) {
		setConstNumber(offset + 14, $ysn_kin_hif, value);
	}

	/**
	 *  予算額（配賦用）.<p>
	 *
	 */
	public void ysn_kin_hif(double value) {
		setConstNumber(offset + 14, $ysn_kin_hif, value);
	}


	public String getString(String name) {
		if ($kai_code.equalsIgnoreCase(name)) {
			return kai_code();
		}
		if ($ysn_ptn_code.equalsIgnoreCase(name)) {
			return ysn_ptn_code();
		}
		if ($cur_code.equalsIgnoreCase(name)) {
			return cur_code();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($fy.equalsIgnoreCase(name)) {
			return fy();
		}
		if ($gtd.equalsIgnoreCase(name)) {
			return gtd();
		}
		if ($ysn_kin.equalsIgnoreCase(name)) {
			return ysn_kin();
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			return ysn_kin_hif();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($kai_code.equalsIgnoreCase(name)) {
			return kai_code();
		}
		if ($ysn_ptn_code.equalsIgnoreCase(name)) {
			return ysn_ptn_code();
		}
		if ($cur_code.equalsIgnoreCase(name)) {
			return cur_code();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($fy.equalsIgnoreCase(name)) {
			return fy();
		}
		if ($gtd.equalsIgnoreCase(name)) {
			return gtd();
		}
		if ($ysn_kin.equalsIgnoreCase(name)) {
			return ysn_kin();
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			return ysn_kin_hif();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($kai_code.equalsIgnoreCase(name)) {
			kai_code(value);
			return;
		}
		if ($ysn_ptn_code.equalsIgnoreCase(name)) {
			ysn_ptn_code(value);
			return;
		}
		if ($cur_code.equalsIgnoreCase(name)) {
			cur_code(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($kai_code.equalsIgnoreCase(name)) {
			kai_code(value);
			return;
		}
		if ($ysn_ptn_code.equalsIgnoreCase(name)) {
			ysn_ptn_code(value);
			return;
		}
		if ($cur_code.equalsIgnoreCase(name)) {
			cur_code(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
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
		if ($ysn_kin.equalsIgnoreCase(name)) {
			ysn_kin(value);
			return;
		}
		if ($ysn_kin_hif.equalsIgnoreCase(name)) {
			ysn_kin_hif(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

