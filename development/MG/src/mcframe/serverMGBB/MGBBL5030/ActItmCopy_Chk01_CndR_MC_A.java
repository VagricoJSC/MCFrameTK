package mcframe.serverMGBB.MGBBL5030;

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
 * ブロック"ActItmCopy_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ActItmCopy_Chk01_CndR_MC_A extends MCConstRow {

	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $act_calc_ctg_cd = "act_calc_ctg_cd";
	/**
	 * Copy source WG cd. コピー元ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
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
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public static final String $ptn_set_typ = "ptn_set_typ";
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


	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_calc_ctg_cd_META = createStringMeta($act_calc_ctg_cd);
	public static final MCMeta wg_cd_META = createStringMeta($wg_cd);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ptn_set_typ_META = createCommonMeta($ptn_set_typ, mcframe.commonMG.meta.MG_META.PTN_SET_TYP);
	public static final MCMeta itm_flg_META = createCommonMeta($itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_flg_META = createCommonMeta($oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bom_flg_META = createCommonMeta($bom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_flg_META = createCommonMeta($wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_flg_META = createCommonMeta($proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_flg_META = createCommonMeta($prov_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ActItmCopy_Chk01_CndR> constMetas = new ConstMetaList<ActItmCopy_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			act_calc_ctg_cd_META,
			wg_cd_META,
			ym_fr_META,
			ym_to_META,
			calc_ctg_cd_META,
			term_META,
			ptn_set_typ_META,
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
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$ym_fr, "ym:BF"},	// ym_fr
				{$ym_to, "ym:AF"}	// ym_to
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
				{$itm_flg, "tgt"},	// itm_flg
				{$dtl_flg, "tgt"},	// dtl_flg
				{$oper_flg, "tgt"},	// oper_flg
				{$bom_flg, "tgt"},	// bom_flg
				{$wk_flg, "tgt"},	// wk_flg
				{$purc_flg, "tgt"},	// purc_flg
				{$proc_flg, "tgt"},	// proc_flg
				{$prov_flg, "tgt"},	// prov_flg
				{$sls_flg, "tgt"}	// sls_flg
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected ActItmCopy_Chk01_CndR_MC_A(ConstMetaList<? extends ActItmCopy_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActItmCopy_Chk01_CndR clone() {
		return (ActItmCopy_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActItmCopy_Chk01_CndR createInstance() {
		return (ActItmCopy_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ActItmCopy_Chk01_CndR getValues(String... names) {
		return (ActItmCopy_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 0, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 0, $err_flg, value);
	}


	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public String act_calc_ctg_cd() {
		return getConstString(offset + 1, $act_calc_ctg_cd);
	}

	/**
	 * Calculation category cd. (Copy from) コピー元計算カテゴリＣＤ.<p>
	 *
	 */
	public void act_calc_ctg_cd(String value) {
		setConstString(offset + 1, $act_calc_ctg_cd, value);
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
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 3, $ym_fr);
	}

	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 3, $ym_fr, value);
	}


	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 4, $ym_to);
	}

	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 4, $ym_to, value);
	}


	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 5, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 5, $calc_ctg_cd, value);
	}


	/**
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 6, $term);
	}

	/**
	 * Term (Copy to) コピー先期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 6, $term, value);
	}


	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public String ptn_set_typ() {
		return getConstString(offset + 7, $ptn_set_typ);
	}

	/**
	 * BOM/Operation pattern setting type (Copy to) コピー先構成/工程パタン設定区分.<p>
	 *
	 */
	public void ptn_set_typ(String value) {
		setConstString(offset + 7, $ptn_set_typ, value);
	}


	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public boolean itm_flg() {
		return getConstBoolean(offset + 8, $itm_flg);
	}

	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public void itm_flg(boolean value) {
		setConstBoolean(offset + 8, $itm_flg, value);
	}


	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 9, $dtl_flg);
	}

	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 9, $dtl_flg, value);
	}


	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public boolean oper_flg() {
		return getConstBoolean(offset + 10, $oper_flg);
	}

	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public void oper_flg(boolean value) {
		setConstBoolean(offset + 10, $oper_flg, value);
	}


	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public boolean bom_flg() {
		return getConstBoolean(offset + 11, $bom_flg);
	}

	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public void bom_flg(boolean value) {
		setConstBoolean(offset + 11, $bom_flg, value);
	}


	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public boolean wk_flg() {
		return getConstBoolean(offset + 12, $wk_flg);
	}

	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public void wk_flg(boolean value) {
		setConstBoolean(offset + 12, $wk_flg, value);
	}


	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 13, $purc_flg);
	}

	/**
	 * Cost item purchase unit price 原価品目購買単価.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 13, $purc_flg, value);
	}


	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public boolean proc_flg() {
		return getConstBoolean(offset + 14, $proc_flg);
	}

	/**
	 * Cost item subcontracting unit price 原価品目加工単価.<p>
	 *
	 */
	public void proc_flg(boolean value) {
		setConstBoolean(offset + 14, $proc_flg, value);
	}


	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public boolean prov_flg() {
		return getConstBoolean(offset + 15, $prov_flg);
	}

	/**
	 * Cost item supply unit price 原価品目支給単価.<p>
	 *
	 */
	public void prov_flg(boolean value) {
		setConstBoolean(offset + 15, $prov_flg, value);
	}


	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 16, $sls_flg);
	}

	/**
	 * Cost item sales unit price 原価品目販売単価.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 16, $sls_flg, value);
	}


	public String getString(String name) {
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			return ptn_set_typ();
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
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			return ptn_set_typ();
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
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			ptn_set_typ(value);
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
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($ptn_set_typ.equalsIgnoreCase(name)) {
			ptn_set_typ(value);
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
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
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



}

