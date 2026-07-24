package mcframe.serverMSBG.MSBGL0210;

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
 * ブロック"Srch04_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch04_HdrR_MC_A extends MCConstRow {

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public static final String $setoff_rcv_no = "setoff_rcv_no";
	/**
	 * Offset payment received data type 相殺入金データ区分.<p>
	 *
	 */
	public static final String $setoff_rcv_dat_typ = "setoff_rcv_dat_typ";
	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public static final String $setoff_rcv_dat_typ_nm = "setoff_rcv_dat_typ_nm";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_bcst_cd = "setoff_bcst_cd";
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public static final String $setoff_bcst_nm = "setoff_bcst_nm";
	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public static final String $setoff_dt = "setoff_dt";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $setoff_ac_dt = "setoff_ac_dt";
	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public static final String $setoff_trd_cur_cd = "setoff_trd_cur_cd";
	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public static final String $setoff_trd_cur_nm = "setoff_trd_cur_nm";
	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public static final String $setoff_xrate = "setoff_xrate";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_rcv_amt = "setoff_rcv_amt";
	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public static final String $setoff_subttl2 = "setoff_subttl2";
	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public static final String $setoff_subttl3 = "setoff_subttl3";
	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public static final String $setoff_not_proc_bal = "setoff_not_proc_bal";
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $setoff_sttl_cd1 = "setoff_sttl_cd1";
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public static final String $setoff_sttl_nm1 = "setoff_sttl_nm1";
	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public static final String $setoff_sls_purc_typ = "setoff_sls_purc_typ";
	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public static final String $setoff_purc_flg = "setoff_purc_flg";
	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public static final String $setoff_sls_flg = "setoff_sls_flg";
	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public static final String $setoff_tax_cd = "setoff_tax_cd";
	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public static final String $setoff_tax_nm = "setoff_tax_nm";
	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public static final String $setoff_tax_rate = "setoff_tax_rate";
	/**
	 * Offset tax type 相殺税区分.<p>
	 *
	 */
	public static final String $setoff_tax_typ = "setoff_tax_typ";
	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_typ = "setoff_debt_cred_id_typ";
	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_typ_nm = "setoff_debt_cred_id_typ_nm";
	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_debt_cred_id_cd = "setoff_debt_cred_id_cd";
	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public static final String $setoff_debt_cred_nm = "setoff_debt_cred_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public static final String $rcv_upd_cntr = "rcv_upd_cntr";


	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta setoff_rcv_no_META = createCommonMeta($setoff_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta setoff_rcv_dat_typ_META = createCommonMeta($setoff_rcv_dat_typ, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP);
	public static final MCMeta setoff_rcv_dat_typ_nm_META = createCommonMeta($setoff_rcv_dat_typ_nm, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP_NM);
	public static final MCMeta setoff_bcst_cd_META = createCommonMeta($setoff_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_bcst_nm_META = createCommonMeta($setoff_bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta setoff_dt_META = createCommonMeta($setoff_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta setoff_ac_dt_META = createCommonMeta($setoff_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta setoff_trd_cur_cd_META = createCommonMeta($setoff_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta setoff_trd_cur_nm_META = createCommonMeta($setoff_trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta setoff_xrate_META = createCommonMeta($setoff_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_rcv_amt_META = createCommonMeta($setoff_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_subttl2_META = createCommonMeta($setoff_subttl2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_subttl3_META = createCommonMeta($setoff_subttl3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_not_proc_bal_META = createCommonMeta($setoff_not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_sttl_cd1_META = createCommonMeta($setoff_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta setoff_sttl_nm1_META = createCommonMeta($setoff_sttl_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta setoff_sls_purc_typ_META = createCommonMeta($setoff_sls_purc_typ, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta setoff_purc_flg_META = createCommonMeta($setoff_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_sls_flg_META = createCommonMeta($setoff_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta setoff_tax_cd_META = createCommonMeta($setoff_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_nm_META = createCommonMeta($setoff_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta setoff_tax_rate_META = createCommonMeta($setoff_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta setoff_tax_typ_META = createCommonMeta($setoff_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta setoff_debt_cred_id_typ_META = createCommonMeta($setoff_debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta setoff_debt_cred_id_typ_nm_META = createCommonMeta($setoff_debt_cred_id_typ_nm, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP_NM);
	public static final MCMeta setoff_debt_cred_id_cd_META = createCommonMeta($setoff_debt_cred_id_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_debt_cred_nm_META = createCommonMeta($setoff_debt_cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rcv_upd_cntr_META = createCommonMeta($rcv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch04_HdrR> constMetas = new ConstMetaList<Srch04_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_no_META,
			rcv_act_seq_META,
			setoff_rcv_no_META,
			setoff_rcv_dat_typ_META,
			setoff_rcv_dat_typ_nm_META,
			setoff_bcst_cd_META,
			setoff_bcst_nm_META,
			setoff_dt_META,
			setoff_ac_dt_META,
			setoff_trd_cur_cd_META,
			setoff_trd_cur_nm_META,
			setoff_xrate_META,
			setoff_rcv_amt_META,
			setoff_subttl2_META,
			setoff_subttl3_META,
			setoff_not_proc_bal_META,
			setoff_sttl_cd1_META,
			setoff_sttl_nm1_META,
			setoff_sls_purc_typ_META,
			setoff_purc_flg_META,
			setoff_sls_flg_META,
			setoff_tax_cd_META,
			setoff_tax_nm_META,
			setoff_tax_rate_META,
			setoff_tax_typ_META,
			setoff_debt_cred_id_typ_META,
			setoff_debt_cred_id_typ_nm_META,
			setoff_debt_cred_id_cd_META,
			setoff_debt_cred_nm_META,
			amt_dec_place_META,
			upri_dec_place_META,
			rcv_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$setoff_rcv_dat_typ, "MSC_RCV_DAT_TYP"},	// setoff_rcv_dat_typ
				{$setoff_debt_cred_id_typ, "MAC_DEBT_CRED_ID_TYP"}	// setoff_debt_cred_id_typ
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
	protected Srch04_HdrR_MC_A(ConstMetaList<? extends Srch04_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch04_HdrR clone() {
		return (Srch04_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch04_HdrR createInstance() {
		return (Srch04_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch04_HdrR getValues(String... names) {
		return (Srch04_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 0, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 0, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 1, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_seq, value);
	}


	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public String setoff_rcv_no() {
		return getConstString(offset + 2, $setoff_rcv_no);
	}

	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public void setoff_rcv_no(String value) {
		setConstString(offset + 2, $setoff_rcv_no, value);
	}


	/**
	 * Offset payment received data type 相殺入金データ区分.<p>
	 *
	 */
	public String setoff_rcv_dat_typ() {
		return getConstString(offset + 3, $setoff_rcv_dat_typ);
	}

	/**
	 * Offset payment received data type 相殺入金データ区分.<p>
	 *
	 */
	public void setoff_rcv_dat_typ(String value) {
		setConstString(offset + 3, $setoff_rcv_dat_typ, value);
	}


	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public String setoff_rcv_dat_typ_nm() {
		return getConstString(offset + 4, $setoff_rcv_dat_typ_nm);
	}

	/**
	 * Offset payment received info. type name 相殺入金情報区分名.<p>
	 *
	 */
	public void setoff_rcv_dat_typ_nm(String value) {
		setConstString(offset + 4, $setoff_rcv_dat_typ_nm, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_bcst_cd() {
		return getConstString(offset + 5, $setoff_bcst_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_bcst_cd(String value) {
		setConstString(offset + 5, $setoff_bcst_cd, value);
	}


	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public String setoff_bcst_nm() {
		return getConstString(offset + 6, $setoff_bcst_nm);
	}

	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public void setoff_bcst_nm(String value) {
		setConstString(offset + 6, $setoff_bcst_nm, value);
	}


	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public MCDate setoff_dt() {
		return getConstDate(offset + 7, $setoff_dt);
	}

	/**
	 * Offset date 相殺日.<p>
	 *
	 */
	public void setoff_dt(MCDate value) {
		setConstDate(offset + 7, $setoff_dt, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate setoff_ac_dt() {
		return getConstDate(offset + 8, $setoff_ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void setoff_ac_dt(MCDate value) {
		setConstDate(offset + 8, $setoff_ac_dt, value);
	}


	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public String setoff_trd_cur_cd() {
		return getConstString(offset + 9, $setoff_trd_cur_cd);
	}

	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public void setoff_trd_cur_cd(String value) {
		setConstString(offset + 9, $setoff_trd_cur_cd, value);
	}


	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public String setoff_trd_cur_nm() {
		return getConstString(offset + 10, $setoff_trd_cur_nm);
	}

	/**
	 * Offset currency name 相殺通貨名.<p>
	 *
	 */
	public void setoff_trd_cur_nm(String value) {
		setConstString(offset + 10, $setoff_trd_cur_nm, value);
	}


	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public MCNumber setoff_xrate() {
		return getConstNumber(offset + 11, $setoff_xrate);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(MCNumber value) {
		setConstNumber(offset + 11, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(int value) {
		setConstNumber(offset + 11, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(long value) {
		setConstNumber(offset + 11, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(float value) {
		setConstNumber(offset + 11, $setoff_xrate, value);
	}

	/**
	 * Offset exchange rate 相殺為替レート.<p>
	 *
	 */
	public void setoff_xrate(double value) {
		setConstNumber(offset + 11, $setoff_xrate, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_rcv_amt() {
		return getConstNumber(offset + 12, $setoff_rcv_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(MCNumber value) {
		setConstNumber(offset + 12, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(int value) {
		setConstNumber(offset + 12, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(long value) {
		setConstNumber(offset + 12, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(float value) {
		setConstNumber(offset + 12, $setoff_rcv_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_rcv_amt(double value) {
		setConstNumber(offset + 12, $setoff_rcv_amt, value);
	}


	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public MCNumber setoff_subttl2() {
		return getConstNumber(offset + 13, $setoff_subttl2);
	}

	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public void setoff_subttl2(MCNumber value) {
		setConstNumber(offset + 13, $setoff_subttl2, value);
	}

	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public void setoff_subttl2(int value) {
		setConstNumber(offset + 13, $setoff_subttl2, value);
	}

	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public void setoff_subttl2(long value) {
		setConstNumber(offset + 13, $setoff_subttl2, value);
	}

	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public void setoff_subttl2(float value) {
		setConstNumber(offset + 13, $setoff_subttl2, value);
	}

	/**
	 * Amount subtotal 2 金額小計２.<p>
	 *
	 */
	public void setoff_subttl2(double value) {
		setConstNumber(offset + 13, $setoff_subttl2, value);
	}


	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public MCNumber setoff_subttl3() {
		return getConstNumber(offset + 14, $setoff_subttl3);
	}

	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public void setoff_subttl3(MCNumber value) {
		setConstNumber(offset + 14, $setoff_subttl3, value);
	}

	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public void setoff_subttl3(int value) {
		setConstNumber(offset + 14, $setoff_subttl3, value);
	}

	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public void setoff_subttl3(long value) {
		setConstNumber(offset + 14, $setoff_subttl3, value);
	}

	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public void setoff_subttl3(float value) {
		setConstNumber(offset + 14, $setoff_subttl3, value);
	}

	/**
	 * Amount subtotal 3 金額小計３.<p>
	 *
	 */
	public void setoff_subttl3(double value) {
		setConstNumber(offset + 14, $setoff_subttl3, value);
	}


	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public MCNumber setoff_not_proc_bal() {
		return getConstNumber(offset + 15, $setoff_not_proc_bal);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(MCNumber value) {
		setConstNumber(offset + 15, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(int value) {
		setConstNumber(offset + 15, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(long value) {
		setConstNumber(offset + 15, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(float value) {
		setConstNumber(offset + 15, $setoff_not_proc_bal, value);
	}

	/**
	 * Offset outstanding balance 相殺未処理残高.<p>
	 *
	 */
	public void setoff_not_proc_bal(double value) {
		setConstNumber(offset + 15, $setoff_not_proc_bal, value);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String setoff_sttl_cd1() {
		return getConstString(offset + 16, $setoff_sttl_cd1);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void setoff_sttl_cd1(String value) {
		setConstString(offset + 16, $setoff_sttl_cd1, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String setoff_sttl_nm1() {
		return getConstString(offset + 17, $setoff_sttl_nm1);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void setoff_sttl_nm1(String value) {
		setConstString(offset + 17, $setoff_sttl_nm1, value);
	}


	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public String setoff_sls_purc_typ() {
		return getConstString(offset + 18, $setoff_sls_purc_typ);
	}

	/**
	 * Offset sales purchase tax type 相殺売上仕入税区分.<p>
	 *
	 */
	public void setoff_sls_purc_typ(String value) {
		setConstString(offset + 18, $setoff_sls_purc_typ, value);
	}


	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public boolean setoff_purc_flg() {
		return getConstBoolean(offset + 19, $setoff_purc_flg);
	}

	/**
	 * Offset sales flg. 相殺売上ＦＬＧ.<p>
	 *
	 */
	public void setoff_purc_flg(boolean value) {
		setConstBoolean(offset + 19, $setoff_purc_flg, value);
	}


	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public boolean setoff_sls_flg() {
		return getConstBoolean(offset + 20, $setoff_sls_flg);
	}

	/**
	 * Offset purchase flg. 相殺仕入ＦＬＧ.<p>
	 *
	 */
	public void setoff_sls_flg(boolean value) {
		setConstBoolean(offset + 20, $setoff_sls_flg, value);
	}


	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public String setoff_tax_cd() {
		return getConstString(offset + 21, $setoff_tax_cd);
	}

	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public void setoff_tax_cd(String value) {
		setConstString(offset + 21, $setoff_tax_cd, value);
	}


	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public String setoff_tax_nm() {
		return getConstString(offset + 22, $setoff_tax_nm);
	}

	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public void setoff_tax_nm(String value) {
		setConstString(offset + 22, $setoff_tax_nm, value);
	}


	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCNumber setoff_tax_rate() {
		return getConstNumber(offset + 23, $setoff_tax_rate);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(MCNumber value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(int value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(long value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(float value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(double value) {
		setConstNumber(offset + 23, $setoff_tax_rate, value);
	}


	/**
	 * Offset tax type 相殺税区分.<p>
	 *
	 */
	public String setoff_tax_typ() {
		return getConstString(offset + 24, $setoff_tax_typ);
	}

	/**
	 * Offset tax type 相殺税区分.<p>
	 *
	 */
	public void setoff_tax_typ(String value) {
		setConstString(offset + 24, $setoff_tax_typ, value);
	}


	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public String setoff_debt_cred_id_typ() {
		return getConstString(offset + 25, $setoff_debt_cred_id_typ);
	}

	/**
	 * Offset debtor identification type 相殺借方先識別区分.<p>
	 *
	 */
	public void setoff_debt_cred_id_typ(String value) {
		setConstString(offset + 25, $setoff_debt_cred_id_typ, value);
	}


	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public String setoff_debt_cred_id_typ_nm() {
		return getConstString(offset + 26, $setoff_debt_cred_id_typ_nm);
	}

	/**
	 * Offset debtor identification type name 相殺借方先識別区分名.<p>
	 *
	 */
	public void setoff_debt_cred_id_typ_nm(String value) {
		setConstString(offset + 26, $setoff_debt_cred_id_typ_nm, value);
	}


	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public String setoff_debt_cred_id_cd() {
		return getConstString(offset + 27, $setoff_debt_cred_id_cd);
	}

	/**
	 * Offset debtor cd. 相殺借方先ＣＤ.<p>
	 *
	 */
	public void setoff_debt_cred_id_cd(String value) {
		setConstString(offset + 27, $setoff_debt_cred_id_cd, value);
	}


	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public String setoff_debt_cred_nm() {
		return getConstString(offset + 28, $setoff_debt_cred_nm);
	}

	/**
	 * Offset debtor name 相殺借方先名.<p>
	 *
	 */
	public void setoff_debt_cred_nm(String value) {
		setConstString(offset + 28, $setoff_debt_cred_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 29, $amt_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 29, $amt_dec_place, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 30, $upri_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 30, $upri_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 30, $upri_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 30, $upri_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 30, $upri_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 30, $upri_dec_place, value);
	}


	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_upd_cntr() {
		return getConstNumber(offset + 31, $rcv_upd_cntr);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(int value) {
		setConstNumber(offset + 31, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(long value) {
		setConstNumber(offset + 31, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(float value) {
		setConstNumber(offset + 31, $rcv_upd_cntr, value);
	}

	/**
	 * Payment received update counter 入金更新カウンタ.<p>
	 *
	 */
	public void rcv_upd_cntr(double value) {
		setConstNumber(offset + 31, $rcv_upd_cntr, value);
	}


	public String getString(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ();
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ_nm();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			return setoff_bcst_nm();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			return setoff_trd_cur_nm();
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			return setoff_sttl_cd1();
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			return setoff_sttl_nm1();
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			return setoff_sls_purc_typ();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		if ($setoff_tax_typ.equalsIgnoreCase(name)) {
			return setoff_tax_typ();
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ();
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ_nm();
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_cd();
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			return setoff_xrate();
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			return setoff_rcv_amt();
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			return setoff_subttl2();
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			return setoff_subttl3();
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			return setoff_not_proc_bal();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($setoff_dt.equalsIgnoreCase(name)) {
			return setoff_dt();
		}
		if ($setoff_ac_dt.equalsIgnoreCase(name)) {
			return setoff_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			return setoff_purc_flg();
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			return setoff_sls_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ();
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			return setoff_rcv_dat_typ_nm();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			return setoff_bcst_nm();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			return setoff_trd_cur_nm();
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			return setoff_sttl_cd1();
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			return setoff_sttl_nm1();
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			return setoff_sls_purc_typ();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		if ($setoff_tax_typ.equalsIgnoreCase(name)) {
			return setoff_tax_typ();
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ();
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_typ_nm();
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			return setoff_debt_cred_id_cd();
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			return setoff_debt_cred_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			return setoff_xrate();
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			return setoff_rcv_amt();
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			return setoff_subttl2();
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			return setoff_subttl3();
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			return setoff_not_proc_bal();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($setoff_dt.equalsIgnoreCase(name)) {
			return setoff_dt();
		}
		if ($setoff_ac_dt.equalsIgnoreCase(name)) {
			return setoff_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			return setoff_purc_flg();
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			return setoff_sls_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ(value);
			return;
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ_nm(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
			return;
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			setoff_bcst_nm(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			setoff_trd_cur_nm(value);
			return;
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			setoff_sttl_cd1(value);
			return;
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			setoff_sttl_nm1(value);
			return;
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			setoff_sls_purc_typ(value);
			return;
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			setoff_tax_cd(value);
			return;
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			setoff_tax_nm(value);
			return;
		}
		if ($setoff_tax_typ.equalsIgnoreCase(name)) {
			setoff_tax_typ(value);
			return;
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ(value);
			return;
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ_nm(value);
			return;
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_cd(value);
			return;
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($setoff_dt.equalsIgnoreCase(name)) {
			setoff_dt(value);
			return;
		}
		if ($setoff_ac_dt.equalsIgnoreCase(name)) {
			setoff_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			setoff_purc_flg(value);
			return;
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			setoff_sls_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_rcv_dat_typ.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ(value);
			return;
		}
		if ($setoff_rcv_dat_typ_nm.equalsIgnoreCase(name)) {
			setoff_rcv_dat_typ_nm(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
			return;
		}
		if ($setoff_bcst_nm.equalsIgnoreCase(name)) {
			setoff_bcst_nm(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_trd_cur_nm.equalsIgnoreCase(name)) {
			setoff_trd_cur_nm(value);
			return;
		}
		if ($setoff_sttl_cd1.equalsIgnoreCase(name)) {
			setoff_sttl_cd1(value);
			return;
		}
		if ($setoff_sttl_nm1.equalsIgnoreCase(name)) {
			setoff_sttl_nm1(value);
			return;
		}
		if ($setoff_sls_purc_typ.equalsIgnoreCase(name)) {
			setoff_sls_purc_typ(value);
			return;
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			setoff_tax_cd(value);
			return;
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			setoff_tax_nm(value);
			return;
		}
		if ($setoff_tax_typ.equalsIgnoreCase(name)) {
			setoff_tax_typ(value);
			return;
		}
		if ($setoff_debt_cred_id_typ.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ(value);
			return;
		}
		if ($setoff_debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_typ_nm(value);
			return;
		}
		if ($setoff_debt_cred_id_cd.equalsIgnoreCase(name)) {
			setoff_debt_cred_id_cd(value);
			return;
		}
		if ($setoff_debt_cred_nm.equalsIgnoreCase(name)) {
			setoff_debt_cred_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($setoff_xrate.equalsIgnoreCase(name)) {
			setoff_xrate(value);
			return;
		}
		if ($setoff_rcv_amt.equalsIgnoreCase(name)) {
			setoff_rcv_amt(value);
			return;
		}
		if ($setoff_subttl2.equalsIgnoreCase(name)) {
			setoff_subttl2(value);
			return;
		}
		if ($setoff_subttl3.equalsIgnoreCase(name)) {
			setoff_subttl3(value);
			return;
		}
		if ($setoff_not_proc_bal.equalsIgnoreCase(name)) {
			setoff_not_proc_bal(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($rcv_upd_cntr.equalsIgnoreCase(name)) {
			rcv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($setoff_dt.equalsIgnoreCase(name)) {
			setoff_dt(value);
			return;
		}
		if ($setoff_ac_dt.equalsIgnoreCase(name)) {
			setoff_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($setoff_purc_flg.equalsIgnoreCase(name)) {
			setoff_purc_flg(value);
			return;
		}
		if ($setoff_sls_flg.equalsIgnoreCase(name)) {
			setoff_sls_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

