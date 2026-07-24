package mcframe.clientMBBC.MBBCP0020;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC.MB_MBBCL0020_Srch01Caller;
import mcframe.clientMBBC.MBBCP0020.MBBCP_AttachmentLstReg_MC.MB_MBBCL0020_Upd01Caller;

/**
 * 画面"MBBCP_AttachmentLstReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCP_AttachmentLstReg_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBCP0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [AttachTyp]ブロック関連のField定義
	public MCPanel AttachTypPanel = null;
	// [AttachTyp]ブロックの項目のField定義
	/**
	 * Attached 添付済.<p>
	 *
	 */
	public MCCheckBox AttachTyp_attach_flg = null;
	/**
	 * Unattached 未添付.<p>
	 *
	 */
	public MCCheckBox AttachTyp_no_attach_flg = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBC.MBBCP0020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
	/**
	 * Version 版.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edition = null;
	/**
	 * Select external file 外部ファイル選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_select_file_flg = null;
	/**
	 * Attach file ファイル添付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_attach_file_flg = null;
	/**
	 * Attached 添付済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_archive_flg = null;
	/**
	 * Attach unstored file 未保存ファイル添付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_attach = null;
	/**
	 * Attach stored file 保存済ファイル添付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_select_file = null;
	/**
	 * Attachment source file path 添付元ファイルパス.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_file_path = null;
	/**
	 * Attachment source file name 添付元ファイル名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_src_file_nm = null;
	/**
	 * Select storage location 保存先選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_save_as = null;
	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public MCColumnConfig columnRslt_file_path = null;
	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_file_nm = null;
	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_typ = null;
	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_typ_nm = null;
	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key1 = null;
	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key2 = null;
	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key3 = null;
	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key4 = null;
	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key5 = null;
	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key6 = null;
	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key7 = null;
	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key8 = null;
	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key9 = null;
	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key10 = null;
	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dt = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fs_flg = null;
	public MCColumnConfig columnRslt_doc_id = null;
	public MCColumnConfig columnRslt_preview_url = null;
	public MCColumnConfig columnRslt_old_file_path = null;
	public MCColumnConfig columnRslt_old_file_nm = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks1 = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks2 = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks3 = null;
	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks4 = null;
	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks5 = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_cd = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_cd = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dpt_cd = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_cd = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cd = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd3 = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_cd = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bcst_cd = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_cd = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cd = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_cd = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_cd = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_cd = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_no = null;
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd1 = null;
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd2 = null;
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd3 = null;
	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_sub_char1 = null;
	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_sub_char2 = null;
	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_sub_char3 = null;
	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_sub_char4 = null;
	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_sub_char5 = null;
	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr1 = null;
	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr2 = null;
	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr3 = null;
	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr4 = null;
	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr5 = null;
	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr6 = null;
	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr7 = null;
	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr8 = null;
	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr9 = null;
	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr10 = null;
	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr11 = null;
	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr12 = null;
	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr13 = null;
	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr14 = null;
	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr15 = null;
	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr16 = null;
	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr17 = null;
	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr18 = null;
	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr19 = null;
	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr20 = null;
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_crud_typ = null;
	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_crud_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Open 開く.<p>
	 *
	 */
	public MCButton Btn_open_file = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MB_MBBCL0020_Srch01]のCallerの作成 */
	protected MBBCP_AttachmentLstReg_MC.MB_MBBCL0020_Srch01Caller createMB_MBBCL0020_Srch01() {
		MBBCP_AttachmentLstReg_MC.MB_MBBCL0020_Srch01Caller<MBBCP_AttachmentLstReg, MB_MBBCL0020_Srch01Bridge>
		caller = ((MBBCP_AttachmentLstReg_MC)this).new MB_MBBCL0020_Srch01Caller<MBBCP_AttachmentLstReg, MB_MBBCL0020_Srch01Bridge>(
					(MBBCP_AttachmentLstReg)this, new MB_MBBCL0020_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBCL0020_Srch01]の呼び出し */
	protected void callMB_MBBCL0020_Srch01() {
		MCCaller caller = createMB_MBBCL0020_Srch01();
		caller.exec();
	}
	/** [MB_MBBCL0020_Upd01]のCallerの作成 */
	protected MBBCP_AttachmentLstReg_MC.MB_MBBCL0020_Upd01Caller createMB_MBBCL0020_Upd01() {
		MBBCP_AttachmentLstReg_MC.MB_MBBCL0020_Upd01Caller<MBBCP_AttachmentLstReg, MB_MBBCL0020_Upd01Bridge>
		caller = ((MBBCP_AttachmentLstReg_MC)this).new MB_MBBCL0020_Upd01Caller<MBBCP_AttachmentLstReg, MB_MBBCL0020_Upd01Bridge>(
					(MBBCP_AttachmentLstReg)this, new MB_MBBCL0020_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBCL0020_Upd01]の呼び出し */
	protected void callMB_MBBCL0020_Upd01() {
		MCCaller caller = createMB_MBBCL0020_Upd01();
		caller.exec();
	}
	/** [AttachTyp]ブロックのコンテナField定義 */
	private final mcframe.clientMBBC.MBBCP0020.AttachTypR aAttachTypR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBC.MBBCP0020.RsltR> aRsltL;

	/**
	 * 項目コピーによってaAttachTypRを設定します。
	 *
	 * aAttachTypRのインスタンスは変更されません。
	 *
	 * @param row AttachTypR
	 */
	public void setAttachTypR(mcframe.clientMBBC.MBBCP0020.AttachTypR row) {
		if (row != null) {
			MCRow.copyall(getAttachTypR(), row);
		}
	}

	/**
	 * [AttachTyp]ブロックのコンテナaAttachTypRを返します。
	 *
	 * @return AttachTypR
	 */
	public mcframe.clientMBBC.MBBCP0020.AttachTypR getAttachTypR() {
		return aAttachTypR;
	}

	/**
	 * aAttachTypRを作成します。
	 *
	 * @return AttachTypR
	 */
	public mcframe.clientMBBC.MBBCP0020.AttachTypR createAttachTypR() {
		return mcframe.clientMBBC.MBBCP0020.AttachTypR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBC.MBBCP0020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBC.MBBCP0020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBC.MBBCP0020.RsltR createRsltR() {
		return mcframe.clientMBBC.MBBCP0020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBC.MBBCP0020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getAttachTypR())) ret.add(getAttachTypR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getAttachTypR()) return "AttachTyp";
		if(aCnt == getRsltL()) return "Rslt";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("AttachTyp")) return getAttachTypR();
		if(bId.equals("Rslt")) return getRsltL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(CndPanel);
		ret.add(AttachTypPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBCP_AttachmentLstReg_MC_A() {
		aAttachTypR = createAttachTypR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBCP_AttachmentLstReg_MC_A(String name) {
		aAttachTypR = createAttachTypR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBCP_AttachmentLstReg_MC.jbCreateCnd((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbCreateAttachTyp((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbCreateRslt((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbCreateBtn((MBBCP_AttachmentLstReg)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBCP_AttachmentLstReg p) {
	}

	/**
	 * [AttachTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAttachTyp(MBBCP_AttachmentLstReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBCP_AttachmentLstReg p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMBBC.MBBCP0020.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBCP_AttachmentLstReg p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Rslt_biz_typ_ListPutter]の定義 */
	private MCListPutter Rslt_biz_typ_p = null;

	/**
	 * [Rslt_biz_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_biz_typ_ListPutter() {
		if (Rslt_biz_typ_p == null) {
			Rslt_biz_typ_p = createRslt_biz_typ_ListPutter(columnRslt_biz_typ, "biz_typ", "biz_typ_nm");

		}
		return Rslt_biz_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBCP_AttachmentLstReg create(){
		MBBCP_AttachmentLstReg p = new MBBCP_AttachmentLstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBCP_AttachmentLstReg create(String name){
		MBBCP_AttachmentLstReg p = new MBBCP_AttachmentLstReg(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MBBCP_AttachmentLstReg_MC.jbfInitCnd((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbfInitAttachTyp((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbfInitRslt((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbfInitBtn((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbInitCnd((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbInitAttachTyp((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbInitRslt((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.jbInitBtn((MBBCP_AttachmentLstReg)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [AttachTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAttachTyp(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.AttachTypPanel = p.beansFactory.createPanel("AttachTyp");
		// ブロックの項目の初期化
		p.AttachTyp_attach_flg = p.beansFactory.createCheckBox("AttachTyp.attach_flg");
		p.AttachTyp_no_attach_flg = p.beansFactory.createCheckBox("AttachTyp.no_attach_flg");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.TEXT);
		p.columnRslt_edition = p.beansFactory.createTableColumn("Rslt.edition", MCColumnType.NUMBER);
		p.columnRslt_select_file_flg = p.beansFactory.createTableColumn("Rslt.select_file_flg", MCColumnType.CHECK);
		p.columnRslt_attach_file_flg = p.beansFactory.createTableColumn("Rslt.attach_file_flg", MCColumnType.CHECK);
		p.columnRslt_archive_flg = p.beansFactory.createTableColumn("Rslt.archive_flg", MCColumnType.CHECK);
		p.columnRslt_attach = p.beansFactory.createTableColumn("Rslt.attach", MCColumnType.BUTTON);
		p.columnRslt_select_file = p.beansFactory.createTableColumn("Rslt.select_file", MCColumnType.BUTTON);
		p.columnRslt_src_file_path = p.beansFactory.createTableColumn("Rslt.src_file_path", MCColumnType.TEXT);
		p.columnRslt_src_file_nm = p.beansFactory.createTableColumn("Rslt.src_file_nm", MCColumnType.TEXT);
		p.columnRslt_save_as = p.beansFactory.createTableColumn("Rslt.save_as", MCColumnType.BUTTON);
		p.columnRslt_file_path = p.beansFactory.createTableColumn("Rslt.file_path", MCColumnType.TEXT);
		p.columnRslt_file_nm = p.beansFactory.createTableColumn("Rslt.file_nm", MCColumnType.TEXT);
		p.columnRslt_biz_typ = p.beansFactory.createTableColumn("Rslt.biz_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_biz_typ_nm = p.beansFactory.createTableColumn("Rslt.biz_typ_nm", MCColumnType.TEXT);
		p.columnRslt_biz_key1 = p.beansFactory.createTableColumn("Rslt.biz_key1", MCColumnType.TEXT);
		p.columnRslt_biz_key2 = p.beansFactory.createTableColumn("Rslt.biz_key2", MCColumnType.TEXT);
		p.columnRslt_biz_key3 = p.beansFactory.createTableColumn("Rslt.biz_key3", MCColumnType.TEXT);
		p.columnRslt_biz_key4 = p.beansFactory.createTableColumn("Rslt.biz_key4", MCColumnType.TEXT);
		p.columnRslt_biz_key5 = p.beansFactory.createTableColumn("Rslt.biz_key5", MCColumnType.TEXT);
		p.columnRslt_biz_key6 = p.beansFactory.createTableColumn("Rslt.biz_key6", MCColumnType.TEXT);
		p.columnRslt_biz_key7 = p.beansFactory.createTableColumn("Rslt.biz_key7", MCColumnType.TEXT);
		p.columnRslt_biz_key8 = p.beansFactory.createTableColumn("Rslt.biz_key8", MCColumnType.TEXT);
		p.columnRslt_biz_key9 = p.beansFactory.createTableColumn("Rslt.biz_key9", MCColumnType.TEXT);
		p.columnRslt_biz_key10 = p.beansFactory.createTableColumn("Rslt.biz_key10", MCColumnType.TEXT);
		p.columnRslt_dt = p.beansFactory.createTableColumn("Rslt.dt", MCColumnType.DATE);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt = p.beansFactory.createTableColumn("Rslt.amt", MCColumnType.NUMBER);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_fs_flg = p.beansFactory.createTableColumn("Rslt.fs_flg", MCColumnType.CHECK);
		p.columnRslt_doc_id = p.beansFactory.createTableColumn("Rslt.doc_id", MCColumnType.TEXT);
		p.columnRslt_preview_url = p.beansFactory.createTableColumn("Rslt.preview_url", MCColumnType.TEXT);
		p.columnRslt_old_file_path = p.beansFactory.createTableColumn("Rslt.old_file_path", MCColumnType.TEXT);
		p.columnRslt_old_file_nm = p.beansFactory.createTableColumn("Rslt.old_file_nm", MCColumnType.TEXT);
		p.columnRslt_rmrks1 = p.beansFactory.createTableColumn("Rslt.rmrks1", MCColumnType.TEXT);
		p.columnRslt_rmrks2 = p.beansFactory.createTableColumn("Rslt.rmrks2", MCColumnType.TEXT);
		p.columnRslt_rmrks3 = p.beansFactory.createTableColumn("Rslt.rmrks3", MCColumnType.TEXT);
		p.columnRslt_rmrks4 = p.beansFactory.createTableColumn("Rslt.rmrks4", MCColumnType.TEXT);
		p.columnRslt_rmrks5 = p.beansFactory.createTableColumn("Rslt.rmrks5", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dest_cd1 = p.beansFactory.createTableColumn("Rslt.dest_cd1", MCColumnType.TEXT);
		p.columnRslt_dest_cd2 = p.beansFactory.createTableColumn("Rslt.dest_cd2", MCColumnType.TEXT);
		p.columnRslt_dest_cd3 = p.beansFactory.createTableColumn("Rslt.dest_cd3", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_acst_cd = p.beansFactory.createTableColumn("Rslt.acst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_psppl_cd = p.beansFactory.createTableColumn("Rslt.psppl_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_cd = p.beansFactory.createTableColumn("Rslt.cntry_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_edi_sub_char1 = p.beansFactory.createTableColumn("Rslt.edi_sub_char1", MCColumnType.TEXT);
		p.columnRslt_edi_sub_char2 = p.beansFactory.createTableColumn("Rslt.edi_sub_char2", MCColumnType.TEXT);
		p.columnRslt_edi_sub_char3 = p.beansFactory.createTableColumn("Rslt.edi_sub_char3", MCColumnType.TEXT);
		p.columnRslt_edi_sub_char4 = p.beansFactory.createTableColumn("Rslt.edi_sub_char4", MCColumnType.TEXT);
		p.columnRslt_edi_sub_char5 = p.beansFactory.createTableColumn("Rslt.edi_sub_char5", MCColumnType.TEXT);
		p.columnRslt_rpt_attr1 = p.beansFactory.createTableColumn("Rslt.rpt_attr1", MCColumnType.TEXT);
		p.columnRslt_rpt_attr2 = p.beansFactory.createTableColumn("Rslt.rpt_attr2", MCColumnType.TEXT);
		p.columnRslt_rpt_attr3 = p.beansFactory.createTableColumn("Rslt.rpt_attr3", MCColumnType.TEXT);
		p.columnRslt_rpt_attr4 = p.beansFactory.createTableColumn("Rslt.rpt_attr4", MCColumnType.TEXT);
		p.columnRslt_rpt_attr5 = p.beansFactory.createTableColumn("Rslt.rpt_attr5", MCColumnType.TEXT);
		p.columnRslt_rpt_attr6 = p.beansFactory.createTableColumn("Rslt.rpt_attr6", MCColumnType.TEXT);
		p.columnRslt_rpt_attr7 = p.beansFactory.createTableColumn("Rslt.rpt_attr7", MCColumnType.TEXT);
		p.columnRslt_rpt_attr8 = p.beansFactory.createTableColumn("Rslt.rpt_attr8", MCColumnType.TEXT);
		p.columnRslt_rpt_attr9 = p.beansFactory.createTableColumn("Rslt.rpt_attr9", MCColumnType.TEXT);
		p.columnRslt_rpt_attr10 = p.beansFactory.createTableColumn("Rslt.rpt_attr10", MCColumnType.TEXT);
		p.columnRslt_rpt_attr11 = p.beansFactory.createTableColumn("Rslt.rpt_attr11", MCColumnType.TEXT);
		p.columnRslt_rpt_attr12 = p.beansFactory.createTableColumn("Rslt.rpt_attr12", MCColumnType.TEXT);
		p.columnRslt_rpt_attr13 = p.beansFactory.createTableColumn("Rslt.rpt_attr13", MCColumnType.TEXT);
		p.columnRslt_rpt_attr14 = p.beansFactory.createTableColumn("Rslt.rpt_attr14", MCColumnType.TEXT);
		p.columnRslt_rpt_attr15 = p.beansFactory.createTableColumn("Rslt.rpt_attr15", MCColumnType.TEXT);
		p.columnRslt_rpt_attr16 = p.beansFactory.createTableColumn("Rslt.rpt_attr16", MCColumnType.TEXT);
		p.columnRslt_rpt_attr17 = p.beansFactory.createTableColumn("Rslt.rpt_attr17", MCColumnType.TEXT);
		p.columnRslt_rpt_attr18 = p.beansFactory.createTableColumn("Rslt.rpt_attr18", MCColumnType.TEXT);
		p.columnRslt_rpt_attr19 = p.beansFactory.createTableColumn("Rslt.rpt_attr19", MCColumnType.TEXT);
		p.columnRslt_rpt_attr20 = p.beansFactory.createTableColumn("Rslt.rpt_attr20", MCColumnType.TEXT);
		p.columnRslt_data_crud_typ = p.beansFactory.createTableColumn("Rslt.data_crud_typ", MCColumnType.TEXT);
		p.columnRslt_data_crud_typ_nm = p.beansFactory.createTableColumn("Rslt.data_crud_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_file = p.beansFactory.createButton("Btn.open_file", "open");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.AttachTypPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.CndPanel.setLastBeans(p.Cnd_srch);
	}

	/**
	 * [AttachTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAttachTyp(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.add(p.AttachTypPanel);
		p.AttachTypPanel.setNextBeans(p.RsltPanel);
		p.AttachTypPanel.setValueCheck(false);
		p.AttachTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AttachTypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.AttachTypPanel.add(p.AttachTyp_attach_flg);
		p.AttachTypPanel.setLastBeans(p.AttachTyp_attach_flg);
		p.AttachTyp_attach_flg.setNextBeans(p.AttachTyp_no_attach_flg);
		p.AttachTyp_attach_flg.setRow(p.getAttachTypR(), mcframe.clientMBBC.MBBCP0020.AttachTypR.attach_flg_META);
		p.AttachTypPanel.add(p.AttachTyp_no_attach_flg);
		p.AttachTyp_no_attach_flg.setRow(p.getAttachTypR(), mcframe.clientMBBC.MBBCP0020.AttachTypR.no_attach_flg_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBCP_AttachmentLstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_file.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_file);
		p.BtnPanel.setLastBeans(p.Btn_open_file);
		p.Btn_open_file.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MBBCP_AttachmentLstReg_MC.mcInitCnd((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.mcInitAttachTyp((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.mcInitRslt((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.mcInitBtn((MBBCP_AttachmentLstReg)this);

		// [SRCH]ステータスのモードの設定
		MBBCP_AttachmentLstReg_MC.statusInitSRCH_Cnd((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.statusInitSRCH_AttachTyp((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.statusInitSRCH_Rslt((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.statusInitSRCH_Btn((MBBCP_AttachmentLstReg)this);

		// [REF]ステータスのモードの設定
		MBBCP_AttachmentLstReg_MC.statusInitREF_Cnd((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.statusInitREF_AttachTyp((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.statusInitREF_Rslt((MBBCP_AttachmentLstReg)this);
		MBBCP_AttachmentLstReg_MC.statusInitREF_Btn((MBBCP_AttachmentLstReg)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBCP_AttachmentLstReg p) {
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [AttachTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAttachTyp(MBBCP_AttachmentLstReg p) {
		p.AttachTyp_attach_flg.addAllListener(p);
		p.AttachTyp_no_attach_flg.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBCP_AttachmentLstReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_edition.addAllListener(p);
		p.columnRslt_edition.setListListener(p);
		p.columnRslt_select_file_flg.addAllListener(p);
		p.columnRslt_attach_file_flg.addAllListener(p);
		p.columnRslt_archive_flg.addAllListener(p);
		p.columnRslt_attach.addAllListener(p);
		p.columnRslt_attach.setAPMethodName("doRslt_attach");
		p.columnRslt_select_file.addAllListener(p);
		p.columnRslt_select_file.setAPMethodName("doRslt_select_file");
		p.columnRslt_src_file_path.addAllListener(p);
		p.columnRslt_src_file_path.setListListener(p);
		p.columnRslt_src_file_nm.addAllListener(p);
		p.columnRslt_src_file_nm.setListListener(p);
		p.columnRslt_save_as.addAllListener(p);
		p.columnRslt_save_as.setAPMethodName("doRslt_save_as");
		p.columnRslt_file_path.addAllListener(p);
		p.columnRslt_file_path.setListListener(p);
		p.columnRslt_file_nm.addAllListener(p);
		p.columnRslt_file_nm.setListListener(p);
		p.columnRslt_biz_typ.addAllListener(p);
		p.columnRslt_biz_typ.setListListener(p);
		p.columnRslt_biz_typ_nm.addAllListener(p);
		p.columnRslt_biz_typ_nm.setListListener(p);
		p.columnRslt_biz_key1.addAllListener(p);
		p.columnRslt_biz_key1.setListListener(p);
		p.columnRslt_biz_key2.addAllListener(p);
		p.columnRslt_biz_key2.setListListener(p);
		p.columnRslt_biz_key3.addAllListener(p);
		p.columnRslt_biz_key3.setListListener(p);
		p.columnRslt_biz_key4.addAllListener(p);
		p.columnRslt_biz_key4.setListListener(p);
		p.columnRslt_biz_key5.addAllListener(p);
		p.columnRslt_biz_key5.setListListener(p);
		p.columnRslt_biz_key6.addAllListener(p);
		p.columnRslt_biz_key6.setListListener(p);
		p.columnRslt_biz_key7.addAllListener(p);
		p.columnRslt_biz_key7.setListListener(p);
		p.columnRslt_biz_key8.addAllListener(p);
		p.columnRslt_biz_key8.setListListener(p);
		p.columnRslt_biz_key9.addAllListener(p);
		p.columnRslt_biz_key9.setListListener(p);
		p.columnRslt_biz_key10.addAllListener(p);
		p.columnRslt_biz_key10.setListListener(p);
		p.columnRslt_dt.addAllListener(p);
		p.columnRslt_dt.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_amt.addAllListener(p);
		p.columnRslt_amt.setListListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_fs_flg.addAllListener(p);
		p.columnRslt_doc_id.addAllListener(p);
		p.columnRslt_doc_id.setListListener(p);
		p.columnRslt_preview_url.addAllListener(p);
		p.columnRslt_preview_url.setListListener(p);
		p.columnRslt_old_file_path.addAllListener(p);
		p.columnRslt_old_file_path.setListListener(p);
		p.columnRslt_old_file_nm.addAllListener(p);
		p.columnRslt_old_file_nm.setListListener(p);
		p.columnRslt_rmrks1.addAllListener(p);
		p.columnRslt_rmrks1.setListListener(p);
		p.columnRslt_rmrks2.addAllListener(p);
		p.columnRslt_rmrks2.setListListener(p);
		p.columnRslt_rmrks3.addAllListener(p);
		p.columnRslt_rmrks3.setListListener(p);
		p.columnRslt_rmrks4.addAllListener(p);
		p.columnRslt_rmrks4.setListListener(p);
		p.columnRslt_rmrks5.addAllListener(p);
		p.columnRslt_rmrks5.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_bill_dpt_cd.addAllListener(p);
		p.columnRslt_bill_dpt_cd.setListListener(p);
		p.columnRslt_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dest_cd1.addAllListener(p);
		p.columnRslt_dest_cd1.setListListener(p);
		p.columnRslt_dest_cd2.addAllListener(p);
		p.columnRslt_dest_cd2.setListListener(p);
		p.columnRslt_dest_cd3.addAllListener(p);
		p.columnRslt_dest_cd3.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_acst_cd.addAllListener(p);
		p.columnRslt_acst_cd.setListListener(p);
		p.columnRslt_bcst_cd.addAllListener(p);
		p.columnRslt_bcst_cd.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_psppl_cd.addAllListener(p);
		p.columnRslt_psppl_cd.setListListener(p);
		p.columnRslt_cntry_cd.addAllListener(p);
		p.columnRslt_cntry_cd.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_tterm_cd1.addAllListener(p);
		p.columnRslt_tterm_cd1.setListListener(p);
		p.columnRslt_tterm_cd2.addAllListener(p);
		p.columnRslt_tterm_cd2.setListListener(p);
		p.columnRslt_tterm_cd3.addAllListener(p);
		p.columnRslt_tterm_cd3.setListListener(p);
		p.columnRslt_edi_sub_char1.addAllListener(p);
		p.columnRslt_edi_sub_char1.setListListener(p);
		p.columnRslt_edi_sub_char2.addAllListener(p);
		p.columnRslt_edi_sub_char2.setListListener(p);
		p.columnRslt_edi_sub_char3.addAllListener(p);
		p.columnRslt_edi_sub_char3.setListListener(p);
		p.columnRslt_edi_sub_char4.addAllListener(p);
		p.columnRslt_edi_sub_char4.setListListener(p);
		p.columnRslt_edi_sub_char5.addAllListener(p);
		p.columnRslt_edi_sub_char5.setListListener(p);
		p.columnRslt_rpt_attr1.addAllListener(p);
		p.columnRslt_rpt_attr1.setListListener(p);
		p.columnRslt_rpt_attr2.addAllListener(p);
		p.columnRslt_rpt_attr2.setListListener(p);
		p.columnRslt_rpt_attr3.addAllListener(p);
		p.columnRslt_rpt_attr3.setListListener(p);
		p.columnRslt_rpt_attr4.addAllListener(p);
		p.columnRslt_rpt_attr4.setListListener(p);
		p.columnRslt_rpt_attr5.addAllListener(p);
		p.columnRslt_rpt_attr5.setListListener(p);
		p.columnRslt_rpt_attr6.addAllListener(p);
		p.columnRslt_rpt_attr6.setListListener(p);
		p.columnRslt_rpt_attr7.addAllListener(p);
		p.columnRslt_rpt_attr7.setListListener(p);
		p.columnRslt_rpt_attr8.addAllListener(p);
		p.columnRslt_rpt_attr8.setListListener(p);
		p.columnRslt_rpt_attr9.addAllListener(p);
		p.columnRslt_rpt_attr9.setListListener(p);
		p.columnRslt_rpt_attr10.addAllListener(p);
		p.columnRslt_rpt_attr10.setListListener(p);
		p.columnRslt_rpt_attr11.addAllListener(p);
		p.columnRslt_rpt_attr11.setListListener(p);
		p.columnRslt_rpt_attr12.addAllListener(p);
		p.columnRslt_rpt_attr12.setListListener(p);
		p.columnRslt_rpt_attr13.addAllListener(p);
		p.columnRslt_rpt_attr13.setListListener(p);
		p.columnRslt_rpt_attr14.addAllListener(p);
		p.columnRslt_rpt_attr14.setListListener(p);
		p.columnRslt_rpt_attr15.addAllListener(p);
		p.columnRslt_rpt_attr15.setListListener(p);
		p.columnRslt_rpt_attr16.addAllListener(p);
		p.columnRslt_rpt_attr16.setListListener(p);
		p.columnRslt_rpt_attr17.addAllListener(p);
		p.columnRslt_rpt_attr17.setListListener(p);
		p.columnRslt_rpt_attr18.addAllListener(p);
		p.columnRslt_rpt_attr18.setListListener(p);
		p.columnRslt_rpt_attr19.addAllListener(p);
		p.columnRslt_rpt_attr19.setListListener(p);
		p.columnRslt_rpt_attr20.addAllListener(p);
		p.columnRslt_rpt_attr20.setListListener(p);
		p.columnRslt_data_crud_typ.addAllListener(p);
		p.columnRslt_data_crud_typ.setListListener(p);
		p.columnRslt_data_crud_typ_nm.addAllListener(p);
		p.columnRslt_data_crud_typ_nm.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBCP_AttachmentLstReg p) {
		p.Btn_open_file.addAllListener(p);
		p.Btn_open_file.setAPMethodName("doBtn_open_file");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBCP_AttachmentLstReg p){
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[AttachTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AttachTyp(MBBCP_AttachmentLstReg p){
		p.AttachTyp_attach_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.AttachTyp_no_attach_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBCP_AttachmentLstReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edition.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_select_file_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_attach_file_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_archive_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_attach.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_select_file.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_file_path.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_src_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_save_as.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_file_path.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_fs_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_doc_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_preview_url.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_old_file_path.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_old_file_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBCP_AttachmentLstReg p){
		p.Btn_open_file.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBCP_AttachmentLstReg p){
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[AttachTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_AttachTyp(MBBCP_AttachmentLstReg p){
		p.AttachTyp_attach_flg.putMode(p, REF, MCMode.REQUIRED);
		p.AttachTyp_no_attach_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBCP_AttachmentLstReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.REQUIRED);
		p.columnRslt_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edition.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_select_file_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_attach_file_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_archive_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_attach.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_select_file.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_src_file_path.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_src_file_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_save_as.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_file_path.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_file_nm.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_biz_typ.putMode(p, REF, MCMode.REQUIRED);
		p.columnRslt_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_fs_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_doc_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_preview_url.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_old_file_path.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_old_file_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rmrks1.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_rmrks2.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_rmrks3.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_rmrks4.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_rmrks5.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBCP_AttachmentLstReg p){
		p.Btn_open_file.putMode(p, REF, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MBBCP_AttachmentLstReg_MC.setTableConfigRslt((MBBCP_AttachmentLstReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBCP_AttachmentLstReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_data_no.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_edition.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.edition_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edition);
		p.columnRslt_select_file_flg.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.select_file_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_select_file_flg);
		p.columnRslt_attach_file_flg.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.attach_file_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_attach_file_flg);
		p.columnRslt_archive_flg.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.archive_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_archive_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_attach);
		p.RsltTable.addColumnConfig(p.columnRslt_select_file);
		p.columnRslt_src_file_path.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.src_file_path_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_file_path);
		p.columnRslt_src_file_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.src_file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_src_file_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_save_as);
		p.columnRslt_file_path.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.file_path_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_path);
		p.columnRslt_file_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_nm);
		p.columnRslt_biz_typ.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_typ_META);
		p.columnRslt_biz_typ.addLinkBeans(p.columnRslt_biz_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_typ);
		p.columnRslt_biz_typ_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_typ_nm);
		p.columnRslt_biz_key1.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key1);
		p.columnRslt_biz_key2.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key2);
		p.columnRslt_biz_key3.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key3);
		p.columnRslt_biz_key4.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key4);
		p.columnRslt_biz_key5.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key5);
		p.columnRslt_biz_key6.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key6);
		p.columnRslt_biz_key7.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key7);
		p.columnRslt_biz_key8.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key8);
		p.columnRslt_biz_key9.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key9);
		p.columnRslt_biz_key10.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.biz_key10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key10);
		p.columnRslt_dt.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.dt_META);
		p.columnRslt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dt);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_amt.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_fs_flg.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.fs_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fs_flg);
		p.columnRslt_doc_id.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.doc_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_doc_id);
		p.columnRslt_preview_url.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.preview_url_META);
		p.RsltTable.addColumnConfig(p.columnRslt_preview_url);
		p.columnRslt_old_file_path.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.old_file_path_META);
		p.RsltTable.addColumnConfig(p.columnRslt_old_file_path);
		p.columnRslt_old_file_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.old_file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_old_file_nm);
		p.columnRslt_rmrks1.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks1);
		p.columnRslt_rmrks2.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks2);
		p.columnRslt_rmrks3.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks3);
		p.columnRslt_rmrks4.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rmrks4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks4);
		p.columnRslt_rmrks5.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rmrks5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks5);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bsppl_dpt_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_cd);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dest_cd1.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.dest_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd1);
		p.columnRslt_dest_cd2.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.dest_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd2);
		p.columnRslt_dest_cd3.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.dest_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd3);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_acst_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.acst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_cd);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_psppl_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.psppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_cd);
		p.columnRslt_cntry_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_cd);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_wrk_no.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_tterm_cd1.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd1);
		p.columnRslt_tterm_cd2.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd2);
		p.columnRslt_tterm_cd3.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd3);
		p.columnRslt_edi_sub_char1.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.edi_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_sub_char1);
		p.columnRslt_edi_sub_char2.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.edi_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_sub_char2);
		p.columnRslt_edi_sub_char3.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.edi_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_sub_char3);
		p.columnRslt_edi_sub_char4.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.edi_sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_sub_char4);
		p.columnRslt_edi_sub_char5.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.edi_sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_sub_char5);
		p.columnRslt_rpt_attr1.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr1);
		p.columnRslt_rpt_attr2.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr2);
		p.columnRslt_rpt_attr3.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr3);
		p.columnRslt_rpt_attr4.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr4);
		p.columnRslt_rpt_attr5.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr5);
		p.columnRslt_rpt_attr6.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr6);
		p.columnRslt_rpt_attr7.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr7);
		p.columnRslt_rpt_attr8.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr8);
		p.columnRslt_rpt_attr9.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr9);
		p.columnRslt_rpt_attr10.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr10);
		p.columnRslt_rpt_attr11.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr11);
		p.columnRslt_rpt_attr12.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr12);
		p.columnRslt_rpt_attr13.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr13);
		p.columnRslt_rpt_attr14.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr14);
		p.columnRslt_rpt_attr15.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr15);
		p.columnRslt_rpt_attr16.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr16);
		p.columnRslt_rpt_attr17.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr17);
		p.columnRslt_rpt_attr18.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr18);
		p.columnRslt_rpt_attr19.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr19);
		p.columnRslt_rpt_attr20.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.rpt_attr20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr20);
		p.columnRslt_data_crud_typ.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.data_crud_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_crud_typ);
		p.columnRslt_data_crud_typ_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.data_crud_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_crud_typ_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBC.MBBCP0020.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnRslt_biz_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_biz_typ.getListConfig().setPutter(getRslt_biz_typ_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Rslt_biz_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_biz_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BizTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnRslt_biz_typ) return getRslt_biz_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == columnRslt_attach) doRslt_attach(info);
		else if (ap == columnRslt_select_file) doRslt_select_file(info);
		else if (ap == columnRslt_save_as) doRslt_save_as(info);
		else if (ap == Btn_open_file) doBtn_open_file(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Rslt]パネルの[attach]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt_attach(MCEventInfo info);

	/**
	 * [Rslt]パネルの[select_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt_select_file(MCEventInfo info);

	/**
	 * [Rslt]パネルの[save_as]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRslt_save_as(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == AttachTyp_attach_flg) return doAttachTyp_attach_flg_VC(info);
		if (vc == AttachTyp_no_attach_flg) return doAttachTyp_no_attach_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_edition) return doRslt_edition_VC(info);
		if (vc == columnRslt_select_file_flg) return doRslt_select_file_flg_VC(info);
		if (vc == columnRslt_attach_file_flg) return doRslt_attach_file_flg_VC(info);
		if (vc == columnRslt_archive_flg) return doRslt_archive_flg_VC(info);
		if (vc == columnRslt_src_file_path) return doRslt_src_file_path_VC(info);
		if (vc == columnRslt_src_file_nm) return doRslt_src_file_nm_VC(info);
		if (vc == columnRslt_file_path) return doRslt_file_path_VC(info);
		if (vc == columnRslt_file_nm) return doRslt_file_nm_VC(info);
		if (vc == columnRslt_biz_typ) return doRslt_biz_typ_VC(info);
		if (vc == columnRslt_biz_typ_nm) return doRslt_biz_typ_nm_VC(info);
		if (vc == columnRslt_biz_key1) return doRslt_biz_key1_VC(info);
		if (vc == columnRslt_biz_key2) return doRslt_biz_key2_VC(info);
		if (vc == columnRslt_biz_key3) return doRslt_biz_key3_VC(info);
		if (vc == columnRslt_biz_key4) return doRslt_biz_key4_VC(info);
		if (vc == columnRslt_biz_key5) return doRslt_biz_key5_VC(info);
		if (vc == columnRslt_biz_key6) return doRslt_biz_key6_VC(info);
		if (vc == columnRslt_biz_key7) return doRslt_biz_key7_VC(info);
		if (vc == columnRslt_biz_key8) return doRslt_biz_key8_VC(info);
		if (vc == columnRslt_biz_key9) return doRslt_biz_key9_VC(info);
		if (vc == columnRslt_biz_key10) return doRslt_biz_key10_VC(info);
		if (vc == columnRslt_dt) return doRslt_dt_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_amt) return doRslt_amt_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_fs_flg) return doRslt_fs_flg_VC(info);
		if (vc == columnRslt_doc_id) return doRslt_doc_id_VC(info);
		if (vc == columnRslt_preview_url) return doRslt_preview_url_VC(info);
		if (vc == columnRslt_old_file_path) return doRslt_old_file_path_VC(info);
		if (vc == columnRslt_old_file_nm) return doRslt_old_file_nm_VC(info);
		if (vc == columnRslt_rmrks1) return doRslt_rmrks1_VC(info);
		if (vc == columnRslt_rmrks2) return doRslt_rmrks2_VC(info);
		if (vc == columnRslt_rmrks3) return doRslt_rmrks3_VC(info);
		if (vc == columnRslt_rmrks4) return doRslt_rmrks4_VC(info);
		if (vc == columnRslt_rmrks5) return doRslt_rmrks5_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bsppl_dpt_cd) return doRslt_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dest_cd1) return doRslt_dest_cd1_VC(info);
		if (vc == columnRslt_dest_cd2) return doRslt_dest_cd2_VC(info);
		if (vc == columnRslt_dest_cd3) return doRslt_dest_cd3_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_acst_cd) return doRslt_acst_cd_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_psppl_cd) return doRslt_psppl_cd_VC(info);
		if (vc == columnRslt_cntry_cd) return doRslt_cntry_cd_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_tterm_cd1) return doRslt_tterm_cd1_VC(info);
		if (vc == columnRslt_tterm_cd2) return doRslt_tterm_cd2_VC(info);
		if (vc == columnRslt_tterm_cd3) return doRslt_tterm_cd3_VC(info);
		if (vc == columnRslt_edi_sub_char1) return doRslt_edi_sub_char1_VC(info);
		if (vc == columnRslt_edi_sub_char2) return doRslt_edi_sub_char2_VC(info);
		if (vc == columnRslt_edi_sub_char3) return doRslt_edi_sub_char3_VC(info);
		if (vc == columnRslt_edi_sub_char4) return doRslt_edi_sub_char4_VC(info);
		if (vc == columnRslt_edi_sub_char5) return doRslt_edi_sub_char5_VC(info);
		if (vc == columnRslt_rpt_attr1) return doRslt_rpt_attr1_VC(info);
		if (vc == columnRslt_rpt_attr2) return doRslt_rpt_attr2_VC(info);
		if (vc == columnRslt_rpt_attr3) return doRslt_rpt_attr3_VC(info);
		if (vc == columnRslt_rpt_attr4) return doRslt_rpt_attr4_VC(info);
		if (vc == columnRslt_rpt_attr5) return doRslt_rpt_attr5_VC(info);
		if (vc == columnRslt_rpt_attr6) return doRslt_rpt_attr6_VC(info);
		if (vc == columnRslt_rpt_attr7) return doRslt_rpt_attr7_VC(info);
		if (vc == columnRslt_rpt_attr8) return doRslt_rpt_attr8_VC(info);
		if (vc == columnRslt_rpt_attr9) return doRslt_rpt_attr9_VC(info);
		if (vc == columnRslt_rpt_attr10) return doRslt_rpt_attr10_VC(info);
		if (vc == columnRslt_rpt_attr11) return doRslt_rpt_attr11_VC(info);
		if (vc == columnRslt_rpt_attr12) return doRslt_rpt_attr12_VC(info);
		if (vc == columnRslt_rpt_attr13) return doRslt_rpt_attr13_VC(info);
		if (vc == columnRslt_rpt_attr14) return doRslt_rpt_attr14_VC(info);
		if (vc == columnRslt_rpt_attr15) return doRslt_rpt_attr15_VC(info);
		if (vc == columnRslt_rpt_attr16) return doRslt_rpt_attr16_VC(info);
		if (vc == columnRslt_rpt_attr17) return doRslt_rpt_attr17_VC(info);
		if (vc == columnRslt_rpt_attr18) return doRslt_rpt_attr18_VC(info);
		if (vc == columnRslt_rpt_attr19) return doRslt_rpt_attr19_VC(info);
		if (vc == columnRslt_rpt_attr20) return doRslt_rpt_attr20_VC(info);
		if (vc == columnRslt_data_crud_typ) return doRslt_data_crud_typ_VC(info);
		if (vc == columnRslt_data_crud_typ_nm) return doRslt_data_crud_typ_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AttachTyp]パネルの[attach_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAttachTyp_attach_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AttachTyp]パネルの[no_attach_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAttachTyp_no_attach_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edition]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edition_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[select_file_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_select_file_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[attach_file_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_attach_file_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[archive_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_archive_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[src_file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_src_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fs_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fs_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[doc_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_doc_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[preview_url]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_preview_url_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[old_file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_old_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[old_file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_old_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_crud_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_crud_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == AttachTyp_attach_flg) doAttachTyp_attach_flg_NC(info);
		else if (nc == AttachTyp_no_attach_flg) doAttachTyp_no_attach_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_edition) doRslt_edition_NC(info);
		else if (nc == columnRslt_select_file_flg) doRslt_select_file_flg_NC(info);
		else if (nc == columnRslt_attach_file_flg) doRslt_attach_file_flg_NC(info);
		else if (nc == columnRslt_archive_flg) doRslt_archive_flg_NC(info);
		else if (nc == columnRslt_src_file_path) doRslt_src_file_path_NC(info);
		else if (nc == columnRslt_src_file_nm) doRslt_src_file_nm_NC(info);
		else if (nc == columnRslt_file_path) doRslt_file_path_NC(info);
		else if (nc == columnRslt_file_nm) doRslt_file_nm_NC(info);
		else if (nc == columnRslt_biz_typ) doRslt_biz_typ_NC(info);
		else if (nc == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_NC(info);
		else if (nc == columnRslt_biz_key1) doRslt_biz_key1_NC(info);
		else if (nc == columnRslt_biz_key2) doRslt_biz_key2_NC(info);
		else if (nc == columnRslt_biz_key3) doRslt_biz_key3_NC(info);
		else if (nc == columnRslt_biz_key4) doRslt_biz_key4_NC(info);
		else if (nc == columnRslt_biz_key5) doRslt_biz_key5_NC(info);
		else if (nc == columnRslt_biz_key6) doRslt_biz_key6_NC(info);
		else if (nc == columnRslt_biz_key7) doRslt_biz_key7_NC(info);
		else if (nc == columnRslt_biz_key8) doRslt_biz_key8_NC(info);
		else if (nc == columnRslt_biz_key9) doRslt_biz_key9_NC(info);
		else if (nc == columnRslt_biz_key10) doRslt_biz_key10_NC(info);
		else if (nc == columnRslt_dt) doRslt_dt_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_amt) doRslt_amt_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_fs_flg) doRslt_fs_flg_NC(info);
		else if (nc == columnRslt_doc_id) doRslt_doc_id_NC(info);
		else if (nc == columnRslt_preview_url) doRslt_preview_url_NC(info);
		else if (nc == columnRslt_old_file_path) doRslt_old_file_path_NC(info);
		else if (nc == columnRslt_old_file_nm) doRslt_old_file_nm_NC(info);
		else if (nc == columnRslt_rmrks1) doRslt_rmrks1_NC(info);
		else if (nc == columnRslt_rmrks2) doRslt_rmrks2_NC(info);
		else if (nc == columnRslt_rmrks3) doRslt_rmrks3_NC(info);
		else if (nc == columnRslt_rmrks4) doRslt_rmrks4_NC(info);
		else if (nc == columnRslt_rmrks5) doRslt_rmrks5_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dest_cd1) doRslt_dest_cd1_NC(info);
		else if (nc == columnRslt_dest_cd2) doRslt_dest_cd2_NC(info);
		else if (nc == columnRslt_dest_cd3) doRslt_dest_cd3_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_acst_cd) doRslt_acst_cd_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_psppl_cd) doRslt_psppl_cd_NC(info);
		else if (nc == columnRslt_cntry_cd) doRslt_cntry_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_tterm_cd1) doRslt_tterm_cd1_NC(info);
		else if (nc == columnRslt_tterm_cd2) doRslt_tterm_cd2_NC(info);
		else if (nc == columnRslt_tterm_cd3) doRslt_tterm_cd3_NC(info);
		else if (nc == columnRslt_edi_sub_char1) doRslt_edi_sub_char1_NC(info);
		else if (nc == columnRslt_edi_sub_char2) doRslt_edi_sub_char2_NC(info);
		else if (nc == columnRslt_edi_sub_char3) doRslt_edi_sub_char3_NC(info);
		else if (nc == columnRslt_edi_sub_char4) doRslt_edi_sub_char4_NC(info);
		else if (nc == columnRslt_edi_sub_char5) doRslt_edi_sub_char5_NC(info);
		else if (nc == columnRslt_rpt_attr1) doRslt_rpt_attr1_NC(info);
		else if (nc == columnRslt_rpt_attr2) doRslt_rpt_attr2_NC(info);
		else if (nc == columnRslt_rpt_attr3) doRslt_rpt_attr3_NC(info);
		else if (nc == columnRslt_rpt_attr4) doRslt_rpt_attr4_NC(info);
		else if (nc == columnRslt_rpt_attr5) doRslt_rpt_attr5_NC(info);
		else if (nc == columnRslt_rpt_attr6) doRslt_rpt_attr6_NC(info);
		else if (nc == columnRslt_rpt_attr7) doRslt_rpt_attr7_NC(info);
		else if (nc == columnRslt_rpt_attr8) doRslt_rpt_attr8_NC(info);
		else if (nc == columnRslt_rpt_attr9) doRslt_rpt_attr9_NC(info);
		else if (nc == columnRslt_rpt_attr10) doRslt_rpt_attr10_NC(info);
		else if (nc == columnRslt_rpt_attr11) doRslt_rpt_attr11_NC(info);
		else if (nc == columnRslt_rpt_attr12) doRslt_rpt_attr12_NC(info);
		else if (nc == columnRslt_rpt_attr13) doRslt_rpt_attr13_NC(info);
		else if (nc == columnRslt_rpt_attr14) doRslt_rpt_attr14_NC(info);
		else if (nc == columnRslt_rpt_attr15) doRslt_rpt_attr15_NC(info);
		else if (nc == columnRslt_rpt_attr16) doRslt_rpt_attr16_NC(info);
		else if (nc == columnRslt_rpt_attr17) doRslt_rpt_attr17_NC(info);
		else if (nc == columnRslt_rpt_attr18) doRslt_rpt_attr18_NC(info);
		else if (nc == columnRslt_rpt_attr19) doRslt_rpt_attr19_NC(info);
		else if (nc == columnRslt_rpt_attr20) doRslt_rpt_attr20_NC(info);
		else if (nc == columnRslt_data_crud_typ) doRslt_data_crud_typ_NC(info);
		else if (nc == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [AttachTyp]パネルの[attach_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAttachTyp_attach_flg_NC(MCEventInfo info){
	}

	/**
	 * [AttachTyp]パネルの[no_attach_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAttachTyp_no_attach_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[select_file_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_select_file_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[attach_file_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_attach_file_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[archive_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_archive_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fs_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fs_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == AttachTyp_attach_flg) doAttachTyp_attach_flg_NE(info);
		else if (ne == AttachTyp_no_attach_flg) doAttachTyp_no_attach_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_edition) doRslt_edition_NE(info);
		else if (ne == columnRslt_select_file_flg) doRslt_select_file_flg_NE(info);
		else if (ne == columnRslt_attach_file_flg) doRslt_attach_file_flg_NE(info);
		else if (ne == columnRslt_archive_flg) doRslt_archive_flg_NE(info);
		else if (ne == columnRslt_src_file_path) doRslt_src_file_path_NE(info);
		else if (ne == columnRslt_src_file_nm) doRslt_src_file_nm_NE(info);
		else if (ne == columnRslt_file_path) doRslt_file_path_NE(info);
		else if (ne == columnRslt_file_nm) doRslt_file_nm_NE(info);
		else if (ne == columnRslt_biz_typ) doRslt_biz_typ_NE(info);
		else if (ne == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_NE(info);
		else if (ne == columnRslt_biz_key1) doRslt_biz_key1_NE(info);
		else if (ne == columnRslt_biz_key2) doRslt_biz_key2_NE(info);
		else if (ne == columnRslt_biz_key3) doRslt_biz_key3_NE(info);
		else if (ne == columnRslt_biz_key4) doRslt_biz_key4_NE(info);
		else if (ne == columnRslt_biz_key5) doRslt_biz_key5_NE(info);
		else if (ne == columnRslt_biz_key6) doRslt_biz_key6_NE(info);
		else if (ne == columnRslt_biz_key7) doRslt_biz_key7_NE(info);
		else if (ne == columnRslt_biz_key8) doRslt_biz_key8_NE(info);
		else if (ne == columnRslt_biz_key9) doRslt_biz_key9_NE(info);
		else if (ne == columnRslt_biz_key10) doRslt_biz_key10_NE(info);
		else if (ne == columnRslt_dt) doRslt_dt_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_amt) doRslt_amt_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_fs_flg) doRslt_fs_flg_NE(info);
		else if (ne == columnRslt_doc_id) doRslt_doc_id_NE(info);
		else if (ne == columnRslt_preview_url) doRslt_preview_url_NE(info);
		else if (ne == columnRslt_old_file_path) doRslt_old_file_path_NE(info);
		else if (ne == columnRslt_old_file_nm) doRslt_old_file_nm_NE(info);
		else if (ne == columnRslt_rmrks1) doRslt_rmrks1_NE(info);
		else if (ne == columnRslt_rmrks2) doRslt_rmrks2_NE(info);
		else if (ne == columnRslt_rmrks3) doRslt_rmrks3_NE(info);
		else if (ne == columnRslt_rmrks4) doRslt_rmrks4_NE(info);
		else if (ne == columnRslt_rmrks5) doRslt_rmrks5_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dest_cd1) doRslt_dest_cd1_NE(info);
		else if (ne == columnRslt_dest_cd2) doRslt_dest_cd2_NE(info);
		else if (ne == columnRslt_dest_cd3) doRslt_dest_cd3_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_acst_cd) doRslt_acst_cd_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_psppl_cd) doRslt_psppl_cd_NE(info);
		else if (ne == columnRslt_cntry_cd) doRslt_cntry_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_tterm_cd1) doRslt_tterm_cd1_NE(info);
		else if (ne == columnRslt_tterm_cd2) doRslt_tterm_cd2_NE(info);
		else if (ne == columnRslt_tterm_cd3) doRslt_tterm_cd3_NE(info);
		else if (ne == columnRslt_edi_sub_char1) doRslt_edi_sub_char1_NE(info);
		else if (ne == columnRslt_edi_sub_char2) doRslt_edi_sub_char2_NE(info);
		else if (ne == columnRslt_edi_sub_char3) doRslt_edi_sub_char3_NE(info);
		else if (ne == columnRslt_edi_sub_char4) doRslt_edi_sub_char4_NE(info);
		else if (ne == columnRslt_edi_sub_char5) doRslt_edi_sub_char5_NE(info);
		else if (ne == columnRslt_rpt_attr1) doRslt_rpt_attr1_NE(info);
		else if (ne == columnRslt_rpt_attr2) doRslt_rpt_attr2_NE(info);
		else if (ne == columnRslt_rpt_attr3) doRslt_rpt_attr3_NE(info);
		else if (ne == columnRslt_rpt_attr4) doRslt_rpt_attr4_NE(info);
		else if (ne == columnRslt_rpt_attr5) doRslt_rpt_attr5_NE(info);
		else if (ne == columnRslt_rpt_attr6) doRslt_rpt_attr6_NE(info);
		else if (ne == columnRslt_rpt_attr7) doRslt_rpt_attr7_NE(info);
		else if (ne == columnRslt_rpt_attr8) doRslt_rpt_attr8_NE(info);
		else if (ne == columnRslt_rpt_attr9) doRslt_rpt_attr9_NE(info);
		else if (ne == columnRslt_rpt_attr10) doRslt_rpt_attr10_NE(info);
		else if (ne == columnRslt_rpt_attr11) doRslt_rpt_attr11_NE(info);
		else if (ne == columnRslt_rpt_attr12) doRslt_rpt_attr12_NE(info);
		else if (ne == columnRslt_rpt_attr13) doRslt_rpt_attr13_NE(info);
		else if (ne == columnRslt_rpt_attr14) doRslt_rpt_attr14_NE(info);
		else if (ne == columnRslt_rpt_attr15) doRslt_rpt_attr15_NE(info);
		else if (ne == columnRslt_rpt_attr16) doRslt_rpt_attr16_NE(info);
		else if (ne == columnRslt_rpt_attr17) doRslt_rpt_attr17_NE(info);
		else if (ne == columnRslt_rpt_attr18) doRslt_rpt_attr18_NE(info);
		else if (ne == columnRslt_rpt_attr19) doRslt_rpt_attr19_NE(info);
		else if (ne == columnRslt_rpt_attr20) doRslt_rpt_attr20_NE(info);
		else if (ne == columnRslt_data_crud_typ) doRslt_data_crud_typ_NE(info);
		else if (ne == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [AttachTyp]パネルの[attach_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAttachTyp_attach_flg_NE(MCEventInfo info){
	}

	/**
	 * [AttachTyp]パネルの[no_attach_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAttachTyp_no_attach_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[select_file_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_select_file_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[attach_file_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_attach_file_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[archive_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_archive_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fs_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fs_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == AttachTyp_attach_flg) doAttachTyp_attach_flg_NX(info);
		else if (nx == AttachTyp_no_attach_flg) doAttachTyp_no_attach_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_edition) doRslt_edition_NX(info);
		else if (nx == columnRslt_select_file_flg) doRslt_select_file_flg_NX(info);
		else if (nx == columnRslt_attach_file_flg) doRslt_attach_file_flg_NX(info);
		else if (nx == columnRslt_archive_flg) doRslt_archive_flg_NX(info);
		else if (nx == columnRslt_src_file_path) doRslt_src_file_path_NX(info);
		else if (nx == columnRslt_src_file_nm) doRslt_src_file_nm_NX(info);
		else if (nx == columnRslt_file_path) doRslt_file_path_NX(info);
		else if (nx == columnRslt_file_nm) doRslt_file_nm_NX(info);
		else if (nx == columnRslt_biz_typ) doRslt_biz_typ_NX(info);
		else if (nx == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_NX(info);
		else if (nx == columnRslt_biz_key1) doRslt_biz_key1_NX(info);
		else if (nx == columnRslt_biz_key2) doRslt_biz_key2_NX(info);
		else if (nx == columnRslt_biz_key3) doRslt_biz_key3_NX(info);
		else if (nx == columnRslt_biz_key4) doRslt_biz_key4_NX(info);
		else if (nx == columnRslt_biz_key5) doRslt_biz_key5_NX(info);
		else if (nx == columnRslt_biz_key6) doRslt_biz_key6_NX(info);
		else if (nx == columnRslt_biz_key7) doRslt_biz_key7_NX(info);
		else if (nx == columnRslt_biz_key8) doRslt_biz_key8_NX(info);
		else if (nx == columnRslt_biz_key9) doRslt_biz_key9_NX(info);
		else if (nx == columnRslt_biz_key10) doRslt_biz_key10_NX(info);
		else if (nx == columnRslt_dt) doRslt_dt_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_amt) doRslt_amt_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_fs_flg) doRslt_fs_flg_NX(info);
		else if (nx == columnRslt_doc_id) doRslt_doc_id_NX(info);
		else if (nx == columnRslt_preview_url) doRslt_preview_url_NX(info);
		else if (nx == columnRslt_old_file_path) doRslt_old_file_path_NX(info);
		else if (nx == columnRslt_old_file_nm) doRslt_old_file_nm_NX(info);
		else if (nx == columnRslt_rmrks1) doRslt_rmrks1_NX(info);
		else if (nx == columnRslt_rmrks2) doRslt_rmrks2_NX(info);
		else if (nx == columnRslt_rmrks3) doRslt_rmrks3_NX(info);
		else if (nx == columnRslt_rmrks4) doRslt_rmrks4_NX(info);
		else if (nx == columnRslt_rmrks5) doRslt_rmrks5_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dest_cd1) doRslt_dest_cd1_NX(info);
		else if (nx == columnRslt_dest_cd2) doRslt_dest_cd2_NX(info);
		else if (nx == columnRslt_dest_cd3) doRslt_dest_cd3_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_acst_cd) doRslt_acst_cd_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_psppl_cd) doRslt_psppl_cd_NX(info);
		else if (nx == columnRslt_cntry_cd) doRslt_cntry_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_tterm_cd1) doRslt_tterm_cd1_NX(info);
		else if (nx == columnRslt_tterm_cd2) doRslt_tterm_cd2_NX(info);
		else if (nx == columnRslt_tterm_cd3) doRslt_tterm_cd3_NX(info);
		else if (nx == columnRslt_edi_sub_char1) doRslt_edi_sub_char1_NX(info);
		else if (nx == columnRslt_edi_sub_char2) doRslt_edi_sub_char2_NX(info);
		else if (nx == columnRslt_edi_sub_char3) doRslt_edi_sub_char3_NX(info);
		else if (nx == columnRslt_edi_sub_char4) doRslt_edi_sub_char4_NX(info);
		else if (nx == columnRslt_edi_sub_char5) doRslt_edi_sub_char5_NX(info);
		else if (nx == columnRslt_rpt_attr1) doRslt_rpt_attr1_NX(info);
		else if (nx == columnRslt_rpt_attr2) doRslt_rpt_attr2_NX(info);
		else if (nx == columnRslt_rpt_attr3) doRslt_rpt_attr3_NX(info);
		else if (nx == columnRslt_rpt_attr4) doRslt_rpt_attr4_NX(info);
		else if (nx == columnRslt_rpt_attr5) doRslt_rpt_attr5_NX(info);
		else if (nx == columnRslt_rpt_attr6) doRslt_rpt_attr6_NX(info);
		else if (nx == columnRslt_rpt_attr7) doRslt_rpt_attr7_NX(info);
		else if (nx == columnRslt_rpt_attr8) doRslt_rpt_attr8_NX(info);
		else if (nx == columnRslt_rpt_attr9) doRslt_rpt_attr9_NX(info);
		else if (nx == columnRslt_rpt_attr10) doRslt_rpt_attr10_NX(info);
		else if (nx == columnRslt_rpt_attr11) doRslt_rpt_attr11_NX(info);
		else if (nx == columnRslt_rpt_attr12) doRslt_rpt_attr12_NX(info);
		else if (nx == columnRslt_rpt_attr13) doRslt_rpt_attr13_NX(info);
		else if (nx == columnRslt_rpt_attr14) doRslt_rpt_attr14_NX(info);
		else if (nx == columnRslt_rpt_attr15) doRslt_rpt_attr15_NX(info);
		else if (nx == columnRslt_rpt_attr16) doRslt_rpt_attr16_NX(info);
		else if (nx == columnRslt_rpt_attr17) doRslt_rpt_attr17_NX(info);
		else if (nx == columnRslt_rpt_attr18) doRslt_rpt_attr18_NX(info);
		else if (nx == columnRslt_rpt_attr19) doRslt_rpt_attr19_NX(info);
		else if (nx == columnRslt_rpt_attr20) doRslt_rpt_attr20_NX(info);
		else if (nx == columnRslt_data_crud_typ) doRslt_data_crud_typ_NX(info);
		else if (nx == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [AttachTyp]パネルの[attach_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAttachTyp_attach_flg_NX(MCEventInfo info){
	}

	/**
	 * [AttachTyp]パネルの[no_attach_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAttachTyp_no_attach_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[select_file_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_select_file_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[attach_file_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_attach_file_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[archive_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_archive_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fs_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fs_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_edition) doRslt_edition_LC(info);
		else if (lc == columnRslt_src_file_path) doRslt_src_file_path_LC(info);
		else if (lc == columnRslt_src_file_nm) doRslt_src_file_nm_LC(info);
		else if (lc == columnRslt_file_path) doRslt_file_path_LC(info);
		else if (lc == columnRslt_file_nm) doRslt_file_nm_LC(info);
		else if (lc == columnRslt_biz_typ) doRslt_biz_typ_LC(info);
		else if (lc == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_LC(info);
		else if (lc == columnRslt_biz_key1) doRslt_biz_key1_LC(info);
		else if (lc == columnRslt_biz_key2) doRslt_biz_key2_LC(info);
		else if (lc == columnRslt_biz_key3) doRslt_biz_key3_LC(info);
		else if (lc == columnRslt_biz_key4) doRslt_biz_key4_LC(info);
		else if (lc == columnRslt_biz_key5) doRslt_biz_key5_LC(info);
		else if (lc == columnRslt_biz_key6) doRslt_biz_key6_LC(info);
		else if (lc == columnRslt_biz_key7) doRslt_biz_key7_LC(info);
		else if (lc == columnRslt_biz_key8) doRslt_biz_key8_LC(info);
		else if (lc == columnRslt_biz_key9) doRslt_biz_key9_LC(info);
		else if (lc == columnRslt_biz_key10) doRslt_biz_key10_LC(info);
		else if (lc == columnRslt_dt) doRslt_dt_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_amt) doRslt_amt_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_doc_id) doRslt_doc_id_LC(info);
		else if (lc == columnRslt_preview_url) doRslt_preview_url_LC(info);
		else if (lc == columnRslt_old_file_path) doRslt_old_file_path_LC(info);
		else if (lc == columnRslt_old_file_nm) doRslt_old_file_nm_LC(info);
		else if (lc == columnRslt_rmrks1) doRslt_rmrks1_LC(info);
		else if (lc == columnRslt_rmrks2) doRslt_rmrks2_LC(info);
		else if (lc == columnRslt_rmrks3) doRslt_rmrks3_LC(info);
		else if (lc == columnRslt_rmrks4) doRslt_rmrks4_LC(info);
		else if (lc == columnRslt_rmrks5) doRslt_rmrks5_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dest_cd1) doRslt_dest_cd1_LC(info);
		else if (lc == columnRslt_dest_cd2) doRslt_dest_cd2_LC(info);
		else if (lc == columnRslt_dest_cd3) doRslt_dest_cd3_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_acst_cd) doRslt_acst_cd_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_psppl_cd) doRslt_psppl_cd_LC(info);
		else if (lc == columnRslt_cntry_cd) doRslt_cntry_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_tterm_cd1) doRslt_tterm_cd1_LC(info);
		else if (lc == columnRslt_tterm_cd2) doRslt_tterm_cd2_LC(info);
		else if (lc == columnRslt_tterm_cd3) doRslt_tterm_cd3_LC(info);
		else if (lc == columnRslt_edi_sub_char1) doRslt_edi_sub_char1_LC(info);
		else if (lc == columnRslt_edi_sub_char2) doRslt_edi_sub_char2_LC(info);
		else if (lc == columnRslt_edi_sub_char3) doRslt_edi_sub_char3_LC(info);
		else if (lc == columnRslt_edi_sub_char4) doRslt_edi_sub_char4_LC(info);
		else if (lc == columnRslt_edi_sub_char5) doRslt_edi_sub_char5_LC(info);
		else if (lc == columnRslt_rpt_attr1) doRslt_rpt_attr1_LC(info);
		else if (lc == columnRslt_rpt_attr2) doRslt_rpt_attr2_LC(info);
		else if (lc == columnRslt_rpt_attr3) doRslt_rpt_attr3_LC(info);
		else if (lc == columnRslt_rpt_attr4) doRslt_rpt_attr4_LC(info);
		else if (lc == columnRslt_rpt_attr5) doRslt_rpt_attr5_LC(info);
		else if (lc == columnRslt_rpt_attr6) doRslt_rpt_attr6_LC(info);
		else if (lc == columnRslt_rpt_attr7) doRslt_rpt_attr7_LC(info);
		else if (lc == columnRslt_rpt_attr8) doRslt_rpt_attr8_LC(info);
		else if (lc == columnRslt_rpt_attr9) doRslt_rpt_attr9_LC(info);
		else if (lc == columnRslt_rpt_attr10) doRslt_rpt_attr10_LC(info);
		else if (lc == columnRslt_rpt_attr11) doRslt_rpt_attr11_LC(info);
		else if (lc == columnRslt_rpt_attr12) doRslt_rpt_attr12_LC(info);
		else if (lc == columnRslt_rpt_attr13) doRslt_rpt_attr13_LC(info);
		else if (lc == columnRslt_rpt_attr14) doRslt_rpt_attr14_LC(info);
		else if (lc == columnRslt_rpt_attr15) doRslt_rpt_attr15_LC(info);
		else if (lc == columnRslt_rpt_attr16) doRslt_rpt_attr16_LC(info);
		else if (lc == columnRslt_rpt_attr17) doRslt_rpt_attr17_LC(info);
		else if (lc == columnRslt_rpt_attr18) doRslt_rpt_attr18_LC(info);
		else if (lc == columnRslt_rpt_attr19) doRslt_rpt_attr19_LC(info);
		else if (lc == columnRslt_rpt_attr20) doRslt_rpt_attr20_LC(info);
		else if (lc == columnRslt_data_crud_typ) doRslt_data_crud_typ_LC(info);
		else if (lc == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[src_file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_src_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[old_file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_old_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnRslt_biz_typ]の作成メソッド
	 */
	public MCList getRslt_biz_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBizTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBCL0020.Srch01")) {
			return new MB_MBBCL0020_Srch01Bridge();
		}
		if (id.equals("MB.MBBCL0020.Upd01")) {
			return new MB_MBBCL0020_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBCL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBCL0020_Srch01;

		/** コンストラクタ */
		protected MB_MBBCL0020_Srch01Bridge() {
			p_MB_MBBCL0020_Srch01 = new MCParam(PDef.MB_MBBCL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBCL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class));

			p_MB_MBBCL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBCL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBCL0020_Srch01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBCL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBCL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBC.MBBCP0020.RsltR> up0() {
			return (MCList<mcframe.clientMBBC.MBBCP0020.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMBBC.MBBCP0020.RsltR> down0() {
			return (MCList<mcframe.clientMBBC.MBBCP0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBCL0020_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBC.MBBCP0020.RsltR>)p_MB_MBBCL0020_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MB_MBBCL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBCL0020_Upd01;

		/** コンストラクタ */
		protected MB_MBBCL0020_Upd01Bridge() {
			p_MB_MBBCL0020_Upd01 = new MCParam(PDef.MB_MBBCL0020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBCL0020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class));

			p_MB_MBBCL0020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBCL0020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBCL0020_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBCL0020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBCL0020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBC.MBBCP0020.RsltR> up0() {
			return (MCList<mcframe.clientMBBC.MBBCP0020.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMBBC.MBBCP0020.RsltR> down0() {
			return (MCList<mcframe.clientMBBC.MBBCP0020.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBCL0020_Upd01.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBCL0020_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBC.MBBCP0020.RsltR>)p_MB_MBBCL0020_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}