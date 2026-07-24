package mcframe.serverMSBE.MSBEL0040;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * To inquire 照会対象.<p>
	 *
	 */
	public static final String $tgt = "tgt";
	/**
	 * Long LT order (GR) 先行手配（入庫）.<p>
	 *
	 */
	public static final String $gr_prcd = "gr_prcd";
	/**
	 * Unfirm (GR) 未確定（入庫）.<p>
	 *
	 */
	public static final String $gr_sts_opn_grp = "gr_sts_opn_grp";
	/**
	 * Save order (GR) オーダ保存（入庫）.<p>
	 *
	 */
	public static final String $gr_sts_ordsav_grp = "gr_sts_ordsav_grp";
	/**
	 * Request (GR) 依頼（入庫）.<p>
	 *
	 */
	public static final String $gr_sts_fix_grp = "gr_sts_fix_grp";
	/**
	 * Schedule (GR) 予定（入庫）.<p>
	 *
	 */
	public static final String $gr_sts_schd_grp = "gr_sts_schd_grp";
	/**
	 * Ordered (GR) 指図済（入庫）.<p>
	 *
	 */
	public static final String $gr_sts_ord_grp = "gr_sts_ord_grp";
	/**
	 * Result (GR) 実績（入庫）.<p>
	 *
	 */
	public static final String $gr_act = "gr_act";
	/**
	 * Long LT order (GI) 先行手配（出庫）.<p>
	 *
	 */
	public static final String $gi_prcd = "gi_prcd";
	/**
	 * Unfirm (GI) 未確定（出庫）.<p>
	 *
	 */
	public static final String $gi_sts_opn_grp = "gi_sts_opn_grp";
	/**
	 * Save order (GI) オーダ保存（出庫）.<p>
	 *
	 */
	public static final String $gi_sts_ordsav_grp = "gi_sts_ordsav_grp";
	/**
	 * Request (GI) 依頼（出庫）.<p>
	 *
	 */
	public static final String $gi_sts_fix_grp = "gi_sts_fix_grp";
	/**
	 * Schedule (GI) 予定（出庫）.<p>
	 *
	 */
	public static final String $gi_sts_schd_grp = "gi_sts_schd_grp";
	/**
	 * Ordered (GI) 指図済（出庫）.<p>
	 *
	 */
	public static final String $gi_sts_ord_grp = "gi_sts_ord_grp";
	/**
	 * Result (GI) 実績（出庫）.<p>
	 *
	 */
	public static final String $gi_act = "gi_act";
	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	/**
	 * Except expired lot 有効期限切れロット除く.<p>
	 *
	 */
	public static final String $except_invld_lot_flg = "except_invld_lot_flg";
	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public static final String $except_alloc_wait_flg = "except_alloc_wait_flg";
	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public static final String $alloc_gi_flg = "alloc_gi_flg";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta tgt_META = createCommonMeta($tgt, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta gr_prcd_META = createCommonMeta($gr_prcd, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_opn_grp_META = createCommonMeta($gr_sts_opn_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_ordsav_grp_META = createCommonMeta($gr_sts_ordsav_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_fix_grp_META = createCommonMeta($gr_sts_fix_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_schd_grp_META = createCommonMeta($gr_sts_schd_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_sts_ord_grp_META = createCommonMeta($gr_sts_ord_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_act_META = createCommonMeta($gr_act, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_prcd_META = createCommonMeta($gi_prcd, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_opn_grp_META = createCommonMeta($gi_sts_opn_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_ordsav_grp_META = createCommonMeta($gi_sts_ordsav_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_fix_grp_META = createCommonMeta($gi_sts_fix_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_schd_grp_META = createCommonMeta($gi_sts_schd_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_sts_ord_grp_META = createCommonMeta($gi_sts_ord_grp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_act_META = createCommonMeta($gi_act, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta except_invld_lot_flg_META = createCommonMeta($except_invld_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta except_alloc_wait_flg_META = createCommonMeta($except_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_gi_flg_META = createCommonMeta($alloc_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			tgt_META,
			gr_prcd_META,
			gr_sts_opn_grp_META,
			gr_sts_ordsav_grp_META,
			gr_sts_fix_grp_META,
			gr_sts_schd_grp_META,
			gr_sts_ord_grp_META,
			gr_act_META,
			gi_prcd_META,
			gi_sts_opn_grp_META,
			gi_sts_ordsav_grp_META,
			gi_sts_fix_grp_META,
			gi_sts_schd_grp_META,
			gi_sts_ord_grp_META,
			gi_act_META,
			dt_fr_META,
			dt_to_META,
			avl_schd_dt_META,
			except_invld_lot_flg_META,
			except_alloc_wait_flg_META,
			alloc_gi_flg_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			loc_cd_META,
			loc_nm_META,
			quality_typ_META,
			gd_cd_META,
			gd_nm_META,
			stk_id_typ_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * To inquire 照会対象.<p>
	 *
	 */
	public String tgt() {
		return getConstString(offset + 1, $tgt);
	}

	/**
	 * To inquire 照会対象.<p>
	 *
	 */
	public void tgt(String value) {
		setConstString(offset + 1, $tgt, value);
	}


	/**
	 * Long LT order (GR) 先行手配（入庫）.<p>
	 *
	 */
	public boolean gr_prcd() {
		return getConstBoolean(offset + 2, $gr_prcd);
	}

	/**
	 * Long LT order (GR) 先行手配（入庫）.<p>
	 *
	 */
	public void gr_prcd(boolean value) {
		setConstBoolean(offset + 2, $gr_prcd, value);
	}


	/**
	 * Unfirm (GR) 未確定（入庫）.<p>
	 *
	 */
	public boolean gr_sts_opn_grp() {
		return getConstBoolean(offset + 3, $gr_sts_opn_grp);
	}

	/**
	 * Unfirm (GR) 未確定（入庫）.<p>
	 *
	 */
	public void gr_sts_opn_grp(boolean value) {
		setConstBoolean(offset + 3, $gr_sts_opn_grp, value);
	}


	/**
	 * Save order (GR) オーダ保存（入庫）.<p>
	 *
	 */
	public boolean gr_sts_ordsav_grp() {
		return getConstBoolean(offset + 4, $gr_sts_ordsav_grp);
	}

	/**
	 * Save order (GR) オーダ保存（入庫）.<p>
	 *
	 */
	public void gr_sts_ordsav_grp(boolean value) {
		setConstBoolean(offset + 4, $gr_sts_ordsav_grp, value);
	}


	/**
	 * Request (GR) 依頼（入庫）.<p>
	 *
	 */
	public boolean gr_sts_fix_grp() {
		return getConstBoolean(offset + 5, $gr_sts_fix_grp);
	}

	/**
	 * Request (GR) 依頼（入庫）.<p>
	 *
	 */
	public void gr_sts_fix_grp(boolean value) {
		setConstBoolean(offset + 5, $gr_sts_fix_grp, value);
	}


	/**
	 * Schedule (GR) 予定（入庫）.<p>
	 *
	 */
	public boolean gr_sts_schd_grp() {
		return getConstBoolean(offset + 6, $gr_sts_schd_grp);
	}

	/**
	 * Schedule (GR) 予定（入庫）.<p>
	 *
	 */
	public void gr_sts_schd_grp(boolean value) {
		setConstBoolean(offset + 6, $gr_sts_schd_grp, value);
	}


	/**
	 * Ordered (GR) 指図済（入庫）.<p>
	 *
	 */
	public boolean gr_sts_ord_grp() {
		return getConstBoolean(offset + 7, $gr_sts_ord_grp);
	}

	/**
	 * Ordered (GR) 指図済（入庫）.<p>
	 *
	 */
	public void gr_sts_ord_grp(boolean value) {
		setConstBoolean(offset + 7, $gr_sts_ord_grp, value);
	}


	/**
	 * Result (GR) 実績（入庫）.<p>
	 *
	 */
	public boolean gr_act() {
		return getConstBoolean(offset + 8, $gr_act);
	}

	/**
	 * Result (GR) 実績（入庫）.<p>
	 *
	 */
	public void gr_act(boolean value) {
		setConstBoolean(offset + 8, $gr_act, value);
	}


	/**
	 * Long LT order (GI) 先行手配（出庫）.<p>
	 *
	 */
	public boolean gi_prcd() {
		return getConstBoolean(offset + 9, $gi_prcd);
	}

	/**
	 * Long LT order (GI) 先行手配（出庫）.<p>
	 *
	 */
	public void gi_prcd(boolean value) {
		setConstBoolean(offset + 9, $gi_prcd, value);
	}


	/**
	 * Unfirm (GI) 未確定（出庫）.<p>
	 *
	 */
	public boolean gi_sts_opn_grp() {
		return getConstBoolean(offset + 10, $gi_sts_opn_grp);
	}

	/**
	 * Unfirm (GI) 未確定（出庫）.<p>
	 *
	 */
	public void gi_sts_opn_grp(boolean value) {
		setConstBoolean(offset + 10, $gi_sts_opn_grp, value);
	}


	/**
	 * Save order (GI) オーダ保存（出庫）.<p>
	 *
	 */
	public boolean gi_sts_ordsav_grp() {
		return getConstBoolean(offset + 11, $gi_sts_ordsav_grp);
	}

	/**
	 * Save order (GI) オーダ保存（出庫）.<p>
	 *
	 */
	public void gi_sts_ordsav_grp(boolean value) {
		setConstBoolean(offset + 11, $gi_sts_ordsav_grp, value);
	}


	/**
	 * Request (GI) 依頼（出庫）.<p>
	 *
	 */
	public boolean gi_sts_fix_grp() {
		return getConstBoolean(offset + 12, $gi_sts_fix_grp);
	}

	/**
	 * Request (GI) 依頼（出庫）.<p>
	 *
	 */
	public void gi_sts_fix_grp(boolean value) {
		setConstBoolean(offset + 12, $gi_sts_fix_grp, value);
	}


	/**
	 * Schedule (GI) 予定（出庫）.<p>
	 *
	 */
	public boolean gi_sts_schd_grp() {
		return getConstBoolean(offset + 13, $gi_sts_schd_grp);
	}

	/**
	 * Schedule (GI) 予定（出庫）.<p>
	 *
	 */
	public void gi_sts_schd_grp(boolean value) {
		setConstBoolean(offset + 13, $gi_sts_schd_grp, value);
	}


	/**
	 * Ordered (GI) 指図済（出庫）.<p>
	 *
	 */
	public boolean gi_sts_ord_grp() {
		return getConstBoolean(offset + 14, $gi_sts_ord_grp);
	}

	/**
	 * Ordered (GI) 指図済（出庫）.<p>
	 *
	 */
	public void gi_sts_ord_grp(boolean value) {
		setConstBoolean(offset + 14, $gi_sts_ord_grp, value);
	}


	/**
	 * Result (GI) 実績（出庫）.<p>
	 *
	 */
	public boolean gi_act() {
		return getConstBoolean(offset + 15, $gi_act);
	}

	/**
	 * Result (GI) 実績（出庫）.<p>
	 *
	 */
	public void gi_act(boolean value) {
		setConstBoolean(offset + 15, $gi_act, value);
	}


	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 16, $dt_fr);
	}

	/**
	 * Period FROM 期間ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 16, $dt_fr, value);
	}


	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 17, $dt_to);
	}

	/**
	 * Period TO 期間ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 17, $dt_to, value);
	}


	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 18, $avl_schd_dt);
	}

	/**
	 * Scheduled date to use 使用予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 18, $avl_schd_dt, value);
	}


	/**
	 * Except expired lot 有効期限切れロット除く.<p>
	 *
	 */
	public boolean except_invld_lot_flg() {
		return getConstBoolean(offset + 19, $except_invld_lot_flg);
	}

	/**
	 * Except expired lot 有効期限切れロット除く.<p>
	 *
	 */
	public void except_invld_lot_flg(boolean value) {
		setConstBoolean(offset + 19, $except_invld_lot_flg, value);
	}


	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public boolean except_alloc_wait_flg() {
		return getConstBoolean(offset + 20, $except_alloc_wait_flg);
	}

	/**
	 * Except allocation pending 引当保留除く.<p>
	 *
	 */
	public void except_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 20, $except_alloc_wait_flg, value);
	}


	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public boolean alloc_gi_flg() {
		return getConstBoolean(offset + 21, $alloc_gi_flg);
	}

	/**
	 * Allocated input/GI schedule only 引当済の投入・出庫予定のみ.<p>
	 *
	 */
	public void alloc_gi_flg(boolean value) {
		setConstBoolean(offset + 21, $alloc_gi_flg, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 22, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 22, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 23, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 23, $lg_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 24, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 24, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 25, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 25, $alloc_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 26, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 26, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 27, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 27, $loc_grp_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 28, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 28, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 29, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 29, $loc_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 30, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 30, $quality_typ, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 31, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 31, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 32, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 32, $gd_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 33, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 33, $stk_id_typ, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 34, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 34, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 35, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 35, $pack_unit_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 36, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 36, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 37, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 37, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 38, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 38, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 39, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 39, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 40, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 40, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 41, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 41, $ver_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 42, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 42, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 43, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 43, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 44, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 44, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 45, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 45, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 46, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 46, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 47, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 47, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 48, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 48, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 49, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 49, $wrk_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tgt.equalsIgnoreCase(name)) {
			return tgt();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($gr_prcd.equalsIgnoreCase(name)) {
			return gr_prcd();
		}
		if ($gr_sts_opn_grp.equalsIgnoreCase(name)) {
			return gr_sts_opn_grp();
		}
		if ($gr_sts_ordsav_grp.equalsIgnoreCase(name)) {
			return gr_sts_ordsav_grp();
		}
		if ($gr_sts_fix_grp.equalsIgnoreCase(name)) {
			return gr_sts_fix_grp();
		}
		if ($gr_sts_schd_grp.equalsIgnoreCase(name)) {
			return gr_sts_schd_grp();
		}
		if ($gr_sts_ord_grp.equalsIgnoreCase(name)) {
			return gr_sts_ord_grp();
		}
		if ($gr_act.equalsIgnoreCase(name)) {
			return gr_act();
		}
		if ($gi_prcd.equalsIgnoreCase(name)) {
			return gi_prcd();
		}
		if ($gi_sts_opn_grp.equalsIgnoreCase(name)) {
			return gi_sts_opn_grp();
		}
		if ($gi_sts_ordsav_grp.equalsIgnoreCase(name)) {
			return gi_sts_ordsav_grp();
		}
		if ($gi_sts_fix_grp.equalsIgnoreCase(name)) {
			return gi_sts_fix_grp();
		}
		if ($gi_sts_schd_grp.equalsIgnoreCase(name)) {
			return gi_sts_schd_grp();
		}
		if ($gi_sts_ord_grp.equalsIgnoreCase(name)) {
			return gi_sts_ord_grp();
		}
		if ($gi_act.equalsIgnoreCase(name)) {
			return gi_act();
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			return except_invld_lot_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			return alloc_gi_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tgt.equalsIgnoreCase(name)) {
			return tgt();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($gr_prcd.equalsIgnoreCase(name)) {
			return gr_prcd();
		}
		if ($gr_sts_opn_grp.equalsIgnoreCase(name)) {
			return gr_sts_opn_grp();
		}
		if ($gr_sts_ordsav_grp.equalsIgnoreCase(name)) {
			return gr_sts_ordsav_grp();
		}
		if ($gr_sts_fix_grp.equalsIgnoreCase(name)) {
			return gr_sts_fix_grp();
		}
		if ($gr_sts_schd_grp.equalsIgnoreCase(name)) {
			return gr_sts_schd_grp();
		}
		if ($gr_sts_ord_grp.equalsIgnoreCase(name)) {
			return gr_sts_ord_grp();
		}
		if ($gr_act.equalsIgnoreCase(name)) {
			return gr_act();
		}
		if ($gi_prcd.equalsIgnoreCase(name)) {
			return gi_prcd();
		}
		if ($gi_sts_opn_grp.equalsIgnoreCase(name)) {
			return gi_sts_opn_grp();
		}
		if ($gi_sts_ordsav_grp.equalsIgnoreCase(name)) {
			return gi_sts_ordsav_grp();
		}
		if ($gi_sts_fix_grp.equalsIgnoreCase(name)) {
			return gi_sts_fix_grp();
		}
		if ($gi_sts_schd_grp.equalsIgnoreCase(name)) {
			return gi_sts_schd_grp();
		}
		if ($gi_sts_ord_grp.equalsIgnoreCase(name)) {
			return gi_sts_ord_grp();
		}
		if ($gi_act.equalsIgnoreCase(name)) {
			return gi_act();
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			return except_invld_lot_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			return alloc_gi_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tgt.equalsIgnoreCase(name)) {
			tgt(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($gr_prcd.equalsIgnoreCase(name)) {
			gr_prcd(value);
			return;
		}
		if ($gr_sts_opn_grp.equalsIgnoreCase(name)) {
			gr_sts_opn_grp(value);
			return;
		}
		if ($gr_sts_ordsav_grp.equalsIgnoreCase(name)) {
			gr_sts_ordsav_grp(value);
			return;
		}
		if ($gr_sts_fix_grp.equalsIgnoreCase(name)) {
			gr_sts_fix_grp(value);
			return;
		}
		if ($gr_sts_schd_grp.equalsIgnoreCase(name)) {
			gr_sts_schd_grp(value);
			return;
		}
		if ($gr_sts_ord_grp.equalsIgnoreCase(name)) {
			gr_sts_ord_grp(value);
			return;
		}
		if ($gr_act.equalsIgnoreCase(name)) {
			gr_act(value);
			return;
		}
		if ($gi_prcd.equalsIgnoreCase(name)) {
			gi_prcd(value);
			return;
		}
		if ($gi_sts_opn_grp.equalsIgnoreCase(name)) {
			gi_sts_opn_grp(value);
			return;
		}
		if ($gi_sts_ordsav_grp.equalsIgnoreCase(name)) {
			gi_sts_ordsav_grp(value);
			return;
		}
		if ($gi_sts_fix_grp.equalsIgnoreCase(name)) {
			gi_sts_fix_grp(value);
			return;
		}
		if ($gi_sts_schd_grp.equalsIgnoreCase(name)) {
			gi_sts_schd_grp(value);
			return;
		}
		if ($gi_sts_ord_grp.equalsIgnoreCase(name)) {
			gi_sts_ord_grp(value);
			return;
		}
		if ($gi_act.equalsIgnoreCase(name)) {
			gi_act(value);
			return;
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			except_invld_lot_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			alloc_gi_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tgt.equalsIgnoreCase(name)) {
			tgt(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($gr_prcd.equalsIgnoreCase(name)) {
			gr_prcd(value);
			return;
		}
		if ($gr_sts_opn_grp.equalsIgnoreCase(name)) {
			gr_sts_opn_grp(value);
			return;
		}
		if ($gr_sts_ordsav_grp.equalsIgnoreCase(name)) {
			gr_sts_ordsav_grp(value);
			return;
		}
		if ($gr_sts_fix_grp.equalsIgnoreCase(name)) {
			gr_sts_fix_grp(value);
			return;
		}
		if ($gr_sts_schd_grp.equalsIgnoreCase(name)) {
			gr_sts_schd_grp(value);
			return;
		}
		if ($gr_sts_ord_grp.equalsIgnoreCase(name)) {
			gr_sts_ord_grp(value);
			return;
		}
		if ($gr_act.equalsIgnoreCase(name)) {
			gr_act(value);
			return;
		}
		if ($gi_prcd.equalsIgnoreCase(name)) {
			gi_prcd(value);
			return;
		}
		if ($gi_sts_opn_grp.equalsIgnoreCase(name)) {
			gi_sts_opn_grp(value);
			return;
		}
		if ($gi_sts_ordsav_grp.equalsIgnoreCase(name)) {
			gi_sts_ordsav_grp(value);
			return;
		}
		if ($gi_sts_fix_grp.equalsIgnoreCase(name)) {
			gi_sts_fix_grp(value);
			return;
		}
		if ($gi_sts_schd_grp.equalsIgnoreCase(name)) {
			gi_sts_schd_grp(value);
			return;
		}
		if ($gi_sts_ord_grp.equalsIgnoreCase(name)) {
			gi_sts_ord_grp(value);
			return;
		}
		if ($gi_act.equalsIgnoreCase(name)) {
			gi_act(value);
			return;
		}
		if ($except_invld_lot_flg.equalsIgnoreCase(name)) {
			except_invld_lot_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($alloc_gi_flg.equalsIgnoreCase(name)) {
			alloc_gi_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

