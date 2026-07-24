package mcframe.serverMSBD.MSBDL5180;

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
 * ブロック"Purc_Io"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Purc_IoR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	public static final String $pai = "pai";

	public static final String $purc_act_io_no = $pai + ".purc_act_io_no";
	public static final String $purc_act_io_seq = $pai + ".purc_act_io_seq";
	public static final String $purc_act_d_no = $pai + ".purc_act_d_no";
	public static final String $purc_act_d_seq = $pai + ".purc_act_d_seq";
	public static final String $arr_act_no = $pai + ".arr_act_no";
	public static final String $in_to_loc_cd = $pai + ".in_to_loc_cd";
	public static final String $in_to_loc_wg_cd = $pai + ".in_to_loc_wg_cd";
	public static final String $str_ln_cd = $pai + ".str_ln_cd";
	public static final String $gd_cd = $pai + ".gd_cd";
	public static final String $quality_typ = $pai + ".quality_typ";
	public static final String $lot_no = $pai + ".lot_no";
	public static final String $sublot_no = $pai + ".sublot_no";
	public static final String $trd_unit_cd = $pai + ".trd_unit_cd";
	public static final String $trd_unit_qty = $pai + ".trd_unit_qty";
	public static final String $base_unit_cd = $pai + ".base_unit_cd";
	public static final String $base_unit_qty = $pai + ".base_unit_qty";

	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta pai_META = createInnerRowMeta($pai, mcframe.serverMS.dbc.MST_PURC_ACT_IO_R.class);

	protected static final ConstMetaList<Purc_IoR> constMetas = new ConstMetaList<Purc_IoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			peg_no_META,
			dtl_peg_no_META,
			pai_META
		},
		new String[][]{
			{
				"purc_act_io_no",
				"purc_act_io_seq",
				"purc_act_d_no",
				"purc_act_d_seq",
				"arr_act_no",
				"in_to_loc_cd",
				"in_to_loc_wg_cd",
				"str_ln_cd",
				"gd_cd",
				"quality_typ",
				"lot_no",
				"sublot_no",
				"trd_unit_cd",
				"trd_unit_qty",
				"base_unit_cd",
				"base_unit_qty"
			},
			{
				$purc_act_io_no,
				$purc_act_io_seq,
				$purc_act_d_no,
				$purc_act_d_seq,
				$arr_act_no,
				$in_to_loc_cd,
				$in_to_loc_wg_cd,
				$str_ln_cd,
				$gd_cd,
				$quality_typ,
				$lot_no,
				$sublot_no,
				$trd_unit_cd,
				$trd_unit_qty,
				$base_unit_cd,
				$base_unit_qty
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		))
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
	protected Purc_IoR_MC_A(ConstMetaList<? extends Purc_IoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_IoR clone() {
		return (Purc_IoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_IoR createInstance() {
		return (Purc_IoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Purc_IoR getValues(String... names) {
		return (Purc_IoR) super.getValues(names);
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
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 2, $dtl_peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 2, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 2, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 2, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 2, $dtl_peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_PURC_ACT_IO_R pai(){
		return (mcframe.serverMS.dbc.MST_PURC_ACT_IO_R) getConstInnerRow(offset + 3, $pai);
	}
	
	public void pai(mcframe.serverMS.dbc.MST_PURC_ACT_IO_R row){
		setConstInnerRow(offset + 3, $pai, row);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($pai.equalsIgnoreCase(name)) {
			return pai();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pai.equalsIgnoreCase(name)) {
			pai(
				((MCContainerMeta) pai_META).castInnerRow(mcframe.serverMS.dbc.MST_PURC_ACT_IO_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String purc_act_io_no() {
		return pai().purc_act_io_no();
	}

	public void purc_act_io_no(String value) {
		pai().purc_act_io_no(value);
	}

	public MCNumber purc_act_io_seq() {
		return pai().purc_act_io_seq();
	}

	public void purc_act_io_seq(MCNumber value) {
		pai().purc_act_io_seq(value);
	}

	public void purc_act_io_seq(int value) {
		pai().purc_act_io_seq(value);
	}

	public void purc_act_io_seq(long value) {
		pai().purc_act_io_seq(value);
	}

	public void purc_act_io_seq(float value) {
		pai().purc_act_io_seq(value);
	}

	public void purc_act_io_seq(double value) {
		pai().purc_act_io_seq(value);
	}

	public String purc_act_d_no() {
		return pai().purc_act_d_no();
	}

	public void purc_act_d_no(String value) {
		pai().purc_act_d_no(value);
	}

	public MCNumber purc_act_d_seq() {
		return pai().purc_act_d_seq();
	}

	public void purc_act_d_seq(MCNumber value) {
		pai().purc_act_d_seq(value);
	}

	public void purc_act_d_seq(int value) {
		pai().purc_act_d_seq(value);
	}

	public void purc_act_d_seq(long value) {
		pai().purc_act_d_seq(value);
	}

	public void purc_act_d_seq(float value) {
		pai().purc_act_d_seq(value);
	}

	public void purc_act_d_seq(double value) {
		pai().purc_act_d_seq(value);
	}

	public String arr_act_no() {
		return pai().arr_act_no();
	}

	public void arr_act_no(String value) {
		pai().arr_act_no(value);
	}

	public String in_to_loc_cd() {
		return pai().in_to_loc_cd();
	}

	public void in_to_loc_cd(String value) {
		pai().in_to_loc_cd(value);
	}

	public String in_to_loc_wg_cd() {
		return pai().in_to_loc_wg_cd();
	}

	public void in_to_loc_wg_cd(String value) {
		pai().in_to_loc_wg_cd(value);
	}

	public String str_ln_cd() {
		return pai().str_ln_cd();
	}

	public void str_ln_cd(String value) {
		pai().str_ln_cd(value);
	}

	public String gd_cd() {
		return pai().gd_cd();
	}

	public void gd_cd(String value) {
		pai().gd_cd(value);
	}

	public String quality_typ() {
		return pai().quality_typ();
	}

	public void quality_typ(String value) {
		pai().quality_typ(value);
	}

	public String lot_no() {
		return pai().lot_no();
	}

	public void lot_no(String value) {
		pai().lot_no(value);
	}

	public String sublot_no() {
		return pai().sublot_no();
	}

	public void sublot_no(String value) {
		pai().sublot_no(value);
	}

	public String trd_unit_cd() {
		return pai().trd_unit_cd();
	}

	public void trd_unit_cd(String value) {
		pai().trd_unit_cd(value);
	}

	public MCNumber trd_unit_qty() {
		return pai().trd_unit_qty();
	}

	public void trd_unit_qty(MCNumber value) {
		pai().trd_unit_qty(value);
	}

	public void trd_unit_qty(int value) {
		pai().trd_unit_qty(value);
	}

	public void trd_unit_qty(long value) {
		pai().trd_unit_qty(value);
	}

	public void trd_unit_qty(float value) {
		pai().trd_unit_qty(value);
	}

	public void trd_unit_qty(double value) {
		pai().trd_unit_qty(value);
	}

	public String base_unit_cd() {
		return pai().base_unit_cd();
	}

	public void base_unit_cd(String value) {
		pai().base_unit_cd(value);
	}

	public MCNumber base_unit_qty() {
		return pai().base_unit_qty();
	}

	public void base_unit_qty(MCNumber value) {
		pai().base_unit_qty(value);
	}

	public void base_unit_qty(int value) {
		pai().base_unit_qty(value);
	}

	public void base_unit_qty(long value) {
		pai().base_unit_qty(value);
	}

	public void base_unit_qty(float value) {
		pai().base_unit_qty(value);
	}

	public void base_unit_qty(double value) {
		pai().base_unit_qty(value);
	}

}

