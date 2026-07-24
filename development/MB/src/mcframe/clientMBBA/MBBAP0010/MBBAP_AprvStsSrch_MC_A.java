package mcframe.clientMBBA.MBBAP0010;

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
import mcframe.clientMBBA.MBBAP0010.MBBAP_AprvStsSrch_MC.MB_MBBAL0010_Srch01Caller;

/**
 * 画面"MBBAP_AprvStsSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBAP_AprvStsSrch_MC_A extends mcframe.clientMBUD.MBUDP0010.MBUDP_PanelBase{
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
	public static final String SCREEN_ID = "MBBAP0010";

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
	 * SRCH,View (PIC);SRCH_ADMIN,View (Administrator) SRCH,参照する（担当者）;SRCH_ADMIN,参照する（管理者）.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SRCH = null;
	public MCRadioButton Cnd_ope_SRCH_ADMIN = null;
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
	public MCLabel Cnd_aprv_sts_typ_Label = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_sts_typ_nm = null;
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
	/**
	 * Including PIC details 担当者詳細含む.<p>
	 *
	 */
	public MCCheckBox Cnd_usr_dtl_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Search (Administrator) 検索する（管理者）.<p>
	 *
	 */
	public MCButton RPnl_srch_admin = null;
	// [Body]ブロック関連のField定義
	public MCPanel BodyPanel = null;
	// [Body]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMBBA.MBBAP0010.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_func_typ = null;
	/**
	 * Approval function type name 承認機能区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_func_typ_nm = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_no = null;
	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_no_seq = null;
	/**
	 * Approval creating source No. 1 承認作成元ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_src_no1 = null;
	/**
	 * Approval creating source No. 2 承認作成元ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_src_no2 = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_sts_typ_nm = null;
	/**
	 * Final approver date and time 最終承認日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_aprv_tm = null;
	/**
	 * Final approver cd. 最終承認者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_aprv_usr_cd = null;
	/**
	 * Final approver name 最終承認者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_aprv_usr_nm = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_dt = null;
	/**
	 * Entry PIC cd. 登録担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_usr_cd = null;
	/**
	 * Entry PIC name 登録担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_usr_nm = null;
	/**
	 * Business PIC cd. 業務担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_biz_usr_cd = null;
	/**
	 * Business PIC name 業務担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_biz_usr_nm = null;
	/**
	 * Approval requesting dept. cd. 承認依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_dpt_cd = null;
	/**
	 * Approval requesting dept. name 承認依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_dpt_nm = null;
	/**
	 * Approval requesting customer cd. 承認依頼元取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_bp_cd = null;
	/**
	 * Approval requesting customer name 承認依頼元取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_bp_nm = null;
	/**
	 * Approval request source currency cd. 1 承認依頼元通貨ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_cur_cd1 = null;
	/**
	 * Approval request source currency name 1 承認依頼元通貨名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_cur_nm1 = null;
	/**
	 * Approval request source amount 1 承認依頼元金額１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_amt1 = null;
	/**
	 * Approval request source currency cd. 2 承認依頼元通貨ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_cur_cd2 = null;
	/**
	 * Approval request source currency name 2 承認依頼元通貨名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_cur_nm2 = null;
	/**
	 * Approval request source amount 2 承認依頼元金額２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_amt2 = null;
	/**
	 * Approval request source currency cd. 3 承認依頼元通貨ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_cur_cd3 = null;
	/**
	 * Approval request source currency name 3 承認依頼元通貨名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_cur_nm3 = null;
	/**
	 * Approval request source amount 3 承認依頼元金額３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_amt3 = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_src_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_src_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_src_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_src_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_src_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_src_itm_nm]としてエイリアス定義。
	/**
	 * Approval request source extended column 1 承認依頼元拡張項目１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ext_key1 = null;
	/**
	 * Approval request source extended column 2 承認依頼元拡張項目２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ext_key2 = null;
	/**
	 * Approval request source extended column 3 承認依頼元拡張項目３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ext_key3 = null;
	/**
	 * Next completed process 次処理済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_next_opr_flg = null;
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_upd_flg = null;
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_can_flg = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMBBA.MBBAP0010.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_no = null;
	/**
	 * Approval sequence number 承認ＮＯ連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_aprv_no_seq = null;
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
	 * Main PIC E-mail 1 主担当者Ｅ－ｍａｉｌ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_email1 = null;
	/**
	 * Main PIC E-mail 2 主担当者Ｅ－ｍａｉｌ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_email2 = null;
	/**
	 * Main PIC E-mail 3 主担当者Ｅ－ｍａｉｌ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_email3 = null;
	/**
	 * Main PIC TEL 1 主担当者ＴＥＬ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_tel1 = null;
	/**
	 * Main PIC TEL 2 主担当者ＴＥＬ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_tel2 = null;
	/**
	 * Main PIC TEL 3 主担当者ＴＥＬ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_tel3 = null;
	/**
	 * Main PIC image 主担当者画像.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_th_image = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [SRCH_ADMIN]モードを表す定数 */
	public static final String SRCH_ADMIN = "SRCH_ADMIN";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [REF_ADMIN]モードを表す定数 */
	public static final String REF_ADMIN = "REF_ADMIN";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_ADMIN, REF, REF_ADMIN};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MB_MBBAL0010_Srch01]のCallerの作成 */
	protected MBBAP_AprvStsSrch_MC.MB_MBBAL0010_Srch01Caller createMB_MBBAL0010_Srch01() {
		MBBAP_AprvStsSrch_MC.MB_MBBAL0010_Srch01Caller<MBBAP_AprvStsSrch, MB_MBBAL0010_Srch01Bridge>
		caller = ((MBBAP_AprvStsSrch_MC)this).new MB_MBBAL0010_Srch01Caller<MBBAP_AprvStsSrch, MB_MBBAL0010_Srch01Bridge>(
					(MBBAP_AprvStsSrch)this, new MB_MBBAL0010_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBAL0010_Srch01]の呼び出し */
	protected void callMB_MBBAL0010_Srch01() {
		MCCaller caller = createMB_MBBAL0010_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBA.MBBAP0010.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBA.MBBAP0010.DtlR> aDtlL;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R> aDtl2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBA.MBBAP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBA.MBBAP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBA.MBBAP0010.CndR createCndR() {
		return mcframe.clientMBBA.MBBAP0010.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMBBA.MBBAP0010.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBA.MBBAP0010.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMBBA.MBBAP0010.DtlR createDtlR() {
		return mcframe.clientMBBA.MBBAP0010.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMBBA.MBBAP0010.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMBBA.MBBAP0010.DtlR.class);
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
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMBBA.MBBAP0010.Dtl2R createDtl2R() {
		return mcframe.clientMBBA.MBBAP0010.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMBBA.MBBAP0010.Dtl2R.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
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
		if(aCnt == getDtl2L()) return "Dtl2";
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
		if(bId.equals("Dtl2")) return getDtl2L();
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
		ret.add(RPnlPanel);
		ret.add(BodyPanel);
		ret.add(DtlPanel);
		ret.add(Dtl2Panel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBAP_AprvStsSrch_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aDtl2L = createDtl2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBAP_AprvStsSrch_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBAP_AprvStsSrch_MC.jbCreateScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateTop((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateFold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateCnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateCtrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateRPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateBody((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateDtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateDtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbCreateBtn((MBBAP_AprvStsSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBAP_AprvStsSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Body]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBody(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MBBAP_AprvStsSrch p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMBBA.MBBAP0010.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_src_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_src_itm_cd.addAliasName("Dtl.src_itm_cd", p);
		p.columnDtl_src_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_src_itm_sub1.addAliasName("Dtl.src_itm_sub1", p);
		p.columnDtl_src_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_src_itm_sub2.addAliasName("Dtl.src_itm_sub2", p);
		p.columnDtl_src_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_src_itm_sub3.addAliasName("Dtl.src_itm_sub3", p);
		p.columnDtl_src_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_src_itm_nm.addAliasName("Dtl.src_itm_nm", p);
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MBBAP_AprvStsSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBAP_AprvStsSrch p) {
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
	
	
	/** [Cnd_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_sts_typ_p = null;

	/**
	 * [Cnd_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_sts_typ_ListPutter() {
		if (Cnd_aprv_sts_typ_p == null) {
			Cnd_aprv_sts_typ_p = createCnd_aprv_sts_typ_ListPutter(Cnd_aprv_sts_typ, "aprv_sts_typ", "aprv_sts_typ_nm");

		}
		return Cnd_aprv_sts_typ_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBAP_AprvStsSrch create(){
		MBBAP_AprvStsSrch p = new MBBAP_AprvStsSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBAP_AprvStsSrch create(String name){
		MBBAP_AprvStsSrch p = new MBBAP_AprvStsSrch(name);
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
		MBBAP_AprvStsSrch_MC.jbfInitScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitTop((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitFold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitCnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitCtrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitRPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitBody((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitDtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitDtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbfInitBtn((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitTop((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitFold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitCnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitCtrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitRPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitBody((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitDtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitDtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.jbInitBtn((MBBAP_AprvStsSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SRCH = p.beansFactory.createRadioButton("Cnd.ope_SRCH");
		p.Cnd_ope_SRCH_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_SRCH_ADMIN");
		p.Cnd_aprv_func_typ_Label = p.beansFactory.createLabel("Cnd.aprv_func_typ_Label");
		p.Cnd_aprv_func_typ = p.beansFactory.createTextComboBox("Cnd.aprv_func_typ");
		p.Cnd_aprv_func_typ.setLabel(p.Cnd_aprv_func_typ_Label);
		p.Cnd_aprv_func_typ_nm = p.beansFactory.createTextField("Cnd.aprv_func_typ_nm");
		p.Cnd_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.aprv_sts_typ_Label");
		p.Cnd_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.aprv_sts_typ");
		p.Cnd_aprv_sts_typ.setLabel(p.Cnd_aprv_sts_typ_Label);
		p.Cnd_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.aprv_sts_typ_nm");
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
		p.Cnd_ins_biz_usr_cd_Label = p.beansFactory.createLabel("Cnd.ins_biz_usr_cd_Label");
		p.Cnd_ins_biz_usr_cd = p.beansFactory.createTextField("Cnd.ins_biz_usr_cd");
		p.Cnd_ins_biz_usr_cd.setLabel(p.Cnd_ins_biz_usr_cd_Label);
		p.Cnd_ins_biz_usr_nm = p.beansFactory.createTextField("Cnd.ins_biz_usr_nm");
		p.Cnd_usr_dtl_flg = p.beansFactory.createCheckBox("Cnd.usr_dtl_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_admin = p.beansFactory.createButton("RPnl.srch_admin");
	}

	/**
	 * [Body]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBody(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.BodyPanel = p.beansFactory.createPanel("Body");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_aprv_func_typ = p.beansFactory.createTableColumn("Dtl.aprv_func_typ", MCColumnType.TEXT);
		p.columnDtl_aprv_func_typ_nm = p.beansFactory.createTableColumn("Dtl.aprv_func_typ_nm", MCColumnType.TEXT);
		p.columnDtl_aprv_no = p.beansFactory.createTableColumn("Dtl.aprv_no", MCColumnType.TEXT);
		p.columnDtl_aprv_no_seq = p.beansFactory.createTableColumn("Dtl.aprv_no_seq", MCColumnType.NUMBER);
		p.columnDtl_aprv_src_no1 = p.beansFactory.createTableColumn("Dtl.aprv_src_no1", MCColumnType.TEXT);
		p.columnDtl_aprv_src_no2 = p.beansFactory.createTableColumn("Dtl.aprv_src_no2", MCColumnType.TEXT);
		p.columnDtl_aprv_sts_typ = p.beansFactory.createTableColumn("Dtl.aprv_sts_typ", MCColumnType.TEXT);
		p.columnDtl_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_last_aprv_tm = p.beansFactory.createTableColumn("Dtl.last_aprv_tm", MCColumnType.DATE);
		p.columnDtl_last_aprv_usr_cd = p.beansFactory.createTableColumn("Dtl.last_aprv_usr_cd", MCColumnType.TEXT);
		p.columnDtl_last_aprv_usr_nm = p.beansFactory.createTableColumn("Dtl.last_aprv_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_dt = p.beansFactory.createTableColumn("Dtl.ins_dt", MCColumnType.DATE);
		p.columnDtl_src_ins_usr_cd = p.beansFactory.createTableColumn("Dtl.src_ins_usr_cd", MCColumnType.TEXT);
		p.columnDtl_src_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.src_ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_biz_usr_cd = p.beansFactory.createTableColumn("Dtl.biz_usr_cd", MCColumnType.TEXT);
		p.columnDtl_biz_usr_nm = p.beansFactory.createTableColumn("Dtl.biz_usr_nm", MCColumnType.TEXT);
		p.columnDtl_src_dpt_cd = p.beansFactory.createTableColumn("Dtl.src_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_src_dpt_nm = p.beansFactory.createTableColumn("Dtl.src_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_src_bp_cd = p.beansFactory.createTableColumn("Dtl.src_bp_cd", MCColumnType.TEXT);
		p.columnDtl_src_bp_nm = p.beansFactory.createTableColumn("Dtl.src_bp_nm", MCColumnType.TEXT);
		p.columnDtl_src_cur_cd1 = p.beansFactory.createTableColumn("Dtl.src_cur_cd1", MCColumnType.TEXT);
		p.columnDtl_src_cur_nm1 = p.beansFactory.createTableColumn("Dtl.src_cur_nm1", MCColumnType.TEXT);
		p.columnDtl_src_amt1 = p.beansFactory.createTableColumn("Dtl.src_amt1", MCColumnType.NUMBER);
		p.columnDtl_src_cur_cd2 = p.beansFactory.createTableColumn("Dtl.src_cur_cd2", MCColumnType.TEXT);
		p.columnDtl_src_cur_nm2 = p.beansFactory.createTableColumn("Dtl.src_cur_nm2", MCColumnType.TEXT);
		p.columnDtl_src_amt2 = p.beansFactory.createTableColumn("Dtl.src_amt2", MCColumnType.NUMBER);
		p.columnDtl_src_cur_cd3 = p.beansFactory.createTableColumn("Dtl.src_cur_cd3", MCColumnType.TEXT);
		p.columnDtl_src_cur_nm3 = p.beansFactory.createTableColumn("Dtl.src_cur_nm3", MCColumnType.TEXT);
		p.columnDtl_src_amt3 = p.beansFactory.createTableColumn("Dtl.src_amt3", MCColumnType.NUMBER);
		p.columnDtl_src_ext_key1 = p.beansFactory.createTableColumn("Dtl.src_ext_key1", MCColumnType.TEXT);
		p.columnDtl_src_ext_key2 = p.beansFactory.createTableColumn("Dtl.src_ext_key2", MCColumnType.TEXT);
		p.columnDtl_src_ext_key3 = p.beansFactory.createTableColumn("Dtl.src_ext_key3", MCColumnType.TEXT);
		p.columnDtl_next_opr_flg = p.beansFactory.createTableColumn("Dtl.next_opr_flg", MCColumnType.CHECK);
		p.columnDtl_aprv_upd_flg = p.beansFactory.createTableColumn("Dtl.aprv_upd_flg", MCColumnType.CHECK);
		p.columnDtl_aprv_can_flg = p.beansFactory.createTableColumn("Dtl.aprv_can_flg", MCColumnType.CHECK);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_aprv_no = p.beansFactory.createTableColumn("Dtl2.aprv_no", MCColumnType.TEXT);
		p.columnDtl2_aprv_no_seq = p.beansFactory.createTableColumn("Dtl2.aprv_no_seq", MCColumnType.NUMBER);
		p.columnDtl2_aprv_seq = p.beansFactory.createTableColumn("Dtl2.aprv_seq", MCColumnType.NUMBER);
		p.columnDtl2_aprv_usr_cd = p.beansFactory.createTableColumn("Dtl2.aprv_usr_cd", MCColumnType.TEXT);
		p.columnDtl2_aprv_usr_nm = p.beansFactory.createTableColumn("Dtl2.aprv_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_email1 = p.beansFactory.createTableColumn("Dtl2.email1", MCColumnType.TEXT);
		p.columnDtl2_email2 = p.beansFactory.createTableColumn("Dtl2.email2", MCColumnType.TEXT);
		p.columnDtl2_email3 = p.beansFactory.createTableColumn("Dtl2.email3", MCColumnType.TEXT);
		p.columnDtl2_tel1 = p.beansFactory.createTableColumn("Dtl2.tel1", MCColumnType.TEXT);
		p.columnDtl2_tel2 = p.beansFactory.createTableColumn("Dtl2.tel2", MCColumnType.TEXT);
		p.columnDtl2_tel3 = p.beansFactory.createTableColumn("Dtl2.tel3", MCColumnType.TEXT);
		p.columnDtl2_th_image = p.beansFactory.createTableColumn("Dtl2.th_image", MCColumnType.IMAGE_VIEW);
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
	protected static void jbfInitBtn(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_detail = p.beansFactory.createButton("Btn.open_detail", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBAP_AprvStsSrch p) {
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
	protected static void jbInitTop(MBBAP_AprvStsSrch p) {
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MBBAP_AprvStsSrch p) {
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
	protected static void jbInitCnd(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SRCH);
		p.Cnd_ope_SRCH.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH);
		p.Cnd_ope_SRCH.setNextBeans(p.Cnd_ope_SRCH_ADMIN);
		p.Cnd_ope_SRCH_ADMIN.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_ADMIN);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.ope_META);
		p.Cnd_aprv_func_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_func_typ, true);
		p.Cnd_aprv_func_typ.setLinkBeans(p.Cnd_aprv_func_typ_nm);
		p.CndPanel.add(p.Cnd_aprv_func_typ_Label);
		p.CndPanel.add(p.Cnd_aprv_func_typ);
		p.CndPanel.setLastBeans(p.Cnd_aprv_func_typ);
		p.Cnd_aprv_func_typ.setNextBeans(p.Cnd_aprv_func_typ_nm);
		p.Cnd_aprv_func_typ.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_func_typ_META);
		p.CndPanel.add(p.Cnd_aprv_func_typ_nm);
		p.Cnd_aprv_func_typ_nm.setNextBeans(p.Cnd_aprv_sts_typ);
		p.Cnd_aprv_func_typ_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_func_typ_nm_META);
		p.Cnd_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_sts_typ, true);
		p.Cnd_aprv_sts_typ.setLinkBeans(p.Cnd_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_aprv_sts_typ);
		p.Cnd_aprv_sts_typ.setNextBeans(p.Cnd_aprv_sts_typ_nm);
		p.Cnd_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_aprv_sts_typ_nm);
		p.Cnd_aprv_sts_typ_nm.setNextBeans(p.Cnd_aprv_no);
		p.Cnd_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_aprv_no_Label);
		p.CndPanel.add(p.Cnd_aprv_no);
		p.Cnd_aprv_no.setNextBeans(p.Cnd_aprv_src_no1);
		p.Cnd_aprv_no.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_no_META);
		p.setPluralValueEnable(p.Cnd_aprv_no, true);
		p.CndPanel.add(p.Cnd_aprv_src_no1_Label);
		p.CndPanel.add(p.Cnd_aprv_src_no1);
		p.Cnd_aprv_src_no1.setNextBeans(p.Cnd_aprv_src_no2);
		p.Cnd_aprv_src_no1.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_src_no1_META);
		p.setPluralValueEnable(p.Cnd_aprv_src_no1, true);
		p.CndPanel.add(p.Cnd_aprv_src_no2_Label);
		p.CndPanel.add(p.Cnd_aprv_src_no2);
		p.Cnd_aprv_src_no2.setNextBeans(p.Cnd_ins_dt_fr);
		p.Cnd_aprv_src_no2.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.aprv_src_no2_META);
		p.setPluralValueEnable(p.Cnd_aprv_src_no2, true);
		p.CndPanel.add(p.Cnd_ins_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ins_dt_fr);
		p.Cnd_ins_dt_fr.setNextBeans(p.Cnd_ins_dt_to);
		p.Cnd_ins_dt_fr.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.ins_dt_fr_META);
		p.Cnd_ins_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ins_dt_to_Label);
		p.CndPanel.add(p.Cnd_ins_dt_to);
		p.Cnd_ins_dt_to.setNextBeans(p.Cnd_ins_biz_usr_cd);
		p.Cnd_ins_dt_to.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.ins_dt_to_META);
		p.Cnd_ins_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ins_biz_usr_cd_Label);
		p.CndPanel.add(p.Cnd_ins_biz_usr_cd);
		p.Cnd_ins_biz_usr_cd.setNextBeans(p.Cnd_ins_biz_usr_nm);
		p.Cnd_ins_biz_usr_cd.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.ins_biz_usr_cd_META);
		p.Cnd_ins_biz_usr_cd.addLinkBeans(p.Cnd_ins_biz_usr_nm);
		p.Cnd_ins_biz_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ins_biz_usr_cd, true);
		p.CndPanel.add(p.Cnd_ins_biz_usr_nm);
		p.Cnd_ins_biz_usr_nm.setNextBeans(p.Cnd_usr_dtl_flg);
		p.Cnd_ins_biz_usr_nm.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.ins_biz_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_ins_biz_usr_nm, true);
		p.CndPanel.add(p.Cnd_usr_dtl_flg);
		p.Cnd_usr_dtl_flg.setRow(p.getCndR(), mcframe.clientMBBA.MBBAP0010.CndR.usr_dtl_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_admin.setIcon("SEARCH");
		p.RPnl_srch_admin.setFunctionKey(MCFunctionKey.F1);
		p.RPnlPanel.add(p.RPnl_srch_admin);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_admin);
	}

	/**
	 * [Body]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBody(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.add(p.BodyPanel);
		p.BodyPanel.setNextBeans(p.BtnPanel);
		p.BodyPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.BodyPanel.add(p.DtlPanel, null);
		p.BodyPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.Dtl2Panel);
		p.BodyPanel.add(p.Dtl2Panel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MBBAP_AprvStsSrch p) {
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
	protected static void jbInitBtn(MBBAP_AprvStsSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_detail.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_detail);
		p.BtnPanel.setLastBeans(p.Btn_open_detail);
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
		MBBAP_AprvStsSrch_MC.mcInitScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitTop((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitFold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitCnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitCtrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitRPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitBody((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitDtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitDtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.mcInitBtn((MBBAP_AprvStsSrch)this);

		// [SRCH]ステータスのモードの設定
		MBBAP_AprvStsSrch_MC.statusInitSRCH_ScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Top((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Fold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Cnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Ctrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_RPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Body((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Dtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Dtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH_Btn((MBBAP_AprvStsSrch)this);

		// [SRCH_ADMIN]ステータスのモードの設定
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_ScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Top((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Fold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Cnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Ctrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_RPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Body((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Dtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Dtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitSRCH__ADMIN_Btn((MBBAP_AprvStsSrch)this);

		// [REF]ステータスのモードの設定
		MBBAP_AprvStsSrch_MC.statusInitREF_ScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Top((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Fold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Cnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Ctrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_RPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Body((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Dtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Dtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF_Btn((MBBAP_AprvStsSrch)this);

		// [REF_ADMIN]ステータスのモードの設定
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_ScreenOpe((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Top((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Fold((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Cnd((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Ctrl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_RPnl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Body((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Dtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Dtl2((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.statusInitREF__ADMIN_Btn((MBBAP_AprvStsSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBAP_AprvStsSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBAP_AprvStsSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBAP_AprvStsSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBAP_AprvStsSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SRCH.addAllListener(p);
		p.Cnd_ope_SRCH_ADMIN.addAllListener(p);
		p.Cnd_aprv_func_typ.setListListener(p);
		p.Cnd_aprv_func_typ.addAllListener(p);
		p.Cnd_aprv_func_typ_nm.setListListener(p);
		p.Cnd_aprv_func_typ_nm.addAllListener(p);
		p.Cnd_aprv_sts_typ.setListListener(p);
		p.Cnd_aprv_sts_typ.addAllListener(p);
		p.Cnd_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_aprv_sts_typ_nm.addAllListener(p);
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
		p.Cnd_ins_biz_usr_cd.setListListener(p);
		p.Cnd_ins_biz_usr_cd.addAllListener(p);
		p.Cnd_ins_biz_usr_nm.setListListener(p);
		p.Cnd_ins_biz_usr_nm.addAllListener(p);
		p.Cnd_usr_dtl_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBAP_AprvStsSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MBBAP_AprvStsSrch p) {
		p.RPnl_srch_admin.addAllListener(p);
		p.RPnl_srch_admin.setAPMethodName("doRPnl_srch_admin");
	}

	/**
	 *  [Body]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBody(MBBAP_AprvStsSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MBBAP_AprvStsSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_aprv_func_typ.addAllListener(p);
		p.columnDtl_aprv_func_typ.setListListener(p);
		p.columnDtl_aprv_func_typ_nm.addAllListener(p);
		p.columnDtl_aprv_func_typ_nm.setListListener(p);
		p.columnDtl_aprv_no.addAllListener(p);
		p.columnDtl_aprv_no.setListListener(p);
		p.columnDtl_aprv_no_seq.addAllListener(p);
		p.columnDtl_aprv_no_seq.setListListener(p);
		p.columnDtl_aprv_src_no1.addAllListener(p);
		p.columnDtl_aprv_src_no1.setListListener(p);
		p.columnDtl_aprv_src_no2.addAllListener(p);
		p.columnDtl_aprv_src_no2.setListListener(p);
		p.columnDtl_aprv_sts_typ.addAllListener(p);
		p.columnDtl_aprv_sts_typ.setListListener(p);
		p.columnDtl_aprv_sts_typ_nm.addAllListener(p);
		p.columnDtl_aprv_sts_typ_nm.setListListener(p);
		p.columnDtl_last_aprv_tm.addAllListener(p);
		p.columnDtl_last_aprv_tm.setListListener(p);
		p.columnDtl_last_aprv_usr_cd.addAllListener(p);
		p.columnDtl_last_aprv_usr_cd.setListListener(p);
		p.columnDtl_last_aprv_usr_nm.addAllListener(p);
		p.columnDtl_last_aprv_usr_nm.setListListener(p);
		p.columnDtl_ins_dt.addAllListener(p);
		p.columnDtl_ins_dt.setListListener(p);
		p.columnDtl_src_ins_usr_cd.addAllListener(p);
		p.columnDtl_src_ins_usr_cd.setListListener(p);
		p.columnDtl_src_ins_usr_nm.addAllListener(p);
		p.columnDtl_src_ins_usr_nm.setListListener(p);
		p.columnDtl_biz_usr_cd.addAllListener(p);
		p.columnDtl_biz_usr_cd.setListListener(p);
		p.columnDtl_biz_usr_nm.addAllListener(p);
		p.columnDtl_biz_usr_nm.setListListener(p);
		p.columnDtl_src_dpt_cd.addAllListener(p);
		p.columnDtl_src_dpt_cd.setListListener(p);
		p.columnDtl_src_dpt_nm.addAllListener(p);
		p.columnDtl_src_dpt_nm.setListListener(p);
		p.columnDtl_src_bp_cd.addAllListener(p);
		p.columnDtl_src_bp_cd.setListListener(p);
		p.columnDtl_src_bp_nm.addAllListener(p);
		p.columnDtl_src_bp_nm.setListListener(p);
		p.columnDtl_src_cur_cd1.addAllListener(p);
		p.columnDtl_src_cur_cd1.setListListener(p);
		p.columnDtl_src_cur_nm1.addAllListener(p);
		p.columnDtl_src_cur_nm1.setListListener(p);
		p.columnDtl_src_amt1.addAllListener(p);
		p.columnDtl_src_amt1.setListListener(p);
		p.columnDtl_src_cur_cd2.addAllListener(p);
		p.columnDtl_src_cur_cd2.setListListener(p);
		p.columnDtl_src_cur_nm2.addAllListener(p);
		p.columnDtl_src_cur_nm2.setListListener(p);
		p.columnDtl_src_amt2.addAllListener(p);
		p.columnDtl_src_amt2.setListListener(p);
		p.columnDtl_src_cur_cd3.addAllListener(p);
		p.columnDtl_src_cur_cd3.setListListener(p);
		p.columnDtl_src_cur_nm3.addAllListener(p);
		p.columnDtl_src_cur_nm3.setListListener(p);
		p.columnDtl_src_amt3.addAllListener(p);
		p.columnDtl_src_amt3.setListListener(p);
		p.columnDtl_src_ext_key1.addAllListener(p);
		p.columnDtl_src_ext_key1.setListListener(p);
		p.columnDtl_src_ext_key2.addAllListener(p);
		p.columnDtl_src_ext_key2.setListListener(p);
		p.columnDtl_src_ext_key3.addAllListener(p);
		p.columnDtl_src_ext_key3.setListListener(p);
		p.columnDtl_next_opr_flg.addAllListener(p);
		p.columnDtl_aprv_upd_flg.addAllListener(p);
		p.columnDtl_aprv_can_flg.addAllListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MBBAP_AprvStsSrch p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_aprv_no.addAllListener(p);
		p.columnDtl2_aprv_no.setListListener(p);
		p.columnDtl2_aprv_no_seq.addAllListener(p);
		p.columnDtl2_aprv_no_seq.setListListener(p);
		p.columnDtl2_aprv_seq.addAllListener(p);
		p.columnDtl2_aprv_seq.setListListener(p);
		p.columnDtl2_aprv_usr_cd.addAllListener(p);
		p.columnDtl2_aprv_usr_cd.setListListener(p);
		p.columnDtl2_aprv_usr_nm.addAllListener(p);
		p.columnDtl2_aprv_usr_nm.setListListener(p);
		p.columnDtl2_email1.addAllListener(p);
		p.columnDtl2_email1.setListListener(p);
		p.columnDtl2_email2.addAllListener(p);
		p.columnDtl2_email2.setListListener(p);
		p.columnDtl2_email3.addAllListener(p);
		p.columnDtl2_email3.setListListener(p);
		p.columnDtl2_tel1.addAllListener(p);
		p.columnDtl2_tel1.setListListener(p);
		p.columnDtl2_tel2.addAllListener(p);
		p.columnDtl2_tel2.setListListener(p);
		p.columnDtl2_tel3.addAllListener(p);
		p.columnDtl2_tel3.setListListener(p);
		p.columnDtl2_th_image.addAllListener(p);
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
	protected static void mcInitBtn(MBBAP_AprvStsSrch p) {
		p.Btn_open_detail.addAllListener(p);
		p.Btn_open_detail.setAPMethodName("doBtn_open_detail");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBAP_AprvStsSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aprv_sts_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_usr_dtl_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MBBAP_AprvStsSrch p){
		p.RPnl_srch_admin.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Body(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MBBAP_AprvStsSrch p){
		p.columnDtl_aprv_func_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_func_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_no_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_amt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_amt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_amt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_src_ext_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_next_opr_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_aprv_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MBBAP_AprvStsSrch p){
		p.columnDtl2_aprv_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_aprv_no_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_aprv_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_email1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_email2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_email3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_tel1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_tel2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_tel3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_th_image.putMode(p, SRCH, MCMode.INVISIBLE);
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
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBAP_AprvStsSrch p){
		p.Btn_open_detail.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_ScreenOpe(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Top(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Fold(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Cnd(MBBAP_AprvStsSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ADMIN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.Cnd_aprv_sts_typ.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, SRCH_ADMIN, MCMode.ENABLE);
		p.Cnd_usr_dtl_flg.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Ctrl(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH_ADMIN]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_RPnl(MBBAP_AprvStsSrch p){
		p.RPnl_srch_admin.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Body(MBBAP_AprvStsSrch p){

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Dtl(MBBAP_AprvStsSrch p){
		p.columnDtl_aprv_func_typ.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_func_typ_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_no_seq.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no1.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no2.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_tm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_dt.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_bp_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_bp_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd1.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm1.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_amt1.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd2.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm2.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_amt2.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd3.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm3.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_amt3.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_ADMIN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_src_ext_key1.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key2.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key3.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_next_opr_flg.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_upd_flg.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_can_flg.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Dtl2(MBBAP_AprvStsSrch p){
		p.columnDtl2_aprv_no.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_aprv_no_seq.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_aprv_seq.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_email1.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_email2.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_email3.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_tel1.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_tel2.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_tel3.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_th_image.putMode(p, SRCH_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ADMIN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ADMIN_Btn(MBBAP_AprvStsSrch p){
		p.Btn_open_detail.putMode(p, SRCH_ADMIN, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBAP_AprvStsSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_aprv_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ins_biz_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_usr_dtl_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MBBAP_AprvStsSrch p){
		p.RPnl_srch_admin.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitREF_Body(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MBBAP_AprvStsSrch p){
		p.columnDtl_aprv_func_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_func_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_no_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_amt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_amt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_amt3.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_src_ext_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_next_opr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MBBAP_AprvStsSrch p){
		p.columnDtl2_aprv_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_aprv_no_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_aprv_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_email1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_email2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_email3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_tel1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_tel2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_tel3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_th_image.putMode(p, REF, MCMode.INVISIBLE);
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
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBAP_AprvStsSrch p){
		p.Btn_open_detail.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_ScreenOpe(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF_ADMIN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Top(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF_ADMIN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Fold(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Cnd(MBBAP_AprvStsSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ADMIN, MCMode.REQUIRED);
		p.Cnd_aprv_func_typ.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_func_typ_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.Cnd_aprv_sts_typ.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.Cnd_aprv_no.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_src_no1.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_aprv_src_no2.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_dt_fr.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_dt_to.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_cd.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_ins_biz_usr_nm.putMode(p, REF_ADMIN, MCMode.ENABLE);
		p.Cnd_usr_dtl_flg.putMode(p, REF_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [REF_ADMIN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Ctrl(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF_ADMIN]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_RPnl(MBBAP_AprvStsSrch p){
		p.RPnl_srch_admin.putMode(p, REF_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [REF_ADMIN]ステータスの[Body]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Body(MBBAP_AprvStsSrch p){

	}

	/**
	 * [REF_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Dtl(MBBAP_AprvStsSrch p){
		p.columnDtl_aprv_func_typ.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_func_typ_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_no_seq.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no1.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_src_no2.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_tm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_last_aprv_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_dt.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_biz_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_dpt_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_bp_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_bp_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd1.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm1.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_amt1.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd2.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm2.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_amt2.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_cd3.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_cur_nm3.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_amt3.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_ADMIN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_src_ext_key1.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key2.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_src_ext_key3.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_next_opr_flg.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_upd_flg.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_aprv_can_flg.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ADMIN]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Dtl2(MBBAP_AprvStsSrch p){
		p.columnDtl2_aprv_no.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_aprv_no_seq.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_aprv_seq.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_email1.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_email2.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_email3.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_tel1.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_tel2.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_tel3.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_th_image.putMode(p, REF_ADMIN, MCMode.INVISIBLE);
		p.columnDtl2_aprv_d_sts_typ.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_sts_typ_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_tm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_flg.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_deputy_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_cd.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_role_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_aprv_d_rmrks.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char1.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, REF_ADMIN, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, REF_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ADMIN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ADMIN_Btn(MBBAP_AprvStsSrch p){
		p.Btn_open_detail.putMode(p, REF_ADMIN, MCMode.ENABLE);

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
		MBBAP_AprvStsSrch_MC.setTableConfigDtl((MBBAP_AprvStsSrch)this);
		MBBAP_AprvStsSrch_MC.setTableConfigDtl2((MBBAP_AprvStsSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MBBAP_AprvStsSrch p) {
		p.columnDtl_aprv_func_typ.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_func_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_func_typ);
		p.columnDtl_aprv_func_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_func_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_func_typ_nm);
		p.columnDtl_aprv_no.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_no);
		p.columnDtl_aprv_no_seq.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_no_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_no_seq);
		p.columnDtl_aprv_src_no1.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_src_no1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_src_no1);
		p.columnDtl_aprv_src_no2.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_src_no2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_src_no2);
		p.columnDtl_aprv_sts_typ.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_sts_typ);
		p.columnDtl_aprv_sts_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_sts_typ_nm);
		p.columnDtl_last_aprv_tm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.last_aprv_tm_META);
		p.columnDtl_last_aprv_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_last_aprv_tm);
		p.columnDtl_last_aprv_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.last_aprv_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_aprv_usr_cd);
		p.columnDtl_last_aprv_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.last_aprv_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_aprv_usr_nm);
		p.columnDtl_ins_dt.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.ins_dt_META);
		p.columnDtl_ins_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_dt);
		p.columnDtl_src_ins_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_ins_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_usr_cd);
		p.columnDtl_src_ins_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_usr_nm);
		p.columnDtl_biz_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.biz_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_biz_usr_cd);
		p.columnDtl_biz_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.biz_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_biz_usr_nm);
		p.columnDtl_src_dpt_cd.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_dpt_cd);
		p.columnDtl_src_dpt_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_dpt_nm);
		p.columnDtl_src_bp_cd.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_bp_cd);
		p.columnDtl_src_bp_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_bp_nm);
		p.columnDtl_src_cur_cd1.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_cur_cd1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_cur_cd1);
		p.columnDtl_src_cur_nm1.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_cur_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_cur_nm1);
		p.columnDtl_src_amt1.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_amt1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_amt1);
		p.columnDtl_src_cur_cd2.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_cur_cd2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_cur_cd2);
		p.columnDtl_src_cur_nm2.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_cur_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_cur_nm2);
		p.columnDtl_src_amt2.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_amt2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_amt2);
		p.columnDtl_src_cur_cd3.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_cur_cd3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_cur_cd3);
		p.columnDtl_src_cur_nm3.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_cur_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_cur_nm3);
		p.columnDtl_src_amt3.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_amt3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_amt3);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_src_ext_key1.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_ext_key1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ext_key1);
		p.columnDtl_src_ext_key2.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_ext_key2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ext_key2);
		p.columnDtl_src_ext_key3.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.src_ext_key3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ext_key3);
		p.columnDtl_next_opr_flg.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.next_opr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_next_opr_flg);
		p.columnDtl_aprv_upd_flg.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_upd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_upd_flg);
		p.columnDtl_aprv_can_flg.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.aprv_can_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_can_flg);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMBBA.MBBAP0010.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MBBAP_AprvStsSrch p) {
		p.columnDtl2_aprv_no.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_no);
		p.columnDtl2_aprv_no_seq.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_no_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_no_seq);
		p.columnDtl2_aprv_seq.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_seq);
		p.columnDtl2_aprv_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_usr_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_usr_cd);
		p.columnDtl2_aprv_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_usr_nm);
		p.columnDtl2_email1.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.email1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_email1);
		p.columnDtl2_email2.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.email2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_email2);
		p.columnDtl2_email3.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.email3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_email3);
		p.columnDtl2_tel1.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.tel1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_tel1);
		p.columnDtl2_tel2.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.tel2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_tel2);
		p.columnDtl2_tel3.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.tel3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_tel3);
		p.columnDtl2_th_image.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.th_image_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_th_image);
		p.columnDtl2_aprv_d_sts_typ.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_d_sts_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_sts_typ);
		p.columnDtl2_aprv_d_sts_typ_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_d_sts_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_sts_typ_nm);
		p.columnDtl2_aprv_d_tm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_d_tm_META);
		p.columnDtl2_aprv_d_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_tm);
		p.columnDtl2_deputy_flg.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.deputy_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_deputy_flg);
		p.columnDtl2_deputy_usr_cd.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.deputy_usr_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_deputy_usr_cd);
		p.columnDtl2_deputy_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.deputy_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_deputy_usr_nm);
		p.columnDtl2_aprv_role_cd.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_role_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_role_cd);
		p.columnDtl2_aprv_role_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_role_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_role_nm);
		p.columnDtl2_aprv_d_rmrks.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.aprv_d_rmrks_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_aprv_d_rmrks);
		p.columnDtl2_sub_char1.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.sub_char1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char1);
		p.columnDtl2_sub_char2.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.sub_char2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char2);
		p.columnDtl2_sub_char3.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.sub_char3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char3);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMBBA.MBBAP0010.Dtl2R.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_aprv_func_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aprv_func_typ.getListConfig().setPutter(getCnd_aprv_func_typ_ListPutter());
		Cnd_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aprv_sts_typ.getListConfig().setPutter(getCnd_aprv_sts_typ_ListPutter());
		Cnd_ins_biz_usr_cd.getListConfig().setPutter(getCnd_ins_biz_usr_cd_ListPutter());
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
	 * この画面を[SRCH_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ADMINStatus() {
		status = SRCH_ADMIN;
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
	 * この画面を[REF_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ADMINStatus() {
		status = REF_ADMIN;
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
		else if (SRCH_ADMIN.equals(status)) {
			setSRCH_ADMINStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (REF_ADMIN.equals(status)) {
			setREF_ADMINStatus();
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
	 * [Cnd_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvStsTyp");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_aprv_func_typ) return getCnd_aprv_func_typ(row, info);
		if(combo == Cnd_aprv_sts_typ) return getCnd_aprv_sts_typ(row, info);
		if(combo == Cnd_ins_biz_usr_cd) return getCnd_ins_biz_usr_cd(row, info);
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
		else if (ap == RPnl_srch_admin) doRPnl_srch_admin(info);
		else if (ap == Btn_open_detail) doBtn_open_detail(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_admin]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_admin(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_detail]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_detail(MCEventInfo info);

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
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_aprv_func_typ) return doCnd_aprv_func_typ_VC(info);
		if (vc == Cnd_aprv_func_typ_nm) return doCnd_aprv_func_typ_nm_VC(info);
		if (vc == Cnd_aprv_sts_typ) return doCnd_aprv_sts_typ_VC(info);
		if (vc == Cnd_aprv_sts_typ_nm) return doCnd_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_aprv_no) return doCnd_aprv_no_VC(info);
		if (vc == Cnd_aprv_src_no1) return doCnd_aprv_src_no1_VC(info);
		if (vc == Cnd_aprv_src_no2) return doCnd_aprv_src_no2_VC(info);
		if (vc == Cnd_ins_dt_fr) return doCnd_ins_dt_fr_VC(info);
		if (vc == Cnd_ins_dt_to) return doCnd_ins_dt_to_VC(info);
		if (vc == Cnd_ins_biz_usr_cd) return doCnd_ins_biz_usr_cd_VC(info);
		if (vc == Cnd_ins_biz_usr_nm) return doCnd_ins_biz_usr_nm_VC(info);
		if (vc == Cnd_usr_dtl_flg) return doCnd_usr_dtl_flg_VC(info);
		if (vc == columnDtl_aprv_func_typ) return doDtl_aprv_func_typ_VC(info);
		if (vc == columnDtl_aprv_func_typ_nm) return doDtl_aprv_func_typ_nm_VC(info);
		if (vc == columnDtl_aprv_no) return doDtl_aprv_no_VC(info);
		if (vc == columnDtl_aprv_no_seq) return doDtl_aprv_no_seq_VC(info);
		if (vc == columnDtl_aprv_src_no1) return doDtl_aprv_src_no1_VC(info);
		if (vc == columnDtl_aprv_src_no2) return doDtl_aprv_src_no2_VC(info);
		if (vc == columnDtl_aprv_sts_typ) return doDtl_aprv_sts_typ_VC(info);
		if (vc == columnDtl_aprv_sts_typ_nm) return doDtl_aprv_sts_typ_nm_VC(info);
		if (vc == columnDtl_last_aprv_tm) return doDtl_last_aprv_tm_VC(info);
		if (vc == columnDtl_last_aprv_usr_cd) return doDtl_last_aprv_usr_cd_VC(info);
		if (vc == columnDtl_last_aprv_usr_nm) return doDtl_last_aprv_usr_nm_VC(info);
		if (vc == columnDtl_ins_dt) return doDtl_ins_dt_VC(info);
		if (vc == columnDtl_src_ins_usr_cd) return doDtl_src_ins_usr_cd_VC(info);
		if (vc == columnDtl_src_ins_usr_nm) return doDtl_src_ins_usr_nm_VC(info);
		if (vc == columnDtl_biz_usr_cd) return doDtl_biz_usr_cd_VC(info);
		if (vc == columnDtl_biz_usr_nm) return doDtl_biz_usr_nm_VC(info);
		if (vc == columnDtl_src_dpt_cd) return doDtl_src_dpt_cd_VC(info);
		if (vc == columnDtl_src_dpt_nm) return doDtl_src_dpt_nm_VC(info);
		if (vc == columnDtl_src_bp_cd) return doDtl_src_bp_cd_VC(info);
		if (vc == columnDtl_src_bp_nm) return doDtl_src_bp_nm_VC(info);
		if (vc == columnDtl_src_cur_cd1) return doDtl_src_cur_cd1_VC(info);
		if (vc == columnDtl_src_cur_nm1) return doDtl_src_cur_nm1_VC(info);
		if (vc == columnDtl_src_amt1) return doDtl_src_amt1_VC(info);
		if (vc == columnDtl_src_cur_cd2) return doDtl_src_cur_cd2_VC(info);
		if (vc == columnDtl_src_cur_nm2) return doDtl_src_cur_nm2_VC(info);
		if (vc == columnDtl_src_amt2) return doDtl_src_amt2_VC(info);
		if (vc == columnDtl_src_cur_cd3) return doDtl_src_cur_cd3_VC(info);
		if (vc == columnDtl_src_cur_nm3) return doDtl_src_cur_nm3_VC(info);
		if (vc == columnDtl_src_amt3) return doDtl_src_amt3_VC(info);
		if (vc == columnDtl_src_ext_key1) return doDtl_src_ext_key1_VC(info);
		if (vc == columnDtl_src_ext_key2) return doDtl_src_ext_key2_VC(info);
		if (vc == columnDtl_src_ext_key3) return doDtl_src_ext_key3_VC(info);
		if (vc == columnDtl_next_opr_flg) return doDtl_next_opr_flg_VC(info);
		if (vc == columnDtl_aprv_upd_flg) return doDtl_aprv_upd_flg_VC(info);
		if (vc == columnDtl_aprv_can_flg) return doDtl_aprv_can_flg_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl2_aprv_no) return doDtl2_aprv_no_VC(info);
		if (vc == columnDtl2_aprv_no_seq) return doDtl2_aprv_no_seq_VC(info);
		if (vc == columnDtl2_aprv_seq) return doDtl2_aprv_seq_VC(info);
		if (vc == columnDtl2_aprv_usr_cd) return doDtl2_aprv_usr_cd_VC(info);
		if (vc == columnDtl2_aprv_usr_nm) return doDtl2_aprv_usr_nm_VC(info);
		if (vc == columnDtl2_email1) return doDtl2_email1_VC(info);
		if (vc == columnDtl2_email2) return doDtl2_email2_VC(info);
		if (vc == columnDtl2_email3) return doDtl2_email3_VC(info);
		if (vc == columnDtl2_tel1) return doDtl2_tel1_VC(info);
		if (vc == columnDtl2_tel2) return doDtl2_tel2_VC(info);
		if (vc == columnDtl2_tel3) return doDtl2_tel3_VC(info);
		if (vc == columnDtl2_th_image) return doDtl2_th_image_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_dtl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_dtl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_func_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_func_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_no_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_no_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_src_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_src_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_src_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_src_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_aprv_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_aprv_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_aprv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[biz_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_biz_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[biz_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_biz_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_cur_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_cur_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_cur_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_cur_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_amt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_amt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_cur_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_cur_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_cur_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_cur_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_amt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_amt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_cur_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_cur_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_cur_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_cur_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_amt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_amt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ext_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ext_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ext_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ext_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ext_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ext_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[next_opr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_next_opr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_can_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_no_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_no_seq_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[email1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_email1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[email2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_email2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[email3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_email3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[tel1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_tel1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[tel2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_tel2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[tel3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_tel3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[th_image]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_th_image_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_aprv_func_typ) doCnd_aprv_func_typ_NC(info);
		else if (nc == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_NC(info);
		else if (nc == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_NC(info);
		else if (nc == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_aprv_no) doCnd_aprv_no_NC(info);
		else if (nc == Cnd_aprv_src_no1) doCnd_aprv_src_no1_NC(info);
		else if (nc == Cnd_aprv_src_no2) doCnd_aprv_src_no2_NC(info);
		else if (nc == Cnd_ins_dt_fr) doCnd_ins_dt_fr_NC(info);
		else if (nc == Cnd_ins_dt_to) doCnd_ins_dt_to_NC(info);
		else if (nc == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_NC(info);
		else if (nc == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_NC(info);
		else if (nc == Cnd_usr_dtl_flg) doCnd_usr_dtl_flg_NC(info);
		else if (nc == columnDtl_aprv_func_typ) doDtl_aprv_func_typ_NC(info);
		else if (nc == columnDtl_aprv_func_typ_nm) doDtl_aprv_func_typ_nm_NC(info);
		else if (nc == columnDtl_aprv_no) doDtl_aprv_no_NC(info);
		else if (nc == columnDtl_aprv_no_seq) doDtl_aprv_no_seq_NC(info);
		else if (nc == columnDtl_aprv_src_no1) doDtl_aprv_src_no1_NC(info);
		else if (nc == columnDtl_aprv_src_no2) doDtl_aprv_src_no2_NC(info);
		else if (nc == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NC(info);
		else if (nc == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NC(info);
		else if (nc == columnDtl_last_aprv_tm) doDtl_last_aprv_tm_NC(info);
		else if (nc == columnDtl_last_aprv_usr_cd) doDtl_last_aprv_usr_cd_NC(info);
		else if (nc == columnDtl_last_aprv_usr_nm) doDtl_last_aprv_usr_nm_NC(info);
		else if (nc == columnDtl_ins_dt) doDtl_ins_dt_NC(info);
		else if (nc == columnDtl_src_ins_usr_cd) doDtl_src_ins_usr_cd_NC(info);
		else if (nc == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_NC(info);
		else if (nc == columnDtl_biz_usr_cd) doDtl_biz_usr_cd_NC(info);
		else if (nc == columnDtl_biz_usr_nm) doDtl_biz_usr_nm_NC(info);
		else if (nc == columnDtl_src_dpt_cd) doDtl_src_dpt_cd_NC(info);
		else if (nc == columnDtl_src_dpt_nm) doDtl_src_dpt_nm_NC(info);
		else if (nc == columnDtl_src_bp_cd) doDtl_src_bp_cd_NC(info);
		else if (nc == columnDtl_src_bp_nm) doDtl_src_bp_nm_NC(info);
		else if (nc == columnDtl_src_cur_cd1) doDtl_src_cur_cd1_NC(info);
		else if (nc == columnDtl_src_cur_nm1) doDtl_src_cur_nm1_NC(info);
		else if (nc == columnDtl_src_amt1) doDtl_src_amt1_NC(info);
		else if (nc == columnDtl_src_cur_cd2) doDtl_src_cur_cd2_NC(info);
		else if (nc == columnDtl_src_cur_nm2) doDtl_src_cur_nm2_NC(info);
		else if (nc == columnDtl_src_amt2) doDtl_src_amt2_NC(info);
		else if (nc == columnDtl_src_cur_cd3) doDtl_src_cur_cd3_NC(info);
		else if (nc == columnDtl_src_cur_nm3) doDtl_src_cur_nm3_NC(info);
		else if (nc == columnDtl_src_amt3) doDtl_src_amt3_NC(info);
		else if (nc == columnDtl_src_ext_key1) doDtl_src_ext_key1_NC(info);
		else if (nc == columnDtl_src_ext_key2) doDtl_src_ext_key2_NC(info);
		else if (nc == columnDtl_src_ext_key3) doDtl_src_ext_key3_NC(info);
		else if (nc == columnDtl_next_opr_flg) doDtl_next_opr_flg_NC(info);
		else if (nc == columnDtl_aprv_upd_flg) doDtl_aprv_upd_flg_NC(info);
		else if (nc == columnDtl_aprv_can_flg) doDtl_aprv_can_flg_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl2_aprv_no) doDtl2_aprv_no_NC(info);
		else if (nc == columnDtl2_aprv_no_seq) doDtl2_aprv_no_seq_NC(info);
		else if (nc == columnDtl2_aprv_seq) doDtl2_aprv_seq_NC(info);
		else if (nc == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_NC(info);
		else if (nc == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_NC(info);
		else if (nc == columnDtl2_email1) doDtl2_email1_NC(info);
		else if (nc == columnDtl2_email2) doDtl2_email2_NC(info);
		else if (nc == columnDtl2_email3) doDtl2_email3_NC(info);
		else if (nc == columnDtl2_tel1) doDtl2_tel1_NC(info);
		else if (nc == columnDtl2_tel2) doDtl2_tel2_NC(info);
		else if (nc == columnDtl2_tel3) doDtl2_tel3_NC(info);
		else if (nc == columnDtl2_th_image) doDtl2_th_image_NC(info);
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
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_dtl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dtl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_tm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[next_opr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_next_opr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_can_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_seq_NC(MCEventInfo info){
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
	 * [Dtl2]パネルの[email1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[th_image]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_th_image_NC(MCEventInfo info){
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
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_aprv_func_typ) doCnd_aprv_func_typ_NE(info);
		else if (ne == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_NE(info);
		else if (ne == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_NE(info);
		else if (ne == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_aprv_no) doCnd_aprv_no_NE(info);
		else if (ne == Cnd_aprv_src_no1) doCnd_aprv_src_no1_NE(info);
		else if (ne == Cnd_aprv_src_no2) doCnd_aprv_src_no2_NE(info);
		else if (ne == Cnd_ins_dt_fr) doCnd_ins_dt_fr_NE(info);
		else if (ne == Cnd_ins_dt_to) doCnd_ins_dt_to_NE(info);
		else if (ne == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_NE(info);
		else if (ne == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_NE(info);
		else if (ne == Cnd_usr_dtl_flg) doCnd_usr_dtl_flg_NE(info);
		else if (ne == columnDtl_aprv_func_typ) doDtl_aprv_func_typ_NE(info);
		else if (ne == columnDtl_aprv_func_typ_nm) doDtl_aprv_func_typ_nm_NE(info);
		else if (ne == columnDtl_aprv_no) doDtl_aprv_no_NE(info);
		else if (ne == columnDtl_aprv_no_seq) doDtl_aprv_no_seq_NE(info);
		else if (ne == columnDtl_aprv_src_no1) doDtl_aprv_src_no1_NE(info);
		else if (ne == columnDtl_aprv_src_no2) doDtl_aprv_src_no2_NE(info);
		else if (ne == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NE(info);
		else if (ne == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NE(info);
		else if (ne == columnDtl_last_aprv_tm) doDtl_last_aprv_tm_NE(info);
		else if (ne == columnDtl_last_aprv_usr_cd) doDtl_last_aprv_usr_cd_NE(info);
		else if (ne == columnDtl_last_aprv_usr_nm) doDtl_last_aprv_usr_nm_NE(info);
		else if (ne == columnDtl_ins_dt) doDtl_ins_dt_NE(info);
		else if (ne == columnDtl_src_ins_usr_cd) doDtl_src_ins_usr_cd_NE(info);
		else if (ne == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_NE(info);
		else if (ne == columnDtl_biz_usr_cd) doDtl_biz_usr_cd_NE(info);
		else if (ne == columnDtl_biz_usr_nm) doDtl_biz_usr_nm_NE(info);
		else if (ne == columnDtl_src_dpt_cd) doDtl_src_dpt_cd_NE(info);
		else if (ne == columnDtl_src_dpt_nm) doDtl_src_dpt_nm_NE(info);
		else if (ne == columnDtl_src_bp_cd) doDtl_src_bp_cd_NE(info);
		else if (ne == columnDtl_src_bp_nm) doDtl_src_bp_nm_NE(info);
		else if (ne == columnDtl_src_cur_cd1) doDtl_src_cur_cd1_NE(info);
		else if (ne == columnDtl_src_cur_nm1) doDtl_src_cur_nm1_NE(info);
		else if (ne == columnDtl_src_amt1) doDtl_src_amt1_NE(info);
		else if (ne == columnDtl_src_cur_cd2) doDtl_src_cur_cd2_NE(info);
		else if (ne == columnDtl_src_cur_nm2) doDtl_src_cur_nm2_NE(info);
		else if (ne == columnDtl_src_amt2) doDtl_src_amt2_NE(info);
		else if (ne == columnDtl_src_cur_cd3) doDtl_src_cur_cd3_NE(info);
		else if (ne == columnDtl_src_cur_nm3) doDtl_src_cur_nm3_NE(info);
		else if (ne == columnDtl_src_amt3) doDtl_src_amt3_NE(info);
		else if (ne == columnDtl_src_ext_key1) doDtl_src_ext_key1_NE(info);
		else if (ne == columnDtl_src_ext_key2) doDtl_src_ext_key2_NE(info);
		else if (ne == columnDtl_src_ext_key3) doDtl_src_ext_key3_NE(info);
		else if (ne == columnDtl_next_opr_flg) doDtl_next_opr_flg_NE(info);
		else if (ne == columnDtl_aprv_upd_flg) doDtl_aprv_upd_flg_NE(info);
		else if (ne == columnDtl_aprv_can_flg) doDtl_aprv_can_flg_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl2_aprv_no) doDtl2_aprv_no_NE(info);
		else if (ne == columnDtl2_aprv_no_seq) doDtl2_aprv_no_seq_NE(info);
		else if (ne == columnDtl2_aprv_seq) doDtl2_aprv_seq_NE(info);
		else if (ne == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_NE(info);
		else if (ne == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_NE(info);
		else if (ne == columnDtl2_email1) doDtl2_email1_NE(info);
		else if (ne == columnDtl2_email2) doDtl2_email2_NE(info);
		else if (ne == columnDtl2_email3) doDtl2_email3_NE(info);
		else if (ne == columnDtl2_tel1) doDtl2_tel1_NE(info);
		else if (ne == columnDtl2_tel2) doDtl2_tel2_NE(info);
		else if (ne == columnDtl2_tel3) doDtl2_tel3_NE(info);
		else if (ne == columnDtl2_th_image) doDtl2_th_image_NE(info);
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
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_dtl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dtl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_tm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[next_opr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_next_opr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_can_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_seq_NE(MCEventInfo info){
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
	 * [Dtl2]パネルの[email1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[th_image]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_th_image_NE(MCEventInfo info){
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
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_aprv_func_typ) doCnd_aprv_func_typ_NX(info);
		else if (nx == Cnd_aprv_func_typ_nm) doCnd_aprv_func_typ_nm_NX(info);
		else if (nx == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_NX(info);
		else if (nx == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_aprv_no) doCnd_aprv_no_NX(info);
		else if (nx == Cnd_aprv_src_no1) doCnd_aprv_src_no1_NX(info);
		else if (nx == Cnd_aprv_src_no2) doCnd_aprv_src_no2_NX(info);
		else if (nx == Cnd_ins_dt_fr) doCnd_ins_dt_fr_NX(info);
		else if (nx == Cnd_ins_dt_to) doCnd_ins_dt_to_NX(info);
		else if (nx == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_NX(info);
		else if (nx == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_NX(info);
		else if (nx == Cnd_usr_dtl_flg) doCnd_usr_dtl_flg_NX(info);
		else if (nx == columnDtl_aprv_func_typ) doDtl_aprv_func_typ_NX(info);
		else if (nx == columnDtl_aprv_func_typ_nm) doDtl_aprv_func_typ_nm_NX(info);
		else if (nx == columnDtl_aprv_no) doDtl_aprv_no_NX(info);
		else if (nx == columnDtl_aprv_no_seq) doDtl_aprv_no_seq_NX(info);
		else if (nx == columnDtl_aprv_src_no1) doDtl_aprv_src_no1_NX(info);
		else if (nx == columnDtl_aprv_src_no2) doDtl_aprv_src_no2_NX(info);
		else if (nx == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NX(info);
		else if (nx == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NX(info);
		else if (nx == columnDtl_last_aprv_tm) doDtl_last_aprv_tm_NX(info);
		else if (nx == columnDtl_last_aprv_usr_cd) doDtl_last_aprv_usr_cd_NX(info);
		else if (nx == columnDtl_last_aprv_usr_nm) doDtl_last_aprv_usr_nm_NX(info);
		else if (nx == columnDtl_ins_dt) doDtl_ins_dt_NX(info);
		else if (nx == columnDtl_src_ins_usr_cd) doDtl_src_ins_usr_cd_NX(info);
		else if (nx == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_NX(info);
		else if (nx == columnDtl_biz_usr_cd) doDtl_biz_usr_cd_NX(info);
		else if (nx == columnDtl_biz_usr_nm) doDtl_biz_usr_nm_NX(info);
		else if (nx == columnDtl_src_dpt_cd) doDtl_src_dpt_cd_NX(info);
		else if (nx == columnDtl_src_dpt_nm) doDtl_src_dpt_nm_NX(info);
		else if (nx == columnDtl_src_bp_cd) doDtl_src_bp_cd_NX(info);
		else if (nx == columnDtl_src_bp_nm) doDtl_src_bp_nm_NX(info);
		else if (nx == columnDtl_src_cur_cd1) doDtl_src_cur_cd1_NX(info);
		else if (nx == columnDtl_src_cur_nm1) doDtl_src_cur_nm1_NX(info);
		else if (nx == columnDtl_src_amt1) doDtl_src_amt1_NX(info);
		else if (nx == columnDtl_src_cur_cd2) doDtl_src_cur_cd2_NX(info);
		else if (nx == columnDtl_src_cur_nm2) doDtl_src_cur_nm2_NX(info);
		else if (nx == columnDtl_src_amt2) doDtl_src_amt2_NX(info);
		else if (nx == columnDtl_src_cur_cd3) doDtl_src_cur_cd3_NX(info);
		else if (nx == columnDtl_src_cur_nm3) doDtl_src_cur_nm3_NX(info);
		else if (nx == columnDtl_src_amt3) doDtl_src_amt3_NX(info);
		else if (nx == columnDtl_src_ext_key1) doDtl_src_ext_key1_NX(info);
		else if (nx == columnDtl_src_ext_key2) doDtl_src_ext_key2_NX(info);
		else if (nx == columnDtl_src_ext_key3) doDtl_src_ext_key3_NX(info);
		else if (nx == columnDtl_next_opr_flg) doDtl_next_opr_flg_NX(info);
		else if (nx == columnDtl_aprv_upd_flg) doDtl_aprv_upd_flg_NX(info);
		else if (nx == columnDtl_aprv_can_flg) doDtl_aprv_can_flg_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl2_aprv_no) doDtl2_aprv_no_NX(info);
		else if (nx == columnDtl2_aprv_no_seq) doDtl2_aprv_no_seq_NX(info);
		else if (nx == columnDtl2_aprv_seq) doDtl2_aprv_seq_NX(info);
		else if (nx == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_NX(info);
		else if (nx == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_NX(info);
		else if (nx == columnDtl2_email1) doDtl2_email1_NX(info);
		else if (nx == columnDtl2_email2) doDtl2_email2_NX(info);
		else if (nx == columnDtl2_email3) doDtl2_email3_NX(info);
		else if (nx == columnDtl2_tel1) doDtl2_tel1_NX(info);
		else if (nx == columnDtl2_tel2) doDtl2_tel2_NX(info);
		else if (nx == columnDtl2_tel3) doDtl2_tel3_NX(info);
		else if (nx == columnDtl2_th_image) doDtl2_th_image_NX(info);
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
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_dtl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dtl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_tm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[next_opr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_next_opr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_can_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_seq_NX(MCEventInfo info){
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
	 * [Dtl2]パネルの[email1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[th_image]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_th_image_NX(MCEventInfo info){
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
		else if (lc == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_LC(info);
		else if (lc == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_aprv_no) doCnd_aprv_no_LC(info);
		else if (lc == Cnd_aprv_src_no1) doCnd_aprv_src_no1_LC(info);
		else if (lc == Cnd_aprv_src_no2) doCnd_aprv_src_no2_LC(info);
		else if (lc == Cnd_ins_dt_fr) doCnd_ins_dt_fr_LC(info);
		else if (lc == Cnd_ins_dt_to) doCnd_ins_dt_to_LC(info);
		else if (lc == Cnd_ins_biz_usr_cd) doCnd_ins_biz_usr_cd_LC(info);
		else if (lc == Cnd_ins_biz_usr_nm) doCnd_ins_biz_usr_nm_LC(info);
		else if (lc == columnDtl_aprv_func_typ) doDtl_aprv_func_typ_LC(info);
		else if (lc == columnDtl_aprv_func_typ_nm) doDtl_aprv_func_typ_nm_LC(info);
		else if (lc == columnDtl_aprv_no) doDtl_aprv_no_LC(info);
		else if (lc == columnDtl_aprv_no_seq) doDtl_aprv_no_seq_LC(info);
		else if (lc == columnDtl_aprv_src_no1) doDtl_aprv_src_no1_LC(info);
		else if (lc == columnDtl_aprv_src_no2) doDtl_aprv_src_no2_LC(info);
		else if (lc == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_LC(info);
		else if (lc == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_LC(info);
		else if (lc == columnDtl_last_aprv_tm) doDtl_last_aprv_tm_LC(info);
		else if (lc == columnDtl_last_aprv_usr_cd) doDtl_last_aprv_usr_cd_LC(info);
		else if (lc == columnDtl_last_aprv_usr_nm) doDtl_last_aprv_usr_nm_LC(info);
		else if (lc == columnDtl_ins_dt) doDtl_ins_dt_LC(info);
		else if (lc == columnDtl_src_ins_usr_cd) doDtl_src_ins_usr_cd_LC(info);
		else if (lc == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_LC(info);
		else if (lc == columnDtl_biz_usr_cd) doDtl_biz_usr_cd_LC(info);
		else if (lc == columnDtl_biz_usr_nm) doDtl_biz_usr_nm_LC(info);
		else if (lc == columnDtl_src_dpt_cd) doDtl_src_dpt_cd_LC(info);
		else if (lc == columnDtl_src_dpt_nm) doDtl_src_dpt_nm_LC(info);
		else if (lc == columnDtl_src_bp_cd) doDtl_src_bp_cd_LC(info);
		else if (lc == columnDtl_src_bp_nm) doDtl_src_bp_nm_LC(info);
		else if (lc == columnDtl_src_cur_cd1) doDtl_src_cur_cd1_LC(info);
		else if (lc == columnDtl_src_cur_nm1) doDtl_src_cur_nm1_LC(info);
		else if (lc == columnDtl_src_amt1) doDtl_src_amt1_LC(info);
		else if (lc == columnDtl_src_cur_cd2) doDtl_src_cur_cd2_LC(info);
		else if (lc == columnDtl_src_cur_nm2) doDtl_src_cur_nm2_LC(info);
		else if (lc == columnDtl_src_amt2) doDtl_src_amt2_LC(info);
		else if (lc == columnDtl_src_cur_cd3) doDtl_src_cur_cd3_LC(info);
		else if (lc == columnDtl_src_cur_nm3) doDtl_src_cur_nm3_LC(info);
		else if (lc == columnDtl_src_amt3) doDtl_src_amt3_LC(info);
		else if (lc == columnDtl_src_ext_key1) doDtl_src_ext_key1_LC(info);
		else if (lc == columnDtl_src_ext_key2) doDtl_src_ext_key2_LC(info);
		else if (lc == columnDtl_src_ext_key3) doDtl_src_ext_key3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl2_aprv_no) doDtl2_aprv_no_LC(info);
		else if (lc == columnDtl2_aprv_no_seq) doDtl2_aprv_no_seq_LC(info);
		else if (lc == columnDtl2_aprv_seq) doDtl2_aprv_seq_LC(info);
		else if (lc == columnDtl2_aprv_usr_cd) doDtl2_aprv_usr_cd_LC(info);
		else if (lc == columnDtl2_aprv_usr_nm) doDtl2_aprv_usr_nm_LC(info);
		else if (lc == columnDtl2_email1) doDtl2_email1_LC(info);
		else if (lc == columnDtl2_email2) doDtl2_email2_LC(info);
		else if (lc == columnDtl2_email3) doDtl2_email3_LC(info);
		else if (lc == columnDtl2_tel1) doDtl2_tel1_LC(info);
		else if (lc == columnDtl2_tel2) doDtl2_tel2_LC(info);
		else if (lc == columnDtl2_tel3) doDtl2_tel3_LC(info);
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
	 * [Cnd]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[aprv_func_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_func_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_func_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_src_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_src_no2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_tm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_aprv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_aprv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[biz_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_biz_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_cur_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_cur_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_amt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_amt3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ext_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ext_key3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_seq_LC(MCEventInfo info){
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
	 * [Dtl2]パネルの[email1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[email3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_email3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[tel3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_tel3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ins_biz_usr_cd]の作成メソッド
	 */
	public MCList getCnd_ins_biz_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBAL0010.Srch01")) {
			return new MB_MBBAL0010_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBAL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBAL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBAL0010_Srch01;

		/** コンストラクタ */
		protected MB_MBBAL0010_Srch01Bridge() {
			p_MB_MBBAL0010_Srch01 = new MCParam(PDef.MB_MBBAL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBAL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBA.MBBAP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0010.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0010.Dtl2R.class));

			p_MB_MBBAL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBAL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBAL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBAL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBAL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBA.MBBAP0010.CndR up0() {
			return (mcframe.clientMBBA.MBBAP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBA.MBBAP0010.DtlR> down0() {
			return (MCList<mcframe.clientMBBA.MBBAP0010.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R> down1() {
			return (MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R>)down(1);
		}

		protected void setupDownParam() {
			p_MB_MBBAL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0010.DtlR.class));
			p_MB_MBBAL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMBBA.MBBAP0010.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MB_MBBAL0010_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMBBA.MBBAP0010.DtlR>)p_MB_MBBAL0010_Srch01.getContainerParam().getDownBlock(0));
			setDtl2L((MCList<mcframe.clientMBBA.MBBAP0010.Dtl2R>)p_MB_MBBAL0010_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtl2L());
			return result;
		}
	}
}