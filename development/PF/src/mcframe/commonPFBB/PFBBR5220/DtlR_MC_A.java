package mcframe.commonPFBB.PFBBR5220;

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
	 * 部門区分
	 */
	public static final String $departmenttype = "departmenttype";
	/**
	 *  .<p>
	 *
	 * コード
	 */
	public static final String $code = "code";
	/**
	 *  .<p>
	 *
	 * 名称
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
	 * 郵便番号
	 */
	public static final String $zip = "zip";
	/**
	 *  .<p>
	 *
	 * 所在地1
	 */
	public static final String $address1 = "address1";
	/**
	 *  .<p>
	 *
	 * 所在地2
	 */
	public static final String $address2 = "address2";
	/**
	 *  .<p>
	 *
	 * TEL1
	 */
	public static final String $tel1 = "tel1";
	/**
	 *  .<p>
	 *
	 * TEL2
	 */
	public static final String $tel2 = "tel2";
	/**
	 *  .<p>
	 *
	 * FAX
	 */
	public static final String $fax = "fax";
	/**
	 *  .<p>
	 *
	 * 払出倉庫
	 */
	public static final String $paymentwarehouse = "paymentwarehouse";
	/**
	 *  .<p>
	 *
	 * ﾛｹｰｼｮﾝ
	 */
	public static final String $location = "location";
	/**
	 *  .<p>
	 *
	 * BookNo.接頭文字
	 */
	public static final String $bookno_numbering_flag = "bookno_numbering_flag";
	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public static final String $mfgflg = "mfgflg";


	public static final MCMeta departmenttype_META = createNumberMeta($departmenttype, 1, 0, false);
	public static final MCMeta code_META = createStringMeta($code, 20);
	public static final MCMeta name_META = createStringMeta($name, 100);
	public static final MCMeta activeflag_META = createNumberMeta($activeflag, 1, 0, false);
	public static final MCMeta extension_META = createStringMeta($extension, 2);
	public static final MCMeta searchcharacter_META = createStringMeta($searchcharacter, 1);
	public static final MCMeta zip_META = createStringMeta($zip, 50);
	public static final MCMeta address1_META = createStringMeta($address1, 250);
	public static final MCMeta address2_META = createStringMeta($address2, 250);
	public static final MCMeta tel1_META = createStringMeta($tel1, 50);
	public static final MCMeta tel2_META = createStringMeta($tel2, 50);
	public static final MCMeta fax_META = createStringMeta($fax, 50);
	public static final MCMeta paymentwarehouse_META = createStringMeta($paymentwarehouse, 20);
	public static final MCMeta location_META = createStringMeta($location, 20);
	public static final MCMeta bookno_numbering_flag_META = createStringMeta($bookno_numbering_flag, 20);
	public static final MCMeta mfgflg_META = createNumberMeta($mfgflg, 1, 0, false);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			departmenttype_META,
			code_META,
			name_META,
			activeflag_META,
			extension_META,
			searchcharacter_META,
			zip_META,
			address1_META,
			address2_META,
			tel1_META,
			tel2_META,
			fax_META,
			paymentwarehouse_META,
			location_META,
			bookno_numbering_flag_META,
			mfgflg_META
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
	 * 部門区分
	 */
	public MCNumber departmenttype() {
		return getConstNumber(offset + 0, $departmenttype);
	}

	/**
	 *  .<p>
	 *
	 * 部門区分
	 */
	public void departmenttype(MCNumber value) {
		setConstNumber(offset + 0, $departmenttype, value);
	}

	/**
	 *  .<p>
	 *
	 * 部門区分
	 */
	public void departmenttype(int value) {
		setConstNumber(offset + 0, $departmenttype, value);
	}

	/**
	 *  .<p>
	 *
	 * 部門区分
	 */
	public void departmenttype(long value) {
		setConstNumber(offset + 0, $departmenttype, value);
	}

	/**
	 *  .<p>
	 *
	 * 部門区分
	 */
	public void departmenttype(float value) {
		setConstNumber(offset + 0, $departmenttype, value);
	}

	/**
	 *  .<p>
	 *
	 * 部門区分
	 */
	public void departmenttype(double value) {
		setConstNumber(offset + 0, $departmenttype, value);
	}


	/**
	 *  .<p>
	 *
	 * コード
	 */
	public String code() {
		return getConstString(offset + 1, $code);
	}

	/**
	 *  .<p>
	 *
	 * コード
	 */
	public void code(String value) {
		setConstString(offset + 1, $code, value);
	}


	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public String name() {
		return getConstString(offset + 2, $name);
	}

	/**
	 *  .<p>
	 *
	 * 名称
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
	 * 郵便番号
	 */
	public String zip() {
		return getConstString(offset + 6, $zip);
	}

	/**
	 *  .<p>
	 *
	 * 郵便番号
	 */
	public void zip(String value) {
		setConstString(offset + 6, $zip, value);
	}


	/**
	 *  .<p>
	 *
	 * 所在地1
	 */
	public String address1() {
		return getConstString(offset + 7, $address1);
	}

	/**
	 *  .<p>
	 *
	 * 所在地1
	 */
	public void address1(String value) {
		setConstString(offset + 7, $address1, value);
	}


	/**
	 *  .<p>
	 *
	 * 所在地2
	 */
	public String address2() {
		return getConstString(offset + 8, $address2);
	}

	/**
	 *  .<p>
	 *
	 * 所在地2
	 */
	public void address2(String value) {
		setConstString(offset + 8, $address2, value);
	}


	/**
	 *  .<p>
	 *
	 * TEL1
	 */
	public String tel1() {
		return getConstString(offset + 9, $tel1);
	}

	/**
	 *  .<p>
	 *
	 * TEL1
	 */
	public void tel1(String value) {
		setConstString(offset + 9, $tel1, value);
	}


	/**
	 *  .<p>
	 *
	 * TEL2
	 */
	public String tel2() {
		return getConstString(offset + 10, $tel2);
	}

	/**
	 *  .<p>
	 *
	 * TEL2
	 */
	public void tel2(String value) {
		setConstString(offset + 10, $tel2, value);
	}


	/**
	 *  .<p>
	 *
	 * FAX
	 */
	public String fax() {
		return getConstString(offset + 11, $fax);
	}

	/**
	 *  .<p>
	 *
	 * FAX
	 */
	public void fax(String value) {
		setConstString(offset + 11, $fax, value);
	}


	/**
	 *  .<p>
	 *
	 * 払出倉庫
	 */
	public String paymentwarehouse() {
		return getConstString(offset + 12, $paymentwarehouse);
	}

	/**
	 *  .<p>
	 *
	 * 払出倉庫
	 */
	public void paymentwarehouse(String value) {
		setConstString(offset + 12, $paymentwarehouse, value);
	}


	/**
	 *  .<p>
	 *
	 * ﾛｹｰｼｮﾝ
	 */
	public String location() {
		return getConstString(offset + 13, $location);
	}

	/**
	 *  .<p>
	 *
	 * ﾛｹｰｼｮﾝ
	 */
	public void location(String value) {
		setConstString(offset + 13, $location, value);
	}


	/**
	 *  .<p>
	 *
	 * BookNo.接頭文字
	 */
	public String bookno_numbering_flag() {
		return getConstString(offset + 14, $bookno_numbering_flag);
	}

	/**
	 *  .<p>
	 *
	 * BookNo.接頭文字
	 */
	public void bookno_numbering_flag(String value) {
		setConstString(offset + 14, $bookno_numbering_flag, value);
	}


	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public MCNumber mfgflg() {
		return getConstNumber(offset + 15, $mfgflg);
	}

	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public void mfgflg(MCNumber value) {
		setConstNumber(offset + 15, $mfgflg, value);
	}

	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public void mfgflg(int value) {
		setConstNumber(offset + 15, $mfgflg, value);
	}

	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public void mfgflg(long value) {
		setConstNumber(offset + 15, $mfgflg, value);
	}

	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public void mfgflg(float value) {
		setConstNumber(offset + 15, $mfgflg, value);
	}

	/**
	 *  .<p>
	 *
	 * 製造部門区分
	 */
	public void mfgflg(double value) {
		setConstNumber(offset + 15, $mfgflg, value);
	}


	public String getString(String name) {
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
		if ($zip.equalsIgnoreCase(name)) {
			return zip();
		}
		if ($address1.equalsIgnoreCase(name)) {
			return address1();
		}
		if ($address2.equalsIgnoreCase(name)) {
			return address2();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($paymentwarehouse.equalsIgnoreCase(name)) {
			return paymentwarehouse();
		}
		if ($location.equalsIgnoreCase(name)) {
			return location();
		}
		if ($bookno_numbering_flag.equalsIgnoreCase(name)) {
			return bookno_numbering_flag();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			return departmenttype();
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			return activeflag();
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			return mfgflg();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
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
		if ($zip.equalsIgnoreCase(name)) {
			return zip();
		}
		if ($address1.equalsIgnoreCase(name)) {
			return address1();
		}
		if ($address2.equalsIgnoreCase(name)) {
			return address2();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($paymentwarehouse.equalsIgnoreCase(name)) {
			return paymentwarehouse();
		}
		if ($location.equalsIgnoreCase(name)) {
			return location();
		}
		if ($bookno_numbering_flag.equalsIgnoreCase(name)) {
			return bookno_numbering_flag();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			return departmenttype();
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			return activeflag();
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			return mfgflg();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
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
		if ($zip.equalsIgnoreCase(name)) {
			zip(value);
			return;
		}
		if ($address1.equalsIgnoreCase(name)) {
			address1(value);
			return;
		}
		if ($address2.equalsIgnoreCase(name)) {
			address2(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($paymentwarehouse.equalsIgnoreCase(name)) {
			paymentwarehouse(value);
			return;
		}
		if ($location.equalsIgnoreCase(name)) {
			location(value);
			return;
		}
		if ($bookno_numbering_flag.equalsIgnoreCase(name)) {
			bookno_numbering_flag(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($zip.equalsIgnoreCase(name)) {
			zip(value);
			return;
		}
		if ($address1.equalsIgnoreCase(name)) {
			address1(value);
			return;
		}
		if ($address2.equalsIgnoreCase(name)) {
			address2(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($paymentwarehouse.equalsIgnoreCase(name)) {
			paymentwarehouse(value);
			return;
		}
		if ($location.equalsIgnoreCase(name)) {
			location(value);
			return;
		}
		if ($bookno_numbering_flag.equalsIgnoreCase(name)) {
			bookno_numbering_flag(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($departmenttype.equalsIgnoreCase(name)) {
			departmenttype(value);
			return;
		}
		if ($activeflag.equalsIgnoreCase(name)) {
			activeflag(value);
			return;
		}
		if ($mfgflg.equalsIgnoreCase(name)) {
			mfgflg(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

