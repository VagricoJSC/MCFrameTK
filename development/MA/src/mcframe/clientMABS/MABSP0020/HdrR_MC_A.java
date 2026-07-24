package mcframe.clientMABS.MABSP0020;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	public static final String $par_itm_p = "par_itm_p";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public static final String $par_base_unit_cd = "par_base_unit_cd";
	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public static final String $par_base_unit_nm = "par_base_unit_nm";
	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public static final String $par_dec_place = "par_dec_place";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
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
	 * BOM pattern (Parent) 構成パタン（親）.<p>
	 *
	 */
	public static final String $par_def_bom_ptn = "par_def_bom_ptn";

	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";

	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta par_base_unit_cd_META = createCommonMeta($par_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_base_unit_nm_META = createCommonMeta($par_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_dec_place_META = createCommonMeta($par_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_sno1_mng_typ_META = createCommonMeta($par_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_sno2_mng_typ_META = createCommonMeta($par_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_sno3_mng_typ_META = createCommonMeta($par_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_sno4_mng_typ_META = createCommonMeta($par_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta par_def_bom_ptn_META = createCommonMeta($par_def_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			par_itm_p_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			par_base_unit_cd_META,
			par_base_unit_nm_META,
			par_dec_place_META,
			par_itm_typ_META,
			par_itm_typ_d_cd_META,
			par_sno1_mng_typ_META,
			par_sno2_mng_typ_META,
			par_sno3_mng_typ_META,
			par_sno4_mng_typ_META,
			par_def_bom_ptn_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm
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
				{$par_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;def_bom_ptn;unit_cd;dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;itm_typ;itm_typ_d_cd;unit_nm"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;def_bom_ptn;unit_cd;dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;itm_typ;itm_typ_d_cd;unit_nm"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_nm;itm_sub3;def_bom_ptn;unit_cd;dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;itm_typ;itm_typ_d_cd;unit_nm"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_nm;def_bom_ptn;unit_cd;dec_place;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;def_bom_ptn;itm_typ;itm_typ_d_cd;unit_nm"},	// par_itm_p.itm_sub3
				{$wg_cd, "wg_nm"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM;par_itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM;par_itm_cd;par_itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM;par_itm_cd;par_itm_sub1;par_itm_sub2"},	// par_itm_p.itm_sub3
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "itm_is_srch_typ"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// par_itm_p.itm_sub3
				{$wg_cd, "rd_flg"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 0, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 0, $par_itm_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 3, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 3, $bom_ptn, value);
	}


	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public String par_base_unit_cd() {
		return getConstString(offset + 4, $par_base_unit_cd);
	}

	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public void par_base_unit_cd(String value) {
		setConstString(offset + 4, $par_base_unit_cd, value);
	}


	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public String par_base_unit_nm() {
		return getConstString(offset + 5, $par_base_unit_nm);
	}

	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public void par_base_unit_nm(String value) {
		setConstString(offset + 5, $par_base_unit_nm, value);
	}


	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCNumber par_dec_place() {
		return getConstNumber(offset + 6, $par_dec_place);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(MCNumber value) {
		setConstNumber(offset + 6, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(int value) {
		setConstNumber(offset + 6, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(long value) {
		setConstNumber(offset + 6, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(float value) {
		setConstNumber(offset + 6, $par_dec_place, value);
	}

	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public void par_dec_place(double value) {
		setConstNumber(offset + 6, $par_dec_place, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 7, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 7, $par_itm_typ, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 8, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 8, $par_itm_typ_d_cd, value);
	}


	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public String par_sno1_mng_typ() {
		return getConstString(offset + 9, $par_sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public void par_sno1_mng_typ(String value) {
		setConstString(offset + 9, $par_sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public String par_sno2_mng_typ() {
		return getConstString(offset + 10, $par_sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public void par_sno2_mng_typ(String value) {
		setConstString(offset + 10, $par_sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public String par_sno3_mng_typ() {
		return getConstString(offset + 11, $par_sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public void par_sno3_mng_typ(String value) {
		setConstString(offset + 11, $par_sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public String par_sno4_mng_typ() {
		return getConstString(offset + 12, $par_sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public void par_sno4_mng_typ(String value) {
		setConstString(offset + 12, $par_sno4_mng_typ, value);
	}


	/**
	 * BOM pattern (Parent) 構成パタン（親）.<p>
	 *
	 */
	public String par_def_bom_ptn() {
		return getConstString(offset + 13, $par_def_bom_ptn);
	}

	/**
	 * BOM pattern (Parent) 構成パタン（親）.<p>
	 *
	 */
	public void par_def_bom_ptn(String value) {
		setConstString(offset + 13, $par_def_bom_ptn, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
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
		if ($par_def_bom_ptn.equalsIgnoreCase(name)) {
			return par_def_bom_ptn();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
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
		if ($par_def_bom_ptn.equalsIgnoreCase(name)) {
			return par_def_bom_ptn();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			return par_dec_place();
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
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
		if ($par_def_bom_ptn.equalsIgnoreCase(name)) {
			par_def_bom_ptn(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
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
		if ($par_def_bom_ptn.equalsIgnoreCase(name)) {
			par_def_bom_ptn(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($par_dec_place.equalsIgnoreCase(name)) {
			par_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

}

