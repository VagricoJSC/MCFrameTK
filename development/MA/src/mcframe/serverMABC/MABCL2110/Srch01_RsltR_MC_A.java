package mcframe.serverMABC.MABCL2110;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public static final String $hrrchy = "hrrchy";
	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public static final String $extno = "extno";
	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public static final String $par_extno = "par_extno";
	/**
	 * Loop ループ.<p>
	 *
	 */
	public static final String $loop_flg = "loop_flg";
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
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
	 * Item name 品目名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";


	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta extno_META = createNumberMeta($extno);
	public static final MCMeta par_extno_META = createNumberMeta($par_extno);
	public static final MCMeta loop_flg_META = createCommonMeta($loop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_META,
			extno_META,
			par_extno_META,
			loop_flg_META,
			ctg_cd_META,
			ctg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public MCNumber hrrchy() {
		return getConstNumber(offset + 0, $hrrchy);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(int value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(long value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(float value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}

	/**
	 * Configuration level 構成レベル.<p>
	 *
	 */
	public void hrrchy(double value) {
		setConstNumber(offset + 0, $hrrchy, value);
	}


	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public MCNumber extno() {
		return getConstNumber(offset + 1, $extno);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(MCNumber value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(int value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(long value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(float value) {
		setConstNumber(offset + 1, $extno, value);
	}

	/**
	 * Explode number 展開番号.<p>
	 *
	 */
	public void extno(double value) {
		setConstNumber(offset + 1, $extno, value);
	}


	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public MCNumber par_extno() {
		return getConstNumber(offset + 2, $par_extno);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(MCNumber value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(int value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(long value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(float value) {
		setConstNumber(offset + 2, $par_extno, value);
	}

	/**
	 * Parent explosion number 親展開番号.<p>
	 *
	 */
	public void par_extno(double value) {
		setConstNumber(offset + 2, $par_extno, value);
	}


	/**
	 * Loop ループ.<p>
	 *
	 */
	public boolean loop_flg() {
		return getConstBoolean(offset + 3, $loop_flg);
	}

	/**
	 * Loop ループ.<p>
	 *
	 */
	public void loop_flg(boolean value) {
		setConstBoolean(offset + 3, $loop_flg, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 4, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 4, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 5, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 5, $ctg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * Item name 品目名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 10, $itm_nm);
	}

	/**
	 * Item name 品目名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 10, $itm_nm, value);
	}


	public String getString(String name) {
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($extno.equalsIgnoreCase(name)) {
			return extno();
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			return par_extno();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($extno.equalsIgnoreCase(name)) {
			extno(value);
			return;
		}
		if ($par_extno.equalsIgnoreCase(name)) {
			par_extno(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

