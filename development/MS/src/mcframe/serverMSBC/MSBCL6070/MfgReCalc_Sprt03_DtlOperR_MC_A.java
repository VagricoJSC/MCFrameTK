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
 * ブロック"MfgReCalc_Sprt03_DtlOper"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgReCalc_Sprt03_DtlOperR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public static final String $old_base_unit_st_qty = "old_base_unit_st_qty";
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public static final String $oper_unit_conv_rnd_typ = "oper_unit_conv_rnd_typ";
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public static final String $base_unit_st_qty = "base_unit_st_qty";
	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public static final String $oper_unit_st_qty = "oper_unit_st_qty";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta old_base_unit_st_qty_META = createCommonMeta($old_base_unit_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_conv_rnd_typ_META = createCommonMeta($oper_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_st_qty_META = createCommonMeta($base_unit_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_unit_st_qty_META = createCommonMeta($oper_unit_st_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<MfgReCalc_Sprt03_DtlOperR> constMetas = new ConstMetaList<MfgReCalc_Sprt03_DtlOperR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			peg_no_META,
			oper_inst_no_META,
			div_seq_META,
			old_base_unit_st_qty_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			oper_unit_conv_rnd_typ_META,
			oper_unit_dec_place_META,
			base_unit_st_qty_META,
			oper_unit_st_qty_META
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
	protected MfgReCalc_Sprt03_DtlOperR_MC_A(ConstMetaList<? extends MfgReCalc_Sprt03_DtlOperR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlOperR clone() {
		return (MfgReCalc_Sprt03_DtlOperR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlOperR createInstance() {
		return (MfgReCalc_Sprt03_DtlOperR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgReCalc_Sprt03_DtlOperR getValues(String... names) {
		return (MfgReCalc_Sprt03_DtlOperR) super.getValues(names);
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
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 2, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 2, $oper_inst_no, value);
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
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public MCNumber old_base_unit_st_qty() {
		return getConstNumber(offset + 4, $old_base_unit_st_qty);
	}

	/**
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public void old_base_unit_st_qty(MCNumber value) {
		setConstNumber(offset + 4, $old_base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public void old_base_unit_st_qty(int value) {
		setConstNumber(offset + 4, $old_base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public void old_base_unit_st_qty(long value) {
		setConstNumber(offset + 4, $old_base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public void old_base_unit_st_qty(float value) {
		setConstNumber(offset + 4, $old_base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. before update 更新前基準単位着手数量.<p>
	 *
	 */
	public void old_base_unit_st_qty(double value) {
		setConstNumber(offset + 4, $old_base_unit_st_qty, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 5, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 5, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 5, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 5, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 5, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 5, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 6, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 6, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 6, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 6, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 6, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 6, $oper_conv_qty, value);
	}


	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public String oper_unit_conv_rnd_typ() {
		return getConstString(offset + 7, $oper_unit_conv_rnd_typ);
	}

	/**
	 * Operation conversion rounding type 工程換算端数処理区分.<p>
	 *
	 */
	public void oper_unit_conv_rnd_typ(String value) {
		setConstString(offset + 7, $oper_unit_conv_rnd_typ, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 8, $oper_unit_dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 8, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 8, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 8, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 8, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 8, $oper_unit_dec_place, value);
	}


	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_qty() {
		return getConstNumber(offset + 9, $base_unit_st_qty);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(int value) {
		setConstNumber(offset + 9, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(long value) {
		setConstNumber(offset + 9, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(float value) {
		setConstNumber(offset + 9, $base_unit_st_qty, value);
	}

	/**
	 * Base unit start qty. 基準単位着手数量.<p>
	 *
	 */
	public void base_unit_st_qty(double value) {
		setConstNumber(offset + 9, $base_unit_st_qty, value);
	}


	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public MCNumber oper_unit_st_qty() {
		return getConstNumber(offset + 10, $oper_unit_st_qty);
	}

	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public void oper_unit_st_qty(MCNumber value) {
		setConstNumber(offset + 10, $oper_unit_st_qty, value);
	}

	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public void oper_unit_st_qty(int value) {
		setConstNumber(offset + 10, $oper_unit_st_qty, value);
	}

	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public void oper_unit_st_qty(long value) {
		setConstNumber(offset + 10, $oper_unit_st_qty, value);
	}

	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public void oper_unit_st_qty(float value) {
		setConstNumber(offset + 10, $oper_unit_st_qty, value);
	}

	/**
	 * Operation unit start qty. 工程単位着手数量.<p>
	 *
	 */
	public void oper_unit_st_qty(double value) {
		setConstNumber(offset + 10, $oper_unit_st_qty, value);
	}


	public String getString(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_st_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			return base_unit_st_qty();
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			return oper_unit_st_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return oper_unit_conv_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			return old_base_unit_st_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			return base_unit_st_qty();
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			return oper_unit_st_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			oper_unit_conv_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
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
		if ($old_base_unit_st_qty.equalsIgnoreCase(name)) {
			old_base_unit_st_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($base_unit_st_qty.equalsIgnoreCase(name)) {
			base_unit_st_qty(value);
			return;
		}
		if ($oper_unit_st_qty.equalsIgnoreCase(name)) {
			oper_unit_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

