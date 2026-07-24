package mcframe.serverMABS.MABSL0210;

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
 * ブロック"LotInhSrc_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotInhSrc_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_LOT_INH_SRC_R {

	/**
	 * For parent active ingredient 親有効成分対象.<p>
	 *
	 */
	public static final String $par_cont_fctr_flg = "par_cont_fctr_flg";
	/**
	 * For child active ingredient 子有効成分対象.<p>
	 *
	 */
	public static final String $chd_cont_fctr_flg = "chd_cont_fctr_flg";


	public static final MCMeta par_cont_fctr_flg_META = createCommonMeta($par_cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_cont_fctr_flg_META = createCommonMeta($chd_cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LotInhSrc_UpdChk01_DtlR> constMetas = new ConstMetaList<LotInhSrc_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_LOT_INH_SRC_R.constMetas,
		new MCMeta[]{
			par_cont_fctr_flg_META,
			chd_cont_fctr_flg_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$par_itm_cd, "E"},	// par_itm_cd
				{$par_itm_sub1, "E"},	// par_itm_sub1
				{$par_itm_sub2, "E"},	// par_itm_sub2
				{$par_itm_sub3, "E"},	// par_itm_sub3
				{$par_cont_fctr_flg, "E"},	// par_cont_fctr_flg
				{$bom_ptn, "E"},	// bom_ptn
				{$lot_inh_col_typ, "E"},	// lot_inh_col_typ
				{$chd_itm_cd, "E"},	// chd_itm_cd
				{$chd_itm_sub1, "E"},	// chd_itm_sub1
				{$chd_itm_sub2, "E"},	// chd_itm_sub2
				{$chd_itm_sub3, "E"},	// chd_itm_sub3
				{$chd_cont_fctr_flg, "E"},	// chd_cont_fctr_flg
				{$prio, "E"}	// prio
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$par_itm_sub1, "E"},	// par_itm_sub1
				{$par_itm_sub2, "E"},	// par_itm_sub2
				{$par_itm_sub3, "E"},	// par_itm_sub3
				{$chd_itm_sub1, "E"},	// chd_itm_sub1
				{$chd_itm_sub2, "E"},	// chd_itm_sub2
				{$chd_itm_sub3, "E"},	// chd_itm_sub3
				{$wg_cd, "E"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$lot_inh_col_typ, "MAC_LOT_INH_COL_TYP"}	// lot_inh_col_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$par_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// par_itm_sub3
				{$chd_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// chd_itm_sub3
				{$wg_cd, "MA.MAUAL0010.LgOrMfgWg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$par_itm_sub3, "MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST;par_itm_cd;par_itm_sub1;par_itm_sub2;true;true"},	// par_itm_sub3
				{$chd_itm_sub3, "MAC_ITM_IS_SRCH_TYP.LOT;chd_itm_cd;chd_itm_sub1;chd_itm_sub2"},	// chd_itm_sub3
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$par_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// par_itm_sub3
				{$chd_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// chd_itm_sub3
				{$wg_cd, "mode_nullval_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$chd_itm_sub3, "chd_cont_fctr_flg"}	// chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$chd_itm_sub3, "cont_fctr_flg"}	// chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$prio, "0:"}	// prio
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
	protected LotInhSrc_UpdChk01_DtlR_MC_A(ConstMetaList<? extends LotInhSrc_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotInhSrc_UpdChk01_DtlR clone() {
		return (LotInhSrc_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotInhSrc_UpdChk01_DtlR createInstance() {
		return (LotInhSrc_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotInhSrc_UpdChk01_DtlR getValues(String... names) {
		return (LotInhSrc_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * For parent active ingredient 親有効成分対象.<p>
	 *
	 */
	public boolean par_cont_fctr_flg() {
		return getConstBoolean(offset + 0, $par_cont_fctr_flg);
	}

	/**
	 * For parent active ingredient 親有効成分対象.<p>
	 *
	 */
	public void par_cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 0, $par_cont_fctr_flg, value);
	}


	/**
	 * For child active ingredient 子有効成分対象.<p>
	 *
	 */
	public boolean chd_cont_fctr_flg() {
		return getConstBoolean(offset + 1, $chd_cont_fctr_flg);
	}

	/**
	 * For child active ingredient 子有効成分対象.<p>
	 *
	 */
	public void chd_cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 1, $chd_cont_fctr_flg, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($par_cont_fctr_flg.equalsIgnoreCase(name)) {
			return par_cont_fctr_flg();
		}
		if ($chd_cont_fctr_flg.equalsIgnoreCase(name)) {
			return chd_cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($par_cont_fctr_flg.equalsIgnoreCase(name)) {
			return par_cont_fctr_flg();
		}
		if ($chd_cont_fctr_flg.equalsIgnoreCase(name)) {
			return chd_cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($par_cont_fctr_flg.equalsIgnoreCase(name)) {
			par_cont_fctr_flg(value);
			return;
		}
		if ($chd_cont_fctr_flg.equalsIgnoreCase(name)) {
			chd_cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($par_cont_fctr_flg.equalsIgnoreCase(name)) {
			par_cont_fctr_flg(value);
			return;
		}
		if ($chd_cont_fctr_flg.equalsIgnoreCase(name)) {
			chd_cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

