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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

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
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public static final String $dtl_flg = "dtl_flg";
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public static final String $key_flg = "key_flg";
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
	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public static final String $bcst_grp_flg1 = "bcst_grp_flg1";
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
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public static final String $bcst_grp_flg2 = "bcst_grp_flg2";
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
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public static final String $bcst_grp_flg3 = "bcst_grp_flg3";
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
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public static final String $bcst_grp_flg4 = "bcst_grp_flg4";
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
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public static final String $bcst_grp_flg5 = "bcst_grp_flg5";
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
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public static final String $bcst_grp_flg6 = "bcst_grp_flg6";
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
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public static final String $bcst_grp_flg7 = "bcst_grp_flg7";
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
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public static final String $bcst_grp_flg8 = "bcst_grp_flg8";
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
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public static final String $bcst_grp_flg9 = "bcst_grp_flg9";
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
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public static final String $bcst_grp_flg10 = "bcst_grp_flg10";
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
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta key_flg_META = createCommonMeta($key_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_appl_flg_META = createCommonMeta($inc_appl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_not_cl_flg_META = createCommonMeta($inc_not_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rfrnc_dt_META = createCommonMeta($rfrnc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bcst_grp_flg1_META = createCommonMeta($bcst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd1_META = createCommonMeta($bcst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm1_META = createCommonMeta($bcst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg2_META = createCommonMeta($bcst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd2_META = createCommonMeta($bcst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm2_META = createCommonMeta($bcst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg3_META = createCommonMeta($bcst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd3_META = createCommonMeta($bcst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm3_META = createCommonMeta($bcst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg4_META = createCommonMeta($bcst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd4_META = createCommonMeta($bcst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm4_META = createCommonMeta($bcst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg5_META = createCommonMeta($bcst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd5_META = createCommonMeta($bcst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm5_META = createCommonMeta($bcst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg6_META = createCommonMeta($bcst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd6_META = createCommonMeta($bcst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm6_META = createCommonMeta($bcst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg7_META = createCommonMeta($bcst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd7_META = createCommonMeta($bcst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm7_META = createCommonMeta($bcst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg8_META = createCommonMeta($bcst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd8_META = createCommonMeta($bcst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm8_META = createCommonMeta($bcst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg9_META = createCommonMeta($bcst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd9_META = createCommonMeta($bcst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm9_META = createCommonMeta($bcst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bcst_grp_flg10_META = createCommonMeta($bcst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bcst_grp_cd10_META = createCommonMeta($bcst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bcst_grp_nm10_META = createCommonMeta($bcst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
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
			wrk_no_META,
			wrk_nm_META,
			rcst_cd_META,
			rcst_nm_META,
			dtl_flg_META,
			key_flg_META,
			inc_appl_flg_META,
			inc_not_cl_flg_META,
			rcv_schd_adjst_flg_META,
			rfrnc_dt_META,
			bcst_grp_flg1_META,
			bcst_grp_cd1_META,
			bcst_grp_nm1_META,
			bcst_grp_flg2_META,
			bcst_grp_cd2_META,
			bcst_grp_nm2_META,
			bcst_grp_flg3_META,
			bcst_grp_cd3_META,
			bcst_grp_nm3_META,
			bcst_grp_flg4_META,
			bcst_grp_cd4_META,
			bcst_grp_nm4_META,
			bcst_grp_flg5_META,
			bcst_grp_cd5_META,
			bcst_grp_nm5_META,
			bcst_grp_flg6_META,
			bcst_grp_cd6_META,
			bcst_grp_nm6_META,
			bcst_grp_flg7_META,
			bcst_grp_cd7_META,
			bcst_grp_nm7_META,
			bcst_grp_flg8_META,
			bcst_grp_cd8_META,
			bcst_grp_nm8_META,
			bcst_grp_flg9_META,
			bcst_grp_cd9_META,
			bcst_grp_nm9_META,
			bcst_grp_flg10_META,
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


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 14, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 14, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 15, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 15, $wrk_nm, value);
	}


	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 16, $rcst_cd);
	}

	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 16, $rcst_cd, value);
	}


	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 17, $rcst_nm);
	}

	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 17, $rcst_nm, value);
	}


	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 18, $dtl_flg);
	}

	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 18, $dtl_flg, value);
	}


	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public boolean key_flg() {
		return getConstBoolean(offset + 19, $key_flg);
	}

	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public void key_flg(boolean value) {
		setConstBoolean(offset + 19, $key_flg, value);
	}


	/**
	 * Include payment received 入金済含む.<p>
	 *
	 */
	public boolean inc_appl_flg() {
		return getConstBoolean(offset + 20, $inc_appl_flg);
	}

	/**
	 * Include payment received 入金済含む.<p>
	 *
	 */
	public void inc_appl_flg(boolean value) {
		setConstBoolean(offset + 20, $inc_appl_flg, value);
	}


	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public boolean inc_not_cl_flg() {
		return getConstBoolean(offset + 21, $inc_not_cl_flg);
	}

	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public void inc_not_cl_flg(boolean value) {
		setConstBoolean(offset + 21, $inc_not_cl_flg, value);
	}


	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 22, $rcv_schd_adjst_flg);
	}

	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 22, $rcv_schd_adjst_flg, value);
	}


	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public MCDate rfrnc_dt() {
		return getConstDate(offset + 23, $rfrnc_dt);
	}

	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public void rfrnc_dt(MCDate value) {
		setConstDate(offset + 23, $rfrnc_dt, value);
	}


	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public boolean bcst_grp_flg1() {
		return getConstBoolean(offset + 24, $bcst_grp_flg1);
	}

	/**
	 * Billing customer classification 1 請求先分類１.<p>
	 *
	 */
	public void bcst_grp_flg1(boolean value) {
		setConstBoolean(offset + 24, $bcst_grp_flg1, value);
	}


	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public String bcst_grp_cd1() {
		return getConstString(offset + 25, $bcst_grp_cd1);
	}

	/**
	 * Billing customer classification cd. 1 請求先分類ＣＤ１.<p>
	 *
	 */
	public void bcst_grp_cd1(String value) {
		setConstString(offset + 25, $bcst_grp_cd1, value);
	}


	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public String bcst_grp_nm1() {
		return getConstString(offset + 26, $bcst_grp_nm1);
	}

	/**
	 * Billing customer classification name 1 請求先分類名１.<p>
	 *
	 */
	public void bcst_grp_nm1(String value) {
		setConstString(offset + 26, $bcst_grp_nm1, value);
	}


	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public boolean bcst_grp_flg2() {
		return getConstBoolean(offset + 27, $bcst_grp_flg2);
	}

	/**
	 * Billing customer classification 2 請求先分類２.<p>
	 *
	 */
	public void bcst_grp_flg2(boolean value) {
		setConstBoolean(offset + 27, $bcst_grp_flg2, value);
	}


	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public String bcst_grp_cd2() {
		return getConstString(offset + 28, $bcst_grp_cd2);
	}

	/**
	 * Billing customer classification cd. 2 請求先分類ＣＤ２.<p>
	 *
	 */
	public void bcst_grp_cd2(String value) {
		setConstString(offset + 28, $bcst_grp_cd2, value);
	}


	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public String bcst_grp_nm2() {
		return getConstString(offset + 29, $bcst_grp_nm2);
	}

	/**
	 * Billing customer classification name 2 請求先分類名２.<p>
	 *
	 */
	public void bcst_grp_nm2(String value) {
		setConstString(offset + 29, $bcst_grp_nm2, value);
	}


	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public boolean bcst_grp_flg3() {
		return getConstBoolean(offset + 30, $bcst_grp_flg3);
	}

	/**
	 * Billing customer classification 3 請求先分類３.<p>
	 *
	 */
	public void bcst_grp_flg3(boolean value) {
		setConstBoolean(offset + 30, $bcst_grp_flg3, value);
	}


	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public String bcst_grp_cd3() {
		return getConstString(offset + 31, $bcst_grp_cd3);
	}

	/**
	 * Billing customer classification cd. 3 請求先分類ＣＤ３.<p>
	 *
	 */
	public void bcst_grp_cd3(String value) {
		setConstString(offset + 31, $bcst_grp_cd3, value);
	}


	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public String bcst_grp_nm3() {
		return getConstString(offset + 32, $bcst_grp_nm3);
	}

	/**
	 * Billing customer classification name 3 請求先分類名３.<p>
	 *
	 */
	public void bcst_grp_nm3(String value) {
		setConstString(offset + 32, $bcst_grp_nm3, value);
	}


	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public boolean bcst_grp_flg4() {
		return getConstBoolean(offset + 33, $bcst_grp_flg4);
	}

	/**
	 * Billing customer classification 4 請求先分類４.<p>
	 *
	 */
	public void bcst_grp_flg4(boolean value) {
		setConstBoolean(offset + 33, $bcst_grp_flg4, value);
	}


	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public String bcst_grp_cd4() {
		return getConstString(offset + 34, $bcst_grp_cd4);
	}

	/**
	 * Billing customer classification cd. 4 請求先分類ＣＤ４.<p>
	 *
	 */
	public void bcst_grp_cd4(String value) {
		setConstString(offset + 34, $bcst_grp_cd4, value);
	}


	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public String bcst_grp_nm4() {
		return getConstString(offset + 35, $bcst_grp_nm4);
	}

	/**
	 * Billing customer classification name 4 請求先分類名４.<p>
	 *
	 */
	public void bcst_grp_nm4(String value) {
		setConstString(offset + 35, $bcst_grp_nm4, value);
	}


	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public boolean bcst_grp_flg5() {
		return getConstBoolean(offset + 36, $bcst_grp_flg5);
	}

	/**
	 * Billing customer classification 5 請求先分類５.<p>
	 *
	 */
	public void bcst_grp_flg5(boolean value) {
		setConstBoolean(offset + 36, $bcst_grp_flg5, value);
	}


	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public String bcst_grp_cd5() {
		return getConstString(offset + 37, $bcst_grp_cd5);
	}

	/**
	 * Billing customer classification cd. 5 請求先分類ＣＤ５.<p>
	 *
	 */
	public void bcst_grp_cd5(String value) {
		setConstString(offset + 37, $bcst_grp_cd5, value);
	}


	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public String bcst_grp_nm5() {
		return getConstString(offset + 38, $bcst_grp_nm5);
	}

	/**
	 * Billing customer classification name 5 請求先分類名５.<p>
	 *
	 */
	public void bcst_grp_nm5(String value) {
		setConstString(offset + 38, $bcst_grp_nm5, value);
	}


	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public boolean bcst_grp_flg6() {
		return getConstBoolean(offset + 39, $bcst_grp_flg6);
	}

	/**
	 * Billing customer classification 6 請求先分類６.<p>
	 *
	 */
	public void bcst_grp_flg6(boolean value) {
		setConstBoolean(offset + 39, $bcst_grp_flg6, value);
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
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public boolean bcst_grp_flg7() {
		return getConstBoolean(offset + 42, $bcst_grp_flg7);
	}

	/**
	 * Billing customer classification 7 請求先分類７.<p>
	 *
	 */
	public void bcst_grp_flg7(boolean value) {
		setConstBoolean(offset + 42, $bcst_grp_flg7, value);
	}


	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public String bcst_grp_cd7() {
		return getConstString(offset + 43, $bcst_grp_cd7);
	}

	/**
	 * Billing customer classification cd. 7 請求先分類ＣＤ７.<p>
	 *
	 */
	public void bcst_grp_cd7(String value) {
		setConstString(offset + 43, $bcst_grp_cd7, value);
	}


	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public String bcst_grp_nm7() {
		return getConstString(offset + 44, $bcst_grp_nm7);
	}

	/**
	 * Billing customer classification name 7 請求先分類名７.<p>
	 *
	 */
	public void bcst_grp_nm7(String value) {
		setConstString(offset + 44, $bcst_grp_nm7, value);
	}


	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public boolean bcst_grp_flg8() {
		return getConstBoolean(offset + 45, $bcst_grp_flg8);
	}

	/**
	 * Billing customer classification 8 請求先分類８.<p>
	 *
	 */
	public void bcst_grp_flg8(boolean value) {
		setConstBoolean(offset + 45, $bcst_grp_flg8, value);
	}


	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public String bcst_grp_cd8() {
		return getConstString(offset + 46, $bcst_grp_cd8);
	}

	/**
	 * Billing customer classification cd. 8 請求先分類ＣＤ８.<p>
	 *
	 */
	public void bcst_grp_cd8(String value) {
		setConstString(offset + 46, $bcst_grp_cd8, value);
	}


	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public String bcst_grp_nm8() {
		return getConstString(offset + 47, $bcst_grp_nm8);
	}

	/**
	 * Billing customer classification name 8 請求先分類名８.<p>
	 *
	 */
	public void bcst_grp_nm8(String value) {
		setConstString(offset + 47, $bcst_grp_nm8, value);
	}


	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public boolean bcst_grp_flg9() {
		return getConstBoolean(offset + 48, $bcst_grp_flg9);
	}

	/**
	 * Billing customer classification 9 請求先分類９.<p>
	 *
	 */
	public void bcst_grp_flg9(boolean value) {
		setConstBoolean(offset + 48, $bcst_grp_flg9, value);
	}


	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public String bcst_grp_cd9() {
		return getConstString(offset + 49, $bcst_grp_cd9);
	}

	/**
	 * Billing customer classification cd. 9 請求先分類ＣＤ９.<p>
	 *
	 */
	public void bcst_grp_cd9(String value) {
		setConstString(offset + 49, $bcst_grp_cd9, value);
	}


	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public String bcst_grp_nm9() {
		return getConstString(offset + 50, $bcst_grp_nm9);
	}

	/**
	 * Billing customer classification name 9 請求先分類名９.<p>
	 *
	 */
	public void bcst_grp_nm9(String value) {
		setConstString(offset + 50, $bcst_grp_nm9, value);
	}


	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public boolean bcst_grp_flg10() {
		return getConstBoolean(offset + 51, $bcst_grp_flg10);
	}

	/**
	 * Billing customer classification 10 請求先分類１０.<p>
	 *
	 */
	public void bcst_grp_flg10(boolean value) {
		setConstBoolean(offset + 51, $bcst_grp_flg10, value);
	}


	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public String bcst_grp_cd10() {
		return getConstString(offset + 52, $bcst_grp_cd10);
	}

	/**
	 * Billing customer classification cd. 10 請求先分類ＣＤ１０.<p>
	 *
	 */
	public void bcst_grp_cd10(String value) {
		setConstString(offset + 52, $bcst_grp_cd10, value);
	}


	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public String bcst_grp_nm10() {
		return getConstString(offset + 53, $bcst_grp_nm10);
	}

	/**
	 * Billing customer classification name 10 請求先分類名１０.<p>
	 *
	 */
	public void bcst_grp_nm10(String value) {
		setConstString(offset + 53, $bcst_grp_nm10, value);
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
		if ($key_flg.equalsIgnoreCase(name)) {
			return key_flg();
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
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			return bcst_grp_flg1();
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			return bcst_grp_flg2();
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			return bcst_grp_flg3();
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			return bcst_grp_flg4();
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			return bcst_grp_flg5();
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			return bcst_grp_flg6();
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			return bcst_grp_flg7();
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			return bcst_grp_flg8();
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			return bcst_grp_flg9();
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			return bcst_grp_flg10();
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
		if ($key_flg.equalsIgnoreCase(name)) {
			return key_flg();
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
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			return bcst_grp_flg1();
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			return bcst_grp_flg2();
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			return bcst_grp_flg3();
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			return bcst_grp_flg4();
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			return bcst_grp_flg5();
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			return bcst_grp_flg6();
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			return bcst_grp_flg7();
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			return bcst_grp_flg8();
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			return bcst_grp_flg9();
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			return bcst_grp_flg10();
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
		if ($key_flg.equalsIgnoreCase(name)) {
			key_flg(value);
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
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			bcst_grp_flg1(value);
			return;
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			bcst_grp_flg2(value);
			return;
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			bcst_grp_flg3(value);
			return;
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			bcst_grp_flg4(value);
			return;
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			bcst_grp_flg5(value);
			return;
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			bcst_grp_flg6(value);
			return;
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			bcst_grp_flg7(value);
			return;
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			bcst_grp_flg8(value);
			return;
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			bcst_grp_flg9(value);
			return;
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			bcst_grp_flg10(value);
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
		if ($key_flg.equalsIgnoreCase(name)) {
			key_flg(value);
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
		if ($bcst_grp_flg1.equalsIgnoreCase(name)) {
			bcst_grp_flg1(value);
			return;
		}
		if ($bcst_grp_flg2.equalsIgnoreCase(name)) {
			bcst_grp_flg2(value);
			return;
		}
		if ($bcst_grp_flg3.equalsIgnoreCase(name)) {
			bcst_grp_flg3(value);
			return;
		}
		if ($bcst_grp_flg4.equalsIgnoreCase(name)) {
			bcst_grp_flg4(value);
			return;
		}
		if ($bcst_grp_flg5.equalsIgnoreCase(name)) {
			bcst_grp_flg5(value);
			return;
		}
		if ($bcst_grp_flg6.equalsIgnoreCase(name)) {
			bcst_grp_flg6(value);
			return;
		}
		if ($bcst_grp_flg7.equalsIgnoreCase(name)) {
			bcst_grp_flg7(value);
			return;
		}
		if ($bcst_grp_flg8.equalsIgnoreCase(name)) {
			bcst_grp_flg8(value);
			return;
		}
		if ($bcst_grp_flg9.equalsIgnoreCase(name)) {
			bcst_grp_flg9(value);
			return;
		}
		if ($bcst_grp_flg10.equalsIgnoreCase(name)) {
			bcst_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

