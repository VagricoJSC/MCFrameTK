package mcframe.clientMABC.MABCP0810;

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
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public static final String $num_biz_typ_nm = "num_biz_typ_nm";
	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public static final String $max_digit = "max_digit";
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public static final String $num_ptn_nm_lcl = "num_ptn_nm_lcl";
	/**
	 * Standard numbering pattern name 標準発番パタン名.<p>
	 *
	 */
	public static final String $num_ptn_nm = "num_ptn_nm";
	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public static final String $key_dgt = "key_dgt";
	/**
	 * Element type 1 要素区分１.<p>
	 *
	 */
	public static final String $elm_typ1 = "elm_typ1";
	/**
	 * Element type name 1 要素区分名１.<p>
	 *
	 */
	public static final String $elm_typ_nm1 = "elm_typ_nm1";
	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public static final String $elm_dgt1 = "elm_dgt1";
	/**
	 * Fixed value 1 固定値１.<p>
	 *
	 */
	public static final String $fix1 = "fix1";
	/**
	 * Hide 1 非表示１.<p>
	 *
	 */
	public static final String $undisp_flg1 = "undisp_flg1";
	/**
	 * Digit fill character 1 桁埋め文字１.<p>
	 *
	 */
	public static final String $num_pad_str1 = "num_pad_str1";
	/**
	 * Element type 2 要素区分２.<p>
	 *
	 */
	public static final String $elm_typ2 = "elm_typ2";
	/**
	 * Element type name 2 要素区分名２.<p>
	 *
	 */
	public static final String $elm_typ_nm2 = "elm_typ_nm2";
	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public static final String $elm_dgt2 = "elm_dgt2";
	/**
	 * Fixed value 2 固定値２.<p>
	 *
	 */
	public static final String $fix2 = "fix2";
	/**
	 * Hide 2 非表示２.<p>
	 *
	 */
	public static final String $undisp_flg2 = "undisp_flg2";
	/**
	 * Digit fill character 2 桁埋め文字２.<p>
	 *
	 */
	public static final String $num_pad_str2 = "num_pad_str2";
	/**
	 * Element type 3 要素区分３.<p>
	 *
	 */
	public static final String $elm_typ3 = "elm_typ3";
	/**
	 * Element type name 3 要素区分名３.<p>
	 *
	 */
	public static final String $elm_typ_nm3 = "elm_typ_nm3";
	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public static final String $elm_dgt3 = "elm_dgt3";
	/**
	 * Fixed value 3 固定値３.<p>
	 *
	 */
	public static final String $fix3 = "fix3";
	/**
	 * Hide 3 非表示３.<p>
	 *
	 */
	public static final String $undisp_flg3 = "undisp_flg3";
	/**
	 * Digit fill character 3 桁埋め文字３.<p>
	 *
	 */
	public static final String $num_pad_str3 = "num_pad_str3";
	/**
	 * Element type 4 要素区分４.<p>
	 *
	 */
	public static final String $elm_typ4 = "elm_typ4";
	/**
	 * Element type name 4 要素区分名４.<p>
	 *
	 */
	public static final String $elm_typ_nm4 = "elm_typ_nm4";
	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public static final String $elm_dgt4 = "elm_dgt4";
	/**
	 * Fixed value 4 固定値４.<p>
	 *
	 */
	public static final String $fix4 = "fix4";
	/**
	 * Hide 4 非表示４.<p>
	 *
	 */
	public static final String $undisp_flg4 = "undisp_flg4";
	/**
	 * Digit fill character 4 桁埋め文字４.<p>
	 *
	 */
	public static final String $num_pad_str4 = "num_pad_str4";
	/**
	 * Element type 5 要素区分５.<p>
	 *
	 */
	public static final String $elm_typ5 = "elm_typ5";
	/**
	 * Element type name 5 要素区分名５.<p>
	 *
	 */
	public static final String $elm_typ_nm5 = "elm_typ_nm5";
	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public static final String $elm_dgt5 = "elm_dgt5";
	/**
	 * Fixed value 5 固定値５.<p>
	 *
	 */
	public static final String $fix5 = "fix5";
	/**
	 * Hide 5 非表示５.<p>
	 *
	 */
	public static final String $undisp_flg5 = "undisp_flg5";
	/**
	 * Digit fill character 5 桁埋め文字５.<p>
	 *
	 */
	public static final String $num_pad_str5 = "num_pad_str5";
	/**
	 * Element type 6 要素区分６.<p>
	 *
	 */
	public static final String $elm_typ6 = "elm_typ6";
	/**
	 * Element type name 6 要素区分名６.<p>
	 *
	 */
	public static final String $elm_typ_nm6 = "elm_typ_nm6";
	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public static final String $elm_dgt6 = "elm_dgt6";
	/**
	 * Fixed value 6 固定値６.<p>
	 *
	 */
	public static final String $fix6 = "fix6";
	/**
	 * Hide 6 非表示６.<p>
	 *
	 */
	public static final String $undisp_flg6 = "undisp_flg6";
	/**
	 * Digit fill character 6 桁埋め文字６.<p>
	 *
	 */
	public static final String $num_pad_str6 = "num_pad_str6";
	/**
	 * Element type 7 要素区分７.<p>
	 *
	 */
	public static final String $elm_typ7 = "elm_typ7";
	/**
	 * Element type name 7 要素区分名７.<p>
	 *
	 */
	public static final String $elm_typ_nm7 = "elm_typ_nm7";
	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public static final String $elm_dgt7 = "elm_dgt7";
	/**
	 * Fixed value 7 固定値７.<p>
	 *
	 */
	public static final String $fix7 = "fix7";
	/**
	 * Hide 7 非表示７.<p>
	 *
	 */
	public static final String $undisp_flg7 = "undisp_flg7";
	/**
	 * Digit fill character 7 桁埋め文字７.<p>
	 *
	 */
	public static final String $num_pad_str7 = "num_pad_str7";
	/**
	 * Element type 8 要素区分８.<p>
	 *
	 */
	public static final String $elm_typ8 = "elm_typ8";
	/**
	 * Element type name 8 要素区分名８.<p>
	 *
	 */
	public static final String $elm_typ_nm8 = "elm_typ_nm8";
	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public static final String $elm_dgt8 = "elm_dgt8";
	/**
	 * Fixed value 8 固定値８.<p>
	 *
	 */
	public static final String $fix8 = "fix8";
	/**
	 * Hide 8 非表示８.<p>
	 *
	 */
	public static final String $undisp_flg8 = "undisp_flg8";
	/**
	 * Digit fill character 8 桁埋め文字８.<p>
	 *
	 */
	public static final String $num_pad_str8 = "num_pad_str8";
	/**
	 * Element type 9 要素区分９.<p>
	 *
	 */
	public static final String $elm_typ9 = "elm_typ9";
	/**
	 * Element type name 9 要素区分名９.<p>
	 *
	 */
	public static final String $elm_typ_nm9 = "elm_typ_nm9";
	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public static final String $elm_dgt9 = "elm_dgt9";
	/**
	 * Fixed value 9 固定値９.<p>
	 *
	 */
	public static final String $fix9 = "fix9";
	/**
	 * Hide 9 非表示９.<p>
	 *
	 */
	public static final String $undisp_flg9 = "undisp_flg9";
	/**
	 * Digit fill character 9 桁埋め文字９.<p>
	 *
	 */
	public static final String $num_pad_str9 = "num_pad_str9";
	/**
	 * Element type 10 要素区分１０.<p>
	 *
	 */
	public static final String $elm_typ10 = "elm_typ10";
	/**
	 * Element type name 10 要素区分名１０.<p>
	 *
	 */
	public static final String $elm_typ_nm10 = "elm_typ_nm10";
	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public static final String $elm_dgt10 = "elm_dgt10";
	/**
	 * Fixed value 10 固定値１０.<p>
	 *
	 */
	public static final String $fix10 = "fix10";
	/**
	 * Hide 10 非表示１０.<p>
	 *
	 */
	public static final String $undisp_flg10 = "undisp_flg10";
	/**
	 * Digit fill character 10 桁埋め文字１０.<p>
	 *
	 */
	public static final String $num_pad_str10 = "num_pad_str10";
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public static final String $def_seq_typ = "def_seq_typ";
	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public static final String $def_seq_typ_nm = "def_seq_typ_nm";
	/**
	 * Numbering image 発番イメージ.<p>
	 *
	 */
	public static final String $num_img = "num_img";
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


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_biz_typ_nm_META = createCommonMeta($num_biz_typ_nm, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP_NM);
	public static final MCMeta max_digit_META = createCommonMeta($max_digit, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta num_ptn_nm_lcl_META = createCommonMeta($num_ptn_nm_lcl, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta num_ptn_nm_META = createCommonMeta($num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta key_dgt_META = createCommonMeta($key_dgt, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta elm_typ1_META = createCommonMeta($elm_typ1, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm1_META = createCommonMeta($elm_typ_nm1, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt1_META = createCommonMeta($elm_dgt1, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix1_META = createCommonMeta($fix1, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg1_META = createCommonMeta($undisp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str1_META = createCommonMeta($num_pad_str1, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ2_META = createCommonMeta($elm_typ2, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm2_META = createCommonMeta($elm_typ_nm2, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt2_META = createCommonMeta($elm_dgt2, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix2_META = createCommonMeta($fix2, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg2_META = createCommonMeta($undisp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str2_META = createCommonMeta($num_pad_str2, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ3_META = createCommonMeta($elm_typ3, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm3_META = createCommonMeta($elm_typ_nm3, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt3_META = createCommonMeta($elm_dgt3, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix3_META = createCommonMeta($fix3, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg3_META = createCommonMeta($undisp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str3_META = createCommonMeta($num_pad_str3, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ4_META = createCommonMeta($elm_typ4, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm4_META = createCommonMeta($elm_typ_nm4, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt4_META = createCommonMeta($elm_dgt4, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix4_META = createCommonMeta($fix4, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg4_META = createCommonMeta($undisp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str4_META = createCommonMeta($num_pad_str4, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ5_META = createCommonMeta($elm_typ5, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm5_META = createCommonMeta($elm_typ_nm5, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt5_META = createCommonMeta($elm_dgt5, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix5_META = createCommonMeta($fix5, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg5_META = createCommonMeta($undisp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str5_META = createCommonMeta($num_pad_str5, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ6_META = createCommonMeta($elm_typ6, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm6_META = createCommonMeta($elm_typ_nm6, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt6_META = createCommonMeta($elm_dgt6, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix6_META = createCommonMeta($fix6, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg6_META = createCommonMeta($undisp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str6_META = createCommonMeta($num_pad_str6, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ7_META = createCommonMeta($elm_typ7, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm7_META = createCommonMeta($elm_typ_nm7, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt7_META = createCommonMeta($elm_dgt7, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix7_META = createCommonMeta($fix7, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg7_META = createCommonMeta($undisp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str7_META = createCommonMeta($num_pad_str7, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ8_META = createCommonMeta($elm_typ8, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm8_META = createCommonMeta($elm_typ_nm8, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt8_META = createCommonMeta($elm_dgt8, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix8_META = createCommonMeta($fix8, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg8_META = createCommonMeta($undisp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str8_META = createCommonMeta($num_pad_str8, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ9_META = createCommonMeta($elm_typ9, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm9_META = createCommonMeta($elm_typ_nm9, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt9_META = createCommonMeta($elm_dgt9, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix9_META = createCommonMeta($fix9, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg9_META = createCommonMeta($undisp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str9_META = createCommonMeta($num_pad_str9, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta elm_typ10_META = createCommonMeta($elm_typ10, mcframe.commonMA.meta.MA_META.ELM_TYP);
	public static final MCMeta elm_typ_nm10_META = createCommonMeta($elm_typ_nm10, mcframe.commonMA.meta.MA_META.ELM_TYP_NM);
	public static final MCMeta elm_dgt10_META = createCommonMeta($elm_dgt10, mcframe.commonMA.meta.MA_META.NUM_ELM_D);
	public static final MCMeta fix10_META = createCommonMeta($fix10, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta undisp_flg10_META = createCommonMeta($undisp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_pad_str10_META = createCommonMeta($num_pad_str10, mcframe.commonMA.meta.MA_META.NUM_PAD_STR);
	public static final MCMeta def_seq_typ_META = createCommonMeta($def_seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta def_seq_typ_nm_META = createCommonMeta($def_seq_typ_nm, mcframe.commonMA.meta.MA_META.SEQ_TYP_NM);
	public static final MCMeta num_img_META = createStringMeta($num_img);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
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

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			num_biz_typ_META,
			num_biz_typ_nm_META,
			max_digit_META,
			num_ptn_cd_META,
			num_ptn_nm_lcl_META,
			num_ptn_nm_META,
			key_dgt_META,
			elm_typ1_META,
			elm_typ_nm1_META,
			elm_dgt1_META,
			fix1_META,
			undisp_flg1_META,
			num_pad_str1_META,
			elm_typ2_META,
			elm_typ_nm2_META,
			elm_dgt2_META,
			fix2_META,
			undisp_flg2_META,
			num_pad_str2_META,
			elm_typ3_META,
			elm_typ_nm3_META,
			elm_dgt3_META,
			fix3_META,
			undisp_flg3_META,
			num_pad_str3_META,
			elm_typ4_META,
			elm_typ_nm4_META,
			elm_dgt4_META,
			fix4_META,
			undisp_flg4_META,
			num_pad_str4_META,
			elm_typ5_META,
			elm_typ_nm5_META,
			elm_dgt5_META,
			fix5_META,
			undisp_flg5_META,
			num_pad_str5_META,
			elm_typ6_META,
			elm_typ_nm6_META,
			elm_dgt6_META,
			fix6_META,
			undisp_flg6_META,
			num_pad_str6_META,
			elm_typ7_META,
			elm_typ_nm7_META,
			elm_dgt7_META,
			fix7_META,
			undisp_flg7_META,
			num_pad_str7_META,
			elm_typ8_META,
			elm_typ_nm8_META,
			elm_dgt8_META,
			fix8_META,
			undisp_flg8_META,
			num_pad_str8_META,
			elm_typ9_META,
			elm_typ_nm9_META,
			elm_dgt9_META,
			fix9_META,
			undisp_flg9_META,
			num_pad_str9_META,
			elm_typ10_META,
			elm_typ_nm10_META,
			elm_dgt10_META,
			fix10_META,
			undisp_flg10_META,
			num_pad_str10_META,
			def_seq_typ_META,
			def_seq_typ_nm_META,
			num_img_META,
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
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$num_biz_typ,	// num_biz_typ
			$num_ptn_cd	// num_ptn_cd
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
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 2, $num_biz_typ);
	}

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 2, $num_biz_typ, value);
	}


	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public String num_biz_typ_nm() {
		return getConstString(offset + 3, $num_biz_typ_nm);
	}

	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public void num_biz_typ_nm(String value) {
		setConstString(offset + 3, $num_biz_typ_nm, value);
	}


	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public MCNumber max_digit() {
		return getConstNumber(offset + 4, $max_digit);
	}

	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public void max_digit(MCNumber value) {
		setConstNumber(offset + 4, $max_digit, value);
	}

	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public void max_digit(int value) {
		setConstNumber(offset + 4, $max_digit, value);
	}

	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public void max_digit(long value) {
		setConstNumber(offset + 4, $max_digit, value);
	}

	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public void max_digit(float value) {
		setConstNumber(offset + 4, $max_digit, value);
	}

	/**
	 * Max. number of digits 最大桁数.<p>
	 *
	 */
	public void max_digit(double value) {
		setConstNumber(offset + 4, $max_digit, value);
	}


	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 5, $num_ptn_cd);
	}

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 5, $num_ptn_cd, value);
	}


	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public String num_ptn_nm_lcl() {
		return getConstString(offset + 6, $num_ptn_nm_lcl);
	}

	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public void num_ptn_nm_lcl(String value) {
		setConstString(offset + 6, $num_ptn_nm_lcl, value);
	}


	/**
	 * Standard numbering pattern name 標準発番パタン名.<p>
	 *
	 */
	public String num_ptn_nm() {
		return getConstString(offset + 7, $num_ptn_nm);
	}

	/**
	 * Standard numbering pattern name 標準発番パタン名.<p>
	 *
	 */
	public void num_ptn_nm(String value) {
		setConstString(offset + 7, $num_ptn_nm, value);
	}


	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public MCNumber key_dgt() {
		return getConstNumber(offset + 8, $key_dgt);
	}

	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public void key_dgt(MCNumber value) {
		setConstNumber(offset + 8, $key_dgt, value);
	}

	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public void key_dgt(int value) {
		setConstNumber(offset + 8, $key_dgt, value);
	}

	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public void key_dgt(long value) {
		setConstNumber(offset + 8, $key_dgt, value);
	}

	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public void key_dgt(float value) {
		setConstNumber(offset + 8, $key_dgt, value);
	}

	/**
	 * Key column number キー項目桁数.<p>
	 *
	 */
	public void key_dgt(double value) {
		setConstNumber(offset + 8, $key_dgt, value);
	}


	/**
	 * Element type 1 要素区分１.<p>
	 *
	 */
	public String elm_typ1() {
		return getConstString(offset + 9, $elm_typ1);
	}

	/**
	 * Element type 1 要素区分１.<p>
	 *
	 */
	public void elm_typ1(String value) {
		setConstString(offset + 9, $elm_typ1, value);
	}


	/**
	 * Element type name 1 要素区分名１.<p>
	 *
	 */
	public String elm_typ_nm1() {
		return getConstString(offset + 10, $elm_typ_nm1);
	}

	/**
	 * Element type name 1 要素区分名１.<p>
	 *
	 */
	public void elm_typ_nm1(String value) {
		setConstString(offset + 10, $elm_typ_nm1, value);
	}


	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public MCNumber elm_dgt1() {
		return getConstNumber(offset + 11, $elm_dgt1);
	}

	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public void elm_dgt1(MCNumber value) {
		setConstNumber(offset + 11, $elm_dgt1, value);
	}

	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public void elm_dgt1(int value) {
		setConstNumber(offset + 11, $elm_dgt1, value);
	}

	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public void elm_dgt1(long value) {
		setConstNumber(offset + 11, $elm_dgt1, value);
	}

	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public void elm_dgt1(float value) {
		setConstNumber(offset + 11, $elm_dgt1, value);
	}

	/**
	 * Element 1 digit 要素１桁数.<p>
	 *
	 */
	public void elm_dgt1(double value) {
		setConstNumber(offset + 11, $elm_dgt1, value);
	}


	/**
	 * Fixed value 1 固定値１.<p>
	 *
	 */
	public String fix1() {
		return getConstString(offset + 12, $fix1);
	}

	/**
	 * Fixed value 1 固定値１.<p>
	 *
	 */
	public void fix1(String value) {
		setConstString(offset + 12, $fix1, value);
	}


	/**
	 * Hide 1 非表示１.<p>
	 *
	 */
	public boolean undisp_flg1() {
		return getConstBoolean(offset + 13, $undisp_flg1);
	}

	/**
	 * Hide 1 非表示１.<p>
	 *
	 */
	public void undisp_flg1(boolean value) {
		setConstBoolean(offset + 13, $undisp_flg1, value);
	}


	/**
	 * Digit fill character 1 桁埋め文字１.<p>
	 *
	 */
	public String num_pad_str1() {
		return getConstString(offset + 14, $num_pad_str1);
	}

	/**
	 * Digit fill character 1 桁埋め文字１.<p>
	 *
	 */
	public void num_pad_str1(String value) {
		setConstString(offset + 14, $num_pad_str1, value);
	}


	/**
	 * Element type 2 要素区分２.<p>
	 *
	 */
	public String elm_typ2() {
		return getConstString(offset + 15, $elm_typ2);
	}

	/**
	 * Element type 2 要素区分２.<p>
	 *
	 */
	public void elm_typ2(String value) {
		setConstString(offset + 15, $elm_typ2, value);
	}


	/**
	 * Element type name 2 要素区分名２.<p>
	 *
	 */
	public String elm_typ_nm2() {
		return getConstString(offset + 16, $elm_typ_nm2);
	}

	/**
	 * Element type name 2 要素区分名２.<p>
	 *
	 */
	public void elm_typ_nm2(String value) {
		setConstString(offset + 16, $elm_typ_nm2, value);
	}


	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public MCNumber elm_dgt2() {
		return getConstNumber(offset + 17, $elm_dgt2);
	}

	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public void elm_dgt2(MCNumber value) {
		setConstNumber(offset + 17, $elm_dgt2, value);
	}

	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public void elm_dgt2(int value) {
		setConstNumber(offset + 17, $elm_dgt2, value);
	}

	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public void elm_dgt2(long value) {
		setConstNumber(offset + 17, $elm_dgt2, value);
	}

	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public void elm_dgt2(float value) {
		setConstNumber(offset + 17, $elm_dgt2, value);
	}

	/**
	 * Element 2 digit 要素２桁数.<p>
	 *
	 */
	public void elm_dgt2(double value) {
		setConstNumber(offset + 17, $elm_dgt2, value);
	}


	/**
	 * Fixed value 2 固定値２.<p>
	 *
	 */
	public String fix2() {
		return getConstString(offset + 18, $fix2);
	}

	/**
	 * Fixed value 2 固定値２.<p>
	 *
	 */
	public void fix2(String value) {
		setConstString(offset + 18, $fix2, value);
	}


	/**
	 * Hide 2 非表示２.<p>
	 *
	 */
	public boolean undisp_flg2() {
		return getConstBoolean(offset + 19, $undisp_flg2);
	}

	/**
	 * Hide 2 非表示２.<p>
	 *
	 */
	public void undisp_flg2(boolean value) {
		setConstBoolean(offset + 19, $undisp_flg2, value);
	}


	/**
	 * Digit fill character 2 桁埋め文字２.<p>
	 *
	 */
	public String num_pad_str2() {
		return getConstString(offset + 20, $num_pad_str2);
	}

	/**
	 * Digit fill character 2 桁埋め文字２.<p>
	 *
	 */
	public void num_pad_str2(String value) {
		setConstString(offset + 20, $num_pad_str2, value);
	}


	/**
	 * Element type 3 要素区分３.<p>
	 *
	 */
	public String elm_typ3() {
		return getConstString(offset + 21, $elm_typ3);
	}

	/**
	 * Element type 3 要素区分３.<p>
	 *
	 */
	public void elm_typ3(String value) {
		setConstString(offset + 21, $elm_typ3, value);
	}


	/**
	 * Element type name 3 要素区分名３.<p>
	 *
	 */
	public String elm_typ_nm3() {
		return getConstString(offset + 22, $elm_typ_nm3);
	}

	/**
	 * Element type name 3 要素区分名３.<p>
	 *
	 */
	public void elm_typ_nm3(String value) {
		setConstString(offset + 22, $elm_typ_nm3, value);
	}


	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public MCNumber elm_dgt3() {
		return getConstNumber(offset + 23, $elm_dgt3);
	}

	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public void elm_dgt3(MCNumber value) {
		setConstNumber(offset + 23, $elm_dgt3, value);
	}

	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public void elm_dgt3(int value) {
		setConstNumber(offset + 23, $elm_dgt3, value);
	}

	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public void elm_dgt3(long value) {
		setConstNumber(offset + 23, $elm_dgt3, value);
	}

	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public void elm_dgt3(float value) {
		setConstNumber(offset + 23, $elm_dgt3, value);
	}

	/**
	 * Element 3 digit 要素３桁数.<p>
	 *
	 */
	public void elm_dgt3(double value) {
		setConstNumber(offset + 23, $elm_dgt3, value);
	}


	/**
	 * Fixed value 3 固定値３.<p>
	 *
	 */
	public String fix3() {
		return getConstString(offset + 24, $fix3);
	}

	/**
	 * Fixed value 3 固定値３.<p>
	 *
	 */
	public void fix3(String value) {
		setConstString(offset + 24, $fix3, value);
	}


	/**
	 * Hide 3 非表示３.<p>
	 *
	 */
	public boolean undisp_flg3() {
		return getConstBoolean(offset + 25, $undisp_flg3);
	}

	/**
	 * Hide 3 非表示３.<p>
	 *
	 */
	public void undisp_flg3(boolean value) {
		setConstBoolean(offset + 25, $undisp_flg3, value);
	}


	/**
	 * Digit fill character 3 桁埋め文字３.<p>
	 *
	 */
	public String num_pad_str3() {
		return getConstString(offset + 26, $num_pad_str3);
	}

	/**
	 * Digit fill character 3 桁埋め文字３.<p>
	 *
	 */
	public void num_pad_str3(String value) {
		setConstString(offset + 26, $num_pad_str3, value);
	}


	/**
	 * Element type 4 要素区分４.<p>
	 *
	 */
	public String elm_typ4() {
		return getConstString(offset + 27, $elm_typ4);
	}

	/**
	 * Element type 4 要素区分４.<p>
	 *
	 */
	public void elm_typ4(String value) {
		setConstString(offset + 27, $elm_typ4, value);
	}


	/**
	 * Element type name 4 要素区分名４.<p>
	 *
	 */
	public String elm_typ_nm4() {
		return getConstString(offset + 28, $elm_typ_nm4);
	}

	/**
	 * Element type name 4 要素区分名４.<p>
	 *
	 */
	public void elm_typ_nm4(String value) {
		setConstString(offset + 28, $elm_typ_nm4, value);
	}


	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public MCNumber elm_dgt4() {
		return getConstNumber(offset + 29, $elm_dgt4);
	}

	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public void elm_dgt4(MCNumber value) {
		setConstNumber(offset + 29, $elm_dgt4, value);
	}

	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public void elm_dgt4(int value) {
		setConstNumber(offset + 29, $elm_dgt4, value);
	}

	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public void elm_dgt4(long value) {
		setConstNumber(offset + 29, $elm_dgt4, value);
	}

	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public void elm_dgt4(float value) {
		setConstNumber(offset + 29, $elm_dgt4, value);
	}

	/**
	 * Element 4 digit 要素４桁数.<p>
	 *
	 */
	public void elm_dgt4(double value) {
		setConstNumber(offset + 29, $elm_dgt4, value);
	}


	/**
	 * Fixed value 4 固定値４.<p>
	 *
	 */
	public String fix4() {
		return getConstString(offset + 30, $fix4);
	}

	/**
	 * Fixed value 4 固定値４.<p>
	 *
	 */
	public void fix4(String value) {
		setConstString(offset + 30, $fix4, value);
	}


	/**
	 * Hide 4 非表示４.<p>
	 *
	 */
	public boolean undisp_flg4() {
		return getConstBoolean(offset + 31, $undisp_flg4);
	}

	/**
	 * Hide 4 非表示４.<p>
	 *
	 */
	public void undisp_flg4(boolean value) {
		setConstBoolean(offset + 31, $undisp_flg4, value);
	}


	/**
	 * Digit fill character 4 桁埋め文字４.<p>
	 *
	 */
	public String num_pad_str4() {
		return getConstString(offset + 32, $num_pad_str4);
	}

	/**
	 * Digit fill character 4 桁埋め文字４.<p>
	 *
	 */
	public void num_pad_str4(String value) {
		setConstString(offset + 32, $num_pad_str4, value);
	}


	/**
	 * Element type 5 要素区分５.<p>
	 *
	 */
	public String elm_typ5() {
		return getConstString(offset + 33, $elm_typ5);
	}

	/**
	 * Element type 5 要素区分５.<p>
	 *
	 */
	public void elm_typ5(String value) {
		setConstString(offset + 33, $elm_typ5, value);
	}


	/**
	 * Element type name 5 要素区分名５.<p>
	 *
	 */
	public String elm_typ_nm5() {
		return getConstString(offset + 34, $elm_typ_nm5);
	}

	/**
	 * Element type name 5 要素区分名５.<p>
	 *
	 */
	public void elm_typ_nm5(String value) {
		setConstString(offset + 34, $elm_typ_nm5, value);
	}


	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public MCNumber elm_dgt5() {
		return getConstNumber(offset + 35, $elm_dgt5);
	}

	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public void elm_dgt5(MCNumber value) {
		setConstNumber(offset + 35, $elm_dgt5, value);
	}

	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public void elm_dgt5(int value) {
		setConstNumber(offset + 35, $elm_dgt5, value);
	}

	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public void elm_dgt5(long value) {
		setConstNumber(offset + 35, $elm_dgt5, value);
	}

	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public void elm_dgt5(float value) {
		setConstNumber(offset + 35, $elm_dgt5, value);
	}

	/**
	 * Element 5 digit 要素５桁数.<p>
	 *
	 */
	public void elm_dgt5(double value) {
		setConstNumber(offset + 35, $elm_dgt5, value);
	}


	/**
	 * Fixed value 5 固定値５.<p>
	 *
	 */
	public String fix5() {
		return getConstString(offset + 36, $fix5);
	}

	/**
	 * Fixed value 5 固定値５.<p>
	 *
	 */
	public void fix5(String value) {
		setConstString(offset + 36, $fix5, value);
	}


	/**
	 * Hide 5 非表示５.<p>
	 *
	 */
	public boolean undisp_flg5() {
		return getConstBoolean(offset + 37, $undisp_flg5);
	}

	/**
	 * Hide 5 非表示５.<p>
	 *
	 */
	public void undisp_flg5(boolean value) {
		setConstBoolean(offset + 37, $undisp_flg5, value);
	}


	/**
	 * Digit fill character 5 桁埋め文字５.<p>
	 *
	 */
	public String num_pad_str5() {
		return getConstString(offset + 38, $num_pad_str5);
	}

	/**
	 * Digit fill character 5 桁埋め文字５.<p>
	 *
	 */
	public void num_pad_str5(String value) {
		setConstString(offset + 38, $num_pad_str5, value);
	}


	/**
	 * Element type 6 要素区分６.<p>
	 *
	 */
	public String elm_typ6() {
		return getConstString(offset + 39, $elm_typ6);
	}

	/**
	 * Element type 6 要素区分６.<p>
	 *
	 */
	public void elm_typ6(String value) {
		setConstString(offset + 39, $elm_typ6, value);
	}


	/**
	 * Element type name 6 要素区分名６.<p>
	 *
	 */
	public String elm_typ_nm6() {
		return getConstString(offset + 40, $elm_typ_nm6);
	}

	/**
	 * Element type name 6 要素区分名６.<p>
	 *
	 */
	public void elm_typ_nm6(String value) {
		setConstString(offset + 40, $elm_typ_nm6, value);
	}


	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public MCNumber elm_dgt6() {
		return getConstNumber(offset + 41, $elm_dgt6);
	}

	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public void elm_dgt6(MCNumber value) {
		setConstNumber(offset + 41, $elm_dgt6, value);
	}

	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public void elm_dgt6(int value) {
		setConstNumber(offset + 41, $elm_dgt6, value);
	}

	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public void elm_dgt6(long value) {
		setConstNumber(offset + 41, $elm_dgt6, value);
	}

	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public void elm_dgt6(float value) {
		setConstNumber(offset + 41, $elm_dgt6, value);
	}

	/**
	 * Element 6 digit 要素６桁数.<p>
	 *
	 */
	public void elm_dgt6(double value) {
		setConstNumber(offset + 41, $elm_dgt6, value);
	}


	/**
	 * Fixed value 6 固定値６.<p>
	 *
	 */
	public String fix6() {
		return getConstString(offset + 42, $fix6);
	}

	/**
	 * Fixed value 6 固定値６.<p>
	 *
	 */
	public void fix6(String value) {
		setConstString(offset + 42, $fix6, value);
	}


	/**
	 * Hide 6 非表示６.<p>
	 *
	 */
	public boolean undisp_flg6() {
		return getConstBoolean(offset + 43, $undisp_flg6);
	}

	/**
	 * Hide 6 非表示６.<p>
	 *
	 */
	public void undisp_flg6(boolean value) {
		setConstBoolean(offset + 43, $undisp_flg6, value);
	}


	/**
	 * Digit fill character 6 桁埋め文字６.<p>
	 *
	 */
	public String num_pad_str6() {
		return getConstString(offset + 44, $num_pad_str6);
	}

	/**
	 * Digit fill character 6 桁埋め文字６.<p>
	 *
	 */
	public void num_pad_str6(String value) {
		setConstString(offset + 44, $num_pad_str6, value);
	}


	/**
	 * Element type 7 要素区分７.<p>
	 *
	 */
	public String elm_typ7() {
		return getConstString(offset + 45, $elm_typ7);
	}

	/**
	 * Element type 7 要素区分７.<p>
	 *
	 */
	public void elm_typ7(String value) {
		setConstString(offset + 45, $elm_typ7, value);
	}


	/**
	 * Element type name 7 要素区分名７.<p>
	 *
	 */
	public String elm_typ_nm7() {
		return getConstString(offset + 46, $elm_typ_nm7);
	}

	/**
	 * Element type name 7 要素区分名７.<p>
	 *
	 */
	public void elm_typ_nm7(String value) {
		setConstString(offset + 46, $elm_typ_nm7, value);
	}


	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public MCNumber elm_dgt7() {
		return getConstNumber(offset + 47, $elm_dgt7);
	}

	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public void elm_dgt7(MCNumber value) {
		setConstNumber(offset + 47, $elm_dgt7, value);
	}

	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public void elm_dgt7(int value) {
		setConstNumber(offset + 47, $elm_dgt7, value);
	}

	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public void elm_dgt7(long value) {
		setConstNumber(offset + 47, $elm_dgt7, value);
	}

	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public void elm_dgt7(float value) {
		setConstNumber(offset + 47, $elm_dgt7, value);
	}

	/**
	 * Element 7 digit 要素７桁数.<p>
	 *
	 */
	public void elm_dgt7(double value) {
		setConstNumber(offset + 47, $elm_dgt7, value);
	}


	/**
	 * Fixed value 7 固定値７.<p>
	 *
	 */
	public String fix7() {
		return getConstString(offset + 48, $fix7);
	}

	/**
	 * Fixed value 7 固定値７.<p>
	 *
	 */
	public void fix7(String value) {
		setConstString(offset + 48, $fix7, value);
	}


	/**
	 * Hide 7 非表示７.<p>
	 *
	 */
	public boolean undisp_flg7() {
		return getConstBoolean(offset + 49, $undisp_flg7);
	}

	/**
	 * Hide 7 非表示７.<p>
	 *
	 */
	public void undisp_flg7(boolean value) {
		setConstBoolean(offset + 49, $undisp_flg7, value);
	}


	/**
	 * Digit fill character 7 桁埋め文字７.<p>
	 *
	 */
	public String num_pad_str7() {
		return getConstString(offset + 50, $num_pad_str7);
	}

	/**
	 * Digit fill character 7 桁埋め文字７.<p>
	 *
	 */
	public void num_pad_str7(String value) {
		setConstString(offset + 50, $num_pad_str7, value);
	}


	/**
	 * Element type 8 要素区分８.<p>
	 *
	 */
	public String elm_typ8() {
		return getConstString(offset + 51, $elm_typ8);
	}

	/**
	 * Element type 8 要素区分８.<p>
	 *
	 */
	public void elm_typ8(String value) {
		setConstString(offset + 51, $elm_typ8, value);
	}


	/**
	 * Element type name 8 要素区分名８.<p>
	 *
	 */
	public String elm_typ_nm8() {
		return getConstString(offset + 52, $elm_typ_nm8);
	}

	/**
	 * Element type name 8 要素区分名８.<p>
	 *
	 */
	public void elm_typ_nm8(String value) {
		setConstString(offset + 52, $elm_typ_nm8, value);
	}


	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public MCNumber elm_dgt8() {
		return getConstNumber(offset + 53, $elm_dgt8);
	}

	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public void elm_dgt8(MCNumber value) {
		setConstNumber(offset + 53, $elm_dgt8, value);
	}

	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public void elm_dgt8(int value) {
		setConstNumber(offset + 53, $elm_dgt8, value);
	}

	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public void elm_dgt8(long value) {
		setConstNumber(offset + 53, $elm_dgt8, value);
	}

	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public void elm_dgt8(float value) {
		setConstNumber(offset + 53, $elm_dgt8, value);
	}

	/**
	 * Element 8 digit 要素８桁数.<p>
	 *
	 */
	public void elm_dgt8(double value) {
		setConstNumber(offset + 53, $elm_dgt8, value);
	}


	/**
	 * Fixed value 8 固定値８.<p>
	 *
	 */
	public String fix8() {
		return getConstString(offset + 54, $fix8);
	}

	/**
	 * Fixed value 8 固定値８.<p>
	 *
	 */
	public void fix8(String value) {
		setConstString(offset + 54, $fix8, value);
	}


	/**
	 * Hide 8 非表示８.<p>
	 *
	 */
	public boolean undisp_flg8() {
		return getConstBoolean(offset + 55, $undisp_flg8);
	}

	/**
	 * Hide 8 非表示８.<p>
	 *
	 */
	public void undisp_flg8(boolean value) {
		setConstBoolean(offset + 55, $undisp_flg8, value);
	}


	/**
	 * Digit fill character 8 桁埋め文字８.<p>
	 *
	 */
	public String num_pad_str8() {
		return getConstString(offset + 56, $num_pad_str8);
	}

	/**
	 * Digit fill character 8 桁埋め文字８.<p>
	 *
	 */
	public void num_pad_str8(String value) {
		setConstString(offset + 56, $num_pad_str8, value);
	}


	/**
	 * Element type 9 要素区分９.<p>
	 *
	 */
	public String elm_typ9() {
		return getConstString(offset + 57, $elm_typ9);
	}

	/**
	 * Element type 9 要素区分９.<p>
	 *
	 */
	public void elm_typ9(String value) {
		setConstString(offset + 57, $elm_typ9, value);
	}


	/**
	 * Element type name 9 要素区分名９.<p>
	 *
	 */
	public String elm_typ_nm9() {
		return getConstString(offset + 58, $elm_typ_nm9);
	}

	/**
	 * Element type name 9 要素区分名９.<p>
	 *
	 */
	public void elm_typ_nm9(String value) {
		setConstString(offset + 58, $elm_typ_nm9, value);
	}


	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public MCNumber elm_dgt9() {
		return getConstNumber(offset + 59, $elm_dgt9);
	}

	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public void elm_dgt9(MCNumber value) {
		setConstNumber(offset + 59, $elm_dgt9, value);
	}

	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public void elm_dgt9(int value) {
		setConstNumber(offset + 59, $elm_dgt9, value);
	}

	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public void elm_dgt9(long value) {
		setConstNumber(offset + 59, $elm_dgt9, value);
	}

	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public void elm_dgt9(float value) {
		setConstNumber(offset + 59, $elm_dgt9, value);
	}

	/**
	 * Element 9 digit 要素９桁数.<p>
	 *
	 */
	public void elm_dgt9(double value) {
		setConstNumber(offset + 59, $elm_dgt9, value);
	}


	/**
	 * Fixed value 9 固定値９.<p>
	 *
	 */
	public String fix9() {
		return getConstString(offset + 60, $fix9);
	}

	/**
	 * Fixed value 9 固定値９.<p>
	 *
	 */
	public void fix9(String value) {
		setConstString(offset + 60, $fix9, value);
	}


	/**
	 * Hide 9 非表示９.<p>
	 *
	 */
	public boolean undisp_flg9() {
		return getConstBoolean(offset + 61, $undisp_flg9);
	}

	/**
	 * Hide 9 非表示９.<p>
	 *
	 */
	public void undisp_flg9(boolean value) {
		setConstBoolean(offset + 61, $undisp_flg9, value);
	}


	/**
	 * Digit fill character 9 桁埋め文字９.<p>
	 *
	 */
	public String num_pad_str9() {
		return getConstString(offset + 62, $num_pad_str9);
	}

	/**
	 * Digit fill character 9 桁埋め文字９.<p>
	 *
	 */
	public void num_pad_str9(String value) {
		setConstString(offset + 62, $num_pad_str9, value);
	}


	/**
	 * Element type 10 要素区分１０.<p>
	 *
	 */
	public String elm_typ10() {
		return getConstString(offset + 63, $elm_typ10);
	}

	/**
	 * Element type 10 要素区分１０.<p>
	 *
	 */
	public void elm_typ10(String value) {
		setConstString(offset + 63, $elm_typ10, value);
	}


	/**
	 * Element type name 10 要素区分名１０.<p>
	 *
	 */
	public String elm_typ_nm10() {
		return getConstString(offset + 64, $elm_typ_nm10);
	}

	/**
	 * Element type name 10 要素区分名１０.<p>
	 *
	 */
	public void elm_typ_nm10(String value) {
		setConstString(offset + 64, $elm_typ_nm10, value);
	}


	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public MCNumber elm_dgt10() {
		return getConstNumber(offset + 65, $elm_dgt10);
	}

	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public void elm_dgt10(MCNumber value) {
		setConstNumber(offset + 65, $elm_dgt10, value);
	}

	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public void elm_dgt10(int value) {
		setConstNumber(offset + 65, $elm_dgt10, value);
	}

	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public void elm_dgt10(long value) {
		setConstNumber(offset + 65, $elm_dgt10, value);
	}

	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public void elm_dgt10(float value) {
		setConstNumber(offset + 65, $elm_dgt10, value);
	}

	/**
	 * Element 10 digit 要素１０桁数.<p>
	 *
	 */
	public void elm_dgt10(double value) {
		setConstNumber(offset + 65, $elm_dgt10, value);
	}


	/**
	 * Fixed value 10 固定値１０.<p>
	 *
	 */
	public String fix10() {
		return getConstString(offset + 66, $fix10);
	}

	/**
	 * Fixed value 10 固定値１０.<p>
	 *
	 */
	public void fix10(String value) {
		setConstString(offset + 66, $fix10, value);
	}


	/**
	 * Hide 10 非表示１０.<p>
	 *
	 */
	public boolean undisp_flg10() {
		return getConstBoolean(offset + 67, $undisp_flg10);
	}

	/**
	 * Hide 10 非表示１０.<p>
	 *
	 */
	public void undisp_flg10(boolean value) {
		setConstBoolean(offset + 67, $undisp_flg10, value);
	}


	/**
	 * Digit fill character 10 桁埋め文字１０.<p>
	 *
	 */
	public String num_pad_str10() {
		return getConstString(offset + 68, $num_pad_str10);
	}

	/**
	 * Digit fill character 10 桁埋め文字１０.<p>
	 *
	 */
	public void num_pad_str10(String value) {
		setConstString(offset + 68, $num_pad_str10, value);
	}


	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public String def_seq_typ() {
		return getConstString(offset + 69, $def_seq_typ);
	}

	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public void def_seq_typ(String value) {
		setConstString(offset + 69, $def_seq_typ, value);
	}


	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public String def_seq_typ_nm() {
		return getConstString(offset + 70, $def_seq_typ_nm);
	}

	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public void def_seq_typ_nm(String value) {
		setConstString(offset + 70, $def_seq_typ_nm, value);
	}


	/**
	 * Numbering image 発番イメージ.<p>
	 *
	 */
	public String num_img() {
		return getConstString(offset + 71, $num_img);
	}

	/**
	 * Numbering image 発番イメージ.<p>
	 *
	 */
	public void num_img(String value) {
		setConstString(offset + 71, $num_img, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 72, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 72, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 73, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 73, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 74, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 74, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 75, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 75, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 76, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 76, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 77, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 77, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 78, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 78, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 79, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 79, $ins_func_nm, value);
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


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 81, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 81, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 82, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 82, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 83, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 83, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 84, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 84, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 85, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 85, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 86, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 86, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 87, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 87, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 88, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 88, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 89, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 89, $del_ts, value);
	}


	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			return num_biz_typ_nm();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm_lcl.equalsIgnoreCase(name)) {
			return num_ptn_nm_lcl();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			return elm_typ1();
		}
		if ($elm_typ_nm1.equalsIgnoreCase(name)) {
			return elm_typ_nm1();
		}
		if ($fix1.equalsIgnoreCase(name)) {
			return fix1();
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			return num_pad_str1();
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			return elm_typ2();
		}
		if ($elm_typ_nm2.equalsIgnoreCase(name)) {
			return elm_typ_nm2();
		}
		if ($fix2.equalsIgnoreCase(name)) {
			return fix2();
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			return num_pad_str2();
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			return elm_typ3();
		}
		if ($elm_typ_nm3.equalsIgnoreCase(name)) {
			return elm_typ_nm3();
		}
		if ($fix3.equalsIgnoreCase(name)) {
			return fix3();
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			return num_pad_str3();
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			return elm_typ4();
		}
		if ($elm_typ_nm4.equalsIgnoreCase(name)) {
			return elm_typ_nm4();
		}
		if ($fix4.equalsIgnoreCase(name)) {
			return fix4();
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			return num_pad_str4();
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			return elm_typ5();
		}
		if ($elm_typ_nm5.equalsIgnoreCase(name)) {
			return elm_typ_nm5();
		}
		if ($fix5.equalsIgnoreCase(name)) {
			return fix5();
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			return num_pad_str5();
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			return elm_typ6();
		}
		if ($elm_typ_nm6.equalsIgnoreCase(name)) {
			return elm_typ_nm6();
		}
		if ($fix6.equalsIgnoreCase(name)) {
			return fix6();
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			return num_pad_str6();
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			return elm_typ7();
		}
		if ($elm_typ_nm7.equalsIgnoreCase(name)) {
			return elm_typ_nm7();
		}
		if ($fix7.equalsIgnoreCase(name)) {
			return fix7();
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			return num_pad_str7();
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			return elm_typ8();
		}
		if ($elm_typ_nm8.equalsIgnoreCase(name)) {
			return elm_typ_nm8();
		}
		if ($fix8.equalsIgnoreCase(name)) {
			return fix8();
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			return num_pad_str8();
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			return elm_typ9();
		}
		if ($elm_typ_nm9.equalsIgnoreCase(name)) {
			return elm_typ_nm9();
		}
		if ($fix9.equalsIgnoreCase(name)) {
			return fix9();
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			return num_pad_str9();
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			return elm_typ10();
		}
		if ($elm_typ_nm10.equalsIgnoreCase(name)) {
			return elm_typ_nm10();
		}
		if ($fix10.equalsIgnoreCase(name)) {
			return fix10();
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			return num_pad_str10();
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			return def_seq_typ();
		}
		if ($def_seq_typ_nm.equalsIgnoreCase(name)) {
			return def_seq_typ_nm();
		}
		if ($num_img.equalsIgnoreCase(name)) {
			return num_img();
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
		if ($max_digit.equalsIgnoreCase(name)) {
			return max_digit();
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			return key_dgt();
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			return elm_dgt1();
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			return elm_dgt2();
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			return elm_dgt3();
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			return elm_dgt4();
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			return elm_dgt5();
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			return elm_dgt6();
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			return elm_dgt7();
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			return elm_dgt8();
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			return elm_dgt9();
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			return elm_dgt10();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			return undisp_flg1();
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			return undisp_flg2();
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			return undisp_flg3();
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			return undisp_flg4();
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			return undisp_flg5();
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			return undisp_flg6();
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			return undisp_flg7();
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			return undisp_flg8();
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			return undisp_flg9();
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			return undisp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			return num_biz_typ_nm();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm_lcl.equalsIgnoreCase(name)) {
			return num_ptn_nm_lcl();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			return elm_typ1();
		}
		if ($elm_typ_nm1.equalsIgnoreCase(name)) {
			return elm_typ_nm1();
		}
		if ($fix1.equalsIgnoreCase(name)) {
			return fix1();
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			return num_pad_str1();
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			return elm_typ2();
		}
		if ($elm_typ_nm2.equalsIgnoreCase(name)) {
			return elm_typ_nm2();
		}
		if ($fix2.equalsIgnoreCase(name)) {
			return fix2();
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			return num_pad_str2();
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			return elm_typ3();
		}
		if ($elm_typ_nm3.equalsIgnoreCase(name)) {
			return elm_typ_nm3();
		}
		if ($fix3.equalsIgnoreCase(name)) {
			return fix3();
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			return num_pad_str3();
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			return elm_typ4();
		}
		if ($elm_typ_nm4.equalsIgnoreCase(name)) {
			return elm_typ_nm4();
		}
		if ($fix4.equalsIgnoreCase(name)) {
			return fix4();
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			return num_pad_str4();
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			return elm_typ5();
		}
		if ($elm_typ_nm5.equalsIgnoreCase(name)) {
			return elm_typ_nm5();
		}
		if ($fix5.equalsIgnoreCase(name)) {
			return fix5();
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			return num_pad_str5();
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			return elm_typ6();
		}
		if ($elm_typ_nm6.equalsIgnoreCase(name)) {
			return elm_typ_nm6();
		}
		if ($fix6.equalsIgnoreCase(name)) {
			return fix6();
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			return num_pad_str6();
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			return elm_typ7();
		}
		if ($elm_typ_nm7.equalsIgnoreCase(name)) {
			return elm_typ_nm7();
		}
		if ($fix7.equalsIgnoreCase(name)) {
			return fix7();
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			return num_pad_str7();
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			return elm_typ8();
		}
		if ($elm_typ_nm8.equalsIgnoreCase(name)) {
			return elm_typ_nm8();
		}
		if ($fix8.equalsIgnoreCase(name)) {
			return fix8();
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			return num_pad_str8();
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			return elm_typ9();
		}
		if ($elm_typ_nm9.equalsIgnoreCase(name)) {
			return elm_typ_nm9();
		}
		if ($fix9.equalsIgnoreCase(name)) {
			return fix9();
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			return num_pad_str9();
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			return elm_typ10();
		}
		if ($elm_typ_nm10.equalsIgnoreCase(name)) {
			return elm_typ_nm10();
		}
		if ($fix10.equalsIgnoreCase(name)) {
			return fix10();
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			return num_pad_str10();
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			return def_seq_typ();
		}
		if ($def_seq_typ_nm.equalsIgnoreCase(name)) {
			return def_seq_typ_nm();
		}
		if ($num_img.equalsIgnoreCase(name)) {
			return num_img();
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
		if ($max_digit.equalsIgnoreCase(name)) {
			return max_digit();
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			return key_dgt();
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			return elm_dgt1();
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			return elm_dgt2();
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			return elm_dgt3();
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			return elm_dgt4();
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			return elm_dgt5();
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			return elm_dgt6();
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			return elm_dgt7();
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			return elm_dgt8();
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			return elm_dgt9();
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			return elm_dgt10();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			return undisp_flg1();
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			return undisp_flg2();
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			return undisp_flg3();
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			return undisp_flg4();
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			return undisp_flg5();
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			return undisp_flg6();
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			return undisp_flg7();
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			return undisp_flg8();
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			return undisp_flg9();
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			return undisp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			num_biz_typ_nm(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm_lcl.equalsIgnoreCase(name)) {
			num_ptn_nm_lcl(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			elm_typ1(value);
			return;
		}
		if ($elm_typ_nm1.equalsIgnoreCase(name)) {
			elm_typ_nm1(value);
			return;
		}
		if ($fix1.equalsIgnoreCase(name)) {
			fix1(value);
			return;
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			num_pad_str1(value);
			return;
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			elm_typ2(value);
			return;
		}
		if ($elm_typ_nm2.equalsIgnoreCase(name)) {
			elm_typ_nm2(value);
			return;
		}
		if ($fix2.equalsIgnoreCase(name)) {
			fix2(value);
			return;
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			num_pad_str2(value);
			return;
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			elm_typ3(value);
			return;
		}
		if ($elm_typ_nm3.equalsIgnoreCase(name)) {
			elm_typ_nm3(value);
			return;
		}
		if ($fix3.equalsIgnoreCase(name)) {
			fix3(value);
			return;
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			num_pad_str3(value);
			return;
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			elm_typ4(value);
			return;
		}
		if ($elm_typ_nm4.equalsIgnoreCase(name)) {
			elm_typ_nm4(value);
			return;
		}
		if ($fix4.equalsIgnoreCase(name)) {
			fix4(value);
			return;
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			num_pad_str4(value);
			return;
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			elm_typ5(value);
			return;
		}
		if ($elm_typ_nm5.equalsIgnoreCase(name)) {
			elm_typ_nm5(value);
			return;
		}
		if ($fix5.equalsIgnoreCase(name)) {
			fix5(value);
			return;
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			num_pad_str5(value);
			return;
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			elm_typ6(value);
			return;
		}
		if ($elm_typ_nm6.equalsIgnoreCase(name)) {
			elm_typ_nm6(value);
			return;
		}
		if ($fix6.equalsIgnoreCase(name)) {
			fix6(value);
			return;
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			num_pad_str6(value);
			return;
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			elm_typ7(value);
			return;
		}
		if ($elm_typ_nm7.equalsIgnoreCase(name)) {
			elm_typ_nm7(value);
			return;
		}
		if ($fix7.equalsIgnoreCase(name)) {
			fix7(value);
			return;
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			num_pad_str7(value);
			return;
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			elm_typ8(value);
			return;
		}
		if ($elm_typ_nm8.equalsIgnoreCase(name)) {
			elm_typ_nm8(value);
			return;
		}
		if ($fix8.equalsIgnoreCase(name)) {
			fix8(value);
			return;
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			num_pad_str8(value);
			return;
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			elm_typ9(value);
			return;
		}
		if ($elm_typ_nm9.equalsIgnoreCase(name)) {
			elm_typ_nm9(value);
			return;
		}
		if ($fix9.equalsIgnoreCase(name)) {
			fix9(value);
			return;
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			num_pad_str9(value);
			return;
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			elm_typ10(value);
			return;
		}
		if ($elm_typ_nm10.equalsIgnoreCase(name)) {
			elm_typ_nm10(value);
			return;
		}
		if ($fix10.equalsIgnoreCase(name)) {
			fix10(value);
			return;
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			num_pad_str10(value);
			return;
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			def_seq_typ(value);
			return;
		}
		if ($def_seq_typ_nm.equalsIgnoreCase(name)) {
			def_seq_typ_nm(value);
			return;
		}
		if ($num_img.equalsIgnoreCase(name)) {
			num_img(value);
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
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			undisp_flg1(value);
			return;
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			undisp_flg2(value);
			return;
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			undisp_flg3(value);
			return;
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			undisp_flg4(value);
			return;
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			undisp_flg5(value);
			return;
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			undisp_flg6(value);
			return;
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			undisp_flg7(value);
			return;
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			undisp_flg8(value);
			return;
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			undisp_flg9(value);
			return;
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			undisp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			num_biz_typ_nm(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm_lcl.equalsIgnoreCase(name)) {
			num_ptn_nm_lcl(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($elm_typ1.equalsIgnoreCase(name)) {
			elm_typ1(value);
			return;
		}
		if ($elm_typ_nm1.equalsIgnoreCase(name)) {
			elm_typ_nm1(value);
			return;
		}
		if ($fix1.equalsIgnoreCase(name)) {
			fix1(value);
			return;
		}
		if ($num_pad_str1.equalsIgnoreCase(name)) {
			num_pad_str1(value);
			return;
		}
		if ($elm_typ2.equalsIgnoreCase(name)) {
			elm_typ2(value);
			return;
		}
		if ($elm_typ_nm2.equalsIgnoreCase(name)) {
			elm_typ_nm2(value);
			return;
		}
		if ($fix2.equalsIgnoreCase(name)) {
			fix2(value);
			return;
		}
		if ($num_pad_str2.equalsIgnoreCase(name)) {
			num_pad_str2(value);
			return;
		}
		if ($elm_typ3.equalsIgnoreCase(name)) {
			elm_typ3(value);
			return;
		}
		if ($elm_typ_nm3.equalsIgnoreCase(name)) {
			elm_typ_nm3(value);
			return;
		}
		if ($fix3.equalsIgnoreCase(name)) {
			fix3(value);
			return;
		}
		if ($num_pad_str3.equalsIgnoreCase(name)) {
			num_pad_str3(value);
			return;
		}
		if ($elm_typ4.equalsIgnoreCase(name)) {
			elm_typ4(value);
			return;
		}
		if ($elm_typ_nm4.equalsIgnoreCase(name)) {
			elm_typ_nm4(value);
			return;
		}
		if ($fix4.equalsIgnoreCase(name)) {
			fix4(value);
			return;
		}
		if ($num_pad_str4.equalsIgnoreCase(name)) {
			num_pad_str4(value);
			return;
		}
		if ($elm_typ5.equalsIgnoreCase(name)) {
			elm_typ5(value);
			return;
		}
		if ($elm_typ_nm5.equalsIgnoreCase(name)) {
			elm_typ_nm5(value);
			return;
		}
		if ($fix5.equalsIgnoreCase(name)) {
			fix5(value);
			return;
		}
		if ($num_pad_str5.equalsIgnoreCase(name)) {
			num_pad_str5(value);
			return;
		}
		if ($elm_typ6.equalsIgnoreCase(name)) {
			elm_typ6(value);
			return;
		}
		if ($elm_typ_nm6.equalsIgnoreCase(name)) {
			elm_typ_nm6(value);
			return;
		}
		if ($fix6.equalsIgnoreCase(name)) {
			fix6(value);
			return;
		}
		if ($num_pad_str6.equalsIgnoreCase(name)) {
			num_pad_str6(value);
			return;
		}
		if ($elm_typ7.equalsIgnoreCase(name)) {
			elm_typ7(value);
			return;
		}
		if ($elm_typ_nm7.equalsIgnoreCase(name)) {
			elm_typ_nm7(value);
			return;
		}
		if ($fix7.equalsIgnoreCase(name)) {
			fix7(value);
			return;
		}
		if ($num_pad_str7.equalsIgnoreCase(name)) {
			num_pad_str7(value);
			return;
		}
		if ($elm_typ8.equalsIgnoreCase(name)) {
			elm_typ8(value);
			return;
		}
		if ($elm_typ_nm8.equalsIgnoreCase(name)) {
			elm_typ_nm8(value);
			return;
		}
		if ($fix8.equalsIgnoreCase(name)) {
			fix8(value);
			return;
		}
		if ($num_pad_str8.equalsIgnoreCase(name)) {
			num_pad_str8(value);
			return;
		}
		if ($elm_typ9.equalsIgnoreCase(name)) {
			elm_typ9(value);
			return;
		}
		if ($elm_typ_nm9.equalsIgnoreCase(name)) {
			elm_typ_nm9(value);
			return;
		}
		if ($fix9.equalsIgnoreCase(name)) {
			fix9(value);
			return;
		}
		if ($num_pad_str9.equalsIgnoreCase(name)) {
			num_pad_str9(value);
			return;
		}
		if ($elm_typ10.equalsIgnoreCase(name)) {
			elm_typ10(value);
			return;
		}
		if ($elm_typ_nm10.equalsIgnoreCase(name)) {
			elm_typ_nm10(value);
			return;
		}
		if ($fix10.equalsIgnoreCase(name)) {
			fix10(value);
			return;
		}
		if ($num_pad_str10.equalsIgnoreCase(name)) {
			num_pad_str10(value);
			return;
		}
		if ($def_seq_typ.equalsIgnoreCase(name)) {
			def_seq_typ(value);
			return;
		}
		if ($def_seq_typ_nm.equalsIgnoreCase(name)) {
			def_seq_typ_nm(value);
			return;
		}
		if ($num_img.equalsIgnoreCase(name)) {
			num_img(value);
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
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($max_digit.equalsIgnoreCase(name)) {
			max_digit(value);
			return;
		}
		if ($key_dgt.equalsIgnoreCase(name)) {
			key_dgt(value);
			return;
		}
		if ($elm_dgt1.equalsIgnoreCase(name)) {
			elm_dgt1(value);
			return;
		}
		if ($elm_dgt2.equalsIgnoreCase(name)) {
			elm_dgt2(value);
			return;
		}
		if ($elm_dgt3.equalsIgnoreCase(name)) {
			elm_dgt3(value);
			return;
		}
		if ($elm_dgt4.equalsIgnoreCase(name)) {
			elm_dgt4(value);
			return;
		}
		if ($elm_dgt5.equalsIgnoreCase(name)) {
			elm_dgt5(value);
			return;
		}
		if ($elm_dgt6.equalsIgnoreCase(name)) {
			elm_dgt6(value);
			return;
		}
		if ($elm_dgt7.equalsIgnoreCase(name)) {
			elm_dgt7(value);
			return;
		}
		if ($elm_dgt8.equalsIgnoreCase(name)) {
			elm_dgt8(value);
			return;
		}
		if ($elm_dgt9.equalsIgnoreCase(name)) {
			elm_dgt9(value);
			return;
		}
		if ($elm_dgt10.equalsIgnoreCase(name)) {
			elm_dgt10(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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
		if ($undisp_flg1.equalsIgnoreCase(name)) {
			undisp_flg1(value);
			return;
		}
		if ($undisp_flg2.equalsIgnoreCase(name)) {
			undisp_flg2(value);
			return;
		}
		if ($undisp_flg3.equalsIgnoreCase(name)) {
			undisp_flg3(value);
			return;
		}
		if ($undisp_flg4.equalsIgnoreCase(name)) {
			undisp_flg4(value);
			return;
		}
		if ($undisp_flg5.equalsIgnoreCase(name)) {
			undisp_flg5(value);
			return;
		}
		if ($undisp_flg6.equalsIgnoreCase(name)) {
			undisp_flg6(value);
			return;
		}
		if ($undisp_flg7.equalsIgnoreCase(name)) {
			undisp_flg7(value);
			return;
		}
		if ($undisp_flg8.equalsIgnoreCase(name)) {
			undisp_flg8(value);
			return;
		}
		if ($undisp_flg9.equalsIgnoreCase(name)) {
			undisp_flg9(value);
			return;
		}
		if ($undisp_flg10.equalsIgnoreCase(name)) {
			undisp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

