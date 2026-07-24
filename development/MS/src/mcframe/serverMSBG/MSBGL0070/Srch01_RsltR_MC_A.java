package mcframe.serverMSBG.MSBGL0070;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
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
	 * Scheduled/Actual payment receipt date 入金予定日／実績日.<p>
	 *
	 */
	public static final String $schd_act_rcv_dt = "schd_act_rcv_dt";
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public static final String $rcv_typ = "rcv_typ";
	public static final String $rcv_reg_typ = "rcv_reg_typ";
	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public static final String $rcv_schd_amt = "rcv_schd_amt";
	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public static final String $rcv_act_amt = "rcv_act_amt";
	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public static final String $not_appl_bal = "not_appl_bal";
	/**
	 * Delay 遅延.<p>
	 *
	 */
	public static final String $delay = "delay";
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public static final String $bill_ym = "bill_ym";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $bill_cl_day = "bill_cl_day";
	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public static final String $rcv_schd_adjst_flg = "rcv_schd_adjst_flg";
	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public static final String $adjst_flg = "adjst_flg";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bcst_grp_cd1 = "bcst_grp_cd1";
	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public static final String $bcst_grp_nm1 = "bcst_grp_nm1";
	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bcst_grp_cd2 = "bcst_grp_cd2";
	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public static final String $bcst_grp_nm2 = "bcst_grp_nm2";
	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bcst_grp_cd3 = "bcst_grp_cd3";
	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public static final String $bcst_grp_nm3 = "bcst_grp_nm3";
	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bcst_grp_cd4 = "bcst_grp_cd4";
	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public static final String $bcst_grp_nm4 = "bcst_grp_nm4";
	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bcst_grp_cd5 = "bcst_grp_cd5";
	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public static final String $bcst_grp_nm5 = "bcst_grp_nm5";
	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bcst_grp_cd6 = "bcst_grp_cd6";
	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public static final String $bcst_grp_nm6 = "bcst_grp_nm6";
	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bcst_grp_cd7 = "bcst_grp_cd7";
	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public static final String $bcst_grp_nm7 = "bcst_grp_nm7";
	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bcst_grp_cd8 = "bcst_grp_cd8";
	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public static final String $bcst_grp_nm8 = "bcst_grp_nm8";
	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bcst_grp_cd9 = "bcst_grp_cd9";
	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public static final String $bcst_grp_nm9 = "bcst_grp_nm9";
	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bcst_grp_cd10 = "bcst_grp_cd10";
	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public static final String $bcst_grp_nm10 = "bcst_grp_nm10";


	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta schd_act_rcv_dt_META = createCommonMeta($schd_act_rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rcv_typ_META = createCommonMeta($rcv_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta rcv_reg_typ_META = createCommonMeta($rcv_reg_typ, mcframe.commonMA.meta.MA_META.RCV_REG_TYP);
	public static final MCMeta rcv_schd_amt_META = createCommonMeta($rcv_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_act_amt_META = createCommonMeta($rcv_act_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_bal_META = createCommonMeta($not_appl_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta delay_META = createStringMeta($delay);
	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adjst_flg_META = createCommonMeta($adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bcst_grp_cd1_META = createCommonMeta($bcst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm1_META = createCommonMeta($bcst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd2_META = createCommonMeta($bcst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm2_META = createCommonMeta($bcst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd3_META = createCommonMeta($bcst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm3_META = createCommonMeta($bcst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd4_META = createCommonMeta($bcst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm4_META = createCommonMeta($bcst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd5_META = createCommonMeta($bcst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm5_META = createCommonMeta($bcst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd6_META = createCommonMeta($bcst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm6_META = createCommonMeta($bcst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd7_META = createCommonMeta($bcst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm7_META = createCommonMeta($bcst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd8_META = createCommonMeta($bcst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm8_META = createCommonMeta($bcst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd9_META = createCommonMeta($bcst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm9_META = createCommonMeta($bcst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_cd10_META = createCommonMeta($bcst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm10_META = createCommonMeta($bcst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			schd_act_rcv_dt_META,
			rcv_mtd_cd_META,
			rcv_mtd_nm_META,
			rcv_typ_META,
			rcv_reg_typ_META,
			rcv_schd_amt_META,
			rcv_act_amt_META,
			not_appl_bal_META,
			delay_META,
			bill_ym_META,
			bill_cl_day_META,
			bill_dt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			amt_dec_place_META,
			bill_no_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			rcst_cd_META,
			rcst_nm_META,
			rcv_schd_adjst_flg_META,
			adjst_flg_META,
			bill_mng_no_META,
			bcst_grp_cd1_META,
			bcst_grp_nm1_META,
			bcst_grp_cd2_META,
			bcst_grp_nm2_META,
			bcst_grp_cd3_META,
			bcst_grp_nm3_META,
			bcst_grp_cd4_META,
			bcst_grp_nm4_META,
			bcst_grp_cd5_META,
			bcst_grp_nm5_META,
			bcst_grp_cd6_META,
			bcst_grp_nm6_META,
			bcst_grp_cd7_META,
			bcst_grp_nm7_META,
			bcst_grp_cd8_META,
			bcst_grp_nm8_META,
			bcst_grp_cd9_META,
			bcst_grp_nm9_META,
			bcst_grp_cd10_META,
			bcst_grp_nm10_META
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 0, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 0, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 1, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 1, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 4, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 4, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 5, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 5, $bcst_nm, value);
	}


	/**
	 * Scheduled/Actual payment receipt date 入金予定日／実績日.<p>
	 *
	 */
	public MCDate schd_act_rcv_dt() {
		return getConstDate(offset + 6, $schd_act_rcv_dt);
	}

	/**
	 * Scheduled/Actual payment receipt date 入金予定日／実績日.<p>
	 *
	 */
	public void schd_act_rcv_dt(MCDate value) {
		setConstDate(offset + 6, $schd_act_rcv_dt, value);
	}


	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 7, $rcv_mtd_cd);
	}

	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 7, $rcv_mtd_cd, value);
	}


	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 8, $rcv_mtd_nm);
	}

	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 8, $rcv_mtd_nm, value);
	}


	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public String rcv_typ() {
		return getConstString(offset + 9, $rcv_typ);
	}

	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public void rcv_typ(String value) {
		setConstString(offset + 9, $rcv_typ, value);
	}


	public String rcv_reg_typ() {
		return getConstString(offset + 10, $rcv_reg_typ);
	}

	public void rcv_reg_typ(String value) {
		setConstString(offset + 10, $rcv_reg_typ, value);
	}


	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public MCNumber rcv_schd_amt() {
		return getConstNumber(offset + 11, $rcv_schd_amt);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(MCNumber value) {
		setConstNumber(offset + 11, $rcv_schd_amt, value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(int value) {
		setConstNumber(offset + 11, $rcv_schd_amt, value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(long value) {
		setConstNumber(offset + 11, $rcv_schd_amt, value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(float value) {
		setConstNumber(offset + 11, $rcv_schd_amt, value);
	}

	/**
	 * Amount of payment receipt schedule 入金予定額.<p>
	 *
	 */
	public void rcv_schd_amt(double value) {
		setConstNumber(offset + 11, $rcv_schd_amt, value);
	}


	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public MCNumber rcv_act_amt() {
		return getConstNumber(offset + 12, $rcv_act_amt);
	}

	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public void rcv_act_amt(MCNumber value) {
		setConstNumber(offset + 12, $rcv_act_amt, value);
	}

	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public void rcv_act_amt(int value) {
		setConstNumber(offset + 12, $rcv_act_amt, value);
	}

	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public void rcv_act_amt(long value) {
		setConstNumber(offset + 12, $rcv_act_amt, value);
	}

	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public void rcv_act_amt(float value) {
		setConstNumber(offset + 12, $rcv_act_amt, value);
	}

	/**
	 * Payment received result amount 入金実績額.<p>
	 *
	 */
	public void rcv_act_amt(double value) {
		setConstNumber(offset + 12, $rcv_act_amt, value);
	}


	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public MCNumber not_appl_bal() {
		return getConstNumber(offset + 13, $not_appl_bal);
	}

	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public void not_appl_bal(MCNumber value) {
		setConstNumber(offset + 13, $not_appl_bal, value);
	}

	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public void not_appl_bal(int value) {
		setConstNumber(offset + 13, $not_appl_bal, value);
	}

	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public void not_appl_bal(long value) {
		setConstNumber(offset + 13, $not_appl_bal, value);
	}

	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public void not_appl_bal(float value) {
		setConstNumber(offset + 13, $not_appl_bal, value);
	}

	/**
	 * Scheduled balance 予定残高.<p>
	 *
	 */
	public void not_appl_bal(double value) {
		setConstNumber(offset + 13, $not_appl_bal, value);
	}


	/**
	 * Delay 遅延.<p>
	 *
	 */
	public String delay() {
		return getConstString(offset + 14, $delay);
	}

	/**
	 * Delay 遅延.<p>
	 *
	 */
	public void delay(String value) {
		setConstString(offset + 14, $delay, value);
	}


	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 15, $bill_ym);
	}

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 15, $bill_ym, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 16, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 16, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 16, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 16, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 16, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 16, $bill_cl_day, value);
	}


	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 17, $bill_dt);
	}

	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 17, $bill_dt, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 18, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 18, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 19, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 19, $trd_cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 20, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 20, $amt_dec_place, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 21, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 21, $bill_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 22, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 22, $iv_no, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 23, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 23, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 24, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 24, $wrk_nm, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 25, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 25, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 26, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 26, $rcst_nm, value);
	}


	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 27, $rcv_schd_adjst_flg);
	}

	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 27, $rcv_schd_adjst_flg, value);
	}


	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public boolean adjst_flg() {
		return getConstBoolean(offset + 28, $adjst_flg);
	}

	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public void adjst_flg(boolean value) {
		setConstBoolean(offset + 28, $adjst_flg, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 29, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 29, $bill_mng_no, value);
	}


	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return getConstString(offset + 30, $bcst_grp_cd1);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		setConstString(offset + 30, $bcst_grp_cd1, value);
	}


	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return getConstString(offset + 31, $bcst_grp_nm1);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		setConstString(offset + 31, $bcst_grp_nm1, value);
	}


	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return getConstString(offset + 32, $bcst_grp_cd2);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		setConstString(offset + 32, $bcst_grp_cd2, value);
	}


	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return getConstString(offset + 33, $bcst_grp_nm2);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		setConstString(offset + 33, $bcst_grp_nm2, value);
	}


	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return getConstString(offset + 34, $bcst_grp_cd3);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		setConstString(offset + 34, $bcst_grp_cd3, value);
	}


	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return getConstString(offset + 35, $bcst_grp_nm3);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		setConstString(offset + 35, $bcst_grp_nm3, value);
	}


	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return getConstString(offset + 36, $bcst_grp_cd4);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		setConstString(offset + 36, $bcst_grp_cd4, value);
	}


	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return getConstString(offset + 37, $bcst_grp_nm4);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		setConstString(offset + 37, $bcst_grp_nm4, value);
	}


	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return getConstString(offset + 38, $bcst_grp_cd5);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		setConstString(offset + 38, $bcst_grp_cd5, value);
	}


	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return getConstString(offset + 39, $bcst_grp_nm5);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		setConstString(offset + 39, $bcst_grp_nm5, value);
	}


	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bcst_grp_cd6() {
		return getConstString(offset + 40, $bcst_grp_cd6);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bcst_grp_cd6(String value) {
		setConstString(offset + 40, $bcst_grp_cd6, value);
	}


	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public String bcst_grp_nm6() {
		return getConstString(offset + 41, $bcst_grp_nm6);
	}

	/**
	 * Billing customer classification name 6 請求先分類名６.<p>
	 *
	 */
	public void bcst_grp_nm6(String value) {
		setConstString(offset + 41, $bcst_grp_nm6, value);
	}


	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return getConstString(offset + 42, $bcst_grp_cd7);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		setConstString(offset + 42, $bcst_grp_cd7, value);
	}


	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return getConstString(offset + 43, $bcst_grp_nm7);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		setConstString(offset + 43, $bcst_grp_nm7, value);
	}


	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return getConstString(offset + 44, $bcst_grp_cd8);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		setConstString(offset + 44, $bcst_grp_cd8, value);
	}


	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return getConstString(offset + 45, $bcst_grp_nm8);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		setConstString(offset + 45, $bcst_grp_nm8, value);
	}


	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return getConstString(offset + 46, $bcst_grp_cd9);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		setConstString(offset + 46, $bcst_grp_cd9, value);
	}


	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return getConstString(offset + 47, $bcst_grp_nm9);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		setConstString(offset + 47, $bcst_grp_nm9, value);
	}


	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return getConstString(offset + 48, $bcst_grp_cd10);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		setConstString(offset + 48, $bcst_grp_cd10, value);
	}


	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return getConstString(offset + 49, $bcst_grp_nm10);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		setConstString(offset + 49, $bcst_grp_nm10, value);
	}


	public String getString(String name) {
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			return rcv_reg_typ();
		}
		if ($delay.equalsIgnoreCase(name)) {
			return delay();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			return bcst_grp_cd1();
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			return bcst_grp_nm1();
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			return bcst_grp_cd2();
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			return bcst_grp_nm2();
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			return bcst_grp_cd3();
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			return bcst_grp_nm3();
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			return bcst_grp_cd4();
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			return bcst_grp_nm4();
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			return bcst_grp_cd5();
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			return bcst_grp_nm5();
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			return bcst_grp_cd6();
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			return bcst_grp_nm6();
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			return bcst_grp_cd7();
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			return bcst_grp_nm7();
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			return bcst_grp_cd8();
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			return bcst_grp_nm8();
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			return bcst_grp_cd9();
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			return bcst_grp_nm9();
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			return bcst_grp_cd10();
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			return bcst_grp_nm10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			return rcv_schd_amt();
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			return rcv_act_amt();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_act_rcv_dt.equalsIgnoreCase(name)) {
			return schd_act_rcv_dt();
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			return rcv_reg_typ();
		}
		if ($delay.equalsIgnoreCase(name)) {
			return delay();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			return bcst_grp_cd1();
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			return bcst_grp_nm1();
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			return bcst_grp_cd2();
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			return bcst_grp_nm2();
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			return bcst_grp_cd3();
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			return bcst_grp_nm3();
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			return bcst_grp_cd4();
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			return bcst_grp_nm4();
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			return bcst_grp_cd5();
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			return bcst_grp_nm5();
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			return bcst_grp_cd6();
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			return bcst_grp_nm6();
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			return bcst_grp_cd7();
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			return bcst_grp_nm7();
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			return bcst_grp_cd8();
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			return bcst_grp_nm8();
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			return bcst_grp_cd9();
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			return bcst_grp_nm9();
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			return bcst_grp_cd10();
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			return bcst_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			return rcv_schd_amt();
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			return rcv_act_amt();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_act_rcv_dt.equalsIgnoreCase(name)) {
			return schd_act_rcv_dt();
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			rcv_reg_typ(value);
			return;
		}
		if ($delay.equalsIgnoreCase(name)) {
			delay(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			bcst_grp_cd1(value);
			return;
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			bcst_grp_nm1(value);
			return;
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			bcst_grp_cd2(value);
			return;
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			bcst_grp_nm2(value);
			return;
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			bcst_grp_cd3(value);
			return;
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			bcst_grp_nm3(value);
			return;
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			bcst_grp_cd4(value);
			return;
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			bcst_grp_nm4(value);
			return;
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			bcst_grp_cd5(value);
			return;
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			bcst_grp_nm5(value);
			return;
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			bcst_grp_cd6(value);
			return;
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			bcst_grp_nm6(value);
			return;
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			bcst_grp_cd7(value);
			return;
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			bcst_grp_nm7(value);
			return;
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			bcst_grp_cd8(value);
			return;
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			bcst_grp_nm8(value);
			return;
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			bcst_grp_cd9(value);
			return;
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			bcst_grp_nm9(value);
			return;
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			bcst_grp_cd10(value);
			return;
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			bcst_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_act_rcv_dt.equalsIgnoreCase(name)) {
			schd_act_rcv_dt(value);
			return;
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			rcv_reg_typ(value);
			return;
		}
		if ($delay.equalsIgnoreCase(name)) {
			delay(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_grp_cd1.equalsIgnoreCase(name)) {
			bcst_grp_cd1(value);
			return;
		}
		if ($bcst_grp_nm1.equalsIgnoreCase(name)) {
			bcst_grp_nm1(value);
			return;
		}
		if ($bcst_grp_cd2.equalsIgnoreCase(name)) {
			bcst_grp_cd2(value);
			return;
		}
		if ($bcst_grp_nm2.equalsIgnoreCase(name)) {
			bcst_grp_nm2(value);
			return;
		}
		if ($bcst_grp_cd3.equalsIgnoreCase(name)) {
			bcst_grp_cd3(value);
			return;
		}
		if ($bcst_grp_nm3.equalsIgnoreCase(name)) {
			bcst_grp_nm3(value);
			return;
		}
		if ($bcst_grp_cd4.equalsIgnoreCase(name)) {
			bcst_grp_cd4(value);
			return;
		}
		if ($bcst_grp_nm4.equalsIgnoreCase(name)) {
			bcst_grp_nm4(value);
			return;
		}
		if ($bcst_grp_cd5.equalsIgnoreCase(name)) {
			bcst_grp_cd5(value);
			return;
		}
		if ($bcst_grp_nm5.equalsIgnoreCase(name)) {
			bcst_grp_nm5(value);
			return;
		}
		if ($bcst_grp_cd6.equalsIgnoreCase(name)) {
			bcst_grp_cd6(value);
			return;
		}
		if ($bcst_grp_nm6.equalsIgnoreCase(name)) {
			bcst_grp_nm6(value);
			return;
		}
		if ($bcst_grp_cd7.equalsIgnoreCase(name)) {
			bcst_grp_cd7(value);
			return;
		}
		if ($bcst_grp_nm7.equalsIgnoreCase(name)) {
			bcst_grp_nm7(value);
			return;
		}
		if ($bcst_grp_cd8.equalsIgnoreCase(name)) {
			bcst_grp_cd8(value);
			return;
		}
		if ($bcst_grp_nm8.equalsIgnoreCase(name)) {
			bcst_grp_nm8(value);
			return;
		}
		if ($bcst_grp_cd9.equalsIgnoreCase(name)) {
			bcst_grp_cd9(value);
			return;
		}
		if ($bcst_grp_nm9.equalsIgnoreCase(name)) {
			bcst_grp_nm9(value);
			return;
		}
		if ($bcst_grp_cd10.equalsIgnoreCase(name)) {
			bcst_grp_cd10(value);
			return;
		}
		if ($bcst_grp_nm10.equalsIgnoreCase(name)) {
			bcst_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_act_rcv_dt.equalsIgnoreCase(name)) {
			schd_act_rcv_dt(value);
			return;
		}
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

