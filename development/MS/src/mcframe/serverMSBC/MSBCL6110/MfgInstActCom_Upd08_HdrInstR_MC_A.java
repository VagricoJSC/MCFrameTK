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
 * ブロック"MfgInstActCom_Upd08_HdrInst"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_HdrInstR_MC_A extends MCConstRow {

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
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public static final String $base_unit_inst_qty = "base_unit_inst_qty";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public static final String $base_unit_mfg_abort_qty = "base_unit_mfg_abort_qty";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public static final String $sum_mfg_qty = "sum_mfg_qty";
	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public static final String $sum_rem_qty = "sum_rem_qty";
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
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public static final String $max_div_seq = "max_div_seq";
	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public static final String $min_div_seq = "min_div_seq";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public static final String $base_unit_st_qty = "base_unit_st_qty";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
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
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";


	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta base_unit_mfg_abort_qty_META = createCommonMeta($base_unit_mfg_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sum_mfg_qty_META = createCommonMeta($sum_mfg_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_rem_qty_META = createCommonMeta($sum_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_sts_typ_META = createCommonMeta($max_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta min_sts_typ_META = createCommonMeta($min_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta max_div_seq_META = createCommonMeta($max_div_seq, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta min_div_seq_META = createCommonMeta($min_div_seq, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta base_unit_st_qty_META = createCommonMeta($base_unit_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);

	protected static final ConstMetaList<MfgInstActCom_Upd08_HdrInstR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_HdrInstR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			mfg_inst_unit_typ_META,
			mfg_mtd_typ_META,
			base_unit_inst_qty_META,
			io_schd_pr_no_META,
			mfg_loc_cd_META,
			base_unit_mfg_abort_qty_META,
			dec_place_META,
			rnd_typ_META,
			sum_mfg_qty_META,
			sum_rem_qty_META,
			max_sts_typ_META,
			min_sts_typ_META,
			max_div_seq_META,
			min_div_seq_META,
			div_seq_META,
			base_unit_st_qty_META,
			mfg_sts_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			st_schd_tm_META,
			end_schd_tm_META,
			base_unit_cd_META,
			itm_ord_no_META
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
	protected MfgInstActCom_Upd08_HdrInstR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_HdrInstR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_HdrInstR clone() {
		return (MfgInstActCom_Upd08_HdrInstR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_HdrInstR createInstance() {
		return (MfgInstActCom_Upd08_HdrInstR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_HdrInstR getValues(String... names) {
		return (MfgInstActCom_Upd08_HdrInstR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 0, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 0, $mfg_inst_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 1, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 1, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 2, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 2, $mfg_inst_unit_typ, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 3, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 3, $mfg_mtd_typ, value);
	}


	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 4, $base_unit_inst_qty);
	}

	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 4, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 4, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 4, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. qty. 基準単位製造数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 4, $base_unit_inst_qty, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 5, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 5, $io_schd_pr_no, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 6, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 6, $mfg_loc_cd, value);
	}


	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_abort_qty() {
		return getConstNumber(offset + 7, $base_unit_mfg_abort_qty);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(MCNumber value) {
		setConstNumber(offset + 7, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(int value) {
		setConstNumber(offset + 7, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(long value) {
		setConstNumber(offset + 7, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(float value) {
		setConstNumber(offset + 7, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(double value) {
		setConstNumber(offset + 7, $base_unit_mfg_abort_qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 8, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 8, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 8, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 8, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 8, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 8, $dec_place, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 9, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 9, $rnd_typ, value);
	}


	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public MCNumber sum_mfg_qty() {
		return getConstNumber(offset + 10, $sum_mfg_qty);
	}

	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public void sum_mfg_qty(MCNumber value) {
		setConstNumber(offset + 10, $sum_mfg_qty, value);
	}

	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public void sum_mfg_qty(int value) {
		setConstNumber(offset + 10, $sum_mfg_qty, value);
	}

	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public void sum_mfg_qty(long value) {
		setConstNumber(offset + 10, $sum_mfg_qty, value);
	}

	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public void sum_mfg_qty(float value) {
		setConstNumber(offset + 10, $sum_mfg_qty, value);
	}

	/**
	 * Mfg. start qty. total 製造着手数量合計.<p>
	 *
	 */
	public void sum_mfg_qty(double value) {
		setConstNumber(offset + 10, $sum_mfg_qty, value);
	}


	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public MCNumber sum_rem_qty() {
		return getConstNumber(offset + 11, $sum_rem_qty);
	}

	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(MCNumber value) {
		setConstNumber(offset + 11, $sum_rem_qty, value);
	}

	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(int value) {
		setConstNumber(offset + 11, $sum_rem_qty, value);
	}

	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(long value) {
		setConstNumber(offset + 11, $sum_rem_qty, value);
	}

	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(float value) {
		setConstNumber(offset + 11, $sum_rem_qty, value);
	}

	/**
	 * Total remaining mfg. qty. 製造残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(double value) {
		setConstNumber(offset + 11, $sum_rem_qty, value);
	}


	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public String max_sts_typ() {
		return getConstString(offset + 12, $max_sts_typ);
	}

	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public void max_sts_typ(String value) {
		setConstString(offset + 12, $max_sts_typ, value);
	}


	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public String min_sts_typ() {
		return getConstString(offset + 13, $min_sts_typ);
	}

	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public void min_sts_typ(String value) {
		setConstString(offset + 13, $min_sts_typ, value);
	}


	/**
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public MCNumber max_div_seq() {
		return getConstNumber(offset + 14, $max_div_seq);
	}

	/**
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public void max_div_seq(MCNumber value) {
		setConstNumber(offset + 14, $max_div_seq, value);
	}

	/**
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public void max_div_seq(int value) {
		setConstNumber(offset + 14, $max_div_seq, value);
	}

	/**
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public void max_div_seq(long value) {
		setConstNumber(offset + 14, $max_div_seq, value);
	}

	/**
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public void max_div_seq(float value) {
		setConstNumber(offset + 14, $max_div_seq, value);
	}

	/**
	 * Maximum split sequence number 最大分割連番.<p>
	 *
	 */
	public void max_div_seq(double value) {
		setConstNumber(offset + 14, $max_div_seq, value);
	}


	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public MCNumber min_div_seq() {
		return getConstNumber(offset + 15, $min_div_seq);
	}

	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public void min_div_seq(MCNumber value) {
		setConstNumber(offset + 15, $min_div_seq, value);
	}

	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public void min_div_seq(int value) {
		setConstNumber(offset + 15, $min_div_seq, value);
	}

	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public void min_div_seq(long value) {
		setConstNumber(offset + 15, $min_div_seq, value);
	}

	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public void min_div_seq(float value) {
		setConstNumber(offset + 15, $min_div_seq, value);
	}

	/**
	 * Minimum split sequence number 最小分割連番.<p>
	 *
	 */
	public void min_div_seq(double value) {
		setConstNumber(offset + 15, $min_div_seq, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 16, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 16, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 16, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 16, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 16, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 16, $div_seq, value);
	}


	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_qty() {
		return getConstNumber(offset + 17, $base_unit_st_qty);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(int value) {
		setConstNumber(offset + 17, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(long value) {
		setConstNumber(offset + 17, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(float value) {
		setConstNumber(offset + 17, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(double value) {
		setConstNumber(offset + 17, $base_unit_st_qty, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 18, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 18, $mfg_sts_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 19, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 19, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 20, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 20, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 21, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 21, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 22, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 22, $itm_sub3, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 23, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 23, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 24, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 24, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 25, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 25, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 26, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 26, $sno4, value);
	}


	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 27, $st_schd_tm);
	}

	/**
	 * Scheduled start date and time 着手予定日時.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 27, $st_schd_tm, value);
	}


	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 28, $end_schd_tm);
	}

	/**
	 * Scheduled end date and time 終了予定日時.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 28, $end_schd_tm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 29, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 29, $base_unit_cd, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 30, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 30, $itm_ord_no, value);
	}


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			return max_sts_typ();
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			return min_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_abort_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			return sum_mfg_qty();
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			return sum_rem_qty();
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			return max_div_seq();
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			return min_div_seq();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			return base_unit_st_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($max_sts_typ.equalsIgnoreCase(name)) {
			return max_sts_typ();
		}
		if ($min_sts_typ.equalsIgnoreCase(name)) {
			return min_sts_typ();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_abort_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			return sum_mfg_qty();
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			return sum_rem_qty();
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			return max_div_seq();
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			return min_div_seq();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			return base_unit_st_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
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
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($sum_mfg_qty.equalsIgnoreCase(name)) {
			sum_mfg_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($max_div_seq.equalsIgnoreCase(name)) {
			max_div_seq(value);
			return;
		}
		if ($min_div_seq.equalsIgnoreCase(name)) {
			min_div_seq(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

