package mcframe.serverMSBC.MSBCL0350;

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
 * ブロック"Srch01_MtrxRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_MtrxRsltR_MC_A extends MCConstRow {

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Production month 生産年月.<p>
	 *
	 */
	public static final String $prod_ym = "prod_ym";
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * MRP group name ＭＲＰグループ名.<p>
	 *
	 */
	public static final String $mps_grp_nm = "mps_grp_nm";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
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
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public static final String $proc_cd = "proc_cd";
	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public static final String $proc_nm = "proc_nm";
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
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public static final String $pre_qty = "pre_qty";
	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public static final String $rqmt_qty = "rqmt_qty";
	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public static final String $fix_rqmt_qty = "fix_rqmt_qty";
	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public static final String $no_fix_rqmt_qty = "no_fix_rqmt_qty";
	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public static final String $act_qty = "act_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * MPS item logical delete ＭＰＳ品目論理削除.<p>
	 *
	 */
	public static final String $mst_del_flg = "mst_del_flg";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta prod_ym_META = createCommonMeta($prod_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta mps_grp_nm_META = createCommonMeta($mps_grp_nm, mcframe.commonMA.meta.MA_META.MPS_GRP_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta proc_cd_META = createStringMeta($proc_cd, 20);
	public static final MCMeta proc_nm_META = createStringMeta($proc_nm, 100);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pre_qty_META = createCommonMeta($pre_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqmt_qty_META = createCommonMeta($rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fix_rqmt_qty_META = createCommonMeta($fix_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta no_fix_rqmt_qty_META = createCommonMeta($no_fix_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_qty_META = createCommonMeta($act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MLYRQST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MLYRQST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MLYRQST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MLYRQST_SUB_CHAR3);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mst_del_flg_META = createCommonMeta($mst_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_MtrxRsltR> constMetas = new ConstMetaList<Srch01_MtrxRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			prod_ym_META,
			mps_grp_cd_META,
			mps_grp_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			wg_cd_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			proc_cd_META,
			proc_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			qty_META,
			pre_qty_META,
			rqmt_qty_META,
			fix_rqmt_qty_META,
			no_fix_rqmt_qty_META,
			act_qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			upd_cntr_META,
			mst_del_flg_META
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
	protected Srch01_MtrxRsltR_MC_A(ConstMetaList<? extends Srch01_MtrxRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MtrxRsltR clone() {
		return (Srch01_MtrxRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MtrxRsltR createInstance() {
		return (Srch01_MtrxRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_MtrxRsltR getValues(String... names) {
		return (Srch01_MtrxRsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Production month 生産年月.<p>
	 *
	 */
	public MCDate prod_ym() {
		return getConstDate(offset + 1, $prod_ym);
	}

	/**
	 * Production month 生産年月.<p>
	 *
	 */
	public void prod_ym(MCDate value) {
		setConstDate(offset + 1, $prod_ym, value);
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 2, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 2, $mps_grp_cd, value);
	}


	/**
	 * MRP group name ＭＲＰグループ名.<p>
	 *
	 */
	public String mps_grp_nm() {
		return getConstString(offset + 3, $mps_grp_nm);
	}

	/**
	 * MRP group name ＭＲＰグループ名.<p>
	 *
	 */
	public void mps_grp_nm(String value) {
		setConstString(offset + 3, $mps_grp_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 4, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 4, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 5, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 5, $strg_loc_nm, value);
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 7, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 7, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 8, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 8, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 9, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 9, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 10, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 10, $sppl_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 11, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 11, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 12, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 12, $rqst_loc_nm, value);
	}


	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public String proc_cd() {
		return getConstString(offset + 13, $proc_cd);
	}

	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public void proc_cd(String value) {
		setConstString(offset + 13, $proc_cd, value);
	}


	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public String proc_nm() {
		return getConstString(offset + 14, $proc_nm);
	}

	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public void proc_nm(String value) {
		setConstString(offset + 14, $proc_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 15, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 15, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 16, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 16, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 17, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 17, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 18, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 18, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 19, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 19, $itm_nm, value);
	}


	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 20, $qty);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 20, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 20, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 20, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 20, $qty, value);
	}

	/**
	 * Plan qty. 計画数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 20, $qty, value);
	}


	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public MCNumber pre_qty() {
		return getConstNumber(offset + 21, $pre_qty);
	}

	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public void pre_qty(MCNumber value) {
		setConstNumber(offset + 21, $pre_qty, value);
	}

	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public void pre_qty(int value) {
		setConstNumber(offset + 21, $pre_qty, value);
	}

	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public void pre_qty(long value) {
		setConstNumber(offset + 21, $pre_qty, value);
	}

	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public void pre_qty(float value) {
		setConstNumber(offset + 21, $pre_qty, value);
	}

	/**
	 * Last planned qty. 前回計画数量.<p>
	 *
	 */
	public void pre_qty(double value) {
		setConstNumber(offset + 21, $pre_qty, value);
	}


	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public MCNumber rqmt_qty() {
		return getConstNumber(offset + 22, $rqmt_qty);
	}

	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public void rqmt_qty(MCNumber value) {
		setConstNumber(offset + 22, $rqmt_qty, value);
	}

	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public void rqmt_qty(int value) {
		setConstNumber(offset + 22, $rqmt_qty, value);
	}

	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public void rqmt_qty(long value) {
		setConstNumber(offset + 22, $rqmt_qty, value);
	}

	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public void rqmt_qty(float value) {
		setConstNumber(offset + 22, $rqmt_qty, value);
	}

	/**
	 * Daily production request qty. 日次生産依頼数量.<p>
	 *
	 */
	public void rqmt_qty(double value) {
		setConstNumber(offset + 22, $rqmt_qty, value);
	}


	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public MCNumber fix_rqmt_qty() {
		return getConstNumber(offset + 23, $fix_rqmt_qty);
	}

	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public void fix_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 23, $fix_rqmt_qty, value);
	}

	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public void fix_rqmt_qty(int value) {
		setConstNumber(offset + 23, $fix_rqmt_qty, value);
	}

	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public void fix_rqmt_qty(long value) {
		setConstNumber(offset + 23, $fix_rqmt_qty, value);
	}

	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public void fix_rqmt_qty(float value) {
		setConstNumber(offset + 23, $fix_rqmt_qty, value);
	}

	/**
	 * Firm daily production request qty. 確定日次生産依頼数量.<p>
	 *
	 */
	public void fix_rqmt_qty(double value) {
		setConstNumber(offset + 23, $fix_rqmt_qty, value);
	}


	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public MCNumber no_fix_rqmt_qty() {
		return getConstNumber(offset + 24, $no_fix_rqmt_qty);
	}

	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public void no_fix_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 24, $no_fix_rqmt_qty, value);
	}

	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public void no_fix_rqmt_qty(int value) {
		setConstNumber(offset + 24, $no_fix_rqmt_qty, value);
	}

	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public void no_fix_rqmt_qty(long value) {
		setConstNumber(offset + 24, $no_fix_rqmt_qty, value);
	}

	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public void no_fix_rqmt_qty(float value) {
		setConstNumber(offset + 24, $no_fix_rqmt_qty, value);
	}

	/**
	 * Unfirm daily production request qty. 未確定日次生産依頼数量.<p>
	 *
	 */
	public void no_fix_rqmt_qty(double value) {
		setConstNumber(offset + 24, $no_fix_rqmt_qty, value);
	}


	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public MCNumber act_qty() {
		return getConstNumber(offset + 25, $act_qty);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		setConstNumber(offset + 25, $act_qty, value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(int value) {
		setConstNumber(offset + 25, $act_qty, value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(long value) {
		setConstNumber(offset + 25, $act_qty, value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(float value) {
		setConstNumber(offset + 25, $act_qty, value);
	}

	/**
	 * Result qty. 実績数量.<p>
	 *
	 */
	public void act_qty(double value) {
		setConstNumber(offset + 25, $act_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 26, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 26, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 27, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 27, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 28, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 28, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 28, $dec_place, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 29, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 29, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 30, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 30, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 31, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 31, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 32, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 32, $sub_char3, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 33, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}


	/**
	 * MPS item logical delete ＭＰＳ品目論理削除.<p>
	 *
	 */
	public boolean mst_del_flg() {
		return getConstBoolean(offset + 34, $mst_del_flg);
	}

	/**
	 * MPS item logical delete ＭＰＳ品目論理削除.<p>
	 *
	 */
	public void mst_del_flg(boolean value) {
		setConstBoolean(offset + 34, $mst_del_flg, value);
	}


	public String getString(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			return proc_cd();
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			return proc_nm();
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			return pre_qty();
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			return rqmt_qty();
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			return fix_rqmt_qty();
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			return no_fix_rqmt_qty();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			return prod_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($mst_del_flg.equalsIgnoreCase(name)) {
			return mst_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			return mps_grp_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($proc_cd.equalsIgnoreCase(name)) {
			return proc_cd();
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			return proc_nm();
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			return pre_qty();
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			return rqmt_qty();
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			return fix_rqmt_qty();
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			return no_fix_rqmt_qty();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			return prod_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($mst_del_flg.equalsIgnoreCase(name)) {
			return mst_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($proc_cd.equalsIgnoreCase(name)) {
			proc_cd(value);
			return;
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			proc_nm(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			prod_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($mst_del_flg.equalsIgnoreCase(name)) {
			mst_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($mps_grp_nm.equalsIgnoreCase(name)) {
			mps_grp_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($proc_cd.equalsIgnoreCase(name)) {
			proc_cd(value);
			return;
		}
		if ($proc_nm.equalsIgnoreCase(name)) {
			proc_nm(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($rqmt_qty.equalsIgnoreCase(name)) {
			rqmt_qty(value);
			return;
		}
		if ($fix_rqmt_qty.equalsIgnoreCase(name)) {
			fix_rqmt_qty(value);
			return;
		}
		if ($no_fix_rqmt_qty.equalsIgnoreCase(name)) {
			no_fix_rqmt_qty(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($prod_ym.equalsIgnoreCase(name)) {
			prod_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($mst_del_flg.equalsIgnoreCase(name)) {
			mst_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

