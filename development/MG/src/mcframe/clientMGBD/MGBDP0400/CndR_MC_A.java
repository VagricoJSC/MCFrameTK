package mcframe.clientMGBD.MGBDP0400;

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
	 * INS,Import; DEL,Delete work table INS,取り込む;DEL,ワークテーブルを削除する.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	public static final String $term_p = "term_p";
	/**
	 * Date 対象日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * Include import 取込処理も行う.<p>
	 *
	 */
	public static final String $lump_flg = "lump_flg";
	/**
	 * Common 共通.<p>
	 *
	 */
	public static final String $cmn_flg = "cmn_flg";
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public static final String $wg_flg = "wg_flg";
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
	/**
	 * Sales unit price import type 販売単価取込区分.<p>
	 *
	 */
	public static final String $sls_upri_imp_typ = "sls_upri_imp_typ";
	/**
	 * Sales unit price import type name 販売単価取込区分名.<p>
	 *
	 */
	public static final String $sls_upri_imp_typ_nm = "sls_upri_imp_typ_nm";

	public static final String $term_fr = $term_p + ".term_fr";
	public static final String $term_to = $term_p + ".term_to";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0240.TermR.class);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lump_flg_META = createCommonMeta($lump_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmn_flg_META = createCommonMeta($cmn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_flg_META = createCommonMeta($wg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_flg_META = createCommonMeta($bom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_flg_META = createCommonMeta($wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_flg_META = createCommonMeta($proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_imp_typ_META = createCommonMeta($sls_upri_imp_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_IMP_TYP);
	public static final MCMeta sls_upri_imp_typ_nm_META = createCommonMeta($sls_upri_imp_typ_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_IMP_TYP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			term_p_META,
			dt_META,
			lump_flg_META,
			cmn_flg_META,
			wg_flg_META,
			dtl_flg_META,
			oper_flg_META,
			bom_flg_META,
			wk_flg_META,
			purc_flg_META,
			proc_flg_META,
			prov_flg_META,
			sls_flg_META,
			sls_upri_imp_typ_META,
			sls_upri_imp_typ_nm_META
		},
		new String[][]{
			{
				"term_fr",
				"term_to"
			},
			{
				$term_fr,
				$term_to
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"}	// wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"}	// wg_cd
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
	 * INS,Import; DEL,Delete work table INS,取り込む;DEL,ワークテーブルを削除する.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Import; DEL,Delete work table INS,取り込む;DEL,ワークテーブルを削除する.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 1, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 1, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 2, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 2, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0240.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0240.TermR) getConstInnerRow(offset + 5, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0240.TermR row){
		setConstInnerRow(offset + 5, $term_p, row);
	}


	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 6, $dt);
	}

	/**
	 * Date 対象日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 6, $dt, value);
	}


	/**
	 * Include import 取込処理も行う.<p>
	 *
	 */
	public boolean lump_flg() {
		return getConstBoolean(offset + 7, $lump_flg);
	}

	/**
	 * Include import 取込処理も行う.<p>
	 *
	 */
	public void lump_flg(boolean value) {
		setConstBoolean(offset + 7, $lump_flg, value);
	}


	/**
	 * Common 共通.<p>
	 *
	 */
	public boolean cmn_flg() {
		return getConstBoolean(offset + 8, $cmn_flg);
	}

	/**
	 * Common 共通.<p>
	 *
	 */
	public void cmn_flg(boolean value) {
		setConstBoolean(offset + 8, $cmn_flg, value);
	}


	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public boolean wg_flg() {
		return getConstBoolean(offset + 9, $wg_flg);
	}

	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public void wg_flg(boolean value) {
		setConstBoolean(offset + 9, $wg_flg, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 10, $dtl_flg);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 10, $dtl_flg, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 11, $oper_flg);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 11, $oper_flg, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public boolean bom_flg() {
		return getConstBoolean(offset + 12, $bom_flg);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void bom_flg(boolean value) {
		setConstBoolean(offset + 12, $bom_flg, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public boolean wk_flg() {
		return getConstBoolean(offset + 13, $wk_flg);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void wk_flg(boolean value) {
		setConstBoolean(offset + 13, $wk_flg, value);
	}


	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 14, $purc_flg);
	}

	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 14, $purc_flg, value);
	}


	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public boolean proc_flg() {
		return getConstBoolean(offset + 15, $proc_flg);
	}

	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public void proc_flg(boolean value) {
		setConstBoolean(offset + 15, $proc_flg, value);
	}


	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 16, $prov_flg);
	}

	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 16, $prov_flg, value);
	}


	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 17, $sls_flg);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 17, $sls_flg, value);
	}


	/**
	 * Sales unit price import type 販売単価取込区分.<p>
	 *
	 */
	public String sls_upri_imp_typ() {
		return getConstString(offset + 18, $sls_upri_imp_typ);
	}

	/**
	 * Sales unit price import type 販売単価取込区分.<p>
	 *
	 */
	public void sls_upri_imp_typ(String value) {
		setConstString(offset + 18, $sls_upri_imp_typ, value);
	}


	/**
	 * Sales unit price import type name 販売単価取込区分名.<p>
	 *
	 */
	public String sls_upri_imp_typ_nm() {
		return getConstString(offset + 19, $sls_upri_imp_typ_nm);
	}

	/**
	 * Sales unit price import type name 販売単価取込区分名.<p>
	 *
	 */
	public void sls_upri_imp_typ_nm(String value) {
		setConstString(offset + 19, $sls_upri_imp_typ_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sls_upri_imp_typ.equalsIgnoreCase(name)) {
			return sls_upri_imp_typ();
		}
		if ($sls_upri_imp_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_imp_typ_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($lump_flg.equalsIgnoreCase(name)) {
			return lump_flg();
		}
		if ($cmn_flg.equalsIgnoreCase(name)) {
			return cmn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sls_upri_imp_typ.equalsIgnoreCase(name)) {
			return sls_upri_imp_typ();
		}
		if ($sls_upri_imp_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_imp_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lump_flg.equalsIgnoreCase(name)) {
			return lump_flg();
		}
		if ($cmn_flg.equalsIgnoreCase(name)) {
			return cmn_flg();
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			return wg_flg();
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sls_upri_imp_typ.equalsIgnoreCase(name)) {
			sls_upri_imp_typ(value);
			return;
		}
		if ($sls_upri_imp_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_imp_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lump_flg.equalsIgnoreCase(name)) {
			lump_flg(value);
			return;
		}
		if ($cmn_flg.equalsIgnoreCase(name)) {
			cmn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($sls_upri_imp_typ.equalsIgnoreCase(name)) {
			sls_upri_imp_typ(value);
			return;
		}
		if ($sls_upri_imp_typ_nm.equalsIgnoreCase(name)) {
			sls_upri_imp_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lump_flg.equalsIgnoreCase(name)) {
			lump_flg(value);
			return;
		}
		if ($cmn_flg.equalsIgnoreCase(name)) {
			cmn_flg(value);
			return;
		}
		if ($wg_flg.equalsIgnoreCase(name)) {
			wg_flg(value);
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
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0240.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term_fr() {
		return term_p().term_fr();
	}

	public void term_fr(MCDate value) {
		term_p().term_fr(value);
	}

	public MCDate term_to() {
		return term_p().term_to();
	}

	public void term_to(MCDate value) {
		term_p().term_to(value);
	}

}

