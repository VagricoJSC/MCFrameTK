package mcframe.serverMABC.MABCL1500;

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
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm_lcl = "ext_sys_nm_lcl";
	/**
	 * Standard external system name 標準外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public static final String $ext_sys_typ = "ext_sys_typ";
	/**
	 * External system type name 外部システム区分名.<p>
	 *
	 */
	public static final String $ext_sys_typ_nm = "ext_sys_typ_nm";
	/**
	 * Web API Ｗｅｂ　ＡＰＩ.<p>
	 *
	 */
	public static final String $web_api_flg = "web_api_flg";
	/**
	 * Command execution コマンド実行.<p>
	 *
	 */
	public static final String $cmd_exec_flg = "cmd_exec_flg";
	/**
	 * Real time import リアルタイム取込.<p>
	 *
	 */
	public static final String $real_imp_flg = "real_imp_flg";
	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public static final String $not_send_upd_flg = "not_send_upd_flg";
	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public static final String $not_dup_imp_flg = "not_dup_imp_flg";
	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public static final String $if_upd_typ = "if_upd_typ";
	/**
	 * IF update type name ＩＦ更新区分名.<p>
	 *
	 */
	public static final String $if_upd_typ_nm = "if_upd_typ_nm";
	/**
	 * Delivery note unit split 納品書単位分割.<p>
	 *
	 */
	public static final String $dlv_slip_split_flg = "dlv_slip_split_flg";
	/**
	 * NULL character IF ＮＵＬＬ文字ＩＦ.<p>
	 *
	 */
	public static final String $null_val_if_flg = "null_val_if_flg";
	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public static final String $upri_not_chk_flg = "upri_not_chk_flg";
	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public static final String $amt_not_chk_flg = "amt_not_chk_flg";
	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public static final String $tax_not_chk_flg = "tax_not_chk_flg";
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
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_lcl_META = createCommonMeta($ext_sys_nm_lcl, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_sys_typ_META = createCommonMeta($ext_sys_typ, mcframe.commonMA.meta.MA_META.EXT_SYS_TYP);
	public static final MCMeta ext_sys_typ_nm_META = createCommonMeta($ext_sys_typ_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_TYP_NM);
	public static final MCMeta web_api_flg_META = createCommonMeta($web_api_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmd_exec_flg_META = createCommonMeta($cmd_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta real_imp_flg_META = createCommonMeta($real_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_send_upd_flg_META = createCommonMeta($not_send_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_dup_imp_flg_META = createCommonMeta($not_dup_imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_upd_typ_META = createCommonMeta($if_upd_typ, mcframe.commonMA.meta.MA_META.IF_UPD_TYP);
	public static final MCMeta if_upd_typ_nm_META = createCommonMeta($if_upd_typ_nm, mcframe.commonMA.meta.MA_META.IF_UPD_TYP_NM);
	public static final MCMeta dlv_slip_split_flg_META = createCommonMeta($dlv_slip_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta null_val_if_flg_META = createCommonMeta($null_val_if_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_not_chk_flg_META = createCommonMeta($upri_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_not_chk_flg_META = createCommonMeta($amt_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_not_chk_flg_META = createCommonMeta($tax_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
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
			ext_sys_cd_META,
			ext_sys_nm_lcl_META,
			ext_sys_nm_META,
			ext_sys_typ_META,
			ext_sys_typ_nm_META,
			web_api_flg_META,
			cmd_exec_flg_META,
			real_imp_flg_META,
			not_send_upd_flg_META,
			not_dup_imp_flg_META,
			if_upd_typ_META,
			if_upd_typ_nm_META,
			dlv_slip_split_flg_META,
			null_val_if_flg_META,
			upri_not_chk_flg_META,
			amt_not_chk_flg_META,
			tax_not_chk_flg_META,
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
				{$ext_sys_typ, "MAC_EXT_SYS_TYP"},	// ext_sys_typ
				{$if_upd_typ, "MAC_IF_UPD_TYP"}	// if_upd_typ
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
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 1, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 1, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm_lcl() {
		return getConstString(offset + 2, $ext_sys_nm_lcl);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm_lcl(String value) {
		setConstString(offset + 2, $ext_sys_nm_lcl, value);
	}


	/**
	 * Standard external system name 標準外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 3, $ext_sys_nm);
	}

	/**
	 * Standard external system name 標準外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 3, $ext_sys_nm, value);
	}


	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public String ext_sys_typ() {
		return getConstString(offset + 4, $ext_sys_typ);
	}

	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public void ext_sys_typ(String value) {
		setConstString(offset + 4, $ext_sys_typ, value);
	}


	/**
	 * External system type name 外部システム区分名.<p>
	 *
	 */
	public String ext_sys_typ_nm() {
		return getConstString(offset + 5, $ext_sys_typ_nm);
	}

	/**
	 * External system type name 外部システム区分名.<p>
	 *
	 */
	public void ext_sys_typ_nm(String value) {
		setConstString(offset + 5, $ext_sys_typ_nm, value);
	}


	/**
	 * Web API Ｗｅｂ　ＡＰＩ.<p>
	 *
	 */
	public boolean web_api_flg() {
		return getConstBoolean(offset + 6, $web_api_flg);
	}

	/**
	 * Web API Ｗｅｂ　ＡＰＩ.<p>
	 *
	 */
	public void web_api_flg(boolean value) {
		setConstBoolean(offset + 6, $web_api_flg, value);
	}


	/**
	 * Command execution コマンド実行.<p>
	 *
	 */
	public boolean cmd_exec_flg() {
		return getConstBoolean(offset + 7, $cmd_exec_flg);
	}

	/**
	 * Command execution コマンド実行.<p>
	 *
	 */
	public void cmd_exec_flg(boolean value) {
		setConstBoolean(offset + 7, $cmd_exec_flg, value);
	}


	/**
	 * Real time import リアルタイム取込.<p>
	 *
	 */
	public boolean real_imp_flg() {
		return getConstBoolean(offset + 8, $real_imp_flg);
	}

	/**
	 * Real time import リアルタイム取込.<p>
	 *
	 */
	public void real_imp_flg(boolean value) {
		setConstBoolean(offset + 8, $real_imp_flg, value);
	}


	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public boolean not_send_upd_flg() {
		return getConstBoolean(offset + 9, $not_send_upd_flg);
	}

	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public void not_send_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $not_send_upd_flg, value);
	}


	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public boolean not_dup_imp_flg() {
		return getConstBoolean(offset + 10, $not_dup_imp_flg);
	}

	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public void not_dup_imp_flg(boolean value) {
		setConstBoolean(offset + 10, $not_dup_imp_flg, value);
	}


	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public String if_upd_typ() {
		return getConstString(offset + 11, $if_upd_typ);
	}

	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public void if_upd_typ(String value) {
		setConstString(offset + 11, $if_upd_typ, value);
	}


	/**
	 * IF update type name ＩＦ更新区分名.<p>
	 *
	 */
	public String if_upd_typ_nm() {
		return getConstString(offset + 12, $if_upd_typ_nm);
	}

	/**
	 * IF update type name ＩＦ更新区分名.<p>
	 *
	 */
	public void if_upd_typ_nm(String value) {
		setConstString(offset + 12, $if_upd_typ_nm, value);
	}


	/**
	 * Delivery note unit split 納品書単位分割.<p>
	 *
	 */
	public boolean dlv_slip_split_flg() {
		return getConstBoolean(offset + 13, $dlv_slip_split_flg);
	}

	/**
	 * Delivery note unit split 納品書単位分割.<p>
	 *
	 */
	public void dlv_slip_split_flg(boolean value) {
		setConstBoolean(offset + 13, $dlv_slip_split_flg, value);
	}


	/**
	 * NULL character IF ＮＵＬＬ文字ＩＦ.<p>
	 *
	 */
	public boolean null_val_if_flg() {
		return getConstBoolean(offset + 14, $null_val_if_flg);
	}

	/**
	 * NULL character IF ＮＵＬＬ文字ＩＦ.<p>
	 *
	 */
	public void null_val_if_flg(boolean value) {
		setConstBoolean(offset + 14, $null_val_if_flg, value);
	}


	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public boolean upri_not_chk_flg() {
		return getConstBoolean(offset + 15, $upri_not_chk_flg);
	}

	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public void upri_not_chk_flg(boolean value) {
		setConstBoolean(offset + 15, $upri_not_chk_flg, value);
	}


	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public boolean amt_not_chk_flg() {
		return getConstBoolean(offset + 16, $amt_not_chk_flg);
	}

	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public void amt_not_chk_flg(boolean value) {
		setConstBoolean(offset + 16, $amt_not_chk_flg, value);
	}


	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public boolean tax_not_chk_flg() {
		return getConstBoolean(offset + 17, $tax_not_chk_flg);
	}

	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public void tax_not_chk_flg(boolean value) {
		setConstBoolean(offset + 17, $tax_not_chk_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 18, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 18, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 19, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 19, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 20, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 20, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 21, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 21, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 22, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 22, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 23, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 24, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 24, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 25, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 25, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 26, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 27, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 27, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 28, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 28, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 29, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 30, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 30, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 31, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 31, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 32, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 32, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 33, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 33, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 34, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 34, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 35, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $del_ts, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm_lcl.equalsIgnoreCase(name)) {
			return ext_sys_nm_lcl();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			return ext_sys_typ();
		}
		if ($ext_sys_typ_nm.equalsIgnoreCase(name)) {
			return ext_sys_typ_nm();
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
		}
		if ($if_upd_typ_nm.equalsIgnoreCase(name)) {
			return if_upd_typ_nm();
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			return web_api_flg();
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			return cmd_exec_flg();
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			return real_imp_flg();
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			return not_dup_imp_flg();
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			return dlv_slip_split_flg();
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			return null_val_if_flg();
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			return upri_not_chk_flg();
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			return amt_not_chk_flg();
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			return tax_not_chk_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm_lcl.equalsIgnoreCase(name)) {
			return ext_sys_nm_lcl();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			return ext_sys_typ();
		}
		if ($ext_sys_typ_nm.equalsIgnoreCase(name)) {
			return ext_sys_typ_nm();
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			return if_upd_typ();
		}
		if ($if_upd_typ_nm.equalsIgnoreCase(name)) {
			return if_upd_typ_nm();
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			return web_api_flg();
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			return cmd_exec_flg();
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			return real_imp_flg();
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			return not_send_upd_flg();
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			return not_dup_imp_flg();
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			return dlv_slip_split_flg();
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			return null_val_if_flg();
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			return upri_not_chk_flg();
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			return amt_not_chk_flg();
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			return tax_not_chk_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm_lcl.equalsIgnoreCase(name)) {
			ext_sys_nm_lcl(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			ext_sys_typ(value);
			return;
		}
		if ($ext_sys_typ_nm.equalsIgnoreCase(name)) {
			ext_sys_typ_nm(value);
			return;
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			if_upd_typ(value);
			return;
		}
		if ($if_upd_typ_nm.equalsIgnoreCase(name)) {
			if_upd_typ_nm(value);
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			web_api_flg(value);
			return;
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			cmd_exec_flg(value);
			return;
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			real_imp_flg(value);
			return;
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			not_dup_imp_flg(value);
			return;
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			dlv_slip_split_flg(value);
			return;
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			null_val_if_flg(value);
			return;
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			upri_not_chk_flg(value);
			return;
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			amt_not_chk_flg(value);
			return;
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			tax_not_chk_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm_lcl.equalsIgnoreCase(name)) {
			ext_sys_nm_lcl(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_sys_typ.equalsIgnoreCase(name)) {
			ext_sys_typ(value);
			return;
		}
		if ($ext_sys_typ_nm.equalsIgnoreCase(name)) {
			ext_sys_typ_nm(value);
			return;
		}
		if ($if_upd_typ.equalsIgnoreCase(name)) {
			if_upd_typ(value);
			return;
		}
		if ($if_upd_typ_nm.equalsIgnoreCase(name)) {
			if_upd_typ_nm(value);
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
		if ($web_api_flg.equalsIgnoreCase(name)) {
			web_api_flg(value);
			return;
		}
		if ($cmd_exec_flg.equalsIgnoreCase(name)) {
			cmd_exec_flg(value);
			return;
		}
		if ($real_imp_flg.equalsIgnoreCase(name)) {
			real_imp_flg(value);
			return;
		}
		if ($not_send_upd_flg.equalsIgnoreCase(name)) {
			not_send_upd_flg(value);
			return;
		}
		if ($not_dup_imp_flg.equalsIgnoreCase(name)) {
			not_dup_imp_flg(value);
			return;
		}
		if ($dlv_slip_split_flg.equalsIgnoreCase(name)) {
			dlv_slip_split_flg(value);
			return;
		}
		if ($null_val_if_flg.equalsIgnoreCase(name)) {
			null_val_if_flg(value);
			return;
		}
		if ($upri_not_chk_flg.equalsIgnoreCase(name)) {
			upri_not_chk_flg(value);
			return;
		}
		if ($amt_not_chk_flg.equalsIgnoreCase(name)) {
			amt_not_chk_flg(value);
			return;
		}
		if ($tax_not_chk_flg.equalsIgnoreCase(name)) {
			tax_not_chk_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

