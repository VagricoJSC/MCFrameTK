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
 * ブロック"Srch03_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch03_HdrR_MC_A extends MCConstRow {

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
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public static final String $setoff_rcv_no = "setoff_rcv_no";
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public static final String $setoff_bcst_cd = "setoff_bcst_cd";
	/**
	 * Offset currency cd. 相殺通貨ＣＤ.<p>
	 *
	 */
	public static final String $setoff_trd_cur_cd = "setoff_trd_cur_cd";
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $setoff_sttl_cd = "setoff_sttl_cd";
	/**
	 * Filter by payment received method 入金方法で絞り込む.<p>
	 *
	 */
	public static final String $narrow_down_flg = "narrow_down_flg";
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public static final String $not_bill_flg = "not_bill_flg";
	/**
	 * Include reconciled details 消込済明細含む.<p>
	 *
	 */
	public static final String $incl_appl_flg = "incl_appl_flg";
	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public static final String $zero_flg = "zero_flg";
	/**
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public static final String $slo_flg = "slo_flg";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";


	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta setoff_rcv_no_META = createCommonMeta($setoff_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta setoff_bcst_cd_META = createCommonMeta($setoff_bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta setoff_trd_cur_cd_META = createCommonMeta($setoff_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta setoff_sttl_cd_META = createCommonMeta($setoff_sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta narrow_down_flg_META = createCommonMeta($narrow_down_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_bill_flg_META = createCommonMeta($not_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta incl_appl_flg_META = createCommonMeta($incl_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta zero_flg_META = createCommonMeta($zero_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_flg_META = createCommonMeta($slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);

	protected static final ConstMetaList<Srch03_HdrR> constMetas = new ConstMetaList<Srch03_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rcv_act_no_META,
			rcv_act_seq_META,
			rcst_cd_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			trd_cur_cd_META,
			ar_sttl_cd1_META,
			setoff_rcv_no_META,
			setoff_bcst_cd_META,
			setoff_trd_cur_cd_META,
			setoff_sttl_cd_META,
			narrow_down_flg_META,
			not_bill_flg_META,
			incl_appl_flg_META,
			zero_flg_META,
			slo_flg_META,
			rcv_schd_dt_META,
			slo_no_META,
			trd_ptn_typ_META
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
	protected Srch03_HdrR_MC_A(ConstMetaList<? extends Srch03_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_HdrR clone() {
		return (Srch03_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_HdrR createInstance() {
		return (Srch03_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_HdrR getValues(String... names) {
		return (Srch03_HdrR) super.getValues(names);
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
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 2, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 2, $rcst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 3, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 3, $bcst_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 4, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 4, $bill_dpt_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 5, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 5, $trd_cur_cd, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 6, $ar_sttl_cd1);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 6, $ar_sttl_cd1, value);
	}


	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public String setoff_rcv_no() {
		return getConstString(offset + 7, $setoff_rcv_no);
	}

	/**
	 * Offset payment received No. 相殺入金ＮＯ.<p>
	 *
	 */
	public void setoff_rcv_no(String value) {
		setConstString(offset + 7, $setoff_rcv_no, value);
	}


	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public String setoff_bcst_cd() {
		return getConstString(offset + 8, $setoff_bcst_cd);
	}

	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public void setoff_bcst_cd(String value) {
		setConstString(offset + 8, $setoff_bcst_cd, value);
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
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String setoff_sttl_cd() {
		return getConstString(offset + 10, $setoff_sttl_cd);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void setoff_sttl_cd(String value) {
		setConstString(offset + 10, $setoff_sttl_cd, value);
	}


	/**
	 * Filter by payment received method 入金方法で絞り込む.<p>
	 *
	 */
	public boolean narrow_down_flg() {
		return getConstBoolean(offset + 11, $narrow_down_flg);
	}

	/**
	 * Filter by payment received method 入金方法で絞り込む.<p>
	 *
	 */
	public void narrow_down_flg(boolean value) {
		setConstBoolean(offset + 11, $narrow_down_flg, value);
	}


	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public boolean not_bill_flg() {
		return getConstBoolean(offset + 12, $not_bill_flg);
	}

	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public void not_bill_flg(boolean value) {
		setConstBoolean(offset + 12, $not_bill_flg, value);
	}


	/**
	 * Include reconciled details 消込済明細含む.<p>
	 *
	 */
	public boolean incl_appl_flg() {
		return getConstBoolean(offset + 13, $incl_appl_flg);
	}

	/**
	 * Include reconciled details 消込済明細含む.<p>
	 *
	 */
	public void incl_appl_flg(boolean value) {
		setConstBoolean(offset + 13, $incl_appl_flg, value);
	}


	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public boolean zero_flg() {
		return getConstBoolean(offset + 14, $zero_flg);
	}

	/**
	 * Display zero ０表示.<p>
	 *
	 */
	public void zero_flg(boolean value) {
		setConstBoolean(offset + 14, $zero_flg, value);
	}


	/**
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public boolean slo_flg() {
		return getConstBoolean(offset + 15, $slo_flg);
	}

	/**
	 * Include other sales orders 他の受注含む.<p>
	 *
	 */
	public void slo_flg(boolean value) {
		setConstBoolean(offset + 15, $slo_flg, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 16, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 16, $rcv_schd_dt, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 17, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 17, $slo_no, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 18, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 18, $trd_ptn_typ, value);
	}


	public String getString(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_sttl_cd.equalsIgnoreCase(name)) {
			return setoff_sttl_cd();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($narrow_down_flg.equalsIgnoreCase(name)) {
			return narrow_down_flg();
		}
		if ($not_bill_flg.equalsIgnoreCase(name)) {
			return not_bill_flg();
		}
		if ($incl_appl_flg.equalsIgnoreCase(name)) {
			return incl_appl_flg();
		}
		if ($zero_flg.equalsIgnoreCase(name)) {
			return zero_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			return setoff_rcv_no();
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			return setoff_bcst_cd();
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			return setoff_trd_cur_cd();
		}
		if ($setoff_sttl_cd.equalsIgnoreCase(name)) {
			return setoff_sttl_cd();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($narrow_down_flg.equalsIgnoreCase(name)) {
			return narrow_down_flg();
		}
		if ($not_bill_flg.equalsIgnoreCase(name)) {
			return not_bill_flg();
		}
		if ($incl_appl_flg.equalsIgnoreCase(name)) {
			return incl_appl_flg();
		}
		if ($zero_flg.equalsIgnoreCase(name)) {
			return zero_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_sttl_cd.equalsIgnoreCase(name)) {
			setoff_sttl_cd(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($narrow_down_flg.equalsIgnoreCase(name)) {
			narrow_down_flg(value);
			return;
		}
		if ($not_bill_flg.equalsIgnoreCase(name)) {
			not_bill_flg(value);
			return;
		}
		if ($incl_appl_flg.equalsIgnoreCase(name)) {
			incl_appl_flg(value);
			return;
		}
		if ($zero_flg.equalsIgnoreCase(name)) {
			zero_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($setoff_rcv_no.equalsIgnoreCase(name)) {
			setoff_rcv_no(value);
			return;
		}
		if ($setoff_bcst_cd.equalsIgnoreCase(name)) {
			setoff_bcst_cd(value);
			return;
		}
		if ($setoff_trd_cur_cd.equalsIgnoreCase(name)) {
			setoff_trd_cur_cd(value);
			return;
		}
		if ($setoff_sttl_cd.equalsIgnoreCase(name)) {
			setoff_sttl_cd(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($narrow_down_flg.equalsIgnoreCase(name)) {
			narrow_down_flg(value);
			return;
		}
		if ($not_bill_flg.equalsIgnoreCase(name)) {
			not_bill_flg(value);
			return;
		}
		if ($incl_appl_flg.equalsIgnoreCase(name)) {
			incl_appl_flg(value);
			return;
		}
		if ($zero_flg.equalsIgnoreCase(name)) {
			zero_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

