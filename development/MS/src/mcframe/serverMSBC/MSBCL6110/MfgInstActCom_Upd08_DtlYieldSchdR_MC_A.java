package mcframe.serverMSBC.MSBCL6110;

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
 * ブロック"MfgInstActCom_Upd08_DtlYieldSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_DtlYieldSchdR_MC_A extends MCConstRow {

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public static final String $trd_unit_yield_qty = "trd_unit_yield_qty";
	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public static final String $schd_tm = "schd_tm";
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
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
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public static final String $sum_trd_qty = "sum_trd_qty";
	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public static final String $sum_base_qty = "sum_base_qty";
	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public static final String $sum_trd_rem_qty = "sum_trd_rem_qty";
	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public static final String $sum_base_rem_qty = "sum_base_rem_qty";
	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public static final String $max_sts_typ = "max_sts_typ";
	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public static final String $min_sts_typ = "min_sts_typ";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_cmpl_schd_dt = "insp_cmpl_schd_dt";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";


	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta trd_unit_yield_qty_META = createCommonMeta($trd_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_tm_META = createCommonMeta($schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta sum_trd_qty_META = createCommonMeta($sum_trd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_base_qty_META = createCommonMeta($sum_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_trd_rem_qty_META = createCommonMeta($sum_trd_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_base_rem_qty_META = createCommonMeta($sum_base_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_sts_typ_META = createCommonMeta($max_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta min_sts_typ_META = createCommonMeta($min_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta insp_cmpl_schd_dt_META = createCommonMeta($insp_cmpl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);

	protected static final ConstMetaList<MfgInstActCom_Upd08_DtlYieldSchdR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_DtlYieldSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			yield_schd_no_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			yield_typ_META,
			trd_unit_yield_qty_META,
			base_unit_yield_qty_META,
			schd_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			strg_loc_cd_META,
			strg_str_ln_cd_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			trd_unit_cd_META,
			base_unit_cd_META,
			sum_trd_qty_META,
			sum_base_qty_META,
			sum_trd_rem_qty_META,
			sum_base_rem_qty_META,
			max_sts_typ_META,
			min_sts_typ_META,
			io_schd_typ_META,
			io_schd_sts_typ_META,
			div_seq_META,
			insp_cmpl_schd_dt_META,
			mfg_sts_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected MfgInstActCom_Upd08_DtlYieldSchdR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_DtlYieldSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlYieldSchdR clone() {
		return (MfgInstActCom_Upd08_DtlYieldSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlYieldSchdR createInstance() {
		return (MfgInstActCom_Upd08_DtlYieldSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlYieldSchdR getValues(String... names) {
		return (MfgInstActCom_Upd08_DtlYieldSchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 0, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 0, $yield_schd_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 3, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 3, $oper_inst_no, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 4, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 4, $yield_typ, value);
	}


	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public MCNumber trd_unit_yield_qty() {
		return getConstNumber(offset + 5, $trd_unit_yield_qty);
	}

	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 5, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(int value) {
		setConstNumber(offset + 5, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(long value) {
		setConstNumber(offset + 5, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(float value) {
		setConstNumber(offset + 5, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output remaining starting qty. 取引単位出来高着手数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(double value) {
		setConstNumber(offset + 5, $trd_unit_yield_qty, value);
	}


	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 6, $base_unit_yield_qty);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 6, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 6, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 6, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output start qty. 基準単位出来高着手数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 6, $base_unit_yield_qty, value);
	}


	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public MCDate schd_tm() {
		return getConstDate(offset + 7, $schd_tm);
	}

	/**
	 * Scheduled date and time 予定日時.<p>
	 *
	 */
	public void schd_tm(MCDate value) {
		setConstDate(offset + 7, $schd_tm, value);
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 12, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 12, $strg_loc_cd, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 13, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 13, $strg_str_ln_cd, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 14, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 14, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 15, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 15, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 16, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 16, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 17, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 17, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 18, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 18, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 19, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 19, $sno4, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 20, $trd_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 20, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 21, $base_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 21, $base_unit_cd, value);
	}


	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public MCNumber sum_trd_qty() {
		return getConstNumber(offset + 22, $sum_trd_qty);
	}

	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public void sum_trd_qty(MCNumber value) {
		setConstNumber(offset + 22, $sum_trd_qty, value);
	}

	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public void sum_trd_qty(int value) {
		setConstNumber(offset + 22, $sum_trd_qty, value);
	}

	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public void sum_trd_qty(long value) {
		setConstNumber(offset + 22, $sum_trd_qty, value);
	}

	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public void sum_trd_qty(float value) {
		setConstNumber(offset + 22, $sum_trd_qty, value);
	}

	/**
	 * Total transaction unit start qty. 取引単位着手数量合計.<p>
	 *
	 */
	public void sum_trd_qty(double value) {
		setConstNumber(offset + 22, $sum_trd_qty, value);
	}


	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public MCNumber sum_base_qty() {
		return getConstNumber(offset + 23, $sum_base_qty);
	}

	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public void sum_base_qty(MCNumber value) {
		setConstNumber(offset + 23, $sum_base_qty, value);
	}

	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public void sum_base_qty(int value) {
		setConstNumber(offset + 23, $sum_base_qty, value);
	}

	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public void sum_base_qty(long value) {
		setConstNumber(offset + 23, $sum_base_qty, value);
	}

	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public void sum_base_qty(float value) {
		setConstNumber(offset + 23, $sum_base_qty, value);
	}

	/**
	 * Base unit start qty. total 基準単位着手数量合計.<p>
	 *
	 */
	public void sum_base_qty(double value) {
		setConstNumber(offset + 23, $sum_base_qty, value);
	}


	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public MCNumber sum_trd_rem_qty() {
		return getConstNumber(offset + 24, $sum_trd_rem_qty);
	}

	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public void sum_trd_rem_qty(MCNumber value) {
		setConstNumber(offset + 24, $sum_trd_rem_qty, value);
	}

	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public void sum_trd_rem_qty(int value) {
		setConstNumber(offset + 24, $sum_trd_rem_qty, value);
	}

	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public void sum_trd_rem_qty(long value) {
		setConstNumber(offset + 24, $sum_trd_rem_qty, value);
	}

	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public void sum_trd_rem_qty(float value) {
		setConstNumber(offset + 24, $sum_trd_rem_qty, value);
	}

	/**
	 * Total transaction unit remaining qty. 取引単位残数量合計.<p>
	 *
	 */
	public void sum_trd_rem_qty(double value) {
		setConstNumber(offset + 24, $sum_trd_rem_qty, value);
	}


	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public MCNumber sum_base_rem_qty() {
		return getConstNumber(offset + 25, $sum_base_rem_qty);
	}

	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public void sum_base_rem_qty(MCNumber value) {
		setConstNumber(offset + 25, $sum_base_rem_qty, value);
	}

	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public void sum_base_rem_qty(int value) {
		setConstNumber(offset + 25, $sum_base_rem_qty, value);
	}

	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public void sum_base_rem_qty(long value) {
		setConstNumber(offset + 25, $sum_base_rem_qty, value);
	}

	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public void sum_base_rem_qty(float value) {
		setConstNumber(offset + 25, $sum_base_rem_qty, value);
	}

	/**
	 * Total base unit remaining qty. 基準単位残数量合計.<p>
	 *
	 */
	public void sum_base_rem_qty(double value) {
		setConstNumber(offset + 25, $sum_base_rem_qty, value);
	}


	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public String max_sts_typ() {
		return getConstString(offset + 26, $max_sts_typ);
	}

	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public void max_sts_typ(String value) {
		setConstString(offset + 26, $max_sts_typ, value);
	}


	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public String min_sts_typ() {
		return getConstString(offset + 27, $min_sts_typ);
	}

	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public void min_sts_typ(String value) {
		setConstString(offset + 27, $min_sts_typ, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 28, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 28, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 29, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 29, $io_schd_sts_typ, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 30, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 30, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 30, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 30, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 30, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 30, $div_seq, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_cmpl_schd_dt() {
		return getConstDate(offset + 31, $insp_cmpl_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_cmpl_schd_dt(MCDate value) {
		setConstDate(offset + 31, $insp_cmpl_schd_dt, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 32, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 32, $mfg_sts_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 33, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 33, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 33, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 33, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 33, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 33, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 34, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 34, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 34, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 34, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 34, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 34, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 35, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 35, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 35, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 35, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 35, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 36, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 36, $trd_unit_rnd_typ, value);
	}


	public String getString(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			return max_sts_typ();
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			return min_sts_typ();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			return sum_trd_qty();
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			return sum_base_qty();
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			return sum_trd_rem_qty();
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			return sum_base_rem_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		if ($insp_cmpl_schd_dt.equalsIgnoreCase(name)) {
			return insp_cmpl_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			return max_sts_typ();
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			return min_sts_typ();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			return sum_trd_qty();
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			return sum_base_qty();
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			return sum_trd_rem_qty();
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			return sum_base_rem_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			return schd_tm();
		}
		if ($insp_cmpl_schd_dt.equalsIgnoreCase(name)) {
			return insp_cmpl_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			max_sts_typ(value);
			return;
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			min_sts_typ(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
			return;
		}
		if ($insp_cmpl_schd_dt.equalsIgnoreCase(name)) {
			insp_cmpl_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
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
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			max_sts_typ(value);
			return;
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			min_sts_typ(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($sum_trd_qty.equalsIgnoreCase(name)) {
			sum_trd_qty(value);
			return;
		}
		if ($sum_base_qty.equalsIgnoreCase(name)) {
			sum_base_qty(value);
			return;
		}
		if ($sum_trd_rem_qty.equalsIgnoreCase(name)) {
			sum_trd_rem_qty(value);
			return;
		}
		if ($sum_base_rem_qty.equalsIgnoreCase(name)) {
			sum_base_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_tm.equalsIgnoreCase(name)) {
			schd_tm(value);
			return;
		}
		if ($insp_cmpl_schd_dt.equalsIgnoreCase(name)) {
			insp_cmpl_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

