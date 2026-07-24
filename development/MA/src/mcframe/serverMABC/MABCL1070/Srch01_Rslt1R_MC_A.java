package mcframe.serverMABC.MABCL1070;

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
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public static final String $ac_slip_typ_nm = "ac_slip_typ_nm";
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public static final String $auto_jnl_key_cd = "auto_jnl_key_cd";
	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public static final String $auto_jnl_key_nm = "auto_jnl_key_nm";
	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public static final String $auto_jnl_grp = "auto_jnl_grp";
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public static final String $jnl_ptn_nm = "jnl_ptn_nm";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public static final String $ac_if_typ = "ac_if_typ";
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public static final String $ac_if_typ_nm = "ac_if_typ_nm";
	/**
	 * Slip ID type 伝票ＩＤ区分.<p>
	 *
	 */
	public static final String $id_typ = "id_typ";
	/**
	 * Slip ID type name 伝票ＩＤ区分名.<p>
	 *
	 */
	public static final String $id_typ_nm = "id_typ_nm";
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public static final String $slip_cnt_id = "slip_cnt_id";
	/**
	 * Standard evaluation rounding type 標準評価端数処理区分.<p>
	 *
	 */
	public static final String $std_rnd_typ = "std_rnd_typ";
	/**
	 * Standard evaluation rounding type name 標準評価端数処理区分名.<p>
	 *
	 */
	public static final String $std_rnd_typ_nm = "std_rnd_typ_nm";
	/**
	 * Closing entry type 決算仕訳区分.<p>
	 *
	 */
	public static final String $cls_jnl_typ = "cls_jnl_typ";
	/**
	 * Closing entry type name 決算仕訳区分名.<p>
	 *
	 */
	public static final String $cls_jnl_typ_nm = "cls_jnl_typ_nm";
	/**
	 * Compound journal type 複合仕訳区分.<p>
	 *
	 */
	public static final String $compound_jnl_typ = "compound_jnl_typ";
	/**
	 * Compound journal type name 複合仕訳区分名.<p>
	 *
	 */
	public static final String $compound_jnl_typ_nm = "compound_jnl_typ_nm";
	/**
	 * Allocation journal 配賦仕訳.<p>
	 *
	 */
	public static final String $alloc_jnl_flg = "alloc_jnl_flg";
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";
	/**
	 * Debit credit reverse 貸借逆転.<p>
	 *
	 */
	public static final String $rev_flg = "rev_flg";
	/**
	 * Reverse minus マイナス逆転.<p>
	 *
	 */
	public static final String $minus_rev_flg = "minus_rev_flg";
	/**
	 * Default デフォルト.<p>
	 *
	 */
	public static final String $default_flg = "default_flg";
	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public static final String $abs_typ = "abs_typ";
	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public static final String $abs_typ_nm = "abs_typ_nm";
	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public static final String $abstract1 = "abstract1";
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
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta auto_jnl_key_cd_META = createCommonMeta($auto_jnl_key_cd, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_CD);
	public static final MCMeta auto_jnl_key_nm_META = createCommonMeta($auto_jnl_key_nm, mcframe.commonMA.meta.MA_META.AUTO_JNL_KEY_NM);
	public static final MCMeta auto_jnl_grp_META = createCommonMeta($auto_jnl_grp, mcframe.commonMA.meta.MA_META.AUTO_JNL_GRP);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta jnl_ptn_nm_META = createCommonMeta($jnl_ptn_nm, mcframe.commonMA.meta.MA_META.JNL_PTN_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ac_if_typ_META = createCommonMeta($ac_if_typ, mcframe.commonMA.meta.MA_META.AC_IF_TYP);
	public static final MCMeta ac_if_typ_nm_META = createCommonMeta($ac_if_typ_nm, mcframe.commonMA.meta.MA_META.AC_IF_TYP_NM);
	public static final MCMeta id_typ_META = createCommonMeta($id_typ, mcframe.commonMA.meta.MA_META.ID_TYP);
	public static final MCMeta id_typ_nm_META = createCommonMeta($id_typ_nm, mcframe.commonMA.meta.MA_META.ID_TYP_NM);
	public static final MCMeta slip_cnt_id_META = createCommonMeta($slip_cnt_id, mcframe.commonMA.meta.MA_META.SLIP_CNT_ID);
	public static final MCMeta std_rnd_typ_META = createCommonMeta($std_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta std_rnd_typ_nm_META = createCommonMeta($std_rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta cls_jnl_typ_META = createCommonMeta($cls_jnl_typ, mcframe.commonMA.meta.MA_META.CLS_JNL_TYP);
	public static final MCMeta cls_jnl_typ_nm_META = createCommonMeta($cls_jnl_typ_nm, mcframe.commonMA.meta.MA_META.CLS_JNL_TYP_NM);
	public static final MCMeta compound_jnl_typ_META = createCommonMeta($compound_jnl_typ, mcframe.commonMA.meta.MA_META.COMPOUND_JNL_TYP);
	public static final MCMeta compound_jnl_typ_nm_META = createCommonMeta($compound_jnl_typ_nm, mcframe.commonMA.meta.MA_META.COMPOUND_JNL_TYP_NM);
	public static final MCMeta alloc_jnl_flg_META = createCommonMeta($alloc_jnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rev_flg_META = createCommonMeta($rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta minus_rev_flg_META = createCommonMeta($minus_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta default_flg_META = createCommonMeta($default_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abs_typ_META = createCommonMeta($abs_typ, mcframe.commonMA.meta.MA_META.ABS_TYP);
	public static final MCMeta abs_typ_nm_META = createCommonMeta($abs_typ_nm, mcframe.commonMA.meta.MA_META.ABS_TYP_NM);
	public static final MCMeta abstract1_META = createCommonMeta($abstract1, mcframe.commonMA.meta.MA_META.ABSTRACT_M);
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
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			auto_jnl_key_cd_META,
			auto_jnl_key_nm_META,
			auto_jnl_grp_META,
			jnl_ptn_cd_META,
			jnl_ptn_nm_META,
			st_dt_META,
			end_dt_META,
			prio_META,
			ac_if_typ_META,
			ac_if_typ_nm_META,
			id_typ_META,
			id_typ_nm_META,
			slip_cnt_id_META,
			std_rnd_typ_META,
			std_rnd_typ_nm_META,
			cls_jnl_typ_META,
			cls_jnl_typ_nm_META,
			compound_jnl_typ_META,
			compound_jnl_typ_nm_META,
			alloc_jnl_flg_META,
			minus_flg_META,
			rev_flg_META,
			minus_rev_flg_META,
			default_flg_META,
			abs_typ_META,
			abs_typ_nm_META,
			abstract1_META,
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
				{$ac_slip_typ, "MAC_AC_SLIP_TYP"},	// ac_slip_typ
				{$ac_if_typ, "MAC_AC_IF_TYP"},	// ac_if_typ
				{$id_typ, "MAC_ID_TYP"},	// id_typ
				{$std_rnd_typ, "MAC_RND_TYP"},	// std_rnd_typ
				{$cls_jnl_typ, "MAC_CLS_JNL_TYP"},	// cls_jnl_typ
				{$compound_jnl_typ, "MAC_COMPOUND_JNL_TYP"},	// compound_jnl_typ
				{$abs_typ, "MAC_ABS_TYP"}	// abs_typ
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
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 1, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 1, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 2, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 2, $ac_slip_typ_nm, value);
	}


	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public String auto_jnl_key_cd() {
		return getConstString(offset + 3, $auto_jnl_key_cd);
	}

	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public void auto_jnl_key_cd(String value) {
		setConstString(offset + 3, $auto_jnl_key_cd, value);
	}


	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public String auto_jnl_key_nm() {
		return getConstString(offset + 4, $auto_jnl_key_nm);
	}

	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public void auto_jnl_key_nm(String value) {
		setConstString(offset + 4, $auto_jnl_key_nm, value);
	}


	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public String auto_jnl_grp() {
		return getConstString(offset + 5, $auto_jnl_grp);
	}

	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public void auto_jnl_grp(String value) {
		setConstString(offset + 5, $auto_jnl_grp, value);
	}


	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 6, $jnl_ptn_cd);
	}

	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 6, $jnl_ptn_cd, value);
	}


	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public String jnl_ptn_nm() {
		return getConstString(offset + 7, $jnl_ptn_nm);
	}

	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public void jnl_ptn_nm(String value) {
		setConstString(offset + 7, $jnl_ptn_nm, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 8, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 8, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 9, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 9, $end_dt, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 10, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 10, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 10, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 10, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 10, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 10, $prio, value);
	}


	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public String ac_if_typ() {
		return getConstString(offset + 11, $ac_if_typ);
	}

	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public void ac_if_typ(String value) {
		setConstString(offset + 11, $ac_if_typ, value);
	}


	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public String ac_if_typ_nm() {
		return getConstString(offset + 12, $ac_if_typ_nm);
	}

	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public void ac_if_typ_nm(String value) {
		setConstString(offset + 12, $ac_if_typ_nm, value);
	}


	/**
	 * Slip ID type 伝票ＩＤ区分.<p>
	 *
	 */
	public String id_typ() {
		return getConstString(offset + 13, $id_typ);
	}

	/**
	 * Slip ID type 伝票ＩＤ区分.<p>
	 *
	 */
	public void id_typ(String value) {
		setConstString(offset + 13, $id_typ, value);
	}


	/**
	 * Slip ID type name 伝票ＩＤ区分名.<p>
	 *
	 */
	public String id_typ_nm() {
		return getConstString(offset + 14, $id_typ_nm);
	}

	/**
	 * Slip ID type name 伝票ＩＤ区分名.<p>
	 *
	 */
	public void id_typ_nm(String value) {
		setConstString(offset + 14, $id_typ_nm, value);
	}


	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public String slip_cnt_id() {
		return getConstString(offset + 15, $slip_cnt_id);
	}

	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public void slip_cnt_id(String value) {
		setConstString(offset + 15, $slip_cnt_id, value);
	}


	/**
	 * Standard evaluation rounding type 標準評価端数処理区分.<p>
	 *
	 */
	public String std_rnd_typ() {
		return getConstString(offset + 16, $std_rnd_typ);
	}

	/**
	 * Standard evaluation rounding type 標準評価端数処理区分.<p>
	 *
	 */
	public void std_rnd_typ(String value) {
		setConstString(offset + 16, $std_rnd_typ, value);
	}


	/**
	 * Standard evaluation rounding type name 標準評価端数処理区分名.<p>
	 *
	 */
	public String std_rnd_typ_nm() {
		return getConstString(offset + 17, $std_rnd_typ_nm);
	}

	/**
	 * Standard evaluation rounding type name 標準評価端数処理区分名.<p>
	 *
	 */
	public void std_rnd_typ_nm(String value) {
		setConstString(offset + 17, $std_rnd_typ_nm, value);
	}


	/**
	 * Closing entry type 決算仕訳区分.<p>
	 *
	 */
	public String cls_jnl_typ() {
		return getConstString(offset + 18, $cls_jnl_typ);
	}

	/**
	 * Closing entry type 決算仕訳区分.<p>
	 *
	 */
	public void cls_jnl_typ(String value) {
		setConstString(offset + 18, $cls_jnl_typ, value);
	}


	/**
	 * Closing entry type name 決算仕訳区分名.<p>
	 *
	 */
	public String cls_jnl_typ_nm() {
		return getConstString(offset + 19, $cls_jnl_typ_nm);
	}

	/**
	 * Closing entry type name 決算仕訳区分名.<p>
	 *
	 */
	public void cls_jnl_typ_nm(String value) {
		setConstString(offset + 19, $cls_jnl_typ_nm, value);
	}


	/**
	 * Compound journal type 複合仕訳区分.<p>
	 *
	 */
	public String compound_jnl_typ() {
		return getConstString(offset + 20, $compound_jnl_typ);
	}

	/**
	 * Compound journal type 複合仕訳区分.<p>
	 *
	 */
	public void compound_jnl_typ(String value) {
		setConstString(offset + 20, $compound_jnl_typ, value);
	}


	/**
	 * Compound journal type name 複合仕訳区分名.<p>
	 *
	 */
	public String compound_jnl_typ_nm() {
		return getConstString(offset + 21, $compound_jnl_typ_nm);
	}

	/**
	 * Compound journal type name 複合仕訳区分名.<p>
	 *
	 */
	public void compound_jnl_typ_nm(String value) {
		setConstString(offset + 21, $compound_jnl_typ_nm, value);
	}


	/**
	 * Allocation journal 配賦仕訳.<p>
	 *
	 */
	public boolean alloc_jnl_flg() {
		return getConstBoolean(offset + 22, $alloc_jnl_flg);
	}

	/**
	 * Allocation journal 配賦仕訳.<p>
	 *
	 */
	public void alloc_jnl_flg(boolean value) {
		setConstBoolean(offset + 22, $alloc_jnl_flg, value);
	}


	/**
	 * Minus マイナス.<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 23, $minus_flg);
	}

	/**
	 * Minus マイナス.<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 23, $minus_flg, value);
	}


	/**
	 * Debit credit reverse 貸借逆転.<p>
	 *
	 */
	public boolean rev_flg() {
		return getConstBoolean(offset + 24, $rev_flg);
	}

	/**
	 * Debit credit reverse 貸借逆転.<p>
	 *
	 */
	public void rev_flg(boolean value) {
		setConstBoolean(offset + 24, $rev_flg, value);
	}


	/**
	 * Reverse minus マイナス逆転.<p>
	 *
	 */
	public boolean minus_rev_flg() {
		return getConstBoolean(offset + 25, $minus_rev_flg);
	}

	/**
	 * Reverse minus マイナス逆転.<p>
	 *
	 */
	public void minus_rev_flg(boolean value) {
		setConstBoolean(offset + 25, $minus_rev_flg, value);
	}


	/**
	 * Default デフォルト.<p>
	 *
	 */
	public boolean default_flg() {
		return getConstBoolean(offset + 26, $default_flg);
	}

	/**
	 * Default デフォルト.<p>
	 *
	 */
	public void default_flg(boolean value) {
		setConstBoolean(offset + 26, $default_flg, value);
	}


	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public String abs_typ() {
		return getConstString(offset + 27, $abs_typ);
	}

	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public void abs_typ(String value) {
		setConstString(offset + 27, $abs_typ, value);
	}


	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public String abs_typ_nm() {
		return getConstString(offset + 28, $abs_typ_nm);
	}

	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public void abs_typ_nm(String value) {
		setConstString(offset + 28, $abs_typ_nm, value);
	}


	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public String abstract1() {
		return getConstString(offset + 29, $abstract1);
	}

	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public void abstract1(String value) {
		setConstString(offset + 29, $abstract1, value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			return auto_jnl_grp();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			return ac_if_typ_nm();
		}
		if ($id_typ.equalsIgnoreCase(name)) {
			return id_typ();
		}
		if ($id_typ_nm.equalsIgnoreCase(name)) {
			return id_typ_nm();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			return std_rnd_typ_nm();
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			return cls_jnl_typ();
		}
		if ($cls_jnl_typ_nm.equalsIgnoreCase(name)) {
			return cls_jnl_typ_nm();
		}
		if ($compound_jnl_typ.equalsIgnoreCase(name)) {
			return compound_jnl_typ();
		}
		if ($compound_jnl_typ_nm.equalsIgnoreCase(name)) {
			return compound_jnl_typ_nm();
		}
		if ($abs_typ.equalsIgnoreCase(name)) {
			return abs_typ();
		}
		if ($abs_typ_nm.equalsIgnoreCase(name)) {
			return abs_typ_nm();
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			return abstract1();
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
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			return alloc_jnl_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($rev_flg.equalsIgnoreCase(name)) {
			return rev_flg();
		}
		if ($minus_rev_flg.equalsIgnoreCase(name)) {
			return minus_rev_flg();
		}
		if ($default_flg.equalsIgnoreCase(name)) {
			return default_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			return auto_jnl_key_cd();
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			return auto_jnl_key_nm();
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			return auto_jnl_grp();
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			return ac_if_typ();
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			return ac_if_typ_nm();
		}
		if ($id_typ.equalsIgnoreCase(name)) {
			return id_typ();
		}
		if ($id_typ_nm.equalsIgnoreCase(name)) {
			return id_typ_nm();
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			return slip_cnt_id();
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			return std_rnd_typ();
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			return std_rnd_typ_nm();
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			return cls_jnl_typ();
		}
		if ($cls_jnl_typ_nm.equalsIgnoreCase(name)) {
			return cls_jnl_typ_nm();
		}
		if ($compound_jnl_typ.equalsIgnoreCase(name)) {
			return compound_jnl_typ();
		}
		if ($compound_jnl_typ_nm.equalsIgnoreCase(name)) {
			return compound_jnl_typ_nm();
		}
		if ($abs_typ.equalsIgnoreCase(name)) {
			return abs_typ();
		}
		if ($abs_typ_nm.equalsIgnoreCase(name)) {
			return abs_typ_nm();
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			return abstract1();
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
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			return alloc_jnl_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($rev_flg.equalsIgnoreCase(name)) {
			return rev_flg();
		}
		if ($minus_rev_flg.equalsIgnoreCase(name)) {
			return minus_rev_flg();
		}
		if ($default_flg.equalsIgnoreCase(name)) {
			return default_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
			return;
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			auto_jnl_grp(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			ac_if_typ_nm(value);
			return;
		}
		if ($id_typ.equalsIgnoreCase(name)) {
			id_typ(value);
			return;
		}
		if ($id_typ_nm.equalsIgnoreCase(name)) {
			id_typ_nm(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			std_rnd_typ_nm(value);
			return;
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			cls_jnl_typ(value);
			return;
		}
		if ($cls_jnl_typ_nm.equalsIgnoreCase(name)) {
			cls_jnl_typ_nm(value);
			return;
		}
		if ($compound_jnl_typ.equalsIgnoreCase(name)) {
			compound_jnl_typ(value);
			return;
		}
		if ($compound_jnl_typ_nm.equalsIgnoreCase(name)) {
			compound_jnl_typ_nm(value);
			return;
		}
		if ($abs_typ.equalsIgnoreCase(name)) {
			abs_typ(value);
			return;
		}
		if ($abs_typ_nm.equalsIgnoreCase(name)) {
			abs_typ_nm(value);
			return;
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			abstract1(value);
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
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
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
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			alloc_jnl_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($rev_flg.equalsIgnoreCase(name)) {
			rev_flg(value);
			return;
		}
		if ($minus_rev_flg.equalsIgnoreCase(name)) {
			minus_rev_flg(value);
			return;
		}
		if ($default_flg.equalsIgnoreCase(name)) {
			default_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($auto_jnl_key_cd.equalsIgnoreCase(name)) {
			auto_jnl_key_cd(value);
			return;
		}
		if ($auto_jnl_key_nm.equalsIgnoreCase(name)) {
			auto_jnl_key_nm(value);
			return;
		}
		if ($auto_jnl_grp.equalsIgnoreCase(name)) {
			auto_jnl_grp(value);
			return;
		}
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		if ($ac_if_typ.equalsIgnoreCase(name)) {
			ac_if_typ(value);
			return;
		}
		if ($ac_if_typ_nm.equalsIgnoreCase(name)) {
			ac_if_typ_nm(value);
			return;
		}
		if ($id_typ.equalsIgnoreCase(name)) {
			id_typ(value);
			return;
		}
		if ($id_typ_nm.equalsIgnoreCase(name)) {
			id_typ_nm(value);
			return;
		}
		if ($slip_cnt_id.equalsIgnoreCase(name)) {
			slip_cnt_id(value);
			return;
		}
		if ($std_rnd_typ.equalsIgnoreCase(name)) {
			std_rnd_typ(value);
			return;
		}
		if ($std_rnd_typ_nm.equalsIgnoreCase(name)) {
			std_rnd_typ_nm(value);
			return;
		}
		if ($cls_jnl_typ.equalsIgnoreCase(name)) {
			cls_jnl_typ(value);
			return;
		}
		if ($cls_jnl_typ_nm.equalsIgnoreCase(name)) {
			cls_jnl_typ_nm(value);
			return;
		}
		if ($compound_jnl_typ.equalsIgnoreCase(name)) {
			compound_jnl_typ(value);
			return;
		}
		if ($compound_jnl_typ_nm.equalsIgnoreCase(name)) {
			compound_jnl_typ_nm(value);
			return;
		}
		if ($abs_typ.equalsIgnoreCase(name)) {
			abs_typ(value);
			return;
		}
		if ($abs_typ_nm.equalsIgnoreCase(name)) {
			abs_typ_nm(value);
			return;
		}
		if ($abstract1.equalsIgnoreCase(name)) {
			abstract1(value);
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
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
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
		if ($alloc_jnl_flg.equalsIgnoreCase(name)) {
			alloc_jnl_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($rev_flg.equalsIgnoreCase(name)) {
			rev_flg(value);
			return;
		}
		if ($minus_rev_flg.equalsIgnoreCase(name)) {
			minus_rev_flg(value);
			return;
		}
		if ($default_flg.equalsIgnoreCase(name)) {
			default_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

