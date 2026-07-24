package mcframe.serverMSBB.MSBBL1230;

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
 * ブロック"Upd01_Slo_Prms"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Upd01_Slo_PrmsR_MC_A extends MCConstRow {

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_no = "slo_prms_no";
	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public static final String $slo_prms_rev = "slo_prms_rev";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_no = "dlv_inst_rcpt_no";
	/**
	 * Replied delivery date and time 回答納入日時.<p>
	 *
	 */
	public static final String $prms_dlv_tm = "prms_dlv_tm";
	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public static final String $trd_unit_prms_qty = "trd_unit_prms_qty";
	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public static final String $base_unit_prms_qty = "base_unit_prms_qty";
	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_h_no = "slo_prms_h_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public static final String $slo_prms_index = "slo_prms_index";
	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public static final String $param_row_index = "param_row_index";


	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta slo_prms_no_META = createCommonMeta($slo_prms_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_NO);
	public static final MCMeta slo_prms_rev_META = createCommonMeta($slo_prms_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta dlv_inst_rcpt_no_META = createCommonMeta($dlv_inst_rcpt_no, mcframe.commonMA.meta.MA_META.DLV_INST_RCPT_NO);
	public static final MCMeta prms_dlv_tm_META = createCommonMeta($prms_dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_unit_prms_qty_META = createCommonMeta($trd_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_prms_qty_META = createCommonMeta($base_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.SLO_PRMS_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_PRMS_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR3);
	public static final MCMeta slo_prms_h_no_META = createCommonMeta($slo_prms_h_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_H_NO);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta slo_prms_index_META = createCommonMeta($slo_prms_index, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta param_row_index_META = createCommonMeta($param_row_index, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Upd01_Slo_PrmsR> constMetas = new ConstMetaList<Upd01_Slo_PrmsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_d_no_META,
			data_crud_typ_META,
			slo_prms_no_META,
			slo_prms_rev_META,
			slo_no_META,
			ship_schd_no_META,
			dlv_inst_rcpt_no_META,
			prms_dlv_tm_META,
			trd_unit_prms_qty_META,
			base_unit_prms_qty_META,
			prms_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			slo_prms_h_no_META,
			err_flg_META,
			peg_no_META,
			slo_prms_index_META,
			param_row_index_META
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
				{$prms_dlv_tm, "E"},	// prms_dlv_tm
				{$trd_unit_prms_qty, "E"}	// trd_unit_prms_qty
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$trd_unit_prms_qty, "positive"}	// trd_unit_prms_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$trd_unit_prms_qty, "0:"}	// trd_unit_prms_qty
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
	protected Upd01_Slo_PrmsR_MC_A(ConstMetaList<? extends Upd01_Slo_PrmsR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Slo_PrmsR clone() {
		return (Upd01_Slo_PrmsR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Slo_PrmsR createInstance() {
		return (Upd01_Slo_PrmsR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Upd01_Slo_PrmsR getValues(String... names) {
		return (Upd01_Slo_PrmsR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 0, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 0, $slo_d_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public String slo_prms_no() {
		return getConstString(offset + 2, $slo_prms_no);
	}

	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public void slo_prms_no(String value) {
		setConstString(offset + 2, $slo_prms_no, value);
	}


	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public MCNumber slo_prms_rev() {
		return getConstNumber(offset + 3, $slo_prms_rev);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(MCNumber value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(int value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(long value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(float value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}

	/**
	 * Sales order promising Rev. No. 受注納期回答改訂番号.<p>
	 *
	 */
	public void slo_prms_rev(double value) {
		setConstNumber(offset + 3, $slo_prms_rev, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 4, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 4, $slo_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 5, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 5, $ship_schd_no, value);
	}


	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return getConstString(offset + 6, $dlv_inst_rcpt_no);
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		setConstString(offset + 6, $dlv_inst_rcpt_no, value);
	}


	/**
	 * Replied delivery date and time 回答納入日時.<p>
	 *
	 */
	public MCDate prms_dlv_tm() {
		return getConstDate(offset + 7, $prms_dlv_tm);
	}

	/**
	 * Replied delivery date and time 回答納入日時.<p>
	 *
	 */
	public void prms_dlv_tm(MCDate value) {
		setConstDate(offset + 7, $prms_dlv_tm, value);
	}


	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public MCNumber trd_unit_prms_qty() {
		return getConstNumber(offset + 8, $trd_unit_prms_qty);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 8, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(int value) {
		setConstNumber(offset + 8, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(long value) {
		setConstNumber(offset + 8, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(float value) {
		setConstNumber(offset + 8, $trd_unit_prms_qty, value);
	}

	/**
	 * Transaction unit replied qty. 取引単位回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(double value) {
		setConstNumber(offset + 8, $trd_unit_prms_qty, value);
	}


	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public MCNumber base_unit_prms_qty() {
		return getConstNumber(offset + 9, $base_unit_prms_qty);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(int value) {
		setConstNumber(offset + 9, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(long value) {
		setConstNumber(offset + 9, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(float value) {
		setConstNumber(offset + 9, $base_unit_prms_qty, value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(double value) {
		setConstNumber(offset + 9, $base_unit_prms_qty, value);
	}


	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 10, $prms_rmrks);
	}

	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 10, $prms_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 11, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 11, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 12, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 12, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 13, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 13, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 14, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 14, $sub_char3, value);
	}


	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public String slo_prms_h_no() {
		return getConstString(offset + 15, $slo_prms_h_no);
	}

	/**
	 * Sales order promising header No. 受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public void slo_prms_h_no(String value) {
		setConstString(offset + 15, $slo_prms_h_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 16, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 16, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 17, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 17, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 17, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 17, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 17, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 17, $peg_no, value);
	}


	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public MCNumber slo_prms_index() {
		return getConstNumber(offset + 18, $slo_prms_index);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(MCNumber value) {
		setConstNumber(offset + 18, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(int value) {
		setConstNumber(offset + 18, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(long value) {
		setConstNumber(offset + 18, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(float value) {
		setConstNumber(offset + 18, $slo_prms_index, value);
	}

	/**
	 * Order promising row index 納期回答行インデックス.<p>
	 *
	 */
	public void slo_prms_index(double value) {
		setConstNumber(offset + 18, $slo_prms_index, value);
	}


	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public MCNumber param_row_index() {
		return getConstNumber(offset + 19, $param_row_index);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(MCNumber value) {
		setConstNumber(offset + 19, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(int value) {
		setConstNumber(offset + 19, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(long value) {
		setConstNumber(offset + 19, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(float value) {
		setConstNumber(offset + 19, $param_row_index, value);
	}

	/**
	 * Parameter row index パラメータ行インデックス.<p>
	 *
	 */
	public void param_row_index(double value) {
		setConstNumber(offset + 19, $param_row_index, value);
	}


	public String getString(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			return slo_prms_rev();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			return slo_prms_index();
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			return param_row_index();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			return prms_dlv_tm();
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			return slo_prms_rev();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			return slo_prms_index();
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			return param_row_index();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			return prms_dlv_tm();
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			prms_dlv_tm(value);
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($slo_prms_rev.equalsIgnoreCase(name)) {
			slo_prms_rev(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_prms_index.equalsIgnoreCase(name)) {
			slo_prms_index(value);
			return;
		}
		if ($param_row_index.equalsIgnoreCase(name)) {
			param_row_index(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			prms_dlv_tm(value);
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

