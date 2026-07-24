package mcframe.clientMSBE.MSBEP1750;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public static final String $non_cmpl_flg = "non_cmpl_flg";
	/**
	 * Completed 完了済.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
	/**
	 * Packing list immediate issue パッキングリスト即時発行.<p>
	 *
	 */
	public static final String $pl_immed_prnt_flg = "pl_immed_prnt_flg";
	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public static final String $pl_prnt_flg = "pl_prnt_flg";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ_nm = "ship_rqst_id_typ_nm";
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public static final String $ship_rqst_id_nm = "ship_rqst_id_nm";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public static final String $pl_rmrks = "pl_rmrks";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public static final String $ttl_net_wt = "ttl_net_wt";
	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public static final String $ttl_grss_wt = "ttl_grss_wt";
	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public static final String $ttl_dim = "ttl_dim";
	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public static final String $iv_src_typ = "iv_src_typ";


	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta non_cmpl_flg_META = createCommonMeta($non_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_immed_prnt_flg_META = createCommonMeta($pl_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pl_prnt_flg_META = createCommonMeta($pl_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta ship_rqst_id_typ_nm_META = createCommonMeta($ship_rqst_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP_NM);
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_nm_META = createCommonMeta($ship_rqst_id_nm, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta pl_rmrks_META = createCommonMeta($pl_rmrks, mcframe.commonMS.meta.MS_META.PL_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ttl_net_wt_META = createCommonMeta($ttl_net_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ttl_grss_wt_META = createCommonMeta($ttl_grss_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ttl_dim_META = createCommonMeta($ttl_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta iv_src_typ_META = createCommonMeta($iv_src_typ, mcframe.commonMS.meta.MS_META.IV_SRC_TYP);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			iv_no_META,
			non_cmpl_flg_META,
			cmpl_flg_META,
			pl_immed_prnt_flg_META,
			pl_prnt_flg_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			ship_rqst_id_typ_META,
			ship_rqst_id_typ_nm_META,
			ship_rqst_id_cd_META,
			ship_rqst_id_nm_META,
			tdlv_cd_META,
			tdlv_nm_META,
			trnspt_cd_META,
			trnspt_nm_META,
			pl_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META,
			ttl_net_wt_META,
			ttl_grss_wt_META,
			ttl_dim_META,
			iv_src_typ_META
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
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 0, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 0, $iv_no, value);
	}


	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public boolean non_cmpl_flg() {
		return getConstBoolean(offset + 1, $non_cmpl_flg);
	}

	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public void non_cmpl_flg(boolean value) {
		setConstBoolean(offset + 1, $non_cmpl_flg, value);
	}


	/**
	 * Completed 完了済.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 2, $cmpl_flg);
	}

	/**
	 * Completed 完了済.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 2, $cmpl_flg, value);
	}


	/**
	 * Packing list immediate issue パッキングリスト即時発行.<p>
	 *
	 */
	public boolean pl_immed_prnt_flg() {
		return getConstBoolean(offset + 3, $pl_immed_prnt_flg);
	}

	/**
	 * Packing list immediate issue パッキングリスト即時発行.<p>
	 *
	 */
	public void pl_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 3, $pl_immed_prnt_flg, value);
	}


	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public boolean pl_prnt_flg() {
		return getConstBoolean(offset + 4, $pl_prnt_flg);
	}

	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public void pl_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $pl_prnt_flg, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 5, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 5, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 6, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 6, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 7, $dlv_id_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 7, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 8, $dlv_id_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 8, $dlv_id_nm, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 9, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 9, $dlv_cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 10, $dlv_cntry_nm);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 10, $dlv_cntry_nm, value);
	}


	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 11, $ship_rqst_id_typ);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 11, $ship_rqst_id_typ, value);
	}


	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public String ship_rqst_id_typ_nm() {
		return getConstString(offset + 12, $ship_rqst_id_typ_nm);
	}

	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public void ship_rqst_id_typ_nm(String value) {
		setConstString(offset + 12, $ship_rqst_id_typ_nm, value);
	}


	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 13, $ship_rqst_id_cd);
	}

	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 13, $ship_rqst_id_cd, value);
	}


	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public String ship_rqst_id_nm() {
		return getConstString(offset + 14, $ship_rqst_id_nm);
	}

	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public void ship_rqst_id_nm(String value) {
		setConstString(offset + 14, $ship_rqst_id_nm, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 15, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 15, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 16, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 16, $tdlv_nm, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 17, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 17, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 18, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 18, $trnspt_nm, value);
	}


	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public String pl_rmrks() {
		return getConstString(offset + 19, $pl_rmrks);
	}

	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public void pl_rmrks(String value) {
		setConstString(offset + 19, $pl_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 20, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 20, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 21, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 21, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 22, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 22, $sub_char3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 25, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 25, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 26, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 26, $ins_func_nm, value);
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
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 29, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 29, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 30, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 30, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 31, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 32, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 34, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}


	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public MCNumber ttl_net_wt() {
		return getConstNumber(offset + 35, $ttl_net_wt);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(MCNumber value) {
		setConstNumber(offset + 35, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(int value) {
		setConstNumber(offset + 35, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(long value) {
		setConstNumber(offset + 35, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(float value) {
		setConstNumber(offset + 35, $ttl_net_wt, value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(double value) {
		setConstNumber(offset + 35, $ttl_net_wt, value);
	}


	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public MCNumber ttl_grss_wt() {
		return getConstNumber(offset + 36, $ttl_grss_wt);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(MCNumber value) {
		setConstNumber(offset + 36, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(int value) {
		setConstNumber(offset + 36, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(long value) {
		setConstNumber(offset + 36, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(float value) {
		setConstNumber(offset + 36, $ttl_grss_wt, value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(double value) {
		setConstNumber(offset + 36, $ttl_grss_wt, value);
	}


	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public MCNumber ttl_dim() {
		return getConstNumber(offset + 37, $ttl_dim);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(MCNumber value) {
		setConstNumber(offset + 37, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(int value) {
		setConstNumber(offset + 37, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(long value) {
		setConstNumber(offset + 37, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(float value) {
		setConstNumber(offset + 37, $ttl_dim, value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(double value) {
		setConstNumber(offset + 37, $ttl_dim, value);
	}


	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public String iv_src_typ() {
		return getConstString(offset + 38, $iv_src_typ);
	}

	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public void iv_src_typ(String value) {
		setConstString(offset + 38, $iv_src_typ, value);
	}


	public String getString(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
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
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			return ttl_net_wt();
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			return ttl_grss_wt();
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			return ttl_dim();
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($pl_immed_prnt_flg.equalsIgnoreCase(name)) {
			return pl_immed_prnt_flg();
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ_nm();
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			return ship_rqst_id_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			return pl_rmrks();
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
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			return ttl_net_wt();
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			return ttl_grss_wt();
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			return ttl_dim();
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			return non_cmpl_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		if ($pl_immed_prnt_flg.equalsIgnoreCase(name)) {
			return pl_immed_prnt_flg();
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			return pl_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
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
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($pl_immed_prnt_flg.equalsIgnoreCase(name)) {
			pl_immed_prnt_flg(value);
			return;
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		if ($ship_rqst_id_typ_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_typ_nm(value);
			return;
		}
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_nm.equalsIgnoreCase(name)) {
			ship_rqst_id_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			trnspt_nm(value);
			return;
		}
		if ($pl_rmrks.equalsIgnoreCase(name)) {
			pl_rmrks(value);
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
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($ttl_net_wt.equalsIgnoreCase(name)) {
			ttl_net_wt(value);
			return;
		}
		if ($ttl_grss_wt.equalsIgnoreCase(name)) {
			ttl_grss_wt(value);
			return;
		}
		if ($ttl_dim.equalsIgnoreCase(name)) {
			ttl_dim(value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($non_cmpl_flg.equalsIgnoreCase(name)) {
			non_cmpl_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		if ($pl_immed_prnt_flg.equalsIgnoreCase(name)) {
			pl_immed_prnt_flg(value);
			return;
		}
		if ($pl_prnt_flg.equalsIgnoreCase(name)) {
			pl_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

