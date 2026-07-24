package mcframe.serverMSBC.MSBCL6060;

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
 * ブロック"MfgActTblReg_Upd02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActTblReg_Upd02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_conv_rnd_typ = "base_unit_conv_rnd_typ";
	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public static final String $not_cmpl_flg = "not_cmpl_flg";
	public static final String $oper_act = "oper_act";

	public static final String $oper_act_no = $oper_act + ".oper_act_no";
	public static final String $mfg_act_no = $oper_act + ".mfg_act_no";
	public static final String $itm_mfg_inst_no = $oper_act + ".itm_mfg_inst_no";
	public static final String $oper_inst_no = $oper_act + ".oper_inst_no";
	public static final String $div_seq = $oper_act + ".div_seq";
	public static final String $arr_act_no = $oper_act + ".arr_act_no";
	public static final String $purc_act_io_no = $oper_act + ".purc_act_io_no";
	public static final String $disp_seq = $oper_act + ".disp_seq";
	public static final String $st_act_tm = $oper_act + ".st_act_tm";
	public static final String $end_act_tm = $oper_act + ".end_act_tm";
	public static final String $base_unit_qty = $oper_act + ".base_unit_qty";
	public static final String $base_unit_cd = $oper_act + ".base_unit_cd";
	public static final String $oper_unit_qty = $oper_act + ".oper_unit_qty";
	public static final String $oper_unit_cd = $oper_act + ".oper_unit_cd";
	public static final String $bkf_ctl_flg = $oper_act + ".bkf_ctl_flg";
	public static final String $wk_cost_calc_ctl_flg = $oper_act + ".wk_cost_calc_ctl_flg";
	public static final String $oper_yield = $oper_act + ".oper_yield";
	public static final String $bkf_not_ref_flg = $oper_act + ".bkf_not_ref_flg";
	public static final String $data_no = $oper_act + ".data_no";
	public static final String $mes_id = $oper_act + ".mes_id";
	public static final String $intr_rmrks = $oper_act + ".intr_rmrks";
	public static final String $act_rpt_rmrks = $oper_act + ".act_rpt_rmrks";
	public static final String $oper_act_sub_char1 = $oper_act + ".sub_char1";
	public static final String $oper_act_sub_char2 = $oper_act + ".sub_char2";
	public static final String $oper_act_sub_char3 = $oper_act + ".sub_char3";
	public static final String $mes_flg = $oper_act + ".mes_flg";
	public static final String $ext_sys_cd = $oper_act + ".ext_sys_cd";
	public static final String $ext_oper_act_no = $oper_act + ".ext_oper_act_no";
	public static final String $if_auto_reg_flg = $oper_act + ".if_auto_reg_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_conv_rnd_typ_META = createCommonMeta($base_unit_conv_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta not_cmpl_flg_META = createCommonMeta($not_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_act_META = createInnerRowMeta($oper_act, mcframe.serverMS.dbc.MST_OPER_ACT_R.class);

	protected static final ConstMetaList<MfgActTblReg_Upd02_DtlR> constMetas = new ConstMetaList<MfgActTblReg_Upd02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			oper_std_qty_META,
			oper_conv_qty_META,
			base_unit_dec_place_META,
			base_unit_conv_rnd_typ_META,
			not_cmpl_flg_META,
			oper_act_META
		},
		new String[][]{
			{
				"oper_act_no",
				"mfg_act_no",
				"itm_mfg_inst_no",
				"oper_inst_no",
				"div_seq",
				"arr_act_no",
				"purc_act_io_no",
				"disp_seq",
				"st_act_tm",
				"end_act_tm",
				"base_unit_qty",
				"base_unit_cd",
				"oper_unit_qty",
				"oper_unit_cd",
				"bkf_ctl_flg",
				"wk_cost_calc_ctl_flg",
				"oper_yield",
				"bkf_not_ref_flg",
				"data_no",
				"mes_id",
				"intr_rmrks",
				"act_rpt_rmrks",
				"oper_act_sub_char1",
				"oper_act_sub_char2",
				"oper_act_sub_char3",
				"mes_flg",
				"ext_sys_cd",
				"ext_oper_act_no",
				"if_auto_reg_flg"
			},
			{
				$oper_act_no,
				$mfg_act_no,
				$itm_mfg_inst_no,
				$oper_inst_no,
				$div_seq,
				$arr_act_no,
				$purc_act_io_no,
				$disp_seq,
				$st_act_tm,
				$end_act_tm,
				$base_unit_qty,
				$base_unit_cd,
				$oper_unit_qty,
				$oper_unit_cd,
				$bkf_ctl_flg,
				$wk_cost_calc_ctl_flg,
				$oper_yield,
				$bkf_not_ref_flg,
				$data_no,
				$mes_id,
				$intr_rmrks,
				$act_rpt_rmrks,
				$oper_act_sub_char1,
				$oper_act_sub_char2,
				$oper_act_sub_char3,
				$mes_flg,
				$ext_sys_cd,
				$ext_oper_act_no,
				$if_auto_reg_flg
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
	protected MfgActTblReg_Upd02_DtlR_MC_A(ConstMetaList<? extends MfgActTblReg_Upd02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd02_DtlR clone() {
		return (MfgActTblReg_Upd02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd02_DtlR createInstance() {
		return (MfgActTblReg_Upd02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActTblReg_Upd02_DtlR getValues(String... names) {
		return (MfgActTblReg_Upd02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 2, $oper_std_qty);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 2, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 2, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 2, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 2, $oper_std_qty, value);
	}

	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 2, $oper_std_qty, value);
	}


	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 3, $oper_conv_qty);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 3, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 3, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 3, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 3, $oper_conv_qty, value);
	}

	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 3, $oper_conv_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 4, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 4, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_conv_rnd_typ() {
		return getConstString(offset + 5, $base_unit_conv_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_conv_rnd_typ(String value) {
		setConstString(offset + 5, $base_unit_conv_rnd_typ, value);
	}


	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public boolean not_cmpl_flg() {
		return getConstBoolean(offset + 6, $not_cmpl_flg);
	}

	/**
	 * Uncompleted 未完了.<p>
	 *
	 */
	public void not_cmpl_flg(boolean value) {
		setConstBoolean(offset + 6, $not_cmpl_flg, value);
	}


	public mcframe.serverMS.dbc.MST_OPER_ACT_R oper_act(){
		return (mcframe.serverMS.dbc.MST_OPER_ACT_R) getConstInnerRow(offset + 7, $oper_act);
	}
	
	public void oper_act(mcframe.serverMS.dbc.MST_OPER_ACT_R row){
		setConstInnerRow(offset + 7, $oper_act, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_conv_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			return not_cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($base_unit_conv_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_conv_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_cmpl_flg.equalsIgnoreCase(name)) {
			not_cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($oper_act.equalsIgnoreCase(name)) {
			return oper_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($oper_act.equalsIgnoreCase(name)) {
			oper_act(
				((MCContainerMeta) oper_act_META).castInnerRow(mcframe.serverMS.dbc.MST_OPER_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return oper_act().oper_act_no();
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		oper_act().oper_act_no(value);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return oper_act().mfg_act_no();
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		oper_act().mfg_act_no(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return oper_act().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		oper_act().itm_mfg_inst_no(value);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return oper_act().oper_inst_no();
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		oper_act().oper_inst_no(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return oper_act().div_seq();
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		oper_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		oper_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		oper_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		oper_act().div_seq(value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		oper_act().div_seq(value);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return oper_act().arr_act_no();
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		oper_act().arr_act_no(value);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return oper_act().purc_act_io_no();
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		oper_act().purc_act_io_no(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return oper_act().disp_seq();
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		oper_act().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		oper_act().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		oper_act().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		oper_act().disp_seq(value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		oper_act().disp_seq(value);
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return oper_act().st_act_tm();
	}

	/**
	 * Actual start date and time 着手実績日時.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		oper_act().st_act_tm(value);
	}

	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return oper_act().end_act_tm();
	}

	/**
	 * Actual end date and time 終了実績日時.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		oper_act().end_act_tm(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return oper_act().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		oper_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		oper_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		oper_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		oper_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		oper_act().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return oper_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		oper_act().base_unit_cd(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public MCNumber oper_unit_qty() {
		return oper_act().oper_unit_qty();
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(MCNumber value) {
		oper_act().oper_unit_qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(int value) {
		oper_act().oper_unit_qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(long value) {
		oper_act().oper_unit_qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(float value) {
		oper_act().oper_unit_qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_qty(double value) {
		oper_act().oper_unit_qty(value);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return oper_act().oper_unit_cd();
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		oper_act().oper_unit_cd(value);
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public boolean bkf_ctl_flg() {
		return oper_act().bkf_ctl_flg();
	}

	/**
	 * Allow backflush update バックフラッシュ更新許可.<p>
	 *
	 */
	public void bkf_ctl_flg(boolean value) {
		oper_act().bkf_ctl_flg(value);
	}

	/**
	 * Allow man-hour auto-calculation 自動工数計算許可.<p>
	 *
	 */
	public boolean wk_cost_calc_ctl_flg() {
		return oper_act().wk_cost_calc_ctl_flg();
	}

	/**
	 * Allow man-hour auto-calculation 自動工数計算許可.<p>
	 *
	 */
	public void wk_cost_calc_ctl_flg(boolean value) {
		oper_act().wk_cost_calc_ctl_flg(value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public MCNumber oper_yield() {
		return oper_act().oper_yield();
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(MCNumber value) {
		oper_act().oper_yield(value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(int value) {
		oper_act().oper_yield(value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(long value) {
		oper_act().oper_yield(value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(float value) {
		oper_act().oper_yield(value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(double value) {
		oper_act().oper_yield(value);
	}

	/**
	 * Backflush not applied バックフラッシュ未反映.<p>
	 *
	 */
	public boolean bkf_not_ref_flg() {
		return oper_act().bkf_not_ref_flg();
	}

	/**
	 * Backflush not applied バックフラッシュ未反映.<p>
	 *
	 */
	public void bkf_not_ref_flg(boolean value) {
		oper_act().bkf_not_ref_flg(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return oper_act().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		oper_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		oper_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		oper_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		oper_act().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		oper_act().data_no(value);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return oper_act().mes_id();
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		oper_act().mes_id(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return oper_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		oper_act().intr_rmrks(value);
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return oper_act().act_rpt_rmrks();
	}

	/**
	 * Record sheet remarks 記録書備考.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		oper_act().act_rpt_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String oper_act_sub_char1() {
		return oper_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void oper_act_sub_char1(String value) {
		oper_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String oper_act_sub_char2() {
		return oper_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void oper_act_sub_char2(String value) {
		oper_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String oper_act_sub_char3() {
		return oper_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void oper_act_sub_char3(String value) {
		oper_act().sub_char3(value);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return oper_act().mes_flg();
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		oper_act().mes_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return oper_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		oper_act().ext_sys_cd(value);
	}

	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public String ext_oper_act_no() {
		return oper_act().ext_oper_act_no();
	}

	/**
	 * External operation result No. 外部工程実績ＮＯ.<p>
	 *
	 */
	public void ext_oper_act_no(String value) {
		oper_act().ext_oper_act_no(value);
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public boolean if_auto_reg_flg() {
		return oper_act().if_auto_reg_flg();
	}

	/**
	 * IF auto-create ＩＦ自動作成.<p>
	 *
	 */
	public void if_auto_reg_flg(boolean value) {
		oper_act().if_auto_reg_flg(value);
	}

}

