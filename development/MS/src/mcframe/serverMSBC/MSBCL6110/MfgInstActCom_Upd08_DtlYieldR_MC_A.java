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
 * ブロック"MfgInstActCom_Upd08_DtlYield"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_DtlYieldR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public static final String $yield_act_no = "yield_act_no";
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
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
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public static final String $trd_unit_yield_qty = "trd_unit_yield_qty";
	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
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
	 * Output type 出来高区分.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public static final String $trd_unit_yield_rem_qty = "trd_unit_yield_rem_qty";
	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public static final String $base_unit_yield_rem_qty = "base_unit_yield_rem_qty";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta yield_act_no_META = createCommonMeta($yield_act_no, mcframe.commonMA.meta.MA_META.YIELD_ACT_NO);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta trd_unit_yield_qty_META = createCommonMeta($trd_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta trd_unit_yield_rem_qty_META = createCommonMeta($trd_unit_yield_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_rem_qty_META = createCommonMeta($base_unit_yield_rem_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<MfgInstActCom_Upd08_DtlYieldR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_DtlYieldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			yield_act_no_META,
			yield_schd_no_META,
			div_seq_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			trd_unit_yield_qty_META,
			base_unit_yield_qty_META,
			trd_unit_cd_META,
			abort_flg_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			yield_typ_META,
			mfg_sts_typ_META,
			trd_unit_yield_rem_qty_META,
			base_unit_yield_rem_qty_META
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
	protected MfgInstActCom_Upd08_DtlYieldR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_DtlYieldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlYieldR clone() {
		return (MfgInstActCom_Upd08_DtlYieldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlYieldR createInstance() {
		return (MfgInstActCom_Upd08_DtlYieldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlYieldR getValues(String... names) {
		return (MfgInstActCom_Upd08_DtlYieldR) super.getValues(names);
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
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public String yield_act_no() {
		return getConstString(offset + 1, $yield_act_no);
	}

	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public void yield_act_no(String value) {
		setConstString(offset + 1, $yield_act_no, value);
	}


	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 2, $yield_schd_no);
	}

	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 2, $yield_schd_no, value);
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
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public MCNumber trd_unit_yield_qty() {
		return getConstNumber(offset + 7, $trd_unit_yield_qty);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(int value) {
		setConstNumber(offset + 7, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(long value) {
		setConstNumber(offset + 7, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(float value) {
		setConstNumber(offset + 7, $trd_unit_yield_qty, value);
	}

	/**
	 * Transaction unit output qty. 取引単位出来高数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(double value) {
		setConstNumber(offset + 7, $trd_unit_yield_qty, value);
	}


	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 8, $base_unit_yield_qty);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 8, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 8, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 8, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output qty. 基準単位出来高数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 8, $base_unit_yield_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 9, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 9, $trd_unit_cd, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 10, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 10, $abort_flg, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 11, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 11, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 11, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 11, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 11, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 11, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 12, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 12, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 12, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 12, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 12, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 12, $trd_unit_conv_qty, value);
	}


	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 13, $yield_typ);
	}

	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 13, $yield_typ, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 14, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 14, $mfg_sts_typ, value);
	}


	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public MCNumber trd_unit_yield_rem_qty() {
		return getConstNumber(offset + 15, $trd_unit_yield_rem_qty);
	}

	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(MCNumber value) {
		setConstNumber(offset + 15, $trd_unit_yield_rem_qty, value);
	}

	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(int value) {
		setConstNumber(offset + 15, $trd_unit_yield_rem_qty, value);
	}

	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(long value) {
		setConstNumber(offset + 15, $trd_unit_yield_rem_qty, value);
	}

	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(float value) {
		setConstNumber(offset + 15, $trd_unit_yield_rem_qty, value);
	}

	/**
	 * Transaction unit remaining output qty. 取引単位出来高残数量.<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(double value) {
		setConstNumber(offset + 15, $trd_unit_yield_rem_qty, value);
	}


	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_rem_qty() {
		return getConstNumber(offset + 16, $base_unit_yield_rem_qty);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(MCNumber value) {
		setConstNumber(offset + 16, $base_unit_yield_rem_qty, value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(int value) {
		setConstNumber(offset + 16, $base_unit_yield_rem_qty, value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(long value) {
		setConstNumber(offset + 16, $base_unit_yield_rem_qty, value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(float value) {
		setConstNumber(offset + 16, $base_unit_yield_rem_qty, value);
	}

	/**
	 * Base unit remaining output qty. 基準単位出来高残数量.<p>
	 *
	 */
	public void base_unit_yield_rem_qty(double value) {
		setConstNumber(offset + 16, $base_unit_yield_rem_qty, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_rem_qty();
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_rem_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			return yield_act_no();
		}
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_rem_qty();
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_rem_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($yield_act_no.equalsIgnoreCase(name)) {
			yield_act_no(value);
			return;
		}
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
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
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

