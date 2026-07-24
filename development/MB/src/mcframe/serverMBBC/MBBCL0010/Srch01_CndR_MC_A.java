package mcframe.serverMBBC.MBBCL0010;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public static final String $report_id = "report_id";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * Transaction date FROM 取引年月日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $dt_fr = "dt_fr";
	/**
	 * Transaction date TO 取引年月日ＴＯ.<p>
	 *
	 */
	public static final String $dt_to = "dt_to";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public static final String $amt_fr = "amt_fr";
	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public static final String $amt_to = "amt_to";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Display data before correction 訂正前データ表示.<p>
	 *
	 */
	public static final String $disp_old_flg = "disp_old_flg";
	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public static final String $biz_key1 = "biz_key1";
	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public static final String $biz_key2 = "biz_key2";
	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public static final String $biz_key3 = "biz_key3";
	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public static final String $biz_key4 = "biz_key4";
	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public static final String $biz_key5 = "biz_key5";
	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public static final String $biz_key6 = "biz_key6";
	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public static final String $biz_key7 = "biz_key7";
	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public static final String $biz_key8 = "biz_key8";
	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public static final String $biz_key9 = "biz_key9";
	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public static final String $biz_key10 = "biz_key10";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $rmrks1 = "rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $rmrks2 = "rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $rmrks3 = "rmrks3";
	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public static final String $rmrks4 = "rmrks4";
	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public static final String $rmrks5 = "rmrks5";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $rpt_attr1 = "rpt_attr1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $rpt_attr2 = "rpt_attr2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $rpt_attr3 = "rpt_attr3";
	/**
	 * Spare 4 予備４.<p>
	 *
	 */
	public static final String $rpt_attr4 = "rpt_attr4";
	/**
	 * Spare 5 予備５.<p>
	 *
	 */
	public static final String $rpt_attr5 = "rpt_attr5";
	/**
	 * Spare 6 予備６.<p>
	 *
	 */
	public static final String $rpt_attr6 = "rpt_attr6";
	/**
	 * Spare 7 予備７.<p>
	 *
	 */
	public static final String $rpt_attr7 = "rpt_attr7";
	/**
	 * Spare 8 予備８.<p>
	 *
	 */
	public static final String $rpt_attr8 = "rpt_attr8";
	/**
	 * Spare 9 予備９.<p>
	 *
	 */
	public static final String $rpt_attr9 = "rpt_attr9";
	/**
	 * Spare 10 予備１０.<p>
	 *
	 */
	public static final String $rpt_attr10 = "rpt_attr10";
	/**
	 * Spare 11 予備１１.<p>
	 *
	 */
	public static final String $rpt_attr11 = "rpt_attr11";
	/**
	 * Spare 12 予備１２.<p>
	 *
	 */
	public static final String $rpt_attr12 = "rpt_attr12";
	/**
	 * Spare 13 予備１３.<p>
	 *
	 */
	public static final String $rpt_attr13 = "rpt_attr13";
	/**
	 * Spare 14 予備１４.<p>
	 *
	 */
	public static final String $rpt_attr14 = "rpt_attr14";
	/**
	 * Spare 15 予備１５.<p>
	 *
	 */
	public static final String $rpt_attr15 = "rpt_attr15";
	/**
	 * Spare 16 予備１６.<p>
	 *
	 */
	public static final String $rpt_attr16 = "rpt_attr16";
	/**
	 * Spare 17 予備１７.<p>
	 *
	 */
	public static final String $rpt_attr17 = "rpt_attr17";
	/**
	 * Spare 18 予備１８.<p>
	 *
	 */
	public static final String $rpt_attr18 = "rpt_attr18";
	/**
	 * Spare 19 予備１９.<p>
	 *
	 */
	public static final String $rpt_attr19 = "rpt_attr19";
	/**
	 * Spare 20 予備２０.<p>
	 *
	 */
	public static final String $rpt_attr20 = "rpt_attr20";
	/**
	 * BP classification flg. 1 取引先分類ＦＬＧ１.<p>
	 *
	 */
	public static final String $bp_grp_flg1 = "bp_grp_flg1";
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public static final String $bp_grp_cd1 = "bp_grp_cd1";
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public static final String $bp_grp_nm1 = "bp_grp_nm1";
	/**
	 * BP classification flg. 2 取引先分類ＦＬＧ２.<p>
	 *
	 */
	public static final String $bp_grp_flg2 = "bp_grp_flg2";
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public static final String $bp_grp_cd2 = "bp_grp_cd2";
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public static final String $bp_grp_nm2 = "bp_grp_nm2";
	/**
	 * BP classification flg. 3 取引先分類ＦＬＧ３.<p>
	 *
	 */
	public static final String $bp_grp_flg3 = "bp_grp_flg3";
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public static final String $bp_grp_cd3 = "bp_grp_cd3";
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public static final String $bp_grp_nm3 = "bp_grp_nm3";
	/**
	 * BP classification flg. 4 取引先分類ＦＬＧ４.<p>
	 *
	 */
	public static final String $bp_grp_flg4 = "bp_grp_flg4";
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public static final String $bp_grp_cd4 = "bp_grp_cd4";
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public static final String $bp_grp_nm4 = "bp_grp_nm4";
	/**
	 * BP classification flg. 5 取引先分類ＦＬＧ５.<p>
	 *
	 */
	public static final String $bp_grp_flg5 = "bp_grp_flg5";
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public static final String $bp_grp_cd5 = "bp_grp_cd5";
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public static final String $bp_grp_nm5 = "bp_grp_nm5";
	/**
	 * BP classification flg. 6 取引先分類ＦＬＧ６.<p>
	 *
	 */
	public static final String $bp_grp_flg6 = "bp_grp_flg6";
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public static final String $bp_grp_cd6 = "bp_grp_cd6";
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public static final String $bp_grp_nm6 = "bp_grp_nm6";
	/**
	 * BP classification flg. 7 取引先分類ＦＬＧ７.<p>
	 *
	 */
	public static final String $bp_grp_flg7 = "bp_grp_flg7";
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public static final String $bp_grp_cd7 = "bp_grp_cd7";
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public static final String $bp_grp_nm7 = "bp_grp_nm7";
	/**
	 * BP classification flg. 8 取引先分類ＦＬＧ８.<p>
	 *
	 */
	public static final String $bp_grp_flg8 = "bp_grp_flg8";
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public static final String $bp_grp_cd8 = "bp_grp_cd8";
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public static final String $bp_grp_nm8 = "bp_grp_nm8";
	/**
	 * BP classification flg. 9 取引先分類ＦＬＧ９.<p>
	 *
	 */
	public static final String $bp_grp_flg9 = "bp_grp_flg9";
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public static final String $bp_grp_cd9 = "bp_grp_cd9";
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public static final String $bp_grp_nm9 = "bp_grp_nm9";
	/**
	 * BP classification flg. 10 取引先分類ＦＬＧ１０.<p>
	 *
	 */
	public static final String $bp_grp_flg10 = "bp_grp_flg10";
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $bp_grp_cd10 = "bp_grp_cd10";
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public static final String $bp_grp_nm10 = "bp_grp_nm10";


	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta report_id_META = createCommonMeta($report_id, mcframe.commonMA.meta.MA_META.REPORT_ID);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta amt_fr_META = createCommonMeta($amt_fr, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_to_META = createCommonMeta($amt_to, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta disp_old_flg_META = createCommonMeta($disp_old_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta biz_key1_META = createCommonMeta($biz_key1, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key2_META = createCommonMeta($biz_key2, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key3_META = createCommonMeta($biz_key3, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key4_META = createCommonMeta($biz_key4, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key5_META = createCommonMeta($biz_key5, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key6_META = createCommonMeta($biz_key6, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key7_META = createCommonMeta($biz_key7, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key8_META = createCommonMeta($biz_key8, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key9_META = createCommonMeta($biz_key9, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key10_META = createCommonMeta($biz_key10, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rpt_attr1_META = createCommonMeta($rpt_attr1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR1);
	public static final MCMeta rpt_attr2_META = createCommonMeta($rpt_attr2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR2);
	public static final MCMeta rpt_attr3_META = createCommonMeta($rpt_attr3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR3);
	public static final MCMeta rpt_attr4_META = createCommonMeta($rpt_attr4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR4);
	public static final MCMeta rpt_attr5_META = createCommonMeta($rpt_attr5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR5);
	public static final MCMeta rpt_attr6_META = createCommonMeta($rpt_attr6, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR6);
	public static final MCMeta rpt_attr7_META = createCommonMeta($rpt_attr7, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR7);
	public static final MCMeta rpt_attr8_META = createCommonMeta($rpt_attr8, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR8);
	public static final MCMeta rpt_attr9_META = createCommonMeta($rpt_attr9, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR9);
	public static final MCMeta rpt_attr10_META = createCommonMeta($rpt_attr10, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR10);
	public static final MCMeta rpt_attr11_META = createCommonMeta($rpt_attr11, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR11);
	public static final MCMeta rpt_attr12_META = createCommonMeta($rpt_attr12, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR12);
	public static final MCMeta rpt_attr13_META = createCommonMeta($rpt_attr13, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR13);
	public static final MCMeta rpt_attr14_META = createCommonMeta($rpt_attr14, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR14);
	public static final MCMeta rpt_attr15_META = createCommonMeta($rpt_attr15, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR15);
	public static final MCMeta rpt_attr16_META = createCommonMeta($rpt_attr16, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR16);
	public static final MCMeta rpt_attr17_META = createCommonMeta($rpt_attr17, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR17);
	public static final MCMeta rpt_attr18_META = createCommonMeta($rpt_attr18, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR18);
	public static final MCMeta rpt_attr19_META = createCommonMeta($rpt_attr19, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR19);
	public static final MCMeta rpt_attr20_META = createCommonMeta($rpt_attr20, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR20);
	public static final MCMeta bp_grp_flg1_META = createCommonMeta($bp_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd1_META = createCommonMeta($bp_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm1_META = createCommonMeta($bp_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg2_META = createCommonMeta($bp_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd2_META = createCommonMeta($bp_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm2_META = createCommonMeta($bp_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg3_META = createCommonMeta($bp_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd3_META = createCommonMeta($bp_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm3_META = createCommonMeta($bp_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg4_META = createCommonMeta($bp_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd4_META = createCommonMeta($bp_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm4_META = createCommonMeta($bp_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg5_META = createCommonMeta($bp_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd5_META = createCommonMeta($bp_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm5_META = createCommonMeta($bp_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg6_META = createCommonMeta($bp_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd6_META = createCommonMeta($bp_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm6_META = createCommonMeta($bp_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg7_META = createCommonMeta($bp_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd7_META = createCommonMeta($bp_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm7_META = createCommonMeta($bp_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg8_META = createCommonMeta($bp_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd8_META = createCommonMeta($bp_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm8_META = createCommonMeta($bp_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg9_META = createCommonMeta($bp_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd9_META = createCommonMeta($bp_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm9_META = createCommonMeta($bp_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta bp_grp_flg10_META = createCommonMeta($bp_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_grp_cd10_META = createCommonMeta($bp_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta bp_grp_nm10_META = createCommonMeta($bp_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_typ_META,
			report_id_META,
			file_nm_META,
			dt_fr_META,
			dt_to_META,
			bp_cd_META,
			bp_nm_META,
			amt_fr_META,
			amt_to_META,
			cur_cd_META,
			data_no_META,
			data_crud_typ_META,
			disp_old_flg_META,
			biz_key1_META,
			biz_key2_META,
			biz_key3_META,
			biz_key4_META,
			biz_key5_META,
			biz_key6_META,
			biz_key7_META,
			biz_key8_META,
			biz_key9_META,
			biz_key10_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META,
			rpt_attr1_META,
			rpt_attr2_META,
			rpt_attr3_META,
			rpt_attr4_META,
			rpt_attr5_META,
			rpt_attr6_META,
			rpt_attr7_META,
			rpt_attr8_META,
			rpt_attr9_META,
			rpt_attr10_META,
			rpt_attr11_META,
			rpt_attr12_META,
			rpt_attr13_META,
			rpt_attr14_META,
			rpt_attr15_META,
			rpt_attr16_META,
			rpt_attr17_META,
			rpt_attr18_META,
			rpt_attr19_META,
			rpt_attr20_META,
			bp_grp_flg1_META,
			bp_grp_cd1_META,
			bp_grp_nm1_META,
			bp_grp_flg2_META,
			bp_grp_cd2_META,
			bp_grp_nm2_META,
			bp_grp_flg3_META,
			bp_grp_cd3_META,
			bp_grp_nm3_META,
			bp_grp_flg4_META,
			bp_grp_cd4_META,
			bp_grp_nm4_META,
			bp_grp_flg5_META,
			bp_grp_cd5_META,
			bp_grp_nm5_META,
			bp_grp_flg6_META,
			bp_grp_cd6_META,
			bp_grp_nm6_META,
			bp_grp_flg7_META,
			bp_grp_cd7_META,
			bp_grp_nm7_META,
			bp_grp_flg8_META,
			bp_grp_cd8_META,
			bp_grp_nm8_META,
			bp_grp_flg9_META,
			bp_grp_cd9_META,
			bp_grp_nm9_META,
			bp_grp_flg10_META,
			bp_grp_cd10_META,
			bp_grp_nm10_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 0, $biz_typ);
	}

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 0, $biz_typ, value);
	}


	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public String report_id() {
		return getConstString(offset + 1, $report_id);
	}

	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public void report_id(String value) {
		setConstString(offset + 1, $report_id, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 2, $file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 2, $file_nm, value);
	}


	/**
	 * Transaction date FROM 取引年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 3, $dt_fr);
	}

	/**
	 * Transaction date FROM 取引年月日ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 3, $dt_fr, value);
	}


	/**
	 * Transaction date TO 取引年月日ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 4, $dt_to);
	}

	/**
	 * Transaction date TO 取引年月日ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 4, $dt_to, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 5, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 5, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 6, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 6, $bp_nm, value);
	}


	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber amt_fr() {
		return getConstNumber(offset + 7, $amt_fr);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(MCNumber value) {
		setConstNumber(offset + 7, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(int value) {
		setConstNumber(offset + 7, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(long value) {
		setConstNumber(offset + 7, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(float value) {
		setConstNumber(offset + 7, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(double value) {
		setConstNumber(offset + 7, $amt_fr, value);
	}


	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public MCNumber amt_to() {
		return getConstNumber(offset + 8, $amt_to);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(MCNumber value) {
		setConstNumber(offset + 8, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(int value) {
		setConstNumber(offset + 8, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(long value) {
		setConstNumber(offset + 8, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(float value) {
		setConstNumber(offset + 8, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(double value) {
		setConstNumber(offset + 8, $amt_to, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 9, $cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 9, $cur_cd, value);
	}


	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 10, $data_no);
	}

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 10, $data_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 11, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 11, $data_crud_typ, value);
	}


	/**
	 * Display data before correction 訂正前データ表示.<p>
	 *
	 */
	public boolean disp_old_flg() {
		return getConstBoolean(offset + 12, $disp_old_flg);
	}

	/**
	 * Display data before correction 訂正前データ表示.<p>
	 *
	 */
	public void disp_old_flg(boolean value) {
		setConstBoolean(offset + 12, $disp_old_flg, value);
	}


	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public String biz_key1() {
		return getConstString(offset + 13, $biz_key1);
	}

	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public void biz_key1(String value) {
		setConstString(offset + 13, $biz_key1, value);
	}


	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public String biz_key2() {
		return getConstString(offset + 14, $biz_key2);
	}

	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public void biz_key2(String value) {
		setConstString(offset + 14, $biz_key2, value);
	}


	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public String biz_key3() {
		return getConstString(offset + 15, $biz_key3);
	}

	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public void biz_key3(String value) {
		setConstString(offset + 15, $biz_key3, value);
	}


	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public String biz_key4() {
		return getConstString(offset + 16, $biz_key4);
	}

	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public void biz_key4(String value) {
		setConstString(offset + 16, $biz_key4, value);
	}


	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public String biz_key5() {
		return getConstString(offset + 17, $biz_key5);
	}

	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public void biz_key5(String value) {
		setConstString(offset + 17, $biz_key5, value);
	}


	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public String biz_key6() {
		return getConstString(offset + 18, $biz_key6);
	}

	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public void biz_key6(String value) {
		setConstString(offset + 18, $biz_key6, value);
	}


	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public String biz_key7() {
		return getConstString(offset + 19, $biz_key7);
	}

	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public void biz_key7(String value) {
		setConstString(offset + 19, $biz_key7, value);
	}


	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public String biz_key8() {
		return getConstString(offset + 20, $biz_key8);
	}

	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public void biz_key8(String value) {
		setConstString(offset + 20, $biz_key8, value);
	}


	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public String biz_key9() {
		return getConstString(offset + 21, $biz_key9);
	}

	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public void biz_key9(String value) {
		setConstString(offset + 21, $biz_key9, value);
	}


	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public String biz_key10() {
		return getConstString(offset + 22, $biz_key10);
	}

	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public void biz_key10(String value) {
		setConstString(offset + 22, $biz_key10, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 23, $rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 23, $rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 24, $rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 24, $rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 25, $rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 25, $rmrks3, value);
	}


	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 26, $rmrks4);
	}

	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 26, $rmrks4, value);
	}


	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 27, $rmrks5);
	}

	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 27, $rmrks5, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String rpt_attr1() {
		return getConstString(offset + 28, $rpt_attr1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void rpt_attr1(String value) {
		setConstString(offset + 28, $rpt_attr1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String rpt_attr2() {
		return getConstString(offset + 29, $rpt_attr2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void rpt_attr2(String value) {
		setConstString(offset + 29, $rpt_attr2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String rpt_attr3() {
		return getConstString(offset + 30, $rpt_attr3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void rpt_attr3(String value) {
		setConstString(offset + 30, $rpt_attr3, value);
	}


	/**
	 * Spare 4 予備４.<p>
	 *
	 */
	public String rpt_attr4() {
		return getConstString(offset + 31, $rpt_attr4);
	}

	/**
	 * Spare 4 予備４.<p>
	 *
	 */
	public void rpt_attr4(String value) {
		setConstString(offset + 31, $rpt_attr4, value);
	}


	/**
	 * Spare 5 予備５.<p>
	 *
	 */
	public String rpt_attr5() {
		return getConstString(offset + 32, $rpt_attr5);
	}

	/**
	 * Spare 5 予備５.<p>
	 *
	 */
	public void rpt_attr5(String value) {
		setConstString(offset + 32, $rpt_attr5, value);
	}


	/**
	 * Spare 6 予備６.<p>
	 *
	 */
	public String rpt_attr6() {
		return getConstString(offset + 33, $rpt_attr6);
	}

	/**
	 * Spare 6 予備６.<p>
	 *
	 */
	public void rpt_attr6(String value) {
		setConstString(offset + 33, $rpt_attr6, value);
	}


	/**
	 * Spare 7 予備７.<p>
	 *
	 */
	public String rpt_attr7() {
		return getConstString(offset + 34, $rpt_attr7);
	}

	/**
	 * Spare 7 予備７.<p>
	 *
	 */
	public void rpt_attr7(String value) {
		setConstString(offset + 34, $rpt_attr7, value);
	}


	/**
	 * Spare 8 予備８.<p>
	 *
	 */
	public String rpt_attr8() {
		return getConstString(offset + 35, $rpt_attr8);
	}

	/**
	 * Spare 8 予備８.<p>
	 *
	 */
	public void rpt_attr8(String value) {
		setConstString(offset + 35, $rpt_attr8, value);
	}


	/**
	 * Spare 9 予備９.<p>
	 *
	 */
	public String rpt_attr9() {
		return getConstString(offset + 36, $rpt_attr9);
	}

	/**
	 * Spare 9 予備９.<p>
	 *
	 */
	public void rpt_attr9(String value) {
		setConstString(offset + 36, $rpt_attr9, value);
	}


	/**
	 * Spare 10 予備１０.<p>
	 *
	 */
	public String rpt_attr10() {
		return getConstString(offset + 37, $rpt_attr10);
	}

	/**
	 * Spare 10 予備１０.<p>
	 *
	 */
	public void rpt_attr10(String value) {
		setConstString(offset + 37, $rpt_attr10, value);
	}


	/**
	 * Spare 11 予備１１.<p>
	 *
	 */
	public String rpt_attr11() {
		return getConstString(offset + 38, $rpt_attr11);
	}

	/**
	 * Spare 11 予備１１.<p>
	 *
	 */
	public void rpt_attr11(String value) {
		setConstString(offset + 38, $rpt_attr11, value);
	}


	/**
	 * Spare 12 予備１２.<p>
	 *
	 */
	public String rpt_attr12() {
		return getConstString(offset + 39, $rpt_attr12);
	}

	/**
	 * Spare 12 予備１２.<p>
	 *
	 */
	public void rpt_attr12(String value) {
		setConstString(offset + 39, $rpt_attr12, value);
	}


	/**
	 * Spare 13 予備１３.<p>
	 *
	 */
	public String rpt_attr13() {
		return getConstString(offset + 40, $rpt_attr13);
	}

	/**
	 * Spare 13 予備１３.<p>
	 *
	 */
	public void rpt_attr13(String value) {
		setConstString(offset + 40, $rpt_attr13, value);
	}


	/**
	 * Spare 14 予備１４.<p>
	 *
	 */
	public String rpt_attr14() {
		return getConstString(offset + 41, $rpt_attr14);
	}

	/**
	 * Spare 14 予備１４.<p>
	 *
	 */
	public void rpt_attr14(String value) {
		setConstString(offset + 41, $rpt_attr14, value);
	}


	/**
	 * Spare 15 予備１５.<p>
	 *
	 */
	public String rpt_attr15() {
		return getConstString(offset + 42, $rpt_attr15);
	}

	/**
	 * Spare 15 予備１５.<p>
	 *
	 */
	public void rpt_attr15(String value) {
		setConstString(offset + 42, $rpt_attr15, value);
	}


	/**
	 * Spare 16 予備１６.<p>
	 *
	 */
	public String rpt_attr16() {
		return getConstString(offset + 43, $rpt_attr16);
	}

	/**
	 * Spare 16 予備１６.<p>
	 *
	 */
	public void rpt_attr16(String value) {
		setConstString(offset + 43, $rpt_attr16, value);
	}


	/**
	 * Spare 17 予備１７.<p>
	 *
	 */
	public String rpt_attr17() {
		return getConstString(offset + 44, $rpt_attr17);
	}

	/**
	 * Spare 17 予備１７.<p>
	 *
	 */
	public void rpt_attr17(String value) {
		setConstString(offset + 44, $rpt_attr17, value);
	}


	/**
	 * Spare 18 予備１８.<p>
	 *
	 */
	public String rpt_attr18() {
		return getConstString(offset + 45, $rpt_attr18);
	}

	/**
	 * Spare 18 予備１８.<p>
	 *
	 */
	public void rpt_attr18(String value) {
		setConstString(offset + 45, $rpt_attr18, value);
	}


	/**
	 * Spare 19 予備１９.<p>
	 *
	 */
	public String rpt_attr19() {
		return getConstString(offset + 46, $rpt_attr19);
	}

	/**
	 * Spare 19 予備１９.<p>
	 *
	 */
	public void rpt_attr19(String value) {
		setConstString(offset + 46, $rpt_attr19, value);
	}


	/**
	 * Spare 20 予備２０.<p>
	 *
	 */
	public String rpt_attr20() {
		return getConstString(offset + 47, $rpt_attr20);
	}

	/**
	 * Spare 20 予備２０.<p>
	 *
	 */
	public void rpt_attr20(String value) {
		setConstString(offset + 47, $rpt_attr20, value);
	}


	/**
	 * BP classification flg. 1 取引先分類ＦＬＧ１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return getConstBoolean(offset + 48, $bp_grp_flg1);
	}

	/**
	 * BP classification flg. 1 取引先分類ＦＬＧ１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		setConstBoolean(offset + 48, $bp_grp_flg1, value);
	}


	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return getConstString(offset + 49, $bp_grp_cd1);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		setConstString(offset + 49, $bp_grp_cd1, value);
	}


	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return getConstString(offset + 50, $bp_grp_nm1);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		setConstString(offset + 50, $bp_grp_nm1, value);
	}


	/**
	 * BP classification flg. 2 取引先分類ＦＬＧ２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return getConstBoolean(offset + 51, $bp_grp_flg2);
	}

	/**
	 * BP classification flg. 2 取引先分類ＦＬＧ２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		setConstBoolean(offset + 51, $bp_grp_flg2, value);
	}


	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return getConstString(offset + 52, $bp_grp_cd2);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		setConstString(offset + 52, $bp_grp_cd2, value);
	}


	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return getConstString(offset + 53, $bp_grp_nm2);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		setConstString(offset + 53, $bp_grp_nm2, value);
	}


	/**
	 * BP classification flg. 3 取引先分類ＦＬＧ３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return getConstBoolean(offset + 54, $bp_grp_flg3);
	}

	/**
	 * BP classification flg. 3 取引先分類ＦＬＧ３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		setConstBoolean(offset + 54, $bp_grp_flg3, value);
	}


	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return getConstString(offset + 55, $bp_grp_cd3);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		setConstString(offset + 55, $bp_grp_cd3, value);
	}


	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return getConstString(offset + 56, $bp_grp_nm3);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		setConstString(offset + 56, $bp_grp_nm3, value);
	}


	/**
	 * BP classification flg. 4 取引先分類ＦＬＧ４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return getConstBoolean(offset + 57, $bp_grp_flg4);
	}

	/**
	 * BP classification flg. 4 取引先分類ＦＬＧ４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		setConstBoolean(offset + 57, $bp_grp_flg4, value);
	}


	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return getConstString(offset + 58, $bp_grp_cd4);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		setConstString(offset + 58, $bp_grp_cd4, value);
	}


	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return getConstString(offset + 59, $bp_grp_nm4);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		setConstString(offset + 59, $bp_grp_nm4, value);
	}


	/**
	 * BP classification flg. 5 取引先分類ＦＬＧ５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return getConstBoolean(offset + 60, $bp_grp_flg5);
	}

	/**
	 * BP classification flg. 5 取引先分類ＦＬＧ５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		setConstBoolean(offset + 60, $bp_grp_flg5, value);
	}


	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return getConstString(offset + 61, $bp_grp_cd5);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		setConstString(offset + 61, $bp_grp_cd5, value);
	}


	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return getConstString(offset + 62, $bp_grp_nm5);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		setConstString(offset + 62, $bp_grp_nm5, value);
	}


	/**
	 * BP classification flg. 6 取引先分類ＦＬＧ６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return getConstBoolean(offset + 63, $bp_grp_flg6);
	}

	/**
	 * BP classification flg. 6 取引先分類ＦＬＧ６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		setConstBoolean(offset + 63, $bp_grp_flg6, value);
	}


	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return getConstString(offset + 64, $bp_grp_cd6);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		setConstString(offset + 64, $bp_grp_cd6, value);
	}


	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return getConstString(offset + 65, $bp_grp_nm6);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		setConstString(offset + 65, $bp_grp_nm6, value);
	}


	/**
	 * BP classification flg. 7 取引先分類ＦＬＧ７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return getConstBoolean(offset + 66, $bp_grp_flg7);
	}

	/**
	 * BP classification flg. 7 取引先分類ＦＬＧ７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		setConstBoolean(offset + 66, $bp_grp_flg7, value);
	}


	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return getConstString(offset + 67, $bp_grp_cd7);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		setConstString(offset + 67, $bp_grp_cd7, value);
	}


	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return getConstString(offset + 68, $bp_grp_nm7);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		setConstString(offset + 68, $bp_grp_nm7, value);
	}


	/**
	 * BP classification flg. 8 取引先分類ＦＬＧ８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return getConstBoolean(offset + 69, $bp_grp_flg8);
	}

	/**
	 * BP classification flg. 8 取引先分類ＦＬＧ８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		setConstBoolean(offset + 69, $bp_grp_flg8, value);
	}


	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return getConstString(offset + 70, $bp_grp_cd8);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		setConstString(offset + 70, $bp_grp_cd8, value);
	}


	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return getConstString(offset + 71, $bp_grp_nm8);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		setConstString(offset + 71, $bp_grp_nm8, value);
	}


	/**
	 * BP classification flg. 9 取引先分類ＦＬＧ９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return getConstBoolean(offset + 72, $bp_grp_flg9);
	}

	/**
	 * BP classification flg. 9 取引先分類ＦＬＧ９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		setConstBoolean(offset + 72, $bp_grp_flg9, value);
	}


	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return getConstString(offset + 73, $bp_grp_cd9);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		setConstString(offset + 73, $bp_grp_cd9, value);
	}


	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return getConstString(offset + 74, $bp_grp_nm9);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		setConstString(offset + 74, $bp_grp_nm9, value);
	}


	/**
	 * BP classification flg. 10 取引先分類ＦＬＧ１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return getConstBoolean(offset + 75, $bp_grp_flg10);
	}

	/**
	 * BP classification flg. 10 取引先分類ＦＬＧ１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		setConstBoolean(offset + 75, $bp_grp_flg10, value);
	}


	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return getConstString(offset + 76, $bp_grp_cd10);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		setConstString(offset + 76, $bp_grp_cd10, value);
	}


	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return getConstString(offset + 77, $bp_grp_nm10);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		setConstString(offset + 77, $bp_grp_nm10, value);
	}


	public String getString(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			return amt_fr();
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			return amt_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($disp_old_flg.equalsIgnoreCase(name)) {
			return disp_old_flg();
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			return bp_grp_cd1();
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			return bp_grp_nm1();
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			return bp_grp_cd2();
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			return bp_grp_nm2();
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			return bp_grp_cd3();
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			return bp_grp_nm3();
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			return bp_grp_cd4();
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			return bp_grp_nm4();
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			return bp_grp_cd5();
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			return bp_grp_nm5();
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			return bp_grp_cd6();
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			return bp_grp_nm6();
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			return bp_grp_cd7();
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			return bp_grp_nm7();
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			return bp_grp_cd8();
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			return bp_grp_nm8();
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			return bp_grp_cd9();
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			return bp_grp_nm9();
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			return bp_grp_cd10();
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			return bp_grp_nm10();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			return amt_fr();
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			return amt_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			return dt_fr();
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			return dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($disp_old_flg.equalsIgnoreCase(name)) {
			return disp_old_flg();
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			return bp_grp_flg1();
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			return bp_grp_flg2();
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			return bp_grp_flg3();
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			return bp_grp_flg4();
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			return bp_grp_flg5();
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			return bp_grp_flg6();
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			return bp_grp_flg7();
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			return bp_grp_flg8();
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			return bp_grp_flg9();
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			return bp_grp_flg10();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($disp_old_flg.equalsIgnoreCase(name)) {
			disp_old_flg(value);
			return;
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($bp_grp_cd1.equalsIgnoreCase(name)) {
			bp_grp_cd1(value);
			return;
		}
		if ($bp_grp_nm1.equalsIgnoreCase(name)) {
			bp_grp_nm1(value);
			return;
		}
		if ($bp_grp_cd2.equalsIgnoreCase(name)) {
			bp_grp_cd2(value);
			return;
		}
		if ($bp_grp_nm2.equalsIgnoreCase(name)) {
			bp_grp_nm2(value);
			return;
		}
		if ($bp_grp_cd3.equalsIgnoreCase(name)) {
			bp_grp_cd3(value);
			return;
		}
		if ($bp_grp_nm3.equalsIgnoreCase(name)) {
			bp_grp_nm3(value);
			return;
		}
		if ($bp_grp_cd4.equalsIgnoreCase(name)) {
			bp_grp_cd4(value);
			return;
		}
		if ($bp_grp_nm4.equalsIgnoreCase(name)) {
			bp_grp_nm4(value);
			return;
		}
		if ($bp_grp_cd5.equalsIgnoreCase(name)) {
			bp_grp_cd5(value);
			return;
		}
		if ($bp_grp_nm5.equalsIgnoreCase(name)) {
			bp_grp_nm5(value);
			return;
		}
		if ($bp_grp_cd6.equalsIgnoreCase(name)) {
			bp_grp_cd6(value);
			return;
		}
		if ($bp_grp_nm6.equalsIgnoreCase(name)) {
			bp_grp_nm6(value);
			return;
		}
		if ($bp_grp_cd7.equalsIgnoreCase(name)) {
			bp_grp_cd7(value);
			return;
		}
		if ($bp_grp_nm7.equalsIgnoreCase(name)) {
			bp_grp_nm7(value);
			return;
		}
		if ($bp_grp_cd8.equalsIgnoreCase(name)) {
			bp_grp_cd8(value);
			return;
		}
		if ($bp_grp_nm8.equalsIgnoreCase(name)) {
			bp_grp_nm8(value);
			return;
		}
		if ($bp_grp_cd9.equalsIgnoreCase(name)) {
			bp_grp_cd9(value);
			return;
		}
		if ($bp_grp_nm9.equalsIgnoreCase(name)) {
			bp_grp_nm9(value);
			return;
		}
		if ($bp_grp_cd10.equalsIgnoreCase(name)) {
			bp_grp_cd10(value);
			return;
		}
		if ($bp_grp_nm10.equalsIgnoreCase(name)) {
			bp_grp_nm10(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($amt_fr.equalsIgnoreCase(name)) {
			amt_fr(value);
			return;
		}
		if ($amt_to.equalsIgnoreCase(name)) {
			amt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt_fr.equalsIgnoreCase(name)) {
			dt_fr(value);
			return;
		}
		if ($dt_to.equalsIgnoreCase(name)) {
			dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($disp_old_flg.equalsIgnoreCase(name)) {
			disp_old_flg(value);
			return;
		}
		if ($bp_grp_flg1.equalsIgnoreCase(name)) {
			bp_grp_flg1(value);
			return;
		}
		if ($bp_grp_flg2.equalsIgnoreCase(name)) {
			bp_grp_flg2(value);
			return;
		}
		if ($bp_grp_flg3.equalsIgnoreCase(name)) {
			bp_grp_flg3(value);
			return;
		}
		if ($bp_grp_flg4.equalsIgnoreCase(name)) {
			bp_grp_flg4(value);
			return;
		}
		if ($bp_grp_flg5.equalsIgnoreCase(name)) {
			bp_grp_flg5(value);
			return;
		}
		if ($bp_grp_flg6.equalsIgnoreCase(name)) {
			bp_grp_flg6(value);
			return;
		}
		if ($bp_grp_flg7.equalsIgnoreCase(name)) {
			bp_grp_flg7(value);
			return;
		}
		if ($bp_grp_flg8.equalsIgnoreCase(name)) {
			bp_grp_flg8(value);
			return;
		}
		if ($bp_grp_flg9.equalsIgnoreCase(name)) {
			bp_grp_flg9(value);
			return;
		}
		if ($bp_grp_flg10.equalsIgnoreCase(name)) {
			bp_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

