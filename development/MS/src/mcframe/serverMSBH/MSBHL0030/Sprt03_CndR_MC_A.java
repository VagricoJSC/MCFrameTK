package mcframe.serverMSBH.MSBHL0030;

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
 * ブロック"Sprt03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt03_CndR_MC_A extends MCConstRow {

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_cd = "setoff_cd";
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public static final String $so_dpt_cd = "so_dpt_cd";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public static final String $setoff_limit_amt = "setoff_limit_amt";
	public static final String $ap_sttl_cd = "ap_sttl_cd";
	public static final String $ar_typ = "ar_typ";


	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta setoff_cd_META = createCommonMeta($setoff_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta so_dpt_cd_META = createCommonMeta($so_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta setoff_limit_amt_META = createCommonMeta($setoff_limit_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ap_sttl_cd_META = createCommonMeta($ap_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);

	protected static final ConstMetaList<Sprt03_CndR> constMetas = new ConstMetaList<Sprt03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ap_setoff_typ_META,
			setoff_cd_META,
			so_dpt_cd_META,
			trd_cur_cd_META,
			base_dt_META,
			setoff_limit_amt_META,
			ap_sttl_cd_META,
			ar_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected Sprt03_CndR_MC_A(ConstMetaList<? extends Sprt03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt03_CndR clone() {
		return (Sprt03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt03_CndR createInstance() {
		return (Sprt03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt03_CndR getValues(String... names) {
		return (Sprt03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 0, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 0, $ap_setoff_typ, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_cd() {
		return getConstString(offset + 1, $setoff_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_cd(String value) {
		setConstString(offset + 1, $setoff_cd, value);
	}


	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public String so_dpt_cd() {
		return getConstString(offset + 2, $so_dpt_cd);
	}

	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public void so_dpt_cd(String value) {
		setConstString(offset + 2, $so_dpt_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 3, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 3, $trd_cur_cd, value);
	}


	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 4, $base_dt);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 4, $base_dt, value);
	}


	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public MCNumber setoff_limit_amt() {
		return getConstNumber(offset + 5, $setoff_limit_amt);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(MCNumber value) {
		setConstNumber(offset + 5, $setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(int value) {
		setConstNumber(offset + 5, $setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(long value) {
		setConstNumber(offset + 5, $setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(float value) {
		setConstNumber(offset + 5, $setoff_limit_amt, value);
	}

	/**
	 * Balance to be offset 相殺対象残高.<p>
	 *
	 */
	public void setoff_limit_amt(double value) {
		setConstNumber(offset + 5, $setoff_limit_amt, value);
	}


	public String ap_sttl_cd() {
		return getConstString(offset + 6, $ap_sttl_cd);
	}

	public void ap_sttl_cd(String value) {
		setConstString(offset + 6, $ap_sttl_cd, value);
	}


	public String ar_typ() {
		return getConstString(offset + 7, $ar_typ);
	}

	public void ar_typ(String value) {
		setConstString(offset + 7, $ar_typ, value);
	}


	public String getString(String name) {
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			return setoff_limit_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			return setoff_cd();
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			return so_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			return ap_sttl_cd();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			return setoff_limit_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($setoff_cd.equalsIgnoreCase(name)) {
			setoff_cd(value);
			return;
		}
		if ($so_dpt_cd.equalsIgnoreCase(name)) {
			so_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ap_sttl_cd.equalsIgnoreCase(name)) {
			ap_sttl_cd(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($setoff_limit_amt.equalsIgnoreCase(name)) {
			setoff_limit_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

