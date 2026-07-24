package mcframe.clientMGBA.MGBAP0140;

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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public static final String $ctg_cd = "ctg_cd";
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public static final String $ctg_nm = "ctg_nm";
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
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public static final String $wk_cost_unit_nm = "wk_cost_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public static final String $elm_no = "elm_no";
	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public static final String $elm = "elm";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $elm_nm = "elm_nm";
	public static final String $qty_00_p = "qty_00_p";
	public static final String $qty_01_p = "qty_01_p";
	public static final String $qty_02_p = "qty_02_p";
	public static final String $qty_03_p = "qty_03_p";
	public static final String $qty_04_p = "qty_04_p";
	public static final String $qty_05_p = "qty_05_p";
	public static final String $qty_06_p = "qty_06_p";
	public static final String $qty_07_p = "qty_07_p";
	public static final String $qty_08_p = "qty_08_p";
	public static final String $qty_09_p = "qty_09_p";
	public static final String $qty_10_p = "qty_10_p";
	public static final String $qty_11_p = "qty_11_p";
	public static final String $ttl_qty_p = "ttl_qty_p";

	public static final String $col_00 = $qty_00_p + ".wk_cost_qty";
	public static final String $col_01 = $qty_01_p + ".wk_cost_qty";
	public static final String $col_02 = $qty_02_p + ".wk_cost_qty";
	public static final String $col_03 = $qty_03_p + ".wk_cost_qty";
	public static final String $col_04 = $qty_04_p + ".wk_cost_qty";
	public static final String $col_05 = $qty_05_p + ".wk_cost_qty";
	public static final String $col_06 = $qty_06_p + ".wk_cost_qty";
	public static final String $col_07 = $qty_07_p + ".wk_cost_qty";
	public static final String $col_08 = $qty_08_p + ".wk_cost_qty";
	public static final String $col_09 = $qty_09_p + ".wk_cost_qty";
	public static final String $col_10 = $qty_10_p + ".wk_cost_qty";
	public static final String $col_11 = $qty_11_p + ".wk_cost_qty";
	public static final String $ttl = $ttl_qty_p + ".wk_cost_qty";

	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta ctg_cd_META = createCommonMeta($ctg_cd, mcframe.commonMA.meta.MA_META.COST_CTG_CD);
	public static final MCMeta ctg_nm_META = createCommonMeta($ctg_nm, mcframe.commonMA.meta.MA_META.COST_CTG_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta wk_cost_unit_nm_META = createCommonMeta($wk_cost_unit_nm, mcframe.commonMA.meta.MA_META.WK_COST_UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta elm_no_META = createNumberMeta($elm_no);
	public static final MCMeta elm_META = createStringMeta($elm);
	public static final MCMeta elm_nm_META = createStringMeta($elm_nm);
	public static final MCMeta qty_00_p_META = createInnerRowMeta($qty_00_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_01_p_META = createInnerRowMeta($qty_01_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_02_p_META = createInnerRowMeta($qty_02_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_03_p_META = createInnerRowMeta($qty_03_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_04_p_META = createInnerRowMeta($qty_04_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_05_p_META = createInnerRowMeta($qty_05_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_06_p_META = createInnerRowMeta($qty_06_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_07_p_META = createInnerRowMeta($qty_07_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_08_p_META = createInnerRowMeta($qty_08_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_09_p_META = createInnerRowMeta($qty_09_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_10_p_META = createInnerRowMeta($qty_10_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta qty_11_p_META = createInnerRowMeta($qty_11_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);
	public static final MCMeta ttl_qty_p_META = createInnerRowMeta($ttl_qty_p, mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class);

	protected static final ConstMetaList<DispRsltR> constMetas = new ConstMetaList<DispRsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			ctg_cd_META,
			ctg_nm_META,
			loc_cd_META,
			loc_nm_META,
			site_cd_META,
			site_nm_META,
			oper_cd_META,
			oper_nm_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			wk_cost_unit_nm_META,
			dec_place_META,
			elm_no_META,
			elm_META,
			elm_nm_META,
			qty_00_p_META,
			qty_01_p_META,
			qty_02_p_META,
			qty_03_p_META,
			qty_04_p_META,
			qty_05_p_META,
			qty_06_p_META,
			qty_07_p_META,
			qty_08_p_META,
			qty_09_p_META,
			qty_10_p_META,
			qty_11_p_META,
			ttl_qty_p_META
		},
		new String[][]{
			{
				"col_00",
				"col_01",
				"col_02",
				"col_03",
				"col_04",
				"col_05",
				"col_06",
				"col_07",
				"col_08",
				"col_09",
				"col_10",
				"col_11",
				"ttl"
			},
			{
				$col_00,
				$col_01,
				$col_02,
				$col_03,
				$col_04,
				$col_05,
				$col_06,
				$col_07,
				$col_08,
				$col_09,
				$col_10,
				$col_11,
				$ttl
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
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
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
				{$dpt_cd, "Key"},	// dpt_cd
				{$dpt_nm, "Key"},	// dpt_nm
				{$ctg_cd, "Key"},	// ctg_cd
				{$ctg_nm, "Key"},	// ctg_nm
				{$loc_cd, "Key"},	// loc_cd
				{$loc_nm, "Key"},	// loc_nm
				{$site_cd, "Key"},	// site_cd
				{$site_nm, "Key"},	// site_nm
				{$oper_cd, "Key"},	// oper_cd
				{$oper_nm, "Key"},	// oper_nm
				{$lot_no, "Key"},	// lot_no
				{$sublot_no, "Key"},	// sublot_no
				{$sno1, "Key"},	// sno1
				{$sno2, "Key"},	// sno2
				{$sno3, "Key"},	// sno3
				{$sno4, "Key"},	// sno4
				{$wk_cost_cd, "Key"},	// wk_cost_cd
				{$wk_cost_nm, "Key"},	// wk_cost_nm
				{$wk_cost_unit_nm, "Key"}	// wk_cost_unit_nm
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$wg_cd, "wg_flg"},	// wg_cd
				{$wg_nm, "wg_flg"},	// wg_nm
				{$dpt_cd, "dpt_flg"},	// dpt_cd
				{$dpt_nm, "dpt_flg"},	// dpt_nm
				{$ctg_cd, "ctg_flg"},	// ctg_cd
				{$ctg_nm, "ctg_flg"},	// ctg_nm
				{$loc_cd, "loc_flg"},	// loc_cd
				{$loc_nm, "loc_flg"},	// loc_nm
				{$site_cd, "site_flg"},	// site_cd
				{$site_nm, "site_flg"},	// site_nm
				{$oper_cd, "oper_flg"},	// oper_cd
				{$oper_nm, "oper_flg"},	// oper_nm
				{$lot_no, "lot_flg"},	// lot_no
				{$sublot_no, "sublot_flg"},	// sublot_no
				{$sno1, "sno1_flg"},	// sno1
				{$sno2, "sno2_flg"},	// sno2
				{$sno3, "sno3_flg"},	// sno3
				{$sno4, "sno4_flg"}	// sno4
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
				{$qty_00_p + ".wk_cost_qty", "Key"},	// qty_00_p.wk_cost_qty
				{$qty_01_p + ".wk_cost_qty", "Key"},	// qty_01_p.wk_cost_qty
				{$qty_02_p + ".wk_cost_qty", "Key"},	// qty_02_p.wk_cost_qty
				{$qty_03_p + ".wk_cost_qty", "Key"},	// qty_03_p.wk_cost_qty
				{$qty_04_p + ".wk_cost_qty", "Key"},	// qty_04_p.wk_cost_qty
				{$qty_05_p + ".wk_cost_qty", "Key"},	// qty_05_p.wk_cost_qty
				{$qty_06_p + ".wk_cost_qty", "Key"},	// qty_06_p.wk_cost_qty
				{$qty_07_p + ".wk_cost_qty", "Key"},	// qty_07_p.wk_cost_qty
				{$qty_08_p + ".wk_cost_qty", "Key"},	// qty_08_p.wk_cost_qty
				{$qty_09_p + ".wk_cost_qty", "Key"},	// qty_09_p.wk_cost_qty
				{$qty_10_p + ".wk_cost_qty", "Key"},	// qty_10_p.wk_cost_qty
				{$qty_11_p + ".wk_cost_qty", "Key"}	// qty_11_p.wk_cost_qty
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
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 2, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 2, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 3, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 3, $dpt_nm, value);
	}


	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return getConstString(offset + 4, $ctg_cd);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		setConstString(offset + 4, $ctg_cd, value);
	}


	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public String ctg_nm() {
		return getConstString(offset + 5, $ctg_nm);
	}

	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public void ctg_nm(String value) {
		setConstString(offset + 5, $ctg_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 6, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 6, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 7, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 7, $loc_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 8, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 8, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 9, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 9, $site_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 10, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 10, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 11, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 11, $oper_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 12, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 12, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 13, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 13, $sublot_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 14, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 14, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 15, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 15, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 16, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 16, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 17, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 17, $sno4, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 18, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 18, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 19, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 19, $wk_cost_nm, value);
	}


	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public String wk_cost_unit_nm() {
		return getConstString(offset + 20, $wk_cost_unit_nm);
	}

	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public void wk_cost_unit_nm(String value) {
		setConstString(offset + 20, $wk_cost_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 21, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 21, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 21, $dec_place, value);
	}


	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public MCNumber elm_no() {
		return getConstNumber(offset + 22, $elm_no);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(MCNumber value) {
		setConstNumber(offset + 22, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(int value) {
		setConstNumber(offset + 22, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(long value) {
		setConstNumber(offset + 22, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(float value) {
		setConstNumber(offset + 22, $elm_no, value);
	}

	/**
	 * Column No. 項目ＮＯ.<p>
	 *
	 */
	public void elm_no(double value) {
		setConstNumber(offset + 22, $elm_no, value);
	}


	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public String elm() {
		return getConstString(offset + 23, $elm);
	}

	/**
	 * Column key 項目キー.<p>
	 *
	 */
	public void elm(String value) {
		setConstString(offset + 23, $elm, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String elm_nm() {
		return getConstString(offset + 24, $elm_nm);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void elm_nm(String value) {
		setConstString(offset + 24, $elm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_00_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 25, $qty_00_p);
	}
	
	public void qty_00_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 25, $qty_00_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_01_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 26, $qty_01_p);
	}
	
	public void qty_01_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 26, $qty_01_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_02_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 27, $qty_02_p);
	}
	
	public void qty_02_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 27, $qty_02_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_03_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 28, $qty_03_p);
	}
	
	public void qty_03_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 28, $qty_03_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_04_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 29, $qty_04_p);
	}
	
	public void qty_04_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 29, $qty_04_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_05_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 30, $qty_05_p);
	}
	
	public void qty_05_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 30, $qty_05_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_06_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 31, $qty_06_p);
	}
	
	public void qty_06_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 31, $qty_06_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_07_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 32, $qty_07_p);
	}
	
	public void qty_07_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 32, $qty_07_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_08_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 33, $qty_08_p);
	}
	
	public void qty_08_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 33, $qty_08_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_09_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 34, $qty_09_p);
	}
	
	public void qty_09_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 34, $qty_09_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_10_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 35, $qty_10_p);
	}
	
	public void qty_10_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 35, $qty_10_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR qty_11_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 36, $qty_11_p);
	}
	
	public void qty_11_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 36, $qty_11_p, row);
	}


	public mcframe.clientMAUB.MAUBP5340.WkCostQtyR ttl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5340.WkCostQtyR) getConstInnerRow(offset + 37, $ttl_qty_p);
	}
	
	public void ttl_qty_p(mcframe.clientMAUB.MAUBP5340.WkCostQtyR row){
		setConstInnerRow(offset + 37, $ttl_qty_p, row);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			return ctg_cd();
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			return ctg_nm();
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			return wk_cost_unit_nm();
		}
		if ($elm.equalsIgnoreCase(name)) {
			return elm();
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			return elm_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			return elm_no();
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
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
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($ctg_cd.equalsIgnoreCase(name)) {
			ctg_cd(value);
			return;
		}
		if ($ctg_nm.equalsIgnoreCase(name)) {
			ctg_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
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
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($wk_cost_unit_nm.equalsIgnoreCase(name)) {
			wk_cost_unit_nm(value);
			return;
		}
		if ($elm.equalsIgnoreCase(name)) {
			elm(value);
			return;
		}
		if ($elm_nm.equalsIgnoreCase(name)) {
			elm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($elm_no.equalsIgnoreCase(name)) {
			elm_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($qty_00_p.equalsIgnoreCase(name)) {
			return qty_00_p();
		}
		if ($qty_01_p.equalsIgnoreCase(name)) {
			return qty_01_p();
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			return qty_02_p();
		}
		if ($qty_03_p.equalsIgnoreCase(name)) {
			return qty_03_p();
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			return qty_04_p();
		}
		if ($qty_05_p.equalsIgnoreCase(name)) {
			return qty_05_p();
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			return qty_06_p();
		}
		if ($qty_07_p.equalsIgnoreCase(name)) {
			return qty_07_p();
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			return qty_08_p();
		}
		if ($qty_09_p.equalsIgnoreCase(name)) {
			return qty_09_p();
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			return qty_10_p();
		}
		if ($qty_11_p.equalsIgnoreCase(name)) {
			return qty_11_p();
		}
		if ($ttl_qty_p.equalsIgnoreCase(name)) {
			return ttl_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($qty_00_p.equalsIgnoreCase(name)) {
			qty_00_p(
				((MCContainerMeta) qty_00_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_01_p.equalsIgnoreCase(name)) {
			qty_01_p(
				((MCContainerMeta) qty_01_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_02_p.equalsIgnoreCase(name)) {
			qty_02_p(
				((MCContainerMeta) qty_02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_03_p.equalsIgnoreCase(name)) {
			qty_03_p(
				((MCContainerMeta) qty_03_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_04_p.equalsIgnoreCase(name)) {
			qty_04_p(
				((MCContainerMeta) qty_04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_05_p.equalsIgnoreCase(name)) {
			qty_05_p(
				((MCContainerMeta) qty_05_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_06_p.equalsIgnoreCase(name)) {
			qty_06_p(
				((MCContainerMeta) qty_06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_07_p.equalsIgnoreCase(name)) {
			qty_07_p(
				((MCContainerMeta) qty_07_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_08_p.equalsIgnoreCase(name)) {
			qty_08_p(
				((MCContainerMeta) qty_08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_09_p.equalsIgnoreCase(name)) {
			qty_09_p(
				((MCContainerMeta) qty_09_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_10_p.equalsIgnoreCase(name)) {
			qty_10_p(
				((MCContainerMeta) qty_10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($qty_11_p.equalsIgnoreCase(name)) {
			qty_11_p(
				((MCContainerMeta) qty_11_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		if ($ttl_qty_p.equalsIgnoreCase(name)) {
			ttl_qty_p(
				((MCContainerMeta) ttl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5340.WkCostQtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public MCNumber col_00() {
		return qty_00_p().wk_cost_qty();
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(MCNumber value) {
		qty_00_p().wk_cost_qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(int value) {
		qty_00_p().wk_cost_qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(long value) {
		qty_00_p().wk_cost_qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(float value) {
		qty_00_p().wk_cost_qty(value);
	}

	/**
	 * Month 00 年月００.<p>
	 *
	 */
	public void col_00(double value) {
		qty_00_p().wk_cost_qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber col_01() {
		return qty_01_p().wk_cost_qty();
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(MCNumber value) {
		qty_01_p().wk_cost_qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(int value) {
		qty_01_p().wk_cost_qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(long value) {
		qty_01_p().wk_cost_qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(float value) {
		qty_01_p().wk_cost_qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void col_01(double value) {
		qty_01_p().wk_cost_qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber col_02() {
		return qty_02_p().wk_cost_qty();
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(MCNumber value) {
		qty_02_p().wk_cost_qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(int value) {
		qty_02_p().wk_cost_qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(long value) {
		qty_02_p().wk_cost_qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(float value) {
		qty_02_p().wk_cost_qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void col_02(double value) {
		qty_02_p().wk_cost_qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber col_03() {
		return qty_03_p().wk_cost_qty();
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(MCNumber value) {
		qty_03_p().wk_cost_qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(int value) {
		qty_03_p().wk_cost_qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(long value) {
		qty_03_p().wk_cost_qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(float value) {
		qty_03_p().wk_cost_qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void col_03(double value) {
		qty_03_p().wk_cost_qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber col_04() {
		return qty_04_p().wk_cost_qty();
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(MCNumber value) {
		qty_04_p().wk_cost_qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(int value) {
		qty_04_p().wk_cost_qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(long value) {
		qty_04_p().wk_cost_qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(float value) {
		qty_04_p().wk_cost_qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void col_04(double value) {
		qty_04_p().wk_cost_qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber col_05() {
		return qty_05_p().wk_cost_qty();
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(MCNumber value) {
		qty_05_p().wk_cost_qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(int value) {
		qty_05_p().wk_cost_qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(long value) {
		qty_05_p().wk_cost_qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(float value) {
		qty_05_p().wk_cost_qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void col_05(double value) {
		qty_05_p().wk_cost_qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber col_06() {
		return qty_06_p().wk_cost_qty();
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(MCNumber value) {
		qty_06_p().wk_cost_qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(int value) {
		qty_06_p().wk_cost_qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(long value) {
		qty_06_p().wk_cost_qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(float value) {
		qty_06_p().wk_cost_qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void col_06(double value) {
		qty_06_p().wk_cost_qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber col_07() {
		return qty_07_p().wk_cost_qty();
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(MCNumber value) {
		qty_07_p().wk_cost_qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(int value) {
		qty_07_p().wk_cost_qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(long value) {
		qty_07_p().wk_cost_qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(float value) {
		qty_07_p().wk_cost_qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void col_07(double value) {
		qty_07_p().wk_cost_qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber col_08() {
		return qty_08_p().wk_cost_qty();
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(MCNumber value) {
		qty_08_p().wk_cost_qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(int value) {
		qty_08_p().wk_cost_qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(long value) {
		qty_08_p().wk_cost_qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(float value) {
		qty_08_p().wk_cost_qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void col_08(double value) {
		qty_08_p().wk_cost_qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber col_09() {
		return qty_09_p().wk_cost_qty();
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(MCNumber value) {
		qty_09_p().wk_cost_qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(int value) {
		qty_09_p().wk_cost_qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(long value) {
		qty_09_p().wk_cost_qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(float value) {
		qty_09_p().wk_cost_qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void col_09(double value) {
		qty_09_p().wk_cost_qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber col_10() {
		return qty_10_p().wk_cost_qty();
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(MCNumber value) {
		qty_10_p().wk_cost_qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(int value) {
		qty_10_p().wk_cost_qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(long value) {
		qty_10_p().wk_cost_qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(float value) {
		qty_10_p().wk_cost_qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void col_10(double value) {
		qty_10_p().wk_cost_qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public MCNumber col_11() {
		return qty_11_p().wk_cost_qty();
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(MCNumber value) {
		qty_11_p().wk_cost_qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(int value) {
		qty_11_p().wk_cost_qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(long value) {
		qty_11_p().wk_cost_qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(float value) {
		qty_11_p().wk_cost_qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void col_11(double value) {
		qty_11_p().wk_cost_qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public MCNumber ttl() {
		return ttl_qty_p().wk_cost_qty();
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(MCNumber value) {
		ttl_qty_p().wk_cost_qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(int value) {
		ttl_qty_p().wk_cost_qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(long value) {
		ttl_qty_p().wk_cost_qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(float value) {
		ttl_qty_p().wk_cost_qty(value);
	}

	/**
	 * Total 合計.<p>
	 *
	 */
	public void ttl(double value) {
		ttl_qty_p().wk_cost_qty(value);
	}

}

