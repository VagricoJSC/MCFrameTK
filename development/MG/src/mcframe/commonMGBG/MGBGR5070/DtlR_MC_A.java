package mcframe.commonMGBG.MGBGR5070;

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
	 * 予算区分
	 */
	public static final String $type = "type";
	/**
	 *  .<p>
	 *
	 * コード
	 */
	public static final String $budgetcode = "budgetcode";
	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public static final String $budgetname = "budgetname";
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
	 * 部門コード
	 */
	public static final String $deptcode = "deptcode";
	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public static final String $userno = "userno";
	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public static final String $memo = "memo";
	/**
	 *  .<p>
	 *
	 * 明細UserMaster
	 */
	public static final String $detail_usermaster = "detail_usermaster";
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
	 * 年月
	 */
	public static final String $ym = "ym";
	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public static final String $budgetamount = "budgetamount";


	public static final MCMeta type_META = createNumberMeta($type, 1, 0, false);
	public static final MCMeta budgetcode_META = createStringMeta($budgetcode, 20);
	public static final MCMeta budgetname_META = createStringMeta($budgetname, 100);
	public static final MCMeta extension_META = createStringMeta($extension, 2);
	public static final MCMeta searchcharacter_META = createStringMeta($searchcharacter, 1);
	public static final MCMeta deptcode_META = createStringMeta($deptcode, 20);
	public static final MCMeta userno_META = createNumberMeta($userno, 1, 0, false);
	public static final MCMeta memo_META = createStringMeta($memo, 100);
	public static final MCMeta detail_usermaster_META = createStringMeta($detail_usermaster, 20);
	public static final MCMeta accode_META = createStringMeta($accode, 20);
	public static final MCMeta subcode_META = createStringMeta($subcode, 20);
	public static final MCMeta ym_META = createDateMeta($ym);
	public static final MCMeta budgetamount_META = createNumberMeta($budgetamount, 16, 2, false);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			type_META,
			budgetcode_META,
			budgetname_META,
			extension_META,
			searchcharacter_META,
			deptcode_META,
			userno_META,
			memo_META,
			detail_usermaster_META,
			accode_META,
			subcode_META,
			ym_META,
			budgetamount_META
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
	 * 予算区分
	 */
	public MCNumber type() {
		return getConstNumber(offset + 0, $type);
	}

	/**
	 *  .<p>
	 *
	 * 予算区分
	 */
	public void type(MCNumber value) {
		setConstNumber(offset + 0, $type, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算区分
	 */
	public void type(int value) {
		setConstNumber(offset + 0, $type, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算区分
	 */
	public void type(long value) {
		setConstNumber(offset + 0, $type, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算区分
	 */
	public void type(float value) {
		setConstNumber(offset + 0, $type, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算区分
	 */
	public void type(double value) {
		setConstNumber(offset + 0, $type, value);
	}


	/**
	 *  .<p>
	 *
	 * コード
	 */
	public String budgetcode() {
		return getConstString(offset + 1, $budgetcode);
	}

	/**
	 *  .<p>
	 *
	 * コード
	 */
	public void budgetcode(String value) {
		setConstString(offset + 1, $budgetcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public String budgetname() {
		return getConstString(offset + 2, $budgetname);
	}

	/**
	 *  .<p>
	 *
	 * 名称
	 */
	public void budgetname(String value) {
		setConstString(offset + 2, $budgetname, value);
	}


	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public String extension() {
		return getConstString(offset + 3, $extension);
	}

	/**
	 *  .<p>
	 *
	 * 拡張ﾌﾗｸﾞ
	 */
	public void extension(String value) {
		setConstString(offset + 3, $extension, value);
	}


	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public String searchcharacter() {
		return getConstString(offset + 4, $searchcharacter);
	}

	/**
	 *  .<p>
	 *
	 * 検索
	 */
	public void searchcharacter(String value) {
		setConstString(offset + 4, $searchcharacter, value);
	}


	/**
	 *  .<p>
	 *
	 * 部門コード
	 */
	public String deptcode() {
		return getConstString(offset + 5, $deptcode);
	}

	/**
	 *  .<p>
	 *
	 * 部門コード
	 */
	public void deptcode(String value) {
		setConstString(offset + 5, $deptcode, value);
	}


	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public MCNumber userno() {
		return getConstNumber(offset + 6, $userno);
	}

	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public void userno(MCNumber value) {
		setConstNumber(offset + 6, $userno, value);
	}

	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public void userno(int value) {
		setConstNumber(offset + 6, $userno, value);
	}

	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public void userno(long value) {
		setConstNumber(offset + 6, $userno, value);
	}

	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public void userno(float value) {
		setConstNumber(offset + 6, $userno, value);
	}

	/**
	 *  .<p>
	 *
	 * ユーザマスタＮｏ
	 */
	public void userno(double value) {
		setConstNumber(offset + 6, $userno, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public String memo() {
		return getConstString(offset + 7, $memo);
	}

	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public void memo(String value) {
		setConstString(offset + 7, $memo, value);
	}


	/**
	 *  .<p>
	 *
	 * 明細UserMaster
	 */
	public String detail_usermaster() {
		return getConstString(offset + 8, $detail_usermaster);
	}

	/**
	 *  .<p>
	 *
	 * 明細UserMaster
	 */
	public void detail_usermaster(String value) {
		setConstString(offset + 8, $detail_usermaster, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public String accode() {
		return getConstString(offset + 9, $accode);
	}

	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public void accode(String value) {
		setConstString(offset + 9, $accode, value);
	}


	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public String subcode() {
		return getConstString(offset + 10, $subcode);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public void subcode(String value) {
		setConstString(offset + 10, $subcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 年月
	 */
	public MCDate ym() {
		return getConstDate(offset + 11, $ym);
	}

	/**
	 *  .<p>
	 *
	 * 年月
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 11, $ym, value);
	}


	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public MCNumber budgetamount() {
		return getConstNumber(offset + 12, $budgetamount);
	}

	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public void budgetamount(MCNumber value) {
		setConstNumber(offset + 12, $budgetamount, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public void budgetamount(int value) {
		setConstNumber(offset + 12, $budgetamount, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public void budgetamount(long value) {
		setConstNumber(offset + 12, $budgetamount, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public void budgetamount(float value) {
		setConstNumber(offset + 12, $budgetamount, value);
	}

	/**
	 *  .<p>
	 *
	 * 予算金額
	 */
	public void budgetamount(double value) {
		setConstNumber(offset + 12, $budgetamount, value);
	}


	public String getString(String name) {
		if ($budgetcode.equalsIgnoreCase(name)) {
			return budgetcode();
		}
		if ($budgetname.equalsIgnoreCase(name)) {
			return budgetname();
		}
		if ($extension.equalsIgnoreCase(name)) {
			return extension();
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			return searchcharacter();
		}
		if ($deptcode.equalsIgnoreCase(name)) {
			return deptcode();
		}
		if ($memo.equalsIgnoreCase(name)) {
			return memo();
		}
		if ($detail_usermaster.equalsIgnoreCase(name)) {
			return detail_usermaster();
		}
		if ($accode.equalsIgnoreCase(name)) {
			return accode();
		}
		if ($subcode.equalsIgnoreCase(name)) {
			return subcode();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($type.equalsIgnoreCase(name)) {
			return type();
		}
		if ($userno.equalsIgnoreCase(name)) {
			return userno();
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			return budgetamount();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($budgetcode.equalsIgnoreCase(name)) {
			return budgetcode();
		}
		if ($budgetname.equalsIgnoreCase(name)) {
			return budgetname();
		}
		if ($extension.equalsIgnoreCase(name)) {
			return extension();
		}
		if ($searchcharacter.equalsIgnoreCase(name)) {
			return searchcharacter();
		}
		if ($deptcode.equalsIgnoreCase(name)) {
			return deptcode();
		}
		if ($memo.equalsIgnoreCase(name)) {
			return memo();
		}
		if ($detail_usermaster.equalsIgnoreCase(name)) {
			return detail_usermaster();
		}
		if ($accode.equalsIgnoreCase(name)) {
			return accode();
		}
		if ($subcode.equalsIgnoreCase(name)) {
			return subcode();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($type.equalsIgnoreCase(name)) {
			return type();
		}
		if ($userno.equalsIgnoreCase(name)) {
			return userno();
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			return budgetamount();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($budgetcode.equalsIgnoreCase(name)) {
			budgetcode(value);
			return;
		}
		if ($budgetname.equalsIgnoreCase(name)) {
			budgetname(value);
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
		if ($deptcode.equalsIgnoreCase(name)) {
			deptcode(value);
			return;
		}
		if ($memo.equalsIgnoreCase(name)) {
			memo(value);
			return;
		}
		if ($detail_usermaster.equalsIgnoreCase(name)) {
			detail_usermaster(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($budgetcode.equalsIgnoreCase(name)) {
			budgetcode(value);
			return;
		}
		if ($budgetname.equalsIgnoreCase(name)) {
			budgetname(value);
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
		if ($deptcode.equalsIgnoreCase(name)) {
			deptcode(value);
			return;
		}
		if ($memo.equalsIgnoreCase(name)) {
			memo(value);
			return;
		}
		if ($detail_usermaster.equalsIgnoreCase(name)) {
			detail_usermaster(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($type.equalsIgnoreCase(name)) {
			type(value);
			return;
		}
		if ($userno.equalsIgnoreCase(name)) {
			userno(value);
			return;
		}
		if ($budgetamount.equalsIgnoreCase(name)) {
			budgetamount(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

