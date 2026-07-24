package mcframe.clientMSBE.MSBEP2610;

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
	 * UPD,Create/Modify,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録・訂正する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * IO_L,GR/GI control (Location),1;IO_I,GR/GI control (Location item),2;TOR_M,Create logical inventory (Monthly),3;TOR_L,Create logical inventory (Location),4;TOR_I,Create logical inventory (Location item),5;FIX,Firm inventory,6 IO_L,入出庫制御（場所）,1;IO_I,入出庫制御（場所品目）,2;TOR_M,理論在庫作成（月次）,3;TOR_L,理論在庫作成（場所）,4;TOR_I,理論在庫作成（場所品目）,5;FIX,在庫確定,6.<p>
	 *
	 */
	public static final String $tgt = "tgt";
	/**
	 * Awaiting (Re-start) 棚卸開始待（再開待）.<p>
	 *
	 */
	public static final String $stktk_sts_wtg = "stktk_sts_wtg";
	/**
	 * Taking inventory count 棚卸中.<p>
	 *
	 */
	public static final String $stktk_sts_st = "stktk_sts_st";
	/**
	 * Inventory firmed 在庫確定済.<p>
	 *
	 */
	public static final String $stktk_sts_rfl = "stktk_sts_rfl";
	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public static final String $ctrl_tgt_dt = "ctrl_tgt_dt";
	/**
	 * Inventory count month 棚卸年月.<p>
	 *
	 */
	public static final String $stktk_ym = "stktk_ym";
	/**
	 * Control target period FROM 制御対象期間ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ctrl_tgt_dt_fr = "ctrl_tgt_dt_fr";
	/**
	 * Control target period TO 制御対象期間ＴＯ.<p>
	 *
	 */
	public static final String $ctrl_tgt_dt_to = "ctrl_tgt_dt_to";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
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
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	public static final String $itm_typ_p = "itm_typ_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public static final String $stktk_rpt_rmrks = "stktk_rpt_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $stktk_intr_rmrks = "stktk_intr_rmrks";
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
	 * Inventory count sheet unissued flg. 棚卸表未発行ＦＬＧ.<p>
	 *
	 */
	public static final String $not_invlist_flg = "not_invlist_flg";
	/**
	 * Inventory count sheet issued flg. 棚卸表発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $invlist_flg = "invlist_flg";
	/**
	 * Variance list unissued flg. 差異リスト未発行ＦＬＧ.<p>
	 *
	 */
	public static final String $not_difflist_flg = "not_difflist_flg";
	/**
	 * Variance list issued flg. 差異リスト発行済ＦＬＧ.<p>
	 *
	 */
	public static final String $difflist_flg = "difflist_flg";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta tgt_META = createStringMeta($tgt);
	public static final MCMeta stktk_sts_wtg_META = createCommonMeta($stktk_sts_wtg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_sts_st_META = createCommonMeta($stktk_sts_st, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stktk_sts_rfl_META = createCommonMeta($stktk_sts_rfl, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ctrl_tgt_dt_META = createCommonMeta($ctrl_tgt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta stktk_ym_META = createCommonMeta($stktk_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ctrl_tgt_dt_fr_META = createCommonMeta($ctrl_tgt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ctrl_tgt_dt_to_META = createCommonMeta($ctrl_tgt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta stktk_rpt_rmrks_META = createCommonMeta($stktk_rpt_rmrks, mcframe.commonMS.meta.MS_META.STKTK_RPT_RMRKS);
	public static final MCMeta stktk_intr_rmrks_META = createCommonMeta($stktk_intr_rmrks, mcframe.commonMS.meta.MS_META.STKTK_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STKTK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STKTK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STKTK_SUB_CHAR3);
	public static final MCMeta not_invlist_flg_META = createCommonMeta($not_invlist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta invlist_flg_META = createCommonMeta($invlist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_difflist_flg_META = createCommonMeta($not_difflist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta difflist_flg_META = createCommonMeta($difflist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			tgt_META,
			stktk_sts_wtg_META,
			stktk_sts_st_META,
			stktk_sts_rfl_META,
			ctrl_tgt_dt_META,
			stktk_ym_META,
			ctrl_tgt_dt_fr_META,
			ctrl_tgt_dt_to_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			loc_grp_cd_META,
			loc_grp_nm_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			itm_typ_p_META,
			itm_p_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			stktk_rpt_rmrks_META,
			stktk_intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			not_invlist_flg_META,
			invlist_flg_META,
			not_difflist_flg_META,
			difflist_flg_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10
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
				{$act_usr_cd, "usr_nm"},	// act_usr_cd
				{$act_dpt_cd, "dpt_nm"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.STKTK_TGT"},	// loc_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$act_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.SCE"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$act_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"}	// act_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$lg_grp_nm, "LG_GRP"},	// lg_grp_nm
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$loc_grp_nm, "LOC_GRP"},	// loc_grp_nm
				{$alloc_grp_cd, "ALLOC_GRP"},	// alloc_grp_cd
				{$alloc_grp_nm, "ALLOC_GRP"}	// alloc_grp_nm
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
	 * UPD,Create/Modify,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録・訂正する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * UPD,Create/Modify,1;DEL,Cancel,2;PRNT,Issue report,3;REF,View,4 UPD,登録・訂正する,1;DEL,取り消す,2;PRNT,帳票発行,3;REF,参照する,4.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * IO_L,GR/GI control (Location),1;IO_I,GR/GI control (Location item),2;TOR_M,Create logical inventory (Monthly),3;TOR_L,Create logical inventory (Location),4;TOR_I,Create logical inventory (Location item),5;FIX,Firm inventory,6 IO_L,入出庫制御（場所）,1;IO_I,入出庫制御（場所品目）,2;TOR_M,理論在庫作成（月次）,3;TOR_L,理論在庫作成（場所）,4;TOR_I,理論在庫作成（場所品目）,5;FIX,在庫確定,6.<p>
	 *
	 */
	public String tgt() {
		return getConstString(offset + 1, $tgt);
	}

	/**
	 * IO_L,GR/GI control (Location),1;IO_I,GR/GI control (Location item),2;TOR_M,Create logical inventory (Monthly),3;TOR_L,Create logical inventory (Location),4;TOR_I,Create logical inventory (Location item),5;FIX,Firm inventory,6 IO_L,入出庫制御（場所）,1;IO_I,入出庫制御（場所品目）,2;TOR_M,理論在庫作成（月次）,3;TOR_L,理論在庫作成（場所）,4;TOR_I,理論在庫作成（場所品目）,5;FIX,在庫確定,6.<p>
	 *
	 */
	public void tgt(String value) {
		setConstString(offset + 1, $tgt, value);
	}


	/**
	 * Awaiting (Re-start) 棚卸開始待（再開待）.<p>
	 *
	 */
	public boolean stktk_sts_wtg() {
		return getConstBoolean(offset + 2, $stktk_sts_wtg);
	}

	/**
	 * Awaiting (Re-start) 棚卸開始待（再開待）.<p>
	 *
	 */
	public void stktk_sts_wtg(boolean value) {
		setConstBoolean(offset + 2, $stktk_sts_wtg, value);
	}


	/**
	 * Taking inventory count 棚卸中.<p>
	 *
	 */
	public boolean stktk_sts_st() {
		return getConstBoolean(offset + 3, $stktk_sts_st);
	}

	/**
	 * Taking inventory count 棚卸中.<p>
	 *
	 */
	public void stktk_sts_st(boolean value) {
		setConstBoolean(offset + 3, $stktk_sts_st, value);
	}


	/**
	 * Inventory firmed 在庫確定済.<p>
	 *
	 */
	public boolean stktk_sts_rfl() {
		return getConstBoolean(offset + 4, $stktk_sts_rfl);
	}

	/**
	 * Inventory firmed 在庫確定済.<p>
	 *
	 */
	public void stktk_sts_rfl(boolean value) {
		setConstBoolean(offset + 4, $stktk_sts_rfl, value);
	}


	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public MCDate ctrl_tgt_dt() {
		return getConstDate(offset + 5, $ctrl_tgt_dt);
	}

	/**
	 * Control target date 制御対象日.<p>
	 *
	 */
	public void ctrl_tgt_dt(MCDate value) {
		setConstDate(offset + 5, $ctrl_tgt_dt, value);
	}


	/**
	 * Inventory count month 棚卸年月.<p>
	 *
	 */
	public MCDate stktk_ym() {
		return getConstDate(offset + 6, $stktk_ym);
	}

	/**
	 * Inventory count month 棚卸年月.<p>
	 *
	 */
	public void stktk_ym(MCDate value) {
		setConstDate(offset + 6, $stktk_ym, value);
	}


	/**
	 * Control target period FROM 制御対象期間ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ctrl_tgt_dt_fr() {
		return getConstDate(offset + 7, $ctrl_tgt_dt_fr);
	}

	/**
	 * Control target period FROM 制御対象期間ＦＲＯＭ.<p>
	 *
	 */
	public void ctrl_tgt_dt_fr(MCDate value) {
		setConstDate(offset + 7, $ctrl_tgt_dt_fr, value);
	}


	/**
	 * Control target period TO 制御対象期間ＴＯ.<p>
	 *
	 */
	public MCDate ctrl_tgt_dt_to() {
		return getConstDate(offset + 8, $ctrl_tgt_dt_to);
	}

	/**
	 * Control target period TO 制御対象期間ＴＯ.<p>
	 *
	 */
	public void ctrl_tgt_dt_to(MCDate value) {
		setConstDate(offset + 8, $ctrl_tgt_dt_to, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 9, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 9, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 10, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 10, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 11, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 11, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 12, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 12, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 14, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 14, $wg_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 15, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 15, $lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 16, $lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 16, $lg_grp_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 17, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 17, $loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 18, $loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 18, $loc_grp_nm, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 19, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 19, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 20, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 20, $alloc_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 21, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 21, $itm_typ_p, row);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 22, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 22, $itm_p, row);
	}


	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 23, $act_usr_cd);
	}

	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 23, $act_usr_cd, value);
	}


	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 24, $act_usr_nm);
	}

	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 24, $act_usr_nm, value);
	}


	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 25, $act_dpt_cd);
	}

	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 25, $act_dpt_cd, value);
	}


	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 26, $act_dpt_nm);
	}

	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 26, $act_dpt_nm, value);
	}


	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public String stktk_rpt_rmrks() {
		return getConstString(offset + 27, $stktk_rpt_rmrks);
	}

	/**
	 * Inventory count sheet remarks 棚卸表備考.<p>
	 *
	 */
	public void stktk_rpt_rmrks(String value) {
		setConstString(offset + 27, $stktk_rpt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String stktk_intr_rmrks() {
		return getConstString(offset + 28, $stktk_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void stktk_intr_rmrks(String value) {
		setConstString(offset + 28, $stktk_intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 29, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 29, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 30, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 30, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 31, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 31, $sub_char3, value);
	}


	/**
	 * Inventory count sheet unissued flg. 棚卸表未発行ＦＬＧ.<p>
	 *
	 */
	public boolean not_invlist_flg() {
		return getConstBoolean(offset + 32, $not_invlist_flg);
	}

	/**
	 * Inventory count sheet unissued flg. 棚卸表未発行ＦＬＧ.<p>
	 *
	 */
	public void not_invlist_flg(boolean value) {
		setConstBoolean(offset + 32, $not_invlist_flg, value);
	}


	/**
	 * Inventory count sheet issued flg. 棚卸表発行済ＦＬＧ.<p>
	 *
	 */
	public boolean invlist_flg() {
		return getConstBoolean(offset + 33, $invlist_flg);
	}

	/**
	 * Inventory count sheet issued flg. 棚卸表発行済ＦＬＧ.<p>
	 *
	 */
	public void invlist_flg(boolean value) {
		setConstBoolean(offset + 33, $invlist_flg, value);
	}


	/**
	 * Variance list unissued flg. 差異リスト未発行ＦＬＧ.<p>
	 *
	 */
	public boolean not_difflist_flg() {
		return getConstBoolean(offset + 34, $not_difflist_flg);
	}

	/**
	 * Variance list unissued flg. 差異リスト未発行ＦＬＧ.<p>
	 *
	 */
	public void not_difflist_flg(boolean value) {
		setConstBoolean(offset + 34, $not_difflist_flg, value);
	}


	/**
	 * Variance list issued flg. 差異リスト発行済ＦＬＧ.<p>
	 *
	 */
	public boolean difflist_flg() {
		return getConstBoolean(offset + 35, $difflist_flg);
	}

	/**
	 * Variance list issued flg. 差異リスト発行済ＦＬＧ.<p>
	 *
	 */
	public void difflist_flg(boolean value) {
		setConstBoolean(offset + 35, $difflist_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 36, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 36, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tgt.equalsIgnoreCase(name)) {
			return tgt();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			return stktk_intr_rmrks();
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
	public MCDate getDate(String name) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt();
		}
		if ($stktk_ym.equalsIgnoreCase(name)) {
			return stktk_ym();
		}
		if ($ctrl_tgt_dt_fr.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt_fr();
		}
		if ($ctrl_tgt_dt_to.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($stktk_sts_wtg.equalsIgnoreCase(name)) {
			return stktk_sts_wtg();
		}
		if ($stktk_sts_st.equalsIgnoreCase(name)) {
			return stktk_sts_st();
		}
		if ($stktk_sts_rfl.equalsIgnoreCase(name)) {
			return stktk_sts_rfl();
		}
		if ($not_invlist_flg.equalsIgnoreCase(name)) {
			return not_invlist_flg();
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			return invlist_flg();
		}
		if ($not_difflist_flg.equalsIgnoreCase(name)) {
			return not_difflist_flg();
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			return difflist_flg();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			return stktk_rpt_rmrks();
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			return stktk_intr_rmrks();
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
	public MCDate getDateNE(String name) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt();
		}
		if ($stktk_ym.equalsIgnoreCase(name)) {
			return stktk_ym();
		}
		if ($ctrl_tgt_dt_fr.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt_fr();
		}
		if ($ctrl_tgt_dt_to.equalsIgnoreCase(name)) {
			return ctrl_tgt_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($stktk_sts_wtg.equalsIgnoreCase(name)) {
			return stktk_sts_wtg();
		}
		if ($stktk_sts_st.equalsIgnoreCase(name)) {
			return stktk_sts_st();
		}
		if ($stktk_sts_rfl.equalsIgnoreCase(name)) {
			return stktk_sts_rfl();
		}
		if ($not_invlist_flg.equalsIgnoreCase(name)) {
			return not_invlist_flg();
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			return invlist_flg();
		}
		if ($not_difflist_flg.equalsIgnoreCase(name)) {
			return not_difflist_flg();
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			return difflist_flg();
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			stktk_intr_rmrks(value);
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
	public void setDate(String name, MCDate value) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			ctrl_tgt_dt(value);
			return;
		}
		if ($stktk_ym.equalsIgnoreCase(name)) {
			stktk_ym(value);
			return;
		}
		if ($ctrl_tgt_dt_fr.equalsIgnoreCase(name)) {
			ctrl_tgt_dt_fr(value);
			return;
		}
		if ($ctrl_tgt_dt_to.equalsIgnoreCase(name)) {
			ctrl_tgt_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($stktk_sts_wtg.equalsIgnoreCase(name)) {
			stktk_sts_wtg(value);
			return;
		}
		if ($stktk_sts_st.equalsIgnoreCase(name)) {
			stktk_sts_st(value);
			return;
		}
		if ($stktk_sts_rfl.equalsIgnoreCase(name)) {
			stktk_sts_rfl(value);
			return;
		}
		if ($not_invlist_flg.equalsIgnoreCase(name)) {
			not_invlist_flg(value);
			return;
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			invlist_flg(value);
			return;
		}
		if ($not_difflist_flg.equalsIgnoreCase(name)) {
			not_difflist_flg(value);
			return;
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			difflist_flg(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
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
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($stktk_rpt_rmrks.equalsIgnoreCase(name)) {
			stktk_rpt_rmrks(value);
			return;
		}
		if ($stktk_intr_rmrks.equalsIgnoreCase(name)) {
			stktk_intr_rmrks(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($ctrl_tgt_dt.equalsIgnoreCase(name)) {
			ctrl_tgt_dt(value);
			return;
		}
		if ($stktk_ym.equalsIgnoreCase(name)) {
			stktk_ym(value);
			return;
		}
		if ($ctrl_tgt_dt_fr.equalsIgnoreCase(name)) {
			ctrl_tgt_dt_fr(value);
			return;
		}
		if ($ctrl_tgt_dt_to.equalsIgnoreCase(name)) {
			ctrl_tgt_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($stktk_sts_wtg.equalsIgnoreCase(name)) {
			stktk_sts_wtg(value);
			return;
		}
		if ($stktk_sts_st.equalsIgnoreCase(name)) {
			stktk_sts_st(value);
			return;
		}
		if ($stktk_sts_rfl.equalsIgnoreCase(name)) {
			stktk_sts_rfl(value);
			return;
		}
		if ($not_invlist_flg.equalsIgnoreCase(name)) {
			not_invlist_flg(value);
			return;
		}
		if ($invlist_flg.equalsIgnoreCase(name)) {
			invlist_flg(value);
			return;
		}
		if ($not_difflist_flg.equalsIgnoreCase(name)) {
			not_difflist_flg(value);
			return;
		}
		if ($difflist_flg.equalsIgnoreCase(name)) {
			difflist_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
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

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

