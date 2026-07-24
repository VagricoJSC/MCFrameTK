package mcframe.serverMABC.MABCL0250;

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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * License ライセンス.<p>
	 *
	 */
	public static final String $license_flg = "license_flg";
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
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public static final String $da_cd = "da_cd";
	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public static final String $da_nm = "da_nm";
	/**
	 * Allow data correction after temporary closing 仮締訂正可能.<p>
	 *
	 */
	public static final String $pre_cl_usr_flg = "pre_cl_usr_flg";
	/**
	 * Allow data correction after final closing 本締訂正可能.<p>
	 *
	 */
	public static final String $cl_usr_flg = "cl_usr_flg";
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public static final String $add_dpt_cd1 = "add_dpt_cd1";
	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public static final String $add_dpt_nm1 = "add_dpt_nm1";
	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public static final String $add_dpt_cd2 = "add_dpt_cd2";
	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public static final String $add_dpt_nm2 = "add_dpt_nm2";
	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public static final String $add_dpt_cd3 = "add_dpt_cd3";
	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public static final String $add_dpt_nm3 = "add_dpt_nm3";
	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public static final String $add_dpt_cd4 = "add_dpt_cd4";
	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public static final String $add_dpt_nm4 = "add_dpt_nm4";
	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public static final String $add_dpt_cd5 = "add_dpt_cd5";
	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public static final String $add_dpt_nm5 = "add_dpt_nm5";
	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public static final String $add_dpt_cd6 = "add_dpt_cd6";
	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public static final String $add_dpt_nm6 = "add_dpt_nm6";
	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public static final String $add_dpt_cd7 = "add_dpt_cd7";
	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public static final String $add_dpt_nm7 = "add_dpt_nm7";
	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public static final String $add_dpt_cd8 = "add_dpt_cd8";
	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public static final String $add_dpt_nm8 = "add_dpt_nm8";
	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public static final String $add_dpt_cd9 = "add_dpt_cd9";
	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public static final String $add_dpt_nm9 = "add_dpt_nm9";
	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd = "aprv_role_cd";
	/**
	 * Approval role name (Main) 承認役割名（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm = "aprv_role_nm";
	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd1 = "aprv_role_cd1";
	/**
	 * Approval role name 1 (Main) 承認役割名１（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm1 = "aprv_role_nm1";
	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd2 = "aprv_role_cd2";
	/**
	 * Approval role name 2 (Main) 承認役割名２（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm2 = "aprv_role_nm2";
	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd3 = "aprv_role_cd3";
	/**
	 * Approval role name 3 (Main) 承認役割名３（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm3 = "aprv_role_nm3";
	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd4 = "aprv_role_cd4";
	/**
	 * Approval role name 4 (Main) 承認役割名４（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm4 = "aprv_role_nm4";
	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd5 = "aprv_role_cd5";
	/**
	 * Approval role name 5 (Main) 承認役割名５（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm5 = "aprv_role_nm5";
	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd6 = "aprv_role_cd6";
	/**
	 * Approval role name 6 (Main) 承認役割名６（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm6 = "aprv_role_nm6";
	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd7 = "aprv_role_cd7";
	/**
	 * Approval role name 7 (Main) 承認役割名７（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm7 = "aprv_role_nm7";
	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd8 = "aprv_role_cd8";
	/**
	 * Approval role name 8 (Main) 承認役割名８（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm8 = "aprv_role_nm8";
	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public static final String $aprv_role_cd9 = "aprv_role_cd9";
	/**
	 * Approval role name 9 (Main) 承認役割名９（主）.<p>
	 *
	 */
	public static final String $aprv_role_nm9 = "aprv_role_nm9";
	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd = "sub_aprv_role_cd";
	/**
	 * Approval role name (Sub) 承認役割名（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm = "sub_aprv_role_nm";
	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd1 = "sub_aprv_role_cd1";
	/**
	 * Approval role name 1 (Sub) 承認役割名１（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm1 = "sub_aprv_role_nm1";
	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd2 = "sub_aprv_role_cd2";
	/**
	 * Approval role name 2 (Sub) 承認役割名２（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm2 = "sub_aprv_role_nm2";
	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd3 = "sub_aprv_role_cd3";
	/**
	 * Approval role name 3 (Sub) 承認役割名３（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm3 = "sub_aprv_role_nm3";
	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd4 = "sub_aprv_role_cd4";
	/**
	 * Approval role name 4 (Sub) 承認役割名４（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm4 = "sub_aprv_role_nm4";
	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd5 = "sub_aprv_role_cd5";
	/**
	 * Approval role name 5 (Sub) 承認役割名５（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm5 = "sub_aprv_role_nm5";
	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd6 = "sub_aprv_role_cd6";
	/**
	 * Approval role name 6 (Sub) 承認役割名６（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm6 = "sub_aprv_role_nm6";
	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd7 = "sub_aprv_role_cd7";
	/**
	 * Approval role name 7 (Sub) 承認役割名７（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm7 = "sub_aprv_role_nm7";
	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd8 = "sub_aprv_role_cd8";
	/**
	 * Approval role name 8 (Sub) 承認役割名８（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm8 = "sub_aprv_role_nm8";
	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_cd9 = "sub_aprv_role_cd9";
	/**
	 * Approval role name 9 (Sub) 承認役割名９（副）.<p>
	 *
	 */
	public static final String $sub_aprv_role_nm9 = "sub_aprv_role_nm9";
	/**
	 * Main PIC/main dept. 主担当・主部門.<p>
	 *
	 */
	public static final String $main_flg = "main_flg";
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
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta license_flg_META = createCommonMeta($license_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta da_cd_META = createCommonMeta($da_cd, mcframe.commonMA.meta.MA_META.DA_CD);
	public static final MCMeta da_nm_META = createCommonMeta($da_nm, mcframe.commonMA.meta.MA_META.DA_NM);
	public static final MCMeta pre_cl_usr_flg_META = createCommonMeta($pre_cl_usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cl_usr_flg_META = createCommonMeta($cl_usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd1_META = createCommonMeta($add_dpt_cd1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm1_META = createCommonMeta($add_dpt_nm1, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd2_META = createCommonMeta($add_dpt_cd2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm2_META = createCommonMeta($add_dpt_nm2, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd3_META = createCommonMeta($add_dpt_cd3, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm3_META = createCommonMeta($add_dpt_nm3, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd4_META = createCommonMeta($add_dpt_cd4, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm4_META = createCommonMeta($add_dpt_nm4, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd5_META = createCommonMeta($add_dpt_cd5, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm5_META = createCommonMeta($add_dpt_nm5, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd6_META = createCommonMeta($add_dpt_cd6, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm6_META = createCommonMeta($add_dpt_nm6, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd7_META = createCommonMeta($add_dpt_cd7, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm7_META = createCommonMeta($add_dpt_nm7, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd8_META = createCommonMeta($add_dpt_cd8, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm8_META = createCommonMeta($add_dpt_nm8, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta add_dpt_cd9_META = createCommonMeta($add_dpt_cd9, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta add_dpt_nm9_META = createCommonMeta($add_dpt_nm9, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_role_cd_META = createCommonMeta($aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm_META = createCommonMeta($aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd1_META = createCommonMeta($aprv_role_cd1, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm1_META = createCommonMeta($aprv_role_nm1, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd2_META = createCommonMeta($aprv_role_cd2, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm2_META = createCommonMeta($aprv_role_nm2, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd3_META = createCommonMeta($aprv_role_cd3, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm3_META = createCommonMeta($aprv_role_nm3, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd4_META = createCommonMeta($aprv_role_cd4, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm4_META = createCommonMeta($aprv_role_nm4, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd5_META = createCommonMeta($aprv_role_cd5, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm5_META = createCommonMeta($aprv_role_nm5, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd6_META = createCommonMeta($aprv_role_cd6, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm6_META = createCommonMeta($aprv_role_nm6, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd7_META = createCommonMeta($aprv_role_cd7, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm7_META = createCommonMeta($aprv_role_nm7, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd8_META = createCommonMeta($aprv_role_cd8, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm8_META = createCommonMeta($aprv_role_nm8, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta aprv_role_cd9_META = createCommonMeta($aprv_role_cd9, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta aprv_role_nm9_META = createCommonMeta($aprv_role_nm9, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd_META = createCommonMeta($sub_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm_META = createCommonMeta($sub_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd1_META = createCommonMeta($sub_aprv_role_cd1, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm1_META = createCommonMeta($sub_aprv_role_nm1, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd2_META = createCommonMeta($sub_aprv_role_cd2, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm2_META = createCommonMeta($sub_aprv_role_nm2, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd3_META = createCommonMeta($sub_aprv_role_cd3, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm3_META = createCommonMeta($sub_aprv_role_nm3, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd4_META = createCommonMeta($sub_aprv_role_cd4, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm4_META = createCommonMeta($sub_aprv_role_nm4, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd5_META = createCommonMeta($sub_aprv_role_cd5, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm5_META = createCommonMeta($sub_aprv_role_nm5, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd6_META = createCommonMeta($sub_aprv_role_cd6, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm6_META = createCommonMeta($sub_aprv_role_nm6, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd7_META = createCommonMeta($sub_aprv_role_cd7, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm7_META = createCommonMeta($sub_aprv_role_nm7, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd8_META = createCommonMeta($sub_aprv_role_cd8, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm8_META = createCommonMeta($sub_aprv_role_nm8, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta sub_aprv_role_cd9_META = createCommonMeta($sub_aprv_role_cd9, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta sub_aprv_role_nm9_META = createCommonMeta($sub_aprv_role_nm9, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta main_flg_META = createCommonMeta($main_flg, mcframe.commonMA.meta.MA_META.FLG);
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
			usr_cd_META,
			usr_nm_META,
			license_flg_META,
			st_dt_META,
			end_dt_META,
			da_cd_META,
			da_nm_META,
			pre_cl_usr_flg_META,
			cl_usr_flg_META,
			dpt_cd_META,
			dpt_nm_META,
			add_dpt_cd1_META,
			add_dpt_nm1_META,
			add_dpt_cd2_META,
			add_dpt_nm2_META,
			add_dpt_cd3_META,
			add_dpt_nm3_META,
			add_dpt_cd4_META,
			add_dpt_nm4_META,
			add_dpt_cd5_META,
			add_dpt_nm5_META,
			add_dpt_cd6_META,
			add_dpt_nm6_META,
			add_dpt_cd7_META,
			add_dpt_nm7_META,
			add_dpt_cd8_META,
			add_dpt_nm8_META,
			add_dpt_cd9_META,
			add_dpt_nm9_META,
			aprv_role_cd_META,
			aprv_role_nm_META,
			aprv_role_cd1_META,
			aprv_role_nm1_META,
			aprv_role_cd2_META,
			aprv_role_nm2_META,
			aprv_role_cd3_META,
			aprv_role_nm3_META,
			aprv_role_cd4_META,
			aprv_role_nm4_META,
			aprv_role_cd5_META,
			aprv_role_nm5_META,
			aprv_role_cd6_META,
			aprv_role_nm6_META,
			aprv_role_cd7_META,
			aprv_role_nm7_META,
			aprv_role_cd8_META,
			aprv_role_nm8_META,
			aprv_role_cd9_META,
			aprv_role_nm9_META,
			sub_aprv_role_cd_META,
			sub_aprv_role_nm_META,
			sub_aprv_role_cd1_META,
			sub_aprv_role_nm1_META,
			sub_aprv_role_cd2_META,
			sub_aprv_role_nm2_META,
			sub_aprv_role_cd3_META,
			sub_aprv_role_nm3_META,
			sub_aprv_role_cd4_META,
			sub_aprv_role_nm4_META,
			sub_aprv_role_cd5_META,
			sub_aprv_role_nm5_META,
			sub_aprv_role_cd6_META,
			sub_aprv_role_nm6_META,
			sub_aprv_role_cd7_META,
			sub_aprv_role_nm7_META,
			sub_aprv_role_cd8_META,
			sub_aprv_role_nm8_META,
			sub_aprv_role_cd9_META,
			sub_aprv_role_nm9_META,
			main_flg_META,
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 1, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 1, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 2, $usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 2, $usr_nm, value);
	}


	/**
	 * License ライセンス.<p>
	 *
	 */
	public boolean license_flg() {
		return getConstBoolean(offset + 3, $license_flg);
	}

	/**
	 * License ライセンス.<p>
	 *
	 */
	public void license_flg(boolean value) {
		setConstBoolean(offset + 3, $license_flg, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 4, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 4, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 5, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 5, $end_dt, value);
	}


	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public String da_cd() {
		return getConstString(offset + 6, $da_cd);
	}

	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public void da_cd(String value) {
		setConstString(offset + 6, $da_cd, value);
	}


	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public String da_nm() {
		return getConstString(offset + 7, $da_nm);
	}

	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public void da_nm(String value) {
		setConstString(offset + 7, $da_nm, value);
	}


	/**
	 * Allow data correction after temporary closing 仮締訂正可能.<p>
	 *
	 */
	public boolean pre_cl_usr_flg() {
		return getConstBoolean(offset + 8, $pre_cl_usr_flg);
	}

	/**
	 * Allow data correction after temporary closing 仮締訂正可能.<p>
	 *
	 */
	public void pre_cl_usr_flg(boolean value) {
		setConstBoolean(offset + 8, $pre_cl_usr_flg, value);
	}


	/**
	 * Allow data correction after final closing 本締訂正可能.<p>
	 *
	 */
	public boolean cl_usr_flg() {
		return getConstBoolean(offset + 9, $cl_usr_flg);
	}

	/**
	 * Allow data correction after final closing 本締訂正可能.<p>
	 *
	 */
	public void cl_usr_flg(boolean value) {
		setConstBoolean(offset + 9, $cl_usr_flg, value);
	}


	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 10, $dpt_cd);
	}

	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 10, $dpt_cd, value);
	}


	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 11, $dpt_nm);
	}

	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 11, $dpt_nm, value);
	}


	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public String add_dpt_cd1() {
		return getConstString(offset + 12, $add_dpt_cd1);
	}

	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public void add_dpt_cd1(String value) {
		setConstString(offset + 12, $add_dpt_cd1, value);
	}


	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public String add_dpt_nm1() {
		return getConstString(offset + 13, $add_dpt_nm1);
	}

	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public void add_dpt_nm1(String value) {
		setConstString(offset + 13, $add_dpt_nm1, value);
	}


	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public String add_dpt_cd2() {
		return getConstString(offset + 14, $add_dpt_cd2);
	}

	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public void add_dpt_cd2(String value) {
		setConstString(offset + 14, $add_dpt_cd2, value);
	}


	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public String add_dpt_nm2() {
		return getConstString(offset + 15, $add_dpt_nm2);
	}

	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public void add_dpt_nm2(String value) {
		setConstString(offset + 15, $add_dpt_nm2, value);
	}


	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public String add_dpt_cd3() {
		return getConstString(offset + 16, $add_dpt_cd3);
	}

	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public void add_dpt_cd3(String value) {
		setConstString(offset + 16, $add_dpt_cd3, value);
	}


	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public String add_dpt_nm3() {
		return getConstString(offset + 17, $add_dpt_nm3);
	}

	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public void add_dpt_nm3(String value) {
		setConstString(offset + 17, $add_dpt_nm3, value);
	}


	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public String add_dpt_cd4() {
		return getConstString(offset + 18, $add_dpt_cd4);
	}

	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public void add_dpt_cd4(String value) {
		setConstString(offset + 18, $add_dpt_cd4, value);
	}


	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public String add_dpt_nm4() {
		return getConstString(offset + 19, $add_dpt_nm4);
	}

	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public void add_dpt_nm4(String value) {
		setConstString(offset + 19, $add_dpt_nm4, value);
	}


	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public String add_dpt_cd5() {
		return getConstString(offset + 20, $add_dpt_cd5);
	}

	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public void add_dpt_cd5(String value) {
		setConstString(offset + 20, $add_dpt_cd5, value);
	}


	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public String add_dpt_nm5() {
		return getConstString(offset + 21, $add_dpt_nm5);
	}

	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public void add_dpt_nm5(String value) {
		setConstString(offset + 21, $add_dpt_nm5, value);
	}


	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public String add_dpt_cd6() {
		return getConstString(offset + 22, $add_dpt_cd6);
	}

	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public void add_dpt_cd6(String value) {
		setConstString(offset + 22, $add_dpt_cd6, value);
	}


	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public String add_dpt_nm6() {
		return getConstString(offset + 23, $add_dpt_nm6);
	}

	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public void add_dpt_nm6(String value) {
		setConstString(offset + 23, $add_dpt_nm6, value);
	}


	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public String add_dpt_cd7() {
		return getConstString(offset + 24, $add_dpt_cd7);
	}

	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public void add_dpt_cd7(String value) {
		setConstString(offset + 24, $add_dpt_cd7, value);
	}


	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public String add_dpt_nm7() {
		return getConstString(offset + 25, $add_dpt_nm7);
	}

	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public void add_dpt_nm7(String value) {
		setConstString(offset + 25, $add_dpt_nm7, value);
	}


	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public String add_dpt_cd8() {
		return getConstString(offset + 26, $add_dpt_cd8);
	}

	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public void add_dpt_cd8(String value) {
		setConstString(offset + 26, $add_dpt_cd8, value);
	}


	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public String add_dpt_nm8() {
		return getConstString(offset + 27, $add_dpt_nm8);
	}

	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public void add_dpt_nm8(String value) {
		setConstString(offset + 27, $add_dpt_nm8, value);
	}


	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public String add_dpt_cd9() {
		return getConstString(offset + 28, $add_dpt_cd9);
	}

	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public void add_dpt_cd9(String value) {
		setConstString(offset + 28, $add_dpt_cd9, value);
	}


	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public String add_dpt_nm9() {
		return getConstString(offset + 29, $add_dpt_nm9);
	}

	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public void add_dpt_nm9(String value) {
		setConstString(offset + 29, $add_dpt_nm9, value);
	}


	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public String aprv_role_cd() {
		return getConstString(offset + 30, $aprv_role_cd);
	}

	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public void aprv_role_cd(String value) {
		setConstString(offset + 30, $aprv_role_cd, value);
	}


	/**
	 * Approval role name (Main) 承認役割名（主）.<p>
	 *
	 */
	public String aprv_role_nm() {
		return getConstString(offset + 31, $aprv_role_nm);
	}

	/**
	 * Approval role name (Main) 承認役割名（主）.<p>
	 *
	 */
	public void aprv_role_nm(String value) {
		setConstString(offset + 31, $aprv_role_nm, value);
	}


	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public String aprv_role_cd1() {
		return getConstString(offset + 32, $aprv_role_cd1);
	}

	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public void aprv_role_cd1(String value) {
		setConstString(offset + 32, $aprv_role_cd1, value);
	}


	/**
	 * Approval role name 1 (Main) 承認役割名１（主）.<p>
	 *
	 */
	public String aprv_role_nm1() {
		return getConstString(offset + 33, $aprv_role_nm1);
	}

	/**
	 * Approval role name 1 (Main) 承認役割名１（主）.<p>
	 *
	 */
	public void aprv_role_nm1(String value) {
		setConstString(offset + 33, $aprv_role_nm1, value);
	}


	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public String aprv_role_cd2() {
		return getConstString(offset + 34, $aprv_role_cd2);
	}

	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public void aprv_role_cd2(String value) {
		setConstString(offset + 34, $aprv_role_cd2, value);
	}


	/**
	 * Approval role name 2 (Main) 承認役割名２（主）.<p>
	 *
	 */
	public String aprv_role_nm2() {
		return getConstString(offset + 35, $aprv_role_nm2);
	}

	/**
	 * Approval role name 2 (Main) 承認役割名２（主）.<p>
	 *
	 */
	public void aprv_role_nm2(String value) {
		setConstString(offset + 35, $aprv_role_nm2, value);
	}


	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public String aprv_role_cd3() {
		return getConstString(offset + 36, $aprv_role_cd3);
	}

	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public void aprv_role_cd3(String value) {
		setConstString(offset + 36, $aprv_role_cd3, value);
	}


	/**
	 * Approval role name 3 (Main) 承認役割名３（主）.<p>
	 *
	 */
	public String aprv_role_nm3() {
		return getConstString(offset + 37, $aprv_role_nm3);
	}

	/**
	 * Approval role name 3 (Main) 承認役割名３（主）.<p>
	 *
	 */
	public void aprv_role_nm3(String value) {
		setConstString(offset + 37, $aprv_role_nm3, value);
	}


	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public String aprv_role_cd4() {
		return getConstString(offset + 38, $aprv_role_cd4);
	}

	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public void aprv_role_cd4(String value) {
		setConstString(offset + 38, $aprv_role_cd4, value);
	}


	/**
	 * Approval role name 4 (Main) 承認役割名４（主）.<p>
	 *
	 */
	public String aprv_role_nm4() {
		return getConstString(offset + 39, $aprv_role_nm4);
	}

	/**
	 * Approval role name 4 (Main) 承認役割名４（主）.<p>
	 *
	 */
	public void aprv_role_nm4(String value) {
		setConstString(offset + 39, $aprv_role_nm4, value);
	}


	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public String aprv_role_cd5() {
		return getConstString(offset + 40, $aprv_role_cd5);
	}

	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public void aprv_role_cd5(String value) {
		setConstString(offset + 40, $aprv_role_cd5, value);
	}


	/**
	 * Approval role name 5 (Main) 承認役割名５（主）.<p>
	 *
	 */
	public String aprv_role_nm5() {
		return getConstString(offset + 41, $aprv_role_nm5);
	}

	/**
	 * Approval role name 5 (Main) 承認役割名５（主）.<p>
	 *
	 */
	public void aprv_role_nm5(String value) {
		setConstString(offset + 41, $aprv_role_nm5, value);
	}


	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public String aprv_role_cd6() {
		return getConstString(offset + 42, $aprv_role_cd6);
	}

	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public void aprv_role_cd6(String value) {
		setConstString(offset + 42, $aprv_role_cd6, value);
	}


	/**
	 * Approval role name 6 (Main) 承認役割名６（主）.<p>
	 *
	 */
	public String aprv_role_nm6() {
		return getConstString(offset + 43, $aprv_role_nm6);
	}

	/**
	 * Approval role name 6 (Main) 承認役割名６（主）.<p>
	 *
	 */
	public void aprv_role_nm6(String value) {
		setConstString(offset + 43, $aprv_role_nm6, value);
	}


	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public String aprv_role_cd7() {
		return getConstString(offset + 44, $aprv_role_cd7);
	}

	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public void aprv_role_cd7(String value) {
		setConstString(offset + 44, $aprv_role_cd7, value);
	}


	/**
	 * Approval role name 7 (Main) 承認役割名７（主）.<p>
	 *
	 */
	public String aprv_role_nm7() {
		return getConstString(offset + 45, $aprv_role_nm7);
	}

	/**
	 * Approval role name 7 (Main) 承認役割名７（主）.<p>
	 *
	 */
	public void aprv_role_nm7(String value) {
		setConstString(offset + 45, $aprv_role_nm7, value);
	}


	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public String aprv_role_cd8() {
		return getConstString(offset + 46, $aprv_role_cd8);
	}

	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public void aprv_role_cd8(String value) {
		setConstString(offset + 46, $aprv_role_cd8, value);
	}


	/**
	 * Approval role name 8 (Main) 承認役割名８（主）.<p>
	 *
	 */
	public String aprv_role_nm8() {
		return getConstString(offset + 47, $aprv_role_nm8);
	}

	/**
	 * Approval role name 8 (Main) 承認役割名８（主）.<p>
	 *
	 */
	public void aprv_role_nm8(String value) {
		setConstString(offset + 47, $aprv_role_nm8, value);
	}


	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public String aprv_role_cd9() {
		return getConstString(offset + 48, $aprv_role_cd9);
	}

	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public void aprv_role_cd9(String value) {
		setConstString(offset + 48, $aprv_role_cd9, value);
	}


	/**
	 * Approval role name 9 (Main) 承認役割名９（主）.<p>
	 *
	 */
	public String aprv_role_nm9() {
		return getConstString(offset + 49, $aprv_role_nm9);
	}

	/**
	 * Approval role name 9 (Main) 承認役割名９（主）.<p>
	 *
	 */
	public void aprv_role_nm9(String value) {
		setConstString(offset + 49, $aprv_role_nm9, value);
	}


	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd() {
		return getConstString(offset + 50, $sub_aprv_role_cd);
	}

	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd(String value) {
		setConstString(offset + 50, $sub_aprv_role_cd, value);
	}


	/**
	 * Approval role name (Sub) 承認役割名（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm() {
		return getConstString(offset + 51, $sub_aprv_role_nm);
	}

	/**
	 * Approval role name (Sub) 承認役割名（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm(String value) {
		setConstString(offset + 51, $sub_aprv_role_nm, value);
	}


	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd1() {
		return getConstString(offset + 52, $sub_aprv_role_cd1);
	}

	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd1(String value) {
		setConstString(offset + 52, $sub_aprv_role_cd1, value);
	}


	/**
	 * Approval role name 1 (Sub) 承認役割名１（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm1() {
		return getConstString(offset + 53, $sub_aprv_role_nm1);
	}

	/**
	 * Approval role name 1 (Sub) 承認役割名１（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm1(String value) {
		setConstString(offset + 53, $sub_aprv_role_nm1, value);
	}


	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd2() {
		return getConstString(offset + 54, $sub_aprv_role_cd2);
	}

	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd2(String value) {
		setConstString(offset + 54, $sub_aprv_role_cd2, value);
	}


	/**
	 * Approval role name 2 (Sub) 承認役割名２（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm2() {
		return getConstString(offset + 55, $sub_aprv_role_nm2);
	}

	/**
	 * Approval role name 2 (Sub) 承認役割名２（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm2(String value) {
		setConstString(offset + 55, $sub_aprv_role_nm2, value);
	}


	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd3() {
		return getConstString(offset + 56, $sub_aprv_role_cd3);
	}

	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd3(String value) {
		setConstString(offset + 56, $sub_aprv_role_cd3, value);
	}


	/**
	 * Approval role name 3 (Sub) 承認役割名３（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm3() {
		return getConstString(offset + 57, $sub_aprv_role_nm3);
	}

	/**
	 * Approval role name 3 (Sub) 承認役割名３（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm3(String value) {
		setConstString(offset + 57, $sub_aprv_role_nm3, value);
	}


	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd4() {
		return getConstString(offset + 58, $sub_aprv_role_cd4);
	}

	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd4(String value) {
		setConstString(offset + 58, $sub_aprv_role_cd4, value);
	}


	/**
	 * Approval role name 4 (Sub) 承認役割名４（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm4() {
		return getConstString(offset + 59, $sub_aprv_role_nm4);
	}

	/**
	 * Approval role name 4 (Sub) 承認役割名４（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm4(String value) {
		setConstString(offset + 59, $sub_aprv_role_nm4, value);
	}


	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd5() {
		return getConstString(offset + 60, $sub_aprv_role_cd5);
	}

	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd5(String value) {
		setConstString(offset + 60, $sub_aprv_role_cd5, value);
	}


	/**
	 * Approval role name 5 (Sub) 承認役割名５（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm5() {
		return getConstString(offset + 61, $sub_aprv_role_nm5);
	}

	/**
	 * Approval role name 5 (Sub) 承認役割名５（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm5(String value) {
		setConstString(offset + 61, $sub_aprv_role_nm5, value);
	}


	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd6() {
		return getConstString(offset + 62, $sub_aprv_role_cd6);
	}

	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd6(String value) {
		setConstString(offset + 62, $sub_aprv_role_cd6, value);
	}


	/**
	 * Approval role name 6 (Sub) 承認役割名６（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm6() {
		return getConstString(offset + 63, $sub_aprv_role_nm6);
	}

	/**
	 * Approval role name 6 (Sub) 承認役割名６（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm6(String value) {
		setConstString(offset + 63, $sub_aprv_role_nm6, value);
	}


	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd7() {
		return getConstString(offset + 64, $sub_aprv_role_cd7);
	}

	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd7(String value) {
		setConstString(offset + 64, $sub_aprv_role_cd7, value);
	}


	/**
	 * Approval role name 7 (Sub) 承認役割名７（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm7() {
		return getConstString(offset + 65, $sub_aprv_role_nm7);
	}

	/**
	 * Approval role name 7 (Sub) 承認役割名７（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm7(String value) {
		setConstString(offset + 65, $sub_aprv_role_nm7, value);
	}


	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd8() {
		return getConstString(offset + 66, $sub_aprv_role_cd8);
	}

	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd8(String value) {
		setConstString(offset + 66, $sub_aprv_role_cd8, value);
	}


	/**
	 * Approval role name 8 (Sub) 承認役割名８（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm8() {
		return getConstString(offset + 67, $sub_aprv_role_nm8);
	}

	/**
	 * Approval role name 8 (Sub) 承認役割名８（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm8(String value) {
		setConstString(offset + 67, $sub_aprv_role_nm8, value);
	}


	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public String sub_aprv_role_cd9() {
		return getConstString(offset + 68, $sub_aprv_role_cd9);
	}

	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public void sub_aprv_role_cd9(String value) {
		setConstString(offset + 68, $sub_aprv_role_cd9, value);
	}


	/**
	 * Approval role name 9 (Sub) 承認役割名９（副）.<p>
	 *
	 */
	public String sub_aprv_role_nm9() {
		return getConstString(offset + 69, $sub_aprv_role_nm9);
	}

	/**
	 * Approval role name 9 (Sub) 承認役割名９（副）.<p>
	 *
	 */
	public void sub_aprv_role_nm9(String value) {
		setConstString(offset + 69, $sub_aprv_role_nm9, value);
	}


	/**
	 * Main PIC/main dept. 主担当・主部門.<p>
	 *
	 */
	public boolean main_flg() {
		return getConstBoolean(offset + 70, $main_flg);
	}

	/**
	 * Main PIC/main dept. 主担当・主部門.<p>
	 *
	 */
	public void main_flg(boolean value) {
		setConstBoolean(offset + 70, $main_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 71, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 71, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 72, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 72, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 73, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 73, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 74, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 74, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 75, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 75, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 76, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 77, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 77, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 78, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 78, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 79, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 79, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 80, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 80, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 81, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 81, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 82, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 82, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 83, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 83, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 84, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 84, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 85, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 85, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 86, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 86, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 87, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 87, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 88, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 88, $del_ts, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			return add_dpt_nm1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			return add_dpt_nm2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			return add_dpt_nm3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			return add_dpt_nm4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			return add_dpt_nm5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			return add_dpt_nm6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			return add_dpt_nm7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			return add_dpt_nm8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			return add_dpt_nm9();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			return aprv_role_cd1();
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			return aprv_role_nm1();
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			return aprv_role_cd2();
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			return aprv_role_nm2();
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			return aprv_role_cd3();
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			return aprv_role_nm3();
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			return aprv_role_cd4();
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			return aprv_role_nm4();
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			return aprv_role_cd5();
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			return aprv_role_nm5();
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			return aprv_role_cd6();
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			return aprv_role_nm6();
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			return aprv_role_cd7();
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			return aprv_role_nm7();
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			return aprv_role_cd8();
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			return aprv_role_nm8();
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			return aprv_role_cd9();
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			return aprv_role_nm9();
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd();
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm();
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd1();
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm1();
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd2();
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm2();
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd3();
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm3();
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd4();
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm4();
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd5();
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm5();
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd6();
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm6();
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd7();
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm7();
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd8();
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm8();
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd9();
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm9();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($license_flg.equalsIgnoreCase(name)) {
			return license_flg();
		}
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			return pre_cl_usr_flg();
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			return cl_usr_flg();
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			return main_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			return da_cd();
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			return da_nm();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			return add_dpt_cd1();
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			return add_dpt_nm1();
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			return add_dpt_cd2();
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			return add_dpt_nm2();
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			return add_dpt_cd3();
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			return add_dpt_nm3();
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			return add_dpt_cd4();
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			return add_dpt_nm4();
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			return add_dpt_cd5();
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			return add_dpt_nm5();
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			return add_dpt_cd6();
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			return add_dpt_nm6();
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			return add_dpt_cd7();
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			return add_dpt_nm7();
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			return add_dpt_cd8();
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			return add_dpt_nm8();
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			return add_dpt_cd9();
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			return add_dpt_nm9();
		}
		if ($aprv_role_cd.equalsIgnoreCase(name)) {
			return aprv_role_cd();
		}
		if ($aprv_role_nm.equalsIgnoreCase(name)) {
			return aprv_role_nm();
		}
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			return aprv_role_cd1();
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			return aprv_role_nm1();
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			return aprv_role_cd2();
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			return aprv_role_nm2();
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			return aprv_role_cd3();
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			return aprv_role_nm3();
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			return aprv_role_cd4();
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			return aprv_role_nm4();
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			return aprv_role_cd5();
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			return aprv_role_nm5();
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			return aprv_role_cd6();
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			return aprv_role_nm6();
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			return aprv_role_cd7();
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			return aprv_role_nm7();
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			return aprv_role_cd8();
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			return aprv_role_nm8();
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			return aprv_role_cd9();
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			return aprv_role_nm9();
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd();
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm();
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd1();
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm1();
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd2();
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm2();
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd3();
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm3();
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd4();
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm4();
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd5();
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm5();
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd6();
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm6();
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd7();
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm7();
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd8();
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm8();
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			return sub_aprv_role_cd9();
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			return sub_aprv_role_nm9();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($license_flg.equalsIgnoreCase(name)) {
			return license_flg();
		}
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			return pre_cl_usr_flg();
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			return cl_usr_flg();
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			return main_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
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
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			add_dpt_nm1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			add_dpt_nm2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			add_dpt_nm3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			add_dpt_nm4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			add_dpt_nm5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			add_dpt_nm6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			add_dpt_nm7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			add_dpt_nm8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			add_dpt_nm9(value);
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
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			aprv_role_cd1(value);
			return;
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			aprv_role_nm1(value);
			return;
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			aprv_role_cd2(value);
			return;
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			aprv_role_nm2(value);
			return;
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			aprv_role_cd3(value);
			return;
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			aprv_role_nm3(value);
			return;
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			aprv_role_cd4(value);
			return;
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			aprv_role_nm4(value);
			return;
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			aprv_role_cd5(value);
			return;
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			aprv_role_nm5(value);
			return;
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			aprv_role_cd6(value);
			return;
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			aprv_role_nm6(value);
			return;
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			aprv_role_cd7(value);
			return;
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			aprv_role_nm7(value);
			return;
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			aprv_role_cd8(value);
			return;
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			aprv_role_nm8(value);
			return;
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			aprv_role_cd9(value);
			return;
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			aprv_role_nm9(value);
			return;
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			sub_aprv_role_cd(value);
			return;
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			sub_aprv_role_nm(value);
			return;
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			sub_aprv_role_cd1(value);
			return;
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			sub_aprv_role_nm1(value);
			return;
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			sub_aprv_role_cd2(value);
			return;
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			sub_aprv_role_nm2(value);
			return;
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			sub_aprv_role_cd3(value);
			return;
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			sub_aprv_role_nm3(value);
			return;
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			sub_aprv_role_cd4(value);
			return;
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			sub_aprv_role_nm4(value);
			return;
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			sub_aprv_role_cd5(value);
			return;
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			sub_aprv_role_nm5(value);
			return;
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			sub_aprv_role_cd6(value);
			return;
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			sub_aprv_role_nm6(value);
			return;
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			sub_aprv_role_cd7(value);
			return;
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			sub_aprv_role_nm7(value);
			return;
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			sub_aprv_role_cd8(value);
			return;
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			sub_aprv_role_nm8(value);
			return;
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			sub_aprv_role_cd9(value);
			return;
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			sub_aprv_role_nm9(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($license_flg.equalsIgnoreCase(name)) {
			license_flg(value);
			return;
		}
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			pre_cl_usr_flg(value);
			return;
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			cl_usr_flg(value);
			return;
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			main_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($da_cd.equalsIgnoreCase(name)) {
			da_cd(value);
			return;
		}
		if ($da_nm.equalsIgnoreCase(name)) {
			da_nm(value);
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
		if ($add_dpt_cd1.equalsIgnoreCase(name)) {
			add_dpt_cd1(value);
			return;
		}
		if ($add_dpt_nm1.equalsIgnoreCase(name)) {
			add_dpt_nm1(value);
			return;
		}
		if ($add_dpt_cd2.equalsIgnoreCase(name)) {
			add_dpt_cd2(value);
			return;
		}
		if ($add_dpt_nm2.equalsIgnoreCase(name)) {
			add_dpt_nm2(value);
			return;
		}
		if ($add_dpt_cd3.equalsIgnoreCase(name)) {
			add_dpt_cd3(value);
			return;
		}
		if ($add_dpt_nm3.equalsIgnoreCase(name)) {
			add_dpt_nm3(value);
			return;
		}
		if ($add_dpt_cd4.equalsIgnoreCase(name)) {
			add_dpt_cd4(value);
			return;
		}
		if ($add_dpt_nm4.equalsIgnoreCase(name)) {
			add_dpt_nm4(value);
			return;
		}
		if ($add_dpt_cd5.equalsIgnoreCase(name)) {
			add_dpt_cd5(value);
			return;
		}
		if ($add_dpt_nm5.equalsIgnoreCase(name)) {
			add_dpt_nm5(value);
			return;
		}
		if ($add_dpt_cd6.equalsIgnoreCase(name)) {
			add_dpt_cd6(value);
			return;
		}
		if ($add_dpt_nm6.equalsIgnoreCase(name)) {
			add_dpt_nm6(value);
			return;
		}
		if ($add_dpt_cd7.equalsIgnoreCase(name)) {
			add_dpt_cd7(value);
			return;
		}
		if ($add_dpt_nm7.equalsIgnoreCase(name)) {
			add_dpt_nm7(value);
			return;
		}
		if ($add_dpt_cd8.equalsIgnoreCase(name)) {
			add_dpt_cd8(value);
			return;
		}
		if ($add_dpt_nm8.equalsIgnoreCase(name)) {
			add_dpt_nm8(value);
			return;
		}
		if ($add_dpt_cd9.equalsIgnoreCase(name)) {
			add_dpt_cd9(value);
			return;
		}
		if ($add_dpt_nm9.equalsIgnoreCase(name)) {
			add_dpt_nm9(value);
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
		if ($aprv_role_cd1.equalsIgnoreCase(name)) {
			aprv_role_cd1(value);
			return;
		}
		if ($aprv_role_nm1.equalsIgnoreCase(name)) {
			aprv_role_nm1(value);
			return;
		}
		if ($aprv_role_cd2.equalsIgnoreCase(name)) {
			aprv_role_cd2(value);
			return;
		}
		if ($aprv_role_nm2.equalsIgnoreCase(name)) {
			aprv_role_nm2(value);
			return;
		}
		if ($aprv_role_cd3.equalsIgnoreCase(name)) {
			aprv_role_cd3(value);
			return;
		}
		if ($aprv_role_nm3.equalsIgnoreCase(name)) {
			aprv_role_nm3(value);
			return;
		}
		if ($aprv_role_cd4.equalsIgnoreCase(name)) {
			aprv_role_cd4(value);
			return;
		}
		if ($aprv_role_nm4.equalsIgnoreCase(name)) {
			aprv_role_nm4(value);
			return;
		}
		if ($aprv_role_cd5.equalsIgnoreCase(name)) {
			aprv_role_cd5(value);
			return;
		}
		if ($aprv_role_nm5.equalsIgnoreCase(name)) {
			aprv_role_nm5(value);
			return;
		}
		if ($aprv_role_cd6.equalsIgnoreCase(name)) {
			aprv_role_cd6(value);
			return;
		}
		if ($aprv_role_nm6.equalsIgnoreCase(name)) {
			aprv_role_nm6(value);
			return;
		}
		if ($aprv_role_cd7.equalsIgnoreCase(name)) {
			aprv_role_cd7(value);
			return;
		}
		if ($aprv_role_nm7.equalsIgnoreCase(name)) {
			aprv_role_nm7(value);
			return;
		}
		if ($aprv_role_cd8.equalsIgnoreCase(name)) {
			aprv_role_cd8(value);
			return;
		}
		if ($aprv_role_nm8.equalsIgnoreCase(name)) {
			aprv_role_nm8(value);
			return;
		}
		if ($aprv_role_cd9.equalsIgnoreCase(name)) {
			aprv_role_cd9(value);
			return;
		}
		if ($aprv_role_nm9.equalsIgnoreCase(name)) {
			aprv_role_nm9(value);
			return;
		}
		if ($sub_aprv_role_cd.equalsIgnoreCase(name)) {
			sub_aprv_role_cd(value);
			return;
		}
		if ($sub_aprv_role_nm.equalsIgnoreCase(name)) {
			sub_aprv_role_nm(value);
			return;
		}
		if ($sub_aprv_role_cd1.equalsIgnoreCase(name)) {
			sub_aprv_role_cd1(value);
			return;
		}
		if ($sub_aprv_role_nm1.equalsIgnoreCase(name)) {
			sub_aprv_role_nm1(value);
			return;
		}
		if ($sub_aprv_role_cd2.equalsIgnoreCase(name)) {
			sub_aprv_role_cd2(value);
			return;
		}
		if ($sub_aprv_role_nm2.equalsIgnoreCase(name)) {
			sub_aprv_role_nm2(value);
			return;
		}
		if ($sub_aprv_role_cd3.equalsIgnoreCase(name)) {
			sub_aprv_role_cd3(value);
			return;
		}
		if ($sub_aprv_role_nm3.equalsIgnoreCase(name)) {
			sub_aprv_role_nm3(value);
			return;
		}
		if ($sub_aprv_role_cd4.equalsIgnoreCase(name)) {
			sub_aprv_role_cd4(value);
			return;
		}
		if ($sub_aprv_role_nm4.equalsIgnoreCase(name)) {
			sub_aprv_role_nm4(value);
			return;
		}
		if ($sub_aprv_role_cd5.equalsIgnoreCase(name)) {
			sub_aprv_role_cd5(value);
			return;
		}
		if ($sub_aprv_role_nm5.equalsIgnoreCase(name)) {
			sub_aprv_role_nm5(value);
			return;
		}
		if ($sub_aprv_role_cd6.equalsIgnoreCase(name)) {
			sub_aprv_role_cd6(value);
			return;
		}
		if ($sub_aprv_role_nm6.equalsIgnoreCase(name)) {
			sub_aprv_role_nm6(value);
			return;
		}
		if ($sub_aprv_role_cd7.equalsIgnoreCase(name)) {
			sub_aprv_role_cd7(value);
			return;
		}
		if ($sub_aprv_role_nm7.equalsIgnoreCase(name)) {
			sub_aprv_role_nm7(value);
			return;
		}
		if ($sub_aprv_role_cd8.equalsIgnoreCase(name)) {
			sub_aprv_role_cd8(value);
			return;
		}
		if ($sub_aprv_role_nm8.equalsIgnoreCase(name)) {
			sub_aprv_role_nm8(value);
			return;
		}
		if ($sub_aprv_role_cd9.equalsIgnoreCase(name)) {
			sub_aprv_role_cd9(value);
			return;
		}
		if ($sub_aprv_role_nm9.equalsIgnoreCase(name)) {
			sub_aprv_role_nm9(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($license_flg.equalsIgnoreCase(name)) {
			license_flg(value);
			return;
		}
		if ($pre_cl_usr_flg.equalsIgnoreCase(name)) {
			pre_cl_usr_flg(value);
			return;
		}
		if ($cl_usr_flg.equalsIgnoreCase(name)) {
			cl_usr_flg(value);
			return;
		}
		if ($main_flg.equalsIgnoreCase(name)) {
			main_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

