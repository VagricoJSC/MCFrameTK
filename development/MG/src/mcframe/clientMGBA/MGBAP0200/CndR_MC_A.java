package mcframe.clientMGBA.MGBAP0200;

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
	 * MLY,Copy by month;SMR,Aggregate and copy MLY,年月別にコピーする;SMR,集計してコピーする.<p>
	 *
	 */
	public static final String $ope = "ope";
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
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $act_ym_fr = "act_ym_fr";
	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public static final String $act_ym_to = "act_ym_to";
	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $pln_calc_ctg_cd = "pln_calc_ctg_cd";
	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public static final String $pln_calc_ctg_nm = "pln_calc_ctg_nm";
	/**
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pln_ym_fr = "pln_ym_fr";
	/**
	 * Month TO (Copy to) コピー先年月ＴＯ.<p>
	 *
	 */
	public static final String $pln_ym_to = "pln_ym_to";
	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public static final String $amt_flg = "amt_flg";
	/**
	 * BCUR,Base currency;TRD,Transaction currency BCUR,基準通貨;TRD,取引通貨.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Mfg. plan 製造計画.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Purchase plan 購買計画.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Input plan 投入計画.<p>
	 *
	 */
	public static final String $inpt_flg = "inpt_flg";
	/**
	 * Item man-hour plan 品目工数計画.<p>
	 *
	 */
	public static final String $itm_wk_flg = "itm_wk_flg";
	/**
	 * Indirect man-hour plan 品目外工数計画.<p>
	 *
	 */
	public static final String $other_wk_flg = "other_wk_flg";
	/**
	 * Sales plan 売上計画.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	public static final String $amt_flg_str = "amt_flg_str";
	public static final String $trd_amt_flg_str = "trd_amt_flg_str";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta act_calc_ctg_cd_META = createCommonMeta($act_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta act_calc_ctg_nm_META = createCommonMeta($act_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta act_ym_fr_META = createCommonMeta($act_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta act_ym_to_META = createCommonMeta($act_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pln_calc_ctg_cd_META = createCommonMeta($pln_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta pln_calc_ctg_nm_META = createCommonMeta($pln_calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta pln_ym_fr_META = createCommonMeta($pln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pln_ym_to_META = createCommonMeta($pln_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta amt_flg_META = createCommonMeta($amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_META = createStringMeta($amt);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_flg_META = createCommonMeta($inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_wk_flg_META = createCommonMeta($itm_wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta other_wk_flg_META = createCommonMeta($other_wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_flg_str_META = createCommonMeta($amt_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta trd_amt_flg_str_META = createCommonMeta($trd_amt_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			act_calc_ctg_cd_META,
			act_calc_ctg_nm_META,
			act_ym_fr_META,
			act_ym_to_META,
			pln_calc_ctg_cd_META,
			pln_calc_ctg_nm_META,
			pln_ym_fr_META,
			pln_ym_to_META,
			amt_flg_META,
			amt_META,
			mfg_flg_META,
			purc_flg_META,
			inpt_flg_META,
			itm_wk_flg_META,
			other_wk_flg_META,
			sls_flg_META,
			amt_flg_str_META,
			trd_amt_flg_str_META
		},
		new String[][]{
			{
			},
			{
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$act_calc_ctg_cd, "calc_ctg_nm"},	// act_calc_ctg_cd
				{$pln_calc_ctg_cd, "calc_ctg_nm"}	// pln_calc_ctg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	 * MLY,Copy by month;SMR,Aggregate and copy MLY,年月別にコピーする;SMR,集計してコピーする.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * MLY,Copy by month;SMR,Aggregate and copy MLY,年月別にコピーする;SMR,集計してコピーする.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
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
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public String act_calc_ctg_nm() {
		return getConstString(offset + 2, $act_calc_ctg_nm);
	}

	/**
	 * Calculation category name (Copy from) コピー元計算カテゴリ名.<p>
	 *
	 */
	public void act_calc_ctg_nm(String value) {
		setConstString(offset + 2, $act_calc_ctg_nm, value);
	}


	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate act_ym_fr() {
		return getConstDate(offset + 3, $act_ym_fr);
	}

	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public void act_ym_fr(MCDate value) {
		setConstDate(offset + 3, $act_ym_fr, value);
	}


	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public MCDate act_ym_to() {
		return getConstDate(offset + 4, $act_ym_to);
	}

	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public void act_ym_to(MCDate value) {
		setConstDate(offset + 4, $act_ym_to, value);
	}


	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public String pln_calc_ctg_cd() {
		return getConstString(offset + 5, $pln_calc_ctg_cd);
	}

	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public void pln_calc_ctg_cd(String value) {
		setConstString(offset + 5, $pln_calc_ctg_cd, value);
	}


	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public String pln_calc_ctg_nm() {
		return getConstString(offset + 6, $pln_calc_ctg_nm);
	}

	/**
	 * Calculation category name (Copy to) コピー先計算カテゴリ名.<p>
	 *
	 */
	public void pln_calc_ctg_nm(String value) {
		setConstString(offset + 6, $pln_calc_ctg_nm, value);
	}


	/**
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pln_ym_fr() {
		return getConstDate(offset + 7, $pln_ym_fr);
	}

	/**
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public void pln_ym_fr(MCDate value) {
		setConstDate(offset + 7, $pln_ym_fr, value);
	}


	/**
	 * Month TO (Copy to) コピー先年月ＴＯ.<p>
	 *
	 */
	public MCDate pln_ym_to() {
		return getConstDate(offset + 8, $pln_ym_to);
	}

	/**
	 * Month TO (Copy to) コピー先年月ＴＯ.<p>
	 *
	 */
	public void pln_ym_to(MCDate value) {
		setConstDate(offset + 8, $pln_ym_to, value);
	}


	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public boolean amt_flg() {
		return getConstBoolean(offset + 9, $amt_flg);
	}

	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public void amt_flg(boolean value) {
		setConstBoolean(offset + 9, $amt_flg, value);
	}


	/**
	 * BCUR,Base currency;TRD,Transaction currency BCUR,基準通貨;TRD,取引通貨.<p>
	 *
	 */
	public String amt() {
		return getConstString(offset + 10, $amt);
	}

	/**
	 * BCUR,Base currency;TRD,Transaction currency BCUR,基準通貨;TRD,取引通貨.<p>
	 *
	 */
	public void amt(String value) {
		setConstString(offset + 10, $amt, value);
	}


	/**
	 * Mfg. plan 製造計画.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 11, $mfg_flg);
	}

	/**
	 * Mfg. plan 製造計画.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 11, $mfg_flg, value);
	}


	/**
	 * Purchase plan 購買計画.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 12, $purc_flg);
	}

	/**
	 * Purchase plan 購買計画.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 12, $purc_flg, value);
	}


	/**
	 * Input plan 投入計画.<p>
	 *
	 */
	public boolean inpt_flg() {
		return getConstBoolean(offset + 13, $inpt_flg);
	}

	/**
	 * Input plan 投入計画.<p>
	 *
	 */
	public void inpt_flg(boolean value) {
		setConstBoolean(offset + 13, $inpt_flg, value);
	}


	/**
	 * Item man-hour plan 品目工数計画.<p>
	 *
	 */
	public boolean itm_wk_flg() {
		return getConstBoolean(offset + 14, $itm_wk_flg);
	}

	/**
	 * Item man-hour plan 品目工数計画.<p>
	 *
	 */
	public void itm_wk_flg(boolean value) {
		setConstBoolean(offset + 14, $itm_wk_flg, value);
	}


	/**
	 * Indirect man-hour plan 品目外工数計画.<p>
	 *
	 */
	public boolean other_wk_flg() {
		return getConstBoolean(offset + 15, $other_wk_flg);
	}

	/**
	 * Indirect man-hour plan 品目外工数計画.<p>
	 *
	 */
	public void other_wk_flg(boolean value) {
		setConstBoolean(offset + 15, $other_wk_flg, value);
	}


	/**
	 * Sales plan 売上計画.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 16, $sls_flg);
	}

	/**
	 * Sales plan 売上計画.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 16, $sls_flg, value);
	}


	public String amt_flg_str() {
		return getConstString(offset + 17, $amt_flg_str);
	}

	public void amt_flg_str(String value) {
		setConstString(offset + 17, $amt_flg_str, value);
	}


	public String trd_amt_flg_str() {
		return getConstString(offset + 18, $trd_amt_flg_str);
	}

	public void trd_amt_flg_str(String value) {
		setConstString(offset + 18, $trd_amt_flg_str, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			return pln_calc_ctg_nm();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($amt_flg_str.equalsIgnoreCase(name)) {
			return amt_flg_str();
		}
		if ($trd_amt_flg_str.equalsIgnoreCase(name)) {
			return trd_amt_flg_str();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($act_ym_fr.equalsIgnoreCase(name)) {
			return act_ym_fr();
		}
		if ($act_ym_to.equalsIgnoreCase(name)) {
			return act_ym_to();
		}
		if ($pln_ym_fr.equalsIgnoreCase(name)) {
			return pln_ym_fr();
		}
		if ($pln_ym_to.equalsIgnoreCase(name)) {
			return pln_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		if ($itm_wk_flg.equalsIgnoreCase(name)) {
			return itm_wk_flg();
		}
		if ($other_wk_flg.equalsIgnoreCase(name)) {
			return other_wk_flg();
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
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			return act_calc_ctg_nm();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			return pln_calc_ctg_nm();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($amt_flg_str.equalsIgnoreCase(name)) {
			return amt_flg_str();
		}
		if ($trd_amt_flg_str.equalsIgnoreCase(name)) {
			return trd_amt_flg_str();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($act_ym_fr.equalsIgnoreCase(name)) {
			return act_ym_fr();
		}
		if ($act_ym_to.equalsIgnoreCase(name)) {
			return act_ym_to();
		}
		if ($pln_ym_fr.equalsIgnoreCase(name)) {
			return pln_ym_fr();
		}
		if ($pln_ym_to.equalsIgnoreCase(name)) {
			return pln_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($amt_flg.equalsIgnoreCase(name)) {
			return amt_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			return inpt_flg();
		}
		if ($itm_wk_flg.equalsIgnoreCase(name)) {
			return itm_wk_flg();
		}
		if ($other_wk_flg.equalsIgnoreCase(name)) {
			return other_wk_flg();
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
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			pln_calc_ctg_nm(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($amt_flg_str.equalsIgnoreCase(name)) {
			amt_flg_str(value);
			return;
		}
		if ($trd_amt_flg_str.equalsIgnoreCase(name)) {
			trd_amt_flg_str(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($act_ym_fr.equalsIgnoreCase(name)) {
			act_ym_fr(value);
			return;
		}
		if ($act_ym_to.equalsIgnoreCase(name)) {
			act_ym_to(value);
			return;
		}
		if ($pln_ym_fr.equalsIgnoreCase(name)) {
			pln_ym_fr(value);
			return;
		}
		if ($pln_ym_to.equalsIgnoreCase(name)) {
			pln_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		if ($itm_wk_flg.equalsIgnoreCase(name)) {
			itm_wk_flg(value);
			return;
		}
		if ($other_wk_flg.equalsIgnoreCase(name)) {
			other_wk_flg(value);
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
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($act_calc_ctg_nm.equalsIgnoreCase(name)) {
			act_calc_ctg_nm(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_nm.equalsIgnoreCase(name)) {
			pln_calc_ctg_nm(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($amt_flg_str.equalsIgnoreCase(name)) {
			amt_flg_str(value);
			return;
		}
		if ($trd_amt_flg_str.equalsIgnoreCase(name)) {
			trd_amt_flg_str(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($act_ym_fr.equalsIgnoreCase(name)) {
			act_ym_fr(value);
			return;
		}
		if ($act_ym_to.equalsIgnoreCase(name)) {
			act_ym_to(value);
			return;
		}
		if ($pln_ym_fr.equalsIgnoreCase(name)) {
			pln_ym_fr(value);
			return;
		}
		if ($pln_ym_to.equalsIgnoreCase(name)) {
			pln_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($amt_flg.equalsIgnoreCase(name)) {
			amt_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($inpt_flg.equalsIgnoreCase(name)) {
			inpt_flg(value);
			return;
		}
		if ($itm_wk_flg.equalsIgnoreCase(name)) {
			itm_wk_flg(value);
			return;
		}
		if ($other_wk_flg.equalsIgnoreCase(name)) {
			other_wk_flg(value);
			return;
		}
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

