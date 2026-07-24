package mcframe.serverMBBB.MBBBL0110;

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
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Start date of the term 対象開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * End date of the term 対象終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public static final String $ac_slip_dt = "ac_slip_dt";
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public static final String $jnl_act_cd = "jnl_act_cd";
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public static final String $jnl_act_nm = "jnl_act_nm";
	/**
	 * Journal deleted 仕訳削除.<p>
	 *
	 */
	public static final String $jnl_del_flg = "jnl_del_flg";
	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public static final String $data_typ = "data_typ";
	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public static final String $data_typ_nm = "data_typ_nm";
	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public static final String $rerun_flg = "rerun_flg";
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public static final String $jnl_rmrks = "jnl_rmrks";
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_slip_dt_META = createCommonMeta($ac_slip_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta jnl_act_cd_META = createCommonMeta($jnl_act_cd, mcframe.commonMA.meta.MA_META.JNL_ACT_CD);
	public static final MCMeta jnl_act_nm_META = createCommonMeta($jnl_act_nm, mcframe.commonMA.meta.MA_META.JNL_ACT_NM);
	public static final MCMeta jnl_del_flg_META = createCommonMeta($jnl_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_typ_META = createCommonMeta($data_typ, mcframe.commonMA.meta.MA_META.DATA_TYP);
	public static final MCMeta data_typ_nm_META = createCommonMeta($data_typ_nm, mcframe.commonMA.meta.MA_META.DATA_TYP_NM);
	public static final MCMeta rerun_flg_META = createCommonMeta($rerun_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_rmrks_META = createCommonMeta($jnl_rmrks, mcframe.commonMA.meta.MA_META.JNL_RMRKS);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			jnl_grp_no_META,
			ac_ym_META,
			st_dt_META,
			end_dt_META,
			ac_slip_dt_META,
			jnl_act_cd_META,
			jnl_act_nm_META,
			jnl_del_flg_META,
			data_typ_META,
			data_typ_nm_META,
			rerun_flg_META,
			jnl_rmrks_META,
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
			upd_cntr_META
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
				{$data_typ, "MAC_DATA_TYP"}	// data_typ
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
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public String jnl_grp_no() {
		return getConstString(offset + 0, $jnl_grp_no);
	}

	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public void jnl_grp_no(String value) {
		setConstString(offset + 0, $jnl_grp_no, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 1, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 1, $ac_ym, value);
	}


	/**
	 * Start date of the term 対象開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 2, $st_dt);
	}

	/**
	 * Start date of the term 対象開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 2, $st_dt, value);
	}


	/**
	 * End date of the term 対象終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 3, $end_dt);
	}

	/**
	 * End date of the term 対象終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 3, $end_dt, value);
	}


	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public MCDate ac_slip_dt() {
		return getConstDate(offset + 4, $ac_slip_dt);
	}

	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public void ac_slip_dt(MCDate value) {
		setConstDate(offset + 4, $ac_slip_dt, value);
	}


	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public String jnl_act_cd() {
		return getConstString(offset + 5, $jnl_act_cd);
	}

	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public void jnl_act_cd(String value) {
		setConstString(offset + 5, $jnl_act_cd, value);
	}


	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public String jnl_act_nm() {
		return getConstString(offset + 6, $jnl_act_nm);
	}

	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public void jnl_act_nm(String value) {
		setConstString(offset + 6, $jnl_act_nm, value);
	}


	/**
	 * Journal deleted 仕訳削除.<p>
	 *
	 */
	public boolean jnl_del_flg() {
		return getConstBoolean(offset + 7, $jnl_del_flg);
	}

	/**
	 * Journal deleted 仕訳削除.<p>
	 *
	 */
	public void jnl_del_flg(boolean value) {
		setConstBoolean(offset + 7, $jnl_del_flg, value);
	}


	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public String data_typ() {
		return getConstString(offset + 8, $data_typ);
	}

	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public void data_typ(String value) {
		setConstString(offset + 8, $data_typ, value);
	}


	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public String data_typ_nm() {
		return getConstString(offset + 9, $data_typ_nm);
	}

	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public void data_typ_nm(String value) {
		setConstString(offset + 9, $data_typ_nm, value);
	}


	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public boolean rerun_flg() {
		return getConstBoolean(offset + 10, $rerun_flg);
	}

	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public void rerun_flg(boolean value) {
		setConstBoolean(offset + 10, $rerun_flg, value);
	}


	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public String jnl_rmrks() {
		return getConstString(offset + 11, $jnl_rmrks);
	}

	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public void jnl_rmrks(String value) {
		setConstString(offset + 11, $jnl_rmrks, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 12, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 12, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 13, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 13, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 14, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 14, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 15, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 15, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 16, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 16, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 17, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 17, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 18, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 18, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 19, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 19, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 20, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 20, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 21, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 21, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 22, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 22, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 23, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			return data_typ();
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			return data_typ_nm();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
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
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			return jnl_del_flg();
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			return jnl_act_cd();
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			return jnl_act_nm();
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			return data_typ();
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			return data_typ_nm();
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			return jnl_rmrks();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			return ac_slip_dt();
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
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			return jnl_del_flg();
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			return rerun_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			data_typ(value);
			return;
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			data_typ_nm(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
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
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
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
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			jnl_del_flg(value);
			return;
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($jnl_act_cd.equalsIgnoreCase(name)) {
			jnl_act_cd(value);
			return;
		}
		if ($jnl_act_nm.equalsIgnoreCase(name)) {
			jnl_act_nm(value);
			return;
		}
		if ($data_typ.equalsIgnoreCase(name)) {
			data_typ(value);
			return;
		}
		if ($data_typ_nm.equalsIgnoreCase(name)) {
			data_typ_nm(value);
			return;
		}
		if ($jnl_rmrks.equalsIgnoreCase(name)) {
			jnl_rmrks(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($ac_slip_dt.equalsIgnoreCase(name)) {
			ac_slip_dt(value);
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
		if ($jnl_del_flg.equalsIgnoreCase(name)) {
			jnl_del_flg(value);
			return;
		}
		if ($rerun_flg.equalsIgnoreCase(name)) {
			rerun_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

