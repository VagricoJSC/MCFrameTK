package mcframe.clientMGBB.MGBBP0400;

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
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $act_calc_ctg_cd = "act_calc_ctg_cd";
	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public static final String $act_calc_ctg_nm = "act_calc_ctg_nm";
	/**
	 * Copy source WG cd. コピー元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Copy source WG cd. name コピー元ワーキンググループＣＤ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	public static final String $term_p = "term_p";
	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public static final String $ptn_set_typ = "ptn_set_typ";
	/**
	 * BOM/Operation pattern setting type name (Copy to) コピー先構成/工程パタン設定区分名.<p>
	 *
	 */
	public static final String $ptn_set_typ_nm = "ptn_set_typ_nm";
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public static final String $itm_flg = "itm_flg";
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public static final String $dtl_flg = "dtl_flg";
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public static final String $oper_flg = "oper_flg";
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public static final String $bom_flg = "bom_flg";
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public static final String $wk_flg = "wk_flg";
	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public static final String $proc_flg = "proc_flg";
	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public static final String $prov_flg = "prov_flg";
	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";

	public static final String $term = $term_p + ".term";

	public static final MCMeta act_calc_ctg_cd_META = createCommonMeta($act_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta act_calc_ctg_nm_META = createCommonMeta($act_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta ptn_set_typ_META = createCommonMeta($ptn_set_typ, mcframe.commonMG.meta.MG_META.PTN_SET_TYP);
	public static final MCMeta ptn_set_typ_nm_META = createCommonMeta($ptn_set_typ_nm, mcframe.commonMG.meta.MG_META.PTN_SET_TYP_NM);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_flg_META = createCommonMeta($bom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_flg_META = createCommonMeta($wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_flg_META = createCommonMeta($proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			act_calc_ctg_cd_META,
			act_calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			ym_fr_META,
			ym_to_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			term_p_META,
			ptn_set_typ_META,
			ptn_set_typ_nm_META,
			itm_flg_META,
			dtl_flg_META,
			oper_flg_META,
			bom_flg_META,
			wk_flg_META,
			purc_flg_META,
			proc_flg_META,
			prov_flg_META,
			sls_flg_META
		},
		new String[][]{
			{
				"term"
			},
			{
				$term
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
				{$act_calc_ctg_cd, "calc_ctg_nm"},	// act_calc_ctg_cd
				{$wg_cd, "wg_nm"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public String act_calc_ctg_cd() {
		return getConstString(offset + 0, $act_calc_ctg_cd);
	}

	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public void act_calc_ctg_cd(String value) {
		setConstString(offset + 0, $act_calc_ctg_cd, value);
	}


	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public String act_calc_ctg_nm() {
		return getConstString(offset + 1, $act_calc_ctg_nm);
	}

	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public void act_calc_ctg_nm(String value) {
		setConstString(offset + 1, $act_calc_ctg_nm, value);
	}


	/**
	 * Copy source WG cd. コピー元ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * Copy source WG cd. コピー元ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * Copy source WG cd. name コピー元ワーキンググループＣＤ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * Copy source WG cd. name コピー元ワーキンググループＣＤ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 4, $ym_fr);
	}

	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 4, $ym_fr, value);
	}


	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 5, $ym_to);
	}

	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 5, $ym_to, value);
	}


	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 6, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 6, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 7, $calc_ctg_nm);
	}

	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 7, $calc_ctg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0230.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 8, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 8, $term_p, row);
	}


	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public String ptn_set_typ() {
		return getConstString(offset + 9, $ptn_set_typ);
	}

	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public void ptn_set_typ(String value) {
		setConstString(offset + 9, $ptn_set_typ, value);
	}


	/**
	 * BOM/Operation pattern setting type name (Copy to) コピー先構成/工程パタン設定区分名.<p>
	 *
	 */
	public String ptn_set_typ_nm() {
		return getConstString(offset + 10, $ptn_set_typ_nm);
	}

	/**
	 * BOM/Operation pattern setting type name (Copy to) コピー先構成/工程パタン設定区分名.<p>
	 *
	 */
	public void ptn_set_typ_nm(String value) {
		setConstString(offset + 10, $ptn_set_typ_nm, value);
	}


	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 11, $itm_flg);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 11, $itm_flg, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 12, $dtl_flg);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 12, $dtl_flg, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 13, $oper_flg);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 13, $oper_flg, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public boolean bom_flg() {
		return getConstBoolean(offset + 14, $bom_flg);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void bom_flg(boolean value) {
		setConstBoolean(offset + 14, $bom_flg, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public boolean wk_flg() {
		return getConstBoolean(offset + 15, $wk_flg);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void wk_flg(boolean value) {
		setConstBoolean(offset + 15, $wk_flg, value);
	}


	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 16, $purc_flg);
	}

	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 16, $purc_flg, value);
	}


	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public boolean proc_flg() {
		return getConstBoolean(offset + 17, $proc_flg);
	}

	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public void proc_flg(boolean value) {
		setConstBoolean(offset + 17, $proc_flg, value);
	}


	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 18, $prov_flg);
	}

	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 18, $prov_flg, value);
	}


	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 19, $sls_flg);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 19, $sls_flg, value);
	}


	public String getString(String name) {
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			return ptn_set_typ();
		}
		if ($ptn_set_typ_nm.equalsIgnoreCase(name)) {
			return ptn_set_typ_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bom_flg.equalsIgnoreCase(name)) {
			return bom_flg();
		}
		if ($wk_flg.equalsIgnoreCase(name)) {
			return wk_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			return proc_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			return ptn_set_typ();
		}
		if ($ptn_set_typ_nm.equalsIgnoreCase(name)) {
			return ptn_set_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			return itm_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			return oper_flg();
		}
		if ($bom_flg.equalsIgnoreCase(name)) {
			return bom_flg();
		}
		if ($wk_flg.equalsIgnoreCase(name)) {
			return wk_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			return proc_flg();
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			return prov_flg();
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			ptn_set_typ(value);
			return;
		}
		if ($ptn_set_typ_nm.equalsIgnoreCase(name)) {
			ptn_set_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bom_flg.equalsIgnoreCase(name)) {
			bom_flg(value);
			return;
		}
		if ($wk_flg.equalsIgnoreCase(name)) {
			wk_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			proc_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
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
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			ptn_set_typ(value);
			return;
		}
		if ($ptn_set_typ_nm.equalsIgnoreCase(name)) {
			ptn_set_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($itm_flg.equalsIgnoreCase(name)) {
			itm_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($oper_flg.equalsIgnoreCase(name)) {
			oper_flg(value);
			return;
		}
		if ($bom_flg.equalsIgnoreCase(name)) {
			bom_flg(value);
			return;
		}
		if ($wk_flg.equalsIgnoreCase(name)) {
			wk_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($proc_flg.equalsIgnoreCase(name)) {
			proc_flg(value);
			return;
		}
		if ($prov_flg.equalsIgnoreCase(name)) {
			prov_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
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
		super.setInnerRow(name, value);
	}


	/**
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public MCDate term() {
		return term_p().term();
	}

	/**
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public void term(MCDate value) {
		term_p().term(value);
	}

}

