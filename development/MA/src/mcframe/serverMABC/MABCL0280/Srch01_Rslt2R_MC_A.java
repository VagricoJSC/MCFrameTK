package mcframe.serverMABC.MABCL0280;

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
 * ブロック"Srch01_Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt2R_MC_A extends MCConstRow {

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
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
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm_lcl = "dpt_nm_lcl";
	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public static final String $up_lv_dpt_cd = "up_lv_dpt_cd";
	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public static final String $up_lv_dpt_nm = "up_lv_dpt_nm";
	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public static final String $new_dpt_cd = "new_dpt_cd";
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public static final String $tel = "tel";
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public static final String $fax = "fax";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public static final String $lg_flg = "lg_flg";
	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public static final String $mfg_flg = "mfg_flg";
	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public static final String $ar_flg = "ar_flg";
	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public static final String $ap_flg = "ap_flg";
	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public static final String $sd_flg = "sd_flg";
	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public static final String $rcv_bank_ac_cd = "rcv_bank_ac_cd";
	/**
	 * Payment received account name 入金口座名.<p>
	 *
	 */
	public static final String $rcv_bank_ac_nm = "rcv_bank_ac_nm";
	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public static final String $pay_bank_ac_cd = "pay_bank_ac_cd";
	/**
	 * Payment account name 支払口座名.<p>
	 *
	 */
	public static final String $pay_bank_ac_nm = "pay_bank_ac_nm";
	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public static final String $cal_nm = "cal_nm";
	/**
	 * Asset management dept. 資産管理部門.<p>
	 *
	 */
	public static final String $asst_dpt_flg = "asst_dpt_flg";
	/**
	 * AR dept. 債権部門.<p>
	 *
	 */
	public static final String $ar_dpt_flg = "ar_dpt_flg";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * Sales dept. 営業部門.<p>
	 *
	 */
	public static final String $sls_dpt_flg = "sls_dpt_flg";
	/**
	 * Purchasing dept. 購買部門.<p>
	 *
	 */
	public static final String $purc_dpt_flg = "purc_dpt_flg";
	/**
	 * Shipping dept. 出荷部門.<p>
	 *
	 */
	public static final String $ship_dpt_flg = "ship_dpt_flg";
	/**
	 * Receipt dept. 入荷部門.<p>
	 *
	 */
	public static final String $arr_dpt_flg = "arr_dpt_flg";
	/**
	 * Mfg. dept. 製造部門.<p>
	 *
	 */
	public static final String $mfg_dpt_flg = "mfg_dpt_flg";
	/**
	 * Demand and supply dept. 需給部門.<p>
	 *
	 */
	public static final String $sd_dpt_flg = "sd_dpt_flg";
	/**
	 * Inspection dept. 検査部門.<p>
	 *
	 */
	public static final String $insp_dpt_flg = "insp_dpt_flg";
	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public static final String $bd_dpt_flg = "bd_dpt_flg";
	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public static final String $cost_dpt_cd = "cost_dpt_cd";
	/**
	 * Cost dept. name 原価部門名.<p>
	 *
	 */
	public static final String $cost_dpt_nm = "cost_dpt_nm";
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public static final String $ac_dpt_cd = "ac_dpt_cd";
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public static final String $ac_dpt_nm = "ac_dpt_nm";
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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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


	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_nm_lcl_META = createCommonMeta($dpt_nm_lcl, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta up_lv_dpt_cd_META = createCommonMeta($up_lv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta up_lv_dpt_nm_META = createCommonMeta($up_lv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta new_dpt_cd_META = createCommonMeta($new_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lg_flg_META = createCommonMeta($lg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_flg_META = createCommonMeta($mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_flg_META = createCommonMeta($ar_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_flg_META = createCommonMeta($ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_flg_META = createCommonMeta($sd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_bank_ac_cd_META = createCommonMeta($rcv_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta rcv_bank_ac_nm_META = createCommonMeta($rcv_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_bank_ac_cd_META = createCommonMeta($pay_bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta pay_bank_ac_nm_META = createCommonMeta($pay_bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta cal_nm_META = createCommonMeta($cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta asst_dpt_flg_META = createCommonMeta($asst_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_flg_META = createCommonMeta($ar_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dpt_flg_META = createCommonMeta($sls_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_flg_META = createCommonMeta($purc_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_dpt_flg_META = createCommonMeta($ship_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_dpt_flg_META = createCommonMeta($arr_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_dpt_flg_META = createCommonMeta($mfg_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sd_dpt_flg_META = createCommonMeta($sd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_dpt_flg_META = createCommonMeta($insp_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_flg_META = createCommonMeta($bd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_dpt_cd_META = createCommonMeta($cost_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta cost_dpt_nm_META = createCommonMeta($cost_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta ac_dpt_cd_META = createCommonMeta($ac_dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta ac_dpt_nm_META = createCommonMeta($ac_dpt_nm, mcframe.commonMA.meta.MA_META.AC_DPT_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
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

	protected static final ConstMetaList<Srch01_Rslt2R> constMetas = new ConstMetaList<Srch01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dpt_cd_META,
			st_dt_META,
			end_dt_META,
			dpt_nm_lcl_META,
			dpt_nm_META,
			dpt_lvl_cd_META,
			dpt_lvl_nm_META,
			up_lv_dpt_cd_META,
			up_lv_dpt_nm_META,
			new_dpt_cd_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			wg_cd_META,
			wg_nm_META,
			sls_flg_META,
			lg_flg_META,
			mfg_flg_META,
			purc_flg_META,
			ar_flg_META,
			ap_flg_META,
			sd_flg_META,
			rcv_bank_ac_cd_META,
			rcv_bank_ac_nm_META,
			pay_bank_ac_cd_META,
			pay_bank_ac_nm_META,
			cal_cd_META,
			cal_nm_META,
			asst_dpt_flg_META,
			ar_dpt_flg_META,
			ap_dpt_flg_META,
			sls_dpt_flg_META,
			purc_dpt_flg_META,
			ship_dpt_flg_META,
			arr_dpt_flg_META,
			mfg_dpt_flg_META,
			sd_dpt_flg_META,
			insp_dpt_flg_META,
			bd_dpt_flg_META,
			cost_dpt_cd_META,
			cost_dpt_nm_META,
			ac_dpt_cd_META,
			ac_dpt_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
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
	protected Srch01_Rslt2R_MC_A(ConstMetaList<? extends Srch01_Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R clone() {
		return (Srch01_Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R createInstance() {
		return (Srch01_Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R getValues(String... names) {
		return (Srch01_Rslt2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 0, $dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 0, $dpt_cd, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 1, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 1, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 2, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 2, $end_dt, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm_lcl() {
		return getConstString(offset + 3, $dpt_nm_lcl);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm_lcl(String value) {
		setConstString(offset + 3, $dpt_nm_lcl, value);
	}


	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * Standard dept. name 標準部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}


	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 5, $dpt_lvl_cd);
	}

	/**
	 * Dept. hierarchy cd. 部門階層ＣＤ.<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 5, $dpt_lvl_cd, value);
	}


	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 6, $dpt_lvl_nm);
	}

	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 6, $dpt_lvl_nm, value);
	}


	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public String up_lv_dpt_cd() {
		return getConstString(offset + 7, $up_lv_dpt_cd);
	}

	/**
	 * Upper dept. cd. 上位部門ＣＤ.<p>
	 *
	 */
	public void up_lv_dpt_cd(String value) {
		setConstString(offset + 7, $up_lv_dpt_cd, value);
	}


	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public String up_lv_dpt_nm() {
		return getConstString(offset + 8, $up_lv_dpt_nm);
	}

	/**
	 * Upper dept. name 上位部門名.<p>
	 *
	 */
	public void up_lv_dpt_nm(String value) {
		setConstString(offset + 8, $up_lv_dpt_nm, value);
	}


	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public String new_dpt_cd() {
		return getConstString(offset + 9, $new_dpt_cd);
	}

	/**
	 * New dept. cd. 新部門ＣＤ.<p>
	 *
	 */
	public void new_dpt_cd(String value) {
		setConstString(offset + 9, $new_dpt_cd, value);
	}


	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 10, $zip_cd);
	}

	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 10, $zip_cd, value);
	}


	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 11, $addr1);
	}

	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 11, $addr1, value);
	}


	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 12, $addr2);
	}

	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 12, $addr2, value);
	}


	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 13, $addr3);
	}

	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 13, $addr3, value);
	}


	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 14, $addr4);
	}

	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 14, $addr4, value);
	}


	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 15, $tel);
	}

	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 15, $tel, value);
	}


	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 16, $fax);
	}

	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 16, $fax, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 17, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 17, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 18, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 18, $wg_nm, value);
	}


	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 19, $sls_flg);
	}

	/**
	 * Sales flg. 販売ＦＬＧ.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 19, $sls_flg, value);
	}


	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public boolean lg_flg() {
		return getConstBoolean(offset + 20, $lg_flg);
	}

	/**
	 * Distribution flg. 物流ＦＬＧ.<p>
	 *
	 */
	public void lg_flg(boolean value) {
		setConstBoolean(offset + 20, $lg_flg, value);
	}


	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public boolean mfg_flg() {
		return getConstBoolean(offset + 21, $mfg_flg);
	}

	/**
	 * Mfg. flg. 製造ＦＬＧ.<p>
	 *
	 */
	public void mfg_flg(boolean value) {
		setConstBoolean(offset + 21, $mfg_flg, value);
	}


	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 22, $purc_flg);
	}

	/**
	 * Purchasing flg. 購買ＦＬＧ.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 22, $purc_flg, value);
	}


	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public boolean ar_flg() {
		return getConstBoolean(offset + 23, $ar_flg);
	}

	/**
	 * AR flg. 債権ＦＬＧ.<p>
	 *
	 */
	public void ar_flg(boolean value) {
		setConstBoolean(offset + 23, $ar_flg, value);
	}


	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public boolean ap_flg() {
		return getConstBoolean(offset + 24, $ap_flg);
	}

	/**
	 * AP flg. 債務ＦＬＧ.<p>
	 *
	 */
	public void ap_flg(boolean value) {
		setConstBoolean(offset + 24, $ap_flg, value);
	}


	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public boolean sd_flg() {
		return getConstBoolean(offset + 25, $sd_flg);
	}

	/**
	 * Demand and supply flg. 需給ＦＬＧ.<p>
	 *
	 */
	public void sd_flg(boolean value) {
		setConstBoolean(offset + 25, $sd_flg, value);
	}


	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public String rcv_bank_ac_cd() {
		return getConstString(offset + 26, $rcv_bank_ac_cd);
	}

	/**
	 * Payment received bank account cd. 入金口座ＣＤ.<p>
	 *
	 */
	public void rcv_bank_ac_cd(String value) {
		setConstString(offset + 26, $rcv_bank_ac_cd, value);
	}


	/**
	 * Payment received account name 入金口座名.<p>
	 *
	 */
	public String rcv_bank_ac_nm() {
		return getConstString(offset + 27, $rcv_bank_ac_nm);
	}

	/**
	 * Payment received account name 入金口座名.<p>
	 *
	 */
	public void rcv_bank_ac_nm(String value) {
		setConstString(offset + 27, $rcv_bank_ac_nm, value);
	}


	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public String pay_bank_ac_cd() {
		return getConstString(offset + 28, $pay_bank_ac_cd);
	}

	/**
	 * Payment account cd. 支払口座ＣＤ.<p>
	 *
	 */
	public void pay_bank_ac_cd(String value) {
		setConstString(offset + 28, $pay_bank_ac_cd, value);
	}


	/**
	 * Payment account name 支払口座名.<p>
	 *
	 */
	public String pay_bank_ac_nm() {
		return getConstString(offset + 29, $pay_bank_ac_nm);
	}

	/**
	 * Payment account name 支払口座名.<p>
	 *
	 */
	public void pay_bank_ac_nm(String value) {
		setConstString(offset + 29, $pay_bank_ac_nm, value);
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 30, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 30, $cal_cd, value);
	}


	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public String cal_nm() {
		return getConstString(offset + 31, $cal_nm);
	}

	/**
	 * Calendar name カレンダ名.<p>
	 *
	 */
	public void cal_nm(String value) {
		setConstString(offset + 31, $cal_nm, value);
	}


	/**
	 * Asset management dept. 資産管理部門.<p>
	 *
	 */
	public boolean asst_dpt_flg() {
		return getConstBoolean(offset + 32, $asst_dpt_flg);
	}

	/**
	 * Asset management dept. 資産管理部門.<p>
	 *
	 */
	public void asst_dpt_flg(boolean value) {
		setConstBoolean(offset + 32, $asst_dpt_flg, value);
	}


	/**
	 * AR dept. 債権部門.<p>
	 *
	 */
	public boolean ar_dpt_flg() {
		return getConstBoolean(offset + 33, $ar_dpt_flg);
	}

	/**
	 * AR dept. 債権部門.<p>
	 *
	 */
	public void ar_dpt_flg(boolean value) {
		setConstBoolean(offset + 33, $ar_dpt_flg, value);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 34, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 34, $ap_dpt_flg, value);
	}


	/**
	 * Sales dept. 営業部門.<p>
	 *
	 */
	public boolean sls_dpt_flg() {
		return getConstBoolean(offset + 35, $sls_dpt_flg);
	}

	/**
	 * Sales dept. 営業部門.<p>
	 *
	 */
	public void sls_dpt_flg(boolean value) {
		setConstBoolean(offset + 35, $sls_dpt_flg, value);
	}


	/**
	 * Purchasing dept. 購買部門.<p>
	 *
	 */
	public boolean purc_dpt_flg() {
		return getConstBoolean(offset + 36, $purc_dpt_flg);
	}

	/**
	 * Purchasing dept. 購買部門.<p>
	 *
	 */
	public void purc_dpt_flg(boolean value) {
		setConstBoolean(offset + 36, $purc_dpt_flg, value);
	}


	/**
	 * Shipping dept. 出荷部門.<p>
	 *
	 */
	public boolean ship_dpt_flg() {
		return getConstBoolean(offset + 37, $ship_dpt_flg);
	}

	/**
	 * Shipping dept. 出荷部門.<p>
	 *
	 */
	public void ship_dpt_flg(boolean value) {
		setConstBoolean(offset + 37, $ship_dpt_flg, value);
	}


	/**
	 * Receipt dept. 入荷部門.<p>
	 *
	 */
	public boolean arr_dpt_flg() {
		return getConstBoolean(offset + 38, $arr_dpt_flg);
	}

	/**
	 * Receipt dept. 入荷部門.<p>
	 *
	 */
	public void arr_dpt_flg(boolean value) {
		setConstBoolean(offset + 38, $arr_dpt_flg, value);
	}


	/**
	 * Mfg. dept. 製造部門.<p>
	 *
	 */
	public boolean mfg_dpt_flg() {
		return getConstBoolean(offset + 39, $mfg_dpt_flg);
	}

	/**
	 * Mfg. dept. 製造部門.<p>
	 *
	 */
	public void mfg_dpt_flg(boolean value) {
		setConstBoolean(offset + 39, $mfg_dpt_flg, value);
	}


	/**
	 * Demand and supply dept. 需給部門.<p>
	 *
	 */
	public boolean sd_dpt_flg() {
		return getConstBoolean(offset + 40, $sd_dpt_flg);
	}

	/**
	 * Demand and supply dept. 需給部門.<p>
	 *
	 */
	public void sd_dpt_flg(boolean value) {
		setConstBoolean(offset + 40, $sd_dpt_flg, value);
	}


	/**
	 * Inspection dept. 検査部門.<p>
	 *
	 */
	public boolean insp_dpt_flg() {
		return getConstBoolean(offset + 41, $insp_dpt_flg);
	}

	/**
	 * Inspection dept. 検査部門.<p>
	 *
	 */
	public void insp_dpt_flg(boolean value) {
		setConstBoolean(offset + 41, $insp_dpt_flg, value);
	}


	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public boolean bd_dpt_flg() {
		return getConstBoolean(offset + 42, $bd_dpt_flg);
	}

	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public void bd_dpt_flg(boolean value) {
		setConstBoolean(offset + 42, $bd_dpt_flg, value);
	}


	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public String cost_dpt_cd() {
		return getConstString(offset + 43, $cost_dpt_cd);
	}

	/**
	 * Cost dept. cd. 原価部門ＣＤ.<p>
	 *
	 */
	public void cost_dpt_cd(String value) {
		setConstString(offset + 43, $cost_dpt_cd, value);
	}


	/**
	 * Cost dept. name 原価部門名.<p>
	 *
	 */
	public String cost_dpt_nm() {
		return getConstString(offset + 44, $cost_dpt_nm);
	}

	/**
	 * Cost dept. name 原価部門名.<p>
	 *
	 */
	public void cost_dpt_nm(String value) {
		setConstString(offset + 44, $cost_dpt_nm, value);
	}


	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public String ac_dpt_cd() {
		return getConstString(offset + 45, $ac_dpt_cd);
	}

	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public void ac_dpt_cd(String value) {
		setConstString(offset + 45, $ac_dpt_cd, value);
	}


	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public String ac_dpt_nm() {
		return getConstString(offset + 46, $ac_dpt_nm);
	}

	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public void ac_dpt_nm(String value) {
		setConstString(offset + 46, $ac_dpt_nm, value);
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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 50, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 50, $del_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 51, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 51, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 52, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 52, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 53, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 54, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 54, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 55, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 55, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 56, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 57, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 57, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 58, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 58, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 59, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 59, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 60, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 60, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 61, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 61, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 62, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 62, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 63, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 63, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 64, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 64, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 65, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 65, $del_ts, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			return dpt_nm_lcl();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			return rcv_bank_ac_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			return cost_dpt_cd();
		}
		if ($cost_dpt_nm.equalsIgnoreCase(name)) {
			return cost_dpt_nm();
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			return ac_dpt_cd();
		}
		if ($ac_dpt_nm.equalsIgnoreCase(name)) {
			return ac_dpt_nm();
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			return sd_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			return dpt_nm_lcl();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			return up_lv_dpt_cd();
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			return up_lv_dpt_nm();
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			return new_dpt_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			return rcv_bank_ac_cd();
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			return rcv_bank_ac_nm();
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			return pay_bank_ac_cd();
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			return pay_bank_ac_nm();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			return cal_nm();
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			return cost_dpt_cd();
		}
		if ($cost_dpt_nm.equalsIgnoreCase(name)) {
			return cost_dpt_nm();
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			return ac_dpt_cd();
		}
		if ($ac_dpt_nm.equalsIgnoreCase(name)) {
			return ac_dpt_nm();
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			return lg_flg();
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			return mfg_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			return ar_flg();
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			return ap_flg();
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			return sd_flg();
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			return asst_dpt_flg();
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			return ar_dpt_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			return sls_dpt_flg();
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			return purc_dpt_flg();
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			return ship_dpt_flg();
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			return arr_dpt_flg();
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			return mfg_dpt_flg();
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			return sd_dpt_flg();
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			return insp_dpt_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			dpt_nm_lcl(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
			return;
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			rcv_bank_ac_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			cost_dpt_cd(value);
			return;
		}
		if ($cost_dpt_nm.equalsIgnoreCase(name)) {
			cost_dpt_nm(value);
			return;
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			ac_dpt_cd(value);
			return;
		}
		if ($ac_dpt_nm.equalsIgnoreCase(name)) {
			ac_dpt_nm(value);
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			sd_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			dpt_nm_lcl(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($up_lv_dpt_cd.equalsIgnoreCase(name)) {
			up_lv_dpt_cd(value);
			return;
		}
		if ($up_lv_dpt_nm.equalsIgnoreCase(name)) {
			up_lv_dpt_nm(value);
			return;
		}
		if ($new_dpt_cd.equalsIgnoreCase(name)) {
			new_dpt_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($rcv_bank_ac_cd.equalsIgnoreCase(name)) {
			rcv_bank_ac_cd(value);
			return;
		}
		if ($rcv_bank_ac_nm.equalsIgnoreCase(name)) {
			rcv_bank_ac_nm(value);
			return;
		}
		if ($pay_bank_ac_cd.equalsIgnoreCase(name)) {
			pay_bank_ac_cd(value);
			return;
		}
		if ($pay_bank_ac_nm.equalsIgnoreCase(name)) {
			pay_bank_ac_nm(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($cal_nm.equalsIgnoreCase(name)) {
			cal_nm(value);
			return;
		}
		if ($cost_dpt_cd.equalsIgnoreCase(name)) {
			cost_dpt_cd(value);
			return;
		}
		if ($cost_dpt_nm.equalsIgnoreCase(name)) {
			cost_dpt_nm(value);
			return;
		}
		if ($ac_dpt_cd.equalsIgnoreCase(name)) {
			ac_dpt_cd(value);
			return;
		}
		if ($ac_dpt_nm.equalsIgnoreCase(name)) {
			ac_dpt_nm(value);
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
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($lg_flg.equalsIgnoreCase(name)) {
			lg_flg(value);
			return;
		}
		if ($mfg_flg.equalsIgnoreCase(name)) {
			mfg_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($ar_flg.equalsIgnoreCase(name)) {
			ar_flg(value);
			return;
		}
		if ($ap_flg.equalsIgnoreCase(name)) {
			ap_flg(value);
			return;
		}
		if ($sd_flg.equalsIgnoreCase(name)) {
			sd_flg(value);
			return;
		}
		if ($asst_dpt_flg.equalsIgnoreCase(name)) {
			asst_dpt_flg(value);
			return;
		}
		if ($ar_dpt_flg.equalsIgnoreCase(name)) {
			ar_dpt_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($sls_dpt_flg.equalsIgnoreCase(name)) {
			sls_dpt_flg(value);
			return;
		}
		if ($purc_dpt_flg.equalsIgnoreCase(name)) {
			purc_dpt_flg(value);
			return;
		}
		if ($ship_dpt_flg.equalsIgnoreCase(name)) {
			ship_dpt_flg(value);
			return;
		}
		if ($arr_dpt_flg.equalsIgnoreCase(name)) {
			arr_dpt_flg(value);
			return;
		}
		if ($mfg_dpt_flg.equalsIgnoreCase(name)) {
			mfg_dpt_flg(value);
			return;
		}
		if ($sd_dpt_flg.equalsIgnoreCase(name)) {
			sd_dpt_flg(value);
			return;
		}
		if ($insp_dpt_flg.equalsIgnoreCase(name)) {
			insp_dpt_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

