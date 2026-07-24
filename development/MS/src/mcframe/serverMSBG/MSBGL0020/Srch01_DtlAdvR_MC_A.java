package mcframe.serverMSBG.MSBGL0020;

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
 * ブロック"Srch01_DtlAdv"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlAdvR_MC_A extends MCConstRow {

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public static final String $slip_sts_typ_nm = "slip_sts_typ_nm";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
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
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public static final String $rcv_act_rev = "rcv_act_rev";
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";
	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public static final String $rcv_act_upd_cntr = "rcv_act_upd_cntr";
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public static final String $setoff_tax_amt = "setoff_tax_amt";
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
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg = "bill_tax_disp_flg";


	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta slip_sts_typ_nm_META = createCommonMeta($slip_sts_typ_nm, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP_NM);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_rev_META = createCommonMeta($rcv_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_upd_cntr_META = createCommonMeta($rcv_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_tax_amt_META = createCommonMeta($setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_tax_cd_META = createCommonMeta($setoff_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta setoff_tax_nm_META = createCommonMeta($setoff_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta setoff_tax_rate_META = createCommonMeta($setoff_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta bill_tax_disp_flg_META = createCommonMeta($bill_tax_disp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_DtlAdvR> constMetas = new ConstMetaList<Srch01_DtlAdvR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_dt_META,
			slip_sts_typ_META,
			slip_sts_typ_nm_META,
			ar_trd_grp_typ_META,
			trd_cd_META,
			trd_nm_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			rcv_act_rev_META,
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			rcv_act_upd_cntr_META,
			rcv_dt_META,
			trd_cur_amt_META,
			setoff_amt_META,
			setoff_tax_amt_META,
			setoff_tax_cd_META,
			setoff_tax_nm_META,
			setoff_tax_rate_META,
			bill_tax_disp_flg_META
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
				{$slip_sts_typ, "MAC_SLIP_STS_TYP"}	// slip_sts_typ
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
	protected Srch01_DtlAdvR_MC_A(ConstMetaList<? extends Srch01_DtlAdvR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlAdvR clone() {
		return (Srch01_DtlAdvR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlAdvR createInstance() {
		return (Srch01_DtlAdvR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlAdvR getValues(String... names) {
		return (Srch01_DtlAdvR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 0, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 0, $ac_dt, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 1, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 1, $slip_sts_typ, value);
	}


	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public String slip_sts_typ_nm() {
		return getConstString(offset + 2, $slip_sts_typ_nm);
	}

	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public void slip_sts_typ_nm(String value) {
		setConstString(offset + 2, $slip_sts_typ_nm, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 3, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 3, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 4, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 4, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 5, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 5, $trd_nm, value);
	}


	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 6, $rcv_act_no);
	}

	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 6, $rcv_act_no, value);
	}


	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 7, $rcv_act_seq);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}

	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 7, $rcv_act_seq, value);
	}


	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public MCNumber rcv_act_rev() {
		return getConstNumber(offset + 8, $rcv_act_rev);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(MCNumber value) {
		setConstNumber(offset + 8, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(int value) {
		setConstNumber(offset + 8, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(long value) {
		setConstNumber(offset + 8, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(float value) {
		setConstNumber(offset + 8, $rcv_act_rev, value);
	}

	/**
	 * Payment received result rev. number 入金実績改訂番号.<p>
	 *
	 */
	public void rcv_act_rev(double value) {
		setConstNumber(offset + 8, $rcv_act_rev, value);
	}


	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 9, $rcv_act_d_no);
	}

	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 9, $rcv_act_d_no, value);
	}


	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 10, $rcv_act_d_seq);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 10, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 10, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 10, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 10, $rcv_act_d_seq, value);
	}

	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 10, $rcv_act_d_seq, value);
	}


	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public MCNumber rcv_act_upd_cntr() {
		return getConstNumber(offset + 11, $rcv_act_upd_cntr);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 11, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(int value) {
		setConstNumber(offset + 11, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(long value) {
		setConstNumber(offset + 11, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(float value) {
		setConstNumber(offset + 11, $rcv_act_upd_cntr, value);
	}

	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public void rcv_act_upd_cntr(double value) {
		setConstNumber(offset + 11, $rcv_act_upd_cntr, value);
	}


	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 12, $rcv_dt);
	}

	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 12, $rcv_dt, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 13, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 13, $trd_cur_amt, value);
	}


	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 14, $setoff_amt);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}

	/**
	 * Offset amount 相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 14, $setoff_amt, value);
	}


	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return getConstNumber(offset + 15, $setoff_tax_amt);
	}

	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 15, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setConstNumber(offset + 15, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setConstNumber(offset + 15, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setConstNumber(offset + 15, $setoff_tax_amt, value);
	}

	/**
	 * Offset tax amount 相殺税額.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setConstNumber(offset + 15, $setoff_tax_amt, value);
	}


	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public String setoff_tax_cd() {
		return getConstString(offset + 16, $setoff_tax_cd);
	}

	/**
	 * Offset tax cd. 相殺税ＣＤ.<p>
	 *
	 */
	public void setoff_tax_cd(String value) {
		setConstString(offset + 16, $setoff_tax_cd, value);
	}


	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public String setoff_tax_nm() {
		return getConstString(offset + 17, $setoff_tax_nm);
	}

	/**
	 * Offset tax name 相殺税名.<p>
	 *
	 */
	public void setoff_tax_nm(String value) {
		setConstString(offset + 17, $setoff_tax_nm, value);
	}


	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public MCNumber setoff_tax_rate() {
		return getConstNumber(offset + 18, $setoff_tax_rate);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(MCNumber value) {
		setConstNumber(offset + 18, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(int value) {
		setConstNumber(offset + 18, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(long value) {
		setConstNumber(offset + 18, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(float value) {
		setConstNumber(offset + 18, $setoff_tax_rate, value);
	}

	/**
	 * Offset tax rate 相殺税率.<p>
	 *
	 */
	public void setoff_tax_rate(double value) {
		setConstNumber(offset + 18, $setoff_tax_rate, value);
	}


	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public boolean bill_tax_disp_flg() {
		return getConstBoolean(offset + 19, $bill_tax_disp_flg);
	}

	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public void bill_tax_disp_flg(boolean value) {
		setConstBoolean(offset + 19, $bill_tax_disp_flg, value);
	}


	public String getString(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_act_upd_cntr();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			return slip_sts_typ_nm();
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($setoff_tax_cd.equalsIgnoreCase(name)) {
			return setoff_tax_cd();
		}
		if ($setoff_tax_nm.equalsIgnoreCase(name)) {
			return setoff_tax_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			return rcv_act_rev();
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			return rcv_act_upd_cntr();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			return setoff_tax_rate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($slip_sts_typ_nm.equalsIgnoreCase(name)) {
			slip_sts_typ_nm(value);
			return;
		}
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($rcv_act_rev.equalsIgnoreCase(name)) {
			rcv_act_rev(value);
			return;
		}
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_upd_cntr.equalsIgnoreCase(name)) {
			rcv_act_upd_cntr(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($setoff_tax_rate.equalsIgnoreCase(name)) {
			setoff_tax_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

