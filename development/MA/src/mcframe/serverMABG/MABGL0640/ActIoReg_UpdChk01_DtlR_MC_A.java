package mcframe.serverMABG.MABGL0640;

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
 * ブロック"ActIoReg_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ActIoReg_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_ACT_IO_R {

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<ActIoReg_UpdChk01_DtlR> constMetas = new ConstMetaList<ActIoReg_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_ACT_IO_R.constMetas,
		new MCMeta[]{
			st_dt_key_META,
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$calc_ctg_cd, "E"},	// calc_ctg_cd
				{$wg_cd, "E"},	// wg_cd
				{$ac_slip_typ, "E"},	// ac_slip_typ
				{$prio, "E"},	// prio
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"},	// end_dt
				{$ac_rsn_null_flg, "E"},	// ac_rsn_null_flg
				{$loc_null_flg, "E"},	// loc_null_flg
				{$io_trans_typ, "E"},	// io_trans_typ
				{$alc_amt_flg, "E"},	// alc_amt_flg
				{$dpt_flg, "E"},	// dpt_flg
				{$loc_flg, "E"},	// loc_flg
				{$oper_flg, "E"},	// oper_flg
				{$bp_flg, "E"},	// bp_flg
				{$ctg_flg, "E"},	// ctg_flg
				{$itm_flg, "E"},	// itm_flg
				{$lot_no_flg, "E"},	// lot_no_flg
				{$sublot_no_flg, "E"},	// sublot_no_flg
				{$sno1_flg, "E"},	// sno1_flg
				{$sno2_flg, "E"},	// sno2_flg
				{$sno3_flg, "E"},	// sno3_flg
				{$sno4_flg, "E"},	// sno4_flg
				{$itm_mfg_inst_no_flg, "E"}	// itm_mfg_inst_no_flg
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$calc_ctg_cd, "MA.MAUAL0010.CalcCtg"},	// calc_ctg_cd
				{$wg_cd, "MA.MAUAL0010.CostWg"},	// wg_cd
				{$itm_jnl_cd, "MA.MAUAL0010.ItmJnl"},	// itm_jnl_cd
				{$ac_rsn_cd, "MA.MAUAL0010.AcRsn"},	// ac_rsn_cd
				{$tgt_dpt_cd, "MA.MAUAL0010.CostDpt"},	// tgt_dpt_cd
				{$tgt_loc_cd, "MA.MAUAL0010.Loc"},	// tgt_loc_cd
				{$alc_ac_cd, "MA.MAUAL0010.AlcAc"},	// alc_ac_cd
				{$alc_wg_cd, "MA.MAUAL0010.CostWg"},	// alc_wg_cd
				{$dpt_cd, "MA.MAUAL0010.CostDpt"},	// dpt_cd
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$oper_cd, "MA.MAUAL0010.Oper"},	// oper_cd
				{$bp_cd, "MA.MAUAL0010.Bp"},	// bp_cd
				{$ctg_cd, "MA.MAUAL0010.CostCtg"},	// ctg_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$tgt_dpt_cd, "tgt_dpt_cd"},	// tgt_dpt_cd
				{$tgt_loc_cd, "tgt_loc_cd"},	// tgt_loc_cd
				{$alc_wg_cd, "alc_wg_cd"},	// alc_wg_cd
				{$itm_sub3, "itm_nm"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$tgt_dpt_cd, "dpt_cd"},	// tgt_dpt_cd
				{$tgt_loc_cd, "loc_cd"},	// tgt_loc_cd
				{$alc_wg_cd, "wg_cd"},	// alc_wg_cd
				{$itm_sub3, "itm_nm"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$tgt_dpt_cd, "st_dt"},	// tgt_dpt_cd
				{$dpt_cd, "st_dt"},	// dpt_cd
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$tgt_dpt_cd, "ym"},	// tgt_dpt_cd
				{$dpt_cd, "ym"},	// dpt_cd
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$ac_slip_typ, "MAC_AC_SLIP_TYP"},	// ac_slip_typ
				{$io_trans_typ, "MAC_IO_TRANS_TYP"},	// io_trans_typ
				{$inpt_loc_typ1, "MAC_INPT_LOC_TYP"},	// inpt_loc_typ1
				{$inpt_loc_typ2, "MAC_INPT_LOC_TYP"},	// inpt_loc_typ2
				{$inpt_loc_typ3, "MAC_INPT_LOC_TYP"}	// inpt_loc_typ3
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
				{$ac_rsn_cd, "E1"},	// ac_rsn_cd
				{$ac_rsn_null_flg, "E1"},	// ac_rsn_null_flg
				{$tgt_loc_cd, "E2"},	// tgt_loc_cd
				{$loc_null_flg, "E2"}	// loc_null_flg
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$prio, "1:9999"}	// prio
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
	protected ActIoReg_UpdChk01_DtlR_MC_A(ConstMetaList<? extends ActIoReg_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActIoReg_UpdChk01_DtlR clone() {
		return (ActIoReg_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActIoReg_UpdChk01_DtlR createInstance() {
		return (ActIoReg_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActIoReg_UpdChk01_DtlR getValues(String... names) {
		return (ActIoReg_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
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
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
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
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

