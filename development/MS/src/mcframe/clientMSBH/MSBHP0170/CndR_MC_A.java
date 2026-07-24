package mcframe.clientMSBH.MSBHP0170;

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
	 * Billing closing day FROM 請求締年月日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $bill_cl_dt_from = "bill_cl_dt_from";
	/**
	 * Billing closing day TO 請求締年月日ＴＯ.<p>
	 *
	 */
	public static final String $bill_cl_dt_to = "bill_cl_dt_to";
	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public static final String $bill_rcpt_no = "bill_rcpt_no";
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public static final String $bill_src_cd = "bill_src_cd";
	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public static final String $bill_src_nm = "bill_src_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $pay_schd_dt_from = "pay_schd_dt_from";
	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public static final String $pay_schd_dt_to = "pay_schd_dt_to";
	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public static final String $inc_invalid_flg = "inc_invalid_flg";
	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public static final String $inc_not_bill_flg = "inc_not_bill_flg";
	public static final String $billGrp_p = "billGrp_p";

	public static final String $bp_grp_lab1 = $billGrp_p + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $billGrp_p + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $billGrp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $billGrp_p + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $billGrp_p + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $billGrp_p + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $billGrp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $billGrp_p + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $billGrp_p + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $billGrp_p + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $billGrp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $billGrp_p + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $billGrp_p + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $billGrp_p + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $billGrp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $billGrp_p + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $billGrp_p + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $billGrp_p + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $billGrp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $billGrp_p + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $billGrp_p + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $billGrp_p + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $billGrp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $billGrp_p + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $billGrp_p + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $billGrp_p + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $billGrp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $billGrp_p + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $billGrp_p + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $billGrp_p + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $billGrp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $billGrp_p + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $billGrp_p + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $billGrp_p + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $billGrp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $billGrp_p + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $billGrp_p + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $billGrp_p + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $billGrp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $billGrp_p + ".bp_grp_nm10";

	public static final MCMeta bill_cl_dt_from_META = createCommonMeta($bill_cl_dt_from, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_cl_dt_to_META = createCommonMeta($bill_cl_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_rcpt_no_META = createCommonMeta($bill_rcpt_no, mcframe.commonMA.meta.MA_META.BILL_RCPT_NO);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_src_cd_META = createCommonMeta($bill_src_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_src_nm_META = createCommonMeta($bill_src_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta pay_schd_dt_from_META = createCommonMeta($pay_schd_dt_from, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_to_META = createCommonMeta($pay_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inc_invalid_flg_META = createCommonMeta($inc_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_not_bill_flg_META = createCommonMeta($inc_not_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta billGrp_p_META = createInnerRowMeta($billGrp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_cl_dt_from_META,
			bill_cl_dt_to_META,
			bill_rcpt_no_META,
			bill_no_META,
			iv_no_META,
			bill_src_cd_META,
			bill_src_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			pay_schd_dt_from_META,
			pay_schd_dt_to_META,
			inc_invalid_flg_META,
			inc_not_bill_flg_META,
			billGrp_p_META
		},
		new String[][]{
			{
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10
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
				{$bill_src_cd, "bp_nm"},	// bill_src_cd
				{$trd_cur_cd, "cur_nm"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bill_src_cd, "MAC_BP_IS_SRCH_TYP.BSPPL"}	// bill_src_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bill_src_cd, "bp_is_srch_typ"}	// bill_src_cd
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
	 * Billing closing day FROM 請求締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate bill_cl_dt_from() {
		return getConstDate(offset + 0, $bill_cl_dt_from);
	}

	/**
	 * Billing closing day FROM 請求締年月日ＦＲＯＭ.<p>
	 *
	 */
	public void bill_cl_dt_from(MCDate value) {
		setConstDate(offset + 0, $bill_cl_dt_from, value);
	}


	/**
	 * Billing closing day TO 請求締年月日ＴＯ.<p>
	 *
	 */
	public MCDate bill_cl_dt_to() {
		return getConstDate(offset + 1, $bill_cl_dt_to);
	}

	/**
	 * Billing closing day TO 請求締年月日ＴＯ.<p>
	 *
	 */
	public void bill_cl_dt_to(MCDate value) {
		setConstDate(offset + 1, $bill_cl_dt_to, value);
	}


	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public String bill_rcpt_no() {
		return getConstString(offset + 2, $bill_rcpt_no);
	}

	/**
	 * Billing receipt No. 請求受領ＮＯ.<p>
	 *
	 */
	public void bill_rcpt_no(String value) {
		setConstString(offset + 2, $bill_rcpt_no, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 3, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 3, $bill_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 4, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 4, $iv_no, value);
	}


	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public String bill_src_cd() {
		return getConstString(offset + 5, $bill_src_cd);
	}

	/**
	 * Billing source cd. 請求元ＣＤ.<p>
	 *
	 */
	public void bill_src_cd(String value) {
		setConstString(offset + 5, $bill_src_cd, value);
	}


	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public String bill_src_nm() {
		return getConstString(offset + 6, $bill_src_nm);
	}

	/**
	 * Billing source name 請求元名.<p>
	 *
	 */
	public void bill_src_nm(String value) {
		setConstString(offset + 6, $bill_src_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 7, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 7, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 8, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 8, $trd_cur_nm, value);
	}


	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate pay_schd_dt_from() {
		return getConstDate(offset + 9, $pay_schd_dt_from);
	}

	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public void pay_schd_dt_from(MCDate value) {
		setConstDate(offset + 9, $pay_schd_dt_from, value);
	}


	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public MCDate pay_schd_dt_to() {
		return getConstDate(offset + 10, $pay_schd_dt_to);
	}

	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public void pay_schd_dt_to(MCDate value) {
		setConstDate(offset + 10, $pay_schd_dt_to, value);
	}


	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public boolean inc_invalid_flg() {
		return getConstBoolean(offset + 11, $inc_invalid_flg);
	}

	/**
	 * Include invalid 無効含む.<p>
	 *
	 */
	public void inc_invalid_flg(boolean value) {
		setConstBoolean(offset + 11, $inc_invalid_flg, value);
	}


	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public boolean inc_not_bill_flg() {
		return getConstBoolean(offset + 12, $inc_not_bill_flg);
	}

	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public void inc_not_bill_flg(boolean value) {
		setConstBoolean(offset + 12, $inc_not_bill_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR billGrp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 13, $billGrp_p);
	}
	
	public void billGrp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 13, $billGrp_p, row);
	}


	public String getString(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			return bill_src_cd();
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			return bill_src_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($bill_cl_dt_from.equalsIgnoreCase(name)) {
			return bill_cl_dt_from();
		}
		if ($bill_cl_dt_to.equalsIgnoreCase(name)) {
			return bill_cl_dt_to();
		}
		if ($pay_schd_dt_from.equalsIgnoreCase(name)) {
			return pay_schd_dt_from();
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			return pay_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($inc_invalid_flg.equalsIgnoreCase(name)) {
			return inc_invalid_flg();
		}
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			return inc_not_bill_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			return bill_src_cd();
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			return bill_src_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_cl_dt_from.equalsIgnoreCase(name)) {
			return bill_cl_dt_from();
		}
		if ($bill_cl_dt_to.equalsIgnoreCase(name)) {
			return bill_cl_dt_to();
		}
		if ($pay_schd_dt_from.equalsIgnoreCase(name)) {
			return pay_schd_dt_from();
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			return pay_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($inc_invalid_flg.equalsIgnoreCase(name)) {
			return inc_invalid_flg();
		}
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			return inc_not_bill_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			bill_rcpt_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			bill_src_cd(value);
			return;
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			bill_src_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_cl_dt_from.equalsIgnoreCase(name)) {
			bill_cl_dt_from(value);
			return;
		}
		if ($bill_cl_dt_to.equalsIgnoreCase(name)) {
			bill_cl_dt_to(value);
			return;
		}
		if ($pay_schd_dt_from.equalsIgnoreCase(name)) {
			pay_schd_dt_from(value);
			return;
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			pay_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($inc_invalid_flg.equalsIgnoreCase(name)) {
			inc_invalid_flg(value);
			return;
		}
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			inc_not_bill_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			bill_rcpt_no(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			bill_src_cd(value);
			return;
		}
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			bill_src_nm(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_dt_from.equalsIgnoreCase(name)) {
			bill_cl_dt_from(value);
			return;
		}
		if ($bill_cl_dt_to.equalsIgnoreCase(name)) {
			bill_cl_dt_to(value);
			return;
		}
		if ($pay_schd_dt_from.equalsIgnoreCase(name)) {
			pay_schd_dt_from(value);
			return;
		}
		if ($pay_schd_dt_to.equalsIgnoreCase(name)) {
			pay_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($inc_invalid_flg.equalsIgnoreCase(name)) {
			inc_invalid_flg(value);
			return;
		}
		if ($inc_not_bill_flg.equalsIgnoreCase(name)) {
			inc_not_bill_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($billGrp_p.equalsIgnoreCase(name)) {
			return billGrp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($billGrp_p.equalsIgnoreCase(name)) {
			billGrp_p(
				((MCContainerMeta) billGrp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Billing source classification 1 請求元分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return billGrp_p().bp_grp_flg1();
	}

	/**
	 * Billing source classification 1 請求元分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		billGrp_p().bp_grp_flg1(value);
	}

	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return billGrp_p().bp_grp_cd1();
	}

	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		billGrp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return billGrp_p().bp_grp_nm1();
	}

	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		billGrp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing source classification 2 請求元分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return billGrp_p().bp_grp_flg2();
	}

	/**
	 * Billing source classification 2 請求元分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		billGrp_p().bp_grp_flg2(value);
	}

	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return billGrp_p().bp_grp_cd2();
	}

	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		billGrp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return billGrp_p().bp_grp_nm2();
	}

	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		billGrp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing source classification 3 請求元分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return billGrp_p().bp_grp_flg3();
	}

	/**
	 * Billing source classification 3 請求元分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		billGrp_p().bp_grp_flg3(value);
	}

	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return billGrp_p().bp_grp_cd3();
	}

	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		billGrp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return billGrp_p().bp_grp_nm3();
	}

	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		billGrp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing source classification 4 請求元分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return billGrp_p().bp_grp_flg4();
	}

	/**
	 * Billing source classification 4 請求元分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		billGrp_p().bp_grp_flg4(value);
	}

	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return billGrp_p().bp_grp_cd4();
	}

	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		billGrp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return billGrp_p().bp_grp_nm4();
	}

	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		billGrp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing source classification 5 請求元分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return billGrp_p().bp_grp_flg5();
	}

	/**
	 * Billing source classification 5 請求元分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		billGrp_p().bp_grp_flg5(value);
	}

	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return billGrp_p().bp_grp_cd5();
	}

	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		billGrp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return billGrp_p().bp_grp_nm5();
	}

	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		billGrp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing source classification 6 請求元分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return billGrp_p().bp_grp_flg6();
	}

	/**
	 * Billing source classification 6 請求元分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		billGrp_p().bp_grp_flg6(value);
	}

	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return billGrp_p().bp_grp_cd6();
	}

	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		billGrp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return billGrp_p().bp_grp_nm6();
	}

	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		billGrp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing source classification 7 請求元分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return billGrp_p().bp_grp_flg7();
	}

	/**
	 * Billing source classification 7 請求元分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		billGrp_p().bp_grp_flg7(value);
	}

	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return billGrp_p().bp_grp_cd7();
	}

	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		billGrp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return billGrp_p().bp_grp_nm7();
	}

	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		billGrp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing source classification 8 請求元分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return billGrp_p().bp_grp_flg8();
	}

	/**
	 * Billing source classification 8 請求元分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		billGrp_p().bp_grp_flg8(value);
	}

	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return billGrp_p().bp_grp_cd8();
	}

	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		billGrp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return billGrp_p().bp_grp_nm8();
	}

	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		billGrp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing source classification 9 請求元分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return billGrp_p().bp_grp_flg9();
	}

	/**
	 * Billing source classification 9 請求元分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		billGrp_p().bp_grp_flg9(value);
	}

	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return billGrp_p().bp_grp_cd9();
	}

	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		billGrp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return billGrp_p().bp_grp_nm9();
	}

	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		billGrp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing source classification 10 請求元分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return billGrp_p().bp_grp_flg10();
	}

	/**
	 * Billing source classification 10 請求元分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		billGrp_p().bp_grp_flg10(value);
	}

	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return billGrp_p().bp_grp_cd10();
	}

	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		billGrp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return billGrp_p().bp_grp_nm10();
	}

	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		billGrp_p().bp_grp_nm10(value);
	}

}

