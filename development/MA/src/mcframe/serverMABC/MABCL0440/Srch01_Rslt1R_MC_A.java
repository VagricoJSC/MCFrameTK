package mcframe.serverMABC.MABCL0440;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public static final String $sttl_cd = "sttl_cd";
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public static final String $sttl_nm_lcl = "sttl_nm_lcl";
	/**
	 * Standard settlement method name 標準決済方法名.<p>
	 *
	 */
	public static final String $sttl_nm = "sttl_nm";
	/**
	 * AR settlement method 債権決済方法.<p>
	 *
	 */
	public static final String $ar_sttl_flg = "ar_sttl_flg";
	/**
	 * AP settlement method 債務決済方法.<p>
	 *
	 */
	public static final String $ap_sttl_flg = "ap_sttl_flg";
	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public static final String $ar_sttl_typ = "ar_sttl_typ";
	/**
	 * AR settlement type name 債権決済区分名.<p>
	 *
	 */
	public static final String $ar_sttl_typ_nm = "ar_sttl_typ_nm";
	/**
	 * Payment received entry type 入金登録区分.<p>
	 *
	 */
	public static final String $rcv_reg_typ = "rcv_reg_typ";
	/**
	 * Payment received entry type name 入金登録区分名.<p>
	 *
	 */
	public static final String $rcv_reg_typ_nm = "rcv_reg_typ_nm";
	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public static final String $sls_purc_typ = "sls_purc_typ";
	/**
	 * Sales purchase tax type name 売上仕入税区分名.<p>
	 *
	 */
	public static final String $sls_purc_typ_nm = "sls_purc_typ_nm";
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public static final String $calc_com_paid_flg = "calc_com_paid_flg";
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public static final String $ar_setoff_cd = "ar_setoff_cd";
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public static final String $ar_setoff_nm = "ar_setoff_nm";
	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public static final String $debt_cred_id_typ = "debt_cred_id_typ";
	/**
	 * AR/AP identification type name 債権債務先識別区分名.<p>
	 *
	 */
	public static final String $debt_cred_id_typ_nm = "debt_cred_id_typ_nm";
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public static final String $ap_sttl_typ = "ap_sttl_typ";
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public static final String $ap_sttl_typ_nm = "ap_sttl_typ_nm";
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public static final String $ap_setoff_typ = "ap_setoff_typ";
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public static final String $ap_setoff_typ_nm = "ap_setoff_typ_nm";
	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public static final String $ap_setoff_act_flg = "ap_setoff_act_flg";
	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public static final String $bill_tax_disp_flg = "bill_tax_disp_flg";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
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


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sttl_cd_META = createCommonMeta($sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta sttl_nm_lcl_META = createCommonMeta($sttl_nm_lcl, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta sttl_nm_META = createCommonMeta($sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta ar_sttl_flg_META = createCommonMeta($ar_sttl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_sttl_flg_META = createCommonMeta($ap_sttl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_sttl_typ_META = createCommonMeta($ar_sttl_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta ar_sttl_typ_nm_META = createCommonMeta($ar_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AR_STTL_TYP_NM);
	public static final MCMeta rcv_reg_typ_META = createCommonMeta($rcv_reg_typ, mcframe.commonMA.meta.MA_META.RCV_REG_TYP);
	public static final MCMeta rcv_reg_typ_nm_META = createCommonMeta($rcv_reg_typ_nm, mcframe.commonMA.meta.MA_META.RCV_REG_TYP_NM);
	public static final MCMeta sls_purc_typ_META = createCommonMeta($sls_purc_typ, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP);
	public static final MCMeta sls_purc_typ_nm_META = createCommonMeta($sls_purc_typ_nm, mcframe.commonMA.meta.MA_META.SLS_PURC_TYP_NM);
	public static final MCMeta calc_com_paid_flg_META = createCommonMeta($calc_com_paid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_setoff_cd_META = createCommonMeta($ar_setoff_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_setoff_nm_META = createCommonMeta($ar_setoff_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta debt_cred_id_typ_META = createCommonMeta($debt_cred_id_typ, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP);
	public static final MCMeta debt_cred_id_typ_nm_META = createCommonMeta($debt_cred_id_typ_nm, mcframe.commonMA.meta.MA_META.DEBT_CRED_ID_TYP_NM);
	public static final MCMeta ap_sttl_typ_META = createCommonMeta($ap_sttl_typ, mcframe.commonMA.meta.MA_META.AP_STTL_TYP);
	public static final MCMeta ap_sttl_typ_nm_META = createCommonMeta($ap_sttl_typ_nm, mcframe.commonMA.meta.MA_META.AP_STTL_TYP_NM);
	public static final MCMeta ap_setoff_typ_META = createCommonMeta($ap_setoff_typ, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP);
	public static final MCMeta ap_setoff_typ_nm_META = createCommonMeta($ap_setoff_typ_nm, mcframe.commonMA.meta.MA_META.AP_SETOFF_TYP_NM);
	public static final MCMeta ap_setoff_act_flg_META = createCommonMeta($ap_setoff_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_disp_flg_META = createCommonMeta($bill_tax_disp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
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

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			sttl_cd_META,
			sttl_nm_lcl_META,
			sttl_nm_META,
			ar_sttl_flg_META,
			ap_sttl_flg_META,
			ar_sttl_typ_META,
			ar_sttl_typ_nm_META,
			rcv_reg_typ_META,
			rcv_reg_typ_nm_META,
			sls_purc_typ_META,
			sls_purc_typ_nm_META,
			calc_com_paid_flg_META,
			ar_setoff_cd_META,
			ar_setoff_nm_META,
			debt_cred_id_typ_META,
			debt_cred_id_typ_nm_META,
			ap_sttl_typ_META,
			ap_sttl_typ_nm_META,
			ap_setoff_typ_META,
			ap_setoff_typ_nm_META,
			ap_setoff_act_flg_META,
			bill_tax_disp_flg_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
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
				{$ar_sttl_typ, "MAC_AR_STTL_TYP"},	// ar_sttl_typ
				{$rcv_reg_typ, "MAC_RCV_REG_TYP"},	// rcv_reg_typ
				{$sls_purc_typ, "MAC_SLS_PURC_TYP"},	// sls_purc_typ
				{$debt_cred_id_typ, "MAC_DEBT_CRED_ID_TYP"},	// debt_cred_id_typ
				{$ap_sttl_typ, "MAC_AP_STTL_TYP"},	// ap_sttl_typ
				{$ap_setoff_typ, "MAC_AP_SETOFF_TYP"}	// ap_setoff_typ
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public String sttl_cd() {
		return getConstString(offset + 1, $sttl_cd);
	}

	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public void sttl_cd(String value) {
		setConstString(offset + 1, $sttl_cd, value);
	}


	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public String sttl_nm_lcl() {
		return getConstString(offset + 2, $sttl_nm_lcl);
	}

	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public void sttl_nm_lcl(String value) {
		setConstString(offset + 2, $sttl_nm_lcl, value);
	}


	/**
	 * Standard settlement method name 標準決済方法名.<p>
	 *
	 */
	public String sttl_nm() {
		return getConstString(offset + 3, $sttl_nm);
	}

	/**
	 * Standard settlement method name 標準決済方法名.<p>
	 *
	 */
	public void sttl_nm(String value) {
		setConstString(offset + 3, $sttl_nm, value);
	}


	/**
	 * AR settlement method 債権決済方法.<p>
	 *
	 */
	public boolean ar_sttl_flg() {
		return getConstBoolean(offset + 4, $ar_sttl_flg);
	}

	/**
	 * AR settlement method 債権決済方法.<p>
	 *
	 */
	public void ar_sttl_flg(boolean value) {
		setConstBoolean(offset + 4, $ar_sttl_flg, value);
	}


	/**
	 * AP settlement method 債務決済方法.<p>
	 *
	 */
	public boolean ap_sttl_flg() {
		return getConstBoolean(offset + 5, $ap_sttl_flg);
	}

	/**
	 * AP settlement method 債務決済方法.<p>
	 *
	 */
	public void ap_sttl_flg(boolean value) {
		setConstBoolean(offset + 5, $ap_sttl_flg, value);
	}


	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public String ar_sttl_typ() {
		return getConstString(offset + 6, $ar_sttl_typ);
	}

	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public void ar_sttl_typ(String value) {
		setConstString(offset + 6, $ar_sttl_typ, value);
	}


	/**
	 * AR settlement type name 債権決済区分名.<p>
	 *
	 */
	public String ar_sttl_typ_nm() {
		return getConstString(offset + 7, $ar_sttl_typ_nm);
	}

	/**
	 * AR settlement type name 債権決済区分名.<p>
	 *
	 */
	public void ar_sttl_typ_nm(String value) {
		setConstString(offset + 7, $ar_sttl_typ_nm, value);
	}


	/**
	 * Payment received entry type 入金登録区分.<p>
	 *
	 */
	public String rcv_reg_typ() {
		return getConstString(offset + 8, $rcv_reg_typ);
	}

	/**
	 * Payment received entry type 入金登録区分.<p>
	 *
	 */
	public void rcv_reg_typ(String value) {
		setConstString(offset + 8, $rcv_reg_typ, value);
	}


	/**
	 * Payment received entry type name 入金登録区分名.<p>
	 *
	 */
	public String rcv_reg_typ_nm() {
		return getConstString(offset + 9, $rcv_reg_typ_nm);
	}

	/**
	 * Payment received entry type name 入金登録区分名.<p>
	 *
	 */
	public void rcv_reg_typ_nm(String value) {
		setConstString(offset + 9, $rcv_reg_typ_nm, value);
	}


	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public String sls_purc_typ() {
		return getConstString(offset + 10, $sls_purc_typ);
	}

	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public void sls_purc_typ(String value) {
		setConstString(offset + 10, $sls_purc_typ, value);
	}


	/**
	 * Sales purchase tax type name 売上仕入税区分名.<p>
	 *
	 */
	public String sls_purc_typ_nm() {
		return getConstString(offset + 11, $sls_purc_typ_nm);
	}

	/**
	 * Sales purchase tax type name 売上仕入税区分名.<p>
	 *
	 */
	public void sls_purc_typ_nm(String value) {
		setConstString(offset + 11, $sls_purc_typ_nm, value);
	}


	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public boolean calc_com_paid_flg() {
		return getConstBoolean(offset + 12, $calc_com_paid_flg);
	}

	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public void calc_com_paid_flg(boolean value) {
		setConstBoolean(offset + 12, $calc_com_paid_flg, value);
	}


	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public String ar_setoff_cd() {
		return getConstString(offset + 13, $ar_setoff_cd);
	}

	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public void ar_setoff_cd(String value) {
		setConstString(offset + 13, $ar_setoff_cd, value);
	}


	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public String ar_setoff_nm() {
		return getConstString(offset + 14, $ar_setoff_nm);
	}

	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public void ar_setoff_nm(String value) {
		setConstString(offset + 14, $ar_setoff_nm, value);
	}


	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public String debt_cred_id_typ() {
		return getConstString(offset + 15, $debt_cred_id_typ);
	}

	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public void debt_cred_id_typ(String value) {
		setConstString(offset + 15, $debt_cred_id_typ, value);
	}


	/**
	 * AR/AP identification type name 債権債務先識別区分名.<p>
	 *
	 */
	public String debt_cred_id_typ_nm() {
		return getConstString(offset + 16, $debt_cred_id_typ_nm);
	}

	/**
	 * AR/AP identification type name 債権債務先識別区分名.<p>
	 *
	 */
	public void debt_cred_id_typ_nm(String value) {
		setConstString(offset + 16, $debt_cred_id_typ_nm, value);
	}


	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public String ap_sttl_typ() {
		return getConstString(offset + 17, $ap_sttl_typ);
	}

	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public void ap_sttl_typ(String value) {
		setConstString(offset + 17, $ap_sttl_typ, value);
	}


	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public String ap_sttl_typ_nm() {
		return getConstString(offset + 18, $ap_sttl_typ_nm);
	}

	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public void ap_sttl_typ_nm(String value) {
		setConstString(offset + 18, $ap_sttl_typ_nm, value);
	}


	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public String ap_setoff_typ() {
		return getConstString(offset + 19, $ap_setoff_typ);
	}

	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public void ap_setoff_typ(String value) {
		setConstString(offset + 19, $ap_setoff_typ, value);
	}


	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public String ap_setoff_typ_nm() {
		return getConstString(offset + 20, $ap_setoff_typ_nm);
	}

	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public void ap_setoff_typ_nm(String value) {
		setConstString(offset + 20, $ap_setoff_typ_nm, value);
	}


	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public boolean ap_setoff_act_flg() {
		return getConstBoolean(offset + 21, $ap_setoff_act_flg);
	}

	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public void ap_setoff_act_flg(boolean value) {
		setConstBoolean(offset + 21, $ap_setoff_act_flg, value);
	}


	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public boolean bill_tax_disp_flg() {
		return getConstBoolean(offset + 22, $bill_tax_disp_flg);
	}

	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public void bill_tax_disp_flg(boolean value) {
		setConstBoolean(offset + 22, $bill_tax_disp_flg, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 23, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 23, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 24, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 24, $ac_rsn_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 25, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 25, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 26, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 26, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 27, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 27, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 28, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 28, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 29, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 29, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 31, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 31, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 32, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 32, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 33, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 34, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 34, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 35, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 35, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 36, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 37, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 37, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 38, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 38, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 39, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 39, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 40, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 40, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 41, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 41, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 42, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 42, $del_ts, value);
	}


	public String getString(String name) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($sttl_nm_lcl.equalsIgnoreCase(name)) {
			return sttl_nm_lcl();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			return ar_sttl_typ();
		}
		if ($ar_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ar_sttl_typ_nm();
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			return rcv_reg_typ();
		}
		if ($rcv_reg_typ_nm.equalsIgnoreCase(name)) {
			return rcv_reg_typ_nm();
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			return sls_purc_typ();
		}
		if ($sls_purc_typ_nm.equalsIgnoreCase(name)) {
			return sls_purc_typ_nm();
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			return ar_setoff_cd();
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			return ar_setoff_nm();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return debt_cred_id_typ_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			return ar_sttl_flg();
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			return ap_sttl_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($sttl_nm_lcl.equalsIgnoreCase(name)) {
			return sttl_nm_lcl();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			return ar_sttl_typ();
		}
		if ($ar_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ar_sttl_typ_nm();
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			return rcv_reg_typ();
		}
		if ($rcv_reg_typ_nm.equalsIgnoreCase(name)) {
			return rcv_reg_typ_nm();
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			return sls_purc_typ();
		}
		if ($sls_purc_typ_nm.equalsIgnoreCase(name)) {
			return sls_purc_typ_nm();
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			return ar_setoff_cd();
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			return ar_setoff_nm();
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			return debt_cred_id_typ();
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			return debt_cred_id_typ_nm();
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			return ap_sttl_typ();
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			return ap_sttl_typ_nm();
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			return ap_setoff_typ();
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			return ap_setoff_typ_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			return ar_sttl_flg();
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			return ap_sttl_flg();
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			return calc_com_paid_flg();
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			return ap_setoff_act_flg();
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			return bill_tax_disp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($sttl_nm_lcl.equalsIgnoreCase(name)) {
			sttl_nm_lcl(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			ar_sttl_typ(value);
			return;
		}
		if ($ar_sttl_typ_nm.equalsIgnoreCase(name)) {
			ar_sttl_typ_nm(value);
			return;
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			rcv_reg_typ(value);
			return;
		}
		if ($rcv_reg_typ_nm.equalsIgnoreCase(name)) {
			rcv_reg_typ_nm(value);
			return;
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			sls_purc_typ(value);
			return;
		}
		if ($sls_purc_typ_nm.equalsIgnoreCase(name)) {
			sls_purc_typ_nm(value);
			return;
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			ar_setoff_cd(value);
			return;
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			ar_setoff_nm(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			debt_cred_id_typ_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			ar_sttl_flg(value);
			return;
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			ap_sttl_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($sttl_nm_lcl.equalsIgnoreCase(name)) {
			sttl_nm_lcl(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			ar_sttl_typ(value);
			return;
		}
		if ($ar_sttl_typ_nm.equalsIgnoreCase(name)) {
			ar_sttl_typ_nm(value);
			return;
		}
		if ($rcv_reg_typ.equalsIgnoreCase(name)) {
			rcv_reg_typ(value);
			return;
		}
		if ($rcv_reg_typ_nm.equalsIgnoreCase(name)) {
			rcv_reg_typ_nm(value);
			return;
		}
		if ($sls_purc_typ.equalsIgnoreCase(name)) {
			sls_purc_typ(value);
			return;
		}
		if ($sls_purc_typ_nm.equalsIgnoreCase(name)) {
			sls_purc_typ_nm(value);
			return;
		}
		if ($ar_setoff_cd.equalsIgnoreCase(name)) {
			ar_setoff_cd(value);
			return;
		}
		if ($ar_setoff_nm.equalsIgnoreCase(name)) {
			ar_setoff_nm(value);
			return;
		}
		if ($debt_cred_id_typ.equalsIgnoreCase(name)) {
			debt_cred_id_typ(value);
			return;
		}
		if ($debt_cred_id_typ_nm.equalsIgnoreCase(name)) {
			debt_cred_id_typ_nm(value);
			return;
		}
		if ($ap_sttl_typ.equalsIgnoreCase(name)) {
			ap_sttl_typ(value);
			return;
		}
		if ($ap_sttl_typ_nm.equalsIgnoreCase(name)) {
			ap_sttl_typ_nm(value);
			return;
		}
		if ($ap_setoff_typ.equalsIgnoreCase(name)) {
			ap_setoff_typ(value);
			return;
		}
		if ($ap_setoff_typ_nm.equalsIgnoreCase(name)) {
			ap_setoff_typ_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($ar_sttl_flg.equalsIgnoreCase(name)) {
			ar_sttl_flg(value);
			return;
		}
		if ($ap_sttl_flg.equalsIgnoreCase(name)) {
			ap_sttl_flg(value);
			return;
		}
		if ($calc_com_paid_flg.equalsIgnoreCase(name)) {
			calc_com_paid_flg(value);
			return;
		}
		if ($ap_setoff_act_flg.equalsIgnoreCase(name)) {
			ap_setoff_act_flg(value);
			return;
		}
		if ($bill_tax_disp_flg.equalsIgnoreCase(name)) {
			bill_tax_disp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

