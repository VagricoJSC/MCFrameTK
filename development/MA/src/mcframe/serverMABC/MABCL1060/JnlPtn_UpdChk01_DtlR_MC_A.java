package mcframe.serverMABC.MABCL1060;

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
 * ブロック"JnlPtn_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class JnlPtn_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_JNL_PTN_R {

	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public static final String $dr_sub_flg = "dr_sub_flg";
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public static final String $dr_bp_flg = "dr_bp_flg";
	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public static final String $cr_sub_flg = "cr_sub_flg";
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public static final String $cr_bp_flg = "cr_bp_flg";


	public static final MCMeta dr_sub_flg_META = createCommonMeta($dr_sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dr_bp_flg_META = createCommonMeta($dr_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cr_sub_flg_META = createCommonMeta($cr_sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cr_bp_flg_META = createCommonMeta($cr_bp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<JnlPtn_UpdChk01_DtlR> constMetas = new ConstMetaList<JnlPtn_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_JNL_PTN_R.constMetas,
		new MCMeta[]{
			dr_sub_flg_META,
			dr_bp_flg_META,
			cr_sub_flg_META,
			cr_bp_flg_META
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$jnl_ptn_cd, "E"},	// jnl_ptn_cd
				{$jnl_seq, "E"},	// jnl_seq
				{$dr_dpt_typ, "E"},	// dr_dpt_typ
				{$cr_dpt_typ, "E"},	// cr_dpt_typ
				{$dr_ptn_typ, "E"},	// dr_ptn_typ
				{$cr_ptn_typ, "E"}	// cr_ptn_typ
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dr_dpt_typ, "MAC_DPT_TYP"},	// dr_dpt_typ
				{$cr_dpt_typ, "MAC_DPT_TYP"},	// cr_dpt_typ
				{$dr_ptn_typ, "MAC_PTN_TYP"},	// dr_ptn_typ
				{$cr_ptn_typ, "MAC_PTN_TYP"},	// cr_ptn_typ
				{$dr_bp_typ, "MAC_BP_SET_TYP"},	// dr_bp_typ
				{$cr_bp_typ, "MAC_BP_SET_TYP"},	// cr_bp_typ
				{$dr_itm_typ, "MAC_ITM_SET_TYP"},	// dr_itm_typ
				{$cr_itm_typ, "MAC_ITM_SET_TYP"},	// cr_itm_typ
				{$dr_amt_typ, "MAC_AMT_TYP"},	// dr_amt_typ
				{$cr_amt_typ, "MAC_AMT_TYP"},	// cr_amt_typ
				{$purc_typ, "MAC_PURC_TYP"},	// purc_typ
				{$un_fix_typ, "MAC_UN_FIX_TYP"},	// un_fix_typ
				{$foreign_typ, "MAC_FOREIGN_TYP"},	// foreign_typ
				{$asst_typ, "MAC_ASST_TYP"},	// asst_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$inv_loc_typ, "MAC_INV_LOC_TYP"},	// inv_loc_typ
				{$amt_sign_typ, "MAC_AMT_SIGN_TYP"},	// amt_sign_typ
				{$dr_abs_typ, "MAC_ABS_TYP"},	// dr_abs_typ
				{$cr_abs_typ, "MAC_ABS_TYP"}	// cr_abs_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$jnl_ptn_cd, "MA.MAUAL0010.JnlPtnBase"},	// jnl_ptn_cd
				{$dr_dpt_cd, "MA.MAUAL0010.AcDpt"},	// dr_dpt_cd
				{$cr_dpt_cd, "MA.MAUAL0010.AcDpt"},	// cr_dpt_cd
				{$dr_grp_cd, "MA.MAUAL0010.JnlGrp"},	// dr_grp_cd
				{$cr_grp_cd, "MA.MAUAL0010.JnlGrp"},	// cr_grp_cd
				{$dr_ac_cd, "MA.MAUAL0010.Account"},	// dr_ac_cd
				{$dr_sub_ac_cd, "MA.MAUAL0010.SubAccount"},	// dr_sub_ac_cd
				{$cr_ac_cd, "MA.MAUAL0010.Account"},	// cr_ac_cd
				{$cr_sub_ac_cd, "MA.MAUAL0010.SubAccount"},	// cr_sub_ac_cd
				{$dr_ac_tax_cd, "MA.MAUAL0010.AcTax"},	// dr_ac_tax_cd
				{$cr_ac_tax_cd, "MA.MAUAL0010.AcTax"},	// cr_ac_tax_cd
				{$dr_bp_cd, "MA.MAUAL0010.Bp"},	// dr_bp_cd
				{$cr_bp_cd, "MA.MAUAL0010.Bp"},	// cr_bp_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$itm_jnl_cd, "MA.MAUAL0010.ItmJnl"},	// itm_jnl_cd
				{$ac_rsn_cd, "MA.MAUAL0010.AcRsn"},	// ac_rsn_cd
				{$cur_cd, "MA.MAUAL0010.Cur"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dr_ac_cd, "dr_sub_flg;dr_bp_flg"},	// dr_ac_cd
				{$cr_ac_cd, "cr_sub_flg;cr_bp_flg"}	// cr_ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dr_ac_cd, "sub_flg;bp_flg"},	// dr_ac_cd
				{$cr_ac_cd, "sub_flg;bp_flg"}	// cr_ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dr_dpt_cd, "true"},	// dr_dpt_cd
				{$cr_dpt_cd, "true"},	// cr_dpt_cd
				{$dr_sub_ac_cd, "dr_ac_cd"},	// dr_sub_ac_cd
				{$cr_sub_ac_cd, "cr_ac_cd"},	// cr_sub_ac_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;true;true"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dr_dpt_cd, "ignore_dt_flg"},	// dr_dpt_cd
				{$cr_dpt_cd, "ignore_dt_flg"},	// cr_dpt_cd
				{$dr_sub_ac_cd, "ac_cd"},	// dr_sub_ac_cd
				{$cr_sub_ac_cd, "ac_cd"},	// cr_sub_ac_cd
				{$itm_sub3, "itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// itm_sub3
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
	protected JnlPtn_UpdChk01_DtlR_MC_A(ConstMetaList<? extends JnlPtn_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public JnlPtn_UpdChk01_DtlR clone() {
		return (JnlPtn_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public JnlPtn_UpdChk01_DtlR createInstance() {
		return (JnlPtn_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public JnlPtn_UpdChk01_DtlR getValues(String... names) {
		return (JnlPtn_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public boolean dr_sub_flg() {
		return getConstBoolean(offset + 0, $dr_sub_flg);
	}

	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public void dr_sub_flg(boolean value) {
		setConstBoolean(offset + 0, $dr_sub_flg, value);
	}


	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public boolean dr_bp_flg() {
		return getConstBoolean(offset + 1, $dr_bp_flg);
	}

	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public void dr_bp_flg(boolean value) {
		setConstBoolean(offset + 1, $dr_bp_flg, value);
	}


	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public boolean cr_sub_flg() {
		return getConstBoolean(offset + 2, $cr_sub_flg);
	}

	/**
	 * Subsidiary account 補助勘定科目.<p>
	 *
	 */
	public void cr_sub_flg(boolean value) {
		setConstBoolean(offset + 2, $cr_sub_flg, value);
	}


	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public boolean cr_bp_flg() {
		return getConstBoolean(offset + 3, $cr_bp_flg);
	}

	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public void cr_bp_flg(boolean value) {
		setConstBoolean(offset + 3, $cr_bp_flg, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			return dr_sub_flg();
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			return dr_bp_flg();
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			return cr_sub_flg();
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			return cr_bp_flg();
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
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			return dr_sub_flg();
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			return dr_bp_flg();
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			return cr_sub_flg();
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			return cr_bp_flg();
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
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			dr_sub_flg(value);
			return;
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			dr_bp_flg(value);
			return;
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			cr_sub_flg(value);
			return;
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			cr_bp_flg(value);
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
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			dr_sub_flg(value);
			return;
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			dr_bp_flg(value);
			return;
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			cr_sub_flg(value);
			return;
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			cr_bp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

