package mcframe.serverMBBA.MBBAL5030;

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
 * ブロック"Aprv_Srch02_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Aprv_Srch02_Dtl1R_MC_A extends MCConstRow {

	public static final String $hdr = "hdr";
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
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public static final String $aprv_seq = "aprv_seq";
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
	 * Alternate approval flg. 代理承認ＦＬＧ.<p>
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
	 * Entry user ID (Details) 登録ユーザＩＤ（明細）.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name (Details) 登録ユーザ名（明細）.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time (Details) 登録日時（明細）.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID (Details) 登録機能ＩＤ（明細）.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name (Details) 登録機能名（明細）.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID (Details) 更新ユーザＩＤ（明細）.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name (Details) 更新ユーザ名（明細）.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time (Details) 更新日時（明細）.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID (Details) 更新機能ＩＤ（明細）.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name (Details) 更新機能名（明細）.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. (Details) 更新リクエストＮＯ（明細）.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * E-mail 1 Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public static final String $email1 = "email1";
	/**
	 * E-mail 2 Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public static final String $email2 = "email2";
	/**
	 * E-mail 3 Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public static final String $email3 = "email3";
	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public static final String $tel1 = "tel1";
	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public static final String $tel2 = "tel2";
	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public static final String $tel3 = "tel3";
	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public static final String $th_image = "th_image";

	public static final String $aprv_no = $hdr + ".aprv_no";
	public static final String $aprv_no_seq = $hdr + ".aprv_no_seq";
	public static final String $aprv_sts_typ = $hdr + ".aprv_sts_typ";
	public static final String $aprv_sts_typ_nm = $hdr + ".aprv_sts_typ_nm";
	public static final String $last_aprv_usr_cd = $hdr + ".last_aprv_usr_cd";
	public static final String $last_aprv_usr_nm = $hdr + ".last_aprv_usr_nm";
	public static final String $last_aprv_tm = $hdr + ".last_aprv_tm";
	public static final String $ins_dt = $hdr + ".ins_dt";
	public static final String $biz_usr_cd = $hdr + ".biz_usr_cd";
	public static final String $biz_usr_nm = $hdr + ".biz_usr_nm";
	public static final String $src_ins_usr_cd = $hdr + ".src_ins_usr_cd";
	public static final String $src_ins_usr_nm = $hdr + ".src_ins_usr_nm";
	public static final String $aprv_func_typ = $hdr + ".aprv_func_typ";
	public static final String $aprv_func_typ_nm = $hdr + ".aprv_func_typ_nm";
	public static final String $src_itm_cd = $hdr + ".src_itm_cd";
	public static final String $src_itm_sub1 = $hdr + ".src_itm_sub1";
	public static final String $src_itm_sub2 = $hdr + ".src_itm_sub2";
	public static final String $src_itm_sub3 = $hdr + ".src_itm_sub3";
	public static final String $src_itm_nm = $hdr + ".src_itm_nm";
	public static final String $src_dpt_cd = $hdr + ".src_dpt_cd";
	public static final String $src_dpt_nm = $hdr + ".src_dpt_nm";
	public static final String $src_bp_cd = $hdr + ".src_bp_cd";
	public static final String $src_bp_nm = $hdr + ".src_bp_nm";
	public static final String $src_cur_cd1 = $hdr + ".src_cur_cd1";
	public static final String $src_cur_nm1 = $hdr + ".src_cur_nm1";
	public static final String $src_amt1 = $hdr + ".src_amt1";
	public static final String $src_cur_cd2 = $hdr + ".src_cur_cd2";
	public static final String $src_cur_nm2 = $hdr + ".src_cur_nm2";
	public static final String $src_amt2 = $hdr + ".src_amt2";
	public static final String $src_cur_cd3 = $hdr + ".src_cur_cd3";
	public static final String $src_cur_nm3 = $hdr + ".src_cur_nm3";
	public static final String $src_amt3 = $hdr + ".src_amt3";
	public static final String $src_ext_key1 = $hdr + ".src_ext_key1";
	public static final String $src_ext_key2 = $hdr + ".src_ext_key2";
	public static final String $src_ext_key3 = $hdr + ".src_ext_key3";
	public static final String $aprv_src_no1 = $hdr + ".aprv_src_no1";
	public static final String $aprv_src_no2 = $hdr + ".aprv_src_no2";
	public static final String $aprv_h_ins_usr_id = $hdr + ".ins_usr_id";
	public static final String $aprv_h_ins_usr_nm = $hdr + ".ins_usr_nm";
	public static final String $aprv_h_ins_ts = $hdr + ".ins_ts";
	public static final String $aprv_h_ins_func_id = $hdr + ".ins_func_id";
	public static final String $aprv_h_ins_func_nm = $hdr + ".ins_func_nm";
	public static final String $aprv_h_upd_usr_id = $hdr + ".upd_usr_id";
	public static final String $aprv_h_upd_usr_nm = $hdr + ".upd_usr_nm";
	public static final String $aprv_h_upd_ts = $hdr + ".upd_ts";
	public static final String $aprv_h_upd_func_id = $hdr + ".upd_func_id";
	public static final String $aprv_h_upd_func_nm = $hdr + ".upd_func_nm";
	public static final String $aprv_h_upd_srv_req_no = $hdr + ".upd_srv_req_no";

	public static final MCMeta hdr_META = createInnerRowMeta($hdr, mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.class);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm_META = createCommonMeta($aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_seq_META = createCommonMeta($aprv_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta aprv_d_sts_typ_META = createCommonMeta($aprv_d_sts_typ, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP);
	public static final MCMeta aprv_d_sts_typ_nm_META = createCommonMeta($aprv_d_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP_NM);
	public static final MCMeta aprv_d_tm_META = createCommonMeta($aprv_d_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta deputy_flg_META = createCommonMeta($deputy_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta deputy_usr_cd_META = createCommonMeta($deputy_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta deputy_usr_nm_META = createCommonMeta($deputy_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_d_rmrks_META = createCommonMeta($aprv_d_rmrks, mcframe.commonMA.meta.MA_META.APRV_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta email1_META = createCommonMeta($email1, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email2_META = createCommonMeta($email2, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email3_META = createCommonMeta($email3, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta tel1_META = createCommonMeta($tel1, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel2_META = createCommonMeta($tel2, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel3_META = createCommonMeta($tel3, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);

	protected static final ConstMetaList<Aprv_Srch02_Dtl1R> constMetas = new ConstMetaList<Aprv_Srch02_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_META,
			aprv_role_cd_META,
			aprv_role_nm_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_seq_META,
			aprv_d_sts_typ_META,
			aprv_d_sts_typ_nm_META,
			aprv_d_tm_META,
			deputy_flg_META,
			deputy_usr_cd_META,
			deputy_usr_nm_META,
			aprv_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			email1_META,
			email2_META,
			email3_META,
			tel1_META,
			tel2_META,
			tel3_META,
			th_image_META
		},
		new String[][]{
			{
				"aprv_no",
				"aprv_no_seq",
				"aprv_sts_typ",
				"aprv_sts_typ_nm",
				"last_aprv_usr_cd",
				"last_aprv_usr_nm",
				"last_aprv_tm",
				"ins_dt",
				"biz_usr_cd",
				"biz_usr_nm",
				"src_ins_usr_cd",
				"src_ins_usr_nm",
				"aprv_func_typ",
				"aprv_func_typ_nm",
				"src_itm_cd",
				"src_itm_sub1",
				"src_itm_sub2",
				"src_itm_sub3",
				"src_itm_nm",
				"src_dpt_cd",
				"src_dpt_nm",
				"src_bp_cd",
				"src_bp_nm",
				"src_cur_cd1",
				"src_cur_nm1",
				"src_amt1",
				"src_cur_cd2",
				"src_cur_nm2",
				"src_amt2",
				"src_cur_cd3",
				"src_cur_nm3",
				"src_amt3",
				"src_ext_key1",
				"src_ext_key2",
				"src_ext_key3",
				"aprv_src_no1",
				"aprv_src_no2",
				"aprv_h_ins_usr_id",
				"aprv_h_ins_usr_nm",
				"aprv_h_ins_ts",
				"aprv_h_ins_func_id",
				"aprv_h_ins_func_nm",
				"aprv_h_upd_usr_id",
				"aprv_h_upd_usr_nm",
				"aprv_h_upd_ts",
				"aprv_h_upd_func_id",
				"aprv_h_upd_func_nm",
				"aprv_h_upd_srv_req_no"
			},
			{
				$aprv_no,
				$aprv_no_seq,
				$aprv_sts_typ,
				$aprv_sts_typ_nm,
				$last_aprv_usr_cd,
				$last_aprv_usr_nm,
				$last_aprv_tm,
				$ins_dt,
				$biz_usr_cd,
				$biz_usr_nm,
				$src_ins_usr_cd,
				$src_ins_usr_nm,
				$aprv_func_typ,
				$aprv_func_typ_nm,
				$src_itm_cd,
				$src_itm_sub1,
				$src_itm_sub2,
				$src_itm_sub3,
				$src_itm_nm,
				$src_dpt_cd,
				$src_dpt_nm,
				$src_bp_cd,
				$src_bp_nm,
				$src_cur_cd1,
				$src_cur_nm1,
				$src_amt1,
				$src_cur_cd2,
				$src_cur_nm2,
				$src_amt2,
				$src_cur_cd3,
				$src_cur_nm3,
				$src_amt3,
				$src_ext_key1,
				$src_ext_key2,
				$src_ext_key3,
				$aprv_src_no1,
				$aprv_src_no2,
				$aprv_h_ins_usr_id,
				$aprv_h_ins_usr_nm,
				$aprv_h_ins_ts,
				$aprv_h_ins_func_id,
				$aprv_h_ins_func_nm,
				$aprv_h_upd_usr_id,
				$aprv_h_upd_usr_nm,
				$aprv_h_upd_ts,
				$aprv_h_upd_func_id,
				$aprv_h_upd_func_nm,
				$aprv_h_upd_srv_req_no
			}
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
	protected Aprv_Srch02_Dtl1R_MC_A(ConstMetaList<? extends Aprv_Srch02_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_Srch02_Dtl1R clone() {
		return (Aprv_Srch02_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_Srch02_Dtl1R createInstance() {
		return (Aprv_Srch02_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_Srch02_Dtl1R getValues(String... names) {
		return (Aprv_Srch02_Dtl1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R hdr(){
		return (mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R) getConstInnerRow(offset + 0, $hdr);
	}
	
	public void hdr(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R row){
		setConstInnerRow(offset + 0, $hdr, row);
	}


	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 1, $aprv_role_cd);
	}

	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 1, $aprv_role_cd, value);
	}


	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public String aprv_role_nm() {
		return getConstString(offset + 2, $aprv_role_nm);
	}

	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public void aprv_role_nm(String value) {
		setConstString(offset + 2, $aprv_role_nm, value);
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
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public MCNumber aprv_seq() {
		return getConstNumber(offset + 5, $aprv_seq);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(MCNumber value) {
		setConstNumber(offset + 5, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(int value) {
		setConstNumber(offset + 5, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(long value) {
		setConstNumber(offset + 5, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(float value) {
		setConstNumber(offset + 5, $aprv_seq, value);
	}

	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public void aprv_seq(double value) {
		setConstNumber(offset + 5, $aprv_seq, value);
	}


	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public String aprv_d_sts_typ() {
		return getConstString(offset + 6, $aprv_d_sts_typ);
	}

	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public void aprv_d_sts_typ(String value) {
		setConstString(offset + 6, $aprv_d_sts_typ, value);
	}


	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public String aprv_d_sts_typ_nm() {
		return getConstString(offset + 7, $aprv_d_sts_typ_nm);
	}

	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public void aprv_d_sts_typ_nm(String value) {
		setConstString(offset + 7, $aprv_d_sts_typ_nm, value);
	}


	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDate aprv_d_tm() {
		return getConstDate(offset + 8, $aprv_d_tm);
	}

	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public void aprv_d_tm(MCDate value) {
		setConstDate(offset + 8, $aprv_d_tm, value);
	}


	/**
	 * Alternate approval flg. 代理承認ＦＬＧ.<p>
	 *
	 */
	public boolean deputy_flg() {
		return getConstBoolean(offset + 9, $deputy_flg);
	}

	/**
	 * Alternate approval flg. 代理承認ＦＬＧ.<p>
	 *
	 */
	public void deputy_flg(boolean value) {
		setConstBoolean(offset + 9, $deputy_flg, value);
	}


	/**
	 * Alternate approver cd. 代理承認者ＣＤ.<p>
	 *
	 */
	public String deputy_usr_cd() {
		return getConstString(offset + 10, $deputy_usr_cd);
	}

	/**
	 * Alternate approver cd. 代理承認者ＣＤ.<p>
	 *
	 */
	public void deputy_usr_cd(String value) {
		setConstString(offset + 10, $deputy_usr_cd, value);
	}


	/**
	 * Alternate approver name 代理承認者名.<p>
	 *
	 */
	public String deputy_usr_nm() {
		return getConstString(offset + 11, $deputy_usr_nm);
	}

	/**
	 * Alternate approver name 代理承認者名.<p>
	 *
	 */
	public void deputy_usr_nm(String value) {
		setConstString(offset + 11, $deputy_usr_nm, value);
	}


	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public String aprv_d_rmrks() {
		return getConstString(offset + 12, $aprv_d_rmrks);
	}

	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public void aprv_d_rmrks(String value) {
		setConstString(offset + 12, $aprv_d_rmrks, value);
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
	 * Entry user ID (Details) 登録ユーザＩＤ（明細）.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 16, $ins_usr_id);
	}

	/**
	 * Entry user ID (Details) 登録ユーザＩＤ（明細）.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 16, $ins_usr_id, value);
	}


	/**
	 * Entry user name (Details) 登録ユーザ名（明細）.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 17, $ins_usr_nm);
	}

	/**
	 * Entry user name (Details) 登録ユーザ名（明細）.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 17, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time (Details) 登録日時（明細）.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 18, $ins_ts);
	}

	/**
	 * Entry date and time (Details) 登録日時（明細）.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 18, $ins_ts, value);
	}


	/**
	 * Entry function ID (Details) 登録機能ＩＤ（明細）.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 19, $ins_func_id);
	}

	/**
	 * Entry function ID (Details) 登録機能ＩＤ（明細）.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 19, $ins_func_id, value);
	}


	/**
	 * Entry function name (Details) 登録機能名（明細）.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 20, $ins_func_nm);
	}

	/**
	 * Entry function name (Details) 登録機能名（明細）.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 20, $ins_func_nm, value);
	}


	/**
	 * Update user ID (Details) 更新ユーザＩＤ（明細）.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 21, $upd_usr_id);
	}

	/**
	 * Update user ID (Details) 更新ユーザＩＤ（明細）.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 21, $upd_usr_id, value);
	}


	/**
	 * Update user name (Details) 更新ユーザ名（明細）.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 22, $upd_usr_nm);
	}

	/**
	 * Update user name (Details) 更新ユーザ名（明細）.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 22, $upd_usr_nm, value);
	}


	/**
	 * Update date and time (Details) 更新日時（明細）.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 23, $upd_ts);
	}

	/**
	 * Update date and time (Details) 更新日時（明細）.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $upd_ts, value);
	}


	/**
	 * Update function ID (Details) 更新機能ＩＤ（明細）.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 24, $upd_func_id);
	}

	/**
	 * Update function ID (Details) 更新機能ＩＤ（明細）.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 24, $upd_func_id, value);
	}


	/**
	 * Update function name (Details) 更新機能名（明細）.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 25, $upd_func_nm);
	}

	/**
	 * Update function name (Details) 更新機能名（明細）.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 25, $upd_func_nm, value);
	}


	/**
	 * Update request No. (Details) 更新リクエストＮＯ（明細）.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 26, $upd_srv_req_no);
	}

	/**
	 * Update request No. (Details) 更新リクエストＮＯ（明細）.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 26, $upd_srv_req_no, value);
	}


	/**
	 * E-mail 1 Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public String email1() {
		return getConstString(offset + 27, $email1);
	}

	/**
	 * E-mail 1 Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public void email1(String value) {
		setConstString(offset + 27, $email1, value);
	}


	/**
	 * E-mail 2 Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public String email2() {
		return getConstString(offset + 28, $email2);
	}

	/**
	 * E-mail 2 Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public void email2(String value) {
		setConstString(offset + 28, $email2, value);
	}


	/**
	 * E-mail 3 Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public String email3() {
		return getConstString(offset + 29, $email3);
	}

	/**
	 * E-mail 3 Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public void email3(String value) {
		setConstString(offset + 29, $email3, value);
	}


	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public String tel1() {
		return getConstString(offset + 30, $tel1);
	}

	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public void tel1(String value) {
		setConstString(offset + 30, $tel1, value);
	}


	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public String tel2() {
		return getConstString(offset + 31, $tel2);
	}

	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public void tel2(String value) {
		setConstString(offset + 31, $tel2, value);
	}


	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public String tel3() {
		return getConstString(offset + 32, $tel3);
	}

	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public void tel3(String value) {
		setConstString(offset + 32, $tel3, value);
	}


	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 33, $th_image);
	}

	/**
	 * Thumbnail image サムネイル画像.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 33, $th_image, value);
	}


	public String getString(String name) {
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
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
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
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
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			aprv_role_cd(value);
			return;
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			aprv_role_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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

	public MCRow getInnerRow(String name) {
		if ($hdr.equalsIgnoreCase(name)) {
			return hdr();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hdr.equalsIgnoreCase(name)) {
			hdr(
				((MCContainerMeta) hdr_META).castInnerRow(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return hdr().aprv_no();
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		hdr().aprv_no(value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return hdr().aprv_no_seq();
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		hdr().aprv_no_seq(value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		hdr().aprv_no_seq(value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		hdr().aprv_no_seq(value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		hdr().aprv_no_seq(value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		hdr().aprv_no_seq(value);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return hdr().aprv_sts_typ();
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		hdr().aprv_sts_typ(value);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return hdr().aprv_sts_typ_nm();
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		hdr().aprv_sts_typ_nm(value);
	}

	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public String last_aprv_usr_cd() {
		return hdr().last_aprv_usr_cd();
	}

	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public void last_aprv_usr_cd(String value) {
		hdr().last_aprv_usr_cd(value);
	}

	/**
	 * Final approver name 最終承認者名.<p>
	 *
	 */
	public String last_aprv_usr_nm() {
		return hdr().last_aprv_usr_nm();
	}

	/**
	 * Final approver name 最終承認者名.<p>
	 *
	 */
	public void last_aprv_usr_nm(String value) {
		hdr().last_aprv_usr_nm(value);
	}

	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public MCDate last_aprv_tm() {
		return hdr().last_aprv_tm();
	}

	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public void last_aprv_tm(MCDate value) {
		hdr().last_aprv_tm(value);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate ins_dt() {
		return hdr().ins_dt();
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void ins_dt(MCDate value) {
		hdr().ins_dt(value);
	}

	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public String biz_usr_cd() {
		return hdr().biz_usr_cd();
	}

	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public void biz_usr_cd(String value) {
		hdr().biz_usr_cd(value);
	}

	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public String biz_usr_nm() {
		return hdr().biz_usr_nm();
	}

	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public void biz_usr_nm(String value) {
		hdr().biz_usr_nm(value);
	}

	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public String src_ins_usr_cd() {
		return hdr().src_ins_usr_cd();
	}

	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public void src_ins_usr_cd(String value) {
		hdr().src_ins_usr_cd(value);
	}

	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public String src_ins_usr_nm() {
		return hdr().src_ins_usr_nm();
	}

	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public void src_ins_usr_nm(String value) {
		hdr().src_ins_usr_nm(value);
	}

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public String aprv_func_typ() {
		return hdr().aprv_func_typ();
	}

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		hdr().aprv_func_typ(value);
	}

	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public String aprv_func_typ_nm() {
		return hdr().aprv_func_typ_nm();
	}

	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public void aprv_func_typ_nm(String value) {
		hdr().aprv_func_typ_nm(value);
	}

	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public String src_itm_cd() {
		return hdr().src_itm_cd();
	}

	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public void src_itm_cd(String value) {
		hdr().src_itm_cd(value);
	}

	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public String src_itm_sub1() {
		return hdr().src_itm_sub1();
	}

	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public void src_itm_sub1(String value) {
		hdr().src_itm_sub1(value);
	}

	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public String src_itm_sub2() {
		return hdr().src_itm_sub2();
	}

	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public void src_itm_sub2(String value) {
		hdr().src_itm_sub2(value);
	}

	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public String src_itm_sub3() {
		return hdr().src_itm_sub3();
	}

	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public void src_itm_sub3(String value) {
		hdr().src_itm_sub3(value);
	}

	/**
	 * Approval creating source item name 承認作成元品名.<p>
	 *
	 */
	public String src_itm_nm() {
		return hdr().src_itm_nm();
	}

	/**
	 * Approval creating source item name 承認作成元品名.<p>
	 *
	 */
	public void src_itm_nm(String value) {
		hdr().src_itm_nm(value);
	}

	/**
	 * Approval creating source dept. cd. 承認作成元部門ＣＤ.<p>
	 *
	 */
	public String src_dpt_cd() {
		return hdr().src_dpt_cd();
	}

	/**
	 * Approval creating source dept. cd. 承認作成元部門ＣＤ.<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		hdr().src_dpt_cd(value);
	}

	/**
	 * Approval creating source dept. name 承認作成元部門名.<p>
	 *
	 */
	public String src_dpt_nm() {
		return hdr().src_dpt_nm();
	}

	/**
	 * Approval creating source dept. name 承認作成元部門名.<p>
	 *
	 */
	public void src_dpt_nm(String value) {
		hdr().src_dpt_nm(value);
	}

	/**
	 * Approval creating source customer cd. 承認作成元取引先ＣＤ.<p>
	 *
	 */
	public String src_bp_cd() {
		return hdr().src_bp_cd();
	}

	/**
	 * Approval creating source customer cd. 承認作成元取引先ＣＤ.<p>
	 *
	 */
	public void src_bp_cd(String value) {
		hdr().src_bp_cd(value);
	}

	/**
	 * Approval creating source BP name 承認作成元取引先名.<p>
	 *
	 */
	public String src_bp_nm() {
		return hdr().src_bp_nm();
	}

	/**
	 * Approval creating source BP name 承認作成元取引先名.<p>
	 *
	 */
	public void src_bp_nm(String value) {
		hdr().src_bp_nm(value);
	}

	/**
	 * Approval creating source base currency cd. 1 承認作成元通貨ＣＤ１.<p>
	 *
	 */
	public String src_cur_cd1() {
		return hdr().src_cur_cd1();
	}

	/**
	 * Approval creating source base currency cd. 1 承認作成元通貨ＣＤ１.<p>
	 *
	 */
	public void src_cur_cd1(String value) {
		hdr().src_cur_cd1(value);
	}

	/**
	 * Approval creating source currency name 1 承認作成元通貨名１.<p>
	 *
	 */
	public String src_cur_nm1() {
		return hdr().src_cur_nm1();
	}

	/**
	 * Approval creating source currency name 1 承認作成元通貨名１.<p>
	 *
	 */
	public void src_cur_nm1(String value) {
		hdr().src_cur_nm1(value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public MCNumber src_amt1() {
		return hdr().src_amt1();
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(MCNumber value) {
		hdr().src_amt1(value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(int value) {
		hdr().src_amt1(value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(long value) {
		hdr().src_amt1(value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(float value) {
		hdr().src_amt1(value);
	}

	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public void src_amt1(double value) {
		hdr().src_amt1(value);
	}

	/**
	 * Approval creating source base currency cd. 2 承認作成元通貨ＣＤ２.<p>
	 *
	 */
	public String src_cur_cd2() {
		return hdr().src_cur_cd2();
	}

	/**
	 * Approval creating source base currency cd. 2 承認作成元通貨ＣＤ２.<p>
	 *
	 */
	public void src_cur_cd2(String value) {
		hdr().src_cur_cd2(value);
	}

	/**
	 * Approval creating source currency name 2 承認作成元通貨名２.<p>
	 *
	 */
	public String src_cur_nm2() {
		return hdr().src_cur_nm2();
	}

	/**
	 * Approval creating source currency name 2 承認作成元通貨名２.<p>
	 *
	 */
	public void src_cur_nm2(String value) {
		hdr().src_cur_nm2(value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public MCNumber src_amt2() {
		return hdr().src_amt2();
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(MCNumber value) {
		hdr().src_amt2(value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(int value) {
		hdr().src_amt2(value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(long value) {
		hdr().src_amt2(value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(float value) {
		hdr().src_amt2(value);
	}

	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public void src_amt2(double value) {
		hdr().src_amt2(value);
	}

	/**
	 * Approval creating source base currency cd. 3 承認作成元通貨ＣＤ３.<p>
	 *
	 */
	public String src_cur_cd3() {
		return hdr().src_cur_cd3();
	}

	/**
	 * Approval creating source base currency cd. 3 承認作成元通貨ＣＤ３.<p>
	 *
	 */
	public void src_cur_cd3(String value) {
		hdr().src_cur_cd3(value);
	}

	/**
	 * Approval creating currency name 3 承認作成元通貨名３.<p>
	 *
	 */
	public String src_cur_nm3() {
		return hdr().src_cur_nm3();
	}

	/**
	 * Approval creating currency name 3 承認作成元通貨名３.<p>
	 *
	 */
	public void src_cur_nm3(String value) {
		hdr().src_cur_nm3(value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public MCNumber src_amt3() {
		return hdr().src_amt3();
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(MCNumber value) {
		hdr().src_amt3(value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(int value) {
		hdr().src_amt3(value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(long value) {
		hdr().src_amt3(value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(float value) {
		hdr().src_amt3(value);
	}

	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public void src_amt3(double value) {
		hdr().src_amt3(value);
	}

	/**
	 * Approval creating source extended column 1 承認作成元拡張項目１.<p>
	 *
	 */
	public String src_ext_key1() {
		return hdr().src_ext_key1();
	}

	/**
	 * Approval creating source extended column 1 承認作成元拡張項目１.<p>
	 *
	 */
	public void src_ext_key1(String value) {
		hdr().src_ext_key1(value);
	}

	/**
	 * Approval creating source extended column 2 承認作成元拡張項目２.<p>
	 *
	 */
	public String src_ext_key2() {
		return hdr().src_ext_key2();
	}

	/**
	 * Approval creating source extended column 2 承認作成元拡張項目２.<p>
	 *
	 */
	public void src_ext_key2(String value) {
		hdr().src_ext_key2(value);
	}

	/**
	 * Approval created-from expanded column 3 承認作成元拡張項目３.<p>
	 *
	 */
	public String src_ext_key3() {
		return hdr().src_ext_key3();
	}

	/**
	 * Approval created-from expanded column 3 承認作成元拡張項目３.<p>
	 *
	 */
	public void src_ext_key3(String value) {
		hdr().src_ext_key3(value);
	}

	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public String aprv_src_no1() {
		return hdr().aprv_src_no1();
	}

	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public void aprv_src_no1(String value) {
		hdr().aprv_src_no1(value);
	}

	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public String aprv_src_no2() {
		return hdr().aprv_src_no2();
	}

	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public void aprv_src_no2(String value) {
		hdr().aprv_src_no2(value);
	}

	/**
	 * Entry user ID (Header) 登録ユーザＩＤ（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_ins_usr_id() {
		return hdr().ins_usr_id();
	}

	/**
	 * Entry user ID (Header) 登録ユーザＩＤ（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_ins_usr_id(String value) {
		hdr().ins_usr_id(value);
	}

	/**
	 * Entry user name (Header) 登録ユーザ名（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_ins_usr_nm() {
		return hdr().ins_usr_nm();
	}

	/**
	 * Entry user name (Header) 登録ユーザ名（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_ins_usr_nm(String value) {
		hdr().ins_usr_nm(value);
	}

	/**
	 * Entry date and time (Header) 登録日時（ヘッダ）.<p>
	 *
	 */
	public MCTimestamp aprv_h_ins_ts() {
		return hdr().ins_ts();
	}

	/**
	 * Entry date and time (Header) 登録日時（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_ins_ts(MCTimestamp value) {
		hdr().ins_ts(value);
	}

	/**
	 * Entry function ID (Header) 登録機能ＩＤ（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_ins_func_id() {
		return hdr().ins_func_id();
	}

	/**
	 * Entry function ID (Header) 登録機能ＩＤ（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_ins_func_id(String value) {
		hdr().ins_func_id(value);
	}

	/**
	 * Entry function name (Header) 登録機能名（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_ins_func_nm() {
		return hdr().ins_func_nm();
	}

	/**
	 * Entry function name (Header) 登録機能名（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_ins_func_nm(String value) {
		hdr().ins_func_nm(value);
	}

	/**
	 * Update user ID (Header) 更新ユーザＩＤ（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_upd_usr_id() {
		return hdr().upd_usr_id();
	}

	/**
	 * Update user ID (Header) 更新ユーザＩＤ（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_upd_usr_id(String value) {
		hdr().upd_usr_id(value);
	}

	/**
	 * Update user name (Header) 更新ユーザ名（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_upd_usr_nm() {
		return hdr().upd_usr_nm();
	}

	/**
	 * Update user name (Header) 更新ユーザ名（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_upd_usr_nm(String value) {
		hdr().upd_usr_nm(value);
	}

	/**
	 * Update date and time (Header) 更新日時（ヘッダ）.<p>
	 *
	 */
	public MCTimestamp aprv_h_upd_ts() {
		return hdr().upd_ts();
	}

	/**
	 * Update date and time (Header) 更新日時（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_upd_ts(MCTimestamp value) {
		hdr().upd_ts(value);
	}

	/**
	 * Update function ID (header) 更新機能ＩＤ（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_upd_func_id() {
		return hdr().upd_func_id();
	}

	/**
	 * Update function ID (header) 更新機能ＩＤ（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_upd_func_id(String value) {
		hdr().upd_func_id(value);
	}

	/**
	 * Update function name (Header) 更新機能名（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_upd_func_nm() {
		return hdr().upd_func_nm();
	}

	/**
	 * Update function name (Header) 更新機能名（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_upd_func_nm(String value) {
		hdr().upd_func_nm(value);
	}

	/**
	 * Update request No. (Header) 更新リクエストＮＯ（ヘッダ）.<p>
	 *
	 */
	public String aprv_h_upd_srv_req_no() {
		return hdr().upd_srv_req_no();
	}

	/**
	 * Update request No. (Header) 更新リクエストＮＯ（ヘッダ）.<p>
	 *
	 */
	public void aprv_h_upd_srv_req_no(String value) {
		hdr().upd_srv_req_no(value);
	}

}

