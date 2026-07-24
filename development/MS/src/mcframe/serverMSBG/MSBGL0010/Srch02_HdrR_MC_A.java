package mcframe.serverMSBG.MSBGL0010;

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
 * ブロック"Srch02_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_HdrR_MC_A extends MCConstRow {

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
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
	 * WG cd. ワーキンググーループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググーループ名.<p>
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
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
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
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
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
	 * Details selected 明細選択済.<p>
	 *
	 */
	public static final String $bill_d_sel_flg = "bill_d_sel_flg";
	/**
	 * Last billing closing year/month/date 前回請求締年月月日.<p>
	 *
	 */
	public static final String $last_bill_cl_dt = "last_bill_cl_dt";
	/**
	 * Last billing closing month 前回請求締年月.<p>
	 *
	 */
	public static final String $last_bill_ym = "last_bill_ym";
	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public static final String $last_bill_cl_day = "last_bill_cl_day";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public static final String $bill_cl_typ_nm = "bill_cl_typ_nm";
	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public static final String $tax_on_bill_flg = "tax_on_bill_flg";
	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function 登録機能.<p>
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
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function 更新機能.<p>
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";


	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bill_ym_META = createCommonMeta($bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta bill_cl_day_META = createCommonMeta($bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_d_sel_flg_META = createCommonMeta($bill_d_sel_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_bill_cl_dt_META = createCommonMeta($last_bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_bill_ym_META = createCommonMeta($last_bill_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta last_bill_cl_day_META = createCommonMeta($last_bill_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta bill_cl_typ_nm_META = createCommonMeta($bill_cl_typ_nm, mcframe.commonMA.meta.MA_META.BILL_CL_TYP_NM);
	public static final MCMeta tax_on_bill_flg_META = createCommonMeta($tax_on_bill_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);

	protected static final ConstMetaList<Srch02_HdrR> constMetas = new ConstMetaList<Srch02_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_no_META,
			bill_dpt_cd_META,
			bill_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			bcst_cd_META,
			bcst_nm_META,
			edi_flg_META,
			iv_no_META,
			bill_ym_META,
			bill_cl_day_META,
			rcv_schd_dt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			bill_xrate_META,
			wrk_no_META,
			wrk_nm_META,
			bill_d_sel_flg_META,
			last_bill_cl_dt_META,
			last_bill_ym_META,
			last_bill_cl_day_META,
			bill_cl_typ_META,
			bill_cl_typ_nm_META,
			tax_on_bill_flg_META,
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
			upd_srv_req_no_META,
			upd_cntr_META,
			bill_mng_no_META
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
				{$bill_cl_typ, "MAC_BILL_CL_TYP"}	// bill_cl_typ
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
	protected Srch02_HdrR_MC_A(ConstMetaList<? extends Srch02_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_HdrR clone() {
		return (Srch02_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_HdrR createInstance() {
		return (Srch02_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_HdrR getValues(String... names) {
		return (Srch02_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 0, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 0, $bill_no, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 1, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 1, $bill_dpt_cd, value);
	}


	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 2, $bill_dpt_nm);
	}

	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 2, $bill_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググーループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググーループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググーループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググーループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 5, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 5, $bcst_cd, value);
	}


	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 6, $bcst_nm);
	}

	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 6, $bcst_nm, value);
	}


	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 7, $edi_flg);
	}

	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 7, $edi_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 8, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 8, $iv_no, value);
	}


	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCDate bill_ym() {
		return getConstDate(offset + 9, $bill_ym);
	}

	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public void bill_ym(MCDate value) {
		setConstDate(offset + 9, $bill_ym, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumber bill_cl_day() {
		return getConstNumber(offset + 10, $bill_cl_day);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(MCNumber value) {
		setConstNumber(offset + 10, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(int value) {
		setConstNumber(offset + 10, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(long value) {
		setConstNumber(offset + 10, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(float value) {
		setConstNumber(offset + 10, $bill_cl_day, value);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void bill_cl_day(double value) {
		setConstNumber(offset + 10, $bill_cl_day, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 11, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 11, $rcv_schd_dt, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 12, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 12, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 13, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 13, $trd_cur_nm, value);
	}


	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 14, $bill_xrate);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 14, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 14, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 14, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 14, $bill_xrate, value);
	}

	/**
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 14, $bill_xrate, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 15, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 15, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 16, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 16, $wrk_nm, value);
	}


	/**
	 * Details selected 明細選択済.<p>
	 *
	 */
	public boolean bill_d_sel_flg() {
		return getConstBoolean(offset + 17, $bill_d_sel_flg);
	}

	/**
	 * Details selected 明細選択済.<p>
	 *
	 */
	public void bill_d_sel_flg(boolean value) {
		setConstBoolean(offset + 17, $bill_d_sel_flg, value);
	}


	/**
	 * Last billing closing year/month/date 前回請求締年月月日.<p>
	 *
	 */
	public MCDate last_bill_cl_dt() {
		return getConstDate(offset + 18, $last_bill_cl_dt);
	}

	/**
	 * Last billing closing year/month/date 前回請求締年月月日.<p>
	 *
	 */
	public void last_bill_cl_dt(MCDate value) {
		setConstDate(offset + 18, $last_bill_cl_dt, value);
	}


	/**
	 * Last billing closing month 前回請求締年月.<p>
	 *
	 */
	public MCDate last_bill_ym() {
		return getConstDate(offset + 19, $last_bill_ym);
	}

	/**
	 * Last billing closing month 前回請求締年月.<p>
	 *
	 */
	public void last_bill_ym(MCDate value) {
		setConstDate(offset + 19, $last_bill_ym, value);
	}


	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public MCNumber last_bill_cl_day() {
		return getConstNumber(offset + 20, $last_bill_cl_day);
	}

	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public void last_bill_cl_day(MCNumber value) {
		setConstNumber(offset + 20, $last_bill_cl_day, value);
	}

	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public void last_bill_cl_day(int value) {
		setConstNumber(offset + 20, $last_bill_cl_day, value);
	}

	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public void last_bill_cl_day(long value) {
		setConstNumber(offset + 20, $last_bill_cl_day, value);
	}

	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public void last_bill_cl_day(float value) {
		setConstNumber(offset + 20, $last_bill_cl_day, value);
	}

	/**
	 * Last closing date 前回締日.<p>
	 *
	 */
	public void last_bill_cl_day(double value) {
		setConstNumber(offset + 20, $last_bill_cl_day, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 21, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 21, $bill_cl_typ, value);
	}


	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public String bill_cl_typ_nm() {
		return getConstString(offset + 22, $bill_cl_typ_nm);
	}

	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public void bill_cl_typ_nm(String value) {
		setConstString(offset + 22, $bill_cl_typ_nm, value);
	}


	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public boolean tax_on_bill_flg() {
		return getConstBoolean(offset + 23, $tax_on_bill_flg);
	}

	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public void tax_on_bill_flg(boolean value) {
		setConstBoolean(offset + 23, $tax_on_bill_flg, value);
	}


	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 24, $ins_usr_id);
	}

	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 24, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 25, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 25, $ins_usr_nm, value);
	}


	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 27, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 27, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}


	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 29, $upd_usr_id);
	}

	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 29, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 30, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 30, $upd_usr_nm, value);
	}


	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 32, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 32, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 33, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 33, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 34, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 34, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 35, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 35, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 35, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 35, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 35, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 35, $upd_cntr, value);
	}


	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 36, $bill_mng_no);
	}

	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 36, $bill_mng_no, value);
	}


	public String getString(String name) {
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_typ_nm();
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			return last_bill_cl_day();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($last_bill_cl_dt.equalsIgnoreCase(name)) {
			return last_bill_cl_dt();
		}
		if ($last_bill_ym.equalsIgnoreCase(name)) {
			return last_bill_ym();
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
	public boolean getBoolean(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($bill_d_sel_flg.equalsIgnoreCase(name)) {
			return bill_d_sel_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			return bill_cl_typ_nm();
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			return bill_cl_day();
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			return last_bill_cl_day();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			return bill_ym();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($last_bill_cl_dt.equalsIgnoreCase(name)) {
			return last_bill_cl_dt();
		}
		if ($last_bill_ym.equalsIgnoreCase(name)) {
			return last_bill_ym();
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
	public boolean getBooleanNE(String name) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($bill_d_sel_flg.equalsIgnoreCase(name)) {
			return bill_d_sel_flg();
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			return tax_on_bill_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_typ_nm(value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($last_bill_cl_dt.equalsIgnoreCase(name)) {
			last_bill_cl_dt(value);
			return;
		}
		if ($last_bill_ym.equalsIgnoreCase(name)) {
			last_bill_ym(value);
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
	public void setBoolean(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($bill_d_sel_flg.equalsIgnoreCase(name)) {
			bill_d_sel_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
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
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_cl_typ_nm.equalsIgnoreCase(name)) {
			bill_cl_typ_nm(value);
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
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day.equalsIgnoreCase(name)) {
			bill_cl_day(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_cl_day.equalsIgnoreCase(name)) {
			last_bill_cl_day(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($bill_ym.equalsIgnoreCase(name)) {
			bill_ym(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($last_bill_cl_dt.equalsIgnoreCase(name)) {
			last_bill_cl_dt(value);
			return;
		}
		if ($last_bill_ym.equalsIgnoreCase(name)) {
			last_bill_ym(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($bill_d_sel_flg.equalsIgnoreCase(name)) {
			bill_d_sel_flg(value);
			return;
		}
		if ($tax_on_bill_flg.equalsIgnoreCase(name)) {
			tax_on_bill_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

