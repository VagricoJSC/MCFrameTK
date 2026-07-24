package mcframe.serverMSBC.MSBCL0050;

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
 * ブロック"Chk02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public static final String $mrp_typ = "mrp_typ";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	public static final String $ord = "ord";
	/**
	 * Storage location distribution group 格納場所物流グループ.<p>
	 *
	 */
	public static final String $strg_lg_grp_cd = "strg_lg_grp_cd";
	/**
	 * Storage location supplier 格納場所発注先.<p>
	 *
	 */
	public static final String $strg_sppl_cd = "strg_sppl_cd";
	/**
	 * Requested location distribution group 依頼先場所物流グループ.<p>
	 *
	 */
	public static final String $rqst_to_lg_grp_cd = "rqst_to_lg_grp_cd";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";

	public static final String $itm_ord_no = $ord + ".itm_ord_no";
	public static final String $itm_ord_typ = $ord + ".itm_ord_typ";
	public static final String $ord_gnrt_typ = $ord + ".ord_gnrt_typ";
	public static final String $itm_cd = $ord + ".itm_cd";
	public static final String $itm_sub1 = $ord + ".itm_sub1";
	public static final String $itm_sub2 = $ord + ".itm_sub2";
	public static final String $itm_sub3 = $ord + ".itm_sub3";
	public static final String $ver_no = $ord + ".ver_no";
	public static final String $strg_loc_cd = $ord + ".strg_loc_cd";
	public static final String $mfg_loc_cd = $ord + ".mfg_loc_cd";
	public static final String $sppl_cd = $ord + ".sppl_cd";
	public static final String $maker_cd = $ord + ".maker_cd";
	public static final String $rqst_loc_cd = $ord + ".rqst_loc_cd";
	public static final String $rqst_wg_cd = $ord + ".rqst_wg_cd";
	public static final String $bom_ptn = $ord + ".bom_ptn";
	public static final String $oper_ptn = $ord + ".oper_ptn";
	public static final String $inst_qty = $ord + ".inst_qty";
	public static final String $yield_schd_qty = $ord + ".yield_schd_qty";
	public static final String $nmr_qty = $ord + ".nmr_qty";
	public static final String $dnm_qty = $ord + ".dnm_qty";
	public static final String $fxd_yield_qty = $ord + ".fxd_yield_qty";
	public static final String $itm_ord_sts_typ = $ord + ".itm_ord_sts_typ";
	public static final String $po_schd_dt = $ord + ".po_schd_dt";
	public static final String $purc_lt = $ord + ".purc_lt";
	public static final String $mfg_st_schd_dt = $ord + ".mfg_st_schd_dt";
	public static final String $mfg_end_schd_dt = $ord + ".mfg_end_schd_dt";
	public static final String $mfg_lt = $ord + ".mfg_lt";
	public static final String $gi_schd_dt = $ord + ".gi_schd_dt";
	public static final String $strg_schd_dt = $ord + ".strg_schd_dt";
	public static final String $xfr_lt = $ord + ".xfr_lt";
	public static final String $accpt_schd_dt = $ord + ".accpt_schd_dt";
	public static final String $accpt_insp_lt = $ord + ".accpt_insp_lt";
	public static final String $insp_st_schd_dt = $ord + ".insp_st_schd_dt";
	public static final String $insp_end_schd_dt = $ord + ".insp_end_schd_dt";
	public static final String $insp_lt = $ord + ".insp_lt";
	public static final String $insp_offst = $ord + ".insp_offst";
	public static final String $avl_schd_dt = $ord + ".avl_schd_dt";
	public static final String $master_dt = $ord + ".master_dt";
	public static final String $sno1 = $ord + ".sno1";
	public static final String $sno_typ1 = $ord + ".sno_typ1";
	public static final String $sno2 = $ord + ".sno2";
	public static final String $sno_typ2 = $ord + ".sno_typ2";
	public static final String $sno3 = $ord + ".sno3";
	public static final String $sno_typ3 = $ord + ".sno_typ3";
	public static final String $sno4 = $ord + ".sno4";
	public static final String $sno_typ4 = $ord + ".sno_typ4";
	public static final String $lmt_dt = $ord + ".lmt_dt";
	public static final String $wg_cd = $ord + ".wg_cd";
	public static final String $not_fix_flg = $ord + ".not_fix_flg";
	public static final String $ord_fix_pd = $ord + ".ord_fix_pd";
	public static final String $rqmt_no = $ord + ".rqmt_no";
	public static final String $inst_po_cnt_rmrks = $ord + ".inst_po_cnt_rmrks";
	public static final String $sim_mrp_no = $ord + ".sim_mrp_no";
	public static final String $io_schd_pr_no = $ord + ".io_schd_pr_no";
	public static final String $intr_rmrks = $ord + ".intr_rmrks";
	public static final String $sub_char1 = $ord + ".sub_char1";
	public static final String $sub_char2 = $ord + ".sub_char2";
	public static final String $sub_char3 = $ord + ".sub_char3";
	public static final String $itm_order_upd_cntr = $ord + ".upd_cntr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta mrp_typ_META = createCommonMeta($mrp_typ, mcframe.commonMS.meta.MS_META.MRP_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta ord_META = createInnerRowMeta($ord, mcframe.serverMS.dbc.MST_ITM_ORDER_R.class);
	public static final MCMeta strg_lg_grp_cd_META = createCommonMeta($strg_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta strg_sppl_cd_META = createCommonMeta($strg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_to_lg_grp_cd_META = createCommonMeta($rqst_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);

	protected static final ConstMetaList<Chk02_DtlR> constMetas = new ConstMetaList<Chk02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			mrp_typ_META,
			data_crud_typ_META,
			ord_META,
			strg_lg_grp_cd_META,
			strg_sppl_cd_META,
			rqst_to_lg_grp_cd_META,
			unit_cd_META,
			lot_mng_typ_META,
			sublot_mng_typ_META
		},
		new String[][]{
			{
				"itm_ord_no",
				"itm_ord_typ",
				"ord_gnrt_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"strg_loc_cd",
				"mfg_loc_cd",
				"sppl_cd",
				"maker_cd",
				"rqst_loc_cd",
				"rqst_wg_cd",
				"bom_ptn",
				"oper_ptn",
				"inst_qty",
				"yield_schd_qty",
				"nmr_qty",
				"dnm_qty",
				"fxd_yield_qty",
				"itm_ord_sts_typ",
				"po_schd_dt",
				"purc_lt",
				"mfg_st_schd_dt",
				"mfg_end_schd_dt",
				"mfg_lt",
				"gi_schd_dt",
				"strg_schd_dt",
				"xfr_lt",
				"accpt_schd_dt",
				"accpt_insp_lt",
				"insp_st_schd_dt",
				"insp_end_schd_dt",
				"insp_lt",
				"insp_offst",
				"avl_schd_dt",
				"master_dt",
				"sno1",
				"sno_typ1",
				"sno2",
				"sno_typ2",
				"sno3",
				"sno_typ3",
				"sno4",
				"sno_typ4",
				"lmt_dt",
				"wg_cd",
				"not_fix_flg",
				"ord_fix_pd",
				"rqmt_no",
				"inst_po_cnt_rmrks",
				"sim_mrp_no",
				"io_schd_pr_no",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"itm_order_upd_cntr"
			},
			{
				$itm_ord_no,
				$itm_ord_typ,
				$ord_gnrt_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$strg_loc_cd,
				$mfg_loc_cd,
				$sppl_cd,
				$maker_cd,
				$rqst_loc_cd,
				$rqst_wg_cd,
				$bom_ptn,
				$oper_ptn,
				$inst_qty,
				$yield_schd_qty,
				$nmr_qty,
				$dnm_qty,
				$fxd_yield_qty,
				$itm_ord_sts_typ,
				$po_schd_dt,
				$purc_lt,
				$mfg_st_schd_dt,
				$mfg_end_schd_dt,
				$mfg_lt,
				$gi_schd_dt,
				$strg_schd_dt,
				$xfr_lt,
				$accpt_schd_dt,
				$accpt_insp_lt,
				$insp_st_schd_dt,
				$insp_end_schd_dt,
				$insp_lt,
				$insp_offst,
				$avl_schd_dt,
				$master_dt,
				$sno1,
				$sno_typ1,
				$sno2,
				$sno_typ2,
				$sno3,
				$sno_typ3,
				$sno4,
				$sno_typ4,
				$lmt_dt,
				$wg_cd,
				$not_fix_flg,
				$ord_fix_pd,
				$rqmt_no,
				$inst_po_cnt_rmrks,
				$sim_mrp_no,
				$io_schd_pr_no,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$itm_order_upd_cntr
			}
		}
	);

	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
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
	protected Chk02_DtlR_MC_A(ConstMetaList<? extends Chk02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR clone() {
		return (Chk02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR createInstance() {
		return (Chk02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_DtlR getValues(String... names) {
		return (Chk02_DtlR) super.getValues(names);
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
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public String mrp_typ() {
		return getConstString(offset + 3, $mrp_typ);
	}

	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public void mrp_typ(String value) {
		setConstString(offset + 3, $mrp_typ, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	public mcframe.serverMS.dbc.MST_ITM_ORDER_R ord(){
		return (mcframe.serverMS.dbc.MST_ITM_ORDER_R) getConstInnerRow(offset + 5, $ord);
	}
	
	public void ord(mcframe.serverMS.dbc.MST_ITM_ORDER_R row){
		setConstInnerRow(offset + 5, $ord, row);
	}


	/**
	 * Storage location distribution group 格納場所物流グループ.<p>
	 *
	 */
	public String strg_lg_grp_cd() {
		return getConstString(offset + 6, $strg_lg_grp_cd);
	}

	/**
	 * Storage location distribution group 格納場所物流グループ.<p>
	 *
	 */
	public void strg_lg_grp_cd(String value) {
		setConstString(offset + 6, $strg_lg_grp_cd, value);
	}


	/**
	 * Storage location supplier 格納場所発注先.<p>
	 *
	 */
	public String strg_sppl_cd() {
		return getConstString(offset + 7, $strg_sppl_cd);
	}

	/**
	 * Storage location supplier 格納場所発注先.<p>
	 *
	 */
	public void strg_sppl_cd(String value) {
		setConstString(offset + 7, $strg_sppl_cd, value);
	}


	/**
	 * Requested location distribution group 依頼先場所物流グループ.<p>
	 *
	 */
	public String rqst_to_lg_grp_cd() {
		return getConstString(offset + 8, $rqst_to_lg_grp_cd);
	}

	/**
	 * Requested location distribution group 依頼先場所物流グループ.<p>
	 *
	 */
	public void rqst_to_lg_grp_cd(String value) {
		setConstString(offset + 8, $rqst_to_lg_grp_cd, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 9, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 9, $unit_cd, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 10, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 10, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 11, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 11, $sublot_mng_typ, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ord.equalsIgnoreCase(name)) {
			return ord();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ord.equalsIgnoreCase(name)) {
			ord(
				((MCContainerMeta) ord_META).castInnerRow(mcframe.serverMS.dbc.MST_ITM_ORDER_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return ord().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		ord().itm_ord_no(value);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return ord().itm_ord_typ();
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		ord().itm_ord_typ(value);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return ord().ord_gnrt_typ();
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		ord().ord_gnrt_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ord().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ord().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ord().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ord().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ord().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ord().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ord().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ord().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ord().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ord().ver_no(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return ord().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		ord().strg_loc_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return ord().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		ord().mfg_loc_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return ord().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		ord().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return ord().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		ord().maker_cd(value);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return ord().rqst_loc_cd();
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		ord().rqst_loc_cd(value);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return ord().rqst_wg_cd();
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		ord().rqst_wg_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return ord().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		ord().bom_ptn(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return ord().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		ord().oper_ptn(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return ord().inst_qty();
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		ord().inst_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return ord().yield_schd_qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return ord().nmr_qty();
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(int value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(long value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(float value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(double value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return ord().dnm_qty();
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(int value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(long value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(float value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(double value) {
		ord().dnm_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return ord().fxd_yield_qty();
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return ord().itm_ord_sts_typ();
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		ord().itm_ord_sts_typ(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return ord().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		ord().po_schd_dt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return ord().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		ord().purc_lt(value);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return ord().mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		ord().mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return ord().mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		ord().mfg_end_schd_dt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return ord().mfg_lt();
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		ord().mfg_lt(value);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return ord().gi_schd_dt();
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		ord().gi_schd_dt(value);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return ord().strg_schd_dt();
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		ord().strg_schd_dt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return ord().xfr_lt();
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		ord().xfr_lt(value);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return ord().accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		ord().accpt_schd_dt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return ord().accpt_insp_lt();
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return ord().insp_st_schd_dt();
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		ord().insp_st_schd_dt(value);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return ord().insp_end_schd_dt();
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		ord().insp_end_schd_dt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return ord().insp_lt();
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return ord().insp_offst();
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		ord().insp_offst(value);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return ord().avl_schd_dt();
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		ord().avl_schd_dt(value);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return ord().master_dt();
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		ord().master_dt(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ord().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ord().sno1(value);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return ord().sno_typ1();
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		ord().sno_typ1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ord().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ord().sno2(value);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return ord().sno_typ2();
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		ord().sno_typ2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ord().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ord().sno3(value);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return ord().sno_typ3();
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		ord().sno_typ3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ord().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ord().sno4(value);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return ord().sno_typ4();
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		ord().sno_typ4(value);
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return ord().lmt_dt();
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		ord().lmt_dt(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ord().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ord().wg_cd(value);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return ord().not_fix_flg();
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		ord().not_fix_flg(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return ord().ord_fix_pd();
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return ord().rqmt_no();
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		ord().rqmt_no(value);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return ord().inst_po_cnt_rmrks();
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		ord().inst_po_cnt_rmrks(value);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return ord().sim_mrp_no();
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		ord().sim_mrp_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return ord().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		ord().io_schd_pr_no(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return ord().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		ord().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return ord().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		ord().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return ord().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		ord().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return ord().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		ord().sub_char3(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_order_upd_cntr() {
		return ord().upd_cntr();
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(MCNumber value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(int value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(long value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(float value) {
		ord().upd_cntr(value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_order_upd_cntr(double value) {
		ord().upd_cntr(value);
	}

}

