package mcframe.serverMSBH.MSBHL5080;

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
 * ブロック"ApSetoff_Srch04_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ApSetoff_Srch04_DtlR_MC_A extends MCConstRow {

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public static final String $onr_prov_amt = "onr_prov_amt";
	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public static final String $onr_prov_ret_amt = "onr_prov_ret_amt";
	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public static final String $setoff_schd_amt = "setoff_schd_amt";
	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public static final String $base_cur_init_bal = "base_cur_init_bal";
	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public static final String $base_cur_onr_prov_amt = "base_cur_onr_prov_amt";
	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public static final String $base_cur_onr_prov_ret_amt = "base_cur_onr_prov_ret_amt";
	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public static final String $base_cur_setoff_amt = "base_cur_setoff_amt";
	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public static final String $base_cur_setoff_schd_amt = "base_cur_setoff_schd_amt";
	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public static final String $base_cur_end_bal = "base_cur_end_bal";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public static final String $asppl_grp_cd1 = "asppl_grp_cd1";
	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public static final String $asppl_grp_nm1 = "asppl_grp_nm1";
	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public static final String $asppl_grp_cd2 = "asppl_grp_cd2";
	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public static final String $asppl_grp_nm2 = "asppl_grp_nm2";
	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public static final String $asppl_grp_cd3 = "asppl_grp_cd3";
	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public static final String $asppl_grp_nm3 = "asppl_grp_nm3";
	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public static final String $asppl_grp_cd4 = "asppl_grp_cd4";
	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public static final String $asppl_grp_nm4 = "asppl_grp_nm4";
	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public static final String $asppl_grp_cd5 = "asppl_grp_cd5";
	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public static final String $asppl_grp_nm5 = "asppl_grp_nm5";
	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public static final String $asppl_grp_cd6 = "asppl_grp_cd6";
	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public static final String $asppl_grp_nm6 = "asppl_grp_nm6";
	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public static final String $asppl_grp_cd7 = "asppl_grp_cd7";
	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public static final String $asppl_grp_nm7 = "asppl_grp_nm7";
	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public static final String $asppl_grp_cd8 = "asppl_grp_cd8";
	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public static final String $asppl_grp_nm8 = "asppl_grp_nm8";
	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public static final String $asppl_grp_cd9 = "asppl_grp_cd9";
	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public static final String $asppl_grp_nm9 = "asppl_grp_nm9";
	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $asppl_grp_cd10 = "asppl_grp_cd10";
	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public static final String $asppl_grp_nm10 = "asppl_grp_nm10";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_amt_META = createCommonMeta($onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_ret_amt_META = createCommonMeta($onr_prov_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_schd_amt_META = createCommonMeta($setoff_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_init_bal_META = createCommonMeta($base_cur_init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_amt_META = createCommonMeta($base_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_ret_amt_META = createCommonMeta($base_cur_onr_prov_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_amt_META = createCommonMeta($base_cur_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_schd_amt_META = createCommonMeta($base_cur_setoff_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_end_bal_META = createCommonMeta($base_cur_end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MLY_ONR_PROV_BAL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MLY_ONR_PROV_BAL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MLY_ONR_PROV_BAL_SUB_CHAR3);
	public static final MCMeta asppl_grp_cd1_META = createCommonMeta($asppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm1_META = createCommonMeta($asppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd2_META = createCommonMeta($asppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm2_META = createCommonMeta($asppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd3_META = createCommonMeta($asppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm3_META = createCommonMeta($asppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd4_META = createCommonMeta($asppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm4_META = createCommonMeta($asppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd5_META = createCommonMeta($asppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm5_META = createCommonMeta($asppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd6_META = createCommonMeta($asppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm6_META = createCommonMeta($asppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd7_META = createCommonMeta($asppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm7_META = createCommonMeta($asppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd8_META = createCommonMeta($asppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm8_META = createCommonMeta($asppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd9_META = createCommonMeta($asppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm9_META = createCommonMeta($asppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta asppl_grp_cd10_META = createCommonMeta($asppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta asppl_grp_nm10_META = createCommonMeta($asppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<ApSetoff_Srch04_DtlR> constMetas = new ConstMetaList<ApSetoff_Srch04_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_ym_META,
			asppl_cd_META,
			asppl_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			init_bal_META,
			onr_prov_amt_META,
			onr_prov_ret_amt_META,
			setoff_amt_META,
			setoff_schd_amt_META,
			tax_amt_META,
			end_bal_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_init_bal_META,
			base_cur_onr_prov_amt_META,
			base_cur_onr_prov_ret_amt_META,
			base_cur_setoff_amt_META,
			base_cur_setoff_schd_amt_META,
			base_cur_tax_amt_META,
			base_cur_end_bal_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			asppl_grp_cd1_META,
			asppl_grp_nm1_META,
			asppl_grp_cd2_META,
			asppl_grp_nm2_META,
			asppl_grp_cd3_META,
			asppl_grp_nm3_META,
			asppl_grp_cd4_META,
			asppl_grp_nm4_META,
			asppl_grp_cd5_META,
			asppl_grp_nm5_META,
			asppl_grp_cd6_META,
			asppl_grp_nm6_META,
			asppl_grp_cd7_META,
			asppl_grp_nm7_META,
			asppl_grp_cd8_META,
			asppl_grp_nm8_META,
			asppl_grp_cd9_META,
			asppl_grp_nm9_META,
			asppl_grp_cd10_META,
			asppl_grp_nm10_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META
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
	protected ApSetoff_Srch04_DtlR_MC_A(ConstMetaList<? extends ApSetoff_Srch04_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSetoff_Srch04_DtlR clone() {
		return (ApSetoff_Srch04_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSetoff_Srch04_DtlR createInstance() {
		return (ApSetoff_Srch04_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSetoff_Srch04_DtlR getValues(String... names) {
		return (ApSetoff_Srch04_DtlR) super.getValues(names);
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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 1, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 1, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 2, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 2, $asppl_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 3, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 3, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 4, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 4, $ap_dpt_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 5, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 5, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 6, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 6, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 7, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 7, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 7, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 7, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 7, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 7, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 8, $init_bal);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 8, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 8, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 8, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 8, $init_bal, value);
	}

	/**
	 * Beginning balance 月初残高.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 8, $init_bal, value);
	}


	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public MCNumber onr_prov_amt() {
		return getConstNumber(offset + 9, $onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 9, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(int value) {
		setConstNumber(offset + 9, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(long value) {
		setConstNumber(offset + 9, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(float value) {
		setConstNumber(offset + 9, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Current month) 当月有償支給額.<p>
	 *
	 */
	public void onr_prov_amt(double value) {
		setConstNumber(offset + 9, $onr_prov_amt, value);
	}


	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public MCNumber onr_prov_ret_amt() {
		return getConstNumber(offset + 10, $onr_prov_ret_amt);
	}

	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public void onr_prov_ret_amt(MCNumber value) {
		setConstNumber(offset + 10, $onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public void onr_prov_ret_amt(int value) {
		setConstNumber(offset + 10, $onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public void onr_prov_ret_amt(long value) {
		setConstNumber(offset + 10, $onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public void onr_prov_ret_amt(float value) {
		setConstNumber(offset + 10, $onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply refundable amount (Current month) 当月有償支給戻し額.<p>
	 *
	 */
	public void onr_prov_ret_amt(double value) {
		setConstNumber(offset + 10, $onr_prov_ret_amt, value);
	}


	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 11, $setoff_amt);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 11, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 11, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 11, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 11, $setoff_amt, value);
	}

	/**
	 * Offset amount (Current month) 当月相殺額.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 11, $setoff_amt, value);
	}


	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public MCNumber setoff_schd_amt() {
		return getConstNumber(offset + 12, $setoff_schd_amt);
	}

	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(MCNumber value) {
		setConstNumber(offset + 12, $setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(int value) {
		setConstNumber(offset + 12, $setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(long value) {
		setConstNumber(offset + 12, $setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(float value) {
		setConstNumber(offset + 12, $setoff_schd_amt, value);
	}

	/**
	 * Offset schedule amount (Current month) 当月相殺予定額.<p>
	 *
	 */
	public void setoff_schd_amt(double value) {
		setConstNumber(offset + 12, $setoff_schd_amt, value);
	}


	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 13, $tax_amt);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 13, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 13, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 13, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 13, $tax_amt, value);
	}

	/**
	 * Tax amount (Current month) 当月税額.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 13, $tax_amt, value);
	}


	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 14, $end_bal);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 14, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 14, $end_bal, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 15, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 15, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 16, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 16, $base_cur_nm, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 17, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 17, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 17, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 17, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 17, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 17, $base_cur_amt_dec_place, value);
	}


	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public MCNumber base_cur_init_bal() {
		return getConstNumber(offset + 18, $base_cur_init_bal);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(MCNumber value) {
		setConstNumber(offset + 18, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(int value) {
		setConstNumber(offset + 18, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(long value) {
		setConstNumber(offset + 18, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(float value) {
		setConstNumber(offset + 18, $base_cur_init_bal, value);
	}

	/**
	 * Beginning balance (Base currency) 基準通貨月初残高.<p>
	 *
	 */
	public void base_cur_init_bal(double value) {
		setConstNumber(offset + 18, $base_cur_init_bal, value);
	}


	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return getConstNumber(offset + 19, $base_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 19, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 19, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 19, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 19, $base_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 19, $base_cur_onr_prov_amt, value);
	}


	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_ret_amt() {
		return getConstNumber(offset + 20, $base_cur_onr_prov_ret_amt);
	}

	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(MCNumber value) {
		setConstNumber(offset + 20, $base_cur_onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(int value) {
		setConstNumber(offset + 20, $base_cur_onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(long value) {
		setConstNumber(offset + 20, $base_cur_onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(float value) {
		setConstNumber(offset + 20, $base_cur_onr_prov_ret_amt, value);
	}

	/**
	 * Chargeable supply repayment amount (Base currency) 基準通貨有償支給戻し額.<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(double value) {
		setConstNumber(offset + 20, $base_cur_onr_prov_ret_amt, value);
	}


	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return getConstNumber(offset + 21, $base_cur_setoff_amt);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		setConstNumber(offset + 21, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		setConstNumber(offset + 21, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		setConstNumber(offset + 21, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		setConstNumber(offset + 21, $base_cur_setoff_amt, value);
	}

	/**
	 * Current month offset amount (Base currency) 基準通貨当月相殺額.<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		setConstNumber(offset + 21, $base_cur_setoff_amt, value);
	}


	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public MCNumber base_cur_setoff_schd_amt() {
		return getConstNumber(offset + 22, $base_cur_setoff_schd_amt);
	}

	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public void base_cur_setoff_schd_amt(MCNumber value) {
		setConstNumber(offset + 22, $base_cur_setoff_schd_amt, value);
	}

	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public void base_cur_setoff_schd_amt(int value) {
		setConstNumber(offset + 22, $base_cur_setoff_schd_amt, value);
	}

	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public void base_cur_setoff_schd_amt(long value) {
		setConstNumber(offset + 22, $base_cur_setoff_schd_amt, value);
	}

	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public void base_cur_setoff_schd_amt(float value) {
		setConstNumber(offset + 22, $base_cur_setoff_schd_amt, value);
	}

	/**
	 * Current month offset schedule amount (Base currency) 基準通貨当月相殺予定額.<p>
	 *
	 */
	public void base_cur_setoff_schd_amt(double value) {
		setConstNumber(offset + 22, $base_cur_setoff_schd_amt, value);
	}


	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 23, $base_cur_tax_amt);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}

	/**
	 * Current month tax amount (Base currency) 基準通貨当月税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 23, $base_cur_tax_amt, value);
	}


	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public MCNumber base_cur_end_bal() {
		return getConstNumber(offset + 24, $base_cur_end_bal);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(int value) {
		setConstNumber(offset + 24, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(long value) {
		setConstNumber(offset + 24, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(float value) {
		setConstNumber(offset + 24, $base_cur_end_bal, value);
	}

	/**
	 * Current month balance (Base currency) 基準通貨当月残高.<p>
	 *
	 */
	public void base_cur_end_bal(double value) {
		setConstNumber(offset + 24, $base_cur_end_bal, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 25, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 25, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 26, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 26, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 27, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 27, $sub_char3, value);
	}


	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public String asppl_grp_cd1() {
		return getConstString(offset + 28, $asppl_grp_cd1);
	}

	/**
	 * AP supplier classification cd. 1 買掛先分類ＣＤ１.<p>
	 *
	 */
	public void asppl_grp_cd1(String value) {
		setConstString(offset + 28, $asppl_grp_cd1, value);
	}


	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public String asppl_grp_nm1() {
		return getConstString(offset + 29, $asppl_grp_nm1);
	}

	/**
	 * AP supplier classification name 1 買掛先分類名１.<p>
	 *
	 */
	public void asppl_grp_nm1(String value) {
		setConstString(offset + 29, $asppl_grp_nm1, value);
	}


	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public String asppl_grp_cd2() {
		return getConstString(offset + 30, $asppl_grp_cd2);
	}

	/**
	 * AP supplier classification cd. 2 買掛先分類ＣＤ２.<p>
	 *
	 */
	public void asppl_grp_cd2(String value) {
		setConstString(offset + 30, $asppl_grp_cd2, value);
	}


	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public String asppl_grp_nm2() {
		return getConstString(offset + 31, $asppl_grp_nm2);
	}

	/**
	 * AP supplier classification name 2 買掛先分類名２.<p>
	 *
	 */
	public void asppl_grp_nm2(String value) {
		setConstString(offset + 31, $asppl_grp_nm2, value);
	}


	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public String asppl_grp_cd3() {
		return getConstString(offset + 32, $asppl_grp_cd3);
	}

	/**
	 * AP supplier classification cd. 3 買掛先分類ＣＤ３.<p>
	 *
	 */
	public void asppl_grp_cd3(String value) {
		setConstString(offset + 32, $asppl_grp_cd3, value);
	}


	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public String asppl_grp_nm3() {
		return getConstString(offset + 33, $asppl_grp_nm3);
	}

	/**
	 * AP supplier classification name 3 買掛先分類名３.<p>
	 *
	 */
	public void asppl_grp_nm3(String value) {
		setConstString(offset + 33, $asppl_grp_nm3, value);
	}


	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public String asppl_grp_cd4() {
		return getConstString(offset + 34, $asppl_grp_cd4);
	}

	/**
	 * AP supplier classification cd. 4 買掛先分類ＣＤ４.<p>
	 *
	 */
	public void asppl_grp_cd4(String value) {
		setConstString(offset + 34, $asppl_grp_cd4, value);
	}


	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public String asppl_grp_nm4() {
		return getConstString(offset + 35, $asppl_grp_nm4);
	}

	/**
	 * AP supplier classification name 4 買掛先分類名４.<p>
	 *
	 */
	public void asppl_grp_nm4(String value) {
		setConstString(offset + 35, $asppl_grp_nm4, value);
	}


	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public String asppl_grp_cd5() {
		return getConstString(offset + 36, $asppl_grp_cd5);
	}

	/**
	 * AP supplier classification cd. 5 買掛先分類ＣＤ５.<p>
	 *
	 */
	public void asppl_grp_cd5(String value) {
		setConstString(offset + 36, $asppl_grp_cd5, value);
	}


	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public String asppl_grp_nm5() {
		return getConstString(offset + 37, $asppl_grp_nm5);
	}

	/**
	 * AP supplier classification name 5 買掛先分類名５.<p>
	 *
	 */
	public void asppl_grp_nm5(String value) {
		setConstString(offset + 37, $asppl_grp_nm5, value);
	}


	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public String asppl_grp_cd6() {
		return getConstString(offset + 38, $asppl_grp_cd6);
	}

	/**
	 * AP supplier classification cd. 6 買掛先分類ＣＤ６.<p>
	 *
	 */
	public void asppl_grp_cd6(String value) {
		setConstString(offset + 38, $asppl_grp_cd6, value);
	}


	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public String asppl_grp_nm6() {
		return getConstString(offset + 39, $asppl_grp_nm6);
	}

	/**
	 * AP supplier classification name 6 買掛先分類名６.<p>
	 *
	 */
	public void asppl_grp_nm6(String value) {
		setConstString(offset + 39, $asppl_grp_nm6, value);
	}


	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public String asppl_grp_cd7() {
		return getConstString(offset + 40, $asppl_grp_cd7);
	}

	/**
	 * AP supplier classification cd. 7 買掛先分類ＣＤ７.<p>
	 *
	 */
	public void asppl_grp_cd7(String value) {
		setConstString(offset + 40, $asppl_grp_cd7, value);
	}


	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public String asppl_grp_nm7() {
		return getConstString(offset + 41, $asppl_grp_nm7);
	}

	/**
	 * AP supplier classification name 7 買掛先分類名７.<p>
	 *
	 */
	public void asppl_grp_nm7(String value) {
		setConstString(offset + 41, $asppl_grp_nm7, value);
	}


	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public String asppl_grp_cd8() {
		return getConstString(offset + 42, $asppl_grp_cd8);
	}

	/**
	 * AP supplier classification cd. 8 買掛先分類ＣＤ８.<p>
	 *
	 */
	public void asppl_grp_cd8(String value) {
		setConstString(offset + 42, $asppl_grp_cd8, value);
	}


	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public String asppl_grp_nm8() {
		return getConstString(offset + 43, $asppl_grp_nm8);
	}

	/**
	 * AP supplier classification name 8 買掛先分類名８.<p>
	 *
	 */
	public void asppl_grp_nm8(String value) {
		setConstString(offset + 43, $asppl_grp_nm8, value);
	}


	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public String asppl_grp_cd9() {
		return getConstString(offset + 44, $asppl_grp_cd9);
	}

	/**
	 * AP supplier classification cd. 9 買掛先分類ＣＤ９.<p>
	 *
	 */
	public void asppl_grp_cd9(String value) {
		setConstString(offset + 44, $asppl_grp_cd9, value);
	}


	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public String asppl_grp_nm9() {
		return getConstString(offset + 45, $asppl_grp_nm9);
	}

	/**
	 * AP supplier classification name 9 買掛先分類名９.<p>
	 *
	 */
	public void asppl_grp_nm9(String value) {
		setConstString(offset + 45, $asppl_grp_nm9, value);
	}


	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public String asppl_grp_cd10() {
		return getConstString(offset + 46, $asppl_grp_cd10);
	}

	/**
	 * AP supplier classification cd. 10 買掛先分類ＣＤ１０.<p>
	 *
	 */
	public void asppl_grp_cd10(String value) {
		setConstString(offset + 46, $asppl_grp_cd10, value);
	}


	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public String asppl_grp_nm10() {
		return getConstString(offset + 47, $asppl_grp_nm10);
	}

	/**
	 * AP supplier classification name 10 買掛先分類名１０.<p>
	 *
	 */
	public void asppl_grp_nm10(String value) {
		setConstString(offset + 47, $asppl_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 48, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 48, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 49, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 49, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 51, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 51, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 52, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 56, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 56, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 57, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 58, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 58, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			return asppl_grp_cd1();
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			return asppl_grp_nm1();
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			return asppl_grp_cd2();
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			return asppl_grp_nm2();
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			return asppl_grp_cd3();
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			return asppl_grp_nm3();
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			return asppl_grp_cd4();
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			return asppl_grp_nm4();
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			return asppl_grp_cd5();
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			return asppl_grp_nm5();
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			return asppl_grp_cd6();
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			return asppl_grp_nm6();
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			return asppl_grp_cd7();
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			return asppl_grp_nm7();
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			return asppl_grp_cd8();
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			return asppl_grp_nm8();
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			return asppl_grp_cd9();
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			return asppl_grp_nm9();
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			return asppl_grp_cd10();
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			return asppl_grp_nm10();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return onr_prov_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			return setoff_schd_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_ret_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_schd_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			return asppl_grp_cd1();
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			return asppl_grp_nm1();
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			return asppl_grp_cd2();
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			return asppl_grp_nm2();
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			return asppl_grp_cd3();
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			return asppl_grp_nm3();
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			return asppl_grp_cd4();
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			return asppl_grp_nm4();
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			return asppl_grp_cd5();
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			return asppl_grp_nm5();
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			return asppl_grp_cd6();
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			return asppl_grp_nm6();
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			return asppl_grp_cd7();
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			return asppl_grp_nm7();
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			return asppl_grp_cd8();
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			return asppl_grp_nm8();
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			return asppl_grp_cd9();
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			return asppl_grp_nm9();
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			return asppl_grp_cd10();
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			return asppl_grp_nm10();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return onr_prov_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			return setoff_schd_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_ret_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_schd_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			asppl_grp_cd1(value);
			return;
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			asppl_grp_nm1(value);
			return;
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			asppl_grp_cd2(value);
			return;
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			asppl_grp_nm2(value);
			return;
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			asppl_grp_cd3(value);
			return;
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			asppl_grp_nm3(value);
			return;
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			asppl_grp_cd4(value);
			return;
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			asppl_grp_nm4(value);
			return;
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			asppl_grp_cd5(value);
			return;
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			asppl_grp_nm5(value);
			return;
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			asppl_grp_cd6(value);
			return;
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			asppl_grp_nm6(value);
			return;
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			asppl_grp_cd7(value);
			return;
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			asppl_grp_nm7(value);
			return;
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			asppl_grp_cd8(value);
			return;
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			asppl_grp_nm8(value);
			return;
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			asppl_grp_cd9(value);
			return;
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			asppl_grp_nm9(value);
			return;
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			asppl_grp_cd10(value);
			return;
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			asppl_grp_nm10(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
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
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($asppl_grp_cd1.equalsIgnoreCase(name)) {
			asppl_grp_cd1(value);
			return;
		}
		if ($asppl_grp_nm1.equalsIgnoreCase(name)) {
			asppl_grp_nm1(value);
			return;
		}
		if ($asppl_grp_cd2.equalsIgnoreCase(name)) {
			asppl_grp_cd2(value);
			return;
		}
		if ($asppl_grp_nm2.equalsIgnoreCase(name)) {
			asppl_grp_nm2(value);
			return;
		}
		if ($asppl_grp_cd3.equalsIgnoreCase(name)) {
			asppl_grp_cd3(value);
			return;
		}
		if ($asppl_grp_nm3.equalsIgnoreCase(name)) {
			asppl_grp_nm3(value);
			return;
		}
		if ($asppl_grp_cd4.equalsIgnoreCase(name)) {
			asppl_grp_cd4(value);
			return;
		}
		if ($asppl_grp_nm4.equalsIgnoreCase(name)) {
			asppl_grp_nm4(value);
			return;
		}
		if ($asppl_grp_cd5.equalsIgnoreCase(name)) {
			asppl_grp_cd5(value);
			return;
		}
		if ($asppl_grp_nm5.equalsIgnoreCase(name)) {
			asppl_grp_nm5(value);
			return;
		}
		if ($asppl_grp_cd6.equalsIgnoreCase(name)) {
			asppl_grp_cd6(value);
			return;
		}
		if ($asppl_grp_nm6.equalsIgnoreCase(name)) {
			asppl_grp_nm6(value);
			return;
		}
		if ($asppl_grp_cd7.equalsIgnoreCase(name)) {
			asppl_grp_cd7(value);
			return;
		}
		if ($asppl_grp_nm7.equalsIgnoreCase(name)) {
			asppl_grp_nm7(value);
			return;
		}
		if ($asppl_grp_cd8.equalsIgnoreCase(name)) {
			asppl_grp_cd8(value);
			return;
		}
		if ($asppl_grp_nm8.equalsIgnoreCase(name)) {
			asppl_grp_nm8(value);
			return;
		}
		if ($asppl_grp_cd9.equalsIgnoreCase(name)) {
			asppl_grp_cd9(value);
			return;
		}
		if ($asppl_grp_nm9.equalsIgnoreCase(name)) {
			asppl_grp_nm9(value);
			return;
		}
		if ($asppl_grp_cd10.equalsIgnoreCase(name)) {
			asppl_grp_cd10(value);
			return;
		}
		if ($asppl_grp_nm10.equalsIgnoreCase(name)) {
			asppl_grp_nm10(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_schd_amt.equalsIgnoreCase(name)) {
			setoff_schd_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_setoff_schd_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_schd_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}



}

