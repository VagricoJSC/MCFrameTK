package mcframe.clientMSBE.MSBEP0040;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * ACCRUAL,Inventory accrual base,1;ACCPT,Asset accrual base,2;AVL,Available date base,3;ALLOC,Allocation status,4 ACCRUAL,在庫発生基準,1;ACCPT,資産発生基準,2;AVL,使用可能日基準,3;ALLOC,引当状況,4.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * LOC,Location allocation,1;GRS,Gross allocation,2 LOC,場所引当,1;GRS,総量引当,2.<p>
	 *
	 */
	public static final String $tgt = "tgt";
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public static final String $gr_prcd = "gr_prcd";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $gr_sts_opn_grp = "gr_sts_opn_grp";
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public static final String $gr_sts_ordsav_grp = "gr_sts_ordsav_grp";
	/**
	 * Request 依頼.<p>
	 *
	 */
	public static final String $gr_sts_fix_grp = "gr_sts_fix_grp";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $gr_sts_schd_grp = "gr_sts_schd_grp";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $gr_sts_ord_grp = "gr_sts_ord_grp";
	/**
	 * Result 実績.<p>
	 *
	 */
	public static final String $gr_act = "gr_act";
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public static final String $gi_prcd = "gi_prcd";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $gi_sts_opn_grp = "gi_sts_opn_grp";
	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public static final String $gi_sts_ordsav_grp = "gi_sts_ordsav_grp";
	/**
	 * Request 依頼.<p>
	 *
	 */
	public static final String $gi_sts_fix_grp = "gi_sts_fix_grp";
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public static final String $gi_sts_schd_grp = "gi_sts_schd_grp";
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public static final String $gi_sts_ord_grp = "gi_sts_ord_grp";
	/**
	 * Result 実績.<p>
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
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
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
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
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
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
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
	public static final String $sno_p = "sno_p";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";

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
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP0340.VerNoR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
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
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			itm_p_META,
			ver_no_p_META,
			lot_no_META,
			sublot_no_META,
			sno_p_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pack_unit_cd, "unit_nm"}	// pack_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"}	// sublot_no
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$lot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no
				{$sublot_no, "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"}	// sublot_no
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"},	// alloc_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * ACCRUAL,Inventory accrual base,1;ACCPT,Asset accrual base,2;AVL,Available date base,3;ALLOC,Allocation status,4 ACCRUAL,在庫発生基準,1;ACCPT,資産発生基準,2;AVL,使用可能日基準,3;ALLOC,引当状況,4.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * ACCRUAL,Inventory accrual base,1;ACCPT,Asset accrual base,2;AVL,Available date base,3;ALLOC,Allocation status,4 ACCRUAL,在庫発生基準,1;ACCPT,資産発生基準,2;AVL,使用可能日基準,3;ALLOC,引当状況,4.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * LOC,Location allocation,1;GRS,Gross allocation,2 LOC,場所引当,1;GRS,総量引当,2.<p>
	 *
	 */
	public String tgt() {
		return getConstString(offset + 1, $tgt);
	}

	/**
	 * LOC,Location allocation,1;GRS,Gross allocation,2 LOC,場所引当,1;GRS,総量引当,2.<p>
	 *
	 */
	public void tgt(String value) {
		setConstString(offset + 1, $tgt, value);
	}


	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public boolean gr_prcd() {
		return getConstBoolean(offset + 2, $gr_prcd);
	}

	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public void gr_prcd(boolean value) {
		setConstBoolean(offset + 2, $gr_prcd, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean gr_sts_opn_grp() {
		return getConstBoolean(offset + 3, $gr_sts_opn_grp);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void gr_sts_opn_grp(boolean value) {
		setConstBoolean(offset + 3, $gr_sts_opn_grp, value);
	}


	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public boolean gr_sts_ordsav_grp() {
		return getConstBoolean(offset + 4, $gr_sts_ordsav_grp);
	}

	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public void gr_sts_ordsav_grp(boolean value) {
		setConstBoolean(offset + 4, $gr_sts_ordsav_grp, value);
	}


	/**
	 * Request 依頼.<p>
	 *
	 */
	public boolean gr_sts_fix_grp() {
		return getConstBoolean(offset + 5, $gr_sts_fix_grp);
	}

	/**
	 * Request 依頼.<p>
	 *
	 */
	public void gr_sts_fix_grp(boolean value) {
		setConstBoolean(offset + 5, $gr_sts_fix_grp, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean gr_sts_schd_grp() {
		return getConstBoolean(offset + 6, $gr_sts_schd_grp);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void gr_sts_schd_grp(boolean value) {
		setConstBoolean(offset + 6, $gr_sts_schd_grp, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean gr_sts_ord_grp() {
		return getConstBoolean(offset + 7, $gr_sts_ord_grp);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void gr_sts_ord_grp(boolean value) {
		setConstBoolean(offset + 7, $gr_sts_ord_grp, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean gr_act() {
		return getConstBoolean(offset + 8, $gr_act);
	}

	/**
	 * Result 実績.<p>
	 *
	 */
	public void gr_act(boolean value) {
		setConstBoolean(offset + 8, $gr_act, value);
	}


	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public boolean gi_prcd() {
		return getConstBoolean(offset + 9, $gi_prcd);
	}

	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public void gi_prcd(boolean value) {
		setConstBoolean(offset + 9, $gi_prcd, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean gi_sts_opn_grp() {
		return getConstBoolean(offset + 10, $gi_sts_opn_grp);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void gi_sts_opn_grp(boolean value) {
		setConstBoolean(offset + 10, $gi_sts_opn_grp, value);
	}


	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public boolean gi_sts_ordsav_grp() {
		return getConstBoolean(offset + 11, $gi_sts_ordsav_grp);
	}

	/**
	 * Order save オーダ保存.<p>
	 *
	 */
	public void gi_sts_ordsav_grp(boolean value) {
		setConstBoolean(offset + 11, $gi_sts_ordsav_grp, value);
	}


	/**
	 * Request 依頼.<p>
	 *
	 */
	public boolean gi_sts_fix_grp() {
		return getConstBoolean(offset + 12, $gi_sts_fix_grp);
	}

	/**
	 * Request 依頼.<p>
	 *
	 */
	public void gi_sts_fix_grp(boolean value) {
		setConstBoolean(offset + 12, $gi_sts_fix_grp, value);
	}


	/**
	 * Schedule 予定.<p>
	 *
	 */
	public boolean gi_sts_schd_grp() {
		return getConstBoolean(offset + 13, $gi_sts_schd_grp);
	}

	/**
	 * Schedule 予定.<p>
	 *
	 */
	public void gi_sts_schd_grp(boolean value) {
		setConstBoolean(offset + 13, $gi_sts_schd_grp, value);
	}


	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public boolean gi_sts_ord_grp() {
		return getConstBoolean(offset + 14, $gi_sts_ord_grp);
	}

	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public void gi_sts_ord_grp(boolean value) {
		setConstBoolean(offset + 14, $gi_sts_ord_grp, value);
	}


	/**
	 * Result 実績.<p>
	 *
	 */
	public boolean gi_act() {
		return getConstBoolean(offset + 15, $gi_act);
	}

	/**
	 * Result 実績.<p>
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
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 31, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 31, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 32, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 32, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 33, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 33, $gd_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 34, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 34, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 35, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 35, $stk_id_typ_nm, value);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 36, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 36, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 37, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 37, $pack_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 38, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 38, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0340.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP0340.VerNoR) getConstInnerRow(offset + 39, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP0340.VerNoR row){
		setConstInnerRow(offset + 39, $ver_no_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 40, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 40, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 41, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 41, $sublot_no, value);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 42, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 42, $sno_p, row);
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
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
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
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
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

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0340.VerNoR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

}

