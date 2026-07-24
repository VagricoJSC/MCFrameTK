package mcframe.clientMBBB.MBBBP0110;

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
import mcframe.clientMBBB.MBBBP0110.MBBBP_JnlHistory_MC.MB_MBBBL0110_Srch01Caller;
import mcframe.clientMBBB.MBBBP0110.MBBBP_JnlHistory_MC.MB_MBBBL0110_Ins01Caller;
import mcframe.clientMBBB.MBBBP0110.MBBBP_JnlHistory_MC.MB_MBBBL0110_Upd01Caller;
import mcframe.clientMBBB.MBBBP0110.MBBBP_JnlHistory_MC.MB_MBBBL0110_Del01Caller;
import mcframe.clientMBBB.MBBBP0110.MBBBP_JnlHistory_MC.MB_MBBBL0110_Del02Caller;

/**
 * 画面"MBBBP_JnlHistory"パネルクラスです。<p>
 *
 * 自動仕訳処理の履歴を参照します。また、会計システムへ連携するデータの作成処理や会計システムへの連携処理を行ないます。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_JnlHistory_MC_A extends mcframe.clientMBUD.MBUDP0010.MBUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBBP0110";

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
	 * SD,Send;CAN,Cancel sending;DEL,Delete;UPD,Update remarks;REF,View SD,送信する;CAN,送信を取り消す;DEL,削除する;UPD,備考を更新する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SD = null;
	public MCRadioButton Cnd_ope_CAN = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
	public MCLabel Cnd_ac_slip_dt_Label = null;
	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public MCDateField Cnd_ac_slip_dt = null;
	public MCLabel Cnd_jnl_act_cd_Label = null;
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_jnl_act_cd = null;
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public MCTextField Cnd_jnl_act_nm = null;
	public MCLabel Cnd_data_typ_Label = null;
	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_data_typ = null;
	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_data_typ_nm = null;
	public MCLabel Cnd_jnl_rmrks_Label = null;
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public MCTextField Cnd_jnl_rmrks = null;
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	public MCLabel LPnl_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextComboBox LPnl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField LPnl_ext_sys_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBB.MBBBP0110.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Journal group No. 仕訳グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_grp_no = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Start date of the term 対象開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_dt = null;
	/**
	 * End date of the term 対象終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_dt = null;
	/**
	 * Accounting slip date 会計伝票日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_dt = null;
	/**
	 * Journalizing cd. 仕訳実行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_act_cd = null;
	/**
	 * Journalizing name 仕訳実行名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_act_nm = null;
	/**
	 * Data status type データ状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_typ = null;
	/**
	 * Data status type name データ状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_typ_nm = null;
	/**
	 * Recreate 再作成.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rerun_flg = null;
	/**
	 * Journal remarks 仕訳備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_rmrks = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Auto-Journal slip list 自動仕訳伝票一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0120 = null;
	/**
	 * Journal list by account type 勘定科目別仕訳一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0130 = null;
	/**
	 * Journal list by customer or supplier 取引先別仕訳一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MBBBP0140 = null;
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
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_sd = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton Btn_upd_rmrks = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_can = null;
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
	/** [SRCH_SD]モードを表す定数 */
	public static final String SRCH_SD = "SRCH_SD";
	/** [SRCH_CAN]モードを表す定数 */
	public static final String SRCH_CAN = "SRCH_CAN";
	/** [UPD_SD]モードを表す定数 */
	public static final String UPD_SD = "UPD_SD";
	/** [UPD_RMRKS]モードを表す定数 */
	public static final String UPD_RMRKS = "UPD_RMRKS";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_CAN]モードを表す定数 */
	public static final String DEL_CAN = "DEL_CAN";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_SD, SRCH_CAN, UPD_SD, UPD_RMRKS, DEL, DEL_CAN, REF, FIX};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MB_MBBBL0110_Srch01]のCallerの作成 */
	protected MBBBP_JnlHistory_MC.MB_MBBBL0110_Srch01Caller createMB_MBBBL0110_Srch01() {
		MBBBP_JnlHistory_MC.MB_MBBBL0110_Srch01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Srch01Bridge>
		caller = ((MBBBP_JnlHistory_MC)this).new MB_MBBBL0110_Srch01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Srch01Bridge>(
					(MBBBP_JnlHistory)this, new MB_MBBBL0110_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBBL0110_Srch01]の呼び出し */
	protected void callMB_MBBBL0110_Srch01() {
		MCCaller caller = createMB_MBBBL0110_Srch01();
		caller.exec();
	}
	/** [MB_MBBBL0110_Ins01]のCallerの作成 */
	protected MBBBP_JnlHistory_MC.MB_MBBBL0110_Ins01Caller createMB_MBBBL0110_Ins01() {
		MBBBP_JnlHistory_MC.MB_MBBBL0110_Ins01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Ins01Bridge>
		caller = ((MBBBP_JnlHistory_MC)this).new MB_MBBBL0110_Ins01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Ins01Bridge>(
					(MBBBP_JnlHistory)this, new MB_MBBBL0110_Ins01Bridge());
		return caller;
	}
	/** [MB_MBBBL0110_Ins01]の呼び出し */
	protected void callMB_MBBBL0110_Ins01() {
		MCCaller caller = createMB_MBBBL0110_Ins01();
		caller.exec();
	}
	/** [MB_MBBBL0110_Upd01]のCallerの作成 */
	protected MBBBP_JnlHistory_MC.MB_MBBBL0110_Upd01Caller createMB_MBBBL0110_Upd01() {
		MBBBP_JnlHistory_MC.MB_MBBBL0110_Upd01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Upd01Bridge>
		caller = ((MBBBP_JnlHistory_MC)this).new MB_MBBBL0110_Upd01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Upd01Bridge>(
					(MBBBP_JnlHistory)this, new MB_MBBBL0110_Upd01Bridge());
		return caller;
	}
	/** [MB_MBBBL0110_Upd01]の呼び出し */
	protected void callMB_MBBBL0110_Upd01() {
		MCCaller caller = createMB_MBBBL0110_Upd01();
		caller.exec();
	}
	/** [MB_MBBBL0110_Del01]のCallerの作成 */
	protected MBBBP_JnlHistory_MC.MB_MBBBL0110_Del01Caller createMB_MBBBL0110_Del01() {
		MBBBP_JnlHistory_MC.MB_MBBBL0110_Del01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Del01Bridge>
		caller = ((MBBBP_JnlHistory_MC)this).new MB_MBBBL0110_Del01Caller<MBBBP_JnlHistory, MB_MBBBL0110_Del01Bridge>(
					(MBBBP_JnlHistory)this, new MB_MBBBL0110_Del01Bridge());
		return caller;
	}
	/** [MB_MBBBL0110_Del01]の呼び出し */
	protected void callMB_MBBBL0110_Del01() {
		MCCaller caller = createMB_MBBBL0110_Del01();
		caller.exec();
	}
	/** [MB_MBBBL0110_Del02]のCallerの作成 */
	protected MBBBP_JnlHistory_MC.MB_MBBBL0110_Del02Caller createMB_MBBBL0110_Del02() {
		MBBBP_JnlHistory_MC.MB_MBBBL0110_Del02Caller<MBBBP_JnlHistory, MB_MBBBL0110_Del02Bridge>
		caller = ((MBBBP_JnlHistory_MC)this).new MB_MBBBL0110_Del02Caller<MBBBP_JnlHistory, MB_MBBBL0110_Del02Bridge>(
					(MBBBP_JnlHistory)this, new MB_MBBBL0110_Del02Bridge());
		return caller;
	}
	/** [MB_MBBBL0110_Del02]の呼び出し */
	protected void callMB_MBBBL0110_Del02() {
		MCCaller caller = createMB_MBBBL0110_Del02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0110.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0110.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBB.MBBBP0110.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0110.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0110.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0110.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0110.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMBBB.MBBBP0110.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMBBB.MBBBP0110.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMBBB.MBBBP0110.LPnlR createLPnlR() {
		return mcframe.clientMBBB.MBBBP0110.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBB.MBBBP0110.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0110.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBB.MBBBP0110.RsltR createRsltR() {
		return mcframe.clientMBBB.MBBBP0110.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0110.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_JnlHistory_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBBP_JnlHistory_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBBP_JnlHistory_MC.jbCreateScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateTop((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateFold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateCnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateLPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateCtrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateRslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateBtn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbCreateEastBtn((MBBBP_JnlHistory)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MBBBP_JnlHistory p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBBP_JnlHistory p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBBP_JnlHistory p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_JnlHistory p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MBBBP_JnlHistory p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBBP_JnlHistory p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBBP_JnlHistory p) {
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMBBB.MBBBP0110.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBBP_JnlHistory p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MBBBP_JnlHistory p) {
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

	
	/** [Cnd_jnl_act_cd_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_act_cd_p = null;

	/**
	 * [Cnd_jnl_act_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_act_cd_ListPutter() {
		if (Cnd_jnl_act_cd_p == null) {
			Cnd_jnl_act_cd_p = createCnd_jnl_act_cd_ListPutter(Cnd_jnl_act_cd, "jnl_act_cd", "jnl_act_nm");

		}
		return Cnd_jnl_act_cd_p;
	}
	
	
	/** [Cnd_data_typ_ListPutter]の定義 */
	private MCListPutter Cnd_data_typ_p = null;

	/**
	 * [Cnd_data_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_data_typ_ListPutter() {
		if (Cnd_data_typ_p == null) {
			Cnd_data_typ_p = createCnd_data_typ_ListPutter(Cnd_data_typ, "data_typ", "data_typ_nm");

		}
		return Cnd_data_typ_p;
	}
	
	
	/** [LPnl_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter LPnl_ext_sys_cd_p = null;

	/**
	 * [LPnl_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getLPnl_ext_sys_cd_ListPutter() {
		if (LPnl_ext_sys_cd_p == null) {
			LPnl_ext_sys_cd_p = createLPnl_ext_sys_cd_ListPutter(LPnl_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return LPnl_ext_sys_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_JnlHistory create(){
		MBBBP_JnlHistory p = new MBBBP_JnlHistory();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_JnlHistory create(String name){
		MBBBP_JnlHistory p = new MBBBP_JnlHistory(name);
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
		MBBBP_JnlHistory_MC.jbfInitScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitTop((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitFold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitCnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitLPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitCtrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitRslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitBtn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbfInitEastBtn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitTop((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitFold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitCnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitLPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitCtrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitRslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitBtn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.jbInitEastBtn((MBBBP_JnlHistory)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SD = p.beansFactory.createRadioButton("Cnd.ope_SD");
		p.Cnd_ope_CAN = p.beansFactory.createRadioButton("Cnd.ope_CAN");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_ac_slip_dt_Label = p.beansFactory.createLabel("Cnd.ac_slip_dt_Label");
		p.Cnd_ac_slip_dt = p.beansFactory.createDateField("Cnd.ac_slip_dt");
		p.Cnd_ac_slip_dt.setLabel(p.Cnd_ac_slip_dt_Label);
		p.Cnd_jnl_act_cd_Label = p.beansFactory.createLabel("Cnd.jnl_act_cd_Label");
		p.Cnd_jnl_act_cd = p.beansFactory.createTextComboBox("Cnd.jnl_act_cd");
		p.Cnd_jnl_act_cd.setLabel(p.Cnd_jnl_act_cd_Label);
		p.Cnd_jnl_act_nm = p.beansFactory.createTextField("Cnd.jnl_act_nm");
		p.Cnd_data_typ_Label = p.beansFactory.createLabel("Cnd.data_typ_Label");
		p.Cnd_data_typ = p.beansFactory.createTextComboBox("Cnd.data_typ");
		p.Cnd_data_typ.setLabel(p.Cnd_data_typ_Label);
		p.Cnd_data_typ_nm = p.beansFactory.createTextField("Cnd.data_typ_nm");
		p.Cnd_jnl_rmrks_Label = p.beansFactory.createLabel("Cnd.jnl_rmrks_Label");
		p.Cnd_jnl_rmrks = p.beansFactory.createTextField("Cnd.jnl_rmrks");
		p.Cnd_jnl_rmrks.setLabel(p.Cnd_jnl_rmrks_Label);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_ext_sys_cd_Label = p.beansFactory.createLabel("LPnl.ext_sys_cd_Label");
		p.LPnl_ext_sys_cd = p.beansFactory.createTextComboBox("LPnl.ext_sys_cd");
		p.LPnl_ext_sys_cd.setLabel(p.LPnl_ext_sys_cd_Label);
		p.LPnl_ext_sys_nm = p.beansFactory.createTextField("LPnl.ext_sys_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_jnl_grp_no = p.beansFactory.createTableColumn("Rslt.jnl_grp_no", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_st_dt = p.beansFactory.createTableColumn("Rslt.st_dt", MCColumnType.DATE);
		p.columnRslt_end_dt = p.beansFactory.createTableColumn("Rslt.end_dt", MCColumnType.DATE);
		p.columnRslt_ac_slip_dt = p.beansFactory.createTableColumn("Rslt.ac_slip_dt", MCColumnType.DATE);
		p.columnRslt_jnl_act_cd = p.beansFactory.createTableColumn("Rslt.jnl_act_cd", MCColumnType.TEXT);
		p.columnRslt_jnl_act_nm = p.beansFactory.createTableColumn("Rslt.jnl_act_nm", MCColumnType.TEXT);
		p.columnRslt_data_typ = p.beansFactory.createTableColumn("Rslt.data_typ", MCColumnType.TEXT);
		p.columnRslt_data_typ_nm = p.beansFactory.createTableColumn("Rslt.data_typ_nm", MCColumnType.TEXT);
		p.columnRslt_rerun_flg = p.beansFactory.createTableColumn("Rslt.rerun_flg", MCColumnType.CHECK);
		p.columnRslt_jnl_rmrks = p.beansFactory.createTableColumn("Rslt.jnl_rmrks", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MBBBP0120 = p.beansFactory.createButton("Btn.open_MBBBP0120", "open");
		p.Btn_open_MBBBP0130 = p.beansFactory.createButton("Btn.open_MBBBP0130", "open");
		p.Btn_open_MBBBP0140 = p.beansFactory.createButton("Btn.open_MBBBP0140", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_sd = p.beansFactory.createButton("Btn.upd_sd", "upd");
		p.Btn_upd_rmrks = p.beansFactory.createButton("Btn.upd_rmrks", "upd");
		p.Btn_del_can = p.beansFactory.createButton("Btn.del_can", "del");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setValueCheck(false);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MBBBP_JnlHistory p) {
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
	protected static void jbInitCnd(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SD);
		p.Cnd_ope_SD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_SD);
		p.ScreenOpePanel.add(p.Cnd_ope_SD);
		p.Cnd_ope_SD.setNextBeans(p.Cnd_ope_CAN);
		p.Cnd_ope_CAN.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_CAN);
		p.ScreenOpePanel.add(p.Cnd_ope_CAN);
		p.Cnd_ope_CAN.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ac_slip_dt);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_slip_dt_Label);
		p.CndPanel.add(p.Cnd_ac_slip_dt);
		p.Cnd_ac_slip_dt.setNextBeans(p.Cnd_jnl_act_cd);
		p.Cnd_ac_slip_dt.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.ac_slip_dt_META);
		p.Cnd_ac_slip_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_jnl_act_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_jnl_act_cd, true);
		p.Cnd_jnl_act_cd.setLinkBeans(p.Cnd_jnl_act_nm);
		p.CndPanel.add(p.Cnd_jnl_act_cd_Label);
		p.CndPanel.add(p.Cnd_jnl_act_cd);
		p.Cnd_jnl_act_cd.setNextBeans(p.Cnd_jnl_act_nm);
		p.Cnd_jnl_act_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.jnl_act_cd_META);
		p.CndPanel.add(p.Cnd_jnl_act_nm);
		p.Cnd_jnl_act_nm.setNextBeans(p.Cnd_data_typ);
		p.Cnd_jnl_act_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.jnl_act_nm_META);
		p.Cnd_data_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_data_typ, true);
		p.Cnd_data_typ.setLinkBeans(p.Cnd_data_typ_nm);
		p.CndPanel.add(p.Cnd_data_typ_Label);
		p.CndPanel.add(p.Cnd_data_typ);
		p.Cnd_data_typ.setNextBeans(p.Cnd_data_typ_nm);
		p.Cnd_data_typ.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.data_typ_META);
		p.CndPanel.add(p.Cnd_data_typ_nm);
		p.Cnd_data_typ_nm.setNextBeans(p.Cnd_jnl_rmrks);
		p.Cnd_data_typ_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.data_typ_nm_META);
		p.CndPanel.add(p.Cnd_jnl_rmrks_Label);
		p.CndPanel.add(p.Cnd_jnl_rmrks);
		p.Cnd_jnl_rmrks.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0110.CndR.jnl_rmrks_META);
		p.setPluralValueEnable(p.Cnd_jnl_rmrks, true);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnl_ext_sys_cd.setListType(MCListType.STRICT);
		p.LPnl_ext_sys_cd.setLinkBeans(p.LPnl_ext_sys_nm);
		p.LPnlPanel.add(p.LPnl_ext_sys_cd_Label);
		p.LPnlPanel.add(p.LPnl_ext_sys_cd);
		p.LPnlPanel.setLastBeans(p.LPnl_ext_sys_cd);
		p.LPnl_ext_sys_cd.setNextBeans(p.LPnl_ext_sys_nm);
		p.LPnl_ext_sys_cd.setRow(p.getLPnlR(), mcframe.clientMBBB.MBBBP0110.LPnlR.ext_sys_cd_META);
		p.LPnlPanel.add(p.LPnl_ext_sys_nm);
		p.LPnl_ext_sys_nm.setRow(p.getLPnlR(), mcframe.clientMBBB.MBBBP0110.LPnlR.ext_sys_nm_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBBP_JnlHistory p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MBBBP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MBBBP0120);
		p.BtnPanel.setLastBeans(p.Btn_open_MBBBP0120);
		p.Btn_open_MBBBP0120.setNextBeans(p.Btn_open_MBBBP0130);
		p.Btn_open_MBBBP0130.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MBBBP0130);
		p.Btn_open_MBBBP0130.setNextBeans(p.Btn_open_MBBBP0140);
		p.Btn_open_MBBBP0140.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MBBBP0140);
		p.Btn_open_MBBBP0140.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_sd);
		p.Btn_upd_sd.setIcon("REGISTER");
		p.Btn_upd_sd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_sd);
		p.Btn_upd_sd.setNextBeans(p.Btn_upd_rmrks);
		p.Btn_upd_rmrks.setIcon("REGISTER");
		p.Btn_upd_rmrks.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_rmrks);
		p.Btn_del_can.setIcon("CANCEL");
		p.Btn_del_can.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_can);
		p.EastBtnPanel.add(p.Btn_del_can);
		p.Btn_del_can.setNextBeans(p.Btn_del);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MBBBP_JnlHistory p) {
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
		MBBBP_JnlHistory_MC.mcInitScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitTop((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitFold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitCnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitLPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitCtrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitRslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitBtn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.mcInitEastBtn((MBBBP_JnlHistory)this);

		// [SRCH]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitSRCH_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH_EastBtn((MBBBP_JnlHistory)this);

		// [SRCH_SD]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__SD_EastBtn((MBBBP_JnlHistory)this);

		// [SRCH_CAN]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitSRCH__CAN_EastBtn((MBBBP_JnlHistory)this);

		// [UPD_SD]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitUPD__SD_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__SD_EastBtn((MBBBP_JnlHistory)this);

		// [UPD_RMRKS]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitUPD__RMRKS_EastBtn((MBBBP_JnlHistory)this);

		// [DEL]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitDEL_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL_EastBtn((MBBBP_JnlHistory)this);

		// [DEL_CAN]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitDEL__CAN_EastBtn((MBBBP_JnlHistory)this);

		// [REF]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitREF_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitREF_EastBtn((MBBBP_JnlHistory)this);

		// [FIX]ステータスのモードの設定
		MBBBP_JnlHistory_MC.statusInitFIX_ScreenOpe((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_Top((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_Fold((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_Cnd((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_LPnl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_Ctrl((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_Rslt((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_Btn((MBBBP_JnlHistory)this);
		MBBBP_JnlHistory_MC.statusInitFIX_EastBtn((MBBBP_JnlHistory)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MBBBP_JnlHistory p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBBP_JnlHistory p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBBP_JnlHistory p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_JnlHistory p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SD.addAllListener(p);
		p.Cnd_ope_CAN.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_ac_slip_dt.setListListener(p);
		p.Cnd_ac_slip_dt.addAllListener(p);
		p.Cnd_jnl_act_cd.setListListener(p);
		p.Cnd_jnl_act_cd.addAllListener(p);
		p.Cnd_jnl_act_nm.setListListener(p);
		p.Cnd_jnl_act_nm.addAllListener(p);
		p.Cnd_data_typ.setListListener(p);
		p.Cnd_data_typ.addAllListener(p);
		p.Cnd_data_typ_nm.setListListener(p);
		p.Cnd_data_typ_nm.addAllListener(p);
		p.Cnd_jnl_rmrks.setListListener(p);
		p.Cnd_jnl_rmrks.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MBBBP_JnlHistory p) {
		p.LPnl_ext_sys_cd.setListListener(p);
		p.LPnl_ext_sys_cd.addAllListener(p);
		p.LPnl_ext_sys_nm.setListListener(p);
		p.LPnl_ext_sys_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBBP_JnlHistory p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBBP_JnlHistory p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_jnl_grp_no.addAllListener(p);
		p.columnRslt_jnl_grp_no.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_st_dt.addAllListener(p);
		p.columnRslt_st_dt.setListListener(p);
		p.columnRslt_end_dt.addAllListener(p);
		p.columnRslt_end_dt.setListListener(p);
		p.columnRslt_ac_slip_dt.addAllListener(p);
		p.columnRslt_ac_slip_dt.setListListener(p);
		p.columnRslt_jnl_act_cd.addAllListener(p);
		p.columnRslt_jnl_act_cd.setListListener(p);
		p.columnRslt_jnl_act_nm.addAllListener(p);
		p.columnRslt_jnl_act_nm.setListListener(p);
		p.columnRslt_data_typ.addAllListener(p);
		p.columnRslt_data_typ.setListListener(p);
		p.columnRslt_data_typ_nm.addAllListener(p);
		p.columnRslt_data_typ_nm.setListListener(p);
		p.columnRslt_rerun_flg.addAllListener(p);
		p.columnRslt_jnl_rmrks.addAllListener(p);
		p.columnRslt_jnl_rmrks.setListListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBBP_JnlHistory p) {
		p.Btn_open_MBBBP0120.addAllListener(p);
		p.Btn_open_MBBBP0120.setAPMethodName("doBtn_open_MBBBP0120");
		p.Btn_open_MBBBP0130.addAllListener(p);
		p.Btn_open_MBBBP0130.setAPMethodName("doBtn_open_MBBBP0130");
		p.Btn_open_MBBBP0140.addAllListener(p);
		p.Btn_open_MBBBP0140.setAPMethodName("doBtn_open_MBBBP0140");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_sd.addAllListener(p);
		p.Btn_upd_sd.setAPMethodName("doBtn_upd_sd");
		p.Btn_upd_rmrks.addAllListener(p);
		p.Btn_upd_rmrks.setAPMethodName("doBtn_upd_rmrks");
		p.Btn_del_can.addAllListener(p);
		p.Btn_del_can.setAPMethodName("doBtn_del_can");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MBBBP_JnlHistory p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_data_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MBBBP0130.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MBBBP0140.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_sd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_SD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_SD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_SD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_SD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, SRCH_SD, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_SD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_SD, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, SRCH_SD, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, SRCH_SD, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.Cnd_data_typ_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, SRCH_SD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_SD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_grp_no.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_SD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_open_MBBBP0130.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_open_MBBBP0140.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_upd_sd.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, SRCH_SD, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, SRCH_SD, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_SD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SD_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, SRCH_CAN, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_CAN, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_CAN, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, SRCH_CAN, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, SRCH_CAN, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.Cnd_data_typ_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, SRCH_CAN, MCMode.ENABLE);

	}

	/**
	 * [SRCH_CAN]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [SRCH_CAN]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_grp_no.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_open_MBBBP0130.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_open_MBBBP0140.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_upd_sd.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, SRCH_CAN, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, SRCH_CAN, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_CAN, MCMode.DISABLE);

	}

	/**
	 * [SRCH_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CAN_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_SD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_SD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_SD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_SD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.Cnd_data_typ_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, UPD_SD, MCMode.ENABLE);

	}

	/**
	 * [UPD_SD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, UPD_SD, MCMode.REQUIRED);
		p.LPnl_ext_sys_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_SD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, UPD_SD, MCMode.ENABLE);
		p.columnRslt_jnl_grp_no.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_SD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_SD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_SD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_SD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_open_MBBBP0130.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_open_MBBBP0140.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_upd_sd.putMode(p, UPD_SD, MCMode.ENABLE);
		p.Btn_upd_rmrks.putMode(p, UPD_SD, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, UPD_SD, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD_SD, MCMode.DISABLE);

	}

	/**
	 * [UPD_SD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SD_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_RMRKS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_RMRKS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_RMRKS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_RMRKS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Cnd_data_typ_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, UPD_RMRKS, MCMode.ENABLE);

	}

	/**
	 * [UPD_RMRKS]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_RMRKS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [UPD_RMRKS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.columnRslt_jnl_grp_no.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_RMRKS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_RMRKS, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_RMRKS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Btn_open_MBBBP0130.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Btn_open_MBBBP0140.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Btn_upd_sd.putMode(p, UPD_RMRKS, MCMode.INVISIBLE);
		p.Btn_upd_rmrks.putMode(p, UPD_RMRKS, MCMode.ENABLE);
		p.Btn_del_can.putMode(p, UPD_RMRKS, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD_RMRKS, MCMode.DISABLE);

	}

	/**
	 * [UPD_RMRKS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__RMRKS_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_data_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, DEL, MCMode.ENABLE);
		p.columnRslt_jnl_grp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MBBBP0130.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MBBBP0140.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd_sd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL_CAN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL_CAN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL_CAN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL_CAN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_data_typ_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, DEL_CAN, MCMode.ENABLE);

	}

	/**
	 * [DEL_CAN]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_CAN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [DEL_CAN]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.columnRslt_jnl_grp_no.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_CAN, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_CAN, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_CAN, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_CAN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Btn_open_MBBBP0130.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Btn_open_MBBBP0140.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Btn_upd_sd.putMode(p, DEL_CAN, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, DEL_CAN, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, DEL_CAN, MCMode.ENABLE);
		p.Btn_del.putMode(p, DEL_CAN, MCMode.DISABLE);

	}

	/**
	 * [DEL_CAN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CAN_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_data_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_grp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MBBBP0130.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MBBBP0140.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_sd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MBBBP_JnlHistory p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MBBBP_JnlHistory p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MBBBP_JnlHistory p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MBBBP_JnlHistory p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MBBBP_JnlHistory p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_slip_dt.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_jnl_act_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_jnl_act_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_data_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_data_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_jnl_rmrks.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LPnl(MBBBP_JnlHistory p){
		p.LPnl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.LPnl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MBBBP_JnlHistory p){

	}

	/**
	 * [FIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Rslt(MBBBP_JnlHistory p){
		p.columnRslt_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_jnl_grp_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_jnl_act_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_data_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_data_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_rerun_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_jnl_rmrks.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MBBBP_JnlHistory p){
		p.Btn_open_MBBBP0120.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_open_MBBBP0130.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_open_MBBBP0140.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_sd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_rmrks.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_del_can.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MBBBP_JnlHistory p){

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
		MBBBP_JnlHistory_MC.setTableConfigRslt((MBBBP_JnlHistory)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBBP_JnlHistory p) {
		p.columnRslt_check.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_jnl_grp_no.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.jnl_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_grp_no);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_st_dt.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.st_dt_META);
		p.columnRslt_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_dt);
		p.columnRslt_end_dt.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.end_dt_META);
		p.columnRslt_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_dt);
		p.columnRslt_ac_slip_dt.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ac_slip_dt_META);
		p.columnRslt_ac_slip_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_dt);
		p.columnRslt_jnl_act_cd.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.jnl_act_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_act_cd);
		p.columnRslt_jnl_act_nm.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.jnl_act_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_act_nm);
		p.columnRslt_data_typ.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.data_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_typ);
		p.columnRslt_data_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.data_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_typ_nm);
		p.columnRslt_rerun_flg.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.rerun_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rerun_flg);
		p.columnRslt_jnl_rmrks.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.jnl_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_rmrks);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBB.MBBBP0110.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_jnl_act_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_act_cd.getListConfig().setPutter(getCnd_jnl_act_cd_ListPutter());
		Cnd_data_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_data_typ.getListConfig().setPutter(getCnd_data_typ_ListPutter());
		LPnl_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		LPnl_ext_sys_cd.getListConfig().setPutter(getLPnl_ext_sys_cd_ListPutter());
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
	 * この画面を[SRCH_SD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SDStatus() {
		status = SRCH_SD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_CANStatus() {
		status = SRCH_CAN;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SDStatus() {
		status = UPD_SD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_RMRKS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_RMRKSStatus() {
		status = UPD_RMRKS;
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
	 * この画面を[DEL_CAN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_CANStatus() {
		status = DEL_CAN;
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
		else if (SRCH_SD.equals(status)) {
			setSRCH_SDStatus();
		}
		else if (SRCH_CAN.equals(status)) {
			setSRCH_CANStatus();
		}
		else if (UPD_SD.equals(status)) {
			setUPD_SDStatus();
		}
		else if (UPD_RMRKS.equals(status)) {
			setUPD_RMRKSStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_CAN.equals(status)) {
			setDEL_CANStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_jnl_act_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_act_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlAct");
		return lp;
	}
	 
	/**
	 * [Cnd_data_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_data_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DataTyp");
		return lp;
	}
	 
	/**
	 * [LPnl_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createLPnl_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSysAc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_jnl_act_cd) return getCnd_jnl_act_cd(row, info);
		if(combo == Cnd_data_typ) return getCnd_data_typ(row, info);
		if(combo == LPnl_ext_sys_cd) return getLPnl_ext_sys_cd(row, info);
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
		else if (ap == Btn_open_MBBBP0120) doBtn_open_MBBBP0120(info);
		else if (ap == Btn_open_MBBBP0130) doBtn_open_MBBBP0130(info);
		else if (ap == Btn_open_MBBBP0140) doBtn_open_MBBBP0140(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_sd) doBtn_upd_sd(info);
		else if (ap == Btn_upd_rmrks) doBtn_upd_rmrks(info);
		else if (ap == Btn_del_can) doBtn_del_can(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0130(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MBBBP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MBBBP0140(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_sd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_sd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_rmrks]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_rmrks(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_can]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_can(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_ac_slip_dt) return doCnd_ac_slip_dt_VC(info);
		if (vc == Cnd_jnl_act_cd) return doCnd_jnl_act_cd_VC(info);
		if (vc == Cnd_jnl_act_nm) return doCnd_jnl_act_nm_VC(info);
		if (vc == Cnd_data_typ) return doCnd_data_typ_VC(info);
		if (vc == Cnd_data_typ_nm) return doCnd_data_typ_nm_VC(info);
		if (vc == Cnd_jnl_rmrks) return doCnd_jnl_rmrks_VC(info);
		if (vc == LPnl_ext_sys_cd) return doLPnl_ext_sys_cd_VC(info);
		if (vc == LPnl_ext_sys_nm) return doLPnl_ext_sys_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_jnl_grp_no) return doRslt_jnl_grp_no_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_st_dt) return doRslt_st_dt_VC(info);
		if (vc == columnRslt_end_dt) return doRslt_end_dt_VC(info);
		if (vc == columnRslt_ac_slip_dt) return doRslt_ac_slip_dt_VC(info);
		if (vc == columnRslt_jnl_act_cd) return doRslt_jnl_act_cd_VC(info);
		if (vc == columnRslt_jnl_act_nm) return doRslt_jnl_act_nm_VC(info);
		if (vc == columnRslt_data_typ) return doRslt_data_typ_VC(info);
		if (vc == columnRslt_data_typ_nm) return doRslt_data_typ_nm_VC(info);
		if (vc == columnRslt_rerun_flg) return doRslt_rerun_flg_VC(info);
		if (vc == columnRslt_jnl_rmrks) return doRslt_jnl_rmrks_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_act_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_act_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_ext_sys_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_act_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_act_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_act_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_act_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rerun_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rerun_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_rmrks_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_ac_slip_dt) doCnd_ac_slip_dt_NC(info);
		else if (nc == Cnd_jnl_act_cd) doCnd_jnl_act_cd_NC(info);
		else if (nc == Cnd_jnl_act_nm) doCnd_jnl_act_nm_NC(info);
		else if (nc == Cnd_data_typ) doCnd_data_typ_NC(info);
		else if (nc == Cnd_data_typ_nm) doCnd_data_typ_nm_NC(info);
		else if (nc == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NC(info);
		else if (nc == LPnl_ext_sys_cd) doLPnl_ext_sys_cd_NC(info);
		else if (nc == LPnl_ext_sys_nm) doLPnl_ext_sys_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_st_dt) doRslt_st_dt_NC(info);
		else if (nc == columnRslt_end_dt) doRslt_end_dt_NC(info);
		else if (nc == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_NC(info);
		else if (nc == columnRslt_jnl_act_cd) doRslt_jnl_act_cd_NC(info);
		else if (nc == columnRslt_jnl_act_nm) doRslt_jnl_act_nm_NC(info);
		else if (nc == columnRslt_data_typ) doRslt_data_typ_NC(info);
		else if (nc == columnRslt_data_typ_nm) doRslt_data_typ_nm_NC(info);
		else if (nc == columnRslt_rerun_flg) doRslt_rerun_flg_NC(info);
		else if (nc == columnRslt_jnl_rmrks) doRslt_jnl_rmrks_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rerun_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rerun_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_rmrks_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_ac_slip_dt) doCnd_ac_slip_dt_NE(info);
		else if (ne == Cnd_jnl_act_cd) doCnd_jnl_act_cd_NE(info);
		else if (ne == Cnd_jnl_act_nm) doCnd_jnl_act_nm_NE(info);
		else if (ne == Cnd_data_typ) doCnd_data_typ_NE(info);
		else if (ne == Cnd_data_typ_nm) doCnd_data_typ_nm_NE(info);
		else if (ne == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NE(info);
		else if (ne == LPnl_ext_sys_cd) doLPnl_ext_sys_cd_NE(info);
		else if (ne == LPnl_ext_sys_nm) doLPnl_ext_sys_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_st_dt) doRslt_st_dt_NE(info);
		else if (ne == columnRslt_end_dt) doRslt_end_dt_NE(info);
		else if (ne == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_NE(info);
		else if (ne == columnRslt_jnl_act_cd) doRslt_jnl_act_cd_NE(info);
		else if (ne == columnRslt_jnl_act_nm) doRslt_jnl_act_nm_NE(info);
		else if (ne == columnRslt_data_typ) doRslt_data_typ_NE(info);
		else if (ne == columnRslt_data_typ_nm) doRslt_data_typ_nm_NE(info);
		else if (ne == columnRslt_rerun_flg) doRslt_rerun_flg_NE(info);
		else if (ne == columnRslt_jnl_rmrks) doRslt_jnl_rmrks_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rerun_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rerun_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_rmrks_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_ac_slip_dt) doCnd_ac_slip_dt_NX(info);
		else if (nx == Cnd_jnl_act_cd) doCnd_jnl_act_cd_NX(info);
		else if (nx == Cnd_jnl_act_nm) doCnd_jnl_act_nm_NX(info);
		else if (nx == Cnd_data_typ) doCnd_data_typ_NX(info);
		else if (nx == Cnd_data_typ_nm) doCnd_data_typ_nm_NX(info);
		else if (nx == Cnd_jnl_rmrks) doCnd_jnl_rmrks_NX(info);
		else if (nx == LPnl_ext_sys_cd) doLPnl_ext_sys_cd_NX(info);
		else if (nx == LPnl_ext_sys_nm) doLPnl_ext_sys_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_st_dt) doRslt_st_dt_NX(info);
		else if (nx == columnRslt_end_dt) doRslt_end_dt_NX(info);
		else if (nx == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_NX(info);
		else if (nx == columnRslt_jnl_act_cd) doRslt_jnl_act_cd_NX(info);
		else if (nx == columnRslt_jnl_act_nm) doRslt_jnl_act_nm_NX(info);
		else if (nx == columnRslt_data_typ) doRslt_data_typ_NX(info);
		else if (nx == columnRslt_data_typ_nm) doRslt_data_typ_nm_NX(info);
		else if (nx == columnRslt_rerun_flg) doRslt_rerun_flg_NX(info);
		else if (nx == columnRslt_jnl_rmrks) doRslt_jnl_rmrks_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rerun_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rerun_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_rmrks_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_ac_slip_dt) doCnd_ac_slip_dt_LC(info);
		else if (lc == Cnd_jnl_act_cd) doCnd_jnl_act_cd_LC(info);
		else if (lc == Cnd_jnl_act_nm) doCnd_jnl_act_nm_LC(info);
		else if (lc == Cnd_data_typ) doCnd_data_typ_LC(info);
		else if (lc == Cnd_data_typ_nm) doCnd_data_typ_nm_LC(info);
		else if (lc == Cnd_jnl_rmrks) doCnd_jnl_rmrks_LC(info);
		else if (lc == LPnl_ext_sys_cd) doLPnl_ext_sys_cd_LC(info);
		else if (lc == LPnl_ext_sys_nm) doLPnl_ext_sys_nm_LC(info);
		else if (lc == columnRslt_jnl_grp_no) doRslt_jnl_grp_no_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_st_dt) doRslt_st_dt_LC(info);
		else if (lc == columnRslt_end_dt) doRslt_end_dt_LC(info);
		else if (lc == columnRslt_ac_slip_dt) doRslt_ac_slip_dt_LC(info);
		else if (lc == columnRslt_jnl_act_cd) doRslt_jnl_act_cd_LC(info);
		else if (lc == columnRslt_jnl_act_nm) doRslt_jnl_act_nm_LC(info);
		else if (lc == columnRslt_data_typ) doRslt_data_typ_LC(info);
		else if (lc == columnRslt_data_typ_nm) doRslt_data_typ_nm_LC(info);
		else if (lc == columnRslt_jnl_rmrks) doRslt_jnl_rmrks_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_act_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_act_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_act_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_act_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_jnl_act_cd]の作成メソッド
	 */
	public MCList getCnd_jnl_act_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlAct(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_data_typ]の作成メソッド
	 */
	public MCList getCnd_data_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDataTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[LPnl_ext_sys_cd]の作成メソッド
	 */
	public MCList getLPnl_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSysAc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0110.Srch01")) {
			return new MB_MBBBL0110_Srch01Bridge();
		}
		if (id.equals("MB.MBBBL0110.Ins01")) {
			return new MB_MBBBL0110_Ins01Bridge();
		}
		if (id.equals("MB.MBBBL0110.Upd01")) {
			return new MB_MBBBL0110_Upd01Bridge();
		}
		if (id.equals("MB.MBBBL0110.Del01")) {
			return new MB_MBBBL0110_Del01Bridge();
		}
		if (id.equals("MB.MBBBL0110.Del02")) {
			return new MB_MBBBL0110_Del02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0110_Srch01;

		/** コンストラクタ */
		protected MB_MBBBL0110_Srch01Bridge() {
			p_MB_MBBBL0110_Srch01 = new MCParam(PDef.MB_MBBBL0110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0110.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));

			p_MB_MBBBL0110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0110_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0110.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0110.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0110_Srch01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0110_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)p_MB_MBBBL0110_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MB_MBBBL0110_Ins01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0110_Ins01;

		/** コンストラクタ */
		protected MB_MBBBL0110_Ins01Bridge() {
			p_MB_MBBBL0110_Ins01 = new MCParam(PDef.MB_MBBBL0110_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0110_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
			param.addUpBlock(mcframe.clientMBBB.MBBBP0110.LPnlR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));

			p_MB_MBBBL0110_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0110_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0110_Ins01.addUpBlock(getRsltL().shallowClone());
			p_MB_MBBBL0110_Ins01.addUpBlock(getLPnlR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0110_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0110_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> up0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)up(0);
		}
		protected mcframe.clientMBBB.MBBBP0110.LPnlR up1() {
			return (mcframe.clientMBBB.MBBBP0110.LPnlR)up(1);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0110_Ins01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0110_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)p_MB_MBBBL0110_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getLPnlR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MB_MBBBL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0110_Upd01;

		/** コンストラクタ */
		protected MB_MBBBL0110_Upd01Bridge() {
			p_MB_MBBBL0110_Upd01 = new MCParam(PDef.MB_MBBBL0110_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0110_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));

			p_MB_MBBBL0110_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0110_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0110_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0110_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0110_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> up0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0110_Upd01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0110_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)p_MB_MBBBL0110_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MB_MBBBL0110_Del01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0110_Del01;

		/** コンストラクタ */
		protected MB_MBBBL0110_Del01Bridge() {
			p_MB_MBBBL0110_Del01 = new MCParam(PDef.MB_MBBBL0110_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0110_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));

			p_MB_MBBBL0110_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0110_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0110_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0110_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0110_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> up0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0110_Del01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0110_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)p_MB_MBBBL0110_Del01.getContainerParam().getDownBlock(0));
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
	 * [MB_MBBBL0110_Del02]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0110_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0110_Del02;

		/** コンストラクタ */
		protected MB_MBBBL0110_Del02Bridge() {
			p_MB_MBBBL0110_Del02 = new MCParam(PDef.MB_MBBBL0110_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0110_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));

			p_MB_MBBBL0110_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0110_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0110_Del02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0110_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0110_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> up0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0110.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0110_Del02.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0110_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0110.RsltR>)p_MB_MBBBL0110_Del02.getContainerParam().getDownBlock(0));
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