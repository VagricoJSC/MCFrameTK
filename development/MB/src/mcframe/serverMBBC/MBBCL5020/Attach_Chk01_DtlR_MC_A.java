package mcframe.serverMBBC.MBBCL5020;

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
 * ブロック"Attach_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Attach_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * Version 版.<p>
	 *
	 */
	public static final String $edition = "edition";
	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
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
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public static final String $report_id = "report_id";
	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public static final String $amt = "amt";
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
	 * Attachment source file 添付元ファイル.<p>
	 *
	 */
	public static final String $file_bin = "file_bin";
	/**
	 * Document ID ドキュメントID.<p>
	 *
	 */
	public static final String $doc_id = "doc_id";
	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_char1 = "edi_sub_char1";
	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_char2 = "edi_sub_char2";
	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_char3 = "edi_sub_char3";
	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_char4 = "edi_sub_char4";
	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_char5 = "edi_sub_char5";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	/**
	 * Select external file flg. 外部ファイル選択ＦＬＧ.<p>
	 *
	 */
	public static final String $select_file_flg = "select_file_flg";
	/**
	 * Attach file flg. ファイル添付ＦＬＧ.<p>
	 *
	 */
	public static final String $attach_file_flg = "attach_file_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";


	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta edition_META = createCommonMeta($edition, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
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
	public static final MCMeta report_id_META = createCommonMeta($report_id, mcframe.commonMA.meta.MA_META.REPORT_ID);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta file_bin_META = createCommonMeta($file_bin, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta doc_id_META = createCommonMeta($doc_id, mcframe.commonMA.meta.MA_META.DOC_ID);
	public static final MCMeta file_path_META = createCommonMeta($file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta select_file_flg_META = createCommonMeta($select_file_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta attach_file_flg_META = createCommonMeta($attach_file_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);

	protected static final ConstMetaList<Attach_Chk01_DtlR> constMetas = new ConstMetaList<Attach_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_no_META,
			edition_META,
			biz_typ_META,
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
			report_id_META,
			dt_META,
			bp_cd_META,
			cur_cd_META,
			amt_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META,
			file_bin_META,
			doc_id_META,
			file_path_META,
			file_nm_META,
			wg_cd_META,
			sls_dpt_cd_META,
			purc_dpt_cd_META,
			ar_dpt_cd_META,
			bill_dpt_cd_META,
			bsppl_dpt_cd_META,
			dlv_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			cst_cd_META,
			acst_cd_META,
			bcst_cd_META,
			sppl_cd_META,
			asppl_cd_META,
			bsppl_cd_META,
			psppl_cd_META,
			cntry_cd_META,
			ptax_cur_cd_META,
			wrk_no_META,
			tterm_cd1_META,
			tterm_cd2_META,
			tterm_cd3_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			upd_cntr_META,
			if_proc_typ_META,
			select_file_flg_META,
			attach_file_flg_META,
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$biz_typ, "E"},	// biz_typ
				{$biz_key1, "E"},	// biz_key1
				{$dt, "E"}	// dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$file_path, "E"},	// file_path
				{$file_nm, "E"}	// file_nm
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$bp_cd, "MA.MAUAL0010.Bp"},	// bp_cd
				{$cur_cd, "MA.MAUAL0010.Cur"}	// cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$biz_typ, "MAC_BIZ_TYP"}	// biz_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Attach_Chk01_DtlR_MC_A(ConstMetaList<? extends Attach_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Attach_Chk01_DtlR clone() {
		return (Attach_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Attach_Chk01_DtlR createInstance() {
		return (Attach_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Attach_Chk01_DtlR getValues(String... names) {
		return (Attach_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 0, $data_no);
	}

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 0, $data_no, value);
	}


	/**
	 * Version 版.<p>
	 *
	 */
	public MCNumber edition() {
		return getConstNumber(offset + 1, $edition);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(MCNumber value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(int value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(long value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(float value) {
		setConstNumber(offset + 1, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(double value) {
		setConstNumber(offset + 1, $edition, value);
	}


	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 2, $biz_typ);
	}

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 2, $biz_typ, value);
	}


	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public String biz_key1() {
		return getConstString(offset + 3, $biz_key1);
	}

	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public void biz_key1(String value) {
		setConstString(offset + 3, $biz_key1, value);
	}


	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public String biz_key2() {
		return getConstString(offset + 4, $biz_key2);
	}

	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public void biz_key2(String value) {
		setConstString(offset + 4, $biz_key2, value);
	}


	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public String biz_key3() {
		return getConstString(offset + 5, $biz_key3);
	}

	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public void biz_key3(String value) {
		setConstString(offset + 5, $biz_key3, value);
	}


	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public String biz_key4() {
		return getConstString(offset + 6, $biz_key4);
	}

	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public void biz_key4(String value) {
		setConstString(offset + 6, $biz_key4, value);
	}


	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public String biz_key5() {
		return getConstString(offset + 7, $biz_key5);
	}

	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public void biz_key5(String value) {
		setConstString(offset + 7, $biz_key5, value);
	}


	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public String biz_key6() {
		return getConstString(offset + 8, $biz_key6);
	}

	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public void biz_key6(String value) {
		setConstString(offset + 8, $biz_key6, value);
	}


	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public String biz_key7() {
		return getConstString(offset + 9, $biz_key7);
	}

	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public void biz_key7(String value) {
		setConstString(offset + 9, $biz_key7, value);
	}


	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public String biz_key8() {
		return getConstString(offset + 10, $biz_key8);
	}

	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public void biz_key8(String value) {
		setConstString(offset + 10, $biz_key8, value);
	}


	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public String biz_key9() {
		return getConstString(offset + 11, $biz_key9);
	}

	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public void biz_key9(String value) {
		setConstString(offset + 11, $biz_key9, value);
	}


	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public String biz_key10() {
		return getConstString(offset + 12, $biz_key10);
	}

	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public void biz_key10(String value) {
		setConstString(offset + 12, $biz_key10, value);
	}


	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public String report_id() {
		return getConstString(offset + 13, $report_id);
	}

	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public void report_id(String value) {
		setConstString(offset + 13, $report_id, value);
	}


	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 14, $dt);
	}

	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 14, $dt, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 15, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 15, $bp_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 16, $cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 16, $cur_cd, value);
	}


	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 17, $amt);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 17, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 17, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 17, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 17, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 17, $amt, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 18, $rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 18, $rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 19, $rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 19, $rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 20, $rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 20, $rmrks3, value);
	}


	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 21, $rmrks4);
	}

	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 21, $rmrks4, value);
	}


	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 22, $rmrks5);
	}

	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 22, $rmrks5, value);
	}


	/**
	 * Attachment source file 添付元ファイル.<p>
	 *
	 */
	public MCBinary file_bin() {
		return getConstBinary(offset + 23, $file_bin);
	}

	/**
	 * Attachment source file 添付元ファイル.<p>
	 *
	 */
	public void file_bin(MCBinary value) {
		setConstBinary(offset + 23, $file_bin, value);
	}


	/**
	 * Document ID ドキュメントID.<p>
	 *
	 */
	public String doc_id() {
		return getConstString(offset + 24, $doc_id);
	}

	/**
	 * Document ID ドキュメントID.<p>
	 *
	 */
	public void doc_id(String value) {
		setConstString(offset + 24, $doc_id, value);
	}


	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 25, $file_path);
	}

	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 25, $file_path, value);
	}


	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 26, $file_nm);
	}

	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 26, $file_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 27, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 27, $wg_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 28, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 28, $sls_dpt_cd, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 29, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 29, $purc_dpt_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 30, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 30, $ar_dpt_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 31, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 31, $bill_dpt_cd, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 32, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 32, $bsppl_dpt_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 33, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 33, $dlv_cd, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 34, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 34, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 35, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 35, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 36, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 36, $dest_cd3, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 37, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 37, $cst_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 38, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 38, $acst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 39, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 39, $bcst_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 40, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 40, $sppl_cd, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 41, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 41, $asppl_cd, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 42, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 42, $bsppl_cd, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 43, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 43, $psppl_cd, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 44, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 44, $cntry_cd, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 45, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 45, $ptax_cur_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 46, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 46, $wrk_no, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 47, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 47, $tterm_cd1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 48, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 48, $tterm_cd2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 49, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 49, $tterm_cd3, value);
	}


	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 50, $edi_sub_char1);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 50, $edi_sub_char1, value);
	}


	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 51, $edi_sub_char2);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 51, $edi_sub_char2, value);
	}


	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 52, $edi_sub_char3);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 52, $edi_sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 53, $edi_sub_char4);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 53, $edi_sub_char4, value);
	}


	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 54, $edi_sub_char5);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 54, $edi_sub_char5, value);
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
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 56, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 56, $if_proc_typ, value);
	}


	/**
	 * Select external file flg. 外部ファイル選択ＦＬＧ.<p>
	 *
	 */
	public boolean select_file_flg() {
		return getConstBoolean(offset + 57, $select_file_flg);
	}

	/**
	 * Select external file flg. 外部ファイル選択ＦＬＧ.<p>
	 *
	 */
	public void select_file_flg(boolean value) {
		setConstBoolean(offset + 57, $select_file_flg, value);
	}


	/**
	 * Attach file flg. ファイル添付ＦＬＧ.<p>
	 *
	 */
	public boolean attach_file_flg() {
		return getConstBoolean(offset + 58, $attach_file_flg);
	}

	/**
	 * Attach file flg. ファイル添付ＦＬＧ.<p>
	 *
	 */
	public void attach_file_flg(boolean value) {
		setConstBoolean(offset + 58, $attach_file_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 59, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 59, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 59, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 59, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 59, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 59, $peg_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 60, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 60, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 61, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 61, $rtn_sts_typ, value);
	}


	public String getString(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
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
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
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
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($select_file_flg.equalsIgnoreCase(name)) {
			return select_file_flg();
		}
		if ($attach_file_flg.equalsIgnoreCase(name)) {
			return attach_file_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
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
		if ($report_id.equalsIgnoreCase(name)) {
			return report_id();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
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
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($select_file_flg.equalsIgnoreCase(name)) {
			return select_file_flg();
		}
		if ($attach_file_flg.equalsIgnoreCase(name)) {
			return attach_file_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
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
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($select_file_flg.equalsIgnoreCase(name)) {
			select_file_flg(value);
			return;
		}
		if ($attach_file_flg.equalsIgnoreCase(name)) {
			attach_file_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
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
		if ($report_id.equalsIgnoreCase(name)) {
			report_id(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($select_file_flg.equalsIgnoreCase(name)) {
			select_file_flg(value);
			return;
		}
		if ($attach_file_flg.equalsIgnoreCase(name)) {
			attach_file_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

