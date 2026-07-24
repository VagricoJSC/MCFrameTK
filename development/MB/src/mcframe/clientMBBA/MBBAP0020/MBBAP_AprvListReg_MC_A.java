package mcframe.clientMBBA.MBBAP0020;

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
import mcframe.clientMBBA.MBBAP0020.MBBAP_AprvListReg_MC.MB_MBBAL0020_Srch01Caller;
import mcframe.clientMBBA.MBBAP0020.MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd01Caller;
import mcframe.clientMBBA.MBBAP0020.MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd02Caller;
import mcframe.clientMBBA.MBBAP0020.MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd03Caller;

/**
 * 画面"MBBAP_AprvListReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBAP_AprvListReg_MC_A extends mcframe.clientMBUD.MBUDP0010.MBUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MBBA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBAP0020";

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
	 * 0,Approve/Reject;1,Cancel (Approval);2,Cancel (Reject);3,Update (Remarks);4,View 0,承認・却下する;1,取り消す（承認）;2,取り消す（却下）;3,更新する（備考）;4,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_0 = null;
	public MCRadioButton Cnd_ope_1 = null;
	public MCRadioButton Cnd_ope_2 = null;
	public MCRadioButton Cnd_ope_3 = null;
	public MCRadioButton Cnd_ope_4 = null;
	public MCLabel Cnd_aprv_func_typ_Label = null;
	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_aprv_func_typ = null;
	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_func_typ_nm = null;
	public MCLabel Cnd_aprv_d_sts_typ_Label = null;
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_aprv_d_sts_typ = null;
	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_d_sts_typ_nm = null;
	public MCLabel Cnd_aprv_no_Label = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_aprv_no = null;
	public MCLabel Cnd_aprv_src_no1_Label = null;
	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public MCTextField Cnd_aprv_src_no1 = null;
	public MCLabel Cnd_aprv_src_no2_Label = null;
	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public MCTextField Cnd_aprv_src_no2 = null;
	public MCLabel Cnd_ins_dt_fr_Label = null;
	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ins_dt_fr = null;
	public MCLabel Cnd_ins_dt_to_Label = null;
	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ins_dt_to = null;
	public MCLabel Cnd_aprv_d_tm_fr_Label = null;
	/**
	 * Approval date and time FROM 承認日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_d_tm_fr = null;
	public MCLabel Cnd_aprv_d_tm_to_Label = null;
	/**
	 * Approval date and time TO 承認日時ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_d_tm_to = null;
	public MCLabel Cnd_ins_biz_usr_cd_Label = null;
	/**
	 * Entry/business PIC cd. 登録／業務担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ins_biz_usr_cd = null;
	/**
	 * Entry/business PIC name 登録／業務担当者名.<p>
	 *
	 */
	public MCTextField Cnd_ins_biz_usr_nm = null;
	public MCLabel Cnd_aprv_usr_cd_Label = null;
	/**
	 * Approver cd. 承認担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_aprv_usr_cd = null;
	/**
	 * Approver name 承認担当者名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_usr_nm = null;
	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public MCCheckBox Cnd_main_role_flg = null;
	/**
	 * Sub PIC 副担当.<p>
	 *
	 */
	public MCCheckBox Cnd_sub_role_flg = null;
	/**
	 * Include next completed process 次処理済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_next_opr_flg = null;
	/**
	 * Include not updatable 更新不可含む.<p>
	 *
	 */
	public MCCheckBox Cnd_not_upd_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Body]ブロック関連のField定義
	public MCPanel BodyPanel = null;
	// [Body]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMBBA.MBBAP0020.DtlR> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_check = null;
	/**
	 * Approval 承認.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_acpt_check = null;
	/**
	 * Reject 却下.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rjct_check = null;
	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_func_typ = null;
	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_func_typ_nm = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_no = null;
	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_no_seq = null;
	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_src_no1 = null;
	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_src_no2 = null;
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_d_sts_typ = null;
	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_d_sts_typ_nm = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_sts_typ_nm = null;
	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_main_role_flg = null;
	/**
	 * Sub PIC 副担当.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_role_flg = null;
	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_d_rmrks_up = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char1_up = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char2_up = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char3_up = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_dt = null;
	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_ins_usr_cd = null;
	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_ins_usr_nm = null;
	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_biz_usr_cd = null;
	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_biz_usr_nm = null;
	/**
	 * Approval creating source dept. cd. 承認作成元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_dpt_cd = null;
	/**
	 * Approval creating source dept. name 承認作成元部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_dpt_nm = null;
	/**
	 * Approval creating source customer cd. 承認作成元取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_bp_cd = null;
	/**
	 * Approval creating source BP name 承認作成元取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_bp_nm = null;
	/**
	 * Approval creating source base currency cd. 1 承認作成元通貨ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_cur_cd1 = null;
	/**
	 * Approval creating source currency name 1 承認作成元通貨名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_cur_nm1 = null;
	/**
	 * Approval creating source amount 1 承認作成元金額１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_amt1 = null;
	/**
	 * Approval creating source base currency cd. 2 承認作成元通貨ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_cur_cd2 = null;
	/**
	 * Approval creating source currency name 2 承認作成元通貨名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_cur_nm2 = null;
	/**
	 * Approval creating source amount 2 承認作成元金額２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_amt2 = null;
	/**
	 * Approval creating source base currency cd. 3 承認作成元通貨ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_cur_cd3 = null;
	/**
	 * Approval creating currency name 3 承認作成元通貨名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_cur_nm3 = null;
	/**
	 * Approval created-from amount 3 承認作成元金額３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_amt3 = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl1_itm_p_PPanel;
	public MCColumnConfig columnDtl1_src_itm_cd;// [Dtl1]の[itm_p.itm_cd]を[columnDtl1_src_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_src_itm_sub1;// [Dtl1]の[itm_p.itm_sub1]を[columnDtl1_src_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_src_itm_sub2;// [Dtl1]の[itm_p.itm_sub2]を[columnDtl1_src_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_src_itm_sub3;// [Dtl1]の[itm_p.itm_sub3]を[columnDtl1_src_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_src_itm_nm;// [Dtl1]の[itm_p.itm_nm]を[columnDtl1_src_itm_nm]としてエイリアス定義。
	/**
	 * Approval creating source extended column 1 承認作成元拡張項目１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_ext_key1 = null;
	/**
	 * Approval creating source extended column 2 承認作成元拡張項目２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_ext_key2 = null;
	/**
	 * Approval created-from expanded column 3 承認作成元拡張項目３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_src_ext_key3 = null;
	/**
	 * Next completed process 次処理済.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_next_opr_flg = null;
	/**
	 * Not updatable 更新不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_not_upd_flg = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl1_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl1_rtn_sts_typ;// [Dtl1]の[rts_msg_p.rtn_sts_typ]を[columnDtl1_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_cntr = null;
	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_usr_cd = null;
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_d_sts_typ_up = null;
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_aprv_role_cd = null;
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMBBA.MBBAP0020.DtlR> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Approved sequence 承認順序.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_seq = null;
	/**
	 * Main PIC cd. 主担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_usr_cd = null;
	/**
	 * Main PIC name 主担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_usr_nm = null;
	/**
	 * Approval details status type 承認明細状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_d_sts_typ = null;
	/**
	 * Approval details status type name 承認明細状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_d_sts_typ_nm = null;
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_d_tm = null;
	/**
	 * Alternate approval 代理承認.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_deputy_flg = null;
	/**
	 * Alternate approver cd. 代理承認者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_deputy_usr_cd = null;
	/**
	 * Alternate approver name 代理承認者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_deputy_usr_nm = null;
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_role_cd = null;
	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_role_nm = null;
	/**
	 * Approval details remarks 承認明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_d_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_detail = null;
	/**
	 * Approve all 全承認.<p>
	 *
	 */
	public MCButton Btn_acpt_all = null;
	/**
	 * Reject all 全却下.<p>
	 *
	 */
	public MCButton Btn_rjct_all = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_acpt = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_upd_acpt_del = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_upd_rjct_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_ACPT]モードを表す定数 */
	public static final String SRCH_ACPT = "SRCH_ACPT";
	/** [SRCH_ACPT_CAN]モードを表す定数 */
	public static final String SRCH_ACPT_CAN = "SRCH_ACPT_CAN";
	/** [SRCH_RJCT_CAN]モードを表す定数 */
	public static final String SRCH_RJCT_CAN = "SRCH_RJCT_CAN";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD_ACPT]モードを表す定数 */
	public static final String UPD_ACPT = "UPD_ACPT";
	/** [UPD_ACPT_CAN]モードを表す定数 */
	public static final String UPD_ACPT_CAN = "UPD_ACPT_CAN";
	/** [UPD_RJCT_CAN]モードを表す定数 */
	public static final String UPD_RJCT_CAN = "UPD_RJCT_CAN";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_U_ACPT]モードを表す定数 */
	public static final String FIX_U_ACPT = "FIX_U_ACPT";
	/** [FIX_U_ACPT_CAN]モードを表す定数 */
	public static final String FIX_U_ACPT_CAN = "FIX_U_ACPT_CAN";
	/** [FIX_U_RJCT_CAN]モードを表す定数 */
	public static final String FIX_U_RJCT_CAN = "FIX_U_RJCT_CAN";
	/** [FIX_U_UPD]モードを表す定数 */
	public static final String FIX_U_UPD = "FIX_U_UPD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_ACPT, SRCH_ACPT_CAN, SRCH_RJCT_CAN, SRCH_UPD, SRCH, UPD_ACPT, UPD_ACPT_CAN, UPD_RJCT_CAN, UPD, REF, FIX_U_ACPT, FIX_U_ACPT_CAN, FIX_U_RJCT_CAN, FIX_U_UPD};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MB_MBBAL0020_Srch01]のCallerの作成 */
	protected MBBAP_AprvListReg_MC.MB_MBBAL0020_Srch01Caller createMB_MBBAL0020_Srch01() {
		MBBAP_AprvListReg_MC.MB_MBBAL0020_Srch01Caller<MBBAP_AprvListReg, MB_MBBAL0020_Srch01Bridge>
		caller = ((MBBAP_AprvListReg_MC)this).new MB_MBBAL0020_Srch01Caller<MBBAP_AprvListReg, MB_MBBAL0020_Srch01Bridge>(
					(MBBAP_AprvListReg)this, new MB_MBBAL0020_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBAL0020_Srch01]の呼び出し */
	protected void callMB_MBBAL0020_Srch01() {
		MCCaller caller = createMB_MBBAL0020_Srch01();
		caller.exec();
	}
	/** [MB_MBBAL0020_Upd01]のCallerの作成 */
	protected MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd01Caller createMB_MBBAL0020_Upd01() {
		MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd01Caller<MBBAP_AprvListReg, MB_MBBAL0020_Upd01Bridge>
		caller = ((MBBAP_AprvListReg_MC)this).new MB_MBBAL0020_Upd01Caller<MBBAP_AprvListReg, MB_MBBAL0020_Upd01Bridge>(
					(MBBAP_AprvListReg)this, new MB_MBBAL0020_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBAL0020_Upd01]の呼び出し */
	protected void callMB_MBBAL0020_Upd01() {
		MCCaller caller = createMB_MBBAL0020_Upd01();
		caller.exec();
	}
	/** [MB_MBBAL0020_Upd02]のCallerの作成 */
	protected MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd02Caller createMB_MBBAL0020_Upd02() {
		MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd02Caller<MBBAP_AprvListReg, MB_MBBAL0020_Upd02Bridge>
		caller = ((MBBAP_AprvListReg_MC)this).new MB_MBBAL0020_Upd02Caller<MBBAP_AprvListReg, MB_MBBAL0020_Upd02Bridge>(
					(MBBAP_AprvListReg)this, new MB_MBBAL0020_Upd02Bridge());
		return caller;
	}
	/** [MB_MBBAL0020_Upd02]の呼び出し */
	protected void callMB_MBBAL0020_Upd02() {
		MCCaller caller = createMB_MBBAL0020_Upd02();
		caller.exec();
	}
	/** [MB_MBBAL0020_Upd03]のCallerの作成 */
	protected MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd03Caller createMB_MBBAL0020_Upd03() {
		MBBAP_AprvListReg_MC.MB_MBBAL0020_Upd03Caller<MBBAP_AprvListReg, MB_MBBAL0020_Upd03Bridge>
		caller = ((MBBAP_AprvListReg_MC)this).new MB_MBBAL0020_Upd03Caller<MBBAP_AprvListReg, MB_MBBAL0020_Upd03Bridge>(
					(MBBAP_AprvListReg)this, new MB_MBBAL0020_Upd03Bridge());
		return caller;
	}
	/** [MB_MBBAL0020_Upd03]の呼び出し */
	protected void callMB_MBBAL0020_Upd03() {
		MCCaller caller = createMB_MBBAL0020_Upd03();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBA.MBBAP0020.CndR aCndR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBA.MBBAP0020.DtlR> aDtl1L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBA.MBBAP0020.DtlR> aDtl2L;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBA.MBBAP0020.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBA.MBBAP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBA.MBBAP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBA.MBBAP0020.CndR createCndR() {
		return mcframe.clientMBBA.MBBAP0020.CndR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMBBA.MBBAP0020.DtlR> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMBBA.MBBAP0020.DtlR> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMBBA.MBBAP0020.DtlR createDtl1R() {
		return mcframe.clientMBBA.MBBAP0020.DtlR.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMBBA.MBBAP0020.DtlR> createDtl1L() {
		return MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class);
	}

	/**
	 * Dtl1Tableを初期化します。
	 */
	protected void createDtl1Table(){
		if(Dtl1Table == null){
			Dtl1Table = beansFactory.createTable2("Dtl1.table");
		}
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMBBA.MBBAP0020.DtlR> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMBBA.MBBAP0020.DtlR> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMBBA.MBBAP0020.DtlR createDtl2R() {
		return mcframe.clientMBBA.MBBAP0020.DtlR.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMBBA.MBBAP0020.DtlR> createDtl2L() {
		return MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class);
	}

	/**
	 * Dtl2Tableを初期化します。
	 */
	protected void createDtl2Table(){
		if(Dtl2Table == null){
			Dtl2Table = beansFactory.createTable2("Dtl2.table");
		}
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMBBA.MBBAP0020.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBA.MBBAP0020.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMBBA.MBBAP0020.DtlR createDtlR() {
		return mcframe.clientMBBA.MBBAP0020.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBA.MBBAP0020.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(BodyPanel);
		ret.add(Dtl1Panel);
		ret.add(Dtl2Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBAP_AprvListReg_MC_A() {
		aCndR = createCndR();
		aDtl1L = createDtl1L();
		aDtl2L = createDtl2L();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBAP_AprvListReg_MC_A(String name) {
		aCndR = createCndR();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
		aDtlL = createDtlL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBAP_AprvListReg_MC.jbCreateScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateTop((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateFold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateCnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateCtrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateBody((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateDtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateDtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateBtn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbCreateEastBtn((MBBAP_AprvListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBAP_AprvListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBAP_AprvListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBAP_AprvListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBAP_AprvListReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBAP_AprvListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Body]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBody(MBBAP_AprvListReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MBBAP_AprvListReg p) {
		p.Dtl1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMBBA.MBBAP0020.DtlR.$itm_p);
		p.Dtl1_itm_p_PPanel.setName("Dtl1.itm_p");
		p.columnDtl1_src_itm_cd = p.Dtl1_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl1_src_itm_cd.addAliasName("Dtl1.src_itm_cd", p);
		p.columnDtl1_src_itm_sub1 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl1_src_itm_sub1.addAliasName("Dtl1.src_itm_sub1", p);
		p.columnDtl1_src_itm_sub2 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl1_src_itm_sub2.addAliasName("Dtl1.src_itm_sub2", p);
		p.columnDtl1_src_itm_sub3 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl1_src_itm_sub3.addAliasName("Dtl1.src_itm_sub3", p);
		p.columnDtl1_src_itm_nm = p.Dtl1_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl1_src_itm_nm.addAliasName("Dtl1.src_itm_nm", p);
		p.Dtl1_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMBBA.MBBAP0020.DtlR.$rts_msg_p);
		p.Dtl1_rts_msg_p_PPanel.setName("Dtl1.rts_msg_p");
		p.columnDtl1_rtn_sts_typ = p.Dtl1_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl1_rtn_sts_typ.addAliasName("Dtl1.rtn_sts_typ", p);
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MBBAP_AprvListReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBAP_AprvListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MBBAP_AprvListReg p) {
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

	
	/** [Cnd_aprv_func_typ_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_func_typ_p = null;

	/**
	 * [Cnd_aprv_func_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_func_typ_ListPutter() {
		if (Cnd_aprv_func_typ_p == null) {
			Cnd_aprv_func_typ_p = createCnd_aprv_func_typ_ListPutter(Cnd_aprv_func_typ, "aprv_func_typ", "aprv_func_typ_nm");

		}
		return Cnd_aprv_func_typ_p;
	}
	
	
	/** [Cnd_aprv_d_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_d_sts_typ_p = null;

	/**
	 * [Cnd_aprv_d_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_d_sts_typ_ListPutter() {
		if (Cnd_aprv_d_sts_typ_p == null) {
			Cnd_aprv_d_sts_typ_p = createCnd_aprv_d_sts_typ_ListPutter(Cnd_aprv_d_sts_typ, "aprv_d_sts_typ", "aprv_d_sts_typ_nm");

		}
		return Cnd_aprv_d_sts_typ_p;
	}
	
	
	/** [Cnd_ins_biz_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ins_biz_usr_cd_p = null;

	/**
	 * [Cnd_ins_biz_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ins_biz_usr_cd_ListPutter() {
		if (Cnd_ins_biz_usr_cd_p == null) {
			Cnd_ins_biz_usr_cd_p = createCnd_ins_biz_usr_cd_ListPutter(Cnd_ins_biz_usr_cd, "ins_biz_usr_cd", "ins_biz_usr_nm");

		}
		return Cnd_ins_biz_usr_cd_p;
	}
	
	
	/** [Cnd_aprv_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_usr_cd_p = null;

	/**
	 * [Cnd_aprv_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_usr_cd_ListPutter() {
		if (Cnd_aprv_usr_cd_p == null) {
			Cnd_aprv_usr_cd_p = createCnd_aprv_usr_cd_ListPutter(Cnd_aprv_usr_cd, "aprv_usr_cd", "aprv_usr_nm");

		}
		return Cnd_aprv_usr_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBAP_AprvListReg create(){
		MBBAP_AprvListReg p = new MBBAP_AprvListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBAP_AprvListReg create(String name){
		MBBAP_AprvListReg p = new MBBAP_AprvListReg(name);
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
		MBBAP_AprvListReg_MC.jbfInitScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitTop((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitFold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitCnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitCtrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitBody((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitDtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitDtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitBtn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbfInitEastBtn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitTop((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitFold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitCnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitCtrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitBody((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitDtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitDtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitBtn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.jbInitEastBtn((MBBAP_AprvListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_0 = p.beansFactory.createRadioButton("Cnd.ope_0");
		p.Cnd_ope_1 = p.beansFactory.createRadioButton("Cnd.ope_1");
		p.Cnd_ope_2 = p.beansFactory.createRadioButton("Cnd.ope_2");
		p.Cnd_ope_3 = p.beansFactory.createRadioButton("Cnd.ope_3");
		p.Cnd_ope_4 = p.beansFactory.createRadioButton("Cnd.ope_4");
		p.Cnd_aprv_func_typ_Label = p.beansFactory.createLabel("Cnd.aprv_func_typ_Label");
		p.Cnd_aprv_func_typ = p.beansFactory.createTextComboBox("Cnd.aprv_func_typ");
		p.Cnd_aprv_func_typ.setLabel(p.Cnd_aprv_func_typ_Label);
		p.Cnd_aprv_func_typ_nm = p.beansFactory.createTextField("Cnd.aprv_func_typ_nm");
		p.Cnd_aprv_d_sts_typ_Label = p.beansFactory.createLabel("Cnd.aprv_d_sts_typ_Label");
		p.Cnd_aprv_d_sts_typ = p.beansFactory.createTextComboBox("Cnd.aprv_d_sts_typ");
		p.Cnd_aprv_d_sts_typ.setLabel(p.Cnd_aprv_d_sts_typ_Label);
		p.Cnd_aprv_d_sts_typ_nm = p.beansFactory.createTextField("Cnd.aprv_d_sts_typ_nm");
		p.Cnd_aprv_no_Label = p.beansFactory.createLabel("Cnd.aprv_no_Label");
		p.Cnd_aprv_no = p.beansFactory.createTextField("Cnd.aprv_no");
		p.Cnd_aprv_no.setLabel(p.Cnd_aprv_no_Label);
		p.Cnd_aprv_src_no1_Label = p.beansFactory.createLabel("Cnd.aprv_src_no1_Label");
		p.Cnd_aprv_src_no1 = p.beansFactory.createTextField("Cnd.aprv_src_no1");
		p.Cnd_aprv_src_no1.setLabel(p.Cnd_aprv_src_no1_Label);
		p.Cnd_aprv_src_no2_Label = p.beansFactory.createLabel("Cnd.aprv_src_no2_Label");
		p.Cnd_aprv_src_no2 = p.beansFactory.createTextField("Cnd.aprv_src_no2");
		p.Cnd_aprv_src_no2.setLabel(p.Cnd_aprv_src_no2_Label);
		p.Cnd_ins_dt_fr_Label = p.beansFactory.createLabel("Cnd.ins_dt_fr_Label");
		p.Cnd_ins_dt_fr = p.beansFactory.createDateField("Cnd.ins_dt_fr");
		p.Cnd_ins_dt_fr.setLabel(p.Cnd_ins_dt_fr_Label);
		p.Cnd_ins_dt_to_Label = p.beansFactory.createLabel("Cnd.ins_dt_to_Label");
		p.Cnd_ins_dt_to = p.beansFactory.createDateField("Cnd.ins_dt_to");
		p.Cnd_ins_dt_to.setLabel(p.Cnd_ins_dt_to_Label);
		p.Cnd_aprv_d_tm_fr_Label = p.beansFactory.createLabel("Cnd.aprv_d_tm_fr_Label");
		p.Cnd_aprv_d_tm_fr = p.beansFactory.createDateField("Cnd.aprv_d_tm_fr");
		p.Cnd_aprv_d_tm_fr.setLabel(p.Cnd_aprv_d_tm_fr_Label);
		p.Cnd_aprv_d_tm_to_Label = p.beansFactory.createLabel("Cnd.aprv_d_tm_to_Label");
		p.Cnd_aprv_d_tm_to = p.beansFactory.createDateField("Cnd.aprv_d_tm_to");
		p.Cnd_aprv_d_tm_to.setLabel(p.Cnd_aprv_d_tm_to_Label);
		p.Cnd_ins_biz_usr_cd_Label = p.beansFactory.createLabel("Cnd.ins_biz_usr_cd_Label");
		p.Cnd_ins_biz_usr_cd = p.beansFactory.createTextField("Cnd.ins_biz_usr_cd");
		p.Cnd_ins_biz_usr_cd.setLabel(p.Cnd_ins_biz_usr_cd_Label);
		p.Cnd_ins_biz_usr_nm = p.beansFactory.createTextField("Cnd.ins_biz_usr_nm");
		p.Cnd_aprv_usr_cd_Label = p.beansFactory.createLabel("Cnd.aprv_usr_cd_Label");
		p.Cnd_aprv_usr_cd = p.beansFactory.createTextField("Cnd.aprv_usr_cd");
		p.Cnd_aprv_usr_cd.setLabel(p.Cnd_aprv_usr_cd_Label);
		p.Cnd_aprv_usr_nm = p.beansFactory.createTextField("Cnd.aprv_usr_nm");
		p.Cnd_main_role_flg = p.beansFactory.createCheckBox("Cnd.main_role_flg");
		p.Cnd_sub_role_flg = p.beansFactory.createCheckBox("Cnd.sub_role_flg");
		p.Cnd_next_opr_flg = p.beansFactory.createCheckBox("Cnd.next_opr_flg");
		p.Cnd_not_upd_flg = p.beansFactory.createCheckBox("Cnd.not_upd_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Body]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBody(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.BodyPanel = p.beansFactory.createPanel("Body");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_check = p.beansFactory.createTableColumn("Dtl1.check", MCColumnType.CHECK);
		p.columnDtl1_acpt_check = p.beansFactory.createTableColumn("Dtl1.acpt_check", MCColumnType.CHECK);
		p.columnDtl1_rjct_check = p.beansFactory.createTableColumn("Dtl1.rjct_check", MCColumnType.CHECK);
		p.columnDtl1_aprv_func_typ = p.beansFactory.createTableColumn("Dtl1.aprv_func_typ", MCColumnType.TEXT);
		p.columnDtl1_aprv_func_typ_nm = p.beansFactory.createTableColumn("Dtl1.aprv_func_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_aprv_no = p.beansFactory.createTableColumn("Dtl1.aprv_no", MCColumnType.TEXT);
		p.columnDtl1_aprv_no_seq = p.beansFactory.createTableColumn("Dtl1.aprv_no_seq", MCColumnType.NUMBER);
		p.columnDtl1_aprv_src_no1 = p.beansFactory.createTableColumn("Dtl1.aprv_src_no1", MCColumnType.TEXT);
		p.columnDtl1_aprv_src_no2 = p.beansFactory.createTableColumn("Dtl1.aprv_src_no2", MCColumnType.TEXT);
		p.columnDtl1_aprv_d_sts_typ = p.beansFactory.createTableColumn("Dtl1.aprv_d_sts_typ", MCColumnType.TEXT);
		p.columnDtl1_aprv_d_sts_typ_nm = p.beansFactory.createTableColumn("Dtl1.aprv_d_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_aprv_sts_typ = p.beansFactory.createTableColumn("Dtl1.aprv_sts_typ", MCColumnType.TEXT);
		p.columnDtl1_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Dtl1.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_main_role_flg = p.beansFactory.createTableColumn("Dtl1.main_role_flg", MCColumnType.CHECK);
		p.columnDtl1_sub_role_flg = p.beansFactory.createTableColumn("Dtl1.sub_role_flg", MCColumnType.CHECK);
		p.columnDtl1_aprv_d_rmrks_up = p.beansFactory.createTableColumn("Dtl1.aprv_d_rmrks_up", MCColumnType.TEXT);
		p.columnDtl1_sub_char1_up = p.beansFactory.createTableColumn("Dtl1.sub_char1_up", MCColumnType.TEXT);
		p.columnDtl1_sub_char2_up = p.beansFactory.createTableColumn("Dtl1.sub_char2_up", MCColumnType.TEXT);
		p.columnDtl1_sub_char3_up = p.beansFactory.createTableColumn("Dtl1.sub_char3_up", MCColumnType.TEXT);
		p.columnDtl1_ins_dt = p.beansFactory.createTableColumn("Dtl1.ins_dt", MCColumnType.DATE);
		p.columnDtl1_src_ins_usr_cd = p.beansFactory.createTableColumn("Dtl1.src_ins_usr_cd", MCColumnType.TEXT);
		p.columnDtl1_src_ins_usr_nm = p.beansFactory.createTableColumn("Dtl1.src_ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_biz_usr_cd = p.beansFactory.createTableColumn("Dtl1.biz_usr_cd", MCColumnType.TEXT);
		p.columnDtl1_biz_usr_nm = p.beansFactory.createTableColumn("Dtl1.biz_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_src_dpt_cd = p.beansFactory.createTableColumn("Dtl1.src_dpt_cd", MCColumnType.TEXT);
		p.columnDtl1_src_dpt_nm = p.beansFactory.createTableColumn("Dtl1.src_dpt_nm", MCColumnType.TEXT);
		p.columnDtl1_src_bp_cd = p.beansFactory.createTableColumn("Dtl1.src_bp_cd", MCColumnType.TEXT);
		p.columnDtl1_src_bp_nm = p.beansFactory.createTableColumn("Dtl1.src_bp_nm", MCColumnType.TEXT);
		p.columnDtl1_src_cur_cd1 = p.beansFactory.createTableColumn("Dtl1.src_cur_cd1", MCColumnType.TEXT);
		p.columnDtl1_src_cur_nm1 = p.beansFactory.createTableColumn("Dtl1.src_cur_nm1", MCColumnType.TEXT);
		p.columnDtl1_src_amt1 = p.beansFactory.createTableColumn("Dtl1.src_amt1", MCColumnType.NUMBER);
		p.columnDtl1_src_cur_cd2 = p.beansFactory.createTableColumn("Dtl1.src_cur_cd2", MCColumnType.TEXT);
		p.columnDtl1_src_cur_nm2 = p.beansFactory.createTableColumn("Dtl1.src_cur_nm2", MCColumnType.TEXT);
		p.columnDtl1_src_amt2 = p.beansFactory.createTableColumn("Dtl1.src_amt2", MCColumnType.NUMBER);
		p.columnDtl1_src_cur_cd3 = p.beansFactory.createTableColumn("Dtl1.src_cur_cd3", MCColumnType.TEXT);
		p.columnDtl1_src_cur_nm3 = p.beansFactory.createTableColumn("Dtl1.src_cur_nm3", MCColumnType.TEXT);
		p.columnDtl1_src_amt3 = p.beansFactory.createTableColumn("Dtl1.src_amt3", MCColumnType.NUMBER);
		p.columnDtl1_src_ext_key1 = p.beansFactory.createTableColumn("Dtl1.src_ext_key1", MCColumnType.TEXT);
		p.columnDtl1_src_ext_key2 = p.beansFactory.createTableColumn("Dtl1.src_ext_key2", MCColumnType.TEXT);
		p.columnDtl1_src_ext_key3 = p.beansFactory.createTableColumn("Dtl1.src_ext_key3", MCColumnType.TEXT);
		p.columnDtl1_next_opr_flg = p.beansFactory.createTableColumn("Dtl1.next_opr_flg", MCColumnType.CHECK);
		p.columnDtl1_not_upd_flg = p.beansFactory.createTableColumn("Dtl1.not_upd_flg", MCColumnType.CHECK);
		p.columnDtl1_upd_cntr = p.beansFactory.createTableColumn("Dtl1.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl1_aprv_usr_cd = p.beansFactory.createTableColumn("Dtl1.aprv_usr_cd", MCColumnType.TEXT);
		p.columnDtl1_aprv_d_sts_typ_up = p.beansFactory.createTableColumn("Dtl1.aprv_d_sts_typ_up", MCColumnType.TEXT);
		p.columnDtl1_aprv_role_cd = p.beansFactory.createTableColumn("Dtl1.aprv_role_cd", MCColumnType.TEXT);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_aprv_seq = p.beansFactory.createTableColumn("Dtl2.aprv_seq", MCColumnType.NUMBER);
		p.columnDtl2_aprv_usr_cd = p.beansFactory.createTableColumn("Dtl2.aprv_usr_cd", MCColumnType.TEXT);
		p.columnDtl2_aprv_usr_nm = p.beansFactory.createTableColumn("Dtl2.aprv_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_aprv_d_sts_typ = p.beansFactory.createTableColumn("Dtl2.aprv_d_sts_typ", MCColumnType.TEXT);
		p.columnDtl2_aprv_d_sts_typ_nm = p.beansFactory.createTableColumn("Dtl2.aprv_d_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_aprv_d_tm = p.beansFactory.createTableColumn("Dtl2.aprv_d_tm", MCColumnType.DATE);
		p.columnDtl2_deputy_flg = p.beansFactory.createTableColumn("Dtl2.deputy_flg", MCColumnType.CHECK);
		p.columnDtl2_deputy_usr_cd = p.beansFactory.createTableColumn("Dtl2.deputy_usr_cd", MCColumnType.TEXT);
		p.columnDtl2_deputy_usr_nm = p.beansFactory.createTableColumn("Dtl2.deputy_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_aprv_role_cd = p.beansFactory.createTableColumn("Dtl2.aprv_role_cd", MCColumnType.TEXT);
		p.columnDtl2_aprv_role_nm = p.beansFactory.createTableColumn("Dtl2.aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl2_aprv_d_rmrks = p.beansFactory.createTableColumn("Dtl2.aprv_d_rmrks", MCColumnType.TEXT);
		p.columnDtl2_sub_char1 = p.beansFactory.createTableColumn("Dtl2.sub_char1", MCColumnType.TEXT);
		p.columnDtl2_sub_char2 = p.beansFactory.createTableColumn("Dtl2.sub_char2", MCColumnType.TEXT);
		p.columnDtl2_sub_char3 = p.beansFactory.createTableColumn("Dtl2.sub_char3", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_id = p.beansFactory.createTableColumn("Dtl2.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_nm = p.beansFactory.createTableColumn("Dtl2.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_func_id = p.beansFactory.createTableColumn("Dtl2.ins_func_id", MCColumnType.TEXT);
		p.columnDtl2_ins_func_nm = p.beansFactory.createTableColumn("Dtl2.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_ts = p.beansFactory.createTableColumn("Dtl2.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_usr_id = p.beansFactory.createTableColumn("Dtl2.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl2_upd_usr_nm = p.beansFactory.createTableColumn("Dtl2.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_func_id = p.beansFactory.createTableColumn("Dtl2.upd_func_id", MCColumnType.TEXT);
		p.columnDtl2_upd_func_nm = p.beansFactory.createTableColumn("Dtl2.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_ts = p.beansFactory.createTableColumn("Dtl2.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl2.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_detail = p.beansFactory.createButton("Btn.open_detail", "open");
		p.Btn_acpt_all = p.beansFactory.createButton("Btn.acpt_all");
		p.Btn_rjct_all = p.beansFactory.createButton("Btn.rjct_all");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_acpt = p.beansFactory.createButton("Btn.upd_acpt", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_acpt_del = p.beansFactory.createButton("Btn.upd_acpt_del", "del");
		p.Btn_upd_rjct_del = p.beansFactory.createButton("Btn.upd_rjct_del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BodyPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
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
	protected static void jbInitFold(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_0);
		p.Cnd_ope_0.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_0);
		p.ScreenOpePanel.add(p.Cnd_ope_0);
		p.Cnd_ope_0.setNextBeans(p.Cnd_ope_1);
		p.Cnd_ope_1.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_1);
		p.ScreenOpePanel.add(p.Cnd_ope_1);
		p.Cnd_ope_1.setNextBeans(p.Cnd_ope_2);
		p.Cnd_ope_2.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_2);
		p.ScreenOpePanel.add(p.Cnd_ope_2);
		p.Cnd_ope_2.setNextBeans(p.Cnd_ope_3);
		p.Cnd_ope_3.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_3);
		p.ScreenOpePanel.add(p.Cnd_ope_3);
		p.Cnd_ope_3.setNextBeans(p.Cnd_ope_4);
		p.Cnd_ope_4.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_4);
		p.ScreenOpePanel.add(p.Cnd_ope_4);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.ope_META);
		p.Cnd_aprv_func_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_func_typ, true);
		p.Cnd_aprv_func_typ.setLinkBeans(p.Cnd_aprv_func_typ_nm);
		p.CndPanel.add(p.Cnd_aprv_func_typ_Label);
		p.CndPanel.add(p.Cnd_aprv_func_typ);
		p.CndPanel.setLastBeans(p.Cnd_aprv_func_typ);
		p.Cnd_aprv_func_typ.setNextBeans(p.Cnd_aprv_func_typ_nm);
		p.Cnd_aprv_func_typ.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_func_typ_META);
		p.CndPanel.add(p.Cnd_aprv_func_typ_nm);
		p.Cnd_aprv_func_typ_nm.setNextBeans(p.Cnd_aprv_d_sts_typ);
		p.Cnd_aprv_func_typ_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_func_typ_nm_META);
		p.Cnd_aprv_d_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_d_sts_typ, true);
		p.Cnd_aprv_d_sts_typ.setLinkBeans(p.Cnd_aprv_d_sts_typ_nm);
		p.CndPanel.add(p.Cnd_aprv_d_sts_typ_Label);
		p.CndPanel.add(p.Cnd_aprv_d_sts_typ);
		p.Cnd_aprv_d_sts_typ.setNextBeans(p.Cnd_aprv_d_sts_typ_nm);
		p.Cnd_aprv_d_sts_typ.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_d_sts_typ_META);
		p.CndPanel.add(p.Cnd_aprv_d_sts_typ_nm);
		p.Cnd_aprv_d_sts_typ_nm.setNextBeans(p.Cnd_aprv_no);
		p.Cnd_aprv_d_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_d_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_aprv_no_Label);
		p.CndPanel.add(p.Cnd_aprv_no);
		p.Cnd_aprv_no.setNextBeans(p.Cnd_aprv_src_no1);
		p.Cnd_aprv_no.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_no_META);
		p.setPluralValueEnable(p.Cnd_aprv_no, true);
		p.CndPanel.add(p.Cnd_aprv_src_no1_Label);
		p.CndPanel.add(p.Cnd_aprv_src_no1);
		p.Cnd_aprv_src_no1.setNextBeans(p.Cnd_aprv_src_no2);
		p.Cnd_aprv_src_no1.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_src_no1_META);
		p.setPluralValueEnable(p.Cnd_aprv_src_no1, true);
		p.CndPanel.add(p.Cnd_aprv_src_no2_Label);
		p.CndPanel.add(p.Cnd_aprv_src_no2);
		p.Cnd_aprv_src_no2.setNextBeans(p.Cnd_ins_dt_fr);
		p.Cnd_aprv_src_no2.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_src_no2_META);
		p.setPluralValueEnable(p.Cnd_aprv_src_no2, true);
		p.CndPanel.add(p.Cnd_ins_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ins_dt_fr);
		p.Cnd_ins_dt_fr.setNextBeans(p.Cnd_ins_dt_to);
		p.Cnd_ins_dt_fr.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.ins_dt_fr_META);
		p.Cnd_ins_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ins_dt_to_Label);
		p.CndPanel.add(p.Cnd_ins_dt_to);
		p.Cnd_ins_dt_to.setNextBeans(p.Cnd_aprv_d_tm_fr);
		p.Cnd_ins_dt_to.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.ins_dt_to_META);
		p.Cnd_ins_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_d_tm_fr_Label);
		p.CndPanel.add(p.Cnd_aprv_d_tm_fr);
		p.Cnd_aprv_d_tm_fr.setNextBeans(p.Cnd_aprv_d_tm_to);
		p.Cnd_aprv_d_tm_fr.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_d_tm_fr_META);
		p.Cnd_aprv_d_tm_fr.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_d_tm_to_Label);
		p.CndPanel.add(p.Cnd_aprv_d_tm_to);
		p.Cnd_aprv_d_tm_to.setNextBeans(p.Cnd_ins_biz_usr_cd);
		p.Cnd_aprv_d_tm_to.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_d_tm_to_META);
		p.Cnd_aprv_d_tm_to.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.CndPanel.add(p.Cnd_ins_biz_usr_cd_Label);
		p.CndPanel.add(p.Cnd_ins_biz_usr_cd);
		p.Cnd_ins_biz_usr_cd.setNextBeans(p.Cnd_ins_biz_usr_nm);
		p.Cnd_ins_biz_usr_cd.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.ins_biz_usr_cd_META);
		p.Cnd_ins_biz_usr_cd.addLinkBeans(p.Cnd_ins_biz_usr_nm);
		p.Cnd_ins_biz_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ins_biz_usr_cd, true);
		p.CndPanel.add(p.Cnd_ins_biz_usr_nm);
		p.Cnd_ins_biz_usr_nm.setNextBeans(p.Cnd_aprv_usr_cd);
		p.Cnd_ins_biz_usr_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.ins_biz_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_ins_biz_usr_nm, true);
		p.CndPanel.add(p.Cnd_aprv_usr_cd_Label);
		p.CndPanel.add(p.Cnd_aprv_usr_cd);
		p.Cnd_aprv_usr_cd.setNextBeans(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_cd.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_usr_cd_META);
		p.Cnd_aprv_usr_cd.addLinkBeans(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_usr_cd, true);
		p.CndPanel.add(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_nm.setNextBeans(p.Cnd_main_role_flg);
		p.Cnd_aprv_usr_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.aprv_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_aprv_usr_nm, true);
		p.CndPanel.add(p.Cnd_main_role_flg);
		p.Cnd_main_role_flg.setNextBeans(p.Cnd_sub_role_flg);
		p.Cnd_main_role_flg.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.main_role_flg_META);
		p.CndPanel.add(p.Cnd_sub_role_flg);
		p.Cnd_sub_role_flg.setNextBeans(p.Cnd_next_opr_flg);
		p.Cnd_sub_role_flg.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.sub_role_flg_META);
		p.CndPanel.add(p.Cnd_next_opr_flg);
		p.Cnd_next_opr_flg.setNextBeans(p.Cnd_not_upd_flg);
		p.Cnd_next_opr_flg.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.next_opr_flg_META);
		p.CndPanel.add(p.Cnd_not_upd_flg);
		p.Cnd_not_upd_flg.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0020.CndR.not_upd_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Body]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBody(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.add(p.BodyPanel);
		p.BodyPanel.setNextBeans(p.BtnPanel);
		p.BodyPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.BodyPanel.add(p.Dtl1Panel, null);
		p.BodyPanel.setLastBeans(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Dtl2Panel);
		p.BodyPanel.add(p.Dtl2Panel, null);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Table.setStatusColumnVisible(false);
		p.Dtl1Panel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBAP_AprvListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_detail.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_detail);
		p.BtnPanel.setLastBeans(p.Btn_open_detail);
		p.Btn_open_detail.setNextBeans(p.Btn_acpt_all);
		p.Btn_acpt_all.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_acpt_all);
		p.Btn_acpt_all.setNextBeans(p.Btn_rjct_all);
		p.Btn_rjct_all.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_rjct_all);
		p.Btn_rjct_all.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_acpt);
		p.Btn_upd_acpt.setIcon("REGISTER");
		p.Btn_upd_acpt.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_acpt);
		p.Btn_upd_acpt.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd_acpt_del.setIcon("CANCEL");
		p.Btn_upd_acpt_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_upd_acpt_del);
		p.EastBtnPanel.add(p.Btn_upd_acpt_del);
		p.Btn_upd_acpt_del.setNextBeans(p.Btn_upd_rjct_del);
		p.Btn_upd_rjct_del.setIcon("CANCEL");
		p.Btn_upd_rjct_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_upd_rjct_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MBBAP_AprvListReg p) {
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
		MBBAP_AprvListReg_MC.mcInitScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitTop((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitFold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitCnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitCtrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitBody((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitDtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitDtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitBtn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.mcInitEastBtn((MBBAP_AprvListReg)this);

		// [SRCH_ACPT]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT_EastBtn((MBBAP_AprvListReg)this);

		// [SRCH_ACPT_CAN]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__ACPT__CAN_EastBtn((MBBAP_AprvListReg)this);

		// [SRCH_RJCT_CAN]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__RJCT__CAN_EastBtn((MBBAP_AprvListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH__UPD_EastBtn((MBBAP_AprvListReg)this);

		// [SRCH]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitSRCH_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitSRCH_EastBtn((MBBAP_AprvListReg)this);

		// [UPD_ACPT]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT_EastBtn((MBBAP_AprvListReg)this);

		// [UPD_ACPT_CAN]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__ACPT__CAN_EastBtn((MBBAP_AprvListReg)this);

		// [UPD_RJCT_CAN]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD__RJCT__CAN_EastBtn((MBBAP_AprvListReg)this);

		// [UPD]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitUPD_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitUPD_EastBtn((MBBAP_AprvListReg)this);

		// [REF]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitREF_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitREF_EastBtn((MBBAP_AprvListReg)this);

		// [FIX_U_ACPT]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT_EastBtn((MBBAP_AprvListReg)this);

		// [FIX_U_ACPT_CAN]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__ACPT__CAN_EastBtn((MBBAP_AprvListReg)this);

		// [FIX_U_RJCT_CAN]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__RJCT__CAN_EastBtn((MBBAP_AprvListReg)this);

		// [FIX_U_UPD]ステータスのモードの設定
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_ScreenOpe((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Top((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Fold((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Cnd((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Ctrl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Body((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Dtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Dtl2((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Dtl((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_Btn((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.statusInitFIX__U__UPD_EastBtn((MBBAP_AprvListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBAP_AprvListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBAP_AprvListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBAP_AprvListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBAP_AprvListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_0.addAllListener(p);
		p.Cnd_ope_1.addAllListener(p);
		p.Cnd_ope_2.addAllListener(p);
		p.Cnd_ope_3.addAllListener(p);
		p.Cnd_ope_4.addAllListener(p);
		p.Cnd_aprv_func_typ.setListListener(p);
		p.Cnd_aprv_func_typ.addAllListener(p);
		p.Cnd_aprv_func_typ_nm.setListListener(p);
		p.Cnd_aprv_func_typ_nm.addAllListener(p);
		p.Cnd_aprv_d_sts_typ.setListListener(p);
		p.Cnd_aprv_d_sts_typ.addAllListener(p);
		p.Cnd_aprv_d_sts_typ_nm.setListListener(p);
		p.Cnd_aprv_d_sts_typ_nm.addAllListener(p);
		p.Cnd_aprv_no.setListListener(p);
		p.Cnd_aprv_no.addAllListener(p);
		p.Cnd_aprv_src_no1.setListListener(p);
		p.Cnd_aprv_src_no1.addAllListener(p);
		p.Cnd_aprv_src_no2.setListListener(p);
		p.Cnd_aprv_src_no2.addAllListener(p);
		p.Cnd_ins_dt_fr.setListListener(p);
		p.Cnd_ins_dt_fr.addAllListener(p);
		p.Cnd_ins_dt_to.setListListener(p);
		p.Cnd_ins_dt_to.addAllListener(p);
		p.Cnd_aprv_d_tm_fr.setListListener(p);
		p.Cnd_aprv_d_tm_fr.addAllListener(p);
		p.Cnd_aprv_d_tm_to.setListListener(p);
		p.Cnd_aprv_d_tm_to.addAllListener(p);
		p.Cnd_ins_biz_usr_cd.setListListener(p);
		p.Cnd_ins_biz_usr_cd.addAllListener(p);
		p.Cnd_ins_biz_usr_nm.setListListener(p);
		p.Cnd_ins_biz_usr_nm.addAllListener(p);
		p.Cnd_aprv_usr_cd.setListListener(p);
		p.Cnd_aprv_usr_cd.addAllListener(p);
		p.Cnd_aprv_usr_nm.setListListener(p);
		p.Cnd_aprv_usr_nm.addAllListener(p);
		p.Cnd_main_role_flg.addAllListener(p);
		p.Cnd_sub_role_flg.addAllListener(p);
		p.Cnd_next_opr_flg.addAllListener(p);
		p.Cnd_not_upd_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBAP_AprvListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Body]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBody(MBBAP_AprvListReg p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MBBAP_AprvListReg p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_check.addAllListener(p);
		p.columnDtl1_acpt_check.addAllListener(p);
		p.columnDtl1_rjct_check.addAllListener(p);
		p.columnDtl1_aprv_func_typ.addAllListener(p);
		p.columnDtl1_aprv_func_typ.setListListener(p);
		p.columnDtl1_aprv_func_typ_nm.addAllListener(p);
		p.columnDtl1_aprv_func_typ_nm.setListListener(p);
		p.columnDtl1_aprv_no.addAllListener(p);
		p.columnDtl1_aprv_no.setListListener(p);
		p.columnDtl1_aprv_no_seq.addAllListener(p);
		p.columnDtl1_aprv_no_seq.setListListener(p);
		p.columnDtl1_aprv_src_no1.addAllListener(p);
		p.columnDtl1_aprv_src_no1.setListListener(p);
		p.columnDtl1_aprv_src_no2.addAllListener(p);
		p.columnDtl1_aprv_src_no2.setListListener(p);
		p.columnDtl1_aprv_d_sts_typ.addAllListener(p);
		p.columnDtl1_aprv_d_sts_typ.setListListener(p);
		p.columnDtl1_aprv_d_sts_typ_nm.addAllListener(p);
		p.columnDtl1_aprv_d_sts_typ_nm.setListListener(p);
		p.columnDtl1_aprv_sts_typ.addAllListener(p);
		p.columnDtl1_aprv_sts_typ.setListListener(p);
		p.columnDtl1_aprv_sts_typ_nm.addAllListener(p);
		p.columnDtl1_aprv_sts_typ_nm.setListListener(p);
		p.columnDtl1_main_role_flg.addAllListener(p);
		p.columnDtl1_sub_role_flg.addAllListener(p);
		p.columnDtl1_aprv_d_rmrks_up.addAllListener(p);
		p.columnDtl1_aprv_d_rmrks_up.setListListener(p);
		p.columnDtl1_sub_char1_up.addAllListener(p);
		p.columnDtl1_sub_char1_up.setListListener(p);
		p.columnDtl1_sub_char2_up.addAllListener(p);
		p.columnDtl1_sub_char2_up.setListListener(p);
		p.columnDtl1_sub_char3_up.addAllListener(p);
		p.columnDtl1_sub_char3_up.setListListener(p);
		p.columnDtl1_ins_dt.addAllListener(p);
		p.columnDtl1_ins_dt.setListListener(p);
		p.columnDtl1_src_ins_usr_cd.addAllListener(p);
		p.columnDtl1_src_ins_usr_cd.setListListener(p);
		p.columnDtl1_src_ins_usr_nm.addAllListener(p);
		p.columnDtl1_src_ins_usr_nm.setListListener(p);
		p.columnDtl1_biz_usr_cd.addAllListener(p);
		p.columnDtl1_biz_usr_cd.setListListener(p);
		p.columnDtl1_biz_usr_nm.addAllListener(p);
		p.columnDtl1_biz_usr_nm.setListListener(p);
		p.columnDtl1_src_dpt_cd.addAllListener(p);
		p.columnDtl1_src_dpt_cd.setListListener(p);
		p.columnDtl1_src_dpt_nm.addAllListener(p);
		p.columnDtl1_src_dpt_nm.setListListener(p);
		p.columnDtl1_src_bp_cd.addAllListener(p);
		p.columnDtl1_src_bp_cd.setListListener(p);
		p.columnDtl1_src_bp_nm.addAllListener(p);
		p.columnDtl1_src_bp_nm.setListListener(p);
		p.columnDtl1_src_cur_cd1.addAllListener(p);
		p.columnDtl1_src_cur_cd1.setListListener(p);
		p.columnDtl1_src_cur_nm1.addAllListener(p);
		p.columnDtl1_src_cur_nm1.setListListener(p);
		p.columnDtl1_src_amt1.addAllListener(p);
		p.columnDtl1_src_amt1.setListListener(p);
		p.columnDtl1_src_cur_cd2.addAllListener(p);
		p.columnDtl1_src_cur_cd2.setListListener(p);
		p.columnDtl1_src_cur_nm2.addAllListener(p);
		p.columnDtl1_src_cur_nm2.setListListener(p);
		p.columnDtl1_src_amt2.addAllListener(p);
		p.columnDtl1_src_amt2.setListListener(p);
		p.columnDtl1_src_cur_cd3.addAllListener(p);
		p.columnDtl1_src_cur_cd3.setListListener(p);
		p.columnDtl1_src_cur_nm3.addAllListener(p);
		p.columnDtl1_src_cur_nm3.setListListener(p);
		p.columnDtl1_src_amt3.addAllListener(p);
		p.columnDtl1_src_amt3.setListListener(p);
		p.columnDtl1_src_ext_key1.addAllListener(p);
		p.columnDtl1_src_ext_key1.setListListener(p);
		p.columnDtl1_src_ext_key2.addAllListener(p);
		p.columnDtl1_src_ext_key2.setListListener(p);
		p.columnDtl1_src_ext_key3.addAllListener(p);
		p.columnDtl1_src_ext_key3.setListListener(p);
		p.columnDtl1_next_opr_flg.addAllListener(p);
		p.columnDtl1_not_upd_flg.addAllListener(p);
		p.columnDtl1_upd_cntr.addAllListener(p);
		p.columnDtl1_upd_cntr.setListListener(p);
		p.columnDtl1_aprv_usr_cd.addAllListener(p);
		p.columnDtl1_aprv_usr_cd.setListListener(p);
		p.columnDtl1_aprv_d_sts_typ_up.addAllListener(p);
		p.columnDtl1_aprv_d_sts_typ_up.setListListener(p);
		p.columnDtl1_aprv_role_cd.addAllListener(p);
		p.columnDtl1_aprv_role_cd.setListListener(p);
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MBBAP_AprvListReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_aprv_seq.addAllListener(p);
		p.columnDtl2_aprv_seq.setListListener(p);
		p.columnDtl2_aprv_usr_cd.addAllListener(p);
		p.columnDtl2_aprv_usr_cd.setListListener(p);
		p.columnDtl2_aprv_usr_nm.addAllListener(p);
		p.columnDtl2_aprv_usr_nm.setListListener(p);
		p.columnDtl2_aprv_d_sts_typ.addAllListener(p);
		p.columnDtl2_aprv_d_sts_typ.setListListener(p);
		p.columnDtl2_aprv_d_sts_typ_nm.addAllListener(p);
		p.columnDtl2_aprv_d_sts_typ_nm.setListListener(p);
		p.columnDtl2_aprv_d_tm.addAllListener(p);
		p.columnDtl2_aprv_d_tm.setListListener(p);
		p.columnDtl2_deputy_flg.addAllListener(p);
		p.columnDtl2_deputy_usr_cd.addAllListener(p);
		p.columnDtl2_deputy_usr_cd.setListListener(p);
		p.columnDtl2_deputy_usr_nm.addAllListener(p);
		p.columnDtl2_deputy_usr_nm.setListListener(p);
		p.columnDtl2_aprv_role_cd.addAllListener(p);
		p.columnDtl2_aprv_role_cd.setListListener(p);
		p.columnDtl2_aprv_role_nm.addAllListener(p);
		p.columnDtl2_aprv_role_nm.setListListener(p);
		p.columnDtl2_aprv_d_rmrks.addAllListener(p);
		p.columnDtl2_aprv_d_rmrks.setListListener(p);
		p.columnDtl2_sub_char1.addAllListener(p);
		p.columnDtl2_sub_char1.setListListener(p);
		p.columnDtl2_sub_char2.addAllListener(p);
		p.columnDtl2_sub_char2.setListListener(p);
		p.columnDtl2_sub_char3.addAllListener(p);
		p.columnDtl2_sub_char3.setListListener(p);
		p.columnDtl2_ins_usr_id.addAllListener(p);
		p.columnDtl2_ins_usr_id.setListListener(p);
		p.columnDtl2_ins_usr_nm.addAllListener(p);
		p.columnDtl2_ins_usr_nm.setListListener(p);
		p.columnDtl2_ins_func_id.addAllListener(p);
		p.columnDtl2_ins_func_id.setListListener(p);
		p.columnDtl2_ins_func_nm.addAllListener(p);
		p.columnDtl2_ins_func_nm.setListListener(p);
		p.columnDtl2_ins_ts.addAllListener(p);
		p.columnDtl2_ins_ts.setListListener(p);
		p.columnDtl2_upd_usr_id.addAllListener(p);
		p.columnDtl2_upd_usr_id.setListListener(p);
		p.columnDtl2_upd_usr_nm.addAllListener(p);
		p.columnDtl2_upd_usr_nm.setListListener(p);
		p.columnDtl2_upd_func_id.addAllListener(p);
		p.columnDtl2_upd_func_id.setListListener(p);
		p.columnDtl2_upd_func_nm.addAllListener(p);
		p.columnDtl2_upd_func_nm.setListListener(p);
		p.columnDtl2_upd_ts.addAllListener(p);
		p.columnDtl2_upd_ts.setListListener(p);
		p.columnDtl2_upd_srv_req_no.addAllListener(p);
		p.columnDtl2_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBAP_AprvListReg p) {
		p.Btn_open_detail.addAllListener(p);
		p.Btn_open_detail.setAPMethodName("doBtn_open_detail");
		p.Btn_acpt_all.addAllListener(p);
		p.Btn_acpt_all.setAPMethodName("doBtn_acpt_all");
		p.Btn_rjct_all.addAllListener(p);
		p.Btn_rjct_all.setAPMethodName("doBtn_rjct_all");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_acpt.addAllListener(p);
		p.Btn_upd_acpt.setAPMethodName("doBtn_upd_acpt");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_acpt_del.addAllListener(p);
		p.Btn_upd_acpt_del.setAPMethodName("doBtn_upd_acpt_del");
		p.Btn_upd_rjct_del.addAllListener(p);
		p.Btn_upd_rjct_del.setAPMethodName("doBtn_upd_rjct_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MBBAP_AprvListReg p) {
	}

	/**
	 * [SRCH_ACPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACPT, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, SRCH_ACPT, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, SRCH_ACPT, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ACPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_acpt_check.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_rjct_check.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_ACPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(SRCH_ACPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ACPT]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_ACPT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACPT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_acpt_all.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_ACPT, MCMode.INVISIBLE);
		p.Btn_upd_acpt_del.putMode(p, SRCH_ACPT, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, SRCH_ACPT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, SRCH_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, SRCH_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_ACPT_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(SRCH_ACPT_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_ACPT_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_acpt_all.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, SRCH_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, SRCH_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ACPT_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACPT__CAN_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, SRCH_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, SRCH_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_RJCT_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(SRCH_RJCT_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_RJCT_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_acpt_all.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, SRCH_RJCT_CAN, MCMode.INVISIBLE);
		p.Btn_upd_rjct_del.putMode(p, SRCH_RJCT_CAN, MCMode.DISABLE);

	}

	/**
	 * [SRCH_RJCT_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__RJCT__CAN_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_acpt_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_acpt_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ACPT, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, UPD_ACPT, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, UPD_ACPT, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, UPD_ACPT, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, UPD_ACPT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ACPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, UPD_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_acpt_check.putMode(p, UPD_ACPT, MCMode.REQUIRED);
		p.columnDtl1_rjct_check.putMode(p, UPD_ACPT, MCMode.REQUIRED);
		p.columnDtl1_aprv_func_typ.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.columnDtl1_sub_char1_up.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.columnDtl1_sub_char2_up.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.columnDtl1_sub_char3_up.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.columnDtl1_ins_dt.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(UPD_ACPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(UPD_ACPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, UPD_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, UPD_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, UPD_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, UPD_ACPT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ACPT]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD_ACPT, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ACPT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Btn_rjct_all.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_ACPT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, UPD_ACPT, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, UPD_ACPT, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD_ACPT, MCMode.INVISIBLE);
		p.Btn_upd_acpt_del.putMode(p, UPD_ACPT, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, UPD_ACPT, MCMode.DISABLE);

	}

	/**
	 * [UPD_ACPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, UPD_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, UPD_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, UPD_ACPT_CAN, MCMode.REQUIRED);
		p.columnDtl1_acpt_check.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.columnDtl1_sub_char1_up.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.columnDtl1_sub_char2_up.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.columnDtl1_sub_char3_up.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.columnDtl1_ins_dt.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(UPD_ACPT_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(UPD_ACPT_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD_ACPT_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, UPD_ACPT_CAN, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, UPD_ACPT_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Btn_upd_acpt.putMode(p, UPD_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, UPD_ACPT_CAN, MCMode.ENABLE);
		p.Btn_upd_rjct_del.putMode(p, UPD_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ACPT_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ACPT__CAN_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, UPD_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, UPD_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, UPD_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, UPD_RJCT_CAN, MCMode.REQUIRED);
		p.columnDtl1_acpt_check.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.columnDtl1_sub_char1_up.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.columnDtl1_sub_char2_up.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.columnDtl1_sub_char3_up.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.columnDtl1_ins_dt.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(UPD_RJCT_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(UPD_RJCT_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD_RJCT_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, UPD_RJCT_CAN, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, UPD_RJCT_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);
		p.Btn_upd_acpt.putMode(p, UPD_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, UPD_RJCT_CAN, MCMode.INVISIBLE);
		p.Btn_upd_rjct_del.putMode(p, UPD_RJCT_CAN, MCMode.ENABLE);

	}

	/**
	 * [UPD_RJCT_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RJCT__CAN_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_acpt_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char1_up.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char2_up.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char3_up.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_ins_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_acpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_acpt_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitREF_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, REF, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_ACPT, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, FIX_U_ACPT, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, FIX_U_ACPT, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_acpt_check.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_rjct_check.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_U_ACPT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(FIX_U_ACPT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_U_ACPT, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, FIX_U_ACPT, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, FIX_U_ACPT, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, FIX_U_ACPT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U_ACPT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U_ACPT, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, FIX_U_ACPT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U_ACPT, MCMode.INVISIBLE);
		p.Btn_upd_acpt_del.putMode(p, FIX_U_ACPT, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, FIX_U_ACPT, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_ACPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_U_ACPT_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(FIX_U_ACPT_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_U_ACPT_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, FIX_U_ACPT_CAN, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, FIX_U_ACPT_CAN, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, FIX_U_ACPT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_ACPT_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__ACPT__CAN_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_U_RJCT_CAN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(FIX_U_RJCT_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_U_RJCT_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, FIX_U_RJCT_CAN, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, FIX_U_RJCT_CAN, MCMode.INVISIBLE);
		p.Btn_upd_rjct_del.putMode(p, FIX_U_RJCT_CAN, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_RJCT_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__RJCT__CAN_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_ScreenOpe(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Top(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Fold(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Cnd(MBBAP_AprvListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_UPD, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_d_sts_typ.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_sts_typ_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_fr.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_d_tm_to.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.Cnd_main_role_flg.putMode(p, FIX_U_UPD, MCMode.REQUIRED);
		p.Cnd_sub_role_flg.putMode(p, FIX_U_UPD, MCMode.REQUIRED);
		p.Cnd_next_opr_flg.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.Cnd_not_upd_flg.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Ctrl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Body(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Dtl1(MBBAP_AprvListReg p){
		p.columnDtl1_check.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_acpt_check.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.columnDtl1_rjct_check.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_func_typ.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_func_typ_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_no_seq.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no1.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_src_no2.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_sts_typ_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_sts_typ_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_main_role_flg.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_role_flg.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_aprv_d_rmrks_up.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1_up.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2_up.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3_up.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_ins_dt.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ins_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_biz_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_dpt_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_bp_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd1.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm1.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt1.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd2.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm2.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt2.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_cd3.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_cur_nm3.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_amt3.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_U_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_src_ext_key1.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key2.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_src_ext_key3.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_next_opr_flg.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl1_not_upd_flg.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.Dtl1_rts_msg_p_PPanel.putStatus(FIX_U_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl1_upd_cntr.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_usr_cd.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_d_sts_typ_up.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.columnDtl1_aprv_role_cd.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Dtl2(MBBAP_AprvListReg p){
		p.columnDtl2_aprv_seq.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_U_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Dtl(MBBAP_AprvListReg p){

	}

	/**
	 * [FIX_U_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_Btn(MBBAP_AprvListReg p){
		p.Btn_open_detail.putMode(p, FIX_U_UPD, MCMode.ENABLE);
		p.Btn_acpt_all.putMode(p, FIX_U_UPD, MCMode.DISABLE);
		p.Btn_rjct_all.putMode(p, FIX_U_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U_UPD, MCMode.DISABLE);
		p.Btn_upd_acpt.putMode(p, FIX_U_UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U_UPD, MCMode.DISABLE);
		p.Btn_upd_acpt_del.putMode(p, FIX_U_UPD, MCMode.DISABLE);
		p.Btn_upd_rjct_del.putMode(p, FIX_U_UPD, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__UPD_EastBtn(MBBAP_AprvListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_ACPT;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MBBAP_AprvListReg_MC.setTableConfigDtl1((MBBAP_AprvListReg)this);
		MBBAP_AprvListReg_MC.setTableConfigDtl2((MBBAP_AprvListReg)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MBBAP_AprvListReg p) {
		p.columnDtl1_check.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.check_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_check);
		p.columnDtl1_acpt_check.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.acpt_check_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_acpt_check);
		p.columnDtl1_rjct_check.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.rjct_check_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rjct_check);
		p.columnDtl1_aprv_func_typ.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_func_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_func_typ);
		p.columnDtl1_aprv_func_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_func_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_func_typ_nm);
		p.columnDtl1_aprv_no.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_no);
		p.columnDtl1_aprv_no_seq.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_no_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_no_seq);
		p.columnDtl1_aprv_src_no1.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_src_no1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_src_no1);
		p.columnDtl1_aprv_src_no2.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_src_no2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_src_no2);
		p.columnDtl1_aprv_d_sts_typ.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_sts_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_d_sts_typ);
		p.columnDtl1_aprv_d_sts_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_sts_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_d_sts_typ_nm);
		p.columnDtl1_aprv_sts_typ.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_sts_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_sts_typ);
		p.columnDtl1_aprv_sts_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_sts_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_sts_typ_nm);
		p.columnDtl1_main_role_flg.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.main_role_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_main_role_flg);
		p.columnDtl1_sub_role_flg.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_role_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_role_flg);
		p.columnDtl1_aprv_d_rmrks_up.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_rmrks_up_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_d_rmrks_up);
		p.columnDtl1_sub_char1_up.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_char1_up_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char1_up);
		p.columnDtl1_sub_char2_up.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_char2_up_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char2_up);
		p.columnDtl1_sub_char3_up.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_char3_up_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char3_up);
		p.columnDtl1_ins_dt.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.ins_dt_META);
		p.columnDtl1_ins_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_dt);
		p.columnDtl1_src_ins_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_ins_usr_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_ins_usr_cd);
		p.columnDtl1_src_ins_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_ins_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_ins_usr_nm);
		p.columnDtl1_biz_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.biz_usr_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_biz_usr_cd);
		p.columnDtl1_biz_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.biz_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_biz_usr_nm);
		p.columnDtl1_src_dpt_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_dpt_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_dpt_cd);
		p.columnDtl1_src_dpt_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_dpt_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_dpt_nm);
		p.columnDtl1_src_bp_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_bp_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_bp_cd);
		p.columnDtl1_src_bp_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_bp_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_bp_nm);
		p.columnDtl1_src_cur_cd1.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_cur_cd1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_cur_cd1);
		p.columnDtl1_src_cur_nm1.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_cur_nm1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_cur_nm1);
		p.columnDtl1_src_amt1.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_amt1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_amt1);
		p.columnDtl1_src_cur_cd2.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_cur_cd2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_cur_cd2);
		p.columnDtl1_src_cur_nm2.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_cur_nm2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_cur_nm2);
		p.columnDtl1_src_amt2.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_amt2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_amt2);
		p.columnDtl1_src_cur_cd3.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_cur_cd3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_cur_cd3);
		p.columnDtl1_src_cur_nm3.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_cur_nm3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_cur_nm3);
		p.columnDtl1_src_amt3.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_amt3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_amt3);
		p.Dtl1Table.addTable(p.Dtl1_itm_p_PPanel.ItmTable);
		p.columnDtl1_src_ext_key1.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_ext_key1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_ext_key1);
		p.columnDtl1_src_ext_key2.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_ext_key2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_ext_key2);
		p.columnDtl1_src_ext_key3.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.src_ext_key3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_src_ext_key3);
		p.columnDtl1_next_opr_flg.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.next_opr_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_next_opr_flg);
		p.columnDtl1_not_upd_flg.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.not_upd_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_not_upd_flg);
		p.Dtl1Table.addTable(p.Dtl1_rts_msg_p_PPanel.RtnMsgTable);
		p.columnDtl1_upd_cntr.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_cntr_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_cntr);
		p.columnDtl1_aprv_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_usr_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_usr_cd);
		p.columnDtl1_aprv_d_sts_typ_up.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_sts_typ_up_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_d_sts_typ_up);
		p.columnDtl1_aprv_role_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_role_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_aprv_role_cd);
		// スクロール固定カラムの指定
		p.Dtl1Table.setUnscrollColumn(p.columnDtl1_rjct_check);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MBBAP_AprvListReg p) {
		p.columnDtl2_aprv_seq.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_seq);
		p.columnDtl2_aprv_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_usr_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_usr_cd);
		p.columnDtl2_aprv_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_usr_nm);
		p.columnDtl2_aprv_d_sts_typ.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_sts_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_sts_typ);
		p.columnDtl2_aprv_d_sts_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_sts_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_sts_typ_nm);
		p.columnDtl2_aprv_d_tm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_tm_META);
		p.columnDtl2_aprv_d_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_tm);
		p.columnDtl2_deputy_flg.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.deputy_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_deputy_flg);
		p.columnDtl2_deputy_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.deputy_usr_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_deputy_usr_cd);
		p.columnDtl2_deputy_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.deputy_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_deputy_usr_nm);
		p.columnDtl2_aprv_role_cd.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_role_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_role_cd);
		p.columnDtl2_aprv_role_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_role_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_role_nm);
		p.columnDtl2_aprv_d_rmrks.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.aprv_d_rmrks_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_rmrks);
		p.columnDtl2_sub_char1.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_char1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char1);
		p.columnDtl2_sub_char2.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_char2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char2);
		p.columnDtl2_sub_char3.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.sub_char3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char3);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMBBA.MBBAP0020.DtlR.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_aprv_func_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aprv_func_typ.getListConfig().setPutter(getCnd_aprv_func_typ_ListPutter());
		Cnd_aprv_d_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aprv_d_sts_typ.getListConfig().setPutter(getCnd_aprv_d_sts_typ_ListPutter());
		Cnd_ins_biz_usr_cd.getListConfig().setPutter(getCnd_ins_biz_usr_cd_ListPutter());
		Cnd_aprv_usr_cd.getListConfig().setPutter(getCnd_aprv_usr_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_ACPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACPTStatus() {
		status = SRCH_ACPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACPT_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACPT_CANStatus() {
		status = SRCH_ACPT_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_RJCT_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_RJCT_CANStatus() {
		status = SRCH_RJCT_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
		setAllStatus(status);
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
	 * この画面を[UPD_ACPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ACPTStatus() {
		status = UPD_ACPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_ACPT_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ACPT_CANStatus() {
		status = UPD_ACPT_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_RJCT_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_RJCT_CANStatus() {
		status = UPD_RJCT_CAN;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_ACPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_ACPTStatus() {
		status = FIX_U_ACPT;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_ACPT_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_ACPT_CANStatus() {
		status = FIX_U_ACPT_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_RJCT_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_RJCT_CANStatus() {
		status = FIX_U_RJCT_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_UPDStatus() {
		status = FIX_U_UPD;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_ACPT.equals(status)) {
			setSRCH_ACPTStatus();
		}
		else if (SRCH_ACPT_CAN.equals(status)) {
			setSRCH_ACPT_CANStatus();
		}
		else if (SRCH_RJCT_CAN.equals(status)) {
			setSRCH_RJCT_CANStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD_ACPT.equals(status)) {
			setUPD_ACPTStatus();
		}
		else if (UPD_ACPT_CAN.equals(status)) {
			setUPD_ACPT_CANStatus();
		}
		else if (UPD_RJCT_CAN.equals(status)) {
			setUPD_RJCT_CANStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_U_ACPT.equals(status)) {
			setFIX_U_ACPTStatus();
		}
		else if (FIX_U_ACPT_CAN.equals(status)) {
			setFIX_U_ACPT_CANStatus();
		}
		else if (FIX_U_RJCT_CAN.equals(status)) {
			setFIX_U_RJCT_CANStatus();
		}
		else if (FIX_U_UPD.equals(status)) {
			setFIX_U_UPDStatus();
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
	 * [Cnd_aprv_func_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_func_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvFuncTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_d_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_d_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvDStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ins_biz_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ins_biz_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_aprv_func_typ) return getCnd_aprv_func_typ(row, info);
		if(combo == Cnd_aprv_d_sts_typ) return getCnd_aprv_d_sts_typ(row, info);
		if(combo == Cnd_ins_biz_usr_cd) return getCnd_ins_biz_usr_cd(row, info);
		if(combo == Cnd_aprv_usr_cd) return getCnd_aprv_usr_cd(row, info);
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
		else if (ap == Btn_open_detail) doBtn_open_detail(info);
		else if (ap == Btn_acpt_all) doBtn_acpt_all(info);
		else if (ap == Btn_rjct_all) doBtn_rjct_all(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_acpt) doBtn_upd_acpt(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_acpt_del) doBtn_upd_acpt_del(info);
		else if (ap == Btn_upd_rjct_del) doBtn_upd_rjct_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_detail]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_detail(MCEventInfo info);

	/**
	 * [Btn]パネルの[acpt_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_acpt_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[rjct_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rjct_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_acpt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_acpt(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_acpt_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_acpt_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_rjct_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_rjct_del(MCEventInfo info);

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
		if (vc == Dtl1Table) return doDtl1_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_aprv_func_typ) return doCnd_aprv_func_typ_VC(info);
		if (vc == Cnd_aprv_func_typ_nm) return doCnd_aprv_func_typ_nm_VC(info);
		if (vc == Cnd_aprv_d_sts_typ) return doCnd_aprv_d_sts_typ_VC(info);
		if (vc == Cnd_aprv_d_sts_typ_nm) return doCnd_aprv_d_sts_typ_nm_VC(info);
		if (vc == Cnd_aprv_no) return doCnd_aprv_no_VC(info);
		if (vc == Cnd_aprv_src_no1) return doCnd_aprv_src_no1_VC(info);
		if (vc == Cnd_aprv_src_no2) return doCnd_aprv_src_no2_VC(info);
		if (vc == Cnd_ins_dt_fr) return doCnd_ins_dt_fr_VC(info);
		if (vc == Cnd_ins_dt_to) return doCnd_ins_dt_to_VC(info);
		if (vc == Cnd_aprv_d_tm_fr) return doCnd_aprv_d_tm_fr_VC(info);
		if (vc == Cnd_aprv_d_tm_to) return doCnd_aprv_d_tm_to_VC(info);
		if (vc == Cnd_ins_biz_usr_cd) return doCnd_ins_biz_usr_cd_VC(info);
		if (vc == Cnd_ins_biz_usr_nm) return doCnd_ins_biz_usr_nm_VC(info);
		if (vc == Cnd_aprv_usr_cd) return doCnd_aprv_usr_cd_VC(info);
		if (vc == Cnd_aprv_usr_nm) return doCnd_aprv_usr_nm_VC(info);
		if (vc == Cnd_main_role_flg) return doCnd_main_role_flg_VC(info);
		if (vc == Cnd_sub_role_flg) return doCnd_sub_role_flg_VC(info);
		if (vc == Cnd_next_opr_flg) return doCnd_next_opr_flg_VC(info);
		if (vc == Cnd_not_upd_flg) return doCnd_not_upd_flg_VC(info);
		if (vc == columnDtl1_check) return doDtl1_check_VC(info);
		if (vc == columnDtl1_acpt_check) return doDtl1_acpt_check_VC(info);
		if (vc == columnDtl1_rjct_check) return doDtl1_rjct_check_VC(info);
		if (vc == columnDtl1_aprv_func_typ) return doDtl1_aprv_func_typ_VC(info);
		if (vc == columnDtl1_aprv_func_typ_nm) return doDtl1_aprv_func_typ_nm_VC(info);
		if (vc == columnDtl1_aprv_no) return doDtl1_aprv_no_VC(info);
		if (vc == columnDtl1_aprv_no_seq) return doDtl1_aprv_no_seq_VC(info);
		if (vc == columnDtl1_aprv_src_no1) return doDtl1_aprv_src_no1_VC(info);
		if (vc == columnDtl1_aprv_src_no2) return doDtl1_aprv_src_no2_VC(info);
		if (vc == columnDtl1_aprv_d_sts_typ) return doDtl1_aprv_d_sts_typ_VC(info);
		if (vc == columnDtl1_aprv_d_sts_typ_nm) return doDtl1_aprv_d_sts_typ_nm_VC(info);
		if (vc == columnDtl1_aprv_sts_typ) return doDtl1_aprv_sts_typ_VC(info);
		if (vc == columnDtl1_aprv_sts_typ_nm) return doDtl1_aprv_sts_typ_nm_VC(info);
		if (vc == columnDtl1_main_role_flg) return doDtl1_main_role_flg_VC(info);
		if (vc == columnDtl1_sub_role_flg) return doDtl1_sub_role_flg_VC(info);
		if (vc == columnDtl1_aprv_d_rmrks_up) return doDtl1_aprv_d_rmrks_up_VC(info);
		if (vc == columnDtl1_sub_char1_up) return doDtl1_sub_char1_up_VC(info);
		if (vc == columnDtl1_sub_char2_up) return doDtl1_sub_char2_up_VC(info);
		if (vc == columnDtl1_sub_char3_up) return doDtl1_sub_char3_up_VC(info);
		if (vc == columnDtl1_ins_dt) return doDtl1_ins_dt_VC(info);
		if (vc == columnDtl1_src_ins_usr_cd) return doDtl1_src_ins_usr_cd_VC(info);
		if (vc == columnDtl1_src_ins_usr_nm) return doDtl1_src_ins_usr_nm_VC(info);
		if (vc == columnDtl1_biz_usr_cd) return doDtl1_biz_usr_cd_VC(info);
		if (vc == columnDtl1_biz_usr_nm) return doDtl1_biz_usr_nm_VC(info);
		if (vc == columnDtl1_src_dpt_cd) return doDtl1_src_dpt_cd_VC(info);
		if (vc == columnDtl1_src_dpt_nm) return doDtl1_src_dpt_nm_VC(info);
		if (vc == columnDtl1_src_bp_cd) return doDtl1_src_bp_cd_VC(info);
		if (vc == columnDtl1_src_bp_nm) return doDtl1_src_bp_nm_VC(info);
		if (vc == columnDtl1_src_cur_cd1) return doDtl1_src_cur_cd1_VC(info);
		if (vc == columnDtl1_src_cur_nm1) return doDtl1_src_cur_nm1_VC(info);
		if (vc == columnDtl1_src_amt1) return doDtl1_src_amt1_VC(info);
		if (vc == columnDtl1_src_cur_cd2) return doDtl1_src_cur_cd2_VC(info);
		if (vc == columnDtl1_src_cur_nm2) return doDtl1_src_cur_nm2_VC(info);
		if (vc == columnDtl1_src_amt2) return doDtl1_src_amt2_VC(info);
		if (vc == columnDtl1_src_cur_cd3) return doDtl1_src_cur_cd3_VC(info);
		if (vc == columnDtl1_src_cur_nm3) return doDtl1_src_cur_nm3_VC(info);
		if (vc == columnDtl1_src_amt3) return doDtl1_src_amt3_VC(info);
		if (vc == columnDtl1_src_ext_key1) return doDtl1_src_ext_key1_VC(info);
		if (vc == columnDtl1_src_ext_key2) return doDtl1_src_ext_key2_VC(info);
		if (vc == columnDtl1_src_ext_key3) return doDtl1_src_ext_key3_VC(info);
		if (vc == columnDtl1_next_opr_flg) return doDtl1_next_opr_flg_VC(info);
		if (vc == columnDtl1_not_upd_flg) return doDtl1_not_upd_flg_VC(info);
		if (vc == columnDtl1_upd_cntr) return doDtl1_upd_cntr_VC(info);
		if (vc == columnDtl1_aprv_usr_cd) return doDtl1_aprv_usr_cd_VC(info);
		if (vc == columnDtl1_aprv_d_sts_typ_up) return doDtl1_aprv_d_sts_typ_up_VC(info);
		if (vc == columnDtl1_aprv_role_cd) return doDtl1_aprv_role_cd_VC(info);
		if (vc == columnDtl2_aprv_seq) return doDtl2_aprv_seq_VC(info);
		if (vc == columnDtl2_aprv_usr_cd) return doDtl2_aprv_usr_cd_VC(info);
		if (vc == columnDtl2_aprv_usr_nm) return doDtl2_aprv_usr_nm_VC(info);
		if (vc == columnDtl2_aprv_d_sts_typ) return doDtl2_aprv_d_sts_typ_VC(info);
		if (vc == columnDtl2_aprv_d_sts_typ_nm) return doDtl2_aprv_d_sts_typ_nm_VC(info);
		if (vc == columnDtl2_aprv_d_tm) return doDtl2_aprv_d_tm_VC(info);
		if (vc == columnDtl2_deputy_flg) return doDtl2_deputy_flg_VC(info);
		if (vc == columnDtl2_deputy_usr_cd) return doDtl2_deputy_usr_cd_VC(info);
		if (vc == columnDtl2_deputy_usr_nm) return doDtl2_deputy_usr_nm_VC(info);
		if (vc == columnDtl2_aprv_role_cd) return doDtl2_aprv_role_cd_VC(info);
		if (vc == columnDtl2_aprv_role_nm) return doDtl2_aprv_role_nm_VC(info);
		if (vc == columnDtl2_aprv_d_rmrks) return doDtl2_aprv_d_rmrks_VC(info);
		if (vc == columnDtl2_sub_char1) return doDtl2_sub_char1_VC(info);
		if (vc == columnDtl2_sub_char2) return doDtl2_sub_char2_VC(info);
		if (vc == columnDtl2_sub_char3) return doDtl2_sub_char3_VC(info);
		if (vc == columnDtl2_ins_usr_id) return doDtl2_ins_usr_id_VC(info);
		if (vc == columnDtl2_ins_usr_nm) return doDtl2_ins_usr_nm_VC(info);
		if (vc == columnDtl2_ins_func_id) return doDtl2_ins_func_id_VC(info);
		if (vc == columnDtl2_ins_func_nm) return doDtl2_ins_func_nm_VC(info);
		if (vc == columnDtl2_ins_ts) return doDtl2_ins_ts_VC(info);
		if (vc == columnDtl2_upd_usr_id) return doDtl2_upd_usr_id_VC(info);
		if (vc == columnDtl2_upd_usr_nm) return doDtl2_upd_usr_nm_VC(info);
		if (vc == columnDtl2_upd_func_id) return doDtl2_upd_func_id_VC(info);
		if (vc == columnDtl2_upd_func_nm) return doDtl2_upd_func_nm_VC(info);
		if (vc == columnDtl2_upd_ts) return doDtl2_upd_ts_VC(info);
		if (vc == columnDtl2_upd_srv_req_no) return doDtl2_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Dtl1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[aprv_func_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_func_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_func_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_d_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_d_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_src_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_src_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_src_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_src_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ins_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ins_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_d_tm_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_d_tm_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_biz_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ins_biz_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[main_role_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_main_role_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_role_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_role_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[next_opr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_next_opr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[acpt_check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_acpt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rjct_check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rjct_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_func_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_func_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_no_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_no_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_src_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_src_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_d_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_d_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[main_role_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_main_role_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_role_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_role_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_d_rmrks_up]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_d_rmrks_up_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char1_up]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char1_up_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char2_up]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char2_up_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char3_up]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char3_up_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_ins_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[biz_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_biz_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[biz_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_biz_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_cur_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_cur_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_amt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_amt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_cur_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_cur_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_amt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_amt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_cur_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_cur_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_amt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_amt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_ext_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_ext_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_ext_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_ext_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[src_ext_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_src_ext_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[next_opr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_next_opr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[not_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_not_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_up]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_d_sts_typ_up_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_d_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_d_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_d_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_d_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[deputy_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_deputy_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_deputy_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_deputy_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == Dtl1Table) doDtl1_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_aprv_func_typ) doCnd_aprv_func_typ_NC(info);
		else if (nc == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_NC(info);
		else if (nc == Cnd_aprv_d_sts_typ) doCnd_aprv_d_sts_typ_NC(info);
		else if (nc == Cnd_aprv_d_sts_typ_nm) doCnd_aprv_d_sts_typ_nm_NC(info);
		else if (nc == Cnd_aprv_no) doCnd_aprv_no_NC(info);
		else if (nc == Cnd_aprv_src_no1) doCnd_aprv_src_no1_NC(info);
		else if (nc == Cnd_aprv_src_no2) doCnd_aprv_src_no2_NC(info);
		else if (nc == Cnd_ins_dt_fr) doCnd_ins_dt_fr_NC(info);
		else if (nc == Cnd_ins_dt_to) doCnd_ins_dt_to_NC(info);
		else if (nc == Cnd_aprv_d_tm_fr) doCnd_aprv_d_tm_fr_NC(info);
		else if (nc == Cnd_aprv_d_tm_to) doCnd_aprv_d_tm_to_NC(info);
		else if (nc == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_NC(info);
		else if (nc == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_NC(info);
		else if (nc == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NC(info);
		else if (nc == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NC(info);
		else if (nc == Cnd_main_role_flg) doCnd_main_role_flg_NC(info);
		else if (nc == Cnd_sub_role_flg) doCnd_sub_role_flg_NC(info);
		else if (nc == Cnd_next_opr_flg) doCnd_next_opr_flg_NC(info);
		else if (nc == Cnd_not_upd_flg) doCnd_not_upd_flg_NC(info);
		else if (nc == columnDtl1_check) doDtl1_check_NC(info);
		else if (nc == columnDtl1_acpt_check) doDtl1_acpt_check_NC(info);
		else if (nc == columnDtl1_rjct_check) doDtl1_rjct_check_NC(info);
		else if (nc == columnDtl1_aprv_func_typ) doDtl1_aprv_func_typ_NC(info);
		else if (nc == columnDtl1_aprv_func_typ_nm) doDtl1_aprv_func_typ_nm_NC(info);
		else if (nc == columnDtl1_aprv_no) doDtl1_aprv_no_NC(info);
		else if (nc == columnDtl1_aprv_no_seq) doDtl1_aprv_no_seq_NC(info);
		else if (nc == columnDtl1_aprv_src_no1) doDtl1_aprv_src_no1_NC(info);
		else if (nc == columnDtl1_aprv_src_no2) doDtl1_aprv_src_no2_NC(info);
		else if (nc == columnDtl1_aprv_d_sts_typ) doDtl1_aprv_d_sts_typ_NC(info);
		else if (nc == columnDtl1_aprv_d_sts_typ_nm) doDtl1_aprv_d_sts_typ_nm_NC(info);
		else if (nc == columnDtl1_aprv_sts_typ) doDtl1_aprv_sts_typ_NC(info);
		else if (nc == columnDtl1_aprv_sts_typ_nm) doDtl1_aprv_sts_typ_nm_NC(info);
		else if (nc == columnDtl1_main_role_flg) doDtl1_main_role_flg_NC(info);
		else if (nc == columnDtl1_sub_role_flg) doDtl1_sub_role_flg_NC(info);
		else if (nc == columnDtl1_aprv_d_rmrks_up) doDtl1_aprv_d_rmrks_up_NC(info);
		else if (nc == columnDtl1_sub_char1_up) doDtl1_sub_char1_up_NC(info);
		else if (nc == columnDtl1_sub_char2_up) doDtl1_sub_char2_up_NC(info);
		else if (nc == columnDtl1_sub_char3_up) doDtl1_sub_char3_up_NC(info);
		else if (nc == columnDtl1_ins_dt) doDtl1_ins_dt_NC(info);
		else if (nc == columnDtl1_src_ins_usr_cd) doDtl1_src_ins_usr_cd_NC(info);
		else if (nc == columnDtl1_src_ins_usr_nm) doDtl1_src_ins_usr_nm_NC(info);
		else if (nc == columnDtl1_biz_usr_cd) doDtl1_biz_usr_cd_NC(info);
		else if (nc == columnDtl1_biz_usr_nm) doDtl1_biz_usr_nm_NC(info);
		else if (nc == columnDtl1_src_dpt_cd) doDtl1_src_dpt_cd_NC(info);
		else if (nc == columnDtl1_src_dpt_nm) doDtl1_src_dpt_nm_NC(info);
		else if (nc == columnDtl1_src_bp_cd) doDtl1_src_bp_cd_NC(info);
		else if (nc == columnDtl1_src_bp_nm) doDtl1_src_bp_nm_NC(info);
		else if (nc == columnDtl1_src_cur_cd1) doDtl1_src_cur_cd1_NC(info);
		else if (nc == columnDtl1_src_cur_nm1) doDtl1_src_cur_nm1_NC(info);
		else if (nc == columnDtl1_src_amt1) doDtl1_src_amt1_NC(info);
		else if (nc == columnDtl1_src_cur_cd2) doDtl1_src_cur_cd2_NC(info);
		else if (nc == columnDtl1_src_cur_nm2) doDtl1_src_cur_nm2_NC(info);
		else if (nc == columnDtl1_src_amt2) doDtl1_src_amt2_NC(info);
		else if (nc == columnDtl1_src_cur_cd3) doDtl1_src_cur_cd3_NC(info);
		else if (nc == columnDtl1_src_cur_nm3) doDtl1_src_cur_nm3_NC(info);
		else if (nc == columnDtl1_src_amt3) doDtl1_src_amt3_NC(info);
		else if (nc == columnDtl1_src_ext_key1) doDtl1_src_ext_key1_NC(info);
		else if (nc == columnDtl1_src_ext_key2) doDtl1_src_ext_key2_NC(info);
		else if (nc == columnDtl1_src_ext_key3) doDtl1_src_ext_key3_NC(info);
		else if (nc == columnDtl1_next_opr_flg) doDtl1_next_opr_flg_NC(info);
		else if (nc == columnDtl1_not_upd_flg) doDtl1_not_upd_flg_NC(info);
		else if (nc == columnDtl1_upd_cntr) doDtl1_upd_cntr_NC(info);
		else if (nc == columnDtl1_aprv_usr_cd) doDtl1_aprv_usr_cd_NC(info);
		else if (nc == columnDtl1_aprv_d_sts_typ_up) doDtl1_aprv_d_sts_typ_up_NC(info);
		else if (nc == columnDtl1_aprv_role_cd) doDtl1_aprv_role_cd_NC(info);
		else if (nc == columnDtl2_aprv_seq) doDtl2_aprv_seq_NC(info);
		else if (nc == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_NC(info);
		else if (nc == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_NC(info);
		else if (nc == columnDtl2_aprv_d_sts_typ) doDtl2_aprv_d_sts_typ_NC(info);
		else if (nc == columnDtl2_aprv_d_sts_typ_nm) doDtl2_aprv_d_sts_typ_nm_NC(info);
		else if (nc == columnDtl2_aprv_d_tm) doDtl2_aprv_d_tm_NC(info);
		else if (nc == columnDtl2_deputy_flg) doDtl2_deputy_flg_NC(info);
		else if (nc == columnDtl2_deputy_usr_cd) doDtl2_deputy_usr_cd_NC(info);
		else if (nc == columnDtl2_deputy_usr_nm) doDtl2_deputy_usr_nm_NC(info);
		else if (nc == columnDtl2_aprv_role_cd) doDtl2_aprv_role_cd_NC(info);
		else if (nc == columnDtl2_aprv_role_nm) doDtl2_aprv_role_nm_NC(info);
		else if (nc == columnDtl2_aprv_d_rmrks) doDtl2_aprv_d_rmrks_NC(info);
		else if (nc == columnDtl2_sub_char1) doDtl2_sub_char1_NC(info);
		else if (nc == columnDtl2_sub_char2) doDtl2_sub_char2_NC(info);
		else if (nc == columnDtl2_sub_char3) doDtl2_sub_char3_NC(info);
		else if (nc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NC(info);
		else if (nc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NC(info);
		else if (nc == columnDtl2_ins_func_id) doDtl2_ins_func_id_NC(info);
		else if (nc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NC(info);
		else if (nc == columnDtl2_ins_ts) doDtl2_ins_ts_NC(info);
		else if (nc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NC(info);
		else if (nc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NC(info);
		else if (nc == columnDtl2_upd_func_id) doDtl2_upd_func_id_NC(info);
		else if (nc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NC(info);
		else if (nc == columnDtl2_upd_ts) doDtl2_upd_ts_NC(info);
		else if (nc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_role_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_role_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_role_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_role_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[next_opr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_next_opr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[acpt_check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_acpt_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rjct_check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rjct_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[main_role_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_main_role_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_role_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_role_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_rmrks_up]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_rmrks_up_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1_up]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_up_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2_up]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_up_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3_up]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_up_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[next_opr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_next_opr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[not_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_not_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_up]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_up_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_tm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Dtl1Table) doDtl1_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_aprv_func_typ) doCnd_aprv_func_typ_NE(info);
		else if (ne == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_NE(info);
		else if (ne == Cnd_aprv_d_sts_typ) doCnd_aprv_d_sts_typ_NE(info);
		else if (ne == Cnd_aprv_d_sts_typ_nm) doCnd_aprv_d_sts_typ_nm_NE(info);
		else if (ne == Cnd_aprv_no) doCnd_aprv_no_NE(info);
		else if (ne == Cnd_aprv_src_no1) doCnd_aprv_src_no1_NE(info);
		else if (ne == Cnd_aprv_src_no2) doCnd_aprv_src_no2_NE(info);
		else if (ne == Cnd_ins_dt_fr) doCnd_ins_dt_fr_NE(info);
		else if (ne == Cnd_ins_dt_to) doCnd_ins_dt_to_NE(info);
		else if (ne == Cnd_aprv_d_tm_fr) doCnd_aprv_d_tm_fr_NE(info);
		else if (ne == Cnd_aprv_d_tm_to) doCnd_aprv_d_tm_to_NE(info);
		else if (ne == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_NE(info);
		else if (ne == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_NE(info);
		else if (ne == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NE(info);
		else if (ne == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NE(info);
		else if (ne == Cnd_main_role_flg) doCnd_main_role_flg_NE(info);
		else if (ne == Cnd_sub_role_flg) doCnd_sub_role_flg_NE(info);
		else if (ne == Cnd_next_opr_flg) doCnd_next_opr_flg_NE(info);
		else if (ne == Cnd_not_upd_flg) doCnd_not_upd_flg_NE(info);
		else if (ne == columnDtl1_check) doDtl1_check_NE(info);
		else if (ne == columnDtl1_acpt_check) doDtl1_acpt_check_NE(info);
		else if (ne == columnDtl1_rjct_check) doDtl1_rjct_check_NE(info);
		else if (ne == columnDtl1_aprv_func_typ) doDtl1_aprv_func_typ_NE(info);
		else if (ne == columnDtl1_aprv_func_typ_nm) doDtl1_aprv_func_typ_nm_NE(info);
		else if (ne == columnDtl1_aprv_no) doDtl1_aprv_no_NE(info);
		else if (ne == columnDtl1_aprv_no_seq) doDtl1_aprv_no_seq_NE(info);
		else if (ne == columnDtl1_aprv_src_no1) doDtl1_aprv_src_no1_NE(info);
		else if (ne == columnDtl1_aprv_src_no2) doDtl1_aprv_src_no2_NE(info);
		else if (ne == columnDtl1_aprv_d_sts_typ) doDtl1_aprv_d_sts_typ_NE(info);
		else if (ne == columnDtl1_aprv_d_sts_typ_nm) doDtl1_aprv_d_sts_typ_nm_NE(info);
		else if (ne == columnDtl1_aprv_sts_typ) doDtl1_aprv_sts_typ_NE(info);
		else if (ne == columnDtl1_aprv_sts_typ_nm) doDtl1_aprv_sts_typ_nm_NE(info);
		else if (ne == columnDtl1_main_role_flg) doDtl1_main_role_flg_NE(info);
		else if (ne == columnDtl1_sub_role_flg) doDtl1_sub_role_flg_NE(info);
		else if (ne == columnDtl1_aprv_d_rmrks_up) doDtl1_aprv_d_rmrks_up_NE(info);
		else if (ne == columnDtl1_sub_char1_up) doDtl1_sub_char1_up_NE(info);
		else if (ne == columnDtl1_sub_char2_up) doDtl1_sub_char2_up_NE(info);
		else if (ne == columnDtl1_sub_char3_up) doDtl1_sub_char3_up_NE(info);
		else if (ne == columnDtl1_ins_dt) doDtl1_ins_dt_NE(info);
		else if (ne == columnDtl1_src_ins_usr_cd) doDtl1_src_ins_usr_cd_NE(info);
		else if (ne == columnDtl1_src_ins_usr_nm) doDtl1_src_ins_usr_nm_NE(info);
		else if (ne == columnDtl1_biz_usr_cd) doDtl1_biz_usr_cd_NE(info);
		else if (ne == columnDtl1_biz_usr_nm) doDtl1_biz_usr_nm_NE(info);
		else if (ne == columnDtl1_src_dpt_cd) doDtl1_src_dpt_cd_NE(info);
		else if (ne == columnDtl1_src_dpt_nm) doDtl1_src_dpt_nm_NE(info);
		else if (ne == columnDtl1_src_bp_cd) doDtl1_src_bp_cd_NE(info);
		else if (ne == columnDtl1_src_bp_nm) doDtl1_src_bp_nm_NE(info);
		else if (ne == columnDtl1_src_cur_cd1) doDtl1_src_cur_cd1_NE(info);
		else if (ne == columnDtl1_src_cur_nm1) doDtl1_src_cur_nm1_NE(info);
		else if (ne == columnDtl1_src_amt1) doDtl1_src_amt1_NE(info);
		else if (ne == columnDtl1_src_cur_cd2) doDtl1_src_cur_cd2_NE(info);
		else if (ne == columnDtl1_src_cur_nm2) doDtl1_src_cur_nm2_NE(info);
		else if (ne == columnDtl1_src_amt2) doDtl1_src_amt2_NE(info);
		else if (ne == columnDtl1_src_cur_cd3) doDtl1_src_cur_cd3_NE(info);
		else if (ne == columnDtl1_src_cur_nm3) doDtl1_src_cur_nm3_NE(info);
		else if (ne == columnDtl1_src_amt3) doDtl1_src_amt3_NE(info);
		else if (ne == columnDtl1_src_ext_key1) doDtl1_src_ext_key1_NE(info);
		else if (ne == columnDtl1_src_ext_key2) doDtl1_src_ext_key2_NE(info);
		else if (ne == columnDtl1_src_ext_key3) doDtl1_src_ext_key3_NE(info);
		else if (ne == columnDtl1_next_opr_flg) doDtl1_next_opr_flg_NE(info);
		else if (ne == columnDtl1_not_upd_flg) doDtl1_not_upd_flg_NE(info);
		else if (ne == columnDtl1_upd_cntr) doDtl1_upd_cntr_NE(info);
		else if (ne == columnDtl1_aprv_usr_cd) doDtl1_aprv_usr_cd_NE(info);
		else if (ne == columnDtl1_aprv_d_sts_typ_up) doDtl1_aprv_d_sts_typ_up_NE(info);
		else if (ne == columnDtl1_aprv_role_cd) doDtl1_aprv_role_cd_NE(info);
		else if (ne == columnDtl2_aprv_seq) doDtl2_aprv_seq_NE(info);
		else if (ne == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_NE(info);
		else if (ne == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_NE(info);
		else if (ne == columnDtl2_aprv_d_sts_typ) doDtl2_aprv_d_sts_typ_NE(info);
		else if (ne == columnDtl2_aprv_d_sts_typ_nm) doDtl2_aprv_d_sts_typ_nm_NE(info);
		else if (ne == columnDtl2_aprv_d_tm) doDtl2_aprv_d_tm_NE(info);
		else if (ne == columnDtl2_deputy_flg) doDtl2_deputy_flg_NE(info);
		else if (ne == columnDtl2_deputy_usr_cd) doDtl2_deputy_usr_cd_NE(info);
		else if (ne == columnDtl2_deputy_usr_nm) doDtl2_deputy_usr_nm_NE(info);
		else if (ne == columnDtl2_aprv_role_cd) doDtl2_aprv_role_cd_NE(info);
		else if (ne == columnDtl2_aprv_role_nm) doDtl2_aprv_role_nm_NE(info);
		else if (ne == columnDtl2_aprv_d_rmrks) doDtl2_aprv_d_rmrks_NE(info);
		else if (ne == columnDtl2_sub_char1) doDtl2_sub_char1_NE(info);
		else if (ne == columnDtl2_sub_char2) doDtl2_sub_char2_NE(info);
		else if (ne == columnDtl2_sub_char3) doDtl2_sub_char3_NE(info);
		else if (ne == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NE(info);
		else if (ne == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NE(info);
		else if (ne == columnDtl2_ins_func_id) doDtl2_ins_func_id_NE(info);
		else if (ne == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NE(info);
		else if (ne == columnDtl2_ins_ts) doDtl2_ins_ts_NE(info);
		else if (ne == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NE(info);
		else if (ne == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NE(info);
		else if (ne == columnDtl2_upd_func_id) doDtl2_upd_func_id_NE(info);
		else if (ne == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NE(info);
		else if (ne == columnDtl2_upd_ts) doDtl2_upd_ts_NE(info);
		else if (ne == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_role_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_role_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_role_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_role_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[next_opr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_next_opr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[acpt_check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_acpt_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rjct_check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rjct_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[main_role_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_main_role_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_role_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_role_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_rmrks_up]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_rmrks_up_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1_up]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_up_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2_up]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_up_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3_up]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_up_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[next_opr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_next_opr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[not_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_not_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_up]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_up_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_tm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Dtl1Table) doDtl1_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_aprv_func_typ) doCnd_aprv_func_typ_NX(info);
		else if (nx == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_NX(info);
		else if (nx == Cnd_aprv_d_sts_typ) doCnd_aprv_d_sts_typ_NX(info);
		else if (nx == Cnd_aprv_d_sts_typ_nm) doCnd_aprv_d_sts_typ_nm_NX(info);
		else if (nx == Cnd_aprv_no) doCnd_aprv_no_NX(info);
		else if (nx == Cnd_aprv_src_no1) doCnd_aprv_src_no1_NX(info);
		else if (nx == Cnd_aprv_src_no2) doCnd_aprv_src_no2_NX(info);
		else if (nx == Cnd_ins_dt_fr) doCnd_ins_dt_fr_NX(info);
		else if (nx == Cnd_ins_dt_to) doCnd_ins_dt_to_NX(info);
		else if (nx == Cnd_aprv_d_tm_fr) doCnd_aprv_d_tm_fr_NX(info);
		else if (nx == Cnd_aprv_d_tm_to) doCnd_aprv_d_tm_to_NX(info);
		else if (nx == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_NX(info);
		else if (nx == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_NX(info);
		else if (nx == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NX(info);
		else if (nx == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NX(info);
		else if (nx == Cnd_main_role_flg) doCnd_main_role_flg_NX(info);
		else if (nx == Cnd_sub_role_flg) doCnd_sub_role_flg_NX(info);
		else if (nx == Cnd_next_opr_flg) doCnd_next_opr_flg_NX(info);
		else if (nx == Cnd_not_upd_flg) doCnd_not_upd_flg_NX(info);
		else if (nx == columnDtl1_check) doDtl1_check_NX(info);
		else if (nx == columnDtl1_acpt_check) doDtl1_acpt_check_NX(info);
		else if (nx == columnDtl1_rjct_check) doDtl1_rjct_check_NX(info);
		else if (nx == columnDtl1_aprv_func_typ) doDtl1_aprv_func_typ_NX(info);
		else if (nx == columnDtl1_aprv_func_typ_nm) doDtl1_aprv_func_typ_nm_NX(info);
		else if (nx == columnDtl1_aprv_no) doDtl1_aprv_no_NX(info);
		else if (nx == columnDtl1_aprv_no_seq) doDtl1_aprv_no_seq_NX(info);
		else if (nx == columnDtl1_aprv_src_no1) doDtl1_aprv_src_no1_NX(info);
		else if (nx == columnDtl1_aprv_src_no2) doDtl1_aprv_src_no2_NX(info);
		else if (nx == columnDtl1_aprv_d_sts_typ) doDtl1_aprv_d_sts_typ_NX(info);
		else if (nx == columnDtl1_aprv_d_sts_typ_nm) doDtl1_aprv_d_sts_typ_nm_NX(info);
		else if (nx == columnDtl1_aprv_sts_typ) doDtl1_aprv_sts_typ_NX(info);
		else if (nx == columnDtl1_aprv_sts_typ_nm) doDtl1_aprv_sts_typ_nm_NX(info);
		else if (nx == columnDtl1_main_role_flg) doDtl1_main_role_flg_NX(info);
		else if (nx == columnDtl1_sub_role_flg) doDtl1_sub_role_flg_NX(info);
		else if (nx == columnDtl1_aprv_d_rmrks_up) doDtl1_aprv_d_rmrks_up_NX(info);
		else if (nx == columnDtl1_sub_char1_up) doDtl1_sub_char1_up_NX(info);
		else if (nx == columnDtl1_sub_char2_up) doDtl1_sub_char2_up_NX(info);
		else if (nx == columnDtl1_sub_char3_up) doDtl1_sub_char3_up_NX(info);
		else if (nx == columnDtl1_ins_dt) doDtl1_ins_dt_NX(info);
		else if (nx == columnDtl1_src_ins_usr_cd) doDtl1_src_ins_usr_cd_NX(info);
		else if (nx == columnDtl1_src_ins_usr_nm) doDtl1_src_ins_usr_nm_NX(info);
		else if (nx == columnDtl1_biz_usr_cd) doDtl1_biz_usr_cd_NX(info);
		else if (nx == columnDtl1_biz_usr_nm) doDtl1_biz_usr_nm_NX(info);
		else if (nx == columnDtl1_src_dpt_cd) doDtl1_src_dpt_cd_NX(info);
		else if (nx == columnDtl1_src_dpt_nm) doDtl1_src_dpt_nm_NX(info);
		else if (nx == columnDtl1_src_bp_cd) doDtl1_src_bp_cd_NX(info);
		else if (nx == columnDtl1_src_bp_nm) doDtl1_src_bp_nm_NX(info);
		else if (nx == columnDtl1_src_cur_cd1) doDtl1_src_cur_cd1_NX(info);
		else if (nx == columnDtl1_src_cur_nm1) doDtl1_src_cur_nm1_NX(info);
		else if (nx == columnDtl1_src_amt1) doDtl1_src_amt1_NX(info);
		else if (nx == columnDtl1_src_cur_cd2) doDtl1_src_cur_cd2_NX(info);
		else if (nx == columnDtl1_src_cur_nm2) doDtl1_src_cur_nm2_NX(info);
		else if (nx == columnDtl1_src_amt2) doDtl1_src_amt2_NX(info);
		else if (nx == columnDtl1_src_cur_cd3) doDtl1_src_cur_cd3_NX(info);
		else if (nx == columnDtl1_src_cur_nm3) doDtl1_src_cur_nm3_NX(info);
		else if (nx == columnDtl1_src_amt3) doDtl1_src_amt3_NX(info);
		else if (nx == columnDtl1_src_ext_key1) doDtl1_src_ext_key1_NX(info);
		else if (nx == columnDtl1_src_ext_key2) doDtl1_src_ext_key2_NX(info);
		else if (nx == columnDtl1_src_ext_key3) doDtl1_src_ext_key3_NX(info);
		else if (nx == columnDtl1_next_opr_flg) doDtl1_next_opr_flg_NX(info);
		else if (nx == columnDtl1_not_upd_flg) doDtl1_not_upd_flg_NX(info);
		else if (nx == columnDtl1_upd_cntr) doDtl1_upd_cntr_NX(info);
		else if (nx == columnDtl1_aprv_usr_cd) doDtl1_aprv_usr_cd_NX(info);
		else if (nx == columnDtl1_aprv_d_sts_typ_up) doDtl1_aprv_d_sts_typ_up_NX(info);
		else if (nx == columnDtl1_aprv_role_cd) doDtl1_aprv_role_cd_NX(info);
		else if (nx == columnDtl2_aprv_seq) doDtl2_aprv_seq_NX(info);
		else if (nx == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_NX(info);
		else if (nx == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_NX(info);
		else if (nx == columnDtl2_aprv_d_sts_typ) doDtl2_aprv_d_sts_typ_NX(info);
		else if (nx == columnDtl2_aprv_d_sts_typ_nm) doDtl2_aprv_d_sts_typ_nm_NX(info);
		else if (nx == columnDtl2_aprv_d_tm) doDtl2_aprv_d_tm_NX(info);
		else if (nx == columnDtl2_deputy_flg) doDtl2_deputy_flg_NX(info);
		else if (nx == columnDtl2_deputy_usr_cd) doDtl2_deputy_usr_cd_NX(info);
		else if (nx == columnDtl2_deputy_usr_nm) doDtl2_deputy_usr_nm_NX(info);
		else if (nx == columnDtl2_aprv_role_cd) doDtl2_aprv_role_cd_NX(info);
		else if (nx == columnDtl2_aprv_role_nm) doDtl2_aprv_role_nm_NX(info);
		else if (nx == columnDtl2_aprv_d_rmrks) doDtl2_aprv_d_rmrks_NX(info);
		else if (nx == columnDtl2_sub_char1) doDtl2_sub_char1_NX(info);
		else if (nx == columnDtl2_sub_char2) doDtl2_sub_char2_NX(info);
		else if (nx == columnDtl2_sub_char3) doDtl2_sub_char3_NX(info);
		else if (nx == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NX(info);
		else if (nx == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NX(info);
		else if (nx == columnDtl2_ins_func_id) doDtl2_ins_func_id_NX(info);
		else if (nx == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NX(info);
		else if (nx == columnDtl2_ins_ts) doDtl2_ins_ts_NX(info);
		else if (nx == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NX(info);
		else if (nx == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NX(info);
		else if (nx == columnDtl2_upd_func_id) doDtl2_upd_func_id_NX(info);
		else if (nx == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NX(info);
		else if (nx == columnDtl2_upd_ts) doDtl2_upd_ts_NX(info);
		else if (nx == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[main_role_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_main_role_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_role_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_role_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[next_opr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_next_opr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[acpt_check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_acpt_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rjct_check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rjct_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[main_role_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_main_role_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_role_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_role_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_rmrks_up]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_rmrks_up_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1_up]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_up_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2_up]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_up_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3_up]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_up_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[next_opr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_next_opr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[not_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_not_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_up]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_up_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_tm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_aprv_func_typ) doCnd_aprv_func_typ_LC(info);
		else if (lc == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_LC(info);
		else if (lc == Cnd_aprv_d_sts_typ) doCnd_aprv_d_sts_typ_LC(info);
		else if (lc == Cnd_aprv_d_sts_typ_nm) doCnd_aprv_d_sts_typ_nm_LC(info);
		else if (lc == Cnd_aprv_no) doCnd_aprv_no_LC(info);
		else if (lc == Cnd_aprv_src_no1) doCnd_aprv_src_no1_LC(info);
		else if (lc == Cnd_aprv_src_no2) doCnd_aprv_src_no2_LC(info);
		else if (lc == Cnd_ins_dt_fr) doCnd_ins_dt_fr_LC(info);
		else if (lc == Cnd_ins_dt_to) doCnd_ins_dt_to_LC(info);
		else if (lc == Cnd_aprv_d_tm_fr) doCnd_aprv_d_tm_fr_LC(info);
		else if (lc == Cnd_aprv_d_tm_to) doCnd_aprv_d_tm_to_LC(info);
		else if (lc == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_LC(info);
		else if (lc == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_LC(info);
		else if (lc == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_LC(info);
		else if (lc == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_LC(info);
		else if (lc == columnDtl1_aprv_func_typ) doDtl1_aprv_func_typ_LC(info);
		else if (lc == columnDtl1_aprv_func_typ_nm) doDtl1_aprv_func_typ_nm_LC(info);
		else if (lc == columnDtl1_aprv_no) doDtl1_aprv_no_LC(info);
		else if (lc == columnDtl1_aprv_no_seq) doDtl1_aprv_no_seq_LC(info);
		else if (lc == columnDtl1_aprv_src_no1) doDtl1_aprv_src_no1_LC(info);
		else if (lc == columnDtl1_aprv_src_no2) doDtl1_aprv_src_no2_LC(info);
		else if (lc == columnDtl1_aprv_d_sts_typ) doDtl1_aprv_d_sts_typ_LC(info);
		else if (lc == columnDtl1_aprv_d_sts_typ_nm) doDtl1_aprv_d_sts_typ_nm_LC(info);
		else if (lc == columnDtl1_aprv_sts_typ) doDtl1_aprv_sts_typ_LC(info);
		else if (lc == columnDtl1_aprv_sts_typ_nm) doDtl1_aprv_sts_typ_nm_LC(info);
		else if (lc == columnDtl1_aprv_d_rmrks_up) doDtl1_aprv_d_rmrks_up_LC(info);
		else if (lc == columnDtl1_sub_char1_up) doDtl1_sub_char1_up_LC(info);
		else if (lc == columnDtl1_sub_char2_up) doDtl1_sub_char2_up_LC(info);
		else if (lc == columnDtl1_sub_char3_up) doDtl1_sub_char3_up_LC(info);
		else if (lc == columnDtl1_ins_dt) doDtl1_ins_dt_LC(info);
		else if (lc == columnDtl1_src_ins_usr_cd) doDtl1_src_ins_usr_cd_LC(info);
		else if (lc == columnDtl1_src_ins_usr_nm) doDtl1_src_ins_usr_nm_LC(info);
		else if (lc == columnDtl1_biz_usr_cd) doDtl1_biz_usr_cd_LC(info);
		else if (lc == columnDtl1_biz_usr_nm) doDtl1_biz_usr_nm_LC(info);
		else if (lc == columnDtl1_src_dpt_cd) doDtl1_src_dpt_cd_LC(info);
		else if (lc == columnDtl1_src_dpt_nm) doDtl1_src_dpt_nm_LC(info);
		else if (lc == columnDtl1_src_bp_cd) doDtl1_src_bp_cd_LC(info);
		else if (lc == columnDtl1_src_bp_nm) doDtl1_src_bp_nm_LC(info);
		else if (lc == columnDtl1_src_cur_cd1) doDtl1_src_cur_cd1_LC(info);
		else if (lc == columnDtl1_src_cur_nm1) doDtl1_src_cur_nm1_LC(info);
		else if (lc == columnDtl1_src_amt1) doDtl1_src_amt1_LC(info);
		else if (lc == columnDtl1_src_cur_cd2) doDtl1_src_cur_cd2_LC(info);
		else if (lc == columnDtl1_src_cur_nm2) doDtl1_src_cur_nm2_LC(info);
		else if (lc == columnDtl1_src_amt2) doDtl1_src_amt2_LC(info);
		else if (lc == columnDtl1_src_cur_cd3) doDtl1_src_cur_cd3_LC(info);
		else if (lc == columnDtl1_src_cur_nm3) doDtl1_src_cur_nm3_LC(info);
		else if (lc == columnDtl1_src_amt3) doDtl1_src_amt3_LC(info);
		else if (lc == columnDtl1_src_ext_key1) doDtl1_src_ext_key1_LC(info);
		else if (lc == columnDtl1_src_ext_key2) doDtl1_src_ext_key2_LC(info);
		else if (lc == columnDtl1_src_ext_key3) doDtl1_src_ext_key3_LC(info);
		else if (lc == columnDtl1_upd_cntr) doDtl1_upd_cntr_LC(info);
		else if (lc == columnDtl1_aprv_usr_cd) doDtl1_aprv_usr_cd_LC(info);
		else if (lc == columnDtl1_aprv_d_sts_typ_up) doDtl1_aprv_d_sts_typ_up_LC(info);
		else if (lc == columnDtl1_aprv_role_cd) doDtl1_aprv_role_cd_LC(info);
		else if (lc == columnDtl2_aprv_seq) doDtl2_aprv_seq_LC(info);
		else if (lc == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_LC(info);
		else if (lc == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_LC(info);
		else if (lc == columnDtl2_aprv_d_sts_typ) doDtl2_aprv_d_sts_typ_LC(info);
		else if (lc == columnDtl2_aprv_d_sts_typ_nm) doDtl2_aprv_d_sts_typ_nm_LC(info);
		else if (lc == columnDtl2_aprv_d_tm) doDtl2_aprv_d_tm_LC(info);
		else if (lc == columnDtl2_deputy_usr_cd) doDtl2_deputy_usr_cd_LC(info);
		else if (lc == columnDtl2_deputy_usr_nm) doDtl2_deputy_usr_nm_LC(info);
		else if (lc == columnDtl2_aprv_role_cd) doDtl2_aprv_role_cd_LC(info);
		else if (lc == columnDtl2_aprv_role_nm) doDtl2_aprv_role_nm_LC(info);
		else if (lc == columnDtl2_aprv_d_rmrks) doDtl2_aprv_d_rmrks_LC(info);
		else if (lc == columnDtl2_sub_char1) doDtl2_sub_char1_LC(info);
		else if (lc == columnDtl2_sub_char2) doDtl2_sub_char2_LC(info);
		else if (lc == columnDtl2_sub_char3) doDtl2_sub_char3_LC(info);
		else if (lc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_LC(info);
		else if (lc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_LC(info);
		else if (lc == columnDtl2_ins_func_id) doDtl2_ins_func_id_LC(info);
		else if (lc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_LC(info);
		else if (lc == columnDtl2_ins_ts) doDtl2_ins_ts_LC(info);
		else if (lc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_LC(info);
		else if (lc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_LC(info);
		else if (lc == columnDtl2_upd_func_id) doDtl2_upd_func_id_LC(info);
		else if (lc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_LC(info);
		else if (lc == columnDtl2_upd_ts) doDtl2_upd_ts_LC(info);
		else if (lc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_func_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_func_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_src_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_src_no2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_d_tm_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_d_tm_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ins_biz_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ins_biz_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_func_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_func_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_no_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_no_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_src_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_src_no2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_rmrks_up]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_rmrks_up_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1_up]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_up_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2_up]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_up_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3_up]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_up_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[biz_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_biz_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_cur_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_cur_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_amt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_amt3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[src_ext_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_src_ext_key3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_d_sts_typ_up]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_d_sts_typ_up_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_tm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[deputy_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_deputy_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_func_typ]の作成メソッド
	 */
	public MCList getCnd_aprv_func_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvFuncTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_d_sts_typ]の作成メソッド
	 */
	public MCList getCnd_aprv_d_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvDStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ins_biz_usr_cd]の作成メソッド
	 */
	public MCList getCnd_ins_biz_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_usr_cd]の作成メソッド
	 */
	public MCList getCnd_aprv_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBAL0020.Srch01")) {
			return new MB_MBBAL0020_Srch01Bridge();
		}
		if (id.equals("MB.MBBAL0020.Upd01")) {
			return new MB_MBBAL0020_Upd01Bridge();
		}
		if (id.equals("MB.MBBAL0020.Upd02")) {
			return new MB_MBBAL0020_Upd02Bridge();
		}
		if (id.equals("MB.MBBAL0020.Upd03")) {
			return new MB_MBBAL0020_Upd03Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBAL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBAL0020_Srch01;

		/** コンストラクタ */
		protected MB_MBBAL0020_Srch01Bridge() {
			p_MB_MBBAL0020_Srch01 = new MCParam(PDef.MB_MBBAL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBAL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBA.MBBAP0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));

			p_MB_MBBAL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBAL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBAL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBAL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBAL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBA.MBBAP0020.CndR up0() {
			return (mcframe.clientMBBA.MBBAP0020.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> down0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBAL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBAL0020_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)p_MB_MBBAL0020_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MB_MBBAL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBAL0020_Upd01;

		/** コンストラクタ */
		protected MB_MBBAL0020_Upd01Bridge() {
			p_MB_MBBAL0020_Upd01 = new MCParam(PDef.MB_MBBAL0020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBAL0020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));

			p_MB_MBBAL0020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBAL0020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBAL0020_Upd01.addUpBlock(getDtl1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBAL0020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBAL0020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> up0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> down0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBAL0020_Upd01.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBAL0020_Upd01;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)p_MB_MBBAL0020_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
	}
	/**
	 * [MB_MBBAL0020_Upd02]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBAL0020_Upd02;

		/** コンストラクタ */
		protected MB_MBBAL0020_Upd02Bridge() {
			p_MB_MBBAL0020_Upd02 = new MCParam(PDef.MB_MBBAL0020_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBAL0020_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));

			p_MB_MBBAL0020_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBAL0020_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBAL0020_Upd02.addUpBlock(getDtl1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBAL0020_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBAL0020_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> up0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> down0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBAL0020_Upd02.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBAL0020_Upd02;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)p_MB_MBBAL0020_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
	}
	/**
	 * [MB_MBBAL0020_Upd03]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0020_Upd03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBAL0020_Upd03;

		/** コンストラクタ */
		protected MB_MBBAL0020_Upd03Bridge() {
			p_MB_MBBAL0020_Upd03 = new MCParam(PDef.MB_MBBAL0020_Upd03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBAL0020_Upd03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));

			p_MB_MBBAL0020_Upd03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBAL0020_Upd03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBAL0020_Upd03.addUpBlock(getDtl1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBAL0020_Upd03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBAL0020_Upd03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> up0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMBBA.MBBAP0020.DtlR> down0() {
			return (MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBAL0020_Upd03.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0020.DtlR.class));
		}
		protected MCParam param() {
			return p_MB_MBBAL0020_Upd03;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMBBA.MBBAP0020.DtlR>)p_MB_MBBAL0020_Upd03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
	}
}