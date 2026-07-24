package mcframe.serverMABC.MABCL0120;

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
 * ブロック"Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public static final String $st_dt_key = "st_dt_key";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public static final String $aprv_row_num = "aprv_row_num";
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
	 * Approval route pattern 承認ルートパタン.<p>
	 *
	 */
	public static final String $aprv_rt_ptn = "aprv_rt_ptn";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $aprv_del_flg = "aprv_del_flg";
	/**
	 * Item 品目.<p>
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
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public static final String $itm_grp_typ = "itm_grp_typ";
	/**
	 * Item classification type name 品目分類区分名.<p>
	 *
	 */
	public static final String $itm_grp_typ_nm = "itm_grp_typ_nm";
	/**
	 * Item classification 品目分類.<p>
	 *
	 */
	public static final String $itm_grp_cd = "itm_grp_cd";
	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public static final String $itm_grp_nm = "itm_grp_nm";
	/**
	 * Dept. 部門.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * BP 取引先.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * BP classification type 取引先分類区分.<p>
	 *
	 */
	public static final String $bp_grp_typ = "bp_grp_typ";
	/**
	 * BP classification type name 取引先分類区分名.<p>
	 *
	 */
	public static final String $bp_grp_typ_nm = "bp_grp_typ_nm";
	/**
	 * BP classification 取引先分類.<p>
	 *
	 */
	public static final String $bp_grp_cd = "bp_grp_cd";
	/**
	 * BP classification name 取引先分類名.<p>
	 *
	 */
	public static final String $bp_grp_nm = "bp_grp_nm";
	/**
	 * Currency 1 通貨１.<p>
	 *
	 */
	public static final String $cur_cd1 = "cur_cd1";
	/**
	 * Currency name 1 通貨名１.<p>
	 *
	 */
	public static final String $cur_nm1 = "cur_nm1";
	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public static final String $val_min1 = "val_min1";
	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public static final String $val_max1 = "val_max1";
	/**
	 * Join criteria type 1 結合条件区分１.<p>
	 *
	 */
	public static final String $bind_cond1 = "bind_cond1";
	/**
	 * Join criteria type name 1 結合条件区分名１.<p>
	 *
	 */
	public static final String $bind_cond1_nm = "bind_cond1_nm";
	/**
	 * Currency 2 通貨２.<p>
	 *
	 */
	public static final String $cur_cd2 = "cur_cd2";
	/**
	 * Currency name 2 通貨名２.<p>
	 *
	 */
	public static final String $cur_nm2 = "cur_nm2";
	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public static final String $val_min2 = "val_min2";
	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public static final String $val_max2 = "val_max2";
	/**
	 * Join criteria type 2 結合条件区分２.<p>
	 *
	 */
	public static final String $bind_cond2 = "bind_cond2";
	/**
	 * Join criteria type name 2 結合条件区分名２.<p>
	 *
	 */
	public static final String $bind_cond2_nm = "bind_cond2_nm";
	/**
	 * Currency 3 通貨３.<p>
	 *
	 */
	public static final String $cur_cd3 = "cur_cd3";
	/**
	 * Currency name 3 通貨名３.<p>
	 *
	 */
	public static final String $cur_nm3 = "cur_nm3";
	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public static final String $val_min3 = "val_min3";
	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public static final String $val_max3 = "val_max3";
	/**
	 * Extended column 1 拡張項目１.<p>
	 *
	 */
	public static final String $ext_key1 = "ext_key1";
	/**
	 * Extended column 2 拡張項目２.<p>
	 *
	 */
	public static final String $ext_key2 = "ext_key2";
	/**
	 * Extended column 3 拡張項目３.<p>
	 *
	 */
	public static final String $ext_key3 = "ext_key3";
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


	public static final MCMeta st_dt_key_META = createCommonMeta($st_dt_key, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_func_typ_nm_META = createCommonMeta($aprv_func_typ_nm, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP_NM);
	public static final MCMeta aprv_row_num_META = createCommonMeta($aprv_row_num, mcframe.commonMA.meta.MA_META.APRV_ROW_NUM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_rt_ptn_META = createCommonMeta($aprv_rt_ptn, mcframe.commonMA.meta.MA_META.APRV_RT_PTN);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_del_flg_META = createCommonMeta($aprv_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_grp_typ_META = createCommonMeta($itm_grp_typ, mcframe.commonMA.meta.MA_META.ITM_GRP_TYP);
	public static final MCMeta itm_grp_typ_nm_META = createCommonMeta($itm_grp_typ_nm, mcframe.commonMA.meta.MA_META.ITM_GRP_TYP_NM);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm_META = createCommonMeta($itm_grp_nm, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_grp_typ_META = createCommonMeta($bp_grp_typ, mcframe.commonMA.meta.MA_META.BP_GRP_TYP);
	public static final MCMeta bp_grp_typ_nm_META = createCommonMeta($bp_grp_typ_nm, mcframe.commonMA.meta.MA_META.BP_GRP_TYP_NM);
	public static final MCMeta bp_grp_cd_META = createCommonMeta($bp_grp_cd, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm_META = createCommonMeta($bp_grp_nm, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cur_cd1_META = createCommonMeta($cur_cd1, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm1_META = createCommonMeta($cur_nm1, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta val_min1_META = createCommonMeta($val_min1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max1_META = createCommonMeta($val_max1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bind_cond1_META = createCommonMeta($bind_cond1, mcframe.commonMA.meta.MA_META.BIND_COND_TYP);
	public static final MCMeta bind_cond1_nm_META = createCommonMeta($bind_cond1_nm, mcframe.commonMA.meta.MA_META.BIND_COND_TYP_NM);
	public static final MCMeta cur_cd2_META = createCommonMeta($cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm2_META = createCommonMeta($cur_nm2, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta val_min2_META = createCommonMeta($val_min2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max2_META = createCommonMeta($val_max2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bind_cond2_META = createCommonMeta($bind_cond2, mcframe.commonMA.meta.MA_META.BIND_COND_TYP);
	public static final MCMeta bind_cond2_nm_META = createCommonMeta($bind_cond2_nm, mcframe.commonMA.meta.MA_META.BIND_COND_TYP_NM);
	public static final MCMeta cur_cd3_META = createCommonMeta($cur_cd3, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm3_META = createCommonMeta($cur_nm3, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta val_min3_META = createCommonMeta($val_min3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta val_max3_META = createCommonMeta($val_max3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ext_key1_META = createCommonMeta($ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta ext_key2_META = createCommonMeta($ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta ext_key3_META = createCommonMeta($ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);
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

	protected static final ConstMetaList<Sprt01_DtlR> constMetas = new ConstMetaList<Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_dt_key_META,
			del_flg_META,
			aprv_func_typ_META,
			aprv_func_typ_nm_META,
			aprv_row_num_META,
			st_dt_META,
			end_dt_META,
			aprv_rt_ptn_META,
			prio_META,
			aprv_upd_flg_META,
			aprv_del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_grp_typ_META,
			itm_grp_typ_nm_META,
			itm_grp_cd_META,
			itm_grp_nm_META,
			dpt_cd_META,
			dpt_nm_META,
			bp_cd_META,
			bp_nm_META,
			bp_grp_typ_META,
			bp_grp_typ_nm_META,
			bp_grp_cd_META,
			bp_grp_nm_META,
			cur_cd1_META,
			cur_nm1_META,
			val_min1_META,
			val_max1_META,
			bind_cond1_META,
			bind_cond1_nm_META,
			cur_cd2_META,
			cur_nm2_META,
			val_min2_META,
			val_max2_META,
			bind_cond2_META,
			bind_cond2_nm_META,
			cur_cd3_META,
			cur_nm3_META,
			val_min3_META,
			val_max3_META,
			ext_key1_META,
			ext_key2_META,
			ext_key3_META,
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
				{$aprv_func_typ, "MAC_APRV_FUNC_TYP"},	// aprv_func_typ
				{$itm_grp_typ, "MAC_ITM_GRP_TYP"},	// itm_grp_typ
				{$bp_grp_typ, "MAC_BP_GRP_TYP"},	// bp_grp_typ
				{$bind_cond1, "MAC_BIND_COND_TYP"},	// bind_cond1
				{$bind_cond2, "MAC_BIND_COND_TYP"}	// bind_cond2
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
	protected Sprt01_DtlR_MC_A(ConstMetaList<? extends Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR clone() {
		return (Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR createInstance() {
		return (Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR getValues(String... names) {
		return (Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public MCDate st_dt_key() {
		return getConstDate(offset + 0, $st_dt_key);
	}

	/**
	 * Application start date_[Before change] 適用開始日_[変更前].<p>
	 *
	 */
	public void st_dt_key(MCDate value) {
		setConstDate(offset + 0, $st_dt_key, value);
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
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 2, $aprv_func_typ);
	}

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 2, $aprv_func_typ, value);
	}


	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public String aprv_func_typ_nm() {
		return getConstString(offset + 3, $aprv_func_typ_nm);
	}

	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public void aprv_func_typ_nm(String value) {
		setConstString(offset + 3, $aprv_func_typ_nm, value);
	}


	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public MCNumber aprv_row_num() {
		return getConstNumber(offset + 4, $aprv_row_num);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(MCNumber value) {
		setConstNumber(offset + 4, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(int value) {
		setConstNumber(offset + 4, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(long value) {
		setConstNumber(offset + 4, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(float value) {
		setConstNumber(offset + 4, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(double value) {
		setConstNumber(offset + 4, $aprv_row_num, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 5, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 5, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 6, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 6, $end_dt, value);
	}


	/**
	 * Approval route pattern 承認ルートパタン.<p>
	 *
	 */
	public String aprv_rt_ptn() {
		return getConstString(offset + 7, $aprv_rt_ptn);
	}

	/**
	 * Approval route pattern 承認ルートパタン.<p>
	 *
	 */
	public void aprv_rt_ptn(String value) {
		setConstString(offset + 7, $aprv_rt_ptn, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 8, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 8, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 8, $prio, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 9, $aprv_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_del_flg() {
		return getConstBoolean(offset + 10, $aprv_del_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_del_flg(boolean value) {
		setConstBoolean(offset + 10, $aprv_del_flg, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 11, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 11, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 12, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 12, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 13, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 13, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 14, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 14, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 15, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 15, $itm_nm, value);
	}


	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public String itm_grp_typ() {
		return getConstString(offset + 16, $itm_grp_typ);
	}

	/**
	 * Item classification type 品目分類区分.<p>
	 *
	 */
	public void itm_grp_typ(String value) {
		setConstString(offset + 16, $itm_grp_typ, value);
	}


	/**
	 * Item classification type name 品目分類区分名.<p>
	 *
	 */
	public String itm_grp_typ_nm() {
		return getConstString(offset + 17, $itm_grp_typ_nm);
	}

	/**
	 * Item classification type name 品目分類区分名.<p>
	 *
	 */
	public void itm_grp_typ_nm(String value) {
		setConstString(offset + 17, $itm_grp_typ_nm, value);
	}


	/**
	 * Item classification 品目分類.<p>
	 *
	 */
	public String itm_grp_cd() {
		return getConstString(offset + 18, $itm_grp_cd);
	}

	/**
	 * Item classification 品目分類.<p>
	 *
	 */
	public void itm_grp_cd(String value) {
		setConstString(offset + 18, $itm_grp_cd, value);
	}


	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public String itm_grp_nm() {
		return getConstString(offset + 19, $itm_grp_nm);
	}

	/**
	 * Item classification name 品目分類名.<p>
	 *
	 */
	public void itm_grp_nm(String value) {
		setConstString(offset + 19, $itm_grp_nm, value);
	}


	/**
	 * Dept. 部門.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 20, $dpt_cd);
	}

	/**
	 * Dept. 部門.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 20, $dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 21, $dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 21, $dpt_nm, value);
	}


	/**
	 * BP 取引先.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 22, $bp_cd);
	}

	/**
	 * BP 取引先.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 22, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 23, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 23, $bp_nm, value);
	}


	/**
	 * BP classification type 取引先分類区分.<p>
	 *
	 */
	public String bp_grp_typ() {
		return getConstString(offset + 24, $bp_grp_typ);
	}

	/**
	 * BP classification type 取引先分類区分.<p>
	 *
	 */
	public void bp_grp_typ(String value) {
		setConstString(offset + 24, $bp_grp_typ, value);
	}


	/**
	 * BP classification type name 取引先分類区分名.<p>
	 *
	 */
	public String bp_grp_typ_nm() {
		return getConstString(offset + 25, $bp_grp_typ_nm);
	}

	/**
	 * BP classification type name 取引先分類区分名.<p>
	 *
	 */
	public void bp_grp_typ_nm(String value) {
		setConstString(offset + 25, $bp_grp_typ_nm, value);
	}


	/**
	 * BP classification 取引先分類.<p>
	 *
	 */
	public String bp_grp_cd() {
		return getConstString(offset + 26, $bp_grp_cd);
	}

	/**
	 * BP classification 取引先分類.<p>
	 *
	 */
	public void bp_grp_cd(String value) {
		setConstString(offset + 26, $bp_grp_cd, value);
	}


	/**
	 * BP classification name 取引先分類名.<p>
	 *
	 */
	public String bp_grp_nm() {
		return getConstString(offset + 27, $bp_grp_nm);
	}

	/**
	 * BP classification name 取引先分類名.<p>
	 *
	 */
	public void bp_grp_nm(String value) {
		setConstString(offset + 27, $bp_grp_nm, value);
	}


	/**
	 * Currency 1 通貨１.<p>
	 *
	 */
	public String cur_cd1() {
		return getConstString(offset + 28, $cur_cd1);
	}

	/**
	 * Currency 1 通貨１.<p>
	 *
	 */
	public void cur_cd1(String value) {
		setConstString(offset + 28, $cur_cd1, value);
	}


	/**
	 * Currency name 1 通貨名１.<p>
	 *
	 */
	public String cur_nm1() {
		return getConstString(offset + 29, $cur_nm1);
	}

	/**
	 * Currency name 1 通貨名１.<p>
	 *
	 */
	public void cur_nm1(String value) {
		setConstString(offset + 29, $cur_nm1, value);
	}


	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public MCNumber val_min1() {
		return getConstNumber(offset + 30, $val_min1);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(MCNumber value) {
		setConstNumber(offset + 30, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(int value) {
		setConstNumber(offset + 30, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(long value) {
		setConstNumber(offset + 30, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(float value) {
		setConstNumber(offset + 30, $val_min1, value);
	}

	/**
	 * Amount 1 lower limit 金額１下限値.<p>
	 *
	 */
	public void val_min1(double value) {
		setConstNumber(offset + 30, $val_min1, value);
	}


	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public MCNumber val_max1() {
		return getConstNumber(offset + 31, $val_max1);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(MCNumber value) {
		setConstNumber(offset + 31, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(int value) {
		setConstNumber(offset + 31, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(long value) {
		setConstNumber(offset + 31, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(float value) {
		setConstNumber(offset + 31, $val_max1, value);
	}

	/**
	 * Amount 1 Upper limit 金額１上限値.<p>
	 *
	 */
	public void val_max1(double value) {
		setConstNumber(offset + 31, $val_max1, value);
	}


	/**
	 * Join criteria type 1 結合条件区分１.<p>
	 *
	 */
	public String bind_cond1() {
		return getConstString(offset + 32, $bind_cond1);
	}

	/**
	 * Join criteria type 1 結合条件区分１.<p>
	 *
	 */
	public void bind_cond1(String value) {
		setConstString(offset + 32, $bind_cond1, value);
	}


	/**
	 * Join criteria type name 1 結合条件区分名１.<p>
	 *
	 */
	public String bind_cond1_nm() {
		return getConstString(offset + 33, $bind_cond1_nm);
	}

	/**
	 * Join criteria type name 1 結合条件区分名１.<p>
	 *
	 */
	public void bind_cond1_nm(String value) {
		setConstString(offset + 33, $bind_cond1_nm, value);
	}


	/**
	 * Currency 2 通貨２.<p>
	 *
	 */
	public String cur_cd2() {
		return getConstString(offset + 34, $cur_cd2);
	}

	/**
	 * Currency 2 通貨２.<p>
	 *
	 */
	public void cur_cd2(String value) {
		setConstString(offset + 34, $cur_cd2, value);
	}


	/**
	 * Currency name 2 通貨名２.<p>
	 *
	 */
	public String cur_nm2() {
		return getConstString(offset + 35, $cur_nm2);
	}

	/**
	 * Currency name 2 通貨名２.<p>
	 *
	 */
	public void cur_nm2(String value) {
		setConstString(offset + 35, $cur_nm2, value);
	}


	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public MCNumber val_min2() {
		return getConstNumber(offset + 36, $val_min2);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(MCNumber value) {
		setConstNumber(offset + 36, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(int value) {
		setConstNumber(offset + 36, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(long value) {
		setConstNumber(offset + 36, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(float value) {
		setConstNumber(offset + 36, $val_min2, value);
	}

	/**
	 * Amount 2 lower limit 金額２下限値.<p>
	 *
	 */
	public void val_min2(double value) {
		setConstNumber(offset + 36, $val_min2, value);
	}


	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public MCNumber val_max2() {
		return getConstNumber(offset + 37, $val_max2);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(MCNumber value) {
		setConstNumber(offset + 37, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(int value) {
		setConstNumber(offset + 37, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(long value) {
		setConstNumber(offset + 37, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(float value) {
		setConstNumber(offset + 37, $val_max2, value);
	}

	/**
	 * Amount 2 Upper limit 金額２上限値.<p>
	 *
	 */
	public void val_max2(double value) {
		setConstNumber(offset + 37, $val_max2, value);
	}


	/**
	 * Join criteria type 2 結合条件区分２.<p>
	 *
	 */
	public String bind_cond2() {
		return getConstString(offset + 38, $bind_cond2);
	}

	/**
	 * Join criteria type 2 結合条件区分２.<p>
	 *
	 */
	public void bind_cond2(String value) {
		setConstString(offset + 38, $bind_cond2, value);
	}


	/**
	 * Join criteria type name 2 結合条件区分名２.<p>
	 *
	 */
	public String bind_cond2_nm() {
		return getConstString(offset + 39, $bind_cond2_nm);
	}

	/**
	 * Join criteria type name 2 結合条件区分名２.<p>
	 *
	 */
	public void bind_cond2_nm(String value) {
		setConstString(offset + 39, $bind_cond2_nm, value);
	}


	/**
	 * Currency 3 通貨３.<p>
	 *
	 */
	public String cur_cd3() {
		return getConstString(offset + 40, $cur_cd3);
	}

	/**
	 * Currency 3 通貨３.<p>
	 *
	 */
	public void cur_cd3(String value) {
		setConstString(offset + 40, $cur_cd3, value);
	}


	/**
	 * Currency name 3 通貨名３.<p>
	 *
	 */
	public String cur_nm3() {
		return getConstString(offset + 41, $cur_nm3);
	}

	/**
	 * Currency name 3 通貨名３.<p>
	 *
	 */
	public void cur_nm3(String value) {
		setConstString(offset + 41, $cur_nm3, value);
	}


	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public MCNumber val_min3() {
		return getConstNumber(offset + 42, $val_min3);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(MCNumber value) {
		setConstNumber(offset + 42, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(int value) {
		setConstNumber(offset + 42, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(long value) {
		setConstNumber(offset + 42, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(float value) {
		setConstNumber(offset + 42, $val_min3, value);
	}

	/**
	 * Amount 3 lower limit 金額３下限値.<p>
	 *
	 */
	public void val_min3(double value) {
		setConstNumber(offset + 42, $val_min3, value);
	}


	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public MCNumber val_max3() {
		return getConstNumber(offset + 43, $val_max3);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(MCNumber value) {
		setConstNumber(offset + 43, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(int value) {
		setConstNumber(offset + 43, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(long value) {
		setConstNumber(offset + 43, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(float value) {
		setConstNumber(offset + 43, $val_max3, value);
	}

	/**
	 * Amount 3 Upper limit 金額３上限値.<p>
	 *
	 */
	public void val_max3(double value) {
		setConstNumber(offset + 43, $val_max3, value);
	}


	/**
	 * Extended column 1 拡張項目１.<p>
	 *
	 */
	public String ext_key1() {
		return getConstString(offset + 44, $ext_key1);
	}

	/**
	 * Extended column 1 拡張項目１.<p>
	 *
	 */
	public void ext_key1(String value) {
		setConstString(offset + 44, $ext_key1, value);
	}


	/**
	 * Extended column 2 拡張項目２.<p>
	 *
	 */
	public String ext_key2() {
		return getConstString(offset + 45, $ext_key2);
	}

	/**
	 * Extended column 2 拡張項目２.<p>
	 *
	 */
	public void ext_key2(String value) {
		setConstString(offset + 45, $ext_key2, value);
	}


	/**
	 * Extended column 3 拡張項目３.<p>
	 *
	 */
	public String ext_key3() {
		return getConstString(offset + 46, $ext_key3);
	}

	/**
	 * Extended column 3 拡張項目３.<p>
	 *
	 */
	public void ext_key3(String value) {
		setConstString(offset + 46, $ext_key3, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 47, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 47, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 48, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 48, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 49, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 49, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 50, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 50, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 51, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 51, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 52, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 52, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 53, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 53, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 54, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 54, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 55, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 56, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 56, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 57, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 57, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 58, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 59, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 59, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 60, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 60, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 61, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 61, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 62, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 62, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 63, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 63, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 64, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 64, $del_ts, value);
	}


	public String getString(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_func_typ_nm.equalsIgnoreCase(name)) {
			return aprv_func_typ_nm();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_typ_nm.equalsIgnoreCase(name)) {
			return itm_grp_typ_nm();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			return bp_grp_typ();
		}
		if ($bp_grp_typ_nm.equalsIgnoreCase(name)) {
			return bp_grp_typ_nm();
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			return bp_grp_cd();
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			return bp_grp_nm();
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			return cur_cd1();
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			return cur_nm1();
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			return bind_cond1();
		}
		if ($bind_cond1_nm.equalsIgnoreCase(name)) {
			return bind_cond1_nm();
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			return cur_cd2();
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			return cur_nm2();
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			return bind_cond2();
		}
		if ($bind_cond2_nm.equalsIgnoreCase(name)) {
			return bind_cond2_nm();
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			return cur_cd3();
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			return cur_nm3();
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			return ext_key1();
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			return ext_key2();
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			return ext_key3();
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
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			return val_min1();
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			return val_max1();
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			return val_min2();
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			return val_max2();
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			return val_min3();
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			return val_max3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			return aprv_del_flg();
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
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			return itm_grp_typ();
		}
		if ($itm_grp_typ_nm.equalsIgnoreCase(name)) {
			return itm_grp_typ_nm();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			return bp_grp_typ();
		}
		if ($bp_grp_typ_nm.equalsIgnoreCase(name)) {
			return bp_grp_typ_nm();
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			return bp_grp_cd();
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			return bp_grp_nm();
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			return cur_cd1();
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			return cur_nm1();
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			return bind_cond1();
		}
		if ($bind_cond1_nm.equalsIgnoreCase(name)) {
			return bind_cond1_nm();
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			return cur_cd2();
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			return cur_nm2();
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			return bind_cond2();
		}
		if ($bind_cond2_nm.equalsIgnoreCase(name)) {
			return bind_cond2_nm();
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			return cur_cd3();
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			return cur_nm3();
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			return ext_key1();
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			return ext_key2();
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			return ext_key3();
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
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			return val_min1();
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			return val_max1();
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			return val_min2();
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			return val_max2();
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			return val_min3();
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			return val_max3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			return st_dt_key();
		}
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			return aprv_del_flg();
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
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_typ_nm.equalsIgnoreCase(name)) {
			itm_grp_typ_nm(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			bp_grp_typ(value);
			return;
		}
		if ($bp_grp_typ_nm.equalsIgnoreCase(name)) {
			bp_grp_typ_nm(value);
			return;
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			bp_grp_cd(value);
			return;
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			bp_grp_nm(value);
			return;
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			cur_cd1(value);
			return;
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			cur_nm1(value);
			return;
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			bind_cond1(value);
			return;
		}
		if ($bind_cond1_nm.equalsIgnoreCase(name)) {
			bind_cond1_nm(value);
			return;
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			cur_cd2(value);
			return;
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			cur_nm2(value);
			return;
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			bind_cond2(value);
			return;
		}
		if ($bind_cond2_nm.equalsIgnoreCase(name)) {
			bind_cond2_nm(value);
			return;
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			cur_cd3(value);
			return;
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			cur_nm3(value);
			return;
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			ext_key1(value);
			return;
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			ext_key2(value);
			return;
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			ext_key3(value);
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
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			aprv_del_flg(value);
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
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
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
		if ($itm_grp_typ.equalsIgnoreCase(name)) {
			itm_grp_typ(value);
			return;
		}
		if ($itm_grp_typ_nm.equalsIgnoreCase(name)) {
			itm_grp_typ_nm(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_grp_typ.equalsIgnoreCase(name)) {
			bp_grp_typ(value);
			return;
		}
		if ($bp_grp_typ_nm.equalsIgnoreCase(name)) {
			bp_grp_typ_nm(value);
			return;
		}
		if ($bp_grp_cd.equalsIgnoreCase(name)) {
			bp_grp_cd(value);
			return;
		}
		if ($bp_grp_nm.equalsIgnoreCase(name)) {
			bp_grp_nm(value);
			return;
		}
		if ($cur_cd1.equalsIgnoreCase(name)) {
			cur_cd1(value);
			return;
		}
		if ($cur_nm1.equalsIgnoreCase(name)) {
			cur_nm1(value);
			return;
		}
		if ($bind_cond1.equalsIgnoreCase(name)) {
			bind_cond1(value);
			return;
		}
		if ($bind_cond1_nm.equalsIgnoreCase(name)) {
			bind_cond1_nm(value);
			return;
		}
		if ($cur_cd2.equalsIgnoreCase(name)) {
			cur_cd2(value);
			return;
		}
		if ($cur_nm2.equalsIgnoreCase(name)) {
			cur_nm2(value);
			return;
		}
		if ($bind_cond2.equalsIgnoreCase(name)) {
			bind_cond2(value);
			return;
		}
		if ($bind_cond2_nm.equalsIgnoreCase(name)) {
			bind_cond2_nm(value);
			return;
		}
		if ($cur_cd3.equalsIgnoreCase(name)) {
			cur_cd3(value);
			return;
		}
		if ($cur_nm3.equalsIgnoreCase(name)) {
			cur_nm3(value);
			return;
		}
		if ($ext_key1.equalsIgnoreCase(name)) {
			ext_key1(value);
			return;
		}
		if ($ext_key2.equalsIgnoreCase(name)) {
			ext_key2(value);
			return;
		}
		if ($ext_key3.equalsIgnoreCase(name)) {
			ext_key3(value);
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
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($val_min1.equalsIgnoreCase(name)) {
			val_min1(value);
			return;
		}
		if ($val_max1.equalsIgnoreCase(name)) {
			val_max1(value);
			return;
		}
		if ($val_min2.equalsIgnoreCase(name)) {
			val_min2(value);
			return;
		}
		if ($val_max2.equalsIgnoreCase(name)) {
			val_max2(value);
			return;
		}
		if ($val_min3.equalsIgnoreCase(name)) {
			val_min3(value);
			return;
		}
		if ($val_max3.equalsIgnoreCase(name)) {
			val_max3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt_key.equalsIgnoreCase(name)) {
			st_dt_key(value);
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
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			aprv_upd_flg(value);
			return;
		}
		if ($aprv_del_flg.equalsIgnoreCase(name)) {
			aprv_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

