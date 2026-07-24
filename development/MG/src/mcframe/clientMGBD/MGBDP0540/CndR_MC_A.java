package mcframe.clientMGBD.MGBDP0540;

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
	 * EX1,Explosion,1;EX2,Implosion,2 EX1,正展開,1;EX2,逆展開,2.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	public static final String $term_p = "term_p";
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
	public static final String $itm_p = "itm_p";
	/**
	 * Item input assist search type 品目入力補助検索区分.<p>
	 *
	 */
	public static final String $itm_is_srch_typ = "itm_is_srch_typ";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public static final String $par_itm_flg = "par_itm_flg";
	/**
	 * Child item 子品目.<p>
	 *
	 */
	public static final String $chd_itm_flg = "chd_itm_flg";
	/**
	 * Copy BOM pattern 構成パタン引継ぎ.<p>
	 *
	 */
	public static final String $bom_ptn_flg = "bom_ptn_flg";
	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public static final String $max_hrrchy = "max_hrrchy";

	public static final String $term = $term_p + ".term";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta itm_is_srch_typ_META = createCommonMeta($itm_is_srch_typ, mcframe.commonMA.meta.MA_META.ITM_IS_SRCH_TYP);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta par_itm_flg_META = createCommonMeta($par_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chd_itm_flg_META = createCommonMeta($chd_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_ptn_flg_META = createCommonMeta($bom_ptn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta max_hrrchy_META = createCommonMeta($max_hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			term_p_META,
			wg_cd_META,
			wg_nm_META,
			itm_p_META,
			itm_is_srch_typ_META,
			bom_ptn_META,
			par_itm_flg_META,
			chd_itm_flg_META,
			bom_ptn_flg_META,
			max_hrrchy_META
		},
		new String[][]{
			{
				"term",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$term,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;true;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;true;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2;true;true"},	// itm_p.itm_sub3
				{$bom_ptn, "term;itm_cd;itm_sub1;itm_sub2;itm_sub3;par_itm_flg;chd_itm_flg;wg_cd"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "rd_flg"},	// wg_cd
				{$itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on;release_flg_off"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd;release_flg_on;release_flg_off"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1;release_flg_on;release_flg_off"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2;release_flg_on;release_flg_off"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
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
	 * EX1,Explosion,1;EX2,Implosion,2 EX1,正展開,1;EX2,逆展開,2.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * EX1,Explosion,1;EX2,Implosion,2 EX1,正展開,1;EX2,逆展開,2.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 2, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 2, $calc_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0230.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 3, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 3, $term_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 6, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 6, $itm_p, row);
	}


	/**
	 * Item input assist search type 品目入力補助検索区分.<p>
	 *
	 */
	public String itm_is_srch_typ() {
		return getConstString(offset + 7, $itm_is_srch_typ);
	}

	/**
	 * Item input assist search type 品目入力補助検索区分.<p>
	 *
	 */
	public void itm_is_srch_typ(String value) {
		setConstString(offset + 7, $itm_is_srch_typ, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 8, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 8, $bom_ptn, value);
	}


	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public boolean par_itm_flg() {
		return getConstBoolean(offset + 9, $par_itm_flg);
	}

	/**
	 * Parent item 親品目.<p>
	 *
	 */
	public void par_itm_flg(boolean value) {
		setConstBoolean(offset + 9, $par_itm_flg, value);
	}


	/**
	 * Child item 子品目.<p>
	 *
	 */
	public boolean chd_itm_flg() {
		return getConstBoolean(offset + 10, $chd_itm_flg);
	}

	/**
	 * Child item 子品目.<p>
	 *
	 */
	public void chd_itm_flg(boolean value) {
		setConstBoolean(offset + 10, $chd_itm_flg, value);
	}


	/**
	 * Copy BOM pattern 構成パタン引継ぎ.<p>
	 *
	 */
	public boolean bom_ptn_flg() {
		return getConstBoolean(offset + 11, $bom_ptn_flg);
	}

	/**
	 * Copy BOM pattern 構成パタン引継ぎ.<p>
	 *
	 */
	public void bom_ptn_flg(boolean value) {
		setConstBoolean(offset + 11, $bom_ptn_flg, value);
	}


	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public MCNumber max_hrrchy() {
		return getConstNumber(offset + 12, $max_hrrchy);
	}

	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public void max_hrrchy(MCNumber value) {
		setConstNumber(offset + 12, $max_hrrchy, value);
	}

	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public void max_hrrchy(int value) {
		setConstNumber(offset + 12, $max_hrrchy, value);
	}

	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public void max_hrrchy(long value) {
		setConstNumber(offset + 12, $max_hrrchy, value);
	}

	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public void max_hrrchy(float value) {
		setConstNumber(offset + 12, $max_hrrchy, value);
	}

	/**
	 * Max. hierarchy 最大階層.<p>
	 *
	 */
	public void max_hrrchy(double value) {
		setConstNumber(offset + 12, $max_hrrchy, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_is_srch_typ.equalsIgnoreCase(name)) {
			return itm_is_srch_typ();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			return max_hrrchy();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			return par_itm_flg();
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			return chd_itm_flg();
		}
		if ($bom_ptn_flg.equalsIgnoreCase(name)) {
			return bom_ptn_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($itm_is_srch_typ.equalsIgnoreCase(name)) {
			return itm_is_srch_typ();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			return max_hrrchy();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			return par_itm_flg();
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			return chd_itm_flg();
		}
		if ($bom_ptn_flg.equalsIgnoreCase(name)) {
			return bom_ptn_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($itm_is_srch_typ.equalsIgnoreCase(name)) {
			itm_is_srch_typ(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			par_itm_flg(value);
			return;
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			chd_itm_flg(value);
			return;
		}
		if ($bom_ptn_flg.equalsIgnoreCase(name)) {
			bom_ptn_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($itm_is_srch_typ.equalsIgnoreCase(name)) {
			itm_is_srch_typ(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($max_hrrchy.equalsIgnoreCase(name)) {
			max_hrrchy(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($par_itm_flg.equalsIgnoreCase(name)) {
			par_itm_flg(value);
			return;
		}
		if ($chd_itm_flg.equalsIgnoreCase(name)) {
			chd_itm_flg(value);
			return;
		}
		if ($bom_ptn_flg.equalsIgnoreCase(name)) {
			bom_ptn_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0230.TermR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
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

}

