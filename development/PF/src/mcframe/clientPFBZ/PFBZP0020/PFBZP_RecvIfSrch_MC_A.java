package mcframe.clientPFBZ.PFBZP0020;

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
import mcframe.clientPFBZ.PFBZP0020.PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Srch01Caller;
import mcframe.clientPFBZ.PFBZP0020.PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Srch02Caller;
import mcframe.clientPFBZ.PFBZP0020.PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Conv01Caller;

/**
 * 画面"PFBZP_RecvIfSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBZP_RecvIfSrch_MC_A extends mcframe.clientPFUD.PFUDP0010.PFUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFBZ";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "PFBZP0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Knd]ブロック関連のField定義
	public MCPanel KndPanel = null;
	public MCTitledBorder KndTitledBorder = null;
	// [Knd]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Importing error 受信エラー.<p>
	 *
	 */
	public MCCheckBox Cnd_recv_err_flg = null;
	/**
	 * Import completed 受信完了.<p>
	 *
	 */
	public MCCheckBox Cnd_recv_ok_flg = null;
	/**
	 * Conversion error 変換エラー.<p>
	 *
	 */
	public MCCheckBox Cnd_recv_conv_err_flg = null;
	/**
	 * Conversion completed 変換完了.<p>
	 *
	 */
	public MCCheckBox Cnd_recv_conv_ok_flg = null;
	public MCLabel Cnd_if_proc_typ_Label = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCTextField Cnd_if_proc_typ_nm = null;
	public MCLabel Cnd_data_no_fr_Label = null;
	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public MCNumberField Cnd_data_no_fr = null;
	public MCLabel Cnd_data_no_to_Label = null;
	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public MCNumberField Cnd_data_no_to = null;
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
	public MCLabel Cnd_sdrv_tm_fr_Label = null;
	/**
	 * Receiving date and time FROM 受信日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sdrv_tm_fr = null;
	public MCLabel Cnd_sdrv_tm_to_Label = null;
	/**
	 * Receiving date TO 受信日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sdrv_tm_to = null;
	public MCLabel Cnd_file_nm_Label = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCTextField Cnd_file_nm = null;
	public MCLabel Cnd_batch_log_no_Label = null;
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_batch_log_no = null;
	public MCLabel Cnd_ins_srv_req_no_Label = null;
	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ins_srv_req_no = null;
	public MCLabel Cnd_attr_char1_Label = null;
	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public MCTextField Cnd_attr_char1 = null;
	public MCLabel Cnd_attr_char2_Label = null;
	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public MCTextField Cnd_attr_char2 = null;
	public MCLabel Cnd_attr_char3_Label = null;
	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public MCTextField Cnd_attr_char3 = null;
	public MCLabel Cnd_attr_char4_Label = null;
	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public MCTextField Cnd_attr_char4 = null;
	public MCLabel Cnd_attr_char5_Label = null;
	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public MCTextField Cnd_attr_char5 = null;
	public MCLabel Cnd_attr_char6_Label = null;
	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public MCTextField Cnd_attr_char6 = null;
	public MCLabel Cnd_attr_char7_Label = null;
	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public MCTextField Cnd_attr_char7 = null;
	public MCLabel Cnd_attr_char8_Label = null;
	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public MCTextField Cnd_attr_char8 = null;
	public MCLabel Cnd_attr_char9_Label = null;
	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public MCTextField Cnd_attr_char9 = null;
	public MCLabel Cnd_attr_char10_Label = null;
	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public MCTextField Cnd_attr_char10 = null;
	public MCLabel Cnd_attr_char11_Label = null;
	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public MCTextField Cnd_attr_char11 = null;
	public MCLabel Cnd_attr_char12_Label = null;
	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public MCTextField Cnd_attr_char12 = null;
	public MCLabel Cnd_attr_char13_Label = null;
	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public MCTextField Cnd_attr_char13 = null;
	public MCLabel Cnd_attr_char14_Label = null;
	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public MCTextField Cnd_attr_char14 = null;
	public MCLabel Cnd_attr_char15_Label = null;
	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public MCTextField Cnd_attr_char15 = null;
	public MCLabel Cnd_attr_char16_Label = null;
	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public MCTextField Cnd_attr_char16 = null;
	public MCLabel Cnd_attr_char17_Label = null;
	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public MCTextField Cnd_attr_char17 = null;
	public MCLabel Cnd_attr_char18_Label = null;
	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public MCTextField Cnd_attr_char18 = null;
	public MCLabel Cnd_attr_char19_Label = null;
	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public MCTextField Cnd_attr_char19 = null;
	public MCLabel Cnd_attr_char20_Label = null;
	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public MCTextField Cnd_attr_char20 = null;
	public MCLabel Cnd_attr_char21_Label = null;
	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public MCTextField Cnd_attr_char21 = null;
	public MCLabel Cnd_attr_char22_Label = null;
	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public MCTextField Cnd_attr_char22 = null;
	public MCLabel Cnd_attr_char23_Label = null;
	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public MCTextField Cnd_attr_char23 = null;
	public MCLabel Cnd_attr_char24_Label = null;
	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public MCTextField Cnd_attr_char24 = null;
	public MCLabel Cnd_attr_char25_Label = null;
	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public MCTextField Cnd_attr_char25 = null;
	public MCLabel Cnd_attr_char26_Label = null;
	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public MCTextField Cnd_attr_char26 = null;
	public MCLabel Cnd_attr_char27_Label = null;
	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public MCTextField Cnd_attr_char27 = null;
	public MCLabel Cnd_attr_char28_Label = null;
	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public MCTextField Cnd_attr_char28 = null;
	public MCLabel Cnd_attr_char29_Label = null;
	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public MCTextField Cnd_attr_char29 = null;
	public MCLabel Cnd_attr_char30_Label = null;
	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public MCTextField Cnd_attr_char30 = null;
	public MCLabel Cnd_attr_num1_Label = null;
	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public MCNumberField Cnd_attr_num1 = null;
	public MCLabel Cnd_attr_num2_Label = null;
	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public MCNumberField Cnd_attr_num2 = null;
	public MCLabel Cnd_attr_num3_Label = null;
	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public MCNumberField Cnd_attr_num3 = null;
	public MCLabel Cnd_attr_num4_Label = null;
	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public MCNumberField Cnd_attr_num4 = null;
	public MCLabel Cnd_attr_num5_Label = null;
	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public MCNumberField Cnd_attr_num5 = null;
	public MCLabel Cnd_attr_dt1_Label = null;
	/**
	 * Business info. 16 業務情報１６.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt1 = null;
	public MCLabel Cnd_attr_dt2_Label = null;
	/**
	 * Business info. 17 業務情報１７.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt2 = null;
	public MCLabel Cnd_attr_dt3_Label = null;
	/**
	 * Business info. 18 業務情報１８.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt3 = null;
	public MCLabel Cnd_attr_dt4_Label = null;
	/**
	 * Business info. 19 業務情報１９.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt4 = null;
	public MCLabel Cnd_attr_dt5_Label = null;
	/**
	 * Business info. 20 業務情報２０.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt5 = null;
	public MCLabel Cnd_attr_dt1_fr_Label = null;
	/**
	 * Business info. date 1 FROM 業務情報日付１ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt1_fr = null;
	public MCLabel Cnd_attr_dt1_to_Label = null;
	/**
	 * Business info. date 1 TO 業務情報日付１ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt1_to = null;
	public MCLabel Cnd_attr_dt2_fr_Label = null;
	/**
	 * Business info. date 2 FROM 業務情報日付２ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt2_fr = null;
	public MCLabel Cnd_attr_dt2_to_Label = null;
	/**
	 * Business info. date 2 TO 業務情報日付２ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt2_to = null;
	public MCLabel Cnd_attr_dt3_fr_Label = null;
	/**
	 * Business info. date 3 FROM 業務情報日付３ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt3_fr = null;
	public MCLabel Cnd_attr_dt3_to_Label = null;
	/**
	 * Business info. date 3 TO 業務情報日付３ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt3_to = null;
	public MCLabel Cnd_attr_dt4_fr_Label = null;
	/**
	 * Business info. date 4 FROM 業務情報日付４ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt4_fr = null;
	public MCLabel Cnd_attr_dt4_to_Label = null;
	/**
	 * Business info. date 4 TO 業務情報日付４ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt4_to = null;
	public MCLabel Cnd_attr_dt5_fr_Label = null;
	/**
	 * Business info. date 5 FROM 業務情報日付５ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt5_fr = null;
	public MCLabel Cnd_attr_dt5_to_Label = null;
	/**
	 * Business info. date 5 TO 業務情報日付５ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_dt5_to = null;
	public MCLabel Cnd_attr_tm1_fr_Label = null;
	/**
	 * Business info. date and time 1 FROM 業務情報日時１ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm1_fr = null;
	public MCLabel Cnd_attr_tm1_to_Label = null;
	/**
	 * Business info. date and time 1 TO 業務情報日時１ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm1_to = null;
	public MCLabel Cnd_attr_tm2_fr_Label = null;
	/**
	 * Business info. date and time 2 FROM 業務情報日時２ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm2_fr = null;
	public MCLabel Cnd_attr_tm2_to_Label = null;
	/**
	 * Business info. date and time 2 TO 業務情報日時２ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm2_to = null;
	public MCLabel Cnd_attr_tm3_fr_Label = null;
	/**
	 * Business info. date and time 3 FROM 業務情報日時３ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm3_fr = null;
	public MCLabel Cnd_attr_tm3_to_Label = null;
	/**
	 * Business info. date and time 3 TO 業務情報日時３ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm3_to = null;
	public MCLabel Cnd_attr_tm4_fr_Label = null;
	/**
	 * Business info. date and time 4 FROM 業務情報日時４ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm4_fr = null;
	public MCLabel Cnd_attr_tm4_to_Label = null;
	/**
	 * Business info. date and time 4 TO 業務情報日時４ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm4_to = null;
	public MCLabel Cnd_attr_tm5_fr_Label = null;
	/**
	 * Business info. date and time 5 FROM 業務情報日時５ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm5_fr = null;
	public MCLabel Cnd_attr_tm5_to_Label = null;
	/**
	 * Business info. date and time 5 TO 業務情報日時５ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_attr_tm5_to = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientPFBZ.PFBZP0020.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_recv_flg = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_proc_typ_nm = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_data_no = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
	/**
	 * Exporting and importing status type 送受信状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sdrv_sts_typ = null;
	/**
	 * Exporting and importing status type name 送受信状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sdrv_sts_typ_nm = null;
	/**
	 * Receiving date and time 受信日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sdrv_tm = null;
	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_file_id = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_file_nm = null;
	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_file_path = null;
	/**
	 * Code convert operation コード変換オペレーション.<p>
	 *
	 */
	public MCColumnConfig columnDtl_conv_ope = null;
	/**
	 * File I/O operations ファイル入出力オペレーション.<p>
	 *
	 */
	public MCColumnConfig columnDtl_file_io_ope = null;
	/**
	 * Web API operation ＷｅｂＡＰＩオペレーション.<p>
	 *
	 */
	public MCColumnConfig columnDtl_web_api_ope = null;
	/**
	 * Exporting/importing client ID 送受信クライアントＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sdrv_clt_id = null;
	/**
	 * Exporting/importing user ID 送受信ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sdrv_usr_id = null;
	/**
	 * Exporting/importing user name 送受信ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sdrv_usr_nm = null;
	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char1 = null;
	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char2 = null;
	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char3 = null;
	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char4 = null;
	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char5 = null;
	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char6 = null;
	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char7 = null;
	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char8 = null;
	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char9 = null;
	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char10 = null;
	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char11 = null;
	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char12 = null;
	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char13 = null;
	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char14 = null;
	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char15 = null;
	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char16 = null;
	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char17 = null;
	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char18 = null;
	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char19 = null;
	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char20 = null;
	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char21 = null;
	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char22 = null;
	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char23 = null;
	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char24 = null;
	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char25 = null;
	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char26 = null;
	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char27 = null;
	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char28 = null;
	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char29 = null;
	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_char30 = null;
	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_num1 = null;
	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_num2 = null;
	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_num3 = null;
	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_num4 = null;
	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_num5 = null;
	/**
	 * Business info. date 1 業務情報日付１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_dt1 = null;
	/**
	 * Business info. date 2 業務情報日付２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_dt2 = null;
	/**
	 * Business info. date 3 業務情報日付３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_dt3 = null;
	/**
	 * Business info. date 4 業務情報日付４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_dt4 = null;
	/**
	 * Business info. date 5 業務情報日付５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_dt5 = null;
	/**
	 * Business info. date and time 1 業務情報日時１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_tm1 = null;
	/**
	 * Business info. date and time 2 業務情報日時２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_tm2 = null;
	/**
	 * Business info. date and time 3 業務情報日時３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_tm3 = null;
	/**
	 * Business info. date and time 4 業務情報日時４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_tm4 = null;
	/**
	 * Business info. date and time 5 業務情報日時５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attr_tm5 = null;
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_batch_log_no = null;
	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_log_sub_key1 = null;
	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_log_sub_key2 = null;
	// [Filter]ブロック関連のField定義
	public MCPanel FilterPanel = null;
	// [Filter]ブロックの項目のField定義
	/**
	 * Warning 警告.<p>
	 *
	 */
	public MCCheckBox Filter_disp_warn = null;
	/**
	 * Exclude warning 警告以外.<p>
	 *
	 */
	public MCCheckBox Filter_disp_not_warn = null;
	/**
	 * Separator セパレータ.<p>
	 *
	 */
	public MCLabel Filter_div = null;
	/**
	 * Start log 開始ログ.<p>
	 *
	 */
	public MCCheckBox Filter_disp_start_log = null;
	/**
	 * Data データ.<p>
	 *
	 */
	public MCCheckBox Filter_disp_data_log = null;
	/**
	 * processing progress 処理経過.<p>
	 *
	 */
	public MCCheckBox Filter_disp_proc_log = null;
	/**
	 * End log 終了ログ.<p>
	 *
	 */
	public MCCheckBox Filter_disp_end_log = null;
	// [Msg]ブロック関連のField定義
	public MCPanel MsgPanel = null;
	public MCScrollPane MsgScrollPane = null;
	public MCTable2<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> MsgTable = null;
	// [Msg]ブロックの項目のField定義
	/**
	 * Batch log type バッチログ区分.<p>
	 *
	 */
	public MCColumnConfig columnMsg_batch_log_typ = null;
	/**
	 * Batch log type name バッチログ区分名.<p>
	 *
	 */
	public MCColumnConfig columnMsg_batch_log_typ_nm = null;
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnMsg_msg_id = null;
	/**
	 * Message メッセージ.<p>
	 *
	 */
	public MCColumnConfig columnMsg_msg_txt = null;
	/**
	 * Message level メッセージレベル.<p>
	 *
	 */
	public MCColumnConfig columnMsg_msg_lvl = null;
	/**
	 * Logged date and time ログ発生日時.<p>
	 *
	 */
	public MCColumnConfig columnMsg_log_ts = null;
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCColumnConfig columnMsg_seq = null;
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnMsg_batch_log_no = null;
	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCColumnConfig columnMsg_log_sub_key1 = null;
	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCColumnConfig columnMsg_log_sub_key2 = null;
	// [MsgArea]ブロック関連のField定義
	public MCPanel MsgAreaPanel = null;
	// [MsgArea]ブロックの項目のField定義
	public MCScrollPane MsgArea_msgScrollPane = null;
	public MCTextArea MsgArea_msg = null;
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
	/**
	 * Conversion 変換.<p>
	 *
	 */
	public MCButton Btn_conv = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [PF_PFBZL0020_Srch01]のCallerの作成 */
	protected PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Srch01Caller createPF_PFBZL0020_Srch01() {
		PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Srch01Caller<PFBZP_RecvIfSrch, PF_PFBZL0020_Srch01Bridge>
		caller = ((PFBZP_RecvIfSrch_MC)this).new PF_PFBZL0020_Srch01Caller<PFBZP_RecvIfSrch, PF_PFBZL0020_Srch01Bridge>(
					(PFBZP_RecvIfSrch)this, new PF_PFBZL0020_Srch01Bridge());
		return caller;
	}
	/** [PF_PFBZL0020_Srch01]の呼び出し */
	protected void callPF_PFBZL0020_Srch01() {
		MCCaller caller = createPF_PFBZL0020_Srch01();
		caller.exec();
	}
	/** [PF_PFBZL0020_Srch02]のCallerの作成 */
	protected PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Srch02Caller createPF_PFBZL0020_Srch02() {
		PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Srch02Caller<PFBZP_RecvIfSrch, PF_PFBZL0020_Srch02Bridge>
		caller = ((PFBZP_RecvIfSrch_MC)this).new PF_PFBZL0020_Srch02Caller<PFBZP_RecvIfSrch, PF_PFBZL0020_Srch02Bridge>(
					(PFBZP_RecvIfSrch)this, new PF_PFBZL0020_Srch02Bridge());
		return caller;
	}
	/** [PF_PFBZL0020_Srch02]の呼び出し */
	protected void callPF_PFBZL0020_Srch02() {
		MCCaller caller = createPF_PFBZL0020_Srch02();
		caller.exec();
	}
	/** [PF_PFBZL0020_Conv01]のCallerの作成 */
	protected PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Conv01Caller createPF_PFBZL0020_Conv01() {
		PFBZP_RecvIfSrch_MC.PF_PFBZL0020_Conv01Caller<PFBZP_RecvIfSrch, PF_PFBZL0020_Conv01Bridge>
		caller = ((PFBZP_RecvIfSrch_MC)this).new PF_PFBZL0020_Conv01Caller<PFBZP_RecvIfSrch, PF_PFBZL0020_Conv01Bridge>(
					(PFBZP_RecvIfSrch)this, new PF_PFBZL0020_Conv01Bridge());
		return caller;
	}
	/** [PF_PFBZL0020_Conv01]の呼び出し */
	protected void callPF_PFBZL0020_Conv01() {
		MCCaller caller = createPF_PFBZL0020_Conv01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientPFBZ.PFBZP0020.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientPFBZ.PFBZP0020.DtlR> aDtlL;
	/** [Filter]ブロックのコンテナField定義 */
	private final mcframe.clientPFBZ.PFBZP0020.FilterR aFilterR;
	/** [Msg]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> aMsgL;
	/** [MsgArea]ブロックのコンテナField定義 */
	private final mcframe.clientPFBZ.PFBZP0020.MsgAreaR aMsgAreaR;
	/** [BatchLogMsg]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> aBatchLogMsgL;
	/** [BatchLogKey]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR> aBatchLogKeyL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientPFBZ.PFBZP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientPFBZ.PFBZP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientPFBZ.PFBZP0020.CndR createCndR() {
		return mcframe.clientPFBZ.PFBZP0020.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientPFBZ.PFBZP0020.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientPFBZ.PFBZP0020.DtlR createDtlR() {
		return mcframe.clientPFBZ.PFBZP0020.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.DtlR> createDtlL() {
		return MCList.create(mcframe.clientPFBZ.PFBZP0020.DtlR.class);
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
	 * 項目コピーによってaFilterRを設定します。
	 *
	 * aFilterRのインスタンスは変更されません。
	 *
	 * @param row FilterR
	 */
	public void setFilterR(mcframe.clientPFBZ.PFBZP0020.FilterR row) {
		if (row != null) {
			MCRow.copyall(getFilterR(), row);
		}
	}

	/**
	 * [Filter]ブロックのコンテナaFilterRを返します。
	 *
	 * @return FilterR
	 */
	public mcframe.clientPFBZ.PFBZP0020.FilterR getFilterR() {
		return aFilterR;
	}

	/**
	 * aFilterRを作成します。
	 *
	 * @return FilterR
	 */
	public mcframe.clientPFBZ.PFBZP0020.FilterR createFilterR() {
		return mcframe.clientPFBZ.PFBZP0020.FilterR.create();
	}

	/**
	 * コピーによってaMsgLを設定します。
	 *
	 * aMsgLのインスタンスは変更されません。
	 *
	 * @param dataset MsgL
	 */
	public void setMsgL(MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> aList) {
		if (getMsgL() != aList) {
			getMsgL().setAll(aList);
		}
	}

	/**
	 * [Msg]ブロックのコンテナaMsgLを返します。
	 *
	 * @return MsgL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> getMsgL() {
		return aMsgL;
	}

	/**
	 * aMsgRを作成します。
	 *
	 * @return MsgR
	 */
	public mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR createMsgR() {
		return mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.create();
	}

	/**
	 * aMsgLを作成します。
	 *
	 * @return MsgL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> createMsgL() {
		return MCList.create(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.class);
	}

	/**
	 * MsgTableを初期化します。
	 */
	protected void createMsgTable(){
		if(MsgTable == null){
			MsgTable = beansFactory.createTable2("Msg.table");
		}
	}

	/**
	 * 項目コピーによってaMsgAreaRを設定します。
	 *
	 * aMsgAreaRのインスタンスは変更されません。
	 *
	 * @param row MsgAreaR
	 */
	public void setMsgAreaR(mcframe.clientPFBZ.PFBZP0020.MsgAreaR row) {
		if (row != null) {
			MCRow.copyall(getMsgAreaR(), row);
		}
	}

	/**
	 * [MsgArea]ブロックのコンテナaMsgAreaRを返します。
	 *
	 * @return MsgAreaR
	 */
	public mcframe.clientPFBZ.PFBZP0020.MsgAreaR getMsgAreaR() {
		return aMsgAreaR;
	}

	/**
	 * aMsgAreaRを作成します。
	 *
	 * @return MsgAreaR
	 */
	public mcframe.clientPFBZ.PFBZP0020.MsgAreaR createMsgAreaR() {
		return mcframe.clientPFBZ.PFBZP0020.MsgAreaR.create();
	}

	/**
	 * コピーによってaBatchLogMsgLを設定します。
	 *
	 * aBatchLogMsgLのインスタンスは変更されません。
	 *
	 * @param dataset BatchLogMsgL
	 */
	public void setBatchLogMsgL(MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> aList) {
		if (getBatchLogMsgL() != aList) {
			getBatchLogMsgL().setAll(aList);
		}
	}

	/**
	 * [BatchLogMsg]ブロックのコンテナaBatchLogMsgLを返します。
	 *
	 * @return BatchLogMsgL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> getBatchLogMsgL() {
		return aBatchLogMsgL;
	}

	/**
	 * aBatchLogMsgRを作成します。
	 *
	 * @return BatchLogMsgR
	 */
	public mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR createBatchLogMsgR() {
		return mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.create();
	}

	/**
	 * aBatchLogMsgLを作成します。
	 *
	 * @return BatchLogMsgL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> createBatchLogMsgL() {
		return MCList.create(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.class);
	}

	/**
	 * コピーによってaBatchLogKeyLを設定します。
	 *
	 * aBatchLogKeyLのインスタンスは変更されません。
	 *
	 * @param dataset BatchLogKeyL
	 */
	public void setBatchLogKeyL(MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR> aList) {
		if (getBatchLogKeyL() != aList) {
			getBatchLogKeyL().setAll(aList);
		}
	}

	/**
	 * [BatchLogKey]ブロックのコンテナaBatchLogKeyLを返します。
	 *
	 * @return BatchLogKeyL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR> getBatchLogKeyL() {
		return aBatchLogKeyL;
	}

	/**
	 * aBatchLogKeyRを作成します。
	 *
	 * @return BatchLogKeyR
	 */
	public mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR createBatchLogKeyR() {
		return mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR.create();
	}

	/**
	 * aBatchLogKeyLを作成します。
	 *
	 * @return BatchLogKeyL
	 */
	public MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR> createBatchLogKeyL() {
		return MCList.create(mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getFilterR())) ret.add(getFilterR());
		if(!MCCollectionUtil.contains(ret, getMsgL())) ret.add(getMsgL());
		if(!MCCollectionUtil.contains(ret, getMsgAreaR())) ret.add(getMsgAreaR());
		if(!MCCollectionUtil.contains(ret, getBatchLogMsgL())) ret.add(getBatchLogMsgL());
		if(!MCCollectionUtil.contains(ret, getBatchLogKeyL())) ret.add(getBatchLogKeyL());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getFilterR()) return "Filter";
		if(aCnt == getMsgL()) return "Msg";
		if(aCnt == getMsgAreaR()) return "MsgArea";
		if(aCnt == getBatchLogMsgL()) return "BatchLogMsg";
		if(aCnt == getBatchLogKeyL()) return "BatchLogKey";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Filter")) return getFilterR();
		if(bId.equals("Msg")) return getMsgL();
		if(bId.equals("MsgArea")) return getMsgAreaR();
		if(bId.equals("BatchLogMsg")) return getBatchLogMsgL();
		if(bId.equals("BatchLogKey")) return getBatchLogKeyL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(KndPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(FilterPanel);
		ret.add(MsgPanel);
		ret.add(MsgAreaPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public PFBZP_RecvIfSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aFilterR = createFilterR();
		aMsgL = createMsgL();
		aMsgAreaR = createMsgAreaR();
		aBatchLogMsgL = createBatchLogMsgL();
		aBatchLogKeyL = createBatchLogKeyL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public PFBZP_RecvIfSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aFilterR = createFilterR();
		aMsgL = createMsgL();
		createMsgTable();
		MsgTable.setRowName(name);
		aMsgAreaR = createMsgAreaR();
		aBatchLogMsgL = createBatchLogMsgL();
		aBatchLogKeyL = createBatchLogKeyL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		PFBZP_RecvIfSrch_MC.jbCreateKnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateTop((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateFold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateTab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateTab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateCnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateCnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateCtrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateDtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateFilter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateMsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbCreateBtn((PFBZP_RecvIfSrch)this);
	}

	/**
	 * [Knd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateKnd(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(PFBZP_RecvIfSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Filter]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFilter(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Msg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMsg(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [MsgArea]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMsgArea(PFBZP_RecvIfSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(PFBZP_RecvIfSrch p) {
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

	
	/** [Cnd_if_proc_typ_ListPutter]の定義 */
	private MCListPutter Cnd_if_proc_typ_p = null;

	/**
	 * [Cnd_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_if_proc_typ_ListPutter() {
		if (Cnd_if_proc_typ_p == null) {
			Cnd_if_proc_typ_p = createCnd_if_proc_typ_ListPutter(Cnd_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return Cnd_if_proc_typ_p;
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
	
	
	/** [Msg_batch_log_typ_ListPutter]の定義 */
	private MCListPutter Msg_batch_log_typ_p = null;

	/**
	 * [Msg_batch_log_typ_ListPutter]の取得
	 */
	protected MCListPutter getMsg_batch_log_typ_ListPutter() {
		if (Msg_batch_log_typ_p == null) {
			Msg_batch_log_typ_p = createMsg_batch_log_typ_ListPutter(columnMsg_batch_log_typ, "batch_log_typ");

		}
		return Msg_batch_log_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static PFBZP_RecvIfSrch create(){
		PFBZP_RecvIfSrch p = new PFBZP_RecvIfSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static PFBZP_RecvIfSrch create(String name){
		PFBZP_RecvIfSrch p = new PFBZP_RecvIfSrch(name);
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
		PFBZP_RecvIfSrch_MC.jbfInitKnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitTop((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitFold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitTab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitTab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitCnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitCnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitCtrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitDtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitFilter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitMsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbfInitBtn((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitKnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitTop((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitFold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitTab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitTab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitCnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitCnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitCtrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitDtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitFilter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitMsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.jbInitBtn((PFBZP_RecvIfSrch)this);
	}

	/**
	 * [Knd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitKnd(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.KndPanel = p.beansFactory.createPanel("Knd");
		p.KndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_recv_err_flg = p.beansFactory.createCheckBox("Cnd.recv_err_flg");
		p.Cnd_recv_ok_flg = p.beansFactory.createCheckBox("Cnd.recv_ok_flg");
		p.Cnd_recv_conv_err_flg = p.beansFactory.createCheckBox("Cnd.recv_conv_err_flg");
		p.Cnd_recv_conv_ok_flg = p.beansFactory.createCheckBox("Cnd.recv_conv_ok_flg");
		p.Cnd_if_proc_typ_Label = p.beansFactory.createLabel("Cnd.if_proc_typ_Label");
		p.Cnd_if_proc_typ = p.beansFactory.createTextComboBox("Cnd.if_proc_typ");
		p.Cnd_if_proc_typ.setLabel(p.Cnd_if_proc_typ_Label);
		p.Cnd_if_proc_typ_nm = p.beansFactory.createTextField("Cnd.if_proc_typ_nm");
		p.Cnd_data_no_fr_Label = p.beansFactory.createLabel("Cnd.data_no_fr_Label");
		p.Cnd_data_no_fr = p.beansFactory.createNumberField("Cnd.data_no_fr");
		p.Cnd_data_no_fr.setLabel(p.Cnd_data_no_fr_Label);
		p.Cnd_data_no_to_Label = p.beansFactory.createLabel("Cnd.data_no_to_Label");
		p.Cnd_data_no_to = p.beansFactory.createNumberField("Cnd.data_no_to");
		p.Cnd_data_no_to.setLabel(p.Cnd_data_no_to_Label);
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextComboBox("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_sdrv_tm_fr_Label = p.beansFactory.createLabel("Cnd.sdrv_tm_fr_Label");
		p.Cnd_sdrv_tm_fr = p.beansFactory.createDateField("Cnd.sdrv_tm_fr");
		p.Cnd_sdrv_tm_fr.setLabel(p.Cnd_sdrv_tm_fr_Label);
		p.Cnd_sdrv_tm_to_Label = p.beansFactory.createLabel("Cnd.sdrv_tm_to_Label");
		p.Cnd_sdrv_tm_to = p.beansFactory.createDateField("Cnd.sdrv_tm_to");
		p.Cnd_sdrv_tm_to.setLabel(p.Cnd_sdrv_tm_to_Label);
		p.Cnd_file_nm_Label = p.beansFactory.createLabel("Cnd.file_nm_Label");
		p.Cnd_file_nm = p.beansFactory.createTextField("Cnd.file_nm");
		p.Cnd_file_nm.setLabel(p.Cnd_file_nm_Label);
		p.Cnd_batch_log_no_Label = p.beansFactory.createLabel("Cnd.batch_log_no_Label");
		p.Cnd_batch_log_no = p.beansFactory.createTextField("Cnd.batch_log_no");
		p.Cnd_batch_log_no.setLabel(p.Cnd_batch_log_no_Label);
		p.Cnd_ins_srv_req_no_Label = p.beansFactory.createLabel("Cnd.ins_srv_req_no_Label");
		p.Cnd_ins_srv_req_no = p.beansFactory.createTextField("Cnd.ins_srv_req_no");
		p.Cnd_ins_srv_req_no.setLabel(p.Cnd_ins_srv_req_no_Label);
		p.Cnd_attr_char1_Label = p.beansFactory.createLabel("Cnd.attr_char1_Label");
		p.Cnd_attr_char1 = p.beansFactory.createTextField("Cnd.attr_char1");
		p.Cnd_attr_char1.setLabel(p.Cnd_attr_char1_Label);
		p.Cnd_attr_char2_Label = p.beansFactory.createLabel("Cnd.attr_char2_Label");
		p.Cnd_attr_char2 = p.beansFactory.createTextField("Cnd.attr_char2");
		p.Cnd_attr_char2.setLabel(p.Cnd_attr_char2_Label);
		p.Cnd_attr_char3_Label = p.beansFactory.createLabel("Cnd.attr_char3_Label");
		p.Cnd_attr_char3 = p.beansFactory.createTextField("Cnd.attr_char3");
		p.Cnd_attr_char3.setLabel(p.Cnd_attr_char3_Label);
		p.Cnd_attr_char4_Label = p.beansFactory.createLabel("Cnd.attr_char4_Label");
		p.Cnd_attr_char4 = p.beansFactory.createTextField("Cnd.attr_char4");
		p.Cnd_attr_char4.setLabel(p.Cnd_attr_char4_Label);
		p.Cnd_attr_char5_Label = p.beansFactory.createLabel("Cnd.attr_char5_Label");
		p.Cnd_attr_char5 = p.beansFactory.createTextField("Cnd.attr_char5");
		p.Cnd_attr_char5.setLabel(p.Cnd_attr_char5_Label);
		p.Cnd_attr_char6_Label = p.beansFactory.createLabel("Cnd.attr_char6_Label");
		p.Cnd_attr_char6 = p.beansFactory.createTextField("Cnd.attr_char6");
		p.Cnd_attr_char6.setLabel(p.Cnd_attr_char6_Label);
		p.Cnd_attr_char7_Label = p.beansFactory.createLabel("Cnd.attr_char7_Label");
		p.Cnd_attr_char7 = p.beansFactory.createTextField("Cnd.attr_char7");
		p.Cnd_attr_char7.setLabel(p.Cnd_attr_char7_Label);
		p.Cnd_attr_char8_Label = p.beansFactory.createLabel("Cnd.attr_char8_Label");
		p.Cnd_attr_char8 = p.beansFactory.createTextField("Cnd.attr_char8");
		p.Cnd_attr_char8.setLabel(p.Cnd_attr_char8_Label);
		p.Cnd_attr_char9_Label = p.beansFactory.createLabel("Cnd.attr_char9_Label");
		p.Cnd_attr_char9 = p.beansFactory.createTextField("Cnd.attr_char9");
		p.Cnd_attr_char9.setLabel(p.Cnd_attr_char9_Label);
		p.Cnd_attr_char10_Label = p.beansFactory.createLabel("Cnd.attr_char10_Label");
		p.Cnd_attr_char10 = p.beansFactory.createTextField("Cnd.attr_char10");
		p.Cnd_attr_char10.setLabel(p.Cnd_attr_char10_Label);
		p.Cnd_attr_char11_Label = p.beansFactory.createLabel("Cnd.attr_char11_Label");
		p.Cnd_attr_char11 = p.beansFactory.createTextField("Cnd.attr_char11");
		p.Cnd_attr_char11.setLabel(p.Cnd_attr_char11_Label);
		p.Cnd_attr_char12_Label = p.beansFactory.createLabel("Cnd.attr_char12_Label");
		p.Cnd_attr_char12 = p.beansFactory.createTextField("Cnd.attr_char12");
		p.Cnd_attr_char12.setLabel(p.Cnd_attr_char12_Label);
		p.Cnd_attr_char13_Label = p.beansFactory.createLabel("Cnd.attr_char13_Label");
		p.Cnd_attr_char13 = p.beansFactory.createTextField("Cnd.attr_char13");
		p.Cnd_attr_char13.setLabel(p.Cnd_attr_char13_Label);
		p.Cnd_attr_char14_Label = p.beansFactory.createLabel("Cnd.attr_char14_Label");
		p.Cnd_attr_char14 = p.beansFactory.createTextField("Cnd.attr_char14");
		p.Cnd_attr_char14.setLabel(p.Cnd_attr_char14_Label);
		p.Cnd_attr_char15_Label = p.beansFactory.createLabel("Cnd.attr_char15_Label");
		p.Cnd_attr_char15 = p.beansFactory.createTextField("Cnd.attr_char15");
		p.Cnd_attr_char15.setLabel(p.Cnd_attr_char15_Label);
		p.Cnd_attr_char16_Label = p.beansFactory.createLabel("Cnd.attr_char16_Label");
		p.Cnd_attr_char16 = p.beansFactory.createTextField("Cnd.attr_char16");
		p.Cnd_attr_char16.setLabel(p.Cnd_attr_char16_Label);
		p.Cnd_attr_char17_Label = p.beansFactory.createLabel("Cnd.attr_char17_Label");
		p.Cnd_attr_char17 = p.beansFactory.createTextField("Cnd.attr_char17");
		p.Cnd_attr_char17.setLabel(p.Cnd_attr_char17_Label);
		p.Cnd_attr_char18_Label = p.beansFactory.createLabel("Cnd.attr_char18_Label");
		p.Cnd_attr_char18 = p.beansFactory.createTextField("Cnd.attr_char18");
		p.Cnd_attr_char18.setLabel(p.Cnd_attr_char18_Label);
		p.Cnd_attr_char19_Label = p.beansFactory.createLabel("Cnd.attr_char19_Label");
		p.Cnd_attr_char19 = p.beansFactory.createTextField("Cnd.attr_char19");
		p.Cnd_attr_char19.setLabel(p.Cnd_attr_char19_Label);
		p.Cnd_attr_char20_Label = p.beansFactory.createLabel("Cnd.attr_char20_Label");
		p.Cnd_attr_char20 = p.beansFactory.createTextField("Cnd.attr_char20");
		p.Cnd_attr_char20.setLabel(p.Cnd_attr_char20_Label);
		p.Cnd_attr_char21_Label = p.beansFactory.createLabel("Cnd.attr_char21_Label");
		p.Cnd_attr_char21 = p.beansFactory.createTextField("Cnd.attr_char21");
		p.Cnd_attr_char21.setLabel(p.Cnd_attr_char21_Label);
		p.Cnd_attr_char22_Label = p.beansFactory.createLabel("Cnd.attr_char22_Label");
		p.Cnd_attr_char22 = p.beansFactory.createTextField("Cnd.attr_char22");
		p.Cnd_attr_char22.setLabel(p.Cnd_attr_char22_Label);
		p.Cnd_attr_char23_Label = p.beansFactory.createLabel("Cnd.attr_char23_Label");
		p.Cnd_attr_char23 = p.beansFactory.createTextField("Cnd.attr_char23");
		p.Cnd_attr_char23.setLabel(p.Cnd_attr_char23_Label);
		p.Cnd_attr_char24_Label = p.beansFactory.createLabel("Cnd.attr_char24_Label");
		p.Cnd_attr_char24 = p.beansFactory.createTextField("Cnd.attr_char24");
		p.Cnd_attr_char24.setLabel(p.Cnd_attr_char24_Label);
		p.Cnd_attr_char25_Label = p.beansFactory.createLabel("Cnd.attr_char25_Label");
		p.Cnd_attr_char25 = p.beansFactory.createTextField("Cnd.attr_char25");
		p.Cnd_attr_char25.setLabel(p.Cnd_attr_char25_Label);
		p.Cnd_attr_char26_Label = p.beansFactory.createLabel("Cnd.attr_char26_Label");
		p.Cnd_attr_char26 = p.beansFactory.createTextField("Cnd.attr_char26");
		p.Cnd_attr_char26.setLabel(p.Cnd_attr_char26_Label);
		p.Cnd_attr_char27_Label = p.beansFactory.createLabel("Cnd.attr_char27_Label");
		p.Cnd_attr_char27 = p.beansFactory.createTextField("Cnd.attr_char27");
		p.Cnd_attr_char27.setLabel(p.Cnd_attr_char27_Label);
		p.Cnd_attr_char28_Label = p.beansFactory.createLabel("Cnd.attr_char28_Label");
		p.Cnd_attr_char28 = p.beansFactory.createTextField("Cnd.attr_char28");
		p.Cnd_attr_char28.setLabel(p.Cnd_attr_char28_Label);
		p.Cnd_attr_char29_Label = p.beansFactory.createLabel("Cnd.attr_char29_Label");
		p.Cnd_attr_char29 = p.beansFactory.createTextField("Cnd.attr_char29");
		p.Cnd_attr_char29.setLabel(p.Cnd_attr_char29_Label);
		p.Cnd_attr_char30_Label = p.beansFactory.createLabel("Cnd.attr_char30_Label");
		p.Cnd_attr_char30 = p.beansFactory.createTextField("Cnd.attr_char30");
		p.Cnd_attr_char30.setLabel(p.Cnd_attr_char30_Label);
		p.Cnd_attr_num1_Label = p.beansFactory.createLabel("Cnd.attr_num1_Label");
		p.Cnd_attr_num1 = p.beansFactory.createNumberField("Cnd.attr_num1");
		p.Cnd_attr_num1.setLabel(p.Cnd_attr_num1_Label);
		p.Cnd_attr_num2_Label = p.beansFactory.createLabel("Cnd.attr_num2_Label");
		p.Cnd_attr_num2 = p.beansFactory.createNumberField("Cnd.attr_num2");
		p.Cnd_attr_num2.setLabel(p.Cnd_attr_num2_Label);
		p.Cnd_attr_num3_Label = p.beansFactory.createLabel("Cnd.attr_num3_Label");
		p.Cnd_attr_num3 = p.beansFactory.createNumberField("Cnd.attr_num3");
		p.Cnd_attr_num3.setLabel(p.Cnd_attr_num3_Label);
		p.Cnd_attr_num4_Label = p.beansFactory.createLabel("Cnd.attr_num4_Label");
		p.Cnd_attr_num4 = p.beansFactory.createNumberField("Cnd.attr_num4");
		p.Cnd_attr_num4.setLabel(p.Cnd_attr_num4_Label);
		p.Cnd_attr_num5_Label = p.beansFactory.createLabel("Cnd.attr_num5_Label");
		p.Cnd_attr_num5 = p.beansFactory.createNumberField("Cnd.attr_num5");
		p.Cnd_attr_num5.setLabel(p.Cnd_attr_num5_Label);
		p.Cnd_attr_dt1_Label = p.beansFactory.createLabel("Cnd.attr_dt1_Label");
		p.Cnd_attr_dt1 = p.beansFactory.createDateField("Cnd.attr_dt1");
		p.Cnd_attr_dt1.setLabel(p.Cnd_attr_dt1_Label);
		p.Cnd_attr_dt2_Label = p.beansFactory.createLabel("Cnd.attr_dt2_Label");
		p.Cnd_attr_dt2 = p.beansFactory.createDateField("Cnd.attr_dt2");
		p.Cnd_attr_dt2.setLabel(p.Cnd_attr_dt2_Label);
		p.Cnd_attr_dt3_Label = p.beansFactory.createLabel("Cnd.attr_dt3_Label");
		p.Cnd_attr_dt3 = p.beansFactory.createDateField("Cnd.attr_dt3");
		p.Cnd_attr_dt3.setLabel(p.Cnd_attr_dt3_Label);
		p.Cnd_attr_dt4_Label = p.beansFactory.createLabel("Cnd.attr_dt4_Label");
		p.Cnd_attr_dt4 = p.beansFactory.createDateField("Cnd.attr_dt4");
		p.Cnd_attr_dt4.setLabel(p.Cnd_attr_dt4_Label);
		p.Cnd_attr_dt5_Label = p.beansFactory.createLabel("Cnd.attr_dt5_Label");
		p.Cnd_attr_dt5 = p.beansFactory.createDateField("Cnd.attr_dt5");
		p.Cnd_attr_dt5.setLabel(p.Cnd_attr_dt5_Label);
		p.Cnd_attr_dt1_fr_Label = p.beansFactory.createLabel("Cnd.attr_dt1_fr_Label");
		p.Cnd_attr_dt1_fr = p.beansFactory.createDateField("Cnd.attr_dt1_fr");
		p.Cnd_attr_dt1_fr.setLabel(p.Cnd_attr_dt1_fr_Label);
		p.Cnd_attr_dt1_to_Label = p.beansFactory.createLabel("Cnd.attr_dt1_to_Label");
		p.Cnd_attr_dt1_to = p.beansFactory.createDateField("Cnd.attr_dt1_to");
		p.Cnd_attr_dt1_to.setLabel(p.Cnd_attr_dt1_to_Label);
		p.Cnd_attr_dt2_fr_Label = p.beansFactory.createLabel("Cnd.attr_dt2_fr_Label");
		p.Cnd_attr_dt2_fr = p.beansFactory.createDateField("Cnd.attr_dt2_fr");
		p.Cnd_attr_dt2_fr.setLabel(p.Cnd_attr_dt2_fr_Label);
		p.Cnd_attr_dt2_to_Label = p.beansFactory.createLabel("Cnd.attr_dt2_to_Label");
		p.Cnd_attr_dt2_to = p.beansFactory.createDateField("Cnd.attr_dt2_to");
		p.Cnd_attr_dt2_to.setLabel(p.Cnd_attr_dt2_to_Label);
		p.Cnd_attr_dt3_fr_Label = p.beansFactory.createLabel("Cnd.attr_dt3_fr_Label");
		p.Cnd_attr_dt3_fr = p.beansFactory.createDateField("Cnd.attr_dt3_fr");
		p.Cnd_attr_dt3_fr.setLabel(p.Cnd_attr_dt3_fr_Label);
		p.Cnd_attr_dt3_to_Label = p.beansFactory.createLabel("Cnd.attr_dt3_to_Label");
		p.Cnd_attr_dt3_to = p.beansFactory.createDateField("Cnd.attr_dt3_to");
		p.Cnd_attr_dt3_to.setLabel(p.Cnd_attr_dt3_to_Label);
		p.Cnd_attr_dt4_fr_Label = p.beansFactory.createLabel("Cnd.attr_dt4_fr_Label");
		p.Cnd_attr_dt4_fr = p.beansFactory.createDateField("Cnd.attr_dt4_fr");
		p.Cnd_attr_dt4_fr.setLabel(p.Cnd_attr_dt4_fr_Label);
		p.Cnd_attr_dt4_to_Label = p.beansFactory.createLabel("Cnd.attr_dt4_to_Label");
		p.Cnd_attr_dt4_to = p.beansFactory.createDateField("Cnd.attr_dt4_to");
		p.Cnd_attr_dt4_to.setLabel(p.Cnd_attr_dt4_to_Label);
		p.Cnd_attr_dt5_fr_Label = p.beansFactory.createLabel("Cnd.attr_dt5_fr_Label");
		p.Cnd_attr_dt5_fr = p.beansFactory.createDateField("Cnd.attr_dt5_fr");
		p.Cnd_attr_dt5_fr.setLabel(p.Cnd_attr_dt5_fr_Label);
		p.Cnd_attr_dt5_to_Label = p.beansFactory.createLabel("Cnd.attr_dt5_to_Label");
		p.Cnd_attr_dt5_to = p.beansFactory.createDateField("Cnd.attr_dt5_to");
		p.Cnd_attr_dt5_to.setLabel(p.Cnd_attr_dt5_to_Label);
		p.Cnd_attr_tm1_fr_Label = p.beansFactory.createLabel("Cnd.attr_tm1_fr_Label");
		p.Cnd_attr_tm1_fr = p.beansFactory.createDateField("Cnd.attr_tm1_fr");
		p.Cnd_attr_tm1_fr.setLabel(p.Cnd_attr_tm1_fr_Label);
		p.Cnd_attr_tm1_to_Label = p.beansFactory.createLabel("Cnd.attr_tm1_to_Label");
		p.Cnd_attr_tm1_to = p.beansFactory.createDateField("Cnd.attr_tm1_to");
		p.Cnd_attr_tm1_to.setLabel(p.Cnd_attr_tm1_to_Label);
		p.Cnd_attr_tm2_fr_Label = p.beansFactory.createLabel("Cnd.attr_tm2_fr_Label");
		p.Cnd_attr_tm2_fr = p.beansFactory.createDateField("Cnd.attr_tm2_fr");
		p.Cnd_attr_tm2_fr.setLabel(p.Cnd_attr_tm2_fr_Label);
		p.Cnd_attr_tm2_to_Label = p.beansFactory.createLabel("Cnd.attr_tm2_to_Label");
		p.Cnd_attr_tm2_to = p.beansFactory.createDateField("Cnd.attr_tm2_to");
		p.Cnd_attr_tm2_to.setLabel(p.Cnd_attr_tm2_to_Label);
		p.Cnd_attr_tm3_fr_Label = p.beansFactory.createLabel("Cnd.attr_tm3_fr_Label");
		p.Cnd_attr_tm3_fr = p.beansFactory.createDateField("Cnd.attr_tm3_fr");
		p.Cnd_attr_tm3_fr.setLabel(p.Cnd_attr_tm3_fr_Label);
		p.Cnd_attr_tm3_to_Label = p.beansFactory.createLabel("Cnd.attr_tm3_to_Label");
		p.Cnd_attr_tm3_to = p.beansFactory.createDateField("Cnd.attr_tm3_to");
		p.Cnd_attr_tm3_to.setLabel(p.Cnd_attr_tm3_to_Label);
		p.Cnd_attr_tm4_fr_Label = p.beansFactory.createLabel("Cnd.attr_tm4_fr_Label");
		p.Cnd_attr_tm4_fr = p.beansFactory.createDateField("Cnd.attr_tm4_fr");
		p.Cnd_attr_tm4_fr.setLabel(p.Cnd_attr_tm4_fr_Label);
		p.Cnd_attr_tm4_to_Label = p.beansFactory.createLabel("Cnd.attr_tm4_to_Label");
		p.Cnd_attr_tm4_to = p.beansFactory.createDateField("Cnd.attr_tm4_to");
		p.Cnd_attr_tm4_to.setLabel(p.Cnd_attr_tm4_to_Label);
		p.Cnd_attr_tm5_fr_Label = p.beansFactory.createLabel("Cnd.attr_tm5_fr_Label");
		p.Cnd_attr_tm5_fr = p.beansFactory.createDateField("Cnd.attr_tm5_fr");
		p.Cnd_attr_tm5_fr.setLabel(p.Cnd_attr_tm5_fr_Label);
		p.Cnd_attr_tm5_to_Label = p.beansFactory.createLabel("Cnd.attr_tm5_to_Label");
		p.Cnd_attr_tm5_to = p.beansFactory.createDateField("Cnd.attr_tm5_to");
		p.Cnd_attr_tm5_to.setLabel(p.Cnd_attr_tm5_to_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_recv_flg = p.beansFactory.createTableColumn("Dtl.recv_flg", MCColumnType.CHECK);
		p.columnDtl_if_proc_typ = p.beansFactory.createTableColumn("Dtl.if_proc_typ", MCColumnType.TEXT);
		p.columnDtl_if_proc_typ_nm = p.beansFactory.createTableColumn("Dtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_data_no = p.beansFactory.createTableColumn("Dtl.data_no", MCColumnType.NUMBER);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_sdrv_sts_typ = p.beansFactory.createTableColumn("Dtl.sdrv_sts_typ", MCColumnType.TEXT);
		p.columnDtl_sdrv_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.sdrv_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sdrv_tm = p.beansFactory.createTableColumn("Dtl.sdrv_tm", MCColumnType.DATE);
		p.columnDtl_file_id = p.beansFactory.createTableColumn("Dtl.file_id", MCColumnType.NUMBER);
		p.columnDtl_file_nm = p.beansFactory.createTableColumn("Dtl.file_nm", MCColumnType.TEXT);
		p.columnDtl_file_path = p.beansFactory.createTableColumn("Dtl.file_path", MCColumnType.TEXT);
		p.columnDtl_conv_ope = p.beansFactory.createTableColumn("Dtl.conv_ope", MCColumnType.TEXT);
		p.columnDtl_file_io_ope = p.beansFactory.createTableColumn("Dtl.file_io_ope", MCColumnType.TEXT);
		p.columnDtl_web_api_ope = p.beansFactory.createTableColumn("Dtl.web_api_ope", MCColumnType.TEXT);
		p.columnDtl_sdrv_clt_id = p.beansFactory.createTableColumn("Dtl.sdrv_clt_id", MCColumnType.TEXT);
		p.columnDtl_sdrv_usr_id = p.beansFactory.createTableColumn("Dtl.sdrv_usr_id", MCColumnType.TEXT);
		p.columnDtl_sdrv_usr_nm = p.beansFactory.createTableColumn("Dtl.sdrv_usr_nm", MCColumnType.TEXT);
		p.columnDtl_attr_char1 = p.beansFactory.createTableColumn("Dtl.attr_char1", MCColumnType.TEXT);
		p.columnDtl_attr_char2 = p.beansFactory.createTableColumn("Dtl.attr_char2", MCColumnType.TEXT);
		p.columnDtl_attr_char3 = p.beansFactory.createTableColumn("Dtl.attr_char3", MCColumnType.TEXT);
		p.columnDtl_attr_char4 = p.beansFactory.createTableColumn("Dtl.attr_char4", MCColumnType.TEXT);
		p.columnDtl_attr_char5 = p.beansFactory.createTableColumn("Dtl.attr_char5", MCColumnType.TEXT);
		p.columnDtl_attr_char6 = p.beansFactory.createTableColumn("Dtl.attr_char6", MCColumnType.TEXT);
		p.columnDtl_attr_char7 = p.beansFactory.createTableColumn("Dtl.attr_char7", MCColumnType.TEXT);
		p.columnDtl_attr_char8 = p.beansFactory.createTableColumn("Dtl.attr_char8", MCColumnType.TEXT);
		p.columnDtl_attr_char9 = p.beansFactory.createTableColumn("Dtl.attr_char9", MCColumnType.TEXT);
		p.columnDtl_attr_char10 = p.beansFactory.createTableColumn("Dtl.attr_char10", MCColumnType.TEXT);
		p.columnDtl_attr_char11 = p.beansFactory.createTableColumn("Dtl.attr_char11", MCColumnType.TEXT);
		p.columnDtl_attr_char12 = p.beansFactory.createTableColumn("Dtl.attr_char12", MCColumnType.TEXT);
		p.columnDtl_attr_char13 = p.beansFactory.createTableColumn("Dtl.attr_char13", MCColumnType.TEXT);
		p.columnDtl_attr_char14 = p.beansFactory.createTableColumn("Dtl.attr_char14", MCColumnType.TEXT);
		p.columnDtl_attr_char15 = p.beansFactory.createTableColumn("Dtl.attr_char15", MCColumnType.TEXT);
		p.columnDtl_attr_char16 = p.beansFactory.createTableColumn("Dtl.attr_char16", MCColumnType.TEXT);
		p.columnDtl_attr_char17 = p.beansFactory.createTableColumn("Dtl.attr_char17", MCColumnType.TEXT);
		p.columnDtl_attr_char18 = p.beansFactory.createTableColumn("Dtl.attr_char18", MCColumnType.TEXT);
		p.columnDtl_attr_char19 = p.beansFactory.createTableColumn("Dtl.attr_char19", MCColumnType.TEXT);
		p.columnDtl_attr_char20 = p.beansFactory.createTableColumn("Dtl.attr_char20", MCColumnType.TEXT);
		p.columnDtl_attr_char21 = p.beansFactory.createTableColumn("Dtl.attr_char21", MCColumnType.TEXT);
		p.columnDtl_attr_char22 = p.beansFactory.createTableColumn("Dtl.attr_char22", MCColumnType.TEXT);
		p.columnDtl_attr_char23 = p.beansFactory.createTableColumn("Dtl.attr_char23", MCColumnType.TEXT);
		p.columnDtl_attr_char24 = p.beansFactory.createTableColumn("Dtl.attr_char24", MCColumnType.TEXT);
		p.columnDtl_attr_char25 = p.beansFactory.createTableColumn("Dtl.attr_char25", MCColumnType.TEXT);
		p.columnDtl_attr_char26 = p.beansFactory.createTableColumn("Dtl.attr_char26", MCColumnType.TEXT);
		p.columnDtl_attr_char27 = p.beansFactory.createTableColumn("Dtl.attr_char27", MCColumnType.TEXT);
		p.columnDtl_attr_char28 = p.beansFactory.createTableColumn("Dtl.attr_char28", MCColumnType.TEXT);
		p.columnDtl_attr_char29 = p.beansFactory.createTableColumn("Dtl.attr_char29", MCColumnType.TEXT);
		p.columnDtl_attr_char30 = p.beansFactory.createTableColumn("Dtl.attr_char30", MCColumnType.TEXT);
		p.columnDtl_attr_num1 = p.beansFactory.createTableColumn("Dtl.attr_num1", MCColumnType.NUMBER);
		p.columnDtl_attr_num2 = p.beansFactory.createTableColumn("Dtl.attr_num2", MCColumnType.NUMBER);
		p.columnDtl_attr_num3 = p.beansFactory.createTableColumn("Dtl.attr_num3", MCColumnType.NUMBER);
		p.columnDtl_attr_num4 = p.beansFactory.createTableColumn("Dtl.attr_num4", MCColumnType.NUMBER);
		p.columnDtl_attr_num5 = p.beansFactory.createTableColumn("Dtl.attr_num5", MCColumnType.NUMBER);
		p.columnDtl_attr_dt1 = p.beansFactory.createTableColumn("Dtl.attr_dt1", MCColumnType.DATE);
		p.columnDtl_attr_dt2 = p.beansFactory.createTableColumn("Dtl.attr_dt2", MCColumnType.DATE);
		p.columnDtl_attr_dt3 = p.beansFactory.createTableColumn("Dtl.attr_dt3", MCColumnType.DATE);
		p.columnDtl_attr_dt4 = p.beansFactory.createTableColumn("Dtl.attr_dt4", MCColumnType.DATE);
		p.columnDtl_attr_dt5 = p.beansFactory.createTableColumn("Dtl.attr_dt5", MCColumnType.DATE);
		p.columnDtl_attr_tm1 = p.beansFactory.createTableColumn("Dtl.attr_tm1", MCColumnType.DATE);
		p.columnDtl_attr_tm2 = p.beansFactory.createTableColumn("Dtl.attr_tm2", MCColumnType.DATE);
		p.columnDtl_attr_tm3 = p.beansFactory.createTableColumn("Dtl.attr_tm3", MCColumnType.DATE);
		p.columnDtl_attr_tm4 = p.beansFactory.createTableColumn("Dtl.attr_tm4", MCColumnType.DATE);
		p.columnDtl_attr_tm5 = p.beansFactory.createTableColumn("Dtl.attr_tm5", MCColumnType.DATE);
		p.columnDtl_batch_log_no = p.beansFactory.createTableColumn("Dtl.batch_log_no", MCColumnType.TEXT);
		p.columnDtl_log_sub_key1 = p.beansFactory.createTableColumn("Dtl.log_sub_key1", MCColumnType.NUMBER);
		p.columnDtl_log_sub_key2 = p.beansFactory.createTableColumn("Dtl.log_sub_key2", MCColumnType.NUMBER);
	}

	/**
	 * [Filter]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFilter(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.FilterPanel = p.beansFactory.createPanel("Filter");
		// ブロックの項目の初期化
		p.Filter_disp_warn = p.beansFactory.createCheckBox("Filter.disp_warn");
		p.Filter_disp_not_warn = p.beansFactory.createCheckBox("Filter.disp_not_warn");
		p.Filter_div = p.beansFactory.createLabel("Filter.div");
		p.Filter_disp_start_log = p.beansFactory.createCheckBox("Filter.disp_start_log");
		p.Filter_disp_data_log = p.beansFactory.createCheckBox("Filter.disp_data_log");
		p.Filter_disp_proc_log = p.beansFactory.createCheckBox("Filter.disp_proc_log");
		p.Filter_disp_end_log = p.beansFactory.createCheckBox("Filter.disp_end_log");
	}

	/**
	 * [Msg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMsg(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.MsgPanel = p.beansFactory.createPanel("Msg");
		p.MsgScrollPane = p.beansFactory.createScrollPane("Msg.scroll");
		p.createMsgTable();
		// ブロックの項目の初期化
		p.columnMsg_batch_log_typ = p.beansFactory.createTableColumn("Msg.batch_log_typ", MCColumnType.TEXT_COMBO);
		p.columnMsg_batch_log_typ_nm = p.beansFactory.createTableColumn("Msg.batch_log_typ_nm", MCColumnType.TEXT);
		p.columnMsg_msg_id = p.beansFactory.createTableColumn("Msg.msg_id", MCColumnType.TEXT);
		p.columnMsg_msg_txt = p.beansFactory.createTableColumn("Msg.msg_txt", MCColumnType.TEXT);
		p.columnMsg_msg_lvl = p.beansFactory.createTableColumn("Msg.msg_lvl", MCColumnType.TEXT);
		p.columnMsg_log_ts = p.beansFactory.createTableColumn("Msg.log_ts", MCColumnType.TIMESTAMP);
		p.columnMsg_seq = p.beansFactory.createTableColumn("Msg.seq", MCColumnType.NUMBER);
		p.columnMsg_batch_log_no = p.beansFactory.createTableColumn("Msg.batch_log_no", MCColumnType.TEXT);
		p.columnMsg_log_sub_key1 = p.beansFactory.createTableColumn("Msg.log_sub_key1", MCColumnType.NUMBER);
		p.columnMsg_log_sub_key2 = p.beansFactory.createTableColumn("Msg.log_sub_key2", MCColumnType.NUMBER);
	}

	/**
	 * [MsgArea]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMsgArea(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.MsgAreaPanel = p.beansFactory.createPanel("MsgArea");
		// ブロックの項目の初期化
		p.MsgArea_msgScrollPane = p.beansFactory.createScrollPane("MsgArea.msgscroll");
		p.MsgArea_msg = p.beansFactory.createTextArea("MsgArea.msg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_conv = p.beansFactory.createButton("Btn.conv", "upd");
	}

	/**
	 * [Knd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitKnd(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.KndPanel.setBorder(p.KndTitledBorder);
		p.add(p.KndPanel);
		p.setLastBeans(p.KndPanel);
		p.KndPanel.setNextBeans(p.TopPanel);
		p.KndPanel.setValueCheck(false);
		p.KndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.KndPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
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
	protected static void jbInitFold(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.KndPanel.add(p.Cnd_recv_err_flg);
		p.KndPanel.setLastBeans(p.Cnd_recv_err_flg);
		p.Cnd_recv_err_flg.setNextBeans(p.Cnd_recv_ok_flg);
		p.Cnd_recv_err_flg.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.recv_err_flg_META);
		p.KndPanel.add(p.Cnd_recv_ok_flg);
		p.Cnd_recv_ok_flg.setNextBeans(p.Cnd_recv_conv_err_flg);
		p.Cnd_recv_ok_flg.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.recv_ok_flg_META);
		p.KndPanel.add(p.Cnd_recv_conv_err_flg);
		p.Cnd_recv_conv_err_flg.setNextBeans(p.Cnd_recv_conv_ok_flg);
		p.Cnd_recv_conv_err_flg.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.recv_conv_err_flg_META);
		p.KndPanel.add(p.Cnd_recv_conv_ok_flg);
		p.Cnd_recv_conv_ok_flg.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.recv_conv_ok_flg_META);
		p.Cnd_if_proc_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_if_proc_typ, true);
		p.Cnd_if_proc_typ.setLinkBeans(p.Cnd_if_proc_typ_nm);
		p.CndPanel.add(p.Cnd_if_proc_typ_Label);
		p.CndPanel.add(p.Cnd_if_proc_typ);
		p.CndPanel.setLastBeans(p.Cnd_if_proc_typ);
		p.Cnd_if_proc_typ.setNextBeans(p.Cnd_if_proc_typ_nm);
		p.Cnd_if_proc_typ.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.if_proc_typ_META);
		p.CndPanel.add(p.Cnd_if_proc_typ_nm);
		p.Cnd_if_proc_typ_nm.setNextBeans(p.Cnd_data_no_fr);
		p.Cnd_if_proc_typ_nm.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.if_proc_typ_nm_META);
		p.CndPanel.add(p.Cnd_data_no_fr_Label);
		p.CndPanel.add(p.Cnd_data_no_fr);
		p.Cnd_data_no_fr.setNextBeans(p.Cnd_data_no_to);
		p.Cnd_data_no_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.data_no_fr_META);
		p.CndPanel.add(p.Cnd_data_no_to_Label);
		p.CndPanel.add(p.Cnd_data_no_to);
		p.Cnd_data_no_to.setNextBeans(p.Cnd_ext_sys_cd);
		p.Cnd_data_no_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.data_no_to_META);
		p.Cnd_ext_sys_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ext_sys_cd, true);
		p.Cnd_ext_sys_cd.setLinkBeans(p.Cnd_ext_sys_nm);
		p.CndPanel.add(p.Cnd_ext_sys_cd_Label);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.ext_sys_cd_META);
		p.CndPanel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_sdrv_tm_fr);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.ext_sys_nm_META);
		p.CndPanel.add(p.Cnd_sdrv_tm_fr_Label);
		p.CndPanel.add(p.Cnd_sdrv_tm_fr);
		p.Cnd_sdrv_tm_fr.setNextBeans(p.Cnd_sdrv_tm_to);
		p.Cnd_sdrv_tm_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.sdrv_tm_fr_META);
		p.Cnd_sdrv_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_sdrv_tm_to_Label);
		p.CndPanel.add(p.Cnd_sdrv_tm_to);
		p.Cnd_sdrv_tm_to.setNextBeans(p.Cnd_file_nm);
		p.Cnd_sdrv_tm_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.sdrv_tm_to_META);
		p.Cnd_sdrv_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_file_nm_Label);
		p.CndPanel.add(p.Cnd_file_nm);
		p.Cnd_file_nm.setNextBeans(p.Cnd_batch_log_no);
		p.Cnd_file_nm.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.file_nm_META);
		p.setPluralValueEnable(p.Cnd_file_nm, true);
		p.CndPanel.add(p.Cnd_batch_log_no_Label);
		p.CndPanel.add(p.Cnd_batch_log_no);
		p.Cnd_batch_log_no.setNextBeans(p.Cnd_ins_srv_req_no);
		p.Cnd_batch_log_no.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.batch_log_no_META);
		p.setPluralValueEnable(p.Cnd_batch_log_no, true);
		p.CndPanel.add(p.Cnd_ins_srv_req_no_Label);
		p.CndPanel.add(p.Cnd_ins_srv_req_no);
		p.Cnd_ins_srv_req_no.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.ins_srv_req_no_META);
		p.Cnd2Panel.add(p.Cnd_attr_char1_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char1);
		p.Cnd2Panel.setLastBeans(p.Cnd_attr_char1);
		p.Cnd_attr_char1.setNextBeans(p.Cnd_attr_char2);
		p.Cnd_attr_char1.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char1_META);
		p.setPluralValueEnable(p.Cnd_attr_char1, true);
		p.Cnd2Panel.add(p.Cnd_attr_char2_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char2);
		p.Cnd_attr_char2.setNextBeans(p.Cnd_attr_char3);
		p.Cnd_attr_char2.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char2_META);
		p.setPluralValueEnable(p.Cnd_attr_char2, true);
		p.Cnd2Panel.add(p.Cnd_attr_char3_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char3);
		p.Cnd_attr_char3.setNextBeans(p.Cnd_attr_char4);
		p.Cnd_attr_char3.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char3_META);
		p.setPluralValueEnable(p.Cnd_attr_char3, true);
		p.Cnd2Panel.add(p.Cnd_attr_char4_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char4);
		p.Cnd_attr_char4.setNextBeans(p.Cnd_attr_char5);
		p.Cnd_attr_char4.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char4_META);
		p.setPluralValueEnable(p.Cnd_attr_char4, true);
		p.Cnd2Panel.add(p.Cnd_attr_char5_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char5);
		p.Cnd_attr_char5.setNextBeans(p.Cnd_attr_char6);
		p.Cnd_attr_char5.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char5_META);
		p.setPluralValueEnable(p.Cnd_attr_char5, true);
		p.Cnd2Panel.add(p.Cnd_attr_char6_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char6);
		p.Cnd_attr_char6.setNextBeans(p.Cnd_attr_char7);
		p.Cnd_attr_char6.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char6_META);
		p.setPluralValueEnable(p.Cnd_attr_char6, true);
		p.Cnd2Panel.add(p.Cnd_attr_char7_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char7);
		p.Cnd_attr_char7.setNextBeans(p.Cnd_attr_char8);
		p.Cnd_attr_char7.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char7_META);
		p.setPluralValueEnable(p.Cnd_attr_char7, true);
		p.Cnd2Panel.add(p.Cnd_attr_char8_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char8);
		p.Cnd_attr_char8.setNextBeans(p.Cnd_attr_char9);
		p.Cnd_attr_char8.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char8_META);
		p.setPluralValueEnable(p.Cnd_attr_char8, true);
		p.Cnd2Panel.add(p.Cnd_attr_char9_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char9);
		p.Cnd_attr_char9.setNextBeans(p.Cnd_attr_char10);
		p.Cnd_attr_char9.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char9_META);
		p.setPluralValueEnable(p.Cnd_attr_char9, true);
		p.Cnd2Panel.add(p.Cnd_attr_char10_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char10);
		p.Cnd_attr_char10.setNextBeans(p.Cnd_attr_char11);
		p.Cnd_attr_char10.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char10_META);
		p.setPluralValueEnable(p.Cnd_attr_char10, true);
		p.Cnd2Panel.add(p.Cnd_attr_char11_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char11);
		p.Cnd_attr_char11.setNextBeans(p.Cnd_attr_char12);
		p.Cnd_attr_char11.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char11_META);
		p.setPluralValueEnable(p.Cnd_attr_char11, true);
		p.Cnd2Panel.add(p.Cnd_attr_char12_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char12);
		p.Cnd_attr_char12.setNextBeans(p.Cnd_attr_char13);
		p.Cnd_attr_char12.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char12_META);
		p.setPluralValueEnable(p.Cnd_attr_char12, true);
		p.Cnd2Panel.add(p.Cnd_attr_char13_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char13);
		p.Cnd_attr_char13.setNextBeans(p.Cnd_attr_char14);
		p.Cnd_attr_char13.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char13_META);
		p.setPluralValueEnable(p.Cnd_attr_char13, true);
		p.Cnd2Panel.add(p.Cnd_attr_char14_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char14);
		p.Cnd_attr_char14.setNextBeans(p.Cnd_attr_char15);
		p.Cnd_attr_char14.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char14_META);
		p.setPluralValueEnable(p.Cnd_attr_char14, true);
		p.Cnd2Panel.add(p.Cnd_attr_char15_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char15);
		p.Cnd_attr_char15.setNextBeans(p.Cnd_attr_char16);
		p.Cnd_attr_char15.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char15_META);
		p.setPluralValueEnable(p.Cnd_attr_char15, true);
		p.Cnd2Panel.add(p.Cnd_attr_char16_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char16);
		p.Cnd_attr_char16.setNextBeans(p.Cnd_attr_char17);
		p.Cnd_attr_char16.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char16_META);
		p.setPluralValueEnable(p.Cnd_attr_char16, true);
		p.Cnd2Panel.add(p.Cnd_attr_char17_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char17);
		p.Cnd_attr_char17.setNextBeans(p.Cnd_attr_char18);
		p.Cnd_attr_char17.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char17_META);
		p.setPluralValueEnable(p.Cnd_attr_char17, true);
		p.Cnd2Panel.add(p.Cnd_attr_char18_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char18);
		p.Cnd_attr_char18.setNextBeans(p.Cnd_attr_char19);
		p.Cnd_attr_char18.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char18_META);
		p.setPluralValueEnable(p.Cnd_attr_char18, true);
		p.Cnd2Panel.add(p.Cnd_attr_char19_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char19);
		p.Cnd_attr_char19.setNextBeans(p.Cnd_attr_char20);
		p.Cnd_attr_char19.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char19_META);
		p.setPluralValueEnable(p.Cnd_attr_char19, true);
		p.Cnd2Panel.add(p.Cnd_attr_char20_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char20);
		p.Cnd_attr_char20.setNextBeans(p.Cnd_attr_char21);
		p.Cnd_attr_char20.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char20_META);
		p.setPluralValueEnable(p.Cnd_attr_char20, true);
		p.Cnd2Panel.add(p.Cnd_attr_char21_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char21);
		p.Cnd_attr_char21.setNextBeans(p.Cnd_attr_char22);
		p.Cnd_attr_char21.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char21_META);
		p.setPluralValueEnable(p.Cnd_attr_char21, true);
		p.Cnd2Panel.add(p.Cnd_attr_char22_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char22);
		p.Cnd_attr_char22.setNextBeans(p.Cnd_attr_char23);
		p.Cnd_attr_char22.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char22_META);
		p.setPluralValueEnable(p.Cnd_attr_char22, true);
		p.Cnd2Panel.add(p.Cnd_attr_char23_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char23);
		p.Cnd_attr_char23.setNextBeans(p.Cnd_attr_char24);
		p.Cnd_attr_char23.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char23_META);
		p.setPluralValueEnable(p.Cnd_attr_char23, true);
		p.Cnd2Panel.add(p.Cnd_attr_char24_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char24);
		p.Cnd_attr_char24.setNextBeans(p.Cnd_attr_char25);
		p.Cnd_attr_char24.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char24_META);
		p.setPluralValueEnable(p.Cnd_attr_char24, true);
		p.Cnd2Panel.add(p.Cnd_attr_char25_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char25);
		p.Cnd_attr_char25.setNextBeans(p.Cnd_attr_char26);
		p.Cnd_attr_char25.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char25_META);
		p.setPluralValueEnable(p.Cnd_attr_char25, true);
		p.Cnd2Panel.add(p.Cnd_attr_char26_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char26);
		p.Cnd_attr_char26.setNextBeans(p.Cnd_attr_char27);
		p.Cnd_attr_char26.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char26_META);
		p.setPluralValueEnable(p.Cnd_attr_char26, true);
		p.Cnd2Panel.add(p.Cnd_attr_char27_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char27);
		p.Cnd_attr_char27.setNextBeans(p.Cnd_attr_char28);
		p.Cnd_attr_char27.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char27_META);
		p.setPluralValueEnable(p.Cnd_attr_char27, true);
		p.Cnd2Panel.add(p.Cnd_attr_char28_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char28);
		p.Cnd_attr_char28.setNextBeans(p.Cnd_attr_char29);
		p.Cnd_attr_char28.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char28_META);
		p.setPluralValueEnable(p.Cnd_attr_char28, true);
		p.Cnd2Panel.add(p.Cnd_attr_char29_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char29);
		p.Cnd_attr_char29.setNextBeans(p.Cnd_attr_char30);
		p.Cnd_attr_char29.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char29_META);
		p.setPluralValueEnable(p.Cnd_attr_char29, true);
		p.Cnd2Panel.add(p.Cnd_attr_char30_Label);
		p.Cnd2Panel.add(p.Cnd_attr_char30);
		p.Cnd_attr_char30.setNextBeans(p.Cnd_attr_num1);
		p.Cnd_attr_char30.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_char30_META);
		p.setPluralValueEnable(p.Cnd_attr_char30, true);
		p.Cnd2Panel.add(p.Cnd_attr_num1_Label);
		p.Cnd2Panel.add(p.Cnd_attr_num1);
		p.Cnd_attr_num1.setNextBeans(p.Cnd_attr_num2);
		p.Cnd_attr_num1.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_num1_META);
		p.Cnd2Panel.add(p.Cnd_attr_num2_Label);
		p.Cnd2Panel.add(p.Cnd_attr_num2);
		p.Cnd_attr_num2.setNextBeans(p.Cnd_attr_num3);
		p.Cnd_attr_num2.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_num2_META);
		p.Cnd2Panel.add(p.Cnd_attr_num3_Label);
		p.Cnd2Panel.add(p.Cnd_attr_num3);
		p.Cnd_attr_num3.setNextBeans(p.Cnd_attr_num4);
		p.Cnd_attr_num3.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_num3_META);
		p.Cnd2Panel.add(p.Cnd_attr_num4_Label);
		p.Cnd2Panel.add(p.Cnd_attr_num4);
		p.Cnd_attr_num4.setNextBeans(p.Cnd_attr_num5);
		p.Cnd_attr_num4.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_num4_META);
		p.Cnd2Panel.add(p.Cnd_attr_num5_Label);
		p.Cnd2Panel.add(p.Cnd_attr_num5);
		p.Cnd_attr_num5.setNextBeans(p.Cnd_attr_dt1);
		p.Cnd_attr_num5.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_num5_META);
		p.Cnd2Panel.add(p.Cnd_attr_dt1_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt1);
		p.Cnd_attr_dt1.setNextBeans(p.Cnd_attr_dt2);
		p.Cnd_attr_dt1.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt1_META);
		p.Cnd_attr_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt2_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt2);
		p.Cnd_attr_dt2.setNextBeans(p.Cnd_attr_dt3);
		p.Cnd_attr_dt2.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt2_META);
		p.Cnd_attr_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt3_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt3);
		p.Cnd_attr_dt3.setNextBeans(p.Cnd_attr_dt4);
		p.Cnd_attr_dt3.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt3_META);
		p.Cnd_attr_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt4_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt4);
		p.Cnd_attr_dt4.setNextBeans(p.Cnd_attr_dt5);
		p.Cnd_attr_dt4.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt4_META);
		p.Cnd_attr_dt4.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt5_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt5);
		p.Cnd_attr_dt5.setNextBeans(p.Cnd_attr_dt1_fr);
		p.Cnd_attr_dt5.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt5_META);
		p.Cnd_attr_dt5.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt1_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt1_fr);
		p.Cnd_attr_dt1_fr.setNextBeans(p.Cnd_attr_dt1_to);
		p.Cnd_attr_dt1_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt1_fr_META);
		p.Cnd_attr_dt1_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt1_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt1_to);
		p.Cnd_attr_dt1_to.setNextBeans(p.Cnd_attr_dt2_fr);
		p.Cnd_attr_dt1_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt1_to_META);
		p.Cnd_attr_dt1_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt2_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt2_fr);
		p.Cnd_attr_dt2_fr.setNextBeans(p.Cnd_attr_dt2_to);
		p.Cnd_attr_dt2_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt2_fr_META);
		p.Cnd_attr_dt2_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt2_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt2_to);
		p.Cnd_attr_dt2_to.setNextBeans(p.Cnd_attr_dt3_fr);
		p.Cnd_attr_dt2_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt2_to_META);
		p.Cnd_attr_dt2_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt3_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt3_fr);
		p.Cnd_attr_dt3_fr.setNextBeans(p.Cnd_attr_dt3_to);
		p.Cnd_attr_dt3_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt3_fr_META);
		p.Cnd_attr_dt3_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt3_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt3_to);
		p.Cnd_attr_dt3_to.setNextBeans(p.Cnd_attr_dt4_fr);
		p.Cnd_attr_dt3_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt3_to_META);
		p.Cnd_attr_dt3_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt4_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt4_fr);
		p.Cnd_attr_dt4_fr.setNextBeans(p.Cnd_attr_dt4_to);
		p.Cnd_attr_dt4_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt4_fr_META);
		p.Cnd_attr_dt4_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt4_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt4_to);
		p.Cnd_attr_dt4_to.setNextBeans(p.Cnd_attr_dt5_fr);
		p.Cnd_attr_dt4_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt4_to_META);
		p.Cnd_attr_dt4_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt5_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt5_fr);
		p.Cnd_attr_dt5_fr.setNextBeans(p.Cnd_attr_dt5_to);
		p.Cnd_attr_dt5_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt5_fr_META);
		p.Cnd_attr_dt5_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_dt5_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_dt5_to);
		p.Cnd_attr_dt5_to.setNextBeans(p.Cnd_attr_tm1_fr);
		p.Cnd_attr_dt5_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_dt5_to_META);
		p.Cnd_attr_dt5_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm1_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm1_fr);
		p.Cnd_attr_tm1_fr.setNextBeans(p.Cnd_attr_tm1_to);
		p.Cnd_attr_tm1_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm1_fr_META);
		p.Cnd_attr_tm1_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm1_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm1_to);
		p.Cnd_attr_tm1_to.setNextBeans(p.Cnd_attr_tm2_fr);
		p.Cnd_attr_tm1_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm1_to_META);
		p.Cnd_attr_tm1_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm2_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm2_fr);
		p.Cnd_attr_tm2_fr.setNextBeans(p.Cnd_attr_tm2_to);
		p.Cnd_attr_tm2_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm2_fr_META);
		p.Cnd_attr_tm2_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm2_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm2_to);
		p.Cnd_attr_tm2_to.setNextBeans(p.Cnd_attr_tm3_fr);
		p.Cnd_attr_tm2_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm2_to_META);
		p.Cnd_attr_tm2_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm3_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm3_fr);
		p.Cnd_attr_tm3_fr.setNextBeans(p.Cnd_attr_tm3_to);
		p.Cnd_attr_tm3_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm3_fr_META);
		p.Cnd_attr_tm3_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm3_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm3_to);
		p.Cnd_attr_tm3_to.setNextBeans(p.Cnd_attr_tm4_fr);
		p.Cnd_attr_tm3_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm3_to_META);
		p.Cnd_attr_tm3_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm4_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm4_fr);
		p.Cnd_attr_tm4_fr.setNextBeans(p.Cnd_attr_tm4_to);
		p.Cnd_attr_tm4_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm4_fr_META);
		p.Cnd_attr_tm4_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm4_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm4_to);
		p.Cnd_attr_tm4_to.setNextBeans(p.Cnd_attr_tm5_fr);
		p.Cnd_attr_tm4_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm4_to_META);
		p.Cnd_attr_tm4_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm5_fr_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm5_fr);
		p.Cnd_attr_tm5_fr.setNextBeans(p.Cnd_attr_tm5_to);
		p.Cnd_attr_tm5_fr.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm5_fr_META);
		p.Cnd_attr_tm5_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Cnd2Panel.add(p.Cnd_attr_tm5_to_Label);
		p.Cnd2Panel.add(p.Cnd_attr_tm5_to);
		p.Cnd_attr_tm5_to.setRow(p.getCndR(), mcframe.clientPFBZ.PFBZP0020.CndR.attr_tm5_to_META);
		p.Cnd_attr_tm5_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.FilterPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Filter]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFilter(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.add(p.FilterPanel);
		p.FilterPanel.setNextBeans(p.MsgPanel);
		p.FilterPanel.setValueCheck(false);
		p.FilterPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FilterPanel.setLayoutPosition("CBCLN");
		// ブロックの項目の初期化
		p.FilterPanel.add(p.Filter_disp_warn);
		p.FilterPanel.setLastBeans(p.Filter_disp_warn);
		p.Filter_disp_warn.setNextBeans(p.Filter_disp_not_warn);
		p.Filter_disp_warn.setRow(p.getFilterR(), mcframe.clientPFBZ.PFBZP0020.FilterR.disp_warn_META);
		p.FilterPanel.add(p.Filter_disp_not_warn);
		p.Filter_disp_not_warn.setNextBeans(p.Filter_disp_start_log);
		p.Filter_disp_not_warn.setRow(p.getFilterR(), mcframe.clientPFBZ.PFBZP0020.FilterR.disp_not_warn_META);
		p.FilterPanel.add(p.Filter_div);
		p.FilterPanel.add(p.Filter_disp_start_log);
		p.Filter_disp_start_log.setNextBeans(p.Filter_disp_data_log);
		p.Filter_disp_start_log.setRow(p.getFilterR(), mcframe.clientPFBZ.PFBZP0020.FilterR.disp_start_log_META);
		p.FilterPanel.add(p.Filter_disp_data_log);
		p.Filter_disp_data_log.setNextBeans(p.Filter_disp_proc_log);
		p.Filter_disp_data_log.setRow(p.getFilterR(), mcframe.clientPFBZ.PFBZP0020.FilterR.disp_data_log_META);
		p.FilterPanel.add(p.Filter_disp_proc_log);
		p.Filter_disp_proc_log.setNextBeans(p.Filter_disp_end_log);
		p.Filter_disp_proc_log.setRow(p.getFilterR(), mcframe.clientPFBZ.PFBZP0020.FilterR.disp_proc_log_META);
		p.FilterPanel.add(p.Filter_disp_end_log);
		p.Filter_disp_end_log.setRow(p.getFilterR(), mcframe.clientPFBZ.PFBZP0020.FilterR.disp_end_log_META);
	}

	/**
	 * [Msg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMsg(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.add(p.MsgPanel);
		p.MsgPanel.setNextBeans(p.MsgAreaPanel);
		p.MsgPanel.add(p.MsgScrollPane);
		p.MsgPanel.setLastBeans(p.MsgTable);
		p.MsgScrollPane.setViewportView(p.MsgTable);
		p.MsgTable.setList(p.getMsgL());
		p.MsgPanel.setLayoutPosition("CBCLC");
		// ブロックの項目の初期化
	}

	/**
	 * [MsgArea]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMsgArea(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.add(p.MsgAreaPanel);
		p.MsgAreaPanel.setNextBeans(p.BtnPanel);
		p.MsgAreaPanel.setValueCheck(false);
		p.MsgAreaPanel.setLayoutPosition("CBCRC");
		// ブロックの項目の初期化
		p.MsgArea_msgScrollPane.getViewport().add(p.MsgArea_msg);
		p.MsgAreaPanel.add(p.MsgArea_msgScrollPane);
		p.MsgAreaPanel.setLastBeans(p.MsgArea_msg);
		p.MsgArea_msg.setRow(p.getMsgAreaR(), mcframe.clientPFBZ.PFBZP0020.MsgAreaR.msg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(PFBZP_RecvIfSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
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
		p.Btn_deselect_all.setNextBeans(p.Btn_conv);
		p.Btn_conv.setIcon("REGISTER");
		p.Btn_conv.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_conv);
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
		PFBZP_RecvIfSrch_MC.mcInitKnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitTop((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitFold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitTab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitTab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitCnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitCnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitCtrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitDtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitFilter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitMsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.mcInitBtn((PFBZP_RecvIfSrch)this);

		// [SRCH]ステータスのモードの設定
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Knd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Top((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Fold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Tab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Tab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Cnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Cnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Ctrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Dtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Filter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Msg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_MsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_Btn((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_BatchLogMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitSRCH_BatchLogKey((PFBZP_RecvIfSrch)this);

		// [UPD]ステータスのモードの設定
		PFBZP_RecvIfSrch_MC.statusInitUPD_Knd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Top((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Fold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Tab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Tab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Cnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Cnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Ctrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Dtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Filter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Msg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_MsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_Btn((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_BatchLogMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitUPD_BatchLogKey((PFBZP_RecvIfSrch)this);

		// [FIX]ステータスのモードの設定
		PFBZP_RecvIfSrch_MC.statusInitFIX_Knd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Top((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Fold((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Tab1((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Tab2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Cnd((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Cnd2((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Ctrl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Dtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Filter((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Msg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_MsgArea((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_Btn((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_BatchLogMsg((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.statusInitFIX_BatchLogKey((PFBZP_RecvIfSrch)this);

	}

	/**
	 *  [Knd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitKnd(PFBZP_RecvIfSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(PFBZP_RecvIfSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(PFBZP_RecvIfSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(PFBZP_RecvIfSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(PFBZP_RecvIfSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(PFBZP_RecvIfSrch p) {
		p.Cnd_recv_err_flg.addAllListener(p);
		p.Cnd_recv_ok_flg.addAllListener(p);
		p.Cnd_recv_conv_err_flg.addAllListener(p);
		p.Cnd_recv_conv_ok_flg.addAllListener(p);
		p.Cnd_if_proc_typ.setListListener(p);
		p.Cnd_if_proc_typ.addAllListener(p);
		p.Cnd_if_proc_typ_nm.setListListener(p);
		p.Cnd_if_proc_typ_nm.addAllListener(p);
		p.Cnd_data_no_fr.setListListener(p);
		p.Cnd_data_no_fr.addAllListener(p);
		p.Cnd_data_no_to.setListListener(p);
		p.Cnd_data_no_to.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_sdrv_tm_fr.setListListener(p);
		p.Cnd_sdrv_tm_fr.addAllListener(p);
		p.Cnd_sdrv_tm_to.setListListener(p);
		p.Cnd_sdrv_tm_to.addAllListener(p);
		p.Cnd_file_nm.setListListener(p);
		p.Cnd_file_nm.addAllListener(p);
		p.Cnd_batch_log_no.setListListener(p);
		p.Cnd_batch_log_no.addAllListener(p);
		p.Cnd_ins_srv_req_no.setListListener(p);
		p.Cnd_ins_srv_req_no.addAllListener(p);
		p.Cnd_attr_char1.setListListener(p);
		p.Cnd_attr_char1.addAllListener(p);
		p.Cnd_attr_char2.setListListener(p);
		p.Cnd_attr_char2.addAllListener(p);
		p.Cnd_attr_char3.setListListener(p);
		p.Cnd_attr_char3.addAllListener(p);
		p.Cnd_attr_char4.setListListener(p);
		p.Cnd_attr_char4.addAllListener(p);
		p.Cnd_attr_char5.setListListener(p);
		p.Cnd_attr_char5.addAllListener(p);
		p.Cnd_attr_char6.setListListener(p);
		p.Cnd_attr_char6.addAllListener(p);
		p.Cnd_attr_char7.setListListener(p);
		p.Cnd_attr_char7.addAllListener(p);
		p.Cnd_attr_char8.setListListener(p);
		p.Cnd_attr_char8.addAllListener(p);
		p.Cnd_attr_char9.setListListener(p);
		p.Cnd_attr_char9.addAllListener(p);
		p.Cnd_attr_char10.setListListener(p);
		p.Cnd_attr_char10.addAllListener(p);
		p.Cnd_attr_char11.setListListener(p);
		p.Cnd_attr_char11.addAllListener(p);
		p.Cnd_attr_char12.setListListener(p);
		p.Cnd_attr_char12.addAllListener(p);
		p.Cnd_attr_char13.setListListener(p);
		p.Cnd_attr_char13.addAllListener(p);
		p.Cnd_attr_char14.setListListener(p);
		p.Cnd_attr_char14.addAllListener(p);
		p.Cnd_attr_char15.setListListener(p);
		p.Cnd_attr_char15.addAllListener(p);
		p.Cnd_attr_char16.setListListener(p);
		p.Cnd_attr_char16.addAllListener(p);
		p.Cnd_attr_char17.setListListener(p);
		p.Cnd_attr_char17.addAllListener(p);
		p.Cnd_attr_char18.setListListener(p);
		p.Cnd_attr_char18.addAllListener(p);
		p.Cnd_attr_char19.setListListener(p);
		p.Cnd_attr_char19.addAllListener(p);
		p.Cnd_attr_char20.setListListener(p);
		p.Cnd_attr_char20.addAllListener(p);
		p.Cnd_attr_char21.setListListener(p);
		p.Cnd_attr_char21.addAllListener(p);
		p.Cnd_attr_char22.setListListener(p);
		p.Cnd_attr_char22.addAllListener(p);
		p.Cnd_attr_char23.setListListener(p);
		p.Cnd_attr_char23.addAllListener(p);
		p.Cnd_attr_char24.setListListener(p);
		p.Cnd_attr_char24.addAllListener(p);
		p.Cnd_attr_char25.setListListener(p);
		p.Cnd_attr_char25.addAllListener(p);
		p.Cnd_attr_char26.setListListener(p);
		p.Cnd_attr_char26.addAllListener(p);
		p.Cnd_attr_char27.setListListener(p);
		p.Cnd_attr_char27.addAllListener(p);
		p.Cnd_attr_char28.setListListener(p);
		p.Cnd_attr_char28.addAllListener(p);
		p.Cnd_attr_char29.setListListener(p);
		p.Cnd_attr_char29.addAllListener(p);
		p.Cnd_attr_char30.setListListener(p);
		p.Cnd_attr_char30.addAllListener(p);
		p.Cnd_attr_num1.setListListener(p);
		p.Cnd_attr_num1.addAllListener(p);
		p.Cnd_attr_num2.setListListener(p);
		p.Cnd_attr_num2.addAllListener(p);
		p.Cnd_attr_num3.setListListener(p);
		p.Cnd_attr_num3.addAllListener(p);
		p.Cnd_attr_num4.setListListener(p);
		p.Cnd_attr_num4.addAllListener(p);
		p.Cnd_attr_num5.setListListener(p);
		p.Cnd_attr_num5.addAllListener(p);
		p.Cnd_attr_dt1.setListListener(p);
		p.Cnd_attr_dt1.addAllListener(p);
		p.Cnd_attr_dt2.setListListener(p);
		p.Cnd_attr_dt2.addAllListener(p);
		p.Cnd_attr_dt3.setListListener(p);
		p.Cnd_attr_dt3.addAllListener(p);
		p.Cnd_attr_dt4.setListListener(p);
		p.Cnd_attr_dt4.addAllListener(p);
		p.Cnd_attr_dt5.setListListener(p);
		p.Cnd_attr_dt5.addAllListener(p);
		p.Cnd_attr_dt1_fr.setListListener(p);
		p.Cnd_attr_dt1_fr.addAllListener(p);
		p.Cnd_attr_dt1_to.setListListener(p);
		p.Cnd_attr_dt1_to.addAllListener(p);
		p.Cnd_attr_dt2_fr.setListListener(p);
		p.Cnd_attr_dt2_fr.addAllListener(p);
		p.Cnd_attr_dt2_to.setListListener(p);
		p.Cnd_attr_dt2_to.addAllListener(p);
		p.Cnd_attr_dt3_fr.setListListener(p);
		p.Cnd_attr_dt3_fr.addAllListener(p);
		p.Cnd_attr_dt3_to.setListListener(p);
		p.Cnd_attr_dt3_to.addAllListener(p);
		p.Cnd_attr_dt4_fr.setListListener(p);
		p.Cnd_attr_dt4_fr.addAllListener(p);
		p.Cnd_attr_dt4_to.setListListener(p);
		p.Cnd_attr_dt4_to.addAllListener(p);
		p.Cnd_attr_dt5_fr.setListListener(p);
		p.Cnd_attr_dt5_fr.addAllListener(p);
		p.Cnd_attr_dt5_to.setListListener(p);
		p.Cnd_attr_dt5_to.addAllListener(p);
		p.Cnd_attr_tm1_fr.setListListener(p);
		p.Cnd_attr_tm1_fr.addAllListener(p);
		p.Cnd_attr_tm1_to.setListListener(p);
		p.Cnd_attr_tm1_to.addAllListener(p);
		p.Cnd_attr_tm2_fr.setListListener(p);
		p.Cnd_attr_tm2_fr.addAllListener(p);
		p.Cnd_attr_tm2_to.setListListener(p);
		p.Cnd_attr_tm2_to.addAllListener(p);
		p.Cnd_attr_tm3_fr.setListListener(p);
		p.Cnd_attr_tm3_fr.addAllListener(p);
		p.Cnd_attr_tm3_to.setListListener(p);
		p.Cnd_attr_tm3_to.addAllListener(p);
		p.Cnd_attr_tm4_fr.setListListener(p);
		p.Cnd_attr_tm4_fr.addAllListener(p);
		p.Cnd_attr_tm4_to.setListListener(p);
		p.Cnd_attr_tm4_to.addAllListener(p);
		p.Cnd_attr_tm5_fr.setListListener(p);
		p.Cnd_attr_tm5_fr.addAllListener(p);
		p.Cnd_attr_tm5_to.setListListener(p);
		p.Cnd_attr_tm5_to.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(PFBZP_RecvIfSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(PFBZP_RecvIfSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(PFBZP_RecvIfSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_recv_flg.addAllListener(p);
		p.columnDtl_if_proc_typ.addAllListener(p);
		p.columnDtl_if_proc_typ.setListListener(p);
		p.columnDtl_if_proc_typ_nm.addAllListener(p);
		p.columnDtl_if_proc_typ_nm.setListListener(p);
		p.columnDtl_data_no.addAllListener(p);
		p.columnDtl_data_no.setListListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_sdrv_sts_typ.addAllListener(p);
		p.columnDtl_sdrv_sts_typ.setListListener(p);
		p.columnDtl_sdrv_sts_typ_nm.addAllListener(p);
		p.columnDtl_sdrv_sts_typ_nm.setListListener(p);
		p.columnDtl_sdrv_tm.addAllListener(p);
		p.columnDtl_sdrv_tm.setListListener(p);
		p.columnDtl_file_id.addAllListener(p);
		p.columnDtl_file_id.setListListener(p);
		p.columnDtl_file_nm.addAllListener(p);
		p.columnDtl_file_nm.setListListener(p);
		p.columnDtl_file_path.addAllListener(p);
		p.columnDtl_file_path.setListListener(p);
		p.columnDtl_conv_ope.addAllListener(p);
		p.columnDtl_conv_ope.setListListener(p);
		p.columnDtl_file_io_ope.addAllListener(p);
		p.columnDtl_file_io_ope.setListListener(p);
		p.columnDtl_web_api_ope.addAllListener(p);
		p.columnDtl_web_api_ope.setListListener(p);
		p.columnDtl_sdrv_clt_id.addAllListener(p);
		p.columnDtl_sdrv_clt_id.setListListener(p);
		p.columnDtl_sdrv_usr_id.addAllListener(p);
		p.columnDtl_sdrv_usr_id.setListListener(p);
		p.columnDtl_sdrv_usr_nm.addAllListener(p);
		p.columnDtl_sdrv_usr_nm.setListListener(p);
		p.columnDtl_attr_char1.addAllListener(p);
		p.columnDtl_attr_char1.setListListener(p);
		p.columnDtl_attr_char2.addAllListener(p);
		p.columnDtl_attr_char2.setListListener(p);
		p.columnDtl_attr_char3.addAllListener(p);
		p.columnDtl_attr_char3.setListListener(p);
		p.columnDtl_attr_char4.addAllListener(p);
		p.columnDtl_attr_char4.setListListener(p);
		p.columnDtl_attr_char5.addAllListener(p);
		p.columnDtl_attr_char5.setListListener(p);
		p.columnDtl_attr_char6.addAllListener(p);
		p.columnDtl_attr_char6.setListListener(p);
		p.columnDtl_attr_char7.addAllListener(p);
		p.columnDtl_attr_char7.setListListener(p);
		p.columnDtl_attr_char8.addAllListener(p);
		p.columnDtl_attr_char8.setListListener(p);
		p.columnDtl_attr_char9.addAllListener(p);
		p.columnDtl_attr_char9.setListListener(p);
		p.columnDtl_attr_char10.addAllListener(p);
		p.columnDtl_attr_char10.setListListener(p);
		p.columnDtl_attr_char11.addAllListener(p);
		p.columnDtl_attr_char11.setListListener(p);
		p.columnDtl_attr_char12.addAllListener(p);
		p.columnDtl_attr_char12.setListListener(p);
		p.columnDtl_attr_char13.addAllListener(p);
		p.columnDtl_attr_char13.setListListener(p);
		p.columnDtl_attr_char14.addAllListener(p);
		p.columnDtl_attr_char14.setListListener(p);
		p.columnDtl_attr_char15.addAllListener(p);
		p.columnDtl_attr_char15.setListListener(p);
		p.columnDtl_attr_char16.addAllListener(p);
		p.columnDtl_attr_char16.setListListener(p);
		p.columnDtl_attr_char17.addAllListener(p);
		p.columnDtl_attr_char17.setListListener(p);
		p.columnDtl_attr_char18.addAllListener(p);
		p.columnDtl_attr_char18.setListListener(p);
		p.columnDtl_attr_char19.addAllListener(p);
		p.columnDtl_attr_char19.setListListener(p);
		p.columnDtl_attr_char20.addAllListener(p);
		p.columnDtl_attr_char20.setListListener(p);
		p.columnDtl_attr_char21.addAllListener(p);
		p.columnDtl_attr_char21.setListListener(p);
		p.columnDtl_attr_char22.addAllListener(p);
		p.columnDtl_attr_char22.setListListener(p);
		p.columnDtl_attr_char23.addAllListener(p);
		p.columnDtl_attr_char23.setListListener(p);
		p.columnDtl_attr_char24.addAllListener(p);
		p.columnDtl_attr_char24.setListListener(p);
		p.columnDtl_attr_char25.addAllListener(p);
		p.columnDtl_attr_char25.setListListener(p);
		p.columnDtl_attr_char26.addAllListener(p);
		p.columnDtl_attr_char26.setListListener(p);
		p.columnDtl_attr_char27.addAllListener(p);
		p.columnDtl_attr_char27.setListListener(p);
		p.columnDtl_attr_char28.addAllListener(p);
		p.columnDtl_attr_char28.setListListener(p);
		p.columnDtl_attr_char29.addAllListener(p);
		p.columnDtl_attr_char29.setListListener(p);
		p.columnDtl_attr_char30.addAllListener(p);
		p.columnDtl_attr_char30.setListListener(p);
		p.columnDtl_attr_num1.addAllListener(p);
		p.columnDtl_attr_num1.setListListener(p);
		p.columnDtl_attr_num2.addAllListener(p);
		p.columnDtl_attr_num2.setListListener(p);
		p.columnDtl_attr_num3.addAllListener(p);
		p.columnDtl_attr_num3.setListListener(p);
		p.columnDtl_attr_num4.addAllListener(p);
		p.columnDtl_attr_num4.setListListener(p);
		p.columnDtl_attr_num5.addAllListener(p);
		p.columnDtl_attr_num5.setListListener(p);
		p.columnDtl_attr_dt1.addAllListener(p);
		p.columnDtl_attr_dt1.setListListener(p);
		p.columnDtl_attr_dt2.addAllListener(p);
		p.columnDtl_attr_dt2.setListListener(p);
		p.columnDtl_attr_dt3.addAllListener(p);
		p.columnDtl_attr_dt3.setListListener(p);
		p.columnDtl_attr_dt4.addAllListener(p);
		p.columnDtl_attr_dt4.setListListener(p);
		p.columnDtl_attr_dt5.addAllListener(p);
		p.columnDtl_attr_dt5.setListListener(p);
		p.columnDtl_attr_tm1.addAllListener(p);
		p.columnDtl_attr_tm1.setListListener(p);
		p.columnDtl_attr_tm2.addAllListener(p);
		p.columnDtl_attr_tm2.setListListener(p);
		p.columnDtl_attr_tm3.addAllListener(p);
		p.columnDtl_attr_tm3.setListListener(p);
		p.columnDtl_attr_tm4.addAllListener(p);
		p.columnDtl_attr_tm4.setListListener(p);
		p.columnDtl_attr_tm5.addAllListener(p);
		p.columnDtl_attr_tm5.setListListener(p);
		p.columnDtl_batch_log_no.addAllListener(p);
		p.columnDtl_batch_log_no.setListListener(p);
		p.columnDtl_log_sub_key1.addAllListener(p);
		p.columnDtl_log_sub_key1.setListListener(p);
		p.columnDtl_log_sub_key2.addAllListener(p);
		p.columnDtl_log_sub_key2.setListListener(p);
	}

	/**
	 *  [Filter]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFilter(PFBZP_RecvIfSrch p) {
		p.Filter_disp_warn.addAllListener(p);
		p.Filter_disp_not_warn.addAllListener(p);
		p.Filter_disp_start_log.addAllListener(p);
		p.Filter_disp_data_log.addAllListener(p);
		p.Filter_disp_proc_log.addAllListener(p);
		p.Filter_disp_end_log.addAllListener(p);
	}

	/**
	 *  [Msg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMsg(PFBZP_RecvIfSrch p) {
		p.MsgTable.addAllListener(p);
		p.columnMsg_batch_log_typ.addAllListener(p);
		p.columnMsg_batch_log_typ.setListListener(p);
		p.columnMsg_batch_log_typ_nm.addAllListener(p);
		p.columnMsg_batch_log_typ_nm.setListListener(p);
		p.columnMsg_msg_id.addAllListener(p);
		p.columnMsg_msg_id.setListListener(p);
		p.columnMsg_msg_txt.addAllListener(p);
		p.columnMsg_msg_txt.setListListener(p);
		p.columnMsg_msg_lvl.addAllListener(p);
		p.columnMsg_msg_lvl.setListListener(p);
		p.columnMsg_log_ts.addAllListener(p);
		p.columnMsg_log_ts.setListListener(p);
		p.columnMsg_seq.addAllListener(p);
		p.columnMsg_seq.setListListener(p);
		p.columnMsg_batch_log_no.addAllListener(p);
		p.columnMsg_batch_log_no.setListListener(p);
		p.columnMsg_log_sub_key1.addAllListener(p);
		p.columnMsg_log_sub_key1.setListListener(p);
		p.columnMsg_log_sub_key2.addAllListener(p);
		p.columnMsg_log_sub_key2.setListListener(p);
	}

	/**
	 *  [MsgArea]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMsgArea(PFBZP_RecvIfSrch p) {
		p.MsgArea_msg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(PFBZP_RecvIfSrch p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_conv.addAllListener(p);
		p.Btn_conv.setAPMethodName("doBtn_conv");
	}

	/**
	 * [SRCH]ステータスの[Knd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Knd(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(PFBZP_RecvIfSrch p){
		p.Cnd_recv_err_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_recv_ok_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_recv_conv_err_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_recv_conv_ok_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_if_proc_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_data_no_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_data_no_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sdrv_tm_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sdrv_tm_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_file_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_batch_log_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char11.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char12.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char13.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char14.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char15.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char16.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char17.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char18.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char19.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char20.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char21.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char22.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char23.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char24.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char25.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char26.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char27.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char28.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char29.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_char30.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_num1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_num2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_num3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_num4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_num5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_attr_dt2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_attr_dt3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_attr_dt4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_attr_dt5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_attr_dt1_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt1_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt2_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt2_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt3_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt3_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt4_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt4_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt5_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_dt5_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm1_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm1_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm2_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm2_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm3_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm3_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm4_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm4_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm5_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_attr_tm5_to.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(PFBZP_RecvIfSrch p){
		p.columnDtl_recv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sdrv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sdrv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sdrv_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_file_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_file_path.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_conv_ope.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_file_io_ope.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_web_api_ope.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sdrv_clt_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sdrv_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sdrv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char21.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char22.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char23.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char24.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char25.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char26.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char27.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char28.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char29.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_char30.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_num2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_num3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_num4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_num5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_dt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_dt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_tm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_tm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_tm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_tm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_attr_tm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_log_sub_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_log_sub_key2.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Filter]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Filter(PFBZP_RecvIfSrch p){
		p.Filter_disp_warn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Filter_disp_not_warn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Filter_div.putMode(p, SRCH, MCMode.REQUIRED);
		p.Filter_disp_start_log.putMode(p, SRCH, MCMode.REQUIRED);
		p.Filter_disp_data_log.putMode(p, SRCH, MCMode.REQUIRED);
		p.Filter_disp_proc_log.putMode(p, SRCH, MCMode.REQUIRED);
		p.Filter_disp_end_log.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Msg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Msg(PFBZP_RecvIfSrch p){
		p.columnMsg_batch_log_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_batch_log_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_msg_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_msg_txt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_msg_lvl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_log_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_batch_log_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_log_sub_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnMsg_log_sub_key2.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[MsgArea]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MsgArea(PFBZP_RecvIfSrch p){
		p.MsgArea_msg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(PFBZP_RecvIfSrch p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_conv.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[BatchLogMsg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BatchLogMsg(PFBZP_RecvIfSrch p){

	}

	/**
	 * [SRCH]ステータスの[BatchLogKey]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BatchLogKey(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Knd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Knd(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(PFBZP_RecvIfSrch p){
		p.Cnd_recv_err_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_recv_ok_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_recv_conv_err_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_recv_conv_ok_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_if_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_data_no_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_data_no_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sdrv_tm_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sdrv_tm_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_file_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_batch_log_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char11.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char12.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char13.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char14.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char15.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char16.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char17.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char18.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char19.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char20.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char21.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char22.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char23.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char24.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char25.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char26.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char27.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char28.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char29.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_char30.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_num1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_num2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_num3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_num4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_num5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt1.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_attr_dt2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_attr_dt3.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_attr_dt4.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_attr_dt5.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_attr_dt1_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt1_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt2_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt2_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt3_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt3_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt4_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt4_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt5_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_dt5_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm1_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm1_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm2_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm2_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm3_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm3_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm4_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm4_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm5_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_attr_tm5_to.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(PFBZP_RecvIfSrch p){
		p.columnDtl_recv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_if_proc_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_data_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sdrv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sdrv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sdrv_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_file_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_file_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_file_path.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_conv_ope.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_file_io_ope.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_web_api_ope.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sdrv_clt_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sdrv_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sdrv_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char11.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char12.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char13.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char14.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char15.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char16.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char17.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char18.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char19.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char20.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char21.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char22.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char23.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char24.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char25.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char26.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char27.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char28.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char29.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_char30.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_num1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_num2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_num3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_num4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_num5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_dt1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_dt2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_dt3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_dt4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_dt5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_tm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_tm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_tm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_tm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attr_tm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_log_sub_key1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_log_sub_key2.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Filter]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Filter(PFBZP_RecvIfSrch p){
		p.Filter_disp_warn.putMode(p, UPD, MCMode.REQUIRED);
		p.Filter_disp_not_warn.putMode(p, UPD, MCMode.REQUIRED);
		p.Filter_div.putMode(p, UPD, MCMode.REQUIRED);
		p.Filter_disp_start_log.putMode(p, UPD, MCMode.REQUIRED);
		p.Filter_disp_data_log.putMode(p, UPD, MCMode.REQUIRED);
		p.Filter_disp_proc_log.putMode(p, UPD, MCMode.REQUIRED);
		p.Filter_disp_end_log.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Msg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Msg(PFBZP_RecvIfSrch p){
		p.columnMsg_batch_log_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_batch_log_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_msg_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_msg_txt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_msg_lvl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_log_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_batch_log_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_log_sub_key1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnMsg_log_sub_key2.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[MsgArea]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MsgArea(PFBZP_RecvIfSrch p){
		p.MsgArea_msg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(PFBZP_RecvIfSrch p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_conv.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BatchLogMsg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BatchLogMsg(PFBZP_RecvIfSrch p){

	}

	/**
	 * [UPD]ステータスの[BatchLogKey]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BatchLogKey(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Knd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Knd(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(PFBZP_RecvIfSrch p){
		p.Cnd_recv_err_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_recv_ok_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_recv_conv_err_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_recv_conv_ok_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_if_proc_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_data_no_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_data_no_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sdrv_tm_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sdrv_tm_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_file_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_batch_log_no.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ins_srv_req_no.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char11.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char12.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char13.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char14.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char15.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char16.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char17.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char18.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char19.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char20.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char21.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char22.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char23.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char24.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char25.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char26.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char27.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char28.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char29.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_char30.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_num1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_num2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_num3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_num4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_num5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt1.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_attr_dt2.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_attr_dt3.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_attr_dt4.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_attr_dt5.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_attr_dt1_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt1_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt2_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt2_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt3_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt3_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt4_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt4_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt5_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_dt5_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm1_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm1_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm2_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm2_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm3_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm3_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm4_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm4_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm5_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_attr_tm5_to.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd2(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(PFBZP_RecvIfSrch p){
		p.columnDtl_recv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_data_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sdrv_sts_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sdrv_sts_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sdrv_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_file_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_file_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_file_path.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_conv_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_file_io_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_web_api_ope.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sdrv_clt_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sdrv_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sdrv_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char21.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char22.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char23.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char24.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char25.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char26.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char27.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char28.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char29.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_char30.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_num1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_num2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_num3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_num4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_num5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_dt1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_dt2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_dt3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_dt4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_dt5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_tm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_tm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_tm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_tm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_attr_tm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_batch_log_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_log_sub_key1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_log_sub_key2.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Filter]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Filter(PFBZP_RecvIfSrch p){
		p.Filter_disp_warn.putMode(p, FIX, MCMode.REQUIRED);
		p.Filter_disp_not_warn.putMode(p, FIX, MCMode.REQUIRED);
		p.Filter_div.putMode(p, FIX, MCMode.REQUIRED);
		p.Filter_disp_start_log.putMode(p, FIX, MCMode.REQUIRED);
		p.Filter_disp_data_log.putMode(p, FIX, MCMode.REQUIRED);
		p.Filter_disp_proc_log.putMode(p, FIX, MCMode.REQUIRED);
		p.Filter_disp_end_log.putMode(p, FIX, MCMode.REQUIRED);

	}

	/**
	 * [FIX]ステータスの[Msg]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Msg(PFBZP_RecvIfSrch p){
		p.columnMsg_batch_log_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_batch_log_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_msg_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_msg_txt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_msg_lvl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_log_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_batch_log_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_log_sub_key1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnMsg_log_sub_key2.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[MsgArea]ブロックのモードの設定
	 */
	protected static void statusInitFIX_MsgArea(PFBZP_RecvIfSrch p){
		p.MsgArea_msg.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(PFBZP_RecvIfSrch p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_conv.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[BatchLogMsg]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BatchLogMsg(PFBZP_RecvIfSrch p){

	}

	/**
	 * [FIX]ステータスの[BatchLogKey]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BatchLogKey(PFBZP_RecvIfSrch p){

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
		PFBZP_RecvIfSrch_MC.setTableConfigDtl((PFBZP_RecvIfSrch)this);
		PFBZP_RecvIfSrch_MC.setTableConfigMsg((PFBZP_RecvIfSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(PFBZP_RecvIfSrch p) {
		p.columnDtl_recv_flg.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.recv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_recv_flg);
		p.columnDtl_if_proc_typ.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.if_proc_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_if_proc_typ);
		p.columnDtl_if_proc_typ_nm.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.if_proc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_if_proc_typ_nm);
		p.columnDtl_data_no.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.data_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_data_no);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_sdrv_sts_typ.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.sdrv_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sdrv_sts_typ);
		p.columnDtl_sdrv_sts_typ_nm.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.sdrv_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sdrv_sts_typ_nm);
		p.columnDtl_sdrv_tm.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.sdrv_tm_META);
		p.columnDtl_sdrv_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_sdrv_tm);
		p.columnDtl_file_id.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.file_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_file_id);
		p.columnDtl_file_nm.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.file_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_file_nm);
		p.columnDtl_file_path.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.file_path_META);
		p.DtlTable.addColumnConfig(p.columnDtl_file_path);
		p.columnDtl_conv_ope.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.conv_ope_META);
		p.DtlTable.addColumnConfig(p.columnDtl_conv_ope);
		p.columnDtl_file_io_ope.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.file_io_ope_META);
		p.DtlTable.addColumnConfig(p.columnDtl_file_io_ope);
		p.columnDtl_web_api_ope.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.web_api_ope_META);
		p.DtlTable.addColumnConfig(p.columnDtl_web_api_ope);
		p.columnDtl_sdrv_clt_id.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.sdrv_clt_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sdrv_clt_id);
		p.columnDtl_sdrv_usr_id.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.sdrv_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sdrv_usr_id);
		p.columnDtl_sdrv_usr_nm.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.sdrv_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sdrv_usr_nm);
		p.columnDtl_attr_char1.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char1);
		p.columnDtl_attr_char2.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char2);
		p.columnDtl_attr_char3.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char3);
		p.columnDtl_attr_char4.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char4);
		p.columnDtl_attr_char5.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char5);
		p.columnDtl_attr_char6.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char6);
		p.columnDtl_attr_char7.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char7);
		p.columnDtl_attr_char8.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char8);
		p.columnDtl_attr_char9.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char9);
		p.columnDtl_attr_char10.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char10);
		p.columnDtl_attr_char11.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char11_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char11);
		p.columnDtl_attr_char12.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char12_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char12);
		p.columnDtl_attr_char13.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char13_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char13);
		p.columnDtl_attr_char14.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char14_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char14);
		p.columnDtl_attr_char15.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char15_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char15);
		p.columnDtl_attr_char16.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char16_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char16);
		p.columnDtl_attr_char17.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char17_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char17);
		p.columnDtl_attr_char18.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char18_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char18);
		p.columnDtl_attr_char19.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char19_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char19);
		p.columnDtl_attr_char20.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char20_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char20);
		p.columnDtl_attr_char21.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char21_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char21);
		p.columnDtl_attr_char22.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char22_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char22);
		p.columnDtl_attr_char23.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char23_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char23);
		p.columnDtl_attr_char24.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char24_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char24);
		p.columnDtl_attr_char25.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char25_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char25);
		p.columnDtl_attr_char26.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char26_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char26);
		p.columnDtl_attr_char27.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char27_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char27);
		p.columnDtl_attr_char28.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char28_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char28);
		p.columnDtl_attr_char29.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char29_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char29);
		p.columnDtl_attr_char30.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_char30_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_char30);
		p.columnDtl_attr_num1.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_num1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_num1);
		p.columnDtl_attr_num2.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_num2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_num2);
		p.columnDtl_attr_num3.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_num3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_num3);
		p.columnDtl_attr_num4.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_num4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_num4);
		p.columnDtl_attr_num5.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_num5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_num5);
		p.columnDtl_attr_dt1.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_dt1_META);
		p.columnDtl_attr_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_dt1);
		p.columnDtl_attr_dt2.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_dt2_META);
		p.columnDtl_attr_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_dt2);
		p.columnDtl_attr_dt3.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_dt3_META);
		p.columnDtl_attr_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_dt3);
		p.columnDtl_attr_dt4.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_dt4_META);
		p.columnDtl_attr_dt4.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_dt4);
		p.columnDtl_attr_dt5.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_dt5_META);
		p.columnDtl_attr_dt5.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_dt5);
		p.columnDtl_attr_tm1.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_tm1_META);
		p.columnDtl_attr_tm1.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_tm1);
		p.columnDtl_attr_tm2.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_tm2_META);
		p.columnDtl_attr_tm2.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_tm2);
		p.columnDtl_attr_tm3.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_tm3_META);
		p.columnDtl_attr_tm3.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_tm3);
		p.columnDtl_attr_tm4.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_tm4_META);
		p.columnDtl_attr_tm4.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_tm4);
		p.columnDtl_attr_tm5.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.attr_tm5_META);
		p.columnDtl_attr_tm5.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_attr_tm5);
		p.columnDtl_batch_log_no.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.batch_log_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_batch_log_no);
		p.columnDtl_log_sub_key1.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.log_sub_key1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_log_sub_key1);
		p.columnDtl_log_sub_key2.setMeta(mcframe.clientPFBZ.PFBZP0020.DtlR.log_sub_key2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_log_sub_key2);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_recv_flg);
	}

	/**
	 * [Msg]ブロックのTableの設定
	 */
	protected static void setTableConfigMsg(PFBZP_RecvIfSrch p) {
		p.columnMsg_batch_log_typ.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.batch_log_typ_META);
		p.MsgTable.addColumnConfig(p.columnMsg_batch_log_typ);
		p.columnMsg_batch_log_typ_nm.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.batch_log_typ_nm_META);
		p.MsgTable.addColumnConfig(p.columnMsg_batch_log_typ_nm);
		p.columnMsg_msg_id.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.msg_id_META);
		p.MsgTable.addColumnConfig(p.columnMsg_msg_id);
		p.columnMsg_msg_txt.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.msg_txt_META);
		p.MsgTable.addColumnConfig(p.columnMsg_msg_txt);
		p.columnMsg_msg_lvl.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.msg_lvl_META);
		p.MsgTable.addColumnConfig(p.columnMsg_msg_lvl);
		p.columnMsg_log_ts.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.log_ts_META);
		p.columnMsg_log_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.MsgTable.addColumnConfig(p.columnMsg_log_ts);
		p.columnMsg_seq.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.seq_META);
		p.MsgTable.addColumnConfig(p.columnMsg_seq);
		p.columnMsg_batch_log_no.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.batch_log_no_META);
		p.MsgTable.addColumnConfig(p.columnMsg_batch_log_no);
		p.columnMsg_log_sub_key1.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.log_sub_key1_META);
		p.MsgTable.addColumnConfig(p.columnMsg_log_sub_key1);
		p.columnMsg_log_sub_key2.setMeta(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.log_sub_key2_META);
		p.MsgTable.addColumnConfig(p.columnMsg_log_sub_key2);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_if_proc_typ.getListConfig().setPutter(getCnd_if_proc_typ_ListPutter());
		Cnd_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ext_sys_cd.getListConfig().setPutter(getCnd_ext_sys_cd_ListPutter());
		columnMsg_batch_log_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnMsg_batch_log_typ.getListConfig().setPutter(getMsg_batch_log_typ_ListPutter());
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
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Cnd_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
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
	 * [Msg_batch_log_typ_ListPutter]の作成
	 */
	protected MCListPutter createMsg_batch_log_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_if_proc_typ) return getCnd_if_proc_typ(row, info);
		if(combo == Cnd_ext_sys_cd) return getCnd_ext_sys_cd(row, info);
		if(combo == columnMsg_batch_log_typ) return getMsg_batch_log_typ(row, info);
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
		else if (ap == Btn_conv) doBtn_conv(info);
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
	 * [Btn]パネルの[conv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_conv(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == MsgTable) return doMsg_VC(info);
		if (vc == Cnd_recv_err_flg) return doCnd_recv_err_flg_VC(info);
		if (vc == Cnd_recv_ok_flg) return doCnd_recv_ok_flg_VC(info);
		if (vc == Cnd_recv_conv_err_flg) return doCnd_recv_conv_err_flg_VC(info);
		if (vc == Cnd_recv_conv_ok_flg) return doCnd_recv_conv_ok_flg_VC(info);
		if (vc == Cnd_if_proc_typ) return doCnd_if_proc_typ_VC(info);
		if (vc == Cnd_if_proc_typ_nm) return doCnd_if_proc_typ_nm_VC(info);
		if (vc == Cnd_data_no_fr) return doCnd_data_no_fr_VC(info);
		if (vc == Cnd_data_no_to) return doCnd_data_no_to_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_sdrv_tm_fr) return doCnd_sdrv_tm_fr_VC(info);
		if (vc == Cnd_sdrv_tm_to) return doCnd_sdrv_tm_to_VC(info);
		if (vc == Cnd_file_nm) return doCnd_file_nm_VC(info);
		if (vc == Cnd_batch_log_no) return doCnd_batch_log_no_VC(info);
		if (vc == Cnd_ins_srv_req_no) return doCnd_ins_srv_req_no_VC(info);
		if (vc == Cnd_attr_char1) return doCnd_attr_char1_VC(info);
		if (vc == Cnd_attr_char2) return doCnd_attr_char2_VC(info);
		if (vc == Cnd_attr_char3) return doCnd_attr_char3_VC(info);
		if (vc == Cnd_attr_char4) return doCnd_attr_char4_VC(info);
		if (vc == Cnd_attr_char5) return doCnd_attr_char5_VC(info);
		if (vc == Cnd_attr_char6) return doCnd_attr_char6_VC(info);
		if (vc == Cnd_attr_char7) return doCnd_attr_char7_VC(info);
		if (vc == Cnd_attr_char8) return doCnd_attr_char8_VC(info);
		if (vc == Cnd_attr_char9) return doCnd_attr_char9_VC(info);
		if (vc == Cnd_attr_char10) return doCnd_attr_char10_VC(info);
		if (vc == Cnd_attr_char11) return doCnd_attr_char11_VC(info);
		if (vc == Cnd_attr_char12) return doCnd_attr_char12_VC(info);
		if (vc == Cnd_attr_char13) return doCnd_attr_char13_VC(info);
		if (vc == Cnd_attr_char14) return doCnd_attr_char14_VC(info);
		if (vc == Cnd_attr_char15) return doCnd_attr_char15_VC(info);
		if (vc == Cnd_attr_char16) return doCnd_attr_char16_VC(info);
		if (vc == Cnd_attr_char17) return doCnd_attr_char17_VC(info);
		if (vc == Cnd_attr_char18) return doCnd_attr_char18_VC(info);
		if (vc == Cnd_attr_char19) return doCnd_attr_char19_VC(info);
		if (vc == Cnd_attr_char20) return doCnd_attr_char20_VC(info);
		if (vc == Cnd_attr_char21) return doCnd_attr_char21_VC(info);
		if (vc == Cnd_attr_char22) return doCnd_attr_char22_VC(info);
		if (vc == Cnd_attr_char23) return doCnd_attr_char23_VC(info);
		if (vc == Cnd_attr_char24) return doCnd_attr_char24_VC(info);
		if (vc == Cnd_attr_char25) return doCnd_attr_char25_VC(info);
		if (vc == Cnd_attr_char26) return doCnd_attr_char26_VC(info);
		if (vc == Cnd_attr_char27) return doCnd_attr_char27_VC(info);
		if (vc == Cnd_attr_char28) return doCnd_attr_char28_VC(info);
		if (vc == Cnd_attr_char29) return doCnd_attr_char29_VC(info);
		if (vc == Cnd_attr_char30) return doCnd_attr_char30_VC(info);
		if (vc == Cnd_attr_num1) return doCnd_attr_num1_VC(info);
		if (vc == Cnd_attr_num2) return doCnd_attr_num2_VC(info);
		if (vc == Cnd_attr_num3) return doCnd_attr_num3_VC(info);
		if (vc == Cnd_attr_num4) return doCnd_attr_num4_VC(info);
		if (vc == Cnd_attr_num5) return doCnd_attr_num5_VC(info);
		if (vc == Cnd_attr_dt1) return doCnd_attr_dt1_VC(info);
		if (vc == Cnd_attr_dt2) return doCnd_attr_dt2_VC(info);
		if (vc == Cnd_attr_dt3) return doCnd_attr_dt3_VC(info);
		if (vc == Cnd_attr_dt4) return doCnd_attr_dt4_VC(info);
		if (vc == Cnd_attr_dt5) return doCnd_attr_dt5_VC(info);
		if (vc == Cnd_attr_dt1_fr) return doCnd_attr_dt1_fr_VC(info);
		if (vc == Cnd_attr_dt1_to) return doCnd_attr_dt1_to_VC(info);
		if (vc == Cnd_attr_dt2_fr) return doCnd_attr_dt2_fr_VC(info);
		if (vc == Cnd_attr_dt2_to) return doCnd_attr_dt2_to_VC(info);
		if (vc == Cnd_attr_dt3_fr) return doCnd_attr_dt3_fr_VC(info);
		if (vc == Cnd_attr_dt3_to) return doCnd_attr_dt3_to_VC(info);
		if (vc == Cnd_attr_dt4_fr) return doCnd_attr_dt4_fr_VC(info);
		if (vc == Cnd_attr_dt4_to) return doCnd_attr_dt4_to_VC(info);
		if (vc == Cnd_attr_dt5_fr) return doCnd_attr_dt5_fr_VC(info);
		if (vc == Cnd_attr_dt5_to) return doCnd_attr_dt5_to_VC(info);
		if (vc == Cnd_attr_tm1_fr) return doCnd_attr_tm1_fr_VC(info);
		if (vc == Cnd_attr_tm1_to) return doCnd_attr_tm1_to_VC(info);
		if (vc == Cnd_attr_tm2_fr) return doCnd_attr_tm2_fr_VC(info);
		if (vc == Cnd_attr_tm2_to) return doCnd_attr_tm2_to_VC(info);
		if (vc == Cnd_attr_tm3_fr) return doCnd_attr_tm3_fr_VC(info);
		if (vc == Cnd_attr_tm3_to) return doCnd_attr_tm3_to_VC(info);
		if (vc == Cnd_attr_tm4_fr) return doCnd_attr_tm4_fr_VC(info);
		if (vc == Cnd_attr_tm4_to) return doCnd_attr_tm4_to_VC(info);
		if (vc == Cnd_attr_tm5_fr) return doCnd_attr_tm5_fr_VC(info);
		if (vc == Cnd_attr_tm5_to) return doCnd_attr_tm5_to_VC(info);
		if (vc == columnDtl_recv_flg) return doDtl_recv_flg_VC(info);
		if (vc == columnDtl_if_proc_typ) return doDtl_if_proc_typ_VC(info);
		if (vc == columnDtl_if_proc_typ_nm) return doDtl_if_proc_typ_nm_VC(info);
		if (vc == columnDtl_data_no) return doDtl_data_no_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_sdrv_sts_typ) return doDtl_sdrv_sts_typ_VC(info);
		if (vc == columnDtl_sdrv_sts_typ_nm) return doDtl_sdrv_sts_typ_nm_VC(info);
		if (vc == columnDtl_sdrv_tm) return doDtl_sdrv_tm_VC(info);
		if (vc == columnDtl_file_id) return doDtl_file_id_VC(info);
		if (vc == columnDtl_file_nm) return doDtl_file_nm_VC(info);
		if (vc == columnDtl_file_path) return doDtl_file_path_VC(info);
		if (vc == columnDtl_conv_ope) return doDtl_conv_ope_VC(info);
		if (vc == columnDtl_file_io_ope) return doDtl_file_io_ope_VC(info);
		if (vc == columnDtl_web_api_ope) return doDtl_web_api_ope_VC(info);
		if (vc == columnDtl_sdrv_clt_id) return doDtl_sdrv_clt_id_VC(info);
		if (vc == columnDtl_sdrv_usr_id) return doDtl_sdrv_usr_id_VC(info);
		if (vc == columnDtl_sdrv_usr_nm) return doDtl_sdrv_usr_nm_VC(info);
		if (vc == columnDtl_attr_char1) return doDtl_attr_char1_VC(info);
		if (vc == columnDtl_attr_char2) return doDtl_attr_char2_VC(info);
		if (vc == columnDtl_attr_char3) return doDtl_attr_char3_VC(info);
		if (vc == columnDtl_attr_char4) return doDtl_attr_char4_VC(info);
		if (vc == columnDtl_attr_char5) return doDtl_attr_char5_VC(info);
		if (vc == columnDtl_attr_char6) return doDtl_attr_char6_VC(info);
		if (vc == columnDtl_attr_char7) return doDtl_attr_char7_VC(info);
		if (vc == columnDtl_attr_char8) return doDtl_attr_char8_VC(info);
		if (vc == columnDtl_attr_char9) return doDtl_attr_char9_VC(info);
		if (vc == columnDtl_attr_char10) return doDtl_attr_char10_VC(info);
		if (vc == columnDtl_attr_char11) return doDtl_attr_char11_VC(info);
		if (vc == columnDtl_attr_char12) return doDtl_attr_char12_VC(info);
		if (vc == columnDtl_attr_char13) return doDtl_attr_char13_VC(info);
		if (vc == columnDtl_attr_char14) return doDtl_attr_char14_VC(info);
		if (vc == columnDtl_attr_char15) return doDtl_attr_char15_VC(info);
		if (vc == columnDtl_attr_char16) return doDtl_attr_char16_VC(info);
		if (vc == columnDtl_attr_char17) return doDtl_attr_char17_VC(info);
		if (vc == columnDtl_attr_char18) return doDtl_attr_char18_VC(info);
		if (vc == columnDtl_attr_char19) return doDtl_attr_char19_VC(info);
		if (vc == columnDtl_attr_char20) return doDtl_attr_char20_VC(info);
		if (vc == columnDtl_attr_char21) return doDtl_attr_char21_VC(info);
		if (vc == columnDtl_attr_char22) return doDtl_attr_char22_VC(info);
		if (vc == columnDtl_attr_char23) return doDtl_attr_char23_VC(info);
		if (vc == columnDtl_attr_char24) return doDtl_attr_char24_VC(info);
		if (vc == columnDtl_attr_char25) return doDtl_attr_char25_VC(info);
		if (vc == columnDtl_attr_char26) return doDtl_attr_char26_VC(info);
		if (vc == columnDtl_attr_char27) return doDtl_attr_char27_VC(info);
		if (vc == columnDtl_attr_char28) return doDtl_attr_char28_VC(info);
		if (vc == columnDtl_attr_char29) return doDtl_attr_char29_VC(info);
		if (vc == columnDtl_attr_char30) return doDtl_attr_char30_VC(info);
		if (vc == columnDtl_attr_num1) return doDtl_attr_num1_VC(info);
		if (vc == columnDtl_attr_num2) return doDtl_attr_num2_VC(info);
		if (vc == columnDtl_attr_num3) return doDtl_attr_num3_VC(info);
		if (vc == columnDtl_attr_num4) return doDtl_attr_num4_VC(info);
		if (vc == columnDtl_attr_num5) return doDtl_attr_num5_VC(info);
		if (vc == columnDtl_attr_dt1) return doDtl_attr_dt1_VC(info);
		if (vc == columnDtl_attr_dt2) return doDtl_attr_dt2_VC(info);
		if (vc == columnDtl_attr_dt3) return doDtl_attr_dt3_VC(info);
		if (vc == columnDtl_attr_dt4) return doDtl_attr_dt4_VC(info);
		if (vc == columnDtl_attr_dt5) return doDtl_attr_dt5_VC(info);
		if (vc == columnDtl_attr_tm1) return doDtl_attr_tm1_VC(info);
		if (vc == columnDtl_attr_tm2) return doDtl_attr_tm2_VC(info);
		if (vc == columnDtl_attr_tm3) return doDtl_attr_tm3_VC(info);
		if (vc == columnDtl_attr_tm4) return doDtl_attr_tm4_VC(info);
		if (vc == columnDtl_attr_tm5) return doDtl_attr_tm5_VC(info);
		if (vc == columnDtl_batch_log_no) return doDtl_batch_log_no_VC(info);
		if (vc == columnDtl_log_sub_key1) return doDtl_log_sub_key1_VC(info);
		if (vc == columnDtl_log_sub_key2) return doDtl_log_sub_key2_VC(info);
		if (vc == Filter_disp_warn) return doFilter_disp_warn_VC(info);
		if (vc == Filter_disp_not_warn) return doFilter_disp_not_warn_VC(info);
		if (vc == Filter_disp_start_log) return doFilter_disp_start_log_VC(info);
		if (vc == Filter_disp_data_log) return doFilter_disp_data_log_VC(info);
		if (vc == Filter_disp_proc_log) return doFilter_disp_proc_log_VC(info);
		if (vc == Filter_disp_end_log) return doFilter_disp_end_log_VC(info);
		if (vc == columnMsg_batch_log_typ) return doMsg_batch_log_typ_VC(info);
		if (vc == columnMsg_batch_log_typ_nm) return doMsg_batch_log_typ_nm_VC(info);
		if (vc == columnMsg_msg_id) return doMsg_msg_id_VC(info);
		if (vc == columnMsg_msg_txt) return doMsg_msg_txt_VC(info);
		if (vc == columnMsg_msg_lvl) return doMsg_msg_lvl_VC(info);
		if (vc == columnMsg_log_ts) return doMsg_log_ts_VC(info);
		if (vc == columnMsg_seq) return doMsg_seq_VC(info);
		if (vc == columnMsg_batch_log_no) return doMsg_batch_log_no_VC(info);
		if (vc == columnMsg_log_sub_key1) return doMsg_log_sub_key1_VC(info);
		if (vc == columnMsg_log_sub_key2) return doMsg_log_sub_key2_VC(info);
		if (vc == MsgArea_msg) return doMsgArea_msg_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Msg]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[recv_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_recv_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[recv_ok_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_recv_ok_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[recv_conv_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_recv_conv_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[recv_conv_ok_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_recv_conv_ok_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_no_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_no_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_no_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_no_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sdrv_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sdrv_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sdrv_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sdrv_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ins_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_char30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_char30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_num4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_num4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_num5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_num5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt1_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt1_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt1_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt1_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt2_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt2_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt2_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt2_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt3_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt3_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt3_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt3_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt4_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt4_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt4_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt4_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt5_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt5_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_dt5_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_dt5_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm1_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm1_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm1_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm1_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm2_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm2_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm2_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm2_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm3_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm3_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm3_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm3_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm4_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm4_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm4_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm4_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm5_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm5_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[attr_tm5_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_attr_tm5_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[recv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_recv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_data_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sdrv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sdrv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sdrv_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sdrv_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[file_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_file_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[conv_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_conv_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[file_io_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_file_io_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[web_api_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_web_api_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sdrv_clt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sdrv_clt_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sdrv_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sdrv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char21]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char21_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char22]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char22_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char23]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char23_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char24]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char24_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char25]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char25_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char26]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char26_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char27]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char27_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char28]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char28_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char29]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char29_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_char30]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_char30_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_num4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_num4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_num5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_num5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_dt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_dt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_dt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_dt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_tm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_tm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_tm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_tm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_tm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_tm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_tm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_tm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attr_tm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attr_tm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[log_sub_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_log_sub_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[log_sub_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_log_sub_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Filter]パネルの[disp_warn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFilter_disp_warn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Filter]パネルの[disp_not_warn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFilter_disp_not_warn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Filter]パネルの[disp_start_log]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFilter_disp_start_log_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Filter]パネルの[disp_data_log]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFilter_disp_data_log_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Filter]パネルの[disp_proc_log]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFilter_disp_proc_log_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Filter]パネルの[disp_end_log]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFilter_disp_end_log_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[batch_log_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_batch_log_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[batch_log_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_batch_log_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[msg_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_msg_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[msg_txt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_msg_txt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[msg_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_msg_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[log_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_log_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[log_sub_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_log_sub_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Msg]パネルの[log_sub_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_log_sub_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [MsgArea]パネルの[msg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsgArea_msg_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == MsgTable) doMsg_NC(info);
		else if (nc == Cnd_recv_err_flg) doCnd_recv_err_flg_NC(info);
		else if (nc == Cnd_recv_ok_flg) doCnd_recv_ok_flg_NC(info);
		else if (nc == Cnd_recv_conv_err_flg) doCnd_recv_conv_err_flg_NC(info);
		else if (nc == Cnd_recv_conv_ok_flg) doCnd_recv_conv_ok_flg_NC(info);
		else if (nc == Cnd_if_proc_typ) doCnd_if_proc_typ_NC(info);
		else if (nc == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_NC(info);
		else if (nc == Cnd_data_no_fr) doCnd_data_no_fr_NC(info);
		else if (nc == Cnd_data_no_to) doCnd_data_no_to_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_sdrv_tm_fr) doCnd_sdrv_tm_fr_NC(info);
		else if (nc == Cnd_sdrv_tm_to) doCnd_sdrv_tm_to_NC(info);
		else if (nc == Cnd_file_nm) doCnd_file_nm_NC(info);
		else if (nc == Cnd_batch_log_no) doCnd_batch_log_no_NC(info);
		else if (nc == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_NC(info);
		else if (nc == Cnd_attr_char1) doCnd_attr_char1_NC(info);
		else if (nc == Cnd_attr_char2) doCnd_attr_char2_NC(info);
		else if (nc == Cnd_attr_char3) doCnd_attr_char3_NC(info);
		else if (nc == Cnd_attr_char4) doCnd_attr_char4_NC(info);
		else if (nc == Cnd_attr_char5) doCnd_attr_char5_NC(info);
		else if (nc == Cnd_attr_char6) doCnd_attr_char6_NC(info);
		else if (nc == Cnd_attr_char7) doCnd_attr_char7_NC(info);
		else if (nc == Cnd_attr_char8) doCnd_attr_char8_NC(info);
		else if (nc == Cnd_attr_char9) doCnd_attr_char9_NC(info);
		else if (nc == Cnd_attr_char10) doCnd_attr_char10_NC(info);
		else if (nc == Cnd_attr_char11) doCnd_attr_char11_NC(info);
		else if (nc == Cnd_attr_char12) doCnd_attr_char12_NC(info);
		else if (nc == Cnd_attr_char13) doCnd_attr_char13_NC(info);
		else if (nc == Cnd_attr_char14) doCnd_attr_char14_NC(info);
		else if (nc == Cnd_attr_char15) doCnd_attr_char15_NC(info);
		else if (nc == Cnd_attr_char16) doCnd_attr_char16_NC(info);
		else if (nc == Cnd_attr_char17) doCnd_attr_char17_NC(info);
		else if (nc == Cnd_attr_char18) doCnd_attr_char18_NC(info);
		else if (nc == Cnd_attr_char19) doCnd_attr_char19_NC(info);
		else if (nc == Cnd_attr_char20) doCnd_attr_char20_NC(info);
		else if (nc == Cnd_attr_char21) doCnd_attr_char21_NC(info);
		else if (nc == Cnd_attr_char22) doCnd_attr_char22_NC(info);
		else if (nc == Cnd_attr_char23) doCnd_attr_char23_NC(info);
		else if (nc == Cnd_attr_char24) doCnd_attr_char24_NC(info);
		else if (nc == Cnd_attr_char25) doCnd_attr_char25_NC(info);
		else if (nc == Cnd_attr_char26) doCnd_attr_char26_NC(info);
		else if (nc == Cnd_attr_char27) doCnd_attr_char27_NC(info);
		else if (nc == Cnd_attr_char28) doCnd_attr_char28_NC(info);
		else if (nc == Cnd_attr_char29) doCnd_attr_char29_NC(info);
		else if (nc == Cnd_attr_char30) doCnd_attr_char30_NC(info);
		else if (nc == Cnd_attr_num1) doCnd_attr_num1_NC(info);
		else if (nc == Cnd_attr_num2) doCnd_attr_num2_NC(info);
		else if (nc == Cnd_attr_num3) doCnd_attr_num3_NC(info);
		else if (nc == Cnd_attr_num4) doCnd_attr_num4_NC(info);
		else if (nc == Cnd_attr_num5) doCnd_attr_num5_NC(info);
		else if (nc == Cnd_attr_dt1) doCnd_attr_dt1_NC(info);
		else if (nc == Cnd_attr_dt2) doCnd_attr_dt2_NC(info);
		else if (nc == Cnd_attr_dt3) doCnd_attr_dt3_NC(info);
		else if (nc == Cnd_attr_dt4) doCnd_attr_dt4_NC(info);
		else if (nc == Cnd_attr_dt5) doCnd_attr_dt5_NC(info);
		else if (nc == Cnd_attr_dt1_fr) doCnd_attr_dt1_fr_NC(info);
		else if (nc == Cnd_attr_dt1_to) doCnd_attr_dt1_to_NC(info);
		else if (nc == Cnd_attr_dt2_fr) doCnd_attr_dt2_fr_NC(info);
		else if (nc == Cnd_attr_dt2_to) doCnd_attr_dt2_to_NC(info);
		else if (nc == Cnd_attr_dt3_fr) doCnd_attr_dt3_fr_NC(info);
		else if (nc == Cnd_attr_dt3_to) doCnd_attr_dt3_to_NC(info);
		else if (nc == Cnd_attr_dt4_fr) doCnd_attr_dt4_fr_NC(info);
		else if (nc == Cnd_attr_dt4_to) doCnd_attr_dt4_to_NC(info);
		else if (nc == Cnd_attr_dt5_fr) doCnd_attr_dt5_fr_NC(info);
		else if (nc == Cnd_attr_dt5_to) doCnd_attr_dt5_to_NC(info);
		else if (nc == Cnd_attr_tm1_fr) doCnd_attr_tm1_fr_NC(info);
		else if (nc == Cnd_attr_tm1_to) doCnd_attr_tm1_to_NC(info);
		else if (nc == Cnd_attr_tm2_fr) doCnd_attr_tm2_fr_NC(info);
		else if (nc == Cnd_attr_tm2_to) doCnd_attr_tm2_to_NC(info);
		else if (nc == Cnd_attr_tm3_fr) doCnd_attr_tm3_fr_NC(info);
		else if (nc == Cnd_attr_tm3_to) doCnd_attr_tm3_to_NC(info);
		else if (nc == Cnd_attr_tm4_fr) doCnd_attr_tm4_fr_NC(info);
		else if (nc == Cnd_attr_tm4_to) doCnd_attr_tm4_to_NC(info);
		else if (nc == Cnd_attr_tm5_fr) doCnd_attr_tm5_fr_NC(info);
		else if (nc == Cnd_attr_tm5_to) doCnd_attr_tm5_to_NC(info);
		else if (nc == columnDtl_recv_flg) doDtl_recv_flg_NC(info);
		else if (nc == columnDtl_if_proc_typ) doDtl_if_proc_typ_NC(info);
		else if (nc == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_NC(info);
		else if (nc == columnDtl_data_no) doDtl_data_no_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_sdrv_sts_typ) doDtl_sdrv_sts_typ_NC(info);
		else if (nc == columnDtl_sdrv_sts_typ_nm) doDtl_sdrv_sts_typ_nm_NC(info);
		else if (nc == columnDtl_sdrv_tm) doDtl_sdrv_tm_NC(info);
		else if (nc == columnDtl_file_id) doDtl_file_id_NC(info);
		else if (nc == columnDtl_file_nm) doDtl_file_nm_NC(info);
		else if (nc == columnDtl_file_path) doDtl_file_path_NC(info);
		else if (nc == columnDtl_conv_ope) doDtl_conv_ope_NC(info);
		else if (nc == columnDtl_file_io_ope) doDtl_file_io_ope_NC(info);
		else if (nc == columnDtl_web_api_ope) doDtl_web_api_ope_NC(info);
		else if (nc == columnDtl_sdrv_clt_id) doDtl_sdrv_clt_id_NC(info);
		else if (nc == columnDtl_sdrv_usr_id) doDtl_sdrv_usr_id_NC(info);
		else if (nc == columnDtl_sdrv_usr_nm) doDtl_sdrv_usr_nm_NC(info);
		else if (nc == columnDtl_attr_char1) doDtl_attr_char1_NC(info);
		else if (nc == columnDtl_attr_char2) doDtl_attr_char2_NC(info);
		else if (nc == columnDtl_attr_char3) doDtl_attr_char3_NC(info);
		else if (nc == columnDtl_attr_char4) doDtl_attr_char4_NC(info);
		else if (nc == columnDtl_attr_char5) doDtl_attr_char5_NC(info);
		else if (nc == columnDtl_attr_char6) doDtl_attr_char6_NC(info);
		else if (nc == columnDtl_attr_char7) doDtl_attr_char7_NC(info);
		else if (nc == columnDtl_attr_char8) doDtl_attr_char8_NC(info);
		else if (nc == columnDtl_attr_char9) doDtl_attr_char9_NC(info);
		else if (nc == columnDtl_attr_char10) doDtl_attr_char10_NC(info);
		else if (nc == columnDtl_attr_char11) doDtl_attr_char11_NC(info);
		else if (nc == columnDtl_attr_char12) doDtl_attr_char12_NC(info);
		else if (nc == columnDtl_attr_char13) doDtl_attr_char13_NC(info);
		else if (nc == columnDtl_attr_char14) doDtl_attr_char14_NC(info);
		else if (nc == columnDtl_attr_char15) doDtl_attr_char15_NC(info);
		else if (nc == columnDtl_attr_char16) doDtl_attr_char16_NC(info);
		else if (nc == columnDtl_attr_char17) doDtl_attr_char17_NC(info);
		else if (nc == columnDtl_attr_char18) doDtl_attr_char18_NC(info);
		else if (nc == columnDtl_attr_char19) doDtl_attr_char19_NC(info);
		else if (nc == columnDtl_attr_char20) doDtl_attr_char20_NC(info);
		else if (nc == columnDtl_attr_char21) doDtl_attr_char21_NC(info);
		else if (nc == columnDtl_attr_char22) doDtl_attr_char22_NC(info);
		else if (nc == columnDtl_attr_char23) doDtl_attr_char23_NC(info);
		else if (nc == columnDtl_attr_char24) doDtl_attr_char24_NC(info);
		else if (nc == columnDtl_attr_char25) doDtl_attr_char25_NC(info);
		else if (nc == columnDtl_attr_char26) doDtl_attr_char26_NC(info);
		else if (nc == columnDtl_attr_char27) doDtl_attr_char27_NC(info);
		else if (nc == columnDtl_attr_char28) doDtl_attr_char28_NC(info);
		else if (nc == columnDtl_attr_char29) doDtl_attr_char29_NC(info);
		else if (nc == columnDtl_attr_char30) doDtl_attr_char30_NC(info);
		else if (nc == columnDtl_attr_num1) doDtl_attr_num1_NC(info);
		else if (nc == columnDtl_attr_num2) doDtl_attr_num2_NC(info);
		else if (nc == columnDtl_attr_num3) doDtl_attr_num3_NC(info);
		else if (nc == columnDtl_attr_num4) doDtl_attr_num4_NC(info);
		else if (nc == columnDtl_attr_num5) doDtl_attr_num5_NC(info);
		else if (nc == columnDtl_attr_dt1) doDtl_attr_dt1_NC(info);
		else if (nc == columnDtl_attr_dt2) doDtl_attr_dt2_NC(info);
		else if (nc == columnDtl_attr_dt3) doDtl_attr_dt3_NC(info);
		else if (nc == columnDtl_attr_dt4) doDtl_attr_dt4_NC(info);
		else if (nc == columnDtl_attr_dt5) doDtl_attr_dt5_NC(info);
		else if (nc == columnDtl_attr_tm1) doDtl_attr_tm1_NC(info);
		else if (nc == columnDtl_attr_tm2) doDtl_attr_tm2_NC(info);
		else if (nc == columnDtl_attr_tm3) doDtl_attr_tm3_NC(info);
		else if (nc == columnDtl_attr_tm4) doDtl_attr_tm4_NC(info);
		else if (nc == columnDtl_attr_tm5) doDtl_attr_tm5_NC(info);
		else if (nc == columnDtl_batch_log_no) doDtl_batch_log_no_NC(info);
		else if (nc == columnDtl_log_sub_key1) doDtl_log_sub_key1_NC(info);
		else if (nc == columnDtl_log_sub_key2) doDtl_log_sub_key2_NC(info);
		else if (nc == Filter_disp_warn) doFilter_disp_warn_NC(info);
		else if (nc == Filter_disp_not_warn) doFilter_disp_not_warn_NC(info);
		else if (nc == Filter_disp_start_log) doFilter_disp_start_log_NC(info);
		else if (nc == Filter_disp_data_log) doFilter_disp_data_log_NC(info);
		else if (nc == Filter_disp_proc_log) doFilter_disp_proc_log_NC(info);
		else if (nc == Filter_disp_end_log) doFilter_disp_end_log_NC(info);
		else if (nc == columnMsg_batch_log_typ) doMsg_batch_log_typ_NC(info);
		else if (nc == columnMsg_batch_log_typ_nm) doMsg_batch_log_typ_nm_NC(info);
		else if (nc == columnMsg_msg_id) doMsg_msg_id_NC(info);
		else if (nc == columnMsg_msg_txt) doMsg_msg_txt_NC(info);
		else if (nc == columnMsg_msg_lvl) doMsg_msg_lvl_NC(info);
		else if (nc == columnMsg_log_ts) doMsg_log_ts_NC(info);
		else if (nc == columnMsg_seq) doMsg_seq_NC(info);
		else if (nc == columnMsg_batch_log_no) doMsg_batch_log_no_NC(info);
		else if (nc == columnMsg_log_sub_key1) doMsg_log_sub_key1_NC(info);
		else if (nc == columnMsg_log_sub_key2) doMsg_log_sub_key2_NC(info);
		else if (nc == MsgArea_msg) doMsgArea_msg_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Msg]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_ok_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_ok_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_conv_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_conv_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_conv_ok_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_conv_ok_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sdrv_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sdrv_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char11_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char12_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char13_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char14_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char15_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char16_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char17_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char18_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char19_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char20_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char21_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char22_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char23_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char24_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char25_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char26_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char27_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char28_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char29_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char30_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_to_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[recv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_recv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_tm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conv_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conv_ope_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_io_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_io_ope_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_ope_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_clt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_clt_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char11_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char12_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char13_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char14_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char15_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char16_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char17_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char18_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char19_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char20_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char21]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char21_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char22]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char22_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char23]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char23_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char24]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char24_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char25]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char25_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char26]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char26_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char27]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char27_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char28]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char28_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char29]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char29_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char30]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char30_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key2_NC(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_warn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_warn_NC(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_not_warn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_not_warn_NC(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_start_log]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_start_log_NC(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_data_log]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_data_log_NC(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_proc_log]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_proc_log_NC(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_end_log]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_end_log_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_id_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_txt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_txt_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_lvl_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_ts_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_seq_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key1_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key2_NC(MCEventInfo info){
	}

	/**
	 * [MsgArea]パネルの[msg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgArea_msg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == MsgTable) doMsg_NE(info);
		else if (ne == Cnd_recv_err_flg) doCnd_recv_err_flg_NE(info);
		else if (ne == Cnd_recv_ok_flg) doCnd_recv_ok_flg_NE(info);
		else if (ne == Cnd_recv_conv_err_flg) doCnd_recv_conv_err_flg_NE(info);
		else if (ne == Cnd_recv_conv_ok_flg) doCnd_recv_conv_ok_flg_NE(info);
		else if (ne == Cnd_if_proc_typ) doCnd_if_proc_typ_NE(info);
		else if (ne == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_NE(info);
		else if (ne == Cnd_data_no_fr) doCnd_data_no_fr_NE(info);
		else if (ne == Cnd_data_no_to) doCnd_data_no_to_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_sdrv_tm_fr) doCnd_sdrv_tm_fr_NE(info);
		else if (ne == Cnd_sdrv_tm_to) doCnd_sdrv_tm_to_NE(info);
		else if (ne == Cnd_file_nm) doCnd_file_nm_NE(info);
		else if (ne == Cnd_batch_log_no) doCnd_batch_log_no_NE(info);
		else if (ne == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_NE(info);
		else if (ne == Cnd_attr_char1) doCnd_attr_char1_NE(info);
		else if (ne == Cnd_attr_char2) doCnd_attr_char2_NE(info);
		else if (ne == Cnd_attr_char3) doCnd_attr_char3_NE(info);
		else if (ne == Cnd_attr_char4) doCnd_attr_char4_NE(info);
		else if (ne == Cnd_attr_char5) doCnd_attr_char5_NE(info);
		else if (ne == Cnd_attr_char6) doCnd_attr_char6_NE(info);
		else if (ne == Cnd_attr_char7) doCnd_attr_char7_NE(info);
		else if (ne == Cnd_attr_char8) doCnd_attr_char8_NE(info);
		else if (ne == Cnd_attr_char9) doCnd_attr_char9_NE(info);
		else if (ne == Cnd_attr_char10) doCnd_attr_char10_NE(info);
		else if (ne == Cnd_attr_char11) doCnd_attr_char11_NE(info);
		else if (ne == Cnd_attr_char12) doCnd_attr_char12_NE(info);
		else if (ne == Cnd_attr_char13) doCnd_attr_char13_NE(info);
		else if (ne == Cnd_attr_char14) doCnd_attr_char14_NE(info);
		else if (ne == Cnd_attr_char15) doCnd_attr_char15_NE(info);
		else if (ne == Cnd_attr_char16) doCnd_attr_char16_NE(info);
		else if (ne == Cnd_attr_char17) doCnd_attr_char17_NE(info);
		else if (ne == Cnd_attr_char18) doCnd_attr_char18_NE(info);
		else if (ne == Cnd_attr_char19) doCnd_attr_char19_NE(info);
		else if (ne == Cnd_attr_char20) doCnd_attr_char20_NE(info);
		else if (ne == Cnd_attr_char21) doCnd_attr_char21_NE(info);
		else if (ne == Cnd_attr_char22) doCnd_attr_char22_NE(info);
		else if (ne == Cnd_attr_char23) doCnd_attr_char23_NE(info);
		else if (ne == Cnd_attr_char24) doCnd_attr_char24_NE(info);
		else if (ne == Cnd_attr_char25) doCnd_attr_char25_NE(info);
		else if (ne == Cnd_attr_char26) doCnd_attr_char26_NE(info);
		else if (ne == Cnd_attr_char27) doCnd_attr_char27_NE(info);
		else if (ne == Cnd_attr_char28) doCnd_attr_char28_NE(info);
		else if (ne == Cnd_attr_char29) doCnd_attr_char29_NE(info);
		else if (ne == Cnd_attr_char30) doCnd_attr_char30_NE(info);
		else if (ne == Cnd_attr_num1) doCnd_attr_num1_NE(info);
		else if (ne == Cnd_attr_num2) doCnd_attr_num2_NE(info);
		else if (ne == Cnd_attr_num3) doCnd_attr_num3_NE(info);
		else if (ne == Cnd_attr_num4) doCnd_attr_num4_NE(info);
		else if (ne == Cnd_attr_num5) doCnd_attr_num5_NE(info);
		else if (ne == Cnd_attr_dt1) doCnd_attr_dt1_NE(info);
		else if (ne == Cnd_attr_dt2) doCnd_attr_dt2_NE(info);
		else if (ne == Cnd_attr_dt3) doCnd_attr_dt3_NE(info);
		else if (ne == Cnd_attr_dt4) doCnd_attr_dt4_NE(info);
		else if (ne == Cnd_attr_dt5) doCnd_attr_dt5_NE(info);
		else if (ne == Cnd_attr_dt1_fr) doCnd_attr_dt1_fr_NE(info);
		else if (ne == Cnd_attr_dt1_to) doCnd_attr_dt1_to_NE(info);
		else if (ne == Cnd_attr_dt2_fr) doCnd_attr_dt2_fr_NE(info);
		else if (ne == Cnd_attr_dt2_to) doCnd_attr_dt2_to_NE(info);
		else if (ne == Cnd_attr_dt3_fr) doCnd_attr_dt3_fr_NE(info);
		else if (ne == Cnd_attr_dt3_to) doCnd_attr_dt3_to_NE(info);
		else if (ne == Cnd_attr_dt4_fr) doCnd_attr_dt4_fr_NE(info);
		else if (ne == Cnd_attr_dt4_to) doCnd_attr_dt4_to_NE(info);
		else if (ne == Cnd_attr_dt5_fr) doCnd_attr_dt5_fr_NE(info);
		else if (ne == Cnd_attr_dt5_to) doCnd_attr_dt5_to_NE(info);
		else if (ne == Cnd_attr_tm1_fr) doCnd_attr_tm1_fr_NE(info);
		else if (ne == Cnd_attr_tm1_to) doCnd_attr_tm1_to_NE(info);
		else if (ne == Cnd_attr_tm2_fr) doCnd_attr_tm2_fr_NE(info);
		else if (ne == Cnd_attr_tm2_to) doCnd_attr_tm2_to_NE(info);
		else if (ne == Cnd_attr_tm3_fr) doCnd_attr_tm3_fr_NE(info);
		else if (ne == Cnd_attr_tm3_to) doCnd_attr_tm3_to_NE(info);
		else if (ne == Cnd_attr_tm4_fr) doCnd_attr_tm4_fr_NE(info);
		else if (ne == Cnd_attr_tm4_to) doCnd_attr_tm4_to_NE(info);
		else if (ne == Cnd_attr_tm5_fr) doCnd_attr_tm5_fr_NE(info);
		else if (ne == Cnd_attr_tm5_to) doCnd_attr_tm5_to_NE(info);
		else if (ne == columnDtl_recv_flg) doDtl_recv_flg_NE(info);
		else if (ne == columnDtl_if_proc_typ) doDtl_if_proc_typ_NE(info);
		else if (ne == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_NE(info);
		else if (ne == columnDtl_data_no) doDtl_data_no_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_sdrv_sts_typ) doDtl_sdrv_sts_typ_NE(info);
		else if (ne == columnDtl_sdrv_sts_typ_nm) doDtl_sdrv_sts_typ_nm_NE(info);
		else if (ne == columnDtl_sdrv_tm) doDtl_sdrv_tm_NE(info);
		else if (ne == columnDtl_file_id) doDtl_file_id_NE(info);
		else if (ne == columnDtl_file_nm) doDtl_file_nm_NE(info);
		else if (ne == columnDtl_file_path) doDtl_file_path_NE(info);
		else if (ne == columnDtl_conv_ope) doDtl_conv_ope_NE(info);
		else if (ne == columnDtl_file_io_ope) doDtl_file_io_ope_NE(info);
		else if (ne == columnDtl_web_api_ope) doDtl_web_api_ope_NE(info);
		else if (ne == columnDtl_sdrv_clt_id) doDtl_sdrv_clt_id_NE(info);
		else if (ne == columnDtl_sdrv_usr_id) doDtl_sdrv_usr_id_NE(info);
		else if (ne == columnDtl_sdrv_usr_nm) doDtl_sdrv_usr_nm_NE(info);
		else if (ne == columnDtl_attr_char1) doDtl_attr_char1_NE(info);
		else if (ne == columnDtl_attr_char2) doDtl_attr_char2_NE(info);
		else if (ne == columnDtl_attr_char3) doDtl_attr_char3_NE(info);
		else if (ne == columnDtl_attr_char4) doDtl_attr_char4_NE(info);
		else if (ne == columnDtl_attr_char5) doDtl_attr_char5_NE(info);
		else if (ne == columnDtl_attr_char6) doDtl_attr_char6_NE(info);
		else if (ne == columnDtl_attr_char7) doDtl_attr_char7_NE(info);
		else if (ne == columnDtl_attr_char8) doDtl_attr_char8_NE(info);
		else if (ne == columnDtl_attr_char9) doDtl_attr_char9_NE(info);
		else if (ne == columnDtl_attr_char10) doDtl_attr_char10_NE(info);
		else if (ne == columnDtl_attr_char11) doDtl_attr_char11_NE(info);
		else if (ne == columnDtl_attr_char12) doDtl_attr_char12_NE(info);
		else if (ne == columnDtl_attr_char13) doDtl_attr_char13_NE(info);
		else if (ne == columnDtl_attr_char14) doDtl_attr_char14_NE(info);
		else if (ne == columnDtl_attr_char15) doDtl_attr_char15_NE(info);
		else if (ne == columnDtl_attr_char16) doDtl_attr_char16_NE(info);
		else if (ne == columnDtl_attr_char17) doDtl_attr_char17_NE(info);
		else if (ne == columnDtl_attr_char18) doDtl_attr_char18_NE(info);
		else if (ne == columnDtl_attr_char19) doDtl_attr_char19_NE(info);
		else if (ne == columnDtl_attr_char20) doDtl_attr_char20_NE(info);
		else if (ne == columnDtl_attr_char21) doDtl_attr_char21_NE(info);
		else if (ne == columnDtl_attr_char22) doDtl_attr_char22_NE(info);
		else if (ne == columnDtl_attr_char23) doDtl_attr_char23_NE(info);
		else if (ne == columnDtl_attr_char24) doDtl_attr_char24_NE(info);
		else if (ne == columnDtl_attr_char25) doDtl_attr_char25_NE(info);
		else if (ne == columnDtl_attr_char26) doDtl_attr_char26_NE(info);
		else if (ne == columnDtl_attr_char27) doDtl_attr_char27_NE(info);
		else if (ne == columnDtl_attr_char28) doDtl_attr_char28_NE(info);
		else if (ne == columnDtl_attr_char29) doDtl_attr_char29_NE(info);
		else if (ne == columnDtl_attr_char30) doDtl_attr_char30_NE(info);
		else if (ne == columnDtl_attr_num1) doDtl_attr_num1_NE(info);
		else if (ne == columnDtl_attr_num2) doDtl_attr_num2_NE(info);
		else if (ne == columnDtl_attr_num3) doDtl_attr_num3_NE(info);
		else if (ne == columnDtl_attr_num4) doDtl_attr_num4_NE(info);
		else if (ne == columnDtl_attr_num5) doDtl_attr_num5_NE(info);
		else if (ne == columnDtl_attr_dt1) doDtl_attr_dt1_NE(info);
		else if (ne == columnDtl_attr_dt2) doDtl_attr_dt2_NE(info);
		else if (ne == columnDtl_attr_dt3) doDtl_attr_dt3_NE(info);
		else if (ne == columnDtl_attr_dt4) doDtl_attr_dt4_NE(info);
		else if (ne == columnDtl_attr_dt5) doDtl_attr_dt5_NE(info);
		else if (ne == columnDtl_attr_tm1) doDtl_attr_tm1_NE(info);
		else if (ne == columnDtl_attr_tm2) doDtl_attr_tm2_NE(info);
		else if (ne == columnDtl_attr_tm3) doDtl_attr_tm3_NE(info);
		else if (ne == columnDtl_attr_tm4) doDtl_attr_tm4_NE(info);
		else if (ne == columnDtl_attr_tm5) doDtl_attr_tm5_NE(info);
		else if (ne == columnDtl_batch_log_no) doDtl_batch_log_no_NE(info);
		else if (ne == columnDtl_log_sub_key1) doDtl_log_sub_key1_NE(info);
		else if (ne == columnDtl_log_sub_key2) doDtl_log_sub_key2_NE(info);
		else if (ne == Filter_disp_warn) doFilter_disp_warn_NE(info);
		else if (ne == Filter_disp_not_warn) doFilter_disp_not_warn_NE(info);
		else if (ne == Filter_disp_start_log) doFilter_disp_start_log_NE(info);
		else if (ne == Filter_disp_data_log) doFilter_disp_data_log_NE(info);
		else if (ne == Filter_disp_proc_log) doFilter_disp_proc_log_NE(info);
		else if (ne == Filter_disp_end_log) doFilter_disp_end_log_NE(info);
		else if (ne == columnMsg_batch_log_typ) doMsg_batch_log_typ_NE(info);
		else if (ne == columnMsg_batch_log_typ_nm) doMsg_batch_log_typ_nm_NE(info);
		else if (ne == columnMsg_msg_id) doMsg_msg_id_NE(info);
		else if (ne == columnMsg_msg_txt) doMsg_msg_txt_NE(info);
		else if (ne == columnMsg_msg_lvl) doMsg_msg_lvl_NE(info);
		else if (ne == columnMsg_log_ts) doMsg_log_ts_NE(info);
		else if (ne == columnMsg_seq) doMsg_seq_NE(info);
		else if (ne == columnMsg_batch_log_no) doMsg_batch_log_no_NE(info);
		else if (ne == columnMsg_log_sub_key1) doMsg_log_sub_key1_NE(info);
		else if (ne == columnMsg_log_sub_key2) doMsg_log_sub_key2_NE(info);
		else if (ne == MsgArea_msg) doMsgArea_msg_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Msg]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_ok_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_ok_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_conv_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_conv_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_conv_ok_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_conv_ok_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sdrv_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sdrv_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char11_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char12_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char13_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char14_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char15_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char16_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char17_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char18_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char19_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char20_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char21_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char22_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char23_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char24_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char25_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char26_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char27_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char28_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char29_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char30_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_to_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[recv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_recv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_tm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conv_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conv_ope_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_io_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_io_ope_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_ope_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_clt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_clt_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char11_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char12_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char13_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char14_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char15_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char16_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char17_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char18_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char19_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char20_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char21]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char21_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char22]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char22_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char23]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char23_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char24]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char24_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char25]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char25_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char26]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char26_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char27]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char27_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char28]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char28_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char29]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char29_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char30]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char30_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key2_NE(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_warn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_warn_NE(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_not_warn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_not_warn_NE(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_start_log]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_start_log_NE(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_data_log]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_data_log_NE(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_proc_log]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_proc_log_NE(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_end_log]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_end_log_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_id_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_txt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_txt_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_lvl_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_ts_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_seq_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key1_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key2_NE(MCEventInfo info){
	}

	/**
	 * [MsgArea]パネルの[msg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgArea_msg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == MsgTable) doMsg_NX(info);
		else if (nx == Cnd_recv_err_flg) doCnd_recv_err_flg_NX(info);
		else if (nx == Cnd_recv_ok_flg) doCnd_recv_ok_flg_NX(info);
		else if (nx == Cnd_recv_conv_err_flg) doCnd_recv_conv_err_flg_NX(info);
		else if (nx == Cnd_recv_conv_ok_flg) doCnd_recv_conv_ok_flg_NX(info);
		else if (nx == Cnd_if_proc_typ) doCnd_if_proc_typ_NX(info);
		else if (nx == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_NX(info);
		else if (nx == Cnd_data_no_fr) doCnd_data_no_fr_NX(info);
		else if (nx == Cnd_data_no_to) doCnd_data_no_to_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_sdrv_tm_fr) doCnd_sdrv_tm_fr_NX(info);
		else if (nx == Cnd_sdrv_tm_to) doCnd_sdrv_tm_to_NX(info);
		else if (nx == Cnd_file_nm) doCnd_file_nm_NX(info);
		else if (nx == Cnd_batch_log_no) doCnd_batch_log_no_NX(info);
		else if (nx == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_NX(info);
		else if (nx == Cnd_attr_char1) doCnd_attr_char1_NX(info);
		else if (nx == Cnd_attr_char2) doCnd_attr_char2_NX(info);
		else if (nx == Cnd_attr_char3) doCnd_attr_char3_NX(info);
		else if (nx == Cnd_attr_char4) doCnd_attr_char4_NX(info);
		else if (nx == Cnd_attr_char5) doCnd_attr_char5_NX(info);
		else if (nx == Cnd_attr_char6) doCnd_attr_char6_NX(info);
		else if (nx == Cnd_attr_char7) doCnd_attr_char7_NX(info);
		else if (nx == Cnd_attr_char8) doCnd_attr_char8_NX(info);
		else if (nx == Cnd_attr_char9) doCnd_attr_char9_NX(info);
		else if (nx == Cnd_attr_char10) doCnd_attr_char10_NX(info);
		else if (nx == Cnd_attr_char11) doCnd_attr_char11_NX(info);
		else if (nx == Cnd_attr_char12) doCnd_attr_char12_NX(info);
		else if (nx == Cnd_attr_char13) doCnd_attr_char13_NX(info);
		else if (nx == Cnd_attr_char14) doCnd_attr_char14_NX(info);
		else if (nx == Cnd_attr_char15) doCnd_attr_char15_NX(info);
		else if (nx == Cnd_attr_char16) doCnd_attr_char16_NX(info);
		else if (nx == Cnd_attr_char17) doCnd_attr_char17_NX(info);
		else if (nx == Cnd_attr_char18) doCnd_attr_char18_NX(info);
		else if (nx == Cnd_attr_char19) doCnd_attr_char19_NX(info);
		else if (nx == Cnd_attr_char20) doCnd_attr_char20_NX(info);
		else if (nx == Cnd_attr_char21) doCnd_attr_char21_NX(info);
		else if (nx == Cnd_attr_char22) doCnd_attr_char22_NX(info);
		else if (nx == Cnd_attr_char23) doCnd_attr_char23_NX(info);
		else if (nx == Cnd_attr_char24) doCnd_attr_char24_NX(info);
		else if (nx == Cnd_attr_char25) doCnd_attr_char25_NX(info);
		else if (nx == Cnd_attr_char26) doCnd_attr_char26_NX(info);
		else if (nx == Cnd_attr_char27) doCnd_attr_char27_NX(info);
		else if (nx == Cnd_attr_char28) doCnd_attr_char28_NX(info);
		else if (nx == Cnd_attr_char29) doCnd_attr_char29_NX(info);
		else if (nx == Cnd_attr_char30) doCnd_attr_char30_NX(info);
		else if (nx == Cnd_attr_num1) doCnd_attr_num1_NX(info);
		else if (nx == Cnd_attr_num2) doCnd_attr_num2_NX(info);
		else if (nx == Cnd_attr_num3) doCnd_attr_num3_NX(info);
		else if (nx == Cnd_attr_num4) doCnd_attr_num4_NX(info);
		else if (nx == Cnd_attr_num5) doCnd_attr_num5_NX(info);
		else if (nx == Cnd_attr_dt1) doCnd_attr_dt1_NX(info);
		else if (nx == Cnd_attr_dt2) doCnd_attr_dt2_NX(info);
		else if (nx == Cnd_attr_dt3) doCnd_attr_dt3_NX(info);
		else if (nx == Cnd_attr_dt4) doCnd_attr_dt4_NX(info);
		else if (nx == Cnd_attr_dt5) doCnd_attr_dt5_NX(info);
		else if (nx == Cnd_attr_dt1_fr) doCnd_attr_dt1_fr_NX(info);
		else if (nx == Cnd_attr_dt1_to) doCnd_attr_dt1_to_NX(info);
		else if (nx == Cnd_attr_dt2_fr) doCnd_attr_dt2_fr_NX(info);
		else if (nx == Cnd_attr_dt2_to) doCnd_attr_dt2_to_NX(info);
		else if (nx == Cnd_attr_dt3_fr) doCnd_attr_dt3_fr_NX(info);
		else if (nx == Cnd_attr_dt3_to) doCnd_attr_dt3_to_NX(info);
		else if (nx == Cnd_attr_dt4_fr) doCnd_attr_dt4_fr_NX(info);
		else if (nx == Cnd_attr_dt4_to) doCnd_attr_dt4_to_NX(info);
		else if (nx == Cnd_attr_dt5_fr) doCnd_attr_dt5_fr_NX(info);
		else if (nx == Cnd_attr_dt5_to) doCnd_attr_dt5_to_NX(info);
		else if (nx == Cnd_attr_tm1_fr) doCnd_attr_tm1_fr_NX(info);
		else if (nx == Cnd_attr_tm1_to) doCnd_attr_tm1_to_NX(info);
		else if (nx == Cnd_attr_tm2_fr) doCnd_attr_tm2_fr_NX(info);
		else if (nx == Cnd_attr_tm2_to) doCnd_attr_tm2_to_NX(info);
		else if (nx == Cnd_attr_tm3_fr) doCnd_attr_tm3_fr_NX(info);
		else if (nx == Cnd_attr_tm3_to) doCnd_attr_tm3_to_NX(info);
		else if (nx == Cnd_attr_tm4_fr) doCnd_attr_tm4_fr_NX(info);
		else if (nx == Cnd_attr_tm4_to) doCnd_attr_tm4_to_NX(info);
		else if (nx == Cnd_attr_tm5_fr) doCnd_attr_tm5_fr_NX(info);
		else if (nx == Cnd_attr_tm5_to) doCnd_attr_tm5_to_NX(info);
		else if (nx == columnDtl_recv_flg) doDtl_recv_flg_NX(info);
		else if (nx == columnDtl_if_proc_typ) doDtl_if_proc_typ_NX(info);
		else if (nx == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_NX(info);
		else if (nx == columnDtl_data_no) doDtl_data_no_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_sdrv_sts_typ) doDtl_sdrv_sts_typ_NX(info);
		else if (nx == columnDtl_sdrv_sts_typ_nm) doDtl_sdrv_sts_typ_nm_NX(info);
		else if (nx == columnDtl_sdrv_tm) doDtl_sdrv_tm_NX(info);
		else if (nx == columnDtl_file_id) doDtl_file_id_NX(info);
		else if (nx == columnDtl_file_nm) doDtl_file_nm_NX(info);
		else if (nx == columnDtl_file_path) doDtl_file_path_NX(info);
		else if (nx == columnDtl_conv_ope) doDtl_conv_ope_NX(info);
		else if (nx == columnDtl_file_io_ope) doDtl_file_io_ope_NX(info);
		else if (nx == columnDtl_web_api_ope) doDtl_web_api_ope_NX(info);
		else if (nx == columnDtl_sdrv_clt_id) doDtl_sdrv_clt_id_NX(info);
		else if (nx == columnDtl_sdrv_usr_id) doDtl_sdrv_usr_id_NX(info);
		else if (nx == columnDtl_sdrv_usr_nm) doDtl_sdrv_usr_nm_NX(info);
		else if (nx == columnDtl_attr_char1) doDtl_attr_char1_NX(info);
		else if (nx == columnDtl_attr_char2) doDtl_attr_char2_NX(info);
		else if (nx == columnDtl_attr_char3) doDtl_attr_char3_NX(info);
		else if (nx == columnDtl_attr_char4) doDtl_attr_char4_NX(info);
		else if (nx == columnDtl_attr_char5) doDtl_attr_char5_NX(info);
		else if (nx == columnDtl_attr_char6) doDtl_attr_char6_NX(info);
		else if (nx == columnDtl_attr_char7) doDtl_attr_char7_NX(info);
		else if (nx == columnDtl_attr_char8) doDtl_attr_char8_NX(info);
		else if (nx == columnDtl_attr_char9) doDtl_attr_char9_NX(info);
		else if (nx == columnDtl_attr_char10) doDtl_attr_char10_NX(info);
		else if (nx == columnDtl_attr_char11) doDtl_attr_char11_NX(info);
		else if (nx == columnDtl_attr_char12) doDtl_attr_char12_NX(info);
		else if (nx == columnDtl_attr_char13) doDtl_attr_char13_NX(info);
		else if (nx == columnDtl_attr_char14) doDtl_attr_char14_NX(info);
		else if (nx == columnDtl_attr_char15) doDtl_attr_char15_NX(info);
		else if (nx == columnDtl_attr_char16) doDtl_attr_char16_NX(info);
		else if (nx == columnDtl_attr_char17) doDtl_attr_char17_NX(info);
		else if (nx == columnDtl_attr_char18) doDtl_attr_char18_NX(info);
		else if (nx == columnDtl_attr_char19) doDtl_attr_char19_NX(info);
		else if (nx == columnDtl_attr_char20) doDtl_attr_char20_NX(info);
		else if (nx == columnDtl_attr_char21) doDtl_attr_char21_NX(info);
		else if (nx == columnDtl_attr_char22) doDtl_attr_char22_NX(info);
		else if (nx == columnDtl_attr_char23) doDtl_attr_char23_NX(info);
		else if (nx == columnDtl_attr_char24) doDtl_attr_char24_NX(info);
		else if (nx == columnDtl_attr_char25) doDtl_attr_char25_NX(info);
		else if (nx == columnDtl_attr_char26) doDtl_attr_char26_NX(info);
		else if (nx == columnDtl_attr_char27) doDtl_attr_char27_NX(info);
		else if (nx == columnDtl_attr_char28) doDtl_attr_char28_NX(info);
		else if (nx == columnDtl_attr_char29) doDtl_attr_char29_NX(info);
		else if (nx == columnDtl_attr_char30) doDtl_attr_char30_NX(info);
		else if (nx == columnDtl_attr_num1) doDtl_attr_num1_NX(info);
		else if (nx == columnDtl_attr_num2) doDtl_attr_num2_NX(info);
		else if (nx == columnDtl_attr_num3) doDtl_attr_num3_NX(info);
		else if (nx == columnDtl_attr_num4) doDtl_attr_num4_NX(info);
		else if (nx == columnDtl_attr_num5) doDtl_attr_num5_NX(info);
		else if (nx == columnDtl_attr_dt1) doDtl_attr_dt1_NX(info);
		else if (nx == columnDtl_attr_dt2) doDtl_attr_dt2_NX(info);
		else if (nx == columnDtl_attr_dt3) doDtl_attr_dt3_NX(info);
		else if (nx == columnDtl_attr_dt4) doDtl_attr_dt4_NX(info);
		else if (nx == columnDtl_attr_dt5) doDtl_attr_dt5_NX(info);
		else if (nx == columnDtl_attr_tm1) doDtl_attr_tm1_NX(info);
		else if (nx == columnDtl_attr_tm2) doDtl_attr_tm2_NX(info);
		else if (nx == columnDtl_attr_tm3) doDtl_attr_tm3_NX(info);
		else if (nx == columnDtl_attr_tm4) doDtl_attr_tm4_NX(info);
		else if (nx == columnDtl_attr_tm5) doDtl_attr_tm5_NX(info);
		else if (nx == columnDtl_batch_log_no) doDtl_batch_log_no_NX(info);
		else if (nx == columnDtl_log_sub_key1) doDtl_log_sub_key1_NX(info);
		else if (nx == columnDtl_log_sub_key2) doDtl_log_sub_key2_NX(info);
		else if (nx == Filter_disp_warn) doFilter_disp_warn_NX(info);
		else if (nx == Filter_disp_not_warn) doFilter_disp_not_warn_NX(info);
		else if (nx == Filter_disp_start_log) doFilter_disp_start_log_NX(info);
		else if (nx == Filter_disp_data_log) doFilter_disp_data_log_NX(info);
		else if (nx == Filter_disp_proc_log) doFilter_disp_proc_log_NX(info);
		else if (nx == Filter_disp_end_log) doFilter_disp_end_log_NX(info);
		else if (nx == columnMsg_batch_log_typ) doMsg_batch_log_typ_NX(info);
		else if (nx == columnMsg_batch_log_typ_nm) doMsg_batch_log_typ_nm_NX(info);
		else if (nx == columnMsg_msg_id) doMsg_msg_id_NX(info);
		else if (nx == columnMsg_msg_txt) doMsg_msg_txt_NX(info);
		else if (nx == columnMsg_msg_lvl) doMsg_msg_lvl_NX(info);
		else if (nx == columnMsg_log_ts) doMsg_log_ts_NX(info);
		else if (nx == columnMsg_seq) doMsg_seq_NX(info);
		else if (nx == columnMsg_batch_log_no) doMsg_batch_log_no_NX(info);
		else if (nx == columnMsg_log_sub_key1) doMsg_log_sub_key1_NX(info);
		else if (nx == columnMsg_log_sub_key2) doMsg_log_sub_key2_NX(info);
		else if (nx == MsgArea_msg) doMsgArea_msg_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Msg]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_ok_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_ok_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_conv_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_conv_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[recv_conv_ok_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_recv_conv_ok_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sdrv_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sdrv_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char11_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char12_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char13_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char14_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char15_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char16_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char17_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char18_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char19_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char20_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char21_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char22_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char23_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char24_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char25_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char26_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char27_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char28_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char29_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char30_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_to_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[recv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_recv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_tm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conv_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conv_ope_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_io_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_io_ope_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_ope_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_clt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_clt_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char11_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char12_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char13_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char14_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char15_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char16_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char17_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char18_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char19_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char20_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char21]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char21_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char22]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char22_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char23]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char23_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char24]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char24_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char25]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char25_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char26]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char26_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char27]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char27_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char28]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char28_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char29]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char29_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char30]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char30_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key2_NX(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_warn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_warn_NX(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_not_warn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_not_warn_NX(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_start_log]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_start_log_NX(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_data_log]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_data_log_NX(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_proc_log]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_proc_log_NX(MCEventInfo info){
	}

	/**
	 * [Filter]パネルの[disp_end_log]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFilter_disp_end_log_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_id_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_txt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_txt_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_lvl_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_ts_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_seq_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key1_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key2_NX(MCEventInfo info){
	}

	/**
	 * [MsgArea]パネルの[msg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsgArea_msg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_if_proc_typ) doCnd_if_proc_typ_LC(info);
		else if (lc == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_LC(info);
		else if (lc == Cnd_data_no_fr) doCnd_data_no_fr_LC(info);
		else if (lc == Cnd_data_no_to) doCnd_data_no_to_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == Cnd_sdrv_tm_fr) doCnd_sdrv_tm_fr_LC(info);
		else if (lc == Cnd_sdrv_tm_to) doCnd_sdrv_tm_to_LC(info);
		else if (lc == Cnd_file_nm) doCnd_file_nm_LC(info);
		else if (lc == Cnd_batch_log_no) doCnd_batch_log_no_LC(info);
		else if (lc == Cnd_ins_srv_req_no) doCnd_ins_srv_req_no_LC(info);
		else if (lc == Cnd_attr_char1) doCnd_attr_char1_LC(info);
		else if (lc == Cnd_attr_char2) doCnd_attr_char2_LC(info);
		else if (lc == Cnd_attr_char3) doCnd_attr_char3_LC(info);
		else if (lc == Cnd_attr_char4) doCnd_attr_char4_LC(info);
		else if (lc == Cnd_attr_char5) doCnd_attr_char5_LC(info);
		else if (lc == Cnd_attr_char6) doCnd_attr_char6_LC(info);
		else if (lc == Cnd_attr_char7) doCnd_attr_char7_LC(info);
		else if (lc == Cnd_attr_char8) doCnd_attr_char8_LC(info);
		else if (lc == Cnd_attr_char9) doCnd_attr_char9_LC(info);
		else if (lc == Cnd_attr_char10) doCnd_attr_char10_LC(info);
		else if (lc == Cnd_attr_char11) doCnd_attr_char11_LC(info);
		else if (lc == Cnd_attr_char12) doCnd_attr_char12_LC(info);
		else if (lc == Cnd_attr_char13) doCnd_attr_char13_LC(info);
		else if (lc == Cnd_attr_char14) doCnd_attr_char14_LC(info);
		else if (lc == Cnd_attr_char15) doCnd_attr_char15_LC(info);
		else if (lc == Cnd_attr_char16) doCnd_attr_char16_LC(info);
		else if (lc == Cnd_attr_char17) doCnd_attr_char17_LC(info);
		else if (lc == Cnd_attr_char18) doCnd_attr_char18_LC(info);
		else if (lc == Cnd_attr_char19) doCnd_attr_char19_LC(info);
		else if (lc == Cnd_attr_char20) doCnd_attr_char20_LC(info);
		else if (lc == Cnd_attr_char21) doCnd_attr_char21_LC(info);
		else if (lc == Cnd_attr_char22) doCnd_attr_char22_LC(info);
		else if (lc == Cnd_attr_char23) doCnd_attr_char23_LC(info);
		else if (lc == Cnd_attr_char24) doCnd_attr_char24_LC(info);
		else if (lc == Cnd_attr_char25) doCnd_attr_char25_LC(info);
		else if (lc == Cnd_attr_char26) doCnd_attr_char26_LC(info);
		else if (lc == Cnd_attr_char27) doCnd_attr_char27_LC(info);
		else if (lc == Cnd_attr_char28) doCnd_attr_char28_LC(info);
		else if (lc == Cnd_attr_char29) doCnd_attr_char29_LC(info);
		else if (lc == Cnd_attr_char30) doCnd_attr_char30_LC(info);
		else if (lc == Cnd_attr_num1) doCnd_attr_num1_LC(info);
		else if (lc == Cnd_attr_num2) doCnd_attr_num2_LC(info);
		else if (lc == Cnd_attr_num3) doCnd_attr_num3_LC(info);
		else if (lc == Cnd_attr_num4) doCnd_attr_num4_LC(info);
		else if (lc == Cnd_attr_num5) doCnd_attr_num5_LC(info);
		else if (lc == Cnd_attr_dt1) doCnd_attr_dt1_LC(info);
		else if (lc == Cnd_attr_dt2) doCnd_attr_dt2_LC(info);
		else if (lc == Cnd_attr_dt3) doCnd_attr_dt3_LC(info);
		else if (lc == Cnd_attr_dt4) doCnd_attr_dt4_LC(info);
		else if (lc == Cnd_attr_dt5) doCnd_attr_dt5_LC(info);
		else if (lc == Cnd_attr_dt1_fr) doCnd_attr_dt1_fr_LC(info);
		else if (lc == Cnd_attr_dt1_to) doCnd_attr_dt1_to_LC(info);
		else if (lc == Cnd_attr_dt2_fr) doCnd_attr_dt2_fr_LC(info);
		else if (lc == Cnd_attr_dt2_to) doCnd_attr_dt2_to_LC(info);
		else if (lc == Cnd_attr_dt3_fr) doCnd_attr_dt3_fr_LC(info);
		else if (lc == Cnd_attr_dt3_to) doCnd_attr_dt3_to_LC(info);
		else if (lc == Cnd_attr_dt4_fr) doCnd_attr_dt4_fr_LC(info);
		else if (lc == Cnd_attr_dt4_to) doCnd_attr_dt4_to_LC(info);
		else if (lc == Cnd_attr_dt5_fr) doCnd_attr_dt5_fr_LC(info);
		else if (lc == Cnd_attr_dt5_to) doCnd_attr_dt5_to_LC(info);
		else if (lc == Cnd_attr_tm1_fr) doCnd_attr_tm1_fr_LC(info);
		else if (lc == Cnd_attr_tm1_to) doCnd_attr_tm1_to_LC(info);
		else if (lc == Cnd_attr_tm2_fr) doCnd_attr_tm2_fr_LC(info);
		else if (lc == Cnd_attr_tm2_to) doCnd_attr_tm2_to_LC(info);
		else if (lc == Cnd_attr_tm3_fr) doCnd_attr_tm3_fr_LC(info);
		else if (lc == Cnd_attr_tm3_to) doCnd_attr_tm3_to_LC(info);
		else if (lc == Cnd_attr_tm4_fr) doCnd_attr_tm4_fr_LC(info);
		else if (lc == Cnd_attr_tm4_to) doCnd_attr_tm4_to_LC(info);
		else if (lc == Cnd_attr_tm5_fr) doCnd_attr_tm5_fr_LC(info);
		else if (lc == Cnd_attr_tm5_to) doCnd_attr_tm5_to_LC(info);
		else if (lc == columnDtl_if_proc_typ) doDtl_if_proc_typ_LC(info);
		else if (lc == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_LC(info);
		else if (lc == columnDtl_data_no) doDtl_data_no_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_sdrv_sts_typ) doDtl_sdrv_sts_typ_LC(info);
		else if (lc == columnDtl_sdrv_sts_typ_nm) doDtl_sdrv_sts_typ_nm_LC(info);
		else if (lc == columnDtl_sdrv_tm) doDtl_sdrv_tm_LC(info);
		else if (lc == columnDtl_file_id) doDtl_file_id_LC(info);
		else if (lc == columnDtl_file_nm) doDtl_file_nm_LC(info);
		else if (lc == columnDtl_file_path) doDtl_file_path_LC(info);
		else if (lc == columnDtl_conv_ope) doDtl_conv_ope_LC(info);
		else if (lc == columnDtl_file_io_ope) doDtl_file_io_ope_LC(info);
		else if (lc == columnDtl_web_api_ope) doDtl_web_api_ope_LC(info);
		else if (lc == columnDtl_sdrv_clt_id) doDtl_sdrv_clt_id_LC(info);
		else if (lc == columnDtl_sdrv_usr_id) doDtl_sdrv_usr_id_LC(info);
		else if (lc == columnDtl_sdrv_usr_nm) doDtl_sdrv_usr_nm_LC(info);
		else if (lc == columnDtl_attr_char1) doDtl_attr_char1_LC(info);
		else if (lc == columnDtl_attr_char2) doDtl_attr_char2_LC(info);
		else if (lc == columnDtl_attr_char3) doDtl_attr_char3_LC(info);
		else if (lc == columnDtl_attr_char4) doDtl_attr_char4_LC(info);
		else if (lc == columnDtl_attr_char5) doDtl_attr_char5_LC(info);
		else if (lc == columnDtl_attr_char6) doDtl_attr_char6_LC(info);
		else if (lc == columnDtl_attr_char7) doDtl_attr_char7_LC(info);
		else if (lc == columnDtl_attr_char8) doDtl_attr_char8_LC(info);
		else if (lc == columnDtl_attr_char9) doDtl_attr_char9_LC(info);
		else if (lc == columnDtl_attr_char10) doDtl_attr_char10_LC(info);
		else if (lc == columnDtl_attr_char11) doDtl_attr_char11_LC(info);
		else if (lc == columnDtl_attr_char12) doDtl_attr_char12_LC(info);
		else if (lc == columnDtl_attr_char13) doDtl_attr_char13_LC(info);
		else if (lc == columnDtl_attr_char14) doDtl_attr_char14_LC(info);
		else if (lc == columnDtl_attr_char15) doDtl_attr_char15_LC(info);
		else if (lc == columnDtl_attr_char16) doDtl_attr_char16_LC(info);
		else if (lc == columnDtl_attr_char17) doDtl_attr_char17_LC(info);
		else if (lc == columnDtl_attr_char18) doDtl_attr_char18_LC(info);
		else if (lc == columnDtl_attr_char19) doDtl_attr_char19_LC(info);
		else if (lc == columnDtl_attr_char20) doDtl_attr_char20_LC(info);
		else if (lc == columnDtl_attr_char21) doDtl_attr_char21_LC(info);
		else if (lc == columnDtl_attr_char22) doDtl_attr_char22_LC(info);
		else if (lc == columnDtl_attr_char23) doDtl_attr_char23_LC(info);
		else if (lc == columnDtl_attr_char24) doDtl_attr_char24_LC(info);
		else if (lc == columnDtl_attr_char25) doDtl_attr_char25_LC(info);
		else if (lc == columnDtl_attr_char26) doDtl_attr_char26_LC(info);
		else if (lc == columnDtl_attr_char27) doDtl_attr_char27_LC(info);
		else if (lc == columnDtl_attr_char28) doDtl_attr_char28_LC(info);
		else if (lc == columnDtl_attr_char29) doDtl_attr_char29_LC(info);
		else if (lc == columnDtl_attr_char30) doDtl_attr_char30_LC(info);
		else if (lc == columnDtl_attr_num1) doDtl_attr_num1_LC(info);
		else if (lc == columnDtl_attr_num2) doDtl_attr_num2_LC(info);
		else if (lc == columnDtl_attr_num3) doDtl_attr_num3_LC(info);
		else if (lc == columnDtl_attr_num4) doDtl_attr_num4_LC(info);
		else if (lc == columnDtl_attr_num5) doDtl_attr_num5_LC(info);
		else if (lc == columnDtl_attr_dt1) doDtl_attr_dt1_LC(info);
		else if (lc == columnDtl_attr_dt2) doDtl_attr_dt2_LC(info);
		else if (lc == columnDtl_attr_dt3) doDtl_attr_dt3_LC(info);
		else if (lc == columnDtl_attr_dt4) doDtl_attr_dt4_LC(info);
		else if (lc == columnDtl_attr_dt5) doDtl_attr_dt5_LC(info);
		else if (lc == columnDtl_attr_tm1) doDtl_attr_tm1_LC(info);
		else if (lc == columnDtl_attr_tm2) doDtl_attr_tm2_LC(info);
		else if (lc == columnDtl_attr_tm3) doDtl_attr_tm3_LC(info);
		else if (lc == columnDtl_attr_tm4) doDtl_attr_tm4_LC(info);
		else if (lc == columnDtl_attr_tm5) doDtl_attr_tm5_LC(info);
		else if (lc == columnDtl_batch_log_no) doDtl_batch_log_no_LC(info);
		else if (lc == columnDtl_log_sub_key1) doDtl_log_sub_key1_LC(info);
		else if (lc == columnDtl_log_sub_key2) doDtl_log_sub_key2_LC(info);
		else if (lc == columnMsg_batch_log_typ) doMsg_batch_log_typ_LC(info);
		else if (lc == columnMsg_batch_log_typ_nm) doMsg_batch_log_typ_nm_LC(info);
		else if (lc == columnMsg_msg_id) doMsg_msg_id_LC(info);
		else if (lc == columnMsg_msg_txt) doMsg_msg_txt_LC(info);
		else if (lc == columnMsg_msg_lvl) doMsg_msg_lvl_LC(info);
		else if (lc == columnMsg_log_ts) doMsg_log_ts_LC(info);
		else if (lc == columnMsg_seq) doMsg_seq_LC(info);
		else if (lc == columnMsg_batch_log_no) doMsg_batch_log_no_LC(info);
		else if (lc == columnMsg_log_sub_key1) doMsg_log_sub_key1_LC(info);
		else if (lc == columnMsg_log_sub_key2) doMsg_log_sub_key2_LC(info);
	}

	/**
	 * [Cnd]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sdrv_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sdrv_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sdrv_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char11_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char12_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char13_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char14_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char15_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char16_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char17_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char18_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char19_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char20_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char21_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char22_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char23_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char24_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char25_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char26_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char27_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char28_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char29_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_char30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_char30_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_num5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_num5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt1_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt1_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt2_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt2_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt3_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt3_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt4_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt4_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_dt5_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_dt5_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm1_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm1_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm2_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm2_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm3_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm3_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm4_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm4_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[attr_tm5_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_attr_tm5_to_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_tm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conv_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conv_ope_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[file_io_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_file_io_ope_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[web_api_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_web_api_ope_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_clt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_clt_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sdrv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sdrv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char11_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char12_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char13_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char14_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char15_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char16_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char17_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char18_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char19_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char20_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char21]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char21_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char22]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char22_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char23]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char23_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char24]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char24_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char25]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char25_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char26]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char26_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char27]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char27_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char28]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char28_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char29]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char29_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_char30]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_char30_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_num5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_num5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_dt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_dt5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attr_tm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attr_tm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[log_sub_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_log_sub_key2_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_id_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_txt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_txt_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_lvl_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_ts_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_seq_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key1_LC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[log_sub_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_log_sub_key2_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_if_proc_typ]の作成メソッド
	 */
	public MCList getCnd_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ext_sys_cd]の作成メソッド
	 */
	public MCList getCnd_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSys(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnMsg_batch_log_typ]の作成メソッド
	 */
	public MCList getMsg_batch_log_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("PF.PFBZL0020.Srch01")) {
			return new PF_PFBZL0020_Srch01Bridge();
		}
		if (id.equals("PF.PFBZL0020.Srch02")) {
			return new PF_PFBZL0020_Srch02Bridge();
		}
		if (id.equals("PF.PFBZL0020.Conv01")) {
			return new PF_PFBZL0020_Conv01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [PF_PFBZL0020_Srch01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_PF_PFBZL0020_Srch01;

		/** コンストラクタ */
		protected PF_PFBZL0020_Srch01Bridge() {
			p_PF_PFBZL0020_Srch01 = new MCParam(PDef.PF_PFBZL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.PF_PFBZL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientPFBZ.PFBZP0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientPFBZ.PFBZP0020.DtlR.class));

			p_PF_PFBZL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_PF_PFBZL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_PF_PFBZL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_PF_PFBZL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_PF_PFBZL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientPFBZ.PFBZP0020.CndR up0() {
			return (mcframe.clientPFBZ.PFBZP0020.CndR)up(0);
		}

		protected MCList<mcframe.clientPFBZ.PFBZP0020.DtlR> down0() {
			return (MCList<mcframe.clientPFBZ.PFBZP0020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_PF_PFBZL0020_Srch01.addDownBlock(MCList.create(mcframe.clientPFBZ.PFBZP0020.DtlR.class));
		}
		protected MCParam param() {
			return p_PF_PFBZL0020_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientPFBZ.PFBZP0020.DtlR>)p_PF_PFBZL0020_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [PF_PFBZL0020_Srch02]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0020_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_PF_PFBZL0020_Srch02;

		/** コンストラクタ */
		protected PF_PFBZL0020_Srch02Bridge() {
			p_PF_PFBZL0020_Srch02 = new MCParam(PDef.PF_PFBZL0020_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.PF_PFBZL0020_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.class));

			p_PF_PFBZL0020_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_PF_PFBZL0020_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_PF_PFBZL0020_Srch02.addUpBlock(getBatchLogKeyL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_PF_PFBZL0020_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_PF_PFBZL0020_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR> up0() {
			return (MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogKeyR>)up(0);
		}

		protected MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR> down0() {
			return (MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR>)down(0);
		}

		protected void setupDownParam() {
			p_PF_PFBZL0020_Srch02.addDownBlock(MCList.create(mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR.class));
		}
		protected MCParam param() {
			return p_PF_PFBZL0020_Srch02;
		}

		protected void show() {
			setBatchLogMsgL((MCList<mcframe.clientPFBZ.PFBZP0020.BatchLogMsgR>)p_PF_PFBZL0020_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getBatchLogMsgL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBatchLogKeyL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getBatchLogMsgL());
			return result;
		}
	}
	/**
	 * [PF_PFBZL0020_Conv01]の定型処理のInnerClass
	 */
	protected class PF_PFBZL0020_Conv01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_PF_PFBZL0020_Conv01;

		/** コンストラクタ */
		protected PF_PFBZL0020_Conv01Bridge() {
			p_PF_PFBZL0020_Conv01 = new MCParam(PDef.PF_PFBZL0020_Conv01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.PF_PFBZL0020_Conv01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientPFBZ.PFBZP0020.DtlR.class));
			// Down

			p_PF_PFBZL0020_Conv01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_PF_PFBZL0020_Conv01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_PF_PFBZL0020_Conv01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_PF_PFBZL0020_Conv01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_PF_PFBZL0020_Conv01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientPFBZ.PFBZP0020.DtlR> up0() {
			return (MCList<mcframe.clientPFBZ.PFBZP0020.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_PF_PFBZL0020_Conv01;
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