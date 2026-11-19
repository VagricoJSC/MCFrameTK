package mcframe.serverMSBB.MSBBL1210;

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
 * ブロック"ExpByKey01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExpByKey01_DtlR_MC_A extends MCConstRow {

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  照合明細キー.<p>
	 *
	 */
	public static final String $match_dtl_key = "match_dtl_key";
	/**
	 *  品目数量.<p>
	 *
	 */
	public static final String $itm_qty = "itm_qty";
	/**
	 *  工事要領書番号.<p>
	 *
	 */
	public static final String $work_proc_no = "work_proc_no";
	/**
	 *  塗色.<p>
	 *
	 */
	public static final String $fill_color = "fill_color";
	/**
	 *  銘版.<p>
	 *
	 */
	public static final String $nm_plate = "nm_plate";
	/**
	 *  コメント１.<p>
	 *
	 */
	public static final String $rmrks1 = "rmrks1";
	/**
	 *  コメント２.<p>
	 *
	 */
	public static final String $rmrks2 = "rmrks2";
	/**
	 *  コメント３.<p>
	 *
	 */
	public static final String $rmrks3 = "rmrks3";
	/**
	 *  コメント４.<p>
	 *
	 */
	public static final String $rmrks4 = "rmrks4";
	/**
	 *  コメント５.<p>
	 *
	 */
	public static final String $rmrks5 = "rmrks5";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta match_dtl_key_META = createCommonMeta($match_dtl_key, mcframe.commonMA.meta.MA_META.MATCH_DTL_KEY);
	public static final MCMeta itm_qty_META = createCommonMeta($itm_qty, mcframe.commonMA.meta.MA_META.ITM_QTY);
	public static final MCMeta work_proc_no_META = createCommonMeta($work_proc_no, mcframe.commonMA.meta.MA_META.WORK_PROC_NO);
	public static final MCMeta fill_color_META = createCommonMeta($fill_color, mcframe.commonMA.meta.MA_META.FILL_COLOR);
	public static final MCMeta nm_plate_META = createCommonMeta($nm_plate, mcframe.commonMA.meta.MA_META.NM_PLATE);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.RMRKS1);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.RMRKS2);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.RMRKS3);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.RMRKS4);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.RMRKS5);

	protected static final ConstMetaList<ExpByKey01_DtlR> constMetas = new ConstMetaList<ExpByKey01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			match_dtl_key_META,
			itm_qty_META,
			work_proc_no_META,
			fill_color_META,
			nm_plate_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META
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
	protected ExpByKey01_DtlR_MC_A(ConstMetaList<? extends ExpByKey01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpByKey01_DtlR clone() {
		return (ExpByKey01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpByKey01_DtlR createInstance() {
		return (ExpByKey01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExpByKey01_DtlR getValues(String... names) {
		return (ExpByKey01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 *  別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 5, $itm_alt_nm1);
	}

	/**
	 *  別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 5, $itm_alt_nm1, value);
	}


	/**
	 *  照合明細キー.<p>
	 *
	 */
	public String match_dtl_key() {
		return getConstString(offset + 6, $match_dtl_key);
	}

	/**
	 *  照合明細キー.<p>
	 *
	 */
	public void match_dtl_key(String value) {
		setConstString(offset + 6, $match_dtl_key, value);
	}


	/**
	 *  品目数量.<p>
	 *
	 */
	public MCNumber itm_qty() {
		return getConstNumber(offset + 7, $itm_qty);
	}

	/**
	 *  品目数量.<p>
	 *
	 */
	public void itm_qty(MCNumber value) {
		setConstNumber(offset + 7, $itm_qty, value);
	}

	/**
	 *  品目数量.<p>
	 *
	 */
	public void itm_qty(int value) {
		setConstNumber(offset + 7, $itm_qty, value);
	}

	/**
	 *  品目数量.<p>
	 *
	 */
	public void itm_qty(long value) {
		setConstNumber(offset + 7, $itm_qty, value);
	}

	/**
	 *  品目数量.<p>
	 *
	 */
	public void itm_qty(float value) {
		setConstNumber(offset + 7, $itm_qty, value);
	}

	/**
	 *  品目数量.<p>
	 *
	 */
	public void itm_qty(double value) {
		setConstNumber(offset + 7, $itm_qty, value);
	}


	/**
	 *  工事要領書番号.<p>
	 *
	 */
	public String work_proc_no() {
		return getConstString(offset + 8, $work_proc_no);
	}

	/**
	 *  工事要領書番号.<p>
	 *
	 */
	public void work_proc_no(String value) {
		setConstString(offset + 8, $work_proc_no, value);
	}


	/**
	 *  塗色.<p>
	 *
	 */
	public String fill_color() {
		return getConstString(offset + 9, $fill_color);
	}

	/**
	 *  塗色.<p>
	 *
	 */
	public void fill_color(String value) {
		setConstString(offset + 9, $fill_color, value);
	}


	/**
	 *  銘版.<p>
	 *
	 */
	public String nm_plate() {
		return getConstString(offset + 10, $nm_plate);
	}

	/**
	 *  銘版.<p>
	 *
	 */
	public void nm_plate(String value) {
		setConstString(offset + 10, $nm_plate, value);
	}


	/**
	 *  コメント１.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 11, $rmrks1);
	}

	/**
	 *  コメント１.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 11, $rmrks1, value);
	}


	/**
	 *  コメント２.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 12, $rmrks2);
	}

	/**
	 *  コメント２.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 12, $rmrks2, value);
	}


	/**
	 *  コメント３.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 13, $rmrks3);
	}

	/**
	 *  コメント３.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 13, $rmrks3, value);
	}


	/**
	 *  コメント４.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 14, $rmrks4);
	}

	/**
	 *  コメント４.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 14, $rmrks4, value);
	}


	/**
	 *  コメント５.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 15, $rmrks5);
	}

	/**
	 *  コメント５.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 15, $rmrks5, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($match_dtl_key.equalsIgnoreCase(name)) {
			return match_dtl_key();
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			return work_proc_no();
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			return fill_color();
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			return nm_plate();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			return itm_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($match_dtl_key.equalsIgnoreCase(name)) {
			return match_dtl_key();
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			return work_proc_no();
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			return fill_color();
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			return nm_plate();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			return itm_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($match_dtl_key.equalsIgnoreCase(name)) {
			match_dtl_key(value);
			return;
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			work_proc_no(value);
			return;
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			fill_color(value);
			return;
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			nm_plate(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($match_dtl_key.equalsIgnoreCase(name)) {
			match_dtl_key(value);
			return;
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			work_proc_no(value);
			return;
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			fill_color(value);
			return;
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			nm_plate(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

