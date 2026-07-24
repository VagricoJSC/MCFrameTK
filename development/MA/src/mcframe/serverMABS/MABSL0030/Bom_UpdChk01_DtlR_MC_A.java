package mcframe.serverMABS.MABSL0030;

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
 * ブロック"Bom_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Bom_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_BOM_R {

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	/**
	 * Asset management type (parent) 資産管理区分（親）.<p>
	 *
	 */
	public static final String $par_asset_mng_typ = "par_asset_mng_typ";
	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public static final String $chd_dec_place = "chd_dec_place";
	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public static final String $chd_stk_mng_typ = "chd_stk_mng_typ";
	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public static final String $chd_asset_mng_typ = "chd_asset_mng_typ";
	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public static final String $par_sno1_mng_typ = "par_sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public static final String $par_sno2_mng_typ = "par_sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public static final String $par_sno3_mng_typ = "par_sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public static final String $par_sno4_mng_typ = "par_sno4_mng_typ";
	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno1_mng_typ = "chd_sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno2_mng_typ = "chd_sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno3_mng_typ = "chd_sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public static final String $chd_sno4_mng_typ = "chd_sno4_mng_typ";
	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";


	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta par_asset_mng_typ_META = createCommonMeta($par_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta chd_dec_place_META = createCommonMeta($chd_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta chd_stk_mng_typ_META = createCommonMeta($chd_stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta chd_asset_mng_typ_META = createCommonMeta($chd_asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta par_sno1_mng_typ_META = createCommonMeta($par_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_sno2_mng_typ_META = createCommonMeta($par_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_sno3_mng_typ_META = createCommonMeta($par_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_sno4_mng_typ_META = createCommonMeta($par_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno1_mng_typ_META = createCommonMeta($chd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno2_mng_typ_META = createCommonMeta($chd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno3_mng_typ_META = createCommonMeta($chd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chd_sno4_mng_typ_META = createCommonMeta($chd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Bom_UpdChk01_DtlR> constMetas = new ConstMetaList<Bom_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_BOM_R.constMetas,
		new MCMeta[]{
			par_dec_place_META,
			par_asset_mng_typ_META,
			chd_dec_place_META,
			chd_stk_mng_typ_META,
			chd_asset_mng_typ_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			par_sno1_mng_typ_META,
			par_sno2_mng_typ_META,
			par_sno3_mng_typ_META,
			par_sno4_mng_typ_META,
			chd_sno1_mng_typ_META,
			chd_sno2_mng_typ_META,
			chd_sno3_mng_typ_META,
			chd_sno4_mng_typ_META,
			ver_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bom_key, "U"},	// bom_key
				{$par_itm_cd, "E"},	// par_itm_cd
				{$par_itm_sub1, "E"},	// par_itm_sub1
				{$par_itm_sub2, "E"},	// par_itm_sub2
				{$par_itm_sub3, "E"},	// par_itm_sub3
				{$bom_ptn, "E"},	// bom_ptn
				{$par_inst_qty, "E"},	// par_inst_qty
				{$chd_rqmt_qty, "E"},	// chd_rqmt_qty
				{$chd_inpt_qty, "E"},	// chd_inpt_qty
				{$fxd_chd_rqmt_qty, "E"},	// fxd_chd_rqmt_qty
				{$in_offst_typ, "E"},	// in_offst_typ
				{$in_offst, "E"},	// in_offst
				{$bkf_typ, "E"},	// bkf_typ
				{$alloc_ctl_typ, "E"},	// alloc_ctl_typ
				{$inpt_ctl_typ, "E"},	// inpt_ctl_typ
				{$disp_seq, "E"},	// disp_seq
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$wg_cd, "E"},	// wg_cd
				{$par_itm_sub1, "E"},	// par_itm_sub1
				{$par_itm_sub2, "E"},	// par_itm_sub2
				{$par_itm_sub3, "E"}	// par_itm_sub3
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$st_dt, "E1:BF"},	// st_dt
				{$end_dt, "E1:AF"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$par_inst_qty, "positive"}	// par_inst_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$oper_seq, "0:"},	// oper_seq
				{$alt_itm_ratio, "0:"},	// alt_itm_ratio
				{$alt_alloc_prio, "0:"},	// alt_alloc_prio
				{$chd_rqmt_qty, "QTY:L"},	// chd_rqmt_qty
				{$chd_inpt_qty, "QTY:S"}	// chd_inpt_qty
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$wg_cd, "MA.MAUAL0010.LgOrMfgWg"},	// wg_cd
				{$par_itm_sub3, "MA.MAUAL0010.ItmSub3"},	// par_itm_sub3
				{$oper_cd, "MA.MAUAL0010.Oper"},	// oper_cd
				{$chd_itm_sub3, "MA.MAUAL0010.ItmSub3"}	// chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$par_itm_sub3, "MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM;par_itm_cd;par_itm_sub1;par_itm_sub2;true;true"},	// par_itm_sub3
				{$chd_itm_sub3, "MAC_ITM_IS_SRCH_TYP.COMM;chd_itm_cd;chd_itm_sub1;chd_itm_sub2;true;true"}	// chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "mode_nullval_flg"},	// wg_cd
				{$par_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"},	// par_itm_sub3
				{$chd_itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$bom_key, "bom_key"}	// bom_key
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$alt_itm_typ, "MAC_ALT_ITM_TYP"},	// alt_itm_typ
				{$sno_typ1, "MAC_SNO_TYP"},	// sno_typ1
				{$sno_typ2, "MAC_SNO_TYP"},	// sno_typ2
				{$sno_typ3, "MAC_SNO_TYP"},	// sno_typ3
				{$sno_typ4, "MAC_SNO_TYP"},	// sno_typ4
				{$in_offst_typ, "MAC_OFFST_TYP"},	// in_offst_typ
				{$bkf_typ, "MAC_BKF_TYP"},	// bkf_typ
				{$alloc_ctl_typ, "MAC_ALLOC_CTL_TYP"},	// alloc_ctl_typ
				{$inpt_ctl_typ, "MAC_INPT_CTL_TYP"}	// inpt_ctl_typ
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$par_itm_sub3, "par_dec_place;par_sno1_mng_typ;par_sno2_mng_typ;par_sno3_mng_typ;par_sno4_mng_typ;par_asset_mng_typ"},	// par_itm_sub3
				{$chd_itm_sub3, "chd_stk_mng_typ;chd_asset_mng_typ;chd_dec_place;lot_mng_typ;sublot_mng_typ;chd_sno1_mng_typ;chd_sno2_mng_typ;chd_sno3_mng_typ;chd_sno4_mng_typ;ver_flg"}	// chd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$par_itm_sub3, "dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ"},	// par_itm_sub3
				{$chd_itm_sub3, "stk_mng_typ;asset_mng_typ;dec_place;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;ver_flg"}	// chd_itm_sub3
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
	protected Bom_UpdChk01_DtlR_MC_A(ConstMetaList<? extends Bom_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bom_UpdChk01_DtlR clone() {
		return (Bom_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bom_UpdChk01_DtlR createInstance() {
		return (Bom_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Bom_UpdChk01_DtlR getValues(String... names) {
		return (Bom_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 0, $par_dec_place);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 0, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 0, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 0, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 0, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 0, $par_dec_place, value);
	}


	/**
	 * Asset management type (parent) 資産管理区分（親）.<p>
	 *
	 */
	public String par_asset_mng_typ() {
		return getConstString(offset + 1, $par_asset_mng_typ);
	}

	/**
	 * Asset management type (parent) 資産管理区分（親）.<p>
	 *
	 */
	public void par_asset_mng_typ(String value) {
		setConstString(offset + 1, $par_asset_mng_typ, value);
	}


	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCNumber chd_dec_place() {
		return getConstNumber(offset + 2, $chd_dec_place);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(MCNumber value) {
		setConstNumber(offset + 2, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(int value) {
		setConstNumber(offset + 2, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(long value) {
		setConstNumber(offset + 2, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(float value) {
		setConstNumber(offset + 2, $chd_dec_place, value);
	}

	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public void chd_dec_place(double value) {
		setConstNumber(offset + 2, $chd_dec_place, value);
	}


	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public String chd_stk_mng_typ() {
		return getConstString(offset + 3, $chd_stk_mng_typ);
	}

	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public void chd_stk_mng_typ(String value) {
		setConstString(offset + 3, $chd_stk_mng_typ, value);
	}


	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public String chd_asset_mng_typ() {
		return getConstString(offset + 4, $chd_asset_mng_typ);
	}

	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public void chd_asset_mng_typ(String value) {
		setConstString(offset + 4, $chd_asset_mng_typ, value);
	}


	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 5, $lot_mng_typ);
	}

	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 5, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 6, $sublot_mng_typ);
	}

	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 6, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public String par_sno1_mng_typ() {
		return getConstString(offset + 7, $par_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public void par_sno1_mng_typ(String value) {
		setConstString(offset + 7, $par_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public String par_sno2_mng_typ() {
		return getConstString(offset + 8, $par_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public void par_sno2_mng_typ(String value) {
		setConstString(offset + 8, $par_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public String par_sno3_mng_typ() {
		return getConstString(offset + 9, $par_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public void par_sno3_mng_typ(String value) {
		setConstString(offset + 9, $par_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public String par_sno4_mng_typ() {
		return getConstString(offset + 10, $par_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public void par_sno4_mng_typ(String value) {
		setConstString(offset + 10, $par_sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public String chd_sno1_mng_typ() {
		return getConstString(offset + 11, $chd_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public void chd_sno1_mng_typ(String value) {
		setConstString(offset + 11, $chd_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public String chd_sno2_mng_typ() {
		return getConstString(offset + 12, $chd_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public void chd_sno2_mng_typ(String value) {
		setConstString(offset + 12, $chd_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public String chd_sno3_mng_typ() {
		return getConstString(offset + 13, $chd_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public void chd_sno3_mng_typ(String value) {
		setConstString(offset + 13, $chd_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public String chd_sno4_mng_typ() {
		return getConstString(offset + 14, $chd_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public void chd_sno4_mng_typ(String value) {
		setConstString(offset + 14, $chd_sno4_mng_typ, value);
	}


	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 15, $ver_flg);
	}

	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 15, $ver_flg, value);
	}


	public String getString(String name) {
		if ($par_asset_mng_typ.equalsIgnoreCase(name)) {
			return par_asset_mng_typ();
		}
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			return chd_stk_mng_typ();
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			return chd_asset_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($par_sno1_mng_typ.equalsIgnoreCase(name)) {
			return par_sno1_mng_typ();
		}
		if ($par_sno2_mng_typ.equalsIgnoreCase(name)) {
			return par_sno2_mng_typ();
		}
		if ($par_sno3_mng_typ.equalsIgnoreCase(name)) {
			return par_sno3_mng_typ();
		}
		if ($par_sno4_mng_typ.equalsIgnoreCase(name)) {
			return par_sno4_mng_typ();
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno1_mng_typ();
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno2_mng_typ();
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno3_mng_typ();
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno4_mng_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($par_asset_mng_typ.equalsIgnoreCase(name)) {
			return par_asset_mng_typ();
		}
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			return chd_stk_mng_typ();
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			return chd_asset_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($par_sno1_mng_typ.equalsIgnoreCase(name)) {
			return par_sno1_mng_typ();
		}
		if ($par_sno2_mng_typ.equalsIgnoreCase(name)) {
			return par_sno2_mng_typ();
		}
		if ($par_sno3_mng_typ.equalsIgnoreCase(name)) {
			return par_sno3_mng_typ();
		}
		if ($par_sno4_mng_typ.equalsIgnoreCase(name)) {
			return par_sno4_mng_typ();
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno1_mng_typ();
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno2_mng_typ();
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno3_mng_typ();
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return chd_sno4_mng_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			return chd_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($par_asset_mng_typ.equalsIgnoreCase(name)) {
			par_asset_mng_typ(value);
			return;
		}
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			chd_stk_mng_typ(value);
			return;
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			chd_asset_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($par_sno1_mng_typ.equalsIgnoreCase(name)) {
			par_sno1_mng_typ(value);
			return;
		}
		if ($par_sno2_mng_typ.equalsIgnoreCase(name)) {
			par_sno2_mng_typ(value);
			return;
		}
		if ($par_sno3_mng_typ.equalsIgnoreCase(name)) {
			par_sno3_mng_typ(value);
			return;
		}
		if ($par_sno4_mng_typ.equalsIgnoreCase(name)) {
			par_sno4_mng_typ(value);
			return;
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			chd_sno1_mng_typ(value);
			return;
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			chd_sno2_mng_typ(value);
			return;
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			chd_sno3_mng_typ(value);
			return;
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			chd_sno4_mng_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($par_asset_mng_typ.equalsIgnoreCase(name)) {
			par_asset_mng_typ(value);
			return;
		}
		if ($chd_stk_mng_typ.equalsIgnoreCase(name)) {
			chd_stk_mng_typ(value);
			return;
		}
		if ($chd_asset_mng_typ.equalsIgnoreCase(name)) {
			chd_asset_mng_typ(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($par_sno1_mng_typ.equalsIgnoreCase(name)) {
			par_sno1_mng_typ(value);
			return;
		}
		if ($par_sno2_mng_typ.equalsIgnoreCase(name)) {
			par_sno2_mng_typ(value);
			return;
		}
		if ($par_sno3_mng_typ.equalsIgnoreCase(name)) {
			par_sno3_mng_typ(value);
			return;
		}
		if ($par_sno4_mng_typ.equalsIgnoreCase(name)) {
			par_sno4_mng_typ(value);
			return;
		}
		if ($chd_sno1_mng_typ.equalsIgnoreCase(name)) {
			chd_sno1_mng_typ(value);
			return;
		}
		if ($chd_sno2_mng_typ.equalsIgnoreCase(name)) {
			chd_sno2_mng_typ(value);
			return;
		}
		if ($chd_sno3_mng_typ.equalsIgnoreCase(name)) {
			chd_sno3_mng_typ(value);
			return;
		}
		if ($chd_sno4_mng_typ.equalsIgnoreCase(name)) {
			chd_sno4_mng_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		if ($chd_dec_place.equalsIgnoreCase(name)) {
			chd_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

