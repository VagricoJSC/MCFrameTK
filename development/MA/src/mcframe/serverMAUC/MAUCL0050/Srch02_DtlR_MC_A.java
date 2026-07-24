package mcframe.serverMAUC.MAUCL0050;

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
 * ブロック"Srch02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_DtlR_MC_A extends MCConstRow {

	/**
	 * Function type 機能区分.<p>
	 *
	 */
	public static final String $func_typ = "func_typ";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public static final String $num = "num";
	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public static final String $base_num = "base_num";
	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public static final String $up_rate_lmt = "up_rate_lmt";
	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public static final String $low_rate_lmt = "low_rate_lmt";
	/**
	 * Upper limit result flg. 上限結果ＦＬＧ.<p>
	 *
	 */
	public static final String $up_lmt_rslt_flg = "up_lmt_rslt_flg";
	/**
	 * Lower limit result flg. 下限結果ＦＬＧ.<p>
	 *
	 */
	public static final String $low_lmt_rslt_flg = "low_lmt_rslt_flg";


	public static final MCMeta func_typ_META = createCommonMeta($func_typ, mcframe.commonMA.meta.MA_META.FUNC_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta num_META = createCommonMeta($num, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_num_META = createCommonMeta($base_num, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta up_rate_lmt_META = createCommonMeta($up_rate_lmt, mcframe.commonMA.meta.MA_META.RATE_LMT);
	public static final MCMeta low_rate_lmt_META = createCommonMeta($low_rate_lmt, mcframe.commonMA.meta.MA_META.RATE_LMT);
	public static final MCMeta up_lmt_rslt_flg_META = createCommonMeta($up_lmt_rslt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta low_lmt_rslt_flg_META = createCommonMeta($low_lmt_rslt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch02_DtlR> constMetas = new ConstMetaList<Srch02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			func_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			num_META,
			base_num_META,
			up_rate_lmt_META,
			low_rate_lmt_META,
			up_lmt_rslt_flg_META,
			low_lmt_rslt_flg_META
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
	protected Srch02_DtlR_MC_A(ConstMetaList<? extends Srch02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR clone() {
		return (Srch02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR createInstance() {
		return (Srch02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR getValues(String... names) {
		return (Srch02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Function type 機能区分.<p>
	 *
	 */
	public String func_typ() {
		return getConstString(offset + 0, $func_typ);
	}

	/**
	 * Function type 機能区分.<p>
	 *
	 */
	public void func_typ(String value) {
		setConstString(offset + 0, $func_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public MCNumber num() {
		return getConstNumber(offset + 5, $num);
	}

	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public void num(MCNumber value) {
		setConstNumber(offset + 5, $num, value);
	}

	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public void num(int value) {
		setConstNumber(offset + 5, $num, value);
	}

	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public void num(long value) {
		setConstNumber(offset + 5, $num, value);
	}

	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public void num(float value) {
		setConstNumber(offset + 5, $num, value);
	}

	/**
	 * Result qty. 実績数.<p>
	 *
	 */
	public void num(double value) {
		setConstNumber(offset + 5, $num, value);
	}


	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public MCNumber base_num() {
		return getConstNumber(offset + 6, $base_num);
	}

	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public void base_num(MCNumber value) {
		setConstNumber(offset + 6, $base_num, value);
	}

	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public void base_num(int value) {
		setConstNumber(offset + 6, $base_num, value);
	}

	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public void base_num(long value) {
		setConstNumber(offset + 6, $base_num, value);
	}

	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public void base_num(float value) {
		setConstNumber(offset + 6, $base_num, value);
	}

	/**
	 * Schedule qty. 予定数.<p>
	 *
	 */
	public void base_num(double value) {
		setConstNumber(offset + 6, $base_num, value);
	}


	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public MCNumber up_rate_lmt() {
		return getConstNumber(offset + 7, $up_rate_lmt);
	}

	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public void up_rate_lmt(MCNumber value) {
		setConstNumber(offset + 7, $up_rate_lmt, value);
	}

	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public void up_rate_lmt(int value) {
		setConstNumber(offset + 7, $up_rate_lmt, value);
	}

	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public void up_rate_lmt(long value) {
		setConstNumber(offset + 7, $up_rate_lmt, value);
	}

	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public void up_rate_lmt(float value) {
		setConstNumber(offset + 7, $up_rate_lmt, value);
	}

	/**
	 * Max. schedule/result ratio 予実比上限.<p>
	 *
	 */
	public void up_rate_lmt(double value) {
		setConstNumber(offset + 7, $up_rate_lmt, value);
	}


	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public MCNumber low_rate_lmt() {
		return getConstNumber(offset + 8, $low_rate_lmt);
	}

	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public void low_rate_lmt(MCNumber value) {
		setConstNumber(offset + 8, $low_rate_lmt, value);
	}

	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public void low_rate_lmt(int value) {
		setConstNumber(offset + 8, $low_rate_lmt, value);
	}

	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public void low_rate_lmt(long value) {
		setConstNumber(offset + 8, $low_rate_lmt, value);
	}

	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public void low_rate_lmt(float value) {
		setConstNumber(offset + 8, $low_rate_lmt, value);
	}

	/**
	 * Min. schedule/result ratio 予実比下限.<p>
	 *
	 */
	public void low_rate_lmt(double value) {
		setConstNumber(offset + 8, $low_rate_lmt, value);
	}


	/**
	 * Upper limit result flg. 上限結果ＦＬＧ.<p>
	 *
	 */
	public boolean up_lmt_rslt_flg() {
		return getConstBoolean(offset + 9, $up_lmt_rslt_flg);
	}

	/**
	 * Upper limit result flg. 上限結果ＦＬＧ.<p>
	 *
	 */
	public void up_lmt_rslt_flg(boolean value) {
		setConstBoolean(offset + 9, $up_lmt_rslt_flg, value);
	}


	/**
	 * Lower limit result flg. 下限結果ＦＬＧ.<p>
	 *
	 */
	public boolean low_lmt_rslt_flg() {
		return getConstBoolean(offset + 10, $low_lmt_rslt_flg);
	}

	/**
	 * Lower limit result flg. 下限結果ＦＬＧ.<p>
	 *
	 */
	public void low_lmt_rslt_flg(boolean value) {
		setConstBoolean(offset + 10, $low_lmt_rslt_flg, value);
	}


	public String getString(String name) {
		if ($func_typ.equalsIgnoreCase(name)) {
			return func_typ();
		}
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($num.equalsIgnoreCase(name)) {
			return num();
		}
		if ($base_num.equalsIgnoreCase(name)) {
			return base_num();
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			return up_rate_lmt();
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			return low_rate_lmt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($up_lmt_rslt_flg.equalsIgnoreCase(name)) {
			return up_lmt_rslt_flg();
		}
		if ($low_lmt_rslt_flg.equalsIgnoreCase(name)) {
			return low_lmt_rslt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($func_typ.equalsIgnoreCase(name)) {
			return func_typ();
		}
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($num.equalsIgnoreCase(name)) {
			return num();
		}
		if ($base_num.equalsIgnoreCase(name)) {
			return base_num();
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			return up_rate_lmt();
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			return low_rate_lmt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($up_lmt_rslt_flg.equalsIgnoreCase(name)) {
			return up_lmt_rslt_flg();
		}
		if ($low_lmt_rslt_flg.equalsIgnoreCase(name)) {
			return low_lmt_rslt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($func_typ.equalsIgnoreCase(name)) {
			func_typ(value);
			return;
		}
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($up_lmt_rslt_flg.equalsIgnoreCase(name)) {
			up_lmt_rslt_flg(value);
			return;
		}
		if ($low_lmt_rslt_flg.equalsIgnoreCase(name)) {
			low_lmt_rslt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($func_typ.equalsIgnoreCase(name)) {
			func_typ(value);
			return;
		}
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($num.equalsIgnoreCase(name)) {
			num(value);
			return;
		}
		if ($base_num.equalsIgnoreCase(name)) {
			base_num(value);
			return;
		}
		if ($up_rate_lmt.equalsIgnoreCase(name)) {
			up_rate_lmt(value);
			return;
		}
		if ($low_rate_lmt.equalsIgnoreCase(name)) {
			low_rate_lmt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($up_lmt_rslt_flg.equalsIgnoreCase(name)) {
			up_lmt_rslt_flg(value);
			return;
		}
		if ($low_lmt_rslt_flg.equalsIgnoreCase(name)) {
			low_lmt_rslt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

