package mcframe.clientMSBG.MSBGP0070;

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
	 * Not adjusted 未調整.<p>
	 *
	 */
	public static final String $not_adjst_flg = "not_adjst_flg";
	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public static final String $adjst_flg = "adjst_flg";
	/**
	 * Scheduled/Actual payment receipt date FROM 入金予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $schd_act_rcv_dt_fr = "schd_act_rcv_dt_fr";
	/**
	 * Scheduled/Actual payment receipt date TO 入金予定日／実績日ＴＯ.<p>
	 *
	 */
	public static final String $schd_act_rcv_dt_to = "schd_act_rcv_dt_to";
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
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	public static final String $wrk_no_p = "wrk_no_p";
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
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public static final String $dtl_flg = "dtl_flg";
	/**
	 * Include payment received 入金済含む.<p>
	 *
	 */
	public static final String $inc_appl_flg = "inc_appl_flg";
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public static final String $inc_not_cl_flg = "inc_not_cl_flg";
	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public static final String $rcv_schd_adjst_flg = "rcv_schd_adjst_flg";
	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public static final String $rfrnc_dt = "rfrnc_dt";
	public static final String $bcst_grp_p = "bcst_grp_p";
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public static final String $key_flg = "key_flg";

	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $bcst_grp_lab1 = $bcst_grp_p + ".bp_grp_lab1";
	public static final String $bcst_grp_flg1 = $bcst_grp_p + ".bp_grp_flg1";
	public static final String $bcst_grp_cd1 = $bcst_grp_p + ".bp_grp_cd1";
	public static final String $bcst_grp_nm1 = $bcst_grp_p + ".bp_grp_nm1";
	public static final String $bcst_grp_lab2 = $bcst_grp_p + ".bp_grp_lab2";
	public static final String $bcst_grp_flg2 = $bcst_grp_p + ".bp_grp_flg2";
	public static final String $bcst_grp_cd2 = $bcst_grp_p + ".bp_grp_cd2";
	public static final String $bcst_grp_nm2 = $bcst_grp_p + ".bp_grp_nm2";
	public static final String $bcst_grp_lab3 = $bcst_grp_p + ".bp_grp_lab3";
	public static final String $bcst_grp_flg3 = $bcst_grp_p + ".bp_grp_flg3";
	public static final String $bcst_grp_cd3 = $bcst_grp_p + ".bp_grp_cd3";
	public static final String $bcst_grp_nm3 = $bcst_grp_p + ".bp_grp_nm3";
	public static final String $bcst_grp_lab4 = $bcst_grp_p + ".bp_grp_lab4";
	public static final String $bcst_grp_flg4 = $bcst_grp_p + ".bp_grp_flg4";
	public static final String $bcst_grp_cd4 = $bcst_grp_p + ".bp_grp_cd4";
	public static final String $bcst_grp_nm4 = $bcst_grp_p + ".bp_grp_nm4";
	public static final String $bcst_grp_lab5 = $bcst_grp_p + ".bp_grp_lab5";
	public static final String $bcst_grp_flg5 = $bcst_grp_p + ".bp_grp_flg5";
	public static final String $bcst_grp_cd5 = $bcst_grp_p + ".bp_grp_cd5";
	public static final String $bcst_grp_nm5 = $bcst_grp_p + ".bp_grp_nm5";
	public static final String $bcst_grp_lab6 = $bcst_grp_p + ".bp_grp_lab6";
	public static final String $bcst_grp_flg6 = $bcst_grp_p + ".bp_grp_flg6";
	public static final String $bcst_grp_cd6 = $bcst_grp_p + ".bp_grp_cd6";
	public static final String $bcst_grp_nm6 = $bcst_grp_p + ".bp_grp_nm6";
	public static final String $bcst_grp_lab7 = $bcst_grp_p + ".bp_grp_lab7";
	public static final String $bcst_grp_flg7 = $bcst_grp_p + ".bp_grp_flg7";
	public static final String $bcst_grp_cd7 = $bcst_grp_p + ".bp_grp_cd7";
	public static final String $bcst_grp_nm7 = $bcst_grp_p + ".bp_grp_nm7";
	public static final String $bcst_grp_lab8 = $bcst_grp_p + ".bp_grp_lab8";
	public static final String $bcst_grp_flg8 = $bcst_grp_p + ".bp_grp_flg8";
	public static final String $bcst_grp_cd8 = $bcst_grp_p + ".bp_grp_cd8";
	public static final String $bcst_grp_nm8 = $bcst_grp_p + ".bp_grp_nm8";
	public static final String $bcst_grp_lab9 = $bcst_grp_p + ".bp_grp_lab9";
	public static final String $bcst_grp_flg9 = $bcst_grp_p + ".bp_grp_flg9";
	public static final String $bcst_grp_cd9 = $bcst_grp_p + ".bp_grp_cd9";
	public static final String $bcst_grp_nm9 = $bcst_grp_p + ".bp_grp_nm9";
	public static final String $bcst_grp_lab10 = $bcst_grp_p + ".bp_grp_lab10";
	public static final String $bcst_grp_flg10 = $bcst_grp_p + ".bp_grp_flg10";
	public static final String $bcst_grp_cd10 = $bcst_grp_p + ".bp_grp_cd10";
	public static final String $bcst_grp_nm10 = $bcst_grp_p + ".bp_grp_nm10";

	public static final MCMeta not_adjst_flg_META = createCommonMeta($not_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adjst_flg_META = createCommonMeta($adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_act_rcv_dt_fr_META = createCommonMeta($schd_act_rcv_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_act_rcv_dt_to_META = createCommonMeta($schd_act_rcv_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_appl_flg_META = createCommonMeta($inc_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_not_cl_flg_META = createCommonMeta($inc_not_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rfrnc_dt_META = createCommonMeta($rfrnc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bcst_grp_p_META = createInnerRowMeta($bcst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta key_flg_META = createCommonMeta($key_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			not_adjst_flg_META,
			adjst_flg_META,
			schd_act_rcv_dt_fr_META,
			schd_act_rcv_dt_to_META,
			bcst_cd_META,
			bcst_nm_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			bill_no_META,
			iv_no_META,
			wrk_no_p_META,
			rcst_cd_META,
			rcst_nm_META,
			dtl_flg_META,
			inc_appl_flg_META,
			inc_not_cl_flg_META,
			rcv_schd_adjst_flg_META,
			rfrnc_dt_META,
			bcst_grp_p_META,
			key_flg_META
		},
		new String[][]{
			{
				"wrk_no",
				"wrk_nm",
				"bcst_grp_flg1",
				"bcst_grp_cd1",
				"bcst_grp_nm1",
				"bcst_grp_flg2",
				"bcst_grp_cd2",
				"bcst_grp_nm2",
				"bcst_grp_flg3",
				"bcst_grp_cd3",
				"bcst_grp_nm3",
				"bcst_grp_flg4",
				"bcst_grp_cd4",
				"bcst_grp_nm4",
				"bcst_grp_flg5",
				"bcst_grp_cd5",
				"bcst_grp_nm5",
				"bcst_grp_flg6",
				"bcst_grp_cd6",
				"bcst_grp_nm6",
				"bcst_grp_flg7",
				"bcst_grp_cd7",
				"bcst_grp_nm7",
				"bcst_grp_flg8",
				"bcst_grp_cd8",
				"bcst_grp_nm8",
				"bcst_grp_flg9",
				"bcst_grp_cd9",
				"bcst_grp_nm9",
				"bcst_grp_flg10",
				"bcst_grp_cd10",
				"bcst_grp_nm10"
			},
			{
				$wrk_no,
				$wrk_nm,
				$bcst_grp_flg1,
				$bcst_grp_cd1,
				$bcst_grp_nm1,
				$bcst_grp_flg2,
				$bcst_grp_cd2,
				$bcst_grp_nm2,
				$bcst_grp_flg3,
				$bcst_grp_cd3,
				$bcst_grp_nm3,
				$bcst_grp_flg4,
				$bcst_grp_cd4,
				$bcst_grp_nm4,
				$bcst_grp_flg5,
				$bcst_grp_cd5,
				$bcst_grp_nm5,
				$bcst_grp_flg6,
				$bcst_grp_cd6,
				$bcst_grp_nm6,
				$bcst_grp_flg7,
				$bcst_grp_cd7,
				$bcst_grp_nm7,
				$bcst_grp_flg8,
				$bcst_grp_cd8,
				$bcst_grp_nm8,
				$bcst_grp_flg9,
				$bcst_grp_cd9,
				$bcst_grp_nm9,
				$bcst_grp_flg10,
				$bcst_grp_cd10,
				$bcst_grp_nm10
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
				{$bill_dpt_cd, "dpt_nm"},	// bill_dpt_cd
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$rcst_cd, "bp_nm"}	// rcst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"},	// bcst_cd
				{$bill_dpt_cd, "true;true;MAC_DPT_IS_SRCH_TYP.AR"},	// bill_dpt_cd
				{$rcst_cd, "MAC_BP_IS_SRCH_TYP.RCST"}	// rcst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$bcst_cd, "bp_is_srch_typ"},	// bcst_cd
				{$bill_dpt_cd, "dpt_nm_rem_flg;mode_today_flg;dpt_is_srch_typ"},	// bill_dpt_cd
				{$rcst_cd, "bp_is_srch_typ"}	// rcst_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	 * Not adjusted 未調整.<p>
	 *
	 */
	public boolean not_adjst_flg() {
		return getConstBoolean(offset + 0, $not_adjst_flg);
	}

	/**
	 * Not adjusted 未調整.<p>
	 *
	 */
	public void not_adjst_flg(boolean value) {
		setConstBoolean(offset + 0, $not_adjst_flg, value);
	}


	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public boolean adjst_flg() {
		return getConstBoolean(offset + 1, $adjst_flg);
	}

	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public void adjst_flg(boolean value) {
		setConstBoolean(offset + 1, $adjst_flg, value);
	}


	/**
	 * Scheduled/Actual payment receipt date FROM 入金予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate schd_act_rcv_dt_fr() {
		return getConstDate(offset + 2, $schd_act_rcv_dt_fr);
	}

	/**
	 * Scheduled/Actual payment receipt date FROM 入金予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public void schd_act_rcv_dt_fr(MCDate value) {
		setConstDate(offset + 2, $schd_act_rcv_dt_fr, value);
	}


	/**
	 * Scheduled/Actual payment receipt date TO 入金予定日／実績日ＴＯ.<p>
	 *
	 */
	public MCDate schd_act_rcv_dt_to() {
		return getConstDate(offset + 3, $schd_act_rcv_dt_to);
	}

	/**
	 * Scheduled/Actual payment receipt date TO 入金予定日／実績日ＴＯ.<p>
	 *
	 */
	public void schd_act_rcv_dt_to(MCDate value) {
		setConstDate(offset + 3, $schd_act_rcv_dt_to, value);
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
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 6, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 6, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 7, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 7, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 10, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 10, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 11, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 11, $trd_cur_nm, value);
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 12, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 12, $bill_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 13, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 13, $iv_no, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 14, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 14, $wrk_no_p, row);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 15, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 15, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 16, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 16, $rcst_nm, value);
	}


	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 17, $dtl_flg);
	}

	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 17, $dtl_flg, value);
	}


	/**
	 * Include payment received 入金済含む.<p>
	 *
	 */
	public boolean inc_appl_flg() {
		return getConstBoolean(offset + 18, $inc_appl_flg);
	}

	/**
	 * Include payment received 入金済含む.<p>
	 *
	 */
	public void inc_appl_flg(boolean value) {
		setConstBoolean(offset + 18, $inc_appl_flg, value);
	}


	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public boolean inc_not_cl_flg() {
		return getConstBoolean(offset + 19, $inc_not_cl_flg);
	}

	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public void inc_not_cl_flg(boolean value) {
		setConstBoolean(offset + 19, $inc_not_cl_flg, value);
	}


	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 20, $rcv_schd_adjst_flg);
	}

	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 20, $rcv_schd_adjst_flg, value);
	}


	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public MCDate rfrnc_dt() {
		return getConstDate(offset + 21, $rfrnc_dt);
	}

	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public void rfrnc_dt(MCDate value) {
		setConstDate(offset + 21, $rfrnc_dt, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bcst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 22, $bcst_grp_p);
	}
	
	public void bcst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 22, $bcst_grp_p, row);
	}


	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public boolean key_flg() {
		return getConstBoolean(offset + 23, $key_flg);
	}

	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public void key_flg(boolean value) {
		setConstBoolean(offset + 23, $key_flg, value);
	}


	public String getString(String name) {
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($schd_act_rcv_dt_fr.equalsIgnoreCase(name)) {
			return schd_act_rcv_dt_fr();
		}
		if ($schd_act_rcv_dt_to.equalsIgnoreCase(name)) {
			return schd_act_rcv_dt_to();
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			return rfrnc_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			return not_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			return inc_appl_flg();
		}
		if ($inc_not_cl_flg.equalsIgnoreCase(name)) {
			return inc_not_cl_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			return key_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_act_rcv_dt_fr.equalsIgnoreCase(name)) {
			return schd_act_rcv_dt_fr();
		}
		if ($schd_act_rcv_dt_to.equalsIgnoreCase(name)) {
			return schd_act_rcv_dt_to();
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			return rfrnc_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			return not_adjst_flg();
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			return adjst_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			return inc_appl_flg();
		}
		if ($inc_not_cl_flg.equalsIgnoreCase(name)) {
			return inc_not_cl_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			return key_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_act_rcv_dt_fr.equalsIgnoreCase(name)) {
			schd_act_rcv_dt_fr(value);
			return;
		}
		if ($schd_act_rcv_dt_to.equalsIgnoreCase(name)) {
			schd_act_rcv_dt_to(value);
			return;
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			rfrnc_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			not_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			inc_appl_flg(value);
			return;
		}
		if ($inc_not_cl_flg.equalsIgnoreCase(name)) {
			inc_not_cl_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			key_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_act_rcv_dt_fr.equalsIgnoreCase(name)) {
			schd_act_rcv_dt_fr(value);
			return;
		}
		if ($schd_act_rcv_dt_to.equalsIgnoreCase(name)) {
			schd_act_rcv_dt_to(value);
			return;
		}
		if ($rfrnc_dt.equalsIgnoreCase(name)) {
			rfrnc_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($not_adjst_flg.equalsIgnoreCase(name)) {
			not_adjst_flg(value);
			return;
		}
		if ($adjst_flg.equalsIgnoreCase(name)) {
			adjst_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($inc_appl_flg.equalsIgnoreCase(name)) {
			inc_appl_flg(value);
			return;
		}
		if ($inc_not_cl_flg.equalsIgnoreCase(name)) {
			inc_not_cl_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($key_flg.equalsIgnoreCase(name)) {
			key_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			return bcst_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($bcst_grp_p.equalsIgnoreCase(name)) {
			bcst_grp_p(
				((MCContainerMeta) bcst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bcst_grp_flg1() {
		return bcst_grp_p().bp_grp_flg1();
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bcst_grp_flg1(boolean value) {
		bcst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return bcst_grp_p().bp_grp_cd1();
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		bcst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Billing classification name 1 請求分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return bcst_grp_p().bp_grp_nm1();
	}

	/**
	 * Billing classification name 1 請求分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		bcst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bcst_grp_flg2() {
		return bcst_grp_p().bp_grp_flg2();
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bcst_grp_flg2(boolean value) {
		bcst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return bcst_grp_p().bp_grp_cd2();
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		bcst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Billing classification name 2 請求分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return bcst_grp_p().bp_grp_nm2();
	}

	/**
	 * Billing classification name 2 請求分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		bcst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bcst_grp_flg3() {
		return bcst_grp_p().bp_grp_flg3();
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bcst_grp_flg3(boolean value) {
		bcst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return bcst_grp_p().bp_grp_cd3();
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		bcst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Billing classification name 3 請求分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return bcst_grp_p().bp_grp_nm3();
	}

	/**
	 * Billing classification name 3 請求分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		bcst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bcst_grp_flg4() {
		return bcst_grp_p().bp_grp_flg4();
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bcst_grp_flg4(boolean value) {
		bcst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return bcst_grp_p().bp_grp_cd4();
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		bcst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Billing classification name 4 請求分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return bcst_grp_p().bp_grp_nm4();
	}

	/**
	 * Billing classification name 4 請求分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		bcst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bcst_grp_flg5() {
		return bcst_grp_p().bp_grp_flg5();
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bcst_grp_flg5(boolean value) {
		bcst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return bcst_grp_p().bp_grp_cd5();
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		bcst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Billing classification name 5 請求分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return bcst_grp_p().bp_grp_nm5();
	}

	/**
	 * Billing classification name 5 請求分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		bcst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bcst_grp_flg6() {
		return bcst_grp_p().bp_grp_flg6();
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bcst_grp_flg6(boolean value) {
		bcst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public String bcst_grp_cd6() {
		return bcst_grp_p().bp_grp_cd6();
	}

	/**
	 * Billing customer classification cd. 6 請求先分類ＣＤ６.<p>
	 *
	 */
	public void bcst_grp_cd6(String value) {
		bcst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Billing classification name 6 請求分類名６.<p>
	 *
	 */
	public String bcst_grp_nm6() {
		return bcst_grp_p().bp_grp_nm6();
	}

	/**
	 * Billing classification name 6 請求分類名６.<p>
	 *
	 */
	public void bcst_grp_nm6(String value) {
		bcst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bcst_grp_flg7() {
		return bcst_grp_p().bp_grp_flg7();
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bcst_grp_flg7(boolean value) {
		bcst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return bcst_grp_p().bp_grp_cd7();
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		bcst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Billing classification name 7 請求分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return bcst_grp_p().bp_grp_nm7();
	}

	/**
	 * Billing classification name 7 請求分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		bcst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bcst_grp_flg8() {
		return bcst_grp_p().bp_grp_flg8();
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bcst_grp_flg8(boolean value) {
		bcst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return bcst_grp_p().bp_grp_cd8();
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		bcst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Billing classification name 8 請求分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return bcst_grp_p().bp_grp_nm8();
	}

	/**
	 * Billing classification name 8 請求分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		bcst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bcst_grp_flg9() {
		return bcst_grp_p().bp_grp_flg9();
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bcst_grp_flg9(boolean value) {
		bcst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return bcst_grp_p().bp_grp_cd9();
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		bcst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Billing classification name 9 請求分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return bcst_grp_p().bp_grp_nm9();
	}

	/**
	 * Billing classification name 9 請求分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		bcst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bcst_grp_flg10() {
		return bcst_grp_p().bp_grp_flg10();
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bcst_grp_flg10(boolean value) {
		bcst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return bcst_grp_p().bp_grp_cd10();
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		bcst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Billing classification name 10 請求分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return bcst_grp_p().bp_grp_nm10();
	}

	/**
	 * Billing classification name 10 請求分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		bcst_grp_p().bp_grp_nm10(value);
	}

}

