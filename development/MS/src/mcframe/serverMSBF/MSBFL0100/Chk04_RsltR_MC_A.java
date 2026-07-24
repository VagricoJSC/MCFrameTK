package mcframe.serverMSBF.MSBFL0100;

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
 * ブロック"Chk04_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk04_RsltR_MC_A extends MCConstRow {

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
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_no = "mrkt_judg_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Market release approval role cd. 市場出荷承認役割ＣＤ.<p>
	 *
	 */
	public static final String $mrkt_judg_role_cd = "mrkt_judg_role_cd";
	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $mrkt_judg_prnt_flg = "mrkt_judg_prnt_flg";
	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public static final String $mrkt_judg_prnt_tm = "mrkt_judg_prnt_tm";
	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public static final String $seq = "seq";
	/**
	 * Cancelling date 取消日.<p>
	 *
	 */
	public static final String $del_dt = "del_dt";
	/**
	 * Cancellation PIC cd. 取消者ＣＤ.<p>
	 *
	 */
	public static final String $del_usr_cd = "del_usr_cd";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 * Push notification dept. cd. プッシュ通知の部門ＣＤ.<p>
	 *
	 */
	public static final String $push_dpt_cd = "push_dpt_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_no_META = createCommonMeta($mrkt_judg_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta mrkt_judg_role_cd_META = createCommonMeta($mrkt_judg_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.MRKT_JUDG_RSN);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createCommonMeta($mrkt_judg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP_NM);
	public static final MCMeta mrkt_judg_prnt_flg_META = createCommonMeta($mrkt_judg_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_prnt_tm_META = createCommonMeta($mrkt_judg_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta del_dt_META = createCommonMeta($del_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta del_usr_cd_META = createCommonMeta($del_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta push_dpt_cd_META = createCommonMeta($push_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);

	protected static final ConstMetaList<Chk04_RsltR> constMetas = new ConstMetaList<Chk04_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			mrkt_judg_no_META,
			upd_cntr_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			mrkt_judg_role_cd_META,
			judg_rsn_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			mrkt_judg_prnt_flg_META,
			mrkt_judg_prnt_tm_META,
			seq_META,
			del_dt_META,
			del_usr_cd_META,
			rtn_sts_typ_META,
			judg_dt_META,
			push_dpt_cd_META
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
				{$mrkt_judg_no, "E"}	// mrkt_judg_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$judg_rsn, "E"}	// judg_rsn
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
	protected Chk04_RsltR_MC_A(ConstMetaList<? extends Chk04_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk04_RsltR clone() {
		return (Chk04_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk04_RsltR createInstance() {
		return (Chk04_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk04_RsltR getValues(String... names) {
		return (Chk04_RsltR) super.getValues(names);
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
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_no() {
		return getConstString(offset + 2, $mrkt_judg_no);
	}

	/**
	 * Market release decision No. 市場出荷判定ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_no(String value) {
		setConstString(offset + 2, $mrkt_judg_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 3, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 8, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 8, $lot_no, value);
	}


	/**
	 * Market release approval role cd. 市場出荷承認役割ＣＤ.<p>
	 *
	 */
	public String mrkt_judg_role_cd() {
		return getConstString(offset + 9, $mrkt_judg_role_cd);
	}

	/**
	 * Market release approval role cd. 市場出荷承認役割ＣＤ.<p>
	 *
	 */
	public void mrkt_judg_role_cd(String value) {
		setConstString(offset + 9, $mrkt_judg_role_cd, value);
	}


	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 10, $judg_rsn);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 10, $judg_rsn, value);
	}


	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 11, $mrkt_judg_sts_typ);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 11, $mrkt_judg_sts_typ, value);
	}


	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 12, $mrkt_judg_sts_typ_nm);
	}

	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 12, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public boolean mrkt_judg_prnt_flg() {
		return getConstBoolean(offset + 13, $mrkt_judg_prnt_flg);
	}

	/**
	 * Record sheet of market release decision issued flg. 市場出荷判定記録書発行済ＦＬＧ.<p>
	 *
	 */
	public void mrkt_judg_prnt_flg(boolean value) {
		setConstBoolean(offset + 13, $mrkt_judg_prnt_flg, value);
	}


	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public MCDate mrkt_judg_prnt_tm() {
		return getConstDate(offset + 14, $mrkt_judg_prnt_tm);
	}

	/**
	 * Record sheet of market release decision issued date and time 市場出荷判定記録書発行日時.<p>
	 *
	 */
	public void mrkt_judg_prnt_tm(MCDate value) {
		setConstDate(offset + 14, $mrkt_judg_prnt_tm, value);
	}


	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 15, $seq);
	}

	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 15, $seq, value);
	}

	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 15, $seq, value);
	}

	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 15, $seq, value);
	}

	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 15, $seq, value);
	}

	/**
	 * Market release decision record sheet sequence number 市場出荷判定記録書連番.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 15, $seq, value);
	}


	/**
	 * Cancelling date 取消日.<p>
	 *
	 */
	public MCDate del_dt() {
		return getConstDate(offset + 16, $del_dt);
	}

	/**
	 * Cancelling date 取消日.<p>
	 *
	 */
	public void del_dt(MCDate value) {
		setConstDate(offset + 16, $del_dt, value);
	}


	/**
	 * Cancellation PIC cd. 取消者ＣＤ.<p>
	 *
	 */
	public String del_usr_cd() {
		return getConstString(offset + 17, $del_usr_cd);
	}

	/**
	 * Cancellation PIC cd. 取消者ＣＤ.<p>
	 *
	 */
	public void del_usr_cd(String value) {
		setConstString(offset + 17, $del_usr_cd, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 18, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 18, $rtn_sts_typ, value);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 19, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 19, $judg_dt, value);
	}


	/**
	 * Push notification dept. cd. プッシュ通知の部門ＣＤ.<p>
	 *
	 */
	public String push_dpt_cd() {
		return getConstString(offset + 20, $push_dpt_cd);
	}

	/**
	 * Push notification dept. cd. プッシュ通知の部門ＣＤ.<p>
	 *
	 */
	public void push_dpt_cd(String value) {
		setConstString(offset + 20, $push_dpt_cd, value);
	}


	public String getString(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($del_usr_cd.equalsIgnoreCase(name)) {
			return del_usr_cd();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			return push_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_tm();
		}
		if ($del_dt.equalsIgnoreCase(name)) {
			return del_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			return mrkt_judg_role_cd();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($del_usr_cd.equalsIgnoreCase(name)) {
			return del_usr_cd();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			return push_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_tm();
		}
		if ($del_dt.equalsIgnoreCase(name)) {
			return del_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($del_usr_cd.equalsIgnoreCase(name)) {
			del_usr_cd(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			push_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_tm(value);
			return;
		}
		if ($del_dt.equalsIgnoreCase(name)) {
			del_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($mrkt_judg_role_cd.equalsIgnoreCase(name)) {
			mrkt_judg_role_cd(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($del_usr_cd.equalsIgnoreCase(name)) {
			del_usr_cd(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($push_dpt_cd.equalsIgnoreCase(name)) {
			push_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mrkt_judg_prnt_tm.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_tm(value);
			return;
		}
		if ($del_dt.equalsIgnoreCase(name)) {
			del_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($mrkt_judg_prnt_flg.equalsIgnoreCase(name)) {
			mrkt_judg_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

