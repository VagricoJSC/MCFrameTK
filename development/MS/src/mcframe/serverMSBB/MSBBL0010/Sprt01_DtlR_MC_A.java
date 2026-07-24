package mcframe.serverMSBB.MSBBL0010;

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
 * ブロック"Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public static final String $frcst_period_typ = "frcst_period_typ";
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public static final String $frcst_st_dt = "frcst_st_dt";
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public static final String $frcst_end_dt = "frcst_end_dt";
	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public static final String $frcst_dt = "frcst_dt";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public static final String $last_qty = "last_qty";
	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public static final String $last_cst_frcst_prnt_dt = "last_cst_frcst_prnt_dt";
	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public static final String $last_rcpt_dt = "last_rcpt_dt";
	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public static final String $slo_qty = "slo_qty";
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_d_no = "cst_frcst_d_no";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta frcst_period_typ_META = createCommonMeta($frcst_period_typ, mcframe.commonMS.meta.MS_META.PERIOD_TYP);
	public static final MCMeta frcst_st_dt_META = createCommonMeta($frcst_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta frcst_end_dt_META = createCommonMeta($frcst_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta frcst_dt_META = createCommonMeta($frcst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta last_qty_META = createCommonMeta($last_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta last_cst_frcst_prnt_dt_META = createCommonMeta($last_cst_frcst_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_rcpt_dt_META = createCommonMeta($last_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_qty_META = createCommonMeta($slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cst_frcst_d_no_META = createCommonMeta($cst_frcst_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_D_NO);

	protected static final ConstMetaList<Sprt01_DtlR> constMetas = new ConstMetaList<Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			frcst_period_typ_META,
			frcst_st_dt_META,
			frcst_end_dt_META,
			frcst_dt_META,
			trd_unit_cd_META,
			cst_itm_cd_META,
			base_unit_cd_META,
			last_qty_META,
			last_cst_frcst_prnt_dt_META,
			last_rcpt_dt_META,
			spln_qty_META,
			slo_qty_META,
			cst_frcst_d_no_META
		},
		new String[][]{
			{
			},
			{
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
	protected Sprt01_DtlR_MC_A(ConstMetaList<? extends Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR clone() {
		return (Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR createInstance() {
		return (Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR getValues(String... names) {
		return (Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public String frcst_period_typ() {
		return getConstString(offset + 5, $frcst_period_typ);
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public void frcst_period_typ(String value) {
		setConstString(offset + 5, $frcst_period_typ, value);
	}


	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCDate frcst_st_dt() {
		return getConstDate(offset + 6, $frcst_st_dt);
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public void frcst_st_dt(MCDate value) {
		setConstDate(offset + 6, $frcst_st_dt, value);
	}


	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCDate frcst_end_dt() {
		return getConstDate(offset + 7, $frcst_end_dt);
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public void frcst_end_dt(MCDate value) {
		setConstDate(offset + 7, $frcst_end_dt, value);
	}


	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public MCDate frcst_dt() {
		return getConstDate(offset + 8, $frcst_dt);
	}

	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public void frcst_dt(MCDate value) {
		setConstDate(offset + 8, $frcst_dt, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 9, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 9, $trd_unit_cd, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 10, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 10, $cst_itm_cd, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 11, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 11, $base_unit_cd, value);
	}


	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public MCNumber last_qty() {
		return getConstNumber(offset + 12, $last_qty);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void last_qty(MCNumber value) {
		setConstNumber(offset + 12, $last_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void last_qty(int value) {
		setConstNumber(offset + 12, $last_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void last_qty(long value) {
		setConstNumber(offset + 12, $last_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void last_qty(float value) {
		setConstNumber(offset + 12, $last_qty, value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void last_qty(double value) {
		setConstNumber(offset + 12, $last_qty, value);
	}


	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public MCDate last_cst_frcst_prnt_dt() {
		return getConstDate(offset + 13, $last_cst_frcst_prnt_dt);
	}

	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public void last_cst_frcst_prnt_dt(MCDate value) {
		setConstDate(offset + 13, $last_cst_frcst_prnt_dt, value);
	}


	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public MCDate last_rcpt_dt() {
		return getConstDate(offset + 14, $last_rcpt_dt);
	}

	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public void last_rcpt_dt(MCDate value) {
		setConstDate(offset + 14, $last_rcpt_dt, value);
	}


	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 15, $spln_qty);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 15, $spln_qty, value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 15, $spln_qty, value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 15, $spln_qty, value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 15, $spln_qty, value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 15, $spln_qty, value);
	}


	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public MCNumber slo_qty() {
		return getConstNumber(offset + 16, $slo_qty);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(int value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(long value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(float value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(double value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}


	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public String cst_frcst_d_no() {
		return getConstString(offset + 17, $cst_frcst_d_no);
	}

	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public void cst_frcst_d_no(String value) {
		setConstString(offset + 17, $cst_frcst_d_no, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			return frcst_period_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			return last_qty();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			return frcst_st_dt();
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			return frcst_end_dt();
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			return frcst_dt();
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return last_cst_frcst_prnt_dt();
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			return last_rcpt_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			return frcst_period_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			return last_qty();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			return frcst_st_dt();
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			return frcst_end_dt();
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			return frcst_dt();
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return last_cst_frcst_prnt_dt();
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			return last_rcpt_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			frcst_period_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			frcst_st_dt(value);
			return;
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			frcst_end_dt(value);
			return;
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			frcst_dt(value);
			return;
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			last_cst_frcst_prnt_dt(value);
			return;
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			last_rcpt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			frcst_period_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($last_qty.equalsIgnoreCase(name)) {
			last_qty(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			frcst_st_dt(value);
			return;
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			frcst_end_dt(value);
			return;
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			frcst_dt(value);
			return;
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			last_cst_frcst_prnt_dt(value);
			return;
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			last_rcpt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

