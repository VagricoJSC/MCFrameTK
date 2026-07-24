package mcframe.clientMBBE.MBBEP0050;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMBBE.MBBEP0050.MBBEP_BizDatDLHstSrch_MC.MB_MBBEL0050_Srch01Caller;
import mcframe.clientMBBE.MBBEP0050.MBBEP_BizDatDLHstSrch_MC.MB_MBBEL0050_Del01Caller;

/**
 * 画面"MBBEP_BizDatDLHstSrch"パネルクラスです。<p>
 *
 * 業務データダウンロードの実行履歴を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEP_BizDatDLHstSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBEP0050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Sts]ブロック関連のField定義
	public MCPanel StsPanel = null;
	public MCTitledBorder StsTitledBorder = null;
	// [Sts]ブロックの項目のField定義
	// [FileTyp]ブロック関連のField定義
	public MCPanel FileTypPanel = null;
	public MCTitledBorder FileTypTitledBorder = null;
	// [FileTyp]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Type 種別.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_DL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_DEL = null;
	/**
	 * Execution status: Running 実行状況.実行中.<p>
	 *
	 */
	public MCCheckBox Cnd_running_flg = null;
	/**
	 * Execution status: End 実行状況.終了.<p>
	 *
	 */
	public MCCheckBox Cnd_success_flg = null;
	/**
	 * Execution status: Downloaded 実行状況.ダウンロード済み.<p>
	 *
	 */
	public MCCheckBox Cnd_download_flg = null;
	/**
	 * Execution status: Error 実行状況.エラー.<p>
	 *
	 */
	public MCCheckBox Cnd_error_flg = null;
	/**
	 * Excel Excel.<p>
	 *
	 */
	public MCCheckBox Cnd_excel_flg = null;
	/**
	 * CSV CSV.<p>
	 *
	 */
	public MCCheckBox Cnd_csv_flg = null;
	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public MCCheckBox Cnd_report_flg = null;
	/**
	 * Display screen 画面表示.<p>
	 *
	 */
	public MCCheckBox Cnd_screen_flg = null;
	public MCLabel Cnd_proc_st_tm_fr_Label = null;
	/**
	 * Process start date and time FROM 処理開始日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_proc_st_tm_fr = null;
	public MCLabel Cnd_proc_st_tm_to_Label = null;
	/**
	 * Process start date and time TO 処理開始日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_proc_st_tm_to = null;
	public MCLabel Cnd_proc_end_tm_fr_Label = null;
	/**
	 * Process end date FROM 処理終了日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_proc_end_tm_fr = null;
	public MCLabel Cnd_proc_end_tm_to_Label = null;
	/**
	 * Process end date TO 処理終了日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_proc_end_tm_to = null;
	public MCLabel Cnd_biz_dat_id_Label = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_nm = null;
	public MCLabel Cnd_biz_dat_rmrks1_Label = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_rmrks1 = null;
	public MCLabel Cnd_biz_dat_rmrks2_Label = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_rmrks2 = null;
	public MCLabel Cnd_biz_dat_rmrks3_Label = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_rmrks3 = null;
	public MCLabel Cnd_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_nm = null;
	public MCLabel Cnd_dl_tm_fr_Label = null;
	/**
	 * Download date and time FROM ダウンロード日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dl_tm_fr = null;
	public MCLabel Cnd_dl_tm_to_Label = null;
	/**
	 * Download date and time TO ダウンロード日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dl_tm_to = null;
	public MCLabel Cnd_dl_file_nm_Label = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCTextField Cnd_dl_file_nm = null;
	public MCLabel Cnd_file_size_fr_Label = null;
	/**
	 * File capacity FROM ファイル容量ＦＲＯＭ.<p>
	 *
	 */
	public MCNumberField Cnd_file_size_fr = null;
	public MCLabel Cnd_file_size_to_Label = null;
	/**
	 * File capacity TO ファイル容量ＴＯ.<p>
	 *
	 */
	public MCNumberField Cnd_file_size_to = null;
	public MCLabel Cnd_biz_dat_dl_cond_Label = null;
	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public MCTextField Cnd_biz_dat_dl_cond = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Center]ブロック関連のField定義
	public MCPanel CenterPanel = null;
	// [Center]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBE.MBBEP0050.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * File classification type ファイル種類区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_file_typ = null;
	/**
	 * File classification type name ファイル種類区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_file_typ_nm = null;
	/**
	 * Business data download execution status type 業務データダウンロード実行状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_dl_sts_typ = null;
	/**
	 * Business data download execution status type name 業務データダウンロード実行状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_dl_sts_typ_nm = null;
	/**
	 * Process start date and time 処理開始日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_st_tm = null;
	/**
	 * Process end date 処理終了日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_end_tm = null;
	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_id = null;
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_nm = null;
	/**
	 * Download date and time ダウンロード日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dl_tm = null;
	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dl_file_path = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dl_file_nm = null;
	/**
	 * Number of data items データ件数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_cnt = null;
	/**
	 * File capacity [KB] ファイル容量［KB］.<p>
	 *
	 */
	public MCColumnConfig columnRslt_file_size = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Business data download search criteria 業務データダウンロード検索条件.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_dl_cond = null;
	/**
	 * Business data download execution history No. 業務データダウンロード実行履歴ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_dat_dl_hst_no = null;
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
	// [Tab]ブロック関連のField定義
	public MCPanel TabPanel = null;
	public MCTabbedPane TabTab = null;
	// [Tab]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Rmrks]ブロック関連のField定義
	public MCPanel RmrksPanel = null;
	// [Rmrks]ブロックの項目のField定義
	public MCScrollPane Rmrks_biz_dat_rmrks1ScrollPane = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCTextArea Rmrks_biz_dat_rmrks1 = null;
	public MCScrollPane Rmrks_biz_dat_rmrks2ScrollPane = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCTextArea Rmrks_biz_dat_rmrks2 = null;
	public MCScrollPane Rmrks_biz_dat_rmrks3ScrollPane = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCTextArea Rmrks_biz_dat_rmrks3 = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	public MCLabel Btn_dl_file_path_Label = null;
	/**
	 * Output destination 出力先.<p>
	 *
	 */
	public MCTextField Btn_dl_file_path = null;
	/**
	 * Select target folder 出力先フォルダ選択.<p>
	 *
	 */
	public MCButton Btn_select_dir = null;
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton Btn_dwnld = null;
	/**
	 * Open the folder フォルダを開く.<p>
	 *
	 */
	public MCButton Btn_open_dir = null;
	/**
	 * Open file ファイルを開く.<p>
	 *
	 */
	public MCButton Btn_open_file = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_DL]モードを表す定数 */
	public static final String SRCH_DL = "SRCH_DL";
	/** [DL]モードを表す定数 */
	public static final String DL = "DL";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_DL, DL, SRCH_REF, REF, SRCH_DEL, DEL, FIX};
	
	/** [MB_MBBEL0050_Srch01]のCallerの作成 */
	protected MBBEP_BizDatDLHstSrch_MC.MB_MBBEL0050_Srch01Caller createMB_MBBEL0050_Srch01() {
		MBBEP_BizDatDLHstSrch_MC.MB_MBBEL0050_Srch01Caller<MBBEP_BizDatDLHstSrch, MB_MBBEL0050_Srch01Bridge>
		caller = ((MBBEP_BizDatDLHstSrch_MC)this).new MB_MBBEL0050_Srch01Caller<MBBEP_BizDatDLHstSrch, MB_MBBEL0050_Srch01Bridge>(
					(MBBEP_BizDatDLHstSrch)this, new MB_MBBEL0050_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBEL0050_Srch01]の呼び出し */
	protected void callMB_MBBEL0050_Srch01() {
		MCCaller caller = createMB_MBBEL0050_Srch01();
		caller.exec();
	}
	/** [MB_MBBEL0050_Del01]のCallerの作成 */
	protected MBBEP_BizDatDLHstSrch_MC.MB_MBBEL0050_Del01Caller createMB_MBBEL0050_Del01() {
		MBBEP_BizDatDLHstSrch_MC.MB_MBBEL0050_Del01Caller<MBBEP_BizDatDLHstSrch, MB_MBBEL0050_Del01Bridge>
		caller = ((MBBEP_BizDatDLHstSrch_MC)this).new MB_MBBEL0050_Del01Caller<MBBEP_BizDatDLHstSrch, MB_MBBEL0050_Del01Bridge>(
					(MBBEP_BizDatDLHstSrch)this, new MB_MBBEL0050_Del01Bridge());
		return caller;
	}
	/** [MB_MBBEL0050_Del01]の呼び出し */
	protected void callMB_MBBEL0050_Del01() {
		MCCaller caller = createMB_MBBEL0050_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0050.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBE.MBBEP0050.RsltR> aRsltL;
	/** [Rmrks]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0050.RmrksR aRmrksR;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMBBE.MBBEP0050.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBE.MBBEP0050.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0050.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBE.MBBEP0050.CndR createCndR() {
		return mcframe.clientMBBE.MBBEP0050.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBE.MBBEP0050.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0050.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBE.MBBEP0050.RsltR createRsltR() {
		return mcframe.clientMBBE.MBBEP0050.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBE.MBBEP0050.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBE.MBBEP0050.RsltR.class);
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
	 * 項目コピーによってaRmrksRを設定します。
	 *
	 * aRmrksRのインスタンスは変更されません。
	 *
	 * @param row RmrksR
	 */
	public void setRmrksR(mcframe.clientMBBE.MBBEP0050.RmrksR row) {
		if (row != null) {
			MCRow.copyall(getRmrksR(), row);
		}
	}

	/**
	 * [Rmrks]ブロックのコンテナaRmrksRを返します。
	 *
	 * @return RmrksR
	 */
	public mcframe.clientMBBE.MBBEP0050.RmrksR getRmrksR() {
		return aRmrksR;
	}

	/**
	 * aRmrksRを作成します。
	 *
	 * @return RmrksR
	 */
	public mcframe.clientMBBE.MBBEP0050.RmrksR createRmrksR() {
		return mcframe.clientMBBE.MBBEP0050.RmrksR.create();
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMBBE.MBBEP0050.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMBBE.MBBEP0050.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMBBE.MBBEP0050.BtnR createBtnR() {
		return mcframe.clientMBBE.MBBEP0050.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRmrksR())) ret.add(getRmrksR());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRmrksR()) return "Rmrks";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Rmrks")) return getRmrksR();
		if(bId.equals("Btn")) return getBtnR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(StsPanel);
		ret.add(FileTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(CenterPanel);
		ret.add(RsltPanel);
		ret.add(TabPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(RmrksPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBEP_BizDatDLHstSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aRmrksR = createRmrksR();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBEP_BizDatDLHstSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aRmrksR = createRmrksR();
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBEP_BizDatDLHstSrch_MC.jbCreateScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateSts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateFileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateTop((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateFold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateCnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateCtrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateCenter((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateRslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateTab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateTab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateTab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateTab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateRmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateBtn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbCreateEastBtn((MBBEP_BizDatDLHstSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [FileTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFileTyp(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBEP_BizDatDLHstSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Center]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCenter(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBEP_BizDatDLHstSrch p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMBBE.MBBEP0050.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Rmrks]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRmrks(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MBBEP_BizDatDLHstSrch p) {
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

	
	/** [Cnd_biz_dat_id_ListPutter]の定義 */
	private MCListPutter Cnd_biz_dat_id_p = null;

	/**
	 * [Cnd_biz_dat_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_biz_dat_id_ListPutter() {
		if (Cnd_biz_dat_id_p == null) {
			Cnd_biz_dat_id_p = createCnd_biz_dat_id_ListPutter(Cnd_biz_dat_id, "biz_dat_id", "biz_dat_nm");

		}
		return Cnd_biz_dat_id_p;
	}
	
	
	/** [Cnd_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_cd_p = null;

	/**
	 * [Cnd_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_cd_ListPutter() {
		if (Cnd_usr_cd_p == null) {
			Cnd_usr_cd_p = createCnd_usr_cd_ListPutter(Cnd_usr_cd, "usr_cd", "usr_nm");

		}
		return Cnd_usr_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BizDatDLHstSrch create(){
		MBBEP_BizDatDLHstSrch p = new MBBEP_BizDatDLHstSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBEP_BizDatDLHstSrch create(String name){
		MBBEP_BizDatDLHstSrch p = new MBBEP_BizDatDLHstSrch(name);
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
		MBBEP_BizDatDLHstSrch_MC.jbfInitScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitSts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitFileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitTop((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitFold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitCnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitCtrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitCenter((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitRslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitTab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitTab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitTab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitTab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitRmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitBtn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbfInitEastBtn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitSts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitFileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitTop((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitFold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitCnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitCtrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitCenter((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitRslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitTab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitTab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitTab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitTab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitRmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitBtn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.jbInitEastBtn((MBBEP_BizDatDLHstSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [FileTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFileTyp(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.FileTypPanel = p.beansFactory.createPanel("FileTyp");
		p.FileTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_DL = p.beansFactory.createRadioButton("Cnd.ope_DL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_running_flg = p.beansFactory.createCheckBox("Cnd.running_flg");
		p.Cnd_success_flg = p.beansFactory.createCheckBox("Cnd.success_flg");
		p.Cnd_download_flg = p.beansFactory.createCheckBox("Cnd.download_flg");
		p.Cnd_error_flg = p.beansFactory.createCheckBox("Cnd.error_flg");
		p.Cnd_excel_flg = p.beansFactory.createCheckBox("Cnd.excel_flg");
		p.Cnd_csv_flg = p.beansFactory.createCheckBox("Cnd.csv_flg");
		p.Cnd_report_flg = p.beansFactory.createCheckBox("Cnd.report_flg");
		p.Cnd_screen_flg = p.beansFactory.createCheckBox("Cnd.screen_flg");
		p.Cnd_proc_st_tm_fr_Label = p.beansFactory.createLabel("Cnd.proc_st_tm_fr_Label");
		p.Cnd_proc_st_tm_fr = p.beansFactory.createDateField("Cnd.proc_st_tm_fr");
		p.Cnd_proc_st_tm_fr.setLabel(p.Cnd_proc_st_tm_fr_Label);
		p.Cnd_proc_st_tm_to_Label = p.beansFactory.createLabel("Cnd.proc_st_tm_to_Label");
		p.Cnd_proc_st_tm_to = p.beansFactory.createDateField("Cnd.proc_st_tm_to");
		p.Cnd_proc_st_tm_to.setLabel(p.Cnd_proc_st_tm_to_Label);
		p.Cnd_proc_end_tm_fr_Label = p.beansFactory.createLabel("Cnd.proc_end_tm_fr_Label");
		p.Cnd_proc_end_tm_fr = p.beansFactory.createDateField("Cnd.proc_end_tm_fr");
		p.Cnd_proc_end_tm_fr.setLabel(p.Cnd_proc_end_tm_fr_Label);
		p.Cnd_proc_end_tm_to_Label = p.beansFactory.createLabel("Cnd.proc_end_tm_to_Label");
		p.Cnd_proc_end_tm_to = p.beansFactory.createDateField("Cnd.proc_end_tm_to");
		p.Cnd_proc_end_tm_to.setLabel(p.Cnd_proc_end_tm_to_Label);
		p.Cnd_biz_dat_id_Label = p.beansFactory.createLabel("Cnd.biz_dat_id_Label");
		p.Cnd_biz_dat_id = p.beansFactory.createTextComboBox("Cnd.biz_dat_id");
		p.Cnd_biz_dat_id.setLabel(p.Cnd_biz_dat_id_Label);
		p.Cnd_biz_dat_nm = p.beansFactory.createTextField("Cnd.biz_dat_nm");
		p.Cnd_biz_dat_rmrks1_Label = p.beansFactory.createLabel("Cnd.biz_dat_rmrks1_Label");
		p.Cnd_biz_dat_rmrks1 = p.beansFactory.createTextField("Cnd.biz_dat_rmrks1");
		p.Cnd_biz_dat_rmrks1.setLabel(p.Cnd_biz_dat_rmrks1_Label);
		p.Cnd_biz_dat_rmrks2_Label = p.beansFactory.createLabel("Cnd.biz_dat_rmrks2_Label");
		p.Cnd_biz_dat_rmrks2 = p.beansFactory.createTextField("Cnd.biz_dat_rmrks2");
		p.Cnd_biz_dat_rmrks2.setLabel(p.Cnd_biz_dat_rmrks2_Label);
		p.Cnd_biz_dat_rmrks3_Label = p.beansFactory.createLabel("Cnd.biz_dat_rmrks3_Label");
		p.Cnd_biz_dat_rmrks3 = p.beansFactory.createTextField("Cnd.biz_dat_rmrks3");
		p.Cnd_biz_dat_rmrks3.setLabel(p.Cnd_biz_dat_rmrks3_Label);
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_dl_tm_fr_Label = p.beansFactory.createLabel("Cnd.dl_tm_fr_Label");
		p.Cnd_dl_tm_fr = p.beansFactory.createDateField("Cnd.dl_tm_fr");
		p.Cnd_dl_tm_fr.setLabel(p.Cnd_dl_tm_fr_Label);
		p.Cnd_dl_tm_to_Label = p.beansFactory.createLabel("Cnd.dl_tm_to_Label");
		p.Cnd_dl_tm_to = p.beansFactory.createDateField("Cnd.dl_tm_to");
		p.Cnd_dl_tm_to.setLabel(p.Cnd_dl_tm_to_Label);
		p.Cnd_dl_file_nm_Label = p.beansFactory.createLabel("Cnd.dl_file_nm_Label");
		p.Cnd_dl_file_nm = p.beansFactory.createTextField("Cnd.dl_file_nm");
		p.Cnd_dl_file_nm.setLabel(p.Cnd_dl_file_nm_Label);
		p.Cnd_file_size_fr_Label = p.beansFactory.createLabel("Cnd.file_size_fr_Label");
		p.Cnd_file_size_fr = p.beansFactory.createNumberField("Cnd.file_size_fr");
		p.Cnd_file_size_fr.setLabel(p.Cnd_file_size_fr_Label);
		p.Cnd_file_size_to_Label = p.beansFactory.createLabel("Cnd.file_size_to_Label");
		p.Cnd_file_size_to = p.beansFactory.createNumberField("Cnd.file_size_to");
		p.Cnd_file_size_to.setLabel(p.Cnd_file_size_to_Label);
		p.Cnd_biz_dat_dl_cond_Label = p.beansFactory.createLabel("Cnd.biz_dat_dl_cond_Label");
		p.Cnd_biz_dat_dl_cond = p.beansFactory.createTextField("Cnd.biz_dat_dl_cond");
		p.Cnd_biz_dat_dl_cond.setLabel(p.Cnd_biz_dat_dl_cond_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Center]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCenter(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.CenterPanel = p.beansFactory.createPanel("Center");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_biz_dat_file_typ = p.beansFactory.createTableColumn("Rslt.biz_dat_file_typ", MCColumnType.TEXT);
		p.columnRslt_biz_dat_file_typ_nm = p.beansFactory.createTableColumn("Rslt.biz_dat_file_typ_nm", MCColumnType.TEXT);
		p.columnRslt_biz_dat_dl_sts_typ = p.beansFactory.createTableColumn("Rslt.biz_dat_dl_sts_typ", MCColumnType.TEXT);
		p.columnRslt_biz_dat_dl_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.biz_dat_dl_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_proc_st_tm = p.beansFactory.createTableColumn("Rslt.proc_st_tm", MCColumnType.DATE);
		p.columnRslt_proc_end_tm = p.beansFactory.createTableColumn("Rslt.proc_end_tm", MCColumnType.DATE);
		p.columnRslt_biz_dat_id = p.beansFactory.createTableColumn("Rslt.biz_dat_id", MCColumnType.TEXT);
		p.columnRslt_biz_dat_nm = p.beansFactory.createTableColumn("Rslt.biz_dat_nm", MCColumnType.TEXT);
		p.columnRslt_dl_tm = p.beansFactory.createTableColumn("Rslt.dl_tm", MCColumnType.DATE);
		p.columnRslt_dl_file_path = p.beansFactory.createTableColumn("Rslt.dl_file_path", MCColumnType.TEXT);
		p.columnRslt_dl_file_nm = p.beansFactory.createTableColumn("Rslt.dl_file_nm", MCColumnType.TEXT);
		p.columnRslt_data_cnt = p.beansFactory.createTableColumn("Rslt.data_cnt", MCColumnType.NUMBER);
		p.columnRslt_file_size = p.beansFactory.createTableColumn("Rslt.file_size", MCColumnType.NUMBER);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_biz_dat_dl_cond = p.beansFactory.createTableColumn("Rslt.biz_dat_dl_cond", MCColumnType.TEXT);
		p.columnRslt_biz_dat_dl_hst_no = p.beansFactory.createTableColumn("Rslt.biz_dat_dl_hst_no", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		p.TabTab = p.beansFactory.createTabbedPane("Tab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Rmrks]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRmrks(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.RmrksPanel = p.beansFactory.createPanel("Rmrks");
		// ブロックの項目の初期化
		p.Rmrks_biz_dat_rmrks1ScrollPane = p.beansFactory.createScrollPane("Rmrks.biz_dat_rmrks1scroll");
		p.Rmrks_biz_dat_rmrks1 = p.beansFactory.createTextArea("Rmrks.biz_dat_rmrks1");
		p.Rmrks_biz_dat_rmrks2ScrollPane = p.beansFactory.createScrollPane("Rmrks.biz_dat_rmrks2scroll");
		p.Rmrks_biz_dat_rmrks2 = p.beansFactory.createTextArea("Rmrks.biz_dat_rmrks2");
		p.Rmrks_biz_dat_rmrks3ScrollPane = p.beansFactory.createScrollPane("Rmrks.biz_dat_rmrks3scroll");
		p.Rmrks_biz_dat_rmrks3 = p.beansFactory.createTextArea("Rmrks.biz_dat_rmrks3");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_dl_file_path_Label = p.beansFactory.createLabel("Btn.dl_file_path_Label");
		p.Btn_dl_file_path = p.beansFactory.createTextField("Btn.dl_file_path");
		p.Btn_dl_file_path.setLabel(p.Btn_dl_file_path_Label);
		p.Btn_select_dir = p.beansFactory.createButton("Btn.select_dir", "no_border");
		p.Btn_dwnld = p.beansFactory.createButton("Btn.dwnld", "dwnld");
		p.Btn_open_dir = p.beansFactory.createButton("Btn.open_dir");
		p.Btn_open_file = p.beansFactory.createButton("Btn.open_file");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.StsPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.StsPanel.setNextBeans(p.FileTypPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [FileTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFileTyp(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.FileTypPanel.setBorder(p.FileTypTitledBorder);
		p.add(p.FileTypPanel);
		p.FileTypPanel.setNextBeans(p.TopPanel);
		p.FileTypPanel.setValueCheck(false);
		p.FileTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FileTypPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CenterPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_DL);
		p.Cnd_ope_DL.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_DL);
		p.ScreenOpePanel.add(p.Cnd_ope_DL);
		p.Cnd_ope_DL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.ope_META);
		p.StsPanel.add(p.Cnd_running_flg);
		p.StsPanel.setLastBeans(p.Cnd_running_flg);
		p.Cnd_running_flg.setNextBeans(p.Cnd_success_flg);
		p.Cnd_running_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.running_flg_META);
		p.StsPanel.add(p.Cnd_success_flg);
		p.Cnd_success_flg.setNextBeans(p.Cnd_download_flg);
		p.Cnd_success_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.success_flg_META);
		p.StsPanel.add(p.Cnd_download_flg);
		p.Cnd_download_flg.setNextBeans(p.Cnd_error_flg);
		p.Cnd_download_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.download_flg_META);
		p.StsPanel.add(p.Cnd_error_flg);
		p.Cnd_error_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.error_flg_META);
		p.FileTypPanel.add(p.Cnd_excel_flg);
		p.FileTypPanel.setLastBeans(p.Cnd_excel_flg);
		p.Cnd_excel_flg.setNextBeans(p.Cnd_csv_flg);
		p.Cnd_excel_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.excel_flg_META);
		p.FileTypPanel.add(p.Cnd_csv_flg);
		p.Cnd_csv_flg.setNextBeans(p.Cnd_report_flg);
		p.Cnd_csv_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.csv_flg_META);
		p.FileTypPanel.add(p.Cnd_report_flg);
		p.Cnd_report_flg.setNextBeans(p.Cnd_screen_flg);
		p.Cnd_report_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.report_flg_META);
		p.FileTypPanel.add(p.Cnd_screen_flg);
		p.Cnd_screen_flg.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.screen_flg_META);
		p.CndPanel.add(p.Cnd_proc_st_tm_fr_Label);
		p.CndPanel.add(p.Cnd_proc_st_tm_fr);
		p.CndPanel.setLastBeans(p.Cnd_proc_st_tm_fr);
		p.Cnd_proc_st_tm_fr.setNextBeans(p.Cnd_proc_st_tm_to);
		p.Cnd_proc_st_tm_fr.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.proc_st_tm_fr_META);
		p.Cnd_proc_st_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_proc_st_tm_to_Label);
		p.CndPanel.add(p.Cnd_proc_st_tm_to);
		p.Cnd_proc_st_tm_to.setNextBeans(p.Cnd_proc_end_tm_fr);
		p.Cnd_proc_st_tm_to.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.proc_st_tm_to_META);
		p.Cnd_proc_st_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_proc_end_tm_fr_Label);
		p.CndPanel.add(p.Cnd_proc_end_tm_fr);
		p.Cnd_proc_end_tm_fr.setNextBeans(p.Cnd_proc_end_tm_to);
		p.Cnd_proc_end_tm_fr.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.proc_end_tm_fr_META);
		p.Cnd_proc_end_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_proc_end_tm_to_Label);
		p.CndPanel.add(p.Cnd_proc_end_tm_to);
		p.Cnd_proc_end_tm_to.setNextBeans(p.Cnd_biz_dat_id);
		p.Cnd_proc_end_tm_to.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.proc_end_tm_to_META);
		p.Cnd_proc_end_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd_biz_dat_id.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_biz_dat_id, true);
		p.Cnd_biz_dat_id.setLinkBeans(p.Cnd_biz_dat_nm);
		p.CndPanel.add(p.Cnd_biz_dat_id_Label);
		p.CndPanel.add(p.Cnd_biz_dat_id);
		p.Cnd_biz_dat_id.setNextBeans(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_id.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.biz_dat_id_META);
		p.CndPanel.add(p.Cnd_biz_dat_nm);
		p.Cnd_biz_dat_nm.setNextBeans(p.Cnd_biz_dat_rmrks1);
		p.Cnd_biz_dat_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.biz_dat_nm_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_nm, true);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks1_Label);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks1);
		p.Cnd_biz_dat_rmrks1.setNextBeans(p.Cnd_biz_dat_rmrks2);
		p.Cnd_biz_dat_rmrks1.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.biz_dat_rmrks1_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_rmrks1, true);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks2_Label);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks2);
		p.Cnd_biz_dat_rmrks2.setNextBeans(p.Cnd_biz_dat_rmrks3);
		p.Cnd_biz_dat_rmrks2.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.biz_dat_rmrks2_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_rmrks2, true);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks3_Label);
		p.CndPanel.add(p.Cnd_biz_dat_rmrks3);
		p.Cnd_biz_dat_rmrks3.setNextBeans(p.Cnd_usr_cd);
		p.Cnd_biz_dat_rmrks3.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.biz_dat_rmrks3_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_rmrks3, true);
		p.CndPanel.add(p.Cnd_usr_cd_Label);
		p.CndPanel.add(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.CndPanel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_dl_tm_fr);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.CndPanel.add(p.Cnd_dl_tm_fr_Label);
		p.CndPanel.add(p.Cnd_dl_tm_fr);
		p.Cnd_dl_tm_fr.setNextBeans(p.Cnd_dl_tm_to);
		p.Cnd_dl_tm_fr.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.dl_tm_fr_META);
		p.Cnd_dl_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_dl_tm_to_Label);
		p.CndPanel.add(p.Cnd_dl_tm_to);
		p.Cnd_dl_tm_to.setNextBeans(p.Cnd_dl_file_nm);
		p.Cnd_dl_tm_to.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.dl_tm_to_META);
		p.Cnd_dl_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_dl_file_nm_Label);
		p.CndPanel.add(p.Cnd_dl_file_nm);
		p.Cnd_dl_file_nm.setNextBeans(p.Cnd_file_size_fr);
		p.Cnd_dl_file_nm.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.dl_file_nm_META);
		p.setPluralValueEnable(p.Cnd_dl_file_nm, true);
		p.CndPanel.add(p.Cnd_file_size_fr_Label);
		p.CndPanel.add(p.Cnd_file_size_fr);
		p.Cnd_file_size_fr.setNextBeans(p.Cnd_file_size_to);
		p.Cnd_file_size_fr.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.file_size_fr_META);
		p.CndPanel.add(p.Cnd_file_size_to_Label);
		p.CndPanel.add(p.Cnd_file_size_to);
		p.Cnd_file_size_to.setNextBeans(p.Cnd_biz_dat_dl_cond);
		p.Cnd_file_size_to.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.file_size_to_META);
		p.CndPanel.add(p.Cnd_biz_dat_dl_cond_Label);
		p.CndPanel.add(p.Cnd_biz_dat_dl_cond);
		p.Cnd_biz_dat_dl_cond.setRow(p.getCndR(), mcframe.clientMBBE.MBBEP0050.CndR.biz_dat_dl_cond_META);
		p.setPluralValueEnable(p.Cnd_biz_dat_dl_cond, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Center]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCenter(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.add(p.CenterPanel);
		p.CenterPanel.setNextBeans(p.RmrksPanel);
		p.CenterPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.CenterPanel.add(p.RsltPanel, null);
		p.CenterPanel.setLastBeans(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.TabPanel);
		p.CenterPanel.add(p.TabPanel, null);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.TabPanel.add(p.TabTab);
		p.TabPanel.setLastBeans(p.TabTab);
		p.TabPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.TabTab.add(p.Tab1Panel, "Tab.tab1");
		p.TabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.TabTab.add(p.Tab2Panel, "Tab.tab2");
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.TabTab.add(p.Tab3Panel, "Tab.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Rmrks]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRmrks(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.add(p.RmrksPanel);
		p.RmrksPanel.setNextBeans(p.BtnPanel);
		// ブロックの項目の初期化
		p.Rmrks_biz_dat_rmrks1ScrollPane.getViewport().add(p.Rmrks_biz_dat_rmrks1);
		p.Tab1Panel.add(p.Rmrks_biz_dat_rmrks1ScrollPane);
		p.Tab1Panel.setLastBeans(p.Rmrks_biz_dat_rmrks1);
		p.Rmrks_biz_dat_rmrks1.setRow(p.getRmrksR(), mcframe.clientMBBE.MBBEP0050.RmrksR.biz_dat_rmrks1_META);
		p.Rmrks_biz_dat_rmrks2ScrollPane.getViewport().add(p.Rmrks_biz_dat_rmrks2);
		p.Tab2Panel.add(p.Rmrks_biz_dat_rmrks2ScrollPane);
		p.Tab2Panel.setLastBeans(p.Rmrks_biz_dat_rmrks2);
		p.Rmrks_biz_dat_rmrks2.setRow(p.getRmrksR(), mcframe.clientMBBE.MBBEP0050.RmrksR.biz_dat_rmrks2_META);
		p.Rmrks_biz_dat_rmrks3ScrollPane.getViewport().add(p.Rmrks_biz_dat_rmrks3);
		p.Tab3Panel.add(p.Rmrks_biz_dat_rmrks3ScrollPane);
		p.Tab3Panel.setLastBeans(p.Rmrks_biz_dat_rmrks3);
		p.Rmrks_biz_dat_rmrks3.setRow(p.getRmrksR(), mcframe.clientMBBE.MBBEP0050.RmrksR.biz_dat_rmrks3_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_dl_file_path);
		p.BtnPanel.add(p.Btn_dl_file_path_Label);
		p.BtnPanel.add(p.Btn_dl_file_path);
		p.Btn_dl_file_path.setNextBeans(p.Btn_select_dir);
		p.Btn_dl_file_path.setRow(p.getBtnR(), mcframe.clientMBBE.MBBEP0050.BtnR.dl_file_path_META);
		p.Btn_select_dir.setIcon("FOLDER");
		p.Btn_select_dir.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_select_dir);
		p.Btn_select_dir.setNextBeans(p.Btn_dwnld);
		p.Btn_dwnld.setIcon("DWNLD");
		p.Btn_dwnld.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_dwnld);
		p.Btn_dwnld.setNextBeans(p.Btn_open_dir);
		p.Btn_open_dir.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dir);
		p.Btn_open_dir.setNextBeans(p.Btn_open_file);
		p.Btn_open_file.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_file);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MBBEP_BizDatDLHstSrch p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MBBEP_BizDatDLHstSrch_MC.mcInitScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitSts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitFileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitTop((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitFold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitCnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitCtrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitCenter((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitRslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitTab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitTab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitTab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitTab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitRmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitBtn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.mcInitEastBtn((MBBEP_BizDatDLHstSrch)this);

		// [SRCH_DL]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DL_EastBtn((MBBEP_BizDatDLHstSrch)this);

		// [DL]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDL_EastBtn((MBBEP_BizDatDLHstSrch)this);

		// [SRCH_REF]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__REF_EastBtn((MBBEP_BizDatDLHstSrch)this);

		// [REF]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitREF_EastBtn((MBBEP_BizDatDLHstSrch)this);

		// [SRCH_DEL]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitSRCH__DEL_EastBtn((MBBEP_BizDatDLHstSrch)this);

		// [DEL]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitDEL_EastBtn((MBBEP_BizDatDLHstSrch)this);

		// [FIX]ステータスのモードの設定
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_ScreenOpe((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Sts((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_FileTyp((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Top((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Fold((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Cnd((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Ctrl((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Center((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Rslt((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Tab((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Tab1((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Tab2((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Tab3((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Rmrks((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_Btn((MBBEP_BizDatDLHstSrch)this);
		MBBEP_BizDatDLHstSrch_MC.statusInitFIX_EastBtn((MBBEP_BizDatDLHstSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [FileTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFileTyp(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBEP_BizDatDLHstSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_DL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_running_flg.addAllListener(p);
		p.Cnd_success_flg.addAllListener(p);
		p.Cnd_download_flg.addAllListener(p);
		p.Cnd_error_flg.addAllListener(p);
		p.Cnd_excel_flg.addAllListener(p);
		p.Cnd_csv_flg.addAllListener(p);
		p.Cnd_report_flg.addAllListener(p);
		p.Cnd_screen_flg.addAllListener(p);
		p.Cnd_proc_st_tm_fr.setListListener(p);
		p.Cnd_proc_st_tm_fr.addAllListener(p);
		p.Cnd_proc_st_tm_to.setListListener(p);
		p.Cnd_proc_st_tm_to.addAllListener(p);
		p.Cnd_proc_end_tm_fr.setListListener(p);
		p.Cnd_proc_end_tm_fr.addAllListener(p);
		p.Cnd_proc_end_tm_to.setListListener(p);
		p.Cnd_proc_end_tm_to.addAllListener(p);
		p.Cnd_biz_dat_id.setListListener(p);
		p.Cnd_biz_dat_id.addAllListener(p);
		p.Cnd_biz_dat_nm.setListListener(p);
		p.Cnd_biz_dat_nm.addAllListener(p);
		p.Cnd_biz_dat_rmrks1.setListListener(p);
		p.Cnd_biz_dat_rmrks1.addAllListener(p);
		p.Cnd_biz_dat_rmrks2.setListListener(p);
		p.Cnd_biz_dat_rmrks2.addAllListener(p);
		p.Cnd_biz_dat_rmrks3.setListListener(p);
		p.Cnd_biz_dat_rmrks3.addAllListener(p);
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_dl_tm_fr.setListListener(p);
		p.Cnd_dl_tm_fr.addAllListener(p);
		p.Cnd_dl_tm_to.setListListener(p);
		p.Cnd_dl_tm_to.addAllListener(p);
		p.Cnd_dl_file_nm.setListListener(p);
		p.Cnd_dl_file_nm.addAllListener(p);
		p.Cnd_file_size_fr.setListListener(p);
		p.Cnd_file_size_fr.addAllListener(p);
		p.Cnd_file_size_to.setListListener(p);
		p.Cnd_file_size_to.addAllListener(p);
		p.Cnd_biz_dat_dl_cond.setListListener(p);
		p.Cnd_biz_dat_dl_cond.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBEP_BizDatDLHstSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Center]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCenter(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBEP_BizDatDLHstSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_biz_dat_file_typ.addAllListener(p);
		p.columnRslt_biz_dat_file_typ.setListListener(p);
		p.columnRslt_biz_dat_file_typ_nm.addAllListener(p);
		p.columnRslt_biz_dat_file_typ_nm.setListListener(p);
		p.columnRslt_biz_dat_dl_sts_typ.addAllListener(p);
		p.columnRslt_biz_dat_dl_sts_typ.setListListener(p);
		p.columnRslt_biz_dat_dl_sts_typ_nm.addAllListener(p);
		p.columnRslt_biz_dat_dl_sts_typ_nm.setListListener(p);
		p.columnRslt_proc_st_tm.addAllListener(p);
		p.columnRslt_proc_st_tm.setListListener(p);
		p.columnRslt_proc_end_tm.addAllListener(p);
		p.columnRslt_proc_end_tm.setListListener(p);
		p.columnRslt_biz_dat_id.addAllListener(p);
		p.columnRslt_biz_dat_id.setListListener(p);
		p.columnRslt_biz_dat_nm.addAllListener(p);
		p.columnRslt_biz_dat_nm.setListListener(p);
		p.columnRslt_dl_tm.addAllListener(p);
		p.columnRslt_dl_tm.setListListener(p);
		p.columnRslt_dl_file_path.addAllListener(p);
		p.columnRslt_dl_file_path.setListListener(p);
		p.columnRslt_dl_file_nm.addAllListener(p);
		p.columnRslt_dl_file_nm.setListListener(p);
		p.columnRslt_data_cnt.addAllListener(p);
		p.columnRslt_data_cnt.setListListener(p);
		p.columnRslt_file_size.addAllListener(p);
		p.columnRslt_file_size.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_biz_dat_dl_cond.addAllListener(p);
		p.columnRslt_biz_dat_dl_cond.setListListener(p);
		p.columnRslt_biz_dat_dl_hst_no.addAllListener(p);
		p.columnRslt_biz_dat_dl_hst_no.setListListener(p);
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
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MBBEP_BizDatDLHstSrch p) {
		p.TabTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 *  [Rmrks]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRmrks(MBBEP_BizDatDLHstSrch p) {
		p.Rmrks_biz_dat_rmrks1.addAllListener(p);
		p.Rmrks_biz_dat_rmrks2.addAllListener(p);
		p.Rmrks_biz_dat_rmrks3.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBEP_BizDatDLHstSrch p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_dl_file_path.setListListener(p);
		p.Btn_dl_file_path.addAllListener(p);
		p.Btn_select_dir.addAllListener(p);
		p.Btn_select_dir.setAPMethodName("doBtn_select_dir");
		p.Btn_dwnld.addAllListener(p);
		p.Btn_dwnld.setAPMethodName("doBtn_dwnld");
		p.Btn_open_dir.addAllListener(p);
		p.Btn_open_dir.setAPMethodName("doBtn_open_dir");
		p.Btn_open_file.addAllListener(p);
		p.Btn_open_file.setAPMethodName("doBtn_open_file");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MBBEP_BizDatDLHstSrch p) {
	}

	/**
	 * [SRCH_DL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, SRCH_DL, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.Cnd_usr_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.Cnd_dl_tm_fr.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, SRCH_DL, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, SRCH_DL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DL]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, SRCH_DL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, SRCH_DL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DL, MCMode.DISABLE);
		p.Btn_dl_file_path.putMode(p, SRCH_DL, MCMode.READ_ONLY);
		p.Btn_select_dir.putMode(p, SRCH_DL, MCMode.DISABLE);
		p.Btn_dwnld.putMode(p, SRCH_DL, MCMode.DISABLE);
		p.Btn_open_dir.putMode(p, SRCH_DL, MCMode.DISABLE);
		p.Btn_open_file.putMode(p, SRCH_DL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DL_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDL_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitDL_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitDL_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDL_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDL_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDL_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, DL, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, DL, MCMode.READ_ONLY);
		p.Cnd_usr_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.Cnd_dl_tm_fr.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, DL, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, DL, MCMode.ENABLE);

	}

	/**
	 * [DL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDL_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitDL_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDL_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, DL, MCMode.REQUIRED);
		p.columnRslt_biz_dat_file_typ.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, DL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DL, MCMode.READ_ONLY);

	}

	/**
	 * [DL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitDL_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDL_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDL_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDL_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DL]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitDL_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, DL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, DL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, DL, MCMode.READ_ONLY);

	}

	/**
	 * [DL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDL_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, DL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DL, MCMode.ENABLE);
		p.Btn_dl_file_path.putMode(p, DL, MCMode.REQUIRED);
		p.Btn_select_dir.putMode(p, DL, MCMode.ENABLE);
		p.Btn_dwnld.putMode(p, DL, MCMode.ENABLE);
		p.Btn_open_dir.putMode(p, DL, MCMode.ENABLE);
		p.Btn_open_file.putMode(p, DL, MCMode.ENABLE);
		p.Btn_del.putMode(p, DL, MCMode.DISABLE);

	}

	/**
	 * [DL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDL_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dl_tm_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_dl_file_path.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_select_dir.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_dwnld.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_dir.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_file.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dl_tm_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitREF_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [REF]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_dl_file_path.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_select_dir.putMode(p, REF, MCMode.DISABLE);
		p.Btn_dwnld.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_dir.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_file.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dl_tm_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_dl_file_path.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_select_dir.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_dwnld.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_dir.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_file.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dl_tm_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_biz_dat_file_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [DEL]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_dl_file_path.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_select_dir.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_dwnld.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_dir.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_file.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Sts(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[FileTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_FileTyp(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MBBEP_BizDatDLHstSrch p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_running_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_success_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_download_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_error_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_excel_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_csv_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_report_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_screen_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_proc_st_tm_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_proc_st_tm_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_proc_end_tm_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_proc_end_tm_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_biz_dat_id.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_biz_dat_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_biz_dat_rmrks3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dl_tm_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dl_tm_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dl_file_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_file_size_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_file_size_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_biz_dat_dl_cond.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Center(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Rslt(MBBEP_BizDatDLHstSrch p){
		p.columnRslt_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_file_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_sts_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_proc_st_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_proc_end_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_dl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_dl_file_path.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_dl_file_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_data_cnt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_file_size.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_cond.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_biz_dat_dl_hst_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab3(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * [FIX]ステータスの[Rmrks]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Rmrks(MBBEP_BizDatDLHstSrch p){
		p.Rmrks_biz_dat_rmrks1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rmrks_biz_dat_rmrks3.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MBBEP_BizDatDLHstSrch p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_dl_file_path.putMode(p, FIX, MCMode.READ_ONLY);
		p.Btn_select_dir.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_dwnld.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_open_dir.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_open_file.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MBBEP_BizDatDLHstSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_DL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MBBEP_BizDatDLHstSrch_MC.setTableConfigRslt((MBBEP_BizDatDLHstSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBEP_BizDatDLHstSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_biz_dat_file_typ.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_file_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_file_typ);
		p.columnRslt_biz_dat_file_typ_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_file_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_file_typ_nm);
		p.columnRslt_biz_dat_dl_sts_typ.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_dl_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_dl_sts_typ);
		p.columnRslt_biz_dat_dl_sts_typ_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_dl_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_dl_sts_typ_nm);
		p.columnRslt_proc_st_tm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.proc_st_tm_META);
		p.columnRslt_proc_st_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_st_tm);
		p.columnRslt_proc_end_tm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.proc_end_tm_META);
		p.columnRslt_proc_end_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_end_tm);
		p.columnRslt_biz_dat_id.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_id);
		p.columnRslt_biz_dat_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_nm);
		p.columnRslt_dl_tm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.dl_tm_META);
		p.columnRslt_dl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dl_tm);
		p.columnRslt_dl_file_path.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.dl_file_path_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dl_file_path);
		p.columnRslt_dl_file_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.dl_file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dl_file_nm);
		p.columnRslt_data_cnt.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.data_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_cnt);
		p.columnRslt_file_size.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.file_size_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_size);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_biz_dat_dl_cond.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_dl_cond_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_dl_cond);
		p.columnRslt_biz_dat_dl_hst_no.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.biz_dat_dl_hst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_dat_dl_hst_no);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBE.MBBEP0050.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_biz_dat_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_biz_dat_id.getListConfig().setPutter(getCnd_biz_dat_id_ListPutter());
		Cnd_usr_cd.getListConfig().setPutter(getCnd_usr_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_DL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DLStatus() {
		status = SRCH_DL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDLStatus() {
		status = DL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_DL.equals(status)) {
			setSRCH_DLStatus();
		}
		else if (DL.equals(status)) {
			setDLStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
	}

	/**
	 * [Cnd_biz_dat_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_biz_dat_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MB.MBUAP0010.BizDatID");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_biz_dat_id) return getCnd_biz_dat_id(row, info);
		if(combo == Cnd_usr_cd) return getCnd_usr_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_select_dir) doBtn_select_dir(info);
		else if (ap == Btn_dwnld) doBtn_dwnld(info);
		else if (ap == Btn_open_dir) doBtn_open_dir(info);
		else if (ap == Btn_open_file) doBtn_open_file(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_dir]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_dir(MCEventInfo info);

	/**
	 * [Btn]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_dir]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dir(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == TabTab) return doTab_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_running_flg) return doCnd_running_flg_VC(info);
		if (vc == Cnd_success_flg) return doCnd_success_flg_VC(info);
		if (vc == Cnd_download_flg) return doCnd_download_flg_VC(info);
		if (vc == Cnd_error_flg) return doCnd_error_flg_VC(info);
		if (vc == Cnd_excel_flg) return doCnd_excel_flg_VC(info);
		if (vc == Cnd_csv_flg) return doCnd_csv_flg_VC(info);
		if (vc == Cnd_report_flg) return doCnd_report_flg_VC(info);
		if (vc == Cnd_screen_flg) return doCnd_screen_flg_VC(info);
		if (vc == Cnd_proc_st_tm_fr) return doCnd_proc_st_tm_fr_VC(info);
		if (vc == Cnd_proc_st_tm_to) return doCnd_proc_st_tm_to_VC(info);
		if (vc == Cnd_proc_end_tm_fr) return doCnd_proc_end_tm_fr_VC(info);
		if (vc == Cnd_proc_end_tm_to) return doCnd_proc_end_tm_to_VC(info);
		if (vc == Cnd_biz_dat_id) return doCnd_biz_dat_id_VC(info);
		if (vc == Cnd_biz_dat_nm) return doCnd_biz_dat_nm_VC(info);
		if (vc == Cnd_biz_dat_rmrks1) return doCnd_biz_dat_rmrks1_VC(info);
		if (vc == Cnd_biz_dat_rmrks2) return doCnd_biz_dat_rmrks2_VC(info);
		if (vc == Cnd_biz_dat_rmrks3) return doCnd_biz_dat_rmrks3_VC(info);
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_dl_tm_fr) return doCnd_dl_tm_fr_VC(info);
		if (vc == Cnd_dl_tm_to) return doCnd_dl_tm_to_VC(info);
		if (vc == Cnd_dl_file_nm) return doCnd_dl_file_nm_VC(info);
		if (vc == Cnd_file_size_fr) return doCnd_file_size_fr_VC(info);
		if (vc == Cnd_file_size_to) return doCnd_file_size_to_VC(info);
		if (vc == Cnd_biz_dat_dl_cond) return doCnd_biz_dat_dl_cond_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_biz_dat_file_typ) return doRslt_biz_dat_file_typ_VC(info);
		if (vc == columnRslt_biz_dat_file_typ_nm) return doRslt_biz_dat_file_typ_nm_VC(info);
		if (vc == columnRslt_biz_dat_dl_sts_typ) return doRslt_biz_dat_dl_sts_typ_VC(info);
		if (vc == columnRslt_biz_dat_dl_sts_typ_nm) return doRslt_biz_dat_dl_sts_typ_nm_VC(info);
		if (vc == columnRslt_proc_st_tm) return doRslt_proc_st_tm_VC(info);
		if (vc == columnRslt_proc_end_tm) return doRslt_proc_end_tm_VC(info);
		if (vc == columnRslt_biz_dat_id) return doRslt_biz_dat_id_VC(info);
		if (vc == columnRslt_biz_dat_nm) return doRslt_biz_dat_nm_VC(info);
		if (vc == columnRslt_dl_tm) return doRslt_dl_tm_VC(info);
		if (vc == columnRslt_dl_file_path) return doRslt_dl_file_path_VC(info);
		if (vc == columnRslt_dl_file_nm) return doRslt_dl_file_nm_VC(info);
		if (vc == columnRslt_data_cnt) return doRslt_data_cnt_VC(info);
		if (vc == columnRslt_file_size) return doRslt_file_size_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_biz_dat_dl_cond) return doRslt_biz_dat_dl_cond_VC(info);
		if (vc == columnRslt_biz_dat_dl_hst_no) return doRslt_biz_dat_dl_hst_no_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == Rmrks_biz_dat_rmrks1) return doRmrks_biz_dat_rmrks1_VC(info);
		if (vc == Rmrks_biz_dat_rmrks2) return doRmrks_biz_dat_rmrks2_VC(info);
		if (vc == Rmrks_biz_dat_rmrks3) return doRmrks_biz_dat_rmrks3_VC(info);
		if (vc == Btn_dl_file_path) return doBtn_dl_file_path_VC(info);
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
	 * [Tab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[running_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_running_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[success_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_success_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[download_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_download_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[error_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_error_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[excel_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_excel_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[csv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_csv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[report_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_report_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[screen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_screen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_st_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_st_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_end_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_end_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dl_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dl_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dl_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dl_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dl_file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dl_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[file_size_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_file_size_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[file_size_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_file_size_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_dat_dl_cond]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_dat_dl_cond_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[biz_dat_file_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_file_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_file_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_dl_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_dl_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[proc_st_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_st_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[proc_end_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_end_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dl_file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dl_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dl_file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dl_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_size]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_size_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_cond]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_dl_cond_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_hst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_dat_dl_hst_no_VC(MCEventInfo info){
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
	 * [Rmrks]パネルの[biz_dat_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRmrks_biz_dat_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRmrks_biz_dat_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRmrks_biz_dat_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[dl_file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_dl_file_path_VC(MCEventInfo info){
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
		else if (nc == TabTab) doTab_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_running_flg) doCnd_running_flg_NC(info);
		else if (nc == Cnd_success_flg) doCnd_success_flg_NC(info);
		else if (nc == Cnd_download_flg) doCnd_download_flg_NC(info);
		else if (nc == Cnd_error_flg) doCnd_error_flg_NC(info);
		else if (nc == Cnd_excel_flg) doCnd_excel_flg_NC(info);
		else if (nc == Cnd_csv_flg) doCnd_csv_flg_NC(info);
		else if (nc == Cnd_report_flg) doCnd_report_flg_NC(info);
		else if (nc == Cnd_screen_flg) doCnd_screen_flg_NC(info);
		else if (nc == Cnd_proc_st_tm_fr) doCnd_proc_st_tm_fr_NC(info);
		else if (nc == Cnd_proc_st_tm_to) doCnd_proc_st_tm_to_NC(info);
		else if (nc == Cnd_proc_end_tm_fr) doCnd_proc_end_tm_fr_NC(info);
		else if (nc == Cnd_proc_end_tm_to) doCnd_proc_end_tm_to_NC(info);
		else if (nc == Cnd_biz_dat_id) doCnd_biz_dat_id_NC(info);
		else if (nc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NC(info);
		else if (nc == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_NC(info);
		else if (nc == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_NC(info);
		else if (nc == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_NC(info);
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_dl_tm_fr) doCnd_dl_tm_fr_NC(info);
		else if (nc == Cnd_dl_tm_to) doCnd_dl_tm_to_NC(info);
		else if (nc == Cnd_dl_file_nm) doCnd_dl_file_nm_NC(info);
		else if (nc == Cnd_file_size_fr) doCnd_file_size_fr_NC(info);
		else if (nc == Cnd_file_size_to) doCnd_file_size_to_NC(info);
		else if (nc == Cnd_biz_dat_dl_cond) doCnd_biz_dat_dl_cond_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_biz_dat_file_typ) doRslt_biz_dat_file_typ_NC(info);
		else if (nc == columnRslt_biz_dat_file_typ_nm) doRslt_biz_dat_file_typ_nm_NC(info);
		else if (nc == columnRslt_biz_dat_dl_sts_typ) doRslt_biz_dat_dl_sts_typ_NC(info);
		else if (nc == columnRslt_biz_dat_dl_sts_typ_nm) doRslt_biz_dat_dl_sts_typ_nm_NC(info);
		else if (nc == columnRslt_proc_st_tm) doRslt_proc_st_tm_NC(info);
		else if (nc == columnRslt_proc_end_tm) doRslt_proc_end_tm_NC(info);
		else if (nc == columnRslt_biz_dat_id) doRslt_biz_dat_id_NC(info);
		else if (nc == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_NC(info);
		else if (nc == columnRslt_dl_tm) doRslt_dl_tm_NC(info);
		else if (nc == columnRslt_dl_file_path) doRslt_dl_file_path_NC(info);
		else if (nc == columnRslt_dl_file_nm) doRslt_dl_file_nm_NC(info);
		else if (nc == columnRslt_data_cnt) doRslt_data_cnt_NC(info);
		else if (nc == columnRslt_file_size) doRslt_file_size_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_biz_dat_dl_cond) doRslt_biz_dat_dl_cond_NC(info);
		else if (nc == columnRslt_biz_dat_dl_hst_no) doRslt_biz_dat_dl_hst_no_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == Rmrks_biz_dat_rmrks1) doRmrks_biz_dat_rmrks1_NC(info);
		else if (nc == Rmrks_biz_dat_rmrks2) doRmrks_biz_dat_rmrks2_NC(info);
		else if (nc == Rmrks_biz_dat_rmrks3) doRmrks_biz_dat_rmrks3_NC(info);
		else if (nc == Btn_dl_file_path) doBtn_dl_file_path_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Tab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[running_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_running_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[success_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_success_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[download_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_download_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[error_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_error_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excel_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excel_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[csv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_csv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[screen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_dl_cond]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_dl_cond_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_st_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_st_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_end_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_end_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_size]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_size_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_cond]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_cond_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_hst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_hst_no_NC(MCEventInfo info){
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
	 * [Rmrks]パネルの[biz_dat_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[dl_file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dl_file_path_NC(MCEventInfo info){
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
		else if (ne == TabTab) doTab_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_running_flg) doCnd_running_flg_NE(info);
		else if (ne == Cnd_success_flg) doCnd_success_flg_NE(info);
		else if (ne == Cnd_download_flg) doCnd_download_flg_NE(info);
		else if (ne == Cnd_error_flg) doCnd_error_flg_NE(info);
		else if (ne == Cnd_excel_flg) doCnd_excel_flg_NE(info);
		else if (ne == Cnd_csv_flg) doCnd_csv_flg_NE(info);
		else if (ne == Cnd_report_flg) doCnd_report_flg_NE(info);
		else if (ne == Cnd_screen_flg) doCnd_screen_flg_NE(info);
		else if (ne == Cnd_proc_st_tm_fr) doCnd_proc_st_tm_fr_NE(info);
		else if (ne == Cnd_proc_st_tm_to) doCnd_proc_st_tm_to_NE(info);
		else if (ne == Cnd_proc_end_tm_fr) doCnd_proc_end_tm_fr_NE(info);
		else if (ne == Cnd_proc_end_tm_to) doCnd_proc_end_tm_to_NE(info);
		else if (ne == Cnd_biz_dat_id) doCnd_biz_dat_id_NE(info);
		else if (ne == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NE(info);
		else if (ne == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_NE(info);
		else if (ne == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_NE(info);
		else if (ne == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_NE(info);
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_dl_tm_fr) doCnd_dl_tm_fr_NE(info);
		else if (ne == Cnd_dl_tm_to) doCnd_dl_tm_to_NE(info);
		else if (ne == Cnd_dl_file_nm) doCnd_dl_file_nm_NE(info);
		else if (ne == Cnd_file_size_fr) doCnd_file_size_fr_NE(info);
		else if (ne == Cnd_file_size_to) doCnd_file_size_to_NE(info);
		else if (ne == Cnd_biz_dat_dl_cond) doCnd_biz_dat_dl_cond_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_biz_dat_file_typ) doRslt_biz_dat_file_typ_NE(info);
		else if (ne == columnRslt_biz_dat_file_typ_nm) doRslt_biz_dat_file_typ_nm_NE(info);
		else if (ne == columnRslt_biz_dat_dl_sts_typ) doRslt_biz_dat_dl_sts_typ_NE(info);
		else if (ne == columnRslt_biz_dat_dl_sts_typ_nm) doRslt_biz_dat_dl_sts_typ_nm_NE(info);
		else if (ne == columnRslt_proc_st_tm) doRslt_proc_st_tm_NE(info);
		else if (ne == columnRslt_proc_end_tm) doRslt_proc_end_tm_NE(info);
		else if (ne == columnRslt_biz_dat_id) doRslt_biz_dat_id_NE(info);
		else if (ne == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_NE(info);
		else if (ne == columnRslt_dl_tm) doRslt_dl_tm_NE(info);
		else if (ne == columnRslt_dl_file_path) doRslt_dl_file_path_NE(info);
		else if (ne == columnRslt_dl_file_nm) doRslt_dl_file_nm_NE(info);
		else if (ne == columnRslt_data_cnt) doRslt_data_cnt_NE(info);
		else if (ne == columnRslt_file_size) doRslt_file_size_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_biz_dat_dl_cond) doRslt_biz_dat_dl_cond_NE(info);
		else if (ne == columnRslt_biz_dat_dl_hst_no) doRslt_biz_dat_dl_hst_no_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == Rmrks_biz_dat_rmrks1) doRmrks_biz_dat_rmrks1_NE(info);
		else if (ne == Rmrks_biz_dat_rmrks2) doRmrks_biz_dat_rmrks2_NE(info);
		else if (ne == Rmrks_biz_dat_rmrks3) doRmrks_biz_dat_rmrks3_NE(info);
		else if (ne == Btn_dl_file_path) doBtn_dl_file_path_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Tab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[running_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_running_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[success_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_success_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[download_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_download_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[error_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_error_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excel_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excel_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[csv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_csv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[screen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_dl_cond]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_dl_cond_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_st_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_st_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_end_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_end_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_size]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_size_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_cond]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_cond_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_hst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_hst_no_NE(MCEventInfo info){
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
	 * [Rmrks]パネルの[biz_dat_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[dl_file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dl_file_path_NE(MCEventInfo info){
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
		else if (nx == TabTab) doTab_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_running_flg) doCnd_running_flg_NX(info);
		else if (nx == Cnd_success_flg) doCnd_success_flg_NX(info);
		else if (nx == Cnd_download_flg) doCnd_download_flg_NX(info);
		else if (nx == Cnd_error_flg) doCnd_error_flg_NX(info);
		else if (nx == Cnd_excel_flg) doCnd_excel_flg_NX(info);
		else if (nx == Cnd_csv_flg) doCnd_csv_flg_NX(info);
		else if (nx == Cnd_report_flg) doCnd_report_flg_NX(info);
		else if (nx == Cnd_screen_flg) doCnd_screen_flg_NX(info);
		else if (nx == Cnd_proc_st_tm_fr) doCnd_proc_st_tm_fr_NX(info);
		else if (nx == Cnd_proc_st_tm_to) doCnd_proc_st_tm_to_NX(info);
		else if (nx == Cnd_proc_end_tm_fr) doCnd_proc_end_tm_fr_NX(info);
		else if (nx == Cnd_proc_end_tm_to) doCnd_proc_end_tm_to_NX(info);
		else if (nx == Cnd_biz_dat_id) doCnd_biz_dat_id_NX(info);
		else if (nx == Cnd_biz_dat_nm) doCnd_biz_dat_nm_NX(info);
		else if (nx == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_NX(info);
		else if (nx == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_NX(info);
		else if (nx == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_NX(info);
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_dl_tm_fr) doCnd_dl_tm_fr_NX(info);
		else if (nx == Cnd_dl_tm_to) doCnd_dl_tm_to_NX(info);
		else if (nx == Cnd_dl_file_nm) doCnd_dl_file_nm_NX(info);
		else if (nx == Cnd_file_size_fr) doCnd_file_size_fr_NX(info);
		else if (nx == Cnd_file_size_to) doCnd_file_size_to_NX(info);
		else if (nx == Cnd_biz_dat_dl_cond) doCnd_biz_dat_dl_cond_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_biz_dat_file_typ) doRslt_biz_dat_file_typ_NX(info);
		else if (nx == columnRslt_biz_dat_file_typ_nm) doRslt_biz_dat_file_typ_nm_NX(info);
		else if (nx == columnRslt_biz_dat_dl_sts_typ) doRslt_biz_dat_dl_sts_typ_NX(info);
		else if (nx == columnRslt_biz_dat_dl_sts_typ_nm) doRslt_biz_dat_dl_sts_typ_nm_NX(info);
		else if (nx == columnRslt_proc_st_tm) doRslt_proc_st_tm_NX(info);
		else if (nx == columnRslt_proc_end_tm) doRslt_proc_end_tm_NX(info);
		else if (nx == columnRslt_biz_dat_id) doRslt_biz_dat_id_NX(info);
		else if (nx == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_NX(info);
		else if (nx == columnRslt_dl_tm) doRslt_dl_tm_NX(info);
		else if (nx == columnRslt_dl_file_path) doRslt_dl_file_path_NX(info);
		else if (nx == columnRslt_dl_file_nm) doRslt_dl_file_nm_NX(info);
		else if (nx == columnRslt_data_cnt) doRslt_data_cnt_NX(info);
		else if (nx == columnRslt_file_size) doRslt_file_size_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_biz_dat_dl_cond) doRslt_biz_dat_dl_cond_NX(info);
		else if (nx == columnRslt_biz_dat_dl_hst_no) doRslt_biz_dat_dl_hst_no_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == Rmrks_biz_dat_rmrks1) doRmrks_biz_dat_rmrks1_NX(info);
		else if (nx == Rmrks_biz_dat_rmrks2) doRmrks_biz_dat_rmrks2_NX(info);
		else if (nx == Rmrks_biz_dat_rmrks3) doRmrks_biz_dat_rmrks3_NX(info);
		else if (nx == Btn_dl_file_path) doBtn_dl_file_path_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Tab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[running_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_running_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[success_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_success_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[download_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_download_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[error_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_error_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[excel_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_excel_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[csv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_csv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[screen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_dl_cond]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_dl_cond_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_st_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_st_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_end_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_end_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_size]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_size_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_cond]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_cond_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_hst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_hst_no_NX(MCEventInfo info){
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
	 * [Rmrks]パネルの[biz_dat_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rmrks]パネルの[biz_dat_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRmrks_biz_dat_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[dl_file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dl_file_path_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_proc_st_tm_fr) doCnd_proc_st_tm_fr_LC(info);
		else if (lc == Cnd_proc_st_tm_to) doCnd_proc_st_tm_to_LC(info);
		else if (lc == Cnd_proc_end_tm_fr) doCnd_proc_end_tm_fr_LC(info);
		else if (lc == Cnd_proc_end_tm_to) doCnd_proc_end_tm_to_LC(info);
		else if (lc == Cnd_biz_dat_id) doCnd_biz_dat_id_LC(info);
		else if (lc == Cnd_biz_dat_nm) doCnd_biz_dat_nm_LC(info);
		else if (lc == Cnd_biz_dat_rmrks1) doCnd_biz_dat_rmrks1_LC(info);
		else if (lc == Cnd_biz_dat_rmrks2) doCnd_biz_dat_rmrks2_LC(info);
		else if (lc == Cnd_biz_dat_rmrks3) doCnd_biz_dat_rmrks3_LC(info);
		else if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_dl_tm_fr) doCnd_dl_tm_fr_LC(info);
		else if (lc == Cnd_dl_tm_to) doCnd_dl_tm_to_LC(info);
		else if (lc == Cnd_dl_file_nm) doCnd_dl_file_nm_LC(info);
		else if (lc == Cnd_file_size_fr) doCnd_file_size_fr_LC(info);
		else if (lc == Cnd_file_size_to) doCnd_file_size_to_LC(info);
		else if (lc == Cnd_biz_dat_dl_cond) doCnd_biz_dat_dl_cond_LC(info);
		else if (lc == columnRslt_biz_dat_file_typ) doRslt_biz_dat_file_typ_LC(info);
		else if (lc == columnRslt_biz_dat_file_typ_nm) doRslt_biz_dat_file_typ_nm_LC(info);
		else if (lc == columnRslt_biz_dat_dl_sts_typ) doRslt_biz_dat_dl_sts_typ_LC(info);
		else if (lc == columnRslt_biz_dat_dl_sts_typ_nm) doRslt_biz_dat_dl_sts_typ_nm_LC(info);
		else if (lc == columnRslt_proc_st_tm) doRslt_proc_st_tm_LC(info);
		else if (lc == columnRslt_proc_end_tm) doRslt_proc_end_tm_LC(info);
		else if (lc == columnRslt_biz_dat_id) doRslt_biz_dat_id_LC(info);
		else if (lc == columnRslt_biz_dat_nm) doRslt_biz_dat_nm_LC(info);
		else if (lc == columnRslt_dl_tm) doRslt_dl_tm_LC(info);
		else if (lc == columnRslt_dl_file_path) doRslt_dl_file_path_LC(info);
		else if (lc == columnRslt_dl_file_nm) doRslt_dl_file_nm_LC(info);
		else if (lc == columnRslt_data_cnt) doRslt_data_cnt_LC(info);
		else if (lc == columnRslt_file_size) doRslt_file_size_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_biz_dat_dl_cond) doRslt_biz_dat_dl_cond_LC(info);
		else if (lc == columnRslt_biz_dat_dl_hst_no) doRslt_biz_dat_dl_hst_no_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == Btn_dl_file_path) doBtn_dl_file_path_LC(info);
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_st_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_st_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_end_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_end_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dl_file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dl_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_size_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_size_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_dat_dl_cond]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_dat_dl_cond_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_file_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_file_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_st_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_st_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_end_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_end_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dl_file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dl_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_size]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_size_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_cond]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_cond_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_dat_dl_hst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_dat_dl_hst_no_LC(MCEventInfo info){
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
	 * [Btn]パネルの[dl_file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dl_file_path_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_biz_dat_id]の作成メソッド
	 */
	public MCList getCnd_biz_dat_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMBUA.MBUAP0010.MBUAP_List)MCListLogic.create("mcframe.clientMBUA.MBUAP0010.MBUAP_List", this)).getBizDatID(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_cd]の作成メソッド
	 */
	public MCList getCnd_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBEL0050.Srch01")) {
			return new MB_MBBEL0050_Srch01Bridge();
		}
		if (id.equals("MB.MBBEL0050.Del01")) {
			return new MB_MBBEL0050_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBEL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0050_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0050_Srch01;

		/** コンストラクタ */
		protected MB_MBBEL0050_Srch01Bridge() {
			p_MB_MBBEL0050_Srch01 = new MCParam(PDef.MB_MBBEL0050_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0050_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBE.MBBEP0050.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0050.RsltR.class));

			p_MB_MBBEL0050_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0050_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0050_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0050_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0050_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBE.MBBEP0050.CndR up0() {
			return (mcframe.clientMBBE.MBBEP0050.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0050.RsltR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0050_Srch01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0050_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBE.MBBEP0050.RsltR>)p_MB_MBBEL0050_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MB_MBBEL0050_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBEL0050_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBEL0050_Del01;

		/** コンストラクタ */
		protected MB_MBBEL0050_Del01Bridge() {
			p_MB_MBBEL0050_Del01 = new MCParam(PDef.MB_MBBEL0050_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBEL0050_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBE.MBBEP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0050.RsltR.class));

			p_MB_MBBEL0050_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBEL0050_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBEL0050_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBEL0050_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBEL0050_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBE.MBBEP0050.RsltR> up0() {
			return (MCList<mcframe.clientMBBE.MBBEP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMBBE.MBBEP0050.RsltR> down0() {
			return (MCList<mcframe.clientMBBE.MBBEP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBEL0050_Del01.addDownBlock(MCList.create(mcframe.clientMBBE.MBBEP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBEL0050_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBE.MBBEP0050.RsltR>)p_MB_MBBEL0050_Del01.getContainerParam().getDownBlock(0));
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