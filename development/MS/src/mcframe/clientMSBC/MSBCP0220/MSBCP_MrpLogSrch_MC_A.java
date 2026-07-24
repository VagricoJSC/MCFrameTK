package mcframe.clientMSBC.MSBCP0220;

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
import mcframe.clientMSBC.MSBCP0220.MSBCP_MrpLogSrch_MC.MS_MSBCL0220_Srch01Caller;
import mcframe.clientMSBC.MSBCP0220.MSBCP_MrpLogSrch_MC.MS_MSBCL0220_Del01Caller;

/**
 * 画面"MSBCP_MrpLogSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_MrpLogSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP0220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
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
	public MCLabel Cnd_mrp_typ_Label = null;
	/**
	 * MRP type ＭＲＰ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mrp_typ = null;
	/**
	 * MRP type name ＭＲＰ区分名.<p>
	 *
	 */
	public MCTextField Cnd_mrp_typ_nm = null;
	public MCLabel Cnd_mrp_calc_no_Label = null;
	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mrp_calc_no = null;
	public MCLabel Cnd_log_time_fr_Label = null;
	/**
	 * Log time FROM ログ時間ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_log_time_fr = null;
	public MCLabel Cnd_log_time_to_Label = null;
	/**
	 * Log time TO ログ時間ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_log_time_to = null;
	public MCLabel Cnd_gp_batch_grp_cd_Label = null;
	/**
	 * Process group cd. 処理グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gp_batch_grp_cd = null;
	/**
	 * Process group name 処理グループ名.<p>
	 *
	 */
	public MCTextField Cnd_gp_batch_grp_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_msg_id_Label = null;
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public MCTextField Cnd_msg_id = null;
	public MCLabel Cnd_req_no_Label = null;
	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_req_no = null;
	public MCLabel Cnd_msg1_Label = null;
	/**
	 * Search string 1 検索文字列１.<p>
	 *
	 */
	public MCTextField Cnd_msg1 = null;
	public MCLabel Cnd_msg2_Label = null;
	/**
	 * Search string 2 検索文字列２.<p>
	 *
	 */
	public MCTextField Cnd_msg2 = null;
	public MCLabel Cnd_msg3_Label = null;
	/**
	 * Search string 3 検索文字列３.<p>
	 *
	 */
	public MCTextField Cnd_msg3 = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0220.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Message ID メッセージＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_msg_id = null;
	/**
	 * Message メッセージ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_msg = null;
	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrp_calc_no = null;
	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public MCColumnConfig columnRslt_seq_no = null;
	/**
	 * Log time ログ時間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_log_time = null;
	/**
	 * Process group cd. 処理グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gp_batch_grp_cd = null;
	/**
	 * Process group name 処理グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gp_batch_grp_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Msg]ブロック関連のField定義
	public MCPanel MsgPanel = null;
	// [Msg]ブロックの項目のField定義
	public MCScrollPane Msg_msgScrollPane = null;
	/**
	 * Message メッセージ.<p>
	 *
	 */
	public MCTextArea Msg_msg = null;
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, DEL, FIX_D};
	
	/** [MS_MSBCL0220_Srch01]のCallerの作成 */
	protected MSBCP_MrpLogSrch_MC.MS_MSBCL0220_Srch01Caller createMS_MSBCL0220_Srch01() {
		MSBCP_MrpLogSrch_MC.MS_MSBCL0220_Srch01Caller<MSBCP_MrpLogSrch, MS_MSBCL0220_Srch01Bridge>
		caller = ((MSBCP_MrpLogSrch_MC)this).new MS_MSBCL0220_Srch01Caller<MSBCP_MrpLogSrch, MS_MSBCL0220_Srch01Bridge>(
					(MSBCP_MrpLogSrch)this, new MS_MSBCL0220_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0220_Srch01]の呼び出し */
	protected void callMS_MSBCL0220_Srch01() {
		MCCaller caller = createMS_MSBCL0220_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0220_Del01]のCallerの作成 */
	protected MSBCP_MrpLogSrch_MC.MS_MSBCL0220_Del01Caller createMS_MSBCL0220_Del01() {
		MSBCP_MrpLogSrch_MC.MS_MSBCL0220_Del01Caller<MSBCP_MrpLogSrch, MS_MSBCL0220_Del01Bridge>
		caller = ((MSBCP_MrpLogSrch_MC)this).new MS_MSBCL0220_Del01Caller<MSBCP_MrpLogSrch, MS_MSBCL0220_Del01Bridge>(
					(MSBCP_MrpLogSrch)this, new MS_MSBCL0220_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL0220_Del01]の呼び出し */
	protected void callMS_MSBCL0220_Del01() {
		MCCaller caller = createMS_MSBCL0220_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0220.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0220.RsltR> aRsltL;
	/** [Msg]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0220.MsgR aMsgR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0220.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0220.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0220.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0220.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0220.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0220.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0220.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0220.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0220.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0220.RsltR.class);
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
	 * 項目コピーによってaMsgRを設定します。
	 *
	 * aMsgRのインスタンスは変更されません。
	 *
	 * @param row MsgR
	 */
	public void setMsgR(mcframe.clientMSBC.MSBCP0220.MsgR row) {
		if (row != null) {
			MCRow.copyall(getMsgR(), row);
		}
	}

	/**
	 * [Msg]ブロックのコンテナaMsgRを返します。
	 *
	 * @return MsgR
	 */
	public mcframe.clientMSBC.MSBCP0220.MsgR getMsgR() {
		return aMsgR;
	}

	/**
	 * aMsgRを作成します。
	 *
	 * @return MsgR
	 */
	public mcframe.clientMSBC.MSBCP0220.MsgR createMsgR() {
		return mcframe.clientMSBC.MSBCP0220.MsgR.create();
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
		if(!MCCollectionUtil.contains(ret, getMsgR())) ret.add(getMsgR());
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
		if(aCnt == getMsgR()) return "Msg";
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
		if(bId.equals("Msg")) return getMsgR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(MsgPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MrpLogSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aMsgR = createMsgR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_MrpLogSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aMsgR = createMsgR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_MrpLogSrch_MC.jbCreateTop((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateFold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateCnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateCtrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateRPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateRslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateMsg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateBtn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbCreateEastBtn((MSBCP_MrpLogSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_MrpLogSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [Msg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMsg(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_MrpLogSrch p) {
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

	
	/** [Cnd_mrp_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mrp_typ_p = null;

	/**
	 * [Cnd_mrp_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mrp_typ_ListPutter() {
		if (Cnd_mrp_typ_p == null) {
			Cnd_mrp_typ_p = createCnd_mrp_typ_ListPutter(Cnd_mrp_typ, "mrp_typ", "mrp_typ_nm");

		}
		return Cnd_mrp_typ_p;
	}
	
	
	/** [Cnd_gp_batch_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gp_batch_grp_cd_p = null;

	/**
	 * [Cnd_gp_batch_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gp_batch_grp_cd_ListPutter() {
		if (Cnd_gp_batch_grp_cd_p == null) {
			Cnd_gp_batch_grp_cd_p = createCnd_gp_batch_grp_cd_ListPutter(Cnd_gp_batch_grp_cd, "gp_batch_grp_cd", "gp_batch_grp_nm");

		}
		return Cnd_gp_batch_grp_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MrpLogSrch create(){
		MSBCP_MrpLogSrch p = new MSBCP_MrpLogSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MrpLogSrch create(String name){
		MSBCP_MrpLogSrch p = new MSBCP_MrpLogSrch(name);
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
		MSBCP_MrpLogSrch_MC.jbfInitTop((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitFold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitCnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitCtrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitRPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitRslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitMsg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitBtn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbfInitEastBtn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitTop((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitFold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitCnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitCtrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitRPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitRslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitMsg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitBtn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.jbInitEastBtn((MSBCP_MrpLogSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_mrp_typ_Label = p.beansFactory.createLabel("Cnd.mrp_typ_Label");
		p.Cnd_mrp_typ = p.beansFactory.createTextComboBox("Cnd.mrp_typ");
		p.Cnd_mrp_typ.setLabel(p.Cnd_mrp_typ_Label);
		p.Cnd_mrp_typ_nm = p.beansFactory.createTextField("Cnd.mrp_typ_nm");
		p.Cnd_mrp_calc_no_Label = p.beansFactory.createLabel("Cnd.mrp_calc_no_Label");
		p.Cnd_mrp_calc_no = p.beansFactory.createTextField("Cnd.mrp_calc_no");
		p.Cnd_mrp_calc_no.setLabel(p.Cnd_mrp_calc_no_Label);
		p.Cnd_log_time_fr_Label = p.beansFactory.createLabel("Cnd.log_time_fr_Label");
		p.Cnd_log_time_fr = p.beansFactory.createDateField("Cnd.log_time_fr");
		p.Cnd_log_time_fr.setLabel(p.Cnd_log_time_fr_Label);
		p.Cnd_log_time_to_Label = p.beansFactory.createLabel("Cnd.log_time_to_Label");
		p.Cnd_log_time_to = p.beansFactory.createDateField("Cnd.log_time_to");
		p.Cnd_log_time_to.setLabel(p.Cnd_log_time_to_Label);
		p.Cnd_gp_batch_grp_cd_Label = p.beansFactory.createLabel("Cnd.gp_batch_grp_cd_Label");
		p.Cnd_gp_batch_grp_cd = p.beansFactory.createTextComboBox("Cnd.gp_batch_grp_cd");
		p.Cnd_gp_batch_grp_cd.setLabel(p.Cnd_gp_batch_grp_cd_Label);
		p.Cnd_gp_batch_grp_nm = p.beansFactory.createTextField("Cnd.gp_batch_grp_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_msg_id_Label = p.beansFactory.createLabel("Cnd.msg_id_Label");
		p.Cnd_msg_id = p.beansFactory.createTextField("Cnd.msg_id");
		p.Cnd_msg_id.setLabel(p.Cnd_msg_id_Label);
		p.Cnd_req_no_Label = p.beansFactory.createLabel("Cnd.req_no_Label");
		p.Cnd_req_no = p.beansFactory.createTextField("Cnd.req_no");
		p.Cnd_req_no.setLabel(p.Cnd_req_no_Label);
		p.Cnd_msg1_Label = p.beansFactory.createLabel("Cnd.msg1_Label");
		p.Cnd_msg1 = p.beansFactory.createTextField("Cnd.msg1");
		p.Cnd_msg1.setLabel(p.Cnd_msg1_Label);
		p.Cnd_msg2_Label = p.beansFactory.createLabel("Cnd.msg2_Label");
		p.Cnd_msg2 = p.beansFactory.createTextField("Cnd.msg2");
		p.Cnd_msg2.setLabel(p.Cnd_msg2_Label);
		p.Cnd_msg3_Label = p.beansFactory.createLabel("Cnd.msg3_Label");
		p.Cnd_msg3 = p.beansFactory.createTextField("Cnd.msg3");
		p.Cnd_msg3.setLabel(p.Cnd_msg3_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_msg_id = p.beansFactory.createTableColumn("Rslt.msg_id", MCColumnType.TEXT);
		p.columnRslt_msg = p.beansFactory.createTableColumn("Rslt.msg", MCColumnType.TEXT);
		p.columnRslt_mrp_calc_no = p.beansFactory.createTableColumn("Rslt.mrp_calc_no", MCColumnType.TEXT);
		p.columnRslt_seq_no = p.beansFactory.createTableColumn("Rslt.seq_no", MCColumnType.NUMBER);
		p.columnRslt_log_time = p.beansFactory.createTableColumn("Rslt.log_time", MCColumnType.DATE);
		p.columnRslt_gp_batch_grp_cd = p.beansFactory.createTableColumn("Rslt.gp_batch_grp_cd", MCColumnType.TEXT);
		p.columnRslt_gp_batch_grp_nm = p.beansFactory.createTableColumn("Rslt.gp_batch_grp_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Msg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMsg(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.MsgPanel = p.beansFactory.createPanel("Msg");
		// ブロックの項目の初期化
		p.Msg_msgScrollPane = p.beansFactory.createScrollPane("Msg.msgscroll");
		p.Msg_msg = p.beansFactory.createTextArea("Msg.msg");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
	protected static void jbInitFold(MSBCP_MrpLogSrch p) {
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
	protected static void jbInitCnd(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.Cnd_mrp_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mrp_typ, true);
		p.Cnd_mrp_typ.setLinkBeans(p.Cnd_mrp_typ_nm);
		p.CndPanel.add(p.Cnd_mrp_typ_Label);
		p.CndPanel.add(p.Cnd_mrp_typ);
		p.CndPanel.setLastBeans(p.Cnd_mrp_typ);
		p.Cnd_mrp_typ.setNextBeans(p.Cnd_mrp_typ_nm);
		p.Cnd_mrp_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.mrp_typ_META);
		p.CndPanel.add(p.Cnd_mrp_typ_nm);
		p.Cnd_mrp_typ_nm.setNextBeans(p.Cnd_mrp_calc_no);
		p.Cnd_mrp_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.mrp_typ_nm_META);
		p.CndPanel.add(p.Cnd_mrp_calc_no_Label);
		p.CndPanel.add(p.Cnd_mrp_calc_no);
		p.Cnd_mrp_calc_no.setNextBeans(p.Cnd_log_time_fr);
		p.Cnd_mrp_calc_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.mrp_calc_no_META);
		p.setPluralValueEnable(p.Cnd_mrp_calc_no, true);
		p.CndPanel.add(p.Cnd_log_time_fr_Label);
		p.CndPanel.add(p.Cnd_log_time_fr);
		p.Cnd_log_time_fr.setNextBeans(p.Cnd_log_time_to);
		p.Cnd_log_time_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.log_time_fr_META);
		p.Cnd_log_time_fr.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.CndPanel.add(p.Cnd_log_time_to_Label);
		p.CndPanel.add(p.Cnd_log_time_to);
		p.Cnd_log_time_to.setNextBeans(p.Cnd_gp_batch_grp_cd);
		p.Cnd_log_time_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.log_time_to_META);
		p.Cnd_log_time_to.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.Cnd_gp_batch_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gp_batch_grp_cd, true);
		p.Cnd_gp_batch_grp_cd.setLinkBeans(p.Cnd_gp_batch_grp_nm);
		p.CndPanel.add(p.Cnd_gp_batch_grp_cd_Label);
		p.CndPanel.add(p.Cnd_gp_batch_grp_cd);
		p.Cnd_gp_batch_grp_cd.setNextBeans(p.Cnd_gp_batch_grp_nm);
		p.Cnd_gp_batch_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.gp_batch_grp_cd_META);
		p.CndPanel.add(p.Cnd_gp_batch_grp_nm);
		p.Cnd_gp_batch_grp_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_gp_batch_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.gp_batch_grp_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_msg_id);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_msg_id_Label);
		p.CndPanel.add(p.Cnd_msg_id);
		p.Cnd_msg_id.setNextBeans(p.Cnd_req_no);
		p.Cnd_msg_id.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.msg_id_META);
		p.setPluralValueEnable(p.Cnd_msg_id, true);
		p.CndPanel.add(p.Cnd_req_no_Label);
		p.CndPanel.add(p.Cnd_req_no);
		p.Cnd_req_no.setNextBeans(p.Cnd_msg1);
		p.Cnd_req_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.req_no_META);
		p.CndPanel.add(p.Cnd_msg1_Label);
		p.CndPanel.add(p.Cnd_msg1);
		p.Cnd_msg1.setNextBeans(p.Cnd_msg2);
		p.Cnd_msg1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.msg1_META);
		p.CndPanel.add(p.Cnd_msg2_Label);
		p.CndPanel.add(p.Cnd_msg2);
		p.Cnd_msg2.setNextBeans(p.Cnd_msg3);
		p.Cnd_msg2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.msg2_META);
		p.CndPanel.add(p.Cnd_msg3_Label);
		p.CndPanel.add(p.Cnd_msg3);
		p.Cnd_msg3.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_msg3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.msg3_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0220.CndR.sub_char3_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.MsgPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Msg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMsg(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.add(p.MsgPanel);
		p.MsgPanel.setNextBeans(p.BtnPanel);
		p.MsgPanel.setValueCheck(false);
		p.MsgPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Msg_msgScrollPane.getViewport().add(p.Msg_msg);
		p.MsgPanel.add(p.Msg_msgScrollPane);
		p.MsgPanel.setLastBeans(p.Msg_msg);
		p.Msg_msg.setRow(p.getMsgR(), mcframe.clientMSBC.MSBCP0220.MsgR.msg_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_MrpLogSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
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
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBCP_MrpLogSrch p) {
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
		MSBCP_MrpLogSrch_MC.mcInitTop((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitFold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitCnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitCtrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitRPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitRslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitMsg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitBtn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.mcInitEastBtn((MSBCP_MrpLogSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Top((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Fold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Cnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Ctrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_RPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Rslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Msg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_Btn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitSRCH_EastBtn((MSBCP_MrpLogSrch)this);

		// [DEL]ステータスのモードの設定
		MSBCP_MrpLogSrch_MC.statusInitDEL_Top((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_Fold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_Cnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_Ctrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_RPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_Rslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_Msg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_Btn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitDEL_EastBtn((MSBCP_MrpLogSrch)this);

		// [FIX_D]ステータスのモードの設定
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Top((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Fold((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Cnd((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Ctrl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_RPnl((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Rslt((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Msg((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_Btn((MSBCP_MrpLogSrch)this);
		MSBCP_MrpLogSrch_MC.statusInitFIX__D_EastBtn((MSBCP_MrpLogSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_MrpLogSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_MrpLogSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_MrpLogSrch p) {
		p.Cnd_mrp_typ.setListListener(p);
		p.Cnd_mrp_typ.addAllListener(p);
		p.Cnd_mrp_typ_nm.setListListener(p);
		p.Cnd_mrp_typ_nm.addAllListener(p);
		p.Cnd_mrp_calc_no.setListListener(p);
		p.Cnd_mrp_calc_no.addAllListener(p);
		p.Cnd_log_time_fr.setListListener(p);
		p.Cnd_log_time_fr.addAllListener(p);
		p.Cnd_log_time_to.setListListener(p);
		p.Cnd_log_time_to.addAllListener(p);
		p.Cnd_gp_batch_grp_cd.setListListener(p);
		p.Cnd_gp_batch_grp_cd.addAllListener(p);
		p.Cnd_gp_batch_grp_nm.setListListener(p);
		p.Cnd_gp_batch_grp_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_msg_id.setListListener(p);
		p.Cnd_msg_id.addAllListener(p);
		p.Cnd_req_no.setListListener(p);
		p.Cnd_req_no.addAllListener(p);
		p.Cnd_msg1.setListListener(p);
		p.Cnd_msg1.addAllListener(p);
		p.Cnd_msg2.setListListener(p);
		p.Cnd_msg2.addAllListener(p);
		p.Cnd_msg3.setListListener(p);
		p.Cnd_msg3.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_MrpLogSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_MrpLogSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_MrpLogSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_msg_id.addAllListener(p);
		p.columnRslt_msg_id.setListListener(p);
		p.columnRslt_msg.addAllListener(p);
		p.columnRslt_msg.setListListener(p);
		p.columnRslt_mrp_calc_no.addAllListener(p);
		p.columnRslt_mrp_calc_no.setListListener(p);
		p.columnRslt_seq_no.addAllListener(p);
		p.columnRslt_seq_no.setListListener(p);
		p.columnRslt_log_time.addAllListener(p);
		p.columnRslt_log_time.setListListener(p);
		p.columnRslt_gp_batch_grp_cd.addAllListener(p);
		p.columnRslt_gp_batch_grp_cd.setListListener(p);
		p.columnRslt_gp_batch_grp_nm.addAllListener(p);
		p.columnRslt_gp_batch_grp_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Msg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMsg(MSBCP_MrpLogSrch p) {
		p.Msg_msg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_MrpLogSrch p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_MrpLogSrch p) {
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_MrpLogSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_MrpLogSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_MrpLogSrch p){
		p.Cnd_mrp_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mrp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_mrp_calc_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_log_time_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_log_time_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gp_batch_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_gp_batch_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_msg_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_req_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_msg1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_msg2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_msg3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_MrpLogSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBCP_MrpLogSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBCP_MrpLogSrch p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_msg_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_msg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrp_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_seq_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_log_time.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gp_batch_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gp_batch_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Msg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Msg(MSBCP_MrpLogSrch p){
		p.Msg_msg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_MrpLogSrch p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBCP_MrpLogSrch p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBCP_MrpLogSrch p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBCP_MrpLogSrch p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBCP_MrpLogSrch p){
		p.Cnd_mrp_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mrp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_mrp_calc_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_log_time_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_log_time_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gp_batch_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gp_batch_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_msg_id.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_req_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_msg1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_msg2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_msg3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBCP_MrpLogSrch p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBCP_MrpLogSrch p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBCP_MrpLogSrch p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_msg_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_msg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrp_calc_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_seq_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_log_time.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gp_batch_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gp_batch_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Msg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Msg(MSBCP_MrpLogSrch p){
		p.Msg_msg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBCP_MrpLogSrch p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBCP_MrpLogSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Top(MSBCP_MrpLogSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Fold(MSBCP_MrpLogSrch p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBCP_MrpLogSrch p){
		p.Cnd_mrp_typ.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_mrp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_mrp_calc_no.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_log_time_fr.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_log_time_to.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_gp_batch_grp_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_gp_batch_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_msg_id.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_req_no.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_msg1.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_msg2.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_msg3.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Ctrl(MSBCP_MrpLogSrch p){

	}

	/**
	 * [FIX_D]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_RPnl(MSBCP_MrpLogSrch p){
		p.RPnl_dwnld.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Rslt(MSBCP_MrpLogSrch p){
		p.columnRslt_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_msg_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_msg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_mrp_calc_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_seq_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_log_time.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_gp_batch_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_gp_batch_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Msg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Msg(MSBCP_MrpLogSrch p){
		p.Msg_msg.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBCP_MrpLogSrch p){
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBCP_MrpLogSrch p){

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
		MSBCP_MrpLogSrch_MC.setTableConfigRslt((MSBCP_MrpLogSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_MrpLogSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_msg_id.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.msg_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_msg_id);
		p.columnRslt_msg.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.msg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_msg);
		p.columnRslt_mrp_calc_no.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.mrp_calc_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrp_calc_no);
		p.columnRslt_seq_no.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.seq_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_seq_no);
		p.columnRslt_log_time.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.log_time_META);
		p.columnRslt_log_time.setFormatID(mcframe.commonMA.meta.MA_META.YMDHMS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_log_time);
		p.columnRslt_gp_batch_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.gp_batch_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gp_batch_grp_cd);
		p.columnRslt_gp_batch_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.gp_batch_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gp_batch_grp_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0220.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_mrp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mrp_typ.getListConfig().setPutter(getCnd_mrp_typ_ListPutter());
		Cnd_gp_batch_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gp_batch_grp_cd.getListConfig().setPutter(getCnd_gp_batch_grp_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Cnd_mrp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mrp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MrpTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_gp_batch_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gp_batch_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("FS.FSUAP0010.GpBatchGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_mrp_typ) return getCnd_mrp_typ(row, info);
		if(combo == Cnd_gp_batch_grp_cd) return getCnd_gp_batch_grp_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
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
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_mrp_typ) return doCnd_mrp_typ_VC(info);
		if (vc == Cnd_mrp_typ_nm) return doCnd_mrp_typ_nm_VC(info);
		if (vc == Cnd_mrp_calc_no) return doCnd_mrp_calc_no_VC(info);
		if (vc == Cnd_log_time_fr) return doCnd_log_time_fr_VC(info);
		if (vc == Cnd_log_time_to) return doCnd_log_time_to_VC(info);
		if (vc == Cnd_gp_batch_grp_cd) return doCnd_gp_batch_grp_cd_VC(info);
		if (vc == Cnd_gp_batch_grp_nm) return doCnd_gp_batch_grp_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_msg_id) return doCnd_msg_id_VC(info);
		if (vc == Cnd_req_no) return doCnd_req_no_VC(info);
		if (vc == Cnd_msg1) return doCnd_msg1_VC(info);
		if (vc == Cnd_msg2) return doCnd_msg2_VC(info);
		if (vc == Cnd_msg3) return doCnd_msg3_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_msg_id) return doRslt_msg_id_VC(info);
		if (vc == columnRslt_msg) return doRslt_msg_VC(info);
		if (vc == columnRslt_mrp_calc_no) return doRslt_mrp_calc_no_VC(info);
		if (vc == columnRslt_seq_no) return doRslt_seq_no_VC(info);
		if (vc == columnRslt_log_time) return doRslt_log_time_VC(info);
		if (vc == columnRslt_gp_batch_grp_cd) return doRslt_gp_batch_grp_cd_VC(info);
		if (vc == columnRslt_gp_batch_grp_nm) return doRslt_gp_batch_grp_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == Msg_msg) return doMsg_msg_VC(info);
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
	 * [Cnd]パネルの[mrp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrp_calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrp_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[log_time_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_log_time_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[log_time_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_log_time_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gp_batch_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gp_batch_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[msg_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_msg_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[msg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_msg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[msg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_msg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[msg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_msg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[msg_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_msg_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[msg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_msg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrp_calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrp_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[seq_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_seq_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[log_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_log_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gp_batch_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gp_batch_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
	 * [Msg]パネルの[msg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMsg_msg_VC(MCEventInfo info){
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
		else if (nc == Cnd_mrp_typ) doCnd_mrp_typ_NC(info);
		else if (nc == Cnd_mrp_typ_nm) doCnd_mrp_typ_nm_NC(info);
		else if (nc == Cnd_mrp_calc_no) doCnd_mrp_calc_no_NC(info);
		else if (nc == Cnd_log_time_fr) doCnd_log_time_fr_NC(info);
		else if (nc == Cnd_log_time_to) doCnd_log_time_to_NC(info);
		else if (nc == Cnd_gp_batch_grp_cd) doCnd_gp_batch_grp_cd_NC(info);
		else if (nc == Cnd_gp_batch_grp_nm) doCnd_gp_batch_grp_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_msg_id) doCnd_msg_id_NC(info);
		else if (nc == Cnd_req_no) doCnd_req_no_NC(info);
		else if (nc == Cnd_msg1) doCnd_msg1_NC(info);
		else if (nc == Cnd_msg2) doCnd_msg2_NC(info);
		else if (nc == Cnd_msg3) doCnd_msg3_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_msg_id) doRslt_msg_id_NC(info);
		else if (nc == columnRslt_msg) doRslt_msg_NC(info);
		else if (nc == columnRslt_mrp_calc_no) doRslt_mrp_calc_no_NC(info);
		else if (nc == columnRslt_seq_no) doRslt_seq_no_NC(info);
		else if (nc == columnRslt_log_time) doRslt_log_time_NC(info);
		else if (nc == columnRslt_gp_batch_grp_cd) doRslt_gp_batch_grp_cd_NC(info);
		else if (nc == columnRslt_gp_batch_grp_nm) doRslt_gp_batch_grp_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == Msg_msg) doMsg_msg_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[seq_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_seq_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[log_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_log_time_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_NC(MCEventInfo info){
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
		else if (ne == Cnd_mrp_typ) doCnd_mrp_typ_NE(info);
		else if (ne == Cnd_mrp_typ_nm) doCnd_mrp_typ_nm_NE(info);
		else if (ne == Cnd_mrp_calc_no) doCnd_mrp_calc_no_NE(info);
		else if (ne == Cnd_log_time_fr) doCnd_log_time_fr_NE(info);
		else if (ne == Cnd_log_time_to) doCnd_log_time_to_NE(info);
		else if (ne == Cnd_gp_batch_grp_cd) doCnd_gp_batch_grp_cd_NE(info);
		else if (ne == Cnd_gp_batch_grp_nm) doCnd_gp_batch_grp_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_msg_id) doCnd_msg_id_NE(info);
		else if (ne == Cnd_req_no) doCnd_req_no_NE(info);
		else if (ne == Cnd_msg1) doCnd_msg1_NE(info);
		else if (ne == Cnd_msg2) doCnd_msg2_NE(info);
		else if (ne == Cnd_msg3) doCnd_msg3_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_msg_id) doRslt_msg_id_NE(info);
		else if (ne == columnRslt_msg) doRslt_msg_NE(info);
		else if (ne == columnRslt_mrp_calc_no) doRslt_mrp_calc_no_NE(info);
		else if (ne == columnRslt_seq_no) doRslt_seq_no_NE(info);
		else if (ne == columnRslt_log_time) doRslt_log_time_NE(info);
		else if (ne == columnRslt_gp_batch_grp_cd) doRslt_gp_batch_grp_cd_NE(info);
		else if (ne == columnRslt_gp_batch_grp_nm) doRslt_gp_batch_grp_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == Msg_msg) doMsg_msg_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[seq_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_seq_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[log_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_log_time_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_NE(MCEventInfo info){
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
		else if (nx == Cnd_mrp_typ) doCnd_mrp_typ_NX(info);
		else if (nx == Cnd_mrp_typ_nm) doCnd_mrp_typ_nm_NX(info);
		else if (nx == Cnd_mrp_calc_no) doCnd_mrp_calc_no_NX(info);
		else if (nx == Cnd_log_time_fr) doCnd_log_time_fr_NX(info);
		else if (nx == Cnd_log_time_to) doCnd_log_time_to_NX(info);
		else if (nx == Cnd_gp_batch_grp_cd) doCnd_gp_batch_grp_cd_NX(info);
		else if (nx == Cnd_gp_batch_grp_nm) doCnd_gp_batch_grp_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_msg_id) doCnd_msg_id_NX(info);
		else if (nx == Cnd_req_no) doCnd_req_no_NX(info);
		else if (nx == Cnd_msg1) doCnd_msg1_NX(info);
		else if (nx == Cnd_msg2) doCnd_msg2_NX(info);
		else if (nx == Cnd_msg3) doCnd_msg3_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_msg_id) doRslt_msg_id_NX(info);
		else if (nx == columnRslt_msg) doRslt_msg_NX(info);
		else if (nx == columnRslt_mrp_calc_no) doRslt_mrp_calc_no_NX(info);
		else if (nx == columnRslt_seq_no) doRslt_seq_no_NX(info);
		else if (nx == columnRslt_log_time) doRslt_log_time_NX(info);
		else if (nx == columnRslt_gp_batch_grp_cd) doRslt_gp_batch_grp_cd_NX(info);
		else if (nx == columnRslt_gp_batch_grp_nm) doRslt_gp_batch_grp_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == Msg_msg) doMsg_msg_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[seq_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_seq_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[log_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_log_time_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Msg]パネルの[msg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMsg_msg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_mrp_typ) doCnd_mrp_typ_LC(info);
		else if (lc == Cnd_mrp_typ_nm) doCnd_mrp_typ_nm_LC(info);
		else if (lc == Cnd_mrp_calc_no) doCnd_mrp_calc_no_LC(info);
		else if (lc == Cnd_log_time_fr) doCnd_log_time_fr_LC(info);
		else if (lc == Cnd_log_time_to) doCnd_log_time_to_LC(info);
		else if (lc == Cnd_gp_batch_grp_cd) doCnd_gp_batch_grp_cd_LC(info);
		else if (lc == Cnd_gp_batch_grp_nm) doCnd_gp_batch_grp_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_msg_id) doCnd_msg_id_LC(info);
		else if (lc == Cnd_req_no) doCnd_req_no_LC(info);
		else if (lc == Cnd_msg1) doCnd_msg1_LC(info);
		else if (lc == Cnd_msg2) doCnd_msg2_LC(info);
		else if (lc == Cnd_msg3) doCnd_msg3_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_msg_id) doRslt_msg_id_LC(info);
		else if (lc == columnRslt_msg) doRslt_msg_LC(info);
		else if (lc == columnRslt_mrp_calc_no) doRslt_mrp_calc_no_LC(info);
		else if (lc == columnRslt_seq_no) doRslt_seq_no_LC(info);
		else if (lc == columnRslt_log_time) doRslt_log_time_LC(info);
		else if (lc == columnRslt_gp_batch_grp_cd) doRslt_gp_batch_grp_cd_LC(info);
		else if (lc == columnRslt_gp_batch_grp_nm) doRslt_gp_batch_grp_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[mrp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[log_time_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_log_time_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gp_batch_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gp_batch_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[msg3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_msg3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[msg]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_msg_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[seq_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_seq_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[log_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_log_time_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gp_batch_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gp_batch_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_mrp_typ]の作成メソッド
	 */
	public MCList getCnd_mrp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMrpTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gp_batch_grp_cd]の作成メソッド
	 */
	public MCList getCnd_gp_batch_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientFSUA.FSUAP0010.FSUAP_List)MCListLogic.create("mcframe.clientFSUA.FSUAP0010.FSUAP_List", this)).getGpBatchGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0220.Srch01")) {
			return new MS_MSBCL0220_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0220.Del01")) {
			return new MS_MSBCL0220_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0220_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0220_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0220_Srch01Bridge() {
			p_MS_MSBCL0220_Srch01 = new MCParam(PDef.MS_MSBCL0220_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0220_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0220.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0220.RsltR.class));

			p_MS_MSBCL0220_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0220_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0220_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0220_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0220_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0220.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0220.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0220.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0220.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0220_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0220.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0220_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0220.RsltR>)p_MS_MSBCL0220_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0220_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0220_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0220_Del01;

		/** コンストラクタ */
		protected MS_MSBCL0220_Del01Bridge() {
			p_MS_MSBCL0220_Del01 = new MCParam(PDef.MS_MSBCL0220_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0220_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0220.RsltR.class));
			// Down

			p_MS_MSBCL0220_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0220_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0220_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0220_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0220_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0220.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0220.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBCL0220_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}