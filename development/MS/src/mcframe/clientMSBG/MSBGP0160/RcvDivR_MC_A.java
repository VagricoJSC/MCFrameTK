package mcframe.clientMSBG.MSBGP0160;

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
 * ブロック"RcvDiv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RcvDivR_MC_A extends MCConstRow {

	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	public static final String $rcv_amt_p = "rcv_amt_p";
	public static final String $org_rcv_amt = "org_rcv_amt";
	public static final String $rcv_proc_amt_p = "rcv_proc_amt_p";
	public static final String $not_proc_amt_p = "not_proc_amt_p";
	public static final String $com_paid_p = "com_paid_p";
	public static final String $org_com_paid = "org_com_paid";
	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $rcv_sub_char1 = "rcv_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $rcv_sub_char2 = "rcv_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $rcv_sub_char3 = "rcv_sub_char3";
	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public static final String $div_src_rcv_upd_cntr = "div_src_rcv_upd_cntr";

	public static final String $rcv_amt = $rcv_amt_p + ".amt";
	public static final String $rcv_proc_amt = $rcv_proc_amt_p + ".amt";
	public static final String $not_proc_bal = $not_proc_amt_p + ".amt";
	public static final String $com_paid = $com_paid_p + ".amt";

	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_amt_p_META = createInnerRowMeta($rcv_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta org_rcv_amt_META = createCommonMeta($org_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_proc_amt_p_META = createInnerRowMeta($rcv_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta not_proc_amt_p_META = createInnerRowMeta($not_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta com_paid_p_META = createInnerRowMeta($com_paid_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta org_com_paid_META = createCommonMeta($org_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta rcv_sub_char1_META = createCommonMeta($rcv_sub_char1, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR1);
	public static final MCMeta rcv_sub_char2_META = createCommonMeta($rcv_sub_char2, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR2);
	public static final MCMeta rcv_sub_char3_META = createCommonMeta($rcv_sub_char3, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR3);
	public static final MCMeta div_src_rcv_upd_cntr_META = createCommonMeta($div_src_rcv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<RcvDivR> constMetas = new ConstMetaList<RcvDivR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_no_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			rcv_amt_p_META,
			org_rcv_amt_META,
			rcv_proc_amt_p_META,
			not_proc_amt_p_META,
			com_paid_p_META,
			org_com_paid_META,
			rcv_rmrks_META,
			rcv_sub_char1_META,
			rcv_sub_char2_META,
			rcv_sub_char3_META,
			div_src_rcv_upd_cntr_META
		},
		new String[][]{
			{
				"rcv_amt",
				"rcv_proc_amt",
				"not_proc_bal",
				"com_paid"
			},
			{
				$rcv_amt,
				$rcv_proc_amt,
				$not_proc_bal,
				$com_paid
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
				{$bcst_cd, "bp_nm"},	// bcst_cd
				{$bill_dpt_cd, "dpt_nm"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST_BY_RCST"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;MAC_DPT_IS_SRCH_TYP.BCST"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bcst_cd, "bp_is_srch_typ"},	// bcst_cd
				{$bill_dpt_cd, "bcst_cd;dpt_is_srch_typ"}	// bill_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected RcvDivR_MC_A(ConstMetaList<? extends RcvDivR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvDivR clone() {
		return (RcvDivR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvDivR createInstance() {
		return (RcvDivR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RcvDivR getValues(String... names) {
		return (RcvDivR) super.getValues(names);
	}



	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 0, $rcv_no);
	}

	/**
	 * Split destination payment received No. 分割先入金ＮＯ.<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 0, $rcv_no, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 1, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 1, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 2, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 2, $bcst_nm, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 3, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 3, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 4, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 4, $bill_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 5, $rcv_amt_p);
	}
	
	public void rcv_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 5, $rcv_amt_p, row);
	}


	public MCNumber org_rcv_amt() {
		return getConstNumber(offset + 6, $org_rcv_amt);
	}

	public void org_rcv_amt(MCNumber value) {
		setConstNumber(offset + 6, $org_rcv_amt, value);
	}

	public void org_rcv_amt(int value) {
		setConstNumber(offset + 6, $org_rcv_amt, value);
	}

	public void org_rcv_amt(long value) {
		setConstNumber(offset + 6, $org_rcv_amt, value);
	}

	public void org_rcv_amt(float value) {
		setConstNumber(offset + 6, $org_rcv_amt, value);
	}

	public void org_rcv_amt(double value) {
		setConstNumber(offset + 6, $org_rcv_amt, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR rcv_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 7, $rcv_proc_amt_p);
	}
	
	public void rcv_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 7, $rcv_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR not_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 8, $not_proc_amt_p);
	}
	
	public void not_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 8, $not_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR com_paid_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 9, $com_paid_p);
	}
	
	public void com_paid_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 9, $com_paid_p, row);
	}


	public MCNumber org_com_paid() {
		return getConstNumber(offset + 10, $org_com_paid);
	}

	public void org_com_paid(MCNumber value) {
		setConstNumber(offset + 10, $org_com_paid, value);
	}

	public void org_com_paid(int value) {
		setConstNumber(offset + 10, $org_com_paid, value);
	}

	public void org_com_paid(long value) {
		setConstNumber(offset + 10, $org_com_paid, value);
	}

	public void org_com_paid(float value) {
		setConstNumber(offset + 10, $org_com_paid, value);
	}

	public void org_com_paid(double value) {
		setConstNumber(offset + 10, $org_com_paid, value);
	}


	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 11, $rcv_rmrks);
	}

	/**
	 * Payment received remarks 入金備考.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 11, $rcv_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String rcv_sub_char1() {
		return getConstString(offset + 12, $rcv_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void rcv_sub_char1(String value) {
		setConstString(offset + 12, $rcv_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String rcv_sub_char2() {
		return getConstString(offset + 13, $rcv_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void rcv_sub_char2(String value) {
		setConstString(offset + 13, $rcv_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String rcv_sub_char3() {
		return getConstString(offset + 14, $rcv_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void rcv_sub_char3(String value) {
		setConstString(offset + 14, $rcv_sub_char3, value);
	}


	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumber div_src_rcv_upd_cntr() {
		return getConstNumber(offset + 15, $div_src_rcv_upd_cntr);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 15, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(int value) {
		setConstNumber(offset + 15, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(long value) {
		setConstNumber(offset + 15, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(float value) {
		setConstNumber(offset + 15, $div_src_rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void div_src_rcv_upd_cntr(double value) {
		setConstNumber(offset + 15, $div_src_rcv_upd_cntr, value);
	}


	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			return rcv_sub_char1();
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			return rcv_sub_char2();
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			return rcv_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			return org_rcv_amt();
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			return org_com_paid();
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			return div_src_rcv_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			return rcv_sub_char1();
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			return rcv_sub_char2();
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			return rcv_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			return org_rcv_amt();
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			return org_com_paid();
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			return div_src_rcv_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			rcv_sub_char1(value);
			return;
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			rcv_sub_char2(value);
			return;
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			rcv_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($rcv_sub_char1.equalsIgnoreCase(name)) {
			rcv_sub_char1(value);
			return;
		}
		if ($rcv_sub_char2.equalsIgnoreCase(name)) {
			rcv_sub_char2(value);
			return;
		}
		if ($rcv_sub_char3.equalsIgnoreCase(name)) {
			rcv_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($org_rcv_amt.equalsIgnoreCase(name)) {
			org_rcv_amt(value);
			return;
		}
		if ($org_com_paid.equalsIgnoreCase(name)) {
			org_com_paid(value);
			return;
		}
		if ($div_src_rcv_upd_cntr.equalsIgnoreCase(name)) {
			div_src_rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($rcv_amt_p.equalsIgnoreCase(name)) {
			return rcv_amt_p();
		}
		if ($rcv_proc_amt_p.equalsIgnoreCase(name)) {
			return rcv_proc_amt_p();
		}
		if ($not_proc_amt_p.equalsIgnoreCase(name)) {
			return not_proc_amt_p();
		}
		if ($com_paid_p.equalsIgnoreCase(name)) {
			return com_paid_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($rcv_amt_p.equalsIgnoreCase(name)) {
			rcv_amt_p(
				((MCContainerMeta) rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($rcv_proc_amt_p.equalsIgnoreCase(name)) {
			rcv_proc_amt_p(
				((MCContainerMeta) rcv_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($not_proc_amt_p.equalsIgnoreCase(name)) {
			not_proc_amt_p(
				((MCContainerMeta) not_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($com_paid_p.equalsIgnoreCase(name)) {
			com_paid_p(
				((MCContainerMeta) com_paid_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return rcv_amt_p().amt();
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(int value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(long value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(float value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Payment received amount 入金額.<p>
	 *
	 */
	public void rcv_amt(double value) {
		rcv_amt_p().amt(value);
	}

	/**
	 * Processed payment received amount 入金処理額.<p>
	 *
	 */
	public MCNumber rcv_proc_amt() {
		return rcv_proc_amt_p().amt();
	}

	/**
	 * Processed payment received amount 入金処理額.<p>
	 *
	 */
	public void rcv_proc_amt(MCNumber value) {
		rcv_proc_amt_p().amt(value);
	}

	/**
	 * Processed payment received amount 入金処理額.<p>
	 *
	 */
	public void rcv_proc_amt(int value) {
		rcv_proc_amt_p().amt(value);
	}

	/**
	 * Processed payment received amount 入金処理額.<p>
	 *
	 */
	public void rcv_proc_amt(long value) {
		rcv_proc_amt_p().amt(value);
	}

	/**
	 * Processed payment received amount 入金処理額.<p>
	 *
	 */
	public void rcv_proc_amt(float value) {
		rcv_proc_amt_p().amt(value);
	}

	/**
	 * Processed payment received amount 入金処理額.<p>
	 *
	 */
	public void rcv_proc_amt(double value) {
		rcv_proc_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return not_proc_amt_p().amt();
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		not_proc_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		not_proc_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		not_proc_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		not_proc_amt_p().amt(value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		not_proc_amt_p().amt(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public MCNumber com_paid() {
		return com_paid_p().amt();
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		com_paid_p().amt(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(int value) {
		com_paid_p().amt(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(long value) {
		com_paid_p().amt(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(float value) {
		com_paid_p().amt(value);
	}

	/**
	 * Transfer fee 振込手数料.<p>
	 *
	 */
	public void com_paid(double value) {
		com_paid_p().amt(value);
	}

}

