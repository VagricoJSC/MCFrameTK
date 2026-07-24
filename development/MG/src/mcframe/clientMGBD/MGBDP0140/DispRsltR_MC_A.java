package mcframe.clientMGBD.MGBDP0140;

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
 * ブロック"DispRslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DispRsltR_MC_A extends MCConstRow {

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
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $prsppl_cd = "prsppl_cd";
	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public static final String $prsppl_nm = "prsppl_nm";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
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
	public static final String $qty_p = "qty_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $ttl = "ttl";
	public static final String $qty_00_p = "qty_00_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_01 = "col_01";
	public static final String $qty_02_p = "qty_02_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_03 = "col_03";
	public static final String $qty_04_p = "qty_04_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_05 = "col_05";
	public static final String $qty_06_p = "qty_06_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_07 = "col_07";
	public static final String $qty_08_p = "qty_08_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_09 = "col_09";
	public static final String $qty_10_p = "qty_10_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_11 = "col_11";
	public static final String $qty_12_p = "qty_12_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_13 = "col_13";
	public static final String $qty_14_p = "qty_14_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_15 = "col_15";
	public static final String $qty_16_p = "qty_16_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_17 = "col_17";
	public static final String $qty_18_p = "qty_18_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_19 = "col_19";
	public static final String $qty_20_p = "qty_20_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_21 = "col_21";
	public static final String $qty_22_p = "qty_22_p";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $col_23 = "col_23";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $qty = $qty_p + ".qty";
	public static final String $col_00 = $qty_00_p + ".qty";
	public static final String $col_02 = $qty_02_p + ".qty";
	public static final String $col_04 = $qty_04_p + ".qty";
	public static final String $col_06 = $qty_06_p + ".qty";
	public static final String $col_08 = $qty_08_p + ".qty";
	public static final String $col_10 = $qty_10_p + ".qty";
	public static final String $col_12 = $qty_12_p + ".qty";
	public static final String $col_14 = $qty_14_p + ".qty";
	public static final String $col_16 = $qty_16_p + ".qty";
	public static final String $col_18 = $qty_18_p + ".qty";
	public static final String $col_20 = $qty_20_p + ".qty";
	public static final String $col_22 = $qty_22_p + ".qty";

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
	public static final MCMeta prsppl_cd_META = createCommonMeta($prsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prsppl_nm_META = createCommonMeta($prsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ttl_META = createCommonMeta($ttl, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_00_p_META = createInnerRowMeta($qty_00_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_01_META = createCommonMeta($col_01, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_02_p_META = createInnerRowMeta($qty_02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_03_META = createCommonMeta($col_03, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_04_p_META = createInnerRowMeta($qty_04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_05_META = createCommonMeta($col_05, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_06_p_META = createInnerRowMeta($qty_06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_07_META = createCommonMeta($col_07, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_08_p_META = createInnerRowMeta($qty_08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_09_META = createCommonMeta($col_09, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_10_p_META = createInnerRowMeta($qty_10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_11_META = createCommonMeta($col_11, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_12_p_META = createInnerRowMeta($qty_12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_13_META = createCommonMeta($col_13, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_14_p_META = createInnerRowMeta($qty_14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_15_META = createCommonMeta($col_15, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_16_p_META = createInnerRowMeta($qty_16_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_17_META = createCommonMeta($col_17, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_18_p_META = createInnerRowMeta($qty_18_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_19_META = createCommonMeta($col_19, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_20_p_META = createInnerRowMeta($qty_20_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_21_META = createCommonMeta($col_21, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_22_p_META = createInnerRowMeta($qty_22_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta col_23_META = createCommonMeta($col_23, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
			prsppl_cd_META,
			prsppl_nm_META,
			prov_typ_META,
			prov_typ_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			qty_p_META,
			ttl_META,
			qty_00_p_META,
			col_01_META,
			qty_02_p_META,
			col_03_META,
			qty_04_p_META,
			col_05_META,
			qty_06_p_META,
			col_07_META,
			qty_08_p_META,
			col_09_META,
			qty_10_p_META,
			col_11_META,
			qty_12_p_META,
			col_13_META,
			qty_14_p_META,
			col_15_META,
			qty_16_p_META,
			col_17_META,
			qty_18_p_META,
			col_19_META,
			qty_20_p_META,
			col_21_META,
			qty_22_p_META,
			col_23_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"qty",
				"col_00",
				"col_02",
				"col_04",
				"col_06",
				"col_08",
				"col_10",
				"col_12",
				"col_14",
				"col_16",
				"col_18",
				"col_20",
				"col_22"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$qty,
				$col_00,
				$col_02,
				$col_04,
				$col_06,
				$col_08,
				$col_10,
				$col_12,
				$col_14,
				$col_16,
				$col_18,
				$col_20,
				$col_22
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
				{$wg_cd, "Key"},	// wg_cd
				{$wg_nm, "Key"},	// wg_nm
				{$mng_dpt_cd, "Key"},	// mng_dpt_cd
				{$mng_dpt_nm, "Key"},	// mng_dpt_nm
				{$itm_p, "Key"},	// itm_p
				{$itm_typ, "Key"},	// itm_typ
				{$itm_typ_nm, "Key"},	// itm_typ_nm
				{$itm_typ_d_cd, "Key"},	// itm_typ_d_cd
				{$itm_typ_d_nm, "Key"},	// itm_typ_d_nm
				{$itm_jnl_cd, "Key"},	// itm_jnl_cd
				{$itm_jnl_nm, "Key"},	// itm_jnl_nm
				{$lot_no, "Key"},	// lot_no
				{$sublot_no, "Key"},	// sublot_no
				{$sno1, "Key"},	// sno1
				{$sno2, "Key"},	// sno2
				{$sno3, "Key"},	// sno3
				{$sno4, "Key"},	// sno4
				{$prsppl_cd, "Key"},	// prsppl_cd
				{$prsppl_nm, "Key"},	// prsppl_nm
				{$prov_typ, "Key"},	// prov_typ
				{$prov_typ_nm, "Key"},	// prov_typ_nm
				{$unit_cd, "Key"},	// unit_cd
				{$unit_nm, "Key"}	// unit_nm
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$mng_dpt_cd, "mng_dpt_flg"},	// mng_dpt_cd
				{$mng_dpt_nm, "mng_dpt_flg"},	// mng_dpt_nm
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"},	// sno4
				{$prsppl_cd, "prsppl_flg"},	// prsppl_cd
				{$prsppl_nm, "prsppl_flg"},	// prsppl_nm
				{$prov_typ, "prov_flg"},	// prov_typ
				{$prov_typ_nm, "prov_flg"}	// prov_typ_nm
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
				{$ttl, "Key"},	// ttl
				{$col_01, "Key"},	// col_01
				{$col_03, "Key"},	// col_03
				{$col_05, "Key"},	// col_05
				{$col_07, "Key"},	// col_07
				{$col_09, "Key"},	// col_09
				{$col_11, "Key"},	// col_11
				{$col_13, "Key"},	// col_13
				{$col_15, "Key"},	// col_15
				{$col_17, "Key"},	// col_17
				{$col_19, "Key"},	// col_19
				{$col_21, "Key"},	// col_21
				{$col_23, "Key"}	// col_23
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$qty_00_p + ".qty", "Key"},	// qty_00_p.qty
				{$col_01, "Key"},	// col_01
				{$qty_02_p + ".qty", "Key"},	// qty_02_p.qty
				{$col_03, "Key"},	// col_03
				{$qty_04_p + ".qty", "Key"},	// qty_04_p.qty
				{$col_05, "Key"},	// col_05
				{$qty_06_p + ".qty", "Key"},	// qty_06_p.qty
				{$col_07, "Key"},	// col_07
				{$qty_08_p + ".qty", "Key"},	// qty_08_p.qty
				{$col_09, "Key"},	// col_09
				{$qty_10_p + ".qty", "Key"},	// qty_10_p.qty
				{$col_11, "Key"},	// col_11
				{$qty_12_p + ".qty", "Key"},	// qty_12_p.qty
				{$col_13, "Key"},	// col_13
				{$qty_14_p + ".qty", "Key"},	// qty_14_p.qty
				{$col_15, "Key"},	// col_15
				{$qty_16_p + ".qty", "Key"},	// qty_16_p.qty
				{$col_17, "Key"},	// col_17
				{$qty_18_p + ".qty", "Key"},	// qty_18_p.qty
				{$col_19, "Key"},	// col_19
				{$qty_20_p + ".qty", "Key"},	// qty_20_p.qty
				{$col_21, "Key"},	// col_21
				{$qty_22_p + ".qty", "Key"},	// qty_22_p.qty
				{$col_23, "Key"}	// col_23
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
	protected DispRsltR_MC_A(ConstMetaList<? extends DispRsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR clone() {
		return (DispRsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR createInstance() {
		return (DispRsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DispRsltR getValues(String... names) {
		return (DispRsltR) super.getValues(names);
	}



	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 1, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 1, $wg_nm, value);
	}


	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 2, $mng_dpt_cd);
	}

	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 2, $mng_dpt_cd, value);
	}


	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public String mng_dpt_nm() {
		return getConstString(offset + 3, $mng_dpt_nm);
	}

	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public void mng_dpt_nm(String value) {
		setConstString(offset + 3, $mng_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 5, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 5, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 6, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 6, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 7, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 7, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 8, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 8, $itm_typ_d_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 9, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 9, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 10, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 10, $itm_jnl_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 11, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 11, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 12, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 12, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 13, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 13, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 14, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 14, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 15, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 15, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 16, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 16, $sno4, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String prsppl_cd() {
		return getConstString(offset + 17, $prsppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void prsppl_cd(String value) {
		setConstString(offset + 17, $prsppl_cd, value);
	}


	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public String prsppl_nm() {
		return getConstString(offset + 18, $prsppl_nm);
	}

	/**
	 * Subcontractor name 支給先名.<p>
	 *
	 */
	public void prsppl_nm(String value) {
		setConstString(offset + 18, $prsppl_nm, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 19, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 19, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 20, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 20, $prov_typ_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 21, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 21, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 22, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 22, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 23, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 23, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 23, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $qty_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber ttl() {
		return getConstNumber(offset + 25, $ttl);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		setConstNumber(offset + 25, $ttl, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ttl(int value) {
		setConstNumber(offset + 25, $ttl, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ttl(long value) {
		setConstNumber(offset + 25, $ttl, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ttl(float value) {
		setConstNumber(offset + 25, $ttl, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void ttl(double value) {
		setConstNumber(offset + 25, $ttl, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_00_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $qty_00_p);
	}
	
	public void qty_00_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $qty_00_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_01() {
		return getConstNumber(offset + 27, $col_01);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_01(MCNumber value) {
		setConstNumber(offset + 27, $col_01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_01(int value) {
		setConstNumber(offset + 27, $col_01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_01(long value) {
		setConstNumber(offset + 27, $col_01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_01(float value) {
		setConstNumber(offset + 27, $col_01, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_01(double value) {
		setConstNumber(offset + 27, $col_01, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $qty_02_p);
	}
	
	public void qty_02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $qty_02_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_03() {
		return getConstNumber(offset + 29, $col_03);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_03(MCNumber value) {
		setConstNumber(offset + 29, $col_03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_03(int value) {
		setConstNumber(offset + 29, $col_03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_03(long value) {
		setConstNumber(offset + 29, $col_03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_03(float value) {
		setConstNumber(offset + 29, $col_03, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_03(double value) {
		setConstNumber(offset + 29, $col_03, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $qty_04_p);
	}
	
	public void qty_04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $qty_04_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_05() {
		return getConstNumber(offset + 31, $col_05);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_05(MCNumber value) {
		setConstNumber(offset + 31, $col_05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_05(int value) {
		setConstNumber(offset + 31, $col_05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_05(long value) {
		setConstNumber(offset + 31, $col_05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_05(float value) {
		setConstNumber(offset + 31, $col_05, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_05(double value) {
		setConstNumber(offset + 31, $col_05, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $qty_06_p);
	}
	
	public void qty_06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $qty_06_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_07() {
		return getConstNumber(offset + 33, $col_07);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_07(MCNumber value) {
		setConstNumber(offset + 33, $col_07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_07(int value) {
		setConstNumber(offset + 33, $col_07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_07(long value) {
		setConstNumber(offset + 33, $col_07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_07(float value) {
		setConstNumber(offset + 33, $col_07, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_07(double value) {
		setConstNumber(offset + 33, $col_07, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $qty_08_p);
	}
	
	public void qty_08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $qty_08_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_09() {
		return getConstNumber(offset + 35, $col_09);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_09(MCNumber value) {
		setConstNumber(offset + 35, $col_09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_09(int value) {
		setConstNumber(offset + 35, $col_09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_09(long value) {
		setConstNumber(offset + 35, $col_09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_09(float value) {
		setConstNumber(offset + 35, $col_09, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_09(double value) {
		setConstNumber(offset + 35, $col_09, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $qty_10_p);
	}
	
	public void qty_10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $qty_10_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_11() {
		return getConstNumber(offset + 37, $col_11);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_11(MCNumber value) {
		setConstNumber(offset + 37, $col_11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_11(int value) {
		setConstNumber(offset + 37, $col_11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_11(long value) {
		setConstNumber(offset + 37, $col_11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_11(float value) {
		setConstNumber(offset + 37, $col_11, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_11(double value) {
		setConstNumber(offset + 37, $col_11, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $qty_12_p);
	}
	
	public void qty_12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $qty_12_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_13() {
		return getConstNumber(offset + 39, $col_13);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_13(MCNumber value) {
		setConstNumber(offset + 39, $col_13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_13(int value) {
		setConstNumber(offset + 39, $col_13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_13(long value) {
		setConstNumber(offset + 39, $col_13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_13(float value) {
		setConstNumber(offset + 39, $col_13, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_13(double value) {
		setConstNumber(offset + 39, $col_13, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $qty_14_p);
	}
	
	public void qty_14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $qty_14_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_15() {
		return getConstNumber(offset + 41, $col_15);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_15(MCNumber value) {
		setConstNumber(offset + 41, $col_15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_15(int value) {
		setConstNumber(offset + 41, $col_15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_15(long value) {
		setConstNumber(offset + 41, $col_15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_15(float value) {
		setConstNumber(offset + 41, $col_15, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_15(double value) {
		setConstNumber(offset + 41, $col_15, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $qty_16_p);
	}
	
	public void qty_16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $qty_16_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_17() {
		return getConstNumber(offset + 43, $col_17);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_17(MCNumber value) {
		setConstNumber(offset + 43, $col_17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_17(int value) {
		setConstNumber(offset + 43, $col_17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_17(long value) {
		setConstNumber(offset + 43, $col_17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_17(float value) {
		setConstNumber(offset + 43, $col_17, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_17(double value) {
		setConstNumber(offset + 43, $col_17, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $qty_18_p);
	}
	
	public void qty_18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $qty_18_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_19() {
		return getConstNumber(offset + 45, $col_19);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_19(MCNumber value) {
		setConstNumber(offset + 45, $col_19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_19(int value) {
		setConstNumber(offset + 45, $col_19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_19(long value) {
		setConstNumber(offset + 45, $col_19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_19(float value) {
		setConstNumber(offset + 45, $col_19, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_19(double value) {
		setConstNumber(offset + 45, $col_19, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $qty_20_p);
	}
	
	public void qty_20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $qty_20_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_21() {
		return getConstNumber(offset + 47, $col_21);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_21(MCNumber value) {
		setConstNumber(offset + 47, $col_21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_21(int value) {
		setConstNumber(offset + 47, $col_21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_21(long value) {
		setConstNumber(offset + 47, $col_21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_21(float value) {
		setConstNumber(offset + 47, $col_21, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_21(double value) {
		setConstNumber(offset + 47, $col_21, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $qty_22_p);
	}
	
	public void qty_22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $qty_22_p, row);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber col_23() {
		return getConstNumber(offset + 49, $col_23);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_23(MCNumber value) {
		setConstNumber(offset + 49, $col_23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_23(int value) {
		setConstNumber(offset + 49, $col_23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_23(long value) {
		setConstNumber(offset + 49, $col_23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_23(float value) {
		setConstNumber(offset + 49, $col_23, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void col_23(double value) {
		setConstNumber(offset + 49, $col_23, value);
	}


	public String getString(String name) {
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
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
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($col_01.equalsIgnoreCase(name)) {
			return col_01();
		}
		if ($col_03.equalsIgnoreCase(name)) {
			return col_03();
		}
		if ($col_05.equalsIgnoreCase(name)) {
			return col_05();
		}
		if ($col_07.equalsIgnoreCase(name)) {
			return col_07();
		}
		if ($col_09.equalsIgnoreCase(name)) {
			return col_09();
		}
		if ($col_11.equalsIgnoreCase(name)) {
			return col_11();
		}
		if ($col_13.equalsIgnoreCase(name)) {
			return col_13();
		}
		if ($col_15.equalsIgnoreCase(name)) {
			return col_15();
		}
		if ($col_17.equalsIgnoreCase(name)) {
			return col_17();
		}
		if ($col_19.equalsIgnoreCase(name)) {
			return col_19();
		}
		if ($col_21.equalsIgnoreCase(name)) {
			return col_21();
		}
		if ($col_23.equalsIgnoreCase(name)) {
			return col_23();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			return prsppl_cd();
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			return prsppl_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
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
		if ($ttl.equalsIgnoreCase(name)) {
			return ttl();
		}
		if ($col_01.equalsIgnoreCase(name)) {
			return col_01();
		}
		if ($col_03.equalsIgnoreCase(name)) {
			return col_03();
		}
		if ($col_05.equalsIgnoreCase(name)) {
			return col_05();
		}
		if ($col_07.equalsIgnoreCase(name)) {
			return col_07();
		}
		if ($col_09.equalsIgnoreCase(name)) {
			return col_09();
		}
		if ($col_11.equalsIgnoreCase(name)) {
			return col_11();
		}
		if ($col_13.equalsIgnoreCase(name)) {
			return col_13();
		}
		if ($col_15.equalsIgnoreCase(name)) {
			return col_15();
		}
		if ($col_17.equalsIgnoreCase(name)) {
			return col_17();
		}
		if ($col_19.equalsIgnoreCase(name)) {
			return col_19();
		}
		if ($col_21.equalsIgnoreCase(name)) {
			return col_21();
		}
		if ($col_23.equalsIgnoreCase(name)) {
			return col_23();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($prsppl_cd.equalsIgnoreCase(name)) {
			prsppl_cd(value);
			return;
		}
		if ($prsppl_nm.equalsIgnoreCase(name)) {
			prsppl_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
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
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($ttl.equalsIgnoreCase(name)) {
			ttl(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($col_19.equalsIgnoreCase(name)) {
			col_19(value);
			return;
		}
		if ($col_21.equalsIgnoreCase(name)) {
			col_21(value);
			return;
		}
		if ($col_23.equalsIgnoreCase(name)) {
			col_23(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		if ($qty_00_p.equalsIgnoreCase(name)) {
			return qty_00_p();
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			return qty_02_p();
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			return qty_04_p();
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			return qty_06_p();
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			return qty_08_p();
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			return qty_10_p();
		}
		if ($qty_12_p.equalsIgnoreCase(name)) {
			return qty_12_p();
		}
		if ($qty_14_p.equalsIgnoreCase(name)) {
			return qty_14_p();
		}
		if ($qty_16_p.equalsIgnoreCase(name)) {
			return qty_16_p();
		}
		if ($qty_18_p.equalsIgnoreCase(name)) {
			return qty_18_p();
		}
		if ($qty_20_p.equalsIgnoreCase(name)) {
			return qty_20_p();
		}
		if ($qty_22_p.equalsIgnoreCase(name)) {
			return qty_22_p();
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
		if ($qty_00_p.equalsIgnoreCase(name)) {
			qty_00_p(
				((MCContainerMeta) qty_00_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			qty_02_p(
				((MCContainerMeta) qty_02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			qty_04_p(
				((MCContainerMeta) qty_04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			qty_06_p(
				((MCContainerMeta) qty_06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			qty_08_p(
				((MCContainerMeta) qty_08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			qty_10_p(
				((MCContainerMeta) qty_10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_12_p.equalsIgnoreCase(name)) {
			qty_12_p(
				((MCContainerMeta) qty_12_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_14_p.equalsIgnoreCase(name)) {
			qty_14_p(
				((MCContainerMeta) qty_14_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_16_p.equalsIgnoreCase(name)) {
			qty_16_p(
				((MCContainerMeta) qty_16_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_18_p.equalsIgnoreCase(name)) {
			qty_18_p(
				((MCContainerMeta) qty_18_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_20_p.equalsIgnoreCase(name)) {
			qty_20_p(
				((MCContainerMeta) qty_20_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_22_p.equalsIgnoreCase(name)) {
			qty_22_p(
				((MCContainerMeta) qty_22_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	public MCNumber col_00() {
		return qty_00_p().qty();
	}

	public void col_00(MCNumber value) {
		qty_00_p().qty(value);
	}

	public void col_00(int value) {
		qty_00_p().qty(value);
	}

	public void col_00(long value) {
		qty_00_p().qty(value);
	}

	public void col_00(float value) {
		qty_00_p().qty(value);
	}

	public void col_00(double value) {
		qty_00_p().qty(value);
	}

	public MCNumber col_02() {
		return qty_02_p().qty();
	}

	public void col_02(MCNumber value) {
		qty_02_p().qty(value);
	}

	public void col_02(int value) {
		qty_02_p().qty(value);
	}

	public void col_02(long value) {
		qty_02_p().qty(value);
	}

	public void col_02(float value) {
		qty_02_p().qty(value);
	}

	public void col_02(double value) {
		qty_02_p().qty(value);
	}

	public MCNumber col_04() {
		return qty_04_p().qty();
	}

	public void col_04(MCNumber value) {
		qty_04_p().qty(value);
	}

	public void col_04(int value) {
		qty_04_p().qty(value);
	}

	public void col_04(long value) {
		qty_04_p().qty(value);
	}

	public void col_04(float value) {
		qty_04_p().qty(value);
	}

	public void col_04(double value) {
		qty_04_p().qty(value);
	}

	public MCNumber col_06() {
		return qty_06_p().qty();
	}

	public void col_06(MCNumber value) {
		qty_06_p().qty(value);
	}

	public void col_06(int value) {
		qty_06_p().qty(value);
	}

	public void col_06(long value) {
		qty_06_p().qty(value);
	}

	public void col_06(float value) {
		qty_06_p().qty(value);
	}

	public void col_06(double value) {
		qty_06_p().qty(value);
	}

	public MCNumber col_08() {
		return qty_08_p().qty();
	}

	public void col_08(MCNumber value) {
		qty_08_p().qty(value);
	}

	public void col_08(int value) {
		qty_08_p().qty(value);
	}

	public void col_08(long value) {
		qty_08_p().qty(value);
	}

	public void col_08(float value) {
		qty_08_p().qty(value);
	}

	public void col_08(double value) {
		qty_08_p().qty(value);
	}

	public MCNumber col_10() {
		return qty_10_p().qty();
	}

	public void col_10(MCNumber value) {
		qty_10_p().qty(value);
	}

	public void col_10(int value) {
		qty_10_p().qty(value);
	}

	public void col_10(long value) {
		qty_10_p().qty(value);
	}

	public void col_10(float value) {
		qty_10_p().qty(value);
	}

	public void col_10(double value) {
		qty_10_p().qty(value);
	}

	public MCNumber col_12() {
		return qty_12_p().qty();
	}

	public void col_12(MCNumber value) {
		qty_12_p().qty(value);
	}

	public void col_12(int value) {
		qty_12_p().qty(value);
	}

	public void col_12(long value) {
		qty_12_p().qty(value);
	}

	public void col_12(float value) {
		qty_12_p().qty(value);
	}

	public void col_12(double value) {
		qty_12_p().qty(value);
	}

	public MCNumber col_14() {
		return qty_14_p().qty();
	}

	public void col_14(MCNumber value) {
		qty_14_p().qty(value);
	}

	public void col_14(int value) {
		qty_14_p().qty(value);
	}

	public void col_14(long value) {
		qty_14_p().qty(value);
	}

	public void col_14(float value) {
		qty_14_p().qty(value);
	}

	public void col_14(double value) {
		qty_14_p().qty(value);
	}

	public MCNumber col_16() {
		return qty_16_p().qty();
	}

	public void col_16(MCNumber value) {
		qty_16_p().qty(value);
	}

	public void col_16(int value) {
		qty_16_p().qty(value);
	}

	public void col_16(long value) {
		qty_16_p().qty(value);
	}

	public void col_16(float value) {
		qty_16_p().qty(value);
	}

	public void col_16(double value) {
		qty_16_p().qty(value);
	}

	public MCNumber col_18() {
		return qty_18_p().qty();
	}

	public void col_18(MCNumber value) {
		qty_18_p().qty(value);
	}

	public void col_18(int value) {
		qty_18_p().qty(value);
	}

	public void col_18(long value) {
		qty_18_p().qty(value);
	}

	public void col_18(float value) {
		qty_18_p().qty(value);
	}

	public void col_18(double value) {
		qty_18_p().qty(value);
	}

	public MCNumber col_20() {
		return qty_20_p().qty();
	}

	public void col_20(MCNumber value) {
		qty_20_p().qty(value);
	}

	public void col_20(int value) {
		qty_20_p().qty(value);
	}

	public void col_20(long value) {
		qty_20_p().qty(value);
	}

	public void col_20(float value) {
		qty_20_p().qty(value);
	}

	public void col_20(double value) {
		qty_20_p().qty(value);
	}

	public MCNumber col_22() {
		return qty_22_p().qty();
	}

	public void col_22(MCNumber value) {
		qty_22_p().qty(value);
	}

	public void col_22(int value) {
		qty_22_p().qty(value);
	}

	public void col_22(long value) {
		qty_22_p().qty(value);
	}

	public void col_22(float value) {
		qty_22_p().qty(value);
	}

	public void col_22(double value) {
		qty_22_p().qty(value);
	}

}

