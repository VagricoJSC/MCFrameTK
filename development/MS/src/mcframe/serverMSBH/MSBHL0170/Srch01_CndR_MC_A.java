package mcframe.serverMSBH.MSBHL0170;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	/**
	 * Billing source classification 1 請求元分類１.<p>
	 *
	 */
	public static final String $bp_grp_flg1 = "bp_grp_flg1";
	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	/**
	 * Billing source classification 2 請求元分類２.<p>
	 *
	 */
	public static final String $bp_grp_flg2 = "bp_grp_flg2";
	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	/**
	 * Billing source classification 3 請求元分類３.<p>
	 *
	 */
	public static final String $bp_grp_flg3 = "bp_grp_flg3";
	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	/**
	 * Billing source classification 4 請求元分類４.<p>
	 *
	 */
	public static final String $bp_grp_flg4 = "bp_grp_flg4";
	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	/**
	 * Billing source classification 5 請求元分類５.<p>
	 *
	 */
	public static final String $bp_grp_flg5 = "bp_grp_flg5";
	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	/**
	 * Billing source classification 6 請求元分類６.<p>
	 *
	 */
	public static final String $bp_grp_flg6 = "bp_grp_flg6";
	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	/**
	 * Billing source classification 7 請求元分類７.<p>
	 *
	 */
	public static final String $bp_grp_flg7 = "bp_grp_flg7";
	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	/**
	 * Billing source classification 8 請求元分類８.<p>
	 *
	 */
	public static final String $bp_grp_flg8 = "bp_grp_flg8";
	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	/**
	 * Billing source classification 9 請求元分類９.<p>
	 *
	 */
	public static final String $bp_grp_flg9 = "bp_grp_flg9";
	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	/**
	 * Billing source classification 10 請求元分類１０.<p>
	 *
	 */
	public static final String $bp_grp_flg10 = "bp_grp_flg10";
	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";


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
	public static final MCMeta bp_grp_flg1_META = createCommonMeta($bp_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg2_META = createCommonMeta($bp_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg3_META = createCommonMeta($bp_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg4_META = createCommonMeta($bp_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg5_META = createCommonMeta($bp_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg6_META = createCommonMeta($bp_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg7_META = createCommonMeta($bp_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg8_META = createCommonMeta($bp_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg9_META = createCommonMeta($bp_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg10_META = createCommonMeta($bp_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
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
			bp_grp_flg1_META,
			bp_grp_cd1_META,
			bp_grp_nm1_META,
			bp_grp_flg2_META,
			bp_grp_cd2_META,
			bp_grp_nm2_META,
			bp_grp_flg3_META,
			bp_grp_cd3_META,
			bp_grp_nm3_META,
			bp_grp_flg4_META,
			bp_grp_cd4_META,
			bp_grp_nm4_META,
			bp_grp_flg5_META,
			bp_grp_cd5_META,
			bp_grp_nm5_META,
			bp_grp_flg6_META,
			bp_grp_cd6_META,
			bp_grp_nm6_META,
			bp_grp_flg7_META,
			bp_grp_cd7_META,
			bp_grp_nm7_META,
			bp_grp_flg8_META,
			bp_grp_cd8_META,
			bp_grp_nm8_META,
			bp_grp_flg9_META,
			bp_grp_cd9_META,
			bp_grp_nm9_META,
			bp_grp_flg10_META,
			bp_grp_cd10_META,
			bp_grp_nm10_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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


	/**
	 * Billing source classification 1 請求元分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return getConstBoolean(offset + 13, $bp_grp_flg1);
	}

	/**
	 * Billing source classification 1 請求元分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		setConstBoolean(offset + 13, $bp_grp_flg1, value);
	}


	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 14, $bp_grp_cd1);
	}

	/**
	 * Billing source classification cd. 1 請求元分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 14, $bp_grp_cd1, value);
	}


	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 15, $bp_grp_nm1);
	}

	/**
	 * Billing source classification name 1 請求元分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 15, $bp_grp_nm1, value);
	}


	/**
	 * Billing source classification 2 請求元分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return getConstBoolean(offset + 16, $bp_grp_flg2);
	}

	/**
	 * Billing source classification 2 請求元分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		setConstBoolean(offset + 16, $bp_grp_flg2, value);
	}


	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 17, $bp_grp_cd2);
	}

	/**
	 * Billing source classification cd. 2 請求元分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 17, $bp_grp_cd2, value);
	}


	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 18, $bp_grp_nm2);
	}

	/**
	 * Billing source classification name 2 請求元分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 18, $bp_grp_nm2, value);
	}


	/**
	 * Billing source classification 3 請求元分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return getConstBoolean(offset + 19, $bp_grp_flg3);
	}

	/**
	 * Billing source classification 3 請求元分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		setConstBoolean(offset + 19, $bp_grp_flg3, value);
	}


	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 20, $bp_grp_cd3);
	}

	/**
	 * Billing source classification cd. 3 請求元分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 20, $bp_grp_cd3, value);
	}


	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 21, $bp_grp_nm3);
	}

	/**
	 * Billing source classification name 3 請求元分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 21, $bp_grp_nm3, value);
	}


	/**
	 * Billing source classification 4 請求元分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return getConstBoolean(offset + 22, $bp_grp_flg4);
	}

	/**
	 * Billing source classification 4 請求元分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		setConstBoolean(offset + 22, $bp_grp_flg4, value);
	}


	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 23, $bp_grp_cd4);
	}

	/**
	 * Billing source classification cd. 4 請求元分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 23, $bp_grp_cd4, value);
	}


	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 24, $bp_grp_nm4);
	}

	/**
	 * Billing source classification name 4 請求元分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 24, $bp_grp_nm4, value);
	}


	/**
	 * Billing source classification 5 請求元分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return getConstBoolean(offset + 25, $bp_grp_flg5);
	}

	/**
	 * Billing source classification 5 請求元分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		setConstBoolean(offset + 25, $bp_grp_flg5, value);
	}


	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 26, $bp_grp_cd5);
	}

	/**
	 * Billing source classification cd. 5 請求元分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 26, $bp_grp_cd5, value);
	}


	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 27, $bp_grp_nm5);
	}

	/**
	 * Billing source classification name 5 請求元分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 27, $bp_grp_nm5, value);
	}


	/**
	 * Billing source classification 6 請求元分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return getConstBoolean(offset + 28, $bp_grp_flg6);
	}

	/**
	 * Billing source classification 6 請求元分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		setConstBoolean(offset + 28, $bp_grp_flg6, value);
	}


	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 29, $bp_grp_cd6);
	}

	/**
	 * Billing source classification cd. 6 請求元分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 29, $bp_grp_cd6, value);
	}


	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 30, $bp_grp_nm6);
	}

	/**
	 * Billing source classification name 6 請求元分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 30, $bp_grp_nm6, value);
	}


	/**
	 * Billing source classification 7 請求元分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return getConstBoolean(offset + 31, $bp_grp_flg7);
	}

	/**
	 * Billing source classification 7 請求元分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		setConstBoolean(offset + 31, $bp_grp_flg7, value);
	}


	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 32, $bp_grp_cd7);
	}

	/**
	 * Billing source classification cd. 7 請求元分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 32, $bp_grp_cd7, value);
	}


	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 33, $bp_grp_nm7);
	}

	/**
	 * Billing source classification name 7 請求元分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 33, $bp_grp_nm7, value);
	}


	/**
	 * Billing source classification 8 請求元分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return getConstBoolean(offset + 34, $bp_grp_flg8);
	}

	/**
	 * Billing source classification 8 請求元分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		setConstBoolean(offset + 34, $bp_grp_flg8, value);
	}


	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 35, $bp_grp_cd8);
	}

	/**
	 * Billing source classification cd. 8 請求元分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 35, $bp_grp_cd8, value);
	}


	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 36, $bp_grp_nm8);
	}

	/**
	 * Billing source classification name 8 請求元分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 36, $bp_grp_nm8, value);
	}


	/**
	 * Billing source classification 9 請求元分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return getConstBoolean(offset + 37, $bp_grp_flg9);
	}

	/**
	 * Billing source classification 9 請求元分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		setConstBoolean(offset + 37, $bp_grp_flg9, value);
	}


	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 38, $bp_grp_cd9);
	}

	/**
	 * Billing source classification cd. 9 請求元分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 38, $bp_grp_cd9, value);
	}


	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 39, $bp_grp_nm9);
	}

	/**
	 * Billing source classification name 9 請求元分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 39, $bp_grp_nm9, value);
	}


	/**
	 * Billing source classification 10 請求元分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return getConstBoolean(offset + 40, $bp_grp_flg10);
	}

	/**
	 * Billing source classification 10 請求元分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		setConstBoolean(offset + 40, $bp_grp_flg10, value);
	}


	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 41, $bp_grp_cd10);
	}

	/**
	 * Billing source classification cd. 10 請求元分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 41, $bp_grp_cd10, value);
	}


	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 42, $bp_grp_nm10);
	}

	/**
	 * Billing source classification name 10 請求元分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 42, $bp_grp_nm10, value);
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
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
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
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
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
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
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
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
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
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
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

