package mcframe.serverMSBF.MSBFL0060;

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
 * ブロック"Chk02_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_HdrR_MC_A extends MCConstRow {

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
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
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
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Update usage expiration date 使用期限更新.<p>
	 *
	 */
	public static final String $vld_dt_upd_flg = "vld_dt_upd_flg";
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
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
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public static final String $inst_upd_cntr = "inst_upd_cntr";
	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public static final String $act_upd_cntr = "act_upd_cntr";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSN);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta vld_dt_upd_flg_META = createCommonMeta($vld_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR3);
	public static final MCMeta inst_upd_cntr_META = createCommonMeta($inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta act_upd_cntr_META = createCommonMeta($act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);

	protected static final ConstMetaList<Chk02_HdrR> constMetas = new ConstMetaList<Chk02_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			insp_no_META,
			insp_act_no_META,
			insp_typ_META,
			insp_sts_typ_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			insp_judg_rslt_typ_META,
			judg_dt_META,
			judg_usr_cd_META,
			judg_dpt_cd_META,
			judg_rsn_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_META,
			vld_dt_META,
			lmt_dt_META,
			act_cont_fctr_META,
			vld_dt_upd_flg_META,
			act_intr_rmrks_META,
			lot_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			inst_upd_cntr_META,
			act_upd_cntr_META,
			rtn_sts_typ_META,
			lot_no_META,
			sublot_no_META
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
				{$insp_no, "E"},	// insp_no
				{$insp_act_no, "E"}	// insp_act_no
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
				{$judg_usr_cd, "MA.MAUAL0010.Usr"},	// judg_usr_cd
				{$judg_dpt_cd, "MA.MAUAL0010.Dpt"}	// judg_dpt_cd
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
				{$judg_dpt_cd, "judg_dt;judg_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$judg_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"}	// judg_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$insp_judg_rslt_typ, "MSC_INSP_JUDG_RSLT_TYP"}	// insp_judg_rslt_typ
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
	protected Chk02_HdrR_MC_A(ConstMetaList<? extends Chk02_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_HdrR clone() {
		return (Chk02_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_HdrR createInstance() {
		return (Chk02_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_HdrR getValues(String... names) {
		return (Chk02_HdrR) super.getValues(names);
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
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 2, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 2, $insp_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 3, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 3, $insp_act_no, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 4, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 4, $insp_typ, value);
	}


	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 5, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 5, $insp_sts_typ, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 6, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 6, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 7, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 7, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}


	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 12, $insp_judg_rslt_typ);
	}

	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 12, $insp_judg_rslt_typ, value);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 13, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 13, $judg_dt, value);
	}


	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 14, $judg_usr_cd);
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 14, $judg_usr_cd, value);
	}


	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 15, $judg_dpt_cd);
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 15, $judg_dpt_cd, value);
	}


	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 16, $judg_rsn);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 16, $judg_rsn, value);
	}


	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 17, $lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 17, $lmt_dt_frm_typ, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 18, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 18, $lmt_dt_frm, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 19, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 19, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 20, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 20, $lmt_dt, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 21, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 21, $act_cont_fctr, value);
	}


	/**
	 * Update usage expiration date 使用期限更新.<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return getConstBoolean(offset + 22, $vld_dt_upd_flg);
	}

	/**
	 * Update usage expiration date 使用期限更新.<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 22, $vld_dt_upd_flg, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 23, $act_intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 23, $act_intr_rmrks, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 24, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 24, $lot_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 25, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 25, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 26, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 26, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 27, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 27, $sub_char3, value);
	}


	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public MCNumber inst_upd_cntr() {
		return getConstNumber(offset + 28, $inst_upd_cntr);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 28, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(int value) {
		setConstNumber(offset + 28, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(long value) {
		setConstNumber(offset + 28, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(float value) {
		setConstNumber(offset + 28, $inst_upd_cntr, value);
	}

	/**
	 * Order update counter 指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(double value) {
		setConstNumber(offset + 28, $inst_upd_cntr, value);
	}


	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public MCNumber act_upd_cntr() {
		return getConstNumber(offset + 29, $act_upd_cntr);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 29, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(int value) {
		setConstNumber(offset + 29, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(long value) {
		setConstNumber(offset + 29, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(float value) {
		setConstNumber(offset + 29, $act_upd_cntr, value);
	}

	/**
	 * Result update counter 実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(double value) {
		setConstNumber(offset + 29, $act_upd_cntr, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 30, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 30, $rtn_sts_typ, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 31, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 31, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 32, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 32, $sublot_no, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
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
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
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
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
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
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
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
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
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
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

