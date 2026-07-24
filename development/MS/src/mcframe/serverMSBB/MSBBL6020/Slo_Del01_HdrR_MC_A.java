package mcframe.serverMSBB.MSBBL6020;

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
 * ブロック"Slo_Del01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_Del01_HdrR_MC_A extends MCConstRow {

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $can_del_flg = "can_del_flg";
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";
	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public static final String $can_rmrks = "can_rmrks";
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public static final String $qtn_no = "qtn_no";
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public static final String $qtn_rev = "qtn_rev";
	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public static final String $qtn_aprv_flg = "qtn_aprv_flg";
	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public static final String $qtn_aprv_no = "qtn_aprv_no";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $slo_upd_cntr = "slo_upd_cntr";
	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $qtn_upd_cntr = "qtn_upd_cntr";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public static final String $upd_cntr_not_chk_flg = "upd_cntr_not_chk_flg";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public static final String $slo_rev = "slo_rev";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_char1 = "edi_sub_char1";
	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_char2 = "edi_sub_char2";
	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_char3 = "edi_sub_char3";
	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_char4 = "edi_sub_char4";
	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_char5 = "edi_sub_char5";


	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta can_del_flg_META = createCommonMeta($can_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta can_rmrks_META = createCommonMeta($can_rmrks, mcframe.commonMS.meta.MS_META.SLO_CAN_RMRKS);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_aprv_flg_META = createCommonMeta($qtn_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_aprv_no_META = createCommonMeta($qtn_aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_not_chk_flg_META = createCommonMeta($upd_cntr_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);

	protected static final ConstMetaList<Slo_Del01_HdrR> constMetas = new ConstMetaList<Slo_Del01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_no_META,
			aprv_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			can_del_flg_META,
			can_rsn_cd_META,
			can_rmrks_META,
			qtn_no_META,
			qtn_rev_META,
			qtn_aprv_flg_META,
			qtn_aprv_no_META,
			sls_dpt_cd_META,
			slo_upd_cntr_META,
			qtn_upd_cntr_META,
			err_flg_META,
			upd_cntr_not_chk_flg_META,
			is_src_batch_flg_META,
			slo_rev_META,
			cst_cd_META,
			trd_cur_cd_META,
			wg_cd_META,
			wrk_no_META,
			tterm_cd1_META,
			tterm_cd2_META,
			tterm_cd3_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META
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
				{$slo_no, "D"}	// slo_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$slo_no, "E"}	// slo_no
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
				{$can_rsn_cd, "MS.MSUAL0030.SloCanRsn"}	// can_rsn_cd
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
	protected Slo_Del01_HdrR_MC_A(ConstMetaList<? extends Slo_Del01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Del01_HdrR clone() {
		return (Slo_Del01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Del01_HdrR createInstance() {
		return (Slo_Del01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Del01_HdrR getValues(String... names) {
		return (Slo_Del01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 0, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 0, $slo_no, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 1, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 1, $aprv_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 2, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 2, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 3, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 3, $aprv_sts_typ, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean can_del_flg() {
		return getConstBoolean(offset + 4, $can_del_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void can_del_flg(boolean value) {
		setConstBoolean(offset + 4, $can_del_flg, value);
	}


	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 5, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 5, $can_rsn_cd, value);
	}


	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public String can_rmrks() {
		return getConstString(offset + 6, $can_rmrks);
	}

	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public void can_rmrks(String value) {
		setConstString(offset + 6, $can_rmrks, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 7, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 7, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 8, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 8, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 8, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 8, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 8, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 8, $qtn_rev, value);
	}


	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public boolean qtn_aprv_flg() {
		return getConstBoolean(offset + 9, $qtn_aprv_flg);
	}

	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public void qtn_aprv_flg(boolean value) {
		setConstBoolean(offset + 9, $qtn_aprv_flg, value);
	}


	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public String qtn_aprv_no() {
		return getConstString(offset + 10, $qtn_aprv_no);
	}

	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public void qtn_aprv_no(String value) {
		setConstString(offset + 10, $qtn_aprv_no, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 11, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 11, $sls_dpt_cd, value);
	}


	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 12, $slo_upd_cntr);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 12, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 12, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 12, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 12, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 12, $slo_upd_cntr, value);
	}


	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 13, $qtn_upd_cntr);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 13, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 13, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 13, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 13, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 13, $qtn_upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 14, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 14, $err_flg, value);
	}


	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public boolean upd_cntr_not_chk_flg() {
		return getConstBoolean(offset + 15, $upd_cntr_not_chk_flg);
	}

	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public void upd_cntr_not_chk_flg(boolean value) {
		setConstBoolean(offset + 15, $upd_cntr_not_chk_flg, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 16, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 16, $is_src_batch_flg, value);
	}


	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 17, $slo_rev);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 17, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 17, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 17, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 17, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 17, $slo_rev, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 18, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 18, $cst_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 19, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 19, $trd_cur_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 20, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 20, $wg_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 21, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 21, $wrk_no, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 22, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 22, $tterm_cd1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 23, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 23, $tterm_cd2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 24, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 24, $tterm_cd3, value);
	}


	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 25, $edi_sub_char1);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 25, $edi_sub_char1, value);
	}


	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 26, $edi_sub_char2);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 26, $edi_sub_char2, value);
	}


	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 27, $edi_sub_char3);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 27, $edi_sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 28, $edi_sub_char4);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 28, $edi_sub_char4, value);
	}


	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 29, $edi_sub_char5);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 29, $edi_sub_char5, value);
	}


	public String getString(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			return qtn_aprv_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			return can_del_flg();
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			return qtn_aprv_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			return qtn_aprv_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			return can_del_flg();
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			return qtn_aprv_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			qtn_aprv_no(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			can_del_flg(value);
			return;
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			qtn_aprv_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			qtn_aprv_no(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			can_del_flg(value);
			return;
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			qtn_aprv_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

