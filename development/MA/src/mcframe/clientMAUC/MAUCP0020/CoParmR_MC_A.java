package mcframe.clientMAUC.MAUCP0020;

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
 * ブロック"CoParm"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CoParmR_MC_A extends MCConstRow {

	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public static final String $std_dec_place = "std_dec_place";
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public static final String $ave_rnd_typ = "ave_rnd_typ";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ave_dec_place = "ave_dec_place";
	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public static final String $adj_typ = "adj_typ";
	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public static final String $mrgn_expns_cd = "mrgn_expns_cd";
	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public static final String $purc_expns_cd = "purc_expns_cd";
	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public static final String $out_expns_cd = "out_expns_cd";
	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public static final String $inpt_expns_cd = "inpt_expns_cd";
	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public static final String $ss_expns_cd = "ss_expns_cd";
	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public static final String $prov_expns_cd = "prov_expns_cd";
	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public static final String $diff_use_typ = "diff_use_typ";
	/**
	 * Default calculation category cd. デフォルト計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $def_calc_ctg_cd = "def_calc_ctg_cd";
	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public static final String $amt_disp_digit = "amt_disp_digit";
	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public static final String $unit_disp_digit = "unit_disp_digit";
	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public static final String $std_disp_digit = "std_disp_digit";
	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public static final String $rate_disp_digit = "rate_disp_digit";
	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public static final String $excel_pln_flg = "excel_pln_flg";
	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public static final String $excel_act_flg = "excel_act_flg";
	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public static final String $excel_alc_flg = "excel_alc_flg";


	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_dec_place_META = createCommonMeta($std_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ave_rnd_typ_META = createCommonMeta($ave_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta ave_dec_place_META = createCommonMeta($ave_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta adj_typ_META = createCommonMeta($adj_typ, mcframe.commonMA.meta.MA_META.ADJ_TYP);
	public static final MCMeta mrgn_expns_cd_META = createCommonMeta($mrgn_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta purc_expns_cd_META = createCommonMeta($purc_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta out_expns_cd_META = createCommonMeta($out_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta inpt_expns_cd_META = createCommonMeta($inpt_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta ss_expns_cd_META = createCommonMeta($ss_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta prov_expns_cd_META = createCommonMeta($prov_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta diff_use_typ_META = createCommonMeta($diff_use_typ, mcframe.commonMA.meta.MA_META.DIFF_USE_TYP);
	public static final MCMeta def_calc_ctg_cd_META = createCommonMeta($def_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta amt_disp_digit_META = createCommonMeta($amt_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta unit_disp_digit_META = createCommonMeta($unit_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta std_disp_digit_META = createCommonMeta($std_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta rate_disp_digit_META = createCommonMeta($rate_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta excel_pln_flg_META = createCommonMeta($excel_pln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_act_flg_META = createCommonMeta($excel_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_alc_flg_META = createCommonMeta($excel_alc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CoParmR> constMetas = new ConstMetaList<CoParmR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			std_rnd_typ_META,
			std_dec_place_META,
			amt_rnd_typ_META,
			amt_dec_place_META,
			ave_rnd_typ_META,
			ave_dec_place_META,
			adj_typ_META,
			mrgn_expns_cd_META,
			purc_expns_cd_META,
			out_expns_cd_META,
			inpt_expns_cd_META,
			ss_expns_cd_META,
			prov_expns_cd_META,
			diff_use_typ_META,
			def_calc_ctg_cd_META,
			amt_disp_digit_META,
			unit_disp_digit_META,
			std_disp_digit_META,
			rate_disp_digit_META,
			excel_pln_flg_META,
			excel_act_flg_META,
			excel_alc_flg_META
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


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected CoParmR_MC_A(ConstMetaList<? extends CoParmR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoParmR clone() {
		return (CoParmR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoParmR createInstance() {
		return (CoParmR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CoParmR getValues(String... names) {
		return (CoParmR) super.getValues(names);
	}



	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 0, $std_rnd_typ);
	}

	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 0, $std_rnd_typ, value);
	}


	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return getConstNumber(offset + 1, $std_dec_place);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		setConstNumber(offset + 1, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(int value) {
		setConstNumber(offset + 1, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(long value) {
		setConstNumber(offset + 1, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(float value) {
		setConstNumber(offset + 1, $std_dec_place, value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(double value) {
		setConstNumber(offset + 1, $std_dec_place, value);
	}


	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 2, $amt_rnd_typ);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 2, $amt_rnd_typ, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 3, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 3, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 3, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 3, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 3, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 3, $amt_dec_place, value);
	}


	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public String ave_rnd_typ() {
		return getConstString(offset + 4, $ave_rnd_typ);
	}

	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		setConstString(offset + 4, $ave_rnd_typ, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return getConstNumber(offset + 5, $ave_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		setConstNumber(offset + 5, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		setConstNumber(offset + 5, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		setConstNumber(offset + 5, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		setConstNumber(offset + 5, $ave_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		setConstNumber(offset + 5, $ave_dec_place, value);
	}


	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public String adj_typ() {
		return getConstString(offset + 6, $adj_typ);
	}

	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public void adj_typ(String value) {
		setConstString(offset + 6, $adj_typ, value);
	}


	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return getConstString(offset + 7, $mrgn_expns_cd);
	}

	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		setConstString(offset + 7, $mrgn_expns_cd, value);
	}


	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public String purc_expns_cd() {
		return getConstString(offset + 8, $purc_expns_cd);
	}

	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		setConstString(offset + 8, $purc_expns_cd, value);
	}


	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public String out_expns_cd() {
		return getConstString(offset + 9, $out_expns_cd);
	}

	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public void out_expns_cd(String value) {
		setConstString(offset + 9, $out_expns_cd, value);
	}


	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public String inpt_expns_cd() {
		return getConstString(offset + 10, $inpt_expns_cd);
	}

	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		setConstString(offset + 10, $inpt_expns_cd, value);
	}


	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public String ss_expns_cd() {
		return getConstString(offset + 11, $ss_expns_cd);
	}

	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		setConstString(offset + 11, $ss_expns_cd, value);
	}


	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public String prov_expns_cd() {
		return getConstString(offset + 12, $prov_expns_cd);
	}

	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		setConstString(offset + 12, $prov_expns_cd, value);
	}


	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public String diff_use_typ() {
		return getConstString(offset + 13, $diff_use_typ);
	}

	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public void diff_use_typ(String value) {
		setConstString(offset + 13, $diff_use_typ, value);
	}


	/**
	 * Default calculation category cd. デフォルト計算カテゴリＣＤ.<p>
	 *
	 */
	public String def_calc_ctg_cd() {
		return getConstString(offset + 14, $def_calc_ctg_cd);
	}

	/**
	 * Default calculation category cd. デフォルト計算カテゴリＣＤ.<p>
	 *
	 */
	public void def_calc_ctg_cd(String value) {
		setConstString(offset + 14, $def_calc_ctg_cd, value);
	}


	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCNumber amt_disp_digit() {
		return getConstNumber(offset + 15, $amt_disp_digit);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(MCNumber value) {
		setConstNumber(offset + 15, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(int value) {
		setConstNumber(offset + 15, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(long value) {
		setConstNumber(offset + 15, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(float value) {
		setConstNumber(offset + 15, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(double value) {
		setConstNumber(offset + 15, $amt_disp_digit, value);
	}


	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCNumber unit_disp_digit() {
		return getConstNumber(offset + 16, $unit_disp_digit);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(MCNumber value) {
		setConstNumber(offset + 16, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(int value) {
		setConstNumber(offset + 16, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(long value) {
		setConstNumber(offset + 16, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(float value) {
		setConstNumber(offset + 16, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(double value) {
		setConstNumber(offset + 16, $unit_disp_digit, value);
	}


	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCNumber std_disp_digit() {
		return getConstNumber(offset + 17, $std_disp_digit);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(MCNumber value) {
		setConstNumber(offset + 17, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(int value) {
		setConstNumber(offset + 17, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(long value) {
		setConstNumber(offset + 17, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(float value) {
		setConstNumber(offset + 17, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(double value) {
		setConstNumber(offset + 17, $std_disp_digit, value);
	}


	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCNumber rate_disp_digit() {
		return getConstNumber(offset + 18, $rate_disp_digit);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(MCNumber value) {
		setConstNumber(offset + 18, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(int value) {
		setConstNumber(offset + 18, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(long value) {
		setConstNumber(offset + 18, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(float value) {
		setConstNumber(offset + 18, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(double value) {
		setConstNumber(offset + 18, $rate_disp_digit, value);
	}


	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_pln_flg() {
		return getConstBoolean(offset + 19, $excel_pln_flg);
	}

	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_pln_flg(boolean value) {
		setConstBoolean(offset + 19, $excel_pln_flg, value);
	}


	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_act_flg() {
		return getConstBoolean(offset + 20, $excel_act_flg);
	}

	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_act_flg(boolean value) {
		setConstBoolean(offset + 20, $excel_act_flg, value);
	}


	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_alc_flg() {
		return getConstBoolean(offset + 21, $excel_alc_flg);
	}

	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_alc_flg(boolean value) {
		setConstBoolean(offset + 21, $excel_alc_flg, value);
	}


	public String getString(String name) {
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			return diff_use_typ();
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			return def_calc_ctg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			return ave_rnd_typ();
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			return adj_typ();
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			return mrgn_expns_cd();
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			return purc_expns_cd();
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			return out_expns_cd();
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			return inpt_expns_cd();
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			return ss_expns_cd();
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			return prov_expns_cd();
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			return diff_use_typ();
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			return def_calc_ctg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			return std_dec_place();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			return ave_dec_place();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			diff_use_typ(value);
			return;
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			def_calc_ctg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($ave_rnd_typ.equalsIgnoreCase(name)) {
			ave_rnd_typ(value);
			return;
		}
		if ($adj_typ.equalsIgnoreCase(name)) {
			adj_typ(value);
			return;
		}
		if ($mrgn_expns_cd.equalsIgnoreCase(name)) {
			mrgn_expns_cd(value);
			return;
		}
		if ($purc_expns_cd.equalsIgnoreCase(name)) {
			purc_expns_cd(value);
			return;
		}
		if ($out_expns_cd.equalsIgnoreCase(name)) {
			out_expns_cd(value);
			return;
		}
		if ($inpt_expns_cd.equalsIgnoreCase(name)) {
			inpt_expns_cd(value);
			return;
		}
		if ($ss_expns_cd.equalsIgnoreCase(name)) {
			ss_expns_cd(value);
			return;
		}
		if ($prov_expns_cd.equalsIgnoreCase(name)) {
			prov_expns_cd(value);
			return;
		}
		if ($diff_use_typ.equalsIgnoreCase(name)) {
			diff_use_typ(value);
			return;
		}
		if ($def_calc_ctg_cd.equalsIgnoreCase(name)) {
			def_calc_ctg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($std_dec_place.equalsIgnoreCase(name)) {
			std_dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($ave_dec_place.equalsIgnoreCase(name)) {
			ave_dec_place(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

