package mcframe.clientMGBF.MGBFP0490;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Rslt2R_MC_A extends MCConstRow {

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $inpt_rsn_nm = "inpt_rsn_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $unit = "unit";
	/**
	 * Cost 原価.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public static final String $base_unit = "base_unit";
	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public static final String $pln_qty = "pln_qty";
	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public static final String $pln_cost = "pln_cost";


	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta inpt_rsn_nm_META = createCommonMeta($inpt_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_META = createCommonMeta($unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_META = createCommonMeta($base_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pln_qty_META = createCommonMeta($pln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pln_cost_META = createCommonMeta($pln_cost, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Rslt2R> constMetas = new ConstMetaList<Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			oper_cd_META,
			oper_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			inpt_rsn_cd_META,
			inpt_rsn_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			ym_META,
			qty_META,
			unit_META,
			act_cost_META,
			base_qty_META,
			base_unit_META,
			pln_qty_META,
			pln_cost_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
				{$oper_cd, "Key"},	// oper_cd
				{$itm_cd, "Key"},	// itm_cd
				{$itm_sub1, "Key"},	// itm_sub1
				{$itm_sub2, "Key"},	// itm_sub2
				{$itm_sub3, "Key"},	// itm_sub3
				{$itm_typ, "Key"},	// itm_typ
				{$itm_typ_d_cd, "Key"},	// itm_typ_d_cd
				{$itm_jnl_cd, "Key"},	// itm_jnl_cd
				{$inpt_rsn_cd, "Key"},	// inpt_rsn_cd
				{$asst_typ, "Key"}	// asst_typ
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
				{$oper_nm, "Key"},	// oper_nm
				{$itm_nm, "Key"},	// itm_nm
				{$itm_typ_nm, "Key"},	// itm_typ_nm
				{$itm_typ_d_nm, "Key"},	// itm_typ_d_nm
				{$itm_jnl_nm, "Key"},	// itm_jnl_nm
				{$inpt_rsn_nm, "Key"},	// inpt_rsn_nm
				{$asst_typ_nm, "Key"},	// asst_typ_nm
				{$unit_cd, "Key"},	// unit_cd
				{$unit_nm, "Key"},	// unit_nm
				{$dec_place, "Key"}	// dec_place
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
				{$qty, "Key"},	// qty
				{$unit, "Key"},	// unit
				{$act_cost, "Key"},	// act_cost
				{$base_qty, "Key"},	// base_qty
				{$base_unit, "Key"},	// base_unit
				{$pln_qty, "Key"},	// pln_qty
				{$pln_cost, "Key"}	// pln_cost
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$ym, "Key"}	// ym
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected Rslt2R_MC_A(ConstMetaList<? extends Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt2R clone() {
		return (Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt2R createInstance() {
		return (Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Rslt2R getValues(String... names) {
		return (Rslt2R) super.getValues(names);
	}



	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 0, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 0, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 1, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 1, $oper_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 7, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 7, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 8, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 8, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 9, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 9, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 10, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 10, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 11, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 11, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 12, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 12, $itm_jnl_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 13, $inpt_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 13, $inpt_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String inpt_rsn_nm() {
		return getConstString(offset + 14, $inpt_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void inpt_rsn_nm(String value) {
		setConstString(offset + 14, $inpt_rsn_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 15, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 15, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 16, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 16, $asst_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 17, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 17, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 18, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 18, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 19, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 19, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 19, $dec_place, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 20, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 20, $ym, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 21, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 21, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 21, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 21, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 21, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 21, $qty, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber unit() {
		return getConstNumber(offset + 22, $unit);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(MCNumber value) {
		setConstNumber(offset + 22, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(int value) {
		setConstNumber(offset + 22, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(long value) {
		setConstNumber(offset + 22, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(float value) {
		setConstNumber(offset + 22, $unit, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void unit(double value) {
		setConstNumber(offset + 22, $unit, value);
	}


	/**
	 * Cost 原価.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 23, $act_cost);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 23, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 23, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 23, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 23, $act_cost, value);
	}

	/**
	 * Cost 原価.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 23, $act_cost, value);
	}


	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 24, $base_qty);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 24, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 24, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 24, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 24, $base_qty, value);
	}

	/**
	 * Basic unit 原単位.<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 24, $base_qty, value);
	}


	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public MCNumber base_unit() {
		return getConstNumber(offset + 25, $base_unit);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(MCNumber value) {
		setConstNumber(offset + 25, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(int value) {
		setConstNumber(offset + 25, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(long value) {
		setConstNumber(offset + 25, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(float value) {
		setConstNumber(offset + 25, $base_unit, value);
	}

	/**
	 * Basic unit per unit 原単位単価.<p>
	 *
	 */
	public void base_unit(double value) {
		setConstNumber(offset + 25, $base_unit, value);
	}


	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public MCNumber pln_qty() {
		return getConstNumber(offset + 26, $pln_qty);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(MCNumber value) {
		setConstNumber(offset + 26, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(int value) {
		setConstNumber(offset + 26, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(long value) {
		setConstNumber(offset + 26, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(float value) {
		setConstNumber(offset + 26, $pln_qty, value);
	}

	/**
	 * Planned qty. 計画数.<p>
	 *
	 */
	public void pln_qty(double value) {
		setConstNumber(offset + 26, $pln_qty, value);
	}


	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public MCNumber pln_cost() {
		return getConstNumber(offset + 27, $pln_cost);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(MCNumber value) {
		setConstNumber(offset + 27, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(int value) {
		setConstNumber(offset + 27, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(long value) {
		setConstNumber(offset + 27, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(float value) {
		setConstNumber(offset + 27, $pln_cost, value);
	}

	/**
	 * Plan cost 計画原価.<p>
	 *
	 */
	public void pln_cost(double value) {
		setConstNumber(offset + 27, $pln_cost, value);
	}


	public String getString(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($unit.equalsIgnoreCase(name)) {
			return unit();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			return base_unit();
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			return pln_qty();
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($unit.equalsIgnoreCase(name)) {
			return unit();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			return base_unit();
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			return pln_qty();
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			return pln_cost();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($base_unit.equalsIgnoreCase(name)) {
			base_unit(value);
			return;
		}
		if ($pln_qty.equalsIgnoreCase(name)) {
			pln_qty(value);
			return;
		}
		if ($pln_cost.equalsIgnoreCase(name)) {
			pln_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

