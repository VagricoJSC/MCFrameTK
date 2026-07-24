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
 * ブロック"MfgInstActCom_Upd08_DtlInpt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_DtlInptR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	public static final String $lst_reg_flg = "lst_reg_flg";
	public static final String $is_src_batch_flg = "is_src_batch_flg";
	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_rem_qty = "base_unit_inpt_rem_qty";
	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_rem_qty = "base_unit_rqmt_rem_qty";
	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_rem_qty = "base_unit_fxd_rqmt_rem_qty";
	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public static final String $cont_inpt_rem_qty = "cont_inpt_rem_qty";
	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public static final String $cont_rqmt_rem_qty = "cont_rqmt_rem_qty";
	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_rem_qty = "cont_fxd_rqmt_rem_qty";
	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_abort_qty = "base_unit_inpt_abort_qty";
	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public static final String $alt_inpt_qty = "alt_inpt_qty";
	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public static final String $alt_rqmt_qty = "alt_rqmt_qty";
	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public static final String $alt_fxd_rqmt_qty = "alt_fxd_rqmt_qty";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public static final String $alt_itm_fix_flg = "alt_itm_fix_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_inpt_rem_qty_META = createCommonMeta($base_unit_inpt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_rem_qty_META = createCommonMeta($base_unit_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_rem_qty_META = createCommonMeta($base_unit_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_rem_qty_META = createCommonMeta($cont_inpt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_rqmt_rem_qty_META = createCommonMeta($cont_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fxd_rqmt_rem_qty_META = createCommonMeta($cont_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inpt_abort_qty_META = createCommonMeta($base_unit_inpt_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_inpt_qty_META = createCommonMeta($alt_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_rqmt_qty_META = createCommonMeta($alt_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_fxd_rqmt_qty_META = createCommonMeta($alt_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstActCom_Upd08_DtlInptR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_DtlInptR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			inpt_act_no_META,
			inpt_schd_no_META,
			div_seq_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			abort_flg_META,
			lst_reg_flg_META,
			is_src_batch_flg_META,
			base_unit_inpt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			cont_inpt_qty_META,
			cont_fxd_rqmt_qty_META,
			act_cont_fctr_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			base_unit_inpt_rem_qty_META,
			base_unit_rqmt_rem_qty_META,
			base_unit_fxd_rqmt_rem_qty_META,
			cont_inpt_rem_qty_META,
			cont_rqmt_rem_qty_META,
			cont_fxd_rqmt_rem_qty_META,
			base_unit_inpt_abort_qty_META,
			alt_inpt_qty_META,
			alt_rqmt_qty_META,
			alt_fxd_rqmt_qty_META,
			mfg_sts_typ_META,
			alt_itm_fix_flg_META
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
	protected MfgInstActCom_Upd08_DtlInptR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_DtlInptR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptR clone() {
		return (MfgInstActCom_Upd08_DtlInptR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptR createInstance() {
		return (MfgInstActCom_Upd08_DtlInptR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptR getValues(String... names) {
		return (MfgInstActCom_Upd08_DtlInptR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 1, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 1, $inpt_act_no, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 2, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 2, $inpt_schd_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 3, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 3, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 3, $div_seq, value);
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 5, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 5, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 6, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 6, $oper_inst_no, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 7, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 7, $abort_flg, value);
	}


	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 8, $lst_reg_flg);
	}

	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 8, $lst_reg_flg, value);
	}


	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 9, $is_src_batch_flg);
	}

	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 9, $is_src_batch_flg, value);
	}


	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 10, $base_unit_inpt_qty);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 10, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 10, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 10, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input qty. 基準単位投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 10, $base_unit_inpt_qty, value);
	}


	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 11, $base_unit_fxd_rqmt_qty);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 11, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 11, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 11, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. 基準単位固定必要数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 11, $base_unit_fxd_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 12, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 13, $cont_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 14, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 14, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 14, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 14, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 14, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 14, $act_cont_fctr, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 15, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 15, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 16, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}


	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_rem_qty() {
		return getConstNumber(offset + 17, $base_unit_inpt_rem_qty);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(int value) {
		setConstNumber(offset + 17, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(long value) {
		setConstNumber(offset + 17, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(float value) {
		setConstNumber(offset + 17, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(double value) {
		setConstNumber(offset + 17, $base_unit_inpt_rem_qty, value);
	}


	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_rem_qty() {
		return getConstNumber(offset + 18, $base_unit_rqmt_rem_qty);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 18, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(int value) {
		setConstNumber(offset + 18, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(long value) {
		setConstNumber(offset + 18, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(float value) {
		setConstNumber(offset + 18, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(double value) {
		setConstNumber(offset + 18, $base_unit_rqmt_rem_qty, value);
	}


	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 19, $base_unit_fxd_rqmt_rem_qty);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 19, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 19, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 19, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 19, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 19, $base_unit_fxd_rqmt_rem_qty, value);
	}


	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public MCNumber cont_inpt_rem_qty() {
		return getConstNumber(offset + 20, $cont_inpt_rem_qty);
	}

	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public void cont_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 20, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public void cont_inpt_rem_qty(int value) {
		setConstNumber(offset + 20, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public void cont_inpt_rem_qty(long value) {
		setConstNumber(offset + 20, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public void cont_inpt_rem_qty(float value) {
		setConstNumber(offset + 20, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining input qty. 有効成分投入残数量.<p>
	 *
	 */
	public void cont_inpt_rem_qty(double value) {
		setConstNumber(offset + 20, $cont_inpt_rem_qty, value);
	}


	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public MCNumber cont_rqmt_rem_qty() {
		return getConstNumber(offset + 21, $cont_rqmt_rem_qty);
	}

	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 21, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(int value) {
		setConstNumber(offset + 21, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(long value) {
		setConstNumber(offset + 21, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(float value) {
		setConstNumber(offset + 21, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient required remaining qty. 有効成分必要残数量.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(double value) {
		setConstNumber(offset + 21, $cont_rqmt_rem_qty, value);
	}


	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 22, $cont_fxd_rqmt_rem_qty);
	}

	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 22, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 22, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 22, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 22, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient remaining qty. of fixed required qty. 有効成分固定必要残数量.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 22, $cont_fxd_rqmt_rem_qty, value);
	}


	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_abort_qty() {
		return getConstNumber(offset + 23, $base_unit_inpt_abort_qty);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(MCNumber value) {
		setConstNumber(offset + 23, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(int value) {
		setConstNumber(offset + 23, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(long value) {
		setConstNumber(offset + 23, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(float value) {
		setConstNumber(offset + 23, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(double value) {
		setConstNumber(offset + 23, $base_unit_inpt_abort_qty, value);
	}


	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public MCNumber alt_inpt_qty() {
		return getConstNumber(offset + 24, $alt_inpt_qty);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(MCNumber value) {
		setConstNumber(offset + 24, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(int value) {
		setConstNumber(offset + 24, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(long value) {
		setConstNumber(offset + 24, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(float value) {
		setConstNumber(offset + 24, $alt_inpt_qty, value);
	}

	/**
	 * Input qty. including alternative 代替を考慮した投入数量.<p>
	 *
	 */
	public void alt_inpt_qty(double value) {
		setConstNumber(offset + 24, $alt_inpt_qty, value);
	}


	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public MCNumber alt_rqmt_qty() {
		return getConstNumber(offset + 25, $alt_rqmt_qty);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 25, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(int value) {
		setConstNumber(offset + 25, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(long value) {
		setConstNumber(offset + 25, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(float value) {
		setConstNumber(offset + 25, $alt_rqmt_qty, value);
	}

	/**
	 * Required qty. including alternative 代替を考慮した必要数量.<p>
	 *
	 */
	public void alt_rqmt_qty(double value) {
		setConstNumber(offset + 25, $alt_rqmt_qty, value);
	}


	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public MCNumber alt_fxd_rqmt_qty() {
		return getConstNumber(offset + 26, $alt_fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 26, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 26, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 26, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 26, $alt_fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. considering alternatives 代替を考慮した固定必要数量.<p>
	 *
	 */
	public void alt_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 26, $alt_fxd_rqmt_qty, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 27, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 27, $mfg_sts_typ, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 28, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 28, $alt_itm_fix_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rem_qty();
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_rem_qty();
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_rem_qty();
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			return cont_inpt_rem_qty();
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_rem_qty();
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_rem_qty();
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_abort_qty();
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			return alt_inpt_qty();
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_rqmt_qty();
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_fxd_rqmt_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rem_qty();
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_rem_qty();
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_rem_qty();
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			return cont_inpt_rem_qty();
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_rem_qty();
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_rem_qty();
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_abort_qty();
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			return alt_inpt_qty();
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_rqmt_qty();
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return alt_fxd_rqmt_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($alt_inpt_qty.equalsIgnoreCase(name)) {
			alt_inpt_qty(value);
			return;
		}
		if ($alt_rqmt_qty.equalsIgnoreCase(name)) {
			alt_rqmt_qty(value);
			return;
		}
		if ($alt_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			alt_fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

