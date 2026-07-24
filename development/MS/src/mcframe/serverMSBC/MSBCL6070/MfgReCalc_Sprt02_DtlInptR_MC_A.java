package mcframe.serverMSBC.MSBCL6070;

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
 * ブロック"MfgReCalc_Sprt02_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt02_DtlInptR_MC_A extends MCConstRow {

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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Actual operation start date and time 工程着手実績日時.<p>
	 *
	 */
	public static final String $oper_st_act_tm = "oper_st_act_tm";
	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public static final String $after_prop_st_qty = "after_prop_st_qty";
	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta recalc_grp_META = createCommonMeta($recalc_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_seq_META = createCommonMeta($recalc_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lot_seq_META = createCommonMeta($lot_seq, mcframe.commonMA.meta.MA_META.LOT_SEQ);
	public static final MCMeta inpt_st_qty_META = createCommonMeta($inpt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_act_qty_META = createCommonMeta($inpt_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta oper_st_act_tm_META = createCommonMeta($oper_st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta after_prop_st_qty_META = createCommonMeta($after_prop_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<MfgReCalc_Sprt02_DtlInptR> constMetas = new ConstMetaList<MfgReCalc_Sprt02_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			bkf_typ_META,
			recalc_grp_META,
			recalc_grp_seq_META,
			ac_dt_META,
			first_gr_dt_META,
			lot_seq_META,
			inpt_st_qty_META,
			inpt_act_qty_META,
			dec_place_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			div_seq_META,
			oper_act_no_META,
			oper_st_act_tm_META,
			after_prop_st_qty_META,
			rqst_qty_META
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
	protected MfgReCalc_Sprt02_DtlInptR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt02_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlInptR clone() {
		return (MfgReCalc_Sprt02_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlInptR createInstance() {
		return (MfgReCalc_Sprt02_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt02_DtlInptR getValues(String... names) {
		return (MfgReCalc_Sprt02_DtlInptR) super.getValues(names);
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
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 3, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 3, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 4, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 4, $inpt_act_no, value);
	}


	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 5, $bkf_typ);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 5, $bkf_typ, value);
	}


	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return getConstNumber(offset + 6, $recalc_grp);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		setConstNumber(offset + 6, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(int value) {
		setConstNumber(offset + 6, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(long value) {
		setConstNumber(offset + 6, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(float value) {
		setConstNumber(offset + 6, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(double value) {
		setConstNumber(offset + 6, $recalc_grp, value);
	}


	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return getConstNumber(offset + 7, $recalc_grp_seq);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		setConstNumber(offset + 7, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		setConstNumber(offset + 7, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		setConstNumber(offset + 7, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		setConstNumber(offset + 7, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		setConstNumber(offset + 7, $recalc_grp_seq, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 8, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 8, $ac_dt, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 9, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 9, $first_gr_dt, value);
	}


	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return getConstString(offset + 10, $lot_seq);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		setConstString(offset + 10, $lot_seq, value);
	}


	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public MCNumber inpt_st_qty() {
		return getConstNumber(offset + 11, $inpt_st_qty);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 11, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(int value) {
		setConstNumber(offset + 11, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(long value) {
		setConstNumber(offset + 11, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(float value) {
		setConstNumber(offset + 11, $inpt_st_qty, value);
	}

	/**
	 * Input start qty. 投入着手数量.<p>
	 *
	 */
	public void inpt_st_qty(double value) {
		setConstNumber(offset + 11, $inpt_st_qty, value);
	}


	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public MCNumber inpt_act_qty() {
		return getConstNumber(offset + 12, $inpt_act_qty);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(MCNumber value) {
		setConstNumber(offset + 12, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(int value) {
		setConstNumber(offset + 12, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(long value) {
		setConstNumber(offset + 12, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(float value) {
		setConstNumber(offset + 12, $inpt_act_qty, value);
	}

	/**
	 * Input result qty. 投入実績数量.<p>
	 *
	 */
	public void inpt_act_qty(double value) {
		setConstNumber(offset + 12, $inpt_act_qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 13, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 13, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 13, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 13, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 13, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 13, $dec_place, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 14, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 14, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 15, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 15, $oper_inst_no, value);
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
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 17, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 17, $oper_act_no, value);
	}


	/**
	 * Actual operation start date and time 工程着手実績日時.<p>
	 *
	 */
	public MCDate oper_st_act_tm() {
		return getConstDate(offset + 18, $oper_st_act_tm);
	}

	/**
	 * Actual operation start date and time 工程着手実績日時.<p>
	 *
	 */
	public void oper_st_act_tm(MCDate value) {
		setConstDate(offset + 18, $oper_st_act_tm, value);
	}


	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public MCNumber after_prop_st_qty() {
		return getConstNumber(offset + 19, $after_prop_st_qty);
	}

	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public void after_prop_st_qty(MCNumber value) {
		setConstNumber(offset + 19, $after_prop_st_qty, value);
	}

	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public void after_prop_st_qty(int value) {
		setConstNumber(offset + 19, $after_prop_st_qty, value);
	}

	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public void after_prop_st_qty(long value) {
		setConstNumber(offset + 19, $after_prop_st_qty, value);
	}

	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public void after_prop_st_qty(float value) {
		setConstNumber(offset + 19, $after_prop_st_qty, value);
	}

	/**
	 * Started qty. after proportional division 案分後着手数量.<p>
	 *
	 */
	public void after_prop_st_qty(double value) {
		setConstNumber(offset + 19, $after_prop_st_qty, value);
	}


	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 20, $rqst_qty);
	}

	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 20, $rqst_qty, value);
	}

	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 20, $rqst_qty, value);
	}

	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 20, $rqst_qty, value);
	}

	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 20, $rqst_qty, value);
	}

	/**
	 * Allocatable qty. 割当可能数量.<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 20, $rqst_qty, value);
	}


	public String getString(String name) {
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			return after_prop_st_qty();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
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
		if ($oper_st_act_tm.equalsIgnoreCase(name)) {
			return oper_st_act_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			return after_prop_st_qty();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
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
		if ($oper_st_act_tm.equalsIgnoreCase(name)) {
			return oper_st_act_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($oper_st_act_tm.equalsIgnoreCase(name)) {
			oper_st_act_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($recalc_grp.equalsIgnoreCase(name)) {
			recalc_grp(value);
			return;
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			recalc_grp_seq(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($after_prop_st_qty.equalsIgnoreCase(name)) {
			after_prop_st_qty(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
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
		if ($oper_st_act_tm.equalsIgnoreCase(name)) {
			oper_st_act_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

