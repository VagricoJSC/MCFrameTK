package mcframe.clientMGBF.MGBFP0300;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Inventory revaluation cd. 在庫評価ＣＤ.<p>
	 *
	 */
	public static final String $stk_eval_cd = "stk_eval_cd";
	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Recording 計上.<p>
	 *
	 */
	public static final String $summed_flg = "summed_flg";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public static final String $mng_dpt_nm = "mng_dpt_nm";
	public static final String $itm_p = "itm_p";
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
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
	public static final String $qty_p = "qty_p";
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
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public static final String $stk_unit = "stk_unit";
	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public static final String $eval_unit = "eval_unit";
	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public static final String $stk_amt = "stk_amt";
	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public static final String $eval_amt = "eval_amt";
	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public static final String $new_stk_amt = "new_stk_amt";
	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public static final String $loss = "loss";
	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public static final String $summed_loss = "summed_loss";
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public static final String $non_mov_base_dt = "non_mov_base_dt";
	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public static final String $non_mov_num = "non_mov_num";
	/**
	 * Total row 合計行.<p>
	 *
	 */
	public static final String $sum_flg = "sum_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $qty = $qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta stk_eval_cd_META = createCommonMeta($stk_eval_cd, mcframe.commonMA.meta.MA_META.STK_EVAL_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta summed_flg_META = createCommonMeta($summed_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta mng_dpt_nm_META = createCommonMeta($mng_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta stk_unit_META = createCommonMeta($stk_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta eval_unit_META = createCommonMeta($eval_unit, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta stk_amt_META = createCommonMeta($stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta eval_amt_META = createCommonMeta($eval_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta new_stk_amt_META = createCommonMeta($new_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta loss_META = createCommonMeta($loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta summed_loss_META = createCommonMeta($summed_loss, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta non_mov_base_dt_META = createCommonMeta($non_mov_base_dt, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta non_mov_num_META = createCommonMeta($non_mov_num, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta sum_flg_META = createCommonMeta($sum_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			calc_grp_cd_META,
			calc_no_META,
			stk_eval_cd_META,
			ym_META,
			summed_flg_META,
			wg_cd_META,
			wg_nm_META,
			mng_dpt_cd_META,
			mng_dpt_nm_META,
			itm_p_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			bp_cd_META,
			bp_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			stk_unit_META,
			eval_unit_META,
			stk_amt_META,
			eval_amt_META,
			new_stk_amt_META,
			loss_META,
			summed_loss_META,
			first_gr_dt_META,
			vld_dt_META,
			lmt_dt_META,
			non_mov_base_dt_META,
			non_mov_num_META,
			sum_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$qty
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"}	// sno4
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$stk_unit, "UNIT"},	// stk_unit
				{$eval_unit, "UNIT"},	// eval_unit
				{$stk_amt, "AMT"},	// stk_amt
				{$eval_amt, "AMT"},	// eval_amt
				{$new_stk_amt, "AMT"},	// new_stk_amt
				{$loss, "AMT"},	// loss
				{$summed_loss, "AMT"}	// summed_loss
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 2, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 2, $calc_no, value);
	}


	/**
	 * Inventory revaluation cd. 在庫評価ＣＤ.<p>
	 *
	 */
	public String stk_eval_cd() {
		return getConstString(offset + 3, $stk_eval_cd);
	}

	/**
	 * Inventory revaluation cd. 在庫評価ＣＤ.<p>
	 *
	 */
	public void stk_eval_cd(String value) {
		setConstString(offset + 3, $stk_eval_cd, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 4, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 4, $ym, value);
	}


	/**
	 * Recording 計上.<p>
	 *
	 */
	public boolean summed_flg() {
		return getConstBoolean(offset + 5, $summed_flg);
	}

	/**
	 * Recording 計上.<p>
	 *
	 */
	public void summed_flg(boolean value) {
		setConstBoolean(offset + 5, $summed_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 8, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 8, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 9, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 9, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 10, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 10, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 11, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 11, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 12, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 12, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 13, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 13, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 14, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 14, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 15, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 15, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 16, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 16, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 17, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 17, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 18, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 18, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 19, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 19, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 20, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 20, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 21, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 21, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 22, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 22, $sno4, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 23, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 23, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 24, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 24, $bp_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 25, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 25, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 26, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 26, $asst_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $qty_p, row);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 28, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 28, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 29, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 29, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 30, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 30, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 30, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 30, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 30, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 30, $dec_place, value);
	}


	/**
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public MCNumber stk_unit() {
		return getConstNumber(offset + 31, $stk_unit);
	}

	/**
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public void stk_unit(MCNumber value) {
		setConstNumber(offset + 31, $stk_unit, value);
	}

	/**
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public void stk_unit(int value) {
		setConstNumber(offset + 31, $stk_unit, value);
	}

	/**
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public void stk_unit(long value) {
		setConstNumber(offset + 31, $stk_unit, value);
	}

	/**
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public void stk_unit(float value) {
		setConstNumber(offset + 31, $stk_unit, value);
	}

	/**
	 * Inventory unit price 在庫単価.<p>
	 *
	 */
	public void stk_unit(double value) {
		setConstNumber(offset + 31, $stk_unit, value);
	}


	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public MCNumber eval_unit() {
		return getConstNumber(offset + 32, $eval_unit);
	}

	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public void eval_unit(MCNumber value) {
		setConstNumber(offset + 32, $eval_unit, value);
	}

	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public void eval_unit(int value) {
		setConstNumber(offset + 32, $eval_unit, value);
	}

	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public void eval_unit(long value) {
		setConstNumber(offset + 32, $eval_unit, value);
	}

	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public void eval_unit(float value) {
		setConstNumber(offset + 32, $eval_unit, value);
	}

	/**
	 * Evaluation unit price 評価単価.<p>
	 *
	 */
	public void eval_unit(double value) {
		setConstNumber(offset + 32, $eval_unit, value);
	}


	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public MCNumber stk_amt() {
		return getConstNumber(offset + 33, $stk_amt);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(MCNumber value) {
		setConstNumber(offset + 33, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(int value) {
		setConstNumber(offset + 33, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(long value) {
		setConstNumber(offset + 33, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(float value) {
		setConstNumber(offset + 33, $stk_amt, value);
	}

	/**
	 * Inventory amount 在庫金額.<p>
	 *
	 */
	public void stk_amt(double value) {
		setConstNumber(offset + 33, $stk_amt, value);
	}


	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public MCNumber eval_amt() {
		return getConstNumber(offset + 34, $eval_amt);
	}

	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public void eval_amt(MCNumber value) {
		setConstNumber(offset + 34, $eval_amt, value);
	}

	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public void eval_amt(int value) {
		setConstNumber(offset + 34, $eval_amt, value);
	}

	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public void eval_amt(long value) {
		setConstNumber(offset + 34, $eval_amt, value);
	}

	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public void eval_amt(float value) {
		setConstNumber(offset + 34, $eval_amt, value);
	}

	/**
	 * Evaluated amount 評価金額.<p>
	 *
	 */
	public void eval_amt(double value) {
		setConstNumber(offset + 34, $eval_amt, value);
	}


	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public MCNumber new_stk_amt() {
		return getConstNumber(offset + 35, $new_stk_amt);
	}

	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public void new_stk_amt(MCNumber value) {
		setConstNumber(offset + 35, $new_stk_amt, value);
	}

	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public void new_stk_amt(int value) {
		setConstNumber(offset + 35, $new_stk_amt, value);
	}

	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public void new_stk_amt(long value) {
		setConstNumber(offset + 35, $new_stk_amt, value);
	}

	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public void new_stk_amt(float value) {
		setConstNumber(offset + 35, $new_stk_amt, value);
	}

	/**
	 * Revaluated amount 評価後在庫金額.<p>
	 *
	 */
	public void new_stk_amt(double value) {
		setConstNumber(offset + 35, $new_stk_amt, value);
	}


	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public MCNumber loss() {
		return getConstNumber(offset + 36, $loss);
	}

	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public void loss(MCNumber value) {
		setConstNumber(offset + 36, $loss, value);
	}

	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public void loss(int value) {
		setConstNumber(offset + 36, $loss, value);
	}

	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public void loss(long value) {
		setConstNumber(offset + 36, $loss, value);
	}

	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public void loss(float value) {
		setConstNumber(offset + 36, $loss, value);
	}

	/**
	 * Revaluation loss 評価損.<p>
	 *
	 */
	public void loss(double value) {
		setConstNumber(offset + 36, $loss, value);
	}


	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public MCNumber summed_loss() {
		return getConstNumber(offset + 37, $summed_loss);
	}

	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public void summed_loss(MCNumber value) {
		setConstNumber(offset + 37, $summed_loss, value);
	}

	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public void summed_loss(int value) {
		setConstNumber(offset + 37, $summed_loss, value);
	}

	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public void summed_loss(long value) {
		setConstNumber(offset + 37, $summed_loss, value);
	}

	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public void summed_loss(float value) {
		setConstNumber(offset + 37, $summed_loss, value);
	}

	/**
	 * Recorded valuation loss 計上済評価損.<p>
	 *
	 */
	public void summed_loss(double value) {
		setConstNumber(offset + 37, $summed_loss, value);
	}


	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 38, $first_gr_dt);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 38, $first_gr_dt, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 39, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 39, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 40, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 40, $lmt_dt, value);
	}


	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public MCDate non_mov_base_dt() {
		return getConstDate(offset + 41, $non_mov_base_dt);
	}

	/**
	 * Non-moving base month 滞留基準年月.<p>
	 *
	 */
	public void non_mov_base_dt(MCDate value) {
		setConstDate(offset + 41, $non_mov_base_dt, value);
	}


	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public MCNumber non_mov_num() {
		return getConstNumber(offset + 42, $non_mov_num);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_num(MCNumber value) {
		setConstNumber(offset + 42, $non_mov_num, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_num(int value) {
		setConstNumber(offset + 42, $non_mov_num, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_num(long value) {
		setConstNumber(offset + 42, $non_mov_num, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_num(float value) {
		setConstNumber(offset + 42, $non_mov_num, value);
	}

	/**
	 * Number of non-moving months 滞留月数.<p>
	 *
	 */
	public void non_mov_num(double value) {
		setConstNumber(offset + 42, $non_mov_num, value);
	}


	/**
	 * Total row 合計行.<p>
	 *
	 */
	public boolean sum_flg() {
		return getConstBoolean(offset + 43, $sum_flg);
	}

	/**
	 * Total row 合計行.<p>
	 *
	 */
	public void sum_flg(boolean value) {
		setConstBoolean(offset + 43, $sum_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($stk_eval_cd.equalsIgnoreCase(name)) {
			return stk_eval_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
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
		if ($stk_unit.equalsIgnoreCase(name)) {
			return stk_unit();
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			return eval_unit();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			return eval_amt();
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			return new_stk_amt();
		}
		if ($loss.equalsIgnoreCase(name)) {
			return loss();
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			return summed_loss();
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			return non_mov_num();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($non_mov_base_dt.equalsIgnoreCase(name)) {
			return non_mov_base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($summed_flg.equalsIgnoreCase(name)) {
			return summed_flg();
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			return sum_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($stk_eval_cd.equalsIgnoreCase(name)) {
			return stk_eval_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			return mng_dpt_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
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
		if ($stk_unit.equalsIgnoreCase(name)) {
			return stk_unit();
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			return eval_unit();
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			return stk_amt();
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			return eval_amt();
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			return new_stk_amt();
		}
		if ($loss.equalsIgnoreCase(name)) {
			return loss();
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			return summed_loss();
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			return non_mov_num();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($non_mov_base_dt.equalsIgnoreCase(name)) {
			return non_mov_base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($summed_flg.equalsIgnoreCase(name)) {
			return summed_flg();
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			return sum_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($stk_eval_cd.equalsIgnoreCase(name)) {
			stk_eval_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($non_mov_base_dt.equalsIgnoreCase(name)) {
			non_mov_base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($summed_flg.equalsIgnoreCase(name)) {
			summed_flg(value);
			return;
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			sum_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($stk_eval_cd.equalsIgnoreCase(name)) {
			stk_eval_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
			return;
		}
		if ($mng_dpt_nm.equalsIgnoreCase(name)) {
			mng_dpt_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
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
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($stk_unit.equalsIgnoreCase(name)) {
			stk_unit(value);
			return;
		}
		if ($eval_unit.equalsIgnoreCase(name)) {
			eval_unit(value);
			return;
		}
		if ($stk_amt.equalsIgnoreCase(name)) {
			stk_amt(value);
			return;
		}
		if ($eval_amt.equalsIgnoreCase(name)) {
			eval_amt(value);
			return;
		}
		if ($new_stk_amt.equalsIgnoreCase(name)) {
			new_stk_amt(value);
			return;
		}
		if ($loss.equalsIgnoreCase(name)) {
			loss(value);
			return;
		}
		if ($summed_loss.equalsIgnoreCase(name)) {
			summed_loss(value);
			return;
		}
		if ($non_mov_num.equalsIgnoreCase(name)) {
			non_mov_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($non_mov_base_dt.equalsIgnoreCase(name)) {
			non_mov_base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($summed_flg.equalsIgnoreCase(name)) {
			summed_flg(value);
			return;
		}
		if ($sum_flg.equalsIgnoreCase(name)) {
			sum_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public MCNumber qty() {
		return qty_p().qty();
	}

	public void qty(MCNumber value) {
		qty_p().qty(value);
	}

	public void qty(int value) {
		qty_p().qty(value);
	}

	public void qty(long value) {
		qty_p().qty(value);
	}

	public void qty(float value) {
		qty_p().qty(value);
	}

	public void qty(double value) {
		qty_p().qty(value);
	}

}

