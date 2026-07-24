package mcframe.serverMSBC.MSBCL5040;

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
 * ブロック"ItmOrdLd_Srch01_SrchRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmOrdLd_Srch01_SrchRsltR_MC_A extends MCConstRow {

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Load breakdown cd. 負荷内訳ＣＤ.<p>
	 *
	 */
	public static final String $ld_sub_cd = "ld_sub_cd";
	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public static final String $act_qty1 = "act_qty1";
	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public static final String $act_qty2 = "act_qty2";


	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ld_sub_cd_META = createCommonMeta($ld_sub_cd, mcframe.commonMS.meta.MS_META.LD_SUB_CD);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_qty1_META = createCommonMeta($act_qty1, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_qty2_META = createCommonMeta($act_qty2, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<ItmOrdLd_Srch01_SrchRsltR> constMetas = new ConstMetaList<ItmOrdLd_Srch01_SrchRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_loc_cd_META,
			ld_sub_cd_META,
			dt_fr_META,
			dt_to_META,
			act_qty1_META,
			act_qty2_META
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
	protected ItmOrdLd_Srch01_SrchRsltR_MC_A(ConstMetaList<? extends ItmOrdLd_Srch01_SrchRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SrchRsltR clone() {
		return (ItmOrdLd_Srch01_SrchRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SrchRsltR createInstance() {
		return (ItmOrdLd_Srch01_SrchRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmOrdLd_Srch01_SrchRsltR getValues(String... names) {
		return (ItmOrdLd_Srch01_SrchRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 0, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 0, $mfg_loc_cd, value);
	}


	/**
	 * Load breakdown cd. 負荷内訳ＣＤ.<p>
	 *
	 */
	public String ld_sub_cd() {
		return getConstString(offset + 1, $ld_sub_cd);
	}

	/**
	 * Load breakdown cd. 負荷内訳ＣＤ.<p>
	 *
	 */
	public void ld_sub_cd(String value) {
		setConstString(offset + 1, $ld_sub_cd, value);
	}


	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 2, $dt_fr);
	}

	/**
	 * Start date 開始年月日.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 2, $dt_fr, value);
	}


	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 3, $dt_to);
	}

	/**
	 * End date 終了年月日.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 3, $dt_to, value);
	}


	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public MCNumber act_qty1() {
		return getConstNumber(offset + 4, $act_qty1);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void act_qty1(MCNumber value) {
		setConstNumber(offset + 4, $act_qty1, value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void act_qty1(int value) {
		setConstNumber(offset + 4, $act_qty1, value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void act_qty1(long value) {
		setConstNumber(offset + 4, $act_qty1, value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void act_qty1(float value) {
		setConstNumber(offset + 4, $act_qty1, value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void act_qty1(double value) {
		setConstNumber(offset + 4, $act_qty1, value);
	}


	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public MCNumber act_qty2() {
		return getConstNumber(offset + 5, $act_qty2);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void act_qty2(MCNumber value) {
		setConstNumber(offset + 5, $act_qty2, value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void act_qty2(int value) {
		setConstNumber(offset + 5, $act_qty2, value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void act_qty2(long value) {
		setConstNumber(offset + 5, $act_qty2, value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void act_qty2(float value) {
		setConstNumber(offset + 5, $act_qty2, value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void act_qty2(double value) {
		setConstNumber(offset + 5, $act_qty2, value);
	}


	public String getString(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			return ld_sub_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			return act_qty1();
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			return act_qty2();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			return ld_sub_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			return act_qty1();
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			return act_qty2();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			ld_sub_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($ld_sub_cd.equalsIgnoreCase(name)) {
			ld_sub_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_qty1.equalsIgnoreCase(name)) {
			act_qty1(value);
			return;
		}
		if ($act_qty2.equalsIgnoreCase(name)) {
			act_qty2(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

