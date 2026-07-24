package mcframe.serverMGBD.MGBDL0520;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

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
	public static final String $dbc = "dbc";
	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";

	public static final String $par_itm_cd = $dbc + ".par_itm_cd";
	public static final String $par_itm_sub1 = $dbc + ".par_itm_sub1";
	public static final String $par_itm_sub2 = $dbc + ".par_itm_sub2";
	public static final String $par_itm_sub3 = $dbc + ".par_itm_sub3";
	public static final String $bom_ptn = $dbc + ".bom_ptn";
	public static final String $oper_cd = $dbc + ".oper_cd";
	public static final String $oper_seq = $dbc + ".oper_seq";
	public static final String $chd_itm_cd = $dbc + ".chd_itm_cd";
	public static final String $chd_itm_sub1 = $dbc + ".chd_itm_sub1";
	public static final String $chd_itm_sub2 = $dbc + ".chd_itm_sub2";
	public static final String $chd_itm_sub3 = $dbc + ".chd_itm_sub3";
	public static final String $alt_grp_cd = $dbc + ".alt_grp_cd";
	public static final String $expns_cd = $dbc + ".expns_cd";
	public static final String $term = $dbc + ".term";
	public static final String $calc_ctg_cd = $dbc + ".calc_ctg_cd";
	public static final String $wg_cd = $dbc + ".wg_cd";
	public static final String $disp_seq = $dbc + ".disp_seq";
	public static final String $par_rqmt_qty = $dbc + ".par_rqmt_qty";
	public static final String $chd_rqmt_qty = $dbc + ".chd_rqmt_qty";
	public static final String $chd_base_qty = $dbc + ".chd_base_qty";
	public static final String $fxd_chd_rqmt_qty = $dbc + ".fxd_chd_rqmt_qty";
	public static final String $chd_min_qty = $dbc + ".chd_min_qty";
	public static final String $chd_batch_qty = $dbc + ".chd_batch_qty";
	public static final String $alt_itm_ratio = $dbc + ".alt_itm_ratio";
	public static final String $rmrks = $dbc + ".rmrks";
	public static final String $sub_char1 = $dbc + ".sub_char1";
	public static final String $sub_char2 = $dbc + ".sub_char2";
	public static final String $sub_char3 = $dbc + ".sub_char3";
	public static final String $non_calc_flg = $dbc + ".non_calc_flg";
	public static final String $upd_cntr = $dbc + ".upd_cntr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_BOM_R.class);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			dbc_META,
			par_dec_place_META,
			chd_dec_place_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"bom_ptn",
				"oper_cd",
				"oper_seq",
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"alt_grp_cd",
				"expns_cd",
				"term",
				"calc_ctg_cd",
				"wg_cd",
				"disp_seq",
				"par_rqmt_qty",
				"chd_rqmt_qty",
				"chd_base_qty",
				"fxd_chd_rqmt_qty",
				"chd_min_qty",
				"chd_batch_qty",
				"alt_itm_ratio",
				"rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"non_calc_flg",
				"upd_cntr"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$bom_ptn,
				$oper_cd,
				$oper_seq,
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$alt_grp_cd,
				$expns_cd,
				$term,
				$calc_ctg_cd,
				$wg_cd,
				$disp_seq,
				$par_rqmt_qty,
				$chd_rqmt_qty,
				$chd_base_qty,
				$fxd_chd_rqmt_qty,
				$chd_min_qty,
				$chd_batch_qty,
				$alt_itm_ratio,
				$rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$non_calc_flg,
				$upd_cntr
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
				{$dbc + ".par_itm_cd", "E"},	// dbc.par_itm_cd
				{$dbc + ".par_itm_sub1", "E"},	// dbc.par_itm_sub1
				{$dbc + ".par_itm_sub2", "E"},	// dbc.par_itm_sub2
				{$dbc + ".par_itm_sub3", "E"},	// dbc.par_itm_sub3
				{$dbc + ".bom_ptn", "E"},	// dbc.bom_ptn
				{$dbc + ".chd_itm_cd", "E"},	// dbc.chd_itm_cd
				{$dbc + ".chd_itm_sub1", "E"},	// dbc.chd_itm_sub1
				{$dbc + ".chd_itm_sub2", "E"},	// dbc.chd_itm_sub2
				{$dbc + ".chd_itm_sub3", "E"},	// dbc.chd_itm_sub3
				{$dbc + ".term", "E"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "E"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "E"}	// dbc.wg_cd
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dbc + ".oper_seq", "E"},	// dbc.oper_seq
				{$dbc + ".disp_seq", "E"},	// dbc.disp_seq
				{$dbc + ".par_rqmt_qty", "E"},	// dbc.par_rqmt_qty
				{$dbc + ".chd_rqmt_qty", "E"},	// dbc.chd_rqmt_qty
				{$dbc + ".chd_base_qty", "E"},	// dbc.chd_base_qty
				{$dbc + ".fxd_chd_rqmt_qty", "E"},	// dbc.fxd_chd_rqmt_qty
				{$dbc + ".chd_min_qty", "E"},	// dbc.chd_min_qty
				{$dbc + ".chd_batch_qty", "E"},	// dbc.chd_batch_qty
				{$dbc + ".alt_itm_ratio", "E"}	// dbc.alt_itm_ratio
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$dbc + ".par_rqmt_qty", "positive"}	// dbc.par_rqmt_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$dbc + ".oper_seq", "0:"},	// dbc.oper_seq
				{$dbc + ".alt_itm_ratio", "0:"}	// dbc.alt_itm_ratio
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
				{$dbc + ".par_itm_cd", "Key"},	// dbc.par_itm_cd
				{$dbc + ".par_itm_sub1", "Key"},	// dbc.par_itm_sub1
				{$dbc + ".par_itm_sub2", "Key"},	// dbc.par_itm_sub2
				{$dbc + ".par_itm_sub3", "Key"},	// dbc.par_itm_sub3
				{$dbc + ".bom_ptn", "Key"},	// dbc.bom_ptn
				{$dbc + ".oper_cd", "Key"},	// dbc.oper_cd
				{$dbc + ".oper_seq", "Key"},	// dbc.oper_seq
				{$dbc + ".chd_itm_cd", "Key"},	// dbc.chd_itm_cd
				{$dbc + ".chd_itm_sub1", "Key"},	// dbc.chd_itm_sub1
				{$dbc + ".chd_itm_sub2", "Key"},	// dbc.chd_itm_sub2
				{$dbc + ".chd_itm_sub3", "Key"},	// dbc.chd_itm_sub3
				{$dbc + ".alt_grp_cd", "Key"},	// dbc.alt_grp_cd
				{$dbc + ".expns_cd", "Key"},	// dbc.expns_cd
				{$dbc + ".term", "Key"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "Key"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "Key"}	// dbc.wg_cd
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
				{$dbc + ".par_itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dbc.par_itm_sub3
				{$dbc + ".oper_cd", "MA.MAUAL0010.Oper"},	// dbc.oper_cd
				{$dbc + ".chd_itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dbc.chd_itm_sub3
				{$dbc + ".expns_cd", "MA.MAUAL0010.Expns"},	// dbc.expns_cd
				{$dbc + ".term", "MA.MAUAL0010.Term"},	// dbc.term
				{$dbc + ".calc_ctg_cd", "MA.MAUAL0010.CalcCtg"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "MA.MAUAL0010.CostWg"}	// dbc.wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dbc + ".par_itm_sub3", "par_dec_place"},	// dbc.par_itm_sub3
				{$dbc + ".chd_itm_sub3", "chd_dec_place"}	// dbc.chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".par_itm_sub3", "dec_place"},	// dbc.par_itm_sub3
				{$dbc + ".chd_itm_sub3", "dec_place"}	// dbc.chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dbc + ".par_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;par_itm_cd;par_itm_sub1;par_itm_sub2;true;true"},	// dbc.par_itm_sub3
				{$dbc + ".chd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;chd_itm_cd;chd_itm_sub1;chd_itm_sub2;true;true"},	// dbc.chd_itm_sub3
				{$dbc + ".expns_cd", "MAC_EXPNS_TYP.PROD"}	// dbc.expns_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".par_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// dbc.par_itm_sub3
				{$dbc + ".chd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// dbc.chd_itm_sub3
				{$dbc + ".expns_cd", "expns_typ"}	// dbc.expns_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$dbc + ".par_itm_sub1", "E"},	// dbc.par_itm_sub1
				{$dbc + ".par_itm_sub2", "E"},	// dbc.par_itm_sub2
				{$dbc + ".par_itm_sub3", "E"},	// dbc.par_itm_sub3
				{$dbc + ".chd_itm_sub1", "E"},	// dbc.chd_itm_sub1
				{$dbc + ".chd_itm_sub2", "E"},	// dbc.chd_itm_sub2
				{$dbc + ".chd_itm_sub3", "E"},	// dbc.chd_itm_sub3
				{$dbc + ".wg_cd", "E"}	// dbc.wg_cd
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
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


	public mcframe.serverMG.dbc.MGT_BOM_R dbc(){
		return (mcframe.serverMG.dbc.MGT_BOM_R) getConstInnerRow(offset + 3, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_BOM_R row){
		setConstInnerRow(offset + 3, $dbc, row);
	}


	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 4, $par_dec_place);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 4, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 4, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 4, $par_dec_place, value);
	}

	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 4, $par_dec_place, value);
	}


	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 5, $chd_dec_place);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 5, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 5, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 5, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 5, $chd_dec_place, value);
	}

	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 5, $chd_dec_place, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		return super.getNumber(name);
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		return super.getNumberNE(name);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dbc.equalsIgnoreCase(name)) {
			return dbc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dbc.equalsIgnoreCase(name)) {
			dbc(
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_BOM_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return dbc().par_itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		dbc().par_itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return dbc().par_itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		dbc().par_itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return dbc().par_itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		dbc().par_itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return dbc().par_itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		dbc().par_itm_sub3(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return dbc().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		dbc().bom_ptn(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return dbc().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		dbc().oper_cd(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return dbc().oper_seq();
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		dbc().oper_seq(value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		dbc().oper_seq(value);
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return dbc().chd_itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		dbc().chd_itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return dbc().chd_itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		dbc().chd_itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return dbc().chd_itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		dbc().chd_itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return dbc().chd_itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		dbc().chd_itm_sub3(value);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return dbc().alt_grp_cd();
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		dbc().alt_grp_cd(value);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return dbc().expns_cd();
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		dbc().expns_cd(value);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return dbc().term();
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		dbc().term(value);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return dbc().calc_ctg_cd();
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		dbc().calc_ctg_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return dbc().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		dbc().wg_cd(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return dbc().disp_seq();
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		dbc().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		dbc().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		dbc().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		dbc().disp_seq(value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		dbc().disp_seq(value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public MCNumber par_rqmt_qty() {
		return dbc().par_rqmt_qty();
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(MCNumber value) {
		dbc().par_rqmt_qty(value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(int value) {
		dbc().par_rqmt_qty(value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(long value) {
		dbc().par_rqmt_qty(value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(float value) {
		dbc().par_rqmt_qty(value);
	}

	/**
	 * Required number of parent 親必要数.<p>
	 *
	 */
	public void par_rqmt_qty(double value) {
		dbc().par_rqmt_qty(value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return dbc().chd_rqmt_qty();
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		dbc().chd_rqmt_qty(value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		dbc().chd_rqmt_qty(value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		dbc().chd_rqmt_qty(value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		dbc().chd_rqmt_qty(value);
	}

	/**
	 * Required number of child 子必要数.<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		dbc().chd_rqmt_qty(value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public MCNumber chd_base_qty() {
		return dbc().chd_base_qty();
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(MCNumber value) {
		dbc().chd_base_qty(value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(int value) {
		dbc().chd_base_qty(value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(long value) {
		dbc().chd_base_qty(value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(float value) {
		dbc().chd_base_qty(value);
	}

	/**
	 * Base number of child 子基準数.<p>
	 *
	 */
	public void chd_base_qty(double value) {
		dbc().chd_base_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return dbc().fxd_chd_rqmt_qty();
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		dbc().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		dbc().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		dbc().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		dbc().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		dbc().fxd_chd_rqmt_qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public MCNumber chd_min_qty() {
		return dbc().chd_min_qty();
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(MCNumber value) {
		dbc().chd_min_qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(int value) {
		dbc().chd_min_qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(long value) {
		dbc().chd_min_qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(float value) {
		dbc().chd_min_qty(value);
	}

	/**
	 * Child min. required qty. 子最小必要数量.<p>
	 *
	 */
	public void chd_min_qty(double value) {
		dbc().chd_min_qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public MCNumber chd_batch_qty() {
		return dbc().chd_batch_qty();
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(MCNumber value) {
		dbc().chd_batch_qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(int value) {
		dbc().chd_batch_qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(long value) {
		dbc().chd_batch_qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(float value) {
		dbc().chd_batch_qty(value);
	}

	/**
	 * Increments of child required qty. 子刻み必要数量.<p>
	 *
	 */
	public void chd_batch_qty(double value) {
		dbc().chd_batch_qty(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return dbc().alt_itm_ratio();
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		dbc().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		dbc().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		dbc().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		dbc().alt_itm_ratio(value);
	}

	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		dbc().alt_itm_ratio(value);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return dbc().rmrks();
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		dbc().rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return dbc().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		dbc().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return dbc().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		dbc().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return dbc().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		dbc().sub_char3(value);
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public boolean non_calc_flg() {
		return dbc().non_calc_flg();
	}

	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public void non_calc_flg(boolean value) {
		dbc().non_calc_flg(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return dbc().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		dbc().upd_cntr(value);
	}

}

