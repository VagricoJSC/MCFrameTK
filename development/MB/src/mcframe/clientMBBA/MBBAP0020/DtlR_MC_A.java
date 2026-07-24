package mcframe.clientMBBA.MBBAP0020;

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

	public static final String $check = "check";
	public static final String $acpt_check = "acpt_check";
	public static final String $rjct_check = "rjct_check";
	public static final String $aprv_no = "aprv_no";
	public static final String $aprv_no_seq = "aprv_no_seq";
	public static final String $aprv_src_no1 = "aprv_src_no1";
	public static final String $aprv_src_no2 = "aprv_src_no2";
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	public static final String $aprv_sts_typ_nm = "aprv_sts_typ_nm";
	public static final String $main_role_flg = "main_role_flg";
	public static final String $sub_role_flg = "sub_role_flg";
	public static final String $aprv_d_rmrks_up = "aprv_d_rmrks_up";
	public static final String $sub_char1_up = "sub_char1_up";
	public static final String $sub_char2_up = "sub_char2_up";
	public static final String $sub_char3_up = "sub_char3_up";
	public static final String $ins_dt = "ins_dt";
	public static final String $src_ins_usr_cd = "src_ins_usr_cd";
	public static final String $src_ins_usr_nm = "src_ins_usr_nm";
	public static final String $biz_usr_cd = "biz_usr_cd";
	public static final String $biz_usr_nm = "biz_usr_nm";
	public static final String $aprv_func_typ = "aprv_func_typ";
	public static final String $aprv_func_typ_nm = "aprv_func_typ_nm";
	public static final String $itm_p = "itm_p";
	public static final String $src_dpt_cd = "src_dpt_cd";
	public static final String $src_dpt_nm = "src_dpt_nm";
	public static final String $src_bp_cd = "src_bp_cd";
	public static final String $src_bp_nm = "src_bp_nm";
	public static final String $src_cur_cd1 = "src_cur_cd1";
	public static final String $src_cur_nm1 = "src_cur_nm1";
	public static final String $src_amt1 = "src_amt1";
	public static final String $src_cur_cd2 = "src_cur_cd2";
	public static final String $src_cur_nm2 = "src_cur_nm2";
	public static final String $src_amt2 = "src_amt2";
	public static final String $src_cur_cd3 = "src_cur_cd3";
	public static final String $src_cur_nm3 = "src_cur_nm3";
	public static final String $src_amt3 = "src_amt3";
	public static final String $src_ext_key1 = "src_ext_key1";
	public static final String $src_ext_key2 = "src_ext_key2";
	public static final String $src_ext_key3 = "src_ext_key3";
	public static final String $next_opr_flg = "next_opr_flg";
	public static final String $not_upd_flg = "not_upd_flg";
	public static final String $rts_msg_p = "rts_msg_p";
	public static final String $upd_cntr = "upd_cntr";
	public static final String $aprv_seq = "aprv_seq";
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	public static final String $aprv_d_sts_typ = "aprv_d_sts_typ";
	public static final String $aprv_d_sts_typ_up = "aprv_d_sts_typ_up";
	public static final String $aprv_d_sts_typ_nm = "aprv_d_sts_typ_nm";
	public static final String $aprv_d_tm = "aprv_d_tm";
	public static final String $deputy_flg = "deputy_flg";
	public static final String $deputy_usr_cd = "deputy_usr_cd";
	public static final String $deputy_usr_nm = "deputy_usr_nm";
	public static final String $aprv_role_cd = "aprv_role_cd";
	public static final String $aprv_role_nm = "aprv_role_nm";
	public static final String $aprv_d_rmrks = "aprv_d_rmrks";
	public static final String $sub_char1 = "sub_char1";
	public static final String $sub_char2 = "sub_char2";
	public static final String $sub_char3 = "sub_char3";
	public static final String $ins_usr_id = "ins_usr_id";
	public static final String $ins_usr_nm = "ins_usr_nm";
	public static final String $ins_func_id = "ins_func_id";
	public static final String $ins_func_nm = "ins_func_nm";
	public static final String $ins_ts = "ins_ts";
	public static final String $upd_usr_id = "upd_usr_id";
	public static final String $upd_usr_nm = "upd_usr_nm";
	public static final String $upd_func_id = "upd_func_id";
	public static final String $upd_func_nm = "upd_func_nm";
	public static final String $upd_ts = "upd_ts";
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	public static final String $match_cnd_flg = "match_cnd_flg";

	public static final String $src_itm_cd = $itm_p + ".itm_cd";
	public static final String $src_itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $src_itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $src_itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $src_itm_nm = $itm_p + ".itm_nm";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acpt_check_META = createCommonMeta($acpt_check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rjct_check_META = createCommonMeta($rjct_check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_src_no1_META = createCommonMeta($aprv_src_no1, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_src_no2_META = createCommonMeta($aprv_src_no2, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta main_role_flg_META = createCommonMeta($main_role_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_role_flg_META = createCommonMeta($sub_role_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_d_rmrks_up_META = createCommonMeta($aprv_d_rmrks_up, mcframe.commonMA.meta.MA_META.APRV_D_RMRKS);
	public static final MCMeta sub_char1_up_META = createCommonMeta($sub_char1_up, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR1);
	public static final MCMeta sub_char2_up_META = createCommonMeta($sub_char2_up, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR2);
	public static final MCMeta sub_char3_up_META = createCommonMeta($sub_char3_up, mcframe.commonMA.meta.MA_META.APRV_D_SUB_CHAR3);
	public static final MCMeta ins_dt_META = createCommonMeta($ins_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta src_ins_usr_cd_META = createCommonMeta($src_ins_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta src_ins_usr_nm_META = createCommonMeta($src_ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta biz_usr_cd_META = createCommonMeta($biz_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta biz_usr_nm_META = createCommonMeta($biz_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_func_typ_nm_META = createCommonMeta($aprv_func_typ_nm, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta src_dpt_nm_META = createCommonMeta($src_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta src_bp_cd_META = createCommonMeta($src_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta src_bp_nm_META = createCommonMeta($src_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta src_cur_cd1_META = createCommonMeta($src_cur_cd1, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_cur_nm1_META = createCommonMeta($src_cur_nm1, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta src_amt1_META = createCommonMeta($src_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_cur_cd2_META = createCommonMeta($src_cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_cur_nm2_META = createCommonMeta($src_cur_nm2, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta src_amt2_META = createCommonMeta($src_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_cur_cd3_META = createCommonMeta($src_cur_cd3, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_cur_nm3_META = createCommonMeta($src_cur_nm3, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta src_amt3_META = createCommonMeta($src_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_ext_key1_META = createCommonMeta($src_ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta src_ext_key2_META = createCommonMeta($src_ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta src_ext_key3_META = createCommonMeta($src_ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);
	public static final MCMeta next_opr_flg_META = createCommonMeta($next_opr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_upd_flg_META = createCommonMeta($not_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta aprv_seq_META = createCommonMeta($aprv_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_d_sts_typ_META = createCommonMeta($aprv_d_sts_typ, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP);
	public static final MCMeta aprv_d_sts_typ_up_META = createCommonMeta($aprv_d_sts_typ_up, mcframe.commonMA.meta.MA_META.APRV_D_STS_TYP);
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
	public static final MCMeta match_cnd_flg_META = createCommonMeta($match_cnd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			acpt_check_META,
			rjct_check_META,
			aprv_no_META,
			aprv_no_seq_META,
			aprv_src_no1_META,
			aprv_src_no2_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			main_role_flg_META,
			sub_role_flg_META,
			aprv_d_rmrks_up_META,
			sub_char1_up_META,
			sub_char2_up_META,
			sub_char3_up_META,
			ins_dt_META,
			src_ins_usr_cd_META,
			src_ins_usr_nm_META,
			biz_usr_cd_META,
			biz_usr_nm_META,
			aprv_func_typ_META,
			aprv_func_typ_nm_META,
			itm_p_META,
			src_dpt_cd_META,
			src_dpt_nm_META,
			src_bp_cd_META,
			src_bp_nm_META,
			src_cur_cd1_META,
			src_cur_nm1_META,
			src_amt1_META,
			src_cur_cd2_META,
			src_cur_nm2_META,
			src_amt2_META,
			src_cur_cd3_META,
			src_cur_nm3_META,
			src_amt3_META,
			src_ext_key1_META,
			src_ext_key2_META,
			src_ext_key3_META,
			next_opr_flg_META,
			not_upd_flg_META,
			rts_msg_p_META,
			upd_cntr_META,
			aprv_seq_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_d_sts_typ_META,
			aprv_d_sts_typ_up_META,
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
			upd_srv_req_no_META,
			match_cnd_flg_META
		},
		new String[][]{
			{
				"src_itm_cd",
				"src_itm_sub1",
				"src_itm_sub2",
				"src_itm_sub3",
				"src_itm_nm",
				"rtn_sts_typ"
			},
			{
				$src_itm_cd,
				$src_itm_sub1,
				$src_itm_sub2,
				$src_itm_sub3,
				$src_itm_nm,
				$rtn_sts_typ
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



	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public boolean acpt_check() {
		return getConstBoolean(offset + 1, $acpt_check);
	}

	public void acpt_check(boolean value) {
		setConstBoolean(offset + 1, $acpt_check, value);
	}


	public boolean rjct_check() {
		return getConstBoolean(offset + 2, $rjct_check);
	}

	public void rjct_check(boolean value) {
		setConstBoolean(offset + 2, $rjct_check, value);
	}


	public String aprv_no() {
		return getConstString(offset + 3, $aprv_no);
	}

	public void aprv_no(String value) {
		setConstString(offset + 3, $aprv_no, value);
	}


	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 4, $aprv_no_seq);
	}

	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 4, $aprv_no_seq, value);
	}

	public void aprv_no_seq(int value) {
		setConstNumber(offset + 4, $aprv_no_seq, value);
	}

	public void aprv_no_seq(long value) {
		setConstNumber(offset + 4, $aprv_no_seq, value);
	}

	public void aprv_no_seq(float value) {
		setConstNumber(offset + 4, $aprv_no_seq, value);
	}

	public void aprv_no_seq(double value) {
		setConstNumber(offset + 4, $aprv_no_seq, value);
	}


	public String aprv_src_no1() {
		return getConstString(offset + 5, $aprv_src_no1);
	}

	public void aprv_src_no1(String value) {
		setConstString(offset + 5, $aprv_src_no1, value);
	}


	public String aprv_src_no2() {
		return getConstString(offset + 6, $aprv_src_no2);
	}

	public void aprv_src_no2(String value) {
		setConstString(offset + 6, $aprv_src_no2, value);
	}


	public String aprv_sts_typ() {
		return getConstString(offset + 7, $aprv_sts_typ);
	}

	public void aprv_sts_typ(String value) {
		setConstString(offset + 7, $aprv_sts_typ, value);
	}


	public String aprv_sts_typ_nm() {
		return getConstString(offset + 8, $aprv_sts_typ_nm);
	}

	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 8, $aprv_sts_typ_nm, value);
	}


	public boolean main_role_flg() {
		return getConstBoolean(offset + 9, $main_role_flg);
	}

	public void main_role_flg(boolean value) {
		setConstBoolean(offset + 9, $main_role_flg, value);
	}


	public boolean sub_role_flg() {
		return getConstBoolean(offset + 10, $sub_role_flg);
	}

	public void sub_role_flg(boolean value) {
		setConstBoolean(offset + 10, $sub_role_flg, value);
	}


	public String aprv_d_rmrks_up() {
		return getConstString(offset + 11, $aprv_d_rmrks_up);
	}

	public void aprv_d_rmrks_up(String value) {
		setConstString(offset + 11, $aprv_d_rmrks_up, value);
	}


	public String sub_char1_up() {
		return getConstString(offset + 12, $sub_char1_up);
	}

	public void sub_char1_up(String value) {
		setConstString(offset + 12, $sub_char1_up, value);
	}


	public String sub_char2_up() {
		return getConstString(offset + 13, $sub_char2_up);
	}

	public void sub_char2_up(String value) {
		setConstString(offset + 13, $sub_char2_up, value);
	}


	public String sub_char3_up() {
		return getConstString(offset + 14, $sub_char3_up);
	}

	public void sub_char3_up(String value) {
		setConstString(offset + 14, $sub_char3_up, value);
	}


	public MCDate ins_dt() {
		return getConstDate(offset + 15, $ins_dt);
	}

	public void ins_dt(MCDate value) {
		setConstDate(offset + 15, $ins_dt, value);
	}


	public String src_ins_usr_cd() {
		return getConstString(offset + 16, $src_ins_usr_cd);
	}

	public void src_ins_usr_cd(String value) {
		setConstString(offset + 16, $src_ins_usr_cd, value);
	}


	public String src_ins_usr_nm() {
		return getConstString(offset + 17, $src_ins_usr_nm);
	}

	public void src_ins_usr_nm(String value) {
		setConstString(offset + 17, $src_ins_usr_nm, value);
	}


	public String biz_usr_cd() {
		return getConstString(offset + 18, $biz_usr_cd);
	}

	public void biz_usr_cd(String value) {
		setConstString(offset + 18, $biz_usr_cd, value);
	}


	public String biz_usr_nm() {
		return getConstString(offset + 19, $biz_usr_nm);
	}

	public void biz_usr_nm(String value) {
		setConstString(offset + 19, $biz_usr_nm, value);
	}


	public String aprv_func_typ() {
		return getConstString(offset + 20, $aprv_func_typ);
	}

	public void aprv_func_typ(String value) {
		setConstString(offset + 20, $aprv_func_typ, value);
	}


	public String aprv_func_typ_nm() {
		return getConstString(offset + 21, $aprv_func_typ_nm);
	}

	public void aprv_func_typ_nm(String value) {
		setConstString(offset + 21, $aprv_func_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 22, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 22, $itm_p, row);
	}


	public String src_dpt_cd() {
		return getConstString(offset + 23, $src_dpt_cd);
	}

	public void src_dpt_cd(String value) {
		setConstString(offset + 23, $src_dpt_cd, value);
	}


	public String src_dpt_nm() {
		return getConstString(offset + 24, $src_dpt_nm);
	}

	public void src_dpt_nm(String value) {
		setConstString(offset + 24, $src_dpt_nm, value);
	}


	public String src_bp_cd() {
		return getConstString(offset + 25, $src_bp_cd);
	}

	public void src_bp_cd(String value) {
		setConstString(offset + 25, $src_bp_cd, value);
	}


	public String src_bp_nm() {
		return getConstString(offset + 26, $src_bp_nm);
	}

	public void src_bp_nm(String value) {
		setConstString(offset + 26, $src_bp_nm, value);
	}


	public String src_cur_cd1() {
		return getConstString(offset + 27, $src_cur_cd1);
	}

	public void src_cur_cd1(String value) {
		setConstString(offset + 27, $src_cur_cd1, value);
	}


	public String src_cur_nm1() {
		return getConstString(offset + 28, $src_cur_nm1);
	}

	public void src_cur_nm1(String value) {
		setConstString(offset + 28, $src_cur_nm1, value);
	}


	public MCNumber src_amt1() {
		return getConstNumber(offset + 29, $src_amt1);
	}

	public void src_amt1(MCNumber value) {
		setConstNumber(offset + 29, $src_amt1, value);
	}

	public void src_amt1(int value) {
		setConstNumber(offset + 29, $src_amt1, value);
	}

	public void src_amt1(long value) {
		setConstNumber(offset + 29, $src_amt1, value);
	}

	public void src_amt1(float value) {
		setConstNumber(offset + 29, $src_amt1, value);
	}

	public void src_amt1(double value) {
		setConstNumber(offset + 29, $src_amt1, value);
	}


	public String src_cur_cd2() {
		return getConstString(offset + 30, $src_cur_cd2);
	}

	public void src_cur_cd2(String value) {
		setConstString(offset + 30, $src_cur_cd2, value);
	}


	public String src_cur_nm2() {
		return getConstString(offset + 31, $src_cur_nm2);
	}

	public void src_cur_nm2(String value) {
		setConstString(offset + 31, $src_cur_nm2, value);
	}


	public MCNumber src_amt2() {
		return getConstNumber(offset + 32, $src_amt2);
	}

	public void src_amt2(MCNumber value) {
		setConstNumber(offset + 32, $src_amt2, value);
	}

	public void src_amt2(int value) {
		setConstNumber(offset + 32, $src_amt2, value);
	}

	public void src_amt2(long value) {
		setConstNumber(offset + 32, $src_amt2, value);
	}

	public void src_amt2(float value) {
		setConstNumber(offset + 32, $src_amt2, value);
	}

	public void src_amt2(double value) {
		setConstNumber(offset + 32, $src_amt2, value);
	}


	public String src_cur_cd3() {
		return getConstString(offset + 33, $src_cur_cd3);
	}

	public void src_cur_cd3(String value) {
		setConstString(offset + 33, $src_cur_cd3, value);
	}


	public String src_cur_nm3() {
		return getConstString(offset + 34, $src_cur_nm3);
	}

	public void src_cur_nm3(String value) {
		setConstString(offset + 34, $src_cur_nm3, value);
	}


	public MCNumber src_amt3() {
		return getConstNumber(offset + 35, $src_amt3);
	}

	public void src_amt3(MCNumber value) {
		setConstNumber(offset + 35, $src_amt3, value);
	}

	public void src_amt3(int value) {
		setConstNumber(offset + 35, $src_amt3, value);
	}

	public void src_amt3(long value) {
		setConstNumber(offset + 35, $src_amt3, value);
	}

	public void src_amt3(float value) {
		setConstNumber(offset + 35, $src_amt3, value);
	}

	public void src_amt3(double value) {
		setConstNumber(offset + 35, $src_amt3, value);
	}


	public String src_ext_key1() {
		return getConstString(offset + 36, $src_ext_key1);
	}

	public void src_ext_key1(String value) {
		setConstString(offset + 36, $src_ext_key1, value);
	}


	public String src_ext_key2() {
		return getConstString(offset + 37, $src_ext_key2);
	}

	public void src_ext_key2(String value) {
		setConstString(offset + 37, $src_ext_key2, value);
	}


	public String src_ext_key3() {
		return getConstString(offset + 38, $src_ext_key3);
	}

	public void src_ext_key3(String value) {
		setConstString(offset + 38, $src_ext_key3, value);
	}


	public boolean next_opr_flg() {
		return getConstBoolean(offset + 39, $next_opr_flg);
	}

	public void next_opr_flg(boolean value) {
		setConstBoolean(offset + 39, $next_opr_flg, value);
	}


	public boolean not_upd_flg() {
		return getConstBoolean(offset + 40, $not_upd_flg);
	}

	public void not_upd_flg(boolean value) {
		setConstBoolean(offset + 40, $not_upd_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 41, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 41, $rts_msg_p, row);
	}


	public MCNumber upd_cntr() {
		return getConstNumber(offset + 42, $upd_cntr);
	}

	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	public void upd_cntr(int value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	public void upd_cntr(long value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	public void upd_cntr(float value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}

	public void upd_cntr(double value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}


	public MCNumber aprv_seq() {
		return getConstNumber(offset + 43, $aprv_seq);
	}

	public void aprv_seq(MCNumber value) {
		setConstNumber(offset + 43, $aprv_seq, value);
	}

	public void aprv_seq(int value) {
		setConstNumber(offset + 43, $aprv_seq, value);
	}

	public void aprv_seq(long value) {
		setConstNumber(offset + 43, $aprv_seq, value);
	}

	public void aprv_seq(float value) {
		setConstNumber(offset + 43, $aprv_seq, value);
	}

	public void aprv_seq(double value) {
		setConstNumber(offset + 43, $aprv_seq, value);
	}


	public String aprv_usr_cd() {
		return getConstString(offset + 44, $aprv_usr_cd);
	}

	public void aprv_usr_cd(String value) {
		setConstString(offset + 44, $aprv_usr_cd, value);
	}


	public String aprv_usr_nm() {
		return getConstString(offset + 45, $aprv_usr_nm);
	}

	public void aprv_usr_nm(String value) {
		setConstString(offset + 45, $aprv_usr_nm, value);
	}


	public String aprv_d_sts_typ() {
		return getConstString(offset + 46, $aprv_d_sts_typ);
	}

	public void aprv_d_sts_typ(String value) {
		setConstString(offset + 46, $aprv_d_sts_typ, value);
	}


	public String aprv_d_sts_typ_up() {
		return getConstString(offset + 47, $aprv_d_sts_typ_up);
	}

	public void aprv_d_sts_typ_up(String value) {
		setConstString(offset + 47, $aprv_d_sts_typ_up, value);
	}


	public String aprv_d_sts_typ_nm() {
		return getConstString(offset + 48, $aprv_d_sts_typ_nm);
	}

	public void aprv_d_sts_typ_nm(String value) {
		setConstString(offset + 48, $aprv_d_sts_typ_nm, value);
	}


	public MCDate aprv_d_tm() {
		return getConstDate(offset + 49, $aprv_d_tm);
	}

	public void aprv_d_tm(MCDate value) {
		setConstDate(offset + 49, $aprv_d_tm, value);
	}


	public boolean deputy_flg() {
		return getConstBoolean(offset + 50, $deputy_flg);
	}

	public void deputy_flg(boolean value) {
		setConstBoolean(offset + 50, $deputy_flg, value);
	}


	public String deputy_usr_cd() {
		return getConstString(offset + 51, $deputy_usr_cd);
	}

	public void deputy_usr_cd(String value) {
		setConstString(offset + 51, $deputy_usr_cd, value);
	}


	public String deputy_usr_nm() {
		return getConstString(offset + 52, $deputy_usr_nm);
	}

	public void deputy_usr_nm(String value) {
		setConstString(offset + 52, $deputy_usr_nm, value);
	}


	public String aprv_role_cd() {
		return getConstString(offset + 53, $aprv_role_cd);
	}

	public void aprv_role_cd(String value) {
		setConstString(offset + 53, $aprv_role_cd, value);
	}


	public String aprv_role_nm() {
		return getConstString(offset + 54, $aprv_role_nm);
	}

	public void aprv_role_nm(String value) {
		setConstString(offset + 54, $aprv_role_nm, value);
	}


	public String aprv_d_rmrks() {
		return getConstString(offset + 55, $aprv_d_rmrks);
	}

	public void aprv_d_rmrks(String value) {
		setConstString(offset + 55, $aprv_d_rmrks, value);
	}


	public String sub_char1() {
		return getConstString(offset + 56, $sub_char1);
	}

	public void sub_char1(String value) {
		setConstString(offset + 56, $sub_char1, value);
	}


	public String sub_char2() {
		return getConstString(offset + 57, $sub_char2);
	}

	public void sub_char2(String value) {
		setConstString(offset + 57, $sub_char2, value);
	}


	public String sub_char3() {
		return getConstString(offset + 58, $sub_char3);
	}

	public void sub_char3(String value) {
		setConstString(offset + 58, $sub_char3, value);
	}


	public String ins_usr_id() {
		return getConstString(offset + 59, $ins_usr_id);
	}

	public void ins_usr_id(String value) {
		setConstString(offset + 59, $ins_usr_id, value);
	}


	public String ins_usr_nm() {
		return getConstString(offset + 60, $ins_usr_nm);
	}

	public void ins_usr_nm(String value) {
		setConstString(offset + 60, $ins_usr_nm, value);
	}


	public String ins_func_id() {
		return getConstString(offset + 61, $ins_func_id);
	}

	public void ins_func_id(String value) {
		setConstString(offset + 61, $ins_func_id, value);
	}


	public String ins_func_nm() {
		return getConstString(offset + 62, $ins_func_nm);
	}

	public void ins_func_nm(String value) {
		setConstString(offset + 62, $ins_func_nm, value);
	}


	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 63, $ins_ts);
	}

	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 63, $ins_ts, value);
	}


	public String upd_usr_id() {
		return getConstString(offset + 64, $upd_usr_id);
	}

	public void upd_usr_id(String value) {
		setConstString(offset + 64, $upd_usr_id, value);
	}


	public String upd_usr_nm() {
		return getConstString(offset + 65, $upd_usr_nm);
	}

	public void upd_usr_nm(String value) {
		setConstString(offset + 65, $upd_usr_nm, value);
	}


	public String upd_func_id() {
		return getConstString(offset + 66, $upd_func_id);
	}

	public void upd_func_id(String value) {
		setConstString(offset + 66, $upd_func_id, value);
	}


	public String upd_func_nm() {
		return getConstString(offset + 67, $upd_func_nm);
	}

	public void upd_func_nm(String value) {
		setConstString(offset + 67, $upd_func_nm, value);
	}


	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 68, $upd_ts);
	}

	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 68, $upd_ts, value);
	}


	public String upd_srv_req_no() {
		return getConstString(offset + 69, $upd_srv_req_no);
	}

	public void upd_srv_req_no(String value) {
		setConstString(offset + 69, $upd_srv_req_no, value);
	}


	public boolean match_cnd_flg() {
		return getConstBoolean(offset + 70, $match_cnd_flg);
	}

	public void match_cnd_flg(boolean value) {
		setConstBoolean(offset + 70, $match_cnd_flg, value);
	}


	public String getString(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($aprv_d_rmrks_up.equalsIgnoreCase(name)) {
			return aprv_d_rmrks_up();
		}
		if ($sub_char1_up.equalsIgnoreCase(name)) {
			return sub_char1_up();
		}
		if ($sub_char2_up.equalsIgnoreCase(name)) {
			return sub_char2_up();
		}
		if ($sub_char3_up.equalsIgnoreCase(name)) {
			return sub_char3_up();
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			return src_ins_usr_cd();
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			return src_ins_usr_nm();
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			return biz_usr_cd();
		}
		if ($biz_usr_nm.equalsIgnoreCase(name)) {
			return biz_usr_nm();
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_bp_nm.equalsIgnoreCase(name)) {
			return src_bp_nm();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_nm1.equalsIgnoreCase(name)) {
			return src_cur_nm1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_nm2.equalsIgnoreCase(name)) {
			return src_cur_nm2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_cur_nm3.equalsIgnoreCase(name)) {
			return src_cur_nm3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
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
		if ($aprv_d_sts_typ_up.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ_up();
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			return src_amt1();
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			return src_amt2();
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			return src_amt3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			return aprv_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ins_dt.equalsIgnoreCase(name)) {
			return ins_dt();
		}
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($acpt_check.equalsIgnoreCase(name)) {
			return acpt_check();
		}
		if ($rjct_check.equalsIgnoreCase(name)) {
			return rjct_check();
		}
		if ($main_role_flg.equalsIgnoreCase(name)) {
			return main_role_flg();
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			return sub_role_flg();
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			return not_upd_flg();
		}
		if ($deputy_flg.equalsIgnoreCase(name)) {
			return deputy_flg();
		}
		if ($match_cnd_flg.equalsIgnoreCase(name)) {
			return match_cnd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			return aprv_src_no1();
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			return aprv_src_no2();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($aprv_d_rmrks_up.equalsIgnoreCase(name)) {
			return aprv_d_rmrks_up();
		}
		if ($sub_char1_up.equalsIgnoreCase(name)) {
			return sub_char1_up();
		}
		if ($sub_char2_up.equalsIgnoreCase(name)) {
			return sub_char2_up();
		}
		if ($sub_char3_up.equalsIgnoreCase(name)) {
			return sub_char3_up();
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			return src_ins_usr_cd();
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			return src_ins_usr_nm();
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			return biz_usr_cd();
		}
		if ($biz_usr_nm.equalsIgnoreCase(name)) {
			return biz_usr_nm();
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			return src_dpt_nm();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_bp_nm.equalsIgnoreCase(name)) {
			return src_bp_nm();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_nm1.equalsIgnoreCase(name)) {
			return src_cur_nm1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_nm2.equalsIgnoreCase(name)) {
			return src_cur_nm2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_cur_nm3.equalsIgnoreCase(name)) {
			return src_cur_nm3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
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
		if ($aprv_d_sts_typ_up.equalsIgnoreCase(name)) {
			return aprv_d_sts_typ_up();
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			return src_amt1();
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			return src_amt2();
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			return src_amt3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			return aprv_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ins_dt.equalsIgnoreCase(name)) {
			return ins_dt();
		}
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($acpt_check.equalsIgnoreCase(name)) {
			return acpt_check();
		}
		if ($rjct_check.equalsIgnoreCase(name)) {
			return rjct_check();
		}
		if ($main_role_flg.equalsIgnoreCase(name)) {
			return main_role_flg();
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			return sub_role_flg();
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			return not_upd_flg();
		}
		if ($deputy_flg.equalsIgnoreCase(name)) {
			return deputy_flg();
		}
		if ($match_cnd_flg.equalsIgnoreCase(name)) {
			return match_cnd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
			return;
		}
		if ($aprv_d_rmrks_up.equalsIgnoreCase(name)) {
			aprv_d_rmrks_up(value);
			return;
		}
		if ($sub_char1_up.equalsIgnoreCase(name)) {
			sub_char1_up(value);
			return;
		}
		if ($sub_char2_up.equalsIgnoreCase(name)) {
			sub_char2_up(value);
			return;
		}
		if ($sub_char3_up.equalsIgnoreCase(name)) {
			sub_char3_up(value);
			return;
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			src_ins_usr_cd(value);
			return;
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			src_ins_usr_nm(value);
			return;
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			biz_usr_cd(value);
			return;
		}
		if ($biz_usr_nm.equalsIgnoreCase(name)) {
			biz_usr_nm(value);
			return;
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			aprv_func_typ_nm(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_bp_nm.equalsIgnoreCase(name)) {
			src_bp_nm(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_nm1.equalsIgnoreCase(name)) {
			src_cur_nm1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_nm2.equalsIgnoreCase(name)) {
			src_cur_nm2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_cur_nm3.equalsIgnoreCase(name)) {
			src_cur_nm3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
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
		if ($aprv_d_sts_typ_up.equalsIgnoreCase(name)) {
			aprv_d_sts_typ_up(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ins_dt.equalsIgnoreCase(name)) {
			ins_dt(value);
			return;
		}
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($acpt_check.equalsIgnoreCase(name)) {
			acpt_check(value);
			return;
		}
		if ($rjct_check.equalsIgnoreCase(name)) {
			rjct_check(value);
			return;
		}
		if ($main_role_flg.equalsIgnoreCase(name)) {
			main_role_flg(value);
			return;
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			sub_role_flg(value);
			return;
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			not_upd_flg(value);
			return;
		}
		if ($deputy_flg.equalsIgnoreCase(name)) {
			deputy_flg(value);
			return;
		}
		if ($match_cnd_flg.equalsIgnoreCase(name)) {
			match_cnd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_src_no1.equalsIgnoreCase(name)) {
			aprv_src_no1(value);
			return;
		}
		if ($aprv_src_no2.equalsIgnoreCase(name)) {
			aprv_src_no2(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
			return;
		}
		if ($aprv_d_rmrks_up.equalsIgnoreCase(name)) {
			aprv_d_rmrks_up(value);
			return;
		}
		if ($sub_char1_up.equalsIgnoreCase(name)) {
			sub_char1_up(value);
			return;
		}
		if ($sub_char2_up.equalsIgnoreCase(name)) {
			sub_char2_up(value);
			return;
		}
		if ($sub_char3_up.equalsIgnoreCase(name)) {
			sub_char3_up(value);
			return;
		}
		if ($src_ins_usr_cd.equalsIgnoreCase(name)) {
			src_ins_usr_cd(value);
			return;
		}
		if ($src_ins_usr_nm.equalsIgnoreCase(name)) {
			src_ins_usr_nm(value);
			return;
		}
		if ($biz_usr_cd.equalsIgnoreCase(name)) {
			biz_usr_cd(value);
			return;
		}
		if ($biz_usr_nm.equalsIgnoreCase(name)) {
			biz_usr_nm(value);
			return;
		}
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			aprv_func_typ_nm(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_dpt_nm.equalsIgnoreCase(name)) {
			src_dpt_nm(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_bp_nm.equalsIgnoreCase(name)) {
			src_bp_nm(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_nm1.equalsIgnoreCase(name)) {
			src_cur_nm1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_nm2.equalsIgnoreCase(name)) {
			src_cur_nm2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_cur_nm3.equalsIgnoreCase(name)) {
			src_cur_nm3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
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
		if ($aprv_d_sts_typ_up.equalsIgnoreCase(name)) {
			aprv_d_sts_typ_up(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($src_amt1.equalsIgnoreCase(name)) {
			src_amt1(value);
			return;
		}
		if ($src_amt2.equalsIgnoreCase(name)) {
			src_amt2(value);
			return;
		}
		if ($src_amt3.equalsIgnoreCase(name)) {
			src_amt3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($aprv_seq.equalsIgnoreCase(name)) {
			aprv_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ins_dt.equalsIgnoreCase(name)) {
			ins_dt(value);
			return;
		}
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($acpt_check.equalsIgnoreCase(name)) {
			acpt_check(value);
			return;
		}
		if ($rjct_check.equalsIgnoreCase(name)) {
			rjct_check(value);
			return;
		}
		if ($main_role_flg.equalsIgnoreCase(name)) {
			main_role_flg(value);
			return;
		}
		if ($sub_role_flg.equalsIgnoreCase(name)) {
			sub_role_flg(value);
			return;
		}
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($not_upd_flg.equalsIgnoreCase(name)) {
			not_upd_flg(value);
			return;
		}
		if ($deputy_flg.equalsIgnoreCase(name)) {
			deputy_flg(value);
			return;
		}
		if ($match_cnd_flg.equalsIgnoreCase(name)) {
			match_cnd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String src_itm_cd() {
		return itm_p().itm_cd();
	}

	public void src_itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String src_itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void src_itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String src_itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void src_itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String src_itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void src_itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String src_itm_nm() {
		return itm_p().itm_nm();
	}

	public void src_itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

}

