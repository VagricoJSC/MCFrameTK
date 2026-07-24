package mcframe.serverMGBA.MGBAL0200;

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
 * ブロック"Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_CndR_MC_A extends MCConstRow {

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
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pln_ym_fr = "pln_ym_fr";
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
	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public static final String $amt_flg_str = "amt_flg_str";
	/**
	 * Precede transaction currency 取引通貨優先.<p>
	 *
	 */
	public static final String $trd_amt_flg_str = "trd_amt_flg_str";
	/**
	 * Result month 実績年月.<p>
	 *
	 */
	public static final String $act_ym = "act_ym";
	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public static final String $pln_ym = "pln_ym";
	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public static final String $bcur_cd = "bcur_cd";
	/**
	 * NULL character null文字.<p>
	 *
	 */
	public static final String $null_val = "null_val";
	/**
	 * Own company (Production) 自社（生産）.<p>
	 *
	 */
	public static final String $asst_prod = "asst_prod";
	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public static final String $prov_ffr = "prov_ffr";
	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public static final String $prov_onr = "prov_onr";
	/**
	 * Self supply 自給.<p>
	 *
	 */
	public static final String $prov_ss = "prov_ss";
	/**
	 * Input (Chargeable supply) 投入(有償).<p>
	 *
	 */
	public static final String $ac_slip_in_onr = "ac_slip_in_onr";
	/**
	 * Input (Self supply) 投入(自給).<p>
	 *
	 */
	public static final String $ac_slip_in_ss = "ac_slip_in_ss";


	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_calc_ctg_cd_META = createStringMeta($act_calc_ctg_cd);
	public static final MCMeta act_ym_fr_META = createCommonMeta($act_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta act_ym_to_META = createCommonMeta($act_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pln_calc_ctg_cd_META = createCommonMeta($pln_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta pln_ym_fr_META = createCommonMeta($pln_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_flg_META = createCommonMeta($inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_wk_flg_META = createCommonMeta($itm_wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta other_wk_flg_META = createCommonMeta($other_wk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_flg_str_META = createCommonMeta($amt_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta trd_amt_flg_str_META = createCommonMeta($trd_amt_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta act_ym_META = createCommonMeta($act_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pln_ym_META = createCommonMeta($pln_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bcur_cd_META = createCommonMeta($bcur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta null_val_META = createStringMeta($null_val);
	public static final MCMeta asst_prod_META = createCommonMeta($asst_prod, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta prov_ffr_META = createCommonMeta($prov_ffr, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_onr_META = createCommonMeta($prov_onr, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_ss_META = createCommonMeta($prov_ss, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ac_slip_in_onr_META = createCommonMeta($ac_slip_in_onr, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_in_ss_META = createCommonMeta($ac_slip_in_ss, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);

	protected static final ConstMetaList<Chk01_CndR> constMetas = new ConstMetaList<Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			act_calc_ctg_cd_META,
			act_ym_fr_META,
			act_ym_to_META,
			pln_calc_ctg_cd_META,
			pln_ym_fr_META,
			mfg_flg_META,
			purc_flg_META,
			inpt_flg_META,
			itm_wk_flg_META,
			other_wk_flg_META,
			sls_flg_META,
			amt_flg_str_META,
			trd_amt_flg_str_META,
			act_ym_META,
			pln_ym_META,
			bcur_cd_META,
			null_val_META,
			asst_prod_META,
			prov_ffr_META,
			prov_onr_META,
			prov_ss_META,
			ac_slip_in_onr_META,
			ac_slip_in_ss_META
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
				{$act_calc_ctg_cd, "E"},	// act_calc_ctg_cd
				{$act_ym_fr, "E"},	// act_ym_fr
				{$act_ym_to, "E"},	// act_ym_to
				{$pln_calc_ctg_cd, "E"},	// pln_calc_ctg_cd
				{$pln_ym_fr, "E"}	// pln_ym_fr
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
				{$act_ym_fr, "E1:BF"},	// act_ym_fr
				{$act_ym_to, "E1:AF"}	// act_ym_to
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
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$pln_calc_ctg_cd, "MA.MAUAL0010.CalcCtg"}	// pln_calc_ctg_cd
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
	protected Chk01_CndR_MC_A(ConstMetaList<? extends Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_CndR clone() {
		return (Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_CndR createInstance() {
		return (Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_CndR getValues(String... names) {
		return (Chk01_CndR) super.getValues(names);
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
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate act_ym_fr() {
		return getConstDate(offset + 2, $act_ym_fr);
	}

	/**
	 * Date FROM (Copy from) コピー元年月ＦＲＯＭ.<p>
	 *
	 */
	public void act_ym_fr(MCDate value) {
		setConstDate(offset + 2, $act_ym_fr, value);
	}


	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public MCDate act_ym_to() {
		return getConstDate(offset + 3, $act_ym_to);
	}

	/**
	 * Date TO (Copy from) コピー元年月ＴＯ.<p>
	 *
	 */
	public void act_ym_to(MCDate value) {
		setConstDate(offset + 3, $act_ym_to, value);
	}


	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public String pln_calc_ctg_cd() {
		return getConstString(offset + 4, $pln_calc_ctg_cd);
	}

	/**
	 * Calculation category cd. (Copy to) コピー先計算カテゴリＣＤ.<p>
	 *
	 */
	public void pln_calc_ctg_cd(String value) {
		setConstString(offset + 4, $pln_calc_ctg_cd, value);
	}


	/**
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pln_ym_fr() {
		return getConstDate(offset + 5, $pln_ym_fr);
	}

	/**
	 * Month FROM (Copy to) コピー先年月ＦＲＯＭ.<p>
	 *
	 */
	public void pln_ym_fr(MCDate value) {
		setConstDate(offset + 5, $pln_ym_fr, value);
	}


	/**
	 * Mfg. plan 製造計画.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 6, $mfg_flg);
	}

	/**
	 * Mfg. plan 製造計画.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 6, $mfg_flg, value);
	}


	/**
	 * Purchase plan 購買計画.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 7, $purc_flg);
	}

	/**
	 * Purchase plan 購買計画.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 7, $purc_flg, value);
	}


	/**
	 * Input plan 投入計画.<p>
	 *
	 */
	public boolean inpt_flg() {
		return getConstBoolean(offset + 8, $inpt_flg);
	}

	/**
	 * Input plan 投入計画.<p>
	 *
	 */
	public void inpt_flg(boolean value) {
		setConstBoolean(offset + 8, $inpt_flg, value);
	}


	/**
	 * Item man-hour plan 品目工数計画.<p>
	 *
	 */
	public boolean itm_wk_flg() {
		return getConstBoolean(offset + 9, $itm_wk_flg);
	}

	/**
	 * Item man-hour plan 品目工数計画.<p>
	 *
	 */
	public void itm_wk_flg(boolean value) {
		setConstBoolean(offset + 9, $itm_wk_flg, value);
	}


	/**
	 * Indirect man-hour plan 品目外工数計画.<p>
	 *
	 */
	public boolean other_wk_flg() {
		return getConstBoolean(offset + 10, $other_wk_flg);
	}

	/**
	 * Indirect man-hour plan 品目外工数計画.<p>
	 *
	 */
	public void other_wk_flg(boolean value) {
		setConstBoolean(offset + 10, $other_wk_flg, value);
	}


	/**
	 * Sales plan 売上計画.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 11, $sls_flg);
	}

	/**
	 * Sales plan 売上計画.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 11, $sls_flg, value);
	}


	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public String amt_flg_str() {
		return getConstString(offset + 12, $amt_flg_str);
	}

	/**
	 * Applied amount 金額反映.<p>
	 *
	 */
	public void amt_flg_str(String value) {
		setConstString(offset + 12, $amt_flg_str, value);
	}


	/**
	 * Precede transaction currency 取引通貨優先.<p>
	 *
	 */
	public String trd_amt_flg_str() {
		return getConstString(offset + 13, $trd_amt_flg_str);
	}

	/**
	 * Precede transaction currency 取引通貨優先.<p>
	 *
	 */
	public void trd_amt_flg_str(String value) {
		setConstString(offset + 13, $trd_amt_flg_str, value);
	}


	/**
	 * Result month 実績年月.<p>
	 *
	 */
	public MCDate act_ym() {
		return getConstDate(offset + 14, $act_ym);
	}

	/**
	 * Result month 実績年月.<p>
	 *
	 */
	public void act_ym(MCDate value) {
		setConstDate(offset + 14, $act_ym, value);
	}


	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public MCDate pln_ym() {
		return getConstDate(offset + 15, $pln_ym);
	}

	/**
	 * Plan month 計画年月.<p>
	 *
	 */
	public void pln_ym(MCDate value) {
		setConstDate(offset + 15, $pln_ym, value);
	}


	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public String bcur_cd() {
		return getConstString(offset + 16, $bcur_cd);
	}

	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public void bcur_cd(String value) {
		setConstString(offset + 16, $bcur_cd, value);
	}


	/**
	 * NULL character null文字.<p>
	 *
	 */
	public String null_val() {
		return getConstString(offset + 17, $null_val);
	}

	/**
	 * NULL character null文字.<p>
	 *
	 */
	public void null_val(String value) {
		setConstString(offset + 17, $null_val, value);
	}


	/**
	 * Own company (Production) 自社（生産）.<p>
	 *
	 */
	public String asst_prod() {
		return getConstString(offset + 18, $asst_prod);
	}

	/**
	 * Own company (Production) 自社（生産）.<p>
	 *
	 */
	public void asst_prod(String value) {
		setConstString(offset + 18, $asst_prod, value);
	}


	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public String prov_ffr() {
		return getConstString(offset + 19, $prov_ffr);
	}

	/**
	 * Non-chargeable supply 無償支給.<p>
	 *
	 */
	public void prov_ffr(String value) {
		setConstString(offset + 19, $prov_ffr, value);
	}


	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public String prov_onr() {
		return getConstString(offset + 20, $prov_onr);
	}

	/**
	 * Chargeable supply 有償支給.<p>
	 *
	 */
	public void prov_onr(String value) {
		setConstString(offset + 20, $prov_onr, value);
	}


	/**
	 * Self supply 自給.<p>
	 *
	 */
	public String prov_ss() {
		return getConstString(offset + 21, $prov_ss);
	}

	/**
	 * Self supply 自給.<p>
	 *
	 */
	public void prov_ss(String value) {
		setConstString(offset + 21, $prov_ss, value);
	}


	/**
	 * Input (Chargeable supply) 投入(有償).<p>
	 *
	 */
	public String ac_slip_in_onr() {
		return getConstString(offset + 22, $ac_slip_in_onr);
	}

	/**
	 * Input (Chargeable supply) 投入(有償).<p>
	 *
	 */
	public void ac_slip_in_onr(String value) {
		setConstString(offset + 22, $ac_slip_in_onr, value);
	}


	/**
	 * Input (Self supply) 投入(自給).<p>
	 *
	 */
	public String ac_slip_in_ss() {
		return getConstString(offset + 23, $ac_slip_in_ss);
	}

	/**
	 * Input (Self supply) 投入(自給).<p>
	 *
	 */
	public void ac_slip_in_ss(String value) {
		setConstString(offset + 23, $ac_slip_in_ss, value);
	}


	public String getString(String name) {
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($amt_flg_str.equalsIgnoreCase(name)) {
			return amt_flg_str();
		}
		if ($trd_amt_flg_str.equalsIgnoreCase(name)) {
			return trd_amt_flg_str();
		}
		if ($bcur_cd.equalsIgnoreCase(name)) {
			return bcur_cd();
		}
		if ($null_val.equalsIgnoreCase(name)) {
			return null_val();
		}
		if ($asst_prod.equalsIgnoreCase(name)) {
			return asst_prod();
		}
		if ($prov_ffr.equalsIgnoreCase(name)) {
			return prov_ffr();
		}
		if ($prov_onr.equalsIgnoreCase(name)) {
			return prov_onr();
		}
		if ($prov_ss.equalsIgnoreCase(name)) {
			return prov_ss();
		}
		if ($ac_slip_in_onr.equalsIgnoreCase(name)) {
			return ac_slip_in_onr();
		}
		if ($ac_slip_in_ss.equalsIgnoreCase(name)) {
			return ac_slip_in_ss();
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
		if ($act_ym.equalsIgnoreCase(name)) {
			return act_ym();
		}
		if ($pln_ym.equalsIgnoreCase(name)) {
			return pln_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			return act_calc_ctg_cd();
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			return pln_calc_ctg_cd();
		}
		if ($amt_flg_str.equalsIgnoreCase(name)) {
			return amt_flg_str();
		}
		if ($trd_amt_flg_str.equalsIgnoreCase(name)) {
			return trd_amt_flg_str();
		}
		if ($bcur_cd.equalsIgnoreCase(name)) {
			return bcur_cd();
		}
		if ($null_val.equalsIgnoreCase(name)) {
			return null_val();
		}
		if ($asst_prod.equalsIgnoreCase(name)) {
			return asst_prod();
		}
		if ($prov_ffr.equalsIgnoreCase(name)) {
			return prov_ffr();
		}
		if ($prov_onr.equalsIgnoreCase(name)) {
			return prov_onr();
		}
		if ($prov_ss.equalsIgnoreCase(name)) {
			return prov_ss();
		}
		if ($ac_slip_in_onr.equalsIgnoreCase(name)) {
			return ac_slip_in_onr();
		}
		if ($ac_slip_in_ss.equalsIgnoreCase(name)) {
			return ac_slip_in_ss();
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
		if ($act_ym.equalsIgnoreCase(name)) {
			return act_ym();
		}
		if ($pln_ym.equalsIgnoreCase(name)) {
			return pln_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
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
		if ($bcur_cd.equalsIgnoreCase(name)) {
			bcur_cd(value);
			return;
		}
		if ($null_val.equalsIgnoreCase(name)) {
			null_val(value);
			return;
		}
		if ($asst_prod.equalsIgnoreCase(name)) {
			asst_prod(value);
			return;
		}
		if ($prov_ffr.equalsIgnoreCase(name)) {
			prov_ffr(value);
			return;
		}
		if ($prov_onr.equalsIgnoreCase(name)) {
			prov_onr(value);
			return;
		}
		if ($prov_ss.equalsIgnoreCase(name)) {
			prov_ss(value);
			return;
		}
		if ($ac_slip_in_onr.equalsIgnoreCase(name)) {
			ac_slip_in_onr(value);
			return;
		}
		if ($ac_slip_in_ss.equalsIgnoreCase(name)) {
			ac_slip_in_ss(value);
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
		if ($act_ym.equalsIgnoreCase(name)) {
			act_ym(value);
			return;
		}
		if ($pln_ym.equalsIgnoreCase(name)) {
			pln_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($act_calc_ctg_cd.equalsIgnoreCase(name)) {
			act_calc_ctg_cd(value);
			return;
		}
		if ($pln_calc_ctg_cd.equalsIgnoreCase(name)) {
			pln_calc_ctg_cd(value);
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
		if ($bcur_cd.equalsIgnoreCase(name)) {
			bcur_cd(value);
			return;
		}
		if ($null_val.equalsIgnoreCase(name)) {
			null_val(value);
			return;
		}
		if ($asst_prod.equalsIgnoreCase(name)) {
			asst_prod(value);
			return;
		}
		if ($prov_ffr.equalsIgnoreCase(name)) {
			prov_ffr(value);
			return;
		}
		if ($prov_onr.equalsIgnoreCase(name)) {
			prov_onr(value);
			return;
		}
		if ($prov_ss.equalsIgnoreCase(name)) {
			prov_ss(value);
			return;
		}
		if ($ac_slip_in_onr.equalsIgnoreCase(name)) {
			ac_slip_in_onr(value);
			return;
		}
		if ($ac_slip_in_ss.equalsIgnoreCase(name)) {
			ac_slip_in_ss(value);
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
		if ($act_ym.equalsIgnoreCase(name)) {
			act_ym(value);
			return;
		}
		if ($pln_ym.equalsIgnoreCase(name)) {
			pln_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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

