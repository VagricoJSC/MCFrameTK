package mcframe.clientMABC.MABCP0900;

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
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public static final String $key1 = "key1";
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public static final String $key2 = "key2";
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public static final String $key3 = "key3";
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public static final String $key4 = "key4";
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public static final String $key5 = "key5";
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public static final String $key6 = "key6";
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public static final String $key7 = "key7";
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public static final String $key8 = "key8";
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public static final String $key9 = "key9";
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public static final String $key10 = "key10";
	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public static final String $char1 = "char1";
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public static final String $char2 = "char2";
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public static final String $char3 = "char3";
	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public static final String $char4 = "char4";
	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public static final String $char5 = "char5";
	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public static final String $char6 = "char6";
	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public static final String $char7 = "char7";
	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public static final String $char8 = "char8";
	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public static final String $char9 = "char9";
	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public static final String $char10 = "char10";
	/**
	 * String 11 文字列１１.<p>
	 *
	 */
	public static final String $char11 = "char11";
	/**
	 * String 12 文字列１２.<p>
	 *
	 */
	public static final String $char12 = "char12";
	/**
	 * String 13 文字列１３.<p>
	 *
	 */
	public static final String $char13 = "char13";
	/**
	 * String 14 文字列１４.<p>
	 *
	 */
	public static final String $char14 = "char14";
	/**
	 * String 15 文字列１５.<p>
	 *
	 */
	public static final String $char15 = "char15";
	/**
	 * String 16 文字列１６.<p>
	 *
	 */
	public static final String $char16 = "char16";
	/**
	 * String 17 文字列１７.<p>
	 *
	 */
	public static final String $char17 = "char17";
	/**
	 * String 18 文字列１８.<p>
	 *
	 */
	public static final String $char18 = "char18";
	/**
	 * String 19 文字列１９.<p>
	 *
	 */
	public static final String $char19 = "char19";
	/**
	 * String 20 文字列２０.<p>
	 *
	 */
	public static final String $char20 = "char20";
	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public static final String $num1 = "num1";
	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public static final String $num2 = "num2";
	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public static final String $num3 = "num3";
	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public static final String $num4 = "num4";
	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public static final String $num5 = "num5";
	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public static final String $num6 = "num6";
	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public static final String $num7 = "num7";
	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public static final String $num8 = "num8";
	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public static final String $num9 = "num9";
	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public static final String $num10 = "num10";
	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public static final String $dt1 = "dt1";
	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public static final String $dt2 = "dt2";
	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public static final String $dt3 = "dt3";
	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public static final String $dt4 = "dt4";
	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public static final String $dt5 = "dt5";
	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public static final String $dt6 = "dt6";
	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public static final String $dt7 = "dt7";
	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public static final String $dt8 = "dt8";
	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public static final String $dt9 = "dt9";
	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public static final String $dt10 = "dt10";
	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public static final String $flg1 = "flg1";
	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public static final String $flg2 = "flg2";
	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public static final String $flg3 = "flg3";
	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public static final String $flg4 = "flg4";
	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public static final String $flg5 = "flg5";
	/**
	 * Flg. 6 フラグ６.<p>
	 *
	 */
	public static final String $flg6 = "flg6";
	/**
	 * Flg. 7 フラグ７.<p>
	 *
	 */
	public static final String $flg7 = "flg7";
	/**
	 * Flg. 8 フラグ８.<p>
	 *
	 */
	public static final String $flg8 = "flg8";
	/**
	 * Flg. 9 フラグ９.<p>
	 *
	 */
	public static final String $flg9 = "flg9";
	/**
	 * Flg. 10 フラグ１０.<p>
	 *
	 */
	public static final String $flg10 = "flg10";
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);
	public static final MCMeta char1_META = createCommonMeta($char1, mcframe.commonMA.meta.MA_META.GP_CHAR1);
	public static final MCMeta char2_META = createCommonMeta($char2, mcframe.commonMA.meta.MA_META.GP_CHAR2);
	public static final MCMeta char3_META = createCommonMeta($char3, mcframe.commonMA.meta.MA_META.GP_CHAR3);
	public static final MCMeta char4_META = createCommonMeta($char4, mcframe.commonMA.meta.MA_META.GP_CHAR4);
	public static final MCMeta char5_META = createCommonMeta($char5, mcframe.commonMA.meta.MA_META.GP_CHAR5);
	public static final MCMeta char6_META = createCommonMeta($char6, mcframe.commonMA.meta.MA_META.GP_CHAR6);
	public static final MCMeta char7_META = createCommonMeta($char7, mcframe.commonMA.meta.MA_META.GP_CHAR7);
	public static final MCMeta char8_META = createCommonMeta($char8, mcframe.commonMA.meta.MA_META.GP_CHAR8);
	public static final MCMeta char9_META = createCommonMeta($char9, mcframe.commonMA.meta.MA_META.GP_CHAR9);
	public static final MCMeta char10_META = createCommonMeta($char10, mcframe.commonMA.meta.MA_META.GP_CHAR10);
	public static final MCMeta char11_META = createCommonMeta($char11, mcframe.commonMA.meta.MA_META.GP_CHAR11);
	public static final MCMeta char12_META = createCommonMeta($char12, mcframe.commonMA.meta.MA_META.GP_CHAR12);
	public static final MCMeta char13_META = createCommonMeta($char13, mcframe.commonMA.meta.MA_META.GP_CHAR13);
	public static final MCMeta char14_META = createCommonMeta($char14, mcframe.commonMA.meta.MA_META.GP_CHAR14);
	public static final MCMeta char15_META = createCommonMeta($char15, mcframe.commonMA.meta.MA_META.GP_CHAR15);
	public static final MCMeta char16_META = createCommonMeta($char16, mcframe.commonMA.meta.MA_META.GP_CHAR16);
	public static final MCMeta char17_META = createCommonMeta($char17, mcframe.commonMA.meta.MA_META.GP_CHAR17);
	public static final MCMeta char18_META = createCommonMeta($char18, mcframe.commonMA.meta.MA_META.GP_CHAR18);
	public static final MCMeta char19_META = createCommonMeta($char19, mcframe.commonMA.meta.MA_META.GP_CHAR19);
	public static final MCMeta char20_META = createCommonMeta($char20, mcframe.commonMA.meta.MA_META.GP_CHAR20);
	public static final MCMeta num1_META = createCommonMeta($num1, mcframe.commonMA.meta.MA_META.GP_NUM1);
	public static final MCMeta num2_META = createCommonMeta($num2, mcframe.commonMA.meta.MA_META.GP_NUM2);
	public static final MCMeta num3_META = createCommonMeta($num3, mcframe.commonMA.meta.MA_META.GP_NUM3);
	public static final MCMeta num4_META = createCommonMeta($num4, mcframe.commonMA.meta.MA_META.GP_NUM4);
	public static final MCMeta num5_META = createCommonMeta($num5, mcframe.commonMA.meta.MA_META.GP_NUM5);
	public static final MCMeta num6_META = createCommonMeta($num6, mcframe.commonMA.meta.MA_META.GP_NUM6);
	public static final MCMeta num7_META = createCommonMeta($num7, mcframe.commonMA.meta.MA_META.GP_NUM7);
	public static final MCMeta num8_META = createCommonMeta($num8, mcframe.commonMA.meta.MA_META.GP_NUM8);
	public static final MCMeta num9_META = createCommonMeta($num9, mcframe.commonMA.meta.MA_META.GP_NUM9);
	public static final MCMeta num10_META = createCommonMeta($num10, mcframe.commonMA.meta.MA_META.GP_NUM10);
	public static final MCMeta dt1_META = createCommonMeta($dt1, mcframe.commonMA.meta.MA_META.GP_DT1);
	public static final MCMeta dt2_META = createCommonMeta($dt2, mcframe.commonMA.meta.MA_META.GP_DT2);
	public static final MCMeta dt3_META = createCommonMeta($dt3, mcframe.commonMA.meta.MA_META.GP_DT3);
	public static final MCMeta dt4_META = createCommonMeta($dt4, mcframe.commonMA.meta.MA_META.GP_DT4);
	public static final MCMeta dt5_META = createCommonMeta($dt5, mcframe.commonMA.meta.MA_META.GP_DT5);
	public static final MCMeta dt6_META = createCommonMeta($dt6, mcframe.commonMA.meta.MA_META.GP_DT6);
	public static final MCMeta dt7_META = createCommonMeta($dt7, mcframe.commonMA.meta.MA_META.GP_DT7);
	public static final MCMeta dt8_META = createCommonMeta($dt8, mcframe.commonMA.meta.MA_META.GP_DT8);
	public static final MCMeta dt9_META = createCommonMeta($dt9, mcframe.commonMA.meta.MA_META.GP_DT9);
	public static final MCMeta dt10_META = createCommonMeta($dt10, mcframe.commonMA.meta.MA_META.GP_DT10);
	public static final MCMeta flg1_META = createCommonMeta($flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg2_META = createCommonMeta($flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg3_META = createCommonMeta($flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg4_META = createCommonMeta($flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg5_META = createCommonMeta($flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg6_META = createCommonMeta($flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg7_META = createCommonMeta($flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg8_META = createCommonMeta($flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg9_META = createCommonMeta($flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg10_META = createCommonMeta($flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			gp_grp_cd_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META,
			char1_META,
			char2_META,
			char3_META,
			char4_META,
			char5_META,
			char6_META,
			char7_META,
			char8_META,
			char9_META,
			char10_META,
			char11_META,
			char12_META,
			char13_META,
			char14_META,
			char15_META,
			char16_META,
			char17_META,
			char18_META,
			char19_META,
			char20_META,
			num1_META,
			num2_META,
			num3_META,
			num4_META,
			num5_META,
			num6_META,
			num7_META,
			num8_META,
			num9_META,
			num10_META,
			dt1_META,
			dt2_META,
			dt3_META,
			dt4_META,
			dt5_META,
			dt6_META,
			dt7_META,
			dt8_META,
			dt9_META,
			dt10_META,
			flg1_META,
			flg2_META,
			flg3_META,
			flg4_META,
			flg5_META,
			flg6_META,
			flg7_META,
			flg8_META,
			flg9_META,
			flg10_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			upd_cntr_META
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
			$gp_grp_cd,	// gp_grp_cd
			$key1,	// key1
			$key2,	// key2
			$key3,	// key3
			$key4,	// key4
			$key5,	// key5
			$key6,	// key6
			$key7,	// key7
			$key8,	// key8
			$key9,	// key9
			$key10	// key10
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
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
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
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 2, $gp_grp_cd);
	}

	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 2, $gp_grp_cd, value);
	}


	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 3, $key1);
	}

	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 3, $key1, value);
	}


	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 4, $key2);
	}

	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 4, $key2, value);
	}


	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 5, $key3);
	}

	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 5, $key3, value);
	}


	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 6, $key4);
	}

	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 6, $key4, value);
	}


	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 7, $key5);
	}

	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 7, $key5, value);
	}


	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 8, $key6);
	}

	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 8, $key6, value);
	}


	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 9, $key7);
	}

	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 9, $key7, value);
	}


	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 10, $key8);
	}

	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 10, $key8, value);
	}


	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 11, $key9);
	}

	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 11, $key9, value);
	}


	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 12, $key10);
	}

	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 12, $key10, value);
	}


	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public String char1() {
		return getConstString(offset + 13, $char1);
	}

	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public void char1(String value) {
		setConstString(offset + 13, $char1, value);
	}


	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public String char2() {
		return getConstString(offset + 14, $char2);
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public void char2(String value) {
		setConstString(offset + 14, $char2, value);
	}


	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public String char3() {
		return getConstString(offset + 15, $char3);
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public void char3(String value) {
		setConstString(offset + 15, $char3, value);
	}


	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public String char4() {
		return getConstString(offset + 16, $char4);
	}

	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public void char4(String value) {
		setConstString(offset + 16, $char4, value);
	}


	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public String char5() {
		return getConstString(offset + 17, $char5);
	}

	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public void char5(String value) {
		setConstString(offset + 17, $char5, value);
	}


	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public String char6() {
		return getConstString(offset + 18, $char6);
	}

	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public void char6(String value) {
		setConstString(offset + 18, $char6, value);
	}


	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public String char7() {
		return getConstString(offset + 19, $char7);
	}

	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public void char7(String value) {
		setConstString(offset + 19, $char7, value);
	}


	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public String char8() {
		return getConstString(offset + 20, $char8);
	}

	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public void char8(String value) {
		setConstString(offset + 20, $char8, value);
	}


	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public String char9() {
		return getConstString(offset + 21, $char9);
	}

	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public void char9(String value) {
		setConstString(offset + 21, $char9, value);
	}


	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public String char10() {
		return getConstString(offset + 22, $char10);
	}

	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public void char10(String value) {
		setConstString(offset + 22, $char10, value);
	}


	/**
	 * String 11 文字列１１.<p>
	 *
	 */
	public String char11() {
		return getConstString(offset + 23, $char11);
	}

	/**
	 * String 11 文字列１１.<p>
	 *
	 */
	public void char11(String value) {
		setConstString(offset + 23, $char11, value);
	}


	/**
	 * String 12 文字列１２.<p>
	 *
	 */
	public String char12() {
		return getConstString(offset + 24, $char12);
	}

	/**
	 * String 12 文字列１２.<p>
	 *
	 */
	public void char12(String value) {
		setConstString(offset + 24, $char12, value);
	}


	/**
	 * String 13 文字列１３.<p>
	 *
	 */
	public String char13() {
		return getConstString(offset + 25, $char13);
	}

	/**
	 * String 13 文字列１３.<p>
	 *
	 */
	public void char13(String value) {
		setConstString(offset + 25, $char13, value);
	}


	/**
	 * String 14 文字列１４.<p>
	 *
	 */
	public String char14() {
		return getConstString(offset + 26, $char14);
	}

	/**
	 * String 14 文字列１４.<p>
	 *
	 */
	public void char14(String value) {
		setConstString(offset + 26, $char14, value);
	}


	/**
	 * String 15 文字列１５.<p>
	 *
	 */
	public String char15() {
		return getConstString(offset + 27, $char15);
	}

	/**
	 * String 15 文字列１５.<p>
	 *
	 */
	public void char15(String value) {
		setConstString(offset + 27, $char15, value);
	}


	/**
	 * String 16 文字列１６.<p>
	 *
	 */
	public String char16() {
		return getConstString(offset + 28, $char16);
	}

	/**
	 * String 16 文字列１６.<p>
	 *
	 */
	public void char16(String value) {
		setConstString(offset + 28, $char16, value);
	}


	/**
	 * String 17 文字列１７.<p>
	 *
	 */
	public String char17() {
		return getConstString(offset + 29, $char17);
	}

	/**
	 * String 17 文字列１７.<p>
	 *
	 */
	public void char17(String value) {
		setConstString(offset + 29, $char17, value);
	}


	/**
	 * String 18 文字列１８.<p>
	 *
	 */
	public String char18() {
		return getConstString(offset + 30, $char18);
	}

	/**
	 * String 18 文字列１８.<p>
	 *
	 */
	public void char18(String value) {
		setConstString(offset + 30, $char18, value);
	}


	/**
	 * String 19 文字列１９.<p>
	 *
	 */
	public String char19() {
		return getConstString(offset + 31, $char19);
	}

	/**
	 * String 19 文字列１９.<p>
	 *
	 */
	public void char19(String value) {
		setConstString(offset + 31, $char19, value);
	}


	/**
	 * String 20 文字列２０.<p>
	 *
	 */
	public String char20() {
		return getConstString(offset + 32, $char20);
	}

	/**
	 * String 20 文字列２０.<p>
	 *
	 */
	public void char20(String value) {
		setConstString(offset + 32, $char20, value);
	}


	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public MCNumber num1() {
		return getConstNumber(offset + 33, $num1);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(MCNumber value) {
		setConstNumber(offset + 33, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(int value) {
		setConstNumber(offset + 33, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(long value) {
		setConstNumber(offset + 33, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(float value) {
		setConstNumber(offset + 33, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(double value) {
		setConstNumber(offset + 33, $num1, value);
	}


	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public MCNumber num2() {
		return getConstNumber(offset + 34, $num2);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(MCNumber value) {
		setConstNumber(offset + 34, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(int value) {
		setConstNumber(offset + 34, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(long value) {
		setConstNumber(offset + 34, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(float value) {
		setConstNumber(offset + 34, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(double value) {
		setConstNumber(offset + 34, $num2, value);
	}


	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public MCNumber num3() {
		return getConstNumber(offset + 35, $num3);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(MCNumber value) {
		setConstNumber(offset + 35, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(int value) {
		setConstNumber(offset + 35, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(long value) {
		setConstNumber(offset + 35, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(float value) {
		setConstNumber(offset + 35, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(double value) {
		setConstNumber(offset + 35, $num3, value);
	}


	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public MCNumber num4() {
		return getConstNumber(offset + 36, $num4);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(MCNumber value) {
		setConstNumber(offset + 36, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(int value) {
		setConstNumber(offset + 36, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(long value) {
		setConstNumber(offset + 36, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(float value) {
		setConstNumber(offset + 36, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(double value) {
		setConstNumber(offset + 36, $num4, value);
	}


	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public MCNumber num5() {
		return getConstNumber(offset + 37, $num5);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(MCNumber value) {
		setConstNumber(offset + 37, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(int value) {
		setConstNumber(offset + 37, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(long value) {
		setConstNumber(offset + 37, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(float value) {
		setConstNumber(offset + 37, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(double value) {
		setConstNumber(offset + 37, $num5, value);
	}


	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public MCNumber num6() {
		return getConstNumber(offset + 38, $num6);
	}

	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public void num6(MCNumber value) {
		setConstNumber(offset + 38, $num6, value);
	}

	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public void num6(int value) {
		setConstNumber(offset + 38, $num6, value);
	}

	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public void num6(long value) {
		setConstNumber(offset + 38, $num6, value);
	}

	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public void num6(float value) {
		setConstNumber(offset + 38, $num6, value);
	}

	/**
	 * Numerical 6 数値６.<p>
	 *
	 */
	public void num6(double value) {
		setConstNumber(offset + 38, $num6, value);
	}


	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public MCNumber num7() {
		return getConstNumber(offset + 39, $num7);
	}

	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public void num7(MCNumber value) {
		setConstNumber(offset + 39, $num7, value);
	}

	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public void num7(int value) {
		setConstNumber(offset + 39, $num7, value);
	}

	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public void num7(long value) {
		setConstNumber(offset + 39, $num7, value);
	}

	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public void num7(float value) {
		setConstNumber(offset + 39, $num7, value);
	}

	/**
	 * Numerical 7 数値７.<p>
	 *
	 */
	public void num7(double value) {
		setConstNumber(offset + 39, $num7, value);
	}


	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public MCNumber num8() {
		return getConstNumber(offset + 40, $num8);
	}

	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public void num8(MCNumber value) {
		setConstNumber(offset + 40, $num8, value);
	}

	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public void num8(int value) {
		setConstNumber(offset + 40, $num8, value);
	}

	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public void num8(long value) {
		setConstNumber(offset + 40, $num8, value);
	}

	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public void num8(float value) {
		setConstNumber(offset + 40, $num8, value);
	}

	/**
	 * Numerical 8 数値８.<p>
	 *
	 */
	public void num8(double value) {
		setConstNumber(offset + 40, $num8, value);
	}


	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public MCNumber num9() {
		return getConstNumber(offset + 41, $num9);
	}

	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public void num9(MCNumber value) {
		setConstNumber(offset + 41, $num9, value);
	}

	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public void num9(int value) {
		setConstNumber(offset + 41, $num9, value);
	}

	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public void num9(long value) {
		setConstNumber(offset + 41, $num9, value);
	}

	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public void num9(float value) {
		setConstNumber(offset + 41, $num9, value);
	}

	/**
	 * Numerical 9 数値９.<p>
	 *
	 */
	public void num9(double value) {
		setConstNumber(offset + 41, $num9, value);
	}


	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public MCNumber num10() {
		return getConstNumber(offset + 42, $num10);
	}

	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public void num10(MCNumber value) {
		setConstNumber(offset + 42, $num10, value);
	}

	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public void num10(int value) {
		setConstNumber(offset + 42, $num10, value);
	}

	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public void num10(long value) {
		setConstNumber(offset + 42, $num10, value);
	}

	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public void num10(float value) {
		setConstNumber(offset + 42, $num10, value);
	}

	/**
	 * Numerical 10 数値１０.<p>
	 *
	 */
	public void num10(double value) {
		setConstNumber(offset + 42, $num10, value);
	}


	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public MCDate dt1() {
		return getConstDate(offset + 43, $dt1);
	}

	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public void dt1(MCDate value) {
		setConstDate(offset + 43, $dt1, value);
	}


	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public MCDate dt2() {
		return getConstDate(offset + 44, $dt2);
	}

	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public void dt2(MCDate value) {
		setConstDate(offset + 44, $dt2, value);
	}


	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public MCDate dt3() {
		return getConstDate(offset + 45, $dt3);
	}

	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public void dt3(MCDate value) {
		setConstDate(offset + 45, $dt3, value);
	}


	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public MCDate dt4() {
		return getConstDate(offset + 46, $dt4);
	}

	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public void dt4(MCDate value) {
		setConstDate(offset + 46, $dt4, value);
	}


	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public MCDate dt5() {
		return getConstDate(offset + 47, $dt5);
	}

	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public void dt5(MCDate value) {
		setConstDate(offset + 47, $dt5, value);
	}


	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public MCDate dt6() {
		return getConstDate(offset + 48, $dt6);
	}

	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public void dt6(MCDate value) {
		setConstDate(offset + 48, $dt6, value);
	}


	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public MCDate dt7() {
		return getConstDate(offset + 49, $dt7);
	}

	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public void dt7(MCDate value) {
		setConstDate(offset + 49, $dt7, value);
	}


	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public MCDate dt8() {
		return getConstDate(offset + 50, $dt8);
	}

	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public void dt8(MCDate value) {
		setConstDate(offset + 50, $dt8, value);
	}


	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public MCDate dt9() {
		return getConstDate(offset + 51, $dt9);
	}

	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public void dt9(MCDate value) {
		setConstDate(offset + 51, $dt9, value);
	}


	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public MCDate dt10() {
		return getConstDate(offset + 52, $dt10);
	}

	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public void dt10(MCDate value) {
		setConstDate(offset + 52, $dt10, value);
	}


	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public boolean flg1() {
		return getConstBoolean(offset + 53, $flg1);
	}

	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public void flg1(boolean value) {
		setConstBoolean(offset + 53, $flg1, value);
	}


	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public boolean flg2() {
		return getConstBoolean(offset + 54, $flg2);
	}

	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public void flg2(boolean value) {
		setConstBoolean(offset + 54, $flg2, value);
	}


	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public boolean flg3() {
		return getConstBoolean(offset + 55, $flg3);
	}

	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public void flg3(boolean value) {
		setConstBoolean(offset + 55, $flg3, value);
	}


	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public boolean flg4() {
		return getConstBoolean(offset + 56, $flg4);
	}

	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public void flg4(boolean value) {
		setConstBoolean(offset + 56, $flg4, value);
	}


	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public boolean flg5() {
		return getConstBoolean(offset + 57, $flg5);
	}

	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public void flg5(boolean value) {
		setConstBoolean(offset + 57, $flg5, value);
	}


	/**
	 * Flg. 6 フラグ６.<p>
	 *
	 */
	public boolean flg6() {
		return getConstBoolean(offset + 58, $flg6);
	}

	/**
	 * Flg. 6 フラグ６.<p>
	 *
	 */
	public void flg6(boolean value) {
		setConstBoolean(offset + 58, $flg6, value);
	}


	/**
	 * Flg. 7 フラグ７.<p>
	 *
	 */
	public boolean flg7() {
		return getConstBoolean(offset + 59, $flg7);
	}

	/**
	 * Flg. 7 フラグ７.<p>
	 *
	 */
	public void flg7(boolean value) {
		setConstBoolean(offset + 59, $flg7, value);
	}


	/**
	 * Flg. 8 フラグ８.<p>
	 *
	 */
	public boolean flg8() {
		return getConstBoolean(offset + 60, $flg8);
	}

	/**
	 * Flg. 8 フラグ８.<p>
	 *
	 */
	public void flg8(boolean value) {
		setConstBoolean(offset + 60, $flg8, value);
	}


	/**
	 * Flg. 9 フラグ９.<p>
	 *
	 */
	public boolean flg9() {
		return getConstBoolean(offset + 61, $flg9);
	}

	/**
	 * Flg. 9 フラグ９.<p>
	 *
	 */
	public void flg9(boolean value) {
		setConstBoolean(offset + 61, $flg9, value);
	}


	/**
	 * Flg. 10 フラグ１０.<p>
	 *
	 */
	public boolean flg10() {
		return getConstBoolean(offset + 62, $flg10);
	}

	/**
	 * Flg. 10 フラグ１０.<p>
	 *
	 */
	public void flg10(boolean value) {
		setConstBoolean(offset + 62, $flg10, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 63, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 63, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 64, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 64, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 65, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 65, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 66, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 66, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 67, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 67, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 68, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 68, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 69, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 69, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 70, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 70, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 71, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 71, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 72, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 72, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 73, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 73, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 74, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 74, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 75, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 75, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 76, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 76, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 77, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 77, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 78, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 78, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 79, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 79, $del_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 80, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 80, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
		}
		if ($char11.equalsIgnoreCase(name)) {
			return char11();
		}
		if ($char12.equalsIgnoreCase(name)) {
			return char12();
		}
		if ($char13.equalsIgnoreCase(name)) {
			return char13();
		}
		if ($char14.equalsIgnoreCase(name)) {
			return char14();
		}
		if ($char15.equalsIgnoreCase(name)) {
			return char15();
		}
		if ($char16.equalsIgnoreCase(name)) {
			return char16();
		}
		if ($char17.equalsIgnoreCase(name)) {
			return char17();
		}
		if ($char18.equalsIgnoreCase(name)) {
			return char18();
		}
		if ($char19.equalsIgnoreCase(name)) {
			return char19();
		}
		if ($char20.equalsIgnoreCase(name)) {
			return char20();
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
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
		if ($num4.equalsIgnoreCase(name)) {
			return num4();
		}
		if ($num5.equalsIgnoreCase(name)) {
			return num5();
		}
		if ($num6.equalsIgnoreCase(name)) {
			return num6();
		}
		if ($num7.equalsIgnoreCase(name)) {
			return num7();
		}
		if ($num8.equalsIgnoreCase(name)) {
			return num8();
		}
		if ($num9.equalsIgnoreCase(name)) {
			return num9();
		}
		if ($num10.equalsIgnoreCase(name)) {
			return num10();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt1.equalsIgnoreCase(name)) {
			return dt1();
		}
		if ($dt2.equalsIgnoreCase(name)) {
			return dt2();
		}
		if ($dt3.equalsIgnoreCase(name)) {
			return dt3();
		}
		if ($dt4.equalsIgnoreCase(name)) {
			return dt4();
		}
		if ($dt5.equalsIgnoreCase(name)) {
			return dt5();
		}
		if ($dt6.equalsIgnoreCase(name)) {
			return dt6();
		}
		if ($dt7.equalsIgnoreCase(name)) {
			return dt7();
		}
		if ($dt8.equalsIgnoreCase(name)) {
			return dt8();
		}
		if ($dt9.equalsIgnoreCase(name)) {
			return dt9();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($flg4.equalsIgnoreCase(name)) {
			return flg4();
		}
		if ($flg5.equalsIgnoreCase(name)) {
			return flg5();
		}
		if ($flg6.equalsIgnoreCase(name)) {
			return flg6();
		}
		if ($flg7.equalsIgnoreCase(name)) {
			return flg7();
		}
		if ($flg8.equalsIgnoreCase(name)) {
			return flg8();
		}
		if ($flg9.equalsIgnoreCase(name)) {
			return flg9();
		}
		if ($flg10.equalsIgnoreCase(name)) {
			return flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
		}
		if ($char11.equalsIgnoreCase(name)) {
			return char11();
		}
		if ($char12.equalsIgnoreCase(name)) {
			return char12();
		}
		if ($char13.equalsIgnoreCase(name)) {
			return char13();
		}
		if ($char14.equalsIgnoreCase(name)) {
			return char14();
		}
		if ($char15.equalsIgnoreCase(name)) {
			return char15();
		}
		if ($char16.equalsIgnoreCase(name)) {
			return char16();
		}
		if ($char17.equalsIgnoreCase(name)) {
			return char17();
		}
		if ($char18.equalsIgnoreCase(name)) {
			return char18();
		}
		if ($char19.equalsIgnoreCase(name)) {
			return char19();
		}
		if ($char20.equalsIgnoreCase(name)) {
			return char20();
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
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
		if ($num4.equalsIgnoreCase(name)) {
			return num4();
		}
		if ($num5.equalsIgnoreCase(name)) {
			return num5();
		}
		if ($num6.equalsIgnoreCase(name)) {
			return num6();
		}
		if ($num7.equalsIgnoreCase(name)) {
			return num7();
		}
		if ($num8.equalsIgnoreCase(name)) {
			return num8();
		}
		if ($num9.equalsIgnoreCase(name)) {
			return num9();
		}
		if ($num10.equalsIgnoreCase(name)) {
			return num10();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt1.equalsIgnoreCase(name)) {
			return dt1();
		}
		if ($dt2.equalsIgnoreCase(name)) {
			return dt2();
		}
		if ($dt3.equalsIgnoreCase(name)) {
			return dt3();
		}
		if ($dt4.equalsIgnoreCase(name)) {
			return dt4();
		}
		if ($dt5.equalsIgnoreCase(name)) {
			return dt5();
		}
		if ($dt6.equalsIgnoreCase(name)) {
			return dt6();
		}
		if ($dt7.equalsIgnoreCase(name)) {
			return dt7();
		}
		if ($dt8.equalsIgnoreCase(name)) {
			return dt8();
		}
		if ($dt9.equalsIgnoreCase(name)) {
			return dt9();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($flg4.equalsIgnoreCase(name)) {
			return flg4();
		}
		if ($flg5.equalsIgnoreCase(name)) {
			return flg5();
		}
		if ($flg6.equalsIgnoreCase(name)) {
			return flg6();
		}
		if ($flg7.equalsIgnoreCase(name)) {
			return flg7();
		}
		if ($flg8.equalsIgnoreCase(name)) {
			return flg8();
		}
		if ($flg9.equalsIgnoreCase(name)) {
			return flg9();
		}
		if ($flg10.equalsIgnoreCase(name)) {
			return flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
			return;
		}
		if ($char11.equalsIgnoreCase(name)) {
			char11(value);
			return;
		}
		if ($char12.equalsIgnoreCase(name)) {
			char12(value);
			return;
		}
		if ($char13.equalsIgnoreCase(name)) {
			char13(value);
			return;
		}
		if ($char14.equalsIgnoreCase(name)) {
			char14(value);
			return;
		}
		if ($char15.equalsIgnoreCase(name)) {
			char15(value);
			return;
		}
		if ($char16.equalsIgnoreCase(name)) {
			char16(value);
			return;
		}
		if ($char17.equalsIgnoreCase(name)) {
			char17(value);
			return;
		}
		if ($char18.equalsIgnoreCase(name)) {
			char18(value);
			return;
		}
		if ($char19.equalsIgnoreCase(name)) {
			char19(value);
			return;
		}
		if ($char20.equalsIgnoreCase(name)) {
			char20(value);
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
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt1.equalsIgnoreCase(name)) {
			dt1(value);
			return;
		}
		if ($dt2.equalsIgnoreCase(name)) {
			dt2(value);
			return;
		}
		if ($dt3.equalsIgnoreCase(name)) {
			dt3(value);
			return;
		}
		if ($dt4.equalsIgnoreCase(name)) {
			dt4(value);
			return;
		}
		if ($dt5.equalsIgnoreCase(name)) {
			dt5(value);
			return;
		}
		if ($dt6.equalsIgnoreCase(name)) {
			dt6(value);
			return;
		}
		if ($dt7.equalsIgnoreCase(name)) {
			dt7(value);
			return;
		}
		if ($dt8.equalsIgnoreCase(name)) {
			dt8(value);
			return;
		}
		if ($dt9.equalsIgnoreCase(name)) {
			dt9(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($flg4.equalsIgnoreCase(name)) {
			flg4(value);
			return;
		}
		if ($flg5.equalsIgnoreCase(name)) {
			flg5(value);
			return;
		}
		if ($flg6.equalsIgnoreCase(name)) {
			flg6(value);
			return;
		}
		if ($flg7.equalsIgnoreCase(name)) {
			flg7(value);
			return;
		}
		if ($flg8.equalsIgnoreCase(name)) {
			flg8(value);
			return;
		}
		if ($flg9.equalsIgnoreCase(name)) {
			flg9(value);
			return;
		}
		if ($flg10.equalsIgnoreCase(name)) {
			flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
			return;
		}
		if ($char11.equalsIgnoreCase(name)) {
			char11(value);
			return;
		}
		if ($char12.equalsIgnoreCase(name)) {
			char12(value);
			return;
		}
		if ($char13.equalsIgnoreCase(name)) {
			char13(value);
			return;
		}
		if ($char14.equalsIgnoreCase(name)) {
			char14(value);
			return;
		}
		if ($char15.equalsIgnoreCase(name)) {
			char15(value);
			return;
		}
		if ($char16.equalsIgnoreCase(name)) {
			char16(value);
			return;
		}
		if ($char17.equalsIgnoreCase(name)) {
			char17(value);
			return;
		}
		if ($char18.equalsIgnoreCase(name)) {
			char18(value);
			return;
		}
		if ($char19.equalsIgnoreCase(name)) {
			char19(value);
			return;
		}
		if ($char20.equalsIgnoreCase(name)) {
			char20(value);
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
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		if ($num6.equalsIgnoreCase(name)) {
			num6(value);
			return;
		}
		if ($num7.equalsIgnoreCase(name)) {
			num7(value);
			return;
		}
		if ($num8.equalsIgnoreCase(name)) {
			num8(value);
			return;
		}
		if ($num9.equalsIgnoreCase(name)) {
			num9(value);
			return;
		}
		if ($num10.equalsIgnoreCase(name)) {
			num10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt1.equalsIgnoreCase(name)) {
			dt1(value);
			return;
		}
		if ($dt2.equalsIgnoreCase(name)) {
			dt2(value);
			return;
		}
		if ($dt3.equalsIgnoreCase(name)) {
			dt3(value);
			return;
		}
		if ($dt4.equalsIgnoreCase(name)) {
			dt4(value);
			return;
		}
		if ($dt5.equalsIgnoreCase(name)) {
			dt5(value);
			return;
		}
		if ($dt6.equalsIgnoreCase(name)) {
			dt6(value);
			return;
		}
		if ($dt7.equalsIgnoreCase(name)) {
			dt7(value);
			return;
		}
		if ($dt8.equalsIgnoreCase(name)) {
			dt8(value);
			return;
		}
		if ($dt9.equalsIgnoreCase(name)) {
			dt9(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($flg4.equalsIgnoreCase(name)) {
			flg4(value);
			return;
		}
		if ($flg5.equalsIgnoreCase(name)) {
			flg5(value);
			return;
		}
		if ($flg6.equalsIgnoreCase(name)) {
			flg6(value);
			return;
		}
		if ($flg7.equalsIgnoreCase(name)) {
			flg7(value);
			return;
		}
		if ($flg8.equalsIgnoreCase(name)) {
			flg8(value);
			return;
		}
		if ($flg9.equalsIgnoreCase(name)) {
			flg9(value);
			return;
		}
		if ($flg10.equalsIgnoreCase(name)) {
			flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

