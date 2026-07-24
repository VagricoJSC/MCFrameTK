package mcframe.serverMSBG.MSBGL0270;

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
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public static final String $cred_nm = "cred_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public static final String $cred_limit = "cred_limit";
	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public static final String $cred_amt = "cred_amt";
	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public static final String $ar_cred_amt = "ar_cred_amt";
	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public static final String $ap_cred_amt = "ap_cred_amt";
	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public static final String $cred_bal = "cred_bal";
	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public static final String $cred_use = "cred_use";
	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public static final String $alarm_point = "alarm_point";
	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public static final String $alarm_amt = "alarm_amt";
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
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cred_grp_cd1 = "cred_grp_cd1";
	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public static final String $cred_grp_nm1 = "cred_grp_nm1";
	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cred_grp_cd2 = "cred_grp_cd2";
	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public static final String $cred_grp_nm2 = "cred_grp_nm2";
	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cred_grp_cd3 = "cred_grp_cd3";
	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public static final String $cred_grp_nm3 = "cred_grp_nm3";
	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cred_grp_cd4 = "cred_grp_cd4";
	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public static final String $cred_grp_nm4 = "cred_grp_nm4";
	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cred_grp_cd5 = "cred_grp_cd5";
	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public static final String $cred_grp_nm5 = "cred_grp_nm5";
	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cred_grp_cd6 = "cred_grp_cd6";
	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public static final String $cred_grp_nm6 = "cred_grp_nm6";
	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cred_grp_cd7 = "cred_grp_cd7";
	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public static final String $cred_grp_nm7 = "cred_grp_nm7";
	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cred_grp_cd8 = "cred_grp_cd8";
	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public static final String $cred_grp_nm8 = "cred_grp_nm8";
	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cred_grp_cd9 = "cred_grp_cd9";
	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public static final String $cred_grp_nm9 = "cred_grp_nm9";
	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cred_grp_cd10 = "cred_grp_cd10";
	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public static final String $cred_grp_nm10 = "cred_grp_nm10";
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


	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_nm_META = createCommonMeta($cred_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_limit_META = createCommonMeta($cred_limit, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cred_amt_META = createCommonMeta($cred_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_cred_amt_META = createCommonMeta($ar_cred_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ap_cred_amt_META = createCommonMeta($ap_cred_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_bal_META = createCommonMeta($cred_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cred_use_META = createCommonMeta($cred_use, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta alarm_point_META = createCommonMeta($alarm_point, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta alarm_amt_META = createCommonMeta($alarm_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.CRED_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.CRED_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.CRED_SUB_CHAR3);
	public static final MCMeta cred_grp_cd1_META = createCommonMeta($cred_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm1_META = createCommonMeta($cred_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd2_META = createCommonMeta($cred_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm2_META = createCommonMeta($cred_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd3_META = createCommonMeta($cred_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm3_META = createCommonMeta($cred_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd4_META = createCommonMeta($cred_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm4_META = createCommonMeta($cred_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd5_META = createCommonMeta($cred_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm5_META = createCommonMeta($cred_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd6_META = createCommonMeta($cred_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm6_META = createCommonMeta($cred_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd7_META = createCommonMeta($cred_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm7_META = createCommonMeta($cred_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd8_META = createCommonMeta($cred_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm8_META = createCommonMeta($cred_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd9_META = createCommonMeta($cred_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm9_META = createCommonMeta($cred_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cred_grp_cd10_META = createCommonMeta($cred_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cred_grp_nm10_META = createCommonMeta($cred_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cred_cd_META,
			cred_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			cred_limit_META,
			cred_amt_META,
			ar_cred_amt_META,
			ap_cred_amt_META,
			cred_bal_META,
			cred_use_META,
			alarm_point_META,
			alarm_amt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			cred_grp_cd1_META,
			cred_grp_nm1_META,
			cred_grp_cd2_META,
			cred_grp_nm2_META,
			cred_grp_cd3_META,
			cred_grp_nm3_META,
			cred_grp_cd4_META,
			cred_grp_nm4_META,
			cred_grp_cd5_META,
			cred_grp_nm5_META,
			cred_grp_cd6_META,
			cred_grp_nm6_META,
			cred_grp_cd7_META,
			cred_grp_nm7_META,
			cred_grp_cd8_META,
			cred_grp_nm8_META,
			cred_grp_cd9_META,
			cred_grp_nm9_META,
			cred_grp_cd10_META,
			cred_grp_nm10_META,
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
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 0, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 0, $cred_cd, value);
	}


	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public String cred_nm() {
		return getConstString(offset + 1, $cred_nm);
	}

	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public void cred_nm(String value) {
		setConstString(offset + 1, $cred_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 2, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 2, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 3, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 3, $cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 4, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 4, $amt_dec_place, value);
	}


	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public MCNumber cred_limit() {
		return getConstNumber(offset + 5, $cred_limit);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(MCNumber value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(int value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(long value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(float value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}

	/**
	 * Credit limit 与信限度額.<p>
	 *
	 */
	public void cred_limit(double value) {
		setConstNumber(offset + 5, $cred_limit, value);
	}


	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public MCNumber cred_amt() {
		return getConstNumber(offset + 6, $cred_amt);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(MCNumber value) {
		setConstNumber(offset + 6, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(int value) {
		setConstNumber(offset + 6, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(long value) {
		setConstNumber(offset + 6, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(float value) {
		setConstNumber(offset + 6, $cred_amt, value);
	}

	/**
	 * Credit target amount 与信対象額.<p>
	 *
	 */
	public void cred_amt(double value) {
		setConstNumber(offset + 6, $cred_amt, value);
	}


	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public MCNumber ar_cred_amt() {
		return getConstNumber(offset + 7, $ar_cred_amt);
	}

	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public void ar_cred_amt(MCNumber value) {
		setConstNumber(offset + 7, $ar_cred_amt, value);
	}

	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public void ar_cred_amt(int value) {
		setConstNumber(offset + 7, $ar_cred_amt, value);
	}

	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public void ar_cred_amt(long value) {
		setConstNumber(offset + 7, $ar_cred_amt, value);
	}

	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public void ar_cred_amt(float value) {
		setConstNumber(offset + 7, $ar_cred_amt, value);
	}

	/**
	 * AR credit amount 売掛与信対象額.<p>
	 *
	 */
	public void ar_cred_amt(double value) {
		setConstNumber(offset + 7, $ar_cred_amt, value);
	}


	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public MCNumber ap_cred_amt() {
		return getConstNumber(offset + 8, $ap_cred_amt);
	}

	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public void ap_cred_amt(MCNumber value) {
		setConstNumber(offset + 8, $ap_cred_amt, value);
	}

	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public void ap_cred_amt(int value) {
		setConstNumber(offset + 8, $ap_cred_amt, value);
	}

	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public void ap_cred_amt(long value) {
		setConstNumber(offset + 8, $ap_cred_amt, value);
	}

	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public void ap_cred_amt(float value) {
		setConstNumber(offset + 8, $ap_cred_amt, value);
	}

	/**
	 * AP credit amount 買掛与信対象額.<p>
	 *
	 */
	public void ap_cred_amt(double value) {
		setConstNumber(offset + 8, $ap_cred_amt, value);
	}


	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public MCNumber cred_bal() {
		return getConstNumber(offset + 9, $cred_bal);
	}

	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public void cred_bal(MCNumber value) {
		setConstNumber(offset + 9, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public void cred_bal(int value) {
		setConstNumber(offset + 9, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public void cred_bal(long value) {
		setConstNumber(offset + 9, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public void cred_bal(float value) {
		setConstNumber(offset + 9, $cred_bal, value);
	}

	/**
	 * Credit line balance 与信枠残.<p>
	 *
	 */
	public void cred_bal(double value) {
		setConstNumber(offset + 9, $cred_bal, value);
	}


	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public MCNumber cred_use() {
		return getConstNumber(offset + 10, $cred_use);
	}

	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public void cred_use(MCNumber value) {
		setConstNumber(offset + 10, $cred_use, value);
	}

	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public void cred_use(int value) {
		setConstNumber(offset + 10, $cred_use, value);
	}

	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public void cred_use(long value) {
		setConstNumber(offset + 10, $cred_use, value);
	}

	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public void cred_use(float value) {
		setConstNumber(offset + 10, $cred_use, value);
	}

	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public void cred_use(double value) {
		setConstNumber(offset + 10, $cred_use, value);
	}


	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public MCNumber alarm_point() {
		return getConstNumber(offset + 11, $alarm_point);
	}

	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public void alarm_point(MCNumber value) {
		setConstNumber(offset + 11, $alarm_point, value);
	}

	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public void alarm_point(int value) {
		setConstNumber(offset + 11, $alarm_point, value);
	}

	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public void alarm_point(long value) {
		setConstNumber(offset + 11, $alarm_point, value);
	}

	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public void alarm_point(float value) {
		setConstNumber(offset + 11, $alarm_point, value);
	}

	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public void alarm_point(double value) {
		setConstNumber(offset + 11, $alarm_point, value);
	}


	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public MCNumber alarm_amt() {
		return getConstNumber(offset + 12, $alarm_amt);
	}

	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public void alarm_amt(MCNumber value) {
		setConstNumber(offset + 12, $alarm_amt, value);
	}

	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public void alarm_amt(int value) {
		setConstNumber(offset + 12, $alarm_amt, value);
	}

	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public void alarm_amt(long value) {
		setConstNumber(offset + 12, $alarm_amt, value);
	}

	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public void alarm_amt(float value) {
		setConstNumber(offset + 12, $alarm_amt, value);
	}

	/**
	 * Alarm usage amount アラーム使用額.<p>
	 *
	 */
	public void alarm_amt(double value) {
		setConstNumber(offset + 12, $alarm_amt, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 13, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 13, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 14, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 14, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 15, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 15, $sub_char3, value);
	}


	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public String cred_grp_cd1() {
		return getConstString(offset + 16, $cred_grp_cd1);
	}

	/**
	 * Credit managed BP class cd. 1 与信管理先分類ＣＤ１.<p>
	 *
	 */
	public void cred_grp_cd1(String value) {
		setConstString(offset + 16, $cred_grp_cd1, value);
	}


	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public String cred_grp_nm1() {
		return getConstString(offset + 17, $cred_grp_nm1);
	}

	/**
	 * Credit managed BP class name 1 与信管理先分類名１.<p>
	 *
	 */
	public void cred_grp_nm1(String value) {
		setConstString(offset + 17, $cred_grp_nm1, value);
	}


	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public String cred_grp_cd2() {
		return getConstString(offset + 18, $cred_grp_cd2);
	}

	/**
	 * Credit managed BP class cd. 2 与信管理先分類ＣＤ２.<p>
	 *
	 */
	public void cred_grp_cd2(String value) {
		setConstString(offset + 18, $cred_grp_cd2, value);
	}


	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public String cred_grp_nm2() {
		return getConstString(offset + 19, $cred_grp_nm2);
	}

	/**
	 * Credit managed BP class name 2 与信管理先分類名２.<p>
	 *
	 */
	public void cred_grp_nm2(String value) {
		setConstString(offset + 19, $cred_grp_nm2, value);
	}


	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public String cred_grp_cd3() {
		return getConstString(offset + 20, $cred_grp_cd3);
	}

	/**
	 * Credit managed BP class cd. 3 与信管理先分類ＣＤ３.<p>
	 *
	 */
	public void cred_grp_cd3(String value) {
		setConstString(offset + 20, $cred_grp_cd3, value);
	}


	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public String cred_grp_nm3() {
		return getConstString(offset + 21, $cred_grp_nm3);
	}

	/**
	 * Credit managed BP class name 3 与信管理先分類名３.<p>
	 *
	 */
	public void cred_grp_nm3(String value) {
		setConstString(offset + 21, $cred_grp_nm3, value);
	}


	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public String cred_grp_cd4() {
		return getConstString(offset + 22, $cred_grp_cd4);
	}

	/**
	 * Credit managed BP class cd. 4 与信管理先分類ＣＤ４.<p>
	 *
	 */
	public void cred_grp_cd4(String value) {
		setConstString(offset + 22, $cred_grp_cd4, value);
	}


	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public String cred_grp_nm4() {
		return getConstString(offset + 23, $cred_grp_nm4);
	}

	/**
	 * Credit managed BP class name 4 与信管理先分類名４.<p>
	 *
	 */
	public void cred_grp_nm4(String value) {
		setConstString(offset + 23, $cred_grp_nm4, value);
	}


	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public String cred_grp_cd5() {
		return getConstString(offset + 24, $cred_grp_cd5);
	}

	/**
	 * Credit managed BP class cd. 5 与信管理先分類ＣＤ５.<p>
	 *
	 */
	public void cred_grp_cd5(String value) {
		setConstString(offset + 24, $cred_grp_cd5, value);
	}


	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public String cred_grp_nm5() {
		return getConstString(offset + 25, $cred_grp_nm5);
	}

	/**
	 * Credit managed BP class name 5 与信管理先分類名５.<p>
	 *
	 */
	public void cred_grp_nm5(String value) {
		setConstString(offset + 25, $cred_grp_nm5, value);
	}


	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public String cred_grp_cd6() {
		return getConstString(offset + 26, $cred_grp_cd6);
	}

	/**
	 * Credit managed BP class cd. 6 与信管理先分類ＣＤ６.<p>
	 *
	 */
	public void cred_grp_cd6(String value) {
		setConstString(offset + 26, $cred_grp_cd6, value);
	}


	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public String cred_grp_nm6() {
		return getConstString(offset + 27, $cred_grp_nm6);
	}

	/**
	 * Credit managed BP class name 6 与信管理先分類名６.<p>
	 *
	 */
	public void cred_grp_nm6(String value) {
		setConstString(offset + 27, $cred_grp_nm6, value);
	}


	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public String cred_grp_cd7() {
		return getConstString(offset + 28, $cred_grp_cd7);
	}

	/**
	 * Credit managed BP class cd. 7 与信管理先分類ＣＤ７.<p>
	 *
	 */
	public void cred_grp_cd7(String value) {
		setConstString(offset + 28, $cred_grp_cd7, value);
	}


	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public String cred_grp_nm7() {
		return getConstString(offset + 29, $cred_grp_nm7);
	}

	/**
	 * Credit managed BP class name 7 与信管理先分類名７.<p>
	 *
	 */
	public void cred_grp_nm7(String value) {
		setConstString(offset + 29, $cred_grp_nm7, value);
	}


	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public String cred_grp_cd8() {
		return getConstString(offset + 30, $cred_grp_cd8);
	}

	/**
	 * Credit managed BP class cd. 8 与信管理先分類ＣＤ８.<p>
	 *
	 */
	public void cred_grp_cd8(String value) {
		setConstString(offset + 30, $cred_grp_cd8, value);
	}


	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public String cred_grp_nm8() {
		return getConstString(offset + 31, $cred_grp_nm8);
	}

	/**
	 * Credit managed BP class name 8 与信管理先分類名８.<p>
	 *
	 */
	public void cred_grp_nm8(String value) {
		setConstString(offset + 31, $cred_grp_nm8, value);
	}


	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public String cred_grp_cd9() {
		return getConstString(offset + 32, $cred_grp_cd9);
	}

	/**
	 * Credit managed BP class cd. 9 与信管理先分類ＣＤ９.<p>
	 *
	 */
	public void cred_grp_cd9(String value) {
		setConstString(offset + 32, $cred_grp_cd9, value);
	}


	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public String cred_grp_nm9() {
		return getConstString(offset + 33, $cred_grp_nm9);
	}

	/**
	 * Credit managed BP class name 9 与信管理先分類名９.<p>
	 *
	 */
	public void cred_grp_nm9(String value) {
		setConstString(offset + 33, $cred_grp_nm9, value);
	}


	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public String cred_grp_cd10() {
		return getConstString(offset + 34, $cred_grp_cd10);
	}

	/**
	 * Credit managed BP class cd. 10 与信管理先分類ＣＤ１０.<p>
	 *
	 */
	public void cred_grp_cd10(String value) {
		setConstString(offset + 34, $cred_grp_cd10, value);
	}


	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public String cred_grp_nm10() {
		return getConstString(offset + 35, $cred_grp_nm10);
	}

	/**
	 * Credit managed BP class name 10 与信管理先分類名１０.<p>
	 *
	 */
	public void cred_grp_nm10(String value) {
		setConstString(offset + 35, $cred_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 36, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 36, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 37, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 37, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 38, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 38, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 39, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 39, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 40, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 41, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 41, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 42, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 42, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 43, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 43, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 44, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 44, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 45, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 46, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 46, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			return cred_grp_cd1();
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			return cred_grp_nm1();
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			return cred_grp_cd2();
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			return cred_grp_nm2();
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			return cred_grp_cd3();
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			return cred_grp_nm3();
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			return cred_grp_cd4();
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			return cred_grp_nm4();
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			return cred_grp_cd5();
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			return cred_grp_nm5();
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			return cred_grp_cd6();
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			return cred_grp_nm6();
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			return cred_grp_cd7();
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			return cred_grp_nm7();
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			return cred_grp_cd8();
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			return cred_grp_nm8();
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			return cred_grp_cd9();
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			return cred_grp_nm9();
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			return cred_grp_cd10();
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			return cred_grp_nm10();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			return cred_limit();
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			return cred_amt();
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			return ar_cred_amt();
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			return ap_cred_amt();
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			return cred_bal();
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			return cred_use();
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			return alarm_point();
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			return alarm_amt();
		}
		return super.getNumber(name);
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			return cred_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			return cred_grp_cd1();
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			return cred_grp_nm1();
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			return cred_grp_cd2();
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			return cred_grp_nm2();
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			return cred_grp_cd3();
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			return cred_grp_nm3();
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			return cred_grp_cd4();
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			return cred_grp_nm4();
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			return cred_grp_cd5();
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			return cred_grp_nm5();
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			return cred_grp_cd6();
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			return cred_grp_nm6();
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			return cred_grp_cd7();
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			return cred_grp_nm7();
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			return cred_grp_cd8();
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			return cred_grp_nm8();
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			return cred_grp_cd9();
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			return cred_grp_nm9();
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			return cred_grp_cd10();
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			return cred_grp_nm10();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			return cred_limit();
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			return cred_amt();
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			return ar_cred_amt();
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			return ap_cred_amt();
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			return cred_bal();
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			return cred_use();
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			return alarm_point();
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			return alarm_amt();
		}
		return super.getNumberNE(name);
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			cred_grp_cd1(value);
			return;
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			cred_grp_nm1(value);
			return;
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			cred_grp_cd2(value);
			return;
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			cred_grp_nm2(value);
			return;
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			cred_grp_cd3(value);
			return;
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			cred_grp_nm3(value);
			return;
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			cred_grp_cd4(value);
			return;
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			cred_grp_nm4(value);
			return;
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			cred_grp_cd5(value);
			return;
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			cred_grp_nm5(value);
			return;
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			cred_grp_cd6(value);
			return;
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			cred_grp_nm6(value);
			return;
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			cred_grp_cd7(value);
			return;
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			cred_grp_nm7(value);
			return;
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			cred_grp_cd8(value);
			return;
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			cred_grp_nm8(value);
			return;
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			cred_grp_cd9(value);
			return;
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			cred_grp_nm9(value);
			return;
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			cred_grp_cd10(value);
			return;
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			cred_grp_nm10(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($cred_nm.equalsIgnoreCase(name)) {
			cred_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($cred_grp_cd1.equalsIgnoreCase(name)) {
			cred_grp_cd1(value);
			return;
		}
		if ($cred_grp_nm1.equalsIgnoreCase(name)) {
			cred_grp_nm1(value);
			return;
		}
		if ($cred_grp_cd2.equalsIgnoreCase(name)) {
			cred_grp_cd2(value);
			return;
		}
		if ($cred_grp_nm2.equalsIgnoreCase(name)) {
			cred_grp_nm2(value);
			return;
		}
		if ($cred_grp_cd3.equalsIgnoreCase(name)) {
			cred_grp_cd3(value);
			return;
		}
		if ($cred_grp_nm3.equalsIgnoreCase(name)) {
			cred_grp_nm3(value);
			return;
		}
		if ($cred_grp_cd4.equalsIgnoreCase(name)) {
			cred_grp_cd4(value);
			return;
		}
		if ($cred_grp_nm4.equalsIgnoreCase(name)) {
			cred_grp_nm4(value);
			return;
		}
		if ($cred_grp_cd5.equalsIgnoreCase(name)) {
			cred_grp_cd5(value);
			return;
		}
		if ($cred_grp_nm5.equalsIgnoreCase(name)) {
			cred_grp_nm5(value);
			return;
		}
		if ($cred_grp_cd6.equalsIgnoreCase(name)) {
			cred_grp_cd6(value);
			return;
		}
		if ($cred_grp_nm6.equalsIgnoreCase(name)) {
			cred_grp_nm6(value);
			return;
		}
		if ($cred_grp_cd7.equalsIgnoreCase(name)) {
			cred_grp_cd7(value);
			return;
		}
		if ($cred_grp_nm7.equalsIgnoreCase(name)) {
			cred_grp_nm7(value);
			return;
		}
		if ($cred_grp_cd8.equalsIgnoreCase(name)) {
			cred_grp_cd8(value);
			return;
		}
		if ($cred_grp_nm8.equalsIgnoreCase(name)) {
			cred_grp_nm8(value);
			return;
		}
		if ($cred_grp_cd9.equalsIgnoreCase(name)) {
			cred_grp_cd9(value);
			return;
		}
		if ($cred_grp_nm9.equalsIgnoreCase(name)) {
			cred_grp_nm9(value);
			return;
		}
		if ($cred_grp_cd10.equalsIgnoreCase(name)) {
			cred_grp_cd10(value);
			return;
		}
		if ($cred_grp_nm10.equalsIgnoreCase(name)) {
			cred_grp_nm10(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($cred_limit.equalsIgnoreCase(name)) {
			cred_limit(value);
			return;
		}
		if ($cred_amt.equalsIgnoreCase(name)) {
			cred_amt(value);
			return;
		}
		if ($ar_cred_amt.equalsIgnoreCase(name)) {
			ar_cred_amt(value);
			return;
		}
		if ($ap_cred_amt.equalsIgnoreCase(name)) {
			ap_cred_amt(value);
			return;
		}
		if ($cred_bal.equalsIgnoreCase(name)) {
			cred_bal(value);
			return;
		}
		if ($cred_use.equalsIgnoreCase(name)) {
			cred_use(value);
			return;
		}
		if ($alarm_point.equalsIgnoreCase(name)) {
			alarm_point(value);
			return;
		}
		if ($alarm_amt.equalsIgnoreCase(name)) {
			alarm_amt(value);
			return;
		}
		super.setNumberNE(name, value);
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

