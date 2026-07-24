package mcframe.commonPFBA.PFBAR5110;

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
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public static final String $ext_data_no = "ext_data_no";
	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public static final String $ext_data_lno = "ext_data_lno";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 *  勘定科目名.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	/**
	 *  勘定科目名_ロケール１.<p>
	 *
	 */
	public static final String $ac_nm_lcl1 = "ac_nm_lcl1";
	/**
	 *  勘定科目名_ロケール２.<p>
	 *
	 */
	public static final String $ac_nm_lcl2 = "ac_nm_lcl2";
	/**
	 *  勘定科目名_ロケール３.<p>
	 *
	 */
	public static final String $ac_nm_lcl3 = "ac_nm_lcl3";
	/**
	 *  勘定科目略名.<p>
	 *
	 */
	public static final String $ac_nm2 = "ac_nm2";
	/**
	 *  勘定科目略名_ロケール１.<p>
	 *
	 */
	public static final String $ac_nm2_lcl1 = "ac_nm2_lcl1";
	/**
	 *  勘定科目略名_ロケール２.<p>
	 *
	 */
	public static final String $ac_nm2_lcl2 = "ac_nm2_lcl2";
	/**
	 *  勘定科目略名_ロケール３.<p>
	 *
	 */
	public static final String $ac_nm2_lcl3 = "ac_nm2_lcl3";
	/**
	 *  貸借区分.<p>
	 *
	 */
	public static final String $dc_typ = "dc_typ";
	/**
	 *  補助科目使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";
	/**
	 *  勘定科目区分.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
	/**
	 *  会計税ＣＤ.<p>
	 *
	 */
	public static final String $ac_tax_cd = "ac_tax_cd";
	/**
	 *  会計税区分.<p>
	 *
	 */
	public static final String $ac_tax_typ = "ac_tax_typ";
	/**
	 *  外貨ＦＬＧ.<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	/**
	 *  集計０使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sum0_flg = "sum0_flg";
	/**
	 *  集計１使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sum1_flg = "sum1_flg";
	/**
	 *  集計２使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sum2_flg = "sum2_flg";
	/**
	 *  集計３使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sum3_flg = "sum3_flg";
	/**
	 *  集計４使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sum4_flg = "sum4_flg";
	/**
	 *  集計５使用ＦＬＧ.<p>
	 *
	 */
	public static final String $sum5_flg = "sum5_flg";
	/**
	 *  プロジェクト使用ＦＬＧ.<p>
	 *
	 */
	public static final String $project_flg = "project_flg";
	/**
	 *  取引先使用ＦＬＧ.<p>
	 *
	 */
	public static final String $bp_flg = "bp_flg";
	/**
	 *  担当者使用ＦＬＧ.<p>
	 *
	 */
	public static final String $usr_flg = "usr_flg";
	/**
	 *  口座使用ＦＬＧ.<p>
	 *
	 */
	public static final String $bank_ac_flg = "bank_ac_flg";
	/**
	 *  ＡＰ科目区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 *  ＡＲ科目区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 *  科目予備区分１.<p>
	 *
	 */
	public static final String $ac_typ1 = "ac_typ1";
	/**
	 *  科目予備区分２.<p>
	 *
	 */
	public static final String $ac_typ2 = "ac_typ2";
	/**
	 *  科目予備区分３.<p>
	 *
	 */
	public static final String $ac_typ3 = "ac_typ3";
	/**
	 *  科目予備区分４.<p>
	 *
	 */
	public static final String $ac_typ4 = "ac_typ4";
	/**
	 *  科目予備区分５.<p>
	 *
	 */
	public static final String $ac_typ5 = "ac_typ5";
	/**
	 *  メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 *  メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 *  メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $if_sub_char1 = "if_sub_char1";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $if_sub_char2 = "if_sub_char2";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $if_sub_char3 = "if_sub_char3";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $if_sub_char4 = "if_sub_char4";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $if_sub_char5 = "if_sub_char5";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $if_sub_char6 = "if_sub_char6";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $if_sub_char7 = "if_sub_char7";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $if_sub_char8 = "if_sub_char8";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $if_sub_char9 = "if_sub_char9";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $if_sub_char10 = "if_sub_char10";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $if_sub_char11 = "if_sub_char11";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $if_sub_char12 = "if_sub_char12";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $if_sub_char13 = "if_sub_char13";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $if_sub_char14 = "if_sub_char14";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $if_sub_char15 = "if_sub_char15";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $if_sub_char16 = "if_sub_char16";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $if_sub_char17 = "if_sub_char17";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $if_sub_char18 = "if_sub_char18";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $if_sub_char19 = "if_sub_char19";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $if_sub_char20 = "if_sub_char20";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $if_sub_char21 = "if_sub_char21";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $if_sub_char22 = "if_sub_char22";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $if_sub_char23 = "if_sub_char23";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $if_sub_char24 = "if_sub_char24";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $if_sub_char25 = "if_sub_char25";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $if_sub_char26 = "if_sub_char26";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $if_sub_char27 = "if_sub_char27";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $if_sub_char28 = "if_sub_char28";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $if_sub_char29 = "if_sub_char29";
	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $if_sub_char30 = "if_sub_char30";
	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $if_sub_num1 = "if_sub_num1";
	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $if_sub_num2 = "if_sub_num2";
	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $if_sub_num3 = "if_sub_num3";
	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $if_sub_num4 = "if_sub_num4";
	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $if_sub_num5 = "if_sub_num5";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $if_sub_dt1 = "if_sub_dt1";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $if_sub_dt2 = "if_sub_dt2";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $if_sub_dt3 = "if_sub_dt3";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $if_sub_dt4 = "if_sub_dt4";
	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $if_sub_dt5 = "if_sub_dt5";


	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_lcl1_META = createCommonMeta($ac_nm_lcl1, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_lcl2_META = createCommonMeta($ac_nm_lcl2, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm_lcl3_META = createCommonMeta($ac_nm_lcl3, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta ac_nm2_META = createCommonMeta($ac_nm2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_lcl1_META = createCommonMeta($ac_nm2_lcl1, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_lcl2_META = createCommonMeta($ac_nm2_lcl2, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta ac_nm2_lcl3_META = createCommonMeta($ac_nm2_lcl3, mcframe.commonMA.meta.MA_META.AC_NM2);
	public static final MCMeta dc_typ_META = createCommonMeta($dc_typ, mcframe.commonMA.meta.MA_META.DC_TYP);
	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_CD_TYP);
	public static final MCMeta ac_tax_cd_META = createCommonMeta($ac_tax_cd, mcframe.commonMA.meta.MA_META.AC_TAX_CD);
	public static final MCMeta ac_tax_typ_META = createCommonMeta($ac_tax_typ, mcframe.commonMA.meta.MA_META.AC_TAX_TYP);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum0_flg_META = createCommonMeta($sum0_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum1_flg_META = createCommonMeta($sum1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum2_flg_META = createCommonMeta($sum2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum3_flg_META = createCommonMeta($sum3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum4_flg_META = createCommonMeta($sum4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sum5_flg_META = createCommonMeta($sum5_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta project_flg_META = createCommonMeta($project_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_flg_META = createCommonMeta($bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_flg_META = createCommonMeta($usr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bank_ac_flg_META = createCommonMeta($bank_ac_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ1_META = createCommonMeta($ac_typ1, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ2_META = createCommonMeta($ac_typ2, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ3_META = createCommonMeta($ac_typ3, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ4_META = createCommonMeta($ac_typ4, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta ac_typ5_META = createCommonMeta($ac_typ5, mcframe.commonMA.meta.MA_META.AC_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta if_sub_char1_META = createCommonMeta($if_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta if_sub_char2_META = createCommonMeta($if_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta if_sub_char3_META = createCommonMeta($if_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta if_sub_char4_META = createCommonMeta($if_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta if_sub_char5_META = createCommonMeta($if_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta if_sub_char6_META = createCommonMeta($if_sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta if_sub_char7_META = createCommonMeta($if_sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta if_sub_char8_META = createCommonMeta($if_sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta if_sub_char9_META = createCommonMeta($if_sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta if_sub_char10_META = createCommonMeta($if_sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta if_sub_char11_META = createCommonMeta($if_sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta if_sub_char12_META = createCommonMeta($if_sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta if_sub_char13_META = createCommonMeta($if_sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta if_sub_char14_META = createCommonMeta($if_sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta if_sub_char15_META = createCommonMeta($if_sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta if_sub_char16_META = createCommonMeta($if_sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta if_sub_char17_META = createCommonMeta($if_sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta if_sub_char18_META = createCommonMeta($if_sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta if_sub_char19_META = createCommonMeta($if_sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta if_sub_char20_META = createCommonMeta($if_sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta if_sub_char21_META = createCommonMeta($if_sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta if_sub_char22_META = createCommonMeta($if_sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta if_sub_char23_META = createCommonMeta($if_sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta if_sub_char24_META = createCommonMeta($if_sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta if_sub_char25_META = createCommonMeta($if_sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta if_sub_char26_META = createCommonMeta($if_sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta if_sub_char27_META = createCommonMeta($if_sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta if_sub_char28_META = createCommonMeta($if_sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta if_sub_char29_META = createCommonMeta($if_sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta if_sub_char30_META = createCommonMeta($if_sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta if_sub_num1_META = createCommonMeta($if_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta if_sub_num2_META = createCommonMeta($if_sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta if_sub_num3_META = createCommonMeta($if_sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta if_sub_num4_META = createCommonMeta($if_sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta if_sub_num5_META = createCommonMeta($if_sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta if_sub_dt1_META = createCommonMeta($if_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt2_META = createCommonMeta($if_sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt3_META = createCommonMeta($if_sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt4_META = createCommonMeta($if_sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta if_sub_dt5_META = createCommonMeta($if_sub_dt5, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ext_data_no_META,
			ext_data_lno_META,
			data_make_dt_META,
			ac_cd_META,
			ac_nm_META,
			ac_nm_lcl1_META,
			ac_nm_lcl2_META,
			ac_nm_lcl3_META,
			ac_nm2_META,
			ac_nm2_lcl1_META,
			ac_nm2_lcl2_META,
			ac_nm2_lcl3_META,
			dc_typ_META,
			sub_flg_META,
			ac_typ_META,
			ac_tax_cd_META,
			ac_tax_typ_META,
			foreign_flg_META,
			sum0_flg_META,
			sum1_flg_META,
			sum2_flg_META,
			sum3_flg_META,
			sum4_flg_META,
			sum5_flg_META,
			project_flg_META,
			bp_flg_META,
			usr_flg_META,
			bank_ac_flg_META,
			ap_typ_META,
			ar_typ_META,
			ac_typ1_META,
			ac_typ2_META,
			ac_typ3_META,
			ac_typ4_META,
			ac_typ5_META,
			memo1_META,
			memo2_META,
			memo3_META,
			if_sub_char1_META,
			if_sub_char2_META,
			if_sub_char3_META,
			if_sub_char4_META,
			if_sub_char5_META,
			if_sub_char6_META,
			if_sub_char7_META,
			if_sub_char8_META,
			if_sub_char9_META,
			if_sub_char10_META,
			if_sub_char11_META,
			if_sub_char12_META,
			if_sub_char13_META,
			if_sub_char14_META,
			if_sub_char15_META,
			if_sub_char16_META,
			if_sub_char17_META,
			if_sub_char18_META,
			if_sub_char19_META,
			if_sub_char20_META,
			if_sub_char21_META,
			if_sub_char22_META,
			if_sub_char23_META,
			if_sub_char24_META,
			if_sub_char25_META,
			if_sub_char26_META,
			if_sub_char27_META,
			if_sub_char28_META,
			if_sub_char29_META,
			if_sub_char30_META,
			if_sub_num1_META,
			if_sub_num2_META,
			if_sub_num3_META,
			if_sub_num4_META,
			if_sub_num5_META,
			if_sub_dt1_META,
			if_sub_dt2_META,
			if_sub_dt3_META,
			if_sub_dt4_META,
			if_sub_dt5_META
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
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return getConstNumber(offset + 0, $ext_data_no);
	}

	/**
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		setConstNumber(offset + 0, $ext_data_no, value);
	}

	/**
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		setConstNumber(offset + 0, $ext_data_no, value);
	}

	/**
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		setConstNumber(offset + 0, $ext_data_no, value);
	}

	/**
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		setConstNumber(offset + 0, $ext_data_no, value);
	}

	/**
	 *  外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		setConstNumber(offset + 0, $ext_data_no, value);
	}


	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return getConstNumber(offset + 1, $ext_data_lno);
	}

	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		setConstNumber(offset + 1, $ext_data_lno, value);
	}

	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		setConstNumber(offset + 1, $ext_data_lno, value);
	}

	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		setConstNumber(offset + 1, $ext_data_lno, value);
	}

	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		setConstNumber(offset + 1, $ext_data_lno, value);
	}

	/**
	 *  外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		setConstNumber(offset + 1, $ext_data_lno, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 2, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 2, $data_make_dt, value);
	}


	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 3, $ac_cd);
	}

	/**
	 *  勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 3, $ac_cd, value);
	}


	/**
	 *  勘定科目名.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 4, $ac_nm);
	}

	/**
	 *  勘定科目名.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 4, $ac_nm, value);
	}


	/**
	 *  勘定科目名_ロケール１.<p>
	 *
	 */
	public String ac_nm_lcl1() {
		return getConstString(offset + 5, $ac_nm_lcl1);
	}

	/**
	 *  勘定科目名_ロケール１.<p>
	 *
	 */
	public void ac_nm_lcl1(String value) {
		setConstString(offset + 5, $ac_nm_lcl1, value);
	}


	/**
	 *  勘定科目名_ロケール２.<p>
	 *
	 */
	public String ac_nm_lcl2() {
		return getConstString(offset + 6, $ac_nm_lcl2);
	}

	/**
	 *  勘定科目名_ロケール２.<p>
	 *
	 */
	public void ac_nm_lcl2(String value) {
		setConstString(offset + 6, $ac_nm_lcl2, value);
	}


	/**
	 *  勘定科目名_ロケール３.<p>
	 *
	 */
	public String ac_nm_lcl3() {
		return getConstString(offset + 7, $ac_nm_lcl3);
	}

	/**
	 *  勘定科目名_ロケール３.<p>
	 *
	 */
	public void ac_nm_lcl3(String value) {
		setConstString(offset + 7, $ac_nm_lcl3, value);
	}


	/**
	 *  勘定科目略名.<p>
	 *
	 */
	public String ac_nm2() {
		return getConstString(offset + 8, $ac_nm2);
	}

	/**
	 *  勘定科目略名.<p>
	 *
	 */
	public void ac_nm2(String value) {
		setConstString(offset + 8, $ac_nm2, value);
	}


	/**
	 *  勘定科目略名_ロケール１.<p>
	 *
	 */
	public String ac_nm2_lcl1() {
		return getConstString(offset + 9, $ac_nm2_lcl1);
	}

	/**
	 *  勘定科目略名_ロケール１.<p>
	 *
	 */
	public void ac_nm2_lcl1(String value) {
		setConstString(offset + 9, $ac_nm2_lcl1, value);
	}


	/**
	 *  勘定科目略名_ロケール２.<p>
	 *
	 */
	public String ac_nm2_lcl2() {
		return getConstString(offset + 10, $ac_nm2_lcl2);
	}

	/**
	 *  勘定科目略名_ロケール２.<p>
	 *
	 */
	public void ac_nm2_lcl2(String value) {
		setConstString(offset + 10, $ac_nm2_lcl2, value);
	}


	/**
	 *  勘定科目略名_ロケール３.<p>
	 *
	 */
	public String ac_nm2_lcl3() {
		return getConstString(offset + 11, $ac_nm2_lcl3);
	}

	/**
	 *  勘定科目略名_ロケール３.<p>
	 *
	 */
	public void ac_nm2_lcl3(String value) {
		setConstString(offset + 11, $ac_nm2_lcl3, value);
	}


	/**
	 *  貸借区分.<p>
	 *
	 */
	public String dc_typ() {
		return getConstString(offset + 12, $dc_typ);
	}

	/**
	 *  貸借区分.<p>
	 *
	 */
	public void dc_typ(String value) {
		setConstString(offset + 12, $dc_typ, value);
	}


	/**
	 *  補助科目使用ＦＬＧ.<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 13, $sub_flg);
	}

	/**
	 *  補助科目使用ＦＬＧ.<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 13, $sub_flg, value);
	}


	/**
	 *  勘定科目区分.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 14, $ac_typ);
	}

	/**
	 *  勘定科目区分.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 14, $ac_typ, value);
	}


	/**
	 *  会計税ＣＤ.<p>
	 *
	 */
	public String ac_tax_cd() {
		return getConstString(offset + 15, $ac_tax_cd);
	}

	/**
	 *  会計税ＣＤ.<p>
	 *
	 */
	public void ac_tax_cd(String value) {
		setConstString(offset + 15, $ac_tax_cd, value);
	}


	/**
	 *  会計税区分.<p>
	 *
	 */
	public String ac_tax_typ() {
		return getConstString(offset + 16, $ac_tax_typ);
	}

	/**
	 *  会計税区分.<p>
	 *
	 */
	public void ac_tax_typ(String value) {
		setConstString(offset + 16, $ac_tax_typ, value);
	}


	/**
	 *  外貨ＦＬＧ.<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 17, $foreign_flg);
	}

	/**
	 *  外貨ＦＬＧ.<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 17, $foreign_flg, value);
	}


	/**
	 *  集計０使用ＦＬＧ.<p>
	 *
	 */
	public boolean sum0_flg() {
		return getConstBoolean(offset + 18, $sum0_flg);
	}

	/**
	 *  集計０使用ＦＬＧ.<p>
	 *
	 */
	public void sum0_flg(boolean value) {
		setConstBoolean(offset + 18, $sum0_flg, value);
	}


	/**
	 *  集計１使用ＦＬＧ.<p>
	 *
	 */
	public boolean sum1_flg() {
		return getConstBoolean(offset + 19, $sum1_flg);
	}

	/**
	 *  集計１使用ＦＬＧ.<p>
	 *
	 */
	public void sum1_flg(boolean value) {
		setConstBoolean(offset + 19, $sum1_flg, value);
	}


	/**
	 *  集計２使用ＦＬＧ.<p>
	 *
	 */
	public boolean sum2_flg() {
		return getConstBoolean(offset + 20, $sum2_flg);
	}

	/**
	 *  集計２使用ＦＬＧ.<p>
	 *
	 */
	public void sum2_flg(boolean value) {
		setConstBoolean(offset + 20, $sum2_flg, value);
	}


	/**
	 *  集計３使用ＦＬＧ.<p>
	 *
	 */
	public boolean sum3_flg() {
		return getConstBoolean(offset + 21, $sum3_flg);
	}

	/**
	 *  集計３使用ＦＬＧ.<p>
	 *
	 */
	public void sum3_flg(boolean value) {
		setConstBoolean(offset + 21, $sum3_flg, value);
	}


	/**
	 *  集計４使用ＦＬＧ.<p>
	 *
	 */
	public boolean sum4_flg() {
		return getConstBoolean(offset + 22, $sum4_flg);
	}

	/**
	 *  集計４使用ＦＬＧ.<p>
	 *
	 */
	public void sum4_flg(boolean value) {
		setConstBoolean(offset + 22, $sum4_flg, value);
	}


	/**
	 *  集計５使用ＦＬＧ.<p>
	 *
	 */
	public boolean sum5_flg() {
		return getConstBoolean(offset + 23, $sum5_flg);
	}

	/**
	 *  集計５使用ＦＬＧ.<p>
	 *
	 */
	public void sum5_flg(boolean value) {
		setConstBoolean(offset + 23, $sum5_flg, value);
	}


	/**
	 *  プロジェクト使用ＦＬＧ.<p>
	 *
	 */
	public boolean project_flg() {
		return getConstBoolean(offset + 24, $project_flg);
	}

	/**
	 *  プロジェクト使用ＦＬＧ.<p>
	 *
	 */
	public void project_flg(boolean value) {
		setConstBoolean(offset + 24, $project_flg, value);
	}


	/**
	 *  取引先使用ＦＬＧ.<p>
	 *
	 */
	public boolean bp_flg() {
		return getConstBoolean(offset + 25, $bp_flg);
	}

	/**
	 *  取引先使用ＦＬＧ.<p>
	 *
	 */
	public void bp_flg(boolean value) {
		setConstBoolean(offset + 25, $bp_flg, value);
	}


	/**
	 *  担当者使用ＦＬＧ.<p>
	 *
	 */
	public boolean usr_flg() {
		return getConstBoolean(offset + 26, $usr_flg);
	}

	/**
	 *  担当者使用ＦＬＧ.<p>
	 *
	 */
	public void usr_flg(boolean value) {
		setConstBoolean(offset + 26, $usr_flg, value);
	}


	/**
	 *  口座使用ＦＬＧ.<p>
	 *
	 */
	public boolean bank_ac_flg() {
		return getConstBoolean(offset + 27, $bank_ac_flg);
	}

	/**
	 *  口座使用ＦＬＧ.<p>
	 *
	 */
	public void bank_ac_flg(boolean value) {
		setConstBoolean(offset + 27, $bank_ac_flg, value);
	}


	/**
	 *  ＡＰ科目区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 28, $ap_typ);
	}

	/**
	 *  ＡＰ科目区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 28, $ap_typ, value);
	}


	/**
	 *  ＡＲ科目区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 29, $ar_typ);
	}

	/**
	 *  ＡＲ科目区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 29, $ar_typ, value);
	}


	/**
	 *  科目予備区分１.<p>
	 *
	 */
	public String ac_typ1() {
		return getConstString(offset + 30, $ac_typ1);
	}

	/**
	 *  科目予備区分１.<p>
	 *
	 */
	public void ac_typ1(String value) {
		setConstString(offset + 30, $ac_typ1, value);
	}


	/**
	 *  科目予備区分２.<p>
	 *
	 */
	public String ac_typ2() {
		return getConstString(offset + 31, $ac_typ2);
	}

	/**
	 *  科目予備区分２.<p>
	 *
	 */
	public void ac_typ2(String value) {
		setConstString(offset + 31, $ac_typ2, value);
	}


	/**
	 *  科目予備区分３.<p>
	 *
	 */
	public String ac_typ3() {
		return getConstString(offset + 32, $ac_typ3);
	}

	/**
	 *  科目予備区分３.<p>
	 *
	 */
	public void ac_typ3(String value) {
		setConstString(offset + 32, $ac_typ3, value);
	}


	/**
	 *  科目予備区分４.<p>
	 *
	 */
	public String ac_typ4() {
		return getConstString(offset + 33, $ac_typ4);
	}

	/**
	 *  科目予備区分４.<p>
	 *
	 */
	public void ac_typ4(String value) {
		setConstString(offset + 33, $ac_typ4, value);
	}


	/**
	 *  科目予備区分５.<p>
	 *
	 */
	public String ac_typ5() {
		return getConstString(offset + 34, $ac_typ5);
	}

	/**
	 *  科目予備区分５.<p>
	 *
	 */
	public void ac_typ5(String value) {
		setConstString(offset + 34, $ac_typ5, value);
	}


	/**
	 *  メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 35, $memo1);
	}

	/**
	 *  メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 35, $memo1, value);
	}


	/**
	 *  メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 36, $memo2);
	}

	/**
	 *  メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 36, $memo2, value);
	}


	/**
	 *  メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 37, $memo3);
	}

	/**
	 *  メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 37, $memo3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String if_sub_char1() {
		return getConstString(offset + 38, $if_sub_char1);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void if_sub_char1(String value) {
		setConstString(offset + 38, $if_sub_char1, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String if_sub_char2() {
		return getConstString(offset + 39, $if_sub_char2);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void if_sub_char2(String value) {
		setConstString(offset + 39, $if_sub_char2, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String if_sub_char3() {
		return getConstString(offset + 40, $if_sub_char3);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void if_sub_char3(String value) {
		setConstString(offset + 40, $if_sub_char3, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String if_sub_char4() {
		return getConstString(offset + 41, $if_sub_char4);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void if_sub_char4(String value) {
		setConstString(offset + 41, $if_sub_char4, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String if_sub_char5() {
		return getConstString(offset + 42, $if_sub_char5);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void if_sub_char5(String value) {
		setConstString(offset + 42, $if_sub_char5, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String if_sub_char6() {
		return getConstString(offset + 43, $if_sub_char6);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void if_sub_char6(String value) {
		setConstString(offset + 43, $if_sub_char6, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String if_sub_char7() {
		return getConstString(offset + 44, $if_sub_char7);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void if_sub_char7(String value) {
		setConstString(offset + 44, $if_sub_char7, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String if_sub_char8() {
		return getConstString(offset + 45, $if_sub_char8);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void if_sub_char8(String value) {
		setConstString(offset + 45, $if_sub_char8, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String if_sub_char9() {
		return getConstString(offset + 46, $if_sub_char9);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void if_sub_char9(String value) {
		setConstString(offset + 46, $if_sub_char9, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String if_sub_char10() {
		return getConstString(offset + 47, $if_sub_char10);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void if_sub_char10(String value) {
		setConstString(offset + 47, $if_sub_char10, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String if_sub_char11() {
		return getConstString(offset + 48, $if_sub_char11);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void if_sub_char11(String value) {
		setConstString(offset + 48, $if_sub_char11, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String if_sub_char12() {
		return getConstString(offset + 49, $if_sub_char12);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void if_sub_char12(String value) {
		setConstString(offset + 49, $if_sub_char12, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String if_sub_char13() {
		return getConstString(offset + 50, $if_sub_char13);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void if_sub_char13(String value) {
		setConstString(offset + 50, $if_sub_char13, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String if_sub_char14() {
		return getConstString(offset + 51, $if_sub_char14);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void if_sub_char14(String value) {
		setConstString(offset + 51, $if_sub_char14, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String if_sub_char15() {
		return getConstString(offset + 52, $if_sub_char15);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void if_sub_char15(String value) {
		setConstString(offset + 52, $if_sub_char15, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String if_sub_char16() {
		return getConstString(offset + 53, $if_sub_char16);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void if_sub_char16(String value) {
		setConstString(offset + 53, $if_sub_char16, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String if_sub_char17() {
		return getConstString(offset + 54, $if_sub_char17);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void if_sub_char17(String value) {
		setConstString(offset + 54, $if_sub_char17, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String if_sub_char18() {
		return getConstString(offset + 55, $if_sub_char18);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void if_sub_char18(String value) {
		setConstString(offset + 55, $if_sub_char18, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String if_sub_char19() {
		return getConstString(offset + 56, $if_sub_char19);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void if_sub_char19(String value) {
		setConstString(offset + 56, $if_sub_char19, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String if_sub_char20() {
		return getConstString(offset + 57, $if_sub_char20);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void if_sub_char20(String value) {
		setConstString(offset + 57, $if_sub_char20, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String if_sub_char21() {
		return getConstString(offset + 58, $if_sub_char21);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void if_sub_char21(String value) {
		setConstString(offset + 58, $if_sub_char21, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String if_sub_char22() {
		return getConstString(offset + 59, $if_sub_char22);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void if_sub_char22(String value) {
		setConstString(offset + 59, $if_sub_char22, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String if_sub_char23() {
		return getConstString(offset + 60, $if_sub_char23);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void if_sub_char23(String value) {
		setConstString(offset + 60, $if_sub_char23, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String if_sub_char24() {
		return getConstString(offset + 61, $if_sub_char24);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void if_sub_char24(String value) {
		setConstString(offset + 61, $if_sub_char24, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String if_sub_char25() {
		return getConstString(offset + 62, $if_sub_char25);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void if_sub_char25(String value) {
		setConstString(offset + 62, $if_sub_char25, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String if_sub_char26() {
		return getConstString(offset + 63, $if_sub_char26);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void if_sub_char26(String value) {
		setConstString(offset + 63, $if_sub_char26, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String if_sub_char27() {
		return getConstString(offset + 64, $if_sub_char27);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void if_sub_char27(String value) {
		setConstString(offset + 64, $if_sub_char27, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String if_sub_char28() {
		return getConstString(offset + 65, $if_sub_char28);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void if_sub_char28(String value) {
		setConstString(offset + 65, $if_sub_char28, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String if_sub_char29() {
		return getConstString(offset + 66, $if_sub_char29);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void if_sub_char29(String value) {
		setConstString(offset + 66, $if_sub_char29, value);
	}


	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String if_sub_char30() {
		return getConstString(offset + 67, $if_sub_char30);
	}

	/**
	 *  ＩＦ予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void if_sub_char30(String value) {
		setConstString(offset + 67, $if_sub_char30, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber if_sub_num1() {
		return getConstNumber(offset + 68, $if_sub_num1);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(MCNumber value) {
		setConstNumber(offset + 68, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(int value) {
		setConstNumber(offset + 68, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(long value) {
		setConstNumber(offset + 68, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(float value) {
		setConstNumber(offset + 68, $if_sub_num1, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void if_sub_num1(double value) {
		setConstNumber(offset + 68, $if_sub_num1, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber if_sub_num2() {
		return getConstNumber(offset + 69, $if_sub_num2);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(MCNumber value) {
		setConstNumber(offset + 69, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(int value) {
		setConstNumber(offset + 69, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(long value) {
		setConstNumber(offset + 69, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(float value) {
		setConstNumber(offset + 69, $if_sub_num2, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目２.<p>
	 *
	 */
	public void if_sub_num2(double value) {
		setConstNumber(offset + 69, $if_sub_num2, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber if_sub_num3() {
		return getConstNumber(offset + 70, $if_sub_num3);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(MCNumber value) {
		setConstNumber(offset + 70, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(int value) {
		setConstNumber(offset + 70, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(long value) {
		setConstNumber(offset + 70, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(float value) {
		setConstNumber(offset + 70, $if_sub_num3, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目３.<p>
	 *
	 */
	public void if_sub_num3(double value) {
		setConstNumber(offset + 70, $if_sub_num3, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber if_sub_num4() {
		return getConstNumber(offset + 71, $if_sub_num4);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(MCNumber value) {
		setConstNumber(offset + 71, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(int value) {
		setConstNumber(offset + 71, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(long value) {
		setConstNumber(offset + 71, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(float value) {
		setConstNumber(offset + 71, $if_sub_num4, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目４.<p>
	 *
	 */
	public void if_sub_num4(double value) {
		setConstNumber(offset + 71, $if_sub_num4, value);
	}


	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber if_sub_num5() {
		return getConstNumber(offset + 72, $if_sub_num5);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(MCNumber value) {
		setConstNumber(offset + 72, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(int value) {
		setConstNumber(offset + 72, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(long value) {
		setConstNumber(offset + 72, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(float value) {
		setConstNumber(offset + 72, $if_sub_num5, value);
	}

	/**
	 *  ＩＦ予備ＮＵＭ項目５.<p>
	 *
	 */
	public void if_sub_num5(double value) {
		setConstNumber(offset + 72, $if_sub_num5, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate if_sub_dt1() {
		return getConstDate(offset + 73, $if_sub_dt1);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void if_sub_dt1(MCDate value) {
		setConstDate(offset + 73, $if_sub_dt1, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate if_sub_dt2() {
		return getConstDate(offset + 74, $if_sub_dt2);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void if_sub_dt2(MCDate value) {
		setConstDate(offset + 74, $if_sub_dt2, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate if_sub_dt3() {
		return getConstDate(offset + 75, $if_sub_dt3);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void if_sub_dt3(MCDate value) {
		setConstDate(offset + 75, $if_sub_dt3, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate if_sub_dt4() {
		return getConstDate(offset + 76, $if_sub_dt4);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void if_sub_dt4(MCDate value) {
		setConstDate(offset + 76, $if_sub_dt4, value);
	}


	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate if_sub_dt5() {
		return getConstDate(offset + 77, $if_sub_dt5);
	}

	/**
	 *  ＩＦ予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void if_sub_dt5(MCDate value) {
		setConstDate(offset + 77, $if_sub_dt5, value);
	}


	public String getString(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_nm_lcl1();
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_nm_lcl2();
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_nm_lcl3();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			return ac_nm2_lcl1();
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			return ac_nm2_lcl2();
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			return ac_nm2_lcl3();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_nm_lcl1();
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_nm_lcl2();
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_nm_lcl3();
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			return ac_nm2();
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			return ac_nm2_lcl1();
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			return ac_nm2_lcl2();
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			return ac_nm2_lcl3();
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			return dc_typ();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			return ac_tax_cd();
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			return ac_tax_typ();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			return ac_typ1();
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			return ac_typ2();
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			return ac_typ3();
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			return ac_typ4();
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			return ac_typ5();
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			return if_sub_char1();
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			return if_sub_char2();
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			return if_sub_char3();
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			return if_sub_char4();
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			return if_sub_char5();
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			return if_sub_char6();
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			return if_sub_char7();
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			return if_sub_char8();
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			return if_sub_char9();
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			return if_sub_char10();
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			return if_sub_char11();
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			return if_sub_char12();
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			return if_sub_char13();
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			return if_sub_char14();
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			return if_sub_char15();
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			return if_sub_char16();
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			return if_sub_char17();
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			return if_sub_char18();
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			return if_sub_char19();
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			return if_sub_char20();
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			return if_sub_char21();
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			return if_sub_char22();
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			return if_sub_char23();
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			return if_sub_char24();
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			return if_sub_char25();
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			return if_sub_char26();
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			return if_sub_char27();
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			return if_sub_char28();
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			return if_sub_char29();
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			return if_sub_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			return if_sub_num1();
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			return if_sub_num2();
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			return if_sub_num3();
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			return if_sub_num4();
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			return if_sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			return if_sub_dt1();
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			return if_sub_dt2();
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			return if_sub_dt3();
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			return if_sub_dt4();
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			return if_sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			return sum0_flg();
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			return sum1_flg();
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			return sum2_flg();
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			return sum3_flg();
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			return sum4_flg();
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			return sum5_flg();
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			return project_flg();
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			return bp_flg();
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			return usr_flg();
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			return bank_ac_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			ac_nm_lcl1(value);
			return;
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			ac_nm_lcl2(value);
			return;
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			ac_nm_lcl3(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			ac_nm2_lcl1(value);
			return;
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			ac_nm2_lcl2(value);
			return;
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			ac_nm2_lcl3(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($ac_nm_lcl1.equalsIgnoreCase(name)) {
			ac_nm_lcl1(value);
			return;
		}
		if ($ac_nm_lcl2.equalsIgnoreCase(name)) {
			ac_nm_lcl2(value);
			return;
		}
		if ($ac_nm_lcl3.equalsIgnoreCase(name)) {
			ac_nm_lcl3(value);
			return;
		}
		if ($ac_nm2.equalsIgnoreCase(name)) {
			ac_nm2(value);
			return;
		}
		if ($ac_nm2_lcl1.equalsIgnoreCase(name)) {
			ac_nm2_lcl1(value);
			return;
		}
		if ($ac_nm2_lcl2.equalsIgnoreCase(name)) {
			ac_nm2_lcl2(value);
			return;
		}
		if ($ac_nm2_lcl3.equalsIgnoreCase(name)) {
			ac_nm2_lcl3(value);
			return;
		}
		if ($dc_typ.equalsIgnoreCase(name)) {
			dc_typ(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		if ($ac_tax_cd.equalsIgnoreCase(name)) {
			ac_tax_cd(value);
			return;
		}
		if ($ac_tax_typ.equalsIgnoreCase(name)) {
			ac_tax_typ(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ac_typ1.equalsIgnoreCase(name)) {
			ac_typ1(value);
			return;
		}
		if ($ac_typ2.equalsIgnoreCase(name)) {
			ac_typ2(value);
			return;
		}
		if ($ac_typ3.equalsIgnoreCase(name)) {
			ac_typ3(value);
			return;
		}
		if ($ac_typ4.equalsIgnoreCase(name)) {
			ac_typ4(value);
			return;
		}
		if ($ac_typ5.equalsIgnoreCase(name)) {
			ac_typ5(value);
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
		if ($if_sub_char1.equalsIgnoreCase(name)) {
			if_sub_char1(value);
			return;
		}
		if ($if_sub_char2.equalsIgnoreCase(name)) {
			if_sub_char2(value);
			return;
		}
		if ($if_sub_char3.equalsIgnoreCase(name)) {
			if_sub_char3(value);
			return;
		}
		if ($if_sub_char4.equalsIgnoreCase(name)) {
			if_sub_char4(value);
			return;
		}
		if ($if_sub_char5.equalsIgnoreCase(name)) {
			if_sub_char5(value);
			return;
		}
		if ($if_sub_char6.equalsIgnoreCase(name)) {
			if_sub_char6(value);
			return;
		}
		if ($if_sub_char7.equalsIgnoreCase(name)) {
			if_sub_char7(value);
			return;
		}
		if ($if_sub_char8.equalsIgnoreCase(name)) {
			if_sub_char8(value);
			return;
		}
		if ($if_sub_char9.equalsIgnoreCase(name)) {
			if_sub_char9(value);
			return;
		}
		if ($if_sub_char10.equalsIgnoreCase(name)) {
			if_sub_char10(value);
			return;
		}
		if ($if_sub_char11.equalsIgnoreCase(name)) {
			if_sub_char11(value);
			return;
		}
		if ($if_sub_char12.equalsIgnoreCase(name)) {
			if_sub_char12(value);
			return;
		}
		if ($if_sub_char13.equalsIgnoreCase(name)) {
			if_sub_char13(value);
			return;
		}
		if ($if_sub_char14.equalsIgnoreCase(name)) {
			if_sub_char14(value);
			return;
		}
		if ($if_sub_char15.equalsIgnoreCase(name)) {
			if_sub_char15(value);
			return;
		}
		if ($if_sub_char16.equalsIgnoreCase(name)) {
			if_sub_char16(value);
			return;
		}
		if ($if_sub_char17.equalsIgnoreCase(name)) {
			if_sub_char17(value);
			return;
		}
		if ($if_sub_char18.equalsIgnoreCase(name)) {
			if_sub_char18(value);
			return;
		}
		if ($if_sub_char19.equalsIgnoreCase(name)) {
			if_sub_char19(value);
			return;
		}
		if ($if_sub_char20.equalsIgnoreCase(name)) {
			if_sub_char20(value);
			return;
		}
		if ($if_sub_char21.equalsIgnoreCase(name)) {
			if_sub_char21(value);
			return;
		}
		if ($if_sub_char22.equalsIgnoreCase(name)) {
			if_sub_char22(value);
			return;
		}
		if ($if_sub_char23.equalsIgnoreCase(name)) {
			if_sub_char23(value);
			return;
		}
		if ($if_sub_char24.equalsIgnoreCase(name)) {
			if_sub_char24(value);
			return;
		}
		if ($if_sub_char25.equalsIgnoreCase(name)) {
			if_sub_char25(value);
			return;
		}
		if ($if_sub_char26.equalsIgnoreCase(name)) {
			if_sub_char26(value);
			return;
		}
		if ($if_sub_char27.equalsIgnoreCase(name)) {
			if_sub_char27(value);
			return;
		}
		if ($if_sub_char28.equalsIgnoreCase(name)) {
			if_sub_char28(value);
			return;
		}
		if ($if_sub_char29.equalsIgnoreCase(name)) {
			if_sub_char29(value);
			return;
		}
		if ($if_sub_char30.equalsIgnoreCase(name)) {
			if_sub_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($if_sub_num1.equalsIgnoreCase(name)) {
			if_sub_num1(value);
			return;
		}
		if ($if_sub_num2.equalsIgnoreCase(name)) {
			if_sub_num2(value);
			return;
		}
		if ($if_sub_num3.equalsIgnoreCase(name)) {
			if_sub_num3(value);
			return;
		}
		if ($if_sub_num4.equalsIgnoreCase(name)) {
			if_sub_num4(value);
			return;
		}
		if ($if_sub_num5.equalsIgnoreCase(name)) {
			if_sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($if_sub_dt1.equalsIgnoreCase(name)) {
			if_sub_dt1(value);
			return;
		}
		if ($if_sub_dt2.equalsIgnoreCase(name)) {
			if_sub_dt2(value);
			return;
		}
		if ($if_sub_dt3.equalsIgnoreCase(name)) {
			if_sub_dt3(value);
			return;
		}
		if ($if_sub_dt4.equalsIgnoreCase(name)) {
			if_sub_dt4(value);
			return;
		}
		if ($if_sub_dt5.equalsIgnoreCase(name)) {
			if_sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($sum0_flg.equalsIgnoreCase(name)) {
			sum0_flg(value);
			return;
		}
		if ($sum1_flg.equalsIgnoreCase(name)) {
			sum1_flg(value);
			return;
		}
		if ($sum2_flg.equalsIgnoreCase(name)) {
			sum2_flg(value);
			return;
		}
		if ($sum3_flg.equalsIgnoreCase(name)) {
			sum3_flg(value);
			return;
		}
		if ($sum4_flg.equalsIgnoreCase(name)) {
			sum4_flg(value);
			return;
		}
		if ($sum5_flg.equalsIgnoreCase(name)) {
			sum5_flg(value);
			return;
		}
		if ($project_flg.equalsIgnoreCase(name)) {
			project_flg(value);
			return;
		}
		if ($bp_flg.equalsIgnoreCase(name)) {
			bp_flg(value);
			return;
		}
		if ($usr_flg.equalsIgnoreCase(name)) {
			usr_flg(value);
			return;
		}
		if ($bank_ac_flg.equalsIgnoreCase(name)) {
			bank_ac_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

