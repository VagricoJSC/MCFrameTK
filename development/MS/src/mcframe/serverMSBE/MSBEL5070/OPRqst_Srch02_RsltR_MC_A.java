package mcframe.serverMSBE.MSBEL5070;

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
 * ブロック"OPRqst_Srch02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OPRqst_Srch02_RsltR_MC_A extends MCConstRow {

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $strg_wg_cd = "strg_wg_cd";
	/**
	 * Storage location G 格納場所Ｇ.<p>
	 *
	 */
	public static final String $strg_loc_grp_cd = "strg_loc_grp_cd";
	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public static final String $op_rpl_mtd_typ = "op_rpl_mtd_typ";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_sppl_cd = "mfg_loc_sppl_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public static final String $rqst_str_ln_tgt_flg = "rqst_str_ln_tgt_flg";
	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $rqst_str_ln_cd = "rqst_str_ln_cd";
	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public static final String $rqst_str_ln_nm = "rqst_str_ln_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public static final String $order_ratio = "order_ratio";
	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public static final String $lot_sizing_flg = "lot_sizing_flg";
	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public static final String $min_lot_qty = "min_lot_qty";
	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public static final String $batch_lot_qty = "batch_lot_qty";
	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public static final String $max_lot_qty = "max_lot_qty";
	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public static final String $mfg_inst_qty = "mfg_inst_qty";
	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public static final String $fxd_rqmt_qty = "fxd_rqmt_qty";


	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_wg_cd_META = createCommonMeta($strg_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta strg_loc_grp_cd_META = createCommonMeta($strg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta op_rpl_mtd_typ_META = createCommonMeta($op_rpl_mtd_typ, mcframe.commonMS.meta.MS_META.OP_RPL_MTD_TYP);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_sppl_cd_META = createCommonMeta($mfg_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_str_ln_tgt_flg_META = createCommonMeta($rqst_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_str_ln_cd_META = createCommonMeta($rqst_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta rqst_str_ln_nm_META = createCommonMeta($rqst_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta order_ratio_META = createCommonMeta($order_ratio, mcframe.commonMA.meta.MA_META.ORDER_RATIO);
	public static final MCMeta lot_sizing_flg_META = createCommonMeta($lot_sizing_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta min_lot_qty_META = createCommonMeta($min_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta batch_lot_qty_META = createCommonMeta($batch_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta max_lot_qty_META = createCommonMeta($max_lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_qty_META = createCommonMeta($mfg_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_rqmt_qty_META = createCommonMeta($fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<OPRqst_Srch02_RsltR> constMetas = new ConstMetaList<OPRqst_Srch02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			master_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			strg_loc_cd_META,
			strg_wg_cd_META,
			strg_loc_grp_cd_META,
			rqst_qty_META,
			dec_place_META,
			op_rpl_mtd_typ_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_sppl_cd_META,
			bom_ptn_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_str_ln_tgt_flg_META,
			rqst_str_ln_cd_META,
			rqst_str_ln_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			prio_META,
			order_ratio_META,
			lot_sizing_flg_META,
			min_lot_qty_META,
			batch_lot_qty_META,
			max_lot_qty_META,
			yield_schd_qty_META,
			mfg_inst_qty_META,
			fxd_rqmt_qty_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected OPRqst_Srch02_RsltR_MC_A(ConstMetaList<? extends OPRqst_Srch02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OPRqst_Srch02_RsltR clone() {
		return (OPRqst_Srch02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OPRqst_Srch02_RsltR createInstance() {
		return (OPRqst_Srch02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OPRqst_Srch02_RsltR getValues(String... names) {
		return (OPRqst_Srch02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 0, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 0, $master_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 5, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 5, $strg_loc_cd, value);
	}


	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public String strg_wg_cd() {
		return getConstString(offset + 6, $strg_wg_cd);
	}

	/**
	 * Storage WG cd. 格納ワーキンググループＣＤ.<p>
	 *
	 */
	public void strg_wg_cd(String value) {
		setConstString(offset + 6, $strg_wg_cd, value);
	}


	/**
	 * Storage location G 格納場所Ｇ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 7, $strg_loc_grp_cd);
	}

	/**
	 * Storage location G 格納場所Ｇ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 7, $strg_loc_grp_cd, value);
	}


	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 8, $rqst_qty);
	}

	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 8, $rqst_qty, value);
	}

	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 8, $rqst_qty, value);
	}

	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 8, $rqst_qty, value);
	}

	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 8, $rqst_qty, value);
	}

	/**
	 * Replenishment qty. 補充数量.<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 8, $rqst_qty, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 9, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 9, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 9, $dec_place, value);
	}


	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public String op_rpl_mtd_typ() {
		return getConstString(offset + 10, $op_rpl_mtd_typ);
	}

	/**
	 * Replenishment method type 補充方法区分.<p>
	 *
	 */
	public void op_rpl_mtd_typ(String value) {
		setConstString(offset + 10, $op_rpl_mtd_typ, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 11, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 11, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 12, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 12, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 13, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location G 製造場所Ｇ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 13, $mfg_loc_grp_cd, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String mfg_loc_sppl_cd() {
		return getConstString(offset + 14, $mfg_loc_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void mfg_loc_sppl_cd(String value) {
		setConstString(offset + 14, $mfg_loc_sppl_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 15, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 15, $bom_ptn, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 16, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 16, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 17, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 17, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 18, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 18, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 19, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 19, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 20, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 20, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 21, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 21, $rqst_loc_nm, value);
	}


	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public boolean rqst_str_ln_tgt_flg() {
		return getConstBoolean(offset + 22, $rqst_str_ln_tgt_flg);
	}

	/**
	 * For requested rack/line 依頼先棚・ライン対象.<p>
	 *
	 */
	public void rqst_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 22, $rqst_str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public String rqst_str_ln_cd() {
		return getConstString(offset + 23, $rqst_str_ln_cd);
	}

	/**
	 * Rack/Line cd. (Requested) 依頼先棚・ラインＣＤ.<p>
	 *
	 */
	public void rqst_str_ln_cd(String value) {
		setConstString(offset + 23, $rqst_str_ln_cd, value);
	}


	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public String rqst_str_ln_nm() {
		return getConstString(offset + 24, $rqst_str_ln_nm);
	}

	/**
	 * Rack/Line name (Requested) 依頼先棚・ライン名.<p>
	 *
	 */
	public void rqst_str_ln_nm(String value) {
		setConstString(offset + 24, $rqst_str_ln_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 25, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 25, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 26, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 26, $rqst_wg_nm, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 27, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 27, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 27, $prio, value);
	}


	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return getConstNumber(offset + 28, $order_ratio);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(int value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(long value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(float value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(double value) {
		setConstNumber(offset + 28, $order_ratio, value);
	}


	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public boolean lot_sizing_flg() {
		return getConstBoolean(offset + 29, $lot_sizing_flg);
	}

	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public void lot_sizing_flg(boolean value) {
		setConstBoolean(offset + 29, $lot_sizing_flg, value);
	}


	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return getConstNumber(offset + 30, $min_lot_qty);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		setConstNumber(offset + 30, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		setConstNumber(offset + 30, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		setConstNumber(offset + 30, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		setConstNumber(offset + 30, $min_lot_qty, value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		setConstNumber(offset + 30, $min_lot_qty, value);
	}


	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return getConstNumber(offset + 31, $batch_lot_qty);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		setConstNumber(offset + 31, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		setConstNumber(offset + 31, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		setConstNumber(offset + 31, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		setConstNumber(offset + 31, $batch_lot_qty, value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		setConstNumber(offset + 31, $batch_lot_qty, value);
	}


	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return getConstNumber(offset + 32, $max_lot_qty);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		setConstNumber(offset + 32, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(int value) {
		setConstNumber(offset + 32, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(long value) {
		setConstNumber(offset + 32, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(float value) {
		setConstNumber(offset + 32, $max_lot_qty, value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(double value) {
		setConstNumber(offset + 32, $max_lot_qty, value);
	}


	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 33, $yield_schd_qty);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 33, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 33, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 33, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 33, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 33, $yield_schd_qty, value);
	}


	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber mfg_inst_qty() {
		return getConstNumber(offset + 34, $mfg_inst_qty);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(MCNumber value) {
		setConstNumber(offset + 34, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(int value) {
		setConstNumber(offset + 34, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(long value) {
		setConstNumber(offset + 34, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(float value) {
		setConstNumber(offset + 34, $mfg_inst_qty, value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(double value) {
		setConstNumber(offset + 34, $mfg_inst_qty, value);
	}


	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return getConstNumber(offset + 35, $fxd_rqmt_qty);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 35, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		setConstNumber(offset + 35, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		setConstNumber(offset + 35, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		setConstNumber(offset + 35, $fxd_rqmt_qty, value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		setConstNumber(offset + 35, $fxd_rqmt_qty, value);
	}


	public String getString(String name) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_str_ln_cd();
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_str_ln_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_tgt_flg();
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			return lot_sizing_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			return strg_wg_cd();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			return op_rpl_mtd_typ();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			return rqst_str_ln_cd();
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			return rqst_str_ln_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			return min_lot_qty();
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			return batch_lot_qty();
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			return max_lot_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			return mfg_inst_qty();
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return rqst_str_ln_tgt_flg();
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			return lot_sizing_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_str_ln_cd(value);
			return;
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_str_ln_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_tgt_flg(value);
			return;
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			lot_sizing_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_wg_cd.equalsIgnoreCase(name)) {
			strg_wg_cd(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($op_rpl_mtd_typ.equalsIgnoreCase(name)) {
			op_rpl_mtd_typ(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_sppl_cd.equalsIgnoreCase(name)) {
			mfg_loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_str_ln_cd.equalsIgnoreCase(name)) {
			rqst_str_ln_cd(value);
			return;
		}
		if ($rqst_str_ln_nm.equalsIgnoreCase(name)) {
			rqst_str_ln_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($min_lot_qty.equalsIgnoreCase(name)) {
			min_lot_qty(value);
			return;
		}
		if ($batch_lot_qty.equalsIgnoreCase(name)) {
			batch_lot_qty(value);
			return;
		}
		if ($max_lot_qty.equalsIgnoreCase(name)) {
			max_lot_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($mfg_inst_qty.equalsIgnoreCase(name)) {
			mfg_inst_qty(value);
			return;
		}
		if ($fxd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_rqmt_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rqst_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			rqst_str_ln_tgt_flg(value);
			return;
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			lot_sizing_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

