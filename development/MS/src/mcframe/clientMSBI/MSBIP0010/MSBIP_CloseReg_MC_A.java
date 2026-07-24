package mcframe.clientMSBI.MSBIP0010;

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
import mcframe.clientMSBI.MSBIP0010.MSBIP_CloseReg_MC.MS_MSBIL0010_Srch01Caller;
import mcframe.clientMSBI.MSBIP0010.MSBIP_CloseReg_MC.MS_MSBIL0010_Upd01Caller;
import mcframe.clientMSBI.MSBIP0010.MSBIP_CloseReg_MC.MS_MSBIL0010_Upd02Caller;
import mcframe.clientMSBI.MSBIP0010.MSBIP_CloseReg_MC.MS_MSBIL0010_Upd03Caller;
import mcframe.clientMSBI.MSBIP0010.MSBIP_CloseReg_MC.MS_MSBIL0010_Upd04Caller;

/**
 * 画面"MSBIP_CloseReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBIP_CloseReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBI";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBIP0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * 0,Final closing;1,Release final closing;2,Temporary closing;3,Release temporary closing 0,本締;1,本締解除;2,仮締;3,仮締解除.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_0 = null;
	public MCRadioButton Cnd_ope_1 = null;
	public MCRadioButton Cnd_ope_2 = null;
	public MCRadioButton Cnd_ope_3 = null;
	public MCLabel Cnd_cl_ym_Label = null;
	/**
	 * Month to process 処理対象年月.<p>
	 *
	 */
	public MCDateField Cnd_cl_ym = null;
	public MCLabel Cnd_cl_dt_Label = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCDateField Cnd_cl_dt = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr1]ブロック関連のField定義
	public MCPanel Hdr1Panel = null;
	public MCTitledBorder Hdr1TitledBorder = null;
	// [Hdr1]ブロックの項目のField定義
	/**
	 * To process 処理対象.<p>
	 *
	 */
	public MCLabel Hdr1_cl_ope_lab = null;
	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public MCButtonGroup Hdr1_cl_ope_Group = null;
	public MCRadioButton Hdr1_cl_ope_0 = null;
	public MCRadioButton Hdr1_cl_ope_1 = null;
	/**
	 * Sales closing 売上締.<p>
	 *
	 */
	public MCCheckBox Hdr1_sls_cl_flg = null;
	public MCLabel Hdr1_sls_cl_ym_Label = null;
	/**
	 * Current sales closing month 現売上締年月.<p>
	 *
	 */
	public MCDateField Hdr1_sls_cl_ym = null;
	public MCLabel Hdr1_sls_cl_tm_Label = null;
	/**
	 * Last sales closing execution date and time 前回売上締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_sls_cl_tm = null;
	public MCLabel Hdr1_sls_cl_usr_cd_Label = null;
	/**
	 * Sales closing PIC cd. 売上締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_sls_cl_usr_cd = null;
	/**
	 * Sales closing PIC name 売上締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_sls_cl_usr_nm = null;
	/**
	 * Payment received closing 入金締.<p>
	 *
	 */
	public MCCheckBox Hdr1_rcv_cl_flg = null;
	public MCLabel Hdr1_rcv_cl_ym_Label = null;
	/**
	 * Current payment received closing month 現入金締年月.<p>
	 *
	 */
	public MCDateField Hdr1_rcv_cl_ym = null;
	public MCLabel Hdr1_rcv_cl_tm_Label = null;
	/**
	 * Last payment received closing execution date and time 前回入金締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_rcv_cl_tm = null;
	public MCLabel Hdr1_rcv_cl_usr_cd_Label = null;
	/**
	 * Payment received closing PIC cd. 入金締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_cl_usr_cd = null;
	/**
	 * Payment received closing PIC name 入金締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_rcv_cl_usr_nm = null;
	/**
	 * Purchase closing 仕入締.<p>
	 *
	 */
	public MCCheckBox Hdr1_purc_cl_flg = null;
	public MCLabel Hdr1_purc_cl_ym_Label = null;
	/**
	 * Current purchase closing month 現仕入締年月.<p>
	 *
	 */
	public MCDateField Hdr1_purc_cl_ym = null;
	public MCLabel Hdr1_purc_cl_tm_Label = null;
	/**
	 * Last purchase closing execution date and time 前回仕入締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_purc_cl_tm = null;
	public MCLabel Hdr1_purc_cl_usr_cd_Label = null;
	/**
	 * Purchase closing PIC cd. 仕入締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_purc_cl_usr_cd = null;
	/**
	 * Purchase closing PIC name 仕入締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_purc_cl_usr_nm = null;
	/**
	 * Payment closing 支払締.<p>
	 *
	 */
	public MCCheckBox Hdr1_pay_cl_flg = null;
	public MCLabel Hdr1_pay_cl_ym_Label = null;
	/**
	 * Current payment closing month 現支払締年月.<p>
	 *
	 */
	public MCDateField Hdr1_pay_cl_ym = null;
	public MCLabel Hdr1_pay_cl_tm_Label = null;
	/**
	 * Last payment closing issue date and time 前回支払締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_pay_cl_tm = null;
	public MCLabel Hdr1_pay_cl_usr_cd_Label = null;
	/**
	 * Payment closing PIC cd. 支払締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_pay_cl_usr_cd = null;
	/**
	 * Payment closing PIC name 支払締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_pay_cl_usr_nm = null;
	/**
	 * Inventory closing 在庫締.<p>
	 *
	 */
	public MCCheckBox Hdr1_stk_cl_flg = null;
	public MCLabel Hdr1_stk_cl_ym_Label = null;
	/**
	 * Current inventory closing month 現在庫締年月.<p>
	 *
	 */
	public MCDateField Hdr1_stk_cl_ym = null;
	public MCLabel Hdr1_stk_cl_tm_Label = null;
	/**
	 * Last inventory closing execution date and time 前回在庫締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_stk_cl_tm = null;
	public MCLabel Hdr1_stk_cl_usr_cd_Label = null;
	/**
	 * Inventory closing PIC cd. 在庫締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_stk_cl_usr_cd = null;
	/**
	 * Inventory closing PIC name 在庫締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_stk_cl_usr_nm = null;
	/**
	 * To process 処理対象.<p>
	 *
	 */
	public MCLabel Hdr1_pre_cl_ope_lab = null;
	/**
	 * 0,All;1,Any 0,全部;1,任意.<p>
	 *
	 */
	public MCButtonGroup Hdr1_pre_cl_ope_Group = null;
	public MCRadioButton Hdr1_pre_cl_ope_0 = null;
	public MCRadioButton Hdr1_pre_cl_ope_1 = null;
	/**
	 * AR temporary closing 売掛仮締.<p>
	 *
	 */
	public MCCheckBox Hdr1_ar_pre_cl_flg = null;
	public MCLabel Hdr1_ar_pre_cl_tm_Label = null;
	/**
	 * AR final temporary closing execution date and time 売掛最終仮締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_ar_pre_cl_tm = null;
	public MCLabel Hdr1_ar_pre_cl_usr_cd_Label = null;
	/**
	 * AR temporary closing PIC cd. 売掛仮締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ar_pre_cl_usr_cd = null;
	/**
	 * AR temporary closing PIC name 売掛仮締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_ar_pre_cl_usr_nm = null;
	/**
	 * AP temporarily closing 買掛仮締.<p>
	 *
	 */
	public MCCheckBox Hdr1_ap_pre_cl_flg = null;
	public MCLabel Hdr1_ap_pre_cl_tm_Label = null;
	/**
	 * AP final temporary closing execution date and time 買掛最終仮締実行日時.<p>
	 *
	 */
	public MCDateField Hdr1_ap_pre_cl_tm = null;
	public MCLabel Hdr1_ap_pre_cl_usr_cd_Label = null;
	/**
	 * AP temporary closing PIC cd. 買掛仮締担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ap_pre_cl_usr_cd = null;
	/**
	 * AP temporarily closing PIC name 買掛仮締担当者名.<p>
	 *
	 */
	public MCTextField Hdr1_ap_pre_cl_usr_nm = null;
	/**
	 * Specify AR customer 売掛先指定.<p>
	 *
	 */
	public MCLabel Hdr1_ar_lab = null;
	/**
	 * 0,All AR customer;1,Any AR customer 0,全売掛先;1,任意売掛先.<p>
	 *
	 */
	public MCButtonGroup Hdr1_ar_ope_Group = null;
	public MCRadioButton Hdr1_ar_ope_0 = null;
	public MCRadioButton Hdr1_ar_ope_1 = null;
	/**
	 * Specify AP supplier 買掛先指定.<p>
	 *
	 */
	public MCLabel Hdr1_ap_lab = null;
	/**
	 * 0,All AP supplier;1,Any AP supplier 0,全買掛先;1,任意買掛先.<p>
	 *
	 */
	public MCButtonGroup Hdr1_ap_ope_Group = null;
	public MCRadioButton Hdr1_ap_ope_0 = null;
	public MCRadioButton Hdr1_ap_ope_1 = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	public MCTitledBorder Hdr2TitledBorder = null;
	// [Hdr2]ブロックの項目のField定義
	// [PreClHdr]ブロック関連のField定義
	public MCPanel PreClHdrPanel = null;
	// [PreClHdr]ブロックの項目のField定義
	// [PreClDtl]ブロック関連のField定義
	public MCPanel PreClDtlPanel = null;
	// [PreClDtl]ブロックの項目のField定義
	// [ArApHdr]ブロック関連のField定義
	public MCPanel ArApHdrPanel = null;
	// [ArApHdr]ブロックの項目のField定義
	// [Ar]ブロック関連のField定義
	public MCPanel ArPanel = null;
	// [Ar]ブロックの項目のField定義
	// [ArHdr]ブロック関連のField定義
	public MCPanel ArHdrPanel = null;
	// [ArHdr]ブロックの項目のField定義
	// [ArDtl]ブロック関連のField定義
	public MCPanel ArDtlPanel = null;
	public MCScrollPane ArDtlScrollPane = null;
	public MCTable2<mcframe.clientMSBI.MSBIP0010.ArDtlR> ArDtlTable = null;
	// [ArDtl]ブロックの項目のField定義
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_acst_nm = null;
	/**
	 * Temporary closing execution date and time 仮締実行日時.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_pre_cl_tm = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnArDtl_upd_srv_req_no = null;
	// [ArDtlBtn]ブロック関連のField定義
	public MCPanel ArDtlBtnPanel = null;
	// [ArDtlBtn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton ArDtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton ArDtlBtn_rdel = null;
	/**
	 * Delete all row 全行削除.<p>
	 *
	 */
	public MCButton ArDtlBtn_rdel_all = null;
	// [Ap]ブロック関連のField定義
	public MCPanel ApPanel = null;
	// [Ap]ブロックの項目のField定義
	// [ApHdr]ブロック関連のField定義
	public MCPanel ApHdrPanel = null;
	// [ApHdr]ブロックの項目のField定義
	// [ApDtl]ブロック関連のField定義
	public MCPanel ApDtlPanel = null;
	public MCScrollPane ApDtlScrollPane = null;
	public MCTable2<mcframe.clientMSBI.MSBIP0010.ApDtlR> ApDtlTable = null;
	// [ApDtl]ブロックの項目のField定義
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_asppl_nm = null;
	/**
	 * Temporary closing execution date and time 仮締実行日時.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_pre_cl_tm = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApDtl_upd_srv_req_no = null;
	// [ApDtlBtn]ブロック関連のField定義
	public MCPanel ApDtlBtnPanel = null;
	// [ApDtlBtn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton ApDtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton ApDtlBtn_rdel = null;
	/**
	 * Delete all row 全行削除.<p>
	 *
	 */
	public MCButton ApDtlBtn_rdel_all = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update (Final closing) 更新（本締）.<p>
	 *
	 */
	public MCButton Btn_upd1 = null;
	/**
	 * Update (Temporary closing) 更新（仮締）.<p>
	 *
	 */
	public MCButton Btn_upd2 = null;
	/**
	 * Cancel (Final closing) 取消（本締）.<p>
	 *
	 */
	public MCButton Btn_del1 = null;
	/**
	 * Cancel (Temporary closing) 取消（仮締）.<p>
	 *
	 */
	public MCButton Btn_del2 = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_PRE]モードを表す定数 */
	public static final String UPD_PRE = "UPD_PRE";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, UPD_PRE, FIX};
	
	/** [MS_MSBIL0010_Srch01]のCallerの作成 */
	protected MSBIP_CloseReg_MC.MS_MSBIL0010_Srch01Caller createMS_MSBIL0010_Srch01() {
		MSBIP_CloseReg_MC.MS_MSBIL0010_Srch01Caller<MSBIP_CloseReg, MS_MSBIL0010_Srch01Bridge>
		caller = ((MSBIP_CloseReg_MC)this).new MS_MSBIL0010_Srch01Caller<MSBIP_CloseReg, MS_MSBIL0010_Srch01Bridge>(
					(MSBIP_CloseReg)this, new MS_MSBIL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBIL0010_Srch01]の呼び出し */
	protected void callMS_MSBIL0010_Srch01() {
		MCCaller caller = createMS_MSBIL0010_Srch01();
		caller.exec();
	}
	/** [MS_MSBIL0010_Upd01]のCallerの作成 */
	protected MSBIP_CloseReg_MC.MS_MSBIL0010_Upd01Caller createMS_MSBIL0010_Upd01() {
		MSBIP_CloseReg_MC.MS_MSBIL0010_Upd01Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd01Bridge>
		caller = ((MSBIP_CloseReg_MC)this).new MS_MSBIL0010_Upd01Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd01Bridge>(
					(MSBIP_CloseReg)this, new MS_MSBIL0010_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBIL0010_Upd01]の呼び出し */
	protected void callMS_MSBIL0010_Upd01() {
		MCCaller caller = createMS_MSBIL0010_Upd01();
		caller.exec();
	}
	/** [MS_MSBIL0010_Upd02]のCallerの作成 */
	protected MSBIP_CloseReg_MC.MS_MSBIL0010_Upd02Caller createMS_MSBIL0010_Upd02() {
		MSBIP_CloseReg_MC.MS_MSBIL0010_Upd02Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd02Bridge>
		caller = ((MSBIP_CloseReg_MC)this).new MS_MSBIL0010_Upd02Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd02Bridge>(
					(MSBIP_CloseReg)this, new MS_MSBIL0010_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBIL0010_Upd02]の呼び出し */
	protected void callMS_MSBIL0010_Upd02() {
		MCCaller caller = createMS_MSBIL0010_Upd02();
		caller.exec();
	}
	/** [MS_MSBIL0010_Upd03]のCallerの作成 */
	protected MSBIP_CloseReg_MC.MS_MSBIL0010_Upd03Caller createMS_MSBIL0010_Upd03() {
		MSBIP_CloseReg_MC.MS_MSBIL0010_Upd03Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd03Bridge>
		caller = ((MSBIP_CloseReg_MC)this).new MS_MSBIL0010_Upd03Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd03Bridge>(
					(MSBIP_CloseReg)this, new MS_MSBIL0010_Upd03Bridge());
		return caller;
	}
	/** [MS_MSBIL0010_Upd03]の呼び出し */
	protected void callMS_MSBIL0010_Upd03() {
		MCCaller caller = createMS_MSBIL0010_Upd03();
		caller.exec();
	}
	/** [MS_MSBIL0010_Upd04]のCallerの作成 */
	protected MSBIP_CloseReg_MC.MS_MSBIL0010_Upd04Caller createMS_MSBIL0010_Upd04() {
		MSBIP_CloseReg_MC.MS_MSBIL0010_Upd04Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd04Bridge>
		caller = ((MSBIP_CloseReg_MC)this).new MS_MSBIL0010_Upd04Caller<MSBIP_CloseReg, MS_MSBIL0010_Upd04Bridge>(
					(MSBIP_CloseReg)this, new MS_MSBIL0010_Upd04Bridge());
		return caller;
	}
	/** [MS_MSBIL0010_Upd04]の呼び出し */
	protected void callMS_MSBIL0010_Upd04() {
		MCCaller caller = createMS_MSBIL0010_Upd04();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBI.MSBIP0010.CndR aCndR;
	/** [Hdr1]ブロックのコンテナField定義 */
	private final mcframe.clientMSBI.MSBIP0010.Hdr1R aHdr1R;
	/** [ArDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> aArDtlL;
	/** [ApDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> aApDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBI.MSBIP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBI.MSBIP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBI.MSBIP0010.CndR createCndR() {
		return mcframe.clientMSBI.MSBIP0010.CndR.create();
	}

	/**
	 * 項目コピーによってaHdr1Rを設定します。
	 *
	 * aHdr1Rのインスタンスは変更されません。
	 *
	 * @param row Hdr1R
	 */
	public void setHdr1R(mcframe.clientMSBI.MSBIP0010.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr1R(), row);
		}
	}

	/**
	 * [Hdr1]ブロックのコンテナaHdr1Rを返します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBI.MSBIP0010.Hdr1R getHdr1R() {
		return aHdr1R;
	}

	/**
	 * aHdr1Rを作成します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBI.MSBIP0010.Hdr1R createHdr1R() {
		return mcframe.clientMSBI.MSBIP0010.Hdr1R.create();
	}

	/**
	 * コピーによってaArDtlLを設定します。
	 *
	 * aArDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ArDtlL
	 */
	public void setArDtlL(MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> aList) {
		if (getArDtlL() != aList) {
			getArDtlL().setAll(aList);
		}
	}

	/**
	 * [ArDtl]ブロックのコンテナaArDtlLを返します。
	 *
	 * @return ArDtlL
	 */
	public MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> getArDtlL() {
		return aArDtlL;
	}

	/**
	 * aArDtlRを作成します。
	 *
	 * @return ArDtlR
	 */
	public mcframe.clientMSBI.MSBIP0010.ArDtlR createArDtlR() {
		return mcframe.clientMSBI.MSBIP0010.ArDtlR.create();
	}

	/**
	 * aArDtlLを作成します。
	 *
	 * @return ArDtlL
	 */
	public MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> createArDtlL() {
		return MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class);
	}

	/**
	 * ArDtlTableを初期化します。
	 */
	protected void createArDtlTable(){
		if(ArDtlTable == null){
			ArDtlTable = beansFactory.createTable2("ArDtl.table");
		}
	}

	/**
	 * コピーによってaApDtlLを設定します。
	 *
	 * aApDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ApDtlL
	 */
	public void setApDtlL(MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> aList) {
		if (getApDtlL() != aList) {
			getApDtlL().setAll(aList);
		}
	}

	/**
	 * [ApDtl]ブロックのコンテナaApDtlLを返します。
	 *
	 * @return ApDtlL
	 */
	public MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> getApDtlL() {
		return aApDtlL;
	}

	/**
	 * aApDtlRを作成します。
	 *
	 * @return ApDtlR
	 */
	public mcframe.clientMSBI.MSBIP0010.ApDtlR createApDtlR() {
		return mcframe.clientMSBI.MSBIP0010.ApDtlR.create();
	}

	/**
	 * aApDtlLを作成します。
	 *
	 * @return ApDtlL
	 */
	public MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> createApDtlL() {
		return MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class);
	}

	/**
	 * ApDtlTableを初期化します。
	 */
	protected void createApDtlTable(){
		if(ApDtlTable == null){
			ApDtlTable = beansFactory.createTable2("ApDtl.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdr1R())) ret.add(getHdr1R());
		if(!MCCollectionUtil.contains(ret, getArDtlL())) ret.add(getArDtlL());
		if(!MCCollectionUtil.contains(ret, getApDtlL())) ret.add(getApDtlL());
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
		if(aCnt == getHdr1R()) return "Hdr1";
		if(aCnt == getArDtlL()) return "ArDtl";
		if(aCnt == getApDtlL()) return "ApDtl";
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
		if(bId.equals("Hdr1")) return getHdr1R();
		if(bId.equals("ArDtl")) return getArDtlL();
		if(bId.equals("ApDtl")) return getApDtlL();
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
		ret.add(Hdr1Panel);
		ret.add(Hdr2Panel);
		ret.add(PreClHdrPanel);
		ret.add(PreClDtlPanel);
		ret.add(ArApHdrPanel);
		ret.add(ArPanel);
		ret.add(ArHdrPanel);
		ret.add(ArDtlPanel);
		ret.add(ArDtlBtnPanel);
		ret.add(ApPanel);
		ret.add(ApHdrPanel);
		ret.add(ApDtlPanel);
		ret.add(ApDtlBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBIP_CloseReg_MC_A() {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aArDtlL = createArDtlL();
		aApDtlL = createApDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBIP_CloseReg_MC_A(String name) {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aArDtlL = createArDtlL();
		createArDtlTable();
		ArDtlTable.setRowName(name);
		aApDtlL = createApDtlL();
		createApDtlTable();
		ApDtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBIP_CloseReg_MC.jbCreateCnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateHdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateHdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreatePreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreatePreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateAr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateAp((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbCreateEastBtn((MSBIP_CloseReg)this);
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBIP_CloseReg p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MSBIP_CloseReg p) {
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBIP_CloseReg p) {
	}

	/**
	 * [PreClHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePreClHdr(MSBIP_CloseReg p) {
	}

	/**
	 * [PreClDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePreClDtl(MSBIP_CloseReg p) {
	}

	/**
	 * [ArApHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateArApHdr(MSBIP_CloseReg p) {
	}

	/**
	 * [Ar]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAr(MSBIP_CloseReg p) {
	}

	/**
	 * [ArHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateArHdr(MSBIP_CloseReg p) {
	}

	/**
	 * [ArDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateArDtl(MSBIP_CloseReg p) {
	}

	/**
	 * [ArDtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateArDtlBtn(MSBIP_CloseReg p) {
	}

	/**
	 * [Ap]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAp(MSBIP_CloseReg p) {
	}

	/**
	 * [ApHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateApHdr(MSBIP_CloseReg p) {
	}

	/**
	 * [ApDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateApDtl(MSBIP_CloseReg p) {
	}

	/**
	 * [ApDtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateApDtlBtn(MSBIP_CloseReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBIP_CloseReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBIP_CloseReg p) {
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

	
	/** [ArDtl_acst_cd_ListPutter]の定義 */
	private MCListPutter ArDtl_acst_cd_p = null;

	/**
	 * [ArDtl_acst_cd_ListPutter]の取得
	 */
	protected MCListPutter getArDtl_acst_cd_ListPutter() {
		if (ArDtl_acst_cd_p == null) {
			ArDtl_acst_cd_p = createArDtl_acst_cd_ListPutter(columnArDtl_acst_cd, "acst_cd", "acst_nm");

		}
		return ArDtl_acst_cd_p;
	}
	
	
	/** [ApDtl_asppl_cd_ListPutter]の定義 */
	private MCListPutter ApDtl_asppl_cd_p = null;

	/**
	 * [ApDtl_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getApDtl_asppl_cd_ListPutter() {
		if (ApDtl_asppl_cd_p == null) {
			ApDtl_asppl_cd_p = createApDtl_asppl_cd_ListPutter(columnApDtl_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return ApDtl_asppl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBIP_CloseReg create(){
		MSBIP_CloseReg p = new MSBIP_CloseReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBIP_CloseReg create(String name){
		MSBIP_CloseReg p = new MSBIP_CloseReg(name);
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
		MSBIP_CloseReg_MC.jbfInitCnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitHdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitHdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitPreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitPreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitAr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitAp((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbfInitEastBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitCnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitHdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitHdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitPreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitPreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitAr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitAp((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.jbInitEastBtn((MSBIP_CloseReg)this);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_0 = p.beansFactory.createRadioButton("Cnd.ope_0");
		p.Cnd_ope_1 = p.beansFactory.createRadioButton("Cnd.ope_1");
		p.Cnd_ope_2 = p.beansFactory.createRadioButton("Cnd.ope_2");
		p.Cnd_ope_3 = p.beansFactory.createRadioButton("Cnd.ope_3");
		p.Cnd_cl_ym_Label = p.beansFactory.createLabel("Cnd.cl_ym_Label");
		p.Cnd_cl_ym = p.beansFactory.createDateField("Cnd.cl_ym");
		p.Cnd_cl_ym.setLabel(p.Cnd_cl_ym_Label);
		p.Cnd_cl_dt_Label = p.beansFactory.createLabel("Cnd.cl_dt_Label");
		p.Cnd_cl_dt = p.beansFactory.createDateField("Cnd.cl_dt");
		p.Cnd_cl_dt.setLabel(p.Cnd_cl_dt_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel = p.beansFactory.createPanel("Hdr1");
		p.Hdr1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr1_cl_ope_lab = p.beansFactory.createLabel("Hdr1.cl_ope_lab");
		p.Hdr1_cl_ope_Group = p.beansFactory.createButtonGroup("Hdr1.cl_ope");
		p.Hdr1_cl_ope_0 = p.beansFactory.createRadioButton("Hdr1.cl_ope_0");
		p.Hdr1_cl_ope_1 = p.beansFactory.createRadioButton("Hdr1.cl_ope_1");
		p.Hdr1_sls_cl_flg = p.beansFactory.createCheckBox("Hdr1.sls_cl_flg");
		p.Hdr1_sls_cl_ym_Label = p.beansFactory.createLabel("Hdr1.sls_cl_ym_Label");
		p.Hdr1_sls_cl_ym = p.beansFactory.createDateField("Hdr1.sls_cl_ym");
		p.Hdr1_sls_cl_ym.setLabel(p.Hdr1_sls_cl_ym_Label);
		p.Hdr1_sls_cl_tm_Label = p.beansFactory.createLabel("Hdr1.sls_cl_tm_Label");
		p.Hdr1_sls_cl_tm = p.beansFactory.createDateField("Hdr1.sls_cl_tm");
		p.Hdr1_sls_cl_tm.setLabel(p.Hdr1_sls_cl_tm_Label);
		p.Hdr1_sls_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.sls_cl_usr_cd_Label");
		p.Hdr1_sls_cl_usr_cd = p.beansFactory.createTextField("Hdr1.sls_cl_usr_cd");
		p.Hdr1_sls_cl_usr_cd.setLabel(p.Hdr1_sls_cl_usr_cd_Label);
		p.Hdr1_sls_cl_usr_nm = p.beansFactory.createTextField("Hdr1.sls_cl_usr_nm");
		p.Hdr1_rcv_cl_flg = p.beansFactory.createCheckBox("Hdr1.rcv_cl_flg");
		p.Hdr1_rcv_cl_ym_Label = p.beansFactory.createLabel("Hdr1.rcv_cl_ym_Label");
		p.Hdr1_rcv_cl_ym = p.beansFactory.createDateField("Hdr1.rcv_cl_ym");
		p.Hdr1_rcv_cl_ym.setLabel(p.Hdr1_rcv_cl_ym_Label);
		p.Hdr1_rcv_cl_tm_Label = p.beansFactory.createLabel("Hdr1.rcv_cl_tm_Label");
		p.Hdr1_rcv_cl_tm = p.beansFactory.createDateField("Hdr1.rcv_cl_tm");
		p.Hdr1_rcv_cl_tm.setLabel(p.Hdr1_rcv_cl_tm_Label);
		p.Hdr1_rcv_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.rcv_cl_usr_cd_Label");
		p.Hdr1_rcv_cl_usr_cd = p.beansFactory.createTextField("Hdr1.rcv_cl_usr_cd");
		p.Hdr1_rcv_cl_usr_cd.setLabel(p.Hdr1_rcv_cl_usr_cd_Label);
		p.Hdr1_rcv_cl_usr_nm = p.beansFactory.createTextField("Hdr1.rcv_cl_usr_nm");
		p.Hdr1_purc_cl_flg = p.beansFactory.createCheckBox("Hdr1.purc_cl_flg");
		p.Hdr1_purc_cl_ym_Label = p.beansFactory.createLabel("Hdr1.purc_cl_ym_Label");
		p.Hdr1_purc_cl_ym = p.beansFactory.createDateField("Hdr1.purc_cl_ym");
		p.Hdr1_purc_cl_ym.setLabel(p.Hdr1_purc_cl_ym_Label);
		p.Hdr1_purc_cl_tm_Label = p.beansFactory.createLabel("Hdr1.purc_cl_tm_Label");
		p.Hdr1_purc_cl_tm = p.beansFactory.createDateField("Hdr1.purc_cl_tm");
		p.Hdr1_purc_cl_tm.setLabel(p.Hdr1_purc_cl_tm_Label);
		p.Hdr1_purc_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.purc_cl_usr_cd_Label");
		p.Hdr1_purc_cl_usr_cd = p.beansFactory.createTextField("Hdr1.purc_cl_usr_cd");
		p.Hdr1_purc_cl_usr_cd.setLabel(p.Hdr1_purc_cl_usr_cd_Label);
		p.Hdr1_purc_cl_usr_nm = p.beansFactory.createTextField("Hdr1.purc_cl_usr_nm");
		p.Hdr1_pay_cl_flg = p.beansFactory.createCheckBox("Hdr1.pay_cl_flg");
		p.Hdr1_pay_cl_ym_Label = p.beansFactory.createLabel("Hdr1.pay_cl_ym_Label");
		p.Hdr1_pay_cl_ym = p.beansFactory.createDateField("Hdr1.pay_cl_ym");
		p.Hdr1_pay_cl_ym.setLabel(p.Hdr1_pay_cl_ym_Label);
		p.Hdr1_pay_cl_tm_Label = p.beansFactory.createLabel("Hdr1.pay_cl_tm_Label");
		p.Hdr1_pay_cl_tm = p.beansFactory.createDateField("Hdr1.pay_cl_tm");
		p.Hdr1_pay_cl_tm.setLabel(p.Hdr1_pay_cl_tm_Label);
		p.Hdr1_pay_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.pay_cl_usr_cd_Label");
		p.Hdr1_pay_cl_usr_cd = p.beansFactory.createTextField("Hdr1.pay_cl_usr_cd");
		p.Hdr1_pay_cl_usr_cd.setLabel(p.Hdr1_pay_cl_usr_cd_Label);
		p.Hdr1_pay_cl_usr_nm = p.beansFactory.createTextField("Hdr1.pay_cl_usr_nm");
		p.Hdr1_stk_cl_flg = p.beansFactory.createCheckBox("Hdr1.stk_cl_flg");
		p.Hdr1_stk_cl_ym_Label = p.beansFactory.createLabel("Hdr1.stk_cl_ym_Label");
		p.Hdr1_stk_cl_ym = p.beansFactory.createDateField("Hdr1.stk_cl_ym");
		p.Hdr1_stk_cl_ym.setLabel(p.Hdr1_stk_cl_ym_Label);
		p.Hdr1_stk_cl_tm_Label = p.beansFactory.createLabel("Hdr1.stk_cl_tm_Label");
		p.Hdr1_stk_cl_tm = p.beansFactory.createDateField("Hdr1.stk_cl_tm");
		p.Hdr1_stk_cl_tm.setLabel(p.Hdr1_stk_cl_tm_Label);
		p.Hdr1_stk_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.stk_cl_usr_cd_Label");
		p.Hdr1_stk_cl_usr_cd = p.beansFactory.createTextField("Hdr1.stk_cl_usr_cd");
		p.Hdr1_stk_cl_usr_cd.setLabel(p.Hdr1_stk_cl_usr_cd_Label);
		p.Hdr1_stk_cl_usr_nm = p.beansFactory.createTextField("Hdr1.stk_cl_usr_nm");
		p.Hdr1_pre_cl_ope_lab = p.beansFactory.createLabel("Hdr1.pre_cl_ope_lab");
		p.Hdr1_pre_cl_ope_Group = p.beansFactory.createButtonGroup("Hdr1.pre_cl_ope");
		p.Hdr1_pre_cl_ope_0 = p.beansFactory.createRadioButton("Hdr1.pre_cl_ope_0");
		p.Hdr1_pre_cl_ope_1 = p.beansFactory.createRadioButton("Hdr1.pre_cl_ope_1");
		p.Hdr1_ar_pre_cl_flg = p.beansFactory.createCheckBox("Hdr1.ar_pre_cl_flg");
		p.Hdr1_ar_pre_cl_tm_Label = p.beansFactory.createLabel("Hdr1.ar_pre_cl_tm_Label");
		p.Hdr1_ar_pre_cl_tm = p.beansFactory.createDateField("Hdr1.ar_pre_cl_tm");
		p.Hdr1_ar_pre_cl_tm.setLabel(p.Hdr1_ar_pre_cl_tm_Label);
		p.Hdr1_ar_pre_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.ar_pre_cl_usr_cd_Label");
		p.Hdr1_ar_pre_cl_usr_cd = p.beansFactory.createTextField("Hdr1.ar_pre_cl_usr_cd");
		p.Hdr1_ar_pre_cl_usr_cd.setLabel(p.Hdr1_ar_pre_cl_usr_cd_Label);
		p.Hdr1_ar_pre_cl_usr_nm = p.beansFactory.createTextField("Hdr1.ar_pre_cl_usr_nm");
		p.Hdr1_ap_pre_cl_flg = p.beansFactory.createCheckBox("Hdr1.ap_pre_cl_flg");
		p.Hdr1_ap_pre_cl_tm_Label = p.beansFactory.createLabel("Hdr1.ap_pre_cl_tm_Label");
		p.Hdr1_ap_pre_cl_tm = p.beansFactory.createDateField("Hdr1.ap_pre_cl_tm");
		p.Hdr1_ap_pre_cl_tm.setLabel(p.Hdr1_ap_pre_cl_tm_Label);
		p.Hdr1_ap_pre_cl_usr_cd_Label = p.beansFactory.createLabel("Hdr1.ap_pre_cl_usr_cd_Label");
		p.Hdr1_ap_pre_cl_usr_cd = p.beansFactory.createTextField("Hdr1.ap_pre_cl_usr_cd");
		p.Hdr1_ap_pre_cl_usr_cd.setLabel(p.Hdr1_ap_pre_cl_usr_cd_Label);
		p.Hdr1_ap_pre_cl_usr_nm = p.beansFactory.createTextField("Hdr1.ap_pre_cl_usr_nm");
		p.Hdr1_ar_lab = p.beansFactory.createLabel("Hdr1.ar_lab");
		p.Hdr1_ar_ope_Group = p.beansFactory.createButtonGroup("Hdr1.ar_ope");
		p.Hdr1_ar_ope_0 = p.beansFactory.createRadioButton("Hdr1.ar_ope_0");
		p.Hdr1_ar_ope_1 = p.beansFactory.createRadioButton("Hdr1.ar_ope_1");
		p.Hdr1_ap_lab = p.beansFactory.createLabel("Hdr1.ap_lab");
		p.Hdr1_ap_ope_Group = p.beansFactory.createButtonGroup("Hdr1.ap_ope");
		p.Hdr1_ap_ope_0 = p.beansFactory.createRadioButton("Hdr1.ap_ope_0");
		p.Hdr1_ap_ope_1 = p.beansFactory.createRadioButton("Hdr1.ap_ope_1");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		p.Hdr2TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PreClHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPreClHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.PreClHdrPanel = p.beansFactory.createPanel("PreClHdr");
		// ブロックの項目の初期化
	}

	/**
	 * [PreClDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPreClDtl(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.PreClDtlPanel = p.beansFactory.createPanel("PreClDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [ArApHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitArApHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArApHdrPanel = p.beansFactory.createPanel("ArApHdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Ar]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArPanel = p.beansFactory.createPanel("Ar");
		// ブロックの項目の初期化
	}

	/**
	 * [ArHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitArHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArHdrPanel = p.beansFactory.createPanel("ArHdr");
		// ブロックの項目の初期化
	}

	/**
	 * [ArDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitArDtl(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArDtlPanel = p.beansFactory.createPanel("ArDtl");
		p.ArDtlScrollPane = p.beansFactory.createScrollPane("ArDtl.scroll");
		p.createArDtlTable();
		// ブロックの項目の初期化
		p.columnArDtl_acst_cd = p.beansFactory.createTableColumn("ArDtl.acst_cd", MCColumnType.TEXT);
		p.columnArDtl_acst_nm = p.beansFactory.createTableColumn("ArDtl.acst_nm", MCColumnType.TEXT);
		p.columnArDtl_pre_cl_tm = p.beansFactory.createTableColumn("ArDtl.pre_cl_tm", MCColumnType.DATE);
		p.columnArDtl_ins_usr_id = p.beansFactory.createTableColumn("ArDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnArDtl_ins_usr_nm = p.beansFactory.createTableColumn("ArDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnArDtl_ins_func_id = p.beansFactory.createTableColumn("ArDtl.ins_func_id", MCColumnType.TEXT);
		p.columnArDtl_ins_func_nm = p.beansFactory.createTableColumn("ArDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnArDtl_ins_ts = p.beansFactory.createTableColumn("ArDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnArDtl_upd_usr_id = p.beansFactory.createTableColumn("ArDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnArDtl_upd_usr_nm = p.beansFactory.createTableColumn("ArDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnArDtl_upd_func_id = p.beansFactory.createTableColumn("ArDtl.upd_func_id", MCColumnType.TEXT);
		p.columnArDtl_upd_func_nm = p.beansFactory.createTableColumn("ArDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnArDtl_upd_ts = p.beansFactory.createTableColumn("ArDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnArDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ArDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ArDtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitArDtlBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArDtlBtnPanel = p.beansFactory.createPanel("ArDtlBtn");
		// ブロックの項目の初期化
		p.ArDtlBtn_radd = p.beansFactory.createButton("ArDtlBtn.radd", "no_border");
		p.ArDtlBtn_rdel = p.beansFactory.createButton("ArDtlBtn.rdel", "no_border");
		p.ArDtlBtn_rdel_all = p.beansFactory.createButton("ArDtlBtn.rdel_all");
	}

	/**
	 * [Ap]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAp(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApPanel = p.beansFactory.createPanel("Ap");
		// ブロックの項目の初期化
	}

	/**
	 * [ApHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitApHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApHdrPanel = p.beansFactory.createPanel("ApHdr");
		// ブロックの項目の初期化
	}

	/**
	 * [ApDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitApDtl(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApDtlPanel = p.beansFactory.createPanel("ApDtl");
		p.ApDtlScrollPane = p.beansFactory.createScrollPane("ApDtl.scroll");
		p.createApDtlTable();
		// ブロックの項目の初期化
		p.columnApDtl_asppl_cd = p.beansFactory.createTableColumn("ApDtl.asppl_cd", MCColumnType.TEXT);
		p.columnApDtl_asppl_nm = p.beansFactory.createTableColumn("ApDtl.asppl_nm", MCColumnType.TEXT);
		p.columnApDtl_pre_cl_tm = p.beansFactory.createTableColumn("ApDtl.pre_cl_tm", MCColumnType.DATE);
		p.columnApDtl_ins_usr_id = p.beansFactory.createTableColumn("ApDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnApDtl_ins_usr_nm = p.beansFactory.createTableColumn("ApDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnApDtl_ins_func_id = p.beansFactory.createTableColumn("ApDtl.ins_func_id", MCColumnType.TEXT);
		p.columnApDtl_ins_func_nm = p.beansFactory.createTableColumn("ApDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnApDtl_ins_ts = p.beansFactory.createTableColumn("ApDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnApDtl_upd_usr_id = p.beansFactory.createTableColumn("ApDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnApDtl_upd_usr_nm = p.beansFactory.createTableColumn("ApDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnApDtl_upd_func_id = p.beansFactory.createTableColumn("ApDtl.upd_func_id", MCColumnType.TEXT);
		p.columnApDtl_upd_func_nm = p.beansFactory.createTableColumn("ApDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnApDtl_upd_ts = p.beansFactory.createTableColumn("ApDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnApDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ApDtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ApDtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitApDtlBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApDtlBtnPanel = p.beansFactory.createPanel("ApDtlBtn");
		// ブロックの項目の初期化
		p.ApDtlBtn_radd = p.beansFactory.createButton("ApDtlBtn.radd", "no_border");
		p.ApDtlBtn_rdel = p.beansFactory.createButton("ApDtlBtn.rdel", "no_border");
		p.ApDtlBtn_rdel_all = p.beansFactory.createButton("ApDtlBtn.rdel_all");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd1 = p.beansFactory.createButton("Btn.upd1", "upd");
		p.Btn_upd2 = p.beansFactory.createButton("Btn.upd2", "upd");
		p.Btn_del1 = p.beansFactory.createButton("Btn.del1", "del");
		p.Btn_del2 = p.beansFactory.createButton("Btn.del2", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.Hdr1Panel);
		p.CndPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.CndPanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_0);
		p.Cnd_ope_0.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_0);
		p.CndPanel.add(p.Cnd_ope_0);
		p.Cnd_ope_0.setNextBeans(p.Cnd_ope_1);
		p.Cnd_ope_1.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_1);
		p.CndPanel.add(p.Cnd_ope_1);
		p.Cnd_ope_1.setNextBeans(p.Cnd_ope_2);
		p.Cnd_ope_2.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_2);
		p.CndPanel.add(p.Cnd_ope_2);
		p.Cnd_ope_2.setNextBeans(p.Cnd_ope_3);
		p.Cnd_ope_3.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_3);
		p.CndPanel.add(p.Cnd_ope_3);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBI.MSBIP0010.CndR.ope_META);
		p.Cnd_ope_Group.setNextBeans(p.Cnd_cl_ym);
		p.CndPanel.add(p.Cnd_cl_ym_Label);
		p.CndPanel.add(p.Cnd_cl_ym);
		p.Cnd_cl_ym.setNextBeans(p.Cnd_cl_dt);
		p.Cnd_cl_ym.setRow(p.getCndR(), mcframe.clientMSBI.MSBIP0010.CndR.cl_ym_META);
		p.Cnd_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_cl_dt_Label);
		p.CndPanel.add(p.Cnd_cl_dt);
		p.Cnd_cl_dt.setNextBeans(p.Cnd_srch);
		p.Cnd_cl_dt.setRow(p.getCndR(), mcframe.clientMSBI.MSBIP0010.CndR.cl_dt_META);
		p.Cnd_cl_dt.setFormatID("MD");
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel.setBorder(p.Hdr1TitledBorder);
		p.add(p.Hdr1Panel);
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.Hdr1Panel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.Hdr1Panel.add(p.Hdr1_cl_ope_lab);
		p.Hdr1Panel.setLastBeans(p.Hdr1_cl_ope_Group);
		p.Hdr1_cl_ope_Group.setFirstBeans(p.Hdr1_cl_ope_0);
		p.Hdr1_cl_ope_0.setActionCommand("0");
		p.Hdr1_cl_ope_Group.add(p.Hdr1_cl_ope_0);
		p.Hdr1Panel.add(p.Hdr1_cl_ope_0);
		p.Hdr1_cl_ope_0.setNextBeans(p.Hdr1_cl_ope_1);
		p.Hdr1_cl_ope_1.setActionCommand("1");
		p.Hdr1_cl_ope_Group.add(p.Hdr1_cl_ope_1);
		p.Hdr1Panel.add(p.Hdr1_cl_ope_1);
		p.Hdr1_cl_ope_Group.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.cl_ope_META);
		p.Hdr1_cl_ope_Group.setNextBeans(p.Hdr1_sls_cl_flg);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_flg);
		p.Hdr1_sls_cl_flg.setNextBeans(p.Hdr1_sls_cl_ym);
		p.Hdr1_sls_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.sls_cl_flg_META);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_ym_Label);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_ym);
		p.Hdr1_sls_cl_ym.setNextBeans(p.Hdr1_sls_cl_tm);
		p.Hdr1_sls_cl_ym.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.sls_cl_ym_META);
		p.Hdr1_sls_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_tm_Label);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_tm);
		p.Hdr1_sls_cl_tm.setNextBeans(p.Hdr1_sls_cl_usr_cd);
		p.Hdr1_sls_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.sls_cl_tm_META);
		p.Hdr1_sls_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_usr_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_usr_cd);
		p.Hdr1_sls_cl_usr_cd.setNextBeans(p.Hdr1_sls_cl_usr_nm);
		p.Hdr1_sls_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.sls_cl_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_sls_cl_usr_nm);
		p.Hdr1_sls_cl_usr_nm.setNextBeans(p.Hdr1_rcv_cl_flg);
		p.Hdr1_sls_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.sls_cl_usr_nm_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_flg);
		p.Hdr1_rcv_cl_flg.setNextBeans(p.Hdr1_rcv_cl_ym);
		p.Hdr1_rcv_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.rcv_cl_flg_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_ym_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_ym);
		p.Hdr1_rcv_cl_ym.setNextBeans(p.Hdr1_rcv_cl_tm);
		p.Hdr1_rcv_cl_ym.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.rcv_cl_ym_META);
		p.Hdr1_rcv_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_tm_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_tm);
		p.Hdr1_rcv_cl_tm.setNextBeans(p.Hdr1_rcv_cl_usr_cd);
		p.Hdr1_rcv_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.rcv_cl_tm_META);
		p.Hdr1_rcv_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_usr_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_usr_cd);
		p.Hdr1_rcv_cl_usr_cd.setNextBeans(p.Hdr1_rcv_cl_usr_nm);
		p.Hdr1_rcv_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.rcv_cl_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_rcv_cl_usr_nm);
		p.Hdr1_rcv_cl_usr_nm.setNextBeans(p.Hdr1_purc_cl_flg);
		p.Hdr1_rcv_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.rcv_cl_usr_nm_META);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_flg);
		p.Hdr1_purc_cl_flg.setNextBeans(p.Hdr1_purc_cl_ym);
		p.Hdr1_purc_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.purc_cl_flg_META);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_ym_Label);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_ym);
		p.Hdr1_purc_cl_ym.setNextBeans(p.Hdr1_purc_cl_tm);
		p.Hdr1_purc_cl_ym.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.purc_cl_ym_META);
		p.Hdr1_purc_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_tm_Label);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_tm);
		p.Hdr1_purc_cl_tm.setNextBeans(p.Hdr1_purc_cl_usr_cd);
		p.Hdr1_purc_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.purc_cl_tm_META);
		p.Hdr1_purc_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_usr_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_usr_cd);
		p.Hdr1_purc_cl_usr_cd.setNextBeans(p.Hdr1_purc_cl_usr_nm);
		p.Hdr1_purc_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.purc_cl_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_purc_cl_usr_nm);
		p.Hdr1_purc_cl_usr_nm.setNextBeans(p.Hdr1_pay_cl_flg);
		p.Hdr1_purc_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.purc_cl_usr_nm_META);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_flg);
		p.Hdr1_pay_cl_flg.setNextBeans(p.Hdr1_pay_cl_ym);
		p.Hdr1_pay_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.pay_cl_flg_META);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_ym_Label);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_ym);
		p.Hdr1_pay_cl_ym.setNextBeans(p.Hdr1_pay_cl_tm);
		p.Hdr1_pay_cl_ym.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.pay_cl_ym_META);
		p.Hdr1_pay_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_tm_Label);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_tm);
		p.Hdr1_pay_cl_tm.setNextBeans(p.Hdr1_pay_cl_usr_cd);
		p.Hdr1_pay_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.pay_cl_tm_META);
		p.Hdr1_pay_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_usr_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_usr_cd);
		p.Hdr1_pay_cl_usr_cd.setNextBeans(p.Hdr1_pay_cl_usr_nm);
		p.Hdr1_pay_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.pay_cl_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_pay_cl_usr_nm);
		p.Hdr1_pay_cl_usr_nm.setNextBeans(p.Hdr1_stk_cl_flg);
		p.Hdr1_pay_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.pay_cl_usr_nm_META);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_flg);
		p.Hdr1_stk_cl_flg.setNextBeans(p.Hdr1_stk_cl_ym);
		p.Hdr1_stk_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.stk_cl_flg_META);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_ym_Label);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_ym);
		p.Hdr1_stk_cl_ym.setNextBeans(p.Hdr1_stk_cl_tm);
		p.Hdr1_stk_cl_ym.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.stk_cl_ym_META);
		p.Hdr1_stk_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_tm_Label);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_tm);
		p.Hdr1_stk_cl_tm.setNextBeans(p.Hdr1_stk_cl_usr_cd);
		p.Hdr1_stk_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.stk_cl_tm_META);
		p.Hdr1_stk_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_usr_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_usr_cd);
		p.Hdr1_stk_cl_usr_cd.setNextBeans(p.Hdr1_stk_cl_usr_nm);
		p.Hdr1_stk_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.stk_cl_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_stk_cl_usr_nm);
		p.Hdr1_stk_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.stk_cl_usr_nm_META);
		p.ArApHdrPanel.add(p.Hdr1_pre_cl_ope_lab);
		p.ArApHdrPanel.setLastBeans(p.Hdr1_pre_cl_ope_Group);
		p.Hdr1_pre_cl_ope_Group.setFirstBeans(p.Hdr1_pre_cl_ope_0);
		p.Hdr1_pre_cl_ope_0.setActionCommand("0");
		p.Hdr1_pre_cl_ope_Group.add(p.Hdr1_pre_cl_ope_0);
		p.ArApHdrPanel.add(p.Hdr1_pre_cl_ope_0);
		p.Hdr1_pre_cl_ope_0.setNextBeans(p.Hdr1_pre_cl_ope_1);
		p.Hdr1_pre_cl_ope_1.setActionCommand("1");
		p.Hdr1_pre_cl_ope_Group.add(p.Hdr1_pre_cl_ope_1);
		p.ArApHdrPanel.add(p.Hdr1_pre_cl_ope_1);
		p.Hdr1_pre_cl_ope_Group.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.pre_cl_ope_META);
		p.Hdr1_pre_cl_ope_Group.setNextBeans(p.Hdr1_ar_pre_cl_flg);
		p.ArApHdrPanel.add(p.Hdr1_ar_pre_cl_flg);
		p.Hdr1_ar_pre_cl_flg.setNextBeans(p.Hdr1_ar_pre_cl_tm);
		p.Hdr1_ar_pre_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ar_pre_cl_flg_META);
		p.ArApHdrPanel.add(p.Hdr1_ar_pre_cl_tm_Label);
		p.ArApHdrPanel.add(p.Hdr1_ar_pre_cl_tm);
		p.Hdr1_ar_pre_cl_tm.setNextBeans(p.Hdr1_ar_pre_cl_usr_cd);
		p.Hdr1_ar_pre_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ar_pre_cl_tm_META);
		p.Hdr1_ar_pre_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.ArApHdrPanel.add(p.Hdr1_ar_pre_cl_usr_cd_Label);
		p.ArApHdrPanel.add(p.Hdr1_ar_pre_cl_usr_cd);
		p.Hdr1_ar_pre_cl_usr_cd.setNextBeans(p.Hdr1_ar_pre_cl_usr_nm);
		p.Hdr1_ar_pre_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ar_pre_cl_usr_cd_META);
		p.ArApHdrPanel.add(p.Hdr1_ar_pre_cl_usr_nm);
		p.Hdr1_ar_pre_cl_usr_nm.setNextBeans(p.Hdr1_ap_pre_cl_flg);
		p.Hdr1_ar_pre_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ar_pre_cl_usr_nm_META);
		p.ArApHdrPanel.add(p.Hdr1_ap_pre_cl_flg);
		p.Hdr1_ap_pre_cl_flg.setNextBeans(p.Hdr1_ap_pre_cl_tm);
		p.Hdr1_ap_pre_cl_flg.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ap_pre_cl_flg_META);
		p.ArApHdrPanel.add(p.Hdr1_ap_pre_cl_tm_Label);
		p.ArApHdrPanel.add(p.Hdr1_ap_pre_cl_tm);
		p.Hdr1_ap_pre_cl_tm.setNextBeans(p.Hdr1_ap_pre_cl_usr_cd);
		p.Hdr1_ap_pre_cl_tm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ap_pre_cl_tm_META);
		p.Hdr1_ap_pre_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.ArApHdrPanel.add(p.Hdr1_ap_pre_cl_usr_cd_Label);
		p.ArApHdrPanel.add(p.Hdr1_ap_pre_cl_usr_cd);
		p.Hdr1_ap_pre_cl_usr_cd.setNextBeans(p.Hdr1_ap_pre_cl_usr_nm);
		p.Hdr1_ap_pre_cl_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ap_pre_cl_usr_cd_META);
		p.ArApHdrPanel.add(p.Hdr1_ap_pre_cl_usr_nm);
		p.Hdr1_ap_pre_cl_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ap_pre_cl_usr_nm_META);
		p.ArHdrPanel.add(p.Hdr1_ar_lab);
		p.ArHdrPanel.setLastBeans(p.Hdr1_ar_ope_Group);
		p.Hdr1_ar_ope_Group.setFirstBeans(p.Hdr1_ar_ope_0);
		p.Hdr1_ar_ope_0.setActionCommand("0");
		p.Hdr1_ar_ope_Group.add(p.Hdr1_ar_ope_0);
		p.ArHdrPanel.add(p.Hdr1_ar_ope_0);
		p.Hdr1_ar_ope_0.setNextBeans(p.Hdr1_ar_ope_1);
		p.Hdr1_ar_ope_1.setActionCommand("1");
		p.Hdr1_ar_ope_Group.add(p.Hdr1_ar_ope_1);
		p.ArHdrPanel.add(p.Hdr1_ar_ope_1);
		p.Hdr1_ar_ope_Group.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ar_ope_META);
		p.ApHdrPanel.add(p.Hdr1_ap_lab);
		p.ApHdrPanel.setLastBeans(p.Hdr1_ap_ope_Group);
		p.Hdr1_ap_ope_Group.setFirstBeans(p.Hdr1_ap_ope_0);
		p.Hdr1_ap_ope_0.setActionCommand("0");
		p.Hdr1_ap_ope_Group.add(p.Hdr1_ap_ope_0);
		p.ApHdrPanel.add(p.Hdr1_ap_ope_0);
		p.Hdr1_ap_ope_0.setNextBeans(p.Hdr1_ap_ope_1);
		p.Hdr1_ap_ope_1.setActionCommand("1");
		p.Hdr1_ap_ope_Group.add(p.Hdr1_ap_ope_1);
		p.ApHdrPanel.add(p.Hdr1_ap_ope_1);
		p.Hdr1_ap_ope_Group.setRow(p.getHdr1R(), mcframe.clientMSBI.MSBIP0010.Hdr1R.ap_ope_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setBorder(p.Hdr2TitledBorder);
		p.add(p.Hdr2Panel);
		p.Hdr2Panel.setNextBeans(p.BtnPanel);
		p.Hdr2Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Hdr2Panel.add(p.PreClHdrPanel, null);
		p.Hdr2Panel.setLastBeans(p.PreClHdrPanel);
		p.PreClHdrPanel.setNextBeans(p.PreClDtlPanel);
		p.Hdr2Panel.add(p.PreClDtlPanel, null);
	}

	/**
	 * [PreClHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPreClHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.PreClHdrPanel.setLayoutPosition("N+");
		// ブロックの項目の初期化
		p.PreClHdrPanel.add(p.ArApHdrPanel, null);
		p.PreClHdrPanel.setLastBeans(p.ArApHdrPanel);
	}

	/**
	 * [PreClDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPreClDtl(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.PreClDtlPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.PreClDtlPanel.add(p.ArPanel, null);
		p.PreClDtlPanel.setLastBeans(p.ArPanel);
		p.ArPanel.setNextBeans(p.ApPanel);
		p.PreClDtlPanel.add(p.ApPanel, null);
	}

	/**
	 * [ArApHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitArApHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArApHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ar]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArPanel.setLayoutPosition("CLC+");
		// ブロックの項目の初期化
		p.ArPanel.add(p.ArHdrPanel, null);
		p.ArPanel.setLastBeans(p.ArHdrPanel);
		p.ArHdrPanel.setNextBeans(p.ArDtlPanel);
		p.ArPanel.add(p.ArDtlPanel, null);
		p.ArDtlPanel.setNextBeans(p.ArDtlBtnPanel);
		p.ArPanel.add(p.ArDtlBtnPanel, null);
	}

	/**
	 * [ArHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitArHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ArDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitArDtl(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArDtlPanel.add(p.ArDtlScrollPane);
		p.ArDtlPanel.setLastBeans(p.ArDtlTable);
		p.ArDtlScrollPane.setViewportView(p.ArDtlTable);
		p.ArDtlTable.setList(p.getArDtlL());
		p.ArDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ArDtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitArDtlBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ArDtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.ArDtlBtn_radd.setIcon("INSERT_RECORD");
		p.ArDtlBtnPanel.add(p.ArDtlBtn_radd);
		p.ArDtlBtnPanel.setLastBeans(p.ArDtlBtn_radd);
		p.ArDtlBtn_radd.setNextBeans(p.ArDtlBtn_rdel);
		p.ArDtlBtn_rdel.setIcon("DELETE_RECORD");
		p.ArDtlBtnPanel.add(p.ArDtlBtn_rdel);
		p.ArDtlBtn_rdel.setNextBeans(p.ArDtlBtn_rdel_all);
		p.ArDtlBtnPanel.add(p.ArDtlBtn_rdel_all);
	}

	/**
	 * [Ap]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAp(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApPanel.setLayoutPosition("CRC+");
		// ブロックの項目の初期化
		p.ApPanel.add(p.ApHdrPanel, null);
		p.ApPanel.setLastBeans(p.ApHdrPanel);
		p.ApHdrPanel.setNextBeans(p.ApDtlPanel);
		p.ApPanel.add(p.ApDtlPanel, null);
		p.ApDtlPanel.setNextBeans(p.ApDtlBtnPanel);
		p.ApPanel.add(p.ApDtlBtnPanel, null);
	}

	/**
	 * [ApHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitApHdr(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ApDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitApDtl(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApDtlPanel.add(p.ApDtlScrollPane);
		p.ApDtlPanel.setLastBeans(p.ApDtlTable);
		p.ApDtlScrollPane.setViewportView(p.ApDtlTable);
		p.ApDtlTable.setList(p.getApDtlL());
		p.ApDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ApDtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitApDtlBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.ApDtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.ApDtlBtn_radd.setIcon("INSERT_RECORD");
		p.ApDtlBtnPanel.add(p.ApDtlBtn_radd);
		p.ApDtlBtnPanel.setLastBeans(p.ApDtlBtn_radd);
		p.ApDtlBtn_radd.setNextBeans(p.ApDtlBtn_rdel);
		p.ApDtlBtn_rdel.setIcon("DELETE_RECORD");
		p.ApDtlBtnPanel.add(p.ApDtlBtn_rdel);
		p.ApDtlBtn_rdel.setNextBeans(p.ApDtlBtn_rdel_all);
		p.ApDtlBtnPanel.add(p.ApDtlBtn_rdel_all);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBIP_CloseReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd1.setIcon("REGISTER");
		p.Btn_upd1.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd1);
		p.BtnPanel.setLastBeans(p.Btn_upd1);
		p.Btn_upd1.setNextBeans(p.Btn_upd2);
		p.Btn_upd2.setIcon("REGISTER");
		p.Btn_upd2.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd2);
		p.Btn_del1.setIcon("CANCEL");
		p.Btn_del1.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del1);
		p.EastBtnPanel.add(p.Btn_del1);
		p.Btn_del1.setNextBeans(p.Btn_del2);
		p.Btn_del2.setIcon("CANCEL");
		p.Btn_del2.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del2);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBIP_CloseReg p) {
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

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBIP_CloseReg_MC.mcInitCnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitHdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitHdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitPreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitPreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitAr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitAp((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.mcInitEastBtn((MSBIP_CloseReg)this);

		// [SRCH]ステータスのモードの設定
		MSBIP_CloseReg_MC.statusInitSRCH_Cnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_Hdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_Hdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_PreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_PreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_Ar((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_Ap((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_ApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_Btn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitSRCH_EastBtn((MSBIP_CloseReg)this);

		// [UPD]ステータスのモードの設定
		MSBIP_CloseReg_MC.statusInitUPD_Cnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_Hdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_Hdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_PreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_PreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_Ar((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_Ap((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_ApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_Btn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD_EastBtn((MSBIP_CloseReg)this);

		// [UPD_PRE]ステータスのモードの設定
		MSBIP_CloseReg_MC.statusInitUPD__PRE_Cnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_Hdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_Hdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_PreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_PreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_Ar((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_Ap((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_ApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_Btn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitUPD__PRE_EastBtn((MSBIP_CloseReg)this);

		// [FIX]ステータスのモードの設定
		MSBIP_CloseReg_MC.statusInitFIX_Cnd((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_Hdr1((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_Hdr2((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_PreClHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_PreClDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ArApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_Ar((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ArHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ArDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_Ap((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ApHdr((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ApDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_ApDtlBtn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_Btn((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.statusInitFIX_EastBtn((MSBIP_CloseReg)this);

	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBIP_CloseReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_0.addAllListener(p);
		p.Cnd_ope_1.addAllListener(p);
		p.Cnd_ope_2.addAllListener(p);
		p.Cnd_ope_3.addAllListener(p);
		p.Cnd_cl_ym.setListListener(p);
		p.Cnd_cl_ym.addAllListener(p);
		p.Cnd_cl_dt.setListListener(p);
		p.Cnd_cl_dt.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MSBIP_CloseReg p) {
		p.Hdr1_cl_ope_Group.addAllListener(p);
		p.Hdr1_cl_ope_0.addAllListener(p);
		p.Hdr1_cl_ope_1.addAllListener(p);
		p.Hdr1_sls_cl_flg.addAllListener(p);
		p.Hdr1_sls_cl_ym.setListListener(p);
		p.Hdr1_sls_cl_ym.addAllListener(p);
		p.Hdr1_sls_cl_tm.setListListener(p);
		p.Hdr1_sls_cl_tm.addAllListener(p);
		p.Hdr1_sls_cl_usr_cd.setListListener(p);
		p.Hdr1_sls_cl_usr_cd.addAllListener(p);
		p.Hdr1_sls_cl_usr_nm.setListListener(p);
		p.Hdr1_sls_cl_usr_nm.addAllListener(p);
		p.Hdr1_rcv_cl_flg.addAllListener(p);
		p.Hdr1_rcv_cl_ym.setListListener(p);
		p.Hdr1_rcv_cl_ym.addAllListener(p);
		p.Hdr1_rcv_cl_tm.setListListener(p);
		p.Hdr1_rcv_cl_tm.addAllListener(p);
		p.Hdr1_rcv_cl_usr_cd.setListListener(p);
		p.Hdr1_rcv_cl_usr_cd.addAllListener(p);
		p.Hdr1_rcv_cl_usr_nm.setListListener(p);
		p.Hdr1_rcv_cl_usr_nm.addAllListener(p);
		p.Hdr1_purc_cl_flg.addAllListener(p);
		p.Hdr1_purc_cl_ym.setListListener(p);
		p.Hdr1_purc_cl_ym.addAllListener(p);
		p.Hdr1_purc_cl_tm.setListListener(p);
		p.Hdr1_purc_cl_tm.addAllListener(p);
		p.Hdr1_purc_cl_usr_cd.setListListener(p);
		p.Hdr1_purc_cl_usr_cd.addAllListener(p);
		p.Hdr1_purc_cl_usr_nm.setListListener(p);
		p.Hdr1_purc_cl_usr_nm.addAllListener(p);
		p.Hdr1_pay_cl_flg.addAllListener(p);
		p.Hdr1_pay_cl_ym.setListListener(p);
		p.Hdr1_pay_cl_ym.addAllListener(p);
		p.Hdr1_pay_cl_tm.setListListener(p);
		p.Hdr1_pay_cl_tm.addAllListener(p);
		p.Hdr1_pay_cl_usr_cd.setListListener(p);
		p.Hdr1_pay_cl_usr_cd.addAllListener(p);
		p.Hdr1_pay_cl_usr_nm.setListListener(p);
		p.Hdr1_pay_cl_usr_nm.addAllListener(p);
		p.Hdr1_stk_cl_flg.addAllListener(p);
		p.Hdr1_stk_cl_ym.setListListener(p);
		p.Hdr1_stk_cl_ym.addAllListener(p);
		p.Hdr1_stk_cl_tm.setListListener(p);
		p.Hdr1_stk_cl_tm.addAllListener(p);
		p.Hdr1_stk_cl_usr_cd.setListListener(p);
		p.Hdr1_stk_cl_usr_cd.addAllListener(p);
		p.Hdr1_stk_cl_usr_nm.setListListener(p);
		p.Hdr1_stk_cl_usr_nm.addAllListener(p);
		p.Hdr1_pre_cl_ope_Group.addAllListener(p);
		p.Hdr1_pre_cl_ope_0.addAllListener(p);
		p.Hdr1_pre_cl_ope_1.addAllListener(p);
		p.Hdr1_ar_pre_cl_flg.addAllListener(p);
		p.Hdr1_ar_pre_cl_tm.setListListener(p);
		p.Hdr1_ar_pre_cl_tm.addAllListener(p);
		p.Hdr1_ar_pre_cl_usr_cd.setListListener(p);
		p.Hdr1_ar_pre_cl_usr_cd.addAllListener(p);
		p.Hdr1_ar_pre_cl_usr_nm.setListListener(p);
		p.Hdr1_ar_pre_cl_usr_nm.addAllListener(p);
		p.Hdr1_ap_pre_cl_flg.addAllListener(p);
		p.Hdr1_ap_pre_cl_tm.setListListener(p);
		p.Hdr1_ap_pre_cl_tm.addAllListener(p);
		p.Hdr1_ap_pre_cl_usr_cd.setListListener(p);
		p.Hdr1_ap_pre_cl_usr_cd.addAllListener(p);
		p.Hdr1_ap_pre_cl_usr_nm.setListListener(p);
		p.Hdr1_ap_pre_cl_usr_nm.addAllListener(p);
		p.Hdr1_ar_ope_Group.addAllListener(p);
		p.Hdr1_ar_ope_0.addAllListener(p);
		p.Hdr1_ar_ope_1.addAllListener(p);
		p.Hdr1_ap_ope_Group.addAllListener(p);
		p.Hdr1_ap_ope_0.addAllListener(p);
		p.Hdr1_ap_ope_1.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBIP_CloseReg p) {
	}

	/**
	 *  [PreClHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPreClHdr(MSBIP_CloseReg p) {
	}

	/**
	 *  [PreClDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPreClDtl(MSBIP_CloseReg p) {
	}

	/**
	 *  [ArApHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitArApHdr(MSBIP_CloseReg p) {
	}

	/**
	 *  [Ar]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAr(MSBIP_CloseReg p) {
	}

	/**
	 *  [ArHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitArHdr(MSBIP_CloseReg p) {
	}

	/**
	 *  [ArDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitArDtl(MSBIP_CloseReg p) {
		p.ArDtlTable.addAllListener(p);
		p.columnArDtl_acst_cd.addAllListener(p);
		p.columnArDtl_acst_cd.setListListener(p);
		p.columnArDtl_acst_nm.addAllListener(p);
		p.columnArDtl_acst_nm.setListListener(p);
		p.columnArDtl_pre_cl_tm.addAllListener(p);
		p.columnArDtl_pre_cl_tm.setListListener(p);
		p.columnArDtl_ins_usr_id.addAllListener(p);
		p.columnArDtl_ins_usr_id.setListListener(p);
		p.columnArDtl_ins_usr_nm.addAllListener(p);
		p.columnArDtl_ins_usr_nm.setListListener(p);
		p.columnArDtl_ins_func_id.addAllListener(p);
		p.columnArDtl_ins_func_id.setListListener(p);
		p.columnArDtl_ins_func_nm.addAllListener(p);
		p.columnArDtl_ins_func_nm.setListListener(p);
		p.columnArDtl_ins_ts.addAllListener(p);
		p.columnArDtl_ins_ts.setListListener(p);
		p.columnArDtl_upd_usr_id.addAllListener(p);
		p.columnArDtl_upd_usr_id.setListListener(p);
		p.columnArDtl_upd_usr_nm.addAllListener(p);
		p.columnArDtl_upd_usr_nm.setListListener(p);
		p.columnArDtl_upd_func_id.addAllListener(p);
		p.columnArDtl_upd_func_id.setListListener(p);
		p.columnArDtl_upd_func_nm.addAllListener(p);
		p.columnArDtl_upd_func_nm.setListListener(p);
		p.columnArDtl_upd_ts.addAllListener(p);
		p.columnArDtl_upd_ts.setListListener(p);
		p.columnArDtl_upd_srv_req_no.addAllListener(p);
		p.columnArDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ArDtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitArDtlBtn(MSBIP_CloseReg p) {
		p.ArDtlBtn_radd.addAllListener(p);
		p.ArDtlBtn_radd.setAPMethodName("doArDtlBtn_radd");
		p.ArDtlBtn_rdel.addAllListener(p);
		p.ArDtlBtn_rdel.setAPMethodName("doArDtlBtn_rdel");
		p.ArDtlBtn_rdel_all.addAllListener(p);
		p.ArDtlBtn_rdel_all.setAPMethodName("doArDtlBtn_rdel_all");
	}

	/**
	 *  [Ap]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAp(MSBIP_CloseReg p) {
	}

	/**
	 *  [ApHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitApHdr(MSBIP_CloseReg p) {
	}

	/**
	 *  [ApDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitApDtl(MSBIP_CloseReg p) {
		p.ApDtlTable.addAllListener(p);
		p.columnApDtl_asppl_cd.addAllListener(p);
		p.columnApDtl_asppl_cd.setListListener(p);
		p.columnApDtl_asppl_nm.addAllListener(p);
		p.columnApDtl_asppl_nm.setListListener(p);
		p.columnApDtl_pre_cl_tm.addAllListener(p);
		p.columnApDtl_pre_cl_tm.setListListener(p);
		p.columnApDtl_ins_usr_id.addAllListener(p);
		p.columnApDtl_ins_usr_id.setListListener(p);
		p.columnApDtl_ins_usr_nm.addAllListener(p);
		p.columnApDtl_ins_usr_nm.setListListener(p);
		p.columnApDtl_ins_func_id.addAllListener(p);
		p.columnApDtl_ins_func_id.setListListener(p);
		p.columnApDtl_ins_func_nm.addAllListener(p);
		p.columnApDtl_ins_func_nm.setListListener(p);
		p.columnApDtl_ins_ts.addAllListener(p);
		p.columnApDtl_ins_ts.setListListener(p);
		p.columnApDtl_upd_usr_id.addAllListener(p);
		p.columnApDtl_upd_usr_id.setListListener(p);
		p.columnApDtl_upd_usr_nm.addAllListener(p);
		p.columnApDtl_upd_usr_nm.setListListener(p);
		p.columnApDtl_upd_func_id.addAllListener(p);
		p.columnApDtl_upd_func_id.setListListener(p);
		p.columnApDtl_upd_func_nm.addAllListener(p);
		p.columnApDtl_upd_func_nm.setListListener(p);
		p.columnApDtl_upd_ts.addAllListener(p);
		p.columnApDtl_upd_ts.setListListener(p);
		p.columnApDtl_upd_srv_req_no.addAllListener(p);
		p.columnApDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [ApDtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitApDtlBtn(MSBIP_CloseReg p) {
		p.ApDtlBtn_radd.addAllListener(p);
		p.ApDtlBtn_radd.setAPMethodName("doApDtlBtn_radd");
		p.ApDtlBtn_rdel.addAllListener(p);
		p.ApDtlBtn_rdel.setAPMethodName("doApDtlBtn_rdel");
		p.ApDtlBtn_rdel_all.addAllListener(p);
		p.ApDtlBtn_rdel_all.setAPMethodName("doApDtlBtn_rdel_all");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBIP_CloseReg p) {
		p.Btn_upd1.addAllListener(p);
		p.Btn_upd1.setAPMethodName("doBtn_upd1");
		p.Btn_upd2.addAllListener(p);
		p.Btn_upd2.setAPMethodName("doBtn_upd2");
		p.Btn_del1.addAllListener(p);
		p.Btn_del1.setAPMethodName("doBtn_del1");
		p.Btn_del2.addAllListener(p);
		p.Btn_del2.setAPMethodName("doBtn_del2");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBIP_CloseReg p) {
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBIP_CloseReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cl_ym.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cl_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr1(MSBIP_CloseReg p){
		p.Hdr1_cl_ope_Group.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pre_cl_ope_Group.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ar_ope_Group.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ap_ope_Group.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[PreClHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PreClHdr(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[PreClDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PreClDtl(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[ArApHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ArApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[Ar]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ar(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[ArHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ArHdr(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[ArDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ArDtl(MSBIP_CloseReg p){
		p.columnArDtl_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_pre_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnArDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ArDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ArDtlBtn(MSBIP_CloseReg p){
		p.ArDtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.ArDtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.ArDtlBtn_rdel_all.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Ap]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ap(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[ApHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [SRCH]ステータスの[ApDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ApDtl(MSBIP_CloseReg p){
		p.columnApDtl_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_pre_cl_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[ApDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ApDtlBtn(MSBIP_CloseReg p){
		p.ApDtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.ApDtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.ApDtlBtn_rdel_all.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBIP_CloseReg p){
		p.Btn_upd1.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del1.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del2.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBIP_CloseReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cl_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cl_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr1(MSBIP_CloseReg p){
		p.Hdr1_cl_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_sls_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_sls_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_rcv_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_purc_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_pay_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_stk_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_pre_cl_ope_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ar_ope_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ap_ope_Group.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[PreClHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PreClHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[PreClDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PreClDtl(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[ArApHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ArApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[Ar]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ar(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[ArHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ArHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[ArDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ArDtl(MSBIP_CloseReg p){
		p.columnArDtl_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_pre_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnArDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ArDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ArDtlBtn(MSBIP_CloseReg p){
		p.ArDtlBtn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.ArDtlBtn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.ArDtlBtn_rdel_all.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Ap]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ap(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[ApHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD]ステータスの[ApDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ApDtl(MSBIP_CloseReg p){
		p.columnApDtl_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_pre_cl_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ApDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ApDtlBtn(MSBIP_CloseReg p){
		p.ApDtlBtn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.ApDtlBtn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.ApDtlBtn_rdel_all.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBIP_CloseReg p){
		p.Btn_upd1.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del1.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del2.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_Cnd(MSBIP_CloseReg p){
		p.Cnd_ope_Group.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.Cnd_cl_ym.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.Cnd_cl_dt.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_PRE, MCMode.ENABLE);

	}

	/**
	 * [UPD_PRE]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_Hdr1(MSBIP_CloseReg p){
		p.Hdr1_cl_ope_Group.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_flg.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_ym.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_flg.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_ym.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_flg.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_ym.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_flg.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_ym.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_flg.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_ym.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_pre_cl_ope_Group.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.Hdr1_ar_pre_cl_flg.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.Hdr1_ar_pre_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_flg.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.Hdr1_ap_pre_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_cd.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.Hdr1_ar_ope_Group.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.Hdr1_ap_ope_Group.putMode(p, UPD_PRE, MCMode.REQUIRED);

	}

	/**
	 * [UPD_PRE]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_Hdr2(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[PreClHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_PreClHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[PreClDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_PreClDtl(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[ArApHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ArApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[Ar]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_Ar(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[ArHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ArHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[ArDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ArDtl(MSBIP_CloseReg p){
		p.columnArDtl_acst_cd.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.columnArDtl_acst_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_pre_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_ins_ts.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_upd_ts.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnArDtl_upd_srv_req_no.putMode(p, UPD_PRE, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_PRE]ステータスの[ArDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ArDtlBtn(MSBIP_CloseReg p){
		p.ArDtlBtn_radd.putMode(p, UPD_PRE, MCMode.ENABLE);
		p.ArDtlBtn_rdel.putMode(p, UPD_PRE, MCMode.ENABLE);
		p.ArDtlBtn_rdel_all.putMode(p, UPD_PRE, MCMode.ENABLE);

	}

	/**
	 * [UPD_PRE]ステータスの[Ap]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_Ap(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[ApHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [UPD_PRE]ステータスの[ApDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ApDtl(MSBIP_CloseReg p){
		p.columnApDtl_asppl_cd.putMode(p, UPD_PRE, MCMode.REQUIRED);
		p.columnApDtl_asppl_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_pre_cl_tm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_ins_ts.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_id.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_nm.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_upd_ts.putMode(p, UPD_PRE, MCMode.READ_ONLY);
		p.columnApDtl_upd_srv_req_no.putMode(p, UPD_PRE, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_PRE]ステータスの[ApDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_ApDtlBtn(MSBIP_CloseReg p){
		p.ApDtlBtn_radd.putMode(p, UPD_PRE, MCMode.ENABLE);
		p.ApDtlBtn_rdel.putMode(p, UPD_PRE, MCMode.ENABLE);
		p.ApDtlBtn_rdel_all.putMode(p, UPD_PRE, MCMode.ENABLE);

	}

	/**
	 * [UPD_PRE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_Btn(MSBIP_CloseReg p){
		p.Btn_upd1.putMode(p, UPD_PRE, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_PRE, MCMode.ENABLE);
		p.Btn_del1.putMode(p, UPD_PRE, MCMode.INVISIBLE);
		p.Btn_del2.putMode(p, UPD_PRE, MCMode.ENABLE);

	}

	/**
	 * [UPD_PRE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRE_EastBtn(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MSBIP_CloseReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cl_ym.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cl_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr1(MSBIP_CloseReg p){
		p.Hdr1_cl_ope_Group.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_sls_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_rcv_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_purc_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_pay_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_stk_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_pre_cl_ope_Group.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ar_pre_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ap_pre_cl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ar_ope_Group.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr1_ap_ope_Group.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr2(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[PreClHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_PreClHdr(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[PreClDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_PreClDtl(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[ArApHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ArApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[Ar]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ar(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[ArHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ArHdr(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[ArDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ArDtl(MSBIP_CloseReg p){
		p.columnArDtl_acst_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_acst_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_pre_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnArDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[ArDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ArDtlBtn(MSBIP_CloseReg p){
		p.ArDtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.ArDtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.ArDtlBtn_rdel_all.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Ap]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ap(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[ApHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ApHdr(MSBIP_CloseReg p){

	}

	/**
	 * [FIX]ステータスの[ApDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ApDtl(MSBIP_CloseReg p){
		p.columnApDtl_asppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_asppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_pre_cl_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnApDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[ApDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ApDtlBtn(MSBIP_CloseReg p){
		p.ApDtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.ApDtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.ApDtlBtn_rdel_all.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MSBIP_CloseReg p){
		p.Btn_upd1.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_del1.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del2.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MSBIP_CloseReg p){

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
		MSBIP_CloseReg_MC.setTableConfigArDtl((MSBIP_CloseReg)this);
		MSBIP_CloseReg_MC.setTableConfigApDtl((MSBIP_CloseReg)this);
	}

	/**
	 * [ArDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigArDtl(MSBIP_CloseReg p) {
		p.columnArDtl_acst_cd.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.acst_cd_META);
		p.columnArDtl_acst_cd.setListType(MCListType.STRICT);
		p.columnArDtl_acst_cd.addLinkBeans(p.columnArDtl_acst_nm);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_acst_cd);
		p.columnArDtl_acst_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.acst_nm_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_acst_nm);
		p.columnArDtl_pre_cl_tm.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.pre_cl_tm_META);
		p.columnArDtl_pre_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_pre_cl_tm);
		p.columnArDtl_ins_usr_id.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.ins_usr_id_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_ins_usr_id);
		p.columnArDtl_ins_usr_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.ins_usr_nm_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_ins_usr_nm);
		p.columnArDtl_ins_func_id.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.ins_func_id_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_ins_func_id);
		p.columnArDtl_ins_func_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.ins_func_nm_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_ins_func_nm);
		p.columnArDtl_ins_ts.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.ins_ts_META);
		p.columnArDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_ins_ts);
		p.columnArDtl_upd_usr_id.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.upd_usr_id_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_upd_usr_id);
		p.columnArDtl_upd_usr_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.upd_usr_nm_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_upd_usr_nm);
		p.columnArDtl_upd_func_id.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.upd_func_id_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_upd_func_id);
		p.columnArDtl_upd_func_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.upd_func_nm_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_upd_func_nm);
		p.columnArDtl_upd_ts.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.upd_ts_META);
		p.columnArDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_upd_ts);
		p.columnArDtl_upd_srv_req_no.setMeta(mcframe.clientMSBI.MSBIP0010.ArDtlR.upd_srv_req_no_META);
		p.ArDtlTable.addColumnConfig(p.columnArDtl_upd_srv_req_no);
	}

	/**
	 * [ApDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigApDtl(MSBIP_CloseReg p) {
		p.columnApDtl_asppl_cd.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.asppl_cd_META);
		p.columnApDtl_asppl_cd.setListType(MCListType.STRICT);
		p.columnApDtl_asppl_cd.addLinkBeans(p.columnApDtl_asppl_nm);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_asppl_cd);
		p.columnApDtl_asppl_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.asppl_nm_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_asppl_nm);
		p.columnApDtl_pre_cl_tm.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.pre_cl_tm_META);
		p.columnApDtl_pre_cl_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_pre_cl_tm);
		p.columnApDtl_ins_usr_id.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.ins_usr_id_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_ins_usr_id);
		p.columnApDtl_ins_usr_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.ins_usr_nm_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_ins_usr_nm);
		p.columnApDtl_ins_func_id.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.ins_func_id_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_ins_func_id);
		p.columnApDtl_ins_func_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.ins_func_nm_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_ins_func_nm);
		p.columnApDtl_ins_ts.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.ins_ts_META);
		p.columnApDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_ins_ts);
		p.columnApDtl_upd_usr_id.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.upd_usr_id_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_upd_usr_id);
		p.columnApDtl_upd_usr_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.upd_usr_nm_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_upd_usr_nm);
		p.columnApDtl_upd_func_id.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.upd_func_id_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_upd_func_id);
		p.columnApDtl_upd_func_nm.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.upd_func_nm_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_upd_func_nm);
		p.columnApDtl_upd_ts.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.upd_ts_META);
		p.columnApDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_upd_ts);
		p.columnApDtl_upd_srv_req_no.setMeta(mcframe.clientMSBI.MSBIP0010.ApDtlR.upd_srv_req_no_META);
		p.ApDtlTable.addColumnConfig(p.columnApDtl_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnArDtl_acst_cd.getListConfig().setPutter(getArDtl_acst_cd_ListPutter());
		columnApDtl_asppl_cd.getListConfig().setPutter(getApDtl_asppl_cd_ListPutter());
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_PRE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_PREStatus() {
		status = UPD_PRE;
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_PRE.equals(status)) {
			setUPD_PREStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
	}

	/**
	 * [ArDtl_acst_cd_ListPutter]の作成
	 */
	protected MCListPutter createArDtl_acst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [ApDtl_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createApDtl_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnArDtl_acst_cd) return getArDtl_acst_cd(row, info);
		if(combo == columnApDtl_asppl_cd) return getApDtl_asppl_cd(row, info);
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
		else if (ap == ArDtlBtn_radd) doArDtlBtn_radd(info);
		else if (ap == ArDtlBtn_rdel) doArDtlBtn_rdel(info);
		else if (ap == ArDtlBtn_rdel_all) doArDtlBtn_rdel_all(info);
		else if (ap == ApDtlBtn_radd) doApDtlBtn_radd(info);
		else if (ap == ApDtlBtn_rdel) doApDtlBtn_rdel(info);
		else if (ap == ApDtlBtn_rdel_all) doApDtlBtn_rdel_all(info);
		else if (ap == Btn_upd1) doBtn_upd1(info);
		else if (ap == Btn_upd2) doBtn_upd2(info);
		else if (ap == Btn_del1) doBtn_del1(info);
		else if (ap == Btn_del2) doBtn_del2(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [ArDtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doArDtlBtn_radd(MCEventInfo info);

	/**
	 * [ArDtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doArDtlBtn_rdel(MCEventInfo info);

	/**
	 * [ArDtlBtn]パネルの[rdel_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doArDtlBtn_rdel_all(MCEventInfo info);

	/**
	 * [ApDtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doApDtlBtn_radd(MCEventInfo info);

	/**
	 * [ApDtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doApDtlBtn_rdel(MCEventInfo info);

	/**
	 * [ApDtlBtn]パネルの[rdel_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doApDtlBtn_rdel_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd1]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd1(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd2(MCEventInfo info);

	/**
	 * [Btn]パネルの[del1]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del1(MCEventInfo info);

	/**
	 * [Btn]パネルの[del2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del2(MCEventInfo info);

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
		if (vc == ArDtlTable) return doArDtl_VC(info);
		if (vc == ApDtlTable) return doApDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cl_ym) return doCnd_cl_ym_VC(info);
		if (vc == Cnd_cl_dt) return doCnd_cl_dt_VC(info);
		if (vc == Hdr1_cl_ope_Group) return doHdr1_cl_ope_VC(info);
		if (vc == Hdr1_sls_cl_flg) return doHdr1_sls_cl_flg_VC(info);
		if (vc == Hdr1_sls_cl_ym) return doHdr1_sls_cl_ym_VC(info);
		if (vc == Hdr1_sls_cl_tm) return doHdr1_sls_cl_tm_VC(info);
		if (vc == Hdr1_sls_cl_usr_cd) return doHdr1_sls_cl_usr_cd_VC(info);
		if (vc == Hdr1_sls_cl_usr_nm) return doHdr1_sls_cl_usr_nm_VC(info);
		if (vc == Hdr1_rcv_cl_flg) return doHdr1_rcv_cl_flg_VC(info);
		if (vc == Hdr1_rcv_cl_ym) return doHdr1_rcv_cl_ym_VC(info);
		if (vc == Hdr1_rcv_cl_tm) return doHdr1_rcv_cl_tm_VC(info);
		if (vc == Hdr1_rcv_cl_usr_cd) return doHdr1_rcv_cl_usr_cd_VC(info);
		if (vc == Hdr1_rcv_cl_usr_nm) return doHdr1_rcv_cl_usr_nm_VC(info);
		if (vc == Hdr1_purc_cl_flg) return doHdr1_purc_cl_flg_VC(info);
		if (vc == Hdr1_purc_cl_ym) return doHdr1_purc_cl_ym_VC(info);
		if (vc == Hdr1_purc_cl_tm) return doHdr1_purc_cl_tm_VC(info);
		if (vc == Hdr1_purc_cl_usr_cd) return doHdr1_purc_cl_usr_cd_VC(info);
		if (vc == Hdr1_purc_cl_usr_nm) return doHdr1_purc_cl_usr_nm_VC(info);
		if (vc == Hdr1_pay_cl_flg) return doHdr1_pay_cl_flg_VC(info);
		if (vc == Hdr1_pay_cl_ym) return doHdr1_pay_cl_ym_VC(info);
		if (vc == Hdr1_pay_cl_tm) return doHdr1_pay_cl_tm_VC(info);
		if (vc == Hdr1_pay_cl_usr_cd) return doHdr1_pay_cl_usr_cd_VC(info);
		if (vc == Hdr1_pay_cl_usr_nm) return doHdr1_pay_cl_usr_nm_VC(info);
		if (vc == Hdr1_stk_cl_flg) return doHdr1_stk_cl_flg_VC(info);
		if (vc == Hdr1_stk_cl_ym) return doHdr1_stk_cl_ym_VC(info);
		if (vc == Hdr1_stk_cl_tm) return doHdr1_stk_cl_tm_VC(info);
		if (vc == Hdr1_stk_cl_usr_cd) return doHdr1_stk_cl_usr_cd_VC(info);
		if (vc == Hdr1_stk_cl_usr_nm) return doHdr1_stk_cl_usr_nm_VC(info);
		if (vc == Hdr1_pre_cl_ope_Group) return doHdr1_pre_cl_ope_VC(info);
		if (vc == Hdr1_ar_pre_cl_flg) return doHdr1_ar_pre_cl_flg_VC(info);
		if (vc == Hdr1_ar_pre_cl_tm) return doHdr1_ar_pre_cl_tm_VC(info);
		if (vc == Hdr1_ar_pre_cl_usr_cd) return doHdr1_ar_pre_cl_usr_cd_VC(info);
		if (vc == Hdr1_ar_pre_cl_usr_nm) return doHdr1_ar_pre_cl_usr_nm_VC(info);
		if (vc == Hdr1_ap_pre_cl_flg) return doHdr1_ap_pre_cl_flg_VC(info);
		if (vc == Hdr1_ap_pre_cl_tm) return doHdr1_ap_pre_cl_tm_VC(info);
		if (vc == Hdr1_ap_pre_cl_usr_cd) return doHdr1_ap_pre_cl_usr_cd_VC(info);
		if (vc == Hdr1_ap_pre_cl_usr_nm) return doHdr1_ap_pre_cl_usr_nm_VC(info);
		if (vc == Hdr1_ar_ope_Group) return doHdr1_ar_ope_VC(info);
		if (vc == Hdr1_ap_ope_Group) return doHdr1_ap_ope_VC(info);
		if (vc == columnArDtl_acst_cd) return doArDtl_acst_cd_VC(info);
		if (vc == columnArDtl_acst_nm) return doArDtl_acst_nm_VC(info);
		if (vc == columnArDtl_pre_cl_tm) return doArDtl_pre_cl_tm_VC(info);
		if (vc == columnArDtl_ins_usr_id) return doArDtl_ins_usr_id_VC(info);
		if (vc == columnArDtl_ins_usr_nm) return doArDtl_ins_usr_nm_VC(info);
		if (vc == columnArDtl_ins_func_id) return doArDtl_ins_func_id_VC(info);
		if (vc == columnArDtl_ins_func_nm) return doArDtl_ins_func_nm_VC(info);
		if (vc == columnArDtl_ins_ts) return doArDtl_ins_ts_VC(info);
		if (vc == columnArDtl_upd_usr_id) return doArDtl_upd_usr_id_VC(info);
		if (vc == columnArDtl_upd_usr_nm) return doArDtl_upd_usr_nm_VC(info);
		if (vc == columnArDtl_upd_func_id) return doArDtl_upd_func_id_VC(info);
		if (vc == columnArDtl_upd_func_nm) return doArDtl_upd_func_nm_VC(info);
		if (vc == columnArDtl_upd_ts) return doArDtl_upd_ts_VC(info);
		if (vc == columnArDtl_upd_srv_req_no) return doArDtl_upd_srv_req_no_VC(info);
		if (vc == columnApDtl_asppl_cd) return doApDtl_asppl_cd_VC(info);
		if (vc == columnApDtl_asppl_nm) return doApDtl_asppl_nm_VC(info);
		if (vc == columnApDtl_pre_cl_tm) return doApDtl_pre_cl_tm_VC(info);
		if (vc == columnApDtl_ins_usr_id) return doApDtl_ins_usr_id_VC(info);
		if (vc == columnApDtl_ins_usr_nm) return doApDtl_ins_usr_nm_VC(info);
		if (vc == columnApDtl_ins_func_id) return doApDtl_ins_func_id_VC(info);
		if (vc == columnApDtl_ins_func_nm) return doApDtl_ins_func_nm_VC(info);
		if (vc == columnApDtl_ins_ts) return doApDtl_ins_ts_VC(info);
		if (vc == columnApDtl_upd_usr_id) return doApDtl_upd_usr_id_VC(info);
		if (vc == columnApDtl_upd_usr_nm) return doApDtl_upd_usr_nm_VC(info);
		if (vc == columnApDtl_upd_func_id) return doApDtl_upd_func_id_VC(info);
		if (vc == columnApDtl_upd_func_nm) return doApDtl_upd_func_nm_VC(info);
		if (vc == columnApDtl_upd_ts) return doApDtl_upd_ts_VC(info);
		if (vc == columnApDtl_upd_srv_req_no) return doApDtl_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [ArDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[cl_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_cl_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sls_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sls_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sls_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sls_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sls_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sls_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sls_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sls_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcv_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pay_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pay_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pay_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pay_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pay_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pay_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pay_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pay_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[stk_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_stk_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[stk_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_stk_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[stk_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_stk_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_stk_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_stk_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pre_cl_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pre_cl_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ar_pre_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ar_pre_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ar_pre_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ar_pre_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_pre_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_pre_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_pre_cl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_pre_cl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ar_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ar_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[pre_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_pre_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ArDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doArDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[pre_cl_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_pre_cl_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApDtl_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == ArDtlTable) doArDtl_NC(info);
		else if (nc == ApDtlTable) doApDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cl_ym) doCnd_cl_ym_NC(info);
		else if (nc == Cnd_cl_dt) doCnd_cl_dt_NC(info);
		else if (nc == Hdr1_cl_ope_Group) doHdr1_cl_ope_NC(info);
		else if (nc == Hdr1_sls_cl_flg) doHdr1_sls_cl_flg_NC(info);
		else if (nc == Hdr1_sls_cl_ym) doHdr1_sls_cl_ym_NC(info);
		else if (nc == Hdr1_sls_cl_tm) doHdr1_sls_cl_tm_NC(info);
		else if (nc == Hdr1_sls_cl_usr_cd) doHdr1_sls_cl_usr_cd_NC(info);
		else if (nc == Hdr1_sls_cl_usr_nm) doHdr1_sls_cl_usr_nm_NC(info);
		else if (nc == Hdr1_rcv_cl_flg) doHdr1_rcv_cl_flg_NC(info);
		else if (nc == Hdr1_rcv_cl_ym) doHdr1_rcv_cl_ym_NC(info);
		else if (nc == Hdr1_rcv_cl_tm) doHdr1_rcv_cl_tm_NC(info);
		else if (nc == Hdr1_rcv_cl_usr_cd) doHdr1_rcv_cl_usr_cd_NC(info);
		else if (nc == Hdr1_rcv_cl_usr_nm) doHdr1_rcv_cl_usr_nm_NC(info);
		else if (nc == Hdr1_purc_cl_flg) doHdr1_purc_cl_flg_NC(info);
		else if (nc == Hdr1_purc_cl_ym) doHdr1_purc_cl_ym_NC(info);
		else if (nc == Hdr1_purc_cl_tm) doHdr1_purc_cl_tm_NC(info);
		else if (nc == Hdr1_purc_cl_usr_cd) doHdr1_purc_cl_usr_cd_NC(info);
		else if (nc == Hdr1_purc_cl_usr_nm) doHdr1_purc_cl_usr_nm_NC(info);
		else if (nc == Hdr1_pay_cl_flg) doHdr1_pay_cl_flg_NC(info);
		else if (nc == Hdr1_pay_cl_ym) doHdr1_pay_cl_ym_NC(info);
		else if (nc == Hdr1_pay_cl_tm) doHdr1_pay_cl_tm_NC(info);
		else if (nc == Hdr1_pay_cl_usr_cd) doHdr1_pay_cl_usr_cd_NC(info);
		else if (nc == Hdr1_pay_cl_usr_nm) doHdr1_pay_cl_usr_nm_NC(info);
		else if (nc == Hdr1_stk_cl_flg) doHdr1_stk_cl_flg_NC(info);
		else if (nc == Hdr1_stk_cl_ym) doHdr1_stk_cl_ym_NC(info);
		else if (nc == Hdr1_stk_cl_tm) doHdr1_stk_cl_tm_NC(info);
		else if (nc == Hdr1_stk_cl_usr_cd) doHdr1_stk_cl_usr_cd_NC(info);
		else if (nc == Hdr1_stk_cl_usr_nm) doHdr1_stk_cl_usr_nm_NC(info);
		else if (nc == Hdr1_pre_cl_ope_Group) doHdr1_pre_cl_ope_NC(info);
		else if (nc == Hdr1_ar_pre_cl_flg) doHdr1_ar_pre_cl_flg_NC(info);
		else if (nc == Hdr1_ar_pre_cl_tm) doHdr1_ar_pre_cl_tm_NC(info);
		else if (nc == Hdr1_ar_pre_cl_usr_cd) doHdr1_ar_pre_cl_usr_cd_NC(info);
		else if (nc == Hdr1_ar_pre_cl_usr_nm) doHdr1_ar_pre_cl_usr_nm_NC(info);
		else if (nc == Hdr1_ap_pre_cl_flg) doHdr1_ap_pre_cl_flg_NC(info);
		else if (nc == Hdr1_ap_pre_cl_tm) doHdr1_ap_pre_cl_tm_NC(info);
		else if (nc == Hdr1_ap_pre_cl_usr_cd) doHdr1_ap_pre_cl_usr_cd_NC(info);
		else if (nc == Hdr1_ap_pre_cl_usr_nm) doHdr1_ap_pre_cl_usr_nm_NC(info);
		else if (nc == Hdr1_ar_ope_Group) doHdr1_ar_ope_NC(info);
		else if (nc == Hdr1_ap_ope_Group) doHdr1_ap_ope_NC(info);
		else if (nc == columnArDtl_acst_cd) doArDtl_acst_cd_NC(info);
		else if (nc == columnArDtl_acst_nm) doArDtl_acst_nm_NC(info);
		else if (nc == columnArDtl_pre_cl_tm) doArDtl_pre_cl_tm_NC(info);
		else if (nc == columnArDtl_ins_usr_id) doArDtl_ins_usr_id_NC(info);
		else if (nc == columnArDtl_ins_usr_nm) doArDtl_ins_usr_nm_NC(info);
		else if (nc == columnArDtl_ins_func_id) doArDtl_ins_func_id_NC(info);
		else if (nc == columnArDtl_ins_func_nm) doArDtl_ins_func_nm_NC(info);
		else if (nc == columnArDtl_ins_ts) doArDtl_ins_ts_NC(info);
		else if (nc == columnArDtl_upd_usr_id) doArDtl_upd_usr_id_NC(info);
		else if (nc == columnArDtl_upd_usr_nm) doArDtl_upd_usr_nm_NC(info);
		else if (nc == columnArDtl_upd_func_id) doArDtl_upd_func_id_NC(info);
		else if (nc == columnArDtl_upd_func_nm) doArDtl_upd_func_nm_NC(info);
		else if (nc == columnArDtl_upd_ts) doArDtl_upd_ts_NC(info);
		else if (nc == columnArDtl_upd_srv_req_no) doArDtl_upd_srv_req_no_NC(info);
		else if (nc == columnApDtl_asppl_cd) doApDtl_asppl_cd_NC(info);
		else if (nc == columnApDtl_asppl_nm) doApDtl_asppl_nm_NC(info);
		else if (nc == columnApDtl_pre_cl_tm) doApDtl_pre_cl_tm_NC(info);
		else if (nc == columnApDtl_ins_usr_id) doApDtl_ins_usr_id_NC(info);
		else if (nc == columnApDtl_ins_usr_nm) doApDtl_ins_usr_nm_NC(info);
		else if (nc == columnApDtl_ins_func_id) doApDtl_ins_func_id_NC(info);
		else if (nc == columnApDtl_ins_func_nm) doApDtl_ins_func_nm_NC(info);
		else if (nc == columnApDtl_ins_ts) doApDtl_ins_ts_NC(info);
		else if (nc == columnApDtl_upd_usr_id) doApDtl_upd_usr_id_NC(info);
		else if (nc == columnApDtl_upd_usr_nm) doApDtl_upd_usr_nm_NC(info);
		else if (nc == columnApDtl_upd_func_id) doApDtl_upd_func_id_NC(info);
		else if (nc == columnApDtl_upd_func_nm) doApDtl_upd_func_nm_NC(info);
		else if (nc == columnApDtl_upd_ts) doApDtl_upd_ts_NC(info);
		else if (nc == columnApDtl_upd_srv_req_no) doApDtl_upd_srv_req_no_NC(info);
	}

	/**
	 * [ArDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[cl_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_cl_ope_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_cl_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_cl_ope_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_ope_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_ope_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[pre_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_pre_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[pre_cl_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_pre_cl_tm_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == ArDtlTable) doArDtl_NE(info);
		else if (ne == ApDtlTable) doApDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cl_ym) doCnd_cl_ym_NE(info);
		else if (ne == Cnd_cl_dt) doCnd_cl_dt_NE(info);
		else if (ne == Hdr1_cl_ope_Group) doHdr1_cl_ope_NE(info);
		else if (ne == Hdr1_sls_cl_flg) doHdr1_sls_cl_flg_NE(info);
		else if (ne == Hdr1_sls_cl_ym) doHdr1_sls_cl_ym_NE(info);
		else if (ne == Hdr1_sls_cl_tm) doHdr1_sls_cl_tm_NE(info);
		else if (ne == Hdr1_sls_cl_usr_cd) doHdr1_sls_cl_usr_cd_NE(info);
		else if (ne == Hdr1_sls_cl_usr_nm) doHdr1_sls_cl_usr_nm_NE(info);
		else if (ne == Hdr1_rcv_cl_flg) doHdr1_rcv_cl_flg_NE(info);
		else if (ne == Hdr1_rcv_cl_ym) doHdr1_rcv_cl_ym_NE(info);
		else if (ne == Hdr1_rcv_cl_tm) doHdr1_rcv_cl_tm_NE(info);
		else if (ne == Hdr1_rcv_cl_usr_cd) doHdr1_rcv_cl_usr_cd_NE(info);
		else if (ne == Hdr1_rcv_cl_usr_nm) doHdr1_rcv_cl_usr_nm_NE(info);
		else if (ne == Hdr1_purc_cl_flg) doHdr1_purc_cl_flg_NE(info);
		else if (ne == Hdr1_purc_cl_ym) doHdr1_purc_cl_ym_NE(info);
		else if (ne == Hdr1_purc_cl_tm) doHdr1_purc_cl_tm_NE(info);
		else if (ne == Hdr1_purc_cl_usr_cd) doHdr1_purc_cl_usr_cd_NE(info);
		else if (ne == Hdr1_purc_cl_usr_nm) doHdr1_purc_cl_usr_nm_NE(info);
		else if (ne == Hdr1_pay_cl_flg) doHdr1_pay_cl_flg_NE(info);
		else if (ne == Hdr1_pay_cl_ym) doHdr1_pay_cl_ym_NE(info);
		else if (ne == Hdr1_pay_cl_tm) doHdr1_pay_cl_tm_NE(info);
		else if (ne == Hdr1_pay_cl_usr_cd) doHdr1_pay_cl_usr_cd_NE(info);
		else if (ne == Hdr1_pay_cl_usr_nm) doHdr1_pay_cl_usr_nm_NE(info);
		else if (ne == Hdr1_stk_cl_flg) doHdr1_stk_cl_flg_NE(info);
		else if (ne == Hdr1_stk_cl_ym) doHdr1_stk_cl_ym_NE(info);
		else if (ne == Hdr1_stk_cl_tm) doHdr1_stk_cl_tm_NE(info);
		else if (ne == Hdr1_stk_cl_usr_cd) doHdr1_stk_cl_usr_cd_NE(info);
		else if (ne == Hdr1_stk_cl_usr_nm) doHdr1_stk_cl_usr_nm_NE(info);
		else if (ne == Hdr1_pre_cl_ope_Group) doHdr1_pre_cl_ope_NE(info);
		else if (ne == Hdr1_ar_pre_cl_flg) doHdr1_ar_pre_cl_flg_NE(info);
		else if (ne == Hdr1_ar_pre_cl_tm) doHdr1_ar_pre_cl_tm_NE(info);
		else if (ne == Hdr1_ar_pre_cl_usr_cd) doHdr1_ar_pre_cl_usr_cd_NE(info);
		else if (ne == Hdr1_ar_pre_cl_usr_nm) doHdr1_ar_pre_cl_usr_nm_NE(info);
		else if (ne == Hdr1_ap_pre_cl_flg) doHdr1_ap_pre_cl_flg_NE(info);
		else if (ne == Hdr1_ap_pre_cl_tm) doHdr1_ap_pre_cl_tm_NE(info);
		else if (ne == Hdr1_ap_pre_cl_usr_cd) doHdr1_ap_pre_cl_usr_cd_NE(info);
		else if (ne == Hdr1_ap_pre_cl_usr_nm) doHdr1_ap_pre_cl_usr_nm_NE(info);
		else if (ne == Hdr1_ar_ope_Group) doHdr1_ar_ope_NE(info);
		else if (ne == Hdr1_ap_ope_Group) doHdr1_ap_ope_NE(info);
		else if (ne == columnArDtl_acst_cd) doArDtl_acst_cd_NE(info);
		else if (ne == columnArDtl_acst_nm) doArDtl_acst_nm_NE(info);
		else if (ne == columnArDtl_pre_cl_tm) doArDtl_pre_cl_tm_NE(info);
		else if (ne == columnArDtl_ins_usr_id) doArDtl_ins_usr_id_NE(info);
		else if (ne == columnArDtl_ins_usr_nm) doArDtl_ins_usr_nm_NE(info);
		else if (ne == columnArDtl_ins_func_id) doArDtl_ins_func_id_NE(info);
		else if (ne == columnArDtl_ins_func_nm) doArDtl_ins_func_nm_NE(info);
		else if (ne == columnArDtl_ins_ts) doArDtl_ins_ts_NE(info);
		else if (ne == columnArDtl_upd_usr_id) doArDtl_upd_usr_id_NE(info);
		else if (ne == columnArDtl_upd_usr_nm) doArDtl_upd_usr_nm_NE(info);
		else if (ne == columnArDtl_upd_func_id) doArDtl_upd_func_id_NE(info);
		else if (ne == columnArDtl_upd_func_nm) doArDtl_upd_func_nm_NE(info);
		else if (ne == columnArDtl_upd_ts) doArDtl_upd_ts_NE(info);
		else if (ne == columnArDtl_upd_srv_req_no) doArDtl_upd_srv_req_no_NE(info);
		else if (ne == columnApDtl_asppl_cd) doApDtl_asppl_cd_NE(info);
		else if (ne == columnApDtl_asppl_nm) doApDtl_asppl_nm_NE(info);
		else if (ne == columnApDtl_pre_cl_tm) doApDtl_pre_cl_tm_NE(info);
		else if (ne == columnApDtl_ins_usr_id) doApDtl_ins_usr_id_NE(info);
		else if (ne == columnApDtl_ins_usr_nm) doApDtl_ins_usr_nm_NE(info);
		else if (ne == columnApDtl_ins_func_id) doApDtl_ins_func_id_NE(info);
		else if (ne == columnApDtl_ins_func_nm) doApDtl_ins_func_nm_NE(info);
		else if (ne == columnApDtl_ins_ts) doApDtl_ins_ts_NE(info);
		else if (ne == columnApDtl_upd_usr_id) doApDtl_upd_usr_id_NE(info);
		else if (ne == columnApDtl_upd_usr_nm) doApDtl_upd_usr_nm_NE(info);
		else if (ne == columnApDtl_upd_func_id) doApDtl_upd_func_id_NE(info);
		else if (ne == columnApDtl_upd_func_nm) doApDtl_upd_func_nm_NE(info);
		else if (ne == columnApDtl_upd_ts) doApDtl_upd_ts_NE(info);
		else if (ne == columnApDtl_upd_srv_req_no) doApDtl_upd_srv_req_no_NE(info);
	}

	/**
	 * [ArDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[cl_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_cl_ope_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_cl_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_cl_ope_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_ope_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_ope_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[pre_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_pre_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[pre_cl_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_pre_cl_tm_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == ArDtlTable) doArDtl_NX(info);
		else if (nx == ApDtlTable) doApDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cl_ym) doCnd_cl_ym_NX(info);
		else if (nx == Cnd_cl_dt) doCnd_cl_dt_NX(info);
		else if (nx == Hdr1_cl_ope_Group) doHdr1_cl_ope_NX(info);
		else if (nx == Hdr1_sls_cl_flg) doHdr1_sls_cl_flg_NX(info);
		else if (nx == Hdr1_sls_cl_ym) doHdr1_sls_cl_ym_NX(info);
		else if (nx == Hdr1_sls_cl_tm) doHdr1_sls_cl_tm_NX(info);
		else if (nx == Hdr1_sls_cl_usr_cd) doHdr1_sls_cl_usr_cd_NX(info);
		else if (nx == Hdr1_sls_cl_usr_nm) doHdr1_sls_cl_usr_nm_NX(info);
		else if (nx == Hdr1_rcv_cl_flg) doHdr1_rcv_cl_flg_NX(info);
		else if (nx == Hdr1_rcv_cl_ym) doHdr1_rcv_cl_ym_NX(info);
		else if (nx == Hdr1_rcv_cl_tm) doHdr1_rcv_cl_tm_NX(info);
		else if (nx == Hdr1_rcv_cl_usr_cd) doHdr1_rcv_cl_usr_cd_NX(info);
		else if (nx == Hdr1_rcv_cl_usr_nm) doHdr1_rcv_cl_usr_nm_NX(info);
		else if (nx == Hdr1_purc_cl_flg) doHdr1_purc_cl_flg_NX(info);
		else if (nx == Hdr1_purc_cl_ym) doHdr1_purc_cl_ym_NX(info);
		else if (nx == Hdr1_purc_cl_tm) doHdr1_purc_cl_tm_NX(info);
		else if (nx == Hdr1_purc_cl_usr_cd) doHdr1_purc_cl_usr_cd_NX(info);
		else if (nx == Hdr1_purc_cl_usr_nm) doHdr1_purc_cl_usr_nm_NX(info);
		else if (nx == Hdr1_pay_cl_flg) doHdr1_pay_cl_flg_NX(info);
		else if (nx == Hdr1_pay_cl_ym) doHdr1_pay_cl_ym_NX(info);
		else if (nx == Hdr1_pay_cl_tm) doHdr1_pay_cl_tm_NX(info);
		else if (nx == Hdr1_pay_cl_usr_cd) doHdr1_pay_cl_usr_cd_NX(info);
		else if (nx == Hdr1_pay_cl_usr_nm) doHdr1_pay_cl_usr_nm_NX(info);
		else if (nx == Hdr1_stk_cl_flg) doHdr1_stk_cl_flg_NX(info);
		else if (nx == Hdr1_stk_cl_ym) doHdr1_stk_cl_ym_NX(info);
		else if (nx == Hdr1_stk_cl_tm) doHdr1_stk_cl_tm_NX(info);
		else if (nx == Hdr1_stk_cl_usr_cd) doHdr1_stk_cl_usr_cd_NX(info);
		else if (nx == Hdr1_stk_cl_usr_nm) doHdr1_stk_cl_usr_nm_NX(info);
		else if (nx == Hdr1_pre_cl_ope_Group) doHdr1_pre_cl_ope_NX(info);
		else if (nx == Hdr1_ar_pre_cl_flg) doHdr1_ar_pre_cl_flg_NX(info);
		else if (nx == Hdr1_ar_pre_cl_tm) doHdr1_ar_pre_cl_tm_NX(info);
		else if (nx == Hdr1_ar_pre_cl_usr_cd) doHdr1_ar_pre_cl_usr_cd_NX(info);
		else if (nx == Hdr1_ar_pre_cl_usr_nm) doHdr1_ar_pre_cl_usr_nm_NX(info);
		else if (nx == Hdr1_ap_pre_cl_flg) doHdr1_ap_pre_cl_flg_NX(info);
		else if (nx == Hdr1_ap_pre_cl_tm) doHdr1_ap_pre_cl_tm_NX(info);
		else if (nx == Hdr1_ap_pre_cl_usr_cd) doHdr1_ap_pre_cl_usr_cd_NX(info);
		else if (nx == Hdr1_ap_pre_cl_usr_nm) doHdr1_ap_pre_cl_usr_nm_NX(info);
		else if (nx == Hdr1_ar_ope_Group) doHdr1_ar_ope_NX(info);
		else if (nx == Hdr1_ap_ope_Group) doHdr1_ap_ope_NX(info);
		else if (nx == columnArDtl_acst_cd) doArDtl_acst_cd_NX(info);
		else if (nx == columnArDtl_acst_nm) doArDtl_acst_nm_NX(info);
		else if (nx == columnArDtl_pre_cl_tm) doArDtl_pre_cl_tm_NX(info);
		else if (nx == columnArDtl_ins_usr_id) doArDtl_ins_usr_id_NX(info);
		else if (nx == columnArDtl_ins_usr_nm) doArDtl_ins_usr_nm_NX(info);
		else if (nx == columnArDtl_ins_func_id) doArDtl_ins_func_id_NX(info);
		else if (nx == columnArDtl_ins_func_nm) doArDtl_ins_func_nm_NX(info);
		else if (nx == columnArDtl_ins_ts) doArDtl_ins_ts_NX(info);
		else if (nx == columnArDtl_upd_usr_id) doArDtl_upd_usr_id_NX(info);
		else if (nx == columnArDtl_upd_usr_nm) doArDtl_upd_usr_nm_NX(info);
		else if (nx == columnArDtl_upd_func_id) doArDtl_upd_func_id_NX(info);
		else if (nx == columnArDtl_upd_func_nm) doArDtl_upd_func_nm_NX(info);
		else if (nx == columnArDtl_upd_ts) doArDtl_upd_ts_NX(info);
		else if (nx == columnArDtl_upd_srv_req_no) doArDtl_upd_srv_req_no_NX(info);
		else if (nx == columnApDtl_asppl_cd) doApDtl_asppl_cd_NX(info);
		else if (nx == columnApDtl_asppl_nm) doApDtl_asppl_nm_NX(info);
		else if (nx == columnApDtl_pre_cl_tm) doApDtl_pre_cl_tm_NX(info);
		else if (nx == columnApDtl_ins_usr_id) doApDtl_ins_usr_id_NX(info);
		else if (nx == columnApDtl_ins_usr_nm) doApDtl_ins_usr_nm_NX(info);
		else if (nx == columnApDtl_ins_func_id) doApDtl_ins_func_id_NX(info);
		else if (nx == columnApDtl_ins_func_nm) doApDtl_ins_func_nm_NX(info);
		else if (nx == columnApDtl_ins_ts) doApDtl_ins_ts_NX(info);
		else if (nx == columnApDtl_upd_usr_id) doApDtl_upd_usr_id_NX(info);
		else if (nx == columnApDtl_upd_usr_nm) doApDtl_upd_usr_nm_NX(info);
		else if (nx == columnApDtl_upd_func_id) doApDtl_upd_func_id_NX(info);
		else if (nx == columnApDtl_upd_func_nm) doApDtl_upd_func_nm_NX(info);
		else if (nx == columnApDtl_upd_ts) doApDtl_upd_ts_NX(info);
		else if (nx == columnApDtl_upd_srv_req_no) doApDtl_upd_srv_req_no_NX(info);
	}

	/**
	 * [ArDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[cl_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_cl_ope_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pre_cl_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pre_cl_ope_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_ope_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_ope_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[pre_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_pre_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[pre_cl_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_pre_cl_tm_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_cl_ym) doCnd_cl_ym_LC(info);
		else if (lc == Cnd_cl_dt) doCnd_cl_dt_LC(info);
		else if (lc == Hdr1_sls_cl_ym) doHdr1_sls_cl_ym_LC(info);
		else if (lc == Hdr1_sls_cl_tm) doHdr1_sls_cl_tm_LC(info);
		else if (lc == Hdr1_sls_cl_usr_cd) doHdr1_sls_cl_usr_cd_LC(info);
		else if (lc == Hdr1_sls_cl_usr_nm) doHdr1_sls_cl_usr_nm_LC(info);
		else if (lc == Hdr1_rcv_cl_ym) doHdr1_rcv_cl_ym_LC(info);
		else if (lc == Hdr1_rcv_cl_tm) doHdr1_rcv_cl_tm_LC(info);
		else if (lc == Hdr1_rcv_cl_usr_cd) doHdr1_rcv_cl_usr_cd_LC(info);
		else if (lc == Hdr1_rcv_cl_usr_nm) doHdr1_rcv_cl_usr_nm_LC(info);
		else if (lc == Hdr1_purc_cl_ym) doHdr1_purc_cl_ym_LC(info);
		else if (lc == Hdr1_purc_cl_tm) doHdr1_purc_cl_tm_LC(info);
		else if (lc == Hdr1_purc_cl_usr_cd) doHdr1_purc_cl_usr_cd_LC(info);
		else if (lc == Hdr1_purc_cl_usr_nm) doHdr1_purc_cl_usr_nm_LC(info);
		else if (lc == Hdr1_pay_cl_ym) doHdr1_pay_cl_ym_LC(info);
		else if (lc == Hdr1_pay_cl_tm) doHdr1_pay_cl_tm_LC(info);
		else if (lc == Hdr1_pay_cl_usr_cd) doHdr1_pay_cl_usr_cd_LC(info);
		else if (lc == Hdr1_pay_cl_usr_nm) doHdr1_pay_cl_usr_nm_LC(info);
		else if (lc == Hdr1_stk_cl_ym) doHdr1_stk_cl_ym_LC(info);
		else if (lc == Hdr1_stk_cl_tm) doHdr1_stk_cl_tm_LC(info);
		else if (lc == Hdr1_stk_cl_usr_cd) doHdr1_stk_cl_usr_cd_LC(info);
		else if (lc == Hdr1_stk_cl_usr_nm) doHdr1_stk_cl_usr_nm_LC(info);
		else if (lc == Hdr1_ar_pre_cl_tm) doHdr1_ar_pre_cl_tm_LC(info);
		else if (lc == Hdr1_ar_pre_cl_usr_cd) doHdr1_ar_pre_cl_usr_cd_LC(info);
		else if (lc == Hdr1_ar_pre_cl_usr_nm) doHdr1_ar_pre_cl_usr_nm_LC(info);
		else if (lc == Hdr1_ap_pre_cl_tm) doHdr1_ap_pre_cl_tm_LC(info);
		else if (lc == Hdr1_ap_pre_cl_usr_cd) doHdr1_ap_pre_cl_usr_cd_LC(info);
		else if (lc == Hdr1_ap_pre_cl_usr_nm) doHdr1_ap_pre_cl_usr_nm_LC(info);
		else if (lc == columnArDtl_acst_cd) doArDtl_acst_cd_LC(info);
		else if (lc == columnArDtl_acst_nm) doArDtl_acst_nm_LC(info);
		else if (lc == columnArDtl_pre_cl_tm) doArDtl_pre_cl_tm_LC(info);
		else if (lc == columnArDtl_ins_usr_id) doArDtl_ins_usr_id_LC(info);
		else if (lc == columnArDtl_ins_usr_nm) doArDtl_ins_usr_nm_LC(info);
		else if (lc == columnArDtl_ins_func_id) doArDtl_ins_func_id_LC(info);
		else if (lc == columnArDtl_ins_func_nm) doArDtl_ins_func_nm_LC(info);
		else if (lc == columnArDtl_ins_ts) doArDtl_ins_ts_LC(info);
		else if (lc == columnArDtl_upd_usr_id) doArDtl_upd_usr_id_LC(info);
		else if (lc == columnArDtl_upd_usr_nm) doArDtl_upd_usr_nm_LC(info);
		else if (lc == columnArDtl_upd_func_id) doArDtl_upd_func_id_LC(info);
		else if (lc == columnArDtl_upd_func_nm) doArDtl_upd_func_nm_LC(info);
		else if (lc == columnArDtl_upd_ts) doArDtl_upd_ts_LC(info);
		else if (lc == columnArDtl_upd_srv_req_no) doArDtl_upd_srv_req_no_LC(info);
		else if (lc == columnApDtl_asppl_cd) doApDtl_asppl_cd_LC(info);
		else if (lc == columnApDtl_asppl_nm) doApDtl_asppl_nm_LC(info);
		else if (lc == columnApDtl_pre_cl_tm) doApDtl_pre_cl_tm_LC(info);
		else if (lc == columnApDtl_ins_usr_id) doApDtl_ins_usr_id_LC(info);
		else if (lc == columnApDtl_ins_usr_nm) doApDtl_ins_usr_nm_LC(info);
		else if (lc == columnApDtl_ins_func_id) doApDtl_ins_func_id_LC(info);
		else if (lc == columnApDtl_ins_func_nm) doApDtl_ins_func_nm_LC(info);
		else if (lc == columnApDtl_ins_ts) doApDtl_ins_ts_LC(info);
		else if (lc == columnApDtl_upd_usr_id) doApDtl_upd_usr_id_LC(info);
		else if (lc == columnApDtl_upd_usr_nm) doApDtl_upd_usr_nm_LC(info);
		else if (lc == columnApDtl_upd_func_id) doApDtl_upd_func_id_LC(info);
		else if (lc == columnApDtl_upd_func_nm) doApDtl_upd_func_nm_LC(info);
		else if (lc == columnApDtl_upd_ts) doApDtl_upd_ts_LC(info);
		else if (lc == columnApDtl_upd_srv_req_no) doApDtl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sls_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sls_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcv_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcv_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[stk_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_stk_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ar_pre_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ar_pre_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_pre_cl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_pre_cl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[pre_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_pre_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ArDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doArDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[pre_cl_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_pre_cl_tm_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ApDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnArDtl_acst_cd]の作成メソッド
	 */
	public MCList getArDtl_acst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnApDtl_asppl_cd]の作成メソッド
	 */
	public MCList getApDtl_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBIL0010.Srch01")) {
			return new MS_MSBIL0010_Srch01Bridge();
		}
		if (id.equals("MS.MSBIL0010.Upd01")) {
			return new MS_MSBIL0010_Upd01Bridge();
		}
		if (id.equals("MS.MSBIL0010.Upd02")) {
			return new MS_MSBIL0010_Upd02Bridge();
		}
		if (id.equals("MS.MSBIL0010.Upd03")) {
			return new MS_MSBIL0010_Upd03Bridge();
		}
		if (id.equals("MS.MSBIL0010.Upd04")) {
			return new MS_MSBIL0010_Upd04Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBIL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBIL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBIL0010_Srch01Bridge() {
			p_MS_MSBIL0010_Srch01 = new MCParam(PDef.MS_MSBIL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBIL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBI.MSBIP0010.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));

			p_MS_MSBIL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBIL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBIL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBIL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBIL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBI.MSBIP0010.CndR up0() {
			return (mcframe.clientMSBI.MSBIP0010.CndR)up(0);
		}

		protected mcframe.clientMSBI.MSBIP0010.Hdr1R down0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> down1() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> down2() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBIL0010_Srch01.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			p_MS_MSBIL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			p_MS_MSBIL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBIL0010_Srch01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBI.MSBIP0010.Hdr1R)p_MS_MSBIL0010_Srch01.getContainerParam().getDownBlock(0));
			setArDtlL((MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)p_MS_MSBIL0010_Srch01.getContainerParam().getDownBlock(1));
			setApDtlL((MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)p_MS_MSBIL0010_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getArDtlL().clear();
			getApDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getArDtlL());
			result.add(getApDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBIL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBIL0010_Upd01;

		/** コンストラクタ */
		protected MS_MSBIL0010_Upd01Bridge() {
			p_MS_MSBIL0010_Upd01 = new MCParam(PDef.MS_MSBIL0010_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBIL0010_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));

			p_MS_MSBIL0010_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBIL0010_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBIL0010_Upd01.addUpBlock(getHdr1R());
			p_MS_MSBIL0010_Upd01.addUpBlock(getArDtlL().shallowClone());
			p_MS_MSBIL0010_Upd01.addUpBlock(getApDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBIL0010_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBIL0010_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBI.MSBIP0010.Hdr1R up0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)up(0);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> up1() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> up2() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)up(2);
		}

		protected mcframe.clientMSBI.MSBIP0010.Hdr1R down0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> down1() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> down2() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBIL0010_Upd01.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			p_MS_MSBIL0010_Upd01.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			p_MS_MSBIL0010_Upd01.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBIL0010_Upd01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBI.MSBIP0010.Hdr1R)p_MS_MSBIL0010_Upd01.getContainerParam().getDownBlock(0));
			setArDtlL((MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)p_MS_MSBIL0010_Upd01.getContainerParam().getDownBlock(1));
			setApDtlL((MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)p_MS_MSBIL0010_Upd01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getArDtlL().clear();
			getApDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getArDtlL());
			result.add(getApDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getArDtlL());
			result.add(getApDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBIL0010_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBIL0010_Upd02;

		/** コンストラクタ */
		protected MS_MSBIL0010_Upd02Bridge() {
			p_MS_MSBIL0010_Upd02 = new MCParam(PDef.MS_MSBIL0010_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBIL0010_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));

			p_MS_MSBIL0010_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBIL0010_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBIL0010_Upd02.addUpBlock(getHdr1R());
			p_MS_MSBIL0010_Upd02.addUpBlock(getArDtlL().shallowClone());
			p_MS_MSBIL0010_Upd02.addUpBlock(getApDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBIL0010_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBIL0010_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBI.MSBIP0010.Hdr1R up0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)up(0);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> up1() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> up2() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)up(2);
		}

		protected mcframe.clientMSBI.MSBIP0010.Hdr1R down0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR> down1() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR> down2() {
			return (MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBIL0010_Upd02.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			p_MS_MSBIL0010_Upd02.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ArDtlR.class));
			p_MS_MSBIL0010_Upd02.addDownBlock(MCList.create(mcframe.clientMSBI.MSBIP0010.ApDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBIL0010_Upd02;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBI.MSBIP0010.Hdr1R)p_MS_MSBIL0010_Upd02.getContainerParam().getDownBlock(0));
			setArDtlL((MCList<mcframe.clientMSBI.MSBIP0010.ArDtlR>)p_MS_MSBIL0010_Upd02.getContainerParam().getDownBlock(1));
			setApDtlL((MCList<mcframe.clientMSBI.MSBIP0010.ApDtlR>)p_MS_MSBIL0010_Upd02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getArDtlL().clear();
			getApDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getArDtlL());
			result.add(getApDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getArDtlL());
			result.add(getApDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBIL0010_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBIL0010_Upd03;

		/** コンストラクタ */
		protected MS_MSBIL0010_Upd03Bridge() {
			p_MS_MSBIL0010_Upd03 = new MCParam(PDef.MS_MSBIL0010_Upd03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBIL0010_Upd03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			// Down
			param.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());

			p_MS_MSBIL0010_Upd03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBIL0010_Upd03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBIL0010_Upd03.addUpBlock(getHdr1R());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBIL0010_Upd03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBIL0010_Upd03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBI.MSBIP0010.Hdr1R up0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)up(0);
		}

		protected mcframe.clientMSBI.MSBIP0010.Hdr1R down0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBIL0010_Upd03.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
		}
		protected MCParam param() {
			return p_MS_MSBIL0010_Upd03;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBI.MSBIP0010.Hdr1R)p_MS_MSBIL0010_Upd03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdr1R().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			return result;
		}
	}
	/**
	 * [MS_MSBIL0010_Upd04]の定型処理のInnerClass
	 */
	protected class MS_MSBIL0010_Upd04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBIL0010_Upd04;

		/** コンストラクタ */
		protected MS_MSBIL0010_Upd04Bridge() {
			p_MS_MSBIL0010_Upd04 = new MCParam(PDef.MS_MSBIL0010_Upd04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBIL0010_Upd04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
			// Down
			param.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());

			p_MS_MSBIL0010_Upd04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBIL0010_Upd04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBIL0010_Upd04.addUpBlock(getHdr1R());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBIL0010_Upd04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBIL0010_Upd04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBI.MSBIP0010.Hdr1R up0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)up(0);
		}

		protected mcframe.clientMSBI.MSBIP0010.Hdr1R down0() {
			return (mcframe.clientMSBI.MSBIP0010.Hdr1R)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBIL0010_Upd04.addDownBlock(mcframe.clientMSBI.MSBIP0010.Hdr1R.create());
		}
		protected MCParam param() {
			return p_MS_MSBIL0010_Upd04;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBI.MSBIP0010.Hdr1R)p_MS_MSBIL0010_Upd04.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdr1R().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			return result;
		}
	}
}