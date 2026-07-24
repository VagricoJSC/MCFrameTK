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
 * ブロック"MfgReCalc_Sprt03_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt03_DtlInptR_MC_A extends MCConstRow {

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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public static final String $old_base_unit_inpt_st_qty = "old_base_unit_inpt_st_qty";
	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public static final String $old_base_unit_rqmt_st_qty = "old_base_unit_rqmt_st_qty";
	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public static final String $old_base_unit_fxd_rqmt_st_qty = "old_base_unit_fxd_rqmt_st_qty";
	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public static final String $old_cont_inpt_st_qty = "old_cont_inpt_st_qty";
	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public static final String $old_cont_rqmt_st_qty = "old_cont_rqmt_st_qty";
	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public static final String $old_cont_fxd_rqmt_st_qty = "old_cont_fxd_rqmt_st_qty";
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_unit_dec_place = "cont_unit_dec_place";
	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_st_qty = "base_unit_inpt_st_qty";
	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_st_qty = "base_unit_rqmt_st_qty";
	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_st_qty = "base_unit_fxd_rqmt_st_qty";
	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public static final String $cont_inpt_st_qty = "cont_inpt_st_qty";
	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public static final String $cont_rqmt_st_qty = "cont_rqmt_st_qty";
	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_st_qty = "cont_fxd_rqmt_st_qty";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta old_base_unit_inpt_st_qty_META = createCommonMeta($old_base_unit_inpt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta old_base_unit_rqmt_st_qty_META = createCommonMeta($old_base_unit_rqmt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta old_base_unit_fxd_rqmt_st_qty_META = createCommonMeta($old_base_unit_fxd_rqmt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta old_cont_inpt_st_qty_META = createCommonMeta($old_cont_inpt_st_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta old_cont_rqmt_st_qty_META = createCommonMeta($old_cont_rqmt_st_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta old_cont_fxd_rqmt_st_qty_META = createCommonMeta($old_cont_fxd_rqmt_st_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta recalc_grp_META = createCommonMeta($recalc_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta recalc_grp_seq_META = createCommonMeta($recalc_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_unit_dec_place_META = createCommonMeta($cont_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_inpt_st_qty_META = createCommonMeta($base_unit_inpt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_st_qty_META = createCommonMeta($base_unit_rqmt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_st_qty_META = createCommonMeta($base_unit_fxd_rqmt_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_st_qty_META = createCommonMeta($cont_inpt_st_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_st_qty_META = createCommonMeta($cont_rqmt_st_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_st_qty_META = createCommonMeta($cont_fxd_rqmt_st_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);

	protected static final ConstMetaList<MfgReCalc_Sprt03_DtlInptR> constMetas = new ConstMetaList<MfgReCalc_Sprt03_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			inpt_schd_no_META,
			mfg_inst_no_META,
			div_seq_META,
			old_base_unit_inpt_st_qty_META,
			old_base_unit_rqmt_st_qty_META,
			old_base_unit_fxd_rqmt_st_qty_META,
			old_cont_inpt_st_qty_META,
			old_cont_rqmt_st_qty_META,
			old_cont_fxd_rqmt_st_qty_META,
			recalc_grp_META,
			recalc_grp_seq_META,
			base_unit_dec_place_META,
			cont_unit_dec_place_META,
			base_unit_inpt_st_qty_META,
			base_unit_rqmt_st_qty_META,
			base_unit_fxd_rqmt_st_qty_META,
			cont_inpt_st_qty_META,
			cont_rqmt_st_qty_META,
			cont_fxd_rqmt_st_qty_META
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
	protected MfgReCalc_Sprt03_DtlInptR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt03_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlInptR clone() {
		return (MfgReCalc_Sprt03_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlInptR createInstance() {
		return (MfgReCalc_Sprt03_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlInptR getValues(String... names) {
		return (MfgReCalc_Sprt03_DtlInptR) super.getValues(names);
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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 4, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 4, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 5, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 5, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 5, $div_seq, value);
	}


	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public MCNumber old_base_unit_inpt_st_qty() {
		return getConstNumber(offset + 6, $old_base_unit_inpt_st_qty);
	}

	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public void old_base_unit_inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 6, $old_base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public void old_base_unit_inpt_st_qty(int value) {
		setConstNumber(offset + 6, $old_base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public void old_base_unit_inpt_st_qty(long value) {
		setConstNumber(offset + 6, $old_base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public void old_base_unit_inpt_st_qty(float value) {
		setConstNumber(offset + 6, $old_base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. before update 更新前基準単位着手投入数量.<p>
	 *
	 */
	public void old_base_unit_inpt_st_qty(double value) {
		setConstNumber(offset + 6, $old_base_unit_inpt_st_qty, value);
	}


	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public MCNumber old_base_unit_rqmt_st_qty() {
		return getConstNumber(offset + 7, $old_base_unit_rqmt_st_qty);
	}

	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public void old_base_unit_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 7, $old_base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public void old_base_unit_rqmt_st_qty(int value) {
		setConstNumber(offset + 7, $old_base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public void old_base_unit_rqmt_st_qty(long value) {
		setConstNumber(offset + 7, $old_base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public void old_base_unit_rqmt_st_qty(float value) {
		setConstNumber(offset + 7, $old_base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. before update 更新前基準単位着手必要数量.<p>
	 *
	 */
	public void old_base_unit_rqmt_st_qty(double value) {
		setConstNumber(offset + 7, $old_base_unit_rqmt_st_qty, value);
	}


	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public MCNumber old_base_unit_fxd_rqmt_st_qty() {
		return getConstNumber(offset + 8, $old_base_unit_fxd_rqmt_st_qty);
	}

	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public void old_base_unit_fxd_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 8, $old_base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public void old_base_unit_fxd_rqmt_st_qty(int value) {
		setConstNumber(offset + 8, $old_base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public void old_base_unit_fxd_rqmt_st_qty(long value) {
		setConstNumber(offset + 8, $old_base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public void old_base_unit_fxd_rqmt_st_qty(float value) {
		setConstNumber(offset + 8, $old_base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start before update 更新前基準単位着手固定必要数量.<p>
	 *
	 */
	public void old_base_unit_fxd_rqmt_st_qty(double value) {
		setConstNumber(offset + 8, $old_base_unit_fxd_rqmt_st_qty, value);
	}


	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public MCNumber old_cont_inpt_st_qty() {
		return getConstNumber(offset + 9, $old_cont_inpt_st_qty);
	}

	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public void old_cont_inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 9, $old_cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public void old_cont_inpt_st_qty(int value) {
		setConstNumber(offset + 9, $old_cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public void old_cont_inpt_st_qty(long value) {
		setConstNumber(offset + 9, $old_cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public void old_cont_inpt_st_qty(float value) {
		setConstNumber(offset + 9, $old_cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient input start qty. before update 更新前有効成分着手投入数量.<p>
	 *
	 */
	public void old_cont_inpt_st_qty(double value) {
		setConstNumber(offset + 9, $old_cont_inpt_st_qty, value);
	}


	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public MCNumber old_cont_rqmt_st_qty() {
		return getConstNumber(offset + 10, $old_cont_rqmt_st_qty);
	}

	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public void old_cont_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 10, $old_cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public void old_cont_rqmt_st_qty(int value) {
		setConstNumber(offset + 10, $old_cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public void old_cont_rqmt_st_qty(long value) {
		setConstNumber(offset + 10, $old_cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public void old_cont_rqmt_st_qty(float value) {
		setConstNumber(offset + 10, $old_cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient required start qty. before update 更新前有効成分着手必要数量.<p>
	 *
	 */
	public void old_cont_rqmt_st_qty(double value) {
		setConstNumber(offset + 10, $old_cont_rqmt_st_qty, value);
	}


	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public MCNumber old_cont_fxd_rqmt_st_qty() {
		return getConstNumber(offset + 11, $old_cont_fxd_rqmt_st_qty);
	}

	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public void old_cont_fxd_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 11, $old_cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public void old_cont_fxd_rqmt_st_qty(int value) {
		setConstNumber(offset + 11, $old_cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public void old_cont_fxd_rqmt_st_qty(long value) {
		setConstNumber(offset + 11, $old_cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public void old_cont_fxd_rqmt_st_qty(float value) {
		setConstNumber(offset + 11, $old_cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start before update 更新前有効成分着手固定必要数量.<p>
	 *
	 */
	public void old_cont_fxd_rqmt_st_qty(double value) {
		setConstNumber(offset + 11, $old_cont_fxd_rqmt_st_qty, value);
	}


	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public MCNumber recalc_grp() {
		return getConstNumber(offset + 12, $recalc_grp);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(MCNumber value) {
		setConstNumber(offset + 12, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(int value) {
		setConstNumber(offset + 12, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(long value) {
		setConstNumber(offset + 12, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(float value) {
		setConstNumber(offset + 12, $recalc_grp, value);
	}

	/**
	 * Re-calculation group 再計算グループ.<p>
	 *
	 */
	public void recalc_grp(double value) {
		setConstNumber(offset + 12, $recalc_grp, value);
	}


	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public MCNumber recalc_grp_seq() {
		return getConstNumber(offset + 13, $recalc_grp_seq);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(MCNumber value) {
		setConstNumber(offset + 13, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(int value) {
		setConstNumber(offset + 13, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(long value) {
		setConstNumber(offset + 13, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(float value) {
		setConstNumber(offset + 13, $recalc_grp_seq, value);
	}

	/**
	 * Re-calculation group sequence number 再計算グループ連番.<p>
	 *
	 */
	public void recalc_grp_seq(double value) {
		setConstNumber(offset + 13, $recalc_grp_seq, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 14, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 14, $base_unit_dec_place, value);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_unit_dec_place() {
		return getConstNumber(offset + 15, $cont_unit_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 15, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(int value) {
		setConstNumber(offset + 15, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(long value) {
		setConstNumber(offset + 15, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(float value) {
		setConstNumber(offset + 15, $cont_unit_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_unit_dec_place(double value) {
		setConstNumber(offset + 15, $cont_unit_dec_place, value);
	}


	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_st_qty() {
		return getConstNumber(offset + 16, $base_unit_inpt_st_qty);
	}

	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 16, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(int value) {
		setConstNumber(offset + 16, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(long value) {
		setConstNumber(offset + 16, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(float value) {
		setConstNumber(offset + 16, $base_unit_inpt_st_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位着手投入数量.<p>
	 *
	 */
	public void base_unit_inpt_st_qty(double value) {
		setConstNumber(offset + 16, $base_unit_inpt_st_qty, value);
	}


	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_st_qty() {
		return getConstNumber(offset + 17, $base_unit_rqmt_st_qty);
	}

	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_st_qty(int value) {
		setConstNumber(offset + 17, $base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_st_qty(long value) {
		setConstNumber(offset + 17, $base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_st_qty(float value) {
		setConstNumber(offset + 17, $base_unit_rqmt_st_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位着手必要数量.<p>
	 *
	 */
	public void base_unit_rqmt_st_qty(double value) {
		setConstNumber(offset + 17, $base_unit_rqmt_st_qty, value);
	}


	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_st_qty() {
		return getConstNumber(offset + 18, $base_unit_fxd_rqmt_st_qty);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_st_qty(int value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_st_qty(long value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_st_qty(float value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_st_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位着手固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_st_qty(double value) {
		setConstNumber(offset + 18, $base_unit_fxd_rqmt_st_qty, value);
	}


	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public MCNumber cont_inpt_st_qty() {
		return getConstNumber(offset + 19, $cont_inpt_st_qty);
	}

	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(MCNumber value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(int value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(long value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(float value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}

	/**
	 * Active ingredient start input qty. 有効成分着手投入数量.<p>
	 *
	 */
	public void cont_inpt_st_qty(double value) {
		setConstNumber(offset + 19, $cont_inpt_st_qty, value);
	}


	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public MCNumber cont_rqmt_st_qty() {
		return getConstNumber(offset + 20, $cont_rqmt_st_qty);
	}

	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public void cont_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 20, $cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public void cont_rqmt_st_qty(int value) {
		setConstNumber(offset + 20, $cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public void cont_rqmt_st_qty(long value) {
		setConstNumber(offset + 20, $cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public void cont_rqmt_st_qty(float value) {
		setConstNumber(offset + 20, $cont_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient start required qty. 有効成分着手必要数量.<p>
	 *
	 */
	public void cont_rqmt_st_qty(double value) {
		setConstNumber(offset + 20, $cont_rqmt_st_qty, value);
	}


	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_st_qty() {
		return getConstNumber(offset + 21, $cont_fxd_rqmt_st_qty);
	}

	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_st_qty(MCNumber value) {
		setConstNumber(offset + 21, $cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_st_qty(int value) {
		setConstNumber(offset + 21, $cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_st_qty(long value) {
		setConstNumber(offset + 21, $cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_st_qty(float value) {
		setConstNumber(offset + 21, $cont_fxd_rqmt_st_qty, value);
	}

	/**
	 * Active ingredient fixed required qty. to start 有効成分着手固定必要数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_st_qty(double value) {
		setConstNumber(offset + 21, $cont_fxd_rqmt_st_qty, value);
	}


	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_inpt_st_qty();
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_rqmt_st_qty();
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_fxd_rqmt_st_qty();
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			return old_cont_inpt_st_qty();
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_cont_rqmt_st_qty();
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_cont_fxd_rqmt_st_qty();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			return cont_unit_dec_place();
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_st_qty();
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_st_qty();
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_st_qty();
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			return cont_inpt_st_qty();
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_st_qty();
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_st_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_inpt_st_qty();
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_rqmt_st_qty();
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_fxd_rqmt_st_qty();
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			return old_cont_inpt_st_qty();
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_cont_rqmt_st_qty();
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return old_cont_fxd_rqmt_st_qty();
		}
		if ($recalc_grp.equalsIgnoreCase(name)) {
			return recalc_grp();
		}
		if ($recalc_grp_seq.equalsIgnoreCase(name)) {
			return recalc_grp_seq();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			return cont_unit_dec_place();
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_st_qty();
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_st_qty();
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_st_qty();
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			return cont_inpt_st_qty();
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_st_qty();
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_st_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($old_base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_inpt_st_qty(value);
			return;
		}
		if ($old_base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_rqmt_st_qty(value);
			return;
		}
		if ($old_base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_inpt_st_qty.equalsIgnoreCase(name)) {
			old_cont_inpt_st_qty(value);
			return;
		}
		if ($old_cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_rqmt_st_qty(value);
			return;
		}
		if ($old_cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			old_cont_fxd_rqmt_st_qty(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_unit_dec_place.equalsIgnoreCase(name)) {
			cont_unit_dec_place(value);
			return;
		}
		if ($base_unit_inpt_st_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_st_qty(value);
			return;
		}
		if ($base_unit_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_st_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_st_qty(value);
			return;
		}
		if ($cont_inpt_st_qty.equalsIgnoreCase(name)) {
			cont_inpt_st_qty(value);
			return;
		}
		if ($cont_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_rqmt_st_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_st_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

