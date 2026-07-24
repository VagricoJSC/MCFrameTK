package mcframe.clientMABC.MABCP1060;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public static final String $jnl_ptn_nm = "jnl_ptn_nm";
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public static final String $jnl_seq = "jnl_seq";
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
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public static final String $dr_dpt_typ = "dr_dpt_typ";
	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public static final String $dr_dpt_typ_nm = "dr_dpt_typ_nm";
	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public static final String $dr_trd_sml_flg = "dr_trd_sml_flg";
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public static final String $dr_dpt_cd = "dr_dpt_cd";
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public static final String $dr_dpt_nm = "dr_dpt_nm";
	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public static final String $dr_ptn_typ = "dr_ptn_typ";
	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public static final String $dr_ptn_typ_nm = "dr_ptn_typ_nm";
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public static final String $dr_grp_cd = "dr_grp_cd";
	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public static final String $dr_grp_nm = "dr_grp_nm";
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $dr_ac_cd = "dr_ac_cd";
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public static final String $dr_ac_nm = "dr_ac_nm";
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $dr_sub_ac_cd = "dr_sub_ac_cd";
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public static final String $dr_sub_ac_nm = "dr_sub_ac_nm";
	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public static final String $dr_bp_typ = "dr_bp_typ";
	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public static final String $dr_bp_typ_nm = "dr_bp_typ_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $dr_bp_cd = "dr_bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $dr_bp_nm = "dr_bp_nm";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $dr_ac_tax_cd = "dr_ac_tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $dr_ac_tax_nm = "dr_ac_tax_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $dr_itm_typ = "dr_itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $dr_itm_typ_nm = "dr_itm_typ_nm";
	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public static final String $dr_amt_typ = "dr_amt_typ";
	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public static final String $dr_amt_typ_nm = "dr_amt_typ_nm";
	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public static final String $dr_abs_typ = "dr_abs_typ";
	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public static final String $dr_abs_typ_nm = "dr_abs_typ_nm";
	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public static final String $dr_abstract = "dr_abstract";
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public static final String $dr_sub_flg = "dr_sub_flg";
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public static final String $dr_bp_flg = "dr_bp_flg";
	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public static final String $cr_dpt_typ = "cr_dpt_typ";
	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public static final String $cr_dpt_typ_nm = "cr_dpt_typ_nm";
	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public static final String $cr_trd_sml_flg = "cr_trd_sml_flg";
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public static final String $cr_dpt_cd = "cr_dpt_cd";
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public static final String $cr_dpt_nm = "cr_dpt_nm";
	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public static final String $cr_ptn_typ = "cr_ptn_typ";
	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public static final String $cr_ptn_typ_nm = "cr_ptn_typ_nm";
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public static final String $cr_grp_cd = "cr_grp_cd";
	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public static final String $cr_grp_nm = "cr_grp_nm";
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $cr_ac_cd = "cr_ac_cd";
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public static final String $cr_ac_nm = "cr_ac_nm";
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $cr_sub_ac_cd = "cr_sub_ac_cd";
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public static final String $cr_sub_ac_nm = "cr_sub_ac_nm";
	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public static final String $cr_bp_typ = "cr_bp_typ";
	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public static final String $cr_bp_typ_nm = "cr_bp_typ_nm";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $cr_bp_cd = "cr_bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $cr_bp_nm = "cr_bp_nm";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $cr_ac_tax_cd = "cr_ac_tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $cr_ac_tax_nm = "cr_ac_tax_nm";
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $cr_itm_typ = "cr_itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $cr_itm_typ_nm = "cr_itm_typ_nm";
	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public static final String $cr_amt_typ = "cr_amt_typ";
	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public static final String $cr_amt_typ_nm = "cr_amt_typ_nm";
	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public static final String $cr_abs_typ = "cr_abs_typ";
	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public static final String $cr_abs_typ_nm = "cr_abs_typ_nm";
	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public static final String $cr_abstract = "cr_abstract";
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public static final String $cr_sub_flg = "cr_sub_flg";
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public static final String $cr_bp_flg = "cr_bp_flg";
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public static final String $minus_flg = "minus_flg";
	/**
	 * Carry-over journal 繰越仕訳.<p>
	 *
	 */
	public static final String $carry_flg = "carry_flg";
	public static final String $itm_p = "itm_p";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public static final String $purc_typ = "purc_typ";
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public static final String $purc_typ_nm = "purc_typ_nm";
	/**
	 * Amount unfirm type 金額未確定区分.<p>
	 *
	 */
	public static final String $un_fix_typ = "un_fix_typ";
	/**
	 * Amount unfirm type name 金額未確定区分名.<p>
	 *
	 */
	public static final String $un_fix_typ_nm = "un_fix_typ_nm";
	/**
	 * Foreign transaction type 国外取引区分.<p>
	 *
	 */
	public static final String $foreign_typ = "foreign_typ";
	/**
	 * Foreign transaction type name 国外取引区分名.<p>
	 *
	 */
	public static final String $foreign_typ_nm = "foreign_typ_nm";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory conforming type name 在庫良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public static final String $inv_loc_typ = "inv_loc_typ";
	/**
	 * Inventory location type name 在庫場所区分名.<p>
	 *
	 */
	public static final String $inv_loc_typ_nm = "inv_loc_typ_nm";
	/**
	 * Amount sign type 金額符号区分.<p>
	 *
	 */
	public static final String $amt_sign_typ = "amt_sign_typ";
	/**
	 * Amount sign type name 金額符号区分名.<p>
	 *
	 */
	public static final String $amt_sign_typ_nm = "amt_sign_typ_nm";
	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public static final String $jnl_key1 = "jnl_key1";
	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public static final String $jnl_key2 = "jnl_key2";
	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public static final String $jnl_key3 = "jnl_key3";
	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public static final String $jnl_key4 = "jnl_key4";
	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public static final String $jnl_key5 = "jnl_key5";
	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public static final String $jnl_key6 = "jnl_key6";
	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public static final String $jnl_key7 = "jnl_key7";
	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public static final String $jnl_key8 = "jnl_key8";
	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public static final String $jnl_key9 = "jnl_key9";
	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public static final String $jnl_key10 = "jnl_key10";
	/**
	 * Not for Jan. １月対象外.<p>
	 *
	 */
	public static final String $mon01_invalid_flg = "mon01_invalid_flg";
	/**
	 * Not for Feb. ２月対象外.<p>
	 *
	 */
	public static final String $mon02_invalid_flg = "mon02_invalid_flg";
	/**
	 * Not for Mar. ３月対象外.<p>
	 *
	 */
	public static final String $mon03_invalid_flg = "mon03_invalid_flg";
	/**
	 * Not for Apr. ４月対象外.<p>
	 *
	 */
	public static final String $mon04_invalid_flg = "mon04_invalid_flg";
	/**
	 * Not for May ５月対象外.<p>
	 *
	 */
	public static final String $mon05_invalid_flg = "mon05_invalid_flg";
	/**
	 * Not for Jun. ６月対象外.<p>
	 *
	 */
	public static final String $mon06_invalid_flg = "mon06_invalid_flg";
	/**
	 * Not for July ７月対象外.<p>
	 *
	 */
	public static final String $mon07_invalid_flg = "mon07_invalid_flg";
	/**
	 * Not for Aug. ８月対象外.<p>
	 *
	 */
	public static final String $mon08_invalid_flg = "mon08_invalid_flg";
	/**
	 * Not for Sep. ９月対象外.<p>
	 *
	 */
	public static final String $mon09_invalid_flg = "mon09_invalid_flg";
	/**
	 * Not for Oct. １０月対象外.<p>
	 *
	 */
	public static final String $mon10_invalid_flg = "mon10_invalid_flg";
	/**
	 * Not for Nov. １１月対象外.<p>
	 *
	 */
	public static final String $mon11_invalid_flg = "mon11_invalid_flg";
	/**
	 * Not for Dec. １２月対象外.<p>
	 *
	 */
	public static final String $mon12_invalid_flg = "mon12_invalid_flg";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta jnl_ptn_nm_META = createCommonMeta($jnl_ptn_nm, mcframe.commonMA.meta.MA_META.JNL_PTN_NM);
	public static final MCMeta jnl_seq_META = createCommonMeta($jnl_seq, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dr_dpt_typ_META = createCommonMeta($dr_dpt_typ, mcframe.commonMA.meta.MA_META.DPT_TYP);
	public static final MCMeta dr_dpt_typ_nm_META = createCommonMeta($dr_dpt_typ_nm, mcframe.commonMA.meta.MA_META.DPT_TYP_NM);
	public static final MCMeta dr_trd_sml_flg_META = createCommonMeta($dr_trd_sml_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dr_dpt_cd_META = createCommonMeta($dr_dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta dr_dpt_nm_META = createCommonMeta($dr_dpt_nm, mcframe.commonMA.meta.MA_META.AC_DPT_NM);
	public static final MCMeta dr_ptn_typ_META = createCommonMeta($dr_ptn_typ, mcframe.commonMA.meta.MA_META.PTN_TYP);
	public static final MCMeta dr_ptn_typ_nm_META = createCommonMeta($dr_ptn_typ_nm, mcframe.commonMA.meta.MA_META.PTN_TYP_NM);
	public static final MCMeta dr_grp_cd_META = createCommonMeta($dr_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta dr_grp_nm_META = createCommonMeta($dr_grp_nm, mcframe.commonMA.meta.MA_META.JNL_GRP_NM);
	public static final MCMeta dr_ac_cd_META = createCommonMeta($dr_ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta dr_ac_nm_META = createCommonMeta($dr_ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta dr_sub_ac_cd_META = createCommonMeta($dr_sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta dr_sub_ac_nm_META = createCommonMeta($dr_sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);
	public static final MCMeta dr_bp_typ_META = createCommonMeta($dr_bp_typ, mcframe.commonMA.meta.MA_META.BP_SET_TYP);
	public static final MCMeta dr_bp_typ_nm_META = createCommonMeta($dr_bp_typ_nm, mcframe.commonMA.meta.MA_META.BP_SET_TYP_NM);
	public static final MCMeta dr_bp_cd_META = createCommonMeta($dr_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dr_bp_nm_META = createCommonMeta($dr_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dr_ac_tax_cd_META = createCommonMeta($dr_ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta dr_ac_tax_nm_META = createCommonMeta($dr_ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta dr_itm_typ_META = createCommonMeta($dr_itm_typ, mcframe.commonMA.meta.MA_META.ITM_SET_TYP);
	public static final MCMeta dr_itm_typ_nm_META = createCommonMeta($dr_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_SET_TYP_NM);
	public static final MCMeta dr_amt_typ_META = createCommonMeta($dr_amt_typ, mcframe.commonMA.meta.MA_META.AMT_TYP);
	public static final MCMeta dr_amt_typ_nm_META = createCommonMeta($dr_amt_typ_nm, mcframe.commonMA.meta.MA_META.AMT_TYP_NM);
	public static final MCMeta dr_abs_typ_META = createCommonMeta($dr_abs_typ, mcframe.commonMA.meta.MA_META.ABS_TYP);
	public static final MCMeta dr_abs_typ_nm_META = createCommonMeta($dr_abs_typ_nm, mcframe.commonMA.meta.MA_META.ABS_TYP_NM);
	public static final MCMeta dr_abstract_META = createCommonMeta($dr_abstract, mcframe.commonMA.meta.MA_META.ABSTRACT_M);
	public static final MCMeta dr_sub_flg_META = createCommonMeta($dr_sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dr_bp_flg_META = createCommonMeta($dr_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cr_dpt_typ_META = createCommonMeta($cr_dpt_typ, mcframe.commonMA.meta.MA_META.DPT_TYP);
	public static final MCMeta cr_dpt_typ_nm_META = createCommonMeta($cr_dpt_typ_nm, mcframe.commonMA.meta.MA_META.DPT_TYP_NM);
	public static final MCMeta cr_trd_sml_flg_META = createCommonMeta($cr_trd_sml_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cr_dpt_cd_META = createCommonMeta($cr_dpt_cd, mcframe.commonMA.meta.MA_META.AC_DPT_CD);
	public static final MCMeta cr_dpt_nm_META = createCommonMeta($cr_dpt_nm, mcframe.commonMA.meta.MA_META.AC_DPT_NM);
	public static final MCMeta cr_ptn_typ_META = createCommonMeta($cr_ptn_typ, mcframe.commonMA.meta.MA_META.PTN_TYP);
	public static final MCMeta cr_ptn_typ_nm_META = createCommonMeta($cr_ptn_typ_nm, mcframe.commonMA.meta.MA_META.PTN_TYP_NM);
	public static final MCMeta cr_grp_cd_META = createCommonMeta($cr_grp_cd, mcframe.commonMA.meta.MA_META.JNL_GRP_CD);
	public static final MCMeta cr_grp_nm_META = createCommonMeta($cr_grp_nm, mcframe.commonMA.meta.MA_META.JNL_GRP_NM);
	public static final MCMeta cr_ac_cd_META = createCommonMeta($cr_ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta cr_ac_nm_META = createCommonMeta($cr_ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta cr_sub_ac_cd_META = createCommonMeta($cr_sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta cr_sub_ac_nm_META = createCommonMeta($cr_sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);
	public static final MCMeta cr_bp_typ_META = createCommonMeta($cr_bp_typ, mcframe.commonMA.meta.MA_META.BP_SET_TYP);
	public static final MCMeta cr_bp_typ_nm_META = createCommonMeta($cr_bp_typ_nm, mcframe.commonMA.meta.MA_META.BP_SET_TYP_NM);
	public static final MCMeta cr_bp_cd_META = createCommonMeta($cr_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cr_bp_nm_META = createCommonMeta($cr_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cr_ac_tax_cd_META = createCommonMeta($cr_ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta cr_ac_tax_nm_META = createCommonMeta($cr_ac_tax_nm, mcframe.commonMA.meta.MA_META.AC_TAX_NM);
	public static final MCMeta cr_itm_typ_META = createCommonMeta($cr_itm_typ, mcframe.commonMA.meta.MA_META.ITM_SET_TYP);
	public static final MCMeta cr_itm_typ_nm_META = createCommonMeta($cr_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_SET_TYP_NM);
	public static final MCMeta cr_amt_typ_META = createCommonMeta($cr_amt_typ, mcframe.commonMA.meta.MA_META.AMT_TYP);
	public static final MCMeta cr_amt_typ_nm_META = createCommonMeta($cr_amt_typ_nm, mcframe.commonMA.meta.MA_META.AMT_TYP_NM);
	public static final MCMeta cr_abs_typ_META = createCommonMeta($cr_abs_typ, mcframe.commonMA.meta.MA_META.ABS_TYP);
	public static final MCMeta cr_abs_typ_nm_META = createCommonMeta($cr_abs_typ_nm, mcframe.commonMA.meta.MA_META.ABS_TYP_NM);
	public static final MCMeta cr_abstract_META = createCommonMeta($cr_abstract, mcframe.commonMA.meta.MA_META.ABSTRACT_M);
	public static final MCMeta cr_sub_flg_META = createCommonMeta($cr_sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cr_bp_flg_META = createCommonMeta($cr_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta minus_flg_META = createCommonMeta($minus_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta carry_flg_META = createCommonMeta($carry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta purc_typ_META = createCommonMeta($purc_typ, mcframe.commonMA.meta.MA_META.PURC_TYP);
	public static final MCMeta purc_typ_nm_META = createCommonMeta($purc_typ_nm, mcframe.commonMA.meta.MA_META.PURC_TYP_NM);
	public static final MCMeta un_fix_typ_META = createCommonMeta($un_fix_typ, mcframe.commonMA.meta.MA_META.UN_FIX_TYP);
	public static final MCMeta un_fix_typ_nm_META = createCommonMeta($un_fix_typ_nm, mcframe.commonMA.meta.MA_META.UN_FIX_TYP_NM);
	public static final MCMeta foreign_typ_META = createCommonMeta($foreign_typ, mcframe.commonMA.meta.MA_META.FOREIGN_TYP);
	public static final MCMeta foreign_typ_nm_META = createCommonMeta($foreign_typ_nm, mcframe.commonMA.meta.MA_META.FOREIGN_TYP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta inv_loc_typ_META = createCommonMeta($inv_loc_typ, mcframe.commonMA.meta.MA_META.INV_LOC_TYP);
	public static final MCMeta inv_loc_typ_nm_META = createCommonMeta($inv_loc_typ_nm, mcframe.commonMA.meta.MA_META.INV_LOC_TYP_NM);
	public static final MCMeta amt_sign_typ_META = createCommonMeta($amt_sign_typ, mcframe.commonMA.meta.MA_META.AMT_SIGN_TYP);
	public static final MCMeta amt_sign_typ_nm_META = createCommonMeta($amt_sign_typ_nm, mcframe.commonMA.meta.MA_META.AMT_SIGN_TYP_NM);
	public static final MCMeta jnl_key1_META = createCommonMeta($jnl_key1, mcframe.commonMA.meta.MA_META.JNL_KEY1);
	public static final MCMeta jnl_key2_META = createCommonMeta($jnl_key2, mcframe.commonMA.meta.MA_META.JNL_KEY2);
	public static final MCMeta jnl_key3_META = createCommonMeta($jnl_key3, mcframe.commonMA.meta.MA_META.JNL_KEY3);
	public static final MCMeta jnl_key4_META = createCommonMeta($jnl_key4, mcframe.commonMA.meta.MA_META.JNL_KEY4);
	public static final MCMeta jnl_key5_META = createCommonMeta($jnl_key5, mcframe.commonMA.meta.MA_META.JNL_KEY5);
	public static final MCMeta jnl_key6_META = createCommonMeta($jnl_key6, mcframe.commonMA.meta.MA_META.JNL_KEY6);
	public static final MCMeta jnl_key7_META = createCommonMeta($jnl_key7, mcframe.commonMA.meta.MA_META.JNL_KEY7);
	public static final MCMeta jnl_key8_META = createCommonMeta($jnl_key8, mcframe.commonMA.meta.MA_META.JNL_KEY8);
	public static final MCMeta jnl_key9_META = createCommonMeta($jnl_key9, mcframe.commonMA.meta.MA_META.JNL_KEY9);
	public static final MCMeta jnl_key10_META = createCommonMeta($jnl_key10, mcframe.commonMA.meta.MA_META.JNL_KEY10);
	public static final MCMeta mon01_invalid_flg_META = createCommonMeta($mon01_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon02_invalid_flg_META = createCommonMeta($mon02_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon03_invalid_flg_META = createCommonMeta($mon03_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon04_invalid_flg_META = createCommonMeta($mon04_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon05_invalid_flg_META = createCommonMeta($mon05_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon06_invalid_flg_META = createCommonMeta($mon06_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon07_invalid_flg_META = createCommonMeta($mon07_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon08_invalid_flg_META = createCommonMeta($mon08_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon09_invalid_flg_META = createCommonMeta($mon09_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon10_invalid_flg_META = createCommonMeta($mon10_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon11_invalid_flg_META = createCommonMeta($mon11_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon12_invalid_flg_META = createCommonMeta($mon12_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			jnl_ptn_cd_META,
			jnl_ptn_nm_META,
			jnl_seq_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			dr_dpt_typ_META,
			dr_dpt_typ_nm_META,
			dr_trd_sml_flg_META,
			dr_dpt_cd_META,
			dr_dpt_nm_META,
			dr_ptn_typ_META,
			dr_ptn_typ_nm_META,
			dr_grp_cd_META,
			dr_grp_nm_META,
			dr_ac_cd_META,
			dr_ac_nm_META,
			dr_sub_ac_cd_META,
			dr_sub_ac_nm_META,
			dr_bp_typ_META,
			dr_bp_typ_nm_META,
			dr_bp_cd_META,
			dr_bp_nm_META,
			dr_ac_tax_cd_META,
			dr_ac_tax_nm_META,
			dr_itm_typ_META,
			dr_itm_typ_nm_META,
			dr_amt_typ_META,
			dr_amt_typ_nm_META,
			dr_abs_typ_META,
			dr_abs_typ_nm_META,
			dr_abstract_META,
			dr_sub_flg_META,
			dr_bp_flg_META,
			cr_dpt_typ_META,
			cr_dpt_typ_nm_META,
			cr_trd_sml_flg_META,
			cr_dpt_cd_META,
			cr_dpt_nm_META,
			cr_ptn_typ_META,
			cr_ptn_typ_nm_META,
			cr_grp_cd_META,
			cr_grp_nm_META,
			cr_ac_cd_META,
			cr_ac_nm_META,
			cr_sub_ac_cd_META,
			cr_sub_ac_nm_META,
			cr_bp_typ_META,
			cr_bp_typ_nm_META,
			cr_bp_cd_META,
			cr_bp_nm_META,
			cr_ac_tax_cd_META,
			cr_ac_tax_nm_META,
			cr_itm_typ_META,
			cr_itm_typ_nm_META,
			cr_amt_typ_META,
			cr_amt_typ_nm_META,
			cr_abs_typ_META,
			cr_abs_typ_nm_META,
			cr_abstract_META,
			cr_sub_flg_META,
			cr_bp_flg_META,
			minus_flg_META,
			carry_flg_META,
			itm_p_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			purc_typ_META,
			purc_typ_nm_META,
			un_fix_typ_META,
			un_fix_typ_nm_META,
			foreign_typ_META,
			foreign_typ_nm_META,
			cur_cd_META,
			cur_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			inv_loc_typ_META,
			inv_loc_typ_nm_META,
			amt_sign_typ_META,
			amt_sign_typ_nm_META,
			jnl_key1_META,
			jnl_key2_META,
			jnl_key3_META,
			jnl_key4_META,
			jnl_key5_META,
			jnl_key6_META,
			jnl_key7_META,
			jnl_key8_META,
			jnl_key9_META,
			jnl_key10_META,
			mon01_invalid_flg_META,
			mon02_invalid_flg_META,
			mon03_invalid_flg_META,
			mon04_invalid_flg_META,
			mon05_invalid_flg_META,
			mon06_invalid_flg_META,
			mon07_invalid_flg_META,
			mon08_invalid_flg_META,
			mon09_invalid_flg_META,
			mon10_invalid_flg_META,
			mon11_invalid_flg_META,
			mon12_invalid_flg_META,
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
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$jnl_ptn_cd,	// jnl_ptn_cd
			$jnl_seq	// jnl_seq
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
				{$dr_dpt_typ, "dpt_typ_nm"},	// dr_dpt_typ
				{$dr_dpt_cd, "ac_dpt_nm"},	// dr_dpt_cd
				{$dr_ptn_typ, "ptn_typ_nm"},	// dr_ptn_typ
				{$dr_grp_cd, "jnl_grp_nm"},	// dr_grp_cd
				{$dr_ac_cd, "ac_nm;sub_flg;bp_flg"},	// dr_ac_cd
				{$dr_sub_ac_cd, "sub_ac_nm"},	// dr_sub_ac_cd
				{$dr_bp_typ, "bp_set_typ_nm"},	// dr_bp_typ
				{$dr_bp_cd, "bp_nm"},	// dr_bp_cd
				{$dr_ac_tax_cd, "ac_tax_nm"},	// dr_ac_tax_cd
				{$dr_itm_typ, "itm_set_typ_nm"},	// dr_itm_typ
				{$dr_amt_typ, "amt_typ_nm"},	// dr_amt_typ
				{$dr_abs_typ, "abs_typ_nm"},	// dr_abs_typ
				{$cr_dpt_typ, "dpt_typ_nm"},	// cr_dpt_typ
				{$cr_dpt_cd, "ac_dpt_nm"},	// cr_dpt_cd
				{$cr_ptn_typ, "ptn_typ_nm"},	// cr_ptn_typ
				{$cr_grp_cd, "jnl_grp_nm"},	// cr_grp_cd
				{$cr_ac_cd, "ac_nm;sub_flg;bp_flg"},	// cr_ac_cd
				{$cr_sub_ac_cd, "sub_ac_nm"},	// cr_sub_ac_cd
				{$cr_bp_typ, "bp_set_typ_nm"},	// cr_bp_typ
				{$cr_bp_cd, "bp_nm"},	// cr_bp_cd
				{$cr_ac_tax_cd, "ac_tax_nm"},	// cr_ac_tax_cd
				{$cr_itm_typ, "itm_set_typ_nm"},	// cr_itm_typ
				{$cr_amt_typ, "amt_typ_nm"},	// cr_amt_typ
				{$cr_abs_typ, "abs_typ_nm"}	// cr_abs_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dr_dpt_cd, "true"},	// dr_dpt_cd
				{$cr_dpt_cd, "true"},	// cr_dpt_cd
				{$itm_p + ".itm_sub1", "itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dr_dpt_cd, "mode_today_flg"},	// dr_dpt_cd
				{$cr_dpt_cd, "mode_today_flg"},	// cr_dpt_cd
				{$itm_p + ".itm_sub1", "itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2"}	// itm_p.itm_sub3
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
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
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 1, $jnl_ptn_cd);
	}

	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 1, $jnl_ptn_cd, value);
	}


	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public String jnl_ptn_nm() {
		return getConstString(offset + 2, $jnl_ptn_nm);
	}

	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public void jnl_ptn_nm(String value) {
		setConstString(offset + 2, $jnl_ptn_nm, value);
	}


	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCNumber jnl_seq() {
		return getConstNumber(offset + 3, $jnl_seq);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(MCNumber value) {
		setConstNumber(offset + 3, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(int value) {
		setConstNumber(offset + 3, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(long value) {
		setConstNumber(offset + 3, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(float value) {
		setConstNumber(offset + 3, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(double value) {
		setConstNumber(offset + 3, $jnl_seq, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 4, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 4, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 5, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 5, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 6, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 6, $memo3, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 7, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 7, $del_flg, value);
	}


	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public String dr_dpt_typ() {
		return getConstString(offset + 8, $dr_dpt_typ);
	}

	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public void dr_dpt_typ(String value) {
		setConstString(offset + 8, $dr_dpt_typ, value);
	}


	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public String dr_dpt_typ_nm() {
		return getConstString(offset + 9, $dr_dpt_typ_nm);
	}

	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public void dr_dpt_typ_nm(String value) {
		setConstString(offset + 9, $dr_dpt_typ_nm, value);
	}


	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public boolean dr_trd_sml_flg() {
		return getConstBoolean(offset + 10, $dr_trd_sml_flg);
	}

	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public void dr_trd_sml_flg(boolean value) {
		setConstBoolean(offset + 10, $dr_trd_sml_flg, value);
	}


	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public String dr_dpt_cd() {
		return getConstString(offset + 11, $dr_dpt_cd);
	}

	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public void dr_dpt_cd(String value) {
		setConstString(offset + 11, $dr_dpt_cd, value);
	}


	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public String dr_dpt_nm() {
		return getConstString(offset + 12, $dr_dpt_nm);
	}

	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public void dr_dpt_nm(String value) {
		setConstString(offset + 12, $dr_dpt_nm, value);
	}


	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public String dr_ptn_typ() {
		return getConstString(offset + 13, $dr_ptn_typ);
	}

	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public void dr_ptn_typ(String value) {
		setConstString(offset + 13, $dr_ptn_typ, value);
	}


	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public String dr_ptn_typ_nm() {
		return getConstString(offset + 14, $dr_ptn_typ_nm);
	}

	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public void dr_ptn_typ_nm(String value) {
		setConstString(offset + 14, $dr_ptn_typ_nm, value);
	}


	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public String dr_grp_cd() {
		return getConstString(offset + 15, $dr_grp_cd);
	}

	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public void dr_grp_cd(String value) {
		setConstString(offset + 15, $dr_grp_cd, value);
	}


	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public String dr_grp_nm() {
		return getConstString(offset + 16, $dr_grp_nm);
	}

	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public void dr_grp_nm(String value) {
		setConstString(offset + 16, $dr_grp_nm, value);
	}


	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String dr_ac_cd() {
		return getConstString(offset + 17, $dr_ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void dr_ac_cd(String value) {
		setConstString(offset + 17, $dr_ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String dr_ac_nm() {
		return getConstString(offset + 18, $dr_ac_nm);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void dr_ac_nm(String value) {
		setConstString(offset + 18, $dr_ac_nm, value);
	}


	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public String dr_sub_ac_cd() {
		return getConstString(offset + 19, $dr_sub_ac_cd);
	}

	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public void dr_sub_ac_cd(String value) {
		setConstString(offset + 19, $dr_sub_ac_cd, value);
	}


	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public String dr_sub_ac_nm() {
		return getConstString(offset + 20, $dr_sub_ac_nm);
	}

	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public void dr_sub_ac_nm(String value) {
		setConstString(offset + 20, $dr_sub_ac_nm, value);
	}


	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public String dr_bp_typ() {
		return getConstString(offset + 21, $dr_bp_typ);
	}

	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public void dr_bp_typ(String value) {
		setConstString(offset + 21, $dr_bp_typ, value);
	}


	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public String dr_bp_typ_nm() {
		return getConstString(offset + 22, $dr_bp_typ_nm);
	}

	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public void dr_bp_typ_nm(String value) {
		setConstString(offset + 22, $dr_bp_typ_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String dr_bp_cd() {
		return getConstString(offset + 23, $dr_bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void dr_bp_cd(String value) {
		setConstString(offset + 23, $dr_bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String dr_bp_nm() {
		return getConstString(offset + 24, $dr_bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void dr_bp_nm(String value) {
		setConstString(offset + 24, $dr_bp_nm, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String dr_ac_tax_cd() {
		return getConstString(offset + 25, $dr_ac_tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void dr_ac_tax_cd(String value) {
		setConstString(offset + 25, $dr_ac_tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String dr_ac_tax_nm() {
		return getConstString(offset + 26, $dr_ac_tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void dr_ac_tax_nm(String value) {
		setConstString(offset + 26, $dr_ac_tax_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String dr_itm_typ() {
		return getConstString(offset + 27, $dr_itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void dr_itm_typ(String value) {
		setConstString(offset + 27, $dr_itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String dr_itm_typ_nm() {
		return getConstString(offset + 28, $dr_itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void dr_itm_typ_nm(String value) {
		setConstString(offset + 28, $dr_itm_typ_nm, value);
	}


	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public String dr_amt_typ() {
		return getConstString(offset + 29, $dr_amt_typ);
	}

	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public void dr_amt_typ(String value) {
		setConstString(offset + 29, $dr_amt_typ, value);
	}


	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public String dr_amt_typ_nm() {
		return getConstString(offset + 30, $dr_amt_typ_nm);
	}

	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public void dr_amt_typ_nm(String value) {
		setConstString(offset + 30, $dr_amt_typ_nm, value);
	}


	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public String dr_abs_typ() {
		return getConstString(offset + 31, $dr_abs_typ);
	}

	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public void dr_abs_typ(String value) {
		setConstString(offset + 31, $dr_abs_typ, value);
	}


	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public String dr_abs_typ_nm() {
		return getConstString(offset + 32, $dr_abs_typ_nm);
	}

	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public void dr_abs_typ_nm(String value) {
		setConstString(offset + 32, $dr_abs_typ_nm, value);
	}


	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public String dr_abstract() {
		return getConstString(offset + 33, $dr_abstract);
	}

	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public void dr_abstract(String value) {
		setConstString(offset + 33, $dr_abstract, value);
	}


	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public boolean dr_sub_flg() {
		return getConstBoolean(offset + 34, $dr_sub_flg);
	}

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public void dr_sub_flg(boolean value) {
		setConstBoolean(offset + 34, $dr_sub_flg, value);
	}


	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public boolean dr_bp_flg() {
		return getConstBoolean(offset + 35, $dr_bp_flg);
	}

	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public void dr_bp_flg(boolean value) {
		setConstBoolean(offset + 35, $dr_bp_flg, value);
	}


	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public String cr_dpt_typ() {
		return getConstString(offset + 36, $cr_dpt_typ);
	}

	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public void cr_dpt_typ(String value) {
		setConstString(offset + 36, $cr_dpt_typ, value);
	}


	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public String cr_dpt_typ_nm() {
		return getConstString(offset + 37, $cr_dpt_typ_nm);
	}

	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public void cr_dpt_typ_nm(String value) {
		setConstString(offset + 37, $cr_dpt_typ_nm, value);
	}


	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public boolean cr_trd_sml_flg() {
		return getConstBoolean(offset + 38, $cr_trd_sml_flg);
	}

	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public void cr_trd_sml_flg(boolean value) {
		setConstBoolean(offset + 38, $cr_trd_sml_flg, value);
	}


	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public String cr_dpt_cd() {
		return getConstString(offset + 39, $cr_dpt_cd);
	}

	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public void cr_dpt_cd(String value) {
		setConstString(offset + 39, $cr_dpt_cd, value);
	}


	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public String cr_dpt_nm() {
		return getConstString(offset + 40, $cr_dpt_nm);
	}

	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public void cr_dpt_nm(String value) {
		setConstString(offset + 40, $cr_dpt_nm, value);
	}


	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public String cr_ptn_typ() {
		return getConstString(offset + 41, $cr_ptn_typ);
	}

	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public void cr_ptn_typ(String value) {
		setConstString(offset + 41, $cr_ptn_typ, value);
	}


	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public String cr_ptn_typ_nm() {
		return getConstString(offset + 42, $cr_ptn_typ_nm);
	}

	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public void cr_ptn_typ_nm(String value) {
		setConstString(offset + 42, $cr_ptn_typ_nm, value);
	}


	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public String cr_grp_cd() {
		return getConstString(offset + 43, $cr_grp_cd);
	}

	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public void cr_grp_cd(String value) {
		setConstString(offset + 43, $cr_grp_cd, value);
	}


	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public String cr_grp_nm() {
		return getConstString(offset + 44, $cr_grp_nm);
	}

	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public void cr_grp_nm(String value) {
		setConstString(offset + 44, $cr_grp_nm, value);
	}


	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String cr_ac_cd() {
		return getConstString(offset + 45, $cr_ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void cr_ac_cd(String value) {
		setConstString(offset + 45, $cr_ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String cr_ac_nm() {
		return getConstString(offset + 46, $cr_ac_nm);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void cr_ac_nm(String value) {
		setConstString(offset + 46, $cr_ac_nm, value);
	}


	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public String cr_sub_ac_cd() {
		return getConstString(offset + 47, $cr_sub_ac_cd);
	}

	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public void cr_sub_ac_cd(String value) {
		setConstString(offset + 47, $cr_sub_ac_cd, value);
	}


	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public String cr_sub_ac_nm() {
		return getConstString(offset + 48, $cr_sub_ac_nm);
	}

	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public void cr_sub_ac_nm(String value) {
		setConstString(offset + 48, $cr_sub_ac_nm, value);
	}


	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public String cr_bp_typ() {
		return getConstString(offset + 49, $cr_bp_typ);
	}

	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public void cr_bp_typ(String value) {
		setConstString(offset + 49, $cr_bp_typ, value);
	}


	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public String cr_bp_typ_nm() {
		return getConstString(offset + 50, $cr_bp_typ_nm);
	}

	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public void cr_bp_typ_nm(String value) {
		setConstString(offset + 50, $cr_bp_typ_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String cr_bp_cd() {
		return getConstString(offset + 51, $cr_bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void cr_bp_cd(String value) {
		setConstString(offset + 51, $cr_bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String cr_bp_nm() {
		return getConstString(offset + 52, $cr_bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void cr_bp_nm(String value) {
		setConstString(offset + 52, $cr_bp_nm, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String cr_ac_tax_cd() {
		return getConstString(offset + 53, $cr_ac_tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void cr_ac_tax_cd(String value) {
		setConstString(offset + 53, $cr_ac_tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String cr_ac_tax_nm() {
		return getConstString(offset + 54, $cr_ac_tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void cr_ac_tax_nm(String value) {
		setConstString(offset + 54, $cr_ac_tax_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String cr_itm_typ() {
		return getConstString(offset + 55, $cr_itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void cr_itm_typ(String value) {
		setConstString(offset + 55, $cr_itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String cr_itm_typ_nm() {
		return getConstString(offset + 56, $cr_itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void cr_itm_typ_nm(String value) {
		setConstString(offset + 56, $cr_itm_typ_nm, value);
	}


	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public String cr_amt_typ() {
		return getConstString(offset + 57, $cr_amt_typ);
	}

	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public void cr_amt_typ(String value) {
		setConstString(offset + 57, $cr_amt_typ, value);
	}


	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public String cr_amt_typ_nm() {
		return getConstString(offset + 58, $cr_amt_typ_nm);
	}

	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public void cr_amt_typ_nm(String value) {
		setConstString(offset + 58, $cr_amt_typ_nm, value);
	}


	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public String cr_abs_typ() {
		return getConstString(offset + 59, $cr_abs_typ);
	}

	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public void cr_abs_typ(String value) {
		setConstString(offset + 59, $cr_abs_typ, value);
	}


	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public String cr_abs_typ_nm() {
		return getConstString(offset + 60, $cr_abs_typ_nm);
	}

	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public void cr_abs_typ_nm(String value) {
		setConstString(offset + 60, $cr_abs_typ_nm, value);
	}


	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public String cr_abstract() {
		return getConstString(offset + 61, $cr_abstract);
	}

	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public void cr_abstract(String value) {
		setConstString(offset + 61, $cr_abstract, value);
	}


	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public boolean cr_sub_flg() {
		return getConstBoolean(offset + 62, $cr_sub_flg);
	}

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public void cr_sub_flg(boolean value) {
		setConstBoolean(offset + 62, $cr_sub_flg, value);
	}


	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public boolean cr_bp_flg() {
		return getConstBoolean(offset + 63, $cr_bp_flg);
	}

	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public void cr_bp_flg(boolean value) {
		setConstBoolean(offset + 63, $cr_bp_flg, value);
	}


	/**
	 * Minus マイナス.<p>
	 *
	 */
	public boolean minus_flg() {
		return getConstBoolean(offset + 64, $minus_flg);
	}

	/**
	 * Minus マイナス.<p>
	 *
	 */
	public void minus_flg(boolean value) {
		setConstBoolean(offset + 64, $minus_flg, value);
	}


	/**
	 * Carry-over journal 繰越仕訳.<p>
	 *
	 */
	public boolean carry_flg() {
		return getConstBoolean(offset + 65, $carry_flg);
	}

	/**
	 * Carry-over journal 繰越仕訳.<p>
	 *
	 */
	public void carry_flg(boolean value) {
		setConstBoolean(offset + 65, $carry_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 66, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 66, $itm_p, row);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 67, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 67, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 68, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 68, $itm_jnl_nm, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 69, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 69, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 70, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 70, $ac_rsn_nm, value);
	}


	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public String purc_typ() {
		return getConstString(offset + 71, $purc_typ);
	}

	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public void purc_typ(String value) {
		setConstString(offset + 71, $purc_typ, value);
	}


	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public String purc_typ_nm() {
		return getConstString(offset + 72, $purc_typ_nm);
	}

	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public void purc_typ_nm(String value) {
		setConstString(offset + 72, $purc_typ_nm, value);
	}


	/**
	 * Amount unfirm type 金額未確定区分.<p>
	 *
	 */
	public String un_fix_typ() {
		return getConstString(offset + 73, $un_fix_typ);
	}

	/**
	 * Amount unfirm type 金額未確定区分.<p>
	 *
	 */
	public void un_fix_typ(String value) {
		setConstString(offset + 73, $un_fix_typ, value);
	}


	/**
	 * Amount unfirm type name 金額未確定区分名.<p>
	 *
	 */
	public String un_fix_typ_nm() {
		return getConstString(offset + 74, $un_fix_typ_nm);
	}

	/**
	 * Amount unfirm type name 金額未確定区分名.<p>
	 *
	 */
	public void un_fix_typ_nm(String value) {
		setConstString(offset + 74, $un_fix_typ_nm, value);
	}


	/**
	 * Foreign transaction type 国外取引区分.<p>
	 *
	 */
	public String foreign_typ() {
		return getConstString(offset + 75, $foreign_typ);
	}

	/**
	 * Foreign transaction type 国外取引区分.<p>
	 *
	 */
	public void foreign_typ(String value) {
		setConstString(offset + 75, $foreign_typ, value);
	}


	/**
	 * Foreign transaction type name 国外取引区分名.<p>
	 *
	 */
	public String foreign_typ_nm() {
		return getConstString(offset + 76, $foreign_typ_nm);
	}

	/**
	 * Foreign transaction type name 国外取引区分名.<p>
	 *
	 */
	public void foreign_typ_nm(String value) {
		setConstString(offset + 76, $foreign_typ_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 77, $cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 77, $cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 78, $cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 78, $cur_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 79, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 79, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 80, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 80, $asst_typ_nm, value);
	}


	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 81, $quality_typ);
	}

	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 81, $quality_typ, value);
	}


	/**
	 * Inventory conforming type name 在庫良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 82, $quality_typ_nm);
	}

	/**
	 * Inventory conforming type name 在庫良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 82, $quality_typ_nm, value);
	}


	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public String inv_loc_typ() {
		return getConstString(offset + 83, $inv_loc_typ);
	}

	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public void inv_loc_typ(String value) {
		setConstString(offset + 83, $inv_loc_typ, value);
	}


	/**
	 * Inventory location type name 在庫場所区分名.<p>
	 *
	 */
	public String inv_loc_typ_nm() {
		return getConstString(offset + 84, $inv_loc_typ_nm);
	}

	/**
	 * Inventory location type name 在庫場所区分名.<p>
	 *
	 */
	public void inv_loc_typ_nm(String value) {
		setConstString(offset + 84, $inv_loc_typ_nm, value);
	}


	/**
	 * Amount sign type 金額符号区分.<p>
	 *
	 */
	public String amt_sign_typ() {
		return getConstString(offset + 85, $amt_sign_typ);
	}

	/**
	 * Amount sign type 金額符号区分.<p>
	 *
	 */
	public void amt_sign_typ(String value) {
		setConstString(offset + 85, $amt_sign_typ, value);
	}


	/**
	 * Amount sign type name 金額符号区分名.<p>
	 *
	 */
	public String amt_sign_typ_nm() {
		return getConstString(offset + 86, $amt_sign_typ_nm);
	}

	/**
	 * Amount sign type name 金額符号区分名.<p>
	 *
	 */
	public void amt_sign_typ_nm(String value) {
		setConstString(offset + 86, $amt_sign_typ_nm, value);
	}


	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public String jnl_key1() {
		return getConstString(offset + 87, $jnl_key1);
	}

	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public void jnl_key1(String value) {
		setConstString(offset + 87, $jnl_key1, value);
	}


	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public String jnl_key2() {
		return getConstString(offset + 88, $jnl_key2);
	}

	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public void jnl_key2(String value) {
		setConstString(offset + 88, $jnl_key2, value);
	}


	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public String jnl_key3() {
		return getConstString(offset + 89, $jnl_key3);
	}

	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public void jnl_key3(String value) {
		setConstString(offset + 89, $jnl_key3, value);
	}


	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public String jnl_key4() {
		return getConstString(offset + 90, $jnl_key4);
	}

	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public void jnl_key4(String value) {
		setConstString(offset + 90, $jnl_key4, value);
	}


	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public String jnl_key5() {
		return getConstString(offset + 91, $jnl_key5);
	}

	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public void jnl_key5(String value) {
		setConstString(offset + 91, $jnl_key5, value);
	}


	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public String jnl_key6() {
		return getConstString(offset + 92, $jnl_key6);
	}

	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public void jnl_key6(String value) {
		setConstString(offset + 92, $jnl_key6, value);
	}


	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public String jnl_key7() {
		return getConstString(offset + 93, $jnl_key7);
	}

	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public void jnl_key7(String value) {
		setConstString(offset + 93, $jnl_key7, value);
	}


	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public String jnl_key8() {
		return getConstString(offset + 94, $jnl_key8);
	}

	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public void jnl_key8(String value) {
		setConstString(offset + 94, $jnl_key8, value);
	}


	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public String jnl_key9() {
		return getConstString(offset + 95, $jnl_key9);
	}

	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public void jnl_key9(String value) {
		setConstString(offset + 95, $jnl_key9, value);
	}


	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public String jnl_key10() {
		return getConstString(offset + 96, $jnl_key10);
	}

	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public void jnl_key10(String value) {
		setConstString(offset + 96, $jnl_key10, value);
	}


	/**
	 * Not for Jan. １月対象外.<p>
	 *
	 */
	public boolean mon01_invalid_flg() {
		return getConstBoolean(offset + 97, $mon01_invalid_flg);
	}

	/**
	 * Not for Jan. １月対象外.<p>
	 *
	 */
	public void mon01_invalid_flg(boolean value) {
		setConstBoolean(offset + 97, $mon01_invalid_flg, value);
	}


	/**
	 * Not for Feb. ２月対象外.<p>
	 *
	 */
	public boolean mon02_invalid_flg() {
		return getConstBoolean(offset + 98, $mon02_invalid_flg);
	}

	/**
	 * Not for Feb. ２月対象外.<p>
	 *
	 */
	public void mon02_invalid_flg(boolean value) {
		setConstBoolean(offset + 98, $mon02_invalid_flg, value);
	}


	/**
	 * Not for Mar. ３月対象外.<p>
	 *
	 */
	public boolean mon03_invalid_flg() {
		return getConstBoolean(offset + 99, $mon03_invalid_flg);
	}

	/**
	 * Not for Mar. ３月対象外.<p>
	 *
	 */
	public void mon03_invalid_flg(boolean value) {
		setConstBoolean(offset + 99, $mon03_invalid_flg, value);
	}


	/**
	 * Not for Apr. ４月対象外.<p>
	 *
	 */
	public boolean mon04_invalid_flg() {
		return getConstBoolean(offset + 100, $mon04_invalid_flg);
	}

	/**
	 * Not for Apr. ４月対象外.<p>
	 *
	 */
	public void mon04_invalid_flg(boolean value) {
		setConstBoolean(offset + 100, $mon04_invalid_flg, value);
	}


	/**
	 * Not for May ５月対象外.<p>
	 *
	 */
	public boolean mon05_invalid_flg() {
		return getConstBoolean(offset + 101, $mon05_invalid_flg);
	}

	/**
	 * Not for May ５月対象外.<p>
	 *
	 */
	public void mon05_invalid_flg(boolean value) {
		setConstBoolean(offset + 101, $mon05_invalid_flg, value);
	}


	/**
	 * Not for Jun. ６月対象外.<p>
	 *
	 */
	public boolean mon06_invalid_flg() {
		return getConstBoolean(offset + 102, $mon06_invalid_flg);
	}

	/**
	 * Not for Jun. ６月対象外.<p>
	 *
	 */
	public void mon06_invalid_flg(boolean value) {
		setConstBoolean(offset + 102, $mon06_invalid_flg, value);
	}


	/**
	 * Not for July ７月対象外.<p>
	 *
	 */
	public boolean mon07_invalid_flg() {
		return getConstBoolean(offset + 103, $mon07_invalid_flg);
	}

	/**
	 * Not for July ７月対象外.<p>
	 *
	 */
	public void mon07_invalid_flg(boolean value) {
		setConstBoolean(offset + 103, $mon07_invalid_flg, value);
	}


	/**
	 * Not for Aug. ８月対象外.<p>
	 *
	 */
	public boolean mon08_invalid_flg() {
		return getConstBoolean(offset + 104, $mon08_invalid_flg);
	}

	/**
	 * Not for Aug. ８月対象外.<p>
	 *
	 */
	public void mon08_invalid_flg(boolean value) {
		setConstBoolean(offset + 104, $mon08_invalid_flg, value);
	}


	/**
	 * Not for Sep. ９月対象外.<p>
	 *
	 */
	public boolean mon09_invalid_flg() {
		return getConstBoolean(offset + 105, $mon09_invalid_flg);
	}

	/**
	 * Not for Sep. ９月対象外.<p>
	 *
	 */
	public void mon09_invalid_flg(boolean value) {
		setConstBoolean(offset + 105, $mon09_invalid_flg, value);
	}


	/**
	 * Not for Oct. １０月対象外.<p>
	 *
	 */
	public boolean mon10_invalid_flg() {
		return getConstBoolean(offset + 106, $mon10_invalid_flg);
	}

	/**
	 * Not for Oct. １０月対象外.<p>
	 *
	 */
	public void mon10_invalid_flg(boolean value) {
		setConstBoolean(offset + 106, $mon10_invalid_flg, value);
	}


	/**
	 * Not for Nov. １１月対象外.<p>
	 *
	 */
	public boolean mon11_invalid_flg() {
		return getConstBoolean(offset + 107, $mon11_invalid_flg);
	}

	/**
	 * Not for Nov. １１月対象外.<p>
	 *
	 */
	public void mon11_invalid_flg(boolean value) {
		setConstBoolean(offset + 107, $mon11_invalid_flg, value);
	}


	/**
	 * Not for Dec. １２月対象外.<p>
	 *
	 */
	public boolean mon12_invalid_flg() {
		return getConstBoolean(offset + 108, $mon12_invalid_flg);
	}

	/**
	 * Not for Dec. １２月対象外.<p>
	 *
	 */
	public void mon12_invalid_flg(boolean value) {
		setConstBoolean(offset + 108, $mon12_invalid_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 109, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 109, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 110, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 110, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 111, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 111, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 112, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 112, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 113, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 113, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 114, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 114, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 115, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 115, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 116, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 116, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 117, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 117, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 118, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 118, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 119, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 119, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 120, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 120, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 120, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 120, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 120, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 120, $upd_cntr, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 121, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 121, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 122, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 122, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 123, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 123, $del_ts, value);
	}


	public String getString(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
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
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			return dr_dpt_typ();
		}
		if ($dr_dpt_typ_nm.equalsIgnoreCase(name)) {
			return dr_dpt_typ_nm();
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			return dr_dpt_cd();
		}
		if ($dr_dpt_nm.equalsIgnoreCase(name)) {
			return dr_dpt_nm();
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			return dr_ptn_typ();
		}
		if ($dr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return dr_ptn_typ_nm();
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			return dr_grp_cd();
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			return dr_grp_nm();
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			return dr_ac_cd();
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			return dr_ac_nm();
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			return dr_sub_ac_cd();
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			return dr_sub_ac_nm();
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			return dr_bp_typ();
		}
		if ($dr_bp_typ_nm.equalsIgnoreCase(name)) {
			return dr_bp_typ_nm();
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			return dr_bp_cd();
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			return dr_bp_nm();
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			return dr_ac_tax_cd();
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			return dr_ac_tax_nm();
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			return dr_itm_typ();
		}
		if ($dr_itm_typ_nm.equalsIgnoreCase(name)) {
			return dr_itm_typ_nm();
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			return dr_amt_typ();
		}
		if ($dr_amt_typ_nm.equalsIgnoreCase(name)) {
			return dr_amt_typ_nm();
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			return dr_abs_typ();
		}
		if ($dr_abs_typ_nm.equalsIgnoreCase(name)) {
			return dr_abs_typ_nm();
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			return dr_abstract();
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			return cr_dpt_typ();
		}
		if ($cr_dpt_typ_nm.equalsIgnoreCase(name)) {
			return cr_dpt_typ_nm();
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			return cr_dpt_cd();
		}
		if ($cr_dpt_nm.equalsIgnoreCase(name)) {
			return cr_dpt_nm();
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			return cr_ptn_typ();
		}
		if ($cr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return cr_ptn_typ_nm();
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			return cr_grp_cd();
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			return cr_grp_nm();
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			return cr_ac_cd();
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			return cr_ac_nm();
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			return cr_sub_ac_cd();
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			return cr_sub_ac_nm();
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			return cr_bp_typ();
		}
		if ($cr_bp_typ_nm.equalsIgnoreCase(name)) {
			return cr_bp_typ_nm();
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			return cr_bp_cd();
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			return cr_bp_nm();
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			return cr_ac_tax_cd();
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			return cr_ac_tax_nm();
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			return cr_itm_typ();
		}
		if ($cr_itm_typ_nm.equalsIgnoreCase(name)) {
			return cr_itm_typ_nm();
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			return cr_amt_typ();
		}
		if ($cr_amt_typ_nm.equalsIgnoreCase(name)) {
			return cr_amt_typ_nm();
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			return cr_abs_typ();
		}
		if ($cr_abs_typ_nm.equalsIgnoreCase(name)) {
			return cr_abs_typ_nm();
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			return cr_abstract();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			return purc_typ_nm();
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			return un_fix_typ();
		}
		if ($un_fix_typ_nm.equalsIgnoreCase(name)) {
			return un_fix_typ_nm();
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			return foreign_typ();
		}
		if ($foreign_typ_nm.equalsIgnoreCase(name)) {
			return foreign_typ_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			return inv_loc_typ();
		}
		if ($inv_loc_typ_nm.equalsIgnoreCase(name)) {
			return inv_loc_typ_nm();
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			return amt_sign_typ();
		}
		if ($amt_sign_typ_nm.equalsIgnoreCase(name)) {
			return amt_sign_typ_nm();
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			return jnl_key1();
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			return jnl_key2();
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			return jnl_key3();
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			return jnl_key4();
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			return jnl_key5();
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			return jnl_key6();
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			return jnl_key7();
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			return jnl_key8();
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			return jnl_key9();
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			return jnl_key10();
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
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
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
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			return dr_trd_sml_flg();
		}
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			return dr_sub_flg();
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			return dr_bp_flg();
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			return cr_trd_sml_flg();
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			return cr_sub_flg();
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			return cr_bp_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			return mon01_invalid_flg();
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			return mon02_invalid_flg();
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			return mon03_invalid_flg();
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			return mon04_invalid_flg();
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			return mon05_invalid_flg();
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			return mon06_invalid_flg();
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			return mon07_invalid_flg();
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			return mon08_invalid_flg();
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			return mon09_invalid_flg();
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			return mon10_invalid_flg();
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			return mon11_invalid_flg();
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			return mon12_invalid_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
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
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			return dr_dpt_typ();
		}
		if ($dr_dpt_typ_nm.equalsIgnoreCase(name)) {
			return dr_dpt_typ_nm();
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			return dr_dpt_cd();
		}
		if ($dr_dpt_nm.equalsIgnoreCase(name)) {
			return dr_dpt_nm();
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			return dr_ptn_typ();
		}
		if ($dr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return dr_ptn_typ_nm();
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			return dr_grp_cd();
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			return dr_grp_nm();
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			return dr_ac_cd();
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			return dr_ac_nm();
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			return dr_sub_ac_cd();
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			return dr_sub_ac_nm();
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			return dr_bp_typ();
		}
		if ($dr_bp_typ_nm.equalsIgnoreCase(name)) {
			return dr_bp_typ_nm();
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			return dr_bp_cd();
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			return dr_bp_nm();
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			return dr_ac_tax_cd();
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			return dr_ac_tax_nm();
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			return dr_itm_typ();
		}
		if ($dr_itm_typ_nm.equalsIgnoreCase(name)) {
			return dr_itm_typ_nm();
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			return dr_amt_typ();
		}
		if ($dr_amt_typ_nm.equalsIgnoreCase(name)) {
			return dr_amt_typ_nm();
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			return dr_abs_typ();
		}
		if ($dr_abs_typ_nm.equalsIgnoreCase(name)) {
			return dr_abs_typ_nm();
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			return dr_abstract();
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			return cr_dpt_typ();
		}
		if ($cr_dpt_typ_nm.equalsIgnoreCase(name)) {
			return cr_dpt_typ_nm();
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			return cr_dpt_cd();
		}
		if ($cr_dpt_nm.equalsIgnoreCase(name)) {
			return cr_dpt_nm();
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			return cr_ptn_typ();
		}
		if ($cr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return cr_ptn_typ_nm();
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			return cr_grp_cd();
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			return cr_grp_nm();
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			return cr_ac_cd();
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			return cr_ac_nm();
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			return cr_sub_ac_cd();
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			return cr_sub_ac_nm();
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			return cr_bp_typ();
		}
		if ($cr_bp_typ_nm.equalsIgnoreCase(name)) {
			return cr_bp_typ_nm();
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			return cr_bp_cd();
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			return cr_bp_nm();
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			return cr_ac_tax_cd();
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			return cr_ac_tax_nm();
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			return cr_itm_typ();
		}
		if ($cr_itm_typ_nm.equalsIgnoreCase(name)) {
			return cr_itm_typ_nm();
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			return cr_amt_typ();
		}
		if ($cr_amt_typ_nm.equalsIgnoreCase(name)) {
			return cr_amt_typ_nm();
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			return cr_abs_typ();
		}
		if ($cr_abs_typ_nm.equalsIgnoreCase(name)) {
			return cr_abs_typ_nm();
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			return cr_abstract();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			return purc_typ();
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			return purc_typ_nm();
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			return un_fix_typ();
		}
		if ($un_fix_typ_nm.equalsIgnoreCase(name)) {
			return un_fix_typ_nm();
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			return foreign_typ();
		}
		if ($foreign_typ_nm.equalsIgnoreCase(name)) {
			return foreign_typ_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			return inv_loc_typ();
		}
		if ($inv_loc_typ_nm.equalsIgnoreCase(name)) {
			return inv_loc_typ_nm();
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			return amt_sign_typ();
		}
		if ($amt_sign_typ_nm.equalsIgnoreCase(name)) {
			return amt_sign_typ_nm();
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			return jnl_key1();
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			return jnl_key2();
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			return jnl_key3();
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			return jnl_key4();
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			return jnl_key5();
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			return jnl_key6();
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			return jnl_key7();
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			return jnl_key8();
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			return jnl_key9();
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			return jnl_key10();
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
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
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
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			return dr_trd_sml_flg();
		}
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			return dr_sub_flg();
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			return dr_bp_flg();
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			return cr_trd_sml_flg();
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			return cr_sub_flg();
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			return cr_bp_flg();
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			return minus_flg();
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			return carry_flg();
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			return mon01_invalid_flg();
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			return mon02_invalid_flg();
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			return mon03_invalid_flg();
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			return mon04_invalid_flg();
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			return mon05_invalid_flg();
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			return mon06_invalid_flg();
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			return mon07_invalid_flg();
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			return mon08_invalid_flg();
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			return mon09_invalid_flg();
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			return mon10_invalid_flg();
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			return mon11_invalid_flg();
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			return mon12_invalid_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
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
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			dr_dpt_typ(value);
			return;
		}
		if ($dr_dpt_typ_nm.equalsIgnoreCase(name)) {
			dr_dpt_typ_nm(value);
			return;
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			dr_dpt_cd(value);
			return;
		}
		if ($dr_dpt_nm.equalsIgnoreCase(name)) {
			dr_dpt_nm(value);
			return;
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			dr_ptn_typ(value);
			return;
		}
		if ($dr_ptn_typ_nm.equalsIgnoreCase(name)) {
			dr_ptn_typ_nm(value);
			return;
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			dr_grp_cd(value);
			return;
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			dr_grp_nm(value);
			return;
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			dr_ac_cd(value);
			return;
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			dr_ac_nm(value);
			return;
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			dr_sub_ac_cd(value);
			return;
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			dr_sub_ac_nm(value);
			return;
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			dr_bp_typ(value);
			return;
		}
		if ($dr_bp_typ_nm.equalsIgnoreCase(name)) {
			dr_bp_typ_nm(value);
			return;
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			dr_bp_cd(value);
			return;
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			dr_bp_nm(value);
			return;
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			dr_ac_tax_cd(value);
			return;
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			dr_ac_tax_nm(value);
			return;
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			dr_itm_typ(value);
			return;
		}
		if ($dr_itm_typ_nm.equalsIgnoreCase(name)) {
			dr_itm_typ_nm(value);
			return;
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			dr_amt_typ(value);
			return;
		}
		if ($dr_amt_typ_nm.equalsIgnoreCase(name)) {
			dr_amt_typ_nm(value);
			return;
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			dr_abs_typ(value);
			return;
		}
		if ($dr_abs_typ_nm.equalsIgnoreCase(name)) {
			dr_abs_typ_nm(value);
			return;
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			dr_abstract(value);
			return;
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			cr_dpt_typ(value);
			return;
		}
		if ($cr_dpt_typ_nm.equalsIgnoreCase(name)) {
			cr_dpt_typ_nm(value);
			return;
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			cr_dpt_cd(value);
			return;
		}
		if ($cr_dpt_nm.equalsIgnoreCase(name)) {
			cr_dpt_nm(value);
			return;
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			cr_ptn_typ(value);
			return;
		}
		if ($cr_ptn_typ_nm.equalsIgnoreCase(name)) {
			cr_ptn_typ_nm(value);
			return;
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			cr_grp_cd(value);
			return;
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			cr_grp_nm(value);
			return;
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			cr_ac_cd(value);
			return;
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			cr_ac_nm(value);
			return;
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			cr_sub_ac_cd(value);
			return;
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			cr_sub_ac_nm(value);
			return;
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			cr_bp_typ(value);
			return;
		}
		if ($cr_bp_typ_nm.equalsIgnoreCase(name)) {
			cr_bp_typ_nm(value);
			return;
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			cr_bp_cd(value);
			return;
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			cr_bp_nm(value);
			return;
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			cr_ac_tax_cd(value);
			return;
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			cr_ac_tax_nm(value);
			return;
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			cr_itm_typ(value);
			return;
		}
		if ($cr_itm_typ_nm.equalsIgnoreCase(name)) {
			cr_itm_typ_nm(value);
			return;
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			cr_amt_typ(value);
			return;
		}
		if ($cr_amt_typ_nm.equalsIgnoreCase(name)) {
			cr_amt_typ_nm(value);
			return;
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			cr_abs_typ(value);
			return;
		}
		if ($cr_abs_typ_nm.equalsIgnoreCase(name)) {
			cr_abs_typ_nm(value);
			return;
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			cr_abstract(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			purc_typ_nm(value);
			return;
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			un_fix_typ(value);
			return;
		}
		if ($un_fix_typ_nm.equalsIgnoreCase(name)) {
			un_fix_typ_nm(value);
			return;
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			foreign_typ(value);
			return;
		}
		if ($foreign_typ_nm.equalsIgnoreCase(name)) {
			foreign_typ_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			inv_loc_typ(value);
			return;
		}
		if ($inv_loc_typ_nm.equalsIgnoreCase(name)) {
			inv_loc_typ_nm(value);
			return;
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			amt_sign_typ(value);
			return;
		}
		if ($amt_sign_typ_nm.equalsIgnoreCase(name)) {
			amt_sign_typ_nm(value);
			return;
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			jnl_key1(value);
			return;
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			jnl_key2(value);
			return;
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			jnl_key3(value);
			return;
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			jnl_key4(value);
			return;
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			jnl_key5(value);
			return;
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			jnl_key6(value);
			return;
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			jnl_key7(value);
			return;
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			jnl_key8(value);
			return;
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			jnl_key9(value);
			return;
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			jnl_key10(value);
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
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
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
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			dr_trd_sml_flg(value);
			return;
		}
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			dr_sub_flg(value);
			return;
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			dr_bp_flg(value);
			return;
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			cr_trd_sml_flg(value);
			return;
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			cr_sub_flg(value);
			return;
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			cr_bp_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			mon01_invalid_flg(value);
			return;
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			mon02_invalid_flg(value);
			return;
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			mon03_invalid_flg(value);
			return;
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			mon04_invalid_flg(value);
			return;
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			mon05_invalid_flg(value);
			return;
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			mon06_invalid_flg(value);
			return;
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			mon07_invalid_flg(value);
			return;
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			mon08_invalid_flg(value);
			return;
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			mon09_invalid_flg(value);
			return;
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			mon10_invalid_flg(value);
			return;
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			mon11_invalid_flg(value);
			return;
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			mon12_invalid_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
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
		if ($dr_dpt_typ.equalsIgnoreCase(name)) {
			dr_dpt_typ(value);
			return;
		}
		if ($dr_dpt_typ_nm.equalsIgnoreCase(name)) {
			dr_dpt_typ_nm(value);
			return;
		}
		if ($dr_dpt_cd.equalsIgnoreCase(name)) {
			dr_dpt_cd(value);
			return;
		}
		if ($dr_dpt_nm.equalsIgnoreCase(name)) {
			dr_dpt_nm(value);
			return;
		}
		if ($dr_ptn_typ.equalsIgnoreCase(name)) {
			dr_ptn_typ(value);
			return;
		}
		if ($dr_ptn_typ_nm.equalsIgnoreCase(name)) {
			dr_ptn_typ_nm(value);
			return;
		}
		if ($dr_grp_cd.equalsIgnoreCase(name)) {
			dr_grp_cd(value);
			return;
		}
		if ($dr_grp_nm.equalsIgnoreCase(name)) {
			dr_grp_nm(value);
			return;
		}
		if ($dr_ac_cd.equalsIgnoreCase(name)) {
			dr_ac_cd(value);
			return;
		}
		if ($dr_ac_nm.equalsIgnoreCase(name)) {
			dr_ac_nm(value);
			return;
		}
		if ($dr_sub_ac_cd.equalsIgnoreCase(name)) {
			dr_sub_ac_cd(value);
			return;
		}
		if ($dr_sub_ac_nm.equalsIgnoreCase(name)) {
			dr_sub_ac_nm(value);
			return;
		}
		if ($dr_bp_typ.equalsIgnoreCase(name)) {
			dr_bp_typ(value);
			return;
		}
		if ($dr_bp_typ_nm.equalsIgnoreCase(name)) {
			dr_bp_typ_nm(value);
			return;
		}
		if ($dr_bp_cd.equalsIgnoreCase(name)) {
			dr_bp_cd(value);
			return;
		}
		if ($dr_bp_nm.equalsIgnoreCase(name)) {
			dr_bp_nm(value);
			return;
		}
		if ($dr_ac_tax_cd.equalsIgnoreCase(name)) {
			dr_ac_tax_cd(value);
			return;
		}
		if ($dr_ac_tax_nm.equalsIgnoreCase(name)) {
			dr_ac_tax_nm(value);
			return;
		}
		if ($dr_itm_typ.equalsIgnoreCase(name)) {
			dr_itm_typ(value);
			return;
		}
		if ($dr_itm_typ_nm.equalsIgnoreCase(name)) {
			dr_itm_typ_nm(value);
			return;
		}
		if ($dr_amt_typ.equalsIgnoreCase(name)) {
			dr_amt_typ(value);
			return;
		}
		if ($dr_amt_typ_nm.equalsIgnoreCase(name)) {
			dr_amt_typ_nm(value);
			return;
		}
		if ($dr_abs_typ.equalsIgnoreCase(name)) {
			dr_abs_typ(value);
			return;
		}
		if ($dr_abs_typ_nm.equalsIgnoreCase(name)) {
			dr_abs_typ_nm(value);
			return;
		}
		if ($dr_abstract.equalsIgnoreCase(name)) {
			dr_abstract(value);
			return;
		}
		if ($cr_dpt_typ.equalsIgnoreCase(name)) {
			cr_dpt_typ(value);
			return;
		}
		if ($cr_dpt_typ_nm.equalsIgnoreCase(name)) {
			cr_dpt_typ_nm(value);
			return;
		}
		if ($cr_dpt_cd.equalsIgnoreCase(name)) {
			cr_dpt_cd(value);
			return;
		}
		if ($cr_dpt_nm.equalsIgnoreCase(name)) {
			cr_dpt_nm(value);
			return;
		}
		if ($cr_ptn_typ.equalsIgnoreCase(name)) {
			cr_ptn_typ(value);
			return;
		}
		if ($cr_ptn_typ_nm.equalsIgnoreCase(name)) {
			cr_ptn_typ_nm(value);
			return;
		}
		if ($cr_grp_cd.equalsIgnoreCase(name)) {
			cr_grp_cd(value);
			return;
		}
		if ($cr_grp_nm.equalsIgnoreCase(name)) {
			cr_grp_nm(value);
			return;
		}
		if ($cr_ac_cd.equalsIgnoreCase(name)) {
			cr_ac_cd(value);
			return;
		}
		if ($cr_ac_nm.equalsIgnoreCase(name)) {
			cr_ac_nm(value);
			return;
		}
		if ($cr_sub_ac_cd.equalsIgnoreCase(name)) {
			cr_sub_ac_cd(value);
			return;
		}
		if ($cr_sub_ac_nm.equalsIgnoreCase(name)) {
			cr_sub_ac_nm(value);
			return;
		}
		if ($cr_bp_typ.equalsIgnoreCase(name)) {
			cr_bp_typ(value);
			return;
		}
		if ($cr_bp_typ_nm.equalsIgnoreCase(name)) {
			cr_bp_typ_nm(value);
			return;
		}
		if ($cr_bp_cd.equalsIgnoreCase(name)) {
			cr_bp_cd(value);
			return;
		}
		if ($cr_bp_nm.equalsIgnoreCase(name)) {
			cr_bp_nm(value);
			return;
		}
		if ($cr_ac_tax_cd.equalsIgnoreCase(name)) {
			cr_ac_tax_cd(value);
			return;
		}
		if ($cr_ac_tax_nm.equalsIgnoreCase(name)) {
			cr_ac_tax_nm(value);
			return;
		}
		if ($cr_itm_typ.equalsIgnoreCase(name)) {
			cr_itm_typ(value);
			return;
		}
		if ($cr_itm_typ_nm.equalsIgnoreCase(name)) {
			cr_itm_typ_nm(value);
			return;
		}
		if ($cr_amt_typ.equalsIgnoreCase(name)) {
			cr_amt_typ(value);
			return;
		}
		if ($cr_amt_typ_nm.equalsIgnoreCase(name)) {
			cr_amt_typ_nm(value);
			return;
		}
		if ($cr_abs_typ.equalsIgnoreCase(name)) {
			cr_abs_typ(value);
			return;
		}
		if ($cr_abs_typ_nm.equalsIgnoreCase(name)) {
			cr_abs_typ_nm(value);
			return;
		}
		if ($cr_abstract.equalsIgnoreCase(name)) {
			cr_abstract(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($purc_typ.equalsIgnoreCase(name)) {
			purc_typ(value);
			return;
		}
		if ($purc_typ_nm.equalsIgnoreCase(name)) {
			purc_typ_nm(value);
			return;
		}
		if ($un_fix_typ.equalsIgnoreCase(name)) {
			un_fix_typ(value);
			return;
		}
		if ($un_fix_typ_nm.equalsIgnoreCase(name)) {
			un_fix_typ_nm(value);
			return;
		}
		if ($foreign_typ.equalsIgnoreCase(name)) {
			foreign_typ(value);
			return;
		}
		if ($foreign_typ_nm.equalsIgnoreCase(name)) {
			foreign_typ_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($inv_loc_typ.equalsIgnoreCase(name)) {
			inv_loc_typ(value);
			return;
		}
		if ($inv_loc_typ_nm.equalsIgnoreCase(name)) {
			inv_loc_typ_nm(value);
			return;
		}
		if ($amt_sign_typ.equalsIgnoreCase(name)) {
			amt_sign_typ(value);
			return;
		}
		if ($amt_sign_typ_nm.equalsIgnoreCase(name)) {
			amt_sign_typ_nm(value);
			return;
		}
		if ($jnl_key1.equalsIgnoreCase(name)) {
			jnl_key1(value);
			return;
		}
		if ($jnl_key2.equalsIgnoreCase(name)) {
			jnl_key2(value);
			return;
		}
		if ($jnl_key3.equalsIgnoreCase(name)) {
			jnl_key3(value);
			return;
		}
		if ($jnl_key4.equalsIgnoreCase(name)) {
			jnl_key4(value);
			return;
		}
		if ($jnl_key5.equalsIgnoreCase(name)) {
			jnl_key5(value);
			return;
		}
		if ($jnl_key6.equalsIgnoreCase(name)) {
			jnl_key6(value);
			return;
		}
		if ($jnl_key7.equalsIgnoreCase(name)) {
			jnl_key7(value);
			return;
		}
		if ($jnl_key8.equalsIgnoreCase(name)) {
			jnl_key8(value);
			return;
		}
		if ($jnl_key9.equalsIgnoreCase(name)) {
			jnl_key9(value);
			return;
		}
		if ($jnl_key10.equalsIgnoreCase(name)) {
			jnl_key10(value);
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
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
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
		if ($dr_trd_sml_flg.equalsIgnoreCase(name)) {
			dr_trd_sml_flg(value);
			return;
		}
		if ($dr_sub_flg.equalsIgnoreCase(name)) {
			dr_sub_flg(value);
			return;
		}
		if ($dr_bp_flg.equalsIgnoreCase(name)) {
			dr_bp_flg(value);
			return;
		}
		if ($cr_trd_sml_flg.equalsIgnoreCase(name)) {
			cr_trd_sml_flg(value);
			return;
		}
		if ($cr_sub_flg.equalsIgnoreCase(name)) {
			cr_sub_flg(value);
			return;
		}
		if ($cr_bp_flg.equalsIgnoreCase(name)) {
			cr_bp_flg(value);
			return;
		}
		if ($minus_flg.equalsIgnoreCase(name)) {
			minus_flg(value);
			return;
		}
		if ($carry_flg.equalsIgnoreCase(name)) {
			carry_flg(value);
			return;
		}
		if ($mon01_invalid_flg.equalsIgnoreCase(name)) {
			mon01_invalid_flg(value);
			return;
		}
		if ($mon02_invalid_flg.equalsIgnoreCase(name)) {
			mon02_invalid_flg(value);
			return;
		}
		if ($mon03_invalid_flg.equalsIgnoreCase(name)) {
			mon03_invalid_flg(value);
			return;
		}
		if ($mon04_invalid_flg.equalsIgnoreCase(name)) {
			mon04_invalid_flg(value);
			return;
		}
		if ($mon05_invalid_flg.equalsIgnoreCase(name)) {
			mon05_invalid_flg(value);
			return;
		}
		if ($mon06_invalid_flg.equalsIgnoreCase(name)) {
			mon06_invalid_flg(value);
			return;
		}
		if ($mon07_invalid_flg.equalsIgnoreCase(name)) {
			mon07_invalid_flg(value);
			return;
		}
		if ($mon08_invalid_flg.equalsIgnoreCase(name)) {
			mon08_invalid_flg(value);
			return;
		}
		if ($mon09_invalid_flg.equalsIgnoreCase(name)) {
			mon09_invalid_flg(value);
			return;
		}
		if ($mon10_invalid_flg.equalsIgnoreCase(name)) {
			mon10_invalid_flg(value);
			return;
		}
		if ($mon11_invalid_flg.equalsIgnoreCase(name)) {
			mon11_invalid_flg(value);
			return;
		}
		if ($mon12_invalid_flg.equalsIgnoreCase(name)) {
			mon12_invalid_flg(value);
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
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

