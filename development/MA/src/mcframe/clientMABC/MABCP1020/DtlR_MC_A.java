package mcframe.clientMABC.MABCP1020;

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
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public static final String $ac_nm_lcl = "ac_nm_lcl";
	/**
	 * Standard account name 標準勘定科目名.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public static final String $ac_nm2_nm_lcl = "ac_nm2_nm_lcl";
	/**
	 * Standard account abbreviation name 標準勘定科目略名.<p>
	 *
	 */
	public static final String $ac_nm2 = "ac_nm2";
	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public static final String $dc_typ_nm = "dc_typ_nm";
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";
	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public static final String $ac_typ_nm = "ac_typ_nm";
	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public static final String $ac_tax_cd = "ac_tax_cd";
	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public static final String $ac_tax_nm = "ac_tax_nm";
	/**
	 * Accounting tax type 会計税区分.<p>
	 *
	 */
	public static final String $ac_tax_typ = "ac_tax_typ";
	/**
	 * Foreign currency 外貨.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 * Aggregated 0 used 集計０使用.<p>
	 *
	 */
	public static final String $sum0_flg = "sum0_flg";
	/**
	 * Aggregated 1 used 集計１使用.<p>
	 *
	 */
	public static final String $sum1_flg = "sum1_flg";
	/**
	 * Aggregated 2 used 集計２使用.<p>
	 *
	 */
	public static final String $sum2_flg = "sum2_flg";
	/**
	 * Aggregated 3 used 集計３使用.<p>
	 *
	 */
	public static final String $sum3_flg = "sum3_flg";
	/**
	 * Aggregated 4 used 集計４使用.<p>
	 *
	 */
	public static final String $sum4_flg = "sum4_flg";
	/**
	 * Aggregated 5 used 集計５使用.<p>
	 *
	 */
	public static final String $sum5_flg = "sum5_flg";
	/**
	 * Use project プロジェクト使用.<p>
	 *
	 */
	public static final String $project_flg = "project_flg";
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 * PIC used 担当者使用.<p>
	 *
	 */
	public static final String $usr_flg = "usr_flg";
	/**
	 * Use bank account 口座使用.<p>
	 *
	 */
	public static final String $bank_ac_flg = "bank_ac_flg";
	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public static final String $ac_typ1 = "ac_typ1";
	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public static final String $ac_typ_nm1 = "ac_typ_nm1";
	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public static final String $ac_typ2 = "ac_typ2";
	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public static final String $ac_typ_nm2 = "ac_typ_nm2";
	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public static final String $ac_typ3 = "ac_typ3";
	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public static final String $ac_typ_nm3 = "ac_typ_nm3";
	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public static final String $ac_typ4 = "ac_typ4";
	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public static final String $ac_typ_nm4 = "ac_typ_nm4";
	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public static final String $ac_typ5 = "ac_typ5";
	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public static final String $ac_typ_nm5 = "ac_typ_nm5";
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


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_lcl_META = createCommonMeta($ac_nm_lcl, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm2_nm_lcl_META = createCommonMeta($ac_nm2_nm_lcl, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_META = createCommonMeta($ac_nm2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);
	public static final MCMeta dc_typ_nm_META = createCommonMeta($dc_typ_nm, mcframe.commonMA.meta.MA_META.DC_TYP_NM);
	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_CD_TYP);
	public static final MCMeta ac_typ_nm_META = createCommonMeta($ac_typ_nm, mcframe.commonMA.meta.MA_META.AC_CD_TYP_NM);
	public static final MCMeta ac_tax_cd_META = createCommonMeta($ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta ac_tax_nm_META = createCommonMeta($ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta ac_tax_typ_META = createCommonMeta($ac_tax_typ, mcframe.commonMA.meta.MA_META.AC_TAX_TYP);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum0_flg_META = createCommonMeta($sum0_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum1_flg_META = createCommonMeta($sum1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum2_flg_META = createCommonMeta($sum2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum3_flg_META = createCommonMeta($sum3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum4_flg_META = createCommonMeta($sum4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum5_flg_META = createCommonMeta($sum5_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta project_flg_META = createCommonMeta($project_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_flg_META = createCommonMeta($usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_flg_META = createCommonMeta($bank_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ1_META = createCommonMeta($ac_typ1, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm1_META = createCommonMeta($ac_typ_nm1, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ2_META = createCommonMeta($ac_typ2, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm2_META = createCommonMeta($ac_typ_nm2, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ3_META = createCommonMeta($ac_typ3, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm3_META = createCommonMeta($ac_typ_nm3, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ4_META = createCommonMeta($ac_typ4, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm4_META = createCommonMeta($ac_typ_nm4, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
	public static final MCMeta ac_typ5_META = createCommonMeta($ac_typ5, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ_nm5_META = createCommonMeta($ac_typ_nm5, mcframe.commonMA.meta.MA_META.AC_TYP_NM);
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
			ac_cd_META,
			ac_nm_lcl_META,
			ac_nm_META,
			ac_nm2_nm_lcl_META,
			ac_nm2_META,
			dc_typ_META,
			dc_typ_nm_META,
			sub_flg_META,
			ac_typ_META,
			ac_typ_nm_META,
			ac_tax_cd_META,
			ac_tax_nm_META,
			ac_tax_typ_META,
			foreign_flg_META,
			sum0_flg_META,
			sum1_flg_META,
			sum2_flg_META,
			sum3_flg_META,
			sum4_flg_META,
			sum5_flg_META,
			project_flg_META,
			bp_flg_META,
			usr_flg_META,
			bank_ac_flg_META,
			ap_typ_META,
			ap_typ_nm_META,
			ar_typ_META,
			ar_typ_nm_META,
			ac_typ1_META,
			ac_typ_nm1_META,
			ac_typ2_META,
			ac_typ_nm2_META,
			ac_typ3_META,
			ac_typ_nm3_META,
			ac_typ4_META,
			ac_typ_nm4_META,
			ac_typ5_META,
			ac_typ_nm5_META,
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

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$ac_cd	// ac_cd
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 2, $ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 2, $ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String ac_nm_lcl() {
		return getConstString(offset + 3, $ac_nm_lcl);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void ac_nm_lcl(String value) {
		setConstString(offset + 3, $ac_nm_lcl, value);
	}


	/**
	 * Standard account name 標準勘定科目名.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 4, $ac_nm);
	}

	/**
	 * Standard account name 標準勘定科目名.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 4, $ac_nm, value);
	}


	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public String ac_nm2_nm_lcl() {
		return getConstString(offset + 5, $ac_nm2_nm_lcl);
	}

	/**
	 * Account abbreviation name 勘定科目略名.<p>
	 *
	 */
	public void ac_nm2_nm_lcl(String value) {
		setConstString(offset + 5, $ac_nm2_nm_lcl, value);
	}


	/**
	 * Standard account abbreviation name 標準勘定科目略名.<p>
	 *
	 */
	public String ac_nm2() {
		return getConstString(offset + 6, $ac_nm2);
	}

	/**
	 * Standard account abbreviation name 標準勘定科目略名.<p>
	 *
	 */
	public void ac_nm2(String value) {
		setConstString(offset + 6, $ac_nm2, value);
	}


	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 7, $dc_typ);
	}

	/**
	 * Debit and credit type 貸借区分.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 7, $dc_typ, value);
	}


	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public String dc_typ_nm() {
		return getConstString(offset + 8, $dc_typ_nm);
	}

	/**
	 * Debit and credit type name 貸借区分名.<p>
	 *
	 */
	public void dc_typ_nm(String value) {
		setConstString(offset + 8, $dc_typ_nm, value);
	}


	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 9, $sub_flg);
	}

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 9, $sub_flg, value);
	}


	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 10, $ac_typ);
	}

	/**
	 * Account type 勘定科目区分.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 10, $ac_typ, value);
	}


	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public String ac_typ_nm() {
		return getConstString(offset + 11, $ac_typ_nm);
	}

	/**
	 * Account type name 勘定科目区分名.<p>
	 *
	 */
	public void ac_typ_nm(String value) {
		setConstString(offset + 11, $ac_typ_nm, value);
	}


	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public String ac_tax_cd() {
		return getConstString(offset + 12, $ac_tax_cd);
	}

	/**
	 * Accounting tax cd. 会計税ＣＤ.<p>
	 *
	 */
	public void ac_tax_cd(String value) {
		setConstString(offset + 12, $ac_tax_cd, value);
	}


	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public String ac_tax_nm() {
		return getConstString(offset + 13, $ac_tax_nm);
	}

	/**
	 * Accounting tax name 会計税名.<p>
	 *
	 */
	public void ac_tax_nm(String value) {
		setConstString(offset + 13, $ac_tax_nm, value);
	}


	/**
	 * Accounting tax type 会計税区分.<p>
	 *
	 */
	public String ac_tax_typ() {
		return getConstString(offset + 14, $ac_tax_typ);
	}

	/**
	 * Accounting tax type 会計税区分.<p>
	 *
	 */
	public void ac_tax_typ(String value) {
		setConstString(offset + 14, $ac_tax_typ, value);
	}


	/**
	 * Foreign currency 外貨.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 15, $foreign_flg);
	}

	/**
	 * Foreign currency 外貨.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 15, $foreign_flg, value);
	}


	/**
	 * Aggregated 0 used 集計０使用.<p>
	 *
	 */
	public boolean sum0_flg() {
		return getConstBoolean(offset + 16, $sum0_flg);
	}

	/**
	 * Aggregated 0 used 集計０使用.<p>
	 *
	 */
	public void sum0_flg(boolean value) {
		setConstBoolean(offset + 16, $sum0_flg, value);
	}


	/**
	 * Aggregated 1 used 集計１使用.<p>
	 *
	 */
	public boolean sum1_flg() {
		return getConstBoolean(offset + 17, $sum1_flg);
	}

	/**
	 * Aggregated 1 used 集計１使用.<p>
	 *
	 */
	public void sum1_flg(boolean value) {
		setConstBoolean(offset + 17, $sum1_flg, value);
	}


	/**
	 * Aggregated 2 used 集計２使用.<p>
	 *
	 */
	public boolean sum2_flg() {
		return getConstBoolean(offset + 18, $sum2_flg);
	}

	/**
	 * Aggregated 2 used 集計２使用.<p>
	 *
	 */
	public void sum2_flg(boolean value) {
		setConstBoolean(offset + 18, $sum2_flg, value);
	}


	/**
	 * Aggregated 3 used 集計３使用.<p>
	 *
	 */
	public boolean sum3_flg() {
		return getConstBoolean(offset + 19, $sum3_flg);
	}

	/**
	 * Aggregated 3 used 集計３使用.<p>
	 *
	 */
	public void sum3_flg(boolean value) {
		setConstBoolean(offset + 19, $sum3_flg, value);
	}


	/**
	 * Aggregated 4 used 集計４使用.<p>
	 *
	 */
	public boolean sum4_flg() {
		return getConstBoolean(offset + 20, $sum4_flg);
	}

	/**
	 * Aggregated 4 used 集計４使用.<p>
	 *
	 */
	public void sum4_flg(boolean value) {
		setConstBoolean(offset + 20, $sum4_flg, value);
	}


	/**
	 * Aggregated 5 used 集計５使用.<p>
	 *
	 */
	public boolean sum5_flg() {
		return getConstBoolean(offset + 21, $sum5_flg);
	}

	/**
	 * Aggregated 5 used 集計５使用.<p>
	 *
	 */
	public void sum5_flg(boolean value) {
		setConstBoolean(offset + 21, $sum5_flg, value);
	}


	/**
	 * Use project プロジェクト使用.<p>
	 *
	 */
	public boolean project_flg() {
		return getConstBoolean(offset + 22, $project_flg);
	}

	/**
	 * Use project プロジェクト使用.<p>
	 *
	 */
	public void project_flg(boolean value) {
		setConstBoolean(offset + 22, $project_flg, value);
	}


	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 23, $bp_flg);
	}

	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 23, $bp_flg, value);
	}


	/**
	 * PIC used 担当者使用.<p>
	 *
	 */
	public boolean usr_flg() {
		return getConstBoolean(offset + 24, $usr_flg);
	}

	/**
	 * PIC used 担当者使用.<p>
	 *
	 */
	public void usr_flg(boolean value) {
		setConstBoolean(offset + 24, $usr_flg, value);
	}


	/**
	 * Use bank account 口座使用.<p>
	 *
	 */
	public boolean bank_ac_flg() {
		return getConstBoolean(offset + 25, $bank_ac_flg);
	}

	/**
	 * Use bank account 口座使用.<p>
	 *
	 */
	public void bank_ac_flg(boolean value) {
		setConstBoolean(offset + 25, $bank_ac_flg, value);
	}


	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 26, $ap_typ);
	}

	/**
	 * AP type ＡＰ科目区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 26, $ap_typ, value);
	}


	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 27, $ap_typ_nm);
	}

	/**
	 * AP type name ＡＰ科目区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 27, $ap_typ_nm, value);
	}


	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 28, $ar_typ);
	}

	/**
	 * AR type ＡＲ科目区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 28, $ar_typ, value);
	}


	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 29, $ar_typ_nm);
	}

	/**
	 * AR type name ＡＲ科目区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 29, $ar_typ_nm, value);
	}


	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public String ac_typ1() {
		return getConstString(offset + 30, $ac_typ1);
	}

	/**
	 * Account spare type 1 科目予備区分１.<p>
	 *
	 */
	public void ac_typ1(String value) {
		setConstString(offset + 30, $ac_typ1, value);
	}


	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public String ac_typ_nm1() {
		return getConstString(offset + 31, $ac_typ_nm1);
	}

	/**
	 * Account spare type name 1 科目予備区分名１.<p>
	 *
	 */
	public void ac_typ_nm1(String value) {
		setConstString(offset + 31, $ac_typ_nm1, value);
	}


	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public String ac_typ2() {
		return getConstString(offset + 32, $ac_typ2);
	}

	/**
	 * Account spare type 2 科目予備区分２.<p>
	 *
	 */
	public void ac_typ2(String value) {
		setConstString(offset + 32, $ac_typ2, value);
	}


	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public String ac_typ_nm2() {
		return getConstString(offset + 33, $ac_typ_nm2);
	}

	/**
	 * Account spare type name 2 科目予備区分名２.<p>
	 *
	 */
	public void ac_typ_nm2(String value) {
		setConstString(offset + 33, $ac_typ_nm2, value);
	}


	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public String ac_typ3() {
		return getConstString(offset + 34, $ac_typ3);
	}

	/**
	 * Account spare type 3 科目予備区分３.<p>
	 *
	 */
	public void ac_typ3(String value) {
		setConstString(offset + 34, $ac_typ3, value);
	}


	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public String ac_typ_nm3() {
		return getConstString(offset + 35, $ac_typ_nm3);
	}

	/**
	 * Account spare type name 3 科目予備区分名３.<p>
	 *
	 */
	public void ac_typ_nm3(String value) {
		setConstString(offset + 35, $ac_typ_nm3, value);
	}


	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public String ac_typ4() {
		return getConstString(offset + 36, $ac_typ4);
	}

	/**
	 * Account spare type 4 科目予備区分４.<p>
	 *
	 */
	public void ac_typ4(String value) {
		setConstString(offset + 36, $ac_typ4, value);
	}


	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public String ac_typ_nm4() {
		return getConstString(offset + 37, $ac_typ_nm4);
	}

	/**
	 * Account spare type name 4 科目予備区分名４.<p>
	 *
	 */
	public void ac_typ_nm4(String value) {
		setConstString(offset + 37, $ac_typ_nm4, value);
	}


	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public String ac_typ5() {
		return getConstString(offset + 38, $ac_typ5);
	}

	/**
	 * Account spare type 5 科目予備区分５.<p>
	 *
	 */
	public void ac_typ5(String value) {
		setConstString(offset + 38, $ac_typ5, value);
	}


	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public String ac_typ_nm5() {
		return getConstString(offset + 39, $ac_typ_nm5);
	}

	/**
	 * Account spare type name 5 科目予備区分名５.<p>
	 *
	 */
	public void ac_typ_nm5(String value) {
		setConstString(offset + 39, $ac_typ_nm5, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 40, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 40, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 41, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 41, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 42, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 42, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 45, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 46, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 46, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 47, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 47, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 48, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 49, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 49, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 50, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 50, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 51, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 52, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 52, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 53, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 53, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 54, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 54, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 55, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 55, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 56, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 56, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 57, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 57, $del_ts, value);
	}


	public String getString(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			return ac_nm_lcl();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm2_nm_lcl.equalsIgnoreCase(name)) {
			return ac_nm2_nm_lcl();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			return dc_typ_nm();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			return ac_typ_nm();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			return ac_typ_nm1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			return ac_typ_nm2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			return ac_typ_nm3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			return ac_typ_nm4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			return ac_typ_nm5();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			return ac_nm_lcl();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm2_nm_lcl.equalsIgnoreCase(name)) {
			return ac_nm2_nm_lcl();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			return dc_typ_nm();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			return ac_typ_nm();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			return ac_tax_nm();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			return ac_typ_nm1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			return ac_typ_nm2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			return ac_typ_nm3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			return ac_typ_nm4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			return ac_typ_nm5();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			ac_nm_lcl(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm2_nm_lcl.equalsIgnoreCase(name)) {
			ac_nm2_nm_lcl(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			dc_typ_nm(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			ac_typ_nm(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			ac_typ_nm1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			ac_typ_nm2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			ac_typ_nm3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			ac_typ_nm4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
			return;
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			ac_typ_nm5(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm_lcl.equalsIgnoreCase(name)) {
			ac_nm_lcl(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm2_nm_lcl.equalsIgnoreCase(name)) {
			ac_nm2_nm_lcl(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($dc_typ_nm.equalsIgnoreCase(name)) {
			dc_typ_nm(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_typ_nm.equalsIgnoreCase(name)) {
			ac_typ_nm(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_nm.equalsIgnoreCase(name)) {
			ac_tax_nm(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ_nm1.equalsIgnoreCase(name)) {
			ac_typ_nm1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ_nm2.equalsIgnoreCase(name)) {
			ac_typ_nm2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ_nm3.equalsIgnoreCase(name)) {
			ac_typ_nm3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ_nm4.equalsIgnoreCase(name)) {
			ac_typ_nm4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
			return;
		}
		if ($ac_typ_nm5.equalsIgnoreCase(name)) {
			ac_typ_nm5(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

