package mcframe.serverMSBB.MSBBL1360;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public static final String $sls_act_d_seq = "sls_act_d_seq";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_schd_no = "sls_schd_no";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public static final String $purc_act_seq = "purc_act_seq";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public static final String $purc_act_d_seq = "purc_act_d_seq";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public static final String $dtl_row_id = "dtl_row_id";
	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public static final String $cred_upd_amt = "cred_upd_amt";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	public static final String $dtl1 = "dtl1";
	public static final String $hdr = "hdr";

	public static final String $trd_unit_cd = $dtl1 + ".trd_unit_cd";
	public static final String $trd_unit_qty = $dtl1 + ".trd_unit_qty";
	public static final String $trd_unit_conv_base_qty = $dtl1 + ".trd_unit_conv_base_qty";
	public static final String $trd_unit_conv_qty = $dtl1 + ".trd_unit_conv_qty";
	public static final String $schd_unit_cd = $hdr + ".trd_unit_cd";
	public static final String $schd_qty = $hdr + ".trd_unit_qty";
	public static final String $schd_upri = $hdr + ".trd_cur_upri";
	public static final String $schd_dscnt_amt = $hdr + ".trd_cur_dscnt_amt";
	public static final String $schd_amt = $hdr + ".trd_cur_amt";
	public static final String $schd_tax_amt = $hdr + ".trd_cur_tax_amt";
	public static final String $schd_inc_tax_amt = $hdr + ".trd_cur_inc_tax_amt";
	public static final String $schd_dec_place = $hdr + ".base_unit_dec_place";
	public static final String $schd_rnd_typ = $hdr + ".base_unit_rnd_typ";
	public static final String $schd_conv_qty = $hdr + ".trd_unit_conv_qty";
	public static final String $schd_conv_base_qty = $hdr + ".trd_unit_conv_base_qty";
	public static final String $schd_tax_rate = $hdr + ".tax_rate";
	public static final String $schd_inc_tax_flg = $hdr + ".inc_tax_flg";
	public static final String $schd_cur_cd = $hdr + ".trd_cur_cd";
	public static final String $schd_amt_dec_place = $hdr + ".amt_dec_place";
	public static final String $schd_upri_dec_place = $hdr + ".upri_dec_place";
	public static final String $schd_amt_rnd_typ = $hdr + ".amt_rnd_typ";
	public static final String $schd_tax_rnd_typ = $hdr + ".tax_rnd_typ";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta sls_schd_no_META = createCommonMeta($sls_schd_no, mcframe.commonMA.meta.MA_META.SLS_SCHD_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_act_d_seq_META = createCommonMeta($purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta dtl_row_id_META = createCommonMeta($dtl_row_id, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cred_upd_amt_META = createCommonMeta($cred_upd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta dtl1_META = createInnerRowMeta($dtl1, mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class);
	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			hdr_peg_no_META,
			err_flg_META,
			sync_flg_META,
			sls_act_d_no_META,
			sls_act_d_seq_META,
			slo_d_no_META,
			sls_schd_no_META,
			purc_act_no_META,
			purc_act_seq_META,
			purc_act_d_no_META,
			purc_act_d_seq_META,
			arr_pr_no_META,
			purc_schd_no_META,
			ship_schd_no_META,
			dtl_row_id_META,
			arr_pr_upd_cntr_META,
			abort_flg_META,
			cred_upd_amt_META,
			trd_cd_META,
			trd_ptn_typ_META,
			dtl1_META,
			hdr_META
		},
		new String[][]{
			{
				"trd_unit_cd",
				"trd_unit_qty",
				"trd_unit_conv_base_qty",
				"trd_unit_conv_qty",
				"schd_unit_cd",
				"schd_qty",
				"schd_upri",
				"schd_dscnt_amt",
				"schd_amt",
				"schd_tax_amt",
				"schd_inc_tax_amt",
				"schd_dec_place",
				"schd_rnd_typ",
				"schd_conv_qty",
				"schd_conv_base_qty",
				"schd_tax_rate",
				"schd_inc_tax_flg",
				"schd_cur_cd",
				"schd_amt_dec_place",
				"schd_upri_dec_place",
				"schd_amt_rnd_typ",
				"schd_tax_rnd_typ"
			},
			{
				$trd_unit_cd,
				$trd_unit_qty,
				$trd_unit_conv_base_qty,
				$trd_unit_conv_qty,
				$schd_unit_cd,
				$schd_qty,
				$schd_upri,
				$schd_dscnt_amt,
				$schd_amt,
				$schd_tax_amt,
				$schd_inc_tax_amt,
				$schd_dec_place,
				$schd_rnd_typ,
				$schd_conv_qty,
				$schd_conv_base_qty,
				$schd_tax_rate,
				$schd_inc_tax_flg,
				$schd_cur_cd,
				$schd_amt_dec_place,
				$schd_upri_dec_place,
				$schd_amt_rnd_typ,
				$schd_tax_rnd_typ
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
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
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 3, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 3, $sync_flg, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 4, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 4, $sls_act_d_no, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 5, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 5, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 5, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 5, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 5, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 5, $sls_act_d_seq, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 6, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 6, $slo_d_no, value);
	}


	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public String sls_schd_no() {
		return getConstString(offset + 7, $sls_schd_no);
	}

	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public void sls_schd_no(String value) {
		setConstString(offset + 7, $sls_schd_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 8, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 8, $purc_act_no, value);
	}


	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 9, $purc_act_seq);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 9, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 9, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 9, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 9, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 9, $purc_act_seq, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 10, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 10, $purc_act_d_no, value);
	}


	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return getConstNumber(offset + 11, $purc_act_d_seq);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 11, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		setConstNumber(offset + 11, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		setConstNumber(offset + 11, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		setConstNumber(offset + 11, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		setConstNumber(offset + 11, $purc_act_d_seq, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 12, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 12, $arr_pr_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 13, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 13, $purc_schd_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 14, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 14, $ship_schd_no, value);
	}


	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCNumber dtl_row_id() {
		return getConstNumber(offset + 15, $dtl_row_id);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(MCNumber value) {
		setConstNumber(offset + 15, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(int value) {
		setConstNumber(offset + 15, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(long value) {
		setConstNumber(offset + 15, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(float value) {
		setConstNumber(offset + 15, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(double value) {
		setConstNumber(offset + 15, $dtl_row_id, value);
	}


	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 16, $arr_pr_upd_cntr);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 16, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 16, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 16, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 16, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 16, $arr_pr_upd_cntr, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 17, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 17, $abort_flg, value);
	}


	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public MCNumber cred_upd_amt() {
		return getConstNumber(offset + 18, $cred_upd_amt);
	}

	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public void cred_upd_amt(MCNumber value) {
		setConstNumber(offset + 18, $cred_upd_amt, value);
	}

	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public void cred_upd_amt(int value) {
		setConstNumber(offset + 18, $cred_upd_amt, value);
	}

	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public void cred_upd_amt(long value) {
		setConstNumber(offset + 18, $cred_upd_amt, value);
	}

	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public void cred_upd_amt(float value) {
		setConstNumber(offset + 18, $cred_upd_amt, value);
	}

	/**
	 * Credit update amount 与信更新額.<p>
	 *
	 */
	public void cred_upd_amt(double value) {
		setConstNumber(offset + 18, $cred_upd_amt, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 19, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 19, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 20, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 20, $trd_ptn_typ, value);
	}


	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R dtl1(){
		return (mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R) getConstInnerRow(offset + 21, $dtl1);
	}
	
	public void dtl1(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R row){
		setConstInnerRow(offset + 21, $dtl1, row);
	}


	public mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR hdr(){
		return (mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR) getConstInnerRow(offset + 22, $hdr);
	}
	
	public void hdr(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR row){
		setConstInnerRow(offset + 22, $hdr, row);
	}


	public String getString(String name) {
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			return cred_upd_amt();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			return cred_upd_amt();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dtl1.equalsIgnoreCase(name)) {
			return dtl1();
		}
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dtl1.equalsIgnoreCase(name)) {
			dtl1(
				((MCContainerMeta) dtl1_META).castInnerRow(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R.class, value)
			);
			return;
		}
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String trd_unit_cd() {
		return dtl1().trd_unit_cd();
	}

	public void trd_unit_cd(String value) {
		dtl1().trd_unit_cd(value);
	}

	public MCNumber trd_unit_qty() {
		return dtl1().trd_unit_qty();
	}

	public void trd_unit_qty(MCNumber value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(int value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(long value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(float value) {
		dtl1().trd_unit_qty(value);
	}

	public void trd_unit_qty(double value) {
		dtl1().trd_unit_qty(value);
	}

	public MCNumber trd_unit_conv_base_qty() {
		return dtl1().trd_unit_conv_base_qty();
	}

	public void trd_unit_conv_base_qty(MCNumber value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(int value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(long value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(float value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public void trd_unit_conv_base_qty(double value) {
		dtl1().trd_unit_conv_base_qty(value);
	}

	public MCNumber trd_unit_conv_qty() {
		return dtl1().trd_unit_conv_qty();
	}

	public void trd_unit_conv_qty(MCNumber value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(int value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(long value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(float value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public void trd_unit_conv_qty(double value) {
		dtl1().trd_unit_conv_qty(value);
	}

	public String schd_unit_cd() {
		return hdr().trd_unit_cd();
	}

	public void schd_unit_cd(String value) {
		hdr().trd_unit_cd(value);
	}

	public MCNumber schd_qty() {
		return hdr().trd_unit_qty();
	}

	public void schd_qty(MCNumber value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(int value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(long value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(float value) {
		hdr().trd_unit_qty(value);
	}

	public void schd_qty(double value) {
		hdr().trd_unit_qty(value);
	}

	public MCNumber schd_upri() {
		return hdr().trd_cur_upri();
	}

	public void schd_upri(MCNumber value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(int value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(long value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(float value) {
		hdr().trd_cur_upri(value);
	}

	public void schd_upri(double value) {
		hdr().trd_cur_upri(value);
	}

	public MCNumber schd_dscnt_amt() {
		return hdr().trd_cur_dscnt_amt();
	}

	public void schd_dscnt_amt(MCNumber value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(int value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(long value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(float value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public void schd_dscnt_amt(double value) {
		hdr().trd_cur_dscnt_amt(value);
	}

	public MCNumber schd_amt() {
		return hdr().trd_cur_amt();
	}

	public void schd_amt(MCNumber value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(int value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(long value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(float value) {
		hdr().trd_cur_amt(value);
	}

	public void schd_amt(double value) {
		hdr().trd_cur_amt(value);
	}

	public MCNumber schd_tax_amt() {
		return hdr().trd_cur_tax_amt();
	}

	public void schd_tax_amt(MCNumber value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(int value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(long value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(float value) {
		hdr().trd_cur_tax_amt(value);
	}

	public void schd_tax_amt(double value) {
		hdr().trd_cur_tax_amt(value);
	}

	public MCNumber schd_inc_tax_amt() {
		return hdr().trd_cur_inc_tax_amt();
	}

	public void schd_inc_tax_amt(MCNumber value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(int value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(long value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(float value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public void schd_inc_tax_amt(double value) {
		hdr().trd_cur_inc_tax_amt(value);
	}

	public MCNumber schd_dec_place() {
		return hdr().base_unit_dec_place();
	}

	public void schd_dec_place(MCNumber value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(int value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(long value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(float value) {
		hdr().base_unit_dec_place(value);
	}

	public void schd_dec_place(double value) {
		hdr().base_unit_dec_place(value);
	}

	public String schd_rnd_typ() {
		return hdr().base_unit_rnd_typ();
	}

	public void schd_rnd_typ(String value) {
		hdr().base_unit_rnd_typ(value);
	}

	public MCNumber schd_conv_qty() {
		return hdr().trd_unit_conv_qty();
	}

	public void schd_conv_qty(MCNumber value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(int value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(long value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(float value) {
		hdr().trd_unit_conv_qty(value);
	}

	public void schd_conv_qty(double value) {
		hdr().trd_unit_conv_qty(value);
	}

	public MCNumber schd_conv_base_qty() {
		return hdr().trd_unit_conv_base_qty();
	}

	public void schd_conv_base_qty(MCNumber value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(int value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(long value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(float value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public void schd_conv_base_qty(double value) {
		hdr().trd_unit_conv_base_qty(value);
	}

	public MCNumber schd_tax_rate() {
		return hdr().tax_rate();
	}

	public void schd_tax_rate(MCNumber value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(int value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(long value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(float value) {
		hdr().tax_rate(value);
	}

	public void schd_tax_rate(double value) {
		hdr().tax_rate(value);
	}

	public boolean schd_inc_tax_flg() {
		return hdr().inc_tax_flg();
	}

	public void schd_inc_tax_flg(boolean value) {
		hdr().inc_tax_flg(value);
	}

	public String schd_cur_cd() {
		return hdr().trd_cur_cd();
	}

	public void schd_cur_cd(String value) {
		hdr().trd_cur_cd(value);
	}

	public MCNumber schd_amt_dec_place() {
		return hdr().amt_dec_place();
	}

	public void schd_amt_dec_place(MCNumber value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(int value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(long value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(float value) {
		hdr().amt_dec_place(value);
	}

	public void schd_amt_dec_place(double value) {
		hdr().amt_dec_place(value);
	}

	public MCNumber schd_upri_dec_place() {
		return hdr().upri_dec_place();
	}

	public void schd_upri_dec_place(MCNumber value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(int value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(long value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(float value) {
		hdr().upri_dec_place(value);
	}

	public void schd_upri_dec_place(double value) {
		hdr().upri_dec_place(value);
	}

	public String schd_amt_rnd_typ() {
		return hdr().amt_rnd_typ();
	}

	public void schd_amt_rnd_typ(String value) {
		hdr().amt_rnd_typ(value);
	}

	public String schd_tax_rnd_typ() {
		return hdr().tax_rnd_typ();
	}

	public void schd_tax_rnd_typ(String value) {
		hdr().tax_rnd_typ(value);
	}

}

