package mcframe.serverMSBC.MSBCL1100;

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
 * ブロック"Sprt06_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt06_DtlInptR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public static final String $up_peg_no = "up_peg_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public static final String $recalc_grp = "recalc_grp";
	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public static final String $recalc_grp_seq = "recalc_grp_seq";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public static final String $lot_seq = "lot_seq";
	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_st_qty = "base_unit_inpt_st_qty";
	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_act_qty = "base_unit_inpt_act_qty";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public static final String $cont_inpt_st_qty = "cont_inpt_st_qty";
	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public static final String $cont_inpt_act_qty = "cont_inpt_act_qty";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public static final String $inpt_st_qty = "inpt_st_qty";
	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public static final String $inpt_act_qty = "inpt_act_qty";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public static final String $add_flg = "add_flg";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta up_peg_no_META = createCommonMeta($up_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta recalc_grp_META = createCommonMeta($recalc_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_seq_META = createCommonMeta($recalc_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta base_unit_inpt_st_qty_META = createCommonMeta($base_unit_inpt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inpt_act_qty_META = createCommonMeta($base_unit_inpt_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_inpt_st_qty_META = createCommonMeta($cont_inpt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_act_qty_META = createCommonMeta($cont_inpt_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta inpt_st_qty_META = createCommonMeta($inpt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_act_qty_META = createCommonMeta($inpt_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta add_flg_META = createCommonMeta($add_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Sprt06_DtlInptR> constMetas = new ConstMetaList<Sprt06_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			up_peg_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			bkf_typ_META,
			recalc_grp_META,
			recalc_grp_seq_META,
			ac_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			base_unit_inpt_st_qty_META,
			base_unit_inpt_act_qty_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			cont_fctr_flg_META,
			cont_inpt_st_qty_META,
			cont_inpt_act_qty_META,
			cont_fctr_dec_place_META,
			act_cont_fctr_META,
			std_cont_fctr_META,
			inpt_st_qty_META,
			inpt_act_qty_META,
			dec_place_META,
			add_flg_META
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
	protected Sprt06_DtlInptR_MC_A(ConstMetaList<? extends Sprt06_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt06_DtlInptR clone() {
		return (Sprt06_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt06_DtlInptR createInstance() {
		return (Sprt06_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt06_DtlInptR getValues(String... names) {
		return (Sprt06_DtlInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 1, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 1, $oper_peg_no, value);
	}


	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Input pegging No. 投入紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public MCNumber up_peg_no() {
		return getConstNumber(offset + 3, $up_peg_no);
	}

	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public void up_peg_no(MCNumber value) {
		setConstNumber(offset + 3, $up_peg_no, value);
	}

	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public void up_peg_no(int value) {
		setConstNumber(offset + 3, $up_peg_no, value);
	}

	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public void up_peg_no(long value) {
		setConstNumber(offset + 3, $up_peg_no, value);
	}

	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public void up_peg_no(float value) {
		setConstNumber(offset + 3, $up_peg_no, value);
	}

	/**
	 * Input pegging No. (Request message) 投入紐付けＮＯ（上り電文）.<p>
	 *
	 */
	public void up_peg_no(double value) {
		setConstNumber(offset + 3, $up_peg_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 4, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 4, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 5, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 5, $oper_act_no, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 6, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 6, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 7, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 7, $inpt_act_no, value);
	}


	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 8, $bkf_typ);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 8, $bkf_typ, value);
	}


	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return getConstNumber(offset + 9, $recalc_grp);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		setConstNumber(offset + 9, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(int value) {
		setConstNumber(offset + 9, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(long value) {
		setConstNumber(offset + 9, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(float value) {
		setConstNumber(offset + 9, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(double value) {
		setConstNumber(offset + 9, $recalc_grp, value);
	}


	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return getConstNumber(offset + 10, $recalc_grp_seq);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		setConstNumber(offset + 10, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		setConstNumber(offset + 10, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		setConstNumber(offset + 10, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		setConstNumber(offset + 10, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		setConstNumber(offset + 10, $recalc_grp_seq, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 11, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 11, $ac_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 12, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 12, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 13, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 13, $lot_seq, value);
	}


	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_st_qty() {
		return getConstNumber(offset + 14, $base_unit_inpt_st_qty);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 14, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(int value) {
		setConstNumber(offset + 14, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(long value) {
		setConstNumber(offset + 14, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(float value) {
		setConstNumber(offset + 14, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(double value) {
		setConstNumber(offset + 14, $base_unit_inpt_st_qty, value);
	}


	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_act_qty() {
		return getConstNumber(offset + 15, $base_unit_inpt_act_qty);
	}

	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(MCNumber value) {
		setConstNumber(offset + 15, $base_unit_inpt_act_qty, value);
	}

	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(int value) {
		setConstNumber(offset + 15, $base_unit_inpt_act_qty, value);
	}

	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(long value) {
		setConstNumber(offset + 15, $base_unit_inpt_act_qty, value);
	}

	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(float value) {
		setConstNumber(offset + 15, $base_unit_inpt_act_qty, value);
	}

	/**
	 * Base unit input result qty. 基準単位投入実績数量.<p>
	 *
	 */
	public void base_unit_inpt_act_qty(double value) {
		setConstNumber(offset + 15, $base_unit_inpt_act_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 16, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 16, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 17, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 17, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 18, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 18, $cont_fctr_flg, value);
	}


	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public MCNumber cont_inpt_st_qty() {
		return getConstNumber(offset + 19, $cont_inpt_st_qty);
	}

	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(int value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(long value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(float value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Input start qty. in active ingredient unit 有効成分単位投入着手数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(double value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}


	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public MCNumber cont_inpt_act_qty() {
		return getConstNumber(offset + 20, $cont_inpt_act_qty);
	}

	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public void cont_inpt_act_qty(MCNumber value) {
		setConstNumber(offset + 20, $cont_inpt_act_qty, value);
	}

	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public void cont_inpt_act_qty(int value) {
		setConstNumber(offset + 20, $cont_inpt_act_qty, value);
	}

	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public void cont_inpt_act_qty(long value) {
		setConstNumber(offset + 20, $cont_inpt_act_qty, value);
	}

	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public void cont_inpt_act_qty(float value) {
		setConstNumber(offset + 20, $cont_inpt_act_qty, value);
	}

	/**
	 * Input result qty. in active ingredient unit 有効成分単位投入実績数量.<p>
	 *
	 */
	public void cont_inpt_act_qty(double value) {
		setConstNumber(offset + 20, $cont_inpt_act_qty, value);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 21, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 21, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 21, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 21, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 21, $cont_fctr_dec_place, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 22, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 22, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 22, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 22, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 22, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 22, $act_cont_fctr, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 23, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 23, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 23, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 23, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 23, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 23, $std_cont_fctr, value);
	}


	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public MCNumber inpt_st_qty() {
		return getConstNumber(offset + 24, $inpt_st_qty);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 24, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(int value) {
		setConstNumber(offset + 24, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(long value) {
		setConstNumber(offset + 24, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(float value) {
		setConstNumber(offset + 24, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(double value) {
		setConstNumber(offset + 24, $inpt_st_qty, value);
	}


	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public MCNumber inpt_act_qty() {
		return getConstNumber(offset + 25, $inpt_act_qty);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(MCNumber value) {
		setConstNumber(offset + 25, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(int value) {
		setConstNumber(offset + 25, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(long value) {
		setConstNumber(offset + 25, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(float value) {
		setConstNumber(offset + 25, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(double value) {
		setConstNumber(offset + 25, $inpt_act_qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 26, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 26, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 26, $dec_place, value);
	}


	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public boolean add_flg() {
		return getConstBoolean(offset + 27, $add_flg);
	}

	/**
	 * Additional row 追加行.<p>
	 *
	 */
	public void add_flg(boolean value) {
		setConstBoolean(offset + 27, $add_flg, value);
	}


	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			return up_peg_no();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_st_qty();
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_act_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			return cont_inpt_st_qty();
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			return cont_inpt_act_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			return inpt_st_qty();
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			return inpt_act_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			return lot_seq();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			return up_peg_no();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_st_qty();
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_act_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			return cont_inpt_st_qty();
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			return cont_inpt_act_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			return inpt_st_qty();
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			return inpt_act_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			return add_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($lot_seq.equalsIgnoreCase(name)) {
			lot_seq(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($up_peg_no.equalsIgnoreCase(name)) {
			up_peg_no(value);
			return;
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_inpt_act_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_act_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_inpt_act_qty.equalsIgnoreCase(name)) {
			cont_inpt_act_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($inpt_st_qty.equalsIgnoreCase(name)) {
			inpt_st_qty(value);
			return;
		}
		if ($inpt_act_qty.equalsIgnoreCase(name)) {
			inpt_act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($add_flg.equalsIgnoreCase(name)) {
			add_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

