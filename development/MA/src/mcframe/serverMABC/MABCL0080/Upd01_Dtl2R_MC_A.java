package mcframe.serverMABC.MABCL0080;

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
 * ブロック"Upd01_Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_Dtl2R_MC_A extends MCConstRow {

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public static final String $lcl_cd = "lcl_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Upd01_Dtl2R> constMetas = new ConstMetaList<Upd01_Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tax_cd_META,
			lcl_cd_META,
			tax_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Upd01_Dtl2R_MC_A(ConstMetaList<? extends Upd01_Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl2R clone() {
		return (Upd01_Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl2R createInstance() {
		return (Upd01_Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Dtl2R getValues(String... names) {
		return (Upd01_Dtl2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 0, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 0, $tax_cd, value);
	}


	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 1, $lcl_cd);
	}

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 1, $lcl_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 2, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 2, $tax_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 3, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 3, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 4, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 4, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 5, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 5, $memo3, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 6, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 6, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

