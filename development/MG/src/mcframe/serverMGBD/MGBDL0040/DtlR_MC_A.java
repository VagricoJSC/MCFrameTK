package mcframe.serverMGBD.MGBDL0040;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 * <br>
 * @see mcframe.serverMGBD.MGBDL0040.DtlL_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends mcframe.serverMG.dbc.MGT_ARG_R {

	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Accounting IF sent 会計ＩＦ送信済.<p>
	 *
	 */
	public static final String $ac_if_flg = "ac_if_flg";
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public static final String $calc_usr_cd = "calc_usr_cd";
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public static final String $calc_usr_nm = "calc_usr_nm";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public static final String $fix_upd_cntr = "fix_upd_cntr";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_if_flg_META = createCommonMeta($ac_if_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_usr_cd_META = createCommonMeta($calc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta calc_usr_nm_META = createCommonMeta($calc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta fix_upd_cntr_META = createCommonMeta($fix_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		mcframe.serverMG.dbc.MGT_ARG_R.constMetas,
		new MCMeta[]{
			ym_META,
			ac_if_flg_META,
			calc_usr_cd_META,
			calc_usr_nm_META,
			ins_func_nm_META,
			upd_func_nm_META,
			fix_upd_cntr_META,
			rtn_sts_typ_META,
			err_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$ym, "E"},	// ym
				{$term, "E"},	// term
				{$calc_no, "E"},	// calc_no
				{$calc_grp_cd, "E"}	// calc_grp_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "MA.MAUAL0010.FixCalcGrp"}	// calc_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Accounting IF sent 会計ＩＦ送信済.<p>
	 *
	 */
	public boolean ac_if_flg() {
		return getConstBoolean(offset + 1, $ac_if_flg);
	}

	/**
	 * Accounting IF sent 会計ＩＦ送信済.<p>
	 *
	 */
	public void ac_if_flg(boolean value) {
		setConstBoolean(offset + 1, $ac_if_flg, value);
	}


	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public String calc_usr_cd() {
		return getConstString(offset + 2, $calc_usr_cd);
	}

	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public void calc_usr_cd(String value) {
		setConstString(offset + 2, $calc_usr_cd, value);
	}


	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public String calc_usr_nm() {
		return getConstString(offset + 3, $calc_usr_nm);
	}

	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public void calc_usr_nm(String value) {
		setConstString(offset + 3, $calc_usr_nm, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 4, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 4, $ins_func_nm, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 5, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 5, $upd_func_nm, value);
	}


	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public MCNumber fix_upd_cntr() {
		return getConstNumber(offset + 6, $fix_upd_cntr);
	}

	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public void fix_upd_cntr(MCNumber value) {
		setConstNumber(offset + 6, $fix_upd_cntr, value);
	}

	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public void fix_upd_cntr(int value) {
		setConstNumber(offset + 6, $fix_upd_cntr, value);
	}

	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public void fix_upd_cntr(long value) {
		setConstNumber(offset + 6, $fix_upd_cntr, value);
	}

	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public void fix_upd_cntr(float value) {
		setConstNumber(offset + 6, $fix_upd_cntr, value);
	}

	/**
	 * Firm info. update counter 確定情報更新カウンタ.<p>
	 *
	 */
	public void fix_upd_cntr(double value) {
		setConstNumber(offset + 6, $fix_upd_cntr, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 7, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 7, $rtn_sts_typ, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 8, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 8, $err_flg, value);
	}


	public String getString(String name) {
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			return fix_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			return ac_if_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			return fix_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			return ac_if_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			ac_if_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($fix_upd_cntr.equalsIgnoreCase(name)) {
			fix_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ac_if_flg.equalsIgnoreCase(name)) {
			ac_if_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

