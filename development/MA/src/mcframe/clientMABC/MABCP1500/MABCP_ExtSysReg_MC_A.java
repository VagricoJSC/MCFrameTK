package mcframe.clientMABC.MABCP1500;

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
import mcframe.clientMABC.MABCP1500.MABCP_ExtSysReg_MC.MA_MABCL1500_Srch01Caller;
import mcframe.clientMABC.MABCP1500.MABCP_ExtSysReg_MC.MA_MABCL1500_Upd01Caller;
import mcframe.clientMABC.MABCP1500.MABCP_ExtSysReg_MC.MA_MABCL1500_Del01Caller;

/**
 * 画面"MABCP_ExtSysReg"パネルクラスです。<p>
 *
 * 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_ExtSysReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP1500";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1500.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm_lcl = null;
	/**
	 * Standard external system name 標準外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
	/**
	 * External system type 外部システム区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_typ = null;
	/**
	 * External system type name 外部システム区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_typ_nm = null;
	/**
	 * Web API Ｗｅｂ　ＡＰＩ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_web_api_flg = null;
	/**
	 * Command execution コマンド実行.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cmd_exec_flg = null;
	/**
	 * Real time import リアルタイム取込.<p>
	 *
	 */
	public MCColumnConfig columnDtl_real_imp_flg = null;
	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_send_upd_flg = null;
	/**
	 * Do not allow duplicate import 重複取込不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_dup_imp_flg = null;
	/**
	 * IF update type ＩＦ更新区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_upd_typ = null;
	/**
	 * IF update type name ＩＦ更新区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_upd_typ_nm = null;
	/**
	 * Delivery note unit split 納品書単位分割.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_split_flg = null;
	/**
	 * NULL character IF ＮＵＬＬ文字ＩＦ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_null_val_if_flg = null;
	/**
	 * Not for unit price check 単価チェック対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upri_not_chk_flg = null;
	/**
	 * Not for amount check 金額チェック対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_not_chk_flg = null;
	/**
	 * Not for tax check 税チェック対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tax_not_chk_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [BLTab]ブロック関連のField定義
	public MCPanel BLTabPanel = null;
	public MCTabbedPane BLTabTab = null;
	// [BLTab]ブロックの項目のField定義
	// [ProtoPanel]ブロック関連のField定義
	public MCPanel ProtoPanelPanel = null;
	// [ProtoPanel]ブロックの項目のField定義
	// [ProtoDtl]ブロック関連のField定義
	public MCPanel ProtoDtlPanel = null;
	public MCScrollPane ProtoDtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1500.ProtoDtlR> ProtoDtlTable = null;
	// [ProtoDtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_del_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_ext_sys_cd = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_if_proc_typ_nm = null;
	/**
	 * IF control type ＩＦ制御区分.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_if_ctl_typ = null;
	/**
	 * IF control type name ＩＦ制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_if_ctl_typ_nm = null;
	/**
	 * Content (String) 内容（文字列）.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_var_str = null;
	/**
	 * Content (Numeric) 内容（数値）.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_var_num = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnProtoDtl_del_ts = null;
	// [ProtoDtlBtn]ブロック関連のField定義
	public MCPanel ProtoDtlBtnPanel = null;
	// [ProtoDtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton ProtoDtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton ProtoDtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton ProtoDtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton ProtoDtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton ProtoDtlBtn_rcopy = null;
	// [AdapPanel]ブロック関連のField定義
	public MCPanel AdapPanelPanel = null;
	// [AdapPanel]ブロックの項目のField定義
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField BulkSet_st_dt = null;
	public MCLabel BulkSet_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField BulkSet_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton BulkSet_set_dt = null;
	// [AdapDtl]ブロック関連のField定義
	public MCPanel AdapDtlPanel = null;
	public MCScrollPane AdapDtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1500.AdapDtlR> AdapDtlTable = null;
	// [AdapDtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_del_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_ext_sys_cd = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_if_proc_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D AdapDtl_dt_p_PPanel;
	public MCColumnConfig columnAdapDtl_st_dt_key;// [AdapDtl]の[dt_p.st_dt_key]を[columnAdapDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnAdapDtl_st_dt;// [AdapDtl]の[dt_p.st_dt]を[columnAdapDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnAdapDtl_end_dt;// [AdapDtl]の[dt_p.end_dt]を[columnAdapDtl_end_dt]としてエイリアス定義。
	/**
	 * Code convert operation コード変換オペレーション.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_conv_ope = null;
	/**
	 * File I/O operations ファイル入出力オペレーション.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_file_io_ope = null;
	/**
	 * Web API operation Ｗｅｂ　ＡＰＩオペレーション.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_web_api_ope = null;
	/**
	 * Command execution operation コマンド実行オペレーション.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_cmd_exec_ope = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnAdapDtl_del_ts = null;
	// [AdapDtlBtn]ブロック関連のField定義
	public MCPanel AdapDtlBtnPanel = null;
	// [AdapDtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton AdapDtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton AdapDtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton AdapDtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton AdapDtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton AdapDtlBtn_rcopy = null;
	// [HttpHeaderPanel]ブロック関連のField定義
	public MCPanel HttpHeaderPanelPanel = null;
	// [HttpHeaderPanel]ブロックの項目のField定義
	// [HttpHeaderDtl]ブロック関連のField定義
	public MCPanel HttpHeaderDtlPanel = null;
	public MCScrollPane HttpHeaderDtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> HttpHeaderDtlTable = null;
	// [HttpHeaderDtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_del_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_ext_sys_cd = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_if_proc_typ_nm = null;
	/**
	 * HTTP header name ＨＴＴＰヘッダ名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_http_header_nm = null;
	/**
	 * HTTP header value ＨＴＴＰヘッダ値.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_http_header_val = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnHttpHeaderDtl_del_ts = null;
	// [HttpHeaderDtlBtn]ブロック関連のField定義
	public MCPanel HttpHeaderDtlBtnPanel = null;
	// [HttpHeaderDtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton HttpHeaderDtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton HttpHeaderDtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton HttpHeaderDtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton HttpHeaderDtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton HttpHeaderDtlBtn_rcopy = null;
	// [ExtSysUsrPanel]ブロック関連のField定義
	public MCPanel ExtSysUsrPanelPanel = null;
	// [ExtSysUsrPanel]ブロックの項目のField定義
	// [ExtSysUsrDtl]ブロック関連のField定義
	public MCPanel ExtSysUsrDtlPanel = null;
	public MCScrollPane ExtSysUsrDtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> ExtSysUsrDtlTable = null;
	// [ExtSysUsrDtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_del_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_cd = null;
	/**
	 * User cd. ユーザＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_usr_cd = null;
	/**
	 * User name ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_usr_nm = null;
	/**
	 * External system user cd. 外部システムユーザＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_usr_cd = null;
	/**
	 * External system password 外部システムパスワード.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_pass = null;
	/**
	 * External system connection info. 1 外部システム接続情報１.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_str1 = null;
	/**
	 * External system connection info. 2 外部システム接続情報２.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_str2 = null;
	/**
	 * External system connection info. 3 外部システム接続情報３.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_str3 = null;
	/**
	 * External system connection info. 4 外部システム接続情報４.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_str4 = null;
	/**
	 * External system connection info. 5 外部システム接続情報５.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ext_sys_str5 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnExtSysUsrDtl_del_ts = null;
	// [ExtSysUsrDtlBtn]ブロック関連のField定義
	public MCPanel ExtSysUsrDtlBtnPanel = null;
	// [ExtSysUsrDtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton ExtSysUsrDtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton ExtSysUsrDtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton ExtSysUsrDtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton ExtSysUsrDtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton ExtSysUsrDtlBtn_rcopy = null;
	// [LclPanel]ブロック関連のField定義
	public MCPanel LclPanelPanel = null;
	// [LclPanel]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1500.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ext_sys_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ext_sys_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	// [ProtoL]ブロック関連のField定義
	public MCPanel ProtoLPanel = null;
	// [ProtoL]ブロックの項目のField定義
	// [ProtoLPanel]ブロック関連のField定義
	public MCPanel ProtoLPanelPanel = null;
	// [ProtoLPanel]ブロックの項目のField定義
	// [Rarea]ブロック関連のField定義
	public MCPanel RareaPanel = null;
	// [Rarea]ブロックの項目のField定義
	/**
	 * IF control type name ＩＦ制御区分名.<p>
	 *
	 */
	public MCLabel Rarea_if_ctl_typ_nm_lab = null;
	public MCScrollPane Rarea_if_ctl_typ_nmScrollPane = null;
	/**
	 * IF control type name ＩＦ制御区分名.<p>
	 *
	 */
	public MCTextArea Rarea_if_ctl_typ_nm = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL1500_Srch01]のCallerの作成 */
	protected MABCP_ExtSysReg_MC.MA_MABCL1500_Srch01Caller createMA_MABCL1500_Srch01() {
		MABCP_ExtSysReg_MC.MA_MABCL1500_Srch01Caller<MABCP_ExtSysReg, MA_MABCL1500_Srch01Bridge>
		caller = ((MABCP_ExtSysReg_MC)this).new MA_MABCL1500_Srch01Caller<MABCP_ExtSysReg, MA_MABCL1500_Srch01Bridge>(
					(MABCP_ExtSysReg)this, new MA_MABCL1500_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL1500_Srch01]の呼び出し */
	protected void callMA_MABCL1500_Srch01() {
		MCCaller caller = createMA_MABCL1500_Srch01();
		caller.exec();
	}
	/** [MA_MABCL1500_Upd01]のCallerの作成 */
	protected MABCP_ExtSysReg_MC.MA_MABCL1500_Upd01Caller createMA_MABCL1500_Upd01() {
		MABCP_ExtSysReg_MC.MA_MABCL1500_Upd01Caller<MABCP_ExtSysReg, MA_MABCL1500_Upd01Bridge>
		caller = ((MABCP_ExtSysReg_MC)this).new MA_MABCL1500_Upd01Caller<MABCP_ExtSysReg, MA_MABCL1500_Upd01Bridge>(
					(MABCP_ExtSysReg)this, new MA_MABCL1500_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL1500_Upd01]の呼び出し */
	protected void callMA_MABCL1500_Upd01() {
		MCCaller caller = createMA_MABCL1500_Upd01();
		caller.exec();
	}
	/** [MA_MABCL1500_Del01]のCallerの作成 */
	protected MABCP_ExtSysReg_MC.MA_MABCL1500_Del01Caller createMA_MABCL1500_Del01() {
		MABCP_ExtSysReg_MC.MA_MABCL1500_Del01Caller<MABCP_ExtSysReg, MA_MABCL1500_Del01Bridge>
		caller = ((MABCP_ExtSysReg_MC)this).new MA_MABCL1500_Del01Caller<MABCP_ExtSysReg, MA_MABCL1500_Del01Bridge>(
					(MABCP_ExtSysReg)this, new MA_MABCL1500_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL1500_Del01]の呼び出し */
	protected void callMA_MABCL1500_Del01() {
		MCCaller caller = createMA_MABCL1500_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1500.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1500.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.DtlR> aDtlL;
	/** [ProtoDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> aProtoDtlL;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1500.BulkSetR aBulkSetR;
	/** [AdapDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> aAdapDtlL;
	/** [HttpHeaderDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> aHttpHeaderDtlL;
	/** [ExtSysUsrDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> aExtSysUsrDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.LclR> aLclL;
	/** [Rarea]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1500.RareaR aRareaR;
	/** [ProtoAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> aProtoAllL;
	/** [AdapAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> aAdapAllL;
	/** [HttpHeaderAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> aHttpHeaderAllL;
	/** [ExtSysUsrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> aExtSysUsrAllL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1500.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP1500.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1500.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1500.MstR createMstR() {
		return mcframe.clientMABC.MABCP1500.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP1500.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1500.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1500.CndR createCndR() {
		return mcframe.clientMABC.MABCP1500.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP1500.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP1500.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP1500.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaProtoDtlLを設定します。
	 *
	 * aProtoDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ProtoDtlL
	 */
	public void setProtoDtlL(MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> aList) {
		if (getProtoDtlL() != aList) {
			getProtoDtlL().setAll(aList);
		}
	}

	/**
	 * [ProtoDtl]ブロックのコンテナaProtoDtlLを返します。
	 *
	 * @return ProtoDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> getProtoDtlL() {
		return aProtoDtlL;
	}

	/**
	 * aProtoDtlRを作成します。
	 *
	 * @return ProtoDtlR
	 */
	public mcframe.clientMABC.MABCP1500.ProtoDtlR createProtoDtlR() {
		return mcframe.clientMABC.MABCP1500.ProtoDtlR.create();
	}

	/**
	 * aProtoDtlLを作成します。
	 *
	 * @return ProtoDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> createProtoDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.ProtoDtlR.class);
	}

	/**
	 * ProtoDtlTableを初期化します。
	 */
	protected void createProtoDtlTable(){
		if(ProtoDtlTable == null){
			ProtoDtlTable = beansFactory.createTable2("ProtoDtl.table");
		}
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABC.MABCP1500.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABC.MABCP1500.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABC.MABCP1500.BulkSetR createBulkSetR() {
		return mcframe.clientMABC.MABCP1500.BulkSetR.create();
	}

	/**
	 * コピーによってaAdapDtlLを設定します。
	 *
	 * aAdapDtlLのインスタンスは変更されません。
	 *
	 * @param dataset AdapDtlL
	 */
	public void setAdapDtlL(MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> aList) {
		if (getAdapDtlL() != aList) {
			getAdapDtlL().setAll(aList);
		}
	}

	/**
	 * [AdapDtl]ブロックのコンテナaAdapDtlLを返します。
	 *
	 * @return AdapDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> getAdapDtlL() {
		return aAdapDtlL;
	}

	/**
	 * aAdapDtlRを作成します。
	 *
	 * @return AdapDtlR
	 */
	public mcframe.clientMABC.MABCP1500.AdapDtlR createAdapDtlR() {
		return mcframe.clientMABC.MABCP1500.AdapDtlR.create();
	}

	/**
	 * aAdapDtlLを作成します。
	 *
	 * @return AdapDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> createAdapDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.AdapDtlR.class);
	}

	/**
	 * AdapDtlTableを初期化します。
	 */
	protected void createAdapDtlTable(){
		if(AdapDtlTable == null){
			AdapDtlTable = beansFactory.createTable2("AdapDtl.table");
		}
	}

	/**
	 * コピーによってaHttpHeaderDtlLを設定します。
	 *
	 * aHttpHeaderDtlLのインスタンスは変更されません。
	 *
	 * @param dataset HttpHeaderDtlL
	 */
	public void setHttpHeaderDtlL(MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> aList) {
		if (getHttpHeaderDtlL() != aList) {
			getHttpHeaderDtlL().setAll(aList);
		}
	}

	/**
	 * [HttpHeaderDtl]ブロックのコンテナaHttpHeaderDtlLを返します。
	 *
	 * @return HttpHeaderDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> getHttpHeaderDtlL() {
		return aHttpHeaderDtlL;
	}

	/**
	 * aHttpHeaderDtlRを作成します。
	 *
	 * @return HttpHeaderDtlR
	 */
	public mcframe.clientMABC.MABCP1500.HttpHeaderDtlR createHttpHeaderDtlR() {
		return mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.create();
	}

	/**
	 * aHttpHeaderDtlLを作成します。
	 *
	 * @return HttpHeaderDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> createHttpHeaderDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.class);
	}

	/**
	 * HttpHeaderDtlTableを初期化します。
	 */
	protected void createHttpHeaderDtlTable(){
		if(HttpHeaderDtlTable == null){
			HttpHeaderDtlTable = beansFactory.createTable2("HttpHeaderDtl.table");
		}
	}

	/**
	 * コピーによってaExtSysUsrDtlLを設定します。
	 *
	 * aExtSysUsrDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ExtSysUsrDtlL
	 */
	public void setExtSysUsrDtlL(MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> aList) {
		if (getExtSysUsrDtlL() != aList) {
			getExtSysUsrDtlL().setAll(aList);
		}
	}

	/**
	 * [ExtSysUsrDtl]ブロックのコンテナaExtSysUsrDtlLを返します。
	 *
	 * @return ExtSysUsrDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> getExtSysUsrDtlL() {
		return aExtSysUsrDtlL;
	}

	/**
	 * aExtSysUsrDtlRを作成します。
	 *
	 * @return ExtSysUsrDtlR
	 */
	public mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR createExtSysUsrDtlR() {
		return mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.create();
	}

	/**
	 * aExtSysUsrDtlLを作成します。
	 *
	 * @return ExtSysUsrDtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> createExtSysUsrDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.class);
	}

	/**
	 * ExtSysUsrDtlTableを初期化します。
	 */
	protected void createExtSysUsrDtlTable(){
		if(ExtSysUsrDtlTable == null){
			ExtSysUsrDtlTable = beansFactory.createTable2("ExtSysUsrDtl.table");
		}
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP1500.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP1500.LclR createLclR() {
		return mcframe.clientMABC.MABCP1500.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * 項目コピーによってaRareaRを設定します。
	 *
	 * aRareaRのインスタンスは変更されません。
	 *
	 * @param row RareaR
	 */
	public void setRareaR(mcframe.clientMABC.MABCP1500.RareaR row) {
		if (row != null) {
			MCRow.copyall(getRareaR(), row);
		}
	}

	/**
	 * [Rarea]ブロックのコンテナaRareaRを返します。
	 *
	 * @return RareaR
	 */
	public mcframe.clientMABC.MABCP1500.RareaR getRareaR() {
		return aRareaR;
	}

	/**
	 * aRareaRを作成します。
	 *
	 * @return RareaR
	 */
	public mcframe.clientMABC.MABCP1500.RareaR createRareaR() {
		return mcframe.clientMABC.MABCP1500.RareaR.create();
	}

	/**
	 * コピーによってaProtoAllLを設定します。
	 *
	 * aProtoAllLのインスタンスは変更されません。
	 *
	 * @param dataset ProtoAllL
	 */
	public void setProtoAllL(MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> aList) {
		if (getProtoAllL() != aList) {
			getProtoAllL().setAll(aList);
		}
	}

	/**
	 * [ProtoAll]ブロックのコンテナaProtoAllLを返します。
	 *
	 * @return ProtoAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> getProtoAllL() {
		return aProtoAllL;
	}

	/**
	 * aProtoAllRを作成します。
	 *
	 * @return ProtoAllR
	 */
	public mcframe.clientMABC.MABCP1500.ProtoDtlR createProtoAllR() {
		return mcframe.clientMABC.MABCP1500.ProtoDtlR.create();
	}

	/**
	 * aProtoAllLを作成します。
	 *
	 * @return ProtoAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> createProtoAllL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.ProtoDtlR.class);
	}

	/**
	 * コピーによってaAdapAllLを設定します。
	 *
	 * aAdapAllLのインスタンスは変更されません。
	 *
	 * @param dataset AdapAllL
	 */
	public void setAdapAllL(MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> aList) {
		if (getAdapAllL() != aList) {
			getAdapAllL().setAll(aList);
		}
	}

	/**
	 * [AdapAll]ブロックのコンテナaAdapAllLを返します。
	 *
	 * @return AdapAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> getAdapAllL() {
		return aAdapAllL;
	}

	/**
	 * aAdapAllRを作成します。
	 *
	 * @return AdapAllR
	 */
	public mcframe.clientMABC.MABCP1500.AdapDtlR createAdapAllR() {
		return mcframe.clientMABC.MABCP1500.AdapDtlR.create();
	}

	/**
	 * aAdapAllLを作成します。
	 *
	 * @return AdapAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> createAdapAllL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.AdapDtlR.class);
	}

	/**
	 * コピーによってaHttpHeaderAllLを設定します。
	 *
	 * aHttpHeaderAllLのインスタンスは変更されません。
	 *
	 * @param dataset HttpHeaderAllL
	 */
	public void setHttpHeaderAllL(MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> aList) {
		if (getHttpHeaderAllL() != aList) {
			getHttpHeaderAllL().setAll(aList);
		}
	}

	/**
	 * [HttpHeaderAll]ブロックのコンテナaHttpHeaderAllLを返します。
	 *
	 * @return HttpHeaderAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> getHttpHeaderAllL() {
		return aHttpHeaderAllL;
	}

	/**
	 * aHttpHeaderAllRを作成します。
	 *
	 * @return HttpHeaderAllR
	 */
	public mcframe.clientMABC.MABCP1500.HttpHeaderDtlR createHttpHeaderAllR() {
		return mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.create();
	}

	/**
	 * aHttpHeaderAllLを作成します。
	 *
	 * @return HttpHeaderAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> createHttpHeaderAllL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.class);
	}

	/**
	 * コピーによってaExtSysUsrAllLを設定します。
	 *
	 * aExtSysUsrAllLのインスタンスは変更されません。
	 *
	 * @param dataset ExtSysUsrAllL
	 */
	public void setExtSysUsrAllL(MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> aList) {
		if (getExtSysUsrAllL() != aList) {
			getExtSysUsrAllL().setAll(aList);
		}
	}

	/**
	 * [ExtSysUsrAll]ブロックのコンテナaExtSysUsrAllLを返します。
	 *
	 * @return ExtSysUsrAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> getExtSysUsrAllL() {
		return aExtSysUsrAllL;
	}

	/**
	 * aExtSysUsrAllRを作成します。
	 *
	 * @return ExtSysUsrAllR
	 */
	public mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR createExtSysUsrAllR() {
		return mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.create();
	}

	/**
	 * aExtSysUsrAllLを作成します。
	 *
	 * @return ExtSysUsrAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> createExtSysUsrAllL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.class);
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP1500.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP1500.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP1500.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1500.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP1500.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getProtoDtlL())) ret.add(getProtoDtlL());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getAdapDtlL())) ret.add(getAdapDtlL());
		if(!MCCollectionUtil.contains(ret, getHttpHeaderDtlL())) ret.add(getHttpHeaderDtlL());
		if(!MCCollectionUtil.contains(ret, getExtSysUsrDtlL())) ret.add(getExtSysUsrDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getRareaR())) ret.add(getRareaR());
		if(!MCCollectionUtil.contains(ret, getProtoAllL())) ret.add(getProtoAllL());
		if(!MCCollectionUtil.contains(ret, getAdapAllL())) ret.add(getAdapAllL());
		if(!MCCollectionUtil.contains(ret, getHttpHeaderAllL())) ret.add(getHttpHeaderAllL());
		if(!MCCollectionUtil.contains(ret, getExtSysUsrAllL())) ret.add(getExtSysUsrAllL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getProtoDtlL()) return "ProtoDtl";
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getAdapDtlL()) return "AdapDtl";
		if(aCnt == getHttpHeaderDtlL()) return "HttpHeaderDtl";
		if(aCnt == getExtSysUsrDtlL()) return "ExtSysUsrDtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getRareaR()) return "Rarea";
		if(aCnt == getProtoAllL()) return "ProtoAll";
		if(aCnt == getAdapAllL()) return "AdapAll";
		if(aCnt == getHttpHeaderAllL()) return "HttpHeaderAll";
		if(aCnt == getExtSysUsrAllL()) return "ExtSysUsrAll";
		if(aCnt == getLclAllL()) return "LclAll";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("ProtoDtl")) return getProtoDtlL();
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("AdapDtl")) return getAdapDtlL();
		if(bId.equals("HttpHeaderDtl")) return getHttpHeaderDtlL();
		if(bId.equals("ExtSysUsrDtl")) return getExtSysUsrDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("Rarea")) return getRareaR();
		if(bId.equals("ProtoAll")) return getProtoAllL();
		if(bId.equals("AdapAll")) return getAdapAllL();
		if(bId.equals("HttpHeaderAll")) return getHttpHeaderAllL();
		if(bId.equals("ExtSysUsrAll")) return getExtSysUsrAllL();
		if(bId.equals("LclAll")) return getLclAllL();
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
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(BLTabPanel);
		ret.add(ProtoPanelPanel);
		ret.add(ProtoDtlPanel);
		ret.add(ProtoDtlBtnPanel);
		ret.add(AdapPanelPanel);
		ret.add(BulkSetPanel);
		ret.add(AdapDtlPanel);
		ret.add(AdapDtlBtnPanel);
		ret.add(HttpHeaderPanelPanel);
		ret.add(HttpHeaderDtlPanel);
		ret.add(HttpHeaderDtlBtnPanel);
		ret.add(ExtSysUsrPanelPanel);
		ret.add(ExtSysUsrDtlPanel);
		ret.add(ExtSysUsrDtlBtnPanel);
		ret.add(LclPanelPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		ret.add(ProtoLPanel);
		ret.add(ProtoLPanelPanel);
		ret.add(RareaPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ExtSysReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aProtoDtlL = createProtoDtlL();
		aBulkSetR = createBulkSetR();
		aAdapDtlL = createAdapDtlL();
		aHttpHeaderDtlL = createHttpHeaderDtlL();
		aExtSysUsrDtlL = createExtSysUsrDtlL();
		aLclL = createLclL();
		aRareaR = createRareaR();
		aProtoAllL = createProtoAllL();
		aAdapAllL = createAdapAllL();
		aHttpHeaderAllL = createHttpHeaderAllL();
		aExtSysUsrAllL = createExtSysUsrAllL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_ExtSysReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aProtoDtlL = createProtoDtlL();
		createProtoDtlTable();
		ProtoDtlTable.setRowName(name);
		aBulkSetR = createBulkSetR();
		aAdapDtlL = createAdapDtlL();
		createAdapDtlTable();
		AdapDtlTable.setRowName(name);
		aHttpHeaderDtlL = createHttpHeaderDtlL();
		createHttpHeaderDtlTable();
		HttpHeaderDtlTable.setRowName(name);
		aExtSysUsrDtlL = createExtSysUsrDtlL();
		createExtSysUsrDtlTable();
		ExtSysUsrDtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aRareaR = createRareaR();
		aProtoAllL = createProtoAllL();
		aAdapAllL = createAdapAllL();
		aHttpHeaderAllL = createHttpHeaderAllL();
		aExtSysUsrAllL = createExtSysUsrAllL();
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_ExtSysReg_MC.jbCreateScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateMst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateTop((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateFold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateCnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateCtrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateLclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateBLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateAdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateBulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateAdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateAdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateHttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateHttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateHttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateLclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateLcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateLclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateEastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbCreateRarea((MABCP_ExtSysReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_ExtSysReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_ExtSysReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_ExtSysReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_ExtSysReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_ExtSysReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_ExtSysReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_ExtSysReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_ExtSysReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_ExtSysReg p) {
	}

	/**
	 * [BLTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBLTab(MABCP_ExtSysReg p) {
	}

	/**
	 * [ProtoPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProtoPanel(MABCP_ExtSysReg p) {
	}

	/**
	 * [ProtoDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProtoDtl(MABCP_ExtSysReg p) {
	}

	/**
	 * [ProtoDtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProtoDtlBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [AdapPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdapPanel(MABCP_ExtSysReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABCP_ExtSysReg p) {
	}

	/**
	 * [AdapDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdapDtl(MABCP_ExtSysReg p) {
		p.AdapDtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP1500.AdapDtlR.$dt_p);
		p.AdapDtl_dt_p_PPanel.setName("AdapDtl.dt_p");
		p.columnAdapDtl_st_dt_key = p.AdapDtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnAdapDtl_st_dt_key.addAliasName("AdapDtl.st_dt_key", p);
		p.columnAdapDtl_st_dt = p.AdapDtl_dt_p_PPanel.columnDt_st_dt;
		p.columnAdapDtl_st_dt.addAliasName("AdapDtl.st_dt", p);
		p.columnAdapDtl_end_dt = p.AdapDtl_dt_p_PPanel.columnDt_end_dt;
		p.columnAdapDtl_end_dt.addAliasName("AdapDtl.end_dt", p);
	}

	/**
	 * [AdapDtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAdapDtlBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [HttpHeaderPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHttpHeaderPanel(MABCP_ExtSysReg p) {
	}

	/**
	 * [HttpHeaderDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHttpHeaderDtl(MABCP_ExtSysReg p) {
	}

	/**
	 * [HttpHeaderDtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHttpHeaderDtlBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [ExtSysUsrPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExtSysUsrPanel(MABCP_ExtSysReg p) {
	}

	/**
	 * [ExtSysUsrDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExtSysUsrDtl(MABCP_ExtSysReg p) {
	}

	/**
	 * [ExtSysUsrDtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateExtSysUsrDtlBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [LclPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclPanel(MABCP_ExtSysReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_ExtSysReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_ExtSysReg p) {
	}

	/**
	 * [ProtoL]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProtoL(MABCP_ExtSysReg p) {
	}

	/**
	 * [ProtoLPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProtoLPanel(MABCP_ExtSysReg p) {
	}

	/**
	 * [Rarea]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRarea(MABCP_ExtSysReg p) {
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

	
	/** [Cnd_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ext_sys_cd_p = null;

	/**
	 * [Cnd_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ext_sys_cd_ListPutter() {
		if (Cnd_ext_sys_cd_p == null) {
			Cnd_ext_sys_cd_p = createCnd_ext_sys_cd_ListPutter(Cnd_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Cnd_ext_sys_cd_p;
	}
	
	
	/** [Dtl_ext_sys_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ext_sys_typ_p = null;

	/**
	 * [Dtl_ext_sys_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ext_sys_typ_ListPutter() {
		if (Dtl_ext_sys_typ_p == null) {
			Dtl_ext_sys_typ_p = createDtl_ext_sys_typ_ListPutter(columnDtl_ext_sys_typ, "ext_sys_typ", "ext_sys_typ_nm");

		}
		return Dtl_ext_sys_typ_p;
	}
	
	
	/** [Dtl_if_upd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_if_upd_typ_p = null;

	/**
	 * [Dtl_if_upd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_if_upd_typ_ListPutter() {
		if (Dtl_if_upd_typ_p == null) {
			Dtl_if_upd_typ_p = createDtl_if_upd_typ_ListPutter(columnDtl_if_upd_typ, "if_upd_typ", "if_upd_typ_nm");

		}
		return Dtl_if_upd_typ_p;
	}
	
	
	/** [ProtoDtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter ProtoDtl_if_proc_typ_p = null;

	/**
	 * [ProtoDtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getProtoDtl_if_proc_typ_ListPutter() {
		if (ProtoDtl_if_proc_typ_p == null) {
			ProtoDtl_if_proc_typ_p = createProtoDtl_if_proc_typ_ListPutter(columnProtoDtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return ProtoDtl_if_proc_typ_p;
	}
	
	
	/** [ProtoDtl_if_ctl_typ_ListPutter]の定義 */
	private MCListPutter ProtoDtl_if_ctl_typ_p = null;

	/**
	 * [ProtoDtl_if_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getProtoDtl_if_ctl_typ_ListPutter() {
		if (ProtoDtl_if_ctl_typ_p == null) {
			ProtoDtl_if_ctl_typ_p = createProtoDtl_if_ctl_typ_ListPutter(columnProtoDtl_if_ctl_typ, "if_ctl_typ", "if_ctl_typ_nm");

		}
		return ProtoDtl_if_ctl_typ_p;
	}
	
	
	/** [AdapDtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter AdapDtl_if_proc_typ_p = null;

	/**
	 * [AdapDtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getAdapDtl_if_proc_typ_ListPutter() {
		if (AdapDtl_if_proc_typ_p == null) {
			AdapDtl_if_proc_typ_p = createAdapDtl_if_proc_typ_ListPutter(columnAdapDtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return AdapDtl_if_proc_typ_p;
	}
	
	
	/** [HttpHeaderDtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter HttpHeaderDtl_if_proc_typ_p = null;

	/**
	 * [HttpHeaderDtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getHttpHeaderDtl_if_proc_typ_ListPutter() {
		if (HttpHeaderDtl_if_proc_typ_p == null) {
			HttpHeaderDtl_if_proc_typ_p = createHttpHeaderDtl_if_proc_typ_ListPutter(columnHttpHeaderDtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return HttpHeaderDtl_if_proc_typ_p;
	}
	
	
	/** [ExtSysUsrDtl_usr_cd_ListPutter]の定義 */
	private MCListPutter ExtSysUsrDtl_usr_cd_p = null;

	/**
	 * [ExtSysUsrDtl_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getExtSysUsrDtl_usr_cd_ListPutter() {
		if (ExtSysUsrDtl_usr_cd_p == null) {
			ExtSysUsrDtl_usr_cd_p = createExtSysUsrDtl_usr_cd_ListPutter(columnExtSysUsrDtl_usr_cd, "usr_cd", "usr_nm");

		}
		return ExtSysUsrDtl_usr_cd_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ExtSysReg create(){
		MABCP_ExtSysReg p = new MABCP_ExtSysReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ExtSysReg create(String name){
		MABCP_ExtSysReg p = new MABCP_ExtSysReg(name);
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
		MABCP_ExtSysReg_MC.jbfInitScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitMst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitTop((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitFold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitCnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitCtrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitLclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitBLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitAdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitBulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitAdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitAdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitHttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitHttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitHttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitLclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitLcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitLclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitEastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbfInitRarea((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitMst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitTop((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitFold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitCnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitCtrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitLclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitBLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitAdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitBulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitAdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitAdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitHttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitHttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitHttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitLclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitLcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitLclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitEastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.jbInitRarea((MABCP_ExtSysReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextComboBox("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm_lcl = p.beansFactory.createTableColumn("Dtl.ext_sys_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_ext_sys_typ = p.beansFactory.createTableColumn("Dtl.ext_sys_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ext_sys_typ_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_typ_nm", MCColumnType.TEXT);
		p.columnDtl_web_api_flg = p.beansFactory.createTableColumn("Dtl.web_api_flg", MCColumnType.CHECK);
		p.columnDtl_cmd_exec_flg = p.beansFactory.createTableColumn("Dtl.cmd_exec_flg", MCColumnType.CHECK);
		p.columnDtl_real_imp_flg = p.beansFactory.createTableColumn("Dtl.real_imp_flg", MCColumnType.CHECK);
		p.columnDtl_not_send_upd_flg = p.beansFactory.createTableColumn("Dtl.not_send_upd_flg", MCColumnType.CHECK);
		p.columnDtl_not_dup_imp_flg = p.beansFactory.createTableColumn("Dtl.not_dup_imp_flg", MCColumnType.CHECK);
		p.columnDtl_if_upd_typ = p.beansFactory.createTableColumn("Dtl.if_upd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_if_upd_typ_nm = p.beansFactory.createTableColumn("Dtl.if_upd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_split_flg = p.beansFactory.createTableColumn("Dtl.dlv_slip_split_flg", MCColumnType.CHECK);
		p.columnDtl_null_val_if_flg = p.beansFactory.createTableColumn("Dtl.null_val_if_flg", MCColumnType.CHECK);
		p.columnDtl_upri_not_chk_flg = p.beansFactory.createTableColumn("Dtl.upri_not_chk_flg", MCColumnType.CHECK);
		p.columnDtl_amt_not_chk_flg = p.beansFactory.createTableColumn("Dtl.amt_not_chk_flg", MCColumnType.CHECK);
		p.columnDtl_tax_not_chk_flg = p.beansFactory.createTableColumn("Dtl.tax_not_chk_flg", MCColumnType.CHECK);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [BLTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBLTab(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.BLTabPanel = p.beansFactory.createPanel("BLTab");
		p.BLTabTab = p.beansFactory.createTabbedPane("BLTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [ProtoPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProtoPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoPanelPanel = p.beansFactory.createPanel("ProtoPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [ProtoDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProtoDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoDtlPanel = p.beansFactory.createPanel("ProtoDtl");
		p.ProtoDtlScrollPane = p.beansFactory.createScrollPane("ProtoDtl.scroll");
		p.createProtoDtlTable();
		// ブロックの項目の初期化
		p.columnProtoDtl_check = p.beansFactory.createTableColumn("ProtoDtl.check", MCColumnType.CHECK);
		p.columnProtoDtl_del_flg = p.beansFactory.createTableColumn("ProtoDtl.del_flg", MCColumnType.CHECK);
		p.columnProtoDtl_ext_sys_cd = p.beansFactory.createTableColumn("ProtoDtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnProtoDtl_if_proc_typ = p.beansFactory.createTableColumn("ProtoDtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnProtoDtl_if_proc_typ_nm = p.beansFactory.createTableColumn("ProtoDtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnProtoDtl_if_ctl_typ = p.beansFactory.createTableColumn("ProtoDtl.if_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnProtoDtl_if_ctl_typ_nm = p.beansFactory.createTableColumn("ProtoDtl.if_ctl_typ_nm", MCColumnType.TEXT);
		p.columnProtoDtl_var_str = p.beansFactory.createTableColumn("ProtoDtl.var_str", MCColumnType.TEXT);
		p.columnProtoDtl_var_num = p.beansFactory.createTableColumn("ProtoDtl.var_num", MCColumnType.NUMBER);
		p.columnProtoDtl_memo1 = p.beansFactory.createTableColumn("ProtoDtl.memo1", MCColumnType.TEXT);
		p.columnProtoDtl_memo2 = p.beansFactory.createTableColumn("ProtoDtl.memo2", MCColumnType.TEXT);
		p.columnProtoDtl_memo3 = p.beansFactory.createTableColumn("ProtoDtl.memo3", MCColumnType.TEXT);
		p.columnProtoDtl_ins_usr_id = p.beansFactory.createTableColumn("ProtoDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnProtoDtl_ins_usr_nm = p.beansFactory.createTableColumn("ProtoDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnProtoDtl_ins_ts = p.beansFactory.createTableColumn("ProtoDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnProtoDtl_ins_func_id = p.beansFactory.createTableColumn("ProtoDtl.ins_func_id", MCColumnType.TEXT);
		p.columnProtoDtl_ins_func_nm = p.beansFactory.createTableColumn("ProtoDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnProtoDtl_upd_cntr = p.beansFactory.createTableColumn("ProtoDtl.upd_cntr", MCColumnType.NUMBER);
		p.columnProtoDtl_upd_usr_id = p.beansFactory.createTableColumn("ProtoDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnProtoDtl_upd_usr_nm = p.beansFactory.createTableColumn("ProtoDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnProtoDtl_upd_ts = p.beansFactory.createTableColumn("ProtoDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnProtoDtl_upd_func_id = p.beansFactory.createTableColumn("ProtoDtl.upd_func_id", MCColumnType.TEXT);
		p.columnProtoDtl_upd_func_nm = p.beansFactory.createTableColumn("ProtoDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnProtoDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ProtoDtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnProtoDtl_del_usr_id = p.beansFactory.createTableColumn("ProtoDtl.del_usr_id", MCColumnType.TEXT);
		p.columnProtoDtl_del_usr_nm = p.beansFactory.createTableColumn("ProtoDtl.del_usr_nm", MCColumnType.TEXT);
		p.columnProtoDtl_del_ts = p.beansFactory.createTableColumn("ProtoDtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [ProtoDtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProtoDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoDtlBtnPanel = p.beansFactory.createPanel("ProtoDtlBtn");
		// ブロックの項目の初期化
		p.ProtoDtlBtn_select_all = p.beansFactory.createButton("ProtoDtlBtn.select_all", "no_border");
		p.ProtoDtlBtn_deselect_all = p.beansFactory.createButton("ProtoDtlBtn.deselect_all", "no_border");
		p.ProtoDtlBtn_radd = p.beansFactory.createButton("ProtoDtlBtn.radd", "no_border");
		p.ProtoDtlBtn_rdel = p.beansFactory.createButton("ProtoDtlBtn.rdel", "no_border");
		p.ProtoDtlBtn_rcopy = p.beansFactory.createButton("ProtoDtlBtn.rcopy", "no_border");
	}

	/**
	 * [AdapPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdapPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.AdapPanelPanel = p.beansFactory.createPanel("AdapPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_set_dt = p.beansFactory.createButton("BulkSet.set_dt");
	}

	/**
	 * [AdapDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdapDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.AdapDtlPanel = p.beansFactory.createPanel("AdapDtl");
		p.AdapDtlScrollPane = p.beansFactory.createScrollPane("AdapDtl.scroll");
		p.createAdapDtlTable();
		// ブロックの項目の初期化
		p.columnAdapDtl_check = p.beansFactory.createTableColumn("AdapDtl.check", MCColumnType.CHECK);
		p.columnAdapDtl_del_flg = p.beansFactory.createTableColumn("AdapDtl.del_flg", MCColumnType.CHECK);
		p.columnAdapDtl_ext_sys_cd = p.beansFactory.createTableColumn("AdapDtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnAdapDtl_if_proc_typ = p.beansFactory.createTableColumn("AdapDtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnAdapDtl_if_proc_typ_nm = p.beansFactory.createTableColumn("AdapDtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnAdapDtl_conv_ope = p.beansFactory.createTableColumn("AdapDtl.conv_ope", MCColumnType.TEXT);
		p.columnAdapDtl_file_io_ope = p.beansFactory.createTableColumn("AdapDtl.file_io_ope", MCColumnType.TEXT);
		p.columnAdapDtl_web_api_ope = p.beansFactory.createTableColumn("AdapDtl.web_api_ope", MCColumnType.TEXT);
		p.columnAdapDtl_cmd_exec_ope = p.beansFactory.createTableColumn("AdapDtl.cmd_exec_ope", MCColumnType.TEXT);
		p.columnAdapDtl_memo1 = p.beansFactory.createTableColumn("AdapDtl.memo1", MCColumnType.TEXT);
		p.columnAdapDtl_memo2 = p.beansFactory.createTableColumn("AdapDtl.memo2", MCColumnType.TEXT);
		p.columnAdapDtl_memo3 = p.beansFactory.createTableColumn("AdapDtl.memo3", MCColumnType.TEXT);
		p.columnAdapDtl_ins_usr_id = p.beansFactory.createTableColumn("AdapDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnAdapDtl_ins_usr_nm = p.beansFactory.createTableColumn("AdapDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnAdapDtl_ins_ts = p.beansFactory.createTableColumn("AdapDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnAdapDtl_ins_func_id = p.beansFactory.createTableColumn("AdapDtl.ins_func_id", MCColumnType.TEXT);
		p.columnAdapDtl_ins_func_nm = p.beansFactory.createTableColumn("AdapDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnAdapDtl_upd_cntr = p.beansFactory.createTableColumn("AdapDtl.upd_cntr", MCColumnType.NUMBER);
		p.columnAdapDtl_upd_usr_id = p.beansFactory.createTableColumn("AdapDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnAdapDtl_upd_usr_nm = p.beansFactory.createTableColumn("AdapDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnAdapDtl_upd_ts = p.beansFactory.createTableColumn("AdapDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnAdapDtl_upd_func_id = p.beansFactory.createTableColumn("AdapDtl.upd_func_id", MCColumnType.TEXT);
		p.columnAdapDtl_upd_func_nm = p.beansFactory.createTableColumn("AdapDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnAdapDtl_upd_srv_req_no = p.beansFactory.createTableColumn("AdapDtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnAdapDtl_del_usr_id = p.beansFactory.createTableColumn("AdapDtl.del_usr_id", MCColumnType.TEXT);
		p.columnAdapDtl_del_usr_nm = p.beansFactory.createTableColumn("AdapDtl.del_usr_nm", MCColumnType.TEXT);
		p.columnAdapDtl_del_ts = p.beansFactory.createTableColumn("AdapDtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [AdapDtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAdapDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.AdapDtlBtnPanel = p.beansFactory.createPanel("AdapDtlBtn");
		// ブロックの項目の初期化
		p.AdapDtlBtn_select_all = p.beansFactory.createButton("AdapDtlBtn.select_all", "no_border");
		p.AdapDtlBtn_deselect_all = p.beansFactory.createButton("AdapDtlBtn.deselect_all", "no_border");
		p.AdapDtlBtn_radd = p.beansFactory.createButton("AdapDtlBtn.radd", "no_border");
		p.AdapDtlBtn_rdel = p.beansFactory.createButton("AdapDtlBtn.rdel", "no_border");
		p.AdapDtlBtn_rcopy = p.beansFactory.createButton("AdapDtlBtn.rcopy", "no_border");
	}

	/**
	 * [HttpHeaderPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHttpHeaderPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.HttpHeaderPanelPanel = p.beansFactory.createPanel("HttpHeaderPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [HttpHeaderDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHttpHeaderDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.HttpHeaderDtlPanel = p.beansFactory.createPanel("HttpHeaderDtl");
		p.HttpHeaderDtlScrollPane = p.beansFactory.createScrollPane("HttpHeaderDtl.scroll");
		p.createHttpHeaderDtlTable();
		// ブロックの項目の初期化
		p.columnHttpHeaderDtl_check = p.beansFactory.createTableColumn("HttpHeaderDtl.check", MCColumnType.CHECK);
		p.columnHttpHeaderDtl_del_flg = p.beansFactory.createTableColumn("HttpHeaderDtl.del_flg", MCColumnType.CHECK);
		p.columnHttpHeaderDtl_ext_sys_cd = p.beansFactory.createTableColumn("HttpHeaderDtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_if_proc_typ = p.beansFactory.createTableColumn("HttpHeaderDtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnHttpHeaderDtl_if_proc_typ_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_http_header_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.http_header_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_http_header_val = p.beansFactory.createTableColumn("HttpHeaderDtl.http_header_val", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_memo1 = p.beansFactory.createTableColumn("HttpHeaderDtl.memo1", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_memo2 = p.beansFactory.createTableColumn("HttpHeaderDtl.memo2", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_memo3 = p.beansFactory.createTableColumn("HttpHeaderDtl.memo3", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_ins_usr_id = p.beansFactory.createTableColumn("HttpHeaderDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_ins_usr_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_ins_ts = p.beansFactory.createTableColumn("HttpHeaderDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnHttpHeaderDtl_ins_func_id = p.beansFactory.createTableColumn("HttpHeaderDtl.ins_func_id", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_ins_func_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_upd_cntr = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_cntr", MCColumnType.NUMBER);
		p.columnHttpHeaderDtl_upd_usr_id = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_upd_usr_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_upd_ts = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnHttpHeaderDtl_upd_func_id = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_func_id", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_upd_func_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_upd_srv_req_no = p.beansFactory.createTableColumn("HttpHeaderDtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_del_usr_id = p.beansFactory.createTableColumn("HttpHeaderDtl.del_usr_id", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_del_usr_nm = p.beansFactory.createTableColumn("HttpHeaderDtl.del_usr_nm", MCColumnType.TEXT);
		p.columnHttpHeaderDtl_del_ts = p.beansFactory.createTableColumn("HttpHeaderDtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [HttpHeaderDtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHttpHeaderDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.HttpHeaderDtlBtnPanel = p.beansFactory.createPanel("HttpHeaderDtlBtn");
		// ブロックの項目の初期化
		p.HttpHeaderDtlBtn_select_all = p.beansFactory.createButton("HttpHeaderDtlBtn.select_all", "no_border");
		p.HttpHeaderDtlBtn_deselect_all = p.beansFactory.createButton("HttpHeaderDtlBtn.deselect_all", "no_border");
		p.HttpHeaderDtlBtn_radd = p.beansFactory.createButton("HttpHeaderDtlBtn.radd", "no_border");
		p.HttpHeaderDtlBtn_rdel = p.beansFactory.createButton("HttpHeaderDtlBtn.rdel", "no_border");
		p.HttpHeaderDtlBtn_rcopy = p.beansFactory.createButton("HttpHeaderDtlBtn.rcopy", "no_border");
	}

	/**
	 * [ExtSysUsrPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExtSysUsrPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ExtSysUsrPanelPanel = p.beansFactory.createPanel("ExtSysUsrPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [ExtSysUsrDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExtSysUsrDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ExtSysUsrDtlPanel = p.beansFactory.createPanel("ExtSysUsrDtl");
		p.ExtSysUsrDtlScrollPane = p.beansFactory.createScrollPane("ExtSysUsrDtl.scroll");
		p.createExtSysUsrDtlTable();
		// ブロックの項目の初期化
		p.columnExtSysUsrDtl_check = p.beansFactory.createTableColumn("ExtSysUsrDtl.check", MCColumnType.CHECK);
		p.columnExtSysUsrDtl_del_flg = p.beansFactory.createTableColumn("ExtSysUsrDtl.del_flg", MCColumnType.CHECK);
		p.columnExtSysUsrDtl_ext_sys_cd = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_usr_cd = p.beansFactory.createTableColumn("ExtSysUsrDtl.usr_cd", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_usr_nm = p.beansFactory.createTableColumn("ExtSysUsrDtl.usr_nm", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_usr_cd = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_usr_cd", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_pass = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_pass", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_str1 = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_str1", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_str2 = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_str2", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_str3 = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_str3", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_str4 = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_str4", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ext_sys_str5 = p.beansFactory.createTableColumn("ExtSysUsrDtl.ext_sys_str5", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_memo1 = p.beansFactory.createTableColumn("ExtSysUsrDtl.memo1", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_memo2 = p.beansFactory.createTableColumn("ExtSysUsrDtl.memo2", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_memo3 = p.beansFactory.createTableColumn("ExtSysUsrDtl.memo3", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ins_usr_id = p.beansFactory.createTableColumn("ExtSysUsrDtl.ins_usr_id", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ins_usr_nm = p.beansFactory.createTableColumn("ExtSysUsrDtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ins_ts = p.beansFactory.createTableColumn("ExtSysUsrDtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnExtSysUsrDtl_ins_func_id = p.beansFactory.createTableColumn("ExtSysUsrDtl.ins_func_id", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_ins_func_nm = p.beansFactory.createTableColumn("ExtSysUsrDtl.ins_func_nm", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_upd_cntr = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_cntr", MCColumnType.NUMBER);
		p.columnExtSysUsrDtl_upd_usr_id = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_usr_id", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_upd_usr_nm = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_upd_ts = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnExtSysUsrDtl_upd_func_id = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_func_id", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_upd_func_nm = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_func_nm", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_upd_srv_req_no = p.beansFactory.createTableColumn("ExtSysUsrDtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_del_usr_id = p.beansFactory.createTableColumn("ExtSysUsrDtl.del_usr_id", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_del_usr_nm = p.beansFactory.createTableColumn("ExtSysUsrDtl.del_usr_nm", MCColumnType.TEXT);
		p.columnExtSysUsrDtl_del_ts = p.beansFactory.createTableColumn("ExtSysUsrDtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [ExtSysUsrDtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitExtSysUsrDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ExtSysUsrDtlBtnPanel = p.beansFactory.createPanel("ExtSysUsrDtlBtn");
		// ブロックの項目の初期化
		p.ExtSysUsrDtlBtn_select_all = p.beansFactory.createButton("ExtSysUsrDtlBtn.select_all", "no_border");
		p.ExtSysUsrDtlBtn_deselect_all = p.beansFactory.createButton("ExtSysUsrDtlBtn.deselect_all", "no_border");
		p.ExtSysUsrDtlBtn_radd = p.beansFactory.createButton("ExtSysUsrDtlBtn.radd", "no_border");
		p.ExtSysUsrDtlBtn_rdel = p.beansFactory.createButton("ExtSysUsrDtlBtn.rdel", "no_border");
		p.ExtSysUsrDtlBtn_rcopy = p.beansFactory.createButton("ExtSysUsrDtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclPanelPanel = p.beansFactory.createPanel("LclPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_ext_sys_cd = p.beansFactory.createTableColumn("Lcl.ext_sys_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_ext_sys_nm = p.beansFactory.createTableColumn("Lcl.ext_sys_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ProtoL]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProtoL(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoLPanel = p.beansFactory.createPanel("ProtoL");
		// ブロックの項目の初期化
	}

	/**
	 * [ProtoLPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProtoLPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoLPanelPanel = p.beansFactory.createPanel("ProtoLPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [Rarea]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRarea(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.RareaPanel = p.beansFactory.createPanel("Rarea");
		// ブロックの項目の初期化
		p.Rarea_if_ctl_typ_nm_lab = p.beansFactory.createLabel("Rarea.if_ctl_typ_nm_lab");
		p.Rarea_if_ctl_typ_nmScrollPane = p.beansFactory.createScrollPane("Rarea.if_ctl_typ_nmscroll");
		p.Rarea_if_ctl_typ_nm = p.beansFactory.createTextArea("Rarea.if_ctl_typ_nm");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP1500.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.WrkPanel);
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
	protected static void jbInitFold(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.ope_META);
		p.Cnd_ext_sys_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ext_sys_cd, true);
		p.Cnd_ext_sys_cd.setLinkBeans(p.Cnd_ext_sys_nm);
		p.CndPanel.add(p.Cnd_ext_sys_cd_Label);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.CndPanel.setLastBeans(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.ext_sys_cd_META);
		p.CndPanel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.ext_sys_nm_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1500.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.BLTabPanel, null);
		p.LclWrkPanel.setLastBeans(p.BLTabPanel);
	}

	/**
	 * [BLTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBLTab(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.BLTabPanel.add(p.BLTabTab);
		p.BLTabPanel.setLastBeans(p.BLTabTab);
		p.BLTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BLTabTab.add(p.ProtoPanelPanel, "BLTab.tab1");
		p.BLTabTab.setLastBeans(p.ProtoPanelPanel);
		p.ProtoPanelPanel.setNextBeans(p.AdapPanelPanel);
		p.BLTabTab.add(p.AdapPanelPanel, "BLTab.tab2");
		p.AdapPanelPanel.setNextBeans(p.HttpHeaderPanelPanel);
		p.BLTabTab.add(p.HttpHeaderPanelPanel, "BLTab.tab3");
		p.HttpHeaderPanelPanel.setNextBeans(p.ExtSysUsrPanelPanel);
		p.BLTabTab.add(p.ExtSysUsrPanelPanel, "BLTab.tab4");
		p.ExtSysUsrPanelPanel.setNextBeans(p.LclPanelPanel);
		p.BLTabTab.add(p.LclPanelPanel, "BLTab.tab5");
	}

	/**
	 * [ProtoPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProtoPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoPanelPanel.setNextBeans(p.AdapPanelPanel);
		p.ProtoPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.ProtoPanelPanel.add(p.ProtoLPanel, null);
		p.ProtoPanelPanel.setLastBeans(p.ProtoLPanel);
		p.ProtoLPanel.setNextBeans(p.RareaPanel);
		p.ProtoPanelPanel.add(p.RareaPanel, null);
	}

	/**
	 * [ProtoDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProtoDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoDtlPanel.add(p.ProtoDtlScrollPane);
		p.ProtoDtlPanel.setLastBeans(p.ProtoDtlTable);
		p.ProtoDtlScrollPane.setViewportView(p.ProtoDtlTable);
		p.ProtoDtlTable.setList(p.getProtoDtlL());
		p.ProtoDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ProtoDtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProtoDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoDtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.ProtoDtlBtn_select_all.setIcon("SELECT_ALL");
		p.ProtoDtlBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.ProtoDtlBtnPanel.add(p.ProtoDtlBtn_select_all);
		p.ProtoDtlBtnPanel.setLastBeans(p.ProtoDtlBtn_select_all);
		p.ProtoDtlBtn_select_all.setNextBeans(p.ProtoDtlBtn_deselect_all);
		p.ProtoDtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.ProtoDtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.ProtoDtlBtnPanel.add(p.ProtoDtlBtn_deselect_all);
		p.ProtoDtlBtn_deselect_all.setNextBeans(p.ProtoDtlBtn_radd);
		p.ProtoDtlBtn_radd.setIcon("INSERT_RECORD");
		p.ProtoDtlBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.ProtoDtlBtnPanel.add(p.ProtoDtlBtn_radd);
		p.ProtoDtlBtn_radd.setNextBeans(p.ProtoDtlBtn_rdel);
		p.ProtoDtlBtn_rdel.setIcon("DELETE_RECORD");
		p.ProtoDtlBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.ProtoDtlBtnPanel.add(p.ProtoDtlBtn_rdel);
		p.ProtoDtlBtn_rdel.setNextBeans(p.ProtoDtlBtn_rcopy);
		p.ProtoDtlBtn_rcopy.setIcon("COPY_RECORD");
		p.ProtoDtlBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.ProtoDtlBtnPanel.add(p.ProtoDtlBtn_rcopy);
	}

	/**
	 * [AdapPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdapPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.AdapPanelPanel.setNextBeans(p.HttpHeaderPanelPanel);
		p.AdapPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.AdapPanelPanel.add(p.BulkSetPanel, null);
		p.AdapPanelPanel.setLastBeans(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.AdapDtlPanel);
		p.AdapPanelPanel.add(p.AdapDtlPanel, null);
		p.AdapDtlPanel.setNextBeans(p.AdapDtlBtnPanel);
		p.AdapPanelPanel.add(p.AdapDtlBtnPanel, null);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABC.MABCP1500.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABC.MABCP1500.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F3);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [AdapDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdapDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.AdapDtlPanel.add(p.AdapDtlScrollPane);
		p.AdapDtlPanel.setLastBeans(p.AdapDtlTable);
		p.AdapDtlScrollPane.setViewportView(p.AdapDtlTable);
		p.AdapDtlTable.setList(p.getAdapDtlL());
		p.AdapDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [AdapDtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAdapDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.AdapDtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.AdapDtlBtn_select_all.setIcon("SELECT_ALL");
		p.AdapDtlBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.AdapDtlBtnPanel.add(p.AdapDtlBtn_select_all);
		p.AdapDtlBtnPanel.setLastBeans(p.AdapDtlBtn_select_all);
		p.AdapDtlBtn_select_all.setNextBeans(p.AdapDtlBtn_deselect_all);
		p.AdapDtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.AdapDtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.AdapDtlBtnPanel.add(p.AdapDtlBtn_deselect_all);
		p.AdapDtlBtn_deselect_all.setNextBeans(p.AdapDtlBtn_radd);
		p.AdapDtlBtn_radd.setIcon("INSERT_RECORD");
		p.AdapDtlBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.AdapDtlBtnPanel.add(p.AdapDtlBtn_radd);
		p.AdapDtlBtn_radd.setNextBeans(p.AdapDtlBtn_rdel);
		p.AdapDtlBtn_rdel.setIcon("DELETE_RECORD");
		p.AdapDtlBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.AdapDtlBtnPanel.add(p.AdapDtlBtn_rdel);
		p.AdapDtlBtn_rdel.setNextBeans(p.AdapDtlBtn_rcopy);
		p.AdapDtlBtn_rcopy.setIcon("COPY_RECORD");
		p.AdapDtlBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.AdapDtlBtnPanel.add(p.AdapDtlBtn_rcopy);
	}

	/**
	 * [HttpHeaderPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHttpHeaderPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.HttpHeaderPanelPanel.setNextBeans(p.ExtSysUsrPanelPanel);
		p.HttpHeaderPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.HttpHeaderPanelPanel.add(p.HttpHeaderDtlPanel, null);
		p.HttpHeaderPanelPanel.setLastBeans(p.HttpHeaderDtlPanel);
		p.HttpHeaderDtlPanel.setNextBeans(p.HttpHeaderDtlBtnPanel);
		p.HttpHeaderPanelPanel.add(p.HttpHeaderDtlBtnPanel, null);
	}

	/**
	 * [HttpHeaderDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHttpHeaderDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.HttpHeaderDtlPanel.add(p.HttpHeaderDtlScrollPane);
		p.HttpHeaderDtlPanel.setLastBeans(p.HttpHeaderDtlTable);
		p.HttpHeaderDtlScrollPane.setViewportView(p.HttpHeaderDtlTable);
		p.HttpHeaderDtlTable.setList(p.getHttpHeaderDtlL());
		p.HttpHeaderDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [HttpHeaderDtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHttpHeaderDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.HttpHeaderDtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.HttpHeaderDtlBtn_select_all.setIcon("SELECT_ALL");
		p.HttpHeaderDtlBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.HttpHeaderDtlBtnPanel.add(p.HttpHeaderDtlBtn_select_all);
		p.HttpHeaderDtlBtnPanel.setLastBeans(p.HttpHeaderDtlBtn_select_all);
		p.HttpHeaderDtlBtn_select_all.setNextBeans(p.HttpHeaderDtlBtn_deselect_all);
		p.HttpHeaderDtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.HttpHeaderDtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.HttpHeaderDtlBtnPanel.add(p.HttpHeaderDtlBtn_deselect_all);
		p.HttpHeaderDtlBtn_deselect_all.setNextBeans(p.HttpHeaderDtlBtn_radd);
		p.HttpHeaderDtlBtn_radd.setIcon("INSERT_RECORD");
		p.HttpHeaderDtlBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.HttpHeaderDtlBtnPanel.add(p.HttpHeaderDtlBtn_radd);
		p.HttpHeaderDtlBtn_radd.setNextBeans(p.HttpHeaderDtlBtn_rdel);
		p.HttpHeaderDtlBtn_rdel.setIcon("DELETE_RECORD");
		p.HttpHeaderDtlBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.HttpHeaderDtlBtnPanel.add(p.HttpHeaderDtlBtn_rdel);
		p.HttpHeaderDtlBtn_rdel.setNextBeans(p.HttpHeaderDtlBtn_rcopy);
		p.HttpHeaderDtlBtn_rcopy.setIcon("COPY_RECORD");
		p.HttpHeaderDtlBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.HttpHeaderDtlBtnPanel.add(p.HttpHeaderDtlBtn_rcopy);
	}

	/**
	 * [ExtSysUsrPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExtSysUsrPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ExtSysUsrPanelPanel.setNextBeans(p.LclPanelPanel);
		p.ExtSysUsrPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.ExtSysUsrPanelPanel.add(p.ExtSysUsrDtlPanel, null);
		p.ExtSysUsrPanelPanel.setLastBeans(p.ExtSysUsrDtlPanel);
		p.ExtSysUsrDtlPanel.setNextBeans(p.ExtSysUsrDtlBtnPanel);
		p.ExtSysUsrPanelPanel.add(p.ExtSysUsrDtlBtnPanel, null);
	}

	/**
	 * [ExtSysUsrDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExtSysUsrDtl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ExtSysUsrDtlPanel.add(p.ExtSysUsrDtlScrollPane);
		p.ExtSysUsrDtlPanel.setLastBeans(p.ExtSysUsrDtlTable);
		p.ExtSysUsrDtlScrollPane.setViewportView(p.ExtSysUsrDtlTable);
		p.ExtSysUsrDtlTable.setList(p.getExtSysUsrDtlL());
		p.ExtSysUsrDtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ExtSysUsrDtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitExtSysUsrDtlBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ExtSysUsrDtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.ExtSysUsrDtlBtn_select_all.setIcon("SELECT_ALL");
		p.ExtSysUsrDtlBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.ExtSysUsrDtlBtnPanel.add(p.ExtSysUsrDtlBtn_select_all);
		p.ExtSysUsrDtlBtnPanel.setLastBeans(p.ExtSysUsrDtlBtn_select_all);
		p.ExtSysUsrDtlBtn_select_all.setNextBeans(p.ExtSysUsrDtlBtn_deselect_all);
		p.ExtSysUsrDtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.ExtSysUsrDtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.ExtSysUsrDtlBtnPanel.add(p.ExtSysUsrDtlBtn_deselect_all);
		p.ExtSysUsrDtlBtn_deselect_all.setNextBeans(p.ExtSysUsrDtlBtn_radd);
		p.ExtSysUsrDtlBtn_radd.setIcon("INSERT_RECORD");
		p.ExtSysUsrDtlBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.ExtSysUsrDtlBtnPanel.add(p.ExtSysUsrDtlBtn_radd);
		p.ExtSysUsrDtlBtn_radd.setNextBeans(p.ExtSysUsrDtlBtn_rdel);
		p.ExtSysUsrDtlBtn_rdel.setIcon("DELETE_RECORD");
		p.ExtSysUsrDtlBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.ExtSysUsrDtlBtnPanel.add(p.ExtSysUsrDtlBtn_rdel);
		p.ExtSysUsrDtlBtn_rdel.setNextBeans(p.ExtSysUsrDtlBtn_rcopy);
		p.ExtSysUsrDtlBtn_rcopy.setIcon("COPY_RECORD");
		p.ExtSysUsrDtlBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.ExtSysUsrDtlBtnPanel.add(p.ExtSysUsrDtlBtn_rcopy);
	}

	/**
	 * [LclPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LclPanelPanel.add(p.LclPanel, null);
		p.LclPanelPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclPanelPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * [ProtoL]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProtoL(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoLPanel.setLayoutPosition("CL+");
		// ブロックの項目の初期化
		p.ProtoLPanel.add(p.ProtoLPanelPanel, null);
		p.ProtoLPanel.setLastBeans(p.ProtoLPanelPanel);
	}

	/**
	 * [ProtoLPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProtoLPanel(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.ProtoLPanelPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.ProtoLPanelPanel.add(p.ProtoDtlPanel, null);
		p.ProtoLPanelPanel.setLastBeans(p.ProtoDtlPanel);
		p.ProtoDtlPanel.setNextBeans(p.ProtoDtlBtnPanel);
		p.ProtoLPanelPanel.add(p.ProtoDtlBtnPanel, null);
	}

	/**
	 * [Rarea]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRarea(MABCP_ExtSysReg p) {
		// ブロック関連の初期化
		p.RareaPanel.setLayoutPosition("CR");
		// ブロックの項目の初期化
		p.RareaPanel.add(p.Rarea_if_ctl_typ_nm_lab);
		p.Rarea_if_ctl_typ_nmScrollPane.getViewport().add(p.Rarea_if_ctl_typ_nm);
		p.RareaPanel.add(p.Rarea_if_ctl_typ_nmScrollPane);
		p.RareaPanel.setLastBeans(p.Rarea_if_ctl_typ_nm);
		p.Rarea_if_ctl_typ_nm.setRow(p.getRareaR(), mcframe.clientMABC.MABCP1500.RareaR.if_ctl_typ_nm_META);
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
		MABCP_ExtSysReg_MC.mcInitScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitMst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitTop((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitFold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitCnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitCtrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitLclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitBLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitAdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitBulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitAdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitAdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitHttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitHttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitHttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitLclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitLcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitLclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitEastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.mcInitRarea((MABCP_ExtSysReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_ExtSysReg_MC.statusInitUPD_ScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Mst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Top((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Fold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Cnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Ctrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Wrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Dtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_DtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_LclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_BLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_AdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_BulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_AdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_AdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_HttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_HttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_HttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_LclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Lcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_LclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Btn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_EastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_Rarea((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ProtoAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_AdapAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_HttpHeaderAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_ExtSysUsrAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitUPD_LclAll((MABCP_ExtSysReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_ExtSysReg_MC.statusInitFIX_ScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Mst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Top((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Fold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Cnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Ctrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Wrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Dtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_DtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_LclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_BLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_AdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_BulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_AdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_AdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_HttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_HttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_HttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_LclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Lcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_LclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Btn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_EastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_Rarea((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ProtoAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_AdapAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_HttpHeaderAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_ExtSysUsrAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitFIX_LclAll((MABCP_ExtSysReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_ExtSysReg_MC.statusInitDEL_ScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Mst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Top((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Fold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Cnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Ctrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Wrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Dtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_DtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_LclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_BLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_AdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_BulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_AdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_AdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_HttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_HttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_HttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_LclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Lcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_LclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Btn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_EastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_Rarea((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ProtoAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_AdapAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_HttpHeaderAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_ExtSysUsrAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitDEL_LclAll((MABCP_ExtSysReg)this);

		// [REF]ステータスのモードの設定
		MABCP_ExtSysReg_MC.statusInitREF_ScreenOpe((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Mst((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Top((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Fold((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Cnd((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Ctrl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Wrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Dtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_DtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_LclWrk((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_BLTab((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ProtoPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ProtoDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_AdapPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_BulkSet((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_AdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_AdapDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_HttpHeaderPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_HttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_HttpHeaderDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ExtSysUsrPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ExtSysUsrDtlBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_LclPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Lcl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_LclBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Btn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_EastBtn((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ProtoL((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ProtoLPanel((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_Rarea((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ProtoAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_AdapAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_HttpHeaderAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_ExtSysUsrAll((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.statusInitREF_LclAll((MABCP_ExtSysReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_ExtSysReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_ExtSysReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_ExtSysReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_ExtSysReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_ExtSysReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_ExtSysReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_ExtSysReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_ExtSysReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm_lcl.addAllListener(p);
		p.columnDtl_ext_sys_nm_lcl.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_ext_sys_typ.addAllListener(p);
		p.columnDtl_ext_sys_typ.setListListener(p);
		p.columnDtl_ext_sys_typ_nm.addAllListener(p);
		p.columnDtl_ext_sys_typ_nm.setListListener(p);
		p.columnDtl_web_api_flg.addAllListener(p);
		p.columnDtl_cmd_exec_flg.addAllListener(p);
		p.columnDtl_real_imp_flg.addAllListener(p);
		p.columnDtl_not_send_upd_flg.addAllListener(p);
		p.columnDtl_not_dup_imp_flg.addAllListener(p);
		p.columnDtl_if_upd_typ.addAllListener(p);
		p.columnDtl_if_upd_typ.setListListener(p);
		p.columnDtl_if_upd_typ_nm.addAllListener(p);
		p.columnDtl_if_upd_typ_nm.setListListener(p);
		p.columnDtl_dlv_slip_split_flg.addAllListener(p);
		p.columnDtl_null_val_if_flg.addAllListener(p);
		p.columnDtl_upri_not_chk_flg.addAllListener(p);
		p.columnDtl_amt_not_chk_flg.addAllListener(p);
		p.columnDtl_tax_not_chk_flg.addAllListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_ExtSysReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_ExtSysReg p) {
	}

	/**
	 *  [BLTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBLTab(MABCP_ExtSysReg p) {
		p.BLTabTab.addAllListener(p);
	}

	/**
	 *  [ProtoPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProtoPanel(MABCP_ExtSysReg p) {
	}

	/**
	 *  [ProtoDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProtoDtl(MABCP_ExtSysReg p) {
		p.ProtoDtlTable.addAllListener(p);
		p.columnProtoDtl_check.addAllListener(p);
		p.columnProtoDtl_del_flg.addAllListener(p);
		p.columnProtoDtl_ext_sys_cd.addAllListener(p);
		p.columnProtoDtl_ext_sys_cd.setListListener(p);
		p.columnProtoDtl_if_proc_typ.addAllListener(p);
		p.columnProtoDtl_if_proc_typ.setListListener(p);
		p.columnProtoDtl_if_proc_typ_nm.addAllListener(p);
		p.columnProtoDtl_if_proc_typ_nm.setListListener(p);
		p.columnProtoDtl_if_ctl_typ.addAllListener(p);
		p.columnProtoDtl_if_ctl_typ.setListListener(p);
		p.columnProtoDtl_if_ctl_typ_nm.addAllListener(p);
		p.columnProtoDtl_if_ctl_typ_nm.setListListener(p);
		p.columnProtoDtl_var_str.addAllListener(p);
		p.columnProtoDtl_var_str.setListListener(p);
		p.columnProtoDtl_var_num.addAllListener(p);
		p.columnProtoDtl_var_num.setListListener(p);
		p.columnProtoDtl_memo1.addAllListener(p);
		p.columnProtoDtl_memo1.setListListener(p);
		p.columnProtoDtl_memo2.addAllListener(p);
		p.columnProtoDtl_memo2.setListListener(p);
		p.columnProtoDtl_memo3.addAllListener(p);
		p.columnProtoDtl_memo3.setListListener(p);
		p.columnProtoDtl_ins_usr_id.addAllListener(p);
		p.columnProtoDtl_ins_usr_id.setListListener(p);
		p.columnProtoDtl_ins_usr_nm.addAllListener(p);
		p.columnProtoDtl_ins_usr_nm.setListListener(p);
		p.columnProtoDtl_ins_ts.addAllListener(p);
		p.columnProtoDtl_ins_ts.setListListener(p);
		p.columnProtoDtl_ins_func_id.addAllListener(p);
		p.columnProtoDtl_ins_func_id.setListListener(p);
		p.columnProtoDtl_ins_func_nm.addAllListener(p);
		p.columnProtoDtl_ins_func_nm.setListListener(p);
		p.columnProtoDtl_upd_cntr.addAllListener(p);
		p.columnProtoDtl_upd_cntr.setListListener(p);
		p.columnProtoDtl_upd_usr_id.addAllListener(p);
		p.columnProtoDtl_upd_usr_id.setListListener(p);
		p.columnProtoDtl_upd_usr_nm.addAllListener(p);
		p.columnProtoDtl_upd_usr_nm.setListListener(p);
		p.columnProtoDtl_upd_ts.addAllListener(p);
		p.columnProtoDtl_upd_ts.setListListener(p);
		p.columnProtoDtl_upd_func_id.addAllListener(p);
		p.columnProtoDtl_upd_func_id.setListListener(p);
		p.columnProtoDtl_upd_func_nm.addAllListener(p);
		p.columnProtoDtl_upd_func_nm.setListListener(p);
		p.columnProtoDtl_upd_srv_req_no.addAllListener(p);
		p.columnProtoDtl_upd_srv_req_no.setListListener(p);
		p.columnProtoDtl_del_usr_id.addAllListener(p);
		p.columnProtoDtl_del_usr_id.setListListener(p);
		p.columnProtoDtl_del_usr_nm.addAllListener(p);
		p.columnProtoDtl_del_usr_nm.setListListener(p);
		p.columnProtoDtl_del_ts.addAllListener(p);
		p.columnProtoDtl_del_ts.setListListener(p);
	}

	/**
	 *  [ProtoDtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProtoDtlBtn(MABCP_ExtSysReg p) {
		p.ProtoDtlBtn_select_all.addAllListener(p);
		p.ProtoDtlBtn_select_all.setAPMethodName("doProtoDtlBtn_select_all");
		p.ProtoDtlBtn_deselect_all.addAllListener(p);
		p.ProtoDtlBtn_deselect_all.setAPMethodName("doProtoDtlBtn_deselect_all");
		p.ProtoDtlBtn_radd.addAllListener(p);
		p.ProtoDtlBtn_radd.setAPMethodName("doProtoDtlBtn_radd");
		p.ProtoDtlBtn_rdel.addAllListener(p);
		p.ProtoDtlBtn_rdel.setAPMethodName("doProtoDtlBtn_rdel");
		p.ProtoDtlBtn_rcopy.addAllListener(p);
		p.ProtoDtlBtn_rcopy.setAPMethodName("doProtoDtlBtn_rcopy");
	}

	/**
	 *  [AdapPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdapPanel(MABCP_ExtSysReg p) {
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABCP_ExtSysReg p) {
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_set_dt.addAllListener(p);
		p.BulkSet_set_dt.setAPMethodName("doBulkSet_set_dt");
	}

	/**
	 *  [AdapDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdapDtl(MABCP_ExtSysReg p) {
		p.AdapDtlTable.addAllListener(p);
		p.columnAdapDtl_check.addAllListener(p);
		p.columnAdapDtl_del_flg.addAllListener(p);
		p.columnAdapDtl_ext_sys_cd.addAllListener(p);
		p.columnAdapDtl_ext_sys_cd.setListListener(p);
		p.columnAdapDtl_if_proc_typ.addAllListener(p);
		p.columnAdapDtl_if_proc_typ.setListListener(p);
		p.columnAdapDtl_if_proc_typ_nm.addAllListener(p);
		p.columnAdapDtl_if_proc_typ_nm.setListListener(p);
		p.columnAdapDtl_conv_ope.addAllListener(p);
		p.columnAdapDtl_conv_ope.setListListener(p);
		p.columnAdapDtl_file_io_ope.addAllListener(p);
		p.columnAdapDtl_file_io_ope.setListListener(p);
		p.columnAdapDtl_web_api_ope.addAllListener(p);
		p.columnAdapDtl_web_api_ope.setListListener(p);
		p.columnAdapDtl_cmd_exec_ope.addAllListener(p);
		p.columnAdapDtl_cmd_exec_ope.setListListener(p);
		p.columnAdapDtl_memo1.addAllListener(p);
		p.columnAdapDtl_memo1.setListListener(p);
		p.columnAdapDtl_memo2.addAllListener(p);
		p.columnAdapDtl_memo2.setListListener(p);
		p.columnAdapDtl_memo3.addAllListener(p);
		p.columnAdapDtl_memo3.setListListener(p);
		p.columnAdapDtl_ins_usr_id.addAllListener(p);
		p.columnAdapDtl_ins_usr_id.setListListener(p);
		p.columnAdapDtl_ins_usr_nm.addAllListener(p);
		p.columnAdapDtl_ins_usr_nm.setListListener(p);
		p.columnAdapDtl_ins_ts.addAllListener(p);
		p.columnAdapDtl_ins_ts.setListListener(p);
		p.columnAdapDtl_ins_func_id.addAllListener(p);
		p.columnAdapDtl_ins_func_id.setListListener(p);
		p.columnAdapDtl_ins_func_nm.addAllListener(p);
		p.columnAdapDtl_ins_func_nm.setListListener(p);
		p.columnAdapDtl_upd_cntr.addAllListener(p);
		p.columnAdapDtl_upd_cntr.setListListener(p);
		p.columnAdapDtl_upd_usr_id.addAllListener(p);
		p.columnAdapDtl_upd_usr_id.setListListener(p);
		p.columnAdapDtl_upd_usr_nm.addAllListener(p);
		p.columnAdapDtl_upd_usr_nm.setListListener(p);
		p.columnAdapDtl_upd_ts.addAllListener(p);
		p.columnAdapDtl_upd_ts.setListListener(p);
		p.columnAdapDtl_upd_func_id.addAllListener(p);
		p.columnAdapDtl_upd_func_id.setListListener(p);
		p.columnAdapDtl_upd_func_nm.addAllListener(p);
		p.columnAdapDtl_upd_func_nm.setListListener(p);
		p.columnAdapDtl_upd_srv_req_no.addAllListener(p);
		p.columnAdapDtl_upd_srv_req_no.setListListener(p);
		p.columnAdapDtl_del_usr_id.addAllListener(p);
		p.columnAdapDtl_del_usr_id.setListListener(p);
		p.columnAdapDtl_del_usr_nm.addAllListener(p);
		p.columnAdapDtl_del_usr_nm.setListListener(p);
		p.columnAdapDtl_del_ts.addAllListener(p);
		p.columnAdapDtl_del_ts.setListListener(p);
	}

	/**
	 *  [AdapDtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAdapDtlBtn(MABCP_ExtSysReg p) {
		p.AdapDtlBtn_select_all.addAllListener(p);
		p.AdapDtlBtn_select_all.setAPMethodName("doAdapDtlBtn_select_all");
		p.AdapDtlBtn_deselect_all.addAllListener(p);
		p.AdapDtlBtn_deselect_all.setAPMethodName("doAdapDtlBtn_deselect_all");
		p.AdapDtlBtn_radd.addAllListener(p);
		p.AdapDtlBtn_radd.setAPMethodName("doAdapDtlBtn_radd");
		p.AdapDtlBtn_rdel.addAllListener(p);
		p.AdapDtlBtn_rdel.setAPMethodName("doAdapDtlBtn_rdel");
		p.AdapDtlBtn_rcopy.addAllListener(p);
		p.AdapDtlBtn_rcopy.setAPMethodName("doAdapDtlBtn_rcopy");
	}

	/**
	 *  [HttpHeaderPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHttpHeaderPanel(MABCP_ExtSysReg p) {
	}

	/**
	 *  [HttpHeaderDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHttpHeaderDtl(MABCP_ExtSysReg p) {
		p.HttpHeaderDtlTable.addAllListener(p);
		p.columnHttpHeaderDtl_check.addAllListener(p);
		p.columnHttpHeaderDtl_del_flg.addAllListener(p);
		p.columnHttpHeaderDtl_ext_sys_cd.addAllListener(p);
		p.columnHttpHeaderDtl_ext_sys_cd.setListListener(p);
		p.columnHttpHeaderDtl_if_proc_typ.addAllListener(p);
		p.columnHttpHeaderDtl_if_proc_typ.setListListener(p);
		p.columnHttpHeaderDtl_if_proc_typ_nm.addAllListener(p);
		p.columnHttpHeaderDtl_if_proc_typ_nm.setListListener(p);
		p.columnHttpHeaderDtl_http_header_nm.addAllListener(p);
		p.columnHttpHeaderDtl_http_header_nm.setListListener(p);
		p.columnHttpHeaderDtl_http_header_val.addAllListener(p);
		p.columnHttpHeaderDtl_http_header_val.setListListener(p);
		p.columnHttpHeaderDtl_memo1.addAllListener(p);
		p.columnHttpHeaderDtl_memo1.setListListener(p);
		p.columnHttpHeaderDtl_memo2.addAllListener(p);
		p.columnHttpHeaderDtl_memo2.setListListener(p);
		p.columnHttpHeaderDtl_memo3.addAllListener(p);
		p.columnHttpHeaderDtl_memo3.setListListener(p);
		p.columnHttpHeaderDtl_ins_usr_id.addAllListener(p);
		p.columnHttpHeaderDtl_ins_usr_id.setListListener(p);
		p.columnHttpHeaderDtl_ins_usr_nm.addAllListener(p);
		p.columnHttpHeaderDtl_ins_usr_nm.setListListener(p);
		p.columnHttpHeaderDtl_ins_ts.addAllListener(p);
		p.columnHttpHeaderDtl_ins_ts.setListListener(p);
		p.columnHttpHeaderDtl_ins_func_id.addAllListener(p);
		p.columnHttpHeaderDtl_ins_func_id.setListListener(p);
		p.columnHttpHeaderDtl_ins_func_nm.addAllListener(p);
		p.columnHttpHeaderDtl_ins_func_nm.setListListener(p);
		p.columnHttpHeaderDtl_upd_cntr.addAllListener(p);
		p.columnHttpHeaderDtl_upd_cntr.setListListener(p);
		p.columnHttpHeaderDtl_upd_usr_id.addAllListener(p);
		p.columnHttpHeaderDtl_upd_usr_id.setListListener(p);
		p.columnHttpHeaderDtl_upd_usr_nm.addAllListener(p);
		p.columnHttpHeaderDtl_upd_usr_nm.setListListener(p);
		p.columnHttpHeaderDtl_upd_ts.addAllListener(p);
		p.columnHttpHeaderDtl_upd_ts.setListListener(p);
		p.columnHttpHeaderDtl_upd_func_id.addAllListener(p);
		p.columnHttpHeaderDtl_upd_func_id.setListListener(p);
		p.columnHttpHeaderDtl_upd_func_nm.addAllListener(p);
		p.columnHttpHeaderDtl_upd_func_nm.setListListener(p);
		p.columnHttpHeaderDtl_upd_srv_req_no.addAllListener(p);
		p.columnHttpHeaderDtl_upd_srv_req_no.setListListener(p);
		p.columnHttpHeaderDtl_del_usr_id.addAllListener(p);
		p.columnHttpHeaderDtl_del_usr_id.setListListener(p);
		p.columnHttpHeaderDtl_del_usr_nm.addAllListener(p);
		p.columnHttpHeaderDtl_del_usr_nm.setListListener(p);
		p.columnHttpHeaderDtl_del_ts.addAllListener(p);
		p.columnHttpHeaderDtl_del_ts.setListListener(p);
	}

	/**
	 *  [HttpHeaderDtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHttpHeaderDtlBtn(MABCP_ExtSysReg p) {
		p.HttpHeaderDtlBtn_select_all.addAllListener(p);
		p.HttpHeaderDtlBtn_select_all.setAPMethodName("doHttpHeaderDtlBtn_select_all");
		p.HttpHeaderDtlBtn_deselect_all.addAllListener(p);
		p.HttpHeaderDtlBtn_deselect_all.setAPMethodName("doHttpHeaderDtlBtn_deselect_all");
		p.HttpHeaderDtlBtn_radd.addAllListener(p);
		p.HttpHeaderDtlBtn_radd.setAPMethodName("doHttpHeaderDtlBtn_radd");
		p.HttpHeaderDtlBtn_rdel.addAllListener(p);
		p.HttpHeaderDtlBtn_rdel.setAPMethodName("doHttpHeaderDtlBtn_rdel");
		p.HttpHeaderDtlBtn_rcopy.addAllListener(p);
		p.HttpHeaderDtlBtn_rcopy.setAPMethodName("doHttpHeaderDtlBtn_rcopy");
	}

	/**
	 *  [ExtSysUsrPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExtSysUsrPanel(MABCP_ExtSysReg p) {
	}

	/**
	 *  [ExtSysUsrDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExtSysUsrDtl(MABCP_ExtSysReg p) {
		p.ExtSysUsrDtlTable.addAllListener(p);
		p.columnExtSysUsrDtl_check.addAllListener(p);
		p.columnExtSysUsrDtl_del_flg.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_cd.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_cd.setListListener(p);
		p.columnExtSysUsrDtl_usr_cd.addAllListener(p);
		p.columnExtSysUsrDtl_usr_cd.setListListener(p);
		p.columnExtSysUsrDtl_usr_nm.addAllListener(p);
		p.columnExtSysUsrDtl_usr_nm.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_pass.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_pass.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_str1.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_str1.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_str2.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_str2.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_str3.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_str3.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_str4.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_str4.setListListener(p);
		p.columnExtSysUsrDtl_ext_sys_str5.addAllListener(p);
		p.columnExtSysUsrDtl_ext_sys_str5.setListListener(p);
		p.columnExtSysUsrDtl_memo1.addAllListener(p);
		p.columnExtSysUsrDtl_memo1.setListListener(p);
		p.columnExtSysUsrDtl_memo2.addAllListener(p);
		p.columnExtSysUsrDtl_memo2.setListListener(p);
		p.columnExtSysUsrDtl_memo3.addAllListener(p);
		p.columnExtSysUsrDtl_memo3.setListListener(p);
		p.columnExtSysUsrDtl_ins_usr_id.addAllListener(p);
		p.columnExtSysUsrDtl_ins_usr_id.setListListener(p);
		p.columnExtSysUsrDtl_ins_usr_nm.addAllListener(p);
		p.columnExtSysUsrDtl_ins_usr_nm.setListListener(p);
		p.columnExtSysUsrDtl_ins_ts.addAllListener(p);
		p.columnExtSysUsrDtl_ins_ts.setListListener(p);
		p.columnExtSysUsrDtl_ins_func_id.addAllListener(p);
		p.columnExtSysUsrDtl_ins_func_id.setListListener(p);
		p.columnExtSysUsrDtl_ins_func_nm.addAllListener(p);
		p.columnExtSysUsrDtl_ins_func_nm.setListListener(p);
		p.columnExtSysUsrDtl_upd_cntr.addAllListener(p);
		p.columnExtSysUsrDtl_upd_cntr.setListListener(p);
		p.columnExtSysUsrDtl_upd_usr_id.addAllListener(p);
		p.columnExtSysUsrDtl_upd_usr_id.setListListener(p);
		p.columnExtSysUsrDtl_upd_usr_nm.addAllListener(p);
		p.columnExtSysUsrDtl_upd_usr_nm.setListListener(p);
		p.columnExtSysUsrDtl_upd_ts.addAllListener(p);
		p.columnExtSysUsrDtl_upd_ts.setListListener(p);
		p.columnExtSysUsrDtl_upd_func_id.addAllListener(p);
		p.columnExtSysUsrDtl_upd_func_id.setListListener(p);
		p.columnExtSysUsrDtl_upd_func_nm.addAllListener(p);
		p.columnExtSysUsrDtl_upd_func_nm.setListListener(p);
		p.columnExtSysUsrDtl_upd_srv_req_no.addAllListener(p);
		p.columnExtSysUsrDtl_upd_srv_req_no.setListListener(p);
		p.columnExtSysUsrDtl_del_usr_id.addAllListener(p);
		p.columnExtSysUsrDtl_del_usr_id.setListListener(p);
		p.columnExtSysUsrDtl_del_usr_nm.addAllListener(p);
		p.columnExtSysUsrDtl_del_usr_nm.setListListener(p);
		p.columnExtSysUsrDtl_del_ts.addAllListener(p);
		p.columnExtSysUsrDtl_del_ts.setListListener(p);
	}

	/**
	 *  [ExtSysUsrDtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitExtSysUsrDtlBtn(MABCP_ExtSysReg p) {
		p.ExtSysUsrDtlBtn_select_all.addAllListener(p);
		p.ExtSysUsrDtlBtn_select_all.setAPMethodName("doExtSysUsrDtlBtn_select_all");
		p.ExtSysUsrDtlBtn_deselect_all.addAllListener(p);
		p.ExtSysUsrDtlBtn_deselect_all.setAPMethodName("doExtSysUsrDtlBtn_deselect_all");
		p.ExtSysUsrDtlBtn_radd.addAllListener(p);
		p.ExtSysUsrDtlBtn_radd.setAPMethodName("doExtSysUsrDtlBtn_radd");
		p.ExtSysUsrDtlBtn_rdel.addAllListener(p);
		p.ExtSysUsrDtlBtn_rdel.setAPMethodName("doExtSysUsrDtlBtn_rdel");
		p.ExtSysUsrDtlBtn_rcopy.addAllListener(p);
		p.ExtSysUsrDtlBtn_rcopy.setAPMethodName("doExtSysUsrDtlBtn_rcopy");
	}

	/**
	 *  [LclPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclPanel(MABCP_ExtSysReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_ExtSysReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_ext_sys_cd.addAllListener(p);
		p.columnLcl_ext_sys_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_ext_sys_nm.addAllListener(p);
		p.columnLcl_ext_sys_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_ExtSysReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_ExtSysReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_ExtSysReg p) {
	}

	/**
	 *  [ProtoL]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProtoL(MABCP_ExtSysReg p) {
	}

	/**
	 *  [ProtoLPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProtoLPanel(MABCP_ExtSysReg p) {
	}

	/**
	 *  [Rarea]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRarea(MABCP_ExtSysReg p) {
		p.Rarea_if_ctl_typ_nm.addAllListener(p);
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_ExtSysReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_ExtSysReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_ExtSysReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ext_sys_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ext_sys_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ext_sys_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_web_api_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cmd_exec_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_real_imp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_not_send_upd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_not_dup_imp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_if_upd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_if_upd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_split_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_null_val_if_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_upri_not_chk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_amt_not_chk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_tax_not_chk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_ExtSysReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BLTab(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[ProtoPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProtoPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[ProtoDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProtoDtl(MABCP_ExtSysReg p){
		p.columnProtoDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnProtoDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnProtoDtl_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnProtoDtl_if_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnProtoDtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnProtoDtl_if_ctl_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnProtoDtl_var_str.putMode(p, UPD, MCMode.ENABLE);
		p.columnProtoDtl_var_num.putMode(p, UPD, MCMode.ENABLE);
		p.columnProtoDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnProtoDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnProtoDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnProtoDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnProtoDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnProtoDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ProtoDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProtoDtlBtn(MABCP_ExtSysReg p){
		p.ProtoDtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.ProtoDtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.ProtoDtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.ProtoDtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.ProtoDtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[AdapPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdapPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABCP_ExtSysReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[AdapDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdapDtl(MABCP_ExtSysReg p){
		p.columnAdapDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnAdapDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnAdapDtl_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAdapDtl_if_proc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnAdapDtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.AdapDtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnAdapDtl_conv_ope.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_file_io_ope.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_web_api_ope.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_cmd_exec_ope.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnAdapDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnAdapDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnAdapDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[AdapDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdapDtlBtn(MABCP_ExtSysReg p){
		p.AdapDtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.AdapDtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.AdapDtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.AdapDtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.AdapDtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HttpHeaderPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HttpHeaderPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[HttpHeaderDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HttpHeaderDtl(MABCP_ExtSysReg p){
		p.columnHttpHeaderDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnHttpHeaderDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnHttpHeaderDtl_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_if_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnHttpHeaderDtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnHttpHeaderDtl_http_header_val.putMode(p, UPD, MCMode.REQUIRED);
		p.columnHttpHeaderDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnHttpHeaderDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnHttpHeaderDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnHttpHeaderDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[HttpHeaderDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HttpHeaderDtlBtn(MABCP_ExtSysReg p){
		p.HttpHeaderDtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.HttpHeaderDtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.HttpHeaderDtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.HttpHeaderDtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.HttpHeaderDtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[ExtSysUsrPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ExtSysUsrPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[ExtSysUsrDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ExtSysUsrDtl(MABCP_ExtSysReg p){
		p.columnExtSysUsrDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnExtSysUsrDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnExtSysUsrDtl_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnExtSysUsrDtl_ext_sys_pass.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_ext_sys_str1.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_ext_sys_str2.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_ext_sys_str3.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_ext_sys_str4.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_ext_sys_str5.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnExtSysUsrDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ExtSysUsrDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ExtSysUsrDtlBtn(MABCP_ExtSysReg p){
		p.ExtSysUsrDtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.ExtSysUsrDtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.ExtSysUsrDtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.ExtSysUsrDtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.ExtSysUsrDtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_ExtSysReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_ext_sys_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ext_sys_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_ExtSysReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_ExtSysReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[ProtoL]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProtoL(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[ProtoLPanel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProtoLPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[Rarea]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rarea(MABCP_ExtSysReg p){
		p.Rarea_if_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ProtoAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ProtoAll(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[AdapAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AdapAll(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[HttpHeaderAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HttpHeaderAll(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[ExtSysUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ExtSysUsrAll(MABCP_ExtSysReg p){

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_ExtSysReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_ExtSysReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_ExtSysReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_web_api_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cmd_exec_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_real_imp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_not_send_upd_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_not_dup_imp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_if_upd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_if_upd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_split_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_null_val_if_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upri_not_chk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_amt_not_chk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tax_not_chk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_ExtSysReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BLTab(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ProtoPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ProtoPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ProtoDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ProtoDtl(MABCP_ExtSysReg p){
		p.columnProtoDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_ext_sys_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnProtoDtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnProtoDtl_var_str.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_var_num.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnProtoDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnProtoDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[ProtoDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ProtoDtlBtn(MABCP_ExtSysReg p){
		p.ProtoDtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.ProtoDtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.ProtoDtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.ProtoDtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.ProtoDtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[AdapPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_AdapPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABCP_ExtSysReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[AdapDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_AdapDtl(MABCP_ExtSysReg p){
		p.columnAdapDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_ext_sys_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnAdapDtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.AdapDtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnAdapDtl_conv_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_file_io_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_web_api_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_cmd_exec_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnAdapDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnAdapDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[AdapDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_AdapDtlBtn(MABCP_ExtSysReg p){
		p.AdapDtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.AdapDtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.AdapDtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.AdapDtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.AdapDtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[HttpHeaderPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HttpHeaderPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[HttpHeaderDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HttpHeaderDtl(MABCP_ExtSysReg p){
		p.columnHttpHeaderDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ext_sys_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[HttpHeaderDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HttpHeaderDtlBtn(MABCP_ExtSysReg p){
		p.HttpHeaderDtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[ExtSysUsrPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ExtSysUsrPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ExtSysUsrDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ExtSysUsrDtl(MABCP_ExtSysReg p){
		p.columnExtSysUsrDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_pass.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[ExtSysUsrDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ExtSysUsrDtlBtn(MABCP_ExtSysReg p){
		p.ExtSysUsrDtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_ExtSysReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ext_sys_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_ExtSysReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_ExtSysReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ProtoL]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ProtoL(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ProtoLPanel]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ProtoLPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[Rarea]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Rarea(MABCP_ExtSysReg p){
		p.Rarea_if_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[ProtoAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ProtoAll(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[AdapAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_AdapAll(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[HttpHeaderAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HttpHeaderAll(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[ExtSysUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ExtSysUsrAll(MABCP_ExtSysReg p){

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_ExtSysReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_ExtSysReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_ExtSysReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_web_api_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cmd_exec_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_real_imp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_send_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_dup_imp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_if_upd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_if_upd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_split_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_null_val_if_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upri_not_chk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_amt_not_chk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tax_not_chk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_ExtSysReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BLTab(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ProtoPanel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ProtoPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ProtoDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ProtoDtl(MABCP_ExtSysReg p){
		p.columnProtoDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_ext_sys_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnProtoDtl_if_proc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_if_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnProtoDtl_var_str.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_var_num.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnProtoDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnProtoDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[ProtoDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ProtoDtlBtn(MABCP_ExtSysReg p){
		p.ProtoDtlBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.ProtoDtlBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.ProtoDtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.ProtoDtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.ProtoDtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[AdapPanel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdapPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABCP_ExtSysReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[AdapDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdapDtl(MABCP_ExtSysReg p){
		p.columnAdapDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_ext_sys_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnAdapDtl_if_proc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_if_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.AdapDtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnAdapDtl_conv_ope.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_file_io_ope.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_web_api_ope.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_cmd_exec_ope.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnAdapDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnAdapDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[AdapDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdapDtlBtn(MABCP_ExtSysReg p){
		p.AdapDtlBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.AdapDtlBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.AdapDtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.AdapDtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.AdapDtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[HttpHeaderPanel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HttpHeaderPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[HttpHeaderDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HttpHeaderDtl(MABCP_ExtSysReg p){
		p.columnHttpHeaderDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ext_sys_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_if_proc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_if_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[HttpHeaderDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HttpHeaderDtlBtn(MABCP_ExtSysReg p){
		p.HttpHeaderDtlBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[ExtSysUsrPanel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ExtSysUsrPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ExtSysUsrDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ExtSysUsrDtl(MABCP_ExtSysReg p){
		p.columnExtSysUsrDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_pass.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[ExtSysUsrDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ExtSysUsrDtlBtn(MABCP_ExtSysReg p){
		p.ExtSysUsrDtlBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_ExtSysReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ext_sys_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_ExtSysReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_ExtSysReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ProtoL]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ProtoL(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ProtoLPanel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ProtoLPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[Rarea]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rarea(MABCP_ExtSysReg p){
		p.Rarea_if_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[ProtoAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ProtoAll(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[AdapAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AdapAll(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[HttpHeaderAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HttpHeaderAll(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[ExtSysUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ExtSysUsrAll(MABCP_ExtSysReg p){

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_ExtSysReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_ExtSysReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ext_sys_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_ExtSysReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_web_api_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cmd_exec_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_real_imp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_send_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_dup_imp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_if_upd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_if_upd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_split_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_null_val_if_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upri_not_chk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_amt_not_chk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tax_not_chk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_ExtSysReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[BLTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_BLTab(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ProtoPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_ProtoPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ProtoDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ProtoDtl(MABCP_ExtSysReg p){
		p.columnProtoDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnProtoDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnProtoDtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_if_ctl_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnProtoDtl_var_str.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_var_num.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnProtoDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnProtoDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ProtoDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_ProtoDtlBtn(MABCP_ExtSysReg p){
		p.ProtoDtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.ProtoDtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.ProtoDtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.ProtoDtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.ProtoDtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[AdapPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_AdapPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABCP_ExtSysReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[AdapDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_AdapDtl(MABCP_ExtSysReg p){
		p.columnAdapDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAdapDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAdapDtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.AdapDtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnAdapDtl_conv_ope.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_file_io_ope.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_web_api_ope.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_cmd_exec_ope.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnAdapDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnAdapDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[AdapDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_AdapDtlBtn(MABCP_ExtSysReg p){
		p.AdapDtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.AdapDtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.AdapDtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.AdapDtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.AdapDtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[HttpHeaderPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_HttpHeaderPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[HttpHeaderDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_HttpHeaderDtl(MABCP_ExtSysReg p){
		p.columnHttpHeaderDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_http_header_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHttpHeaderDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnHttpHeaderDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[HttpHeaderDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_HttpHeaderDtlBtn(MABCP_ExtSysReg p){
		p.HttpHeaderDtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.HttpHeaderDtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ExtSysUsrPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_ExtSysUsrPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ExtSysUsrDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ExtSysUsrDtl(MABCP_ExtSysReg p){
		p.columnExtSysUsrDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_pass.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ext_sys_str5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnExtSysUsrDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnExtSysUsrDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ExtSysUsrDtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_ExtSysUsrDtlBtn(MABCP_ExtSysReg p){
		p.ExtSysUsrDtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.ExtSysUsrDtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_ExtSysReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_ext_sys_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_ExtSysReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_ExtSysReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ProtoL]ブロックのモードの設定
	 */
	protected static void statusInitREF_ProtoL(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ProtoLPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_ProtoLPanel(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[Rarea]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rarea(MABCP_ExtSysReg p){
		p.Rarea_if_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ProtoAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_ProtoAll(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[AdapAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_AdapAll(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[HttpHeaderAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HttpHeaderAll(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[ExtSysUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_ExtSysUsrAll(MABCP_ExtSysReg p){

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_ExtSysReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_ExtSysReg_MC.setTableConfigDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.setTableConfigProtoDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.setTableConfigAdapDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.setTableConfigHttpHeaderDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.setTableConfigExtSysUsrDtl((MABCP_ExtSysReg)this);
		MABCP_ExtSysReg_MC.setTableConfigLcl((MABCP_ExtSysReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_ExtSysReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP1500.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm_lcl.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ext_sys_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm_lcl);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_ext_sys_typ.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ext_sys_typ_META);
		p.columnDtl_ext_sys_typ.addLinkBeans(p.columnDtl_ext_sys_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_typ);
		p.columnDtl_ext_sys_typ_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ext_sys_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_typ_nm);
		p.columnDtl_web_api_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.web_api_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_web_api_flg);
		p.columnDtl_cmd_exec_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.cmd_exec_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cmd_exec_flg);
		p.columnDtl_real_imp_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.real_imp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_real_imp_flg);
		p.columnDtl_not_send_upd_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.not_send_upd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_send_upd_flg);
		p.columnDtl_not_dup_imp_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.not_dup_imp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_dup_imp_flg);
		p.columnDtl_if_upd_typ.setMeta(mcframe.clientMABC.MABCP1500.DtlR.if_upd_typ_META);
		p.columnDtl_if_upd_typ.addLinkBeans(p.columnDtl_if_upd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_if_upd_typ);
		p.columnDtl_if_upd_typ_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.if_upd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_if_upd_typ_nm);
		p.columnDtl_dlv_slip_split_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.dlv_slip_split_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_split_flg);
		p.columnDtl_null_val_if_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.null_val_if_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_null_val_if_flg);
		p.columnDtl_upri_not_chk_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upri_not_chk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upri_not_chk_flg);
		p.columnDtl_amt_not_chk_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.amt_not_chk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_not_chk_flg);
		p.columnDtl_tax_not_chk_flg.setMeta(mcframe.clientMABC.MABCP1500.DtlR.tax_not_chk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tax_not_chk_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP1500.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP1500.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP1500.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1500.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1500.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1500.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [ProtoDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigProtoDtl(MABCP_ExtSysReg p) {
		p.columnProtoDtl_check.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.check_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_check);
		p.columnProtoDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.del_flg_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_del_flg);
		p.columnProtoDtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.ext_sys_cd_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_ext_sys_cd);
		p.columnProtoDtl_if_proc_typ.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.if_proc_typ_META);
		p.columnProtoDtl_if_proc_typ.addLinkBeans(p.columnProtoDtl_if_proc_typ_nm);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_if_proc_typ);
		p.columnProtoDtl_if_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.if_proc_typ_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_if_proc_typ_nm);
		p.columnProtoDtl_if_ctl_typ.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.if_ctl_typ_META);
		p.columnProtoDtl_if_ctl_typ.addLinkBeans(p.columnProtoDtl_if_ctl_typ_nm);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_if_ctl_typ);
		p.columnProtoDtl_if_ctl_typ_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.if_ctl_typ_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_if_ctl_typ_nm);
		p.columnProtoDtl_var_str.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.var_str_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_var_str);
		p.columnProtoDtl_var_num.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.var_num_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_var_num);
		p.columnProtoDtl_memo1.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.memo1_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_memo1);
		p.columnProtoDtl_memo2.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.memo2_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_memo2);
		p.columnProtoDtl_memo3.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.memo3_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_memo3);
		p.columnProtoDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.ins_usr_id_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_ins_usr_id);
		p.columnProtoDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.ins_usr_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_ins_usr_nm);
		p.columnProtoDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.ins_ts_META);
		p.columnProtoDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_ins_ts);
		p.columnProtoDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.ins_func_id_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_ins_func_id);
		p.columnProtoDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.ins_func_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_ins_func_nm);
		p.columnProtoDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_cntr_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_cntr);
		p.columnProtoDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_usr_id_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_usr_id);
		p.columnProtoDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_usr_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_usr_nm);
		p.columnProtoDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_ts_META);
		p.columnProtoDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_ts);
		p.columnProtoDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_func_id_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_func_id);
		p.columnProtoDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_func_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_func_nm);
		p.columnProtoDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.upd_srv_req_no_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_upd_srv_req_no);
		p.columnProtoDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.del_usr_id_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_del_usr_id);
		p.columnProtoDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.del_usr_nm_META);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_del_usr_nm);
		p.columnProtoDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1500.ProtoDtlR.del_ts_META);
		p.columnProtoDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ProtoDtlTable.addColumnConfig(p.columnProtoDtl_del_ts);
		// スクロール固定カラムの指定
		p.ProtoDtlTable.setUnscrollColumn(p.columnProtoDtl_del_flg);
	}

	/**
	 * [AdapDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigAdapDtl(MABCP_ExtSysReg p) {
		p.columnAdapDtl_check.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.check_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_check);
		p.columnAdapDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.del_flg_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_del_flg);
		p.columnAdapDtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.ext_sys_cd_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_ext_sys_cd);
		p.columnAdapDtl_if_proc_typ.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.if_proc_typ_META);
		p.columnAdapDtl_if_proc_typ.addLinkBeans(p.columnAdapDtl_if_proc_typ_nm);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_if_proc_typ);
		p.columnAdapDtl_if_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.if_proc_typ_nm_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_if_proc_typ_nm);
		p.AdapDtlTable.addTable(p.AdapDtl_dt_p_PPanel.DtTable);
		p.columnAdapDtl_conv_ope.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.conv_ope_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_conv_ope);
		p.columnAdapDtl_file_io_ope.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.file_io_ope_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_file_io_ope);
		p.columnAdapDtl_web_api_ope.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.web_api_ope_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_web_api_ope);
		p.columnAdapDtl_cmd_exec_ope.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.cmd_exec_ope_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_cmd_exec_ope);
		p.columnAdapDtl_memo1.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.memo1_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_memo1);
		p.columnAdapDtl_memo2.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.memo2_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_memo2);
		p.columnAdapDtl_memo3.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.memo3_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_memo3);
		p.columnAdapDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.ins_usr_id_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_ins_usr_id);
		p.columnAdapDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.ins_usr_nm_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_ins_usr_nm);
		p.columnAdapDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.ins_ts_META);
		p.columnAdapDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_ins_ts);
		p.columnAdapDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.ins_func_id_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_ins_func_id);
		p.columnAdapDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.ins_func_nm_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_ins_func_nm);
		p.columnAdapDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_cntr_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_cntr);
		p.columnAdapDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_usr_id_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_usr_id);
		p.columnAdapDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_usr_nm_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_usr_nm);
		p.columnAdapDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_ts_META);
		p.columnAdapDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_ts);
		p.columnAdapDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_func_id_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_func_id);
		p.columnAdapDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_func_nm_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_func_nm);
		p.columnAdapDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.upd_srv_req_no_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_upd_srv_req_no);
		p.columnAdapDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.del_usr_id_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_del_usr_id);
		p.columnAdapDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.del_usr_nm_META);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_del_usr_nm);
		p.columnAdapDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1500.AdapDtlR.del_ts_META);
		p.columnAdapDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.AdapDtlTable.addColumnConfig(p.columnAdapDtl_del_ts);
		// スクロール固定カラムの指定
		p.AdapDtlTable.setUnscrollColumn(p.columnAdapDtl_del_flg);
	}

	/**
	 * [HttpHeaderDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigHttpHeaderDtl(MABCP_ExtSysReg p) {
		p.columnHttpHeaderDtl_check.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.check_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_check);
		p.columnHttpHeaderDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.del_flg_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_del_flg);
		p.columnHttpHeaderDtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.ext_sys_cd_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_ext_sys_cd);
		p.columnHttpHeaderDtl_if_proc_typ.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.if_proc_typ_META);
		p.columnHttpHeaderDtl_if_proc_typ.addLinkBeans(p.columnHttpHeaderDtl_if_proc_typ_nm);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_if_proc_typ);
		p.columnHttpHeaderDtl_if_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.if_proc_typ_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_if_proc_typ_nm);
		p.columnHttpHeaderDtl_http_header_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.http_header_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_http_header_nm);
		p.columnHttpHeaderDtl_http_header_val.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.http_header_val_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_http_header_val);
		p.columnHttpHeaderDtl_memo1.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.memo1_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_memo1);
		p.columnHttpHeaderDtl_memo2.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.memo2_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_memo2);
		p.columnHttpHeaderDtl_memo3.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.memo3_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_memo3);
		p.columnHttpHeaderDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.ins_usr_id_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_ins_usr_id);
		p.columnHttpHeaderDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.ins_usr_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_ins_usr_nm);
		p.columnHttpHeaderDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.ins_ts_META);
		p.columnHttpHeaderDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_ins_ts);
		p.columnHttpHeaderDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.ins_func_id_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_ins_func_id);
		p.columnHttpHeaderDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.ins_func_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_ins_func_nm);
		p.columnHttpHeaderDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_cntr_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_cntr);
		p.columnHttpHeaderDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_usr_id_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_usr_id);
		p.columnHttpHeaderDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_usr_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_usr_nm);
		p.columnHttpHeaderDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_ts_META);
		p.columnHttpHeaderDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_ts);
		p.columnHttpHeaderDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_func_id_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_func_id);
		p.columnHttpHeaderDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_func_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_func_nm);
		p.columnHttpHeaderDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.upd_srv_req_no_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_upd_srv_req_no);
		p.columnHttpHeaderDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.del_usr_id_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_del_usr_id);
		p.columnHttpHeaderDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.del_usr_nm_META);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_del_usr_nm);
		p.columnHttpHeaderDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.del_ts_META);
		p.columnHttpHeaderDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HttpHeaderDtlTable.addColumnConfig(p.columnHttpHeaderDtl_del_ts);
		// スクロール固定カラムの指定
		p.HttpHeaderDtlTable.setUnscrollColumn(p.columnHttpHeaderDtl_del_flg);
	}

	/**
	 * [ExtSysUsrDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigExtSysUsrDtl(MABCP_ExtSysReg p) {
		p.columnExtSysUsrDtl_check.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.check_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_check);
		p.columnExtSysUsrDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.del_flg_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_del_flg);
		p.columnExtSysUsrDtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_cd_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_cd);
		p.columnExtSysUsrDtl_usr_cd.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.usr_cd_META);
		p.columnExtSysUsrDtl_usr_cd.setListType(MCListType.STRICT);
		p.columnExtSysUsrDtl_usr_cd.addLinkBeans(p.columnExtSysUsrDtl_usr_nm);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_usr_cd);
		p.columnExtSysUsrDtl_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.usr_nm_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_usr_nm);
		p.columnExtSysUsrDtl_ext_sys_usr_cd.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_usr_cd_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_usr_cd);
		p.columnExtSysUsrDtl_ext_sys_pass.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_pass_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_pass);
		p.columnExtSysUsrDtl_ext_sys_str1.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_str1_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_str1);
		p.columnExtSysUsrDtl_ext_sys_str2.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_str2_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_str2);
		p.columnExtSysUsrDtl_ext_sys_str3.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_str3_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_str3);
		p.columnExtSysUsrDtl_ext_sys_str4.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_str4_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_str4);
		p.columnExtSysUsrDtl_ext_sys_str5.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ext_sys_str5_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ext_sys_str5);
		p.columnExtSysUsrDtl_memo1.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.memo1_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_memo1);
		p.columnExtSysUsrDtl_memo2.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.memo2_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_memo2);
		p.columnExtSysUsrDtl_memo3.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.memo3_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_memo3);
		p.columnExtSysUsrDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ins_usr_id_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ins_usr_id);
		p.columnExtSysUsrDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ins_usr_nm_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ins_usr_nm);
		p.columnExtSysUsrDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ins_ts_META);
		p.columnExtSysUsrDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ins_ts);
		p.columnExtSysUsrDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ins_func_id_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ins_func_id);
		p.columnExtSysUsrDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.ins_func_nm_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_ins_func_nm);
		p.columnExtSysUsrDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_cntr_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_cntr);
		p.columnExtSysUsrDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_usr_id_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_usr_id);
		p.columnExtSysUsrDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_usr_nm_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_usr_nm);
		p.columnExtSysUsrDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_ts_META);
		p.columnExtSysUsrDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_ts);
		p.columnExtSysUsrDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_func_id_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_func_id);
		p.columnExtSysUsrDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_func_nm_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_func_nm);
		p.columnExtSysUsrDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.upd_srv_req_no_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_upd_srv_req_no);
		p.columnExtSysUsrDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.del_usr_id_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_del_usr_id);
		p.columnExtSysUsrDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.del_usr_nm_META);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_del_usr_nm);
		p.columnExtSysUsrDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.del_ts_META);
		p.columnExtSysUsrDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ExtSysUsrDtlTable.addColumnConfig(p.columnExtSysUsrDtl_del_ts);
		// スクロール固定カラムの指定
		p.ExtSysUsrDtlTable.setUnscrollColumn(p.columnExtSysUsrDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_ExtSysReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP1500.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP1500.LclR.ext_sys_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_ext_sys_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP1500.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP1500.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_ext_sys_nm.setMeta(mcframe.clientMABC.MABCP1500.LclR.ext_sys_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ext_sys_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP1500.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP1500.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP1500.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1500.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP1500.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1500.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1500.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1500.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ext_sys_cd.getListConfig().setPutter(getCnd_ext_sys_cd_ListPutter());
		columnDtl_ext_sys_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ext_sys_typ.getListConfig().setPutter(getDtl_ext_sys_typ_ListPutter());
		columnDtl_if_upd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_if_upd_typ.getListConfig().setPutter(getDtl_if_upd_typ_ListPutter());
		columnProtoDtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnProtoDtl_if_proc_typ.getListConfig().setPutter(getProtoDtl_if_proc_typ_ListPutter());
		columnProtoDtl_if_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnProtoDtl_if_ctl_typ.getListConfig().setPutter(getProtoDtl_if_ctl_typ_ListPutter());
		columnAdapDtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnAdapDtl_if_proc_typ.getListConfig().setPutter(getAdapDtl_if_proc_typ_ListPutter());
		columnHttpHeaderDtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnHttpHeaderDtl_if_proc_typ.getListConfig().setPutter(getHttpHeaderDtl_if_proc_typ_ListPutter());
		columnExtSysUsrDtl_usr_cd.getListConfig().setPutter(getExtSysUsrDtl_usr_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSys");
		return lp;
	}
	 
	/**
	 * [Dtl_ext_sys_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ext_sys_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSysTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_if_upd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_if_upd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfUpdTyp");
		return lp;
	}
	 
	/**
	 * [ProtoDtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createProtoDtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
	}
	 
	/**
	 * [ProtoDtl_if_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createProtoDtl_if_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfCtlTyp");
		return lp;
	}
	 
	/**
	 * [AdapDtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createAdapDtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
	}
	 
	/**
	 * [HttpHeaderDtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createHttpHeaderDtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
	}
	 
	/**
	 * [ExtSysUsrDtl_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createExtSysUsrDtl_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ext_sys_cd) return getCnd_ext_sys_cd(row, info);
		if(combo == columnDtl_ext_sys_typ) return getDtl_ext_sys_typ(row, info);
		if(combo == columnDtl_if_upd_typ) return getDtl_if_upd_typ(row, info);
		if(combo == columnProtoDtl_if_proc_typ) return getProtoDtl_if_proc_typ(row, info);
		if(combo == columnProtoDtl_if_ctl_typ) return getProtoDtl_if_ctl_typ(row, info);
		if(combo == columnAdapDtl_if_proc_typ) return getAdapDtl_if_proc_typ(row, info);
		if(combo == columnHttpHeaderDtl_if_proc_typ) return getHttpHeaderDtl_if_proc_typ(row, info);
		if(combo == columnExtSysUsrDtl_usr_cd) return getExtSysUsrDtl_usr_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
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
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == ProtoDtlBtn_select_all) doProtoDtlBtn_select_all(info);
		else if (ap == ProtoDtlBtn_deselect_all) doProtoDtlBtn_deselect_all(info);
		else if (ap == ProtoDtlBtn_radd) doProtoDtlBtn_radd(info);
		else if (ap == ProtoDtlBtn_rdel) doProtoDtlBtn_rdel(info);
		else if (ap == ProtoDtlBtn_rcopy) doProtoDtlBtn_rcopy(info);
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == AdapDtlBtn_select_all) doAdapDtlBtn_select_all(info);
		else if (ap == AdapDtlBtn_deselect_all) doAdapDtlBtn_deselect_all(info);
		else if (ap == AdapDtlBtn_radd) doAdapDtlBtn_radd(info);
		else if (ap == AdapDtlBtn_rdel) doAdapDtlBtn_rdel(info);
		else if (ap == AdapDtlBtn_rcopy) doAdapDtlBtn_rcopy(info);
		else if (ap == HttpHeaderDtlBtn_select_all) doHttpHeaderDtlBtn_select_all(info);
		else if (ap == HttpHeaderDtlBtn_deselect_all) doHttpHeaderDtlBtn_deselect_all(info);
		else if (ap == HttpHeaderDtlBtn_radd) doHttpHeaderDtlBtn_radd(info);
		else if (ap == HttpHeaderDtlBtn_rdel) doHttpHeaderDtlBtn_rdel(info);
		else if (ap == HttpHeaderDtlBtn_rcopy) doHttpHeaderDtlBtn_rcopy(info);
		else if (ap == ExtSysUsrDtlBtn_select_all) doExtSysUsrDtlBtn_select_all(info);
		else if (ap == ExtSysUsrDtlBtn_deselect_all) doExtSysUsrDtlBtn_deselect_all(info);
		else if (ap == ExtSysUsrDtlBtn_radd) doExtSysUsrDtlBtn_radd(info);
		else if (ap == ExtSysUsrDtlBtn_rdel) doExtSysUsrDtlBtn_rdel(info);
		else if (ap == ExtSysUsrDtlBtn_rcopy) doExtSysUsrDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [ProtoDtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doProtoDtlBtn_select_all(MCEventInfo info);

	/**
	 * [ProtoDtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doProtoDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [ProtoDtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doProtoDtlBtn_radd(MCEventInfo info);

	/**
	 * [ProtoDtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doProtoDtlBtn_rdel(MCEventInfo info);

	/**
	 * [ProtoDtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doProtoDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

	/**
	 * [AdapDtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAdapDtlBtn_select_all(MCEventInfo info);

	/**
	 * [AdapDtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAdapDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [AdapDtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAdapDtlBtn_radd(MCEventInfo info);

	/**
	 * [AdapDtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAdapDtlBtn_rdel(MCEventInfo info);

	/**
	 * [AdapDtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAdapDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [HttpHeaderDtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHttpHeaderDtlBtn_select_all(MCEventInfo info);

	/**
	 * [HttpHeaderDtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHttpHeaderDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [HttpHeaderDtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHttpHeaderDtlBtn_radd(MCEventInfo info);

	/**
	 * [HttpHeaderDtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHttpHeaderDtlBtn_rdel(MCEventInfo info);

	/**
	 * [HttpHeaderDtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHttpHeaderDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [ExtSysUsrDtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doExtSysUsrDtlBtn_select_all(MCEventInfo info);

	/**
	 * [ExtSysUsrDtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doExtSysUsrDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [ExtSysUsrDtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doExtSysUsrDtlBtn_radd(MCEventInfo info);

	/**
	 * [ExtSysUsrDtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doExtSysUsrDtlBtn_rdel(MCEventInfo info);

	/**
	 * [ExtSysUsrDtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doExtSysUsrDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == BLTabTab) return doBLTab_VC(info);
		if (vc == ProtoDtlTable) return doProtoDtl_VC(info);
		if (vc == AdapDtlTable) return doAdapDtl_VC(info);
		if (vc == HttpHeaderDtlTable) return doHttpHeaderDtl_VC(info);
		if (vc == ExtSysUsrDtlTable) return doExtSysUsrDtl_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm_lcl) return doDtl_ext_sys_nm_lcl_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_ext_sys_typ) return doDtl_ext_sys_typ_VC(info);
		if (vc == columnDtl_ext_sys_typ_nm) return doDtl_ext_sys_typ_nm_VC(info);
		if (vc == columnDtl_web_api_flg) return doDtl_web_api_flg_VC(info);
		if (vc == columnDtl_cmd_exec_flg) return doDtl_cmd_exec_flg_VC(info);
		if (vc == columnDtl_real_imp_flg) return doDtl_real_imp_flg_VC(info);
		if (vc == columnDtl_not_send_upd_flg) return doDtl_not_send_upd_flg_VC(info);
		if (vc == columnDtl_not_dup_imp_flg) return doDtl_not_dup_imp_flg_VC(info);
		if (vc == columnDtl_if_upd_typ) return doDtl_if_upd_typ_VC(info);
		if (vc == columnDtl_if_upd_typ_nm) return doDtl_if_upd_typ_nm_VC(info);
		if (vc == columnDtl_dlv_slip_split_flg) return doDtl_dlv_slip_split_flg_VC(info);
		if (vc == columnDtl_null_val_if_flg) return doDtl_null_val_if_flg_VC(info);
		if (vc == columnDtl_upri_not_chk_flg) return doDtl_upri_not_chk_flg_VC(info);
		if (vc == columnDtl_amt_not_chk_flg) return doDtl_amt_not_chk_flg_VC(info);
		if (vc == columnDtl_tax_not_chk_flg) return doDtl_tax_not_chk_flg_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		if (vc == columnProtoDtl_check) return doProtoDtl_check_VC(info);
		if (vc == columnProtoDtl_del_flg) return doProtoDtl_del_flg_VC(info);
		if (vc == columnProtoDtl_ext_sys_cd) return doProtoDtl_ext_sys_cd_VC(info);
		if (vc == columnProtoDtl_if_proc_typ) return doProtoDtl_if_proc_typ_VC(info);
		if (vc == columnProtoDtl_if_proc_typ_nm) return doProtoDtl_if_proc_typ_nm_VC(info);
		if (vc == columnProtoDtl_if_ctl_typ) return doProtoDtl_if_ctl_typ_VC(info);
		if (vc == columnProtoDtl_if_ctl_typ_nm) return doProtoDtl_if_ctl_typ_nm_VC(info);
		if (vc == columnProtoDtl_var_str) return doProtoDtl_var_str_VC(info);
		if (vc == columnProtoDtl_var_num) return doProtoDtl_var_num_VC(info);
		if (vc == columnProtoDtl_memo1) return doProtoDtl_memo1_VC(info);
		if (vc == columnProtoDtl_memo2) return doProtoDtl_memo2_VC(info);
		if (vc == columnProtoDtl_memo3) return doProtoDtl_memo3_VC(info);
		if (vc == columnProtoDtl_ins_usr_id) return doProtoDtl_ins_usr_id_VC(info);
		if (vc == columnProtoDtl_ins_usr_nm) return doProtoDtl_ins_usr_nm_VC(info);
		if (vc == columnProtoDtl_ins_ts) return doProtoDtl_ins_ts_VC(info);
		if (vc == columnProtoDtl_ins_func_id) return doProtoDtl_ins_func_id_VC(info);
		if (vc == columnProtoDtl_ins_func_nm) return doProtoDtl_ins_func_nm_VC(info);
		if (vc == columnProtoDtl_upd_cntr) return doProtoDtl_upd_cntr_VC(info);
		if (vc == columnProtoDtl_upd_usr_id) return doProtoDtl_upd_usr_id_VC(info);
		if (vc == columnProtoDtl_upd_usr_nm) return doProtoDtl_upd_usr_nm_VC(info);
		if (vc == columnProtoDtl_upd_ts) return doProtoDtl_upd_ts_VC(info);
		if (vc == columnProtoDtl_upd_func_id) return doProtoDtl_upd_func_id_VC(info);
		if (vc == columnProtoDtl_upd_func_nm) return doProtoDtl_upd_func_nm_VC(info);
		if (vc == columnProtoDtl_upd_srv_req_no) return doProtoDtl_upd_srv_req_no_VC(info);
		if (vc == columnProtoDtl_del_usr_id) return doProtoDtl_del_usr_id_VC(info);
		if (vc == columnProtoDtl_del_usr_nm) return doProtoDtl_del_usr_nm_VC(info);
		if (vc == columnProtoDtl_del_ts) return doProtoDtl_del_ts_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnAdapDtl_check) return doAdapDtl_check_VC(info);
		if (vc == columnAdapDtl_del_flg) return doAdapDtl_del_flg_VC(info);
		if (vc == columnAdapDtl_ext_sys_cd) return doAdapDtl_ext_sys_cd_VC(info);
		if (vc == columnAdapDtl_if_proc_typ) return doAdapDtl_if_proc_typ_VC(info);
		if (vc == columnAdapDtl_if_proc_typ_nm) return doAdapDtl_if_proc_typ_nm_VC(info);
		if (vc == columnAdapDtl_conv_ope) return doAdapDtl_conv_ope_VC(info);
		if (vc == columnAdapDtl_file_io_ope) return doAdapDtl_file_io_ope_VC(info);
		if (vc == columnAdapDtl_web_api_ope) return doAdapDtl_web_api_ope_VC(info);
		if (vc == columnAdapDtl_cmd_exec_ope) return doAdapDtl_cmd_exec_ope_VC(info);
		if (vc == columnAdapDtl_memo1) return doAdapDtl_memo1_VC(info);
		if (vc == columnAdapDtl_memo2) return doAdapDtl_memo2_VC(info);
		if (vc == columnAdapDtl_memo3) return doAdapDtl_memo3_VC(info);
		if (vc == columnAdapDtl_ins_usr_id) return doAdapDtl_ins_usr_id_VC(info);
		if (vc == columnAdapDtl_ins_usr_nm) return doAdapDtl_ins_usr_nm_VC(info);
		if (vc == columnAdapDtl_ins_ts) return doAdapDtl_ins_ts_VC(info);
		if (vc == columnAdapDtl_ins_func_id) return doAdapDtl_ins_func_id_VC(info);
		if (vc == columnAdapDtl_ins_func_nm) return doAdapDtl_ins_func_nm_VC(info);
		if (vc == columnAdapDtl_upd_cntr) return doAdapDtl_upd_cntr_VC(info);
		if (vc == columnAdapDtl_upd_usr_id) return doAdapDtl_upd_usr_id_VC(info);
		if (vc == columnAdapDtl_upd_usr_nm) return doAdapDtl_upd_usr_nm_VC(info);
		if (vc == columnAdapDtl_upd_ts) return doAdapDtl_upd_ts_VC(info);
		if (vc == columnAdapDtl_upd_func_id) return doAdapDtl_upd_func_id_VC(info);
		if (vc == columnAdapDtl_upd_func_nm) return doAdapDtl_upd_func_nm_VC(info);
		if (vc == columnAdapDtl_upd_srv_req_no) return doAdapDtl_upd_srv_req_no_VC(info);
		if (vc == columnAdapDtl_del_usr_id) return doAdapDtl_del_usr_id_VC(info);
		if (vc == columnAdapDtl_del_usr_nm) return doAdapDtl_del_usr_nm_VC(info);
		if (vc == columnAdapDtl_del_ts) return doAdapDtl_del_ts_VC(info);
		if (vc == columnHttpHeaderDtl_check) return doHttpHeaderDtl_check_VC(info);
		if (vc == columnHttpHeaderDtl_del_flg) return doHttpHeaderDtl_del_flg_VC(info);
		if (vc == columnHttpHeaderDtl_ext_sys_cd) return doHttpHeaderDtl_ext_sys_cd_VC(info);
		if (vc == columnHttpHeaderDtl_if_proc_typ) return doHttpHeaderDtl_if_proc_typ_VC(info);
		if (vc == columnHttpHeaderDtl_if_proc_typ_nm) return doHttpHeaderDtl_if_proc_typ_nm_VC(info);
		if (vc == columnHttpHeaderDtl_http_header_nm) return doHttpHeaderDtl_http_header_nm_VC(info);
		if (vc == columnHttpHeaderDtl_http_header_val) return doHttpHeaderDtl_http_header_val_VC(info);
		if (vc == columnHttpHeaderDtl_memo1) return doHttpHeaderDtl_memo1_VC(info);
		if (vc == columnHttpHeaderDtl_memo2) return doHttpHeaderDtl_memo2_VC(info);
		if (vc == columnHttpHeaderDtl_memo3) return doHttpHeaderDtl_memo3_VC(info);
		if (vc == columnHttpHeaderDtl_ins_usr_id) return doHttpHeaderDtl_ins_usr_id_VC(info);
		if (vc == columnHttpHeaderDtl_ins_usr_nm) return doHttpHeaderDtl_ins_usr_nm_VC(info);
		if (vc == columnHttpHeaderDtl_ins_ts) return doHttpHeaderDtl_ins_ts_VC(info);
		if (vc == columnHttpHeaderDtl_ins_func_id) return doHttpHeaderDtl_ins_func_id_VC(info);
		if (vc == columnHttpHeaderDtl_ins_func_nm) return doHttpHeaderDtl_ins_func_nm_VC(info);
		if (vc == columnHttpHeaderDtl_upd_cntr) return doHttpHeaderDtl_upd_cntr_VC(info);
		if (vc == columnHttpHeaderDtl_upd_usr_id) return doHttpHeaderDtl_upd_usr_id_VC(info);
		if (vc == columnHttpHeaderDtl_upd_usr_nm) return doHttpHeaderDtl_upd_usr_nm_VC(info);
		if (vc == columnHttpHeaderDtl_upd_ts) return doHttpHeaderDtl_upd_ts_VC(info);
		if (vc == columnHttpHeaderDtl_upd_func_id) return doHttpHeaderDtl_upd_func_id_VC(info);
		if (vc == columnHttpHeaderDtl_upd_func_nm) return doHttpHeaderDtl_upd_func_nm_VC(info);
		if (vc == columnHttpHeaderDtl_upd_srv_req_no) return doHttpHeaderDtl_upd_srv_req_no_VC(info);
		if (vc == columnHttpHeaderDtl_del_usr_id) return doHttpHeaderDtl_del_usr_id_VC(info);
		if (vc == columnHttpHeaderDtl_del_usr_nm) return doHttpHeaderDtl_del_usr_nm_VC(info);
		if (vc == columnHttpHeaderDtl_del_ts) return doHttpHeaderDtl_del_ts_VC(info);
		if (vc == columnExtSysUsrDtl_check) return doExtSysUsrDtl_check_VC(info);
		if (vc == columnExtSysUsrDtl_del_flg) return doExtSysUsrDtl_del_flg_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_cd) return doExtSysUsrDtl_ext_sys_cd_VC(info);
		if (vc == columnExtSysUsrDtl_usr_cd) return doExtSysUsrDtl_usr_cd_VC(info);
		if (vc == columnExtSysUsrDtl_usr_nm) return doExtSysUsrDtl_usr_nm_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_usr_cd) return doExtSysUsrDtl_ext_sys_usr_cd_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_pass) return doExtSysUsrDtl_ext_sys_pass_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_str1) return doExtSysUsrDtl_ext_sys_str1_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_str2) return doExtSysUsrDtl_ext_sys_str2_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_str3) return doExtSysUsrDtl_ext_sys_str3_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_str4) return doExtSysUsrDtl_ext_sys_str4_VC(info);
		if (vc == columnExtSysUsrDtl_ext_sys_str5) return doExtSysUsrDtl_ext_sys_str5_VC(info);
		if (vc == columnExtSysUsrDtl_memo1) return doExtSysUsrDtl_memo1_VC(info);
		if (vc == columnExtSysUsrDtl_memo2) return doExtSysUsrDtl_memo2_VC(info);
		if (vc == columnExtSysUsrDtl_memo3) return doExtSysUsrDtl_memo3_VC(info);
		if (vc == columnExtSysUsrDtl_ins_usr_id) return doExtSysUsrDtl_ins_usr_id_VC(info);
		if (vc == columnExtSysUsrDtl_ins_usr_nm) return doExtSysUsrDtl_ins_usr_nm_VC(info);
		if (vc == columnExtSysUsrDtl_ins_ts) return doExtSysUsrDtl_ins_ts_VC(info);
		if (vc == columnExtSysUsrDtl_ins_func_id) return doExtSysUsrDtl_ins_func_id_VC(info);
		if (vc == columnExtSysUsrDtl_ins_func_nm) return doExtSysUsrDtl_ins_func_nm_VC(info);
		if (vc == columnExtSysUsrDtl_upd_cntr) return doExtSysUsrDtl_upd_cntr_VC(info);
		if (vc == columnExtSysUsrDtl_upd_usr_id) return doExtSysUsrDtl_upd_usr_id_VC(info);
		if (vc == columnExtSysUsrDtl_upd_usr_nm) return doExtSysUsrDtl_upd_usr_nm_VC(info);
		if (vc == columnExtSysUsrDtl_upd_ts) return doExtSysUsrDtl_upd_ts_VC(info);
		if (vc == columnExtSysUsrDtl_upd_func_id) return doExtSysUsrDtl_upd_func_id_VC(info);
		if (vc == columnExtSysUsrDtl_upd_func_nm) return doExtSysUsrDtl_upd_func_nm_VC(info);
		if (vc == columnExtSysUsrDtl_upd_srv_req_no) return doExtSysUsrDtl_upd_srv_req_no_VC(info);
		if (vc == columnExtSysUsrDtl_del_usr_id) return doExtSysUsrDtl_del_usr_id_VC(info);
		if (vc == columnExtSysUsrDtl_del_usr_nm) return doExtSysUsrDtl_del_usr_nm_VC(info);
		if (vc == columnExtSysUsrDtl_del_ts) return doExtSysUsrDtl_del_ts_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_ext_sys_cd) return doLcl_ext_sys_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_ext_sys_nm) return doLcl_ext_sys_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
		if (vc == Rarea_if_ctl_typ_nm) return doRarea_if_ctl_typ_nm_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BLTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBLTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[web_api_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_web_api_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cmd_exec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cmd_exec_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[real_imp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_real_imp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_send_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_send_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_dup_imp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_dup_imp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_upd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_upd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_upd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_upd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_split_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_split_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[null_val_if_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_null_val_if_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upri_not_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upri_not_chk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_not_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_not_chk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tax_not_chk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tax_not_chk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_if_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_if_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[var_str]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_var_str_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[var_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_var_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ProtoDtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doProtoDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[conv_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_conv_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[file_io_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_file_io_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[web_api_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_web_api_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[cmd_exec_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_cmd_exec_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [AdapDtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAdapDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_http_header_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_http_header_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHttpHeaderDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_pass]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_pass_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_str1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_str2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_str3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_str4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ext_sys_str5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doExtSysUsrDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rarea]パネルの[if_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRarea_if_ctl_typ_nm_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == BLTabTab) doBLTab_NC(info);
		else if (nc == ProtoDtlTable) doProtoDtl_NC(info);
		else if (nc == AdapDtlTable) doAdapDtl_NC(info);
		else if (nc == HttpHeaderDtlTable) doHttpHeaderDtl_NC(info);
		else if (nc == ExtSysUsrDtlTable) doExtSysUsrDtl_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm_lcl) doDtl_ext_sys_nm_lcl_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_ext_sys_typ) doDtl_ext_sys_typ_NC(info);
		else if (nc == columnDtl_ext_sys_typ_nm) doDtl_ext_sys_typ_nm_NC(info);
		else if (nc == columnDtl_web_api_flg) doDtl_web_api_flg_NC(info);
		else if (nc == columnDtl_cmd_exec_flg) doDtl_cmd_exec_flg_NC(info);
		else if (nc == columnDtl_real_imp_flg) doDtl_real_imp_flg_NC(info);
		else if (nc == columnDtl_not_send_upd_flg) doDtl_not_send_upd_flg_NC(info);
		else if (nc == columnDtl_not_dup_imp_flg) doDtl_not_dup_imp_flg_NC(info);
		else if (nc == columnDtl_if_upd_typ) doDtl_if_upd_typ_NC(info);
		else if (nc == columnDtl_if_upd_typ_nm) doDtl_if_upd_typ_nm_NC(info);
		else if (nc == columnDtl_dlv_slip_split_flg) doDtl_dlv_slip_split_flg_NC(info);
		else if (nc == columnDtl_null_val_if_flg) doDtl_null_val_if_flg_NC(info);
		else if (nc == columnDtl_upri_not_chk_flg) doDtl_upri_not_chk_flg_NC(info);
		else if (nc == columnDtl_amt_not_chk_flg) doDtl_amt_not_chk_flg_NC(info);
		else if (nc == columnDtl_tax_not_chk_flg) doDtl_tax_not_chk_flg_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
		else if (nc == columnProtoDtl_check) doProtoDtl_check_NC(info);
		else if (nc == columnProtoDtl_del_flg) doProtoDtl_del_flg_NC(info);
		else if (nc == columnProtoDtl_ext_sys_cd) doProtoDtl_ext_sys_cd_NC(info);
		else if (nc == columnProtoDtl_if_proc_typ) doProtoDtl_if_proc_typ_NC(info);
		else if (nc == columnProtoDtl_if_proc_typ_nm) doProtoDtl_if_proc_typ_nm_NC(info);
		else if (nc == columnProtoDtl_if_ctl_typ) doProtoDtl_if_ctl_typ_NC(info);
		else if (nc == columnProtoDtl_if_ctl_typ_nm) doProtoDtl_if_ctl_typ_nm_NC(info);
		else if (nc == columnProtoDtl_var_str) doProtoDtl_var_str_NC(info);
		else if (nc == columnProtoDtl_var_num) doProtoDtl_var_num_NC(info);
		else if (nc == columnProtoDtl_memo1) doProtoDtl_memo1_NC(info);
		else if (nc == columnProtoDtl_memo2) doProtoDtl_memo2_NC(info);
		else if (nc == columnProtoDtl_memo3) doProtoDtl_memo3_NC(info);
		else if (nc == columnProtoDtl_ins_usr_id) doProtoDtl_ins_usr_id_NC(info);
		else if (nc == columnProtoDtl_ins_usr_nm) doProtoDtl_ins_usr_nm_NC(info);
		else if (nc == columnProtoDtl_ins_ts) doProtoDtl_ins_ts_NC(info);
		else if (nc == columnProtoDtl_ins_func_id) doProtoDtl_ins_func_id_NC(info);
		else if (nc == columnProtoDtl_ins_func_nm) doProtoDtl_ins_func_nm_NC(info);
		else if (nc == columnProtoDtl_upd_cntr) doProtoDtl_upd_cntr_NC(info);
		else if (nc == columnProtoDtl_upd_usr_id) doProtoDtl_upd_usr_id_NC(info);
		else if (nc == columnProtoDtl_upd_usr_nm) doProtoDtl_upd_usr_nm_NC(info);
		else if (nc == columnProtoDtl_upd_ts) doProtoDtl_upd_ts_NC(info);
		else if (nc == columnProtoDtl_upd_func_id) doProtoDtl_upd_func_id_NC(info);
		else if (nc == columnProtoDtl_upd_func_nm) doProtoDtl_upd_func_nm_NC(info);
		else if (nc == columnProtoDtl_upd_srv_req_no) doProtoDtl_upd_srv_req_no_NC(info);
		else if (nc == columnProtoDtl_del_usr_id) doProtoDtl_del_usr_id_NC(info);
		else if (nc == columnProtoDtl_del_usr_nm) doProtoDtl_del_usr_nm_NC(info);
		else if (nc == columnProtoDtl_del_ts) doProtoDtl_del_ts_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnAdapDtl_check) doAdapDtl_check_NC(info);
		else if (nc == columnAdapDtl_del_flg) doAdapDtl_del_flg_NC(info);
		else if (nc == columnAdapDtl_ext_sys_cd) doAdapDtl_ext_sys_cd_NC(info);
		else if (nc == columnAdapDtl_if_proc_typ) doAdapDtl_if_proc_typ_NC(info);
		else if (nc == columnAdapDtl_if_proc_typ_nm) doAdapDtl_if_proc_typ_nm_NC(info);
		else if (nc == columnAdapDtl_conv_ope) doAdapDtl_conv_ope_NC(info);
		else if (nc == columnAdapDtl_file_io_ope) doAdapDtl_file_io_ope_NC(info);
		else if (nc == columnAdapDtl_web_api_ope) doAdapDtl_web_api_ope_NC(info);
		else if (nc == columnAdapDtl_cmd_exec_ope) doAdapDtl_cmd_exec_ope_NC(info);
		else if (nc == columnAdapDtl_memo1) doAdapDtl_memo1_NC(info);
		else if (nc == columnAdapDtl_memo2) doAdapDtl_memo2_NC(info);
		else if (nc == columnAdapDtl_memo3) doAdapDtl_memo3_NC(info);
		else if (nc == columnAdapDtl_ins_usr_id) doAdapDtl_ins_usr_id_NC(info);
		else if (nc == columnAdapDtl_ins_usr_nm) doAdapDtl_ins_usr_nm_NC(info);
		else if (nc == columnAdapDtl_ins_ts) doAdapDtl_ins_ts_NC(info);
		else if (nc == columnAdapDtl_ins_func_id) doAdapDtl_ins_func_id_NC(info);
		else if (nc == columnAdapDtl_ins_func_nm) doAdapDtl_ins_func_nm_NC(info);
		else if (nc == columnAdapDtl_upd_cntr) doAdapDtl_upd_cntr_NC(info);
		else if (nc == columnAdapDtl_upd_usr_id) doAdapDtl_upd_usr_id_NC(info);
		else if (nc == columnAdapDtl_upd_usr_nm) doAdapDtl_upd_usr_nm_NC(info);
		else if (nc == columnAdapDtl_upd_ts) doAdapDtl_upd_ts_NC(info);
		else if (nc == columnAdapDtl_upd_func_id) doAdapDtl_upd_func_id_NC(info);
		else if (nc == columnAdapDtl_upd_func_nm) doAdapDtl_upd_func_nm_NC(info);
		else if (nc == columnAdapDtl_upd_srv_req_no) doAdapDtl_upd_srv_req_no_NC(info);
		else if (nc == columnAdapDtl_del_usr_id) doAdapDtl_del_usr_id_NC(info);
		else if (nc == columnAdapDtl_del_usr_nm) doAdapDtl_del_usr_nm_NC(info);
		else if (nc == columnAdapDtl_del_ts) doAdapDtl_del_ts_NC(info);
		else if (nc == columnHttpHeaderDtl_check) doHttpHeaderDtl_check_NC(info);
		else if (nc == columnHttpHeaderDtl_del_flg) doHttpHeaderDtl_del_flg_NC(info);
		else if (nc == columnHttpHeaderDtl_ext_sys_cd) doHttpHeaderDtl_ext_sys_cd_NC(info);
		else if (nc == columnHttpHeaderDtl_if_proc_typ) doHttpHeaderDtl_if_proc_typ_NC(info);
		else if (nc == columnHttpHeaderDtl_if_proc_typ_nm) doHttpHeaderDtl_if_proc_typ_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_http_header_nm) doHttpHeaderDtl_http_header_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_http_header_val) doHttpHeaderDtl_http_header_val_NC(info);
		else if (nc == columnHttpHeaderDtl_memo1) doHttpHeaderDtl_memo1_NC(info);
		else if (nc == columnHttpHeaderDtl_memo2) doHttpHeaderDtl_memo2_NC(info);
		else if (nc == columnHttpHeaderDtl_memo3) doHttpHeaderDtl_memo3_NC(info);
		else if (nc == columnHttpHeaderDtl_ins_usr_id) doHttpHeaderDtl_ins_usr_id_NC(info);
		else if (nc == columnHttpHeaderDtl_ins_usr_nm) doHttpHeaderDtl_ins_usr_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_ins_ts) doHttpHeaderDtl_ins_ts_NC(info);
		else if (nc == columnHttpHeaderDtl_ins_func_id) doHttpHeaderDtl_ins_func_id_NC(info);
		else if (nc == columnHttpHeaderDtl_ins_func_nm) doHttpHeaderDtl_ins_func_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_cntr) doHttpHeaderDtl_upd_cntr_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_usr_id) doHttpHeaderDtl_upd_usr_id_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_usr_nm) doHttpHeaderDtl_upd_usr_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_ts) doHttpHeaderDtl_upd_ts_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_func_id) doHttpHeaderDtl_upd_func_id_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_func_nm) doHttpHeaderDtl_upd_func_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_upd_srv_req_no) doHttpHeaderDtl_upd_srv_req_no_NC(info);
		else if (nc == columnHttpHeaderDtl_del_usr_id) doHttpHeaderDtl_del_usr_id_NC(info);
		else if (nc == columnHttpHeaderDtl_del_usr_nm) doHttpHeaderDtl_del_usr_nm_NC(info);
		else if (nc == columnHttpHeaderDtl_del_ts) doHttpHeaderDtl_del_ts_NC(info);
		else if (nc == columnExtSysUsrDtl_check) doExtSysUsrDtl_check_NC(info);
		else if (nc == columnExtSysUsrDtl_del_flg) doExtSysUsrDtl_del_flg_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_cd) doExtSysUsrDtl_ext_sys_cd_NC(info);
		else if (nc == columnExtSysUsrDtl_usr_cd) doExtSysUsrDtl_usr_cd_NC(info);
		else if (nc == columnExtSysUsrDtl_usr_nm) doExtSysUsrDtl_usr_nm_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_usr_cd) doExtSysUsrDtl_ext_sys_usr_cd_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_pass) doExtSysUsrDtl_ext_sys_pass_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_str1) doExtSysUsrDtl_ext_sys_str1_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_str2) doExtSysUsrDtl_ext_sys_str2_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_str3) doExtSysUsrDtl_ext_sys_str3_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_str4) doExtSysUsrDtl_ext_sys_str4_NC(info);
		else if (nc == columnExtSysUsrDtl_ext_sys_str5) doExtSysUsrDtl_ext_sys_str5_NC(info);
		else if (nc == columnExtSysUsrDtl_memo1) doExtSysUsrDtl_memo1_NC(info);
		else if (nc == columnExtSysUsrDtl_memo2) doExtSysUsrDtl_memo2_NC(info);
		else if (nc == columnExtSysUsrDtl_memo3) doExtSysUsrDtl_memo3_NC(info);
		else if (nc == columnExtSysUsrDtl_ins_usr_id) doExtSysUsrDtl_ins_usr_id_NC(info);
		else if (nc == columnExtSysUsrDtl_ins_usr_nm) doExtSysUsrDtl_ins_usr_nm_NC(info);
		else if (nc == columnExtSysUsrDtl_ins_ts) doExtSysUsrDtl_ins_ts_NC(info);
		else if (nc == columnExtSysUsrDtl_ins_func_id) doExtSysUsrDtl_ins_func_id_NC(info);
		else if (nc == columnExtSysUsrDtl_ins_func_nm) doExtSysUsrDtl_ins_func_nm_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_cntr) doExtSysUsrDtl_upd_cntr_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_usr_id) doExtSysUsrDtl_upd_usr_id_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_usr_nm) doExtSysUsrDtl_upd_usr_nm_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_ts) doExtSysUsrDtl_upd_ts_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_func_id) doExtSysUsrDtl_upd_func_id_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_func_nm) doExtSysUsrDtl_upd_func_nm_NC(info);
		else if (nc == columnExtSysUsrDtl_upd_srv_req_no) doExtSysUsrDtl_upd_srv_req_no_NC(info);
		else if (nc == columnExtSysUsrDtl_del_usr_id) doExtSysUsrDtl_del_usr_id_NC(info);
		else if (nc == columnExtSysUsrDtl_del_usr_nm) doExtSysUsrDtl_del_usr_nm_NC(info);
		else if (nc == columnExtSysUsrDtl_del_ts) doExtSysUsrDtl_del_ts_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_ext_sys_cd) doLcl_ext_sys_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_ext_sys_nm) doLcl_ext_sys_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
		else if (nc == Rarea_if_ctl_typ_nm) doRarea_if_ctl_typ_nm_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [BLTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBLTab_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cmd_exec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cmd_exec_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[real_imp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_real_imp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_send_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_send_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_dup_imp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_dup_imp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_split_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_split_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[null_val_if_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_null_val_if_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_not_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_not_chk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_not_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_not_chk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_not_chk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_not_chk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_str]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_str_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_num_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[conv_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_conv_ope_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[file_io_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_file_io_ope_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[web_api_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_web_api_ope_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[cmd_exec_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_cmd_exec_ope_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_val_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_pass]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_pass_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str1_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str2_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str3_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str4_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str5_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rarea]パネルの[if_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRarea_if_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == BLTabTab) doBLTab_NE(info);
		else if (ne == ProtoDtlTable) doProtoDtl_NE(info);
		else if (ne == AdapDtlTable) doAdapDtl_NE(info);
		else if (ne == HttpHeaderDtlTable) doHttpHeaderDtl_NE(info);
		else if (ne == ExtSysUsrDtlTable) doExtSysUsrDtl_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm_lcl) doDtl_ext_sys_nm_lcl_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_ext_sys_typ) doDtl_ext_sys_typ_NE(info);
		else if (ne == columnDtl_ext_sys_typ_nm) doDtl_ext_sys_typ_nm_NE(info);
		else if (ne == columnDtl_web_api_flg) doDtl_web_api_flg_NE(info);
		else if (ne == columnDtl_cmd_exec_flg) doDtl_cmd_exec_flg_NE(info);
		else if (ne == columnDtl_real_imp_flg) doDtl_real_imp_flg_NE(info);
		else if (ne == columnDtl_not_send_upd_flg) doDtl_not_send_upd_flg_NE(info);
		else if (ne == columnDtl_not_dup_imp_flg) doDtl_not_dup_imp_flg_NE(info);
		else if (ne == columnDtl_if_upd_typ) doDtl_if_upd_typ_NE(info);
		else if (ne == columnDtl_if_upd_typ_nm) doDtl_if_upd_typ_nm_NE(info);
		else if (ne == columnDtl_dlv_slip_split_flg) doDtl_dlv_slip_split_flg_NE(info);
		else if (ne == columnDtl_null_val_if_flg) doDtl_null_val_if_flg_NE(info);
		else if (ne == columnDtl_upri_not_chk_flg) doDtl_upri_not_chk_flg_NE(info);
		else if (ne == columnDtl_amt_not_chk_flg) doDtl_amt_not_chk_flg_NE(info);
		else if (ne == columnDtl_tax_not_chk_flg) doDtl_tax_not_chk_flg_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
		else if (ne == columnProtoDtl_check) doProtoDtl_check_NE(info);
		else if (ne == columnProtoDtl_del_flg) doProtoDtl_del_flg_NE(info);
		else if (ne == columnProtoDtl_ext_sys_cd) doProtoDtl_ext_sys_cd_NE(info);
		else if (ne == columnProtoDtl_if_proc_typ) doProtoDtl_if_proc_typ_NE(info);
		else if (ne == columnProtoDtl_if_proc_typ_nm) doProtoDtl_if_proc_typ_nm_NE(info);
		else if (ne == columnProtoDtl_if_ctl_typ) doProtoDtl_if_ctl_typ_NE(info);
		else if (ne == columnProtoDtl_if_ctl_typ_nm) doProtoDtl_if_ctl_typ_nm_NE(info);
		else if (ne == columnProtoDtl_var_str) doProtoDtl_var_str_NE(info);
		else if (ne == columnProtoDtl_var_num) doProtoDtl_var_num_NE(info);
		else if (ne == columnProtoDtl_memo1) doProtoDtl_memo1_NE(info);
		else if (ne == columnProtoDtl_memo2) doProtoDtl_memo2_NE(info);
		else if (ne == columnProtoDtl_memo3) doProtoDtl_memo3_NE(info);
		else if (ne == columnProtoDtl_ins_usr_id) doProtoDtl_ins_usr_id_NE(info);
		else if (ne == columnProtoDtl_ins_usr_nm) doProtoDtl_ins_usr_nm_NE(info);
		else if (ne == columnProtoDtl_ins_ts) doProtoDtl_ins_ts_NE(info);
		else if (ne == columnProtoDtl_ins_func_id) doProtoDtl_ins_func_id_NE(info);
		else if (ne == columnProtoDtl_ins_func_nm) doProtoDtl_ins_func_nm_NE(info);
		else if (ne == columnProtoDtl_upd_cntr) doProtoDtl_upd_cntr_NE(info);
		else if (ne == columnProtoDtl_upd_usr_id) doProtoDtl_upd_usr_id_NE(info);
		else if (ne == columnProtoDtl_upd_usr_nm) doProtoDtl_upd_usr_nm_NE(info);
		else if (ne == columnProtoDtl_upd_ts) doProtoDtl_upd_ts_NE(info);
		else if (ne == columnProtoDtl_upd_func_id) doProtoDtl_upd_func_id_NE(info);
		else if (ne == columnProtoDtl_upd_func_nm) doProtoDtl_upd_func_nm_NE(info);
		else if (ne == columnProtoDtl_upd_srv_req_no) doProtoDtl_upd_srv_req_no_NE(info);
		else if (ne == columnProtoDtl_del_usr_id) doProtoDtl_del_usr_id_NE(info);
		else if (ne == columnProtoDtl_del_usr_nm) doProtoDtl_del_usr_nm_NE(info);
		else if (ne == columnProtoDtl_del_ts) doProtoDtl_del_ts_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnAdapDtl_check) doAdapDtl_check_NE(info);
		else if (ne == columnAdapDtl_del_flg) doAdapDtl_del_flg_NE(info);
		else if (ne == columnAdapDtl_ext_sys_cd) doAdapDtl_ext_sys_cd_NE(info);
		else if (ne == columnAdapDtl_if_proc_typ) doAdapDtl_if_proc_typ_NE(info);
		else if (ne == columnAdapDtl_if_proc_typ_nm) doAdapDtl_if_proc_typ_nm_NE(info);
		else if (ne == columnAdapDtl_conv_ope) doAdapDtl_conv_ope_NE(info);
		else if (ne == columnAdapDtl_file_io_ope) doAdapDtl_file_io_ope_NE(info);
		else if (ne == columnAdapDtl_web_api_ope) doAdapDtl_web_api_ope_NE(info);
		else if (ne == columnAdapDtl_cmd_exec_ope) doAdapDtl_cmd_exec_ope_NE(info);
		else if (ne == columnAdapDtl_memo1) doAdapDtl_memo1_NE(info);
		else if (ne == columnAdapDtl_memo2) doAdapDtl_memo2_NE(info);
		else if (ne == columnAdapDtl_memo3) doAdapDtl_memo3_NE(info);
		else if (ne == columnAdapDtl_ins_usr_id) doAdapDtl_ins_usr_id_NE(info);
		else if (ne == columnAdapDtl_ins_usr_nm) doAdapDtl_ins_usr_nm_NE(info);
		else if (ne == columnAdapDtl_ins_ts) doAdapDtl_ins_ts_NE(info);
		else if (ne == columnAdapDtl_ins_func_id) doAdapDtl_ins_func_id_NE(info);
		else if (ne == columnAdapDtl_ins_func_nm) doAdapDtl_ins_func_nm_NE(info);
		else if (ne == columnAdapDtl_upd_cntr) doAdapDtl_upd_cntr_NE(info);
		else if (ne == columnAdapDtl_upd_usr_id) doAdapDtl_upd_usr_id_NE(info);
		else if (ne == columnAdapDtl_upd_usr_nm) doAdapDtl_upd_usr_nm_NE(info);
		else if (ne == columnAdapDtl_upd_ts) doAdapDtl_upd_ts_NE(info);
		else if (ne == columnAdapDtl_upd_func_id) doAdapDtl_upd_func_id_NE(info);
		else if (ne == columnAdapDtl_upd_func_nm) doAdapDtl_upd_func_nm_NE(info);
		else if (ne == columnAdapDtl_upd_srv_req_no) doAdapDtl_upd_srv_req_no_NE(info);
		else if (ne == columnAdapDtl_del_usr_id) doAdapDtl_del_usr_id_NE(info);
		else if (ne == columnAdapDtl_del_usr_nm) doAdapDtl_del_usr_nm_NE(info);
		else if (ne == columnAdapDtl_del_ts) doAdapDtl_del_ts_NE(info);
		else if (ne == columnHttpHeaderDtl_check) doHttpHeaderDtl_check_NE(info);
		else if (ne == columnHttpHeaderDtl_del_flg) doHttpHeaderDtl_del_flg_NE(info);
		else if (ne == columnHttpHeaderDtl_ext_sys_cd) doHttpHeaderDtl_ext_sys_cd_NE(info);
		else if (ne == columnHttpHeaderDtl_if_proc_typ) doHttpHeaderDtl_if_proc_typ_NE(info);
		else if (ne == columnHttpHeaderDtl_if_proc_typ_nm) doHttpHeaderDtl_if_proc_typ_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_http_header_nm) doHttpHeaderDtl_http_header_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_http_header_val) doHttpHeaderDtl_http_header_val_NE(info);
		else if (ne == columnHttpHeaderDtl_memo1) doHttpHeaderDtl_memo1_NE(info);
		else if (ne == columnHttpHeaderDtl_memo2) doHttpHeaderDtl_memo2_NE(info);
		else if (ne == columnHttpHeaderDtl_memo3) doHttpHeaderDtl_memo3_NE(info);
		else if (ne == columnHttpHeaderDtl_ins_usr_id) doHttpHeaderDtl_ins_usr_id_NE(info);
		else if (ne == columnHttpHeaderDtl_ins_usr_nm) doHttpHeaderDtl_ins_usr_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_ins_ts) doHttpHeaderDtl_ins_ts_NE(info);
		else if (ne == columnHttpHeaderDtl_ins_func_id) doHttpHeaderDtl_ins_func_id_NE(info);
		else if (ne == columnHttpHeaderDtl_ins_func_nm) doHttpHeaderDtl_ins_func_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_cntr) doHttpHeaderDtl_upd_cntr_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_usr_id) doHttpHeaderDtl_upd_usr_id_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_usr_nm) doHttpHeaderDtl_upd_usr_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_ts) doHttpHeaderDtl_upd_ts_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_func_id) doHttpHeaderDtl_upd_func_id_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_func_nm) doHttpHeaderDtl_upd_func_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_upd_srv_req_no) doHttpHeaderDtl_upd_srv_req_no_NE(info);
		else if (ne == columnHttpHeaderDtl_del_usr_id) doHttpHeaderDtl_del_usr_id_NE(info);
		else if (ne == columnHttpHeaderDtl_del_usr_nm) doHttpHeaderDtl_del_usr_nm_NE(info);
		else if (ne == columnHttpHeaderDtl_del_ts) doHttpHeaderDtl_del_ts_NE(info);
		else if (ne == columnExtSysUsrDtl_check) doExtSysUsrDtl_check_NE(info);
		else if (ne == columnExtSysUsrDtl_del_flg) doExtSysUsrDtl_del_flg_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_cd) doExtSysUsrDtl_ext_sys_cd_NE(info);
		else if (ne == columnExtSysUsrDtl_usr_cd) doExtSysUsrDtl_usr_cd_NE(info);
		else if (ne == columnExtSysUsrDtl_usr_nm) doExtSysUsrDtl_usr_nm_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_usr_cd) doExtSysUsrDtl_ext_sys_usr_cd_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_pass) doExtSysUsrDtl_ext_sys_pass_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_str1) doExtSysUsrDtl_ext_sys_str1_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_str2) doExtSysUsrDtl_ext_sys_str2_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_str3) doExtSysUsrDtl_ext_sys_str3_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_str4) doExtSysUsrDtl_ext_sys_str4_NE(info);
		else if (ne == columnExtSysUsrDtl_ext_sys_str5) doExtSysUsrDtl_ext_sys_str5_NE(info);
		else if (ne == columnExtSysUsrDtl_memo1) doExtSysUsrDtl_memo1_NE(info);
		else if (ne == columnExtSysUsrDtl_memo2) doExtSysUsrDtl_memo2_NE(info);
		else if (ne == columnExtSysUsrDtl_memo3) doExtSysUsrDtl_memo3_NE(info);
		else if (ne == columnExtSysUsrDtl_ins_usr_id) doExtSysUsrDtl_ins_usr_id_NE(info);
		else if (ne == columnExtSysUsrDtl_ins_usr_nm) doExtSysUsrDtl_ins_usr_nm_NE(info);
		else if (ne == columnExtSysUsrDtl_ins_ts) doExtSysUsrDtl_ins_ts_NE(info);
		else if (ne == columnExtSysUsrDtl_ins_func_id) doExtSysUsrDtl_ins_func_id_NE(info);
		else if (ne == columnExtSysUsrDtl_ins_func_nm) doExtSysUsrDtl_ins_func_nm_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_cntr) doExtSysUsrDtl_upd_cntr_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_usr_id) doExtSysUsrDtl_upd_usr_id_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_usr_nm) doExtSysUsrDtl_upd_usr_nm_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_ts) doExtSysUsrDtl_upd_ts_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_func_id) doExtSysUsrDtl_upd_func_id_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_func_nm) doExtSysUsrDtl_upd_func_nm_NE(info);
		else if (ne == columnExtSysUsrDtl_upd_srv_req_no) doExtSysUsrDtl_upd_srv_req_no_NE(info);
		else if (ne == columnExtSysUsrDtl_del_usr_id) doExtSysUsrDtl_del_usr_id_NE(info);
		else if (ne == columnExtSysUsrDtl_del_usr_nm) doExtSysUsrDtl_del_usr_nm_NE(info);
		else if (ne == columnExtSysUsrDtl_del_ts) doExtSysUsrDtl_del_ts_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_ext_sys_cd) doLcl_ext_sys_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_ext_sys_nm) doLcl_ext_sys_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
		else if (ne == Rarea_if_ctl_typ_nm) doRarea_if_ctl_typ_nm_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [BLTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBLTab_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cmd_exec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cmd_exec_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[real_imp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_real_imp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_send_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_send_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_dup_imp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_dup_imp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_split_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_split_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[null_val_if_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_null_val_if_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_not_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_not_chk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_not_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_not_chk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_not_chk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_not_chk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_str]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_str_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_num_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[conv_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_conv_ope_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[file_io_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_file_io_ope_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[web_api_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_web_api_ope_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[cmd_exec_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_cmd_exec_ope_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_val_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_pass]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_pass_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str1_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str2_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str3_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str4_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str5_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rarea]パネルの[if_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRarea_if_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == BLTabTab) doBLTab_NX(info);
		else if (nx == ProtoDtlTable) doProtoDtl_NX(info);
		else if (nx == AdapDtlTable) doAdapDtl_NX(info);
		else if (nx == HttpHeaderDtlTable) doHttpHeaderDtl_NX(info);
		else if (nx == ExtSysUsrDtlTable) doExtSysUsrDtl_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm_lcl) doDtl_ext_sys_nm_lcl_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_ext_sys_typ) doDtl_ext_sys_typ_NX(info);
		else if (nx == columnDtl_ext_sys_typ_nm) doDtl_ext_sys_typ_nm_NX(info);
		else if (nx == columnDtl_web_api_flg) doDtl_web_api_flg_NX(info);
		else if (nx == columnDtl_cmd_exec_flg) doDtl_cmd_exec_flg_NX(info);
		else if (nx == columnDtl_real_imp_flg) doDtl_real_imp_flg_NX(info);
		else if (nx == columnDtl_not_send_upd_flg) doDtl_not_send_upd_flg_NX(info);
		else if (nx == columnDtl_not_dup_imp_flg) doDtl_not_dup_imp_flg_NX(info);
		else if (nx == columnDtl_if_upd_typ) doDtl_if_upd_typ_NX(info);
		else if (nx == columnDtl_if_upd_typ_nm) doDtl_if_upd_typ_nm_NX(info);
		else if (nx == columnDtl_dlv_slip_split_flg) doDtl_dlv_slip_split_flg_NX(info);
		else if (nx == columnDtl_null_val_if_flg) doDtl_null_val_if_flg_NX(info);
		else if (nx == columnDtl_upri_not_chk_flg) doDtl_upri_not_chk_flg_NX(info);
		else if (nx == columnDtl_amt_not_chk_flg) doDtl_amt_not_chk_flg_NX(info);
		else if (nx == columnDtl_tax_not_chk_flg) doDtl_tax_not_chk_flg_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
		else if (nx == columnProtoDtl_check) doProtoDtl_check_NX(info);
		else if (nx == columnProtoDtl_del_flg) doProtoDtl_del_flg_NX(info);
		else if (nx == columnProtoDtl_ext_sys_cd) doProtoDtl_ext_sys_cd_NX(info);
		else if (nx == columnProtoDtl_if_proc_typ) doProtoDtl_if_proc_typ_NX(info);
		else if (nx == columnProtoDtl_if_proc_typ_nm) doProtoDtl_if_proc_typ_nm_NX(info);
		else if (nx == columnProtoDtl_if_ctl_typ) doProtoDtl_if_ctl_typ_NX(info);
		else if (nx == columnProtoDtl_if_ctl_typ_nm) doProtoDtl_if_ctl_typ_nm_NX(info);
		else if (nx == columnProtoDtl_var_str) doProtoDtl_var_str_NX(info);
		else if (nx == columnProtoDtl_var_num) doProtoDtl_var_num_NX(info);
		else if (nx == columnProtoDtl_memo1) doProtoDtl_memo1_NX(info);
		else if (nx == columnProtoDtl_memo2) doProtoDtl_memo2_NX(info);
		else if (nx == columnProtoDtl_memo3) doProtoDtl_memo3_NX(info);
		else if (nx == columnProtoDtl_ins_usr_id) doProtoDtl_ins_usr_id_NX(info);
		else if (nx == columnProtoDtl_ins_usr_nm) doProtoDtl_ins_usr_nm_NX(info);
		else if (nx == columnProtoDtl_ins_ts) doProtoDtl_ins_ts_NX(info);
		else if (nx == columnProtoDtl_ins_func_id) doProtoDtl_ins_func_id_NX(info);
		else if (nx == columnProtoDtl_ins_func_nm) doProtoDtl_ins_func_nm_NX(info);
		else if (nx == columnProtoDtl_upd_cntr) doProtoDtl_upd_cntr_NX(info);
		else if (nx == columnProtoDtl_upd_usr_id) doProtoDtl_upd_usr_id_NX(info);
		else if (nx == columnProtoDtl_upd_usr_nm) doProtoDtl_upd_usr_nm_NX(info);
		else if (nx == columnProtoDtl_upd_ts) doProtoDtl_upd_ts_NX(info);
		else if (nx == columnProtoDtl_upd_func_id) doProtoDtl_upd_func_id_NX(info);
		else if (nx == columnProtoDtl_upd_func_nm) doProtoDtl_upd_func_nm_NX(info);
		else if (nx == columnProtoDtl_upd_srv_req_no) doProtoDtl_upd_srv_req_no_NX(info);
		else if (nx == columnProtoDtl_del_usr_id) doProtoDtl_del_usr_id_NX(info);
		else if (nx == columnProtoDtl_del_usr_nm) doProtoDtl_del_usr_nm_NX(info);
		else if (nx == columnProtoDtl_del_ts) doProtoDtl_del_ts_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnAdapDtl_check) doAdapDtl_check_NX(info);
		else if (nx == columnAdapDtl_del_flg) doAdapDtl_del_flg_NX(info);
		else if (nx == columnAdapDtl_ext_sys_cd) doAdapDtl_ext_sys_cd_NX(info);
		else if (nx == columnAdapDtl_if_proc_typ) doAdapDtl_if_proc_typ_NX(info);
		else if (nx == columnAdapDtl_if_proc_typ_nm) doAdapDtl_if_proc_typ_nm_NX(info);
		else if (nx == columnAdapDtl_conv_ope) doAdapDtl_conv_ope_NX(info);
		else if (nx == columnAdapDtl_file_io_ope) doAdapDtl_file_io_ope_NX(info);
		else if (nx == columnAdapDtl_web_api_ope) doAdapDtl_web_api_ope_NX(info);
		else if (nx == columnAdapDtl_cmd_exec_ope) doAdapDtl_cmd_exec_ope_NX(info);
		else if (nx == columnAdapDtl_memo1) doAdapDtl_memo1_NX(info);
		else if (nx == columnAdapDtl_memo2) doAdapDtl_memo2_NX(info);
		else if (nx == columnAdapDtl_memo3) doAdapDtl_memo3_NX(info);
		else if (nx == columnAdapDtl_ins_usr_id) doAdapDtl_ins_usr_id_NX(info);
		else if (nx == columnAdapDtl_ins_usr_nm) doAdapDtl_ins_usr_nm_NX(info);
		else if (nx == columnAdapDtl_ins_ts) doAdapDtl_ins_ts_NX(info);
		else if (nx == columnAdapDtl_ins_func_id) doAdapDtl_ins_func_id_NX(info);
		else if (nx == columnAdapDtl_ins_func_nm) doAdapDtl_ins_func_nm_NX(info);
		else if (nx == columnAdapDtl_upd_cntr) doAdapDtl_upd_cntr_NX(info);
		else if (nx == columnAdapDtl_upd_usr_id) doAdapDtl_upd_usr_id_NX(info);
		else if (nx == columnAdapDtl_upd_usr_nm) doAdapDtl_upd_usr_nm_NX(info);
		else if (nx == columnAdapDtl_upd_ts) doAdapDtl_upd_ts_NX(info);
		else if (nx == columnAdapDtl_upd_func_id) doAdapDtl_upd_func_id_NX(info);
		else if (nx == columnAdapDtl_upd_func_nm) doAdapDtl_upd_func_nm_NX(info);
		else if (nx == columnAdapDtl_upd_srv_req_no) doAdapDtl_upd_srv_req_no_NX(info);
		else if (nx == columnAdapDtl_del_usr_id) doAdapDtl_del_usr_id_NX(info);
		else if (nx == columnAdapDtl_del_usr_nm) doAdapDtl_del_usr_nm_NX(info);
		else if (nx == columnAdapDtl_del_ts) doAdapDtl_del_ts_NX(info);
		else if (nx == columnHttpHeaderDtl_check) doHttpHeaderDtl_check_NX(info);
		else if (nx == columnHttpHeaderDtl_del_flg) doHttpHeaderDtl_del_flg_NX(info);
		else if (nx == columnHttpHeaderDtl_ext_sys_cd) doHttpHeaderDtl_ext_sys_cd_NX(info);
		else if (nx == columnHttpHeaderDtl_if_proc_typ) doHttpHeaderDtl_if_proc_typ_NX(info);
		else if (nx == columnHttpHeaderDtl_if_proc_typ_nm) doHttpHeaderDtl_if_proc_typ_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_http_header_nm) doHttpHeaderDtl_http_header_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_http_header_val) doHttpHeaderDtl_http_header_val_NX(info);
		else if (nx == columnHttpHeaderDtl_memo1) doHttpHeaderDtl_memo1_NX(info);
		else if (nx == columnHttpHeaderDtl_memo2) doHttpHeaderDtl_memo2_NX(info);
		else if (nx == columnHttpHeaderDtl_memo3) doHttpHeaderDtl_memo3_NX(info);
		else if (nx == columnHttpHeaderDtl_ins_usr_id) doHttpHeaderDtl_ins_usr_id_NX(info);
		else if (nx == columnHttpHeaderDtl_ins_usr_nm) doHttpHeaderDtl_ins_usr_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_ins_ts) doHttpHeaderDtl_ins_ts_NX(info);
		else if (nx == columnHttpHeaderDtl_ins_func_id) doHttpHeaderDtl_ins_func_id_NX(info);
		else if (nx == columnHttpHeaderDtl_ins_func_nm) doHttpHeaderDtl_ins_func_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_cntr) doHttpHeaderDtl_upd_cntr_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_usr_id) doHttpHeaderDtl_upd_usr_id_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_usr_nm) doHttpHeaderDtl_upd_usr_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_ts) doHttpHeaderDtl_upd_ts_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_func_id) doHttpHeaderDtl_upd_func_id_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_func_nm) doHttpHeaderDtl_upd_func_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_upd_srv_req_no) doHttpHeaderDtl_upd_srv_req_no_NX(info);
		else if (nx == columnHttpHeaderDtl_del_usr_id) doHttpHeaderDtl_del_usr_id_NX(info);
		else if (nx == columnHttpHeaderDtl_del_usr_nm) doHttpHeaderDtl_del_usr_nm_NX(info);
		else if (nx == columnHttpHeaderDtl_del_ts) doHttpHeaderDtl_del_ts_NX(info);
		else if (nx == columnExtSysUsrDtl_check) doExtSysUsrDtl_check_NX(info);
		else if (nx == columnExtSysUsrDtl_del_flg) doExtSysUsrDtl_del_flg_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_cd) doExtSysUsrDtl_ext_sys_cd_NX(info);
		else if (nx == columnExtSysUsrDtl_usr_cd) doExtSysUsrDtl_usr_cd_NX(info);
		else if (nx == columnExtSysUsrDtl_usr_nm) doExtSysUsrDtl_usr_nm_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_usr_cd) doExtSysUsrDtl_ext_sys_usr_cd_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_pass) doExtSysUsrDtl_ext_sys_pass_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_str1) doExtSysUsrDtl_ext_sys_str1_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_str2) doExtSysUsrDtl_ext_sys_str2_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_str3) doExtSysUsrDtl_ext_sys_str3_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_str4) doExtSysUsrDtl_ext_sys_str4_NX(info);
		else if (nx == columnExtSysUsrDtl_ext_sys_str5) doExtSysUsrDtl_ext_sys_str5_NX(info);
		else if (nx == columnExtSysUsrDtl_memo1) doExtSysUsrDtl_memo1_NX(info);
		else if (nx == columnExtSysUsrDtl_memo2) doExtSysUsrDtl_memo2_NX(info);
		else if (nx == columnExtSysUsrDtl_memo3) doExtSysUsrDtl_memo3_NX(info);
		else if (nx == columnExtSysUsrDtl_ins_usr_id) doExtSysUsrDtl_ins_usr_id_NX(info);
		else if (nx == columnExtSysUsrDtl_ins_usr_nm) doExtSysUsrDtl_ins_usr_nm_NX(info);
		else if (nx == columnExtSysUsrDtl_ins_ts) doExtSysUsrDtl_ins_ts_NX(info);
		else if (nx == columnExtSysUsrDtl_ins_func_id) doExtSysUsrDtl_ins_func_id_NX(info);
		else if (nx == columnExtSysUsrDtl_ins_func_nm) doExtSysUsrDtl_ins_func_nm_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_cntr) doExtSysUsrDtl_upd_cntr_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_usr_id) doExtSysUsrDtl_upd_usr_id_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_usr_nm) doExtSysUsrDtl_upd_usr_nm_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_ts) doExtSysUsrDtl_upd_ts_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_func_id) doExtSysUsrDtl_upd_func_id_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_func_nm) doExtSysUsrDtl_upd_func_nm_NX(info);
		else if (nx == columnExtSysUsrDtl_upd_srv_req_no) doExtSysUsrDtl_upd_srv_req_no_NX(info);
		else if (nx == columnExtSysUsrDtl_del_usr_id) doExtSysUsrDtl_del_usr_id_NX(info);
		else if (nx == columnExtSysUsrDtl_del_usr_nm) doExtSysUsrDtl_del_usr_nm_NX(info);
		else if (nx == columnExtSysUsrDtl_del_ts) doExtSysUsrDtl_del_ts_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_ext_sys_cd) doLcl_ext_sys_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_ext_sys_nm) doLcl_ext_sys_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
		else if (nx == Rarea_if_ctl_typ_nm) doRarea_if_ctl_typ_nm_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [BLTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBLTab_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cmd_exec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cmd_exec_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[real_imp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_real_imp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_send_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_send_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_dup_imp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_dup_imp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_split_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_split_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[null_val_if_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_null_val_if_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_not_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_not_chk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_not_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_not_chk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_not_chk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_not_chk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_str]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_str_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_num_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[conv_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_conv_ope_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[file_io_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_file_io_ope_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[web_api_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_web_api_ope_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[cmd_exec_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_cmd_exec_ope_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_val_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_pass]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_pass_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str1_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str2_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str3_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str4_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str5_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rarea]パネルの[if_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRarea_if_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm_lcl) doDtl_ext_sys_nm_lcl_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_ext_sys_typ) doDtl_ext_sys_typ_LC(info);
		else if (lc == columnDtl_ext_sys_typ_nm) doDtl_ext_sys_typ_nm_LC(info);
		else if (lc == columnDtl_if_upd_typ) doDtl_if_upd_typ_LC(info);
		else if (lc == columnDtl_if_upd_typ_nm) doDtl_if_upd_typ_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
		else if (lc == columnProtoDtl_ext_sys_cd) doProtoDtl_ext_sys_cd_LC(info);
		else if (lc == columnProtoDtl_if_proc_typ) doProtoDtl_if_proc_typ_LC(info);
		else if (lc == columnProtoDtl_if_proc_typ_nm) doProtoDtl_if_proc_typ_nm_LC(info);
		else if (lc == columnProtoDtl_if_ctl_typ) doProtoDtl_if_ctl_typ_LC(info);
		else if (lc == columnProtoDtl_if_ctl_typ_nm) doProtoDtl_if_ctl_typ_nm_LC(info);
		else if (lc == columnProtoDtl_var_str) doProtoDtl_var_str_LC(info);
		else if (lc == columnProtoDtl_var_num) doProtoDtl_var_num_LC(info);
		else if (lc == columnProtoDtl_memo1) doProtoDtl_memo1_LC(info);
		else if (lc == columnProtoDtl_memo2) doProtoDtl_memo2_LC(info);
		else if (lc == columnProtoDtl_memo3) doProtoDtl_memo3_LC(info);
		else if (lc == columnProtoDtl_ins_usr_id) doProtoDtl_ins_usr_id_LC(info);
		else if (lc == columnProtoDtl_ins_usr_nm) doProtoDtl_ins_usr_nm_LC(info);
		else if (lc == columnProtoDtl_ins_ts) doProtoDtl_ins_ts_LC(info);
		else if (lc == columnProtoDtl_ins_func_id) doProtoDtl_ins_func_id_LC(info);
		else if (lc == columnProtoDtl_ins_func_nm) doProtoDtl_ins_func_nm_LC(info);
		else if (lc == columnProtoDtl_upd_cntr) doProtoDtl_upd_cntr_LC(info);
		else if (lc == columnProtoDtl_upd_usr_id) doProtoDtl_upd_usr_id_LC(info);
		else if (lc == columnProtoDtl_upd_usr_nm) doProtoDtl_upd_usr_nm_LC(info);
		else if (lc == columnProtoDtl_upd_ts) doProtoDtl_upd_ts_LC(info);
		else if (lc == columnProtoDtl_upd_func_id) doProtoDtl_upd_func_id_LC(info);
		else if (lc == columnProtoDtl_upd_func_nm) doProtoDtl_upd_func_nm_LC(info);
		else if (lc == columnProtoDtl_upd_srv_req_no) doProtoDtl_upd_srv_req_no_LC(info);
		else if (lc == columnProtoDtl_del_usr_id) doProtoDtl_del_usr_id_LC(info);
		else if (lc == columnProtoDtl_del_usr_nm) doProtoDtl_del_usr_nm_LC(info);
		else if (lc == columnProtoDtl_del_ts) doProtoDtl_del_ts_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnAdapDtl_ext_sys_cd) doAdapDtl_ext_sys_cd_LC(info);
		else if (lc == columnAdapDtl_if_proc_typ) doAdapDtl_if_proc_typ_LC(info);
		else if (lc == columnAdapDtl_if_proc_typ_nm) doAdapDtl_if_proc_typ_nm_LC(info);
		else if (lc == columnAdapDtl_conv_ope) doAdapDtl_conv_ope_LC(info);
		else if (lc == columnAdapDtl_file_io_ope) doAdapDtl_file_io_ope_LC(info);
		else if (lc == columnAdapDtl_web_api_ope) doAdapDtl_web_api_ope_LC(info);
		else if (lc == columnAdapDtl_cmd_exec_ope) doAdapDtl_cmd_exec_ope_LC(info);
		else if (lc == columnAdapDtl_memo1) doAdapDtl_memo1_LC(info);
		else if (lc == columnAdapDtl_memo2) doAdapDtl_memo2_LC(info);
		else if (lc == columnAdapDtl_memo3) doAdapDtl_memo3_LC(info);
		else if (lc == columnAdapDtl_ins_usr_id) doAdapDtl_ins_usr_id_LC(info);
		else if (lc == columnAdapDtl_ins_usr_nm) doAdapDtl_ins_usr_nm_LC(info);
		else if (lc == columnAdapDtl_ins_ts) doAdapDtl_ins_ts_LC(info);
		else if (lc == columnAdapDtl_ins_func_id) doAdapDtl_ins_func_id_LC(info);
		else if (lc == columnAdapDtl_ins_func_nm) doAdapDtl_ins_func_nm_LC(info);
		else if (lc == columnAdapDtl_upd_cntr) doAdapDtl_upd_cntr_LC(info);
		else if (lc == columnAdapDtl_upd_usr_id) doAdapDtl_upd_usr_id_LC(info);
		else if (lc == columnAdapDtl_upd_usr_nm) doAdapDtl_upd_usr_nm_LC(info);
		else if (lc == columnAdapDtl_upd_ts) doAdapDtl_upd_ts_LC(info);
		else if (lc == columnAdapDtl_upd_func_id) doAdapDtl_upd_func_id_LC(info);
		else if (lc == columnAdapDtl_upd_func_nm) doAdapDtl_upd_func_nm_LC(info);
		else if (lc == columnAdapDtl_upd_srv_req_no) doAdapDtl_upd_srv_req_no_LC(info);
		else if (lc == columnAdapDtl_del_usr_id) doAdapDtl_del_usr_id_LC(info);
		else if (lc == columnAdapDtl_del_usr_nm) doAdapDtl_del_usr_nm_LC(info);
		else if (lc == columnAdapDtl_del_ts) doAdapDtl_del_ts_LC(info);
		else if (lc == columnHttpHeaderDtl_ext_sys_cd) doHttpHeaderDtl_ext_sys_cd_LC(info);
		else if (lc == columnHttpHeaderDtl_if_proc_typ) doHttpHeaderDtl_if_proc_typ_LC(info);
		else if (lc == columnHttpHeaderDtl_if_proc_typ_nm) doHttpHeaderDtl_if_proc_typ_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_http_header_nm) doHttpHeaderDtl_http_header_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_http_header_val) doHttpHeaderDtl_http_header_val_LC(info);
		else if (lc == columnHttpHeaderDtl_memo1) doHttpHeaderDtl_memo1_LC(info);
		else if (lc == columnHttpHeaderDtl_memo2) doHttpHeaderDtl_memo2_LC(info);
		else if (lc == columnHttpHeaderDtl_memo3) doHttpHeaderDtl_memo3_LC(info);
		else if (lc == columnHttpHeaderDtl_ins_usr_id) doHttpHeaderDtl_ins_usr_id_LC(info);
		else if (lc == columnHttpHeaderDtl_ins_usr_nm) doHttpHeaderDtl_ins_usr_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_ins_ts) doHttpHeaderDtl_ins_ts_LC(info);
		else if (lc == columnHttpHeaderDtl_ins_func_id) doHttpHeaderDtl_ins_func_id_LC(info);
		else if (lc == columnHttpHeaderDtl_ins_func_nm) doHttpHeaderDtl_ins_func_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_cntr) doHttpHeaderDtl_upd_cntr_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_usr_id) doHttpHeaderDtl_upd_usr_id_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_usr_nm) doHttpHeaderDtl_upd_usr_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_ts) doHttpHeaderDtl_upd_ts_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_func_id) doHttpHeaderDtl_upd_func_id_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_func_nm) doHttpHeaderDtl_upd_func_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_upd_srv_req_no) doHttpHeaderDtl_upd_srv_req_no_LC(info);
		else if (lc == columnHttpHeaderDtl_del_usr_id) doHttpHeaderDtl_del_usr_id_LC(info);
		else if (lc == columnHttpHeaderDtl_del_usr_nm) doHttpHeaderDtl_del_usr_nm_LC(info);
		else if (lc == columnHttpHeaderDtl_del_ts) doHttpHeaderDtl_del_ts_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_cd) doExtSysUsrDtl_ext_sys_cd_LC(info);
		else if (lc == columnExtSysUsrDtl_usr_cd) doExtSysUsrDtl_usr_cd_LC(info);
		else if (lc == columnExtSysUsrDtl_usr_nm) doExtSysUsrDtl_usr_nm_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_usr_cd) doExtSysUsrDtl_ext_sys_usr_cd_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_pass) doExtSysUsrDtl_ext_sys_pass_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_str1) doExtSysUsrDtl_ext_sys_str1_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_str2) doExtSysUsrDtl_ext_sys_str2_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_str3) doExtSysUsrDtl_ext_sys_str3_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_str4) doExtSysUsrDtl_ext_sys_str4_LC(info);
		else if (lc == columnExtSysUsrDtl_ext_sys_str5) doExtSysUsrDtl_ext_sys_str5_LC(info);
		else if (lc == columnExtSysUsrDtl_memo1) doExtSysUsrDtl_memo1_LC(info);
		else if (lc == columnExtSysUsrDtl_memo2) doExtSysUsrDtl_memo2_LC(info);
		else if (lc == columnExtSysUsrDtl_memo3) doExtSysUsrDtl_memo3_LC(info);
		else if (lc == columnExtSysUsrDtl_ins_usr_id) doExtSysUsrDtl_ins_usr_id_LC(info);
		else if (lc == columnExtSysUsrDtl_ins_usr_nm) doExtSysUsrDtl_ins_usr_nm_LC(info);
		else if (lc == columnExtSysUsrDtl_ins_ts) doExtSysUsrDtl_ins_ts_LC(info);
		else if (lc == columnExtSysUsrDtl_ins_func_id) doExtSysUsrDtl_ins_func_id_LC(info);
		else if (lc == columnExtSysUsrDtl_ins_func_nm) doExtSysUsrDtl_ins_func_nm_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_cntr) doExtSysUsrDtl_upd_cntr_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_usr_id) doExtSysUsrDtl_upd_usr_id_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_usr_nm) doExtSysUsrDtl_upd_usr_nm_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_ts) doExtSysUsrDtl_upd_ts_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_func_id) doExtSysUsrDtl_upd_func_id_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_func_nm) doExtSysUsrDtl_upd_func_nm_LC(info);
		else if (lc == columnExtSysUsrDtl_upd_srv_req_no) doExtSysUsrDtl_upd_srv_req_no_LC(info);
		else if (lc == columnExtSysUsrDtl_del_usr_id) doExtSysUsrDtl_del_usr_id_LC(info);
		else if (lc == columnExtSysUsrDtl_del_usr_nm) doExtSysUsrDtl_del_usr_nm_LC(info);
		else if (lc == columnExtSysUsrDtl_del_ts) doExtSysUsrDtl_del_ts_LC(info);
		else if (lc == columnLcl_ext_sys_cd) doLcl_ext_sys_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_ext_sys_nm) doLcl_ext_sys_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_upd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_upd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[if_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_if_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_str]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_str_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[var_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_var_num_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ProtoDtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doProtoDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[conv_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_conv_ope_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[file_io_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_file_io_ope_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[web_api_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_web_api_ope_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[cmd_exec_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_cmd_exec_ope_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [AdapDtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAdapDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[http_header_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_http_header_val_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [HttpHeaderDtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHttpHeaderDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_pass]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_pass_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str1_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str2_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str3_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str4_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ext_sys_str5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ext_sys_str5_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ExtSysUsrDtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doExtSysUsrDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ext_sys_cd]の作成メソッド
	 */
	public MCList getCnd_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ext_sys_typ]の作成メソッド
	 */
	public MCList getDtl_ext_sys_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSysTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_if_upd_typ]の作成メソッド
	 */
	public MCList getDtl_if_upd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfUpdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnProtoDtl_if_proc_typ]の作成メソッド
	 */
	public MCList getProtoDtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnProtoDtl_if_ctl_typ]の作成メソッド
	 */
	public MCList getProtoDtl_if_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnAdapDtl_if_proc_typ]の作成メソッド
	 */
	public MCList getAdapDtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnHttpHeaderDtl_if_proc_typ]の作成メソッド
	 */
	public MCList getHttpHeaderDtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnExtSysUsrDtl_usr_cd]の作成メソッド
	 */
	public MCList getExtSysUsrDtl_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL1500.Srch01")) {
			return new MA_MABCL1500_Srch01Bridge();
		}
		if (id.equals("MA.MABCL1500.Upd01")) {
			return new MA_MABCL1500_Upd01Bridge();
		}
		if (id.equals("MA.MABCL1500.Del01")) {
			return new MA_MABCL1500_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL1500_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1500_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1500_Srch01;

		/** コンストラクタ */
		protected MA_MABCL1500_Srch01Bridge() {
			p_MA_MABCL1500_Srch01 = new MCParam(PDef.MA_MABCL1500_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1500_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP1500.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.ProtoDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.AdapDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.LclR.class));

			p_MA_MABCL1500_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1500_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1500_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1500_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP1500.CndR up0() {
			return (mcframe.clientMABC.MABCP1500.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP1500.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP1500.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> down1() {
			return (MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> down2() {
			return (MCList<mcframe.clientMABC.MABCP1500.AdapDtlR>)down(2);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> down3() {
			return (MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR>)down(3);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> down4() {
			return (MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR>)down(4);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.LclR> down5() {
			return (MCList<mcframe.clientMABC.MABCP1500.LclR>)down(5);
		}

		protected void setupDownParam() {
			p_MA_MABCL1500_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.DtlR.class));
			p_MA_MABCL1500_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.ProtoDtlR.class));
			p_MA_MABCL1500_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.AdapDtlR.class));
			p_MA_MABCL1500_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.class));
			p_MA_MABCL1500_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.class));
			p_MA_MABCL1500_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1500.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL1500_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP1500.DtlR>)p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(0));
			setProtoAllL((MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR>)p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(1));
			setAdapAllL((MCList<mcframe.clientMABC.MABCP1500.AdapDtlR>)p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(2));
			setHttpHeaderAllL((MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR>)p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(3));
			setExtSysUsrAllL((MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR>)p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(4));
			setLclAllL((MCList<mcframe.clientMABC.MABCP1500.LclR>)p_MA_MABCL1500_Srch01.getContainerParam().getDownBlock(5));
		}

		protected void clear() {
			getDtlL().clear();
			getProtoAllL().clear();
			getAdapAllL().clear();
			getHttpHeaderAllL().clear();
			getExtSysUsrAllL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getProtoAllL());
			result.add(getAdapAllL());
			result.add(getHttpHeaderAllL());
			result.add(getExtSysUsrAllL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL1500_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1500_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1500_Upd01;

		/** コンストラクタ */
		protected MA_MABCL1500_Upd01Bridge() {
			p_MA_MABCL1500_Upd01 = new MCParam(PDef.MA_MABCL1500_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1500_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.ProtoDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.AdapDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.HttpHeaderDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.LclR.class));
			// Down

			p_MA_MABCL1500_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1500_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1500_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL1500_Upd01.addUpBlock(getProtoAllL().shallowClone());
			p_MA_MABCL1500_Upd01.addUpBlock(getAdapAllL().shallowClone());
			p_MA_MABCL1500_Upd01.addUpBlock(getHttpHeaderAllL().shallowClone());
			p_MA_MABCL1500_Upd01.addUpBlock(getExtSysUsrAllL().shallowClone());
			p_MA_MABCL1500_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1500_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1500_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1500.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1500.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR> up1() {
			return (MCList<mcframe.clientMABC.MABCP1500.ProtoDtlR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.AdapDtlR> up2() {
			return (MCList<mcframe.clientMABC.MABCP1500.AdapDtlR>)up(2);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR> up3() {
			return (MCList<mcframe.clientMABC.MABCP1500.HttpHeaderDtlR>)up(3);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR> up4() {
			return (MCList<mcframe.clientMABC.MABCP1500.ExtSysUsrDtlR>)up(4);
		}
		protected MCList<mcframe.clientMABC.MABCP1500.LclR> up5() {
			return (MCList<mcframe.clientMABC.MABCP1500.LclR>)up(5);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1500_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getProtoAllL());
			result.add(getAdapAllL());
			result.add(getHttpHeaderAllL());
			result.add(getExtSysUsrAllL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL1500_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1500_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1500_Del01;

		/** コンストラクタ */
		protected MA_MABCL1500_Del01Bridge() {
			p_MA_MABCL1500_Del01 = new MCParam(PDef.MA_MABCL1500_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1500_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1500.DtlR.class));
			// Down

			p_MA_MABCL1500_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1500_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1500_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1500_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1500_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1500.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1500.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1500_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}