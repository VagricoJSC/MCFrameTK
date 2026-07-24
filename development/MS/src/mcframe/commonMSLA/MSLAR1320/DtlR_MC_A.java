package mcframe.commonMSLA.MSLAR1320;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 *  データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public static final String $trd_typ_cd = "trd_typ_cd";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 *  検査開始日.<p>
	 *
	 */
	public static final String $st_act_dt = "st_act_dt";
	/**
	 *  検査開始時刻.<p>
	 *
	 */
	public static final String $st_act_hm = "st_act_hm";
	/**
	 *  検査終了日.<p>
	 *
	 */
	public static final String $end_act_dt = "end_act_dt";
	/**
	 *  検査終了時刻.<p>
	 *
	 */
	public static final String $end_act_hm = "end_act_hm";
	/**
	 *  実施担当者ＣＤ.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 *  実施担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 *  実施担当部門ＣＤ.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 *  実施担当部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 *  良品区分（抜取）.<p>
	 *
	 */
	public static final String $smpl_quality_typ = "smpl_quality_typ";
	/**
	 *  格付ＣＤ（抜取）.<p>
	 *
	 */
	public static final String $smpl_gd_cd = "smpl_gd_cd";
	/**
	 *  格付名（抜取）.<p>
	 *
	 */
	public static final String $smpl_gd_nm = "smpl_gd_nm";
	/**
	 *  不良理由ＣＤ（抜取）.<p>
	 *
	 */
	public static final String $smpl_dfct_rsn_cd = "smpl_dfct_rsn_cd";
	/**
	 *  不良理由名（抜取）.<p>
	 *
	 */
	public static final String $smpl_dfct_rsn_nm = "smpl_dfct_rsn_nm";
	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 *  有効期限更新ＦＬＧ.<p>
	 *
	 */
	public static final String $vld_dt_upd_flg = "vld_dt_upd_flg";
	/**
	 *  起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 *  有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 *  使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 *  内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 *  ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 *  判定のみ取込ＦＬＧ.<p>
	 *
	 */
	public static final String $imp_only_judg = "imp_only_judg";
	/**
	 *  検査判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 *  判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 *  判定者名.<p>
	 *
	 */
	public static final String $judg_usr_nm = "judg_usr_nm";
	/**
	 *  判定部門ＣＤ.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 *  判定部門名.<p>
	 *
	 */
	public static final String $judg_dpt_nm = "judg_dpt_nm";
	/**
	 *  判定理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 *  外部検査実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_no = "ext_insp_act_no";
	/**
	 *  検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 *  在庫場所ＣＤ.<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	/**
	 *  在庫場所名.<p>
	 *
	 */
	public static final String $stk_loc_nm = "stk_loc_nm";
	/**
	 *  在庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $stk_str_ln_cd = "stk_str_ln_cd";
	/**
	 *  在庫棚・ライン名.<p>
	 *
	 */
	public static final String $stk_str_ln_nm = "stk_str_ln_nm";
	/**
	 *  良品区分（全数）.<p>
	 *
	 */
	public static final String $ttl_quality_typ = "ttl_quality_typ";
	/**
	 *  格付ＣＤ（全数）.<p>
	 *
	 */
	public static final String $ttl_gd_cd = "ttl_gd_cd";
	/**
	 *  格付名（全数）.<p>
	 *
	 */
	public static final String $ttl_gd_nm = "ttl_gd_nm";
	/**
	 *  不良理由ＣＤ（全数）.<p>
	 *
	 */
	public static final String $ttl_dfct_rsn_cd = "ttl_dfct_rsn_cd";
	/**
	 *  不良理由名（全数）.<p>
	 *
	 */
	public static final String $ttl_dfct_rsn_nm = "ttl_dfct_rsn_nm";
	/**
	 *  実績日（全数）.<p>
	 *
	 */
	public static final String $ttl_act_dt = "ttl_act_dt";
	/**
	 *  実績時刻（全数）.<p>
	 *
	 */
	public static final String $ttl_act_hm = "ttl_act_hm";
	/**
	 *  基準ＦＬＧ.<p>
	 *
	 */
	public static final String $base_flg = "base_flg";
	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public static final String $pack_unit_qty = "pack_unit_qty";
	/**
	 *  荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 *  荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public static final String $ttl_pack_xfr_pack_unit_qty = "ttl_pack_xfr_pack_unit_qty";
	/**
	 *  荷姿振替荷姿単位ＣＤ（全数）.<p>
	 *
	 */
	public static final String $ttl_pack_xfr_pack_unit_cd = "ttl_pack_xfr_pack_unit_cd";
	/**
	 *  荷姿振替荷姿単位名（全数）.<p>
	 *
	 */
	public static final String $ttl_pack_xfr_pack_unit_nm = "ttl_pack_xfr_pack_unit_nm";
	/**
	 *  内部備考（全数）.<p>
	 *
	 */
	public static final String $ttl_intr_rmrks = "ttl_intr_rmrks";
	/**
	 *  外部検査実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_d_no = "ext_insp_act_d_no";
	/**
	 *  引落数量.<p>
	 *
	 */
	public static final String $so_qty = "so_qty";
	/**
	 *  抜取数量.<p>
	 *
	 */
	public static final String $smpl_qty = "smpl_qty";
	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public static final String $smpl_pack_xfr_pack_unit_qty = "smpl_pack_xfr_pack_unit_qty";
	/**
	 *  荷姿振替荷姿単位ＣＤ（抜取）.<p>
	 *
	 */
	public static final String $smpl_pack_xfr_pack_unit_cd = "smpl_pack_xfr_pack_unit_cd";
	/**
	 *  荷姿振替荷姿単位名（抜取）.<p>
	 *
	 */
	public static final String $smpl_pack_xfr_pack_unit_nm = "smpl_pack_xfr_pack_unit_nm";
	/**
	 *  実績日（抜取）.<p>
	 *
	 */
	public static final String $smpl_act_dt = "smpl_act_dt";
	/**
	 *  実績時刻（抜取）.<p>
	 *
	 */
	public static final String $smpl_act_hm = "smpl_act_hm";
	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 *  負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 *  取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 *  内部備考（抜取）.<p>
	 *
	 */
	public static final String $smpl_intr_rmrks = "smpl_intr_rmrks";
	/**
	 *  外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_smpl_act_no = "ext_insp_smpl_act_no";
	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";


	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta trd_typ_cd_META = createCommonMeta($trd_typ_cd, mcframe.commonMA.meta.MA_META.IF_TRD_TYP_CD);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta st_act_dt_META = createCommonMeta($st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_act_hm_META = createCommonMeta($st_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_act_dt_META = createCommonMeta($end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_act_hm_META = createCommonMeta($end_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta smpl_quality_typ_META = createCommonMeta($smpl_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta smpl_gd_cd_META = createCommonMeta($smpl_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta smpl_gd_nm_META = createCommonMeta($smpl_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta smpl_dfct_rsn_cd_META = createCommonMeta($smpl_dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta smpl_dfct_rsn_nm_META = createCommonMeta($smpl_dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta vld_dt_upd_flg_META = createCommonMeta($vld_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_INST_INTR_RMRKS);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta imp_only_judg_META = createCommonMeta($imp_only_judg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_usr_nm_META = createCommonMeta($judg_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_dpt_nm_META = createCommonMeta($judg_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSN);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta stk_loc_nm_META = createCommonMeta($stk_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta stk_str_ln_cd_META = createCommonMeta($stk_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta stk_str_ln_nm_META = createCommonMeta($stk_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ttl_quality_typ_META = createCommonMeta($ttl_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta ttl_gd_cd_META = createCommonMeta($ttl_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta ttl_gd_nm_META = createCommonMeta($ttl_gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta ttl_dfct_rsn_cd_META = createCommonMeta($ttl_dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta ttl_dfct_rsn_nm_META = createCommonMeta($ttl_dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ttl_act_dt_META = createCommonMeta($ttl_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ttl_act_hm_META = createCommonMeta($ttl_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta base_flg_META = createCommonMeta($base_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pack_unit_qty_META = createCommonMeta($pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ttl_pack_xfr_pack_unit_qty_META = createCommonMeta($ttl_pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ttl_pack_xfr_pack_unit_cd_META = createCommonMeta($ttl_pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta ttl_pack_xfr_pack_unit_nm_META = createCommonMeta($ttl_pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ttl_intr_rmrks_META = createCommonMeta($ttl_intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_INST_INTR_RMRKS);
	public static final MCMeta ext_insp_act_d_no_META = createCommonMeta($ext_insp_act_d_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_D_NO);
	public static final MCMeta so_qty_META = createCommonMeta($so_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_qty_META = createCommonMeta($smpl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_pack_xfr_pack_unit_qty_META = createCommonMeta($smpl_pack_xfr_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_pack_xfr_pack_unit_cd_META = createCommonMeta($smpl_pack_xfr_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta smpl_pack_xfr_pack_unit_nm_META = createCommonMeta($smpl_pack_xfr_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta smpl_act_dt_META = createCommonMeta($smpl_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta smpl_act_hm_META = createCommonMeta($smpl_act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_TRD_RMRKS);
	public static final MCMeta smpl_intr_rmrks_META = createCommonMeta($smpl_intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_SMPL_ACT_INTR_RMRKS);
	public static final MCMeta ext_insp_smpl_act_no_META = createCommonMeta($ext_insp_smpl_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_SMPL_ACT_NO);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			trd_typ_cd_META,
			data_make_dt_META,
			data_crud_typ_META,
			insp_no_META,
			st_act_dt_META,
			st_act_hm_META,
			end_act_dt_META,
			end_act_hm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			smpl_quality_typ_META,
			smpl_gd_cd_META,
			smpl_gd_nm_META,
			smpl_dfct_rsn_cd_META,
			smpl_dfct_rsn_nm_META,
			act_cont_fctr_META,
			vld_dt_upd_flg_META,
			lmt_dt_frm_META,
			vld_dt_META,
			lmt_dt_META,
			intr_rmrks_META,
			lot_rmrks_META,
			imp_only_judg_META,
			insp_judg_rslt_typ_META,
			judg_dt_META,
			judg_usr_cd_META,
			judg_usr_nm_META,
			judg_dpt_cd_META,
			judg_dpt_nm_META,
			judg_rsn_META,
			ext_insp_act_no_META,
			insp_schd_no_META,
			stk_loc_cd_META,
			stk_loc_nm_META,
			stk_str_ln_cd_META,
			stk_str_ln_nm_META,
			ttl_quality_typ_META,
			ttl_gd_cd_META,
			ttl_gd_nm_META,
			ttl_dfct_rsn_cd_META,
			ttl_dfct_rsn_nm_META,
			ttl_act_dt_META,
			ttl_act_hm_META,
			base_flg_META,
			pack_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			ttl_pack_xfr_pack_unit_qty_META,
			ttl_pack_xfr_pack_unit_cd_META,
			ttl_pack_xfr_pack_unit_nm_META,
			ttl_intr_rmrks_META,
			ext_insp_act_d_no_META,
			so_qty_META,
			smpl_qty_META,
			smpl_pack_xfr_pack_unit_qty_META,
			smpl_pack_xfr_pack_unit_cd_META,
			smpl_pack_xfr_pack_unit_nm_META,
			smpl_act_dt_META,
			smpl_act_hm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			trd_rmrks_META,
			smpl_intr_rmrks_META,
			ext_insp_smpl_act_no_META,
			co_cd_META,
			co_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	/**
	 *  データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}


	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public String trd_typ_cd() {
		return getConstString(offset + 2, $trd_typ_cd);
	}

	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public void trd_typ_cd(String value) {
		setConstString(offset + 2, $trd_typ_cd, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 3, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 3, $data_make_dt, value);
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 5, $insp_no);
	}

	/**
	 *  検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 5, $insp_no, value);
	}


	/**
	 *  検査開始日.<p>
	 *
	 */
	public MCDate st_act_dt() {
		return getConstDate(offset + 6, $st_act_dt);
	}

	/**
	 *  検査開始日.<p>
	 *
	 */
	public void st_act_dt(MCDate value) {
		setConstDate(offset + 6, $st_act_dt, value);
	}


	/**
	 *  検査開始時刻.<p>
	 *
	 */
	public MCDate st_act_hm() {
		return getConstDate(offset + 7, $st_act_hm);
	}

	/**
	 *  検査開始時刻.<p>
	 *
	 */
	public void st_act_hm(MCDate value) {
		setConstDate(offset + 7, $st_act_hm, value);
	}


	/**
	 *  検査終了日.<p>
	 *
	 */
	public MCDate end_act_dt() {
		return getConstDate(offset + 8, $end_act_dt);
	}

	/**
	 *  検査終了日.<p>
	 *
	 */
	public void end_act_dt(MCDate value) {
		setConstDate(offset + 8, $end_act_dt, value);
	}


	/**
	 *  検査終了時刻.<p>
	 *
	 */
	public MCDate end_act_hm() {
		return getConstDate(offset + 9, $end_act_hm);
	}

	/**
	 *  検査終了時刻.<p>
	 *
	 */
	public void end_act_hm(MCDate value) {
		setConstDate(offset + 9, $end_act_hm, value);
	}


	/**
	 *  実施担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 10, $act_usr_cd);
	}

	/**
	 *  実施担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 10, $act_usr_cd, value);
	}


	/**
	 *  実施担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 11, $act_usr_nm);
	}

	/**
	 *  実施担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 11, $act_usr_nm, value);
	}


	/**
	 *  実施担当部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 12, $act_dpt_cd);
	}

	/**
	 *  実施担当部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 12, $act_dpt_cd, value);
	}


	/**
	 *  実施担当部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 13, $act_dpt_nm);
	}

	/**
	 *  実施担当部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 13, $act_dpt_nm, value);
	}


	/**
	 *  良品区分（抜取）.<p>
	 *
	 */
	public String smpl_quality_typ() {
		return getConstString(offset + 14, $smpl_quality_typ);
	}

	/**
	 *  良品区分（抜取）.<p>
	 *
	 */
	public void smpl_quality_typ(String value) {
		setConstString(offset + 14, $smpl_quality_typ, value);
	}


	/**
	 *  格付ＣＤ（抜取）.<p>
	 *
	 */
	public String smpl_gd_cd() {
		return getConstString(offset + 15, $smpl_gd_cd);
	}

	/**
	 *  格付ＣＤ（抜取）.<p>
	 *
	 */
	public void smpl_gd_cd(String value) {
		setConstString(offset + 15, $smpl_gd_cd, value);
	}


	/**
	 *  格付名（抜取）.<p>
	 *
	 */
	public String smpl_gd_nm() {
		return getConstString(offset + 16, $smpl_gd_nm);
	}

	/**
	 *  格付名（抜取）.<p>
	 *
	 */
	public void smpl_gd_nm(String value) {
		setConstString(offset + 16, $smpl_gd_nm, value);
	}


	/**
	 *  不良理由ＣＤ（抜取）.<p>
	 *
	 */
	public String smpl_dfct_rsn_cd() {
		return getConstString(offset + 17, $smpl_dfct_rsn_cd);
	}

	/**
	 *  不良理由ＣＤ（抜取）.<p>
	 *
	 */
	public void smpl_dfct_rsn_cd(String value) {
		setConstString(offset + 17, $smpl_dfct_rsn_cd, value);
	}


	/**
	 *  不良理由名（抜取）.<p>
	 *
	 */
	public String smpl_dfct_rsn_nm() {
		return getConstString(offset + 18, $smpl_dfct_rsn_nm);
	}

	/**
	 *  不良理由名（抜取）.<p>
	 *
	 */
	public void smpl_dfct_rsn_nm(String value) {
		setConstString(offset + 18, $smpl_dfct_rsn_nm, value);
	}


	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 19, $act_cont_fctr);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}

	/**
	 *  実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 19, $act_cont_fctr, value);
	}


	/**
	 *  有効期限更新ＦＬＧ.<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return getConstBoolean(offset + 20, $vld_dt_upd_flg);
	}

	/**
	 *  有効期限更新ＦＬＧ.<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 20, $vld_dt_upd_flg, value);
	}


	/**
	 *  起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 21, $lmt_dt_frm);
	}

	/**
	 *  起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 21, $lmt_dt_frm, value);
	}


	/**
	 *  有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 22, $vld_dt);
	}

	/**
	 *  有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 22, $vld_dt, value);
	}


	/**
	 *  使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 23, $lmt_dt);
	}

	/**
	 *  使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 23, $lmt_dt, value);
	}


	/**
	 *  内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 24, $intr_rmrks);
	}

	/**
	 *  内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 24, $intr_rmrks, value);
	}


	/**
	 *  ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 25, $lot_rmrks);
	}

	/**
	 *  ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 25, $lot_rmrks, value);
	}


	/**
	 *  判定のみ取込ＦＬＧ.<p>
	 *
	 */
	public boolean imp_only_judg() {
		return getConstBoolean(offset + 26, $imp_only_judg);
	}

	/**
	 *  判定のみ取込ＦＬＧ.<p>
	 *
	 */
	public void imp_only_judg(boolean value) {
		setConstBoolean(offset + 26, $imp_only_judg, value);
	}


	/**
	 *  検査判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 27, $insp_judg_rslt_typ);
	}

	/**
	 *  検査判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 27, $insp_judg_rslt_typ, value);
	}


	/**
	 *  判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 28, $judg_dt);
	}

	/**
	 *  判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 28, $judg_dt, value);
	}


	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 29, $judg_usr_cd);
	}

	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 29, $judg_usr_cd, value);
	}


	/**
	 *  判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return getConstString(offset + 30, $judg_usr_nm);
	}

	/**
	 *  判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		setConstString(offset + 30, $judg_usr_nm, value);
	}


	/**
	 *  判定部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 31, $judg_dpt_cd);
	}

	/**
	 *  判定部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 31, $judg_dpt_cd, value);
	}


	/**
	 *  判定部門名.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return getConstString(offset + 32, $judg_dpt_nm);
	}

	/**
	 *  判定部門名.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		setConstString(offset + 32, $judg_dpt_nm, value);
	}


	/**
	 *  判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 33, $judg_rsn);
	}

	/**
	 *  判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 33, $judg_rsn, value);
	}


	/**
	 *  外部検査実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 34, $ext_insp_act_no);
	}

	/**
	 *  外部検査実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 34, $ext_insp_act_no, value);
	}


	/**
	 *  検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 35, $insp_schd_no);
	}

	/**
	 *  検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 35, $insp_schd_no, value);
	}


	/**
	 *  在庫場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 36, $stk_loc_cd);
	}

	/**
	 *  在庫場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 36, $stk_loc_cd, value);
	}


	/**
	 *  在庫場所名.<p>
	 *
	 */
	public String stk_loc_nm() {
		return getConstString(offset + 37, $stk_loc_nm);
	}

	/**
	 *  在庫場所名.<p>
	 *
	 */
	public void stk_loc_nm(String value) {
		setConstString(offset + 37, $stk_loc_nm, value);
	}


	/**
	 *  在庫棚・ラインＣＤ.<p>
	 *
	 */
	public String stk_str_ln_cd() {
		return getConstString(offset + 38, $stk_str_ln_cd);
	}

	/**
	 *  在庫棚・ラインＣＤ.<p>
	 *
	 */
	public void stk_str_ln_cd(String value) {
		setConstString(offset + 38, $stk_str_ln_cd, value);
	}


	/**
	 *  在庫棚・ライン名.<p>
	 *
	 */
	public String stk_str_ln_nm() {
		return getConstString(offset + 39, $stk_str_ln_nm);
	}

	/**
	 *  在庫棚・ライン名.<p>
	 *
	 */
	public void stk_str_ln_nm(String value) {
		setConstString(offset + 39, $stk_str_ln_nm, value);
	}


	/**
	 *  良品区分（全数）.<p>
	 *
	 */
	public String ttl_quality_typ() {
		return getConstString(offset + 40, $ttl_quality_typ);
	}

	/**
	 *  良品区分（全数）.<p>
	 *
	 */
	public void ttl_quality_typ(String value) {
		setConstString(offset + 40, $ttl_quality_typ, value);
	}


	/**
	 *  格付ＣＤ（全数）.<p>
	 *
	 */
	public String ttl_gd_cd() {
		return getConstString(offset + 41, $ttl_gd_cd);
	}

	/**
	 *  格付ＣＤ（全数）.<p>
	 *
	 */
	public void ttl_gd_cd(String value) {
		setConstString(offset + 41, $ttl_gd_cd, value);
	}


	/**
	 *  格付名（全数）.<p>
	 *
	 */
	public String ttl_gd_nm() {
		return getConstString(offset + 42, $ttl_gd_nm);
	}

	/**
	 *  格付名（全数）.<p>
	 *
	 */
	public void ttl_gd_nm(String value) {
		setConstString(offset + 42, $ttl_gd_nm, value);
	}


	/**
	 *  不良理由ＣＤ（全数）.<p>
	 *
	 */
	public String ttl_dfct_rsn_cd() {
		return getConstString(offset + 43, $ttl_dfct_rsn_cd);
	}

	/**
	 *  不良理由ＣＤ（全数）.<p>
	 *
	 */
	public void ttl_dfct_rsn_cd(String value) {
		setConstString(offset + 43, $ttl_dfct_rsn_cd, value);
	}


	/**
	 *  不良理由名（全数）.<p>
	 *
	 */
	public String ttl_dfct_rsn_nm() {
		return getConstString(offset + 44, $ttl_dfct_rsn_nm);
	}

	/**
	 *  不良理由名（全数）.<p>
	 *
	 */
	public void ttl_dfct_rsn_nm(String value) {
		setConstString(offset + 44, $ttl_dfct_rsn_nm, value);
	}


	/**
	 *  実績日（全数）.<p>
	 *
	 */
	public MCDate ttl_act_dt() {
		return getConstDate(offset + 45, $ttl_act_dt);
	}

	/**
	 *  実績日（全数）.<p>
	 *
	 */
	public void ttl_act_dt(MCDate value) {
		setConstDate(offset + 45, $ttl_act_dt, value);
	}


	/**
	 *  実績時刻（全数）.<p>
	 *
	 */
	public MCDate ttl_act_hm() {
		return getConstDate(offset + 46, $ttl_act_hm);
	}

	/**
	 *  実績時刻（全数）.<p>
	 *
	 */
	public void ttl_act_hm(MCDate value) {
		setConstDate(offset + 46, $ttl_act_hm, value);
	}


	/**
	 *  基準ＦＬＧ.<p>
	 *
	 */
	public boolean base_flg() {
		return getConstBoolean(offset + 47, $base_flg);
	}

	/**
	 *  基準ＦＬＧ.<p>
	 *
	 */
	public void base_flg(boolean value) {
		setConstBoolean(offset + 47, $base_flg, value);
	}


	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return getConstNumber(offset + 48, $pack_unit_qty);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		setConstNumber(offset + 48, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		setConstNumber(offset + 48, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		setConstNumber(offset + 48, $pack_unit_qty, value);
	}

	/**
	 *  荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		setConstNumber(offset + 48, $pack_unit_qty, value);
	}


	/**
	 *  荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 49, $pack_unit_cd);
	}

	/**
	 *  荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 49, $pack_unit_cd, value);
	}


	/**
	 *  荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 50, $pack_unit_nm);
	}

	/**
	 *  荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 50, $pack_unit_nm, value);
	}


	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public MCNumber ttl_pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 51, $ttl_pack_xfr_pack_unit_qty);
	}

	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 51, $ttl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 51, $ttl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 51, $ttl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 51, $ttl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 51, $ttl_pack_xfr_pack_unit_qty, value);
	}


	/**
	 *  荷姿振替荷姿単位ＣＤ（全数）.<p>
	 *
	 */
	public String ttl_pack_xfr_pack_unit_cd() {
		return getConstString(offset + 52, $ttl_pack_xfr_pack_unit_cd);
	}

	/**
	 *  荷姿振替荷姿単位ＣＤ（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 52, $ttl_pack_xfr_pack_unit_cd, value);
	}


	/**
	 *  荷姿振替荷姿単位名（全数）.<p>
	 *
	 */
	public String ttl_pack_xfr_pack_unit_nm() {
		return getConstString(offset + 53, $ttl_pack_xfr_pack_unit_nm);
	}

	/**
	 *  荷姿振替荷姿単位名（全数）.<p>
	 *
	 */
	public void ttl_pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 53, $ttl_pack_xfr_pack_unit_nm, value);
	}


	/**
	 *  内部備考（全数）.<p>
	 *
	 */
	public String ttl_intr_rmrks() {
		return getConstString(offset + 54, $ttl_intr_rmrks);
	}

	/**
	 *  内部備考（全数）.<p>
	 *
	 */
	public void ttl_intr_rmrks(String value) {
		setConstString(offset + 54, $ttl_intr_rmrks, value);
	}


	/**
	 *  外部検査実績明細ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_d_no() {
		return getConstString(offset + 55, $ext_insp_act_d_no);
	}

	/**
	 *  外部検査実績明細ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_d_no(String value) {
		setConstString(offset + 55, $ext_insp_act_d_no, value);
	}


	/**
	 *  引落数量.<p>
	 *
	 */
	public MCNumber so_qty() {
		return getConstNumber(offset + 56, $so_qty);
	}

	/**
	 *  引落数量.<p>
	 *
	 */
	public void so_qty(MCNumber value) {
		setConstNumber(offset + 56, $so_qty, value);
	}

	/**
	 *  引落数量.<p>
	 *
	 */
	public void so_qty(int value) {
		setConstNumber(offset + 56, $so_qty, value);
	}

	/**
	 *  引落数量.<p>
	 *
	 */
	public void so_qty(long value) {
		setConstNumber(offset + 56, $so_qty, value);
	}

	/**
	 *  引落数量.<p>
	 *
	 */
	public void so_qty(float value) {
		setConstNumber(offset + 56, $so_qty, value);
	}

	/**
	 *  引落数量.<p>
	 *
	 */
	public void so_qty(double value) {
		setConstNumber(offset + 56, $so_qty, value);
	}


	/**
	 *  抜取数量.<p>
	 *
	 */
	public MCNumber smpl_qty() {
		return getConstNumber(offset + 57, $smpl_qty);
	}

	/**
	 *  抜取数量.<p>
	 *
	 */
	public void smpl_qty(MCNumber value) {
		setConstNumber(offset + 57, $smpl_qty, value);
	}

	/**
	 *  抜取数量.<p>
	 *
	 */
	public void smpl_qty(int value) {
		setConstNumber(offset + 57, $smpl_qty, value);
	}

	/**
	 *  抜取数量.<p>
	 *
	 */
	public void smpl_qty(long value) {
		setConstNumber(offset + 57, $smpl_qty, value);
	}

	/**
	 *  抜取数量.<p>
	 *
	 */
	public void smpl_qty(float value) {
		setConstNumber(offset + 57, $smpl_qty, value);
	}

	/**
	 *  抜取数量.<p>
	 *
	 */
	public void smpl_qty(double value) {
		setConstNumber(offset + 57, $smpl_qty, value);
	}


	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public MCNumber smpl_pack_xfr_pack_unit_qty() {
		return getConstNumber(offset + 58, $smpl_pack_xfr_pack_unit_qty);
	}

	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 58, $smpl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(int value) {
		setConstNumber(offset + 58, $smpl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(long value) {
		setConstNumber(offset + 58, $smpl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(float value) {
		setConstNumber(offset + 58, $smpl_pack_xfr_pack_unit_qty, value);
	}

	/**
	 *  荷姿振替荷姿単位数量（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_qty(double value) {
		setConstNumber(offset + 58, $smpl_pack_xfr_pack_unit_qty, value);
	}


	/**
	 *  荷姿振替荷姿単位ＣＤ（抜取）.<p>
	 *
	 */
	public String smpl_pack_xfr_pack_unit_cd() {
		return getConstString(offset + 59, $smpl_pack_xfr_pack_unit_cd);
	}

	/**
	 *  荷姿振替荷姿単位ＣＤ（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_cd(String value) {
		setConstString(offset + 59, $smpl_pack_xfr_pack_unit_cd, value);
	}


	/**
	 *  荷姿振替荷姿単位名（抜取）.<p>
	 *
	 */
	public String smpl_pack_xfr_pack_unit_nm() {
		return getConstString(offset + 60, $smpl_pack_xfr_pack_unit_nm);
	}

	/**
	 *  荷姿振替荷姿単位名（抜取）.<p>
	 *
	 */
	public void smpl_pack_xfr_pack_unit_nm(String value) {
		setConstString(offset + 60, $smpl_pack_xfr_pack_unit_nm, value);
	}


	/**
	 *  実績日（抜取）.<p>
	 *
	 */
	public MCDate smpl_act_dt() {
		return getConstDate(offset + 61, $smpl_act_dt);
	}

	/**
	 *  実績日（抜取）.<p>
	 *
	 */
	public void smpl_act_dt(MCDate value) {
		setConstDate(offset + 61, $smpl_act_dt, value);
	}


	/**
	 *  実績時刻（抜取）.<p>
	 *
	 */
	public MCDate smpl_act_hm() {
		return getConstDate(offset + 62, $smpl_act_hm);
	}

	/**
	 *  実績時刻（抜取）.<p>
	 *
	 */
	public void smpl_act_hm(MCDate value) {
		setConstDate(offset + 62, $smpl_act_hm, value);
	}


	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 63, $bd_dpt_cd);
	}

	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 63, $bd_dpt_cd, value);
	}


	/**
	 *  負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 64, $bd_dpt_nm);
	}

	/**
	 *  負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 64, $bd_dpt_nm, value);
	}


	/**
	 *  取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 65, $trd_rmrks);
	}

	/**
	 *  取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 65, $trd_rmrks, value);
	}


	/**
	 *  内部備考（抜取）.<p>
	 *
	 */
	public String smpl_intr_rmrks() {
		return getConstString(offset + 66, $smpl_intr_rmrks);
	}

	/**
	 *  内部備考（抜取）.<p>
	 *
	 */
	public void smpl_intr_rmrks(String value) {
		setConstString(offset + 66, $smpl_intr_rmrks, value);
	}


	/**
	 *  外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_smpl_act_no() {
		return getConstString(offset + 67, $ext_insp_smpl_act_no);
	}

	/**
	 *  外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_smpl_act_no(String value) {
		setConstString(offset + 67, $ext_insp_smpl_act_no, value);
	}


	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 68, $co_cd);
	}

	/**
	 *  会社ＣＤ.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 68, $co_cd, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 69, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 69, $co_nm, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 70, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 70, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 71, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 71, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 72, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 72, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 73, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 73, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 74, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 74, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 75, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 75, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 76, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 76, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 77, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 77, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 78, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 78, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 79, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 79, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 80, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 80, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 81, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 81, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 82, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 82, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 83, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 83, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 84, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 84, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 85, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 85, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 86, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 86, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 87, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 87, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 88, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 88, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 89, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 89, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 90, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 90, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 91, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 91, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 92, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 92, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 93, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 93, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 94, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 94, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 95, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 95, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 96, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 96, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 97, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 97, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 98, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 98, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 99, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 99, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 100, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 100, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 100, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 100, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 100, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 100, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 101, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 101, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 101, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 101, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 101, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 101, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 102, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 102, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 102, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 102, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 102, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 102, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 103, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 103, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 103, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 103, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 103, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 103, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 104, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 104, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 104, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 104, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 104, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 104, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 105, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 105, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 106, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 106, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 107, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 107, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 108, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 108, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 109, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 109, $sub_dt5, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			return smpl_quality_typ();
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			return smpl_gd_cd();
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			return smpl_gd_nm();
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_cd();
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			return ttl_quality_typ();
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			return ttl_gd_cd();
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			return ttl_gd_nm();
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_cd();
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_cd();
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_nm();
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			return ttl_intr_rmrks();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_cd();
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			return smpl_intr_rmrks();
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			return ext_insp_smpl_act_no();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_qty();
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			return so_qty();
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			return smpl_qty();
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_qty();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($st_act_dt.equalsIgnoreCase(name)) {
			return st_act_dt();
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			return st_act_hm();
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			return end_act_dt();
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			return end_act_hm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($ttl_act_dt.equalsIgnoreCase(name)) {
			return ttl_act_dt();
		}
		if ($ttl_act_hm.equalsIgnoreCase(name)) {
			return ttl_act_hm();
		}
		if ($smpl_act_dt.equalsIgnoreCase(name)) {
			return smpl_act_dt();
		}
		if ($smpl_act_hm.equalsIgnoreCase(name)) {
			return smpl_act_hm();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			return imp_only_judg();
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			return base_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			return smpl_quality_typ();
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			return smpl_gd_cd();
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			return smpl_gd_nm();
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_cd();
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return smpl_dfct_rsn_nm();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			return stk_str_ln_cd();
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			return stk_str_ln_nm();
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			return ttl_quality_typ();
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			return ttl_gd_cd();
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			return ttl_gd_nm();
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_cd();
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			return ttl_dfct_rsn_nm();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_cd();
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_nm();
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			return ttl_intr_rmrks();
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			return ext_insp_act_d_no();
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_cd();
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			return smpl_intr_rmrks();
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			return ext_insp_smpl_act_no();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			return pack_unit_qty();
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return ttl_pack_xfr_pack_unit_qty();
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			return so_qty();
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			return smpl_qty();
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			return smpl_pack_xfr_pack_unit_qty();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($st_act_dt.equalsIgnoreCase(name)) {
			return st_act_dt();
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			return st_act_hm();
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			return end_act_dt();
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			return end_act_hm();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($ttl_act_dt.equalsIgnoreCase(name)) {
			return ttl_act_dt();
		}
		if ($ttl_act_hm.equalsIgnoreCase(name)) {
			return ttl_act_hm();
		}
		if ($smpl_act_dt.equalsIgnoreCase(name)) {
			return smpl_act_dt();
		}
		if ($smpl_act_hm.equalsIgnoreCase(name)) {
			return smpl_act_hm();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			return imp_only_judg();
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			return base_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			smpl_quality_typ(value);
			return;
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			smpl_gd_cd(value);
			return;
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			smpl_gd_nm(value);
			return;
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_cd(value);
			return;
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			ttl_quality_typ(value);
			return;
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			ttl_gd_cd(value);
			return;
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			ttl_gd_nm(value);
			return;
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_cd(value);
			return;
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			ttl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			smpl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			ext_insp_smpl_act_no(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($st_act_dt.equalsIgnoreCase(name)) {
			st_act_dt(value);
			return;
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			st_act_hm(value);
			return;
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			end_act_dt(value);
			return;
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			end_act_hm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($ttl_act_dt.equalsIgnoreCase(name)) {
			ttl_act_dt(value);
			return;
		}
		if ($ttl_act_hm.equalsIgnoreCase(name)) {
			ttl_act_hm(value);
			return;
		}
		if ($smpl_act_dt.equalsIgnoreCase(name)) {
			smpl_act_dt(value);
			return;
		}
		if ($smpl_act_hm.equalsIgnoreCase(name)) {
			smpl_act_hm(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			imp_only_judg(value);
			return;
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			base_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
			return;
		}
		if ($smpl_quality_typ.equalsIgnoreCase(name)) {
			smpl_quality_typ(value);
			return;
		}
		if ($smpl_gd_cd.equalsIgnoreCase(name)) {
			smpl_gd_cd(value);
			return;
		}
		if ($smpl_gd_nm.equalsIgnoreCase(name)) {
			smpl_gd_nm(value);
			return;
		}
		if ($smpl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_cd(value);
			return;
		}
		if ($smpl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			smpl_dfct_rsn_nm(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
			return;
		}
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
			return;
		}
		if ($stk_str_ln_cd.equalsIgnoreCase(name)) {
			stk_str_ln_cd(value);
			return;
		}
		if ($stk_str_ln_nm.equalsIgnoreCase(name)) {
			stk_str_ln_nm(value);
			return;
		}
		if ($ttl_quality_typ.equalsIgnoreCase(name)) {
			ttl_quality_typ(value);
			return;
		}
		if ($ttl_gd_cd.equalsIgnoreCase(name)) {
			ttl_gd_cd(value);
			return;
		}
		if ($ttl_gd_nm.equalsIgnoreCase(name)) {
			ttl_gd_nm(value);
			return;
		}
		if ($ttl_dfct_rsn_cd.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_cd(value);
			return;
		}
		if ($ttl_dfct_rsn_nm.equalsIgnoreCase(name)) {
			ttl_dfct_rsn_nm(value);
			return;
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($ttl_intr_rmrks.equalsIgnoreCase(name)) {
			ttl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_act_d_no.equalsIgnoreCase(name)) {
			ext_insp_act_d_no(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_cd.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_cd(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_nm.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($smpl_intr_rmrks.equalsIgnoreCase(name)) {
			smpl_intr_rmrks(value);
			return;
		}
		if ($ext_insp_smpl_act_no.equalsIgnoreCase(name)) {
			ext_insp_smpl_act_no(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($pack_unit_qty.equalsIgnoreCase(name)) {
			pack_unit_qty(value);
			return;
		}
		if ($ttl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			ttl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($so_qty.equalsIgnoreCase(name)) {
			so_qty(value);
			return;
		}
		if ($smpl_qty.equalsIgnoreCase(name)) {
			smpl_qty(value);
			return;
		}
		if ($smpl_pack_xfr_pack_unit_qty.equalsIgnoreCase(name)) {
			smpl_pack_xfr_pack_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($st_act_dt.equalsIgnoreCase(name)) {
			st_act_dt(value);
			return;
		}
		if ($st_act_hm.equalsIgnoreCase(name)) {
			st_act_hm(value);
			return;
		}
		if ($end_act_dt.equalsIgnoreCase(name)) {
			end_act_dt(value);
			return;
		}
		if ($end_act_hm.equalsIgnoreCase(name)) {
			end_act_hm(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($ttl_act_dt.equalsIgnoreCase(name)) {
			ttl_act_dt(value);
			return;
		}
		if ($ttl_act_hm.equalsIgnoreCase(name)) {
			ttl_act_hm(value);
			return;
		}
		if ($smpl_act_dt.equalsIgnoreCase(name)) {
			smpl_act_dt(value);
			return;
		}
		if ($smpl_act_hm.equalsIgnoreCase(name)) {
			smpl_act_hm(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($imp_only_judg.equalsIgnoreCase(name)) {
			imp_only_judg(value);
			return;
		}
		if ($base_flg.equalsIgnoreCase(name)) {
			base_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

