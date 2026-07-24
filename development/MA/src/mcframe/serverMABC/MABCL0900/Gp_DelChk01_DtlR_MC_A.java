package mcframe.serverMABC.MABCL0900;

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
 * ブロック"Gp_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Gp_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public static final String $key1 = "key1";
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public static final String $key2 = "key2";
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public static final String $key3 = "key3";
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public static final String $key4 = "key4";
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public static final String $key5 = "key5";
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public static final String $key6 = "key6";
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public static final String $key7 = "key7";
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public static final String $key8 = "key8";
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public static final String $key9 = "key9";
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public static final String $key10 = "key10";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Gp_DelChk01_DtlR> constMetas = new ConstMetaList<Gp_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			gp_grp_cd_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$gp_grp_cd, "E"},	// gp_grp_cd
				{$key1, "E"},	// key1
				{$key2, "E"},	// key2
				{$key3, "E"},	// key3
				{$key4, "E"},	// key4
				{$key5, "E"},	// key5
				{$key6, "E"},	// key6
				{$key7, "E"},	// key7
				{$key8, "E"},	// key8
				{$key9, "E"},	// key9
				{$key10, "E"}	// key10
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
	protected Gp_DelChk01_DtlR_MC_A(ConstMetaList<? extends Gp_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Gp_DelChk01_DtlR clone() {
		return (Gp_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Gp_DelChk01_DtlR createInstance() {
		return (Gp_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Gp_DelChk01_DtlR getValues(String... names) {
		return (Gp_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 0, $gp_grp_cd);
	}

	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 0, $gp_grp_cd, value);
	}


	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 1, $key1);
	}

	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 1, $key1, value);
	}


	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 2, $key2);
	}

	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 2, $key2, value);
	}


	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 3, $key3);
	}

	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 3, $key3, value);
	}


	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 4, $key4);
	}

	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 4, $key4, value);
	}


	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 5, $key5);
	}

	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 5, $key5, value);
	}


	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 6, $key6);
	}

	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 6, $key6, value);
	}


	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 7, $key7);
	}

	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 7, $key7, value);
	}


	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 8, $key8);
	}

	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 8, $key8, value);
	}


	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 9, $key9);
	}

	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 9, $key9, value);
	}


	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 10, $key10);
	}

	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 10, $key10, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 11, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 11, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 11, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 11, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 11, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 11, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
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

