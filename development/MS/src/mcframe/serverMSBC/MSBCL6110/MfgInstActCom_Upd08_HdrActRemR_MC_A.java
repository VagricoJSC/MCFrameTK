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
 * ブロック"MfgInstActCom_Upd08_HdrActRem"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd08_HdrActRemR_MC_A extends MCConstRow {

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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public static final String $base_unit_mfg_qty = "base_unit_mfg_qty";
	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public static final String $base_unit_mfg_rem_qty = "base_unit_mfg_rem_qty";
	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public static final String $base_unit_mfg_abort_qty = "base_unit_mfg_abort_qty";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";


	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta base_unit_mfg_qty_META = createCommonMeta($base_unit_mfg_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_mfg_rem_qty_META = createCommonMeta($base_unit_mfg_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_mfg_abort_qty_META = createCommonMeta($base_unit_mfg_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);

	protected static final ConstMetaList<MfgInstActCom_Upd08_HdrActRemR> constMetas = new ConstMetaList<MfgInstActCom_Upd08_HdrActRemR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_inst_no_META,
			div_seq_META,
			itm_mfg_inst_no_META,
			base_unit_mfg_qty_META,
			base_unit_mfg_rem_qty_META,
			base_unit_mfg_abort_qty_META,
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
	protected MfgInstActCom_Upd08_HdrActRemR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd08_HdrActRemR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_HdrActRemR clone() {
		return (MfgInstActCom_Upd08_HdrActRemR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_HdrActRemR createInstance() {
		return (MfgInstActCom_Upd08_HdrActRemR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd08_HdrActRemR getValues(String... names) {
		return (MfgInstActCom_Upd08_HdrActRemR) super.getValues(names);
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
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_qty() {
		return getConstNumber(offset + 3, $base_unit_mfg_qty);
	}

	/**
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public void base_unit_mfg_qty(MCNumber value) {
		setConstNumber(offset + 3, $base_unit_mfg_qty, value);
	}

	/**
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public void base_unit_mfg_qty(int value) {
		setConstNumber(offset + 3, $base_unit_mfg_qty, value);
	}

	/**
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public void base_unit_mfg_qty(long value) {
		setConstNumber(offset + 3, $base_unit_mfg_qty, value);
	}

	/**
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public void base_unit_mfg_qty(float value) {
		setConstNumber(offset + 3, $base_unit_mfg_qty, value);
	}

	/**
	 * Base unit mfg. start qty. 基準単位製造着手数量.<p>
	 *
	 */
	public void base_unit_mfg_qty(double value) {
		setConstNumber(offset + 3, $base_unit_mfg_qty, value);
	}


	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_rem_qty() {
		return getConstNumber(offset + 4, $base_unit_mfg_rem_qty);
	}

	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(int value) {
		setConstNumber(offset + 4, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(long value) {
		setConstNumber(offset + 4, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(float value) {
		setConstNumber(offset + 4, $base_unit_mfg_rem_qty, value);
	}

	/**
	 * Base unit remaining mfg. qty. 基準単位製造残数量.<p>
	 *
	 */
	public void base_unit_mfg_rem_qty(double value) {
		setConstNumber(offset + 4, $base_unit_mfg_rem_qty, value);
	}


	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_abort_qty() {
		return getConstNumber(offset + 5, $base_unit_mfg_abort_qty);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(MCNumber value) {
		setConstNumber(offset + 5, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(int value) {
		setConstNumber(offset + 5, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(long value) {
		setConstNumber(offset + 5, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(float value) {
		setConstNumber(offset + 5, $base_unit_mfg_abort_qty, value);
	}

	/**
	 * Base unit cancelled remaining mfg. qty. 基準単位製造打切数量.<p>
	 *
	 */
	public void base_unit_mfg_abort_qty(double value) {
		setConstNumber(offset + 5, $base_unit_mfg_abort_qty, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 6, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 6, $mfg_sts_typ, value);
	}


	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_qty();
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_rem_qty();
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_abort_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
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
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_qty();
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_rem_qty();
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_mfg_abort_qty();
		}
		return super.getNumberNE(name);
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
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_mfg_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_qty(value);
			return;
		}
		if ($base_unit_mfg_rem_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_rem_qty(value);
			return;
		}
		if ($base_unit_mfg_abort_qty.equalsIgnoreCase(name)) {
			base_unit_mfg_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

