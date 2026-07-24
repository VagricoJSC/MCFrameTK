package mcframe.serverMSBG.MSBGL5100;

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
 * ブロック"ArDtlAppl_Upd01_BillDApplBal"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArDtlAppl_Upd01_BillDApplBalR_MC_A extends MCConstRow {

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public static final String $parent_bill_d_no = "parent_bill_d_no";
	/**
	 * Last reconciled date 最終消込日.<p>
	 *
	 */
	public static final String $last_appl_dt = "last_appl_dt";
	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public static final String $appl_tgt_amt = "appl_tgt_amt";
	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public static final String $appl_amt = "appl_amt";
	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public static final String $org_appl_amt = "org_appl_amt";
	/**
	 * Reconciled result existence flg. 消込実績存在ＦＬＧ.<p>
	 *
	 */
	public static final String $act_appl_flg = "act_appl_flg";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta last_appl_dt_META = createCommonMeta($last_appl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta appl_tgt_amt_META = createCommonMeta($appl_tgt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta appl_amt_META = createCommonMeta($appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta org_appl_amt_META = createCommonMeta($org_appl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta act_appl_flg_META = createCommonMeta($act_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);

	protected static final ConstMetaList<ArDtlAppl_Upd01_BillDApplBalR> constMetas = new ConstMetaList<ArDtlAppl_Upd01_BillDApplBalR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			bill_d_no_META,
			parent_bill_d_no_META,
			last_appl_dt_META,
			appl_tgt_amt_META,
			appl_amt_META,
			org_appl_amt_META,
			act_appl_flg_META,
			ar_dpt_cd_META
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
	protected ArDtlAppl_Upd01_BillDApplBalR_MC_A(ConstMetaList<? extends ArDtlAppl_Upd01_BillDApplBalR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArDtlAppl_Upd01_BillDApplBalR clone() {
		return (ArDtlAppl_Upd01_BillDApplBalR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArDtlAppl_Upd01_BillDApplBalR createInstance() {
		return (ArDtlAppl_Upd01_BillDApplBalR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArDtlAppl_Upd01_BillDApplBalR getValues(String... names) {
		return (ArDtlAppl_Upd01_BillDApplBalR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 0, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 0, $ac_ym, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 1, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 1, $bill_d_no, value);
	}


	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 2, $parent_bill_d_no);
	}

	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 2, $parent_bill_d_no, value);
	}


	/**
	 * Last reconciled date 最終消込日.<p>
	 *
	 */
	public MCDate last_appl_dt() {
		return getConstDate(offset + 3, $last_appl_dt);
	}

	/**
	 * Last reconciled date 最終消込日.<p>
	 *
	 */
	public void last_appl_dt(MCDate value) {
		setConstDate(offset + 3, $last_appl_dt, value);
	}


	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public MCNumber appl_tgt_amt() {
		return getConstNumber(offset + 4, $appl_tgt_amt);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(MCNumber value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(int value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(long value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(float value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}

	/**
	 * Reconciled target amount 消込対象額.<p>
	 *
	 */
	public void appl_tgt_amt(double value) {
		setConstNumber(offset + 4, $appl_tgt_amt, value);
	}


	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public MCNumber appl_amt() {
		return getConstNumber(offset + 5, $appl_amt);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(MCNumber value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(int value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(long value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(float value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}

	/**
	 * Reconciled amount 消込額.<p>
	 *
	 */
	public void appl_amt(double value) {
		setConstNumber(offset + 5, $appl_amt, value);
	}


	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public MCNumber org_appl_amt() {
		return getConstNumber(offset + 6, $org_appl_amt);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(MCNumber value) {
		setConstNumber(offset + 6, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(int value) {
		setConstNumber(offset + 6, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(long value) {
		setConstNumber(offset + 6, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(float value) {
		setConstNumber(offset + 6, $org_appl_amt, value);
	}

	/**
	 * Original reconcile amount 元消込額.<p>
	 *
	 */
	public void org_appl_amt(double value) {
		setConstNumber(offset + 6, $org_appl_amt, value);
	}


	/**
	 * Reconciled result existence flg. 消込実績存在ＦＬＧ.<p>
	 *
	 */
	public boolean act_appl_flg() {
		return getConstBoolean(offset + 7, $act_appl_flg);
	}

	/**
	 * Reconciled result existence flg. 消込実績存在ＦＬＧ.<p>
	 *
	 */
	public void act_appl_flg(boolean value) {
		setConstBoolean(offset + 7, $act_appl_flg, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 8, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 8, $ar_dpt_cd, value);
	}


	public String getString(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			return appl_tgt_amt();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			return org_appl_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($last_appl_dt.equalsIgnoreCase(name)) {
			return last_appl_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($act_appl_flg.equalsIgnoreCase(name)) {
			return act_appl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			return appl_tgt_amt();
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			return appl_amt();
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			return org_appl_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($last_appl_dt.equalsIgnoreCase(name)) {
			return last_appl_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($act_appl_flg.equalsIgnoreCase(name)) {
			return act_appl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($last_appl_dt.equalsIgnoreCase(name)) {
			last_appl_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($act_appl_flg.equalsIgnoreCase(name)) {
			act_appl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($appl_tgt_amt.equalsIgnoreCase(name)) {
			appl_tgt_amt(value);
			return;
		}
		if ($appl_amt.equalsIgnoreCase(name)) {
			appl_amt(value);
			return;
		}
		if ($org_appl_amt.equalsIgnoreCase(name)) {
			org_appl_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($last_appl_dt.equalsIgnoreCase(name)) {
			last_appl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($act_appl_flg.equalsIgnoreCase(name)) {
			act_appl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

