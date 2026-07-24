package mcframe.clientMBBA.MBBAP0010;

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
 * ブロック"Dtl2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl2R_MC_A extends MCConstRow {

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public static final String $aprv_no_seq = "aprv_no_seq";
	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public static final String $aprv_seq = "aprv_seq";
	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 * Main PIC name 主担当者名.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	/**
	 * Main PIC E-mail 1 主担当者Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public static final String $email1 = "email1";
	/**
	 * Main PIC E-mail 2 主担当者Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public static final String $email2 = "email2";
	/**
	 * Main PIC E-mail 3 主担当者Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public static final String $email3 = "email3";
	/**
	 * Main PIC TEL 1 主担当者ＴＥＬ１.<p>
	 *
	 */
	public static final String $tel1 = "tel1";
	/**
	 * Main PIC TEL 2 主担当者ＴＥＬ２.<p>
	 *
	 */
	public static final String $tel2 = "tel2";
	/**
	 * Main PIC TEL 3 主担当者ＴＥＬ３.<p>
	 *
	 */
	public static final String $tel3 = "tel3";
	/**
	 * Main PIC image 主担当者画像.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public static final String $aprv_d_sts_typ = "aprv_d_sts_typ";
	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public static final String $aprv_d_sts_typ_nm = "aprv_d_sts_typ_nm";
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public static final String $aprv_d_tm = "aprv_d_tm";
	/**
	 * Alternate approval 代理承認.<p>
	 *
	 */
	public static final String $deputy_flg = "deputy_flg";
	/**
	 * Alternate approver cd. 代理承認者ＣＤ.<p>
	 *
	 */
	public static final String $deputy_usr_cd = "deputy_usr_cd";
	/**
	 * Alternate approver name 代理承認者名.<p>
	 *
	 */
	public static final String $deputy_usr_nm = "deputy_usr_nm";
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public static final String $aprv_role_nm = "aprv_role_nm";
	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public static final String $aprv_d_rmrks = "aprv_d_rmrks";
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


	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_seq_META = createCommonMeta($aprv_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta email1_META = createCommonMeta($email1, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email2_META = createCommonMeta($email2, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email3_META = createCommonMeta($email3, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta tel1_META = createCommonMeta($tel1, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel2_META = createCommonMeta($tel2, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel3_META = createCommonMeta($tel3, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta aprv_d_sts_typ_META = createCommonMeta($aprv_d_sts_typ, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP);
	public static final MCMeta aprv_d_sts_typ_nm_META = createCommonMeta($aprv_d_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP_NM);
	public static final MCMeta aprv_d_tm_META = createCommonMeta($aprv_d_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta deputy_flg_META = createCommonMeta($deputy_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta deputy_usr_cd_META = createCommonMeta($deputy_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta deputy_usr_nm_META = createCommonMeta($deputy_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm_META = createCommonMeta($aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_d_rmrks_META = createCommonMeta($aprv_d_rmrks, mcframe.commonMA.meta.MA_META.APRV_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR3);
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

	protected static final ConstMetaList<Dtl2R> constMetas = new ConstMetaList<Dtl2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aprv_no_META,
			aprv_no_seq_META,
			aprv_seq_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			email1_META,
			email2_META,
			email3_META,
			tel1_META,
			tel2_META,
			tel3_META,
			th_image_META,
			aprv_d_sts_typ_META,
			aprv_d_sts_typ_nm_META,
			aprv_d_tm_META,
			deputy_flg_META,
			deputy_usr_cd_META,
			deputy_usr_nm_META,
			aprv_role_cd_META,
			aprv_role_nm_META,
			aprv_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
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
	protected Dtl2R_MC_A(ConstMetaList<? extends Dtl2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R clone() {
		return (Dtl2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R createInstance() {
		return (Dtl2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl2R getValues(String... names) {
		return (Dtl2R) super.getValues(names);
	}



	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 0, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 0, $aprv_no, value);
	}


	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 1, $aprv_no_seq);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		setConstNumber(offset + 1, $aprv_no_seq, value);
	}


	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public MCNumber aprv_seq() {
		return getConstNumber(offset + 2, $aprv_seq);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(MCNumber value) {
		setConstNumber(offset + 2, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(int value) {
		setConstNumber(offset + 2, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(long value) {
		setConstNumber(offset + 2, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(float value) {
		setConstNumber(offset + 2, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(double value) {
		setConstNumber(offset + 2, $aprv_seq, value);
	}


	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 3, $aprv_usr_cd);
	}

	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 3, $aprv_usr_cd, value);
	}


	/**
	 * Main PIC name 主担当者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 4, $aprv_usr_nm);
	}

	/**
	 * Main PIC name 主担当者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 4, $aprv_usr_nm, value);
	}


	/**
	 * Main PIC E-mail 1 主担当者Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public String email1() {
		return getConstString(offset + 5, $email1);
	}

	/**
	 * Main PIC E-mail 1 主担当者Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public void email1(String value) {
		setConstString(offset + 5, $email1, value);
	}


	/**
	 * Main PIC E-mail 2 主担当者Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public String email2() {
		return getConstString(offset + 6, $email2);
	}

	/**
	 * Main PIC E-mail 2 主担当者Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public void email2(String value) {
		setConstString(offset + 6, $email2, value);
	}


	/**
	 * Main PIC E-mail 3 主担当者Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public String email3() {
		return getConstString(offset + 7, $email3);
	}

	/**
	 * Main PIC E-mail 3 主担当者Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public void email3(String value) {
		setConstString(offset + 7, $email3, value);
	}


	/**
	 * Main PIC TEL 1 主担当者ＴＥＬ１.<p>
	 *
	 */
	public String tel1() {
		return getConstString(offset + 8, $tel1);
	}

	/**
	 * Main PIC TEL 1 主担当者ＴＥＬ１.<p>
	 *
	 */
	public void tel1(String value) {
		setConstString(offset + 8, $tel1, value);
	}


	/**
	 * Main PIC TEL 2 主担当者ＴＥＬ２.<p>
	 *
	 */
	public String tel2() {
		return getConstString(offset + 9, $tel2);
	}

	/**
	 * Main PIC TEL 2 主担当者ＴＥＬ２.<p>
	 *
	 */
	public void tel2(String value) {
		setConstString(offset + 9, $tel2, value);
	}


	/**
	 * Main PIC TEL 3 主担当者ＴＥＬ３.<p>
	 *
	 */
	public String tel3() {
		return getConstString(offset + 10, $tel3);
	}

	/**
	 * Main PIC TEL 3 主担当者ＴＥＬ３.<p>
	 *
	 */
	public void tel3(String value) {
		setConstString(offset + 10, $tel3, value);
	}


	/**
	 * Main PIC image 主担当者画像.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 11, $th_image);
	}

	/**
	 * Main PIC image 主担当者画像.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 11, $th_image, value);
	}


	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public String aprv_d_sts_typ() {
		return getConstString(offset + 12, $aprv_d_sts_typ);
	}

	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public void aprv_d_sts_typ(String value) {
		setConstString(offset + 12, $aprv_d_sts_typ, value);
	}


	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public String aprv_d_sts_typ_nm() {
		return getConstString(offset + 13, $aprv_d_sts_typ_nm);
	}

	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public void aprv_d_sts_typ_nm(String value) {
		setConstString(offset + 13, $aprv_d_sts_typ_nm, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_d_tm() {
		return getConstDate(offset + 14, $aprv_d_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_d_tm(MCDate value) {
		setConstDate(offset + 14, $aprv_d_tm, value);
	}


	/**
	 * Alternate approval 代理承認.<p>
	 *
	 */
	public boolean deputy_flg() {
		return getConstBoolean(offset + 15, $deputy_flg);
	}

	/**
	 * Alternate approval 代理承認.<p>
	 *
	 */
	public void deputy_flg(boolean value) {
		setConstBoolean(offset + 15, $deputy_flg, value);
	}


	/**
	 * Alternate approver cd. 代理承認者ＣＤ.<p>
	 *
	 */
	public String deputy_usr_cd() {
		return getConstString(offset + 16, $deputy_usr_cd);
	}

	/**
	 * Alternate approver cd. 代理承認者ＣＤ.<p>
	 *
	 */
	public void deputy_usr_cd(String value) {
		setConstString(offset + 16, $deputy_usr_cd, value);
	}


	/**
	 * Alternate approver name 代理承認者名.<p>
	 *
	 */
	public String deputy_usr_nm() {
		return getConstString(offset + 17, $deputy_usr_nm);
	}

	/**
	 * Alternate approver name 代理承認者名.<p>
	 *
	 */
	public void deputy_usr_nm(String value) {
		setConstString(offset + 17, $deputy_usr_nm, value);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 18, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 18, $aprv_role_cd, value);
	}


	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public String aprv_role_nm() {
		return getConstString(offset + 19, $aprv_role_nm);
	}

	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public void aprv_role_nm(String value) {
		setConstString(offset + 19, $aprv_role_nm, value);
	}


	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public String aprv_d_rmrks() {
		return getConstString(offset + 20, $aprv_d_rmrks);
	}

	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public void aprv_d_rmrks(String value) {
		setConstString(offset + 20, $aprv_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 21, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 21, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 22, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 22, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 23, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 23, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 24, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
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
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
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
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 29, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
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
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
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


	public String getString(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($email1.equalsIgnoreCase(name)) {
			return email1();
		}
		if ($email2.equalsIgnoreCase(name)) {
			return email2();
		}
		if ($email3.equalsIgnoreCase(name)) {
			return email3();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($tel3.equalsIgnoreCase(name)) {
			return tel3();
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ();
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ_nm();
		}
		if ($deputy_usr_cd.equalsIgnoreCase(name)) {
			return deputy_usr_cd();
		}
		if ($deputy_usr_nm.equalsIgnoreCase(name)) {
			return deputy_usr_nm();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			return aprv_d_rmrks();
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			return aprv_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($aprv_d_tm.equalsIgnoreCase(name)) {
			return aprv_d_tm();
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
		if ($deputy_flg.equalsIgnoreCase(name)) {
			return deputy_flg();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($email1.equalsIgnoreCase(name)) {
			return email1();
		}
		if ($email2.equalsIgnoreCase(name)) {
			return email2();
		}
		if ($email3.equalsIgnoreCase(name)) {
			return email3();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($tel3.equalsIgnoreCase(name)) {
			return tel3();
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ();
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ_nm();
		}
		if ($deputy_usr_cd.equalsIgnoreCase(name)) {
			return deputy_usr_cd();
		}
		if ($deputy_usr_nm.equalsIgnoreCase(name)) {
			return deputy_usr_nm();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			return aprv_d_rmrks();
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			return aprv_no_seq();
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			return aprv_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($aprv_d_tm.equalsIgnoreCase(name)) {
			return aprv_d_tm();
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
		if ($deputy_flg.equalsIgnoreCase(name)) {
			return deputy_flg();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($email1.equalsIgnoreCase(name)) {
			email1(value);
			return;
		}
		if ($email2.equalsIgnoreCase(name)) {
			email2(value);
			return;
		}
		if ($email3.equalsIgnoreCase(name)) {
			email3(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($tel3.equalsIgnoreCase(name)) {
			tel3(value);
			return;
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			aprv_d_sts_typ(value);
			return;
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_d_sts_typ_nm(value);
			return;
		}
		if ($deputy_usr_cd.equalsIgnoreCase(name)) {
			deputy_usr_cd(value);
			return;
		}
		if ($deputy_usr_nm.equalsIgnoreCase(name)) {
			deputy_usr_nm(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			aprv_d_rmrks(value);
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($aprv_d_tm.equalsIgnoreCase(name)) {
			aprv_d_tm(value);
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
		if ($deputy_flg.equalsIgnoreCase(name)) {
			deputy_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($email1.equalsIgnoreCase(name)) {
			email1(value);
			return;
		}
		if ($email2.equalsIgnoreCase(name)) {
			email2(value);
			return;
		}
		if ($email3.equalsIgnoreCase(name)) {
			email3(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($tel3.equalsIgnoreCase(name)) {
			tel3(value);
			return;
		}
		if ($aprv_d_sts_typ.equalsIgnoreCase(name)) {
			aprv_d_sts_typ(value);
			return;
		}
		if ($aprv_d_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_d_sts_typ_nm(value);
			return;
		}
		if ($deputy_usr_cd.equalsIgnoreCase(name)) {
			deputy_usr_cd(value);
			return;
		}
		if ($deputy_usr_nm.equalsIgnoreCase(name)) {
			deputy_usr_nm(value);
			return;
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
			return;
		}
		if ($aprv_d_rmrks.equalsIgnoreCase(name)) {
			aprv_d_rmrks(value);
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
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($aprv_no_seq.equalsIgnoreCase(name)) {
			aprv_no_seq(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($aprv_d_tm.equalsIgnoreCase(name)) {
			aprv_d_tm(value);
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
		if ($deputy_flg.equalsIgnoreCase(name)) {
			deputy_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

