package mcframe.serverMSBF.MSBFL5030;

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
 * ブロック"StdInspAct_Chk03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StdInspAct_Chk03_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_act_no = "std_insp_act_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Check 確認.<p>
	 *
	 */
	public static final String $cnf_flg = "cnf_flg";
	/**
	 * Check date 確認日.<p>
	 *
	 */
	public static final String $cnf_dt = "cnf_dt";
	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public static final String $cnf_usr_cd = "cnf_usr_cd";
	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public static final String $cnf_dpt_cd = "cnf_dpt_cd";
	/**
	 * Check internal remarks 確認内部備考.<p>
	 *
	 */
	public static final String $cnf_intr_rmrks = "cnf_intr_rmrks";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_act_no_META = createCommonMeta($std_insp_act_no, mcframe.commonMA.meta.MA_META.STD_INSP_ACT_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta cnf_flg_META = createCommonMeta($cnf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cnf_dt_META = createCommonMeta($cnf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cnf_usr_cd_META = createCommonMeta($cnf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cnf_dpt_cd_META = createCommonMeta($cnf_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cnf_intr_rmrks_META = createCommonMeta($cnf_intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_CNF_INTR_RMRKS);

	protected static final ConstMetaList<StdInspAct_Chk03_DtlR> constMetas = new ConstMetaList<StdInspAct_Chk03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			std_insp_act_no_META,
			insp_no_META,
			cnf_flg_META,
			cnf_dt_META,
			cnf_usr_cd_META,
			cnf_dpt_cd_META,
			cnf_intr_rmrks_META
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
				{$std_insp_act_no, "E"}	// std_insp_act_no
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
	protected StdInspAct_Chk03_DtlR_MC_A(ConstMetaList<? extends StdInspAct_Chk03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspAct_Chk03_DtlR clone() {
		return (StdInspAct_Chk03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspAct_Chk03_DtlR createInstance() {
		return (StdInspAct_Chk03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspAct_Chk03_DtlR getValues(String... names) {
		return (StdInspAct_Chk03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public String std_insp_act_no() {
		return getConstString(offset + 2, $std_insp_act_no);
	}

	/**
	 * Specific inspection result No. 規格検査実績ＮＯ.<p>
	 *
	 */
	public void std_insp_act_no(String value) {
		setConstString(offset + 2, $std_insp_act_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 3, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 3, $insp_no, value);
	}


	/**
	 * Check 確認.<p>
	 *
	 */
	public boolean cnf_flg() {
		return getConstBoolean(offset + 4, $cnf_flg);
	}

	/**
	 * Check 確認.<p>
	 *
	 */
	public void cnf_flg(boolean value) {
		setConstBoolean(offset + 4, $cnf_flg, value);
	}


	/**
	 * Check date 確認日.<p>
	 *
	 */
	public MCDate cnf_dt() {
		return getConstDate(offset + 5, $cnf_dt);
	}

	/**
	 * Check date 確認日.<p>
	 *
	 */
	public void cnf_dt(MCDate value) {
		setConstDate(offset + 5, $cnf_dt, value);
	}


	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public String cnf_usr_cd() {
		return getConstString(offset + 6, $cnf_usr_cd);
	}

	/**
	 * Check PIC cd. 確認者ＣＤ.<p>
	 *
	 */
	public void cnf_usr_cd(String value) {
		setConstString(offset + 6, $cnf_usr_cd, value);
	}


	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public String cnf_dpt_cd() {
		return getConstString(offset + 7, $cnf_dpt_cd);
	}

	/**
	 * Check dept. cd. 確認部門ＣＤ.<p>
	 *
	 */
	public void cnf_dpt_cd(String value) {
		setConstString(offset + 7, $cnf_dpt_cd, value);
	}


	/**
	 * Check internal remarks 確認内部備考.<p>
	 *
	 */
	public String cnf_intr_rmrks() {
		return getConstString(offset + 8, $cnf_intr_rmrks);
	}

	/**
	 * Check internal remarks 確認内部備考.<p>
	 *
	 */
	public void cnf_intr_rmrks(String value) {
		setConstString(offset + 8, $cnf_intr_rmrks, value);
	}


	public String getString(String name) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			return cnf_usr_cd();
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			return cnf_dpt_cd();
		}
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			return cnf_intr_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			return cnf_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($cnf_flg.equalsIgnoreCase(name)) {
			return cnf_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			return cnf_usr_cd();
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			return cnf_dpt_cd();
		}
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			return cnf_intr_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			return cnf_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($cnf_flg.equalsIgnoreCase(name)) {
			return cnf_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			cnf_usr_cd(value);
			return;
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			cnf_dpt_cd(value);
			return;
		}
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			cnf_intr_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			cnf_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($cnf_flg.equalsIgnoreCase(name)) {
			cnf_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($cnf_usr_cd.equalsIgnoreCase(name)) {
			cnf_usr_cd(value);
			return;
		}
		if ($cnf_dpt_cd.equalsIgnoreCase(name)) {
			cnf_dpt_cd(value);
			return;
		}
		if ($cnf_intr_rmrks.equalsIgnoreCase(name)) {
			cnf_intr_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cnf_dt.equalsIgnoreCase(name)) {
			cnf_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($cnf_flg.equalsIgnoreCase(name)) {
			cnf_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

