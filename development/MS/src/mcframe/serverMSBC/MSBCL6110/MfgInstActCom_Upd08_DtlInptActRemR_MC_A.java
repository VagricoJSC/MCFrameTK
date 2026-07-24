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
 * ブロック"MfgInstActCom_Upd08_DtlInptActRem"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_DtlInptActRemR_MC_A extends MCConstRow {

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
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
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
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
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
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public static final String $base_unit_inpt_abort_qty = "base_unit_inpt_abort_qty";
	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public static final String $cont_inpt_rem_qty = "cont_inpt_rem_qty";
	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public static final String $cont_rqmt_rem_qty = "cont_rqmt_rem_qty";
	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_rem_qty = "cont_fxd_rqmt_rem_qty";


	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta base_unit_inpt_rem_qty_META = createCommonMeta($base_unit_inpt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_rem_qty_META = createCommonMeta($base_unit_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_rem_qty_META = createCommonMeta($base_unit_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inpt_abort_qty_META = createCommonMeta($base_unit_inpt_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_rem_qty_META = createCommonMeta($cont_inpt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_rem_qty_META = createCommonMeta($cont_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_rem_qty_META = createCommonMeta($cont_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);

	protected static final ConstMetaList<MfgInstActCom_Upd08_DtlInptActRemR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_DtlInptActRemR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_schd_no_META,
			div_seq_META,
			mfg_sts_typ_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			cont_inpt_qty_META,
			cont_rqmt_qty_META,
			cont_fxd_rqmt_qty_META,
			base_unit_inpt_rem_qty_META,
			base_unit_rqmt_rem_qty_META,
			base_unit_fxd_rqmt_rem_qty_META,
			base_unit_inpt_abort_qty_META,
			cont_inpt_rem_qty_META,
			cont_rqmt_rem_qty_META,
			cont_fxd_rqmt_rem_qty_META
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
	protected MfgInstActCom_Upd08_DtlInptActRemR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_DtlInptActRemR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptActRemR clone() {
		return (MfgInstActCom_Upd08_DtlInptActRemR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptActRemR createInstance() {
		return (MfgInstActCom_Upd08_DtlInptActRemR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlInptActRemR getValues(String... names) {
		return (MfgInstActCom_Upd08_DtlInptActRemR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 0, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 0, $inpt_schd_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 1, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 1, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 1, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 1, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 1, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 1, $div_seq, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 2, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 2, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 3, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 3, $mfg_inst_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 4, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 4, $itm_mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 5, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 5, $oper_inst_no, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 6, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 6, $alt_grp_cd, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 7, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 7, $alt_grp_seq, value);
	}


	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 8, $base_unit_inpt_qty);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 8, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 8, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 8, $base_unit_inpt_qty, value);
	}

	/**
	 * Base unit input start qty. 基準単位投入着手数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 8, $base_unit_inpt_qty, value);
	}


	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 9, $base_unit_rqmt_qty);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 9, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 9, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 9, $base_unit_rqmt_qty, value);
	}

	/**
	 * Base unit required start qty. 基準単位必要着手数量.<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 9, $base_unit_rqmt_qty, value);
	}


	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 10, $base_unit_fxd_rqmt_qty);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_qty, value);
	}

	/**
	 * Base unit fixed required qty. to start 基準単位固定必要着手数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 11, $cont_inpt_qty);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 11, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 11, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 11, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 11, $cont_inpt_qty, value);
	}

	/**
	 * Active ingredient (Input start qty.) 有効成分（投入着手数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 11, $cont_inpt_qty, value);
	}


	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 12, $cont_rqmt_qty);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 12, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 12, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 12, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 12, $cont_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Required start qty.) 有効成分（必要着手数量）.<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 12, $cont_rqmt_qty, value);
	}


	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 13, $cont_fxd_rqmt_qty);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}

	/**
	 * Active ingredient (Fixed required qty.) 有効成分（固定必要着手数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 13, $cont_fxd_rqmt_qty, value);
	}


	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_rem_qty() {
		return getConstNumber(offset + 14, $base_unit_inpt_rem_qty);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 14, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(int value) {
		setConstNumber(offset + 14, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(long value) {
		setConstNumber(offset + 14, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(float value) {
		setConstNumber(offset + 14, $base_unit_inpt_rem_qty, value);
	}

	/**
	 * Base unit remaining input qty. 基準単位投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(double value) {
		setConstNumber(offset + 14, $base_unit_inpt_rem_qty, value);
	}


	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public MCNumber base_unit_rqmt_rem_qty() {
		return getConstNumber(offset + 15, $base_unit_rqmt_rem_qty);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 15, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(int value) {
		setConstNumber(offset + 15, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(long value) {
		setConstNumber(offset + 15, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(float value) {
		setConstNumber(offset + 15, $base_unit_rqmt_rem_qty, value);
	}

	/**
	 * Base unit required remaining qty. 基準単位必要残数量.<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(double value) {
		setConstNumber(offset + 15, $base_unit_rqmt_rem_qty, value);
	}


	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 16, $base_unit_fxd_rqmt_rem_qty);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 16, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 16, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 16, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 16, $base_unit_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Remaining qty. of base unit fixed required qty. 基準単位固定必要残数量.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 16, $base_unit_fxd_rqmt_rem_qty, value);
	}


	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_abort_qty() {
		return getConstNumber(offset + 17, $base_unit_inpt_abort_qty);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(int value) {
		setConstNumber(offset + 17, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(long value) {
		setConstNumber(offset + 17, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(float value) {
		setConstNumber(offset + 17, $base_unit_inpt_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining input qty. 基準単位投入打切数量.<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(double value) {
		setConstNumber(offset + 17, $base_unit_inpt_abort_qty, value);
	}


	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_rem_qty() {
		return getConstNumber(offset + 18, $cont_inpt_rem_qty);
	}

	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public void cont_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 18, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public void cont_inpt_rem_qty(int value) {
		setConstNumber(offset + 18, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public void cont_inpt_rem_qty(long value) {
		setConstNumber(offset + 18, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public void cont_inpt_rem_qty(float value) {
		setConstNumber(offset + 18, $cont_inpt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining input qty.) 有効成分（投入残数量）.<p>
	 *
	 */
	public void cont_inpt_rem_qty(double value) {
		setConstNumber(offset + 18, $cont_inpt_rem_qty, value);
	}


	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public MCNumber cont_rqmt_rem_qty() {
		return getConstNumber(offset + 19, $cont_rqmt_rem_qty);
	}

	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 19, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(int value) {
		setConstNumber(offset + 19, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(long value) {
		setConstNumber(offset + 19, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(float value) {
		setConstNumber(offset + 19, $cont_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Required remaining qty.) 有効成分（必要残数量）.<p>
	 *
	 */
	public void cont_rqmt_rem_qty(double value) {
		setConstNumber(offset + 19, $cont_rqmt_rem_qty, value);
	}


	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 20, $cont_fxd_rqmt_rem_qty);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 20, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 20, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 20, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 20, $cont_fxd_rqmt_rem_qty, value);
	}

	/**
	 * Active ingredient (Remaining qty. of fixed required qty.) 有効成分（固定必要残数量）.<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 20, $cont_fxd_rqmt_rem_qty, value);
	}


	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_abort_qty();
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
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_abort_qty();
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
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
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
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
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
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
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
		super.setNumberNE(name, value);
	}



}

