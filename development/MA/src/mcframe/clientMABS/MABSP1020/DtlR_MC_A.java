package mcframe.clientMABS.MABSP1020;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	public static final String $min_amt_p = "min_amt_p";
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public static final String $sttl_cd = "sttl_cd";
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public static final String $sttl_nm = "sttl_nm";
	/**
	 * Ratio 比率.<p>
	 *
	 */
	public static final String $rate = "rate";
	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public static final String $crryovr_mons_typ = "crryovr_mons_typ";
	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public static final String $crryovr_mons_typ_nm = "crryovr_mons_typ_nm";
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public static final String $rcv_crryovr_mons1 = "rcv_crryovr_mons1";
	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public static final String $rcv_day1 = "rcv_day1";
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public static final String $rcv_crryovr_mons2 = "rcv_crryovr_mons2";
	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public static final String $rcv_day2 = "rcv_day2";
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public static final String $rcv_crryovr_mons3 = "rcv_crryovr_mons3";
	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public static final String $rcv_day3 = "rcv_day3";
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public static final String $rcv_crryovr_mons4 = "rcv_crryovr_mons4";
	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public static final String $rcv_day4 = "rcv_day4";
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";
	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public static final String $rcv_crryovr_mons5 = "rcv_crryovr_mons5";
	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public static final String $rcv_day5 = "rcv_day5";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";

	public static final String $min_amt = $min_amt_p + ".amt";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta min_amt_p_META = createInnerRowMeta($min_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta sttl_cd_META = createCommonMeta($sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm_META = createCommonMeta($sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta rate_META = createCommonMeta($rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta crryovr_mons_typ_META = createCommonMeta($crryovr_mons_typ, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS_TYP);
	public static final MCMeta crryovr_mons_typ_nm_META = createCommonMeta($crryovr_mons_typ_nm, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS_TYP_NM);
	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_crryovr_mons1_META = createCommonMeta($rcv_crryovr_mons1, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta rcv_day1_META = createCommonMeta($rcv_day1, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_crryovr_mons2_META = createCommonMeta($rcv_crryovr_mons2, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta rcv_day2_META = createCommonMeta($rcv_day2, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_crryovr_mons3_META = createCommonMeta($rcv_crryovr_mons3, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta rcv_day3_META = createCommonMeta($rcv_day3, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_crryovr_mons4_META = createCommonMeta($rcv_crryovr_mons4, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta rcv_day4_META = createCommonMeta($rcv_day4, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_crryovr_mons5_META = createCommonMeta($rcv_crryovr_mons5, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta rcv_day5_META = createCommonMeta($rcv_day5, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			wg_cd_META,
			wg_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_dec_place_META,
			min_amt_p_META,
			sttl_cd_META,
			sttl_nm_META,
			rate_META,
			crryovr_mons_typ_META,
			crryovr_mons_typ_nm_META,
			bill_cl_day1_META,
			rcv_crryovr_mons1_META,
			rcv_day1_META,
			bill_cl_day2_META,
			rcv_crryovr_mons2_META,
			rcv_day2_META,
			bill_cl_day3_META,
			rcv_crryovr_mons3_META,
			rcv_day3_META,
			bill_cl_day4_META,
			rcv_crryovr_mons4_META,
			rcv_day4_META,
			bill_cl_day5_META,
			rcv_crryovr_mons5_META,
			rcv_day5_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
				"min_amt"
			},
			{
				$min_amt
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$wg_cd,	// wg_cd
			$bcst_cd,	// bcst_cd
			$cur_cd,	// cur_cd
			$min_amt_p + ".amt",	// min_amt_p.amt
			$sttl_cd	// sttl_cd
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
				{$bcst_cd, "bp_nm;cur_cd;bill_cl_day1;bill_cl_day2;bill_cl_day3;bill_cl_day4;bill_cl_day5"},	// bcst_cd
				{$cur_cd, "cur_nm;amt_dec_place"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$bcst_cd, "MAC_BP_IS_SRCH_TYP.BCST"}	// bcst_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$bcst_cd, "bp_is_srch_typ"}	// bcst_cd
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
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
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 6, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 6, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 7, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 7, $cur_nm, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 8, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 8, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 8, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 8, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 8, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 8, $amt_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR min_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 9, $min_amt_p);
	}
	
	public void min_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 9, $min_amt_p, row);
	}


	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public String sttl_cd() {
		return getConstString(offset + 10, $sttl_cd);
	}

	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public void sttl_cd(String value) {
		setConstString(offset + 10, $sttl_cd, value);
	}


	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public String sttl_nm() {
		return getConstString(offset + 11, $sttl_nm);
	}

	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public void sttl_nm(String value) {
		setConstString(offset + 11, $sttl_nm, value);
	}


	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCNumber rate() {
		return getConstNumber(offset + 12, $rate);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void rate(MCNumber value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void rate(int value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void rate(long value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void rate(float value) {
		setConstNumber(offset + 12, $rate, value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void rate(double value) {
		setConstNumber(offset + 12, $rate, value);
	}


	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public String crryovr_mons_typ() {
		return getConstString(offset + 13, $crryovr_mons_typ);
	}

	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public void crryovr_mons_typ(String value) {
		setConstString(offset + 13, $crryovr_mons_typ, value);
	}


	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public String crryovr_mons_typ_nm() {
		return getConstString(offset + 14, $crryovr_mons_typ_nm);
	}

	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public void crryovr_mons_typ_nm(String value) {
		setConstString(offset + 14, $crryovr_mons_typ_nm, value);
	}


	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 15, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 15, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 15, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 15, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 15, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 15, $bill_cl_day1, value);
	}


	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public MCNumber rcv_crryovr_mons1() {
		return getConstNumber(offset + 16, $rcv_crryovr_mons1);
	}

	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public void rcv_crryovr_mons1(MCNumber value) {
		setConstNumber(offset + 16, $rcv_crryovr_mons1, value);
	}

	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public void rcv_crryovr_mons1(int value) {
		setConstNumber(offset + 16, $rcv_crryovr_mons1, value);
	}

	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public void rcv_crryovr_mons1(long value) {
		setConstNumber(offset + 16, $rcv_crryovr_mons1, value);
	}

	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public void rcv_crryovr_mons1(float value) {
		setConstNumber(offset + 16, $rcv_crryovr_mons1, value);
	}

	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public void rcv_crryovr_mons1(double value) {
		setConstNumber(offset + 16, $rcv_crryovr_mons1, value);
	}


	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public MCNumber rcv_day1() {
		return getConstNumber(offset + 17, $rcv_day1);
	}

	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public void rcv_day1(MCNumber value) {
		setConstNumber(offset + 17, $rcv_day1, value);
	}

	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public void rcv_day1(int value) {
		setConstNumber(offset + 17, $rcv_day1, value);
	}

	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public void rcv_day1(long value) {
		setConstNumber(offset + 17, $rcv_day1, value);
	}

	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public void rcv_day1(float value) {
		setConstNumber(offset + 17, $rcv_day1, value);
	}

	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public void rcv_day1(double value) {
		setConstNumber(offset + 17, $rcv_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 18, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 18, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 18, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 18, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 18, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 18, $bill_cl_day2, value);
	}


	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public MCNumber rcv_crryovr_mons2() {
		return getConstNumber(offset + 19, $rcv_crryovr_mons2);
	}

	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public void rcv_crryovr_mons2(MCNumber value) {
		setConstNumber(offset + 19, $rcv_crryovr_mons2, value);
	}

	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public void rcv_crryovr_mons2(int value) {
		setConstNumber(offset + 19, $rcv_crryovr_mons2, value);
	}

	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public void rcv_crryovr_mons2(long value) {
		setConstNumber(offset + 19, $rcv_crryovr_mons2, value);
	}

	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public void rcv_crryovr_mons2(float value) {
		setConstNumber(offset + 19, $rcv_crryovr_mons2, value);
	}

	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public void rcv_crryovr_mons2(double value) {
		setConstNumber(offset + 19, $rcv_crryovr_mons2, value);
	}


	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public MCNumber rcv_day2() {
		return getConstNumber(offset + 20, $rcv_day2);
	}

	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public void rcv_day2(MCNumber value) {
		setConstNumber(offset + 20, $rcv_day2, value);
	}

	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public void rcv_day2(int value) {
		setConstNumber(offset + 20, $rcv_day2, value);
	}

	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public void rcv_day2(long value) {
		setConstNumber(offset + 20, $rcv_day2, value);
	}

	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public void rcv_day2(float value) {
		setConstNumber(offset + 20, $rcv_day2, value);
	}

	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public void rcv_day2(double value) {
		setConstNumber(offset + 20, $rcv_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 21, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 21, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 21, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 21, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 21, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 21, $bill_cl_day3, value);
	}


	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public MCNumber rcv_crryovr_mons3() {
		return getConstNumber(offset + 22, $rcv_crryovr_mons3);
	}

	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public void rcv_crryovr_mons3(MCNumber value) {
		setConstNumber(offset + 22, $rcv_crryovr_mons3, value);
	}

	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public void rcv_crryovr_mons3(int value) {
		setConstNumber(offset + 22, $rcv_crryovr_mons3, value);
	}

	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public void rcv_crryovr_mons3(long value) {
		setConstNumber(offset + 22, $rcv_crryovr_mons3, value);
	}

	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public void rcv_crryovr_mons3(float value) {
		setConstNumber(offset + 22, $rcv_crryovr_mons3, value);
	}

	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public void rcv_crryovr_mons3(double value) {
		setConstNumber(offset + 22, $rcv_crryovr_mons3, value);
	}


	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public MCNumber rcv_day3() {
		return getConstNumber(offset + 23, $rcv_day3);
	}

	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public void rcv_day3(MCNumber value) {
		setConstNumber(offset + 23, $rcv_day3, value);
	}

	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public void rcv_day3(int value) {
		setConstNumber(offset + 23, $rcv_day3, value);
	}

	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public void rcv_day3(long value) {
		setConstNumber(offset + 23, $rcv_day3, value);
	}

	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public void rcv_day3(float value) {
		setConstNumber(offset + 23, $rcv_day3, value);
	}

	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public void rcv_day3(double value) {
		setConstNumber(offset + 23, $rcv_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 24, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 24, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 24, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 24, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 24, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 24, $bill_cl_day4, value);
	}


	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public MCNumber rcv_crryovr_mons4() {
		return getConstNumber(offset + 25, $rcv_crryovr_mons4);
	}

	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public void rcv_crryovr_mons4(MCNumber value) {
		setConstNumber(offset + 25, $rcv_crryovr_mons4, value);
	}

	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public void rcv_crryovr_mons4(int value) {
		setConstNumber(offset + 25, $rcv_crryovr_mons4, value);
	}

	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public void rcv_crryovr_mons4(long value) {
		setConstNumber(offset + 25, $rcv_crryovr_mons4, value);
	}

	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public void rcv_crryovr_mons4(float value) {
		setConstNumber(offset + 25, $rcv_crryovr_mons4, value);
	}

	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public void rcv_crryovr_mons4(double value) {
		setConstNumber(offset + 25, $rcv_crryovr_mons4, value);
	}


	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public MCNumber rcv_day4() {
		return getConstNumber(offset + 26, $rcv_day4);
	}

	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public void rcv_day4(MCNumber value) {
		setConstNumber(offset + 26, $rcv_day4, value);
	}

	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public void rcv_day4(int value) {
		setConstNumber(offset + 26, $rcv_day4, value);
	}

	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public void rcv_day4(long value) {
		setConstNumber(offset + 26, $rcv_day4, value);
	}

	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public void rcv_day4(float value) {
		setConstNumber(offset + 26, $rcv_day4, value);
	}

	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public void rcv_day4(double value) {
		setConstNumber(offset + 26, $rcv_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 27, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 27, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 27, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 27, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 27, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 27, $bill_cl_day5, value);
	}


	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public MCNumber rcv_crryovr_mons5() {
		return getConstNumber(offset + 28, $rcv_crryovr_mons5);
	}

	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public void rcv_crryovr_mons5(MCNumber value) {
		setConstNumber(offset + 28, $rcv_crryovr_mons5, value);
	}

	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public void rcv_crryovr_mons5(int value) {
		setConstNumber(offset + 28, $rcv_crryovr_mons5, value);
	}

	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public void rcv_crryovr_mons5(long value) {
		setConstNumber(offset + 28, $rcv_crryovr_mons5, value);
	}

	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public void rcv_crryovr_mons5(float value) {
		setConstNumber(offset + 28, $rcv_crryovr_mons5, value);
	}

	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public void rcv_crryovr_mons5(double value) {
		setConstNumber(offset + 28, $rcv_crryovr_mons5, value);
	}


	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public MCNumber rcv_day5() {
		return getConstNumber(offset + 29, $rcv_day5);
	}

	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public void rcv_day5(MCNumber value) {
		setConstNumber(offset + 29, $rcv_day5, value);
	}

	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public void rcv_day5(int value) {
		setConstNumber(offset + 29, $rcv_day5, value);
	}

	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public void rcv_day5(long value) {
		setConstNumber(offset + 29, $rcv_day5, value);
	}

	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public void rcv_day5(float value) {
		setConstNumber(offset + 29, $rcv_day5, value);
	}

	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public void rcv_day5(double value) {
		setConstNumber(offset + 29, $rcv_day5, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 30, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 30, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 31, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 31, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 32, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 32, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 33, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 33, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 34, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 34, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 35, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 36, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 36, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 37, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 37, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 38, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 38, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 39, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 39, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 40, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 40, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 41, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 41, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 42, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 42, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 43, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 43, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 44, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 44, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 45, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 45, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 46, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 46, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 47, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $del_ts, value);
	}


	public String getString(String name) {
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			return crryovr_mons_typ();
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			return crryovr_mons_typ_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons1();
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			return rcv_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons2();
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			return rcv_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons3();
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			return rcv_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons4();
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			return rcv_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons5();
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			return rcv_day5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			return crryovr_mons_typ();
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			return crryovr_mons_typ_nm();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons1();
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			return rcv_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons2();
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			return rcv_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons3();
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			return rcv_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons4();
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			return rcv_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			return rcv_crryovr_mons5();
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			return rcv_day5();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			crryovr_mons_typ(value);
			return;
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			crryovr_mons_typ_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			crryovr_mons_typ(value);
			return;
		}
		if ($crryovr_mons_typ_nm.equalsIgnoreCase(name)) {
			crryovr_mons_typ_nm(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($rcv_crryovr_mons1.equalsIgnoreCase(name)) {
			rcv_crryovr_mons1(value);
			return;
		}
		if ($rcv_day1.equalsIgnoreCase(name)) {
			rcv_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($rcv_crryovr_mons2.equalsIgnoreCase(name)) {
			rcv_crryovr_mons2(value);
			return;
		}
		if ($rcv_day2.equalsIgnoreCase(name)) {
			rcv_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($rcv_crryovr_mons3.equalsIgnoreCase(name)) {
			rcv_crryovr_mons3(value);
			return;
		}
		if ($rcv_day3.equalsIgnoreCase(name)) {
			rcv_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($rcv_crryovr_mons4.equalsIgnoreCase(name)) {
			rcv_crryovr_mons4(value);
			return;
		}
		if ($rcv_day4.equalsIgnoreCase(name)) {
			rcv_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		if ($rcv_crryovr_mons5.equalsIgnoreCase(name)) {
			rcv_crryovr_mons5(value);
			return;
		}
		if ($rcv_day5.equalsIgnoreCase(name)) {
			rcv_day5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($min_amt_p.equalsIgnoreCase(name)) {
			return min_amt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($min_amt_p.equalsIgnoreCase(name)) {
			min_amt_p(
				((MCContainerMeta) min_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Min. amount 下限金額.<p>
	 *
	 */
	public MCNumber min_amt() {
		return min_amt_p().amt();
	}

	/**
	 * Min. amount 下限金額.<p>
	 *
	 */
	public void min_amt(MCNumber value) {
		min_amt_p().amt(value);
	}

	/**
	 * Min. amount 下限金額.<p>
	 *
	 */
	public void min_amt(int value) {
		min_amt_p().amt(value);
	}

	/**
	 * Min. amount 下限金額.<p>
	 *
	 */
	public void min_amt(long value) {
		min_amt_p().amt(value);
	}

	/**
	 * Min. amount 下限金額.<p>
	 *
	 */
	public void min_amt(float value) {
		min_amt_p().amt(value);
	}

	/**
	 * Min. amount 下限金額.<p>
	 *
	 */
	public void min_amt(double value) {
		min_amt_p().amt(value);
	}

}

