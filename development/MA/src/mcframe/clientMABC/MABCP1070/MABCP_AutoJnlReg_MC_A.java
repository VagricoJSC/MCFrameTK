package mcframe.clientMABC.MABCP1070;

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
import mcframe.clientMABC.MABCP1070.MABCP_AutoJnlReg_MC.MA_MABCL1070_Srch01Caller;
import mcframe.clientMABC.MABCP1070.MABCP_AutoJnlReg_MC.MA_MABCL1070_Upd01Caller;
import mcframe.clientMABC.MABCP1070.MABCP_AutoJnlReg_MC.MA_MABCL1070_Del01Caller;

/**
 * 画面"MABCP_AutoJnlReg"パネルクラスです。<p>
 *
 * 自動仕訳マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_AutoJnlReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP1070";

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
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_p_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt_p.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt_p.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt_p.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt_p.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public MCLabel Cnd_ac_slip_typ_Label = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_slip_typ_nm = null;
	public MCLabel Cnd_auto_jnl_key_cd_Label = null;
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_auto_jnl_key_cd = null;
	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public MCTextField Cnd_auto_jnl_key_nm = null;
	/**
	 * Without auto-journal key 自動仕訳キー無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_auto_jnl_key_flg = null;
	public MCLabel Cnd_auto_jnl_grp_Label = null;
	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public MCTextField Cnd_auto_jnl_grp = null;
	public MCLabel Cnd_jnl_ptn_cd_Label = null;
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_jnl_ptn_cd = null;
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public MCTextField Cnd_jnl_ptn_nm = null;
	public MCLabel Cnd_ac_if_typ_Label = null;
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_if_typ = null;
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_if_typ_nm = null;
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1070.DtlR> DtlTable = null;
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
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_typ_nm = null;
	/**
	 * Auto-journal key cd. 自動仕訳キーＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_auto_jnl_key_cd = null;
	/**
	 * Auto-journal key name 自動仕訳キー名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_auto_jnl_key_nm = null;
	/**
	 * Auto-journal group 自動仕訳グループ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_auto_jnl_grp = null;
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_ptn_cd = null;
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_ptn_nm = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prio = null;
	/**
	 * Accounting IF type 会計ＩＦ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_if_typ = null;
	/**
	 * Accounting IF type name 会計ＩＦ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_if_typ_nm = null;
	/**
	 * Slip ID type 伝票ＩＤ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_id_typ = null;
	/**
	 * Slip ID type name 伝票ＩＤ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_id_typ_nm = null;
	/**
	 * Slip group ID 伝票グループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_cnt_id = null;
	/**
	 * Standard evaluation rounding type 標準評価端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_rnd_typ = null;
	/**
	 * Standard evaluation rounding type name 標準評価端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_rnd_typ_nm = null;
	/**
	 * Closing entry type 決算仕訳区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cls_jnl_typ = null;
	/**
	 * Closing entry type name 決算仕訳区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cls_jnl_typ_nm = null;
	/**
	 * Compound journal type 複合仕訳区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_compound_jnl_typ = null;
	/**
	 * Compound journal type name 複合仕訳区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_compound_jnl_typ_nm = null;
	/**
	 * Allocation journal 配賦仕訳.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_jnl_flg = null;
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_minus_flg = null;
	/**
	 * Debit credit reverse 貸借逆転.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rev_flg = null;
	/**
	 * Reverse minus マイナス逆転.<p>
	 *
	 */
	public MCColumnConfig columnDtl_minus_rev_flg = null;
	/**
	 * Default デフォルト.<p>
	 *
	 */
	public MCColumnConfig columnDtl_default_flg = null;
	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abs_typ = null;
	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abs_typ_nm = null;
	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abstract1 = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MABCP1090 = null;
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
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
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
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
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
	
	/** [MA_MABCL1070_Srch01]のCallerの作成 */
	protected MABCP_AutoJnlReg_MC.MA_MABCL1070_Srch01Caller createMA_MABCL1070_Srch01() {
		MABCP_AutoJnlReg_MC.MA_MABCL1070_Srch01Caller<MABCP_AutoJnlReg, MA_MABCL1070_Srch01Bridge>
		caller = ((MABCP_AutoJnlReg_MC)this).new MA_MABCL1070_Srch01Caller<MABCP_AutoJnlReg, MA_MABCL1070_Srch01Bridge>(
					(MABCP_AutoJnlReg)this, new MA_MABCL1070_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL1070_Srch01]の呼び出し */
	protected void callMA_MABCL1070_Srch01() {
		MCCaller caller = createMA_MABCL1070_Srch01();
		caller.exec();
	}
	/** [MA_MABCL1070_Upd01]のCallerの作成 */
	protected MABCP_AutoJnlReg_MC.MA_MABCL1070_Upd01Caller createMA_MABCL1070_Upd01() {
		MABCP_AutoJnlReg_MC.MA_MABCL1070_Upd01Caller<MABCP_AutoJnlReg, MA_MABCL1070_Upd01Bridge>
		caller = ((MABCP_AutoJnlReg_MC)this).new MA_MABCL1070_Upd01Caller<MABCP_AutoJnlReg, MA_MABCL1070_Upd01Bridge>(
					(MABCP_AutoJnlReg)this, new MA_MABCL1070_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL1070_Upd01]の呼び出し */
	protected void callMA_MABCL1070_Upd01() {
		MCCaller caller = createMA_MABCL1070_Upd01();
		caller.exec();
	}
	/** [MA_MABCL1070_Del01]のCallerの作成 */
	protected MABCP_AutoJnlReg_MC.MA_MABCL1070_Del01Caller createMA_MABCL1070_Del01() {
		MABCP_AutoJnlReg_MC.MA_MABCL1070_Del01Caller<MABCP_AutoJnlReg, MA_MABCL1070_Del01Bridge>
		caller = ((MABCP_AutoJnlReg_MC)this).new MA_MABCL1070_Del01Caller<MABCP_AutoJnlReg, MA_MABCL1070_Del01Bridge>(
					(MABCP_AutoJnlReg)this, new MA_MABCL1070_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL1070_Del01]の呼び出し */
	protected void callMA_MABCL1070_Del01() {
		MCCaller caller = createMA_MABCL1070_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1070.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1070.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1070.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP1070.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1070.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1070.MstR createMstR() {
		return mcframe.clientMABC.MABCP1070.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP1070.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1070.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1070.CndR createCndR() {
		return mcframe.clientMABC.MABCP1070.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP1070.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1070.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP1070.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP1070.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1070.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1070.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
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
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_AutoJnlReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_AutoJnlReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_AutoJnlReg_MC.jbCreateScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateMst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateTop((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateFold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateCnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateCtrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateDtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateBtn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbCreateEastBtn((MABCP_AutoJnlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_AutoJnlReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_AutoJnlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_AutoJnlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_AutoJnlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_AutoJnlReg p) {
		p.Cnd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt_p());
		p.Cnd_dt_p_PPanel.setName("Cnd.dt_p");
		p.Cnd_st_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_p_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_p_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_AutoJnlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_AutoJnlReg p) {
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP1070.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_AutoJnlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_AutoJnlReg p) {
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

	
	/** [Cnd_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_slip_typ_p = null;

	/**
	 * [Cnd_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_slip_typ_ListPutter() {
		if (Cnd_ac_slip_typ_p == null) {
			Cnd_ac_slip_typ_p = createCnd_ac_slip_typ_ListPutter(Cnd_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Cnd_ac_slip_typ_p;
	}
	
	
	/** [Cnd_auto_jnl_key_cd_ListPutter]の定義 */
	private MCListPutter Cnd_auto_jnl_key_cd_p = null;

	/**
	 * [Cnd_auto_jnl_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_auto_jnl_key_cd_ListPutter() {
		if (Cnd_auto_jnl_key_cd_p == null) {
			Cnd_auto_jnl_key_cd_p = createCnd_auto_jnl_key_cd_ListPutter(Cnd_auto_jnl_key_cd, "auto_jnl_key_cd", "auto_jnl_key_nm");

		}
		return Cnd_auto_jnl_key_cd_p;
	}
	
	
	/** [Cnd_jnl_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_ptn_cd_p = null;

	/**
	 * [Cnd_jnl_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_ptn_cd_ListPutter() {
		if (Cnd_jnl_ptn_cd_p == null) {
			Cnd_jnl_ptn_cd_p = createCnd_jnl_ptn_cd_ListPutter(Cnd_jnl_ptn_cd, "jnl_ptn_cd", "jnl_ptn_nm");

		}
		return Cnd_jnl_ptn_cd_p;
	}
	
	
	/** [Cnd_ac_if_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_if_typ_p = null;

	/**
	 * [Cnd_ac_if_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_if_typ_ListPutter() {
		if (Cnd_ac_if_typ_p == null) {
			Cnd_ac_if_typ_p = createCnd_ac_if_typ_ListPutter(Cnd_ac_if_typ, "ac_if_typ", "ac_if_typ_nm");

		}
		return Cnd_ac_if_typ_p;
	}
	
	
	/** [Dtl_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ac_slip_typ_p = null;

	/**
	 * [Dtl_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_slip_typ_ListPutter() {
		if (Dtl_ac_slip_typ_p == null) {
			Dtl_ac_slip_typ_p = createDtl_ac_slip_typ_ListPutter(columnDtl_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Dtl_ac_slip_typ_p;
	}
	
	
	/** [Dtl_auto_jnl_key_cd_ListPutter]の定義 */
	private MCListPutter Dtl_auto_jnl_key_cd_p = null;

	/**
	 * [Dtl_auto_jnl_key_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_auto_jnl_key_cd_ListPutter() {
		if (Dtl_auto_jnl_key_cd_p == null) {
			Dtl_auto_jnl_key_cd_p = createDtl_auto_jnl_key_cd_ListPutter(columnDtl_auto_jnl_key_cd, "auto_jnl_key_cd", "auto_jnl_key_nm");

		}
		return Dtl_auto_jnl_key_cd_p;
	}
	
	
	/** [Dtl_jnl_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_jnl_ptn_cd_p = null;

	/**
	 * [Dtl_jnl_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_jnl_ptn_cd_ListPutter() {
		if (Dtl_jnl_ptn_cd_p == null) {
			Dtl_jnl_ptn_cd_p = createDtl_jnl_ptn_cd_ListPutter(columnDtl_jnl_ptn_cd, "jnl_ptn_cd", "jnl_ptn_nm");

		}
		return Dtl_jnl_ptn_cd_p;
	}
	
	
	/** [Dtl_ac_if_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ac_if_typ_p = null;

	/**
	 * [Dtl_ac_if_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_if_typ_ListPutter() {
		if (Dtl_ac_if_typ_p == null) {
			Dtl_ac_if_typ_p = createDtl_ac_if_typ_ListPutter(columnDtl_ac_if_typ, "ac_if_typ", "ac_if_typ_nm");

		}
		return Dtl_ac_if_typ_p;
	}
	
	
	/** [Dtl_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_id_typ_p = null;

	/**
	 * [Dtl_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_id_typ_ListPutter() {
		if (Dtl_id_typ_p == null) {
			Dtl_id_typ_p = createDtl_id_typ_ListPutter(columnDtl_id_typ, "id_typ", "id_typ_nm");

		}
		return Dtl_id_typ_p;
	}
	
	
	/** [Dtl_std_rnd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_std_rnd_typ_p = null;

	/**
	 * [Dtl_std_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_std_rnd_typ_ListPutter() {
		if (Dtl_std_rnd_typ_p == null) {
			Dtl_std_rnd_typ_p = createDtl_std_rnd_typ_ListPutter(columnDtl_std_rnd_typ, "std_rnd_typ", "std_rnd_typ_nm");

		}
		return Dtl_std_rnd_typ_p;
	}
	
	
	/** [Dtl_cls_jnl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_cls_jnl_typ_p = null;

	/**
	 * [Dtl_cls_jnl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cls_jnl_typ_ListPutter() {
		if (Dtl_cls_jnl_typ_p == null) {
			Dtl_cls_jnl_typ_p = createDtl_cls_jnl_typ_ListPutter(columnDtl_cls_jnl_typ, "cls_jnl_typ", "cls_jnl_typ_nm");

		}
		return Dtl_cls_jnl_typ_p;
	}
	
	
	/** [Dtl_compound_jnl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_compound_jnl_typ_p = null;

	/**
	 * [Dtl_compound_jnl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_compound_jnl_typ_ListPutter() {
		if (Dtl_compound_jnl_typ_p == null) {
			Dtl_compound_jnl_typ_p = createDtl_compound_jnl_typ_ListPutter(columnDtl_compound_jnl_typ, "compound_jnl_typ", "compound_jnl_typ_nm");

		}
		return Dtl_compound_jnl_typ_p;
	}
	
	
	/** [Dtl_abs_typ_ListPutter]の定義 */
	private MCListPutter Dtl_abs_typ_p = null;

	/**
	 * [Dtl_abs_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_abs_typ_ListPutter() {
		if (Dtl_abs_typ_p == null) {
			Dtl_abs_typ_p = createDtl_abs_typ_ListPutter(columnDtl_abs_typ, "abs_typ", "abs_typ_nm");

		}
		return Dtl_abs_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_AutoJnlReg create(){
		MABCP_AutoJnlReg p = new MABCP_AutoJnlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_AutoJnlReg create(String name){
		MABCP_AutoJnlReg p = new MABCP_AutoJnlReg(name);
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
		MABCP_AutoJnlReg_MC.jbfInitScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitMst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitTop((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitFold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitCnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitCtrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitDtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitBtn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbfInitEastBtn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitMst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitTop((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitFold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitCnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitCtrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitDtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitBtn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.jbInitEastBtn((MABCP_AutoJnlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_AutoJnlReg p) {
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
	protected static void jbfInitTop(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_auto_jnl_key_cd_Label = p.beansFactory.createLabel("Cnd.auto_jnl_key_cd_Label");
		p.Cnd_auto_jnl_key_cd = p.beansFactory.createTextComboBox("Cnd.auto_jnl_key_cd");
		p.Cnd_auto_jnl_key_cd.setLabel(p.Cnd_auto_jnl_key_cd_Label);
		p.Cnd_auto_jnl_key_nm = p.beansFactory.createTextField("Cnd.auto_jnl_key_nm");
		p.Cnd_no_auto_jnl_key_flg = p.beansFactory.createCheckBox("Cnd.no_auto_jnl_key_flg");
		p.Cnd_auto_jnl_grp_Label = p.beansFactory.createLabel("Cnd.auto_jnl_grp_Label");
		p.Cnd_auto_jnl_grp = p.beansFactory.createTextField("Cnd.auto_jnl_grp");
		p.Cnd_auto_jnl_grp.setLabel(p.Cnd_auto_jnl_grp_Label);
		p.Cnd_jnl_ptn_cd_Label = p.beansFactory.createLabel("Cnd.jnl_ptn_cd_Label");
		p.Cnd_jnl_ptn_cd = p.beansFactory.createTextComboBox("Cnd.jnl_ptn_cd");
		p.Cnd_jnl_ptn_cd.setLabel(p.Cnd_jnl_ptn_cd_Label);
		p.Cnd_jnl_ptn_nm = p.beansFactory.createTextField("Cnd.jnl_ptn_nm");
		p.Cnd_ac_if_typ_Label = p.beansFactory.createLabel("Cnd.ac_if_typ_Label");
		p.Cnd_ac_if_typ = p.beansFactory.createTextComboBox("Cnd.ac_if_typ");
		p.Cnd_ac_if_typ.setLabel(p.Cnd_ac_if_typ_Label);
		p.Cnd_ac_if_typ_nm = p.beansFactory.createTextField("Cnd.ac_if_typ_nm");
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
	protected static void jbfInitCtrl(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_ac_slip_typ = p.beansFactory.createTableColumn("Dtl.ac_slip_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_slip_typ_nm = p.beansFactory.createTableColumn("Dtl.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnDtl_auto_jnl_key_cd = p.beansFactory.createTableColumn("Dtl.auto_jnl_key_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_auto_jnl_key_nm = p.beansFactory.createTableColumn("Dtl.auto_jnl_key_nm", MCColumnType.TEXT);
		p.columnDtl_auto_jnl_grp = p.beansFactory.createTableColumn("Dtl.auto_jnl_grp", MCColumnType.TEXT);
		p.columnDtl_jnl_ptn_cd = p.beansFactory.createTableColumn("Dtl.jnl_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_jnl_ptn_nm = p.beansFactory.createTableColumn("Dtl.jnl_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_prio = p.beansFactory.createTableColumn("Dtl.prio", MCColumnType.NUMBER);
		p.columnDtl_ac_if_typ = p.beansFactory.createTableColumn("Dtl.ac_if_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_if_typ_nm = p.beansFactory.createTableColumn("Dtl.ac_if_typ_nm", MCColumnType.TEXT);
		p.columnDtl_id_typ = p.beansFactory.createTableColumn("Dtl.id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_id_typ_nm = p.beansFactory.createTableColumn("Dtl.id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slip_cnt_id = p.beansFactory.createTableColumn("Dtl.slip_cnt_id", MCColumnType.TEXT);
		p.columnDtl_std_rnd_typ = p.beansFactory.createTableColumn("Dtl.std_rnd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_std_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.std_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cls_jnl_typ = p.beansFactory.createTableColumn("Dtl.cls_jnl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_cls_jnl_typ_nm = p.beansFactory.createTableColumn("Dtl.cls_jnl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_compound_jnl_typ = p.beansFactory.createTableColumn("Dtl.compound_jnl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_compound_jnl_typ_nm = p.beansFactory.createTableColumn("Dtl.compound_jnl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alloc_jnl_flg = p.beansFactory.createTableColumn("Dtl.alloc_jnl_flg", MCColumnType.CHECK);
		p.columnDtl_minus_flg = p.beansFactory.createTableColumn("Dtl.minus_flg", MCColumnType.CHECK);
		p.columnDtl_rev_flg = p.beansFactory.createTableColumn("Dtl.rev_flg", MCColumnType.CHECK);
		p.columnDtl_minus_rev_flg = p.beansFactory.createTableColumn("Dtl.minus_rev_flg", MCColumnType.CHECK);
		p.columnDtl_default_flg = p.beansFactory.createTableColumn("Dtl.default_flg", MCColumnType.CHECK);
		p.columnDtl_abs_typ = p.beansFactory.createTableColumn("Dtl.abs_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_abs_typ_nm = p.beansFactory.createTableColumn("Dtl.abs_typ_nm", MCColumnType.TEXT);
		p.columnDtl_abstract1 = p.beansFactory.createTableColumn("Dtl.abstract1", MCColumnType.TEXT);
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP1090 = p.beansFactory.createButton("Btn.open_MABCP1090", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_AutoJnlReg p) {
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
	protected static void jbInitMst(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP1070.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_AutoJnlReg p) {
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
	protected static void jbInitFold(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_AutoJnlReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.ope_META);
		p.CndPanel.add(p.Cnd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_auto_jnl_key_cd);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.ac_slip_typ_nm_META);
		p.Cnd_auto_jnl_key_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_auto_jnl_key_cd, true);
		p.Cnd_auto_jnl_key_cd.setLinkBeans(p.Cnd_auto_jnl_key_nm);
		p.CndPanel.add(p.Cnd_auto_jnl_key_cd_Label);
		p.CndPanel.add(p.Cnd_auto_jnl_key_cd);
		p.Cnd_auto_jnl_key_cd.setNextBeans(p.Cnd_auto_jnl_key_nm);
		p.Cnd_auto_jnl_key_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.auto_jnl_key_cd_META);
		p.CndPanel.add(p.Cnd_auto_jnl_key_nm);
		p.Cnd_auto_jnl_key_nm.setNextBeans(p.Cnd_no_auto_jnl_key_flg);
		p.Cnd_auto_jnl_key_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.auto_jnl_key_nm_META);
		p.CndPanel.add(p.Cnd_no_auto_jnl_key_flg);
		p.Cnd_no_auto_jnl_key_flg.setNextBeans(p.Cnd_auto_jnl_grp);
		p.Cnd_no_auto_jnl_key_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.no_auto_jnl_key_flg_META);
		p.CndPanel.add(p.Cnd_auto_jnl_grp_Label);
		p.CndPanel.add(p.Cnd_auto_jnl_grp);
		p.Cnd_auto_jnl_grp.setNextBeans(p.Cnd_jnl_ptn_cd);
		p.Cnd_auto_jnl_grp.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.auto_jnl_grp_META);
		p.setPluralValueEnable(p.Cnd_auto_jnl_grp, true);
		p.Cnd_jnl_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_jnl_ptn_cd, true);
		p.Cnd_jnl_ptn_cd.setLinkBeans(p.Cnd_jnl_ptn_nm);
		p.CndPanel.add(p.Cnd_jnl_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_jnl_ptn_cd);
		p.Cnd_jnl_ptn_cd.setNextBeans(p.Cnd_jnl_ptn_nm);
		p.Cnd_jnl_ptn_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.jnl_ptn_cd_META);
		p.CndPanel.add(p.Cnd_jnl_ptn_nm);
		p.Cnd_jnl_ptn_nm.setNextBeans(p.Cnd_ac_if_typ);
		p.Cnd_jnl_ptn_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.jnl_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_jnl_ptn_nm, true);
		p.Cnd_ac_if_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_if_typ, true);
		p.Cnd_ac_if_typ.setLinkBeans(p.Cnd_ac_if_typ_nm);
		p.CndPanel.add(p.Cnd_ac_if_typ_Label);
		p.CndPanel.add(p.Cnd_ac_if_typ);
		p.Cnd_ac_if_typ.setNextBeans(p.Cnd_ac_if_typ_nm);
		p.Cnd_ac_if_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.ac_if_typ_META);
		p.CndPanel.add(p.Cnd_ac_if_typ_nm);
		p.Cnd_ac_if_typ_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_ac_if_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.ac_if_typ_nm_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1070.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_AutoJnlReg p) {
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
	protected static void jbInitDtl(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_AutoJnlReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABCP1090.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP1090);
		p.BtnPanel.setLastBeans(p.Btn_open_MABCP1090);
		p.Btn_open_MABCP1090.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
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
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_AutoJnlReg p) {
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
		MABCP_AutoJnlReg_MC.mcInitScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitMst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitTop((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitFold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitCnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitCtrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitDtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitBtn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.mcInitEastBtn((MABCP_AutoJnlReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_AutoJnlReg_MC.statusInitUPD_ScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Mst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Top((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Fold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Cnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Ctrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Dtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_Btn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitUPD_EastBtn((MABCP_AutoJnlReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_AutoJnlReg_MC.statusInitFIX_ScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Mst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Top((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Fold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Cnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Ctrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Dtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_Btn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitFIX_EastBtn((MABCP_AutoJnlReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_AutoJnlReg_MC.statusInitDEL_ScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Mst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Top((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Fold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Cnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Ctrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Dtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_Btn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitDEL_EastBtn((MABCP_AutoJnlReg)this);

		// [REF]ステータスのモードの設定
		MABCP_AutoJnlReg_MC.statusInitREF_ScreenOpe((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Mst((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Top((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Fold((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Cnd((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Ctrl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Dtl((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_Btn((MABCP_AutoJnlReg)this);
		MABCP_AutoJnlReg_MC.statusInitREF_EastBtn((MABCP_AutoJnlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_AutoJnlReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_AutoJnlReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_AutoJnlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_AutoJnlReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_AutoJnlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_auto_jnl_key_cd.setListListener(p);
		p.Cnd_auto_jnl_key_cd.addAllListener(p);
		p.Cnd_auto_jnl_key_nm.setListListener(p);
		p.Cnd_auto_jnl_key_nm.addAllListener(p);
		p.Cnd_no_auto_jnl_key_flg.addAllListener(p);
		p.Cnd_auto_jnl_grp.setListListener(p);
		p.Cnd_auto_jnl_grp.addAllListener(p);
		p.Cnd_jnl_ptn_cd.setListListener(p);
		p.Cnd_jnl_ptn_cd.addAllListener(p);
		p.Cnd_jnl_ptn_nm.setListListener(p);
		p.Cnd_jnl_ptn_nm.addAllListener(p);
		p.Cnd_ac_if_typ.setListListener(p);
		p.Cnd_ac_if_typ.addAllListener(p);
		p.Cnd_ac_if_typ_nm.setListListener(p);
		p.Cnd_ac_if_typ_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABCP_AutoJnlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_AutoJnlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_ac_slip_typ.addAllListener(p);
		p.columnDtl_ac_slip_typ.setListListener(p);
		p.columnDtl_ac_slip_typ_nm.addAllListener(p);
		p.columnDtl_ac_slip_typ_nm.setListListener(p);
		p.columnDtl_auto_jnl_key_cd.addAllListener(p);
		p.columnDtl_auto_jnl_key_cd.setListListener(p);
		p.columnDtl_auto_jnl_key_nm.addAllListener(p);
		p.columnDtl_auto_jnl_key_nm.setListListener(p);
		p.columnDtl_auto_jnl_grp.addAllListener(p);
		p.columnDtl_auto_jnl_grp.setListListener(p);
		p.columnDtl_jnl_ptn_cd.addAllListener(p);
		p.columnDtl_jnl_ptn_cd.setListListener(p);
		p.columnDtl_jnl_ptn_nm.addAllListener(p);
		p.columnDtl_jnl_ptn_nm.setListListener(p);
		p.columnDtl_prio.addAllListener(p);
		p.columnDtl_prio.setListListener(p);
		p.columnDtl_ac_if_typ.addAllListener(p);
		p.columnDtl_ac_if_typ.setListListener(p);
		p.columnDtl_ac_if_typ_nm.addAllListener(p);
		p.columnDtl_ac_if_typ_nm.setListListener(p);
		p.columnDtl_id_typ.addAllListener(p);
		p.columnDtl_id_typ.setListListener(p);
		p.columnDtl_id_typ_nm.addAllListener(p);
		p.columnDtl_id_typ_nm.setListListener(p);
		p.columnDtl_slip_cnt_id.addAllListener(p);
		p.columnDtl_slip_cnt_id.setListListener(p);
		p.columnDtl_std_rnd_typ.addAllListener(p);
		p.columnDtl_std_rnd_typ.setListListener(p);
		p.columnDtl_std_rnd_typ_nm.addAllListener(p);
		p.columnDtl_std_rnd_typ_nm.setListListener(p);
		p.columnDtl_cls_jnl_typ.addAllListener(p);
		p.columnDtl_cls_jnl_typ.setListListener(p);
		p.columnDtl_cls_jnl_typ_nm.addAllListener(p);
		p.columnDtl_cls_jnl_typ_nm.setListListener(p);
		p.columnDtl_compound_jnl_typ.addAllListener(p);
		p.columnDtl_compound_jnl_typ.setListListener(p);
		p.columnDtl_compound_jnl_typ_nm.addAllListener(p);
		p.columnDtl_compound_jnl_typ_nm.setListListener(p);
		p.columnDtl_alloc_jnl_flg.addAllListener(p);
		p.columnDtl_minus_flg.addAllListener(p);
		p.columnDtl_rev_flg.addAllListener(p);
		p.columnDtl_minus_rev_flg.addAllListener(p);
		p.columnDtl_default_flg.addAllListener(p);
		p.columnDtl_abs_typ.addAllListener(p);
		p.columnDtl_abs_typ.setListListener(p);
		p.columnDtl_abs_typ_nm.addAllListener(p);
		p.columnDtl_abs_typ_nm.setListListener(p);
		p.columnDtl_abstract1.addAllListener(p);
		p.columnDtl_abstract1.setListListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_AutoJnlReg p) {
		p.Btn_open_MABCP1090.addAllListener(p);
		p.Btn_open_MABCP1090.setAPMethodName("doBtn_open_MABCP1090");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_AutoJnlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_AutoJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_AutoJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_AutoJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_AutoJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_AutoJnlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_auto_jnl_key_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_auto_jnl_key_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_no_auto_jnl_key_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_auto_jnl_grp.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_jnl_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_jnl_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_AutoJnlReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_AutoJnlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_slip_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_auto_jnl_key_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_grp.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_jnl_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_jnl_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_if_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_if_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slip_cnt_id.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_std_rnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_std_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cls_jnl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_compound_jnl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alloc_jnl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_minus_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_minus_rev_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_default_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_abs_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_abs_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_abstract1.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
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
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_AutoJnlReg p){
		p.Btn_open_MABCP1090.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_AutoJnlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_AutoJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_AutoJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_AutoJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_AutoJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_AutoJnlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_auto_jnl_key_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_auto_jnl_key_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_no_auto_jnl_key_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_auto_jnl_grp.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_jnl_ptn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_jnl_ptn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_AutoJnlReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_AutoJnlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_grp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_if_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_if_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_id_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_id_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slip_cnt_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_jnl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_minus_rev_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_default_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_abs_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_abs_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_abstract1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_AutoJnlReg p){
		p.Btn_open_MABCP1090.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_AutoJnlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_AutoJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_AutoJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_AutoJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_AutoJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_AutoJnlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_auto_jnl_key_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_auto_jnl_key_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_no_auto_jnl_key_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_auto_jnl_grp.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_jnl_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_jnl_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_AutoJnlReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_AutoJnlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_grp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_if_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_if_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slip_cnt_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_jnl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rev_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_minus_rev_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_default_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_abs_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_abs_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_abstract1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_AutoJnlReg p){
		p.Btn_open_MABCP1090.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_AutoJnlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_AutoJnlReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_AutoJnlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_AutoJnlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_AutoJnlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_AutoJnlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_auto_jnl_key_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_auto_jnl_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_no_auto_jnl_key_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_auto_jnl_grp.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_if_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_AutoJnlReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_AutoJnlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_key_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_auto_jnl_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_if_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_if_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slip_cnt_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cls_jnl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_compound_jnl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_jnl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_minus_rev_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_default_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_abs_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_abs_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_abstract1.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_AutoJnlReg p){
		p.Btn_open_MABCP1090.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_AutoJnlReg p){

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
		MABCP_AutoJnlReg_MC.setTableConfigDtl((MABCP_AutoJnlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_AutoJnlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP1070.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1070.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_ac_slip_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ac_slip_typ_META);
		p.columnDtl_ac_slip_typ.addLinkBeans(p.columnDtl_ac_slip_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ);
		p.columnDtl_ac_slip_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ac_slip_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ_nm);
		p.columnDtl_auto_jnl_key_cd.setMeta(mcframe.clientMABC.MABCP1070.DtlR.auto_jnl_key_cd_META);
		p.columnDtl_auto_jnl_key_cd.addLinkBeans(p.columnDtl_auto_jnl_key_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_auto_jnl_key_cd);
		p.columnDtl_auto_jnl_key_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.auto_jnl_key_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_auto_jnl_key_nm);
		p.columnDtl_auto_jnl_grp.setMeta(mcframe.clientMABC.MABCP1070.DtlR.auto_jnl_grp_META);
		p.DtlTable.addColumnConfig(p.columnDtl_auto_jnl_grp);
		p.columnDtl_jnl_ptn_cd.setMeta(mcframe.clientMABC.MABCP1070.DtlR.jnl_ptn_cd_META);
		p.columnDtl_jnl_ptn_cd.addLinkBeans(p.columnDtl_jnl_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_ptn_cd);
		p.columnDtl_jnl_ptn_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.jnl_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_ptn_nm);
		p.columnDtl_prio.setMeta(mcframe.clientMABC.MABCP1070.DtlR.prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prio);
		p.columnDtl_ac_if_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ac_if_typ_META);
		p.columnDtl_ac_if_typ.addLinkBeans(p.columnDtl_ac_if_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_if_typ);
		p.columnDtl_ac_if_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ac_if_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_if_typ_nm);
		p.columnDtl_id_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.id_typ_META);
		p.columnDtl_id_typ.addLinkBeans(p.columnDtl_id_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_id_typ);
		p.columnDtl_id_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_id_typ_nm);
		p.columnDtl_slip_cnt_id.setMeta(mcframe.clientMABC.MABCP1070.DtlR.slip_cnt_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_cnt_id);
		p.columnDtl_std_rnd_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.std_rnd_typ_META);
		p.columnDtl_std_rnd_typ.addLinkBeans(p.columnDtl_std_rnd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_std_rnd_typ);
		p.columnDtl_std_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.std_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_rnd_typ_nm);
		p.columnDtl_cls_jnl_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.cls_jnl_typ_META);
		p.columnDtl_cls_jnl_typ.addLinkBeans(p.columnDtl_cls_jnl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cls_jnl_typ);
		p.columnDtl_cls_jnl_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.cls_jnl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cls_jnl_typ_nm);
		p.columnDtl_compound_jnl_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.compound_jnl_typ_META);
		p.columnDtl_compound_jnl_typ.addLinkBeans(p.columnDtl_compound_jnl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_compound_jnl_typ);
		p.columnDtl_compound_jnl_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.compound_jnl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_compound_jnl_typ_nm);
		p.columnDtl_alloc_jnl_flg.setMeta(mcframe.clientMABC.MABCP1070.DtlR.alloc_jnl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_jnl_flg);
		p.columnDtl_minus_flg.setMeta(mcframe.clientMABC.MABCP1070.DtlR.minus_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_minus_flg);
		p.columnDtl_rev_flg.setMeta(mcframe.clientMABC.MABCP1070.DtlR.rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rev_flg);
		p.columnDtl_minus_rev_flg.setMeta(mcframe.clientMABC.MABCP1070.DtlR.minus_rev_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_minus_rev_flg);
		p.columnDtl_default_flg.setMeta(mcframe.clientMABC.MABCP1070.DtlR.default_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_default_flg);
		p.columnDtl_abs_typ.setMeta(mcframe.clientMABC.MABCP1070.DtlR.abs_typ_META);
		p.columnDtl_abs_typ.addLinkBeans(p.columnDtl_abs_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_abs_typ);
		p.columnDtl_abs_typ_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.abs_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abs_typ_nm);
		p.columnDtl_abstract1.setMeta(mcframe.clientMABC.MABCP1070.DtlR.abstract1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abstract1);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP1070.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP1070.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP1070.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1070.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1070.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1070.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1070.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_auto_jnl_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_auto_jnl_key_cd.getListConfig().setPutter(getCnd_auto_jnl_key_cd_ListPutter());
		Cnd_jnl_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_ptn_cd.getListConfig().setPutter(getCnd_jnl_ptn_cd_ListPutter());
		Cnd_ac_if_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_if_typ.getListConfig().setPutter(getCnd_ac_if_typ_ListPutter());
		columnDtl_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_slip_typ.getListConfig().setPutter(getDtl_ac_slip_typ_ListPutter());
		columnDtl_auto_jnl_key_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_auto_jnl_key_cd.getListConfig().setPutter(getDtl_auto_jnl_key_cd_ListPutter());
		columnDtl_jnl_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_jnl_ptn_cd.getListConfig().setPutter(getDtl_jnl_ptn_cd_ListPutter());
		columnDtl_ac_if_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_if_typ.getListConfig().setPutter(getDtl_ac_if_typ_ListPutter());
		columnDtl_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_id_typ.getListConfig().setPutter(getDtl_id_typ_ListPutter());
		columnDtl_std_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_std_rnd_typ.getListConfig().setPutter(getDtl_std_rnd_typ_ListPutter());
		columnDtl_cls_jnl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cls_jnl_typ.getListConfig().setPutter(getDtl_cls_jnl_typ_ListPutter());
		columnDtl_compound_jnl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_compound_jnl_typ.getListConfig().setPutter(getDtl_compound_jnl_typ_ListPutter());
		columnDtl_abs_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_abs_typ.getListConfig().setPutter(getDtl_abs_typ_ListPutter());
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
	 * [Cnd_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_auto_jnl_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_auto_jnl_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AutoJnlKey");
		return lp;
	}
	 
	/**
	 * [Cnd_jnl_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlPtnBase");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_if_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_if_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcIfTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_auto_jnl_key_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_auto_jnl_key_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AutoJnlKey");
		return lp;
	}
	 
	/**
	 * [Dtl_jnl_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_jnl_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlPtnBase");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_if_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_if_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcIfTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_std_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_std_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_cls_jnl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cls_jnl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ClsJnlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_compound_jnl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_compound_jnl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CompoundJnlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_abs_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_abs_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AbsTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_auto_jnl_key_cd) return getCnd_auto_jnl_key_cd(row, info);
		if(combo == Cnd_jnl_ptn_cd) return getCnd_jnl_ptn_cd(row, info);
		if(combo == Cnd_ac_if_typ) return getCnd_ac_if_typ(row, info);
		if(combo == columnDtl_ac_slip_typ) return getDtl_ac_slip_typ(row, info);
		if(combo == columnDtl_auto_jnl_key_cd) return getDtl_auto_jnl_key_cd(row, info);
		if(combo == columnDtl_jnl_ptn_cd) return getDtl_jnl_ptn_cd(row, info);
		if(combo == columnDtl_ac_if_typ) return getDtl_ac_if_typ(row, info);
		if(combo == columnDtl_id_typ) return getDtl_id_typ(row, info);
		if(combo == columnDtl_std_rnd_typ) return getDtl_std_rnd_typ(row, info);
		if(combo == columnDtl_cls_jnl_typ) return getDtl_cls_jnl_typ(row, info);
		if(combo == columnDtl_compound_jnl_typ) return getDtl_compound_jnl_typ(row, info);
		if(combo == columnDtl_abs_typ) return getDtl_abs_typ(row, info);
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
		else if (ap == Btn_open_MABCP1090) doBtn_open_MABCP1090(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP1090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP1090(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

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
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_auto_jnl_key_cd) return doCnd_auto_jnl_key_cd_VC(info);
		if (vc == Cnd_auto_jnl_key_nm) return doCnd_auto_jnl_key_nm_VC(info);
		if (vc == Cnd_no_auto_jnl_key_flg) return doCnd_no_auto_jnl_key_flg_VC(info);
		if (vc == Cnd_auto_jnl_grp) return doCnd_auto_jnl_grp_VC(info);
		if (vc == Cnd_jnl_ptn_cd) return doCnd_jnl_ptn_cd_VC(info);
		if (vc == Cnd_jnl_ptn_nm) return doCnd_jnl_ptn_nm_VC(info);
		if (vc == Cnd_ac_if_typ) return doCnd_ac_if_typ_VC(info);
		if (vc == Cnd_ac_if_typ_nm) return doCnd_ac_if_typ_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_ac_slip_typ) return doDtl_ac_slip_typ_VC(info);
		if (vc == columnDtl_ac_slip_typ_nm) return doDtl_ac_slip_typ_nm_VC(info);
		if (vc == columnDtl_auto_jnl_key_cd) return doDtl_auto_jnl_key_cd_VC(info);
		if (vc == columnDtl_auto_jnl_key_nm) return doDtl_auto_jnl_key_nm_VC(info);
		if (vc == columnDtl_auto_jnl_grp) return doDtl_auto_jnl_grp_VC(info);
		if (vc == columnDtl_jnl_ptn_cd) return doDtl_jnl_ptn_cd_VC(info);
		if (vc == columnDtl_jnl_ptn_nm) return doDtl_jnl_ptn_nm_VC(info);
		if (vc == columnDtl_prio) return doDtl_prio_VC(info);
		if (vc == columnDtl_ac_if_typ) return doDtl_ac_if_typ_VC(info);
		if (vc == columnDtl_ac_if_typ_nm) return doDtl_ac_if_typ_nm_VC(info);
		if (vc == columnDtl_id_typ) return doDtl_id_typ_VC(info);
		if (vc == columnDtl_id_typ_nm) return doDtl_id_typ_nm_VC(info);
		if (vc == columnDtl_slip_cnt_id) return doDtl_slip_cnt_id_VC(info);
		if (vc == columnDtl_std_rnd_typ) return doDtl_std_rnd_typ_VC(info);
		if (vc == columnDtl_std_rnd_typ_nm) return doDtl_std_rnd_typ_nm_VC(info);
		if (vc == columnDtl_cls_jnl_typ) return doDtl_cls_jnl_typ_VC(info);
		if (vc == columnDtl_cls_jnl_typ_nm) return doDtl_cls_jnl_typ_nm_VC(info);
		if (vc == columnDtl_compound_jnl_typ) return doDtl_compound_jnl_typ_VC(info);
		if (vc == columnDtl_compound_jnl_typ_nm) return doDtl_compound_jnl_typ_nm_VC(info);
		if (vc == columnDtl_alloc_jnl_flg) return doDtl_alloc_jnl_flg_VC(info);
		if (vc == columnDtl_minus_flg) return doDtl_minus_flg_VC(info);
		if (vc == columnDtl_rev_flg) return doDtl_rev_flg_VC(info);
		if (vc == columnDtl_minus_rev_flg) return doDtl_minus_rev_flg_VC(info);
		if (vc == columnDtl_default_flg) return doDtl_default_flg_VC(info);
		if (vc == columnDtl_abs_typ) return doDtl_abs_typ_VC(info);
		if (vc == columnDtl_abs_typ_nm) return doDtl_abs_typ_nm_VC(info);
		if (vc == columnDtl_abstract1) return doDtl_abstract1_VC(info);
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
	 * [Cnd]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_auto_jnl_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_auto_jnl_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_auto_jnl_key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_auto_jnl_key_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[auto_jnl_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_auto_jnl_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_if_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_if_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_auto_jnl_key_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_auto_jnl_key_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[auto_jnl_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_auto_jnl_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_if_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_if_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_if_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_if_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slip_cnt_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_cnt_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cls_jnl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cls_jnl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_compound_jnl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_compound_jnl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_jnl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_jnl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[minus_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_minus_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[minus_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_minus_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[default_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_default_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abs_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abs_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abs_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abs_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abstract1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abstract1_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_auto_jnl_key_cd) doCnd_auto_jnl_key_cd_NC(info);
		else if (nc == Cnd_auto_jnl_key_nm) doCnd_auto_jnl_key_nm_NC(info);
		else if (nc == Cnd_no_auto_jnl_key_flg) doCnd_no_auto_jnl_key_flg_NC(info);
		else if (nc == Cnd_auto_jnl_grp) doCnd_auto_jnl_grp_NC(info);
		else if (nc == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NC(info);
		else if (nc == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NC(info);
		else if (nc == Cnd_ac_if_typ) doCnd_ac_if_typ_NC(info);
		else if (nc == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NC(info);
		else if (nc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NC(info);
		else if (nc == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_NC(info);
		else if (nc == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_NC(info);
		else if (nc == columnDtl_auto_jnl_grp) doDtl_auto_jnl_grp_NC(info);
		else if (nc == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_NC(info);
		else if (nc == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_NC(info);
		else if (nc == columnDtl_prio) doDtl_prio_NC(info);
		else if (nc == columnDtl_ac_if_typ) doDtl_ac_if_typ_NC(info);
		else if (nc == columnDtl_ac_if_typ_nm) doDtl_ac_if_typ_nm_NC(info);
		else if (nc == columnDtl_id_typ) doDtl_id_typ_NC(info);
		else if (nc == columnDtl_id_typ_nm) doDtl_id_typ_nm_NC(info);
		else if (nc == columnDtl_slip_cnt_id) doDtl_slip_cnt_id_NC(info);
		else if (nc == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NC(info);
		else if (nc == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_cls_jnl_typ) doDtl_cls_jnl_typ_NC(info);
		else if (nc == columnDtl_cls_jnl_typ_nm) doDtl_cls_jnl_typ_nm_NC(info);
		else if (nc == columnDtl_compound_jnl_typ) doDtl_compound_jnl_typ_NC(info);
		else if (nc == columnDtl_compound_jnl_typ_nm) doDtl_compound_jnl_typ_nm_NC(info);
		else if (nc == columnDtl_alloc_jnl_flg) doDtl_alloc_jnl_flg_NC(info);
		else if (nc == columnDtl_minus_flg) doDtl_minus_flg_NC(info);
		else if (nc == columnDtl_rev_flg) doDtl_rev_flg_NC(info);
		else if (nc == columnDtl_minus_rev_flg) doDtl_minus_rev_flg_NC(info);
		else if (nc == columnDtl_default_flg) doDtl_default_flg_NC(info);
		else if (nc == columnDtl_abs_typ) doDtl_abs_typ_NC(info);
		else if (nc == columnDtl_abs_typ_nm) doDtl_abs_typ_nm_NC(info);
		else if (nc == columnDtl_abstract1) doDtl_abstract1_NC(info);
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
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_auto_jnl_key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_auto_jnl_key_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_grp_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_grp_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_cnt_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_cnt_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_jnl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_jnl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[default_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_default_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abstract1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abstract1_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_auto_jnl_key_cd) doCnd_auto_jnl_key_cd_NE(info);
		else if (ne == Cnd_auto_jnl_key_nm) doCnd_auto_jnl_key_nm_NE(info);
		else if (ne == Cnd_no_auto_jnl_key_flg) doCnd_no_auto_jnl_key_flg_NE(info);
		else if (ne == Cnd_auto_jnl_grp) doCnd_auto_jnl_grp_NE(info);
		else if (ne == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NE(info);
		else if (ne == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NE(info);
		else if (ne == Cnd_ac_if_typ) doCnd_ac_if_typ_NE(info);
		else if (ne == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NE(info);
		else if (ne == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NE(info);
		else if (ne == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_NE(info);
		else if (ne == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_NE(info);
		else if (ne == columnDtl_auto_jnl_grp) doDtl_auto_jnl_grp_NE(info);
		else if (ne == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_NE(info);
		else if (ne == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_NE(info);
		else if (ne == columnDtl_prio) doDtl_prio_NE(info);
		else if (ne == columnDtl_ac_if_typ) doDtl_ac_if_typ_NE(info);
		else if (ne == columnDtl_ac_if_typ_nm) doDtl_ac_if_typ_nm_NE(info);
		else if (ne == columnDtl_id_typ) doDtl_id_typ_NE(info);
		else if (ne == columnDtl_id_typ_nm) doDtl_id_typ_nm_NE(info);
		else if (ne == columnDtl_slip_cnt_id) doDtl_slip_cnt_id_NE(info);
		else if (ne == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NE(info);
		else if (ne == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_cls_jnl_typ) doDtl_cls_jnl_typ_NE(info);
		else if (ne == columnDtl_cls_jnl_typ_nm) doDtl_cls_jnl_typ_nm_NE(info);
		else if (ne == columnDtl_compound_jnl_typ) doDtl_compound_jnl_typ_NE(info);
		else if (ne == columnDtl_compound_jnl_typ_nm) doDtl_compound_jnl_typ_nm_NE(info);
		else if (ne == columnDtl_alloc_jnl_flg) doDtl_alloc_jnl_flg_NE(info);
		else if (ne == columnDtl_minus_flg) doDtl_minus_flg_NE(info);
		else if (ne == columnDtl_rev_flg) doDtl_rev_flg_NE(info);
		else if (ne == columnDtl_minus_rev_flg) doDtl_minus_rev_flg_NE(info);
		else if (ne == columnDtl_default_flg) doDtl_default_flg_NE(info);
		else if (ne == columnDtl_abs_typ) doDtl_abs_typ_NE(info);
		else if (ne == columnDtl_abs_typ_nm) doDtl_abs_typ_nm_NE(info);
		else if (ne == columnDtl_abstract1) doDtl_abstract1_NE(info);
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
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_auto_jnl_key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_auto_jnl_key_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_grp_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_grp_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_cnt_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_cnt_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_jnl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_jnl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[default_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_default_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abstract1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abstract1_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_auto_jnl_key_cd) doCnd_auto_jnl_key_cd_NX(info);
		else if (nx == Cnd_auto_jnl_key_nm) doCnd_auto_jnl_key_nm_NX(info);
		else if (nx == Cnd_no_auto_jnl_key_flg) doCnd_no_auto_jnl_key_flg_NX(info);
		else if (nx == Cnd_auto_jnl_grp) doCnd_auto_jnl_grp_NX(info);
		else if (nx == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NX(info);
		else if (nx == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NX(info);
		else if (nx == Cnd_ac_if_typ) doCnd_ac_if_typ_NX(info);
		else if (nx == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NX(info);
		else if (nx == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NX(info);
		else if (nx == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_NX(info);
		else if (nx == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_NX(info);
		else if (nx == columnDtl_auto_jnl_grp) doDtl_auto_jnl_grp_NX(info);
		else if (nx == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_NX(info);
		else if (nx == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_NX(info);
		else if (nx == columnDtl_prio) doDtl_prio_NX(info);
		else if (nx == columnDtl_ac_if_typ) doDtl_ac_if_typ_NX(info);
		else if (nx == columnDtl_ac_if_typ_nm) doDtl_ac_if_typ_nm_NX(info);
		else if (nx == columnDtl_id_typ) doDtl_id_typ_NX(info);
		else if (nx == columnDtl_id_typ_nm) doDtl_id_typ_nm_NX(info);
		else if (nx == columnDtl_slip_cnt_id) doDtl_slip_cnt_id_NX(info);
		else if (nx == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NX(info);
		else if (nx == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_cls_jnl_typ) doDtl_cls_jnl_typ_NX(info);
		else if (nx == columnDtl_cls_jnl_typ_nm) doDtl_cls_jnl_typ_nm_NX(info);
		else if (nx == columnDtl_compound_jnl_typ) doDtl_compound_jnl_typ_NX(info);
		else if (nx == columnDtl_compound_jnl_typ_nm) doDtl_compound_jnl_typ_nm_NX(info);
		else if (nx == columnDtl_alloc_jnl_flg) doDtl_alloc_jnl_flg_NX(info);
		else if (nx == columnDtl_minus_flg) doDtl_minus_flg_NX(info);
		else if (nx == columnDtl_rev_flg) doDtl_rev_flg_NX(info);
		else if (nx == columnDtl_minus_rev_flg) doDtl_minus_rev_flg_NX(info);
		else if (nx == columnDtl_default_flg) doDtl_default_flg_NX(info);
		else if (nx == columnDtl_abs_typ) doDtl_abs_typ_NX(info);
		else if (nx == columnDtl_abs_typ_nm) doDtl_abs_typ_nm_NX(info);
		else if (nx == columnDtl_abstract1) doDtl_abstract1_NX(info);
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
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_auto_jnl_key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_auto_jnl_key_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_grp_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_grp_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_cnt_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_cnt_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_jnl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_jnl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[default_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_default_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abstract1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abstract1_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_auto_jnl_key_cd) doCnd_auto_jnl_key_cd_LC(info);
		else if (lc == Cnd_auto_jnl_key_nm) doCnd_auto_jnl_key_nm_LC(info);
		else if (lc == Cnd_auto_jnl_grp) doCnd_auto_jnl_grp_LC(info);
		else if (lc == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_LC(info);
		else if (lc == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_LC(info);
		else if (lc == Cnd_ac_if_typ) doCnd_ac_if_typ_LC(info);
		else if (lc == Cnd_ac_if_typ_nm) doCnd_ac_if_typ_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_LC(info);
		else if (lc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_LC(info);
		else if (lc == columnDtl_auto_jnl_key_cd) doDtl_auto_jnl_key_cd_LC(info);
		else if (lc == columnDtl_auto_jnl_key_nm) doDtl_auto_jnl_key_nm_LC(info);
		else if (lc == columnDtl_auto_jnl_grp) doDtl_auto_jnl_grp_LC(info);
		else if (lc == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_LC(info);
		else if (lc == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_LC(info);
		else if (lc == columnDtl_prio) doDtl_prio_LC(info);
		else if (lc == columnDtl_ac_if_typ) doDtl_ac_if_typ_LC(info);
		else if (lc == columnDtl_ac_if_typ_nm) doDtl_ac_if_typ_nm_LC(info);
		else if (lc == columnDtl_id_typ) doDtl_id_typ_LC(info);
		else if (lc == columnDtl_id_typ_nm) doDtl_id_typ_nm_LC(info);
		else if (lc == columnDtl_slip_cnt_id) doDtl_slip_cnt_id_LC(info);
		else if (lc == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_LC(info);
		else if (lc == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_cls_jnl_typ) doDtl_cls_jnl_typ_LC(info);
		else if (lc == columnDtl_cls_jnl_typ_nm) doDtl_cls_jnl_typ_nm_LC(info);
		else if (lc == columnDtl_compound_jnl_typ) doDtl_compound_jnl_typ_LC(info);
		else if (lc == columnDtl_compound_jnl_typ_nm) doDtl_compound_jnl_typ_nm_LC(info);
		else if (lc == columnDtl_abs_typ) doDtl_abs_typ_LC(info);
		else if (lc == columnDtl_abs_typ_nm) doDtl_abs_typ_nm_LC(info);
		else if (lc == columnDtl_abstract1) doDtl_abstract1_LC(info);
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
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[auto_jnl_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_auto_jnl_grp_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_if_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_if_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_key_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_key_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[auto_jnl_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_auto_jnl_grp_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_if_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_if_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_cnt_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_cnt_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cls_jnl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cls_jnl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[compound_jnl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_compound_jnl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abs_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abs_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abstract1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abstract1_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_ac_slip_typ]の作成メソッド
	 */
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_auto_jnl_key_cd]の作成メソッド
	 */
	public MCList getCnd_auto_jnl_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAutoJnlKey(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_jnl_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_jnl_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlPtnBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_if_typ]の作成メソッド
	 */
	public MCList getCnd_ac_if_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcIfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_slip_typ]の作成メソッド
	 */
	public MCList getDtl_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_auto_jnl_key_cd]の作成メソッド
	 */
	public MCList getDtl_auto_jnl_key_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAutoJnlKey(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_jnl_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_jnl_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlPtnBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_if_typ]の作成メソッド
	 */
	public MCList getDtl_ac_if_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcIfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_id_typ]の作成メソッド
	 */
	public MCList getDtl_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_std_rnd_typ]の作成メソッド
	 */
	public MCList getDtl_std_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cls_jnl_typ]の作成メソッド
	 */
	public MCList getDtl_cls_jnl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getClsJnlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_compound_jnl_typ]の作成メソッド
	 */
	public MCList getDtl_compound_jnl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCompoundJnlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_abs_typ]の作成メソッド
	 */
	public MCList getDtl_abs_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAbsTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL1070.Srch01")) {
			return new MA_MABCL1070_Srch01Bridge();
		}
		if (id.equals("MA.MABCL1070.Upd01")) {
			return new MA_MABCL1070_Upd01Bridge();
		}
		if (id.equals("MA.MABCL1070.Del01")) {
			return new MA_MABCL1070_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL1070_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1070_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1070_Srch01;

		/** コンストラクタ */
		protected MA_MABCL1070_Srch01Bridge() {
			p_MA_MABCL1070_Srch01 = new MCParam(PDef.MA_MABCL1070_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1070_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP1070.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1070.DtlR.class));

			p_MA_MABCL1070_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1070_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1070_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1070_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1070_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP1070.CndR up0() {
			return (mcframe.clientMABC.MABCP1070.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP1070.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP1070.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL1070_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1070.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL1070_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP1070.DtlR>)p_MA_MABCL1070_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL1070_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1070_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1070_Upd01;

		/** コンストラクタ */
		protected MA_MABCL1070_Upd01Bridge() {
			p_MA_MABCL1070_Upd01 = new MCParam(PDef.MA_MABCL1070_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1070_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1070.DtlR.class));
			// Down

			p_MA_MABCL1070_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1070_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1070_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1070_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1070_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1070.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1070.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1070_Upd01;
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
	/**
	 * [MA_MABCL1070_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1070_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1070_Del01;

		/** コンストラクタ */
		protected MA_MABCL1070_Del01Bridge() {
			p_MA_MABCL1070_Del01 = new MCParam(PDef.MA_MABCL1070_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1070_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1070.DtlR.class));
			// Down

			p_MA_MABCL1070_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1070_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1070_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1070_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1070_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1070.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1070.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1070_Del01;
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