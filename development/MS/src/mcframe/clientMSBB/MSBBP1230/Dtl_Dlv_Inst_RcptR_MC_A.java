package mcframe.clientMSBB.MSBBP1230;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl_Dlv_Inst_Rcpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl_Dlv_Inst_RcptR_MC_A extends MCConstRow {

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_no = "dlv_inst_rcpt_no";
	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_rev = "dlv_inst_rcpt_rev";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public static final String $cst_dlv_inst_no = "cst_dlv_inst_no";
	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public static final String $cst_dlv_inst_rev = "cst_dlv_inst_rev";
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_dlv_inst_d_no = "cst_dlv_inst_d_no";
	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public static final String $cst_dlv_inst_rmrks = "cst_dlv_inst_rmrks";
	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public static final String $cst_dlv_inst_d_rmrks = "cst_dlv_inst_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
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

	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";

	public static final MCMeta dlv_inst_rcpt_no_META = createCommonMeta($dlv_inst_rcpt_no, mcframe.commonMA.meta.MA_META.DLV_INST_RCPT_NO);
	public static final MCMeta dlv_inst_rcpt_rev_META = createCommonMeta($dlv_inst_rcpt_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cst_dlv_inst_no_META = createCommonMeta($cst_dlv_inst_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_NO);
	public static final MCMeta cst_dlv_inst_rev_META = createCommonMeta($cst_dlv_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta cst_dlv_inst_d_no_META = createCommonMeta($cst_dlv_inst_d_no, mcframe.commonMA.meta.MA_META.CST_DLV_INST_D_NO);
	public static final MCMeta cst_dlv_inst_rmrks_META = createCommonMeta($cst_dlv_inst_rmrks, mcframe.commonMS.meta.MS_META.CST_DLV_INST_RMRKS);
	public static final MCMeta cst_dlv_inst_d_rmrks_META = createCommonMeta($cst_dlv_inst_d_rmrks, mcframe.commonMS.meta.MS_META.CST_DLV_INST_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_RCPT_INTR_RMRKS);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_INST_RCPT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_INST_RCPT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_INST_RCPT_SUB_CHAR3);

	protected static final ConstMetaList<Dtl_Dlv_Inst_RcptR> constMetas = new ConstMetaList<Dtl_Dlv_Inst_RcptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_inst_rcpt_no_META,
			dlv_inst_rcpt_rev_META,
			slo_d_no_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_qty_p_META,
			cst_dlv_inst_no_META,
			cst_dlv_inst_rev_META,
			cst_dlv_inst_d_no_META,
			cst_dlv_inst_rmrks_META,
			cst_dlv_inst_d_rmrks_META,
			intr_rmrks_META,
			edi_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
				"trd_unit_qty",
				"base_unit_qty"
			},
			{
				$trd_unit_qty,
				$base_unit_qty
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dlv_rqst_hm, "TM"},	// dlv_rqst_hm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_qty_p + ".qty", "BASE_UNIT"}	// base_unit_qty_p.qty
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected Dtl_Dlv_Inst_RcptR_MC_A(ConstMetaList<? extends Dtl_Dlv_Inst_RcptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl_Dlv_Inst_RcptR clone() {
		return (Dtl_Dlv_Inst_RcptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl_Dlv_Inst_RcptR createInstance() {
		return (Dtl_Dlv_Inst_RcptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl_Dlv_Inst_RcptR getValues(String... names) {
		return (Dtl_Dlv_Inst_RcptR) super.getValues(names);
	}



	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return getConstString(offset + 0, $dlv_inst_rcpt_no);
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		setConstString(offset + 0, $dlv_inst_rcpt_no, value);
	}


	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public MCNumber dlv_inst_rcpt_rev() {
		return getConstNumber(offset + 1, $dlv_inst_rcpt_rev);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(MCNumber value) {
		setConstNumber(offset + 1, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(int value) {
		setConstNumber(offset + 1, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(long value) {
		setConstNumber(offset + 1, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(float value) {
		setConstNumber(offset + 1, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order received rev. number 納入指示受領改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(double value) {
		setConstNumber(offset + 1, $dlv_inst_rcpt_rev, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 2, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 2, $slo_d_no, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 3, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 3, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 4, $dlv_rqst_hm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 4, $dlv_rqst_hm, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 5, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 5, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 6, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 6, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 7, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 7, $trd_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 8, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 8, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 9, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 9, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 10, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 10, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 11, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 11, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 11, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 11, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 11, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $base_unit_qty_p, row);
	}


	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return getConstString(offset + 13, $cst_dlv_inst_no);
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		setConstString(offset + 13, $cst_dlv_inst_no, value);
	}


	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public MCNumber cst_dlv_inst_rev() {
		return getConstNumber(offset + 14, $cst_dlv_inst_rev);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(MCNumber value) {
		setConstNumber(offset + 14, $cst_dlv_inst_rev, value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(int value) {
		setConstNumber(offset + 14, $cst_dlv_inst_rev, value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(long value) {
		setConstNumber(offset + 14, $cst_dlv_inst_rev, value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(float value) {
		setConstNumber(offset + 14, $cst_dlv_inst_rev, value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(double value) {
		setConstNumber(offset + 14, $cst_dlv_inst_rev, value);
	}


	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return getConstString(offset + 15, $cst_dlv_inst_d_no);
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		setConstString(offset + 15, $cst_dlv_inst_d_no, value);
	}


	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public String cst_dlv_inst_rmrks() {
		return getConstString(offset + 16, $cst_dlv_inst_rmrks);
	}

	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public void cst_dlv_inst_rmrks(String value) {
		setConstString(offset + 16, $cst_dlv_inst_rmrks, value);
	}


	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public String cst_dlv_inst_d_rmrks() {
		return getConstString(offset + 17, $cst_dlv_inst_d_rmrks);
	}

	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public void cst_dlv_inst_d_rmrks(String value) {
		setConstString(offset + 17, $cst_dlv_inst_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 18, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 18, $intr_rmrks, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 19, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 19, $edi_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 20, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 20, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 21, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 21, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 22, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 22, $sub_char3, value);
	}


	public String getString(String name) {
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($cst_dlv_inst_rmrks.equalsIgnoreCase(name)) {
			return cst_dlv_inst_rmrks();
		}
		if ($cst_dlv_inst_d_rmrks.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_rev();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			return cst_dlv_inst_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_no();
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_no();
		}
		if ($cst_dlv_inst_rmrks.equalsIgnoreCase(name)) {
			return cst_dlv_inst_rmrks();
		}
		if ($cst_dlv_inst_d_rmrks.equalsIgnoreCase(name)) {
			return cst_dlv_inst_d_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_rev();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			return cst_dlv_inst_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($cst_dlv_inst_rmrks.equalsIgnoreCase(name)) {
			cst_dlv_inst_rmrks(value);
			return;
		}
		if ($cst_dlv_inst_d_rmrks.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($cst_dlv_inst_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_no(value);
			return;
		}
		if ($cst_dlv_inst_d_no.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_no(value);
			return;
		}
		if ($cst_dlv_inst_rmrks.equalsIgnoreCase(name)) {
			cst_dlv_inst_rmrks(value);
			return;
		}
		if ($cst_dlv_inst_d_rmrks.equalsIgnoreCase(name)) {
			cst_dlv_inst_d_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cst_dlv_inst_rev.equalsIgnoreCase(name)) {
			cst_dlv_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

}

