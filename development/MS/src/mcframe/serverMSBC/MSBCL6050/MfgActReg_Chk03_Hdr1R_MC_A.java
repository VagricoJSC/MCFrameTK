package mcframe.serverMSBC.MSBCL6050;

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
 * ブロック"MfgActReg_Chk03_Hdr1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActReg_Chk03_Hdr1R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public static final String $st_ac_dt = "st_ac_dt";
	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public static final String $end_act_tm = "end_act_tm";
	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public static final String $end_ac_dt = "end_ac_dt";
	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public static final String $base_unit_st_act_qty = "base_unit_st_act_qty";
	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public static final String $oper_unit_act_qty = "oper_unit_act_qty";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_upd_cntr = "mfg_inst_upd_cntr";
	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_pr_upd_cntr = "mfg_inst_pr_upd_cntr";
	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_act_upd_cntr = "mfg_act_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_ac_dt_META = createCommonMeta($st_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_ac_dt_META = createCommonMeta($end_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_unit_st_act_qty_META = createCommonMeta($base_unit_st_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_act_qty_META = createCommonMeta($oper_unit_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_pr_upd_cntr_META = createCommonMeta($mfg_inst_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_act_upd_cntr_META = createCommonMeta($mfg_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<MfgActReg_Chk03_Hdr1R> constMetas = new ConstMetaList<MfgActReg_Chk03_Hdr1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			st_act_tm_META,
			st_ac_dt_META,
			end_act_tm_META,
			end_ac_dt_META,
			base_unit_st_act_qty_META,
			oper_unit_act_qty_META,
			mfg_inst_no_META,
			div_seq_META,
			mfg_act_no_META,
			mfg_inst_upd_cntr_META,
			mfg_inst_pr_upd_cntr_META,
			mfg_act_upd_cntr_META
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
				{$mfg_inst_no, "E"}	// mfg_inst_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$st_act_tm, "E"},	// st_act_tm
				{$st_ac_dt, "E"},	// st_ac_dt
				{$base_unit_st_act_qty, "E"},	// base_unit_st_act_qty
				{$oper_unit_act_qty, "E"}	// oper_unit_act_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$base_unit_st_act_qty, "positive"}	// base_unit_st_act_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$oper_unit_act_qty, "0:"}	// oper_unit_act_qty
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
				{$peg_no, "E"}	// peg_no
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
	protected MfgActReg_Chk03_Hdr1R_MC_A(ConstMetaList<? extends MfgActReg_Chk03_Hdr1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk03_Hdr1R clone() {
		return (MfgActReg_Chk03_Hdr1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk03_Hdr1R createInstance() {
		return (MfgActReg_Chk03_Hdr1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk03_Hdr1R getValues(String... names) {
		return (MfgActReg_Chk03_Hdr1R) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 3, $st_act_tm);
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 3, $st_act_tm, value);
	}


	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return getConstDate(offset + 4, $st_ac_dt);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		setConstDate(offset + 4, $st_ac_dt, value);
	}


	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 5, $end_act_tm);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 5, $end_act_tm, value);
	}


	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return getConstDate(offset + 6, $end_ac_dt);
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		setConstDate(offset + 6, $end_ac_dt, value);
	}


	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_act_qty() {
		return getConstNumber(offset + 7, $base_unit_st_act_qty);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(MCNumber value) {
		setConstNumber(offset + 7, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(int value) {
		setConstNumber(offset + 7, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(long value) {
		setConstNumber(offset + 7, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(float value) {
		setConstNumber(offset + 7, $base_unit_st_act_qty, value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(double value) {
		setConstNumber(offset + 7, $base_unit_st_act_qty, value);
	}


	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public MCNumber oper_unit_act_qty() {
		return getConstNumber(offset + 8, $oper_unit_act_qty);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(MCNumber value) {
		setConstNumber(offset + 8, $oper_unit_act_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(int value) {
		setConstNumber(offset + 8, $oper_unit_act_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(long value) {
		setConstNumber(offset + 8, $oper_unit_act_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(float value) {
		setConstNumber(offset + 8, $oper_unit_act_qty, value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(double value) {
		setConstNumber(offset + 8, $oper_unit_act_qty, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 9, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 9, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 10, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 10, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 10, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 10, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 10, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 10, $div_seq, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 11, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 11, $mfg_act_no, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 12, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 12, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 12, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 12, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 12, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 12, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_pr_upd_cntr() {
		return getConstNumber(offset + 13, $mfg_inst_pr_upd_cntr);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 13, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(int value) {
		setConstNumber(offset + 13, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(long value) {
		setConstNumber(offset + 13, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(float value) {
		setConstNumber(offset + 13, $mfg_inst_pr_upd_cntr, value);
	}

	/**
	 * Production order progress update counter 製造指図進捗更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_pr_upd_cntr(double value) {
		setConstNumber(offset + 13, $mfg_inst_pr_upd_cntr, value);
	}


	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_act_upd_cntr() {
		return getConstNumber(offset + 14, $mfg_act_upd_cntr);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 14, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(int value) {
		setConstNumber(offset + 14, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(long value) {
		setConstNumber(offset + 14, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(float value) {
		setConstNumber(offset + 14, $mfg_act_upd_cntr, value);
	}

	/**
	 * Mfg. result update counter 製造実績更新カウンタ.<p>
	 *
	 */
	public void mfg_act_upd_cntr(double value) {
		setConstNumber(offset + 14, $mfg_act_upd_cntr, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty();
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			return oper_unit_act_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_pr_upd_cntr();
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty();
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			return oper_unit_act_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_pr_upd_cntr();
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_st_act_qty.equalsIgnoreCase(name)) {
			base_unit_st_act_qty(value);
			return;
		}
		if ($oper_unit_act_qty.equalsIgnoreCase(name)) {
			oper_unit_act_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_pr_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_pr_upd_cntr(value);
			return;
		}
		if ($mfg_act_upd_cntr.equalsIgnoreCase(name)) {
			mfg_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
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

