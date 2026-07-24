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
 * ブロック"MfgInstActCom_Upd08_DtlOperInst"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_DtlOperInstR_MC_A extends MCConstRow {

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
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
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public static final String $sum_qty = "sum_qty";
	/**
	 * Total remaining qty. 残数量合計.<p>
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
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";


	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_qty_META = createCommonMeta($sum_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sum_rem_qty_META = createCommonMeta($sum_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_sts_typ_META = createCommonMeta($max_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta min_sts_typ_META = createCommonMeta($min_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);

	protected static final ConstMetaList<MfgInstActCom_Upd08_DtlOperInstR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_DtlOperInstR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_inst_no_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			base_unit_qty_META,
			sum_qty_META,
			sum_rem_qty_META,
			max_sts_typ_META,
			min_sts_typ_META,
			div_seq_META,
			mfg_sts_typ_META
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
	protected MfgInstActCom_Upd08_DtlOperInstR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_DtlOperInstR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlOperInstR clone() {
		return (MfgInstActCom_Upd08_DtlOperInstR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlOperInstR createInstance() {
		return (MfgInstActCom_Upd08_DtlOperInstR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_DtlOperInstR getValues(String... names) {
		return (MfgInstActCom_Upd08_DtlOperInstR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 0, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 0, $oper_inst_no, value);
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
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 3, $base_unit_qty);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 3, $base_unit_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 3, $base_unit_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 3, $base_unit_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 3, $base_unit_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 3, $base_unit_qty, value);
	}


	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public MCNumber sum_qty() {
		return getConstNumber(offset + 4, $sum_qty);
	}

	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public void sum_qty(MCNumber value) {
		setConstNumber(offset + 4, $sum_qty, value);
	}

	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public void sum_qty(int value) {
		setConstNumber(offset + 4, $sum_qty, value);
	}

	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public void sum_qty(long value) {
		setConstNumber(offset + 4, $sum_qty, value);
	}

	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public void sum_qty(float value) {
		setConstNumber(offset + 4, $sum_qty, value);
	}

	/**
	 * Start qty. total 着手数量合計.<p>
	 *
	 */
	public void sum_qty(double value) {
		setConstNumber(offset + 4, $sum_qty, value);
	}


	/**
	 * Total remaining qty. 残数量合計.<p>
	 *
	 */
	public MCNumber sum_rem_qty() {
		return getConstNumber(offset + 5, $sum_rem_qty);
	}

	/**
	 * Total remaining qty. 残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(MCNumber value) {
		setConstNumber(offset + 5, $sum_rem_qty, value);
	}

	/**
	 * Total remaining qty. 残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(int value) {
		setConstNumber(offset + 5, $sum_rem_qty, value);
	}

	/**
	 * Total remaining qty. 残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(long value) {
		setConstNumber(offset + 5, $sum_rem_qty, value);
	}

	/**
	 * Total remaining qty. 残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(float value) {
		setConstNumber(offset + 5, $sum_rem_qty, value);
	}

	/**
	 * Total remaining qty. 残数量合計.<p>
	 *
	 */
	public void sum_rem_qty(double value) {
		setConstNumber(offset + 5, $sum_rem_qty, value);
	}


	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public String max_sts_typ() {
		return getConstString(offset + 6, $max_sts_typ);
	}

	/**
	 * Maximum mfg. status type 最大製造状況区分.<p>
	 *
	 */
	public void max_sts_typ(String value) {
		setConstString(offset + 6, $max_sts_typ, value);
	}


	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public String min_sts_typ() {
		return getConstString(offset + 7, $min_sts_typ);
	}

	/**
	 * Minimum mfg. status type 最小製造状況区分.<p>
	 *
	 */
	public void min_sts_typ(String value) {
		setConstString(offset + 7, $min_sts_typ, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 8, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 8, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 8, $div_seq, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 9, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 9, $mfg_sts_typ, value);
	}


	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			return sum_qty();
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			return sum_rem_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			return sum_qty();
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			return sum_rem_qty();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($sum_qty.equalsIgnoreCase(name)) {
			sum_qty(value);
			return;
		}
		if ($sum_rem_qty.equalsIgnoreCase(name)) {
			sum_rem_qty(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

