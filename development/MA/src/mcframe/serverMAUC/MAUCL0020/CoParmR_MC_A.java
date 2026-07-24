package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"CoParm"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CoParmR_MC_A extends MCConstRow {

	/**
	 * Cost company parameter 原価会社パラメータ.<p>
	 *
	 */
	public static final String $co = "co";

	public static final String $std_rnd_typ = $co + ".std_rnd_typ";
	public static final String $std_dec_place = $co + ".std_dec_place";
	public static final String $amt_rnd_typ = $co + ".amt_rnd_typ";
	public static final String $amt_dec_place = $co + ".amt_dec_place";
	public static final String $ave_rnd_typ = $co + ".ave_rnd_typ";
	public static final String $ave_dec_place = $co + ".ave_dec_place";
	public static final String $adj_typ = $co + ".adj_typ";
	public static final String $mrgn_expns_cd = $co + ".mrgn_expns_cd";
	public static final String $purc_expns_cd = $co + ".purc_expns_cd";
	public static final String $out_expns_cd = $co + ".out_expns_cd";
	public static final String $inpt_expns_cd = $co + ".inpt_expns_cd";
	public static final String $ss_expns_cd = $co + ".ss_expns_cd";
	public static final String $prov_expns_cd = $co + ".prov_expns_cd";
	public static final String $diff_use_typ = $co + ".diff_use_typ";
	public static final String $def_calc_ctg_cd = $co + ".def_calc_ctg_cd";
	public static final String $amt_disp_digit = $co + ".amt_disp_digit";
	public static final String $unit_disp_digit = $co + ".unit_disp_digit";
	public static final String $std_disp_digit = $co + ".std_disp_digit";
	public static final String $rate_disp_digit = $co + ".rate_disp_digit";
	public static final String $excel_pln_flg = $co + ".excel_pln_flg";
	public static final String $excel_act_flg = $co + ".excel_act_flg";
	public static final String $excel_alc_flg = $co + ".excel_alc_flg";

	public static final MCMeta co_META = createInnerRowMeta($co, mcframe.serverMA.dbc.MAM_CO_PARM_R.class);

	protected static final ConstMetaList<CoParmR> constMetas = new ConstMetaList<CoParmR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			co_META
		},
		new String[][]{
			{
				"std_rnd_typ",
				"std_dec_place",
				"amt_rnd_typ",
				"amt_dec_place",
				"ave_rnd_typ",
				"ave_dec_place",
				"adj_typ",
				"mrgn_expns_cd",
				"purc_expns_cd",
				"out_expns_cd",
				"inpt_expns_cd",
				"ss_expns_cd",
				"prov_expns_cd",
				"diff_use_typ",
				"def_calc_ctg_cd",
				"amt_disp_digit",
				"unit_disp_digit",
				"std_disp_digit",
				"rate_disp_digit",
				"excel_pln_flg",
				"excel_act_flg",
				"excel_alc_flg"
			},
			{
				$std_rnd_typ,
				$std_dec_place,
				$amt_rnd_typ,
				$amt_dec_place,
				$ave_rnd_typ,
				$ave_dec_place,
				$adj_typ,
				$mrgn_expns_cd,
				$purc_expns_cd,
				$out_expns_cd,
				$inpt_expns_cd,
				$ss_expns_cd,
				$prov_expns_cd,
				$diff_use_typ,
				$def_calc_ctg_cd,
				$amt_disp_digit,
				$unit_disp_digit,
				$std_disp_digit,
				$rate_disp_digit,
				$excel_pln_flg,
				$excel_act_flg,
				$excel_alc_flg
			}
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Cost company parameter 原価会社パラメータ.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_CO_PARM_R co(){
		return (mcframe.serverMA.dbc.MAM_CO_PARM_R) getConstInnerRow(offset + 0, $co);
	}
	
	/**
	 * Cost company parameter 原価会社パラメータ.<p>
	 *
	 */
	public void co(mcframe.serverMA.dbc.MAM_CO_PARM_R row){
		setConstInnerRow(offset + 0, $co, row);
	}






	public MCRow getInnerRow(String name) {
		if ($co.equalsIgnoreCase(name)) {
			return co();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($co.equalsIgnoreCase(name)) {
			co(
				((MCContainerMeta) co_META).castInnerRow(mcframe.serverMA.dbc.MAM_CO_PARM_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public String std_rnd_typ() {
		return co().std_rnd_typ();
	}

	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		co().std_rnd_typ(value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCNumber std_dec_place() {
		return co().std_dec_place();
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(MCNumber value) {
		co().std_dec_place(value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(int value) {
		co().std_dec_place(value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(long value) {
		co().std_dec_place(value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(float value) {
		co().std_dec_place(value);
	}

	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public void std_dec_place(double value) {
		co().std_dec_place(value);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String amt_rnd_typ() {
		return co().amt_rnd_typ();
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		co().amt_rnd_typ(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return co().amt_dec_place();
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		co().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		co().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		co().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		co().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		co().amt_dec_place(value);
	}

	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public String ave_rnd_typ() {
		return co().ave_rnd_typ();
	}

	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public void ave_rnd_typ(String value) {
		co().ave_rnd_typ(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ave_dec_place() {
		return co().ave_dec_place();
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(MCNumber value) {
		co().ave_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(int value) {
		co().ave_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(long value) {
		co().ave_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(float value) {
		co().ave_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void ave_dec_place(double value) {
		co().ave_dec_place(value);
	}

	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public String adj_typ() {
		return co().adj_typ();
	}

	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public void adj_typ(String value) {
		co().adj_typ(value);
	}

	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public String mrgn_expns_cd() {
		return co().mrgn_expns_cd();
	}

	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public void mrgn_expns_cd(String value) {
		co().mrgn_expns_cd(value);
	}

	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public String purc_expns_cd() {
		return co().purc_expns_cd();
	}

	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public void purc_expns_cd(String value) {
		co().purc_expns_cd(value);
	}

	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public String out_expns_cd() {
		return co().out_expns_cd();
	}

	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public void out_expns_cd(String value) {
		co().out_expns_cd(value);
	}

	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public String inpt_expns_cd() {
		return co().inpt_expns_cd();
	}

	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public void inpt_expns_cd(String value) {
		co().inpt_expns_cd(value);
	}

	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public String ss_expns_cd() {
		return co().ss_expns_cd();
	}

	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public void ss_expns_cd(String value) {
		co().ss_expns_cd(value);
	}

	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public String prov_expns_cd() {
		return co().prov_expns_cd();
	}

	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public void prov_expns_cd(String value) {
		co().prov_expns_cd(value);
	}

	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public String diff_use_typ() {
		return co().diff_use_typ();
	}

	/**
	 * Variance use type 差異使用区分.<p>
	 *
	 */
	public void diff_use_typ(String value) {
		co().diff_use_typ(value);
	}

	/**
	 * Default calculation category cd. デフォルト計算カテゴリＣＤ.<p>
	 *
	 */
	public String def_calc_ctg_cd() {
		return co().def_calc_ctg_cd();
	}

	/**
	 * Default calculation category cd. デフォルト計算カテゴリＣＤ.<p>
	 *
	 */
	public void def_calc_ctg_cd(String value) {
		co().def_calc_ctg_cd(value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCNumber amt_disp_digit() {
		return co().amt_disp_digit();
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(MCNumber value) {
		co().amt_disp_digit(value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(int value) {
		co().amt_disp_digit(value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(long value) {
		co().amt_disp_digit(value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(float value) {
		co().amt_disp_digit(value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(double value) {
		co().amt_disp_digit(value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCNumber unit_disp_digit() {
		return co().unit_disp_digit();
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(MCNumber value) {
		co().unit_disp_digit(value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(int value) {
		co().unit_disp_digit(value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(long value) {
		co().unit_disp_digit(value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(float value) {
		co().unit_disp_digit(value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(double value) {
		co().unit_disp_digit(value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCNumber std_disp_digit() {
		return co().std_disp_digit();
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(MCNumber value) {
		co().std_disp_digit(value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(int value) {
		co().std_disp_digit(value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(long value) {
		co().std_disp_digit(value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(float value) {
		co().std_disp_digit(value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(double value) {
		co().std_disp_digit(value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCNumber rate_disp_digit() {
		return co().rate_disp_digit();
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(MCNumber value) {
		co().rate_disp_digit(value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(int value) {
		co().rate_disp_digit(value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(long value) {
		co().rate_disp_digit(value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(float value) {
		co().rate_disp_digit(value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(double value) {
		co().rate_disp_digit(value);
	}

	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_pln_flg() {
		return co().excel_pln_flg();
	}

	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_pln_flg(boolean value) {
		co().excel_pln_flg(value);
	}

	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_act_flg() {
		return co().excel_act_flg();
	}

	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_act_flg(boolean value) {
		co().excel_act_flg(value);
	}

	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_alc_flg() {
		return co().excel_alc_flg();
	}

	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_alc_flg(boolean value) {
		co().excel_alc_flg(value);
	}

}

