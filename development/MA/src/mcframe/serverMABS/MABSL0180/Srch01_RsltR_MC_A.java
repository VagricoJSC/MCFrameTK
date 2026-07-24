package mcframe.serverMABS.MABSL0180;

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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public static final String $insp_seq = "insp_seq";
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
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public static final String $insp_point_cd = "insp_point_cd";
	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public static final String $insp_point_nm = "insp_point_nm";
	/**
	 * Prior inspection copy type 先行検査引継区分.<p>
	 *
	 */
	public static final String $pre_insp_inf_typ = "pre_insp_inf_typ";
	/**
	 * Prior inspection copy type name 先行検査引継区分名.<p>
	 *
	 */
	public static final String $pre_insp_inf_typ_nm = "pre_insp_inf_typ_nm";
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public static final String $insp_qlqn_typ = "insp_qlqn_typ";
	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public static final String $insp_qlqn_typ_nm = "insp_qlqn_typ_nm";
	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public static final String $ql_std_val = "ql_std_val";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public static final String $qn_int_digit = "qn_int_digit";
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public static final String $qn_int_frac = "qn_int_frac";
	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public static final String $qn_out_min = "qn_out_min";
	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_out_min_typ = "sign_out_min_typ";
	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public static final String $sign_out_min_typ_nm = "sign_out_min_typ_nm";
	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_out_max_typ = "sign_out_max_typ";
	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public static final String $sign_out_max_typ_nm = "sign_out_max_typ_nm";
	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public static final String $qn_out_max = "qn_out_max";
	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public static final String $qn_in_min = "qn_in_min";
	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public static final String $sign_in_min_typ = "sign_in_min_typ";
	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public static final String $sign_in_min_typ_nm = "sign_in_min_typ_nm";
	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public static final String $sign_in_max_typ = "sign_in_max_typ";
	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public static final String $sign_in_max_typ_nm = "sign_in_max_typ_nm";
	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public static final String $qn_in_max = "qn_in_max";
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
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta insp_seq_META = createCommonMeta($insp_seq, mcframe.commonMA.meta.MA_META.INSP_SEQ);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_point_cd_META = createCommonMeta($insp_point_cd, mcframe.commonMA.meta.MA_META.INSP_POINT_CD);
	public static final MCMeta insp_point_nm_META = createCommonMeta($insp_point_nm, mcframe.commonMA.meta.MA_META.INSP_POINT_NM);
	public static final MCMeta pre_insp_inf_typ_META = createCommonMeta($pre_insp_inf_typ, mcframe.commonMA.meta.MA_META.PRE_INSP_INF_TYP);
	public static final MCMeta pre_insp_inf_typ_nm_META = createCommonMeta($pre_insp_inf_typ_nm, mcframe.commonMA.meta.MA_META.PRE_INSP_INF_TYP_NM);
	public static final MCMeta insp_qlqn_typ_META = createCommonMeta($insp_qlqn_typ, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP);
	public static final MCMeta insp_qlqn_typ_nm_META = createCommonMeta($insp_qlqn_typ_nm, mcframe.commonMA.meta.MA_META.INSP_QLQN_TYP_NM);
	public static final MCMeta ql_std_val_META = createCommonMeta($ql_std_val, mcframe.commonMA.meta.MA_META.QL_STD_VAL);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qn_int_digit_META = createCommonMeta($qn_int_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_int_frac_META = createCommonMeta($qn_int_frac, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta qn_out_min_META = createCommonMeta($qn_out_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_out_min_typ_META = createCommonMeta($sign_out_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_min_typ_nm_META = createCommonMeta($sign_out_min_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta sign_out_max_typ_META = createCommonMeta($sign_out_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_out_max_typ_nm_META = createCommonMeta($sign_out_max_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_out_max_META = createCommonMeta($qn_out_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta qn_in_min_META = createCommonMeta($qn_in_min, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
	public static final MCMeta sign_in_min_typ_META = createCommonMeta($sign_in_min_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_min_typ_nm_META = createCommonMeta($sign_in_min_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta sign_in_max_typ_META = createCommonMeta($sign_in_max_typ, mcframe.commonMA.meta.MA_META.SIGN_TYP);
	public static final MCMeta sign_in_max_typ_nm_META = createCommonMeta($sign_in_max_typ_nm, mcframe.commonMA.meta.MA_META.SIGN_TYP_NM);
	public static final MCMeta qn_in_max_META = createCommonMeta($qn_in_max, mcframe.commonMA.meta.MA_META.QN_INSP_VAL);
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

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			insp_seq_META,
			st_dt_META,
			end_dt_META,
			insp_point_cd_META,
			insp_point_nm_META,
			pre_insp_inf_typ_META,
			pre_insp_inf_typ_nm_META,
			insp_qlqn_typ_META,
			insp_qlqn_typ_nm_META,
			ql_std_val_META,
			unit_cd_META,
			unit_nm_META,
			qn_int_digit_META,
			qn_int_frac_META,
			qn_out_min_META,
			sign_out_min_typ_META,
			sign_out_min_typ_nm_META,
			sign_out_max_typ_META,
			sign_out_max_typ_nm_META,
			qn_out_max_META,
			qn_in_min_META,
			sign_in_min_typ_META,
			sign_in_min_typ_nm_META,
			sign_in_max_typ_META,
			sign_in_max_typ_nm_META,
			qn_in_max_META,
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
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$pre_insp_inf_typ, "MAC_PRE_INSP_INF_TYP"},	// pre_insp_inf_typ
				{$insp_qlqn_typ, "MAC_INSP_QLQN_TYP"},	// insp_qlqn_typ
				{$sign_out_min_typ, "MAC_SIGN_TYP"},	// sign_out_min_typ
				{$sign_out_max_typ, "MAC_SIGN_TYP"},	// sign_out_max_typ
				{$sign_in_min_typ, "MAC_SIGN_TYP"},	// sign_in_min_typ
				{$sign_in_max_typ, "MAC_SIGN_TYP"}	// sign_in_max_typ
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 6, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 6, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 7, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 7, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 8, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 8, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 9, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 9, $itm_typ_d_nm, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 10, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 10, $insp_ptn_cd, value);
	}


	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 11, $insp_ptn_nm);
	}

	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 11, $insp_ptn_nm, value);
	}


	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public MCNumber insp_seq() {
		return getConstNumber(offset + 12, $insp_seq);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(MCNumber value) {
		setConstNumber(offset + 12, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(int value) {
		setConstNumber(offset + 12, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(long value) {
		setConstNumber(offset + 12, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(float value) {
		setConstNumber(offset + 12, $insp_seq, value);
	}

	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public void insp_seq(double value) {
		setConstNumber(offset + 12, $insp_seq, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 13, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 13, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 14, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 14, $end_dt, value);
	}


	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public String insp_point_cd() {
		return getConstString(offset + 15, $insp_point_cd);
	}

	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public void insp_point_cd(String value) {
		setConstString(offset + 15, $insp_point_cd, value);
	}


	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public String insp_point_nm() {
		return getConstString(offset + 16, $insp_point_nm);
	}

	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public void insp_point_nm(String value) {
		setConstString(offset + 16, $insp_point_nm, value);
	}


	/**
	 * Prior inspection copy type 先行検査引継区分.<p>
	 *
	 */
	public String pre_insp_inf_typ() {
		return getConstString(offset + 17, $pre_insp_inf_typ);
	}

	/**
	 * Prior inspection copy type 先行検査引継区分.<p>
	 *
	 */
	public void pre_insp_inf_typ(String value) {
		setConstString(offset + 17, $pre_insp_inf_typ, value);
	}


	/**
	 * Prior inspection copy type name 先行検査引継区分名.<p>
	 *
	 */
	public String pre_insp_inf_typ_nm() {
		return getConstString(offset + 18, $pre_insp_inf_typ_nm);
	}

	/**
	 * Prior inspection copy type name 先行検査引継区分名.<p>
	 *
	 */
	public void pre_insp_inf_typ_nm(String value) {
		setConstString(offset + 18, $pre_insp_inf_typ_nm, value);
	}


	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public String insp_qlqn_typ() {
		return getConstString(offset + 19, $insp_qlqn_typ);
	}

	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public void insp_qlqn_typ(String value) {
		setConstString(offset + 19, $insp_qlqn_typ, value);
	}


	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public String insp_qlqn_typ_nm() {
		return getConstString(offset + 20, $insp_qlqn_typ_nm);
	}

	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public void insp_qlqn_typ_nm(String value) {
		setConstString(offset + 20, $insp_qlqn_typ_nm, value);
	}


	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public String ql_std_val() {
		return getConstString(offset + 21, $ql_std_val);
	}

	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public void ql_std_val(String value) {
		setConstString(offset + 21, $ql_std_val, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 22, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 22, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 23, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 23, $unit_nm, value);
	}


	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_digit() {
		return getConstNumber(offset + 24, $qn_int_digit);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(MCNumber value) {
		setConstNumber(offset + 24, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(int value) {
		setConstNumber(offset + 24, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(long value) {
		setConstNumber(offset + 24, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(float value) {
		setConstNumber(offset + 24, $qn_int_digit, value);
	}

	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public void qn_int_digit(double value) {
		setConstNumber(offset + 24, $qn_int_digit, value);
	}


	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCNumber qn_int_frac() {
		return getConstNumber(offset + 25, $qn_int_frac);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(MCNumber value) {
		setConstNumber(offset + 25, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(int value) {
		setConstNumber(offset + 25, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(long value) {
		setConstNumber(offset + 25, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(float value) {
		setConstNumber(offset + 25, $qn_int_frac, value);
	}

	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public void qn_int_frac(double value) {
		setConstNumber(offset + 25, $qn_int_frac, value);
	}


	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public MCNumber qn_out_min() {
		return getConstNumber(offset + 26, $qn_out_min);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(MCNumber value) {
		setConstNumber(offset + 26, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(int value) {
		setConstNumber(offset + 26, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(long value) {
		setConstNumber(offset + 26, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(float value) {
		setConstNumber(offset + 26, $qn_out_min, value);
	}

	/**
	 * Lower limit of external specification 外規格下限値.<p>
	 *
	 */
	public void qn_out_min(double value) {
		setConstNumber(offset + 26, $qn_out_min, value);
	}


	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public String sign_out_min_typ() {
		return getConstString(offset + 27, $sign_out_min_typ);
	}

	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public void sign_out_min_typ(String value) {
		setConstString(offset + 27, $sign_out_min_typ, value);
	}


	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public String sign_out_min_typ_nm() {
		return getConstString(offset + 28, $sign_out_min_typ_nm);
	}

	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public void sign_out_min_typ_nm(String value) {
		setConstString(offset + 28, $sign_out_min_typ_nm, value);
	}


	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public String sign_out_max_typ() {
		return getConstString(offset + 29, $sign_out_max_typ);
	}

	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public void sign_out_max_typ(String value) {
		setConstString(offset + 29, $sign_out_max_typ, value);
	}


	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public String sign_out_max_typ_nm() {
		return getConstString(offset + 30, $sign_out_max_typ_nm);
	}

	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public void sign_out_max_typ_nm(String value) {
		setConstString(offset + 30, $sign_out_max_typ_nm, value);
	}


	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public MCNumber qn_out_max() {
		return getConstNumber(offset + 31, $qn_out_max);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(MCNumber value) {
		setConstNumber(offset + 31, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(int value) {
		setConstNumber(offset + 31, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(long value) {
		setConstNumber(offset + 31, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(float value) {
		setConstNumber(offset + 31, $qn_out_max, value);
	}

	/**
	 * Upper limit of external specification 外規格上限値.<p>
	 *
	 */
	public void qn_out_max(double value) {
		setConstNumber(offset + 31, $qn_out_max, value);
	}


	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public MCNumber qn_in_min() {
		return getConstNumber(offset + 32, $qn_in_min);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(MCNumber value) {
		setConstNumber(offset + 32, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(int value) {
		setConstNumber(offset + 32, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(long value) {
		setConstNumber(offset + 32, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(float value) {
		setConstNumber(offset + 32, $qn_in_min, value);
	}

	/**
	 * Lower limit of internal specification 内規格下限値.<p>
	 *
	 */
	public void qn_in_min(double value) {
		setConstNumber(offset + 32, $qn_in_min, value);
	}


	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public String sign_in_min_typ() {
		return getConstString(offset + 33, $sign_in_min_typ);
	}

	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public void sign_in_min_typ(String value) {
		setConstString(offset + 33, $sign_in_min_typ, value);
	}


	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public String sign_in_min_typ_nm() {
		return getConstString(offset + 34, $sign_in_min_typ_nm);
	}

	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public void sign_in_min_typ_nm(String value) {
		setConstString(offset + 34, $sign_in_min_typ_nm, value);
	}


	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public String sign_in_max_typ() {
		return getConstString(offset + 35, $sign_in_max_typ);
	}

	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public void sign_in_max_typ(String value) {
		setConstString(offset + 35, $sign_in_max_typ, value);
	}


	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public String sign_in_max_typ_nm() {
		return getConstString(offset + 36, $sign_in_max_typ_nm);
	}

	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public void sign_in_max_typ_nm(String value) {
		setConstString(offset + 36, $sign_in_max_typ_nm, value);
	}


	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public MCNumber qn_in_max() {
		return getConstNumber(offset + 37, $qn_in_max);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(MCNumber value) {
		setConstNumber(offset + 37, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(int value) {
		setConstNumber(offset + 37, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(long value) {
		setConstNumber(offset + 37, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(float value) {
		setConstNumber(offset + 37, $qn_in_max, value);
	}

	/**
	 * Upper limit of internal specification 内規格上限値.<p>
	 *
	 */
	public void qn_in_max(double value) {
		setConstNumber(offset + 37, $qn_in_max, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 38, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 38, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 39, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 39, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 40, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 40, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 41, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 41, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 42, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 42, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 43, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 44, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 44, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 45, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 45, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 46, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 46, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 47, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 47, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 48, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 48, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 49, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 50, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 50, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 51, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 51, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 52, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 52, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 53, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 53, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 54, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 54, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 55, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $del_ts, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			return pre_insp_inf_typ();
		}
		if ($pre_insp_inf_typ_nm.equalsIgnoreCase(name)) {
			return pre_insp_inf_typ_nm();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			return insp_qlqn_typ_nm();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_min_typ_nm();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_max_typ_nm();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_min_typ_nm();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_max_typ_nm();
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			return insp_point_cd();
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			return insp_point_nm();
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			return pre_insp_inf_typ();
		}
		if ($pre_insp_inf_typ_nm.equalsIgnoreCase(name)) {
			return pre_insp_inf_typ_nm();
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			return insp_qlqn_typ();
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			return insp_qlqn_typ_nm();
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			return ql_std_val();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			return sign_out_min_typ();
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_min_typ_nm();
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			return sign_out_max_typ();
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_out_max_typ_nm();
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			return sign_in_min_typ();
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_min_typ_nm();
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			return sign_in_max_typ();
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			return sign_in_max_typ_nm();
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			return insp_seq();
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			return qn_int_digit();
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			return qn_int_frac();
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			return qn_out_min();
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			return qn_out_max();
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			return qn_in_min();
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			return qn_in_max();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			pre_insp_inf_typ(value);
			return;
		}
		if ($pre_insp_inf_typ_nm.equalsIgnoreCase(name)) {
			pre_insp_inf_typ_nm(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			insp_qlqn_typ_nm(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			sign_out_min_typ_nm(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			sign_out_max_typ_nm(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			sign_in_min_typ_nm(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			sign_in_max_typ_nm(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($insp_point_cd.equalsIgnoreCase(name)) {
			insp_point_cd(value);
			return;
		}
		if ($insp_point_nm.equalsIgnoreCase(name)) {
			insp_point_nm(value);
			return;
		}
		if ($pre_insp_inf_typ.equalsIgnoreCase(name)) {
			pre_insp_inf_typ(value);
			return;
		}
		if ($pre_insp_inf_typ_nm.equalsIgnoreCase(name)) {
			pre_insp_inf_typ_nm(value);
			return;
		}
		if ($insp_qlqn_typ.equalsIgnoreCase(name)) {
			insp_qlqn_typ(value);
			return;
		}
		if ($insp_qlqn_typ_nm.equalsIgnoreCase(name)) {
			insp_qlqn_typ_nm(value);
			return;
		}
		if ($ql_std_val.equalsIgnoreCase(name)) {
			ql_std_val(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($sign_out_min_typ.equalsIgnoreCase(name)) {
			sign_out_min_typ(value);
			return;
		}
		if ($sign_out_min_typ_nm.equalsIgnoreCase(name)) {
			sign_out_min_typ_nm(value);
			return;
		}
		if ($sign_out_max_typ.equalsIgnoreCase(name)) {
			sign_out_max_typ(value);
			return;
		}
		if ($sign_out_max_typ_nm.equalsIgnoreCase(name)) {
			sign_out_max_typ_nm(value);
			return;
		}
		if ($sign_in_min_typ.equalsIgnoreCase(name)) {
			sign_in_min_typ(value);
			return;
		}
		if ($sign_in_min_typ_nm.equalsIgnoreCase(name)) {
			sign_in_min_typ_nm(value);
			return;
		}
		if ($sign_in_max_typ.equalsIgnoreCase(name)) {
			sign_in_max_typ(value);
			return;
		}
		if ($sign_in_max_typ_nm.equalsIgnoreCase(name)) {
			sign_in_max_typ_nm(value);
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
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($insp_seq.equalsIgnoreCase(name)) {
			insp_seq(value);
			return;
		}
		if ($qn_int_digit.equalsIgnoreCase(name)) {
			qn_int_digit(value);
			return;
		}
		if ($qn_int_frac.equalsIgnoreCase(name)) {
			qn_int_frac(value);
			return;
		}
		if ($qn_out_min.equalsIgnoreCase(name)) {
			qn_out_min(value);
			return;
		}
		if ($qn_out_max.equalsIgnoreCase(name)) {
			qn_out_max(value);
			return;
		}
		if ($qn_in_min.equalsIgnoreCase(name)) {
			qn_in_min(value);
			return;
		}
		if ($qn_in_max.equalsIgnoreCase(name)) {
			qn_in_max(value);
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
		super.setBooleanNE(name, value);
	}



}

