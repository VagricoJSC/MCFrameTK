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
 * ブロック"StdInspAct_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StdInspAct_Chk01_DtlR_MC_A extends MCConstRow {

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
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public static final String $std_insp_inst_no = "std_insp_inst_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public static final String $qn_insp_val = "qn_insp_val";
	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public static final String $ql_insp_val = "ql_insp_val";
	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Inspection dept. cd. 検査部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Specific inspection result type 規格検査結果区分.<p>
	 *
	 */
	public static final String $std_insp_rslt_typ = "std_insp_rslt_typ";
	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public static final String $qn_int_digit = "qn_int_digit";
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public static final String $qn_int_frac = "qn_int_frac";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_act_no_META = createCommonMeta($std_insp_act_no, mcframe.commonMA.meta.MA_META.STD_INSP_ACT_NO);
	public static final MCMeta std_insp_inst_no_META = createCommonMeta($std_insp_inst_no, mcframe.commonMA.meta.MA_META.STD_INSP_INST_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta qn_insp_val_META = createCommonMeta($qn_insp_val, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta ql_insp_val_META = createCommonMeta($ql_insp_val, mcframe.commonMS.meta.MS_META.QL_INSP_VAL);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta std_insp_rslt_typ_META = createCommonMeta($std_insp_rslt_typ, mcframe.commonMS.meta.MS_META.STD_INSP_RSLT_TYP);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STD_INSP_ACT_SUB_CHAR3);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta qn_int_digit_META = createCommonMeta($qn_int_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<StdInspAct_Chk01_DtlR> constMetas = new ConstMetaList<StdInspAct_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			std_insp_act_no_META,
			std_insp_inst_no_META,
			insp_no_META,
			qn_insp_val_META,
			ql_insp_val_META,
			st_tm_META,
			end_tm_META,
			usr_cd_META,
			dpt_cd_META,
			std_insp_rslt_typ_META,
			act_intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			insp_qlqn_typ_META,
			qn_int_digit_META,
			qn_int_frac_META
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
				{$std_insp_inst_no, "E"},	// std_insp_inst_no
				{$insp_no, "E"}	// insp_no
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
				{$st_tm, "tmBfToday"},	// st_tm
				{$end_tm, "tmBfToday"}	// end_tm
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_tm, "insp_tm:BF"},	// st_tm
				{$end_tm, "insp_tm:AF"}	// end_tm
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
				{$usr_cd, "MA.MAUAL0010.Usr"},	// usr_cd
				{$dpt_cd, "MA.MAUAL0010.Dpt"}	// dpt_cd
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
				{$dpt_cd, "MAC_DPT_IS_SRCH_TYP.INSP;st_tm"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_is_srch_typ;dt"}	// dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$std_insp_rslt_typ, "MSC_STD_INSP_RSLT_TYP"}	// std_insp_rslt_typ
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
	protected StdInspAct_Chk01_DtlR_MC_A(ConstMetaList<? extends StdInspAct_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspAct_Chk01_DtlR clone() {
		return (StdInspAct_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspAct_Chk01_DtlR createInstance() {
		return (StdInspAct_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StdInspAct_Chk01_DtlR getValues(String... names) {
		return (StdInspAct_Chk01_DtlR) super.getValues(names);
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
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public String std_insp_inst_no() {
		return getConstString(offset + 3, $std_insp_inst_no);
	}

	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public void std_insp_inst_no(String value) {
		setConstString(offset + 3, $std_insp_inst_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 4, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 4, $insp_no, value);
	}


	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public MCNumber qn_insp_val() {
		return getConstNumber(offset + 5, $qn_insp_val);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(MCNumber value) {
		setConstNumber(offset + 5, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(int value) {
		setConstNumber(offset + 5, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(long value) {
		setConstNumber(offset + 5, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(float value) {
		setConstNumber(offset + 5, $qn_insp_val, value);
	}

	/**
	 * Quantitative inspection value 定量検査値.<p>
	 *
	 */
	public void qn_insp_val(double value) {
		setConstNumber(offset + 5, $qn_insp_val, value);
	}


	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public String ql_insp_val() {
		return getConstString(offset + 6, $ql_insp_val);
	}

	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public void ql_insp_val(String value) {
		setConstString(offset + 6, $ql_insp_val, value);
	}


	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 7, $st_tm);
	}

	/**
	 * Inspection start date and time 検査開始日時.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 7, $st_tm, value);
	}


	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 8, $end_tm);
	}

	/**
	 * Inspection finish date and time 検査終了日時.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 8, $end_tm, value);
	}


	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 9, $usr_cd);
	}

	/**
	 * Inspection PIC cd. 検査者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 9, $usr_cd, value);
	}


	/**
	 * Inspection dept. cd. 検査部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 10, $dpt_cd);
	}

	/**
	 * Inspection dept. cd. 検査部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 10, $dpt_cd, value);
	}


	/**
	 * Specific inspection result type 規格検査結果区分.<p>
	 *
	 */
	public String std_insp_rslt_typ() {
		return getConstString(offset + 11, $std_insp_rslt_typ);
	}

	/**
	 * Specific inspection result type 規格検査結果区分.<p>
	 *
	 */
	public void std_insp_rslt_typ(String value) {
		setConstString(offset + 11, $std_insp_rslt_typ, value);
	}


	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 12, $act_intr_rmrks);
	}

	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 12, $act_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 13, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 13, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 14, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 14, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 15, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 15, $sub_char3, value);
	}


	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 16, $insp_qlqn_typ);
	}

	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 16, $insp_qlqn_typ, value);
	}


	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 17, $qn_int_digit);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 17, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 17, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 17, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 17, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 17, $qn_int_digit, value);
	}


	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 18, $qn_int_frac);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 18, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 18, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 18, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 18, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 18, $qn_int_frac, value);
	}


	public String getString(String name) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			return std_insp_act_no();
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			return std_insp_inst_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			return ql_insp_val();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			return std_insp_rslt_typ();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			return qn_insp_val();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
			return;
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($std_insp_act_no.equalsIgnoreCase(name)) {
			std_insp_act_no(value);
			return;
		}
		if ($std_insp_inst_no.equalsIgnoreCase(name)) {
			std_insp_inst_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($ql_insp_val.equalsIgnoreCase(name)) {
			ql_insp_val(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($std_insp_rslt_typ.equalsIgnoreCase(name)) {
			std_insp_rslt_typ(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qn_insp_val.equalsIgnoreCase(name)) {
			qn_insp_val(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

