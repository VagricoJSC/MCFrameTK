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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public static final String $aprv_func_typ = "aprv_func_typ";
	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public static final String $aprv_func_typ_nm = "aprv_func_typ_nm";
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
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public static final String $aprv_src_no1 = "aprv_src_no1";
	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public static final String $aprv_src_no2 = "aprv_src_no2";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $aprv_sts_typ_nm = "aprv_sts_typ_nm";
	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public static final String $last_aprv_tm = "last_aprv_tm";
	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public static final String $last_aprv_usr_cd = "last_aprv_usr_cd";
	/**
	 * Final approver name 最終承認者名.<p>
	 *
	 */
	public static final String $last_aprv_usr_nm = "last_aprv_usr_nm";
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public static final String $ins_dt = "ins_dt";
	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public static final String $src_ins_usr_cd = "src_ins_usr_cd";
	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public static final String $src_ins_usr_nm = "src_ins_usr_nm";
	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public static final String $biz_usr_cd = "biz_usr_cd";
	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public static final String $biz_usr_nm = "biz_usr_nm";
	/**
	 * Approval requesting dept. cd. 承認依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	/**
	 * Approval requesting dept. name 承認依頼元部門名.<p>
	 *
	 */
	public static final String $src_dpt_nm = "src_dpt_nm";
	/**
	 * Approval requesting customer cd. 承認依頼元取引先ＣＤ.<p>
	 *
	 */
	public static final String $src_bp_cd = "src_bp_cd";
	/**
	 * Approval requesting customer name 承認依頼元取引先名.<p>
	 *
	 */
	public static final String $src_bp_nm = "src_bp_nm";
	/**
	 * Approval request source currency cd. 1 承認依頼元通貨ＣＤ１.<p>
	 *
	 */
	public static final String $src_cur_cd1 = "src_cur_cd1";
	/**
	 * Approval request source currency name 1 承認依頼元通貨名１.<p>
	 *
	 */
	public static final String $src_cur_nm1 = "src_cur_nm1";
	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public static final String $src_amt1 = "src_amt1";
	/**
	 * Approval request source currency cd. 2 承認依頼元通貨ＣＤ２.<p>
	 *
	 */
	public static final String $src_cur_cd2 = "src_cur_cd2";
	/**
	 * Approval request source currency name 2 承認依頼元通貨名２.<p>
	 *
	 */
	public static final String $src_cur_nm2 = "src_cur_nm2";
	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public static final String $src_amt2 = "src_amt2";
	/**
	 * Approval request source currency cd. 3 承認依頼元通貨ＣＤ３.<p>
	 *
	 */
	public static final String $src_cur_cd3 = "src_cur_cd3";
	/**
	 * Approval request source currency name 3 承認依頼元通貨名３.<p>
	 *
	 */
	public static final String $src_cur_nm3 = "src_cur_nm3";
	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public static final String $src_amt3 = "src_amt3";
	public static final String $itm_p = "itm_p";
	/**
	 * Approval request source extended column 1 承認依頼元拡張項目１.<p>
	 *
	 */
	public static final String $src_ext_key1 = "src_ext_key1";
	/**
	 * Approval request source extended column 2 承認依頼元拡張項目２.<p>
	 *
	 */
	public static final String $src_ext_key2 = "src_ext_key2";
	/**
	 * Approval request source extended column 3 承認依頼元拡張項目３.<p>
	 *
	 */
	public static final String $src_ext_key3 = "src_ext_key3";
	/**
	 * Next completed process 次処理済.<p>
	 *
	 */
	public static final String $next_opr_flg = "next_opr_flg";
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $aprv_can_flg = "aprv_can_flg";
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

	public static final String $src_itm_cd = $itm_p + ".itm_cd";
	public static final String $src_itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $src_itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $src_itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $src_itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_func_typ_nm_META = createCommonMeta($aprv_func_typ_nm, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP_NM);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_no_seq_META = createCommonMeta($aprv_no_seq, mcframe.commonMA.meta.MA_META.APRV_NO_SEQ);
	public static final MCMeta aprv_src_no1_META = createCommonMeta($aprv_src_no1, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_src_no2_META = createCommonMeta($aprv_src_no2, mcframe.commonMA.meta.MA_META.APRV_SRC_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta last_aprv_tm_META = createCommonMeta($last_aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta last_aprv_usr_cd_META = createCommonMeta($last_aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta last_aprv_usr_nm_META = createCommonMeta($last_aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ins_dt_META = createCommonMeta($ins_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta src_ins_usr_cd_META = createCommonMeta($src_ins_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta src_ins_usr_nm_META = createCommonMeta($src_ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta biz_usr_cd_META = createCommonMeta($biz_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta biz_usr_nm_META = createCommonMeta($biz_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
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
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta src_ext_key1_META = createCommonMeta($src_ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta src_ext_key2_META = createCommonMeta($src_ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta src_ext_key3_META = createCommonMeta($src_ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);
	public static final MCMeta next_opr_flg_META = createCommonMeta($next_opr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aprv_func_typ_META,
			aprv_func_typ_nm_META,
			aprv_no_META,
			aprv_no_seq_META,
			aprv_src_no1_META,
			aprv_src_no2_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			last_aprv_tm_META,
			last_aprv_usr_cd_META,
			last_aprv_usr_nm_META,
			ins_dt_META,
			src_ins_usr_cd_META,
			src_ins_usr_nm_META,
			biz_usr_cd_META,
			biz_usr_nm_META,
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
			itm_p_META,
			src_ext_key1_META,
			src_ext_key2_META,
			src_ext_key3_META,
			next_opr_flg_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
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
				"src_itm_cd",
				"src_itm_sub1",
				"src_itm_sub2",
				"src_itm_sub3",
				"src_itm_nm"
			},
			{
				$src_itm_cd,
				$src_itm_sub1,
				$src_itm_sub2,
				$src_itm_sub3,
				$src_itm_nm
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



	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 0, $aprv_func_typ);
	}

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 0, $aprv_func_typ, value);
	}


	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public String aprv_func_typ_nm() {
		return getConstString(offset + 1, $aprv_func_typ_nm);
	}

	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public void aprv_func_typ_nm(String value) {
		setConstString(offset + 1, $aprv_func_typ_nm, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 2, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 2, $aprv_no, value);
	}


	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCNumber aprv_no_seq() {
		return getConstNumber(offset + 3, $aprv_no_seq);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(MCNumber value) {
		setConstNumber(offset + 3, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(int value) {
		setConstNumber(offset + 3, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(long value) {
		setConstNumber(offset + 3, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(float value) {
		setConstNumber(offset + 3, $aprv_no_seq, value);
	}

	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public void aprv_no_seq(double value) {
		setConstNumber(offset + 3, $aprv_no_seq, value);
	}


	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public String aprv_src_no1() {
		return getConstString(offset + 4, $aprv_src_no1);
	}

	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public void aprv_src_no1(String value) {
		setConstString(offset + 4, $aprv_src_no1, value);
	}


	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public String aprv_src_no2() {
		return getConstString(offset + 5, $aprv_src_no2);
	}

	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public void aprv_src_no2(String value) {
		setConstString(offset + 5, $aprv_src_no2, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 6, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 6, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 7, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 7, $aprv_sts_typ_nm, value);
	}


	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public MCDate last_aprv_tm() {
		return getConstDate(offset + 8, $last_aprv_tm);
	}

	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public void last_aprv_tm(MCDate value) {
		setConstDate(offset + 8, $last_aprv_tm, value);
	}


	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public String last_aprv_usr_cd() {
		return getConstString(offset + 9, $last_aprv_usr_cd);
	}

	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public void last_aprv_usr_cd(String value) {
		setConstString(offset + 9, $last_aprv_usr_cd, value);
	}


	/**
	 * Final approver name 最終承認者名.<p>
	 *
	 */
	public String last_aprv_usr_nm() {
		return getConstString(offset + 10, $last_aprv_usr_nm);
	}

	/**
	 * Final approver name 最終承認者名.<p>
	 *
	 */
	public void last_aprv_usr_nm(String value) {
		setConstString(offset + 10, $last_aprv_usr_nm, value);
	}


	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDate ins_dt() {
		return getConstDate(offset + 11, $ins_dt);
	}

	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public void ins_dt(MCDate value) {
		setConstDate(offset + 11, $ins_dt, value);
	}


	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public String src_ins_usr_cd() {
		return getConstString(offset + 12, $src_ins_usr_cd);
	}

	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public void src_ins_usr_cd(String value) {
		setConstString(offset + 12, $src_ins_usr_cd, value);
	}


	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public String src_ins_usr_nm() {
		return getConstString(offset + 13, $src_ins_usr_nm);
	}

	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public void src_ins_usr_nm(String value) {
		setConstString(offset + 13, $src_ins_usr_nm, value);
	}


	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public String biz_usr_cd() {
		return getConstString(offset + 14, $biz_usr_cd);
	}

	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public void biz_usr_cd(String value) {
		setConstString(offset + 14, $biz_usr_cd, value);
	}


	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public String biz_usr_nm() {
		return getConstString(offset + 15, $biz_usr_nm);
	}

	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public void biz_usr_nm(String value) {
		setConstString(offset + 15, $biz_usr_nm, value);
	}


	/**
	 * Approval requesting dept. cd. 承認依頼元部門ＣＤ.<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 16, $src_dpt_cd);
	}

	/**
	 * Approval requesting dept. cd. 承認依頼元部門ＣＤ.<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 16, $src_dpt_cd, value);
	}


	/**
	 * Approval requesting dept. name 承認依頼元部門名.<p>
	 *
	 */
	public String src_dpt_nm() {
		return getConstString(offset + 17, $src_dpt_nm);
	}

	/**
	 * Approval requesting dept. name 承認依頼元部門名.<p>
	 *
	 */
	public void src_dpt_nm(String value) {
		setConstString(offset + 17, $src_dpt_nm, value);
	}


	/**
	 * Approval requesting customer cd. 承認依頼元取引先ＣＤ.<p>
	 *
	 */
	public String src_bp_cd() {
		return getConstString(offset + 18, $src_bp_cd);
	}

	/**
	 * Approval requesting customer cd. 承認依頼元取引先ＣＤ.<p>
	 *
	 */
	public void src_bp_cd(String value) {
		setConstString(offset + 18, $src_bp_cd, value);
	}


	/**
	 * Approval requesting customer name 承認依頼元取引先名.<p>
	 *
	 */
	public String src_bp_nm() {
		return getConstString(offset + 19, $src_bp_nm);
	}

	/**
	 * Approval requesting customer name 承認依頼元取引先名.<p>
	 *
	 */
	public void src_bp_nm(String value) {
		setConstString(offset + 19, $src_bp_nm, value);
	}


	/**
	 * Approval request source currency cd. 1 承認依頼元通貨ＣＤ１.<p>
	 *
	 */
	public String src_cur_cd1() {
		return getConstString(offset + 20, $src_cur_cd1);
	}

	/**
	 * Approval request source currency cd. 1 承認依頼元通貨ＣＤ１.<p>
	 *
	 */
	public void src_cur_cd1(String value) {
		setConstString(offset + 20, $src_cur_cd1, value);
	}


	/**
	 * Approval request source currency name 1 承認依頼元通貨名１.<p>
	 *
	 */
	public String src_cur_nm1() {
		return getConstString(offset + 21, $src_cur_nm1);
	}

	/**
	 * Approval request source currency name 1 承認依頼元通貨名１.<p>
	 *
	 */
	public void src_cur_nm1(String value) {
		setConstString(offset + 21, $src_cur_nm1, value);
	}


	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public MCNumber src_amt1() {
		return getConstNumber(offset + 22, $src_amt1);
	}

	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public void src_amt1(MCNumber value) {
		setConstNumber(offset + 22, $src_amt1, value);
	}

	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public void src_amt1(int value) {
		setConstNumber(offset + 22, $src_amt1, value);
	}

	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public void src_amt1(long value) {
		setConstNumber(offset + 22, $src_amt1, value);
	}

	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public void src_amt1(float value) {
		setConstNumber(offset + 22, $src_amt1, value);
	}

	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public void src_amt1(double value) {
		setConstNumber(offset + 22, $src_amt1, value);
	}


	/**
	 * Approval request source currency cd. 2 承認依頼元通貨ＣＤ２.<p>
	 *
	 */
	public String src_cur_cd2() {
		return getConstString(offset + 23, $src_cur_cd2);
	}

	/**
	 * Approval request source currency cd. 2 承認依頼元通貨ＣＤ２.<p>
	 *
	 */
	public void src_cur_cd2(String value) {
		setConstString(offset + 23, $src_cur_cd2, value);
	}


	/**
	 * Approval request source currency name 2 承認依頼元通貨名２.<p>
	 *
	 */
	public String src_cur_nm2() {
		return getConstString(offset + 24, $src_cur_nm2);
	}

	/**
	 * Approval request source currency name 2 承認依頼元通貨名２.<p>
	 *
	 */
	public void src_cur_nm2(String value) {
		setConstString(offset + 24, $src_cur_nm2, value);
	}


	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public MCNumber src_amt2() {
		return getConstNumber(offset + 25, $src_amt2);
	}

	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public void src_amt2(MCNumber value) {
		setConstNumber(offset + 25, $src_amt2, value);
	}

	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public void src_amt2(int value) {
		setConstNumber(offset + 25, $src_amt2, value);
	}

	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public void src_amt2(long value) {
		setConstNumber(offset + 25, $src_amt2, value);
	}

	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public void src_amt2(float value) {
		setConstNumber(offset + 25, $src_amt2, value);
	}

	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public void src_amt2(double value) {
		setConstNumber(offset + 25, $src_amt2, value);
	}


	/**
	 * Approval request source currency cd. 3 承認依頼元通貨ＣＤ３.<p>
	 *
	 */
	public String src_cur_cd3() {
		return getConstString(offset + 26, $src_cur_cd3);
	}

	/**
	 * Approval request source currency cd. 3 承認依頼元通貨ＣＤ３.<p>
	 *
	 */
	public void src_cur_cd3(String value) {
		setConstString(offset + 26, $src_cur_cd3, value);
	}


	/**
	 * Approval request source currency name 3 承認依頼元通貨名３.<p>
	 *
	 */
	public String src_cur_nm3() {
		return getConstString(offset + 27, $src_cur_nm3);
	}

	/**
	 * Approval request source currency name 3 承認依頼元通貨名３.<p>
	 *
	 */
	public void src_cur_nm3(String value) {
		setConstString(offset + 27, $src_cur_nm3, value);
	}


	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public MCNumber src_amt3() {
		return getConstNumber(offset + 28, $src_amt3);
	}

	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public void src_amt3(MCNumber value) {
		setConstNumber(offset + 28, $src_amt3, value);
	}

	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public void src_amt3(int value) {
		setConstNumber(offset + 28, $src_amt3, value);
	}

	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public void src_amt3(long value) {
		setConstNumber(offset + 28, $src_amt3, value);
	}

	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public void src_amt3(float value) {
		setConstNumber(offset + 28, $src_amt3, value);
	}

	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public void src_amt3(double value) {
		setConstNumber(offset + 28, $src_amt3, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 29, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 29, $itm_p, row);
	}


	/**
	 * Approval request source extended column 1 承認依頼元拡張項目１.<p>
	 *
	 */
	public String src_ext_key1() {
		return getConstString(offset + 30, $src_ext_key1);
	}

	/**
	 * Approval request source extended column 1 承認依頼元拡張項目１.<p>
	 *
	 */
	public void src_ext_key1(String value) {
		setConstString(offset + 30, $src_ext_key1, value);
	}


	/**
	 * Approval request source extended column 2 承認依頼元拡張項目２.<p>
	 *
	 */
	public String src_ext_key2() {
		return getConstString(offset + 31, $src_ext_key2);
	}

	/**
	 * Approval request source extended column 2 承認依頼元拡張項目２.<p>
	 *
	 */
	public void src_ext_key2(String value) {
		setConstString(offset + 31, $src_ext_key2, value);
	}


	/**
	 * Approval request source extended column 3 承認依頼元拡張項目３.<p>
	 *
	 */
	public String src_ext_key3() {
		return getConstString(offset + 32, $src_ext_key3);
	}

	/**
	 * Approval request source extended column 3 承認依頼元拡張項目３.<p>
	 *
	 */
	public void src_ext_key3(String value) {
		setConstString(offset + 32, $src_ext_key3, value);
	}


	/**
	 * Next completed process 次処理済.<p>
	 *
	 */
	public boolean next_opr_flg() {
		return getConstBoolean(offset + 33, $next_opr_flg);
	}

	/**
	 * Next completed process 次処理済.<p>
	 *
	 */
	public void next_opr_flg(boolean value) {
		setConstBoolean(offset + 33, $next_opr_flg, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 34, $aprv_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 34, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 35, $aprv_can_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 35, $aprv_can_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 36, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 36, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 37, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 37, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 38, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 38, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 39, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 39, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 40, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 41, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 41, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 42, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 42, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 43, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 43, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 44, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 44, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 45, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 46, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 46, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
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
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			return last_aprv_usr_cd();
		}
		if ($last_aprv_usr_nm.equalsIgnoreCase(name)) {
			return last_aprv_usr_nm();
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
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			return last_aprv_tm();
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			return ins_dt();
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
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
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			return last_aprv_usr_cd();
		}
		if ($last_aprv_usr_nm.equalsIgnoreCase(name)) {
			return last_aprv_usr_nm();
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
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			return last_aprv_tm();
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			return ins_dt();
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			return next_opr_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			aprv_func_typ_nm(value);
			return;
		}
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
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			last_aprv_usr_cd(value);
			return;
		}
		if ($last_aprv_usr_nm.equalsIgnoreCase(name)) {
			last_aprv_usr_nm(value);
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
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			last_aprv_tm(value);
			return;
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			ins_dt(value);
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			aprv_func_typ_nm(value);
			return;
		}
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
		if ($last_aprv_usr_cd.equalsIgnoreCase(name)) {
			last_aprv_usr_cd(value);
			return;
		}
		if ($last_aprv_usr_nm.equalsIgnoreCase(name)) {
			last_aprv_usr_nm(value);
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
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($last_aprv_tm.equalsIgnoreCase(name)) {
			last_aprv_tm(value);
			return;
		}
		if ($ins_dt.equalsIgnoreCase(name)) {
			ins_dt(value);
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
		if ($next_opr_flg.equalsIgnoreCase(name)) {
			next_opr_flg(value);
			return;
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			aprv_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
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
		super.setInnerRow(name, value);
	}


	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public String src_itm_cd() {
		return itm_p().itm_cd();
	}

	/**
	 * Approval creating source item cd. 承認作成元品目ＣＤ.<p>
	 *
	 */
	public void src_itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public String src_itm_sub1() {
		return itm_p().itm_sub1();
	}

	/**
	 * Approval creating source branch No. 1 承認作成元枝番１.<p>
	 *
	 */
	public void src_itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public String src_itm_sub2() {
		return itm_p().itm_sub2();
	}

	/**
	 * Approval creating source branch No. 2 承認作成元枝番２.<p>
	 *
	 */
	public void src_itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public String src_itm_sub3() {
		return itm_p().itm_sub3();
	}

	/**
	 * Approval creating source branch No. 3 承認作成元枝番３.<p>
	 *
	 */
	public void src_itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	/**
	 * Approval creating source item name 承認作成元品名.<p>
	 *
	 */
	public String src_itm_nm() {
		return itm_p().itm_nm();
	}

	/**
	 * Approval creating source item name 承認作成元品名.<p>
	 *
	 */
	public void src_itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

