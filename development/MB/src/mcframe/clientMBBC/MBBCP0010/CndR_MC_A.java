package mcframe.clientMBBC.MBBCP0010;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public static final String $biz_typ_nm = "biz_typ_nm";
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public static final String $report_id = "report_id";
	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public static final String $report_nm = "report_nm";
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
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
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
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public static final String $data_crud_typ_nm = "data_crud_typ_nm";
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
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public static final String $rpt_attr1 = "rpt_attr1";
	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public static final String $rpt_attr2 = "rpt_attr2";
	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public static final String $rpt_attr3 = "rpt_attr3";
	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public static final String $rpt_attr4 = "rpt_attr4";
	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public static final String $rpt_attr5 = "rpt_attr5";
	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public static final String $rpt_attr6 = "rpt_attr6";
	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public static final String $rpt_attr7 = "rpt_attr7";
	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public static final String $rpt_attr8 = "rpt_attr8";
	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public static final String $rpt_attr9 = "rpt_attr9";
	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public static final String $rpt_attr10 = "rpt_attr10";
	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public static final String $rpt_attr11 = "rpt_attr11";
	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public static final String $rpt_attr12 = "rpt_attr12";
	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public static final String $rpt_attr13 = "rpt_attr13";
	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public static final String $rpt_attr14 = "rpt_attr14";
	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public static final String $rpt_attr15 = "rpt_attr15";
	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public static final String $rpt_attr16 = "rpt_attr16";
	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public static final String $rpt_attr17 = "rpt_attr17";
	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public static final String $rpt_attr18 = "rpt_attr18";
	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public static final String $rpt_attr19 = "rpt_attr19";
	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public static final String $rpt_attr20 = "rpt_attr20";
	public static final String $bp_grp = "bp_grp";

	public static final String $bp_grp_lab1 = $bp_grp + ".bp_grp_lab1";
	public static final String $bp_grp_flg1 = $bp_grp + ".bp_grp_flg1";
	public static final String $bp_grp_cd1 = $bp_grp + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp + ".bp_grp_nm1";
	public static final String $bp_grp_lab2 = $bp_grp + ".bp_grp_lab2";
	public static final String $bp_grp_flg2 = $bp_grp + ".bp_grp_flg2";
	public static final String $bp_grp_cd2 = $bp_grp + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp + ".bp_grp_nm2";
	public static final String $bp_grp_lab3 = $bp_grp + ".bp_grp_lab3";
	public static final String $bp_grp_flg3 = $bp_grp + ".bp_grp_flg3";
	public static final String $bp_grp_cd3 = $bp_grp + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp + ".bp_grp_nm3";
	public static final String $bp_grp_lab4 = $bp_grp + ".bp_grp_lab4";
	public static final String $bp_grp_flg4 = $bp_grp + ".bp_grp_flg4";
	public static final String $bp_grp_cd4 = $bp_grp + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp + ".bp_grp_nm4";
	public static final String $bp_grp_lab5 = $bp_grp + ".bp_grp_lab5";
	public static final String $bp_grp_flg5 = $bp_grp + ".bp_grp_flg5";
	public static final String $bp_grp_cd5 = $bp_grp + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp + ".bp_grp_nm5";
	public static final String $bp_grp_lab6 = $bp_grp + ".bp_grp_lab6";
	public static final String $bp_grp_flg6 = $bp_grp + ".bp_grp_flg6";
	public static final String $bp_grp_cd6 = $bp_grp + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp + ".bp_grp_nm6";
	public static final String $bp_grp_lab7 = $bp_grp + ".bp_grp_lab7";
	public static final String $bp_grp_flg7 = $bp_grp + ".bp_grp_flg7";
	public static final String $bp_grp_cd7 = $bp_grp + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp + ".bp_grp_nm7";
	public static final String $bp_grp_lab8 = $bp_grp + ".bp_grp_lab8";
	public static final String $bp_grp_flg8 = $bp_grp + ".bp_grp_flg8";
	public static final String $bp_grp_cd8 = $bp_grp + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp + ".bp_grp_nm8";
	public static final String $bp_grp_lab9 = $bp_grp + ".bp_grp_lab9";
	public static final String $bp_grp_flg9 = $bp_grp + ".bp_grp_flg9";
	public static final String $bp_grp_cd9 = $bp_grp + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp + ".bp_grp_nm9";
	public static final String $bp_grp_lab10 = $bp_grp + ".bp_grp_lab10";
	public static final String $bp_grp_flg10 = $bp_grp + ".bp_grp_flg10";
	public static final String $bp_grp_cd10 = $bp_grp + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp + ".bp_grp_nm10";

	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_typ_nm_META = createCommonMeta($biz_typ_nm, mcframe.commonMA.meta.MA_META.BIZ_TYP_NM);
	public static final MCMeta report_id_META = createCommonMeta($report_id, mcframe.commonMA.meta.MA_META.REPORT_ID);
	public static final MCMeta report_nm_META = createCommonMeta($report_nm, mcframe.commonMA.meta.MA_META.REPORT_NM);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta dt_fr_META = createCommonMeta($dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt_to_META = createCommonMeta($dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta amt_fr_META = createCommonMeta($amt_fr, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_to_META = createCommonMeta($amt_to, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta data_crud_typ_nm_META = createCommonMeta($data_crud_typ_nm, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP_NM);
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
	public static final MCMeta bp_grp_META = createInnerRowMeta($bp_grp, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_typ_META,
			biz_typ_nm_META,
			report_id_META,
			report_nm_META,
			file_nm_META,
			dt_fr_META,
			dt_to_META,
			bp_cd_META,
			bp_nm_META,
			amt_fr_META,
			amt_to_META,
			cur_cd_META,
			cur_nm_META,
			data_no_META,
			data_crud_typ_META,
			data_crud_typ_nm_META,
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
			bp_grp_META
		},
		new String[][]{
			{
				"bp_grp_flg1",
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_flg2",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_flg3",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_flg4",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_flg5",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_flg6",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_flg7",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_flg8",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_flg9",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_flg10",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$bp_grp_flg1,
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_flg2,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_flg3,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_flg4,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_flg5,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_flg6,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_flg7,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_flg8,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_flg9,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_flg10,
				$bp_grp_cd10,
				$bp_grp_nm10
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
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
	 * Business type name 業務区分名.<p>
	 *
	 */
	public String biz_typ_nm() {
		return getConstString(offset + 1, $biz_typ_nm);
	}

	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public void biz_typ_nm(String value) {
		setConstString(offset + 1, $biz_typ_nm, value);
	}


	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public String report_id() {
		return getConstString(offset + 2, $report_id);
	}

	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public void report_id(String value) {
		setConstString(offset + 2, $report_id, value);
	}


	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public String report_nm() {
		return getConstString(offset + 3, $report_nm);
	}

	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public void report_nm(String value) {
		setConstString(offset + 3, $report_nm, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 4, $file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 4, $file_nm, value);
	}


	/**
	 * Transaction date FROM 取引年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate dt_fr() {
		return getConstDate(offset + 5, $dt_fr);
	}

	/**
	 * Transaction date FROM 取引年月日ＦＲＯＭ.<p>
	 *
	 */
	public void dt_fr(MCDate value) {
		setConstDate(offset + 5, $dt_fr, value);
	}


	/**
	 * Transaction date TO 取引年月日ＴＯ.<p>
	 *
	 */
	public MCDate dt_to() {
		return getConstDate(offset + 6, $dt_to);
	}

	/**
	 * Transaction date TO 取引年月日ＴＯ.<p>
	 *
	 */
	public void dt_to(MCDate value) {
		setConstDate(offset + 6, $dt_to, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 7, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 7, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 8, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 8, $bp_nm, value);
	}


	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber amt_fr() {
		return getConstNumber(offset + 9, $amt_fr);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(MCNumber value) {
		setConstNumber(offset + 9, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(int value) {
		setConstNumber(offset + 9, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(long value) {
		setConstNumber(offset + 9, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(float value) {
		setConstNumber(offset + 9, $amt_fr, value);
	}

	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public void amt_fr(double value) {
		setConstNumber(offset + 9, $amt_fr, value);
	}


	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public MCNumber amt_to() {
		return getConstNumber(offset + 10, $amt_to);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(MCNumber value) {
		setConstNumber(offset + 10, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(int value) {
		setConstNumber(offset + 10, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(long value) {
		setConstNumber(offset + 10, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(float value) {
		setConstNumber(offset + 10, $amt_to, value);
	}

	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public void amt_to(double value) {
		setConstNumber(offset + 10, $amt_to, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 11, $cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 11, $cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 12, $cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 12, $cur_nm, value);
	}


	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 13, $data_no);
	}

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 13, $data_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 14, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 14, $data_crud_typ, value);
	}


	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public String data_crud_typ_nm() {
		return getConstString(offset + 15, $data_crud_typ_nm);
	}

	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public void data_crud_typ_nm(String value) {
		setConstString(offset + 15, $data_crud_typ_nm, value);
	}


	/**
	 * Display data before correction 訂正前データ表示.<p>
	 *
	 */
	public boolean disp_old_flg() {
		return getConstBoolean(offset + 16, $disp_old_flg);
	}

	/**
	 * Display data before correction 訂正前データ表示.<p>
	 *
	 */
	public void disp_old_flg(boolean value) {
		setConstBoolean(offset + 16, $disp_old_flg, value);
	}


	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public String biz_key1() {
		return getConstString(offset + 17, $biz_key1);
	}

	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public void biz_key1(String value) {
		setConstString(offset + 17, $biz_key1, value);
	}


	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public String biz_key2() {
		return getConstString(offset + 18, $biz_key2);
	}

	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public void biz_key2(String value) {
		setConstString(offset + 18, $biz_key2, value);
	}


	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public String biz_key3() {
		return getConstString(offset + 19, $biz_key3);
	}

	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public void biz_key3(String value) {
		setConstString(offset + 19, $biz_key3, value);
	}


	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public String biz_key4() {
		return getConstString(offset + 20, $biz_key4);
	}

	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public void biz_key4(String value) {
		setConstString(offset + 20, $biz_key4, value);
	}


	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public String biz_key5() {
		return getConstString(offset + 21, $biz_key5);
	}

	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public void biz_key5(String value) {
		setConstString(offset + 21, $biz_key5, value);
	}


	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public String biz_key6() {
		return getConstString(offset + 22, $biz_key6);
	}

	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public void biz_key6(String value) {
		setConstString(offset + 22, $biz_key6, value);
	}


	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public String biz_key7() {
		return getConstString(offset + 23, $biz_key7);
	}

	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public void biz_key7(String value) {
		setConstString(offset + 23, $biz_key7, value);
	}


	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public String biz_key8() {
		return getConstString(offset + 24, $biz_key8);
	}

	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public void biz_key8(String value) {
		setConstString(offset + 24, $biz_key8, value);
	}


	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public String biz_key9() {
		return getConstString(offset + 25, $biz_key9);
	}

	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public void biz_key9(String value) {
		setConstString(offset + 25, $biz_key9, value);
	}


	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public String biz_key10() {
		return getConstString(offset + 26, $biz_key10);
	}

	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public void biz_key10(String value) {
		setConstString(offset + 26, $biz_key10, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 27, $rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 27, $rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 28, $rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 28, $rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 29, $rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 29, $rmrks3, value);
	}


	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 30, $rmrks4);
	}

	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 30, $rmrks4, value);
	}


	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 31, $rmrks5);
	}

	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 31, $rmrks5, value);
	}


	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public String rpt_attr1() {
		return getConstString(offset + 32, $rpt_attr1);
	}

	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public void rpt_attr1(String value) {
		setConstString(offset + 32, $rpt_attr1, value);
	}


	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public String rpt_attr2() {
		return getConstString(offset + 33, $rpt_attr2);
	}

	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public void rpt_attr2(String value) {
		setConstString(offset + 33, $rpt_attr2, value);
	}


	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public String rpt_attr3() {
		return getConstString(offset + 34, $rpt_attr3);
	}

	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public void rpt_attr3(String value) {
		setConstString(offset + 34, $rpt_attr3, value);
	}


	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public String rpt_attr4() {
		return getConstString(offset + 35, $rpt_attr4);
	}

	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public void rpt_attr4(String value) {
		setConstString(offset + 35, $rpt_attr4, value);
	}


	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public String rpt_attr5() {
		return getConstString(offset + 36, $rpt_attr5);
	}

	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public void rpt_attr5(String value) {
		setConstString(offset + 36, $rpt_attr5, value);
	}


	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public String rpt_attr6() {
		return getConstString(offset + 37, $rpt_attr6);
	}

	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public void rpt_attr6(String value) {
		setConstString(offset + 37, $rpt_attr6, value);
	}


	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public String rpt_attr7() {
		return getConstString(offset + 38, $rpt_attr7);
	}

	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public void rpt_attr7(String value) {
		setConstString(offset + 38, $rpt_attr7, value);
	}


	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public String rpt_attr8() {
		return getConstString(offset + 39, $rpt_attr8);
	}

	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public void rpt_attr8(String value) {
		setConstString(offset + 39, $rpt_attr8, value);
	}


	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public String rpt_attr9() {
		return getConstString(offset + 40, $rpt_attr9);
	}

	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public void rpt_attr9(String value) {
		setConstString(offset + 40, $rpt_attr9, value);
	}


	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public String rpt_attr10() {
		return getConstString(offset + 41, $rpt_attr10);
	}

	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public void rpt_attr10(String value) {
		setConstString(offset + 41, $rpt_attr10, value);
	}


	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public String rpt_attr11() {
		return getConstString(offset + 42, $rpt_attr11);
	}

	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public void rpt_attr11(String value) {
		setConstString(offset + 42, $rpt_attr11, value);
	}


	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public String rpt_attr12() {
		return getConstString(offset + 43, $rpt_attr12);
	}

	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public void rpt_attr12(String value) {
		setConstString(offset + 43, $rpt_attr12, value);
	}


	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public String rpt_attr13() {
		return getConstString(offset + 44, $rpt_attr13);
	}

	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public void rpt_attr13(String value) {
		setConstString(offset + 44, $rpt_attr13, value);
	}


	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public String rpt_attr14() {
		return getConstString(offset + 45, $rpt_attr14);
	}

	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public void rpt_attr14(String value) {
		setConstString(offset + 45, $rpt_attr14, value);
	}


	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public String rpt_attr15() {
		return getConstString(offset + 46, $rpt_attr15);
	}

	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public void rpt_attr15(String value) {
		setConstString(offset + 46, $rpt_attr15, value);
	}


	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public String rpt_attr16() {
		return getConstString(offset + 47, $rpt_attr16);
	}

	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public void rpt_attr16(String value) {
		setConstString(offset + 47, $rpt_attr16, value);
	}


	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public String rpt_attr17() {
		return getConstString(offset + 48, $rpt_attr17);
	}

	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public void rpt_attr17(String value) {
		setConstString(offset + 48, $rpt_attr17, value);
	}


	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public String rpt_attr18() {
		return getConstString(offset + 49, $rpt_attr18);
	}

	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public void rpt_attr18(String value) {
		setConstString(offset + 49, $rpt_attr18, value);
	}


	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public String rpt_attr19() {
		return getConstString(offset + 50, $rpt_attr19);
	}

	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public void rpt_attr19(String value) {
		setConstString(offset + 50, $rpt_attr19, value);
	}


	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public String rpt_attr20() {
		return getConstString(offset + 51, $rpt_attr20);
	}

	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public void rpt_attr20(String value) {
		setConstString(offset + 51, $rpt_attr20, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR bp_grp(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 52, $bp_grp);
	}
	
	public void bp_grp(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 52, $bp_grp, row);
	}


	public String getString(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			return report_nm();
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
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			return data_crud_typ_nm();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			return report_nm();
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
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			return data_crud_typ_nm();
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
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			report_nm(value);
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
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			data_crud_typ_nm(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($report_nm.equalsIgnoreCase(name)) {
			report_nm(value);
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
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			data_crud_typ_nm(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($bp_grp.equalsIgnoreCase(name)) {
			return bp_grp();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bp_grp.equalsIgnoreCase(name)) {
			bp_grp(
				((MCContainerMeta) bp_grp_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public boolean bp_grp_flg1() {
		return bp_grp().bp_grp_flg1();
	}

	/**
	 * BP classification 1 取引先分類１.<p>
	 *
	 */
	public void bp_grp_flg1(boolean value) {
		bp_grp().bp_grp_flg1(value);
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp().bp_grp_cd1();
	}

	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp().bp_grp_cd1(value);
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp().bp_grp_nm1();
	}

	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp().bp_grp_nm1(value);
	}

	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public boolean bp_grp_flg2() {
		return bp_grp().bp_grp_flg2();
	}

	/**
	 * BP classification 2 取引先分類２.<p>
	 *
	 */
	public void bp_grp_flg2(boolean value) {
		bp_grp().bp_grp_flg2(value);
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp().bp_grp_cd2();
	}

	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp().bp_grp_cd2(value);
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp().bp_grp_nm2();
	}

	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp().bp_grp_nm2(value);
	}

	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public boolean bp_grp_flg3() {
		return bp_grp().bp_grp_flg3();
	}

	/**
	 * BP classification 3 取引先分類３.<p>
	 *
	 */
	public void bp_grp_flg3(boolean value) {
		bp_grp().bp_grp_flg3(value);
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp().bp_grp_cd3();
	}

	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp().bp_grp_cd3(value);
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp().bp_grp_nm3();
	}

	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp().bp_grp_nm3(value);
	}

	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public boolean bp_grp_flg4() {
		return bp_grp().bp_grp_flg4();
	}

	/**
	 * BP classification 4 取引先分類４.<p>
	 *
	 */
	public void bp_grp_flg4(boolean value) {
		bp_grp().bp_grp_flg4(value);
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp().bp_grp_cd4();
	}

	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp().bp_grp_cd4(value);
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp().bp_grp_nm4();
	}

	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp().bp_grp_nm4(value);
	}

	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public boolean bp_grp_flg5() {
		return bp_grp().bp_grp_flg5();
	}

	/**
	 * BP classification 5 取引先分類５.<p>
	 *
	 */
	public void bp_grp_flg5(boolean value) {
		bp_grp().bp_grp_flg5(value);
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp().bp_grp_cd5();
	}

	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp().bp_grp_cd5(value);
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp().bp_grp_nm5();
	}

	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp().bp_grp_nm5(value);
	}

	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public boolean bp_grp_flg6() {
		return bp_grp().bp_grp_flg6();
	}

	/**
	 * BP classification 6 取引先分類６.<p>
	 *
	 */
	public void bp_grp_flg6(boolean value) {
		bp_grp().bp_grp_flg6(value);
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp().bp_grp_cd6();
	}

	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp().bp_grp_cd6(value);
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp().bp_grp_nm6();
	}

	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp().bp_grp_nm6(value);
	}

	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public boolean bp_grp_flg7() {
		return bp_grp().bp_grp_flg7();
	}

	/**
	 * BP classification 7 取引先分類７.<p>
	 *
	 */
	public void bp_grp_flg7(boolean value) {
		bp_grp().bp_grp_flg7(value);
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp().bp_grp_cd7();
	}

	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp().bp_grp_cd7(value);
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp().bp_grp_nm7();
	}

	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp().bp_grp_nm7(value);
	}

	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public boolean bp_grp_flg8() {
		return bp_grp().bp_grp_flg8();
	}

	/**
	 * BP classification 8 取引先分類８.<p>
	 *
	 */
	public void bp_grp_flg8(boolean value) {
		bp_grp().bp_grp_flg8(value);
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp().bp_grp_cd8();
	}

	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp().bp_grp_cd8(value);
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp().bp_grp_nm8();
	}

	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp().bp_grp_nm8(value);
	}

	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public boolean bp_grp_flg9() {
		return bp_grp().bp_grp_flg9();
	}

	/**
	 * BP classification 9 取引先分類９.<p>
	 *
	 */
	public void bp_grp_flg9(boolean value) {
		bp_grp().bp_grp_flg9(value);
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp().bp_grp_cd9();
	}

	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp().bp_grp_cd9(value);
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp().bp_grp_nm9();
	}

	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp().bp_grp_nm9(value);
	}

	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public boolean bp_grp_flg10() {
		return bp_grp().bp_grp_flg10();
	}

	/**
	 * BP classification 10 取引先分類１０.<p>
	 *
	 */
	public void bp_grp_flg10(boolean value) {
		bp_grp().bp_grp_flg10(value);
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp().bp_grp_cd10();
	}

	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp().bp_grp_cd10(value);
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp().bp_grp_nm10();
	}

	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp().bp_grp_nm10(value);
	}

}

